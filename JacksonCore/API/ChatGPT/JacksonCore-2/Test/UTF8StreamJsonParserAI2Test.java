package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class UTF8StreamJsonParserAI2Test {

    @Test
    public void testGrowArrayBy() {
        int[] original = new int[]{1, 2, 3};
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 2);
        assertEquals(5, grown.length);
        assertEquals(1, grown[0]);
        assertEquals(3, grown[2]);
        assertEquals(0, grown[3]);

        int[] nullGrown = UTF8StreamJsonParser.growArrayBy(null, 4);
        assertEquals(4, nullGrown.length);
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        byte[] data = "hello".getBytes("UTF-8");
        
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ctxt, 0, new ByteArrayInputStream(data), null, null,
                data, 0, data.length, false
        );

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(5, count);
        assertEquals("hello", out.toString("UTF-8"));
    }

    @Test
    public void testGetInputSource() {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ctxt, 0, bais, null, null,
                new byte[10], 0, 0, false
        );

        assertEquals(bais, parser.getInputSource());
    }
}
