package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class CpioArchiveOutputStreamAI29Test {

    @Test(expected = IllegalArgumentException.class)
    public void testUnknownFormatConstructor() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new CpioArchiveOutputStream(out, (short) 9999);
    }

    @Test
    public void testValidConstructors() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream stream1 = new CpioArchiveOutputStream(out);
        Assert.assertNotNull(stream1);

        CpioArchiveOutputStream stream2 = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        Assert.assertNotNull(stream2);

        CpioArchiveOutputStream stream3 = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW, 512);
        Assert.assertNotNull(stream3);

        CpioArchiveOutputStream stream4 = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW, 512, "US-ASCII");
        Assert.assertNotNull(stream4);

        CpioArchiveOutputStream stream5 = new CpioArchiveOutputStream(out, "US-ASCII");
        Assert.assertNotNull(stream5);
    }

    @Test(expected = ClassCastException.class)
    public void testPutArchiveEntryWrongType() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);
        ArchiveEntry invalidEntry = new ArchiveEntry() {
            public String getName() { return "test"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public java.util.Date getLastModifiedDate() { return new java.util.Date(); }
        };
        cpioOut.putArchiveEntry(invalidEntry);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryAfterFinish() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);
        cpioOut.finish();
        
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile");
        entry.setSize(0);
        cpioOut.putArchiveEntry(entry);
    }

    @Test(expected = IOException.class)
    public void testDuplicateEntryName() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);

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
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);
        cpioOut.write(new byte[] { 1, 2, 3 });
    }

    @Test(expected = IOException.class)
    public void testWritePastEnd() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);

        CpioArchiveEntry entry = new CpioArchiveEntry("file1");
        entry.setSize(2);
        cpioOut.putArchiveEntry(entry);

        cpioOut.write(new byte[] { 1, 2, 3 });
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWriteOutOfBounds() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);

        CpioArchiveEntry entry = new CpioArchiveEntry("file1");
        entry.setSize(5);
        cpioOut.putArchiveEntry(entry);

        cpioOut.write(new byte[] { 1, 2, 3 }, -1, 2);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntrySizeMismatch() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);

        CpioArchiveEntry entry = new CpioArchiveEntry("file1");
        entry.setSize(5);
        cpioOut.putArchiveEntry(entry);
        cpioOut.write(new byte[] { 1, 2 });
        cpioOut.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testCreateArchiveEntryAfterFinish() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);
        cpioOut.finish();
        cpioOut.createArchiveEntry(new File("dummy"), "dummy");
    }

    @Test
    public void testWriteNormalExecution() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);

        CpioArchiveEntry entry = new CpioArchiveEntry("hello.txt");
        entry.setSize(5);
        cpioOut.putArchiveEntry(entry);
        cpioOut.write("Hello".getBytes());
        cpioOut.closeArchiveEntry();
        cpioOut.close();

        Assert.assertTrue(out.size() > 0);
    }
}
