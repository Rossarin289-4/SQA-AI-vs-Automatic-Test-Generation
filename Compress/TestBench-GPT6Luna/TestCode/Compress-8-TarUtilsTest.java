package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

public class TarUtilsTest {
    @Test
    public void testParseOctalAllNuls() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, 0}, 0, 2));
    }

    @Test
    public void testParseOctalLeadingSpacesAndTrailingSpace() throws Exception {
        assertEquals(10L, TarUtils.parseOctal(new byte[] {' ', '1', '2', ' ', ' '}, 0, 5));
    }

    @Test
    public void testParseOctalTrailingNul() throws Exception {
        assertEquals(8L, TarUtils.parseOctal(new byte[] {'1', '0', 0}, 0, 3));
    }

    @Test
    public void testParseOctalRejectsLengthOne() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] {'0'}, 0, 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseOctalRejectsMissingTrailer() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] {'1', '2'}, 0, 2);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseOctalRejectsInvalidDigit() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] {'8', ' '}, 0, 2);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseNameStopsAtNul() throws Exception {
        assertEquals("ab", TarUtils.parseName(new byte[] {'a', 'b', 0, 'c'}, 0, 4));
    }

    @Test
    public void testParseNameUsesUnsignedByteValue() throws Exception {
        assertEquals("\u00FF", TarUtils.parseName(new byte[] {(byte) 255}, 0, 1));
    }

    @Test
    public void testParseNameHonorsOffsetAndLength() throws Exception {
        assertEquals("bc", TarUtils.parseName(new byte[] {'a', 'b', 'c', 'd'}, 1, 2));
    }

    @Test
    public void testFormatNameBytesPadsWithNuls() throws Exception {
        byte[] result = new byte[5];
        assertEquals(4, TarUtils.formatNameBytes("xy", result, 1, 3));
        assertArrayEquals(new byte[] {0, 'x', 'y', 0, 0}, result);
    }

    @Test
    public void testFormatNameBytesTruncatesAndPreservesOutsideRange() throws Exception {
        byte[] result = new byte[] {'z', 0, 'z'};
        assertEquals(2, TarUtils.formatNameBytes("abcd", result, 1, 1));
        assertArrayEquals(new byte[] {'z', 'a', 'z'}, result);
    }

    @Test
    public void testFormatUnsignedOctalStringZeroAndPadding() throws Exception {
        byte[] result = new byte[4];
        TarUtils.formatUnsignedOctalString(0, result, 0, 4);
        assertArrayEquals(new byte[] {'0', '0', '0', '0'}, result);
    }

    @Test
    public void testFormatUnsignedOctalStringLargestFit() throws Exception {
        byte[] result = new byte[4];
        TarUtils.formatUnsignedOctalString(511, result, 0, 3);
        assertArrayEquals(new byte[] {'7', '7', '7', 0}, result);
    }

    @Test
    public void testFormatUnsignedOctalStringRejectsFirstNonFit() throws Exception {
        byte[] result = new byte[3];
        try {
            TarUtils.formatUnsignedOctalString(512, result, 0, 3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFormatOctalBytesWritesDigitsAndTrailers() throws Exception {
        byte[] result = new byte[6];
        assertEquals(5, TarUtils.formatOctalBytes(8, result, 1, 4));
        assertArrayEquals(new byte[] {0, '1', ' ', 0, 0, 0}, result);
    }

    @Test
    public void testFormatOctalBytesRejectsValueTooLargeForDigitArea() throws Exception {
        try {
            TarUtils.formatOctalBytes(64, new byte[4], 0, 4);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFormatLongOctalBytesWritesTrailingSpace() throws Exception {
        byte[] result = new byte[5];
        assertEquals(5, TarUtils.formatLongOctalBytes(8, result, 0, 5));
        assertArrayEquals(new byte[] {'0', '0', '1', ' ', ' '}, result);
    }

    @Test
    public void testFormatLongOctalBytesFitsLargestValue() throws Exception {
        byte[] result = new byte[4];
        assertEquals(4, TarUtils.formatLongOctalBytes(511, result, 0, 4));
        assertArrayEquals(new byte[] {'7', '7', '7', ' '}, result);
    }

    @Test
    public void testFormatCheckSumOctalBytesWritesNulThenSpace() throws Exception {
        byte[] result = new byte[5];
        assertEquals(5, TarUtils.formatCheckSumOctalBytes(8, result, 0, 5));
        assertArrayEquals(new byte[] {'0', '1', 0, ' ', 0}, result);
    }

    @Test
    public void testFormatCheckSumOctalBytesRejectsNonFit() throws Exception {
        try {
            TarUtils.formatCheckSumOctalBytes(64, new byte[4], 0, 4);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testComputeCheckSumTreatsBytesAsUnsigned() throws Exception {
        assertEquals(258L, TarUtils.computeCheckSum(new byte[] {1, (byte) 255, 2}));
    }

    @Test
    public void testComputeCheckSumEmptyBuffer() throws Exception {
        assertEquals(0L, TarUtils.computeCheckSum(new byte[0]));
    }
}
