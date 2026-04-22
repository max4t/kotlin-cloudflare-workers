// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Scheduler {
/**
     * The **`postTask()`** method of the Scheduler interface is used for adding tasks to be scheduled according to their priority.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/postTask)
     */
    fun postTask(
        callback: web.scheduling.SchedulerPostTaskCallback,
        options: web.scheduling.SchedulerPostTaskOptions = definedExternally,
    ): js.promise.Promise<Any?>

/**
     * The **`yield()`** method of the Scheduler interface is used for yielding to the main thread during a task and continuing execution later, with the continuation scheduled as a prioritized task (see the Prioritized Task Scheduling API for more information). This allows long-running work to be broken up so the browser stays responsive.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/yield)
     */
    fun yield(): js.promise.Promise<js.core.Void>

    fun wait(
        delay: Double,
        maybeOptions: SchedulerWaitOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>
}
