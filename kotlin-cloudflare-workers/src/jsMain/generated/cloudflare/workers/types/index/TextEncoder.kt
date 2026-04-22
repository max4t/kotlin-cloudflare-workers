// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * The **`TextEncoder`** interface takes a stream of code points as input and emits a stream of UTF-8 bytes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder)
 */
external class TextEncoder {
    constructor ()

/**
     * The **`TextEncoder.encode()`** method takes a string as input, and returns a Global_Objects/Uint8Array containing the text given in parameters encoded with the specific method for that TextEncoder object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/encode)
     */
    fun encode(input: String = definedExternally): js.typedarrays.Uint8Array

/**
     * The **`TextEncoder.encodeInto()`** method takes a string to encode and a destination Uint8Array to put resulting UTF-8 encoded text into, and returns a dictionary object indicating the progress of the encoding.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/encodeInto)
     */
    fun encodeInto(
        input: String,
        buffer: js.typedarrays.Uint8Array,
    ): web.encoding.TextEncoderEncodeIntoResult

    val encoding: String
}
