// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface EventPluginContext<Env, P : String, Data, PluginArgs> {
    var request: web.http.Request<Any?, IncomingRequestCfProperties<Any?>>
    var functionPath: String
    var waitUntil: (promise: js.promise.Promise<Any?>) -> Unit
    var passThroughOnException: () -> Unit
    var next: (
        input: (Any /* Request | string */)? /* use undefined for default */,
        init: web.http.RequestInit?, // use undefined for default
    ) -> js.promise.Promise<web.http.Response>
    var env: EventPluginContextEnv<Env>
    var params: Params<P>
    var data: Data
    var pluginArgs: PluginArgs
}
