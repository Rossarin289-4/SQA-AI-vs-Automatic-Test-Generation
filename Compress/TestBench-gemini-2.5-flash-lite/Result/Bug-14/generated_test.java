package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.StandardCharsets;

public class TarUtilsTest {

    @Test
    public void testParseOctalBasic() throws Exception {
        byte[] buffer = "123 ".getBytes(StandardCharsets.US_ASCII);
        assertEquals(83, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalWithTrailingNul() throws Exception {
        byte[] buffer = "456\0".getBytes(StandardCharsets.US_ASCII);
        assertEquals(302, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalWithLeadingSpaces() throws Exception {
        byte[] buffer = "  789 ".getBytes(StandardCharsets.US_ASCII);
        assertEquals(505, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalAllZeros() throws Exception {
        byte[] buffer = "0000".getBytes(StandardCharsets.US_ASCII);
        // The method handles '0' as a valid octal digit, and parsing continues until the trailer.
        // For "0000" with length 4, it parses all zeros and returns 0.
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalWithNulAndSpaceTrailer() throws Exception {
        byte[] buffer = "123\0 ".getBytes(StandardCharsets.US_ASCII);
        assertEquals(83, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalEmptyBufferContent() throws Exception {
        // This test case covers the scenario where the buffer contains only spaces and NULs
        byte[] buffer = "   \0 ".getBytes(StandardCharsets.US_ASCII);
        // It skips leading spaces, then finds a trailer (' ') and an additional trailer (NUL).
        // The loop for parsing digits runs from start to end, which becomes the same, so result is 0.
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalLengthLessThanTwo() throws Exception {
        try {
            byte[] buffer = "1".getBytes(StandardCharsets.US_ASCII);
            TarUtils.parseOctal(buffer, 0, 1);
            fail("Expected IllegalArgumentException for length less than 2");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Length 1 must be at least 2"));
        }
    }

    @Test
    public void testParseOctalInvalidByte() throws Exception {
        byte[] buffer = "12A ".getBytes(StandardCharsets.US_ASCII);
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException for invalid byte");
        } catch (IllegalArgumentException e) {
            // The byte 'A' is ASCII 65. It's invalid because it's not '0'-'7'.
            assertTrue(e.getMessage().contains("Invalid byte 65 at offset 2 in '12A ' len=4"));
        }
    }

    @Test
    public void testParseOctalMissingTrailingSpaceOrNul() throws Exception {
        byte[] buffer = "123".getBytes(StandardCharsets.US_ASCII);
        try {
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException for missing trailer");
        } catch (IllegalArgumentException e) {
            // The last byte is '3' (ASCII 51), which is not a space or NUL.
            assertTrue(e.getMessage().contains("Invalid byte 51 at offset 2 in '123' len=3"));
        }
    }

    @Test
    public void testParseOctalOrBinaryBasicOctal() throws Exception {
        byte[] buffer = "123 ".getBytes(StandardCharsets.US_ASCII);
        assertEquals(83, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinaryBasicBinary() throws Exception {
        // Represents 257 (0x0101)
        byte[] buffer = {(byte) 0x81, 0x01};
        assertEquals(257, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinaryBinaryWithMoreBytes() throws Exception {
        // Represents 65537 (0x010001)
        byte[] buffer = {(byte) 0x81, 0x00, 0x01};
        assertEquals(65537, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinaryBinaryLargeValue() throws Exception {
        // Represents a large binary value that fits in long
        // This value is (1L << 63) - 1 which is the maximum positive signed long.
        // The first byte is 0x80, meaning the MSB is set, and the rest is interpreted as binary.
        // The logic `val = (val << 8) + (buffer[offset + i] & 0xff);` correctly constructs the long.
        // However, the current test has a bug in its expected value calculation.
        // Let's recalculate:
        // buffer[0] & 0x7f = 0x80 & 0x7f = 0
        // val = 0 << 8 + (buffer[1] & 0xff) = 0xFF = 255
        // val = 255 << 8 + (buffer[2] & 0xff) = 255 << 8 + 0xFF = 65280 + 255 = 65535
        // ... continuing this for all 7 bytes after the first one, it will result in a large number.
        // The intent is to test a large value that *is* representable as a signed long.
        // Let's construct a specific large value.
        // Example: 0x0102030405060708 shifted into the low bits after the MSB of the first byte is masked.
        // For a value like 0x7FFFFFFFFFFFFFFF (max positive signed long), the first byte should be 0x7F if interpreted as binary.
        // But here the first byte is 0x80, meaning the value starts with 0 and then the rest is appended.
        // A value like 0x00FFFFFFFFFFFFFF would be represented as { (byte)0x80, (byte)0xFF, ..., (byte)0xFF }.
        // Let's test a value that is indeed Long.MAX_VALUE.
        // The code `buffer[offset] & 0x7f` masks the MSB.
        // If buffer[0] is 0x80, then buffer[0] & 0x7f is 0.
        // The loop then adds the subsequent bytes.
        // If we want to represent Long.MAX_VALUE (0x7FFFFFFFFFFFFFFF), the binary representation would require
        // the most significant bits to be 0. A leading 0x80 indicates a binary number, and `buffer[offset] & 0x7f`
        // correctly handles the first byte's value.
        // The provided test case `{(byte) 0x80, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF}`
        // means:
        // val = 0x80 & 0x7f = 0
        // val = (0 << 8) + 0xFF = 255
        // val = (255 << 8) + 0xFF = 65535
        // ... and so on.
        // After 7 shifts and additions of 0xFF, the value will be (255 * 2^56) + (255 * 2^48) + ... + 255
        // This calculation is complex.
        // The current implementation seems to handle `buffer[offset] & 0x7f` as the starting value.
        // Let's use a simple large binary number: 0x0102030405060708
        // This would be represented as: {(byte)0x81, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08}
        long expected = 0x0102030405060708L;
        byte[] buffer = {(byte)0x81, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
        assertEquals(expected, TarUtils.parseOctalOrBinary(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOrBinaryBinaryExceedsLong() throws Exception {
        // Value that exceeds maximum signed long when interpreted as binary
        // A value that would overflow a signed long. For example, if the first byte's
        // value after masking 0x7f is already large, and then we shift and add more bytes.
        // The condition `val >= (1L << (63 - 8))` checks if adding the next byte will overflow.
        // A value like 0x808080808080808080 would overflow.
        // The first byte is 0x80. So val starts as 0.
        // The loop goes up to length-1.
        // If length is 9, and all bytes are 0xff after the first 0x80.
        // {(byte)0x80, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF}
        byte[] buffer = {(byte)0x80, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF};
        try {
            TarUtils.parseOctalOrBinary(buffer, 0, buffer.length);
            fail("Expected IllegalArgumentException for binary number exceeding long");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("exceeds maximum signed long value"));
        }
    }

    @Test
    public void testParseBooleanTrue() throws Exception {
        byte[] buffer = {1, 'a'};
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() throws Exception {
        byte[] buffer = {0, 'b'};
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanWithLeadingSpaces() throws Exception {
        byte[] buffer = {' ', ' ', 1, 'c'};
        // The method `parseBoolean` checks `buffer[offset] == 1`.
        // It does not skip leading spaces. The offset must point to the byte to be checked.
        // If we want to test a true value at offset 2, it should be `buffer[2] == 1`.
        assertTrue(TarUtils.parseBoolean(buffer, 2));
    }

    @Test
    public void testParseBooleanWithTrailingSpaces() throws Exception {
        byte[] buffer = {1, ' ', ' '};
        // The method only checks the byte at the given offset. Trailing spaces are irrelevant.
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanWithNul() throws Exception {
        byte[] buffer = {1, 0};
        // The method only checks the byte at the given offset.
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanInvalidByte() throws Exception {
        byte[] buffer = {2, 'd'};
        // The implementation returns false for anything not 1.
        assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseNameBasic() throws Exception {
        byte[] buffer = "filename".getBytes(StandardCharsets.US_ASCII);
        assertEquals("filename", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameWithTrailingNul() throws Exception {
        byte[] buffer = "filename\0".getBytes(StandardCharsets.US_ASCII);
        assertEquals("filename", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameWithNulInMiddle() throws Exception {
        byte[] buffer = "file\0name".getBytes(StandardCharsets.US_ASCII);
        assertEquals("file", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameEmpty() throws Exception {
        byte[] buffer = "".getBytes(StandardCharsets.US_ASCII);
        assertEquals("", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameFullBuffer() throws Exception {
        byte[] buffer = "longfilename".getBytes(StandardCharsets.US_ASCII);
        assertEquals("longfilename", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameTruncated() throws Exception {
        byte[] buffer = "verylongfilename".getBytes(StandardCharsets.US_ASCII);
        // The length parameter dictates how many bytes are considered.
        // If length is 8, it reads up to 8 bytes or until a NUL.
        assertEquals("verylong", TarUtils.parseName(buffer, 0, 8));
    }

    @Test
    public void testParseNameWithOffset() throws Exception {
        byte[] buffer = "prefix_filename\0".getBytes(StandardCharsets.US_ASCII);
        // offset = 7, length = buffer.length - 7
        // It should read "filename\0". The loop breaks at NUL.
        assertEquals("filename", TarUtils.parseName(buffer, 7, buffer.length - 7));
    }

    @Test
    public void testFormatNameBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        String name = "test";
        int length = 10; // The length of the buffer to fill.
        int offset = 0;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, offset, length));
        // The name is "test". It fills the first 4 bytes. The remaining 6 are NUL.
        // The expected array should have 't','e','s','t',0,0,0,0,0,0
        byte[] expected = new byte[10];
        System.arraycopy(name.getBytes(StandardCharsets.US_ASCII), 0, expected, 0, name.length());
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatNameBytesTruncated() throws Exception {
        byte[] buf = new byte[5];
        String name = "longtestname";
        int offset = 0;
        int length = 5;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, offset, length));
        // Only the first 'length' characters of the name are copied.
        assertArrayEquals("longt".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatNameBytesEmptyName() throws Exception {
        byte[] buf = new byte[5];
        String name = "";
        int offset = 0;
        int length = 5;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, offset, length));
        // Empty name should result in a buffer filled with NULs.
        assertArrayEquals(new byte[]{0, 0, 0, 0, 0}, buf);
    }

    @Test
    public void testFormatNameBytesWithOffset() throws Exception {
        byte[] buf = new byte[15];
        String name = "test";
        int offset = 5;
        int length = 10;
        int expectedOffset = offset + length;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, offset, length));
        // The name "test" should be written starting at offset 5.
        // The remaining bytes up to offset+length are NUL padded.
        byte[] expected = new byte[15];
        System.arraycopy(name.getBytes(StandardCharsets.US_ASCII), 0, expected, offset, name.length());
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatUnsignedOctalStringBasic() throws Exception {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        TarUtils.formatUnsignedOctalString(123, buffer, offset, length);
        // Value 123 in octal is 173.
        // The method pads with leading zeros from the left.
        // So, 10 bytes total: 10 - 3 (digits) = 7 leading zeros.
        // "000000173"
        assertArrayEquals("000000173".getBytes(StandardCharsets.US_ASCII), buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringZero() throws Exception {
        byte[] buffer = new byte[5];
        int offset = 0;
        int length = 5;
        TarUtils.formatUnsignedOctalString(0, buffer, offset, length);
        // For value 0, it places '0' at the last position and fills the rest with leading zeros.
        assertArrayEquals("00000".getBytes(StandardCharsets.US_ASCII), buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringLargeValueFits() throws Exception {
        byte[] buffer = new byte[10]; // Fits 8 octal digits + padding
        // Value 65535 decimal = 177777 octal. This is 6 digits.
        // Length is 10. So 10 - 6 = 4 leading zeros.
        // "0000177777"
        TarUtils.formatUnsignedOctalString(65535, buffer, 0, 10);
        assertArrayEquals("0000177777".getBytes(StandardCharsets.US_ASCII), buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringMaxValue() throws Exception {
        byte[] buffer = new byte[22]; // Fits 21 octal digits for Long.MAX_VALUE
        TarUtils.formatUnsignedOctalString(Long.MAX_VALUE, buffer, 0, 22);
        // Long.MAX_VALUE in octal is 777777777777777777777 (21 digits).
        // Length is 22. So 22 - 21 = 1 leading zero.
        // "0777777777777777777777"
        assertEquals("0777777777777777777777", new String(buffer, StandardCharsets.US_ASCII));
    }

    @Test
    public void testFormatUnsignedOctalStringValueTooLarge() throws Exception {
        byte[] buffer = new byte[5]; // Too small for 65535 (which needs 6 digits in octal)
        try {
            TarUtils.formatUnsignedOctalString(65535, buffer, 0, 5);
            fail("Expected IllegalArgumentException for value too large");
        } catch (IllegalArgumentException e) {
            // The error message includes the original value and the buffer length.
            assertTrue(e.getMessage().contains("will not fit in octal number buffer of length 5"));
        }
    }

    @Test
    public void testFormatOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        int length = 10; // The total length of the buffer to fill.
        TarUtils.formatOctalBytes(83, buf, 0, length);
        // Value 83 decimal = 123 octal.
        // `formatUnsignedOctalString` is called with `idx = length - 2`, so `idx = 8`.
        // This means the octal string will be formatted into `buffer[0..7]`.
        // For 123 (3 digits), it will be "00000123".
        // Then, `buf[offset + idx++] = (byte) ' ';` makes `buf[8] = ' '`.
        // And `buf[offset + idx] = 0;` makes `buf[9] = 0`.
        // So: "00000123 \0"
        assertArrayEquals("00000123 \0".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        int length = 5;
        TarUtils.formatOctalBytes(0, buf, 0, length);
        // `idx = length - 2 = 3`.
        // `formatUnsignedOctalString` is called with length 3. For 0, it sets `buffer[2] = '0'`.
        // So `buffer[0..2]` becomes "000".
        // `buf[offset + idx++] = (byte) ' ';` makes `buf[3] = ' '`.
        // `buf[offset + idx] = 0;` makes `buf[4] = 0`.
        // So: "000 \0"
        assertArrayEquals("000 \0".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatOctalBytesMaxValueFits() throws Exception {
        byte[] buf = new byte[12];
        int length = 12;
        // Value 65535 decimal = 177777 octal (6 digits).
        TarUtils.formatOctalBytes(65535, buf, 0, length);
        // `idx = length - 2 = 10`.
        // `formatUnsignedOctalString` is called with length 10.
        // For 177777, it will be "0000177777".
        // `buf[offset + idx++] = (byte) ' ';` makes `buf[10] = ' '`.
        // `buf[offset + idx] = 0;` makes `buf[11] = 0`.
        // So: "0000177777 \0"
        assertArrayEquals("0000177777 \0".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatOctalBytesValueTooLarge() throws Exception {
        byte[] buf = new byte[5]; // Too small for value=83 (needs at least 3 digits for octal), space, and NUL.
        int length = 5;
        try {
            TarUtils.formatOctalBytes(83, buf, 0, length);
            fail("Expected IllegalArgumentException for value too large");
        } catch (IllegalArgumentException e) {
            // The `formatUnsignedOctalString` will throw this exception.
            assertTrue(e.getMessage().contains("will not fit in octal number buffer of length 3")); // idx is length-2
        }
    }

    @Test
    public void testFormatLongOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        int length = 10;
        TarUtils.formatLongOctalBytes(83, buf, 0, length);
        // `idx = length - 1 = 9`.
        // `formatUnsignedOctalString` is called with length 9.
        // For 83 (123 octal, 3 digits), it will be "000000123".
        // `buf[offset + idx] = (byte) ' ';` makes `buf[9] = ' '`.
        // So: "000000123 "
        assertArrayEquals("000000123 ".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatLongOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        int length = 5;
        TarUtils.formatLongOctalBytes(0, buf, 0, length);
        // `idx = length - 1 = 4`.
        // `formatUnsignedOctalString` is called with length 4. For 0, it sets `buffer[3] = '0'`.
        // So `buffer[0..3]` becomes "0000".
        // `buf[offset + idx] = (byte) ' ';` makes `buf[4] = ' '`.
        // So: "0000 "
        assertArrayEquals("0000 ".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatLongOctalBytesMaxValueFits() throws Exception {
        byte[] buf = new byte[12];
        int length = 12;
        // Value 65535 decimal = 177777 octal (6 digits).
        TarUtils.formatLongOctalBytes(65535, buf, 0, length);
        // `idx = length - 1 = 11`.
        // `formatUnsignedOctalString` is called with length 11.
        // For 177777, it will be "00000177777".
        // `buf[offset + idx] = (byte) ' ';` makes `buf[11] = ' '`.
        // So: "00000177777 "
        assertArrayEquals("00000177777 ".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatLongOctalBytesValueTooLarge() throws Exception {
        byte[] buf = new byte[5]; // Too small for value=83 (needs 3 digits for octal) and space.
        int length = 5;
        try {
            TarUtils.formatLongOctalBytes(83, buf, 0, length);
            fail("Expected IllegalArgumentException for value too large");
        } catch (IllegalArgumentException e) {
            // The `formatUnsignedOctalString` will throw this exception.
            assertTrue(e.getMessage().contains("will not fit in octal number buffer of length 4")); // idx is length-1
        }
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesOctalFits() throws Exception {
        // Assuming TarConstants.UIDLEN = 8. Max value for octal is 0x1FFFFF (2097151).
        // Value 83 fits as octal.
        byte[] buf = new byte[8];
        int length = 8;
        TarUtils.formatLongOctalOrBinaryBytes(83, buf, 0, length);
        // Should call formatLongOctalBytes.
        // `idx = length - 1 = 7`.
        // `formatUnsignedOctalString` called with length 7. For 83 (123 octal), it's "0000123".
        // `buf[offset + idx] = (byte) ' ';` makes `buf[7] = ' '`.
        // So: "0000123 "
        assertArrayEquals("0000123 ".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesBinaryRequired() throws Exception {
        // Value larger than max for octal, should be stored as binary.
        // TarConstants.MAXID = 0x1FFFFF. A value slightly larger, like 0x200000.
        byte[] buf = new byte[8]; // UIDLEN = 8
        long largeValue = 0x200000L; // Larger than TarConstants.MAXID (0x1FFFFF)
        TarUtils.formatLongOctalOrBinaryBytes(largeValue, buf, 0, 8);
        // Expected binary representation, MSB set.
        // The value is split into bytes.
        // The highest byte needs to be shifted to align with the 64-bit long.
        // For 0x200000, it's 2097152.
        // In binary (64-bit): 0000 0000 0000 0000 0000 0010 0000 0000 0000 0000
        // The method writes the value into the buffer from right to left.
        // buf[7] = (byte) val & 0xFF = 0
        // val >>= 8
        // buf[6] = (byte) val & 0xFF = 0
        // ...
        // buf[2] = (byte) val & 0xFF = 0x02
        // buf[1] = (byte) val & 0xFF = 0x00
        // buf[0] = (byte) val & 0xFF = 0x00 (after shifts).
        // Then buf[0] |= 0x80. So buf[0] becomes 0x80.
        byte[] expected = new byte[8];
        expected[0] = (byte) 0x80; // MSB set
        expected[1] = (byte) 0x00;
        expected[2] = (byte) 0x00;
        expected[3] = (byte) 0x00;
        expected[4] = (byte) 0x00;
        expected[5] = (byte) 0x00;
        expected[6] = (byte) 0x00;
        expected[7] = (byte) 0x00;
        assertArrayEquals(expected, buf);
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesTooLargeForBinary() throws Exception {
        byte[] buf = new byte[8]; // UIDLEN = 8
        // A value that, when interpreted as a signed 64-bit integer, would be negative or too large.
        // If the MSB of the most significant byte written becomes 1 after `buf[offset] |= 0x80`, it's an issue.
        // The method checks `(buf[offset] & 0x80) != 0`.
        // If `value` is such that after writing to the buffer and setting the MSB, the number
        // represented by `buf` (interpreted as signed) is negative, it throws an error.
        // The check is `if (val != 0 || (buf[offset] & 0x80) != 0)` after filling the buffer with binary data.
        // This means if `val` is non-zero after shifts (indicating overflow beyond the buffer bytes) OR
        // if the MSB of the first byte in the buffer is set, it throws.
        // The condition `(buf[offset] & 0x80) != 0` is intended to catch values that result in a negative signed long.
        // Consider a value that fills all 8 bytes and results in the first byte having its MSB set.
        // For example, if the value is such that after shifts, `buf[0]` becomes `0xFF`. Then `0xFF | 0x80` will still have the MSB set.
        // Let's try a value that would overflow a positive signed long.
        // 1L << 63 is the smallest negative long.
        // If we try to store 1L << 63, it will be placed in the buffer.
        // buf[0] would be 0x80. Then buf[0] |= 0x80 results in 0x80.
        // The condition `(buf[offset] & 0x80) != 0` would be true.
        long tooLargeValue = 1L << 63; // This value itself is negative.
        try {
            TarUtils.formatLongOctalOrBinaryBytes(tooLargeValue, buf, 0, 8);
            fail("Expected IllegalArgumentException for value too large");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("is too large for 8 byte field."));
        }
    }

    @Test
    public void testFormatLongOctalOrBinaryBytesMaxOctalValue() throws Exception {
        // TarConstants.MAXID is 0x1FFFFF (decimal 2097151).
        byte[] buf = new byte[8];
        TarUtils.formatLongOctalOrBinaryBytes(0x1FFFFF, buf, 0, 8);
        // Should still fit as octal. Calls formatLongOctalBytes.
        // `idx = length - 1 = 7`.
        // `formatUnsignedOctalString` called with length 7.
        // 0x1FFFFF octal is 1777777 (7 digits).
        // It will be "00177777".
        // `buf[offset + idx] = (byte) ' ';` makes `buf[7] = ' '`.
        // So: "00177777 "
        assertArrayEquals("00177777 ".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatCheckSumOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        int length = 10;
        TarUtils.formatCheckSumOctalBytes(83, buf, 0, length);
        // `idx = length - 2 = 8`.
        // `formatUnsignedOctalString` called with length 8.
        // For 83 (123 octal, 3 digits), it will be "00000123".
        // `buf[offset + idx++] = 0;` makes `buf[8] = 0`.
        // `buf[offset + idx] = (byte) ' ';` makes `buf[9] = ' '`.
        // So: "00000123\0 "
        assertArrayEquals("00000123\0 ".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatCheckSumOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        int length = 5;
        TarUtils.formatCheckSumOctalBytes(0, buf, 0, length);
        // `idx = length - 2 = 3`.
        // `formatUnsignedOctalString` called with length 3. For 0, it sets `buffer[2] = '0'`.
        // So `buffer[0..2]` becomes "000".
        // `buf[offset + idx++] = 0;` makes `buf[3] = 0`.
        // `buf[offset + idx] = (byte) ' ';` makes `buf[4] = ' '`.
        // So: "000\0 "
        assertArrayEquals("000\0 ".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatCheckSumOctalBytesMaxValueFits() throws Exception {
        byte[] buf = new byte[12];
        int length = 12;
        TarUtils.formatCheckSumOctalBytes(65535, buf, 0, length);
        // `idx = length - 2 = 10`.
        // `formatUnsignedOctalString` called with length 10.
        // For 65535 (177777 octal, 6 digits), it will be "0000177777".
        // `buf[offset + idx++] = 0;` makes `buf[10] = 0`.
        // `buf[offset + idx] = (byte) ' ';` makes `buf[11] = ' '`.
        // So: "0000177777\0 "
        assertArrayEquals("0000177777\0 ".getBytes(StandardCharsets.US_ASCII), buf);
    }

    @Test
    public void testFormatCheckSumOctalBytesValueTooLarge() throws Exception {
        byte[] buf = new byte[5]; // Too small for value=83 (needs 3 digits for octal), NUL, and space.
        int length = 5;
        try {
            TarUtils.formatCheckSumOctalBytes(83, buf, 0, length);
            fail("Expected IllegalArgumentException for value too large");
        } catch (IllegalArgumentException e) {
            // The `formatUnsignedOctalString` will throw this exception.
            // The length for formatUnsignedOctalString is length-2 = 3.
            assertTrue(e.getMessage().contains("will not fit in octal number buffer of length 3"));
        }
    }

    @Test
    public void testComputeCheckSumBasic() throws Exception {
        byte[] buf = "12345".getBytes(StandardCharsets.US_ASCII);
        // Sum = '1' + '2' + '3' + '4' + '5'
        // ASCII: 49 + 50 + 51 + 52 + 53 = 255
        assertEquals(255, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSumWithNul() throws Exception {
        byte[] buf = {'1', '2', 0, '4', '5'};
        // Sum = '1' + '2' + 0 + '4' + '5'
        // ASCII: 49 + 50 + 0 + 52 + 53 = 204
        // The BYTE_MASK is 255, so each byte is treated as an unsigned value.
        assertEquals(204, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSumEmpty() throws Exception {
        byte[] buf = new byte[0];
        assertEquals(0, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSumAllZeros() throws Exception {
        byte[] buf = new byte[5]; // All zeros
        assertEquals(0, TarUtils.computeCheckSum(buf));
    }
}
