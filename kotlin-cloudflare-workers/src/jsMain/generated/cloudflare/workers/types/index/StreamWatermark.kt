// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamWatermark {
/**
     * The unique identifier for a watermark profile.
     */
    var id: String

/**
     * The size of the image in bytes.
     */
    var size: Double

/**
     * The height of the image in pixels.
     */
    var height: Double

/**
     * The width of the image in pixels.
     */
    var width: Double

/**
     * The date and a time a watermark profile was created.
     */
    var created: String

/**
     * The source URL for a downloaded image. If the watermark profile was created via
     * direct upload, this field is null.
     */
    var downloadedFrom: String?

/**
     * A short description of the watermark profile.
     */
    var name: String

/**
     * The translucency of the image. A value of `0.0` makes the image completely
     * transparent, and `1.0` makes the image completely opaque. Note that if the image
     * is already semi-transparent, setting this to `1.0` will not make the image
     * completely opaque.
     */
    var opacity: Double

/**
     * The whitespace between the adjacent edges (determined by position) of the video
     * and the image. `0.0` indicates no padding, and `1.0` indicates a fully padded
     * video width or length, as determined by the algorithm.
     */
    var padding: Double

/**
     * The size of the image relative to the overall size of the video. This parameter
     * will adapt to horizontal and vertical videos automatically. `0.0` indicates no
     * scaling (use the size of the image as-is), and `1.0 `fills the entire video.
     */
    var scale: Double

/**
     * The location of the image. Valid positions are: `upperRight`, `upperLeft`,
     * `lowerLeft`, `lowerRight`, and `center`. Note that `center` ignores the
     * `padding` parameter.
     */
    var position: StreamWatermarkPosition
}
