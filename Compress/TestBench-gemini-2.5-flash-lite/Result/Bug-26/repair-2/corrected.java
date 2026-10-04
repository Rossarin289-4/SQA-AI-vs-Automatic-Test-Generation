package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class IOUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCopy_EmptyInput() throws Exception {
        InputStream input = new ByteArrayInputStream(new byte[0]);
        ByteArrayOutputStream output = new ByteArrayOutputStream(); // Use concrete type
        long bytesCopied = IOUtils.copy(input, output);
        assertEquals(0, bytesCopied);
        assertEquals(0, output.size()); // Now size() is available
    }

    @Test
    public void testCopy_Basic() throws Exception {
        byte[] data = "Hello World".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        ByteArrayOutputStream output = new ByteArrayOutputStream(); // Use concrete type
        long bytesCopied = IOUtils.copy(input, output);
        assertEquals(data.length, bytesCopied);
        assertArrayEquals(data, output.toByteArray()); // Now toByteArray() is available
    }

    @Test
    public void testCopy_LargerThanDefaultBuffer() throws Exception {
        // Test with data larger than the default COPY_BUF_SIZE
        byte[] data = new byte[8024 + 100]; // Assuming default is 8024
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        InputStream input = new ByteArrayInputStream(data);
        ByteArrayOutputStream output = new ByteArrayOutputStream(); // Use concrete type
        long bytesCopied = IOUtils.copy(input, output);
        assertEquals(data.length, bytesCopied);
        assertArrayEquals(data, output.toByteArray()); // Now toByteArray() is available
    }

    @Test
    public void testCopy_CustomBufferSize() throws Exception {
        byte[] data = "Test String".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        ByteArrayOutputStream output = new ByteArrayOutputStream(); // Use concrete type
        int bufferSize = 1024;
        long bytesCopied = IOUtils.copy(input, output, bufferSize);
        assertEquals(data.length, bytesCopied);
        assertArrayEquals(data, output.toByteArray()); // Now toByteArray() is available
    }

    @Test
    public void testCopy_CustomBufferSizeSmall() throws Exception {
        byte[] data = "Small".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        ByteArrayOutputStream output = new ByteArrayOutputStream(); // Use concrete type
        int bufferSize = 2;
        long bytesCopied = IOUtils.copy(input, output, bufferSize);
        assertEquals(data.length, bytesCopied);
        assertArrayEquals(data, output.toByteArray()); // Now toByteArray() is available
    }

    @Test
    public void testSkip_EmptyInput() throws Exception {
        InputStream input = new ByteArrayInputStream(new byte[0]);
        long numToSkip = 10;
        long skipped = IOUtils.skip(input, numToSkip);
        assertEquals(0, skipped);
    }

    @Test
    public void testSkip_Basic() throws Exception {
        byte[] data = "1234567890".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        long numToSkip = 5;
        long skipped = IOUtils.skip(input, numToSkip);
        assertEquals(numToSkip, skipped);
        // Verify that the next read starts after the skipped bytes
        assertEquals('6', (char) input.read());
    }

    @Test
    public void testSkip_MoreThanAvailable() throws Exception {
        byte[] data = "abc".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        long numToSkip = 10;
        long skipped = IOUtils.skip(input, numToSkip);
        assertEquals(data.length, skipped);
        assertEquals(-1, input.read());
    }

    @Test
    public void testSkip_Zero() throws Exception {
        byte[] data = "data".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        long numToSkip = 0;
        long skipped = IOUtils.skip(input, numToSkip);
        assertEquals(0, skipped);
        assertEquals('d', (char) input.read());
    }

    @Test
    public void testSkip_LargeNumberExceedingSkipBufSize() throws Exception {
        byte[] data = new byte[5000]; // Larger than SKIP_BUF_SIZE
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        InputStream input = new ByteArrayInputStream(data);
        long numToSkip = 4500; // Will require fallback to read()
        long skipped = IOUtils.skip(input, numToSkip);
        assertEquals(numToSkip, skipped);
        // The value at index 4500 is (byte) 4500 which wraps around.
        // Let's verify the next byte read.
        assertEquals((byte) (4500 % 256), input.read());
    }

    @Test
    public void testReadFully_EmptyArray() throws Exception {
        byte[] data = "abc".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[0];
        int bytesRead = IOUtils.readFully(input, buffer);
        assertEquals(0, bytesRead);
    }

    @Test
    public void testReadFully_Basic() throws Exception {
        byte[] data = "HelloWorld".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];
        int bytesRead = IOUtils.readFully(input, buffer);
        assertEquals(5, bytesRead);
        assertArrayEquals("Hello".getBytes(StandardCharsets.UTF_8), buffer);
    }

    @Test
    public void testReadFully_ExactMatch() throws Exception {
        byte[] data = "Exact".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];
        int bytesRead = IOUtils.readFully(input, buffer);
        assertEquals(5, bytesRead);
        assertArrayEquals(data, buffer);
    }

    @Test
    public void testReadFully_MoreThanAvailable() throws Exception {
        byte[] data = "Short".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];
        int bytesRead = IOUtils.readFully(input, buffer);
        assertEquals(data.length, bytesRead);
        // Should only fill with available data
        byte[] expected = new byte[10];
        System.arraycopy(data, 0, expected, 0, data.length);
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testReadFully_OffsetAndLength() throws Exception {
        byte[] data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];
        int offset = 2;
        int len = 5; // Reads "CDEFG"
        int bytesRead = IOUtils.readFully(input, buffer, offset, len);
        assertEquals(len, bytesRead);
        byte[] expected = new byte[10];
        System.arraycopy("CDEFG".getBytes(StandardCharsets.UTF_8), 0, expected, offset, len);
        assertArrayEquals(expected, buffer);
    }

    @Test
    public void testReadFully_OffsetAndLength_EndOfString() throws Exception {
        byte[] data = "ABCDEFGHIJ".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[10];
        int offset = 5;
        int len = 5; // Reads "FGHIJ"
        int bytesRead = IOUtils.readFully(input, buffer, offset, len);
        assertEquals(len, bytesRead);
        byte[] expected = new byte[10];
        System.arraycopy("FGHIJ".getBytes(StandardCharsets.UTF_8), 0, expected, offset, len);
        assertArrayEquals(expected, buffer);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_OffsetTooLarge() throws Exception {
        byte[] data = "abc".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];
        IOUtils.readFully(input, buffer, 6, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_LengthTooLarge() throws Exception {
        byte[] data = "abc".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];
        IOUtils.readFully(input, buffer, 0, 6);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_NegativeOffset() throws Exception {
        byte[] data = "abc".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];
        IOUtils.readFully(input, buffer, -1, 2);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFully_NegativeLength() throws Exception {
        byte[] data = "abc".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] buffer = new byte[5];
        IOUtils.readFully(input, buffer, 0, -1);
    }

    @Test
    public void testToByteArray_EmptyInput() throws Exception {
        InputStream input = new ByteArrayInputStream(new byte[0]);
        byte[] result = IOUtils.toByteArray(input);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    public void testToByteArray_Basic() throws Exception {
        byte[] data = "TestData".getBytes(StandardCharsets.UTF_8);
        InputStream input = new ByteArrayInputStream(data);
        byte[] result = IOUtils.toByteArray(input);
        assertArrayEquals(data, result);
    }

    @Test
    public void testToByteArray_LargerInput() throws Exception {
        // Test with data larger than the default COPY_BUF_SIZE for toByteArray
        byte[] data = new byte[8024 * 2]; // Assuming default is 8024
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) (i % 256);
        }
        InputStream input = new ByteArrayInputStream(data);
        byte[] result = IOUtils.toByteArray(input);
        assertArrayEquals(data, result);
    }

    @Test
    public void testCloseQuietly_Null() throws Exception {
        IOUtils.closeQuietly(null); // Should not throw an exception
    }

    @Test
    public void testCloseQuietly_Closeable() throws Exception {
        Closeable mockCloseable = new MockCloseable();
        IOUtils.closeQuietly(mockCloseable);
        assertTrue(((MockCloseable) mockCloseable).isClosed());
    }

    @Test
    public void testCloseQuietly_CloseableThrowsException() throws Exception {
        Closeable throwingCloseable = new ThrowingCloseable();
        IOUtils.closeQuietly(throwingCloseable); // Should swallow the exception
    }
    
    // Helper classes for testing closeQuietly
    private static class MockCloseable implements Closeable {
        private boolean closed = false;

        @Override
        public void close() throws IOException {
            this.closed = true;
        }

        public boolean isClosed() {
            return closed;
        }
    }

    private static class ThrowingCloseable implements Closeable {
        @Override
        public void close() throws IOException {
            throw new IOException("Simulated close exception");
        }
    }
}
