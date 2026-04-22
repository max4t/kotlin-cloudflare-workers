// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Configuration options for transforming media input.
 * Controls how the media should be resized and fitted.
 */
external interface MediaTransformationInputOptions {
/** How the media should be resized to fit the specified dimensions */
    var fit: (MediaTransformationInputOptionsFit)?

/** Target width in pixels */
    var width: Double?

/** Target height in pixels */
    var height: Double?
}
