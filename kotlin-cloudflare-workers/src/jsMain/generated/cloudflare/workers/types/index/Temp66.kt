// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Temp66 {
/**
     * User-supplied reference. This field will be present in the response as well it can be used to reference the request and response. It's NOT validated to be unique.
     */
    var external_reference: String?

/**
     * Prompt for the text generation model
     */
    var prompt: String?

/**
     * If true, the response will be streamed back incrementally using SSE, Server Sent Events.
     */
    var stream: Boolean?

/**
     * The maximum number of tokens to generate in the response.
     */
    var max_tokens: Double?

/**
     * Controls the randomness of the output; higher values produce more random results.
     */
    var temperature: Double?

/**
     * Adjusts the creativity of the AI's responses by controlling how many possible words it considers. Lower values make outputs more predictable; higher values allow for more varied and creative responses.
     */
    var top_p: Double?

/**
     * Random seed for reproducibility of the generation.
     */
    var seed: Double?

/**
     * Penalty for repeated tokens; higher values discourage repetition.
     */
    var repetition_penalty: Double?

/**
     * Decreases the likelihood of the model repeating the same lines verbatim.
     */
    var frequency_penalty: Double?

/**
     * Increases the likelihood of the model introducing new topics.
     */
    var presence_penalty: Double?
    var response_format: Ai_Cf_Meta_Llama_3_3_70B_Instruct_Fp8_Fast_JSON_Mode_2?
}
