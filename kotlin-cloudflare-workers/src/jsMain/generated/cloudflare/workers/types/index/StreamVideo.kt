// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamVideo {
/**
     * The unique identifier for the video.
     */
    var id: String

/**
     * A user-defined identifier for the media creator.
     */
    var creator: String?

/**
     * The thumbnail URL for the video.
     */
    var thumbnail: String

/**
     * The thumbnail timestamp percentage.
     */
    var thumbnailTimestampPct: Double

/**
     * Indicates whether the video is ready to stream.
     */
    var readyToStream: Boolean

/**
     * The date and time the video became ready to stream.
     */
    var readyToStreamAt: String?

/**
     * Processing status information.
     */
    var status: StreamVideoStatus

/**
     * A user modifiable key-value store.
     */
    var meta: js.objects.ReadonlyRecord<String, String>

/**
     * The date and time the video was created.
     */
    var created: String

/**
     * The date and time the video was last modified.
     */
    var modified: String

/**
     * The date and time at which the video will be deleted.
     */
    var scheduledDeletion: String?

/**
     * The size of the video in bytes.
     */
    var size: Double

/**
     * The preview URL for the video.
     */
    var preview: String?

/**
     * Origins allowed to display the video.
     */
    var allowedOrigins: js.array.ReadonlyArray<String>

/**
     * Indicates whether signed URLs are required.
     */
    var requireSignedURLs: Boolean?

/**
     * The date and time the video was uploaded.
     */
    var uploaded: String?

/**
     * The date and time when the upload URL expires.
     */
    var uploadExpiry: String?

/**
     * The maximum size in bytes for direct uploads.
     */
    var maxSizeBytes: Double?

/**
     * The maximum duration in seconds for direct uploads.
     */
    var maxDurationSeconds: Double?

/**
     * The video duration in seconds. -1 indicates unknown.
     */
    var duration: Double

/**
     * Input metadata for the original upload.
     */
    var input: StreamVideoInput

/**
     * Playback URLs for the video.
     */
    var hlsPlaybackUrl: String
    var dashPlaybackUrl: String

/**
     * The watermark applied to the video, if any.
     */
    var watermark: StreamWatermark?

/**
     * The live input id associated with the video, if any.
     */
    var liveInputId: String?

/**
     * The source video id if this is a clip.
     */
    var clippedFromId: String?

/**
     * Public details associated with the video.
     */
    var publicDetails: StreamPublicDetails?
}
