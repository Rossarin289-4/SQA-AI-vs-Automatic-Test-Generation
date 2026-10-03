package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TarUtilsAI45Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalLengthTooSmall() {
        byte[] buffer = new byte[1];
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalValid() {
        byte[] buffer = new byte[] { '1', '2', '3', 0, ' ' };
        long result = TarUtils.parseOctal(buffer, 0, 5);
        assertEquals(83L, result);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, (byte) 255 };
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(1 + 2 + 3 + 255, sum);
    }
}
