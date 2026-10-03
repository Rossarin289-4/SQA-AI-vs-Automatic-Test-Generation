package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsAI8Test {

    @Test
    public void testParseOctalValid() {
        byte[] buffer = "123 ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(83L, result); // 123 octal = 1 * 64 + 2 * 8 + 3 = 83
    }

    @Test
    public void testParseOctalWithNullAndSpace() {
        byte[] buffer = new byte[] { '1', '2', '3', (byte) ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(83L, result);
    }

    @Test
    public void testParseOctalAllNulls() {
        byte[] buffer = new byte[] { 0, 0, 0, 0 };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalLengthTooShort() {
        byte[] buffer = "1".getBytes();
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidTrailer() {
        byte[] buffer = "123X".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalInvalidDigit() {
        byte[] buffer = "193 ".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testParseNameNormal() {
        byte[] buffer = new byte[] { 't', 'e', 's', 't', 0, 'x' };
        String name = TarUtils.parseName(buffer, 0, 6);
        Assert.assertEquals("test", name);
    }

    @Test
    public void testParseNameNoNull() {
        byte[] buffer = new byte[] { 't', 'e', 's', 't' };
        String name = TarUtils.parseName(buffer, 0, 4);
        Assert.assertEquals("test", name);
    }

    @Test
    public void testFormatNameBytes() {
        byte[] buffer = new byte[6];
        int nextOffset = TarUtils.formatNameBytes("abc", buffer, 1, 4);
        Assert.assertEquals(5, nextOffset);
        Assert.assertEquals('a', buffer[1]);
        Assert.assertEquals('b', buffer[2]);
        Assert.assertEquals('c', buffer[3]);
        Assert.assertEquals(0, buffer[4]);
        Assert.assertEquals(0, buffer[5]); // outside written area untouched
    }

    @Test
    public void testFormatUnsignedOctalStringAndOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(83L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        long parsed = TarUtils.parseOctal(buffer, 0, 8);
        Assert.assertEquals(83L, parsed);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(83L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals(' ', buffer[7]);
    }

    @Test
    public void testFormatCheckSumOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatCheckSumOctalBytes(83L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals(0, buffer[6]);
        Assert.assertEquals(' ', buffer[7]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringOverflow() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(999L, buffer, 0, 2);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, (byte) 255 };
        long sum = TarUtils.computeCheckSum(buffer);
        // 1 + 2 + 3 + 255 = 261
        Assert.assertEquals(261L, sum);
    }
}
