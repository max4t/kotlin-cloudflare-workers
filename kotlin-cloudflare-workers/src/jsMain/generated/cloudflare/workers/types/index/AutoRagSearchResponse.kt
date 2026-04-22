// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * @deprecated Use the standalone AI Search Workers binding instead.
 * See https://developers.cloudflare.com/ai-search/usage/workers-binding/
 */
external interface AutoRagSearchResponse {
    var `object`: String // "vector_store.search_results.page"
    var search_query: String
    var data: js.array.ReadonlyArray<Temp120>
    var has_more: Boolean
    var next_page: String?
}
