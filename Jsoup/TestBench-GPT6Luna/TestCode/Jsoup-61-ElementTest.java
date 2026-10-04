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

public class ElementTest {
    @Test
    public void testTagNameAndChangingTag() throws Exception {
        Element el = new Element("DIV");
        assertEquals("DIV", el.tagName());
        assertEquals("DIV", el.nodeName());
        assertSame(el, el.tagName("MiXeD"));
        assertEquals("MiXeD", el.tagName());
    }

    @Test
    public void testBlockClassification() throws Exception {
        assertTrue(new Element("div").isBlock());
        assertFalse(new Element("span").isBlock());
    }

    @Test
    public void testAttributesAndDataset() throws Exception {
        Element el = new Element("div");
        el.attr("ID", "a").attr("data-key", "one").attr("title", "x");
        assertEquals("a", el.id());
        assertEquals("one", el.dataset().get("key"));
        el.dataset().put("other", "two");
        assertEquals("two", el.attr("data-other"));
    }

    @Test
    public void testChildListsFilterNodeKinds() throws Exception {
        Element el = new Element("div");
        el.appendText("a").appendElement("b").appendText("c");
        assertEquals(1, el.children().size());
        assertEquals("b", el.child(0).tagName());
        assertEquals(1, el.textNodes().size());
    }

    @Test
    public void testAppendAndPrependChildren() throws Exception {
        Element el = new Element("div");
        Element last = el.appendElement("b");
        Element first = el.prependElement("i");
        assertSame(first, el.child(0));
        assertSame(last, el.child(1));
        assertEquals(2, el.childNodeSize());
    }

    @Test
    public void testInsertChildrenAtBoundaries() throws Exception {
        Element el = new Element("div");
        Element a = el.appendElement("a");
        Element b = new Element("b");
        el.insertChildren(0, Collections.<Node>singletonList(b));
        assertSame(b, el.child(0));
        assertSame(a, el.child(1));

        Element c = new Element("c");
        el.insertChildren(-1, Collections.<Node>singletonList(c));
        assertSame(c, el.child(2));
    }

    @Test
    public void testAppendAndPrependTextOrder() throws Exception {
        Element el = new Element("div");
        el.appendText("end");
        el.prependText("start");
        assertEquals("startend", el.text());
        assertEquals(1, el.textNodes().size());
    }

    @Test
    public void testParentsAndSiblingIndexes() throws Exception {
        Element root = new Element("main");
        Element a = root.appendElement("p");
        Element b = root.appendElement("p");
        assertSame(root, b.parent());
        assertEquals(1, b.elementSiblingIndex().intValue());
        assertSame(a, b.previousElementSibling());
        assertSame(b, a.nextElementSibling());
        assertEquals(1, b.siblingElements().size());
        assertEquals(1, b.parents().size());
    }

    @Test
    public void testSiblingEndpoints() throws Exception {
        Element root = new Element("main");
        Element a = root.appendElement("i");
        Element b = root.appendElement("b");
        assertSame(a, b.firstElementSibling());
        assertSame(b, a.lastElementSibling());
        assertNull(a.previousElementSibling());
        assertNull(b.nextElementSibling());
    }

    @Test
    public void testClassOperations() throws Exception {
        Element el = new Element("div").attr("class", "alpha beta");
        assertTrue(el.hasClass("ALPHA"));
        assertEquals(new LinkedHashSet<String>(Arrays.asList("alpha", "beta")), el.classNames());
        el.addClass("gamma").removeClass("alpha");
        assertEquals("beta gamma", el.className());
        el.toggleClass("beta");
        assertEquals("gamma", el.className());
    }

    @Test
    public void testTextAndOwnText() throws Exception {
        Element el = new Element("div");
        el.appendText("one ").appendElement("b").text("two");
        el.appendText(" three");
        assertEquals("one two three", el.text());
        assertEquals("one three", el.ownText());
        assertTrue(el.hasText());
    }

    @Test
    public void testTextSetterClearsChildren() throws Exception {
        Element el = new Element("div");
        el.appendElement("b").text("old");
        el.text("new text");
        assertEquals("new text", el.text());
        assertEquals(0, el.children().size());
        assertEquals(1, el.textNodes().size());
    }

    @Test
    public void testEmptyRetainsAttributes() throws Exception {
        Element el = new Element("div").attr("id", "keep");
        el.appendText("gone");
        el.empty();
        assertEquals("", el.text());
        assertEquals("keep", el.id());
        assertEquals(0, el.childNodeSize());
    }

    @Test
    public void testElementLookupMethods() throws Exception {
        Element root = new Element("main");
        Element target = root.appendElement("p").attr("id", "x").attr("class", "note");
        target.attr("data-kind", "sample");
        assertSame(target, root.getElementById("x"));
        assertEquals(1, root.getElementsByTag(" P ").size());
        assertEquals(1, root.getElementsByClass("note").size());
        assertEquals(1, root.getElementsByAttribute("id").size());
        assertEquals(1, root.getElementsByAttributeStarting("data-").size());
    }

    @Test
    public void testAttributeValueLookupForms() throws Exception {
        Element root = new Element("main");
        Element target = root.appendElement("a").attr("href", "abc-mid-xyz");
        assertSame(target, root.getElementsByAttributeValue("href", "abc-mid-xyz").get(0));
        assertSame(target, root.getElementsByAttributeValueStarting("href", "abc").get(0));
        assertSame(target, root.getElementsByAttributeValueEnding("href", "xyz").get(0));
        assertSame(target, root.getElementsByAttributeValueContaining("href", "mid").get(0));
        assertSame(target, root.getElementsByAttributeValueMatching("href", "abc.*xyz").get(0));
        assertEquals(2, root.getElementsByAttributeValueNot("href", "other").size());
    }

    @Test
    public void testIndexLookupsIncludeSelfAndChildren() throws Exception {
        Element root = new Element("main");
        Element a = root.appendElement("i");
        Element b = root.appendElement("b");
        Element c = root.appendElement("u");
        assertEquals(2, root.getElementsByIndexLessThan(1).size());
        assertEquals(1, root.getElementsByIndexEquals(1).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertSame(b, root.getElementsByIndexEquals(1).get(0));
        assertSame(a, root.child(0));
        assertSame(c, root.child(2));
    }

    @Test
    public void testTextQueriesAndRegex() throws Exception {
        Element root = new Element("main");
        Element target = root.appendElement("p").text("hello world");
        assertSame(root, root.getElementsContainingText("WORLD").get(0));
        assertSame(target, root.getElementsContainingOwnText("hello").get(0));
        assertEquals(2, root.getElementsMatchingText(".*world").size());
        assertSame(target, root.getElementsMatchingOwnText(Pattern.compile("hello.*")).get(0));
    }

    @Test
    public void testSelectorsAndAllElements() throws Exception {
        Element root = new Element("main");
        Element target = root.appendElement("p").attr("class", "picked");
        assertSame(target, root.select(".picked").get(0));
        assertTrue(target.is("p.picked"));
        assertEquals(2, root.getAllElements().size());
    }

    @Test
    public void testCssSelectorUsesIdAndClasses() throws Exception {
        Element identified = new Element("div").attr("id", "unique");
        assertEquals("#unique", identified.cssSelector());
        Element classed = new Element("p").attr("class", "one two");
        assertEquals("p.one.two", classed.cssSelector());
    }

    @Test
    public void testAttributeAndValueMutations() throws Exception {
        Element input = new Element("input").attr("value", "old");
        input.val("new");
        assertEquals("new", input.val());
        Element area = new Element("textarea");
        area.val("text");
        assertEquals("text", area.val());
        assertEquals("text", area.text());
    }

    @Test
    public void testDataAndHtmlAppending() throws Exception {
        Element el = new Element("div");
        el.append("<b>one</b>");
        assertEquals(1, el.children().size());
        assertEquals("one", el.text());
        assertEquals("<b>one</b>", el.html());
    }

    @Test
    public void testTagAccessorAndNames() throws Exception {
        Element el = new Element("span");
        assertEquals("span", el.tag().getName());
        el.tagName("DIV");
        assertEquals("DIV", el.tag().getName());
    }

    @Test
    public void testDataNodesAndCombinedData() throws Exception {
        Element el = new Element("script");
        DataNode first = new DataNode("a", "");
        DataNode second = new DataNode("b", "");
        el.appendChild(first);
        el.appendChild(new Comment("ignored", ""));
        el.appendChild(second);
        assertEquals(2, el.dataNodes().size());
        assertSame(first, el.dataNodes().get(0));
        assertSame(second, el.dataNodes().get(1));
        assertEquals("aignoredb", el.data());
    }

    @Test
    public void testAppendChildReparentsExistingNode() throws Exception {
        Element source = new Element("div");
        Element destination = new Element("section");
        Element child = source.appendElement("p");
        destination.appendChild(child);
        assertEquals(0, source.children().size());
        assertSame(destination, child.parent());
        assertSame(child, destination.child(0));
    }

    @Test
    public void testPrependChildMovesToFront() throws Exception {
        Element parent = new Element("div");
        Element existing = parent.appendElement("p");
        Element added = new Element("span");
        parent.prependChild(added);
        assertSame(added, parent.child(0));
        assertSame(existing, parent.child(1));
        assertEquals(2, parent.children().size());
    }

    @Test
    public void testPrependHtmlBeforeExistingChildren() throws Exception {
        Element parent = new Element("div");
        Element existing = parent.appendElement("p").text("old");
        parent.prepend("<b>new</b>");
        assertEquals(2, parent.children().size());
        assertEquals("b", parent.child(0).tagName());
        assertEquals("p", parent.child(1).tagName());
        assertEquals("new old", parent.text());
        assertSame(existing, parent.child(1));
    }

    @Test
    public void testBeforeAndAfterHtmlSiblings() throws Exception {
        Element parent = new Element("div");
        Element target = parent.appendElement("p");
        target.before("<i>before</i>");
        target.after("<b>after</b>");
        assertEquals(3, parent.children().size());
        assertEquals("i", parent.child(0).tagName());
        assertSame(target, parent.child(1));
        assertEquals("b", parent.child(2).tagName());
    }

    @Test
    public void testWrapElementAndPreserveIdentity() throws Exception {
        Element parent = new Element("div");
        Element target = parent.appendElement("p").text("inside");
        target.wrap("<section><b></b></section>");
        assertEquals(1, parent.children().size());
        Element wrapper = parent.child(0);
        assertEquals("section", wrapper.tagName());
        assertSame(target, wrapper.getElementsByTag("p").get(0));
        assertEquals("inside", wrapper.text());
    }
}
