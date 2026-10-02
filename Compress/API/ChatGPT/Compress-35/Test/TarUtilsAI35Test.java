package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TarUtilsAI35Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalTooShort() {
        byte[] buffer = new byte[1];
        TarUtils.parseOctal(buffer, 0, 1);
    }

    @Test
    public void testParseOctalLeadingNull() {
        byte[] buffer = new byte[] { 0, '1', '2', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(0L, result);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, (byte) 255 };
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(1 + 2 + 3 + 255, sum);
    }
}
