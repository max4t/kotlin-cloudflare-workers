// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamDirectUploadCreateParams {
/**
     * The maximum duration in seconds for a video upload.
     */
    var maxDurationSeconds: Double

/**
     * The date and time after upload when videos will not be accepted.
     */
    var expiry: String?

/**
     * A user-defined identifier for the media creator.
     */
    var creator: String?

/**
     * A user modifiable key-value store used to reference other systems of record for
     * managing videos.
     */
    var meta: js.objects.ReadonlyRecord<String, String>?

/**
     * Lists the origins allowed to display the video.
     */
    var allowedOrigins: js.array.ReadonlyArray<String>?

/**
     * Indicates whether the video can be accessed using the id. When set to `true`,
     * a signed token must be generated with a signing key to view the video.
     */
    var requireSignedURLs: Boolean?

/**
     * The thumbnail timestamp percentage.
     */
    var thumbnailTimestampPct: Double?

/**
     * The date and time at which the video will be deleted. Include `null` to remove
     * a scheduled deletion.
     */
    var scheduledDeletion: String?

/**
     * The watermark profile to apply.
     */
    var watermark: StreamDirectUploadWatermark?
}
