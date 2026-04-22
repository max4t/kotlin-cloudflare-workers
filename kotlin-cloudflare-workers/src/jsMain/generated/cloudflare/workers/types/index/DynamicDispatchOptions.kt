// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface DynamicDispatchOptions {
/**
     * Limit resources of invoked Worker script.
     */
    var limits: DynamicDispatchLimits?

/**
     * Arguments for outbound Worker script, if configured.
     */
    var outbound: (js.objects.ReadonlyRecord<String, Any?>)?
}
