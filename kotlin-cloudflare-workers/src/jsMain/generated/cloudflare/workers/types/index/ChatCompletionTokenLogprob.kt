// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ChatCompletionTokenLogprob {
    var token: String
    var logprob: Double
    var bytes: js.array.ReadonlyArray<Double>?
    var top_logprobs: js.array.ReadonlyArray<ChatCompletionTopLogprob>
}
