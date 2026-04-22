// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`Blob`** interface represents a blob, which is a file-like object of immutable, raw data; they can be read as text or binary data, or converted into a ReadableStream so its methods can be used for processing the data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob)
 */
external class Blob {
    constructor (
        type: js.array.ReadonlyArray<(Any /* (ArrayBuffer | ArrayBufferView) | string | Blob */)> = definedExternally,
        options: BlobOptions = definedExternally,
    )

/**
     * The **`size`** read-only property of the Blob interface returns the size of the Blob or File in bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/size)
     */
    val size: Double

/**
     * The **`type`** read-only property of the Blob interface returns the MIME type of the file.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/type)
     */
    val type: String

/**
     * The **`slice()`** method of the Blob interface creates and returns a new `Blob` object which contains data from a subset of the blob on which it's called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/slice)
     */
    fun slice(
        start: Double = definedExternally,
        end: Double = definedExternally,
        type: String = definedExternally,
    ): web.blob.Blob

/**
     * The **`arrayBuffer()`** method of the Blob interface returns a Promise that resolves with the contents of the blob as binary data contained in an ArrayBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/arrayBuffer)
     */
    fun arrayBuffer(): js.promise.Promise<js.buffer.ArrayBuffer>

/**
     * The **`bytes()`** method of the Blob interface returns a Promise that resolves with a Uint8Array containing the contents of the blob as an array of bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/bytes)
     */
    fun bytes(): js.promise.Promise<js.typedarrays.Uint8Array>

/**
     * The **`text()`** method of the string containing the contents of the blob, interpreted as UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/text)
     */
    fun text(): js.promise.Promise<String>

/**
     * The **`stream()`** method of the Blob interface returns a ReadableStream which upon reading returns the data contained within the `Blob`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/stream)
     */
    fun stream(): web.streams.ReadableStream
}
