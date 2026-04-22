# kotlin-cloudflare-workers

Type-safe Kotlin bindings for [Cloudflare Workers](https://workers.cloudflare.com/),
generated from [`@cloudflare/workers-types`](https://www.npmjs.com/package/@cloudflare/workers-types)
via [Karakum](https://github.com/karakum-team/karakum).

The build layout mirrors JetBrains/kotlin-wrappers' `kotlin-node` module: a
nested `karakum/` included build is the generator, and its output is committed
to `src/jsMain/generated/` in the published library module.

Status: bootstrapping. Phase 2 green — a fetch-handler surface compiles
against Karakum-generated bindings plus a small hand-written core (the
`web.http.*` routing and TS `Exclude<T, U>` pass-through are not yet
handled, so `Request`/`Response`/`Headers`/`Body`/`RequestInit`/
`ResponseInit` and a couple of Cf-properties parts are hand-written in
`src/jsMain/kotlin/cloudflare/workers/`). Not yet published.

Phase 3 (KV, R2, D1, DO, Scheduled, Queues, WebSocket, Cache, AI) will
expand binding families one at a time, replacing hand-written types with
generated ones as the Karakum conversion plugins mature.

## Build

```
./gradlew generate             # regenerate src/jsMain/generated/
./gradlew :kotlin-cloudflare-workers:compileKotlinJs
./gradlew check
```
