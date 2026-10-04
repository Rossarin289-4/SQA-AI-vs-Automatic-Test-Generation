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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testPos() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        assertEquals(0, cr.pos());
        cr.advance();
        assertEquals(1, cr.pos());
    }

    @Test
    public void testIsEmpty() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        assertFalse(cr.isEmpty());
        cr.consume();
        cr.consume();
        cr.consume();
        assertTrue(cr.isEmpty());
    }

    @Test
    public void testCurrent() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        assertEquals('a', cr.current());
        cr.advance();
        assertEquals('b', cr.current());
        cr.advance();
        assertEquals('c', cr.current());
        cr.advance();
        assertEquals(CharacterReader.EOF, cr.current()); // Corrected: Use CharacterReader.EOF
    }

    @Test
    public void testAdvance() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        cr.advance();
        assertEquals(1, cr.pos());
        cr.advance();
        assertEquals(2, cr.pos());
    }

    @Test
    public void testConsumeToChar() throws Exception {
        CharacterReader cr = new CharacterReader("abcde");
        assertEquals("abc", cr.consumeTo('d'));
        assertEquals(3, cr.pos());
        assertEquals('d', cr.current());
    }

    @Test
    public void testConsumeToCharNotFound() throws Exception {
        CharacterReader cr = new CharacterReader("abcde");
        assertEquals("abcde", cr.consumeTo('z'));
        assertEquals(5, cr.pos());
        assertTrue(cr.isEmpty());
    }

    @Test
    public void testConsumeToCharEmpty() throws Exception {
        CharacterReader cr = new CharacterReader("");
        assertEquals("", cr.consumeTo('a'));
        assertTrue(cr.isEmpty());
    }

    @Test
    public void testConsumeToAny() throws Exception {
        CharacterReader cr = new CharacterReader("abcdefg");
        assertEquals("abc", cr.consumeToAny('d', 'x', 'y'));
        assertEquals(3, cr.pos());
        assertEquals('d', cr.current());
    }

    @Test
    public void testConsumeToAnyNotFound() throws Exception {
        CharacterReader cr = new CharacterReader("abcdefg");
        assertEquals("abcdefg", cr.consumeToAny('x', 'y', 'z'));
        assertEquals(7, cr.pos());
        assertTrue(cr.isEmpty());
    }

    @Test
    public void testConsumeToAnyEmpty() throws Exception {
        CharacterReader cr = new CharacterReader("");
        assertEquals("", cr.consumeToAny('a', 'b'));
        assertTrue(cr.isEmpty());
    }

    @Test
    public void testConsumeToAnyWithEmptyDelimiters() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        assertEquals("abc", cr.consumeToAny());
        assertEquals(3, cr.pos());
        assertTrue(cr.isEmpty());
    }

    @Test
    public void testToString() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        assertEquals("abc", cr.toString());
        cr.advance();
        assertEquals("bc", cr.toString());
        cr.advance();
        cr.advance();
        assertEquals("", cr.toString());
    }

    @Test
    public void testConsumeToCharAtBeginning() throws Exception {
        CharacterReader cr = new CharacterReader("abcdef");
        assertEquals("", cr.consumeTo('a'));
        assertEquals(0, cr.pos());
        assertEquals('a', cr.current());
    }

    @Test
    public void testConsumeToCharAtEnd() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        assertEquals("ab", cr.consumeTo('c')); // Fixed: consumeTo does not consume the delimiter
        assertEquals(2, cr.pos());
        assertEquals('c', cr.current());
    }

    @Test
    public void testConsumeToAnyAtBeginning() throws Exception {
        CharacterReader cr = new CharacterReader("abcdef");
        assertEquals("", cr.consumeToAny('a', 'b'));
        assertEquals(0, cr.pos());
        assertEquals('a', cr.current());
    }

    @Test
    public void testConsumeToAnyAtEnd() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        assertEquals("ab", cr.consumeToAny('c', 'd')); // Fixed: consumeToAny does not consume the delimiter
        assertEquals(2, cr.pos());
        assertEquals('c', cr.current());
    }

    @Test
    public void testConsumeToAnySingleDelimiterAtEnd() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        assertEquals("ab", cr.consumeToAny('c')); // Fixed: consumeToAny does not consume the delimiter
        assertEquals(2, cr.pos());
        assertEquals('c', cr.current());
    }

    @Test
    public void testConsumeToAnyWithMultipleDelimitersAtStart() throws Exception {
        CharacterReader cr = new CharacterReader("abcdef");
        assertEquals("", cr.consumeToAny('a', 'b', 'c'));
        assertEquals(0, cr.pos());
        assertEquals('a', cr.current());
    }

    @Test
    public void testToStringEmpty() throws Exception {
        CharacterReader cr = new CharacterReader("");
        assertEquals("", cr.toString());
    }

    @Test
    public void testPosWhenEmpty() throws Exception {
        CharacterReader cr = new CharacterReader("");
        assertEquals(0, cr.pos());
        cr.advance(); // advancing on empty reader should not change pos
        assertEquals(0, cr.pos());
    }
    
    @Test
    public void testConsumeToCharRepeatedDelimiter() throws Exception {
        CharacterReader cr = new CharacterReader("abcdcde");
        assertEquals("abcd", cr.consumeTo('d'));
        assertEquals(4, cr.pos());
        assertEquals('d', cr.current());
    }

    @Test
    public void testConsumeToAnyRepeatedDelimiter() throws Exception {
        CharacterReader cr = new CharacterReader("abcdcde");
        assertEquals("abcd", cr.consumeToAny('d', 'x'));
        assertEquals(4, cr.pos());
        assertEquals('d', cr.current());
    }
    
    @Test
    public void testConsumeToCharWithEmptyString() throws Exception {
        CharacterReader cr = new CharacterReader("");
        assertEquals("", cr.consumeTo('a'));
        assertTrue(cr.isEmpty());
    }

    @Test
    public void testConsumeToAnyWithEmptyString() throws Exception {
        CharacterReader cr = new CharacterReader("");
        assertEquals("", cr.consumeToAny('a', 'b'));
        assertTrue(cr.isEmpty());
    }

    @Test
    public void testConsumeToCharWithDelimiterAsFirstChar() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        assertEquals("", cr.consumeTo('a'));
        assertEquals(0, cr.pos());
        assertEquals('a', cr.current());
    }

    @Test
    public void testConsumeToAnyWithDelimiterAsFirstChar() throws Exception {
        CharacterReader cr = new CharacterReader("abc");
        assertEquals("", cr.consumeToAny('a', 'b'));
        assertEquals(0, cr.pos());
        assertEquals('a', cr.current());
    }

    @Test
    public void testToStringAfterConsume() throws Exception {
        CharacterReader cr = new CharacterReader("abcdef");
        cr.consumeTo('d');
        assertEquals("def", cr.toString());
    }

    @Test
    public void testToStringAfterConsumeToAny() throws Exception {
        CharacterReader cr = new CharacterReader("abcdef");
        cr.consumeToAny('d', 'x');
        assertEquals("def", cr.toString());
    }

    @Test
    public void testConsumeToCharWhenBufferNeedsToWrap() throws Exception {
        // Create a string that is longer than readAheadLimit but shorter than maxBufferLen
        // This forces a buffer wrap around when consuming.
        StringBuilder sb = new StringBuilder(CharacterReader.maxBufferLen);
        for (int i = 0; i < CharacterReader.maxBufferLen - 100; i++) {
            sb.append('a');
        }
        sb.append("xyz"); // the part to consume
        sb.append("def"); // after the delimiter
        String longString = sb.toString();
        CharacterReader cr = new CharacterReader(longString);
        cr.consumeTo('x'); // advance past most of the 'a's
        cr.advance(); // advance to 'x'
        cr.advance(); // advance to 'y'
        cr.advance(); // advance to 'z'
        assertEquals("xyz", cr.consumeTo('d'));
        assertEquals(longString.length() - 3, cr.pos());
        assertEquals('d', cr.current());
    }

    @Test
    public void testConsumeToAnyWhenBufferNeedsToWrap() throws Exception {
        StringBuilder sb = new StringBuilder(CharacterReader.maxBufferLen);
        for (int i = 0; i < CharacterReader.maxBufferLen - 100; i++) {
            sb.append('a');
        }
        sb.append("xyz"); // the part to consume
        sb.append("def"); // after the delimiter
        String longString = sb.toString();
        CharacterReader cr = new CharacterReader(longString);
        cr.consumeToAny('x', 'z'); // advance past most of the 'a's
        cr.advance(); // advance to 'x'
        cr.advance(); // advance to 'y'
        cr.advance(); // advance to 'z'
        assertEquals("xyz", cr.consumeToAny('d', 'e'));
        assertEquals(longString.length() - 3, cr.pos());
        assertEquals('d', cr.current());
    }
}
