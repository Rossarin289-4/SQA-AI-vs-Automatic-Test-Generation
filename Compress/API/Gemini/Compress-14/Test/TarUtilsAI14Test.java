package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsAI14Test {

    @Test
    public void testParseOctalValid() {
        byte[] buffer = "0000077 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(63L, result);
    }

    @Test
    public void testParseOctalLeadingZero() {
        byte[] buffer = "\000000077 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalTooShort() {
        byte[] buffer = "1".getBytes();
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidTrailer() {
        byte[] buffer = "0000077X".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseBooleanTrue() {
        byte[] buffer = new byte[] { 1 };
        boolean result = TarUtils.parseBoolean(buffer, 0);
        Assert.assertTrue(result);
    }

    @Test
    public void testParseBooleanFalse() {
        byte[] buffer = new byte[] { 0 };
        boolean result = TarUtils.parseBoolean(buffer, 0);
        Assert.assertFalse(result);
    }

    @Test
    public void testParseNameNormal() {
        byte[] buffer = "hello\0world".getBytes();
        String result = TarUtils.parseName(buffer, 0, buffer.length);
        Assert.assertEquals("hello", result);
    }

    @Test
    public void testFormatNameBytes() {
        byte[] buffer = new byte[10];
        int nextOffset = TarUtils.formatNameBytes("test", buffer, 2, 6);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals('t', buffer[2]);
        Assert.assertEquals('e', buffer[3]);
        Assert.assertEquals(0, buffer[6]);
    }

    @Test
    public void testFormatUnsignedOctalString() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(9L, buffer, 0, 6);
        String s = new String(buffer);
        Assert.assertEquals("000011", s);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(1000L, buffer, 0, 2);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, 4, 5 };
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(15L, sum);
    }
}
