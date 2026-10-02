package com.fasterxml.jackson.core.json;

import org.junit.Test;
import org.junit.Assert;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class ReaderBasedJsonParserAI9Test {

    private ReaderBasedJsonParser createParser(String input) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, recycler, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader(input);
        return new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
    }

    private ReaderBasedJsonParser createParserWithBuffer(char[] buffer, int start, int end, boolean recyclable) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, recycler, false);
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
        StringReader reader = new StringReader("{\"a\": 1}");
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, recycler, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
        Assert.assertEquals(reader, parser.getInputSource());
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        char[] buf = new char[] { 'a', 'b', 'c', 'd' };
        ReaderBasedJsonParser parser = createParserWithBuffer(buf, 1, 3, false);
        CharArrayWriter writer = new CharArrayWriter();
        int count = parser.releaseBuffered(writer);
        Assert.assertEquals(2, count);
        Assert.assertEquals("bc", writer.toString());
    }

    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        char[] buf = new char[] { 'a', 'b' };
        ReaderBasedJsonParser parser = createParserWithBuffer(buf, 2, 2, false);
        CharArrayWriter writer = new CharArrayWriter();
        int count = parser.releaseBuffered(writer);
        Assert.assertEquals(0, count);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testGetTextNullToken() throws IOException {
        ReaderBasedJsonParser parser = createParser("true");
        Assert.assertNull(parser.getText());
    }

    @Test
    public void testGetValueAsStringWithoutToken() throws IOException {
        ReaderBasedJsonParser parser = createParser("true");
        Assert.assertNull(parser.getValueAsString());
        Assert.assertNull(parser.getValueAsString("default"));
    }

    @Test(expected = IOException.class)
    public void testLoadMoreZeroCharactersException() throws IOException {
        java.io.Reader zeroReader = new java.io.Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public void close() throws IOException {}
        };
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, recycler, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, zeroReader, null, symbols);
        parser.nextToken();
    }
}
