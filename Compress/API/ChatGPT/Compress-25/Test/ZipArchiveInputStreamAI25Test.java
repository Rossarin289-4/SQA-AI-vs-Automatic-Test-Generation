package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ZipArchiveInputStreamAI25Test {

    @Test(expected = IllegalArgumentException.class)
    public void testRealSkipNegativeThrowsException() throws IOException {
        byte[] data = new byte[10];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        try {
            zais.realSkip(-1);
        } finally {
            zais.close();
        }
    }

    @Test
    public void testBoundedInputStreamReadWithMax() throws IOException {
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        try {
            ZipArchiveInputStream.CurrentEntry entry = new ZipArchiveInputStream.CurrentEntry();
            zais.current = entry;
            ZipArchiveInputStream.BoundedInputStream bis = zais.new BoundedInputStream(bais, 3);
            
            assertEquals(1, bis.read());
            assertEquals(2, bis.read());
            assertEquals(3, bis.read());
            assertEquals(-1, bis.read());
        } finally {
            zais.close();
        }
    }

    @Test
    public void testBoundedInputStreamAvailable() throws IOException {
        byte[] data = new byte[] { 10, 20, 30 };
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        try {
            ZipArchiveInputStream.CurrentEntry entry = new ZipArchiveInputStream.CurrentEntry();
            zais.current = entry;
            ZipArchiveInputStream.BoundedInputStream bis = zais.new BoundedInputStream(bais, 2);
            
            assertNotNull(bis);
            assertEquals(3, bis.available());
            
            bis.read();
            bis.read();
            assertEquals(0, bis.available());
        } finally {
            zais.close();
        }
    }
}
