package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ZipArchiveOutputStreamAI4Test {

    @Test
    public void testDefaultInstantiationAndSeekable() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        Assert.assertFalse("Stream with OutputStream should not be seekable", zos.isSeekable());
        Assert.assertEquals("UTF-8", zos.getEncoding());
    }

    @Test
    public void testSetEncoding() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setEncoding("UTF-8");
        Assert.assertEquals("UTF-8", zos.getEncoding());
        
        zos.setEncoding("ISO-8859-1");
        Assert.assertEquals("ISO-8859-1", zos.getEncoding());
    }

    @Test
    public void testSetUseLanguageEncodingFlag() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setEncoding("UTF-8");
        zos.setUseLanguageEncodingFlag(false);
    }

    @Test
    public void testSetCreateUnicodeExtraFields() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);
        zos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER);
    }

    @Test
    public void testSetFallbackToUTF8() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        zos.setFallbackToUTF8(true);
        zos.setFallbackToUTF8(false);
    }

    @Test
    public void testCreateArchiveEntryWithFile() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        File tempFile = File.createTempFile("compress-test", ".tmp");
        tempFile.deleteOnExit();

        org.apache.commons.compress.archivers.ArchiveEntry entry = zos.createArchiveEntry(tempFile, "test.txt");
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntryThrowsException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        zos.putArchiveEntry(entry);
        try {
            zos.finish();
        } finally {
            zos.close();
        }
    }

    @Test
    public void testUnicodeExtraFieldPolicyToString() {
        Assert.assertEquals("always", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS.toString());
        Assert.assertEquals("never", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER.toString());
        Assert.assertEquals("not encodeable", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE.toString());
    }
}
