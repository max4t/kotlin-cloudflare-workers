// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface Element : web.dom.Node, web.aria.ARIAMixin, web.dom.Animatable, web.dom.ChildNode, web.dom.NonDocumentTypeChildNode, web.dom.ParentNode, web.components.Slottable {
/**
     * The **`Element.attributes`** property returns a live collection of all attribute nodes registered to the specified node. It is a NamedNodeMap, not an Array, so it has no Array methods and the Attr nodes' indexes may differ among browsers. To be more specific, attributes is a key/value pair of strings that represents any information regarding that attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/attributes)
     */
val attributes: web.dom.NamedNodeMap
/**
     * The read-only **`classList`** property of the Element interface contains a live DOMTokenList collection representing the class attribute of the element. This can then be used to manipulate the class list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/classList)
     */
val classList: Any? /* type isn't declared */
/**
     * The **`className`** property of the Element interface gets and sets the value of the class attribute of the specified element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/className)
     */
var className: String
/**
     * The **`clientHeight`** read-only property of the Element interface is zero for elements with no CSS or inline layout boxes; otherwise, it's the inner height of an element in pixels. It includes padding but excludes borders, margins, and horizontal scrollbars (if present).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientHeight)
     */
val clientHeight: Double
/**
     * The **`clientLeft`** read-only property of the Element interface returns the width of the left border of an element in pixels. It includes the width of the vertical scrollbar if the text direction of the element is right-to-left and if there is an overflow causing a left vertical scrollbar to be rendered. clientLeft does not include the left margin or the left padding.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientLeft)
     */
val clientLeft: Double
/**
     * The **`clientTop`** read-only property of the Element interface returns the width of the top border of an element in pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientTop)
     */
val clientTop: Double
/**
     * The **`clientWidth`** read-only property of the Element interface is zero for inline elements and elements with no CSS; otherwise, it's the inner width of an element in pixels. It includes padding but excludes borders, margins, and vertical scrollbars (if present).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientWidth)
     */
val clientWidth: Double
/**
     * The **`currentCSSZoom`** read-only property of the Element interface provides the "effective" CSS zoom of an element, taking into account the zoom applied to the element and all its parent elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/currentCSSZoom)
     */
val currentCSSZoom: Double
val customElementRegistry: web.components.CustomElementRegistry?
/**
     * The **`id`** property of the Element interface represents the element's identifier, reflecting the id global attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/id)
     */
var id: String
/**
     * The **`innerHTML`** property of the Element interface gets or sets the HTML or XML markup contained within the element, omitting any shadow roots in both cases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/innerHTML)
     */
var innerHTML: String
/**
     * The **`Element.localName`** read-only property returns the local part of the qualified name of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/localName)
     */
val localName: String
/**
     * The **`Element.namespaceURI`** read-only property returns the namespace URI of the element, or null if the element is not in a namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/namespaceURI)
     */
val namespaceURI: String?
/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenchange_event) */
var onfullscreenchange: ((/* this: Element, */ ev: web.events.Event) -> Any?)?
/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenerror_event) */
var onfullscreenerror: ((/* this: Element, */ ev: web.events.Event) -> Any?)?
/**
     * The **`outerHTML`** attribute of the Element interface gets or sets the HTML or XML markup of the element and its descendants, omitting any shadow roots in both cases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/outerHTML)
     */
var outerHTML: String
val ownerDocument: web.dom.Document
/**
     * The read-only **`part`** property of the Element interface contains a DOMTokenList object representing the part identifier(s) of the element. It reflects the element's part content attribute. These can be used to style parts of a shadow DOM, via the ::part pseudo-element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/part)
     */
val part: Any? /* type isn't declared */
/**
     * The **`Element.prefix`** read-only property returns the namespace prefix of the specified element, or null if no prefix is specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/prefix)
     */
val prefix: String?
/**
     * The **`scrollHeight`** read-only property of the Element interface is a measurement of the height of an element's content, including content not visible on the screen due to overflow.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollHeight)
     */
val scrollHeight: Double
/**
     * The **`scrollLeft`** property of the Element interface gets or sets the number of pixels by which an element's content is scrolled from its left edge. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a whole number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollLeft)
     */
var scrollLeft: Double
/**
     * The **`scrollTop`** property of the Element interface gets or sets the number of pixels by which an element's content is scrolled from its top edge. This value is subpixel precise in modern browsers, meaning that it isn't necessarily a whole number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTop)
     */
var scrollTop: Double
/**
     * The **`scrollWidth`** read-only property of the Element interface is a measurement of the width of an element's content, including content not visible on the screen due to overflow.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollWidth)
     */
val scrollWidth: Double
/**
     * The **`Element.shadowRoot`** read-only property represents the shadow root hosted by the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/shadowRoot)
     */
val shadowRoot: web.components.ShadowRoot?
/**
     * The **`slot`** property of the Element interface returns the name of the shadow DOM slot the element is inserted in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/slot)
     */
var slot: String
/**
     * The **`tagName`** read-only property of the Element interface returns the tag name of the element on which it's called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/tagName)
     */
val tagName: String
/**
     * The **`Element.attachShadow()`** method attaches a shadow DOM tree to the specified element and returns a reference to its ShadowRoot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/attachShadow)
     */
fun attachShadow(init: web.components.ShadowRootInit): web.components.ShadowRoot
/**
     * The **`checkVisibility()`** method of the Element interface checks whether the element is visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/checkVisibility)
     */
fun checkVisibility(options: web.dom.CheckVisibilityOptions = definedExternally): Boolean
/**
     * The **`closest()`** method of the Element interface traverses the element and its parents (heading toward the document root) until it finds a node that matches the specified CSS selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/closest)
     */
fun <K : /* keyof HTMLElementTagNameMap */> closest(selector: K): (Any?)?
fun <K : /* keyof SVGElementTagNameMap */> closest(selector: K): (Any?)?
fun <K : /* keyof MathMLElementTagNameMap */> closest(selector: K): (Any?)?
fun <E : web.dom.Element /* default is web.dom.Element */> closest(selectors: String): E?
/**
     * The **`computedStyleMap()`** method of the Element interface returns a StylePropertyMapReadOnly interface which provides a read-only representation of a CSS declaration block that is an alternative to CSSStyleDeclaration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/computedStyleMap)
     */
fun computedStyleMap(): web.cssom.StylePropertyMapReadOnly
fun getAttribute(name: String): String?
/**
     * The **`getAttributeNS()`** method of the Element interface returns the string value of the attribute with the specified namespace and name. If the named attribute does not exist, the value returned will either be null or "" (the empty string); see Notes for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNS)
     */
fun getAttributeNS(namespace: String?, localName: String): String?
/**
     * The **`getAttributeNames()`** method of the Element interface returns the attribute names of the element as an Array of strings. If the element has no attributes it returns an empty array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNames)
     */
fun getAttributeNames(): js.array.ReadonlyArray<String>
/**
     * Returns the specified attribute of the specified element, as an Attr node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNode)
     */
fun getAttributeNode(qualifiedName: String): web.dom.Attr?
/**
     * The **`getAttributeNodeNS()`** method of the Element interface returns the namespaced Attr node of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNodeNS)
     */
fun getAttributeNodeNS(namespace: String?, localName: String): web.dom.Attr?
/**
     * The **`Element.getBoundingClientRect()`** method returns a DOMRect object providing information about the size of an element and its position relative to the viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getBoundingClientRect)
     */
fun getBoundingClientRect(): web.geometry.DOMRect
/**
     * The **`getClientRects()`** method of the Element interface returns a collection of DOMRect objects that indicate the bounding rectangles for each CSS border box in a client.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getClientRects)
     */
fun getClientRects(): web.geometry.DOMRectList
/**
     * The Element method **`getElementsByClassName()`** returns a live HTMLCollection which contains every descendant element which has the specified class name or names.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByClassName)
     */
fun getElementsByClassName(classNames: String): HTMLCollectionOf<web.dom.Element>
/**
     * The **`Element.getElementsByTagName()`** method returns a live HTMLCollection of elements with the given tag name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByTagName)
     */
fun <K : /* keyof HTMLElementTagNameMap */> getElementsByTagName(qualifiedName: K): HTMLCollectionOf<Any?>
fun <K : /* keyof SVGElementTagNameMap */> getElementsByTagName(qualifiedName: K): HTMLCollectionOf<Any?>
fun <K : /* keyof MathMLElementTagNameMap */> getElementsByTagName(qualifiedName: K): HTMLCollectionOf<Any?>
/** @deprecated */
fun <K : /* keyof HTMLElementDeprecatedTagNameMap */> getElementsByTagName(qualifiedName: K): HTMLCollectionOf<Any?>
fun getElementsByTagName(qualifiedName: String): HTMLCollectionOf<web.dom.Element>
/**
     * The **`Element.getElementsByTagNameNS()`** method returns a live HTMLCollection of elements with the given tag name belonging to the given namespace. It is similar to Document.getElementsByTagNameNS, except that its search is restricted to descendants of the specified element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByTagNameNS)
     */
fun getElementsByTagNameNS(namespaceURI: String /* "http://www.w3.org/1999/xhtml" */, localName: String): HTMLCollectionOf<web.html.HTMLElement>
fun getElementsByTagNameNS(namespaceURI: String /* "http://www.w3.org/2000/svg" */, localName: String): HTMLCollectionOf<web.svg.SVGElement>
fun getElementsByTagNameNS(namespaceURI: String /* "http://www.w3.org/1998/Math/MathML" */, localName: String): HTMLCollectionOf<web.mathml.MathMLElement>
fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollectionOf<web.dom.Element>
/**
     * The **`getHTML()`** method of the Element interface is used to serialize an element's DOM to an HTML string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getHTML)
     */
fun getHTML(options: web.dom.GetHTMLOptions = definedExternally): String
fun hasAttribute(name: String): Boolean
/**
     * The **`hasAttributeNS()`** method of the Element interface returns a boolean value indicating whether the current element has the specified attribute with the specified namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttributeNS)
     */
fun hasAttributeNS(namespace: String?, localName: String): Boolean
/**
     * The **`hasAttributes()`** method of the Element interface returns a boolean value indicating whether the current element has any attributes or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttributes)
     */
fun hasAttributes(): Boolean
/**
     * The **`hasPointerCapture()`** method of the Element interface checks whether the element on which it is invoked has pointer capture for the pointer identified by the given pointer ID.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasPointerCapture)
     */
fun hasPointerCapture(pointerId: Double): Boolean
/**
     * The **`insertAdjacentElement()`** method of the Element interface inserts a given element node at a given position relative to the element it is invoked upon.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentElement)
     */
fun insertAdjacentElement(where: web.dom.InsertPosition, element: web.dom.Element): web.dom.Element?
/**
     * The **`insertAdjacentHTML()`** method of the Element interface parses the specified input as HTML or XML and inserts the resulting nodes into the DOM tree at a specified position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentHTML)
     */
fun insertAdjacentHTML(position: web.dom.InsertPosition, string: String): Unit
/**
     * The **`insertAdjacentText()`** method of the Element interface, given a relative position and a string, inserts a new text node at the given position relative to the element it is called from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentText)
     */
fun insertAdjacentText(where: web.dom.InsertPosition, data: String): Unit
/**
     * The **`matches()`** method of the Element interface tests whether the element would be selected by the specified CSS selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/matches)
     */
fun <K : /* keyof HTMLElementTagNameMap */> matches(selectors: K): Boolean /* this is HTMLElementTagNameMap[K] */
fun <K : /* keyof SVGElementTagNameMap */> matches(selectors: K): Boolean /* this is SVGElementTagNameMap[K] */
fun <K : /* keyof MathMLElementTagNameMap */> matches(selectors: K): Boolean /* this is MathMLElementTagNameMap[K] */
fun matches(selectors: String): Boolean
/**
     * The **`releasePointerCapture()`** method of the Element interface releases (stops) pointer capture that was previously set for a specific (PointerEvent) pointer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/releasePointerCapture)
     */
fun releasePointerCapture(pointerId: Double): Unit
fun removeAttribute(name: String): web.dom.Element
/**
     * The **`removeAttributeNS()`** method of the Element interface removes the specified attribute with the specified namespace from an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttributeNS)
     */
fun removeAttributeNS(namespace: String?, localName: String): Unit
/**
     * The **`removeAttributeNode()`** method of the Element interface removes the specified Attr node from the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttributeNode)
     */
fun removeAttributeNode(attr: web.dom.Attr): web.dom.Attr
/**
     * The **`Element.requestFullscreen()`** method issues an asynchronous request to make the element be displayed in fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/requestFullscreen)
     */
fun requestFullscreen(options: web.fullscreen.FullscreenOptions = definedExternally): js.promise.Promise<js.core.Void>
/**
     * The **`requestPointerLock()`** method of the Element interface lets you asynchronously ask for the pointer to be locked on the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/requestPointerLock)
     */
fun requestPointerLock(options: web.dom.PointerLockOptions = definedExternally): js.promise.Promise<js.core.Void>
/**
     * The **`scroll()`** method of the Element interface scrolls the element to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scroll)
     */
fun scroll(options: web.scroll.ScrollToOptions = definedExternally): Unit
fun scroll(x: Double, y: Double): Unit
/**
     * The **`scrollBy()`** method of the Element interface scrolls an element by the given amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollBy)
     */
fun scrollBy(options: web.scroll.ScrollToOptions = definedExternally): Unit
fun scrollBy(x: Double, y: Double): Unit
/**
     * The Element interface's **`scrollIntoView()`** method scrolls the element's ancestor containers such that the element on which scrollIntoView() is called is visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     */
fun scrollIntoView(): Unit

/**
     * The Element interface's **`scrollIntoView()`** method scrolls the element's ancestor containers such that the element on which scrollIntoView() is called is visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     */
fun scrollIntoView(arg: Boolean = definedExternally): Unit

/**
     * The Element interface's **`scrollIntoView()`** method scrolls the element's ancestor containers such that the element on which scrollIntoView() is called is visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     */
fun scrollIntoView(arg: web.scroll.ScrollIntoViewOptions = definedExternally): Unit
/**
     * The **`scrollTo()`** method of the Element interface scrolls to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTo)
     */
fun scrollTo(options: web.scroll.ScrollToOptions = definedExternally): Unit
fun scrollTo(x: Double, y: Double): Unit
fun setAttribute(name: String, value: String): web.dom.Element
/**
     * The **`setAttributeNS()`** method of the Element interface adds a new attribute or changes the value of an attribute with the given namespace and name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNS)
     */
fun setAttributeNS(namespace: String?, qualifiedName: String, value: String): Unit
/**
     * The **`setAttributeNode()`** method of the Element interface adds a new Attr node to the specified element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNode)
     */
fun setAttributeNode(attr: web.dom.Attr): web.dom.Attr?
/**
     * The **`setAttributeNodeNS()`** method of the Element interface adds a new namespaced Attr node to an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNodeNS)
     */
fun setAttributeNodeNS(attr: web.dom.Attr): web.dom.Attr?
/**
     * The **`setHTMLUnsafe()`** method of the Element interface is used to parse HTML input into a DocumentFragment, optionally filtering out unwanted elements and attributes, and those that don't belong in the context, and then using it to replace the element's subtree in the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setHTMLUnsafe)
     */
fun setHTMLUnsafe(html: String): Unit
/**
     * The **`setPointerCapture()`** method of the Element interface is used to designate a specific element as the capture target of future pointer events. Subsequent events for the pointer will be targeted at the capture element until capture is released (via Element.releasePointerCapture() or the pointerup event is fired).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setPointerCapture)
     */
fun setPointerCapture(pointerId: Double): Unit
/**
     * The **`toggleAttribute()`** method of the Element interface toggles a Boolean attribute (removing it if it is present and adding it if it is not present) on the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/toggleAttribute)
     */
fun toggleAttribute(qualifiedName: String, force: Boolean = definedExternally): Boolean
/**
     * @deprecated This is a legacy alias of `matches`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/matches)
     */
fun webkitMatchesSelector(selectors: String): Boolean
/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/textContent) */
val textContent: Any? /* type isn't declared */
fun <K : /* keyof ElementEventMap */> addEventListener(type: K, listener: (/* this: Element, */ ev: Any?) -> Any?): Unit

fun <K : /* keyof ElementEventMap */> addEventListener(type: K, listener: (/* this: Element, */ ev: Any?) -> Any?, options: Boolean = definedExternally): Unit

fun <K : /* keyof ElementEventMap */> addEventListener(type: K, listener: (/* this: Element, */ ev: Any?) -> Any?, options: web.events.AddEventListenerOptions = definedExternally): Unit
fun addEventListener(type: String, listener: EventListenerOrEventListenerObject): Unit

fun addEventListener(type: String, listener: EventListenerOrEventListenerObject, options: Boolean = definedExternally): Unit

fun addEventListener(type: String, listener: EventListenerOrEventListenerObject, options: web.events.AddEventListenerOptions = definedExternally): Unit
fun <K : /* keyof ElementEventMap */> removeEventListener(type: K, listener: (/* this: Element, */ ev: Any?) -> Any?): Unit

fun <K : /* keyof ElementEventMap */> removeEventListener(type: K, listener: (/* this: Element, */ ev: Any?) -> Any?, options: Boolean = definedExternally): Unit

fun <K : /* keyof ElementEventMap */> removeEventListener(type: K, listener: (/* this: Element, */ ev: Any?) -> Any?, options: web.events.EventListenerOptions = definedExternally): Unit
fun removeEventListener(type: String, listener: EventListenerOrEventListenerObject): Unit

fun removeEventListener(type: String, listener: EventListenerOrEventListenerObject, options: Boolean = definedExternally): Unit

fun removeEventListener(type: String, listener: EventListenerOrEventListenerObject, options: web.events.EventListenerOptions = definedExternally): Unit
val removed: Boolean
fun before(content: String, options: ContentOptions = definedExternally): web.dom.Element

fun before(content: web.streams.ReadableStream, options: ContentOptions = definedExternally): web.dom.Element

fun before(content: web.http.Response, options: ContentOptions = definedExternally): web.dom.Element
fun after(content: String, options: ContentOptions = definedExternally): web.dom.Element

fun after(content: web.streams.ReadableStream, options: ContentOptions = definedExternally): web.dom.Element

fun after(content: web.http.Response, options: ContentOptions = definedExternally): web.dom.Element
fun prepend(content: String, options: ContentOptions = definedExternally): web.dom.Element

fun prepend(content: web.streams.ReadableStream, options: ContentOptions = definedExternally): web.dom.Element

fun prepend(content: web.http.Response, options: ContentOptions = definedExternally): web.dom.Element
fun append(content: String, options: ContentOptions = definedExternally): web.dom.Element

fun append(content: web.streams.ReadableStream, options: ContentOptions = definedExternally): web.dom.Element

fun append(content: web.http.Response, options: ContentOptions = definedExternally): web.dom.Element
fun replace(content: String, options: ContentOptions = definedExternally): web.dom.Element

fun replace(content: web.streams.ReadableStream, options: ContentOptions = definedExternally): web.dom.Element

fun replace(content: web.http.Response, options: ContentOptions = definedExternally): web.dom.Element
fun remove(): web.dom.Element
fun removeAndKeepContent(): web.dom.Element
fun setInnerContent(content: String, options: ContentOptions = definedExternally): web.dom.Element

fun setInnerContent(content: web.streams.ReadableStream, options: ContentOptions = definedExternally): web.dom.Element

fun setInnerContent(content: web.http.Response, options: ContentOptions = definedExternally): web.dom.Element
fun onEndTag(handler: (tag: EndTag) -> js.promise.PromiseResult<js.core.Void>): Unit
}
