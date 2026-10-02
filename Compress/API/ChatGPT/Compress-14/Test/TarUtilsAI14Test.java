package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TarUtilsAI14Test {

    @Test
    public void testParseOctalLeadingZero() {
        byte[] buffer = new byte[] { 0, '0', '7', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, 5);
        assertEquals(0L, result);
    }

    @Test
    public void testParseBoolean() {
        byte[] buffer = new byte[] { 1, 0 };
        assertTrue(TarUtils.parseBoolean(buffer, 0));
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, 4 };
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(10L, sum);
    }
}
