package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.JsonParserDelegate;

public class FilteringParserDelegateTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a dummy delegate parser
    private JsonParser createDummyParser() {
        return new JsonParserDelegate(new JsonFactory().createParser("[]")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.END_ARRAY;
            }

            @Override
            public JsonToken getCurrentToken() {
                return JsonToken.END_ARRAY;
            }

            @Override
            public String getText() throws IOException {
                return super.getText();
            }

            @Override
            public int getIntValue() throws IOException {
                return 123;
            }

            @Override
            public double getDoubleValue() throws IOException {
                return 123.45;
            }

            @Override
            public JsonStreamContext getParsingContext() {
                return new JsonStreamContext() {
                    @Override public Object getCurrentValue() { return null; }
                    @Override public void setCurrentValue(Object v) {}
                    @Override public int getEntryCount() { return 0; }
                    @Override public int getIndex() { return 0; }
                    @Override public String getCurrentName() { return null; }
                    @Override public JsonStreamContext getParent() { return null; }
                    @Override public boolean inArray() { return false; }
                    @Override public boolean inObject() { return false; }
                    @Override public String toString() { return "DUMMY_CONTEXT"; }
                };
            }

            @Override
            public JsonLocation getCurrentLocation() {
                return JsonLocation.NA;
            }

            @Override
            public String getCurrentName() throws IOException {
                return "testName";
            }
        };
    }

    // Helper method to create a dummy parser that returns specific tokens
    private JsonParser createSpecificTokenParser(JsonToken... tokens) {
        class SpecificTokenParser extends JsonParserDelegate {
            private final JsonToken[] _tokens;
            private int _index = 0;
            private JsonToken _currentToken = null;

            SpecificTokenParser(JsonParser p, JsonToken... tokens) {
                super(p);
                _tokens = tokens;
            }

            @Override
            public JsonToken nextToken() throws IOException {
                if (_index < _tokens.length) {
                    _currentToken = _tokens[_index++];
                    return _currentToken;
                }
                _currentToken = null;
                return null;
            }

            @Override
            public JsonToken getCurrentToken() {
                return _currentToken;
            }

            @Override
            public String getText() throws IOException {
                if (_currentToken == JsonToken.FIELD_NAME) return "fieldName";
                if (_currentToken == JsonToken.VALUE_STRING) return "stringValue";
                return super.getText();
            }

            @Override
            public int getIntValue() throws IOException { return 42; }

            @Override
            public double getDoubleValue() throws IOException { return 42.5; }

            @Override
            public JsonStreamContext getParsingContext() {
                return new JsonStreamContext() {
                    @Override public Object getCurrentValue() { return null; }
                    @Override public void setCurrentValue(Object v) {}
                    @Override public int getEntryCount() { return 0; }
                    @Override public int getIndex() { return 0; }
                    @Override public String getCurrentName() { return "currentName"; }
                    @Override public JsonStreamContext getParent() { return null; }
                    @Override public boolean inArray() { return false; }
                    @Override public boolean inObject() { return false; }
                    @Override public String toString() { return "SPECIFIC_CONTEXT"; }
                };
            }
             @Override
            public JsonLocation getCurrentLocation() {
                return JsonLocation.NA;
            }
        }
        JsonParser delegateParser = new JsonFactory().createParser("{}");
        return new SpecificTokenParser(delegateParser, tokens);
    }

    @Test
    public void testConstructorAndGetFilter() throws Exception {
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, filter, true, true);
        assertNotNull(fpd);
        assertEquals(filter, fpd.getFilter());
    }

    @Test
    public void testConstructorAndAllowMultipleMatches() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertTrue(fpd._allowMultipleMatches);

        FilteringParserDelegate fpdFalse = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, false);
        assertFalse(fpdFalse._allowMultipleMatches);
    }

    @Test
    public void testConstructorAndIncludePath() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertTrue(fpd._includePath);

        FilteringParserDelegate fpdFalse = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, false, true);
        assertFalse(fpdFalse._includePath);
    }

    @Test
    public void testGetMatchCountInitiallyZero() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(0, fpd.getMatchCount());
    }

    @Test
    public void testGetParsingContextInitiallyRoot() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertNotNull(fpd.getParsingContext());
        assertEquals("ROOT", fpd.getParsingContext().toString());
    }

    @Test
    public void testCurrentTokenIsNullInitially() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertNull(fpd.getCurrentToken());
        assertNull(fpd.currentToken());
    }

    @Test
    public void testCurrentTokenIdIsNoTokenInitially() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonTokenId.ID_NO_TOKEN, fpd.getCurrentTokenId());
        assertEquals(JsonTokenId.ID_NO_TOKEN, fpd.currentTokenId());
    }

    @Test
    public void testHasCurrentTokenIsFalseInitially() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertFalse(fpd.hasCurrentToken());
    }

    @Test
    public void testHasTokenIdNoTokenInitially() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertTrue(fpd.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(fpd.hasTokenId(JsonTokenId.ID_OBJECT));
    }

    @Test
    public void testHasTokenFalseInitially() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertFalse(fpd.hasToken(JsonToken.START_OBJECT));
    }

    @Test
    public void testIsExpectedStartArrayTokenFalseInitially() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertFalse(fpd.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartObjectTokenFalseInitially() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertFalse(fpd.isExpectedStartObjectToken());
    }

    @Test
    public void testGetCurrentLocationUsesDelegate() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(delegateParser.getCurrentLocation(), fpd.getCurrentLocation());
    }

    @Test
    public void testGetCurrentNameUsesDelegateWhenStructIsNil() throws Exception {
        JsonParser delegateMock = new JsonParserDelegate(new JsonFactory().createParser("{}")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_STRING;
            }
            @Override
            public JsonToken getCurrentToken() {
                return JsonToken.VALUE_STRING;
            }
            @Override
            public String getCurrentName() throws IOException {
                return "delegateName";
            }
            @Override
            public JsonStreamContext getParsingContext() {
                return new JsonStreamContext() {
                    @Override public Object getCurrentValue() { return null; }
                    @Override public void setCurrentValue(Object v) {}
                    @Override public int getEntryCount() { return 1; }
                    @Override public int getIndex() { return 0; }
                    @Override public String getCurrentName() { return "contextName"; }
                    @Override public JsonStreamContext getParent() { return null; }
                    @Override public boolean inArray() { return false; }
                    @Override public boolean inObject() { return true; }
                    @Override public String toString() { return "OBJECT_CONTEXT"; }
                };
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateMock, TokenFilter.INCLUDE_ALL, true, true);
        fpd.nextToken();
        assertEquals("contextName", fpd.getCurrentName());
    }


    @Test
    public void testClearCurrentTokenSetsToNull() throws Exception {
        JsonParser delegateParser = createSpecificTokenParser(JsonToken.VALUE_STRING);
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        fpd.nextToken();
        assertNotNull(fpd.getCurrentToken());
        fpd.clearCurrentToken();
        assertNull(fpd.getCurrentToken());
    }

    @Test
    public void testGetLastClearedToken() throws Exception {
        JsonParser delegateParser = createSpecificTokenParser(JsonToken.VALUE_STRING, JsonToken.END_OBJECT);
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        fpd.nextToken();
        fpd.clearCurrentToken();
        assertEquals(JsonToken.VALUE_STRING, fpd.getLastClearedToken());
        fpd.nextToken();
        fpd.clearCurrentToken();
        assertEquals(JsonToken.END_OBJECT, fpd.getLastClearedToken());
    }

    @Test
    public void testOverrideCurrentNameThrowsUnsupportedOperationException() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        try {
            fpd.overrideCurrentName("newName");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testNextTokenHandlesEndOfInput() throws Exception {
        JsonParser delegateParser = createSpecificTokenParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertNull(fpd.nextToken());
    }

    @Test
    public void testNextTokenWithIncludePathAndMultipleMatches() throws Exception {
        JsonParser delegateParser = createSpecificTokenParser(
            JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_NUMBER_INT,
            JsonToken.FIELD_NAME, JsonToken.VALUE_NUMBER_INT, JsonToken.END_OBJECT
        );
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.START_OBJECT, fpd.nextToken());
        assertEquals(JsonToken.FIELD_NAME, fpd.nextToken());
        assertEquals("fieldName", fpd.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(42, fpd.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, fpd.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(42, fpd.getIntValue());
        assertEquals(JsonToken.END_OBJECT, fpd.nextToken());
        assertNull(fpd.nextToken());
    }

    @Test
    public void testNextTokenFiltersScalarValue() throws Exception {
        TokenFilter excludeNumberOne = new TokenFilter() {
            @Override
            public boolean includeValue(JsonParser p) throws IOException {
                return p.getIntValue() != 1;
            }
        };
        JsonParser delegateParser = createSpecificTokenParser(
            JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_NUMBER_INT, JsonToken.END_OBJECT
        );
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, excludeNumberOne, false, false);

        assertEquals(JsonToken.START_OBJECT, fpd.nextToken());
        assertEquals(JsonToken.FIELD_NAME, fpd.nextToken());
        assertEquals(JsonToken.END_OBJECT, fpd.nextToken());
        assertNull(fpd.nextToken());
    }

    @Test
    public void testNextTokenSkipsChildrenWhenFilterReturnsNull() throws Exception {
        TokenFilter filterReturnsNullForObject = new TokenFilter() {
            @Override
            public TokenFilter filterStartObject() {
                return null;
            }
        };
        JsonParser delegateParser = createSpecificTokenParser(
            JsonToken.START_OBJECT, JsonToken.FIELD_NAME,
            JsonToken.START_OBJECT, JsonToken.FIELD_NAME,
            JsonToken.VALUE_NUMBER_INT,
            JsonToken.END_OBJECT, JsonToken.END_OBJECT
        );
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, filterReturnsNullForObject, false, false);

        assertEquals(JsonToken.START_OBJECT, fpd.nextToken());
        assertEquals(JsonToken.FIELD_NAME, fpd.nextToken());
        assertEquals(JsonToken.END_OBJECT, fpd.nextToken());
        assertNull(fpd.nextToken());
    }

    @Test
    public void testNextValueSkipsFieldNameWhenPresent() throws Exception {
        JsonParser delegateParser = createSpecificTokenParser(
            JsonToken.FIELD_NAME, JsonToken.VALUE_STRING
        );
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.FIELD_NAME, fpd.nextToken());
        assertEquals(JsonToken.VALUE_STRING, fpd.nextValue());
    }

    @Test
    public void testSkipChildrenWhenCurrentTokenIsNotStructStart() throws Exception {
        JsonParser delegateParser = createSpecificTokenParser(JsonToken.VALUE_STRING);
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        fpd.nextToken();
        assertNotNull(fpd.skipChildren());
        assertEquals(JsonToken.VALUE_STRING, fpd.getCurrentToken());
    }

    @Test
    public void testSkipChildrenHandlesNestedStructures() throws Exception {
        JsonParser delegateParser = createSpecificTokenParser(
            JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.START_ARRAY,
            JsonToken.VALUE_NUMBER_INT, JsonToken.END_ARRAY, JsonToken.END_OBJECT
        );
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        fpd.nextToken();
        assertNotNull(fpd.skipChildren());
        assertEquals(JsonToken.END_OBJECT, fpd.getCurrentToken());
    }

    @Test
    public void testGetTextUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("\"hello\"")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_STRING;
            }
            @Override
            public String getText() throws IOException {
                return "delegateText";
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        fpd.nextToken();
        assertEquals("delegateText", fpd.getText());
    }

    @Test
    public void testHasTextCharactersUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("\"hello\"")) {
            @Override
            public boolean hasTextCharacters() {
                return true;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertTrue(fpd.hasTextCharacters());
    }

    @Test
    public void testGetTextCharactersUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("\"hello\"")) {
            @Override
            public char[] getTextCharacters() throws IOException {
                return new char[]{'h', 'e', 'l', 'l', 'o'};
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, fpd.getTextCharacters());
    }

    @Test
    public void testGetTextLengthUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("\"hello\"")) {
            @Override
            public int getTextLength() throws IOException {
                return 5;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(5, fpd.getTextLength());
    }

    @Test
    public void testGetTextOffsetUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("\"hello\"")) {
            @Override
            public int getTextOffset() throws IOException {
                return 1;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(1, fpd.getTextOffset());
    }

    @Test
    public void testGetBigIntegerValueUsesDelegate() throws Exception {
        BigInteger expected = new BigInteger("12345678901234567890");
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("12345678901234567890")) {
            @Override
            public BigInteger getBigIntegerValue() throws IOException {
                return expected;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(expected, fpd.getBigIntegerValue());
    }

    @Test
    public void testGetBooleanValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("true")) {
            @Override
            public boolean getBooleanValue() throws IOException {
                return true;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertTrue(fpd.getBooleanValue());
    }

    @Test
    public void testGetByteValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("10")) {
            @Override
            public byte getByteValue() throws IOException {
                return 10;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals((byte) 10, fpd.getByteValue());
    }

    @Test
    public void testGetShortValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("100")) {
            @Override
            public short getShortValue() throws IOException {
                return 100;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals((short) 100, fpd.getShortValue());
    }

    @Test
    public void testGetDecimalValueUsesDelegate() throws Exception {
        BigDecimal expected = new BigDecimal("123.456");
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123.456")) {
            @Override
            public BigDecimal getDecimalValue() throws IOException {
                return expected;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(expected, fpd.getDecimalValue());
    }

    @Test
    public void testGetDoubleValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123.45")) {
            @Override
            public double getDoubleValue() throws IOException {
                return 123.45;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(123.45, fpd.getDoubleValue(), 0.0);
    }

    @Test
    public void testGetFloatValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123.45f")) {
            @Override
            public float getFloatValue() throws IOException {
                return 123.45f;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(123.45f, fpd.getFloatValue(), 0.0f);
    }

    @Test
    public void testGetIntValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123")) {
            @Override
            public int getIntValue() throws IOException {
                return 123;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(123, fpd.getIntValue());
    }

    @Test
    public void testGetLongValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("1234567890")) {
            @Override
            public long getLongValue() throws IOException {
                return 1234567890L;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(1234567890L, fpd.getLongValue());
    }

    @Test
    public void testGetNumberTypeUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123")) {
            @Override
            public NumberType getNumberType() throws IOException {
                return NumberType.INT;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(NumberType.INT, fpd.getNumberType());
    }

    @Test
    public void testGetNumberValueUsesDelegate() throws Exception {
        Number expected = Integer.valueOf(123);
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123")) {
            @Override
            public Number getNumberValue() throws IOException {
                return expected;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(expected, fpd.getNumberValue());
    }

    @Test
    public void testGetValueAsIntUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("456")) {
            @Override
            public int getValueAsInt() throws IOException {
                return 456;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(456, fpd.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntWithDefaultUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("abc")) {
            @Override
            public int getValueAsInt(int defaultValue) throws IOException {
                return defaultValue;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(99, fpd.getValueAsInt(99));
    }

    @Test
    public void testGetValueAsLongUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("789012345")) {
            @Override
            public long getValueAsLong() throws IOException {
                return 789012345L;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(789012345L, fpd.getValueAsLong());
    }

    @Test
    public void testGetValueAsLongWithDefaultUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("xyz")) {
            @Override
            public long getValueAsLong(long defaultValue) throws IOException {
                return defaultValue;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(100L, fpd.getValueAsLong(100L));
    }

    @Test
    public void testGetValueAsDoubleUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("98.76")) {
            @Override
            public double getValueAsDouble() throws IOException {
                return 98.76;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(98.76, fpd.getValueAsDouble(), 0.0);
    }

    @Test
    public void testGetValueAsDoubleWithDefaultUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("xyz")) {
            @Override
            public double getValueAsDouble(double defaultValue) throws IOException {
                return defaultValue;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(1.23, fpd.getValueAsDouble(1.23));
    }

    @Test
    public void testGetValueAsBooleanUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("false")) {
            @Override
            public boolean getValueAsBoolean() throws IOException {
                return false;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertFalse(fpd.getValueAsBoolean());
    }

    @Test
    public void testGetValueAsBooleanWithDefaultUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("true")) {
            @Override
            public boolean getValueAsBoolean(boolean defaultValue) throws IOException {
                return defaultValue;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertTrue(fpd.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsStringUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("\"testString\"")) {
            @Override
            public String getValueAsString() throws IOException {
                return "testString";
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals("testString", fpd.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefaultUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("null")) {
            @Override
            public String getValueAsString(String defaultValue) throws IOException {
                return defaultValue;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals("default", fpd.getValueAsString("default"));
    }

    @Test
    public void testGetEmbeddedObjectUsesDelegate() throws Exception {
        Object expected = new Object();
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("{}")) {
            @Override
            public Object getEmbeddedObject() throws IOException {
                return expected;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(expected, fpd.getEmbeddedObject());
    }

    @Test
    public void testGetBinaryValueUsesDelegate() throws Exception {
        byte[] expected = {1, 2, 3};
        Base64Variant bv = new Base64Variant("dummy", "A", false, '\0', 4);
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("{}")) {
            @Override
            public byte[] getBinaryValue(Base64Variant b64variant) throws IOException {
                return expected;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertArrayEquals(expected, fpd.getBinaryValue(bv));
    }

    @Test
    public void testReadBinaryValueUsesDelegate() throws Exception {
        byte[] expected = {1, 2, 3};
        Base64Variant bv = new Base64Variant("dummy", "A", false, '\0', 4);
        OutputStream mockOut = new java.io.ByteArrayOutputStream();
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("{}")) {
            @Override
            public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException {
                out.write(expected);
                return expected.length;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(expected.length, fpd.readBinaryValue(bv, mockOut));
        assertArrayEquals(expected, ((java.io.ByteArrayOutputStream) mockOut).toByteArray());
    }

    @Test
    public void testGetTokenLocationUsesDelegate() throws Exception {
        JsonLocation expected = new JsonLocation(null, 0, 1, 1);
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("{}")) {
            @Override
            public JsonLocation getTokenLocation() {
                return expected;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(expected, fpd.getTokenLocation());
    }

    @Test
    public void testFilterContextHandlesExposedContextWhenNotNull() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        fpd._exposedContext = TokenFilterContext.createRootContext(TokenFilter.INCLUDE_ALL);
        assertEquals(fpd._exposedContext, fpd._filterContext());
    }

    @Test
    public void testFilterContextUsesHeadContextWhenExposedIsNull() throws Exception {
        JsonParser delegateParser = createDummyParser();
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(fpd._headContext, fpd._filterContext());
    }
}
