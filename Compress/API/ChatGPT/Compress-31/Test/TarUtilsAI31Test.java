package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

public class TarUtilsAI31Test {

    @Test
    public void testParseOctalValid() {
        byte[] buffer = new byte[] { '1', '2', ' ' };
        long result = TarUtils.parseOctal(buffer, 0, 3);
        Assert.assertEquals(10L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalTooShort() {
        byte[] buffer = new byte[] { '1' };
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, 4 };
        long sum = TarUtils.computeCheckSum(buffer);
        Assert.assertEquals(10L, sum);
    }
}
