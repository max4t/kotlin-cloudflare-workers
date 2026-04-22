// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponseTextDoneEvent {
    var content_index: Double
    var item_id: String
    var logprobs: js.array.ReadonlyArray<Logprob>
    var output_index: Double
    var sequence_number: Double
    var text: String
    var type: String // "response.output_text.done"
}
