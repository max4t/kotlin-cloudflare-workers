// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponseFunctionToolCall {
    var arguments: String
    var call_id: String
    var name: String
    var type: String // "function_call"
    var id: String?
    var status: (ResponseFunctionToolCallStatus)?
}
