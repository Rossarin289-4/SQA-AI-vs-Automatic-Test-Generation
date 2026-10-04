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
    public void testTagAndBlockState() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("div", el.nodeName());
        assertEquals("div", el.tagName());
        assertTrue(el.isBlock());
        assertSame(el, el.tagName("span"));
        assertEquals("span", el.tag().getName());
        assertFalse(el.isBlock());
    }

    @Test
    public void testIdAndDatasetView() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.id());
        el.attr("id", "x").attr("data-key", "one");
        assertEquals("x", el.id());
        assertEquals("one", el.dataset().get("key"));
        el.dataset().put("other", "two");
        assertEquals("two", el.attr("data-other"));
    }

    @Test
    public void testChildrenFilteringAndAccessAtEdges() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a = root.appendElement("a");
        root.appendText("middle");
        Element b = root.appendElement("b");
        assertEquals(2, root.children().size());
        assertSame(a, root.child(0));
        assertSame(b, root.child(1));
        assertEquals(1, root.textNodes().size());
        assertEquals("middle", root.textNodes().get(0).text());
    }

    @Test
    public void testDataNodesAndDataRecursion() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.appendChild(new DataNode("raw", ""));
        Element nested = root.appendElement("script");
        nested.appendChild(new DataNode("code", ""));
        assertEquals(1, root.dataNodes().size());
        assertEquals("rawcode", root.data());
    }

    @Test
    public void testAppendPrependAndInsertChildrenEdges() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element last = root.appendElement("last");
        Element first = root.prependElement("first");
        root.insertChildren(-1, Collections.<Node>singletonList(new Element(Tag.valueOf("end"), "")));
        assertSame(first, root.child(0));
        assertSame(last, root.child(1));
        assertEquals("end", root.child(2).tagName());
        assertEquals(3, root.childNodeSize());
    }

    @Test
    public void testAppendAndPrependText() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("end");
        el.prependText("start");
        assertEquals("startend", el.text());
        assertEquals("start", el.textNodes().get(0).text());
    }

    @Test
    public void testAppendAndPrependHtml() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<i>a</i>");
        el.prepend("<b>b</b>");
        assertEquals("ba", el.text());
        assertEquals("b", el.child(0).tagName());
        assertEquals("i", el.child(1).tagName());
    }

    @Test
    public void testEmptyAndHtmlReplaceChildren() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "kept").appendElement("i");
        el.empty();
        assertEquals(0, el.childNodeSize());
        assertEquals("kept", el.id());
        el.html("<b>new</b>");
        assertEquals("new", el.text());
        assertEquals("b", el.child(0).tagName());
    }

    @Test
    public void testSiblingNavigationAcrossTextNodes() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a = root.appendElement("a");
        root.appendText("x");
        Element b = root.appendElement("b");
        assertEquals(0, a.elementSiblingIndex().intValue());
        assertEquals(1, b.elementSiblingIndex().intValue());
        assertSame(b, a.nextElementSibling());
        assertSame(a, b.previousElementSibling());
        assertNull(a.previousElementSibling());
        assertNull(b.nextElementSibling());
        assertEquals(1, a.siblingElements().size());
    }

    @Test
    public void testGetElementsByTagAndAllElements() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.appendElement("p").appendElement("p");
        assertEquals(2, root.getElementsByTag(" P ").size());
        assertEquals(3, root.getAllElements().size());
    }

    @Test
    public void testLookupsByIdClassAndAttribute() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element item = root.appendElement("p").attr("id", "target").attr("class", "a b").attr("data-x", "yes");
        assertSame(item, root.getElementById("target"));
        assertEquals(1, root.getElementsByClass("B").size());
        assertEquals(1, root.getElementsByAttribute(" DATA-X ").size());
        assertEquals(1, root.getElementsByAttributeStarting("data-").size());
    }

    @Test
    public void testAttributeValuePredicates() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element match = root.appendElement("a").attr("href", "Abc-123");
        root.appendElement("a").attr("href", "other");
        assertEquals(1, root.getElementsByAttributeValue("href", "abc-123").size());
        assertEquals(3, root.getElementsByAttributeValueNot("href", "none").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("href", "ab").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("href", "123").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("href", "c-1").size());
        assertSame(match, root.getElementsByAttributeValueMatching("href", Pattern.compile("Abc.*")).get(0));
    }

    @Test
    public void testAttributeRegexStringOverload() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.appendElement("i").attr("title", "abc");
        assertEquals(1, root.getElementsByAttributeValueMatching("title", "a.c").size());
        try {
            root.getElementsByAttributeValueMatching("title", "[");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testSiblingIndexSearchBoundaries() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.appendElement("a");
        root.appendElement("b");
        root.appendElement("c");
        assertEquals(2, root.getElementsByIndexLessThan(1).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertEquals(1, root.getElementsByIndexEquals(0).size());
        assertEquals(0, root.getElementsByIndexEquals(3).size());
    }

    @Test
    public void testTextSearchAndOwnText() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p = root.appendElement("p");
        p.appendText("Alpha ");
        p.appendElement("b").text("Beta");
        assertEquals("Alpha Beta", p.text());
        assertEquals("Alpha", p.ownText());
        assertEquals(3, root.getElementsContainingText("beta").size());
        assertEquals(1, root.getElementsContainingOwnText("alpha").size());
    }

    @Test
    public void testTextRegexSearches() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p = root.appendElement("p").text("word42");
        assertEquals(2, root.getElementsMatchingText(Pattern.compile(".*42")).size());
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("word.*")).size());
        assertEquals("word42", p.text());
    }

    @Test
    public void testRegexStringSearchAndInvalidPattern() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.appendElement("p").text("item7");
        assertEquals(2, root.getElementsMatchingText(".*7").size());
        assertEquals(1, root.getElementsMatchingOwnText("item.*").size());
        try {
            root.getElementsMatchingOwnText("[");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testHasTextAndTextSetter() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p = root.appendElement("p").appendText("  ");
        assertFalse(p.hasText());
        p.text("value");
        assertTrue(p.hasText());
        assertEquals("value", p.text());
        assertEquals(1, p.childNodeSize());
    }

    @Test
    public void testClassNameAndMutators() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "").attr("class", "alpha beta");
        assertEquals("alpha beta", el.className());
        assertTrue(el.hasClass("ALPHA"));
        el.addClass("gamma");
        assertEquals("alpha beta gamma", el.className());
        el.removeClass("beta");
        assertEquals("alpha gamma", el.className());
        el.toggleClass("gamma");
        assertEquals("alpha", el.className());
    }

    @Test
    public void testFormValuesAndCssSelector() throws Exception {
        Element input = new Element(Tag.valueOf("input"), "");
        assertEquals("", input.val());
        input.val("v");
        assertEquals("v", input.val());
        Element area = new Element(Tag.valueOf("textarea"), "");
        area.val("text");
        assertEquals("text", area.val());
        input.attr("id", "field");
        assertEquals("#field", input.cssSelector());
    }

    @Test
    public void testParentsAndSelectorQuery() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element child = root.appendElement("p").attr("class", "chosen");
        assertEquals(1, child.parents().size());
        assertSame(child, root.select("p.chosen").get(0));
        assertEquals(1, root.getElementsByClass("chosen").size());
    }

    @Test
    public void testParentReturnsAttachedElementAndNullWhenStandalone() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        assertNull(child.parent());
        root.appendChild(child);
        assertSame(root, child.parent());
    }

    @Test
    public void testPrependChildAtFirstNodePosition() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element old = root.appendElement("old");
        TextNode text = new TextNode("first", "");
        root.prependChild(text);
        assertSame(text, root.childNode(0));
        assertSame(old, root.child(0));
        assertEquals(2, root.childNodeSize());
    }

    @Test
    public void testBeforeHtmlInsertsPrecedingSibling() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element target = root.appendElement("target");
        target.before("<b>before</b>");
        assertEquals(2, root.children().size());
        assertEquals("b", root.child(0).tagName());
        assertSame(target, root.child(1));
        assertEquals("before", root.child(0).text());
    }

    @Test
    public void testAfterHtmlInsertsFollowingSibling() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element target = root.appendElement("target");
        target.after("<i>after</i>");
        assertEquals(2, root.children().size());
        assertSame(target, root.child(0));
        assertEquals("i", root.child(1).tagName());
        assertEquals("after", root.child(1).text());
    }

    @Test
    public void testWrapPlacesElementUnderParsedWrapper() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element target = root.appendElement("p").text("inside");
        target.wrap("<section></section>");
        assertEquals(1, root.children().size());
        Element wrapper = root.child(0);
        assertEquals("section", wrapper.tagName());
        assertSame(target, wrapper.child(0));
        assertEquals("inside", wrapper.text());
    }

    @Test
    public void testFirstElementSiblingForNonFirstChild() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element first = root.appendElement("a");
        Element middle = root.appendElement("b");
        root.appendElement("c");
        assertSame(first, middle.firstElementSibling());
        assertSame(middle, root.child(1));
    }

    @Test
    public void testLastElementSiblingForNonLastChild() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.appendElement("a");
        Element middle = root.appendElement("b");
        Element last = root.appendElement("c");
        assertSame(last, middle.lastElementSibling());
        assertSame(last, root.child(2));
    }

    @Test
    public void testFirstAndLastSiblingAreNullWhenAlone() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element only = root.appendElement("only");
        assertNull(only.firstElementSibling());
        assertNull(only.lastElementSibling());
    }
}
