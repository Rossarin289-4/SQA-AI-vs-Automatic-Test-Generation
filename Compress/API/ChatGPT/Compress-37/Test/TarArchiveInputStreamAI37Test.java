package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class TarArchiveInputStreamAI37Test {

    @Test
    public void testMatchesNullOrShortSignature() {
        assertFalse(TarArchiveInputStream.matches(null, 0));
        byte[] shortSig = new byte[10];
        assertFalse(TarArchiveInputStream.matches(shortSig, shortSig.length));
    }

    @Test
    public void testCanReadEntryData() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tais.canReadEntryData(null));
        assertFalse(tais.canReadEntryData(new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("test")));
        
        TarArchiveEntry tarEntry = new TarArchiveEntry("test.txt");
        assertTrue(tais.canReadEntryData(tarEntry));
    }

    @Test(expected = IllegalStateException.class)
    public void testReadWithoutCurrentEntryThrowsException() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        byte[] buf = new byte[5];
        tais.read(buf, 0, 5);
    }
}
