// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The `ReadableStream` interface of the Streams API represents a readable stream of byte data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream)
 */
external interface ReadableStream<R /* default is Any? */> {
/**
     * The **`locked`** read-only property of the ReadableStream interface returns whether or not the readable stream is locked to a reader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/locked)
     */
    val locked: Boolean

/**
     * The **`cancel()`** method of the ReadableStream interface returns a Promise that resolves when the stream is canceled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/cancel)
     */
    fun cancel(reason: Any? = definedExternally): js.promise.Promise<js.core.Void>

/**
     * The **`getReader()`** method of the ReadableStream interface creates a reader and locks the stream to it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/getReader)
     */
    fun getReader(): web.streams.ReadableStreamDefaultReader<R>

/**
     * The **`getReader()`** method of the ReadableStream interface creates a reader and locks the stream to it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/getReader)
     */
    fun getReader(options: web.streams.ReadableStreamGetReaderOptions): web.streams.ReadableStreamBYOBReader

/**
     * The **`pipeThrough()`** method of the ReadableStream interface provides a chainable way of piping the current stream through a transform stream or any other writable/readable pair.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeThrough)
     */
    fun <T> pipeThrough(
        transform: web.streams.ReadableWritablePair<T, R>,
        options: web.streams.StreamPipeOptions = definedExternally,
    ): web.streams.ReadableStream<T>

/**
     * The **`pipeTo()`** method of the ReadableStream interface pipes the current `ReadableStream` to a given WritableStream and returns a Promise that fulfills when the piping process completes successfully, or rejects if any errors were encountered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeTo)
     */
    fun pipeTo(
        destination: web.streams.WritableStream<R>,
        options: web.streams.StreamPipeOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

/**
     * The **`tee()`** method of the two-element array containing the two resulting branches as new ReadableStream instances.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/tee)
     */
    fun tee(): js.array.Tuple2<web.streams.ReadableStream<R>, web.streams.ReadableStream<R>>

    fun values(options: ReadableStreamValuesOptions = definedExternally): AsyncIterableIterator<R>
}

external val ReadableStream: ReadableStream

external interface ReadableStream {
    var prototype: web.streams.ReadableStream
// new (underlyingSource: UnderlyingByteSource, strategy?: QueuingStrategy<Uint8Array>): ReadableStream<Uint8Array>;
// new <R = any>(underlyingSource?: UnderlyingSource<R>, strategy?: QueuingStrategy<R>): ReadableStream<R>;
}
