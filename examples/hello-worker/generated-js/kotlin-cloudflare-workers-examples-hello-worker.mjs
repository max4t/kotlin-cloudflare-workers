import example_Response_rjjrdx from '@cloudflare/workers-types';
//region block: imports
//endregion
//region block: pre-declaration
class Unit {
  toString() {
    return 'kotlin.Unit';
  }
}
class Companion {
  constructor() {
    Companion_instance = this;
    var tmp = this;
    tmp.a_1 = Worker$Companion$fetch$lambda;
    delete this.fetch;
  }
  b(_set____db54di) {
    this.a_1 = _set____db54di;
  }
  c(_set____db54di) {
    return this.b(_set____db54di);
  }
  d() {
    return this.a_1;
  }
}
class Worker {
  constructor() {
    Companion_getInstance();
  }
}
//endregion
function defineProp(obj, name, getter, setter, enumerable) {
  return Object.defineProperty(obj, name, {configurable: true, get: getter, set: setter, enumerable: enumerable});
}
function protoOf(constructor) {
  return constructor.prototype;
}
function createThis(ctor, box) {
  var self_0 = Object.create(ctor.prototype);
  boxApply(self_0, box);
  return self_0;
}
function boxApply(self_0, box) {
  if (box !== VOID) {
    Object.assign(self_0, box);
  }
}
function jsGenerateInterfaceSymbol() {
  return generateInterfaceSymbolById();
}
function createMetadata(kind, name, defaultConstructor, associatedObjectKey, associatedObjects, suspendArity) {
  var undef = VOID;
  return {kind: kind, simpleName: name, associatedObjectKey: associatedObjectKey, associatedObjects: associatedObjects, suspendArity: suspendArity, $kClass$: undef, defaultConstructor: defaultConstructor};
}
function initMetadataForClass(ctor, name, defaultConstructor, parent, interfaces, suspendArity, associatedObjectKey, associatedObjects) {
  var kind = 'class';
  initMetadataFor(kind, ctor, name, defaultConstructor, parent, interfaces, suspendArity, associatedObjectKey, associatedObjects);
}
function initMetadataFor(kind, ctor, name, defaultConstructor, parent, interfaces, suspendArity, associatedObjectKey, associatedObjects) {
  if (!(parent == null)) {
    ctor.prototype = Object.create(parent.prototype);
    ctor.prototype.constructor = ctor;
  }
  var metadata = createMetadata(kind, name, defaultConstructor, associatedObjectKey, associatedObjects, suspendArity);
  ctor.$metadata$ = metadata;
  var prototype = ctor.prototype;
  if (!(interfaces == null)) {
    var inductionVariable = 0;
    var last = interfaces.length;
    while (inductionVariable < last) {
      var i = interfaces[inductionVariable];
      inductionVariable = inductionVariable + 1 | 0;
      Object.assign(prototype, i.prototype);
      prototype[i.Symbol] = true;
    }
  }
  if (kind === 'interface') {
    ctor.Symbol = Symbol();
  }
}
function generateInterfaceSymbolById() {
  return '#__interface_' + generateInterfaceId();
}
function generateInterfaceId() {
  if (globalInterfaceId === VOID) {
    globalInterfaceId = 0;
  }
  // Inline function 'kotlin.js.unsafeCast' call
  globalInterfaceId = globalInterfaceId + 1 | 0;
  return globalInterfaceId;
}
var globalInterfaceId;
function initMetadataForObject(ctor, name, defaultConstructor, parent, interfaces, suspendArity, associatedObjectKey, associatedObjects) {
  var kind = 'object';
  initMetadataFor(kind, ctor, name, defaultConstructor, parent, interfaces, suspendArity, associatedObjectKey, associatedObjects);
}
function initMetadataForLambda(ctor, parent, interfaces, suspendArity) {
  initMetadataForClass(ctor, 'Lambda', VOID, parent, interfaces, suspendArity, VOID, VOID);
}
function initMetadataForCoroutine(ctor, parent, interfaces, suspendArity) {
  initMetadataForClass(ctor, 'Coroutine', VOID, parent, interfaces, suspendArity, VOID, VOID);
}
function initMetadataForFunctionReference(ctor, parent, interfaces, suspendArity) {
  initMetadataForClass(ctor, 'FunctionReference', VOID, parent, interfaces, suspendArity, VOID, VOID);
}
function initMetadataForCompanion(ctor, parent, interfaces, suspendArity) {
  initMetadataForObject(ctor, 'Companion', VOID, parent, interfaces, suspendArity, VOID, VOID);
}
function get_VOID() {
  _init_properties_void_kt__3zg9as();
  return VOID;
}
var VOID;
var properties_initialized_void_kt_e4ret2;
function _init_properties_void_kt__3zg9as() {
  if (!properties_initialized_void_kt_e4ret2) {
    properties_initialized_void_kt_e4ret2 = true;
    VOID = void 0;
  }
}
var Unit_instance;
function Unit_getInstance() {
  return Unit_instance;
}
function Worker$Companion$fetch$lambda(request, _unused_var__etf5q3, _unused_var__etf5q3_0) {
  return Promise.resolve(example_Response_rjjrdx('Hello from Kotlin/JS! You hit ' + request.url));
}
protoOf(Companion)['<set-fetch>'] = protoOf(Companion).c;
var Companion_instance;
function Companion_getInstance() {
  if (Companion_instance === VOID)
    new Companion();
  return Companion_instance;
}
function set_fetch(_set____db54di) {
  Companion_getInstance().a_1 = _set____db54di;
  return Unit_instance;
}
function get_fetch() {
  return Companion_getInstance().a_1;
}
//region block: post-declaration
initMetadataForObject(Unit, 'Unit');
initMetadataForCompanion(Companion);
initMetadataForClass(Worker, 'Worker', Worker);
//endregion
//region block: init
Unit_instance = new Unit();
//endregion
//region block: exports
defineProp(Worker, 'fetch', get_fetch, set_fetch, true);
defineProp(Worker, 'Companion', Companion_getInstance, VOID, true);
export default Worker;
//endregion

//# sourceMappingURL=kotlin-cloudflare-workers-examples-hello-worker.mjs.map
