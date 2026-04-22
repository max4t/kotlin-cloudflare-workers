// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface RequestInitCfPropertiesImage : BasicImageTransformations {
/**
     * Device Pixel Ratio. Default 1. Multiplier for width/height that makes it
     * easier to specify higher-DPI sizes in <img srcset>.
     */
    var dpr: Double?

/**
     * Allows you to trim your image. Takes dpr into account and is performed before
     * resizing or rotation.
     *
     * It can be used as:
     * - left, top, right, bottom - it will specify the number of pixels to cut
     *   off each side
     * - width, height - the width/height you'd like to end up with - can be used
     *   in combination with the properties above
     * - border - this will automatically trim the surroundings of an image based on
     *   it's color. It consists of three properties:
     *    - color: rgb or hex representation of the color you wish to trim (todo: verify the rgba bit)
     *    - tolerance: difference from color to treat as color
     *    - keep: the number of pixels of border to keep
     */
    var trim:
        (
            Any /* "border" | {
    top?: number;
    bottom?: number;
    left?: number;
    right?: number;
    width?: number;
    height?: number;
    border?: boolean | {
        color?: string;
        tolerance?: number;
        keep?: number;
    };
} */
        )?

/**
     * Quality setting from 1-100 (useful values are in 60-90 range). Lower values
     * make images look worse, but load faster. The default is 85. It applies only
     * to JPEG and WebP images. It doesn’t have any effect on PNG.
     */
    var quality: (Any /* number | "low" | "medium-low" | "medium-high" | "high" */)?

/**
     * Output format to generate. It can be:
     *  - avif: generate images in AVIF format.
     *  - webp: generate images in Google WebP format. Set quality to 100 to get
     *    the WebP-lossless format.
     *  - json: instead of generating an image, outputs information about the
     *    image, in JSON format. The JSON object will contain image size
     *    (before and after resizing), source image’s MIME type, file size, etc.
     * - jpeg: generate images in JPEG format.
     * - png: generate images in PNG format.
     */
    var format: (RequestInitCfPropertiesImageFormat)?

/**
     * Whether to preserve animation frames from input files. Default is true.
     * Setting it to false reduces animations to still images. This setting is
     * recommended when enlarging images or processing arbitrary user content,
     * because large GIF animations can weigh tens or even hundreds of megabytes.
     * It is also useful to set anim:false when using format:"json" to get the
     * response quicker without the number of frames.
     */
    var anim: Boolean?

/**
     * What EXIF data should be preserved in the output image. Note that EXIF
     * rotation and embedded color profiles are always applied ("baked in" into
     * the image), and aren't affected by this option. Note that if the Polish
     * feature is enabled, all metadata may have been removed already and this
     * option may have no effect.
     *  - keep: Preserve most of EXIF metadata, including GPS location if there's
     *    any.
     *  - copyright: Only keep the copyright tag, and discard everything else.
     *    This is the default behavior for JPEG files.
     *  - none: Discard all invisible EXIF metadata. Currently WebP and PNG
     *    output formats always discard metadata.
     */
    var metadata: (RequestInitCfPropertiesImageMetadata)?

/**
     * Strength of sharpening filter to apply to the image. Floating-point
     * number between 0 (no sharpening, default) and 10 (maximum). 1.0 is a
     * recommended value for downscaled images.
     */
    var sharpen: Double?

/**
     * Radius of a blur filter (approximate gaussian). Maximum supported radius
     * is 250.
     */
    var blur: Double?

/**
     * Overlays are drawn in the order they appear in the array (last array
     * entry is the topmost layer).
     */
    var draw: js.array.ReadonlyArray<RequestInitCfPropertiesImageDraw>?

/**
     * Fetching image from authenticated origin. Setting this property will
     * pass authentication headers (Authorization, Cookie, etc.) through to
     * the origin.
     */
    @JsName("origin-auth")
    var originAuth: String /* "share-publicly" */?

/**
     * Adds a border around the image. The border is added after resizing. Border
     * width takes dpr into account, and can be specified either using a single
     * width property, or individually for each side.
     */
    var border:
        (
            Any /* {
    color: string;
    width: number;
} | {
    color: string;
    top: number;
    right: number;
    bottom: number;
    left: number;
} */
        )?

/**
     * Increase brightness by a factor. A value of 1.0 equals no change, a value
     * of 0.5 equals half brightness, and a value of 2.0 equals twice as bright.
     * 0 is ignored.
     */
    var brightness: Double?

/**
     * Increase contrast by a factor. A value of 1.0 equals no change, a value of
     * 0.5 equals low contrast, and a value of 2.0 equals high contrast. 0 is
     * ignored.
     */
    var contrast: Double?

/**
     * Increase exposure by a factor. A value of 1.0 equals no change, a value of
     * 0.5 darkens the image, and a value of 2.0 lightens the image. 0 is ignored.
     */
    var gamma: Double?

/**
     * Increase contrast by a factor. A value of 1.0 equals no change, a value of
     * 0.5 equals low contrast, and a value of 2.0 equals high contrast. 0 is
     * ignored.
     */
    var saturation: Double?

/**
     * Flips the images horizontally, vertically, or both. Flipping is applied before
     * rotation, so if you apply flip=h,rotate=90 then the image will be flipped
     * horizontally, then rotated by 90 degrees.
     */
    var flip: (RequestInitCfPropertiesImageFlip)?

/**
     * Slightly reduces latency on a cache miss by selecting a
     * quickest-to-compress file format, at a cost of increased file size and
     * lower image quality. It will usually override the format option and choose
     * JPEG over WebP or AVIF. We do not recommend using this option, except in
     * unusual circumstances like resizing uncacheable dynamically-generated
     * images.
     */
    var compression: String /* "fast" */?
}
