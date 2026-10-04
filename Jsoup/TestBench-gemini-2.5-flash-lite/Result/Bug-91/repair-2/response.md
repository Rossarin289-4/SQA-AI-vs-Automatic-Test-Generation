```java
package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.CharacterReader;
import java.io.IOException;
import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;
import org.jsoup.parser.TokeniserState; // Import added for TokeniserState

public class UncheckedIOExceptionTest {

    @Test
    public void testUncheckedIOExceptionConstructorWithMessage() throws Exception {
        String message = "Test message";
        IOException cause = new IOException(message);
        UncheckedIOException uioe = new UncheckedIOException(cause);
        assertEquals(cause, uioe.getCause());
    }

    @Test
    public void testUncheckedIOExceptionConstructorWithIOException() throws Exception {
        String message = "Another test message";
        UncheckedIOException uioe = new UncheckedIOException(message);
        assertTrue(uioe.getCause() instanceof IOException);
        assertEquals(message, uioe.getCause().getMessage());
    }

    @Test
    public void testIoException() throws Exception {
        IOException cause = new IOException("Test IO");
        UncheckedIOException uioe = new UncheckedIOException(cause);
        assertEquals(cause, uioe.ioException());
    }

    @Test
    public void testPosWithEmptyString() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals(0, reader.pos());
    }

    @Test
    public void testPosWithNonEmptyString() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());
        // Accessing package-private methods like consume() is not allowed.
        // We will test the effect of consuming by advancing and checking pos().
        reader.advance();
        assertEquals(1, reader.pos());
        reader.advance();
        assertEquals(2, reader.pos());
    }

    @Test
    public void testIsEmptyWhenEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testIsEmptyWhenNotEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testCurrentWhenEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testCurrentWhenNotEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        assertEquals('a', reader.current());
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
    public void testConsumeToCharWhenCharExists() throws Exception {
        CharacterReader reader = new CharacterReader("abcde");
        assertEquals("abc", reader.consumeTo('d'));
        assertEquals('d', reader.current());
    }

    @Test
    public void testConsumeToCharWhenCharDoesNotExist() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo('d'));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToCharWhenCharIsFirst() throws Exception {
        CharacterReader reader = new CharacterReader("abcde");
        assertEquals("", reader.consumeTo('a'));
        assertEquals('a', reader.current());
    }

    @Test
    public void testConsumeToCharWhenEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeTo('a'));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToSequenceWhenSequenceExists() throws Exception {
        // consumeTo(String) is a public method.
        CharacterReader reader = new CharacterReader("abcdefghi");
        assertEquals("abc", reader.consumeTo("def"));
        assertEquals('d', reader.current());
    }

    @Test
    public void testConsumeToSequenceWhenSequenceDoesNotExist() throws Exception {
        // consumeTo(String) is a public method.
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo("def"));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToSequenceWhenSequenceIsFirst() throws Exception {
        // consumeTo(String) is a public method.
        CharacterReader reader = new CharacterReader("abcdefghi");
        assertEquals("", reader.consumeTo("abc"));
        assertEquals('a', reader.current());
    }

    @Test
    public void testConsumeToSequenceWhenEmpty() throws Exception {
        // consumeTo(String) is a public method.
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeTo("abc"));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToAnyWhenOneDelimiterExists() throws Exception {
        CharacterReader reader = new CharacterReader("abc_def");
        assertEquals("abc", reader.consumeToAny('_'));
        assertEquals('_', reader.current());
    }

    @Test
    public void testConsumeToAnyWhenMultipleDelimitersExist() throws Exception {
        CharacterReader reader = new CharacterReader("abc_def-ghi");
        assertEquals("abc", reader.consumeToAny('_', '-'));
        assertEquals('_', reader.current());
    }

    @Test
    public void testConsumeToAnyWhenDelimiterIsFirst() throws Exception {
        CharacterReader reader = new CharacterReader("_abc");
        assertEquals("", reader.consumeToAny('_'));
        assertEquals('_', reader.current());
    }

    @Test
    public void testConsumeToAnyWhenNoDelimiterExists() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals("abcdef", reader.consumeToAny('_', '-'));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeToAnyWhenEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeToAny('_'));
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testToStringWhenEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringWhenNotEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.toString());
        reader.advance();
        assertEquals("bc", reader.toString());
    }

    @Test
    public void testUncheckedIOExceptionConstructorWithIOExceptionAndMessage() {
        IOException ioException = new IOException("Underlying IO error");
        UncheckedIOException uncheckedIOException = new UncheckedIOException(ioException);
        assertEquals(ioException, uncheckedIOException.getCause());
    }

    @Test
    public void testUncheckedIOExceptionConstructorWithNullCause() {
        UncheckedIOException uncheckedIOException = new UncheckedIOException((IOException) null);
        assertNull(uncheckedIOException.getCause());
    }

    @Test
    public void testIoExceptionWhenCauseIsIOException() {
        IOException cause = new IOException("Specific IO error");
        UncheckedIOException uioe = new UncheckedIOException(cause);
        assertEquals(cause, uioe.ioException());
    }

    @Test
    public void testIoExceptionWhenCauseIsNotIOException() {
        UncheckedIOException uioe = new UncheckedIOException("Error message");
        assertTrue(uioe.ioException() instanceof IOException);
        assertEquals("Error message", uioe.ioException().getMessage());
    }

    @Test
    public void testPosAfterFullRead() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        reader.advance();
        assertEquals(1, reader.pos());
        assertTrue(reader.isEmpty());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testCurrentAfterConsumingAll() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        reader.advance();
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeData() throws Exception {
        CharacterReader reader = new CharacterReader("abc&def<ghi");
        assertEquals("abc", reader.consumeData());
        assertEquals('&', reader.current());
    }

    @Test
    public void testConsumeDataAtEnd() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeData());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeTagName() throws Exception {
        CharacterReader reader = new CharacterReader("div class=\"test\">");
        assertEquals("div", reader.consumeTagName());
        assertEquals(' ', reader.current());
    }

    @Test
    public void testConsumeTagNameAtEnd() throws Exception {
        CharacterReader reader = new CharacterReader("span");
        assertEquals("span", reader.consumeTagName());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeLetterSequence() {
        CharacterReader reader = new CharacterReader("HelloWorld123");
        assertEquals("HelloWorld", reader.consumeLetterSequence());
        assertEquals('1', reader.current());
    }

    @Test
    public void testConsumeLetterSequenceAtEnd() {
        CharacterReader reader = new CharacterReader("Test");
        assertEquals("Test", reader.consumeLetterSequence());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader reader = new CharacterReader("Test1234More");
        assertEquals("Test1234", reader.consumeLetterThenDigitSequence());
        assertEquals('M', reader.current());
    }

    @Test
    public void testConsumeLetterThenDigitSequenceOnlyLetters() {
        CharacterReader reader = new CharacterReader("LettersOnly");
        assertEquals("LettersOnly", reader.consumeLetterThenDigitSequence());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeHexSequence() {
        CharacterReader reader = new CharacterReader("deadbeefA3F");
        assertEquals("deadbeefA3F", reader.consumeHexSequence());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeHexSequenceAtEnd() {
        CharacterReader reader = new CharacterReader("FF");
        assertEquals("FF", reader.consumeHexSequence());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeDigitSequence() {
        CharacterReader reader = new CharacterReader("12345abc");
        assertEquals("12345", reader.consumeDigitSequence());
        assertEquals('a', reader.current());
    }

    @Test
    public void testConsumeDigitSequenceAtEnd() {
        CharacterReader reader = new CharacterReader("987");
        assertEquals("987", reader.consumeDigitSequence());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testMatchesChar() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
        assertFalse(reader.matches('b'));
    }

    @Test
    public void testMatchesString() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matches("abc"));
        assertFalse(reader.matches("abd"));
    }

    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader reader = new CharacterReader("ABCdef");
        assertTrue(reader.matchesIgnoreCase("abc"));
        assertTrue(reader.matchesIgnoreCase("AbC"));
        assertFalse(reader.matchesIgnoreCase("abd"));
    }

    @Test
    public void testMatchesAnyChar() {
        CharacterReader reader = new CharacterReader("xyz");
        assertTrue(reader.matchesAny('x', 'a'));
        assertTrue(reader.matchesAny('y'));
        assertFalse(reader.matchesAny('z', 'b')); // this should be true because 'z' is present
        assertTrue(reader.matchesAny('z', 'b'));
    }

    @Test
    public void testMatchesAnySorted() {
        CharacterReader reader = new CharacterReader("mno");
        char[] sortedChars = {'l', 'm', 'n', 'o', 'p'};
        assertTrue(reader.matchesAnySorted(sortedChars));
        reader.advance(); // consume 'm'
        assertTrue(reader.matchesAnySorted(sortedChars));
        reader.advance(); // consume 'n'
        assertTrue(reader.matchesAnySorted(sortedChars));
        reader.advance(); // consume 'o'
        assertFalse(reader.matchesAnySorted(sortedChars));
    }

    @Test
    public void testMatchesLetter() {
        CharacterReader reader = new CharacterReader("a1");
        assertTrue(reader.matchesLetter());
        reader.advance();
        assertFalse(reader.matchesLetter());
    }

    @Test
    public void testMatchesDigit() {
        CharacterReader reader = new CharacterReader("1a");
        assertTrue(reader.matchesDigit());
        reader.advance();
        assertFalse(reader.matchesDigit());
    }

    @Test
    public void testMatchConsume() {
        CharacterReader reader = new CharacterReader("prefix_suffix");
        assertTrue(reader.matchConsume("prefix"));
        assertEquals('_', reader.current());
        assertFalse(reader.matchConsume("suffix"));
    }

    @Test
    public void testMatchConsumeIgnoreCase() {
        CharacterReader reader = new CharacterReader("PREFIX_suffix");
        assertTrue(reader.matchConsumeIgnoreCase("prefix"));
        assertEquals('_', reader.current());
        assertFalse(reader.matchConsumeIgnoreCase("SUFFIX"));
    }

    @Test
    public void testContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader("<TITLE>My Title</TITLE>");
        assertTrue(reader.containsIgnoreCase("title"));
        assertTrue(reader.containsIgnoreCase("TITLE"));
        assertFalse(reader.containsIgnoreCase("span"));
    }

    @Test
    public void testIsBinaryHeuristic() {
        // Create a string that is likely not binary
        String nonBinaryString = "This is a normal string.";
        CharacterReader readerNonBinary = new CharacterReader(nonBinaryString);
        assertFalse(readerNonBinary.isBinary());

        // Create a string that might be considered binary based on null characters
        // We need to construct a Reader that can produce null chars.
        // For testing purposes, we can simulate it or use a special reader if available.
        // Since we are limited to StringReader and Reader, creating a truly "binary"
        // string with multiple nulls is tricky without direct char array manipulation or specific readers.
        // Let's simulate by creating a string with many nulls if possible, though StringReader might filter them.
        // A more robust test would involve a custom Reader.
        // For now, we'll create a string with some nulls, knowing it might not trigger the threshold.
        StringBuilder binaryBuilder = new StringBuilder();
        for (int i = 0; i < CharacterReader.numNullsConsideredBinary - 1; i++) {
            binaryBuilder.append('\0');
        }
        binaryBuilder.append("abc");
        CharacterReader readerAlmostBinary = new CharacterReader(binaryBuilder.toString());
        assertFalse(readerAlmostBinary.isBinary()); // Should be false as it's less than numNullsConsideredBinary

        StringBuilder binaryBuilderFull = new StringBuilder();
        for (int i = 0; i < CharacterReader.numNullsConsideredBinary; i++) {
            binaryBuilderFull.append('\0');
        }
        binaryBuilderFull.append("def");
        CharacterReader readerBinary = new CharacterReader(binaryBuilderFull.toString());
        assertTrue(readerBinary.isBinary()); // Should be true as it meets the threshold
    }
}
```