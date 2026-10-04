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
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("div", el.nodeName());
    }

    @Test
    public void testTagName() {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        assertEquals("span", el.tagName());
    }

    @Test
    public void testTagNameChange() {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        el.tagName("p");
        assertEquals("p", el.tagName());
    }

    @Test
    public void testTag() {
        Element el = new Element(Tag.valueOf("h1"), "http://example.com");
        assertEquals(Tag.valueOf("h1"), el.tag());
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
        el.attr("id", "myId");
        assertEquals("myId", el.id());
    }

    @Test
    public void testIdNotPresent() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.id());
    }

    @Test
    public void testAttr() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com");
        el.attr("href", "http://example.com");
        assertEquals("http://example.com", el.attr("href"));
    }

    @Test
    public void testAttrNotPresent() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com");
        assertEquals("", el.attr("href"));
    }

    @Test
    public void testDataset() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("data-id", "123");
        el.attr("data-name", "test");
        Map<String, String> dataset = el.dataset();
        assertEquals("123", dataset.get("id"));
        assertEquals("test", dataset.get("name"));
        assertEquals(2, dataset.size());
    }

    @Test
    public void testDatasetEmpty() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(el.dataset().isEmpty());
    }

    @Test
    public void testParent() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParents() {
        Element root = new Element(Tag.valueOf("#root"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        root.appendChild(body);
        body.appendChild(div);

        Elements parents = div.parents();
        assertEquals(2, parents.size());
        assertEquals(body, parents.get(0));
        assertEquals(root, parents.get(1));
    }

    @Test
    public void testChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.child(0);
    }

    @Test
    public void testChildren() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode textNode = new TextNode("some text", "http://example.com");
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
    public void testChildrenEmpty() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(parent.children().isEmpty());
    }

    @Test
    public void testTextNodes() {
        Element parent = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode text1 = new TextNode("hello ", "http://example.com");
        Element childEl = new Element(Tag.valueOf("b"), "http://example.com");
        childEl.text("world");
        TextNode text2 = new TextNode("!", "http://example.com");
        parent.appendChild(text1);
        parent.appendChild(childEl);
        parent.appendChild(text2);

        List<TextNode> textNodes = parent.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals("hello ", textNodes.get(0).getWholeText());
        assertEquals("!", textNodes.get(1).getWholeText());
    }

    @Test
    public void testTextNodesEmpty() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        assertTrue(parent.textNodes().isEmpty());
    }

    @Test
    public void testDataNodes() {
        Element parent = new Element(Tag.valueOf("script"), "http://example.com");
        DataNode data1 = new DataNode("var x = 1;", "http://example.com");
        DataNode data2 = new DataNode("var y = 2;", "http://example.com");
        parent.appendChild(data1);
        parent.appendChild(data2);

        List<DataNode> dataNodes = parent.dataNodes();
        assertEquals(2, dataNodes.size());
        assertEquals("var x = 1;", dataNodes.get(0).getWholeData());
        assertEquals("var y = 2;", dataNodes.get(1).getWholeData());
    }

    @Test
    public void testDataNodesEmpty() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new TextNode("some text", "http://example.com"));
        assertTrue(parent.dataNodes().isEmpty());
    }

    @Test
    public void testSelect() {
        Element root = new Element(Tag.valueOf("#root"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com");
        div1.attr("id", "d1");
        div1.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com");
        div2.attr("id", "d2");
        div2.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        div2.appendChild(new Element(Tag.valueOf("span"), "http://example.com"));
        root.appendChild(body);
        body.appendChild(div1);
        body.appendChild(div2);

        Elements ps = root.select("p");
        assertEquals(2, ps.size());
        assertEquals(div1.child(0), ps.get(0));
        assertEquals(div2.child(0), ps.get(1));

        Elements spans = root.select("span");
        assertEquals(1, spans.size());
        assertEquals(div2.child(1), spans.get(0));

        Elements divsWithId = root.select("div#d1");
        assertEquals(1, divsWithId.size());
        assertEquals(div1, divsWithId.get(0));
    }

    @Test
    public void testSelectEmpty() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(el.select("p").isEmpty());
    }

    @Test
    public void testAppendChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child);
        assertEquals(1, parent.childNodeSize());
        assertEquals(child, parent.childNode(0));
        assertEquals(0, child.siblingIndex());
    }

    @Test
    public void testPrependChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
        assertEquals(0, child2.siblingIndex());
        assertEquals(1, child1.siblingIndex());
    }

    @Test
    public void testInsertChildren() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child3 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child3);

        Element child2 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.insertChildren(1, Collections.singletonList(child2));

        assertEquals(3, parent.childNodeSize());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
        assertEquals(child3, parent.childNode(2));
        assertEquals(1, child2.siblingIndex());
    }

    @Test
    public void testInsertChildrenAtStart() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.insertChildren(0, Collections.singletonList(child2));

        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
    }

    @Test
    public void testInsertChildrenAtEnd() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.insertChildren(-1, Collections.singletonList(child2)); // -1 means end

        assertEquals(2, parent.childNodeSize());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
    }

    @Test
    public void testAppendElement() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("p");
        assertEquals("p", child.tagName());
        assertEquals(1, parent.children().size());
        assertEquals(child, parent.children().get(0));
    }

    @Test
    public void testPrependElement() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.prependElement("span");
        assertEquals("span", child2.tagName());
        assertEquals(2, parent.children().size());
        assertEquals(child2, parent.children().get(0));
        assertEquals(child1, parent.children().get(1));
    }

    @Test
    public void testAppendText() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendText("Hello");
        assertEquals(1, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof TextNode);
        assertEquals("Hello", ((TextNode) parent.childNodes().get(0)).getWholeText());
    }

    @Test
    public void testPrependText() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendText("World");
        parent.prependText("Hello ");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof TextNode);
        assertEquals("Hello ", ((TextNode) parent.childNodes().get(0)).getWholeText());
        assertEquals("World", ((TextNode) parent.childNodes().get(1)).getWholeText());
    }

    @Test
    public void testAppendHtml() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.append(" <p>Hello</p> <b>World</b> ");
        assertEquals(3, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof TextNode); // Whitespace
        assertEquals(" <p>Hello</p> <b>World</b> ", parent.html());
    }

    @Test
    public void testAppendHtmlWithExistingContent() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendText("Initial text.");
        parent.append(" <span>New content</span> ");
        assertEquals("Initial text. <span>New content</span> ", parent.html());
    }

    @Test
    public void testPrependHtml() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.prepend(" <p>Hello</p> <b>World</b> ");
        assertEquals(3, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof TextNode); // Whitespace
        assertEquals(" <p>Hello</p> <b>World</b> ", parent.html());
    }

    @Test
    public void testBeforeHtml() {
        Element element = new Element(Tag.valueOf("p"), "http://example.com");
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(element);
        element.before("<span>Before</span>");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNodes().get(0) instanceof Element);
        assertEquals("span", ((Element) parent.childNodes().get(0)).tagName());
        assertEquals("span", parent.previousElementSibling().tagName());
    }

    @Test
    public void testAfterHtml() {
        Element element = new Element(Tag.valueOf("p"), "http://example.com");
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(element);
        element.after("<span>After</span>");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNodes().get(1) instanceof Element);
        assertEquals("span", ((Element) parent.childNodes().get(1)).tagName());
        assertEquals("span", parent.nextElementSibling().tagName());
    }

    @Test
    public void testEmpty() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        parent.appendChild(new TextNode("text", "http://example.com"));
        parent.empty();
        assertTrue(parent.childNodes().isEmpty());
    }

    @Test
    public void testWrapHtml() {
        Element element = new Element(Tag.valueOf("p"), "http://example.com");
        element.text("content");
        element.wrap("<div></div>");
        Element wrapper = element.parent();
        assertEquals("div", wrapper.tagName());
        assertEquals(element, wrapper.children().get(0));
        assertEquals("content", element.text());
    }

    @Test
    public void testCssSelectorWithId() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("id", "testId");
        assertEquals("#testId", el.cssSelector());
    }

    @Test
    public void testCssSelectorWithClass() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.addClass("class1");
        el.addClass("class2");
        assertEquals("div.class1.class2", el.cssSelector());
    }

    @Test
    public void testCssSelectorWithClassAndId() {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        el.attr("id", "id1");
        el.addClass("classA");
        assertEquals("#id1", el.cssSelector()); // ID should take precedence
    }

    @Test
    public void testCssSelectorNestedUnique() {
        Element root = new Element(Tag.valueOf("#root"), "http://example.com");
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.attr("class", "parentClass");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child);
        root.appendChild(parent);
        assertEquals("div.parentClass > span", child.cssSelector());
    }

    @Test
    public void testCssSelectorNestedAmbiguous() {
        Element root = new Element(Tag.valueOf("#root"), "http://example.com");
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        root.appendChild(parent);
        assertEquals("div > span:nth-child(2)", child2.cssSelector());
    }

    @Test
    public void testSiblingElements() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode tn = new TextNode("text", "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(tn);
        parent.appendChild(el2);

        Elements siblings = el1.siblingElements();
        assertEquals(1, siblings.size());
        assertEquals(el2, siblings.get(0));
    }

    @Test
    public void testSiblingElementsNoSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(el1);
        assertTrue(el1.siblingElements().isEmpty());
    }

    @Test
    public void testNextElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(el2, el1.nextElementSibling());
    }

    @Test
    public void testNextElementSiblingNull() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(el1);
        assertNull(el1.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(el1, el2.previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblingNull() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(el1);
        assertNull(el1.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(el1, parent.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingNull() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        TextNode tn = new TextNode("text", "http://example.com");
        parent.appendChild(tn);
        assertNull(parent.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(Integer.valueOf(0), el1.elementSiblingIndex());
        assertEquals(Integer.valueOf(1), el2.elementSiblingIndex());
    }

    @Test
    public void testElementSiblingIndexNoParent() {
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        assertEquals(Integer.valueOf(0), el1.elementSiblingIndex()); // should default to 0 if no parent
    }

    @Test
    public void testLastElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(el2, parent.lastElementSibling());
    }

    @Test
    public void testLastElementSiblingNull() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        TextNode tn = new TextNode("text", "http://example.com");
        parent.appendChild(tn);
        assertNull(parent.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        parent.appendChild(new Element(Tag.valueOf("span"), "http://example.com"));
        parent.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        Elements ps = parent.getElementsByTag("p");
        assertEquals(2, ps.size());
    }

    @Test
    public void testGetElementById() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        el1.attr("id", "id1");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        el2.attr("id", "id2");
        parent.appendChild(el1);
        parent.appendChild(el2);
        assertEquals(el1, parent.getElementById("id1"));
    }

    @Test
    public void testGetElementByIdNotFound() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        assertNull(parent.getElementById("nonexistent"));
    }

    @Test
    public void testGetElementsByClass() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        el1.addClass("classA");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        el2.addClass("classB");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        el3.addClass("classA");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsByClass("classA");
        assertEquals(2, els.size());
        assertTrue(els.contains(el1));
        assertTrue(els.contains(el3));
    }

    @Test
    public void testGetElementsByClassNotFound() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(parent.getElementsByClass("nonexistent").isEmpty());
    }

    @Test
    public void testGetElementsByAttribute() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com");
        el1.attr("href", "#");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("img"), "http://example.com");
        el3.attr("src", "img.jpg");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsByAttribute("href");
        assertEquals(1, els.size());
        assertEquals(el1, els.get(0));
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.attr("data-id", "1");
        parent.attr("data-name", "test");
        parent.attr("id", "main");
        Elements els = parent.getElementsByAttributeStarting("data-");
        assertEquals(2, els.size());
        assertTrue(els.contains(parent)); // The parent itself has these attributes
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com");
        el1.attr("href", "http://example.com");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com");
        el2.attr("href", "http://another.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        Elements els = parent.getElementsByAttributeValue("href", "http://example.com");
        assertEquals(1, els.size());
        assertEquals(el1, els.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com");
        el1.attr("href", "http://example.com");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com");
        el2.attr("href", "http://another.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com"); // no href
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsByAttributeValueNot("href", "http://example.com");
        assertEquals(2, els.size());
        assertTrue(els.contains(el2));
        assertTrue(els.contains(el3));
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com");
        el1.attr("href", "http://example.com");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com");
        el2.attr("href", "http://another.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        el3.attr("href", "example.com"); // does not start with http
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsByAttributeValueStarting("href", "http://");
        assertEquals(2, els.size());
        assertTrue(els.contains(el1));
        assertTrue(els.contains(el2));
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com");
        el1.attr("href", "http://example.com/");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com");
        el2.attr("href", "http://another.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        el3.attr("href", "example.com");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsByAttributeValueEnding("href", "/");
        assertEquals(1, els.size());
        assertEquals(el1, els.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com");
        el1.attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com");
        el2.attr("href", "http://another.com/page2");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        el3.attr("href", "example.com/page3");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsByAttributeValueContaining("href", "page");
        assertEquals(3, els.size());
        assertTrue(els.contains(el1));
        assertTrue(els.contains(el2));
        assertTrue(els.contains(el3));
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com");
        el1.attr("href", "http://example.com");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com");
        el2.attr("href", "http://example.com/page");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        el3.attr("href", "http://example.com?query=1");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsByAttributeValueMatching("href", "http://example\\.com/.*");
        assertEquals(2, els.size());
        assertTrue(els.contains(el1)); // Assuming . matches any char, so this should pass
        assertTrue(els.contains(el2));
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el0 = new Element(Tag.valueOf("p"), "http://example.com"); el0.setSiblingIndex(0);
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com"); el1.setSiblingIndex(1);
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com"); el2.setSiblingIndex(2);
        parent.appendChild(el0);
        parent.appendChild(el1);
        parent.appendChild(el2);
        Elements els = parent.getElementsByIndexLessThan(2);
        assertEquals(2, els.size());
        assertTrue(els.contains(el0));
        assertTrue(els.contains(el1));
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el0 = new Element(Tag.valueOf("p"), "http://example.com"); el0.setSiblingIndex(0);
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com"); el1.setSiblingIndex(1);
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com"); el2.setSiblingIndex(2);
        parent.appendChild(el0);
        parent.appendChild(el1);
        parent.appendChild(el2);
        Elements els = parent.getElementsByIndexGreaterThan(0);
        assertEquals(2, els.size());
        assertTrue(els.contains(el1));
        assertTrue(els.contains(el2));
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el0 = new Element(Tag.valueOf("p"), "http://example.com"); el0.setSiblingIndex(0);
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com"); el1.setSiblingIndex(1);
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com"); el2.setSiblingIndex(2);
        parent.appendChild(el0);
        parent.appendChild(el1);
        parent.appendChild(el2);
        Elements els = parent.getElementsByIndexEquals(1);
        assertEquals(1, els.size());
        assertEquals(el1, els.get(0));
    }

    @Test
    public void testGetElementsContainingText() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        el1.text("Hello world");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com");
        el2.text("Another paragraph");
        Element el3 = new Element(Tag.valueOf("div"), "http://example.com");
        el3.text("Contains world inside.");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsContainingText("world");
        assertEquals(2, els.size());
        assertTrue(els.contains(el1));
        assertTrue(els.contains(el3));
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        el1.text("Hello world");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com");
        el2.text("Another paragraph");
        Element el3 = new Element(Tag.valueOf("div"), "http://example.com");
        el3.ownText("Just world"); // only own text
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsContainingOwnText("world");
        assertEquals(2, els.size());
        assertTrue(els.contains(el1));
        assertTrue(els.contains(el3));
    }

    @Test
    public void testGetElementsMatchingText() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        el1.text("abc123def");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com");
        el2.text("ghi456jkl");
        Element el3 = new Element(Tag.valueOf("div"), "http://example.com");
        el3.text("contains 789 digits");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsMatchingText("^[a-z]+\\d+[a-z]+$");
        assertEquals(2, els.size());
        assertTrue(els.contains(el1));
        assertTrue(els.contains(el2));
    }

    @Test
    public void testGetElementsMatchingOwnText() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        el1.ownText("abc123def");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com");
        el2.ownText("ghi456jkl");
        Element el3 = new Element(Tag.valueOf("div"), "http://example.com");
        el3.ownText("contains 789 digits");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);
        Elements els = parent.getElementsMatchingOwnText("^[a-z]+\\d+[a-z]+$");
        assertEquals(2, els.size());
        assertTrue(els.contains(el1));
        assertTrue(els.contains(el2));
    }

    @Test
    public void testGetAllElements() {
        Element root = new Element(Tag.valueOf("#root"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        Element p = new Element(Tag.valueOf("p"), "http://example.com");
        root.appendChild(body);
        body.appendChild(div);
        div.appendChild(p);
        Elements all = root.getAllElements();
        assertEquals(4, all.size()); // root, body, div, p
        assertEquals(root, all.get(0));
        assertEquals(body, all.get(1));
        assertEquals(div, all.get(2));
        assertEquals(p, all.get(3));
    }

    @Test
    public void testText() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.html("Hello <b>world</b> now!");
        assertEquals("Hello world now!", el.text());
    }

    @Test
    public void testTextWithWhitespace() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.html("  Hello \n <b> world </b> \t now!  ");
        assertEquals("Hello world now!", el.text());
    }

    @Test
    public void testOwnText() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.html("Hello <b>world</b> now!");
        assertEquals("Hello now!", el.ownText());
    }

    @Test
    public void testOwnTextWithWhitespace() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.html("  Hello \n <b>world</b> \t now!  ");
        assertEquals("Hello now!", el.ownText());
    }

    @Test
    public void testHasText() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.text("Some text");
        assertTrue(el.hasText());
    }

    @Test
    public void testHasTextEmpty() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        assertTrue(!el.hasText());
    }

    @Test
    public void testHasTextOnlyWhitespace() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.text("   \n \t ");
        assertTrue(!el.hasText());
    }

    @Test
    public void testData() {
        Element el = new Element(Tag.valueOf("script"), "http://example.com");
        el.html("var x = 1;");
        assertEquals("var x = 1;", el.data());
    }

    @Test
    public void testDataWithNestedElement() {
        Element el = new Element(Tag.valueOf("script"), "http://example.com");
        Element nested = new Element(Tag.valueOf("style"), "http://example.com");
        nested.html("color: red;");
        el.appendChild(nested);
        assertEquals("color: red;", el.data());
    }

    @Test
    public void testClassName() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " header  gray ");
        assertEquals("header gray", el.className());
    }

    @Test
    public void testClassNameEmpty() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.className());
    }

    @Test
    public void testClassNames() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " header gray special ");
        Set<String> classes = el.classNames();
        assertEquals(3, classes.size());
        assertTrue(classes.contains("header"));
        assertTrue(classes.contains("gray"));
        assertTrue(classes.contains("special"));
    }

    @Test
    public void testClassNamesEmpty() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(el.classNames().isEmpty());
    }

    @Test
    public void testClassNamesWithEmptyClass() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " "); // single space
        assertTrue(el.classNames().isEmpty());
    }


    @Test
    public void testClassNamesSet() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        Set<String> newClasses = new HashSet<>(Arrays.asList("new1", "new2"));
        el.classNames(newClasses);
        assertEquals("new1 new2", el.attr("class"));
    }

    @Test
    public void testHasClass() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " header gray ");
        assertTrue(el.hasClass("header"));
        assertTrue(el.hasClass("gray"));
    }

    @Test
    public void testHasClassCaseInsensitive() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " HEADER ");
        assertTrue(el.hasClass("header"));
    }

    @Test
    public void testHasClassNotFound() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " header gray ");
        assertFalse(el.hasClass("bold"));
    }

    @Test
    public void testHasClassEmptyAttr() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(el.hasClass("header"));
    }

    @Test
    public void testAddClass() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.addClass("newClass");
        assertEquals("newClass", el.className());
        el.addClass("another");
        assertEquals("newClass another", el.className());
    }

    @Test
    public void testAddExistingClass() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.addClass("existing");
        el.addClass("existing"); // add again
        assertEquals("existing", el.className());
    }

    @Test
    public void testRemoveClass() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " one two three ");
        el.removeClass("two");
        assertEquals("one three", el.className());
    }

    @Test
    public void testRemoveClassNotFound() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("class", " one two ");
        el.removeClass("three");
        assertEquals("one two", el.className());
    }

    @Test
    public void testRemoveClassOnlyClass() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.addClass("only");
        el.removeClass("only");
        assertEquals("", el.className());
    }

    @Test
    public void testToggleClassAdd() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.toggleClass("newClass");
        assertEquals("newClass", el.className());
    }

    @Test
    public void testToggleClassRemove() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.addClass("existing");
        el.toggleClass("existing");
        assertEquals("", el.className());
    }

    @Test
    public void testValInput() {
        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.attr("value", "initialValue");
        assertEquals("initialValue", input.val());
        input.val("newValue");
        assertEquals("newValue", input.val());
    }

    @Test
    public void testValTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com");
        textarea.text("initialContent");
        assertEquals("initialContent", textarea.val());
        textarea.val("newContent");
        assertEquals("newContent", textarea.val());
        assertEquals("newContent", textarea.text()); // textarea value is its text content
    }

    @Test
    public void testValInputEmpty() {
        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        assertEquals("", input.val());
    }

    @Test
    public void testValTextareaEmpty() {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com");
        assertEquals("", textarea.val());
    }

    // Test cases for outerHtmlHead and outerHtmlTail are more complex and depend on Document.OutputSettings.
    // For simplicity, we will focus on a few basic HTML generation aspects covered by `html()` and `outerHtml()`.

    @Test
    public void testOuterHtmlSimpleElement() {
        Element el = new Element(Tag.valueOf("br"), "http://example.com");
        assertEquals("<br />", el.outerHtml()); // Self-closing tag
    }

    @Test
    public void testOuterHtmlElementWithAttribute() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com");
        el.attr("href", "http://example.com");
        assertEquals("<a href=\"http://example.com\"></a>", el.outerHtml());
    }

    @Test
    public void testOuterHtmlElementWithText() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.text("Hello");
        assertEquals("<p>Hello</p>", el.outerHtml());
    }

    @Test
    public void testOuterHtmlNestedElements() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("p");
        child.text("Nested");
        assertEquals("<div><p>Nested</p></div>", parent.outerHtml());
    }

    @Test
    public void testHtml() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        el.appendChild(new TextNode("Some text", "http://example.com"));
        assertEquals("<p>Some text</p>", el.html());
    }

    @Test
    public void testHtmlEmpty() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.html());
    }

    @Test
    public void testHtmlSet() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.html("<span>Inner HTML</span>");
        assertEquals("<span>Inner HTML</span>", el.html());
        assertEquals(1, el.children().size());
        assertEquals("span", el.child(0).tagName());
    }

    @Test
    public void testEqualsSameInstance() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(el1.equals(el1));
    }

    @Test
    public void testEqualsDifferentClass() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(el1.equals("some string"));
    }

    @Test
    public void testEqualsDifferentTag() {
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
        // Hash code is not guaranteed to be the same for equal objects, but good for basic check
        assertEquals(el1.hashCode(), el2.hashCode());
    }

    @Test
    public void testClone() {
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        el1.attr("id", "test");
        el1.text("content");
        Element el2 = el1.clone();
        assertNotSame(el1, el2);
        assertEquals(el1.tagName(), el2.tagName());
        assertEquals(el1.id(), el2.id());
        assertEquals(el1.html(), el2.html());
        // Ensure it's a deep clone by modifying the original and checking the clone
        el1.attr("id", "modified");
        el1.text("modified content");
        assertEquals("test", el2.id());
        assertEquals("content", el2.html());
    }
}
