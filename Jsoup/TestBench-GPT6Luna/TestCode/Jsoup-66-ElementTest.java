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
    public void testTagAndBlockSemantics() throws Exception {
        Element e = new Element("div");
        assertEquals("div", e.tagName());
        assertEquals("div", e.nodeName());
        assertTrue(e.isBlock());
        assertEquals("p", new Element("p").tagName());
    }

    @Test
    public void testTagNameChangePreservesRequestedCase() throws Exception {
        Element e = new Element("div").tagName("MiXeD");
        assertSame(e, e.tagName("MiXeD"));
        assertEquals("MiXeD", e.tagName());
        assertEquals("MiXeD", e.nodeName());
    }

    @Test
    public void testAttributesIdBooleanAndDataset() throws Exception {
        Element e = new Element("div");
        assertSame(e, e.attr("ID", "x"));
        e.attr("data-key", "one");
        e.attr("hidden", true);
        assertEquals("x", e.id());
        assertEquals("", e.attr("hidden"));
        assertEquals("one", e.dataset().get("key"));
        e.dataset().put("other", "two");
        assertEquals("two", e.attr("data-other"));
    }

    @Test
    public void testChildAndTextNodeFiltering() throws Exception {
        Element e = new Element("div");
        Element child = new Element("span");
        e.appendText("a").appendChild(child).appendText("b");
        assertEquals(3, e.childNodeSize());
        assertSame(child, e.child(0));
        assertEquals(1, e.children().size());
        assertEquals(2, e.textNodes().size());
        assertEquals("a", e.textNodes().get(0).text());
    }

    @Test
    public void testAppendAndPrependOrderingAndCacheInvalidation() throws Exception {
        Element e = new Element("div");
        Element first = new Element("i");
        Element last = new Element("b");
        assertEquals(0, e.children().size());
        e.appendChild(last);
        e.prependChild(first);
        assertEquals(2, e.children().size());
        assertSame(first, e.child(0));
        assertSame(last, e.child(1));
        assertEquals(2, e.childNodeSize());
    }

    @Test
    public void testInsertChildrenAtBeginningMiddleAndEnd() throws Exception {
        Element e = new Element("div");
        Element a = new Element("a");
        Element c = new Element("c");
        e.appendChild(a).appendChild(c);
        Element b = new Element("b");
        e.insertChildren(1, b);
        Element d = new Element("d");
        e.insertChildren(-1, d);
        assertEquals(4, e.children().size());
        assertSame(a, e.child(0));
        assertSame(b, e.child(1));
        assertSame(c, e.child(2));
        assertSame(d, e.child(3));
    }

    @Test
    public void testAppendAndPrependElementTextAndHtml() throws Exception {
        Element e = new Element("div");
        Element appended = e.appendElement("p");
        appended.text("middle");
        e.prependElement("b").text("first");
        e.appendText("last");
        assertEquals("first middle last", e.text());
        assertEquals("b", e.child(0).tagName());
        assertEquals("p", e.child(1).tagName());

        Element parsed = new Element("div");
        parsed.append("<i>one</i>");
        parsed.prepend("<b>zero</b>");
        assertEquals("zero one", parsed.text());
        assertEquals("b", parsed.child(0).tagName());
    }

    @Test
    public void testParentAndAncestors() throws Exception {
        Element root = new Element("div");
        Element mid = root.appendElement("section");
        Element leaf = mid.appendElement("p");
        assertSame(mid, leaf.parent());
        assertEquals(2, leaf.parents().size());
        assertSame(mid, leaf.parents().get(0));
        assertSame(root, leaf.parents().get(1));
    }

    @Test
    public void testSiblingQueriesAcrossTextNodes() throws Exception {
        Element parent = new Element("div");
        Element a = parent.appendElement("i");
        parent.appendText("x");
        Element b = parent.appendElement("b");
        Element c = parent.appendElement("em");
        assertSame(b, a.nextElementSibling());
        assertNull(a.previousElementSibling());
        assertSame(a, b.previousElementSibling());
        assertSame(c, b.nextElementSibling());
        assertEquals(1, b.elementSiblingIndex());
        assertEquals(2, b.siblingElements().size());
        assertSame(a, b.firstElementSibling());
        assertSame(c, b.lastElementSibling());
    }

    @Test
    public void testSearchByTagIdAndClass() throws Exception {
        Element root = new Element("div");
        root.attr("id", "root");
        Element one = root.appendElement("p").attr("class", "blue");
        Element two = root.appendElement("p").attr("id", "target").attr("class", "blue hot");
        assertEquals(2, root.getElementsByTag("P").size());
        assertSame(two, root.getElementById("target"));
        assertEquals(2, root.getElementsByClass("blue").size());
        assertSame(root, root.getElementById("root"));
        assertSame(one, root.getElementsByClass("blue").get(0));
    }

    @Test
    public void testSearchByAttributeNamePrefixAndValues() throws Exception {
        Element root = new Element("div");
        Element one = root.appendElement("a").attr("href", "https://abc.test/path").attr("data-x", "v");
        root.appendElement("a").attr("href", "other").attr("title", "plain");
        assertEquals(3, root.getElementsByAttribute(" HREF ").size());
        assertEquals(1, root.getElementsByAttributeStarting(" data-").size());
        assertEquals(1, root.getElementsByAttributeValue("href", "HTTPS://ABC.TEST/PATH").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("href", "https://").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("href", "/path").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("href", "abc.test").size());
        assertSame(one, root.getElementsByAttributeValueMatching("href", Pattern.compile(".*path")).get(0));
        assertEquals(2, root.getElementsByAttributeValueNot("href", "missing").size());
    }

    @Test
    public void testSiblingIndexSearchBoundaries() throws Exception {
        Element root = new Element("div");
        Element a = root.appendElement("i");
        Element b = root.appendElement("b");
        Element c = root.appendElement("em");
        assertEquals(1, root.getElementsByIndexLessThan(1).size());
        assertSame(a, root.getElementsByIndexLessThan(1).get(0));
        assertEquals(1, root.getElementsByIndexEquals(1).size());
        assertSame(b, root.getElementsByIndexEquals(1).get(0));
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertSame(c, root.getElementsByIndexGreaterThan(1).get(0));
    }

    @Test
    public void testTextAndOwnTextSearches() throws Exception {
        Element root = new Element("div");
        Element p = root.appendElement("p");
        p.appendText("Alpha ");
        p.appendElement("b").text("Beta");
        assertEquals("Alpha Beta", p.text());
        assertEquals("Alpha", p.ownText());
        assertEquals(3, root.getElementsContainingText("beta").size());
        assertEquals(1, root.getElementsContainingOwnText("alpha").size());
        assertEquals(3, root.getElementsMatchingText(Pattern.compile(".*Beta")).size());
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("Alpha")).size());
        assertEquals(3, root.getAllElements().size());
    }

    @Test
    public void testSelectSelectFirstAndIs() throws Exception {
        Element root = new Element("div");
        Element target = root.appendElement("p").attr("class", "pick");
        root.appendElement("p");
        assertEquals(1, root.select("p.pick").size());
        assertSame(target, root.selectFirst("p.pick"));
        assertTrue(target.is("p.pick"));
        assertFalse(root.is("p.pick"));
        assertNull(root.selectFirst("missing"));
    }

    @Test
    public void testClassMutationAndExactTokens() throws Exception {
        Element e = new Element("div").attr("class", "one  two");
        assertTrue(e.hasClass("ONE"));
        assertFalse(e.hasClass("on"));
        assertEquals(2, e.classNames().size());
        e.addClass("three");
        assertTrue(e.hasClass("three"));
        e.removeClass("one");
        assertFalse(e.hasClass("one"));
        e.toggleClass("two");
        assertFalse(e.hasClass("two"));
        e.toggleClass("four");
        assertTrue(e.hasClass("four"));
    }

    @Test
    public void testTextReplacementAndHasText() throws Exception {
        Element e = new Element("div");
        e.appendElement("span").text("old");
        assertTrue(e.hasText());
        e.text("  new  text ");
        assertEquals("new text", e.text());
        assertEquals(1, e.childNodeSize());
        Element blank = new Element("p").appendText(" \n ");
        assertFalse(blank.hasText());
    }

    @Test
    public void testClearAndSetInnerHtml() throws Exception {
        Element e = new Element("div");
        e.attr("id", "keep").appendElement("i").text("old");
        e.empty();
        assertEquals(0, e.childNodeSize());
        assertEquals("keep", e.id());
        e.html("<b>new</b>");
        assertEquals("new", e.text());
        assertEquals("b", e.child(0).tagName());
    }

    @Test
    public void testCssSelectorForIdClassesAndDuplicateSiblings() throws Exception {
        Element id = new Element("div").attr("id", "chosen");
        assertEquals("#chosen", id.cssSelector());

        Element parent = new Element("main");
        Element a = parent.appendElement("p").attr("class", "item");
        Element b = parent.appendElement("p").attr("class", "item");
        assertEquals("main > p.item:nth-child(2)", b.cssSelector());
        assertEquals("main > p.item:nth-child(1)", a.cssSelector());
    }

    @Test
    public void testDataNodesAndNestedData() throws Exception {
        Element e = new Element("script");
        e.appendChild(new DataNode("x"));
        e.appendChild(new Comment("y"));
        Element nested = e.appendElement("style");
        nested.appendChild(new DataNode("z"));
        assertEquals("xyz", e.data());
        assertEquals(1, e.dataNodes().size());
    }

    @Test
    public void testValueUsesTextareaTextAndOtherValueAttribute() throws Exception {
        Element input = new Element("input").val("abc");
        Element area = new Element("textarea").val("line");
        assertEquals("abc", input.val());
        assertEquals("line", area.val());
        assertEquals("line", area.text());
    }

    @Test
    public void testAttributesLazyInitializationAndMutation() throws Exception {
        Element e = new Element(Tag.valueOf("div"), "");
        assertEquals("", e.attr("id"));
        Attributes attrs = e.attributes();
        attrs.put("id", "first");
        assertEquals("first", e.id());
        e.attr("id", "second");
        assertEquals("second", attrs.get("id"));
        assertSame(attrs, e.attributes());
    }

    @Test
    public void testBaseUriPreservedAndUpdatedForAppendedChild() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "base");
        assertEquals("base", parent.baseUri());
        Element child = parent.appendElement("p");
        assertEquals("base", child.baseUri());
        assertEquals("base", parent.baseUri());
    }

    @Test
    public void testTagAccessorTracksTagNameChange() throws Exception {
        Element e = new Element("div");
        Tag original = e.tag();
        assertEquals("div", original.getName());
        e.tagName("section");
        assertEquals("section", e.tag().getName());
    }

    @Test
    public void testAppendToSetsExactParentAndReturnsChild() throws Exception {
        Element parent = new Element("div");
        Element child = new Element("p");
        assertSame(child, child.appendTo(parent));
        assertSame(parent, child.parent());
        assertSame(child, parent.child(0));
        assertEquals(1, parent.childNodeSize());
    }

    @Test
    public void testPrependTextBeforeExistingTextAndElement() throws Exception {
        Element parent = new Element("div");
        parent.appendText("end");
        parent.appendElement("b").text("bold");
        assertSame(parent, parent.prependText("start"));
        assertEquals(3, parent.childNodeSize());
        assertEquals("start", parent.textNodes().get(0).text());
        assertEquals("start end bold", parent.text());
    }

    @Test
    public void testBeforeHtmlInsertsSiblingAtBeginning() throws Exception {
        Element parent = new Element("div");
        Element target = parent.appendElement("p");
        assertSame(target, target.before("<b>before</b>"));
        assertEquals(2, parent.childNodeSize());
        assertEquals("b", parent.child(0).tagName());
        assertSame(target, parent.child(1));
        assertEquals("before", parent.child(0).text());
    }

    @Test
    public void testAfterHtmlInsertsSiblingAtEnd() throws Exception {
        Element parent = new Element("div");
        Element target = parent.appendElement("p");
        assertSame(target, target.after("<b>after</b>"));
        assertEquals(2, parent.childNodeSize());
        assertSame(target, parent.child(0));
        assertEquals("b", parent.child(1).tagName());
        assertEquals("after", parent.child(1).text());
    }

    @Test
    public void testWrapElementAndPreserveParentage() throws Exception {
        Element parent = new Element("div");
        Element target = parent.appendElement("p").text("inside");
        assertSame(target, target.wrap("<section><b></b></section>"));
        assertEquals(1, parent.childNodeSize());
        Element wrapper = parent.child(0);
        assertEquals("section", wrapper.tagName());
        Element bold = wrapper.child(0);
        assertSame(bold.child(0), target);
        assertEquals("inside", wrapper.text());
        assertSame(bold, target.parent());
    }
}
