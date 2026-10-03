package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class UTF8StreamJsonParserAI12Test {

    private UTF8StreamJsonParser createParser(byte[] data) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();
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
        UTF8StreamJsonParser parser = createParser(new byte[0]);
        Assert.assertNull(parser.getCodec());
        parser.setCodec(null);
        Assert.assertNull(parser.getCodec());
    }

    @Test
    public void testGetInputSource() {
        byte[] data = "{}".getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, bais, null, symbols, data, 0, data.length, false);
        
        Assert.assertSame(bais, parser.getInputSource());
    }

    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        byte[] data = new byte[0];
        UTF8StreamJsonParser parser = createParser(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        Assert.assertEquals(0, count);
        Assert.assertEquals(0, out.size());
    }

    @Test
    public void testReleaseBufferedNonEmpty() throws IOException {
        byte[] data = "Hello".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        Assert.assertEquals(5, count);
        Assert.assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testGetCurrentLocation() {
        byte[] data = "{\"a\":1}".getBytes();
        UTF8StreamJsonParser parser = createParser(data);
        com.fasterxml.jackson.core.JsonLocation loc = parser.getCurrentLocation();
        Assert.assertNotNull(loc);
        Assert.assertEquals(1, loc.getLineNr());
        Assert.assertEquals(1, loc.getColumnNr());
    }

    @Test
    public void testCloseInputManaged() throws IOException {
        byte[] data = "{}".getBytes();
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, true);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, data, 0, data.length, false);
        
        parser.close();
        Assert.assertNull(parser.getInputSource());
    }
}
