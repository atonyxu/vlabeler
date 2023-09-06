# Scripting in vLabeler

This article introduces common information about scripting in `vLabeler`, typically in labelers and plugins.

## Environment

`vLabeler` uses embedded [JavaScript](https://developer.mozilla.org/ja/docs/Web/JavaScript) engine provided
by [GraalVM 22.1](https://www.graalvm.org/22.1/reference-manual/js/).

It implements JavaScript in the ECMAScript (ECMA-262) specification which is fully compatible with the ECMAScript 2021
specification (ES12).
Check [JavaScript Compatibility](https://www.graalvm.org/22.1/reference-manual/js/JavaScriptCompatibility/) for detailed
info about language specifications.

## Available APIs

Besides common JavaScript APIs, `vLabeler` provides some custom APIs for scripting.

### File API

Provides APIs for file operations. See the documentation [here](../docs/file-api.md).

### Env API

Provides APIs for environment info. See the documentation [here](../docs/env-api.md).

### Command Line API

Provides APIs for command line operations. See the documentation [here](../docs/command-line-api.md).

### Localization

In scripts for json definition files of labelers and plugins, a localized string can be used instead of a plain string.

A localized string is an object with language codes as keys and strings as values. e.g.

```javascript
// in a script
let myLocalizedDescription = {
    "en": "This is a description in English.",
    "zh": "这是中文的描述。",
    "ja": "これは日本語の説明です。"
}
```

```
// inside a JSON
{
    ...,
    "description": {
        "en": "This is a description in English.",
        "zh": "这是中文的描述。",
        "ja": "これは日本語の説明です。"
    },
    ...
}
```

A localized string can always be assigned by a plain string, which is treated as the default language `en`.

```javascript
// in a script
let myLocalizedDescription = "This is a description in English."

// this is equivalent to

let myLocalizedDescription = {
    "en": "This is a description in English."
}
```

When displaying a localized string, vLabeler will choose the string with the language code that matches the current
language code in the application settings, or the default language `en` if no match is found, using startsWith matching.

e.g. If the current language code is `en-US`, the string with key `en` will be used. So it's recommended to use common
language codes like `en` and `zh` instead of `en-US` and `zh-CN` to cover more cases.

Please note that you have to provide a default language `en` in your localization map, otherwise the plugin gets a
parse error when being loaded.

### Error handling

When the scripts encounter illegal inputs or other expected errors, you can show an error message to users by
calling `error(message)`.
The parameter `message` can be a string or a localized string.
See the [Localization](#localization) section for more details.

Other errors thrown in the scripts will be displayed as "Unexpected errors" without detailed information, indicating
that it is more likely to be a bug of the plugin, rather than an illegal input or something else that may happen in
normal use cases.

If a user contacts you with an "Unexpected errors", you can ask for detailed information in the logs to help you solve
the issue.

Here is an example of throwing an error when an unknown placeholder is found in a string:

```javascript
let unknownExpressionMatch = expression.match(/\$\{\w+}/)
if (unknownExpressionMatch) {

    // throwing error in default language 
    error(`Unknown placeholder: ${unknownExpressionMatch[0]}`)

    // throwing error in multiple languages
    error({
        en: `Unknown placeholder: ${unknownExpressionMatch[0]}`,
        zh: `未知的占位符: ${unknownExpressionMatch[0]}`
    })
}
```

### Display a report after execution

**This API is only available in `macro` plugins.**

You can show a report after a `macro` plugin is executed successfully by calling `report(message)`.
The parameter `message` can be a string or a localized string.
See the [Localization](#localization) section for more details.

```javascript
// display report in default language
report("This is a report.")

// display report in multiple languages
report({
    en: "This is a report in English.",
    zh: "这是中文的报告。"
})
```

### Request audio playback after execution

**This API is only available in `macro` plugins.**

You can ask vLabeler to conduct audio playback after a `macro` plugin is executed successfully by
calling `requestAudioFilePlayback(path, offset = 0, duration = null)`.

See the [source code](../src/jvmMain/resources/js/request_audio_playback.js) for more details.

### Class definitions

There are some class definitions available in the scripting environment, which are corresponding to the classes in
`vLabeler`'s codebase (Kotlin).

#### Entry

The data for an entry (a label).
Check the [Kotlin source code](../src/jvmMain/kotlin/com/sdercolin/vlabeler/model/Entry.kt) for details.

See also the [JavaScript source code](../src/jvmMain/resources/js/class_entry.js) for quick reference.

#### Module

The data containing all the entries in a module (sub-project).
Check the [JavaScript source code](../src/jvmMain/resources/js/class_module.js) for details.

Because it contains some properties about file paths, some conversions are conducted when the object is passed from
application to scripts, and vice versa.

In the [Kotlin source code](../src/jvmMain/kotlin/com/sdercolin/vlabeler/model/Module.kt), check the `JsModule` class
for details, which is the direct counterpart of the `Module` class in JavaScript.

#### Module definition

The data for a module definition used during project construction.

See both the [Kotlin source code](../src/jvmMain/kotlin/com/sdercolin/vlabeler/model/ModuleDefinition.kt) and
the [JavaScript source code](../src/jvmMain/resources/js/module_definition.js) for details.

## API availability

We have the following types of scripts:

- Raw label parser scripts: embedded in labelers, used to parse raw labels into entries
- Raw label writer scripts: embedded in labelers, used to write entries as raw labels
- Project constructor scripts: embedded in labelers, used to construct a project with multiple modules
- Macro plugin scripts: included in the plugin folder of a macro plugin
- Template plugin scripts: included in the plugin folder of a template plugin, including the main scripts and the [input
  finder script](plugin-development.md#find-input-files-dynamically)

The availability of the APIs listed above depends on the type of the script.

| API                                                       | Raw label parser | Raw label writer | Project constructor | Macro plugin | Template plugin |
|-----------------------------------------------------------|------------------|------------------|---------------------|--------------|-----------------|
| [File](#file-api)                                         | ✔                | ✔                | ✔                   | ✔            | ✔               |
| [Env](#env-api)                                           | ✔                | ✔                | ✔                   | ✔            | ✔               |
| [Command line](#command-line-api)                         |                  |                  |                     | ✔            | ✔               |
| [Localization](#localization)                             | ✔                | ✔                | ✔                   | ✔            | ✔               |
| [Error handling](#error-handling)                         | ✔                | ✔                | ✔                   | ✔            | ✔               |
| [Report](#display-a-report-after-execution)               |                  |                  |                     | ✔            |                 |
| [Audio playback](#request-audio-playback-after-execution) |                  |                  |                     | ✔            |                 |
| [Entry](#entry)                                           | ✔                | ✔                |                     | ✔            | ✔               |
| [Module](#module)                                         |                  |                  |                     | ✔            |                 |
| [Module definition](#module-definition)                   |                  |                  | ✔                   |              |                 |