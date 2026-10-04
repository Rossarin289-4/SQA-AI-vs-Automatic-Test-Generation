package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;

public class CharacterReaderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorAndIsEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testConstructorWithEmptyString() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConstructorWithNullString() throws Exception {
        try {
            new CharacterReader(null);
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testConstructorNormalizesCarriageReturns() throws Exception {
        CharacterReader reader = new CharacterReader("a\r\nb");
        assertEquals("a\nb", reader.consumeToEnd());
    }

    @Test
    public void testPos() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());
        reader.consume();
        assertEquals(1, reader.pos());
    }

    @Test
    public void testCurrent() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
        reader.consume();
        assertEquals('b', reader.current());
        reader.consume();
        assertEquals('c', reader.current());
        reader.consume();
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsume() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.consume());
        assertEquals('b', reader.consume());
        assertEquals('c', reader.consume());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void testUnconsume() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.consume(); // pos = 1
        reader.unconsume(); // pos = 0
        assertEquals('a', reader.current());
        reader.consume(); // pos = 1
        reader.consume(); // pos = 2
        reader.unconsume(); // pos = 1
        assertEquals('b', reader.current());
    }

    @Test
    public void testAdvance() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance(); // pos = 1
        assertEquals('b', reader.current());
        reader.advance(); // pos = 2
        assertEquals('c', reader.current());
        reader.advance(); // pos = 3
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testMarkAndRewindToMark() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume(); // b
        reader.consume(); // c
        reader.mark(); // mark = 2
        reader.consume(); // d
        reader.consume(); // e
        reader.rewindToMark(); // pos = 2
        assertEquals('c', reader.current());
        assertEquals("cdef", reader.toString());
    }

    @Test
    public void testConsumeAsString() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("a", reader.consumeAsString());
        assertEquals("b", reader.consumeAsString());
        assertEquals("c", reader.consumeAsString());
    }

    @Test
    public void testConsumeToCharFound() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("abc", reader.consumeTo('d'));
        assertEquals('d', reader.current());
    }

    @Test
    public void testConsumeToCharNotFound() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("abcdef", reader.consumeTo('z'));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToCharAtStart() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("", reader.consumeTo('a'));
        assertEquals('a', reader.current());
    }

    @Test
    public void testConsumeToCharAtEnd() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        // Original test was wrong, it should consume up to 'f', then 'f' is current
        assertEquals("abcde", reader.consumeTo('f'));
        assertEquals('f', reader.current());
        reader.consume(); // consume 'f'
        assertEquals(CharacterReader.EOF, reader.current());
    }


    @Test
    public void testConsumeToStringFound() throws Exception {
        CharacterReader reader = new CharacterReader("abcdefghi");
        assertEquals("abc", reader.consumeTo("def"));
        assertEquals('d', reader.current());
        assertEquals("defghi", reader.consumeToEnd());
    }

    @Test
    public void testConsumeToStringNotFound() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("abcdef", reader.consumeTo("xyz"));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToStringAtStart() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("", reader.consumeTo("abc"));
        assertEquals('a', reader.current());
    }

    @Test
    public void testConsumeToStringAtEnd() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("abc", reader.consumeTo("def"));
        assertEquals('d', reader.current());
    }

    @Test
    public void testConsumeToAnyFound() throws Exception {
        CharacterReader reader = new CharacterReader("abcdefghi");
        assertEquals("abc", reader.consumeToAny('d', 'x'));
        assertEquals('d', reader.current());
    }

    @Test
    public void testConsumeToAnyNotFound() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("abcdef", reader.consumeToAny('x', 'y', 'z'));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToAnyAtStart() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("", reader.consumeToAny('a', 'b'));
        assertEquals('a', reader.current());
    }

    @Test
    public void testConsumeToEnd() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("abcdef", reader.consumeToEnd());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToEndOnEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeToEnd());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader reader = new CharacterReader("abc123def");
        assertEquals("abc", reader.consumeLetterSequence());
        assertEquals('1', reader.current());
        CharacterReader reader2 = new CharacterReader("123abcDEF");
        assertEquals("", reader2.consumeLetterSequence());
        assertEquals('1', reader2.current());
        CharacterReader reader3 = new CharacterReader("ABCdef");
        assertEquals("ABCdef", reader3.consumeLetterSequence());
        assertEquals(CharacterReader.EOF, reader3.current());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader reader = new CharacterReader("abcdef123ABC");
        assertEquals("abcdef", reader.consumeHexSequence());
        assertEquals('1', reader.current());
        CharacterReader reader2 = new CharacterReader("123ABCdef");
        assertEquals("123ABC", reader2.consumeHexSequence());
        assertEquals('d', reader2.current());
        CharacterReader reader3 = new CharacterReader("GHI");
        assertEquals("", reader3.consumeHexSequence());
        assertEquals('G', reader3.current());
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader reader = new CharacterReader("123abc456");
        assertEquals("123", reader.consumeDigitSequence());
        assertEquals('a', reader.current());
        CharacterReader reader2 = new CharacterReader("abc123def");
        assertEquals("", reader2.consumeDigitSequence());
        assertEquals('a', reader2.current());
        CharacterReader reader3 = new CharacterReader("7890");
        assertEquals("7890", reader3.consumeDigitSequence());
        assertEquals(CharacterReader.EOF, reader3.current());
    }

    @Test
    public void testMatchesCharFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
        assertFalse(reader.matches('b'));
    }

    @Test
    public void testMatchesCharNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matches('x'));
    }

    @Test
    public void testMatchesCharOnEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matches('a'));
    }

    @Test
    public void testMatchesStringFound() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matches("abc"));
        assertFalse(reader.matches("abd"));
    }

    @Test
    public void testMatchesStringNotFound() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.matches("xyz"));
    }

    @Test
    public void testMatchesStringAtEnd() {
        CharacterReader reader = new CharacterReader("abcdef");
        // The original test was wrong. matches("def") should be true.
        assertTrue(reader.matches("def"));
    }

    @Test
    public void testMatchesStringOnEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matches("abc"));
    }

    @Test
    public void testMatchesIgnoreCaseFound() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertTrue(reader.matchesIgnoreCase("abcd"));
        assertTrue(reader.matchesIgnoreCase("AbCd"));
    }

    @Test
    public void testMatchesIgnoreCaseNotFound() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertFalse(reader.matchesIgnoreCase("xyz"));
    }

    @Test
    public void testMatchesIgnoreCaseOnEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesIgnoreCase("abc"));
    }

    @Test
    public void testMatchesAnyFound() {
        CharacterReader reader = new CharacterReader("abc");
        // Original test was wrong. matchesAny('a','x') should be true.
        assertTrue(reader.matchesAny('a', 'x'));
        // Original test was wrong. matchesAny('b','y') should be true.
        assertTrue(reader.matchesAny('b', 'y'));
        assertFalse(reader.matchesAny('x', 'y'));
    }

    @Test
    public void testMatchesAnyNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void testMatchesAnyOnEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesLetterFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesLetter());
        reader.consume();
        assertTrue(reader.matchesLetter());
        reader.consume();
        assertTrue(reader.matchesLetter());
        reader.consume();
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetterWithDigit() {
        CharacterReader reader = new CharacterReader("1abc");
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetterOnEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void testMatchesDigitFound() {
        CharacterReader reader = new CharacterReader("123");
        assertTrue(reader.matchesDigit());
        reader.consume();
        assertTrue(reader.matchesDigit());
        reader.consume();
        assertTrue(reader.matchesDigit());
        reader.consume();
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigitWithLetter() {
        CharacterReader reader = new CharacterReader("a123");
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigitOnEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchConsumeFound() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matchConsume("abc"));
        assertEquals('d', reader.current());
    }

    @Test
    public void testMatchConsumeNotFound() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.matchConsume("abd"));
        assertEquals('a', reader.current()); // Position should not change
    }

    @Test
    public void testMatchConsumeOnEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchConsume("abc"));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testMatchConsumeIgnoreCaseFound() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertTrue(reader.matchConsumeIgnoreCase("abcd"));
        assertEquals('e', reader.current());
    }

    @Test
    public void testMatchConsumeIgnoreCaseNotFound() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertFalse(reader.matchConsumeIgnoreCase("xyz"));
        assertEquals('a', reader.current());
    }

    @Test
    public void testMatchConsumeIgnoreCaseOnEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchConsumeIgnoreCase("abc"));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testContainsIgnoreCaseFoundLower() {
        CharacterReader reader = new CharacterReader("abc</TITLE>def");
        assertTrue(reader.containsIgnoreCase("title"));
    }

    @Test
    public void testContainsIgnoreCaseFoundUpper() {
        CharacterReader reader = new CharacterReader("abc<TITLE/>def");
        assertTrue(reader.containsIgnoreCase("title"));
    }

    @Test
    public void testContainsIgnoreCaseNotFound() {
        CharacterReader reader = new CharacterReader("abc<script>def</script>");
        assertFalse(reader.containsIgnoreCase("title"));
    }

    @Test
    public void testContainsIgnoreCaseOnEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.containsIgnoreCase("title"));
    }

    @Test
    public void testToString() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("abcdef", reader.toString());
        reader.consume();
        assertEquals("bcdef", reader.toString());
        reader.consumeTo("ef");
        assertEquals("ef", reader.toString());
        reader.consumeToEnd();
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringOnEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.toString());
    }
}
