package com.fasterxml.jackson.core.json;

import java.io.IOException;
import java.io.Writer;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class JsonGeneratorImplAI13Test {

    private static class ConcreteJsonGeneratorImpl extends JsonGeneratorImpl {
        private final Writer _writer;

        public ConcreteJsonGeneratorImpl(IOContext ctxt, int features, ObjectCodec codec, Writer w) {
            super(ctxt, features, codec);
            _writer = w;
        }

        @Override public void writeFieldName(String name) throws IOException { }
        @Override public void writeFieldName(com.fasterxml.jackson.core.SerializableString name) throws IOException { }
        @Override public void writeStartArray() throws IOException { }
        @Override public void writeEndArray() throws IOException { }
        @Override public void writeStartObject() throws IOException { }
        @Override public void writeEndObject() throws IOException { }
        @Override public void writeString(String text) throws IOException { }
        @Override public void writeString(char[] text, int offset, int len) throws IOException { }
        @Override public void writeString(com.fasterxml.jackson.core.SerializableString text) throws IOException { }
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException { }
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException { }
        @Override public void writeRaw(String text) throws IOException { }
        @Override public void writeRaw(String text, int offset, int len) throws IOException { }
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException { }
        @Override public void writeRaw(char c) throws IOException { }
        @Override public void writeRawValue(String text) throws IOException { }
        @Override public void writeRawValue(String text, int offset, int len) throws IOException { }
        @Override public void writeRawValue(char[] text, int offset, int len) throws IOException { }
        @Override public void writeBinary(com.fasterxml.jackson.core.Base64Variant b64variant, byte[] data, int offset, int len) throws IOException { }
        @Override public int writeBinary(com.fasterxml.jackson.core.Base64Variant b64variant, java.io.InputStream data, int dataLength) throws IOException { return 0; }
        @Override public void writeBoolean(boolean state) throws IOException { }
        @Override public void writeNull() throws IOException { }
        @Override public void writeNumber(short v) throws IOException { }
        @Override public void writeNumber(int v) throws IOException { }
        @Override public void writeNumber(long v) throws IOException { }
        @Override public void writeNumber(java.math.BigDecimal v) throws IOException { }
        @Override public void writeNumber(java.math.BigInteger v) throws IOException { }
        @Override public void writeNumber(double v) throws IOException { }
        @Override public void writeNumber(float v) throws IOException { }
        @Override public void writeNumber(String encodedValue) throws IOException { }
        @Override public void flush() throws IOException { }
        @Override public boolean isClosed() { return false; }
        @Override protected void _releaseBuffers() { }
        @Override protected void _verifyValueWrite(String typeMsg) throws IOException { }
        @Override public void close() throws IOException { }
    }

    @Test
    public void testHighestNonEscapedCharBounds() {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(ctxt, 0, null, null);

        gen.setHighestNonEscapedChar(500);
        assertEquals(500, gen.getHighestEscapedChar());

        gen.setHighestNonEscapedChar(-10);
        assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testFeatureToggleQuoteFieldNames() {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(
                ctxt, JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask(), null, null);

        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        gen.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
    }

    @Test
    public void testVersion() {
        IOContext ctxt = new IOContext(new BufferRecycler(), null, false);
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(ctxt, 0, null, null);
        assertNotNull(gen.version());
    }
}
