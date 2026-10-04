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
    @Test
    public void testTagIdentityAndBlockStatus() throws Exception {
        Element div = new Element(Tag.valueOf("div"), "");
        assertEquals("div", div.nodeName());
        assertEquals("div", div.tagName());
        assertTrue(div.isBlock());
        assertFalse(new Element(Tag.valueOf("span"), "").isBlock());
    }

    @Test
    public void testRenameTag() throws Exception {
        Element el = new Element(Tag.valueOf("span"), "");
        assertSame(el, el.tagName("div"));
        assertEquals("div", el.tag().getName());
    }

    @Test
    public void testAttributesAndDatasetView() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "x").attr("data-key", "one");
        assertEquals("x", el.id());
        assertEquals("one", el.dataset().get("key"));
        el.dataset().put("key", "two");
        assertEquals("two", el.attr("data-key"));
    }

    @Test
    public void testChildrenFilterMixedNodes() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        Element child = el.appendElement("span");
        el.appendText("text");
        el.appendElement("br");
        assertEquals(3, el.childNodeSize());
        assertSame(child, el.child(0));
        assertEquals(2, el.children().size());
        assertEquals(1, el.textNodes().size());
    }

    @Test
    public void testDataNodesAndCombinedData() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendChild(new DataNode("a", ""));
        el.appendElement("span").appendChild(new DataNode("b", ""));
        assertEquals(1, el.dataNodes().size());
        assertEquals("ab", el.data());
    }

    @Test
    public void testAppendPrependAndInsertBoundaries() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        Element a = el.appendElement("a");
        Element c = el.appendElement("c");
        Element b = new Element(Tag.valueOf("b"), "");
        el.insertChildren(1, Collections.<Node>singletonList(b));
        assertSame(a, el.child(0));
        assertSame(b, el.child(1));
        assertSame(c, el.child(2));
        Element first = new Element(Tag.valueOf("i"), "");
        el.insertChildren(0, Collections.<Node>singletonList(first));
        assertSame(first, el.child(0));
        assertEquals(4, el.children().size());
    }

    @Test
    public void testNegativeInsertIndexAtEnd() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        Element a = el.appendElement("a");
        Element b = new Element(Tag.valueOf("b"), "");
        el.insertChildren(-1, Collections.<Node>singletonList(b));
        assertSame(a, el.child(0));
        assertSame(b, el.child(1));
    }

    @Test
    public void testAppendAndPrependHtml() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<p>tail</p>");
        el.prepend("<b>head</b>");
        assertEquals("head tail", el.text());
        assertEquals("b", el.child(0).tagName());
        assertEquals("p", el.child(1).tagName());
    }

    @Test
    public void testEmptyAndSetText() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("b").text("old");
        el.text("new");
        assertEquals("new", el.text());
        assertEquals(1, el.childNodeSize());
        el.empty();
        assertEquals(0, el.childNodeSize());
    }

    @Test
    public void testParentAndAncestorOrder() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element middle = root.appendElement("section");
        Element leaf = middle.appendElement("p");
        assertSame(middle, leaf.parent());
        assertEquals(2, leaf.parents().size());
        assertSame(middle, leaf.parents().get(0));
        assertSame(root, leaf.parents().get(1));
    }

    @Test
    public void testSiblingElementIndicesAndEdges() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element a = parent.appendElement("a");
        parent.appendText("gap");
        Element b = parent.appendElement("b");
        Element c = parent.appendElement("c");
        assertEquals(Integer.valueOf(0), a.elementSiblingIndex());
        assertEquals(Integer.valueOf(1), b.elementSiblingIndex());
        assertSame(c, b.nextElementSibling());
        assertSame(a, b.previousElementSibling());
        assertSame(a, b.firstElementSibling());
        assertSame(c, b.lastElementSibling());
        assertEquals(2, b.siblingElements().size());
        assertNull(a.previousElementSibling());
        assertNull(c.nextElementSibling());
    }

    @Test
    public void testSelectorsByTagIdClassAndAttribute() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element match = root.appendElement("p").attr("id", "target")
                .attr("class", "wide item").attr("data-key", "yes");
        root.appendElement("span").attr("class", "item");
        assertSame(match, root.getElementById("target"));
        assertEquals(1, root.getElementsByTag(" P ").size());
        assertEquals(2, root.getElementsByClass("item").size());
        assertEquals(1, root.getElementsByAttribute("data-key").size());
        assertEquals(1, root.getElementsByAttributeStarting("data-").size());
        assertSame(match, root.select("#target").get(0));
    }

    @Test
    public void testAttributeValueLookups() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element match = root.appendElement("a").attr("href", "https://site/a");
        root.appendElement("a").attr("href", "other");
        assertEquals(1, root.getElementsByAttributeValue("href", "https://site/a").size());
        assertEquals(3, root.getElementsByAttributeValueNot("href", "missing").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("href", "https://").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("href", "/a").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("href", "site").size());
        assertSame(match, root.getElementsByAttributeValueMatching("href", Pattern.compile(".*site.*")).get(0));
    }

    @Test
    public void testIndexLookupsAtFirstLastAndOutsideEdges() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a = root.appendElement("a");
        Element b = root.appendElement("b");
        Element c = root.appendElement("c");
        assertSame(root, root.getElementsByIndexEquals(0).get(0));
        assertSame(c, root.getElementsByIndexEquals(2).get(0));
        assertEquals(2, root.getElementsByIndexLessThan(2).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertEquals(0, root.getElementsByIndexGreaterThan(2).size());
        assertNotNull(b);
        assertNotNull(a);
    }

    @Test
    public void testTextNormalizationAndOwnText() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("one   two ");
        el.appendElement("b").text("inside");
        el.appendText(" three");
        assertEquals("one two inside three", el.text());
        assertEquals("one two three", el.ownText());
        assertTrue(el.hasText());
    }

    @Test
    public void testTextSearchAndRegexSearch() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p = root.appendElement("p");
        p.appendText("Hello");
        p.appendElement("b").text("World");
        assertTrue(root.getElementsContainingText("world").size() > 0);
        assertEquals(1, root.getElementsContainingOwnText("hello").size());
        assertTrue(root.getElementsMatchingText("Hello.*World").size() > 0);
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("Hello")).size());
        assertEquals(3, root.getAllElements().size());
    }

    @Test
    public void testClassNameClassSetAndMutations() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "  Alpha beta  ");
        assertEquals("Alpha beta", el.className());
        assertTrue(el.hasClass("alpha"));
        assertEquals(2, el.classNames().size());
        el.addClass("gamma").removeClass("beta");
        assertEquals("Alpha gamma", el.className());
        el.toggleClass("gamma");
        assertEquals("Alpha", el.className());
    }

    @Test
    public void testCssSelectorForIdAndClassPath() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element child = root.appendElement("p").attr("class", "item");
        assertEquals("div > p.item", child.cssSelector());
        child.attr("id", "chosen");
        assertEquals("#chosen", child.cssSelector());
    }

    @Test
    public void testFormValueBranches() throws Exception {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("entry");
        assertEquals("entry", input.val());
        Element area = new Element(Tag.valueOf("textarea"), "");
        area.val("body");
        assertEquals("body", area.val());
        assertEquals("body", area.text());
    }

    @Test
    public void testCloneAndHtmlReplacement() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("p").text("old");
        Element copy = el.clone();
        assertEquals(el, copy);
        el.html("<b>new</b>");
        assertEquals("<b>new</b>", el.html());
        assertEquals("old", copy.text());
    }

    @Test
    public void testPrependChildMovesToFirstPosition() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element existing = parent.appendElement("p");
        TextNode text = new TextNode("start", "");
        assertSame(parent, parent.prependChild(text));
        assertSame(text, parent.childNode(0));
        assertSame(existing, parent.child(0));
        assertEquals("start", parent.text().substring(0, 5));
    }

    @Test
    public void testPrependElementReturnsAttachedFirstChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("p");
        Element first = parent.prependElement("b");
        assertSame(first, parent.child(0));
        assertSame(parent, first.parent());
        assertEquals(2, parent.children().size());
    }

    @Test
    public void testPrependTextBeforeExistingText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendText("end");
        parent.prependText("begin");
        assertEquals(2, parent.textNodes().size());
        assertEquals("beginend", parent.text());
        assertEquals("begin", parent.textNodes().get(0).text());
    }

    @Test
    public void testBeforeHtmlInConfiguredParent() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("p").text("middle");
        assertSame(target, target.before("<b>first</b>"));
        assertEquals(2, parent.children().size());
        assertEquals("b", parent.child(0).tagName());
        assertSame(target, parent.child(1));
        assertEquals("first middle", parent.text());
    }

    @Test
    public void testAfterHtmlInConfiguredParent() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("p").text("middle");
        assertSame(target, target.after("<b>last</b>"));
        assertEquals(2, parent.children().size());
        assertSame(target, parent.child(0));
        assertEquals("b", parent.child(1).tagName());
        assertEquals("middle last", parent.text());
    }

    @Test
    public void testWrapElementWithSingleParent() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("p").text("inside");
        assertSame(target, target.wrap("<section></section>"));
        assertEquals(1, parent.children().size());
        Element wrapper = parent.child(0);
        assertEquals("section", wrapper.tagName());
        assertSame(target, wrapper.child(0));
        assertSame(wrapper, target.parent());
        assertEquals("inside", parent.text());
    }

    @Test
    public void testNodeVisitorHeadAndTailOnTextNode() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        TextNode text = new TextNode("exact", "");
        parent.appendChild(text);
        StringBuilder visited = new StringBuilder();
        NodeVisitor visitor = new NodeVisitor() {
            public void head(Node node, int depth) {
                visited.append("H").append(node.nodeName()).append(depth);
            }
            public void tail(Node node, int depth) {
                visited.append("T").append(node.nodeName()).append(depth);
            }
        };
        visitor.head(text, 1);
        visitor.tail(text, 1);
        assertEquals("H#text1T#text1", visited.toString());
    }
}
