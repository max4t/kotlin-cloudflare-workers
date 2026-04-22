// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Shared optional properties used by both Prompt and Messages input branches. */
external interface ChatCompletionsCommonOptions {
    var model: String?
    var audio: AudioParams?
    var frequency_penalty: Double?
    var logit_bias: js.objects.ReadonlyRecord<String, Any?>?
    var logprobs: Boolean?
    var top_logprobs: Double?
    var max_tokens: Double?
    var max_completion_tokens: Double?
    var metadata: js.objects.ReadonlyRecord<String, Any?>?
    var modalities: js.array.ReadonlyArray<Temp51>?
    var n: Double?
    var parallel_tool_calls: Boolean?
    var prediction: PredictionContent?
    var presence_penalty: Double?
    var reasoning_effort: ChatCompletionsCommonOptionsReasoning_effort?
    var chat_template_kwargs: ChatTemplateKwargs?
    var response_format: ResponseFormat?
    var seed: Double?
    var service_tier: ChatCompletionsCommonOptionsService_tier?
    var stop: Any? // string | Array<string> | null
    var store: Boolean?
    var stream: Boolean?
    var stream_options: ChatCompletionsStreamOptions?
    var temperature: Double?
    var tool_choice: ChatCompletionToolChoiceOption?
    var tools: js.array.ReadonlyArray<ChatCompletionTool>?
    var top_p: Double?
    var user: String?
    var web_search_options: WebSearchOptions?
    var function_call: (
        Any /* "none" | "auto" | {
    name: string;
} */
    )?
    var functions: js.array.ReadonlyArray<FunctionDefinition>?
}
