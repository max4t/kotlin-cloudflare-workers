// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponseFunctionToolCallOutputItem {
    var id: String
    var call_id: String
    var output: Any // string | Array<ResponseInputText | ResponseInputImage>
    var type: String // "function_call_output"
    var status: (ResponseFunctionToolCallOutputItemStatus)?
}
