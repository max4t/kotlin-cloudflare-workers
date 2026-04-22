// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Handle for a single repository. Returned by Artifacts.get(). */
external interface ArtifactsRepo : ArtifactsRepoInfo {
/**
     * Create an access token for this repo.
     * @param scope Token scope: "write" (default) or "read".
     * @param ttl Time-to-live in seconds (default 86400, min 60, max 31536000).
     */
    fun createToken(
        scope: ArtifactsRepoCreateTokenScope = definedExternally,
        ttl: Double = definedExternally,
    ): js.promise.Promise<ArtifactsCreateTokenResult>

/** List tokens for this repo (metadata only, no plaintext). */
    fun listTokens(): js.promise.Promise<ArtifactsTokenListResult>

/**
     * Revoke a token by plaintext or ID.
     * @param tokenOrId Plaintext token or token ID.
     * @returns true if revoked, false if not found.
     */
    fun revokeToken(tokenOrId: String): js.promise.Promise<Boolean>
// ── Fork ──

/**
     * Fork this repo to a new repo.
     * @param name Target repository name.
     * @param opts Optional: description, readOnly flag, defaultBranchOnly (default true).
     */
    fun fork(
        name: String,
        opts: ArtifactsRepoForkOpts = definedExternally,
    ): js.promise.Promise<ArtifactsCreateRepoResult>
}
