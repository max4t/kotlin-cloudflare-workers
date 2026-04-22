package cfworkersgenerator

import io.github.sgrishchenko.karakum.configuration.*
import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseResultPlugin
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.ruleOf
import js.array.ReadonlyArray

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = listOf(
            PromiseResultPlugin(),
        )
        injections = listOf()
        annotations = listOf()
        nameResolvers = listOf()
        inheritanceModifiers = listOf()

        input = listOf("**/index.d.ts")

        // Dated submodules and the *latest/*oldest/*experimental pointers all
        // alias types that already exist at the top level; emitting them would
        // produce duplicate Kotlin declarations.
        ignoreInput = listOf(
            "**/2021-*/**",
            "**/2022-*/**",
            "**/2023-*/**",
            "**/experimental/**",
            "**/latest/**",
            "**/oldest/**",
        )

        isolatedOutputPackage = true

        // Route pure-JS stdlib types that CF references but never declares to
        // their kotlin-wrappers equivalents. CF's own redeclared web types
        // (Request, Response, Headers, Body, Streams, WebSocket) are NOT
        // routed — we emit them per Option B.
        importMapper = mapOf(
            ".+" to ruleOf(
                "Promise" to "js.promise.Promise",
                "ArrayBuffer" to "js.buffer.ArrayBuffer",
                "ArrayBufferView" to "js.buffer.ArrayBufferView",
                "SharedArrayBuffer" to "js.buffer.SharedArrayBuffer",
                "DataView" to "js.buffer.DataView",
                "Uint8Array" to "js.typedarrays.Uint8Array",
                "Uint8ClampedArray" to "js.typedarrays.Uint8ClampedArray",
                "Uint16Array" to "js.typedarrays.Uint16Array",
                "Uint32Array" to "js.typedarrays.Uint32Array",
                "Int8Array" to "js.typedarrays.Int8Array",
                "Int16Array" to "js.typedarrays.Int16Array",
                "Int32Array" to "js.typedarrays.Int32Array",
                "BigInt64Array" to "js.typedarrays.BigInt64Array",
                "BigUint64Array" to "js.typedarrays.BigUint64Array",
                "Float32Array" to "js.typedarrays.Float32Array",
                "Float64Array" to "js.typedarrays.Float64Array",
                "ReadonlyArray" to "js.array.ReadonlyArray",
            ),
        )

        namespaceStrategy = mapOf(
            "cloudflare:.+" to NamespaceStrategy.ignore,
            "WebAssembly" to NamespaceStrategy.ignore,
            "Rpc" to NamespaceStrategy.ignore,
            "TailStream" to NamespaceStrategy.ignore,
            "Cloudflare" to NamespaceStrategy.ignore,
            "CloudflareWorkersModule" to NamespaceStrategy.ignore,
        )

        // MVP denylist: everything outside the fetch-handler chain.
        // Remove entries family-by-family in Phase 3.
        ignoreOutput = listOf(
            // Storage / DB bindings
            "**/KV*.kt",
            "**/R2*.kt",
            "**/D1*.kt",
            "**/DurableObject*.kt",
            "**/Queue*.kt",
            "**/Workflow*.kt",
            "**/Analytics*.kt",
            "**/Hyperdrive*.kt",
            "**/Vectorize*.kt",
            "**/Ai*.kt",
            "**/AI*.kt",
            "**/Email*.kt",

            // Non-fetch handlers and their triggers
            "**/ExportedHandlerScheduled*.kt",
            "**/ExportedHandlerQueue*.kt",
            "**/ExportedHandlerTail*.kt",
            "**/ExportedHandlerTrace*.kt",
            "**/ExportedHandlerConnect*.kt",
            "**/ExportedHandlerTest*.kt",
            "**/Scheduled*.kt",
            "**/MessageBatch*.kt",
            "**/Trace*.kt",
            "**/TailStream*.kt",

            // WebSocket and Socket APIs
            "**/WebSocket*.kt",
            "**/Socket*.kt",

            // Cache API beyond CacheContext stub
            "**/Cache.kt",
            "**/CacheStorage*.kt",

            // Stdlib types routed via importMapper — suppress re-emission
            "**/Uint8Array.kt",
            "**/Uint8ClampedArray.kt",
            "**/Uint16Array.kt",
            "**/Uint32Array.kt",
            "**/Int8Array.kt",
            "**/Int16Array.kt",
            "**/Int32Array.kt",
            "**/BigInt64Array.kt",
            "**/BigUint64Array.kt",
            "**/Float32Array.kt",
            "**/Float64Array.kt",
            "**/ArrayBuffer.kt",
            "**/ArrayBufferView.kt",
            "**/SharedArrayBuffer.kt",
            "**/DataView.kt",
            "**/ReadonlyArray.kt",

            // Intersection / union aliases — hand-written
            "**/IncomingRequestCfProperties.kt",
            "**/CfProperties.kt",

            // Global-instance declarations that collide case-insensitively
            // with their type-of-the-same-name (e.g. `declare var console: Console`).
            // We don't need the globals for the fetch-handler MVP.
            "**/console.kt",
            "**/crypto.kt",
            "**/scheduler.kt",
            "**/performance.kt",
        )
    }
}
