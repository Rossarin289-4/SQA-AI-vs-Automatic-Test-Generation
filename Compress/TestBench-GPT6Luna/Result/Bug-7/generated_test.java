package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

public class TarUtilsTest {
    @Test
    public void testParseOctalSkipsLeadingPadding() throws Exception {
        assertEquals(8L, TarUtils.parseOctal(" 0010".getBytes("US-ASCII"), 0, 5));
    }

    @Test
    public void testParseOctalStopsAtNull() throws Exception {
        assertEquals(7L, TarUtils.parseOctal(new byte[] {'7', 0, '1'}, 0, 3));
    }

    @Test
    public void testParseOctalStopsAtTrailingSpace() throws Exception {
        assertEquals(7L, TarUtils.parseOctal("7 1".getBytes("US-ASCII"), 0, 3));
    }

    @Test
    public void testParseOctalZeroPaddingOnly() throws Exception {
        assertEquals(0L, TarUtils.parseOctal("0000".getBytes("US-ASCII"), 0, 4));
    }

    @Test
    public void testParseOctalMaximumThreeDigits() throws Exception {
        assertEquals(511L, TarUtils.parseOctal("777".getBytes("US-ASCII"), 0, 3));
    }

    @Test
    public void testParseOctalRejectsEight() throws Exception {
        try {
            TarUtils.parseOctal("8".getBytes("US-ASCII"), 0, 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseNameStopsAtNull() throws Exception {
        assertEquals("ab", TarUtils.parseName(new byte[] {'a', 'b', 0, 'c'}, 0, 4));
    }

    @Test
    public void testParseNameUnsignedBytes() throws Exception {
        assertEquals(String.valueOf((char) 255), TarUtils.parseName(new byte[] {(byte) 255}, 0, 1));
    }

    @Test
    public void testParseNameHonorsOffsetAndLength() throws Exception {
        assertEquals("bc", TarUtils.parseName("abcd".getBytes("US-ASCII"), 1, 2));
    }

    @Test
    public void testFormatNameBytesPadsAndReturnsEndOffset() throws Exception {
        byte[] buffer = new byte[5];
        assertEquals(4, TarUtils.formatNameBytes("xy", buffer, 1, 3));
        assertArrayEquals(new byte[] {0, 'x', 'y', 0, 0}, buffer);
    }

    @Test
    public void testFormatNameBytesTruncatesAtLength() throws Exception {
        byte[] buffer = new byte[2];
        assertEquals(2, TarUtils.formatNameBytes("abc", buffer, 0, 2));
        assertArrayEquals(new byte[] {'a', 'b'}, buffer);
    }

    @Test
    public void testFormatUnsignedOctalZero() throws Exception {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        assertArrayEquals("0000".getBytes("US-ASCII"), buffer);
    }

    @Test
    public void testFormatUnsignedOctalLargestThreeDigitValue() throws Exception {
        byte[] buffer = new byte[3];
        TarUtils.formatUnsignedOctalString(511L, buffer, 0, 3);
        assertArrayEquals("777".getBytes("US-ASCII"), buffer);
    }

    @Test
    public void testFormatUnsignedOctalRejectsFirstValueTooLarge() throws Exception {
        byte[] buffer = new byte[3];
        try {
            TarUtils.formatUnsignedOctalString(512L, buffer, 0, 3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFormatOctalBytesTrailersAndOffset() throws Exception {
        byte[] buffer = new byte[6];
        assertEquals(5, TarUtils.formatOctalBytes(7L, buffer, 1, 4));
        assertArrayEquals(new byte[] {0, '7', ' ', 0, 0, 0}, buffer);
    }

    @Test
    public void testFormatLongOctalBytesTrailersAndOffset() throws Exception {
        byte[] buffer = new byte[5];
        assertEquals(4, TarUtils.formatLongOctalBytes(8L, buffer, 1, 3));
        assertArrayEquals(new byte[] {0, '1', '0', ' ', 0}, buffer);
    }

    @Test
    public void testFormatCheckSumOctalBytesTrailersAndOffset() throws Exception {
        byte[] buffer = new byte[6];
        assertEquals(5, TarUtils.formatCheckSumOctalBytes(9L, buffer, 1, 4));
        assertArrayEquals(new byte[] {0, '1', '1', 0, ' ', 0}, buffer);
    }

    @Test
    public void testComputeCheckSumTreatsBytesAsUnsigned() throws Exception {
        assertEquals(255L, TarUtils.computeCheckSum(new byte[] {(byte) 255}));
    }

    @Test
    public void testComputeCheckSumSumsAllBytes() throws Exception {
        assertEquals(258L, TarUtils.computeCheckSum(new byte[] {1, 2, (byte) 255}));
    }
}
