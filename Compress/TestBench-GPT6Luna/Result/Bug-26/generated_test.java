package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtilsTest {
    @Test
    public void testCopyEmptyStream() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(0L, IOUtils.copy(new java.io.ByteArrayInputStream(new byte[0]), out));
        assertEquals(0, out.size());
    }

    @Test
    public void testCopySingleByte() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(1L, IOUtils.copy(new java.io.ByteArrayInputStream(new byte[] {7}), out));
        assertArrayEquals(new byte[] {7}, out.toByteArray());
    }

    @Test
    public void testCopyMultipleBytesAndBufferBoundary() throws Exception {
        byte[] data = new byte[8025];
        data[0] = 1;
        data[8023] = 2;
        data[8024] = 3;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(8025L, IOUtils.copy(new java.io.ByteArrayInputStream(data), out));
        assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testSkipZero() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[] {1, 2});
        assertEquals(0L, IOUtils.skip(in, 0));
        assertEquals(1, in.read());
    }

    @Test
    public void testSkipNegative() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[] {1, 2});
        assertEquals(0L, IOUtils.skip(in, -1));
        assertEquals(1, in.read());
    }

    @Test
    public void testSkipExactlyAvailable() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[] {1, 2, 3});
        assertEquals(3L, IOUtils.skip(in, 3));
        assertEquals(-1, in.read());
    }

    @Test
    public void testSkipBeyondEnd() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[] {1, 2});
        assertEquals(2L, IOUtils.skip(in, 5));
        assertEquals(-1, in.read());
    }

    @Test
    public void testReadFullyFillsArray() throws Exception {
        byte[] result = new byte[3];
        assertEquals(3, IOUtils.readFully(new java.io.ByteArrayInputStream(new byte[] {4, 5, 6}), result));
        assertArrayEquals(new byte[] {4, 5, 6}, result);
    }

    @Test
    public void testReadFullyEmptyArray() throws Exception {
        byte[] result = new byte[0];
        assertEquals(0, IOUtils.readFully(new java.io.ByteArrayInputStream(new byte[] {4}), result));
    }

    @Test
    public void testReadFullyShortAtEnd() throws Exception {
        byte[] result = new byte[3];
        assertEquals(2, IOUtils.readFully(new java.io.ByteArrayInputStream(new byte[] {8, 9}), result));
        assertArrayEquals(new byte[] {8, 9, 0}, result);
    }

    @Test
    public void testToByteArrayEmpty() throws Exception {
        assertArrayEquals(new byte[0], IOUtils.toByteArray(new java.io.ByteArrayInputStream(new byte[0])));
    }

    @Test
    public void testToByteArrayPreservesContents() throws Exception {
        byte[] data = new byte[] {0, -1, 12};
        assertArrayEquals(data, IOUtils.toByteArray(new java.io.ByteArrayInputStream(data)));
    }

    @Test
    public void testCloseQuietlyClosesCloseable() throws Exception {
        final boolean[] closed = new boolean[1];
        Closeable c = new Closeable() {
            public void close() {
                closed[0] = true;
            }
        };
        IOUtils.closeQuietly(c);
        assertTrue(closed[0]);
    }

    @Test
    public void testCloseQuietlyNull() throws Exception {
        IOUtils.closeQuietly(null);
        assertEquals(1, 1);
    }

    @Test
    public void testCloseQuietlySwallowsIOException() throws Exception {
        final int[] calls = new int[1];
        Closeable c = new Closeable() {
            public void close() throws IOException {
                calls[0]++;
                throw new IOException();
            }
        };
        IOUtils.closeQuietly(c);
        assertEquals(1, calls[0]);
    }
}
