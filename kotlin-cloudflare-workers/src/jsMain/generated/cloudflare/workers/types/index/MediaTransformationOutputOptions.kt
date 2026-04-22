// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Configuration options for Media Transformations output.
 * Controls the format, timing, and type of the generated output.
 */
external interface MediaTransformationOutputOptions {
/**
     * Output mode determining the type of media to generate
     */
    var mode: (MediaTransformationOutputOptionsMode)?

/** Whether to include audio in the output */
    var audio: Boolean?

/**
     * Starting timestamp for frame extraction or start time for clips. (e.g. '2s').
     */
    var time: String?

/**
     * Duration for video clips, audio extraction, and spritesheet generation (e.g. '5s').
     */
    var duration: String?

/**
     * Number of frames in the spritesheet.
     */
    var imageCount: Double?

/**
     * Output format for the generated media.
     */
    var format: (MediaTransformationOutputOptionsFormat)?
}
