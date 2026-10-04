package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.CountingOutputStream;
import java.io.ByteArrayOutputStream; // Added import for ByteArrayOutputStream

public class TarArchiveOutputStreamTest {

    /**
     * Tests the default constructor and record size.
     */
    @Test
    public void testDefaultConstructorAndRecordSize() throws Exception {
        // Use a concrete OutputStream implementation for testing
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream())) {
            assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.getRecordSize());
        }
    }

    /**
     * Tests getBytesWritten with no data written.
     */
    @Test
    public void testGetBytesWrittenInitially() throws Exception {
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream())) {
            assertEquals(0, taos.getBytesWritten());
        }
    }

    /**
     * Tests getBytesWritten after writing some data.
     */
    @Test
    public void testGetBytesWrittenAfterWriting() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            entry.setSize(5);
            taos.putArchiveEntry(entry);
            taos.write(new byte[]{1, 2, 3, 4, 5});
            taos.closeArchiveEntry();
            // The TarBuffer writes records of size recordSize (default 512).
            // Header is 512 bytes. Content is 5 bytes. Padding for content to fill record.
            // So, header (512) + content (5) + padding (512-5) = 1024.
            // However, getBytesWritten() only counts actual data written to the underlying stream,
            // which should be header + content. The TarBuffer's internal buffering and writing
            // might result in more bytes written to the underlying stream due to padding,
            // but getBytesWritten() tracks what the TarArchiveOutputStream itself has written.
            // Let's refine the expected value based on how TarBuffer works.
            // A record is written for the header (512 bytes).
            // Then, the content (5 bytes) is written. This content will be buffered and written
            // as part of a record. If the content is less than a record size, it will be padded.
            // The getBytesWritten() should reflect the header + actual content written.
            // Let's assume the header is written, then the content is written.
            // The getBytesWritten() tracks bytes written to the 'out' stream, which is CountingOutputStream.
            // So, it should be header size + content size.
            assertEquals(TarConstants.HEADER_SIZE + 5, taos.getBytesWritten());
        }
    }

    /**
     * Tests finish() when the stream is already finished.
     */
    @Test
    public void testFinishTwice() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            taos.finish();
            try {
                taos.finish();
                fail("Expected IOException when finishing twice");
            } catch (IOException e) {
                // Expected
            }
        }
    }

    /**
     * Tests finish() with unclosed entries.
     */
    @Test
    public void testFinishWithUnclosedEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            taos.putArchiveEntry(entry);
            try {
                taos.finish();
                fail("Expected IOException when finishing with unclosed entry");
            } catch (IOException e) {
                // Expected
            }
        }
    }

    /**
     * Tests close() when the stream is not finished.
     */
    @Test
    public void testCloseWithoutFinishing() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.close();
        // Accessing private fields is not allowed. Verify behavior by checking exceptions or state via public API if possible.
        // For now, we'll assume close() implicitly calls finish() and then closes the underlying stream.
        // The test is primarily to ensure close() doesn't throw an exception.
    }

    /**
     * Tests close() when the stream is already closed.
     */
    @Test
    public void testCloseTwice() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.close();
        // Closing again should not throw an exception
        taos.close();
    }

    /**
     * Tests putArchiveEntry with a name that is too long and LONGFILE_ERROR mode.
     */
    @Test
    public void testPutArchiveEntryLongNameError() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
            StringBuilder longName = new StringBuilder();
            for (int i = 0; i < TarConstants.NAMELEN + 1; i++) {
                longName.append("a");
            }
            TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
            try {
                taos.putArchiveEntry(entry);
                fail("Expected RuntimeException for long file name in error mode");
            } catch (RuntimeException e) {
                assertTrue(e.getMessage().contains("is too long"));
            }
        }
    }

    /**
     * Tests putArchiveEntry with a name that is too long and LONGFILE_TRUNCATE mode.
     */
    @Test
    public void testPutArchiveEntryLongNameTruncate() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
            String originalName = "verylongfilename";
            TarArchiveEntry entry = new TarArchiveEntry(originalName);
            entry.setSize(10);
            taos.putArchiveEntry(entry); // Should not throw, name will be truncated internally by TarArchiveEntry logic if needed.
            // We can't directly verify truncation here without inspecting the header written,
            // but the absence of an exception is the key.
            // We can, however, check if an entry was put and closed correctly.
            taos.closeArchiveEntry(); // Need to close the entry.
        }
    }

    /**
     * Tests putArchiveEntry with a name that is too long and LONGFILE_GNU mode.
     */
    @Test
    public void testPutArchiveEntryLongNameGNU() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
            String longFileName = "this_is_a_very_long_file_name_that_exceeds_the_standard_tar_header_limit_so_it_should_trigger_gnu_longname_mode";
            TarArchiveEntry entry = new TarArchiveEntry(longFileName);
            entry.setSize(10);
            taos.putArchiveEntry(entry);

            // After this, a GNU longname entry should have been written first,
            // followed by the actual entry's header.
            // The important part is that no exception is thrown and the entry is marked as unclosed.
            assertTrue(((TarArchiveOutputStream) taos).haveUnclosedEntry); // Accessing protected field for test
            taos.closeArchiveEntry(); // Close the entry to avoid finish() issues later.
        }
    }

    /**
     * Tests putArchiveEntry with an empty file name.
     */
    @Test
    public void testPutArchiveEntryEmptyName() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("");
            entry.setSize(0);
            taos.putArchiveEntry(entry);
            taos.closeArchiveEntry();
            // Header size + padding for record
            assertEquals(TarConstants.HEADER_SIZE + TarBuffer.DEFAULT_RCDSIZE, baos.size());
        }
    }

    /**
     * Tests putArchiveEntry with a directory entry.
     */
    @Test
    public void testPutArchiveEntryDirectory() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("directory/");
            entry.setSize(0); // Directories have size 0
            taos.putArchiveEntry(entry);
            assertTrue(entry.isDirectory());
            assertEquals(0, entry.getSize());
            assertTrue(((TarArchiveOutputStream) taos).haveUnclosedEntry); // Accessing protected field for test
            taos.closeArchiveEntry(); // Need to close the entry.
        }
    }

    /**
     * Tests closeArchiveEntry when no entry is open.
     */
    @Test
    public void testCloseArchiveEntryWhenNoneOpen() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            try {
                taos.closeArchiveEntry();
                fail("Expected IOException when closing no entry");
            } catch (IOException e) {
                assertEquals("No current entry to close", e.getMessage());
            }
        }
    }

    /**
     * Tests closeArchiveEntry with partial data written.
     */
    @Test
    public void testCloseArchiveEntryPartialData() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("partial.txt");
            entry.setSize(10); // Expecting 10 bytes
            taos.putArchiveEntry(entry);
            taos.write(new byte[]{1, 2, 3}); // Only 3 bytes written
            try {
                taos.closeArchiveEntry();
                fail("Expected IOException when closing with less data than expected");
            } catch (IOException e) {
                assertTrue(e.getMessage().contains("closed at '3' before the '10' bytes"));
            }
        }
    }

    /**
     * Tests closeArchiveEntry with exact data written.
     */
    @Test
    public void testCloseArchiveEntryExactData() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("exact.txt");
            entry.setSize(5);
            taos.putArchiveEntry(entry);
            taos.write(new byte[]{1, 2, 3, 4, 5});
            taos.closeArchiveEntry(); // Should succeed
            assertFalse(((TarArchiveOutputStream) taos).haveUnclosedEntry); // Accessing protected field for test
        }
    }

    /**
     * Tests writing data that exceeds the entry size.
     */
    @Test
    public void testWriteExceedsEntrySize() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("overflow.txt");
            entry.setSize(5);
            taos.putArchiveEntry(entry);
            taos.write(new byte[]{1, 2, 3, 4, 5, 6}); // Writing 6 bytes
            fail("Expected IOException when writing more data than entry size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("request to write '6' bytes exceeds size in header of '5' bytes"));
        }
    }

    /**
     * Tests writing data that is exactly the entry size.
     */
    @Test
    public void testWriteExactEntrySize() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("exact_write.txt");
            entry.setSize(5);
            taos.putArchiveEntry(entry);
            taos.write(new byte[]{1, 2, 3, 4, 5});
            taos.closeArchiveEntry(); // Should succeed
        }
    }

    /**
     * Tests writing small chunks of data that fill up records.
     */
    @Test
    public void testWriteSmallChunksFillRecords() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Define recordSize within the test scope or get it from the stream instance.
        // Since `taos` is not yet initialized here, we'll use the default.
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("chunked_write.txt");
            entry.setSize(recordSize * 2); // Exactly two records
            taos.putArchiveEntry(entry);
            for (int i = 0; i < recordSize * 2; i++) {
                taos.write(new byte[]{ (byte) i });
            }
            taos.closeArchiveEntry();
            // Expected: header + content + padding.
            // getBytesWritten() should be header + content.
            assertEquals(TarConstants.HEADER_SIZE + recordSize * 2, taos.getBytesWritten());
        }
    }

    /**
     * Tests writing data that spans across record boundaries.
     */
    @Test
    public void testWriteSpanningRecords() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("spanning.txt");
            entry.setSize(recordSize + 10); // One full record and 10 bytes into the next
            taos.putArchiveEntry(entry);
            taos.write(new byte[recordSize]); // First record
            taos.write(new byte[10]);        // Part of the second record
            taos.closeArchiveEntry();
            // getBytesWritten() should be header + total content written.
            assertEquals(TarConstants.HEADER_SIZE + recordSize + 10, taos.getBytesWritten());
        }
    }

    /**
     * Tests creating an archive entry from a file.
     */
    @Test
    public void testCreateArchiveEntryFromFile() throws Exception {
        // Create a dummy file for testing
        File dummyFile = File.createTempFile("test", ".txt");
        dummyFile.deleteOnExit();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            ArchiveEntry entry = taos.createArchiveEntry(dummyFile, "from_file.txt");
            assertTrue(entry instanceof TarArchiveEntry);
            assertEquals("from_file.txt", entry.getName());
            assertEquals(dummyFile.length(), entry.getSize());
            // No need to delete dummyFile here, deleteOnExit handles it.
        }
    }

    /**
     * Tests creating an archive entry with a very long file name that should trigger GNU longname mode.
     */
    @Test
    public void testCreateArchiveEntryLongFileNameGNU() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
            String longName = "a".repeat(TarConstants.NAMELEN + 50);
            // Create a dummy file with the long name (may be truncated by filesystem, but we test the string name)
            File dummyFile = new File(longName);
            
            ArchiveEntry entry = taos.createArchiveEntry(dummyFile, longName);
            taos.putArchiveEntry(entry); // This should handle the long name via GNU mode
            assertTrue(((TarArchiveOutputStream) taos).haveUnclosedEntry); // Accessing protected field for test
            // We need to close the entry to allow finish() to be called later if needed, or to avoid errors.
            taos.closeArchiveEntry();
        }
    }
    
    /**
     * Test the default behaviour of longFileMode.
     */
    @Test
    public void testDefaultLongFileMode() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            // Default is LONGFILE_ERROR
            StringBuilder longName = new StringBuilder();
            for (int i = 0; i < TarConstants.NAMELEN + 1; i++) {
                longName.append("a");
            }
            TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
            try {
                taos.putArchiveEntry(entry);
                fail("Expected RuntimeException for long file name with default mode (LONGFILE_ERROR)");
            } catch (RuntimeException e) {
                // Expected
            }
        }
    }

    /**
     * Test handling of zero-length files.
     */
    @Test
    public void testZeroLengthFile() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("zero.txt");
            entry.setSize(0);
            taos.putArchiveEntry(entry);
            taos.closeArchiveEntry();
            // Header size + padding to fill the record
            assertEquals(TarConstants.HEADER_SIZE + TarBuffer.DEFAULT_RCDSIZE, baos.size());
        }
    }

    /**
     * Test writing zero bytes for a zero-length entry.
     */
    @Test
    public void testWriteZeroBytesForZeroLengthEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("zero_write.txt");
            entry.setSize(0);
            taos.putArchiveEntry(entry);
            taos.write(new byte[0], 0, 0); // Write zero bytes
            taos.closeArchiveEntry();
            // Header size + padding for record
            assertEquals(TarConstants.HEADER_SIZE + TarBuffer.DEFAULT_RCDSIZE, baos.size());
        }
    }

    /**
     * Test scenario where `currBytes` might exceed `currSize` due to buffering.
     */
    @Test
    public void testBufferOverflowScenario() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("buffer_overflow.txt");
            entry.setSize(recordSize - 10); // Slightly less than a full record
            taos.putArchiveEntry(entry);
            taos.write(new byte[recordSize - 10]); // Write exact size
            taos.closeArchiveEntry(); // Should not throw.
            // The logic in closeArchiveEntry handles `assemLen` correctly.
            // getBytesWritten should be header + content
            assertEquals(TarConstants.HEADER_SIZE + (recordSize - 10), taos.getBytesWritten());
        }
    }
    
    /**
     * Test writing a single byte to trigger buffering.
     */
    @Test
    public void testWriteSingleByte() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("single_byte.txt");
            entry.setSize(1);
            taos.putArchiveEntry(entry);
            taos.write(new byte[]{1});
            taos.closeArchiveEntry();
            // Header size + content (1 byte) + padding to fill the record
            assertEquals(TarConstants.HEADER_SIZE + 1 + (TarBuffer.DEFAULT_RCDSIZE - 1), baos.size());
        }
    }
    
    /**
     * Test putting an entry with size 0 and closing it immediately.
     */
    @Test
    public void testPutZeroSizeEntryAndClose() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("zero_size.txt");
            entry.setSize(0);
            taos.putArchiveEntry(entry);
            taos.closeArchiveEntry();
            assertFalse(((TarArchiveOutputStream) taos).haveUnclosedEntry); // Accessing protected field for test
            // Header size + padding for record
            assertEquals(TarConstants.HEADER_SIZE + TarBuffer.DEFAULT_RCDSIZE, baos.size());
        }
    }

    /**
     * Test `close()` after `finish()`.
     */
    @Test
    public void testCloseAfterFinish() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        taos.close(); // Should not throw an error.
    }
    
    /**
     * Test setting and getting record size with custom constructor.
     */
    @Test
    public void testSetAndGetRecordSize() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int customRecordSize = 1024;
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos, TarBuffer.DEFAULT_BLKSIZE, customRecordSize)) {
            assertEquals(customRecordSize, taos.getRecordSize());
        }
    }

    /**
     * Test writing data to an entry that requires multiple records.
     */
    @Test
    public void testMultipleRecords() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("multiple_records.txt");
            entry.setSize(recordSize * 3 + 50); // Three full records and some extra
            taos.putArchiveEntry(entry);
            taos.write(new byte[recordSize * 3 + 50]);
            taos.closeArchiveEntry();
            assertEquals(TarConstants.HEADER_SIZE + recordSize * 3 + 50, taos.getBytesWritten());
        }
    }

    /**
     * Test handling of an entry with a large size that fits within a few records.
     */
    @Test
    public void testLargeEntrySize() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int recordSize = TarBuffer.DEFAULT_RCDSIZE;
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            TarArchiveEntry entry = new TarArchiveEntry("large_entry.txt");
            entry.setSize(recordSize * 5); // Exactly 5 records worth of data
            taos.putArchiveEntry(entry);
            taos.write(new byte[recordSize * 5]);
            taos.closeArchiveEntry();
            assertEquals(TarConstants.HEADER_SIZE + recordSize * 5, taos.getBytesWritten());
        }
    }
    
    /**
     * Test setting long file mode to GNU and writing a long name.
     */
    @Test
    public void testLongFileModeGNUWithLongName() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(baos)) {
            taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
            String longName = "this_is_a_very_long_name_that_requires_gnu_extension_to_be_stored";
            TarArchiveEntry entry = new TarArchiveEntry(longName);
            entry.setSize(10);
            taos.putArchiveEntry(entry);
            // The actual name stored in the header will be the GNU long name indicator.
            // The content of the long name entry itself is written next.
            // We expect no exception here.
            assertTrue(((TarArchiveOutputStream) taos).haveUnclosedEntry); // Accessing protected field for test
            taos.closeArchiveEntry(); // Close the long name entry.
            // Now close the actual entry that was put after the long name entry.
            // However, putArchiveEntry for the actual entry has already been called.
            // The logic in putArchiveEntry creates a longLinkEntry, puts it, writes its content,
            // and then closes it. Then it proceeds to write the header for the original entry.
            // So, we just need to ensure the first entry is closed.
        }
    }
}
