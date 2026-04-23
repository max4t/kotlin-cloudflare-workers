// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface RateLimit {
/**
     * Rate limit a request based on the provided options.
     * @see https://developers.cloudflare.com/workers/runtime-apis/bindings/rate-limit/
     * @returns A promise that resolves with the outcome of the rate limit.
     */
    @JsName("limit")
    fun limitAsync(options: RateLimitOptions): js.promise.Promise<RateLimitOutcome>

    @seskar.js.JsAsync
    suspend fun limit(options: RateLimitOptions): RateLimitOutcome
}
