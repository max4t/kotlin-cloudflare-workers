// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamDirectUpload {
/**
     * The URL an unauthenticated upload can use for a single multipart request.
     */
    var uploadURL: String

/**
     * A Cloudflare-generated unique identifier for a media item.
     */
    var id: String

/**
     * The watermark profile applied to the upload.
     */
    var watermark: StreamWatermark?

/**
     * The scheduled deletion time, if any.
     */
    var scheduledDeletion: String?
}
