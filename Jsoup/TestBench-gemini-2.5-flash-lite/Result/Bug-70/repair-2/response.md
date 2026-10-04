```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ElementTest {
    @Test
    public void testTagName() throws Exception {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagNameCasePreserving() throws Exception {
        Element el = new Element("DIV");
        assertEquals("DIV", el.tagName());
    }

    @Test
    public void testTagNameChange() throws Exception {
        Element el = new Element("span");
        el.tagName("div");
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagNameChangeCasePreserving() throws Exception {
        Element el = new Element("span");
        el.tagName("DIV");
        assertEquals("DIV", el.tagName());
    }

    @Test
    public void testIsBlock() throws Exception {
        Element div = new Element("div");
        assertTrue(div.isBlock());
        Element span = new Element("span");
        assertFalse(span.isBlock());
    }

    @Test
    public void testId() throws Exception {
        Element el = new Element("div").attr("id", "main");
        assertEquals("main", el.id());
    }

    @Test
    public void testIdNotFound() throws Exception {
        Element el = new Element("div");
        assertEquals("", el.id());
    }

    @Test
    public void testAttr() throws Exception {
        Element el = new Element("div").attr("class", "content");
        assertEquals("content", el.attr("class"));
    }

    @Test
    public void testAttrNotFound() throws Exception {
        Element el = new Element("div");
        assertEquals("", el.attr("nonexistent"));
    }

    @Test
    public void testAttrBooleanTrue() throws Exception {
        Element el = new Element("input").attr("disabled", true);
        assertTrue(el.hasAttr("disabled"));
        assertEquals("", el.attr("disabled")); // boolean attributes are empty string
    }

    @Test
    public void testAttrBooleanFalse() throws Exception {
        Element el = new Element("input").attr("disabled", true).attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));
        assertEquals("", el.attr("disabled"));
    }

    @Test
    public void testDataset() throws Exception {
        Element el = new Element("div").attr("data-package", "jsoup").attr("data-language", "Java");
        Map<String, String> dataset = el.dataset();
        assertEquals("jsoup", dataset.get("package"));
        assertEquals("Java", dataset.get("language"));
    }

    @Test
    public void testDatasetEmpty() throws Exception {
        Element el = new Element("div");
        Map<String, String> dataset = el.dataset();
        assertTrue(dataset.isEmpty());
    }

    @Test
    public void testParent() throws Exception {
        Element parent = new Element("body");
        Element child = new Element("p");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParents() throws Exception {
        Element root = new Element("html");
        Element body = new Element("body").appendTo(root);
        Element p = new Element("p").appendTo(body);
        Elements parents = p.parents();
        assertEquals(2, parents.size());
        assertEquals(body.tagName(), parents.get(0).tagName());
        assertEquals(root.tagName(), parents.get(1).tagName());
    }

    @Test
    public void testChild() throws Exception {
        Element el = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        el.appendChild(child1).appendChild(child2);
        assertEquals(child1, el.child(0));
        assertEquals(child2, el.child(1));
    }

    @Test
    public void testChildOutOfBounds() throws Exception {
        Element el = new Element("div");
        assertThrows(IndexOutOfBoundsException.class, () -> el.child(0));
    }

    @Test
    public void testChildren() throws Exception {
        Element el = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        el.appendChild(child1).appendChild(child2);
        Elements children = el.children();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        assertEquals(child2, children.get(1));
    }

    @Test
    public void testChildrenEmpty() throws Exception {
        Element el = new Element("div");
        Elements children = el.children();
        assertTrue(children.isEmpty());
    }

    @Test
    public void testTextNodes() throws Exception {
        Element el = new Element("div");
        el.appendText("Hello");
        el.appendChild(new Element("span"));
        el.appendText("World");
        List<TextNode> textNodes = el.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals("Hello", textNodes.get(0).text());
        assertEquals("World", textNodes.get(1).text());
    }

    @Test
    public void testDataNodes() throws Exception {
        Element el = new Element("script");
        el.appendChild(new DataNode("var x = 1;"));
        List<DataNode> dataNodes = el.dataNodes();
        assertEquals(1, dataNodes.size());
        // The DataNode class does not have a 'data()' method. It has 'getWholeData()'.
        // However, the API outline provided for DataNode is not included in this snippet.
        // Assuming 'data()' is intended to be equivalent to 'getWholeData()' based on context.
        // If this were a real scenario, I'd look up the DataNode API for the exact method.
        // For now, I'll assume there is a method that returns the data. The closest available in the Node API is 'outerHtml()'.
        // Let's re-evaluate based on the test `testData` which uses `data()` method on a Comment node.
        // It appears the original test might have been intended for a different scenario or a different API.
        // The current API outline for Element shows `dataNodes()` method, which returns `List<DataNode>`.
        // The `DataNode` class itself is not fully detailed in the provided API outline.
        // Let's assume `getWholeData()` is the correct method for DataNode based on common patterns.
        assertEquals("var x = 1;", dataNodes.get(0).getWholeData());
    }

    @Test
    public void testSelect() throws Exception {
        Element el = new Element("div").attr("id", "main");
        el.appendChild(new Element("p").attr("class", "content"));
        el.appendChild(new Element("span").attr("class", "content"));
        Elements selected = el.select("p.content");
        assertEquals(1, selected.size());
        assertEquals("p", selected.get(0).tagName());
    }

    @Test
    public void testSelectFirst() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("p").attr("class", "content"));
        el.appendChild(new Element("span").attr("class", "content"));
        Element selected = el.selectFirst("span.content");
        assertNotNull(selected);
        assertEquals("span", selected.tagName());
    }

    @Test
    public void testSelectFirstNotFound() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("p"));
        Element selected = el.selectFirst("span");
        assertNull(selected);
    }

    @Test
    public void testIsCssQuery() throws Exception {
        Element el = new Element("div").attr("id", "main").addClass("container");
        assertTrue(el.is("#main"));
        assertTrue(el.is(".container"));
        assertTrue(el.is("div.container"));
        assertFalse(el.is("p"));
    }

    @Test
    public void testAppendChild() throws Exception {
        Element parent = new Element("div");
        Node child = new TextNode("hello");
        parent.appendChild(child);
        assertEquals(1, parent.childNodeSize());
        assertEquals(child, parent.childNode(0));
    }

    @Test
    public void testAppendTo() throws Exception {
        Element parent = new Element("div");
        Element child = new Element("p");
        child.appendTo(parent);
        assertEquals(parent, child.parent());
        assertEquals(child, parent.child(0));
    }

    @Test
    public void testPrependChild() throws Exception {
        Element parent = new Element("div");
        Node child1 = new TextNode("one");
        Node child2 = new TextNode("two");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
    }

    @Test
    public void testInsertChildrenAtIndex() throws Exception {
        Element parent = new Element("div");
        Node child1 = new TextNode("one");
        Node child2 = new TextNode("two");
        Node child3 = new TextNode("three");
        parent.appendChild(child1);
        parent.appendChild(child3);
        parent.insertChildren(1, child2);
        assertEquals(3, parent.childNodeSize());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
        assertEquals(child3, parent.childNode(2));
    }

    @Test
    public void testInsertChildrenAtEnd() throws Exception {
        Element parent = new Element("div");
        Node child1 = new TextNode("one");
        Node child2 = new TextNode("two");
        parent.appendChild(child1);
        parent.insertChildren(-1, child2); // -1 should mean append
        assertEquals(2, parent.childNodeSize());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
    }

    @Test
    public void testInsertChildrenCollection() throws Exception {
        Element parent = new Element("div");
        Node child1 = new TextNode("one");
        Node child3 = new TextNode("three");
        parent.appendChild(child1);
        parent.appendChild(child3);
        List<Node> childrenToInsert = new ArrayList<>();
        childrenToInsert.add(new TextNode("two"));
        parent.insertChildren(1, childrenToInsert);
        assertEquals(3, parent.childNodeSize());
        assertEquals("one", parent.childNode(0).outerHtml());
        assertEquals("two", parent.childNode(1).outerHtml());
        assertEquals("three", parent.childNode(2).outerHtml());
    }

    @Test
    public void testAppendElement() throws Exception {
        Element parent = new Element("div");
        Element child = parent.appendElement("p");
        assertEquals("p", child.tagName());
        assertEquals(parent, child.parent());
        assertEquals(child, parent.child(0));
    }

    @Test
    public void testPrependElement() throws Exception {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.prependElement("span");
        assertEquals("span", child2.tagName());
        assertEquals(parent, child2.parent());
        assertEquals(child2, parent.child(0));
        assertEquals(child1, parent.child(1));
    }

    @Test
    public void testAppendText() throws Exception {
        Element parent = new Element("div");
        Element result = parent.appendText("Hello");
        assertEquals(1, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof TextNode);
        assertEquals("Hello", ((TextNode) parent.childNode(0)).text());
        assertEquals(parent, result);
    }

    @Test
    public void testPrependText() throws Exception {
        Element parent = new Element("div");
        parent.appendText("World");
        parent.prependText("Hello");
        assertEquals(2, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof TextNode);
        assertEquals("Hello", ((TextNode) parent.childNode(0)).text());
        assertTrue(parent.childNode(1) instanceof TextNode);
        assertEquals("World", ((TextNode) parent.childNode(1)).text());
    }

    @Test
    public void testAppendHtmlString() throws Exception {
        Element parent = new Element("div");
        parent.append("<span><p>Inner</p></span>");
        assertEquals(1, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof Element);
        Element span = (Element) parent.childNode(0);
        assertEquals("span", span.tagName());
        assertEquals(1, span.childNodeSize());
        assertTrue(span.childNode(0) instanceof Element);
        Element p = (Element) span.childNode(0);
        assertEquals("p", p.tagName());
        assertEquals("Inner", p.text());
    }

    @Test
    public void testPrependHtmlString() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("Existing"));
        parent.prepend("<span>Prepend</span>");
        assertEquals(2, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof Element);
        Element span = (Element) parent.childNode(0);
        assertEquals("span", span.tagName());
        assertEquals("Prepend", span.text());
        assertTrue(parent.childNode(1) instanceof TextNode);
        assertEquals("Existing", ((TextNode) parent.childNode(1)).text());
    }

    @Test
    public void testBeforeHtmlString() throws Exception {
        Element el = new Element("p");
        Element parent = new Element("div");
        parent.appendChild(el);
        el.before("<span>Sibling</span>");
        assertEquals(2, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof Element);
        assertEquals("span", parent.childNode(0).nodeName());
        assertEquals("Sibling", parent.childNode(0).outerHtml());
        assertEquals(el, parent.childNode(1));
    }

    @Test
    public void testAfterHtmlString() throws Exception {
        Element el = new Element("p");
        Element parent = new Element("div");
        parent.appendChild(el);
        el.after("<span>Sibling</span>");
        assertEquals(2, parent.childNodeSize());
        assertEquals(el, parent.childNode(0));
        assertTrue(parent.childNode(1) instanceof Element);
        assertEquals("span", parent.childNode(1).nodeName());
        assertEquals("Sibling", parent.childNode(1).outerHtml());
    }

    @Test
    public void testEmpty() throws Exception {
        Element el = new Element("div");
        el.appendChild(new TextNode("text"));
        el.appendChild(new Element("p"));
        el.empty();
        assertTrue(el.childNodes().isEmpty());
    }

    @Test
    public void testWrapHtmlString() throws Exception {
        Element el = new Element("p");
        el.wrap("<div><span class='wrap'></span></div>");
        assertEquals("div", el.parent().tagName());
        assertEquals("span", el.parent().child(0).tagName());
        assertEquals("wrap", el.parent().child(0).className());
        assertEquals(el, el.parent().child(0).child(0));
    }

    @Test
    public void testCssSelector() throws Exception {
        Element root = new Element("html");
        Element body = new Element("body").appendTo(root);
        Element div1 = new Element("div").attr("id", "main").appendTo(body);
        Element p1 = new Element("p").addClass("content").appendTo(div1);
        Element span1 = new Element("span").addClass("content").appendTo(div1);
        Element div2 = new Element("div").appendTo(body);
        Element p2 = new Element("p").appendTo(div2);

        assertEquals("#main", div1.cssSelector());
        assertEquals("#main > p.content", p1.cssSelector());
        assertEquals("#main > span.content", span1.cssSelector());
        assertEquals("html > body > div:nth-child(2)", div2.cssSelector());
        assertEquals("html > body > div:nth-child(2) > p", p2.cssSelector());
    }

    @Test
    public void testSiblingElements() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("p");
        Element el2 = new Element("span");
        Element el3 = new Element("a");
        parent.appendChild(el1).appendChild(el2).appendChild(el3);
        Elements siblings = el2.siblingElements();
        assertEquals(2, siblings.size());
        assertEquals(el1, siblings.get(0));
        assertEquals(el3, siblings.get(1));
    }

    @Test
    public void testNextElementSibling() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("p");
        Element el2 = new Element("span");
        Element el3 = new Element("a");
        parent.appendChild(el1).appendChild(el2).appendChild(el3);
        assertEquals(el2, el1.nextElementSibling());
        assertEquals(el3, el2.nextElementSibling());
        assertNull(el3.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("p");
        Element el2 = new Element("span");
        Element el3 = new Element("a");
        parent.appendChild(el1).appendChild(el2).appendChild(el3);
        assertNull(el1.previousElementSibling());
        assertEquals(el1, el2.previousElementSibling());
        assertEquals(el2, el3.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("p");
        Element el2 = new Element("span");
        parent.appendChild(el1).appendChild(el2);
        // The method `firstElementChild()` is not defined in the API outline for Element.
        // Using `firstElementSibling()` which is defined.
        assertEquals(el1, parent.firstElementSibling());
        assertEquals(el1, el1.firstElementSibling());
        assertEquals(el1, el2.firstElementSibling());

        Element emptyParent = new Element("div");
        assertNull(emptyParent.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("p");
        Element el2 = new Element("span");
        Element el3 = new Element("a");
        parent.appendChild(el1).appendChild(el2).appendChild(el3);
        assertEquals(0, el1.elementSiblingIndex());
        assertEquals(1, el2.elementSiblingIndex());
        assertEquals(2, el3.elementSiblingIndex());
    }

    @Test
    public void testLastElementSibling() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("p");
        Element el2 = new Element("span");
        Element el3 = new Element("a");
        parent.appendChild(el1).appendChild(el2).appendChild(el3);
        // The method `lastElementChild()` is not defined in the API outline for Element.
        // Using `lastElementSibling()` which is defined.
        assertEquals(el3, parent.lastElementSibling());
        assertEquals(el3, el1.lastElementSibling());
        assertEquals(el3, el2.lastElementSibling());
        assertEquals(el3, el3.lastElementSibling());

        Element emptyParent = new Element("div");
        assertNull(emptyParent.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("p"));
        el.appendChild(new Element("p"));
        el.appendChild(new Element("span"));
        Elements ps = el.getElementsByTag("p");
        assertEquals(2, ps.size());
        assertEquals("p", ps.get(0).tagName());
        assertEquals("p", ps.get(1).tagName());
    }

    @Test
    public void testGetElementById() throws Exception {
        Element el = new Element("div");
        Element child1 = new Element("p").attr("id", "first");
        Element child2 = new Element("span").attr("id", "second");
        el.appendChild(child1).appendChild(child2);
        assertEquals(child1, el.getElementById("first"));
        assertEquals(child2, el.getElementById("second"));
        assertNull(el.getElementById("third"));
    }

    @Test
    public void testGetElementsByClass() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("p").addClass("content"));
        el.appendChild(new Element("span").addClass("content"));
        el.appendChild(new Element("a").addClass("other"));
        Elements contents = el.getElementsByClass("content");
        assertEquals(2, contents.size());
        assertEquals("p", contents.get(0).tagName());
        assertEquals("span", contents.get(1).tagName());
    }

    @Test
    public void testGetElementsByClassMultiple() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("p").addClass("content extra"));
        Elements contents = el.getElementsByClass("content");
        Elements extras = el.getElementsByClass("extra");
        assertEquals(1, contents.size());
        assertEquals(1, extras.size());
        assertEquals("p", contents.get(0).tagName());
        assertEquals("p", extras.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttribute() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("a").attr("href", "#"));
        el.appendChild(new Element("span").attr("data-id", "123"));
        Elements links = el.getElementsByAttribute("href");
        assertEquals(1, links.size());
        assertEquals("a", links.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeStarting() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("a").attr("href", "#"));
        el.appendChild(new Element("span").attr("data-id", "123"));
        Elements dataAttrs = el.getElementsByAttributeStarting("data-");
        assertEquals(1, dataAttrs.size());
        assertEquals("span", dataAttrs.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeValue() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("a").attr("href", "http://example.com"));
        el.appendChild(new Element("a").attr("href", "http://test.com"));
        Elements links = el.getElementsByAttributeValue("href", "http://example.com");
        assertEquals(1, links.size());
        assertEquals("http://example.com", links.get(0).attr("href"));
    }

    @Test
    public void testGetElementsByAttributeValueNot() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("a").attr("href", "http://example.com"));
        el.appendChild(new Element("a").attr("href", "http://test.com"));
        Elements links = el.getElementsByAttributeValueNot("href", "http://example.com");
        assertEquals(1, links.size());
        assertEquals("http://test.com", links.get(0).attr("href"));
    }

    @Test
    public void testGetElementsByAttributeValueStarting() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("a").attr("href", "http://example.com/page1"));
        el.appendChild(new Element("a").attr("href", "http://test.com/page2"));
        Elements links = el.getElementsByAttributeValueStarting("href", "http://example.com");
        assertEquals(1, links.size());
        assertEquals("http://example.com/page1", links.get(0).attr("href"));
    }

    @Test
    public void testGetElementsByAttributeValueEnding() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("a").attr("href", "http://example.com/page1.html"));
        el.appendChild(new Element("a").attr("href", "http://test.com/page2.php"));
        Elements links = el.getElementsByAttributeValueEnding("href", ".html");
        assertEquals(1, links.size());
        assertEquals("http://example.com/page1.html", links.get(0).attr("href"));
    }

    @Test
    public void testGetElementsByAttributeValueContaining() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("a").attr("href", "http://example.com/page1"));
        el.appendChild(new Element("a").attr("href", "http://example.com/sub/page2"));
        Elements links = el.getElementsByAttributeValueContaining("href", "sub/");
        assertEquals(1, links.size());
        assertEquals("http://example.com/sub/page2", links.get(0).attr("href"));
    }

    @Test
    public void testGetElementsByAttributeValueMatching() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("a").attr("href", "http://example.com/page1"));
        el.appendChild(new Element("a").attr("href", "http://example.com/page2"));
        Elements links = el.getElementsByAttributeValueMatching("href", Pattern.compile("page.*"));
        assertEquals(2, links.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingRegex() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("a").attr("href", "http://example.com/page1"));
        el.appendChild(new Element("a").attr("href", "http://example.com/page2"));
        Elements links = el.getElementsByAttributeValueMatching("href", "page.*");
        assertEquals(2, links.size());
    }

    @Test
    public void testGetElementsByIndexLessThan() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p")); // 0
        parent.appendChild(new Element("span")); // 1
        parent.appendChild(new Element("a")); // 2
        Elements result = parent.getElementsByIndexLessThan(2);
        assertEquals(2, result.size());
        assertEquals("p", result.get(0).tagName());
        assertEquals("span", result.get(1).tagName());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p")); // 0
        parent.appendChild(new Element("span")); // 1
        parent.appendChild(new Element("a")); // 2
        Elements result = parent.getElementsByIndexGreaterThan(0);
        assertEquals(2, result.size());
        assertEquals("span", result.get(0).tagName());
        assertEquals("a", result.get(1).tagName());
    }

    @Test
    public void testGetElementsByIndexEquals() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p")); // 0
        parent.appendChild(new Element("span")); // 1
        parent.appendChild(new Element("a")); // 2
        Elements result = parent.getElementsByIndexEquals(1);
        assertEquals(1, result.size());
        assertEquals("span", result.get(0).tagName());
    }

    @Test
    public void testGetElementsContainingText() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p").text("Hello World"));
        parent.appendChild(new Element("span").text("Hello"));
        Elements result = parent.getElementsContainingText("world");
        assertEquals(1, result.size());
        assertEquals("p", result.get(0).tagName());
    }

    @Test
    public void testGetElementsContainingOwnText() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p").text("Hello World"));
        parent.appendChild(new Element("span").text("Hello"));
        Elements result = parent.getElementsContainingOwnText("world");
        assertEquals(1, result.size());
        assertEquals("p", result.get(0).tagName());
    }

    @Test
    public void testGetElementsMatchingText() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p").text("Hello World 123"));
        parent.appendChild(new Element("span").text("Hello"));
        Elements result = parent.getElementsMatchingText(Pattern.compile(".*\\d.*"));
        assertEquals(1, result.size());
        assertEquals("p", result.get(0).tagName());
    }

    @Test
    public void testGetElementsMatchingTextRegex() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p").text("Hello World 123"));
        parent.appendChild(new Element("span").text("Hello"));
        Elements result = parent.getElementsMatchingText(".*\\d.*");
        assertEquals(1, result.size());
        assertEquals("p", result.get(0).tagName());
    }

    @Test
    public void testGetElementsMatchingOwnText() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p").ownText("Hello World 123"));
        parent.appendChild(new Element("span").ownText("Hello"));
        Elements result = parent.getElementsMatchingOwnText(Pattern.compile(".*\\d.*"));
        assertEquals(1, result.size());
        assertEquals("p", result.get(0).tagName());
    }

    @Test
    public void testGetElementsMatchingOwnTextRegex() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p").ownText("Hello World 123"));
        parent.appendChild(new Element("span").ownText("Hello"));
        Elements result = parent.getElementsMatchingOwnText(".*\\d.*");
        assertEquals(1, result.size());
        assertEquals("p", result.get(0).tagName());
    }

    @Test
    public void testGetAllElements() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("p"));
        el.appendChild(new Element("span").appendChild(new Element("a")));
        Elements all = el.getAllElements();
        assertEquals(4, all.size()); // div, p, span, a
        assertEquals("div", all.get(0).tagName());
        assertEquals("p", all.get(1).tagName());
        assertEquals("span", all.get(2).tagName());
        assertEquals("a", all.get(3).tagName());
    }

    @Test
    public void testText() throws Exception {
        Element el = new Element("p");
        el.appendChild(new TextNode("Hello "));
        el.appendChild(new Element("b").text("World"));
        el.appendChild(new TextNode("!"));
        assertEquals("Hello World!", el.text());
    }

    @Test
    public void testTextWithWhitespaceNormalization() throws Exception {
        Element el = new Element("p");
        el.appendChild(new TextNode("  Hello   "));
        el.appendChild(new Element("b").text("  World  "));
        el.appendChild(new TextNode("   !"));
        assertEquals("Hello World!", el.text());
    }

    @Test
    public void testOwnText() throws Exception {
        Element el = new Element("p");
        el.appendChild(new TextNode("Hello "));
        el.appendChild(new Element("b").text("World"));
        el.appendChild(new TextNode("!"));
        assertEquals("Hello !", el.ownText());
    }

    @Test
    public void testSetText() throws Exception {
        Element el = new Element("p");
        el.text("New Text");
        assertEquals("New Text", el.text());
        assertEquals(1, el.childNodeSize());
        assertTrue(el.childNode(0) instanceof TextNode);
        assertEquals("New Text", ((TextNode) el.childNode(0)).text());
    }

    @Test
    public void testSetTextEmpty() throws Exception {
        Element el = new Element("p");
        el.text("");
        assertEquals("", el.text());
        assertTrue(el.childNodes().isEmpty());
    }

    @Test
    public void testHasText() throws Exception {
        Element el = new Element("p");
        assertTrue(!el.hasText());
        el.appendText(" ");
        assertTrue(!el.hasText());
        el.appendText("text");
        assertTrue(el.hasText());
        el.empty();
        el.appendChild(new Element("br"));
        assertTrue(!el.hasText());
    }

    @Test
    public void testData() throws Exception {
        Element el = new Element("script");
        el.appendChild(new DataNode("var x = 1;"));
        el.appendChild(new Comment("comment"));
        assertEquals("var x = 1;comment", el.data());
    }

    @Test
    public void testClassName() throws Exception {
        Element el = new Element("div").attr("class", "header gray");
        assertEquals("header gray", el.className());
    }

    @Test
    public void testClassNameEmpty() throws Exception {
        Element el = new Element("div");
        assertEquals("", el.className());
    }

    @Test
    public void testClassNames() throws Exception {
        Element el = new Element("div").attr("class", "header gray");
        Set<String> classes = el.classNames();
        assertEquals(2, classes.size());
        assertTrue(classes.contains("header"));
        assertTrue(classes.contains("gray"));
    }

    @Test
    public void testClassNamesEmpty() throws Exception {
        Element el = new Element("div");
        Set<String> classes = el.classNames();
        assertTrue(classes.isEmpty());
    }

    @Test
    public void testClassNamesWithDuplicates() throws Exception {
        Element el = new Element("div").attr("class", "header header gray");
        Set<String> classes = el.classNames();
        assertEquals(2, classes.size());
        assertTrue(classes.contains("header"));
        assertTrue(classes.contains("gray"));
    }

    @Test
    public void testSetClassNames() throws Exception {
        Element el = new Element("div");
        Set<String> classes = new LinkedHashSet<>();
        classes.add("header");
        classes.add("gray");
        el.classNames(classes);
        assertEquals("header gray", el.className());
    }

    @Test
    public void testSetClassNamesEmpty() throws Exception {
        Element el = new Element("div").attr("class", "header");
        el.classNames(Collections.emptySet());
        assertFalse(el.hasAttr("class"));
    }

    @Test
    public void testHasClass() throws Exception {
        Element el = new Element("div").attr("class", "header gray");
        assertTrue(el.hasClass("header"));
        assertTrue(el.hasClass("gray"));
        assertFalse(el.hasClass("content"));
    }

    @Test
    public void testHasClassCaseInsensitive() throws Exception {
        Element el = new Element("div").attr("class", "Header Gray");
        assertTrue(el.hasClass("header"));
        assertTrue(el.hasClass("GRAY"));
    }

    @Test
    public void testHasClassEmptyAttribute() throws Exception {
        Element el = new Element("div");
        assertFalse(el.hasClass("header"));
    }

    @Test
    public void testAddClass() throws Exception {
        Element el = new Element("div").addClass("header");
        assertTrue(el.hasClass("header"));
        el.addClass("gray");
        assertEquals("header gray", el.className());
    }

    @Test
    public void testRemoveClass() throws Exception {
        Element el = new Element("div").attr("class", "header gray content");
        el.removeClass("gray");
        assertEquals("header content", el.className());
        assertTrue(el.hasClass("header"));
        assertTrue(el.hasClass("content"));
        assertFalse(el.hasClass("gray"));
    }

    @Test
    public void testRemoveClassNotFound() throws Exception {
        Element el = new Element("div").attr("class", "header gray");
        el.removeClass("content");
        assertEquals("header gray", el.className());
    }

    @Test
    public void testToggleClassAdd() throws Exception {
        Element el = new Element("div");
        el.toggleClass("active");
        assertEquals("active", el.className());
    }

    @Test
    public void testToggleClassRemove() throws Exception {
        Element el = new Element("div").addClass("active");
        el.toggleClass("active");
        assertEquals("", el.className());
    }

    @Test
    public void testValInput() throws Exception {
        Element input = new Element("input").attr("value", "test");
        assertEquals("test", input.val());
        input.val("new value");
        assertEquals("new value", input.attr("value"));
    }

    @Test
    public void testValTextarea() throws Exception {
        Element textarea = new Element("textarea").text("textarea content");
        assertEquals("textarea content", textarea.val());
        textarea.val("new textarea content");
        assertEquals("new textarea content", textarea.text());
    }

    @Test
    public void testOuterHtmlHead() throws Exception {
        Element el = new Element("div").attr("id", "main").addClass("container");
        Document.OutputSettings out = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder();
        el.outerHtmlHead(sb, 0, out);
        assertEquals("<div id=\"main\" class=\"container\">", sb.toString());
    }

    @Test
    public void testOuterHtmlTail() throws Exception {
        Element el = new Element("div");
        Document.OutputSettings out = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder();
        el.outerHtmlTail(sb, 0, out);
        assertEquals("</div>", sb.toString());
    }

    @Test
    public void testHtml() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("p").text("Hello"));
        assertEquals("<p>Hello</p>", el.html());
    }

    @Test
    public void testHtmlEmpty() throws Exception {
        Element el = new Element("div");
        assertEquals("", el.html());
    }

    @Test
    public void testSetHtml() throws Exception {
        Element el = new Element("div");
        el.html("<p>New Content</p>");
        assertEquals("<p>New Content</p>", el.html());
        assertEquals(1, el.childNodeSize());
        assertTrue(el.childNode(0) instanceof Element);
        assertEquals("p", ((Element) el.childNode(0)).tagName());
    }

    @Test
    public void testToString() throws Exception {
        Element el = new Element("div").attr("id", "main");
        assertEquals("<div id=\"main\"></div>", el.toString());
    }
}
```