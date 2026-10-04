package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import java.util.ArrayList;
import java.util.List;

public class CharacterReaderTest {
    @Test
    public void testToStringReturnsEntireInputInitially() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.toString());
    }

    @Test
    public void testToStringReturnsRemainingInputAfterAdvance() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals("bc", reader.toString());
    }

    @Test
    public void testToStringReturnsEmptyAtEnd() throws Exception {
        CharacterReader reader = new CharacterReader("a");
        reader.advance();
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringPreservesNewline() throws Exception {
        CharacterReader reader = new CharacterReader("a\nb");
        reader.advance();
        assertEquals("\nb", reader.toString());
    }

    @Test
    public void testToStringNormalizesCarriageReturn() throws Exception {
        CharacterReader reader = new CharacterReader("a\rb");
        assertEquals("a\nb", reader.toString());
    }

    @Test
    public void testToStringNormalizesCarriageReturnLineFeed() throws Exception {
        CharacterReader reader = new CharacterReader("a\r\nb");
        assertEquals("a\nb", reader.toString());
    }

    @Test
    public void testToStringNormalizesSeveralCarriageReturns() throws Exception {
        CharacterReader reader = new CharacterReader("\r\r\n");
        assertEquals("\n\n", reader.toString());
    }

    @Test
    public void testToStringIncludesNullCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("a\u0000b");
        assertEquals("a\u0000b", reader.toString());
    }

    @Test
    public void testToStringAfterConsumingPrefix() throws Exception {
        CharacterReader reader = new CharacterReader("one two");
        reader.consumeTo(' ');
        assertEquals(" two", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToMissingCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.consumeTo('x');
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringAfterMatchingEmptyString() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.consumeTo("");
        assertEquals("abc", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToEnd() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeToEnd());
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringAfterRewindToMark() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.advance();
        reader.advance();
        reader.mark();
        reader.advance();
        reader.advance();
        reader.rewindToMark();
        assertEquals("cdef", reader.toString());
    }

    @Test
    public void testToStringAfterUnconsume() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        reader.advance();
        reader.unconsume();
        assertEquals("bc", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeAsString() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("", reader.consumeAsString());
        assertEquals("bc", reader.toString());
    }

    @Test
    public void testToStringAtPositionAfterConsumingToAny() throws Exception {
        CharacterReader reader = new CharacterReader("abc:def");
        assertEquals("abc", reader.consumeToAny(':'));
        assertEquals(":def", reader.toString());
    }
}
