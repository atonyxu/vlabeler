package com.sdercolin.vlabeler.ui.string

import com.sdercolin.vlabeler.ui.string.Language.English

enum class Strings(val en: String) {
    AppName(
        en = "VLabeler"
    ),
    LanguageDisplayName(
        en = English.displayName
    ),
    MenuFile(
        en = "File"
    ),
    MenuFileNewProject(
        en = "New project"
    ),
    MenuFileOpen(
        en = "Open"
    ),
    MenuFileClose(
        en = "Close"
    ),
    CommonOkay(
        en = "OK"
    ),
    CommonCancel(
        en = "Cancel"
    ),
    StarterNewProject(
        en = "New Project"
    ),
    StarterOpen(
        en = "Open"
    ),
    StarterNewSampleDirectory(
        en = "Sample directory"
    ),
    StarterNewWorkingDirectory(
        en = "Working directory"
    ),
    StarterNewProjectName(
        en = "Project name"
    ),
    StarterNewLabeler(
        en = "Labeler"
    ),
    ChooseSampleDirectoryDialogTitle(
        en = "Choose sample directory"
    ),
    ChooseWorkingDirectoryDialogTitle(
        en = "Choose sample directory"
    ),
    OpenProjectDialogTitle(
        en = "Open project"
    ),
    SetResolutionDialogDescription(
        en = "Input horizontal resolution (points per pixel) for the editor (%d ~ %d)"
    );

    fun get(language: Language): String = when (language) {
        English -> en
    }
}

fun string(key: Strings, vararg params: Any?): String {
    val template = key.get(currentLanguage)
    return template.format(*params)
}
