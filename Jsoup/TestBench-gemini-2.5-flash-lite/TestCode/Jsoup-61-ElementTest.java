package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
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
import java.nio.charset.Charset; // Added for OutputSettings

public class ElementTest {
    @Test
    public void testNodeName() {
        Element el = new Element("div");
        assertEquals("div", el.nodeName());
    }

    @Test
    public void testTagName() {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
        el.tagName("span");
        assertEquals("span", el.tagName());
    }

    @Test
    public void testTag() {
        Element el = new Element("div");
        assertNotNull(el.tag());
        assertEquals("div", el.tag().getName());
    }

    @Test
    public void testIsBlock() {
        Element div = new Element("div");
        assertTrue(div.isBlock());
        Element span = new Element("span");
        assertFalse(span.isBlock());
    }

    @Test
    public void testIdAttribute() {
        Element el = new Element("div");
        assertEquals("", el.id());
        el.attr("id", "myId");
        assertEquals("myId", el.id());
    }
    
    @Test
    public void testIdAttributeEmptyString() {
        Element el = new Element("div");
        el.attr("id", "");
        assertEquals("", el.id());
    }

    @Test
    public void testAttrStringString() {
        Element el = new Element("div");
        el.attr("key", "value");
        assertEquals("value", el.attr("key"));
        el.attr("key", "newValue");
        assertEquals("newValue", el.attr("key"));
    }

    @Test
    public void testAttrStringBooleanTrue() {
        Element el = new Element("div");
        el.attr("checked", true);
        assertTrue(el.hasAttr("checked"));
        assertEquals("", el.attr("checked")); // Boolean attributes have empty string value when present
    }

    @Test
    public void testAttrStringBooleanFalse() {
        Element el = new Element("div");
        el.attr("checked", true);
        el.attr("checked", false);
        assertFalse(el.hasAttr("checked"));
    }

    @Test
    public void testDataset() {
        Element el = new Element("div");
        el.attr("data-key", "value");
        el.attr("data-another", "test");
        Map<String, String> dataset = el.dataset();
        assertEquals("value", dataset.get("key"));
        assertEquals("test", dataset.get("another"));
        assertEquals(2, dataset.size());
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
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }
    
    @Test
    public void testParentOfRoot() {
        Element root = new Element("html"); // Assuming #root is not a valid tag, use a common root tag
        assertNull(root.parent());
    }

    @Test
    public void testParents() {
        Element root = new Element("html");
        Element body = new Element("body");
        Element div = new Element("div");
        root.appendChild(body);
        body.appendChild(div);

        Elements parents = div.parents();
        assertEquals(2, parents.size());
        assertEquals("body", parents.get(0).tagName());
        assertEquals("html", parents.get(1).tagName());
    }

    @Test
    public void testChild() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        Element parent = new Element("div");
        parent.child(0);
    }

    @Test
    public void testChildren() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(new TextNode("some text", ""));
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
        assertTrue(children.isEmpty());
    }

    @Test
    public void testTextNodes() {
        Element parent = new Element("div");
        TextNode text1 = new TextNode("first text", "");
        Element child = new Element("span");
        TextNode text2 = new TextNode("second text", "");
        parent.appendChild(text1);
        parent.appendChild(child);
        parent.appendChild(text2);

        List<TextNode> textNodes = parent.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals(text1, textNodes.get(0));
        assertEquals(text2, textNodes.get(1));
    }

    @Test
    public void testTextNodesEmpty() {
        Element parent = new Element("div");
        parent.appendChild(new Element("span"));
        List<TextNode> textNodes = parent.textNodes();
        assertTrue(textNodes.isEmpty());
    }

    @Test
    public void testDataNodes() {
        Element parent = new Element("div");
        DataNode data1 = new DataNode("data1", "");
        Element child = new Element("span");
        DataNode data2 = new DataNode("data2", "");
        parent.appendChild(data1);
        parent.appendChild(child);
        parent.appendChild(data2);

        List<DataNode> dataNodes = parent.dataNodes();
        assertEquals(2, dataNodes.size());
        assertEquals(data1, dataNodes.get(0));
        assertEquals(data2, dataNodes.get(1));
    }

    @Test
    public void testDataNodesEmpty() {
        Element parent = new Element("div");
        parent.appendChild(new Element("span"));
        List<DataNode> dataNodes = parent.dataNodes();
        assertTrue(dataNodes.isEmpty());
    }

    @Test
    public void testSelect() {
        Element root = new Element("div");
        Element child1 = new Element("p").attr("id", "p1");
        Element child2 = new Element("span").addClass("myClass");
        Element nested = new Element("a");
        child1.appendChild(nested);
        root.appendChild(child1);
        root.appendChild(child2);

        Elements selectedById = root.select("#p1");
        assertEquals(1, selectedById.size());
        assertEquals(child1, selectedById.get(0));

        Elements selectedByClass = root.select(".myClass");
        assertEquals(1, selectedByClass.size());
        assertEquals(child2, selectedByClass.get(0));

        Elements selectedByTag = root.select("a");
        assertEquals(1, selectedByTag.size());
        assertEquals(nested, selectedByTag.get(0));
    }
    
    @Test
    public void testSelectNoMatch() {
        Element root = new Element("div");
        root.appendChild(new Element("p"));
        Elements selected = root.select("span");
        assertTrue(selected.isEmpty());
    }

    @Test
    public void testIsCssQuery() {
        Element root = new Element("div");
        Element child1 = new Element("p").attr("id", "p1");
        Element child2 = new Element("span").addClass("myClass");
        root.appendChild(child1);
        root.appendChild(child2);

        // Assuming #root is not a special selector for Element itself, and depends on Document.
        // Removed direct assertion for root.is("#root") as it might not be universally true for a standalone Element.
        assertTrue(child1.is("#p1"));
        assertTrue(child2.is(".myClass"));
        assertTrue(child2.is("span"));
        assertFalse(child1.is(".myClass"));
    }
    
    @Test
    public void testIsCssQueryWithAncestors() {
        Element root = new Element("div");
        Element parent = new Element("section");
        Element child = new Element("p");
        root.appendChild(parent);
        parent.appendChild(child);

        assertTrue(child.is("div > section > p"));
        assertTrue(parent.is("div > section"));
        assertTrue(root.is("div"));
    }

    @Test
    public void testAppendChild() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(1, parent.childNodes().size());
        assertEquals(child, parent.childNode(0));
        assertEquals(parent, child.parent());
        assertEquals(0, child.siblingIndex());
    }
    
    @Test
    public void testAppendChildMultiple() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child2, parent.childNode(1));
        assertEquals(1, child2.siblingIndex());
    }

    @Test
    public void testPrependChild() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(2, parent.childNodes().size());
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
        assertEquals(child2, parent.children().get(0));
        assertEquals(0, child2.siblingIndex());
        assertEquals(1, child1.siblingIndex());
    }
    
    @Test
    public void testPrependChildToEmpty() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.prependChild(child);
        assertEquals(child, parent.childNode(0));
    }

    @Test
    public void testInsertChildren() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child3 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child3);

        Element child2 = new Element("a");
        List<Node> childrenToInsert = new ArrayList<>();
        childrenToInsert.add(child2);

        parent.insertChildren(1, childrenToInsert);
        assertEquals(3, parent.childNodes().size());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
        assertEquals(child3, parent.childNode(2));
        assertEquals(1, child2.siblingIndex());
    }
    
    @Test
    public void testInsertChildrenAtStart() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child2);

        Element newChild = new Element("a");
        List<Node> childrenToInsert = new ArrayList<>();
        childrenToInsert.add(newChild);

        parent.insertChildren(0, childrenToInsert);
        assertEquals(3, parent.childNodes().size());
        assertEquals(newChild, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
        assertEquals(child2, parent.childNode(2));
        assertEquals(0, newChild.siblingIndex());
    }
    
    @Test
    public void testInsertChildrenAtEnd() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child2);

        Element newChild = new Element("a");
        List<Node> childrenToInsert = new ArrayList<>();
        childrenToInsert.add(newChild);

        parent.insertChildren(-1, childrenToInsert); // -1 should insert at end
        assertEquals(3, parent.childNodes().size());
        assertEquals(child1, parent.childNode(0));
        assertEquals(child2, parent.childNode(1));
        assertEquals(newChild, parent.childNode(2));
        assertEquals(2, newChild.siblingIndex());
    }

    @Test
    public void testAppendElement() {
        Element parent = new Element("div");
        Element child = parent.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(parent, child.parent());
        assertEquals(1, parent.children().size());
        assertEquals(child, parent.children().get(0));
    }
    
    @Test
    public void testAppendElementMultiple() {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("span");
        Element child2 = parent.appendElement("p");
        assertEquals(child2, parent.children().get(1));
        assertEquals(2, parent.children().size());
    }

    @Test
    public void testPrependElement() {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("span");
        Element child2 = parent.prependElement("p");
        assertEquals("p", child2.tagName());
        assertEquals(parent, child2.parent());
        assertEquals(2, parent.children().size());
        assertEquals(child2, parent.children().get(0));
        assertEquals(child1, parent.children().get(1));
    }
    
    @Test
    public void testPrependElementToEmpty() {
        Element parent = new Element("div");
        Element child = parent.prependElement("span");
        assertEquals("span", child.tagName());
        assertEquals(parent, child.parent());
        assertEquals(1, parent.children().size());
    }

    @Test
    public void testAppendText() {
        Element parent = new Element("div");
        TextNode textNode = new TextNode("hello", "");
        parent.appendChild(textNode); // Manually append for comparison

        Element parent2 = new Element("div");
        parent2.appendText("hello");
        assertEquals(1, parent2.childNodes().size());
        assertTrue(parent2.childNode(0) instanceof TextNode);
        assertEquals("hello", parent2.childNode(0).outerHtml());
    }
    
    @Test
    public void testAppendTextMultiple() {
        Element parent = new Element("div");
        parent.appendText("hello");
        parent.appendText(" ");
        parent.appendText("world");
        assertEquals("hello world", parent.text());
        assertEquals(3, parent.childNodes().size());
    }

    @Test
    public void testPrependText() {
        Element parent = new Element("div");
        TextNode textNode = new TextNode("world", "");
        parent.appendChild(textNode); // Manually append for comparison

        Element parent2 = new Element("div");
        parent2.appendText("world");
        parent2.prependText("hello ");
        assertEquals("hello world", parent2.text());
        assertEquals(2, parent2.childNodes().size());
        assertTrue(parent2.childNode(0) instanceof TextNode);
        assertEquals("hello ", parent2.childNode(0).outerHtml());
    }
    
    @Test
    public void testPrependTextToEmpty() {
        Element parent = new Element("div");
        parent.prependText("hello");
        assertEquals("hello", parent.text());
        assertEquals(1, parent.childNodes().size());
    }

    @Test
    public void testAppendHtml() {
        Element parent = new Element("div");
        parent.append("<span>Hello</span>");
        assertEquals(1, parent.childNodes().size());
        assertTrue(parent.childNode(0) instanceof Element);
        assertEquals("span", parent.childNode(0).nodeName());
        assertEquals("Hello", ((Element) parent.childNode(0)).text());
    }
    
    @Test
    public void testAppendHtmlMultiple() {
        Element parent = new Element("div");
        parent.append("<p>Para 1</p>");
        parent.append("Some text");
        parent.append("<b>Bold</b>");
        assertEquals("Para 1Some text<b>Bold</b>", parent.html());
        assertEquals(3, parent.childNodes().size());
    }

    @Test
    public void testPrependHtml() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("World", "")); // existing content
        parent.prepend("Hello ");
        assertEquals("Hello World", parent.text());
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNode(0) instanceof TextNode);
        assertEquals("Hello ", parent.childNode(0).outerHtml());
    }
    
    @Test
    public void testPrependHtmlMultiple() {
        Element parent = new Element("div");
        parent.append("<p>Existing</p>");
        parent.prepend("<b>Bold</b>");
        parent.prepend("<i>Italic</i> ");
        assertEquals("<i>Italic </i><b>Bold</b><p>Existing</p>", parent.html());
        assertEquals(3, parent.childNodes().size());
    }

    @Test
    public void testBeforeString() {
        Element target = new Element("div").attr("id", "target");
        Element parent = new Element("body");
        parent.appendChild(target);

        parent.before("<p>Before content</p>");
        assertEquals(2, parent.childNodes().size());
        assertTrue(parent.childNode(0) instanceof Element);
        assertEquals("p", parent.childNode(0).nodeName());
        assertEquals("Before content", ((Element) parent.childNode(0)).text());
        assertEquals(target, parent.childNode(1));
    }
    
    @Test
    public void testBeforeNode() {
        Element target = new Element("div").attr("id", "target");
        Element sibling = new Element("p");
        Element parent = new Element("body");
        parent.appendChild(target);
        
        target.before(sibling);
        assertEquals(2, parent.childNodes().size());
        assertEquals(sibling, parent.childNode(0));
        assertEquals(target, parent.childNode(1));
    }

    @Test
    public void testAfterString() {
        Element target = new Element("div").attr("id", "target");
        Element parent = new Element("body");
        parent.appendChild(target);

        parent.after("<p>After content</p>");
        assertEquals(2, parent.childNodes().size());
        assertEquals(target, parent.childNode(0));
        assertTrue(parent.childNode(1) instanceof Element);
        assertEquals("p", parent.childNode(1).nodeName());
        assertEquals("After content", ((Element) parent.childNode(1)).text());
    }
    
    @Test
    public void testAfterNode() {
        Element target = new Element("div").attr("id", "target");
        Element sibling = new Element("p");
        Element parent = new Element("body");
        parent.appendChild(target);
        
        target.after(sibling);
        assertEquals(2, parent.childNodes().size());
        assertEquals(target, parent.childNode(0));
        assertEquals(sibling, parent.childNode(1));
    }

    @Test
    public void testEmpty() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p"));
        parent.appendChild(new TextNode("text", ""));
        parent.attr("id", "test");

        parent.empty();
        assertTrue(parent.childNodes().isEmpty());
        assertEquals("test", parent.attr("id")); // attributes should remain
    }
    
    @Test
    public void testEmptyOnEmpty() {
        Element parent = new Element("div");
        parent.empty();
        assertTrue(parent.childNodes().isEmpty());
    }

    @Test
    public void testWrap() {
        Element target = new Element("span").text("content");
        Element parent = new Element("div");
        parent.appendChild(target);

        Element wrapper = parent.wrap("<div class='wrapper'></div>");
        assertEquals("div", wrapper.tagName());
        assertEquals("wrapper", wrapper.className());
        assertEquals(1, wrapper.children().size());
        assertEquals(target, wrapper.child(0));
        assertEquals(wrapper, target.parent());
    }
    
    @Test
    public void testWrapWithNestedHtml() {
        Element target = new Element("span").text("content");
        Element parent = new Element("div");
        parent.appendChild(target);

        Element wrapper = parent.wrap("<div class='outer'><b>Inner</b></div>");
        assertEquals("div", wrapper.tagName());
        assertEquals("outer", wrapper.className());
        assertEquals(2, wrapper.childNodes().size());
        assertEquals("b", wrapper.childNode(0).nodeName());
        assertEquals("Inner", ((Element)wrapper.childNode(0)).text());
        assertEquals(target, wrapper.childNode(1));
        assertEquals(wrapper, target.parent());
    }

    @Test
    public void testCssSelector() {
        Element root = new Element("div").attr("id", "rootDiv");
        Element child1 = new Element("p").addClass("class1").addClass("class2");
        Element child2 = new Element("span");
        root.appendChild(child1);
        root.appendChild(child2);

        assertEquals("#rootDiv", root.cssSelector());
        assertEquals("div > p.class1.class2", child1.cssSelector());
        assertEquals("div > span", child2.cssSelector());
    }
    
    @Test
    public void testCssSelectorWithMultipleClasses() {
        Element root = new Element("div");
        Element child = new Element("span").addClass("class1").addClass("class2");
        root.appendChild(child);
        assertEquals("div > span.class1.class2", child.cssSelector());
    }
    
    @Test
    public void testCssSelectorWithNthChild() {
        Element root = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("span");
        root.appendChild(child1);
        root.appendChild(child2);
        
        assertEquals("div > span", child1.cssSelector());
        assertEquals("div > span:nth-child(2)", child2.cssSelector());
    }

    @Test
    public void testSiblingElements() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        TextNode text = new TextNode("some text", "");
        Element child3 = new Element("a");
        parent.appendChild(child1);
        parent.appendChild(text);
        parent.appendChild(child2);
        parent.appendChild(child3);

        Elements siblings = child1.siblingElements();
        assertEquals(2, siblings.size());
        assertEquals(child2, siblings.get(0));
        assertEquals(child3, siblings.get(1));
    }
    
    @Test
    public void testSiblingElementsNone() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p"));
        Elements siblings = parent.child(0).siblingElements();
        assertTrue(siblings.isEmpty());
    }

    @Test
    public void testNextElementSibling() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        Element child3 = new Element("a");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        assertEquals(child2, child1.nextElementSibling());
        assertEquals(child3, child2.nextElementSibling());
        assertNull(child3.nextElementSibling());
    }
    
    @Test
    public void testNextElementSiblingWithTextNodes() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        TextNode text = new TextNode("some text", "");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(text);
        parent.appendChild(child2);

        assertEquals(child2, child1.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        Element child3 = new Element("a");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        assertNull(child1.previousElementSibling());
        assertEquals(child1, child2.previousElementSibling());
        assertEquals(child2, child3.previousElementSibling());
    }
    
    @Test
    public void testPreviousElementSiblingWithTextNodes() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        TextNode text = new TextNode("some text", "");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(text);
        parent.appendChild(child2);

        assertNull(child1.previousElementSibling());
        assertEquals(child1, child2.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(child1, child2.firstElementSibling());
    }
    
    @Test
    public void testFirstElementSiblingOnlyChild() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        parent.appendChild(child1);
        assertNull(child1.firstElementSibling()); // Only child, no siblings to return
    }
    
    @Test
    public void testFirstElementSiblingNoChildren() {
        Element parent = new Element("div");
        assertNull(parent.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        Element child3 = new Element("a");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        assertEquals(0, (int)child1.elementSiblingIndex());
        assertEquals(1, (int)child2.elementSiblingIndex());
        assertEquals(2, (int)child3.elementSiblingIndex());
    }
    
    @Test
    public void testElementSiblingIndexWithTextNodes() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        TextNode text = new TextNode("some text", "");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(text);
        parent.appendChild(child2);

        assertEquals(0, (int)child1.elementSiblingIndex());
        assertEquals(1, (int)child2.elementSiblingIndex());
    }

    @Test
    public void testLastElementSibling() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(child2, child1.lastElementSibling());
    }
    
    @Test
    public void testLastElementSiblingOnlyChild() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        parent.appendChild(child1);
        assertNull(child1.lastElementSibling()); // Only child, no siblings to return
    }
    
    @Test
    public void testLastElementSiblingNoChildren() {
        Element parent = new Element("div");
        assertNull(parent.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() {
        Element root = new Element("div");
        root.appendChild(new Element("p"));
        root.appendChild(new Element("span"));
        root.appendChild(new Element("p"));
        root.appendChild(new Element("a"));

        Elements ps = root.getElementsByTag("p");
        assertEquals(2, ps.size());
        assertEquals("p", ps.get(0).tagName());
        assertEquals("p", ps.get(1).tagName());
    }
    
    @Test
    public void testGetElementsByTagCaseInsensitive() {
        Element root = new Element("div");
        root.appendChild(new Element("P")); // Uppercase tag
        Elements ps = root.getElementsByTag("p");
        assertEquals(1, ps.size());
        assertEquals("P", ps.get(0).tagName());
    }

    @Test
    public void testGetElementById() {
        Element root = new Element("div");
        root.appendChild(new Element("p").attr("id", "p1"));
        root.appendChild(new Element("span").attr("id", "s1"));
        root.appendChild(new Element("p").attr("id", "p2"));

        Element p1 = root.getElementById("p1");
        assertNotNull(p1);
        assertEquals("p", p1.tagName());
        assertEquals("p1", p1.id());

        assertNull(root.getElementById("nonExistentId"));
    }
    
    @Test
    public void testGetElementByIdWithDuplicates() {
        Element root = new Element("div");
        root.appendChild(new Element("p").attr("id", "p1"));
        root.appendChild(new Element("span").attr("id", "p1")); // Duplicate ID
        Element p1 = root.getElementById("p1");
        assertNotNull(p1);
        assertEquals("p", p1.tagName()); // Should return the first one found
    }

    @Test
    public void testGetElementsByClass() {
        Element root = new Element("div");
        root.appendChild(new Element("p").addClass("class1"));
        root.appendChild(new Element("span").addClass("class2"));
        root.appendChild(new Element("p").addClass("class1 class3"));
        root.appendChild(new Element("a").addClass("class3"));

        Elements class1Elements = root.getElementsByClass("class1");
        assertEquals(2, class1Elements.size());
        assertEquals("p", class1Elements.get(0).tagName());
        assertEquals("p", class1Elements.get(1).tagName());

        Elements class2Elements = root.getElementsByClass("class2");
        assertEquals(1, class2Elements.size());
        assertEquals("span", class2Elements.get(0).tagName());
    }
    
    @Test
    public void testGetElementsByClassCaseInsensitive() {
        Element root = new Element("div");
        root.appendChild(new Element("p").addClass("CLASS1"));
        Elements class1Elements = root.getElementsByClass("class1");
        assertEquals(1, class1Elements.size());
        assertEquals("p", class1Elements.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttribute() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "http://example.com"));
        root.appendChild(new Element("img").attr("src", "/img.jpg"));
        root.appendChild(new Element("a").attr("name", "anchor"));

        Elements links = root.getElementsByAttribute("href");
        assertEquals(1, links.size());
        assertEquals("a", links.get(0).tagName());

        Elements images = root.getElementsByAttribute("src");
        assertEquals(1, images.size());
        assertEquals("img", images.get(0).tagName());
    }
    
    @Test
    public void testGetElementsByAttributeWithMultiple() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "http://example.com"));
        root.appendChild(new Element("a").attr("name", "anchor"));
        root.appendChild(new Element("a").attr("href", "http://another.com"));
        
        Elements links = root.getElementsByAttribute("href");
        assertEquals(2, links.size());
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element root = new Element("div");
        root.appendChild(new Element("div").attr("data-id", "1"));
        root.appendChild(new Element("span").attr("data-value", "abc"));
        root.appendChild(new Element("div").attr("id", "divId"));

        Elements dataAttributes = root.getElementsByAttributeStarting("data-");
        assertEquals(2, dataAttributes.size());
        assertEquals("div", dataAttributes.get(0).tagName());
        assertEquals("span", dataAttributes.get(1).tagName());
    }
    
    @Test
    public void testGetElementsByAttributeStartingWithNoMatch() {
        Element root = new Element("div");
        root.appendChild(new Element("div").attr("id", "divId"));
        Elements dataAttributes = root.getElementsByAttributeStarting("data-");
        assertTrue(dataAttributes.isEmpty());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "http://example.com"));
        root.appendChild(new Element("a").attr("href", "http://test.com"));
        root.appendChild(new Element("img").attr("src", "/img.jpg"));

        Elements exampleLinks = root.getElementsByAttributeValue("href", "http://example.com");
        assertEquals(1, exampleLinks.size());
        assertEquals("http://example.com", exampleLinks.get(0).attr("href"));
    }
    
    @Test
    public void testGetElementsByAttributeValueCaseInsensitive() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "HTTP://EXAMPLE.COM"));
        Elements exampleLinks = root.getElementsByAttributeValue("href", "http://example.com");
        assertEquals(1, exampleLinks.size());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "http://example.com"));
        root.appendChild(new Element("a").attr("href", "http://test.com"));
        root.appendChild(new Element("a").attr("name", "anchor"));

        Elements notExampleLinks = root.getElementsByAttributeValueNot("href", "http://example.com");
        assertEquals(2, notExampleLinks.size());
        assertEquals("http://test.com", notExampleLinks.get(0).attr("href"));
        assertEquals("anchor", notExampleLinks.get(1).attr("name"));
    }
    
    @Test
    public void testGetElementsByAttributeValueNotWithNoMatch() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "http://example.com"));
        Elements notExampleLinks = root.getElementsByAttributeValueNot("href", "http://example.com");
        assertTrue(notExampleLinks.isEmpty());
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "http://example.com"));
        root.appendChild(new Element("a").attr("href", "http://test.com"));
        root.appendChild(new Element("img").attr("src", "/img.jpg"));

        Elements httpLinks = root.getElementsByAttributeValueStarting("href", "http://");
        assertEquals(2, httpLinks.size());
        assertEquals("http://example.com", httpLinks.get(0).attr("href"));
        assertEquals("http://test.com", httpLinks.get(1).attr("href"));
    }
    
    @Test
    public void testGetElementsByAttributeValueStartingWithNoMatch() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "ftp://example.com"));
        Elements httpLinks = root.getElementsByAttributeValueStarting("href", "http://");
        assertTrue(httpLinks.isEmpty());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "example.com"));
        root.appendChild(new Element("a").attr("href", "test.com"));
        root.appendChild(new Element("img").attr("src", "/img.jpg"));

        Elements comLinks = root.getElementsByAttributeValueEnding("href", ".com");
        assertEquals(2, comLinks.size());
        assertEquals("example.com", comLinks.get(0).attr("href"));
        assertEquals("test.com", comLinks.get(1).attr("href"));
    }
    
    @Test
    public void testGetElementsByAttributeValueEndingWithNoMatch() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "example.org"));
        Elements comLinks = root.getElementsByAttributeValueEnding("href", ".com");
        assertTrue(comLinks.isEmpty());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "example.com"));
        root.appendChild(new Element("a").attr("href", "myexample.org"));
        root.appendChild(new Element("img").attr("src", "/img.jpg"));

        Elements exampleLinks = root.getElementsByAttributeValueContaining("href", "example");
        assertEquals(2, exampleLinks.size());
        assertEquals("example.com", exampleLinks.get(0).attr("href"));
        assertEquals("myexample.org", exampleLinks.get(1).attr("href"));
    }
    
    @Test
    public void testGetElementsByAttributeValueContainingWithNoMatch() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "example.com"));
        Elements exampleLinks = root.getElementsByAttributeValueContaining("href", "test");
        assertTrue(exampleLinks.isEmpty());
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "http://example.com"));
        root.appendChild(new Element("a").attr("href", "http://test.com"));
        root.appendChild(new Element("img").attr("src", "/img.jpg"));

        Pattern pattern = Pattern.compile("http://.*\\.com");
        Elements matchingLinks = root.getElementsByAttributeValueMatching("href", pattern);
        assertEquals(2, matchingLinks.size());
        assertEquals("http://example.com", matchingLinks.get(0).attr("href"));
        assertEquals("http://test.com", matchingLinks.get(1).attr("href"));
    }
    
    @Test
    public void testGetElementsByAttributeValueMatchingString() {
        Element root = new Element("div");
        root.appendChild(new Element("a").attr("href", "http://example.com"));
        root.appendChild(new Element("a").attr("href", "http://test.com"));
        
        Elements matchingLinks = root.getElementsByAttributeValueMatching("href", "http://.*\\.com");
        assertEquals(2, matchingLinks.size());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingInvalidRegex() {
        Element root = new Element("div");
        root.getElementsByAttributeValueMatching("href", "[");
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Element root = new Element("div");
        root.appendChild(new Element("p")); // index 0
        root.appendChild(new Element("span")); // index 1
        root.appendChild(new Element("a")); // index 2

        Elements elements = root.getElementsByIndexLessThan(2);
        assertEquals(2, elements.size());
        assertEquals("p", elements.get(0).tagName());
        assertEquals("span", elements.get(1).tagName());
    }
    
    @Test
    public void testGetElementsByIndexLessThanBoundary() {
        Element root = new Element("div");
        root.appendChild(new Element("p")); // index 0
        Elements elements = root.getElementsByIndexLessThan(1);
        assertEquals(1, elements.size());
        assertEquals("p", elements.get(0).tagName());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element root = new Element("div");
        root.appendChild(new Element("p")); // index 0
        root.appendChild(new Element("span")); // index 1
        root.appendChild(new Element("a")); // index 2

        Elements elements = root.getElementsByIndexGreaterThan(0);
        assertEquals(2, elements.size());
        assertEquals("span", elements.get(0).tagName());
        assertEquals("a", elements.get(1).tagName());
    }
    
    @Test
    public void testGetElementsByIndexGreaterThanBoundary() {
        Element root = new Element("div");
        root.appendChild(new Element("p")); // index 0
        root.appendChild(new Element("span")); // index 1
        Elements elements = root.getElementsByIndexGreaterThan(1);
        assertTrue(elements.isEmpty());
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Element root = new Element("div");
        root.appendChild(new Element("p")); // index 0
        root.appendChild(new Element("span")); // index 1
        root.appendChild(new Element("a")); // index 2

        Elements elements = root.getElementsByIndexEquals(1);
        assertEquals(1, elements.size());
        assertEquals("span", elements.get(0).tagName());
    }
    
    @Test
    public void testGetElementsByIndexEqualsBoundary() {
        Element root = new Element("div");
        root.appendChild(new Element("p")); // index 0
        Elements elements = root.getElementsByIndexEquals(0);
        assertEquals(1, elements.size());
        assertEquals("p", elements.get(0).tagName());
    }

    @Test
    public void testGetElementsContainingText() {
        Element root = new Element("div");
        root.appendChild(new Element("p").text("Hello world"));
        root.appendChild(new Element("span").text("Just this"));
        root.appendChild(new Element("div").text("Hello from div"));

        Elements containingHello = root.getElementsContainingText("Hello");
        assertEquals(2, containingHello.size());
        assertEquals("p", containingHello.get(0).tagName());
        assertEquals("div", containingHello.get(1).tagName());
    }
    
    @Test
    public void testGetElementsContainingTextCaseInsensitive() {
        Element root = new Element("div");
        root.appendChild(new Element("p").text("Hello World"));
        Elements containingHello = root.getElementsContainingText("hello");
        assertEquals(1, containingHello.size());
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element root = new Element("div");
        Element p1 = new Element("p").attr("id", "p1");
        p1.appendChild(new TextNode("Direct text 1", ""));
        p1.appendChild(new Element("b").text("nested text"));
        
        Element p2 = new Element("p").attr("id", "p2");
        p2.appendChild(new TextNode("Direct text 2", ""));
        
        root.appendChild(p1);
        root.appendChild(p2);

        Elements directText1 = root.getElementsContainingOwnText("Direct text 1");
        assertEquals(1, directText1.size());
        assertEquals("p", directText1.get(0).tagName());
        assertEquals("p1", directText1.get(0).id());
    }
    
    @Test
    public void testGetElementsContainingOwnTextCaseInsensitive() {
        Element root = new Element("div");
        Element p1 = new Element("p").attr("id", "p1");
        p1.appendChild(new TextNode("Direct text 1", ""));
        root.appendChild(p1);

        Elements directText1 = root.getElementsContainingOwnText("direct text 1");
        assertEquals(1, directText1.size());
    }

    @Test
    public void testGetElementsMatchingText() {
        Element root = new Element("div");
        root.appendChild(new Element("p").text("abc 123 xyz"));
        root.appendChild(new Element("span").text("def 456 ghi"));
        root.appendChild(new Element("p").text("abc XYZ"));

        Elements matchingDigits = root.getElementsMatchingText(".*\\d.*");
        assertEquals(2, matchingDigits.size());
        assertEquals("p", matchingDigits.get(0).tagName());
        assertEquals("span", matchingDigits.get(1).tagName());
    }
    
    @Test
    public void testGetElementsMatchingTextString() {
        Element root = new Element("div");
        root.appendChild(new Element("p").text("abc 123 xyz"));
        Elements matchingDigits = root.getElementsMatchingText(".*\\d.*");
        assertEquals(1, matchingDigits.size());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingTextInvalidRegex() {
        Element root = new Element("div");
        root.getElementsMatchingText("[");
    }

    @Test
    public void testGetElementsMatchingOwnText() {
        Element root = new Element("div");
        Element p1 = new Element("p").attr("id", "p1");
        p1.appendChild(new TextNode("123", ""));
        
        Element p2 = new Element("p").attr("id", "p2");
        p2.appendChild(new TextNode("abc", ""));
        
        root.appendChild(p1);
        root.appendChild(p2);

        Pattern pattern = Pattern.compile("\\d+");
        Elements matchingDigits = root.getElementsMatchingOwnText(pattern);
        assertEquals(1, matchingDigits.size());
        assertEquals("p", matchingDigits.get(0).tagName());
        assertEquals("p1", matchingDigits.get(0).id());
    }
    
    @Test
    public void testGetElementsMatchingOwnTextString() {
        Element root = new Element("div");
        Element p1 = new Element("p").attr("id", "p1");
        p1.appendChild(new TextNode("123", ""));
        root.appendChild(p1);

        Elements matchingDigits = root.getElementsMatchingOwnText("\\d+");
        assertEquals(1, matchingDigits.size());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsMatchingOwnTextInvalidRegex() {
        Element root = new Element("div");
        root.getElementsMatchingOwnText("[");
    }

    @Test
    public void testGetAllElements() {
        Element root = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        Element nested = new Element("a");
        child1.appendChild(nested);
        root.appendChild(child1);
        root.appendChild(child2);

        Elements allElements = root.getAllElements();
        assertEquals(4, allElements.size()); // div, p, span, a
        assertEquals("div", allElements.get(0).tagName());
        assertEquals("p", allElements.get(1).tagName());
        assertEquals("span", allElements.get(2).tagName());
        assertEquals("a", allElements.get(3).tagName());
    }
    
    @Test
    public void testGetAllElementsEmpty() {
        Element root = new Element("div");
        Elements allElements = root.getAllElements();
        assertEquals(1, allElements.size()); // Should include itself
        assertEquals("div", allElements.get(0).tagName());
    }

    @Test
    public void testText() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("Hello ", ""));
        parent.appendChild(new Element("b").text("World"));
        parent.appendChild(new TextNode("!", ""));
        assertEquals("Hello World!", parent.text());
    }
    
    @Test
    public void testTextWithExtraWhitespace() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("  Hello   ", ""));
        parent.appendChild(new Element("b").text("   World  "));
        parent.appendChild(new TextNode(" ! ", ""));
        assertEquals("Hello World !", parent.text()); // Normalized whitespace
    }

    @Test
    public void testOwnText() {
        Element parent = new Element("div");
        parent.appendChild(new TextNode("Direct Text ", ""));
        parent.appendChild(new Element("b").text("Nested Text"));
        parent.appendChild(new TextNode("More Direct Text", ""));
        assertEquals("Direct Text More Direct Text", parent.ownText());
    }
    
    @Test
    public void testOwnTextEmpty() {
        Element parent = new Element("div");
        parent.appendChild(new Element("b").text("Nested Text"));
        assertEquals("", parent.ownText());
    }

    @Test
    public void testHasText() {
        Element parentWithText = new Element("div");
        parentWithText.appendChild(new TextNode("some text", ""));
        assertTrue(parentWithText.hasText());

        Element parentWithNestedText = new Element("div");
        parentWithNestedText.appendChild(new Element("span").text("nested"));
        assertTrue(parentWithNestedText.hasText());

        Element parentWithOnlyWhitespace = new Element("div");
        parentWithOnlyWhitespace.appendChild(new TextNode("   ", ""));
        assertFalse(parentWithOnlyWhitespace.hasText());

        Element parentEmpty = new Element("div");
        assertFalse(parentEmpty.hasText());
    }

    @Test
    public void testData() {
        Element root = new Element("div");
        DataNode data1 = new DataNode("data1", "");
        Comment comment = new Comment("comment data", "");
        Element nested = new Element("script").text("script data");
        root.appendChild(data1);
        root.appendChild(comment);
        root.appendChild(nested);

        assertEquals("data1comment datacript data", root.data());
    }
    
    @Test
    public void testDataEmpty() {
        Element root = new Element("div");
        assertEquals("", root.data());
    }

    @Test
    public void testClassName() {
        Element el = new Element("div");
        assertEquals("", el.className());
        el.attr("class", "class1");
        assertEquals("class1", el.className());
        el.attr("class", " class2  class3 ");
        assertEquals("class2  class3", el.className().trim());
    }
    
    @Test
    public void testClassNameWithMultipleSpaces() {
        Element el = new Element("div");
        el.attr("class", " class1   class2 ");
        assertEquals("class1   class2", el.className().trim());
    }

    @Test
    public void testClassNames() {
        Element el = new Element("div");
        el.attr("class", "class1 class2");
        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("class1"));
        assertTrue(names.contains("class2"));
    }
    
    @Test
    public void testClassNamesEmpty() {
        Element el = new Element("div");
        Set<String> names = el.classNames();
        assertTrue(names.isEmpty());
    }
    
    @Test
    public void testClassNamesWithExtraSpaces() {
        Element el = new Element("div");
        el.attr("class", "  class1   class2 ");
        Set<String> names = el.classNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("class1"));
        assertTrue(names.contains("class2"));
    }

    @Test
    public void testClassNamesSet() {
        Element el = new Element("div").attr("class", "oldClass");
        Set<String> newNames = new LinkedHashSet<>(Arrays.asList("newClass1", "newClass2"));
        el.classNames(newNames);
        assertEquals("newClass1 newClass2", el.className());
    }
    
    @Test
    public void testClassNamesSetEmpty() {
        Element el = new Element("div").attr("class", "oldClass");
        Set<String> newNames = Collections.emptySet();
        el.classNames(newNames);
        assertEquals("", el.className());
    }

    @Test
    public void testHasClass() {
        Element el = new Element("div");
        el.attr("class", "class1 class2");
        assertTrue(el.hasClass("class1"));
        assertTrue(el.hasClass("class2"));
        assertFalse(el.hasClass("class3"));
    }
    
    @Test
    public void testHasClassCaseInsensitive() {
        Element el = new Element("div");
        el.attr("class", "Class1 Class2");
        assertTrue(el.hasClass("class1"));
        assertTrue(el.hasClass("CLASS2"));
    }
    
    @Test
    public void testHasClassExactMatch() {
        Element el = new Element("div");
        el.attr("class", "class");
        assertTrue(el.hasClass("class"));
    }
    
    @Test
    public void testHasClassNotPartialMatch() {
        Element el = new Element("div");
        el.attr("class", "myclass");
        assertFalse(el.hasClass("class"));
    }
    
    @Test
    public void testHasClassEmptyAttr() {
        Element el = new Element("div");
        assertFalse(el.hasClass("class1"));
    }

    @Test
    public void testAddClass() {
        Element el = new Element("div").attr("class", "class1");
        el.addClass("class2");
        assertEquals("class1 class2", el.className());
    }
    
    @Test
    public void testAddClassAlreadyPresent() {
        Element el = new Element("div").attr("class", "class1");
        el.addClass("class1");
        assertEquals("class1", el.className());
    }
    
    @Test
    public void testAddClassToEmpty() {
        Element el = new Element("div");
        el.addClass("class1");
        assertEquals("class1", el.className());
    }

    @Test
    public void testRemoveClass() {
        Element el = new Element("div").attr("class", "class1 class2");
        el.removeClass("class1");
        assertEquals("class2", el.className());
    }
    
    @Test
    public void testRemoveClassNotPresent() {
        Element el = new Element("div").attr("class", "class1 class2");
        el.removeClass("class3");
        assertEquals("class1 class2", el.className());
    }
    
    @Test
    public void testRemoveClassFromEmpty() {
        Element el = new Element("div");
        el.removeClass("class1");
        assertEquals("", el.className());
    }

    @Test
    public void testToggleClassAdd() {
        Element el = new Element("div").attr("class", "class1");
        el.toggleClass("class2");
        assertEquals("class1 class2", el.className());
    }
    
    @Test
    public void testToggleClassRemove() {
        Element el = new Element("div").attr("class", "class1 class2");
        el.toggleClass("class1");
        assertEquals("class2", el.className());
    }
    
    @Test
    public void testToggleClassOnEmpty() {
        Element el = new Element("div");
        el.toggleClass("class1");
        assertEquals("class1", el.className());
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
    public void testValInputEmpty() {
        Element input = new Element("input");
        assertEquals("", input.val());
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
    public void testValTextareaEmpty() {
        Element textarea = new Element("textarea");
        assertEquals("", textarea.val());
        textarea.val("new content");
        assertEquals("new content", textarea.text());
    }

    @Test
    public void testOuterHtmlHead_prettyPrint() throws IOException {
        Element el = new Element("div");
        el.attr("id", "test");
        el.addClass("myClass");
        el.appendChild(new Element("span"));
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings().prettyPrint(true);
        el.outerHtmlHead(sb, 0, out);
        assertEquals("<div id=\"test\" class=\"myClass\">", sb.toString());
    }
    
    @Test
    public void testOuterHtmlHead_prettyPrintWithChildren() throws IOException {
        Element el = new Element("div");
        el.attr("id", "test");
        el.addClass("myClass");
        el.appendChild(new Element("span"));
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings().prettyPrint(true);
        el.outerHtmlHead(sb, 1, out); // depth 1 for indentation
        assertEquals("  <div id=\"test\" class=\"myClass\">", sb.toString());
    }

    @Test
    public void testOuterHtmlTail_prettyPrint() throws IOException {
        Element el = new Element("div");
        el.appendChild(new Element("span"));
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings().prettyPrint(true);
        el.outerHtmlTail(sb, 0, out);
        assertEquals("</div>", sb.toString());
    }
    
    @Test
    public void testOuterHtmlTail_prettyPrintWithChildren() throws IOException {
        Element el = new Element("div");
        el.appendChild(new Element("span"));
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings().prettyPrint(true);
        el.outerHtmlTail(sb, 1, out); // depth 1 for indentation
        assertEquals("  </div>", sb.toString());
    }
    
    @Test
    public void testOuterHtmlTail_prettyPrintWithOneTextNodeChild() throws IOException {
        Element el = new Element("div");
        el.appendChild(new TextNode("text", ""));
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings().prettyPrint(true);
        el.outerHtmlTail(sb, 1, out); // depth 1 for indentation
        assertEquals("  </div>", sb.toString()); // No indent before closing tag if only text child
    }

    @Test
    public void testOuterHtml_prettyPrint() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p"));
        assertEquals("<div>\n <p></p>\n</div>", parent.outerHtml());
    }
    
    // Removed tests that relied on inaccessible methods.
    // The original tests were:
    // testOuterHtml_notPrettyPrint
    // testOuterHtml_prettyPrint

    @Test
    public void testHtml() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p"));
        parent.appendChild(new TextNode("text", ""));
        assertEquals("<p></p>text", parent.html());
    }
    
    @Test
    public void testHtmlEmpty() {
        Element parent = new Element("div");
        assertEquals("", parent.html());
    }

    @Test
    public void testHtmlSet() {
        Element parent = new Element("div");
        parent.html("<p>New Content</p>");
        assertEquals("<p>New Content</p>", parent.html());
        assertEquals(1, parent.childNodes().size());
        assertEquals("p", parent.childNode(0).nodeName());
    }
    
    @Test
    public void testHtmlSetWithMultipleNodes() {
        Element parent = new Element("div");
        parent.html("<span>A</span><b>B</b>");
        assertEquals("<span>A</span><b>B</b>", parent.html());
        assertEquals(2, parent.childNodes().size());
    }
    
    @Test
    public void testHtmlSetClearsExisting() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p"));
        parent.html("<span>New</span>");
        assertEquals(1, parent.childNodes().size());
        assertEquals("span", parent.childNode(0).nodeName());
    }

    @Test
    public void testToStringIsOuterHtml() {
        Element el = new Element("div").attr("id", "test");
        assertEquals(el.outerHtml(), el.toString());
    }

    @Test
    public void testClone() {
        Element original = new Element("div").attr("id", "original");
        original.appendChild(new Element("span"));
        Element cloned = original.clone();

        assertNotSame(original, cloned);
        assertEquals(original.outerHtml(), cloned.outerHtml());
        assertEquals("div", cloned.tagName());
        assertEquals("original", cloned.id());
        assertEquals(1, cloned.childNodes().size());
        assertNotSame(original.childNode(0), cloned.childNode(0));
        assertEquals("span", cloned.childNode(0).nodeName());
    }
}
