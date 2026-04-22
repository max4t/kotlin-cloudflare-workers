// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * The **`ServiceWorkerGlobalScope`** interface of the Service Worker API represents the global execution context of a service worker.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope)
 */
external interface ServiceWorkerGlobalScope : WorkerGlobalScope {
    var DOMException: ServiceWorkerGlobalScopeDOMException
    var WorkerGlobalScope: Any // typeof WorkerGlobalScope

    fun btoa(data: String): String

    fun atob(data: String): String

    fun setTimeout(callback: Function<Unit> /* (...args: any[]) => void */, msDelay: Double = definedExternally): Double

    fun <Args : js.array.ReadonlyArray<Any?>> setTimeout(callback: Function<Unit> /* (...args: Args) => void */, msDelay: Double = definedExternally, vararg args: Any? /* Args */): Double

    fun clearTimeout(timeoutId: Double?): Unit

    fun setInterval(callback: Function<Unit> /* (...args: any[]) => void */, msDelay: Double = definedExternally): Double

    fun <Args : js.array.ReadonlyArray<Any?>> setInterval(callback: Function<Unit> /* (...args: Args) => void */, msDelay: Double = definedExternally, vararg args: Any? /* Args */): Double

    fun clearInterval(timeoutId: Double?): Unit

    fun queueMicrotask(task: Function): Unit

    fun <T> structuredClone(
        value: T,
        options: web.serialization.StructuredSerializeOptions = definedExternally,
    ): T

    fun reportError(error: Any?): Unit

    fun fetch(
        input: RequestInfo,
        init: web.http.RequestInit<RequestInitCfProperties> = definedExternally,
    ): js.promise.Promise<web.http.Response>

    fun fetch(
        input: web.url.URL,
        init: web.http.RequestInit<RequestInitCfProperties> = definedExternally,
    ): js.promise.Promise<web.http.Response>

    var self: ServiceWorkerGlobalScope
    var crypto: web.crypto.Crypto
    var caches: web.cache.CacheStorage
    var scheduler: web.scheduling.Scheduler
    var performance: web.performance.Performance
    var Cloudflare: Cloudflare
    val origin: String
    var Event: ServiceWorkerGlobalScopeEvent
    var ExtendableEvent: Any // typeof ExtendableEvent
    var CustomEvent: ServiceWorkerGlobalScopeCustomEvent
    var PromiseRejectionEvent: ServiceWorkerGlobalScopePromiseRejectionEvent
    var FetchEvent: Any // typeof FetchEvent
    var TailEvent: Any // typeof TailEvent
    var TraceEvent: Any // typeof TailEvent
    var ScheduledEvent: Any // typeof ScheduledEvent
    var MessageEvent: ServiceWorkerGlobalScopeMessageEvent
    var CloseEvent: ServiceWorkerGlobalScopeCloseEvent
    var ReadableStreamDefaultReader: ServiceWorkerGlobalScopeReadableStreamDefaultReader
    var ReadableStreamBYOBReader: ServiceWorkerGlobalScopeReadableStreamBYOBReader
    var ReadableStream: ServiceWorkerGlobalScopeReadableStream
    var WritableStream: ServiceWorkerGlobalScopeWritableStream
    var WritableStreamDefaultWriter: ServiceWorkerGlobalScopeWritableStreamDefaultWriter
    var TransformStream: ServiceWorkerGlobalScopeTransformStream
    var ByteLengthQueuingStrategy: ServiceWorkerGlobalScopeByteLengthQueuingStrategy
    var CountQueuingStrategy: ServiceWorkerGlobalScopeCountQueuingStrategy
    var ErrorEvent: ServiceWorkerGlobalScopeErrorEvent
    var EventSource: ServiceWorkerGlobalScopeEventSource
    var CompressionStream: ServiceWorkerGlobalScopeCompressionStream
    var DecompressionStream: ServiceWorkerGlobalScopeDecompressionStream
    var TextEncoderStream: ServiceWorkerGlobalScopeTextEncoderStream
    var TextDecoderStream: ServiceWorkerGlobalScopeTextDecoderStream
    var Headers: ServiceWorkerGlobalScopeHeaders
    var Body: Any // typeof Body
    var Request: ServiceWorkerGlobalScopeRequest
    var Response: ServiceWorkerGlobalScopeResponse
    var WebSocket: ServiceWorkerGlobalScopeWebSocket
    var WebSocketPair: js.function.ConstructorFunction<js.array.Tuple, Temp0>
    var WebSocketRequestResponsePair: Any // typeof WebSocketRequestResponsePair
    var AbortController: ServiceWorkerGlobalScopeAbortController
    var AbortSignal: ServiceWorkerGlobalScopeAbortSignal
    var TextDecoder: ServiceWorkerGlobalScopeTextDecoder
    var TextEncoder: ServiceWorkerGlobalScopeTextEncoder
    var URL: ServiceWorkerGlobalScopeURL
    var URLSearchParams: ServiceWorkerGlobalScopeURLSearchParams
    var URLPattern: ServiceWorkerGlobalScopeURLPattern
    var Blob: ServiceWorkerGlobalScopeBlob
    var File: ServiceWorkerGlobalScopeFile
    var FormData: ServiceWorkerGlobalScopeFormData
    var Crypto: ServiceWorkerGlobalScopeCrypto
    var SubtleCrypto: ServiceWorkerGlobalScopeSubtleCrypto
    var CryptoKey: ServiceWorkerGlobalScopeCryptoKey
    var CacheStorage: ServiceWorkerGlobalScopeCacheStorage
    var Cache: ServiceWorkerGlobalScopeCache
    var FixedLengthStream: Any // typeof FixedLengthStream
    var IdentityTransformStream: Any // typeof IdentityTransformStream
    var HTMLRewriter: Any // typeof HTMLRewriter
}
