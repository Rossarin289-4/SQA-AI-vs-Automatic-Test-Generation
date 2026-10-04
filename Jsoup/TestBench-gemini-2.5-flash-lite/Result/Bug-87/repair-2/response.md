```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Tag;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
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
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import java.io.Reader;
import java.io.StringReader;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DocumentType;
import org.jsoup.internal.Normalizer;
import java.util.HashMap;
// Removed imports for non-public classes: HtmlTreeBuilderState and Token

public class ElementTest {

    @Test
    public void testTagName() {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagNameWithParseSettings() {
        Element el = new Element(Tag.valueOf("DIV", ParseSettings.preserveCase), "http://example.com");
        assertEquals("DIV", el.tagName());
    }

    @Test
    public void testNormalName() {
        Element el = new Element("Div");
        assertEquals("div", el.normalName());
    }

    @Test
    public void testTagNameMethod() {
        Element el = new Element("span");
        el.tagName("div");
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagNameMethodPreservesCase() {
        Element el = new Element(Tag.valueOf("SPAN", ParseSettings.preserveCase), "http://example.com");
        el.tagName("DIV");
        assertEquals("DIV", el.tagName());
    }

    @Test
    public void testTag() {
        Element el = new Element("p");
        assertEquals("p", el.tag().getName());
    }

    @Test
    public void testIsBlock() {
        Element div = new Element("div");
        assertTrue(div.isBlock());
        Element span = new Element("span");
        assertFalse(span.isBlock());
    }

    @Test
    public void testId() {
        Element el = new Element("div");
        el.attr("id", "myId");
        assertEquals("myId", el.id());
    }

    @Test
    public void testIdNotPresent() {
        Element el = new Element("div");
        assertEquals("", el.id());
    }

    @Test
    public void testAttrStringString() {
        Element el = new Element("div");
        el.attr("key", "value");
        assertEquals("value", el.attr("key"));
    }

    @Test
    public void testAttrStringBooleanTrue() {
        Element el = new Element("input");
        el.attr("disabled", true);
        assertTrue(el.hasAttr("disabled"));
        assertEquals("", el.attr("disabled")); // boolean attributes have empty value
    }

    @Test
    public void testAttrStringBooleanFalse() {
        Element el = new Element("input");
        el.attr("disabled", true);
        el.attr("disabled", false);
        assertFalse(el.hasAttr("disabled"));
    }

    @Test
    public void testDataset() {
        Element el = new Element("div");
        el.attr("data-foo", "bar");
        el.attr("data-baz", "qux");
        Map<String, String> dataset = el.dataset();
        assertEquals("bar", dataset.get("foo"));
        assertEquals("qux", dataset.get("baz"));
    }

    @Test
    public void testDatasetEmpty() {
        Element el = new Element("div");
        Map<String, String> dataset = el.dataset();
        assertTrue(dataset.isEmpty());
    }

    @Test
    public void testParent() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParents() {
        Element grandparent = new Element("div");
        Element parent = new Element("div");
        Element child = new Element("p");
        grandparent.appendChild(parent);
        parent.appendChild(child);

        Elements parents = child.parents();
        assertEquals(2, parents.size());
        assertEquals(parent, parents.get(0));
        assertEquals(grandparent, parents.get(1));
    }
    
    @Test
    public void testChild() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p"));
        parent.child(1);
    }

    @Test
    public void testChildren() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        Elements children = parent.children();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        assertEquals(child2, children.get(1));
    }

    @Test
    public void testChildrenEmpty() {
        Element parent = new Element("div");
        Elements children = parent.children();
        assertEquals(0, children.size());
    }

    @Test
    public void testTextNodes() {
        Element parent = new Element("p");
        parent.appendChild(new TextNode("Hello"));
        parent.appendChild(new Element("b"));
        parent.appendChild(new TextNode("World"));
        List<TextNode> textNodes = parent.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals("Hello", textNodes.get(0).text());
        assertEquals("World", textNodes.get(1).text());
    }
    
    @Test
    public void testDataNodes() {
        Element parent = new Element("script");
        parent.appendChild(new DataNode("var x = 1;"));
        parent.appendChild(new Element("p"));
        parent.appendChild(new DataNode("var y = 2;"));
        List<DataNode> dataNodes = parent.dataNodes();
        assertEquals(2, dataNodes.size());
        assertEquals("var x = 1;", dataNodes.get(0).getWholeData());
        assertEquals("var y = 2;", dataNodes.get(1).getWholeData());
    }

    @Test
    public void testSelect() {
        Element parent = new Element("div");
        Element child1 = new Element("p").attr("class", "first");
        Element child2 = new Element("p").attr("class", "second");
        parent.appendChild(child1);
        parent.appendChild(child2);
        Elements selected = parent.select("p.first");
        assertEquals(1, selected.size());
        assertEquals(child1, selected.get(0));
    }
    
    @Test
    public void testSelectNoMatch() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p"));
        Elements selected = parent.select("span");
        assertTrue(selected.isEmpty());
    }

    @Test
    public void testSelectFirst() {
        Element parent = new Element("div");
        Element child1 = new Element("p").attr("class", "first");
        Element child2 = new Element("p").attr("class", "second");
        parent.appendChild(child1);
        parent.appendChild(child2);
        Element selected = parent.selectFirst("p.second");
        assertEquals(child2, selected);
    }

    @Test
    public void testSelectFirstNoMatch() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p"));
        Element selected = parent.selectFirst("span");
        assertNull(selected);
    }

    @Test
    public void testIsCssQuery() {
        Element el = new Element("div").attr("id", "test").addClass("myClass");
        assertTrue(el.is("#test"));
        assertTrue(el.is(".myClass"));
        assertTrue(el.is("div.myClass"));
        assertFalse(el.is("span"));
    }

    @Test
    public void testAppendChild() {
        Element parent = new Element("div");
        Node child = new TextNode("hello");
        parent.appendChild(child);
        assertEquals(1, parent.childNodeSize());
        assertEquals(child, parent.childNode(0));
    }

    @Test
    public void testAppendTo() {
        Element parent = new Element("div");
        Element child = new Element("p");
        child.appendTo(parent);
        assertEquals(1, parent.childNodeSize());
        assertEquals(child, parent.childNode(0));
        assertEquals(parent, child.parent());
    }

    @Test
    public void testPrependChild() {
        Element parent = new Element("div");
        Node child1 = new TextNode("hello");
        Node child2 = new TextNode("world");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
    }

    @Test
    public void testInsertChildrenAtIndex() {
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
    public void testInsertChildrenAtEnd() {
        Element parent = new Element("div");
        Node child1 = new TextNode("one");
        Node child2 = new TextNode("two");
        parent.appendChild(child1);
        parent.insertChildren(-1, child2); // insert at end
        assertEquals(2, parent.childNodeSize());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
    }

    @Test
    public void testAppendElement() {
        Element parent = new Element("div");
        Element child = parent.appendElement("p");
        assertEquals("p", child.tagName());
        assertEquals(1, parent.childNodeSize());
        assertEquals(child, parent.childNode(0));
        assertEquals(parent, child.parent());
    }

    @Test
    public void testPrependElement() {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.prependElement("span");
        assertEquals("span", child2.tagName());
        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
        assertEquals(parent, child2.parent());
    }

    @Test
    public void testAppendText() {
        Element parent = new Element("p");
        parent.appendText("Hello");
        assertEquals(1, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof TextNode);
        assertEquals("Hello", ((TextNode) parent.childNode(0)).text());
    }

    @Test
    public void testPrependText() {
        Element parent = new Element("p");
        parent.appendText("World");
        parent.prependText("Hello ");
        assertEquals(2, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof TextNode);
        assertTrue(parent.childNode(1) instanceof TextNode);
        assertEquals("Hello ", ((TextNode) parent.childNode(0)).text());
        assertEquals("World", ((TextNode) parent.childNode(1)).text());
    }

    @Test
    public void testAppendHtmlString() {
        Element parent = new Element("div");
        parent.append("<span>Hello</span>");
        assertEquals(1, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof Element);
        assertEquals("span", parent.childNode(0).nodeName());
        assertEquals("Hello", ((Element) parent.childNode(0)).text());
    }

    @Test
    public void testAppendHtmlMultipleNodes() {
        Element parent = new Element("div");
        parent.append("<p>One</p><text>Two</text>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("p", parent.childNode(0).nodeName());
        assertEquals("One", ((Element) parent.childNode(0)).text());
        assertEquals("text", parent.childNode(1).nodeName());
        assertEquals("Two", ((Element) parent.childNode(1)).text());
    }

    @Test
    public void testPrependHtmlString() {
        Element parent = new Element("div");
        parent.append("<p>Two</p>");
        parent.prepend("<span>One</span>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("span", parent.childNode(0).nodeName());
        assertEquals("One", ((Element) parent.childNode(0)).text());
        assertEquals("p", parent.childNode(1).nodeName());
        assertEquals("Two", ((Element) parent.childNode(1)).text());
    }

    @Test
    public void testBeforeString() {
        Element element = new Element("p");
        Element parent = new Element("div").appendChild(element);
        element.before("<span>pre</span>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("span", parent.childNode(0).nodeName());
        assertEquals("p", parent.childNode(1).nodeName());
    }

    @Test
    public void testAfterString() {
        Element element = new Element("p");
        Element parent = new Element("div").appendChild(element);
        element.after("<span>post</span>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("p", parent.childNode(0).nodeName());
        assertEquals("span", parent.childNode(1).nodeName());
    }

    @Test
    public void testEmpty() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p"));
        parent.appendChild(new TextNode("text"));
        parent.empty();
        assertEquals(0, parent.childNodeSize());
    }

    @Test
    public void testWrapString() {
        Element element = new Element("p").text("content");
        element.wrap("<div><span></span></div>");
        Element wrapper = element.parent();
        assertEquals("div", wrapper.tagName());
        Element innerWrapper = wrapper.child(0);
        assertEquals("span", innerWrapper.tagName());
        assertEquals(element, innerWrapper.child(0));
    }
    
    @Test
    public void testCssSelectorId() {
        Element el = new Element("div").attr("id", "myId");
        assertEquals("#myId", el.cssSelector());
    }

    @Test
    public void testCssSelectorClass() {
        Element el = new Element("div").addClass("class1").addClass("class2");
        // The exact order of classes in the selector can vary based on implementation details,
        // but it should contain the tag and all classes.
        String selector = el.cssSelector();
        assertTrue(selector.contains("div"));
        assertTrue(selector.contains(".class1"));
        assertTrue(selector.contains(".class2"));
    }

    @Test
    public void testCssSelectorNthChild() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("p");
        Element el3 = parent.appendElement("p");
        // el2 is the second child, so its selector should include :nth-child(2)
        assertEquals("p:nth-child(2)", el2.cssSelector());
    }
    
    @Test
    public void testSiblingElements() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("p");
        Elements siblingsOfEl2 = el2.siblingElements();
        assertEquals(2, siblingsOfEl2.size());
        assertEquals(el1, siblingsOfEl2.get(0));
        assertEquals(el3, siblingsOfEl2.get(1));
    }

    @Test
    public void testSiblingElementsNone() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        Elements siblings = el1.siblingElements();
        assertTrue(siblings.isEmpty());
    }

    @Test
    public void testNextElementSibling() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("p");
        assertEquals(el2, el1.nextElementSibling());
        assertEquals(el3, el2.nextElementSibling());
        assertNull(el3.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("p");
        assertNull(el1.previousElementSibling());
        assertEquals(el1, el2.previousElementSibling());
        assertEquals(el2, el3.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("p");
        assertEquals(el1, el2.firstElementSibling());
        assertEquals(el1, el3.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingWhenFirst() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        assertEquals(el1, el1.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingNone() {
        Element parent = new Element("div");
        Element el1 = parent.appendText("text");
        assertNull(el1.firstElementSibling());
    }

    @Test
    public void testLastElementSibling() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("p");
        assertEquals(el3, el1.lastElementSibling());
        assertEquals(el3, el2.lastElementSibling());
    }

    @Test
    public void testLastElementSiblingWhenLast() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        assertEquals(el2, el2.lastElementSibling());
    }

    @Test
    public void testLastElementSiblingNone() {
        Element parent = new Element("div");
        Element el1 = parent.appendText("text");
        assertNull(el1.lastElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        Element el2 = parent.appendElement("span");
        Element el3 = parent.appendElement("p");
        assertEquals(0, el1.elementSiblingIndex());
        assertEquals(1, el2.elementSiblingIndex());
        assertEquals(2, el3.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndexWhenOnlyChild() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p");
        assertEquals(0, el1.elementSiblingIndex());
    }

    @Test
    public void testGetElementsByTag() {
        Element parent = new Element("div");
        Element p1 = parent.appendElement("p");
        Element span1 = parent.appendElement("span");
        Element p2 = parent.appendElement("p");
        Elements ps = parent.getElementsByTag("p");
        assertEquals(2, ps.size());
        assertEquals(p1, ps.get(0));
        assertEquals(p2, ps.get(1));
    }

    @Test
    public void testGetElementById() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p").attr("id", "first");
        Element el2 = parent.appendElement("span").attr("id", "second");
        Element el3 = parent.appendElement("p").attr("id", "third");
        assertEquals(el1, parent.getElementById("first"));
        assertEquals(el2, parent.getElementById("second"));
        assertNull(parent.getElementById("nonexistent"));
    }
    
    @Test
    public void testGetElementByIdNested() {
        Element parent = new Element("div");
        Element container = parent.appendElement("section").attr("id", "container");
        Element el1 = container.appendElement("p").attr("id", "nested");
        assertEquals(el1, parent.getElementById("nested"));
    }

    @Test
    public void testGetElementsByClass() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p").addClass("first");
        Element el2 = parent.appendElement("span").addClass("second").addClass("first");
        Element el3 = parent.appendElement("p").addClass("third");
        Elements firstClass = parent.getElementsByClass("first");
        assertEquals(2, firstClass.size());
        assertEquals(el1, firstClass.get(0));
        assertEquals(el2, firstClass.get(1));
    }

    @Test
    public void testGetElementsByAttribute() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("a").attr("href", "/page1");
        Element el2 = parent.appendElement("img").attr("src", "img.png");
        Element el3 = parent.appendElement("a").attr("href", "/page2");
        Elements links = parent.getElementsByAttribute("href");
        assertEquals(2, links.size());
        assertEquals(el1, links.get(0));
        assertEquals(el3, links.get(1));
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("div").attr("data-id", "123");
        Element el2 = parent.appendElement("div").attr("data-name", "test");
        Element el3 = parent.appendElement("span").attr("id", "id");
        Elements dataAttrs = parent.getElementsByAttributeStarting("data-");
        assertEquals(2, dataAttrs.size());
        assertEquals(el1, dataAttrs.get(0));
        assertEquals(el2, dataAttrs.get(1));
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("a").attr("target", "_blank");
        Element el2 = parent.appendElement("a").attr("target", "_self");
        Element el3 = parent.appendElement("span").attr("target", "_blank");
        Elements blanks = parent.getElementsByAttributeValue("target", "_blank");
        assertEquals(2, blanks.size());
        assertEquals(el1, blanks.get(0));
        assertEquals(el3, blanks.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("a").attr("target", "_blank");
        Element el2 = parent.appendElement("a").attr("target", "_self");
        Element el3 = parent.appendElement("span").attr("target", "_blank");
        Elements selfs = parent.getElementsByAttributeValueNot("target", "_blank");
        assertEquals(1, selfs.size());
        assertEquals(el2, selfs.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("a").attr("href", "/page1.html");
        Element el2 = parent.appendElement("a").attr("href", "/page2.php");
        Element el3 = parent.appendElement("a").attr("href", "http://example.com/page3.html");
        Elements pages = parent.getElementsByAttributeValueStarting("href", "/page");
        assertEquals(2, pages.size());
        assertEquals(el1, pages.get(0));
        assertEquals(el2, pages.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("a").attr("href", "/page1.html");
        Element el2 = parent.appendElement("a").attr("href", "/page2.php");
        Element el3 = parent.appendElement("a").attr("href", "http://example.com/page3.html");
        Elements htmlPages = parent.getElementsByAttributeValueEnding("href", ".html");
        assertEquals(2, htmlPages.size());
        assertEquals(el1, htmlPages.get(0));
        assertEquals(el3, htmlPages.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("a").attr("href", "/search?q=jsoup");
        Element el2 = parent.appendElement("a").attr("href", "/docs/api");
        Element el3 = parent.appendElement("a").attr("href", "/search?q=html");
        Elements searchLinks = parent.getElementsByAttributeValueContaining("href", "/search?");
        assertEquals(2, searchLinks.size());
        assertEquals(el1, searchLinks.get(0));
        assertEquals(el3, searchLinks.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("a").attr("href", "/page1");
        Element el2 = parent.appendElement("a").attr("href", "/Page2"); // Case sensitive
        Element el3 = parent.appendElement("a").attr("href", "/file3");
        Pattern pattern = Pattern.compile("^/page\\d+$"); // Matches /page followed by digits
        Elements pages = parent.getElementsByAttributeValueMatching("href", pattern);
        assertEquals(1, pages.size());
        assertEquals(el1, pages.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueMatchingRegexString() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("a").attr("href", "/page1");
        Element el2 = parent.appendElement("a").attr("href", "/Page2"); // Case sensitive
        Element el3 = parent.appendElement("a").attr("href", "/file3");
        // Case insensitive match for /page followed by digits
        Elements pages = parent.getElementsByAttributeValueMatching("href", "(?i)^/page\\d+$");
        assertEquals(2, pages.size());
        assertEquals(el1, pages.get(0));
        assertEquals(el2, pages.get(1));
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Element parent = new Element("div");
        parent.appendElement("p"); // 0
        parent.appendElement("p"); // 1
        parent.appendElement("p"); // 2
        Elements result = parent.getElementsByIndexLessThan(2);
        assertEquals(2, result.size());
        assertEquals(0, result.get(0).elementSiblingIndex());
        assertEquals(1, result.get(1).elementSiblingIndex());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element parent = new Element("div");
        parent.appendElement("p"); // 0
        parent.appendElement("p"); // 1
        parent.appendElement("p"); // 2
        Elements result = parent.getElementsByIndexGreaterThan(0);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0).elementSiblingIndex());
        assertEquals(2, result.get(1).elementSiblingIndex());
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Element parent = new Element("div");
        parent.appendElement("p"); // 0
        parent.appendElement("p"); // 1
        parent.appendElement("p"); // 2
        Elements result = parent.getElementsByIndexEquals(1);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).elementSiblingIndex());
    }

    @Test
    public void testGetElementsContainingText() {
        Element parent = new Element("div");
        Element p1 = parent.appendElement("p").text("Hello World");
        Element p2 = parent.appendElement("p").text("Just Hello");
        Element span1 = parent.appendElement("span").text("World");
        Elements result = parent.getElementsContainingText("World");
        assertEquals(2, result.size());
        assertEquals(p1, result.get(0));
        assertEquals(span1, result.get(1));
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element parent = new Element("div");
        Element p1 = parent.appendElement("p");
        p1.appendText("Hello ");
        p1.appendChild(new Element("b").appendText("World")); // nested
        Element p2 = parent.appendElement("p").appendText("Hello World"); // own text
        
        Elements result = parent.getElementsContainingOwnText("Hello World");
        assertEquals(1, result.size());
        assertEquals(p2, result.get(0));
    }

    @Test
    public void testGetElementsMatchingText() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p").text("abc 123 def");
        Element el2 = parent.appendElement("p").text("xyz 456 mno");
        Element el3 = parent.appendElement("p").text("abc 789 def");
        Pattern pattern = Pattern.compile("abc \\d+ def");
        Elements result = parent.getElementsMatchingText(pattern);
        assertEquals(2, result.size());
        assertEquals(el1, result.get(0));
        assertEquals(el3, result.get(1));
    }
    
    @Test
    public void testGetElementsMatchingTextRegexString() {
        Element parent = new Element("div");
        Element el1 = parent.appendElement("p").text("abc 123 def");
        Element el2 = parent.appendElement("p").text("xyz 456 mno");
        Element el3 = parent.appendElement("p").text("abc 789 def");
        // Case insensitive match for "abc" followed by space, digits, space, "def"
        Elements result = parent.getElementsMatchingText("(?i)abc \\d+ def");
        assertEquals(2, result.size());
        assertEquals(el1, result.get(0));
        assertEquals(el3, result.get(1));
    }

    @Test
    public void testGetElementsMatchingOwnText() {
        Element parent = new Element("div");
        Element p1 = parent.appendElement("p");
        p1.appendText("Item 123");
        p1.appendChild(new Element("b").appendText(" (nested)")); // nested
        Element p2 = parent.appendElement("p").appendText("Item 456"); // own text
        
        Pattern pattern = Pattern.compile("Item \\d+");
        Elements result = parent.getElementsMatchingOwnText(pattern);
        assertEquals(1, result.size());
        assertEquals(p2, result.get(0));
    }
    
    @Test
    public void testGetElementsMatchingOwnTextRegexString() {
        Element parent = new Element("div");
        Element p1 = parent.appendElement("p");
        p1.appendText("item 123");
        p1.appendChild(new Element("b").appendText(" (nested)")); // nested
        Element p2 = parent.appendElement("p").appendText("Item 456"); // own text
        
        // Case insensitive match for "item" followed by digits
        Elements result = parent.getElementsMatchingOwnText("(?i)item \\d+");
        assertEquals(2, result.size());
        assertEquals(p1, result.get(0));
        assertEquals(p2, result.get(1));
    }

    @Test
    public void testGetAllElements() {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("p");
        Element textNode = parent.appendText("some text");
        Element child2 = parent.appendElement("span");
        child2.appendElement("b");
        
        Elements allElements = parent.getAllElements();
        assertEquals(4, allElements.size()); // div, p, span, b
        assertEquals(parent, allElements.get(0));
        assertEquals(child1, allElements.get(1));
        assertEquals(child2, allElements.get(2));
        assertEquals(child2.child(0), allElements.get(3));
    }

    @Test
    public void testText() {
        Element p = new Element("p");
        p.appendChild(new TextNode("  Hello   "));
        p.appendChild(new Element("b").appendChild(new TextNode("World")));
        p.appendChild(new TextNode("  !"));
        assertEquals("Hello World !", p.text());
    }

    @Test
    public void testTextWithBr() {
        Element p = new Element("p");
        p.appendChild(new TextNode("Line 1"));
        p.appendChild(new Element("br"));
        p.appendChild(new TextNode("Line 2"));
        assertEquals("Line 1 Line 2", p.text());
    }
    
    @Test
    public void testTextWithBlockElements() {
        Element div = new Element("div");
        div.appendChild(new Element("p").text("Paragraph 1"));
        div.appendChild(new TextNode(" Some text"));
        div.appendChild(new Element("h2").text("Heading"));
        assertEquals("Paragraph 1 Some text Heading", div.text());
    }

    @Test
    public void testWholeText() {
        Element p = new Element("p");
        p.appendChild(new TextNode("  Hello   "));
        p.appendChild(new Element("b").appendChild(new TextNode("World")));
        p.appendChild(new TextNode("  !"));
        assertEquals("  Hello   World  !", p.wholeText());
    }
    
    @Test
    public void testWholeTextWithBr() {
        Element p = new Element("p");
        p.appendChild(new TextNode("Line 1"));
        p.appendChild(new Element("br"));
        p.appendChild(new TextNode("Line 2"));
        assertEquals("Line 1Line 2", p.wholeText());
    }

    @Test
    public void testOwnText() {
        Element p = new Element("p");
        p.appendChild(new TextNode("Hello "));
        p.appendChild(new Element("b").appendChild(new TextNode("nested")));
        p.appendChild(new TextNode(" World"));
        assertEquals("Hello  World", p.ownText());
    }

    @Test
    public void testOwnTextEmpty() {
        Element p = new Element("p");
        p.appendChild(new Element("b").appendChild(new TextNode("nested")));
        assertEquals("", p.ownText());
    }

    @Test
    public void testTextSetter() {
        Element el = new Element("div");
        el.text("New text content");
        assertEquals("New text content", el.text());
        assertEquals(1, el.childNodeSize());
        assertTrue(el.childNode(0) instanceof TextNode);
    }

    @Test
    public void testHasText() {
        Element el1 = new Element("div");
        el1.appendChild(new TextNode("  "));
        assertFalse(el1.hasText());

        Element el2 = new Element("div");
        el2.appendChild(new TextNode(" some text "));
        assertTrue(el2.hasText());

        Element el3 = new Element("div");
        el3.appendChild(new Element("span").appendText("nested text"));
        assertTrue(el3.hasText());
    }

    @Test
    public void testData() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var x = 1;"));
        script.appendChild(new Comment(" comment "));
        script.appendChild(new DataNode("var y = 2;"));
        assertEquals("var x = 1; var y = 2;", script.data());
    }

    @Test
    public void testDataEmpty() {
        Element div = new Element("div");
        assertEquals("", div.data());
    }

    @Test
    public void testClassName() {
        Element el = new Element("div");
        el.attr("class", " class1  class2 ");
        assertEquals("class1 class2", el.className());
    }

    @Test
    public void testClassNameEmpty() {
        Element el = new Element("div");
        assertEquals("", el.className());
    }

    @Test
    public void testClassNames() {
        Element el = new Element("div");
        el.attr("class", " class1  class2 ");
        Set<String> classes = el.classNames();
        assertEquals(2, classes.size());
        assertTrue(classes.contains("class1"));
        assertTrue(classes.contains("class2"));
    }

    @Test
    public void testClassNamesEmpty() {
        Element el = new Element("div");
        Set<String> classes = el.classNames();
        assertTrue(classes.isEmpty());
    }

    @Test
    public void testClassNamesSetter() {
        Element el = new Element("div");
        Set<String> newClasses = new LinkedHashSet<>(Arrays.asList("new1", "new2"));
        el.classNames(newClasses);
        assertEquals("new1 new2", el.className());
    }

    @Test
    public void testHasClass() {
        Element el = new Element("div");
        el.attr("class", " class1  class2 ");
        assertTrue(el.hasClass("class1"));
        assertTrue(el.hasClass("class2"));
        assertFalse(el.hasClass("class3"));
        assertFalse(el.hasClass("Class1")); // case sensitive check from spec
    }

    @Test
    public void testHasClassCaseInsensitive() {
        Element el = new Element("div");
        el.attr("class", " Class1 class2 "); // Note: Jsoup's hasClass is case sensitive based on spec
        assertTrue(el.hasClass("Class1")); // Matches exactly
        assertFalse(el.hasClass("class1")); // Does not match case variation
    }

    @Test
    public void testAddClass() {
        Element el = new Element("div");
        el.addClass("class1");
        el.addClass("class2");
        assertEquals("class1 class2", el.className());
    }

    @Test
    public void testRemoveClass() {
        Element el = new Element("div");
        el.addClass("class1");
        el.addClass("class2");
        el.removeClass("class1");
        assertEquals("class2", el.className());
    }

    @Test
    public void testToggleClassAdd() {
        Element el = new Element("div");
        el.toggleClass("class1");
        assertEquals("class1", el.className());
    }

    @Test
    public void testToggleClassRemove() {
        Element el = new Element("div");
        el.addClass("class1");
        el.toggleClass("class1");
        assertEquals("", el.className());
    }

    @Test
    public void testValInput() {
        Element input = new Element("input");
        input.attr("value", "initial");
        assertEquals("initial", input.val());
        input.val("new value");
        assertEquals("new value", input.attr("value"));
    }

    @Test
    public void testValTextarea() {
        Element textarea = new Element("textarea");
        textarea.text("initial content");
        assertEquals("initial content", textarea.val());
        textarea.val("new content");
        assertEquals("new content", textarea.text());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Element el = new Element("div").attr("id", "test").addClass("cls");
        StringBuilder accum = new StringBuilder();
        // Assuming default OutputSettings (prettyPrint=true, etc.)
        Document.OutputSettings settings = new Document("").outputSettings();
        el.outerHtmlHead(accum, 0, settings);
        // The exact output might vary slightly based on OutputSettings (e.g., spacing, self-closing syntax for void elements)
        // For a simple div, it should start with '<div id="test" class="cls">'
        assertTrue(accum.toString().startsWith("<div id=\"test\" class=\"cls\">"));
    }
    
    @Test
    public void testOuterHtmlTail() throws IOException {
        Element el = new Element("div");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document("").outputSettings();
        el.outerHtmlTail(accum, 0, settings);
        assertEquals("</div>", accum.toString());
    }

    @Test
    public void testOuterHtmlSimpleElement() throws IOException {
        Element el = new Element("br");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document("").outputSettings();
        el.outerHtmlHead(accum, 0, settings);
        el.outerHtmlTail(accum, 0, settings);
        // void element, typically self-closing in HTML.
        assertTrue(accum.toString().equals("<br />") || accum.toString().equals("<br>"));
    }

    @Test
    public void testHtmlInner() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p").text("content"));
        assertEquals("<p>content</p>", parent.html());
    }
    
    @Test
    public void testHtmlInnerMultiple() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p").text("one"));
        parent.appendChild(new TextNode("text"));
        parent.appendChild(new Element("span").text("two"));
        assertEquals("<p>one</p>text<span>two</span>", parent.html());
    }

    @Test
    public void testHtmlInnerEmpty() {
        Element parent = new Element("div");
        assertEquals("", parent.html());
    }

    @Test
    public void testHtmlSetter() {
        Element el = new Element("div");
        el.html("<p>New</p><span>Content</span>");
        assertEquals("<p>New</p><span>Content</span>", el.html());
        assertEquals(2, el.childNodeSize());
    }

    @Test
    public void testClone() {
        Element original = new Element("div").attr("id", "original").addClass("class1");
        original.appendChild(new Element("p").text("child text"));
        original.appendChild(new TextNode("plain text"));

        Element cloned = original.clone();

        assertNotSame(original, cloned);
        assertEquals(original.tagName(), cloned.tagName());
        assertEquals(original.id(), cloned.id());
        assertTrue(cloned.hasClass("class1"));
        assertEquals(2, cloned.childNodeSize());
        assertEquals("p", cloned.childNode(0).nodeName());
        assertEquals("child text", ((Element) cloned.childNode(0)).text());
        assertTrue(cloned.childNode(1) instanceof TextNode);
        assertEquals("plain text", ((TextNode) cloned.childNode(1)).text());

        // Ensure deep copy of children
        Element originalChild = (Element) original.childNode(0);
        Element clonedChild = (Element) cloned.childNode(0);
        assertNotSame(originalChild, clonedChild);
        
        // Modifying original should not affect clone
        original.attr("id", "modified");
        assertEquals("original", cloned.id());
    }

    @Test
    public void testShallowClone() {
        Element original = new Element("div").attr("id", "original").addClass("class1");
        original.appendChild(new Element("p").text("child text"));
        original.appendChild(new TextNode("plain text"));

        Element shallowCloned = original.shallowClone();

        assertNotSame(original, shallowCloned);
        assertEquals(original.tagName(), shallowCloned.tagName());
        assertEquals(original.id(), shallowCloned.id());
        assertTrue(shallowCloned.hasClass("class1"));
        assertEquals(0, shallowCloned.childNodeSize()); // Children are not copied

        // Modifying original should not affect shallow clone's attributes/tag
        original.attr("id", "modified");
        assertEquals("original", shallowCloned.id());
    }

    @Test
    public void testDoClone() {
        Element original = new Element("div").attr("id", "original").addClass("class1");
        Element parent = new Element("body");
        original.setParentNode(parent); // Manually set parent for doClone testing
        parent.appendChild(original);

        Element cloned = original.doClone(parent); // Pass parent to doClone

        assertNotSame(original, cloned);
        assertEquals(original.tagName(), cloned.tagName());
        assertEquals(original.id(), cloned.id());
        assertTrue(cloned.hasClass("class1"));
        assertNotNull(cloned.parent());
        assertEquals(parent, cloned.parent());
        assertEquals(1, parent.childNodeSize()); // Original should still be there
        assertEquals(cloned, parent.childNode(0)); // Cloned should be the child

        // Check attributes are cloned
        assertNotNull(cloned.attributes());
        assertNotSame(original.attributes(), cloned.attributes());
        assertEquals(original.attributes().size(), cloned.attributes().size());
        
        // Check children are cloned (though doClone itself doesn't clone children, it copies the list, and Node.clone handles recursive cloning)
        // This test relies on Node.clone's behavior.
        Element originalChild = new Element("p").text("child");
        original.appendChild(originalChild);
        Element clonedAfterAddingChild = original.doClone(parent); // Re-clone after adding child
        
        assertEquals(2, clonedAfterAddingChild.childNodeSize()); // original + cloned originalChild
        assertTrue(clonedAfterAddingChild.childNode(1) instanceof Element);
        assertEquals("p", clonedAfterAddingChild.childNode(1).nodeName());
        assertEquals("child", ((Element) clonedAfterAddingChild.childNode(1)).text());
        assertNotSame(originalChild, clonedAfterAddingChild.childNode(1));
    }
}
```