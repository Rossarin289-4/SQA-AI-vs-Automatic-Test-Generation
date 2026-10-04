package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import java.util.Arrays;
import java.util.Locale;

public class CharacterReaderTest {
    @Test
    public void testToStringInitiallyReturnsWholeInput() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.toString());
    }

    @Test
    public void testToStringAfterConsumingCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.consume();
        assertEquals("bc", reader.toString());
    }

    @Test
    public void testToStringAtEndIsEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.consumeToEnd();
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringEmptyInput() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringAtLastCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("ab");
        reader.advance();
        assertEquals("b", reader.toString());
    }

    @Test
    public void testToStringAfterMarkAndRewind() throws Exception {
        CharacterReader reader = new CharacterReader("abcd");
        reader.advance();
        reader.mark();
        reader.advance();
        reader.rewindToMark();
        assertEquals("bcd", reader.toString());
    }

    @Test
    public void testToStringAfterUnconsume() throws Exception {
        CharacterReader reader = new CharacterReader("xy");
        reader.consume();
        reader.unconsume();
        assertEquals("xy", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeAsString() throws Exception {
        CharacterReader reader = new CharacterReader("xyz");
        assertEquals("x", reader.consumeAsString());
        assertEquals("yz", reader.toString());
    }

    @Test
    public void testToStringAfterMatchConsume() throws Exception {
        CharacterReader reader = new CharacterReader("prefix-rest");
        assertTrue(reader.matchConsume("prefix"));
        assertEquals("-rest", reader.toString());
    }

    @Test
    public void testToStringAfterCaseInsensitiveMatchConsume() throws Exception {
        CharacterReader reader = new CharacterReader("Abc!");
        assertTrue(reader.matchConsumeIgnoreCase("aBC"));
        assertEquals("!", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToDelimiter() throws Exception {
        CharacterReader reader = new CharacterReader("left:right");
        assertEquals("left", reader.consumeTo(':'));
        assertEquals(":right", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToSequence() throws Exception {
        CharacterReader reader = new CharacterReader("leftENDright");
        assertEquals("left", reader.consumeTo("END"));
        assertEquals("ENDright", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToAny() throws Exception {
        CharacterReader reader = new CharacterReader("abc,def");
        assertEquals("abc", reader.consumeToAny(','));
        assertEquals(",def", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeData() throws Exception {
        CharacterReader reader = new CharacterReader("body&tail");
        assertEquals("body", reader.consumeData());
        assertEquals("&tail", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeTagName() throws Exception {
        CharacterReader reader = new CharacterReader("div class");
        assertEquals("div", reader.consumeTagName());
        assertEquals(" class", reader.toString());
    }
}
