package org.apache.commons.compress.compressors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

public class CompressorStreamFactoryAI33Test {

    @Test
    public void testDefaultConstructor() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        Assert.assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void testBooleanConstructorTrue() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        Assert.assertTrue(factory.getDecompressConcatenated());
    }

    @Test
    public void testBooleanConstructorFalse() {
        CompressorStreamFactory factory = new CompressorStreamFactory(false);
        Assert.assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void testSetDecompressConcatenatedValid() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.setDecompressConcatenated(true);
        Assert.assertTrue(factory.getDecompressConcatenated());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetDecompressConcatenatedInvalid() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        factory.setDecompressConcatenated(false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamNullStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamNoMark() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream noMarkStream = new InputStream() {
            @Override
            public int read() {
                return -1;
            }
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        factory.createCompressorInputStream(noMarkStream);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamWithNameNullName() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        factory.createCompressorInputStream(null, in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorOutputStreamNullStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        factory.createCompressorOutputStream(null, out);
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamUnknownName() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[10]);
        factory.createCompressorInputStream("unknown-compressor", in);
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorOutputStreamUnknownName() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        factory.createCompressorOutputStream("unknown-compressor", out);
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamAutoDetectUnknown() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        // A stream with random bytes that do not match any compressor signature
        byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C };
        java.io.BufferedInputStream bis = new java.io.BufferedInputStream(new ByteArrayInputStream(data));
        factory.createCompressorInputStream(bis);
    }
}
