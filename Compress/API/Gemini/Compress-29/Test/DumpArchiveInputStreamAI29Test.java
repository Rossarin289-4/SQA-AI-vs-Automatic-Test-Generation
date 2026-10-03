package org.apache.commons.compress.archivers.dump;

import org.apache.commons.compress.archivers.ArchiveException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class DumpArchiveInputStreamAI29Test {

    @Test
    public void testMatchesNullBuffer() {
        Assert.assertFalse(DumpArchiveInputStream.matches(null, 10));
    }

    @Test
    public void testMatchesShortBuffer() {
        byte[] buffer = new byte[10];
        Assert.assertFalse(DumpArchiveInputStream.matches(buffer, 10));
    }

    @Test
    public void testMatchesExact32BytesNonMagic() {
        byte[] buffer = new byte[32];
        Assert.assertFalse(DumpArchiveInputStream.matches(buffer, 32));
    }

    @Test
    public void testMatchesExact32BytesWithMagic() {
        byte[] buffer = new byte[32];
        // DumpArchiveConstants.NFS_MAGIC is 60112 (0x0000EA60 or similar depending on endianness/conversion)
        // Let's use DumpArchiveConstants.NFS_MAGIC explicitly to set it correctly via convert32 logic
        // convert32 reads little-endian: b[0] | (b[1]<<8) | (b[2]<<16) | (b[3]<<24)
        int magic = DumpArchiveConstants.NFS_MAGIC;
        buffer[24] = (byte) (magic & 0xFF);
        buffer[25] = (byte) ((magic >> 8) & 0xFF);
        buffer[26] = (byte) ((magic >> 16) & 0xFF);
        buffer[27] = (byte) ((magic >> 24) & 0xFF);
        Assert.assertTrue(DumpArchiveInputStream.matches(buffer, 32));
    }

    @Test(expected = ArchiveException.class)
    public void testConstructorInvalidStream() throws ArchiveException, IOException {
        byte[] garbage = new byte[1024];
        ByteArrayInputStream bais = new ByteArrayInputStream(garbage);
        new DumpArchiveInputStream(bais);
    }

    @Test
    public void testMatchesLargeBufferInvalidChecksum() {
        byte[] buffer = new byte[DumpArchiveConstants.TP_SIZE];
        Assert.assertFalse(DumpArchiveInputStream.matches(buffer, buffer.length));
    }

    @Test(expected = ArchiveException.class)
    public void testConstructorWithEncodingInvalidStream() throws ArchiveException, IOException {
        byte[] garbage = new byte[1024];
        ByteArrayInputStream bais = new ByteArrayInputStream(garbage);
        new DumpArchiveInputStream(bais, "UTF-8");
    }

    @Test
    public void testMatchesLengthTooShortForTpSize() {
        byte[] buffer = new byte[500];
        Assert.assertFalse(DumpArchiveInputStream.matches(buffer, 500));
    }
}
