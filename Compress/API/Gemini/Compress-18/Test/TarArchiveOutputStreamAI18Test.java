package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TarArchiveOutputStreamAI18Test {

    @Test
    public void testDefaultConstructorAndRecordSize() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        Assert.assertNotNull(taos);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
        taos.close();
    }

    @Test
    public void testCustomBlockAndRecordSize() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos, 1024, 512, "UTF-8");
        Assert.assertEquals(512, taos.getRecordSize());
        taos.close();
    }

    @Test(expected = IOException.class)
    public void testFinishTwiceThrowsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.finish();
        try {
            taos.finish();
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWithoutOpenThrowsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        try {
            taos.closeArchiveEntry();
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryAfterFinishThrowsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.finish();
        try {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            entry.setSize(0);
            taos.putArchiveEntry(entry);
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testWriteExceedsEntrySizeThrowsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        try {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            entry.setSize(5);
            taos.putArchiveEntry(entry);
            byte[] data = new byte[10];
            taos.write(data, 0, 10);
        } finally {
            taos.close();
        }
    }

    @Test(expected = IOException.class)
    public void testCloseEntryBeforeWritingCompleteThrowsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        try {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            entry.setSize(10);
            taos.putArchiveEntry(entry);
            taos.write(new byte[]{1, 2, 3}, 0, 3);
            taos.closeArchiveEntry();
        } finally {
            taos.close();
        }
    }

    @Test
    public void testGetCountAndBytesWritten() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        Assert.assertEquals(0, taos.getBytesWritten());
        Assert.assertEquals(0, taos.getCount());
        taos.finish();
        Assert.assertTrue(taos.getBytesWritten() > 0);
        taos.close();
    }

    @Test
    public void testSetModesAndPaxHeaders() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        taos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        taos.setAddPaxHeadersForNonAsciiNames(true);
        taos.finish();
        taos.close();
        Assert.assertTrue(bos.size() > 0);
    }

    @Test
    public void testFlush() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(bos);
        taos.flush();
        taos.finish();
        taos.close();
    }
}
