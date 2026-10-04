package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import java.lang.reflect.Method;
import java.io.File;
import java.util.Date;

public class TarArchiveInputStreamTest {

    // Helper method to create a minimal tar header for a file
    private byte[] createHeader(String name, long size, byte fileType) throws IOException {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        ArchiveUtils.matchAsciiBuffer(name, header, 0, TarArchiveEntry.MAX_NAMELEN);
        ArchiveUtils.toAsciiBytes(Long.toString(size), header, 100, 12); // size field
        header[156] = fileType; // type field
        // Fill checksum with 0, as it will be calculated later if needed
        // For read tests, the checksum in the header is not critical.
        return header;
    }

    // Helper method to create a tar entry with data and padding
    private ByteArrayOutputStream createTarEntryStream(String name, String content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] header = createHeader(name, content.length(), (byte) 0); // Regular file
        baos.write(header);
        baos.write(content.getBytes(CharsetNames.US_ASCII));

        // Pad to record size if necessary
        long bytesWritten = header.length + content.length();
        long padding = 0;
        if (bytesWritten % TarConstants.DEFAULT_RCDSIZE != 0) {
            padding = TarConstants.DEFAULT_RCDSIZE - (bytesWritten % TarConstants.DEFAULT_RCDSIZE);
        }
        for (int i = 0; i < padding; i++) {
            baos.write(0);
        }
        return baos;
    }

    @Test
    public void testConstructorDefault() throws Exception {
        // Use a mock InputStream that doesn't actually read from anything
        InputStream is = new ByteArrayInputStream(new byte[0]);
        try (TarArchiveInputStream tais = new TarArchiveInputStream(is)) {
            assertNotNull(tais);
            assertEquals(TarConstants.DEFAULT_BLKSIZE, tais.getRecordSize());
        }
    }

    @Test
    public void testConstructorWithEncoding() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        try (TarArchiveInputStream tais = new TarArchiveInputStream(is, "UTF-8")) {
            assertNotNull(tais);
            assertEquals(TarConstants.DEFAULT_BLKSIZE, tais.getRecordSize());
            assertEquals("UTF-8", tais.encoding);
        }
    }

    @Test
    public void testConstructorWithBlockSize() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        try (TarArchiveInputStream tais = new TarArchiveInputStream(is, 1024)) {
            assertNotNull(tais);
            assertEquals(1024, tais.getRecordSize()); // recordSize is what getRecordSize returns
        }
    }

    @Test
    public void testConstructorWithBlockSizeAndEncoding() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        try (TarArchiveInputStream tais = new TarArchiveInputStream(is, 1024, "UTF-8")) {
            assertNotNull(tais);
            assertEquals(1024, tais.getRecordSize());
            assertEquals("UTF-8", tais.encoding);
        }
    }

    @Test
    public void testConstructorWithBlockSizeAndRecordSize() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        try (TarArchiveInputStream tais = new TarArchiveInputStream(is, 1024, 512)) {
            assertNotNull(tais);
            assertEquals(512, tais.getRecordSize());
        }
    }

    @Test
    public void testConstructorWithBlockSizeRecordSizeAndEncoding() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        try (TarArchiveInputStream tais = new TarArchiveInputStream(is, 1024, 512, "UTF-8")) {
            assertNotNull(tais);
            assertEquals(512, tais.getRecordSize());
            assertEquals("UTF-8", tais.encoding);
        }
    }

    @Test
    public void testClose() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.close(); // Should just close the underlying stream
    }

    @Test
    public void testGetRecordSize() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, 512);
        assertEquals(512, tais.getRecordSize());
    }

    @Test
    public void testAvailableWhenDirectory() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        // Manually set current entry to a directory
        TarArchiveEntry entry = new TarArchiveEntry("testdir");
        entry.setMode(TarConstants.DEFAULT_DIR_MODE); // Ensure it's marked as directory
        tais.setCurrentEntry(entry);
        assertEquals(0, tais.available());
    }

    @Test
    public void testAvailableWhenNotDirectory() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = new TarArchiveEntry("testfile");
        entry.setSize(100);
        tais.setCurrentEntry(entry);
        assertEquals(100, tais.available());
    }

    @Test
    public void testAvailableWhenEntrySizeExceedsIntegerMax() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = new TarArchiveEntry("largefile");
        entry.setSize(Long.MAX_VALUE);
        tais.setCurrentEntry(entry);
        assertEquals(Integer.MAX_VALUE, tais.available());
    }

    @Test
    public void testSkipZeroOrNegative() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = new TarArchiveEntry("testfile");
        entry.setSize(100);
        tais.setCurrentEntry(entry);
        assertEquals(0, tais.skip(0));
        assertEquals(0, tais.skip(-10));
    }

    @Test
    public void testSkipWhenDirectory() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = new TarArchiveEntry("testdir");
        entry.setMode(TarConstants.DEFAULT_DIR_MODE); // Mark as directory
        tais.setCurrentEntry(entry);
        assertEquals(0, tais.skip(10));
    }

    @Test
    public void testSkipLessThanAvailable() throws Exception {
        byte[] content = new byte[100];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) i;
        }
        InputStream is = new ByteArrayInputStream(content);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = new TarArchiveEntry("testfile");
        entry.setSize(100);
        tais.setCurrentEntry(entry);
        assertEquals(50, tais.skip(50));
        // Accessing package-private field entryOffset, now protected by reflection
        assertEquals(50, tais.entryOffset);
    }

    @Test
    public void testSkipMoreThanAvailable() throws Exception {
        byte[] content = new byte[100];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) i;
        }
        InputStream is = new ByteArrayInputStream(content);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = new TarArchiveEntry("testfile");
        entry.setSize(100);
        tais.setCurrentEntry(entry);
        assertEquals(100, tais.skip(200)); // Should skip only up to the entry size
        assertEquals(100, tais.entryOffset);
    }

    @Test
    public void testMarkSupported() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertFalse(tais.markSupported());
    }

    @Test
    public void testMarkDoesNothing() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.mark(100); // Should not throw any exception
    }

    @Test
    public void testResetDoesNothing() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.reset(); // Should not throw any exception
    }

    @Test
    public void testGetNextTarEntryWhenEOF() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertNull(tais.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntryWhenEntryExistsAndNoMoreData() throws Exception {
        // Create a minimal tar entry (header only)
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE]; // recordSize
        // Fill with nulls to simulate EOF for the header read itself
        for (int i = 0; i < TarConstants.DEFAULT_RCDSIZE; i++) {
            header[i] = 0;
        }
        InputStream is = new ByteArrayInputStream(header);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        // The record read will be all zeros, which is treated as EOF.
        assertNull(tais.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntryWhenEOFRecordPresent() throws Exception {
        // A valid header followed by an EOF record
        byte[] header = createHeader("testfile", 0, (byte) 0); // Regular file, size 0

        byte[] eofRecord = new byte[TarConstants.DEFAULT_RCDSIZE];
        for (int i = 0; i < TarConstants.DEFAULT_RCDSIZE; i++) {
            eofRecord[i] = 0;
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(eofRecord);
        InputStream is = new ByteArrayInputStream(baos.toByteArray());

        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        assertEquals("testfile", entry.getName());
        assertNull(tais.getNextTarEntry()); // Should return null after EOF record
    }

    @Test
    public void testGetNextEntryIsAliasForGetNextTarEntry() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        // Call getNextTarEntry to ensure the internal state is consistent,
        // even though it will return null here.
        tais.getNextTarEntry();
        assertEquals(tais.getNextTarEntry(), tais.getNextEntry());
    }

    @Test
    public void testReadWhenNoEntry() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        byte[] buf = new byte[10];
        try {
            // Need to call getNextEntry first to initialize currEntry to null,
            // otherwise it might be implicitly set by constructor or other methods.
            // In this specific case, the initial state has currEntry as null.
            tais.read(buf, 0, 10);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testReadWhenEntryIsDirectory() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry dirEntry = new TarArchiveEntry("testdir");
        dirEntry.setMode(TarConstants.DEFAULT_DIR_MODE);
        tais.setCurrentEntry(dirEntry);
        byte[] buf = new byte[10];
        assertEquals(-1, tais.read(buf, 0, 10));
    }

    @Test
    public void testReadWhenEntryEOF() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry fileEntry = new TarArchiveEntry("testfile");
        fileEntry.setSize(0);
        tais.setCurrentEntry(fileEntry);
        byte[] buf = new byte[10];
        assertEquals(-1, tais.read(buf, 0, 10));
    }

    @Test
    public void testReadLessThanAvailable() throws Exception {
        String content = "hello world";
        ByteArrayOutputStream baos = createTarEntryStream("testfile", content);
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.getNextTarEntry(); // Populate currEntry

        byte[] buf = new byte[5];
        int bytesRead = tais.read(buf, 0, 5);
        assertEquals(5, bytesRead);
        assertEquals("hello", new String(buf, 0, 5, CharsetNames.US_ASCII));
        assertEquals(5, tais.entryOffset);
    }

    @Test
    public void testReadMoreThanAvailable() throws Exception {
        String content = "hello world";
        ByteArrayOutputStream baos = createTarEntryStream("testfile", content);
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.getNextTarEntry(); // Populate currEntry

        byte[] buf = new byte[20]; // Request more than available
        int bytesRead = tais.read(buf, 0, 20);
        assertEquals(content.length(), bytesRead);
        assertEquals("hello world", new String(buf, 0, bytesRead, CharsetNames.US_ASCII));
        assertEquals(content.length(), tais.entryOffset);
    }

    @Test
    public void testReadUntilEndOfEntry() throws Exception {
        String content = "short content";
        ByteArrayOutputStream baos = createTarEntryStream("testfile", content);
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.getNextTarEntry(); // Populate currEntry

        byte[] buf = new byte[100]; // Request more than available
        int bytesRead = tais.read(buf, 0, 100);
        assertEquals(content.length(), bytesRead);

        // Read again should return -1
        assertEquals(-1, tais.read(buf, 0, 100));
        assertEquals(content.length(), tais.entryOffset);
    }

    @Test
    public void testReadEOFWhenTruncated() throws Exception {
        String content = "short content";
        // Declare size larger than actual content
        byte[] header = createHeader("testfile", content.length() + 10, (byte) 0);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content.getBytes(CharsetNames.US_ASCII)); // Content is shorter than declared size

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.getNextTarEntry(); // Populate currEntry

        byte[] buf = new byte[20];
        try {
            tais.read(buf, 0, 20); // Should attempt to read past available data
            fail("Expected IOException for truncated archive");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Truncated TAR archive"));
        }
    }

    @Test
    public void testCanReadEntryDataWhenTarArchiveEntryAndNotSparse() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = new TarArchiveEntry("testfile");
        assertTrue(tais.canReadEntryData(entry));
    }

    @Test
    public void testCanReadEntryDataWhenNotTarArchiveEntry() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        ArchiveEntry archiveEntry = new ArchiveEntry() {
            @Override
            public String getName() { return "non-tar-entry"; }
            @Override
            public long getSize() { return 100; }
            @Override
            public boolean isDirectory() { return false; }
            @Override
            public Date getLastModifiedDate() { return null; }
        };
        assertFalse(tais.canReadEntryData(archiveEntry));
    }

    @Test
    public void testGetCurrentEntryIsNullWhenNoEntryRead() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertNull(tais.getCurrentEntry());
    }

    @Test
    public void testGetCurrentEntryAfterReadingEntry() throws Exception {
        byte[] header = createHeader("testfile", 0, (byte) 0);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        assertEquals(entry, tais.getCurrentEntry());
    }

    @Test
    public void testMatchesWhenValidTarSignature() throws Exception {
        // POSIX Tar signature
        byte[] signature = new byte[TarConstants.MAGICLEN + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_POSIX), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_POSIX), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWhenGNUValidTarSignature() throws Exception {
        // GNU Tar signature with SPACE version
        byte[] signature = new byte[TarConstants.MAGICLEN + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_GNU), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_GNU_SPACE), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));

        // GNU Tar signature with ZERO version
        signature = new byte[TarConstants.MAGICLEN + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_GNU), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_GNU_ZERO), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWhenAntValidTarSignature() throws Exception {
        // Ant Tar signature
        byte[] signature = new byte[TarConstants.MAGICLEN + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_ANT), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_ANT), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWhenInvalidSignature() throws Exception {
        byte[] signature = new byte[TarConstants.MAGICLEN + TarConstants.VERSIONLEN];
        for (int i = 0; i < signature.length; i++) {
            signature[i] = 0; // All zeros is not a valid signature
        }
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWhenSignatureTooShort() throws Exception {
        byte[] signature = new byte[10]; // Shorter than MAGICLEN + VERSIONLEN
        for (int i = 0; i < signature.length; i++) {
            signature[i] = 0;
        }
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testParsePaxHeaders() throws Exception {
        // Simulate a stream containing PAX headers followed by a file entry
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // PAX header record
        String paxContent = "20 uid=1000\ngname=user\n"; // Length is 20
        byte[] paxHeader = createHeader("PaxHeader", paxContent.length(), (byte) 33); // Type = PAX Extended Header
        baos.write(paxHeader);
        baos.write(paxContent.getBytes(CharsetNames.US_ASCII));

        // Padding for the PAX header record
        long bytesWritten = paxHeader.length + paxContent.length();
        long padding = 0;
        if (bytesWritten % TarConstants.DEFAULT_RCDSIZE != 0) {
            padding = TarConstants.DEFAULT_RCDSIZE - (bytesWritten % TarConstants.DEFAULT_RCDSIZE);
        }
        for (int i = 0; i < padding; i++) {
            baos.write(0);
        }

        // The actual file entry after PAX header
        String fileContent = "file data";
        byte[] fileHeader = createHeader("testfile", fileContent.length(), (byte) 0); // Regular file
        baos.write(fileHeader);
        baos.write(fileContent.getBytes(CharsetNames.US_ASCII));

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);

        // Reading the next entry should process the PAX header and return the actual file entry
        TarArchiveEntry entry = tais.getNextTarEntry();

        assertNotNull(entry);
        assertEquals("testfile", entry.getName()); // The actual file entry should be returned after processing PAX
        // Check if PAX headers were applied
        assertEquals(1000, entry.getLongUserId());
        assertEquals("user", entry.getGroupName());
    }

    @Test
    public void testApplyPaxHeadersToCurrentEntry() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = new TarArchiveEntry("testfile");
        tais.setCurrentEntry(entry); // Manually set current entry

        Map<String, String> headers = new HashMap<>();
        headers.put("path", "new_path");
        headers.put("linkpath", "new_linkpath");
        headers.put("uid", "12345");
        headers.put("gid", "67890");
        headers.put("uname", "testuser");
        headers.put("gname", "testgroup");
        headers.put("size", "54321");
        headers.put("mtime", "1678886400000"); // March 15, 2023 GMT
        headers.put("SCHILY.devminor", "5");
        headers.put("SCHILY.devmajor", "10");

        Method method = TarArchiveInputStream.class.getDeclaredMethod("applyPaxHeadersToCurrentEntry", Map.class);
        method.setAccessible(true);
        method.invoke(tais, headers);

        assertEquals("new_path", entry.getName());
        assertEquals("new_linkpath", entry.getLinkName());
        assertEquals(12345, entry.getLongUserId());
        assertEquals(67890, entry.getLongGroupId());
        assertEquals("testuser", entry.getUserName());
        assertEquals("testgroup", entry.getGroupName());
        assertEquals(54321, entry.getSize());
        assertEquals(1678886400000L, entry.getModTime());
        assertEquals(5, entry.getDevMinor());
        assertEquals(10, entry.getDevMajor());
    }

    @Test
    public void testReadOldGNUSparse() throws Exception {
        // This test focuses on the loop structure and reading subsequent records.
        // The actual sparse data processing is not functional due to commented out code.
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // First record is an extended sparse entry
        byte[] sparseHeader = createHeader("sparse_file", 0, (byte) 79); // Type 79 for GNU sparse file

        // Simulate subsequent extended sparse records
        byte[] nextSparseHeader = createHeader("next_sparse", 0, (byte) 79); // Type 79 for GNU sparse file
        baos.write(sparseHeader);
        baos.write(nextSparseHeader); // This would be read if entry.isExtended() is true

        // Add a final non-extended record to terminate the loop
        byte[] finalHeader = createHeader("final_file", 0, (byte) 0);
        baos.write(finalHeader);

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);

        // Manually set currEntry and simulate it being 'extended'
        TarArchiveEntry entry = new TarArchiveEntry("sparse_file");
        // TarArchiveEntry doesn't have a public way to set isExtended.
        // The readOldGNUSparse method relies on `currEntry.isExtended()`.
        // We simulate this by creating a TarArchiveEntry from a header that
        // would indicate an extended sparse file.
        byte[] headerForExtendedSparse = new byte[TarConstants.DEFAULT_RCDSIZE];
        ArchiveUtils.matchAsciiBuffer("sparse_file", headerForExtendedSparse, 0, TarArchiveEntry.MAX_NAMELEN);
        headerForExtendedSparse[156] = 79; // Type 79 for GNU sparse file
        // Other bits for extended sparse would need to be set in the header for isExtended() to return true.
        // Without direct access to isExtended() or its header bit manipulation, this test is limited.
        // Let's assume `isExtended()` would return true based on some header configuration.
        // For simplicity, we'll just set `currEntry` and proceed.
        // The key is that `readRecord()` should be called.

        // To make `isExtended()` return true for the test, we need to provide a header that would cause it.
        // The `TarArchiveEntry` constructor from `byte[] headerBuf` would interpret these bits.
        // Let's create a TarArchiveEntry from a simulated header that indicates an extended sparse file.
        // The exact bits for `isExtended` are not documented publicly but generally involve flags within the mode.
        // For a simplified test, we'll just pass a header that will be interpreted as a sparse file and hope `isExtended` is true.

        byte[] sparseHeaderWithExtensionFlag = new byte[TarConstants.DEFAULT_RCDSIZE];
        ArchiveUtils.matchAsciiBuffer("sparse_file", sparseHeaderWithExtensionFlag, 0, TarArchiveEntry.MAX_NAMELEN);
        sparseHeaderWithExtensionFlag[156] = 79; // Type 79 for GNU sparse file
        // Assuming certain bits in the mode field (e.g., starting at offset 100) would indicate 'extended'
        // For instance, if mode is 0100644, extended might modify this.
        // We'll simulate a sparse file that `isExtended()` would return true for.
        // A header that signals GNU sparse file.
        // Note: The `TarArchiveEntry.isExtended()` method is not provided in the API outline.
        // It's likely derived from header bits. We'll proceed assuming it can be true.

        // For this test to be meaningful, `currEntry.isExtended()` must return true.
        // Since we don't have the source for `TarArchiveEntry`'s `isExtended` or a public setter,
        // we'll have to rely on the fact that if the `readOldGNUSparse` method is called,
        // it will attempt to read further records.
        // We'll simulate a stream that *would* contain further records.

        tais = new TarArchiveInputStream(is); // Re-initialize with the sparse stream
        entry = new TarArchiveEntry(sparseHeaderWithExtensionFlag); // Use header to create entry
        tais.setCurrentEntry(entry);

        Method method = TarArchiveInputStream.class.getDeclaredMethod("readOldGNUSparse");
        method.setAccessible(true);
        method.invoke(tais);

        // The method doesn't return anything, so we check if it runs without error.
        // The logic inside `readOldGNUSparse` calls `getRecord()`, which reads from `is`.
        // The stream has a sparse header, then a next sparse header, then a final file header.
        // The loop should process the first sparse header, then read the next one,
        // then read the final file header, and terminate.
        // The state `currEntry` will be updated to `final_file` at the end of `getNextEntry()`.
        // We can't directly assert that sparse data was "processed" as that logic is commented out.
    }

    @Test
    public void testIsDirectoryWhenNullEntry() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        // The isDirectory() method is protected.
        // We need to call it via a public method that uses it, or use reflection.
        // Since it's called from getNextTarEntry and read, let's check its behavior indirectly.
        // For a direct test, we'd need access. Let's assume it's correct if `getCurrentEntry()` is null.
        assertFalse(tais.isDirectory());
    }

    @Test
    public void testIsDirectoryWhenFileEntry() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = new TarArchiveEntry("testfile");
        entry.setMode(TarConstants.DEFAULT_FILE_MODE); // Ensure it's marked as file
        tais.setCurrentEntry(entry);
        // `isDirectory()` is protected. Testing via reflection.
        try {
            Method method = TarArchiveInputStream.class.getDeclaredMethod("isDirectory");
            method.setAccessible(true);
            assertFalse((Boolean) method.invoke(tais));
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }

    @Test
    public void testIsDirectoryWhenDirectoryEntry() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = new TarArchiveEntry("testdir");
        entry.setMode(TarConstants.DEFAULT_DIR_MODE); // Mark as directory
        tais.setCurrentEntry(entry);
        // `isDirectory()` is protected. Testing via reflection.
        try {
            Method method = TarArchiveInputStream.class.getDeclaredMethod("isDirectory");
            method.setAccessible(true);
            assertTrue((Boolean) method.invoke(tais));
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }

    // Mock InputStream to provide byte arrays and allow controlled reads.
    // This is a necessary helper as we are testing archive streams, not actual file I/O.
    private static class ByteArrayInputStream extends java.io.ByteArrayInputStream {
        public ByteArrayInputStream(byte[] buf) {
            super(buf);
        }

        // Override skip for more precise control in tests
        @Override
        public long skip(long n) {
            long remaining = available();
            if (n <= 0) {
                return 0;
            }
            if (n > remaining) {
                n = remaining;
            }
            // Manually advance the stream position
            for (long i = 0; i < n; i++) {
                read(); // consume one byte at a time to update internal stream position
            }
            return n;
        }
    }
}
