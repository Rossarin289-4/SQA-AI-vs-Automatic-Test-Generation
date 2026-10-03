package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TarUtilsAI7Test {

    @Test
    public void testParseOctalValid() {
        byte[] buffer = " 00755\0".getBytes();
        long value = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(493L, value);
    }

    @Test
    public void testParseNameAndFormatNameBytes() {
        byte[] buffer = new byte[10];
        TarUtils.formatNameBytes("testName", buffer, 0, 10);
        String parsed = TarUtils.parseName(buffer, 0, 10);
        assertEquals("testName", parsed);
    }

    @Test
    public void testComputeCheckSum() {
        byte[] buffer = new byte[] { 1, 2, 3, (byte) 255 };
        long sum = TarUtils.computeCheckSum(buffer);
        assertEquals(261L, sum);
    }
}
