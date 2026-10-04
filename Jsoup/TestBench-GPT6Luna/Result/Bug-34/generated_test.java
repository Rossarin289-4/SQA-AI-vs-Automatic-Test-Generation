package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import java.util.Locale;

public class CharacterReaderTest {
    @Test
    public void testToStringInitiallyReturnsInput() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.toString());
    }

    @Test
    public void testToStringAfterOneCharacterConsumed() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.consume());
        assertEquals("bc", reader.toString());
    }

    @Test
    public void testToStringAfterAdvancingToLastCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        reader.advance();
        assertEquals("c", reader.toString());
    }

    @Test
    public void testToStringAtEndIsEmpty() throws Exception {
        CharacterReader reader = new CharacterReader("abc");
        reader.consumeToEnd();
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringForEmptyInput() throws Exception {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.toString());
    }

    @Test
    public void testToStringAfterRewind() throws Exception {
        CharacterReader reader = new CharacterReader("abcd");
        reader.advance();
        reader.mark();
        reader.advance();
        reader.advance();
        reader.rewindToMark();
        assertEquals("bcd", reader.toString());
    }

    @Test
    public void testToStringAfterConsumingAllButLastCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("xy");
        reader.consume();
        assertEquals("y", reader.toString());
    }

    @Test
    public void testToStringPreservesPunctuationAndSpaces() throws Exception {
        CharacterReader reader = new CharacterReader(" a!");
        assertEquals(" a!", reader.toString());
    }

    @Test
    public void testToStringPreservesNonAsciiCharacter() throws Exception {
        CharacterReader reader = new CharacterReader("éx");
        reader.advance();
        assertEquals("x", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToDelimiter() throws Exception {
        CharacterReader reader = new CharacterReader("ab,cd");
        assertEquals("ab", reader.consumeTo(','));
        assertEquals(",cd", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToSequence() throws Exception {
        CharacterReader reader = new CharacterReader("ab--cd");
        assertEquals("ab", reader.consumeTo("--"));
        assertEquals("--cd", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeToAny() throws Exception {
        CharacterReader reader = new CharacterReader("abc,def");
        assertEquals("abc", reader.consumeToAny(',', ';'));
        assertEquals(",def", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeLetterSequence() throws Exception {
        CharacterReader reader = new CharacterReader("abc1");
        assertEquals("abc", reader.consumeLetterSequence());
        assertEquals("1", reader.toString());
    }

    @Test
    public void testToStringAfterConsumeDigitSequence() throws Exception {
        CharacterReader reader = new CharacterReader("12x");
        assertEquals("12", reader.consumeDigitSequence());
        assertEquals("x", reader.toString());
    }
}
