package com.fasterxml.jackson.core.json;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

import static org.junit.Assert.*;

public class UTF8StreamJsonParserAI3Test {

    @Test
    public void testGrowArrayBy() {
        int[] original = new int[] { 1, 2, 3 };
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 2);
        assertNotNull(grown);
        assertEquals(5, grown.length);
        assertEquals(1, grown[0]);
        assertEquals(3, grown[2]);
        assertEquals(0, grown[3]);

        int[] nullGrown = UTF8StreamJsonParser.growArrayBy(null, 4);
        assertNotNull(nullGrown);
        assertEquals(4, nullGrown.length);
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        byte[] inputData = "hello test".getBytes("UTF-8");
        
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
            ctxt, 0, new ByteArrayInputStream(inputData), null, null,
            inputData, 0, inputData.length, false
        );

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(inputData.length, count);
        assertArrayEquals(inputData, out.toByteArray());
    }

    @Test(expected = IOException.class)
    public void testLoadMoreZeroBytesError() throws IOException {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        byte[] buffer = new byte[10];
        
        // InputStream that returns 0 bytes read to trigger the exception condition
        java.io.InputStream zeroInputStream = new java.io.InputStream() {
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
            ctxt, 0, zeroInputStream, null, null,
            buffer, 0, 0, false
        );

        parser.loadMore();
    }
}
