package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

public class CpioArchiveInputStreamAI29Test {

    @Test
    public void testMatchesValidSignatures() {
        byte[] magicNew = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x31 };
        assertTrue(CpioArchiveInputStream.matches(magicNew, magicNew.length));

        byte[] magicBinary = new byte[] { 0x71, (byte) 0xc7, 0x00, 0x00 };
        assertTrue(CpioArchiveInputStream.matches(magicBinary, magicBinary.length));
    }

    @Test
    public void testMatchesInvalidSignatureLength() {
        byte[] shortSig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30 };
        assertFalse(CpioArchiveInputStream.matches(shortSig, shortSig.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeThrowsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(bais);
        try {
            cpioIn.skip(-1L);
        } finally {
            cpioIn.close();
        }
    }
}
