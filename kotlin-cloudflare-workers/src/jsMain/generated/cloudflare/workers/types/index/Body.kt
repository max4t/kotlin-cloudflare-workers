// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

abstract external class Body {
/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body) */
    val body: web.streams.ReadableStream<js.typedarrays.Uint8Array<js.buffer.ArrayBuffer>>?

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed) */
    val bodyUsed: Boolean

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer)
    fun arrayBuffer(): js.promise.Promise<js.buffer.ArrayBuffer>

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob)
    fun blob(): js.promise.Promise<web.blob.Blob>

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bytes)
    fun bytes(): js.promise.Promise<js.typedarrays.Uint8Array>

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData)
    fun formData(): js.promise.Promise<web.form.FormData>

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json)
    fun <T> json(): js.promise.Promise<T>

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text)
    fun text(): js.promise.Promise<String>
}
