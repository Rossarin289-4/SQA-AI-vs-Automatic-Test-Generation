package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Tag;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
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
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import java.io.Reader;
import java.io.StringReader;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DocumentType;
import org.jsoup.internal.Normalizer;
import java.util.HashMap;

public class ElementTest {
    @Test
    public void testTagNameChangeAndNormalization() throws Exception {
        Element el = new Element("div");
        assertEquals("div", el.tagName());
        assertEquals("div", el.normalName());
        assertSame(el, el.tagName("span"));
        assertEquals("span", el.normalName());
    }

    @Test
    public void testBaseUriAndAttributes() throws Exception {
        Element el = new Element("div");
        el.attr("id", "node");
        assertEquals("", el.baseUri());
        assertEquals("node", el.id());
        assertEquals("div", el.nodeName());
        assertEquals(0, el.childNodeSize());
    }

    @Test
    public void testDatasetViewReflectsAttributes() throws Exception {
        Element el = new Element("div");
        Map<String, String> dataset = el.dataset();
        el.attr("data-key", "value");
        assertEquals("value", dataset.get("key"));
        dataset.put("other", "entry");
        assertEquals("entry", el.attr("data-other"));
    }

    @Test
    public void testChildrenFilterTextAndElements() throws Exception {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendText("before").appendChild(child).appendText("after");
        assertEquals(3, parent.childNodeSize());
        assertSame(child, parent.child(0));
        assertEquals(1, parent.children().size());
        assertEquals(2, parent.textNodes().size());
        assertEquals("beforeafter", parent.wholeText());
    }

    @Test
    public void testDataNodesAreFilteredFromChildren() throws Exception {
        Element parent = new Element("script");
        parent.appendChild(new DataNode("var x;"));
        parent.appendText("tail");
        assertEquals(1, parent.dataNodes().size());
        assertEquals("var x;", parent.data());
    }

    @Test
    public void testAppendAndPrependElementOrdering() throws Exception {
        Element parent = new Element("div");
        Element last = parent.appendElement("p");
        Element first = parent.prependElement("b");
        assertSame(first, parent.child(0));
        assertSame(last, parent.child(1));
        assertEquals(2, parent.children().size());
    }

    @Test
    public void testInsertChildrenAtStartAndEndBoundaries() throws Exception {
        Element parent = new Element("div");
        Element a = new Element("a");
        Element b = new Element("b");
        parent.insertChildren(0, a);
        parent.insertChildren(-1, b);
        assertSame(a, parent.child(0));
        assertSame(b, parent.child(1));
        assertEquals(2, parent.childNodeSize());
    }

    @Test
    public void testHtmlSetAppendAndPrepend() throws Exception {
        Element el = new Element("div");
        el.html("<p>one</p>");
        el.append("<b>two</b>");
        el.prepend("<i>zero</i>");
        assertEquals(3, el.children().size());
        assertEquals("zero onetwo", el.text());
    }

    @Test
    public void testEmptyKeepsAttributesAndRemovesChildren() throws Exception {
        Element el = new Element("div");
        el.attr("id", "keep").appendText("text");
        assertSame(el, el.empty());
        assertEquals(0, el.childNodeSize());
        assertEquals("keep", el.id());
    }

    @Test
    public void testSiblingMethodsAtFirstMiddleAndLast() throws Exception {
        Element parent = new Element("div");
        Element first = parent.appendElement("a");
        Element middle = parent.appendElement("b");
        Element last = parent.appendElement("c");
        assertNull(first.previousElementSibling());
        assertSame(middle, first.nextElementSibling());
        assertSame(first, middle.previousElementSibling());
        assertSame(last, middle.nextElementSibling());
        assertNull(last.nextElementSibling());
        assertEquals(1, middle.elementSiblingIndex());
        assertEquals(2, middle.siblingElements().size());
    }

    @Test
    public void testParentsAreNearestFirst() throws Exception {
        Element ancestor = new Element("main");
        Element parent = ancestor.appendElement("section");
        Element child = parent.appendElement("p");
        Elements parents = child.parents();
        assertEquals(2, parents.size());
        assertSame(parent, parents.get(0));
        assertSame(ancestor, parents.get(1));
    }

    @Test
    public void testCssSelectorUsesIdOrTagAndClass() throws Exception {
        Element byId = new Element("div").attr("id", "item");
        assertEquals("#item", byId.cssSelector());
        Element el = new Element("span").attr("class", "hot selected");
        assertEquals("span.hot.selected", el.cssSelector());
    }

    @Test
    public void testClassOperationsAndWhitespaceBoundaries() throws Exception {
        Element el = new Element("div").attr("class", "a\tb");
        assertTrue(el.hasClass("a"));
        assertTrue(el.hasClass("b"));
        assertFalse(el.hasClass("a\tb"));
        el.addClass("c");
        assertTrue(el.hasClass("c"));
        el.removeClass("a");
        assertTrue(el.hasClass("a"));
        el.toggleClass("b");
        assertTrue(el.hasClass("b"));
    }

    @Test
    public void testClassNamesSetterAndClassName() throws Exception {
        Element el = new Element("div");
        Set<String> names = new LinkedHashSet<>(Arrays.asList("one", "two"));
        el.classNames(names);
        assertEquals("one two", el.className());
        assertEquals(2, el.classNames().size());
        el.classNames(Collections.<String>emptySet());
        assertEquals("", el.className());
    }

    @Test
    public void testValUsesAttributeOrTextareaText() throws Exception {
        Element input = new Element("input");
        input.val("abc");
        assertEquals("abc", input.val());
        Element area = new Element("textarea");
        area.val("line");
        assertEquals("line", area.val());
        assertEquals("", area.attr("value"));
    }

    @Test
    public void testTagAndClassSearchIncludeMatchingRootAndDescendant() throws Exception {
        Element root = new Element("div").attr("class", "group");
        Element child = root.appendElement("p").attr("class", "group");
        assertEquals(1, root.getElementsByTag("DIV").size());
        assertSame(root, root.getElementsByClass("group").get(0));
        assertSame(child, root.getElementsByClass("group").get(1));
    }

    @Test
    public void testAttributeSearchVariants() throws Exception {
        Element root = new Element("div").attr("data-key", "prefix-middle-suffix");
        root.appendElement("p").attr("title", "different");
        assertEquals(1, root.getElementsByAttribute("data-key").size());
        assertEquals(1, root.getElementsByAttributeStarting("data-").size());
        assertEquals(1, root.getElementsByAttributeValue("data-key", "PREFIX-MIDDLE-SUFFIX").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("data-key", "prefix").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("data-key", "suffix").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("data-key", "middle").size());
        assertEquals(1, root.getElementsByAttributeValueMatching("data-key", "prefix.*suffix").size());
        assertEquals(2, root.getElementsByAttributeValueNot("data-key", "other").size());
    }

    @Test
    public void testIndexSearchZeroAndLastElement() throws Exception {
        Element root = new Element("div");
        root.appendElement("a");
        root.appendElement("b");
        root.appendElement("c");
        assertEquals(2, root.getElementsByIndexEquals(0).size());
        assertEquals(2, root.getElementsByIndexLessThan(1).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
    }

    @Test
    public void testTextSearchesDistinguishOwnAndDescendantText() throws Exception {
        Element root = new Element("div").appendText("alpha");
        Element child = root.appendElement("p").appendText("beta");
        assertEquals(2, root.getElementsContainingText("beta").size());
        assertEquals(1, root.getElementsContainingOwnText("alpha").size());
        assertEquals(2, root.getElementsMatchingText(Pattern.compile(".*beta.*")).size());
    }

    @Test
    public void testSelectAndSelectFirstAndIs() throws Exception {
        Element root = new Element("div");
        Element child = root.appendElement("p").attr("id", "chosen").appendText("text");
        assertEquals(1, root.select("p#chosen").size());
        assertSame(child, root.selectFirst("#chosen"));
        assertTrue(child.is("p"));
        assertFalse(root.is("p"));
    }

    @Test
    public void testTextNormalizationAndOwnText() throws Exception {
        Element el = new Element("div");
        el.appendText(" one   ").appendElement("b").appendText("two").parent().appendText(" three");
        assertEquals("one two three", el.text());
        assertEquals("one three", el.ownText());
        assertEquals(" one   two three", el.wholeText());
        assertTrue(el.hasText());
    }

    @Test
    public void testTextSetterClearsChildrenAndValuedContent() throws Exception {
        Element el = new Element("div");
        el.appendElement("b").appendText("old");
        el.text("new");
        assertEquals("new", el.text());
        assertEquals(1, el.childNodeSize());
        assertEquals(0, el.children().size());
    }

    @Test
    public void testAppendToAndSiblingMutationPreserveParentReferences() throws Exception {
        Element parent = new Element("div");
        Element child = new Element("p");
        assertSame(child, child.appendTo(parent));
        assertSame(parent, child.parent());
        assertEquals(1, parent.children().size());
    }

    @Test
    public void testAttributesGetterReturnsWritableAttributes() throws Exception {
        Element el = new Element("div");
        el.attributes().put("title", "value");
        assertEquals("value", el.attr("title"));
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
    public void testPrependChildAndTextAtFirstPosition() throws Exception {
        Element el = new Element("div");
        Element child = new Element("span");
        el.appendText("end");
        el.prependChild(child);
        el.prependText("start");
        assertSame(child, el.child(0));
        assertEquals("startend", el.text());
        assertEquals(3, el.childNodeSize());
    }

    @Test
    public void testBeforeAndAfterHtmlInsertion() throws Exception {
        Element parent = new Element("div");
        Element middle = parent.appendElement("b").attr("id", "middle");
        middle.before("<i>left</i>");
        middle.after("<u>right</u>");
        assertEquals(3, parent.children().size());
        assertEquals("i", parent.child(0).tagName());
        assertSame(middle, parent.child(1));
        assertEquals("u", parent.child(2).tagName());
    }

    @Test
    public void testWrapMovesElementUnderNewWrapper() throws Exception {
        Element parent = new Element("div");
        Element child = parent.appendElement("p").attr("id", "inside");
        child.wrap("<section class='wrap'><b></b></section>");
        Element wrapper = parent.child(0);
        Element nested = wrapper.child(0).child(0);
        assertEquals("section", wrapper.tagName());
        assertEquals("b", wrapper.child(0).tagName());
        assertSame(child, nested);
        assertEquals("inside", nested.id());
        assertEquals(1, parent.children().size());
    }

    @Test
    public void testElementSiblingCollectionsAndEndPoints() throws Exception {
        Element parent = new Element("div");
        Element first = parent.appendElement("a");
        Element middle = parent.appendElement("b");
        Element last = parent.appendElement("c");
        assertEquals(2, first.nextElementSiblings().size());
        assertSame(middle, first.nextElementSiblings().get(0));
        assertEquals(1, middle.previousElementSiblings().size());
        assertSame(first, middle.previousElementSiblings().get(0));
        assertSame(first, middle.firstElementSibling());
        assertSame(last, middle.lastElementSibling());
        assertNull(first.previousElementSibling());
    }

    @Test
    public void testFirstAndLastSiblingReturnNullForSingleElement() throws Exception {
        Element parent = new Element("div");
        Element only = parent.appendElement("p");
        assertNull(only.firstElementSibling());
        assertNull(only.lastElementSibling());
    }

    @Test
    public void testGetElementByIdFindsFirstMatchFromSubtree() throws Exception {
        Element root = new Element("div");
        Element first = root.appendElement("p").attr("id", "pick");
        root.appendElement("span").attr("id", "pick");
        assertSame(first, root.getElementById("pick"));
        assertNull(root.getElementById("missing"));
    }
}
