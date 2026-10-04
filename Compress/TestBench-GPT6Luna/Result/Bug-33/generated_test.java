package org.apache.commons.compress.compressors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream;
import org.apache.commons.compress.compressors.lzma.LZMAUtils;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;
import org.apache.commons.compress.compressors.xz.XZUtils;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream;
import org.apache.commons.compress.compressors.z.ZCompressorInputStream;
import org.apache.commons.compress.utils.IOUtils;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;

public class CompressorStreamFactoryTest {
    @Test
    public void testDefaultConcatenationSetting() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void testSetConcatenatedTrue() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.setDecompressConcatenated(true);
        assertTrue(factory.getDecompressConcatenated());
    }

    @Test
    public void testSetConcatenatedFalse() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.setDecompressConcatenated(true);
        factory.setDecompressConcatenated(false);
        assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void testConstructorTrueLocksSetting() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        assertTrue(factory.getDecompressConcatenated());
        try {
            factory.setDecompressConcatenated(false);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
        assertTrue(factory.getDecompressConcatenated());
    }

    @Test
    public void testConstructorFalseLocksSetting() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory(false);
        assertFalse(factory.getDecompressConcatenated());
        try {
            factory.setDecompressConcatenated(true);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
        assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void testAutodetectNullStream() throws Exception {
        try {
            new CompressorStreamFactory().createCompressorInputStream((InputStream) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAutodetectRequiresMarkSupport() throws Exception {
        InputStream in = new InputStream() {
            public int read() { return -1; }
        };
        try {
            new CompressorStreamFactory().createCompressorInputStream(in);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAutodetectUnknownSignature() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[] { 1, 2, 3, 4 });
        try {
            new CompressorStreamFactory().createCompressorInputStream(in);
            fail("expected CompressorException");
        } catch (CompressorException expected) { }
    }

    @Test
    public void testInputNameOrStreamNull() throws Exception {
        try {
            new CompressorStreamFactory().createCompressorInputStream(null, new java.io.ByteArrayInputStream(new byte[0]));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testInputUnknownName() throws Exception {
        try {
            new CompressorStreamFactory().createCompressorInputStream("unknown", new java.io.ByteArrayInputStream(new byte[0]));
            fail("expected CompressorException");
        } catch (CompressorException expected) { }
    }

    @Test
    public void testInputDeflateNameCaseInsensitive() throws Exception {
        byte[] compressed = new byte[] { 120, -100, 3, 0, 0, 0, 0, 1 };
        CompressorInputStream in = new CompressorStreamFactory()
                .createCompressorInputStream("DEFLATE", new java.io.ByteArrayInputStream(compressed));
        assertEquals(-1, in.read());
    }

    @Test
    public void testOutputNullName() throws Exception {
        try {
            new CompressorStreamFactory().createCompressorOutputStream(null, new java.io.ByteArrayOutputStream());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testOutputNullStream() throws Exception {
        try {
            new CompressorStreamFactory().createCompressorOutputStream("deflate", null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testOutputUnknownName() throws Exception {
        try {
            new CompressorStreamFactory().createCompressorOutputStream("unknown", new java.io.ByteArrayOutputStream());
            fail("expected CompressorException");
        } catch (CompressorException expected) { }
    }

    @Test
    public void testOutputDeflateNameCaseInsensitive() throws Exception {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        CompressorOutputStream compressed = new CompressorStreamFactory()
                .createCompressorOutputStream("DEFLATE", out);
        compressed.close();
        assertTrue(out.size() > 0);
    }

    @Test
    public void testDeflateSignatureMinimumLengthRejected() throws Exception {
        assertFalse(DeflateCompressorInputStream.matches(new byte[] { 120, 1, 0, 0 }, 3));
    }

    @Test
    public void testDeflateSignatureLengthFourAccepted() throws Exception {
        assertTrue(DeflateCompressorInputStream.matches(new byte[] { 120, 1, 0, 0 }, 4));
    }

    @Test
    public void testDeflateSignatureAllRecognizedSecondBytes() throws Exception {
        assertTrue(DeflateCompressorInputStream.matches(new byte[] { 120, 1, 0, 0 }, 4));
        assertTrue(DeflateCompressorInputStream.matches(new byte[] { 120, 94, 0, 0 }, 4));
        assertTrue(DeflateCompressorInputStream.matches(new byte[] { 120, -100, 0, 0 }, 4));
        assertTrue(DeflateCompressorInputStream.matches(new byte[] { 120, -38, 0, 0 }, 4));
    }

    @Test
    public void testDeflateSignatureWrongFirstByteRejected() throws Exception {
        assertFalse(DeflateCompressorInputStream.matches(new byte[] { 121, 1, 0, 0 }, 4));
    }

    @Test
    public void testDeflateSignatureWrongSecondByteRejected() throws Exception {
        assertFalse(DeflateCompressorInputStream.matches(new byte[] { 120, 2, 0, 0 }, 4));
    }
}
