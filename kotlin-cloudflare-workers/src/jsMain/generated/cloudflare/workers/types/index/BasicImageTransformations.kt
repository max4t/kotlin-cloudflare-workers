// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface BasicImageTransformations {
/**
     * Maximum width in image pixels. The value must be an integer.
     */
    var width: Double?

/**
     * Maximum height in image pixels. The value must be an integer.
     */
    var height: Double?

/**
     * Resizing mode as a string. It affects interpretation of width and height
     * options:
     *  - scale-down: Similar to contain, but the image is never enlarged. If
     *    the image is larger than given width or height, it will be resized.
     *    Otherwise its original size will be kept.
     *  - contain: Resizes to maximum size that fits within the given width and
     *    height. If only a single dimension is given (e.g. only width), the
     *    image will be shrunk or enlarged to exactly match that dimension.
     *    Aspect ratio is always preserved.
     *  - cover: Resizes (shrinks or enlarges) to fill the entire area of width
     *    and height. If the image has an aspect ratio different from the ratio
     *    of width and height, it will be cropped to fit.
     *  - crop: The image will be shrunk and cropped to fit within the area
     *    specified by width and height. The image will not be enlarged. For images
     *    smaller than the given dimensions it's the same as scale-down. For
     *    images larger than the given dimensions, it's the same as cover.
     *    See also trim.
     *  - pad: Resizes to the maximum size that fits within the given width and
     *    height, and then fills the remaining area with a background color
     *    (white by default). Use of this mode is not recommended, as the same
     *    effect can be more efficiently achieved with the contain mode and the
     *    CSS object-fit: contain property.
     *  - squeeze: Stretches and deforms to the width and height given, even if it
     *    breaks aspect ratio
     */
    var fit: (BasicImageTransformationsFit)?

/**
     * Image segmentation using artificial intelligence models. Sets pixels not
     * within selected segment area to transparent e.g "foreground" sets every
     * background pixel as transparent.
     */
    var segment: String /* "foreground" */?

/**
     * When cropping with fit: "cover", this defines the side or point that should
     * be left uncropped. The value is either a string
     * "left", "right", "top", "bottom", "auto", or "center" (the default),
     * or an object {x, y} containing focal point coordinates in the original
     * image expressed as fractions ranging from 0.0 (top or left) to 1.0
     * (bottom or right), 0.5 being the center. {fit: "cover", gravity: "top"} will
     * crop bottom or left and right sides as necessary, but won’t crop anything
     * from the top. {fit: "cover", gravity: {x:0.5, y:0.2}} will crop each side to
     * preserve as much as possible around a point at 20% of the height of the
     * source image.
     */
    var gravity:
        (Any /* "face" | "left" | "right" | "top" | "bottom" | "center" | "auto" | "entropy" | BasicImageTransformationsGravityCoordinates */)?

/**
     * Background color to add underneath the image. Applies only to images with
     * transparency (such as PNG). Accepts any CSS color (#RRGGBB, rgba(…),
     * hsl(…), etc.)
     */
    var background: String?

/**
     * Number of degrees (90, 180, 270) to rotate the image by. width and height
     * options refer to axes after rotation.
     */
    var rotate: (BasicImageTransformationsRotate)?
}
