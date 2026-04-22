// Automatically generated - do not modify!

package cloudflare.workers.types.index

/**
 * @deprecated Use the standalone AI Search Workers binding instead.
 * See https://developers.cloudflare.com/ai-search/usage/workers-binding/
 */
external interface AutoRagSearchRequest {
    var query: String
    var filters: (Any /* CompoundFilter | ComparisonFilter */)?
    var max_num_results: Double?
    var ranking_options: (AutoRagSearchRequestRanking_options)?
    var reranking: (AutoRagSearchRequestReranking)?
    var rewrite_query: Boolean?
}
