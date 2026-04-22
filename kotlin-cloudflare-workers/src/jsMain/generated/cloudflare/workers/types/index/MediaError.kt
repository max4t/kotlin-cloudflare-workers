// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Error object for media transformation operations.
 * Extends the standard Error interface with additional media-specific information.
 */
external interface MediaError : js.errors.JsError {
/**
     * The read-only property **`MediaError.code`** returns a numeric value which represents the kind of error that occurred on a media element. To get a text string with specific diagnostic information, see MediaError.message.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/code)
     */
    val code: Double

/**
     * The read-only property **`MediaError.message`** returns a human-readable string offering specific diagnostic details related to the error described by the MediaError object, or an empty string ("") if no diagnostic information can be determined or provided.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/message)
     */
    val message: String
    val MEDIA_ERR_ABORTED: Double // 1
    val MEDIA_ERR_NETWORK: Double // 2
    val MEDIA_ERR_DECODE: Double // 3
    val MEDIA_ERR_SRC_NOT_SUPPORTED: Double // 4
    val stack: String?
}
