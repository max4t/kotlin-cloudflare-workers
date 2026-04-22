// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponseTextDeltaEvent {
    var content_index: Double
    var delta: String
    var item_id: String
    var logprobs: js.array.ReadonlyArray<Logprob>
    var output_index: Double
    var sequence_number: Double
    var type: String // "response.output_text.delta"
}
