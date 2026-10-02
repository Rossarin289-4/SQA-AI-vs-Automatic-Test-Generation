package com.fasterxml.jackson.core;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonGeneratorAI20Test {

    @Test
    public void testFeatureCollectDefaults() {
        int defaults = JsonGenerator.Feature.collectDefaults();
        Assert.assertTrue(defaults != 0);

        for (JsonGenerator.Feature f : JsonGenerator.Feature.values()) {
            if (f.enabledByDefault()) {
                Assert.assertEquals(0, (defaults & f.getMask()) ^ f.getMask());
            } else {
                Assert.assertEquals(0, defaults & f.getMask());
            }
        }
    }

    @Test
    public void testFeatureMaskAndDefaultState() {
        JsonGenerator.Feature f1 = JsonGenerator.Feature.AUTO_CLOSE_TARGET;
        Assert.assertTrue(f1.enabledByDefault());
        Assert.assertTrue(f1.getMask() != 0);

        JsonGenerator.Feature f2 = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        Assert.assertFalse(f2.enabledByDefault());
        Assert.assertTrue(f2.getMask() != 0);

        Assert.assertNotEquals(f1.getMask(), f2.getMask());
    }

    // Concrete dummy generator implementation to test protected methods like _verifyOffsets
    private static class DummyJsonGenerator extends JsonGenerator {
        @Override public Version version() { return null; }
        @Override public JsonGenerator enable(Feature f) { return this; }
        @Override public JsonGenerator disable(Feature f) { return this; }
        @Override public boolean isEnabled(Feature f) { return false; }
        @Override public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override public void setCodec(ObjectCodec oc) { }
        @Override public ObjectCodec getCodec() { return null; }
        @Override public void writeStartArray() throws IOException { }
        @Override public void writeEndArray() throws IOException { }
        @Override public void writeStartObject() throws IOException { }
        @Override public void writeEndObject() throws IOException { }
        @Override public void writeFieldName(String name) throws IOException { }
        @Override public void writeFieldName(SerializableString name) throws IOException { }
        @Override public void writeString(String text) throws IOException { }
        @Override public void writeString(char[] text, int offset, int len) throws IOException { }
        @Override public void writeString(SerializableString text) throws IOException { }
        @Override public void writeRawUTF8String(byte[] buffer, int offset, int len) throws IOException { }
        @Override public void writeUTF8String(byte[] buffer, int offset, int len) throws IOException { }
        @Override public void writeRaw(String text) throws IOException { }
        @Override public void writeRaw(String text, int offset, int len) throws IOException { }
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException { }
        @Override public void writeRaw(char c) throws IOException { }
        @Override public void writeRawValue(String text) throws IOException { }
        @Override public void writeRawValue(String text, int offset, int len) throws IOException { }
        @Override public void writeRawValue(char[] text, int offset, int len) throws IOException { }
        @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException { }
        @Override public int writeBinary(Base64Variant b64variant, InputStream data, int dataLength) throws IOException { return 0; }
        @Override public void writeNumber(int v) throws IOException { }
        @Override public void writeNumber(long v) throws IOException { }
        @Override public void writeNumber(BigInteger v) throws IOException { }
        @Override public void writeNumber(double v) throws IOException { }
        @Override public void writeNumber(float v) throws IOException { }
        @Override public void writeNumber(BigDecimal v) throws IOException { }
        @Override public void writeNumber(String encodedValue) throws IOException { }
        @Override public void writeBoolean(boolean state) throws IOException { }
        @Override public void writeNull() throws IOException { }
        @Override public void writeObject(Object pojo) throws IOException { }
        @Override public void writeTree(TreeNode rootNode) throws IOException { }
        @Override public JsonStreamContext getOutputContext() { return null; }
        @Override public void flush() throws IOException { }
        @Override public boolean isClosed() { return false; }
        @Override public void close() throws IOException { }

        // Expose protected methods for testing
        public void publicVerifyOffsets(int arrayLength, int offset, int length) {
            _verifyOffsets(arrayLength, offset, length);
        }

        public void publicReportError(String msg) throws JsonGenerationException {
            _reportError(msg);
        }

        public void publicReportUnsupportedOperation() {
            _reportUnsupportedOperation();
        }

        public void publicWriteSimpleObject(Object value) throws IOException {
            _writeSimpleObject(value);
        }
    }

    @Test
    public void testVerifyOffsetsValid() {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        gen.publicVerifyOffsets(10, 0, 5);
        gen.publicVerifyOffsets(10, 2, 8);
        gen.publicVerifyOffsets(10, 10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyOffsetsNegativeOffset() {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        gen.publicVerifyOffsets(10, -1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyOffsetsExceedsLength() {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        gen.publicVerifyOffsets(10, 5, 6);
    }

    @Test(expected = JsonGenerationException.class)
    public void testReportError() throws Exception {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        gen.publicReportError("Test error message");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testReportUnsupportedOperation() {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        gen.publicReportUnsupportedOperation();
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteSimpleObjectUnsupportedType() throws Exception {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        gen.publicWriteSimpleObject(new Object());
    }

    @Test
    public void testWriteSimpleObjectNull() throws Exception {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        gen.publicWriteSimpleObject(null);
        Assert.assertTrue(true);
    }
}
