// Hand-written. Kotlin has no intersection types, so we reify the TypeScript
// intersection as an empty interface extending each part.
// See @cloudflare/workers-types index.d.ts:
//   type IncomingRequestCfProperties<HostMetadata> =
//     IncomingRequestCfPropertiesBase &
//     IncomingRequestCfPropertiesBotManagementEnterprise &
//     IncomingRequestCfPropertiesCloudflareForSaaSEnterprise<HostMetadata> &
//     IncomingRequestCfPropertiesGeographicInformation &
//     IncomingRequestCfPropertiesCloudflareAccessOrApiShield
package cloudflare.workers.types.index

// Substitutes `IncomingRequestCfPropertiesBotManagementEnterprise` (which
// narrows `botManagement` from its parent and generates without the required
// `override` modifier) with the parent `IncomingRequestCfPropertiesBotManagement`.
// Users lose the enterprise-specific narrowing for MVP.
external interface IncomingRequestCfProperties<HostMetadata> :
    IncomingRequestCfPropertiesBase,
    IncomingRequestCfPropertiesBotManagement,
    IncomingRequestCfPropertiesCloudflareForSaaSEnterprise<HostMetadata>,
    IncomingRequestCfPropertiesGeographicInformation,
    IncomingRequestCfPropertiesCloudflareAccessOrApiShield

// TS: type CfProperties<HostMetadata> = IncomingRequestCfProperties<HostMetadata> | RequestInitCfProperties
// Kotlin has no union types. MVP: typealias to Any. Users narrow explicitly.
typealias CfProperties<HostMetadata> = Any
