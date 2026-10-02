package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ZipArchiveInputStreamAI5Test {

    @Test
    public void testGetNextZipEntryEmptyStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testMatchesEmptySignature() {
        boolean matches = ZipArchiveInputStream.matches(new byte[0], 0);
        assertTrue(!matches);
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStream() throws IOException {
        ZipArchiveInputStream zis = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        zis.close();
        byte[] buf = new byte[10];
        zis.read(buf, 0, 10);
    }
}
