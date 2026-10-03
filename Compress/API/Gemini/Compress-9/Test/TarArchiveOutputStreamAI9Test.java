package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TarArchiveOutputStreamAI9Test {

    @Test
    public void testConstructionAndRecordSize() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
    }

    @Test
    public void testConstructionWithBlockSize() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
    }

    @Test
    public void testConstructionWithBlockAndRecordSize() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, 1024, 512);
        Assert.assertEquals(512, taos.getRecordSize());
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWithoutOpenEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testFinishTwice() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        taos.finish();
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryAfterFinish() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        taos.putArchiveEntry(entry);
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

    @Test(expected = IOException.class)
    public void testWriteExceedingDeclaredSize() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(5);
        taos.putArchiveEntry(entry);
        byte[] data = new byte[10];
        taos.write(data, 0, 10);
    }

    @Test(expected = IOException.class)
    public void testCloseEntryBeforeWritingSpecifiedBytes() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        taos.write(new byte[]{1, 2, 3}, 0, 3);
        taos.closeArchiveEntry();
    }

    @Test(expected = RuntimeException.class)
    public void testLongFileNameErrorMode() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append("a");
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        taos.putArchiveEntry(entry);
    }

    @Test
    public void testLongFileNameTruncateMode() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            sb.append("a");
        }
        TarArchiveEntry entry = new TarArchiveEntry(sb.toString());
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        taos.finish();
        Assert.assertTrue(taos.getBytesWritten() > 0);
    }

    @Test
    public void testFlushAndClose() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.flush();
        taos.close();
        Assert.assertTrue(taos.getBytesWritten() >= 0);
    }
}
