```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ElementTest {
    // Helper to create a simple element for testing
    private Element createElement(String tagName) {
        return new Element(Tag.valueOf(tagName), "http://example.com");
    }

    // Helper to create an element with text
    private Element createElementWithText(String tagName, String text) {
        Element element = createElement(tagName);
        element.appendChild(new TextNode(text, "http://example.com"));
        return element;
    }

    // Helper to create an element with attributes
    private Element createElementWithAttributes(String tagName, String... attrs) {
        Element element = createElement(tagName);
        for (int i = 0; i < attrs.length; i += 2) {
            element.attr(attrs[i], attrs[i + 1]);
        }
        return element;
    }

    @Test
    public void testNodeName() {
        Element div = createElement("div");
        assertEquals("div", div.nodeName());
    }

    @Test
    public void testTagName() {
        Element p = createElement("p");
        assertEquals("p", p.tagName());
    }

    @Test
    public void testTagNameSetter() {
        Element span = createElement("span");
        span.tagName("div");
        assertEquals("div", span.tagName());
    }

    @Test
    public void testTag() {
        Element body = createElement("body");
        assertNotNull(body.tag());
        assertEquals("body", body.tag().getName());
    }

    @Test
    public void testIsBlock() {
        Element div = createElement("div");
        assertTrue(div.isBlock());
        Element span = createElement("span");
        assertFalse(span.isBlock());
    }

    @Test
    public void testId() {
        Element el = createElementWithAttributes("div", "id", "myId");
        assertEquals("myId", el.id());
    }

    @Test
    public void testIdWhenNotSet() {
        Element el = createElement("div");
        assertEquals("", el.id());
    }

    @Test
    public void testAttrSetter() {
        Element el = createElement("a");
        el.attr("href", "/page.html");
        assertEquals("/page.html", el.attr("href"));
    }

    @Test
    public void testAttrSetterUpdatesExisting() {
        Element el = createElementWithAttributes("a", "href", "/page.html");
        el.attr("href", "/new_page.html");
        assertEquals("/new_page.html", el.attr("href"));
    }

    @Test
    public void testDataset() {
        Element el = createElementWithAttributes("div", "data-id", "123", "data-name", "test");
        Map<String, String> dataset = el.dataset();
        assertEquals("123", dataset.get("id"));
        assertEquals("test", dataset.get("name"));
        assertEquals(2, dataset.size());
    }

    @Test
    public void testDatasetEmpty() {
        Element el = createElement("div");
        assertTrue(el.dataset().isEmpty());
    }

    @Test
    public void testParent() {
        Element parent = createElement("div");
        Element child = createElement("p");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParents() {
        // Need a Document to act as root for parents() to stop at #root
        Document doc = new Document("http://example.com");
        Element html = new Element(Tag.valueOf("html"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        doc.appendChild(html);
        html.appendChild(body);

        Elements parents = body.parents();
        assertEquals(2, parents.size());
        assertEquals(html, parents.get(0));
        assertEquals(doc.root(), parents.get(1)); // #root is the actual parent of html in a Document
    }

    @Test
    public void testChild() {
        Element parent = createElement("div");
        Element child1 = createElement("p");
        Element child2 = createElement("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        Element parent = createElement("div");
        parent.child(0);
    }

    @Test
    public void testChildren() {
        Element parent = createElement("div");
        Element child1 = createElement("p");
        TextNode textNode = new TextNode("Some text", "http://example.com");
        Element child2 = createElement("span");
        parent.appendChild(child1);
        parent.appendChild(textNode);
        parent.appendChild(child2);

        Elements children = parent.children();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        assertEquals(child2, children.get(1));
    }

    @Test
    public void testChildrenEmpty() {
        Element parent = createElement("div");
        assertTrue(parent.children().isEmpty());
    }

    @Test
    public void testTextNodes() {
        Element parent = createElement("p");
        TextNode text1 = new TextNode("Text 1", "http://example.com");
        Element child1 = createElement("b");
        TextNode text2 = new TextNode("Text 2", "http://example.com");
        parent.appendChild(text1);
        parent.appendChild(child1);
        parent.appendChild(text2);

        List<TextNode> textNodes = parent.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals("Text 1", textNodes.get(0).text());
        assertEquals("Text 2", textNodes.get(1).text());
    }

    @Test
    public void testTextNodesEmpty() {
        Element parent = createElement("p");
        parent.appendChild(createElement("b"));
        assertTrue(parent.textNodes().isEmpty());
    }

    @Test
    public void testDataNodes() {
        Element parent = createElement("script");
        DataNode data1 = new DataNode("var x = 1;", "http://example.com");
        Element child1 = createElement("b");
        DataNode data2 = new DataNode("var y = 2;", "http://example.com");
        parent.appendChild(data1);
        parent.appendChild(child1);
        parent.appendChild(data2);

        List<DataNode> dataNodes = parent.dataNodes();
        assertEquals(2, dataNodes.size());
        assertEquals("var x = 1;", dataNodes.get(0).getWholeData());
        assertEquals("var y = 2;", dataNodes.get(1).getWholeData());
    }

    @Test
    public void testDataNodesEmpty() {
        Element parent = createElement("script");
        parent.appendChild(createElement("b"));
        assertTrue(parent.dataNodes().isEmpty());
    }

    @Test
    public void testSelect() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "p1");
        Element p2 = new Element(Tag.valueOf("p"), "http://example.com").attr("class", "content");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        p2.appendChild(span);
        root.appendChild(body);
        body.appendChild(p1);
        body.appendChild(p2);

        Elements ps = root.select("p");
        assertEquals(2, ps.size());
        assertEquals(p1, ps.get(0));
        assertEquals(p2, ps.get(1));

        Elements p1Selected = root.select("#p1");
        assertEquals(1, p1Selected.size());
        assertEquals(p1, p1Selected.get(0));

        Elements spans = root.select("p > span");
        assertEquals(1, spans.size());
        assertEquals(span, spans.get(0));
    }

    @Test
    public void testAppendChild() {
        Element parent = createElement("div");
        Node child = new TextNode("Hello", "http://example.com");
        parent.appendChild(child);
        assertEquals(1, parent.childNodes().size());
        assertEquals(child, parent.childNodes().get(0));
        assertEquals(parent, child.parent());
    }

    @Test
    public void testPrependChild() {
        Element parent = createElement("div");
        Node child1 = new TextNode("Hello", "http://example.com");
        Node child2 = new TextNode("World", "http://example.com");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(2, parent.childNodes().size());
        assertEquals(child2, parent.childNodes().get(0));
        assertEquals(child1, parent.childNodes().get(1));
        assertEquals(parent, child2.parent());
    }

    @Test
    public void testInsertChildrenAtBeginning() {
        Element parent = createElement("div");
        Node child1 = new TextNode("Hello", "http://example.com");
        Node child2 = new TextNode("World", "http://example.com");
        parent.appendChild(child1);
        parent.insertChildren(0, Collections.singletonList(child2));
        assertEquals(2, parent.childNodes().size());
        assertEquals(child2, parent.childNodes().get(0));
        assertEquals(child1, parent.childNodes().get(1));
    }

    @Test
    public void testInsertChildrenAtEnd() {
        Element parent = createElement("div");
        Node child1 = new TextNode("Hello", "http://example.com");
        Node child2 = new TextNode("World", "http://example.com");
        parent.appendChild(child1);
        parent.insertChildren(-1, Collections.singletonList(child2)); // -1 is equivalent to adding at the end
        assertEquals(2, parent.childNodes().size());
        assertEquals(child1, parent.childNodes().get(0));
        assertEquals(child2, parent.childNodes().get(1));
    }

    @Test
    public void testInsertChildrenInMiddle() {
        Element parent = createElement("div");
        Node child1 = new TextNode("Hello", "http://example.com");
        Node child2 = new TextNode("World", "http://example.com");
        Node child3 = new TextNode("There", "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child3);
        parent.insertChildren(1, Collections.singletonList(child2));
        assertEquals(3, parent.childNodes().size());
        assertEquals(child1, parent.childNodes().get(0));
        assertEquals(child2, parent.childNodes().get(1));
        assertEquals(child3, parent.childNodes().get(2));
    }

    @Test
    public void testAppendElement() {
        Element parent = createElement("div");
        Element child = parent.appendElement("p");
        assertEquals("p", child.tagName());
        assertEquals(1, parent.childNodes().size());
        assertEquals(child, parent.childNodes().get(0));
        assertEquals(parent, child.parent());
    }

    @Test
    public void testPrependElement() {
        Element parent = createElement("div");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.prependElement("span");
        assertEquals("span", child2.tagName());
        assertEquals(2, parent.childNodes().size());
        assertEquals(child2, parent.childNodes().get(0));
        assertEquals(child1, parent.childNodes().get(1));
        assertEquals(parent, child2.parent());
    }

    @Test
    public void testAppendText() {
        Element parent = createElement("div");
        parent.appendText("Hello");
        assertEquals(1, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof TextNode);
        assertEquals("Hello", ((TextNode) parent.childNodes().get(0)).text());
    }

    @Test
    public void testPrependText() {
        Element parent = createElement("div");
        parent.appendChild(new TextNode("World", "http://example.com"));
        parent.prependText("Hello");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof TextNode);
        assertEquals("Hello", ((TextNode) parent.childNodes().get(0)).text());
        assertTrue(parent.childNodes().get(1) instanceof TextNode);
        assertEquals("World", ((TextNode) parent.childNodes().get(1)).text());
    }

    @Test
    public void testAppendHtmlString() {
        Element parent = createElement("div");
        parent.append("<p>Hello</p><span>World</span>");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof Element);
        assertEquals("p", ((Element) parent.childNodes().get(0)).tagName());
        assertEquals("Hello", ((Element) parent.childNodes().get(0)).text());
        assertTrue(parent.childNodes().get(1) instanceof Element);
        assertEquals("span", ((Element) parent.childNodes().get(1)).tagName());
        assertEquals("World", ((Element) parent.childNodes().get(1)).text());
    }

    @Test
    public void testPrependHtmlString() {
        Element parent = createElement("div");
        parent.appendChild(new TextNode("Existing", "http://example.com"));
        parent.prepend("<p>Hello</p>");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof Element);
        assertEquals("p", ((Element) parent.childNodes().get(0)).tagName());
        assertEquals("Hello", ((Element) parent.childNodes().get(0)).text());
        assertTrue(parent.childNodes().get(1) instanceof TextNode);
        assertEquals("Existing", ((TextNode) parent.childNodes().get(1)).text());
    }

    @Test
    public void testBeforeString() {
        Element element = createElement("p");
        element.attr("id", "target");
        Element parent = createElement("div");
        parent.appendChild(element);
        parent.before("<p>Before</p>");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof Element);
        assertEquals("p", ((Element) parent.childNodes().get(0)).tagName());
        assertEquals("Before", ((Element) parent.childNodes().get(0)).text());
        assertEquals(element, parent.childNodes().get(1));
    }

    @Test
    public void testAfterString() {
        Element element = createElement("p");
        element.attr("id", "target");
        Element parent = createElement("div");
        parent.appendChild(element);
        parent.after("<span>After</span>");
        assertEquals(2, parent.childNodes().size());
        assertEquals(element, parent.childNodes().get(0));
        assertTrue(parent.childNodes().get(1) instanceof Element);
        assertEquals("span", ((Element) parent.childNodes().get(1)).tagName());
        assertEquals("After", ((Element) parent.childNodes().get(1)).text());
    }

    @Test
    public void testEmpty() {
        Element parent = createElement("div");
        parent.appendChild(new TextNode("Text", "http://example.com"));
        parent.appendChild(createElement("p"));
        parent.empty();
        assertTrue(parent.childNodes().isEmpty());
    }

    @Test
    public void testWrapString() {
        Element el = createElement("span");
        el.text("content");
        Element wrapped = el.wrap("<div></div>");
        assertEquals("div", wrapped.tagName());
        assertEquals(el, wrapped.child(0));
        assertEquals("content", el.text());
        // Check that wrap returns the *new* wrapper element, not the original
        assertNotEquals(el, wrapped);
        assertEquals("<div><span>content</span></div>", wrapped.outerHtml());
    }

    @Test
    public void testSiblingElements() {
        Element parent = createElement("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("div");

        assertEquals(2, el1.siblingElements().size());
        assertEquals(el2, el1.siblingElements().get(0));
        assertEquals(el3, el1.siblingElements().get(1));

        assertEquals(2, el2.siblingElements().size());
        assertEquals(el1, el2.siblingElements().get(0));
        assertEquals(el3, el2.siblingElements().get(1));

        assertEquals(2, el3.siblingElements().size());
        assertEquals(el1, el3.siblingElements().get(0));
        assertEquals(el2, el3.siblingElements().get(1));
    }

    @Test
    public void testSiblingElementsEmpty() {
        Element parent = createElement("div");
        Element el1 = parent.appendElement("p");
        assertTrue(el1.siblingElements().isEmpty());
    }

    @Test
    public void testNextElementSibling() {
        Element parent = createElement("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("div");

        assertEquals(el2, el1.nextElementSibling());
        assertEquals(el3, el2.nextElementSibling());
        assertNull(el3.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = createElement("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("div");

        assertNull(el1.previousElementSibling());
        assertEquals(el1, el2.previousElementSibling());
        assertEquals(el2, el3.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = createElement("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        assertEquals(el1, el2.firstElementSibling());
        assertEquals(el1, el1.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingNoSiblings() {
        Element parent = createElement("div");
        Element el1 = parent.appendElement("p");
        // When there's only one element, it's not considered a sibling element to itself by firstElementSibling logic
        assertNull(el1.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = createElement("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("div");

        assertEquals(0, el1.elementSiblingIndex().intValue());
        assertEquals(1, el2.elementSiblingIndex().intValue());
        assertEquals(2, el3.elementSiblingIndex().intValue());
    }

    @Test
    public void testLastElementSibling() {
        Element parent = createElement("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        assertEquals(el2, el1.lastElementSibling());
        assertEquals(el2, el2.lastElementSibling());
    }

    @Test
    public void testLastElementSiblingNoSiblings() {
        Element parent = createElement("div");
        Element el1 = parent.appendElement("p");
        // When there's only one element, it's not considered a sibling element to itself by lastElementSibling logic
        assertNull(el1.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "p1");
        Element p2 = new Element(Tag.valueOf("p"), "http://example.com").attr("class", "content");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        p2.appendChild(span);
        root.appendChild(body);
        body.appendChild(p1);
        body.appendChild(p2);

        Elements ps = root.getElementsByTag("p");
        assertEquals(2, ps.size());
        assertEquals(p1, ps.get(0));
        assertEquals(p2, ps.get(1));

        Elements divs = root.getElementsByTag("div");
        assertEquals(1, divs.size());
        assertEquals(root, divs.get(0));
    }

    @Test
    public void testGetElementById() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "p1");
        Element p2 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "p2");
        body.appendChild(p1);
        body.appendChild(p2);
        root.appendChild(body);

        assertEquals(p1, root.getElementById("p1"));
        assertEquals(p2, root.getElementById("p2"));
        assertNull(root.getElementById("nonexistent"));
    }

    @Test
    public void testElementsByClass() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").addClass("class1");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").addClass("class1 class2");
        Element p = new Element(Tag.valueOf("p"), "http://example.com").addClass("class1");
        root.appendChild(div1);
        root.appendChild(div2);
        root.appendChild(p);

        Elements els = root.getElementsByClass("class1");
        assertEquals(3, els.size());
        assertEquals(div1, els.get(0));
        assertEquals(div2, els.get(1));
        assertEquals(p, els.get(2));

        Elements els2 = root.getElementsByClass("class2");
        assertEquals(1, els2.size());
        assertEquals(div2, els2.get(0));
    }

    @Test
    public void testGetElementsByAttribute() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element a1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page1.html");
        Element a2 = new Element(Tag.valueOf("a"), "http://example.com").attr("target", "_blank");
        Element img = new Element(Tag.valueOf("img"), "http://example.com").attr("src", "image.png");
        root.appendChild(a1);
        root.appendChild(a2);
        root.appendChild(img);

        Elements elsHref = root.getElementsByAttribute("href");
        assertEquals(1, elsHref.size());
        assertEquals(a1, elsHref.get(0));

        Elements elsTarget = root.getElementsByAttribute("target");
        assertEquals(1, elsTarget.size());
        assertEquals(a2, elsTarget.get(0));
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("data-id", "1");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("data-name", "test");
        Element p = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "pid");
        root.appendChild(div1);
        root.appendChild(div2);
        root.appendChild(p);

        Elements elsData = root.getElementsByAttributeStarting("data-");
        assertEquals(2, elsData.size());
        assertEquals(div1, elsData.get(0));
        assertEquals(div2, elsData.get(1));
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element a1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page1.html");
        Element a2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page2.html");
        Element link = new Element(Tag.valueOf("link"), "http://example.com").attr("href", "page1.html");
        root.appendChild(a1);
        root.appendChild(a2);
        root.appendChild(link);

        Elements els = root.getElementsByAttributeValue("href", "page1.html");
        assertEquals(2, els.size());
        assertEquals(a1, els.get(0));
        assertEquals(link, els.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element a1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page1.html");
        Element a2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page2.html");
        Element link = new Element(Tag.valueOf("link"), "http://example.com").attr("href", "page1.html");
        root.appendChild(a1);
        root.appendChild(a2);
        root.appendChild(link);

        Elements els = root.getElementsByAttributeValueNot("href", "page1.html");
        assertEquals(1, els.size());
        assertEquals(a2, els.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element a1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page1.html");
        Element a2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page2.html");
        Element link = new Element(Tag.valueOf("link"), "http://example.com").attr("href", "page1.html");
        root.appendChild(a1);
        root.appendChild(a2);
        root.appendChild(link);

        Elements els = root.getElementsByAttributeValueStarting("href", "page1");
        assertEquals(2, els.size());
        assertEquals(a1, els.get(0));
        assertEquals(link, els.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element a1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page1.html");
        Element a2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page2.html");
        Element link = new Element(Tag.valueOf("link"), "http://example.com").attr("href", "page1.html");
        root.appendChild(a1);
        root.appendChild(a2);
        root.appendChild(link);

        Elements els = root.getElementsByAttributeValueEnding("href", ".html");
        assertEquals(3, els.size());
        assertEquals(a1, els.get(0));
        assertEquals(a2, els.get(1));
        assertEquals(link, els.get(2));
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element a1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page1.html");
        Element a2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page2.html");
        Element link = new Element(Tag.valueOf("link"), "http://example.com").attr("href", "page1.html");
        root.appendChild(a1);
        root.appendChild(a2);
        root.appendChild(link);

        Elements els = root.getElementsByAttributeValueContaining("href", "page");
        assertEquals(3, els.size());
        assertEquals(a1, els.get(0));
        assertEquals(a2, els.get(1));
        assertEquals(link, els.get(2));
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element a1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page1.html");
        Element a2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page2.html");
        Element link = new Element(Tag.valueOf("link"), "http://example.com").attr("href", "page1.html");
        root.appendChild(a1);
        root.appendChild(a2);
        root.appendChild(link);

        Elements els = root.getElementsByAttributeValueMatching("href", "page[0-9]\\.html");
        assertEquals(3, els.size());
        assertEquals(a1, els.get(0));
        assertEquals(a2, els.get(1));
        assertEquals(link, els.get(2));
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Element parent = createElement("div");
        parent.appendElement("p");
        parent.appendElement("span");
        parent.appendElement("div");
        parent.appendElement("a");

        Elements els = parent.getElementsByIndexLessThan(2);
        assertEquals(2, els.size());
        assertEquals("p", els.get(0).tagName());
        assertEquals("span", els.get(1).tagName());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element parent = createElement("div");
        parent.appendElement("p");
        parent.appendElement("span");
        parent.appendElement("div");
        parent.appendElement("a");

        Elements els = parent.getElementsByIndexGreaterThan(1);
        assertEquals(2, els.size());
        assertEquals("div", els.get(0).tagName());
        assertEquals("a", els.get(1).tagName());
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Element parent = createElement("div");
        parent.appendElement("p");
        parent.appendElement("span");
        parent.appendElement("div");
        parent.appendElement("a");

        Elements els = parent.getElementsByIndexEquals(1);
        assertEquals(1, els.size());
        assertEquals("span", els.get(0).tagName());
    }

    @Test
    public void testGetElementsContainingText() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").text("Hello world");
        Element p2 = new Element(Tag.valueOf("p"), "http://example.com").text("Goodbye world");
        Element span = new Element(Tag.valueOf("span"), "http://example.com").text("Just hello");
        root.appendChild(p1);
        root.appendChild(p2);
        root.appendChild(span);

        Elements els = root.getElementsContainingText("world");
        assertEquals(2, els.size());
        assertEquals(p1, els.get(0));
        assertEquals(p2, els.get(1));
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").appendText("Hello world");
        Element p2 = new Element(Tag.valueOf("p"), "http://example.com").appendText("Goodbye world");
        Element span = new Element(Tag.valueOf("span"), "http://example.com").appendText("Just hello");
        Element nestedP = new Element(Tag.valueOf("p"), "http://example.com").appendText("Nested hello");
        p2.appendChild(nestedP);
        root.appendChild(p1);
        root.appendChild(p2);
        root.appendChild(span);

        Elements els = root.getElementsContainingOwnText("world");
        assertEquals(2, els.size());
        assertEquals(p1, els.get(0));
        assertEquals(p2, els.get(1));
    }

    @Test
    public void testGetElementsMatchingText() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").text("apple banana");
        Element p2 = new Element(Tag.valueOf("p"), "http://example.com").text("orange grape");
        Element span = new Element(Tag.valueOf("span"), "http://example.com").text("apple pie");
        root.appendChild(p1);
        root.appendChild(p2);
        root.appendChild(span);

        Elements els = root.getElementsMatchingText("apple.*");
        assertEquals(2, els.size());
        assertEquals(p1, els.get(0));
        assertEquals(span, els.get(1));
    }

    @Test
    public void testGetElementsMatchingOwnText() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").appendText("apple banana");
        Element p2 = new Element(Tag.valueOf("p"), "http://example.com").appendText("orange grape");
        Element span = new Element(Tag.valueOf("span"), "http://example.com").appendText("apple pie");
        Element nestedP = new Element(Tag.valueOf("p"), "http://example.com").appendText("Nested apple");
        p2.appendChild(nestedP);
        root.appendChild(p1);
        root.appendChild(p2);
        root.appendChild(span);

        Elements els = root.getElementsMatchingOwnText("apple.*");
        assertEquals(2, els.size());
        assertEquals(p1, els.get(0));
        assertEquals(span, els.get(1));
    }

    @Test
    public void testGetAllElements() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element p2 = new Element(Tag.valueOf("p"), "http://example.com");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        p2.appendChild(span);
        root.appendChild(body);
        body.appendChild(p1);
        body.appendChild(p2);

        Elements allElements = root.getAllElements();
        assertEquals(5, allElements.size()); // html, body, p1, p2, span
        assertEquals(root, allElements.get(0));
        assertEquals(body, allElements.get(1));
        assertEquals(p1, allElements.get(2));
        assertEquals(p2, allElements.get(3));
        assertEquals(span, allElements.get(4));
    }

    @Test
    public void testText() {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        p.appendChild(new TextNode("Hello ", "http://example.com"));
        p.appendChild(new Element(Tag.valueOf("b"), "http://example.com").text("there"));
        p.appendChild(new TextNode(" now!", "http://example.com"));
        assertEquals("Hello there now!", p.text());
    }

    @Test
    public void testTextWithBr() {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        p.appendChild(new TextNode("Line 1", "http://example.com"));
        p.appendChild(new Element(Tag.valueOf("br"), "http://example.com"));
        p.appendChild(new TextNode(" Line 2", "http://example.com"));
        assertEquals("Line 1 Line 2", p.text());
    }

    @Test
    public void testOwnText() {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        p.appendChild(new TextNode("Hello ", "http://example.com"));
        p.appendChild(new Element(Tag.valueOf("b"), "http://example.com").text("there"));
        p.appendChild(new TextNode(" now!", "http://example.com"));
        assertEquals("Hello  now!", p.ownText());
    }

    @Test
    public void testOwnTextWithBr() {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        p.appendChild(new TextNode("Line 1", "http://example.com"));
        p.appendChild(new Element(Tag.valueOf("br"), "http://example.com"));
        p.appendChild(new TextNode(" Line 2", "http://example.com"));
        assertEquals("Line 1  Line 2", p.ownText());
    }

    @Test
    public void testHasText() {
        Element elWithText = createElementWithText("p", "Some text");
        assertTrue(elWithText.hasText());

        Element elWithOnlyWhitespace = createElement("p");
        elWithOnlyWhitespace.appendChild(new TextNode("   \n ", "http://example.com"));
        assertFalse(elWithOnlyWhitespace.hasText());

        Element elWithChildHasText = createElement("p");
        elWithChildHasText.appendChild(createElement("span").text("Child text"));
        assertTrue(elWithChildHasText.hasText());

        Element elEmpty = createElement("p");
        assertFalse(elEmpty.hasText());
    }

    @Test
    public void testData() {
        Element script = new Element(Tag.valueOf("script"), "http://example.com");
        script.appendChild(new DataNode("var x = 1;", "http://example.com"));
        // The .data() method on Element is a getter, not a setter.
        // To set data, you append a DataNode.
        script.appendChild(new DataNode("var y = 2;", "http://example.com"));
        assertEquals("var x = 1;var y = 2;", script.data());
    }

    @Test
    public void testClassName() {
        Element el = createElementWithAttributes("div", "class", "header gray");
        assertEquals("header gray", el.className());
    }

    @Test
    public void testClassNameEmpty() {
        Element el = createElement("div");
        assertEquals("", el.className());
    }

    @Test
    public void testClassNames() {
        Element el = createElementWithAttributes("div", "class", "header gray large");
        Set<String> classes = el.classNames();
        assertEquals(3, classes.size());
        assertTrue(classes.contains("header"));
        assertTrue(classes.contains("gray"));
        assertTrue(classes.contains("large"));
    }

    @Test
    public void testClassNamesEmpty() {
        Element el = createElement("div");
        assertTrue(el.classNames().isEmpty());
    }

    @Test
    public void testClassNamesWithExtraSpaces() {
        Element el = createElementWithAttributes("div", "class", " header   gray  large ");
        Set<String> classes = el.classNames();
        assertEquals(3, classes.size());
        assertTrue(classes.contains("header"));
        assertTrue(classes.contains("gray"));
        assertTrue(classes.contains("large"));
    }

    @Test
    public void testClassNamesSetter() {
        Element el = createElement("div");
        Set<String> classes = new LinkedHashSet<>();
        classes.add("one");
        classes.add("two");
        el.classNames(classes);
        assertEquals("one two", el.className());
    }

    @Test
    public void testHasClass() {
        Element el = createElementWithAttributes("div", "class", "header gray large");
        assertTrue(el.hasClass("header"));
        assertTrue(el.hasClass("gray"));
        assertTrue(el.hasClass("large"));
        assertFalse(el.hasClass("extra"));
    }

    @Test
    public void testHasClassCaseInsensitive() {
        Element el = createElementWithAttributes("div", "class", "HEADER");
        assertTrue(el.hasClass("header"));
    }

    @Test
    public void testAddClass() {
        Element el = createElementWithAttributes("div", "class", "one");
        el.addClass("two");
        assertEquals("one two", el.className());
        assertTrue(el.hasClass("two"));
    }

    @Test
    public void testAddClassAlreadyPresent() {
        Element el = createElementWithAttributes("div", "class", "one two");
        el.addClass("one");
        assertEquals("one two", el.className());
    }

    @Test
    public void testRemoveClass() {
        Element el = createElementWithAttributes("div", "class", "one two three");
        el.removeClass("two");
        assertEquals("one three", el.className());
        assertFalse(el.hasClass("two"));
    }

    @Test
    public void testRemoveClassNotPresent() {
        Element el = createElementWithAttributes("div", "class", "one two");
        el.removeClass("three");
        assertEquals("one two", el.className());
    }

    @Test
    public void testToggleClassAdd() {
        Element el = createElementWithAttributes("div", "class", "one");
        el.toggleClass("two");
        assertEquals("one two", el.className());
    }

    @Test
    public void testToggleClassRemove() {
        Element el = createElementWithAttributes("div", "class", "one two");
        el.toggleClass("one");
        assertEquals("two", el.className());
    }

    @Test
    public void testValInput() {
        Element input = createElementWithAttributes("input", "value", "initial");
        assertEquals("initial", input.val());
        input.val("new value");
        assertEquals("new value", input.val());
    }

    @Test
    public void testValTextarea() {
        Element textarea = createElementWithAttributes("textarea", "value", "initial"); // value attribute is ignored for textarea
        textarea.text("textarea content");
        assertEquals("textarea content", textarea.val());
        textarea.val("new content");
        assertEquals("new content", textarea.val());
    }

    @Test
    public void testOuterHtmlHeadSelfClosing() {
        Tag imgTag = Tag.valueOf("img");
        imgTag.isSelfClosing = true;
        Element img = new Element(imgTag, "http://example.com", new Attributes().put("src", "image.jpg"));
        StringBuilder accum = new StringBuilder();
        img.outerHtmlHead(accum, 0, new Document("http://example.com").outputSettings());
        assertEquals("<img src=\"image.jpg\" />", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadNotSelfClosing() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com", new Attributes().put("id", "main"));
        StringBuilder accum = new StringBuilder();
        div.outerHtmlHead(accum, 0, new Document("http://example.com").outputSettings());
        assertEquals("<div id=\"main\">", accum.toString());
    }

    @Test
    public void testOuterHtmlTailNotSelfClosing() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.appendChild(new TextNode("content", "http://example.com"));
        StringBuilder accum = new StringBuilder();
        div.outerHtmlTail(accum, 0, new Document("http://example.com").outputSettings());
        assertEquals("</div>", accum.toString());
    }

    @Test
    public void testOuterHtmlTailSelfClosing() {
        Tag imgTag = Tag.valueOf("img");
        imgTag.isSelfClosing = true;
        Element img = new Element(imgTag, "http://example.com");
        StringBuilder accum = new StringBuilder();
        img.outerHtmlTail(accum, 0, new Document("http://example.com").outputSettings());
        assertEquals("", accum.toString()); // No tail for self-closing tags
    }

    @Test
    public void testHtml() {
        Element parent = createElement("div");
        parent.appendChild(new Element(Tag.valueOf("p"), "http://example.com").text("Hello"));
        parent.appendChild(new TextNode(" World", "http://example.com"));
        assertEquals("<p>Hello</p> World", parent.html());
    }

    @Test
    public void testHtmlEmpty() {
        Element parent = createElement("div");
        assertEquals("", parent.html());
    }

    @Test
    public void testHtmlSetter() {
        Element parent = createElement("div");
        parent.html("<p>New Content</p>");
        assertEquals("<p>New Content</p>", parent.html());
        assertEquals(1, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof Element);
        assertEquals("p", ((Element) parent.childNodes().get(0)).tagName());
    }

    @Test
    public void testToString() {
        Element el = createElement("div");
        el.appendChild(new TextNode("Test", "http://example.com"));
        assertEquals("<div>Test</div>", el.toString());
    }

    @Test
    public void testEquals() {
        Element el1 = createElement("div");
        Element el2 = createElement("div");
        assertEquals(el1, el1); // Same instance
        assertNotEquals(el1, el2); // Different instances
    }

    @Test
    public void testHashCode() {
        Element el1 = createElement("div");
        Element el2 = createElement("div");
        Element el3 = createElement("span");
        assertEquals(el1.hashCode(), el1.hashCode());
        assertNotEquals(el1.hashCode(), el2.hashCode()); // Different instances
        assertNotEquals(el1.hashCode(), el3.hashCode()); // Different tag
    }

    @Test
    public void testClone() {
        Element original = createElementWithAttributes("div", "id", "original");
        original.addClass("class1");
        original.appendText("Some text");
        original.appendChild(new Element(Tag.valueOf("span"), "http://example.com"));

        Element cloned = original.clone();

        assertNotSame(original, cloned);
        assertEquals("div", cloned.tagName());
        assertEquals("original", cloned.id());
        assertTrue(cloned.hasClass("class1"));
        assertEquals("Some text", cloned.text());
        assertEquals(1, cloned.children().size());
        assertEquals("span", cloned.child(0).tagName());
        assertNotNull(cloned.classNames()); // Should be initialized
        assertNotSame(original.classNames(), cloned.classNames()); // Should be a new set
    }
}
```