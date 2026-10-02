package com.fasterxml.jackson.core.json;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class ReaderBasedJsonParserAI25Test {

    private ReaderBasedJsonParser createParser(String json) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, json, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader(json);
        return new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
    }

    @Test
    public void testCodecGetAndSet() {
        ReaderBasedJsonParser parser = createParser("{}");
        Assert.assertNull(parser.getCodec());
        
        ObjectCodec codec = parser.getCodec(); // Can set/get null or dummy if available, let's verify getCodec returns what was set or null
        parser.setCodec(codec);
        Assert.assertEquals(codec, parser.getCodec());
    }

    @Test
    public void testGetInputSource() {
        String json = "{\"test\": true}";
        ReaderBasedJsonParser parser = createParser(json);
        Assert.assertNotNull(parser.getInputSource());
        Assert.assertTrue(parser.getInputSource() instanceof StringReader);
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        String json = "abc";
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, json, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader(json);
        
        char[] inputBuffer = ctxt.allocTokenBuffer();
        inputBuffer[0] = 'a';
        inputBuffer[1] = 'b';
        inputBuffer[2] = 'c';
        
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                ctxt, 0, reader, null, symbols, inputBuffer, 0, 3, true);

        CharArrayWriter writer = new CharArrayWriter();
        int released = parser.releaseBuffered(writer);
        Assert.assertEquals(3, released);
        Assert.assertEquals("abc", writer.toString());
    }

    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        String json = "";
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, json, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader(json);
        
        char[] inputBuffer = ctxt.allocTokenBuffer();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                ctxt, 0, reader, null, symbols, inputBuffer, 0, 0, true);

        CharArrayWriter writer = new CharArrayWriter();
        int released = parser.releaseBuffered(writer);
        Assert.assertEquals(0, released);
    }

    @Test
    public void testGetCurrentLocation() {
        String json = "{\"a\":1}";
        ReaderBasedJsonParser parser = createParser(json);
        JsonLocation loc = parser.getCurrentLocation();
        Assert.assertNotNull(loc);
        Assert.assertEquals(1, loc.getLineNr());
        Assert.assertEquals(1, loc.getColumnNr());
    }

    @Test
    public void testGetTokenLocationBeforeToken() {
        String json = "{\"a\":1}";
        ReaderBasedJsonParser parser = createParser(json);
        JsonLocation loc = parser.getTokenLocation();
        Assert.assertNotNull(loc);
    }

    @Test(expected = IOException.class)
    public void testLoadMoreZeroCharactersException() throws Exception {
        // Create a custom reader that returns 0 on read to trigger the IOException("Reader returned 0 characters...")
        java.io.Reader zeroReader = new java.io.Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public void close() throws IOException {
            }
        };

        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, new Object(), false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        
        char[] inputBuffer = ctxt.allocTokenBuffer();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(
                ctxt, 0, zeroReader, null, symbols, inputBuffer, 0, 0, true);

        // Accessing getNextChar or triggering loadMore will invoke _loadMore()
        parser.getNextChar("EOF test");
    }

    @Test
    public void testCloseInputManagedResource() throws Exception {
        String json = "[]";
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, json, true); // resource managed = true
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader(json);
        
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, reader, null, symbols);
        parser.close();
        // Should close successfully without exception
        Assert.assertNull(parser.getInputSource());
    }
}
