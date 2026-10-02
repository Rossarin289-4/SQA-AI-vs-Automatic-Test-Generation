package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CpioArchiveInputStreamAI20Test {

    @Test
    public void testClose() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(bais);
        cpioIn.close();
        try {
            cpioIn.available();
            fail("Expected IOException after close");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testSkipNegative() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(bais);
        try {
            cpioIn.skip(-1);
            fail("Expected IllegalArgumentException for negative skip");
        } catch (IllegalArgumentException e) {
            // expected
        } finally {
            cpioIn.close();
        }
    }

    @Test
    public void testMatches() {
        byte[] validNew = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x31 };
        assertTrue(CpioArchiveInputStream.matches(validNew, validNew.length));

        byte[] invalid = new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        assertFalse(CpioArchiveInputStream.matches(invalid, invalid.length));
    }
}
