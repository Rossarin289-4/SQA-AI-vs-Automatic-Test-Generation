package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class UTF8StreamJsonParserAI19Test {

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
        int[] original = new int[]{1, 2, 3};
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
        byte[] data = new byte[]{10, 20, 30};
        UTF8StreamJsonParser parser = createParser(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.releaseBuffered(out);
        Assert.assertEquals(3, count);
        Assert.assertArrayEquals(data, out.toByteArray());
    }

    @Test
    public void testGetInputSource() {
        byte[] data = new byte[0];
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, null, false);
        ByteQuadsCanonicalizer symbols = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, bais, null, symbols, data, 0, 0, false);
        Assert.assertSame(bais, parser.getInputSource());
    }

    @Test
    public void testCodecGetAndSet() {
        byte[] data = new byte[0];
        UTF8StreamJsonParser parser = createParser(data);
        Assert.assertNull(parser.getCodec());
        ObjectCodec mockCodec = new ObjectCodec() {
            @Override
            public com.fasterxml.jackson.core.Version version() { return null; }
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException { return null; }
            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) throws IOException { return null; }
            @Override
            public <T> java.util.Iterator<T> readValues(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override
            public <T> java.util.Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.TypeReference<?> valueTypeRef) throws IOException { return null; }
            @Override
            public <T> java.util.Iterator<T> readValues(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) throws IOException { return null; }
            @Override
            public void writeValue(com.fasterxml.jackson.core.JsonGenerator gen, Object value) throws IOException {}
            @Override
            public <T extends com.fasterxml.jackson.core.TreeNode> T readTree(JsonParser p) throws IOException { return null; }
            @Override
            public void writeTree(com.fasterxml.jackson.core.JsonGenerator gen, com.fasterxml.jackson.core.TreeNode tree) throws IOException {}
            @Override
            public com.fasterxml.jackson.core.TreeNode createObjectNode() { return null; }
            @Override
            public com.fasterxml.jackson.core.TreeNode createArrayNode() { return null; }
            @Override
            public JsonParser treeAsTokens(com.fasterxml.jackson.core.TreeNode n) { return null; }
            @Override
            public <T> T treeToValue(com.fasterxml.jackson.core.TreeNode n, Class<T> valueType) { return null; }
        };
        parser.setCodec(mockCodec);
        Assert.assertSame(mockCodec, parser.getCodec());
    }

    @Test
    public void testGetCurrentLocationInitial() {
        byte[] data = new byte[]{1, 2, 3};
        UTF8StreamJsonParser parser = createParser(data);
        JsonLocation loc = parser.getCurrentLocation();
        Assert.assertNotNull(loc);
        Assert.assertEquals(1, loc.getLineNr());
        Assert.assertEquals(1, loc.getColumnNr());
        Assert.assertEquals(0L, loc.getByteOffset());
    }

    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testReportInvalidCharUnderSpace() throws Exception {
        byte[] data = new byte[0];
        UTF8StreamJsonParser parser = createParser(data);
        parser._reportInvalidChar(0x01);
    }
}
