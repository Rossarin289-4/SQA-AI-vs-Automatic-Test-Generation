package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;

public class BZip2CompressorInputStreamTest {
    @Test
    public void testMatchesFullSignature() throws Exception {
        assertTrue(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h'}, 3));
    }

    @Test
    public void testMatchesSignatureWithTrailingBytes() throws Exception {
        assertTrue(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h', 'x'}, 4));
    }

    @Test
    public void testMatchesLengthBelowThree() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h'}, 2));
    }

    @Test
    public void testMatchesLengthExactlyThree() throws Exception {
        assertTrue(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h'}, 3));
    }

    @Test
    public void testMatchesWrongFirstByte() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'X', 'Z', 'h'}, 3));
    }

    @Test
    public void testMatchesWrongSecondByte() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'X', 'h'}, 3));
    }

    @Test
    public void testMatchesWrongThirdByte() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'X'}, 3));
    }

    @Test
    public void testMatchesIgnoresBytesAfterCheckedSignature() throws Exception {
        assertTrue(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h', 'X', 'Y'}, 3));
    }

    @Test
    public void testMatchesZeroLength() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h'}, 0));
    }

    @Test
    public void testMatchesOneLength() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h'}, 1));
    }

    @Test
    public void testMatchesNullWithShortLength() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(null, 2));
    }

    @Test
    public void testMatchesNullAtSignatureLength() throws Exception {
        try {
            BZip2CompressorInputStream.matches(null, 3);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }
}
