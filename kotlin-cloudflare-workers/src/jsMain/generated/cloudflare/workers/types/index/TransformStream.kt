// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`TransformStream`** interface of the Streams API represents a concrete implementation of the pipe chain _transform stream_ concept.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream)
 */
external class TransformStream<I /* default is Any? */, O /* default is Any? */> {
    constructor (
        transformer: web.streams.Transformer<I, O> = definedExternally,
        writableStrategy: web.streams.QueuingStrategy<I> = definedExternally,
        readableStrategy: web.streams.QueuingStrategy<O> = definedExternally,
    )

/**
     * The **`readable`** read-only property of the TransformStream interface returns the ReadableStream instance controlled by this `TransformStream`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/readable)
     */
    val readable: web.streams.ReadableStream<O>

/**
     * The **`writable`** read-only property of the TransformStream interface returns the WritableStream instance controlled by this `TransformStream`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/writable)
     */
    val writable: web.streams.WritableStream<I>
}
