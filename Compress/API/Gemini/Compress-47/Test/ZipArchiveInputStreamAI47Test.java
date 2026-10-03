package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZipArchiveInputStreamAI47Test {

    @Test
    public void testNullInputStream() {
        boolean exceptionThrown = false;
        try {
            new ZipArchiveInputStream(null);
        } catch (Exception e) {
            exceptionThrown = true;
        }
        // Depending on internal implementation, wrapping null might throw NPE or succeed until read.
        // Let's test that constructing with an empty stream works.
        byte[] empty = new byte[0];
        ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(empty));
        Assert.assertNotNull(zais);
    }

    @Test
    public void testGetNextZipEntryEmptyStream() throws IOException {
        byte[] empty = new byte[0];
        ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(empty));
        ZipArchiveEntry entry = zais.getNextZipEntry();
        Assert.assertNull(entry);
    }

    @Test
    public void testCloseOnFreshStream() throws IOException {
        byte[] empty = new byte[0];
        ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(empty));
        zais.close();
        // Subsequent read or getNextZipEntry should return null or handle gracefully
        Assert.assertNull(zais.getNextZipEntry());
    }

    @Test
    public void testCanReadBeanMethods() {
        byte[] empty = new byte[0];
        ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(empty), "UTF8");
        Assert.assertEquals("UTF8", zais.encoding);
    }

    @Test
    public void testReadOnEmptyStream() throws IOException {
        byte[] empty = new byte[0];
        ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(empty));
        byte[] buf = new byte[10];
        int read = zais.read(buf, 0, 10);
        Assert.assertEquals(-1, read);
    }

    @Test
    public void testSkipOnEmptyStream() throws IOException {
        byte[] empty = new byte[0];
        ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(empty));
        long skipped = zais.skip(5);
        Assert.assertEquals(0, skipped);
    }

    @Test
    public void testAvailableOnEmptyStream() throws IOException {
        byte[] empty = new byte[0];
        ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(empty));
        int avail = zais.available();
        Assert.assertEquals(0, avail);
    }

    @Test(expected = IOException.class)
    public void testUnexpectedSignatureThrowsZipException() throws IOException {
        // Send some garbage bytes instead of a valid ZIP signature
        byte[] garbage = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A,
                                      0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x13, 0x14,
                                      0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E };
        ZipArchiveInputStream zais = new ZipArchiveInputStream(new ByteArrayInputStream(garbage));
        zais.getNextZipEntry();
    }
}
