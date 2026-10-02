package org.apache.commons.compress.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class ChecksumCalculatingInputStreamAI44Test {

    @Test(expected = NullPointerException.class)
    public void testConstructorNullChecksum() {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        new ChecksumCalculatingInputStream(null, in);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullInputStream() {
        Checksum checksum = new CRC32();
        new ChecksumCalculatingInputStream(checksum, null);
    }

    @Test
    public void testReadSingleByte() throws IOException {
        byte[] data = new byte[] { 1, 2, 3 };
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(data));

        Assert.assertEquals(1, cis.read());
        Assert.assertEquals(2, cis.read());
        Assert.assertEquals(3, cis.read());
        Assert.assertEquals(-1, cis.read());

        checksum.update(data, 0, 3);
        Assert.assertEquals(checksum.getValue(), cis.getValue());
    }

    @Test
    public void testReadByteArray() throws IOException {
        byte[] data = new byte[] { 10, 20, 30, 40, 50 };
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(data));

        byte[] buf = new byte[3];
        int read = cis.read(buf);
        Assert.assertEquals(3, read);
        Assert.assertArrayEquals(new byte[] { 10, 20, 30 }, buf);

        read = cis.read(buf);
        Assert.assertEquals(2, read);
        Assert.assertEquals(40, buf[0]);
        Assert.assertEquals(50, buf[1]);

        Assert.assertEquals(-1, cis.read(buf));
    }

    @Test
    public void testReadByteArrayWithOffsetAndLength() throws IOException {
        byte[] data = new byte[] { 5, 6, 7, 8 };
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(data));

        byte[] buf = new byte[6];
        int read = cis.read(buf, 1, 3);
        Assert.assertEquals(3, read);
        Assert.assertEquals(0, buf[0]);
        Assert.assertEquals(5, buf[1]);
        Assert.assertEquals(6, buf[2]);
        Assert.assertEquals(7, buf[3]);

        checksum.update(data, 0, 3);
        Assert.assertEquals(checksum.getValue(), cis.getValue());
    }

    @Test
    public void testSkip() throws IOException {
        byte[] data = new byte[] { 9, 9, 9 };
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(data));

        long skipped = cis.skip(5);
        Assert.assertEquals(1, skipped);

        skipped = cis.skip(5);
        Assert.assertEquals(1, skipped);

        skipped = cis.skip(5);
        Assert.assertEquals(1, skipped);

        skipped = cis.skip(5);
        Assert.assertEquals(0, skipped);

        checksum.update(new byte[] { 9, 9, 9 }, 0, 3);
        Assert.assertEquals(checksum.getValue(), cis.getValue());
    }

    @Test
    public void testGetValueInitial() {
        Checksum checksum = new CRC32();
        ChecksumCalculatingInputStream cis = new ChecksumCalculatingInputStream(checksum, new ByteArrayInputStream(new byte[0]));
        Assert.assertEquals(0L, cis.getValue());
    }
}
