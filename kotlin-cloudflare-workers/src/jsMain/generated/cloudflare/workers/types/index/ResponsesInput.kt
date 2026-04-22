// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * Workers AI support for OpenAI's Responses API
 * Reference: https://github.com/openai/openai-node/blob/master/src/resources/responses/responses.ts
 *
 * It's a stripped down version from its source.
 * It currently supports basic function calling, json mode and accepts images as input.
 *
 * It does not include types for WebSearch, CodeInterpreter, FileInputs, MCP, CustomTools.
 * We plan to add those incrementally as model + platform capabilities evolve.
 */
external interface ResponsesInput {
    var background: Boolean?
    var conversation: Any? // string | ResponseConversationParam | null
    var include: js.array.ReadonlyArray<ResponseIncludable>?
    var input: (Any /* string | ResponseInput */)?
    var instructions: String?
    var max_output_tokens: Double?
    var parallel_tool_calls: Boolean?
    var previous_response_id: String?
    var prompt_cache_key: String?
    var reasoning: Reasoning?
    var safety_identifier: String?
    var service_tier: ResponsesInputService_tier?
    var stream: Boolean?
    var stream_options: StreamOptions?
    var temperature: Double?
    var text: ResponseTextConfig?
    var tool_choice: (Any /* ToolChoiceOptions | ToolChoiceFunction */)?
    var tools: js.array.ReadonlyArray<Tool>?
    var top_p: Double?
    var truncation: ResponsesInputTruncation?
}
