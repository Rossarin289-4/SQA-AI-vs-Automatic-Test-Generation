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
    public void testTagAndAttributeBasics() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("div", el.nodeName());
        assertEquals("div", el.tagName());
        assertEquals(Tag.valueOf("div"), el.tag());
        assertTrue(el.isBlock());
        assertEquals("", el.id());
        assertSame(el, el.attr("id", "x"));
        assertEquals("x", el.id());
    }

    @Test
    public void testTagNameChange() throws Exception {
        Element el = new Element(Tag.valueOf("span"), "");
        assertSame(el, el.tagName("div"));
        assertEquals("div", el.tagName());
        assertTrue(el.isBlock());
    }

    @Test
    public void testDatasetIsAttributeView() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-key", "one");
        assertEquals("one", el.dataset().get("key"));
        el.dataset().put("other", "two");
        assertEquals("two", el.attr("data-other"));
    }

    @Test
    public void testChildFilteringAndTextNodes() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        Element child = el.appendElement("b");
        el.appendText("own");
        assertEquals(1, el.children().size());
        assertSame(child, el.child(0));
        assertEquals(1, el.textNodes().size());
        assertEquals("own", el.textNodes().get(0).text());
        assertEquals(2, el.childNodeSize());
    }

    @Test
    public void testDataNodesAndRecursiveData() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendChild(new DataNode("a", ""));
        el.appendElement("script").appendChild(new DataNode("b", ""));
        assertEquals(1, el.dataNodes().size());
        assertEquals("a", el.dataNodes().get(0).getWholeData());
        assertEquals("ab", el.data());
    }

    @Test
    public void testAppendPrependAndInsertBoundaries() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        Element middle = el.appendElement("m");
        el.prependElement("first");
        el.appendElement("last");
        List<Node> inserted = new ArrayList<Node>();
        inserted.add(new Element(Tag.valueOf("new"), ""));
        el.insertChildren(1, inserted);
        assertEquals(4, el.children().size());
        assertEquals("first", el.child(0).tagName());
        assertEquals("new", el.child(1).tagName());
        assertSame(middle, el.child(2));
        assertEquals("last", el.child(3).tagName());
    }

    @Test
    public void testNegativeInsertIndexAtEnd() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("a");
        el.insertChildren(-1, Collections.<Node>singletonList(new Element(Tag.valueOf("b"), "")));
        assertEquals(2, el.children().size());
        assertEquals("b", el.child(1).tagName());
    }

    @Test
    public void testAppendAndPrependTextAndHtml() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText("middle");
        el.prependText("start");
        el.append("<b>end</b>");
        assertEquals("startmiddleend", el.text());
        assertEquals(1, el.getElementsByTag("b").size());
        assertEquals("end", el.child(1).text());
    }

    @Test
    public void testEmptyAndHtmlReplacement() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "kept");
        el.append("<b>old</b>");
        assertSame(el, el.html("<i>new</i>"));
        assertEquals("new", el.text());
        assertEquals(1, el.children().size());
        el.empty();
        assertEquals(0, el.childNodeSize());
        assertEquals("kept", el.id());
    }

    @Test
    public void testSiblingMethodsAcrossTextNodes() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = parent.appendElement("a");
        parent.appendText("gap");
        Element second = parent.appendElement("b");
        Element third = parent.appendElement("c");
        assertEquals(2, first.siblingElements().size());
        assertSame(second, first.nextElementSibling());
        assertSame(first, second.previousElementSibling());
        assertSame(first, second.firstElementSibling());
        assertSame(third, second.lastElementSibling());
        assertEquals(Integer.valueOf(1), second.elementSiblingIndex());
    }

    @Test
    public void testSiblingEndsAndStandaloneIndex() throws Exception {
        Element solo = new Element(Tag.valueOf("p"), "");
        assertEquals(Integer.valueOf(0), solo.elementSiblingIndex());
        assertNull(solo.nextElementSibling());
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = parent.appendElement("a");
        Element last = parent.appendElement("b");
        assertNull(first.previousElementSibling());
        assertNull(last.nextElementSibling());
    }

    @Test
    public void testAncestorAndTagQueries() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element section = root.appendElement("section");
        Element target = section.appendElement("p");
        assertEquals(2, target.parents().size());
        assertSame(section, target.parents().get(0));
        assertEquals(1, root.getElementsByTag(" P ").size());
        assertSame(target, root.getElementsByTag("p").get(0));
    }

    @Test
    public void testIdClassAndAttributeQueries() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element match = root.appendElement("p").attr("id", "x").attr("class", "red wide").attr("data-k", "v");
        assertSame(match, root.getElementById("x"));
        assertEquals(1, root.getElementsByClass("wide").size());
        assertEquals(1, root.getElementsByAttribute(" DATA-K ").size());
        assertEquals(1, root.getElementsByAttributeStarting(" data- ").size());
        assertSame(match, root.getElementsByAttributeValue("data-k", "V").get(0));
    }

    @Test
    public void testAttributeValueOperators() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element match = root.appendElement("a").attr("href", "abCde");
        root.appendElement("a").attr("href", "other");
        assertEquals(2, root.getElementsByAttributeValueNot("href", "missing").size());
        assertSame(match, root.getElementsByAttributeValueStarting("href", "AB").get(0));
        assertSame(match, root.getElementsByAttributeValueEnding("href", "DE").get(0));
        assertSame(match, root.getElementsByAttributeValueContaining("href", "Bc").get(0));
        assertSame(match, root.getElementsByAttributeValueMatching("href", "a.*e").get(0));
        assertSame(match, root.getElementsByAttributeValueMatching("href", Pattern.compile("abCde")).get(0));
    }

    @Test
    public void testIndexQueriesAtFirstAndLastChildren() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element first = root.appendElement("a");
        root.appendElement("b");
        Element last = root.appendElement("c");
        assertEquals(3, root.getElementsByIndexLessThan(2).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertSame(first, root.getElementsByIndexEquals(0).get(0));
        assertSame(last, root.getElementsByIndexEquals(2).get(0));
        assertEquals(1, root.getElementsByIndexGreaterThan(2).size());
    }

    @Test
    public void testTextSearchOwnTextAndRegex() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element parent = root.appendElement("p");
        parent.appendText("Alpha");
        parent.appendElement("b").text("Beta");
        assertEquals(3, root.getElementsContainingText("beta").size());
        assertSame(parent, root.getElementsContainingOwnText("alpha").get(0));
        assertSame(parent, root.getElementsMatchingText("Alpha Beta").get(0));
        assertSame(parent, root.getElementsMatchingText(Pattern.compile("Alpha.*")).get(0));
        assertSame(parent, root.getElementsMatchingOwnText(Pattern.compile("Alpha")).get(0));
        assertSame(parent, root.getElementsMatchingOwnText("Alpha").get(0));
    }

    @Test
    public void testAllElementsAndCssSelection() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element child = root.appendElement("p").attr("class", "pick");
        assertEquals(2, root.getAllElements().size());
        assertEquals(1, root.select("p.pick").size());
        assertSame(child, root.select("p.pick").get(0));
    }

    @Test
    public void testTextNormalizationAndOwnText() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText(" one   ");
        el.appendElement("span").text("two");
        el.appendText(" three");
        assertEquals("one two three", el.text());
        assertEquals("one three", el.ownText());
        assertTrue(el.hasText());
    }

    @Test
    public void testBlankTextHasNoText() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendText(" \n ");
        assertFalse(el.hasText());
        assertEquals("", el.text());
        assertEquals("", el.ownText());
    }

    @Test
    public void testClassNameMutation() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "one two");
        assertEquals("one two", el.className());
        assertTrue(el.classNames().contains("one"));
        assertTrue(el.hasClass("TWO"));
        el.addClass("three");
        assertEquals("one two three", el.className());
        el.removeClass("one");
        assertEquals("two three", el.className());
        el.toggleClass("two");
        assertEquals("three", el.className());
        el.toggleClass("four");
        assertEquals("three four", el.className());
    }

    @Test
    public void testValUsesTextareaTextAndOtherValueAttribute() throws Exception {
        Element input = new Element(Tag.valueOf("input"), "");
        assertSame(input, input.val("v"));
        assertEquals("v", input.val());
        Element area = new Element(Tag.valueOf("textarea"), "");
        area.val("text");
        assertEquals("text", area.val());
    }

    @Test
    public void testInvalidRegexThrowsIllegalArgumentException() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        try {
            el.getElementsMatchingText("[");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParentReturnsRegisteredParent() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("p");
        assertSame(parent, child.parent());
    }

    @Test
    public void testParentIsNullWhenStandalone() throws Exception {
        Element standalone = new Element(Tag.valueOf("p"), "");
        assertNull(standalone.parent());
    }

    @Test
    public void testPrependChildMovesExistingNodeToFront() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = parent.appendElement("a");
        Element last = parent.appendElement("b");
        Element inserted = new Element(Tag.valueOf("i"), "");
        assertSame(parent, parent.prependChild(inserted));
        assertEquals(3, parent.children().size());
        assertSame(inserted, parent.child(0));
        assertSame(first, parent.child(1));
        assertSame(last, parent.child(2));
        assertSame(parent, inserted.parent());
    }

    @Test
    public void testPrependChildReparentsNode() throws Exception {
        Element oldParent = new Element(Tag.valueOf("div"), "");
        Element moved = oldParent.appendElement("b");
        Element newParent = new Element(Tag.valueOf("section"), "");
        newParent.appendElement("i");
        newParent.prependChild(moved);
        assertEquals(0, oldParent.children().size());
        assertSame(moved, newParent.child(0));
        assertSame(newParent, moved.parent());
    }

    @Test
    public void testPrependHtmlBeforeExistingChildren() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element existing = parent.appendElement("b");
        existing.text("old");
        assertSame(parent, parent.prepend("<i>new</i>"));
        assertEquals(2, parent.children().size());
        assertEquals("i", parent.child(0).tagName());
        assertEquals("new", parent.child(0).text());
        assertSame(existing, parent.child(1));
    }

    @Test
    public void testPrependHtmlMultipleNodesKeepsOrder() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<b>old</b>");
        parent.prepend("<i>first</i><u>second</u>");
        assertEquals(3, parent.children().size());
        assertEquals("i", parent.child(0).tagName());
        assertEquals("u", parent.child(1).tagName());
        assertEquals("b", parent.child(2).tagName());
    }

    @Test
    public void testBeforeHtmlInsertsAtFirstSiblingPosition() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("b");
        target.before("<i>before</i>");
        assertEquals(2, parent.children().size());
        assertEquals("i", parent.child(0).tagName());
        assertSame(target, parent.child(1));
        assertSame(parent, parent.child(0).parent());
    }

    @Test
    public void testBeforeHtmlWithTextSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendText("start");
        Element target = parent.appendElement("b");
        target.before("<i>x</i>");
        assertEquals(3, parent.childNodeSize());
        assertEquals("start", ((TextNode) parent.childNode(0)).text());
        assertEquals("i", ((Element) parent.childNode(1)).tagName());
        assertSame(target, parent.childNode(2));
    }

    @Test
    public void testAfterHtmlInsertsAtEndSiblingPosition() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("b");
        target.after("<i>after</i>");
        assertEquals(2, parent.children().size());
        assertSame(target, parent.child(0));
        assertEquals("i", parent.child(1).tagName());
        assertSame(parent, parent.child(1).parent());
    }

    @Test
    public void testAfterHtmlWithFollowingSibling() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("b");
        Element following = parent.appendElement("u");
        target.after("<i>x</i>");
        assertEquals(3, parent.children().size());
        assertSame(target, parent.child(0));
        assertEquals("i", parent.child(1).tagName());
        assertSame(following, parent.child(2));
    }

    @Test
    public void testWrapElementInSingleWrapper() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("b");
        target.text("inside");
        assertSame(target, target.wrap("<section><i></i></section>"));
        assertEquals(1, parent.children().size());
        Element wrapper = parent.child(0);
        assertEquals("section", wrapper.tagName());
        Element inner = wrapper.child(0);
        assertEquals("i", inner.tagName());
        assertSame(target, inner.child(0));
        assertEquals("inside", inner.child(0).text());
    }

    @Test
    public void testWrapElementInNestedWrappers() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element target = parent.appendElement("b");
        target.wrap("<section><i></i></section>");
        Element outer = parent.child(0);
        Element inner = outer.child(0);
        assertEquals("section", outer.tagName());
        assertEquals("i", inner.tagName());
        assertSame(target, inner.child(0));
    }

    @Test
    public void testWrapPreservesOtherSiblingOrder() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element before = parent.appendElement("a");
        Element target = parent.appendElement("b");
        Element after = parent.appendElement("c");
        target.wrap("<i></i>");
        assertEquals(3, parent.children().size());
        assertSame(before, parent.child(0));
        assertEquals("i", parent.child(1).tagName());
        assertSame(after, parent.child(2));
        assertSame(target, parent.child(1).child(0));
    }
}
