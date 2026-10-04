package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ElementTest {
    @Test
    public void testTagNameAndBlockStatus() throws Exception {
        Element div = new Element(Tag.valueOf("div"), "");
        assertEquals("div", div.nodeName());
        assertEquals("div", div.tagName());
        assertTrue(div.isBlock());
        assertSame(div, div.tagName("span"));
        assertEquals("span", div.nodeName());
        assertFalse(div.isBlock());
    }

    @Test
    public void testIdAndDatasetReflectAttributes() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.id());
        el.attr("id", "item").attr("data-kind", "book");
        assertEquals("item", el.id());
        assertEquals("book", el.dataset().get("kind"));
        el.dataset().put("kind", "map");
        assertEquals("map", el.attr("data-kind"));
    }

    @Test
    public void testChildrenFilterMixedNodesAndBoundaries() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = parent.appendElement("p");
        parent.appendText("between");
        Element last = parent.appendElement("span");
        assertEquals(2, parent.children().size());
        assertSame(first, parent.child(0));
        assertSame(last, parent.child(1));
        try { parent.child(2); fail("expected IndexOutOfBoundsException"); }
        catch (IndexOutOfBoundsException expected) { }
    }

    @Test
    public void testTextNodesAndDataNodes() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendText("plain");
        parent.appendChild(new DataNode("raw", ""));
        assertEquals(1, parent.textNodes().size());
        assertEquals("plain", parent.textNodes().get(0).getWholeText());
        assertEquals(1, parent.dataNodes().size());
        assertEquals("raw", parent.data());
    }

    @Test
    public void testInsertChildrenAtStartAndEndEdges() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element a = parent.appendElement("a");
        Element b = new Element(Tag.valueOf("b"), "");
        parent.insertChildren(0, Collections.<Node>singletonList(b));
        Element c = new Element(Tag.valueOf("c"), "");
        parent.insertChildren(-1, Collections.<Node>singletonList(c));
        assertSame(b, parent.child(0));
        assertSame(a, parent.child(1));
        assertSame(c, parent.child(2));
        assertEquals(3, parent.childNodeSize());
    }

    @Test
    public void testAppendPrependAndEmpty() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element appended = parent.appendElement("a");
        Element prepended = parent.prependElement("b");
        parent.prependText("start");
        assertSame(prepended, parent.child(0));
        assertEquals("start", parent.textNodes().get(0).getWholeText());
        assertSame(appended, parent.child(1));
        parent.empty();
        assertEquals(0, parent.childNodeSize());
    }

    @Test
    public void testSiblingIndexesAndElementSiblingsIgnoreText() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element a = parent.appendElement("a");
        parent.appendText("x");
        Element b = parent.appendElement("b");
        Element c = parent.appendElement("c");
        assertEquals(Integer.valueOf(1), b.elementSiblingIndex());
        assertSame(a, b.previousElementSibling());
        assertSame(c, b.nextElementSibling());
        assertSame(a, b.firstElementSibling());
        assertSame(c, b.lastElementSibling());
        assertEquals(2, b.siblingElements().size());
    }

    @Test
    public void testTagAndIdSearchIncludeRootAndDescendants() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.attr("id", "root");
        Element child = root.appendElement("p");
        child.attr("id", "leaf");
        assertEquals(1, root.getElementsByTag(" DIV ").size());
        assertSame(root, root.getElementById("root"));
        assertSame(child, root.getElementById("leaf"));
        assertEquals(2, root.getAllElements().size());
    }

    @Test
    public void testClassAndAttributeSearch() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.attr("class", "red wide").attr("data-kind", "book");
        Element child = root.appendElement("span");
        child.attr("class", "wide").attr("title", "a book");
        assertEquals(2, root.getElementsByClass("wide").size());
        assertEquals(2, root.getElementsByAttribute(" CLASS ").size());
        assertEquals(2, root.getElementsByAttributeStarting(" DATA-").size());
        assertEquals(1, root.getElementsByAttributeValue("title", "a book").size());
        assertEquals(2, root.getElementsByAttributeValueNot("title", "other").size());
    }

    @Test
    public void testAttributeValuePrefixSuffixAndContains() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.attr("href", "https://example.org/path");
        assertEquals(1, root.getElementsByAttributeValueStarting("href", "https").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("href", "path").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("href", "example").size());
        assertEquals(1, root.getElementsByAttributeValueMatching("href", Pattern.compile(".*path")).size());
    }

    @Test
    public void testSiblingIndexSearchEdges() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a = root.appendElement("a");
        Element b = root.appendElement("b");
        Element c = root.appendElement("c");
        assertEquals(2, root.getElementsByIndexLessThan(1).size());
        assertSame(b, root.getElementsByIndexEquals(1).first());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertSame(a, root.getElementsByIndexEquals(0).first());
        assertSame(c, root.getElementsByIndexEquals(2).first());
    }

    @Test
    public void testTextAndOwnTextSearching() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.appendText("Hello ");
        Element child = root.appendElement("b");
        child.text("World");
        assertEquals("Hello World", root.text());
        assertEquals("Hello", root.ownText());
        assertTrue(root.hasText());
        assertEquals(2, root.getElementsContainingText("world").size());
        assertEquals(1, root.getElementsContainingOwnText("hello").size());
    }

    @Test
    public void testTextRegexSearch() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.appendText("alpha");
        Element child = root.appendElement("p");
        child.text("beta");
        assertEquals(1, root.getElementsMatchingText(Pattern.compile("alpha")).size());
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("beta")).size());
    }

    @Test
    public void testClassNameMutation() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "one two");
        assertTrue(el.hasClass("ONE"));
        el.addClass("three");
        assertEquals("one two three", el.className());
        assertTrue(el.hasClass("three"));
    }

    @Test
    public void testTextSetterAndAppendText() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("b").text("old");
        el.text("new");
        assertEquals("new", el.text());
        assertEquals(0, el.children().size());
        el.appendText(" tail");
        assertEquals("new tail", el.text());
    }

    @Test
    public void testParsedAppendAndPrepend() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<p>tail</p>");
        el.prepend("<b>head</b>");
        assertEquals("head tail", el.text());
        assertEquals("b", el.child(0).tagName());
        assertEquals("p", el.child(1).tagName());
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
    public void testSelectCssQuery() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.appendElement("p").attr("class", "note");
        root.appendElement("span");
        assertEquals(1, root.select("p.note").size());
        assertEquals("p", root.select("p.note").first().tagName());
    }

    @Test
    public void testValUsesTextareaTextAndOtherElementValueAttribute() throws Exception {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("abc");
        assertEquals("abc", input.val());
        Element area = new Element(Tag.valueOf("textarea"), "");
        area.val("line");
        assertEquals("line", area.val());
    }

    @Test
    public void testTagReturnsCurrentTagAfterRename() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        assertSame(el, el.tagName("section"));
        assertEquals("section", el.tag().getName());
    }

    @Test
    public void testPrependChildMovesSameNodeToFirstPosition() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element existing = parent.appendElement("p");
        TextNode text = new TextNode("start", "");
        assertSame(parent, parent.prependChild(text));
        assertSame(text, parent.childNode(0));
        assertSame(existing, parent.child(0));
        assertEquals("start", parent.textNodes().get(0).getWholeText());
    }

    @Test
    public void testBeforeHtmlInsertsParsedSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("p");
        target.before("<b>first</b>");
        assertEquals("b", parent.child(0).tagName());
        assertEquals("p", parent.child(1).tagName());
        assertEquals("first", parent.child(0).text());
    }

    @Test
    public void testAfterHtmlInsertsParsedSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("p");
        target.after("<b>last</b>");
        assertEquals("p", parent.child(0).tagName());
        assertEquals("b", parent.child(1).tagName());
        assertEquals("last", parent.child(1).text());
    }

    @Test
    public void testWrapElementInNestedMarkup() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("p");
        target.text("inside");
        target.wrap("<section><b></b></section>");
        assertEquals("section", parent.child(0).tagName());
        assertSame(target, parent.child(0).child(0).child(0));
        assertEquals("inside", parent.text());
    }

    @Test
    public void testClassNamesSetAndPersistOnAttribute() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "first second");
        Set<String> names = el.classNames();
        assertTrue(names.contains("first"));
        assertTrue(names.contains("second"));
        names.add("third");
        assertEquals("first second", el.className());
        el.classNames(names);
        assertEquals("first second third", el.className());
        assertTrue(el.hasClass("third"));
    }
}
