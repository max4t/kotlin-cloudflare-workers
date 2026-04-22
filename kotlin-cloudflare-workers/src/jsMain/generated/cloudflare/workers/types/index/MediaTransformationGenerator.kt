// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Generator for producing media transformation results.
 * Configures the output format and parameters for the transformed media.
 */
external interface MediaTransformationGenerator {
/**
     * Generates the final media output with specified options.
     * @param output - Configuration for the output format and parameters
     * @returns The final transformation result containing the transformed media
     */
    fun output(output: MediaTransformationOutputOptions = definedExternally): MediaTransformationResult
}
