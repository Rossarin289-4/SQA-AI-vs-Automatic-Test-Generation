package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsAI24Test {

    @Test
    public void testParseOctalNormal() {
        byte[] buffer = new byte[] { ' ', '1', '2', '3', ' ', ' ' };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(123L, result);
    }

    @Test
    public void testParseOctalLeadingZero() {
        byte[] buffer = new byte[] { 0, '1', '2', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalTooShort() {
        byte[] buffer = new byte[] { '1' };
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidChar() {
        byte[] buffer = new byte[] { ' ', '1', '8', '3', ' ', 0 };
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
        byte[] buffer = new byte[8];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 8);
        Assert.assertEquals("00000000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalStringValue() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(9L, buffer, 0, 6);
        Assert.assertEquals("000011", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(64L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(8L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals(' ', buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(7L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals('7', buffer[7 - 1]);
        Assert.assertEquals(' ', buffer[7]);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, 4 };
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(10L, sum);
    }

    @Test
    public void testVerifyCheckSumInvalid() {
        byte[] header = new byte[512];
        boolean valid = TarUtils.verifyCheckSum(header);
        Assert.assertNotNull(Boolean.valueOf(valid));
    }
}
