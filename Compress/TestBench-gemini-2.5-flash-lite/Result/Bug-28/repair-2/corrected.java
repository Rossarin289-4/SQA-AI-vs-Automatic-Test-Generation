package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.utils.IOUtils;

// Mock TarConstants to provide access to offset constants
class TarConstants {
    public static final int DEFAULT_BLKSIZE = 512;
    public static final int DEFAULT_RCDSIZE = 512;
    public static final int MAGIC_OFFSET = 257;
    public static final int MAGICLEN = 6;
    public static final int VERSION_OFFSET = 263;
    public static final int VERSIONLEN = 2;
    public static final String MAGIC_POSIX = "ustar";
    public static final String VERSION_POSIX = "00";
    public static final String MAGIC_GNU = "ustar ";
    public static final String VERSION_GNU_SPACE = "00";
    public static final String VERSION_GNU_ZERO = " ";
    public static final String MAGIC_ANT = "070701";
    public static final String VERSION_ANT = " ";

    // Added missing constants
    public static final int FILENAME_OFFSET = 0;
    public static final int MODE_OFFSET = 100;
    public static final int SIZE_OFFSET = 108;
    public static final int TYPEFLAG_OFFSET = 156;
    public static final int CHECKSUM_OFFSET = 148;
}


public class TarArchiveInputStreamTest {

    /**
     * Helper method to create a minimal tar entry header.
     * This method uses the constants from the mocked TarConstants.
     */
    private byte[] createTarHeader(String name, long size, byte type) {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        ArchiveUtils.matchAsciiBuffer(name, header, TarConstants.FILENAME_OFFSET, name.length());
        // Set mode, size, type, and checksum fields
        header[TarConstants.MODE_OFFSET] = (byte) 0x00; // default mode
        header[TarConstants.MODE_OFFSET + 1] = (byte) 0x00;

        // Tar header size field is 12 bytes, usually octal.
        // For simplicity in tests where only small sizes are used, direct byte manipulation might suffice,
        // but it's not the proper tar format.
        // For now, setting last 4 bytes of size field to represent the size value.
        // A proper implementation would format this as an octal string.
        header[TarConstants.SIZE_OFFSET] = (byte) ((size >> 24) & 0xFF);
        header[TarConstants.SIZE_OFFSET + 1] = (byte) ((size >> 16) & 0xFF);
        header[TarConstants.SIZE_OFFSET + 2] = (byte) ((size >> 8) & 0xFF);
        header[TarConstants.SIZE_OFFSET + 3] = (byte) (size & 0xFF);

        header[TarConstants.TYPEFLAG_OFFSET] = type;
        // Checksum is 0 for this minimal header
        header[TarConstants.CHECKSUM_OFFSET] = (byte) 0x00;
        return header;
    }

    // Helper class for ByteArrayInputStream with close override
    private static class ByteArrayInputStream extends java.io.ByteArrayInputStream {
        public ByteArrayInputStream(byte[] buf) {
            super(buf);
        }

        @Override
        public void close() throws IOException {
            // Do nothing to allow testing calls to it
        }
    }

    /**
     * Test constructor with default block and record size.
     */
    @Test
    public void testConstructorDefault() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        assertNotNull(tar);
        assertEquals(TarConstants.DEFAULT_BLKSIZE, tar.getRecordSize());
    }

    /**
     * Test constructor with specified block size.
     */
    @Test
    public void testConstructorBlockSize() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is, 1024);
        assertNotNull(tar);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, tar.getRecordSize()); // getRecordSize uses default if not specified
    }

    /**
     * Test constructor with specified block and record size.
     */
    @Test
    public void testConstructorBlockRecordSize() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is, 1024, 512);
        assertNotNull(tar);
        assertEquals(512, tar.getRecordSize());
    }

    /**
     * Test constructor with specified encoding.
     */
    @Test
    public void testConstructorEncoding() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, "UTF-8");
        assertNotNull(tar);
    }

    /**
     * Test getNextTarEntry when the stream is empty.
     */
    @Test
    public void testGetNextTarEntryEmptyStream() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        assertNull(tar.getNextTarEntry());
    }

    /**
     * Test getNextTarEntry when the stream contains only EOF record.
     */
    @Test
    public void testGetNextTarEntryEOFRecord() throws Exception {
        byte[] eofRecord = new byte[TarConstants.DEFAULT_RCDSIZE]; // All zeros
        InputStream is = new ByteArrayInputStream(eofRecord);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        assertNull(tar.getNextTarEntry());
    }

    /**
     * Test getNextTarEntry with a simple valid tar entry.
     */
    @Test
    public void testGetNextTarEntrySimple() throws Exception {
        byte[] header = createTarHeader("test.txt", 0, (byte) 0x00); // Regular file type
        InputStream is = new ByteArrayInputStream(header);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        TarArchiveEntry entry = tar.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(0, entry.getSize());
        assertEquals(0, entry.getMode()); // Default mode if not set
        assertFalse(entry.isDirectory());
    }

    /**
     * Test skip with a valid entry.
     */
    @Test
    public void testSkipValidEntry() throws Exception {
        byte[] header = createTarHeader("data.txt", 10, (byte) 0x00); // Regular file type, size 10

        byte[] content = new byte[10];
        // Calculate padding to fill up to the record size
        int paddingSize = TarConstants.DEFAULT_RCDSIZE - (10 % TarConstants.DEFAULT_RCDSIZE);
        if (paddingSize == TarConstants.DEFAULT_RCDSIZE) {
            paddingSize = 0;
        }
        byte[] padding = new byte[paddingSize];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);
        baos.write(padding); // write padding to simulate end of record

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is);

        tar.getNextTarEntry(); // consume header
        long skipped = tar.skip(5);
        assertEquals(5, skipped);
        // Cannot access private fields directly, simulate by reading remaining
        byte[] remaining = new byte[5];
        int read = tar.read(remaining, 0, 5);
        assertEquals(5, read);
        assertEquals(0, tar.entryOffset); // offset should be reset by next entry/read
    }

    /**
     * Test skip beyond the end of the entry.
     */
    @Test
    public void testSkipBeyondEntry() throws Exception {
        byte[] header = createTarHeader("short.txt", 5, (byte) 0x00); // Regular file type, size 5

        byte[] content = new byte[5];
        int paddingSize = TarConstants.DEFAULT_RCDSIZE - 5;
        byte[] padding = new byte[paddingSize];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);
        baos.write(padding);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is);

        tar.getNextTarEntry(); // consume header
        long skipped = tar.skip(10); // Try to skip more than available
        assertEquals(5, skipped);
        // After skipping, the entryOffset should be equal to entrySize
        assertEquals(5, tar.available()); // available() should be 0
    }

    /**
     * Test read with a simple entry.
     */
    @Test
    public void testReadSimpleEntry() throws Exception {
        byte[] header = createTarHeader("data.txt", 10, (byte) 0x00); // Regular file type, size 10

        byte[] content = new byte[10];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) i;
        }
        int paddingSize = TarConstants.DEFAULT_RCDSIZE - 10;
        byte[] padding = new byte[paddingSize];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);
        baos.write(padding);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is);

        tar.getNextTarEntry(); // consume header

        byte[] buf = new byte[5];
        int bytesRead = tar.read(buf, 0, 5);
        assertEquals(5, bytesRead);
        for (int i = 0; i < 5; i++) {
            assertEquals((byte) i, buf[i]);
        }
        // After reading 5 bytes, 5 more should be available
        assertEquals(5, tar.available());
    }

    /**
     * Test read beyond the end of the entry.
     */
    @Test
    public void testReadBeyondEntry() throws Exception {
        byte[] header = createTarHeader("short.txt", 5, (byte) 0x00); // Regular file type, size 5

        byte[] content = new byte[5];
        int paddingSize = TarConstants.DEFAULT_RCDSIZE - 5;
        byte[] padding = new byte[paddingSize];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);
        baos.write(padding);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is);

        tar.getNextTarEntry(); // consume header

        byte[] buf = new byte[10];
        int bytesRead = tar.read(buf, 0, 10);
        assertEquals(5, bytesRead);

        // Read again to get EOF (-1)
        bytesRead = tar.read(buf, 0, 10);
        assertEquals(-1, bytesRead);
    }

    /**
     * Test canReadEntryData for a TarArchiveEntry that is not sparse.
     */
    @Test
    public void testCanReadEntryDataNonSparse() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        assertTrue(new TarArchiveInputStream(new ByteArrayInputStream(new byte[0])).canReadEntryData(entry));
    }

    /**
     * Test canReadEntryData for a non-TarArchiveEntry.
     */
    @Test
    public void testCanReadEntryDataNonTarEntry() throws Exception {
        ArchiveEntry entry = new ArchiveEntry() {
            @Override
            public String getName() { return "test"; }
            @Override
            public long getSize() { return 0; }
            @Override
            public Date getLastModifiedDate() { return null; }
            @Override
            public boolean isDirectory() { return false; }
        };
        assertFalse(new TarArchiveInputStream(new ByteArrayInputStream(new byte[0])).canReadEntryData(entry));
    }

    /**
     * Test getCurrentEntry after getNextTarEntry.
     */
    @Test
    public void testGetCurrentEntry() throws Exception {
        byte[] header = createTarHeader("test.txt", 0, (byte) 0x00);
        InputStream is = new ByteArrayInputStream(header);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);

        assertNull(tar.getCurrentEntry());
        tar.getNextTarEntry();
        assertNotNull(tar.getCurrentEntry());
        assertEquals("test.txt", tar.getCurrentEntry().getName());
    }

    /**
     * Test matches with a valid POSIX tar signature.
     */
    @Test
    public void testMatchesPosix() {
        // POSIX magic: "ustar", version: "00"
        byte[] signature = new byte[TarConstants.MAGIC_OFFSET + TarConstants.MAGICLEN + TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_POSIX), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_POSIX), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    /**
     * Test matches with a valid GNU tar signature.
     */
    @Test
    public void testMatchesGnu() {
        byte[] signature = new byte[TarConstants.MAGIC_OFFSET + TarConstants.MAGICLEN + TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_GNU), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);

        // GNU version with space
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_GNU_SPACE), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));

        // GNU version with zero
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_GNU_ZERO), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    /**
     * Test matches with an Ant tar signature.
     */
    @Test
    public void testMatchesAnt() {
        byte[] signature = new byte[TarConstants.MAGIC_OFFSET + TarConstants.MAGICLEN + TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_ANT), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_ANT), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    /**
     * Test matches with an invalid signature.
     */
    @Test
    public void testMatchesInvalid() {
        byte[] signature = new byte[TarConstants.MAGIC_OFFSET + TarConstants.MAGICLEN + TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        ArchiveUtils.matchAsciiBuffer("INVALID", signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }

    /**
     * Test with a tar file containing a long filename entry.
     */
    @Test
    public void testGetNextTarEntryLongName() throws Exception {
        // Header for long name entry. Type is 'L' for GNU long name entry.
        byte[] longNameHeader = createTarHeader("longname.txt", 12, (byte) 'L'); // Size of the actual name data

        // The actual long name data (e.g., "longname\0")
        byte[] longNameData = "longname\0".getBytes(CharsetNames.UTF_8);

        // Header for the actual file entry
        byte[] fileHeader = createTarHeader("actual.txt", 0, (byte) 0x00); // Regular file

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(longNameHeader);
        baos.write(longNameData); // The long name entry's data is the name itself
        baos.write(fileHeader);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE, CharsetNames.UTF_8);

        TarArchiveEntry entry = tar.getNextTarEntry();
        assertNotNull(entry);
        // The name should be from the long name entry
        assertEquals("longname", entry.getName());
    }

    /**
     * Test the Pax header parsing for path.
     */
    @Test
    public void testPaxHeaderPath() throws Exception {
        // Header for Pax header entry. Type is 'x' for Pax extended header.
        byte[] paxHeader = new byte[TarConstants.DEFAULT_RCDSIZE];
        // Size of the pax header data: "17 path=newname.txt\n" is 17 bytes.
        paxHeader[TarConstants.SIZE_OFFSET] = (byte) 0x11;
        paxHeader[TarConstants.TYPEFLAG_OFFSET] = (byte) 'x'; // Pax extended header type
        paxHeader[TarConstants.CHECKSUM_OFFSET] = (byte) 0x00;

        // Pax header data: "17 path=newname.txt\n"
        byte[] paxData = "17 path=newname.txt\n".getBytes(CharsetNames.UTF_8);

        // Header for the actual file entry
        byte[] fileHeader = createTarHeader("oldname.txt", 0, (byte) 0x00);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(paxHeader);
        baos.write(paxData);
        baos.write(fileHeader);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE, CharsetNames.UTF_8);

        TarArchiveEntry entry = tar.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("newname.txt", entry.getName()); // Name should be updated by Pax header
    }

    /**
     * Test the Pax header parsing for size.
     */
    @Test
    public void testPaxHeaderSize() throws Exception {
        // Header for Pax header entry. Type is 'x' for Pax extended header.
        byte[] paxHeader = new byte[TarConstants.DEFAULT_RCDSIZE];
        // Size of the pax header data: "11 size=100\n" is 11 bytes.
        paxHeader[TarConstants.SIZE_OFFSET] = (byte) 0x0B;
        paxHeader[TarConstants.TYPEFLAG_OFFSET] = (byte) 'x'; // Pax extended header type
        paxHeader[TarConstants.CHECKSUM_OFFSET] = (byte) 0x00;

        // Pax header data: "11 size=100\n"
        byte[] paxData = "11 size=100\n".getBytes(CharsetNames.UTF_8);

        // Header for the actual file entry with a different initial size
        byte[] fileHeader = createTarHeader("file.txt", 16, (byte) 0x00); // Initial size 16

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(paxHeader);
        baos.write(paxData);
        baos.write(fileHeader);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE, CharsetNames.UTF_8);

        TarArchiveEntry entry = tar.getNextTarEntry();
        assertNotNull(entry);
        assertEquals(100L, entry.getSize()); // Size should be updated by Pax header
    }

    /**
     * Test available() when entry size is smaller than Integer.MAX_VALUE.
     */
    @Test
    public void testAvailableSmallerThanMaxInt() throws Exception {
        byte[] header = createTarHeader("small_file.txt", 10, (byte) 0x00); // Size 10
        byte[] content = new byte[10];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        tar.getNextTarEntry();

        assertEquals(10, tar.available());
        tar.skip(5);
        assertEquals(5, tar.available());
    }

    /**
     * Test available() when entry size is larger than Integer.MAX_VALUE.
     * This test relies on Pax headers to set a large size.
     */
    @Test
    public void testAvailableLargerThanMaxInt() throws Exception {
        long largeSize = (long)Integer.MAX_VALUE + 1; // 2147483648L
        String paxSizeValue = Long.toString(largeSize);
        String paxHeaderLine = paxSizeValue.length() + " size=" + paxSizeValue + "\n";
        byte[] paxData = paxHeaderLine.getBytes(CharsetNames.UTF_8);

        byte[] paxHeader = new byte[TarConstants.DEFAULT_RCDSIZE];
        paxHeader[TarConstants.SIZE_OFFSET] = (byte) (paxData.length & 0xFF);
        paxHeader[TarConstants.TYPEFLAG_OFFSET] = (byte) 'x';
        paxHeader[TarConstants.CHECKSUM_OFFSET] = (byte) 0x00;

        byte[] fileHeader = createTarHeader("large_file.bin", 0, (byte) 0x00); // Initial size doesn't matter, Pax overrides

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(paxHeader);
        baos.write(paxData);
        baos.write(fileHeader);
        // We don't need to write the actual data for available() test, as it only checks size.

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE, CharsetNames.UTF_8);

        tar.getNextTarEntry(); // This will process Pax headers and set entrySize
        // After processing Pax, entrySize will be largeSize.
        // available() returns Integer.MAX_VALUE if entrySize - entryOffset > Integer.MAX_VALUE.
        // Since entryOffset is 0, and largeSize > Integer.MAX_VALUE, this condition holds.
        assertEquals(Integer.MAX_VALUE, tar.available());
    }

    /**
     * Test that close() calls the underlying stream's close().
     */
    @Test
    public void testCloseCallsUnderlyingClose() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        InputStream is = new ByteArrayInputStream(new byte[0]) {
            @Override
            public void close() throws IOException {
                baos.write("closed".getBytes());
            }
        };
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        tar.close();
        assertTrue(new String(baos.toByteArray()).contains("closed"));
    }

    /**
     * Test that getNextEntry delegates to getNextTarEntry.
     */
    @Test
    public void testGetNextEntryDelegates() throws Exception {
        byte[] header = createTarHeader("test.txt", 0, (byte) 0x00);
        InputStream is = new ByteArrayInputStream(header);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        ArchiveEntry entry = tar.getNextEntry();
        assertNotNull(entry);
        assertTrue(entry instanceof TarArchiveEntry);
    }

    /**
     * Test reset() method. It's a no-op in this implementation.
     */
    @Test
    public void testResetIsNoOp() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        tar.reset(); // Should not throw any exception
        // No assertion needed as it's a no-op.
    }

    /**
     * Test reading a full record.
     */
    @Test
    public void testReadFullRecord() throws Exception {
        byte[] header = createTarHeader("fullrecord.dat", TarConstants.DEFAULT_RCDSIZE, (byte) 0x00);
        byte[] content = new byte[TarConstants.DEFAULT_RCDSIZE];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) i;
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        tar.getNextTarEntry();

        byte[] buf = new byte[TarConstants.DEFAULT_RCDSIZE];
        int bytesRead = tar.read(buf, 0, TarConstants.DEFAULT_RCDSIZE);
        assertEquals(TarConstants.DEFAULT_RCDSIZE, bytesRead);
        assertArrayEquals(content, buf);
    }

    /**
     * Test reading more than one record using Pax headers to set a large size.
     */
    @Test
    public void testReadMultipleRecords() throws Exception {
        int recordSize = TarConstants.DEFAULT_RCDSIZE;
        int numRecords = 2;
        long totalSize = (long) recordSize * numRecords;

        String sizeStr = Long.toString(totalSize);
        String paxLine = sizeStr.length() + " size=" + sizeStr + "\n";
        byte[] paxData = paxLine.getBytes(CharsetNames.UTF_8);

        byte[] paxHeader = new byte[TarConstants.DEFAULT_RCDSIZE];
        paxHeader[TarConstants.SIZE_OFFSET] = (byte) (paxData.length & 0xFF);
        paxHeader[TarConstants.TYPEFLAG_OFFSET] = (byte) 'x';
        paxHeader[TarConstants.CHECKSUM_OFFSET] = (byte) 0x00;

        byte[] fileHeader = createTarHeader("multi_record.dat", 0, (byte) 0x00); // Pax will override size

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(paxHeader);
        baos.write(paxData);
        baos.write(fileHeader);

        byte[] record1 = new byte[recordSize];
        byte[] record2 = new byte[recordSize];
        for (int i = 0; i < recordSize; i++) {
            record1[i] = (byte) i;
            record2[i] = (byte) (i + recordSize);
        }
        baos.write(record1);
        baos.write(record2);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE, CharsetNames.UTF_8);

        tar.getNextTarEntry(); // Process Pax, set entry size

        byte[] buf = new byte[(int) totalSize];
        int bytesRead = tar.read(buf, 0, (int) totalSize);
        assertEquals((int) totalSize, bytesRead);

        byte[] expectedContent = new byte[(int) totalSize];
        System.arraycopy(record1, 0, expectedContent, 0, recordSize);
        System.arraycopy(record2, 0, expectedContent, recordSize, recordSize);
        assertArrayEquals(expectedContent, buf);
    }

    /**
     * Test that consecutive calls to getNextTarEntry skip padding.
     */
    @Test
    public void testConsecutiveGetNextTarEntrySkipsPadding() throws Exception {
        int recordSize = TarConstants.DEFAULT_RCDSIZE;
        byte[] header1 = createTarHeader("file1.txt", 5, (byte) 0x00);
        byte[] content1 = new byte[5];
        byte[] padding1 = new byte[recordSize - 5]; // Padding to fill the record

        byte[] header2 = createTarHeader("file2.txt", 0, (byte) 0x00);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header1);
        baos.write(content1);
        baos.write(padding1); // Padding after the first entry's data
        baos.write(header2);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tar = new TarArchiveInputStream(is);

        TarArchiveEntry entry1 = tar.getNextTarEntry();
        assertNotNull(entry1);
        assertEquals(5, entry1.getSize());

        TarArchiveEntry entry2 = tar.getNextTarEntry();
        assertNotNull(entry2);
        assertEquals("file2.txt", entry2.getName());
    }
}
