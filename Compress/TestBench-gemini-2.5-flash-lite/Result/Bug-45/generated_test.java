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
    public void testParseOctalBasic() throws Exception {
        byte[] buffer = "123 ".getBytes();
        assertEquals(83L, TarUtils.parseOctal(buffer, 0, 4));
    }

    @Test
    public void testParseOctalLeadingSpaces() throws Exception {
        byte[] buffer = "  456 ".getBytes();
        assertEquals(302L, TarUtils.parseOctal(buffer, 0, 6));
    }

    @Test
    public void testParseOctalTrailingSpacesAndNul() throws Exception {
        byte[] buffer = "789  \0".getBytes();
        assertEquals(505L, TarUtils.parseOctal(buffer, 0, 6));
    }

    @Test
    public void testParseOctalAllNuls() throws Exception {
        byte[] buffer = "\0\0\0\0".getBytes();
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 4));
    }

    @Test
    public void testParseOctalLeadingNul() throws Exception {
        byte[] buffer = "\0123".getBytes();
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidChar() throws Exception {
        byte[] buffer = "12A ".getBytes();
        TarUtils.parseOctal(buffer, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidCharMid() throws Exception {
        byte[] buffer = "1A2 ".getBytes();
        TarUtils.parseOctal(buffer, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalTooShort() throws Exception {
        byte[] buffer = "1".getBytes();
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalOrBinaryBasicOctal() throws Exception {
        byte[] buffer = "123 ".getBytes();
        assertEquals(83L, TarUtils.parseOctalOrBinary(buffer, 0, 4));
    }

    @Test
    public void testParseOctalOrBinaryBasicBinary() throws Exception {
        byte[] buffer = {(byte) 0x80, 0x01, 0x02}; // Represents 258
        assertEquals(258L, TarUtils.parseOctalOrBinary(buffer, 0, 3));
    }

    @Test
    public void testParseOctalOrBinaryNegativeBinary() throws Exception {
        byte[] buffer = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfe}; // -2
        assertEquals(-2L, TarUtils.parseOctalOrBinary(buffer, 0, 8));
    }

    @Test
    public void testParseOctalOrBinaryLargeBinary() throws Exception {
        byte[] buffer = {(byte) 0x80, 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}; // 2^63 - 1
        assertEquals(Long.MAX_VALUE, TarUtils.parseOctalOrBinary(buffer, 0, 9));
    }

    @Test
    public void testParseBooleanTrue() throws Exception {
        byte[] buffer = {1};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() throws Exception {
        byte[] buffer = {0};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseNameBasic() throws Exception {
        byte[] buffer = "test.txt\0".getBytes();
        assertEquals("test.txt", TarUtils.parseName(buffer, 0, 9));
    }

    @Test
    public void testParseNameWithTrailingSpaces() throws Exception {
        byte[] buffer = "test.txt   \0".getBytes();
        assertEquals("test.txt", TarUtils.parseName(buffer, 0, 12));
    }

    @Test
    public void testParseNameEmpty() throws Exception {
        byte[] buffer = "\0".getBytes();
        assertEquals("", TarUtils.parseName(buffer, 0, 1));
    }

    @Test
    public void testParseNameTruncated() throws Exception {
        byte[] buffer = "longname".getBytes(); // No trailing null
        assertEquals("longname", TarUtils.parseName(buffer, 0, 8));
    }

    @Test
    public void testFormatNameBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatNameBytes("test", buf, 0, 10);
        assertArrayEquals("test\0\0\0\0\0".getBytes(), buf);
    }

    @Test
    public void testFormatNameBytesTruncated() throws Exception {
        byte[] buf = new byte[4];
        TarUtils.formatNameBytes("longname", buf, 0, 4);
        assertArrayEquals("long".getBytes(), buf);
    }

    @Test
    public void testFormatNameBytesEmpty() throws Exception {
        byte[] buf = new byte[5];
        TarUtils.formatNameBytes("", buf, 0, 5);
        assertArrayEquals("\0\0\0\0\0".getBytes(), buf);
    }

    @Test
    public void testFormatUnsignedOctalStringBasic() throws Exception {
        byte[] buffer = new byte[10];
        TarUtils.formatUnsignedOctalString(83L, buffer, 0, 10);
        assertArrayEquals("0000000123".getBytes(), buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringZero() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 5);
        assertArrayEquals("00000".getBytes(), buffer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringTooLarge() throws Exception {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(1000L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatOctalBytes(83L, buf, 0, 10);
        assertArrayEquals("000000083 \0".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatLongOctalBytes(83L, buf, 0, 10);
        assertArrayEquals("000000083 ".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        TarUtils.formatLongOctalBytes(0L, buf, 0, 5);
        assertArrayEquals("00000 ".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctalFit() throws Exception {
        byte[] buf = new byte[12]; // Fits in octal
        TarUtils.formatLongOctalOrBinaryBytes(1234567L, buf, 0, 12);
        assertArrayEquals("00023111317 ".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryNegative() throws Exception {
        byte[] buf = new byte[9]; // Too large for octal, fits binary
        TarUtils.formatLongOctalOrBinaryBytes(-1L, buf, 0, 9);
        // Expected: 0xff followed by 8 bytes representing -1 in two's complement (0xffffffffffffffff)
        byte[] expected = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryPositive() throws Exception {
        byte[] buf = new byte[9]; // Too large for octal, fits binary
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, 9);
        // Expected: 0x80 followed by 8 bytes representing Long.MAX_VALUE
        byte[] expected = {(byte)0x80, (byte)0x7f, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatCheckSumOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatCheckSumOctalBytes(505L, buf, 0, 10);
        assertArrayEquals("0000000771\0 ".getBytes(), buf);
    }

    @Test
    public void testComputeCheckSumBasic() throws Exception {
        byte[] buf = "test header".getBytes();
        long sum = 0;
        for (byte b : buf) {
            sum += b & 0xFF;
        }
        assertEquals(sum, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testVerifyCheckSumBasicGoodUnsigned() throws Exception {
        // Create a header with a known unsigned checksum
        byte[] header = new byte[512];
        String name = "testfile";
        System.arraycopy(name.getBytes(), 0, header, 0, name.length());
        // Simulate setting the checksum field
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumBasicGoodSigned() throws Exception {
        // Create a header with a known signed checksum
        byte[] header = new byte[512];
        header[0] = (byte)'\377'; // -1
        long signedSum = 0;
        for (byte b : header) {
            signedSum += b;
        }
        TarUtils.formatCheckSumOctalBytes(signedSum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumBad() throws Exception {
        byte[] header = new byte[512];
        header[0] = 'a';
        TarUtils.formatCheckSumOctalBytes(123L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertFalse(TarUtils.verifyCheckSum(header));
    }
}
