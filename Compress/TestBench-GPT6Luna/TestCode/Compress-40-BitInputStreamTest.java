package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class BitInputStreamTest {
    @Test
    public void testReadZeroBitsFromEmptyStream() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[0]), ByteOrder.BIG_ENDIAN);
        assertEquals(0L, bits.readBits(0));
    }

    @Test
    public void testReadOneBigEndianByte() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {(byte) 0xA5}), ByteOrder.BIG_ENDIAN);
        assertEquals(0xA5L, bits.readBits(8));
    }

    @Test
    public void testReadOneLittleEndianByte() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {(byte) 0xA5}), ByteOrder.LITTLE_ENDIAN);
        assertEquals(0xA5L, bits.readBits(8));
    }

    @Test
    public void testBigEndianAcrossByteBoundary() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {(byte) 0xAB, (byte) 0xCD}), ByteOrder.BIG_ENDIAN);
        assertEquals(0xABCL, bits.readBits(12));
    }

    @Test
    public void testLittleEndianAcrossByteBoundary() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {(byte) 0xAB, (byte) 0xCD}), ByteOrder.LITTLE_ENDIAN);
        assertEquals(0xDABL, bits.readBits(12));
    }

    @Test
    public void testReadRemainingBitsBigEndian() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {(byte) 0xAB, (byte) 0xCD}), ByteOrder.BIG_ENDIAN);
        assertEquals(0xABL, bits.readBits(8));
        assertEquals(0xCL, bits.readBits(4));
    }

    @Test
    public void testReadRemainingBitsLittleEndian() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {(byte) 0xAB, (byte) 0xCD}), ByteOrder.LITTLE_ENDIAN);
        assertEquals(0xABL, bits.readBits(8));
        assertEquals(0xDL, bits.readBits(4));
    }

    @Test
    public void testEndOfStreamBeforeRequestedBits() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {(byte) 0xAB}), ByteOrder.BIG_ENDIAN);
        assertEquals(-1L, bits.readBits(9));
    }

    @Test
    public void testReadAvailableBitsThenEndOfStream() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {(byte) 0xAB}), ByteOrder.LITTLE_ENDIAN);
        assertEquals(0xABL, bits.readBits(8));
        assertEquals(-1L, bits.readBits(1));
    }

    @Test
    public void testCountNegativeThrows() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[0]), ByteOrder.BIG_ENDIAN);
        try { bits.readBits(-1); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCountAboveMaximumThrows() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[0]), ByteOrder.BIG_ENDIAN);
        try { bits.readBits(64); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testMaximumCountBigEndian() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF
        }), ByteOrder.BIG_ENDIAN);
        assertEquals(0x7FFFFFFFFFFFFFFFL, bits.readBits(63));
    }

    @Test
    public void testMaximumCountLittleEndian() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF
        }), ByteOrder.LITTLE_ENDIAN);
        assertEquals(0x7FFFFFFFFFFFFFFFL, bits.readBits(63));
    }

    @Test
    public void testClearCacheDiscardsBufferedBits() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {(byte) 0xAB, (byte) 0xCD}), ByteOrder.BIG_ENDIAN);
        assertEquals(0xABL, bits.readBits(8));
        bits.clearBitCache();
        assertEquals(0xCDL, bits.readBits(8));
    }

    @Test
    public void testClearCacheResetsLittleEndianBuffer() throws Exception {
        BitInputStream bits = new BitInputStream(new java.io.ByteArrayInputStream(new byte[] {(byte) 0xAB, (byte) 0xCD}), ByteOrder.LITTLE_ENDIAN);
        assertEquals(0xABL, bits.readBits(8));
        bits.clearBitCache();
        assertEquals(0xCDL, bits.readBits(8));
    }

    @Test
    public void testCloseClosesUnderlyingStream() throws Exception {
        final boolean[] closed = {false};
        InputStream input = new InputStream() {
            @Override
            public int read() {
                return -1;
            }
            @Override
            public void close() {
                closed[0] = true;
            }
        };
        BitInputStream bits = new BitInputStream(input, ByteOrder.BIG_ENDIAN);
        bits.close();
        assertTrue(closed[0]);
    }
}
