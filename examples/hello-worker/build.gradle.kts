import org.jetbrains.kotlin.gradle.dsl.JsModuleKind

plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

repositories {
    mavenCentral()
}

kotlin {
    js {
        binaries.executable()
        nodejs()
        useEsModules()
        compilerOptions {
            target = "es2015"
            moduleKind = JsModuleKind.MODULE_ES
            useEsClasses = true
            // Kotlin 2.3+: allows @JsExport on suspend functions so Worker's
            // fetch handler can be written as a direct `suspend fun` override.
            freeCompilerArgs.add("-Xenable-suspend-function-exporting")
        }
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(project(":kotlin-cloudflare-workers"))
            }
        }
    }
}

// Snapshot the compiled JS into a stable, version-controlled location so
// readers of the repo can see what Kotlin/JS produces for a Worker without
// running a build themselves.
val snapshotGeneratedJs by tasks.registering(Copy::class) {
    group = "examples"
    description = "Copy compiled JS from build/ into examples/hello-worker/generated-js/."
    dependsOn("compileProductionExecutableKotlinJs")
    from(layout.buildDirectory.dir("compileSync/js/main/productionExecutable/kotlin"))
    into(layout.projectDirectory.dir("generated-js"))
    include("**/*.mjs", "**/*.js", "**/*.d.mts", "**/*.d.ts")
}
