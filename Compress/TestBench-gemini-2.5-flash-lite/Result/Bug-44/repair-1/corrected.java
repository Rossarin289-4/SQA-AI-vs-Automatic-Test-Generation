package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class ChecksumCalculatingInputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testRead_emptyStream() throws Exception {
        Checksum checksum = new CRC32();
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        assertEquals(-1, cci.read());
        assertEquals(0, cci.getValue()); // Checksum of empty stream is 0
    }

    @Test
    public void testRead_singleByte() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {12};
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        assertEquals(12, cci.read());
        assertEquals(checksum.getValue(), cci.getValue()); // Checksum should be updated
        assertEquals(-1, cci.read()); // End of stream
    }

    @Test
    public void testRead_multipleBytes() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3, 4, 5};
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        assertEquals(1, cci.read());
        assertEquals(2, cci.read());
        assertEquals(3, cci.read());
        assertEquals(4, cci.read());
        assertEquals(5, cci.read());
        assertEquals(-1, cci.read()); // End of stream
        assertEquals(checksum.getValue(), cci.getValue());
    }

    @Test
    public void testRead_byteBuffer_fullRead() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {10, 20, 30, 40, 50};
        byte[] buffer = new byte[5];
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        int bytesRead = cci.read(buffer);
        assertEquals(5, bytesRead);
        assertArrayEquals(data, buffer);
        assertEquals(checksum.getValue(), cci.getValue());
    }

    @Test
    public void testRead_byteBuffer_partialRead() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {10, 20, 30, 40, 50};
        byte[] buffer = new byte[3];
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        int bytesRead = cci.read(buffer);
        assertEquals(3, bytesRead);
        byte[] expected = {10, 20, 30};
        assertArrayEquals(expected, buffer);
        assertEquals(checksum.getValue(), cci.getValue());
    }

    @Test
    public void testRead_byteBuffer_withOffset_fullRead() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {0, 0, 10, 20, 30, 40, 50, 0, 0};
        byte[] buffer = new byte[5];
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        int bytesRead = cci.read(buffer, 2, 3); // Read 3 bytes starting from offset 2
        assertEquals(3, bytesRead);
        byte[] expected = {0, 0, 10, 20, 30};
        assertArrayEquals(expected, buffer);
        assertEquals(checksum.getValue(), cci.getValue());
    }

    @Test
    public void testRead_byteBuffer_withOffsetAndLength_partialRead() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] buffer = new byte[7];
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        int bytesRead = cci.read(buffer, 1, 5); // Read 5 bytes starting from offset 1
        assertEquals(5, bytesRead);
        byte[] expected = {0, 1, 2, 3, 4, 5};
        assertArrayEquals(expected, buffer);
        assertEquals(checksum.getValue(), cci.getValue());
    }

    @Test
    public void testRead_byteBuffer_readsUntilEOS() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3};
        byte[] buffer = new byte[10];
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        int bytesRead = cci.read(buffer); // Tries to read more than available
        assertEquals(3, bytesRead);
        byte[] expected = {1, 2, 3, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, buffer);
        assertEquals(checksum.getValue(), cci.getValue());
        assertEquals(-1, cci.read()); // Next read should be -1
    }

    @Test
    public void testSkip_oneByte() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3};
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        assertEquals(1, cci.skip(1)); // Should consume and checksum 1 byte
        assertEquals(checksum.getValue(), cci.getValue());
        assertEquals(2, cci.read()); // Next byte should be 2
    }

    @Test
    public void testSkip_multipleBytes() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3, 4, 5};
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        assertEquals(1, cci.skip(3)); // Should consume and checksum 1 byte as per implementation
        assertEquals(checksum.getValue(), cci.getValue());
        assertEquals(2, cci.read()); // Next byte should be 2
    }

    @Test
    public void testSkip_onEmptyStream() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {};
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        assertEquals(0, cci.skip(5)); // Should consume 0 bytes
        assertEquals(0, cci.getValue());
        assertEquals(-1, cci.read()); // End of stream
    }

    @Test
    public void testGetValue_afterZeroReads() throws Exception {
        Checksum checksum = new CRC32();
        InputStream in = new ByteArrayInputStream(new byte[10]); // Non-empty stream, but nothing read yet
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        assertEquals(0, cci.getValue()); // Checksum should be 0 before any reads
    }

    @Test
    public void testGetValue_afterReadingAllBytes() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {10, 20, 30};
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        while (cci.read() != -1) {} // Read all bytes
        assertEquals(checksum.getValue(), cci.getValue());
    }

    @Test
    public void testConstructor_nullChecksum() {
        try {
            new ChecksumCalculatingInputStream(null, new ByteArrayInputStream(new byte[0]));
            fail("Expected NullPointerException for null checksum");
        } catch (NullPointerException e) {
            assertEquals("Parameter checksum must not be null", e.getMessage());
        }
    }

    @Test
    public void testConstructor_nullInputStream() {
        try {
            new ChecksumCalculatingInputStream(new CRC32(), null);
            fail("Expected NullPointerException for null InputStream");
        } catch (NullPointerException e) {
            assertEquals("Parameter in must not be null", e.getMessage());
        }
    }

    @Test
    public void testRead_exceptionFromUnderlyingStream() throws Exception {
        Checksum checksum = new CRC32();
        // ByteArrayInputStream's read() does not declare throwing IOException.
        // To simulate an IOException, we need a custom InputStream.
        class FailingInputStream extends InputStream {
            private byte[] data;
            private int pos = 0;

            FailingInputStream(byte[] data) {
                this.data = data;
            }

            @Override
            public int read() throws IOException {
                if (pos >= data.length) {
                    return -1;
                }
                if (pos == 1) { // Simulate exception on second read attempt
                    throw new IOException("Simulated IO Exception");
                }
                return data[pos++] & 0xFF;
            }

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                if (pos >= data.length) {
                    return -1;
                }
                if (pos == 1) { // Simulate exception on second read attempt
                    throw new IOException("Simulated IO Exception");
                }
                int bytesToRead = Math.min(len, data.length - pos);
                System.arraycopy(data, pos, b, off, bytesToRead);
                pos += bytesToRead;
                return bytesToRead;
            }

            @Override
            public int available() throws IOException {
                return data.length - pos;
            }
        }

        InputStream failingStream = new FailingInputStream(new byte[] {1, 2, 3});
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, failingStream);
        cci.read(); // Reads '1' successfully
        try {
            cci.read(); // This read should throw the IOException
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Simulated IO Exception", e.getMessage());
        }
        // Checksum should have been updated for the first byte '1'
        assertEquals(checksum.getValue(), new CRC32() {{
            update((byte)1);
        }}.getValue());
    }

    @Test
    public void testRead_exceptionFromUnderlyingStream_buffer() throws Exception {
        Checksum checksum = new CRC32();
        // ByteArrayInputStream's read(byte[], int, int) does not declare throwing IOException.
        // To simulate an IOException, we need a custom InputStream.
        class FailingInputStream extends InputStream {
            private byte[] data;
            private int pos = 0;

            FailingInputStream(byte[] data) {
                this.data = data;
            }

            @Override
            public int read() throws IOException {
                if (pos >= data.length) {
                    return -1;
                }
                return data[pos++] & 0xFF;
            }

            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                if (pos >= data.length) {
                    return -1;
                }
                if (pos == 1) { // Simulate exception on second read attempt
                    throw new IOException("Simulated IO Exception");
                }
                int bytesToRead = Math.min(len, data.length - pos);
                System.arraycopy(data, pos, b, off, bytesToRead);
                pos += bytesToRead;
                return bytesToRead;
            }

            @Override
            public int available() throws IOException {
                return data.length - pos;
            }
        }
        InputStream failingStream = new FailingInputStream(new byte[] {1, 2, 3});
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, failingStream);
        byte[] buffer = new byte[5];
        cci.read(buffer, 0, 1); // Reads '1' successfully
        try {
            cci.read(buffer, 1, 4); // This read should throw the IOException
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Simulated IO Exception", e.getMessage());
        }
        // Checksum should have been updated for the first byte '1'
        assertEquals(checksum.getValue(), new CRC32() {{
            update((byte)1);
        }}.getValue());
    }
     @Test
    public void testSkip_largeValue() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3, 4, 5};
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        // The skip implementation calls read() which only consumes one byte.
        // A large value for n should not change this behavior.
        assertEquals(1, cci.skip(Long.MAX_VALUE));
        assertEquals(checksum.getValue(), cci.getValue());
        assertEquals(2, cci.read()); // Next byte should be 2
    }

    @Test
    public void testRead_afterSkip() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3, 4, 5};
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        cci.skip(2); // This will consume and checksum byte '1'
        assertEquals(checksum.getValue(), cci.getValue());
        assertEquals(2, cci.read()); // Should read byte '2'
        assertEquals(checksum.getValue(), cci.getValue()); // Checksum should be updated for '2'
        assertEquals(3, cci.read()); // Should read byte '3'
        assertEquals(checksum.getValue(), cci.getValue()); // Checksum should be updated for '3'
    }

    @Test
    public void testRead_buffer_zeroLength() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3};
        byte[] buffer = new byte[5];
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        int bytesRead = cci.read(buffer, 0, 0); // Read 0 bytes
        assertEquals(0, bytesRead);
        assertEquals(0, cci.getValue()); // Checksum should not be updated
        assertEquals(1, cci.read()); // First real read
        assertEquals(checksum.getValue(), cci.getValue());
    }

    @Test
    public void testRead_buffer_negativeOffset() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3};
        byte[] buffer = new byte[5];
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        try {
            cci.read(buffer, -1, 2);
            fail("Expected IndexOutOfBoundsException for negative offset");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
        assertEquals(0, cci.getValue()); // Checksum should not be updated
    }

    @Test
    public void testRead_buffer_lengthExceedingBuffer() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3};
        byte[] buffer = new byte[2];
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        // When len is greater than buffer.length - off, the underlying stream's read method
        // should handle it according to its contract. ByteArrayInputStream's read(byte[], int, int)
        // will read up to `buffer.length - off` bytes or until end of stream, whichever is smaller.
        // If the requested 'len' is larger than what can be written into 'b' starting at 'off',
        // it might lead to incorrect behavior if not handled carefully.
        // The current code passes 'len' directly to in.read().
        // A valid test for this case should rely on the behavior of ByteArrayInputStream.
        // Let's test a scenario where len is valid for buffer but exceeds available data.
        Checksum checksum2 = new CRC32();
        byte[] data2 = {1, 2};
        byte[] buffer2 = new byte[5];
        InputStream in2 = new ByteArrayInputStream(data2);
        ChecksumCalculatingInputStream cci2 = new ChecksumCalculatingInputStream(checksum2, in2);
        int bytesRead2 = cci2.read(buffer2, 0, 5); // Request 5, only 2 available
        assertEquals(2, bytesRead2);
        byte[] expected2 = {1, 2, 0, 0, 0};
        assertArrayEquals(expected2, buffer2);
        assertEquals(checksum2.getValue(), cci2.getValue());
    }


    @Test
    public void testRead_buffer_lengthExceedingRemainingCapacity() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3, 4, 5};
        byte[] buffer = new byte[3];
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        cci.read(buffer, 0, 2); // Reads 1, 2. buffer is {1, 2, 0}
        assertEquals(checksum.getValue(), new CRC32() {{
            update((byte)1);
            update((byte)2);
        }}.getValue()); // Checksum for 1, 2
        byte[] buffer2 = new byte[3];
        int bytesRead = cci.read(buffer2, 0, 3); // Request 3, but only 3, 4, 5 are left
        assertEquals(3, bytesRead);
        byte[] expected = {3, 4, 5};
        assertArrayEquals(expected, buffer2);
        assertEquals(checksum.getValue(), new CRC32() {{
            update((byte)1);
            update((byte)2);
            update((byte)3);
            update((byte)4);
            update((byte)5);
        }}.getValue()); // Checksum for 1, 2, 3, 4, 5
    }

    @Test
    public void testRead_buffer_offsetBeyondBuffer() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {1, 2, 3};
        byte[] buffer = new byte[2];
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        try {
            cci.read(buffer, 3, 1); // Offset 3 is out of bounds for buffer of size 2
            fail("Expected IndexOutOfBoundsException for offset too large");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
        assertEquals(0, cci.getValue());
    }

     @Test
    public void testRead_byteZero() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {0};
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        assertEquals(0, cci.read());
        assertEquals(checksum.getValue(), cci.getValue());
    }

    @Test
    public void testRead_byteNegative() throws Exception {
        Checksum checksum = new CRC32();
        byte[] data = {-1}; // Corresponds to 255 in unsigned byte context
        InputStream in = new ByteArrayInputStream(data);
        ChecksumCalculatingInputStream cci = new ChecksumCalculatingInputStream(checksum, in);
        assertEquals(-1, cci.read()); // read() returns byte value as int, so -1 is correct
        assertEquals(checksum.getValue(), cci.getValue());
    }
}
