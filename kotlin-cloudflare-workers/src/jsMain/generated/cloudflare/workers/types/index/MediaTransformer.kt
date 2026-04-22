// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Media transformer for applying transformation operations to media content.
 * Handles sizing, fitting, and other input transformation parameters.
 */
external interface MediaTransformer {
/**
     * Applies transformation options to the media content.
     * @param transform - Configuration for how the media should be transformed
     * @returns A generator for producing the transformed media output
     */
    fun transform(transform: MediaTransformationInputOptions = definedExternally): MediaTransformationGenerator

/**
     * Generates the final media output with specified options.
     * @param output - Configuration for the output format and parameters
     * @returns The final transformation result containing the transformed media
     */
    fun output(output: MediaTransformationOutputOptions = definedExternally): MediaTransformationResult
}
