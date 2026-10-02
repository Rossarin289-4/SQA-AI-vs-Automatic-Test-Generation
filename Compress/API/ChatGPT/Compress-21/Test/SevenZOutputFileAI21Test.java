package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class SevenZOutputFileAI21Test {

    @Test
    public void testCreateArchiveEntry() throws IOException {
        File tempFile = File.createTempFile("sevenz-test", ".tmp");
        tempFile.deleteOnExit();

        File archiveFile = File.createTempFile("sevenz-archive", ".7z");
        archiveFile.deleteOnExit();

        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = sevenZOutputFile.createArchiveEntry(tempFile, "testEntryName");
            assertNotNull(entry);
        } finally {
            sevenZOutputFile.close();
        }
    }

    @Test
    public void testSetContentCompression() throws IOException {
        File archiveFile = File.createTempFile("sevenz-archive", ".7z");
        archiveFile.deleteOnExit();

        SevenZOutputFile sevenZOutputFile = new SevenZOutputFile(archiveFile);
        try {
            sevenZOutputFile.setContentCompression(SevenZMethod.COPY);
        } finally {
            sevenZOutputFile.close();
        }
    }

    @Test(expected = IOException.class)
    public void testOpenInvalidFile() throws IOException {
        File invalidFile = new File("");
        new SevenZOutputFile(invalidFile);
    }
}
