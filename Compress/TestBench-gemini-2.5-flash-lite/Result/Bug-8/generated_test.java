package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

public class TarUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testParseOctalValid() throws Exception {
        byte[] buffer = { ' ', '1', '2', '3', ' ', '\0' };
        assertEquals(83L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalValidNoTrailingSpaceOrNull() throws Exception {
        byte[] buffer = { ' ', '1', '2', '3' };
        assertEquals(83L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalAllNuls() throws Exception {
        byte[] buffer = { '\0', '\0', '\0', '\0' };
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }
    
    @Test
    public void testParseOctalAllSpaces() throws Exception {
        byte[] buffer = { ' ', ' ', ' ', ' ' };
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalLeadingSpaces() throws Exception {
        byte[] buffer = { ' ', ' ', '1', '0', ' ', '\0' };
        assertEquals(8L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalOnlyTrailingSpace() throws Exception {
        byte[] buffer = { ' ', ' ', ' ' };
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }
    
    @Test
    public void testParseOctalOnlyTrailingNull() throws Exception {
        byte[] buffer = { '\0', '\0', '\0' };
        assertEquals(0L, TarUtils.parseOctal(buffer, 0, buffer.length));
    }

    @Test
    public void testParseOctalInvalidDigit() throws Exception {
        try {
            byte[] buffer = { '1', '8', '0', ' ' };
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid byte 8 at offset 1"));
        }
    }

    @Test
    public void testParseOctalMissingTrailingSpaceOrNull() throws Exception {
        try {
            byte[] buffer = { '1', '2', '3', '4' };
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid byte 4 at offset 3"));
        }
    }
    
    @Test
    public void testParseOctalLengthTooSmall() throws Exception {
        try {
            byte[] buffer = { '1' };
            TarUtils.parseOctal(buffer, 0, buffer.length);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            assertEquals("Length 1 must be at least 2", e.getMessage());
        }
    }

    @Test
    public void testParseNameBasic() throws Exception {
        byte[] buffer = { 'n', 'a', 'm', 'e', '\0', 'x', 'y' };
        assertEquals("name", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameEmpty() throws Exception {
        byte[] buffer = { '\0', 'x', 'y' };
        assertEquals("", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameNullTerminated() throws Exception {
        byte[] buffer = { 'n', 'a', 'm', 'e', '\0' };
        assertEquals("name", TarUtils.parseName(buffer, 0, buffer.length));
    }

    @Test
    public void testParseNameLengthLimited() throws Exception {
        byte[] buffer = { 'n', 'a', 'm', 'e', '\0', 'x', 'y' };
        assertEquals("nam", TarUtils.parseName(buffer, 0, 4));
    }
    
    @Test
    public void testParseNameLengthLimitedNoNull() throws Exception {
        byte[] buffer = { 'n', 'a', 'm', 'e', 'x', 'y' };
        assertEquals("name", TarUtils.parseName(buffer, 0, 5));
    }

    @Test
    public void testFormatNameBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        String name = "test";
        TarUtils.formatNameBytes(name, buf, 0, buf.length);
        assertArrayEquals(new byte[] { 't', 'e', 's', 't', 0, 0, 0, 0, 0, 0 }, buf);
    }

    @Test
    public void testFormatNameBytesTruncated() throws Exception {
        byte[] buf = new byte[3];
        String name = "test";
        TarUtils.formatNameBytes(name, buf, 0, buf.length);
        assertArrayEquals(new byte[] { 't', 'e', 's' }, buf);
    }

    @Test
    public void testFormatNameBytesOffset() throws Exception {
        byte[] buf = new byte[10];
        String name = "test";
        TarUtils.formatNameBytes(name, buf, 2, 5);
        assertArrayEquals(new byte[] { 0, 0, 't', 'e', 's', 't', 0, 0, 0, 0 }, buf);
    }

    @Test
    public void testFormatUnsignedOctalStringZero() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(0, buffer, 0, buffer.length);
        assertArrayEquals(new byte[] { '0', '0', '0', '0', '0' }, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringPositive() throws Exception {
        byte[] buffer = new byte[5];
        TarUtils.formatUnsignedOctalString(123, buffer, 0, buffer.length);
        assertArrayEquals(new byte[] { '0', '0', '0', '1', '7', '3' }, buffer); // 123 decimal is 173 octal
    }
    
    @Test
    public void testFormatUnsignedOctalStringFitsExactly() throws Exception {
        byte[] buffer = new byte[3];
        TarUtils.formatUnsignedOctalString(123, buffer, 0, buffer.length);
        assertArrayEquals(new byte[] { '1', '7', '3' }, buffer);
    }

    @Test
    public void testFormatUnsignedOctalStringTooLarge() throws Exception {
        try {
            byte[] buffer = new byte[2];
            TarUtils.formatUnsignedOctalString(123, buffer, 0, buffer.length);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit in octal number buffer of length 2"));
        }
    }

    @Test
    public void testFormatOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatOctalBytes(123L, buf, 0, buf.length);
        assertArrayEquals(new byte[] { '0', '0', '1', '7', '3', ' ', '\0', 0, 0, 0 }, buf);
    }

    @Test
    public void testFormatOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        TarUtils.formatOctalBytes(0, buf, 0, buf.length);
        assertArrayEquals(new byte[] { '0', '0', '0', '0', ' ', '\0' }, buf);
    }

    @Test
    public void testFormatOctalBytesFitsExactly() throws Exception {
        byte[] buf = new byte[4]; // "173 0"
        TarUtils.formatOctalBytes(123L, buf, 0, buf.length);
        assertArrayEquals(new byte[] { '1', '7', '3', ' ' }, buf);
    }

    @Test
    public void testFormatOctalBytesTooLarge() throws Exception {
        try {
            byte[] buf = new byte[3]; // needs space for '173' and ' ' and '\0'
            TarUtils.formatOctalBytes(123L, buf, 0, buf.length);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit in octal number buffer of length 3"));
        }
    }

    @Test
    public void testFormatLongOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatLongOctalBytes(123L, buf, 0, buf.length);
        assertArrayEquals(new byte[] { '0', '0', '1', '7', '3', ' ', 0, 0, 0, 0 }, buf);
    }

    @Test
    public void testFormatLongOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        TarUtils.formatLongOctalBytes(0, buf, 0, buf.length);
        assertArrayEquals(new byte[] { '0', '0', '0', '0', ' ', 0 }, buf);
    }
    
    @Test
    public void testFormatLongOctalBytesFitsExactly() throws Exception {
        byte[] buf = new byte[4]; // "173 "
        TarUtils.formatLongOctalBytes(123L, buf, 0, buf.length);
        assertArrayEquals(new byte[] { '1', '7', '3', ' ' }, buf);
    }

    @Test
    public void testFormatLongOctalBytesTooLarge() throws Exception {
        try {
            byte[] buf = new byte[3]; // needs space for '173' and ' '
            TarUtils.formatLongOctalBytes(123L, buf, 0, buf.length);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit in octal number buffer of length 3"));
        }
    }

    @Test
    public void testFormatCheckSumOctalBytesBasic() throws Exception {
        byte[] buf = new byte[10];
        TarUtils.formatCheckSumOctalBytes(123L, buf, 0, buf.length);
        assertArrayEquals(new byte[] { '0', '0', '1', '7', '3', '\0', ' ', 0, 0, 0 }, buf);
    }

    @Test
    public void testFormatCheckSumOctalBytesZero() throws Exception {
        byte[] buf = new byte[5];
        TarUtils.formatCheckSumOctalBytes(0, buf, 0, buf.length);
        assertArrayEquals(new byte[] { '0', '0', '0', '0', '\0', ' ' }, buf);
    }
    
    @Test
    public void testFormatCheckSumOctalBytesFitsExactly() throws Exception {
        byte[] buf = new byte[4]; // "173\0 "
        TarUtils.formatCheckSumOctalBytes(123L, buf, 0, buf.length);
        assertArrayEquals(new byte[] { '1', '7', '3', '\0' }, buf);
    }

    @Test
    public void testFormatCheckSumOctalBytesTooLarge() throws Exception {
        try {
            byte[] buf = new byte[3]; // needs space for '173', '\0', ' '
            TarUtils.formatCheckSumOctalBytes(123L, buf, 0, buf.length);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("will not fit in octal number buffer of length 3"));
        }
    }

    @Test
    public void testComputeCheckSumBasic() throws Exception {
        byte[] buf = { 'a', 'b', 'c' }; // 97 + 98 + 99 = 294
        assertEquals(294L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSumAllZeros() throws Exception {
        byte[] buf = new byte[5];
        assertEquals(0L, TarUtils.computeCheckSum(buf));
    }

    @Test
    public void testComputeCheckSumWithMaxByte() throws Exception {
        byte[] buf = { (byte) 255, 10, 20 }; // 255 + 10 + 20 = 285
        assertEquals(285L, TarUtils.computeCheckSum(buf));
    }
    
    @Test
    public void testComputeCheckSumEmpty() throws Exception {
        byte[] buf = new byte[0];
        assertEquals(0L, TarUtils.computeCheckSum(buf));
    }
}
