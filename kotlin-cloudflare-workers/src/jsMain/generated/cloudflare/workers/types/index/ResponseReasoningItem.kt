// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponseReasoningItem {
    var id: String
    var summary: js.array.ReadonlyArray<ResponseReasoningSummaryItem>
    var type: String // "reasoning"
    var content: js.array.ReadonlyArray<ResponseReasoningContentItem>?
    var encrypted_content: String?
    var status: (ResponseReasoningItemStatus)?
}
