package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;

public class TarUtilsTest {
    @Test
    public void testParseOctalWithPaddingAndOffset() throws Exception {
        byte[] data = "x  17 \0z".getBytes("US-ASCII");
        assertEquals(15L, TarUtils.parseOctal(data, 1, 6));
    }

    @Test
    public void testParseOctalAllNulsAndLeadingNul() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, 0}, 0, 2));
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, '7'}, 0, 2));
    }

    @Test
    public void testParseOctalRejectsLengthBelowTwo() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] {'0'}, 0, 1);
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
    public void testParseOctalOrBinaryOctalPath() throws Exception {
        assertEquals(63L, TarUtils.parseOctalOrBinary(new byte[] {'7', '7', ' '}, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryPositiveBinaryPath() throws Exception {
        assertEquals(258L, TarUtils.parseOctalOrBinary(new byte[] {(byte) 0x80, 1, 2}, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryNegativeBinaryPath() throws Exception {
        assertEquals(-1L, TarUtils.parseOctalOrBinary(new byte[] {(byte) 0xff, (byte) 0xff}, 0, 2));
    }

    @Test
    public void testParseOctalOrBinaryEightBytePositiveBoundary() throws Exception {
        byte[] data = new byte[8];
        data[0] = (byte) 0x80;
        for (int i = 1; i < data.length; i++) {
            data[i] = (byte) 0xff;
        }
        assertEquals(72057594037927935L, TarUtils.parseOctalOrBinary(data, 0, 8));
    }

    @Test
    public void testParseBooleanUsesFirstByte() throws Exception {
        assertTrue(TarUtils.parseBoolean(new byte[] {1, 0}, 0));
        assertFalse(TarUtils.parseBoolean(new byte[] {0, 1}, 0));
    }

    @Test
    public void testParseNameStopsAtNullAndHonorsSlice() throws Exception {
        assertEquals("ab\0z", TarUtils.parseName(new byte[] {'x', 'a', 'b', 0, 'z'}, 1, 4));
    }

    @Test
    public void testParseNameAllNullsIsEmpty() throws Exception {
        assertEquals("", TarUtils.parseName(new byte[] {0, 0}, 0, 2));
    }

    @Test
    public void testFormatNameBytesTruncatesAndPads() throws Exception {
        byte[] out = new byte[6];
        assertEquals(5, TarUtils.formatNameBytes("hello", out, 1, 4));
        assertArrayEquals(new byte[] {0, 'h', 'e', 'l', 'l', 0}, out);
    }

    @Test
    public void testFormatUnsignedOctalStringZeroAndPadding() throws Exception {
        byte[] out = new byte[5];
        TarUtils.formatUnsignedOctalString(0, out, 1, 3);
        assertArrayEquals(new byte[] {0, '0', '0', '0', 0}, out);
    }

    @Test
    public void testFormatUnsignedOctalStringFitsExactCapacity() throws Exception {
        byte[] out = new byte[3];
        TarUtils.formatUnsignedOctalString(63, out, 0, 3);
        assertArrayEquals(new byte[] {'0', '7', '7'}, out);
    }

    @Test
    public void testFormatUnsignedOctalStringRejectsOneDigitTooLarge() throws Exception {
        byte[] out = new byte[2];
        try {
            TarUtils.formatUnsignedOctalString(64, out, 0, 2);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFormatOctalBytesWritesSpaceAndNul() throws Exception {
        byte[] out = new byte[6];
        assertEquals(5, TarUtils.formatOctalBytes(8, out, 1, 4));
        assertArrayEquals(new byte[] {0, '1', '0', ' ', 0, 0}, out);
    }

    @Test
    public void testFormatLongOctalBytesWritesTrailingSpace() throws Exception {
        byte[] out = new byte[5];
        assertEquals(4, TarUtils.formatLongOctalBytes(7, out, 1, 3));
        assertArrayEquals(new byte[] {0, '0', '7', ' ', 0}, out);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesOctalAtMaximumSize() throws Exception {
        byte[] out = new byte[12];
        assertEquals(12, TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXSIZE, out, 0, 12));
        assertEquals(' ', out[11]);
        assertEquals((byte) '7', out[0]);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesBinaryAboveOctalMaximum() throws Exception {
        byte[] out = new byte[12];
        assertEquals(12, TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXSIZE + 1, out, 0, 12));
        assertEquals((byte) 0x80, out[0]);
        assertEquals(0, out[11]);
    }

    @Test
    public void testFormatLongOctalOrBinaryNegativeValue() throws Exception {
        byte[] out = new byte[12];
        assertEquals(12, TarUtils.formatLongOctalOrBinaryBytes(-1, out, 0, 12));
        assertEquals((byte) 0xff, out[0]);
        assertEquals((byte) 0xff, out[11]);
    }

    @Test
    public void testFormatCheckSumOctalBytesWritesNulThenSpace() throws Exception {
        byte[] out = new byte[6];
        assertEquals(5, TarUtils.formatCheckSumOctalBytes(9, out, 1, 4));
        assertArrayEquals(new byte[] {0, '1', '1', 0, ' ', 0}, out);
    }

    @Test
    public void testComputeCheckSumTreatsBytesAsUnsigned() throws Exception {
        assertEquals(255L, TarUtils.computeCheckSum(new byte[] {(byte) 0xff}));
    }

    @Test
    public void testVerifyCheckSumAcceptsUnsignedSum() throws Exception {
        byte[] header = new byte[512];
        header[0] = 1;
        TarUtils.formatCheckSumOctalBytes(1 + 32L * 8, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }
}
