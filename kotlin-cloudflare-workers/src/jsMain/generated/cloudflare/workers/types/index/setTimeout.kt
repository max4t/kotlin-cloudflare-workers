// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/setTimeout)
external fun setTimeout(callback: Function<Unit> /* (...args: any[]) => void */, msDelay: Double = definedExternally): Double

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/setTimeout)
external fun <Args : js.array.ReadonlyArray<Any?>> setTimeout(
    callback: Function<Unit> /* (...args: Args) => void */,
    msDelay: Double = definedExternally,
    vararg args: Any?, // Args
): Double
