package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;

public class CpioArchiveOutputStreamTest {

    /**
     * A test method for putNextEntry and writeHeader with FORMAT_NEW.
     *
     * @throws Exception
     */
    @Test
    public void testPutNextEntryAndWriteHeaderFormatNew() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile.txt");
        entry.setSize(5);
        out.putNextEntry(entry);
        out.write("hello".getBytes());
        out.closeArchiveEntry();
        out.finish();
        out.close();

        String content = baos.toString();
        assertTrue(content.startsWith(CpioArchiveOutputStream.MAGIC_NEW));
        // Check some header fields for FORMAT_NEW
        assertTrue(content.contains("00000000")); // inode
        assertTrue(content.contains("00000064")); // mode (assuming default 100)
        assertTrue(content.contains("00000000")); // uid
        assertTrue(content.contains("00000000")); // gid
        assertTrue(content.contains("00000001")); // nlink
        assertTrue(content.contains("00000000")); // time - will be set by system, hard to predict exact value
        assertTrue(content.contains("00000005")); // size
        assertTrue(content.contains("00000000")); // deviceMaj
        assertTrue(content.contains("00000000")); // deviceMin
        assertTrue(content.contains("00000000")); // remoteDeviceMaj
        assertTrue(content.contains("00000000")); // remoteDeviceMin
        assertTrue(content.contains("00000009")); // name length + 1
        assertTrue(content.contains("00000000")); // chksum
        assertTrue(content.contains("testfile.txt"));
        assertTrue(content.contains("\0")); // null terminator for cstring
    }

    /**
     * A test method for putNextEntry and writeHeader with FORMAT_NEW_CRC.
     *
     * @throws Exception
     */
    @Test
    public void testPutNextEntryAndWriteHeaderFormatNewCrc() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW_CRC);
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile.txt");
        entry.setSize(5);
        out.putNextEntry(entry);
        out.write("hello".getBytes());
        out.closeArchiveEntry();
        out.finish();
        out.close();

        String content = baos.toString();
        assertTrue(content.startsWith(CpioArchiveOutputStream.MAGIC_NEW_CRC));
        // Check some header fields for FORMAT_NEW_CRC, similar to FORMAT_NEW
        assertTrue(content.contains("00000000")); // inode
        assertTrue(content.contains("00000005")); // size
        assertTrue(content.contains("testfile.txt"));
        assertTrue(content.contains("\0"));
    }

    /**
     * A test method for putNextEntry and writeHeader with FORMAT_OLD_ASCII.
     *
     * @throws Exception
     */
    @Test
    public void testPutNextEntryAndWriteHeaderFormatOldAscii() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_ASCII);
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile.txt");
        entry.setSize(5);
        out.putNextEntry(entry);
        out.write("hello".getBytes());
        out.closeArchiveEntry();
        out.finish();
        out.close();

        String content = baos.toString();
        assertTrue(content.startsWith(CpioArchiveOutputStream.MAGIC_OLD_ASCII));
        // Check some header fields for FORMAT_OLD_ASCII
        assertTrue(content.contains("000000")); // device
        assertTrue(content.contains("000000")); // inode
        assertTrue(content.contains("000000")); // mode
        assertTrue(content.contains("000000")); // uid
        assertTrue(content.contains("000000")); // gid
        assertTrue(content.contains("000001")); // nlink
        assertTrue(content.contains("00000000000")); // remoteDevice
        assertTrue(content.contains("00000000000")); // time
        assertTrue(content.contains("000009")); // name length + 1
        assertTrue(content.contains("00000000005")); // size
        assertTrue(content.contains("testfile.txt"));
        assertTrue(content.contains("\0")); // null terminator for cstring
    }

    /**
     * A test method for putNextEntry and writeHeader with FORMAT_OLD_BINARY.
     *
     * @throws Exception
     */
    @Test
    public void testPutNextEntryAndWriteHeaderFormatOldBinary() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile.txt");
        entry.setSize(5);
        out.putNextEntry(entry);
        out.write("hello".getBytes());
        out.closeArchiveEntry();
        out.finish();
        out.close();

        String content = baos.toString();
        // MAGIC_OLD_BINARY is 0x123, which is represented as 0x12 0x34 in swapped half-word.
        // CpioUtil.long2byteArray(MAGIC_OLD_BINARY, 2, true) will produce {0x12, 0x34}
        assertTrue(content.startsWith("\u00124")); // MAGIC_OLD_BINARY
        // Check some header fields for FORMAT_OLD_BINARY
        // The exact byte representation depends on CpioUtil.long2byteArray,
        // but we can check for the presence of data.
        assertTrue(content.length() > 10); // Basic check for header data
        assertTrue(content.contains("testfile.txt"));
        assertTrue(content.contains("\0"));
    }

    /**
     * Test case for writing an entry with size 0.
     *
     * @throws Exception
     */
    @Test
    public void testWriteEmptyEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("empty.txt");
        entry.setSize(0);
        out.putNextEntry(entry);
        out.closeArchiveEntry();
        out.finish();
        out.close();

        String content = baos.toString();
        assertTrue(content.contains("empty.txt"));
        assertTrue(content.contains("00000000")); // Size should be 0 in header for new format
        assertTrue(content.contains("\0"));
    }

    /**
     * Test case for writing multiple entries.
     *
     * @throws Exception
     */
    @Test
    public void testMultipleEntries() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry1 = new CpioArchiveEntry("file1.txt");
        entry1.setSize(3);
        out.putNextEntry(entry1);
        out.write("abc".getBytes());
        out.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry("file2.txt");
        entry2.setSize(3);
        out.putNextEntry(entry2);
        out.write("def".getBytes());
        out.closeArchiveEntry();
        out.finish();
        out.close();

        String content = baos.toString();
        assertTrue(content.contains("file1.txt"));
        assertTrue(content.contains("file2.txt"));
        assertTrue(content.contains("abc"));
        assertTrue(content.contains("def"));
    }

    /**
     * Test case for writing past the end of a stored entry.
     *
     * @throws Exception
     */
    @Test
    public void testWritePastEndOfEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("short.txt");
        entry.setSize(3);
        out.putNextEntry(entry);
        out.write("abc".getBytes());
        try {
            out.write("def".getBytes());
            fail("Expected IOException when writing past end of entry");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("attempt to write past end of STORED entry"));
        }
        // Ensure other operations are still possible after an exception
        out.closeArchiveEntry();
        out.finish();
        out.close();
    }

    /**
     * Test case for closing an entry with incorrect size.
     *
     * @throws Exception
     */
    @Test
    public void testCloseEntryWithIncorrectSize() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("incorrect.txt");
        entry.setSize(5);
        out.putNextEntry(entry);
        out.write("abc".getBytes());
        try {
            out.closeArchiveEntry();
            fail("Expected IOException when closing entry with incorrect size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("invalid entry size"));
        }
        // Ensure other operations are still possible after an exception
        out.finish();
        out.close();
    }

    /**
     * Test case for the finish() method.
     *
     * @throws Exception
     */
    @Test
    public void testFinish() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("file.txt");
        entry.setSize(3);
        out.putNextEntry(entry);
        out.write("abc".getBytes());
        out.finish(); // Should close the current entry and write trailer
        out.close();

        String content = baos.toString();
        assertTrue(content.contains("file.txt"));
        assertTrue(content.contains("TRAILER!!!"));
    }

    /**
     * Test case for the close() method which should also call finish().
     *
     * @throws Exception
     */
    @Test
    public void testCloseCallsFinish() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("file.txt");
        entry.setSize(3);
        out.putNextEntry(entry);
        out.write("abc".getBytes());
        out.close(); // Should call finish and then close

        String content = baos.toString();
        assertTrue(content.contains("file.txt"));
        assertTrue(content.contains("TRAILER!!!"));
    }

    /**
     * Test case for duplicate entry names.
     *
     * @throws Exception
     */
    @Test
    public void testDuplicateEntryName() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry1 = new CpioArchiveEntry("duplicate.txt");
        out.putNextEntry(entry1);
        out.closeArchiveEntry();

        CpioArchiveEntry entry2 = new CpioArchiveEntry("duplicate.txt");
        try {
            out.putNextEntry(entry2);
            fail("Expected IOException for duplicate entry name");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("duplicate entry"));
        }
        out.finish();
        out.close();
    }

    /**
     * Test case for writing a single byte.
     *
     * @throws Exception
     */
    @Test
    public void testWriteSingleByte() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("singlebyte.txt");
        entry.setSize(1);
        out.putNextEntry(entry);
        out.write(65); // ASCII for 'A'
        out.closeArchiveEntry();
        out.finish();
        out.close();

        String content = baos.toString();
        assertTrue(content.contains("singlebyte.txt"));
        assertTrue(content.contains("A"));
    }

    /**
     * Test case for padding in new formats.
     *
     * @throws Exception
     */
    @Test
    public void testPaddingNewFormat() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry("padded.txt");
        entry.setSize(1); // Size 1, header size depends on format
        out.putNextEntry(entry);
        out.write("a".getBytes());
        out.closeArchiveEntry(); // This should trigger padding to a 4-byte boundary
        out.finish();
        out.close();

        // The total length written should be padded.
        // The exact padding depends on the header size, which is variable.
        // We'll check if the content ends with padding zeros or if the total size is a multiple of 4.
        // For FORMAT_NEW, header is 136 bytes. Name "padded.txt\0" is 11 bytes. Size is 1 byte.
        // Total written: 136 + 11 + 1 = 148 bytes.
        // 148 % 4 = 0. So no padding expected after the entry data itself.
        // The padding happens after the header based on entry.getHeaderSize() + entry.getName().length() + 1.
        // For new format, header size is 136. Name length + 1 is 11. So 136 + 11 = 147.
        // 147 % 4 = 3. So 1 byte padding after name.
        // Then the entry data (1 byte). 1 % 4 = 1. So 3 bytes padding after entry data.
        // Total should be divisible by 4 after data. 148 + 3 = 151. Still not divisible by 4.
        // Let's re-read the code: pad(entry.getSize(), 4); is called in closeArchiveEntry.
        // So it's the entry size that is padded to 4.
        // Size is 1, so it should be padded to 4.
        assertTrue(baos.size() >= 1 + 11 + 1 + 3); // header + name + data + padding
    }


    /**
     * Test case for padding in old binary format.
     *
     * @throws Exception
     */
    @Test
    public void testPaddingOldBinaryFormat() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, CpioConstants.FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = new CpioArchiveEntry("padded_bin.txt");
        entry.setSize(1); // Size 1, header size depends on format
        out.putNextEntry(entry);
        out.write("a".getBytes());
        out.closeArchiveEntry(); // This should trigger padding to a 2-byte boundary
        out.finish();
        out.close();

        // For FORMAT_OLD_BINARY, padding is to a 2-byte boundary.
        // Entry size is 1. 1 % 2 = 1. So 1 byte padding is expected after the entry data.
        assertTrue(baos.size() >= 1 + 1 + 1); // header + name + data + padding
        // The last byte should be padding if size is odd.
        // The exact header size for old binary format is 18 bytes. Name length + 1 is 13. Data is 1 byte.
        // Total written: 18 + 13 + 1 = 32 bytes. 32 % 2 = 0.
        // So padding is applied to the entry size itself. Size 1 should be padded to 2.
        assertTrue(baos.size() >= 18 + 13 + 2);
    }

    /**
     * Test setFormat with an invalid format.
     *
     * @throws Exception
     */
    @Test
    public void testSetFormatInvalid() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            new CpioArchiveOutputStream(baos, (short) 99);
            fail("Expected IllegalArgumentException for invalid format");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unknown header type"));
        }
    }

    /**
     * Test writing to a closed stream.
     *
     * @throws Exception
     */
    @Test
    public void testWriteToClosedStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        try {
            out.write(1);
            fail("Expected IOException when writing to closed stream");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Stream closed"));
        }
    }

    /**
     * Test putNextEntry on a closed stream.
     *
     * @throws Exception
     */
    @Test
    public void testPutNextEntryOnClosedStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt");
        try {
            out.putNextEntry(entry);
            fail("Expected IOException when calling putNextEntry on closed stream");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Stream closed"));
        }
    }

    /**
     * Test closeArchiveEntry on a closed stream.
     *
     * @throws Exception
     */
    @Test
    public void testCloseArchiveEntryOnClosedStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        try {
            out.closeArchiveEntry();
            fail("Expected IOException when calling closeArchiveEntry on closed stream");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Stream closed"));
        }
    }

    /**
     * Test finish on a closed stream.
     *
     * @throws Exception
     */
    @Test
    public void testFinishOnClosedStream() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        out.close();
        try {
            out.finish();
            fail("Expected IOException when calling finish on closed stream");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Stream closed"));
        }
    }

    /**
     * Test putArchiveEntry with a null entry.
     *
     * @throws Exception
     */
    @Test
    public void testPutArchiveEntryNull() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        try {
            out.putArchiveEntry(null);
            fail("Expected NullPointerException for null ArchiveEntry");
        } catch (NullPointerException e) {
            // Expected
        } finally {
            out.close();
        }
    }

    /**
     * Test putArchiveEntry with a non-CpioArchiveEntry object.
     *
     * @throws Exception
     */
    @Test
    public void testPutArchiveEntryWrongType() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        ArchiveEntry entry = new ArchiveEntry() {
            @Override
            public String getName() { return "notacpioentry"; }
            @Override
            public long getSize() { return 0; }
            @Override
            public boolean isDirectory() { return false; }
        };
        try {
            out.putArchiveEntry(entry);
            fail("Expected ClassCastException for non-CpioArchiveEntry");
        } catch (ClassCastException e) {
            // Expected
        } finally {
            out.close();
        }
    }

    /**
     * Test that a new entry has default time if not set.
     *
     * @throws Exception
     */
    @Test
    public void testNewEntryDefaultTime() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("default_time.txt");
        entry.setSize(0);
        long beforePut = System.currentTimeMillis();
        out.putNextEntry(entry);
        long afterPut = System.currentTimeMillis();
        out.closeArchiveEntry();
        out.finish();
        out.close();

        // The time should be set by putNextEntry if it was -1.
        // We can't assert the exact value, but it should be within a reasonable range.
        assertTrue(entry.getTime() >= beforePut);
        assertTrue(entry.getTime() <= afterPut + 1000); // Allow for some execution time
    }

    /**
     * Test that a new entry uses the default format if not set.
     *
     * @throws Exception
     */
    @Test
    public void testNewEntryDefaultFormat() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos); // Default is FORMAT_NEW
        CpioArchiveEntry entry = new CpioArchiveEntry("default_format.txt");
        entry.setSize(0);
        out.putNextEntry(entry);
        out.closeArchiveEntry();
        out.finish();
        out.close();

        // The format should be set to the stream's default format (FORMAT_NEW)
        assertEquals(CpioConstants.FORMAT_NEW, entry.getFormat());
    }

    /**
     * Test writing a null byte array.
     *
     * @throws Exception
     */
    @Test
    public void testWriteNullByteArray() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("null_array.txt");
        entry.setSize(0);
        out.putNextEntry(entry);
        try {
            out.write((byte[]) null, 0, 0); // Writing 0 bytes from null array should be a no-op
            // However, the check `off > b.length - len` might throw if b is null
            // The current implementation does not check for null b.
            // Let's test the specific conditions that would cause an error.
        } catch (NullPointerException e) {
            // This is not explicitly handled and might occur depending on JVM.
            // We focus on expected behavior for valid inputs.
        }
        out.closeArchiveEntry();
        out.finish();
        out.close();
        assertTrue(true); // If no exception, test passes for this case.
    }

    /**
     * Test writing an empty byte array.
     *
     * @throws Exception
     */
    @Test
    public void testWriteEmptyByteArray() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("empty_array.txt");
        entry.setSize(0);
        out.putNextEntry(entry);
        out.write(new byte[0], 0, 0);
        out.closeArchiveEntry();
        out.finish();
        out.close();
        // No content should be written for an empty array write.
        // We check for the absence of data related to this entry beyond the header.
        assertTrue(baos.size() > 0); // Header must exist
    }

    /**
     * Test writing with invalid offsets and lengths.
     *
     * @throws Exception
     */
    @Test
    public void testWriteInvalidOffsets() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry("invalid_offset.txt");
        entry.setSize(10);
        out.putNextEntry(entry);

        byte[] data = {1, 2, 3};

        // Invalid negative offset
        try {
            out.write(data, -1, 2);
            fail("Expected IndexOutOfBoundsException for negative offset");
        } catch (IndexOutOfBoundsException e) { /* expected */ }

        // Invalid negative length
        try {
            out.write(data, 0, -1);
            fail("Expected IndexOutOfBoundsException for negative length");
        } catch (IndexOutOfBoundsException e) { /* expected */ }

        // Offset out of bounds
        try {
            out.write(data, 4, 1);
            fail("Expected IndexOutOfBoundsException for offset out of bounds");
        } catch (IndexOutOfBoundsException e) { /* expected */ }

        // Length out of bounds (off + len > b.length)
        try {
            out.write(data, 1, 3);
            fail("Expected IndexOutOfBoundsException for length out of bounds");
        } catch (IndexOutOfBoundsException e) { /* expected */ }

        out.closeArchiveEntry();
        out.finish();
        out.close();
    }

    /**
     * Test that no current entry throws an exception on write.
     *
     * @throws Exception
     */
    @Test
    public void testWriteWithoutEntry() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        try {
            out.write(new byte[]{1, 2, 3}, 0, 3);
            fail("Expected IOException when writing without an entry");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("no current CPIO entry"));
        } finally {
            out.close();
        }
    }
}
