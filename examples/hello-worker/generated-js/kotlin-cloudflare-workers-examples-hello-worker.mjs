import example_Response_rjjrdx from '@cloudflare/workers-types';
//region block: imports
//endregion
//region block: pre-declaration
class Unit {
  toString() {
    return 'kotlin.Unit';
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
function get_worker() {
  _init_properties_Worker_kt__eidt7m();
  return worker;
}
var worker;
function worker$lambda(request, _unused_var__etf5q3, _unused_var__etf5q3_0) {
  _init_properties_Worker_kt__eidt7m();
  return Promise.resolve(example_Response_rjjrdx('Hello from Kotlin/JS! You hit ' + request.url));
}
var properties_initialized_Worker_kt_gr88g0;
function _init_properties_Worker_kt__eidt7m() {
  if (!properties_initialized_Worker_kt_gr88g0) {
    properties_initialized_Worker_kt_gr88g0 = true;
    // Inline function 'example.SimpleHandler.Companion.invoke' call
    // Inline function 'example.example_SimpleHandler_Companion_kdhjbm_invoke_jkqnwo' call
    worker = {fetch: worker$lambda};
  }
}
//region block: post-declaration
initMetadataForObject(Unit, 'Unit');
//endregion
//region block: init
Unit_instance = new Unit();
//endregion
//region block: exports
var worker_0 = {get: get_worker};
export default worker_0;
//endregion

//# sourceMappingURL=kotlin-cloudflare-workers-examples-hello-worker.mjs.map
