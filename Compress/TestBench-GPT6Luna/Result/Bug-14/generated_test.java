package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

public class TarUtilsTest {
    @Test
    public void testParseOctalLeadingAndTrailingSpaces() throws Exception {
        assertEquals(83L, TarUtils.parseOctal(" 123 ".getBytes("US-ASCII"), 0, 5));
    }

    @Test
    public void testParseOctalAllNuls() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, 0, 0}, 0, 3));
    }

    @Test
    public void testParseOctalLeadingNul() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, '7', ' '}, 0, 3));
    }

    @Test
    public void testParseOctalAllowsSecondTrailer() throws Exception {
        assertEquals(7L, TarUtils.parseOctal(new byte[] {'7', ' ', 0}, 0, 3));
    }

    @Test
    public void testParseOctalRejectsLengthBelowTwo() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] {'0'}, 0, 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testParseOctalRejectsEight() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] {'8', ' '}, 0, 2);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testParseOctalOrBinaryParsesOctalForm() throws Exception {
        assertEquals(63L, TarUtils.parseOctalOrBinary(new byte[] {'7', '7', ' '}, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryParsesHighBitForm() throws Exception {
        assertEquals(258L, TarUtils.parseOctalOrBinary(
                new byte[] {(byte) 0x80, 1, 2}, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryParsesMaximumSignedLong() throws Exception {
        assertEquals(Long.MAX_VALUE, TarUtils.parseOctalOrBinary(
                new byte[] {(byte) 0xff, (byte) 0xff, (byte) 0xff,
                            (byte) 0xff, (byte) 0xff, (byte) 0xff,
                            (byte) 0xff, (byte) 0xff}, 0, 8));
    }

    @Test
    public void testParseOctalOrBinaryParsesHighBitFirstByteAndSevenMoreBytes() throws Exception {
        assertEquals(1L << 56, TarUtils.parseOctalOrBinary(
                new byte[] {(byte) 0x81, 0, 0, 0, 0, 0, 0, 0}, 0, 8));
    }

    @Test
    public void testParseBooleanRecognizesOne() throws Exception {
        assertTrue(TarUtils.parseBoolean(new byte[] {1}, 0));
    }

    @Test
    public void testParseBooleanOtherByteIsFalse() throws Exception {
        assertFalse(TarUtils.parseBoolean(new byte[] {2}, 0));
    }

    @Test
    public void testParseNameStopsAtNul() throws Exception {
        assertEquals("ab", TarUtils.parseName(new byte[] {'a', 'b', 0, 'c'}, 0, 4));
    }

    @Test
    public void testParseNamePreservesUnsignedByte() throws Exception {
        assertEquals("\u00ff", TarUtils.parseName(new byte[] {(byte) 0xff}, 0, 1));
    }

    @Test
    public void testFormatNameBytesTruncatesAndPads() throws Exception {
        byte[] buf = new byte[] {9, 9, 9, 9};
        assertEquals(4, TarUtils.formatNameBytes("cat", buf, 1, 3));
        assertArrayEquals(new byte[] {9, 'c', 'a', 't'}, buf);
    }

    @Test
    public void testFormatNameBytesPadsShortName() throws Exception {
        byte[] buf = new byte[] {9, 9, 9, 9};
        assertEquals(3, TarUtils.formatNameBytes("x", buf, 1, 2));
        assertArrayEquals(new byte[] {9, 'x', 0, 9}, buf);
    }

    @Test
    public void testFormatUnsignedOctalStringZeroAndPadding() throws Exception {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0, buf, 0, 4);
        assertArrayEquals(new byte[] {'0', '0', '0', '0'}, buf);
    }

    @Test
    public void testFormatUnsignedOctalStringLargestThreeDigits() throws Exception {
        byte[] buf = new byte[3];
        TarUtils.formatUnsignedOctalString(511, buf, 0, 3);
        assertArrayEquals(new byte[] {'7', '7', '7'}, buf);
    }

    @Test
    public void testFormatUnsignedOctalStringRejectsFirstFourDigitValue() throws Exception {
        try {
            TarUtils.formatUnsignedOctalString(512, new byte[3], 0, 3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testFormatOctalBytesWritesNumberAndTrailers() throws Exception {
        byte[] buf = new byte[5];
        assertEquals(5, TarUtils.formatOctalBytes(7, buf, 0, 5));
        assertArrayEquals(new byte[] {'0', '0', '7', ' ', 0}, buf);
    }

    @Test
    public void testFormatLongOctalBytesWritesTrailingSpace() throws Exception {
        byte[] buf = new byte[4];
        assertEquals(4, TarUtils.formatLongOctalBytes(8, buf, 0, 4));
        assertArrayEquals(new byte[] {'0', '1', '0', ' '}, buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesOctalAtMaximumId() throws Exception {
        byte[] buf = new byte[8];
        assertEquals(8, TarUtils.formatLongOctalOrBinaryBytes(
                TarConstants.MAXID, buf, 0, TarConstants.UIDLEN));
        assertEquals(' ', buf[buf.length - 1]);
        assertEquals('7', buf[0]);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesBinaryAboveMaximumId() throws Exception {
        byte[] buf = new byte[8];
        assertEquals(8, TarUtils.formatLongOctalOrBinaryBytes(
                TarConstants.MAXID + 1, buf, 0, TarConstants.UIDLEN));
        assertEquals((byte) 0x80, (byte) (buf[0] & 0x80));
        assertEquals(TarConstants.MAXID + 1,
                TarUtils.parseOctalOrBinary(buf, 0, buf.length));
    }

    @Test
    public void testFormatCheckSumOctalBytesWritesNullThenSpace() throws Exception {
        byte[] buf = new byte[5];
        assertEquals(5, TarUtils.formatCheckSumOctalBytes(7, buf, 0, 5));
        assertArrayEquals(new byte[] {'0', '0', '7', 0, ' '}, buf);
    }

    @Test
    public void testComputeCheckSumTreatsBytesAsUnsigned() throws Exception {
        assertEquals(256L, TarUtils.computeCheckSum(new byte[] {1, (byte) 0xff}));
    }
}
