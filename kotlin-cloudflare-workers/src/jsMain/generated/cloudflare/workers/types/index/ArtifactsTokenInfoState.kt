// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface ArtifactsTokenInfoState {
    companion object
}

inline val ArtifactsTokenInfoState.Companion.active: ArtifactsTokenInfoState
    get() = js.reflect.unsafeCast("active")

inline val ArtifactsTokenInfoState.Companion.expired: ArtifactsTokenInfoState
    get() = js.reflect.unsafeCast("expired")

inline val ArtifactsTokenInfoState.Companion.revoked: ArtifactsTokenInfoState
    get() = js.reflect.unsafeCast("revoked")
