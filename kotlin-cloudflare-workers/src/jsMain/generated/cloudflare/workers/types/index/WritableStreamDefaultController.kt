// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * The **`WritableStreamDefaultController`** interface of the Streams API represents a controller allowing control of a WritableStream's state.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController)
 */
external interface WritableStreamDefaultController {
/**
     * The read-only **`signal`** property of the WritableStreamDefaultController interface returns the AbortSignal associated with the controller.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/signal)
     */
    val signal: web.abort.AbortSignal

/**
     * The **`error()`** method of the with the associated stream to error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/error)
     */
    fun error(reason: Any? = definedExternally): Unit
}
