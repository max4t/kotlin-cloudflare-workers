// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ChatCompletionsOutput {
    var id: String
    var `object`: String
    var created: Double
    var model: String
    var choices: js.array.ReadonlyArray<ChatCompletionChoice>
    var usage: CompletionUsage?
    var system_fingerprint: String?
    var service_tier: ChatCompletionsOutputService_tier?
}
