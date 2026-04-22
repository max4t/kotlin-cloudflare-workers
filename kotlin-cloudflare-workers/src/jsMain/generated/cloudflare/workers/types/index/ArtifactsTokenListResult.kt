// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Paginated list of tokens for a repository. */
external interface ArtifactsTokenListResult {
/** Tokens in this page. */
    var tokens: js.array.ReadonlyArray<ArtifactsTokenInfo>

/** Total number of tokens for the repository. */
    var total: Double
}
