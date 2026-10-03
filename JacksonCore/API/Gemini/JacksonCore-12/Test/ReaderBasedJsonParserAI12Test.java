package com.fasterxml.jackson.core.json;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class ReaderBasedJsonParserAI12Test {

    private ReaderBasedJsonParser createParser(String json) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, json, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader(json);
        return new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
    }

    private ReaderBasedJsonParser createParserWithBuffer(char[] buffer, int start, int end, boolean recyclable) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, buffer, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        return new ReaderBasedJsonParser(ctxt, 0, null, null, symbols, buffer, start, end, recyclable);
    }

    @Test
    public void testGetCodecAndSetCodec() {
        ReaderBasedJsonParser parser = createParser("{}");
        Assert.assertNull(parser.getCodec());
        parser.setCodec(null);
        Assert.assertNull(parser.getCodec());
    }

    @Test
    public void testGetInputSource() {
        String json = "{\"a\": 1}";
        StringReader reader = new StringReader(json);
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, reader, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
        Assert.assertSame(reader, parser.getInputSource());
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        char[] buf = new char[] { 'a', 'b', 'c', 'd' };
        ReaderBasedJsonParser parser = createParserWithBuffer(buf, 1, 3, true);
        CharArrayWriter writer = new CharArrayWriter();
        int count = parser.releaseBuffered(writer);
        Assert.assertEquals(2, count);
        Assert.assertEquals("bc", writer.toString());
    }

    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        char[] buf = new char[] { 'a' };
        ReaderBasedJsonParser parser = createParserWithBuffer(buf, 1, 1, true);
        CharArrayWriter writer = new CharArrayWriter();
        int count = parser.releaseBuffered(writer);
        Assert.assertEquals(0, count);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testGetCurrentLocation() {
        ReaderBasedJsonParser parser = createParser("  \n  {\"a\":1}");
        JsonLocation loc = parser.getCurrentLocation();
        Assert.assertNotNull(loc);
        Assert.assertEquals(1L, loc.getLineNr());
        Assert.assertEquals(1L, loc.getColumnNr());
    }

    @Test
    public void testGetTextNullToken() throws IOException {
        ReaderBasedJsonParser parser = createParser("{}");
        // Before nextToken(), _currToken is null
        Assert.assertNull(parser.getText());
    }

    @Test
    public void testGetValueAsStringNull() throws IOException {
        ReaderBasedJsonParser parser = createParser("{}");
        Assert.assertNull(parser.getValueAsString());
        Assert.assertEquals("fallback", parser.getValueAsString("fallback"));
    }

    @Test
    public void testGetText2WithUnknownToken() {
        ReaderBasedJsonParser parser = createParser("{}");
        // _getText2 with null token should return null
        Assert.assertNull(parser._getText2(null));
    }

    @Test(expected = IOException.class)
    public void testLoadMoreZeroCharactersThrowsException() throws IOException {
        // A reader that returns 0 on read()
        java.io.Reader zeroReader = new java.io.Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public void close() throws IOException {
            }
        };
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, zeroReader, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, zeroReader, null, symbols);
        
        // Force loadMore() via getNextChar
        parser.getNextChar("EOF test");
    }

    @Test
    public void testTokenLocationWithoutFieldName() {
        ReaderBasedJsonParser parser = createParser("{}");
        JsonLocation loc = parser.getTokenLocation();
        Assert.assertNotNull(loc);
        Assert.assertNotNull(loc.getSourceRef());
    }
}
