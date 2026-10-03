package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringReader;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;

public class ReaderBasedJsonParserAI25Test {

    @Test
    public void testGetCodecAndInputSource() {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, recycler, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader("{}");

        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                ctxt, 0, reader, null, symbols
        );

        assertNull(parser.getCodec());
        assertSame(reader, parser.getInputSource());
    }

    @Test
    public void testReleaseBuffered() throws java.io.IOException {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, recycler, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        char[] buffer = new char[] { 'a', 'b', 'c' };

        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                ctxt, 0, null, null, symbols, buffer, 0, 3, false
        );

        java.io.StringWriter writer = new java.io.StringWriter();
        int count = parser.releaseBuffered(writer);

        assertEquals(3, count);
        assertEquals("abc", writer.toString());
    }

    @Test
    public void testCurrentLocation() {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, recycler, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader("test");

        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                ctxt, 0, reader, null, symbols
        );

        com.fasterxml.jackson.core.JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
        assertEquals(1, loc.getColumnNr());
    }
}
