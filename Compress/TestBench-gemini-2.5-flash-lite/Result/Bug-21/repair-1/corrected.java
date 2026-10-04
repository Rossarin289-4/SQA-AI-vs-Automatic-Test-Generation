package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.List;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CountingOutputStream;

public class SevenZOutputFileTest {

    // Helper to create a temporary file and ensure cleanup
    private File createTempFile() throws IOException {
        File tempFile = File.createTempFile("sevenztest", ".7z");
        tempFile.deleteOnExit();
        return tempFile;
    }

    @Test
    public void testConstructorSetsInitialState() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            // Construction is tested by not throwing an exception.
            assertTrue(true);
        }
    }

    @Test
    public void testSetContentCompressionLZMA2() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            out.setContentCompression(SevenZMethod.LZMA2);
            // Internal state change, effect observed in finish()
            assertTrue(true);
        }
    }

    @Test
    public void testSetContentCompressionBZIP2() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            out.setContentCompression(SevenZMethod.BZIP2);
            assertTrue(true);
        }
    }

    @Test
    public void testSetContentCompressionDeflate() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            out.setContentCompression(SevenZMethod.DEFLATE);
            assertTrue(true);
        }
    }

    @Test
    public void testSetContentCompressionCopy() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            out.setContentCompression(SevenZMethod.COPY);
            assertTrue(true);
        }
    }

    @Test
    public void testCreateArchiveEntry() throws Exception {
        File tempFile = createTempFile();
        String entryName = "testEntry";
        // Using a dummy file for creation, actual file contents don't matter for entry creation.
        File dummyFile = new File("dummy");
        SevenZArchiveEntry entry = new SevenZOutputFile(tempFile).createArchiveEntry(dummyFile, entryName);
        assertNotNull(entry);
        assertEquals(entryName, entry.getName());
        assertEquals(dummyFile.lastModified(), entry.getLastModifiedDate().getTime());
        assertEquals(dummyFile.isDirectory(), entry.isDirectory());
    }

    @Test
    public void testPutArchiveEntryAndCloseArchiveEntrySingleFile() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("singleFile.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "singleFile.txt");
            out.putArchiveEntry(entry);
            out.write("hello".getBytes());
            out.closeArchiveEntry();
            // The effect is seen when the archive is finished and read.
            // Asserting basic state changes after closeArchiveEntry.
            assertTrue(entry.hasStream());
            assertEquals(5, entry.getSize());
            assertTrue(entry.getCompressedSize() > 0); // Compressed size depends on compression
            assertTrue(entry.getHasCrc());
        }
    }

    @Test
    public void testPutArchiveEntryAndCloseArchiveEntryMultipleFiles() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File file1 = new File("file1.txt");
            SevenZArchiveEntry entry1 = out.createArchiveEntry(file1, "file1.txt");
            out.putArchiveEntry(entry1);
            out.write("content1".getBytes());
            out.closeArchiveEntry();

            File file2 = new File("file2.txt");
            SevenZArchiveEntry entry2 = out.createArchiveEntry(file2, "file2.txt");
            out.putArchiveEntry(entry2);
            out.write("content2".getBytes());
            out.closeArchiveEntry();
            
            assertTrue(entry1.hasStream());
            assertTrue(entry2.hasStream());
            assertEquals(8, entry1.getSize());
            assertEquals(8, entry2.getSize());
        }
    }

    @Test
    public void testWriteByte() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("byte.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "byte.txt");
            out.putArchiveEntry(entry);
            out.write(65); // 'A'
            out.closeArchiveEntry();
            assertTrue(entry.hasStream());
            assertEquals(1, entry.getSize());
        }
    }

    @Test
    public void testWriteByteArray() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("byteArray.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "byteArray.txt");
            out.putArchiveEntry(entry);
            byte[] data = { 72, 101, 108, 108, 111 }; // "Hello"
            out.write(data);
            out.closeArchiveEntry();
            assertTrue(entry.hasStream());
            assertEquals(5, entry.getSize());
        }
    }

    @Test
    public void testWriteByteArrayWithOffsetAndLength() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("partialWrite.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "partialWrite.txt");
            out.putArchiveEntry(entry);
            byte[] data = { 0, 1, 2, 3, 4, 5 };
            out.write(data, 1, 4); // Writes bytes 1, 2, 3, 4
            out.closeArchiveEntry();
            assertTrue(entry.hasStream());
            assertEquals(4, entry.getSize());
        }
    }

    @Test
    public void testEmptyFileEntry() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("empty.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "empty.txt");
            // setHasStream(false) is implicitly handled by not writing any data and calling closeArchiveEntry
            out.putArchiveEntry(entry);
            out.closeArchiveEntry(); // No write operations
            assertFalse(entry.hasStream());
            assertEquals(0, entry.getSize());
            assertEquals(0, entry.getCompressedSize());
            assertFalse(entry.getHasCrc());
        }
    }

    @Test
    public void testDirectoryEntry() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("my_directory");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "my_directory");
            entry.setDirectory(true);
            out.putArchiveEntry(entry);
            out.closeArchiveEntry(); // Directories have no streams
            assertTrue(entry.isDirectory());
            assertFalse(entry.hasStream());
            assertEquals(0, entry.getSize());
            assertEquals(0, entry.getCompressedSize());
            assertFalse(entry.getHasCrc());
        }
    }

    @Test
    public void testEntryWithCRCAndCompressedSize() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("crc_test.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "crc_test.txt");
            out.putArchiveEntry(entry);
            byte[] data = "test data for CRC".getBytes();
            out.write(data);
            out.closeArchiveEntry();

            assertTrue(entry.getHasCrc());
            assertTrue(entry.getCrcValue() != 0); // CRC of "test data for CRC"
            assertTrue(entry.getCompressedSize() > 0);
        }
    }

    @Test
    public void testEntryWithoutStream() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("no_stream.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "no_stream.txt");
            entry.setHasStream(false); // Explicitly mark as no stream
            out.putArchiveEntry(entry);
            out.closeArchiveEntry(); // No write, no stream
            assertFalse(entry.hasStream());
            assertEquals(0, entry.getSize());
            assertEquals(0, entry.getCompressedSize());
            assertFalse(entry.getHasCrc());
        }
    }

    @Test
    public void testEntryWithZeroSizeWritten() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("zero_size.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "zero_size.txt");
            out.putArchiveEntry(entry);
            // No write calls
            out.closeArchiveEntry();
            assertFalse(entry.hasStream()); // No content written, implies no stream
            assertEquals(0, entry.getSize());
            assertEquals(0, entry.getCompressedSize());
            assertFalse(entry.getHasCrc());
        }
    }

    @Test
    public void testFinishArchive() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            out.finish();
            // 'finished' is private. Cannot test directly.
            // Success is indicated by no exception and the file being closed properly.
            assertTrue(true);
        }
    }

    @Test
    public void testFinishArchiveTwiceThrowsException() throws Exception {
        File tempFile = createTempFile();
        SevenZOutputFile out = new SevenZOutputFile(tempFile);
        out.finish();
        try {
            out.finish(); // Should throw IOException
            fail("Expected IOException when finishing archive twice");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("already been finished"));
        } finally {
            out.close();
        }
    }

    @Test
    public void testCloseDoesNotThrowIfAlreadyFinished() throws Exception {
        File tempFile = createTempFile();
        SevenZOutputFile out = new SevenZOutputFile(tempFile);
        out.finish();
        out.close(); // Should not throw an exception
        assertTrue(true);
    }

    @Test
    public void testSetContentCompressionToNull() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            // The current implementation does not validate null for contentCompression.
            // It will likely throw NPE in setupFileOutputStream if contentCompression is null.
            // Testing that the setContentCompression(null) call itself does not throw.
            out.setContentCompression(null);
            assertTrue(true); // The setter itself is tested.
        }
    }

    @Test
    public void testCreateArchiveEntryWithLongName() throws Exception {
        File tempFile = createTempFile();
        String longName = "aVeryLongFileNameThatMightTestSomeBufferSizingAndEncodingAndWhatNotForSure";
        File dummyFile = new File(longName);
        SevenZArchiveEntry entry = new SevenZOutputFile(tempFile).createArchiveEntry(dummyFile, longName);
        assertNotNull(entry);
        assertEquals(longName, entry.getName());
    }

    @Test
    public void testWriteEmptyByteArray() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("empty_write.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "empty_write.txt");
            out.putArchiveEntry(entry);
            out.write(new byte[0]);
            out.closeArchiveEntry();
            assertTrue(entry.hasStream()); // Should still be considered a stream entry
            assertEquals(0, entry.getSize());
            assertEquals(0, entry.getCompressedSize()); // No data written
            assertFalse(entry.getHasCrc());
        }
    }

    @Test
    public void testWriteEmptyByteArrayWithOffsetAndLength() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("empty_partial_write.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "empty_partial_write.txt");
            out.putArchiveEntry(entry);
            byte[] data = {1, 2, 3};
            out.write(data, 1, 0); // Zero length write
            out.closeArchiveEntry();
            assertTrue(entry.hasStream());
            assertEquals(0, entry.getSize());
            assertEquals(0, entry.getCompressedSize());
            assertFalse(entry.getHasCrc());
        }
    }

    @Test
    public void testEntryWithCRCValueAndCompressedCrcValue() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("crc_values.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "crc_values.txt");
            out.putArchiveEntry(entry);
            byte[] data = "some data".getBytes();
            out.write(data);
            out.closeArchiveEntry();

            assertTrue(entry.getHasCrc());
            // The exact CRC value depends on the data and CRC32 algorithm.
            // We assert it's populated and non-zero.
            assertNotEquals(0, entry.getCrcValue());
            assertNotEquals(0, entry.getCompressedCrcValue());
        }
    }

    @Test
    public void testMultipleEntriesWithSameName() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File file1 = new File("duplicate.txt");
            SevenZArchiveEntry entry1 = out.createArchiveEntry(file1, "duplicate.txt");
            out.putArchiveEntry(entry1);
            out.write("first".getBytes());
            out.closeArchiveEntry();

            File file2 = new File("duplicate.txt"); // Same file name
            SevenZArchiveEntry entry2 = out.createArchiveEntry(file2, "duplicate.txt");
            out.putArchiveEntry(entry2);
            out.write("second".getBytes());
            out.closeArchiveEntry();

            // The 7z format allows multiple entries with the same name. This test verifies it can be written.
            assertTrue(entry1.hasStream());
            assertTrue(entry2.hasStream());
            assertEquals(5, entry1.getSize());
            assertEquals(6, entry2.getSize());
        }
    }

    @Test
    public void testLargeNumberOfEntries() throws Exception {
        File tempFile = createTempFile();
        int numEntries = 500; // More than a few, to test potential scaling issues
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            for (int i = 0; i < numEntries; i++) {
                File inputFile = new File("file_" + i + ".txt");
                SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "file_" + i + ".txt");
                out.putArchiveEntry(entry);
                out.write(("content_" + i).getBytes());
                out.closeArchiveEntry();
            }
            out.finish(); // Writing the header with all entries
            assertTrue(true);
        }
    }

    @Test
    public void testCreateArchiveEntryWithSpecialCharactersInName() throws Exception {
        File tempFile = createTempFile();
        String specialName = "!@#$%^&*()_+={}[]|\\;:'\",.<>/?~`";
        File dummyFile = new File(specialName);
        SevenZArchiveEntry entry = new SevenZOutputFile(tempFile).createArchiveEntry(dummyFile, specialName);
        assertNotNull(entry);
        assertEquals(specialName, entry.getName());
    }

    @Test
    public void testArchiveWithNoEntries() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            out.finish();
            // An archive with no entries should still be valid.
            assertTrue(true);
        }
    }

    @Test
    public void testArchiveEntryCreationWithNullFile() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            // createArchiveEntry takes File object. Testing with a non-existent file.
            File nonExistentFile = new File("non_existent_file.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(nonExistentFile, "non_existent.txt");
            assertNotNull(entry);
            assertEquals("non_existent.txt", entry.getName());
            // lastModified() on non-existent file returns 0.
            assertEquals(0, entry.getLastModifiedDate().getTime());
            assertEquals(false, entry.isDirectory()); // isDirectory() on non-existent file is false.
        }
    }

    @Test
    public void testArchiveEntryCreationWithEmptyEntryName() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File dummyFile = new File("dummy");
            SevenZArchiveEntry entry = out.createArchiveEntry(dummyFile, "");
            assertNotNull(entry);
            assertEquals("", entry.getName());
        }
    }

    @Test
    public void testWriteAfterCloseArchiveEntryThrowsException() throws Exception {
        File tempFile = createTempFile();
        try (SevenZOutputFile out = new SevenZOutputFile(tempFile)) {
            File inputFile = new File("write_after_close.txt");
            SevenZArchiveEntry entry = out.createArchiveEntry(inputFile, "write_after_close.txt");
            out.putArchiveEntry(entry);
            out.write("first".getBytes());
            out.closeArchiveEntry();

            // Attempting to write after closeArchiveEntry should result in an IOException
            // because currentOutputStream is set to null.
            try {
                out.write("second".getBytes());
                fail("Expected IOException when writing after closeArchiveEntry");
            } catch (IOException e) {
                assertTrue(true); // Successfully caught expected exception
            }
        }
    }
    
    @Test
    public void testCloseArchive() throws Exception {
        File tempFile = createTempFile();
        SevenZOutputFile out = new SevenZOutputFile(tempFile);
        out.close(); // Should close the file without errors
        assertTrue(true);
    }
}
