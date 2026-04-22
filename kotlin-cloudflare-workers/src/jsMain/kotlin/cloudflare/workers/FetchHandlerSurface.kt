// Hand-written fetch-handler MVP surface.
//
// Karakum emits these types with references to `web.*` (kotlin-wrappers'
// kotlin-web) which we don't consume per Option B, and with various syntactic
// issues (duplicate supertypes on Request/Response, TS `Exclude<T, U>` utility
// type pass-through, property-narrowing without `override`). We hand-write a
// minimal surface compatible with @cloudflare/workers-types for now.
//
// Phase 3 will replace these with generated versions as the conversion plugins
// mature. The surface intentionally omits fields that pull in non-MVP types
// (WebSocket, streams, AbortSignal, Fetcher, Cache, etc.) — they can be added
// in follow-up PRs.
@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

import js.buffer.ArrayBuffer
import js.promise.Promise

// ---- Body ---------------------------------------------------------------

external abstract class Body {
    val bodyUsed: Boolean
    fun arrayBuffer(): Promise<ArrayBuffer>
    fun text(): Promise<String>
    fun json(): Promise<Any?>
}

typealias BodyInit = Any

// ---- Headers ------------------------------------------------------------

external class Headers {
    constructor(init: HeadersInit = definedExternally)
    fun get(name: String): String?
    fun has(name: String): Boolean
    fun set(name: String, value: String)
    fun append(name: String, value: String)
    fun delete(name: String)
}

typealias HeadersInit = Any

// ---- Request / Response -------------------------------------------------

external interface Request<CfHostMetadata, Cf> {
    val method: String
    val url: String
    val headers: Headers
    fun clone(): Request<CfHostMetadata, Cf>
    val cf: IncomingRequestCfProperties<CfHostMetadata>?
}

external interface RequestInit<Cf> {
    var body: BodyInit?
    var headers: HeadersInit?
    var method: String?
    var redirect: String?
    var cf: Cf?
}

typealias RequestInfo = Any

external interface Response {
    val status: Short
    val statusText: String
    val ok: Boolean
    val headers: Headers
    val bodyUsed: Boolean
    fun clone(): Response
    fun arrayBuffer(): Promise<ArrayBuffer>
    fun text(): Promise<String>
    fun json(): Promise<Any?>
}

external interface ResponseInit {
    var status: Short?
    var statusText: String?
    var headers: HeadersInit?
}

// ---- ExportedHandler (fetch-only MVP) -----------------------------------

external interface ExportedHandler<Env, QueueHandlerMessage, CfHostMetadata, Props> {
    var fetch: ExportedHandlerFetchHandler<Env, CfHostMetadata, Props>?
}

typealias ExportedHandlerFetchHandler<Env, CfHostMetadata, Props> = (
    request: Request<CfHostMetadata, Any?>,
    env: Env,
    ctx: ExecutionContext<Props>,
) -> Promise<Response>
