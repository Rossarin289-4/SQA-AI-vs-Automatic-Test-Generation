package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveOutputStreamAI29Test {

    @Test
    public void testDefaultConstructorAndGetters() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tos.getRecordSize());
        Assert.assertEquals(0, tos.getBytesWritten());
    }

    @Test
    public void testCustomEncodingConstructor() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, "UTF-8");
        Assert.assertEquals("UTF-8", tos.encoding);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tos.getRecordSize());
    }

    @Test
    public void testBlockSizeConstructor() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, 1024);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tos.getRecordSize());
    }

    @Test
    public void testBlockSizeAndEncodingConstructor() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, 1024, "UTF-8");
        Assert.assertEquals("UTF-8", tos.encoding);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tos.getRecordSize());
    }

    @Test
    public void testFullParametersConstructor() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos, 1024, 512, "ASCII");
        Assert.assertEquals("ASCII", tos.encoding);
        Assert.assertEquals(512, tos.getRecordSize());
    }

    @Test
    public void testSetModes() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        tos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        tos.setAddPaxHeadersForNonAsciiNames(true);
        Assert.assertNotNull(tos);
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        File tempFile = new File("dummy");
        TarArchiveEntry entry = (TarArchiveEntry) tos.createArchiveEntry(tempFile, "entryName");
        Assert.assertNotNull(entry);
        Assert.assertEquals("entryName", entry.getName());
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntryAfterFinish() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();
        File tempFile = new File("dummy");
        tos.createArchiveEntry(tempFile, "entryName");
    }

    @Test(expected = IOException.class)
    public void testFinishTwiceThrowsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();
        tos.finish();
    }

    @Test(expected = IOException.class)
    public void testPutEntryAfterFinishThrowsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.finish();
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testFlush() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.flush();
        Assert.assertNotNull(tos);
    }
}
