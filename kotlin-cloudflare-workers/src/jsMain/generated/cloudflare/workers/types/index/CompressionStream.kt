// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`CompressionStream`** interface of the Compression Streams API is an API for compressing a stream of data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream)
 */
external class CompressionStream : web.streams.TransformStream<Any /* ArrayBuffer | ArrayBufferView */, js.typedarrays.Uint8Array> {
    constructor (format: CompressionStreamFormat)
}
