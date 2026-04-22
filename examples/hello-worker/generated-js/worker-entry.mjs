// Tiny entry shim: unwrap the Kotlin-generated singleton accessor into a bare
// default export that the Cloudflare Workers runtime can call directly.
//
// Kotlin/JS 2.3 emits `object Worker` as a lazy singleton with an accessor:
//   var Worker_0 = { getInstance: Worker_getInstance };
//   export default Worker_0;
// Workers expects the default export to BE the handler, so it looks up
// `.fetch` on whatever `export default` bound — which here is the accessor
// object, not the handler. This file bridges the two.
import compiled from './kotlin-cloudflare-workers-examples-hello-worker.mjs';

export default compiled.getInstance();
