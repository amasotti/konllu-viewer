import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform") version "1.9.10"
    id("io.gitlab.arturbosch.detekt") version("1.23.1")
//    id("com.google.devtools.ksp") version "1.9.10-1.0.13"
//    id("org.kodein.mock.mockmp") version "1.15.0"
}

group = "nlp.amasotti"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    @OptIn(ExperimentalWasmDsl::class)
    wasm {
        binaries.executable()
        browser {

        }
    }
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val wasmMain by getting
        val wasmTest by getting
    }
}
