// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The Workers runtime supports a subset of the Performance API, used to measure timing and performance,
 * as well as timing of subrequests and other operations.
 *
 * [Cloudflare Docs Reference](https://developers.cloudflare.com/workers/runtime-apis/performance/)
 */
abstract external class Performance {
// [Cloudflare Docs Reference](https://developers.cloudflare.com/workers/runtime-apis/performance/#performancetimeorigin)
    val timeOrigin: Double

// [Cloudflare Docs Reference](https://developers.cloudflare.com/workers/runtime-apis/performance/#performancenow)
    fun now(): Double

/**
     * The **`toJSON()`** method of the Performance interface is a Serialization; it returns a JSON representation of the Performance object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Performance/toJSON)
     */
    fun toJSON(): Any
}
