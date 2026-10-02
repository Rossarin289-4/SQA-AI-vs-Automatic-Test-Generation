package com.fasterxml.jackson.core.json;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8StreamJsonParserAI2Test {

    private UTF8StreamJsonParser createParser(byte[] data) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, null, false);
        BytesToNameCanonicalizer symbols = BytesToNameCanonicalizer.createRoot();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        return new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, data, 0, data.length, false);
    }

    @Test
    public void testGrowArrayByNull() {
        int[] result = UTF8StreamJsonParser.growArrayBy(null, 5);
        Assert.assertNotNull(result);
        Assert.assertEquals(5, result.length);
    }

    @Test
    public void testGrowArrayByExisting() {
        int[] initial = new int[] { 1, 2, 3 };
        int[] result = UTF8StreamJsonParser.growArrayBy(initial, 2);
        Assert.assertNotNull(result);
        Assert.assertEquals(5, result.length);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);
        Assert.assertEquals(3, result[2]);
        Assert.assertEquals(0, result[3]);
        Assert.assertEquals(0, result[4]);
    }

    @Test
    public void testGetCodecAndSetCodec() {
        byte[] data = "{}".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        Assert.assertNull(parser.getCodec());
        parser.setCodec(null);
        Assert.assertNull(parser.getCodec());
    }

    @Test
    public void testGetInputSource() {
        byte[] data = "{}".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        Assert.assertNotNull(parser.getInputSource());
    }

    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        byte[] data = new byte[0];
        UTF8StreamJsonParser parser = createParser(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        Assert.assertEquals(0, count);
    }

    @Test
    public void testReleaseBufferedNonEmpty() throws IOException {
        byte[] data = "hello".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        Assert.assertEquals(5, count);
        Assert.assertArrayEquals("hello".getBytes(), out.toByteArray());
    }

    @Test
    public void testGetTextWithNullToken() {
        byte[] data = "".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        try {
            String text = parser.getText();
            Assert.assertNull(text);
        } catch (Exception e) {
            // Expected if token state requires a token
        }
    }

    @Test
    public void testLoadMoreWithStreamEnd() throws IOException {
        byte[] data = new byte[0];
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, null, false);
        BytesToNameCanonicalizer symbols = BytesToNameCanonicalizer.createRoot();
        byte[] buffer = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, buffer, 0, 0, false);
        boolean loaded = parser.loadMore();
        Assert.assertFalse(loaded);
    }

    @Test
    public void testLoadToHaveAtLeastNoStream() throws IOException {
        byte[] data = "abc".getBytes();
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, null, false);
        BytesToNameCanonicalizer symbols = BytesToNameCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, null, null, symbols, data, 0, data.length, false);
        boolean result = parser._loadToHaveAtLeast(5);
        Assert.assertFalse(result);
    }

    @Test
    public void testSkipCR() throws IOException {
        byte[] data = "\n".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        parser._skipCR();
        Assert.assertNotNull(parser);
    }

    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testReportInvalidCharLowSpace() throws Exception {
        byte[] data = "{}".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        parser._reportInvalidChar(0x01);
    }

    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testReportInvalidInitial() throws Exception {
        byte[] data = "{}".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        parser._reportInvalidInitial(0xFF);
    }
}
