package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsAI7Test {

    @Test
    public void testParseOctalValid() {
        byte[] buffer = "0000755\0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(493L, result);
    }

    @Test
    public void testParseOctalWithLeadingSpacesAndTrailingNull() {
        byte[] buffer = "  755\0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(493L, result);
    }

    @Test
    public void testParseOctalWithTrailingSpace() {
        byte[] buffer = "755 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(493L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidDigit() {
        byte[] buffer = "758\0".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseNameValid() {
        byte[] buffer = "hello\0world".getBytes();
        String name = TarUtils.parseName(buffer, 0, 8);
        Assert.assertEquals("hello", name);
    }

    @Test
    public void testParseNameFullLength() {
        byte[] buffer = "tarfile".getBytes();
        String name = TarUtils.parseName(buffer, 0, 7);
        Assert.assertEquals("tarfile", name);
    }

    @Test
    public void testFormatNameBytesShortName() {
        byte[] buf = new byte[10];
        int nextOffset = TarUtils.formatNameBytes("test", buf, 2, 6);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals('t', buf[2]);
        Assert.assertEquals('e', buf[3]);
        Assert.assertEquals('s', buf[4]);
        Assert.assertEquals('t', buf[5]);
        Assert.assertEquals(0, buf[6]);
        Assert.assertEquals(0, buf[7]);
    }

    @Test
    public void testFormatUnsignedOctalStringZero() {
        byte[] buf = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buf, 0, 4);
        Assert.assertEquals("0000", new String(buf));
    }

    @Test
    public void testFormatUnsignedOctalStringNonZero() {
        byte[] buf = new byte[6];
        TarUtils.formatUnsignedOctalString(9L, buf, 0, 6);
        Assert.assertEquals("000011", new String(buf));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buf = new byte[2];
        TarUtils.formatUnsignedOctalString(1000L, buf, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buf = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(755L, buf, 0, 8);
        Assert.assertEquals(8, nextOffset);
        // Expecting unsigned octal, followed by space and NUL
        String s = new String(buf);
        Assert.assertTrue(s.endsWith(" \0"));
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buf = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(755L, buf, 0, 8);
        Assert.assertEquals(8, nextOffset);
        String s = new String(buf);
        Assert.assertTrue(s.endsWith(" "));
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buf = new byte[8];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(755L, buf, 0, 8);
        Assert.assertEquals(8, nextOffset);
        String s = new String(buf);
        Assert.assertTrue(s.contains("\0 "));
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buf = new byte[] { 1, 2, 3, (byte) 255 };
        long sum = TarUtils.computeCheckSum(buf);
        // 1 + 2 + 3 + 255 = 261
        Assert.assertEquals(261L, sum);
    }
}
