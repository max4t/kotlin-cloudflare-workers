// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * This is the event type for `fetch` events dispatched on the ServiceWorkerGlobalScope.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent)
 */
abstract external class FetchEvent : ExtendableEvent {
/**
     * The **`request`** read-only property of the the event handler.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/request)
     */
    val request: web.http.Request

/**
     * The **`respondWith()`** method of allows you to provide a promise for a Response yourself.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/respondWith)
     */
    fun respondWith(promise: web.http.Response): Unit

/**
     * The **`respondWith()`** method of allows you to provide a promise for a Response yourself.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/respondWith)
     */
    fun respondWith(promise: js.promise.Promise<web.http.Response>): Unit

    fun passThroughOnException(): Unit
}
