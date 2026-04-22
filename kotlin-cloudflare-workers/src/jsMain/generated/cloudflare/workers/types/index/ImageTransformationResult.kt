// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ImageTransformationResult {
/**
     * The image as a response, ready to store in cache or return to users
     */
    fun response(): web.http.Response

/**
     * The content type of the returned image
     */
    fun contentType(): String

/**
     * The bytes of the response
     */
    fun image(options: ImageTransformationOutputOptions = definedExternally): web.streams.ReadableStream<js.typedarrays.Uint8Array>
}
