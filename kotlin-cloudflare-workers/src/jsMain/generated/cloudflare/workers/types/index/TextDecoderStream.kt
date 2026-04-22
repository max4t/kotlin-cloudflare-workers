// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`TextDecoderStream`** interface of the Encoding API converts a stream of text in a binary encoding, such as UTF-8 etc., to a stream of strings.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream)
 */
external class TextDecoderStream : web.streams.TransformStream<Any /* ArrayBuffer | ArrayBufferView */, String> {
    constructor (label: String = definedExternally, options: TextDecoderStreamTextDecoderStreamInit = definedExternally)

    val encoding: String
    val fatal: Boolean
    val ignoreBOM: Boolean
}
