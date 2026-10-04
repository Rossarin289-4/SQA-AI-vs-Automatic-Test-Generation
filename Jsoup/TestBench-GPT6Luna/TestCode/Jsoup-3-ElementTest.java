package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.StringUtils;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import java.util.*;
import org.jsoup.nodes.*;

public class ElementTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }
    @Test
    public void testTagIdentityAndBlockType() throws Exception {
        Element div = new Element(Tag.valueOf("DIV"), "");
        assertEquals("div", div.nodeName());
        assertEquals("div", div.tagName());
        assertEquals(Tag.valueOf("div"), div.tag());
        assertTrue(div.isBlock());

        Element span = new Element(Tag.valueOf("span"), "");
        assertFalse(span.isBlock());
    }

    @Test
    public void testIdAttributeAndFluentSetter() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        assertEquals("", el.id());
        assertSame(el, el.attr("id", "x"));
        assertEquals("x", el.id());
        el.attr("id", "y");
        assertEquals("y", el.id());
    }

    @Test
    public void testChildrenFilterMixedNodesAndIndices() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = parent.appendElement("span");
        parent.appendText("text");
        Element last = parent.appendElement("b");
        assertEquals(2, parent.children().size());
        assertSame(first, parent.child(0));
        assertSame(last, parent.child(1));
        assertEquals(3, parent.childNodes().size());
    }

    @Test
    public void testAppendAndPrependElementOrdering() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element appended = parent.appendElement("p");
        Element prepended = parent.prependElement("b");
        assertSame(prepended, parent.child(0));
        assertSame(appended, parent.child(1));
        assertSame(parent, appended.parent());
    }

    @Test
    public void testTextNodeInsertionOrder() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        assertSame(el, el.appendText("end"));
        assertSame(el, el.prependText("start"));
        assertEquals(2, el.childNodes().size());
        assertEquals("startend", el.text());
    }

    @Test
    public void testAppendAndPrependHtml() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append("<b>two</b>");
        el.prepend("<i>one</i>");
        assertEquals(2, el.children().size());
        assertEquals("i", el.child(0).tagName());
        assertEquals("b", el.child(1).tagName());
        assertEquals("onetwo", el.text());
    }

    @Test
    public void testEmptyPreservesAttributes() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "kept").appendText("text");
        assertSame(el, el.empty());
        assertEquals(0, el.childNodes().size());
        assertEquals("kept", el.id());
    }

    @Test
    public void testWrapDeeplyPlacesOriginalElement() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element original = parent.appendElement("p");
        original.text("inside");
        assertSame(original, original.wrap("<section><b></b></section>"));
        assertEquals("section", parent.child(0).tagName());
        assertEquals("b", parent.child(0).child(0).tagName());
        assertSame(original, parent.child(0).child(0).child(0));
        assertEquals("inside", original.text());
    }

    @Test
    public void testSiblingNavigationWithTextNodeBetweenElements() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = parent.appendElement("i");
        parent.appendText("gap");
        Element second = parent.appendElement("b");
        assertSame(parent, first.parent());
        assertEquals(0, first.elementSiblingIndex().intValue());
        assertEquals(1, second.elementSiblingIndex().intValue());
        assertSame(second, first.nextElementSibling());
        assertSame(first, second.previousElementSibling());
        assertSame(first, second.firstElementSibling());
        assertSame(second, first.lastElementSibling());
        assertEquals(2, second.siblingElements().size());
    }

    @Test
    public void testParentAncestorsClosestFirst() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element middle = root.appendElement("section");
        Element leaf = middle.appendElement("p");
        Elements parents = leaf.parents();
        assertEquals(2, parents.size());
        assertSame(middle, parents.get(0));
        assertSame(root, parents.get(1));
    }

    @Test
    public void testTagAndIdSearchIncludeRootAndDescendants() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.attr("id", "root");
        Element child = root.appendElement("p").attr("id", "target");
        assertEquals(1, root.getElementsByTag(" DIV ").size());
        assertSame(root, root.getElementById("root"));
        assertSame(child, root.getElementById("target"));
        assertEquals(1, root.getElementsByTag("p").size());
    }

    @Test
    public void testClassSearchAndClassMutations() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element child = root.appendElement("p").attr("class", "one two");
        assertEquals(1, root.getElementsByClass("two").size());
        assertTrue(child.hasClass("one"));
        assertSame(child, child.addClass("three"));
        assertTrue(child.hasClass("three"));
        child.removeClass("one");
        assertFalse(child.hasClass("one"));
        child.toggleClass("two");
        assertFalse(child.hasClass("two"));
        child.toggleClass("two");
        assertTrue(child.hasClass("two"));
    }

    @Test
    public void testAttributeSearchForms() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element match = root.appendElement("a").attr("href", "AbcXYZ");
        root.appendElement("a").attr("href", "other");
        root.appendElement("a");
        assertEquals(2, root.getElementsByAttribute(" href ").size());
        assertEquals(1, root.getElementsByAttributeValue("href", "abcxyz").size());
        assertEquals(3, root.getElementsByAttributeValueNot("href", "other").size());
        assertEquals(1, root.getElementsByAttributeValueStarting("href", "ab").size());
        assertEquals(1, root.getElementsByAttributeValueEnding("href", "xyz").size());
        assertEquals(1, root.getElementsByAttributeValueContaining("href", "cxy").size());
        assertSame(match, root.getElementsByAttributeValue("href", "ABCXYZ").get(0));
    }

    @Test
    public void testIndexAndAllElementQueries() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a = root.appendElement("i");
        root.appendText("gap");
        Element b = root.appendElement("b");
        Element c = root.appendElement("p");
        assertEquals(3, root.getElementsByIndexLessThan(2).size());
        assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        assertEquals(1, root.getElementsByIndexEquals(1).size());
        assertSame(b, root.getElementsByIndexEquals(1).get(0));
        assertEquals(4, root.getAllElements().size());
        assertSame(a, root.children().get(0));
        assertSame(c, root.children().get(2));
    }

    @Test
    public void testSelectorAndTextNormalization() throws Exception {
        Element root = new Element(Tag.valueOf("div"), "");
        root.append("<p class='x'>  alpha </p><p>beta</p>");
        assertEquals(1, root.select("p.x").size());
        assertEquals("alpha beta", root.text());
        assertTrue(root.hasText());
        assertEquals("alpha beta", root.select("p").text());
    }

    @Test
    public void testTextSetterClearsOldChildren() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("b").text("old");
        assertSame(el, el.text("new"));
        assertEquals(1, el.childNodes().size());
        assertEquals("new", el.text());
        assertTrue(el.hasText());
    }

    @Test
    public void testDataNodeAggregation() throws Exception {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("a<b", ""));
        Element nested = script.appendElement("span");
        nested.appendChild(new DataNode("c", ""));
        assertEquals("a<bc", script.data());
    }

    @Test
    public void testClassNameSetAndClassNamesParsing() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "alpha beta");
        assertEquals("alpha beta", el.className());
        assertEquals(2, el.classNames().size());
        assertTrue(el.classNames().contains("alpha"));
        Set<String> classes = new LinkedHashSet<String>();
        classes.add("x");
        classes.add("y");
        el.classNames(classes);
        assertEquals("x y", el.className());
        assertEquals(2, el.classNames().size());
    }

    @Test
    public void testTextareaAndInputValues() throws Exception {
        Element input = new Element(Tag.valueOf("input"), "");
        assertEquals("", input.val());
        assertSame(input, input.val("value"));
        assertEquals("value", input.val());

        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.appendText("old");
        assertSame(textarea, textarea.val("new"));
        assertEquals("new", textarea.val());
        assertEquals("new", textarea.text());
    }

    @Test
    public void testInnerHtmlAndSerialization() throws Exception {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("p").text("old");
        assertSame(el, el.html("<b>new</b>"));
        assertEquals(1, el.children().size());
        assertEquals("new", el.text());
        assertTrue(el.html().contains("<b>"));
        assertTrue(el.toString().contains("<div>"));
    }

    @Test
    public void testAppendAndPrependChildReference() throws Exception {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = new Element(Tag.valueOf("i"), "");
        Element last = new Element(Tag.valueOf("b"), "");
        assertSame(parent, parent.appendChild(last));
        assertSame(parent, parent.prependChild(first));
        assertSame(first, parent.child(0));
        assertSame(last, parent.child(1));
        assertEquals(parent, parent.child(0).parent());
    }

    @Test
    public void testParseBodyFragmentCreatesExpectedElements() throws Exception {
        Element body = Parser.parseBodyFragment("<p>one</p><p>two</p>", "").body();
        assertEquals(2, body.children().size());
        assertEquals("one two", body.text());
        assertEquals("p", body.child(0).tagName());
    }

    @Test
    public void testElementEqualityAndHashCode() throws Exception {
        Element first = new Element(Tag.valueOf("div"), "");
        Element same = new Element(Tag.valueOf("div"), "");
        Element differentTag = new Element(Tag.valueOf("span"), "");
        assertEquals(first, same);
        assertEquals(first.hashCode(), same.hashCode());
        assertFalse(first.equals(differentTag));
        assertFalse(first.equals(null));
    }

    @Test
    public void testParseDocumentBasicStructure() throws Exception {
        Document document = Parser.parse("<p>hello</p>", "");
        assertEquals("html", document.child(0).nodeName());
        assertEquals("hello", document.text());
        assertEquals(1, document.getElementsByTag("p").size());
    }

    @Test
    public void testParseRelaxedFragmentElements() throws Exception {
        Document document = Parser.parseBodyFragmentRelaxed("<i>x</i><b>y</b>", "");
        assertEquals(2, document.body().children().size());
        assertEquals("xy", document.body().text());
        assertEquals("i", document.body().child(0).tagName());
    }

    @Test
    public void testTagNameAndBlockContainmentProperties() throws Exception {
        Tag inline = Tag.valueOf("span");
        Tag block = Tag.valueOf("div");
        assertEquals("span", inline.getName());
        assertFalse(inline.canContainBlock());
        assertEquals("div", block.getName());
        assertTrue(block.canContainBlock());
    }

    @Test
    public void testDetachedElementSiblingIndex() throws Exception {
        Element detached = new Element(Tag.valueOf("p"), "");
        assertEquals(Integer.valueOf(0), detached.elementSiblingIndex());
    }

    @Test
    public void testDifferentBaseUriAffectsElementEquality() throws Exception {
        Element first = new Element(Tag.valueOf("div"), "first");
        Element second = new Element(Tag.valueOf("div"), "second");
        assertFalse(first.equals(second));
    }
}
