// Root aggregation: regenerate sources by delegating to the nested generator.
val generate by tasks.registering {
    group = "karakum"
    description = "Run Karakum against @cloudflare/workers-types and write to src/jsMain/generated/"
    dependsOn(gradle.includedBuild("kotlin-cloudflare-workers-karakum").task(":generateKarakumExternals"))
}
