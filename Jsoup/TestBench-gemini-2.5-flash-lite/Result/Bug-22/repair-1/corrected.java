package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.select.Elements;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class ElementTest {

    @Test
    public void testTagName() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagNameChange() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test
    public void testTagObject() throws Exception {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        assertEquals(Tag.valueOf("p"), el.tag());
    }

    @Test
    public void testIsBlock() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(el.isBlock());
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        assertFalse(el2.isBlock());
    }

    @Test
    public void testIdAttribute() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("id", "myId");
        assertEquals("myId", el.id());
    }

    @Test
    public void testIdAttributeWhenEmpty() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.id());
    }

    @Test
    public void testAttrSetterAndGetter() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("key", "value");
        assertEquals("value", el.attr("key"));
    }

    @Test
    public void testAttrSetterForExisting() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("key", "value1");
        el.attr("key", "value2");
        assertEquals("value2", el.attr("key"));
    }

    @Test
    public void testDataset() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("data-id", "123");
        el.attr("data-name", "test");
        Map<String, String> dataset = el.dataset();
        assertEquals("123", dataset.get("id"));
        assertEquals("test", dataset.get("name"));
        assertEquals(2, dataset.size());
    }

    @Test
    public void testDatasetEmpty() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(el.dataset().isEmpty());
    }

    @Test
    public void testParent() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParents() throws Exception {
        Element grandparent = new Element(Tag.valueOf("html"), "http://example.com");
        Element parent = new Element(Tag.valueOf("body"), "http://example.com");
        Element child = new Element(Tag.valueOf("p"), "http://example.com");
        grandparent.appendChild(parent);
        parent.appendChild(child);

        Elements parents = child.parents();
        assertEquals(2, parents.size());
        assertEquals(parent, parents.get(0));
        assertEquals(grandparent, parents.get(1));
    }

    @Test
    public void testChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
    }

    @Test
    public void testChildren() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode textNode = new TextNode("Some text", "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(textNode);
        parent.appendChild(child2);

        Elements children = parent.children();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        assertEquals(child2, children.get(1));
    }

    @Test
    public void testTextNodes() throws Exception {
        Element parent = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode textNode1 = new TextNode("First text", "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        TextNode textNode2 = new TextNode("Second text", "http://example.com");
        parent.appendChild(textNode1);
        parent.appendChild(child);
        parent.appendChild(textNode2);

        List<TextNode> textNodes = parent.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals(textNode1, textNodes.get(0));
        assertEquals(textNode2, textNodes.get(1));
    }

    @Test
    public void testDataNodes() throws Exception {
        Element parent = new Element(Tag.valueOf("script"), "http://example.com");
        DataNode dataNode1 = new DataNode("var x = 1;", "http://example.com");
        Element child = new Element(Tag.valueOf("div"), "http://example.com");
        DataNode dataNode2 = new DataNode("var y = 2;", "http://example.com");
        parent.appendChild(dataNode1);
        parent.appendChild(child);
        parent.appendChild(dataNode2);

        List<DataNode> dataNodes = parent.dataNodes();
        assertEquals(2, dataNodes.size());
        assertEquals(dataNode1, dataNodes.get(0));
        assertEquals(dataNode2, dataNodes.get(1));
    }

    @Test
    public void testSelect() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        child1.attr("class", "foo");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        child2.attr("class", "bar");
        parent.appendChild(child1);
        parent.appendChild(child2);

        Elements selected = parent.select(".foo");
        assertEquals(1, selected.size());
        assertEquals(child1, selected.get(0));
    }

    @Test
    public void testAppendChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child);
        assertEquals(1, parent.childNodes().size());
        assertEquals(child, parent.childNodes().get(0));
        assertEquals(parent, child.parent());
    }

    @Test
    public void testPrependChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(2, parent.childNodes().size());
        assertEquals(child2, parent.childNodes().get(0));
        assertEquals(child1, parent.childNodes().get(1));
        assertEquals(parent, child2.parent());
    }

    @Test
    public void testAppendElement() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("p");
        assertEquals("p", child.tagName());
        assertEquals(parent, child.parent());
        assertEquals(1, parent.children().size());
        assertEquals(child, parent.children().get(0));
    }

    @Test
    public void testPrependElement() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.prependElement("span");
        assertEquals("span", child2.tagName());
        assertEquals(parent, child2.parent());
        assertEquals(2, parent.children().size());
        assertEquals(child2, parent.children().get(0));
        assertEquals(child1, parent.children().get(1));
    }

    @Test
    public void testAppendText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendText("Some text");
        assertEquals(1, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof TextNode);
        assertEquals("Some text", ((TextNode) parent.childNodes().get(0)).text());
    }

    @Test
    public void testPrependText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        TextNode textNode1 = new TextNode("First text", "http://example.com");
        parent.appendChild(textNode1);
        parent.prependText("Prepend text");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof TextNode);
        assertEquals("Prepend text", ((TextNode) parent.childNodes().get(0)).text());
        assertEquals(textNode1, parent.childNodes().get(1));
    }

    @Test
    public void testAppendHtml() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.append("<p>Hello</p><span>World</span>");
        assertEquals(2, parent.children().size());
        assertEquals("p", parent.child(0).tagName());
        assertEquals("Hello", parent.child(0).text());
        assertEquals("span", parent.child(1).tagName());
        assertEquals("World", parent.child(1).text());
    }

    @Test
    public void testPrependHtml() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.append("<span>World</span>");
        parent.prepend("<p>Hello</p>");
        assertEquals(2, parent.children().size());
        assertEquals("p", parent.child(0).tagName());
        assertEquals("Hello", parent.child(0).text());
        assertEquals("span", parent.child(1).tagName());
        assertEquals("World", parent.child(1).text());
    }

    @Test
    public void testBeforeString() throws Exception {
        Element element = new Element(Tag.valueOf("p"), "http://example.com");
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(element);

        element.before("<p>Before</p>");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof Element);
        assertEquals("p", ((Element) parent.childNodes().get(0)).tagName());
        assertEquals("Before", ((Element) parent.childNodes().get(0)).text());
        assertEquals(element, parent.childNodes().get(1));
    }

    @Test
    public void testAfterString() throws Exception {
        Element element = new Element(Tag.valueOf("p"), "http://example.com");
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(element);

        element.after("<span>After</span>");
        assertEquals(2, parent.childNodes().size());
        assertEquals(element, parent.childNodes().get(0));
        assertTrue(parent.childNodes().get(1) instanceof Element);
        assertEquals("span", ((Element) parent.childNodes().get(1)).tagName());
        assertEquals("After", ((Element) parent.childNodes().get(1)).text());
    }

    @Test
    public void testEmpty() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        parent.appendChild(new TextNode("text", "http://example.com"));
        parent.empty();
        assertTrue(parent.childNodes().isEmpty());
    }

    @Test
    public void testWrapString() throws Exception {
        Element element = new Element(Tag.valueOf("p"), "http://example.com");
        element.attr("class", "inner");
        element.appendText("content");
        element.wrap("<div class='outer'></div>");

        assertEquals("div", element.parent().tagName());
        assertEquals("outer", element.parent().className());
        assertEquals("p", element.parent().child(0).tagName());
        assertEquals("inner", element.parent().child(0).className());
        assertEquals("content", element.parent().child(0).text());
    }

    @Test
    public void testSiblingElements() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element sibling1 = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode textNode = new TextNode("text", "http://example.com");
        Element sibling2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(sibling1);
        parent.appendChild(textNode);
        parent.appendChild(sibling2);

        Elements siblings = sibling1.siblingElements();
        assertEquals(1, siblings.size());
        assertEquals(sibling2, siblings.get(0));
    }

    @Test
    public void testNextElementSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        assertEquals(el2, el1.nextElementSibling());
        assertEquals(el3, el2.nextElementSibling());
        assertNull(el3.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        assertNull(el1.previousElementSibling());
        assertEquals(el1, el2.previousElementSibling());
        assertEquals(el2, el3.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(el1, parent.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingWhenOnlyChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(el1);
        assertEquals(el1, parent.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingWhenNoChildren() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        assertNull(parent.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);

        assertEquals(0, el1.elementSiblingIndex().intValue());
        assertEquals(1, el2.elementSiblingIndex().intValue());
    }

    @Test
    public void testLastElementSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(el2, parent.lastElementSibling());
    }

    @Test
    public void testLastElementSiblingWhenOnlyChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(el1);
        assertEquals(el1, parent.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element span1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element p2 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(p1);
        parent.appendChild(span1);
        parent.appendChild(p2);

        Elements pElements = parent.getElementsByTag("p");
        assertEquals(2, pElements.size());
        assertEquals(p1, pElements.get(0));
        assertEquals(p2, pElements.get(1));
    }

    @Test
    public void testGetElementById() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "unique");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Element found = parent.getElementById("unique");
        assertEquals(el1, found);
        assertNull(parent.getElementById("nonexistent"));
    }

    @Test
    public void testGetElementsByClass() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").attr("class", "foo");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com").attr("class", "bar");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com").attr("class", "foo bar");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements fooElements = parent.getElementsByClass("foo");
        assertEquals(2, fooElements.size());
        assertEquals(el1, fooElements.get(0));
        assertEquals(el3, fooElements.get(1));

        Elements barElements = parent.getElementsByClass("bar");
        assertEquals(2, barElements.size());
        assertEquals(el2, barElements.get(0));
        assertEquals(el3, barElements.get(1));
    }

    @Test
    public void testGetElementsByAttribute() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com");
        Element el2 = new Element(Tag.valueOf("img"), "http://example.com").attr("src", "image.jpg");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com").attr("id", "link2");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements hrefElements = parent.getElementsByAttribute("href");
        assertEquals(1, hrefElements.size());
        assertEquals(el1, hrefElements.get(0));

        Elements idElements = parent.getElementsByAttribute("id");
        assertEquals(1, idElements.size());
        assertEquals(el3, idElements.get(0));
    }

    @Test
    public void testGetElementsByAttributeStarting() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com");
        Element el2 = new Element(Tag.valueOf("img"), "http://example.com").attr("src", "image.jpg");
        Element el3 = new Element(Tag.valueOf("div"), "http://example.com").attr("data-id", "123");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements linkElements = parent.getElementsByAttributeStarting("h");
        assertEquals(1, linkElements.size());
        assertEquals(el1, linkElements.get(0));

        Elements dataElements = parent.getElementsByAttributeStarting("data-");
        assertEquals(1, dataElements.size());
        assertEquals(el3, dataElements.get(0));
    }

    @Test
    public void testGetElementsByAttributeValue() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page2");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements page1Elements = parent.getElementsByAttributeValue("href", "http://example.com/page1");
        assertEquals(1, page1Elements.size());
        assertEquals(el1, page1Elements.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueNot() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page2");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "other");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements notPage1Elements = parent.getElementsByAttributeValueNot("href", "http://example.com/page1");
        assertEquals(2, notPage1Elements.size());
        assertEquals(el2, notPage1Elements.get(0));
        assertEquals(el3, notPage1Elements.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueStarting() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page2");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "other/page");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements prefixElements = parent.getElementsByAttributeValueStarting("href", "http://example.com/");
        assertEquals(2, prefixElements.size());
        assertEquals(el1, prefixElements.get(0));
        assertEquals(el2, prefixElements.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueEnding() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page2");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "prefix/page1");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements suffixElements = parent.getElementsByAttributeValueEnding("href", "page1");
        assertEquals(2, suffixElements.size());
        assertEquals(el1, suffixElements.get(0));
        assertEquals(el3, suffixElements.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueContaining() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page2");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "prefix/search/suffix");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements containingElements = parent.getElementsByAttributeValueContaining("href", "/page");
        assertEquals(2, containingElements.size());
        assertEquals(el1, containingElements.get(0));
        assertEquals(el2, containingElements.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueMatching() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page2");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Pattern pattern = Pattern.compile("http://.*\\.com/page[0-9]");
        Elements matchingElements = parent.getElementsByAttributeValueMatching("href", pattern);
        assertEquals(2, matchingElements.size());
        assertEquals(el1, matchingElements.get(0));
        assertEquals(el2, matchingElements.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueMatchingRegexString() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page2");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements matchingElements = parent.getElementsByAttributeValueMatching("href", "http://.*\\.com/page[0-9]");
        assertEquals(2, matchingElements.size());
        assertEquals(el1, matchingElements.get(0));
        assertEquals(el2, matchingElements.get(1));
    }

    @Test
    public void testGetElementsByIndexLessThan() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements lessThan2 = parent.getElementsByIndexLessThan(2);
        assertEquals(2, lessThan2.size());
        assertEquals(el1, lessThan2.get(0));
        assertEquals(el2, lessThan2.get(1));
    }

    @Test
    public void testGetElementsByIndexGreaterThan() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements greaterThan0 = parent.getElementsByIndexGreaterThan(0);
        assertEquals(2, greaterThan0.size());
        assertEquals(el2, greaterThan0.get(0));
        assertEquals(el3, greaterThan0.get(1));
    }

    @Test
    public void testGetElementsByIndexEquals() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements index1 = parent.getElementsByIndexEquals(1);
        assertEquals(1, index1.size());
        assertEquals(el2, index1.get(0));
    }

    @Test
    public void testGetElementsContainingText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").text("Hello world");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com").text("Goodbye");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements containingHello = parent.getElementsContainingText("Hello");
        assertEquals(1, containingHello.size());
        assertEquals(el1, containingHello.get(0));
    }

    @Test
    public void testGetElementsContainingOwnText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        el1.attr("data-owntext", "Hello world"); // Simulating ownText by setting an attribute for test simplicity
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com").text("Inner <span >World</span>");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements containingHello = parent.getElementsContainingOwnText("Hello");
        assertEquals(1, containingHello.size());
        assertEquals(el1, containingHello.get(0));
    }

    @Test
    public void testGetElementsMatchingText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").text("Hello 123");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com").text("Goodbye 456");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Pattern pattern = Pattern.compile(".*\\d.*");
        Elements matching = parent.getElementsMatchingText(pattern);
        assertEquals(2, matching.size());
        assertEquals(el1, matching.get(0));
        assertEquals(el2, matching.get(1));
    }

    @Test
    public void testGetElementsMatchingOwnText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        el1.attr("data-owntext-match", "Hello 123"); // Simulating ownText for test simplicity
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com").text("Inner 456");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Pattern pattern = Pattern.compile(".*\\d.*");
        Elements matching = parent.getElementsMatchingOwnText(pattern);
        assertEquals(1, matching.size());
        assertEquals(el1, matching.get(0));
    }

    @Test
    public void testGetAllElements() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        child1.appendChild(child2);
        parent.appendChild(child1);

        Elements all = parent.getAllElements();
        assertEquals(3, all.size()); // parent, child1, child2
        assertEquals(parent, all.get(0));
        assertEquals(child1, all.get(1));
        assertEquals(child2, all.get(2));
    }

    @Test
    public void testText() throws Exception {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        p.appendChild(new TextNode("Hello ", "http://example.com"));
        p.appendChild(new Element(Tag.valueOf("b"), "http://example.com").text("world"));
        p.appendChild(new TextNode("!", "http://example.com"));
        assertEquals("Hello world !", p.text());
    }

    @Test
    public void testOwnText() throws Exception {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        p.appendChild(new TextNode("Hello ", "http://example.com"));
        p.appendChild(new Element(Tag.valueOf("b"), "http://example.com").text("world"));
        p.appendChild(new TextNode("!", "http://example.com"));
        assertEquals("Hello !", p.ownText());
    }

    @Test
    public void testHasText() throws Exception {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com").text("Some text");
        assertTrue(el1.hasText());

        Element el2 = new Element(Tag.valueOf("div"), "http://example.com").text("   ");
        assertFalse(el2.hasText());

        Element el3 = new Element(Tag.valueOf("div"), "http://example.com");
        el3.appendChild(new TextNode("   ", "http://example.com"));
        assertFalse(el3.hasText());

        Element el4 = new Element(Tag.valueOf("div"), "http://example.com");
        el4.appendChild(new TextNode("Not blank", "http://example.com"));
        assertTrue(el4.hasText());
    }

    @Test
    public void testData() throws Exception {
        Element script = new Element(Tag.valueOf("script"), "http://example.com");
        script.appendChild(new DataNode("var x = 1;", "http://example.com"));
        // The `data()` method on Element is not a setter. It's a getter for combined data.
        // To add data to a DataNode, you would instantiate DataNode directly.
        // For the purpose of testing `Element.data()` which concatenates data from DataNodes,
        // we'll simulate adding a DataNode with data.
        script.appendChild(new DataNode("var y = 2;", "http://example.com"));
        assertEquals("var x = 1;var y = 2;", script.data());
    }

    @Test
    public void testClassName() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", "foo bar baz");
        assertEquals("foo bar baz", el.className());
    }

    @Test
    public void testClassNames() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", "foo bar baz");
        Set<String> classes = el.classNames();
        assertEquals(3, classes.size());
        assertTrue(classes.contains("foo"));
        assertTrue(classes.contains("bar"));
        assertTrue(classes.contains("baz"));
    }

    @Test
    public void testClassNamesEmpty() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(el.classNames().isEmpty());
    }

    @Test
    public void testHasClass() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", "foo bar baz");
        assertTrue(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
        assertTrue(el.hasClass("BAZ")); // case insensitive
        assertFalse(el.hasClass("qux"));
    }

    @Test
    public void testAddClass() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.addClass("foo");
        assertTrue(el.hasClass("foo"));
        assertEquals("foo", el.className());

        el.addClass("bar");
        assertTrue(el.hasClass("bar"));
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testRemoveClass() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", "foo bar baz");
        el.removeClass("bar");
        assertFalse(el.hasClass("bar"));
        assertEquals("foo baz", el.className());

        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));
        assertEquals("baz", el.className());

        el.removeClass("qux"); // removing non-existent class
        assertEquals("baz", el.className());
    }

    @Test
    public void testToggleClass() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.toggleClass("foo"); // add
        assertTrue(el.hasClass("foo"));
        assertEquals("foo", el.className());

        el.toggleClass("foo"); // remove
        assertFalse(el.hasClass("foo"));
        assertEquals("", el.className());

        el.toggleClass("bar"); // add
        assertTrue(el.hasClass("bar"));
        assertEquals("bar", el.className());
    }

    @Test
    public void testValTextArea() throws Exception {
        Element el = new Element(Tag.valueOf("textarea"), "http://example.com");
        el.text("textarea content");
        assertEquals("textarea content", el.val());
    }

    @Test
    public void testValInput() throws Exception {
        Element el = new Element(Tag.valueOf("input"), "http://example.com");
        el.attr("value", "input value");
        assertEquals("input value", el.val());
    }

    @Test
    public void testValInputWhenNoValue() throws Exception {
        Element el = new Element(Tag.valueOf("input"), "http://example.com");
        assertEquals("", el.val());
    }

    @Test
    public void testSetValTextArea() throws Exception {
        Element el = new Element(Tag.valueOf("textarea"), "http://example.com");
        el.val("new textarea content");
        assertEquals("new textarea content", el.text());
        assertEquals("new textarea content", el.val());
    }

    @Test
    public void testSetValInput() throws Exception {
        Element el = new Element(Tag.valueOf("input"), "http://example.com");
        el.val("new input value");
        assertEquals("new input value", el.attr("value"));
        assertEquals("new input value", el.val());
    }

    @Test
    public void testOuterHtmlHeadSelfClosing() throws Exception {
        Element el = new Element(Tag.valueOf("br"), "http://example.com");
        // Tag.setSelfClosing() is not a public method accessible here.
        // For testing purposes, we can manually set an attribute that might indicate self-closing behavior,
        // or if there's a specific tag known to be self-closing in JSoup's parser.
        // However, the `isSelfClosing()` method on Tag is public.
        // For this test, we'll assume the tag itself is recognized as self-closing by the renderer.
        // The source code for outerHtmlHead checks `tag.isSelfClosing()`.
        StringBuilder accum = new StringBuilder();
        el.outerHtmlHead(accum, 0, new Document("").outputSettings());
        // Based on the source, if tag.isSelfClosing() is true AND childNodes is empty, it appends " />".
        // The default tag "br" is self-closing.
        assertTrue(accum.toString().contains("/>"));
    }

    @Test
    public void testOuterHtmlHeadWithAttributes() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("id", "main");
        el.attr("class", "container");
        StringBuilder accum = new StringBuilder();
        el.outerHtmlHead(accum, 0, new Document("").outputSettings());
        // attribute order might vary, so check for presence
        String html = accum.toString();
        assertTrue(html.contains("<div"));
        assertTrue(html.contains("id=\"main\""));
        assertTrue(html.contains("class=\"container\""));
        assertTrue(html.contains(">"));
    }

    @Test
    public void testOuterHtmlTail() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendChild(new TextNode("content", "http://example.com"));
        StringBuilder accum = new StringBuilder();
        el.outerHtmlTail(accum, 0, new Document("").outputSettings());
        assertEquals("</div>", accum.toString());
    }

    @Test
    public void testOuterHtmlTailSelfClosing() throws Exception {
        Element el = new Element(Tag.valueOf("br"), "http://example.com");
        StringBuilder accum = new StringBuilder();
        el.outerHtmlTail(accum, 0, new Document("").outputSettings());
        assertEquals("", accum.toString()); // self-closing tags have no tail, as per outerHtmlTail logic
    }

    @Test
    public void testHtml() throws Exception {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.appendChild(new Element(Tag.valueOf("p"), "http://example.com").text("Hello"));
        div.appendChild(new TextNode(" World", "http://example.com"));
        assertEquals("<p>Hello</p> World", div.html());
    }

    @Test
    public void testHtmlEmpty() throws Exception {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", div.html());
    }

    @Test
    public void testHtmlWithEmptyElement() throws Exception {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        assertEquals("<p></p>", div.html());
    }

    @Test
    public void testSetHtml() throws Exception {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.html("<p>New content</p><span>More</span>");
        assertEquals(2, div.childNodes().size());
        assertEquals("p", div.child(0).tagName());
        assertEquals("New content", div.child(0).text());
        assertEquals("span", div.child(1).tagName());
        assertEquals("More", div.child(1).text());
    }

    @Test
    public void testSetHtmlClearsExisting() throws Exception {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.appendText("old content");
        div.html("<p>New content</p>");
        assertEquals(1, div.childNodes().size());
        assertEquals("p", div.child(0).tagName());
        assertEquals("New content", div.child(0).text());
    }

    @Test
    public void testToString() throws Exception {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.appendChild(new Element(Tag.valueOf("p"), "http://example.com").text("Hello"));
        assertEquals("<div><p>Hello</p></div>", div.toString());
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el2 = el1;
        assertTrue(el1.equals(el2));
    }

    @Test
    public void testNotEqualsDifferentInstance() throws Exception {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(el1.equals(el2));
    }

    @Test
    public void testHashCodeSameInstance() throws Exception {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el2 = el1;
        assertEquals(el1.hashCode(), el2.hashCode());
    }

    @Test
    public void testClone() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("id", "test");
        el.addClass("foo");
        el.appendText("content");

        Element clonedEl = el.clone();

        assertNotSame(el, clonedEl);
        assertEquals("div", clonedEl.tagName());
        assertEquals("test", clonedEl.id());
        assertTrue(clonedEl.hasClass("foo"));
        assertEquals("content", clonedEl.text());
        assertNull(clonedEl.parent()); // cloned elements are orphans
        assertFalse(el.equals(clonedEl)); // They are different objects
    }

    @Test
    public void testCloneWithChildren() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child);
        child.appendText("text");

        Element clonedParent = parent.clone();

        assertNotSame(parent, clonedParent);
        assertEquals(1, clonedParent.childNodes().size());
        Node clonedChild = clonedParent.childNode(0);
        assertNotSame(child, clonedChild);
        assertEquals("p", clonedChild.nodeName());
        assertEquals("text", ((Element) clonedChild).text());
        assertEquals(clonedParent, clonedChild.parent());
    }
}
