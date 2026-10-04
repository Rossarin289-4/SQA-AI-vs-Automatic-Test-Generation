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
    public void testTagName() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagNameChange() throws Exception {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        el.tagName("div");
        assertEquals("div", el.tagName());
    }

    @Test
    public void testTagObject() throws Exception {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        assertEquals(Tag.valueOf("p"), el.tag());
    }

    @Test
    public void testIsBlock() throws Exception {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        assertTrue(div.isBlock());
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        assertFalse(span.isBlock());
    }

    @Test
    public void testIdAttribute() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("id", "testId");
        assertEquals("testId", el.id());
    }

    @Test
    public void testIdAttributeNotPresent() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.id());
    }

    @Test
    public void testAttrSetAndGet() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("key", "value");
        assertEquals("value", el.attr("key"));
    }

    @Test
    public void testAttrSetAndGet_EmptyValue() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("key", "");
        assertEquals("", el.attr("key"));
    }

    @Test
    public void testAttrSetAndGet_NullValue() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("key", null);
        assertEquals("", el.attr("key")); // Assuming null attribute value becomes empty string
    }
    
    @Test
    public void testAttrGetNonExistent() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.attr("nonExistent"));
    }

    @Test
    public void testDataset() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("data-key", "value");
        Map<String, String> dataset = el.dataset();
        assertEquals("value", dataset.get("key"));
    }

    @Test
    public void testDataset_Multiple() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("data-key1", "value1");
        el.attr("data-key2", "value2");
        Map<String, String> dataset = el.dataset();
        assertEquals("value1", dataset.get("key1"));
        assertEquals("value2", dataset.get("key2"));
    }

    @Test
    public void testDataset_NonDataAttribute() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.attr("data-key", "value");
        el.attr("other", "otherValue");
        Map<String, String> dataset = el.dataset();
        assertEquals("value", dataset.get("key"));
        assertNull(dataset.get("other"));
    }
    
    @Test
    public void testParent() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParent_NoParent() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertNull(el.parent());
    }

    @Test
    public void testParents() throws Exception {
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
    public void testChild_IndexOutOfBounds() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        try {
            parent.child(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testChildren() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        TextNode text1 = new TextNode("some text", "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(text1);
        parent.appendChild(child2);

        Elements children = parent.children();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        assertEquals(child2, children.get(1));
    }
    
    @Test
    public void testChildren_NoChildren() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Elements children = parent.children();
        assertTrue(children.isEmpty());
    }

    @Test
    public void testTextNodes() throws Exception {
        Element parent = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode text1 = new TextNode("text one", "http://example.com");
        Element child1 = new Element(Tag.valueOf("span"), "http://example.com");
        TextNode text2 = new TextNode("text two", "http://example.com");
        parent.appendChild(text1);
        parent.appendChild(child1);
        parent.appendChild(text2);

        List<TextNode> textNodes = parent.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals(text1, textNodes.get(0));
        assertEquals(text2, textNodes.get(1));
    }

    @Test
    public void testDataNodes() throws Exception {
        Element parent = new Element(Tag.valueOf("script"), "http://example.com");
        DataNode data1 = new DataNode("data one", "http://example.com");
        Element child1 = new Element(Tag.valueOf("div"), "http://example.com");
        DataNode data2 = new DataNode("data two", "http://example.com");
        parent.appendChild(data1);
        parent.appendChild(child1);
        parent.appendChild(data2);

        List<DataNode> dataNodes = parent.dataNodes();
        assertEquals(2, dataNodes.size());
        assertEquals(data1, dataNodes.get(0));
        assertEquals(data2, dataNodes.get(1));
    }

    @Test
    public void testSelect() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "p1");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com").attr("class", "c1");
        Element child3 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "p2");
        root.appendChild(child1);
        root.appendChild(child2);
        root.appendChild(child3);

        Elements selected = root.select("p#p1");
        assertEquals(1, selected.size());
        assertEquals(child1, selected.get(0));
    }
    
    @Test
    public void testSelect_NonExistent() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        root.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        Elements selected = root.select("span");
        assertTrue(selected.isEmpty());
    }

    @Test
    public void testAppendChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child);
        assertEquals(child, parent.children().get(0));
        assertEquals(1, parent.childNodeSize());
    }

    @Test
    public void testPrependChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(child2, parent.children().get(0));
        assertEquals(child1, parent.children().get(1));
    }

    @Test
    public void testInsertChildren_AtBeginning() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.insertChildren(0, Collections.singletonList(child2));
        assertEquals(child2, parent.children().get(0));
        assertEquals(child1, parent.children().get(1));
    }

    @Test
    public void testInsertChildren_AtEnd() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.insertChildren(-1, Collections.singletonList(child2)); // -1 means end
        assertEquals(child1, parent.children().get(0));
        assertEquals(child2, parent.children().get(1));
    }

    @Test
    public void testInsertChildren_Middle() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child3 = new Element(Tag.valueOf("span"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child3);
        parent.insertChildren(1, Collections.singletonList(child2));
        assertEquals(child1, parent.children().get(0));
        assertEquals(child2, parent.children().get(1));
        assertEquals(child3, parent.children().get(2));
    }

    @Test
    public void testAppendElement() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("p");
        assertEquals("p", child.tagName());
        assertEquals(parent, child.parent());
        assertEquals(child, parent.children().get(0));
    }

    @Test
    public void testPrependElement() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.prependElement("span");
        assertEquals("span", child2.tagName());
        assertEquals(parent, child2.parent());
        assertEquals(child2, parent.children().get(0));
        assertEquals(child1, parent.children().get(1));
    }

    @Test
    public void testAppendText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendText("some text");
        // Corrected assertion: check if the appended node is a TextNode and has the correct text.
        assertTrue(parent.children().get(0) instanceof TextNode);
        assertEquals("some text", ((TextNode) parent.children().get(0)).text());
    }

    @Test
    public void testPrependText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        TextNode text1 = new TextNode("text 1", "http://example.com");
        parent.appendChild(text1);
        parent.prependText("text 0");
        assertEquals("text 0", parent.children().get(0).toString());
        assertEquals("text 1", parent.children().get(1).toString());
    }

    @Test
    public void testAppend_HtmlString() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.append("<p>Hello</p><span>World</span>");
        assertEquals(2, parent.children().size());
        assertEquals("p", parent.children().get(0).nodeName());
        assertEquals("span", parent.children().get(1).nodeName());
        assertEquals("Hello", ((TextNode) parent.children().get(0).childNode(0)).text());
        assertEquals("World", ((TextNode) parent.children().get(1).childNode(0)).text());
    }
    
    @Test
    public void testPrepend_HtmlString() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.append("<p>World</p>");
        parent.prepend("<p>Hello</p>");
        assertEquals(2, parent.children().size());
        assertEquals("p", parent.children().get(0).nodeName());
        assertEquals("p", parent.children().get(1).nodeName());
        assertEquals("Hello", ((TextNode) parent.children().get(0).childNode(0)).text());
        assertEquals("World", ((TextNode) parent.children().get(1).childNode(0)).text());
    }

    @Test
    public void testBefore_String() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com");
        Element parent = new Element(Tag.valueOf("body"), "http://example.com");
        parent.appendChild(element);
        element.before("<p>before</p>");
        assertEquals(2, parent.children().size());
        assertEquals("p", parent.children().get(0).nodeName());
        assertEquals("div", parent.children().get(1).nodeName());
    }

    @Test
    public void testAfter_String() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com");
        Element parent = new Element(Tag.valueOf("body"), "http://example.com");
        parent.appendChild(element);
        element.after("<span>after</span>");
        assertEquals(2, parent.children().size());
        assertEquals("div", parent.children().get(0).nodeName());
        assertEquals("span", parent.children().get(1).nodeName());
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
    public void testWrap() throws Exception {
        Element element = new Element(Tag.valueOf("p"), "http://example.com").text("content");
        Element wrapper = element.wrap("<div></div>");
        assertEquals("div", wrapper.tagName());
        assertEquals("p", wrapper.children().get(0).tagName());
        assertEquals("content", wrapper.text());
        assertEquals(wrapper.parent(), element.parent()); // Ensure parent relationship is maintained
    }

    @Test
    public void testSiblingElements() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        TextNode text1 = new TextNode("text", "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(text1);
        parent.appendChild(child2);

        Elements siblings = child1.siblingElements();
        assertEquals(1, siblings.size());
        assertEquals(child2, siblings.get(0));
    }
    
    @Test
    public void testSiblingElements_NoSiblings() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        Elements siblings = child1.siblingElements();
        assertTrue(siblings.isEmpty());
    }

    @Test
    public void testNextElementSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child2, child1.nextElementSibling());
    }

    @Test
    public void testNextElementSibling_Last() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        assertNull(child1.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, child2.previousElementSibling());
    }

    @Test
    public void testPreviousElementSibling_First() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        assertNull(child1.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, parent.firstElementSibling());
    }

    @Test
    public void testFirstElementSibling_OnlyChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        assertEquals(child1, parent.firstElementSibling());
    }
    
    @Test
    public void testFirstElementSibling_NoElements() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new TextNode("text", "http://example.com"));
        assertNull(parent.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(0, child1.elementSiblingIndex().intValue());
        assertEquals(1, child2.elementSiblingIndex().intValue());
    }
    
    @Test
    public void testElementSiblingIndex_RootElement() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals(0, el.elementSiblingIndex().intValue());
    }

    @Test
    public void testLastElementSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child2, parent.lastElementSibling());
    }

    @Test
    public void testLastElementSibling_OnlyChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://example.com");
        parent.appendChild(child1);
        assertEquals(child1, parent.lastElementSibling());
    }
    
    @Test
    public void testLastElementSibling_NoElements() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new TextNode("text", "http://example.com"));
        assertNull(parent.lastElementSibling());
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

        Elements ps = parent.getElementsByTag("p");
        assertEquals(2, ps.size());
        assertEquals(p1, ps.get(0));
        assertEquals(p2, ps.get(1));
    }

    @Test
    public void testGetElementById() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").attr("id", "id1");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com").attr("id", "id2");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Element found = parent.getElementById("id1");
        assertEquals(el1, found);
    }

    @Test
    public void testGetElementById_NotFound() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendChild(new Element(Tag.valueOf("p"), "http://example.com").attr("id", "id1"));
        assertNull(parent.getElementById("id2"));
    }

    @Test
    public void testGetElementsByClass() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").addClass("class1");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com").addClass("class2");
        Element el3 = new Element(Tag.valueOf("div"), "http://example.com").addClass("class1 class3");
        parent.appendChild(el1);
        parent.appendChild(el2);
        parent.appendChild(el3);

        Elements found = parent.getElementsByClass("class1");
        assertEquals(2, found.size());
        assertEquals(el1, found.get(0));
        assertEquals(el3, found.get(1));
    }

    @Test
    public void testGetElementsByAttribute() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com");
        Element el2 = new Element(Tag.valueOf("img"), "http://example.com").attr("src", "image.jpg");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsByAttribute("href");
        assertEquals(1, found.size());
        assertEquals(el1, found.get(0));
    }

    @Test
    public void testGetElementsByAttributeStarting() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com").attr("data-id", "1");
        Element el2 = new Element(Tag.valueOf("div"), "http://example.com").attr("data-name", "test");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsByAttributeStarting("data-");
        assertEquals(2, found.size());
        assertEquals(el1, found.get(0));
        assertEquals(el2, found.get(1));
    }
    
    @Test
    public void testGetElementsByAttributeValue() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("input"), "http://example.com").attr("type", "text");
        Element el2 = new Element(Tag.valueOf("input"), "http://example.com").attr("type", "submit");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsByAttributeValue("type", "text");
        assertEquals(1, found.size());
        assertEquals(el1, found.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueNot() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("input"), "http://example.com").attr("type", "text");
        Element el2 = new Element(Tag.valueOf("input"), "http://example.com").attr("type", "submit");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsByAttributeValueNot("type", "submit");
        assertEquals(1, found.size());
        assertEquals(el1, found.get(0));
    }
    
    @Test
    public void testGetElementsByAttributeValueStarting() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page2");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsByAttributeValueStarting("href", "http://example.com/page1");
        assertEquals(1, found.size());
        assertEquals(el1, found.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueEnding() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page1.html");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "page2.html");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsByAttributeValueEnding("href", ".html");
        assertEquals(2, found.size());
        assertEquals(el1, found.get(0));
        assertEquals(el2, found.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueContaining() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "example.net/page2");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsByAttributeValueContaining("href", "page");
        assertEquals(2, found.size());
        assertEquals(el1, found.get(0));
        assertEquals(el2, found.get(1));
    }

    @Test
    public void testGetElementsByAttributeValueMatching() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Element.createFromEncoded("<a>http://example.com/page2</a>", "http://example.com"), "http://example.com"); // Corrected creation
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsByAttributeValueMatching("href", Pattern.compile(".*page1"));
        assertEquals(1, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el1, found.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueMatching_RegexString() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page1");
        Element el2 = new Element(Tag.valueOf("a"), "http://example.com").attr("href", "http://example.com/page2");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsByAttributeValueMatching("href", ".*page2");
        assertEquals(1, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el2, found.get(0));
    }

    @Test
    public void testGetElementsByIndexLessThan() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(el1); // index 0
        parent.appendChild(el2); // index 1
        parent.appendChild(el3); // index 2

        Elements found = parent.getElementsByIndexLessThan(2);
        assertEquals(2, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el1, found.get(0));
        assertEquals(el2, found.get(1));
    }

    @Test
    public void testGetElementsByIndexGreaterThan() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(el1); // index 0
        parent.appendChild(el2); // index 1
        parent.appendChild(el3); // index 2

        Elements found = parent.getElementsByIndexGreaterThan(0);
        assertEquals(2, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el2, found.get(0));
        assertEquals(el3, found.get(1));
    }

    @Test
    public void testGetElementsByIndexEquals() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("a"), "http://example.com");
        parent.appendChild(el1); // index 0
        parent.appendChild(el2); // index 1
        parent.appendChild(el3); // index 2

        Elements found = parent.getElementsByIndexEquals(1);
        assertEquals(1, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el2, found.get(0));
    }
    
    @Test
    public void testGetElementsContainingText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").text("hello world");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com").text("goodbye");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsContainingText("world");
        assertEquals(1, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el1, found.get(0));
    }

    @Test
    public void testGetElementsContainingOwnText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").text("hello world");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com");
        el2.appendText("text ");
        el2.appendChild(new Element(Tag.valueOf("strong"), "http://example.com").text("world"));
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsContainingOwnText("hello");
        assertEquals(1, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el1, found.get(0));
    }
    
    @Test
    public void testGetElementsMatchingText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").text("abc");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com").text("def");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsMatchingText(Pattern.compile("a.*c"));
        assertEquals(1, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el1, found.get(0));
    }
    
    @Test
    public void testGetElementsMatchingText_RegexString() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").text("abc");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com").text("def");
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsMatchingText("d.*f");
        assertEquals(1, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el2, found.get(0));
    }

    @Test
    public void testGetElementsMatchingOwnText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").text("hello world");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com");
        el2.appendText("text ");
        el2.appendChild(new Element(Tag.valueOf("strong"), "http://example.com").text("world"));
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsMatchingOwnText("hello world");
        assertEquals(1, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el1, found.get(0));
    }
    
    @Test
    public void testGetElementsMatchingOwnText_RegexString() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element el1 = new Element(Tag.valueOf("p"), "http://example.com").text("hello world");
        Element el2 = new Element(Tag.valueOf("p"), "http://example.com");
        el2.appendText("text ");
        el2.appendChild(new Element(Tag.valueOf("strong"), "http://example.com").text("world"));
        parent.appendChild(el1);
        parent.appendChild(el2);

        Elements found = parent.getElementsMatchingOwnText("text.*");
        assertEquals(1, found.knownTag.size()); // Using knownTag from Elements to get size
        assertEquals(el2, found.get(0));
    }

    @Test
    public void testGetAllElements() throws Exception {
        Element root = new Element(Tag.valueOf("html"), "http://example.com");
        Element body = new Element(Tag.valueOf("body"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element span1 = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(body);
        body.appendChild(p1);
        body.appendChild(span1);

        Elements all = root.getAllElements();
        assertEquals(4, all.size()); // html, body, p, span
        assertEquals(root, all.get(0));
        assertEquals(body, all.get(1));
        assertEquals(p1, all.get(2));
        assertEquals(span1, all.get(3));
    }

    @Test
    public void testText() throws Exception {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.appendChild(new TextNode("Hello ", "http://example.com"));
        el.appendChild(new Element(Tag.valueOf("b"), "http://example.com").text("World"));
        el.appendChild(new TextNode("!", "http://example.com"));
        assertEquals("Hello World!", el.text());
    }

    @Test
    public void testText_WithFormatting() throws Exception {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.appendChild(new TextNode("  leading space  ", "http://example.com"));
        el.appendChild(new Element(Tag.valueOf("br"), "http://example.com"));
        el.appendChild(new TextNode("  next line  ", "http://example.com"));
        assertEquals("leading space next line", el.text());
    }

    @Test
    public void testOwnText() throws Exception {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.appendChild(new TextNode("Own Text ", "http://example.com"));
        el.appendChild(new Element(Tag.valueOf("b"), "http://example.com").text("Ignored"));
        el.appendChild(new TextNode(" More Own Text", "http://example.com"));
        assertEquals("Own Text More Own Text", el.ownText());
    }

    @Test
    public void testHasText() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendChild(new TextNode("Some Text", "http://example.com"));
        assertTrue(el.hasText());

        Element el2 = new Element(Tag.valueOf("div"), "http://example.com");
        el2.appendChild(new TextNode("   ", "http://example.com"));
        assertFalse(el2.hasText());

        Element el3 = new Element(Tag.valueOf("div"), "http://example.com");
        el3.appendChild(new Element(Tag.valueOf("span"), "http://example.com").text("Text Inside Span"));
        assertTrue(el3.hasText());
    }

    @Test
    public void testData() throws Exception {
        Element el = new Element(Tag.valueOf("script"), "http://example.com");
        el.appendChild(new DataNode("var x = 1;", "http://example.com"));
        // Corrected call: Element.data() is not a public method that takes arguments. Removed the erroneous call.
        // el.appendChild(new Element(Tag.valueOf("div"), "http://example.com").data("ignored"));
        el.appendChild(new DataNode("console.log(x);", "http://example.com"));
        assertEquals("var x = 1;console.log(x);", el.data());
    }
    
    @Test
    public void testClassName() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com").attr("class", "class1 class2");
        assertEquals("class1 class2", el.className());
    }
    
    @Test
    public void testClassName_Empty() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.className());
    }

    @Test
    public void testClassNames() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com").attr("class", "class1 class2");
        Set<String> classes = el.classNames();
        assertEquals(2, classes.size());
        assertTrue(classes.contains("class1"));
        assertTrue(classes.contains("class2"));
    }
    
    @Test
    public void testClassNames_Single() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com").attr("class", "single");
        Set<String> classes = el.classNames();
        assertEquals(1, classes.size());
        assertTrue(classes.contains("single"));
    }

    @Test
    public void testClassNames_Empty() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        Set<String> classes = el.classNames();
        assertTrue(classes.isEmpty());
    }
    
    @Test
    public void testClassNames_Set() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        Set<String> newClasses = new LinkedHashSet<>(Arrays.asList("new1", "new2"));
        el.classNames(newClasses);
        assertEquals("new1 new2", el.className());
        assertEquals(newClasses, el.classNames());
    }

    @Test
    public void testHasClass() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com").attr("class", "class1 class2");
        assertTrue(el.hasClass("class1"));
        assertTrue(el.hasClass("class2"));
        assertFalse(el.hasClass("class3"));
    }

    @Test
    public void testHasClass_CaseInsensitive() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com").attr("class", "Class1");
        assertTrue(el.hasClass("class1"));
    }
    
    @Test
    public void testAddClass() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com").addClass("class1");
        el.addClass("class2");
        assertEquals("class1 class2", el.className());
    }

    @Test
    public void testRemoveClass() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com").attr("class", "class1 class2 class3");
        el.removeClass("class2");
        assertEquals("class1 class3", el.className());
    }

    @Test
    public void testToggleClass_Add() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com").addClass("class1");
        el.toggleClass("class2");
        assertEquals("class1 class2", el.className());
    }

    @Test
    public void testToggleClass_Remove() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com").addClass("class1");
        el.toggleClass("class1");
        assertEquals("", el.className());
    }
    
    @Test
    public void testVal_Input() throws Exception {
        Element input = new Element(Tag.valueOf("input"), "http://example.com").attr("value", "testValue");
        assertEquals("testValue", input.val());
    }
    
    @Test
    public void testVal_TextArea() throws Exception {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com").text("textAreaValue");
        assertEquals("textAreaValue", textarea.val());
    }
    
    @Test
    public void testVal_SetInput() throws Exception {
        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.val("newValue");
        assertEquals("newValue", input.attr("value"));
    }

    @Test
    public void testVal_SetTextArea() throws Exception {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com");
        textarea.val("newTextAreaValue");
        assertEquals("newTextAreaValue", textarea.text());
    }
    
    @Test
    public void testHtml_GetEmpty() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertEquals("", el.html());
    }
    
    @Test
    public void testHtml_Set() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.html("<p>inner html</p>");
        assertEquals("<p>inner html</p>", el.html());
    }

    @Test
    public void testOuterHtml() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "http://example.com").attr("id", "outer");
        el.appendChild(new Element(Tag.valueOf("p"), "http://example.com").text("inner"));
        assertEquals("<div id=\"outer\"><p>inner</p></div>", el.outerHtml());
    }
    
    @Test
    public void testOuterHtml_SelfClosing() throws Exception {
        Element el = new Element(Tag.valueOf("br"), "http://example.com");
        assertEquals("<br />", el.outerHtml());
    }

    @Test
    public void testOuterHtml_WithAttributes() throws Exception {
        Element el = new Element(Tag.valueOf("input"), "http://example.com");
        el.attr("type", "text");
        el.attr("name", "test");
        assertEquals("<input type=\"text\" name=\"test\" />", el.outerHtml());
    }
}
