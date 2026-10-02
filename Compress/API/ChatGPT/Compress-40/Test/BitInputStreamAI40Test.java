package org.apache.commons.compress.utils;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import org.junit.Test;

public class BitInputStreamAI40Test {

    @Test
    public void testReadBitsBigEndian() throws IOException {
        byte[] data = new byte[] { (byte) 0xAC }; // 10101100
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BitInputStream bitInputStream = new BitInputStream(in, ByteOrder.BIG_ENDIAN);

        long val1 = bitInputStream.readBits(4);
        assertEquals(10, val1); // 1010

        long val2 = bitInputStream.readBits(4);
        assertEquals(12, val2); // 1100
        
        bitInputStream.close();
    }

    @Test
    public void testReadBitsLittleEndian() throws IOException {
        byte[] data = new byte[] { (byte) 0xAC }; // 10101100
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BitInputStream bitInputStream = new BitInputStream(in, ByteOrder.LITTLE_ENDIAN);

        long val1 = bitInputStream.readBits(4);
        assertEquals(12, val1); // lower 4 bits: 1100

        long val2 = bitInputStream.readBits(4);
        assertEquals(10, val2); // upper 4 bits: 1010
        
        bitInputStream.close();
    }

    @Test
    public void testReadBitsEOF() throws IOException {
        byte[] data = new byte[] {};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BitInputStream bitInputStream = new BitInputStream(in, ByteOrder.BIG_ENDIAN);

        long val = bitInputStream.readBits(1);
        assertEquals(-1, val);
        
        bitInputStream.close();
    }
}
