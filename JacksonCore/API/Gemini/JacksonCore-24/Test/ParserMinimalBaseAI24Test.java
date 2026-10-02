package com.fasterxml.jackson.core.base;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.*;

import java.io.IOException;

public class ParserMinimalBaseAI24Test {

    private static class DummyParser extends ParserMinimalBase {
        private JsonToken nextToken;
        private String currentName;
        private boolean closed;
        private JsonStreamContext parsingContext;

        public DummyParser() {
            super();
        }

        public DummyParser(JsonToken token) {
            this.nextToken = token;
            this._currToken = token;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            return nextToken;
        }

        @Override
        public String getCurrentName() throws IOException {
            return currentName;
        }

        @Override
        public void close() throws IOException {
            this.closed = true;
        }

        @Override
        public boolean isClosed() {
            return closed;
        }

        @Override
        public JsonStreamContext getParsingContext() {
            return parsingContext;
        }

        @Override
        public Version version() {
            return Version.unknownVersion();
        }

        @Override
        protected void _handleEOF() throws JsonParseException {
            _reportInvalidEOF();
        }

        @Override
        public byte[] getBinaryValue(Base64Variant b64variant) throws IOException {
            return NO_BYTES;
        }

        @Override
        public Object getEmbeddedObject() throws IOException {
            return null;
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return null;
        }

        @Override
        public JsonLocation getTokenLocation() {
            return null;
        }

        @Override
        public String getText() throws IOException {
            return "";
        }

        @Override
        public char[] getTextCharacters() throws IOException {
            return NO_CHARS;
        }

        @Override
        public int getTextLength() throws IOException {
            return 0;
        }

        @Override
        public int getTextOffset() throws IOException {
            return 0;
        }

        @Override
        public boolean hasTextCharacters() {
            return false;
        }

        @Override
        public Number getNumberValue() throws IOException {
            return Integer.valueOf(0);
        }

        @Override
        public NumberType getNumberType() throws IOException {
            return NumberType.INT;
        }

        @Override
        public int getIntValue() throws IOException {
            return 0;
        }

        @Override
        public long getLongValue() throws IOException {
            return 0L;
        }

        @Override
        public BigInteger getBigIntegerValue() throws IOException {
            return BigInteger.ZERO;
        }

        @Override
        public float getFloatValue() throws IOException {
            return 0.0f;
        }

        @Override
        public double getDoubleValue() throws IOException {
            return 0.0;
        }

        @Override
        public BigDecimal getDecimalValue() throws IOException {
            return BigDecimal.ZERO;
        }

        public void setCurrToken(JsonToken t) {
            this._currToken = t;
        }

        public void setNextToken(JsonToken t) {
            this.nextToken = t;
        }
    }

    @Test
    public void testTokenStateAndQueries() {
        DummyParser parser = new DummyParser(JsonToken.START_OBJECT);
        Assert.assertEquals(JsonToken.START_OBJECT, parser.currentToken());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.getCurrentToken());
        Assert.assertEquals(JsonTokenId.ID_START_OBJECT, parser.currentTokenId());
        Assert.assertEquals(JsonTokenId.ID_START_OBJECT, parser.getCurrentTokenId());
        Assert.assertTrue(parser.hasCurrentToken());
        Assert.assertTrue(parser.hasToken(JsonToken.START_OBJECT));
        Assert.assertFalse(parser.hasToken(JsonToken.END_OBJECT));
        Assert.assertTrue(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
        Assert.assertFalse(parser.hasTokenId(JsonTokenId.ID_END_OBJECT));
        Assert.assertTrue(parser.isExpectedStartObjectToken());
        Assert.assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testNullTokenState() {
        DummyParser parser = new DummyParser(null);
        Assert.assertNull(parser.currentToken());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, parser.currentTokenId());
        Assert.assertFalse(parser.hasCurrentToken());
        Assert.assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        Assert.assertFalse(parser.isExpectedStartObjectToken());
        Assert.assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testNextValueHandling() throws IOException {
        DummyParser parser = new DummyParser(JsonToken.FIELD_NAME);
        parser.setNextToken(JsonToken.VALUE_STRING);
        JsonToken val = parser.nextValue();
        Assert.assertEquals(JsonToken.VALUE_STRING, val);
    }

    @Test
    public void testSkipChildrenNonStructural() throws IOException {
        DummyParser parser = new DummyParser(JsonToken.VALUE_STRING);
        JsonParser result = parser.skipChildren();
        Assert.assertSame(parser, result);
    }

    @Test
    public void testHasTextualNull() {
        DummyParser parser = new DummyParser();
        Assert.assertTrue(parser._hasTextualNull("null"));
        Assert.assertFalse(parser._hasTextualNull("nil"));
        Assert.assertFalse(parser._hasTextualNull(null));
    }

    @Test
    public void testAsciiConversionHelpers() {
        byte[] bytes = ParserMinimalBase._asciiBytes("ABC");
        Assert.assertArrayEquals(new byte[] { 65, 66, 67 }, bytes);
        String restored = ParserMinimalBase._ascii(bytes);
        Assert.assertEquals("ABC", restored);
    }

    @Test
    public void testClearCurrentToken() {
        DummyParser parser = new DummyParser(JsonToken.VALUE_NUMBER_INT);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.currentToken());
        parser.clearCurrentToken();
        Assert.assertNull(parser.currentToken());
        parser.clearCurrentToken();
        Assert.assertNull(parser.currentToken());
    }

    @Test
    public void testLongIntegerDescShortAndLong() {
        DummyParser parser = new DummyParser();
        String shortNum = "12345";
        Assert.assertEquals(shortNum, parser._longIntegerDesc(shortNum));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1005; i++) {
            sb.append('9');
        }
        String longNum = sb.toString();
        String desc = parser._longIntegerDesc(longNum);
        Assert.assertTrue(desc.contains("[Integer with 1005 digits]"));

        String negLongNum = "-" + longNum;
        String negDesc = parser._longIntegerDesc(negLongNum);
        Assert.assertTrue(negDesc.contains("[Integer with 1005 digits]"));
    }

    @Test
    public void testLongNumberDescShortAndLong() {
        DummyParser parser = new DummyParser();
        String shortNum = "3.14159";
        Assert.assertEquals(shortNum, parser._longNumberDesc(shortNum));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1010; i++) {
            sb.append('1');
        }
        String longNum = sb.toString();
        String desc = parser._longNumberDesc(longNum);
        Assert.assertTrue(desc.contains("[number with 1010 characters]"));
    }

    @Test
    public void testGetCharDesc() {
        String descCtrl = ParserMinimalBase._getCharDesc(1);
        Assert.assertTrue(descCtrl.contains("CTRL-CHAR"));

        String descHigh = ParserMinimalBase._getCharDesc(300);
        Assert.assertTrue(descHigh.contains("code 300"));

        String descNormal = ParserMinimalBase._getCharDesc('A');
        Assert.assertTrue(descNormal.contains("'A'"));
    }

    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedNumberChar() throws JsonParseException {
        DummyParser parser = new DummyParser();
        parser.reportUnexpectedNumberChar('x', "bad format");
    }

    @Test(expected = JsonParseException.class)
    public void testReportInvalidNumber() throws JsonParseException {
        DummyParser parser = new DummyParser();
        parser.reportInvalidNumber("malformed");
    }
}
