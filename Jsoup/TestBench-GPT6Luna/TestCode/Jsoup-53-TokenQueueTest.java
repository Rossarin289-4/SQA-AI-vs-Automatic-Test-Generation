package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;

public class TokenQueueTest {
    @Test
    public void testEmptyAndPeekAtEnd() throws Exception {
        TokenQueue q = new TokenQueue("");
        assertTrue(q.isEmpty());
        assertEquals((char) 0, q.peek());
        q.advance();
        assertTrue(q.isEmpty());
    }

    @Test
    public void testAddFirstAfterPartialConsumption() throws Exception {
        TokenQueue q = new TokenQueue("abc");
        q.advance();
        q.addFirst("XY");
        assertEquals("XYbc", q.toString());
        assertEquals('X', q.peek());
    }

    @Test
    public void testMatchesCaseAndLengthBoundaries() throws Exception {
        TokenQueue q = new TokenQueue("Ab");
        assertTrue(q.matches("aB"));
        assertFalse(q.matchesCS("aB"));
        assertTrue(q.matchesCS("Ab"));
        assertFalse(q.matches("Abc"));
        assertTrue(new TokenQueue("").matches(""));
    }

    @Test
    public void testMatchesAnyOverloads() throws Exception {
        TokenQueue q = new TokenQueue("Cat");
        assertTrue(q.matchesAny("dog", "cA"));
        assertTrue(q.matchesAny('C', 'x'));
        assertFalse(q.matchesAny('x', 'y'));
        assertFalse(new TokenQueue("").matchesAny('C'));
    }

    @Test
    public void testStartTagRequiresLetterAfterAngle() throws Exception {
        assertTrue(new TokenQueue("<a").matchesStartTag());
        assertFalse(new TokenQueue("<1").matchesStartTag());
        assertFalse(new TokenQueue("<").matchesStartTag());
    }

    @Test
    public void testMatchChompSuccessAndFailure() throws Exception {
        TokenQueue q = new TokenQueue("Abc");
        assertTrue(q.matchChomp("aB"));
        assertEquals("c", q.toString());
        assertFalse(q.matchChomp("x"));
        assertEquals("c", q.toString());
    }

    @Test
    public void testWhitespaceAndWordPredicatesAtEdges() throws Exception {
        assertTrue(new TokenQueue(" x").matchesWhitespace());
        assertFalse(new TokenQueue("x").matchesWhitespace());
        assertTrue(new TokenQueue("7").matchesWord());
        assertFalse(new TokenQueue("_").matchesWord());
        assertFalse(new TokenQueue("").matchesWord());
    }

    @Test
    public void testConsumeAndAdvance() throws Exception {
        TokenQueue q = new TokenQueue("ab");
        q.advance();
        assertEquals('b', q.consume());
        assertTrue(q.isEmpty());
    }

    @Test
    public void testConsumeToCaseSensitiveAndMissingTerminator() throws Exception {
        TokenQueue q = new TokenQueue("abXXcd");
        assertEquals("ab", q.consumeTo("XX"));
        assertEquals("XXcd", q.toString());
        assertEquals("XXcd", q.consumeTo("xx"));
        assertTrue(q.isEmpty());
    }

    @Test
    public void testConsumeToIgnoreCase() throws Exception {
        TokenQueue q = new TokenQueue("abcENDtail");
        assertEquals("abc", q.consumeToIgnoreCase("end"));
        assertEquals("ENDtail", q.toString());

        TokenQueue q2 = new TokenQueue("a#b#c");
        assertEquals("a#b", q2.consumeToIgnoreCase("#c"));
        assertEquals("#c", q2.toString());
    }

    @Test
    public void testConsumeToAnyLeavesTerminator() throws Exception {
        TokenQueue q = new TokenQueue("abc,def");
        assertEquals("abc", q.consumeToAny(";", ","));
        assertEquals(",def", q.toString());
        assertEquals("abc,def", new TokenQueue("abc,def").consumeToAny("!"));
    }

    @Test
    public void testChompToConsumesFoundTerminatorOnly() throws Exception {
        TokenQueue q = new TokenQueue("abcENDz");
        assertEquals("abc", q.chompTo("END"));
        assertEquals("z", q.toString());

        TokenQueue q2 = new TokenQueue("abc");
        assertEquals("abc", q2.chompTo("END"));
        assertTrue(q2.isEmpty());
    }

    @Test
    public void testChompToIgnoreCase() throws Exception {
        TokenQueue q = new TokenQueue("abcEndz");
        assertEquals("abc", q.chompToIgnoreCase("end"));
        assertEquals("z", q.toString());
    }

    @Test
    public void testChompBalancedNestedAndQuotedDelimiters() throws Exception {
        TokenQueue q = new TokenQueue("(one (two) 'x)')tail");
        assertEquals("one (two) 'x)'", q.chompBalanced('(', ')'));
        assertEquals("tail", q.toString());
    }

    @Test
    public void testUnescapeBackslashPairs() throws Exception {
        assertEquals("ab", TokenQueue.unescape("a\\b"));
        assertEquals("a\\b", TokenQueue.unescape("a\\\\b"));
        assertEquals("", TokenQueue.unescape(""));
    }

    @Test
    public void testConsumeWhitespaceRunAndNoWhitespace() throws Exception {
        TokenQueue q = new TokenQueue(" \t x");
        assertTrue(q.consumeWhitespace());
        assertEquals("x", q.toString());
        assertFalse(new TokenQueue("x").consumeWhitespace());
    }

    @Test
    public void testConsumeWordStopsAtPunctuation() throws Exception {
        TokenQueue q = new TokenQueue("a9_x");
        assertEquals("a9", q.consumeWord());
        assertEquals("_x", q.toString());
        assertEquals("", new TokenQueue("_a").consumeWord());
    }

    @Test
    public void testConsumeTagNameCharacterSet() throws Exception {
        TokenQueue q = new TokenQueue("a:b_c-9!");
        assertEquals("a:b_c-9", q.consumeTagName());
        assertEquals("!", q.toString());
    }

    @Test
    public void testConsumeElementSelectorCharacterSet() throws Exception {
        TokenQueue q = new TokenQueue("a|b_c-9:");
        assertEquals("a|b_c-9", q.consumeElementSelector());
        assertEquals(":", q.toString());
    }

    @Test
    public void testConsumeCssIdentifierCharacterSet() throws Exception {
        TokenQueue q = new TokenQueue("a9_b-c:");
        assertEquals("a9_b-c", q.consumeCssIdentifier());
        assertEquals(":", q.toString());
    }

    @Test
    public void testConsumeAttributeKeyCharacterSet() throws Exception {
        TokenQueue q = new TokenQueue("a:b_c-9!");
        assertEquals("a:b_c-9", q.consumeAttributeKey());
        assertEquals("!", q.toString());
    }

    @Test
    public void testRemainderConsumesEverything() throws Exception {
        TokenQueue q = new TokenQueue("abc");
        q.advance();
        assertEquals("bc", q.remainder());
        assertEquals("", q.toString());
        assertEquals("", q.remainder());
    }
}
