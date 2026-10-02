package com.fasterxml.jackson.core.json;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;

public class UTF8StreamJsonParserAI19Test {

    @Test
    public void testGetInputSource() {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        InputStream in = new java.io.ByteArrayInputStream(new byte[0]);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        byte[] inputBuffer = new byte[10];

        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
            ctxt, 0, in, null, sym, inputBuffer, 0, 0, false
        );

        assertSame(in, parser.getInputSource());
        parser.close();
    }

    @Test
    public void testReleaseBufferedEmpty() throws java.io.IOException {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        byte[] inputBuffer = new byte[10];

        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
            ctxt, 0, null, null, sym, inputBuffer, 5, 5, false
        );

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(0, count);
        assertEquals(0, out.size());
        parser.close();
    }

    @Test
    public void testReleaseBufferedWithData() throws java.io.IOException {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        byte[] inputBuffer = new byte[] { 1, 2, 3, 4, 5 };

        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
            ctxt, 0, null, null, sym, inputBuffer, 1, 4, false
        );

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        assertEquals(3, count);
        assertArrayEquals(new byte[] { 2, 3, 4 }, out.toByteArray());
        parser.close();
    }
}
