// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Paginated list of repositories. */
external interface ArtifactsRepoListResult {
/** Repositories in this page (without the `remote` field). */
    var repos: js.array.ReadonlyArray<Omit<ArtifactsRepoInfo, String /* "remote" */>>

/** Total number of repositories in the namespace. */
    var total: Double

/** Cursor for the next page, if there are more results. */
    var cursor: String?
}
