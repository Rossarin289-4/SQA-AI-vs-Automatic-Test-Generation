package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class CpioArchiveOutputStreamAI4Test {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorUnknownFormat() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new CpioArchiveOutputStream(out, (short) 9999);
    }

    @Test
    public void testConstructorDefaultFormat() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);
        Assert.assertNotNull(cpioOut);
    }

    @Test(expected = IOException.class)
    public void testWriteToClosedStream() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);
        cpioOut.close();
        cpioOut.write(new byte[1], 0, 1);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryWhenClosed() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);
        cpioOut.close();
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile");
        cpioOut.putArchiveEntry(entry);
    }

    @Test(expected = IOException.class)
    public void testFormatMismatch() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII, "testfile");
        cpioOut.putArchiveEntry(entry);
    }

    @Test(expected = IOException.class)
    public void testDuplicateEntryName() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        
        CpioArchiveEntry entry1 = new CpioArchiveEntry("file1");
        entry1.setSize(0);
        cpioOut.putArchiveEntry(entry1);
        cpioOut.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry("file1");
        entry2.setSize(0);
        cpioOut.putArchiveEntry(entry2);
    }

    @Test(expected = IOException.class)
    public void testWriteWithoutEntry() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        cpioOut.write(new byte[] { 1, 2, 3 }, 0, 3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteInvalidBounds() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("file1");
        entry.setSize(5);
        cpioOut.putArchiveEntry(entry);
        cpioOut.write(new byte[10], -1, 5);
    }

    @Test(expected = IOException.class)
    public void testWritePastEnd() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("file1");
        entry.setSize(2);
        cpioOut.putArchiveEntry(entry);
        cpioOut.write(new byte[5], 0, 5);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntrySizeMismatch() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("file1");
        entry.setSize(5);
        cpioOut.putArchiveEntry(entry);
        cpioOut.write(new byte[2], 0, 2);
        cpioOut.closeArchiveEntry();
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        File dummyFile = new File("dummy.txt");
        org.apache.commons.compress.archivers.ArchiveEntry entry = cpioOut.createArchiveEntry(dummyFile, "dummy.txt");
        Assert.assertNotNull(entry);
        Assert.assertEquals("dummy.txt", entry.getName());
    }

    @Test
    public void testFinishAndCloseFlow() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        
        CpioArchiveEntry entry = new CpioArchiveEntry("hello.txt");
        byte[] data = "hello".getBytes();
        entry.setSize(data.length);
        entry.setMode(CpioConstants.C_ISREG);
        
        cpioOut.putArchiveEntry(entry);
        cpioOut.write(data, 0, data.length);
        cpioOut.closeArchiveEntry();
        
        cpioOut.finish();
        cpioOut.close();
        
        Assert.assertTrue(out.size() > 0);
    }
}
