package org.apache.commons.compress.compressors.bzip2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

public class BZip2CompressorInputStreamAI30Test {

    @Test(expected = IOException.class)
    public void testConstructorNullStream() throws IOException {
        new BZip2CompressorInputStream(null);
    }

    @Test(expected = IOException.class)
    public void testConstructorNullStreamWithConcatenated() throws IOException {
        new BZip2CompressorInputStream(null, true);
    }

    @Test(expected = IOException.class)
    public void testConstructorEmptyStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        new BZip2CompressorInputStream(bais);
    }

    @Test(expected = IOException.class)
    public void testConstructorInvalidMagicBytes() throws IOException {
        byte[] invalid = new byte[] { 'X', 'Y', 'Z', '1' };
        ByteArrayInputStream bais = new ByteArrayInputStream(invalid);
        new BZip2CompressorInputStream(bais);
    }

    @Test
    public void testMatchesNullOrShortSignature() {
        assertFalse(BZip2CompressorInputStream.matches(null, 0));
        assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z' }, 2));
    }

    @Test
    public void testMatchesValidSignature() {
        byte[] sig = new byte[] { 'B', 'Z', 'h', '1' };
        assertTrue(BZip2CompressorInputStream.matches(sig, 4));
        assertTrue(BZip2CompressorInputStream.matches(sig, 3));
    }

    @Test
    public void testMatchesInvalidSignature() {
        byte[] sig = new byte[] { 'A', 'Z', 'h', '1' };
        assertFalse(BZip2CompressorInputStream.matches(sig, 4));
    }
}
