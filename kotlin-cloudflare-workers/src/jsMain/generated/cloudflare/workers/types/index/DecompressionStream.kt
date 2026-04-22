// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`DecompressionStream`** interface of the Compression Streams API is an API for decompressing a stream of data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DecompressionStream)
 */
external class DecompressionStream : web.streams.TransformStream<Any /* ArrayBuffer | ArrayBufferView */, js.typedarrays.Uint8Array> {
    constructor (format: DecompressionStreamFormat)
}
