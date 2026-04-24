//region block: polyfills
if (typeof Math.imul === 'undefined') {
  Math.imul = function imul(a, b) {
    return (a & 4.29490176E9) * (b & 65535) + (a & 65535) * (b | 0) | 0;
  };
}
if (typeof ArrayBuffer.isView === 'undefined') {
  ArrayBuffer.isView = function (a) {
    return a != null && a.__proto__ != null && a.__proto__.__proto__ === Int8Array.prototype.__proto__;
  };
}
if (typeof Array.prototype.fill === 'undefined') {
  // Polyfill from https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/fill#Polyfill
  Object.defineProperty(Array.prototype, 'fill', {value: function (value) {
    // Steps 1-2.
    if (this == null) {
      throw new TypeError('this is null or not defined');
    }
    var O = Object(this); // Steps 3-5.
    var len = O.length >>> 0; // Steps 6-7.
    var start = arguments[1];
    var relativeStart = start >> 0; // Step 8.
    var k = relativeStart < 0 ? Math.max(len + relativeStart, 0) : Math.min(relativeStart, len); // Steps 9-10.
    var end = arguments[2];
    var relativeEnd = end === undefined ? len : end >> 0; // Step 11.
    var finalValue = relativeEnd < 0 ? Math.max(len + relativeEnd, 0) : Math.min(relativeEnd, len); // Step 12.
    while (k < finalValue) {
      O[k] = value;
      k++;
    }
    ; // Step 13.
    return O;
  }});
}
[Int8Array, Int16Array, Uint16Array, Int32Array, Float32Array, Float64Array].forEach(function (TypedArray) {
  if (typeof TypedArray.prototype.fill === 'undefined') {
    Object.defineProperty(TypedArray.prototype, 'fill', {value: Array.prototype.fill});
  }
});
if (typeof Math.clz32 === 'undefined') {
  Math.clz32 = function (log, LN2) {
    return function (x) {
      var asUint = x >>> 0;
      if (asUint === 0) {
        return 32;
      }
      return 31 - (log(asUint) / LN2 | 0) | 0; // the "| 0" acts like math.floor
    };
  }(Math.log, Math.LN2);
}
//endregion
import example_Response_rjjrdx from '@cloudflare/workers-types';
//region block: imports
var imul_0 = Math.imul;
var isView = ArrayBuffer.isView;
var clz32 = Math.clz32;
//endregion
//region block: pre-declaration
class CharSequence {}
class Number_0 {}
class Exception extends Error {
  static c7() {
    var $this = createExternalThis(this, Error, [null]);
    setPropertiesToThrowableInstance($this);
    init_kotlin_Exception($this);
    return $this;
  }
  static p1(message) {
    var $this = createExternalThis(this, Error, [message]);
    setPropertiesToThrowableInstance($this, message);
    init_kotlin_Exception($this);
    return $this;
  }
  static d7(message, cause) {
    var $this = createExternalThis(this, Error, [message, setupCauseParameter(cause)]);
    setPropertiesToThrowableInstance($this, message, cause);
    init_kotlin_Exception($this);
    return $this;
  }
}
class RuntimeException extends Exception {
  static y6() {
    var $this = this.c7();
    init_kotlin_RuntimeException($this);
    return $this;
  }
  static v4(message) {
    var $this = this.p1(message);
    init_kotlin_RuntimeException($this);
    return $this;
  }
  static a7(message, cause) {
    var $this = this.d7(message, cause);
    init_kotlin_RuntimeException($this);
    return $this;
  }
}
class IllegalStateException extends RuntimeException {
  static j() {
    var $this = this.y6();
    init_kotlin_IllegalStateException($this);
    return $this;
  }
  static q1(message) {
    var $this = this.v4(message);
    init_kotlin_IllegalStateException($this);
    return $this;
  }
  static l(message, cause) {
    var $this = this.a7(message, cause);
    init_kotlin_IllegalStateException($this);
    return $this;
  }
}
class CancellationException extends IllegalStateException {
  static f() {
    var $this = this.j();
    init_kotlin_coroutines_cancellation_CancellationException($this);
    return $this;
  }
  static k(message, cause) {
    var $this = this.l(message, cause);
    init_kotlin_coroutines_cancellation_CancellationException($this);
    return $this;
  }
}
class Char {}
class Collection {}
class KtList {}
class KtSet {}
class Entry {}
class KtMap {}
class Companion {}
class Enum {
  constructor(name, ordinal) {
    this.g1_1 = name;
    this.h1_1 = ordinal;
  }
  equals(other) {
    return this === other;
  }
  hashCode() {
    return identityHashCode(this);
  }
  toString() {
    return this.g1_1;
  }
}
class Companion_0 {
  constructor() {
    Companion_instance_0 = this;
    this.i1_1 = new Long(0, -2147483648);
    this.j1_1 = new Long(-1, 2147483647);
    this.k1_1 = 8;
    this.l1_1 = 64;
  }
}
class Long extends Number_0 {
  constructor(low, high) {
    Companion_getInstance_0();
    super();
    this.m1_1 = low;
    this.n1_1 = high;
  }
  toString() {
    return toStringImpl(this, 10);
  }
  equals(other) {
    var tmp;
    if (other instanceof Long) {
      tmp = equalsLong(this, other);
    } else {
      tmp = false;
    }
    return tmp;
  }
  hashCode() {
    return hashCode(this);
  }
  valueOf() {
    return toNumber(this);
  }
}
class Unit {
  toString() {
    return 'kotlin.Unit';
  }
}
class AbstractCollection {
  static k2() {
    return createThis(this);
  }
  a1(element) {
    var tmp$ret$0;
    $l$block_0: {
      // Inline function 'kotlin.collections.any' call
      var tmp;
      if (isInterface(this, Collection)) {
        tmp = this.z();
      } else {
        tmp = false;
      }
      if (tmp) {
        tmp$ret$0 = false;
        break $l$block_0;
      }
      var _iterator__ex2g4s = this.v();
      while (_iterator__ex2g4s.w()) {
        var element_0 = _iterator__ex2g4s.x();
        if (equals(element_0, element)) {
          tmp$ret$0 = true;
          break $l$block_0;
        }
      }
      tmp$ret$0 = false;
    }
    return tmp$ret$0;
  }
  c1(elements) {
    var tmp$ret$0;
    $l$block_0: {
      // Inline function 'kotlin.collections.all' call
      var tmp;
      if (isInterface(elements, Collection)) {
        tmp = elements.z();
      } else {
        tmp = false;
      }
      if (tmp) {
        tmp$ret$0 = true;
        break $l$block_0;
      }
      var _iterator__ex2g4s = elements.v();
      while (_iterator__ex2g4s.w()) {
        var element = _iterator__ex2g4s.x();
        if (!this.a1(element)) {
          tmp$ret$0 = false;
          break $l$block_0;
        }
      }
      tmp$ret$0 = true;
    }
    return tmp$ret$0;
  }
  z() {
    return this.y() === 0;
  }
  toString() {
    return joinToString_0(this, ', ', '[', ']', VOID, VOID, AbstractCollection$toString$lambda(this));
  }
  toArray() {
    return collectionToArray(this);
  }
}
class AbstractMutableCollection extends AbstractCollection {
  static j2() {
    return this.k2();
  }
  toJSON() {
    return this.toArray();
  }
  m2() {
  }
}
class IteratorImpl {
  constructor($outer) {
    this.p2_1 = $outer;
    this.n2_1 = 0;
    this.o2_1 = -1;
  }
  w() {
    return this.n2_1 < this.p2_1.y();
  }
  x() {
    if (!this.w())
      throw NoSuchElementException.t2();
    var tmp = this;
    var _unary__edvuaz = this.n2_1;
    this.n2_1 = _unary__edvuaz + 1 | 0;
    tmp.o2_1 = _unary__edvuaz;
    return this.p2_1.b1(this.o2_1);
  }
}
class AbstractMutableList extends AbstractMutableCollection {
  static v2() {
    var $this = this.j2();
    $this.u2_1 = 0;
    return $this;
  }
  l2(element) {
    this.m2();
    this.w2(this.y(), element);
    return true;
  }
  v() {
    return new IteratorImpl(this);
  }
  a1(element) {
    return this.y2(element) >= 0;
  }
  y2(element) {
    var tmp$ret$0;
    $l$block: {
      // Inline function 'kotlin.collections.indexOfFirst' call
      var index = 0;
      var _iterator__ex2g4s = this.v();
      while (_iterator__ex2g4s.w()) {
        var item = _iterator__ex2g4s.x();
        if (equals(item, element)) {
          tmp$ret$0 = index;
          break $l$block;
        }
        index = index + 1 | 0;
      }
      tmp$ret$0 = -1;
    }
    return tmp$ret$0;
  }
  equals(other) {
    if (other === this)
      return true;
    if (!(!(other == null) ? isInterface(other, KtList) : false))
      return false;
    return Companion_instance_3.z2(this, other);
  }
  hashCode() {
    return Companion_instance_3.a3(this);
  }
}
class AbstractMutableSet extends AbstractMutableCollection {
  static b3() {
    return this.j2();
  }
  equals(other) {
    if (other === this)
      return true;
    if (!(!(other == null) ? isInterface(other, KtSet) : false))
      return false;
    return Companion_instance_4.c3(this, other);
  }
  hashCode() {
    return Companion_instance_4.d3(this);
  }
}
class Companion_1 {
  constructor() {
    Companion_instance_1 = this;
    var tmp = this;
    // Inline function 'kotlin.also' call
    var this_0 = ArrayList.h3(0);
    this_0.g3_1 = true;
    tmp.i3_1 = this_0;
  }
}
class ArrayList extends AbstractMutableList {
  static l3(array) {
    Companion_getInstance_1();
    var $this = this.v2();
    $this.f3_1 = array;
    $this.g3_1 = false;
    return $this;
  }
  static m3() {
    Companion_getInstance_1();
    // Inline function 'kotlin.emptyArray' call
    var tmp$ret$0 = [];
    return this.l3(tmp$ret$0);
  }
  static h3(initialCapacity) {
    Companion_getInstance_1();
    // Inline function 'kotlin.emptyArray' call
    var tmp$ret$0 = [];
    var $this = this.l3(tmp$ret$0);
    // Inline function 'kotlin.require' call
    if (!(initialCapacity >= 0)) {
      var message = 'Negative initial capacity: ' + initialCapacity;
      throw IllegalArgumentException.g2(toString_1(message));
    }
    return $this;
  }
  y() {
    return this.f3_1.length;
  }
  b1(index) {
    return this.f3_1[rangeCheck(this, index)];
  }
  l2(element) {
    this.m2();
    // Inline function 'kotlin.js.asDynamic' call
    this.f3_1.push(element);
    this.u2_1 = this.u2_1 + 1 | 0;
    return true;
  }
  w2(index, element) {
    this.m2();
    // Inline function 'kotlin.js.asDynamic' call
    this.f3_1.splice(insertionRangeCheck(this, index), 0, element);
    this.u2_1 = this.u2_1 + 1 | 0;
  }
  x2(index) {
    this.m2();
    rangeCheck(this, index);
    this.u2_1 = this.u2_1 + 1 | 0;
    var tmp;
    if (index === get_lastIndex_0(this)) {
      // Inline function 'kotlin.js.asDynamic' call
      tmp = this.f3_1.pop();
    } else {
      // Inline function 'kotlin.js.asDynamic' call
      tmp = this.f3_1.splice(index, 1)[0];
    }
    return tmp;
  }
  y2(element) {
    return indexOf(this.f3_1, element);
  }
  toString() {
    return arrayToString(this.f3_1);
  }
  n3() {
    return [].slice.call(this.f3_1);
  }
  toArray() {
    return this.n3();
  }
  m2() {
    if (this.g3_1)
      throw UnsupportedOperationException.r3();
  }
}
class HashSet extends AbstractMutableSet {
  static t3(map) {
    var $this = this.b3();
    init_kotlin_collections_HashSet($this);
    $this.s3_1 = map;
    return $this;
  }
  static u3() {
    return this.t3(InternalHashMap.f4());
  }
  static g4(initialCapacity, loadFactor) {
    return this.t3(InternalHashMap.h4(initialCapacity, loadFactor));
  }
  static i4(initialCapacity) {
    return this.g4(initialCapacity, 1.0);
  }
  l2(element) {
    return this.s3_1.j4(element, true) == null;
  }
  a1(element) {
    return this.s3_1.k4(element);
  }
  z() {
    return this.s3_1.y() === 0;
  }
  v() {
    return this.s3_1.l4();
  }
  y() {
    return this.s3_1.y();
  }
}
class Companion_2 {
  constructor() {
    this.z4_1 = -1640531527;
    this.a5_1 = 8;
    this.b5_1 = 2;
    this.c5_1 = -1;
  }
}
class Itr {
  constructor(map) {
    this.d5_1 = map;
    this.e5_1 = 0;
    this.f5_1 = -1;
    this.g5_1 = this.d5_1.c4_1;
    this.h5();
  }
  h5() {
    while (this.e5_1 < this.d5_1.a4_1 && this.d5_1.x3_1[this.e5_1] < 0) {
      this.e5_1 = this.e5_1 + 1 | 0;
    }
  }
  w() {
    return this.e5_1 < this.d5_1.a4_1;
  }
  i5() {
    if (!(this.d5_1.c4_1 === this.g5_1))
      throw ConcurrentModificationException.j5();
  }
}
class KeysItr extends Itr {
  x() {
    this.i5();
    if (this.e5_1 >= this.d5_1.a4_1)
      throw NoSuchElementException.t2();
    var tmp = this;
    var _unary__edvuaz = this.e5_1;
    this.e5_1 = _unary__edvuaz + 1 | 0;
    tmp.f5_1 = _unary__edvuaz;
    var result = this.d5_1.v3_1[this.f5_1];
    this.h5();
    return result;
  }
}
class EntriesItr extends Itr {
  x() {
    this.i5();
    if (this.e5_1 >= this.d5_1.a4_1)
      throw NoSuchElementException.t2();
    var tmp = this;
    var _unary__edvuaz = this.e5_1;
    this.e5_1 = _unary__edvuaz + 1 | 0;
    tmp.f5_1 = _unary__edvuaz;
    var result = new EntryRef(this.d5_1, this.f5_1);
    this.h5();
    return result;
  }
  s5() {
    if (this.e5_1 >= this.d5_1.a4_1)
      throw NoSuchElementException.t2();
    var tmp = this;
    var _unary__edvuaz = this.e5_1;
    this.e5_1 = _unary__edvuaz + 1 | 0;
    tmp.f5_1 = _unary__edvuaz;
    // Inline function 'kotlin.hashCode' call
    var tmp0_safe_receiver = this.d5_1.v3_1[this.f5_1];
    var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : hashCode_0(tmp0_safe_receiver);
    var tmp_0 = tmp1_elvis_lhs == null ? 0 : tmp1_elvis_lhs;
    // Inline function 'kotlin.hashCode' call
    var tmp0_safe_receiver_0 = ensureNotNull(this.d5_1.w3_1)[this.f5_1];
    var tmp1_elvis_lhs_0 = tmp0_safe_receiver_0 == null ? null : hashCode_0(tmp0_safe_receiver_0);
    var result = tmp_0 ^ (tmp1_elvis_lhs_0 == null ? 0 : tmp1_elvis_lhs_0);
    this.h5();
    return result;
  }
  t5(sb) {
    if (this.e5_1 >= this.d5_1.a4_1)
      throw NoSuchElementException.t2();
    var tmp = this;
    var _unary__edvuaz = this.e5_1;
    this.e5_1 = _unary__edvuaz + 1 | 0;
    tmp.f5_1 = _unary__edvuaz;
    var key = this.d5_1.v3_1[this.f5_1];
    if (equals(key, this.d5_1))
      sb.v5('(this Map)');
    else
      sb.u5(key);
    sb.w5(_Char___init__impl__6a9atx(61));
    var value = ensureNotNull(this.d5_1.w3_1)[this.f5_1];
    if (equals(value, this.d5_1))
      sb.v5('(this Map)');
    else
      sb.u5(value);
    this.h5();
  }
}
class EntryRef {
  constructor(map, index) {
    this.q4_1 = map;
    this.r4_1 = index;
    this.s4_1 = this.q4_1.c4_1;
  }
  d1() {
    checkForComodification(this);
    return this.q4_1.v3_1[this.r4_1];
  }
  e1() {
    checkForComodification(this);
    return ensureNotNull(this.q4_1.w3_1)[this.r4_1];
  }
  equals(other) {
    var tmp;
    var tmp_0;
    if (!(other == null) ? isInterface(other, Entry) : false) {
      tmp_0 = equals(other.d1(), this.d1());
    } else {
      tmp_0 = false;
    }
    if (tmp_0) {
      tmp = equals(other.e1(), this.e1());
    } else {
      tmp = false;
    }
    return tmp;
  }
  hashCode() {
    // Inline function 'kotlin.hashCode' call
    var tmp0_safe_receiver = this.d1();
    var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : hashCode_0(tmp0_safe_receiver);
    var tmp = tmp1_elvis_lhs == null ? 0 : tmp1_elvis_lhs;
    // Inline function 'kotlin.hashCode' call
    var tmp0_safe_receiver_0 = this.e1();
    var tmp1_elvis_lhs_0 = tmp0_safe_receiver_0 == null ? null : hashCode_0(tmp0_safe_receiver_0);
    return tmp ^ (tmp1_elvis_lhs_0 == null ? 0 : tmp1_elvis_lhs_0);
  }
  toString() {
    return toString_0(this.d1()) + '=' + toString_0(this.e1());
  }
}
class InternalMap {}
function containsAllEntries(m) {
  var tmp$ret$0;
  $l$block_0: {
    // Inline function 'kotlin.collections.all' call
    var tmp;
    if (isInterface(m, Collection)) {
      tmp = m.z();
    } else {
      tmp = false;
    }
    if (tmp) {
      tmp$ret$0 = true;
      break $l$block_0;
    }
    var _iterator__ex2g4s = m.v();
    while (_iterator__ex2g4s.w()) {
      var element = _iterator__ex2g4s.x();
      // Inline function 'kotlin.js.unsafeCast' call
      // Inline function 'kotlin.js.asDynamic' call
      var entry = element;
      var tmp_0;
      if (!(entry == null) ? isInterface(entry, Entry) : false) {
        tmp_0 = this.c6(entry);
      } else {
        tmp_0 = false;
      }
      if (!tmp_0) {
        tmp$ret$0 = false;
        break $l$block_0;
      }
    }
    tmp$ret$0 = true;
  }
  return tmp$ret$0;
}
class InternalHashMap {
  static x5(keysArray, valuesArray, presenceArray, hashArray, maxProbeDistance, length) {
    var $this = createThis(this);
    $this.v3_1 = keysArray;
    $this.w3_1 = valuesArray;
    $this.x3_1 = presenceArray;
    $this.y3_1 = hashArray;
    $this.z3_1 = maxProbeDistance;
    $this.a4_1 = length;
    $this.b4_1 = computeShift(Companion_instance_2, _get_hashSize__tftcho($this));
    $this.c4_1 = 0;
    $this.d4_1 = 0;
    $this.e4_1 = false;
    return $this;
  }
  y() {
    return this.d4_1;
  }
  static f4() {
    return this.y5(8);
  }
  static y5(initialCapacity) {
    return this.x5(arrayOfUninitializedElements(initialCapacity), null, new Int32Array(initialCapacity), new Int32Array(computeHashSize(Companion_instance_2, initialCapacity)), 2, 0);
  }
  static h4(initialCapacity, loadFactor) {
    var $this = this.y5(initialCapacity);
    // Inline function 'kotlin.require' call
    if (!(loadFactor > 0)) {
      var message = 'Non-positive load factor: ' + loadFactor;
      throw IllegalArgumentException.g2(toString_1(message));
    }
    return $this;
  }
  k4(key) {
    return findKey(this, key) >= 0;
  }
  j4(key, value) {
    var index = addKey(this, key);
    var valuesArray = allocateValuesArray(this);
    if (index < 0) {
      var oldValue = valuesArray[(-index | 0) - 1 | 0];
      valuesArray[(-index | 0) - 1 | 0] = value;
      return oldValue;
    } else {
      valuesArray[index] = value;
      return null;
    }
  }
  equals(other) {
    var tmp;
    if (other === this) {
      tmp = true;
    } else {
      var tmp_0;
      if (!(other == null) ? isInterface(other, KtMap) : false) {
        tmp_0 = contentEquals(this, other);
      } else {
        tmp_0 = false;
      }
      tmp = tmp_0;
    }
    return tmp;
  }
  hashCode() {
    var result = 0;
    var it = this.z5();
    while (it.w()) {
      result = result + it.s5() | 0;
    }
    return result;
  }
  toString() {
    var sb = StringBuilder.a6(2 + imul_0(this.d4_1, 3) | 0);
    sb.v5('{');
    var i = 0;
    var it = this.z5();
    while (it.w()) {
      if (i > 0) {
        sb.v5(', ');
      }
      it.t5(sb);
      i = i + 1 | 0;
    }
    sb.v5('}');
    return sb.toString();
  }
  x4() {
    if (this.e4_1)
      throw UnsupportedOperationException.r3();
  }
  b6(entry) {
    var index = findKey(this, entry.d1());
    if (index < 0)
      return false;
    return equals(ensureNotNull(this.w3_1)[index], entry.e1());
  }
  c6(entry) {
    return this.b6(isInterface(entry, Entry) ? entry : THROW_CCE());
  }
  l4() {
    return new KeysItr(this);
  }
  z5() {
    return new EntriesItr(this);
  }
}
class LinkedHashSet extends HashSet {
  static e6() {
    var $this = this.u3();
    init_kotlin_collections_LinkedHashSet($this);
    return $this;
  }
}
class CompletedContinuation {
  f6() {
    // Inline function 'kotlin.error' call
    var message = 'This continuation is already complete';
    throw IllegalStateException.q1(toString_1(message));
  }
  g6(result) {
    // Inline function 'kotlin.error' call
    var message = 'This continuation is already complete';
    throw IllegalStateException.q1(toString_1(message));
  }
  h6(result) {
    return this.g6(result);
  }
  toString() {
    return 'This continuation is already complete';
  }
}
class InterceptedCoroutine {
  constructor() {
    this.o6_1 = null;
  }
  q6() {
    var tmp0_elvis_lhs = this.o6_1;
    var tmp;
    if (tmp0_elvis_lhs == null) {
      var tmp1_safe_receiver = this.f6().r6(Key_instance);
      var tmp2_elvis_lhs = tmp1_safe_receiver == null ? null : tmp1_safe_receiver.s6(this);
      // Inline function 'kotlin.also' call
      var this_0 = tmp2_elvis_lhs == null ? this : tmp2_elvis_lhs;
      this.o6_1 = this_0;
      tmp = this_0;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    return tmp;
  }
  p6() {
    var intercepted = this.o6_1;
    if (!(intercepted == null) && !(intercepted === this)) {
      ensureNotNull(this.f6().r6(Key_instance)).t6(intercepted);
    }
    this.o6_1 = CompletedContinuation_instance;
  }
}
class GeneratorCoroutineImpl extends InterceptedCoroutine {
  constructor(resultContinuation) {
    super();
    this.j6_1 = resultContinuation;
    var tmp = this;
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    tmp.k6_1 = VOID;
    var tmp_0 = this;
    var tmp0_safe_receiver = this.j6_1;
    tmp_0.l6_1 = tmp0_safe_receiver == null ? null : tmp0_safe_receiver.f6();
  }
  f6() {
    return ensureNotNull(this.l6_1);
  }
  m6(result) {
    var suspended = get_COROUTINE_SUSPENDED();
    var e = Result__exceptionOrNull_impl_p6xea9(result);
    var stepResult = e == null ? this.k6_1.next(_Result___get_value__impl__bjfvqg(result)) : this.k6_1.throw(e);
    var done = stepResult.done;
    var value = stepResult.value;
    $l$loop_0: while (!done) {
      try {
        // Inline function 'kotlin.js.unsafeCast' call
        // Inline function 'kotlin.js.asDynamic' call
        value = value();
      } catch ($p) {
        var e_0 = $p;
        var nextStep = this.k6_1.throw(e_0);
        value = nextStep.value;
        done = nextStep.done;
        continue $l$loop_0;
      }
      if (value === suspended)
        break $l$loop_0;
      var nextStep_0 = this.k6_1.next(value);
      value = nextStep_0.value;
      done = nextStep_0.done;
    }
    return value;
  }
  n6(result, $super) {
    result = result === VOID ? _Result___init__impl__xyqfz8(null) : result;
    return $super === VOID ? this.m6(result) : $super.m6.call(this, new Result(result));
  }
  g6(result) {
    var exception = null;
    var tmp;
    try {
      tmp = this.m6(result);
    } catch ($p) {
      var tmp_0;
      if ($p instanceof Error) {
        var e = $p;
        exception = e;
        tmp_0 = null;
      } else {
        throw $p;
      }
      tmp = tmp_0;
    }
    var nextResult = tmp;
    if (nextResult === get_COROUTINE_SUSPENDED())
      return Unit_instance;
    this.p6();
    var tmp0_safe_receiver = this.j6_1;
    if (tmp0_safe_receiver == null)
      null;
    else {
      // Inline function 'kotlin.run' call
      if (!(exception == null)) {
        // Inline function 'kotlin.coroutines.resumeWithException' call
        // Inline function 'kotlin.Companion.failure' call
        var exception_0 = exception;
        var tmp$ret$3 = _Result___init__impl__xyqfz8(createFailure(exception_0));
        tmp0_safe_receiver.h6(tmp$ret$3);
      } else {
        // Inline function 'kotlin.coroutines.resume' call
        // Inline function 'kotlin.Companion.success' call
        var tmp$ret$5 = _Result___init__impl__xyqfz8(nextResult);
        tmp0_safe_receiver.h6(tmp$ret$5);
      }
    }
  }
  h6(result) {
    return this.g6(result);
  }
}
class UnsupportedOperationException extends RuntimeException {
  static r3() {
    var $this = this.y6();
    init_kotlin_UnsupportedOperationException($this);
    return $this;
  }
  static z6(message) {
    var $this = this.v4(message);
    init_kotlin_UnsupportedOperationException($this);
    return $this;
  }
}
class IllegalArgumentException extends RuntimeException {
  static b7() {
    var $this = this.y6();
    init_kotlin_IllegalArgumentException($this);
    return $this;
  }
  static g2(message) {
    var $this = this.v4(message);
    init_kotlin_IllegalArgumentException($this);
    return $this;
  }
}
class NoSuchElementException extends RuntimeException {
  static t2() {
    var $this = this.y6();
    init_kotlin_NoSuchElementException($this);
    return $this;
  }
  static e7(message) {
    var $this = this.v4(message);
    init_kotlin_NoSuchElementException($this);
    return $this;
  }
}
class IndexOutOfBoundsException extends RuntimeException {
  static i7() {
    var $this = this.y6();
    init_kotlin_IndexOutOfBoundsException($this);
    return $this;
  }
  static j7(message) {
    var $this = this.v4(message);
    init_kotlin_IndexOutOfBoundsException($this);
    return $this;
  }
}
class Error_0 extends Error {
  static l7() {
    var $this = createExternalThis(this, Error, [null]);
    setPropertiesToThrowableInstance($this);
    init_kotlin_Error($this);
    return $this;
  }
  static m7(message) {
    var $this = createExternalThis(this, Error, [message]);
    setPropertiesToThrowableInstance($this, message);
    init_kotlin_Error($this);
    return $this;
  }
  static n7(message, cause) {
    var $this = createExternalThis(this, Error, [message, setupCauseParameter(cause)]);
    setPropertiesToThrowableInstance($this, message, cause);
    init_kotlin_Error($this);
    return $this;
  }
}
class ConcurrentModificationException extends RuntimeException {
  static j5() {
    var $this = this.y6();
    init_kotlin_ConcurrentModificationException($this);
    return $this;
  }
  static p4(message) {
    var $this = this.v4(message);
    init_kotlin_ConcurrentModificationException($this);
    return $this;
  }
}
class UninitializedPropertyAccessException extends RuntimeException {
  static o7() {
    var $this = this.y6();
    init_kotlin_UninitializedPropertyAccessException($this);
    return $this;
  }
  static r(message) {
    var $this = this.v4(message);
    init_kotlin_UninitializedPropertyAccessException($this);
    return $this;
  }
}
class NoWhenBranchMatchedException extends RuntimeException {
  static u1() {
    var $this = this.y6();
    init_kotlin_NoWhenBranchMatchedException($this);
    return $this;
  }
}
class NullPointerException extends RuntimeException {
  static y1() {
    var $this = this.y6();
    init_kotlin_NullPointerException($this);
    return $this;
  }
}
class ClassCastException extends RuntimeException {
  static c2() {
    var $this = this.y6();
    init_kotlin_ClassCastException($this);
    return $this;
  }
}
class KClass {}
class KClassImpl {
  equals(other) {
    var tmp;
    if (other instanceof NothingKClassImpl) {
      tmp = false;
    } else {
      if (other instanceof KClassImpl) {
        tmp = equals(this.t7(), other.t7());
      } else {
        tmp = false;
      }
    }
    return tmp;
  }
  hashCode() {
    var tmp0_safe_receiver = this.p7();
    var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : getStringHashCode(tmp0_safe_receiver);
    return tmp1_elvis_lhs == null ? 0 : tmp1_elvis_lhs;
  }
  toString() {
    return 'class ' + this.p7();
  }
}
class PrimitiveKClassImpl extends KClassImpl {
  constructor(jClass, givenSimpleName, isInstanceFunction) {
    super();
    this.q7_1 = jClass;
    this.r7_1 = givenSimpleName;
    this.s7_1 = isInstanceFunction;
  }
  t7() {
    return this.q7_1;
  }
  equals(other) {
    if (!(other instanceof PrimitiveKClassImpl))
      return false;
    return super.equals(other) && this.r7_1 === other.r7_1;
  }
  p7() {
    return this.r7_1;
  }
}
class NothingKClassImpl extends KClassImpl {
  constructor() {
    NothingKClassImpl_instance = null;
    super();
    NothingKClassImpl_instance = this;
    this.u7_1 = 'Nothing';
  }
  p7() {
    return this.u7_1;
  }
  t7() {
    throw UnsupportedOperationException.z6("There's no native JS class for Nothing type");
  }
  equals(other) {
    return other === this;
  }
  hashCode() {
    return 0;
  }
}
class SimpleKClassImpl extends KClassImpl {
  constructor(jClass) {
    super();
    this.v7_1 = jClass;
    var tmp = this;
    // Inline function 'kotlin.js.asDynamic' call
    var tmp0_safe_receiver = this.v7_1.$metadata$;
    // Inline function 'kotlin.js.unsafeCast' call
    tmp.w7_1 = tmp0_safe_receiver == null ? null : tmp0_safe_receiver.simpleName;
  }
  t7() {
    return this.v7_1;
  }
  p7() {
    return this.w7_1;
  }
}
class PrimitiveClasses {
  constructor() {
    PrimitiveClasses_instance = this;
    var tmp = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_0 = Object;
    tmp.anyClass = new PrimitiveKClassImpl(tmp_0, 'Any', PrimitiveClasses$anyClass$lambda);
    var tmp_1 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_2 = Number;
    tmp_1.numberClass = new PrimitiveKClassImpl(tmp_2, 'Number', PrimitiveClasses$numberClass$lambda);
    this.nothingClass = NothingKClassImpl_getInstance();
    var tmp_3 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_4 = Boolean;
    tmp_3.booleanClass = new PrimitiveKClassImpl(tmp_4, 'Boolean', PrimitiveClasses$booleanClass$lambda);
    var tmp_5 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_6 = Number;
    tmp_5.byteClass = new PrimitiveKClassImpl(tmp_6, 'Byte', PrimitiveClasses$byteClass$lambda);
    var tmp_7 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_8 = Number;
    tmp_7.shortClass = new PrimitiveKClassImpl(tmp_8, 'Short', PrimitiveClasses$shortClass$lambda);
    var tmp_9 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_10 = Number;
    tmp_9.intClass = new PrimitiveKClassImpl(tmp_10, 'Int', PrimitiveClasses$intClass$lambda);
    var tmp_11 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    var tmp_12 = typeof BigInt === 'undefined' ? VOID : BigInt;
    tmp_11.longClass = new PrimitiveKClassImpl(tmp_12, 'Long', PrimitiveClasses$longClass$lambda);
    var tmp_13 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_14 = Number;
    tmp_13.floatClass = new PrimitiveKClassImpl(tmp_14, 'Float', PrimitiveClasses$floatClass$lambda);
    var tmp_15 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_16 = Number;
    tmp_15.doubleClass = new PrimitiveKClassImpl(tmp_16, 'Double', PrimitiveClasses$doubleClass$lambda);
    var tmp_17 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_18 = Array;
    tmp_17.arrayClass = new PrimitiveKClassImpl(tmp_18, 'Array', PrimitiveClasses$arrayClass$lambda);
    var tmp_19 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_20 = String;
    tmp_19.stringClass = new PrimitiveKClassImpl(tmp_20, 'String', PrimitiveClasses$stringClass$lambda);
    var tmp_21 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_22 = Error;
    tmp_21.throwableClass = new PrimitiveKClassImpl(tmp_22, 'Throwable', PrimitiveClasses$throwableClass$lambda);
    var tmp_23 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_24 = Array;
    tmp_23.booleanArrayClass = new PrimitiveKClassImpl(tmp_24, 'BooleanArray', PrimitiveClasses$booleanArrayClass$lambda);
    var tmp_25 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_26 = Uint16Array;
    tmp_25.charArrayClass = new PrimitiveKClassImpl(tmp_26, 'CharArray', PrimitiveClasses$charArrayClass$lambda);
    var tmp_27 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_28 = Int8Array;
    tmp_27.byteArrayClass = new PrimitiveKClassImpl(tmp_28, 'ByteArray', PrimitiveClasses$byteArrayClass$lambda);
    var tmp_29 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_30 = Int16Array;
    tmp_29.shortArrayClass = new PrimitiveKClassImpl(tmp_30, 'ShortArray', PrimitiveClasses$shortArrayClass$lambda);
    var tmp_31 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_32 = Int32Array;
    tmp_31.intArrayClass = new PrimitiveKClassImpl(tmp_32, 'IntArray', PrimitiveClasses$intArrayClass$lambda);
    var tmp_33 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_34 = Float32Array;
    tmp_33.floatArrayClass = new PrimitiveKClassImpl(tmp_34, 'FloatArray', PrimitiveClasses$floatArrayClass$lambda);
    var tmp_35 = this;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp_36 = Float64Array;
    tmp_35.doubleArrayClass = new PrimitiveKClassImpl(tmp_36, 'DoubleArray', PrimitiveClasses$doubleArrayClass$lambda);
  }
  x7() {
    return this.anyClass;
  }
  y7() {
    return this.numberClass;
  }
  z7() {
    return this.nothingClass;
  }
  a8() {
    return this.booleanClass;
  }
  b8() {
    return this.byteClass;
  }
  c8() {
    return this.shortClass;
  }
  d8() {
    return this.intClass;
  }
  e8() {
    return this.longClass;
  }
  f8() {
    return this.floatClass;
  }
  g8() {
    return this.doubleClass;
  }
  h8() {
    return this.arrayClass;
  }
  i8() {
    return this.stringClass;
  }
  j8() {
    return this.throwableClass;
  }
  k8() {
    return this.booleanArrayClass;
  }
  l8() {
    return this.charArrayClass;
  }
  m8() {
    return this.byteArrayClass;
  }
  n8() {
    return this.shortArrayClass;
  }
  o8() {
    return this.intArrayClass;
  }
  p8() {
    return this.floatArrayClass;
  }
  q8() {
    return this.doubleArrayClass;
  }
  functionClass(arity) {
    var tmp0_elvis_lhs = get_functionClasses()[arity];
    var tmp;
    if (tmp0_elvis_lhs == null) {
      // Inline function 'kotlin.run' call
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp_0 = Function;
      var tmp_1 = 'Function' + arity;
      var result = new PrimitiveKClassImpl(tmp_0, tmp_1, PrimitiveClasses$functionClass$lambda(arity));
      // Inline function 'kotlin.js.asDynamic' call
      get_functionClasses()[arity] = result;
      tmp = result;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    return tmp;
  }
}
class StringBuilder {
  static r8(content) {
    var $this = createThis(this);
    $this.s_1 = content;
    return $this;
  }
  static a6(capacity) {
    return this.t();
  }
  static t() {
    return this.r8('');
  }
  a() {
    // Inline function 'kotlin.js.asDynamic' call
    return this.s_1.length;
  }
  w5(value) {
    this.s_1 = this.s_1 + toString(value);
    return this;
  }
  u(value) {
    this.s_1 = this.s_1 + toString_0(value);
    return this;
  }
  u5(value) {
    this.s_1 = this.s_1 + toString_0(value);
    return this;
  }
  v5(value) {
    var tmp = this;
    var tmp_0 = this.s_1;
    tmp.s_1 = tmp_0 + (value == null ? 'null' : value);
    return this;
  }
  toString() {
    return this.s_1;
  }
}
class Companion_3 {
  constructor() {
    this.h2_1 = 2147483639;
  }
  j3(index, size) {
    if (index < 0 || index >= size) {
      throw IndexOutOfBoundsException.j7('index: ' + index + ', size: ' + size);
    }
  }
  k3(index, size) {
    if (index < 0 || index > size) {
      throw IndexOutOfBoundsException.j7('index: ' + index + ', size: ' + size);
    }
  }
  i2(fromIndex, toIndex, size) {
    if (fromIndex < 0 || toIndex > size) {
      throw IndexOutOfBoundsException.j7('fromIndex: ' + fromIndex + ', toIndex: ' + toIndex + ', size: ' + size);
    }
    if (fromIndex > toIndex) {
      throw IllegalArgumentException.g2('fromIndex: ' + fromIndex + ' > toIndex: ' + toIndex);
    }
  }
  w4(oldCapacity, minCapacity) {
    var newCapacity = oldCapacity + (oldCapacity >> 1) | 0;
    if ((newCapacity - minCapacity | 0) < 0)
      newCapacity = minCapacity;
    if ((newCapacity - 2147483639 | 0) > 0)
      newCapacity = minCapacity > 2147483639 ? 2147483647 : 2147483639;
    return newCapacity;
  }
  a3(c) {
    var hashCode = 1;
    var _iterator__ex2g4s = c.v();
    while (_iterator__ex2g4s.w()) {
      var e = _iterator__ex2g4s.x();
      var tmp = imul_0(31, hashCode);
      var tmp1_elvis_lhs = e == null ? null : hashCode_0(e);
      hashCode = tmp + (tmp1_elvis_lhs == null ? 0 : tmp1_elvis_lhs) | 0;
    }
    return hashCode;
  }
  z2(c, other) {
    if (!(c.y() === other.y()))
      return false;
    var otherIterator = other.v();
    var _iterator__ex2g4s = c.v();
    while (_iterator__ex2g4s.w()) {
      var elem = _iterator__ex2g4s.x();
      var elemOther = otherIterator.x();
      if (!equals(elem, elemOther)) {
        return false;
      }
    }
    return true;
  }
}
class Companion_4 {
  d3(c) {
    var hashCode = 0;
    var _iterator__ex2g4s = c.v();
    while (_iterator__ex2g4s.w()) {
      var element = _iterator__ex2g4s.x();
      var tmp = hashCode;
      var tmp1_elvis_lhs = element == null ? null : hashCode_0(element);
      hashCode = tmp + (tmp1_elvis_lhs == null ? 0 : tmp1_elvis_lhs) | 0;
    }
    return hashCode;
  }
  c3(c, other) {
    if (!(c.y() === other.y()))
      return false;
    return c.c1(other);
  }
}
class Companion_5 {
  constructor() {
    Companion_instance_5 = this;
    var tmp = this;
    // Inline function 'kotlin.emptyArray' call
    tmp.w8_1 = [];
    this.x8_1 = 10;
  }
}
class ArrayDeque extends AbstractMutableList {
  y() {
    return this.v8_1;
  }
  static y8() {
    Companion_getInstance_5();
    var $this = this.v2();
    init_kotlin_collections_ArrayDeque($this);
    $this.u8_1 = Companion_getInstance_5().w8_1;
    return $this;
  }
  z() {
    return this.v8_1 === 0;
  }
  z8(element) {
    registerModification_0(this);
    ensureCapacity_0(this, this.v8_1 + 1 | 0);
    this.t8_1 = decremented(this, this.t8_1);
    this.u8_1[this.t8_1] = element;
    this.v8_1 = this.v8_1 + 1 | 0;
  }
  a9(element) {
    registerModification_0(this);
    ensureCapacity_0(this, this.v8_1 + 1 | 0);
    var tmp = this.u8_1;
    // Inline function 'kotlin.collections.ArrayDeque.internalIndex' call
    var index = this.v8_1;
    tmp[positiveMod(this, this.t8_1 + index | 0)] = element;
    this.v8_1 = this.v8_1 + 1 | 0;
  }
  b9() {
    if (this.z())
      throw NoSuchElementException.e7('ArrayDeque is empty.');
    registerModification_0(this);
    // Inline function 'kotlin.collections.ArrayDeque.internalGet' call
    var internalIndex = this.t8_1;
    var element = this.u8_1[internalIndex];
    this.u8_1[this.t8_1] = null;
    this.t8_1 = incremented(this, this.t8_1);
    this.v8_1 = this.v8_1 - 1 | 0;
    return element;
  }
  c9() {
    return this.z() ? null : this.b9();
  }
  d9() {
    if (this.z())
      throw NoSuchElementException.e7('ArrayDeque is empty.');
    registerModification_0(this);
    // Inline function 'kotlin.collections.ArrayDeque.internalIndex' call
    var index = get_lastIndex_0(this);
    var internalLastIndex = positiveMod(this, this.t8_1 + index | 0);
    // Inline function 'kotlin.collections.ArrayDeque.internalGet' call
    var element = this.u8_1[internalLastIndex];
    this.u8_1[internalLastIndex] = null;
    this.v8_1 = this.v8_1 - 1 | 0;
    return element;
  }
  l2(element) {
    this.a9(element);
    return true;
  }
  w2(index, element) {
    Companion_instance_3.k3(index, this.v8_1);
    if (index === this.v8_1) {
      this.a9(element);
      return Unit_instance;
    } else if (index === 0) {
      this.z8(element);
      return Unit_instance;
    }
    registerModification_0(this);
    ensureCapacity_0(this, this.v8_1 + 1 | 0);
    // Inline function 'kotlin.collections.ArrayDeque.internalIndex' call
    var internalIndex = positiveMod(this, this.t8_1 + index | 0);
    if (index < (this.v8_1 + 1 | 0) >> 1) {
      var decrementedInternalIndex = decremented(this, internalIndex);
      var decrementedHead = decremented(this, this.t8_1);
      if (decrementedInternalIndex >= this.t8_1) {
        this.u8_1[decrementedHead] = this.u8_1[this.t8_1];
        var tmp0 = this.u8_1;
        var tmp2 = this.u8_1;
        var tmp4 = this.t8_1;
        var tmp6 = this.t8_1 + 1 | 0;
        // Inline function 'kotlin.collections.copyInto' call
        var endIndex = decrementedInternalIndex + 1 | 0;
        arrayCopy(tmp0, tmp2, tmp4, tmp6, endIndex);
      } else {
        var tmp0_0 = this.u8_1;
        var tmp2_0 = this.u8_1;
        var tmp4_0 = this.t8_1 - 1 | 0;
        var tmp6_0 = this.t8_1;
        // Inline function 'kotlin.collections.copyInto' call
        var endIndex_0 = this.u8_1.length;
        arrayCopy(tmp0_0, tmp2_0, tmp4_0, tmp6_0, endIndex_0);
        this.u8_1[this.u8_1.length - 1 | 0] = this.u8_1[0];
        var tmp0_1 = this.u8_1;
        var tmp2_1 = this.u8_1;
        // Inline function 'kotlin.collections.copyInto' call
        var endIndex_1 = decrementedInternalIndex + 1 | 0;
        arrayCopy(tmp0_1, tmp2_1, 0, 1, endIndex_1);
      }
      this.u8_1[decrementedInternalIndex] = element;
      this.t8_1 = decrementedHead;
    } else {
      // Inline function 'kotlin.collections.ArrayDeque.internalIndex' call
      var index_0 = this.v8_1;
      var tail = positiveMod(this, this.t8_1 + index_0 | 0);
      if (internalIndex < tail) {
        var tmp0_2 = this.u8_1;
        var tmp2_2 = this.u8_1;
        // Inline function 'kotlin.collections.copyInto' call
        var destinationOffset = internalIndex + 1 | 0;
        arrayCopy(tmp0_2, tmp2_2, destinationOffset, internalIndex, tail);
      } else {
        var tmp0_3 = this.u8_1;
        // Inline function 'kotlin.collections.copyInto' call
        var destination = this.u8_1;
        arrayCopy(tmp0_3, destination, 1, 0, tail);
        this.u8_1[0] = this.u8_1[this.u8_1.length - 1 | 0];
        var tmp0_4 = this.u8_1;
        var tmp2_3 = this.u8_1;
        var tmp4_1 = internalIndex + 1 | 0;
        // Inline function 'kotlin.collections.copyInto' call
        var endIndex_2 = this.u8_1.length - 1 | 0;
        arrayCopy(tmp0_4, tmp2_3, tmp4_1, internalIndex, endIndex_2);
      }
      this.u8_1[internalIndex] = element;
    }
    this.v8_1 = this.v8_1 + 1 | 0;
  }
  b1(index) {
    Companion_instance_3.j3(index, this.v8_1);
    // Inline function 'kotlin.collections.ArrayDeque.internalIndex' call
    // Inline function 'kotlin.collections.ArrayDeque.internalGet' call
    var internalIndex = positiveMod(this, this.t8_1 + index | 0);
    return this.u8_1[internalIndex];
  }
  a1(element) {
    return !(this.y2(element) === -1);
  }
  y2(element) {
    // Inline function 'kotlin.collections.ArrayDeque.internalIndex' call
    var index = this.v8_1;
    var tail = positiveMod(this, this.t8_1 + index | 0);
    if (this.t8_1 < tail) {
      var inductionVariable = this.t8_1;
      if (inductionVariable < tail)
        do {
          var index_0 = inductionVariable;
          inductionVariable = inductionVariable + 1 | 0;
          if (equals(element, this.u8_1[index_0]))
            return index_0 - this.t8_1 | 0;
        }
         while (inductionVariable < tail);
    } else {
      var tmp;
      // Inline function 'kotlin.collections.isNotEmpty' call
      if (!this.z()) {
        tmp = this.t8_1 >= tail;
      } else {
        tmp = false;
      }
      if (tmp) {
        var inductionVariable_0 = this.t8_1;
        var last = this.u8_1.length;
        if (inductionVariable_0 < last)
          do {
            var index_1 = inductionVariable_0;
            inductionVariable_0 = inductionVariable_0 + 1 | 0;
            if (equals(element, this.u8_1[index_1]))
              return index_1 - this.t8_1 | 0;
          }
           while (inductionVariable_0 < last);
        var inductionVariable_1 = 0;
        if (inductionVariable_1 < tail)
          do {
            var index_2 = inductionVariable_1;
            inductionVariable_1 = inductionVariable_1 + 1 | 0;
            if (equals(element, this.u8_1[index_2]))
              return (index_2 + this.u8_1.length | 0) - this.t8_1 | 0;
          }
           while (inductionVariable_1 < tail);
      }
    }
    return -1;
  }
  x2(index) {
    Companion_instance_3.j3(index, this.v8_1);
    if (index === get_lastIndex_0(this)) {
      return this.d9();
    } else if (index === 0) {
      return this.b9();
    }
    registerModification_0(this);
    // Inline function 'kotlin.collections.ArrayDeque.internalIndex' call
    var internalIndex = positiveMod(this, this.t8_1 + index | 0);
    // Inline function 'kotlin.collections.ArrayDeque.internalGet' call
    var element = this.u8_1[internalIndex];
    if (index < this.v8_1 >> 1) {
      if (internalIndex >= this.t8_1) {
        var tmp0 = this.u8_1;
        var tmp2 = this.u8_1;
        var tmp4 = this.t8_1 + 1 | 0;
        // Inline function 'kotlin.collections.copyInto' call
        var startIndex = this.t8_1;
        arrayCopy(tmp0, tmp2, tmp4, startIndex, internalIndex);
      } else {
        var tmp0_0 = this.u8_1;
        // Inline function 'kotlin.collections.copyInto' call
        var destination = this.u8_1;
        arrayCopy(tmp0_0, destination, 1, 0, internalIndex);
        this.u8_1[0] = this.u8_1[this.u8_1.length - 1 | 0];
        var tmp0_1 = this.u8_1;
        var tmp2_0 = this.u8_1;
        var tmp4_0 = this.t8_1 + 1 | 0;
        var tmp6 = this.t8_1;
        // Inline function 'kotlin.collections.copyInto' call
        var endIndex = this.u8_1.length - 1 | 0;
        arrayCopy(tmp0_1, tmp2_0, tmp4_0, tmp6, endIndex);
      }
      this.u8_1[this.t8_1] = null;
      this.t8_1 = incremented(this, this.t8_1);
    } else {
      // Inline function 'kotlin.collections.ArrayDeque.internalIndex' call
      var index_0 = get_lastIndex_0(this);
      var internalLastIndex = positiveMod(this, this.t8_1 + index_0 | 0);
      if (internalIndex <= internalLastIndex) {
        var tmp0_2 = this.u8_1;
        var tmp2_1 = this.u8_1;
        var tmp6_0 = internalIndex + 1 | 0;
        // Inline function 'kotlin.collections.copyInto' call
        var endIndex_0 = internalLastIndex + 1 | 0;
        arrayCopy(tmp0_2, tmp2_1, internalIndex, tmp6_0, endIndex_0);
      } else {
        var tmp0_3 = this.u8_1;
        var tmp2_2 = this.u8_1;
        var tmp6_1 = internalIndex + 1 | 0;
        // Inline function 'kotlin.collections.copyInto' call
        var endIndex_1 = this.u8_1.length;
        arrayCopy(tmp0_3, tmp2_2, internalIndex, tmp6_1, endIndex_1);
        this.u8_1[this.u8_1.length - 1 | 0] = this.u8_1[0];
        var tmp0_4 = this.u8_1;
        var tmp2_3 = this.u8_1;
        // Inline function 'kotlin.collections.copyInto' call
        var endIndex_2 = internalLastIndex + 1 | 0;
        arrayCopy(tmp0_4, tmp2_3, 0, 1, endIndex_2);
      }
      this.u8_1[internalLastIndex] = null;
    }
    this.v8_1 = this.v8_1 - 1 | 0;
    return element;
  }
  e9(array) {
    var tmp = array.length >= this.v8_1 ? array : arrayOfNulls(array, this.v8_1);
    var dest = isArray(tmp) ? tmp : THROW_CCE();
    // Inline function 'kotlin.collections.ArrayDeque.internalIndex' call
    var index = this.v8_1;
    var tail = positiveMod(this, this.t8_1 + index | 0);
    if (this.t8_1 < tail) {
      var tmp0 = this.u8_1;
      // Inline function 'kotlin.collections.copyInto' call
      var startIndex = this.t8_1;
      arrayCopy(tmp0, dest, 0, startIndex, tail);
    } else {
      // Inline function 'kotlin.collections.isNotEmpty' call
      if (!this.z()) {
        var tmp0_0 = this.u8_1;
        var tmp6 = this.t8_1;
        // Inline function 'kotlin.collections.copyInto' call
        var endIndex = this.u8_1.length;
        arrayCopy(tmp0_0, dest, 0, tmp6, endIndex);
        var tmp0_1 = this.u8_1;
        // Inline function 'kotlin.collections.copyInto' call
        var destinationOffset = this.u8_1.length - this.t8_1 | 0;
        arrayCopy(tmp0_1, dest, destinationOffset, 0, tail);
      }
    }
    var tmp_0 = terminateCollectionToArray(this.v8_1, dest);
    return isArray(tmp_0) ? tmp_0 : THROW_CCE();
  }
  n3() {
    // Inline function 'kotlin.arrayOfNulls' call
    var size = this.v8_1;
    var tmp$ret$0 = Array(size);
    return this.e9(tmp$ret$0);
  }
  toArray() {
    return this.n3();
  }
}
class Key {}
class CoroutineContext {}
function plus(context) {
  var tmp;
  if (context === EmptyCoroutineContext_getInstance()) {
    tmp = this;
  } else {
    tmp = context.k9(this, CoroutineContext$plus$lambda);
  }
  return tmp;
}
class Element {}
function get(key) {
  var tmp;
  if (equals(this.d1(), key)) {
    tmp = isInterface(this, Element) ? this : THROW_CCE();
  } else {
    tmp = null;
  }
  return tmp;
}
function fold(initial, operation) {
  return operation(initial, this);
}
function minusKey(key) {
  return equals(this.d1(), key) ? EmptyCoroutineContext_getInstance() : this;
}
class ContinuationInterceptor {}
function releaseInterceptedContinuation(continuation) {
}
function get_0(key) {
  if (key instanceof AbstractCoroutineContextKey) {
    var tmp;
    if (key.i9(this.d1())) {
      var tmp_0 = key.h9(this);
      tmp = (!(tmp_0 == null) ? isInterface(tmp_0, Element) : false) ? tmp_0 : null;
    } else {
      tmp = null;
    }
    return tmp;
  }
  var tmp_1;
  if (Key_instance === key) {
    tmp_1 = isInterface(this, Element) ? this : THROW_CCE();
  } else {
    tmp_1 = null;
  }
  return tmp_1;
}
function minusKey_0(key) {
  if (key instanceof AbstractCoroutineContextKey) {
    return key.i9(this.d1()) && !(key.h9(this) == null) ? EmptyCoroutineContext_getInstance() : this;
  }
  return Key_instance === key ? EmptyCoroutineContext_getInstance() : this;
}
class EmptyCoroutineContext {
  constructor() {
    EmptyCoroutineContext_instance = this;
    this.m9_1 = new Long(0, 0);
  }
  r6(key) {
    return null;
  }
  k9(initial, operation) {
    return initial;
  }
  l9(context) {
    return context;
  }
  j9(key) {
    return this;
  }
  hashCode() {
    return 0;
  }
  toString() {
    return 'EmptyCoroutineContext';
  }
}
class CombinedContext {
  constructor(left, element) {
    this.n9_1 = left;
    this.o9_1 = element;
  }
  r6(key) {
    var cur = this;
    while (true) {
      var tmp0_safe_receiver = cur.o9_1.r6(key);
      if (tmp0_safe_receiver == null)
        null;
      else {
        // Inline function 'kotlin.let' call
        return tmp0_safe_receiver;
      }
      var next = cur.n9_1;
      if (next instanceof CombinedContext) {
        cur = next;
      } else {
        return next.r6(key);
      }
    }
  }
  k9(initial, operation) {
    return operation(this.n9_1.k9(initial, operation), this.o9_1);
  }
  j9(key) {
    if (this.o9_1.r6(key) == null)
      null;
    else {
      // Inline function 'kotlin.let' call
      return this.n9_1;
    }
    var newLeft = this.n9_1.j9(key);
    return newLeft === this.n9_1 ? this : newLeft === EmptyCoroutineContext_getInstance() ? this.o9_1 : new CombinedContext(newLeft, this.o9_1);
  }
  equals(other) {
    var tmp;
    if (this === other) {
      tmp = true;
    } else {
      var tmp_0;
      var tmp_1;
      if (other instanceof CombinedContext) {
        tmp_1 = size(other) === size(this);
      } else {
        tmp_1 = false;
      }
      if (tmp_1) {
        tmp_0 = containsAll(other, this);
      } else {
        tmp_0 = false;
      }
      tmp = tmp_0;
    }
    return tmp;
  }
  hashCode() {
    return hashCode_0(this.n9_1) + hashCode_0(this.o9_1) | 0;
  }
  toString() {
    return '[' + this.k9('', CombinedContext$toString$lambda) + ']';
  }
}
class AbstractCoroutineContextKey {
  constructor(baseKey, safeCast) {
    this.f9_1 = safeCast;
    var tmp = this;
    var tmp_0;
    if (baseKey instanceof AbstractCoroutineContextKey) {
      tmp_0 = baseKey.g9_1;
    } else {
      tmp_0 = baseKey;
    }
    tmp.g9_1 = tmp_0;
  }
  h9(element) {
    return this.f9_1(element);
  }
  i9(key) {
    return key === this || this.g9_1 === key;
  }
}
class AbstractCoroutineContextElement {
  constructor(key) {
    this.p9_1 = key;
  }
  d1() {
    return this.p9_1;
  }
}
class CoroutineSingletons extends Enum {}
class Companion_6 {}
class Failure {
  constructor(exception) {
    this.r9_1 = exception;
  }
  equals(other) {
    var tmp;
    if (other instanceof Failure) {
      tmp = equals(this.r9_1, other.r9_1);
    } else {
      tmp = false;
    }
    return tmp;
  }
  hashCode() {
    return hashCode_0(this.r9_1);
  }
  toString() {
    return 'Failure(' + this.r9_1.toString() + ')';
  }
}
class Result {
  constructor(value) {
    this.s9_1 = value;
  }
  toString() {
    return Result__toString_impl_yu5r8k(this.s9_1);
  }
  hashCode() {
    return Result__hashCode_impl_d2zufp(this.s9_1);
  }
  equals(other) {
    return Result__equals_impl_bxgmep(this.s9_1, other);
  }
}
class NotImplementedError extends Error_0 {
  static w6(message) {
    message = message === VOID ? 'An operation is not implemented.' : message;
    var $this = this.m7(message);
    captureStack($this, $this.v6_1);
    return $this;
  }
}
class atomicfu$TraceBase {
  atomicfu$Trace$append$1(event) {
  }
  atomicfu$Trace$append$2(event1, event2) {
  }
  atomicfu$Trace$append$3(event1, event2, event3) {
  }
  atomicfu$Trace$append$4(event1, event2, event3, event4) {
  }
}
class None extends atomicfu$TraceBase {
  constructor() {
    None_instance = null;
    super();
    None_instance = this;
  }
}
class AtomicRef {
  constructor(value) {
    this.kotlinx$atomicfu$value = value;
  }
  t9(_set____db54di) {
    this.kotlinx$atomicfu$value = _set____db54di;
  }
  u9() {
    return this.kotlinx$atomicfu$value;
  }
  atomicfu$compareAndSet(expect, update) {
    if (!(this.kotlinx$atomicfu$value === expect))
      return false;
    this.kotlinx$atomicfu$value = update;
    return true;
  }
  atomicfu$getAndSet(value) {
    var oldValue = this.kotlinx$atomicfu$value;
    this.kotlinx$atomicfu$value = value;
    return oldValue;
  }
  toString() {
    return toString_0(this.kotlinx$atomicfu$value);
  }
}
class AtomicBoolean {
  constructor(value) {
    this.kotlinx$atomicfu$value = value;
  }
  v9(_set____db54di) {
    this.kotlinx$atomicfu$value = _set____db54di;
  }
  u9() {
    return this.kotlinx$atomicfu$value;
  }
  atomicfu$compareAndSet(expect, update) {
    if (!(this.kotlinx$atomicfu$value === expect))
      return false;
    this.kotlinx$atomicfu$value = update;
    return true;
  }
  atomicfu$getAndSet(value) {
    var oldValue = this.kotlinx$atomicfu$value;
    this.kotlinx$atomicfu$value = value;
    return oldValue;
  }
  toString() {
    return this.kotlinx$atomicfu$value.toString();
  }
}
class ParentJob {}
class JobSupport {
  constructor(active) {
    this.w9_1 = atomic$ref$1(active ? get_EMPTY_ACTIVE() : get_EMPTY_NEW());
    this.x9_1 = atomic$ref$1(null);
  }
  d1() {
    return Key_instance_2;
  }
  ua(value) {
    this.x9_1.kotlinx$atomicfu$value = value;
  }
  va() {
    return this.x9_1.kotlinx$atomicfu$value;
  }
  y9(parent) {
    // Inline function 'kotlinx.coroutines.assert' call
    if (parent == null) {
      this.ua(NonDisposableHandle_instance);
      return Unit_instance;
    }
    parent.ya();
    var handle = parent.mb(this);
    this.ua(handle);
    if (this.xa()) {
      handle.gc();
      this.ua(NonDisposableHandle_instance);
    }
  }
  wa() {
    return this.w9_1.kotlinx$atomicfu$value;
  }
  da() {
    var state = this.wa();
    var tmp;
    if (!(state == null) ? isInterface(state, Incomplete) : false) {
      tmp = state.da();
    } else {
      tmp = false;
    }
    return tmp;
  }
  xa() {
    var tmp = this.wa();
    return !(!(tmp == null) ? isInterface(tmp, Incomplete) : false);
  }
  ya() {
    // Inline function 'kotlinx.coroutines.JobSupport.loopOnState' call
    while (true) {
      var state = this.wa();
      var tmp0_subject = startInternal(this, state);
      if (tmp0_subject === 0)
        return false;
      else if (tmp0_subject === 1)
        return true;
    }
  }
  za() {
  }
  ab() {
    var state = this.wa();
    var tmp;
    if (state instanceof Finishing) {
      var tmp0_safe_receiver = state.gf();
      var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : this.bb(tmp0_safe_receiver, get_classSimpleName(this) + ' is cancelling');
      var tmp_0;
      if (tmp1_elvis_lhs == null) {
        // Inline function 'kotlin.error' call
        var message = 'Job is still new or active: ' + this.toString();
        throw IllegalStateException.q1(toString_1(message));
      } else {
        tmp_0 = tmp1_elvis_lhs;
      }
      tmp = tmp_0;
    } else {
      if (!(state == null) ? isInterface(state, Incomplete) : false) {
        // Inline function 'kotlin.error' call
        var message_0 = 'Job is still new or active: ' + this.toString();
        throw IllegalStateException.q1(toString_1(message_0));
      } else {
        if (state instanceof CompletedExceptionally) {
          tmp = this.cb(state.ia_1);
        } else {
          tmp = JobCancellationException.bf(get_classSimpleName(this) + ' has completed normally', null, this);
        }
      }
    }
    return tmp;
  }
  bb(_this__u8e3s4, message) {
    var tmp0_elvis_lhs = _this__u8e3s4 instanceof CancellationException ? _this__u8e3s4 : null;
    var tmp;
    if (tmp0_elvis_lhs == null) {
      // Inline function 'kotlinx.coroutines.JobSupport.defaultCancellationException' call
      tmp = JobCancellationException.bf(message == null ? this.ga() : message, _this__u8e3s4, this);
    } else {
      tmp = tmp0_elvis_lhs;
    }
    return tmp;
  }
  cb(_this__u8e3s4, message, $super) {
    message = message === VOID ? null : message;
    return $super === VOID ? this.bb(_this__u8e3s4, message) : $super.bb.call(this, _this__u8e3s4, message);
  }
  db(handler) {
    return this.fb(true, new InvokeOnCompletion(handler));
  }
  eb(onCancelling, invokeImmediately, handler) {
    var tmp;
    if (onCancelling) {
      tmp = new InvokeOnCancelling(handler);
    } else {
      tmp = new InvokeOnCompletion(handler);
    }
    return this.fb(invokeImmediately, tmp);
  }
  fb(invokeImmediately, node) {
    node.yd_1 = this;
    var tmp$ret$0;
    $l$block_1: {
      // Inline function 'kotlinx.coroutines.JobSupport.tryPutNodeIntoList' call
      // Inline function 'kotlinx.coroutines.JobSupport.loopOnState' call
      while (true) {
        var state = this.wa();
        if (state instanceof Empty) {
          if (state.be_1) {
            if (this.w9_1.atomicfu$compareAndSet(state, node)) {
              tmp$ret$0 = true;
              break $l$block_1;
            }
          } else {
            promoteEmptyToNodeList(this, state);
          }
        } else {
          if (!(state == null) ? isInterface(state, Incomplete) : false) {
            var list = state.ce();
            if (list == null) {
              promoteSingleToNodeList(this, state instanceof JobNode ? state : THROW_CCE());
            } else {
              var tmp;
              if (node.zd()) {
                var tmp0_safe_receiver = state instanceof Finishing ? state : null;
                var rootCause = tmp0_safe_receiver == null ? null : tmp0_safe_receiver.gf();
                var tmp_0;
                if (rootCause == null) {
                  tmp_0 = list.ke(node, 5);
                } else {
                  if (invokeImmediately) {
                    node.ae(rootCause);
                  }
                  return NonDisposableHandle_instance;
                }
                tmp = tmp_0;
              } else {
                tmp = list.ke(node, 1);
              }
              if (tmp) {
                tmp$ret$0 = true;
                break $l$block_1;
              }
            }
          } else {
            tmp$ret$0 = false;
            break $l$block_1;
          }
        }
      }
    }
    var added = tmp$ret$0;
    if (added)
      return node;
    else if (invokeImmediately) {
      var tmp_1 = this.wa();
      var tmp0_safe_receiver_0 = tmp_1 instanceof CompletedExceptionally ? tmp_1 : null;
      node.ae(tmp0_safe_receiver_0 == null ? null : tmp0_safe_receiver_0.ia_1);
    }
    return NonDisposableHandle_instance;
  }
  gb(node) {
    // Inline function 'kotlinx.coroutines.JobSupport.loopOnState' call
    while (true) {
      var state = this.wa();
      if (state instanceof JobNode) {
        if (!(state === node))
          return Unit_instance;
        if (this.w9_1.atomicfu$compareAndSet(state, get_EMPTY_ACTIVE()))
          return Unit_instance;
      } else {
        if (!(state == null) ? isInterface(state, Incomplete) : false) {
          if (!(state.ce() == null)) {
            node.ne();
          }
          return Unit_instance;
        } else {
          return Unit_instance;
        }
      }
    }
  }
  hb() {
    return false;
  }
  ga() {
    return 'Job was cancelled';
  }
  ib(parentJob) {
    this.kb(parentJob);
  }
  jb(cause) {
    if (cause instanceof CancellationException)
      return true;
    return this.kb(cause) && this.pb();
  }
  kb(cause) {
    var finalState = get_COMPLETING_ALREADY();
    if (this.hb()) {
      finalState = cancelMakeCompleting(this, cause);
      if (finalState === get_COMPLETING_WAITING_CHILDREN())
        return true;
    }
    if (finalState === get_COMPLETING_ALREADY()) {
      finalState = makeCancelling(this, cause);
    }
    var tmp;
    if (finalState === get_COMPLETING_ALREADY()) {
      tmp = true;
    } else if (finalState === get_COMPLETING_WAITING_CHILDREN()) {
      tmp = true;
    } else if (finalState === get_TOO_LATE_TO_CANCEL()) {
      tmp = false;
    } else {
      this.na(finalState);
      tmp = true;
    }
    return tmp;
  }
  lb() {
    var state = this.wa();
    var tmp;
    if (state instanceof Finishing) {
      tmp = state.gf();
    } else {
      if (state instanceof CompletedExceptionally) {
        tmp = state.ia_1;
      } else {
        if (!(state == null) ? isInterface(state, Incomplete) : false) {
          // Inline function 'kotlin.error' call
          var message = 'Cannot be cancelling child in this state: ' + toString_1(state);
          throw IllegalStateException.q1(toString_1(message));
        } else {
          tmp = null;
        }
      }
    }
    var rootCause = tmp;
    var tmp1_elvis_lhs = rootCause instanceof CancellationException ? rootCause : null;
    return tmp1_elvis_lhs == null ? JobCancellationException.bf('Parent job is ' + stateString(this, state), rootCause, this) : tmp1_elvis_lhs;
  }
  la(proposedUpdate) {
    // Inline function 'kotlinx.coroutines.JobSupport.loopOnState' call
    while (true) {
      var tmp0 = this.wa();
      $l$block: {
        var finalState = tryMakeCompleting(this, tmp0, proposedUpdate);
        if (finalState === get_COMPLETING_ALREADY())
          throw IllegalStateException.l('Job ' + this.toString() + ' is already complete or completing, ' + ('but is being completed with ' + toString_0(proposedUpdate)), _get_exceptionOrNull__b3j7js(this, proposedUpdate));
        else if (finalState === get_COMPLETING_RETRY()) {
          break $l$block;
        } else
          return finalState;
      }
    }
  }
  mb(child) {
    // Inline function 'kotlin.also' call
    var this_0 = new ChildHandleNode(child);
    this_0.yd_1 = this;
    var node = this_0;
    var tmp$ret$2;
    $l$block_1: {
      // Inline function 'kotlinx.coroutines.JobSupport.tryPutNodeIntoList' call
      // Inline function 'kotlinx.coroutines.JobSupport.loopOnState' call
      while (true) {
        var state = this.wa();
        if (state instanceof Empty) {
          if (state.be_1) {
            if (this.w9_1.atomicfu$compareAndSet(state, node)) {
              tmp$ret$2 = true;
              break $l$block_1;
            }
          } else {
            promoteEmptyToNodeList(this, state);
          }
        } else {
          if (!(state == null) ? isInterface(state, Incomplete) : false) {
            var list = state.ce();
            if (list == null) {
              promoteSingleToNodeList(this, state instanceof JobNode ? state : THROW_CCE());
            } else {
              var addedBeforeCancellation = list.ke(node, 7);
              var tmp;
              if (addedBeforeCancellation) {
                tmp = true;
              } else {
                var addedBeforeCompletion = list.ke(node, 3);
                var latestState = this.wa();
                var tmp_0;
                if (latestState instanceof Finishing) {
                  tmp_0 = latestState.gf();
                } else {
                  // Inline function 'kotlinx.coroutines.assert' call
                  var tmp0_safe_receiver = latestState instanceof CompletedExceptionally ? latestState : null;
                  tmp_0 = tmp0_safe_receiver == null ? null : tmp0_safe_receiver.ia_1;
                }
                var rootCause = tmp_0;
                node.ae(rootCause);
                var tmp_1;
                if (addedBeforeCompletion) {
                  // Inline function 'kotlinx.coroutines.assert' call
                  tmp_1 = true;
                } else {
                  return NonDisposableHandle_instance;
                }
                tmp = tmp_1;
              }
              if (tmp) {
                tmp$ret$2 = true;
                break $l$block_1;
              }
            }
          } else {
            tmp$ret$2 = false;
            break $l$block_1;
          }
        }
      }
    }
    var added = tmp$ret$2;
    if (added)
      return node;
    var tmp_2 = this.wa();
    var tmp0_safe_receiver_0 = tmp_2 instanceof CompletedExceptionally ? tmp_2 : null;
    node.ae(tmp0_safe_receiver_0 == null ? null : tmp0_safe_receiver_0.ia_1);
    return NonDisposableHandle_instance;
  }
  oa(exception) {
    throw exception;
  }
  nb(cause) {
  }
  ob() {
    return false;
  }
  pb() {
    return true;
  }
  qb(exception) {
    return false;
  }
  ha(state) {
  }
  na(state) {
  }
  toString() {
    return this.rb() + '@' + get_hexAddress(this);
  }
  rb() {
    return this.pa() + '{' + stateString(this, this.wa()) + '}';
  }
  pa() {
    return get_classSimpleName(this);
  }
  sb() {
    var state = this.wa();
    // Inline function 'kotlin.check' call
    if (!!(!(state == null) ? isInterface(state, Incomplete) : false)) {
      var message = 'This job has not completed yet';
      throw IllegalStateException.q1(toString_1(message));
    }
    return _get_exceptionOrNull__b3j7js(this, state);
  }
  tb() {
    var state = this.wa();
    // Inline function 'kotlin.check' call
    if (!!(!(state == null) ? isInterface(state, Incomplete) : false)) {
      var message = 'This job has not completed yet';
      throw IllegalStateException.q1(toString_1(message));
    }
    if (state instanceof CompletedExceptionally)
      throw state.ia_1;
    return unboxState(state);
  }
}
class CoroutineScope {}
class AbstractCoroutine extends JobSupport {
  constructor(parentContext, initParentJob, active) {
    super(active);
    if (initParentJob) {
      this.y9(parentContext.r6(Key_instance_2));
    }
    this.ba_1 = parentContext.l9(this);
  }
  f6() {
    return this.ba_1;
  }
  ca() {
    return this.ba_1;
  }
  da() {
    return super.da();
  }
  ea(value) {
  }
  fa(cause, handled) {
  }
  ga() {
    return get_classSimpleName(this) + ' was cancelled';
  }
  ha(state) {
    if (state instanceof CompletedExceptionally) {
      this.fa(state.ia_1, state.ka());
    } else {
      this.ea(state);
    }
  }
  h6(result) {
    var state = this.la(toState(result));
    if (state === get_COMPLETING_WAITING_CHILDREN())
      return Unit_instance;
    this.ma(state);
  }
  ma(state) {
    return this.na(state);
  }
  oa(exception) {
    handleCoroutineException(this.ba_1, exception);
  }
  pa() {
    var tmp0_elvis_lhs = get_coroutineName(this.ba_1);
    var tmp;
    if (tmp0_elvis_lhs == null) {
      return super.pa();
    } else {
      tmp = tmp0_elvis_lhs;
    }
    var coroutineName = tmp;
    return '"' + coroutineName + '":' + super.pa();
  }
  qa(start, receiver, block) {
    start.ta(block, receiver, this);
  }
}
class DeferredCoroutine extends AbstractCoroutine {
  constructor(parentContext, active) {
    super(parentContext, true, active);
  }
  yb() {
    return this.tb();
  }
}
class LazyDeferredCoroutine extends DeferredCoroutine {
  constructor(parentContext, block) {
    super(parentContext, false);
    this.cc_1 = createCoroutineUninterceptedGeneratorVersion(block, this, this);
  }
  za() {
    startCoroutineCancellable_0(this.cc_1, this);
  }
}
class Runnable {}
class SchedulerTask {}
class DispatchedTask extends SchedulerTask {
  constructor(resumeMode) {
    super();
    this.bd_1 = resumeMode;
  }
  bh(takenState, cause) {
  }
  ch(state) {
    return state;
  }
  dh(state) {
    var tmp0_safe_receiver = state instanceof CompletedExceptionally ? state : null;
    return tmp0_safe_receiver == null ? null : tmp0_safe_receiver.ia_1;
  }
  cd() {
    // Inline function 'kotlinx.coroutines.assert' call
    try {
      var tmp = this.zg();
      var delegate = tmp instanceof DispatchedContinuation ? tmp : THROW_CCE();
      var continuation = delegate.nc_1;
      // Inline function 'kotlinx.coroutines.withContinuationContext' call
      delegate.pc_1;
      var context = continuation.f6();
      var state = this.yg();
      var exception = this.dh(state);
      var job = exception == null && get_isCancellableMode(this.bd_1) ? context.r6(Key_instance_2) : null;
      if (!(job == null) && !job.da()) {
        var cause = job.ab();
        this.bh(state, cause);
        // Inline function 'kotlinx.coroutines.resumeWithStackTrace' call
        // Inline function 'kotlin.Companion.failure' call
        var exception_0 = recoverStackTrace(cause, continuation);
        var tmp$ret$4 = _Result___init__impl__xyqfz8(createFailure(exception_0));
        continuation.h6(tmp$ret$4);
      } else {
        if (!(exception == null)) {
          // Inline function 'kotlin.coroutines.resumeWithException' call
          // Inline function 'kotlin.Companion.failure' call
          var tmp$ret$6 = _Result___init__impl__xyqfz8(createFailure(exception));
          continuation.h6(tmp$ret$6);
        } else {
          // Inline function 'kotlin.coroutines.resume' call
          // Inline function 'kotlin.Companion.success' call
          var value = this.ch(state);
          var tmp$ret$8 = _Result___init__impl__xyqfz8(value);
          continuation.h6(tmp$ret$8);
        }
      }
    } catch ($p) {
      if ($p instanceof DispatchException) {
        var e = $p;
        handleCoroutineException(this.zg().f6(), e.tc_1);
      } else {
        if ($p instanceof Error) {
          var e_0 = $p;
          this.ah(e_0);
        } else {
          throw $p;
        }
      }
    }
  }
  ah(exception) {
    var reason = CoroutinesInternalError.ud('Fatal exception in coroutines machinery for ' + toString_1(this) + '. ' + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception);
    handleCoroutineException(this.zg().f6(), reason);
  }
}
class CancellableContinuationImpl extends DispatchedTask {
  fc() {
    var tmp0_elvis_lhs = _get_parentHandle__f8dcex(this);
    var tmp;
    if (tmp0_elvis_lhs == null) {
      return Unit_instance;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    var handle = tmp;
    handle.gc();
    this.ec_1.kotlinx$atomicfu$value = NonDisposableHandle_instance;
  }
}
class CompletedExceptionally {
  constructor(cause, handled) {
    handled = handled === VOID ? false : handled;
    this.ia_1 = cause;
    this.ja_1 = atomic$boolean$1(handled);
  }
  ka() {
    return this.ja_1.kotlinx$atomicfu$value;
  }
  hc() {
    return this.ja_1.atomicfu$compareAndSet(false, true);
  }
  toString() {
    return get_classSimpleName(this) + '[' + this.ia_1.toString() + ']';
  }
}
class Key_0 extends AbstractCoroutineContextKey {
  constructor() {
    Key_instance_0 = null;
    var tmp = Key_instance;
    super(tmp, CoroutineDispatcher$Key$_init_$lambda_akl8b5);
    Key_instance_0 = this;
  }
}
class CoroutineDispatcher extends AbstractCoroutineContextElement {
  constructor() {
    Key_getInstance_0();
    super(Key_instance);
  }
  jc(context) {
    return true;
  }
  s6(continuation) {
    return new DispatchedContinuation(this, continuation);
  }
  t6(continuation) {
    var dispatched = continuation instanceof DispatchedContinuation ? continuation : THROW_CCE();
    dispatched.rc();
  }
  toString() {
    return get_classSimpleName(this) + '@' + get_hexAddress(this);
  }
}
class Key_1 {}
class GlobalScope {
  ca() {
    return EmptyCoroutineContext_getInstance();
  }
}
class CoroutineStart extends Enum {
  ta(block, receiver, completion) {
    var tmp;
    switch (this.h1_1) {
      case 0:
        startCoroutineCancellable(block, receiver, completion);
        tmp = Unit_instance;
        break;
      case 2:
        startCoroutine(block, receiver, completion);
        tmp = Unit_instance;
        break;
      case 3:
        startCoroutineUndispatched(block, receiver, completion);
        tmp = Unit_instance;
        break;
      case 1:
        tmp = Unit_instance;
        break;
      default:
        noWhenBranchMatchedException();
        break;
    }
    return tmp;
  }
  ub() {
    return this === CoroutineStart_LAZY_getInstance();
  }
}
class EventLoop extends CoroutineDispatcher {
  constructor() {
    super();
    this.xc_1 = new Long(0, 0);
    this.yc_1 = false;
    this.zc_1 = null;
  }
  ad() {
    var tmp0_elvis_lhs = this.zc_1;
    var tmp;
    if (tmp0_elvis_lhs == null) {
      return false;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    var queue = tmp;
    var tmp1_elvis_lhs = queue.c9();
    var tmp_0;
    if (tmp1_elvis_lhs == null) {
      return false;
    } else {
      tmp_0 = tmp1_elvis_lhs;
    }
    var task = tmp_0;
    task.cd();
    return true;
  }
  dd(task) {
    var tmp0_elvis_lhs = this.zc_1;
    var tmp;
    if (tmp0_elvis_lhs == null) {
      // Inline function 'kotlin.also' call
      var this_0 = ArrayDeque.y8();
      this.zc_1 = this_0;
      tmp = this_0;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    var queue = tmp;
    queue.a9(task);
  }
  ed() {
    return compare(this.xc_1, delta(this, true)) >= 0;
  }
  fd() {
    var tmp0_safe_receiver = this.zc_1;
    var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : tmp0_safe_receiver.z();
    return tmp1_elvis_lhs == null ? true : tmp1_elvis_lhs;
  }
  gd(unconfined) {
    this.xc_1 = add(this.xc_1, delta(this, unconfined));
    if (!unconfined)
      this.yc_1 = true;
  }
  hd(unconfined) {
    this.xc_1 = subtract(this.xc_1, delta(this, unconfined));
    if (compare(this.xc_1, new Long(0, 0)) > 0)
      return Unit_instance;
    // Inline function 'kotlinx.coroutines.assert' call
    if (this.yc_1) {
      this.id();
    }
  }
  id() {
  }
}
class ThreadLocalEventLoop {
  constructor() {
    ThreadLocalEventLoop_instance = this;
    this.jd_1 = commonThreadLocal(new Symbol_0('ThreadLocalEventLoop'));
  }
  kd() {
    var tmp0_elvis_lhs = this.jd_1.md();
    var tmp;
    if (tmp0_elvis_lhs == null) {
      // Inline function 'kotlin.also' call
      var this_0 = createEventLoop();
      ThreadLocalEventLoop_getInstance().jd_1.nd(this_0);
      tmp = this_0;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    return tmp;
  }
}
class CompletionHandlerException extends RuntimeException {
  static rd(message, cause) {
    var $this = this.a7(message, cause);
    captureStack($this, $this.qd_1);
    return $this;
  }
}
class CoroutinesInternalError extends Error_0 {
  static ud(message, cause) {
    var $this = this.n7(message, cause);
    captureStack($this, $this.td_1);
    return $this;
  }
}
class Key_2 {}
class NonDisposableHandle {
  gc() {
  }
  jb(cause) {
    return false;
  }
  toString() {
    return 'NonDisposableHandle';
  }
}
class Incomplete {}
class Empty {
  constructor(isActive) {
    this.be_1 = isActive;
  }
  da() {
    return this.be_1;
  }
  ce() {
    return null;
  }
  toString() {
    return 'Empty{' + (this.be_1 ? 'Active' : 'New') + '}';
  }
}
class LockFreeLinkedListNode {
  constructor() {
    this.he_1 = this;
    this.ie_1 = this;
    this.je_1 = false;
  }
  ke(node, permissionsBitmask) {
    var prev = this.ie_1;
    var tmp;
    if (prev instanceof ListClosed) {
      tmp = ((prev.ui_1 & permissionsBitmask) === 0 && prev.ke(node, permissionsBitmask));
    } else {
      node.he_1 = this;
      node.ie_1 = prev;
      prev.he_1 = node;
      this.ie_1 = node;
      tmp = true;
    }
    return tmp;
  }
  le(forbiddenElementsBit) {
    this.ke(new ListClosed(forbiddenElementsBit), forbiddenElementsBit);
  }
  ne() {
    if (this.je_1)
      return false;
    var prev = this.ie_1;
    var next = this.he_1;
    prev.he_1 = next;
    next.ie_1 = prev;
    this.je_1 = true;
    return true;
  }
  oe(node) {
    if (!(this.he_1 === this))
      return false;
    this.ke(node, -2147483648);
    return true;
  }
}
class LockFreeLinkedListHead extends LockFreeLinkedListNode {}
class NodeList extends LockFreeLinkedListHead {
  da() {
    return true;
  }
  ce() {
    return this;
  }
  ge(state) {
    // Inline function 'kotlin.text.buildString' call
    // Inline function 'kotlin.apply' call
    var this_0 = StringBuilder.t();
    this_0.v5('List{');
    this_0.v5(state);
    this_0.v5('}[');
    var first = true;
    // Inline function 'kotlinx.coroutines.internal.LockFreeLinkedListHead.forEach' call
    var cur = this.he_1;
    while (!equals(cur, this)) {
      var node = cur;
      if (node instanceof JobNode) {
        if (first) {
          first = false;
        } else
          this_0.v5(', ');
        this_0.u5(node);
      }
      cur = cur.he_1;
    }
    this_0.v5(']');
    return this_0.toString();
  }
  toString() {
    return get_DEBUG() ? this.ge('Active') : super.toString();
  }
}
class JobNode extends LockFreeLinkedListNode {
  me() {
    var tmp = this.yd_1;
    if (!(tmp == null))
      return tmp;
    else {
      throwUninitializedPropertyAccessException('job');
    }
  }
  da() {
    return true;
  }
  ce() {
    return null;
  }
  gc() {
    return this.me().gb(this);
  }
  toString() {
    return get_classSimpleName(this) + '@' + get_hexAddress(this) + '[job@' + get_hexAddress(this.me()) + ']';
  }
}
class SynchronizedObject {}
class Finishing extends SynchronizedObject {
  constructor(list, isCompleting, rootCause) {
    super();
    this.pe_1 = list;
    this.qe_1 = atomic$boolean$1(isCompleting);
    this.re_1 = atomic$ref$1(rootCause);
    this.se_1 = atomic$ref$1(null);
  }
  ce() {
    return this.pe_1;
  }
  hf(value) {
    this.qe_1.kotlinx$atomicfu$value = value;
  }
  df() {
    return this.qe_1.kotlinx$atomicfu$value;
  }
  nf(value) {
    this.re_1.kotlinx$atomicfu$value = value;
  }
  gf() {
    return this.re_1.kotlinx$atomicfu$value;
  }
  ef() {
    return _get_exceptionsHolder__nhszp(this) === get_SEALED();
  }
  te() {
    return !(this.gf() == null);
  }
  da() {
    return this.gf() == null;
  }
  ue(proposedException) {
    var eh = _get_exceptionsHolder__nhszp(this);
    var tmp;
    if (eh == null) {
      tmp = allocateList(this);
    } else {
      if (eh instanceof Error) {
        // Inline function 'kotlin.also' call
        var this_0 = allocateList(this);
        this_0.l2(eh);
        tmp = this_0;
      } else {
        if (eh instanceof ArrayList) {
          tmp = eh instanceof ArrayList ? eh : THROW_CCE();
        } else {
          // Inline function 'kotlin.error' call
          var message = 'State is ' + toString_0(eh);
          throw IllegalStateException.q1(toString_1(message));
        }
      }
    }
    var list = tmp;
    var rootCause = this.gf();
    if (rootCause == null)
      null;
    else {
      // Inline function 'kotlin.let' call
      list.w2(0, rootCause);
    }
    if (!(proposedException == null) && !equals(proposedException, rootCause)) {
      list.l2(proposedException);
    }
    _set_exceptionsHolder__tqm22h(this, get_SEALED());
    return list;
  }
  ff(exception) {
    var rootCause = this.gf();
    if (rootCause == null) {
      this.nf(exception);
      return Unit_instance;
    }
    if (exception === rootCause)
      return Unit_instance;
    var eh = _get_exceptionsHolder__nhszp(this);
    if (eh == null) {
      _set_exceptionsHolder__tqm22h(this, exception);
    } else {
      if (eh instanceof Error) {
        if (exception === eh)
          return Unit_instance;
        // Inline function 'kotlin.apply' call
        var this_0 = allocateList(this);
        this_0.l2(eh);
        this_0.l2(exception);
        _set_exceptionsHolder__tqm22h(this, this_0);
      } else {
        if (eh instanceof ArrayList) {
          (eh instanceof ArrayList ? eh : THROW_CCE()).l2(exception);
        } else {
          // Inline function 'kotlin.error' call
          var message = 'State is ' + toString_0(eh);
          throw IllegalStateException.q1(toString_1(message));
        }
      }
    }
  }
  toString() {
    return 'Finishing[cancelling=' + this.te() + ', completing=' + this.df() + ', rootCause=' + toString_0(this.gf()) + ', exceptions=' + toString_0(_get_exceptionsHolder__nhszp(this)) + ', list=' + this.pe_1.toString() + ']';
  }
}
class ChildCompletion extends JobNode {
  constructor(parent, state, child, proposedUpdate) {
    super();
    this.sf_1 = parent;
    this.tf_1 = state;
    this.uf_1 = child;
    this.vf_1 = proposedUpdate;
  }
  zd() {
    return false;
  }
  ae(cause) {
    continueCompleting(this.sf_1, this.tf_1, this.uf_1, this.vf_1);
  }
}
class InactiveNodeList {
  constructor(list) {
    this.cf_1 = list;
  }
  ce() {
    return this.cf_1;
  }
  da() {
    return false;
  }
  toString() {
    return get_DEBUG() ? this.cf_1.ge('New') : anyToString(this);
  }
}
class InvokeOnCompletion extends JobNode {
  constructor(handler) {
    super();
    this.ag_1 = handler;
  }
  zd() {
    return false;
  }
  ae(cause) {
    return this.ag_1(cause);
  }
}
class InvokeOnCancelling extends JobNode {
  constructor(handler) {
    super();
    this.fg_1 = handler;
    this.gg_1 = atomic$boolean$1(false);
  }
  zd() {
    return true;
  }
  ae(cause) {
    if (this.gg_1.atomicfu$compareAndSet(false, true))
      this.fg_1(cause);
  }
}
class ChildHandleNode extends JobNode {
  constructor(childJob) {
    super();
    this.mf_1 = childJob;
  }
  zd() {
    return true;
  }
  ae(cause) {
    return this.mf_1.ib(this.me());
  }
  jb(cause) {
    return this.me().jb(cause);
  }
}
class IncompleteStateBox {
  constructor(state) {
    this.hg_1 = state;
  }
}
class MainCoroutineDispatcher extends CoroutineDispatcher {
  toString() {
    var tmp0_elvis_lhs = this.kg();
    return tmp0_elvis_lhs == null ? get_classSimpleName(this) + '@' + get_hexAddress(this) : tmp0_elvis_lhs;
  }
  kg() {
    var main = Dispatchers_getInstance().pg();
    if (this === main)
      return 'Dispatchers.Main';
    var tmp;
    try {
      tmp = main.jg();
    } catch ($p) {
      var tmp_0;
      if ($p instanceof UnsupportedOperationException) {
        var e = $p;
        tmp_0 = null;
      } else {
        throw $p;
      }
      tmp = tmp_0;
    }
    var immediate = tmp;
    if (this === immediate)
      return 'Dispatchers.Main.immediate';
    return null;
  }
}
class TimeoutCancellationException extends CancellationException {}
class Unconfined extends CoroutineDispatcher {
  constructor() {
    Unconfined_instance = null;
    super();
    Unconfined_instance = this;
  }
  jc(context) {
    return false;
  }
  kc(context, block) {
    var yieldContext = context.r6(Key_instance_3);
    if (!(yieldContext == null)) {
      yieldContext.sg_1 = true;
      return Unit_instance;
    }
    throw UnsupportedOperationException.z6('Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.');
  }
  toString() {
    return 'Dispatchers.Unconfined';
  }
}
class Key_3 {}
class ExceptionSuccessfullyProcessed extends Exception {}
class DispatchedContinuation extends DispatchedTask {
  constructor(dispatcher, continuation) {
    super(-1);
    this.mc_1 = dispatcher;
    this.nc_1 = continuation;
    this.oc_1 = get_UNDEFINED();
    this.pc_1 = threadContextElements(this.f6());
    this.qc_1 = atomic$ref$1(null);
  }
  xg() {
    // Inline function 'kotlinx.atomicfu.loop' call
    var this_0 = this.qc_1;
    while (true) {
      if (!(this_0.kotlinx$atomicfu$value === get_REUSABLE_CLAIMED()))
        return Unit_instance;
    }
  }
  rc() {
    this.xg();
    var tmp0_safe_receiver = _get_reusableCancellableContinuation__9qex09(this);
    if (tmp0_safe_receiver == null)
      null;
    else {
      tmp0_safe_receiver.fc();
    }
  }
  yg() {
    var state = this.oc_1;
    // Inline function 'kotlinx.coroutines.assert' call
    this.oc_1 = get_UNDEFINED();
    return state;
  }
  zg() {
    return this;
  }
  h6(result) {
    var state = toState(result);
    if (safeIsDispatchNeeded(this.mc_1, this.f6())) {
      this.oc_1 = state;
      this.bd_1 = 0;
      safeDispatch(this.mc_1, this.f6(), this);
    } else {
      $l$block: {
        // Inline function 'kotlinx.coroutines.internal.executeUnconfined' call
        // Inline function 'kotlinx.coroutines.assert' call
        var eventLoop = ThreadLocalEventLoop_getInstance().kd();
        if (false && eventLoop.fd()) {
          break $l$block;
        }
        var tmp;
        if (eventLoop.ed()) {
          this.oc_1 = state;
          this.bd_1 = 0;
          eventLoop.dd(this);
          tmp = true;
        } else {
          // Inline function 'kotlinx.coroutines.runUnconfinedEventLoop' call
          eventLoop.gd(true);
          try {
            this.f6();
            // Inline function 'kotlinx.coroutines.withCoroutineContext' call
            this.pc_1;
            this.nc_1.h6(result);
            $l$loop: while (eventLoop.ad()) {
            }
          } catch ($p) {
            if ($p instanceof Error) {
              var e = $p;
              this.ah(e);
            } else {
              throw $p;
            }
          }
          finally {
            eventLoop.hd(true);
          }
          tmp = false;
        }
      }
    }
  }
  toString() {
    return 'DispatchedContinuation[' + this.mc_1.toString() + ', ' + toDebugString(this.nc_1) + ']';
  }
  f6() {
    return this.nc_1.f6();
  }
}
class DispatchException extends Exception {
  static eh(cause, dispatcher, context) {
    var $this = this.d7('Coroutine dispatcher ' + dispatcher.toString() + ' threw an exception, context = ' + toString_1(context), cause);
    captureStack($this, $this.uc_1);
    $this.tc_1 = cause;
    delete $this.cause;
    return $this;
  }
  n() {
    return this.tc_1;
  }
  get cause() {
    return this.n();
  }
}
class Symbol_0 {
  constructor(symbol) {
    this.fh_1 = symbol;
  }
  toString() {
    return '<' + this.fh_1 + '>';
  }
}
class SetTimeoutBasedDispatcher extends CoroutineDispatcher {
  constructor() {
    super();
    this.ph_1 = new ScheduledMessageQueue(this);
  }
  kc(context, block) {
    this.ph_1.xh(block);
  }
}
class NodeDispatcher extends SetTimeoutBasedDispatcher {
  constructor() {
    NodeDispatcher_instance = null;
    super();
    NodeDispatcher_instance = this;
  }
  ih() {
    process.nextTick(this.ph_1.nh_1);
  }
}
class MessageQueue {
  constructor() {
    this.qh_1 = ArrayDeque.y8();
    this.rh_1 = 16;
    this.sh_1 = false;
  }
  xh(element) {
    this.yh(element);
    if (!this.sh_1) {
      this.sh_1 = true;
      this.uh();
    }
  }
  th() {
    try {
      // Inline function 'kotlin.repeat' call
      var times = this.rh_1;
      var inductionVariable = 0;
      if (inductionVariable < times)
        do {
          var index = inductionVariable;
          inductionVariable = inductionVariable + 1 | 0;
          var tmp0_elvis_lhs = removeFirstOrNull(this);
          var tmp;
          if (tmp0_elvis_lhs == null) {
            return Unit_instance;
          } else {
            tmp = tmp0_elvis_lhs;
          }
          var element = tmp;
          element.cd();
        }
         while (inductionVariable < times);
    }finally {
      if (this.z()) {
        this.sh_1 = false;
      } else {
        this.vh();
      }
    }
  }
  yh(element) {
    return this.qh_1.l2(element);
  }
  l2(element) {
    return this.yh((!(element == null) ? isInterface(element, Runnable) : false) ? element : THROW_CCE());
  }
  x2(index) {
    return this.qh_1.x2(index);
  }
  z() {
    return this.qh_1.z();
  }
  v() {
    return this.qh_1.v();
  }
  b1(index) {
    return this.qh_1.b1(index);
  }
  y() {
    return this.qh_1.v8_1;
  }
}
class ScheduledMessageQueue extends MessageQueue {
  constructor(dispatcher) {
    super();
    this.mh_1 = dispatcher;
    var tmp = this;
    tmp.nh_1 = ScheduledMessageQueue$processQueue$lambda(this);
  }
  uh() {
    this.mh_1.ih();
  }
  vh() {
    setTimeout(this.nh_1, 0);
  }
  wh(timeout) {
    setTimeout(this.nh_1, timeout);
  }
}
class WindowMessageQueue extends MessageQueue {
  constructor(window_0) {
    super();
    this.ci_1 = window_0;
    this.di_1 = 'dispatchCoroutine';
    this.ci_1.addEventListener('message', WindowMessageQueue$lambda(this), true);
  }
  uh() {
    var tmp = Promise.resolve(Unit_instance);
    tmp.then(WindowMessageQueue$schedule$lambda(this));
  }
  vh() {
    this.ci_1.postMessage(this.di_1, '*');
  }
}
class UnconfinedEventLoop extends EventLoop {
  kc(context, block) {
    unsupported();
  }
}
class SetTimeoutDispatcher extends SetTimeoutBasedDispatcher {
  constructor() {
    SetTimeoutDispatcher_instance = null;
    super();
    SetTimeoutDispatcher_instance = this;
  }
  ih() {
    this.ph_1.wh(0);
  }
}
class WindowDispatcher extends CoroutineDispatcher {
  constructor(window_0) {
    super();
    this.li_1 = window_0;
    this.mi_1 = new WindowMessageQueue(this.li_1);
  }
  kc(context, block) {
    return this.mi_1.xh(block);
  }
}
class Dispatchers {
  constructor() {
    Dispatchers_instance = this;
    this.lg_1 = createDefaultDispatcher();
    this.mg_1 = Unconfined_getInstance();
    this.ng_1 = new JsMainDispatcher(this.lg_1, false);
    this.og_1 = null;
  }
  pg() {
    var tmp0_elvis_lhs = this.og_1;
    return tmp0_elvis_lhs == null ? this.ng_1 : tmp0_elvis_lhs;
  }
}
class JsMainDispatcher extends MainCoroutineDispatcher {
  constructor(delegate, invokeImmediately) {
    super();
    this.oi_1 = delegate;
    this.pi_1 = invokeImmediately;
    this.qi_1 = this.pi_1 ? this : new JsMainDispatcher(this.oi_1, true);
  }
  jg() {
    return this.qi_1;
  }
  jc(context) {
    return !this.pi_1;
  }
  kc(context, block) {
    return this.oi_1.kc(context, block);
  }
  toString() {
    var tmp0_elvis_lhs = this.kg();
    return tmp0_elvis_lhs == null ? this.oi_1.toString() : tmp0_elvis_lhs;
  }
}
class JobCancellationException extends CancellationException {
  static bf(message, cause, job) {
    var $this = this.k(message, cause);
    captureStack($this, $this.af_1);
    $this.ze_1 = job;
    return $this;
  }
  toString() {
    return super.toString() + '; job=' + toString_1(this.ze_1);
  }
  equals(other) {
    var tmp;
    if (other === this) {
      tmp = true;
    } else {
      var tmp_0;
      var tmp_1;
      var tmp_2;
      if (other instanceof JobCancellationException) {
        tmp_2 = other.message == this.message;
      } else {
        tmp_2 = false;
      }
      if (tmp_2) {
        tmp_1 = equals(other.ze_1, this.ze_1);
      } else {
        tmp_1 = false;
      }
      if (tmp_1) {
        tmp_0 = equals(other.cause, this.cause);
      } else {
        tmp_0 = false;
      }
      tmp = tmp_0;
    }
    return tmp;
  }
  hashCode() {
    var tmp = imul_0(imul_0(getStringHashCode(ensureNotNull(this.message)), 31) + hashCode_0(this.ze_1) | 0, 31);
    var tmp0_safe_receiver = this.cause;
    var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : hashCode_0(tmp0_safe_receiver);
    return tmp + (tmp1_elvis_lhs == null ? 0 : tmp1_elvis_lhs) | 0;
  }
}
class DiagnosticCoroutineContextException extends RuntimeException {
  static wg(context) {
    var $this = this.v4(toString_1(context));
    captureStack($this, $this.vg_1);
    return $this;
  }
}
class ListClosed extends LockFreeLinkedListNode {
  constructor(forbiddenElementsBitmask) {
    super();
    this.ui_1 = forbiddenElementsBitmask;
  }
}
class CommonThreadLocal {
  constructor() {
    this.ld_1 = null;
  }
  md() {
    return this.ld_1;
  }
  nd(value) {
    this.ld_1 = value;
  }
}
class Worker$Companion$fetch$slambda {
  constructor($request) {
    this.vi_1 = $request;
  }
  *wi($this$promise, $completion) {
    return example_Response_rjjrdx('Hello from Kotlin/JS! You hit ' + this.vi_1.url);
  }
  x6(p1, $completion) {
    return this.wi((!(p1 == null) ? isInterface(p1, CoroutineScope) : false) ? p1 : THROW_CCE(), $completion);
  }
}
class Companion_7 {
  xi(request, env, ctx) {
    var tmp = GlobalScope_instance;
    return promise(tmp, VOID, VOID, Worker$Companion$fetch$slambda_0(request));
  }
  fetch(request, env, ctx) {
    return this.xi(request, env, ctx);
  }
}
class Worker {}
//endregion
function init_kotlin_coroutines_cancellation_CancellationException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.e_1);
}
function throwUninitializedPropertyAccessException(name) {
  throw UninitializedPropertyAccessException.r('lateinit property ' + name + ' has not been initialized');
}
function indexOf(_this__u8e3s4, element) {
  if (element == null) {
    var inductionVariable = 0;
    var last = _this__u8e3s4.length - 1 | 0;
    if (inductionVariable <= last)
      do {
        var index = inductionVariable;
        inductionVariable = inductionVariable + 1 | 0;
        if (_this__u8e3s4[index] == null) {
          return index;
        }
      }
       while (inductionVariable <= last);
  } else {
    var inductionVariable_0 = 0;
    var last_0 = _this__u8e3s4.length - 1 | 0;
    if (inductionVariable_0 <= last_0)
      do {
        var index_0 = inductionVariable_0;
        inductionVariable_0 = inductionVariable_0 + 1 | 0;
        if (equals(element, _this__u8e3s4[index_0])) {
          return index_0;
        }
      }
       while (inductionVariable_0 <= last_0);
  }
  return -1;
}
function get_lastIndex(_this__u8e3s4) {
  return _this__u8e3s4.length - 1 | 0;
}
function joinToString(_this__u8e3s4, separator, prefix, postfix, limit, truncated, transform) {
  separator = separator === VOID ? ', ' : separator;
  prefix = prefix === VOID ? '' : prefix;
  postfix = postfix === VOID ? '' : postfix;
  limit = limit === VOID ? -1 : limit;
  truncated = truncated === VOID ? '...' : truncated;
  transform = transform === VOID ? null : transform;
  return joinTo(_this__u8e3s4, StringBuilder.t(), separator, prefix, postfix, limit, truncated, transform).toString();
}
function joinTo(_this__u8e3s4, buffer, separator, prefix, postfix, limit, truncated, transform) {
  separator = separator === VOID ? ', ' : separator;
  prefix = prefix === VOID ? '' : prefix;
  postfix = postfix === VOID ? '' : postfix;
  limit = limit === VOID ? -1 : limit;
  truncated = truncated === VOID ? '...' : truncated;
  transform = transform === VOID ? null : transform;
  buffer.u(prefix);
  var count = 0;
  var inductionVariable = 0;
  var last = _this__u8e3s4.length;
  $l$loop: while (inductionVariable < last) {
    var element = _this__u8e3s4[inductionVariable];
    inductionVariable = inductionVariable + 1 | 0;
    count = count + 1 | 0;
    if (count > 1) {
      buffer.u(separator);
    }
    if (limit < 0 || count <= limit) {
      appendElement(buffer, element, transform);
    } else
      break $l$loop;
  }
  if (limit >= 0 && count > limit) {
    buffer.u(truncated);
  }
  buffer.u(postfix);
  return buffer;
}
function joinToString_0(_this__u8e3s4, separator, prefix, postfix, limit, truncated, transform) {
  separator = separator === VOID ? ', ' : separator;
  prefix = prefix === VOID ? '' : prefix;
  postfix = postfix === VOID ? '' : postfix;
  limit = limit === VOID ? -1 : limit;
  truncated = truncated === VOID ? '...' : truncated;
  transform = transform === VOID ? null : transform;
  return joinTo_0(_this__u8e3s4, StringBuilder.t(), separator, prefix, postfix, limit, truncated, transform).toString();
}
function joinTo_0(_this__u8e3s4, buffer, separator, prefix, postfix, limit, truncated, transform) {
  separator = separator === VOID ? ', ' : separator;
  prefix = prefix === VOID ? '' : prefix;
  postfix = postfix === VOID ? '' : postfix;
  limit = limit === VOID ? -1 : limit;
  truncated = truncated === VOID ? '...' : truncated;
  transform = transform === VOID ? null : transform;
  buffer.u(prefix);
  var count = 0;
  var _iterator__ex2g4s = _this__u8e3s4.v();
  $l$loop: while (_iterator__ex2g4s.w()) {
    var element = _iterator__ex2g4s.x();
    count = count + 1 | 0;
    if (count > 1) {
      buffer.u(separator);
    }
    if (limit < 0 || count <= limit) {
      appendElement(buffer, element, transform);
    } else
      break $l$loop;
  }
  if (limit >= 0 && count > limit) {
    buffer.u(truncated);
  }
  buffer.u(postfix);
  return buffer;
}
function coerceAtMost(_this__u8e3s4, maximumValue) {
  return _this__u8e3s4 > maximumValue ? maximumValue : _this__u8e3s4;
}
function coerceAtLeast(_this__u8e3s4, minimumValue) {
  return _this__u8e3s4 < minimumValue ? minimumValue : _this__u8e3s4;
}
function _Char___init__impl__6a9atx(value) {
  return value;
}
function _get_value__a43j40($this) {
  return $this;
}
function toString($this) {
  // Inline function 'kotlin.js.unsafeCast' call
  return String.fromCharCode(_get_value__a43j40($this));
}
var Companion_instance;
function Companion_getInstance() {
  return Companion_instance;
}
function toString_0(_this__u8e3s4) {
  var tmp1_elvis_lhs = _this__u8e3s4 == null ? null : toString_1(_this__u8e3s4);
  return tmp1_elvis_lhs == null ? 'null' : tmp1_elvis_lhs;
}
var Companion_instance_0;
function Companion_getInstance_0() {
  if (Companion_instance_0 === VOID)
    new Companion_0();
  return Companion_instance_0;
}
function abs(_this__u8e3s4) {
  var tmp;
  // Inline function 'kotlin.js.internal.isNegative' call
  if (_this__u8e3s4 < 0) {
    // Inline function 'kotlin.js.internal.unaryMinus' call
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    tmp = -_this__u8e3s4;
  } else {
    tmp = _this__u8e3s4;
  }
  return tmp;
}
function get_buf() {
  _init_properties_bitUtils_kt__nfcg4k();
  return buf;
}
var buf;
function get_bufFloat64() {
  _init_properties_bitUtils_kt__nfcg4k();
  return bufFloat64;
}
var bufFloat64;
var bufFloat32;
function get_bufInt32() {
  _init_properties_bitUtils_kt__nfcg4k();
  return bufInt32;
}
var bufInt32;
function get_lowIndex() {
  _init_properties_bitUtils_kt__nfcg4k();
  return lowIndex;
}
var lowIndex;
function get_highIndex() {
  _init_properties_bitUtils_kt__nfcg4k();
  return highIndex;
}
var highIndex;
function getNumberHashCode(obj) {
  _init_properties_bitUtils_kt__nfcg4k();
  // Inline function 'kotlin.js.jsBitwiseOr' call
  // Inline function 'kotlin.js.unsafeCast' call
  // Inline function 'kotlin.js.asDynamic' call
  if ((obj | 0) === obj) {
    return numberToInt(obj);
  }
  get_bufFloat64()[0] = obj;
  return imul_0(get_bufInt32()[get_highIndex()], 31) + get_bufInt32()[get_lowIndex()] | 0;
}
var properties_initialized_bitUtils_kt_i2bo3e;
function _init_properties_bitUtils_kt__nfcg4k() {
  if (!properties_initialized_bitUtils_kt_i2bo3e) {
    properties_initialized_bitUtils_kt_i2bo3e = true;
    buf = new ArrayBuffer(8);
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    bufFloat64 = new Float64Array(get_buf());
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    bufFloat32 = new Float32Array(get_buf());
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    bufInt32 = new Int32Array(get_buf());
    // Inline function 'kotlin.run' call
    get_bufFloat64()[0] = -1.0;
    lowIndex = !(get_bufInt32()[0] === 0) ? 1 : 0;
    highIndex = 1 - get_lowIndex() | 0;
  }
}
function get_ZERO() {
  _init_properties_boxedLong_kt__v24qrw();
  return ZERO;
}
var ZERO;
function get_ONE() {
  _init_properties_boxedLong_kt__v24qrw();
  return ONE;
}
var ONE;
function get_NEG_ONE() {
  _init_properties_boxedLong_kt__v24qrw();
  return NEG_ONE;
}
var NEG_ONE;
function get_MAX_VALUE() {
  _init_properties_boxedLong_kt__v24qrw();
  return MAX_VALUE;
}
var MAX_VALUE;
function get_MIN_VALUE() {
  _init_properties_boxedLong_kt__v24qrw();
  return MIN_VALUE;
}
var MIN_VALUE;
function get_TWO_PWR_24_() {
  _init_properties_boxedLong_kt__v24qrw();
  return TWO_PWR_24_;
}
var TWO_PWR_24_;
function get_longArrayClass() {
  _init_properties_boxedLong_kt__v24qrw();
  return longArrayClass;
}
var longArrayClass;
function compare(_this__u8e3s4, other) {
  _init_properties_boxedLong_kt__v24qrw();
  if (equalsLong(_this__u8e3s4, other)) {
    return 0;
  }
  var thisNeg = isNegative(_this__u8e3s4);
  var otherNeg = isNegative(other);
  return thisNeg && !otherNeg ? -1 : !thisNeg && otherNeg ? 1 : isNegative(subtract(_this__u8e3s4, other)) ? -1 : 1;
}
function convertToInt(_this__u8e3s4) {
  _init_properties_boxedLong_kt__v24qrw();
  return _this__u8e3s4.m1_1;
}
function toNumber(_this__u8e3s4) {
  _init_properties_boxedLong_kt__v24qrw();
  return _this__u8e3s4.n1_1 * 4.294967296E9 + getLowBitsUnsigned(_this__u8e3s4);
}
function toStringImpl(_this__u8e3s4, radix) {
  _init_properties_boxedLong_kt__v24qrw();
  if (isZero(_this__u8e3s4)) {
    return '0';
  }
  if (isNegative(_this__u8e3s4)) {
    if (equalsLong(_this__u8e3s4, get_MIN_VALUE())) {
      var radixLong = fromInt(radix);
      var div = divide(_this__u8e3s4, radixLong);
      var rem = convertToInt(subtract(multiply(div, radixLong), _this__u8e3s4));
      var tmp = toStringImpl(div, radix);
      // Inline function 'kotlin.js.asDynamic' call
      // Inline function 'kotlin.js.unsafeCast' call
      return tmp + rem.toString(radix);
    } else {
      return '-' + toStringImpl(negate(_this__u8e3s4), radix);
    }
  }
  var digitsPerTime = radix === 2 ? 31 : radix <= 10 ? 9 : radix <= 21 ? 7 : radix <= 35 ? 6 : 5;
  var radixToPower = fromNumber(Math.pow(radix, digitsPerTime));
  var rem_0 = _this__u8e3s4;
  var result = '';
  while (true) {
    var remDiv = divide(rem_0, radixToPower);
    var intval = convertToInt(subtract(rem_0, multiply(remDiv, radixToPower)));
    // Inline function 'kotlin.js.asDynamic' call
    // Inline function 'kotlin.js.unsafeCast' call
    var digits = intval.toString(radix);
    rem_0 = remDiv;
    if (isZero(rem_0)) {
      return digits + result;
    } else {
      while (digits.length < digitsPerTime) {
        digits = '0' + digits;
      }
      result = digits + result;
    }
  }
}
function equalsLong(_this__u8e3s4, other) {
  _init_properties_boxedLong_kt__v24qrw();
  return _this__u8e3s4.n1_1 === other.n1_1 && _this__u8e3s4.m1_1 === other.m1_1;
}
function hashCode(l) {
  _init_properties_boxedLong_kt__v24qrw();
  return l.m1_1 ^ l.n1_1;
}
function fromInt(value) {
  _init_properties_boxedLong_kt__v24qrw();
  return new Long(value, value < 0 ? -1 : 0);
}
function isNegative(_this__u8e3s4) {
  _init_properties_boxedLong_kt__v24qrw();
  return _this__u8e3s4.n1_1 < 0;
}
function subtract(_this__u8e3s4, other) {
  _init_properties_boxedLong_kt__v24qrw();
  return add(_this__u8e3s4, negate(other));
}
function getLowBitsUnsigned(_this__u8e3s4) {
  _init_properties_boxedLong_kt__v24qrw();
  return _this__u8e3s4.m1_1 >= 0 ? _this__u8e3s4.m1_1 : 4.294967296E9 + _this__u8e3s4.m1_1;
}
function isZero(_this__u8e3s4) {
  _init_properties_boxedLong_kt__v24qrw();
  return _this__u8e3s4.n1_1 === 0 && _this__u8e3s4.m1_1 === 0;
}
function multiply(_this__u8e3s4, other) {
  _init_properties_boxedLong_kt__v24qrw();
  if (isZero(_this__u8e3s4)) {
    return get_ZERO();
  } else if (isZero(other)) {
    return get_ZERO();
  }
  if (equalsLong(_this__u8e3s4, get_MIN_VALUE())) {
    return isOdd(other) ? get_MIN_VALUE() : get_ZERO();
  } else if (equalsLong(other, get_MIN_VALUE())) {
    return isOdd(_this__u8e3s4) ? get_MIN_VALUE() : get_ZERO();
  }
  if (isNegative(_this__u8e3s4)) {
    var tmp;
    if (isNegative(other)) {
      tmp = multiply(negate(_this__u8e3s4), negate(other));
    } else {
      tmp = negate(multiply(negate(_this__u8e3s4), other));
    }
    return tmp;
  } else if (isNegative(other)) {
    return negate(multiply(_this__u8e3s4, negate(other)));
  }
  if (lessThan(_this__u8e3s4, get_TWO_PWR_24_()) && lessThan(other, get_TWO_PWR_24_())) {
    return fromNumber(toNumber(_this__u8e3s4) * toNumber(other));
  }
  var a48 = _this__u8e3s4.n1_1 >>> 16 | 0;
  var a32 = _this__u8e3s4.n1_1 & 65535;
  var a16 = _this__u8e3s4.m1_1 >>> 16 | 0;
  var a00 = _this__u8e3s4.m1_1 & 65535;
  var b48 = other.n1_1 >>> 16 | 0;
  var b32 = other.n1_1 & 65535;
  var b16 = other.m1_1 >>> 16 | 0;
  var b00 = other.m1_1 & 65535;
  var c48 = 0;
  var c32 = 0;
  var c16 = 0;
  var c00 = 0;
  c00 = c00 + imul_0(a00, b00) | 0;
  c16 = c16 + (c00 >>> 16 | 0) | 0;
  c00 = c00 & 65535;
  c16 = c16 + imul_0(a16, b00) | 0;
  c32 = c32 + (c16 >>> 16 | 0) | 0;
  c16 = c16 & 65535;
  c16 = c16 + imul_0(a00, b16) | 0;
  c32 = c32 + (c16 >>> 16 | 0) | 0;
  c16 = c16 & 65535;
  c32 = c32 + imul_0(a32, b00) | 0;
  c48 = c48 + (c32 >>> 16 | 0) | 0;
  c32 = c32 & 65535;
  c32 = c32 + imul_0(a16, b16) | 0;
  c48 = c48 + (c32 >>> 16 | 0) | 0;
  c32 = c32 & 65535;
  c32 = c32 + imul_0(a00, b32) | 0;
  c48 = c48 + (c32 >>> 16 | 0) | 0;
  c32 = c32 & 65535;
  c48 = c48 + (((imul_0(a48, b00) + imul_0(a32, b16) | 0) + imul_0(a16, b32) | 0) + imul_0(a00, b48) | 0) | 0;
  c48 = c48 & 65535;
  return new Long(c16 << 16 | c00, c48 << 16 | c32);
}
function negate(_this__u8e3s4) {
  _init_properties_boxedLong_kt__v24qrw();
  return add(invert(_this__u8e3s4), new Long(1, 0));
}
function fromNumber(value) {
  _init_properties_boxedLong_kt__v24qrw();
  if (isNaN_0(value)) {
    return get_ZERO();
  } else if (value <= -9.223372036854776E18) {
    return get_MIN_VALUE();
  } else if (value + 1 >= 9.223372036854776E18) {
    return get_MAX_VALUE();
  } else if (value < 0) {
    return negate(fromNumber(-value));
  } else {
    var twoPwr32 = 4.294967296E9;
    // Inline function 'kotlin.js.jsBitwiseOr' call
    var tmp = value % twoPwr32 | 0;
    // Inline function 'kotlin.js.jsBitwiseOr' call
    var tmp$ret$1 = value / twoPwr32 | 0;
    return new Long(tmp, tmp$ret$1);
  }
}
function add(_this__u8e3s4, other) {
  _init_properties_boxedLong_kt__v24qrw();
  var a48 = _this__u8e3s4.n1_1 >>> 16 | 0;
  var a32 = _this__u8e3s4.n1_1 & 65535;
  var a16 = _this__u8e3s4.m1_1 >>> 16 | 0;
  var a00 = _this__u8e3s4.m1_1 & 65535;
  var b48 = other.n1_1 >>> 16 | 0;
  var b32 = other.n1_1 & 65535;
  var b16 = other.m1_1 >>> 16 | 0;
  var b00 = other.m1_1 & 65535;
  var c48 = 0;
  var c32 = 0;
  var c16 = 0;
  var c00 = 0;
  c00 = c00 + (a00 + b00 | 0) | 0;
  c16 = c16 + (c00 >>> 16 | 0) | 0;
  c00 = c00 & 65535;
  c16 = c16 + (a16 + b16 | 0) | 0;
  c32 = c32 + (c16 >>> 16 | 0) | 0;
  c16 = c16 & 65535;
  c32 = c32 + (a32 + b32 | 0) | 0;
  c48 = c48 + (c32 >>> 16 | 0) | 0;
  c32 = c32 & 65535;
  c48 = c48 + (a48 + b48 | 0) | 0;
  c48 = c48 & 65535;
  return new Long(c16 << 16 | c00, c48 << 16 | c32);
}
function isOdd(_this__u8e3s4) {
  _init_properties_boxedLong_kt__v24qrw();
  return (_this__u8e3s4.m1_1 & 1) === 1;
}
function lessThan(_this__u8e3s4, other) {
  _init_properties_boxedLong_kt__v24qrw();
  return compare(_this__u8e3s4, other) < 0;
}
function invert(_this__u8e3s4) {
  _init_properties_boxedLong_kt__v24qrw();
  return new Long(~_this__u8e3s4.m1_1, ~_this__u8e3s4.n1_1);
}
function divide(_this__u8e3s4, other) {
  _init_properties_boxedLong_kt__v24qrw();
  if (isZero(other)) {
    throw Exception.p1('division by zero');
  } else if (isZero(_this__u8e3s4)) {
    return get_ZERO();
  }
  if (equalsLong(_this__u8e3s4, get_MIN_VALUE())) {
    if (equalsLong(other, get_ONE()) || equalsLong(other, get_NEG_ONE())) {
      return get_MIN_VALUE();
    } else if (equalsLong(other, get_MIN_VALUE())) {
      return get_ONE();
    } else {
      var halfThis = shiftRight(_this__u8e3s4, 1);
      var approx = shiftLeft(divide(halfThis, other), 1);
      if (equalsLong(approx, get_ZERO())) {
        return isNegative(other) ? get_ONE() : get_NEG_ONE();
      } else {
        var rem = subtract(_this__u8e3s4, multiply(other, approx));
        return add(approx, divide(rem, other));
      }
    }
  } else if (equalsLong(other, get_MIN_VALUE())) {
    return get_ZERO();
  }
  if (isNegative(_this__u8e3s4)) {
    var tmp;
    if (isNegative(other)) {
      tmp = divide(negate(_this__u8e3s4), negate(other));
    } else {
      tmp = negate(divide(negate(_this__u8e3s4), other));
    }
    return tmp;
  } else if (isNegative(other)) {
    return negate(divide(_this__u8e3s4, negate(other)));
  }
  var res = get_ZERO();
  var rem_0 = _this__u8e3s4;
  while (greaterThanOrEqual(rem_0, other)) {
    var approxDouble = toNumber(rem_0) / toNumber(other);
    var approx2 = Math.max(1.0, Math.floor(approxDouble));
    var log2 = Math.ceil(Math.log(approx2) / Math.LN2);
    var delta = log2 <= 48 ? 1.0 : Math.pow(2.0, log2 - 48);
    var approxRes = fromNumber(approx2);
    var approxRem = multiply(approxRes, other);
    while (isNegative(approxRem) || greaterThan(approxRem, rem_0)) {
      approx2 = approx2 - delta;
      approxRes = fromNumber(approx2);
      approxRem = multiply(approxRes, other);
    }
    if (isZero(approxRes)) {
      approxRes = get_ONE();
    }
    res = add(res, approxRes);
    rem_0 = subtract(rem_0, approxRem);
  }
  return res;
}
function shiftRight(_this__u8e3s4, numBits) {
  _init_properties_boxedLong_kt__v24qrw();
  var numBits_0 = numBits & 63;
  if (numBits_0 === 0) {
    return _this__u8e3s4;
  } else {
    if (numBits_0 < 32) {
      return new Long(_this__u8e3s4.m1_1 >>> numBits_0 | 0 | _this__u8e3s4.n1_1 << (32 - numBits_0 | 0), _this__u8e3s4.n1_1 >> numBits_0);
    } else {
      return new Long(_this__u8e3s4.n1_1 >> (numBits_0 - 32 | 0), _this__u8e3s4.n1_1 >= 0 ? 0 : -1);
    }
  }
}
function shiftLeft(_this__u8e3s4, numBits) {
  _init_properties_boxedLong_kt__v24qrw();
  var numBits_0 = numBits & 63;
  if (numBits_0 === 0) {
    return _this__u8e3s4;
  } else {
    if (numBits_0 < 32) {
      return new Long(_this__u8e3s4.m1_1 << numBits_0, _this__u8e3s4.n1_1 << numBits_0 | (_this__u8e3s4.m1_1 >>> (32 - numBits_0 | 0) | 0));
    } else {
      return new Long(0, _this__u8e3s4.m1_1 << (numBits_0 - 32 | 0));
    }
  }
}
function greaterThan(_this__u8e3s4, other) {
  _init_properties_boxedLong_kt__v24qrw();
  return compare(_this__u8e3s4, other) > 0;
}
function greaterThanOrEqual(_this__u8e3s4, other) {
  _init_properties_boxedLong_kt__v24qrw();
  return compare(_this__u8e3s4, other) >= 0;
}
function isLongArray(a) {
  _init_properties_boxedLong_kt__v24qrw();
  return isJsArray(a) && a.$type$ === 'LongArray';
}
function longArrayClass$lambda(it) {
  _init_properties_boxedLong_kt__v24qrw();
  return !(it == null) ? isLongArray(it) : false;
}
var properties_initialized_boxedLong_kt_lfwt2;
function _init_properties_boxedLong_kt__v24qrw() {
  if (!properties_initialized_boxedLong_kt_lfwt2) {
    properties_initialized_boxedLong_kt_lfwt2 = true;
    ZERO = fromInt(0);
    ONE = fromInt(1);
    NEG_ONE = fromInt(-1);
    MAX_VALUE = new Long(-1, 2147483647);
    MIN_VALUE = new Long(0, -2147483648);
    TWO_PWR_24_ = fromInt(16777216);
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp = Array;
    longArrayClass = new PrimitiveKClassImpl(tmp, 'LongArray', longArrayClass$lambda);
  }
}
function isString(a) {
  return typeof a === 'string';
}
function charSequenceLength(a) {
  var tmp;
  if (isString(a)) {
    // Inline function 'kotlin.js.asDynamic' call
    // Inline function 'kotlin.js.unsafeCast' call
    tmp = a.length;
  } else {
    tmp = a.a();
  }
  return tmp;
}
function arrayToString(array) {
  return joinToString(array, ', ', '[', ']', VOID, VOID, arrayToString$lambda);
}
function arrayToString$lambda(it) {
  return toString_1(it);
}
function identityHashCode(obj) {
  return getObjectHashCode(obj);
}
function getObjectHashCode(obj) {
  // Inline function 'kotlin.js.jsIn' call
  if (!('kotlinHashCodeValue$' in obj)) {
    var hash = calculateRandomHash();
    var descriptor = new Object();
    descriptor.value = hash;
    descriptor.enumerable = false;
    Object.defineProperty(obj, 'kotlinHashCodeValue$', descriptor);
  }
  // Inline function 'kotlin.js.unsafeCast' call
  return obj['kotlinHashCodeValue$'];
}
function calculateRandomHash() {
  // Inline function 'kotlin.js.jsBitwiseOr' call
  return Math.random() * 4.294967296E9 | 0;
}
function defineProp(obj, name, getter, setter, enumerable) {
  return Object.defineProperty(obj, name, {configurable: true, get: getter, set: setter, enumerable: enumerable});
}
function toString_1(o) {
  var tmp;
  if (o == null) {
    tmp = 'null';
  } else if (isArrayish(o)) {
    tmp = '[...]';
  } else if (!(typeof o.toString === 'function')) {
    tmp = anyToString(o);
  } else {
    // Inline function 'kotlin.js.unsafeCast' call
    tmp = o.toString();
  }
  return tmp;
}
function anyToString(o) {
  return Object.prototype.toString.call(o);
}
function equals(obj1, obj2) {
  if (obj1 == null) {
    return obj2 == null;
  }
  if (obj2 == null) {
    return false;
  }
  if (typeof obj1 === 'object' && typeof obj1.equals === 'function') {
    return obj1.equals(obj2);
  }
  if (obj1 !== obj1) {
    return obj2 !== obj2;
  }
  if (typeof obj1 === 'number' && typeof obj2 === 'number') {
    var tmp;
    if (obj1 === obj2) {
      var tmp_0;
      if (obj1 !== 0) {
        tmp_0 = true;
      } else {
        // Inline function 'kotlin.js.asDynamic' call
        var tmp_1 = 1 / obj1;
        // Inline function 'kotlin.js.asDynamic' call
        tmp_0 = tmp_1 === 1 / obj2;
      }
      tmp = tmp_0;
    } else {
      tmp = false;
    }
    return tmp;
  }
  return obj1 === obj2;
}
function hashCode_0(obj) {
  if (obj == null)
    return 0;
  var typeOf = typeof obj;
  var tmp;
  switch (typeOf) {
    case 'object':
      tmp = 'function' === typeof obj.hashCode ? obj.hashCode() : getObjectHashCode(obj);
      break;
    case 'function':
      tmp = getObjectHashCode(obj);
      break;
    case 'number':
      tmp = getNumberHashCode(obj);
      break;
    case 'boolean':
      // Inline function 'kotlin.js.unsafeCast' call

      tmp = getBooleanHashCode(obj);
      break;
    case 'string':
      tmp = getStringHashCode(String(obj));
      break;
    case 'bigint':
      // Inline function 'kotlin.js.unsafeCast' call

      tmp = getBigIntHashCode(obj);
      break;
    case 'symbol':
      tmp = getSymbolHashCode(obj);
      break;
    default:
      tmp = function () {
        throw new Error('Unexpected typeof `' + typeOf + '`');
      }();
      break;
  }
  return tmp;
}
function getBooleanHashCode(value) {
  return value ? 1231 : 1237;
}
function getStringHashCode(str) {
  var hash = 0;
  var length = str.length;
  var inductionVariable = 0;
  var last = length - 1 | 0;
  if (inductionVariable <= last)
    do {
      var i = inductionVariable;
      inductionVariable = inductionVariable + 1 | 0;
      // Inline function 'kotlin.js.asDynamic' call
      var code = str.charCodeAt(i);
      hash = imul_0(hash, 31) + code | 0;
    }
     while (!(i === last));
  return hash;
}
function getBigIntHashCode(value) {
  var shiftNumber = BigInt(32);
  var mask = BigInt(4.294967295E9);
  var bigNumber = abs(value);
  var hashCode = 0;
  var tmp;
  // Inline function 'kotlin.js.internal.isNegative' call
  if (value < 0) {
    tmp = -1;
  } else {
    tmp = 1;
  }
  var signum = tmp;
  $l$loop: while (true) {
    // Inline function 'kotlin.js.internal.isZero' call
    if (!!(bigNumber == 0)) {
      break $l$loop;
    }
    // Inline function 'kotlin.js.internal.and' call
    // Inline function 'kotlin.js.jsBitwiseAnd' call
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    // Inline function 'kotlin.js.internal.toNumber' call
    var self_0 = bigNumber & mask;
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    var chunk = Number(self_0);
    hashCode = imul_0(31, hashCode) + chunk | 0;
    // Inline function 'kotlin.js.internal.shr' call
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    bigNumber = bigNumber >> shiftNumber;
  }
  return imul_0(hashCode, signum);
}
function getSymbolHashCode(value) {
  var hashCodeMap = symbolIsSharable(value) ? getSymbolMap() : getSymbolWeakMap();
  var cachedHashCode = hashCodeMap.get(value);
  if (cachedHashCode !== VOID)
    return cachedHashCode;
  var hash = calculateRandomHash();
  hashCodeMap.set(value, hash);
  return hash;
}
function symbolIsSharable(symbol) {
  return Symbol.keyFor(symbol) != VOID;
}
function getSymbolMap() {
  if (symbolMap === VOID) {
    symbolMap = new Map();
  }
  return symbolMap;
}
function getSymbolWeakMap() {
  if (symbolWeakMap === VOID) {
    symbolWeakMap = new WeakMap();
  }
  return symbolWeakMap;
}
var symbolMap;
var symbolWeakMap;
function boxIntrinsic(x) {
  // Inline function 'kotlin.error' call
  var message = 'Should be lowered';
  throw IllegalStateException.q1(toString_1(message));
}
function unboxIntrinsic(x) {
  // Inline function 'kotlin.error' call
  var message = 'Should be lowered';
  throw IllegalStateException.q1(toString_1(message));
}
function captureStack(instance, constructorFunction) {
  if (Error.captureStackTrace != null) {
    Error.captureStackTrace(instance, constructorFunction);
  } else {
    // Inline function 'kotlin.js.asDynamic' call
    instance.stack = (new Error()).stack;
  }
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
function createExternalThis(ctor, superExternalCtor, parameters, box) {
  var tmp;
  if (box === VOID) {
    tmp = ctor;
  } else {
    var newCtor = class  extends ctor {}
    Object.assign(newCtor.prototype, box);
    newCtor.constructor = ctor;
    tmp = newCtor;
  }
  var selfCtor = tmp;
  return Reflect.construct(superExternalCtor, parameters, selfCtor);
}
function isUndefined(value) {
  return value === VOID;
}
function setupCauseParameter(cause) {
  return {cause: cause};
}
function setPropertiesToThrowableInstance(this_, message, cause) {
  this_.name = Object.getPrototypeOf(this_).constructor.name;
  if (message == null) {
    var tmp;
    if (isUndefined(message)) {
      var tmp1_elvis_lhs = cause == null ? null : cause.toString();
      tmp = tmp1_elvis_lhs == null ? VOID : tmp1_elvis_lhs;
    } else {
      tmp = VOID;
    }
    this_.message = tmp;
  }
}
function noWhenBranchMatchedException() {
  throw NoWhenBranchMatchedException.u1();
}
function THROW_NPE() {
  throw NullPointerException.y1();
}
function THROW_CCE() {
  throw ClassCastException.c2();
}
function ensureNotNull(v) {
  var tmp;
  if (v == null) {
    THROW_NPE();
  } else {
    tmp = v;
  }
  return tmp;
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
function initMetadataForInterface(ctor, name, defaultConstructor, parent, interfaces, suspendArity, associatedObjectKey, associatedObjects) {
  var kind = 'interface';
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
function numberToInt(a) {
  var tmp;
  if (a instanceof Long) {
    tmp = convertToInt(a);
  } else {
    tmp = doubleToInt(a);
  }
  return tmp;
}
function doubleToInt(a) {
  var tmp;
  if (a > 2147483647) {
    tmp = 2147483647;
  } else if (a < -2147483648) {
    tmp = -2147483648;
  } else {
    // Inline function 'kotlin.js.jsBitwiseOr' call
    tmp = a | 0;
  }
  return tmp;
}
function isArrayish(o) {
  return isJsArray(o) || isView(o);
}
function isJsArray(obj) {
  // Inline function 'kotlin.js.unsafeCast' call
  return Array.isArray(obj);
}
function isInterface(obj, iface) {
  return obj[iface.Symbol] === true;
}
function isArray(obj) {
  var tmp;
  if (isJsArray(obj)) {
    // Inline function 'kotlin.js.asDynamic' call
    tmp = !obj.$type$;
  } else {
    tmp = false;
  }
  return tmp;
}
function isNumber(a) {
  var tmp;
  if (typeof a === 'number') {
    tmp = true;
  } else {
    tmp = a instanceof Long;
  }
  return tmp;
}
function isCharSequence(value) {
  return typeof value === 'string' || isInterface(value, CharSequence);
}
function isBooleanArray(a) {
  return isJsArray(a) && a.$type$ === 'BooleanArray';
}
function isByteArray(a) {
  // Inline function 'kotlin.js.jsInstanceOf' call
  return a instanceof Int8Array;
}
function isShortArray(a) {
  // Inline function 'kotlin.js.jsInstanceOf' call
  return a instanceof Int16Array;
}
function isCharArray(a) {
  var tmp;
  // Inline function 'kotlin.js.jsInstanceOf' call
  if (a instanceof Uint16Array) {
    tmp = a.$type$ === 'CharArray';
  } else {
    tmp = false;
  }
  return tmp;
}
function isIntArray(a) {
  // Inline function 'kotlin.js.jsInstanceOf' call
  return a instanceof Int32Array;
}
function isFloatArray(a) {
  // Inline function 'kotlin.js.jsInstanceOf' call
  return a instanceof Float32Array;
}
function isDoubleArray(a) {
  // Inline function 'kotlin.js.jsInstanceOf' call
  return a instanceof Float64Array;
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
function copyOf(_this__u8e3s4, newSize) {
  // Inline function 'kotlin.require' call
  if (!(newSize >= 0)) {
    var message = 'Invalid new array size: ' + newSize + '.';
    throw IllegalArgumentException.g2(toString_1(message));
  }
  return fillFrom(_this__u8e3s4, new Int32Array(newSize));
}
function copyOf_0(_this__u8e3s4, newSize) {
  // Inline function 'kotlin.require' call
  if (!(newSize >= 0)) {
    var message = 'Invalid new array size: ' + newSize + '.';
    throw IllegalArgumentException.g2(toString_1(message));
  }
  return arrayCopyResize(_this__u8e3s4, newSize, null);
}
function isNaN_0(_this__u8e3s4) {
  return !(_this__u8e3s4 === _this__u8e3s4);
}
function takeHighestOneBit(_this__u8e3s4) {
  var tmp;
  if (_this__u8e3s4 === 0) {
    tmp = 0;
  } else {
    // Inline function 'kotlin.countLeadingZeroBits' call
    tmp = 1 << (31 - clz32(_this__u8e3s4) | 0);
  }
  return tmp;
}
var Unit_instance;
function Unit_getInstance() {
  return Unit_instance;
}
function collectionToArray(collection) {
  return collectionToArrayCommonImpl(collection);
}
function terminateCollectionToArray(collectionSize, array) {
  return array;
}
function arrayOfNulls(reference, size) {
  // Inline function 'kotlin.arrayOfNulls' call
  // Inline function 'kotlin.js.unsafeCast' call
  // Inline function 'kotlin.js.asDynamic' call
  return Array(size);
}
function arrayCopy(source, destination, destinationOffset, startIndex, endIndex) {
  Companion_instance_3.i2(startIndex, endIndex, source.length);
  var rangeSize = endIndex - startIndex | 0;
  Companion_instance_3.i2(destinationOffset, destinationOffset + rangeSize | 0, destination.length);
  if (isView(destination) && isView(source)) {
    // Inline function 'kotlin.js.asDynamic' call
    var subrange = source.subarray(startIndex, endIndex);
    // Inline function 'kotlin.js.asDynamic' call
    destination.set(subrange, destinationOffset);
  } else {
    if (!(source === destination) || destinationOffset <= startIndex) {
      var inductionVariable = 0;
      if (inductionVariable < rangeSize)
        do {
          var index = inductionVariable;
          inductionVariable = inductionVariable + 1 | 0;
          destination[destinationOffset + index | 0] = source[startIndex + index | 0];
        }
         while (inductionVariable < rangeSize);
    } else {
      var inductionVariable_0 = rangeSize - 1 | 0;
      if (0 <= inductionVariable_0)
        do {
          var index_0 = inductionVariable_0;
          inductionVariable_0 = inductionVariable_0 + -1 | 0;
          destination[destinationOffset + index_0 | 0] = source[startIndex + index_0 | 0];
        }
         while (0 <= inductionVariable_0);
    }
  }
}
function arrayOfUninitializedElements(capacity) {
  // Inline function 'kotlin.require' call
  if (!(capacity >= 0)) {
    var message = 'capacity must be non-negative.';
    throw IllegalArgumentException.g2(toString_1(message));
  }
  // Inline function 'kotlin.arrayOfNulls' call
  // Inline function 'kotlin.js.unsafeCast' call
  // Inline function 'kotlin.js.asDynamic' call
  return Array(capacity);
}
function resetRange(_this__u8e3s4, fromIndex, toIndex) {
  // Inline function 'kotlin.js.nativeFill' call
  // Inline function 'kotlin.js.asDynamic' call
  _this__u8e3s4.fill(null, fromIndex, toIndex);
}
function copyOfUninitializedElements(_this__u8e3s4, newSize) {
  // Inline function 'kotlin.js.unsafeCast' call
  // Inline function 'kotlin.js.asDynamic' call
  return copyOf_0(_this__u8e3s4, newSize);
}
var Companion_instance_1;
function Companion_getInstance_1() {
  if (Companion_instance_1 === VOID)
    new Companion_1();
  return Companion_instance_1;
}
function rangeCheck($this, index) {
  // Inline function 'kotlin.apply' call
  Companion_instance_3.j3(index, $this.y());
  return index;
}
function insertionRangeCheck($this, index) {
  // Inline function 'kotlin.apply' call
  Companion_instance_3.k3(index, $this.y());
  return index;
}
function init_kotlin_collections_HashSet(_this__u8e3s4) {
}
function computeHashSize($this, capacity) {
  return takeHighestOneBit(imul_0(coerceAtLeast(capacity, 1), 3));
}
function computeShift($this, hashSize) {
  // Inline function 'kotlin.countLeadingZeroBits' call
  return clz32(hashSize) + 1 | 0;
}
function checkForComodification($this) {
  if (!($this.q4_1.c4_1 === $this.s4_1))
    throw ConcurrentModificationException.p4('The backing map has been modified after this entry was obtained.');
}
function _get_capacity__a9k9f3($this) {
  return $this.v3_1.length;
}
function _get_hashSize__tftcho($this) {
  return $this.y3_1.length;
}
function registerModification($this) {
  $this.c4_1 = $this.c4_1 + 1 | 0;
}
function ensureExtraCapacity($this, n) {
  if (shouldCompact($this, n)) {
    compact($this, true);
  } else {
    ensureCapacity($this, $this.a4_1 + n | 0);
  }
}
function shouldCompact($this, extraCapacity) {
  var spareCapacity = _get_capacity__a9k9f3($this) - $this.a4_1 | 0;
  var gaps = $this.a4_1 - $this.y() | 0;
  return spareCapacity < extraCapacity && (gaps + spareCapacity | 0) >= extraCapacity && gaps >= (_get_capacity__a9k9f3($this) / 4 | 0);
}
function ensureCapacity($this, minCapacity) {
  if (minCapacity < 0)
    throw RuntimeException.v4('too many elements');
  if (minCapacity > _get_capacity__a9k9f3($this)) {
    var newSize = Companion_instance_3.w4(_get_capacity__a9k9f3($this), minCapacity);
    $this.v3_1 = copyOfUninitializedElements($this.v3_1, newSize);
    var tmp = $this;
    var tmp0_safe_receiver = $this.w3_1;
    tmp.w3_1 = tmp0_safe_receiver == null ? null : copyOfUninitializedElements(tmp0_safe_receiver, newSize);
    $this.x3_1 = copyOf($this.x3_1, newSize);
    var newHashSize = computeHashSize(Companion_instance_2, newSize);
    if (newHashSize > _get_hashSize__tftcho($this)) {
      rehash($this, newHashSize);
    }
  }
}
function allocateValuesArray($this) {
  var curValuesArray = $this.w3_1;
  if (!(curValuesArray == null))
    return curValuesArray;
  var newValuesArray = arrayOfUninitializedElements(_get_capacity__a9k9f3($this));
  $this.w3_1 = newValuesArray;
  return newValuesArray;
}
function hash($this, key) {
  return key == null ? 0 : imul_0(hashCode_0(key), -1640531527) >>> $this.b4_1 | 0;
}
function compact($this, updateHashArray) {
  var i = 0;
  var j = 0;
  var valuesArray = $this.w3_1;
  while (i < $this.a4_1) {
    var hash = $this.x3_1[i];
    if (hash >= 0) {
      $this.v3_1[j] = $this.v3_1[i];
      if (!(valuesArray == null)) {
        valuesArray[j] = valuesArray[i];
      }
      if (updateHashArray) {
        $this.x3_1[j] = hash;
        $this.y3_1[hash] = j + 1 | 0;
      }
      j = j + 1 | 0;
    }
    i = i + 1 | 0;
  }
  resetRange($this.v3_1, j, $this.a4_1);
  if (valuesArray == null)
    null;
  else {
    resetRange(valuesArray, j, $this.a4_1);
  }
  $this.a4_1 = j;
}
function rehash($this, newHashSize) {
  registerModification($this);
  if ($this.a4_1 > $this.d4_1) {
    compact($this, false);
  }
  $this.y3_1 = new Int32Array(newHashSize);
  $this.b4_1 = computeShift(Companion_instance_2, newHashSize);
  var i = 0;
  while (i < $this.a4_1) {
    var _unary__edvuaz = i;
    i = _unary__edvuaz + 1 | 0;
    if (!putRehash($this, _unary__edvuaz)) {
      throw IllegalStateException.q1('This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?');
    }
  }
}
function putRehash($this, i) {
  var hash_0 = hash($this, $this.v3_1[i]);
  var probesLeft = $this.z3_1;
  while (true) {
    var index = $this.y3_1[hash_0];
    if (index === 0) {
      $this.y3_1[hash_0] = i + 1 | 0;
      $this.x3_1[i] = hash_0;
      return true;
    }
    probesLeft = probesLeft - 1 | 0;
    if (probesLeft < 0)
      return false;
    var _unary__edvuaz = hash_0;
    hash_0 = _unary__edvuaz - 1 | 0;
    if (_unary__edvuaz === 0)
      hash_0 = _get_hashSize__tftcho($this) - 1 | 0;
  }
}
function findKey($this, key) {
  var hash_0 = hash($this, key);
  var probesLeft = $this.z3_1;
  while (true) {
    var index = $this.y3_1[hash_0];
    if (index === 0)
      return -1;
    if (equals($this.v3_1[index - 1 | 0], key))
      return index - 1 | 0;
    probesLeft = probesLeft - 1 | 0;
    if (probesLeft < 0)
      return -1;
    var _unary__edvuaz = hash_0;
    hash_0 = _unary__edvuaz - 1 | 0;
    if (_unary__edvuaz === 0)
      hash_0 = _get_hashSize__tftcho($this) - 1 | 0;
  }
}
function addKey($this, key) {
  $this.x4();
  retry: while (true) {
    var hash_0 = hash($this, key);
    var tentativeMaxProbeDistance = coerceAtMost(imul_0($this.z3_1, 2), _get_hashSize__tftcho($this) / 2 | 0);
    var probeDistance = 0;
    while (true) {
      var index = $this.y3_1[hash_0];
      if (index === 0) {
        if ($this.a4_1 >= _get_capacity__a9k9f3($this)) {
          ensureExtraCapacity($this, 1);
          continue retry;
        }
        var _unary__edvuaz = $this.a4_1;
        $this.a4_1 = _unary__edvuaz + 1 | 0;
        var putIndex = _unary__edvuaz;
        $this.v3_1[putIndex] = key;
        $this.x3_1[putIndex] = hash_0;
        $this.y3_1[hash_0] = putIndex + 1 | 0;
        $this.d4_1 = $this.d4_1 + 1 | 0;
        registerModification($this);
        if (probeDistance > $this.z3_1)
          $this.z3_1 = probeDistance;
        return putIndex;
      }
      if (equals($this.v3_1[index - 1 | 0], key)) {
        return -index | 0;
      }
      probeDistance = probeDistance + 1 | 0;
      if (probeDistance > tentativeMaxProbeDistance) {
        rehash($this, imul_0(_get_hashSize__tftcho($this), 2));
        continue retry;
      }
      var _unary__edvuaz_0 = hash_0;
      hash_0 = _unary__edvuaz_0 - 1 | 0;
      if (_unary__edvuaz_0 === 0)
        hash_0 = _get_hashSize__tftcho($this) - 1 | 0;
    }
  }
}
function contentEquals($this, other) {
  return $this.d4_1 === other.y() && $this.y4(other.f1());
}
var Companion_instance_2;
function Companion_getInstance_2() {
  return Companion_instance_2;
}
function init_kotlin_collections_LinkedHashSet(_this__u8e3s4) {
}
var CompletedContinuation_instance;
function CompletedContinuation_getInstance() {
  return CompletedContinuation_instance;
}
function intercepted(_this__u8e3s4) {
  var tmp0_safe_receiver = _this__u8e3s4 instanceof InterceptedCoroutine ? _this__u8e3s4 : null;
  var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : tmp0_safe_receiver.q6();
  return tmp1_elvis_lhs == null ? _this__u8e3s4 : tmp1_elvis_lhs;
}
function invokeSuspendSuperTypeWithReceiver(_this__u8e3s4, receiver, completion) {
  throw NotImplementedError.w6('It is intrinsic method');
}
function createCoroutineUninterceptedGeneratorVersion(_this__u8e3s4, receiver, completion) {
  // Inline function 'kotlin.coroutines.intrinsics.createCoroutineFromGeneratorFunction' call
  // Inline function 'kotlin.js.unsafeCast' call
  // Inline function 'kotlin.js.asDynamic' call
  var continuation = new GeneratorCoroutineImpl(completion);
  var tmp = continuation;
  // Inline function 'kotlin.js.asDynamic' call
  var a = _this__u8e3s4;
  tmp.k6_1 = typeof a === 'function' ? a(receiver, continuation) : _this__u8e3s4.x6(receiver, continuation);
  return continuation;
}
function startCoroutineUninterceptedOrReturnGeneratorVersion(_this__u8e3s4, receiver, completion) {
  // Inline function 'kotlin.coroutines.intrinsics.startCoroutineFromGeneratorFunction' call
  // Inline function 'kotlin.js.unsafeCast' call
  // Inline function 'kotlin.js.asDynamic' call
  var continuation = new GeneratorCoroutineImpl(completion);
  // Inline function 'kotlin.js.asDynamic' call
  var a = _this__u8e3s4;
  var generator = typeof a === 'function' ? a(receiver, continuation) : _this__u8e3s4.x6(receiver, continuation);
  continuation.k6_1 = generator;
  return continuation.n6();
}
function init_kotlin_UnsupportedOperationException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.q3_1);
}
function init_kotlin_IllegalStateException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.i_1);
}
function init_kotlin_IllegalArgumentException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.f2_1);
}
function init_kotlin_RuntimeException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.u4_1);
}
function init_kotlin_Exception(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.o1_1);
}
function init_kotlin_NoSuchElementException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.s2_1);
}
function init_kotlin_IndexOutOfBoundsException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.h7_1);
}
function init_kotlin_Error(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.k7_1);
}
function init_kotlin_ConcurrentModificationException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.o4_1);
}
function init_kotlin_UninitializedPropertyAccessException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.q_1);
}
function init_kotlin_NoWhenBranchMatchedException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.t1_1);
}
function init_kotlin_NullPointerException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.x1_1);
}
function init_kotlin_ClassCastException(_this__u8e3s4) {
  captureStack(_this__u8e3s4, _this__u8e3s4.b2_1);
}
function fillFrom(src, dst) {
  var srcLen = src.length;
  var dstLen = dst.length;
  var index = 0;
  // Inline function 'kotlin.js.unsafeCast' call
  var arr = dst;
  while (index < srcLen && index < dstLen) {
    var tmp = index;
    var _unary__edvuaz = index;
    index = _unary__edvuaz + 1 | 0;
    arr[tmp] = src[_unary__edvuaz];
  }
  return dst;
}
function arrayCopyResize(source, newSize, defaultValue) {
  // Inline function 'kotlin.js.unsafeCast' call
  var result = source.slice(0, newSize);
  // Inline function 'kotlin.copyArrayType' call
  if (source.$type$ !== undefined) {
    result.$type$ = source.$type$;
  }
  var index = source.length;
  if (newSize > index) {
    // Inline function 'kotlin.js.asDynamic' call
    result.length = newSize;
    while (index < newSize) {
      var _unary__edvuaz = index;
      index = _unary__edvuaz + 1 | 0;
      result[_unary__edvuaz] = defaultValue;
    }
  }
  return result;
}
var NothingKClassImpl_instance;
function NothingKClassImpl_getInstance() {
  if (NothingKClassImpl_instance === VOID)
    new NothingKClassImpl();
  return NothingKClassImpl_instance;
}
function get_functionClasses() {
  _init_properties_primitives_kt__3fums4();
  return functionClasses;
}
var functionClasses;
function PrimitiveClasses$anyClass$lambda(it) {
  return !(it == null);
}
function PrimitiveClasses$numberClass$lambda(it) {
  return isNumber(it);
}
function PrimitiveClasses$booleanClass$lambda(it) {
  return !(it == null) ? typeof it === 'boolean' : false;
}
function PrimitiveClasses$byteClass$lambda(it) {
  return !(it == null) ? typeof it === 'number' : false;
}
function PrimitiveClasses$shortClass$lambda(it) {
  return !(it == null) ? typeof it === 'number' : false;
}
function PrimitiveClasses$intClass$lambda(it) {
  return !(it == null) ? typeof it === 'number' : false;
}
function PrimitiveClasses$longClass$lambda(it) {
  return it instanceof Long;
}
function PrimitiveClasses$floatClass$lambda(it) {
  return !(it == null) ? typeof it === 'number' : false;
}
function PrimitiveClasses$doubleClass$lambda(it) {
  return !(it == null) ? typeof it === 'number' : false;
}
function PrimitiveClasses$arrayClass$lambda(it) {
  return !(it == null) ? isArray(it) : false;
}
function PrimitiveClasses$stringClass$lambda(it) {
  return !(it == null) ? typeof it === 'string' : false;
}
function PrimitiveClasses$throwableClass$lambda(it) {
  return it instanceof Error;
}
function PrimitiveClasses$booleanArrayClass$lambda(it) {
  return !(it == null) ? isBooleanArray(it) : false;
}
function PrimitiveClasses$charArrayClass$lambda(it) {
  return !(it == null) ? isCharArray(it) : false;
}
function PrimitiveClasses$byteArrayClass$lambda(it) {
  return !(it == null) ? isByteArray(it) : false;
}
function PrimitiveClasses$shortArrayClass$lambda(it) {
  return !(it == null) ? isShortArray(it) : false;
}
function PrimitiveClasses$intArrayClass$lambda(it) {
  return !(it == null) ? isIntArray(it) : false;
}
function PrimitiveClasses$floatArrayClass$lambda(it) {
  return !(it == null) ? isFloatArray(it) : false;
}
function PrimitiveClasses$doubleArrayClass$lambda(it) {
  return !(it == null) ? isDoubleArray(it) : false;
}
function PrimitiveClasses$functionClass$lambda($arity) {
  return (it) => {
    var tmp;
    if (typeof it === 'function') {
      // Inline function 'kotlin.js.asDynamic' call
      tmp = it.length === $arity;
    } else {
      tmp = false;
    }
    return tmp;
  };
}
var PrimitiveClasses_instance;
function PrimitiveClasses_getInstance() {
  if (PrimitiveClasses_instance === VOID)
    new PrimitiveClasses();
  return PrimitiveClasses_instance;
}
var properties_initialized_primitives_kt_jle18u;
function _init_properties_primitives_kt__3fums4() {
  if (!properties_initialized_primitives_kt_jle18u) {
    properties_initialized_primitives_kt_jle18u = true;
    // Inline function 'kotlin.arrayOfNulls' call
    functionClasses = Array(0);
  }
}
function getKClass(jClass) {
  if (jClass === String) {
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    return PrimitiveClasses_getInstance().stringClass;
  }
  // Inline function 'kotlin.js.asDynamic' call
  var metadata = jClass.$metadata$;
  var tmp;
  if (metadata != null) {
    var tmp_0;
    if (metadata.$kClass$ == null) {
      var kClass = new SimpleKClassImpl(jClass);
      metadata.$kClass$ = kClass;
      tmp_0 = kClass;
    } else {
      tmp_0 = metadata.$kClass$;
    }
    tmp = tmp_0;
  } else {
    tmp = new SimpleKClassImpl(jClass);
  }
  return tmp;
}
function getKClassFromExpression(e) {
  var tmp;
  switch (typeof e) {
    case 'string':
      tmp = PrimitiveClasses_getInstance().stringClass;
      break;
    case 'number':
      var tmp_0;
      // Inline function 'kotlin.js.jsBitwiseOr' call

      // Inline function 'kotlin.js.asDynamic' call

      if ((e | 0) === e) {
        tmp_0 = PrimitiveClasses_getInstance().intClass;
      } else {
        tmp_0 = PrimitiveClasses_getInstance().doubleClass;
      }

      tmp = tmp_0;
      break;
    case 'boolean':
      tmp = PrimitiveClasses_getInstance().booleanClass;
      break;
    case 'function':
      var tmp_1 = PrimitiveClasses_getInstance();
      // Inline function 'kotlin.js.asDynamic' call

      tmp = tmp_1.functionClass(e.length);
      break;
    default:
      var tmp_2;
      if (isBooleanArray(e)) {
        tmp_2 = PrimitiveClasses_getInstance().booleanArrayClass;
      } else {
        if (isCharArray(e)) {
          tmp_2 = PrimitiveClasses_getInstance().charArrayClass;
        } else {
          if (isByteArray(e)) {
            tmp_2 = PrimitiveClasses_getInstance().byteArrayClass;
          } else {
            if (isShortArray(e)) {
              tmp_2 = PrimitiveClasses_getInstance().shortArrayClass;
            } else {
              if (isIntArray(e)) {
                tmp_2 = PrimitiveClasses_getInstance().intArrayClass;
              } else {
                if (isLongArray(e)) {
                  tmp_2 = get_longArrayClass();
                } else {
                  if (isFloatArray(e)) {
                    tmp_2 = PrimitiveClasses_getInstance().floatArrayClass;
                  } else {
                    if (isDoubleArray(e)) {
                      tmp_2 = PrimitiveClasses_getInstance().doubleArrayClass;
                    } else {
                      if (isInterface(e, KClass)) {
                        tmp_2 = getKClass(KClass);
                      } else {
                        if (isArray(e)) {
                          tmp_2 = PrimitiveClasses_getInstance().arrayClass;
                        } else {
                          var constructor = Object.getPrototypeOf(e).constructor;
                          var tmp_3;
                          if (constructor === Object) {
                            tmp_3 = PrimitiveClasses_getInstance().anyClass;
                          } else if (constructor === Error) {
                            tmp_3 = PrimitiveClasses_getInstance().throwableClass;
                          } else {
                            var jsClass = constructor;
                            tmp_3 = getKClass(jsClass);
                          }
                          tmp_2 = tmp_3;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }

      tmp = tmp_2;
      break;
  }
  // Inline function 'kotlin.js.unsafeCast' call
  // Inline function 'kotlin.js.asDynamic' call
  return tmp;
}
function addSuppressed(_this__u8e3s4, exception) {
  if (!(_this__u8e3s4 === exception)) {
    // Inline function 'kotlin.js.asDynamic' call
    // Inline function 'kotlin.js.unsafeCast' call
    var suppressed = _this__u8e3s4._suppressed;
    if (suppressed == null) {
      // Inline function 'kotlin.js.asDynamic' call
      _this__u8e3s4._suppressed = mutableListOf([exception]);
    } else {
      suppressed.l2(exception);
    }
  }
}
function AbstractCollection$toString$lambda(this$0) {
  return (it) => it === this$0 ? '(this Collection)' : toString_0(it);
}
var Companion_instance_3;
function Companion_getInstance_3() {
  return Companion_instance_3;
}
var Companion_instance_4;
function Companion_getInstance_4() {
  return Companion_instance_4;
}
function ensureCapacity_0($this, minCapacity) {
  if (minCapacity < 0)
    throw IllegalStateException.q1('Deque is too big.');
  if (minCapacity <= $this.u8_1.length)
    return Unit_instance;
  if ($this.u8_1 === Companion_getInstance_5().w8_1) {
    var tmp = $this;
    // Inline function 'kotlin.arrayOfNulls' call
    var size = coerceAtLeast(minCapacity, 10);
    tmp.u8_1 = Array(size);
    return Unit_instance;
  }
  var newCapacity = Companion_instance_3.w4($this.u8_1.length, minCapacity);
  copyElements($this, newCapacity);
}
function copyElements($this, newCapacity) {
  // Inline function 'kotlin.arrayOfNulls' call
  var newElements = Array(newCapacity);
  var tmp0 = $this.u8_1;
  var tmp6 = $this.t8_1;
  // Inline function 'kotlin.collections.copyInto' call
  var endIndex = $this.u8_1.length;
  arrayCopy(tmp0, newElements, 0, tmp6, endIndex);
  var tmp0_0 = $this.u8_1;
  var tmp4 = $this.u8_1.length - $this.t8_1 | 0;
  // Inline function 'kotlin.collections.copyInto' call
  var endIndex_0 = $this.t8_1;
  arrayCopy(tmp0_0, newElements, tmp4, 0, endIndex_0);
  $this.t8_1 = 0;
  $this.u8_1 = newElements;
}
function positiveMod($this, index) {
  return index >= $this.u8_1.length ? index - $this.u8_1.length | 0 : index;
}
function incremented($this, index) {
  return index === get_lastIndex($this.u8_1) ? 0 : index + 1 | 0;
}
function decremented($this, index) {
  return index === 0 ? get_lastIndex($this.u8_1) : index - 1 | 0;
}
function registerModification_0($this) {
  $this.u2_1 = $this.u2_1 + 1 | 0;
}
var Companion_instance_5;
function Companion_getInstance_5() {
  if (Companion_instance_5 === VOID)
    new Companion_5();
  return Companion_instance_5;
}
function init_kotlin_collections_ArrayDeque(_this__u8e3s4) {
  Companion_getInstance_5();
  _this__u8e3s4.t8_1 = 0;
  _this__u8e3s4.v8_1 = 0;
}
function collectionToArrayCommonImpl(collection) {
  if (collection.z()) {
    // Inline function 'kotlin.emptyArray' call
    return [];
  }
  // Inline function 'kotlin.arrayOfNulls' call
  var size = collection.y();
  var destination = Array(size);
  var iterator = collection.v();
  var index = 0;
  while (iterator.w()) {
    var _unary__edvuaz = index;
    index = _unary__edvuaz + 1 | 0;
    destination[_unary__edvuaz] = iterator.x();
  }
  return destination;
}
function get_lastIndex_0(_this__u8e3s4) {
  return _this__u8e3s4.y() - 1 | 0;
}
function mutableListOf(elements) {
  var tmp;
  if (elements.length === 0) {
    tmp = ArrayList.m3();
  } else {
    // Inline function 'kotlin.collections.asArrayList' call
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    tmp = ArrayList.l3(elements);
  }
  return tmp;
}
function removeFirstOrNull(_this__u8e3s4) {
  return _this__u8e3s4.z() ? null : _this__u8e3s4.x2(0);
}
function startCoroutine(_this__u8e3s4, receiver, completion) {
  // Inline function 'kotlin.coroutines.resume' call
  var this_0 = intercepted(createCoroutineUninterceptedGeneratorVersion(_this__u8e3s4, receiver, completion));
  // Inline function 'kotlin.Companion.success' call
  var tmp$ret$1 = _Result___init__impl__xyqfz8(Unit_instance);
  this_0.h6(tmp$ret$1);
}
var Key_instance;
function Key_getInstance() {
  return Key_instance;
}
function CoroutineContext$plus$lambda(acc, element) {
  var removed = acc.j9(element.d1());
  var tmp;
  if (removed === EmptyCoroutineContext_getInstance()) {
    tmp = element;
  } else {
    var interceptor = removed.r6(Key_instance);
    var tmp_0;
    if (interceptor == null) {
      tmp_0 = new CombinedContext(removed, element);
    } else {
      var left = removed.j9(Key_instance);
      tmp_0 = left === EmptyCoroutineContext_getInstance() ? new CombinedContext(element, interceptor) : new CombinedContext(new CombinedContext(left, element), interceptor);
    }
    tmp = tmp_0;
  }
  return tmp;
}
var EmptyCoroutineContext_instance;
function EmptyCoroutineContext_getInstance() {
  if (EmptyCoroutineContext_instance === VOID)
    new EmptyCoroutineContext();
  return EmptyCoroutineContext_instance;
}
function size($this) {
  var cur = $this;
  var size = 2;
  while (true) {
    var tmp = cur.n9_1;
    var tmp0_elvis_lhs = tmp instanceof CombinedContext ? tmp : null;
    var tmp_0;
    if (tmp0_elvis_lhs == null) {
      return size;
    } else {
      tmp_0 = tmp0_elvis_lhs;
    }
    cur = tmp_0;
    size = size + 1 | 0;
  }
}
function contains($this, element) {
  return equals($this.r6(element.d1()), element);
}
function containsAll($this, context) {
  var cur = context;
  while (true) {
    if (!contains($this, cur.o9_1))
      return false;
    var next = cur.n9_1;
    if (next instanceof CombinedContext) {
      cur = next;
    } else {
      return contains($this, isInterface(next, Element) ? next : THROW_CCE());
    }
  }
}
function CombinedContext$toString$lambda(acc, element) {
  var tmp;
  // Inline function 'kotlin.text.isEmpty' call
  if (charSequenceLength(acc) === 0) {
    tmp = toString_1(element);
  } else {
    tmp = acc + ', ' + toString_1(element);
  }
  return tmp;
}
function get_COROUTINE_SUSPENDED() {
  return CoroutineSingletons_COROUTINE_SUSPENDED_getInstance();
}
var CoroutineSingletons_COROUTINE_SUSPENDED_instance;
var CoroutineSingletons_UNDECIDED_instance;
var CoroutineSingletons_RESUMED_instance;
var CoroutineSingletons_entriesInitialized;
function CoroutineSingletons_initEntries() {
  if (CoroutineSingletons_entriesInitialized)
    return Unit_instance;
  CoroutineSingletons_entriesInitialized = true;
  CoroutineSingletons_COROUTINE_SUSPENDED_instance = new CoroutineSingletons('COROUTINE_SUSPENDED', 0);
  CoroutineSingletons_UNDECIDED_instance = new CoroutineSingletons('UNDECIDED', 1);
  CoroutineSingletons_RESUMED_instance = new CoroutineSingletons('RESUMED', 2);
}
function CoroutineSingletons_COROUTINE_SUSPENDED_getInstance() {
  CoroutineSingletons_initEntries();
  return CoroutineSingletons_COROUTINE_SUSPENDED_instance;
}
function appendElement(_this__u8e3s4, element, transform) {
  if (!(transform == null))
    _this__u8e3s4.u(transform(element));
  else {
    if (element == null ? true : isCharSequence(element))
      _this__u8e3s4.u(element);
    else {
      if (element instanceof Char)
        _this__u8e3s4.w5(element.q9_1);
      else {
        _this__u8e3s4.u(toString_1(element));
      }
    }
  }
}
function _Result___init__impl__xyqfz8(value) {
  return value;
}
function _Result___get_value__impl__bjfvqg($this) {
  return $this;
}
function Result__exceptionOrNull_impl_p6xea9($this) {
  var tmp;
  if (_Result___get_value__impl__bjfvqg($this) instanceof Failure) {
    tmp = _Result___get_value__impl__bjfvqg($this).r9_1;
  } else {
    tmp = null;
  }
  return tmp;
}
function Result__toString_impl_yu5r8k($this) {
  var tmp;
  if (_Result___get_value__impl__bjfvqg($this) instanceof Failure) {
    tmp = _Result___get_value__impl__bjfvqg($this).toString();
  } else {
    tmp = 'Success(' + toString_0(_Result___get_value__impl__bjfvqg($this)) + ')';
  }
  return tmp;
}
var Companion_instance_6;
function Companion_getInstance_6() {
  return Companion_instance_6;
}
function Result__hashCode_impl_d2zufp($this) {
  return $this == null ? 0 : hashCode_0($this);
}
function Result__equals_impl_bxgmep($this, other) {
  if (!(other instanceof Result))
    return false;
  var tmp0_other_with_cast = other.s9_1;
  if (!equals($this, tmp0_other_with_cast))
    return false;
  return true;
}
function createFailure(exception) {
  return new Failure(exception);
}
var None_instance;
function None_getInstance() {
  if (None_instance === VOID)
    new None();
  return None_instance;
}
function atomic$ref$1(initial) {
  return atomic$ref$(initial, None_getInstance());
}
function atomic$boolean$1(initial) {
  return atomic$boolean$(initial, None_getInstance());
}
function atomic$ref$(initial, trace) {
  trace = trace === VOID ? None_getInstance() : trace;
  return new AtomicRef(initial);
}
function atomic$boolean$(initial, trace) {
  trace = trace === VOID ? None_getInstance() : trace;
  return new AtomicBoolean(initial);
}
function async(_this__u8e3s4, context, start, block) {
  context = context === VOID ? EmptyCoroutineContext_getInstance() : context;
  start = start === VOID ? CoroutineStart_DEFAULT_getInstance() : start;
  var newContext = newCoroutineContext(_this__u8e3s4, context);
  var coroutine = start.ub() ? new LazyDeferredCoroutine(newContext, block) : new DeferredCoroutine(newContext, true);
  coroutine.qa(start, coroutine, block);
  return coroutine;
}
function _get_parentHandle__f8dcex($this) {
  return $this.ec_1.kotlinx$atomicfu$value;
}
function toState(_this__u8e3s4) {
  // Inline function 'kotlin.getOrElse' call
  var exception = Result__exceptionOrNull_impl_p6xea9(_this__u8e3s4);
  var tmp;
  if (exception == null) {
    tmp = _Result___get_value__impl__bjfvqg(_this__u8e3s4);
  } else {
    tmp = new CompletedExceptionally(exception);
  }
  return tmp;
}
function CoroutineDispatcher$Key$_init_$lambda_akl8b5(it) {
  return it instanceof CoroutineDispatcher ? it : null;
}
var Key_instance_0;
function Key_getInstance_0() {
  if (Key_instance_0 === VOID)
    new Key_0();
  return Key_instance_0;
}
function handleCoroutineException(context, exception) {
  var tmp;
  if (exception instanceof DispatchException) {
    tmp = exception.tc_1;
  } else {
    tmp = exception;
  }
  var reportException = tmp;
  try {
    var tmp0_safe_receiver = context.r6(Key_instance_1);
    if (tmp0_safe_receiver == null)
      null;
    else {
      // Inline function 'kotlin.let' call
      tmp0_safe_receiver.vc(context, reportException);
      return Unit_instance;
    }
  } catch ($p) {
    if ($p instanceof Error) {
      var t = $p;
      handleUncaughtCoroutineException(context, handlerException(reportException, t));
      return Unit_instance;
    } else {
      throw $p;
    }
  }
  handleUncaughtCoroutineException(context, reportException);
}
var Key_instance_1;
function Key_getInstance_1() {
  return Key_instance_1;
}
function handlerException(originalException, thrownException) {
  if (originalException === thrownException)
    return originalException;
  // Inline function 'kotlin.apply' call
  var this_0 = RuntimeException.a7('Exception while trying to handle coroutine exception', thrownException);
  addSuppressed(this_0, originalException);
  return this_0;
}
var GlobalScope_instance;
function GlobalScope_getInstance() {
  return GlobalScope_instance;
}
var CoroutineStart_DEFAULT_instance;
var CoroutineStart_LAZY_instance;
var CoroutineStart_ATOMIC_instance;
var CoroutineStart_UNDISPATCHED_instance;
var CoroutineStart_entriesInitialized;
function CoroutineStart_initEntries() {
  if (CoroutineStart_entriesInitialized)
    return Unit_instance;
  CoroutineStart_entriesInitialized = true;
  CoroutineStart_DEFAULT_instance = new CoroutineStart('DEFAULT', 0);
  CoroutineStart_LAZY_instance = new CoroutineStart('LAZY', 1);
  CoroutineStart_ATOMIC_instance = new CoroutineStart('ATOMIC', 2);
  CoroutineStart_UNDISPATCHED_instance = new CoroutineStart('UNDISPATCHED', 3);
}
function CoroutineStart_DEFAULT_getInstance() {
  CoroutineStart_initEntries();
  return CoroutineStart_DEFAULT_instance;
}
function CoroutineStart_LAZY_getInstance() {
  CoroutineStart_initEntries();
  return CoroutineStart_LAZY_instance;
}
function delta($this, unconfined) {
  return unconfined ? new Long(0, 1) : new Long(1, 0);
}
var ThreadLocalEventLoop_instance;
function ThreadLocalEventLoop_getInstance() {
  if (ThreadLocalEventLoop_instance === VOID)
    new ThreadLocalEventLoop();
  return ThreadLocalEventLoop_instance;
}
var Key_instance_2;
function Key_getInstance_2() {
  return Key_instance_2;
}
var NonDisposableHandle_instance;
function NonDisposableHandle_getInstance() {
  return NonDisposableHandle_instance;
}
function invokeOnCompletion(_this__u8e3s4, invokeImmediately, handler) {
  invokeImmediately = invokeImmediately === VOID ? true : invokeImmediately;
  var tmp;
  if (_this__u8e3s4 instanceof JobSupport) {
    tmp = _this__u8e3s4.fb(invokeImmediately, handler);
  } else {
    var tmp_0 = handler.zd();
    tmp = _this__u8e3s4.eb(tmp_0, invokeImmediately, JobNode$invoke$ref(handler));
  }
  return tmp;
}
function JobNode$invoke$ref(p0) {
  var l = (_this__u8e3s4) => {
    p0.ae(_this__u8e3s4);
    return Unit_instance;
  };
  l.callableName = 'invoke';
  return l;
}
function get_COMPLETING_ALREADY() {
  _init_properties_JobSupport_kt__68f172();
  return COMPLETING_ALREADY;
}
var COMPLETING_ALREADY;
function get_COMPLETING_WAITING_CHILDREN() {
  _init_properties_JobSupport_kt__68f172();
  return COMPLETING_WAITING_CHILDREN;
}
var COMPLETING_WAITING_CHILDREN;
function get_COMPLETING_RETRY() {
  _init_properties_JobSupport_kt__68f172();
  return COMPLETING_RETRY;
}
var COMPLETING_RETRY;
function get_TOO_LATE_TO_CANCEL() {
  _init_properties_JobSupport_kt__68f172();
  return TOO_LATE_TO_CANCEL;
}
var TOO_LATE_TO_CANCEL;
function get_SEALED() {
  _init_properties_JobSupport_kt__68f172();
  return SEALED;
}
var SEALED;
function get_EMPTY_NEW() {
  _init_properties_JobSupport_kt__68f172();
  return EMPTY_NEW;
}
var EMPTY_NEW;
function get_EMPTY_ACTIVE() {
  _init_properties_JobSupport_kt__68f172();
  return EMPTY_ACTIVE;
}
var EMPTY_ACTIVE;
function _set_exceptionsHolder__tqm22h($this, value) {
  $this.se_1.kotlinx$atomicfu$value = value;
}
function _get_exceptionsHolder__nhszp($this) {
  return $this.se_1.kotlinx$atomicfu$value;
}
function allocateList($this) {
  return ArrayList.h3(4);
}
function finalizeFinishingState($this, state, proposedUpdate) {
  // Inline function 'kotlinx.coroutines.assert' call
  // Inline function 'kotlinx.coroutines.assert' call
  // Inline function 'kotlinx.coroutines.assert' call
  var tmp0_safe_receiver = proposedUpdate instanceof CompletedExceptionally ? proposedUpdate : null;
  var proposedException = tmp0_safe_receiver == null ? null : tmp0_safe_receiver.ia_1;
  var wasCancelling;
  // Inline function 'kotlinx.coroutines.internal.synchronized' call
  // Inline function 'kotlinx.coroutines.internal.synchronizedImpl' call
  wasCancelling = state.te();
  var exceptions = state.ue(proposedException);
  var finalCause = getFinalRootCause($this, state, exceptions);
  if (!(finalCause == null)) {
    addSuppressedExceptions($this, finalCause, exceptions);
  }
  var finalException = finalCause;
  var finalState = finalException == null ? proposedUpdate : finalException === proposedException ? proposedUpdate : new CompletedExceptionally(finalException);
  if (!(finalException == null)) {
    var handled = cancelParent($this, finalException) || $this.qb(finalException);
    if (handled) {
      (finalState instanceof CompletedExceptionally ? finalState : THROW_CCE()).hc();
    }
  }
  if (!wasCancelling) {
    $this.nb(finalException);
  }
  $this.ha(finalState);
  var casSuccess = $this.w9_1.atomicfu$compareAndSet(state, boxIncomplete(finalState));
  // Inline function 'kotlinx.coroutines.assert' call
  completeStateFinalization($this, state, finalState);
  return finalState;
}
function getFinalRootCause($this, state, exceptions) {
  if (exceptions.z()) {
    if (state.te()) {
      // Inline function 'kotlinx.coroutines.JobSupport.defaultCancellationException' call
      return JobCancellationException.bf(null == null ? $this.ga() : null, null, $this);
    }
    return null;
  }
  var tmp$ret$1;
  $l$block: {
    // Inline function 'kotlin.collections.firstOrNull' call
    var _iterator__ex2g4s = exceptions.v();
    while (_iterator__ex2g4s.w()) {
      var element = _iterator__ex2g4s.x();
      if (!(element instanceof CancellationException)) {
        tmp$ret$1 = element;
        break $l$block;
      }
    }
    tmp$ret$1 = null;
  }
  var firstNonCancellation = tmp$ret$1;
  if (!(firstNonCancellation == null))
    return firstNonCancellation;
  var first = exceptions.b1(0);
  if (first instanceof TimeoutCancellationException) {
    var tmp$ret$3;
    $l$block_0: {
      // Inline function 'kotlin.collections.firstOrNull' call
      var _iterator__ex2g4s_0 = exceptions.v();
      while (_iterator__ex2g4s_0.w()) {
        var element_0 = _iterator__ex2g4s_0.x();
        var tmp;
        if (!(element_0 === first)) {
          tmp = element_0 instanceof TimeoutCancellationException;
        } else {
          tmp = false;
        }
        if (tmp) {
          tmp$ret$3 = element_0;
          break $l$block_0;
        }
      }
      tmp$ret$3 = null;
    }
    var detailedTimeoutException = tmp$ret$3;
    if (!(detailedTimeoutException == null))
      return detailedTimeoutException;
  }
  return first;
}
function addSuppressedExceptions($this, rootCause, exceptions) {
  if (exceptions.y() <= 1)
    return Unit_instance;
  var seenExceptions = identitySet(exceptions.y());
  var unwrappedCause = unwrap(rootCause);
  var _iterator__ex2g4s = exceptions.v();
  while (_iterator__ex2g4s.w()) {
    var exception = _iterator__ex2g4s.x();
    var unwrapped = unwrap(exception);
    var tmp;
    var tmp_0;
    if (!(unwrapped === rootCause) && !(unwrapped === unwrappedCause)) {
      tmp_0 = !(unwrapped instanceof CancellationException);
    } else {
      tmp_0 = false;
    }
    if (tmp_0) {
      tmp = seenExceptions.l2(unwrapped);
    } else {
      tmp = false;
    }
    if (tmp) {
      addSuppressed(rootCause, unwrapped);
    }
  }
}
function tryFinalizeSimpleState($this, state, update) {
  // Inline function 'kotlinx.coroutines.assert' call
  // Inline function 'kotlinx.coroutines.assert' call
  if (!$this.w9_1.atomicfu$compareAndSet(state, boxIncomplete(update)))
    return false;
  $this.nb(null);
  $this.ha(update);
  completeStateFinalization($this, state, update);
  return true;
}
function completeStateFinalization($this, state, update) {
  var tmp0_safe_receiver = $this.va();
  if (tmp0_safe_receiver == null)
    null;
  else {
    // Inline function 'kotlin.let' call
    tmp0_safe_receiver.gc();
    $this.ua(NonDisposableHandle_instance);
  }
  var tmp1_safe_receiver = update instanceof CompletedExceptionally ? update : null;
  var cause = tmp1_safe_receiver == null ? null : tmp1_safe_receiver.ia_1;
  if (state instanceof JobNode) {
    try {
      state.ae(cause);
    } catch ($p) {
      if ($p instanceof Error) {
        var ex = $p;
        $this.oa(CompletionHandlerException.rd('Exception in completion handler ' + state.toString() + ' for ' + $this.toString(), ex));
      } else {
        throw $p;
      }
    }
  } else {
    var tmp2_safe_receiver = state.ce();
    if (tmp2_safe_receiver == null)
      null;
    else {
      notifyCompletion($this, tmp2_safe_receiver, cause);
    }
  }
}
function notifyCancelling($this, list, cause) {
  $this.nb(cause);
  list.le(4);
  // Inline function 'kotlinx.coroutines.JobSupport.notifyHandlers' call
  var exception = null;
  // Inline function 'kotlinx.coroutines.internal.LockFreeLinkedListHead.forEach' call
  var cur = list.he_1;
  while (!equals(cur, list)) {
    var node = cur;
    var tmp;
    if (node instanceof JobNode) {
      tmp = node.zd();
    } else {
      tmp = false;
    }
    if (tmp) {
      try {
        node.ae(cause);
      } catch ($p) {
        if ($p instanceof Error) {
          var ex = $p;
          var tmp0_safe_receiver = exception;
          var tmp_0;
          if (tmp0_safe_receiver == null) {
            tmp_0 = null;
          } else {
            // Inline function 'kotlin.apply' call
            addSuppressed(tmp0_safe_receiver, ex);
            tmp_0 = tmp0_safe_receiver;
          }
          if (tmp_0 == null) {
            // Inline function 'kotlin.run' call
            exception = CompletionHandlerException.rd('Exception in completion handler ' + node.toString() + ' for ' + $this.toString(), ex);
          }
        } else {
          throw $p;
        }
      }
    }
    cur = cur.he_1;
  }
  var tmp0_safe_receiver_0 = exception;
  if (tmp0_safe_receiver_0 == null)
    null;
  else {
    // Inline function 'kotlin.let' call
    $this.oa(tmp0_safe_receiver_0);
  }
  cancelParent($this, cause);
}
function cancelParent($this, cause) {
  if ($this.ob())
    return true;
  var isCancellation = cause instanceof CancellationException;
  var parent = $this.va();
  if (parent === null || parent === NonDisposableHandle_instance) {
    return isCancellation;
  }
  return parent.jb(cause) || isCancellation;
}
function notifyCompletion($this, $receiver, cause) {
  $receiver.le(1);
  // Inline function 'kotlinx.coroutines.JobSupport.notifyHandlers' call
  var exception = null;
  // Inline function 'kotlinx.coroutines.internal.LockFreeLinkedListHead.forEach' call
  var cur = $receiver.he_1;
  while (!equals(cur, $receiver)) {
    var node = cur;
    var tmp;
    if (node instanceof JobNode) {
      tmp = true;
    } else {
      tmp = false;
    }
    if (tmp) {
      try {
        node.ae(cause);
      } catch ($p) {
        if ($p instanceof Error) {
          var ex = $p;
          var tmp0_safe_receiver = exception;
          var tmp_0;
          if (tmp0_safe_receiver == null) {
            tmp_0 = null;
          } else {
            // Inline function 'kotlin.apply' call
            addSuppressed(tmp0_safe_receiver, ex);
            tmp_0 = tmp0_safe_receiver;
          }
          if (tmp_0 == null) {
            // Inline function 'kotlin.run' call
            exception = CompletionHandlerException.rd('Exception in completion handler ' + node.toString() + ' for ' + $this.toString(), ex);
          }
        } else {
          throw $p;
        }
      }
    }
    cur = cur.he_1;
  }
  var tmp0_safe_receiver_0 = exception;
  if (tmp0_safe_receiver_0 == null)
    null;
  else {
    // Inline function 'kotlin.let' call
    $this.oa(tmp0_safe_receiver_0);
  }
}
function startInternal($this, state) {
  if (state instanceof Empty) {
    if (state.be_1)
      return 0;
    if (!$this.w9_1.atomicfu$compareAndSet(state, get_EMPTY_ACTIVE()))
      return -1;
    $this.za();
    return 1;
  } else {
    if (state instanceof InactiveNodeList) {
      if (!$this.w9_1.atomicfu$compareAndSet(state, state.cf_1))
        return -1;
      $this.za();
      return 1;
    } else {
      return 0;
    }
  }
}
function promoteEmptyToNodeList($this, state) {
  var list = new NodeList();
  var update = state.be_1 ? list : new InactiveNodeList(list);
  $this.w9_1.atomicfu$compareAndSet(state, update);
}
function promoteSingleToNodeList($this, state) {
  state.oe(new NodeList());
  // Inline function 'kotlinx.coroutines.internal.LockFreeLinkedListNode.nextNode' call
  var list = state.he_1;
  $this.w9_1.atomicfu$compareAndSet(state, list);
}
function cancelMakeCompleting($this, cause) {
  // Inline function 'kotlinx.coroutines.JobSupport.loopOnState' call
  while (true) {
    var state = $this.wa();
    var tmp;
    if (!(!(state == null) ? isInterface(state, Incomplete) : false)) {
      tmp = true;
    } else {
      var tmp_0;
      if (state instanceof Finishing) {
        tmp_0 = state.df();
      } else {
        tmp_0 = false;
      }
      tmp = tmp_0;
    }
    if (tmp) {
      return get_COMPLETING_ALREADY();
    }
    var proposedUpdate = new CompletedExceptionally(createCauseException($this, cause));
    var finalState = tryMakeCompleting($this, state, proposedUpdate);
    if (!(finalState === get_COMPLETING_RETRY()))
      return finalState;
  }
}
function createCauseException($this, cause) {
  var tmp;
  if (cause == null ? true : cause instanceof Error) {
    var tmp_0;
    if (cause == null) {
      // Inline function 'kotlinx.coroutines.JobSupport.defaultCancellationException' call
      tmp_0 = JobCancellationException.bf(null == null ? $this.ga() : null, null, $this);
    } else {
      tmp_0 = cause;
    }
    tmp = tmp_0;
  } else {
    tmp = ((!(cause == null) ? isInterface(cause, ParentJob) : false) ? cause : THROW_CCE()).lb();
  }
  return tmp;
}
function makeCancelling($this, cause) {
  var causeExceptionCache = null;
  // Inline function 'kotlinx.coroutines.JobSupport.loopOnState' call
  while (true) {
    var tmp0 = $this.wa();
    $l$block: {
      if (tmp0 instanceof Finishing) {
        // Inline function 'kotlinx.coroutines.internal.synchronized' call
        // Inline function 'kotlinx.coroutines.internal.synchronizedImpl' call
        if (tmp0.ef())
          return get_TOO_LATE_TO_CANCEL();
        var wasCancelling = tmp0.te();
        if (!(cause == null) || !wasCancelling) {
          var tmp0_elvis_lhs = causeExceptionCache;
          var tmp;
          if (tmp0_elvis_lhs == null) {
            // Inline function 'kotlin.also' call
            var this_0 = createCauseException($this, cause);
            causeExceptionCache = this_0;
            tmp = this_0;
          } else {
            tmp = tmp0_elvis_lhs;
          }
          var causeException = tmp;
          tmp0.ff(causeException);
        }
        // Inline function 'kotlin.takeIf' call
        var this_1 = tmp0.gf();
        var tmp_0;
        if (!wasCancelling) {
          tmp_0 = this_1;
        } else {
          tmp_0 = null;
        }
        var notifyRootCause = tmp_0;
        if (notifyRootCause == null)
          null;
        else {
          // Inline function 'kotlin.let' call
          notifyCancelling($this, tmp0.pe_1, notifyRootCause);
        }
        return get_COMPLETING_ALREADY();
      } else {
        if (!(tmp0 == null) ? isInterface(tmp0, Incomplete) : false) {
          var tmp2_elvis_lhs = causeExceptionCache;
          var tmp_1;
          if (tmp2_elvis_lhs == null) {
            // Inline function 'kotlin.also' call
            var this_2 = createCauseException($this, cause);
            causeExceptionCache = this_2;
            tmp_1 = this_2;
          } else {
            tmp_1 = tmp2_elvis_lhs;
          }
          var causeException_0 = tmp_1;
          if (tmp0.da()) {
            if (tryMakeCancelling($this, tmp0, causeException_0))
              return get_COMPLETING_ALREADY();
          } else {
            var finalState = tryMakeCompleting($this, tmp0, new CompletedExceptionally(causeException_0));
            if (finalState === get_COMPLETING_ALREADY()) {
              // Inline function 'kotlin.error' call
              var message = 'Cannot happen in ' + toString_1(tmp0);
              throw IllegalStateException.q1(toString_1(message));
            } else if (finalState === get_COMPLETING_RETRY()) {
              break $l$block;
            } else
              return finalState;
          }
        } else {
          return get_TOO_LATE_TO_CANCEL();
        }
      }
    }
  }
}
function getOrPromoteCancellingList($this, state) {
  var tmp0_elvis_lhs = state.ce();
  var tmp;
  if (tmp0_elvis_lhs == null) {
    var tmp_0;
    if (state instanceof Empty) {
      tmp_0 = new NodeList();
    } else {
      if (state instanceof JobNode) {
        promoteSingleToNodeList($this, state);
        tmp_0 = null;
      } else {
        // Inline function 'kotlin.error' call
        var message = 'State should have list: ' + toString_1(state);
        throw IllegalStateException.q1(toString_1(message));
      }
    }
    tmp = tmp_0;
  } else {
    tmp = tmp0_elvis_lhs;
  }
  return tmp;
}
function tryMakeCancelling($this, state, rootCause) {
  // Inline function 'kotlinx.coroutines.assert' call
  // Inline function 'kotlinx.coroutines.assert' call
  var tmp0_elvis_lhs = getOrPromoteCancellingList($this, state);
  var tmp;
  if (tmp0_elvis_lhs == null) {
    return false;
  } else {
    tmp = tmp0_elvis_lhs;
  }
  var list = tmp;
  var cancelling = new Finishing(list, false, rootCause);
  if (!$this.w9_1.atomicfu$compareAndSet(state, cancelling))
    return false;
  notifyCancelling($this, list, rootCause);
  return true;
}
function tryMakeCompleting($this, state, proposedUpdate) {
  if (!(!(state == null) ? isInterface(state, Incomplete) : false))
    return get_COMPLETING_ALREADY();
  var tmp;
  var tmp_0;
  var tmp_1;
  if (state instanceof Empty) {
    tmp_1 = true;
  } else {
    tmp_1 = state instanceof JobNode;
  }
  if (tmp_1) {
    tmp_0 = !(state instanceof ChildHandleNode);
  } else {
    tmp_0 = false;
  }
  if (tmp_0) {
    tmp = !(proposedUpdate instanceof CompletedExceptionally);
  } else {
    tmp = false;
  }
  if (tmp) {
    if (tryFinalizeSimpleState($this, state, proposedUpdate)) {
      return proposedUpdate;
    }
    return get_COMPLETING_RETRY();
  }
  return tryMakeCompletingSlowPath($this, state, proposedUpdate);
}
function tryMakeCompletingSlowPath($this, state, proposedUpdate) {
  var tmp0_elvis_lhs = getOrPromoteCancellingList($this, state);
  var tmp;
  if (tmp0_elvis_lhs == null) {
    return get_COMPLETING_RETRY();
  } else {
    tmp = tmp0_elvis_lhs;
  }
  var list = tmp;
  var tmp1_elvis_lhs = state instanceof Finishing ? state : null;
  var finishing = tmp1_elvis_lhs == null ? new Finishing(list, false, null) : tmp1_elvis_lhs;
  var notifyRootCause;
  // Inline function 'kotlinx.coroutines.internal.synchronized' call
  // Inline function 'kotlinx.coroutines.internal.synchronizedImpl' call
  if (finishing.df())
    return get_COMPLETING_ALREADY();
  finishing.hf(true);
  if (!(finishing === state)) {
    if (!$this.w9_1.atomicfu$compareAndSet(state, finishing))
      return get_COMPLETING_RETRY();
  }
  // Inline function 'kotlinx.coroutines.assert' call
  var wasCancelling = finishing.te();
  var tmp0_safe_receiver = proposedUpdate instanceof CompletedExceptionally ? proposedUpdate : null;
  if (tmp0_safe_receiver == null)
    null;
  else {
    // Inline function 'kotlin.let' call
    finishing.ff(tmp0_safe_receiver.ia_1);
  }
  // Inline function 'kotlin.takeIf' call
  var this_0 = finishing.gf();
  var tmp_0;
  if (!wasCancelling) {
    tmp_0 = this_0;
  } else {
    tmp_0 = null;
  }
  notifyRootCause = tmp_0;
  if (notifyRootCause == null)
    null;
  else {
    // Inline function 'kotlin.let' call
    notifyCancelling($this, list, notifyRootCause);
  }
  var child = nextChild($this, list);
  if (!(child == null) && tryWaitForChild($this, finishing, child, proposedUpdate))
    return get_COMPLETING_WAITING_CHILDREN();
  list.le(2);
  var anotherChild = nextChild($this, list);
  if (!(anotherChild == null) && tryWaitForChild($this, finishing, anotherChild, proposedUpdate))
    return get_COMPLETING_WAITING_CHILDREN();
  return finalizeFinishingState($this, finishing, proposedUpdate);
}
function _get_exceptionOrNull__b3j7js($this, $receiver) {
  var tmp0_safe_receiver = $receiver instanceof CompletedExceptionally ? $receiver : null;
  return tmp0_safe_receiver == null ? null : tmp0_safe_receiver.ia_1;
}
function tryWaitForChild($this, state, child, proposedUpdate) {
  var $this_0 = $this;
  var state_0 = state;
  var child_0 = child;
  var proposedUpdate_0 = proposedUpdate;
  $l$1: do {
    $l$0: do {
      var handle = invokeOnCompletion(child_0.mf_1, false, new ChildCompletion($this_0, state_0, child_0, proposedUpdate_0));
      if (!(handle === NonDisposableHandle_instance))
        return true;
      var tmp0_elvis_lhs = nextChild($this_0, child_0);
      var tmp;
      if (tmp0_elvis_lhs == null) {
        return false;
      } else {
        tmp = tmp0_elvis_lhs;
      }
      var nextChild_0 = tmp;
      var tmp0 = $this_0;
      var tmp1 = state_0;
      var tmp3 = proposedUpdate_0;
      $this_0 = tmp0;
      state_0 = tmp1;
      child_0 = nextChild_0;
      proposedUpdate_0 = tmp3;
      continue $l$0;
    }
     while (false);
  }
   while (true);
}
function continueCompleting($this, state, lastChild, proposedUpdate) {
  // Inline function 'kotlinx.coroutines.assert' call
  var waitChild = nextChild($this, lastChild);
  if (!(waitChild == null) && tryWaitForChild($this, state, waitChild, proposedUpdate))
    return Unit_instance;
  state.pe_1.le(2);
  var waitChildAgain = nextChild($this, lastChild);
  if (!(waitChildAgain == null) && tryWaitForChild($this, state, waitChildAgain, proposedUpdate)) {
    return Unit_instance;
  }
  var finalState = finalizeFinishingState($this, state, proposedUpdate);
  $this.na(finalState);
}
function nextChild($this, $receiver) {
  var cur = $receiver;
  $l$loop: while (true) {
    // Inline function 'kotlinx.coroutines.internal.LockFreeLinkedListNode.isRemoved' call
    if (!cur.je_1) {
      break $l$loop;
    }
    // Inline function 'kotlinx.coroutines.internal.LockFreeLinkedListNode.prevNode' call
    cur = cur.ie_1;
  }
  $l$loop_0: while (true) {
    // Inline function 'kotlinx.coroutines.internal.LockFreeLinkedListNode.nextNode' call
    cur = cur.he_1;
    // Inline function 'kotlinx.coroutines.internal.LockFreeLinkedListNode.isRemoved' call
    if (cur.je_1)
      continue $l$loop_0;
    if (cur instanceof ChildHandleNode)
      return cur;
    if (cur instanceof NodeList)
      return null;
  }
}
function stateString($this, state) {
  var tmp;
  if (state instanceof Finishing) {
    tmp = state.te() ? 'Cancelling' : state.df() ? 'Completing' : 'Active';
  } else {
    if (!(state == null) ? isInterface(state, Incomplete) : false) {
      tmp = state.da() ? 'Active' : 'New';
    } else {
      if (state instanceof CompletedExceptionally) {
        tmp = 'Cancelled';
      } else {
        tmp = 'Completed';
      }
    }
  }
  return tmp;
}
function boxIncomplete(_this__u8e3s4) {
  _init_properties_JobSupport_kt__68f172();
  var tmp;
  if (!(_this__u8e3s4 == null) ? isInterface(_this__u8e3s4, Incomplete) : false) {
    tmp = new IncompleteStateBox(_this__u8e3s4);
  } else {
    tmp = _this__u8e3s4;
  }
  return tmp;
}
function unboxState(_this__u8e3s4) {
  _init_properties_JobSupport_kt__68f172();
  var tmp0_safe_receiver = _this__u8e3s4 instanceof IncompleteStateBox ? _this__u8e3s4 : null;
  var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : tmp0_safe_receiver.hg_1;
  return tmp1_elvis_lhs == null ? _this__u8e3s4 : tmp1_elvis_lhs;
}
var properties_initialized_JobSupport_kt_5iq8a4;
function _init_properties_JobSupport_kt__68f172() {
  if (!properties_initialized_JobSupport_kt_5iq8a4) {
    properties_initialized_JobSupport_kt_5iq8a4 = true;
    COMPLETING_ALREADY = new Symbol_0('COMPLETING_ALREADY');
    COMPLETING_WAITING_CHILDREN = new Symbol_0('COMPLETING_WAITING_CHILDREN');
    COMPLETING_RETRY = new Symbol_0('COMPLETING_RETRY');
    TOO_LATE_TO_CANCEL = new Symbol_0('TOO_LATE_TO_CANCEL');
    SEALED = new Symbol_0('SEALED');
    EMPTY_NEW = new Empty(false);
    EMPTY_ACTIVE = new Empty(true);
  }
}
var Unconfined_instance;
function Unconfined_getInstance() {
  if (Unconfined_instance === VOID)
    new Unconfined();
  return Unconfined_instance;
}
var Key_instance_3;
function Key_getInstance_3() {
  return Key_instance_3;
}
function handleUncaughtCoroutineException(context, exception) {
  var _iterator__ex2g4s = get_platformExceptionHandlers().v();
  while (_iterator__ex2g4s.w()) {
    var handler = _iterator__ex2g4s.x();
    try {
      handler.vc(context, exception);
    } catch ($p) {
      if ($p instanceof ExceptionSuccessfullyProcessed) {
        var _unused_var__etf5q3 = $p;
        return Unit_instance;
      } else {
        if ($p instanceof Error) {
          var t = $p;
          propagateExceptionFinalResort(handlerException(exception, t));
        } else {
          throw $p;
        }
      }
    }
  }
  try {
    addSuppressed(exception, DiagnosticCoroutineContextException.wg(context));
  } catch ($p) {
    if ($p instanceof Error) {
      var e = $p;
    } else {
      throw $p;
    }
  }
  propagateExceptionFinalResort(exception);
}
function get_UNDEFINED() {
  _init_properties_DispatchedContinuation_kt__tnmqc0();
  return UNDEFINED;
}
var UNDEFINED;
function get_REUSABLE_CLAIMED() {
  _init_properties_DispatchedContinuation_kt__tnmqc0();
  return REUSABLE_CLAIMED;
}
var REUSABLE_CLAIMED;
function _get_reusableCancellableContinuation__9qex09($this) {
  var tmp = $this.qc_1.kotlinx$atomicfu$value;
  return tmp instanceof CancellableContinuationImpl ? tmp : null;
}
function safeDispatch(_this__u8e3s4, context, runnable) {
  _init_properties_DispatchedContinuation_kt__tnmqc0();
  try {
    _this__u8e3s4.kc(context, runnable);
  } catch ($p) {
    if ($p instanceof Error) {
      var e = $p;
      throw DispatchException.eh(e, _this__u8e3s4, context);
    } else {
      throw $p;
    }
  }
}
function safeIsDispatchNeeded(_this__u8e3s4, context) {
  _init_properties_DispatchedContinuation_kt__tnmqc0();
  try {
    return _this__u8e3s4.jc(context);
  } catch ($p) {
    if ($p instanceof Error) {
      var e = $p;
      throw DispatchException.eh(e, _this__u8e3s4, context);
    } else {
      throw $p;
    }
  }
}
function resumeCancellableWith(_this__u8e3s4, result) {
  _init_properties_DispatchedContinuation_kt__tnmqc0();
  var tmp;
  if (_this__u8e3s4 instanceof DispatchedContinuation) {
    // Inline function 'kotlinx.coroutines.internal.DispatchedContinuation.resumeCancellableWith' call
    var state = toState(result);
    if (safeIsDispatchNeeded(_this__u8e3s4.mc_1, _this__u8e3s4.f6())) {
      _this__u8e3s4.oc_1 = state;
      _this__u8e3s4.bd_1 = 1;
      safeDispatch(_this__u8e3s4.mc_1, _this__u8e3s4.f6(), _this__u8e3s4);
    } else {
      $l$block: {
        // Inline function 'kotlinx.coroutines.internal.executeUnconfined' call
        // Inline function 'kotlinx.coroutines.assert' call
        var eventLoop = ThreadLocalEventLoop_getInstance().kd();
        if (false && eventLoop.fd()) {
          break $l$block;
        }
        var tmp_0;
        if (eventLoop.ed()) {
          _this__u8e3s4.oc_1 = state;
          _this__u8e3s4.bd_1 = 1;
          eventLoop.dd(_this__u8e3s4);
          tmp_0 = true;
        } else {
          // Inline function 'kotlinx.coroutines.runUnconfinedEventLoop' call
          eventLoop.gd(true);
          try {
            var tmp$ret$5;
            $l$block_0: {
              // Inline function 'kotlinx.coroutines.internal.DispatchedContinuation.resumeCancelled' call
              var job = _this__u8e3s4.f6().r6(Key_instance_2);
              if (!(job == null) && !job.da()) {
                var cause = job.ab();
                _this__u8e3s4.bh(state, cause);
                // Inline function 'kotlin.coroutines.resumeWithException' call
                // Inline function 'kotlin.Companion.failure' call
                var tmp$ret$7 = _Result___init__impl__xyqfz8(createFailure(cause));
                _this__u8e3s4.h6(tmp$ret$7);
                tmp$ret$5 = true;
                break $l$block_0;
              }
              tmp$ret$5 = false;
            }
            if (!tmp$ret$5) {
              // Inline function 'kotlinx.coroutines.internal.DispatchedContinuation.resumeUndispatchedWith' call
              _this__u8e3s4.nc_1;
              // Inline function 'kotlinx.coroutines.withContinuationContext' call
              _this__u8e3s4.pc_1;
              _this__u8e3s4.nc_1.h6(result);
            }
            $l$loop: while (eventLoop.ad()) {
            }
          } catch ($p) {
            if ($p instanceof Error) {
              var e = $p;
              _this__u8e3s4.ah(e);
            } else {
              throw $p;
            }
          }
          finally {
            eventLoop.hd(true);
          }
          tmp_0 = false;
        }
      }
    }
    tmp = Unit_instance;
  } else {
    _this__u8e3s4.h6(result);
    tmp = Unit_instance;
  }
  return tmp;
}
var properties_initialized_DispatchedContinuation_kt_2siadq;
function _init_properties_DispatchedContinuation_kt__tnmqc0() {
  if (!properties_initialized_DispatchedContinuation_kt_2siadq) {
    properties_initialized_DispatchedContinuation_kt_2siadq = true;
    UNDEFINED = new Symbol_0('UNDEFINED');
    REUSABLE_CLAIMED = new Symbol_0('REUSABLE_CLAIMED');
  }
}
function get_isCancellableMode(_this__u8e3s4) {
  return _this__u8e3s4 === 1 || _this__u8e3s4 === 2;
}
function startCoroutineCancellable(_this__u8e3s4, receiver, completion) {
  // Inline function 'kotlinx.coroutines.intrinsics.runSafely' call
  try {
    var tmp = intercepted(createCoroutineUninterceptedGeneratorVersion(_this__u8e3s4, receiver, completion));
    // Inline function 'kotlin.Companion.success' call
    var tmp$ret$2 = _Result___init__impl__xyqfz8(Unit_instance);
    resumeCancellableWith(tmp, tmp$ret$2);
  } catch ($p) {
    if ($p instanceof Error) {
      var e = $p;
      dispatcherFailure(completion, e);
    } else {
      throw $p;
    }
  }
  return Unit_instance;
}
function startCoroutineCancellable_0(_this__u8e3s4, fatalCompletion) {
  // Inline function 'kotlinx.coroutines.intrinsics.runSafely' call
  try {
    var tmp = intercepted(_this__u8e3s4);
    // Inline function 'kotlin.Companion.success' call
    var tmp$ret$2 = _Result___init__impl__xyqfz8(Unit_instance);
    resumeCancellableWith(tmp, tmp$ret$2);
  } catch ($p) {
    if ($p instanceof Error) {
      var e = $p;
      dispatcherFailure(fatalCompletion, e);
    } else {
      throw $p;
    }
  }
  return Unit_instance;
}
function dispatcherFailure(completion, e) {
  var tmp;
  if (e instanceof DispatchException) {
    tmp = e.tc_1;
  } else {
    tmp = e;
  }
  var reportException = tmp;
  // Inline function 'kotlin.Companion.failure' call
  var tmp$ret$0 = _Result___init__impl__xyqfz8(createFailure(reportException));
  completion.h6(tmp$ret$0);
  throw reportException;
}
function startCoroutineUndispatched(_this__u8e3s4, receiver, completion) {
  // Inline function 'kotlinx.coroutines.internal.probeCoroutineCreated' call
  var actualCompletion = completion;
  var tmp;
  try {
    // Inline function 'kotlinx.coroutines.withCoroutineContext' call
    actualCompletion.f6();
    // Inline function 'kotlinx.coroutines.internal.probeCoroutineResumed' call
    // Inline function 'kotlin.coroutines.intrinsics.startCoroutineUninterceptedOrReturn' call
    tmp = startCoroutineUninterceptedOrReturnGeneratorVersion(_this__u8e3s4, receiver, actualCompletion);
  } catch ($p) {
    var tmp_0;
    if ($p instanceof Error) {
      var e = $p;
      var tmp_1;
      if (e instanceof DispatchException) {
        tmp_1 = e.tc_1;
      } else {
        tmp_1 = e;
      }
      var reportException = tmp_1;
      // Inline function 'kotlin.coroutines.resumeWithException' call
      // Inline function 'kotlin.Companion.failure' call
      var tmp$ret$6 = _Result___init__impl__xyqfz8(createFailure(reportException));
      actualCompletion.h6(tmp$ret$6);
      return Unit_instance;
    } else {
      throw $p;
    }
  }
  var value = tmp;
  if (!(value === get_COROUTINE_SUSPENDED())) {
    // Inline function 'kotlin.coroutines.resume' call
    // Inline function 'kotlin.Companion.success' call
    var tmp$ret$8 = _Result___init__impl__xyqfz8(value);
    actualCompletion.h6(tmp$ret$8);
  }
}
function createDefaultDispatcher() {
  var tmp;
  if (isJsdom()) {
    tmp = NodeDispatcher_getInstance();
  } else {
    var tmp_0;
    var tmp_1;
    if (!(typeof window === 'undefined')) {
      // Inline function 'kotlin.js.asDynamic' call
      tmp_1 = window != null;
    } else {
      tmp_1 = false;
    }
    if (tmp_1) {
      // Inline function 'kotlin.js.asDynamic' call
      tmp_0 = !(typeof window.addEventListener === 'undefined');
    } else {
      tmp_0 = false;
    }
    if (tmp_0) {
      tmp = asCoroutineDispatcher(window);
    } else {
      if (typeof process === 'undefined' || typeof process.nextTick === 'undefined') {
        tmp = SetTimeoutDispatcher_getInstance();
      } else {
        tmp = NodeDispatcher_getInstance();
      }
    }
  }
  return tmp;
}
function isJsdom() {
  return !(typeof navigator === 'undefined') && navigator != null && navigator.userAgent != null && !(typeof navigator.userAgent === 'undefined') && !(typeof navigator.userAgent.match === 'undefined') && navigator.userAgent.match('\\bjsdom\\b');
}
var counter;
function get_DEBUG() {
  return DEBUG;
}
var DEBUG;
function get_classSimpleName(_this__u8e3s4) {
  var tmp0_elvis_lhs = getKClassFromExpression(_this__u8e3s4).p7();
  return tmp0_elvis_lhs == null ? 'Unknown' : tmp0_elvis_lhs;
}
function get_hexAddress(_this__u8e3s4) {
  // Inline function 'kotlin.js.asDynamic' call
  var result = _this__u8e3s4.__debug_counter;
  if (!(typeof result === 'number')) {
    counter = counter + 1 | 0;
    result = counter;
    // Inline function 'kotlin.js.asDynamic' call
    _this__u8e3s4.__debug_counter = result;
  }
  return ((!(result == null) ? typeof result === 'number' : false) ? result : THROW_CCE()).toString();
}
var NodeDispatcher_instance;
function NodeDispatcher_getInstance() {
  if (NodeDispatcher_instance === VOID)
    new NodeDispatcher();
  return NodeDispatcher_instance;
}
function ScheduledMessageQueue$processQueue$lambda(this$0) {
  return () => {
    this$0.th();
    return Unit_instance;
  };
}
function WindowMessageQueue$lambda(this$0) {
  return (event) => {
    var tmp;
    if (event.source == this$0.ci_1 && event.data == this$0.di_1) {
      event.stopPropagation();
      this$0.th();
      tmp = Unit_instance;
    }
    return Unit_instance;
  };
}
function WindowMessageQueue$schedule$lambda(this$0) {
  return (it) => {
    this$0.th();
    return Unit_instance;
  };
}
function asCoroutineDispatcher(_this__u8e3s4) {
  // Inline function 'kotlin.js.asDynamic' call
  var tmp0_elvis_lhs = _this__u8e3s4.coroutineDispatcher;
  var tmp;
  if (tmp0_elvis_lhs == null) {
    // Inline function 'kotlin.also' call
    var this_0 = new WindowDispatcher(_this__u8e3s4);
    // Inline function 'kotlin.js.asDynamic' call
    _this__u8e3s4.coroutineDispatcher = this_0;
    tmp = this_0;
  } else {
    tmp = tmp0_elvis_lhs;
  }
  return tmp;
}
function propagateExceptionFinalResort(exception) {
  console.error(exception.toString());
}
function createEventLoop() {
  return new UnconfinedEventLoop();
}
function unsupported() {
  throw UnsupportedOperationException.z6('runBlocking event loop is not supported');
}
var SetTimeoutDispatcher_instance;
function SetTimeoutDispatcher_getInstance() {
  if (SetTimeoutDispatcher_instance === VOID)
    new SetTimeoutDispatcher();
  return SetTimeoutDispatcher_instance;
}
function toDebugString(_this__u8e3s4) {
  return toString_1(_this__u8e3s4);
}
function newCoroutineContext(_this__u8e3s4, context) {
  var combined = _this__u8e3s4.ca().l9(context);
  return !(combined === Dispatchers_getInstance().lg_1) && combined.r6(Key_instance) == null ? combined.l9(Dispatchers_getInstance().lg_1) : combined;
}
function get_coroutineName(_this__u8e3s4) {
  return null;
}
var Dispatchers_instance;
function Dispatchers_getInstance() {
  if (Dispatchers_instance === VOID)
    new Dispatchers();
  return Dispatchers_instance;
}
function identitySet(expectedSize) {
  return HashSet.i4(expectedSize);
}
function get_platformExceptionHandlers_() {
  _init_properties_CoroutineExceptionHandlerImpl_kt__37d7wf();
  return platformExceptionHandlers_;
}
var platformExceptionHandlers_;
function get_platformExceptionHandlers() {
  _init_properties_CoroutineExceptionHandlerImpl_kt__37d7wf();
  return get_platformExceptionHandlers_();
}
var properties_initialized_CoroutineExceptionHandlerImpl_kt_qhrgvx;
function _init_properties_CoroutineExceptionHandlerImpl_kt__37d7wf() {
  if (!properties_initialized_CoroutineExceptionHandlerImpl_kt_qhrgvx) {
    properties_initialized_CoroutineExceptionHandlerImpl_kt_qhrgvx = true;
    // Inline function 'kotlin.collections.mutableSetOf' call
    platformExceptionHandlers_ = LinkedHashSet.e6();
  }
}
function unwrap(exception) {
  return exception;
}
function recoverStackTrace(exception, continuation) {
  return exception;
}
function threadContextElements(context) {
  return 0;
}
function commonThreadLocal(name) {
  return new CommonThreadLocal();
}
function toJsErrorLike(_this__u8e3s4) {
  return unwrapRawError(_this__u8e3s4);
}
function promise(_this__u8e3s4, context, start, block) {
  context = context === VOID ? EmptyCoroutineContext_getInstance() : context;
  start = start === VOID ? CoroutineStart_DEFAULT_getInstance() : start;
  return asPromise(async(_this__u8e3s4, context, start, block));
}
function asPromise(_this__u8e3s4) {
  var promise = new Promise(asPromise$lambda(_this__u8e3s4));
  set_deferred(promise, _this__u8e3s4);
  return promise;
}
function asPromise$lambda$lambda($this_asPromise, $reject, $resolve) {
  return (it) => {
    var exception = $this_asPromise.sb();
    var tmp;
    if (!(exception == null)) {
      $reject(toJsErrorLike(exception));
      tmp = Unit_instance;
    } else {
      $resolve($this_asPromise.yb());
      tmp = Unit_instance;
    }
    return Unit_instance;
  };
}
function asPromise$lambda($this_asPromise) {
  return (resolve, reject) => {
    $this_asPromise.db(asPromise$lambda$lambda($this_asPromise, reject, resolve));
    return Unit_instance;
  };
}
function get_RAW_ERROR_WRAPPER_TYPE() {
  _init_properties_wrapRawError_kt__75j3je();
  return RAW_ERROR_WRAPPER_TYPE;
}
var RAW_ERROR_WRAPPER_TYPE;
function unwrapRawError(value) {
  _init_properties_wrapRawError_kt__75j3je();
  var tmp;
  var tmp_0;
  if (value instanceof Error) {
    // Inline function 'js.errors.name' call
    // Inline function 'js.reflect.unsafeCast' call
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    var tmp$ret$0 = value.name;
    tmp_0 = equals(tmp$ret$0, get_RAW_ERROR_WRAPPER_TYPE());
  } else {
    tmp_0 = false;
  }
  if (tmp_0) {
    tmp = Reflect.get(value, 'cause');
  } else {
    tmp = value;
  }
  var result = tmp;
  // Inline function 'js.reflect.unsafeCast' call
  // Inline function 'kotlin.js.unsafeCast' call
  // Inline function 'kotlin.js.asDynamic' call
  return result;
}
var properties_initialized_wrapRawError_kt_t1ryt0;
function _init_properties_wrapRawError_kt__75j3je() {
  if (!properties_initialized_wrapRawError_kt_t1ryt0) {
    properties_initialized_wrapRawError_kt_t1ryt0 = true;
    // Inline function 'js.errors.JsErrorName' call
    // Inline function 'js.reflect.unsafeCast' call
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    RAW_ERROR_WRAPPER_TYPE = 'KotlinRawErrorWrapper';
  }
}
function get_DEFERRED() {
  _init_properties_Promise_deferred_kt__g1kxou();
  return DEFERRED;
}
var DEFERRED;
function set_deferred(_this__u8e3s4, value) {
  _init_properties_Promise_deferred_kt__g1kxou();
  kotlinSet(_this__u8e3s4, get_DEFERRED(), value);
}
var properties_initialized_Promise_deferred_kt_rg4w18;
function _init_properties_Promise_deferred_kt__g1kxou() {
  if (!properties_initialized_Promise_deferred_kt_rg4w18) {
    properties_initialized_Promise_deferred_kt_rg4w18 = true;
    DEFERRED = Symbol('@@deferred');
  }
}
function kotlinSet(target, propertyKey, value) {
  var tmp = Reflect;
  var tmp_0;
  if (value == null) {
    tmp_0 = null;
  } else {
    // Inline function 'kotlin.js.toJsReference' call
    // Inline function 'kotlin.js.unsafeCast' call
    // Inline function 'kotlin.js.asDynamic' call
    tmp_0 = value;
  }
  tmp.set(target, propertyKey, tmp_0);
}
function Worker$Companion$fetch$slambda_0($request) {
  var i = new Worker$Companion$fetch$slambda($request);
  var l = ($this$promise, $completion) => i.wi($this$promise, $completion);
  l.$arity = 1;
  return l;
}
var Companion_instance_7;
function Companion_getInstance_7() {
  return Companion_instance_7;
}
function fetch(request, env, ctx) {
  return Companion_instance_7.xi(request, env, ctx);
}
//region block: post-declaration
initMetadataForInterface(CharSequence, 'CharSequence');
initMetadataForClass(Number_0, 'Number');
initMetadataForClass(Exception, 'Exception', Exception.c7);
initMetadataForClass(RuntimeException, 'RuntimeException', RuntimeException.y6);
initMetadataForClass(IllegalStateException, 'IllegalStateException', IllegalStateException.j);
initMetadataForClass(CancellationException, 'CancellationException', CancellationException.f);
initMetadataForClass(Char, 'Char');
initMetadataForInterface(Collection, 'Collection');
initMetadataForInterface(KtList, 'List', VOID, VOID, [Collection]);
initMetadataForInterface(KtSet, 'Set', VOID, VOID, [Collection]);
initMetadataForInterface(Entry, 'Entry');
initMetadataForInterface(KtMap, 'Map');
initMetadataForCompanion(Companion);
initMetadataForClass(Enum, 'Enum');
initMetadataForCompanion(Companion_0);
initMetadataForClass(Long, 'Long');
initMetadataForObject(Unit, 'Unit');
initMetadataForClass(AbstractCollection, 'AbstractCollection', VOID, VOID, [Collection]);
initMetadataForClass(AbstractMutableCollection, 'AbstractMutableCollection', VOID, VOID, [Collection]);
initMetadataForClass(IteratorImpl, 'IteratorImpl');
initMetadataForClass(AbstractMutableList, 'AbstractMutableList', VOID, VOID, [KtList, Collection]);
initMetadataForClass(AbstractMutableSet, 'AbstractMutableSet', VOID, VOID, [KtSet, Collection]);
initMetadataForCompanion(Companion_1);
initMetadataForClass(ArrayList, 'ArrayList', ArrayList.m3, VOID, [KtList, Collection]);
initMetadataForClass(HashSet, 'HashSet', HashSet.u3, VOID, [KtSet, Collection]);
initMetadataForCompanion(Companion_2);
initMetadataForClass(Itr, 'Itr');
initMetadataForClass(KeysItr, 'KeysItr');
initMetadataForClass(EntriesItr, 'EntriesItr');
initMetadataForClass(EntryRef, 'EntryRef', VOID, VOID, [Entry]);
initMetadataForInterface(InternalMap, 'InternalMap');
protoOf(InternalHashMap).y4 = containsAllEntries;
initMetadataForClass(InternalHashMap, 'InternalHashMap', InternalHashMap.f4, VOID, [InternalMap]);
initMetadataForClass(LinkedHashSet, 'LinkedHashSet', LinkedHashSet.e6, VOID, [KtSet, Collection]);
initMetadataForObject(CompletedContinuation, 'CompletedContinuation');
initMetadataForClass(InterceptedCoroutine, 'InterceptedCoroutine');
initMetadataForClass(GeneratorCoroutineImpl, 'GeneratorCoroutineImpl');
initMetadataForClass(UnsupportedOperationException, 'UnsupportedOperationException', UnsupportedOperationException.r3);
initMetadataForClass(IllegalArgumentException, 'IllegalArgumentException', IllegalArgumentException.b7);
initMetadataForClass(NoSuchElementException, 'NoSuchElementException', NoSuchElementException.t2);
initMetadataForClass(IndexOutOfBoundsException, 'IndexOutOfBoundsException', IndexOutOfBoundsException.i7);
initMetadataForClass(Error_0, 'Error', Error_0.l7);
initMetadataForClass(ConcurrentModificationException, 'ConcurrentModificationException', ConcurrentModificationException.j5);
initMetadataForClass(UninitializedPropertyAccessException, 'UninitializedPropertyAccessException', UninitializedPropertyAccessException.o7);
initMetadataForClass(NoWhenBranchMatchedException, 'NoWhenBranchMatchedException', NoWhenBranchMatchedException.u1);
initMetadataForClass(NullPointerException, 'NullPointerException', NullPointerException.y1);
initMetadataForClass(ClassCastException, 'ClassCastException', ClassCastException.c2);
initMetadataForInterface(KClass, 'KClass');
initMetadataForClass(KClassImpl, 'KClassImpl', VOID, VOID, [KClass]);
initMetadataForClass(PrimitiveKClassImpl, 'PrimitiveKClassImpl');
initMetadataForObject(NothingKClassImpl, 'NothingKClassImpl');
initMetadataForClass(SimpleKClassImpl, 'SimpleKClassImpl');
initMetadataForObject(PrimitiveClasses, 'PrimitiveClasses');
initMetadataForClass(StringBuilder, 'StringBuilder', StringBuilder.t, VOID, [CharSequence]);
initMetadataForCompanion(Companion_3);
initMetadataForCompanion(Companion_4);
initMetadataForCompanion(Companion_5);
initMetadataForClass(ArrayDeque, 'ArrayDeque', ArrayDeque.y8);
initMetadataForObject(Key, 'Key');
initMetadataForInterface(CoroutineContext, 'CoroutineContext');
initMetadataForInterface(Element, 'Element', VOID, VOID, [CoroutineContext]);
initMetadataForInterface(ContinuationInterceptor, 'ContinuationInterceptor', VOID, VOID, [Element]);
initMetadataForObject(EmptyCoroutineContext, 'EmptyCoroutineContext', VOID, VOID, [CoroutineContext]);
protoOf(CombinedContext).l9 = plus;
initMetadataForClass(CombinedContext, 'CombinedContext', VOID, VOID, [CoroutineContext]);
initMetadataForClass(AbstractCoroutineContextKey, 'AbstractCoroutineContextKey');
protoOf(AbstractCoroutineContextElement).r6 = get;
protoOf(AbstractCoroutineContextElement).k9 = fold;
protoOf(AbstractCoroutineContextElement).j9 = minusKey;
protoOf(AbstractCoroutineContextElement).l9 = plus;
initMetadataForClass(AbstractCoroutineContextElement, 'AbstractCoroutineContextElement', VOID, VOID, [Element]);
initMetadataForClass(CoroutineSingletons, 'CoroutineSingletons');
initMetadataForCompanion(Companion_6);
initMetadataForClass(Failure, 'Failure');
initMetadataForClass(Result, 'Result');
initMetadataForClass(NotImplementedError, 'NotImplementedError', NotImplementedError.w6);
initMetadataForClass(atomicfu$TraceBase, 'TraceBase');
initMetadataForObject(None, 'None');
initMetadataForClass(AtomicRef, 'AtomicRef');
initMetadataForClass(AtomicBoolean, 'AtomicBoolean');
initMetadataForInterface(ParentJob, 'ParentJob', VOID, VOID, [Element], [0]);
protoOf(JobSupport).l9 = plus;
protoOf(JobSupport).r6 = get;
protoOf(JobSupport).k9 = fold;
protoOf(JobSupport).j9 = minusKey;
initMetadataForClass(JobSupport, 'JobSupport', VOID, VOID, [Element, ParentJob], [0]);
initMetadataForInterface(CoroutineScope, 'CoroutineScope');
initMetadataForClass(AbstractCoroutine, 'AbstractCoroutine', VOID, VOID, [Element, CoroutineScope], [0]);
initMetadataForClass(DeferredCoroutine, 'DeferredCoroutine', VOID, VOID, [Element], [0]);
initMetadataForClass(LazyDeferredCoroutine, 'LazyDeferredCoroutine', VOID, VOID, VOID, [0]);
initMetadataForInterface(Runnable, 'Runnable');
initMetadataForClass(SchedulerTask, 'SchedulerTask', VOID, VOID, [Runnable]);
initMetadataForClass(DispatchedTask, 'DispatchedTask');
initMetadataForClass(CancellableContinuationImpl, 'CancellableContinuationImpl');
initMetadataForClass(CompletedExceptionally, 'CompletedExceptionally');
initMetadataForObject(Key_0, 'Key');
protoOf(CoroutineDispatcher).r6 = get_0;
protoOf(CoroutineDispatcher).j9 = minusKey_0;
initMetadataForClass(CoroutineDispatcher, 'CoroutineDispatcher', VOID, VOID, [ContinuationInterceptor]);
initMetadataForObject(Key_1, 'Key');
initMetadataForObject(GlobalScope, 'GlobalScope', VOID, VOID, [CoroutineScope]);
initMetadataForClass(CoroutineStart, 'CoroutineStart');
initMetadataForClass(EventLoop, 'EventLoop');
initMetadataForObject(ThreadLocalEventLoop, 'ThreadLocalEventLoop');
initMetadataForClass(CompletionHandlerException, 'CompletionHandlerException');
initMetadataForClass(CoroutinesInternalError, 'CoroutinesInternalError');
initMetadataForObject(Key_2, 'Key');
initMetadataForObject(NonDisposableHandle, 'NonDisposableHandle');
initMetadataForInterface(Incomplete, 'Incomplete');
initMetadataForClass(Empty, 'Empty', VOID, VOID, [Incomplete]);
initMetadataForClass(LockFreeLinkedListNode, 'LockFreeLinkedListNode', LockFreeLinkedListNode);
initMetadataForClass(LockFreeLinkedListHead, 'LockFreeLinkedListHead', LockFreeLinkedListHead);
initMetadataForClass(NodeList, 'NodeList', NodeList, VOID, [Incomplete]);
initMetadataForClass(JobNode, 'JobNode', VOID, VOID, [Incomplete]);
initMetadataForClass(SynchronizedObject, 'SynchronizedObject', SynchronizedObject);
initMetadataForClass(Finishing, 'Finishing', VOID, VOID, [Incomplete]);
initMetadataForClass(ChildCompletion, 'ChildCompletion');
initMetadataForClass(InactiveNodeList, 'InactiveNodeList', VOID, VOID, [Incomplete]);
initMetadataForClass(InvokeOnCompletion, 'InvokeOnCompletion');
initMetadataForClass(InvokeOnCancelling, 'InvokeOnCancelling');
initMetadataForClass(ChildHandleNode, 'ChildHandleNode');
initMetadataForClass(IncompleteStateBox, 'IncompleteStateBox');
initMetadataForClass(MainCoroutineDispatcher, 'MainCoroutineDispatcher');
initMetadataForClass(TimeoutCancellationException, 'TimeoutCancellationException');
initMetadataForObject(Unconfined, 'Unconfined');
initMetadataForObject(Key_3, 'Key');
initMetadataForObject(ExceptionSuccessfullyProcessed, 'ExceptionSuccessfullyProcessed');
initMetadataForClass(DispatchedContinuation, 'DispatchedContinuation');
initMetadataForClass(DispatchException, 'DispatchException');
initMetadataForClass(Symbol_0, 'Symbol');
initMetadataForClass(SetTimeoutBasedDispatcher, 'SetTimeoutBasedDispatcher', VOID, VOID, VOID, [1]);
initMetadataForObject(NodeDispatcher, 'NodeDispatcher', VOID, VOID, VOID, [1]);
initMetadataForClass(MessageQueue, 'MessageQueue', VOID, VOID, [KtList, Collection]);
initMetadataForClass(ScheduledMessageQueue, 'ScheduledMessageQueue');
initMetadataForClass(WindowMessageQueue, 'WindowMessageQueue');
initMetadataForClass(UnconfinedEventLoop, 'UnconfinedEventLoop', UnconfinedEventLoop);
initMetadataForObject(SetTimeoutDispatcher, 'SetTimeoutDispatcher', VOID, VOID, VOID, [1]);
initMetadataForClass(WindowDispatcher, 'WindowDispatcher', VOID, VOID, VOID, [1]);
initMetadataForObject(Dispatchers, 'Dispatchers');
initMetadataForClass(JsMainDispatcher, 'JsMainDispatcher');
initMetadataForClass(JobCancellationException, 'JobCancellationException');
initMetadataForClass(DiagnosticCoroutineContextException, 'DiagnosticCoroutineContextException');
initMetadataForClass(ListClosed, 'ListClosed');
initMetadataForClass(CommonThreadLocal, 'CommonThreadLocal', CommonThreadLocal);
initMetadataForLambda(Worker$Companion$fetch$slambda, VOID, VOID, [1]);
initMetadataForCompanion(Companion_7);
initMetadataForClass(Worker, 'Worker', Worker);
//endregion
//region block: init
Companion_instance = new Companion();
Unit_instance = new Unit();
Companion_instance_2 = new Companion_2();
CompletedContinuation_instance = new CompletedContinuation();
Companion_instance_3 = new Companion_3();
Companion_instance_4 = new Companion_4();
Key_instance = new Key();
Companion_instance_6 = new Companion_6();
Key_instance_1 = new Key_1();
GlobalScope_instance = new GlobalScope();
Key_instance_2 = new Key_2();
NonDisposableHandle_instance = new NonDisposableHandle();
Key_instance_3 = new Key_3();
counter = 0;
DEBUG = false;
Companion_instance_7 = new Companion_7();
//endregion
//region block: exports
Worker.fetch = fetch;
defineProp(Worker, 'Companion', Companion_getInstance_7, VOID, true);
export default Worker;
//endregion

//# sourceMappingURL=kotlin-cloudflare-workers-examples-hello-worker.mjs.map
