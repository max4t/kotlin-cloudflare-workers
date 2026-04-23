// Declare Kotlin plugins at the root with `apply false` so subprojects can
// activate them by id without re-declaring versions (Gradle 9 rejects the
// same plugin loading from multiple subprojects via the plugins DSL with
// explicit versions).
plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.jsPlainObjects) apply false
}

// Root aggregation: regenerate sources by delegating to the nested generator.
val generate by tasks.registering {
    group = "karakum"
    description = "Run Karakum against @cloudflare/workers-types and write to src/jsMain/generated/"
    dependsOn(gradle.includedBuild("kotlin-cloudflare-workers-karakum").task(":generateKarakumExternals"))
}
