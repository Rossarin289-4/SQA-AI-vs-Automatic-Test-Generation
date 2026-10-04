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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class CompressorStreamFactoryTest {

    // Test constructors and default decompressConcatenated setting
    @Test
    public void testDefaultConstructor() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void testBooleanConstructorTrue() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        assertTrue(factory.getDecompressConcatenated());
    }

    @Test
    public void testBooleanConstructorFalse() {
        CompressorStreamFactory factory = new CompressorStreamFactory(false);
        assertFalse(factory.getDecompressConcatenated());
    }

    // Test setDecompressConcatenated method
    @Test
    public void testSetDecompressConcatenated() throws IOException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.setDecompressConcatenated(true);
        assertTrue(factory.getDecompressConcatenated());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetDecompressConcatenatedWhenConstructorUsed() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        factory.setDecompressConcatenated(false); // Should throw IllegalStateException
    }

    // Tests for createCompressorInputStream(InputStream in) - Autodetection
    @Test
    public void testAutodetectBzip2() throws IOException, CompressorException {
        byte[] data = "This is a test string for BZip2 compression.".getBytes();
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = new BZip2CompressorOutputStream(baos);
        cos.write(data);
        cos.close();

        InputStream bais = new ByteArrayInputStream(((ByteArrayOutputStream) baos).toByteArray());
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(bais);
        assertTrue(cis instanceof BZip2CompressorInputStream);
        cis.close();
    }

    @Test
    public void testAutodetectGzip() throws IOException, CompressorException {
        byte[] data = "This is a test string for GZip compression.".getBytes();
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = new GzipCompressorOutputStream(baos);
        cos.write(data);
        cos.close();

        InputStream bais = new ByteArrayInputStream(((ByteArrayOutputStream) baos).toByteArray());
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(bais);
        assertTrue(cis instanceof GzipCompressorInputStream);
        cis.close();
    }
    
    @Test
    public void testAutodetectDeflate() throws IOException, CompressorException {
        // Deflate signature starts with 0x78
        byte[] data = { (byte) 0x78, (byte) 0x9c, (byte) 0xc3, (byte) 0x00, (byte) 0x06, (byte) 0x00 }; // Simple deflate stream
        InputStream bais = new ByteArrayInputStream(data);
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(bais);
        assertTrue(cis instanceof DeflateCompressorInputStream);
        cis.close();
    }

    @Test
    public void testAutodetectPack200() throws IOException, CompressorException {
        // Pack200 signature is 0xCAFED00D
        byte[] data = { (byte) 0xCA, (byte) 0xFE, (byte) 0xD0, (byte) 0x0D, (byte) 0x00, (byte) 0x00 };
        InputStream bais = new ByteArrayInputStream(data);
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(bais);
        assertTrue(cis instanceof Pack200CompressorInputStream);
        cis.close();
    }

    @Test
    public void testAutodetectFramedSnappy() throws IOException, CompressorException {
        // Framed Snappy signature starts with 0xFF, 0x06, 0x00, 0x00, 0x73, 0x4E, 0x61, 0x50, 0x70, 0x79, 0x01, 0x00
        // Minimal valid framed snappy stream, uncompressed empty stream
        byte[] data = {(byte)0xff, (byte)0x06, (byte)0x00, (byte)0x00, (byte)0x73, (byte)0x4E, (byte)0x61, (byte)0x50, (byte)0x70, (byte)0x79, (byte)0x01, (byte)0x00};
        InputStream bais = new ByteArrayInputStream(data);
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(bais);
        assertTrue(cis instanceof FramedSnappyCompressorInputStream);
        cis.close();
    }

    @Test
    public void testAutodetectZ() throws IOException, CompressorException {
        // Z signature: 0x1f, 0x9d
        byte[] data = {(byte)0x1f, (byte)0x9d, (byte)0x00};
        InputStream bais = new ByteArrayInputStream(data);
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(bais);
        assertTrue(cis instanceof ZCompressorInputStream);
        cis.close();
    }
    
    // Tests for createCompressorInputStream(String name, InputStream in)
    @Test
    public void testCreateBzip2ByName() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[10]); // Dummy data
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.BZIP2, bais);
        assertTrue(cis instanceof BZip2CompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateGzipByName() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[10]); // Dummy data
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.GZIP, bais);
        assertTrue(cis instanceof GzipCompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateDeflateByName() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[10]); // Dummy data
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.DEFLATE, bais);
        assertTrue(cis instanceof DeflateCompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreatePack200ByName() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[10]); // Dummy data
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.PACK200, bais);
        assertTrue(cis instanceof Pack200CompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateLZMAName() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[10]); // Dummy data
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.LZMA, bais);
        assertTrue(cis instanceof LZMACompressorInputStream);
        cis.close();
    }
    
    @Test
    public void testCreateSnappyFramedByName() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[10]); // Dummy data
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.SNAPPY_FRAMED, bais);
        assertTrue(cis instanceof FramedSnappyCompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateSnappyRawByName() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[10]); // Dummy data
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.SNAPPY_RAW, bais);
        assertTrue(cis instanceof SnappyCompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateZByName() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[10]); // Dummy data
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.Z, bais);
        assertTrue(cis instanceof ZCompressorInputStream);
        cis.close();
    }

    @Test
    public void testCreateXZByName() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[10]); // Dummy data
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.XZ, bais);
        assertTrue(cis instanceof XZCompressorInputStream);
        cis.close();
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorInputStreamUnknownName() throws CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream bais = new ByteArrayInputStream(new byte[10]);
        factory.createCompressorInputStream("unknown", bais);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamNullName() throws CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream bais = new ByteArrayInputStream(new byte[10]);
        factory.createCompressorInputStream(null, bais);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorInputStreamNullStream() throws CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(CompressorStreamFactory.GZIP, null);
    }

    // Tests for createCompressorOutputStream(String name, OutputStream out)
    @Test
    public void testCreateBzip2OutputStream() throws IOException, CompressorException {
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.BZIP2, baos);
        assertTrue(cos instanceof BZip2CompressorOutputStream);
        cos.close();
    }

    @Test
    public void testCreateGzipOutputStream() throws IOException, CompressorException {
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.GZIP, baos);
        assertTrue(cos instanceof GzipCompressorOutputStream);
        cos.close();
    }

    @Test
    public void testCreateDeflateOutputStream() throws IOException, CompressorException {
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.DEFLATE, baos);
        assertTrue(cos instanceof DeflateCompressorOutputStream);
        cos.close();
    }

    @Test
    public void testCreatePack200OutputStream() throws IOException, CompressorException {
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.PACK200, baos);
        assertTrue(cos instanceof Pack200CompressorOutputStream);
        cos.close();
    }

    @Test
    public void testCreateXZOutputStream() throws IOException, CompressorException {
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.XZ, baos);
        assertTrue(cos instanceof XZCompressorOutputStream);
        cos.close();
    }

    @Test(expected = CompressorException.class)
    public void testCreateCompressorOutputStreamUnknownName() throws CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream baos = new ByteArrayOutputStream();
        factory.createCompressorOutputStream("unknown", baos);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorOutputStreamNullName() throws CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream baos = new ByteArrayOutputStream();
        factory.createCompressorOutputStream(null, baos);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCompressorOutputStreamNullStream() throws CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream(CompressorStreamFactory.GZIP, null);
    }

    // Edge case tests for autodetection with empty or short streams
    @Test(expected = CompressorException.class)
    public void testAutodetectEmptyStream() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[0]);
        new CompressorStreamFactory().createCompressorInputStream(bais);
    }

    @Test(expected = CompressorException.class)
    public void testAutodetectShortStream() throws IOException, CompressorException {
        InputStream bais = new ByteArrayInputStream(new byte[]{0x78}); // Too short for deflate signature
        new CompressorStreamFactory().createCompressorInputStream(bais);
    }

    // Test with decompressUntilEOF set to true
    @Test
    public void testAutodetectGzipWithDecompressUntilEOFTrue() throws IOException, CompressorException {
        // Minimal GZIP stream (empty, without closing gzip trailer)
        byte[] data = {(byte)0x1f, (byte)0x8b, (byte)0x08, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0xff};
        InputStream bais = new ByteArrayInputStream(data);
        CompressorInputStream cis = new CompressorStreamFactory(true).createCompressorInputStream(bais);
        assertTrue(cis instanceof GzipCompressorInputStream);
        cis.close();
    }

    // Test with decompressUntilEOF set to false
    @Test
    public void testAutodetectGzipWithDecompressUntilEOFFalse() throws IOException, CompressorException {
        // Minimal GZIP stream (empty, without closing gzip trailer)
        byte[] data = {(byte)0x1f, (byte)0x8b, (byte)0x08, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0xff};
        InputStream bais = new ByteArrayInputStream(data);
        CompressorInputStream cis = new CompressorStreamFactory(false).createCompressorInputStream(bais);
        assertTrue(cis instanceof GzipCompressorInputStream);
        cis.close();
    }

    @Test
    public void testAutodetectBzip2WithDecompressUntilEOFTrue() throws IOException, CompressorException {
        // Minimal BZIP2 stream (empty)
        byte[] bzip2Signature = new byte[]{'B', 'Z', 'h', 'i', '1', 'A', 'Y', '&', 'S', 'Y'}; // Corrected BZIP2 signature bytes

        InputStream bais = new ByteArrayInputStream(bzip2Signature);
        CompressorInputStream cis = new CompressorStreamFactory(true).createCompressorInputStream(bais);
        assertTrue(cis instanceof BZip2CompressorInputStream);
        cis.close();
    }
    
    @Test
    public void testAutodetectXZWithDecompressUntilEOFTrue() throws IOException, CompressorException {
        // Minimal XZ stream (empty)
        byte[] data = {(byte)0xfd, (byte)0x37, (byte)0x7a, (byte)0x58, (byte)0x5a, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x02, (byte)0x00};
        InputStream bais = new ByteArrayInputStream(data);
        CompressorInputStream cis = new CompressorStreamFactory(true).createCompressorInputStream(bais);
        assertTrue(cis instanceof XZCompressorInputStream);
        cis.close();
    }

    // Tests for methods not covered by the previous set
    @Test
    public void testCreateCompressorInputStreamWithMarkUnsupported() throws IOException, CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        InputStream nonMarkingStream = new ByteArrayInputStream(new byte[10]);
        // Ensure the stream does not support marks
        assertFalse(nonMarkingStream.markSupported());
        try {
            factory.createCompressorInputStream(nonMarkingStream);
            fail("Expected IllegalArgumentException for non-marking stream");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithNullStream() throws CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        try {
            factory.createCompressorInputStream((InputStream) null);
            fail("Expected IllegalArgumentException for null stream");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testDeflateCompressorInputStreamRead() throws IOException, CompressorException {
        // Create a DeflateCompressorInputStream indirectly
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = factory.createCompressorOutputStream(CompressorStreamFactory.DEFLATE, baos);
        byte[] data = "test".getBytes();
        cos.write(data);
        cos.close();

        InputStream compressedIs = new ByteArrayInputStream(((ByteArrayOutputStream) baos).toByteArray());
        DeflateCompressorInputStream cis = (DeflateCompressorInputStream) factory.createCompressorInputStream(CompressorStreamFactory.DEFLATE, compressedIs);
        int byteRead = cis.read();
        assertEquals('t', byteRead);
        cis.close();
    }

    @Test
    public void testDeflateCompressorInputStreamReadWithBuffer() throws IOException, CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = factory.createCompressorOutputStream(CompressorStreamFactory.DEFLATE, baos);
        byte[] data = "test data".getBytes();
        cos.write(data);
        cos.close();

        InputStream compressedIs = new ByteArrayInputStream(((ByteArrayOutputStream) baos).toByteArray());
        DeflateCompressorInputStream cis = (DeflateCompressorInputStream) factory.createCompressorInputStream(CompressorStreamFactory.DEFLATE, compressedIs);
        byte[] buffer = new byte[10];
        int bytesRead = cis.read(buffer, 0, buffer.length);
        assertEquals(data.length, bytesRead);
        assertArrayEquals(data, buffer);
        cis.close();
    }

    @Test
    public void testDeflateCompressorInputStreamSkip() throws IOException, CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = factory.createCompressorOutputStream(CompressorStreamFactory.DEFLATE, baos);
        byte[] data = "test data for skip".getBytes();
        cos.write(data);
        cos.close();

        InputStream compressedIs = new ByteArrayInputStream(((ByteArrayOutputStream) baos).toByteArray());
        DeflateCompressorInputStream cis = (DeflateCompressorInputStream) factory.createCompressorInputStream(CompressorStreamFactory.DEFLATE, compressedIs);
        long skipped = cis.skip(5);
        assertEquals(5, skipped);
        int byteRead = cis.read();
        assertEquals(' ', byteRead); // After skipping 5 bytes ('t', 'e', 's', 't', ' ')
        cis.close();
    }
    
    @Test
    public void testDeflateCompressorInputStreamAvailable() throws IOException, CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = factory.createCompressorOutputStream(CompressorStreamFactory.DEFLATE, baos);
        byte[] data = "available test".getBytes();
        cos.write(data);
        cos.close();

        InputStream compressedIs = new ByteArrayInputStream(((ByteArrayOutputStream) baos).toByteArray());
        DeflateCompressorInputStream cis = (DeflateCompressorInputStream) factory.createCompressorInputStream(CompressorStreamFactory.DEFLATE, compressedIs);
        // Available() is tricky with compression, we can only assert it's non-zero if there's data
        assertTrue(cis.available() > 0); 
        cis.close();
    }

    @Test
    public void testDeflateCompressorInputStreamClose() throws IOException, CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        OutputStream baos = new ByteArrayOutputStream();
        CompressorOutputStream cos = factory.createCompressorOutputStream(CompressorStreamFactory.DEFLATE, baos);
        byte[] data = "close test".getBytes();
        cos.write(data);
        cos.close();

        InputStream compressedIs = new ByteArrayInputStream(((ByteArrayOutputStream) baos).toByteArray());
        DeflateCompressorInputStream cis = (DeflateCompressorInputStream) factory.createCompressorInputStream(CompressorStreamFactory.DEFLATE, compressedIs);
        cis.close(); // Should not throw an exception
        // Attempting to read after close should result in -1
        assertEquals(-1, cis.read());
    }

    @Test
    public void testDeflateCompressorMatches() {
        // Signature for DeflateCompressorInputStream starts with 0x78
        assertTrue(DeflateCompressorInputStream.matches(new byte[]{(byte)0x78, (byte)0x9c}, 2));
        assertTrue(DeflateCompressorInputStream.matches(new byte[]{(byte)0x78, (byte)0x01}, 2));
        assertTrue(DeflateCompressorInputStream.matches(new byte[]{(byte)0x78, (byte)0x5e}, 2));
        assertTrue(DeflateCompressorInputStream.matches(new byte[]{(byte)0x78, (byte)0xda}, 2));
        assertFalse(DeflateCompressorInputStream.matches(new byte[]{(byte)0x1f, (byte)0x8b}, 2)); // GZIP
        assertFalse(DeflateCompressorInputStream.matches(new byte[]{'B', 'Z'}, 2)); // BZIP2
        assertFalse(DeflateCompressorInputStream.matches(new byte[]{(byte)0xCA, (byte)0xFE}, 2)); // Pack200
    }
    
    @Test
    public void testDeflateCompressorMatchesShortSignature() {
        assertFalse(DeflateCompressorInputStream.matches(new byte[]{(byte)0x78}, 1));
        assertFalse(DeflateCompressorInputStream.matches(new byte[]{}, 0));
    }

    @Test
    public void testCreateCompressorInputStreamAutodetectNoMatch() throws IOException, CompressorException {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        // A signature that does not match any known compressor
        byte[] unknownSignature = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x10, 0x11, 0x12};
        InputStream bais = new ByteArrayInputStream(unknownSignature);
        try {
            factory.createCompressorInputStream(bais);
            fail("Expected CompressorException for unknown signature");
        } catch (CompressorException e) {
            // Expected exception
            assertEquals("No Compressor found for the stream signature.", e.getMessage());
        }
    }

    @Test
    public void testCreateCompressorInputStreamAutodetectWithCorrectSignatureLength() throws IOException, CompressorException {
        // Test with a signature that is exactly 12 bytes long for a known type, like GZIP
        byte[] gzipSignature = {(byte)0x1f, (byte)0x8b, (byte)0x08, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0xff, (byte)0x01, (byte)0x00};
        InputStream bais = new ByteArrayInputStream(gzipSignature);
        CompressorInputStream cis = new CompressorStreamFactory().createCompressorInputStream(bais);
        assertTrue(cis instanceof GzipCompressorInputStream);
        cis.close();
    }
}
