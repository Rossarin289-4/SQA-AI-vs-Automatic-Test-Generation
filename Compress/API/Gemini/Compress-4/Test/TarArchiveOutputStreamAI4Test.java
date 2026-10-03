package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveOutputStreamAI4Test {

    @Test
    public void testGetRecordSizeDefault() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
    }

    @Test
    public void testGetRecordSizeCustom() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos, 1024, 512);
        Assert.assertEquals(512, taos.getRecordSize());
    }

    @Test
    public void testFlush() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.flush();
        Assert.assertTrue(true);
    }

    @Test
    public void testFinishEmptyArchive() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.finish();
        taos.close();
        Assert.assertTrue(bos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntry() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        try {
            taos.finish();
        } finally {
            taos.close();
        }
    }

    @Test(expected = ClassCastException.class)
    public void testPutArchiveEntryInvalidType() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        try {
            taos.putArchiveEntry(new org.apache.commons.compress.archivers.ArchiveEntry() {
                public String getName() { return "invalid"; }
                public long getSize() { return 0; }
                public boolean isDirectory() { return false; }
                public java.util.Date getLastModifiedDate() { return new java.util.Date(); }
            });
        } finally {
            taos.close();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testLongFileNameErrorMode() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        
        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            longName.append("a");
        }
        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(0);
        try {
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test
    public void testLongFileNameGnuMode() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        
        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            longName.append("a");
        }
        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
        
        Assert.assertTrue(bos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testWriteExceedsHeaderSize() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("small.txt");
        entry.setSize(2);
        taos.putArchiveEntry(entry);
        try {
            taos.write(new byte[] { 1, 2, 3 }, 0, 3);
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryBeforeEnoughBytesWritten() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("partial.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        taos.write(new byte[] { 1, 2, 3 }, 0, 3);
        try {
            taos.closeArchiveEntry();
        } finally {
            taos.close();
        }
    }

    @Test
    public void testSuccessfulWriteAndCloseEntry() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        byte[] data = "Hello World".getBytes();
        entry.setSize(data.length);
        
        taos.putArchiveEntry(entry);
        taos.write(data, 0, data.length);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
        
        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        try {
            File dummyFile = new File("dummy");
            org.apache.commons.compress.archivers.ArchiveEntry entry = taos.createArchiveEntry(dummyFile, "entryName");
            Assert.assertNotNull(entry);
            Assert.assertEquals("entryName", entry.getName());
        } finally {
            taos.close();
        }
    }
}
