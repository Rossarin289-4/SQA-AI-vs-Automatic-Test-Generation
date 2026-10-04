package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;

public class CharacterReaderTest {
    @Test
    public void testToStringAtStart() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.toString());
    }

    @Test
    public void testToStringAfterAdvancing() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals("bc", reader.toString());
    }

    @Test
    public void testToStringAfterConsumingAll() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeToEnd());
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringEmptyInput() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringAtLastCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("xy");
        reader.advance();
        assertEquals("y", reader.toString());
    }

    @Test
    public void testToStringAfterConsumingFirstCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("xy");
        assertEquals(Character.valueOf('x'), Character.valueOf(reader.consume()));
        assertEquals("y", reader.toString());
    }

    @Test
    public void testToStringAfterRewind() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        reader.mark();
        reader.advance();
        reader.rewindToMark();
        assertEquals("bc", reader.toString());
    }

    @Test
    public void testToStringAfterUnconsume() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        reader.unconsume();
        assertEquals("abc", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("abc:def");
        assertEquals("abc", reader.consumeTo(':'));
        assertEquals(":def", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToMissingCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo(':'));
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToSequence() throws Exception {
        CharacterReader reader = new CharacterReader("abc--def");
        assertEquals("abc", reader.consumeTo("--"));
        assertEquals("--def", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToMissingSequence() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo("--"));
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToAny() throws Exception {
        CharacterReader reader = new CharacterReader("abc:def");
        assertEquals("abc", reader.consumeToAny(':'));
        assertEquals(":def", reader.toString());
    }

    @Test
    public void testToStringWhenAnyCharacterMatchesAtStart() throws Exception {
        CharacterReader reader = new CharacterReader(":abc");
        assertEquals("", reader.consumeToAny(':'));
        assertEquals(":abc", reader.toString());
    }

    @Test
    public void testToStringAfterLetterSequence() throws Exception {
        CharacterReader reader = new CharacterReader("Ab9!");
        assertEquals("Ab", reader.consumeLetterSequence());
        assertEquals("9!", reader.toString());
    }

    @Test
    public void testToStringAfterHexSequence() throws Exception {
        CharacterReader reader = new CharacterReader("aF09z");
        assertEquals("aF09", reader.consumeHexSequence());
        assertEquals("z", reader.toString());
    }

    @Test
    public void testToStringAfterDigitSequence() throws Exception {
        CharacterReader reader = new CharacterReader("09a");
        assertEquals("09", reader.consumeDigitSequence());
        assertEquals("a", reader.toString());
    }

    @Test
    public void testToStringAfterMatchConsume() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matchConsume("abc"));
        assertEquals("def", reader.toString());
    }

    @Test
    public void testToStringAfterFailedMatchConsume() throws Exception {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.matchConsume("abd"));
        assertEquals("abcdef", reader.toString());
    }

    @Test
    public void testToStringAfterCaseInsensitiveMatchConsume() throws Exception {
        CharacterReader reader = new CharacterReader("AbCdef");
        assertTrue(reader.matchConsumeIgnoreCase("aBc"));
        assertEquals("def", reader.toString());
    }

    @Test
    public void testToStringAfterNewlineNormalization() throws Exception {
        CharacterReader reader = new CharacterReader("a\r\nb\rc");
        assertEquals("a\nb\nc", reader.toString());
    }
}
