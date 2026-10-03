package org.apache.commons.compress.compressors.deflate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

public class DeflateCompressorInputStreamAI33Test {

    @Test
    public void testMatches() {
        byte[] validSignature = new byte[] { (byte) 0x78, (byte) 0x01, 0, 0 };
        assertTrue(DeflateCompressorInputStream.matches(validSignature, validSignature.length));

        byte[] invalidSignature = new byte[] { (byte) 0x78, (byte) 0x02, 0, 0 };
        assertFalse(DeflateCompressorInputStream.matches(invalidSignature, invalidSignature.length));

        assertFalse(DeflateCompressorInputStream.matches(validSignature, 3));
    }

    @Test
    public void testReadEmptyStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        DeflateCompressorInputStream deflateStream = new DeflateCompressorInputStream(bais);
        try {
            int val = deflateStream.read();
            assertEquals(-1, val);
        } finally {
            deflateStream.close();
        }
    }

    @Test
    public void testAvailable() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        DeflateCompressorInputStream deflateStream = new DeflateCompressorInputStream(bais);
        try {
            int avail = deflateStream.available();
            assertTrue(avail >= 0);
        } finally {
            deflateStream.close();
        }
    }
}
