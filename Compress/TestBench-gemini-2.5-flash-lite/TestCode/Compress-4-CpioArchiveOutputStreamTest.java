package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.changes.ChangeSetPerformer;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.archivers.zip.ZipLong;
// import org.apache.commons.compress.changes.Change; // Change is package-private, cannot be imported
import org.apache.commons.compress.archivers.zip.ZipShort;

public class CpioArchiveOutputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    private static final short[] FORMATS = {
        CpioConstants.FORMAT_NEW,
        CpioConstants.FORMAT_NEW_CRC,
        CpioConstants.FORMAT_OLD_ASCII,
        CpioConstants.FORMAT_OLD_BINARY
    };

    private OutputStream createOut() {
        return new ByteArrayOutputStream();
    }

    @Test
    public void testCpioArchiveOutputStreamConstructorDefaultFormat() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out);
        assertNotNull(cpio);
    }

    @Test
    public void testCpioArchiveOutputStreamConstructorValidFormat() throws Exception {
        for (short format : FORMATS) {
            OutputStream out = createOut();
            CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, format);
            assertNotNull(cpio);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCpioArchiveOutputStreamConstructorInvalidFormat() throws Exception {
        OutputStream out = createOut();
        new CpioArchiveOutputStream(out, (short) 99); // Invalid format
    }

    // ensureOpen() is private, so we cannot test it directly.
    // Its effect is tested by attempting operations after close().
    
    @Test
    public void testPutArchiveEntryValid() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0); 
    }
    
    @Test
    public void testPutArchiveEntryWithTime() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setTime(123456789);
        entry.setSize(5);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testPutArchiveEntryWithDefaultTime() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setTime(-1); // Indicate default time should be used
        entry.setSize(5);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryMismatchedFormat() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entryWithDifferentFormat = new CpioArchiveEntry(CpioConstants.FORMAT_OLD_ASCII);
        entryWithDifferentFormat.setName("test.txt");
        entryWithDifferentFormat.setSize(5);
        entryWithDifferentFormat.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entryWithDifferentFormat);
    }

    @Test(expected = IOException.class)
    public void testPutArchiveEntryDuplicateName() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry("test.txt");
        entry1.setSize(5);
        entry1.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry1);

        CpioArchiveEntry entry2 = new CpioArchiveEntry("test.txt"); // Duplicate name
        entry2.setSize(10);
        entry2.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry2);
    }

    @Test
    public void testCloseArchiveEntryValid() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        cpio.write("hello".getBytes(), 0, 5);
        cpio.closeArchiveEntry();
        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0); // Header + data should be written
    }

    @Test(expected = IOException.class)
    public void testCloseArchiveEntryInvalidSize() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(10); // Expected size is 10
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        cpio.write("hello".getBytes(), 0, 5); // Written only 5 bytes
        cpio.closeArchiveEntry();
    }

    @Test
    public void testWriteValid() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        cpio.write("hello".getBytes(), 0, 5);
        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0); // Header + data written
    }

    @Test
    public void testWriteWithMultipleCalls() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(10);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        cpio.write("hello".getBytes(), 0, 5);
        cpio.write("world".getBytes(), 0, 5);
        cpio.closeArchiveEntry();
        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testWritePastEndOfEntry() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        cpio.write("hello world".getBytes(), 0, 11); // More than entry size
    }

    @Test(expected = IOException.class)
    public void testWriteBeforeEntry() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        cpio.write("hello".getBytes(), 0, 5); // No entry started
    }

    @Test
    public void testFinishValid() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        cpio.finish(); // Should write trailer
        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0);
    }

    @Test(expected = IOException.class)
    public void testFinishWithUnclosedEntry() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        cpio.finish(); // Should throw exception
    }

    @Test
    public void testClose() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        cpio.close();
        // Cannot check `closed` directly. Operation after close will throw.
        try {
            cpio.putArchiveEntry(new CpioArchiveEntry("test.txt"));
            fail("Expected IOException after close");
        } catch (IOException e) {
            assertEquals("Stream closed", e.getMessage());
        }
    }

    @Test
    public void testCloseIdempotent() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        cpio.close();
        cpio.close(); // Should not throw exception
        // Check again to ensure stream is closed
        try {
            cpio.putArchiveEntry(new CpioArchiveEntry("test.txt"));
            fail("Expected IOException after close");
        } catch (IOException e) {
            assertEquals("Stream closed", e.getMessage());
        }
    }
    
    @Test
    public void testCreateArchiveEntry() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        File file = new File("dummy.txt");
        // For CpioArchiveEntry(File, String), it requires a file that exists to get metadata.
        // Since we cannot create a real file in this environment, we use a dummy name.
        // The actual values set by `createArchiveEntry` should be tested.
        // The current implementation in `CpioArchiveEntry` constructor does not populate all fields based on File.
        // It's a basic constructor call.
        CpioArchiveEntry entry = (CpioArchiveEntry) cpio.createArchiveEntry(file, "dummy.txt");
        assertNotNull(entry);
        assertEquals("dummy.txt", entry.getName());
        assertEquals(CpioConstants.C_ISREG, entry.getMode()); // Default mode if file is not accessible
        assertEquals(0, entry.getSize()); // Default size if file is not accessible
    }

    // --- Helper methods for writing headers and padding ---

    @Test
    public void testPad() throws Exception {
        // Test header padding for NEW and NEW_CRC formats
        for (short format : new short[]{CpioConstants.FORMAT_NEW, CpioConstants.FORMAT_NEW_CRC}) {
            OutputStream out = createOut();
            CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, format);
            // Use a name that will result in padding
            CpioArchiveEntry entry = new CpioArchiveEntry("short_name"); 
            entry.setMode(CpioConstants.C_ISREG);
            entry.setSize(0);
            
            cpio.putArchiveEntry(entry); 
            
            byte[] result = ((ByteArrayOutputStream) out).toByteArray();
            // For FORMAT_NEW/FORMAT_NEW_CRC, the header consists of:
            // 11 fields * 8 bytes = 88 bytes
            // Name length + 1 (null terminator) = 10 + 1 = 11 bytes
            // Padding to align to 2 bytes (headerPadCount)
            // `entry.getName().length() + 1` is 11.
            // `getHeaderPadCount()` for "short_name" (length 10) in NEW/NEW_CRC format:
            // Name length (11) is not a multiple of 4. 11 % 4 = 3. Need 4-3 = 1 byte padding for name.
            // Header size = 88 (fields) + 11 (name+null) + 1 (padding) = 100 bytes.
            // The `getHeaderPadCount()` method calculates the padding to align to 2 bytes boundary.
            // For new format, the header must be a multiple of 2 bytes.
            // Name length is 11. Header size = 88 + 11 = 99. Padding to make it even = 1.
            // So total header size should be 100.
            // Let's check if the output size is indeed >= 100 bytes.
            assertTrue(result.length >= 100); 
            cpio.closeArchiveEntry();
        }
    }
    
    @Test
    public void testPadZero() throws Exception {
        // Test header padding with zero count (effectively no padding if name is short)
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entryZeroPad = new CpioArchiveEntry("name"); // Short name, length 4
        entryZeroPad.setMode(CpioConstants.C_ISREG);
        entryZeroPad.setSize(0);
        cpio.putArchiveEntry(entryZeroPad);
        byte[] resultZeroPad = ((ByteArrayOutputStream) out).toByteArray();
        // Header size for "name" (length 4): 88 fields + 4 (name) + 1 (null) = 93 bytes.
        // HeaderPadCount for NEW format, length 4+1=5: 5 % 4 = 1. Padding = 4-1=3 bytes for name.
        // Total header size = 88 + 5 + 3 = 96 bytes.
        assertTrue(resultZeroPad.length >= 96);
        
        // Test data padding with zero count
        out = createOut(); // Reset
        cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("data");
        entry.setSize(5);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        cpio.write("hello".getBytes(), 0, 5);
        cpio.closeArchiveEntry(); // This will call pad if getDataPadCount() > 0
        byte[] resultDataPadZero = ((ByteArrayOutputStream) out).toByteArray();
        // The data size is 5, which is not a multiple of 2 for NEW format.
        // `getDataPadCount()` for size 5: 5 % 2 = 1. Padding = 2-1=1.
        // So, 5 bytes data + 1 padding byte = 6 bytes written for data.
        assertTrue(resultDataPadZero.length >= 6); 
    }

    // writeBinaryLong and writeAsciiLong are private. They must be called via public methods.
    // We test them indirectly by testing methods that use them, like writeHeader.

    @Test
    public void testWriteCString() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        String str = "hello";
        CpioArchiveEntry entry = new CpioArchiveEntry("hello"); // Name is "hello"
        entry.setSize(0);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        
        byte[] result = ((ByteArrayOutputStream) out).toByteArray();
        // The C string "hello" followed by a null byte will be part of the header.
        // The name field in NEW format header is `entry.getName().length() + 1` bytes.
        // For "hello", this is 5 + 1 = 6 bytes.
        // We check that the output contains "hello\0" in the name field.
        // The header starts with MAGIC_NEW (6 bytes).
        // Then 11 fields of 8 bytes each = 88 bytes.
        // Then name length field (8 bytes).
        // Then checksum field (8 bytes).
        // The name follows.
        // The name should be "hello" followed by a null byte.
        // We can find "hello\0" in the output byte array after the initial header fields.
        int headerSize = 6 + 11 * 8 + 8 + 8; // MAGIC_NEW + fields + name_len + chksum
        boolean found = false;
        for(int i = headerSize; i < result.length - str.length() -1; i++) {
            boolean match = true;
            for(int j = 0; j < str.length(); j++) {
                if (result[i+j] != str.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match && result[i + str.length()] == '\0') {
                found = true;
                break;
            }
        }
        assertTrue("Could not find \"hello\\0\" in the header output", found);
        cpio.closeArchiveEntry();
    }

    // --- CRC calculation for FORMAT_NEW_CRC ---
    @Test
    public void testCrcCalculation() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);

        byte[] data = "hello".getBytes();
        cpio.write(data, 0, data.length);
        
        // The CRC value is calculated internally and checked during closeArchiveEntry.
        // We verify that no exception is thrown by closeArchiveEntry if the CRC matches the header.
        // We don't have direct access to the internal `crc` field or the header's checksum.
        // However, we can test that `closeArchiveEntry` does not throw a "CRC Error" if the data matches.
        // The value written to the header for checksum in NEW_CRC is `entry.getChksum()`.
        // If this value is 0 (default), it should match the calculated CRC of the data written.
        // Let's set the expected chksum to match the data.
        long expectedCrc = 0;
        for(byte b : data) {
            expectedCrc += b & 0xFF;
        }
        entry.setChksum(expectedCrc);
        
        cpio.closeArchiveEntry(); // Should not throw CRC Error
        assertTrue(true); // If no exception, test passes.
    }
    
    @Test
    public void testCrcCalculationWithMultipleWrites() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(10);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);

        byte[] data1 = "hello".getBytes();
        cpio.write(data1, 0, data1.length); // CRC should accumulate

        byte[] data2 = "world".getBytes();
        cpio.write(data2, 0, data2.length); // CRC should accumulate further

        long expectedCrc = 0;
        for(byte b : data1) expectedCrc += b & 0xFF;
        for(byte b : data2) expectedCrc += b & 0xFF;
        entry.setChksum(expectedCrc);

        cpio.closeArchiveEntry(); // Should not throw CRC Error
        assertTrue(true);
    }

    @Test
    public void testCrcErrorOnClose() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        entry.setSize(5);
        entry.setMode(CpioConstants.C_ISREG);
        // Set an incorrect checksum in the entry before writing header
        entry.setChksum(12345); 
        cpio.putArchiveEntry(entry);

        byte[] data = "hello".getBytes(); // Actual data for CRC calculation
        cpio.write(data, 0, data.length); // Calculated CRC will be 532 for "hello"

        try {
            cpio.closeArchiveEntry(); // This should throw "CRC Error"
            fail("Expected IOException for CRC mismatch");
        } catch (IOException e) {
            assertEquals("CRC Error", e.getMessage());
        }
    }

    // --- Test edge cases for numeric fields ---
    
    // These tests are hard to write directly for private methods.
    // We'll test indirectly by setting specific CpioArchiveEntry fields and
    // verifying header writing.

    @Test
    public void testNewFormatEntryWriting() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("file.txt");
        entry.setInode(123);
        entry.setMode(CpioConstants.C_ISREG | 0x644); // Regular file, rw-r--r--
        entry.setUID(1001);
        entry.setGID(1002);
        entry.setNumberOfLinks(1);
        entry.setTime(1678886400); // A specific timestamp
        entry.setSize(10);
        entry.setDeviceMaj(3);
        entry.setDeviceMin(4);
        entry.setRemoteDeviceMaj(0);
        entry.setRemoteDeviceMin(0);
        entry.setChksum(0); // Chksum is not used in FORMAT_NEW for header

        cpio.putArchiveEntry(entry);
        cpio.write("0123456789".getBytes(), 0, 10);
        cpio.closeArchiveEntry();
        cpio.finish();

        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0); // Ensure something was written
    }

    @Test
    public void testNewCrcFormatEntryWriting() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry("file.txt");
        entry.setInode(123);
        entry.setMode(CpioConstants.C_ISREG | 0x644);
        entry.setUID(1001);
        entry.setGID(1002);
        entry.setNumberOfLinks(1);
        entry.setTime(1678886400);
        entry.setSize(10);
        entry.setDeviceMaj(3);
        entry.setDeviceMin(4);
        entry.setRemoteDeviceMaj(0);
        entry.setRemoteDeviceMin(0);
        
        cpio.putArchiveEntry(entry);
        byte[] content = "0123456789".getBytes();
        cpio.write(content, 0, content.length);
        
        long expectedCrc = 0;
        for(byte b : content) {
            expectedCrc += b & 0xFF;
        }
        entry.setChksum(expectedCrc); 

        cpio.closeArchiveEntry(); // This will check the CRC
        cpio.finish();

        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testOldAsciiFormatEntryWriting() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry = new CpioArchiveEntry("file.txt");
        entry.setDevice(5); // Old ASCII uses 6 digits for device
        entry.setInode(6);
        entry.setMode(CpioConstants.C_ISREG | 0x644);
        entry.setUID(1001);
        entry.setGID(1002);
        entry.setNumberOfLinks(1);
        entry.setRemoteDevice(7);
        entry.setTime(1678886400);
        entry.setSize(10);
        
        cpio.putArchiveEntry(entry);
        cpio.write("0123456789".getBytes(), 0, 10);
        cpio.closeArchiveEntry();
        cpio.finish();
        
        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0);
    }

    @Test
    public void testOldBinaryFormatEntryWriting() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = new CpioArchiveEntry("file.txt");
        entry.setDevice(5); // 2 bytes
        entry.setInode(6); // 2 bytes
        entry.setMode(CpioConstants.C_ISREG | 0x644); // 2 bytes
        entry.setUID(1001); // 2 bytes
        entry.setGID(1002); // 2 bytes
        entry.setNumberOfLinks(1); // 2 bytes
        entry.setRemoteDevice(7); // 2 bytes
        entry.setTime(1678886400); // 4 bytes
        entry.setSize(10); // 4 bytes
        
        cpio.putArchiveEntry(entry);
        cpio.write("0123456789".getBytes(), 0, 10);
        cpio.closeArchiveEntry();
        cpio.finish();
        
        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0);
    }
    
    // Test with a very long file name that might require padding
    @Test
    public void testLongFileNamePadding() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        // Create a name that is longer than the typical fixed fields, to ensure padding logic is hit.
        String longName = "this_is_a_very_long_file_name_that_should_cause_padding.txt"; 
        CpioArchiveEntry entry = new CpioArchiveEntry(longName);
        entry.setSize(5); // The data size
        entry.setMode(CpioConstants.C_ISREG);

        cpio.putArchiveEntry(entry); // This writes the header and calls pad
        
        byte[] output = ((ByteArrayOutputStream) out).toByteArray();
        // For NEW format:
        // 11 fields * 8 bytes = 88 bytes
        // Name length field = 8 bytes
        // Checksum field = 8 bytes
        // Name itself: longName.length() + 1 (for null terminator) = 63 + 1 = 64 bytes
        // Header padding: Name length is 64, which is a multiple of 4. HeaderPadCount for 64 is 0.
        // Total header size = 88 + 8 + 8 + 64 = 168 bytes.
        assertTrue(output.length >= 168); 
        
        cpio.write("hello".getBytes(), 0, 5);
        cpio.closeArchiveEntry(); // data padding: 5 % 2 = 1. padding = 2-1 = 1. Data + padding = 6 bytes.
        assertTrue(output.length >= 168 + 6);
    }
    
    // Test with an empty entry
    @Test
    public void testEmptyEntry() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("empty.txt");
        entry.setSize(0);
        entry.setMode(CpioConstants.C_ISREG);
        cpio.putArchiveEntry(entry);
        cpio.closeArchiveEntry(); // Should not throw error for zero size
        ByteArrayOutputStream baos = (ByteArrayOutputStream) out;
        assertTrue(baos.size() > 0); // Header should be written
    }

    @Test
    public void testFlush() throws Exception {
        OutputStream out = createOut();
        CpioArchiveOutputStream cpio = new CpioArchiveOutputStream(out, CpioConstants.FORMAT_NEW);
        cpio.flush(); // Should just flush the underlying stream
        assertTrue(true);
    }
}
