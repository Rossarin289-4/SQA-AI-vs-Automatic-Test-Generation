package org.apache.commons.compress.compressors.deflate;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import org.junit.Assert;
import org.junit.Test;

public class DeflateCompressorInputStreamAI33Test {

    private byte[] compressData(byte[] input, boolean zlibHeader) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, !zlibHeader);
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(out, deflater);
        deflaterOutputStream.write(input);
        deflaterOutputStream.close();
        return out.toByteArray();
    }

    @Test
    public void testMatchesValidSignatures() {
        byte[][] validSignatures = {
            { (byte) 0x78, (byte) 0x01, 0x00, 0x00 },
            { (byte) 0x78, (byte) 0x5e, 0x00, 0x00 },
            { (byte) 0x78, (byte) 0x9c, 0x00, 0x00 },
            { (byte) 0x78, (byte) 0xda, 0x00, 0x00 }
        };

        for (byte[] sig : validSignatures) {
            Assert.assertTrue(DeflateCompressorInputStream.matches(sig, sig.length));
        }
    }

    @Test
    public void testMatchesInvalidSignatures() {
        byte[][] invalidSignatures = {
            { (byte) 0x79, (byte) 0x01, 0x00, 0x00 }, // wrong magic 1
            { (byte) 0x78, (byte) 0x02, 0x00, 0x00 }, // wrong magic 2
            { (byte) 0x78, (byte) 0x01, 0x00 },       // length too short (3)
            { (byte) 0x78, (byte) 0x01 }               // length too short (2)
        };

        for (byte[] sig : invalidSignatures) {
            Assert.assertFalse(DeflateCompressorInputStream.matches(sig, sig.length));
        }
    }

    @Test
    public void testMatchesNullAndEmpty() {
        Assert.assertFalse(DeflateCompressorInputStream.matches(null, 0));
        Assert.assertFalse(DeflateCompressorInputStream.matches(new byte[0], 0));
    }

    @Test
    public void testReadSingleByteWithZlibHeader() throws IOException {
        byte[] original = "Hello, World!".getBytes("UTF-8");
        byte[] compressed = compressData(original, true);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
            new ByteArrayInputStream(compressed)
        );

        int firstByte = in.read();
        Assert.assertEquals(original[0], (byte) firstByte);
        Assert.assertEquals(1L, in.getBytesRead());
        in.close();
    }

    @Test
    public void testReadBufferWithZlibHeader() throws IOException {
        byte[] original = "Deflate Compression Test Data".getBytes("UTF-8");
        byte[] compressed = compressData(original, true);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
            new ByteArrayInputStream(compressed)
        );

        byte[] buf = new byte[original.length];
        int readBytes = in.read(buf, 0, buf.length);

        Assert.assertEquals(original.length, readBytes);
        Assert.assertArrayEquals(original, buf);
        Assert.assertEquals((long) original.length, in.getBytesRead());
        in.close();
    }

    @Test
    public void testReadWithoutZlibHeader() throws IOException {
        byte[] original = "Raw Deflate Test Data".getBytes("UTF-8");
        byte[] compressed = compressData(original, false);

        DeflateParameters params = new DeflateParameters();
        params.setWithZlibHeader(false);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
            new ByteArrayInputStream(compressed), params
        );

        byte[] buf = new byte[original.length];
        int readBytes = in.read(buf, 0, buf.length);

        Assert.assertEquals(original.length, readBytes);
        Assert.assertArrayEquals(original, buf);
        in.close();
    }

    @Test
    public void testSkip() throws IOException {
        byte[] original = "1234567890".getBytes("UTF-8");
        byte[] compressed = compressData(original, true);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
            new ByteArrayInputStream(compressed)
        );

        long skipped = in.skip(2);
        Assert.assertTrue(skipped >= 0);

        int nextByte = in.read();
        Assert.assertNotEquals(-1, nextByte);
        in.close();
    }

    @Test
    public void testAvailable() throws IOException {
        byte[] original = "Test Available".getBytes("UTF-8");
        byte[] compressed = compressData(original, true);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
            new ByteArrayInputStream(compressed)
        );

        int available = in.available();
        Assert.assertTrue(available >= 0);
        in.close();
    }

    @Test(expected = IOException.class)
    public void testReadThrowsExceptionOnClosedStream() throws IOException {
        byte[] original = "Exception Test".getBytes("UTF-8");
        byte[] compressed = compressData(original, true);

        DeflateCompressorInputStream in = new DeflateCompressorInputStream(
            new ByteArrayInputStream(compressed)
        );
        in.close();
        in.read();
    }
}
