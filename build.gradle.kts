import com.github.jk1.license.render.JsonReportRenderer
import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.compose.internal.localPropertiesFile
import java.util.Properties

plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization") version "1.7.20"
    id("org.jetbrains.compose")
    id("org.jlleitschuh.gradle.ktlint") version "10.3.0"
    id("com.github.jk1.dependency-license-report") version "2.0"
}

version = project.properties["app.version"] as String

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(kotlin("reflect"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
                implementation(compose.desktop.currentOs)
                implementation(compose.materialIconsExtended)
                implementation(compose("org.jetbrains.compose.components:components-splitpane-desktop"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
                implementation("com.github.psambit9791:jdsp:1.0.0")
                implementation("org.graalvm.js:js:22.1.0")
                implementation("org.apache.tika:tika-parser-text-module:2.4.1")
                implementation("io.ktor:ktor-client-core:2.1.0")
                implementation("io.ktor:ktor-client-apache:2.1.0")
                implementation("io.ktor:ktor-client-logging:2.1.0")
                implementation("io.ktor:ktor-client-content-negotiation:2.1.0")
                implementation("io.ktor:ktor-serialization-kotlinx-json:2.1.0")
                implementation("ch.qos.logback:logback-classic:1.2.6")
                implementation("org.zeromq:jeromq:0.5.2")
                implementation("com.segment.analytics.kotlin:core:1.9.1")
                implementation("uk.co.caprica:vlcj:4.7.0")

                val lwjglVersion = "3.3.1"
                listOf("lwjgl", "lwjgl-nfd").forEach { lwjglDep ->
                    implementation("org.lwjgl:$lwjglDep:$lwjglVersion")
                    if (System.getProperty("os.name").startsWith("win", ignoreCase = true)) {
                        listOf("natives-windows", "natives-windows-x86", "natives-windows-arm64").forEach { native ->
                            runtimeOnly("org.lwjgl:$lwjglDep:$lwjglVersion:$native")
                        }
                    }
                }
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "com.sdercolin.vlabeler.MainKt"
        jvmArgs("-Xmx2G")
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "vLabeler"
            packageVersion = (version as String).split("-").first()
            copyright = "© 2022 sdercolin"
            appResourcesRootDir.set(project.layout.projectDirectory.dir("resources"))
            modules("java.sql", "jdk.charsets", "jdk.unsupported", "jdk.accessibility", "java.naming")

            macOS {
                iconFile.set(project.file("src/jvmMain/resources/icon.icns"))
                bundleID = "com.sdercolin.vlabeler"

                if (project.localPropertiesFile.exists()) {
                    val localProperties = Properties().apply { load(project.localPropertiesFile.inputStream()) }

                    signing {
                        sign.set(
                            localProperties
                                .getOrDefault("compose.desktop.mac.sign", "false").toString().toBoolean(),
                        )
                        identity.set(
                            localProperties
                                .getOrDefault("compose.desktop.mac.signing.identity", "").toString(),
                        )
                    }
                    notarization {
                        appleID.set(
                            localProperties
                                .getOrDefault("compose.desktop.mac.notarization.appleID", "").toString(),
                        )
                        password.set(
                            localProperties
                                .getOrDefault("compose.desktop.mac.notarization.password", "").toString(),
                        )
                    }
                }
            }
            windows {
                iconFile.set(project.file("src/jvmMain/resources/icon.ico"))
            }
            linux {
                iconFile.set(project.file("src/jvmMain/resources/icon.png"))
            }
        }
    }
}

configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    version.set("0.45.2")
    enableExperimentalRules.set(true)
    disabledRules.set(setOf("no-wildcard-imports"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"
}

task("createAppProperties") {
    dependsOn("jvmProcessResources")
    doLast {
        val appProperties = project.properties.filterKeys { it.startsWith("app.") }
        File("$buildDir/processedResources/jvm/main/app.properties").apply {
            createNewFile()
            writeText(appProperties.map { "${it.key}=${it.value}\n" }.joinToString(""))
        }
    }
}

tasks.findByName("jvmMainClasses")?.dependsOn("createAppProperties")

licenseReport {
    renderers = arrayOf(JsonReportRenderer())
}
