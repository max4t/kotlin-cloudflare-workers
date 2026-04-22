// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`ExtendableEvent`** interface extends the lifetime of the `install` and `activate` events dispatched on the global scope as part of the service worker lifecycle.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent)
 */
abstract external class ExtendableEvent : web.events.Event {
/**
     * The **`ExtendableEvent.waitUntil()`** method tells the event dispatcher that work is ongoing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/waitUntil)
     */
    fun waitUntil(promise: js.promise.Promise<Any?>): Unit
}
