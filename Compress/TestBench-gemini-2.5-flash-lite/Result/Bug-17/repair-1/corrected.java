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
    public void testParseOctalBasic() throws Exception {
        byte[] buffer = "123 ".getBytes();
        assertEquals(83L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalWithLeadingSpaces() throws Exception {
        byte[] buffer = "  456 ".getBytes();
        assertEquals(302L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalWithTrailingSpacesAndNuls() throws Exception {
        byte[] buffer = "777 \0\0".getBytes();
        assertEquals(511L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalAllNuls() throws Exception {
        byte[] buffer = {'\0','\0','\0','\0','\0','\0'};
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalZero() throws Exception {
        byte[] buffer = "0 ".getBytes();
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidByte() throws Exception {
        byte[] buffer = "12a ".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalMissingTrailingSpaceOrNul() throws Exception {
        byte[] buffer = "123".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseOctalOrBinaryBasicOctal() throws Exception {
        byte[] buffer = "123 ".getBytes();
        assertEquals(83L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinaryBasicBinary() throws Exception {
        byte[] buffer = {(byte) 0x80, 1, 2, 3}; // Binary representation of 0x010203
        assertEquals(66051L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinaryNegativeBinary() throws Exception {
        byte[] buffer = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfe}; // -2 in 9 bytes 2's complement
        assertEquals(-2L, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalOrBinaryBinaryTooLarge() throws Exception {
        byte[] buffer = new byte[10];
        buffer[0] = (byte) 0x80; // Indicates binary
        for (int i = 1; i < buffer.length; i++) {
            buffer[i] = (byte) 0xff; // Fill with FFs to make it large
        }
        TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBooleanTrue() throws Exception {
        byte[] buffer = {1, 0, 0};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() throws Exception {
        byte[] buffer = {0, 0, 0};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseNameBasic() throws Exception {
        byte[] buffer = "testName\0".getBytes();
        assertEquals("testName", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameWithTrailingNuls() throws Exception {
        byte[] buffer = "testName\0\0\0".getBytes();
        assertEquals("testName", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameEmpty() throws Exception {
        byte[] buffer = {'\0'};
        assertEquals("", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameTruncated() throws Exception {
        byte[] buffer = "testName".getBytes();
        assertEquals("testName", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testFormatNameBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        String name = "test";
        int length = buf.length;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, offset, length));
        assertArrayEquals("test\0\0\0\0\0".getBytes(), buf);
    }

    @Test
    public void testFormatNameBytesTruncated() throws Exception {
        byte[] buf = new byte[5];
        String name = "testName";
        int length = buf.length;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, offset, length));
        assertArrayEquals("testN".getBytes(), buf);
    }

    @Test
    public void testFormatNameBytesEmpty() throws Exception {
        byte[] buf = new byte[5];
        String name = "";
        int length = buf.length;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, offset, length));
        assertArrayEquals("\0\0\0\0\0".getBytes(), buf);
    }

    @Test
    public void testFormatUnsignedOctalStringBasic() throws Exception {
        byte[] buffer = new byte[10];
        long value = 123L;
        int length = 5;
        int offset = 2;
        TarUtils.formatUnsignedOctalString(value, buffer, offset, length);
        byte[] expected = new byte[10];
        expected[2] = '0';
        expected[3] = '0';
        expected[4] = '1';
        expected[5] = '7';
        expected[6] = '3';
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringZero() throws Exception {
        byte[] buffer = new byte[5];
        long value = 0L;
        int length = 3;
        int offset = 1;
        TarUtils.formatUnsignedOctalString(value, buffer, offset, length);
        byte[] expected = new byte[5];
        expected[1] = '0';
        expected[2] = '0';
        expected[3] = '0';
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringFullLength() throws Exception {
        byte[] buffer = new byte[3];
        long value = 777L; // Octal 1411
        int length = 3;
        int offset = 0;
        TarUtils.formatUnsignedOctalString(value, buffer, offset, length);
        byte[] expected = new byte[3];
        expected[0] = '1';
        expected[1] = '7';
        expected[2] = '1';
        assertArrayEquals(expected, buffer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringTooLarge() throws Exception {
        byte[] buffer = new byte[3];
        long value = 8; // Octal 10, too large for 3 bytes
        int length = 3;
        int offset = 0;
        TarUtils.formatUnsignedOctalString(value, buffer, offset, length);
    }

    @Test
    public void testFormatOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        long value = 123L;
        int length = 8;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(value, buf, offset, length));
        assertArrayEquals("000173 \0".getBytes(), buf);
    }

    @Test
    public void testFormatOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        long value = 0L;
        int length = 5;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(value, buf, offset, length));
        assertArrayEquals("000 \0".getBytes(), buf);
    }

    @Test
    public void testFormatOctalBytesFullLength() throws Exception {
        byte[] buf = new byte[8];
        long value = 777L; // Octal 1411
        int length = 8;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(value, buf, offset, length));
        assertArrayEquals("1411 \0".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        long value = 123L;
        int length = 8;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(value, buf, offset, length));
        assertArrayEquals("000173 ".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        long value = 0L;
        int length = 5;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(value, buf, offset, length));
        assertArrayEquals("00000 ".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalBytesFullLength() throws Exception {
        byte[] buf = new byte[8];
        long value = 777L; // Octal 1411
        int length = 8;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(value, buf, offset, length));
        assertArrayEquals("1411   ".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctal() throws Exception {
        byte[] buf = new byte[12];
        long value = 100L; // Fits in octal
        int length = 12;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length));
        assertArrayEquals("000144      ".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryPositive() throws Exception {
        byte[] buf = new byte[12];
        // Value that is too large for octal. Let's use a value that requires more than 63 bits.
        // TarConstants.UIDLEN is 8, TarConstants.MAXID is 2^24-1.
        // TarConstants.SIZELEN is 12, TarConstants.MAXSIZE is 2^31-1 for standard tar, 2^47-1 for extended.
        // We are testing formatLongOctalOrBinaryBytes, so it should consider the full long range.
        // A value like Long.MAX_VALUE will definitely be binary.
        long value = Long.MAX_VALUE;
        int length = 12;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length));
        assertEquals((byte)0x80, buf[offset]); // Indicates positive binary
        // The rest should be zero-padded for positive numbers
        for(int i = 1; i < length; i++) {
            assertEquals((byte)0, buf[i]);
        }
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryNegative() throws Exception {
        byte[] buf = new byte[12];
        long value = Long.MIN_VALUE; // A negative value that is too large for octal
        int length = 12;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length));
        assertEquals((byte)0xff, buf[offset]); // Indicates negative binary
        // For negative numbers, the remaining bytes are filled with 0xff for 2's complement representation.
        // However, the formatLongBinary and formatBigIntegerBinary methods handle this.
        // The internal representation of Long.MIN_VALUE is complex. We can check the first byte and some later bytes.
        // A simple check would be:
        assertTrue(buf[offset+1] == (byte)0x80); // Most significant bit of the remaining part should be set for negative.
        assertTrue(buf[offset+2] == (byte)0); // Example, might need to be more precise.
        // A more robust check would be to reconstruct the value.
        // The logic in formatBigIntegerBinary should fill the bytes correctly.
    }

    @Test
    public void testFormatCheckSumOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        long value = 123L;
        int length = 8;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatCheckSumOctalBytes(value, buf, offset, length));
        assertArrayEquals("000173\0 ".getBytes(), buf);
    }

    @Test
    public void testFormatCheckSumOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        long value = 0L;
        int length = 5;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatCheckSumOctalBytes(value, buf, offset, length));
        assertArrayEquals("000\0 ".getBytes(), buf);
    }

    @Test
    public void testComputeCheckSumBasic() throws Exception {
        byte[] buf = "this is a test".getBytes();
        long expectedSum = 0;
        for (byte b : buf) {
            expectedSum += 0xff & b;
        }
        assertEquals(expectedSum, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSumEmpty() throws Exception {
        byte[] buf = new byte[0];
        assertEquals(0L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testVerifyCheckSumUnsignedMatch() throws Exception {
        byte[] header = new byte[100]; // Mock header
        // Fill with some data that would result in a known unsigned sum
        for(int i = 0; i < header.length; i++) {
            header[i] = (byte)(i % 256);
        }
        // Calculate expected unsigned sum
        long unsignedSum = 0;
        for (int i = 0; i < header.length; i++) {
            unsignedSum += 0xff & header[i];
        }
        // Simulate a stored checksum that matches the unsigned sum
        // We need to place it in the CHKSUM_OFFSET and pad with spaces/NULs to CHKSUMLEN
        String storedSumStr = Long.toString(unsignedSum, 8);
        // Ensure it fits within 6 digits + NUL + space
        // The verifyCheckSum method only considers the first 6 digits for the stored sum.
        if (storedSumStr.length() > 6) {
            storedSumStr = storedSumStr.substring(storedSumStr.length() - 6); // Take last 6 digits if too long
        }
        
        byte[] storedSumBytes = new byte[TarConstants.CHKSUMLEN];
        System.arraycopy(storedSumStr.getBytes(), 0, storedSumBytes, 0, storedSumStr.length());
        // Pad with spaces to CHKSUMLEN
        for(int i = storedSumStr.length(); i < TarConstants.CHKSUMLEN; i++) {
            storedSumBytes[i] = ' ';
        }
        
        System.arraycopy(storedSumBytes, 0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        header[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN -1] = 0; // Ensure trailing NUL

        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumSignedMatch() throws Exception {
        byte[] header = new byte[100]; // Mock header
        // Fill with data that would result in a known signed sum
        for(int i = 0; i < header.length; i++) {
            header[i] = (byte)(i - 128); // Negative values
        }
        // Calculate expected signed sum
        long signedSum = 0;
        for (int i = 0; i < header.length; i++) {
            signedSum += header[i];
        }

        // Simulate a stored checksum that matches the signed sum
        String storedSumStr = Long.toString(signedSum, 8);
        if (storedSumStr.length() > 6) {
            storedSumStr = storedSumStr.substring(storedSumStr.length() - 6); // Take last 6 digits if too long
        }

        byte[] storedSumBytes = new byte[TarConstants.CHKSUMLEN];
        System.arraycopy(storedSumStr.getBytes(), 0, storedSumBytes, 0, storedSumStr.length());
        for(int i = storedSumStr.length(); i < TarConstants.CHKSUMLEN; i++) {
            storedSumBytes[i] = ' ';
        }
        System.arraycopy(storedSumBytes, 0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        header[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN -1] = 0; // Ensure trailing NUL

        assertTrue(TarUtils.verifyCheckSum(header));
    }
    
    @Test
    public void testVerifyCheckSumStoredGreaterThanUnsigned() throws Exception {
        byte[] header = new byte[100]; // Mock header
        // Fill with data such that unsignedSum is low
        for(int i = 0; i < header.length; i++) {
            header[i] = (byte)0;
        }
        long unsignedSum = 0; // Sum is 0
        // Simulate a stored sum that is greater than unsigned sum
        String storedSumStr = "1000000"; // A value greater than 0
        byte[] storedSumBytes = new byte[TarConstants.CHKSUMLEN];
        System.arraycopy(storedSumStr.getBytes(), 0, storedSumBytes, 0, storedSumStr.length());
        for(int i = storedSumStr.length(); i < TarConstants.CHKSUMLEN; i++) {
            storedSumBytes[i] = ' ';
        }
        System.arraycopy(storedSumBytes, 0, header, TarConstants.CHKSUM_OFFSET, TarConstants.CHKSUMLEN);
        header[TarConstants.CHKSUM_OFFSET + TarConstants.CHKSUMLEN -1] = 0; // Ensure trailing NUL
        
        assertTrue(TarUtils.verifyCheckSum(header));
    }

    @Test
    public void testVerifyCheckSumNoMatch() throws Exception {
        byte[] header = new byte[100]; // Mock header
        // Fill with some data
        for(int i = 0; i < header.length; i++) {
            header[i] = (byte)(i % 256);
        }
        // Manually set a checksum that won't match
        header[TarConstants.CHKSUM_OFFSET] = (byte)'1';
        header[TarConstants.CHKSUM_OFFSET+1] = (byte)'0';
        header[TarConstants.CHKSUM_OFFSET+2] = (byte)'0';
        header[TarConstants.CHKSUM_OFFSET+3] = (byte)'0';
        header[TarConstants.CHKSUM_OFFSET+4] = (byte)'0';
        header[TarConstants.CHKSUM_OFFSET+5] = (byte)'0';
        header[TarConstants.CHKSUM_OFFSET+6] = (byte)' '; // space
        header[TarConstants.CHKSUM_OFFSET+7] = 0; // null

        assertFalse(TarUtils.verifyCheckSum(header));
    }
    
    @Test
    public void testParseOctalLengthLessThanTwo() throws Exception {
        byte[] buffer = "1".getBytes();
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctalBoundary() throws Exception {
        byte[] buf = new byte[12];
        // Value that fits within UIDLEN (6 digits, so 7 bytes for value + space)
        // This is the max for UIDLEN, and should still be octal for length 12
        long value = TarUtils.parseOctal("777777 ", 0, 7); 
        int length = 12;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length));
        assertArrayEquals("000777777   ".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryBoundary() throws Exception {
        byte[] buf = new byte[9]; // Minimum length for binary to potentially exceed octal
        // A value that is just slightly larger than what fits into octal for length 8
        // Long.MAX_VALUE is too big for this example. Let's use a value that fits in 8 bytes binary.
        // 8 bytes binary can hold up to 2^63 - 1.
        // Max octal for 8 bytes is 8 octal digits, each represents 3 bits. 8 * 3 = 24 bits.
        // So, a number that requires more than 24 bits will be binary.
        // Let's pick a value that fits in 8 bytes signed long:
        long value = (1L << 60); // A large value, likely to be treated as binary
        int length = 9;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length));
        assertEquals((byte)0x80, buf[offset]); // Indicates binary
        // Check that the remaining bytes are filled with 0s
        for(int i = 1; i < length; i++) {
            assertEquals((byte)0, buf[i]);
        }
    }
}
