// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface WorkerLoader {
    fun get(
        name: String?,
        getCode: () -> js.promise.PromiseResult<WorkerLoaderWorkerCode>,
    ): WorkerStub

    fun load(code: WorkerLoaderWorkerCode): WorkerStub
}
