// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

/**
 * @deprecated Use the standalone AI Search Workers binding instead.
 * See https://developers.cloudflare.com/ai-search/usage/workers-binding/
 */
abstract external class AutoRAG {
/**
     * @deprecated Use the standalone AI Search Workers binding instead.
     * See https://developers.cloudflare.com/ai-search/usage/workers-binding/
     */
    fun list(): js.promise.Promise<AutoRagListResponse>

/**
     * @deprecated Use the standalone AI Search Workers binding instead.
     * See https://developers.cloudflare.com/ai-search/usage/workers-binding/
     */
    fun search(params: AutoRagSearchRequest): js.promise.Promise<AutoRagSearchResponse>

/**
     * @deprecated Use the standalone AI Search Workers binding instead.
     * See https://developers.cloudflare.com/ai-search/usage/workers-binding/
     */
    fun aiSearch(params: AutoRagAiSearchRequestStreaming): js.promise.Promise<web.http.Response>

/**
     * @deprecated Use the standalone AI Search Workers binding instead.
     * See https://developers.cloudflare.com/ai-search/usage/workers-binding/
     */
    fun aiSearch(params: AutoRagAiSearchRequest): js.promise.Promise<Any /* AutoRagAiSearchResponse | Response */>
}
