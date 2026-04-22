# kotlin-cloudflare-workers

Type-safe Kotlin bindings for [Cloudflare Workers](https://workers.cloudflare.com/),
generated from [`@cloudflare/workers-types`](https://www.npmjs.com/package/@cloudflare/workers-types)
via [Karakum](https://github.com/karakum-team/karakum).

The build layout mirrors JetBrains/kotlin-wrappers' `kotlin-node` module: a
nested `karakum/` included build is the generator, and its output is committed
to `src/jsMain/generated/` in the published library module.

Status: bootstrapping (Phase 0 — scaffolding). Not yet published.

## Build

```
./gradlew generate             # regenerate src/jsMain/generated/
./gradlew :kotlin-cloudflare-workers:compileKotlinJs
./gradlew check
```
