package com.fasterxml.jackson.core.base;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

import java.io.IOException;

public class ParserBaseAI24Test {

    private static class ConcreteParserBase extends ParserBase {
        public ConcreteParserBase(IOContext ctxt, int features) {
            super(ctxt, features);
        }

        @Override public ObjectCodec getCodec() { return null; }
        @Override public void setCodec(ObjectCodec c) { }
        @Override public JsonToken nextToken() throws IOException { return null; }
        @Override public void finishToken() throws IOException { }
        @Override public String getText() throws IOException { return "123"; }
        @Override public char[] getTextCharacters() throws IOException { return new char[]{'1', '2', '3'}; }
        @Override public boolean hasTextCharacters() { return true; }
        @Override public int getTextLength() throws IOException { return 3; }
        @Override public int getTextOffset() throws IOException { return 0; }
        @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }
        @Override public JsonLocation getCurrentLocation() { return null; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public void close() throws IOException { _closed = true; }
        @Override public boolean isClosed() { return _closed; }
        @Override protected void _closeInput() throws IOException { }
    }

    private ParserBase createParser() {
        BufferRecycler br = new BufferRecycler();
        IOContext ioContext = new IOContext(br, "testSource", false);
        return new ConcreteParserBase(ioContext, 0);
    }

    @Test
    public void testVersion() {
        ParserBase parser = createParser();
        Version v = parser.version();
        Assert.assertNotNull(v);
    }

    @Test
    public void testCurrentAndSetValue() {
        ParserBase parser = createParser();
        Assert.assertNull(parser.getCurrentValue());
        Object val = "myValue";
        parser.setCurrentValue(val);
        Assert.assertEquals(val, parser.getCurrentValue());
    }

    @Test
    public void testEnableDisableFeatures() {
        ParserBase parser = createParser();
        parser.enable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION);
        Assert.assertTrue(parser.isEnabled(JsonParser.Feature.STRICT_DUPLICATE_DETECTION));

        parser.disable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION);
        Assert.assertFalse(parser.isEnabled(JsonParser.Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testSetFeatureMaskAndOverride() {
        ParserBase parser = createParser();
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        parser.setFeatureMask(mask);
        Assert.assertTrue(parser.isEnabled(JsonParser.Feature.STRICT_DUPLICATE_DETECTION));

        parser.overrideStdFeatures(0, mask);
        Assert.assertFalse(parser.isEnabled(JsonParser.Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testGrowArrayBy() {
        int[] arr = new int[]{1, 2};
        int[] grown = ParserBase.growArrayBy(arr, 3);
        Assert.assertNotNull(grown);
        Assert.assertEquals(5, grown.length);
        Assert.assertEquals(1, grown[0]);
        Assert.assertEquals(2, grown[1]);
        Assert.assertEquals(0, grown[2]);

        int[] nullGrown = ParserBase.growArrayBy(null, 4);
        Assert.assertNotNull(nullGrown);
        Assert.assertEquals(4, nullGrown.length);
    }

    @Test
    public void testReportInvalidBase64CharWhitespace() {
        ParserBase parser = createParser();
        Base64Variant variant = Base64Variants.MIME;
        IllegalArgumentException ex = parser.reportInvalidBase64Char(variant, 0x20, 0);
        Assert.assertNotNull(ex);
        Assert.assertTrue(ex.getMessage().contains("Illegal white space character"));
    }

    @Test
    public void testReportInvalidBase64CharPadding() {
        ParserBase parser = createParser();
        Base64Variant variant = Base64Variants.MIME;
        char paddingChar = variant.getPaddingChar();
        IllegalArgumentException ex = parser.reportInvalidBase64Char(variant, paddingChar, 0);
        Assert.assertNotNull(ex);
        Assert.assertTrue(ex.getMessage().contains("Unexpected padding character"));
    }

    @Test
    public void testReportInvalidBase64CharNormal() {
        ParserBase parser = createParser();
        Base64Variant variant = Base64Variants.MIME;
        IllegalArgumentException ex = parser.reportInvalidBase64Char(variant, '?', 1, "extra detail");
        Assert.assertNotNull(ex);
        Assert.assertTrue(ex.getMessage().contains("extra detail"));
    }

    @Test
    public void testSourceReferenceInLocation() {
        BufferRecycler br = new BufferRecycler();
        IOContext ioContext = new IOContext(br, "mySourceRef", false);
        ParserBase parser = new ConcreteParserBase(ioContext, JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.getMask());
        Object srcRef = parser._getSourceReference();
        Assert.assertEquals("mySourceRef", srcRef);

        ParserBase parserNoRef = createParser();
        Assert.assertNull(parserNoRef._getSourceReference());
    }

    @Test(expected = JsonParseException.class)
    public void testThrowUnquotedSpace() throws JsonParseException {
        ParserBase parser = createParser();
        parser._throwUnquotedSpace(10, "string");
    }
}
