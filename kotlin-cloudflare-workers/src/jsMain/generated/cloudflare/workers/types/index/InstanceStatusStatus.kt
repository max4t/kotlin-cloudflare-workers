// Automatically generated - do not modify!

package cloudflare.workers.types.index

sealed external interface InstanceStatusStatus {
    companion object
}

inline val InstanceStatusStatus.Companion.queued: InstanceStatusStatus
    get() = js.reflect.unsafeCast("queued")

inline val InstanceStatusStatus.Companion.running: InstanceStatusStatus
    get() = js.reflect.unsafeCast("running")

inline val InstanceStatusStatus.Companion.paused: InstanceStatusStatus
    get() = js.reflect.unsafeCast("paused")

inline val InstanceStatusStatus.Companion.errored: InstanceStatusStatus
    get() = js.reflect.unsafeCast("errored")

inline val InstanceStatusStatus.Companion.terminated: InstanceStatusStatus
    get() = js.reflect.unsafeCast("terminated")

inline val InstanceStatusStatus.Companion.complete: InstanceStatusStatus
    get() = js.reflect.unsafeCast("complete")

inline val InstanceStatusStatus.Companion.waiting: InstanceStatusStatus
    get() = js.reflect.unsafeCast("waiting")

inline val InstanceStatusStatus.Companion.waitingForPause: InstanceStatusStatus
    get() = js.reflect.unsafeCast("waitingForPause")

inline val InstanceStatusStatus.Companion.unknown: InstanceStatusStatus
    get() = js.reflect.unsafeCast("unknown")
