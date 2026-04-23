// Tiny entry shim: unwrap the Kotlin-generated property accessor into a bare
// default export that the Cloudflare Workers runtime can call directly.
//
// Kotlin/JS 2.3 emits `val worker` as:
//   var worker_0 = { get: get_worker };
//   export default worker_0;
// The wrapper exists to defer dereferencing until consumption time (lazy
// init); it is unconditional for top-level @JsExport val/object even when
// the underlying value is a @JsPlainObject literal.
//
// Workers reads `default.fetch(request, env, ctx)`, so without this shim it
// would see undefined.
import compiled from './kotlin-cloudflare-workers-examples-hello-worker.mjs';

export default compiled.get();
