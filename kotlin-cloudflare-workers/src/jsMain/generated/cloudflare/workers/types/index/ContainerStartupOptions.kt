// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ContainerStartupOptions {
    var entrypoint: js.array.ReadonlyArray<String>?
    var enableInternet: Boolean
    var env: js.objects.ReadonlyRecord<String, String>?
    var labels: js.objects.ReadonlyRecord<String, String>?
    var directorySnapshots: js.array.ReadonlyArray<ContainerDirectorySnapshotRestoreParams>?
    var containerSnapshot: ContainerSnapshot?
}
