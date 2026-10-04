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
    public void testParseOctal_simple() throws Exception {
        byte[] buffer = "123 ".getBytes();
        assertEquals(83L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_leadingSpaces() throws Exception {
        byte[] buffer = "  456 ".getBytes();
        assertEquals(302L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_trailingSpaces() throws Exception {
        byte[] buffer = "789   ".getBytes();
        assertEquals(789L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_leadingAndTrailingSpaces() throws Exception {
        byte[] buffer = "  1011  ".getBytes();
        assertEquals(1011L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_onlySpaces() throws Exception {
        byte[] buffer = "    ".getBytes();
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_nullByte() throws Exception {
        byte[] buffer = new byte[] { '1', '2', '3', '\0', ' ' };
        assertEquals(83L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_onlyNuls() throws Exception {
        byte[] buffer = new byte[] { '\0', '\0', '\0' };
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctal_leadingNull() throws Exception {
        byte[] buffer = new byte[] { '\0', '1', '2', '3', ' ' };
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_invalidByte() throws Exception {
        byte[] buffer = "12a ".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_missingTrailingSpace() throws Exception {
        byte[] buffer = "123".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctal_lengthTwo() throws Exception {
        byte[] buffer = "12".getBytes();
        assertEquals(10L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctal_lengthOne() throws Exception {
        byte[] buffer = "1".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinary_octal() throws Exception {
        byte[] buffer = "123 ".getBytes();
        assertEquals(83L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinary_binarySimple() throws Exception {
        byte[] buffer = { (byte) 0x80, 0x01, 0x02 }; // Represents 258 (0x0102)
        assertEquals(258L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinary_binaryNegativeSimple() throws Exception {
        byte[] buffer = { (byte) 0xff, (byte) 0xfe, (byte) 0xfd }; // Represents -259 (two's complement of 0x0102)
        assertEquals(-259L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinary_binaryMaxLong() throws Exception {
        // Largest positive signed long
        byte[] buffer = new byte[9];
        buffer[0] = (byte) 0x80;
        // Manually construct Long.MAX_VALUE (0x7FFFFFFFFFFFFFFF) in binary form for 8 bytes
        // The highest bit of the first byte indicates it's binary, so we need to represent 0x7FFFFFFFFFFFFFFF
        // in 8 bytes.
        // 0x7F is the first byte, followed by 8 bytes of 0xFF.
        buffer[1] = (byte) 0x7F;
        for (int i = 2; i < 9; i++) {
            buffer[i] = (byte) 0xFF;
        }
        assertEquals(Long.MAX_VALUE, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinary_binaryMinLong() throws Exception {
        // Smallest negative signed long
        byte[] buffer = new byte[9];
        buffer[0] = (byte) 0xff; // Indicates negative binary
        // Manually construct Long.MIN_VALUE (-0x8000000000000000) in binary form for 8 bytes
        // The highest bit of the first byte is set, and it's 0xff, so it's negative.
        // To get Long.MIN_VALUE, we need to represent 0x8000000000000000
        // in 8 bytes and then negate it.
        // The representation of 0x8000000000000000 in 8 bytes is 0x80 followed by 7 zeros.
        buffer[1] = (byte) 0x80;
        for (int i = 2; i < 9; i++) {
            buffer[i] = (byte) 0x00;
        }
        assertEquals(Long.MIN_VALUE, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinary_binaryTooLargeForLong() throws Exception {
        // Value larger than Long.MAX_VALUE
        byte[] buffer = new byte[10];
        buffer[0] = (byte) 0x80;
        for (int i = 1; i < 10; i++) {
            buffer[i] = (byte) 0xff;
        }
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBoolean_true() throws Exception {
        byte[] buffer = { 1 };
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBoolean_false() throws Exception {
        byte[] buffer = { 0 };
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testParseBoolean_emptyBuffer() throws Exception {
        byte[] buffer = {};
        TarUtils.parseBoolean(buffer, 0);
    }

    @Test
    public void testParseName_simple() throws Exception {
        byte[] buffer = "filename".getBytes();
        assertEquals("filename", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseName_withNul() throws Exception {
        byte[] buffer = "filename\0".getBytes();
        assertEquals("filename", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseName_withMultipleNuls() throws Exception {
        byte[] buffer = "filename\0\0\0".getBytes();
        assertEquals("filename", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseName_empty() throws Exception {
        byte[] buffer = "".getBytes();
        assertEquals("", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseName_onlyNuls() throws Exception {
        byte[] buffer = { '\0', '\0', '\0' };
        assertEquals("", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testFormatNameBytes_truncation() throws Exception {
        String name = "verylongfilename";
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 10;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, offset, length));
        byte[] expected = "verylong".getBytes();
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatNameBytes_padding() throws Exception {
        String name = "short";
        byte[] buf = new byte[10];
        int offset = 0;
        int length = 10;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, offset, length));
        byte[] expected = "short\0\0\0\0\0".getBytes();
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatNameBytes_exactFit() throws Exception {
        String name = "exactfit";
        byte[] buf = new byte[8];
        int offset = 0;
        int length = 8;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, offset, length));
        byte[] expected = "exactfit".getBytes();
        assertArrayEquals(expected, buf);
    }
    
    @Test
    public void testFormatUnsignedOctalString_zero() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, buffer.length);
        assertArrayEquals(new byte[] {'0', '0', '0', '0', '0'}, buffer);
    }

    @Test
    public void testFormatUnsignedOctalString_simple() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(123L, buffer, 0, buffer.length);
        assertArrayEquals(new byte[] {'0', '0', '1', '7', '3'}, buffer);
    }

    @Test
    public void testFormatUnsignedOctalString_maxOctalValue() throws Exception {
        byte[] buffer = new byte[1]; // smallest buffer that can hold '7'
        TarUtils.formatUnsignedOctalString(7L, buffer, 0, buffer.length);
        assertArrayEquals(new byte[] {'7'}, buffer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalString_valueTooLarge() throws Exception {
        byte[] buffer = new byte[1];
        TarUtils.formatUnsignedOctalString(8L, buffer, 0, buffer.length);
    }

    @Test
    public void testFormatOctalBytes_simple() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatOctalBytes(123L, buf, 0, buf.length);
        // Expected: "000173 0"
        byte[] expected = "000173 0".getBytes();
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatOctalBytes_zero() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatOctalBytes(0L, buf, 0, buf.length);
        // Expected: "000000 0"
        byte[] expected = "000000 0".getBytes();
        assertArrayEquals(expected, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytes_valueTooLarge() throws Exception {
        byte[] buf = new byte[5]; // Not enough space for "123456 "
        TarUtils.formatOctalBytes(1234567L, buf, 0, buf.length);
    }

    @Test
    public void testFormatLongOctalBytes_simple() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatLongOctalBytes(123L, buf, 0, buf.length);
        // Expected: "000173   " (padded with spaces)
        byte[] expected = "000173   ".getBytes();
        assertArrayEquals(expected, buf);
    }
    
    @Test
    public void testFormatLongOctalBytes_zero() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatLongOctalBytes(0L, buf, 0, buf.length);
        byte[] expected = "000000000 ".getBytes();
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_octalFits() throws Exception {
        byte[] buf = new byte[12]; // UID length
        TarUtils.formatLongOctalOrBinaryBytes(12345L, buf, 0, buf.length);
        byte[] expected = "00026111    ".getBytes(); // Octal representation of 12345 padded with spaces
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytes_binaryFits() throws Exception {
        // Value too large for octal representation within length 12, so it should be binary
        // Let's use a value that will exceed 11 characters for octal.
        byte[] buf = new byte[12];
        TarUtils.formatLongOctalOrBinaryBytes(Long.MAX_VALUE, buf, 0, buf.length); // Will be formatted as binary
        // The exact binary representation is complex, we check the first byte indicates binary
        assertTrue(buf[0] == (byte) 0x80 || buf[0] == (byte) 0xff); // Positive or negative binary indicator
    }
    
    @Test
    public void testFormatCheckSumOctalBytes_simple() throws Exception {
        byte[] buf = new byte[12];
        TarUtils.formatCheckSumOctalBytes(12345L, buf, 0, buf.length);
        // Expected: "00026111\0 "
        byte[] expected = "00026111\0 ".getBytes();
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testComputeCheckSum_empty() throws Exception {
        byte[] buf = new byte[0];
        assertEquals(0L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSum_simple() throws Exception {
        byte[] buf = "header".getBytes();
        long sum = 0;
        for (byte b : buf) {
            sum += b & 0xFF;
        }
        assertEquals(sum, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSum_allZeros() throws Exception {
        byte[] buf = new byte[100];
        assertEquals(0L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testVerifyCheckSum_unsignedMatch() throws Exception {
        byte[] header = new byte[512];
        // Fill with some data
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 128);
        }
        // Manually set the checksum field to a value that will match unsignedSum
        long unsignedSum = 0;
        for (int i = 0; i < header.length; i++) {
            if (i >= TarConstants.CHKSUM_OFFSET && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                unsignedSum += ' '; // Treat checksum bytes as spaces
            } else {
                unsignedSum += 0xff & header[i];
            }
        }
        // Format the unsignedSum as octal into the checksum field
        // The formatCheckSumOctalBytes pads with NUL and then space, so we need to account for that.
        byte[] checksumBytes = new byte[TarConstants.CHKSUMLEN];
        TarUtils.formatCheckSumOctalBytes(unsignedSum, checksumBytes, 0, TarConstants.CHKSUMLEN);
        System.arraycopy(checksumBytes, 0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_signedMatch() throws Exception {
        byte[] header = new byte[512];
        // Fill with some data
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 128);
        }
        // Manually set the checksum field to a value that will match signedSum
        long signedSum = 0;
        for (int i = 0; i < header.length; i++) {
            if (i >= TarConstants.CHKSUM_OFFSET && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                signedSum += ' '; // Treat checksum bytes as spaces
            } else {
                signedSum += header[i]; // Treat bytes as signed
            }
        }
        // Format the signedSum as octal into the checksum field
        byte[] checksumBytes = new byte[TarConstants.CHKSUMLEN];
        TarUtils.formatCheckSumOctalBytes(signedSum, checksumBytes, 0, TarConstants.CHKSUMLEN);
        System.arraycopy(checksumBytes, 0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }
    
    @Test
    public void testVerifyCheckSum_storedSumGreaterThanUnsigned() throws Exception {
        byte[] header = new byte[512];
        // Fill with some data
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 128);
        }
        // Make storedSum greater than unsignedSum by setting the first digit of the checksum field high
        // The requirement is that the stored sum is *greater than* the computed unsigned sum.
        // We need to calculate the unsigned sum first, and then craft a stored sum that is larger.
        long unsignedSum = 0;
        for (int i = 0; i < header.length; i++) {
            if (i >= TarConstants.CHKSUM_OFFSET && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                unsignedSum += ' '; // Treat checksum bytes as spaces
            } else {
                unsignedSum += 0xff & header[i];
            }
        }

        // Set a stored sum that is definitely greater than unsignedSum.
        // For example, fill the checksum field with '7's, which will result in a large octal number.
        byte[] checksumBuffer = new byte[TarConstants.CHKSUMLEN];
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            checksumBuffer[i] = (byte) '7';
        }
        checksumBuffer[TarConstants.CHKSUMLEN - 1] = 0; // Null terminator
        checksumBuffer[TarConstants.CHKSUMLEN - 2] = (byte) ' '; // Trailing space

        // Calculate the stored sum from these characters
        long storedSum = 0;
        for(int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            if (i >= TarConstants.CHKSUM_OFFSET && i < TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN) {
                 if (header[i] >= '0' && header[i] <= '7') {
                    storedSum = storedSum * 8 + (header[i] - '0');
                 } else {
                    // The logic in verifyCheckSum treats non-octal digits within the CHKSUMLEN range as spaces after the first 6 digits.
                    // To ensure storedSum is greater than unsignedSum, we deliberately pick a stored value.
                    // We can just force it to be a large value.
                 }
            }
        }
        // Forcing a large stored sum value. The code in verifyCheckSum also calculates storedSum.
        // Let's format a large octal number into the checksum field.
        // Forcing storedSum to be larger than unsignedSum by formatting a large number.
        long largeOctalValue = Long.parseLong("777777", 8); // 777777 octal is 262143 decimal.
        TarUtils.formatCheckSumOctalBytes(largeOctalValue, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSum_noMatch() throws Exception {
        byte[] header = new byte[512];
        // Fill with some data
        for (int i = 0; i < header.length; i++) {
            header[i] = (byte) (i % 128);
        }
        // Set a checksum that won't match
        TarUtils.formatCheckSumOctalBytes(12345L, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        assertFalse(TarUtils.verifyCheckSum(header));
    }
}
