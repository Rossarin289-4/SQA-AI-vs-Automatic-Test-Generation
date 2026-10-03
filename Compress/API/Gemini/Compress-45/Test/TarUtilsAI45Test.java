package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsAI45Test {

    @Test
    public void testParseOctalNormal() {
        byte[] buffer = "123 \0".getBytes();
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(83L, val); // "123" in octal is 1*64 + 2*8 + 3 = 83
    }

    @Test
    public void testParseOctalLeadingZeroAndSpaces() {
        byte[] buffer = "  0123 \0".getBytes();
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(83L, val); // 123 octal = 83 decimal
    }

    @Test
    public void testParseOctalAllNulls() {
        byte[] buffer = new byte[8];
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, val);
    }

    @Test
    public void testParseOctalLeadingNull() {
        byte[] buffer = new byte[8];
        buffer[0] = 0;
        buffer[1] = '1';
        buffer[2] = '2';
        long val = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, val);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalTooShortLength() {
        byte[] buffer = "1".getBytes();
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidDigit() {
        byte[] buffer = "129 \0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = new byte[] { 1 };
        Assert.assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = new byte[] { 0 };
        Assert.assertFalse(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        Assert.assertEquals("0000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalStringValue() {
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(9L, buffer, 0, 4); // 9 decimal = 11 octal
        Assert.assertEquals("0011", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(64L, buffer, 0, 2); // 64 decimal = 100 octal, doesn't fit in 2 chars
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(8L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        // Octal 8 is "10", padded with leading zeros for length-2 (6 chars) -> "000010 ", 0
        Assert.assertEquals(' ', buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(7L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals(' ', buffer[7]);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, 4, 5 };
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(15L, sum);
    }
}
