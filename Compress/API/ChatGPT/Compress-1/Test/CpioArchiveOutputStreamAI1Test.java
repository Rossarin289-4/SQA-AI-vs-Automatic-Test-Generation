package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.fail;

public class CpioArchiveOutputStreamAI1Test {

    @Test(expected = IOException.class)
    public void testWriteWithoutEntryThrowsIOException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);
        cpioOut.write(new byte[] { 1, 2, 3 }, 0, 3);
    }

    @Test(expected = IOException.class)
    public void testDuplicateEntryThrowsIOException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);
        
        CpioArchiveEntry entry1 = new CpioArchiveEntry();
        entry1.setName("file1");
        cpioOut.putNextEntry(entry1);
        cpioOut.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry();
        entry2.setName("file1");
        cpioOut.putNextEntry(entry2);
    }

    @Test(expected = IOException.class)
    public void testInvalidEntrySizeThrowsIOException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out);
        
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("file1");
        entry.setFileSize(5);
        cpioOut.putNextEntry(entry);
        cpioOut.write(new byte[] { 1, 2, 3 }, 0, 3);
        cpioOut.closeArchiveEntry();
    }
}
