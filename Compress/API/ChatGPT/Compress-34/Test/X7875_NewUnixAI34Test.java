package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class X7875_NewUnixAI34Test {

    @Test
    public void testHeaderIdAndLengths() {
        X7875_NewUnix extra = new X7875_NewUnix();
        assertEquals(0x7875, extra.getHeaderId().getValue());
        assertEquals(0, extra.getCentralDirectoryLength().getValue());
        assertNotNull(extra.getLocalFileDataLength());
    }

    @Test
    public void testSettersAndGetters() {
        X7875_NewUnix extra = new X7875_NewUnix();
        extra.setUID(12345);
        extra.setGID(67890);
        assertEquals(12345, extra.getUID());
        assertEquals(67890, extra.getGID());
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength() {
        byte[] input = new byte[] { 0, 0, 5, 6 };
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertNotNull(result);
    }
}
