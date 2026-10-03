package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.fail;

public class CpioArchiveOutputStreamAI4Test {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorUnknownFormat() {
        new CpioArchiveOutputStream(new ByteArrayOutputStream(), (short) -999);
    }

    @Test(expected = IOException.class)
    public void testWriteWithoutEntry() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(new ByteArrayOutputStream(), CpioConstants.FORMAT_NEW);
        try {
            out.write(new byte[] { 1, 2, 3 }, 0, 3);
        } finally {
            out.close();
        }
    }

    @Test
    public void testDuplicateEntryThrowsIOException() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(bos, CpioConstants.FORMAT_NEW);
        try {
            CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "testfile");
            entry1.setFileSize(0);
            out.putArchiveEntry(entry1);
            out.closeArchiveEntry();

            CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "testfile");
            entry2.setFileSize(0);
            out.putArchiveEntry(entry2);
            fail("Expected IOException due to duplicate entry name");
        } catch (IOException e) {
            // expected
        } finally {
            try {
                out.close();
            } catch (IOException ignored) {
            }
        }
    }
}
