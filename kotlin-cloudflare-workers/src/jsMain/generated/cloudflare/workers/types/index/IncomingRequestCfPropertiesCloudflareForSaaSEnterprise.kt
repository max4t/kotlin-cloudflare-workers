// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface IncomingRequestCfPropertiesCloudflareForSaaSEnterprise<HostMetadata> {
/**
     * Custom metadata set per-host in [Cloudflare for SaaS](https://developers.cloudflare.com/cloudflare-for-platforms/cloudflare-for-saas/).
     *
     * This field is only present if you have Cloudflare for SaaS enabled on your account
     * and you have followed the [required steps to enable it]((https://developers.cloudflare.com/cloudflare-for-platforms/cloudflare-for-saas/domain-support/custom-metadata/)).
     */
    var hostMetadata: HostMetadata?
}
