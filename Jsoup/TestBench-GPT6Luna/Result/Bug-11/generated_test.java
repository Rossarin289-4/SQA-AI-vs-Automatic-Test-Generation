package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.parser.TokenQueue;
import java.util.Collection;
import java.util.LinkedHashSet;

public class SelectorTest {
    @Test
    public void testTagSelect() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element first = root.appendElement("p");
        root.appendElement("span");
        Element last = root.appendElement("p");
        Elements found = Selector.select("p", root);
        assertEquals(2, found.size());
        assertSame(first, found.get(0));
        assertSame(last, found.get(1));
    }

    @Test
    public void testUniversalSelectorIncludesRoot() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element child = root.appendElement("p");
        Elements found = Selector.select("*", root);
        assertEquals(2, found.size());
        assertSame(root, found.get(0));
        assertSame(child, found.get(1));
    }

    @Test
    public void testIdSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element target = root.appendElement("p").attr("id", "target");
        root.appendElement("p").attr("id", "other");
        Elements found = Selector.select("#target", root);
        assertEquals(1, found.size());
        assertSame(target, found.get(0));
    }

    @Test
    public void testClassSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element target = root.appendElement("p").attr("class", "chosen extra");
        root.appendElement("p").attr("class", "extra");
        Elements found = Selector.select(".chosen", root);
        assertEquals(1, found.size());
        assertSame(target, found.get(0));
    }

    @Test
    public void testAttributePresenceSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element target = root.appendElement("a").attr("href", "short");
        root.appendElement("a");
        Elements found = Selector.select("[href]", root);
        assertEquals(1, found.size());
        assertSame(target, found.get(0));
    }

    @Test
    public void testAttributeValueEqualsSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element target = root.appendElement("a").attr("href", "one");
        root.appendElement("a").attr("href", "two");
        Elements found = Selector.select("[href=one]", root);
        assertEquals(1, found.size());
        assertSame(target, found.get(0));
    }

    @Test
    public void testAttributeValueNotSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element target = root.appendElement("a").attr("href", "two");
        root.appendElement("a").attr("href", "one");
        Elements found = Selector.select("[href!=one]", root);
        assertEquals(2, found.size());
        assertSame(root, found.get(0));
        assertSame(target, found.get(1));
    }

    @Test
    public void testAttributeStartingSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element target = root.appendElement("p").attr("data-x", "v");
        root.appendElement("p").attr("title", "v");
        Elements found = Selector.select("[^data-]", root);
        assertEquals(1, found.size());
        assertSame(target, found.get(0));
    }

    @Test
    public void testDirectChildCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element direct = root.appendElement("p");
        root.appendElement("section").appendElement("p");
        Elements found = Selector.select("div > p", root);
        assertEquals(1, found.size());
        assertSame(direct, found.get(0));
    }

    @Test
    public void testDescendantCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element nested = root.appendElement("section").appendElement("p");
        Elements found = Selector.select("div p", root);
        assertEquals(1, found.size());
        assertSame(nested, found.get(0));
    }

    @Test
    public void testAdjacentSiblingCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        root.appendElement("h1");
        Element adjacent = root.appendElement("p");
        root.appendElement("p");
        Elements found = Selector.select("h1 + p", root);
        assertEquals(1, found.size());
        assertSame(adjacent, found.get(0));
    }

    @Test
    public void testGeneralSiblingCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        root.appendElement("h1");
        root.appendElement("i");
        Element later = root.appendElement("p");
        Elements found = Selector.select("h1 ~ p", root);
        assertEquals(1, found.size());
        assertSame(later, found.get(0));
    }

    @Test
    public void testGroupedSelectorsAreUniqueAndOrdered() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element first = root.appendElement("p").attr("class", "x");
        Element second = root.appendElement("p");
        Elements found = Selector.select(".x, p", root);
        assertEquals(2, found.size());
        assertSame(first, found.get(0));
        assertSame(second, found.get(1));
    }

    @Test
    public void testIndexLessThanBoundary() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element first = root.appendElement("p");
        Element second = root.appendElement("p");
        root.appendElement("p");
        Elements found = Selector.select("p:lt(2)", root);
        assertEquals(2, found.size());
        assertSame(first, found.get(0));
        assertSame(second, found.get(1));
    }

    @Test
    public void testIndexGreaterThanBoundary() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        root.appendElement("p");
        Element second = root.appendElement("p");
        Element third = root.appendElement("p");
        Elements found = Selector.select("p:gt(0)", root);
        assertEquals(2, found.size());
        assertSame(second, found.get(0));
        assertSame(third, found.get(1));
    }

    @Test
    public void testIndexEqualsFirstAndLastPositions() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element first = root.appendElement("p");
        root.appendElement("p");
        Element last = root.appendElement("p");
        assertSame(first, Selector.select("p:eq(0)", root).get(0));
        assertSame(last, Selector.select("p:eq(2)", root).get(0));
    }

    @Test
    public void testHasSelectsOnlyContainingElement() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element containing = root.appendElement("section");
        containing.appendElement("p");
        root.appendElement("section");
        Elements found = Selector.select("section:has(p)", root);
        assertEquals(1, found.size());
        assertSame(containing, found.get(0));
    }

    @Test
    public void testContainsText() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element target = root.appendElement("p").appendText("Find me");
        root.appendElement("p").appendText("Other");
        Elements found = Selector.select("p:contains(find me)", root);
        assertEquals(1, found.size());
        assertSame(target, found.get(0));
    }

    @Test
    public void testContainsOwnTextDoesNotMatchDescendantText() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element parent = root.appendElement("p");
        parent.appendElement("b").appendText("needle");
        Element own = root.appendElement("p").appendText("needle");
        Elements found = Selector.select("p:containsOwn(needle)", root);
        assertEquals(1, found.size());
        assertSame(own, found.get(0));
    }

    @Test
    public void testMatchesTextRegex() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element target = root.appendElement("p").appendText("item 42");
        root.appendElement("p").appendText("item no");
        Elements found = Selector.select("p:matches(\\d+)", root);
        assertEquals(1, found.size());
        assertSame(target, found.get(0));
    }

    @Test
    public void testNotSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element kept = root.appendElement("p");
        root.appendElement("p").attr("class", "skip");
        Elements found = Selector.select("p:not(.skip)", root);
        assertEquals(1, found.size());
        assertSame(kept, found.get(0));
    }

    @Test
    public void testLeadingCombinatorUsesRoot() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element child = root.appendElement("p");
        Elements found = Selector.select("> p", root);
        assertEquals(1, found.size());
        assertSame(child, found.get(0));
    }

    @Test
    public void testCommaSelectorWithNoMatchesIsEmpty() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        assertEquals(0, Selector.select("a, b", root).size());
    }

    @Test
    public void testInvalidIndexThrows() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        try {
            Selector.select("p:lt(x)", root);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
