package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import java.util.Locale;

public class CharacterReaderTest {
    @Test
    public void testConstructorAndIsEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("test");
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testConstructorAndIsEmptyOnEmptyString() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testCurrentAndConsume() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
        assertEquals('a', reader.consume());
        assertEquals('b', reader.current());
        assertEquals('b', reader.consume());
        assertEquals('c', reader.current());
        assertEquals('c', reader.consume());
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals(CharacterReader.EOF, reader.consume());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToEnd() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeToEnd());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToEndWhenEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeToEnd());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testUnconsume() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.consume();
        reader.unconsume();
        assertEquals('a', reader.current());
        assertEquals('a', reader.consume());
    }

    @Test
    public void testAdvance() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals('b', reader.current());
        reader.advance();
        assertEquals('c', reader.current());
        reader.advance();
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testMarkAndRewindToMark() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consume(); // a
        reader.consume(); // b
        reader.mark();
        reader.consume(); // c
        reader.consume(); // d
        reader.rewindToMark();
        assertEquals('c', reader.current());
        assertEquals("cdef", reader.consumeToEnd());
    }

    @Test
    public void testConsumeAsString() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("a", reader.consumeAsString());
        assertEquals("b", reader.consumeAsString());
        assertEquals("c", reader.consumeAsString());
        // consumeAsString on an empty reader should return the character at the current position, which is EOF
        // after consuming 'c', pos is 3, length is 3, so isEmpty() is true, current() returns EOF.
        assertEquals(String.valueOf(CharacterReader.EOF), reader.consumeAsString());
    }

    @Test
    public void testNextIndexOfChar() throws Exception {
        CharacterReader reader = new CharacterReader("abcdefabc");
        // The first 'c' is at index 2. The current pos is 0. So i - pos = 2 - 0 = 2.
        assertEquals(2, reader.nextIndexOf('c'));
        // After consuming 'a', 'b', 'c', 'd', 'e' (pos = 5), the next 'a' is at index 5. So i - pos = 5 - 5 = 0.
        reader.consumeTo('f'); // consumes 'a' through 'e'. pos is 5.
        assertEquals(0, reader.nextIndexOf('a'));
        // After consuming 'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c' (pos = 9), no 'z' is found.
        reader.consumeToEnd();
        assertEquals(-1, reader.nextIndexOf('z'));
    }

    @Test
    public void testNextIndexOfCharNotFound() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(-1, reader.nextIndexOf('d'));
    }

    @Test
    public void testNextIndexOfSeq() throws Exception {
        CharacterReader reader = new CharacterReader("abcdefabc");
        // The sequence "cde" starts at index 2. Current pos is 0. So offset = 2 - 0 = 2.
        assertEquals(2, reader.nextIndexOf("cde"));
        // After consuming "abcde" (pos = 5), the sequence "abc" starts at index 5. So offset = 5 - 5 = 0.
        reader.consumeTo("f"); // consumes "abcde". pos is 5.
        assertEquals(0, reader.nextIndexOf("abc"));
        // After consuming "abcdefabc" (pos = 9), no "xyz" is found.
        reader.consumeToEnd();
        assertEquals(-1, reader.nextIndexOf("xyz"));
    }

    @Test
    public void testNextIndexOfSeqNotFound() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(-1, reader.nextIndexOf("abcd"));
    }

    @Test
    public void testConsumeToChar() {
        CharacterReader reader = new CharacterReader("abcdefabc");
        // Consume up to 'd'. Consumed "abc". pos becomes 3.
        assertEquals("abc", reader.consumeTo('d'));
        assertEquals('d', reader.current());
        // Consume up to 'z' (not found). Consumes "defabc". pos becomes 9.
        assertEquals("defabc", reader.consumeTo('z'));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToCharNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        // Consume up to 'd' (not found). Consumes "abc". pos becomes 3.
        assertEquals("abc", reader.consumeTo('d'));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToSeq() {
        CharacterReader reader = new CharacterReader("abcdefabc");
        // Consume up to "def". Consumed "abc". pos becomes 3.
        assertEquals("abc", reader.consumeTo("def"));
        assertEquals('d', reader.current());
        // Consume up to "xyz" (not found). Consumes "defabc". pos becomes 9.
        assertEquals("defabc", reader.consumeTo("xyz"));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToSeqNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        // Consume up to "def" (not found). Consumes "abc". pos becomes 3.
        assertEquals("abc", reader.consumeTo("def"));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAnyChar() {
        CharacterReader reader = new CharacterReader("abcdefghi");
        // Consume up to 'd' or 'x'. Consumes "abc". pos becomes 3.
        assertEquals("abc", reader.consumeToAny('d', 'x'));
        assertEquals('d', reader.current());
        // Consume up to 'h' or 'i'. Consumes "efg". pos becomes 6.
        assertEquals("efg", reader.consumeToAny('h', 'i'));
        assertEquals('h', reader.current());
        // Consume up to 'j' (not found). Consumes "hi". pos becomes 8.
        assertEquals("hi", reader.consumeToAny('j'));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAnyCharNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        // Consume up to 'd' or 'e' (not found). Consumes "abc". pos becomes 3.
        assertEquals("abc", reader.consumeToAny('d', 'e'));
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader reader = new CharacterReader("abc123def456");
        // Consumes "abc". pos becomes 3.
        assertEquals("abc", reader.consumeLetterSequence());
        assertEquals('1', reader.current());
        // Consumes "def". pos becomes 6.
        assertEquals("def", reader.consumeLetterSequence());
        assertEquals('4', reader.current());
    }

    @Test
    public void testConsumeLetterSequenceOnlyLetters() {
        CharacterReader reader = new CharacterReader("abcdef");
        // Consumes "abcdef". pos becomes 6.
        assertEquals("abcdef", reader.consumeLetterSequence());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeLetterSequenceEmpty() {
        CharacterReader reader = new CharacterReader("123");
        // No letters, consumes "". pos remains 0.
        assertEquals("", reader.consumeLetterSequence());
        assertEquals('1', reader.current());
    }

    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader reader = new CharacterReader("abc123def456");
        // Consumes "abc123". pos becomes 6.
        assertEquals("abc123", reader.consumeLetterThenDigitSequence());
        assertEquals('d', reader.current());
        // Consumes "def456". pos becomes 12.
        assertEquals("def456", reader.consumeLetterThenDigitSequence());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceOnlyLetters() {
        CharacterReader reader = new CharacterReader("abcdef");
        // Consumes "abcdef". pos becomes 6.
        assertEquals("abcdef", reader.consumeLetterThenDigitSequence());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceOnlyDigits() {
        CharacterReader reader = new CharacterReader("123456");
        // No letters, consumes "123456". pos becomes 6.
        assertEquals("123456", reader.consumeLetterThenDigitSequence());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceEmpty() {
        CharacterReader reader = new CharacterReader("!@#");
        // No letters or digits, consumes "". pos remains 0.
        assertEquals("", reader.consumeLetterThenDigitSequence());
        assertEquals('!', reader.current());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader reader = new CharacterReader("abc123defABCDEF");
        // Consumes "abc123". pos becomes 6.
        assertEquals("abc123", reader.consumeHexSequence());
        assertEquals('d', reader.current());
        // Consumes "ABCDEF". pos becomes 12.
        assertEquals("ABCDEF", reader.consumeHexSequence());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeHexSequenceEmpty() {
        CharacterReader reader = new CharacterReader("ghi");
        // No hex characters, consumes "". pos remains 0.
        assertEquals("", reader.consumeHexSequence());
        assertEquals('g', reader.current());
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader reader = new CharacterReader("abc123def456");
        // No digits at start, consumes "". pos remains 0.
        assertEquals("", reader.consumeDigitSequence());
        assertEquals('a', reader.current());

        reader = new CharacterReader("123abc456");
        // Consumes "123". pos becomes 3.
        assertEquals("123", reader.consumeDigitSequence());
        assertEquals('a', reader.current());
        // No digits after 'a', consumes "". pos remains 3.
        assertEquals("", reader.consumeDigitSequence());
        assertEquals('a', reader.current());
        // Consume to end, finds "456". pos becomes 9.
        reader.consumeTo("end"); // consume "abc"
        assertEquals("456", reader.consumeDigitSequence());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeDigitSequenceEmpty() {
        CharacterReader reader = new CharacterReader("abc");
        // No digits, consumes "". pos remains 0.
        assertEquals("", reader.consumeDigitSequence());
        assertEquals('a', reader.current());
    }

    @Test
    public void testMatchesChar() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
        assertFalse(reader.matches('b'));
        reader.consume(); // consumes 'a', pos is 1
        assertTrue(reader.matches('b'));
    }

    @Test
    public void testMatchesCharEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matches('a'));
    }

    @Test
    public void testMatchesSeq() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matches("abc"));
        assertFalse(reader.matches("abd"));
        reader.consume(); // consumes 'a', pos is 1
        assertFalse(reader.matches("abc"));
        assertTrue(reader.matches("bcd"));
    }

    @Test
    public void testMatchesSeqTooLong() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matches("abcd"));
    }

    @Test
    public void testMatchesSeqEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matches("a"));
    }

    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertTrue(reader.matchesIgnoreCase("abcdef"));
        assertTrue(reader.matchesIgnoreCase("aBc"));
        assertFalse(reader.matchesIgnoreCase("aBd"));
        reader.consume(); // consumes 'a', pos is 1
        assertFalse(reader.matchesIgnoreCase("aBc"));
        assertTrue(reader.matchesIgnoreCase("BcD"));
    }

    @Test
    public void testMatchesIgnoreCaseTooLong() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matchesIgnoreCase("abcd"));
    }

    @Test
    public void testMatchesIgnoreCaseEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesIgnoreCase("a"));
    }

    @Test
    public void testMatchesAnyChar() {
        CharacterReader reader = new CharacterReader("abcdef");
        // At pos 0, current char is 'a'. Matches 'a' or 'x'.
        assertTrue(reader.matchesAny('a', 'x'));
        // Current char is 'a'. Does not match 'b' or 'y'.
        assertFalse(reader.matchesAny('b', 'y'));
        reader.consume(); // consumes 'a', pos is 1. Current char is 'b'.
        // Current char is 'b'. Matches 'b' or 'z'.
        assertTrue(reader.matchesAny('b', 'z'));
    }

    @Test
    public void testMatchesAnyCharEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesLetter() {
        CharacterReader reader = new CharacterReader("a1B2");
        // Current char is 'a'. Matches letter.
        assertTrue(reader.matchesLetter());
        reader.consume(); // consumes 'a', pos is 1. Current char is '1'.
        // Current char is '1'. Does not match letter.
        assertFalse(reader.matchesLetter());
        reader.consume(); // consumes '1', pos is 2. Current char is 'B'.
        // Current char is 'B'. Matches letter.
        assertTrue(reader.matchesLetter());
    }

    @Test
    public void testMatchesLetterEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void testMatchesDigit() {
        CharacterReader reader = new CharacterReader("1a2B");
        // Current char is '1'. Matches digit.
        assertTrue(reader.matchesDigit());
        reader.consume(); // consumes '1', pos is 1. Current char is 'a'.
        // Current char is 'a'. Does not match digit.
        assertFalse(reader.matchesDigit());
        reader.consume(); // consumes 'a', pos is 2. Current char is '2'.
        // Current char is '2'. Matches digit.
        assertTrue(reader.matchesDigit());
    }

    @Test
    public void testMatchesDigitEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchConsume() {
        CharacterReader reader = new CharacterReader("abcdef");
        // Matches "abc", consumes them. pos becomes 3.
        assertTrue(reader.matchConsume("abc"));
        assertEquals('d', reader.current());
        // Does not match "xyz", does not consume. pos remains 3.
        assertFalse(reader.matchConsume("xyz"));
        assertEquals('d', reader.current());
    }

    @Test
    public void testMatchConsumeNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        // Does not match "def", does not consume. pos remains 0.
        assertFalse(reader.matchConsume("def"));
        assertEquals('a', reader.current());
    }

    @Test
    public void testMatchConsumeEmpty() {
        CharacterReader reader = new CharacterReader("abc");
        // An empty sequence does not match anything and does not advance the cursor.
        assertFalse(reader.matchConsume(""));
        assertEquals('a', reader.current());
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        // Matches "abcdef" (case-insensitive), consumes them. pos becomes 6.
        assertTrue(reader.matchConsumeIgnoreCase("abcdef"));
        assertTrue(reader.isEmpty());
        // Reset reader
        reader = new CharacterReader("aBcDeF");
        // Matches "aBc" (case-insensitive), consumes them. pos becomes 3.
        assertTrue(reader.matchConsumeIgnoreCase("aBc"));
        assertEquals('D', reader.current());
        // Does not match "xyz" (case-insensitive), does not consume. pos remains 3.
        assertFalse(reader.matchConsumeIgnoreCase("xyz"));
        assertEquals('D', reader.current());
    }

    @Test
    public void testMatchConsumeIgnoreCaseNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        // Does not match "def" (case-insensitive), does not consume. pos remains 0.
        assertFalse(reader.matchConsumeIgnoreCase("def"));
        assertEquals('a', reader.current());
    }

    @Test
    public void testMatchConsumeIgnoreCaseEmpty() {
        CharacterReader reader = new CharacterReader("abc");
        // An empty sequence does not match anything and does not advance the cursor.
        assertFalse(reader.matchConsumeIgnoreCase(""));
        assertEquals('a', reader.current());
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader("This is a Test");
        // "test" is present case-insensitively. nextIndexOf("test") returns 10.
        assertTrue(reader.containsIgnoreCase("test"));
        // "THIS" is present case-insensitively. nextIndexOf("THIS") returns 0.
        assertTrue(reader.containsIgnoreCase("THIS"));
        // "xyz" is not present case-insensitively. nextIndexOf("xyz") and nextIndexOf("XYZ") return -1.
        assertFalse(reader.containsIgnoreCase("xyz"));
    }

    @Test
    public void testContainsIgnoreCaseNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.containsIgnoreCase("def"));
    }

    @Test
    public void testToString() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.toString());
        reader.consume(); // consumes 'a', pos is 1
        assertEquals("bc", reader.toString());
        reader.consume(); // consumes 'b', pos is 2
        reader.consume(); // consumes 'c', pos is 3
        assertEquals("", reader.toString());
    }
}
