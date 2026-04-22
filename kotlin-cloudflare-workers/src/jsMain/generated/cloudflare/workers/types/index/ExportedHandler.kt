// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ExportedHandler<Env /* default is Any? */, QueueHandlerMessage /* default is Any? */, CfHostMetadata /* default is Any? */, Props /* default is Any? */> {
    var fetch: ExportedHandlerFetchHandler<Env, CfHostMetadata, Props>?
    var connect: ExportedHandlerConnectHandler<Env, Props>?
    var tail: ExportedHandlerTailHandler<Env, Props>?
    var trace: ExportedHandlerTraceHandler<Env, Props>?
    var tailStream: ExportedHandlerTailStreamHandler<Env, Props>?
    var scheduled: ExportedHandlerScheduledHandler<Env, Props>?
    var test: ExportedHandlerTestHandler<Env, Props>?
    var email: EmailExportedHandler<Env, Props>?
    var queue: ExportedHandlerQueueHandler<Env, QueueHandlerMessage, Props>?
}
