package com.fasterxml.jackson.core.json;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class ReaderBasedJsonParserAI19Test {

    private ReaderBasedJsonParser createParser(String json) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ioContext = new IOContext(recycler, json, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        StringReader reader = new StringReader(json);
        return new ReaderBasedJsonParser(ioContext, 0, reader, null, symbols);
    }

    private ReaderBasedJsonParser createParserWithBuffer(char[] buffer, int start, int end, boolean recyclable) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ioContext = new IOContext(recycler, buffer, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        return new ReaderBasedJsonParser(ioContext, 0, null, null, symbols, buffer, start, end, recyclable);
    }

    @Test
    public void testGetCodecAndSetCodec() {
        ReaderBasedJsonParser parser = createParser("{}");
        Assert.assertNull(parser.getCodec());
        
        ObjectCodec dummyCodec = new JsonFactory().getCodec();
        parser.setCodec(dummyCodec);
        Assert.assertEquals(dummyCodec, parser.getCodec());
    }

    @Test
    public void testGetInputSource() {
        String json = "{\"a\":1}";
        ReaderBasedJsonParser parser = createParser(json);
        Assert.assertNotNull(parser.getInputSource());
        Assert.assertTrue(parser.getInputSource() instanceof StringReader);
    }

    @Test
    public void testReleaseBufferedWithContent() throws IOException {
        char[] buf = "hello".toCharArray();
        ReaderBasedJsonParser parser = createParserWithBuffer(buf, 0, buf.length, false);
        StringWriter writer = new StringWriter();
        int count = parser.releaseBuffered(writer);
        Assert.assertEquals(5, count);
        Assert.assertEquals("hello", writer.toString());
    }

    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        char[] buf = new char[0];
        ReaderBasedJsonParser parser = createParserWithBuffer(buf, 0, 0, false);
        StringWriter writer = new StringWriter();
        int count = parser.releaseBuffered(writer);
        Assert.assertEquals(0, count);
        Assert.assertEquals("", writer.toString());
    }

    @Test
    public void testGetTextBeforeToken() throws IOException {
        ReaderBasedJsonParser parser = createParser("  ");
        Assert.assertNull(parser.getText());
    }

    @Test
    public void testGetValueAsStringWithNullToken() throws IOException {
        ReaderBasedJsonParser parser = createParser("true");
        Assert.assertNull(parser.getValueAsString());
        Assert.assertNull(parser.getValueAsString("defaultVal"));
    }

    @Test
    public void testGetTokenLocationNullToken() throws IOException {
        ReaderBasedJsonParser parser = createParser(" 123 ");
        JsonLocation loc = parser.getTokenLocation();
        Assert.assertNotNull(loc);
    }

    @Test
    public void testGetCurrentLocation() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"test\": true}");
        JsonLocation loc = parser.getCurrentLocation();
        Assert.assertNotNull(loc);
        Assert.assertEquals(1, loc.getLineNr());
        Assert.assertEquals(1, loc.getColumnNr());
    }

    @Test
    public void testLoadMoreIOExceptionWhenZeroCharactersRead() throws IOException {
        java.io.Reader zeroReader = new java.io.Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public void close() throws IOException {}
        };
        BufferRecycler recycler = new BufferRecycler();
        IOContext ioContext = new IOContext(recycler, zeroReader, false);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ioContext, 0, zeroReader, null, symbols);
        
        try {
            parser.nextToken();
            Assert.fail("Expected an IOException because Reader returned 0 characters");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Reader returned 0 characters"));
        }
    }

    @Test
    public void testDecodeBase64Normal() throws Exception {
        String json = "\"YWJj\"";
        ReaderBasedJsonParser parser = createParser(json);
        parser.nextToken();
        byte[] bytes = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertNotNull(bytes);
        Assert.assertEquals("abc", new String(bytes, "UTF-8"));
    }
}
