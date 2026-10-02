package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ZipArchiveOutputStreamAI4Test {

    @Test
    public void testCreateArchiveEntry() throws Exception {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ZipArchiveOutputStream zao = new ZipArchiveOutputStream(bao);
        java.io.File tempFile = java.io.File.createTempFile("ziptest", ".tmp");
        tempFile.deleteOnExit();

        ArchiveEntry entry = zao.createArchiveEntry(tempFile, "testEntryName.txt");
        assertNotNull(entry);
        assertEquals("testEntryName.txt", entry.getName());
        zao.close();
    }

    @Test
    public void testSetEncoding() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ZipArchiveOutputStream zao = new ZipArchiveOutputStream(bao);
        zao.setEncoding("UTF-8");
        assertEquals("UTF-8", zao.getEncoding());
    }

    @Test
    public void testDefaultCompressionLevel() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ZipArchiveOutputStream zao = new ZipArchiveOutputStream(bao);
        assertEquals(ZipArchiveOutputStream.DEFLATED, zao.getMethod());
    }
}
