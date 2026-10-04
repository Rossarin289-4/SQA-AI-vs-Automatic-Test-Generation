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
        byte[] b = "x  17 \0y".getBytes("US-ASCII");
        assertEquals(15L, TarUtils.parseOctal(b, 1, 5));
    }

    @Test
    public void testParseOctalAllNulls() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, 0, 0}, 0, 3));
    }

    @Test
    public void testParseOctalLengthOneRejected() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] {'0'}, 0, 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseOctalInvalidDigitRejected() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] {'8', ' '}, 0, 2);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseOctalOrBinaryOctalBranch() throws Exception {
        assertEquals(8L, TarUtils.parseOctalOrBinary(new byte[] {'1', '0', ' '}, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryPositiveBinary() throws Exception {
        assertEquals(258L, TarUtils.parseOctalOrBinary(new byte[] {(byte) 0x80, 1, 2}, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryNegativeBinary() throws Exception {
        assertEquals(256L, TarUtils.parseOctalOrBinary(new byte[] {(byte) 0xff, 0}, 0, 2));
    }

    @Test
    public void testParseOctalOrBinaryBigIntegerLength() throws Exception {
        assertEquals(1L, TarUtils.parseOctalOrBinary(
                new byte[] {(byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 0, 1}, 0, 10));
    }

    @Test
    public void testParseBooleanReadsSelectedByte() throws Exception {
        assertTrue(TarUtils.parseBoolean(new byte[] {0, 1, 0}, 1));
        assertFalse(TarUtils.parseBoolean(new byte[] {0, 1, 0}, 0));
    }

    @Test
    public void testParseNameStopsAtNullAndHonorsRange() throws Exception {
        assertEquals("ab\u0000z", TarUtils.parseName(new byte[] {'x', 'a', 'b', 0, 'z'}, 1, 4));
    }

    @Test
    public void testParseNameAllNull() throws Exception {
        assertEquals("", TarUtils.parseName(new byte[] {0, 0}, 0, 2));
    }

    @Test
    public void testFormatNamePadsAndReturnsEndOffset() throws Exception {
        byte[] b = new byte[5];
        assertEquals(4, TarUtils.formatNameBytes("ab", b, 1, 3));
        assertArrayEquals(new byte[] {0, 'a', 'b', 0, 0}, b);
    }

    @Test
    public void testFormatNameTruncatesToLength() throws Exception {
        byte[] b = new byte[2];
        assertEquals(2, TarUtils.formatNameBytes("abc", b, 0, 2));
        assertArrayEquals(new byte[] {'a', 'b'}, b);
    }

    @Test
    public void testFormatUnsignedOctalZeroPadding() throws Exception {
        byte[] b = new byte[4];
        TarUtils.formatUnsignedOctalString(0, b, 0, 4);
        assertArrayEquals(new byte[] {'0', '0', '0', '0'}, b);
    }

    @Test
    public void testFormatUnsignedOctalLargestThreeDigits() throws Exception {
        byte[] b = new byte[3];
        TarUtils.formatUnsignedOctalString(511, b, 0, 3);
        assertArrayEquals(new byte[] {'7', '7', '7'}, b);
    }

    @Test
    public void testFormatUnsignedOctalRejectsFirstValueTooLarge() throws Exception {
        try {
            TarUtils.formatUnsignedOctalString(512, new byte[3], 0, 3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFormatOctalBytesAndParseBack() throws Exception {
        byte[] b = new byte[5];
        assertEquals(5, TarUtils.formatOctalBytes(7, b, 0, 5));
        assertArrayEquals(new byte[] {'0', '0', '7', ' ', 0}, b);
        assertEquals(7L, TarUtils.parseOctal(b, 0, b.length));
    }

    @Test
    public void testFormatLongOctalBytesAndParseBack() throws Exception {
        byte[] b = new byte[4];
        assertEquals(4, TarUtils.formatLongOctalBytes(7, b, 0, 4));
        assertArrayEquals(new byte[] {'0', '0', '7', ' '}, b);
        assertEquals(7L, TarUtils.parseOctal(b, 0, b.length));
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesOctalAtLimit() throws Exception {
        byte[] b = new byte[8];
        assertEquals(8, TarUtils.formatLongOctalOrBinaryBytes(2097151, b, 0, 8));
        assertArrayEquals(new byte[] {'0', '7', '7', '7', '7', '7', '7', ' '}, b);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesBinaryAboveOctalLimit() throws Exception {
        byte[] b = new byte[8];
        assertEquals(8, TarUtils.formatLongOctalOrBinaryBytes(2097152, b, 0, 8));
        assertEquals(2097152L, TarUtils.parseOctalOrBinary(b, 0, b.length));
    }

    @Test
    public void testFormatLongOctalOrBinaryNegativeRoundTrip() throws Exception {
        byte[] b = new byte[8];
        assertEquals(8, TarUtils.formatLongOctalOrBinaryBytes(-1, b, 0, 8));
        assertEquals(-1L, TarUtils.parseOctalOrBinary(b, 0, b.length));
    }

    @Test
    public void testFormatCheckSumOctalBytes() throws Exception {
        byte[] b = new byte[5];
        assertEquals(5, TarUtils.formatCheckSumOctalBytes(7, b, 0, 5));
        assertArrayEquals(new byte[] {'0', '0', '7', 0, ' '}, b);
    }

    @Test
    public void testComputeCheckSumUsesUnsignedBytes() throws Exception {
        assertEquals(255L, TarUtils.computeCheckSum(new byte[] {(byte) 0xff}));
    }

    @Test
    public void testVerifyCheckSumAcceptsCorrectUnsignedSum() throws Exception {
        byte[] header = new byte[512];
        TarUtils.formatCheckSumOctalBytes(505, header, 148, 8);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumRejectsUnrelatedStoredValue() throws Exception {
        byte[] header = new byte[512];
        TarUtils.formatCheckSumOctalBytes(1, header, 148, 8);
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumAllowsStoredValueAboveComputedSum() throws Exception {
        byte[] header = new byte[512];
        TarUtils.formatCheckSumOctalBytes(1, header, 148, 8);
        header[0] = 1;
        assertFalse(TarUtils.verifyCheckSum(header));
    }
}
