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
                // Pure-JS stdlib routed to kotlin-wrappers' kotlin-js.
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
                "IterableIterator" to "js.iterable.JsIterable",
                "IteratorResult" to "js.iterable.IteratorResult",

                // Option B: redirect Karakum's default web-type routing back
                // to CF's own redeclarations in our emitted package.
                "Body" to "cloudflare.workers.types.index.Body",
                "Headers" to "cloudflare.workers.types.index.Headers",
                "HeadersInit" to "cloudflare.workers.types.index.HeadersInit",
                "Request" to "cloudflare.workers.types.index.Request",
                "RequestInit" to "cloudflare.workers.types.index.RequestInit",
                "RequestInfo" to "cloudflare.workers.types.index.RequestInfo",
                "Response" to "cloudflare.workers.types.index.Response",
                "ResponseInit" to "cloudflare.workers.types.index.ResponseInit",
                "BodyInit" to "cloudflare.workers.types.index.BodyInit",
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
            // The `module.kt` file holds top-level bindings for the
            // `@cloudflare/workers-types` module (addEventListener, fetch,
            // console, self, cloudflare:* re-exports, legacy service-worker
            // syntax). Users of module-syntax workers don't need these; they
            // export an ExportedHandler instead.
            "**/module.kt",
            "**/index.kt",

            // Top-level free functions and globals — not in MVP.
            "**/addEventListener.kt",
            "**/removeEventListener.kt",
            "**/dispatchEvent.kt",
            "**/fetch.kt",
            "**/setTimeout.kt",
            "**/clearTimeout.kt",
            "**/setInterval.kt",
            "**/clearInterval.kt",
            "**/queueMicrotask.kt",
            "**/reportError.kt",
            "**/structuredClone.kt",
            "**/atob.kt",
            "**/btoa.kt",
            "**/caches.kt",
            "**/self.kt",
            "**/origin.kt",
            "**/onmessage.kt",
            "**/workerdResourceLimits.kt",

            // Legacy service-worker syntax — not in MVP.
            "**/ServiceWorkerGlobalScope*.kt",
            "**/WorkerGlobalScope*.kt",
            "**/ExtendableEvent*.kt",
            "**/FetchEvent*.kt",
            "**/MessageEvent*.kt",
            "**/PromiseRejectionEvent*.kt",
            "**/CloseEvent*.kt",
            "**/CustomEvent*.kt",

            // HTMLRewriter API — not in MVP.
            "**/Element.kt",
            "**/HTMLRewriter*.kt",
            "**/Comment.kt",
            "**/Doctype.kt",
            "**/DocumentEnd.kt",
            "**/EndTag.kt",
            "**/Text.kt",

            // Web Crypto / SubtleCrypto — not in MVP.
            "**/SubtleCrypto*.kt",
            "**/Crypto.kt",
            "**/CryptoKey*.kt",
            "**/ArrayBufferKeyAlgorithm*.kt",
            "**/ArrayBufferKeyUsages*.kt",
            "**/JsonWebKey*.kt",

            // URL / URLPattern / URLSearchParams — not in MVP.
            "**/URL.kt",
            "**/URLPattern*.kt",
            "**/URLSearchParams*.kt",

            // Streams — not in MVP (beyond as referenced by Body).
            "**/ReadableStream*.kt",
            "**/WritableStream*.kt",
            "**/TransformStream*.kt",
            "**/CompressionStream*.kt",
            "**/DecompressionStream*.kt",
            "**/TextEncoder*.kt",
            "**/TextDecoder*.kt",
            "**/ByteLengthQueuingStrategy*.kt",
            "**/CountQueuingStrategy*.kt",
            "**/QueuingStrategy*.kt",

            // EventTarget / AbortSignal / AbortController — not in MVP.
            "**/EventTarget*.kt",
            "**/AbortSignal*.kt",
            "**/AbortController*.kt",
            "**/Event.kt",
            "**/Navigator.kt",

            // FormData / Blob / File — not in MVP.
            "**/FormData*.kt",
            "**/Blob*.kt",
            "**/File*.kt",

            // DOM Exception
            "**/DOMException.kt",

            // Images, Assets, Fetcher, DispatchNamespace, MTLS, etc.
            "**/Images*.kt",
            "**/ImagesBinding*.kt",
            "**/Fetcher*.kt",
            "**/DispatchNamespace*.kt",
            "**/ForwardableEmailMessage*.kt",
            "**/ReadableByteStream*.kt",
            "**/ArtifactsRepo*.kt",
            "**/Pipeline*.kt",
            "**/MTLS*.kt",
            "**/mtls*.kt",
            "**/Service*.kt",
            "**/Version*.kt",
            "**/ScriptVersion*.kt",
            "**/TraceItem*.kt",
            "**/Trace*.kt",
            "**/TailItem*.kt",
            "**/BasicImagesBinding*.kt",
            "**/RpcStub*.kt",
            "**/RpcTarget*.kt",
            "**/RpcProperty*.kt",

            // Anonymous "TempNN" types emitted by Karakum for inline types in
            // files we ignore — they become orphans without their parent.
            "**/Temp*.kt",

            // Plain TS utility type aliases Karakum passes through.
            "**/Without*.kt",

            // Top-level type alias to a union — would be `typealias X = Any`
            // which is noisy; reintroduce later if needed.
            "**/Cloudflare.kt",

            // Orphaned companion-extension files for string-literal enums
            // whose backing declaration lives in the (ignored) module.kt.
            "**/EventOutcome.kt",
            "**/ValueType.kt",
            "**/ImportExportKind.kt",
            "**/TableKind.kt",
            "**/EntityType*.kt",
            "**/ScriptTags*.kt",

            // Non-fetch handler families: their definitions live in module.kt
            // which we ignore, but Karakum still emits the handler alias files.
            "**/ExportedHandler*.kt",
            "**/EmailExportedHandler*.kt",
            "**/PagesFunction*.kt",
            "**/PagesPluginFunction*.kt",

            // Misc bindings that transitively pull in ignored deps.
            "**/AutoRag*.kt",
            "**/AutoRAG*.kt",
            "**/MessageSendRequest*.kt",
            "**/SendEmail*.kt",
            "**/Container*.kt",
            "**/WorkerStub*.kt",
            "**/WorkerLoader*.kt",
            "**/UnderlyingSource*.kt",
            "**/UnderlyingSink*.kt",
            "**/UnderlyingByteSource*.kt",
            "**/Transformer*.kt",
            "**/TailEvent*.kt",
            "**/onRequest.kt",

            // AI/ML model bindings — huge long tail, all non-MVP.
            "**/Ai*.kt",
            "**/Base_Ai_*.kt",
            "**/BaseAi*.kt",
            "**/ChatCompletion*.kt",
            "**/UserMessageContent*.kt",
            "**/Chat*.kt",
            "**/InferenceUpstream*.kt",
            "**/ConversionOptions*.kt",
            "**/Markdown*.kt",
            "**/Reasoning*.kt",
            "**/ResponseFunction*.kt",
            "**/ResponseCreated*.kt",
            "**/ResponseCompleted*.kt",
            "**/ResponseFailed*.kt",
            "**/ResponseIncomplete*.kt",
            "**/UniversalGateway*.kt",
            "**/FlagshipEvaluation*.kt",
            "**/Artifacts*.kt",
            "**/Params.kt",

            // Image/Media transformation APIs — non-MVP.
            "**/Image*.kt",
            "**/Media*.kt",
            "**/HostedImages*.kt",

            // EventSource / MessagePort / ErrorEvent — non-MVP.
            "**/EventSource*.kt",
            "**/EventContext*.kt",
            "**/EventPluginContext*.kt",
            "**/EventListener*.kt",
            "**/ErrorEvent*.kt",
            "**/MessagePort*.kt",
            "**/Message.kt",
            "**/_EmailMessage.kt",

            // Loopback (workerd internals) — non-MVP.
            "**/Loopback*.kt",
            "**/ColoLocalActor*.kt",
            "**/FacetStartup*.kt",
            "**/HelloWorld*.kt",

            // More stream helpers — non-MVP.
            "**/ReadableWritablePair.kt",
            "**/StreamError*.kt",
            "**/StreamPipeOptions*.kt",
            "**/StreamScopedCaptions*.kt",
            "**/StreamWatermarks*.kt",
            "**/IdentityTransformStream*.kt",
            "**/FixedLengthStream*.kt",
            "**/DigestStream*.kt",

            // Analytics-adjacent / Observability — non-MVP.
            "**/UnsafeTraceMetrics*.kt",

            // Scheduler global — already ignored via lowercase, but capital too.
            "**/Scheduler*.kt",

            // Sql storage cursor — non-MVP (DO-adjacent).
            "**/SqlStorage*.kt",

            // MVP types that are emitted with `web.*` references or internal
            // conflicts we cannot easily fix via importMapper. Hand-write
            // these in src/jsMain/kotlin/cloudflare/workers/ instead.
            "**/Request.kt",
            "**/Response.kt",
            "**/Headers.kt",
            "**/Body.kt",
            "**/RequestInit.kt",
            "**/ResponseInit.kt",
            "**/HeadersInit.kt",
            "**/BodyInit.kt",
            "**/RequestInfo.kt",
            "**/RequestInitEncodeResponseBody.kt",

            // Hand-written to work around Karakum limitations:
            //   - Exclude<T, U> TS utility type is passed through.
            //   - Property narrowing from supertype needs `override`.
            "**/IncomingRequestCfPropertiesTLSClientAuth.kt",
            "**/IncomingRequestCfPropertiesBotManagementEnterprise.kt",

            // Final long-tail: non-MVP bindings that still error out on misc
            // unresolved references after the above purge.
            "**/Flagship*.kt",
            "**/ToMarkdownService*.kt",
            "**/Responses*.kt",
            "**/TooManyWatermarks*.kt",
            "**/StreamVideo*.kt",
            "**/StreamBinding*.kt",
            "**/RateLimitedError*.kt",
            "**/QuotaReachedError*.kt",
            "**/NotFoundError*.kt",
            "**/MaxFileSizeError*.kt",
            "**/InvalidURLError*.kt",
            "**/InternalError*.kt",
            "**/ForbiddenError*.kt",
            "**/EmbeddedImage*.kt",
            "**/ConversionRequestOptions*.kt",
            "**/BadRequestError*.kt",
            "**/AssistantMessage*.kt",
            "**/AlreadyUploadedError*.kt",
            "**/Tool.kt",
            // Enum with dotted string literal names — Kotlin compiler IdSig
            // crashes on backticked identifiers with dots.
            "**/ResponseIncludable.kt",

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
