package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsAI35Test {

    @Test
    public void testParseOctalNormal() {
        byte[] buffer = "0000755 ".getBytes();
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(493L, value);
    }

    @Test
    public void testParseOctalWithNullsAndSpaces() {
        byte[] buffer = new byte[] { '0', '1', '2', '3', 0, 0 };
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(83L, value);
    }

    @Test
    public void testParseOctalLeadingNull() {
        byte[] buffer = new byte[] { 0, '1', '2', '3', ' ', 0 };
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalTooShortLength() {
        byte[] buffer = new byte[] { '1' };
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidDigit() {
        byte[] buffer = "0000899 ".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = new byte[] { 1 };
        boolean val = TarUtils.parseBoolean(buffer, 0);
        Assert.assertTrue(val);
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = new byte[] { 0 };
        boolean val = TarUtils.parseBoolean(buffer, 0);
        Assert.assertFalse(val);
    }

    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buffer = new byte[8];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, buffer.length);
        Assert.assertEquals("00000000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalStringNonZero() {
        byte[] buffer = new byte[8];
        TarUtils.formatUnsignedOctalString(123L, buffer, 0, buffer.length);
        Assert.assertEquals("00000173", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(1000L, buffer, 0, buffer.length);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, 4, 5 };
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(15L, sum);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(123L, buffer, 0, buffer.length);
        Assert.assertEquals(8, nextOffset);
        // last two should be space and NUL
        Assert.assertEquals(' ', buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }
}
