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
    public void testTagNameAndBaseUri() throws Exception {
        Element el = new Element("div");
        assertEquals("div", el.nodeName());
        assertEquals("div", el.tagName());
        assertEquals("", el.baseUri());
        assertSame(el, el.tagName("section"));
        assertEquals("section", el.nodeName());
    }

    @Test
    public void testTagNameRejectsEmpty() throws Exception {
        try { new Element("p").tagName(""); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testIdAndAttributeUpdate() throws Exception {
        Element el = new Element("div").attr("id", "first");
        assertEquals("first", el.id());
        el.attr("id", "second");
        assertEquals("second", el.id());
    }

    @Test
    public void testDatasetViewReflectsAttributeChanges() throws Exception {
        Element el = new Element("div").attr("data-key", "one");
        Map<String, String> data = el.dataset();
        assertEquals("one", data.get("key"));
        data.put("other", "two");
        assertEquals("two", el.attr("data-other"));
    }

    @Test
    public void testAppendAndPrependChildren() throws Exception {
        Element parent = new Element("div");
        Element appended = parent.appendElement("p");
        parent.prependElement("b");
        assertEquals(2, parent.childNodeSize());
        assertSame(appended, parent.child(1));
        assertEquals("b", parent.child(0).tagName());
    }

    @Test
    public void testElementChildrenFilterTextNodes() throws Exception {
        Element parent = new Element("div");
        parent.appendText("before");
        Element child = parent.appendElement("span");
        parent.appendText("after");
        assertEquals(3, parent.childNodeSize());
        assertEquals(1, parent.children().size());
        assertSame(child, parent.child(0));
        assertEquals(2, parent.textNodes().size());
        assertEquals("before", parent.textNodes().get(0).text());
    }

    @Test
    public void testInsertChildrenAtStartAndEnd() throws Exception {
        Element parent = new Element("div");
        Element middle = parent.appendElement("i");
        Element end = new Element("b");
        parent.insertChildren(-1, end);
        Element start = new Element("a");
        parent.insertChildren(0, start);
        assertEquals(3, parent.childNodeSize());
        assertSame(start, parent.child(0));
        assertSame(middle, parent.child(1));
        assertSame(end, parent.child(2));
    }

    @Test
    public void testInsertChildrenRejectsIndexPastEnd() throws Exception {
        Element parent = new Element("div");
        try { parent.insertChildren(1, new Element("p")); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAppendAndPrependText() throws Exception {
        Element el = new Element("div");
        el.appendText("last");
        el.prependText("first");
        assertEquals(2, el.textNodes().size());
        assertEquals("firstlast", el.text());
    }

    @Test
    public void testAppendAndPrependHtml() throws Exception {
        Element el = new Element("div");
        el.append("<p>two</p>");
        el.prepend("<b>one</b>");
        assertEquals(2, el.children().size());
        assertEquals("b", el.child(0).tagName());
        assertEquals("one two", el.text());
    }

    @Test
    public void testEmptyRetainsAttributes() throws Exception {
        Element el = new Element("div").attr("id", "kept");
        el.appendElement("p");
        el.empty();
        assertEquals(0, el.childNodeSize());
        assertEquals("kept", el.id());
    }

    @Test
    public void testSiblingIndicesAndNavigation() throws Exception {
        Element parent = new Element("div");
        Element first = parent.appendElement("p");
        parent.appendText("gap");
        Element last = parent.appendElement("b");
        assertSame(last, first.nextElementSibling());
        assertSame(first, last.previousElementSibling());
        assertEquals(1, last.elementSiblingIndex());
        assertSame(last, first.lastElementSibling());
        assertSame(first, last.firstElementSibling());
        assertEquals(1, first.siblingElements().size());
    }

    @Test
    public void testCssSelectorUsesIdAndClass() throws Exception {
        Element byId = new Element("div").attr("id", "unique");
        assertEquals("#unique", byId.cssSelector());
        Element withClass = new Element("article").attr("class", "wide");
        assertEquals("article.wide", withClass.cssSelector());
    }

    @Test
    public void testTagIdAndClassSearches() throws Exception {
        Element root = new Element("div");
        Element match = root.appendElement("p").attr("id", "target").attr("class", "hot");
        root.appendElement("span");
        assertEquals(1, root.getElementsByTag("p").size());
        assertSame(match, root.getElementById("target"));
        assertEquals(1, root.getElementsByClass("hot").size());
    }

    @Test
    public void testAttributeLookups() throws Exception {
        Element root = new Element("div");
        Element match = root.appendElement("a").attr("data-key", "prefix-mid-suffix");
        root.appendElement("a").attr("title", "other");
        assertEquals(2, root.getElementsByAttribute(" data-key ").size());
        assertEquals(2, root.getElementsByAttributeStarting(" data- ").size());
        assertEquals(1, root.getElementsByAttributeValue("data-key", "prefix-mid-suffix").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("data-key", "prefix").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("data-key", "suffix").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("data-key", "mid").size());
        assertSame(match, root.getElementsByAttributeValueMatching("data-key", Pattern.compile("prefix.*")).get(0));
        assertEquals(3, root.getElementsByAttributeValueNot("data-key", "other").size());
    }

    @Test
    public void testSiblingIndexQueriesAtBoundaries() throws Exception {
        Element root = new Element("div");
        Element first = root.appendElement("p");
        root.appendElement("p");
        Element last = root.appendElement("p");
        assertEquals(1, root.getElementsByIndexLessThan(1).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertSame(first, root.getElementsByIndexEquals(0).get(0));
        assertSame(last, root.getElementsByIndexEquals(2).get(0));
    }

    @Test
    public void testTextQueriesAndAllElements() throws Exception {
        Element root = new Element("div");
        Element child = root.appendElement("p").appendText("Needle");
        assertEquals(2, root.getElementsContainingText("needle").size());
        assertEquals(1, root.getElementsContainingOwnText("needle").size());
        assertEquals(2, root.getElementsMatchingText(Pattern.compile(".*Needle.*")).size());
        assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("Needle")).size());
        assertEquals(2, root.getAllElements().size());
        assertSame(child, root.selectFirst("p"));
        assertEquals(1, root.select("p").size());
        assertTrue(child.is("p"));
    }

    @Test
    public void testTextNormalizationAndOwnText() throws Exception {
        Element root = new Element("div");
        root.appendText("one   ");
        root.appendElement("b").appendText("two");
        root.appendText("  three");
        assertEquals("one two three", root.text());
        assertEquals("one three", root.ownText());
        assertTrue(root.hasText());
    }

    @Test
    public void testDataNodesAndDataAggregation() throws Exception {
        Element el = new Element("script");
        el.append("<script>x</script>");
        assertEquals(0, el.dataNodes().size());
        assertEquals("", el.data());
    }

    @Test
    public void testParentsAndAppendTo() throws Exception {
        Element parent = new Element("div");
        Element child = new Element("p");
        assertSame(child, child.appendTo(parent));
        assertSame(parent, child.parent());
        assertEquals(1, child.parents().size());
        assertSame(parent, child.parents().get(0));
    }

    @Test
    public void testClassMutationAndMatching() throws Exception {
        Element el = new Element("div").attr("class", "one two");
        assertTrue(el.hasClass("ONE"));
        el.removeClass("one");
        el.addClass("three");
        assertEquals("two three", el.className());
        el.toggleClass("two");
        assertFalse(el.hasClass("two"));
        assertTrue(el.hasClass("three"));
    }

    @Test
    public void testValForInputAndTextarea() throws Exception {
        Element input = new Element("input").val("value");
        Element textarea = new Element("textarea").val("body");
        assertEquals("value", input.val());
        assertEquals("body", textarea.val());
    }

    @Test
    public void testAttributesLazyInitializationAndAttributeStorage() throws Exception {
        Element el = new Element("div");
        assertEquals("", el.id());
        el.attributes().put("title", "heading");
        assertEquals("heading", el.attr("title"));
        assertEquals(1, el.attributes().size());
    }

    @Test
    public void testTagAndBlockClassification() throws Exception {
        Element block = new Element("div");
        Element inline = new Element("span");
        assertEquals("div", block.tag().getName());
        assertTrue(block.isBlock());
        assertFalse(inline.isBlock());
    }

    @Test
    public void testAppendChildAndPrependChild() throws Exception {
        Element parent = new Element("div");
        Element second = new Element("b");
        Element first = new Element("i");
        assertSame(parent, parent.appendChild(second));
        assertSame(parent, parent.prependChild(first));
        assertEquals(2, parent.childNodeSize());
        assertSame(first, parent.child(0));
        assertSame(second, parent.child(1));
    }

    @Test
    public void testBeforeAndAfterHtmlInsertion() throws Exception {
        Element parent = new Element("div");
        Element middle = parent.appendElement("p");
        assertSame(middle, middle.before("<i>before</i>"));
        assertSame(middle, middle.after("<b>after</b>"));
        assertEquals(3, parent.children().size());
        assertEquals("i", parent.child(0).tagName());
        assertSame(middle, parent.child(1));
        assertEquals("b", parent.child(2).tagName());
        assertEquals("before after", parent.text());
    }

    @Test
    public void testWrapElementWithSingleWrapper() throws Exception {
        Element parent = new Element("div");
        Element child = parent.appendElement("p");
        child.text("inside");
        assertSame(child, child.wrap("<section></section>"));
        assertEquals("section", parent.child(0).tagName());
        assertSame(child, parent.child(0).child(0));
        assertEquals("inside", parent.text());
    }

    @Test
    public void testWrapElementWithNestedWrapper() throws Exception {
        Element parent = new Element("div");
        Element child = parent.appendElement("p");
        child.wrap("<section><article></article></section>");
        assertEquals("section", parent.child(0).tagName());
        assertEquals("article", parent.child(0).child(0).tagName());
        assertSame(child, parent.child(0).child(0).child(0));
        assertEquals(parent.child(0), child.parent().parent());
    }
}
