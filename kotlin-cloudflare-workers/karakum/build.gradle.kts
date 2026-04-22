plugins {
    id("generatorbuild.karakum-conventions")
}

karakum {
    library {
        name = "@cloudflare/workers-types"
        version = libs.versions.cloudflare.workers.types.get()
    }
}
