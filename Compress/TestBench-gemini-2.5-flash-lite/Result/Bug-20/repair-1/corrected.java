package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;

public class CpioArchiveInputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper to create a dummy InputStream for testing
    private InputStream createDummyInputStream(byte[] data) {
        return new ByteArrayInputStream(data);
    }

    // Test for matches method with invalid signature
    @Test
    public void testMatches_invalidSignature() throws Exception {
        byte[] signature = {0x01, 0x02, 0x03};
        assertFalse(CpioArchiveInputStream.matches(signature, signature.length));
    }

    // Test for matches method with MAGIC_NEW
    @Test
    public void testMatches_magicNew() throws Exception {
        byte[] signature = {'0', '7', '0', '7', '0', '1'};
        assertTrue(CpioArchiveInputStream.matches(signature, signature.length));
    }

    // Test for matches method with MAGIC_NEW_CRC
    @Test
    public void testMatches_magicNewCrc() throws Exception {
        byte[] signature = {'0', '7', '0', '7', '0', '2'};
        assertTrue(CpioArchiveInputStream.matches(signature, signature.length));
    }

    // Test for matches method with MAGIC_OLD_ASCII
    @Test
    public void testMatches_magicOldAscii() throws Exception {
        byte[] signature = {'0', '7', '0', '7', '0', '7'};
        assertTrue(CpioArchiveInputStream.matches(signature, signature.length));
    }

    // Test for matches method with MAGIC_OLD_BINARY (070707 octal)
    @Test
    public void testMatches_magicOldBinary1() throws Exception {
        // 0x71c7 -> 0x71 is high byte, 0xc7 is low byte
        byte[] signature = {(byte) 0x71, (byte) 0xc7};
        assertTrue(CpioArchiveInputStream.matches(signature, signature.length));
    }

    // Test for matches method with MAGIC_OLD_BINARY (swapped bytes)
    @Test
    public void testMatches_magicOldBinary2() throws Exception {
        // 0xc771 -> 0xc7 is high byte, 0x71 is low byte
        byte[] signature = {(byte) 0xc7, (byte) 0x71};
        assertTrue(CpioArchiveInputStream.matches(signature, signature.length));
    }

    // Test available when no entry is present
    @Test
    public void testAvailable_noEntry() throws Exception {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(createDummyInputStream(new byte[0]));
        assertEquals(1, cis.available());
    }

    // Test available when entry EOF is true
    @Test
    public void testAvailable_entryEOF() throws Exception {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(createDummyInputStream(new byte[0]));
        // Simulate entryEOF being set (it's private, so this is for internal testing logic)
        cis.entryEOF = true; // Accessing private field for test setup
        assertEquals(0, cis.available());
    }

    // Test close method
    @Test
    public void testClose() throws Exception {
        InputStream mockIn = createDummyInputStream(new byte[0]);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        cis.close();
        // Check if closed flag is set.
        assertTrue(cis.closed); // Accessing private field for test setup
    }

    // Test close method when already closed
    @Test
    public void testClose_alreadyClosed() throws Exception {
        InputStream mockIn = createDummyInputStream(new byte[0]);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        cis.close();
        cis.close(); // Call close again
        assertTrue(cis.closed); // Accessing private field for test setup
    }

    // Test closeEntry method
    @Test
    public void testCloseEntry() throws Exception {
        // Mock input stream to read some data and then return -1
        InputStream mockIn = new ByteArrayInputStream(new byte[5]); // Simulate reading 5 bytes
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        
        // Simulate an entry being read partially
        cis.entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW); // Accessing private field for test setup
        cis.entry.setSize(10); // Accessing private field for test setup
        cis.entryBytesRead = 5; // Accessing private field for test setup
        cis.entryEOF = false; // Accessing private field for test setup

        cis.closeEntry();
        assertTrue(cis.entryEOF); // Accessing private field for test setup
    }

    // Test ensureOpen when stream is closed
    @Test
    public void testEnsureOpen_closedStream() throws Exception {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(createDummyInputStream(new byte[0]));
        cis.closed = true; // Accessing private field for test setup
        try {
            cis.ensureOpen();
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Stream closed", e.getMessage());
        }
    }

    // Test getNextCPIOEntry for MAGIC_NEW_CRC with a valid header and empty name
    @Test
    public void testGetNextCPIOEntry_newCrc_emptyName() throws Exception {
        byte[] data = {
            '0', '7', '0', '7', '0', '2', // MAGIC_NEW_CRC
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '1', // mode (regular file)
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '0', // namesize (0)
            '0', '0', '0', '0', '0', '0', '0', '0', // chksum
        };
        InputStream mockIn = createDummyInputStream(data);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        CpioArchiveEntry entry = cis.getNextCPIOEntry();
        assertNotNull(entry);
        assertEquals(CpioConstants.FORMAT_NEW_CRC, entry.getFormat());
        assertEquals("Trailer", entry.getName()); // Empty name becomes trailer implicitly
    }

    // Test getNextCPIOEntry for MAGIC_OLD_ASCII
    @Test
    public void testGetNextCPIOEntry_oldAscii() throws Exception {
        byte[] data = {
            '0', '7', '0', '7', '0', '7', // MAGIC_OLD_ASCII
            '0', '0', '0', '0', '0', '1', // device
            '0', '0', '0', '0', '0', '2', // inode
            '0', '0', '4', '1', '0', '0', // mode (directory)
            '0', '0', '0', '0', '0', '3', // uid
            '0', '0', '0', '0', '0', '4', // gid
            '0', '0', '0', '0', '0', '5', // nlink
            '0', '0', '0', '0', '0', '6', // rdevice
            '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '7', // namesize
            '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '8', // size
            'f', 'i', 'l', 'e', 'n', 'a', 'm', 'e', '\0' // name + null terminator
        };
        InputStream mockIn = createDummyInputStream(data);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        CpioArchiveEntry entry = cis.getNextCPIOEntry();
        assertNotNull(entry);
        assertEquals(CpioConstants.FORMAT_OLD_ASCII, entry.getFormat());
        assertEquals(1, entry.getDevice());
        assertEquals(2, entry.getInode());
        assertEquals(04100, entry.getMode()); // Octal 4100
        assertEquals(3, entry.getUID());
        assertEquals(4, entry.getGID());
        assertEquals(5, entry.getNumberOfLinks());
        assertEquals(6, entry.getRemoteDevice());
        assertEquals(100000000L, entry.getTime()); // Decimal 100000000
        assertEquals(8, entry.getSize()); // Decimal 8
        assertEquals("filename", entry.getName());
    }

    // Test getNextCPIOEntry for MAGIC_OLD_BINARY
    @Test
    public void testGetNextCPIOEntry_oldBinary() throws Exception {
        byte[] data = {
            (byte) 0x71, (byte) 0xc7, // MAGIC_OLD_BINARY (070707 octal)
            0x00, 0x01, // device
            0x00, 0x02, // inode
            0x10, 0x00, // mode (0400, octal)
            0x00, 0x03, // uid
            0x00, 0x04, // gid
            0x00, 0x05, // nlink
            0x00, 0x06, // rdevice
            0x00, 0x00, 0x00, 0x07, // time (7)
            0x00, 0x08, // namesize (8)
            0x00, 0x00, 0x00, 0x09, // size (9)
            'f', 'i', 'l', 'e', 'n', 'a', 'm', 'e', // name (8 bytes)
            '\0' // null terminator
        };
        InputStream mockIn = createDummyInputStream(data);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        CpioArchiveEntry entry = cis.getNextCPIOEntry();
        assertNotNull(entry);
        assertEquals(CpioConstants.FORMAT_OLD_BINARY, entry.getFormat());
        assertEquals(1, entry.getDevice());
        assertEquals(2, entry.getInode());
        assertEquals(0x1000, entry.getMode()); // 0400 octal
        assertEquals(3, entry.getUID());
        assertEquals(4, entry.getGID());
        assertEquals(5, entry.getNumberOfLinks());
        assertEquals(6, entry.getRemoteDevice());
        assertEquals(7, entry.getTime());
        assertEquals(9, entry.getSize());
        assertEquals("filename", entry.getName());
    }

    // Test getNextCPIOEntry for MAGIC_OLD_BINARY with swapped half-word
    @Test
    public void testGetNextCPIOEntry_oldBinarySwapped() throws Exception {
        byte[] data = {
            (byte) 0xc7, (byte) 0x71, // MAGIC_OLD_BINARY (swapped)
            0x01, 0x00, // device (1)
            0x02, 0x00, // inode (2)
            0x00, 0x10, // mode (0400 octal)
            0x03, 0x00, // uid (3)
            0x04, 0x00, // gid (4)
            0x05, 0x00, // nlink (5)
            0x06, 0x00, // rdevice (6)
            0x00, 0x00, 0x07, 0x00, // time (7)
            0x08, 0x00, // namesize (8)
            0x00, 0x00, 0x09, 0x00, // size (9)
            'f', 'i', 'l', 'e', 'n', 'a', 'm', 'e', // name (8 bytes)
            '\0' // null terminator
        };
        InputStream mockIn = createDummyInputStream(data);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        CpioArchiveEntry entry = cis.getNextCPIOEntry();
        assertNotNull(entry);
        assertEquals(CpioConstants.FORMAT_OLD_BINARY, entry.getFormat());
        assertEquals(1, entry.getDevice());
        assertEquals(2, entry.getInode());
        assertEquals(0x1000, entry.getMode()); // 0400 octal
        assertEquals(3, entry.getUID());
        assertEquals(4, entry.getGID());
        assertEquals(5, entry.getNumberOfLinks());
        assertEquals(6, entry.getRemoteDevice());
        assertEquals(7, entry.getTime());
        assertEquals(9, entry.getSize());
        assertEquals("filename", entry.getName());
    }

    // Test getNextCPIOEntry for unknown magic string
    @Test
    public void testGetNextCPIOEntry_unknownMagic() throws Exception {
        byte[] data = {'u', 'n', 'k', 'n', 'o', 'w', 'n'};
        InputStream mockIn = createDummyInputStream(data);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        try {
            cis.getNextCPIOEntry();
            fail("Expected IOException for unknown magic");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unknown magic"));
        }
    }

    // Test getNextCPIOEntry for CPIO_TRAILER with MAGIC_NEW
    @Test
    public void testGetNextCPIOEntry_trailer() throws Exception {
        byte[] data = {
            '0', '7', '0', '7', '0', '1', // MAGIC_NEW
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '0', // mode (0)
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '5', // namesize (5)
            '0', '0', '0', '0', '0', '0', '0', '0', // chksum
            't', 'r', 'a', 'i', 'l', 'e', 'r', '\0', // name + null
            // Padding - should be skipped by skipRemainderOfLastBlock
            '0','0','0','0' 
        };
        InputStream mockIn = createDummyInputStream(data);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn, 512); // Use block size to test padding skip
        CpioArchiveEntry entry = cis.getNextCPIOEntry();
        assertNull(entry); // Trailer should return null
    }

    // Test getNextCPIOEntry when Mode 0 is not trailer (NEW format)
    @Test
    public void testGetNextCPIOEntry_modeZeroNotTrailer() throws Exception {
        byte[] data = {
            '0', '7', '0', '7', '0', '1', // MAGIC_NEW
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '0', // mode (0)
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '4', // namesize (4)
            '0', '0', '0', '0', '0', '0', '0', '0', // chksum
            'f', 'i', 'l', 'e', '\0', // name + null
        };
        InputStream mockIn = createDummyInputStream(data);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        try {
            cis.getNextCPIOEntry();
            fail("Expected IOException for mode 0 not being trailer");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Mode 0 only allowed in the trailer"));
        }
    }

    // Test read method when entry is null
    @Test
    public void testRead_nullEntry() throws Exception {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(createDummyInputStream(new byte[0]));
        byte[] buffer = new byte[10];
        assertEquals(-1, cis.read(buffer, 0, buffer.length));
    }

    // Test read method when entryEOF is true
    @Test
    public void testRead_entryEOF() throws Exception {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(createDummyInputStream(new byte[0]));
        cis.entryEOF = true; // Accessing private field for test setup
        byte[] buffer = new byte[10];
        assertEquals(-1, cis.read(buffer, 0, buffer.length));
    }

    // Test read method when entry size is reached
    @Test
    public void testRead_entrySizeReached() throws Exception {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(createDummyInputStream(new byte[0]));
        cis.entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW); // Accessing private field for test setup
        cis.entry.setSize(5); // Accessing private field for test setup
        cis.entryBytesRead = 5; // Accessing private field for test setup
        byte[] buffer = new byte[10];
        assertEquals(-1, cis.read(buffer, 0, buffer.length));
    }

    // Test read method with normal data
    @Test
    public void testRead_normalData() throws Exception {
        byte[] entryData = {1, 2, 3, 4, 5};
        byte[] header = {
            '0', '7', '0', '7', '0', '1', // MAGIC_NEW
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '1', // mode
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '0', // namesize (0)
            '0', '0', '0', '0', '0', '0', '0', '0', // chksum
        };
        byte[] combinedData = new byte[header.length + entryData.length];
        System.arraycopy(header, 0, combinedData, 0, header.length);
        System.arraycopy(entryData, 0, combinedData, header.length, entryData.length);

        InputStream mockIn = createDummyInputStream(combinedData);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        cis.getNextCPIOEntry(); // Read the header

        byte[] buffer = new byte[10];
        int bytesRead = cis.read(buffer, 0, 5);
        assertEquals(5, bytesRead);
        assertArrayEquals(new byte[]{1, 2, 3, 4, 5}, java.util.Arrays.copyOf(buffer, 5));
        assertEquals(5, cis.entryBytesRead); // Accessing private field for test setup

        bytesRead = cis.read(buffer, 0, 5); // Read again, should be EOF for entry
        assertEquals(-1, bytesRead);
    }

    // Test read method with partial read and CRC check
    @Test
    public void testRead_partialReadAndCrc() throws Exception {
        byte[] entryData = {1, 2, 3, 4, 5};
        // Header for NEW_CRC format, size=5, checksum = (1+2+3+4+5) = 15
        byte[] header = {
            '0', '7', '0', '7', '0', '2', // MAGIC_NEW_CRC
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '1', // mode
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '0', // namesize (0)
            '0', '0', '0', '0', '0', '0', '0', 'F', // chksum (15 decimal)
        };
        byte[] combinedData = new byte[header.length + entryData.length];
        System.arraycopy(header, 0, combinedData, 0, header.length);
        System.arraycopy(entryData, 0, combinedData, header.length, entryData.length);

        InputStream mockIn = createDummyInputStream(combinedData);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        cis.getNextCPIOEntry(); // Read the header

        byte[] buffer = new byte[10];
        int bytesRead = cis.read(buffer, 0, 3); // Read first 3 bytes
        assertEquals(3, bytesRead);
        assertEquals(3, cis.entryBytesRead); // Accessing private field for test setup
        assertEquals(1 + 2 + 3, cis.crc); // CRC check

        bytesRead = cis.read(buffer, 0, 5); // Read remaining 2 bytes
        assertEquals(2, bytesRead);
        assertEquals(5, cis.entryBytesRead); // Accessing private field for test setup
        assertEquals(1 + 2 + 3 + 4 + 5, cis.crc); // Final CRC check

        bytesRead = cis.read(buffer, 0, 5); // Read again, should be EOF for entry
        assertEquals(-1, bytesRead);
    }

    // Test read method with CRC error
    @Test
    public void testRead_crcError() throws Exception {
        byte[] entryData = {1, 2, 3, 4, 5};
        // Header for NEW_CRC format, size=5, checksum = 10 (incorrect)
        byte[] header = {
            '0', '7', '0', '7', '0', '2', // MAGIC_NEW_CRC
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '1', // mode
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '0', // namesize (0)
            '0', '0', '0', '0', '0', '0', '0', 'A', // chksum (10 decimal) - Incorrect for data 1-5
        };
        byte[] combinedData = new byte[header.length + entryData.length];
        System.arraycopy(header, 0, combinedData, 0, header.length);
        System.arraycopy(entryData, 0, combinedData, header.length, entryData.length);

        InputStream mockIn = createDummyInputStream(combinedData);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        cis.getNextCPIOEntry(); // Read the header

        byte[] buffer = new byte[10];
        cis.read(buffer, 0, 3); // Read first 3 bytes
        // Attempt to read remaining bytes, which should trigger CRC error
        try {
            cis.read(buffer, 0, 5);
            fail("Expected IOException for CRC error");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("CRC Error"));
        }
    }

    // Test readFully with EOF
    @Test
    public void testReadFully_eof() throws Exception {
        InputStream mockIn = new ByteArrayInputStream(new byte[0]) { // Empty stream
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return -1; // Always return EOF
            }
        };
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        byte[] buffer = new byte[10];
        try {
            cis.readFully(buffer, 0, 5);
            fail("Expected EOFException");
        } catch (EOFException e) {
            // Expected
        }
    }

    // Test readFully with partial read
    @Test
    public void testReadFully_partialRead() throws Exception {
        byte[] data = {1, 2, 3, 4, 5};
        InputStream mockIn = new ByteArrayInputStream(data) {
            private int readCount = 0;
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                if (readCount == 0) {
                    readCount++;
                    b[off] = data[0];
                    return 1; // Read only 1 byte first time
                } else if (readCount == 1) {
                    readCount++;
                    b[off] = data[1];
                    b[off + 1] = data[2];
                    return 2; // Read 2 bytes second time
                }
                return -1; // EOF after that
            }
        };
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        byte[] buffer = new byte[10];
        cis.readFully(buffer, 0, 5);
        assertArrayEquals(new byte[]{1, 2, 3, 0, 0}, java.util.Arrays.copyOf(buffer, 5));
    }

    // Test skip method with negative value
    @Test
    public void testSkip_negative() throws Exception {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(createDummyInputStream(new byte[0]));
        try {
            cis.skip(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("negative skip length", e.getMessage());
        }
    }

    // Test skip method when entry is null
    @Test
    public void testSkip_nullEntry() throws Exception {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(createDummyInputStream(new byte[0]));
        assertEquals(0, cis.skip(10));
    }

    // Test skip method when entry EOF is true
    @Test
    public void testSkip_entryEOF() throws Exception {
        CpioArchiveInputStream cis = new CpioArchiveInputStream(createDummyInputStream(new byte[0]));
        cis.entryEOF = true; // Accessing private field for test setup
        assertEquals(0, cis.skip(10));
    }

    // Test skip method with normal data
    @Test
    public void testSkip_normal() throws Exception {
        byte[] entryData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] header = {
            '0', '7', '0', '7', '0', '1', // MAGIC_NEW
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '1', // mode
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '0', // namesize (0)
            '0', '0', '0', '0', '0', '0', '0', '0', // chksum
        };
        byte[] combinedData = new byte[header.length + entryData.length];
        System.arraycopy(header, 0, combinedData, 0, header.length);
        System.arraycopy(entryData, 0, combinedData, header.length, entryData.length);

        InputStream mockIn = createDummyInputStream(combinedData);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        cis.getNextCPIOEntry(); // Read the header

        long skipped = cis.skip(5);
        assertEquals(5, skipped);
        assertEquals(5, cis.entryBytesRead); // Accessing private field for test setup

        byte[] buffer = new byte[10];
        int bytesRead = cis.read(buffer, 0, 5);
        assertEquals(5, bytesRead);
        assertArrayEquals(new byte[]{6, 7, 8, 9, 10}, java.util.Arrays.copyOf(buffer, 5));
    }

    // Test skip method to skip more than available
    @Test
    public void testSkip_moreThanAvailable() throws Exception {
        byte[] entryData = {1, 2, 3};
        byte[] header = {
            '0', '7', '0', '7', '0', '1', // MAGIC_NEW
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '1', // mode
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '0', // namesize (0)
            '0', '0', '0', '0', '0', '0', '0', '0', // chksum
        };
        byte[] combinedData = new byte[header.length + entryData.length];
        System.arraycopy(header, 0, combinedData, 0, header.length);
        System.arraycopy(entryData, 0, combinedData, header.length, entryData.length);

        InputStream mockIn = createDummyInputStream(combinedData);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        cis.getNextCPIOEntry(); // Read the header

        long skipped = cis.skip(10); // Try to skip more than 3 bytes
        assertEquals(3, skipped);
        assertEquals(3, cis.entryBytesRead); // Accessing private field for test setup
        assertTrue(cis.entryEOF); // Should set entryEOF (Accessing private field for test setup)

        int bytesRead = cis.read();
        assertEquals(-1, bytesRead);
    }

    // Test getNextEntry which should delegate to getNextCPIOEntry
    @Test
    public void testGetNextEntry_delegation() throws Exception {
        byte[] data = {
            '0', '7', '0', '7', '0', '1', // MAGIC_NEW
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '1', // mode
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '0', // namesize (0)
            '0', '0', '0', '0', '0', '0', '0', '0', // chksum
        };
        InputStream mockIn = createDummyInputStream(data);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        ArchiveEntry entry = cis.getNextEntry();
        assertNotNull(entry);
        assertEquals(CpioConstants.FORMAT_NEW, entry.getFormat());
        assertEquals("Trailer", entry.getName()); // Empty name becomes trailer
    }

    // Test constructor with default block size
    @Test
    public void testConstructor_defaultBlockSize() throws Exception {
        InputStream mockIn = createDummyInputStream(new byte[0]);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        assertEquals(CpioConstants.BLOCK_SIZE, cis.blockSize);
    }

    // Test constructor with custom block size
    @Test
    public void testConstructor_customBlockSize() throws Exception {
        InputStream mockIn = createDummyInputStream(new byte[0]);
        int customBlockSize = 1024;
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn, customBlockSize);
        assertEquals(customBlockSize, cis.blockSize);
    }

    // Test skipRemainderOfLastBlock when no data read in last block
    @Test
    public void testSkipRemainderOfLastBlock_noDataInBlock() throws Exception {
        InputStream mockIn = createDummyInputStream(new byte[0]);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn, 512);
        // This test assumes that getBytesRead() % blockSize == 0 would lead to 0 remaining bytes.
        // Direct manipulation of getBytesRead() is not possible without modifying the class.
        // The method is primarily for cleaning up the stream after the trailer.
        // Calling it with a clean state (no data read) should result in no-op.
        cis.skipRemainderOfLastBlock();
    }

    // Test skipRemainderOfLastBlock when some data read in last block
    @Test
    public void testSkipRemainderOfLastBlock_someDataInBlock() throws Exception {
        InputStream mockIn = createDummyInputStream(new byte[10]); // Simulate some data
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn, 512);
        // To properly test this, we'd need to simulate getBytesRead() and have data to skip.
        // This test focuses on calling the method and ensuring it doesn't crash.
        cis.skipRemainderOfLastBlock();
    }

    // Test read(byte[] b) form, delegates to read(byte[], int, int)
    @Test
    public void testRead_byteArray() throws Exception {
        byte[] entryData = {1, 2, 3};
        byte[] header = {
            '0', '7', '0', '7', '0', '1', // MAGIC_NEW
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '1', // mode
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '0', // namesize (0)
            '0', '0', '0', '0', '0', '0', '0', '0', // chksum
        };
        byte[] combinedData = new byte[header.length + entryData.length];
        System.arraycopy(header, 0, combinedData, 0, header.length);
        System.arraycopy(entryData, 0, combinedData, header.length, entryData.length);

        InputStream mockIn = createDummyInputStream(combinedData);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        cis.getNextCPIOEntry(); // Read the header

        byte[] buffer = new byte[5];
        int bytesRead = cis.read(buffer); // Use the single-argument read
        assertEquals(3, bytesRead);
        assertArrayEquals(new byte[]{1, 2, 3}, java.util.Arrays.copyOf(buffer, 3));
    }

    // Test read() method, delegates to read(byte[], int, int) with length 1
    @Test
    public void testRead_singleByte() throws Exception {
        byte[] entryData = {1, 2, 3};
        byte[] header = {
            '0', '7', '0', '7', '0', '1', // MAGIC_NEW
            '0', '0', '0', '0', '0', '0', '0', '0', // inode
            '0', '0', '0', '0', '0', '1', // mode
            '0', '0', '0', '0', '0', '0', // uid
            '0', '0', '0', '0', '0', '0', // gid
            '0', '0', '0', '0', '0', '1', // nlink
            '0', '0', '0', '0', '0', '0', // rdevice
            '0', '0', '0', '0', '0', '0', '0', '0', // time
            '0', '0', '0', '0', '0', '0', '0', '0', // namesize (0)
            '0', '0', '0', '0', '0', '0', '0', '0', // chksum
        };
        byte[] combinedData = new byte[header.length + entryData.length];
        System.arraycopy(header, 0, combinedData, 0, header.length);
        System.arraycopy(entryData, 0, combinedData, header.length, entryData.length);

        InputStream mockIn = createDummyInputStream(combinedData);
        CpioArchiveInputStream cis = new CpioArchiveInputStream(mockIn);
        cis.getNextCPIOEntry(); // Read the header

        assertEquals(1, cis.read());
        assertEquals(2, cis.read());
        assertEquals(3, cis.read());
        assertEquals(-1, cis.read());
    }
}
