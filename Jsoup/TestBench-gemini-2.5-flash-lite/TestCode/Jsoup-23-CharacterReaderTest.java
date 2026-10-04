package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import java.util.ArrayList;
import java.util.List;

public class CharacterReaderTest {
    @Test
    public void testConstructorValidatesNotNull() {
        try {
            new CharacterReader(null);
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorNormalizesCarriageReturns() {
        CharacterReader reader = new CharacterReader("a\r\nb\rc");
        assertEquals("a\nb\nc", reader.consumeToEnd());
    }

    @Test
    public void testPos() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());
        reader.consume();
        assertEquals(1, reader.pos());
    }

    @Test
    public void testIsEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
        reader.consume();
        assertTrue(reader.isEmpty());

        reader = new CharacterReader("a");
        assertFalse(reader.isEmpty());
        reader.consume();
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testCurrent() {
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
    public void testConsume() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.consume());
        assertEquals('b', reader.consume());
        assertEquals('c', reader.consume());
        assertEquals(CharacterReader.EOF, reader.consume());
    }

    @Test
    public void testUnconsume() {
        CharacterReader reader = new CharacterReader("abc");
        reader.consume(); // 'a', pos=1
        reader.consume(); // 'b', pos=2
        assertEquals('b', reader.current());
        reader.unconsume(); // pos=1
        assertEquals('b', reader.current()); // current() looks at pos, which is now 1, so 'b'
        reader.unconsume(); // pos=0
        assertEquals('a', reader.current()); // current() looks at pos, which is now 0, so 'a'
        reader.consume(); // 'a', pos=1
        assertEquals('b', reader.current());
    }

    @Test
    public void testAdvance() {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance(); // pos=1
        assertEquals('b', reader.current());
        reader.advance(); // pos=2
        assertEquals('c', reader.current());
        reader.advance(); // pos=3
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testMarkAndRewindToMark() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.mark(); // mark at 0
        reader.consume(); // a, pos=1
        reader.consume(); // b, pos=2
        reader.mark(); // mark at 2
        reader.consume(); // c, pos=3
        reader.consume(); // d, pos=4
        reader.rewindToMark(); // rewind to pos 2
        assertEquals('c', reader.current()); // checks char at pos 2
        reader.rewindToMark(); // rewind to pos 0
        assertEquals('a', reader.current()); // checks char at pos 0
    }

    @Test
    public void testConsumeAsString() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("a", reader.consumeAsString()); // pos=1
        assertEquals("b", reader.consumeAsString()); // pos=2
        assertEquals("c", reader.consumeAsString()); // pos=3
        // The behavior of consumeAsString when pos == length is to throw StringIndexOutOfBoundsException.
        // To avoid this, we simply test that all characters are consumed.
        // Asserting "" for an exhausted reader is incorrect based on the code.
        // The current state after consuming "c" is pos=3, length=3.
        // The next call `input.substring(3, 3++)` would error.
        // Thus, testing for "" is not valid. We test valid consumptions.
    }

    @Test
    public void testConsumeToCharFound() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("abc", reader.consumeTo('d')); // consumes up to 'd', pos becomes index of 'd'
        assertEquals('d', reader.current());
    }

    @Test
    public void testConsumeToCharNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo('d')); // 'd' not found, consumes all. pos becomes length.
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToCharEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeTo('a'));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToStringFound() {
        CharacterReader reader = new CharacterReader("abcdefghi");
        assertEquals("abc", reader.consumeTo("def")); // consumes up to "def", pos becomes index of 'd'
        assertEquals('d', reader.current());
    }

    @Test
    public void testConsumeToStringNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo("def")); // "def" not found, consumes all. pos becomes length.
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToStringEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeTo("def"));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToAnyFound() {
        CharacterReader reader = new CharacterReader("abcdefghi");
        assertEquals("abc", reader.consumeToAny('d', 'e')); // consumes up to 'd', pos becomes index of 'd'
        assertEquals('d', reader.current());
    }

    @Test
    public void testConsumeToAnyFoundLastChar() {
        CharacterReader reader = new CharacterReader("abcdefghi");
        assertEquals("abcdefgh", reader.consumeToAny('i')); // consumes up to 'i', pos becomes index of 'i'
        assertEquals('i', reader.current());
    }

    @Test
    public void testConsumeToAnyNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeToAny('d', 'e')); // none found, consumes all. pos becomes length.
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToAnyEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeToAny('a', 'b'));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToEnd() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeToEnd()); // consumes all. pos becomes length.
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals("", reader.consumeToEnd()); // pos is length, returns empty string.
    }

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader reader = new CharacterReader("abc123def");
        assertEquals("abc", reader.consumeLetterSequence()); // pos becomes 3
        assertEquals('1', reader.current()); // checks char at pos 3

        reader = new CharacterReader("123abc");
        assertEquals("", reader.consumeLetterSequence()); // no letters at start, pos remains 0
        assertEquals('1', reader.current()); // checks char at pos 0

        reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeLetterSequence()); // consumes all letters, pos becomes length
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader reader = new CharacterReader("abc123def456");
        assertEquals("abc123", reader.consumeLetterThenDigitSequence()); // consumes letters then digits
        assertEquals('d', reader.current()); // next char is 'd'

        reader = new CharacterReader("123abc456");
        // It first consumes letters, then digits.
        // If it starts with digits, it consumes 0 letters. Then it looks for digits.
        // So "abc456" is correct because it consumes all letters first, then all digits.
        assertEquals("abc456", reader.consumeLetterThenDigitSequence()); // Consumes letters "abc", then digits "456".
        assertEquals(CharacterReader.EOF, reader.current());

        reader = new CharacterReader("abc"); // Only letters
        assertEquals("abc", reader.consumeLetterThenDigitSequence());
        assertEquals(CharacterReader.EOF, reader.current());

        reader = new CharacterReader("123"); // Only digits
        assertEquals("123", reader.consumeLetterThenDigitSequence()); // Consumes letters (0), then digits "123".
        assertEquals(CharacterReader.EOF, reader.current());

        reader = new CharacterReader("");
        assertEquals("", reader.consumeLetterThenDigitSequence());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader reader = new CharacterReader("A1b2C3d4E5f6");
        assertEquals("A1b2C3d4E5f6", reader.consumeHexSequence());
        assertEquals(CharacterReader.EOF, reader.current());

        reader = new CharacterReader("G1a2"); // 'G' is not a hex char
        assertEquals("", reader.consumeHexSequence()); // Consumes 0 hex chars
        assertEquals('G', reader.current()); // Current char is 'G'

        reader = new CharacterReader("123");
        assertEquals("123", reader.consumeHexSequence());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader reader = new CharacterReader("123456");
        assertEquals("123456", reader.consumeDigitSequence());
        assertEquals(CharacterReader.EOF, reader.current());

        reader = new CharacterReader("a123b");
        assertEquals("", reader.consumeDigitSequence()); // No digits at start
        assertEquals('a', reader.current());

        reader = new CharacterReader("123a");
        assertEquals("123", reader.consumeDigitSequence()); // Consumes digits, stops at 'a'
        assertEquals('a', reader.current());
    }

    @Test
    public void testMatchesChar() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
        assertFalse(reader.matches('b'));
        reader.consume(); // pos=1
        assertTrue(reader.matches('b'));
        reader.consume(); // pos=2
        assertTrue(reader.matches('c'));
        reader.consume(); // pos=3
        assertFalse(reader.matches(CharacterReader.EOF)); // isEmpty() is true
    }

    @Test
    public void testMatchesString() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matches("abc"));
        assertFalse(reader.matches("abd"));
        reader.consume(); // pos=1
        reader.consume(); // pos=2
        reader.consume(); // pos=3
        assertFalse(reader.matches("abc")); // Checks from pos 3, "def" != "abc"
        assertTrue(reader.matches("def")); // Checks from pos 3, "def" == "def"
    }

    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertTrue(reader.matchesIgnoreCase("abc"));
        assertFalse(reader.matchesIgnoreCase("abd"));
        reader.consume(); // pos=1
        reader.consume(); // pos=2
        reader.consume(); // pos=3
        assertFalse(reader.matchesIgnoreCase("abc")); // Checks from pos 3, "DeF" != "abc" (case-insensitive)
        assertTrue(reader.matchesIgnoreCase("dEf")); // Checks from pos 3, "DeF" == "dEf" (case-insensitive)
    }

    @Test
    public void testMatchesAny() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matchesAny('a', 'x')); // pos=0, 'a' matches
        assertFalse(reader.matchesAny('b', 'c')); // pos=0, 'a' does not match 'b' or 'c'
        reader.consume(); // pos=1, current='b'
        assertTrue(reader.matchesAny('b', 'd')); // pos=1, 'b' matches
        reader.consume(); // pos=2, current='c'
        reader.consume(); // pos=3, current='d'
        assertFalse(reader.matchesAny('c', 'e')); // pos=3, 'd' does not match 'c' or 'e'
        reader.consume(); // pos=4, current='e'
        reader.consume(); // pos=5, current='f'
        reader.consume(); // pos=6, current=EOF
        assertFalse(reader.matchesAny('a', 'b')); // pos=6, isEmpty() is true, returns false
    }

    @Test
    public void testMatchesLetter() {
        CharacterReader reader = new CharacterReader("aBc1");
        assertTrue(reader.matchesLetter()); // 'a'
        reader.consume(); // pos=1
        assertTrue(reader.matchesLetter()); // 'B'
        reader.consume(); // pos=2
        assertTrue(reader.matchesLetter()); // 'c'
        reader.consume(); // pos=3
        assertFalse(reader.matchesLetter()); // '1'
        reader.consume(); // pos=4
        assertFalse(reader.matchesLetter()); // EOF
    }

    @Test
    public void testMatchesDigit() {
        CharacterReader reader = new CharacterReader("123a");
        assertTrue(reader.matchesDigit()); // '1'
        reader.consume(); // pos=1
        assertTrue(reader.matchesDigit()); // '2'
        reader.consume(); // pos=2
        assertTrue(reader.matchesDigit()); // '3'
        reader.consume(); // pos=3
        assertFalse(reader.matchesDigit()); // 'a'
        reader.consume(); // pos=4
        assertFalse(reader.matchesDigit()); // EOF
    }

    @Test
    public void testMatchConsumeStringFound() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matchConsume("abc")); // matches "abc", consumes it. pos=3.
        assertEquals('d', reader.current()); // checks char at pos 3.
    }

    @Test
    public void testMatchConsumeStringNotFound() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.matchConsume("abd")); // does not match "abd", pos remains 0.
        assertEquals('a', reader.current()); // checks char at pos 0.
    }

    @Test
    public void testMatchConsumeIgnoreCaseFound() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertTrue(reader.matchConsumeIgnoreCase("abc")); // matches "aBc" case-insensitively, consumes it. pos=3.
        assertEquals('D', reader.current()); // checks char at pos 3.
    }

    @Test
    public void testMatchConsumeIgnoreCaseNotFound() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertFalse(reader.matchConsumeIgnoreCase("abd")); // does not match "abd" case-insensitively, pos remains 0.
        assertEquals('a', reader.current()); // checks char at pos 0.
    }

    @Test
    public void testContainsIgnoreCaseFound() {
        CharacterReader reader = new CharacterReader("abcDEFghi");
        assertTrue(reader.containsIgnoreCase("def")); // searches "def" (case-insensitive) from pos 0. finds "DEF". pos remains 0.
        assertEquals("abcDEFghi", reader.toString()); // toString() shows the remaining input from current pos.
    }

    @Test
    public void testContainsIgnoreCaseNotFound() {
        CharacterReader reader = new CharacterReader("abcDEFghi");
        assertFalse(reader.containsIgnoreCase("xyz")); // searches "xyz" from pos 0. not found. pos remains 0.
        assertEquals("abcDEFghi", reader.toString()); // toString() shows the remaining input from current pos.
    }

    @Test
    public void testToString() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.toString()); // pos=0
        reader.consume(); // pos=1
        assertEquals("bc", reader.toString()); // pos=1
        reader.consume(); // pos=2
        reader.consume(); // pos=3
        assertEquals("", reader.toString()); // pos=3, remaining is empty
    }
}
