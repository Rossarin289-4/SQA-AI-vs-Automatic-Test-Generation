package com.fasterxml.jackson.core.json.async;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class NonBlockingJsonParserAI26Test {

    @Test
    public void testNeedMoreInput() {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        NonBlockingJsonParser parser = new NonBlockingJsonParser(ctxt, 0, sym);

        assertTrue(parser.needMoreInput());
        parser.endOfInput();
        assertFalse(parser.needMoreInput());
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        NonBlockingJsonParser parser = new NonBlockingJsonParser(ctxt, 0, sym);

        byte[] data = new byte[] { 1, 2, 3, 4 };
        parser.feedInput(data, 0, 4);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        assertEquals(4, released);
        assertArrayEquals(data, out.toByteArray());
    }

    @Test(expected = IOException.class)
    public void testFeedInputInvalidRange() throws IOException {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        NonBlockingJsonParser parser = new NonBlockingJsonParser(ctxt, 0, sym);

        byte[] data = new byte[] { 1, 2, 3 };
        parser.feedInput(data, 3, 1);
    }
}
