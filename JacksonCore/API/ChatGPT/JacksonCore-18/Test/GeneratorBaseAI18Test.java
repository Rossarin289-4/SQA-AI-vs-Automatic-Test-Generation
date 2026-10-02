package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.JsonWriteContext;

public class GeneratorBaseAI18Test {

    private static class ConcreteGenerator extends GeneratorBase {
        protected ConcreteGenerator(int features, ObjectCodec codec) {
            super(features, codec);
        }

        @Override public Version version() { return Version.unknownVersion(); }
        @Override public JsonGenerator configure(Feature f, boolean state) { return this; }
        @Override public JsonGenerator disable(Feature f) { return this; }
        @Override public void flush() throws IOException { }
        @Override protected void _releaseBuffers() { }
        @Override protected void _verifyValueWrite(String typeMsg) throws IOException { }
        @Override public void writeStartArray() throws IOException { }
        @Override public void writeEndArray() throws IOException { }
        @Override public void writeStartObject() throws IOException { }
        @Override public void writeEndObject() throws IOException { }
        @Override public void writeFieldName(String name) throws IOException { }
        @Override public void writeFieldName(SerializableString name) throws IOException { }
        @Override public void writeString(String text) throws IOException { }
        @Override public void writeString(char[] text, int offset, int len) throws IOException { }
        @Override public void writeString(SerializableString text) throws IOException { }
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException { }
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException { }
        @Override public void writeRaw(String text) throws IOException { }
        @Override public void writeRaw(String text, int offset, int len) throws IOException { }
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException { }
        @Override public void writeRaw(char c) throws IOException { }
        @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException { }
        @Override public void writeNumber(int v) throws IOException { }
        @Override public void writeNumber(long v) throws IOException { }
        @Override public void writeNumber(BigInteger v) throws IOException { }
        @Override public void writeNumber(double v) throws IOException { }
        @Override public void writeNumber(float v) throws IOException { }
        @Override public void writeNumber(BigDecimal v) throws IOException { }
        @Override public void writeNumber(String encodedValue) throws IOException { }
        @Override public void writeBoolean(boolean state) throws IOException { }
        @Override public void writeNull() throws IOException { }
    }

    @Test
    public void testClosedState() throws IOException {
        ConcreteGenerator gen = new ConcreteGenerator(0, null);
        assertFalse(gen.isClosed());
        gen.close();
        assertTrue(gen.isClosed());
    }

    @Test
    public void testCurrentValueContext() {
        ConcreteGenerator gen = new ConcreteGenerator(0, null);
        assertNull(gen.getCurrentValue());
        gen.setCurrentValue("test-value");
        assertEquals("test-value", gen.getCurrentValue());
    }

    @Test
    public void testDecodeSurrogate() throws IOException {
        ConcreteGenerator gen = new ConcreteGenerator(0, null);
        int code = gen._decodeSurrogate(0xD800, 0xDC00);
        assertEquals(0x10000, code);
    }
}
