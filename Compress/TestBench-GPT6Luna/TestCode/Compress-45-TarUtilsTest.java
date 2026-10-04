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
    public void testParseOctalValueAndPadding() throws Exception {
        assertEquals(83L, TarUtils.parseOctal(" 123 ".getBytes("US-ASCII"), 0, 5));
    }

    @Test
    public void testParseOctalAllNuls() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, 0}, 0, 2));
    }

    @Test
    public void testParseOctalLeadingNul() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, '7', ' '}, 0, 3));
    }

    @Test
    public void testParseOctalAcceptsMissingTrailer() throws Exception {
        assertEquals(10L, TarUtils.parseOctal(new byte[] {'1', '2'}, 0, 2));
    }

    @Test
    public void testParseOctalRejectsLengthBelowMinimum() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] {'0'}, 0, 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseOctalOrBinaryOctalBranch() throws Exception {
        assertEquals(9L, TarUtils.parseOctalOrBinary(new byte[] {'1', '1', ' ', 0}, 0, 4));
    }

    @Test
    public void testParseOctalOrBinaryPositiveBinary() throws Exception {
        assertEquals(258L, TarUtils.parseOctalOrBinary(new byte[] {(byte) 0x80, 1, 2}, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryNegativeBinary() throws Exception {
        assertEquals(-1L, TarUtils.parseOctalOrBinary(new byte[] {(byte) 0xff, (byte) 0xff, (byte) 0xff}, 0, 3));
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
        assertEquals("ab\u0000x", TarUtils.parseName(new byte[] {'a', 'b', 0, 'x'}, 0, 4));
    }

    @Test
    public void testParseNameAllNulsIsEmpty() throws Exception {
        assertEquals("", TarUtils.parseName(new byte[] {0, 0}, 0, 2));
    }

    @Test
    public void testFormatNamePadsAndReturnsEndOffset() throws Exception {
        byte[] buf = new byte[6];
        assertEquals(5, TarUtils.formatNameBytes("ab", buf, 1, 4));
        assertArrayEquals(new byte[] {0, 'a', 'b', 0, 0, 0}, buf);
    }

    @Test
    public void testFormatNameTruncatesToLength() throws Exception {
        byte[] buf = new byte[2];
        assertEquals(2, TarUtils.formatNameBytes("abcd", buf, 0, 2));
        assertArrayEquals(new byte[] {'a', 'b'}, buf);
    }

    @Test
    public void testFormatUnsignedOctalStringZero() throws Exception {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0, buf, 0, 4);
        assertArrayEquals(new byte[] {'0', '0', '0', '0'}, buf);
    }

    @Test
    public void testFormatUnsignedOctalStringMaximumFits() throws Exception {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(511, buf, 0, 4);
        assertArrayEquals(new byte[] {'0', '7', '7', '7'}, buf);
    }

    @Test
    public void testFormatUnsignedOctalStringFirstValueTooLarge() throws Exception {
        byte[] buf = new byte[3];
        try {
            TarUtils.formatUnsignedOctalString(512, buf, 0, 3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFormatOctalBytesWritesSpaceAndNul() throws Exception {
        byte[] buf = new byte[5];
        assertEquals(5, TarUtils.formatOctalBytes(8, buf, 0, 5));
        assertArrayEquals(new byte[] {'0', '0', '1', '0', ' ', 0}, new byte[] {buf[0], buf[1], buf[2], buf[3], buf[4], buf[4]});
    }

    @Test
    public void testFormatLongOctalBytesWritesSpace() throws Exception {
        byte[] buf = new byte[4];
        assertEquals(4, TarUtils.formatLongOctalBytes(7, buf, 0, 4));
        assertArrayEquals(new byte[] {'0', '0', '7', ' '}, buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesOctalAtLimit() throws Exception {
        byte[] buf = new byte[8];
        assertEquals(8, TarUtils.formatLongOctalOrBinaryBytes(2097151, buf, 0, 8));
        assertArrayEquals(new byte[] {'7', '7', '7', '7', '7', '7', '7', ' '}, buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesBinaryAboveOctalLimit() throws Exception {
        byte[] buf = new byte[8];
        assertEquals(8, TarUtils.formatLongOctalOrBinaryBytes(2097152, buf, 0, 8));
        assertEquals((byte) 0x80, buf[0]);
        assertArrayEquals(new byte[] {0, 0, 0, 0, 32, 0, 0}, new byte[] {buf[1], buf[2], buf[3], buf[4], buf[5], buf[6], buf[7]});
    }

    @Test
    public void testFormatCheckSumOctalBytesWritesNulAndSpace() throws Exception {
        byte[] buf = new byte[5];
        assertEquals(5, TarUtils.formatCheckSumOctalBytes(8, buf, 0, 5));
        assertArrayEquals(new byte[] {'0', '0', '1', 0, ' '}, buf);
    }

    @Test
    public void testComputeCheckSumUsesUnsignedByteValues() throws Exception {
        assertEquals(256L, TarUtils.computeCheckSum(new byte[] {(byte) 0xff, 1}));
    }

    @Test
    public void testVerifyCheckSumForValidHeader() throws Exception {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN];
        long checksum = header.length * 32L;
        byte[] sum = new byte[TarConstants.CHKSUMLEN];
        TarUtils.formatCheckSumOctalBytes(checksum, sum, 0, sum.length);
        System.arraycopy(sum, 0, header, TarConstants.CHKSUM_OFFSET, sum.length);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumRejectsIncorrectStoredValue() throws Exception {
        byte[] header = new byte[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN];
        header[TarConstants.CHKSUM_OFFSET] = '0';
        header[TarConstants.CHKSUM_OFFSET + 1] = '0';
        header[TarConstants.CHKSUM_OFFSET + 2] = '0';
        header[TarConstants.CHKSUM_OFFSET + 3] = '0';
        header[TarConstants.CHKSUM_OFFSET + 4] = '0';
        header[TarConstants.CHKSUM_OFFSET + 5] = '1';
        assertFalse(TarUtils.verifyCheckSum(header));
    }
}
