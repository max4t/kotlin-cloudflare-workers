// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface GatewayRetriesBackoff {
    companion object
}

inline val GatewayRetriesBackoff.Companion.constant: GatewayRetriesBackoff
    get() = js.reflect.unsafeCast("constant")

inline val GatewayRetriesBackoff.Companion.linear: GatewayRetriesBackoff
    get() = js.reflect.unsafeCast("linear")

inline val GatewayRetriesBackoff.Companion.exponential: GatewayRetriesBackoff
    get() = js.reflect.unsafeCast("exponential")
