// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface AssistantMessage {
    var role: String // "assistant"
    var content: Any? // string | null | Array<AssistantMessageContentPart>
    var refusal: String?
    var name: String?
    var audio: (AssistantMessageAudio)?
    var tool_calls: js.array.ReadonlyArray<ChatCompletionMessageToolCall>?
    var function_call: (AssistantMessageFunction_call)?
}
