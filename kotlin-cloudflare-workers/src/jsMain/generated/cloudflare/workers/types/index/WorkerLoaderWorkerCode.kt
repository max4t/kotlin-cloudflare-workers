// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface WorkerLoaderWorkerCode {
    var compatibilityDate: String
    var compatibilityFlags: js.array.ReadonlyArray<String>?
    var allowExperimental: Boolean?
    var limits: workerdResourceLimits?
    var mainModule: String
    var modules: js.objects.ReadonlyRecord<String, Any /* WorkerLoaderModule | string */>
    var env: Any?
    var globalOutbound: Fetcher?
    var tails: js.array.ReadonlyArray<Fetcher>?
    var streamingTails: js.array.ReadonlyArray<Fetcher>?
}
