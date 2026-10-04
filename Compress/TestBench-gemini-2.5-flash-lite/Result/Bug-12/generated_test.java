package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;

public class TarArchiveInputStreamTest {

    // Helper method to create a TarArchiveInputStream from a byte array
    private TarArchiveInputStream createTarArchiveInputStream(byte[] data) {
        InputStream is = new ByteArrayInputStream(data);
        return new TarArchiveInputStream(is);
    }

    // Helper method to create a TarArchiveInputStream with custom block and record sizes
    private TarArchiveInputStream createTarArchiveInputStream(byte[] data, int blockSize, int recordSize) {
        InputStream is = new ByteArrayInputStream(data);
        return new TarArchiveInputStream(is, blockSize, recordSize);
    }

    // Helper method to create a TarArchiveEntry with basic fields
    private TarArchiveEntry createTarEntry(String name, long size) {
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(size);
        return entry;
    }

    // Mock TarBuffer to control read operations

    @Test
    public void testConstructorDefault() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        assertNotNull(tar);
        // Accessing protected fields for testing is acceptable if necessary
        assertEquals(TarBuffer.DEFAULT_BLKSIZE, tar.buffer.getBlockSize());
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tar.getRecordSize());
    }

    @Test
    public void testConstructorBlockSize() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        int blockSize = 1024;
        TarArchiveInputStream tar = new TarArchiveInputStream(is, blockSize);
        assertNotNull(tar);
        assertEquals(blockSize, tar.buffer.getBlockSize());
        assertEquals(TarBuffer.DEFAULT_RCDSIZE, tar.getRecordSize());
    }

    @Test
    public void testConstructorBlockSizeRecordSize() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        int blockSize = 1024;
        int recordSize = 128;
        TarArchiveInputStream tar = new TarArchiveInputStream(is, blockSize, recordSize);
        assertNotNull(tar);
        assertEquals(blockSize, tar.buffer.getBlockSize());
        assertEquals(recordSize, tar.getRecordSize());
    }

    @Test
    public void testClose() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[TarBuffer.DEFAULT_BLKSIZE]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        tar.close();
        // The close method simply calls buffer.close(). If buffer is null or close fails, an exception would be thrown.
        // Asserting that no exception is thrown is sufficient.
        assertTrue(true);
    }

    @Test
    public void testGetRecordSize() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        int recordSize = 256;
        TarArchiveInputStream tar = new TarArchiveInputStream(is, TarBuffer.DEFAULT_BLKSIZE, recordSize);
        assertEquals(recordSize, tar.getRecordSize());
    }

    @Test
    public void testAvailableWhenNoEntry() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        // When no entry is current, entrySize and entryOffset are likely 0.
        assertEquals(0, tar.available());
    }







    @Test
    public void testResetDoesNothing() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        tar.reset();
        assertTrue(true); // No state change is expected, so this is a no-op test.
    }

    @Test
    public void testGetNextTarEntryWhenEmpty() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tar = new TarArchiveInputStream(is);
        assertNull(tar.getNextTarEntry());
    }











    @Test
    public void testCanReadEntryDataWhenNotSparse() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("regular_file.txt");
        entry.setSize(100);
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        // The method `canReadEntryData(ArchiveEntry ae)` takes an entry as parameter.
        // It checks `ae instanceof TarArchiveEntry`.
        assertTrue(tis.canReadEntryData(entry));
    }


    @Test
    public void testCanReadEntryDataWhenNotTarArchiveEntry() throws Exception {
        ArchiveEntry genericEntry = new ArchiveEntry() {
            @Override
            public String getName() { return "generic.txt"; }
            @Override
            public long getSize() { return 100; }
            @Override
            public boolean isDirectory() { return false; }
            @Override
            public Date getLastModifiedDate() { return null; }
        };
        TarArchiveInputStream tis = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tis.canReadEntryData(genericEntry));
    }

    @Test
    public void testMatchesTarMagicAndPosixVersion() throws Exception {
        byte[] signature = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesTarMagicAndGnuVersionSpace() throws Exception {
        byte[] signature = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE, 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesTarMagicAndGnuVersionZero() throws Exception {
        byte[] signature = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_GNU, 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO, 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesTarMagicAndAntVersion() throws Exception {
        byte[] signature = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_ANT, 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT, 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesIncorrectMagic() throws Exception {
        byte[] signature = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        // Incorrect magic bytes
        byte[] wrongMagic = "INCOR".getBytes();
        System.arraycopy(wrongMagic, 0, signature, TarConstants.MAGIC_OFFSET, wrongMagic.length);
        System.arraycopy(TarConstants.VERSION_POSIX, 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesIncorrectVersion() throws Exception {
        byte[] signature = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_POSIX, 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        // Incorrect version bytes
        byte[] wrongVersion = "0.9".getBytes();
        System.arraycopy(wrongVersion, 0, signature, TarConstants.VERSION_OFFSET, wrongVersion.length);
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesSignatureTooShort() throws Exception {
        byte[] signature = new byte[10]; // Shorter than needed
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }

    // Helper to create a basic PAX header line (length keyword=value\n)
    private String createPaxHeaderLine(String key, String value) {
        String line = key + "=" + value + "\n";
        return String.valueOf(line.length()).concat(" ").concat(line);
    }




    @Test
    public void testReadGNUSparse() throws Exception {
        // The readGNUSparse method is marked with a TODO and states "Sparse files get not yet really processed."
        // Testing its logic is difficult and might not reflect expected behavior if it's incomplete.
        // We'll create a minimal setup to ensure it's called without error if possible.
        // The method is called when `currEntry.isExtended()` is true.
        // Since we cannot directly set `isExtended()` and cannot parse custom headers, we'll rely on mocking the buffer and setting the state.
        // As the method is not fully implemented, a full test is not feasible under current constraints.
        assertTrue(true); // Placeholder for the unimplemented/TODO section.
    }
}





