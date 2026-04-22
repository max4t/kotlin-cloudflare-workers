// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

external class CompileError : js.errors.JsError {
constructor (message: String = definedExternally)
}
external class RuntimeError : js.errors.JsError {
constructor (message: String = definedExternally)
}
sealed external interface ValueType {
companion object
}
external interface GlobalDescriptor<T : ValueType /* default is ValueType */> {
var mutable: Boolean?
var value: T
}
external class Global {
constructor (descriptor: GlobalDescriptor, value: Any? = definedExternally)
var value: Any?
fun valueOf(): Any?
}
typealias ImportValue = Any /* ExportValue | number */
typealias ModuleImports = js.objects.ReadonlyRecord<String, ImportValue>
typealias Imports = js.objects.ReadonlyRecord<String, ModuleImports>
typealias ExportValue = Any /* Function | Global | Memory | Table */
typealias Exports = js.objects.ReadonlyRecord<String, ExportValue>
external class Instance {
constructor (module: Module, imports: Imports = definedExternally)
val exports: Exports
}
external interface MemoryDescriptor {
var address: AddressType?
var initial: AddressValue
var maximum: AddressValue?
var shared: Boolean?
}
external class Memory {
constructor (descriptor: MemoryDescriptor)
val buffer: js.buffer.ArrayBuffer
fun grow(delta: Double): Double
}
sealed external interface ImportExportKind {
companion object
}
external interface ModuleExportDescriptor {
var kind: ImportExportKind
var name: String
}
external interface ModuleImportDescriptor {
var kind: ImportExportKind
var module: String
var name: String
}
abstract external class Module {

companion object {
fun customSections(module: Module, sectionName: String): js.array.ReadonlyArray<js.buffer.ArrayBuffer>
fun exports(module: Module): js.array.ReadonlyArray<ModuleExportDescriptor>
fun imports(module: Module): js.array.ReadonlyArray<ModuleImportDescriptor>
}
}
sealed external interface TableKind {
companion object
}
external interface TableDescriptor {
var address: AddressType?
var element: TableKind
var initial: AddressValue
var maximum: AddressValue?
}
external class Table {
constructor (descriptor: TableDescriptor, value: Any? = definedExternally)
val length: Double
fun get(index: Double): Any?
fun grow(delta: Double, value: Any? = definedExternally): Double
fun set(index: Double, value: Any? = definedExternally): Unit
}
external fun instantiate(module: Module, imports: Imports = definedExternally): js.promise.Promise<Instance>
external fun validate(bytes: js.buffer.BufferSource): Boolean

external var _EmailMessage: _EmailMessage
/* export { _EmailMessage as EmailMessage }; */

external interface NodeStyleServer {
fun listen(vararg args: Any?): Unit /* this */
fun address(): NodeStyleServerAddressResult
}
external fun httpServerHandler(port: Double): ExportedHandler
external fun httpServerHandler(options: HttpServerHandlerOptions): ExportedHandler
external fun httpServerHandler(server: NodeStyleServer): ExportedHandler

// Copyright (c) 2022-2023 Cloudflare, Inc.
// Licensed under the Apache 2.0 license found in the LICENSE file or at:
//     https://opensource.org/licenses/Apache-2.0
abstract external class PipelineTransformationEntrypoint<Env /* default is Any? */, I : PipelineRecord /* default is PipelineRecord */, O : PipelineRecord /* default is PipelineRecord */> {
constructor (ctx: ExecutionContext, env: Env)
var env: Env
var ctx: ExecutionContext
/**
     * run receives an array of PipelineRecord which can be
     * transformed and returned to the pipeline
     * @param records Incoming records from the pipeline to be transformed
     * @param metadata Information about the specific pipeline calling the transformation entrypoint
     * @returns A promise containing the transformed PipelineRecord array
     */
fun run(records: js.array.ReadonlyArray<I>, metadata: PipelineBatchMetadata): js.promise.Promise<js.array.ReadonlyArray<O>>
}
typealias PipelineRecord = js.objects.ReadonlyRecord<String, Any?>
external interface PipelineBatchMetadata {
var pipelineId: String
var pipelineName: String
}
external interface Pipeline<T : PipelineRecord /* default is PipelineRecord */> {
/**
     * The Pipeline interface represents the type of a binding to a Pipeline
     *
     * @param records The records to send to the pipeline
     */
fun send(records: js.array.ReadonlyArray<T>): js.promise.Promise<js.core.Void>
}

// Namespace for RPC utility types. Unfortunately, we can't use a `module` here as these types need
// to referenced by `Fetcher`. This is included in the "importable" version of the types which
// strips all `module` blocks.
// Branded types for identifying `WorkerEntrypoint`/`DurableObject`/`Target`s.
// TypeScript uses *structural* typing meaning anything with the same shape as type `T` is a `T`.
// For the classes exported by `cloudflare:workers` we want *nominal* typing (i.e. we only want to
// accept `WorkerEntrypoint` from `cloudflare:workers`, not any other class with the same shape)
external val __RPC_STUB_BRAND: String /* "__RPC_STUB_BRAND" */
external val __RPC_TARGET_BRAND: String /* "__RPC_TARGET_BRAND" */
external val __WORKER_ENTRYPOINT_BRAND: String /* "__WORKER_ENTRYPOINT_BRAND" */
external val __DURABLE_OBJECT_BRAND: String /* "__DURABLE_OBJECT_BRAND" */
external val __WORKFLOW_ENTRYPOINT_BRAND: String /* "__WORKFLOW_ENTRYPOINT_BRAND" */
external interface RpcTargetBranded {

}
external interface WorkerEntrypointBranded {

}
external interface DurableObjectBranded {

}
external interface WorkflowEntrypointBranded {

}
typealias EntrypointBranded = Any /* WorkerEntrypointBranded | DurableObjectBranded | WorkflowEntrypointBranded */
// Types that can be used through `Stub`s
typealias Stubable = Any /* RpcTargetBranded | ((...args: any[]) => any) */
// Types that can be passed over RPC
// The reason for using a generic type here is to build a serializable subset of structured
//   cloneable composite types. This allows types defined with the "interface" keyword to pass the
//   serializable check as well. Otherwise, only types defined with the "type" keyword would pass.
typealias Serializable<T> = // Structured cloneables
Any? /* BaseType | Map<T extends Map<infer U, unknown> ? Serializable<U> : never, T extends Map<unknown, infer U> ? Serializable<U> : never> | Set<T extends Set<infer U> ? Serializable<U> : never> | ReadonlyArray<T extends ReadonlyArray<infer U> ? Serializable<U> : never> | {
    [K in keyof T]: K extends number | string ? Serializable<T[K]> : never;
} | Stub<Stubable> | Stubable */
// Base type for all RPC stubs, including common memory management methods.
// `T` is used as a marker type for unwrapping `Stub`s later.
external interface StubBase<T : Stubable> : js.disposable.Disposable {
fun dup(): Unit /* this */
}
external interface Stub<T : Stubable>  : Provider<T>, StubBase<T> {

}
// This represents all the types that can be sent as-is over an RPC boundary
typealias BaseType = Any? /* void | undefined | null | boolean | number | bigint | string | TypedArray | ArrayBuffer | DataView | Date | Error | RegExp | ReadableStream<Uint8Array> | WritableStream<Uint8Array> | Request | Response | Headers */
// Recursively rewrite all `Stubable` types with `Stub`s
typealias Stubify<T> = Any /* T extends Stubable ? Stub<T> : T extends Map<infer K, infer V> ? Map<Stubify<K>, Stubify<V>> : T extends Set<infer V> ? Set<Stubify<V>> : T extends Array<infer V> ? Array<Stubify<V>> : T extends ReadonlyArray<infer V> ? ReadonlyArray<Stubify<V>> : T extends BaseType ? T : T extends {
    [key: string | number]: any;
} ? {
    [K in keyof T]: Stubify<T[K]>;
} : T */
// Recursively rewrite all `Stub<T>`s with the corresponding `T`s.
// Note we use `StubBase` instead of `Stub` here to avoid circular dependencies:
// `Stub` depends on `Provider`, which depends on `Unstubify`, which would depend on `Stub`.
typealias Unstubify<T> = Any /* T extends StubBase<infer V> ? V : T extends Map<infer K, infer V> ? Map<Unstubify<K>, Unstubify<V>> : T extends Set<infer V> ? Set<Unstubify<V>> : T extends Array<infer V> ? Array<Unstubify<V>> : T extends ReadonlyArray<infer V> ? ReadonlyArray<Unstubify<V>> : T extends BaseType ? T : T extends {
    [key: string | number]: unknown;
} ? {
    [K in keyof T]: Unstubify<T[K]>;
} : T */
external interface UnstubifyAll<A : js.array.ReadonlyArray<Any?>> {
operator fun <I : /* keyof A */> get(key: I): Unstubify<Any?>?

operator fun <I : /* keyof A */> set(key: I, value: Unstubify<Any?>?)
}
// Utility type for adding `Provider`/`Disposable`s to `object` types only.
// Note `unknown & T` is equivalent to `T`.
typealias MaybeProvider<T> = Any? /* T extends object ? Provider<T> : unknown */
typealias MaybeDisposable<T> = Any? /* T extends object ? Disposable : unknown */
// Type for method return or property on an RPC interface.
// - Stubable types are replaced by stubs.
// - Serializable types are passed by value, with stubable types replaced by stubs
//   and a top-level `Disposer`.
// Everything else can't be passed over PRC.
// Technically, we use custom thenables here, but they quack like `Promise`s.
// Intersecting with `(Maybe)Provider` allows pipelining.
typealias Result<R> = Any /* R extends Stubable ? Promise<Stub<R>> & Provider<R> : R extends Serializable<R> ? Promise<Stubify<R> & MaybeDisposable<R>> & MaybeProvider<R> : never */
// Type for method or property on an RPC interface.
// For methods, unwrap `Stub`s in parameters, and rewrite returns to be `Result`s.
// Unwrapping `Stub`s allows calling with `Stubable` arguments.
// For properties, rewrite types to be `Result`s.
// In each case, unwrap `Promise`s.
typealias MethodOrProperty<V> = Any /* V extends (...args: infer P) => infer R ? (...args: UnstubifyAll<P>) => Result<Awaited<R>> : Result<Awaited<V>> */
// Type for the callable part of an `Provider` if `T` is callable.
// This is intersected with methods/properties.
typealias MaybeCallableProvider<T> = Any? /* T extends (...args: any[]) => any ? MethodOrProperty<T> : unknown */
// Base type for all other types providing RPC-like interfaces.
// Rewrites all methods/properties to be `MethodOrProperty`s, while preserving callable types.
// `Reserved` names (e.g. stub method names like `dup()`) and symbols can't be accessed over RPC.
external interface Provider<T : Any, Reserved : String /* default is Nothing */>  : MaybeCallableProvider<T>, Pick<Temp128<T, T>, Exclude</* keyof T */, Any /* Reserved | symbol | keyof StubBase<never> */>> {

}



typealias GlobalProp<K : String, Default> = Any /* K extends keyof GlobalProps ? GlobalProps[K] : Default */
typealias MainModule = GlobalProp<String /* "mainModule" */, Any>
external interface Exports {
operator fun <K : /* keyof MainModule */> get(key: K): (Any /* LoopbackForExport<MainModule[K]> & (K extends GlobalProp<"durableNamespaces", never> ? MainModule[K] extends new (...args: any[]) => infer DoInstance ? DoInstance extends Rpc.DurableObjectBranded ? DurableObjectNamespace<DoInstance> : DurableObjectNamespace<undefined> : DurableObjectNamespace<undefined> : {}) */)?

operator fun <K : /* keyof MainModule */> set(key: K, value: (Any /* LoopbackForExport<MainModule[K]> & (K extends GlobalProp<"durableNamespaces", never> ? MainModule[K] extends new (...args: any[]) => infer DoInstance ? DoInstance extends Rpc.DurableObjectBranded ? DurableObjectNamespace<DoInstance> : DurableObjectNamespace<undefined> : DurableObjectNamespace<undefined> : {}) */)?)
}

typealias RpcStub<T : Rpc.Stubable> = Rpc.Stub<T>
external val RpcStub: RpcStub
abstract external class RpcTarget : Rpc.RpcTargetBranded {

}
// `protected` fields don't appear in `keyof`s, so can't be accessed over RPC
abstract external class WorkerEntrypoint<Env /* default is Cloudflare.Env */, Props /* default is Any */> : Rpc.WorkerEntrypointBranded {
constructor (ctx: ExecutionContext, env: Env)
var ctx: ExecutionContext<Props>
var env: Env
val email: ((message: ForwardableEmailMessage) -> js.promise.PromiseResult<js.core.Void>)?
val fetch: ((request: web.http.Request) -> js.promise.PromiseResult<web.http.Response>)?
val connect: ((socket: Socket) -> js.promise.PromiseResult<js.core.Void>)?
val queue: ((batch: MessageBatch) -> js.promise.PromiseResult<js.core.Void>)?
val scheduled: ((controller: ScheduledController) -> js.promise.PromiseResult<js.core.Void>)?
val tail: ((events: js.array.ReadonlyArray<TraceItem>) -> js.promise.PromiseResult<js.core.Void>)?
val tailStream: ((event: TailStream.TailEvent<TailStream.Onset>) -> js.promise.PromiseResult<TailStream.TailEventHandlerType>)?
val test: ((controller: TestController) -> js.promise.PromiseResult<js.core.Void>)?
val trace: ((traces: js.array.ReadonlyArray<TraceItem>) -> js.promise.PromiseResult<js.core.Void>)?
}
abstract external class DurableObject<Env /* default is Cloudflare.Env */, Props /* default is Any */> : Rpc.DurableObjectBranded {
constructor (ctx: DurableObjectState, env: Env)
var ctx: DurableObjectState<Props>
var env: Env
val alarm: ((alarmInfo: AlarmInvocationInfo? /* use undefined for default */) -> js.promise.PromiseResult<js.core.Void>)?
val fetch: ((request: web.http.Request) -> js.promise.PromiseResult<web.http.Response>)?
val connect: ((socket: Socket) -> js.promise.PromiseResult<js.core.Void>)?
val webSocketMessage: ((ws: web.sockets.WebSocket, message: Any /* string | ArrayBuffer */) -> js.promise.PromiseResult<js.core.Void>)?
val webSocketClose: ((ws: web.sockets.WebSocket, code: Double, reason: String, wasClean: Boolean) -> js.promise.PromiseResult<js.core.Void>)?
val webSocketError: ((ws: web.sockets.WebSocket, error: Any?) -> js.promise.PromiseResult<js.core.Void>)?
}
sealed external interface WorkflowDurationLabel {
companion object
}
typealias WorkflowSleepDuration = Any /* `${number} ${WorkflowDurationLabel}${"s" | ""}` | number */
typealias WorkflowDelayDuration = WorkflowSleepDuration
typealias WorkflowTimeoutDuration = WorkflowSleepDuration
typealias WorkflowRetentionDuration = WorkflowSleepDuration
sealed external interface WorkflowBackoff {
companion object
}
external interface WorkflowStepConfig {
var retries: (WorkflowStepConfigRetries)?
var timeout: (Any /* WorkflowTimeoutDuration | number */)?
}
external interface WorkflowEvent<T> {
var payload: Readonly<T>
var timestamp: js.date.Date
var instanceId: String
}
external interface WorkflowStepEvent<T> {
var payload: Readonly<T>
var timestamp: js.date.Date
var type: String
}
external interface WorkflowStepContext {
var step: WorkflowStepContextStep
var attempt: Double
var config: WorkflowStepConfig
}
abstract external class WorkflowStep {
fun <T : Rpc.Serializable<T>> `do`(name: String, callback: (ctx: WorkflowStepContext) -> js.promise.Promise<T>): js.promise.Promise<T>
fun <T : Rpc.Serializable<T>> `do`(name: String, config: WorkflowStepConfig, callback: (ctx: WorkflowStepContext) -> js.promise.Promise<T>): js.promise.Promise<T>
var sleep: (name: String, duration: WorkflowSleepDuration) -> js.promise.Promise<js.core.Void>
var sleepUntil: (name: String, timestamp: Any /* Date | number */) -> js.promise.Promise<js.core.Void>
fun <T : Rpc.Serializable<T>> waitForEvent(name: String, options: WorkflowStepWaitForEventOptions): js.promise.Promise<WorkflowStepEvent<T>>
}
sealed external interface WorkflowInstanceStatus {
companion object
}
abstract external class WorkflowEntrypoint<Env /* default is Any? */, T : Any? /* Rpc.Serializable<T> | unknown */ /* default is Any? */> : Rpc.WorkflowEntrypointBranded {
constructor (ctx: ExecutionContext, env: Env)
var ctx: ExecutionContext
var env: Env
fun run(event: Readonly<WorkflowEvent<T>>, step: WorkflowStep): js.promise.Promise<Any?>
}
external fun waitUntil(promise: js.promise.Promise<Any?>): Unit
external fun withEnv(newEnv: Any?, fn: () -> Any?): Any?
external fun withExports(newExports: Any?, fn: () -> Any?): Any?
external fun withEnvAndExports(newEnv: Any?, newExports: Any?, fn: () -> Any?): Any?
external val env: Cloudflare.Env
external val exports: Cloudflare.Exports
external val cache: CacheContext

/* export = CloudflareWorkersModule; */

external fun _connect(address: String, options: SocketOptions = definedExternally): Socket

external fun _connect(address: SocketAddress, options: SocketOptions = definedExternally): Socket
/* export { _connect as connect }; */

external interface Header {
val name: String
val value: String
}
external interface FetchEventInfo {
val type: String /* "fetch" */
val method: String
val url: String
val cfJson: Any?
val headers: js.array.ReadonlyArray<Header>
}
external interface JsRpcEventInfo {
val type: String /* "jsrpc" */
}
external interface ScheduledEventInfo {
val type: String /* "scheduled" */
val scheduledTime: js.date.Date
val cron: String
}
external interface AlarmEventInfo {
val type: String /* "alarm" */
val scheduledTime: js.date.Date
}
external interface QueueEventInfo {
val type: String /* "queue" */
val queueName: String
val batchSize: Double
}
external interface EmailEventInfo {
val type: String /* "email" */
val mailFrom: String
val rcptTo: String
val rawSize: Double
}
external interface TraceEventInfo {
val type: String /* "trace" */
val traces: js.array.ReadonlyArray<(String?)>
}
external interface HibernatableWebSocketEventInfoMessage {
val type: String /* "message" */
}
external interface HibernatableWebSocketEventInfoError {
val type: String /* "error" */
}
external interface HibernatableWebSocketEventInfoClose {
val type: String /* "close" */
val code: Double
val wasClean: Boolean
}
external interface HibernatableWebSocketEventInfo {
val type: String /* "hibernatableWebSocket" */
val info: Any /* HibernatableWebSocketEventInfoClose | HibernatableWebSocketEventInfoError | HibernatableWebSocketEventInfoMessage */
}
external interface CustomEventInfo {
val type: String /* "custom" */
}
external interface FetchResponseInfo {
val type: String /* "fetch" */
val statusCode: Double
}
external interface ConnectEventInfo {
val type: String /* "connect" */
}
sealed external interface EventOutcome {
companion object
}
external interface ScriptVersion {
val id: String
val tag: String?
val message: String?
}
external interface TracePreviewInfo {
val id: String
val slug: String
val name: String
}
external interface Onset {
val type: String /* "onset" */
val attributes: js.array.ReadonlyArray<Attribute>
// id for the span being opened by this Onset event.
val spanId: String
val dispatchNamespace: String?
val entrypoint: String?
val executionModel: String
val scriptName: String?
val scriptTags: js.array.ReadonlyArray<String>?
val scriptVersion: ScriptVersion?
val preview: TracePreviewInfo?
val info: Any /* FetchEventInfo | ConnectEventInfo | JsRpcEventInfo | ScheduledEventInfo | AlarmEventInfo | QueueEventInfo | EmailEventInfo | TraceEventInfo | HibernatableWebSocketEventInfo | CustomEventInfo */
}
external interface Outcome {
val type: String /* "outcome" */
val outcome: EventOutcome
val cpuTime: Double
val wallTime: Double
}
external interface SpanOpen {
val type: String /* "spanOpen" */
val name: String
// id for the span being opened by this SpanOpen event.
val spanId: String
val info: (Any /* FetchEventInfo | JsRpcEventInfo | Attributes */)?
}
external interface SpanClose {
val type: String /* "spanClose" */
val outcome: EventOutcome
}
external interface DiagnosticChannelEvent {
val type: String /* "diagnosticChannel" */
val channel: String
val message: Any?
}
external interface Exception {
val type: String /* "exception" */
val name: String
val message: String
val stack: String?
}
external interface Log {
val type: String /* "log" */
val level: LogLevel
val message: Any
}
external interface DroppedEventsDiagnostic {
val diagnosticsType: String /* "droppedEvents" */
val count: Double
}
external interface StreamDiagnostic {
val type: String /* "streamDiagnostic" */
// To add new diagnostic types, define a new interface and add it to this union type.
val diagnostic: DroppedEventsDiagnostic
}
// This marks the worker handler return information.
// This is separate from Outcome because the worker invocation can live for a long time after
// returning. For example - Websockets that return an http upgrade response but then continue
// streaming information or SSE http connections.
external interface Return {
val type: String /* "return" */
val info: FetchResponseInfo?
}
external interface Attribute {
val name: String
val value: Any /* string | string[] | boolean | boolean[] | number | number[] | bigint | bigint[] */
}
external interface Attributes {
val type: String /* "attributes" */
val info: js.array.ReadonlyArray<Attribute>
}
typealias EventType = Any /* Onset | Outcome | SpanOpen | SpanClose | DiagnosticChannelEvent | Exception | Log | StreamDiagnostic | Return | Attributes */
// Context in which this trace event lives.
external interface SpanContext {
// Single id for the entire top-level invocation
// This should be a new traceId for the first worker stage invoked in the eyeball request and then
// same-account service-bindings should reuse the same traceId but cross-account service-bindings
// should use a new traceId.
val traceId: String
// spanId in which this event is handled
// for Onset and SpanOpen events this would be the parent span id
// for Outcome and SpanClose these this would be the span id of the opening Onset and SpanOpen events
// For Hibernate and Mark this would be the span under which they were emitted.
// spanId is not set ONLY if:
//  1. This is an Onset event
//  2. We are not inheriting any SpanContext. (e.g. this is a cross-account service binding or a new top-level invocation)
val spanId: String?
}
external interface TailEvent<Event : EventType> {
// invocation id of the currently invoked worker stage.
// invocation id will always be unique to every Onset event and will be the same until the Outcome event.
val invocationId: String
// Inherited spanContext for this event.
val spanContext: SpanContext
val timestamp: js.date.Date
val sequence: Double
val event: Event
}
typealias TailEventHandler<Event : EventType /* default is EventType */> = (event: TailEvent<Event>) -> js.promise.PromiseResult<js.core.Void>
external interface TailEventHandlerObject {
var outcome: TailEventHandler<Outcome>?
var spanOpen: TailEventHandler<SpanOpen>?
var spanClose: TailEventHandler<SpanClose>?
var diagnosticChannel: TailEventHandler<DiagnosticChannelEvent>?
var exception: TailEventHandler<Exception>?
var log: TailEventHandler<Log>?
var `return`: TailEventHandler<Return>?
var attributes: TailEventHandler<Attributes>?
}
typealias TailEventHandlerType = Any /* TailEventHandler | TailEventHandlerObject */

/**
   * NonRetryableError allows for a user to throw a fatal error
   * that makes a Workflow instance fail immediately without triggering a retry
   */
external class NonRetryableError : js.errors.JsError {
constructor (message: String, name: String = definedExternally)
}
