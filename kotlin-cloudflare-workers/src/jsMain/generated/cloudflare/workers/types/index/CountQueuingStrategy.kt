// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`CountQueuingStrategy`** interface of the Streams API provides a built-in chunk counting queuing strategy that can be used when constructing streams.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy)
 */
external class CountQueuingStrategy : web.streams.QueuingStrategy {
    constructor (init: web.streams.QueuingStrategyInit)

/**
     * The read-only **`CountQueuingStrategy.highWaterMark`** property returns the total number of chunks that can be contained in the internal queue before backpressure is applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy/highWaterMark)
     */
    val highWaterMark: Double

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy/size)
    val size: (chunk: Any? /* use undefined for default */) -> Double
}
