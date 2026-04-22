// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponseInputItemFunctionCallOutput {
    var call_id: String
    var output: Any // string | ResponseFunctionCallOutputItemList
    var type: String // "function_call_output"
    var id: String?
    var status: ResponseInputItemFunctionCallOutputStatus?
}
