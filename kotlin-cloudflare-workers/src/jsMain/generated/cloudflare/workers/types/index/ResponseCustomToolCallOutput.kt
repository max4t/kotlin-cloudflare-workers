// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponseCustomToolCallOutput {
    var call_id: String
    var output: Any // string | Array<ResponseInputText | ResponseInputImage>
    var type: String // "custom_tool_call_output"
    var id: String?
}
