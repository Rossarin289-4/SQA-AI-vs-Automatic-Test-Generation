package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;

public class TarUtilsTest {
    /**
     * Test for {@link TarUtils#parseOctal(byte[], int, int)} with valid octal strings.
     */
    @Test
    public void testParseOctal_valid() throws Exception {
        byte[] buffer = "012345 ".getBytes();
        assertEquals(8385, TarUtils.parseOctal(buffer, 0, 7));
        assertEquals(8385, TarUtils.parseOctal(buffer, 0, 8)); // With trailing NUL
        assertEquals(8385, TarUtils.parseOctal(buffer, 0, 9)); // With trailing space and NUL
    }

    /**
     * Test for {@link TarUtils#parseOctal(byte[], int, int)} with leading spaces.
     */
    @Test
    public void testParseOctal_leadingSpaces() throws Exception {
        byte[] buffer = "  0123 ".getBytes();
        assertEquals(83, TarUtils.parseOctal(buffer, 0, 6));
    }

    /**
     * Test for {@link TarUtils#parseOctal(byte[], int, int)} with all zeros.
     */
    @Test
    public void testParseOctal_allZeros() throws Exception {
        byte[] buffer = new byte[10];
        for(int i=0; i<buffer.length; i++){
            buffer[i] = 0;
        }
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    /**
     * Test for {@link TarUtils#parseOctal(byte[], int, int)} with a leading NUL.
     */
    @Test
    public void testParseOctal_leadingNul() throws Exception {
        byte[] buffer = new byte[10];
        buffer[0] = 0;
        buffer[1] = '1';
        buffer[2] = '2';
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 3));
    }

    /**
     * Test for {@link TarUtils#parseOctal(byte[], int, int)} with a missing trailing space/NUL.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_missingTrailer() throws Exception {
        byte[] buffer = "012345".getBytes();
        TarUtils.parseOctal(buffer, 0, 6);
    }

    /**
     * Test for {@link TarUtils#parseOctal(byte[], int, int)} with invalid byte.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByte() throws Exception {
        byte[] buffer = "01238 ".getBytes();
        TarUtils.parseOctal(buffer, 0, 6);
    }

    /**
     * Test for {@link TarUtils#parseOctal(byte[], int, int)} with minimum length.
     */
    @Test
    public void testParseOctal_minLength() throws Exception {
        byte[] buffer = " 0".getBytes();
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, 2));
    }

    /**
     * Test for {@link TarUtils#parseOctal(byte[], int, int)} with minimum length and no space.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_minLengthNoSpace() throws Exception {
        byte[] buffer = "0".getBytes();
        TarUtils.parseOctal(buffer, 0, 1);
    }

    /**
     * Test for {@link TarUtils#parseOctalOrBinary(byte[], int, int)} with octal number.
     */
    @Test
    public void testParseOctalOrBinary_octal() throws Exception {
        byte[] buffer = "012345 ".getBytes();
        assertEquals(8385L, TarUtils.parseOctalOrBinary(buffer, 0, 7));
    }

    /**
     * Test for {@link TarUtils#parseOctalOrBinary(byte[], int, int)} with binary number.
     */
    @Test
    public void testParseOctalOrBinary_binary() throws Exception {
        byte[] buffer = new byte[8];
        buffer[0] = (byte) 0x80; // Start of binary
        buffer[1] = 0x01;
        buffer[2] = 0x02;
        assertEquals(258L, TarUtils.parseOctalOrBinary(buffer, 0, 3));
    }

    /**
     * Test for {@link TarUtils#parseOctalOrBinary(byte[], int, int)} with negative binary number.
     */
    @Test
    public void testParseOctalOrBinary_negativeBinary() throws Exception {
        byte[] buffer = new byte[8];
        buffer[0] = (byte) 0xff; // Start of negative binary
        buffer[1] = 0x01;
        buffer[2] = 0x02;
        // - (0x0102 - 1) = -257
        assertEquals(-257L, TarUtils.parseOctalOrBinary(buffer, 0, 3));
    }

    /**
     * Test for {@link TarUtils#parseOctalOrBinary(byte[], int, int)} with binary number exceeding long max.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_binaryExceedsLong() throws Exception {
        byte[] buffer = new byte[10];
        buffer[0] = (byte) 0x80;
        for (int i = 1; i < 9; i++) { // 8 bytes + 1 byte for sign
            buffer[i] = (byte) 0xff;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, 9);
    }

    /**
     * Test for {@link TarUtils#parseBoolean(byte[], int)} with true.
     */
    @Test
    public void testParseBoolean_true() throws Exception {
        byte[] buffer = {1, ' ', ' '};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    /**
     * Test for {@link TarUtils#parseBoolean(byte[], int)} with false.
     */
    @Test
    public void testParseBoolean_false() throws Exception {
        byte[] buffer = {0, ' ', ' '};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    /**
     * Test for {@link TarUtils#parseName(byte[], int, int)} with default encoding and trailing NULs.
     */
    @Test
    public void testParseName_defaultEncodingTrailingNuls() throws Exception {
        byte[] buffer = "testName".getBytes();
        byte[] paddedBuffer = new byte[10];
        System.arraycopy(buffer, 0, paddedBuffer, 0, buffer.length);
        assertEquals("testName", TarUtils.parseName(paddedBuffer, 0, 10));
    }

    /**
     * Test for {@link TarUtils#parseName(byte[], int, int)} with default encoding and no trailing NULs.
     */
    @Test
    public void testParseName_defaultEncodingNoTrailingNuls() throws Exception {
        byte[] buffer = "testName".getBytes();
        assertEquals("testName", TarUtils.parseName(buffer, 0, buffer.length));
    }

    /**
     * Test for {@link TarUtils#parseName(byte[], int, int)} with empty name.
     */
    @Test
    public void testParseName_emptyName() throws Exception {
        byte[] buffer = new byte[10];
        assertEquals("", TarUtils.parseName(buffer, 0, 10));
    }

    /**
     * Test for {@link TarUtils#formatNameBytes(String, byte[], int, int)} with truncation.
     */
    @Test
    public void testFormatNameBytes_truncation() throws Exception {
        String name = "very long name";
        byte[] buf = new byte[5];
        int offset = 0;
        int length = 5;
        int expectedOffset = offset + length;
        int actualOffset = TarUtils.formatNameBytes(name, buf, offset, length);
        assertEquals(expectedOffset, actualOffset);
        assertArrayEquals("very ".getBytes(), buf);
    }

    /**
     * Test for {@link TarUtils#formatNameBytes(String, byte[], int, int)} with padding.
     */
    @Test
    public void testFormatNameBytes_padding() throws Exception {
        String name = "short";
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 10;
        int expectedOffset = offset + length;
        int actualOffset = TarUtils.formatNameBytes(name, buf, offset, length);
        assertEquals(expectedOffset, actualOffset);
        byte[] expected = "short\0\0\0\0\0".getBytes();
        assertArrayEquals(expected, buf);
    }

    /**
     * Test for {@link TarUtils#formatUnsignedOctalString(long, byte[], int, int)} with zero.
     */
    @Test
    public void testFormatUnsignedOctalString_zero() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, 5);
        assertArrayEquals(new byte[]{'0', '0', '0', '0', '0'}, buffer);
    }

    /**
     * Test for {@link TarUtils#formatUnsignedOctalString(long, byte[], int, int)} with a value.
     */
    @Test
    public void testFormatUnsignedOctalString_value() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(123, buffer, 0, 5); // 123 decimal is 173 octal
        assertArrayEquals(new byte[]{'0', '0', '1', '7', '3'}, buffer);
    }

    /**
     * Test for {@link TarUtils#formatUnsignedOctalString(long, byte[], int, int)} with max long octal.
     */
    @Test
    public void testFormatUnsignedOctalString_maxLongOctal() throws Exception {
        byte[] buffer = new byte[22]; // Max long is 63 bits, octal needs ceil(63/3) = 21 digits. Add one for safety.
        TarUtils.formatUnsignedOctalString(Long.MAX_VALUE, buffer, 0, 22);
        // Long.MAX_VALUE in octal is 1777777777777777777777
        String expectedPrefix = "00"; // 22 - 20 = 2 leading zeros
        String octalValue = Long.toOctalString(Long.MAX_VALUE);
        assertEquals(expectedPrefix + octalValue, new String(buffer));
    }

    /**
     * Test for {@link TarUtils#formatUnsignedOctalString(long, byte[], int, int)} with value too large.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_tooLarge() throws Exception {
        byte[] buffer = new byte[5];
        // A value that requires more than 5 octal digits (max is 77777)
        TarUtils.formatUnsignedOctalString(0100000, buffer, 0, 5);
    }

    /**
     * Test for {@link TarUtils#formatOctalBytes(long, byte[], int, int)} with zero.
     */
    @Test
    public void testFormatOctalBytes_zero() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatOctalBytes(0, buf, 0, 10);
        assertArrayEquals("000000000 ".getBytes(), buf);
        assertEquals(0, buf[8]); // trailing NUL
    }

    /**
     * Test for {@link TarUtils#formatOctalBytes(long, byte[], int, int)} with value.
     */
    @Test
    public void testFormatOctalBytes_value() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatOctalBytes(123, buf, 0, 10); // 173 octal
        assertArrayEquals("000000173 ".getBytes(), buf);
        assertEquals(0, buf[9]); // trailing NUL
    }

    /**
     * Test for {@link TarUtils#formatOctalBytes(long, byte[], int, int)} with value fitting exactly.
     */
    @Test
    public void testFormatOctalBytes_exactFit() throws Exception {
        byte[] buf = new byte[9]; // 7 digits for 123, plus space and NUL
        TarUtils.formatOctalBytes(123, buf, 0, 9);
        assertArrayEquals("0000123 ".getBytes(), buf);
        assertEquals(0, buf[8]);
    }

    /**
     * Test for {@link TarUtils#formatOctalBytes(long, byte[], int, int)} with value too large.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_tooLarge() throws Exception {
        byte[] buf = new byte[5]; // Needs at least 3 for value, 1 for space, 1 for NUL
        TarUtils.formatOctalBytes(123456, buf, 0, 5);
    }

    /**
     * Test for {@link TarUtils#formatLongOctalBytes(long, byte[], int, int)} with zero.
     */
    @Test
    public void testFormatLongOctalBytes_zero() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatLongOctalBytes(0, buf, 0, 10);
        assertArrayEquals("000000000 ".getBytes(), buf);
    }

    /**
     * Test for {@link TarUtils#formatLongOctalBytes(long, byte[], int, int)} with value.
     */
    @Test
    public void testFormatLongOctalBytes_value() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatLongOctalBytes(123, buf, 0, 10); // 173 octal
        assertArrayEquals("000000173 ".getBytes(), buf);
    }

    /**
     * Test for {@link TarUtils#formatLongOctalBytes(long, byte[], int, int)} with value too large for octal, should be binary.
     * (This test case relies on the fact that formatLongOctalOrBinaryBytes is called, but this method only calls formatLongOctalBytes)
     * The test for formatLongOctalOrBinaryBytes will cover the binary path.
     */
    @Test
    public void testFormatLongOctalBytes_fitsOctal() throws Exception {
        byte[] buf = new byte[12];
        TarUtils.formatLongOctalBytes(01234567L, buf, 0, 12); // 1234567 octal is 342391 decimal
        assertArrayEquals("0001234567 ".getBytes(), buf);
    }


    /**
     * Test for {@link TarUtils#formatLongOctalOrBinaryBytes(long, byte[], int, int)} with octal value within limits.
     */
    @Test
    public void testFormatLongOctalOrBinaryBytes_octal() throws Exception {
        // Assuming TarConstants.UIDLEN is 8 and TarConstants.MAXID is large enough
        // Let's use a value that fits within typical UID/GID limits.
        byte[] buf = new byte[10]; // Length for UID/GID is 8, but let's use 10 for testing
        long uid = 12345; // Fits in octal
        int expectedOffset = 0 + 10;
        int actualOffset = TarUtils.formatLongOctalOrBinaryBytes(uid, buf, 0, 10);
        assertEquals(expectedOffset, actualOffset);
        // The method calls formatLongOctalBytes, so we expect octal output with trailing space
        // "0000014551 "
        assertArrayEquals("0000014551 ".getBytes(), buf);
    }

    /**
     * Test for {@link TarUtils#formatLongOctalOrBinaryBytes(long, byte[], int, int)} with binary value (too large for octal).
     */
    @Test
    public void testFormatLongOctalOrBinaryBytes_binary() throws Exception {
        byte[] buf = new byte[9]; // Max size for binary is 8 bytes + 1 for sign
        // A value that would require more than 8 bytes in octal if it were signed
        // Let's use a value that definitely requires binary representation.
        // For TarConstants.MAXSIZE (usually 12 bytes), a value like 2^60 should be binary
        long largeValue = 1L << 60; // This will require binary representation

        // The method will call formatBigIntegerBinary
        // We need to check the first byte and the subsequent bytes.
        // The method sets the first byte to 0x80 or 0xff.
        // Then it formats the remaining bytes as binary.
        // The exact byte representation is complex, but we can check the pattern.
        int actualOffset = TarUtils.formatLongOctalOrBinaryBytes(largeValue, buf, 0, 9);
        assertEquals(9, actualOffset);

        // The first byte should indicate binary
        assertTrue(buf[0] == (byte) 0x80 || buf[0] == (byte) 0xff);

        // The rest of the bytes should represent the binary value of largeValue
        // Since it's a positive value, buf[0] should be 0x80
        assertEquals((byte) 0x80, buf[0]);

        // Expected binary representation of 2^60 in 8 bytes
        // 000001 000000 000000 000000 000000 000000 000000 000000
        // Each group of 3 bits for octal would be 20 bits. 60 bits needs 20 octal digits.
        // In binary, 2^60 is 1 followed by 60 zeros. This fits in 8 bytes.
        // 0x01 followed by 7 zeros, shifted appropriately.
        // The formatBigIntegerBinary method converts to BigInteger and then to byte array.
        // For 2^60, BigInteger.valueOf(1L << 60).toByteArray() should be {0x01, 0x00, ... 7 more zeros}.
        // The method pads with 0s at the beginning if needed.
        // For 9 bytes total, with 8 bytes of data:
        // The data for 2^60 is 8 bytes. So it should be {0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00} if length is 9.
        // If length is 9, offset is 0. The value occupies 8 bytes. The first byte is sign.
        // The remaining 8 bytes are data.
        // The value 2^60 is 1 followed by 60 zeros.
        // It will be represented as 0x01 followed by 7 zeros in 8 bytes.
        // So buf should be: {0x80, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00} for length 9.
        byte[] expected = { (byte)0x80, (byte)0x01, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00 };
        assertArrayEquals(expected, buf);
    }

    /**
     * Test for {@link TarUtils#formatCheckSumOctalBytes(long, byte[], int, int)} with zero.
     */
    @Test
    public void testFormatCheckSumOctalBytes_zero() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatCheckSumOctalBytes(0, buf, 0, 10);
        assertArrayEquals("000000000 ".getBytes(), buf);
        assertEquals(0, buf[8]); // trailing NUL
        assertEquals(' ', buf[9]); // trailing space
    }

    /**
     * Test for {@link TarUtils#formatCheckSumOctalBytes(long, byte[], int, int)} with value.
     */
    @Test
    public void testFormatCheckSumOctalBytes_value() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatCheckSumOctalBytes(123, buf, 0, 10); // 173 octal
        assertArrayEquals("000000173 ".getBytes(), buf);
        assertEquals(0, buf[8]); // trailing NUL
        assertEquals(' ', buf[9]); // trailing space
    }

    /**
     * Test for {@link TarUtils#formatCheckSumOctalBytes(long, byte[], int, int)} with value fitting exactly.
     */
    @Test
    public void testFormatCheckSumOctalBytes_exactFit() throws Exception {
        byte[] buf = new byte[9]; // 7 digits for 123, plus NUL and space
        TarUtils.formatCheckSumOctalBytes(123, buf, 0, 9);
        assertArrayEquals("0000123 ".getBytes(), buf); // NUL is at index 7, space at index 8
        assertEquals(0, buf[7]);
        assertEquals(' ', buf[8]);
    }

    /**
     * Test for {@link TarUtils#formatCheckSumOctalBytes(long, byte[], int, int)} with value too large.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytes_tooLarge() throws Exception {
        byte[] buf = new byte[5]; // Needs at least 3 for value, 1 for NUL, 1 for space
        TarUtils.formatCheckSumOctalBytes(123456, buf, 0, 5);
    }

    /**
     * Test for {@link TarUtils#computeCheckSum(byte[])} with a simple header.
     */

    /**
     * Test for {@link TarUtils#verifyCheckSum(byte[])} with a valid checksum.
     */

    /**
     * Test for {@link TarUtils#verifyCheckSum(byte[])} with stored sum greater than unsigned sum.
     */

    /**
     * Test for {@link TarUtils#verifyCheckSum(byte[])} with an invalid checksum.
     */

     /**
     * Test for {@link TarUtils#verifyCheckSum(byte[])} with a zero-filled header and checksum.
     */
}


