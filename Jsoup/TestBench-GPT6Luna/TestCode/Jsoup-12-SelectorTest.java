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
    public void testUniversalSelectorIncludesRootAndDescendants() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element child = root.appendElement("p");
        assertEquals(2, Selector.select("*", root).size());
        assertEquals(root, Selector.select("*", root).get(0));
        assertEquals(child, Selector.select("*", root).get(1));
    }

    @Test
    public void testSelectsTagNameCaseInsensitively() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element child = root.appendElement("p");
        assertEquals(1, Selector.select("P", root).size());
        assertEquals(child, Selector.select("P", root).get(0));
    }

    @Test
    public void testSelectsId() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element child = root.appendElement("p").attr("id", "target");
        assertEquals(1, Selector.select("#target", root).size());
        assertEquals(child, Selector.select("#target", root).get(0));
    }

    @Test
    public void testSelectsClass() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element child = root.appendElement("p").attr("class", "chosen");
        assertEquals(1, Selector.select(".chosen", root).size());
        assertEquals(child, Selector.select(".chosen", root).get(0));
    }

    @Test
    public void testClassTagIntersection() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element match = root.appendElement("p").attr("class", "chosen");
        root.appendElement("span").attr("class", "chosen");
        assertEquals(1, Selector.select("p.chosen", root).size());
        assertEquals(match, Selector.select("p.chosen", root).get(0));
    }

    @Test
    public void testDirectChildCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element direct = root.appendElement("p");
        root.appendElement("section").appendElement("p");
        assertEquals(1, Selector.select("div > p", root).size());
        assertEquals(direct, Selector.select("div > p", root).get(0));
    }

    @Test
    public void testDescendantCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element nested = root.appendElement("section").appendElement("p");
        assertEquals(1, Selector.select("div p", root).size());
        assertEquals(nested, Selector.select("div p", root).get(0));
    }

    @Test
    public void testAdjacentSiblingCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        root.appendElement("h1");
        Element adjacent = root.appendElement("p");
        root.appendElement("p");
        assertEquals(1, Selector.select("h1 + p", root).size());
        assertEquals(adjacent, Selector.select("h1 + p", root).get(0));
    }

    @Test
    public void testGeneralSiblingCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        root.appendElement("h1");
        root.appendElement("section");
        Element later = root.appendElement("p");
        assertEquals(1, Selector.select("h1 ~ p", root).size());
        assertEquals(later, Selector.select("h1 ~ p", root).get(0));
    }

    @Test
    public void testGroupedSelectorIsUniqueAndOrdered() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element first = root.appendElement("p");
        Element second = root.appendElement("span");
        Elements result = Selector.select("p, span, p", root);
        assertEquals(2, result.size());
        assertEquals(first, result.get(0));
        assertEquals(second, result.get(1));
    }

    @Test
    public void testAttributePresenceSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element match = root.appendElement("a").attr("href", "go");
        root.appendElement("a");
        assertEquals(1, Selector.select("[href]", root).size());
        assertEquals(match, Selector.select("[href]", root).get(0));
    }

    @Test
    public void testAttributeExactValueSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element match = root.appendElement("a").attr("href", "go");
        root.appendElement("a").attr("href", "stop");
        assertEquals(1, Selector.select("[href=go]", root).size());
        assertEquals(match, Selector.select("[href=go]", root).get(0));
    }

    @Test
    public void testAttributeNotEqualExcludesMatchingValue() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element different = root.appendElement("a").attr("href", "stop");
        root.appendElement("a").attr("href", "go");
        Elements result = Selector.select("[href!=go]", root);
        assertEquals(1, result.size());
        assertEquals(different, result.get(0));
    }

    @Test
    public void testAttributeStartsWith() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element match = root.appendElement("a").attr("href", "http:site");
        root.appendElement("a").attr("href", "site:http");
        assertEquals(1, Selector.select("[href^=http:]", root).size());
        assertEquals(match, Selector.select("[href^=http:]", root).get(0));
    }

    @Test
    public void testAttributeEndsWith() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element match = root.appendElement("img").attr("src", "pic.png");
        root.appendElement("img").attr("src", "png.pic");
        assertEquals(1, Selector.select("[src$=.png]", root).size());
        assertEquals(match, Selector.select("[src$=.png]", root).get(0));
    }

    @Test
    public void testAttributeContainsValue() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element match = root.appendElement("a").attr("href", "/find/item");
        root.appendElement("a").attr("href", "/other");
        assertEquals(1, Selector.select("[href*=find]", root).size());
        assertEquals(match, Selector.select("[href*=find]", root).get(0));
    }

    @Test
    public void testAttributeRegularExpression() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element match = root.appendElement("img").attr("src", "pic.png");
        root.appendElement("img").attr("src", "pic.gif");
        assertEquals(1, Selector.select("[src~=.*\\.png]", root).size());
        assertEquals(match, Selector.select("[src~=.*\\.png]", root).get(0));
    }

    @Test
    public void testIndexLessThanBoundary() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element first = root.appendElement("p");
        Element second = root.appendElement("p");
        root.appendElement("p");
        Elements result = Selector.select("p:lt(2)", root);
        assertEquals(2, result.size());
        assertEquals(first, result.get(0));
        assertEquals(second, result.get(1));
    }

    @Test
    public void testIndexGreaterThanBoundary() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        root.appendElement("p");
        Element second = root.appendElement("p");
        Elements result = Selector.select("p:gt(0)", root);
        assertEquals(1, result.size());
        assertEquals(second, result.get(0));
    }

    @Test
    public void testIndexEqualsFirstAndLastElement() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element first = root.appendElement("p");
        Element second = root.appendElement("p");
        assertEquals(first, Selector.select("p:eq(0)", root).get(0));
        assertEquals(second, Selector.select("p:eq(1)", root).get(0));
    }

    @Test
    public void testHasSelectsContainingParent() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element parent = root.appendElement("section");
        parent.appendElement("p");
        root.appendElement("section");
        assertEquals(1, Selector.select("section:has(p)", root).size());
        assertEquals(parent, Selector.select("section:has(p)", root).get(0));
    }

    @Test
    public void testNotExcludesMatchingElement() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element keep = root.appendElement("p");
        root.appendElement("p").attr("class", "skip");
        Elements result = Selector.select("p:not(.skip)", root);
        assertEquals(1, result.size());
        assertEquals(keep, result.get(0));
    }

    @Test
    public void testContainsTextCaseInsensitively() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element match = root.appendElement("p").appendText("Hello Jsoup");
        root.appendElement("p").appendText("Other");
        assertEquals(1, Selector.select("p:contains(jsoup)", root).size());
        assertEquals(match, Selector.select("p:contains(jsoup)", root).get(0));
    }

    @Test
    public void testContainsOwnTextDoesNotUseDescendantText() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element parent = root.appendElement("p");
        parent.appendElement("b").appendText("needle");
        Element own = root.appendElement("p").appendText("needle");
        Elements result = Selector.select("p:containsOwn(needle)", root);
        assertEquals(1, result.size());
        assertEquals(own, result.get(0));
    }

    @Test
    public void testMatchesTextByRegularExpression() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element match = root.appendElement("p").appendText("item42");
        root.appendElement("p").appendText("item");
        assertEquals(1, Selector.select("p:matches(\\d+)", root).size());
        assertEquals(match, Selector.select("p:matches(\\d+)", root).get(0));
    }
}
