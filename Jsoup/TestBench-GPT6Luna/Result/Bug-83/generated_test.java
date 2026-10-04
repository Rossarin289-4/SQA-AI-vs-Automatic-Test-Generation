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
import org.jsoup.nodes.DocumentType;

public class CharacterReaderTest {
    @Test
    public void testInitialPosition() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());
    }

    @Test
    public void testPositionAfterAdvance() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals(1, reader.pos());
    }

    @Test
    public void testEmptyInputStartsEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
        assertEquals(0, reader.pos());
    }

    @Test
    public void testNonemptyInputIsNotEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("x");
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testIsEmptyAtEnd() throws Exception {
        CharacterReader reader = new CharacterReader("x");
        reader.advance();
        assertTrue(reader.isEmpty());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testCurrentAtBeginning() throws Exception {
        CharacterReader reader = new CharacterReader("ab");
        assertEquals('a', reader.current());
        assertEquals(0, reader.pos());
    }

    @Test
    public void testCurrentAfterAdvance() throws Exception {
        CharacterReader reader = new CharacterReader("ab");
        reader.advance();
        assertEquals('b', reader.current());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testCurrentAtEndIsEof() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals((char) -1, reader.current());
    }

    @Test
    public void testAdvanceMovesToLastCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("ab");
        reader.advance();
        assertEquals('b', reader.current());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testAdvancePastEnd() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        reader.advance();
        reader.advance();
        assertTrue(reader.isEmpty());
        assertEquals(2, reader.pos());
    }

    @Test
    public void testConsumeToDelimiterAtStart() throws Exception {
        CharacterReader reader = new CharacterReader(",abc");
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
    public void testConsumeToMissingDelimiterConsumesRemainder() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo('x'));
        assertEquals(3, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToDelimiterAtEnd() throws Exception {
        CharacterReader reader = new CharacterReader("abc,");
        assertEquals("abc", reader.consumeTo(','));
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToAnyFirstDelimiter() throws Exception {
        CharacterReader reader = new CharacterReader("ab,cd;ef");
        assertEquals("ab", reader.consumeToAny(',', ';'));
        assertEquals(',', reader.current());
        assertEquals(2, reader.pos());
    }

    @Test
    public void testConsumeToAnyDelimiterAtStart() throws Exception {
        CharacterReader reader = new CharacterReader(",abc");
        assertEquals("", reader.consumeToAny(','));
        assertEquals(0, reader.pos());
        assertEquals(',', reader.current());
    }

    @Test
    public void testConsumeToAnyNoDelimiterConsumesRemainder() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeToAny(',', ';'));
        assertEquals(3, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAnyEmptyInput() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeToAny(','));
        assertEquals(0, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testToStringReturnsRemainingInput() throws Exception {
        CharacterReader reader = new CharacterReader("abcd");
        reader.advance();
        assertEquals("bcd", reader.toString());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testToStringAtEndIsEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        reader.advance();
        assertEquals("", reader.toString());
        assertEquals(1, reader.pos());
    }
}
