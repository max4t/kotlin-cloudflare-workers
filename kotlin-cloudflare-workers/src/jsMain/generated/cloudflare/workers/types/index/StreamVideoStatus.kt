// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamVideoStatus {
/**
     * The current processing state.
     */
    var state: String

/**
     * The current processing step.
     */
    var step: String?

/**
     * The percent complete as a string.
     */
    var pctComplete: String?

/**
     * An error reason code, if applicable.
     */
    var errorReasonCode: String

/**
     * An error reason text, if applicable.
     */
    var errorReasonText: String
}
