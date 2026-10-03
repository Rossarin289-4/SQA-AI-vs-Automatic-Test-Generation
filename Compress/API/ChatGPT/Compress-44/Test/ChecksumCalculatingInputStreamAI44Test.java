package org.apache.commons.compress.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

import org.junit.Test;

public class ChecksumCalculatingInputStreamAI44Test {

    @Test
    public void testReadSingleByte() throws IOException {
        final byte[] data = new byte[] { 65, 66, 67 };
        final Checksum checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(
                checksum, new ByteArrayInputStream(data));

        assertEquals(65, stream.read());
        assertEquals(66, stream.read());
        assertEquals(67, stream.read());
        assertEquals(-1, stream.read());
    }

    @Test
    public void testReadByteArray() throws IOException {
        final byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        final Checksum checksum = new CRC32();
        final ChecksumCalculatingInputStream stream = new ChecksumCalculatingInputStream(
                checksum, new ByteArrayInputStream(data));

        final byte[] buf = new byte[5];
        final int read = stream.read(buf, 0, 5);
        assertEquals(5, read);
        assertEquals(1, buf[0]);
        assertEquals(5, buf[4]);
        
        checksum.update(data, 0, 5);
        assertEquals(checksum.getValue(), stream.getValue());
    }

    @Test
    public void testNullParameters() {
        final Checksum checksum = new CRC32();
        final ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);

        try {
            new ChecksumCalculatingInputStream(null, in);
            fail("Expected NullPointerException for null checksum");
        } catch (NullPointerException e) {
            // expected
        }

        try {
            new ChecksumCalculatingInputStream(checksum, null);
            fail("Expected NullPointerException for null stream");
        } catch (NullPointerException e) {
            // expected
        }
    }
}
