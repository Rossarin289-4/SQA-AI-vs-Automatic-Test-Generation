package com.fasterxml.jackson.core.json;

import org.junit.Test;
import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8StreamJsonParserAI9Test {

    private UTF8StreamJsonParser createParser(byte[] data) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, null, false);
        InputStream in = new ByteArrayInputStream(data);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();
        return new UTF8StreamJsonParser(
            ctxt, 0, in, null, symbols,
            data, 0, data.length, false
        );
    }

    @Test
    public void testGrowArrayByNull() {
        int[] result = UTF8StreamJsonParser.growArrayBy(null, 5);
        Assert.assertNotNull(result);
        Assert.assertEquals(5, result.length);
    }

    @Test
    public void testGrowArrayByExisting() {
        int[] original = new int[] { 1, 2, 3 };
        int[] result = UTF8StreamJsonParser.growArrayBy(original, 2);
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

        ObjectCodec dummyCodec = null;
        parser.setCodec(dummyCodec);
        Assert.assertEquals(dummyCodec, parser.getCodec());
    }

    @Test
    public void testGetInputSource() {
        byte[] data = "{}".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, null, false);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
            ctxt, 0, in, null, symbols,
            data, 0, data.length, false
        );
        Assert.assertEquals(in, parser.getInputSource());
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        byte[] data = "hello".getBytes();
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, null, false);
        InputStream in = new ByteArrayInputStream(data);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
            ctxt, 0, in, null, symbols,
            data, 1, 4, false
        );

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        Assert.assertEquals(3, count);
        Assert.assertArrayEquals("ell".getBytes(), out.toByteArray());
    }

    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        byte[] data = "hello".getBytes();
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, null, false);
        InputStream in = new ByteArrayInputStream(data);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(
            ctxt, 0, in, null, symbols,
            data, 4, 2, false
        );

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        Assert.assertEquals(0, count);
        Assert.assertEquals(0, out.size());
    }

    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testReportInvalidInitial() throws Exception {
        byte[] data = "{}".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        parser._reportInvalidInitial(0xFF);
    }

    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testReportInvalidOther() throws Exception {
        byte[] data = "{}".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        parser._reportInvalidOther(0x80);
    }

    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testReportInvalidChar() throws Exception {
        byte[] data = "{}".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        parser._reportInvalidChar(0x01);
    }
}
