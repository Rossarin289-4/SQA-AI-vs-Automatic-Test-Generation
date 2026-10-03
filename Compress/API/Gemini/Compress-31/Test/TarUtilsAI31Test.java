package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsAI31Test {

    @Test
    public void testParseOctalNormal() {
        byte[] buffer = " 000755 \0".getBytes();
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(493L, value);
    }

    @Test
    public void testParseOctalAllNuls() {
        byte[] buffer = new byte[8];
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, value);
    }

    @Test
    public void testParseOctalLeadingNul() {
        byte[] buffer = new byte[8];
        buffer[0] = 0;
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidLength() {
        byte[] buffer = new byte[1];
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidByte() {
        byte[] buffer = " 000855 \0".getBytes();
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
    public void testFormatUnsignedOctalString() {
        byte[] buffer = new byte[8];
        TarUtils.formatUnsignedOctalString(493L, buffer, 0, 8);
        String result = new String(buffer);
        Assert.assertEquals("00000755", result);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(493L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals(' ', (char) buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(493L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals(' ', (char) buffer[7]);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(493L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals(' ', (char) buffer[7]);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, 4, 5 };
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(15L, sum);
    }
}
