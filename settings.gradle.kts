rootProject.name = "kotlin-cloudflare-workers"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

// Library module
include("kotlin-cloudflare-workers")

// Generator is a nested included build so it can depend on Karakum as a
// library and produce sources into the library module's src/jsMain/generated.
includeBuild("kotlin-cloudflare-workers/karakum") {
    name = "kotlin-cloudflare-workers-karakum"
}
