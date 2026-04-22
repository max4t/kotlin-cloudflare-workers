// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Result of a media transformation operation.
 * Provides multiple ways to access the transformed media content.
 */
external interface MediaTransformationResult {
/**
     * Returns the transformed media as a readable stream of bytes.
     * @returns A promise containing a readable stream with the transformed media
     */
    fun media(): js.promise.Promise<web.streams.ReadableStream<js.typedarrays.Uint8Array>>

/**
     * Returns the transformed media as an HTTP response object.
     * @returns The transformed media as a Promise<Response>, ready to store in cache or return to users
     */
    fun response(): js.promise.Promise<web.http.Response>

/**
     * Returns the MIME type of the transformed media.
     * @returns A promise containing the content type string (e.g., 'image/jpeg', 'video/mp4')
     */
    fun contentType(): js.promise.Promise<String>
}
