package org.apache.commons.compress.archivers.sevenz;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CodersAI23Test {

    @Test
    public void testCopyDecoderEncode() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        OutputStream encoded = Coders.addEncoder(out, SevenZMethod.COPY, null);
        Assert.assertNotNull(encoded);
    }

    @Test
    public void testCopyDecoderDecode() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.COPY.getId();
        InputStream decoded = Coders.addDecoder(in, coder, null);
        Assert.assertNotNull(decoded);
        Assert.assertEquals(1, decoded.read());
    }

    @Test
    public void testDeflateDecoderEncode() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        OutputStream encoded = Coders.addEncoder(out, SevenZMethod.DEFLATE, null);
        Assert.assertNotNull(encoded);
    }

    @Test
    public void testDeflateDecoderDecode() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.DEFLATE.getId();
        InputStream decoded = Coders.addDecoder(in, coder, null);
        Assert.assertNotNull(decoded);
    }

    @Test
    public void testBzip2DecoderEncode() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        OutputStream encoded = Coders.addEncoder(out, SevenZMethod.BZIP2, null);
        Assert.assertNotNull(encoded);
    }

    @Test(expected = IOException.class)
    public void testBzip2DecoderDecodeInvalidStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.BZIP2.getId();
        InputStream decoded = Coders.addDecoder(in, coder, null);
        Assert.assertNotNull(decoded);
        decoded.read();
    }

    @Test(expected = IOException.class)
    public void testUnsupportedDecoder() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Coder coder = new Coder();
        coder.decompressionMethodId = new byte[] { (byte) 0xFF, (byte) 0xEE };
        Coders.addDecoder(in, coder, null);
    }

    @Test(expected = IOException.class)
    public void testUnsupportedEncoder() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        Coders.addEncoder(out, null, null);
    }

    @Test(expected = IOException.class)
    public void testLzmaDecoderDictionaryTooLarge() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[10]);
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = new byte[] { 0, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0x10 };
        Coders.addDecoder(in, coder, null);
    }

    @Test(expected = IOException.class)
    public void testAES256DecoderMissingPassword() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[16]);
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[] { 0x01, 0x01, 0, 0 };
        InputStream decoded = Coders.addDecoder(in, coder, null);
        decoded.read();
    }
}
