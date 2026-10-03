package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ZipArchiveInputStreamAI41Test {

    @Test
    public void testDefaultConstructor() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais);
        Assert.assertNotNull(zis);
    }

    @Test
    public void testEncodingConstructor() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais, "UTF-8");
        Assert.assertNotNull(zis);
        Assert.assertEquals("UTF-8", zis.encoding);
    }

    @Test
    public void testEncodingAndUnicodeExtraFieldsConstructor() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais, "UTF-8", true);
        Assert.assertNotNull(zis);
        Assert.assertEquals("UTF-8", zis.encoding);
    }

    @Test
    public void testFullConstructor() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais, "UTF-8", true, true);
        Assert.assertNotNull(zis);
        Assert.assertEquals("UTF-8", zis.encoding);
    }

    @Test
    public void testGetNextZipEntryEmptyStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais);
        ZipArchiveEntry entry = zis.getNextZipEntry();
        Assert.assertNull(entry);
    }

    @Test
    public void testCloseMultipleTimes() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais);
        zis.close();
        zis.close(); // Should not throw
        Assert.assertNull(zis.getNextZipEntry());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRealSkipNegative() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais);
        // Using reflection or testing methods if accessible, or via public methods that trigger it.
        // Since realSkip is private, we can test skip or similar if available, or just verify basic stream behavior.
        // If realSkip cannot be invoked directly, we can test skip on ZipArchiveInputStream.
        zis.skip(-1L);
    }

    @Test
    public void testCanReadWithEmptyStream() throws IOException {
        byte[] data = new byte[0];
        boolean canRead = ZipArchiveInputStream.matches(data, data.length);
        Assert.assertFalse(canRead);
    }

    @Test
    public void testMatchesNull() {
        boolean canRead = ZipArchiveInputStream.matches(null, 0);
        Assert.assertFalse(canRead);
    }

    @Test
    public void testMatchesShortData() {
        byte[] data = new byte[]{1, 2, 3};
        boolean canRead = ZipArchiveInputStream.matches(data, data.length);
        Assert.assertFalse(canRead);
    }

    @Test
    public void testMatchesZipSignature() {
        // Zip signature: PK\03\04 (80, 75, 3, 4)
        byte[] data = new byte[]{80, 75, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean canRead = ZipArchiveInputStream.matches(data, data.length);
        Assert.assertTrue(canRead);
    }
}
