package com.fasterxml.jackson.core.json;

import org.junit.Test;
import java.io.CharArrayReader;
import java.io.IOException;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class ReaderBasedJsonParserAI2Test {

    @Test
    public void testGetCodecReturnsNullInitially() {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
            ctxt, 0, new CharArrayReader(new char[0]), null, symbols
        );
        org.junit.Assert.assertNull(parser.getCodec());
    }

    @Test
    public void testGetInputSourceReturnsReader() {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        CharArrayReader reader = new CharArrayReader("test".toCharArray());
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
            ctxt, 0, reader, null, symbols
        );
        org.junit.Assert.assertEquals(reader, parser.getInputSource());
    }

    @Test
    public void testReleaseBufferedWithNoData() throws IOException {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
            ctxt, 0, new CharArrayReader(new char[0]), null, symbols
        );
        java.io.StringWriter writer = new java.io.StringWriter();
        int count = parser.releaseBuffered(writer);
        org.junit.Assert.assertEquals(0, count);
    }
}
