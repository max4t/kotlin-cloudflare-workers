// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface StreamVideosListParams {
/**
     * The maximum number of videos to return.
     */
    var limit: Double?

/**
     * Return videos created before this timestamp.
     * (RFC3339/RFC3339Nano)
     */
    var before: String?

/**
     * Comparison operator for the `before` field.
     * @default 'lt'
     */
    var beforeComp: StreamPaginationComparison?

/**
     * Return videos created after this timestamp.
     * (RFC3339/RFC3339Nano)
     */
    var after: String?

/**
     * Comparison operator for the `after` field.
     * @default 'gte'
     */
    var afterComp: StreamPaginationComparison?
}
