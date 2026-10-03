package org.apache.commons.compress.compressors.bzip2;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BZip2CompressorInputStreamAI22Test {

    @Test(expected = IOException.class)
    public void testConstructorNullInputStream() throws IOException {
        new BZip2CompressorInputStream(null);
    }

    @Test(expected = IOException.class)
    public void testConstructorNullInputStreamWithBoolean() throws IOException {
        new BZip2CompressorInputStream(null, true);
    }

    @Test(expected = IOException.class)
    public void testConstructorEmptyStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        new BZip2CompressorInputStream(bais);
    }

    @Test(expected = IOException.class)
    public void testConstructorInvalidMagicBytes() throws IOException {
        byte[] badData = new byte[] { 'X', 'Y', 'Z', '1', '2', '3' };
        ByteArrayInputStream bais = new ByteArrayInputStream(badData);
        new BZip2CompressorInputStream(bais);
    }

    @Test
    public void testMatchesNullOrShortSignature() {
        Assert.assertFalse(BZip2CompressorInputStream.matches(null, 0));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'B', 'Z' }, 2));
        Assert.assertFalse(BZip2CompressorInputStream.matches(new byte[] { 'A', 'Z', 'h' }, 3));
    }

    @Test
    public void testMatchesValidSignature() {
        byte[] validSig = new byte[] { 'B', 'Z', 'h', '9' };
        Assert.assertTrue(BZip2CompressorInputStream.matches(validSig, 4));
        Assert.assertTrue(BZip2CompressorInputStream.matches(validSig, 3));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArrayNegativeOffset() throws IOException {
        byte[] validSig = new byte[] { 'B', 'Z', 'h', '9', '1', '1', '1', '1', '1', '1' };
        ByteArrayInputStream bais = new ByteArrayInputStream(validSig);
        try {
            BZip2CompressorInputStream in = new BZip2CompressorInputStream(bais);
            byte[] dest = new byte[10];
            in.read(dest, -1, 5);
        } catch (IOException e) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArrayNegativeLength() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        try {
            BZip2CompressorInputStream in = new BZip2CompressorInputStream(bais);
            byte[] dest = new byte[10];
            in.read(dest, 0, -1);
        } catch (IOException e) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testReadByteArrayOutOfBounds() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        try {
            BZip2CompressorInputStream in = new BZip2CompressorInputStream(bais);
            byte[] dest = new byte[5];
            in.read(dest, 2, 5);
        } catch (IOException e) {
            throw new IndexOutOfBoundsException();
        }
    }
}
