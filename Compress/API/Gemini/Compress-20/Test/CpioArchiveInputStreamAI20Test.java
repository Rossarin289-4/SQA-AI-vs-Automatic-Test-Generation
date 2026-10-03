package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class CpioArchiveInputStreamAI20Test {

    @Test
    public void testMatchesNullOrShortSignature() {
        assertFalse(CpioArchiveInputStream.matches(null, 0));
        assertFalse(CpioArchiveInputStream.matches(new byte[5], 5));
    }

    @Test
    public void testMatchesValidNewAscii() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x31 };
        assertTrue(CpioArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesValidNewCrcAscii() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x32 };
        assertTrue(CpioArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesValidOldAscii() {
        byte[] sig = new byte[] { 0x30, 0x37, 0x30, 0x37, 0x30, 0x37 };
        assertTrue(CpioArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesValidBinarySwapped() {
        byte[] sig = new byte[] { (byte) 0xc7, 0x71 };
        assertTrue(CpioArchiveInputStream.matches(sig, 6));
    }

    @Test
    public void testMatchesInvalidAsciiPrefix() {
        byte[] sig = new byte[] { 0x31, 0x37, 0x30, 0x37, 0x30, 0x31 };
        assertFalse(CpioArchiveInputStream.matches(sig, sig.length));
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStreamThrowsException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(in);
        cpioIn.close();
        cpioIn.available();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadInvalidBoundsNegativeOffset() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(in);
        byte[] buf = new byte[10];
        cpioIn.read(buf, -1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeThrowsException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(in);
        cpioIn.skip(-1L);
    }

    @Test
    public void testAvailableBeforeAndAfterClose() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(in);
        // Before entry is read, entryEOF is false, available() returns 1 (if open)
        // Wait, ensureOpen succeeds, entryEOF is false initially, so available() returns 1.
        assertEquals(1, cpioIn.available());
        cpioIn.close();
    }
}
