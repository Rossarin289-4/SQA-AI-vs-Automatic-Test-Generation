package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringReader;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;

public class ReaderBasedJsonParserAI12Test {

    @Test
    public void testGetCodecAndSetCodec() {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        StringReader reader = new StringReader("{}");
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
        assertNull(parser.getCodec());
        
        com.fasterxml.jackson.core.ObjectCodec dummyCodec = new com.fasterxml.jackson.core.JsonFactory().getCodec();
        parser.setCodec(dummyCodec);
        assertEquals(dummyCodec, parser.getCodec());
    }

    @Test
    public void testGetInputSource() {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        StringReader reader = new StringReader("{\"a\":1}");
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
        assertEquals(reader, parser.getInputSource());
    }

    @Test
    public void testReleaseBuffered() throws java.io.IOException {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        char[] buffer = new char[] { 'a', 'b', 'c' };
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
            ctxt, 0, null, null, symbols, buffer, 0, 3, false
        );
        
        java.io.StringWriter writer = new java.io.StringWriter();
        int released = parser.releaseBuffered(writer);
        assertEquals(3, released);
        assertEquals("abc", writer.toString());
    }
}
