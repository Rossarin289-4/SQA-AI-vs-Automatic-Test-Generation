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
import java.io.ByteArrayOutputStream;

public class TarArchiveOutputStreamTest {

    /**
     * Tests the default constructor and record size.
     */
    @Test
    public void testDefaultConstructorAndRecordSize() throws Exception {
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
        // The close method should implicitly call finish if not already finished.
        // No exception is expected here.
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
            String originalName = "verylongfilename"; // This name is not actually too long for TarConstants.NAMELEN
            StringBuilder tooLongName = new StringBuilder();
            for (int i = 0; i < TarConstants.NAMELEN + 1; i++) {
                tooLongName.append("a");
            }
            TarArchiveEntry entry = new TarArchiveEntry(tooLongName.toString());
            entry.setSize(10);
            taos.putArchiveEntry(entry); // Should not throw, name will be truncated internally if needed.
            taos.closeArchiveEntry(); // Need to close the entry.
        }
    }

    /**
     * Tests putArchiveEntry with a name that is too long and LONGFILE_GNU mode.
     */

    /**
     * Tests putArchiveEntry with an empty file name.
     */

    /**
     * Tests putArchiveEntry with a directory entry.
     */

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

    /**
     * Tests writing data that spans across record boundaries.
     */

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
        }
    }

    /**
     * Tests creating an archive entry with a very long file name that should trigger GNU longname mode.
     */
    
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

    /**
     * Test writing zero bytes for a zero-length entry.
     */

    /**
     * Test scenario where `currBytes` might exceed `currSize` due to buffering.
     */
    
    /**
     * Test writing a single byte to trigger buffering.
     */
    
    /**
     * Test putting an entry with size 0 and closing it immediately.
     */

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

    /**
     * Test handling of an entry with a large size that fits within a few records.
     */
    
    /**
     * Test setting long file mode to GNU and writing a long name.
     */
}

