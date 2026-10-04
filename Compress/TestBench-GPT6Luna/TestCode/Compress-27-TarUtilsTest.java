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
    public void testParseOctalWithLeadingSpaces() throws Exception {
        assertEquals(83L, TarUtils.parseOctal(new byte[] {' ', '1', '2', '3', ' ', 0}, 0, 6));
    }

    @Test
    public void testParseOctalAllNuls() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, 0}, 0, 2));
    }

    @Test
    public void testParseOctalRejectsLengthOne() throws Exception {
        try { TarUtils.parseOctal(new byte[] {'0'}, 0, 1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseOctalRejectsInvalidDigit() throws Exception {
        try { TarUtils.parseOctal(new byte[] {'8', ' '}, 0, 2); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testParseOctalOrBinaryParsesOctal() throws Exception {
        assertEquals(7L, TarUtils.parseOctalOrBinary(new byte[] {'7', 0}, 0, 2));
    }

    @Test
    public void testParseOctalOrBinaryParsesPositiveBinary() throws Exception {
        assertEquals(258L, TarUtils.parseOctalOrBinary(new byte[] {(byte) 0x80, 1, 2}, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryParsesNegativeBinary() throws Exception {
        assertEquals(-1L, TarUtils.parseOctalOrBinary(new byte[] {(byte) 0xff, (byte) 0xff}, 0, 2));
    }

    @Test
    public void testParseBooleanIsTrueOnlyForOne() throws Exception {
        assertTrue(TarUtils.parseBoolean(new byte[] {1}, 0));
        assertFalse(TarUtils.parseBoolean(new byte[] {0}, 0));
    }

    @Test
    public void testParseNameStopsAtNulAndHonorsOffset() throws Exception {
        assertEquals("ab\u0000z", TarUtils.parseName(new byte[] {'x', 'a', 'b', 0, 'z'}, 1, 4));
    }

    @Test
    public void testParseNameAllNulsIsEmpty() throws Exception {
        assertEquals("", TarUtils.parseName(new byte[] {0, 0}, 0, 2));
    }

    @Test
    public void testFormatNameBytesPadsAndReturnsUpdatedOffset() throws Exception {
        byte[] buffer = new byte[] {9, 9, 9, 9, 9};
        assertEquals(5, TarUtils.formatNameBytes("ab", buffer, 1, 4));
        assertArrayEquals(new byte[] {9, 'a', 'b', 0, 0}, buffer);
    }

    @Test
    public void testFormatNameBytesTruncatesToLength() throws Exception {
        byte[] buffer = new byte[2];
        assertEquals(2, TarUtils.formatNameBytes("abc", buffer, 0, 2));
        assertArrayEquals(new byte[] {'a', 'b'}, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringZeroAtExactLength() throws Exception {
        byte[] buffer = new byte[3];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, 3);
        assertArrayEquals(new byte[] {'0', '0', '0'}, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringValueFitsCapacity() throws Exception {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(7, buffer, 0, 2);
        assertArrayEquals(new byte[] {'0', '7'}, buffer);
    }

    @Test
    public void testFormatOctalBytesValueAndTrailers() throws Exception {
        byte[] buffer = new byte[5];
        assertEquals(5, TarUtils.formatOctalBytes(8, buffer, 0, 5));
        assertArrayEquals(new byte[] {'0', '1', '0', ' ', 0}, buffer);
    }

    @Test
    public void testFormatLongOctalBytesValueAndTrailer() throws Exception {
        byte[] buffer = new byte[4];
        assertEquals(4, TarUtils.formatLongOctalBytes(7, buffer, 0, 4));
        assertArrayEquals(new byte[] {'0', '0', '7', ' '}, buffer);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesOctalAtMaximumSizeValue() throws Exception {
        byte[] buffer = new byte[12];
        assertEquals(12, TarUtils.formatLongOctalOrBinaryBytes(TarConstants.MAXSIZE, buffer, 0, 12));
        assertEquals(' ', buffer[11]);
        assertEquals(TarConstants.MAXSIZE,
                     TarUtils.parseOctalOrBinary(buffer, 0, 12));
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesBinaryAboveOctalLimit() throws Exception {
        byte[] buffer = new byte[12];
        long value = TarConstants.MAXSIZE + 1;
        assertEquals(12, TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, 12));
        assertEquals(value, TarUtils.parseOctalOrBinary(buffer, 0, 12));
    }

    @Test
    public void testFormatLongOctalOrBinaryRoundTripsNegativeValue() throws Exception {
        byte[] buffer = new byte[12];
        assertEquals(12, TarUtils.formatLongOctalOrBinaryBytes(-1, buffer, 0, 12));
        assertEquals(-1L, TarUtils.parseOctalOrBinary(buffer, 0, 12));
    }

    @Test
    public void testFormatCheckSumOctalBytesUsesNulThenSpace() throws Exception {
        byte[] buffer = new byte[5];
        assertEquals(5, TarUtils.formatCheckSumOctalBytes(8, buffer, 0, 5));
        assertArrayEquals(new byte[] {'0', '1', '0', 0, ' '}, buffer);
    }

    @Test
    public void testComputeCheckSumAddsUnsignedBytes() throws Exception {
        assertEquals(256L, TarUtils.computeCheckSum(new byte[] {0, 1, (byte) 0xff}));
    }

    @Test
    public void testVerifyCheckSumAcceptsMatchingUnsignedChecksum() throws Exception {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = ' ';
        }
        long sum = TarUtils.computeCheckSum(header)
                - TarConstants.CHKSUMLEN * ' '
                + TarConstants.CHKSUMLEN * ' ';
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumRejectsStoredChecksumGreaterThanComputed() throws Exception {
        byte[] header = new byte[512];
        assertFalse(TarUtils.verifyCheckSum(header));
    }
}
