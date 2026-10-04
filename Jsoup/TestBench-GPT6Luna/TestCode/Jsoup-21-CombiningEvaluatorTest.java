package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;

public class CombiningEvaluatorTest {
    @Test
    public void testParseTagMatchesCaseInsensitively() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = new Element(org.jsoup.parser.Tag.valueOf("P"), "");
        assertTrue(QueryParser.parse("p").matches(root, node));
        assertFalse(QueryParser.parse("span").matches(root, node));
    }

    @Test
    public void testParseIdMatchesExactId() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = new Element(org.jsoup.parser.Tag.valueOf("p"), "");
        node.attr("id", "item");
        assertTrue(QueryParser.parse("#item").matches(root, node));
        assertFalse(QueryParser.parse("#other").matches(root, node));
    }

    @Test
    public void testParseClassMatchesClass() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = new Element(org.jsoup.parser.Tag.valueOf("p"), "");
        node.attr("class", "one two");
        assertTrue(QueryParser.parse(".two").matches(root, node));
        assertFalse(QueryParser.parse(".three").matches(root, node));
    }

    @Test
    public void testParseAttributePresenceAndValue() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = new Element(org.jsoup.parser.Tag.valueOf("a"), "");
        node.attr("href", "ab");
        assertTrue(QueryParser.parse("[href]").matches(root, node));
        assertTrue(QueryParser.parse("[href=ab]").matches(root, node));
        assertFalse(QueryParser.parse("[href=ac]").matches(root, node));
    }

    @Test
    public void testAttributeValueOperators() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = new Element(org.jsoup.parser.Tag.valueOf("a"), "");
        node.attr("data-x", "alpha beta");
        assertTrue(QueryParser.parse("[data-x^=al]").matches(root, node));
        assertTrue(QueryParser.parse("[data-x$=ta]").matches(root, node));
        assertTrue(QueryParser.parse("[data-x*=ha b]").matches(root, node));
        assertTrue(QueryParser.parse("[data-x~=alpha]").matches(root, node));
        assertFalse(QueryParser.parse("[data-x!=alpha beta]").matches(root, node));
    }

    @Test
    public void testIndexSelectorsAtSiblingBoundaries() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element first = root.appendElement("p");
        Element second = root.appendElement("p");
        assertTrue(QueryParser.parse(":eq(0)").matches(root, first));
        assertFalse(QueryParser.parse(":eq(0)").matches(root, second));
        assertTrue(QueryParser.parse(":lt(1)").matches(root, first));
        assertFalse(QueryParser.parse(":lt(1)").matches(root, second));
        assertFalse(QueryParser.parse(":gt(0)").matches(root, first));
        assertTrue(QueryParser.parse(":gt(0)").matches(root, second));
    }

    @Test
    public void testAllElementsSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = new Element(org.jsoup.parser.Tag.valueOf("p"), "");
        assertTrue(QueryParser.parse("*").matches(root, node));
    }

    @Test
    public void testAndSelectorRequiresBothConditions() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = new Element(org.jsoup.parser.Tag.valueOf("p"), "");
        node.attr("class", "note");
        assertTrue(QueryParser.parse("p.note").matches(root, node));
        assertFalse(QueryParser.parse("p.other").matches(root, node));
    }

    @Test
    public void testOrSelectorMatchesEitherBranch() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = new Element(org.jsoup.parser.Tag.valueOf("p"), "");
        assertTrue(QueryParser.parse("p,span").matches(root, node));
        assertFalse(QueryParser.parse("a,span").matches(root, node));
    }

    @Test
    public void testChildCombinatorMatchesImmediateParent() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element parent = root.appendElement("section");
        Element child = parent.appendElement("p");
        assertTrue(QueryParser.parse("section > p").matches(root, child));
        assertFalse(QueryParser.parse("div > p").matches(root, child));
    }

    @Test
    public void testDescendantCombinatorMatchesAncestor() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element parent = root.appendElement("section");
        Element child = parent.appendElement("p");
        assertTrue(QueryParser.parse("div p").matches(root, child));
        assertFalse(QueryParser.parse("aside p").matches(root, child));
    }

    @Test
    public void testAdjacentSiblingCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        root.appendElement("h1");
        Element node = root.appendElement("p");
        assertTrue(QueryParser.parse("h1 + p").matches(root, node));
        assertFalse(QueryParser.parse("h2 + p").matches(root, node));
    }

    @Test
    public void testGeneralSiblingCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        root.appendElement("h1");
        root.appendElement("hr");
        Element node = root.appendElement("p");
        assertTrue(QueryParser.parse("h1 ~ p").matches(root, node));
        assertFalse(QueryParser.parse("h2 ~ p").matches(root, node));
    }

    @Test
    public void testNotSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = new Element(org.jsoup.parser.Tag.valueOf("p"), "");
        assertTrue(QueryParser.parse(":not(span)").matches(root, node));
        assertFalse(QueryParser.parse(":not(p)").matches(root, node));
    }

    @Test
    public void testHasSelector() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = root.appendElement("section");
        node.appendElement("p");
        assertTrue(QueryParser.parse(":has(p)").matches(root, node));
        assertFalse(QueryParser.parse(":has(span)").matches(root, node));
    }

    @Test
    public void testContainsTextSelectors() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = root.appendElement("p");
        node.appendText("hello");
        assertTrue(QueryParser.parse(":contains(hello)").matches(root, node));
        assertTrue(QueryParser.parse(":containsOwn(hello)").matches(root, node));
        assertFalse(QueryParser.parse(":contains(goodbye)").matches(root, node));
    }

    @Test
    public void testMatchesRegexSelectors() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = root.appendElement("p");
        node.appendText("abc");
        assertTrue(QueryParser.parse(":matches(a.c)").matches(root, node));
        assertTrue(QueryParser.parse(":matchesOwn(a.c)").matches(root, node));
        assertFalse(QueryParser.parse(":matches(z+)").matches(root, node));
    }

    @Test
    public void testInitialWhitespaceAndLeadingCombinator() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = root.appendElement("p");
        assertTrue(QueryParser.parse("  > p").matches(root, node));
    }

    @Test
    public void testEmptyQueryThrowsSelectorParseException() throws Exception {
        try {
            QueryParser.parse("");
            fail("expected SelectorParseException");
        } catch (Selector.SelectorParseException expected) {
        }
    }

    @Test
    public void testInvalidIndexThrowsNumberFormatExceptionAtOverflow() throws Exception {
        try {
            QueryParser.parse(":eq(2147483648)");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testIndexIntegerMaximumParses() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = root.appendElement("p");
        assertFalse(QueryParser.parse(":gt(2147483647)").matches(root, node));
    }

    @Test
    public void testIndexIntegerMinimumParses() throws Exception {
        Element root = new Element(org.jsoup.parser.Tag.valueOf("div"), "");
        Element node = root.appendElement("p");
        assertFalse(QueryParser.parse(":gt(-2147483648)").matches(root, node));
    }

    @Test
    public void testAndAndOrToStringAreStable() throws Exception {
        Evaluator first = QueryParser.parse("p.note");
        Evaluator second = QueryParser.parse("p,span");
        assertEquals("p .note", first.toString());
        assertEquals(":or[p, span]", second.toString());
    }
}
