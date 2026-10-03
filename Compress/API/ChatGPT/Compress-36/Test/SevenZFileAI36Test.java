package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;

public class SevenZFileAI36Test {

    @Test
    public void testMatchesShortSignature() {
        byte[] sig = new byte[] { '7', 'z' };
        assertFalse(SevenZFile.matches(sig, sig.length));
    }

    @Test
    public void testMatchesValidSignature() {
        byte[] sig = new byte[] { (byte)'7', (byte)'z', (byte)0xBC, (byte)0xAF, (byte)0x27, (byte)0x1C };
        assertTrue(SevenZFile.matches(sig, sig.length));
    }

    @Test(expected = IllegalStateException.class)
    public void testReadWithoutCurrentEntryThrowsException() throws Exception {
        File tempFile = File.createTempFile("empty", ".7z");
        tempFile.deleteOnExit();
        SevenZFile sevenZFile = new SevenZFile(tempFile);
        try {
            sevenZFile.read();
        } finally {
            sevenZFile.close();
        }
    }
}
