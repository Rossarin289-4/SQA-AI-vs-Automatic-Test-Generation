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
    public void testIOExceptionConstructorPreservesCause() throws Exception {
        IOException cause = new IOException("problem");
        UncheckedIOException exception = new UncheckedIOException(cause);
        assertSame(cause, exception.ioException());
    }

    @Test
    public void testStringConstructorCreatesIOExceptionCause() throws Exception {
        UncheckedIOException exception = new UncheckedIOException("problem");
        assertEquals("problem", exception.ioException().getMessage());
    }

    @Test
    public void testEmptyStringReaderStartsEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
        assertEquals(0, reader.pos());
        assertEquals("", reader.toString());
    }

    @Test
    public void testCurrentAndPositionAtStart() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
        assertEquals(0, reader.pos());
        assertEquals("abc", reader.toString());
    }

    @Test
    public void testAdvanceMovesOneCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());
        assertEquals("bc", reader.toString());
    }

    @Test
    public void testAdvanceToFinalCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("ab");
        reader.advance();
        assertEquals('b', reader.current());
        reader.advance();
        assertTrue(reader.isEmpty());
        assertEquals(2, reader.pos());
        assertEquals("", reader.toString());
    }

    @Test
    public void testCurrentAtEndIsEof() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals((char) -1, reader.current());
    }

    @Test
    public void testConsumeToDelimiterAtStart() throws Exception {
        CharacterReader reader = new CharacterReader(",tail");
        assertEquals("", reader.consumeTo(','));
        assertEquals(0, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToDelimiterInMiddle() throws Exception {
        CharacterReader reader = new CharacterReader("ab,cd");
        assertEquals("ab", reader.consumeTo(','));
        assertEquals(2, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToDelimiterAtLastPosition() throws Exception {
        CharacterReader reader = new CharacterReader("abc,");
        assertEquals("abc", reader.consumeTo(','));
        assertEquals(3, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToMissingDelimiterConsumesRemainder() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo('x'));
        assertEquals(3, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToOnEmptyInput() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeTo('x'));
        assertEquals(0, reader.pos());
    }

    @Test
    public void testConsumeToAnyMatchesFirstDelimiter() throws Exception {
        CharacterReader reader = new CharacterReader("ab,c;d");
        assertEquals("ab", reader.consumeToAny(',', ';'));
        assertEquals(2, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToAnyStopsAtDelimiterAtCurrentPosition() throws Exception {
        CharacterReader reader = new CharacterReader(";tail");
        assertEquals("", reader.consumeToAny(';', ','));
        assertEquals(0, reader.pos());
        assertEquals(';', reader.current());
    }

    @Test
    public void testConsumeToAnyConsumesToEndWhenNoDelimiter() throws Exception {
        CharacterReader reader = new CharacterReader("abcd");
        assertEquals("abcd", reader.consumeToAny(',', ';'));
        assertEquals(4, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAnyWithNoDelimitersConsumesRemainder() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeToAny());
        assertEquals(3, reader.pos());
    }

    @Test
    public void testConsumeToAnyAfterAdvance() throws Exception {
        CharacterReader reader = new CharacterReader("xabc,y");
        reader.advance();
        assertEquals("abc", reader.consumeToAny(','));
        assertEquals(4, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testToStringTracksRemainingContent() throws Exception {
        CharacterReader reader = new CharacterReader("abcd");
        reader.advance();
        reader.advance();
        assertEquals("cd", reader.toString());
        assertEquals(2, reader.pos());
    }
}
