package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Test;

public class CpioArchiveOutputStreamAI29Test {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidFormat() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new CpioArchiveOutputStream(out, (short) 999);
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryWithoutEntry() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        cpioOut.closeArchiveEntry();
    }

    @Test(expected = IOException.class)
    public void testWritePastEndException() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        CpioArchiveOutputStream cpioOut = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "testfile");
        entry.setSize(2);
        cpioOut.putArchiveEntry(entry);
        cpioOut.write(new byte[] { 1, 2, 3 });
    }
}
