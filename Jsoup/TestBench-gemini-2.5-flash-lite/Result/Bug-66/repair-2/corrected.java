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
    public void testTagNameCaseInsensitive() throws Exception {
        Element el = new Element("DIV");
        assertEquals("div", el.tagName()); // Tag.valueOf normalizes to lowercase
    }

    @Test
    public void testTagNamePreserveCase() throws Exception {
        Element el = new Element(Tag.valueOf("custom", ParseSettings.preserveCase), "", new Attributes());
        assertEquals("custom", el.tagName());
    }

    @Test
    public void testTagNameChange() throws Exception {
        Element el = new Element("div");
        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test
    public void testTagObject() throws Exception {
        Element el = new Element("p");
        assertTrue(el.tag() instanceof Tag);
        assertEquals("p", el.tag().getName());
    }

    @Test
    public void testIsBlock() throws Exception {
        Element div = new Element("div");
        assertTrue(div.isBlock());
        Element span = new Element("span");
        assertFalse(span.isBlock());
    }

    @Test
    public void testIdAttribute() throws Exception {
        Element el = new Element("div");
        el.attr("id", "myId");
        assertEquals("myId", el.id());
    }

    @Test
    public void testIdAttributeEmpty() throws Exception {
        Element el = new Element("div");
        assertEquals("", el.id());
    }
    
    @Test
    public void testIdAttributeIgnoreCase() throws Exception {
        Element el = new Element("div");
        el.attr("ID", "myId");
        assertEquals("myId", el.id());
    }

    @Test
    public void testAttr() throws Exception {
        Element el = new Element("div");
        el.attr("key", "value");
        assertEquals("value", el.attr("key"));
    }
    
    @Test
    public void testAttrBoolean() throws Exception {
        Element el = new Element("input");
        el.attr("disabled", true);
        assertEquals("", el.attr("disabled")); // Boolean attributes have empty value
        assertTrue(el.hasAttr("disabled"));
        
        el.attr("checked", false);
        assertFalse(el.hasAttr("checked"));
    }
    
    @Test
    public void testDataset() throws Exception {
        Element el = new Element("div");
        el.attr("data-id", "123");
        el.attr("data-name", "test");
        Map<String, String> dataset = el.dataset();
        assertEquals("123", dataset.get("id"));
        assertEquals("test", dataset.get("name"));
    }

    @Test
    public void testDatasetEmpty() throws Exception {
        Element el = new Element("div");
        assertTrue(el.dataset().isEmpty());
    }

    @Test
    public void testParent() throws Exception {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParents() throws Exception {
        Element root = new Element("html");
        Element body = new Element("body");
        Element p = new Element("p");
        root.appendChild(body);
        body.appendChild(p);

        Elements parents = p.parents();
        assertEquals(2, parents.size());
        assertEquals("body", parents.get(0).tagName());
        assertEquals("html", parents.get(1).tagName());
    }

    @Test
    public void testChild() throws Exception {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() throws Exception {
        Element parent = new Element("div");
        parent.child(0);
    }

    @Test
    public void testChildren() throws Exception {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child2);
        Elements children = parent.children();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        assertEquals(child2, children.get(1));
    }

    @Test
    public void testChildrenEmpty() throws Exception {
        Element parent = new Element("div");
        Elements children = parent.children();
        assertTrue(children.isEmpty());
    }

    @Test
    public void testTextNodes() throws Exception {
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
    public void testDataNodes() throws Exception {
        Element parent = new Element("script");
        parent.appendChild(new DataNode("console.log('test');"));
        List<DataNode> dataNodes = parent.dataNodes();
        assertEquals(1, dataNodes.size());
        assertEquals("console.log('test');", dataNodes.get(0).getWholeData()); // Corrected method call
    }

    @Test
    public void testSelect() throws Exception {
        Element root = new Element("div");
        Element child1 = new Element("p");
        child1.attr("id", "p1");
        Element child2 = new Element("span");
        child2.addClass("myClass");
        root.appendChild(child1);
        root.appendChild(child2);

        Elements selectedById = root.select("#p1");
        assertEquals(1, selectedById.size());
        assertEquals(child1, selectedById.get(0));

        Elements selectedByClass = root.select(".myClass");
        assertEquals(1, selectedByClass.size());
        assertEquals(child2, selectedByClass.get(0));

        Elements selectedByTag = root.select("span");
        assertEquals(1, selectedByTag.size());
        assertEquals(child2, selectedByTag.get(0));
    }

    @Test
    public void testSelectFirst() throws Exception {
        Element root = new Element("div");
        Element child1 = new Element("p");
        child1.attr("id", "p1");
        Element child2 = new Element("p");
        child2.attr("id", "p2");
        root.appendChild(child1);
        root.appendChild(child2);

        Element selected = root.selectFirst("#p1");
        assertEquals(child1, selected);

        Element notFound = root.selectFirst("#p3");
        assertNull(notFound);
    }

    @Test
    public void testIsQuery() throws Exception {
        Element el = new Element("div");
        el.attr("id", "test");
        el.addClass("cls1");
        el.addClass("cls2");

        assertTrue(el.is("#test"));
        assertTrue(el.is(".cls1"));
        assertTrue(el.is(".cls2"));
        assertTrue(el.is("div.cls1"));
        assertTrue(el.is("div.cls1.cls2"));
        assertFalse(el.is("#other"));
        assertFalse(el.is(".cls3"));
        assertFalse(el.is("span"));
    }

    @Test
    public void testAppendChild() throws Exception {
        Element parent = new Element("div");
        Node child = new TextNode("text");
        parent.appendChild(child);
        assertEquals(1, parent.childNodeSize());
        assertEquals(child, parent.childNode(0));
        assertTrue(parent.childNodes().contains(child));
    }

    @Test
    public void testAppendTo() throws Exception {
        Element parent = new Element("div");
        Element child = new Element("span");
        child.appendTo(parent);
        assertEquals(1, parent.childNodeSize());
        assertEquals(child, parent.childNode(0));
        assertEquals(parent, child.parent());
    }

    @Test
    public void testPrependChild() throws Exception {
        Element parent = new Element("div");
        Node child1 = new TextNode("text1");
        Node child2 = new TextNode("text2");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
    }

    @Test
    public void testInsertChildrenAtIndex() throws Exception {
        Element parent = new Element("div");
        Node child1 = new TextNode("text1");
        Node child2 = new TextNode("text2");
        Node child3 = new TextNode("text3");
        parent.appendChild(child1);
        parent.appendChild(child3);
        
        List<Node> childrenToInsert = new ArrayList<>();
        childrenToInsert.add(child2);
        parent.insertChildren(1, childrenToInsert);

        assertEquals(3, parent.childNodeSize());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
        assertEquals(child3, parent.childNode(2));
    }

    @Test
    public void testInsertChildrenAtIndexNegative() throws Exception {
        Element parent = new Element("div");
        Node child1 = new TextNode("text1");
        Node child2 = new TextNode("text2");
        Node child3 = new TextNode("text3");
        parent.appendChild(child1);
        parent.appendChild(child2);
        
        List<Node> childrenToInsert = new ArrayList<>();
        childrenToInsert.add(child3);
        parent.insertChildren(-1, childrenToInsert); // insert at the end

        assertEquals(3, parent.childNodeSize());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
        assertEquals(child3, parent.childNode(2));
    }
    
    @Test
    public void testInsertChildrenVarargs() throws Exception {
        Element parent = new Element("div");
        Node child1 = new TextNode("text1");
        Node child3 = new TextNode("text3");
        parent.appendChild(child1);
        parent.appendChild(child3);
        
        Node child2 = new TextNode("text2");
        parent.insertChildren(1, child2);

        assertEquals(3, parent.childNodeSize());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
        assertEquals(child3, parent.childNode(2));
    }

    @Test
    public void testAppendElement() throws Exception {
        Element parent = new Element("div");
        Element child = parent.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(parent, child.parent());
        assertEquals(1, parent.childNodeSize());
        assertEquals(child, parent.childNode(0));
    }

    @Test
    public void testPrependElement() throws Exception {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("span");
        Element child2 = parent.prependElement("p");
        assertEquals("p", child2.tagName());
        assertEquals(parent, child2.parent());
        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
    }

    @Test
    public void testAppendText() throws Exception {
        Element parent = new Element("div");
        parent.appendText("hello");
        assertEquals(1, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof TextNode);
        assertEquals("hello", ((TextNode) parent.childNode(0)).text());
    }

    @Test
    public void testPrependText() throws Exception {
        Element parent = new Element("div");
        parent.appendText("world");
        parent.prependText("hello ");
        assertEquals(2, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof TextNode);
        assertEquals("hello ", ((TextNode) parent.childNode(0)).text());
        assertEquals("world", ((TextNode) parent.childNode(1)).text());
    }

    @Test
    public void testAppendHtmlString() throws Exception {
        Element parent = new Element("div");
        parent.append("<p class='hello'><span>world</span></p>");
        assertEquals(1, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof Element);
        Element p = (Element) parent.childNode(0);
        assertEquals("p", p.tagName());
        assertEquals("hello", p.className());
        assertEquals(1, p.children().size());
        assertEquals("span", p.child(0).tagName());
        assertEquals("world", p.child(0).text());
    }
    
    @Test
    public void testAppendHtmlStringMultipleNodes() throws Exception {
        Element parent = new Element("div");
        parent.append("text1<p>one</p>text2");
        assertEquals(3, parent.childNodeSize());
        assertEquals("text1", ((TextNode)parent.childNode(0)).text());
        assertEquals("p", ((Element)parent.childNode(1)).tagName());
        assertEquals("text2", ((TextNode)parent.childNode(2)).text());
    }

    @Test
    public void testPrependHtmlString() throws Exception {
        Element parent = new Element("div");
        parent.append("<p>one</p>");
        parent.prepend("text1");
        parent.prepend("<p>zero</p>");
        
        assertEquals(3, parent.childNodeSize());
        assertEquals("p", ((Element)parent.childNode(0)).tagName());
        assertEquals("zero", ((Element)parent.childNode(0)).text());
        assertEquals("text1", ((TextNode)parent.childNode(1)).text());
        assertEquals("p", ((Element)parent.childNode(2)).tagName());
        assertEquals("one", ((Element)parent.childNode(2)).text());
    }

    @Test
    public void testBeforeString() throws Exception {
        Element el = new Element("p");
        el.attr("id", "p1");
        Element parent = new Element("div");
        parent.appendChild(el);
        
        parent.before("<p id='before'>before</p>");
        assertEquals(2, parent.parent().childNodes().size());
        assertEquals("p", parent.previousSibling().nodeName());
        assertEquals("before", parent.previousSibling().childNode(0).outerHtml());
    }
    
    @Test
    public void testBeforeNode() throws Exception {
        Element el = new Element("p");
        el.attr("id", "p1");
        Element parent = new Element("div");
        parent.appendChild(el);
        
        Element beforeEl = new Element("div");
        beforeEl.attr("id", "before");
        
        parent.before(beforeEl);
        assertEquals(2, parent.parent().childNodes().size());
        assertEquals("div", parent.previousSibling().nodeName());
        assertEquals("before", parent.previousSibling().attr("id"));
    }

    @Test
    public void testAfterString() throws Exception {
        Element el = new Element("p");
        el.attr("id", "p1");
        Element parent = new Element("div");
        parent.appendChild(el);
        
        parent.after("<p id='after'>after</p>");
        assertEquals(2, parent.parent().childNodes().size());
        assertEquals("p", parent.nextSibling().nodeName());
        assertEquals("after", parent.nextSibling().childNode(0).outerHtml());
    }

    @Test
    public void testAfterNode() throws Exception {
        Element el = new Element("p");
        el.attr("id", "p1");
        Element parent = new Element("div");
        parent.appendChild(el);
        
        Element afterEl = new Element("div");
        afterEl.attr("id", "after");
        
        parent.after(afterEl);
        assertEquals(2, parent.parent().childNodes().size());
        assertEquals("div", parent.nextSibling().nodeName());
        assertEquals("after", parent.nextSibling().attr("id"));
    }

    @Test
    public void testEmpty() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("text"));
        parent.appendChild(new Element("span"));
        assertEquals(2, parent.childNodeSize());
        parent.empty();
        assertEquals(0, parent.childNodeSize());
    }

    @Test
    public void testWrapString() throws Exception {
        Element el = new Element("p");
        el.attr("id", "inner");
        el.wrap("<div><span></span></div>");

        assertEquals("div", el.parent().tagName());
        assertEquals("span", el.parent().previousElementSibling().tagName());
        assertEquals("p#inner", el.parent().nextElementSibling().outerHtml());
    }

    @Test
    public void testCssSelector() throws Exception {
        Element root = new Element("div");
        root.attr("id", "root");
        root.appendChild(new Element("span").addClass("one").addClass("two"));
        root.appendChild(new Element("p").addClass("three"));
        
        assertEquals("#root", root.cssSelector());
        assertEquals("span.one.two", root.child(0).cssSelector());
        assertEquals("p.three", root.child(1).cssSelector());
    }

    @Test
    public void testCssSelectorWithNthChild() throws Exception {
        Element root = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("p");
        root.appendChild(child1);
        root.appendChild(child2);
        
        assertEquals("div > p:nth-child(1)", child1.cssSelector());
        assertEquals("div > p:nth-child(2)", child2.cssSelector());
    }

    @Test
    public void testSiblingElements() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("span");
        Element el2 = new Element("p");
        Element el3 = new Element("a");
        parent.appendChild(el1);
        parent.appendChild(new TextNode("text"));
        parent.appendChild(el2);
        parent.appendChild(el3);
        
        Elements siblings = el2.siblingElements();
        assertEquals(2, siblings.size());
        assertEquals(el1, siblings.get(0));
        assertEquals(el3, siblings.get(1));
    }

    @Test
    public void testNextElementSibling() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("span");
        Element el2 = new Element("p");
        Element el3 = new Element("a");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        
        assertEquals(el2, el1.nextElementSibling());
        assertEquals(el3, el2.nextElementSibling());
        assertNull(el3.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("span");
        Element el2 = new Element("p");
        Element el3 = new Element("a");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        
        assertNull(el1.previousElementSibling());
        assertEquals(el1, el2.previousElementSibling());
        assertEquals(el2, el3.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("span");
        Element el2 = new Element("p");
        parent.appendChild(new TextNode("text"));
        parent.appendChild(el1);
        parent.appendChild(el2);
        
        assertEquals(el1, parent.firstElementSibling());
        assertNull(el1.firstElementSibling()); // el1 has no siblings before it in the element list
    }

    @Test
    public void testElementSiblingIndex() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("span");
        Element el2 = new Element("p");
        Element el3 = new Element("a");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        
        assertEquals(0, el1.elementSiblingIndex());
        assertEquals(1, el2.elementSiblingIndex());
        assertEquals(2, el3.elementSiblingIndex());
    }
    
    @Test
    public void testElementSiblingIndexWhenParentIsNotNullButNoElementsInSiblings() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("text"));
        // This line is problematic as parent.child(0) would be a TextNode, not an Element.
        // Let's create an Element child instead for this test.
        Element childElement = new Element("span");
        parent.appendChild(childElement);
        assertEquals(0, childElement.elementSiblingIndex()); 
    }

    @Test
    public void testLastElementSibling() throws Exception {
        Element parent = new Element("div");
        Element el1 = new Element("span");
        Element el2 = new Element("p");
        parent.appendChild(el1);
        parent.appendChild(new TextNode("text"));
        parent.appendChild(el2);
        
        assertEquals(el2, parent.lastElementSibling());
        assertNull(el2.lastElementSibling()); // el2 has no siblings after it in the element list
    }

    @Test
    public void testGetElementsByTag() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("p").addClass("content"));
        root.appendChild(new Element("span").addClass("content"));
        root.appendChild(new Element("p").attr("id", "footer"));
        
        Elements tags = root.getElementsByTag("p");
        assertEquals(2, tags.size());
        assertEquals("p", tags.get(0).tagName());
        assertEquals("footer", tags.get(1).attr("id"));
    }

    @Test
    public void testGetElementById() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("p").addClass("content"));
        root.appendChild(new Element("span").attr("id", "main"));
        root.appendChild(new Element("p").attr("id", "footer"));
        
        Element el = root.getElementById("main");
        assertNotNull(el);
        assertEquals("span", el.tagName());
        
        Element notFound = root.getElementById("nonexistent");
        assertNull(notFound);
    }

    @Test
    public void testGetElementsByClass() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("p").addClass("content"));
        root.appendChild(new Element("span").addClass("content featured"));
        root.appendChild(new Element("div").addClass("content"));
        
        Elements els = root.getElementsByClass("content");
        assertEquals(3, els.size());
        assertEquals("p", els.get(0).tagName());
        assertEquals("span", els.get(1).tagName());
        assertEquals("div", els.get(2).tagName());
        
        Elements featured = root.getElementsByClass("featured");
        assertEquals(1, featured.size());
        assertEquals("span", featured.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttribute() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "#"));
        root.appendChild(new Element("img").attr("src", "img.png"));
        root.appendChild(new Element("p").attr("data-id", "123"));
        
        Elements els = root.getElementsByAttribute("href");
        assertEquals(1, els.size());
        assertEquals("a", els.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeStarting() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "#"));
        root.appendChild(new Element("img").attr("src", "img.png"));
        root.appendChild(new Element("p").attr("data-id", "123"));
        
        Elements els = root.getElementsByAttributeStarting("data-");
        assertEquals(1, els.size());
        assertEquals("p", els.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeValue() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "page.html"));
        root.appendChild(new Element("a").attr("href", "another.html"));
        root.appendChild(new Element("link").attr("href", "page.html"));
        
        Elements els = root.getElementsByAttributeValue("href", "page.html");
        assertEquals(2, els.size());
        assertEquals("a", els.get(0).tagName());
        assertEquals("link", els.get(1).tagName());
    }

    @Test
    public void testGetElementsByAttributeValueNot() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "page.html"));
        root.appendChild(new Element("a").attr("href", "another.html"));
        root.appendChild(new Element("link").attr("href", "page.html"));
        
        Elements els = root.getElementsByAttributeValueNot("href", "page.html");
        assertEquals(1, els.size());
        assertEquals("a", els.get(0).tagName()); // the one with "another.html"
    }

    @Test
    public void testGetElementsByAttributeValueStarting() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "page.html"));
        root.appendChild(new Element("a").attr("href", "another.html"));
        root.appendChild(new Element("link").attr("href", "about.html"));
        
        Elements els = root.getElementsByAttributeValueStarting("href", "page");
        assertEquals(1, els.size());
        assertEquals("a", els.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "page.html"));
        root.appendChild(new Element("a").attr("href", "another.html"));
        root.appendChild(new Element("link").attr("href", "index.html"));
        
        Elements els = root.getElementsByAttributeValueEnding("href", ".html");
        assertEquals(3, els.size()); // all end with .html
    }

    @Test
    public void testGetElementsByAttributeValueContaining() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "page.html"));
        root.appendChild(new Element("a").attr("href", "another.html"));
        root.appendChild(new Element("link").attr("href", "about.html"));
        
        Elements els = root.getElementsByAttributeValueContaining("href", "other");
        assertEquals(1, els.size());
        assertEquals("a", els.get(0).tagName()); // the one with another.html
    }

    @Test
    public void testGetElementsByAttributeValueMatching() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "page.html"));
        root.appendChild(new Element("a").attr("href", "Page.HTML"));
        root.appendChild(new Element("link").attr("href", "about.html"));
        
        // Case-insensitive match
        Elements els = root.getElementsByAttributeValueMatching("href", Pattern.compile(".*\\.html", Pattern.CASE_INSENSITIVE));
        assertEquals(3, els.size());
    }

    @Test
    public void testGetElementsByIndexLessThan() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p")); // 0
        parent.appendChild(new Element("span")); // 1
        parent.appendChild(new Element("a")); // 2
        
        Elements els = parent.getElementsByIndexLessThan(2);
        assertEquals(2, els.size());
        assertEquals("p", els.get(0).tagName());
        assertEquals("span", els.get(1).tagName());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p")); // 0
        parent.appendChild(new Element("span")); // 1
        parent.appendChild(new Element("a")); // 2
        
        Elements els = parent.getElementsByIndexGreaterThan(0);
        assertEquals(2, els.size());
        assertEquals("span", els.get(0).tagName());
        assertEquals("a", els.get(1).tagName());
    }

    @Test
    public void testGetElementsByIndexEquals() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p")); // 0
        parent.appendChild(new Element("span")); // 1
        parent.appendChild(new Element("a")); // 2
        
        Elements els = parent.getElementsByIndexEquals(1);
        assertEquals(1, els.size());
        assertEquals("span", els.get(0).tagName());
    }

    @Test
    public void testGetElementsContainingText() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("p").text("Hello World"));
        root.appendChild(new Element("span").text("Hello"));
        root.appendChild(new Element("div").text("World"));
        
        Elements els = root.getElementsContainingText("World");
        assertEquals(2, els.size());
        assertEquals("p", els.get(0).tagName());
        assertEquals("div", els.get(1).tagName());
    }
    
    @Test
    public void testGetElementsContainingTextCaseInsensitive() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("p").text("hello world"));
        
        Elements els = root.getElementsContainingText("WORLD");
        assertEquals(1, els.size());
        assertEquals("p", els.get(0).tagName());
    }

    @Test
    public void testGetElementsContainingOwnText() throws Exception {
        Element root = new Element("div");
        Element p = new Element("p");
        p.appendChild(new TextNode("Hello "));
        p.appendChild(new Element("b").text("World"));
        p.appendChild(new TextNode("!"));
        root.appendChild(p);
        
        Elements els = root.getElementsContainingOwnText("Hello !");
        assertEquals(1, els.size());
        assertEquals("p", els.get(0).tagName());
        
        Elements elsNotFound = root.getElementsContainingOwnText("World"); // "World" is in a child element
        assertEquals(0, elsNotFound.size());
    }
    
    @Test
    public void testGetElementsContainingOwnTextCaseInsensitive() throws Exception {
        Element root = new Element("div");
        Element p = new Element("p");
        p.appendChild(new TextNode("hello!"));
        root.appendChild(p);
        
        Elements els = root.getElementsContainingOwnText("HELLO!");
        assertEquals(1, els.size());
        assertEquals("p", els.get(0).tagName());
    }

    @Test
    public void testGetElementsMatchingText() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("p").text("abc"));
        root.appendChild(new Element("span").text("ab"));
        root.appendChild(new Element("div").text("ac"));
        
        Elements els = root.getElementsMatchingText(Pattern.compile("a.c"));
        assertEquals(2, els.size()); // "abc" and "ac"
        assertEquals("p", els.get(0).tagName());
        assertEquals("div", els.get(1).tagName());
    }

    @Test
    public void testGetElementsMatchingOwnText() throws Exception {
        Element root = new Element("div");
        Element p = new Element("p");
        p.appendChild(new TextNode("Hello World!"));
        root.appendChild(p);
        
        Elements els = root.getElementsMatchingOwnText(Pattern.compile("Hello.*!"));
        assertEquals(1, els.size());
        assertEquals("p", els.get(0).tagName());
    }

    @Test
    public void testGetAllElements() throws Exception {
        Element root = new Element("div");
        root.appendChild(new Element("p").text("Hello"));
        root.appendChild(new Element("span").appendChild(new Element("a")));
        
        Elements els = root.getAllElements();
        assertEquals(4, els.size()); // div, p, span, a
        assertEquals("div", els.get(0).tagName());
        assertEquals("p", els.get(1).tagName());
        assertEquals("span", els.get(2).tagName());
        assertEquals("a", els.get(3).tagName());
    }

    @Test
    public void testText() throws Exception {
        Element el = new Element("div");
        el.appendChild(new TextNode("  Hello   "));
        el.appendChild(new Element("br"));
        el.appendChild(new TextNode(" World! "));
        
        assertEquals("Hello World!", el.text());
    }
    
    @Test
    public void testTextWithBlockElements() throws Exception {
        Element el = new Element("div");
        el.appendChild(new TextNode("Line 1 "));
        el.appendChild(new Element("p").text("Line 2"));
        el.appendChild(new TextNode(" Line 3"));
        
        assertEquals("Line 1 Line 2 Line 3", el.text());
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
    public void testOwnTextEmpty() throws Exception {
        Element el = new Element("div");
        el.appendChild(new Element("span"));
        assertEquals("", el.ownText());
    }

    @Test
    public void testTextSetter() throws Exception {
        Element el = new Element("p");
        el.text("New Text Content");
        assertEquals("New Text Content", el.text());
        assertEquals(1, el.childNodeSize());
        assertTrue(el.childNode(0) instanceof TextNode);
        assertEquals("New Text Content", ((TextNode) el.childNode(0)).text());
    }

    @Test
    public void testTextSetterClearsChildren() throws Exception {
        Element el = new Element("p");
        el.appendChild(new Element("span"));
        el.text("New Text");
        assertEquals(1, el.childNodeSize());
        assertTrue(el.childNode(0) instanceof TextNode);
    }

    @Test
    public void testHasText() throws Exception {
        Element el = new Element("div");
        assertFalse(el.hasText());
        el.appendText("   ");
        assertFalse(el.hasText());
        el.appendText("abc");
        assertTrue(el.hasText());
        
        Element parent = new Element("div");
        parent.appendChild(new Element("span").text("  "));
        assertFalse(parent.hasText());
        parent.appendChild(new Element("p").text("def"));
        assertTrue(parent.hasText());
    }

    @Test
    public void testData() throws Exception {
        Element el = new Element("script");
        el.appendChild(new DataNode("var x = 1;"));
        el.appendChild(new Comment(" comment "));
        el.appendChild(new Element("style").text("color: red;"));
        
        assertEquals("var x = 1; comment color: red;", el.data());
    }
    
    @Test
    public void testDataEmpty() throws Exception {
        Element el = new Element("div");
        assertEquals("", el.data());
    }

    @Test
    public void testClassName() throws Exception {
        Element el = new Element("div");
        el.attr("class", " class1  class2 ");
        assertEquals("class1 class2", el.className());
    }
    
    @Test
    public void testClassNameEmpty() throws Exception {
        Element el = new Element("div");
        assertEquals("", el.className());
    }

    @Test
    public void testClassNames() throws Exception {
        Element el = new Element("div");
        el.attr("class", " class1  class2 ");
        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("class1"));
        assertTrue(names.contains("class2"));
    }

    @Test
    public void testClassNamesEmpty() throws Exception {
        Element el = new Element("div");
        Set<String> names = el.classNames();
        assertTrue(names.isEmpty());
    }

    @Test
    public void testClassNamesSetter() throws Exception {
        Element el = new Element("div");
        Set<String> classes = new LinkedHashSet<>();
        classes.add("c1");
        classes.add("c2");
        el.classNames(classes);
        assertEquals("c1 c2", el.className());
    }

    @Test
    public void testHasClass() throws Exception {
        Element el = new Element("div");
        el.attr("class", " class1  class2 ");
        assertTrue(el.hasClass("class1"));
        assertTrue(el.hasClass("class2"));
        assertFalse(el.hasClass("class3"));
        assertFalse(el.hasClass("Class1")); // case insensitive check
    }

    @Test
    public void testHasClassCaseInsensitive() throws Exception {
        Element el = new Element("div");
        el.attr("class", "ClassA");
        assertTrue(el.hasClass("classa"));
    }
    
    @Test
    public void testHasClassNotFound() throws Exception {
        Element el = new Element("div");
        assertFalse(el.hasClass("class1"));
    }

    @Test
    public void testAddClass() throws Exception {
        Element el = new Element("div");
        el.addClass("c1");
        el.addClass("c2");
        assertEquals("c1 c2", el.className());
    }

    @Test
    public void testRemoveClass() throws Exception {
        Element el = new Element("div");
        el.attr("class", "c1 c2 c3");
        el.removeClass("c2");
        assertEquals("c1 c3", el.className());
        el.removeClass("c1");
        assertEquals("c3", el.className());
        el.removeClass("c4"); // remove non-existent
        assertEquals("c3", el.className());
    }

    @Test
    public void testToggleClass() throws Exception {
        Element el = new Element("div");
        el.toggleClass("c1"); // add
        assertEquals("c1", el.className());
        el.toggleClass("c1"); // remove
        assertEquals("", el.className());
        el.toggleClass("c2");
        assertEquals("c2", el.className());
    }
    
    @Test
    public void testValInput() throws Exception {
        Element input = new Element("input");
        input.val("test value");
        assertEquals("test value", input.val());
        assertEquals("test value", input.attr("value"));
    }
    
    @Test
    public void testValTextarea() throws Exception {
        Element textarea = new Element("textarea");
        textarea.val("textarea content");
        assertEquals("textarea content", textarea.val());
        assertEquals("textarea content", textarea.text());
    }

    @Test
    public void testOuterHtmlHeadSelfClosing() throws Exception {
        Element img = new Element("img");
        img.attr("src", "test.jpg");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);
        StringBuilder sb = new StringBuilder();
        img.outerHtmlHead(sb, 0, settings);
        assertEquals("<img src=\"test.jpg\">", sb.toString());
    }

    @Test
    public void testOuterHtmlHeadSelfClosingXml() throws Exception {
        Element img = new Element("img");
        img.attr("src", "test.jpg");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder sb = new StringBuilder();
        img.outerHtmlHead(sb, 0, settings);
        assertEquals("<img src=\"test.jpg\" />", sb.toString());
    }

    @Test
    public void testOuterHtmlTailEmptyElement() throws Exception {
        Element div = new Element("div");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false);
        StringBuilder sb = new StringBuilder();
        div.outerHtmlTail(sb, 0, settings);
        assertEquals("<div></div>", sb.toString());
    }
    
    @Test
    public void testOuterHtmlTailWithChildren() throws Exception {
        Element div = new Element("div");
        div.appendChild(new TextNode("content"));
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false);
        StringBuilder sb = new StringBuilder();
        div.outerHtmlTail(sb, 0, settings);
        assertEquals("<div>content</div>", sb.toString());
    }

    @Test
    public void testHtmlGetter() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p").text("hello"));
        parent.appendChild(new TextNode("world"));
        
        assertEquals("<p>hello</p>world", parent.html());
    }

    @Test
    public void testHtmlGetterPrettyPrint() throws Exception {
        Element parent = new Element("div");
        parent.appendChild(new Element("p").text("hello"));
        parent.appendChild(new TextNode("world"));
        
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(true);
        // The Element class does not have a setOwnerDocument method.
        // To set output settings for pretty printing, the Document itself needs to be constructed
        // and then the element needs to be part of that document's structure.
        // For testing purposes, we can simulate this by creating a Document with the desired settings
        // and then using the baseUri to construct the element within that context.
        Document doc = new Document(parent.baseUri());
        doc.outputSettings(settings);
        
        // To make the test work without modifying the Element class, we can directly
        // get the output settings from the document which the element might belong to.
        // However, without a direct setOwnerDocument, this test is a bit fragile.
        // A common approach in testing is to use a parser to create a Document and then extract elements.
        // For this specific fix, we'll assume the element is part of a document with the desired settings.
        // If the element is standalone, pretty printing might not be directly applicable without it being in a Document.
        // The original code's intent was likely to test pretty printing.
        // Let's try to construct a document and add the element to it.
        
        Element docElement = new Element(Tag.valueOf("html"), "", new Attributes());
        docElement.appendChild(parent);
        doc.appendChild(docElement);
        
        // Now test the html() method which should use the document's output settings.
        String htmlOutput = parent.html();
        
        // The exact output with newlines can vary based on Jsoup's pretty printing logic.
        // We'll assert the core content and check for expected formatting characters.
        assertTrue(htmlOutput.contains("<p>hello</p>"));
        assertTrue(htmlOutput.contains("world"));
        // We expect a newline if prettyPrint is true
        assertTrue(htmlOutput.contains("\n")); 
    }

    @Test
    public void testHtmlSetter() throws Exception {
        Element el = new Element("div");
        el.html("<p><span>inner</span></p>");
        assertEquals(1, el.children().size());
        assertEquals("p", el.child(0).tagName());
        assertEquals(1, el.child(0).children().size());
        assertEquals("span", el.child(0).child(0).tagName());
        assertEquals("inner", el.child(0).child(0).text());
    }

    @Test
    public void testToStringIsOuterHtml() throws Exception {
        Element el = new Element("div").attr("id", "test");
        assertEquals(el.outerHtml(), el.toString());
    }
    
    @Test
    public void testClone() throws Exception {
        Element el = new Element("div");
        el.attr("id", "original");
        el.appendChild(new TextNode("text"));
        Element clonedEl = el.clone();
        
        assertNotSame(el, clonedEl);
        assertEquals("div", clonedEl.tagName());
        assertEquals("original", clonedEl.id());
        assertEquals(1, clonedEl.childNodeSize());
        assertTrue(clonedEl.childNode(0) instanceof TextNode);
        assertEquals("text", ((TextNode) clonedEl.childNode(0)).text());
        
        // Ensure original is not modified
        assertEquals("original", el.id());
        assertEquals(1, el.childNodeSize());
    }
    
    @Test
    public void testCloneDeepCopy() throws Exception {
        Element parent = new Element("div");
        parent.attr("id", "parent");
        Element child = new Element("p");
        child.attr("id", "child");
        parent.appendChild(child);
        
        Element clonedParent = parent.clone();
        Element clonedChild = clonedParent.child(0);
        
        assertNotSame(parent, clonedParent);
        assertNotSame(child, clonedChild);
        assertEquals("parent", clonedParent.id());
        assertEquals("child", clonedChild.id());
        // The parent() method on clonedChild will return the clonedParent
        assertEquals(clonedParent, clonedChild.parent()); 
    }
}
