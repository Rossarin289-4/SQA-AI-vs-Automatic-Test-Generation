```java
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
        long value = 0177L; // Octal 177
        int length = 3;
        int offset = 0;
        TarUtils.formatUnsignedOctalString(value, buffer, offset, length);
        byte[] expected = new byte[3];
        expected[0] = '1';
        expected[1] = '7';
        expected[2] = '7';
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
        long value = 01411L; // Octal 1411 is 777 decimal
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
        long value = 01411L; // Octal 1411 is 777 decimal
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
        // Value that is too large for octal.
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
        long value = Long.MIN_VALUE; // A negative value
        int length = 12;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length));
        assertEquals((byte)0xff, buf[offset]); // Indicates negative binary
        // For negative numbers, the remaining bytes are filled with 0xff for 2's complement representation.
        // formatBigIntegerBinary handles this.
        // A minimal check is to ensure the first few bytes are as expected.
        assertTrue(buf[offset+1] == (byte)0x80); 
        assertTrue(buf[offset+2] == (byte)0);
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
        // The verifyCheckSum method only looks at the first 6 digits for the stored sum
        String storedSumStr = Long.toString(unsignedSum, 8);
        // Ensure it fits within 6 digits + NUL + space.
        if (storedSumStr.length() > 6) {
            storedSumStr = storedSumStr.substring(storedSumStr.length() - 6); // Take last 6 digits if too long
        }
        
        byte[] storedSumBytes = new byte[TarConstants.CHKSUMLEN];
        System.arraycopy(storedSumStr.getBytes(), 0, storedSumBytes, 0, storedSumStr.length());
        // Pad with spaces to CHKSUMLEN
        for(int i = storedSumStr.length(); i < TarConstants.CHKSUMLEN; i++) {
            storedSumBytes[i] = ' ';
        }
        
        // The checksum field is CHKSUMLEN bytes starting at CHKSUM_OFFSET.
        // The format is 6 octal digits, NUL, space. So length is 8.
        // The method logic:
        // `if ('0' <= b && b <= '7' && digits++ < 6)` -> looks at digits
        // `else if (digits > 0) { digits = 6; }` -> stops looking after first non-digit
        // `b = ' ';` -> checksum bytes are treated as space for sum calculation.

        // Fill the checksum field correctly.
        byte[] checksumField = new byte[TarConstants.CHKSUMLEN + 1]; // +1 for space
        System.arraycopy(storedSumStr.getBytes(), 0, checksumField, 0, storedSumStr.length());
        for (int i = storedSumStr.length(); i < TarConstants.CHKSUMLEN; i++) {
            checksumField[i] = ' '; // Pad with spaces
        }
        checksumField[TarConstants.CHKSUMLEN] = ' '; // Trailing space
        
        System.arraycopy(checksumField, 0, header, TarConstants.CHKSUM_OFFSET, checksumField.length);

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

        byte[] checksumField = new byte[TarConstants.CHKSUMLEN + 1]; // +1 for space
        System.arraycopy(storedSumStr.getBytes(), 0, checksumField, 0, storedSumStr.length());
        for(int i = storedSumStr.length(); i < TarConstants.CHKSUMLEN; i++) {
            checksumField[i] = ' ';
        }
        checksumField[TarConstants.CHKSUMLEN] = ' '; // Trailing space
        
        System.arraycopy(checksumField, 0, header, TarConstants.CHKSUM_OFFSET, checksumField.length);

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
        byte[] checksumField = new byte[TarConstants.CHKSUMLEN + 1]; // +1 for space
        System.arraycopy(storedSumStr.getBytes(), 0, checksumField, 0, storedSumStr.length());
        for(int i = storedSumStr.length(); i < TarConstants.CHKSUMLEN; i++) {
            checksumField[i] = ' ';
        }
        checksumField[TarConstants.CHKSUMLEN] = ' '; // Trailing space
        
        System.arraycopy(checksumField, 0, header, TarConstants.CHKSUM_OFFSET, checksumField.length);
        
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
        byte[] checksumField = "100000 \0 ".getBytes(); // Valid format but unlikely to match sums
        System.arraycopy(checksumField, 0, header, TarConstants.CHKSUM_OFFSET, checksumField.length);

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
        // Value that fits within 6 octal digits, plus trailing space.
        // The method `formatLongOctalBytes` is called for octal.
        // `formatLongOctalBytes` calls `formatUnsignedOctalString` with length `idx=length-1`.
        // So, for length=8, idx=7.
        // Let's test a value that requires 7 octal digits.
        long value = 01000000L; // This is 1,048,576 in decimal
        int length = 12;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length));
        // The output should be octal as it fits.
        // formatLongOctalBytes(value, buf, offset, length) is called.
        // it calls formatUnsignedOctalString(value, buf, offset, length - 2) -> length-2 for space and null
        // For length = 12, this is formatUnsignedOctalString(value, buf, 0, 10).
        // This will write "0010000000"
        assertArrayEquals("0010000000 \0".getBytes(), buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryBoundary() throws Exception {
        byte[] buf = new byte[9]; // Minimum length for binary to potentially exceed octal
        // A value that is just slightly larger than what fits into octal for length 8
        // Max value for octal for 8 bytes length is about 2^21 (since 8 bytes = 64 bits, octal uses 3 bits per digit. 8*8=64 bits. Max for 8 bytes in octal is 21 digits. 2^63-1 is max for signed long.
        // The method checks `value <= maxAsOctalChar`.
        // For UIDLEN (8), maxAsOctalChar is TarConstants.MAXID = 2^24-1.
        // For SIZELEN (12), maxAsOctalChar is TarConstants.MAXSIZE = 2^47-1 (or 2^31-1 for older versions).
        // The `length` parameter is critical here.
        // If length is 12, maxAsOctalChar is 2^47-1.
        // If length is 8, maxAsOctalChar is 2^24-1.
        // Let's test with length=9, which is not explicitly covered by UIDLEN or SIZELEN.
        // The `maxAsOctalChar` logic is:
        // `final long maxAsOctalChar = length == TarConstants.UIDLEN ? TarConstants.MAXID : TarConstants.MAXSIZE;`
        // This means for length=9, `maxAsOctalChar` will be `TarConstants.MAXSIZE`, which is 2^47-1.
        // A value larger than 2^47-1 should trigger binary.
        long value = (1L << 47); // This value is 2^47, which is > MAXSIZE
        int length = 9;
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatLongOctalOrBinaryBytes(value, buf, offset, length));
        assertEquals((byte)0x80, buf[offset]); // Indicates positive binary
        // Check that the remaining bytes are filled with 0s
        for(int i = 1; i < length; i++) {
            assertEquals((byte)0, buf[i]);
        }
    }
}
```