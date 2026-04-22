// Automatically generated - do not modify!

package cloudflare.workers.types.generated

external interface Temp127 {
    operator fun invoke(
        input: RequestInfo,
        init: RequestInit<CfProperties<Any?>>? = definedExternally,
    ): Promise<Response>

    operator fun invoke(
        input: URL,
        init: RequestInit<CfProperties<Any?>>? = definedExternally,
    ): Promise<Response>

    operator fun invoke(
        input: RequestInfo,
        init: RequestInit<RequestInitCfProperties>? = definedExternally,
    ): Promise<Response>

    operator fun invoke(
        input: URL,
        init: RequestInit<RequestInitCfProperties>? = definedExternally,
    ): Promise<Response>
}
