package org.apache.commons.compress.compressors.bzip2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BZip2CompressorInputStreamAI30Test {

    @Test
    public void testMatchesShortSignature() {
        byte[] sig = new byte[] { 'B', 'Z' };
        assertFalse(BZip2CompressorInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesValidSignature() {
        byte[] sig = new byte[] { 'B', 'Z', 'h', '9' };
        assertTrue(BZip2CompressorInputStream.matches(sig, sig.length));
    }

    @Test
    public void testMatchesInvalidPrefix() {
        byte[] sig = new byte[] { 'A', 'Z', 'h', '9' };
        assertFalse(BZip2CompressorInputStream.matches(sig, sig.length));
    }
}
