package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ZipArchiveOutputStreamAI43Test {

    @Test
    public void testDefaultConstructorAndConstants() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        Assert.assertNotNull(zos);
        Assert.assertEquals(ZipArchiveOutputStream.DEFLATED, java.util.zip.ZipEntry.DEFLATED);
        Assert.assertEquals(ZipArchiveOutputStream.STORED, java.util.zip.ZipEntry.STORED);
        Assert.assertEquals(ZipArchiveOutputStream.DEFAULT_COMPRESSION, java.util.zip.Deflater.DEFAULT_COMPRESSION);
    }

    @Test
    public void testSetEncoding() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setEncoding("UTF-8");
        Assert.assertEquals("UTF-8", zos.getEncoding());
    }

    @Test
    public void testSetFallbackToUTF8() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setFallbackToUTF8(true);
        zos.setFallbackToUTF8(false);
    }

    @Test
    public void testSetCreateUnicodeExtraFields() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        Assert.assertEquals(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS, zos.getCreateUnicodeExtraFields());
    }

    @Test
    public void testSetLevel() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setLevel(5);
        Assert.assertEquals(5, zos.getLevel());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLevelInvalid() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setLevel(15);
    }

    @Test
    public void testSetDefaultMethod() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setMethod(ZipArchiveOutputStream.STORED);
        Assert.assertEquals(ZipArchiveOutputStream.STORED, zos.getDefaultMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefaultMethodInvalid() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setMethod(999);
    }

    @Test
    public void testSetComment() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setComment("test-comment");
        Assert.assertEquals("test-comment", zos.getComment());
    }

    @Test
    public void testSetUseZip64() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setUseZip64(Zip64Mode.Always);
        Assert.assertEquals(Zip64Mode.Always, zos.getUseZip64());
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        File tempFile = File.createTempFile("compress-test", ".tmp");
        tempFile.deleteOnExit();
        ZipArchiveEntry entry = (ZipArchiveEntry) zos.createArchiveEntry(tempFile, "test-entry-name");
        Assert.assertNotNull(entry);
        Assert.assertEquals("test-entry-name", entry.getName());
    }
}
