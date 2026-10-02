package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsAI17Test {

    @Test
    public void testParseOctalNormal() {
        byte[] buffer = " 123  ".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(123L, result);
    }

    @Test
    public void testParseOctalAllZeros() {
        byte[] buffer = "\0\0\0\0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        Assert.assertEquals(0L, result);
    }

    @Test
    public void testParseOctalLeadingNull() {
        byte[] buffer = new byte[] { 0, (byte)'1', (byte)'2', (byte)' ', 0 };
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
        byte[] buffer = " 193 ".getBytes();
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
        byte[] buffer = new byte[4];
        TarUtils.formatUnsignedOctalString(0L, buffer, 0, 4);
        Assert.assertEquals("0000", new String(buffer));
    }

    @Test
    public void testFormatUnsignedOctalStringValue() {
        byte[] buffer = new byte[6];
        TarUtils.formatUnsignedOctalString(8L, buffer, 0, 6);
        Assert.assertEquals("000010", new String(buffer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatUnsignedOctalStringTooLarge() {
        byte[] buffer = new byte[2];
        TarUtils.formatUnsignedOctalString(64L, buffer, 0, 2);
    }

    @Test
    public void testFormatOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatOctalBytes(9L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals(' ', (char) buffer[6]);
        Assert.assertEquals(0, buffer[7]);
    }

    @Test
    public void testFormatLongOctalBytes() {
        byte[] buffer = new byte[8];
        int nextOffset = TarUtils.formatLongOctalBytes(9L, buffer, 0, 8);
        Assert.assertEquals(8, nextOffset);
        Assert.assertEquals(' ', (char) buffer[7]);
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
        Assert.assertFalse(valid);
    }
}
