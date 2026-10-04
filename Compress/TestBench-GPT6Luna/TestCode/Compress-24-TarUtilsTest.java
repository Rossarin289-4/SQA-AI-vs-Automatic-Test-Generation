package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;

public class TarUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseOctalWithLeadingAndTrailingSpaces() throws Exception {
        assertEquals(83L, TarUtils.parseOctal(" 123 ".getBytes("US-ASCII"), 0, 5));
    }

    @Test
    public void testParseOctalAllNuls() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[3], 0, 3));
    }

    @Test
    public void testParseOctalLeadingNulReturnsZero() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] { 0, '7', ' ' }, 0, 3));
    }

    @Test
    public void testParseOctalRejectsLengthBelowTwo() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] { '0' }, 0, 1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseOctalRejectsInvalidDigit() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] { '8', ' ' }, 0, 2);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseOctalOrBinaryOctalBranch() throws Exception {
        assertEquals(9L, TarUtils.parseOctalOrBinary(new byte[] { '1', '1', ' ' }, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryPositiveBinary() throws Exception {
        assertEquals(258L, TarUtils.parseOctalOrBinary(
                new byte[] { (byte) 0x80, 1, 2 }, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryNegativeBinary() throws Exception {
        assertEquals(-1L, TarUtils.parseOctalOrBinary(
                new byte[] { (byte) 0xff, (byte) 0xff, (byte) 0xff }, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryNineByteValue() throws Exception {
        byte[] field = new byte[9];
        field[0] = (byte) 0x80;
        assertEquals(0L, TarUtils.parseOctalOrBinary(field, 0, field.length));
    }

    @Test
    public void testParseBooleanTrueOnlyForOne() throws Exception {
        assertTrue(TarUtils.parseBoolean(new byte[] { 1 }, 0));
        assertFalse(TarUtils.parseBoolean(new byte[] { 0 }, 0));
    }

    @Test
    public void testParseNameHonorsOffsetAndLength() throws Exception {
        byte[] data = new byte[] { 'x', 'a', 'b', 0, 'z' };
        assertEquals("ab\u0000z", TarUtils.parseName(data, 1, 4));
    }

    @Test
    public void testParseNameAllNulsIsEmpty() throws Exception {
        assertEquals("", TarUtils.parseName(new byte[] { 0, 0 }, 0, 2));
    }

    @Test
    public void testFormatNameBytesTruncatesAndPads() throws Exception {
        byte[] data = new byte[5];
        assertEquals(4, TarUtils.formatNameBytes("abc", data, 1, 3));
        assertArrayEquals(new byte[] { 0, 'a', 'b', 'c', 0 }, data);
    }

    @Test
    public void testFormatUnsignedOctalStringPadsAndWritesZero() throws Exception {
        byte[] data = new byte[4];
        TarUtils.formatUnsignedOctalString(0, data, 0, data.length);
        assertArrayEquals(new byte[] { '0', '0', '0', '0' }, data);
    }

    @Test
    public void testFormatUnsignedOctalStringLargestFit() throws Exception {
        byte[] data = new byte[3];
        TarUtils.formatUnsignedOctalString(511, data, 0, data.length);
        assertArrayEquals(new byte[] { '7', '7', '7' }, data);
    }

    @Test
    public void testFormatUnsignedOctalStringRejectsFirstTooLarge() throws Exception {
        try {
            TarUtils.formatUnsignedOctalString(512, new byte[3], 0, 3);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFormatOctalBytesWritesTrailingSpaceAndNul() throws Exception {
        byte[] data = new byte[5];
        assertEquals(5, TarUtils.formatOctalBytes(8, data, 0, 5));
        assertArrayEquals(new byte[] { '0', '0', '1', '0', ' ', 0 },
                new byte[] { data[0], data[1], data[2], data[3], data[4], 0 });
    }

    @Test
    public void testFormatLongOctalBytesWritesTrailingSpace() throws Exception {
        byte[] data = new byte[4];
        assertEquals(4, TarUtils.formatLongOctalBytes(7, data, 0, 4));
        assertArrayEquals(new byte[] { '0', '0', '7', ' ' }, data);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesOctalForSmallValue() throws Exception {
        byte[] data = new byte[4];
        assertEquals(4, TarUtils.formatLongOctalOrBinaryBytes(7, data, 0, 4));
        assertArrayEquals(new byte[] { '0', '0', '7', ' ' }, data);
    }

    @Test
    public void testFormatLongOctalOrBinaryEncodesNegativeAsBinary() throws Exception {
        byte[] data = new byte[3];
        assertEquals(3, TarUtils.formatLongOctalOrBinaryBytes(-1, data, 0, 3));
        assertArrayEquals(new byte[] { (byte) 0xff, (byte) 0xff, (byte) 0xff }, data);
    }

    @Test
    public void testFormatCheckSumOctalBytesUsesNulThenSpace() throws Exception {
        byte[] data = new byte[5];
        assertEquals(5, TarUtils.formatCheckSumOctalBytes(8, data, 0, 5));
        assertArrayEquals(new byte[] { '0', '0', '1', '0', 0, ' ' },
                new byte[] { data[0], data[1], data[2], data[3], data[4], ' ' });
    }

    @Test
    public void testComputeCheckSumTreatsBytesAsUnsigned() throws Exception {
        assertEquals(256L, TarUtils.computeCheckSum(new byte[] { (byte) 0xff, 1 }));
    }

    @Test
    public void testVerifyCheckSumAcceptsMatchingUnsignedSum() throws Exception {
        byte[] header = new byte[512];
        long sum = 512L - TarConstants.CHKSUMLEN * 32L;
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET,
                TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumRejectsUnmatchedChecksum() throws Exception {
        byte[] header = new byte[512];
        for (int i = TarConstants.CHKSUM_OFFSET;
             i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN; i++) {
            header[i] = '0';
        }
        assertFalse(TarUtils.verifyCheckSum(header));
    }
}
