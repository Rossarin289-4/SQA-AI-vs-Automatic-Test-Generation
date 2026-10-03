package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public class GeneratorBaseAI18Test {

    private static class ConcreteGeneratorBase extends GeneratorBase {
        private boolean verifiedValueWriteCalled = false;
        private String lastVerifiedMsg = null;
        private PrettyPrinter prettyPrinter;
        private int highestNonEscapedChar = -1;

        public ConcreteGeneratorBase(int features, ObjectCodec codec) {
            super(features, codec);
        }

        public ConcreteGeneratorBase(int features, ObjectCodec codec, JsonWriteContext ctxt) {
            super(features, codec, ctxt);
        }

        @Override public Version version() { return Version.unknownVersion(); }
        @Override public JsonGenerator useDefaultPrettyPrinter() { return super.useDefaultPrettyPrinter(); }
        @Override public JsonGenerator setPrettyPrinter(PrettyPrinter pp) {
            this.prettyPrinter = pp;
            return this;
        }
        @Override public PrettyPrinter getPrettyPrinter() { return this.prettyPrinter; }
        @Override public JsonGenerator enable(Feature f) { return super.enable(f); }
        @Override public JsonGenerator disable(Feature f) { return super.disable(f); }
        @Override public void writeStartArray() throws IOException {}
        @Override public void writeEndArray() throws IOException {}
        @Override public void writeStartObject() throws IOException {}
        @Override public void writeEndObject() throws IOException {}
        @Override public void writeFieldName(String name) throws IOException {}
        @Override public void writeString(String text) throws IOException {}
        @Override public void writeString(char[] text, int offset, int len) throws IOException {}
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void writeRaw(String text) throws IOException {}
        @Override public void writeRaw(String text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException {}
        @Override public void writeRaw(char c) throws IOException {}
        @Override public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException {}
        @Override public void writeNumber(int v) throws IOException {}
        @Override public void writeNumber(long v) throws IOException {}
        @Override public void writeNumber(double v) throws IOException {}
        @Override public void writeNumber(float v) throws IOException {}
        @Override public void writeNumber(BigDecimal v) throws IOException {}
        @Override public void writeNumber(BigInteger v) throws IOException {}
        @Override public void writeNumber(String encodedValue) throws IOException {}
        @Override public void writeBoolean(boolean state) throws IOException {}
        @Override public void writeNull() throws IOException {}
        @Override public void flush() throws IOException {}
        @Override protected void _releaseBuffers() {}
        @Override protected void _verifyValueWrite(String typeMsg) throws IOException {
            verifiedValueWriteCalled = true;
            lastVerifiedMsg = typeMsg;
        }
        @Override public int getHighestEscapedChar() { return highestNonEscapedChar; }
        @Override public JsonGenerator setHighestNonEscapedChar(int charCode) {
            highestNonEscapedChar = charCode;
            return this;
        }
        @Override public ObjectCodec getOutputContext() { return super.getOutputContext(); }
    }

    @Test
    public void testLifeCycleAndClose() {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        Assert.assertFalse(gen.isClosed());
        gen.close();
        Assert.assertTrue(gen.isClosed());
    }

    @Test
    public void testCodecHandling() {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        Assert.assertNull(gen.getCodec());
        ObjectCodec codec = new ObjectMapper();
        gen.setCodec(codec);
        Assert.assertEquals(codec, gen.getCodec());
    }

    @Test
    public void testCurrentValueHandling() {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        Assert.assertNull(gen.getCurrentValue());
        Object val = "test-value";
        gen.setCurrentValue(val);
        Assert.assertEquals(val, gen.getCurrentValue());
    }

    @Test
    public void testFeatureEnablingAndDisabling() {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        Assert.assertFalse(gen.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        
        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        
        gen.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        Assert.assertFalse(gen.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
    }

    @Test
    public void testDerivedFeatureEscapeNonAscii() {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        Assert.assertEquals(0, gen.getHighestEscapedChar());

        gen.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        Assert.assertEquals(127, gen.getHighestEscapedChar());

        gen.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        Assert.assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetFeatureMaskAndOverride() {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        int mask = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        gen.setFeatureMask(mask);
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));

        gen.overrideStdFeatures(0, mask);
        Assert.assertFalse(gen.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
    }

    @Test
    public void testUseDefaultPrettyPrinter() {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        Assert.assertNull(gen.getPrettyPrinter());
        gen.useDefaultPrettyPrinter();
        Assert.assertNotNull(gen.getPrettyPrinter());

        PrettyPrinter custom = new DefaultPrettyPrinter();
        gen.setPrettyPrinter(custom);
        Assert.assertEquals(custom, gen.getPrettyPrinter());
    }

    @Test
    public void testWriteStringSerializableString() throws IOException {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        SerializableString sstr = new SerializableString() {
            @Override public String getValue() { return "hello"; }
            @Override public int putQuotedUTF8(java.nio.ByteBuffer buffer) { return 0; }
            @Override public int putUnquotedUTF8(java.nio.ByteBuffer buffer) { return 0; }
            @Override public byte[] asQuotedUTF8() { return new byte[0]; }
            @Override public byte[] asUnquotedUTF8() { return new byte[0]; }
            @Override public int writeQuotedUTF8(java.io.OutputStream out) { return 0; }
            @Override public int writeUnquotedUTF8(java.io.OutputStream out) { return 0; }
            @Override public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
        };
        gen.writeString(sstr);
        gen.writeFieldName(sstr);
    }

    @Test
    public void testWriteRawValueVariants() throws IOException {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        gen.writeRawValue("raw1");
        Assert.assertTrue(gen.verifiedValueWriteCalled);

        gen.writeRawValue("raw2", 0, 4);
        gen.writeRawValue(new char[]{'r', 'a', 'w'}, 0, 3);
        SerializableString sstr = new SerializableString() {
            @Override public String getValue() { return "raw3"; }
            @Override public int putQuotedUTF8(java.nio.ByteBuffer buffer) { return 0; }
            @Override public int putUnquotedUTF8(java.nio.ByteBuffer buffer) { return 0; }
            @Override public byte[] asQuotedUTF8() { return new byte[0]; }
            @Override public byte[] asUnquotedUTF8() { return new byte[0]; }
            @Override public int writeQuotedUTF8(java.io.OutputStream out) { return 0; }
            @Override public int writeUnquotedUTF8(java.io.OutputStream out) { return 0; }
            @Override public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
        };
        gen.writeRawValue(sstr);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinaryStreamUnsupported() throws IOException {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        InputStream is = new ByteArrayInputStream(new byte[0]);
        gen.writeBinary(Base64Variants.MIME, is, 0);
    }

    @Test
    public void testDecodeSurrogateValid() throws IOException {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        int code = gen._decodeSurrogate(0xD800, 0xDC00);
        Assert.assertEquals(0x10000, code);
    }

    @Test(expected = IOException.class)
    public void testDecodeSurrogateInvalid() throws IOException {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(0, null);
        gen._decodeSurrogate(0xD800, 0x0000);
    }

    @Test
    public void testBigDecimalAsString() throws IOException {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(
                JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask(), null);
        BigDecimal bd = new BigDecimal("123.45");
        String res = gen._asString(bd);
        Assert.assertEquals("123.45", res);
    }

    @Test(expected = IOException.class)
    public void testBigDecimalAsStringIllegalScale() throws IOException {
        ConcreteGeneratorBase gen = new ConcreteGeneratorBase(
                JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask(), null);
        BigDecimal bd = new BigDecimal("1e-100000");
        gen._asString(bd);
    }
}
