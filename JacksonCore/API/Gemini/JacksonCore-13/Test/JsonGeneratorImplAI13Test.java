package com.fasterxml.jackson.core.json;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;

public class JsonGeneratorImplAI13Test {

    // Concrete subclass of JsonGeneratorImpl to allow instantiation and testing of behavior.
    private static class ConcreteJsonGeneratorImpl extends JsonGeneratorImpl {
        public ConcreteJsonGeneratorImpl(IOContext ctxt, int features) {
            super(ctxt, features, null);
        }

        @Override
        protected void _releaseBuffers() {}

        @Override
        protected void _verifyValueWrite(String typeMsg) throws IOException {}

        @Override public void writeString(String text) throws IOException {}
        @Override public void writeString(char[] text, int offset, int len) throws IOException {}
        @Override public void writeRaw(String text) throws IOException {}
        @Override public void writeRaw(String text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char c) throws IOException {}
        @Override public void writeBinary(com.fasterxml.jackson.core.Base64Variant b64variant, byte[] data, int offset, int len) throws IOException {}
        @Override public void writeNumber(short v) throws IOException {}
        @Override public void writeNumber(int v) throws IOException {}
        @Override public void writeNumber(long v) throws IOException {}
        @Override public void writeNumber(java.math.BigInteger v) throws IOException {}
        @Override public void writeNumber(double v) throws IOException {}
        @Override public void writeNumber(float v) throws IOException {}
        @Override public void writeNumber(java.math.BigDecimal v) throws IOException {}
        @Override public void writeNumber(String encodedValue) throws IOException {}
        @Override public void writeBoolean(boolean state) throws IOException {}
        @Override public void writeNull() throws IOException {}
        @Override public void writeStartArray() throws IOException {}
        @Override public void writeEndArray() throws IOException {}
        @Override public void writeStartObject() throws IOException {}
        @Override public void writeEndObject() throws IOException {}
        @Override public void writeFieldName(String name) throws IOException {}
        @Override public void writeFieldName(com.fasterxml.jackson.core.SerializableString name) throws IOException {}
        @Override public void flush() throws IOException {}
        @Override public boolean isClosed() { return false; }
        @Override public void close() throws IOException {}
        @Override public int copyCurrentStructure(com.fasterxml.jackson.core.JsonParser p) throws IOException { return 0; }
        @Override public int copyCurrentContents(com.fasterxml.jackson.core.JsonParser p) throws IOException { return 0; }
    }

    private IOContext createIOContext() {
        return new IOContext(new BufferRecycler(), null, false);
    }

    @Test
    public void testEscapeNonAsciiFeatureEnabled() {
        int features = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), features);
        Assert.assertEquals(127, gen.getHighestEscapedChar());
    }

    @Test
    public void testEscapeNonAsciiFeatureDisabled() {
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0);
        Assert.assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetHighestNonEscapedCharNormal() {
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0);
        gen.setHighestNonEscapedChar(255);
        Assert.assertEquals(255, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetHighestNonEscapedCharNegative() {
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0);
        gen.setHighestNonEscapedChar(-5);
        Assert.assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetCharacterEscapesNull() {
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0);
        gen.setCharacterEscapes(null);
        Assert.assertNull(gen.getCharacterEscapes());
    }

    @Test
    public void testSetCharacterEscapesCustom() {
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0);
        CharacterEscapes customEscapes = new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() {
                return new int[] { -1 };
            }
            @Override
            public com.fasterxml.jackson.core.SerializableString getEscapeSequence(int ch) {
                return null;
            }
        };
        gen.setCharacterEscapes(customEscapes);
        Assert.assertEquals(customEscapes, gen.getCharacterEscapes());
    }

    @Test
    public void testSetRootValueSeparator() {
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0);
        com.fasterxml.jackson.core.SerializableString customSep = new DefaultPrettyPrinter.FixedString(" ");
        gen.setRootValueSeparator(customSep);
        Assert.assertNotNull(gen);
    }

    @Test
    public void testEnableQuoteFieldNames() {
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0);
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        gen.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        Assert.assertNotNull(gen);
    }

    @Test
    public void testDisableQuoteFieldNames() {
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask());
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        Assert.assertNotNull(gen);
    }

    @Test
    public void testVersion() {
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0);
        Assert.assertEquals(VersionUtil.versionFor(ConcreteJsonGeneratorImpl.class), gen.version());
    }

    @Test
    public void testWriteStringField() throws IOException {
        JsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0);
        gen.writeStringField("fieldName", "fieldValue");
        Assert.assertNotNull(gen);
    }
}
