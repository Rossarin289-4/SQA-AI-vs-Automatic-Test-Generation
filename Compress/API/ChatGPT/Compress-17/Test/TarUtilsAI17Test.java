package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TarUtilsAI17Test {

    @Test
    public void testParseOctalValid() {
        byte[] buffer = " 123 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(123L, result);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, 4 };
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(10L, sum);
    }

    @Test
    public void testVerifyCheckSum() {
        byte[] header = new byte[512];
        assertTrue(TarUtils.verifyCheckSum(header));
    }
}
