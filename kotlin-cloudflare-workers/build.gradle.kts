plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

repositories {
    mavenCentral()
}

kotlin {
    js {
        nodejs()
        compilerOptions {
            target = "es2015"
        }
    }

    sourceSets {
        val jsMain by getting {
            kotlin.srcDir("src/jsMain/generated")
            dependencies {
                api(libs.kotlin.wrappers.js)
                api(libs.coroutines.core)
                api(npm("@cloudflare/workers-types", libs.versions.cloudflare.workers.types.get()))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
                implementation(libs.coroutines.test)
            }
        }
    }
}
