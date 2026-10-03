package org.apache.commons.compress.archivers.sevenz;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class SevenZOutputFileAI21Test {

    @Test
    public void testCreateArchiveEntry() throws IOException {
        File tempFile = File.createTempFile("sevenz_test_", ".tmp");
        tempFile.deleteOnExit();

        File archiveFile = File.createTempFile("archive_", ".7z");
        archiveFile.deleteOnExit();

        SevenZOutputFile output = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = output.createArchiveEntry(tempFile, "testEntryName");
            Assert.assertNotNull(entry);
            Assert.assertEquals("testEntryName", entry.getName());
            Assert.assertEquals(tempFile.isDirectory(), entry.isDirectory());
        } finally {
            output.close();
        }
    }

    @Test
    public void testSetContentCompressionValidMethods() throws IOException {
        File archiveFile = File.createTempFile("archive_", ".7z");
        archiveFile.deleteOnExit();

        SevenZOutputFile output = new SevenZOutputFile(archiveFile);
        try {
            output.setContentCompression(SevenZMethod.COPY);
            output.setContentCompression(SevenZMethod.LZMA2);
            output.setContentCompression(SevenZMethod.BZIP2);
            output.setContentCompression(SevenZMethod.DEFLATE);
        } finally {
            output.close();
        }
    }

    @Test
    public void testPutAndCloseEmptyArchiveEntry() throws IOException {
        File archiveFile = File.createTempFile("archive_", ".7z");
        archiveFile.deleteOnExit();

        SevenZOutputFile output = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = new SevenZArchiveEntry();
            entry.setName("emptyDir");
            entry.setDirectory(true);

            output.putArchiveEntry(entry);
            output.closeArchiveEntry();
            output.finish();
        } finally {
            output.close();
        }
    }

    @Test
    public void testWriteDataToEntry() throws IOException {
        File archiveFile = File.createTempFile("archive_", ".7z");
        archiveFile.deleteOnExit();

        SevenZOutputFile output = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry = new SevenZArchiveEntry();
            entry.setName("file.txt");

            output.putArchiveEntry(entry);
            output.write(new byte[] { 65, 66, 67 });
            output.write(68);
            output.write(new byte[] { 69, 70, 71, 72 }, 1, 2); // writes 'F', 'G'
            output.closeArchiveEntry();
            output.finish();
        } finally {
            output.close();
        }
    }

    @Test(expected = IOException.class)
    public void testFinishTwiceThrowsException() throws IOException {
        File archiveFile = File.createTempFile("archive_", ".7z");
        archiveFile.deleteOnExit();

        SevenZOutputFile output = new SevenZOutputFile(archiveFile);
        try {
            output.finish();
            output.finish(); // should throw IOException
        } finally {
            output.close();
        }
    }

    @Test
    public void testMultipleEntriesAndClose() throws IOException {
        File archiveFile = File.createTempFile("archive_", ".7z");
        archiveFile.deleteOnExit();

        SevenZOutputFile output = new SevenZOutputFile(archiveFile);
        try {
            SevenZArchiveEntry entry1 = new SevenZArchiveEntry();
            entry1.setName("entry1.txt");
            output.putArchiveEntry(entry1);
            output.write(new byte[] { 1, 2, 3 });
            output.closeArchiveEntry();

            SevenZArchiveEntry entry2 = new SevenZArchiveEntry();
            entry2.setName("entry2.txt");
            output.putArchiveEntry(entry2);
            output.write(new byte[] { 4, 5 });
            output.closeArchiveEntry();

            output.finish();
        } finally {
            output.close();
        }
    }
}
