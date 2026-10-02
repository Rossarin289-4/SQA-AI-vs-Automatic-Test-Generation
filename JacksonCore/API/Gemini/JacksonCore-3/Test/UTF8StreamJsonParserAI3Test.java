package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class UTF8StreamJsonParserAI3Test {

    private UTF8StreamJsonParser createParser(byte[] data) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "testSource", true);
        BytesToNameCanonicalizer symbols = BytesToNameCanonicalizer.createRoot();
        InputStream in = new ByteArrayInputStream(data);
        return new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, data, 0, data.length, true);
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
    public void testReleaseBuffered() throws IOException {
        byte[] data = "HelloWorld".getBytes();
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "testSource", true);
        BytesToNameCanonicalizer symbols = BytesToNameCanonicalizer.createRoot();
        InputStream in = new ByteArrayInputStream(data);
        // start ptr at index 5 so 5 bytes are buffered
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, data, 5, data.length, true);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        Assert.assertEquals(5, released);
        Assert.assertEquals("World", out.toString());
    }

    @Test
    public void testReleaseBufferedEmpty() throws IOException {
        byte[] data = "Hello".getBytes();
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "testSource", true);
        BytesToNameCanonicalizer symbols = BytesToNameCanonicalizer.createRoot();
        InputStream in = new ByteArrayInputStream(data);
        // ptr equals end
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, data, 5, 5, true);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        Assert.assertEquals(0, released);
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
        Assert.assertEquals(3, result[2]);
        Assert.assertEquals(0, result[3]);
        Assert.assertEquals(0, result[4]);
    }
}
