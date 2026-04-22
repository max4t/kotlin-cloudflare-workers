// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Artifacts binding — namespace-level operations. */
external interface Artifacts {
/**
     * Create a new repository with an initial access token.
     * @param name Repository name (alphanumeric, dots, hyphens, underscores).
     * @param opts Optional: readOnly flag, description, default branch name.
     * @returns Repo metadata with initial token.
     */
    fun create(
        name: String,
        opts: ArtifactsCreateOpts = definedExternally,
    ): js.promise.Promise<ArtifactsCreateRepoResult>

/**
     * Get a handle to an existing repository.
     * @param name Repository name.
     * @returns Repo handle.
     */
    fun get(name: String): js.promise.Promise<ArtifactsRepo>

/**
     * Import a repository from an external git remote.
     * @param params Source URL and optional branch/depth, plus target name and options.
     * @returns Repo metadata with initial token.
     */
    fun import(params: ArtifactsImportParams): js.promise.Promise<ArtifactsCreateRepoResult>

/**
     * List repositories with cursor-based pagination.
     * @param opts Optional: limit (1–200, default 50), cursor for next page.
     */
    fun list(opts: ArtifactsListOpts = definedExternally): js.promise.Promise<ArtifactsRepoListResult>

/**
     * Delete a repository and all associated tokens.
     * @param name Repository name.
     * @returns true if deleted, false if not found.
     */
    fun delete(name: String): js.promise.Promise<Boolean>
}
