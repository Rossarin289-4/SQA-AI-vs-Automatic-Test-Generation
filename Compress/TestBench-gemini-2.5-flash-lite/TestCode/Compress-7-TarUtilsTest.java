package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

public class TarUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseOctalWithNullTerminator() throws Exception {
        byte[] buffer = { '1', '2', '3', 0, '4', '5' };
        assertEquals(123, TarUtils.parseOctal(buffer, 0, 6));
    }

    @Test
    public void testParseOctalWithSpaceTerminator() throws Exception {
        byte[] buffer = { '1', '2', '3', ' ', '4', '5' };
        assertEquals(123, TarUtils.parseOctal(buffer, 0, 6));
    }

    @Test
    public void testParseOctalWithLeadingSpacesAndZero() throws Exception {
        byte[] buffer = { ' ', '0', '0', '1', '2', '3' };
        assertEquals(123, TarUtils.parseOctal(buffer, 0, 6));
    }
    
    @Test
    public void testParseOctalWithOnlyZerosAndSpaces() throws Exception {
        byte[] buffer = { ' ', '0', ' ', '0' };
        assertEquals(0, TarUtils.parseOctal(buffer, 0, 4));
    }

    @Test
    public void testParseOctalWithEmptyBuffer() throws Exception {
        byte[] buffer = new byte[0];
        assertEquals(0, TarUtils.parseOctal(buffer, 0, 0));
    }

    @Test
    public void testParseOctalWithLengthZero() throws Exception {
        byte[] buffer = { '1', '2', '3' };
        assertEquals(0, TarUtils.parseOctal(buffer, 0, 0));
    }

    @Test
    public void testParseOctalWithLargeValue() throws Exception {
        // 777777777777777777 (18 octal digits)
        byte[] buffer = { '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7' };
        // The value is 037777777777777777777 which is 777777777777777777 in octal.
        // In decimal, this is (7 * 8^17 + ... + 7 * 8^0) = 36028797018963967
        assertEquals(36028797018963967L, TarUtils.parseOctal(buffer, 0, 18));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalWithInvalidDigit() throws Exception {
        byte[] buffer = { '1', '8', '3' };
        TarUtils.parseOctal(buffer, 0, 3);
    }

    @Test
    public void testParseNameWithNullTerminator() throws Exception {
        byte[] buffer = { 'n', 'a', 'm', 'e', 0, ' ' };
        assertEquals("name", TarUtils.parseName(buffer, 0, 6));
    }

    @Test
    public void testParseNameWithFullBuffer() throws Exception {
        byte[] buffer = { 'n', 'a', 'm', 'e' };
        assertEquals("name", TarUtils.parseName(buffer, 0, 4));
    }
    
    @Test
    public void testParseNameWithOffset() throws Exception {
        byte[] buffer = { ' ', 'n', 'a', 'm', 'e', 0 };
        assertEquals("name", TarUtils.parseName(buffer, 1, 6));
    }

    @Test
    public void testParseNameWithEmptyBuffer() throws Exception {
        byte[] buffer = new byte[5];
        assertEquals("", TarUtils.parseName(buffer, 0, 5));
    }

    @Test
    public void testParseNameWithLengthZero() throws Exception {
        byte[] buffer = { 'n', 'a', 'm', 'e' };
        assertEquals("", TarUtils.parseName(buffer, 0, 0));
    }
    
    @Test
    public void testFormatNameBytesTruncated() throws Exception {
        String name = "long name";
        byte[] buf = new byte[5];
        int expectedOffset = 5;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, 0, 5));
        assertArrayEquals(new byte[] { 'l', 'o', 'n', 'g', ' ' }, buf);
    }

    @Test
    public void testFormatNameBytesPadded() throws Exception {
        String name = "short";
        byte[] buf = new byte[10];
        int expectedOffset = 10;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, 0, 10));
        assertArrayEquals(new byte[] { 's', 'h', 'o', 'r', 't', 0, 0, 0, 0, 0 }, buf);
    }

    @Test
    public void testFormatNameBytesExactFit() throws Exception {
        String name = "exact";
        byte[] buf = new byte[5];
        int expectedOffset = 5;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, 0, 5));
        assertArrayEquals(new byte[] { 'e', 'x', 'a', 'c', 't' }, buf);
    }

    @Test
    public void testFormatNameBytesEmptyName() throws Exception {
        String name = "";
        byte[] buf = new byte[5];
        int expectedOffset = 5;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, 0, 5));
        assertArrayEquals(new byte[] { 0, 0, 0, 0, 0 }, buf);
    }
    
    @Test
    public void testFormatNameBytesZeroLength() throws Exception {
        String name = "name";
        byte[] buf = new byte[5];
        int expectedOffset = 0;
        assertEquals(expectedOffset, TarUtils.formatNameBytes(name, buf, 0, 0));
        assertArrayEquals(new byte[] { 0, 0, 0, 0, 0 }, buf);
    }

    @Test
    public void testFormatUnsignedOctalStringBasic() throws Exception {
        byte[] buffer = new byte[10];
        TarUtils.formatUnsignedOctalString(123, buffer, 0, 10);
        // Expected: 123 in octal is 173. Padded to length 10 means 7 leading zeros.
        assertArrayEquals(new byte[] { '0', '0', '0', '0', '0', '0', '1', '7', '3', 0 }, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringZero() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, 5);
        assertArrayEquals(new byte[] { '0', '0', '0', '0', '0' }, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringLargeValue() throws Exception {
        byte[] buffer = new byte[10];
        // The value 01234567012345670L in octal is 45954944846776 (decimal).
        // The method formats the value into the buffer. The buffer has length 10.
        // The octal representation of 45954944846776 is 1234567012345670.
        // This value (14 digits) cannot fit into a buffer of length 10.
        // The exception check below will catch this.
        // If the value was smaller and fit, e.g., 012345670L (86087 octal), it would be:
        // buffer[2..9] = '0', '1', '2', '3', '4', '5', '6', '7', '0'
        // But for this large value, it throws.
        try {
            TarUtils.formatUnsignedOctalString(01234567012345670L, buffer, 0, 10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringValueTooLarge() throws Exception {
        byte[] buffer = new byte[3]; // Too small for 1000 octal (which is 1750)
        TarUtils.formatUnsignedOctalString(1000, buffer, 0, 3);
    }
    
    @Test
    public void testFormatUnsignedOctalStringLengthOne() throws Exception {
        byte[] buffer = new byte[1];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, 1);
        assertArrayEquals(new byte[] { '0' }, buffer);
    }
    
    @Test
    public void testFormatUnsignedOctalStringLengthOneNonZero() throws Exception {
        byte[] buffer = new byte[1];
        // Value 1 in octal is 1. It fits in length 1.
        TarUtils.formatUnsignedOctalString(1, buffer, 0, 1);
        assertArrayEquals(new byte[] { '1' }, buffer);
    }

    @Test
    public void testFormatOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        int expectedOffset = 10;
        // Value 123 in octal is 173.
        // formatUnsignedOctalString(123, buf, 0, 8) will fill buf[0..7] with '0','0','0','0','0','1','7','3'.
        // Then ' ' is placed at buf[8], and 0 at buf[9].
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(123, buf, 0, 10));
        assertArrayEquals(new byte[] { '0', '0', '0', '0', '0', '0', '1', '7', '3', ' ' }, buf);
    }
    
    @Test
    public void testFormatOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        int expectedOffset = 5;
        // Value 0. formatUnsignedOctalString(0, buf, 0, 4) fills buf[0..3] with '0','0','0','0'.
        // Then ' ' at buf[4], and 0 at buf[5] (which is out of bounds for length 5).
        // The method uses length-2 for idx in formatUnsignedOctalString, so length 5 -> idx = 3.
        // formatUnsignedOctalString(0, buf, 0, 3) -> buf[0..2] = '0', '0', '0'.
        // Then ' ' at buf[3], 0 at buf[4].
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(0, buf, 0, 5));
        assertArrayEquals(new byte[] { '0', '0', '0', '0', ' ' }, buf);
    }

    @Test
    public void testFormatOctalBytesLengthSufficientForValueAndTrailer() throws Exception {
        byte[] buf = new byte[5]; // Fits '123 '
        int expectedOffset = 5;
        // Value 123. length = 5. idx = 5-2 = 3.
        // formatUnsignedOctalString(123, buf, 0, 3) -> buf[0..2] = '0','0','1'. val = 123.
        // remaining = 2. buffer[0+2] = '1'. val = 15.
        // remaining = 1. buffer[0+1] = '7'. val = 1.
        // remaining = 0. buffer[0+0] = '1'. val = 0.
        // So buf[0..2] becomes '1', '7', '3'.
        // Then ' ' at buf[3], 0 at buf[4].
        assertEquals(expectedOffset, TarUtils.formatOctalBytes(123, buf, 0, 5));
        assertArrayEquals(new byte[] { '1', '7', '3', ' ', 0 }, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatOctalBytesTooShort() throws Exception {
        byte[] buf = new byte[2]; // Too short for '123 '
        // length = 2. idx = 2-2 = 0.
        // formatUnsignedOctalString(123, buf, 0, 0) -> remaining = -1. val = 123.
        // val is not 0, remaining < 0. Throws IllegalArgumentException.
        TarUtils.formatOctalBytes(123, buf, 0, 2);
    }

    @Test
    public void testFormatLongOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        int expectedOffset = 10;
        // Value 123. Length 10. idx = 10-1 = 9.
        // formatUnsignedOctalString(123, buf, 0, 9) fills buf[0..8] with '0' * 6 + '173'.
        // Then ' ' at buf[9].
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(123, buf, 0, 10));
        assertArrayEquals(new byte[] { '0', '0', '0', '0', '0', '0', '1', '7', '3', ' ' }, buf);
    }
    
    @Test
    public void testFormatLongOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        int expectedOffset = 5;
        // Value 0. Length 5. idx = 5-1 = 4.
        // formatUnsignedOctalString(0, buf, 0, 4) fills buf[0..3] with '0','0','0','0'.
        // Then ' ' at buf[4].
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(0, buf, 0, 5));
        assertArrayEquals(new byte[] { '0', '0', '0', '0', ' ' }, buf);
    }
    
    @Test
    public void testFormatLongOctalBytesExactFit() throws Exception {
        byte[] buf = new byte[4]; // Fits '123 '
        int expectedOffset = 4;
        // Value 123. Length 4. idx = 4-1 = 3.
        // formatUnsignedOctalString(123, buf, 0, 3) fills buf[0..2] with '1', '7', '3'.
        // Then ' ' at buf[3].
        assertEquals(expectedOffset, TarUtils.formatLongOctalBytes(123, buf, 0, 4));
        assertArrayEquals(new byte[] { '1', '7', '3', ' ' }, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatLongOctalBytesTooShort() throws Exception {
        byte[] buf = new byte[1]; // Too short for '123 '
        // Length 1. idx = 1-1 = 0.
        // formatUnsignedOctalString(123, buf, 0, 0) -> remaining = -1. val = 123.
        // val is not 0, remaining < 0. Throws IllegalArgumentException.
        TarUtils.formatLongOctalBytes(123, buf, 0, 1);
    }
    
    @Test
    public void testFormatCheckSumOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        int expectedOffset = 10;
        // Value 123. Length 10. idx = 10-2 = 8.
        // formatUnsignedOctalString(123, buf, 0, 8) fills buf[0..7] with '0'*5 + '173'.
        // Then 0 at buf[8], and ' ' at buf[9].
        assertEquals(expectedOffset, TarUtils.formatCheckSumOctalBytes(123, buf, 0, 10));
        assertArrayEquals(new byte[] { '0', '0', '0', '0', '0', '0', '1', '7', '3', 0 }, buf);
    }
    
    @Test
    public void testFormatCheckSumOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        int expectedOffset = 5;
        // Value 0. Length 5. idx = 5-2 = 3.
        // formatUnsignedOctalString(0, buf, 0, 3) fills buf[0..2] with '0', '0', '0'.
        // Then 0 at buf[3], and ' ' at buf[4].
        assertEquals(expectedOffset, TarUtils.formatCheckSumOctalBytes(0, buf, 0, 5));
        assertArrayEquals(new byte[] { '0', '0', '0', 0, ' ' }, buf);
    }

    @Test
    public void testFormatCheckSumOctalBytesLengthSufficientForValueAndTrailer() throws Exception {
        byte[] buf = new byte[5]; // Fits '123\0'
        int expectedOffset = 5;
        // Value 123. Length 5. idx = 5-2 = 3.
        // formatUnsignedOctalString(123, buf, 0, 3) fills buf[0..2] with '1', '7', '3'.
        // Then 0 at buf[3], and ' ' at buf[4].
        assertEquals(expectedOffset, TarUtils.formatCheckSumOctalBytes(123, buf, 0, 5));
        assertArrayEquals(new byte[] { '1', '7', '3', 0, ' ' }, buf);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatCheckSumOctalBytesTooShort() throws Exception {
        byte[] buf = new byte[2]; // Too short for '123\0'
        // Length 2. idx = 2-2 = 0.
        // formatUnsignedOctalString(123, buf, 0, 0) -> remaining = -1. val = 123.
        // val is not 0, remaining < 0. Throws IllegalArgumentException.
        TarUtils.formatCheckSumOctalBytes(123, buf, 0, 2);
    }

    @Test
    public void testComputeCheckSumBasic() throws Exception {
        byte[] buf = { '1', '2', '3', ' ', 0 }; // ASCII: 49, 50, 51, 32, 0
        // sum = 49 + 50 + 51 + 32 + 0 = 182
        assertEquals(182, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSumWithFF() throws Exception {
        byte[] buf = { (byte) 0xFF, (byte) 0xFF }; // 255, 255
        assertEquals(255 + 255, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSumEmptyBuffer() throws Exception {
        byte[] buf = new byte[0];
        assertEquals(0, TarUtils.computeCheckSum(buf));
    }
    
    @Test
    public void testComputeCheckSumWithZeroes() throws Exception {
        byte[] buf = { 0, 0, 0 };
        assertEquals(0, TarUtils.computeCheckSum(buf));
    }
}
