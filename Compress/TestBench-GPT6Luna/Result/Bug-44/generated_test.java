package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;

public class ChecksumCalculatingInputStreamTest {
    @Test
    public void testReadUpdatesChecksumForSingleByte() throws Exception {
        Checksum checksum = new java.util.zip.CRC32();
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(checksum, new java.io.ByteArrayInputStream(new byte[] {65}));
        assertEquals(65, stream.read());
        java.util.zip.CRC32 expected = new java.util.zip.CRC32();
        expected.update(65);
        assertEquals(expected.getValue(), stream.getValue());
    }

    @Test
    public void testReadReturnsUnsignedByteAtMaximum() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {-1}));
        assertEquals(255, stream.read());
    }

    @Test
    public void testReadReturnsZeroByte() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {0}));
        assertEquals(0, stream.read());
    }

    @Test
    public void testReadReturnsEndOfStreamWithoutUpdating() throws Exception {
        Checksum checksum = new java.util.zip.CRC32();
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(checksum, new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, stream.read());
        assertEquals(0L, stream.getValue());
    }

    @Test
    public void testReadSequenceUpdatesChecksumInOrder() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {1, 2, 3}));
        assertEquals(1, stream.read());
        assertEquals(2, stream.read());
        assertEquals(3, stream.read());
        assertEquals(-1, stream.read());
        java.util.zip.CRC32 expected = new java.util.zip.CRC32();
        expected.update(new byte[] {1, 2, 3});
        assertEquals(expected.getValue(), stream.getValue());
    }

    @Test
    public void testSkipConsumesOneByteWhenRequestedZero() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {7, 8}));
        assertEquals(1L, stream.skip(0));
        assertEquals(8, stream.read());
    }

    @Test
    public void testSkipConsumesOnlyOneByteForLargeRequest() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {7, 8, 9}));
        assertEquals(1L, stream.skip(100));
        assertEquals(8, stream.read());
    }

    @Test
    public void testSkipConsumesOneByteForNegativeRequest() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {7, 8}));
        assertEquals(1L, stream.skip(-1));
        assertEquals(8, stream.read());
    }

    @Test
    public void testSkipUpdatesChecksumForConsumedByte() throws Exception {
        Checksum checksum = new java.util.zip.CRC32();
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(checksum, new java.io.ByteArrayInputStream(new byte[] {42, 43}));
        assertEquals(1L, stream.skip(1));
        java.util.zip.CRC32 expected = new java.util.zip.CRC32();
        expected.update(42);
        assertEquals(expected.getValue(), stream.getValue());
    }

    @Test
    public void testSkipAtEndReturnsZero() throws Exception {
        Checksum checksum = new java.util.zip.CRC32();
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(checksum, new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, stream.skip(1));
        assertEquals(0L, stream.getValue());
    }

    @Test
    public void testRepeatedSkipConsumesOneByteEachTime() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {10, 20, 30}));
        assertEquals(1L, stream.skip(3));
        assertEquals(1L, stream.skip(3));
        assertEquals(30, stream.read());
    }

    @Test
    public void testGetValueInitiallyZero() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {11}));
        assertEquals(0L, stream.getValue());
    }

    @Test
    public void testGetValueAfterRead() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {11}));
        stream.read();
        java.util.zip.CRC32 expected = new java.util.zip.CRC32();
        expected.update(11);
        assertEquals(expected.getValue(), stream.getValue());
    }

    @Test
    public void testGetValueDoesNotChangeAtEndOfStream() throws Exception {
        Checksum checksum = new java.util.zip.CRC32();
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(checksum, new java.io.ByteArrayInputStream(new byte[] {11}));
        stream.read();
        long value = stream.getValue();
        assertEquals(-1, stream.read());
        assertEquals(value, stream.getValue());
    }

    @Test
    public void testReadAllByteValuesAsUnsigned() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {-128, -1, 0, 127}));
        assertEquals(128, stream.read());
        assertEquals(255, stream.read());
        assertEquals(0, stream.read());
        assertEquals(127, stream.read());
    }

    @Test
    public void testSkipThenReadChecksumCoversBothBytes() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {5, 6}));
        assertEquals(1L, stream.skip(1));
        assertEquals(6, stream.read());
        java.util.zip.CRC32 expected = new java.util.zip.CRC32();
        expected.update(new byte[] {5, 6});
        assertEquals(expected.getValue(), stream.getValue());
    }

    @Test
    public void testMultipleEndReadsRemainAtEnd() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, stream.read());
        assertEquals(-1, stream.read());
    }

    @Test
    public void testSkipPastLastByteThenReadEnd() throws Exception {
        ChecksumCalculatingInputStream stream =
                new ChecksumCalculatingInputStream(new java.util.zip.CRC32(),
                        new java.io.ByteArrayInputStream(new byte[] {99}));
        assertEquals(1L, stream.skip(Long.MAX_VALUE));
        assertEquals(-1, stream.read());
    }
}
