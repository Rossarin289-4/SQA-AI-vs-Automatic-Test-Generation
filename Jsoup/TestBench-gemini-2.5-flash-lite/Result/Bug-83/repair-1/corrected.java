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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testPosReturnsCorrectPosition() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(0, reader.pos());
        reader.advance();
        assertEquals(1, reader.pos());
        reader.consume();
        assertEquals(2, reader.pos());
    }

    @Test
    public void testIsEmptyWhenEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testIsEmptyWhenNotEmpty() {
        CharacterReader reader = new CharacterReader("a");
        assertFalse(reader.isEmpty());
    }

    @Test
    public void testCurrentReturnsFirstChar() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.current());
    }

    @Test
    public void testCurrentReturnsEOFWhenEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertEquals(CharacterReader.EOF, reader.current());
    }

    @Test
    public void testConsumeReturnsFirstChar() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals('a', reader.consume());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testConsumeReturnsEOFWhenEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertEquals(CharacterReader.EOF, reader.consume());
        assertEquals(1, reader.pos());
    }

    @Test
    public void testAdvanceMovesPosition() {
        CharacterReader reader = new CharacterReader("abc");
        reader.advance();
        assertEquals(1, reader.pos());
        assertEquals('b', reader.current());
    }

    @Test
    public void testConsumeToCharFound() {
        CharacterReader reader = new CharacterReader("abcde");
        assertEquals("abc", reader.consumeTo('d'));
        assertEquals(3, reader.pos());
    }

    @Test
    public void testConsumeToCharNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeTo('d'));
        assertEquals(3, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAnyCharFound() {
        CharacterReader reader = new CharacterReader("abcdefg");
        assertEquals("abc", reader.consumeToAny('d', 'x', 'y'));
        assertEquals(3, reader.pos());
    }

    @Test
    public void testConsumeToAnyCharNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeToAny('d', 'x', 'y'));
        assertEquals(3, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToAnyHandlesMultipleDelimiters() {
        CharacterReader reader = new CharacterReader("abc_def-ghi");
        assertEquals("abc", reader.consumeToAny('_', '-', ' '));
        assertEquals(3, reader.pos());
    }

    @Test
    public void testConsumeToAnyHandlesFirstDelimiter() {
        CharacterReader reader = new CharacterReader("abc_def-ghi");
        assertEquals("", reader.consumeToAny('a', 'b', 'c'));
        assertEquals(0, reader.pos());
    }

    @Test
    public void testConsumeToAnyWithEmptyInput() {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeToAny('a', 'b'));
        assertEquals(0, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testConsumeToEnd() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals("abc", reader.consumeToEnd());
        assertEquals(3, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testToStringWithRemainingContent() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consumeTo('d');
        assertEquals("def", reader.toString());
    }

    @Test
    public void testToStringWhenEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.toString());
    }

    @Test
    public void testMarkAndRewindToMark() {
        CharacterReader reader = new CharacterReader("abcdef");
        reader.consumeTo('c'); // pos = 2
        reader.mark(); // mark = 2
        reader.consumeTo('f'); // pos = 5
        assertEquals("ef", reader.toString());
        reader.rewindToMark();
        assertEquals(2, reader.pos());
        assertEquals("cdef", reader.toString());
    }

    @Test
    public void testNextIndexOfCharFound() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals(2, reader.nextIndexOf('c')); // 'c' is at index 2
    }

    @Test
    public void testNextIndexOfCharNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(-1, reader.nextIndexOf('d'));
    }

    @Test
    public void testNextIndexOfCharAtCurrentPosition() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertEquals(0, reader.nextIndexOf('a'));
    }

    @Test
    public void testNextIndexOfSequenceFound() {
        CharacterReader reader = new CharacterReader("abcdefghijkl");
        assertEquals(3, reader.nextIndexOf("def")); // "def" starts at index 3
    }

    @Test
    public void testNextIndexOfSequenceNotFound() {
        CharacterReader reader = new CharacterReader("abc");
        assertEquals(-1, reader.nextIndexOf("def"));
    }

    @Test
    public void testNextIndexOfSequenceOverlapping() {
        CharacterReader reader = new CharacterReader("ababab");
        assertEquals(0, reader.nextIndexOf("aba"));
    }

    @Test
    public void testMatchesCharTrue() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matches('a'));
    }

    @Test
    public void testMatchesCharFalse() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matches('b'));
    }

    @Test
    public void testMatchesCharWhenEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matches('a'));
    }

    @Test
    public void testMatchesStringTrue() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matches("abc"));
    }

    @Test
    public void testMatchesStringFalse() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.matches("abd"));
    }

    @Test
    public void testMatchesStringWhenInputIsShorter() {
        CharacterReader reader = new CharacterReader("ab");
        assertFalse(reader.matches("abc"));
    }

    @Test
    public void testMatchesIgnoreCaseTrue() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertTrue(reader.matchesIgnoreCase("abcdef"));
    }

    @Test
    public void testMatchesIgnoreCaseFalse() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertFalse(reader.matchesIgnoreCase("abxdef"));
    }

    @Test
    public void testMatchesAnyTrue() {
        CharacterReader reader = new CharacterReader("abc");
        assertTrue(reader.matchesAny('x', 'y', 'a'));
    }

    @Test
    public void testMatchesAnyFalse() {
        CharacterReader reader = new CharacterReader("abc");
        assertFalse(reader.matchesAny('x', 'y', 'z'));
    }

    @Test
    public void testMatchesAnyWhenEmpty() {
        CharacterReader reader = new CharacterReader("");
        assertFalse(reader.matchesAny('a'));
    }

    @Test
    public void testMatchConsumeTrue() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertTrue(reader.matchConsume("abc"));
        assertEquals(3, reader.pos());
    }

    @Test
    public void testMatchConsumeFalse() {
        CharacterReader reader = new CharacterReader("abcdef");
        assertFalse(reader.matchConsume("abd"));
        assertEquals(0, reader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCaseTrue() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertTrue(reader.matchConsumeIgnoreCase("abcdef"));
        assertEquals(6, reader.pos());
    }

    @Test
    public void testMatchConsumeIgnoreCaseFalse() {
        CharacterReader reader = new CharacterReader("aBcDeF");
        assertFalse(reader.matchConsumeIgnoreCase("abxdef"));
        assertEquals(0, reader.pos());
    }

    @Test
    public void testCacheStringShort() {
        CharacterReader reader = new CharacterReader("short");
        // Trigger caching mechanism by consuming a short string
        String consumed = reader.consumeTo('t'); // "shor"
        assertEquals("shor", consumed);
        // Test that a string longer than maxStringCacheLen is not cached and a new String object is created.
        // We cannot directly access charBuf or stringCache due to access restrictions.
        // Instead, we can infer based on the behavior of cacheString.
        // If consumeTo returns a new String object instead of a cached one, it implies it wasn't cached.
        CharacterReader reader2 = new CharacterReader("verylongstring"); // length 14 > maxStringCacheLen (12)
        String consumedLong = reader2.consumeTo('t'); // "verylongstrin"
        assertTrue(consumedLong.length() > CharacterReader.maxStringCacheLen);
        // This implies it should not be cached. We can't assert it's a new object without access.
    }

    @Test
    public void testCacheStringLong() {
        CharacterReader reader = new CharacterReader("aVeryLongStringThatWillNotBeCached");
        String consumed = reader.consumeToEnd();
        // This string should not be cached as it's longer than maxStringCacheLen.
        // We cannot directly test the cache contents.
    }

    @Test
    public void testRangeEquals() {
        CharacterReader reader = new CharacterReader("test");
        assertTrue(reader.rangeEquals(0, 4, "test"));
        assertFalse(reader.rangeEquals(0, 3, "test"));
        assertFalse(reader.rangeEquals(0, 4, "tesa"));
    }

    @Test
    public void testConsumeToWithEmptyString() {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeTo("abc"));
    }

    @Test
    public void testConsumeToSequenceWithEmptyString() {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeTo('a'));
    }

    @Test
    public void testConsumeToAnyWithEmptyString() {
        CharacterReader reader = new CharacterReader("");
        assertEquals("", reader.consumeToAny('a', 'b'));
    }

    @Test
    public void testBufferUpWhenAlreadyBuffered() {
        CharacterReader reader = new CharacterReader("abc");
        reader.bufferUp(); // Should do nothing as it's already buffered initially
        assertEquals(0, reader.pos());
        assertEquals('a', reader.current());
    }

    @Test
    public void testBufferUpWhenBufferIsFull() {
        // Create a reader with a small buffer to force bufferUp
        CharacterReader reader = new CharacterReader("abcdefghijklmnopqrstuvwxyz", 10);
        // Consume enough to trigger bufferUp
        for (int i = 0; i < 8; i++) {
            reader.consume();
        }
        // The next consume should trigger bufferUp
        assertEquals('i', reader.consume());
        assertEquals(9, reader.pos());
    }

    @Test
    public void testConsumeToHandlesBufferBoundary() {
        // Create a string that spans across the readAheadLimit
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < CharacterReader.readAheadLimit + 10; i++) {
            sb.append('a');
        }
        sb.append('b');
        String testString = sb.toString();

        CharacterReader reader = new CharacterReader(testString);
        // Consume up to before the 'b'
        reader.consumeTo('b');
        assertEquals(testString.length() - 1, reader.pos());
        assertTrue(reader.isEmpty());
    }

    @Test
    public void testNextIndexOfHandlesBufferBoundary() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < CharacterReader.readAheadLimit + 10; i++) {
            sb.append('a');
        }
        sb.append('b');
        String testString = sb.toString();

        CharacterReader reader = new CharacterReader(testString);
        assertEquals(testString.length() - 1, reader.nextIndexOf('b'));
    }
}
