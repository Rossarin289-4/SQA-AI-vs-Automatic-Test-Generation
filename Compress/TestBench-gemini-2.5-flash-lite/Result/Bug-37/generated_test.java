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

    // Helper method to create a tar entry with data and padding

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


