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
    public void testParseOctalWithPadding() throws Exception {
        assertEquals(83L, TarUtils.parseOctal(" 123  ".getBytes("US-ASCII"), 0, 6));
    }

    @Test
    public void testParseOctalAllNuls() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, 0}, 0, 2));
    }

    @Test
    public void testParseOctalLeadingNul() throws Exception {
        assertEquals(0L, TarUtils.parseOctal(new byte[] {0, '7'}, 0, 2));
    }

    @Test
    public void testParseOctalMinimumLength() throws Exception {
        assertEquals(7L, TarUtils.parseOctal(new byte[] {'7', ' '}, 0, 2));
    }

    @Test
    public void testParseOctalRejectsLengthBelowMinimum() throws Exception {
        try {
            TarUtils.parseOctal(new byte[] {'7'}, 0, 1);
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
    public void testParseOctalOrBinaryParsesOctal() throws Exception {
        assertEquals(63L, TarUtils.parseOctalOrBinary("77 ".getBytes("US-ASCII"), 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryParsesPositiveBinary() throws Exception {
        assertEquals(258L, TarUtils.parseOctalOrBinary(
                new byte[] {(byte) 0x80, 1, 2}, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryParsesNegativeBinary() throws Exception {
        assertEquals(-1L, TarUtils.parseOctalOrBinary(
                new byte[] {(byte) 0xff, (byte) 0xff}, 0, 2));
    }

    @Test
    public void testParseOctalOrBinaryLongBinaryAtEightBytes() throws Exception {
        assertEquals(1L, TarUtils.parseOctalOrBinary(
                new byte[] {(byte) 0x80, 0, 0, 0, 0, 0, 0, 0, 1}, 0, 9));
    }

    @Test
    public void testParseBooleanUsesFirstByte() throws Exception {
        assertTrue(TarUtils.parseBoolean(new byte[] {1, 0}, 0));
        assertFalse(TarUtils.parseBoolean(new byte[] {0, 1}, 0));
    }

    @Test
    public void testParseNameStopsAtNul() throws Exception {
        assertEquals("ab\u0000c", TarUtils.parseName(new byte[] {'a', 'b', 0, 'c'}, 0, 4));
    }

    @Test
    public void testParseNameAllNulsIsEmpty() throws Exception {
        assertEquals("", TarUtils.parseName(new byte[] {0, 0}, 0, 2));
    }

    @Test
    public void testFormatNameBytesTruncatesAndPads() throws Exception {
        byte[] buffer = new byte[6];
        assertEquals(5, TarUtils.formatNameBytes("abcde", buffer, 1, 4));
        assertArrayEquals(new byte[] {0, 'a', 'b', 'c', 'd', 0}, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringPadsZero() throws Exception {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        assertArrayEquals(new byte[] {'0', '0', '0', '0'}, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringMaximumFits() throws Exception {
        byte[] buffer = new byte[3];
        TarUtils.formatUnsignedOctalString(63L, buffer, 0, 3);
        assertArrayEquals(new byte[] {'0', '7', '7'}, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringOverflowThrows() throws Exception {
        try {
            TarUtils.formatUnsignedOctalString(64L, new byte[2], 0, 2);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFormatOctalBytesWritesSpaceAndNul() throws Exception {
        byte[] buffer = new byte[5];
        assertEquals(5, TarUtils.formatOctalBytes(8L, buffer, 0, 5));
        assertArrayEquals(new byte[] {'0', '1', '0', ' ', 0}, buffer);
    }

    @Test
    public void testFormatLongOctalBytesWritesSpace() throws Exception {
        byte[] buffer = new byte[4];
        assertEquals(4, TarUtils.formatLongOctalBytes(8L, buffer, 0, 4));
        assertArrayEquals(new byte[] {'0', '1', '0', ' '}, buffer);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesOctalAtLimit() throws Exception {
        byte[] buffer = new byte[8];
        assertEquals(8, TarUtils.formatLongOctalOrBinaryBytes(2097151L, buffer, 0, 8));
        assertArrayEquals(new byte[] {'7', '7', '7', '7', '7', '7', '7', ' '}, buffer);
    }

    @Test
    public void testFormatLongOctalOrBinaryUsesBinaryAboveOctalLimit() throws Exception {
        byte[] buffer = new byte[8];
        assertEquals(8, TarUtils.formatLongOctalOrBinaryBytes(2097152L, buffer, 0, 8));
        assertEquals((byte) 0x80, buffer[0]);
        assertEquals((byte) 0, buffer[1]);
        assertEquals((byte) 0, buffer[6]);
        assertEquals((byte) 0, buffer[7]);
    }

    @Test
    public void testFormatLongOctalOrBinaryEncodesNegativeValue() throws Exception {
        byte[] buffer = new byte[8];
        assertEquals(8, TarUtils.formatLongOctalOrBinaryBytes(-1L, buffer, 0, 8));
        assertArrayEquals(new byte[] {(byte) 0xff, (byte) 0xff, (byte) 0xff,
                (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}, buffer);
    }

    @Test
    public void testFormatCheckSumOctalBytesUsesNulThenSpace() throws Exception {
        byte[] buffer = new byte[5];
        assertEquals(5, TarUtils.formatCheckSumOctalBytes(8L, buffer, 0, 5));
        assertArrayEquals(new byte[] {'0', '1', '0', 0, ' '}, buffer);
    }

    @Test
    public void testComputeCheckSumTreatsBytesAsUnsigned() throws Exception {
        assertEquals(256L, TarUtils.computeCheckSum(new byte[] {(byte) 0xff, 1}));
    }

    @Test
    public void testVerifyCheckSumAcceptsMatchingUnsignedChecksum() throws Exception {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = 1;
        }
        long sumWithChecksumSpaces = 512L - 8 + 8 * 32;
        String digits = Long.toOctalString(sumWithChecksumSpaces);
        for (int i = 0; i < 6; i++) {
            header[148 + i] = (byte) (i < digits.length()
                    ? digits.charAt(i) : '0');
        }
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumRejectsUnrelatedChecksum() throws Exception {
        byte[] header = new byte[512];
        for (int i = 148; i < 156; i++) {
            header[i] = ' ';
        }
        header[148] = '1';
        assertFalse(TarUtils.verifyCheckSum(header));
    }
}
