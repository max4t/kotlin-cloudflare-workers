// Derived from JetBrains/kotlin-wrappers, Apache 2.0.
// See NOTICE file in the repository root.
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin

plugins {
    id("io.github.sgrishchenko.karakum")
}

karakum {
    output = layout.projectDirectory.dir("../src/jsMain/generated")
}

// Exclude redundant NPM test dependencies pulled in by Kotlin/JS Node toolchain
// during Karakum's own jsNode run.
plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().versions.mocha.version = "npm:empty-npm-package@1.0.0"
}
