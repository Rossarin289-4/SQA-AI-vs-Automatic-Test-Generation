package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveOutputStreamAI3Test {

    @Test
    public void testGetRecordSizeDefault() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
    }

    @Test
    public void testGetRecordSizeCustom() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        Assert.assertEquals(512, taos.getRecordSize());
    }

    @Test
    public void testFlush() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.flush();
        // If no exception is thrown, flush is successful
        Assert.assertTrue(true);
    }

    @Test
    public void testFinishWithoutEntries() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        // finish() writes EOF records through TarBuffer, but doesn't necessarily flush underlying stream immediately
        // Just verify finish completes normally without error.
        Assert.assertNotNull(taos);
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        taos.finish();
    }

    @Test
    public void testSimpleEntryWriteAndClose() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        taos.putArchiveEntry(entry);
        taos.write(new byte[] { 1, 2, 3, 4, 5 }, 0, 5);
        taos.closeArchiveEntry();
        taos.finish();
        taos.close();
        Assert.assertTrue(true);
    }

    @Test(expected = IOException.class)
    public void testWriteExceedsHeaderSize() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(2);
        taos.putArchiveEntry(entry);
        taos.write(new byte[] { 1, 2, 3 }, 0, 3);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryBeforeSizeMet() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        taos.write(new byte[] { 1, 2, 3 }, 0, 3);
        taos.closeArchiveEntry();
    }

    @Test(expected = RuntimeException.class)
    public void testLongFileNameErrorMode() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 105; i++) {
            sb.append("a");
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        taos.putArchiveEntry(entry);
    }

    @Test
    public void testLongFileNameGnuMode() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 105; i++) {
            sb.append("a");
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        Assert.assertNotNull(taos);
    }
}
