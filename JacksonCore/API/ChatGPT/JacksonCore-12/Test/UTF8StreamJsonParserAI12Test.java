package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UTF8StreamJsonParserAI12Test {

    @Test
    public void testGetCodecAndInputSource() {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        byte[] buffer = new byte[10];
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();
        ObjectCodec codec = null;

        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ctxt, 0, in, codec, symbols, buffer, 0, 10, false
        );

        assertNull(parser.getCodec());
        assertEquals(in, parser.getInputSource());
    }

    @Test
    public void testReleaseBufferedEmpty() throws Exception {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        byte[] buffer = new byte[10];
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();

        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ctxt, 0, in, null, symbols, buffer, 5, 5, false
        );

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        assertEquals(0, released);
    }

    @Test
    public void testReleaseBufferedWithData() throws Exception {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        byte[] buffer = new byte[] { 1, 2, 3, 4, 5 };
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();

        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
                ctxt, 0, in, null, symbols, buffer, 1, 4, false
        );

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        assertEquals(3, released);
        org.junit.Assert.assertArrayEquals(new byte[] { 2, 3, 4 }, out.toByteArray());
    }
}
