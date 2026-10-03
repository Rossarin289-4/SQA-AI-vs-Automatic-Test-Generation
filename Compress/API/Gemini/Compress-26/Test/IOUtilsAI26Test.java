package org.apache.commons.compress.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class IOUtilsAI26Test {

    @Test
    public void testCopyDefaultBufferSize() throws IOException {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        long copied = IOUtils.copy(in, out);

        Assert.assertEquals(5L, copied);
        Assert.assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testCopyCustomBufferSize() throws IOException {
        byte[] data = new byte[]{10, 20, 30, 40, 50, 60};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        long copied = IOUtils.copy(in, out, 2);

        Assert.assertEquals(6L, copied);
        Assert.assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testSkipNormal() throws IOException {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        long skipped = IOUtils.skip(in, 3L);

        Assert.assertEquals(3L, skipped);
        Assert.assertEquals(4, in.read());
    }

    @Test
    public void testSkipBeyondEnd() throws IOException {
        byte[] data = new byte[]{1, 2};
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        long skipped = IOUtils.skip(in, 10L);

        Assert.assertEquals(2L, skipped);
        Assert.assertEquals(-1, in.read());
    }

    @Test
    public void testSkipZeroOrNegative() throws IOException {
        byte[] data = new byte[]{1, 2, 3};
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        long skipped = IOUtils.skip(in, 0L);
        Assert.assertEquals(0L, skipped);
        Assert.assertEquals(1, in.read());
    }

    @Test
    public void testReadFullyBufferArray() throws IOException {
        byte[] data = new byte[]{1, 2, 3, 4};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        byte[] buffer = new byte[4];

        int read = IOUtils.readFully(in, buffer);

        Assert.assertEquals(4, read);
        Assert.assertArrayEquals(data, buffer);
    }

    @Test
    public void testReadFullyPartialAndShortStream() throws IOException {
        byte[] data = new byte[]{1, 2};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        byte[] buffer = new byte[4];

        int read = IOUtils.readFully(in, buffer, 1, 3);

        Assert.assertEquals(2, read);
        Assert.assertArrayEquals(new byte[]{0, 1, 2, 0}, buffer);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyInvalidOffset() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        byte[] buffer = new byte[3];
        IOUtils.readFully(in, buffer, -1, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyInvalidLength() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        byte[] buffer = new byte[3];
        IOUtils.readFully(in, buffer, 0, -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadFullyOutOfBounds() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        byte[] buffer = new byte[3];
        IOUtils.readFully(in, buffer, 1, 3);
    }

    @Test
    public void testToByteArray() throws IOException {
        byte[] data = new byte[]{9, 8, 7, 6, 5};
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        byte[] result = IOUtils.toByteArray(in);

        Assert.assertArrayEquals(data, result);
    }

    @Test(expected = NullPointerException.class)
    public void testToByteArrayNull() throws IOException {
        IOUtils.toByteArray(null);
    }

    @Test
    public void testCloseQuietlyWithNull() {
        IOUtils.closeQuietly(null);
        // Should not throw any exception
    }

    @Test
    public void testCloseQuietlyNormal() {
        Closeable closeable = new Closeable() {
            @Override
            public void close() throws IOException {
                // do nothing successfully
            }
        };
        IOUtils.closeQuietly(closeable);
        // Should not throw any exception
    }

    @Test
    public void testCloseQuietlySwallowsException() {
        Closeable closeable = new Closeable() {
            @Override
            public void close() throws IOException {
                throw new IOException("Failed to close");
            }
        };
        IOUtils.closeQuietly(closeable);
        // Should swallow the IOException without propagating it
    }
}
