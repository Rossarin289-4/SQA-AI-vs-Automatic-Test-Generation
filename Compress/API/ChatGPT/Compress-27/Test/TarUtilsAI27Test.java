package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TarUtilsAI27Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalTooShort() {
        byte[] buffer = new byte[]{ '1' };
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalLeadingZero() {
        byte[] buffer = new byte[]{ 0, '1', '2', ' ' };
        long result = TarUtils.parseOctal(buffer, 0, 4);
        assertEquals(0L, result);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[]{ 1, 2, 3, 4 };
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(10L, sum);
    }
}
