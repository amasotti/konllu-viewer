# CoNLL-U Parser & SVG Generator

## Overview
This subproject focuses on providing a backend written in Kotlin, 
compiled to WebAssembly (WASM), for parsing and visualizing CoNLL-U formatted linguistic data. 

It includes modules for parsing CoNLL-U files, generating SVG visualizations, and more.


## Tech-Stack

- Kotlin (1.9) with K2 Experimental Compiler
- WebAssembly (WASM)
- Gradle (8.3)

- detekt for static code analysis and Kotlin-Test for unit testing

## Main Gradle Tasks

* **Build**: `./gradlew build`
* **Test**: `./gradlew allTests`
* **Linting**: `./gradlew detektAll`
* **run in Browser** (assumes `CHROME_BIN` has been set): `./gradlew wasmBrowserRun`
* **Generate Dev Artifact**: `./gradlew wasmBrowserDevelopmentWebpack`
* **Generate Prod Artifact**: `./gradlew wasmBrowserProductionWebpack`

*WASM can also run in any Nodejs environment, check the [Jetbrains Documentation](https://kotlinlang.org/docs/wasm-overview.html) for more information.*

## Project Structure

~~~bash
.
├── build.gradle.kts
├── config
│   └── detekt
│       └── detekt.yml
├── gradle.properties
├── gradlew
├── gradlew.bat
├── kotlin-js-store
│   └── yarn.lock
├── README.md
├── settings.gradle.kts
└── src
    ├── commonMain
    │   ├── kotlin
    │   │   ├── extensions
    │   │   ├── models
    │   │   ├── parser
    │   │   └── svg
    │   │       ├── models
    │   │       └── SVGGenerator.kt
    ├── commonTest
    ├── wasmMain
    │   ├── kotlin
    │   └── resources
    │       ├── index.html
    │       └── myExperiment.js
    └── wasmTest
~~~



