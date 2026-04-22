// Automatically generated - do not modify!

package cloudflare.workers.types.generated

external interface ServiceWorkerGlobalScopeAbortSignal {
// new (): AbortSignal;
    var prototype: AbortSignal

    fun abort(reason: Any? = definedExternally): AbortSignal

    fun any(signals: js.array.ReadonlyArray<AbortSignal>): AbortSignal

    fun timeout(milliseconds: Double): AbortSignal
}
