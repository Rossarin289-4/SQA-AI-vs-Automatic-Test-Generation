package org.apache.commons.compress.compressors.bzip2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import org.junit.Test;

public class BZip2CompressorInputStreamAI22Test {

    @Test
    public void testMatchesShortSignature() {
        byte[] sig = new byte[] { 'B', 'Z' };
        assertFalse(BZip2CompressorInputStream.matches(sig, 2));
    }

    @Test
    public void testMatchesValidSignature() {
        byte[] sig = new byte[] { 'B', 'Z', 'h', '9' };
        assertTrue(BZip2CompressorInputStream.matches(sig, 4));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullStream() throws IOException {
        new BZip2CompressorInputStream(null);
    }

}
