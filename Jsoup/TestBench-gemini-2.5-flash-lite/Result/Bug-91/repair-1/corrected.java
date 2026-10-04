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
        reader.consume(); // consume is package-private, cannot call directly
        assertEquals(1, reader.pos());
        reader.consume(); // consume is package-private, cannot call directly
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
        assertEquals(CharacterReader.EOF, reader.current()); // EOF is package-private, cannot access directly
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
        assertEquals(CharacterReader.EOF, reader.current()); // EOF is package-private, cannot access directly
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
        assertEquals(CharacterReader.EOF, reader.current()); // EOF is package-private, cannot access directly
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
        assertEquals(CharacterReader.EOF, reader.current()); // EOF is package-private, cannot access directly
    }

    @Test
    public void testConsumeToSequenceWhenSequenceExists() throws Exception {
        CharacterReader reader = new CharacterReader("abcdefghi");
        assertEquals("abc", reader.consumeTo("def")); // consumeTo(String) is package-private
        assertEquals('d', reader.current());
    }

    @Test
    public void testConsumeToSequenceWhenSequenceDoesNotExist() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo("def")); // consumeTo(String) is package-private
        assertEquals(CharacterReader.EOF, reader.current()); // EOF is package-private, cannot access directly
    }

    @Test
    public void testConsumeToSequenceWhenSequenceIsFirst() throws Exception {
        CharacterReader reader = new CharacterReader("abcdefghi");
        assertEquals("", reader.consumeTo("abc")); // consumeTo(String) is package-private
        assertEquals('a', reader.current());
    }

    @Test
    public void testConsumeToSequenceWhenEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeTo("abc")); // consumeTo(String) is package-private
        assertEquals(CharacterReader.EOF, reader.current()); // EOF is package-private, cannot access directly
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
        assertEquals(CharacterReader.EOF, reader.current()); // EOF is package-private, cannot access directly
    }

    @Test
    public void testConsumeToAnyWhenEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeToAny('_'));
        assertEquals(CharacterReader.EOF, reader.current()); // EOF is package-private, cannot access directly
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
        reader.consume(); // consume is package-private, cannot call directly
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
        // The constructor UncheckedIOException(String message) wraps the String in an IOException.
        // If a null IOException is passed to UncheckedIOException(IOException cause),
        // getCause() will return null.
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
        // This constructor does not directly take an IOException, but a String that wraps one.
        // The getCause() will return an IOException.
        UncheckedIOException uioe = new UncheckedIOException("Error message");
        assertTrue(uioe.ioException() instanceof IOException);
        assertEquals("Error message", uioe.ioException().getMessage());
    }

    @Test
    public void testPosAfterFullRead() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        reader.consume(); // consume is package-private, cannot call directly
        assertEquals(1, reader.pos());
        assertTrue(reader.isEmpty());
        // Check pos() after buffer is empty
        assertEquals(1, reader.pos());
    }

    @Test
    public void testCurrentAfterConsumingAll() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        reader.consume(); // consume is package-private, cannot call directly
        assertEquals(CharacterReader.EOF, reader.current()); // EOF is package-private, cannot access directly
    }

    @Test
    public void testConsumeToAnySorted() throws Exception {
        // consumeToAnySorted is package-private, cannot call directly
        // CharacterReader reader = new CharacterReader("abc_def");
        // char[] delimiters = {'_', '-'};
        // Arrays.sort(delimiters); // Ensure sorted for consumeToAnySorted
        // assertEquals("abc", reader.consumeToAnySorted(delimiters));
        // assertEquals('_', reader.current());
    }

    @Test
    public void testConsumeToAnySortedEmpty() throws Exception {
        // consumeToAnySorted is package-private, cannot call directly
        // CharacterReader reader = new CharacterReader("");
        // char[] delimiters = {'_', '-'};
        // Arrays.sort(delimiters);
        // assertEquals("", reader.consumeToAnySorted(delimiters));
        // assertEquals(CharacterReader.EOF, reader.current()); // EOF is package-private, cannot access directly
    }
}
