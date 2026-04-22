// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`WritableStream`** interface of the Streams API provides a standard abstraction for writing streaming data to a destination, known as a sink.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream)
 */
external class WritableStream<W /* default is Any? */> {
    constructor (
        underlyingSink: web.streams.UnderlyingSink = definedExternally,
        queuingStrategy: web.streams.QueuingStrategy = definedExternally,
    )

/**
     * The **`locked`** read-only property of the WritableStream interface returns a boolean indicating whether the `WritableStream` is locked to a writer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/locked)
     */
    val locked: Boolean

/**
     * The **`abort()`** method of the WritableStream interface aborts the stream, signaling that the producer can no longer successfully write to the stream and it is to be immediately moved to an error state, with any queued writes discarded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/abort)
     */
    fun abort(reason: Any? = definedExternally): js.promise.Promise<js.core.Void>

/**
     * The **`close()`** method of the WritableStream interface closes the associated stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/close)
     */
    fun close(): js.promise.Promise<js.core.Void>

/**
     * The **`getWriter()`** method of the WritableStream interface returns a new instance of WritableStreamDefaultWriter and locks the stream to that instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/getWriter)
     */
    fun getWriter(): web.streams.WritableStreamDefaultWriter<W>
}
