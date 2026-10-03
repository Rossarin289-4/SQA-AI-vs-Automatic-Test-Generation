package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TarUtilsAI8Test {

    @Test
    public void testParseOctalValid() {
        byte[] buffer = new byte[] { '0', '1', '2', '3', ' ', 0 };
        long result = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(83, result);
    }

    @Test
    public void testParseNameTruncationAndNull() {
        byte[] buffer = new byte[] { 't', 'e', 's', 't', 0, 'x' };
        String name = TarUtils.parseName(buffer, 0, 6);
        assertEquals("test", name);
    }

    @Test
    public void testFormatAndParseOctalRoundtrip() {
        byte[] buffer = new byte[8];
        TarUtils.formatOctalBytes(77L, buffer, 0, buffer.length);
        long parsed = TarUtils.parseOctal(buffer, 0, buffer.length);
        assertEquals(77L, parsed);
    }
}
