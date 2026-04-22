// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`TextDecoder`** interface represents a decoder for a specific text encoding, such as `UTF-8`, `ISO-8859-2`, `KOI8-R`, `GBK`, etc.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder)
 */
external class TextDecoder {
    constructor (label: String = definedExternally, options: TextDecoderConstructorOptions = definedExternally)

/**
     * The **`TextDecoder.decode()`** method returns a string containing text decoded from the buffer passed as a parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/decode)
     */
    fun decode(): String

/**
     * The **`TextDecoder.decode()`** method returns a string containing text decoded from the buffer passed as a parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/decode)
     */
    fun decode(
        input: js.buffer.ArrayBuffer = definedExternally,
        options: TextDecoderDecodeOptions = definedExternally,
    ): String

/**
     * The **`TextDecoder.decode()`** method returns a string containing text decoded from the buffer passed as a parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/decode)
     */
    fun decode(
        input: js.buffer.ArrayBufferView = definedExternally,
        options: TextDecoderDecodeOptions = definedExternally,
    ): String

    val encoding: String
    val fatal: Boolean
    val ignoreBOM: Boolean
}
