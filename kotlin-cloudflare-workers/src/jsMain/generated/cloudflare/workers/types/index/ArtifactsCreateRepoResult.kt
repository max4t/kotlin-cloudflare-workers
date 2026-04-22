// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Result of creating a repository — includes the initial access token. */
external interface ArtifactsCreateRepoResult {
/** Unique repository ID. */
    var id: String

/** Repository name. */
    var name: String

/** Repository description, or null if not set. */
    var description: String?

/** Default branch name. */
    var defaultBranch: String

/** HTTPS git remote URL. */
    var remote: String

/** Plaintext access token (only returned at creation time). */
    var token: String

/** ISO 8601 token expiry timestamp. */
    var tokenExpiresAt: String
}
