// Automatically generated - do not modify!

@file:JsModule("@cloudflare/workers-types")

package cloudflare.workers.types.index

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
external fun fetch(
    input: RequestInfo,
    init: web.http.RequestInit<RequestInitCfProperties> = definedExternally,
): js.promise.Promise<web.http.Response>

// [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
external fun fetch(
    input: web.url.URL,
    init: web.http.RequestInit<RequestInitCfProperties> = definedExternally,
): js.promise.Promise<web.http.Response>
