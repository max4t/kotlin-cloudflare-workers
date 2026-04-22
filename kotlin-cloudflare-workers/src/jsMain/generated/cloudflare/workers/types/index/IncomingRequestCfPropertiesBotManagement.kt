// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface IncomingRequestCfPropertiesBotManagement {
/**
     * Results of Cloudflare's Bot Management analysis
     */
    var botManagement: IncomingRequestCfPropertiesBotManagementBase

/**
     * Duplicate of `botManagement.score`.
     *
     * @deprecated
     */
    var clientTrustScore: Double
}
