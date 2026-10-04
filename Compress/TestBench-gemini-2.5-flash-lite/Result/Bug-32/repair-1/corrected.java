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

public class TarArchiveInputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorDefault() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertNotNull(tais);
        // The getRecordSize() method returns the blockSize, not the recordSize.
        assertEquals(TarConstants.DEFAULT_BLKSIZE, tais.getRecordSize()); 
    }

    @Test
    public void testConstructorWithEncoding() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is, "UTF-8");
        assertNotNull(tais);
        assertEquals(TarConstants.DEFAULT_BLKSIZE, tais.getRecordSize());
        assertEquals("UTF-8", tais.encoding);
    }

    @Test
    public void testConstructorWithBlockSize() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        int blockSize = 1024;
        TarArchiveInputStream tais = new TarArchiveInputStream(is, blockSize);
        assertNotNull(tais);
        assertEquals(blockSize, tais.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSizeAndEncoding() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        int blockSize = 1024;
        TarArchiveInputStream tais = new TarArchiveInputStream(is, blockSize, "UTF-16");
        assertNotNull(tais);
        assertEquals(blockSize, tais.getRecordSize());
        assertEquals("UTF-16", tais.encoding);
    }

    @Test
    public void testConstructorWithBlockSizeAndRecordSize() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        int blockSize = 1024;
        int recordSize = 512;
        TarArchiveInputStream tais = new TarArchiveInputStream(is, blockSize, recordSize);
        assertNotNull(tais);
        assertEquals(recordSize, tais.getRecordSize());
    }

    @Test
    public void testConstructorWithBlockSizeRecordSizeAndEncoding() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        int blockSize = 1024;
        int recordSize = 512;
        TarArchiveInputStream tais = new TarArchiveInputStream(is, blockSize, recordSize, "UTF-16BE");
        assertNotNull(tais);
        assertEquals(recordSize, tais.getRecordSize());
        assertEquals("UTF-16BE", tais.encoding);
    }

    @Test
    public void testClose() throws Exception {
        InputStream is = new MockCloseableInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.close();
        assertTrue(((MockCloseableInputStream) is).isClosed());
    }

    @Test
    public void testAvailableWhenEntrySizeIsLargerThanIntegerMax() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE]; 
        long largeSize = (long) Integer.MAX_VALUE + 100;
        // TarConstants.LF_SIZE is not a constant, using the offset 100
        setTarHeaderField(header, 100, largeSize); 
        
        InputStream is = new ByteArrayInputStream(header);
        TarArchiveInputStream tais = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE);
        
        TarArchiveEntry entry = new TarArchiveEntry(header);
        entry.setSize(largeSize);
        tais.setCurrentEntry(entry); // Accessing protected method
        tais.entrySize = largeSize; // Accessing protected field
        tais.entryOffset = 0; // Accessing protected field

        assertEquals(Integer.MAX_VALUE, tais.available());
    }

    @Test
    public void testAvailableWhenEntrySizeIsSmallerThanIntegerMax() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        long smallSize = 1000;
        setTarHeaderField(header, 100, smallSize);

        InputStream is = new ByteArrayInputStream(header);
        TarArchiveInputStream tais = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE);

        TarArchiveEntry entry = new TarArchiveEntry(header);
        entry.setSize(smallSize);
        tais.setCurrentEntry(entry);
        tais.entrySize = smallSize;
        tais.entryOffset = 0;

        assertEquals(1000, tais.available());
    }

    @Test
    public void testSkipPositive() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        long entrySize = 5000;
        setTarHeaderField(header, 100, entrySize);
        byte[] content = new byte[(int)entrySize];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) (i % 256);
        }
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);
        InputStream is = new ByteArrayInputStream(baos.toByteArray());

        TarArchiveInputStream tais = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE);
        tais.getNextTarEntry(); 

        long skipAmount = 1000;
        long skipped = tais.skip(skipAmount);
        assertEquals(skipAmount, skipped);
        assertEquals(skipAmount, tais.entryOffset);

        byte[] buf = new byte[1];
        int bytesRead = tais.read(buf, 0, 1);
        assertEquals(1, bytesRead);
        assertEquals(content[1000], buf[0]);
    }

    @Test
    public void testSkipMoreThanAvailable() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        long entrySize = 500;
        setTarHeaderField(header, 100, entrySize);
        byte[] content = new byte[(int)entrySize];
        InputStream is = new ByteArrayInputStream(baosWithHeaderAndContent(header, content).toByteArray());

        TarArchiveInputStream tais = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE);
        tais.getNextTarEntry(); 

        long skipAmount = 1000; 
        long skipped = tais.skip(skipAmount);
        assertEquals(entrySize, skipped); 
        assertEquals(entrySize, tais.entryOffset);

        byte[] buf = new byte[1];
        int bytesRead = tais.read(buf, 0, 1);
        assertEquals(-1, bytesRead);
    }

    @Test
    public void testSkipZero() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        long entrySize = 500;
        setTarHeaderField(header, 100, entrySize);
        byte[] content = new byte[(int)entrySize];
        InputStream is = new ByteArrayInputStream(baosWithHeaderAndContent(header, content).toByteArray());

        TarArchiveInputStream tais = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE);
        tais.getNextTarEntry();

        long skipped = tais.skip(0);
        assertEquals(0, skipped);
        assertEquals(0, tais.entryOffset);
    }

    @Test
    public void testSkipNegative() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        long entrySize = 500;
        setTarHeaderField(header, 100, entrySize);
        byte[] content = new byte[(int)entrySize];
        InputStream is = new ByteArrayInputStream(baosWithHeaderAndContent(header, content).toByteArray());

        TarArchiveInputStream tais = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE);
        tais.getNextTarEntry();

        long skipped = tais.skip(-100);
        assertEquals(0, skipped);
        assertEquals(0, tais.entryOffset);
    }

    @Test
    public void testMarkSupported() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertFalse(tais.markSupported());
    }

    @Test
    public void testMarkDoesNothing() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.mark(100); 
    }

    @Test
    public void testResetDoesNothing() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.reset(); 
    }

    @Test
    public void testGetNextTarEntryReturnsNullAtEOF() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertNull(tais.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntryHandlesEmptyArchive() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertNull(tais.getNextTarEntry());
    }

    @Test
    public void testGetNextTarEntrySkipsCurrentEntryAndReadsNextHeader() throws Exception {
        byte[] header1 = new byte[TarConstants.DEFAULT_RCDSIZE];
        String name1 = "entry1";
        ArchiveUtils.matchAsciiBuffer(name1.getBytes(), header1, TarConstants.NAMEOFFSET, TarConstants.NAMELEN);
        setTarHeaderField(header1, 100, 100); 

        byte[] content1 = new byte[100];
        byte[] header2 = new byte[TarConstants.DEFAULT_RCDSIZE];
        String name2 = "entry2";
        ArchiveUtils.matchAsciiBuffer(name2.getBytes(), header2, TarConstants.NAMEOFFSET, TarConstants.NAMELEN);
        setTarHeaderField(header2, 100, 0); 

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header1);
        baos.write(content1);
        baos.write(header2);
        InputStream is = new ByteArrayInputStream(baos.toByteArray());

        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry1 = tais.getNextTarEntry();
        assertNotNull(entry1);
        assertEquals(name1, entry1.getName());
        assertEquals(100, entry1.getSize());

        byte[] buf = new byte[100];
        int read = tais.read(buf, 0, 100);
        assertEquals(100, read);

        TarArchiveEntry entry2 = tais.getNextTarEntry();
        assertNotNull(entry2);
        assertEquals(name2, entry2.getName());
        assertEquals(0, entry2.getSize());
    }

    @Test
    public void testGetNextTarEntryHandlesEOFRecord() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        String name = "entry1";
        ArchiveUtils.matchAsciiBuffer(name.getBytes(), header, TarConstants.NAMEOFFSET, TarConstants.NAMELEN);
        setTarHeaderField(header, 100, 100);

        byte[] content = new byte[100];
        byte[] eofRecord = new byte[TarConstants.DEFAULT_RCDSIZE];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);
        baos.write(eofRecord);
        InputStream is = new ByteArrayInputStream(baos.toByteArray());

        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        assertEquals(name, entry.getName());

        byte[] buf = new byte[100];
        int read = tais.read(buf, 0, 100);
        assertEquals(100, read);

        assertNull(tais.getNextTarEntry());
        assertTrue(tais.isAtEOF()); // Accessing protected method
    }

    @Test
    public void testGetNextTarEntryHandlesMalformedLongNameEntry() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        header[TarConstants.LF_GNUTYPE] = TarArchiveEntry.LF_GNULONGNAME;
        setTarHeaderField(header, 100, 0); 

        InputStream is = new ByteArrayInputStream(header);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertNull(tais.getNextTarEntry()); 
    }
    
    @Test
    public void testGetNextTarEntryWithPaxHeaders() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        String name = "original_name";
        ArchiveUtils.matchAsciiBuffer(name.getBytes(), header, TarConstants.NAMEOFFSET, TarConstants.NAMELEN);
        setTarHeaderField(header, 100, 0); 

        String paxPathKey = "path";
        String paxPathValue = "new_name";
        String paxHeaderLine = "26 " + paxPathKey + "=" + paxPathValue + "\n"; 
        byte[] paxHeaderBytes = paxHeaderLine.getBytes(CharsetNames.UTF_8);

        byte[] entryHeader = new byte[TarConstants.DEFAULT_RCDSIZE];
        String entryName = "actual_entry"; 
        ArchiveUtils.matchAsciiBuffer(entryName.getBytes(), entryHeader, TarConstants.NAMEOFFSET, TarConstants.NAMELEN);
        setTarHeaderField(entryHeader, 100, 50);
        byte[] entryContent = new byte[50];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header); 
        baos.write(paxHeaderBytes);
        baos.write(entryHeader);
        baos.write(entryContent);
        InputStream is = new ByteArrayInputStream(baos.toByteArray());

        TarArchiveInputStream tais = new TarArchiveInputStream(is, TarConstants.DEFAULT_BLKSIZE, TarConstants.DEFAULT_RCDSIZE, CharsetNames.UTF_8);
        
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        assertEquals(paxPathValue, entry.getName()); 
        assertEquals(50, entry.getSize()); 
    }

    @Test
    public void testReadWhenEntryIsFullyRead() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        setTarHeaderField(header, 100, 10);
        byte[] content = new byte[10];
        InputStream is = new ByteArrayInputStream(baosWithHeaderAndContent(header, content).toByteArray());

        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.getNextTarEntry();

        byte[] buf = new byte[10];
        int bytesRead = tais.read(buf, 0, 10);
        assertEquals(10, bytesRead);

        bytesRead = tais.read(buf, 0, 10);
        assertEquals(-1, bytesRead);
    }

    @Test
    public void testReadWhenNoEntryIsSet() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]); 
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        
        byte[] buf = new byte[10];
        try {
            tais.read(buf, 0, 10);
            fail("Should throw IllegalStateException when no entry is set");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testReadTruncatedArchive() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        setTarHeaderField(header, 100, 100); 
        InputStream is = new ByteArrayInputStream(header); 

        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.getNextTarEntry(); 

        byte[] buf = new byte[50];
        try {
            tais.read(buf, 0, 50); 
            fail("Should throw IOException for truncated archive");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Truncated TAR archive"));
        }
    }
    
    @Test
    public void testReadFillsBufferCorrectly() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        setTarHeaderField(header, 100, 100);
        byte[] content = new byte[100];
        for(int i = 0; i < content.length; i++) {
            content[i] = (byte) i;
        }
        InputStream is = new ByteArrayInputStream(baosWithHeaderAndContent(header, content).toByteArray());

        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.getNextTarEntry();

        byte[] buf = new byte[50];
        int bytesRead = tais.read(buf, 0, 50);
        assertEquals(50, bytesRead);
        for(int i = 0; i < 50; i++) {
            assertEquals(content[i], buf[i]);
        }
        
        bytesRead = tais.read(buf, 0, 50);
        assertEquals(50, bytesRead);
        for(int i = 0; i < 50; i++) {
            assertEquals(content[50+i], buf[i]);
        }
    }

    @Test
    public void testCanReadEntryDataReturnsTrueForNonSparse() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry nonSparseEntry = new TarArchiveEntry("test.txt");
        assertFalse(nonSparseEntry.isGNUSparse()); 
        assertTrue(tais.canReadEntryData(nonSparseEntry));
    }

    @Test
    public void testCanReadEntryDataReturnsFalseForSparse() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry sparseEntry = new TarArchiveEntry("sparse.txt");
        // The LF_GNUTYPE flag is not directly settable as a public API.
        // To simulate a sparse entry, we'll rely on the fact that isGNUSparse() might be true if some internal state is set,
        // or we can mock the TarArchiveEntry if needed. However, the contract of isGNUSparse() is key.
        // For now, we'll assume if it was constructed in a way that it's sparse, it would return true.
        // As a workaround, let's assume a specific constructor or method call would make it sparse.
        // Since we can't directly simulate it here without more info, we'll test the known behavior.
        // The method `readGNUSparse` suggests this is an internal handling.
        // The current `canReadEntryData` checks `te.isGNUSparse()`.
        // If we can't easily make a TarArchiveEntry sparse in this test setup, we might need to reconsider this test or accept its limitation.
        // For now, we assume if `isGNUSparse` were true, it would be false here.
        // Let's create a mock that reports sparse for this test.
        TarArchiveEntry mockSparseEntry = new TarArchiveEntry("sparse.txt") {
            @Override
            public boolean isGNUSparse() {
                return true;
            }
        };
        assertFalse(tais.canReadEntryData(mockSparseEntry));
    }
    
    @Test
    public void testCanReadEntryDataReturnsFalseForNonTarEntry() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        ArchiveEntry nonTarEntry = new ArchiveEntry() {
            @Override
            public String getName() { return "non_tar.txt"; }
            @Override
            public long getSize() { return 0; }
            @Override
            public Date getLastModifiedDate() { return null; }
            @Override
            public boolean isDirectory() { return false; }
        };
        assertFalse(tais.canReadEntryData(nonTarEntry));
    }

    @Test
    public void testGetCurrentEntryReturnsNullWhenNoEntryRead() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertNull(tais.getCurrentEntry());
    }

    @Test
    public void testGetCurrentEntryReturnsCurrentEntryAfterGetNextTarEntry() throws Exception {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        String name = "test_entry";
        ArchiveUtils.matchAsciiBuffer(name.getBytes(), header, TarConstants.NAMEOFFSET, TarConstants.NAMELEN);
        setTarHeaderField(header, 100, 0);
        InputStream is = new ByteArrayInputStream(header);

        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        assertEquals(name, entry.getName());
        
        TarArchiveEntry currentEntry = tais.getCurrentEntry();
        assertNotNull(currentEntry);
        assertEquals(entry, currentEntry); 
        assertEquals(name, currentEntry.getName());
    }
    
    @Test
    public void testMatchesWithValidPosixSignature() {
        byte[] signature = new byte[TarConstants.MAGIC_OFFSET + TarConstants.MAGICLEN + TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_POSIX), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_POSIX), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWithValidGnuSignatureSpace() {
        byte[] signature = new byte[TarConstants.MAGIC_OFFSET + TarConstants.MAGICLEN + TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_GNU), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_GNU_SPACE), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWithValidGnuSignatureZero() {
        byte[] signature = new byte[TarConstants.MAGIC_OFFSET + TarConstants.MAGICLEN + TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_GNU), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_GNU_ZERO), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWithValidAntSignature() {
        byte[] signature = new byte[TarConstants.MAGIC_OFFSET + TarConstants.MAGICLEN + TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.MAGIC_ANT), 0, signature, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(ArchiveUtils.toAsciiBytes(TarConstants.VERSION_ANT), 0, signature, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        assertTrue(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWithInvalidSignature() {
        byte[] signature = new byte[1024]; 
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }

    @Test
    public void testMatchesWithShortSignature() {
        byte[] signature = new byte[10]; 
        assertFalse(TarArchiveInputStream.matches(signature, signature.length));
    }
    
    @Test
    public void testReadRecordReturnsNullWhenInputIsTooShort() throws Exception {
        InputStream is = new ByteArrayInputStream(new byte[5]); // Shorter than recordSize
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        assertNull(tais.readRecord()); // Accessing protected method
    }

    @Test
    public void testIsEOFRecordWhenRecordIsNull() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertTrue(tais.isEOFRecord(null)); // Accessing protected method
    }

    @Test
    public void testIsEOFRecordWhenRecordIsAllZeros() throws Exception {
        byte[] zeroRecord = new byte[TarConstants.DEFAULT_RCDSIZE];
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertTrue(tais.isEOFRecord(zeroRecord)); // Accessing protected method
    }

    @Test
    public void testIsEOFRecordWhenRecordIsNotAllZeros() throws Exception {
        byte[] nonZeroRecord = new byte[TarConstants.DEFAULT_RCDSIZE];
        nonZeroRecord[0] = 1;
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(tais.isEOFRecord(nonZeroRecord)); // Accessing protected method
    }
    
    @Test
    public void testGetLongNameDataReadsCorrectly() throws Exception {
        String longName = "this_is_a_very_long_name_that_should_be_handled";
        byte[] longNameBytes = longName.getBytes(CharsetNames.US_ASCII);
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(longNameBytes);
        baos.write(0); // Null terminator

        // Simulate the scenario where getLongNameData is called after getNextTarEntry
        // For this test, we will directly call getLongNameData with a mock InputStream.
        // A more integrated test would involve getNextTarEntry and GNULongNameEntry.
        // Since getLongNameData is protected, we'll need a helper or a direct access.
        // For now, we'll simulate the stream content directly.

        // To test getLongNameData, we need to set up a stream that it can read from.
        // We also need to simulate a currEntry being set, and the isGNULongNameEntry() returning true.
        
        // This test setup needs to be more complex as getLongNameData depends on currEntry and the stream state.
        // Let's rethink this test to be more focused on what getLongNameData *does*.
        // It reads from `is` until EOF, appends to `longName`, and then calls `getNextEntry()`.
        // Then it trims null terminators.

        // Let's mock the stream and the surrounding calls to isolate getLongNameData.
        // However, since direct mocking of internal methods is not allowed per rules,
        // we'll simulate the scenario by creating an entry that *triggers* the call.

        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        // Set the GNU long name flag
        header[TarConstants.LF_GNUTYPE] = TarArchiveEntry.LF_GNULONGNAME;
        setTarHeaderField(header, 100, longNameBytes.length); // Size of the long name data
        
        ByteArrayOutputStream baosContent = new ByteArrayOutputStream();
        baosContent.write(longNameBytes);
        baosContent.write(0); // Null terminator

        // Add a dummy next entry header to satisfy the getNextEntry() call within getLongNameData
        byte[] nextEntryHeader = new byte[TarConstants.DEFAULT_RCDSIZE];
        setTarHeaderField(nextEntryHeader, TarConstants.NAMEOFFSET, 0); // Dummy name
        setTarHeaderField(nextEntryHeader, 100, 0); // Dummy size

        baosContent.write(nextEntryHeader); // Append the next entry header

        InputStream is = new ByteArrayInputStream(baosContent.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        
        // Manually set up the initial header to trigger the long name logic
        // This bypasses the normal getNextTarEntry() flow slightly for direct testing.
        // In a real scenario, getNextTarEntry() reads the header, and if it's a long name, calls getLongNameData.
        
        // To properly test getLongNameData, we need it to be called from getNextTarEntry.
        // Let's craft a scenario for getNextTarEntry that uses long name.
        byte[] longNameHeader = new byte[TarConstants.DEFAULT_RCDSIZE];
        longNameHeader[TarConstants.LF_GNUTYPE] = TarArchiveEntry.LF_GNULONGNAME;
        setTarHeaderField(longNameHeader, 100, longNameBytes.length); // Size of the long name data

        ByteArrayOutputStream streamWithLongName = new ByteArrayOutputStream();
        streamWithLongName.write(longNameHeader);
        streamWithLongName.write(longNameBytes);
        streamWithLongName.write(0); // Null terminator
        
        // Add a real entry after the long name data
        byte[] entryHeader = new byte[TarConstants.DEFAULT_RCDSIZE];
        ArchiveUtils.matchAsciiBuffer("real_entry".getBytes(), entryHeader, TarConstants.NAMEOFFSET, TarConstants.NAMELEN);
        setTarHeaderField(entryHeader, 100, 10);
        streamWithLongName.write(entryHeader);

        InputStream isForLongNameTest = new ByteArrayInputStream(streamWithLongName.toByteArray());
        tais = new TarArchiveInputStream(isForLongNameTest);

        TarArchiveEntry entry = tais.getNextTarEntry();
        assertNotNull(entry);
        // The name should be set from the long name data
        assertEquals(longName, entry.getName());
    }

    // Helper method to set a field in a Tar header byte array
    private void setTarHeaderField(byte[] header, int offset, long value) {
        String valueStr = Long.toString(value);
        byte[] valueBytes = valueStr.getBytes(CharsetNames.US_ASCII);
        
        int fieldSize = TarConstants.SYMTLENGTH; // Default size for fields like size, uid, etc.
        // Ensure we don't write past the header buffer
        int lengthToWrite = Math.min(valueBytes.length, fieldSize);
        
        // Tar headers are typically right-aligned and null-padded.
        // Fill the field from right to left.
        for (int i = 0; i < fieldSize; i++) {
            int headerIndex = offset + fieldSize - 1 - i;
            int valueIndex = valueBytes.length - 1 - i;

            if (valueIndex >= 0 && valueIndex < lengthToWrite) {
                header[headerIndex] = valueBytes[valueIndex];
            } else {
                header[headerIndex] = 0; // Null padding
            }
        }
    }

    // Helper method to create a ByteArrayOutputStream with header and content
    private ByteArrayOutputStream baosWithHeaderAndContent(byte[] header, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);
        return baos;
    }

    // Mock InputStream that implements Closeable and tracks close calls
    private static class MockCloseableInputStream extends InputStream implements java.io.Closeable {
        private final InputStream delegate;
        private boolean closed = false;

        public MockCloseableInputStream(InputStream delegate) {
            this.delegate = delegate;
        }

        public boolean isClosed() {
            return closed;
        }

        @Override
        public int read() throws IOException {
            ensureOpen();
            return delegate.read();
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            ensureOpen();
            return delegate.read(b, off, len);
        }

        @Override
        public void close() throws IOException {
            delegate.close();
            closed = true;
        }
        
        private void ensureOpen() throws IOException {
            if (closed) {
                throw new IOException("Stream closed");
            }
        }
    }

    // Mock InputStream that simulates a ByteArrayInputStream but allows setting data
    private static class ByteArrayInputStream extends java.io.ByteArrayInputStream {
        public ByteArrayInputStream(byte[] buf) {
            super(buf);
        }
    }
}
