package com.fasterxml.jackson.core.json.async;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class NonBlockingJsonParserAI26Test {

    private NonBlockingJsonParser createParser() {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, recycler, false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        return new NonBlockingJsonParser(ctxt, 0, sym);
    }

    @Test
    public void testNeedMoreInputInitially() {
        NonBlockingJsonParser parser = createParser();
        Assert.assertTrue(parser.needMoreInput());
    }

    @Test
    public void testGetNonBlockingInputFeeder() {
        NonBlockingJsonParser parser = createParser();
        Assert.assertNotNull(parser.getNonBlockingInputFeeder());
        Assert.assertSame(parser, parser.getNonBlockingInputFeeder());
    }

    @Test
    public void testNextTokenNotAvailable() throws IOException {
        NonBlockingJsonParser parser = createParser();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.NOT_AVAILABLE, token);
    }

    @Test
    public void testEndOfInputHandling() throws IOException {
        NonBlockingJsonParser parser = createParser();
        parser.endOfInput();
        JsonToken token = parser.nextToken();
        Assert.assertNull(token);
    }

    @Test
    public void testFeedInputAndReleaseBuffered() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = "{\"test\": 123}".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        Assert.assertEquals(data.length, released);
        Assert.assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testParserLifecycleClosed() throws IOException {
        NonBlockingJsonParser parser = createParser();
        parser.close();
        Assert.assertTrue(parser.isClosed());
        Assert.assertNull(parser.nextToken());
    }

    @Test(expected = IOException.class)
    public void testFeedInputOverlapError() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = "{\"a\":1}".getBytes("UTF-8");
        // Feed input without consuming, so _inputPtr < _inputEnd
        parser.feedInput(data, 0, data.length);
        // Feeding again while undecoded bytes remain should throw error
        parser.feedInput(data, 0, data.length);
    }

    @Test(expected = IOException.class)
    public void testFeedInputInvalidRangeError() throws IOException {
        NonBlockingJsonParser parser = createParser();
        byte[] data = "{\"a\":1}".getBytes("UTF-8");
        // end < start should throw error
        parser.feedInput(data, 5, 2);
    }

    @Test(expected = IOException.class)
    public void testFeedInputAfterEndOfInput() throws IOException {
        NonBlockingJsonParser parser = createParser();
        parser.endOfInput();
        byte[] data = "{\"a\":1}".getBytes("UTF-8");
        parser.feedInput(data, 0, data.length);
    }
}
