// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Result of creating an access token. */
external interface ArtifactsCreateTokenResult {
/** Unique token ID. */
    var id: String

/** Plaintext token (only returned at creation time). */
    var plaintext: String

/** Token scope: "read" or "write". */
    var scope: ArtifactsCreateTokenResultScope

/** ISO 8601 token expiry timestamp. */
    var expiresAt: String
}
