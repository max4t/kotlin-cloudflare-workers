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
