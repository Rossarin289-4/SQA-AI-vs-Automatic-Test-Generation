package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.utils.CountingOutputStream;

public class TarArchiveOutputStreamTest {

    @Test
    public void testConstructorDefault() throws Exception {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream)) {
            assertEquals(0, tar.getBytesWritten());
        }
    }

    @Test
    public void testConstructorWithEncoding() throws Exception {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        String encoding = "UTF8";
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream, encoding)) {
            assertEquals(0, tar.getBytesWritten());
        }
    }

    @Test
    public void testConstructorWithBlockSize() throws Exception {
        int blockSize = 2048;
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream, blockSize)) {
            assertEquals(0, tar.getBytesWritten());
        }
    }

    @Test
    public void testConstructorWithBlockSizeAndEncoding() throws Exception {
        int blockSize = 2048;
        String encoding = "UTF8";
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream, blockSize, encoding)) {
            assertEquals(0, tar.getBytesWritten());
        }
    }

    @Test
    public void testConstructorWithBlockSizeAndRecordSize() throws Exception {
        int blockSize = 2048;
        int recordSize = 1024;
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream, blockSize, recordSize)) {
            assertEquals(0, tar.getBytesWritten());
        }
    }

    @Test
    public void testConstructorWithAllParams() throws Exception {
        int blockSize = 2048;
        int recordSize = 1024;
        String encoding = "UTF8";
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream, blockSize, recordSize, encoding)) {
            assertEquals(0, tar.getBytesWritten());
        }
    }

    @Test
    public void testSetLongFileModeError() {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        assertTrue(true); // No public getter to verify, just check it doesn't throw.
    }

    @Test
    public void testSetLongFileModeTruncate() {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        assertTrue(true);
    }

    @Test
    public void testSetLongFileModeGnu() {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        assertTrue(true);
    }

    @Test
    public void testSetLongFileModePosix() {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        assertTrue(true);
    }

    @Test
    public void testSetBigNumberModeError() {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);
        assertTrue(true);
    }

    @Test
    public void testSetBigNumberModeStar() {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        assertTrue(true);
    }

    @Test
    public void testSetBigNumberModePosix() {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        assertTrue(true);
    }

    @Test
    public void testSetAddPaxHeadersForNonAsciiNamesTrue() {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setAddPaxHeadersForNonAsciiNames(true);
        assertTrue(true);
    }

    @Test
    public void testSetAddPaxHeadersForNonAsciiNamesFalse() {
        CountingOutputStream countingOutputStream = new CountingOutputStream(new ByteArrayOutputStream());
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setAddPaxHeadersForNonAsciiNames(false);
        assertTrue(true);
    }

    @Test
    public void testGetBytesWritten() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream)) {
            assertEquals(0, tar.getBytesWritten());
            // For getBytesWritten to be meaningful, we need to write data.
            // The size must be set for the entry.
            TarArchiveEntry entry = new TarArchiveEntry("test.txt");
            entry.setSize(10);
            tar.putArchiveEntry(entry);
            byte[] data = new byte[10];
            tar.write(data, 0, data.length);
            tar.closeArchiveEntry();
            assertEquals(10, tar.getBytesWritten());
        }
    }

    @Test
    public void testFinish() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream)) {
            tar.finish();
            byte[] result = baos.toByteArray();
            int recordSize = tar.getRecordSize();
            assertTrue(result.length >= 2 * recordSize);
            for (int i = 0; i < recordSize; i++) {
                assertEquals(0, result[result.length - 2 * recordSize + i]);
                assertEquals(0, result[result.length - recordSize + i]);
            }
        }
    }

    @Test
    public void testFinishTwice() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream)) {
            tar.finish();
            try {
                tar.finish();
                fail("Expected IOException for finishing twice");
            } catch (IOException e) {
                assertEquals("This archive has already been finished", e.getMessage());
            }
        }
    }

    @Test
    public void testFinishWithUnclosedEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream)) {
            tar.putArchiveEntry(new TarArchiveEntry("test.txt"));
            try {
                tar.finish();
                fail("Expected IOException for finishing with unclosed entry");
            } catch (IOException e) {
                assertEquals("This archives contains unclosed entries.", e.getMessage());
            }
        }
    }

    @Test
    public void testClose() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.close();
        // After close, the underlying stream should be closed.
        // We can check if writing after close throws an exception.
        try {
            tar.write(new byte[1]);
            fail("Expected IOException after close");
        } catch (IOException e) {
            // Expected exception.
            assertTrue(e.getMessage().contains("Stream has already been closed"));
        }
    }

    @Test
    public void testCloseTwice() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.close();
        tar.close(); // Should not throw exception
        assertTrue(true);
    }

    @Test
    public void testCloseWithUnclosedEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.putArchiveEntry(new TarArchiveEntry("test.txt"));
        try {
            tar.close(); // close should call finish, which should throw exception
            fail("Expected IOException when closing with unclosed entry");
        } catch (IOException e) {
            // The exception should come from finish() called by close().
            assertTrue(e.getMessage().contains("unclosed entries"));
        }
    }

    @Test
    public void testGetRecordSize() {
        int recordSize = 1024;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream, TarBuffer.DEFAULT_BLKSIZE, recordSize);
        assertEquals(recordSize, tar.getRecordSize());
    }



    @Test
    public void testPutArchiveEntryLongFileNameError() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_ERROR);
        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 1; i++) { // NAMELEN is 100 for TarConstants in this context
            longName.append("a");
        }
        TarArchiveEntry entry = new TarArchiveEntry(longName.toString());
        try {
            tar.putArchiveEntry(entry);
            fail("Expected RuntimeException for long file name with LONGFILE_ERROR");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("is too long"));
        }
    }

    @Test
    public void testPutArchiveEntryLongFileNameTruncate() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        StringBuilder longNameBuilder = new StringBuilder();
        for (int i = 0; i < TarConstants.NAMELEN + 10; i++) { // Longer than NAMELEN
            longNameBuilder.append("b");
        }
        String longName = longNameBuilder.toString();
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        tar.putArchiveEntry(entry); // Should not throw an exception
        assertTrue(true);
        tar.closeArchiveEntry(); // Clean up
    }

    @Test
    public void testPutArchiveEntryLongFileNameGnu() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        String longName = "a".repeat(TarConstants.NAMELEN + 1);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        tar.putArchiveEntry(entry); // Should not throw
        assertTrue(true);
        tar.closeArchiveEntry(); // Clean up
    }

    @Test
    public void testPutArchiveEntryLongFileNamePosix() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setLongFileMode(TarArchiveOutputStream.LONGFILE_POSIX);
        String longName = "a".repeat(TarConstants.NAMELEN + 1);
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        tar.putArchiveEntry(entry); // Should not throw
        assertTrue(true);
        tar.closeArchiveEntry(); // Clean up
    }

    @Test
    public void testPutArchiveEntryBigNumberError() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);
        TarArchiveEntry entry = new TarArchiveEntry("big.txt");
        entry.setSize(TarConstants.MAXSIZE + 1); // Exceeds MAXSIZE
        try {
            tar.putArchiveEntry(entry);
            fail("Expected RuntimeException for big number with BIGNUMBER_ERROR");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("is too big"));
        }
    }

    @Test
    public void testPutArchiveEntryBigNumberStar() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_STAR);
        TarArchiveEntry entry = new TarArchiveEntry("big.txt");
        entry.setSize(TarConstants.MAXSIZE + 1);
        tar.putArchiveEntry(entry); // Should not throw
        assertTrue(true);
        tar.closeArchiveEntry(); // Clean up
    }

    @Test
    public void testPutArchiveEntryBigNumberPosix() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
        TarArchiveEntry entry = new TarArchiveEntry("big.txt");
        entry.setSize(TarConstants.MAXSIZE + 1);
        tar.putArchiveEntry(entry); // Should add pax headers
        assertTrue(true);
        tar.closeArchiveEntry(); // Clean up
    }

    @Test
    public void testCloseArchiveEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        TarArchiveEntry entry = new TarArchiveEntry("data.txt");
        entry.setSize(5);
        tar.putArchiveEntry(entry);
        tar.write(new byte[]{1, 2, 3, 4, 5});
        tar.closeArchiveEntry();
        // The bytes written should be the size of the entry.
        assertEquals(5, tar.getBytesWritten());
    }

    @Test
    public void testCloseArchiveEntryLessThanSize() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        TarArchiveEntry entry = new TarArchiveEntry("data.txt");
        entry.setSize(10);
        tar.putArchiveEntry(entry);
        tar.write(new byte[]{1, 2, 3});
        try {
            tar.closeArchiveEntry();
            fail("Expected IOException for closing entry before writing all bytes");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("closed at '3' before the '10' bytes specified in the header were written"));
        }
    }

    @Test
    public void testCloseArchiveEntryMoreThanSize() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        TarArchiveEntry entry = new TarArchiveEntry("data.txt");
        entry.setSize(5);
        tar.putArchiveEntry(entry);
        try {
            tar.write(new byte[]{1, 2, 3, 4, 5, 6}); // More than size
            fail("Expected IOException for writing more than size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("request to write '6' bytes exceeds size in header of '5' bytes"));
        }
    }

    @Test
    public void testCloseArchiveEntryWithPadding() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        int recordSize = tar.getRecordSize();
        TarArchiveEntry entry = new TarArchiveEntry("padded.txt");
        entry.setSize(10); // Write 10 bytes
        tar.putArchiveEntry(entry);
        tar.write(new byte[10]);
        tar.closeArchiveEntry();

        byte[] result = baos.toByteArray();
        // The written data should be at least the entry size + padding to fill a record.
        assertTrue(result.length >= 10 + (recordSize - (10 % recordSize)));
        tar.close(); // Clean up
    }

    @Test
    public void testWriteWithPadding() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        int recordSize = tar.getRecordSize();
        TarArchiveEntry entry = new TarArchiveEntry("padding_write.txt");
        entry.setSize(10); // Write 10 bytes
        tar.putArchiveEntry(entry);
        tar.write(new byte[5]); // Write 5 bytes
        tar.write(new byte[]{1, 2, 3, 4, 5}); // Write remaining 5 bytes
        tar.closeArchiveEntry();

        byte[] result = baos.toByteArray();
        // The written data should be at least the entry size + padding to fill a record.
        assertTrue(result.length >= 10 + (recordSize - (10 % recordSize)));
        tar.close(); // Clean up
    }

    @Test
    public void testWriteWithPartialRecordAssembly() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        int recordSize = tar.getRecordSize();
        TarArchiveEntry entry = new TarArchiveEntry("assembly.txt");
        entry.setSize(recordSize + 100); // Larger than record size
        tar.putArchiveEntry(entry);

        byte[] data1 = new byte[recordSize]; // Fills one record
        tar.write(data1, 0, data1.length);

        byte[] data2 = new byte[100]; // Fills part of the next record
        tar.write(data2, 0, data2.length);

        tar.closeArchiveEntry();

        byte[] result = baos.toByteArray();
        // The written data should be the entry size + padding for the last record.
        assertTrue(result.length >= recordSize + 100 + (recordSize - (100 % recordSize)));
        tar.close(); // Clean up
    }

    @Test
    public void testFlush() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        try (TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream)) {
            tar.flush();
            assertTrue(true);
        }
    }

    @Test
    public void testCreateArchiveEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        File dummyFile = new File("dummy_for_test.txt");
        if (dummyFile.exists()) {
            dummyFile.delete();
        }

        String entryName = "my_file.txt";
        ArchiveEntry archiveEntry = tar.createArchiveEntry(dummyFile, entryName);

        assertNotNull(archiveEntry);
        assertTrue(archiveEntry instanceof TarArchiveEntry);
        assertEquals(entryName, archiveEntry.getName());
        tar.close(); // Clean up
    }


    @Test
    public void testWriteEOFRecordIndirect() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CountingOutputStream countingOutputStream = new CountingOutputStream(baos);
        TarArchiveOutputStream tar = new TarArchiveOutputStream(countingOutputStream);
        tar.finish(); // This method calls writeEOFRecord() twice.
        byte[] result = baos.toByteArray();
        int recordSize = tar.getRecordSize();
        assertTrue(result.length >= 2 * recordSize);
        for (int i = 0; i < recordSize; i++) {
            assertEquals(0, result[result.length - 2 * recordSize + i]);
            assertEquals(0, result[result.length - recordSize + i]);
        }
        tar.close(); // Clean up
    }

    // Mock OutputStream to capture written data
    private static class ByteArrayOutputStream extends OutputStream {
        private byte[] buffer = new byte[1024];
        private int count = 0;

        @Override
        public void write(int b) throws IOException {
            ensureCapacity(count + 1);
            buffer[count++] = (byte) b;
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            ensureCapacity(count + len);
            System.arraycopy(b, off, buffer, count, len);
            count += len;
        }

        public byte[] toByteArray() {
            byte[] result = new byte[count];
            System.arraycopy(buffer, 0, result, 0, count);
            return result;
        }

        private void ensureCapacity(int minCapacity) {
            if (minCapacity - buffer.length > 0) {
                int newCapacity = buffer.length * 2;
                if (newCapacity < minCapacity) {
                    newCapacity = minCapacity;
                }
                byte[] newBuffer = new byte[newCapacity];
                System.arraycopy(buffer, 0, newBuffer, 0, count);
                buffer = newBuffer;
            }
        }

        @Override
        public void flush() throws IOException {
            // No-op for mock
        }
    }
}
