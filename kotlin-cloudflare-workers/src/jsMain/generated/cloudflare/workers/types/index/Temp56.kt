// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Temp56 {
/**
     * The starting time of the segment within the audio, in seconds.
     */
    var start: Double?

/**
     * The ending time of the segment within the audio, in seconds.
     */
    var end: Double?

/**
     * The transcription of the segment.
     */
    var text: String?

/**
     * The temperature used in the decoding process, controlling randomness in predictions. Lower values result in more deterministic outputs.
     */
    var temperature: Double?

/**
     * The average log probability of the predictions for the words in this segment, indicating overall confidence.
     */
    var avg_logprob: Double?

/**
     * The compression ratio of the input to the output, measuring how much the text was compressed during the transcription process.
     */
    var compression_ratio: Double?

/**
     * The probability that the segment contains no speech, represented as a decimal between 0 and 1.
     */
    var no_speech_prob: Double?
    var words: js.array.ReadonlyArray<Temp57>?
}
