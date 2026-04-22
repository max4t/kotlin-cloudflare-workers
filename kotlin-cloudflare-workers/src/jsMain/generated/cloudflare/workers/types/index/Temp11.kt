// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Temp11 {
/** Keyword match score (0-1) */
    var keyword_score: Double?

/** Vector similarity score (0-1) */
    var vector_score: Double?

/** Keyword rank position */
    var keyword_rank: Double?

/** Vector rank position */
    var vector_rank: Double?

/** Reranking model score */
    var reranking_score: Double?

/** Fusion method used to combine results */
    var fusion_method: (Temp12)?

    operator fun get(key: String): Any?

    operator fun set(
        key: String,
        value: Any?,
    )
}
