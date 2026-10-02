package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UTF8StreamJsonParserAI9Test {

    @Test
    public void testGrowArrayBy() {
        int[] original = new int[] { 1, 2, 3 };
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 2);
        assertArrayEquals(new int[] { 1, 2, 3, 0, 0 }, grown);

        int[] nullGrown = UTF8StreamJsonParser.growArrayBy(null, 3);
        assertArrayEquals(new int[] { 0, 0, 0 }, nullGrown);
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "testSource", false);
        byte[] inputBuffer = new byte[] { 10, 20, 30, 40 };
        
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ctxt, 0, null, null, null,
                inputBuffer, 1, 4, false
        );

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);

        assertEquals(3, released);
        assertArrayEquals(new byte[] { 20, 30, 40 }, out.toByteArray());
    }

    @Test
    public void testGetInputSource() {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "testSource", false);
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
        
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ctxt, 0, in, null, null,
                new byte[10], 0, 0, false
        );

        assertEquals(in, parser.getInputSource());
    }
}
