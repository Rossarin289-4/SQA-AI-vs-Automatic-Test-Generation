package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ZipArchiveInputStreamAI29Test {

    @Test(expected = IllegalArgumentException.class)
    public void testRealSkipNegativeThrowsException() throws Exception {
        byte[] data = new byte[10];
        InputStream in = new ByteArrayInputStream(data);
        ZipArchiveInputStream zipStream = new ZipArchiveInputStream(in);
        java.lang.reflect.Method method = ZipArchiveInputStream.class.getDeclaredMethod("realSkip", long.class);
        method.setAccessible(true);
        try {
            method.invoke(zipStream, -1L);
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (e.getCause() instanceof IllegalArgumentException) {
                throw (IllegalArgumentException) e.getCause();
            }
            throw e;
        }
    }

    @Test
    public void testMatchesEmptyOrShort() {
        byte[] empty = new byte[0];
        boolean matches = ZipArchiveInputStream.matches(empty, 0);
        assertEquals(false, matches);
    }

    @Test
    public void testCanReadWithNullOrEmptyStream() throws IOException {
        ByteArrayInputStream empty = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zipStream = new ZipArchiveInputStream(empty);
        assertNotNull(zipStream);
        assertEquals(null, zipStream.getNextZipEntry());
    }
}
