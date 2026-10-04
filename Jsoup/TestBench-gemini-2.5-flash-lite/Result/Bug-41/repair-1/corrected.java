package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ElementTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testNodeName() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("div", div.nodeName());
    }

    @Test
    public void testTagName() {
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        assertEquals("span", span.tagName());
    }

    @Test
    public void testTagNameMutable() {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        assertEquals("p", p.tagName());
        p.tagName("div");
        assertEquals("div", p.tagName());
    }

    @Test
    public void testTag() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals(Tag.valueOf("div"), div.tag());
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
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", div.id());
        div.attr("id", "myId");
        assertEquals("myId", div.id());
    }

    @Test
    public void testAttr() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.attr("key", "value");
        assertEquals("value", div.attr("key"));
    }

    @Test
    public void testDataset() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(div.dataset().isEmpty());
        div.attr("data-key", "value");
        assertEquals("value", div.dataset().get("key"));
        div.attr("data-another", "anotherValue");
        assertEquals("anotherValue", div.dataset().get("another"));
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
        Element grand = new Element(Tag.valueOf("div"), "http://example.com");
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        grand.appendChild(parent);
        parent.appendChild(child);

        Elements parents = child.parents();
        assertEquals(2, parents.size());
        assertEquals(parent, parents.get(0));
        assertEquals(grand, parents.get(1));
    }

    @Test
    public void testChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new Element(Tag.valueOf("span"), "http://example.com"));
        parent.child(1);
    }

    @Test
    public void testChildren() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode text1 = new TextNode("hello", "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(text1);
        parent.appendChild(child2);

        Elements children = parent.children();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        assertEquals(child2, children.get(1));
    }

    @Test
    public void testTextNodes() {
        Element parent = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode text1 = new TextNode("one", "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        TextNode text2 = new TextNode("two", "http://example.com");
        parent.appendChild(text1);
        parent.appendChild(child1);
        parent.appendChild(text2);

        List<TextNode> textNodes = parent.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals(text1, textNodes.get(0));
        assertEquals(text2, textNodes.get(1));
    }

    @Test
    public void testDataNodes() {
        Element parent = new Element(Tag.valueOf("script"), "http://example.com");
        DataNode data1 = new DataNode("var x = 1;", "http://example.com");
        Element child1 = new Element(Tag.valueOf("style"), "http://example.com");
        DataNode data2 = new DataNode("body { color: red; }", "http://example.com");
        parent.appendChild(data1);
        parent.appendChild(child1);
        parent.appendChild(data2);

        List<DataNode> dataNodes = parent.dataNodes();
        assertEquals(2, dataNodes.size());
        assertEquals(data1, dataNodes.get(0));
        assertEquals(data2, dataNodes.get(1));
    }

    @Test
    public void testSelect() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").addClass("content");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").addClass("content").attr("id", "main");
        TextNode text1 = new TextNode("some text", "http://example.com");

        root.appendChild(div1);
        div1.appendChild(p1);
        div1.appendChild(text1);
        root.appendChild(div2);

        Elements selected = root.select("div.content");
        assertEquals(2, selected.size());
        assertTrue(selected.contains(div1));
        assertTrue(selected.contains(div2));

        selected = root.select("#main");
        assertEquals(1, selected.size());
        assertEquals(div2, selected.get(0));
    }

    @Test
    public void testAppendChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child);
        assertEquals(1, parent.childNodeSize());
        assertEquals(child, parent.childNode(0));
    }

    @Test
    public void testPrependChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
    }

    @Test
    public void testInsertChildren() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child3 = new Element(Tag.valueOf("a"), "http://example.com");
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
    public void testInsertChildrenAtEnd() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        List<Node> childrenToInsert = new ArrayList<>();
        childrenToInsert.add(child2);
        parent.insertChildren(-1, childrenToInsert); // -1 should insert at the end

        assertEquals(2, parent.childNodeSize());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
    }

    @Test
    public void testAppendElement() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(1, parent.children().size());
        assertEquals(child, parent.children().get(0));
    }

    @Test
    public void testPrependElement() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = parent.appendElement("span");
        Element child2 = parent.prependElement("p");
        assertEquals("p", child2.tagName());
        assertEquals(2, parent.children().size());
        assertEquals(child2, parent.children().get(0));
        assertEquals(child1, parent.children().get(1));
    }

    @Test
    public void testAppendText() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendText("hello");
        assertEquals(1, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof TextNode);
        assertEquals("hello", ((TextNode) parent.childNodes().get(0)).text());
    }

    @Test
    public void testPrependText() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        TextNode text1 = new TextNode("world", "http://example.com");
        parent.appendChild(text1);
        parent.prependText("hello");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof TextNode);
        assertEquals("hello", ((TextNode) parent.childNodes().get(0)).text());
        assertEquals(text1, parent.childNodes().get(1));
    }

    @Test
    public void testAppendHtml() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.append("<span><p>inner</p></span>");
        assertEquals(1, parent.children().size());
        Element span = parent.child(0);
        assertEquals("span", span.tagName());
        assertEquals(1, span.children().size());
        Element p = span.child(0);
        assertEquals("p", p.tagName());
        assertEquals("inner", p.text());
    }

    @Test
    public void testPrependHtml() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = parent.appendElement("p");
        parent.prepend("<span>text</span>");
        assertEquals(2, parent.children().size());
        assertEquals("span", parent.child(0).tagName());
        assertEquals("p", parent.child(1).tagName());
        assertEquals("text", parent.child(0).text());
    }

    @Test
    public void testBeforeString() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        Element parent = new Element(Tag.valueOf("body"), "http://example.com");
        parent.appendChild(target);
        target.before("<p>added</p>");
        assertEquals(2, parent.childNodes().size());
        assertEquals("p", parent.childNode(0).nodeName());
        assertEquals("added", parent.childNode(0).outerHtml().replace("<p>","").replace("</p>","")); // Simple check for text content
        assertEquals(target, parent.childNode(1));
    }

    @Test
    public void testAfterString() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        Element parent = new Element(Tag.valueOf("body"), "http://example.com");
        parent.appendChild(target);
        target.after("<span>added</span>");
        assertEquals(2, parent.childNodes().size());
        assertEquals(target, parent.childNode(0));
        assertEquals("span", parent.childNode(1).nodeName());
        assertEquals("added", parent.childNode(1).outerHtml().replace("<span>","").replace("</span>",""));
    }

    @Test
    public void testEmpty() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new Element(Tag.valueOf("span"), "http://example.com"));
        parent.appendChild(new TextNode("text", "http://example.com"));
        parent.empty();
        assertEquals(0, parent.childNodes().size());
    }

    @Test
    public void testWrap() {
        Element content = new Element(Tag.valueOf("p"), "http://example.com").text("content");
        content.wrap("<div></div>");
        Element wrapper = content.parent();
        assertEquals("div", wrapper.tagName());
        assertEquals(1, wrapper.children().size());
        assertEquals(content, wrapper.child(0));
    }

    @Test
    public void testCssSelector() {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("id", "main");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").addClass("content").addClass("primary");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com");

        root.appendChild(body);
        body.appendChild(div1);
        div1.appendChild(div2);
        div2.appendChild(p1);

        assertEquals("#main", div1.cssSelector());
        assertEquals("body > div#main > div.content.primary", div2.cssSelector());
        assertEquals("body > div#main > div.content.primary > p", p1.cssSelector());
    }

    @Test
    public void testSiblingElements() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        TextNode text1 = new TextNode("hello", "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(text1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        Elements siblings = child1.siblingElements();
        assertEquals(2, siblings.size());
        assertEquals(child2, siblings.get(0));
        assertEquals(child3, siblings.get(1));

        siblings = child2.siblingElements();
        assertEquals(2, siblings.size());
        assertEquals(child1, siblings.get(0));
        assertEquals(child3, siblings.get(1));

        siblings = child3.siblingElements();
        assertEquals(2, siblings.size());
        assertEquals(child1, siblings.get(0));
        assertEquals(child2, siblings.get(1));
    }

    @Test
    public void testNextElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        assertEquals(child2, child1.nextElementSibling());
        assertEquals(child3, child2.nextElementSibling());
        assertNull(child3.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        assertNull(child1.previousElementSibling());
        assertEquals(child1, child2.previousElementSibling());
        assertEquals(child2, child3.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(child1, parent.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingWhenNoSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        assertNull(parent.firstElementSibling()); // Should return null if only one element or no elements
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode text1 = new TextNode("hello", "http://example.com");
        Element child3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(text1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        assertEquals(0, child1.elementSiblingIndex().intValue());
        assertEquals(2, child2.elementSiblingIndex().intValue());
        assertEquals(3, child3.elementSiblingIndex().intValue());
    }

    @Test
    public void testElementSiblingIndexNoSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        assertEquals(0, child1.elementSiblingIndex().intValue()); // Should be 0 if it's the only child element
    }


    @Test
    public void testLastElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(child2, parent.lastElementSibling());
    }

    @Test
    public void testLastElementSiblingWhenNoSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        assertNull(parent.lastElementSibling()); // Should return null if only one element or no elements
    }

    @Test
    public void testGetElementsByTag() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByTag("div");
        assertEquals(3, found.size());
        assertTrue(found.contains(root));
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));

        found = div1.getElementsByTag("p");
        assertEquals(1, found.size());
        assertEquals(p1, found.get(0));
    }

    @Test
    public void testGetElementById() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("id", "myId");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("id", "myId");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        assertEquals(div1, root.getElementById("myId"));
        assertNull(p1.getElementById("myId"));
    }

    @Test
    public void testGetElementsByClass() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").addClass("content");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").addClass("content");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").addClass("content").addClass("primary");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByClass("content");
        assertEquals(3, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(p1));
        assertTrue(found.contains(div2));

        found = div1.getElementsByClass("primary");
        assertTrue(found.isEmpty());
    }

    @Test
    public void testGetElementsByAttribute() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "link");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("src", "img");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "another");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByAttribute("href");
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));

        found = div1.getElementsByAttribute("src");
        assertTrue(found.isEmpty());
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("data-id", "1");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("data-name", "test");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("id", "main");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByAttributeStarting("data-");
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(p1));

        found = div1.getElementsByAttributeStarting("id-");
        assertTrue(found.isEmpty());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("rel", "nofollow");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("rel", "stylesheet");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("rel", "nofollow");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByAttributeValue("rel", "nofollow");
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));

        found = div1.getElementsByAttributeValue("rel", "stylesheet");
        assertTrue(found.isEmpty());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("rel", "nofollow");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("rel", "stylesheet");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("rel", "nofollow");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByAttributeValueNot("rel", "nofollow");
        assertEquals(1, found.size());
        assertEquals(p1, found.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("href", "https://example.com");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "ftp://example.com");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByAttributeValueStarting("href", "http");
        assertEquals(1, found.size());
        assertEquals(div1, found.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "page.html");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("href", "image.png");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "index.html");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByAttributeValueEnding("href", ".html");
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "section1/page.html");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("href", "section2/image.png");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "section1/about.html");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByAttributeValueContaining("href", "section1");
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "page1.html");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("href", "image_001.png");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "page2.html");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByAttributeValueMatching("href", Pattern.compile("page\\d+\\.html"));
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));
    }

    @Test
    public void testGetElementsByAttributeValueMatchingString() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "page1.html");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").attr("href", "image_001.png");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").attr("href", "page2.html");
        root.appendChild(div1);
        div1.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsByAttributeValueMatching("href", "page\\d+\\.html");
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        Elements found = parent.getElementsByIndexLessThan(2);
        assertEquals(2, found.size());
        assertTrue(found.contains(child1));
        assertTrue(found.contains(child2));
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child3 = new Element(Element.TAG_KEY, "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        Elements found = parent.getElementsByIndexGreaterThan(0);
        assertEquals(2, found.size());
        assertTrue(found.contains(child2));
        assertTrue(found.contains(child3));
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        Elements found = parent.getElementsByIndexEquals(1);
        assertEquals(1, found.size());
        assertEquals(child2, found.get(0));
    }

    @Test
    public void testGetElementsContainingText() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").text("Hello World");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").text("Just a test");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").text("Hello again");
        Element nested = new Element(Tag.valueOf("span"), "http://example.com").text("nested text");
        div1.appendChild(nested);
        root.appendChild(div1);
        root.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsContainingText("hello");
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));

        found = root.getElementsContainingText("nested");
        assertEquals(1, found.size());
        assertEquals(div1, found.get(0));
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").text("Hello World");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").text("Just a test");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").text("Hello again");
        Element nested = new Element(Tag.valueOf("span"), "http://example.com").text("nested text");
        div1.appendChild(nested);
        root.appendChild(div1);
        root.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsContainingOwnText("hello");
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));

        found = root.getElementsContainingOwnText("nested");
        assertTrue(found.isEmpty());
    }

    @Test
    public void testGetElementsMatchingText() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").text("One Two Three");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").text("Four Five");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").text("One Six");
        root.appendChild(div1);
        root.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsMatchingText(Pattern.compile(".*One.*"));
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));
    }

    @Test
    public void testGetElementsMatchingTextString() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").text("One Two Three");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").text("Four Five");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").text("One Six");
        root.appendChild(div1);
        root.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsMatchingText(".*One.*");
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));
    }

    @Test
    public void testGetElementsMatchingOwnText() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").text("One Two Three");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").text("Four Five");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").text("One Six");
        Element nested = new Element(Tag.valueOf("span"), "http://example.com").text("nested only");
        div1.appendChild(nested);
        root.appendChild(div1);
        root.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsMatchingOwnText(Pattern.compile(".*One.*"));
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));

        found = root.getElementsMatchingOwnText("nested only");
        assertTrue(found.isEmpty());
    }

    @Test
    public void testGetElementsMatchingOwnTextString() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com").text("One Two Three");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com").text("Four Five");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com").text("One Six");
        Element nested = new Element(Tag.valueOf("span"), "http://example.com").text("nested only");
        div1.appendChild(nested);
        root.appendChild(div1);
        root.appendChild(p1);
        root.appendChild(div2);

        Elements found = root.getElementsMatchingOwnText(".*One.*");
        assertEquals(2, found.size());
        assertTrue(found.contains(div1));
        assertTrue(found.contains(div2));

        found = root.getElementsMatchingOwnText("nested only");
        assertTrue(found.isEmpty());
    }

    @Test
    public void testGetAllElements() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com");
        div1.appendChild(p1);
        root.appendChild(div1);
        root.appendChild(div2);

        Elements all = root.getAllElements();
        assertEquals(4, all.size());
        assertTrue(all.contains(root));
        assertTrue(all.contains(div1));
        assertTrue(all.contains(p1));
        assertTrue(all.contains(div2));
    }

    @Test
    public void testText() {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        p.appendChild(new TextNode("  Hello ", "http://example.com"));
        p.appendChild(new Element(Tag.valueOf("b"), "http://example.com").text("World"));
        p.appendChild(new TextNode(" now! ", "http://example.com"));
        assertEquals("Hello World now!", p.text());
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
        p.appendChild(new TextNode("Hello", "http://example.com"));
        p.appendChild(new Element(Tag.valueOf("b"), "http://example.com").text("World"));
        p.appendChild(new TextNode("now!", "http://example.com"));
        assertEquals("Hello now!", p.ownText());
    }

    @Test
    public void testOwnTextWithBr() {
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        p.appendChild(new TextNode("Line 1", "http://example.com"));
        p.appendChild(new Element(Tag.valueOf("br"), "http://example.com"));
        p.appendChild(new TextNode(" Line 2", "http://example.com"));
        assertEquals("Line 1 Line 2", p.ownText());
    }

    @Test
    public void testHasText() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(!div.hasText());
        div.appendText("some text");
        assertTrue(div.hasText());
    }

    @Test
    public void testHasTextWithWhitespace() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(!div.hasText());
        div.appendText("   \n \t ");
        assertTrue(!div.hasText());
        div.appendText(" text ");
        assertTrue(div.hasText());
    }

    @Test
    public void testData() {
        Element script = new Element(Tag.valueOf("script"), "http://example.com");
        script.appendChild(new DataNode("var x = 1;", "http://example.com"));
        script.appendChild(new Element(Tag.valueOf("style"), "http://example.com").text("body { color: red; }"));
        script.appendChild(new DataNode(" var y = 2; ", "http://example.com"));
        assertEquals("var x = 1;body { color: red; } var y = 2; ", script.data());
    }

    @Test
    public void testClassName() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", div.className());
        div.attr("class", "  my-class another ");
        assertEquals("my-class another", div.className());
    }

    @Test
    public void testClassNames() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.attr("class", " header gray main ");
        Set<String> classes = div.classNames();
        assertEquals(3, classes.size());
        assertTrue(classes.contains("header"));
        assertTrue(classes.contains("gray"));
        assertTrue(classes.contains("main"));
    }

    @Test
    public void testClassNamesEmpty() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        Set<String> classes = div.classNames();
        assertEquals(0, classes.size());
        assertTrue(classes.isEmpty());
    }

    @Test
    public void testClassNamesSet() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        Set<String> newClasses = new HashSet<>(Arrays.asList("btn", "btn-primary"));
        div.classNames(newClasses);
        assertEquals("btn btn-primary", div.className());
    }

    @Test
    public void testHasClass() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com").addClass("header gray");
        assertTrue(div.hasClass("header"));
        assertTrue(div.hasClass("gray"));
        assertFalse(div.hasClass("main"));
        assertTrue(div.hasClass("HEADER")); // Case insensitive
    }

    @Test
    public void testAddClass() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.addClass("first");
        assertTrue(div.hasClass("first"));
        div.addClass("second");
        assertTrue(div.hasClass("second"));
        assertEquals("first second", div.className());
    }

    @Test
    public void testRemoveClass() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com").addClass("one two three");
        div.removeClass("two");
        assertFalse(div.hasClass("two"));
        assertEquals("one three", div.className());
        div.removeClass("four"); // Removing non-existent class
        assertEquals("one three", div.className());
    }

    @Test
    public void testToggleClassAdd() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.toggleClass("active");
        assertTrue(div.hasClass("active"));
        assertEquals("active", div.className());
    }

    @Test
    public void testToggleClassRemove() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com").addClass("active");
        div.toggleClass("active");
        assertFalse(div.hasClass("active"));
        assertEquals("", div.className());
    }

    @Test
    public void testValInput() {
        Element input = new Element(Tag.valueOf("input"), "http://example.com").attr("value", "initial");
        assertEquals("initial", input.val());
        input.val("new value");
        assertEquals("new value", input.val());
    }

    @Test
    public void testValTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com").text("initial content");
        assertEquals("initial content", textarea.val());
        textarea.val("new content");
        assertEquals("new content", textarea.val());
    }

    @Test
    public void testOuterHtmlHead() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com").attr("id", "main").addClass("content");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document("").outputSettings();
        div.outerHtmlHead(accum, 0, settings);
        assertEquals("<div id=\"main\" class=\"content\">", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadSelfClosing() {
        Element img = new Element(Tag.valueOf("img"), "http://example.com").attr("src", "logo.png");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document("").outputSettings();
        img.outerHtmlHead(accum, 0, settings);
        assertEquals("<img src=\"logo.png\" />", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document("").outputSettings();
        div.outerHtmlTail(accum, 0, settings);
        assertEquals("</div>", accum.toString());
    }

    @Test
    public void testOuterHtmlTailSelfClosing() {
        Element img = new Element(Tag.valueOf("img"), "http://example.com");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings settings = new Document("").outputSettings();
        img.outerHtmlTail(accum, 0, settings);
        assertEquals("", accum.toString()); // Self-closing tags have no tail
    }

    @Test
    public void testHtml() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new Element(Tag.valueOf("p"), "http://example.com").text("Hello"));
        parent.appendChild(new TextNode(" World", "http://example.com"));
        assertEquals("<p>Hello</p> World", parent.html());
    }

    @Test
    public void testHtmlWithPrettyPrint() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new Element(Tag.valueOf("p"), "http://example.com").text("Hello"));
        parent.appendChild(new TextNode(" World", "http://example.com"));
        Document.OutputSettings settings = new Document("").outputSettings();
        settings.prettyPrint(true);
        parent.outputSettings(settings);
        assertEquals("<p>Hello</p> World", parent.html());
    }


    @Test
    public void testSetHtml() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.html("<p>Initial</p><span>content</span>");
        assertEquals(2, parent.children().size());
        assertEquals("p", parent.child(0).tagName());
        assertEquals("span", parent.child(1).tagName());
        assertEquals("Initial", parent.child(0).text());
    }

    @Test
    public void testToString() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com").text("content");
        assertEquals("<div>content</div>", div.toString());
    }

    @Test
    public void testEqualsSameObject() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(div.equals(div));
    }

    @Test
    public void testEqualsDifferentClass() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        Node node = new TextNode("text", "http://example.com");
        assertFalse(div.equals(node));
    }

    @Test
    public void testEqualsDifferentTag() {
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element div2 = new Element(Tag.valueOf("span"), "http://example.com");
        assertFalse(div1.equals(div2));
    }

    @Test
    public void testHashCode() {
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals(div1.hashCode(), div2.hashCode());
    }

    @Test
    public void testClone() {
        Element original = new Element(Tag.valueOf("div"), "http://example.com").attr("id", "original");
        original.appendChild(new Element(Tag.valueOf("p"), "http://example.com").text("child"));
        Element cloned = original.clone();

        assertNotSame(original, cloned);
        assertEquals(original.tagName(), cloned.tagName());
        assertEquals(original.baseUri(), cloned.baseUri());
        assertEquals(original.attributes(), cloned.attributes());
        assertEquals(original.childNodeSize(), cloned.childNodeSize());
        assertNotSame(original.child(0), cloned.child(0));
        assertEquals(original.child(0), cloned.child(0)); // content equality
        assertEquals("original", cloned.attr("id"));
        assertEquals("child", cloned.child(0).text());
    }
}
