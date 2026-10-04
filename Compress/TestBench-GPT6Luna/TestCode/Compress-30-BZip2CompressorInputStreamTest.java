package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;

public class BZip2CompressorInputStreamTest {
    @Test
    public void testMatchesSignatureAtMinimumLength() throws Exception {
        assertTrue(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h'}, 3));
    }

    @Test
    public void testMatchesSignatureWithLongerLength() throws Exception {
        assertTrue(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h'}, 4));
    }

    @Test
    public void testMatchesRejectsLengthBelowThree() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h'}, 2));
    }

    @Test
    public void testMatchesRejectsZeroLength() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h'}, 0));
    }

    @Test
    public void testMatchesRejectsWrongFirstByte() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'X', 'Z', 'h'}, 3));
    }

    @Test
    public void testMatchesRejectsWrongSecondByte() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'X', 'h'}, 3));
    }

    @Test
    public void testMatchesRejectsWrongThirdByte() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'X'}, 3));
    }

    @Test
    public void testMatchesDoesNotInspectBytesAfterSignature() throws Exception {
        assertTrue(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h', 'X'}, 3));
    }

    @Test
    public void testMatchesUsesOnlyFirstThreeBytesWhenLengthIsFour() throws Exception {
        assertTrue(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h', 'X'}, 4));
    }

    @Test
    public void testMatchesRejectsLengthThreeWhenFirstByteIsWrong() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'h'}, 3) == false);
    }

    @Test
    public void testMatchesRejectsLengthFourWhenSecondByteIsWrong() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'X', 'h', 'X'}, 4));
    }

    @Test
    public void testMatchesRejectsLengthFourWhenThirdByteIsWrong() throws Exception {
        assertFalse(BZip2CompressorInputStream.matches(new byte[] {'B', 'Z', 'X', 'h'}, 4));
    }
}
