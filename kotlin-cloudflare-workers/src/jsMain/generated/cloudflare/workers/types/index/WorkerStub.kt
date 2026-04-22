// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface WorkerStub {
    fun <T : Rpc.WorkerEntrypointBranded?> getEntrypoint(
        name: String = definedExternally,
        options: WorkerStubEntrypointOptions = definedExternally,
    ): Fetcher<T>

    fun <T : Rpc.DurableObjectBranded?> getDurableObjectClass(
        name: String = definedExternally,
        options: WorkerStubEntrypointOptions = definedExternally,
    ): DurableObjectClass<T>
}
