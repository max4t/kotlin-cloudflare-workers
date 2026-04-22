// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ChatCompletionResponseMessage {
    var role: String // "assistant"
    var content: String?
    var refusal: String?
    var annotations: js.array.ReadonlyArray<ChatCompletionUrlCitation>?
    var audio: ChatCompletionAudio?
    var tool_calls: js.array.ReadonlyArray<ChatCompletionMessageToolCall>?
    var function_call: (Temp52)?
}
