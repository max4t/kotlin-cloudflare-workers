// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ResponsesOutput {
    var id: String?
    var created_at: Double?
    var output_text: String?
    var error: ResponseError?
    var incomplete_details: ResponseIncompleteDetails?
    var instructions: Any? // string | Array<ResponseInputItem> | null
    var `object`: String /* "response" */?
    var output: js.array.ReadonlyArray<ResponseOutputItem>?
    var parallel_tool_calls: Boolean?
    var temperature: Double?
    var tool_choice: (Any /* ToolChoiceOptions | ToolChoiceFunction */)?
    var tools: js.array.ReadonlyArray<Tool>?
    var top_p: Double?
    var max_output_tokens: Double?
    var previous_response_id: String?
    var prompt: ResponsePrompt?
    var reasoning: Reasoning?
    var safety_identifier: String?
    var service_tier: ResponsesOutputService_tier?
    var status: ResponseStatus?
    var text: ResponseTextConfig?
    var truncation: ResponsesOutputTruncation?
    var usage: ResponseUsage?
}
