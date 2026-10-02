package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;

public class ParserMinimalBaseAI9Test {

    private static class DummyParser extends ParserMinimalBase {
        private JsonToken nextTokenResult;
        private String currentNameResult;
        private String textResult;
        private char[] textCharsResult;
        private int intVal;
        private long longVal;
        private double doubleVal;
        private Object embeddedObject;
        private boolean closed;
        private JsonStreamContext parsingContext;

        public DummyParser() {
            super();
        }

        @Override
        public JsonToken nextToken() throws IOException {
            return nextTokenResult;
        }

        @Override
        protected void _handleEOF() throws JsonParseException {
            throw new JsonParseException("EOF", getCurrentLocation());
        }

        @Override
        public String getCurrentName() throws IOException {
            return currentNameResult;
        }

        @Override
        public void close() throws IOException {
            closed = true;
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
        public void overrideCurrentName(String name) {
            this.currentNameResult = name;
        }

        @Override
        public String getText() throws IOException {
            return textResult;
        }

        @Override
        public char[] getTextCharacters() throws IOException {
            return textCharsResult;
        }

        @Override
        public boolean hasTextCharacters() {
            return textCharsResult != null;
        }

        @Override
        public int getTextLength() throws IOException {
            return textResult == null ? 0 : textResult.length();
        }

        @Override
        public int getTextOffset() throws IOException {
            return 0;
        }

        @Override
        public byte[] getBinaryValue(Base64Variant b64variant) throws IOException {
            return new byte[0];
        }

        @Override
        public Version version() {
            return Version.unknownVersion();
        }

        @Override
        public ObjectCodec getCodec() {
            return null;
        }

        @Override
        public void setCodec(ObjectCodec c) {
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return new JsonLocation(null, 0L, 0, 0);
        }

        @Override
        public JsonLocation getTokenLocation() {
            return new JsonLocation(null, 0L, 0, 0);
        }

        @Override
        public int getIntValue() throws IOException {
            return intVal;
        }

        @Override
        public long getLongValue() throws IOException {
            return longVal;
        }

        @Override
        public double getDoubleValue() throws IOException {
            return doubleVal;
        }

        @Override
        public float getFloatValue() throws IOException {
            return (float) doubleVal;
        }

        @Override
        public BigDecimal getDecimalValue() throws IOException {
            return BigDecimal.valueOf(doubleVal);
        }

        @Override
        public BigInteger getBigIntegerValue() throws IOException {
            return BigInteger.valueOf(longVal);
        }

        @Override
        public Number getNumberValue() throws IOException {
            return intVal;
        }

        @Override
        public NumberType getNumberType() throws IOException {
            return NumberType.INT;
        }

        @Override
        public Object getEmbeddedObject() throws IOException {
            return embeddedObject;
        }
    }

    @Test
    public void testTokenIdAndHasToken() {
        DummyParser p = new DummyParser();
        Assert.assertEquals(com.fasterxml.jackson.core.JsonTokenId.ID_NO_TOKEN, p.getCurrentTokenId());
        Assert.assertFalse(p.hasCurrentToken());
        Assert.assertTrue(p.hasTokenId(com.fasterxml.jackson.core.JsonTokenId.ID_NO_TOKEN));
        Assert.assertFalse(p.hasTokenId(com.fasterxml.jackson.core.JsonTokenId.ID_STRING));
        Assert.assertFalse(p.hasToken(JsonToken.VALUE_STRING));
        Assert.assertFalse(p.isExpectedStartArrayToken());
        Assert.assertFalse(p.isExpectedStartObjectToken());

        p._currToken = JsonToken.VALUE_STRING;
        Assert.assertEquals(JsonToken.ID_STRING, p.getCurrentTokenId());
        Assert.assertTrue(p.hasCurrentToken());
        Assert.assertTrue(p.hasTokenId(JsonToken.ID_STRING));
        Assert.assertTrue(p.hasToken(JsonToken.VALUE_STRING));

        p._currToken = JsonToken.START_ARRAY;
        Assert.assertTrue(p.isExpectedStartArrayToken());
        Assert.assertFalse(p.isExpectedStartObjectToken());

        p._currToken = JsonToken.START_OBJECT;
        Assert.assertFalse(p.isExpectedStartArrayToken());
        Assert.assertTrue(p.isExpectedStartObjectToken());
    }

    @Test
    public void testClearAndGetLastClearedToken() {
        DummyParser p = new DummyParser();
        Assert.assertNull(p.getLastClearedToken());
        p.clearCurrentToken();
        Assert.assertNull(p.getLastClearedToken());

        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.clearCurrentToken();
        Assert.assertNull(p.getCurrentToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.getLastClearedToken());
    }

    @Test
    public void testNextValue() throws IOException {
        DummyParser p = new DummyParser() {
            private int count = 0;
            @Override
            public JsonToken nextToken() throws IOException {
                count++;
                if (count == 1) return JsonToken.FIELD_NAME;
                return JsonToken.VALUE_STRING;
            }
        };
        JsonToken val = p.nextValue();
        Assert.assertEquals(JsonToken.VALUE_STRING, val);
    }

    @Test
    public void testSkipChildrenNonStruct() throws IOException {
        DummyParser p = new DummyParser();
        p._currToken = JsonToken.VALUE_STRING;
        JsonParser result = p.skipChildren();
        Assert.assertSame(p, result);
    }

    @Test(expected = JsonParseException.class)
    public void testSkipChildrenEof() throws IOException {
        DummyParser p = new DummyParser() {
            @Override
            public JsonToken nextToken() throws IOException {
                return null;
            }
        };
        p._currToken = JsonToken.START_OBJECT;
        p.skipChildren();
    }

    @Test
    public void testGetValueAsBoolean() throws IOException {
        DummyParser p = new DummyParser();
        p._currToken = null;
        Assert.assertTrue(p.getValueAsBoolean(true));
        Assert.assertFalse(p.getValueAsBoolean(false));

        p._currToken = JsonToken.VALUE_TRUE;
        Assert.assertTrue(p.getValueAsBoolean(false));

        p._currToken = JsonToken.VALUE_FALSE;
        Assert.assertFalse(p.getValueAsBoolean(true));

        p._currToken = JsonToken.VALUE_NULL;
        Assert.assertFalse(p.getValueAsBoolean(true));

        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.intVal = 0;
        Assert.assertFalse(p.getValueAsBoolean(true));
        p.intVal = 5;
        Assert.assertTrue(p.getValueAsBoolean(false));

        p._currToken = JsonToken.VALUE_STRING;
        p.textResult = "true";
        Assert.assertTrue(p.getValueAsBoolean(false));
        p.textResult = "false";
        Assert.assertFalse(p.getValueAsBoolean(true));
        p.textResult = "null";
        Assert.assertFalse(p.getValueAsBoolean(true));
        p.textResult = "other";
        Assert.assertFalse(p.getValueAsBoolean(false));

        p._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        p.embeddedObject = Boolean.TRUE;
        Assert.assertTrue(p.getValueAsBoolean(false));
        p.embeddedObject = "not-boolean";
        Assert.assertFalse(p.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsInt() throws IOException {
        DummyParser p = new DummyParser();
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.intVal = 42;
        Assert.assertEquals(42, p.getValueAsInt());
        Assert.assertEquals(42, p.getValueAsInt(10));

        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p.intVal = 99;
        Assert.assertEquals(99, p.getValueAsInt());

        p._currToken = JsonToken.VALUE_TRUE;
        Assert.assertEquals(1, p.getValueAsInt(10));

        p._currToken = JsonToken.VALUE_FALSE;
        Assert.assertEquals(0, p.getValueAsInt(10));

        p._currToken = JsonToken.VALUE_NULL;
        Assert.assertEquals(0, p.getValueAsInt(10));

        p._currToken = JsonToken.VALUE_STRING;
        p.textResult = "123";
        Assert.assertEquals(123, p.getValueAsInt(10));
        p.textResult = "null";
        Assert.assertEquals(0, p.getValueAsInt(10));

        p._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        p.embeddedObject = Integer.valueOf(77);
        Assert.assertEquals(77, p.getValueAsInt(10));
        p.embeddedObject = "not-number";
        Assert.assertEquals(10, p.getValueAsInt(10));

        p._currToken = null;
        Assert.assertEquals(55, p.getValueAsInt(55));
    }

    @Test
    public void testGetValueAsLong() throws IOException {
        DummyParser p = new DummyParser();
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.longVal = 42L;
        Assert.assertEquals(42L, p.getValueAsLong());
        Assert.assertEquals(42L, p.getValueAsLong(10L));

        p._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        p.longVal = 99L;
        Assert.assertEquals(99L, p.getValueAsLong());

        p._currToken = JsonToken.VALUE_TRUE;
        Assert.assertEquals(1L, p.getValueAsLong(10L));

        p._currToken = JsonToken.VALUE_FALSE;
        Assert.assertEquals(0L, p.getValueAsLong(10L));

        p._currToken = JsonToken.VALUE_NULL;
        Assert.assertEquals(0L, p.getValueAsLong(10L));

        p._currToken = JsonToken.VALUE_STRING;
        p.textResult = "456";
        Assert.assertEquals(456L, p.getValueAsLong(10L));
        p.textResult = "null";
        Assert.assertEquals(0L, p.getValueAsLong(10L));

        p._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        p.embeddedObject = Long.valueOf(88L);
        Assert.assertEquals(88L, p.getValueAsLong(10L));

        p._currToken = null;
        Assert.assertEquals(15L, p.getValueAsLong(15L));
    }

    @Test
    public void testGetValueAsDouble() throws IOException {
        DummyParser p = new DummyParser();
        p._currToken = JsonToken.VALUE_NUMBER_INT;
        p.doubleVal = 3.14;
        Assert.assertEquals(3.14, p.getValueAsDouble(0.0), 0.0001);

        p._currToken = JsonToken.VALUE_TRUE;
        Assert.assertEquals(1.0, p.getValueAsDouble(0.0), 0.0001);

        p._currToken = JsonToken.VALUE_FALSE;
        Assert.assertEquals(0.0, p.getValueAsDouble(5.0), 0.0001);

        p._currToken = JsonToken.VALUE_NULL;
        Assert.assertEquals(0.0, p.getValueAsDouble(5.0), 0.0001);

        p._currToken = JsonToken.VALUE_STRING;
        p.textResult = "2.718";
        Assert.assertEquals(2.718, p.getValueAsDouble(0.0), 0.0001);
        p.textResult = "null";
        Assert.assertEquals(0.0, p.getValueAsDouble(5.0), 0.0001);

        p._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        p.embeddedObject = Double.valueOf(1.23);
        Assert.assertEquals(1.23, p.getValueAsDouble(0.0), 0.0001);

        p._currToken = null;
        Assert.assertEquals(9.9, p.getValueAsDouble(9.9), 0.0001);
    }

    @Test
    public void testGetValueAsString() throws IOException {
        DummyParser p = new DummyParser();
        p._currToken = JsonToken.VALUE_STRING;
        p.textResult = "hello";
        Assert.assertEquals("hello", p.getValueAsString());
        Assert.assertEquals("hello", p.getValueAsString("default"));

        p._currToken = JsonToken.FIELD_NAME;
        p.currentNameResult = "propName";
        Assert.assertEquals("propName", p.getValueAsString());
        Assert.assertEquals("propName", p.getValueAsString("default"));

        p._currToken = JsonToken.VALUE_NULL;
        Assert.assertNull(p.getValueAsString());
        Assert.assertEquals("default", p.getValueAsString("default"));

        p._currToken = JsonToken.START_OBJECT;
        Assert.assertNull(p.getValueAsString());
        Assert.assertEquals("default", p.getValueAsString("default"));
    }

    @Test
    public void testAsciiHelpers() {
        byte[] bytes = ParserMinimalBase._asciiBytes("ABC");
        Assert.assertEquals(3, bytes.length);
        Assert.assertEquals('A', bytes[0]);

        String str = ParserMinimalBase._ascii(new byte[] { 65, 66, 67 });
        Assert.assertEquals("ABC", str);
    }

    @Test
    public void testGetCharDesc() {
        String descCtrl = ParserMinimalBase._getCharDesc(1);
        Assert.assertTrue(descCtrl.contains("CTRL-CHAR"));

        String descNormal = ParserMinimalBase._getCharDesc('a');
        Assert.assertTrue(descNormal.contains("'a'"));

        String descHigh = ParserMinimalBase._getCharDesc(300);
        Assert.assertTrue(descHigh.contains("0x12c"));
    }
}
