package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ZipArchiveInputStreamAI41Test {

    @Test(expected = IllegalArgumentException.class)
    public void testRealSkipNegativeValueThrowsException() throws IOException {
        byte[] data = new byte[10];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        try {
            zais.skip(-5L);
        } finally {
            zais.close();
        }
    }

    @Test
    public void testCloseIdempotency() throws IOException {
        byte[] data = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        zais.close();
        zais.close();
    }

    @Test
    public void testConstructorWithEncoding() {
        byte[] data = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais, "UTF8");
        assertNotNull(zais);
    }
}
