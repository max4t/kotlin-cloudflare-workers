// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`AbortSignal`** interface represents a signal object that allows you to communicate with an asynchronous operation (such as a fetch request) and abort it if required via an AbortController object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal)
 */
abstract external class AbortSignal : web.events.EventTarget {
/**
     * The **`aborted`** read-only property returns a value that indicates whether the asynchronous operations the signal is communicating with are aborted (`true`) or not (`false`).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/aborted)
     */
    val aborted: Boolean

/**
     * The **`reason`** read-only property returns a JavaScript value that indicates the abort reason.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/reason)
     */
    val reason: Any?

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_event)
    var onabort: Any?

/**
     * The **`throwIfAborted()`** method throws the signal's abort AbortSignal.reason if the signal has been aborted; otherwise it does nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/throwIfAborted)
     */
    fun throwIfAborted(): Unit

    companion object {
/**
         * The **`AbortSignal.abort()`** static method returns an AbortSignal that is already set as aborted (and which does not trigger an AbortSignal/abort_event event).
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_static)
         */
        fun abort(reason: Any? = definedExternally): web.abort.AbortSignal

/**
         * The **`AbortSignal.timeout()`** static method returns an AbortSignal that will automatically abort after a specified time.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/timeout_static)
         */
        fun timeout(delay: Double): web.abort.AbortSignal

/**
         * The **`AbortSignal.any()`** static method takes an iterable of abort signals and returns an AbortSignal.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/any_static)
         */
        fun any(signals: js.array.ReadonlyArray<web.abort.AbortSignal>): web.abort.AbortSignal
    }
}
