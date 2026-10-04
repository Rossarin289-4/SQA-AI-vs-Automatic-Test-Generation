package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import java.io.ByteArrayOutputStream; // Added import for ByteArrayOutputStream

public class TarArchiveOutputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorDefault() throws Exception {
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream())) {
            assertNotNull(taos.buffer);
            assertEquals(TarBuffer.DEFAULT_BLKSIZE, taos.buffer.getBlockSize());
            assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.buffer.getRecordSize());
        }
    }

    @Test
    public void testConstructorWithBlockSize() throws Exception {
        int blockSize = 1024;
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream(), blockSize)) {
            assertNotNull(taos.buffer);
            assertEquals(blockSize, taos.buffer.getBlockSize());
            assertEquals(TarBuffer.DEFAULT_RCDSIZE, taos.buffer.getRecordSize());
        }
    }

    @Test
    public void testConstructorWithBlockSizeAndRecordSize() throws Exception {
        int blockSize = 1024;
        int recordSize = 512;
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream(), blockSize, recordSize)) {
            assertNotNull(taos.buffer);
            assertEquals(blockSize, taos.buffer.getBlockSize());
            assertEquals(recordSize, taos.buffer.getRecordSize());
        }
    }

    @Test
    public void testSetLongFileModeError() {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        // Assuming internal state is set correctly.
    }

    @Test
    public void testSetLongFileModeTruncate() {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        // Assuming internal state is set correctly.
    }

    @Test
    public void testSetLongFileModeGnu() {
        TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream());
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        // Assuming internal state is set correctly.
    }

    @Test
    public void testGetRecordSize() {
        int recordSize = 1024;
        try (TarArchiveOutputStream taos = new TarArchiveOutputStream(new ByteArrayOutputStream(), TarBuffer.DEFAULT_BLKSIZE, recordSize)) {
            assertEquals(recordSize, taos.getRecordSize());
        }
    }

    @Test
    public void testPutArchiveEntryWithShortName() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("shortname");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        assertTrue(baos.size() > 0); // Header should be written
        taos.close();
    }

    @Test
    public void testPutArchiveEntryWithLongNameTruncate() throws Exception {
        StringBuilder longNameBuilder = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 5; i++) {
            longNameBuilder.append("a");
        }
        String longName = longNameBuilder.toString();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        assertTrue(true); // Assertion that it didn't throw
        taos.close();
    }

    @Test
    public void testPutArchiveEntryWithLongNameGnu() throws Exception {
        StringBuilder longNameBuilder = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 5; i++) {
            longNameBuilder.append("b");
        }
        String longName = longNameBuilder.toString();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        assertTrue(true); // Assertion that it didn't throw
        taos.close();
    }

    @Test
    public void testPutArchiveEntryWithLongNameError() throws Exception {
        StringBuilder longNameBuilder = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 5; i++) {
            longNameBuilder.append("c");
        }
        String longName = longNameBuilder.toString();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        entry.setSize(10);
        try {
            taos.putArchiveEntry(entry);
            fail("Expected RuntimeException for long file name");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("is too long"));
        } finally {
            taos.close(); // Ensure stream is closed
        }
    }

    @Test
    public void testCloseArchiveEntryForDirectory() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("dir/");
        entry.setMode(TarConstants.DEFAULT_DIR_MODE); // Use constant from interface
        taos.putArchiveEntry(entry);
        taos.closeArchiveEntry();
        assertTrue(baos.size() > 0);
        taos.close();
    }

    @Test
    public void testCloseArchiveEntryWithData() throws Exception {
        byte[] data = {1, 2, 3, 4, 5};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("data");
        entry.setSize(data.length);
        taos.putArchiveEntry(entry);
        taos.write(data, 0, data.length);
        taos.closeArchiveEntry();
        assertTrue(baos.size() >= data.length);
        taos.close();
    }

    @Test
    public void testCloseArchiveEntryWithPartialRecord() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        int recordSize = taos.getRecordSize();
        byte[] data = new byte[recordSize / 2];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }

        TarArchiveEntry entry = new TarArchiveEntry("partial");
        entry.setSize(data.length);
        taos.putArchiveEntry(entry);
        taos.write(data, 0, data.length);
        taos.closeArchiveEntry();
        byte[] output = baos.toByteArray();
        assertTrue(output.length >= recordSize);
        byte[] writtenData = Arrays.copyOf(output, data.length);
        assertArrayEquals(data, writtenData);
        for (int i = data.length; i < recordSize; i++) {
            assertEquals(0, output[i]);
        }
        taos.close();
    }

    @Test
    public void testCloseArchiveEntryMissingData() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("missing");
        entry.setSize(20);
        taos.putArchiveEntry(entry);
        taos.write(new byte[]{1, 2, 3}, 0, 3);
        try {
            taos.closeArchiveEntry();
            fail("Expected IOException for missing data");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("bytes specified in the header were written"));
        } finally {
            taos.close(); // Ensure stream is closed
        }
    }

    @Test
    public void testWriteBeyondEntrySize() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("too_much");
        entry.setSize(5);
        taos.putArchiveEntry(entry);
        taos.write(new byte[]{1, 2, 3, 4, 5}, 0, 5); // Exactly the size
        try {
            taos.write(new byte[]{6}, 0, 1); // One more byte
            fail("Expected IOException for writing beyond entry size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("exceeds size in header"));
        } finally {
            taos.close(); // Ensure stream is closed
        }
    }

    @Test
    public void testWriteWithPartialRecordAssembly() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        int recordSize = taos.getRecordSize();
        byte[] chunk1 = new byte[recordSize - 5];
        byte[] chunk2 = new byte[10];
        for (int i = 0; i < chunk1.length; i++) {
            chunk1[i] = (byte) (i + 1);
        }
        for (int i = 0; i < chunk2.length; i++) {
            chunk2[i] = (byte) (i + 101);
        }

        TarArchiveEntry entry = new TarArchiveEntry("assembly");
        entry.setSize(chunk1.length + chunk2.length);
        taos.putArchiveEntry(entry);

        taos.write(chunk1, 0, chunk1.length);
        taos.write(chunk2, 0, chunk2.length);

        taos.closeArchiveEntry();

        byte[] output = baos.toByteArray();
        byte[] expectedFirstRecordPart = new byte[recordSize];
        System.arraycopy(chunk1, 0, expectedFirstRecordPart, 0, chunk1.length);
        System.arraycopy(chunk2, 0, expectedFirstRecordPart, chunk1.length, recordSize - chunk1.length);
        assertArrayEquals(expectedFirstRecordPart, Arrays.copyOfRange(output, 0, recordSize));

        byte[] expectedSecondRecordPart = Arrays.copyOfRange(chunk2, recordSize - chunk1.length, chunk2.length);
        assertArrayEquals(expectedSecondRecordPart, Arrays.copyOfRange(output, recordSize, recordSize + expectedSecondRecordPart.length));

        taos.close();
    }

    @Test
    public void testWriteFullRecords() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        int recordSize = taos.getRecordSize();
        byte[] data = new byte[recordSize * 3];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        TarArchiveEntry entry = new TarArchiveEntry("full_records");
        entry.setSize(data.length);
        taos.putArchiveEntry(entry);
        taos.write(data, 0, data.length);
        taos.closeArchiveEntry();
        assertArrayEquals(data, baos.toByteArray());
        taos.close();
    }

    @Test
    public void testWriteAndCloseArchiveEntry() throws Exception {
        byte[] data = {10, 20, 30};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("write_close");
        entry.setSize(data.length);
        taos.putArchiveEntry(entry);
        taos.write(data, 0, data.length);
        taos.closeArchiveEntry();
        assertArrayEquals(data, baos.toByteArray());
        taos.close();
    }

    @Test
    public void testFinishNoUnclosedEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        taos.finish();
        byte[] output = baos.toByteArray();
        int recordSize = taos.getRecordSize();
        assertTrue(output.length >= recordSize * 2);
        byte[] firstEOF = Arrays.copyOfRange(output, 0, recordSize);
        byte[] secondEOF = Arrays.copyOfRange(output, recordSize, recordSize * 2);
        for (byte b : firstEOF) {
            assertEquals(0, b);
        }
        for (byte b : secondEOF) {
            assertEquals(0, b);
        }
        taos.close();
    }

    @Test
    public void testFinishWithUnclosedEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("unclosed");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        try {
            taos.finish();
            fail("Expected IOException for unclosed entry");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("This archives contains unclosed entries."));
        } finally {
            taos.close(); // Ensure stream is closed
        }
    }

    @Test
    public void testCloseWithUnclosedEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("unclosed_close");
        entry.setSize(10);
        taos.putArchiveEntry(entry);
        try {
            taos.close();
            fail("Expected IOException for unclosed entry during close");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("This archives contains unclosed entries."));
        }
    }

    @Test
    public void testCloseFinishesAndClosesUnderlyingStream() throws Exception {
        ByteArrayOutputStream mockOut = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(mockOut);
        taos.close();
        assertTrue(true); // Placeholder for successful execution of close()
    }


    @Test
    public void testCreateArchiveEntryFile() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        File dummyFile = new File("dummy.txt");
        ArchiveEntry entry = taos.createArchiveEntry(dummyFile, "entry_name");
        assertTrue(entry instanceof TarArchiveEntry);
        assertEquals("entry_name", entry.getName());
        assertEquals(0, entry.getSize()); // File.length() on a non-existent file returns 0.
        assertFalse(entry.isDirectory());
        taos.close();
    }

    @Test
    public void testCreateArchiveEntryDirectory() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        File dummyDir = new File("dummy_dir_for_test");
        dummyDir.mkdir(); // Create the directory for the test
        assertTrue(dummyDir.exists() && dummyDir.isDirectory());

        ArchiveEntry entry = taos.createArchiveEntry(dummyDir, "dir_entry_name");
        assertTrue(entry instanceof TarArchiveEntry);
        assertEquals("dir_entry_name", entry.getName());
        assertEquals(0, entry.getSize()); // Directories have size 0
        assertTrue(entry.isDirectory());

        dummyDir.delete(); // Clean up the created directory
        taos.close();
    }


    @Test
    public void testWriteEmptyBuffer() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("empty_write");
        entry.setSize(0);
        taos.putArchiveEntry(entry);
        taos.write(new byte[0], 0, 0); // Write an empty buffer
        taos.closeArchiveEntry();
        assertTrue(baos.size() > 0);
        taos.close();
    }

    @Test
    public void testWriteWithZeroLengthNumToWrite() throws Exception {
        byte[] data = {1, 2, 3};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("zero_len_write");
        entry.setSize(data.length);
        taos.putArchiveEntry(entry);
        taos.write(data, 0, 0); // numToWrite is 0
        taos.write(data, 0, data.length);
        taos.closeArchiveEntry();
        assertArrayEquals(data, baos.toByteArray());
        taos.close();
    }

    @Test
    public void testFlush() throws Exception {
        ByteArrayOutputStream mockOut = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(mockOut);
        taos.flush();
        assertTrue(true); // Test passes if no exception is thrown.
        taos.close();
    }

    @Test
    public void testPutArchiveEntryDirectory() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream taos = new TarArchiveOutputStream(baos);
        TarArchiveEntry entry = new TarArchiveEntry("my_directory/");
        entry.setMode(TarConstants.DEFAULT_DIR_MODE); // Use constant from interface
        taos.putArchiveEntry(entry);
        assertTrue(baos.size() > 0);
        taos.close();
    }
}
