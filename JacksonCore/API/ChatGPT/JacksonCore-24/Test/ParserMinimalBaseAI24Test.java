package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParserMinimalBaseAI24Test {

    private static class TestParser extends ParserMinimalBase {
        @Override
        public com.fasterxml.jackson.core.ObjectCodec getCodec() { return null; }
        @Override
        public void setCodec(com.fasterxml.jackson.core.ObjectCodec c) { }
        @Override
        public com.fasterxml.jackson.core.Version version() { return com.fasterxml.jackson.core.Version.unknownVersion(); }
        @Override
        public String getCurrentName() { return null; }
        @Override
        public void overrideCurrentName(String name) { }
        @Override
        public void close() { }
        @Override
        public boolean isClosed() { return false; }
        @Override
        public com.fasterxml.jackson.core.JsonStreamContext getParsingContext() { return null; }
        @Override
        public void clearCurrentToken() { _lastClearedToken = _currToken; _currToken = null; }
        @Override
        public com.fasterxml.jackson.core.JsonToken getLastClearedToken() { return _lastClearedToken; }
        @Override
        public void overrideStdFeatures(int values, int mask) { }
        @Override
        public int getFeatureMask() { return 0; }
        @Override
        public com.fasterxml.jackson.core.JsonParser enable(Feature f) { return this; }
        @Override
        public com.fasterxml.jackson.core.JsonParser disable(Feature f) { return this; }
        @Override
        public boolean isEnabled(Feature f) { return false; }
        @Override
        public String getText() { return "123"; }
        @Override
        public char[] getTextCharacters() { return new char[0]; }
        @Override
        public int getTextLength() { return 0; }
        @Override
        public int getTextOffset() { return 0; }
        @Override
        public boolean hasTextCharacters() { return false; }
        @Override
        public byte[] getBinaryValue(com.fasterxml.jackson.core.Base64Variant b64codec) { return NO_BYTES; }
        @Override
        public com.fasterxml.jackson.core.JsonToken nextToken() { return null; }
    }

    @Test
    public void testLongIntegerDescShort() {
        TestParser parser = new TestParser();
        String raw = "123456789";
        String desc = parser._longIntegerDesc(raw);
        assertEquals(raw, desc);
    }

    @Test
    public void testLongNumberDescLong() {
        TestParser parser = new TestParser();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1005; i++) {
            sb.append('9');
        }
        String raw = sb.toString();
        String desc = parser._longNumberDesc(raw);
        assertEquals("[number with 1005 characters]", desc);
    }

    @Test
    public void testAsciiBytesAndString() {
        String testStr = "Hello";
        byte[] bytes = ParserMinimalBase._asciiBytes(testStr);
        assertNotNull(bytes);
        String converted = ParserMinimalBase._ascii(bytes);
        assertEquals(testStr, converted);
    }
}
