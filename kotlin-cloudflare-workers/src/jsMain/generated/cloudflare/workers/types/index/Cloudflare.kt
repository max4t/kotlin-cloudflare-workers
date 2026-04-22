// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

external val Cloudflare: Cloudflare

external interface Cloudflare {
val compatibilityFlags: js.objects.ReadonlyRecord<String, Boolean>
// Type of `env`.
//
// The specific project can extend `Env` by redeclaring it in project-specific files. Typescript
// will merge all declarations.
//
// You can use `wrangler types` to generate the `Env` type automatically.
external interface Env {

}
// Project-specific parameters used to inform types.
//
// This interface is, again, intended to be declared in project-specific files, and then that
// declaration will be merged with this one.
//
// A project should have a declaration like this:
//
//     interface GlobalProps {
//       // Declares the main module's exports. Used to populate Cloudflare.Exports aka the type
//       // of `ctx.exports`.
//       mainModule: typeof import("my-main-module");
//
//       // Declares which of the main module's exports are configured with durable storage, and
//       // thus should behave as Durable Object namsepace bindings.
//       durableNamespaces: "MyDurableObject" | "AnotherDurableObject";
//     }
//
// You can use `wrangler types` to generate `GlobalProps` automatically.
external interface GlobalProps {

}
// Evaluates to the type of a property in GlobalProps, defaulting to `Default` if it is not
// present.
typealias GlobalProp<K : String, Default> = Any /* K extends keyof GlobalProps ? GlobalProps[K] : Default */
// The type of the program's main module exports, if known. Requires `GlobalProps` to declare the
// `mainModule` property.
typealias MainModule = GlobalProp<String /* "mainModule" */, Any>
// The type of ctx.exports, which contains loopback bindings for all top-level exports.
external interface Exports {
operator fun <K : /* keyof MainModule */> get(key: K): (Any /* LoopbackForExport<MainModule[K]> & (K extends GlobalProp<"durableNamespaces", never> ? MainModule[K] extends new (...args: any[]) => infer DoInstance ? DoInstance extends Rpc.DurableObjectBranded ? DurableObjectNamespace<DoInstance> : DurableObjectNamespace<undefined> : DurableObjectNamespace<undefined> : {}) */)?

operator fun <K : /* keyof MainModule */> set(key: K, value: (Any /* LoopbackForExport<MainModule[K]> & (K extends GlobalProp<"durableNamespaces", never> ? MainModule[K] extends new (...args: any[]) => infer DoInstance ? DoInstance extends Rpc.DurableObjectBranded ? DurableObjectNamespace<DoInstance> : DurableObjectNamespace<undefined> : DurableObjectNamespace<undefined> : {}) */)?)
}
}
