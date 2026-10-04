```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.select.QueryParser;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class TokenQueueTest {
    @Test
    public void testEmptyQueueBasics() throws Exception {
        TokenQueue q = new TokenQueue("");
        assertTrue(q.isEmpty());
        assertEquals(0, q.peek());
        assertFalse(q.matches("x"));
        assertFalse(q.matchesCS("x"));
        assertFalse(q.matchesWhitespace());
        assertFalse(q.matchesWord());
        assertFalse(q.matchesStartTag());
        assertEquals("", q.toString());
    }

    @Test
    public void testCaseSensitiveAndInsensitiveMatching() throws Exception {
        TokenQueue q = new TokenQueue("Abc");
        assertTrue(q.matches("aB"));
        assertFalse(q.matchesCS("aB"));
        assertTrue(q.matchesCS("Ab"));
        assertTrue(q.matchesAny("zz", "AB"));
        assertFalse(q.matchesAny("zz", "abx"));
    }

    @Test
    public void testCharMatchesAndMatchChomp() throws Exception {
        TokenQueue q = new TokenQueue("abc");
        assertTrue(q.matchesAny('a', 'x'));
        assertTrue(q.matchChomp("A"));
        assertEquals('b', q.peek());
        assertFalse(q.matchChomp("x"));
        assertEquals("bc", q.toString());
    }

    @Test
    public void testStartTagBoundaries() throws Exception {
        assertTrue(new TokenQueue("<a").matchesStartTag());
        assertFalse(new TokenQueue("<").matchesStartTag());
        assertFalse(new TokenQueue("<1").matchesStartTag());
        assertFalse(new TokenQueue("a>").matchesStartTag());
    }

    @Test
    public void testWhitespaceAndWordPredicates() throws Exception {
        TokenQueue q = new TokenQueue(" \tA");
        assertTrue(q.matchesWhitespace());
        assertFalse(q.matchesWord());
        assertTrue(q.consumeWhitespace());
        assertFalse(q.matchesWhitespace());
        assertTrue(q.matchesWord());
        assertEquals("A", q.consumeWord());
        assertTrue(q.isEmpty());
    }

    @Test
    public void testAdvanceDoesNotPassEnd() throws Exception {
        TokenQueue q = new TokenQueue("x");
        q.advance();
        assertTrue(q.isEmpty());
        q.advance();
        assertTrue(q.isEmpty());
    }

    @Test
    public void testConsumeAndRemainder() throws Exception {
        TokenQueue q = new TokenQueue("abc");
        assertEquals('a', q.consume());
        assertEquals("bc", q.remainder());
        assertEquals("", q.remainder());
        assertTrue(q.isEmpty());
    }

    @Test
    public void testAddFirstCharacterAndStringAfterConsumption() throws Exception {
        TokenQueue q = new TokenQueue("old");
        q.consume();
        q.addFirst("new");
        assertEquals("newld", q.toString());
        q.addFirst(Character.valueOf('!'));
        assertEquals("!newld", q.toString());
    }

    @Test
    public void testConsumeToCaseSensitiveFoundAndMissing() throws Exception {
        TokenQueue q = new TokenQueue("aENDb");
        assertEquals("a", q.consumeTo("END"));
        assertEquals("ENDb", q.toString());
        TokenQueue missing = new TokenQueue("abc");
        assertEquals("abc", missing.consumeTo("X"));
        assertTrue(missing.isEmpty());
    }

    @Test
    public void testConsumeToIgnoreCaseLeavesTerminator() throws Exception {
        TokenQueue q = new TokenQueue("abXcd");
        assertEquals("ab", q.consumeToIgnoreCase("x"));
        assertEquals("Xcd", q.toString());
        assertEquals("Xcd", q.consumeToIgnoreCase("z"));
        assertTrue(q.isEmpty());
    }

    @Test
    public void testConsumeToIgnoreCaseWithUncasedTerminator() throws Exception {
        TokenQueue q = new TokenQueue("a(b)c");
        assertEquals("a", q.consumeToIgnoreCase("("));
        assertEquals("(b)c", q.toString());
    }

    @Test
    public void testConsumeToAnyStopsAtFirstMatch() throws Exception {
        TokenQueue q = new TokenQueue("abc:def");
        assertEquals("abc", q.consumeToAny("x", ":"));
        assertEquals(":def", q.toString());
    }

    @Test
    public void testChompToConsumesMatchedTerminator() throws Exception {
        TokenQueue q = new TokenQueue("abcENDtail");
        assertEquals("abc", q.chompTo("END"));
        assertEquals("tail", q.toString());
    }

    @Test
    public void testChompToIgnoreCaseConsumesMatchingTerminator() throws Exception {
        TokenQueue q = new TokenQueue("abcEndtail");
        assertEquals("abc", q.chompToIgnoreCase("eNd"));
        assertEquals("tail", q.toString());
    }

    @Test
    public void testChompBalancedNestedAndQuotedContent() throws Exception {
        TokenQueue q = new TokenQueue("(one (two) 'x)')tail");
        assertEquals("one (two) 'x)'", q.chompBalanced('(', ')'));
        assertEquals("tail", q.toString());
    }

    @Test
    public void testChompBalancedEscapedCloser() throws Exception {
        TokenQueue q = new TokenQueue("(a\\)b)c");
        assertEquals("a\\)b", q.chompBalanced('(', ')'));
        assertEquals("c", q.toString());
    }

    @Test
    public void testUnescapeBackslashPairs() throws Exception {
        assertEquals("ab", TokenQueue.unescape("a\\b"));
        assertEquals("a\\\\b", TokenQueue.unescape("a\\\\b"));
    }

    @Test
    public void testConsumeWhitespaceReturnsWhetherAnythingWasConsumed() throws Exception {
        TokenQueue q = new TokenQueue(" \nX");
        assertTrue(q.consumeWhitespace());
        assertEquals("X", q.toString());
        assertFalse(q.consumeWhitespace());
    }

    @Test
    public void testConsumeWordStopsAtPunctuation() throws Exception {
        TokenQueue q = new TokenQueue("a9_b");
        assertEquals("a9", q.consumeWord());
        assertEquals("_b", q.toString());
    }

    @Test
    public void testConsumeTagNameAllowedCharacters() throws Exception {
        TokenQueue q = new TokenQueue("a:bc_-!");
        assertEquals("a:bc_-", q.consumeTagName());
        assertEquals("!", q.toString());
    }

    @Test
    public void testConsumeElementSelectorNamespaceAndWildcard() throws Exception {
        TokenQueue q = new TokenQueue("*|a|b-x!");
        assertEquals("*|a|b-x", q.consumeElementSelector());
        assertEquals("!", q.toString());
    }

    @Test
    public void testConsumeCssIdentifier() throws Exception {
        TokenQueue q = new TokenQueue("_a-9:b");
        assertEquals("_a-9", q.consumeCssIdentifier());
        assertEquals(":b", q.toString());
    }

    @Test
    public void testConsumeAttributeKey() throws Exception {
        TokenQueue q = new TokenQueue("a:b-_9!");
        assertEquals("a:b-_9", q.consumeAttributeKey());
        assertEquals("!", q.toString());
    }

    @Test
    public void testQueryParserAcceptsNthChildIntegerEdges() throws Exception {
        assertNotNull(QueryParser.parse(":nth-child(2147483647)"));
        try {
            QueryParser.parse(":nth-child(2147483648)");
            fail("expected SelectorParseException");
        } catch (Selector.SelectorParseException expected) { }
        try {
            QueryParser.parse(":nth-child(-2147483649)");
            fail("expected SelectorParseException");
        } catch (Selector.SelectorParseException expected) { }
    }

    @Test
    public void testQueryParserHandlesBasicSelectorsAndCombinators() throws Exception {
        assertNotNull(QueryParser.parse("div.item > a"));
        assertNotNull(QueryParser.parse("[data-x^=ab]"));
        assertNotNull(QueryParser.parse(":has(span)"));
    }
}
```