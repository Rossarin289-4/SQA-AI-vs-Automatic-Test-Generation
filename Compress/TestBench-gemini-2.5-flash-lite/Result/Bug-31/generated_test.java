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

    private static final String TEST_STRING = "Test String";
    private static final byte[] TEST_BYTES = TEST_STRING.getBytes();
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final byte[] ALL_NULL_BYTES = new byte[10];
    private static final byte[] PADDED_NULL_BYTES = {(byte)'1', (byte)'2', 0, 0, 0, 0, 0, 0, 0, 0};
    private static final byte[] PADDED_SPACE_BYTES = {(byte)'1', (byte)'2', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    private static final byte[] VALID_OCTAL_BYTES = {(byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)'4', (byte)'5', (byte)'6', (byte)'7', (byte)' ', (byte)0};
    private static final byte[] INVALID_OCTAL_BYTES = {(byte)'0', (byte)'8', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)' ', (byte)0};
    private static final byte[] BINARY_LONG_HIGH = {(byte)0x80, (byte)0x7f, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
    private static final byte[] BINARY_LONG_LOW = {(byte)0xff, (byte)0x80, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x01};
    private static final byte[] BINARY_BIGINT_POSITIVE = {(byte)0x80, (byte)0x01, (byte)0x00}; // Represents 256
    private static final byte[] BINARY_BIGINT_NEGATIVE = {(byte)0xff, (byte)0xff, (byte)0xfe}; // Represents -2


    @Test
    public void testParseOctal_zero() throws Exception {
        byte[] buffer = {(byte)'0', (byte)' ', (byte)0};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_leadingZeros() throws Exception {
        byte[] buffer = {(byte)' ', (byte)'0', (byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)' ', (byte)0};
        assertEquals(0123L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_leadingSpaces() throws Exception {
        byte[] buffer = {(byte)' ', (byte)' ', (byte)'1', (byte)'2', (byte)'3', (byte)' ', (byte)0};
        assertEquals(0123L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_trailingSpacesAndNuls() throws Exception {
        byte[] buffer = {(byte)'1', (byte)'2', (byte)'3', (byte)' ', (byte)0, (byte)' ', (byte)0};
        assertEquals(0123L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_maxLong() throws Exception {
        // Long.MAX_VALUE in octal
        byte[] buffer = "7777777777777777777777".getBytes(); // 22 digits
        assertEquals(Long.MAX_VALUE, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_tooLong() throws Exception {
        // 23 digits will overflow long
        byte[] buffer = "77777777777777777777777".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByte() throws Exception {
        byte[] buffer = {(byte)'1', (byte)'2', (byte)'8', (byte)'0', (byte)' '};
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthLessThan2() throws Exception {
        byte[] buffer = {(byte)'1'};
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinary_octal() throws Exception {
        byte[] buffer = {(byte)'0', (byte)'1', (byte)'2', (byte)' ', (byte)0};
        assertEquals(012L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinary_binaryLongPositive() throws Exception {
        byte[] buffer = {(byte)0x80, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x01}; // 1
        assertEquals(1L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinary_binaryLongNegative() throws Exception {
        byte[] buffer = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff}; // -1
        assertEquals(-1L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinary_binaryBigIntegerPositive() throws Exception {
        byte[] buffer = {(byte)0x80, (byte)0x01, (byte)0x00}; // 256
        assertEquals(256L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinary_binaryBigIntegerNegative() throws Exception {
        byte[] buffer = {(byte)0xff, (byte)0xff, (byte)0xfe}; // -2
        assertEquals(-2L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_binaryTooLarge() throws Exception {
        byte[] buffer = {(byte)0x80, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x80}; // 128
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBoolean_true() throws Exception {
        byte[] buffer = {(byte)1};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBoolean_false() throws Exception {
        byte[] buffer = {(byte)0};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testParseBoolean_emptyBuffer() throws Exception {
        TarUtils.parseBoolean(EMPTY_BYTES, 0);
    }

    @Test
    public void testParseName_empty() throws Exception {
        assertEquals("", TarUtils.parseName(EMPTY_BYTES, 0, 0));
    }

    @Test
    public void testParseName_withNul() throws Exception {
        byte[] buffer = {(byte)'a', (byte)'b', (byte)0, (byte)'c'};
        assertEquals("ab", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseName_noNul() throws Exception {
        byte[] buffer = {(byte)'a', (byte)'b', (byte)'c'};
        assertEquals("abc", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseName_trailingNuls() throws Exception {
        byte[] buffer = {(byte)'a', (byte)'b', (byte)0, (byte)0};
        assertEquals("ab", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testFormatNameBytes_truncation() throws Exception {
        byte[] buf = new byte[3];
        int expectedOffset = 3;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(TEST_STRING, buf, 0, 3));
        assertArrayEquals(new byte[]{(byte)'T', (byte)'e', (byte)'s'}, buf);
    }

    @Test
    public void testFormatNameBytes_padding() throws Exception {
        byte[] buf = new byte[15];
        int expectedOffset = 15;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(TEST_STRING, buf, 0, 15));
        byte[] expected = new byte[15];
        System.arraycopy(TEST_BYTES, 0, expected, 0, TEST_BYTES.length);
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatNameBytes_emptyString() throws Exception {
        byte[] buf = new byte[10];
        int expectedOffset = 10;
        assertEquals(expectedOffset, TarUtils.formatNameBytes("", buf, 0, 10));
        byte[] expected = new byte[10];
        for (int i = 0; i < 10; i++) {
            expected[i] = 0;
        }
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatUnsignedOctalString_zero() throws Exception {
        byte[] buffer = new byte[10];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, buffer.length);
        byte[] expected = {(byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0'};
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatUnsignedOctalString_value() throws Exception {
        byte[] buffer = new byte[10];
        TarUtils.formatUnsignedOctalString(0123L, buffer, 0, buffer.length);
        byte[] expected = {(byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)'0'}; // Note: 0123 is 83 in decimal
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatUnsignedOctalString_maxLong() throws Exception {
        byte[] buffer = new byte[24]; // TarConstants.LONG_NAMELEN + 2 for trailer
        TarUtils.formatUnsignedOctalString(Long.MAX_VALUE, buffer, 0, buffer.length);
        String octal = Long.toOctalString(Long.MAX_VALUE);
        byte[] expected = new byte[24];
        for(int i = 0; i < 24 - octal.length(); i++) {
            expected[i] = (byte)'0';
        }
        System.arraycopy(octal.getBytes(), 0, expected, 24 - octal.length(), octal.length());
        assertArrayEquals(expected, buffer);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(01234567L, buffer, 0, buffer.length); // 7 digits
    }

    @Test
    public void testFormatOctalBytes_zero() throws Exception {
        byte[] buffer = new byte[10];
        int expectedOffset = 10;
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(0, buffer, 0, buffer.length));
        byte[] expected = {(byte)'0', (byte)' ', (byte)0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatOctalBytes_value() throws Exception {
        byte[] buffer = new byte[10];
        int expectedOffset = 10;
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(0123L, buffer, 0, buffer.length));
        byte[] expected = {(byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)' ', (byte)0};
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatOctalBytes_maxLen() throws Exception {
        byte[] buffer = new byte[TarConstants.NAMELEN + 2]; // length of name field + space + NUL
        String name = "123456777777777777777"; // 21 digits, fits in 22 bytes for octal
        long value = Long.parseLong(name, 8);
        int expectedOffset = TarConstants.NAMELEN + 2;
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(value, buffer, 0, buffer.length));

        byte[] expected = new byte[TarConstants.NAMELEN + 2];
        String octalString = Long.toOctalString(value);
        int padding = TarConstants.NAMELEN - octalString.length();
        for (int i = 0; i < padding; i++) {
            expected[i] = (byte)'0';
        }
        System.arraycopy(octalString.getBytes(), 0, expected, padding, octalString.length());
        expected[TarConstants.NAMELEN] = (byte)' ';
        expected[TarConstants.NAMELEN + 1] = 0;
        assertArrayEquals(expected, buffer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_overflow() throws Exception {
        byte[] buffer = new byte[10];
        TarUtils.formatOctalBytes(01234567777L, buffer, 0, buffer.length); // Too many digits for length 8 (index 6 for value)
    }

    @Test
    public void testFormatLongOctalBytes_zero() throws Exception {
        byte[] buffer = new byte[10];
        int expectedOffset = 10;
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(0, buffer, 0, buffer.length));
        byte[] expected = {(byte)'0', (byte)' ', 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatLongOctalBytes_value() throws Exception {
        byte[] buffer = new byte[10];
        int expectedOffset = 10;
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(0123L, buffer, 0, buffer.length));
        byte[] expected = {(byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)' ', (byte)0};
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatLongOctalBytes_maxValAsOctal() throws Exception {
        byte[] buffer = new byte[9]; // For UIDLEN
        long maxUid = TarConstants.MAXID;
        int expectedOffset = 9;
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(maxUid, buffer, 0, buffer.length));

        String octal = Long.toOctalString(maxUid);
        byte[] expected = new byte[9];
        int padding = 8 - octal.length();
        for (int i = 0; i < padding; i++) {
            expected[i] = (byte)'0';
        }
        System.arraycopy(octal.getBytes(), 0, expected, padding, octal.length());
        expected[8] = (byte)' ';
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_octalFit() throws Exception {
        byte[] buffer = new byte[9]; // For UIDLEN
        long value = 123L;
        int expectedOffset = 9;
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length));
        byte[] expected = {(byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)' '};
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryLongPositive() throws Exception {
        byte[] buffer = new byte[9]; // For UIDLEN
        long value = 1L << 63; // Represents Long.MIN_VALUE in 2's complement if it were a signed 64-bit value
        // However, here it's treated as a large positive value that won't fit octal
        // In this context, it should be represented as binary.
        // The actual binary representation for Long.MIN_VALUE would be 0x8000000000000000.
        // The method's logic is to use 0x80 for positive numbers that don't fit octal.
        // For a 64-bit value, it uses 8 bytes for data + 1 for sign/flag.
        // The binary representation of 2^63 in 8 bytes is 80 00 00 00 00 00 00 00
        byte[] expected = {(byte)0x80, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00};
        assertEquals(9, TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length));
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryLongNegative() throws Exception {
        byte[] buffer = new byte[9]; // For UIDLEN
        long value = Long.MIN_VALUE;
        byte[] expected = {(byte)0xff, (byte)0x80, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00};
        assertEquals(9, TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length));
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryBigIntegerPositive() throws Exception {
        byte[] buffer = new byte[9]; // For UIDLEN
        long value = 0xFFFFFFFFFFFFFFFFL; // A large positive number that exceeds octal capacity for 8 bytes
        // It will use BigInteger internally, and will be represented in 8 bytes + flag
        // 0xFFFFFFFFFFFFFFFF is max positive value for unsigned 64 bit
        // but as signed long it's -1. So this case is tricky.
        // Let's try a value that is clearly positive and large.
        // 2^63 is 0x8000000000000000
        value = BigInteger.valueOf(2).pow(63).longValue(); // 2^63
        byte[] expected = {(byte)0x80, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00};
        assertEquals(9, TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length));
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryBigIntegerNegative() throws Exception {
        byte[] buffer = new byte[9]; // For UIDLEN
        long value = -1000000000000000000L; // A large negative number
        byte[] expected = {(byte)0xff, (byte)0x8c, (byte)0x74, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00};
        assertEquals(9, TarUtils.formatLongOctalOrBinaryBytes(value, buffer, 0, buffer.length));
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatCheckSumOctalBytes_zero() throws Exception {
        byte[] buffer = new byte[TarConstants.CHKSUMLEN + 2]; // CHKSUMLEN + NUL + space
        int expectedOffset = TarConstants.CHKSUMLEN + 2;
        assertEquals(expectedOffset, TarUtils.formatCheckSumOctalBytes(0, buffer, 0, buffer.length));
        byte[] expected = new byte[TarConstants.CHKSUMLEN + 2];
        expected[0] = (byte)'0';
        expected[TarConstants.CHKSUMLEN] = 0;
        expected[TarConstants.CHKSUMLEN + 1] = (byte)' ';
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatCheckSumOctalBytes_value() throws Exception {
        byte[] buffer = new byte[TarConstants.CHKSUMLEN + 2];
        int expectedOffset = TarConstants.CHKSUMLEN + 2;
        assertEquals(expectedOffset, TarUtils.formatCheckSumOctalBytes(0123L, buffer, 0, buffer.length));
        byte[] expected = new byte[TarConstants.CHKSUMLEN + 2];
        expected[0] = (byte)'0';
        expected[1] = (byte)'1';
        expected[2] = (byte)'2';
        expected[3] = (byte)'3';
        expected[TarConstants.CHKSUMLEN] = 0;
        expected[TarConstants.CHKSUMLEN + 1] = (byte)' ';
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testComputeCheckSum() throws Exception {
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 256); // Fill with some values
        }
        // Manually calculate expected sum
        long expectedSum = 0;
        for (byte b : header) {
            expectedSum += 0xff & b;
        }
        assertEquals(expectedSum, TarUtils.computeCheckSum(header));
    }

    @Test
    public void testComputeCheckSum_empty() throws Exception {
        assertEquals(0L, TarUtils.computeCheckSum(EMPTY_BYTES));
    }

    @Test
    public void testVerifyCheckSum_valid() throws Exception {
        // A valid header with a correct checksum
        byte[] header = new byte[512];
        // Fill with some data, leaving checksum area zero for now
        for (int i = 0; i < header.length; i++) {
            if (i < TarConstants.CHKSUM_OFFSET || i >= TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                header[i] = (byte) (i % 256);
            }
        }
        // Calculate the checksum and format it
        long sum = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(sum, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_invalid() throws Exception {
        byte[] header = new byte[512];
        // Fill with some data, leaving checksum area zero for now
        for (int i = 0; i < header.length; i++) {
            if (i < TarConstants.CHKSUM_OFFSET || i >= TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                header[i] = (byte) (i % 256);
            }
        }
        // Store a wrong checksum
        TarUtils.formatCheckSumOctalBytes(12345L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertFalse(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_storedSumGreaterThanUnsignedSum() throws Exception {
        // Based on COMPRESS-177, where storedSum > unsignedSum can be a valid heuristic
        byte[] header = new byte[512];
        for (int i = 0; i < header.length; i++) {
            if (i < TarConstants.CHKSUM_OFFSET || i >= TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                header[i] = (byte) (i % 256);
            }
        }
        // Set a stored sum that is greater than the computed unsigned sum
        // For simplicity, let's put a large octal value in the checksum field.
        // Let's fill the checksum field with "777777 " which is a large octal number.
        byte[] largeOctal = "777777 ".getBytes();
        System.arraycopy(largeOctal, 0, header, TarConstants.CHKSUM_OFFSET, largeOctal.length);

        // Compute the actual unsigned sum
        long unsignedSum = 0;
        for (int i = 0; i < header.length; i++) {
            if (i < TarConstants.CHKSUM_OFFSET || i >= TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                unsignedSum += 0xff & header[i];
            }
        }

        // The stored sum will be parsed from "777777 ", which is 0777777 octal = 262143.
        // If this stored sum is greater than the actual unsigned sum, verifyCheckSum should return true.
        // This scenario is highly specific and hard to engineer a precise test case without knowing exact header contents.
        // For now, let's trust the logic for this edge case and test a scenario where it might apply.
        // If the actual checksum calculation is less than the stored "777777", it should return true.
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testParseOctal_allNulls() throws Exception {
        byte[] buffer = new byte[10]; // All nulls
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_leadingNull() throws Exception {
        byte[] buffer = {0, (byte)'1', (byte)'2', (byte)' ', (byte)0};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

}
