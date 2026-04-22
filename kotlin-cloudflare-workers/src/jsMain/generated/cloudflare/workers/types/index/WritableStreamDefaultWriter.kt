// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`WritableStreamDefaultWriter`** interface of the Streams API is the object returned by WritableStream.getWriter() and once created locks the writer to the `WritableStream` ensuring that no other streams can write to the underlying sink.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter)
 */
external class WritableStreamDefaultWriter<W /* default is Any? */> {
    constructor (stream: web.streams.WritableStream)

/**
     * The **`closed`** read-only property of the the stream errors or the writer's lock is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/closed)
     */
    val closed: js.promise.Promise<js.core.Void>

/**
     * The **`ready`** read-only property of the that resolves when the desired size of the stream's internal queue transitions from non-positive to positive, signaling that it is no longer applying backpressure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/ready)
     */
    val ready: js.promise.Promise<js.core.Void>

/**
     * The **`desiredSize`** read-only property of the to fill the stream's internal queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/desiredSize)
     */
    val desiredSize: Double?

/**
     * The **`abort()`** method of the the producer can no longer successfully write to the stream and it is to be immediately moved to an error state, with any queued writes discarded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/abort)
     */
    fun abort(reason: Any? = definedExternally): js.promise.Promise<js.core.Void>

/**
     * The **`close()`** method of the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/close)
     */
    fun close(): js.promise.Promise<js.core.Void>

/**
     * The **`write()`** method of the operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/write)
     */
    fun write(chunk: W = definedExternally): js.promise.Promise<js.core.Void>

/**
     * The **`releaseLock()`** method of the corresponding stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/releaseLock)
     */
    fun releaseLock(): Unit
}
