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
//
// Consumption-side Promise methods (on Body / Response) are declared as
// `suspend fun` to match the convention produced by the Karakum
// PromiseMethodPlugin for the generated bindings (JS → Kotlin direction).
// The EXPORT-side handler (`ExportedHandler.fetch`) declares a concrete
// `js.promise.Promise<Response>` return instead — see the comment on
// `ExportedHandler` below.
@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

import js.buffer.ArrayBuffer
import js.promise.Promise

// ---- Body ---------------------------------------------------------------

external abstract class Body {
    val bodyUsed: Boolean
    suspend fun arrayBuffer(): ArrayBuffer
    suspend fun text(): String
    suspend fun json(): Any?
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
    suspend fun arrayBuffer(): ArrayBuffer
    suspend fun text(): String
    suspend fun json(): Any?
}

external interface ResponseInit {
    var status: Short?
    var statusText: String?
    var headers: HeadersInit?
}

// ---- ExportedHandler (fetch-only MVP) -----------------------------------
//
// `fetch` returns `js.promise.Promise<Response>`, not `suspend fun`. Two
// reasons:
//
//   1. kotlin-wrappers/kotlin-node convention: suspend is a consumer-side
//      adapter only (JS Promise → Kotlin via seskar's `@JsAsync`). Export
//      boundaries use `js.promise.Promise<T>`; implementers build one with
//      `js.coroutines.promise { ... }` (or `kotlinx.coroutines.promise`
//      then `.unsafeCast`) from a suspending body.
//
//   2. Cloudflare Workers requires `defaultExport.fetch(req, env, ctx)` on
//      an OBJECT. Kotlin 2.3's `-Xenable-suspend-function-exporting` only
//      generates a Promise-returning `fetch` when the suspend function is
//      a direct instance method on a `@JsExport` class — making the class
//      CONSTRUCTOR the default export, which Cloudflare rejects unless the
//      class extends `WorkerEntrypoint`. For any override of an interface
//      `suspend` method (including `@JsStatic` on a companion), the flag
//      still emits a CPS generator with `$completion`, breaking the
//      handler contract. The `Promise<Response>` form lets users attach a
//      `@JsStatic` companion `fetch` to the exported class without
//      triggering CPS lowering.
external interface ExportedHandler<Env, QueueHandlerMessage, CfHostMetadata, Props> {
    fun fetch(
        request: Request<CfHostMetadata, Any?>,
        env: Env,
        ctx: ExecutionContext<Props>,
    ): Promise<Response>
}
