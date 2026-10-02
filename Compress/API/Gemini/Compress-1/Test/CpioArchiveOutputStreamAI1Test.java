package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class CpioArchiveOutputStreamAI1Test {

    @Test
    public void testConstructorWithFormatValid() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        Assert.assertNotNull(out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithFormatInvalid() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        new CpioArchiveOutputStream(baos, (short) -999);
    }

    @Test(expected = IOException.class)
    public void testWriteWhenClosed() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        out.write(new byte[] { 1, 2, 3 }, 0, 3);
    }

    @Test(expected = IOException.class)
    public void testPutNextEntryWhenClosed() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        out.putNextEntry(entry);
    }

    @Test(expected = IOException.class)
    public void testWriteWithoutEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.write(new byte[] { 1, 2, 3 }, 0, 3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteOutOfBoundsNegativeOffset() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        out.putNextEntry(entry);
        out.write(new byte[] { 1, 2, 3 }, -1, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteOutOfBoundsNegativeLength() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        out.putNextEntry(entry);
        out.write(new byte[] { 1, 2, 3 }, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteOutOfBoundsTooLarge() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        out.putNextEntry(entry);
        out.write(new byte[] { 1, 2, 3 }, 1, 3);
    }

    @Test(expected = IOException.class)
    public void testWritePastEnd() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(2);
        out.putNextEntry(entry);
        out.write(new byte[] { 1, 2, 3 }, 0, 3);
    }

    @Test(expected = IOException.class)
    public void testDuplicateEntryName() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry1 = new CpioArchiveEntry("duplicate.txt");
        entry1.setSize(0);
        CpioArchiveEntry entry2 = new CpioArchiveEntry("duplicate.txt");
        entry2.setSize(0);
        out.putNextEntry(entry1);
        out.putNextEntry(entry2);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntrySizeMismatch() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        out.putNextEntry(entry);
        out.write(new byte[] { 1, 2 }, 0, 2);
        out.closeArchiveEntry();
    }

    @Test
    public void testSuccessfulArchiveWriting() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("hello.txt");
        byte[] data = "hello".getBytes();
        entry.setSize(data.length);
        out.putNextEntry(entry);
        out.write(data, 0, data.length);
        out.closeArchiveEntry();
        out.finish();
        out.close();
        Assert.assertTrue(baos.size() > 0);
    }
}
