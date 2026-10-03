package org.apache.commons.compress.utils;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Test;

public class IOUtilsAI26Test {

    @Test
    public void testCopy() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        long copied = IOUtils.copy(in, out);
        assertEquals(5L, copied);
        org.junit.Assert.assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testSkip() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        long skipped = IOUtils.skip(in, 3L);
        assertEquals(3L, skipped);
        assertEquals(4, in.read());
    }

    @Test
    public void testReadFully() throws IOException {
        byte[] data = new byte[] { 10, 20, 30, 40 };
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        byte[] b = new byte[2];
        int read = IOUtils.readFully(in, b);
        assertEquals(2, read);
        assertEquals(10, b[0]);
        assertEquals(20, b[1]);
    }
}
