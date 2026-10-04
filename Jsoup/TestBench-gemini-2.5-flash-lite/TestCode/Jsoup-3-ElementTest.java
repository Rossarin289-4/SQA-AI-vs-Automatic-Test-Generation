package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.StringUtils;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import java.util.*;
import org.jsoup.nodes.*;

public class ElementTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testNodeName() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("div", el.nodeName());
    }

    @Test
    public void testTagName() {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        assertEquals("span", el.tagName());
    }

    @Test
    public void testTag() {
        Tag expectedTag = Tag.valueOf("p");
        Element el = new Element(expectedTag, "http://example.com");
        assertEquals(expectedTag, el.tag());
    }

    @Test
    public void testIsBlock() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(div.isBlock());
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        assertFalse(span.isBlock());
    }

    @Test
    public void testId() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.id());
        el.attr("id", "myId");
        assertEquals("myId", el.id());
    }

    @Test
    public void testAttrKeyVal() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("key", "value");
        assertEquals("value", el.attr("key"));
        el.attr("key", "newValue");
        assertEquals("newValue", el.attr("key"));
    }

    @Test
    public void testParent() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParents() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element head = new Element(Tag.valueOf("head"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        root.appendChild(head);
        head.appendChild(body);

        Elements parents = body.parents();
        assertEquals(2, parents.size());
        assertEquals(head, parents.get(0));
        assertEquals(root, parents.get(1));
    }

    @Test
    public void testChild_validIndex() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
    }

    @Test
    public void testChild_invalidIndex() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        assertNull(parent.child(0));
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child);
        assertNull(parent.child(1)); // Index out of bounds for elements
    }

    @Test
    public void testChildren() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        TextNode textNode = new TextNode("hello", "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(textNode);
        parent.appendChild(child2);

        Elements children = parent.children();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        assertEquals(child2, children.get(1));
    }

    @Test
    public void testSelect_simple() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com").attr("id", "s1");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "p1");
        parent.appendChild(child1);
        parent.appendChild(child2);

        Elements selected = parent.select("#s1");
        assertEquals(1, selected.size());
        assertEquals(child1, selected.first());
    }

    @Test
    public void testAppendChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Node child = new TextNode("text", "http://example.com");
        parent.appendChild(child);
        assertEquals(child, parent.childNode(0));
        assertEquals(1, parent.childNodes().size());
    }

    @Test
    public void testPrependChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Node child1 = new TextNode("text1", "http://example.com");
        Node child2 = new TextNode("text2", "http://example.com");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
    }

    @Test
    public void testAppendElement() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(parent, child.parent());
        assertEquals(1, parent.children().size());
        assertEquals(child, parent.child(0));
    }

    @Test
    public void testPrependElement() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = parent.appendElement("span");
        Element child2 = parent.prependElement("p");
        assertEquals("p", child2.tagName());
        assertEquals(parent, child2.parent());
        assertEquals(2, parent.children().size());
        assertEquals(child2, parent.child(0));
        assertEquals(child1, parent.child(1));
    }

    @Test
    public void testAppendText() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendText("hello");
        assertEquals("hello", parent.childNode(0).outerHtml());
        assertEquals(1, parent.childNodes().size());
    }

    @Test
    public void testPrependText() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendText("world");
        parent.prependText("hello");
        assertEquals("hello", parent.childNode(0).outerHtml());
        assertEquals("world", parent.childNode(1).outerHtml());
    }

    @Test
    public void testAppend_simpleHtml() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.append("<span>test</span>");
        assertEquals("<span>test</span>", parent.html());
    }

    @Test
    public void testAppend_multipleNodesHtml() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.append("<p>one</p><p>two</p>");
        assertEquals("<p>one</p><p>two</p>", parent.html());
    }

    @Test
    public void testPrepend_simpleHtml() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.append("<span>old</span>");
        parent.prepend("<h1>new</h1>");
        assertEquals("<h1>new</h1><span>old</span>", parent.html());
    }

    @Test
    public void testEmpty() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendText("some text");
        parent.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        parent.empty();
        assertTrue(parent.childNodes().isEmpty());
    }

    @Test
    public void testWrap_singleElement() {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        el.attr("id", "inner");
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(el);

        el.wrap("<p class='wrapper'></p>");
        assertEquals("<p class=\"wrapper\"><span><span id=\"inner\"></span></span></p>", parent.html());
    }

    @Test
    public void testSiblingElements() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element sibling1 = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode textNode = new TextNode("ignored", "http://example.com");
        Element sibling2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(sibling1);
        parent.appendChild(textNode);
        parent.appendChild(sibling2);

        Elements siblings = sibling1.siblingElements();
        assertEquals(2, siblings.size());
        assertEquals(sibling1, siblings.get(0));
        assertEquals(sibling2, siblings.get(1));
    }

    @Test
    public void testNextElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertNull(el2.nextElementSibling());
        assertEquals(el2, el1.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertNull(el1.previousElementSibling());
        assertEquals(el1, el2.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(el1, parent.firstElementSibling());
        assertNull(el1.firstElementSibling()); // el1 has no siblings if it's the first element
        assertEquals(el1, el2.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(0, el1.elementSiblingIndex().intValue());
        assertEquals(1, el2.elementSiblingIndex().intValue());
    }

    @Test
    public void testLastElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(el2, parent.lastElementSibling());
        assertNull(el1.lastElementSibling()); // el1 has no siblings if it's the last element
        assertEquals(el2, el2.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements ps = parent.getElementsByTag("p");
        assertEquals(2, ps.size());
        assertEquals(el1, ps.get(0));
        assertEquals(el3, ps.get(1));
    }

    @Test
    public void testGetElementById() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "first");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com").attr("id", "second");
        Element el3 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "first"); // duplicate ID
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        assertEquals(el1, parent.getElementById("first"));
        assertEquals(el2, parent.getElementById("second"));
        assertNull(parent.getElementById("nonexistent"));
    }

    @Test
    public void testGetElementsByClass() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").addClass("class1");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com").addClass("class2 class1");
        Element el3 = new Element(Tag.valueOf("p"), "http://example.com").addClass("class1");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements elementsWithClass1 = parent.getElementsByClass("class1");
        assertEquals(3, elementsWithClass1.size());
        assertTrue(elementsWithClass1.contains(el1));
        assertTrue(elementsWithClass1.contains(el2));
        assertTrue(elementsWithClass1.contains(el3));

        Elements elementsWithClass2 = parent.getElementsByClass("class2");
        assertEquals(1, elementsWithClass2.size());
        assertEquals(el2, elementsWithClass2.first());
    }

    @Test
    public void testGetElementsByAttribute() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").attr("href", "url1");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com").attr("data-id", "data1");
        Element el3 = new Element(Tag.valueOf("p"), "http://example.com").attr("href", "url2");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements hrefs = parent.getElementsByAttribute("href");
        assertEquals(2, hrefs.size());
        assertTrue(hrefs.contains(el1));
        assertTrue(hrefs.contains(el3));

        Elements dataIds = parent.getElementsByAttribute("data-id");
        assertEquals(1, dataIds.size());
        assertEquals(el2, dataIds.first());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").attr("href", "url1");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com").attr("data-id", "data1");
        Element el3 = new Element(Tag.valueOf("p"), "http://example.com").attr("href", "url2");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements urls1 = parent.getElementsByAttributeValue("href", "url1");
        assertEquals(1, urls1.size());
        assertEquals(el1, urls1.first());

        Elements data1s = parent.getElementsByAttributeValue("data-id", "data1");
        assertEquals(1, data1s.size());
        assertEquals(el2, data1s.first());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").attr("type", "text");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com").attr("type", "hidden");
        Element el3 = new Element(Tag.valueOf("p"), "http://example.com").attr("type", "text");
        Element el4 = new Element(Tag.valueOf("input"), "http://example.com"); // no type attribute

        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        parent.appendChild(el4);

        Elements notHidden = parent.getElementsByAttributeValueNot("type", "hidden");
        assertEquals(3, notHidden.size());
        assertTrue(notHidden.contains(el1));
        assertTrue(notHidden.contains(el3));
        assertTrue(notHidden.contains(el4)); // no attribute matches "not hidden"

        Elements notText = parent.getElementsByAttributeValueNot("type", "text");
        assertEquals(2, notText.size());
        assertTrue(notText.contains(el2));
        assertTrue(notText.contains(el4));
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "https://example.com/page2");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://test.com/page3");

        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements httpUrls = parent.getElementsByAttributeValueStarting("href", "http:");
        assertEquals(2, httpUrls.size());
        assertTrue(httpUrls.contains(el1));
        assertTrue(httpUrls.contains(el3));
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("img"), "http://example.com").attr("src", "/images/logo.png");
        Element el2 = new Element(Tag.valueOf("img"), "http://example.com").attr("src", "images/banner.jpg");
        Element el3 = new Element(Tag.valueOf("img"), "http://example.com").attr("src", "/images/icon.gif");

        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements pngImages = parent.getElementsByAttributeValueEnding("src", ".png");
        assertEquals(1, pngImages.size());
        assertEquals(el1, pngImages.first());

        Elements gifImages = parent.getElementsByAttributeValueEnding("src", ".gif");
        assertEquals(1, gifImages.size());
        assertEquals(el3, gifImages.first());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "/about/us.html");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "/contact.html");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "/about/team.html");

        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements aboutPages = parent.getElementsByAttributeValueContaining("href", "/about/");
        assertEquals(2, aboutPages.size());
        assertTrue(aboutPages.contains(el1));
        assertTrue(aboutPages.contains(el3));

        Elements usPages = parent.getElementsByAttributeValueContaining("href", "us.html");
        assertEquals(1, usPages.size());
        assertEquals(el1, usPages.first());
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements lessThan2 = parent.getElementsByIndexLessThan(2);
        assertEquals(2, lessThan2.size());
        assertTrue(lessThan2.contains(el1));
        assertTrue(lessThan2.contains(el2));

        Elements lessThan1 = parent.getElementsByIndexLessThan(1);
        assertEquals(1, lessThan1.size());
        assertEquals(el1, lessThan1.first());

        Elements lessThan0 = parent.getElementsByIndexLessThan(0);
        assertTrue(lessThan0.isEmpty());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements greaterThan0 = parent.getElementsByIndexGreaterThan(0);
        assertEquals(3, greaterThan0.size());
        assertTrue(greaterThan0.contains(el1));
        assertTrue(greaterThan0.contains(el2));
        assertTrue(greaterThan0.contains(el3));

        Elements greaterThan1 = parent.getElementsByIndexGreaterThan(1);
        assertEquals(2, greaterThan1.size());
        assertTrue(greaterThan1.contains(el2));
        assertTrue(greaterThan1.contains(el3));

        Elements greaterThan2 = parent.getElementsByIndexGreaterThan(2);
        assertEquals(1, greaterThan2.size());
        assertEquals(el3, greaterThan2.first());

        Elements greaterThan3 = parent.getElementsByIndexGreaterThan(3);
        assertTrue(greaterThan3.isEmpty());
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements index1 = parent.getElementsByIndexEquals(1);
        assertEquals(1, index1.size());
        assertEquals(el2, index1.first());

        Elements index0 = parent.getElementsByIndexEquals(0);
        assertEquals(1, index0.size());
        assertEquals(el1, index0.first());

        Elements index3 = parent.getElementsByIndexEquals(3);
        assertTrue(index3.isEmpty());
    }

    @Test
    public void testGetAllElements() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        el2.appendChild(el3);
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements all = parent.getAllElements();
        assertEquals(4, all.size()); // parent + el1 + el2 + el3
        assertTrue(all.contains(parent));
        assertTrue(all.contains(el1));
        assertTrue(all.contains(el2));
        assertTrue(all.contains(el3));
    }

    @Test
    public void testText_empty() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.text());
    }

    @Test
    public void testText_simpleTextNode() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendChild(new TextNode("Hello World", "http://example.com"));
        assertEquals("Hello World", el.text());
    }

    @Test
    public void testText_nestedElements() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.append("<p>First paragraph.</p><span> A span.</span>");
        assertEquals("First paragraph. A span.", el.text());
    }

    @Test
    public void testText_withBlockElements() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.append("<p>First.</p><div>Second.</div>");
        assertEquals("First. Second.", el.text());
    }

    @Test
    public void testHasText_true() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendChild(new TextNode("some text", "http://example.com"));
        assertTrue(el.hasText());
    }

    @Test
    public void testHasText_falseWhenEmptyOrWhitespace() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(!el.hasText());
        el.appendChild(new TextNode("   \n ", "http://example.com"));
        assertTrue(!el.hasText());
    }

    @Test
    public void testHasText_nested() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        Element inner = new Element(Tag.valueOf("p"), "http://example.com");
        inner.appendChild(new TextNode("inner text", "http://example.com"));
        el.appendChild(inner);
        assertTrue(el.hasText());
    }

    @Test
    public void testData_empty() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.data());
    }

    @Test
    public void testData_withDataNode() {
        Element el = new Element(Tag.valueOf("script"), "http://example.com");
        el.appendChild(new DataNode("var x = 1;", "http://example.com"));
        assertEquals("var x = 1;", el.data());
    }

    @Test
    public void testClassName() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.className());
        el.attr("class", " class1  class2 ");
        assertEquals(" class1  class2 ", el.className());
    }

    @Test
    public void testClassNames() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " class1  class2 class1 ");
        Set<String> classes = el.classNames();
        assertEquals(2, classes.size());
        assertTrue(classes.contains("class1"));
        assertTrue(classes.contains("class2"));
    }

    @Test
    public void testClassNames_empty() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        Set<String> classes = el.classNames();
        assertTrue(classes.isEmpty());
    }

    @Test
    public void testHasClass() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " class1  class2 ");
        assertTrue(el.hasClass("class1"));
        assertTrue(el.hasClass("class2"));
        assertFalse(el.hasClass("class3"));
    }

    @Test
    public void testAddClass() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.addClass("class1");
        el.addClass("class2");
        el.addClass("class1"); // add again
        assertEquals("class1 class2", el.className());
        assertTrue(el.hasClass("class1"));
        assertTrue(el.hasClass("class2"));
    }

    @Test
    public void testRemoveClass() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " class1  class2 class3 ");
        el.removeClass("class2");
        assertEquals("class1 class3", el.className());
        assertTrue(el.hasClass("class1"));
        assertFalse(el.hasClass("class2"));
        assertTrue(el.hasClass("class3"));
        el.removeClass("nonexistent"); // remove nonexistent
        assertEquals("class1 class3", el.className());
    }

    @Test
    public void testToggleClass_add() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.toggleClass("class1");
        assertEquals("class1", el.className());
    }

    @Test
    public void testToggleClass_remove() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", "class1");
        el.toggleClass("class1");
        assertEquals("", el.className());
    }

    @Test
    public void testVal_textarea() {
        Element el = new Element(Tag.valueOf("textarea"), "http://example.com");
        el.text("textarea content");
        assertEquals("textarea content", el.val());
    }

    @Test
    public void testVal_input() {
        Element el = new Element(Tag.valueOf("input"), "http://example.com");
        el.attr("value", "input value");
        assertEquals("input value", el.val());
    }

    @Test
    public void testVal_input_noValueAttr() {
        Element el = new Element(Tag.valueOf("input"), "http://example.com");
        assertEquals("", el.val());
    }

    @Test
    public void testHtml_empty() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.html());
    }

    @Test
    public void testHtml_withChildren() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        el.appendChild(new TextNode("text", "http://example.com"));
        assertEquals("<p></p>text", el.html());
    }

    @Test
    public void testHtml_nested() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.append("<p><span></span></p>");
        assertEquals("<p><span></span></p>", el.html());
    }

    @Test
    public void testHtml_set() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.html("<h1>Title</h1><p>Content</p>");
        assertEquals("<h1>Title</h1><p>Content</p>", el.html());
        assertEquals(2, el.children().size());
        assertEquals("h1", el.child(0).tagName());
        assertEquals("p", el.child(1).tagName());
    }

    @Test
    public void testOuterHtml() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("id", "outer");
        el.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        assertEquals("<div id=\"outer\"><p></p></div>", el.outerHtml());
    }

    @Test
    public void testToString() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("id", "outer");
        el.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        assertEquals("<div id=\"outer\"><p></p></div>", el.toString());
    }

    @Test
    public void testEquals_sameObject() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(el.equals(el));
    }

    @Test
    public void testEquals_differentObjectSameContent() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        el1.attr("id", "test");
        Element el2 = new Element(Tag.valueOf("div"), "http://example.com");
        el2.attr("id", "test");
        // In Jsoup, equals is based on tag and attributes for Elements, not content.
        // The reference source provided does not deep compare child nodes.
        assertTrue(el1.equals(el2));
    }

    @Test
    public void testEquals_differentTag() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        assertFalse(el1.equals(el2));
    }

    @Test
    public void testHashCode() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        el1.attr("id", "test");
        Element el2 = new Element(Tag.valueOf("div"), "http://example.com");
        el2.attr("id", "test");
        assertEquals(el1.hashCode(), el2.hashCode());
    }

    @Test
    public void testHashCode_different() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        assertFalse(el1.hashCode() == el2.hashCode());
    }

    @Test
    public void testParse_simpleHtml() {
        Document doc = Parser.parse("<div>Hello</div>", "http://example.com");
        Element body = doc.body();
        assertEquals("Hello", body.text());
        assertEquals("div", body.child(0).tagName());
    }

    @Test
    public void testParseBodyFragment_simpleHtml() {
        Document doc = Parser.parseBodyFragment("<p>Fragment</p>", "http://example.com");
        Element body = doc.body();
        assertEquals("Fragment", body.text());
        assertEquals("p", body.child(0).tagName());
    }

    @Test
    public void testParseBodyFragmentRelaxed_simpleHtml() {
        Document doc = Parser.parseBodyFragmentRelaxed("<span>Relaxed</span>", "http://example.com");
        Element body = doc.body();
        assertEquals("Relaxed", body.text());
        assertEquals("span", body.child(0).tagName());
    }

    @Test
    public void testTagValueOf() {
        Tag pTag = Tag.valueOf("p");
        assertEquals("p", pTag.getName());
        Tag divTag = Tag.valueOf("DIV"); // case insensitive
        assertEquals("div", divTag.getName());
    }

    @Test
    public void testTagValueOf_unknownTag() {
        Tag unknown = Tag.valueOf("foobar");
        assertEquals("foobar", unknown.getName());
        // By default, unknown tags are treated as inline and can contain blocks.
        assertFalse(unknown.isBlock());
        assertTrue(unknown.canContainBlock());
    }

    // Tests that use protected/package-private methods of Tag are removed as they are not part of public API for testing.
    // The following tests were removed:
    // testCanContainBlock, testEmptyElementSelfClosing, testEmptyElementNotSelfClosing,
    // testPreserveWhitespace, testDataTag, testTagCanContain, testTagRequiresSpecificParent,
    // testTagIsValidParent, testTagIsValidAncestor

    @Test
    public void testEmptyElement() {
        Element el = new Element(Tag.valueOf("img"), "http://example.com");
        el.attr("src", "test.jpg");
        // The structure of empty tags in HTML output is typically self-closing.
        assertEquals("<img src=\"test.jpg\" />", el.outerHtml());
    }

    @Test
    public void testPreserveWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), "http://example.com");
        pre.appendChild(new TextNode("  line1\n  line2  ", "http://example.com"));
        // The text() method normalizes whitespace, so it will strip leading/trailing,
        // and collapse internal whitespace.
        assertEquals("line1\nline2", pre.text()); 
        // The outerHtml should preserve the original whitespace for <pre> tag.
        assertEquals("<pre>  line1\n  line2  </pre>", pre.outerHtml());
    }

    @Test
    public void testDataTag() {
        Element script = new Element(Tag.valueOf("script"), "http://example.com");
        script.appendChild(new DataNode("console.log('hello');", "http://example.com"));
        assertEquals("console.log('hello');", script.data());
        // Data nodes are not rendered as HTML content within the element's html() output.
        assertEquals("", script.html());
        // The data is part of the outerHtml, but not as a direct child's html().
        // The outerHtml of script with a DataNode inside is just the script tags.
        // If the DataNode had content, it would be rendered as text content of the script tag
        // but not via the `html()` method which only deals with child *Elements*.
        assertEquals("<script></script>", script.outerHtml());
    }
}
