package org.apache.commons.compress.compressors;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class CompressorStreamFactoryAI33Test {

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamNullName() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        new CompressorStreamFactory().createCompressorInputStream(null, in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorOutputStreamNullStream() throws Exception {
        new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.GZIP, null);
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamUnknownName() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        new CompressorStreamFactory().createCompressorInputStream("unknown-compressor", in);
    }
}
