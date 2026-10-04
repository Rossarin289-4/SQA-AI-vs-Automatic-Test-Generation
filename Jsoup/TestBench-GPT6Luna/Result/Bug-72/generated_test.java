package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

public class CharacterReaderTest {
    @Test
    public void testInitiallyAtStart() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());
        assertFalse(reader.isEmpty());
        assertEquals("abc", reader.toString());
    }

    @Test
    public void testCurrentDoesNotAdvance() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
        assertEquals(0, reader.pos());
        assertEquals('a', reader.current());
    }

    @Test
    public void testAdvanceMovesOneCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());
    }

    @Test
    public void testAdvanceToLastCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        reader.advance();
        assertEquals(2, reader.pos());
        assertEquals('c', reader.current());
    }

    @Test
    public void testAdvancePastEnd() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        reader.advance();
        assertTrue(reader.isEmpty());
        assertEquals(1, reader.pos());
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testEmptyInput() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
        assertEquals(CharacterReader.EOF, reader.current());
        assertEquals("", reader.toString());
    }

    @Test
    public void testConsumeToCharacterFound() throws Exception {
        CharacterReader reader = new CharacterReader("ab,cd");
        assertEquals("ab", reader.consumeTo(','));
        assertEquals(2, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToCharacterAtStart() throws Exception {
        CharacterReader reader = new CharacterReader(",abc");
        assertEquals("", reader.consumeTo(','));
        assertEquals(0, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToCharacterAtLastIndex() throws Exception {
        CharacterReader reader = new CharacterReader("abc,");
        assertEquals("abc", reader.consumeTo(','));
        assertEquals(3, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToAbsentCharacterConsumesEnd() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo('x'));
        assertEquals(3, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToCharacterFromCurrentPosition() throws Exception {
        CharacterReader reader = new CharacterReader("abc,def");
        reader.advance();
        assertEquals("bc", reader.consumeTo(','));
        assertEquals(3, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToAnyStopsAtFirstListedDelimiter() throws Exception {
        CharacterReader reader = new CharacterReader("ab,c;d");
        assertEquals("ab", reader.consumeToAny(',', ';'));
        assertEquals(2, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToAnyStopsAtLaterDelimiter() throws Exception {
        CharacterReader reader = new CharacterReader("ab,c;d");
        assertEquals("ab", reader.consumeToAny(';', ','));
        assertEquals(2, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToAnyDelimiterAtStart() throws Exception {
        CharacterReader reader = new CharacterReader(",abc");
        assertEquals("", reader.consumeToAny(','));
        assertEquals(0, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToAnyWithoutDelimiterConsumesAll() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeToAny(',', ';'));
        assertEquals(3, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAnyOnEmptyInput() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeToAny(','));
        assertEquals(0, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testToStringTracksCurrentPosition() throws Exception {
        CharacterReader reader = new CharacterReader("abcd");
        reader.advance();
        assertEquals("bcd", reader.toString());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testToStringAtEnd() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        reader.advance();
        reader.advance();
        assertEquals("", reader.toString());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToMaximumBufferLengthBoundary() throws Exception {
        StringBuilder input = new StringBuilder();
        for (int i = 0; i < 32768; i++)
            input.append('a');
        input.setCharAt(32767, ',');
        CharacterReader reader = new CharacterReader(input.toString());
        assertEquals(32767, reader.consumeTo(',').length());
        assertEquals(32767, reader.pos());
        assertEquals(',', reader.current());
    }
}
