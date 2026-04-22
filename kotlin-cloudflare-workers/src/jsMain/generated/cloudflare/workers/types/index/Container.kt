// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Container {
    val running: Boolean

    fun start(options: ContainerStartupOptions = definedExternally): Unit

    fun monitor(): js.promise.Promise<js.core.Void>

    fun destroy(error: Any? = definedExternally): js.promise.Promise<js.core.Void>

    fun signal(signo: Double): Unit

    fun getTcpPort(port: Double): Fetcher

    fun setInactivityTimeout(durationMs: Double): js.promise.Promise<js.core.Void>

    fun setInactivityTimeout(durationMs: js.numbers.BigInt): js.promise.Promise<js.core.Void>

    fun interceptOutboundHttp(
        addr: String,
        binding: Fetcher,
    ): js.promise.Promise<js.core.Void>

    fun interceptAllOutboundHttp(binding: Fetcher): js.promise.Promise<js.core.Void>

    fun snapshotDirectory(options: ContainerDirectorySnapshotOptions): js.promise.Promise<ContainerDirectorySnapshot>

    fun snapshotContainer(options: ContainerSnapshotOptions): js.promise.Promise<ContainerSnapshot>

    fun interceptOutboundHttps(
        addr: String,
        binding: Fetcher,
    ): js.promise.Promise<js.core.Void>
}
