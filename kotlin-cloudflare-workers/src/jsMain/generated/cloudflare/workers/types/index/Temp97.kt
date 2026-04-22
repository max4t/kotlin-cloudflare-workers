// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Temp97 {
/**
     * Index of the choice in the list
     */
    var index: Double

/**
     * The generated text completion
     */
    var text: String

/**
     * Reason why the model stopped generating
     */
    var finish_reason: String

/**
     * Stop reason (may be null)
     */
    var stop_reason: String?

/**
     * Log probabilities (if requested)
     */
    var logprobs: (Any)?

/**
     * Log probabilities for the prompt (if requested)
     */
    var prompt_logprobs: (Any)?
}
