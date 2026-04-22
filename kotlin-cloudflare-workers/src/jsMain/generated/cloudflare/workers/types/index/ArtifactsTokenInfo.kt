// Automatically generated - do not modify!

package cloudflare.workers.types.index

/** Token metadata (no plaintext). */
external interface ArtifactsTokenInfo {
/** Unique token ID. */
    var id: String

/** Token scope: "read" or "write". */
    var scope: ArtifactsTokenInfoScope

/** Token state: "active", "expired", or "revoked". */
    var state: ArtifactsTokenInfoState

/** ISO 8601 creation timestamp. */
    var createdAt: String

/** ISO 8601 expiry timestamp. */
    var expiresAt: String
}
