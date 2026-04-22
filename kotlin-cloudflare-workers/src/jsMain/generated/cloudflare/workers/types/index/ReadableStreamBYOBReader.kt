// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The `ReadableStreamBYOBReader` interface of the Streams API defines a reader for a ReadableStream that supports zero-copy reading from an underlying byte source.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader)
 */
external class ReadableStreamBYOBReader {
    constructor (stream: web.streams.ReadableStream)

    val closed: js.promise.Promise<js.core.Void>

    fun cancel(reason: Any? = definedExternally): js.promise.Promise<js.core.Void>

/**
     * The **`read()`** method of the ReadableStreamBYOBReader interface is used to read data into a view on a user-supplied buffer from an associated readable byte stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/read)
     */
    fun <T : js.buffer.ArrayBufferView> read(view: T): js.promise.Promise<web.streams.ReadableStreamReadResult<T>>

/**
     * The **`releaseLock()`** method of the ReadableStreamBYOBReader interface releases the reader's lock on the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/releaseLock)
     */
    fun releaseLock(): Unit

    fun <T : js.buffer.ArrayBufferView> readAtLeast(
        minElements: Double,
        view: T,
    ): js.promise.Promise<web.streams.ReadableStreamReadResult<T>>
}
