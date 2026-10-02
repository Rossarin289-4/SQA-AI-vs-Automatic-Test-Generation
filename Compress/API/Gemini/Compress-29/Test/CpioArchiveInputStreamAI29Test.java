package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class CpioArchiveInputStreamAI29Test {

    @Test
    public void testMatchesInvalidLength() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30 };
        assertFalse(CpioArchiveInputStream.matches(sig, 5));
    }

    @Test
    public void testMatchesNewAscii() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x31 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesNewCrcAscii() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x32 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesOldAscii() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x37 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesOldBinaryNormal() {
        byte[] sig = new byte[] { 0x71, (byte) 0xc7, 0x00, 0x00, 0x00, 0x00 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesOldBinarySwapped() {
        byte[] sig = new byte[] { (byte) 0xc7, 0x71, 0x00, 0x00, 0x00, 0x00 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesNonMatchingHeader() {
        byte[] sig = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06 };
        assertFalse(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test(expected = IOException.class)
    public void testEnsureOpenThrowsOnClosedStream() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(in);
        cpioIn.close();
        cpioIn.available();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeThrowsException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(in);
        try {
            cpioIn.skip(-1);
        } finally {
            cpioIn.close();
        }
    }

    @Test
    public void testAvailableWhenNotEof() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(in);
        try {
            assertEquals(1, cpioIn.available());
        } finally {
            cpioIn.close();
        }
    }

    @Test(expected = IOException.class)
    public void testGetNextCPIOEntryUnknownMagic() throws IOException {
        byte[] badData = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        InputStream in = new ByteArrayInputStream(badData);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(in);
        try {
            cpioIn.getNextCPIOEntry();
        } finally {
            cpioIn.close();
        }
    }
}
