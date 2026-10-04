package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class BitInputStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testReadBitsLittleEndianSimple() throws Exception {
        byte[] data = {(byte) 0b00000011, (byte) 0b11100000}; // 3, 224
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN)) {
            assertEquals(3L, bis.readBits(8));
            assertEquals(224L, bis.readBits(8));
        }
    }

    @Test
    public void testReadBitsBigEndianSimple() throws Exception {
        byte[] data = {(byte) 0b00000011, (byte) 0b11100000}; // 3, 224
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            assertEquals(0L, bis.readBits(5)); // 00000
            assertEquals(3L, bis.readBits(3)); // 011
            assertEquals(0b11100000L, bis.readBits(8)); // 11100000
        }
    }

    @Test
    public void testReadBitsLittleEndianAcrossByte() throws Exception {
        byte[] data = {(byte) 0b11000000, (byte) 0b00110000}; // 192, 48
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN)) {
            // Reads the last 2 bits of the first byte (11) and the first 6 of the second byte (001100)
            // Expected: 11 concatenated with 001100 -> 11001100 = 204
            assertEquals(0b11001100L, bis.readBits(8));
        }
    }
    
    @Test
    public void testReadBitsBigEndianAcrossByte() throws Exception {
        byte[] data = {(byte) 0b11000000, (byte) 0b00110000}; // 192, 48
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            // Reads first 8 bits from first byte, next 2 bits from second byte.
            // 11000000 | 00110000 -> 11000000 00110000
            // First 10 bits: 1100000011
            assertEquals(0b1100000011L, bis.readBits(10));
        }
    }

    @Test
    public void testReadBitsLittleEndianPartialByte() throws Exception {
        byte[] data = {(byte) 0b11000000}; // 192
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN)) {
            // Reads the 2 bits (11) from the byte. bitsCachedSize = 2. bitsCached = 0b11.
            // Remaining bits in cache: 0b11. Need 16 bits.
            // The code reads a new byte. Since there's no more data, it gets -1.
            // bitsCachedSize is less than count, and next read is -1.
            // The method should return -1.
            assertEquals(-1L, bis.readBits(16)); 
        }
    }

    @Test
    public void testReadBitsBigEndianPartialByte() throws Exception {
        byte[] data = {(byte) 0b11000000}; // 192
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            assertEquals(0b11000000L, bis.readBits(8));
            assertEquals(-1L, bis.readBits(1)); // End of stream
        }
    }
    
    @Test
    public void testReadBitsLittleEndianOverflow() throws Exception {
        byte[] data = {(byte) 0b11111111, (byte) 0b00000011}; // 255, 3
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN)) {
            assertEquals(255L, bis.readBits(8)); // Reads first byte
            // Now bitsCachedSize = 0. Need 2 bits.
            // Read second byte (0b00000011).
            // bitsCached |= (nextByte << bitsCachedSize) -> 0 | (0b00000011 << 0) = 0b00000011
            // bitsCachedSize += 8 -> 8.
            // Now extract 2 bits: bitsOut = (bitsCached & MASKS[2]) = 0b00000011 & 0b11 = 0b11 = 3L.
            // bitsCached >>>= 2 -> 0b00000011 >>> 2 = 0b00.
            // bitsCachedSize -= 2 -> 6.
            assertEquals(3L, bis.readBits(2)); // Reads last two bits of second byte
        }
    }
    
    @Test
    public void testReadBitsBigEndianOverflow() throws Exception {
        byte[] data = {(byte) 0b00000011, (byte) 0b11111111}; // 3, 255
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            assertEquals(0b00000011L, bis.readBits(8));
            assertEquals(255L, bis.readBits(8)); // Reads last byte
        }
    }


    @Test
    public void testReadBitsMaxCount() throws Exception {
        // Create data that represents 63 bits.
        // Need 63 bits. Max bits in a long is 63 (excluding sign bit).
        // We need 8 bytes to get 64 bits. We'll read 63 from the first 8 bytes, leaving 1 bit unused in the last byte.
        // Let's use all 1s for simplicity.
        byte[] data = {
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFE // 11111110, so last bit is 0
        };
        // Expected 63 bits of 1s.
        long expected = 0x7FFFFFFFFFFFFFFFL; // 63 ones
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            assertEquals(expected, bis.readBits(63));
        }
    }

    

    @Test
    public void testClose() throws IOException {
        byte[] data = {(byte) 0x01};
        // Use a mock to verify close is called.
        InputStream mockInputStream = new ByteArrayInputStream(data) {
            boolean closed = false;
            @Override
            public void close() throws IOException {
                closed = true;
                super.close();
            }
        };
        
        try (BitInputStream bis = new BitInputStream(mockInputStream, ByteOrder.BIG_ENDIAN)) {
            bis.readBits(8);
        }
        // Check if the underlying stream's close method was called.
        // The cast to BitInputStreamAccessor is removed as it's not applicable here and the check is done by observing the mock's state.
        assertTrue("Underlying stream should be closed", ((ByteArrayMockInputStream) mockInputStream).isClosed());
    }

    // Helper class to access the 'closed' status for testing the close method
    private static class ByteArrayMockInputStream extends ByteArrayInputStream {
        private boolean closed = false;

        ByteArrayMockInputStream(byte[] buf) {
            super(buf);
        }

        @Override
        public void close() throws IOException {
            closed = true;
            super.close();
        }

        public boolean isClosed() {
            return closed;
        }
    }


    @Test
    public void testClearBitCache() throws Exception {
        byte[] data = {(byte) 0b11000000, (byte) 0b00110000}; // 192, 48
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            bis.readBits(4); // Reads 1100. bitsCached = 0b1100, bitsCachedSize = 4.
            // After reading 4 bits, bitsCached = 0xC, bitsCachedSize = 4.
            bis.clearBitCache();
            // The private fields bitsCached and bitsCachedSize are not accessible.
            // We can test clearBitCache indirectly by reading again.
            // After clear, the cache is empty. The next readBits should read fresh from the stream.
            // Reading 8 bits after clearing cache should read the first byte.
            assertEquals(0b11000000L, bis.readBits(8)); // Reads the first byte
        }
    }
    
    @Test
    public void testReadBitsLittleEndianEdgeCase1() throws Exception {
        // Test case where bitsCachedSize is just enough to not require a new byte read,
        // but the requested bits span across the boundary of bitsCachedSize.
        byte[] data = {(byte) 0b00000011, (byte) 0b11000000}; // 3, 192
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN)) {
            // Read 5 bits. bitsCached = 0b00000011, bitsCachedSize = 8.
            bis.readBits(5); // Reads 00000. bitsCached = 0b11, bitsCachedSize = 3.
            // Now read 4 bits. bitsCachedSize = 3, count = 4. bitsCachedSize < count. Need more bits.
            // Read next byte (0b11000000).
            // bitsCached |= (nextByte << bitsCachedSize) -> 0b11 | (0b11000000 << 3) = 0b11 | 0b11000000000 = 0b11000000011. bitsCachedSize = 3 + 8 = 11.
            // Extract 4 bits.
            // bitsOut = (bitsCached & MASKS[4]) = 0b11000000011 & 0b1111 = 0b0011 = 3L.
            // bitsCached >>>= 4 -> 0b11000000011 >>> 4 = 0b110000000.
            // bitsCachedSize -= 4 -> 7.
            assertEquals(0b0011L, bis.readBits(4)); 
        }
    }

    @Test
    public void testReadBitsBigEndianEdgeCase1() throws Exception {
        // Test case where bitsCachedSize is just enough to not require a new byte read,
        // but the requested bits span across the boundary of bitsCachedSize.
        byte[] data = {(byte) 0b00000011, (byte) 0b11000000}; // 3, 192
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            // Read 5 bits. bitsCached = 0b00000, bitsCachedSize = 5.
            bis.readBits(5); // Reads 00000. bitsCached = 0, bitsCachedSize = 5.
            // Now read 4 bits. bitsCachedSize = 5, count = 4.
            // bitsOut = (bitsCached >> (bitsCachedSize - count)) & MASKS[count]
            // bitsOut = (0b00000 >> (5 - 4)) & MASKS[4] = (0b00000 >> 1) & 0b1111 = 0b0000 & 0b1111 = 0L.
            // bitsCachedSize -= 4 -> 1.
            assertEquals(0L, bis.readBits(4)); // Extracts the first 4 bits of the first byte.
            // State: bitsCached=0b00000011, bitsCachedSize=1. The remaining bits in cache are 0b00000.
            // Need 8 bits. bitsCachedSize = 1.
            // While loop: 1 < 8 && 1 < 57 -> true.
            // Read next byte 0b11000000.
            // bitsCached <<= 8 -> 0b00000 << 8 = 0. (This is incorrect, should use the cached value, which is 0b00000011 after 5 bits were read and 4 bits were consumed)
            // Let's retrace.
            // Initial: in = [0b00000011, 0b11000000], byteOrder = BIG_ENDIAN
            // readBits(5):
            //   in.read() -> 0b00000011. nextByte = 3.
            //   byteOrder == BIG_ENDIAN:
            //     bitsCached <<= 8 -> 0.
            //     bitsCached |= nextByte -> 3.
            //   bitsCachedSize += 8 -> 8.
            //   Now bitsCached = 3, bitsCachedSize = 8.
            //   bitsOut = (bitsCached >> (bitsCachedSize - count)) & MASKS[count]
            //   bitsOut = (3 >> (8 - 5)) & MASKS[5] = (3 >> 3) & 31 = 0 & 31 = 0L.
            //   bitsCachedSize -= count -> 8 - 5 = 3.
            //   So, readBits(5) returns 0. State: bitsCached=3, bitsCachedSize=3.
            // Now readBits(4):
            //   count = 4. bitsCachedSize = 3.
            //   bitsCachedSize < count (3 < 4) is true. bitsCachedSize < 57 (3 < 57) is true.
            //     Read next byte: in.read() -> 0b11000000. nextByte = 192.
            //     byteOrder == BIG_ENDIAN:
            //       bitsCached <<= 8 -> 3 << 8 = 0x300.
            //       bitsCached |= nextByte -> 0x300 | 192 = 0x300 | 0xC0 = 0x3C0.
            //     bitsCachedSize += 8 -> 3 + 8 = 11.
            //   Loop condition: bitsCachedSize < count (11 < 4) is false. Loop ends.
            //   if (bitsCachedSize < count) -> 11 < 4 is false.
            //   overflowBits = 0.
            //   bitsOut = (bitsCached >> (bitsCachedSize - count)) & MASKS[count];
            //   bitsOut = (0x3C0 >> (11 - 4)) & MASKS[4];
            //   bitsOut = (0x3C0 >> 7) & 15;
            //   0x3C0 = 0b1111000000.
            //   0x3C0 >> 7 = 0b1111 = 15.
            //   bitsOut = 15 & 15 = 15L.
            //   bitsCachedSize -= count -> 11 - 4 = 7.
            //   So, readBits(4) returns 15L.
            assertEquals(15L, bis.readBits(4));
        }
    }
    
    @Test
    public void testReadBitsLittleEndianMultipleReads() throws Exception {
        byte[] data = {(byte) 0b11110000, (byte) 0b00001111, (byte) 0b10101010};
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN)) {
            // Read 4 bits. Reads the last 4 bits of the first byte (0000).
            // Read first byte 0b11110000. bitsCached = 0xF0, bitsCachedSize = 8.
            // bitsOut = bitsCached & MASKS[4] = 0xF0 & 0x0F = 0x00.
            // bitsCached >>>= 4 -> 0xF0 >>> 4 = 0x0F.
            // bitsCachedSize -= 4 -> 4.
            assertEquals(0x00L, bis.readBits(4)); 
            
            // Read 4 bits. bitsCachedSize=4, count=4.
            // bitsOut = bitsCached & MASKS[4] = 0x0F & 0x0F = 0x0F.
            // bitsCached >>>= 4 -> 0x0F >>> 4 = 0x00.
            // bitsCachedSize -= 4 -> 0.
            assertEquals(0x0FL, bis.readBits(4)); // Reads the first 4 bits of the second byte.
            
            // Read 8 bits. bitsCachedSize=0, count=8.
            // Reads the third byte 0b10101010.
            // bitsCached |= (nextByte << bitsCachedSize) -> 0 | (0xAA << 0) = 0xAA.
            // bitsCachedSize += 8 -> 8.
            // bitsOut = bitsCached & MASKS[8] = 0xAA & 0xFF = 0xAA.
            // bitsCached >>>= 8 -> 0xAA >>> 8 = 0x00.
            // bitsCachedSize -= 8 -> 0.
            assertEquals(0xAAL, bis.readBits(8)); // Reads the third byte.
        }
    }

    @Test
    public void testReadBitsBigEndianMultipleReads() throws Exception {
        byte[] data = {(byte) 0b11110000, (byte) 0b00001111, (byte) 0b10101010};
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            assertEquals(0b11110000L, bis.readBits(8)); // Reads first byte
            assertEquals(0b00001111L, bis.readBits(8)); // Reads second byte
            assertEquals(0b10101010L, bis.readBits(8)); // Reads third byte
        }
    }
    
    @Test
    public void testEndOfStreamWhenReadingExactBits() throws Exception {
        byte[] data = {(byte) 0b11001100};
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            assertEquals(0b11001100L, bis.readBits(8)); // Reads all bits from the byte
            assertEquals(-1L, bis.readBits(1)); // Attempt to read past end of stream
        }
    }

    @Test
    public void testEndOfStreamWhenReadingPartialBits() throws Exception {
        byte[] data = {(byte) 0b11001100};
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            assertEquals(0b1100L, bis.readBits(4)); // Reads first 4 bits
            // Cache: 0b1100, bitsCachedSize=4. Need 5 bits.
            // Read next byte: End of stream, returns -1.
            // The code path for `bitsCachedSize < count` and `nextByte < 0` should return -1.
            assertEquals(-1L, bis.readBits(5)); // Attempt to read more bits than available
        }
    }

    @Test
    public void testReadBitsLittleEndianComplex() throws Exception {
        byte[] data = {
            (byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04,
            (byte) 0x05, (byte) 0x06, (byte) 0x07, (byte) 0x08,
            (byte) 0x09, (byte) 0x0a, (byte) 0x0b, (byte) 0x0c
        };
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.LITTLE_ENDIAN)) {
            // Read 12 bits.
            // Read 0x01: bitsCached = 0x01, bitsCachedSize = 8.
            // Read 0x02: bitsCached |= (0x02 << 8) = 0x01 | 0x0200 = 0x0201. bitsCachedSize = 16.
            // Extract 12 bits: bitsOut = (bitsCached & MASKS[12]) = 0x0201.
            // bitsCached >>>= 12 -> 0x0201 >>> 12 = 0.
            // bitsCachedSize -= 12 -> 4.
            assertEquals(0x0201L, bis.readBits(12)); 
            
            // Read next 8 bits. Current state: bitsCached=0, bitsCachedSize=4.
            // Read 0x03: bitsCached |= (0x03 << 4) = 0b00000011 << 4 = 0b00110000. bitsCachedSize = 12.
            // Extract 8 bits: bitsOut = (bitsCached & MASKS[8]) = 0b00110000 & 0xFF = 0x30.
            // bitsCached >>>= 8 -> 0b00110000 >>> 8 = 0.
            // bitsCachedSize -= 8 -> 4.
            assertEquals(0x30L, bis.readBits(8)); 
            
            // Read 16 bits. Current state: bitsCached=0, bitsCachedSize=4.
            // Read 0x04: bitsCached |= (0x04 << 4) = 0b00000100 << 4 = 0b01000000. bitsCachedSize = 12.
            // Read 0x05: bitsCached |= (0x05 << 12) = 0x40 | (0x05 << 12) = 0x40 | 0x5000 = 0x5040. bitsCachedSize = 20.
            // Extract 16 bits: bitsOut = (bitsCached & MASKS[16]) = 0x5040.
            // bitsCached >>>= 16 -> 0x5040 >>> 16 = 0.
            // bitsCachedSize -= 16 -> 4.
            assertEquals(0x5040L, bis.readBits(16)); 
        }
    }

    @Test
    public void testReadBitsBigEndianComplex() throws Exception {
        byte[] data = {
            (byte) 0x01, (byte) 0x02, (byte) 0x03, (byte) 0x04,
            (byte) 0x05, (byte) 0x06, (byte) 0x07, (byte) 0x08,
            (byte) 0x09, (byte) 0x0a, (byte) 0x0b, (byte) 0x0c
        };
        try (BitInputStream bis = new BitInputStream(new ByteArrayInputStream(data), ByteOrder.BIG_ENDIAN)) {
            // Read 12 bits. Reads 0x01, then 4 bits from 0x02.
            // Read 0x01: bitsCached = 0x01, bitsCachedSize = 8.
            // Read 0x02: bitsCached <<= 8 -> 0x0100. bitsCached |= 0x02 -> 0x0102. bitsCachedSize = 16.
            // Extract 12 bits: bitsOut = (bitsCached >> (16-12)) & MASKS[12] = (0x0102 >> 4) & 0xFFF = 0x10 & 0xFFF = 0x10.
            // bitsCachedSize -= 12 -> 4.
            assertEquals(0x10L, bis.readBits(12)); 
            
            // Read next 8 bits. Current state: bitsCached=0x0102, bitsCachedSize=4. Remaining bits in cache: 0x02 (4 bits).
            // count = 8. bitsCachedSize = 4.
            // Loop: `while (4 < 8 && 4 < 57)` is true.
            //   Read 0x03.
            //   bitsCached <<= 8 -> 0x0200.
            //   bitsCached |= 0x03 -> 0x0203.
            //   bitsCachedSize += 8 -> 4 + 8 = 12.
            // Loop: `while (12 < 8 && 12 < 57)` is false.
            // `if (bitsCachedSize < count)` -> `12 < 8` is false.
            // `overflowBits = 0;`
            // `bitsOut = (bitsCached >> (bitsCachedSize - count)) & MASKS[count];`
            //   `bitsCachedSize - count = 12 - 8 = 4`.
            //   `bitsOut = (0x0203 >> 4) & MASKS[8]`.
            //   `0x0203 >> 4 = 0x20`.
            //   `bitsOut = 0x20 & 0xFF = 0x20`.
            // `bitsCachedSize -= count;` -> `12 - 8 = 4`.
            assertEquals(0x20L, bis.readBits(8));

            // Read 16 bits. Current state: bitsCached=0x0203, bitsCachedSize=4. Remaining bits in cache: 0x03 (4 bits).
            // count = 16. bitsCachedSize = 4.
            // Loop: `while (4 < 16 && 4 < 57)` is true.
            //   Read 0x04.
            //   bitsCached <<= 8 -> 0x0300.
            //   bitsCached |= 0x04 -> 0x0304.
            //   bitsCachedSize += 8 -> 4 + 8 = 12.
            // Loop: `while (12 < 16 && 12 < 57)` is true.
            //   Read 0x05.
            //   bitsCached <<= 8 -> 0x030400.
            //   bitsCached |= 0x05 -> 0x030405.
            //   bitsCachedSize += 8 -> 12 + 8 = 20.
            // Loop: `while (20 < 16 && 20 < 57)` is false.
            // `if (bitsCachedSize < count)` -> `20 < 16` is false.
            // `overflowBits = 0;`
            // `bitsOut = (bitsCached >> (bitsCachedSize - count)) & MASKS[count];`
            //   `bitsCachedSize - count = 20 - 16 = 4`.
            //   `bitsOut = (0x030405 >> 4) & MASKS[16]`.
            //   `0x030405 >> 4 = 0x3040`.
            //   `bitsOut = 0x3040 & 0xFFFF = 0x3040`.
            // `bitsCachedSize -= count;` -> `20 - 16 = 4`.
            assertEquals(0x3040L, bis.readBits(16));
        }
    }
}
