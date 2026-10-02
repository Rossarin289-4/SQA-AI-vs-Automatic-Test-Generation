package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ZipArchiveInputStreamAI29Test {

    @Test
    public void testNullInputStreamConstructor() {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(null);
        Assert.assertNotNull(zis);
    }

    @Test
    public void testEncodingConstructor() {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8");
        Assert.assertNotNull(zis);
        Assert.assertEquals("UTF-8", zis.encoding);
    }

    @Test
    public void testEncodingAndUnicodeExtrasConstructor() {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", false);
        Assert.assertNotNull(zis);
    }

    @Test
    public void testFullConstructor() {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]), "UTF-8", true, true);
        Assert.assertNotNull(zis);
    }

    @Test
    public void testGetNextZipEntryEmptyStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNull(entry);
    }

    @Test
    public void testCloseOnEmptyStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        Assert.assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testCanReadByteOnEmptyStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        int readVal = zis.read();
        Assert.assertEquals(-1, readVal);
    }

    @Test
    public void testMatchesEmptySignature() {
        boolean matches = ZipArchiveInputStream.matches(new byte[0], 0);
        Assert.assertFalse(matches);
    }

    @Test
    public void testMatchesNullArray() {
        boolean matches = ZipArchiveInputStream.matches(null, 0);
        Assert.assertFalse(matches);
    }

    @Test
    public void testMatchesShortArray() {
        byte[] sig = new byte[] { 'P', 'K' };
        boolean matches = ZipArchiveInputStream.matches(sig, 2);
        Assert.assertFalse(matches);
    }
}
