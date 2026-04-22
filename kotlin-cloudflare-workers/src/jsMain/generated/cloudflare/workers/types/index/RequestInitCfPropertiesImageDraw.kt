// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface RequestInitCfPropertiesImageDraw : BasicImageTransformations {
/**
     * Absolute URL of the image file to use for the drawing. It can be any of
     * the supported file formats. For drawing of watermarks or non-rectangular
     * overlays we recommend using PNG or WebP images.
     */
    var url: String

/**
     * Floating-point number between 0 (transparent) and 1 (opaque).
     * For example, opacity: 0.5 makes overlay semitransparent.
     */
    var opacity: Double?

/**
     * - If set to true, the overlay image will be tiled to cover the entire
     *   area. This is useful for stock-photo-like watermarks.
     * - If set to "x", the overlay image will be tiled horizontally only
     *   (form a line).
     * - If set to "y", the overlay image will be tiled vertically only
     *   (form a line).
     */
    var repeat: (RequestInitCfPropertiesImageDrawRepeat)?

/**
     * Position of the overlay image relative to a given edge. Each property is
     * an offset in pixels. 0 aligns exactly to the edge. For example, left: 10
     * positions left side of the overlay 10 pixels from the left edge of the
     * image it's drawn over. bottom: 0 aligns bottom of the overlay with bottom
     * of the background image.
     *
     * Setting both left & right, or both top & bottom is an error.
     *
     * If no position is specified, the image will be centered.
     */
    var top: Double?
    var left: Double?
    var bottom: Double?
    var right: Double?
}
