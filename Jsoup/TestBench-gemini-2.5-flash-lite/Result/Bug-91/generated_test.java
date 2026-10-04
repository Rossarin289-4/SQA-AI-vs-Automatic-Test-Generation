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
    public void testCurrentWhenNotEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        assertEquals('a', reader.current());
    }


    @Test
    public void testConsumeToCharWhenCharExists() throws Exception {
        CharacterReader reader = new CharacterReader("abcde");
        assertEquals("abc", reader.consumeTo('d'));
        assertEquals('d', reader.current());
    }


    @Test
    public void testConsumeToCharWhenCharIsFirst() throws Exception {
        CharacterReader reader = new CharacterReader("abcde");
        assertEquals("", reader.consumeTo('a'));
        assertEquals('a', reader.current());
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
























}



