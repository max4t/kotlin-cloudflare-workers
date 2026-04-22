// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * The **`ReadableStreamDefaultController`** interface of the Streams API represents a controller allowing control of a ReadableStream's state and internal queue.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController)
 */
external interface ReadableStreamDefaultController<R /* default is Any? */> {
/**
     * The **`desiredSize`** read-only property of the ReadableStreamDefaultController interface returns the desired size required to fill the stream's internal queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/desiredSize)
     */
    val desiredSize: Double?

/**
     * The **`close()`** method of the ReadableStreamDefaultController interface closes the associated stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/close)
     */
    fun close(): Unit

/**
     * The **`enqueue()`** method of the ```js-nolint enqueue(chunk) ``` - `chunk` - : The chunk to enqueue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/enqueue)
     */
    fun enqueue(chunk: R = definedExternally): Unit

/**
     * The **`error()`** method of the with the associated stream to error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/error)
     */
    fun error(reason: Any?): Unit
}
