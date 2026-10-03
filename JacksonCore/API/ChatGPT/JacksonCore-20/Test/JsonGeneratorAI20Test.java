package com.fasterxml.jackson.core;

import org.junit.Test;

public class JsonGeneratorAI20Test {

    private static class DummyJsonGenerator extends JsonGenerator {
        @Override public JsonStreamContext getOutputContext() { return null; }
        @Override public void flush() {}
        @Override public boolean isClosed() { return false; }
        @Override public void close() {}
        @Override public Version version() { return null; }
        @Override public JsonGenerator enable(Feature f) { return this; }
        @Override public JsonGenerator disable(Feature f) { return this; }
        @Override public boolean isEnabled(Feature f) { return false; }
        @Override public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override public void writeStartArray() {}
        @Override public void writeEndArray() {}
        @Override public void writeStartObject() {}
        @Override public void writeEndObject() {}
        @Override public void writeFieldName(String name) {}
        @Override public void writeString(String text) {}
        @Override public void writeString(char[] text, int offset, int len) {}
        @Override public void writeRawUTF8String(byte[] buffer, int offset, int len) {}
        @Override public void writeUTF8String(byte[] buffer, int offset, int len) {}
        @Override public void writeRaw(String text) {}
        @Override public void writeRaw(String text, int offset, int len) {}
        @Override public void writeRaw(char[] text, int offset, int len) {}
        @Override public void writeRaw(char c) {}
        @Override public void writeBinary(Base64Variant bva, byte[] data, int offset, int len) {int x = 0;}
        @Override public void writeNumber(int v) {}
        @Override public void writeNumber(long v) {}
        @Override public void writeNumber(BigInteger v) {}
        @Override public void writeNumber(double v) {}
        @Override public void writeNumber(float v) {}
        @Override public void writeNumber(BigDecimal v) {}
        @Override public void writeNumber(String encodedValue) {}
        @Override public void writeBoolean(boolean state) {}
        @Override public void writeNull() {}
        @Override public ObjectCodec getCodec() { return null; }
        @Override public JsonGenerator setCodec(ObjectCodec oc) { return this; }
    }

    @Test
    public void testVerifyOffsetsValid() {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        gen._verifyOffsets(10, 2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVerifyOffsetsInvalid() {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        gen._verifyOffsets(10, 5, 6);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteSimpleObjectUnsupported() throws Exception {
        DummyJsonGenerator gen = new DummyJsonGenerator();
        gen._writeSimpleObject(new Object());
    }
}
