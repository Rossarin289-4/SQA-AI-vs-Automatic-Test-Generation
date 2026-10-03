package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TarUtilsAI24Test {

    @Test
    public void testParseOctalValid() {
        byte[] buffer = " 123 \0".getBytes();
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(123L, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseOctalTooShort() {
        byte[] buffer = "1".getBytes();
        TarUtils.parseOctal(buffer, 0, buffer.length);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { (byte) 1, (byte) 2, (byte) 3 };
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(6L, sum);
    }

}
