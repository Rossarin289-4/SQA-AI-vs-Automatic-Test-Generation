package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;

public class ZipArchiveInputStreamTest {

    // Helper method to create a zip archive with a single entry
    private byte[] createZipArchive(final byte[] content, final String name, final int method) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(bos);
        zaos.setLevel(0); // Use STORED or DEFLATED with no compression
        zaos.putArchiveEntry(new ZipArchiveEntry(name));
        zaos.write(content);
        zaos.closeArchiveEntry();
        zaos.close();
        return bos.toByteArray();
    }

    private byte[] createZipArchiveWithDataDescriptor(final byte[] content, final String name) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(bos);
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        entry.setMethod(ZipEntry.STORED); // STORED entries can use data descriptors
        zaos.putArchiveEntry(entry);
        zaos.write(content);
        zaos.closeArchiveEntry(); // This will write the data descriptor
        zaos.close();
        return bos.toByteArray();
    }

    @Test
    public void testGetNextZipEntryReturnsNullWhenClosed() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.close();
        assertNull("getNextZipEntry should return null after close", zip.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryReturnsNullWhenHitCentralDirectory() throws IOException {
        // Creating a zip archive with one entry. getNextZipEntry() should return the entry,
        // and the subsequent call should return null as it hits the central directory.
        byte[] zipBytes = createZipArchive(new byte[10], "test.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.getNextZipEntry(); // Read the first entry
        // After reading the first entry, the next call should try to read the central directory
        // and return null because there are no more entries.
        assertNull("getNextZipEntry should return null when hit central directory", zip.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryReturnsNullWhenEmptyArchive() throws IOException {
        byte[] zipBytes = new byte[0];
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        assertNull("getNextZipEntry should return null for an empty archive", zip.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryWithBasicStoredEntry() throws IOException {
        byte[] content = "This is a test entry.".getBytes();
        byte[] zipBytes = createZipArchive(content, "basic.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        ZipArchiveEntry entry = zip.getNextZipEntry();
        assertNotNull("Should have a zip entry", entry);
        assertEquals("basic.txt", entry.getName());
        assertEquals(content.length, entry.getSize());
        assertEquals(ZipEntry.STORED, entry.getMethod());
        assertFalse("Entry should not have data descriptor", entry.getGeneralPurposeBit().usesDataDescriptor());
    }

    @Test
    public void testGetNextZipEntryWithBasicDeflatedEntry() throws IOException {
        byte[] content = "This is a test entry for deflation.".getBytes();
        byte[] zipBytes = createZipArchive(content, "deflated.txt", ZipEntry.DEFLATED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        ZipArchiveEntry entry = zip.getNextZipEntry();
        assertNotNull("Should have a zip entry", entry);
        assertEquals("deflated.txt", entry.getName());
        assertEquals(content.length, entry.getSize());
        assertEquals(ZipEntry.DEFLATED, entry.getMethod());
        assertFalse("Entry should not have data descriptor", entry.getGeneralPurposeBit().usesDataDescriptor());
    }

    @Test
    public void testGetNextZipEntryWithEmptyEntry() throws IOException {
        byte[] content = new byte[0];
        byte[] zipBytes = createZipArchive(content, "empty.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        ZipArchiveEntry entry = zip.getNextZipEntry();
        assertNotNull("Should have a zip entry", entry);
        assertEquals("empty.txt", entry.getName());
        assertEquals(0, entry.getSize());
        assertEquals(ZipEntry.STORED, entry.getMethod());
    }

    @Test
    public void testGetNextZipEntryWithEntryUsingDataDescriptor() throws IOException {
        byte[] content = "Content with data descriptor.".getBytes();
        byte[] zipBytes = createZipArchiveWithDataDescriptor(content, "data_descriptor.txt");
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        ZipArchiveEntry entry = zip.getNextZipEntry();
        assertNotNull("Should have a zip entry", entry);
        assertEquals("data_descriptor.txt", entry.getName());
        assertEquals(content.length, entry.getSize());
        assertEquals(ZipEntry.STORED, entry.getMethod());
        assertTrue("Entry should have data descriptor", entry.getGeneralPurposeBit().usesDataDescriptor());
    }

    // This test case is omitted as it requires external zip files or more complex setup
    // which is not directly supported by the provided API for creating such entries.
    // @Test
    // public void testGetNextZipEntryWithUnicodeExtraField() throws IOException { ... }

    @Test
    public void testReadReturnsMinusOneWhenEndOfEntry() throws IOException {
        byte[] content = "Short content.".getBytes();
        byte[] zipBytes = createZipArchive(content, "end_of_entry.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.getNextZipEntry();
        byte[] buffer = new byte[100];
        int bytesRead = 0;
        // Read all available bytes
        while ((bytesRead = zip.read(buffer, 0, buffer.length)) != -1) {
            // consume
        }
        // After reading all content, the next read should return -1
        assertEquals("Reading after end of entry should return -1", -1, zip.read(buffer, 0, buffer.length));
    }

    @Test
    public void testReadReturnsMinusOneWhenEndOfArchive() throws IOException {
        byte[] zipBytes = createZipArchive("abc".getBytes(), "file1.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.getNextZipEntry();
        // Read the entry completely
        byte[] buffer = new byte[10];
        while (zip.read(buffer, 0, buffer.length) != -1) {
            // consume
        }
        // Try to get the next entry. Since it's the end of the archive, it should be null.
        zip.getNextZipEntry();
        assertNull("Getting next entry after end of archive should return null", zip.getNextZipEntry());
    }

    @Test
    public void testReadStoredEntry() throws IOException {
        byte[] content = "Reading stored content.".getBytes();
        byte[] zipBytes = createZipArchive(content, "read_stored.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.getNextZipEntry();
        byte[] buffer = new byte[content.length];
        int bytesRead = IOUtils.readFully(zip, buffer);
        assertEquals("Should read all stored content", content.length, bytesRead);
        assertArrayEquals("Stored content mismatch", content, buffer);
    }

    @Test
    public void testReadDeflatedEntry() throws IOException {
        byte[] content = "Reading deflated content.".getBytes();
        byte[] zipBytes = createZipArchive(content, "read_deflated.txt", ZipEntry.DEFLATED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.getNextZipEntry();
        byte[] buffer = new byte[content.length];
        int bytesRead = IOUtils.readFully(zip, buffer);
        assertEquals("Should read all deflated content", content.length, bytesRead);
        assertArrayEquals("Deflated content mismatch", content, buffer);
    }

    @Test
    public void testReadStoredEntryWithDataDescriptor() throws IOException {
        byte[] content = "Content for stored entry with data descriptor.".getBytes();
        byte[] zipBytes = createZipArchiveWithDataDescriptor(content, "stored_dd.txt");
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.getNextZipEntry();
        byte[] buffer = new byte[content.length];
        int bytesRead = IOUtils.readFully(zip, buffer);
        assertEquals("Should read all stored content with data descriptor", content.length, bytesRead);
        assertArrayEquals("Stored content with data descriptor mismatch", content, buffer);
    }

    @Test
    public void testSkipOnStoredEntry() throws IOException {
        byte[] content = "Skipping stored content.".getBytes();
        byte[] zipBytes = createZipArchive(content, "skip_stored.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.getNextZipEntry();
        long skipped = zip.skip(content.length / 2);
        assertEquals("Should skip half of the stored content", content.length / 2, skipped);
        byte[] remaining = new byte[content.length - (int) skipped];
        int read = IOUtils.readFully(zip, remaining);
        assertEquals("Should read remaining part of stored content", content.length - (int) skipped, read);
        assertArrayEquals("Content after skip mismatch", java.util.Arrays.copyOfRange(content, (int) skipped, content.length), remaining);
    }

    @Test
    public void testSkipOnDeflatedEntry() throws IOException {
        byte[] content = "Skipping deflated content.".getBytes();
        byte[] zipBytes = createZipArchive(content, "skip_deflated.txt", ZipEntry.DEFLATED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.getNextZipEntry();
        long skipped = zip.skip(content.length / 2);
        assertEquals("Should skip half of the deflated content", content.length / 2, skipped);
        byte[] remaining = new byte[content.length - (int) skipped];
        int read = IOUtils.readFully(zip, remaining);
        assertEquals("Should read remaining part of deflated content", content.length - (int) skipped, read);
        assertArrayEquals("Content after skip mismatch", java.util.Arrays.copyOfRange(content, (int) skipped, content.length), remaining);
    }

    @Test
    public void testSkipBeyondEndOfEntry() throws IOException {
        byte[] content = "Skip beyond.".getBytes();
        byte[] zipBytes = createZipArchive(content, "skip_beyond.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.getNextZipEntry();
        long skipped = zip.skip(content.length + 10); // Skip more than available
        assertEquals("Should skip only available bytes", content.length, skipped); // Should skip only available bytes
        assertEquals("Next read after skipping beyond end should be -1", -1, zip.read()); // Next read should be EOF
    }

    @Test
    public void testCanReadEntryDataReturnsTrueForSupportedMethods() {
        ZipArchiveEntry stored = new ZipArchiveEntry("stored.txt");
        stored.setMethod(ZipEntry.STORED);
        ZipArchiveEntry deflated = new ZipArchiveEntry("deflated.txt");
        deflated.setMethod(ZipEntry.DEFLATED);
        ZipArchiveEntry bzip2 = new ZipArchiveEntry("bzip2.txt");
        bzip2.setMethod(ZipMethod.BZIP2.getCode());
        ZipArchiveEntry deflate64 = new ZipArchiveEntry("deflate64.txt");
        deflate64.setMethod(ZipMethod.ENHANCED_DEFLATED.getCode());

        // Use a dummy stream with allowStoredEntriesWithDataDescriptor = false (default)
        ZipArchiveInputStream zip = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        assertTrue("Should support STORED", zip.canReadEntryData(stored));
        assertTrue("Should support DEFLATED", zip.canReadEntryData(deflated));
        assertTrue("Should support BZIP2", zip.canReadEntryData(bzip2));
        assertTrue("Should support ENHANCED_DEFLATED", zip.canReadEntryData(deflate64));
    }

    @Test
    public void testCanReadEntryDataForUnsupportedMethod() {
        ZipArchiveEntry unsupported = new ZipArchiveEntry("unsupported.txt");
        unsupported.setMethod(ZipMethod.LZMA.getCode()); // LZMA is not supported by the reference implementation
        ZipArchiveInputStream zip = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse("Should not support LZMA", zip.canReadEntryData(unsupported));
    }

    @Test
    public void testMatchesReturnsTrueForValidZipSignature() {
        // LFH signature
        byte[] signature = { 0x50, 0x4b, 0x03, 0x04 }; // PK\003\004
        assertTrue("Should match LFH signature", ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesReturnsTrueForEmptyArchiveSignature() {
        // EOCD signature
        byte[] signature = { 0x50, 0x4b, 0x05, 0x06 }; // PK\005\006
        assertTrue("Should match EOCD signature", ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesReturnsTrueForSplitArchiveSignature() {
        // DD signature
        byte[] signature = { 0x50, 0x4b, 0x07, 0x08 }; // PK\007\008
        assertTrue("Should match DD signature", ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesReturnsFalseForInvalidSignature() {
        byte[] signature = { 0x01, 0x02, 0x03, 0x04 };
        assertFalse("Should not match invalid signature", ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesReturnsFalseWhenSignatureIsTooShort() {
        byte[] signature = { 0x50, 0x4b, 0x03 }; // Only 3 bytes
        assertFalse("Should not match signature shorter than LFH length", ZipArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testCloseDoesNotThrowExceptionWhenAlreadyClosed() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.close();
        try {
            zip.close(); // Call close again
            assertTrue("Closing an already closed stream should not throw an exception.", true);
        } catch (IOException e) {
            fail("Closing an already closed stream should not throw an exception.");
        }
    }

    @Test
    public void testReadWithEmptyBuffer() throws IOException {
        byte[] content = "Some data".getBytes();
        byte[] zipBytes = createZipArchive(content, "empty_buffer.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.getNextZipEntry();
        byte[] buffer = new byte[0];
        int bytesRead = zip.read(buffer, 0, 0);
        assertEquals("Reading with zero length should return 0", 0, bytesRead); // Reading with zero length should return 0
    }

    @Test
    public void testReadThrowsExceptionWhenStreamIsClosed() throws IOException {
        byte[] zipBytes = createZipArchive("data".getBytes(), "closed_stream.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        zip.close();
        byte[] buffer = new byte[10];
        try {
            zip.read(buffer, 0, buffer.length);
            fail("Reading from a closed stream should throw IOException.");
        } catch (IOException expected) {
            // Expected exception
        }
    }

    @Test
    public void testGetNextEntryIsAliasForGetNextZipEntry() throws IOException {
        byte[] content = "Alias test.".getBytes();
        byte[] zipBytes = createZipArchive(content, "alias.txt", ZipEntry.STORED);
        InputStream is = new ByteArrayInputStream(zipBytes);
        ZipArchiveInputStream zip = new ZipArchiveInputStream(is);
        ArchiveEntry archiveEntry = zip.getNextEntry();
        ZipArchiveEntry zipEntry = zip.getNextZipEntry();
        assertNotNull("ArchiveEntry should not be null", archiveEntry);
        assertNotNull("ZipArchiveEntry should not be null", zipEntry);
        assertEquals("Entry names should match", archiveEntry.getName(), zipEntry.getName());
        assertEquals("Entry sizes should match", archiveEntry.getSize(), zipEntry.getSize());
    }
}
