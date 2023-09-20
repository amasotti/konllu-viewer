import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import io.gitlab.arturbosch.detekt.Detekt

plugins {
    kotlin("multiplatform") version "1.9.10"
    id("io.gitlab.arturbosch.detekt") version("1.23.1")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

group = "nlp.amasotti"
version = "1.0-SNAPSHOT"

kotlin {
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

tasks.register("detektAll") {
    allprojects {
        this@register.dependsOn(tasks.withType<Detekt>())
    }
}
