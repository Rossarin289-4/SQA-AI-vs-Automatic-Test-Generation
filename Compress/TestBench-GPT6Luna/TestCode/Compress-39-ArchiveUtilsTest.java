package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.apache.commons.compress.archivers.ArchiveEntry;

public class ArchiveUtilsTest {
    @Test
    public void testToAsciiBytesBasicAndNonAscii() throws Exception {
        assertArrayEquals(new byte[] {65, 63, 66}, ArchiveUtils.toAsciiBytes("A\u00e9B"));
    }

    @Test
    public void testToAsciiStringWholeArray() throws Exception {
        assertEquals("A\uFFFD" + "B", ArchiveUtils.toAsciiString(new byte[] {65, (byte) 0xe9, 66}));
    }

    @Test
    public void testToAsciiStringSlice() throws Exception {
        assertEquals("BC", ArchiveUtils.toAsciiString(new byte[] {65, 66, 67, 68}, 1, 2));
    }

    @Test
    public void testAsciiRoundTripForAsciiCharacters() throws Exception {
        assertEquals("short name", ArchiveUtils.toAsciiString(ArchiveUtils.toAsciiBytes("short name")));
    }

    @Test
    public void testMatchAsciiBufferWholeArray() throws Exception {
        assertTrue(ArchiveUtils.matchAsciiBuffer("abc", new byte[] {97, 98, 99}));
    }

    @Test
    public void testMatchAsciiBufferSliceAtArrayEdges() throws Exception {
        assertTrue(ArchiveUtils.matchAsciiBuffer("bc", new byte[] {97, 98, 99}, 1, 2));
    }

    @Test
    public void testMatchAsciiBufferRejectsDifferentContentAndLength() throws Exception {
        assertFalse(ArchiveUtils.matchAsciiBuffer("abc", new byte[] {97, 98, 100}));
        assertFalse(ArchiveUtils.matchAsciiBuffer("abc", new byte[] {97, 98, 99, 0}, 0, 4));
    }

    @Test
    public void testIsEqualWithOffsetsAndExactLength() throws Exception {
        assertTrue(ArchiveUtils.isEqual(new byte[] {9, 1, 2, 8}, 1, 2,
                new byte[] {7, 1, 2, 6}, 1, 2, false));
    }

    @Test
    public void testIsEqualRejectsDifferentLastByte() throws Exception {
        assertFalse(ArchiveUtils.isEqual(new byte[] {1, 2}, 0, 2,
                new byte[] {1, 3}, 0, 2, false));
    }

    @Test
    public void testIsEqualRejectsLengthDifferenceWithoutNullAllowance() throws Exception {
        assertFalse(ArchiveUtils.isEqual(new byte[] {1}, 0, 1,
                new byte[] {1, 0}, 0, 2, false));
    }

    @Test
    public void testIsEqualIgnoresTrailingNullsInEitherBuffer() throws Exception {
        assertTrue(ArchiveUtils.isEqual(new byte[] {1, 0, 0}, 0, 3,
                new byte[] {1}, 0, 1, true));
        assertTrue(ArchiveUtils.isEqual(new byte[] {1}, 0, 1,
                new byte[] {1, 0}, 0, 2, true));
    }

    @Test
    public void testIsEqualDoesNotIgnoreNonNullExtraByte() throws Exception {
        assertFalse(ArchiveUtils.isEqual(new byte[] {1, 2}, 0, 2,
                new byte[] {1}, 0, 1, true));
    }

    @Test
    public void testIsEqualWithNullConvenienceMethod() throws Exception {
        assertTrue(ArchiveUtils.isEqualWithNull(new byte[] {4, 0}, 0, 2,
                new byte[] {4}, 0, 1));
    }

    @Test
    public void testIsArrayZeroAcrossRequestedPrefix() throws Exception {
        assertTrue(ArchiveUtils.isArrayZero(new byte[] {0, 0, 1}, 2));
        assertFalse(ArchiveUtils.isArrayZero(new byte[] {0, 1, 0}, 2));
    }

    @Test
    public void testIsArrayZeroEmptyPrefix() throws Exception {
        assertTrue(ArchiveUtils.isArrayZero(new byte[] {1}, 0));
    }

    @Test
    public void testSanitizeReplacesControlCharacters() throws Exception {
        assertEquals("a?b", ArchiveUtils.sanitize("a\nb"));
    }

    @Test
    public void testSanitizeReplacesSpecialsBlockCharacter() throws Exception {
        assertEquals("?", ArchiveUtils.sanitize("\ufffd"));
    }

    @Test
    public void testSanitizePreservesOrdinaryUnicode() throws Exception {
        assertEquals("\u00e9", ArchiveUtils.sanitize("\u00e9"));
    }

    @Test
    public void testSanitizeAtMaximumLength() throws Exception {
        String input = repeat('x', 255);
        assertEquals(input, ArchiveUtils.sanitize(input));
    }

    @Test
    public void testSanitizeTruncatesAndMarksLongInput() throws Exception {
        String expected = repeat('x', 252) + "...";
        assertEquals(expected, ArchiveUtils.sanitize(repeat('x', 256)));
    }

    private static String repeat(char c, int count) {
        char[] chars = new char[count];
        Arrays.fill(chars, c);
        return new String(chars);
    }
}
