// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamUrlUploadParams {
/**
     * Lists the origins allowed to display the video. Enter allowed origin
     * domains in an array and use `*` for wildcard subdomains. Empty arrays allow the
     * video to be viewed on any origin.
     */
    var allowedOrigins: js.array.ReadonlyArray<String>?

/**
     * A user-defined identifier for the media creator.
     */
    var creator: String?

/**
     * A user modifiable key-value store used to reference other systems of
     * record for managing videos.
     */
    var meta: js.objects.ReadonlyRecord<String, String>?

/**
     * Indicates whether the video can be a accessed using the id. When
     * set to `true`, a signed token must be generated with a signing key to view the
     * video.
     */
    var requireSignedURLs: Boolean?

/**
     * Indicates the date and time at which the video will be deleted. Omit
     * the field to indicate no change, or include with a `null` value to remove an
     * existing scheduled deletion. If specified, must be at least 30 days from upload
     * time.
     */
    var scheduledDeletion: String?

/**
     * The timestamp for a thumbnail image calculated as a percentage value
     * of the video's duration. To convert from a second-wise timestamp to a
     * percentage, divide the desired timestamp by the total duration of the video. If
     * this value is not set, the default thumbnail image is taken from 0s of the
     * video.
     */
    var thumbnailTimestampPct: Double?

/**
     * The identifier for the watermark profile
     */
    var watermarkId: String?
}
