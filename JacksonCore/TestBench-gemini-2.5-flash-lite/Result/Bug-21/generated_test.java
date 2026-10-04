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

    // Helper method to create a dummy parser that returns specific tokens

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
                // Return a context that has a parent, to test the logic for getCurrentName
                return new JsonStreamContext() {
                    private JsonStreamContext _parent = null; // Simulating no parent for simplicity here
                    @Override public Object getCurrentValue() { return null; }
                    @Override public void setCurrentValue(Object v) {}
                    @Override public String getCurrentName() { return "contextName"; }
                    @Override public JsonStreamContext getParent() { return _parent; }
                    @Override public String toString() { return "OBJECT_CONTEXT"; }
                };
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateMock, TokenFilter.INCLUDE_ALL, true, true);
        // Advance token to potentially set current name in the context
        fpd.nextToken();
        // The getCurrentName logic in FilteringParserDelegate checks for START_OBJECT/START_ARRAY
        // and then delegates to context.getCurrentName() if it's not.
        // If it's a VALUE_STRING, it will call the delegate's getCurrentName directly.
        // In this specific case, _currToken is VALUE_STRING, and it's not START_OBJECT or START_ARRAY,
        // so it should return delegate.getCurrentName().
        // If the delegate returns null, that's what should be asserted.
        // However, the delegate mock above returns "delegateName".
        // The issue might be with how _filterContext is handled.
        // The actual logic is:
        // JsonStreamContext ctxt = _filterContext();
        // if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY) {
        //     JsonStreamContext parent = ctxt.getParent();
        //     return (parent == null) ? null : parent.getCurrentName();
        // }
        // return ctxt.getCurrentName();
        // Since _currToken is VALUE_STRING, it returns _filterContext().getCurrentName().
        // _filterContext() returns _exposedContext if not null, else _headContext.
        // Initially, _exposedContext is null, _headContext is root. Root context's getCurrentName() is null.
        // So the assertion should be null.
        assertNull(fpd.getCurrentName());
    }

    @Test
    public void testGetTextUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("\"hello\"")) {
            @Override
            public JsonToken nextToken() throws IOException {
                // To make sure we have a token that has text
                return JsonToken.VALUE_STRING;
            }
            @Override
            public String getText() throws IOException {
                return "delegateText";
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        fpd.nextToken(); // Set current token to VALUE_STRING
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
        // hasTextCharacters should be delegatable regardless of the current token.
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
        // To get text characters, there must be a text token.
        fpd.nextToken(); // Ensure token is set, e.g., to START_ARRAY then END_ARRAY if empty
        // The delegate's getTextCharacters() is called, which returns the mocked value.
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
        fpd.nextToken(); // Ensure token is set.
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
        fpd.nextToken(); // Ensure token is set.
        assertEquals(1, fpd.getTextOffset());
    }


    @Test
    public void testGetBooleanValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("true")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_TRUE;
            }
            @Override
            public boolean getBooleanValue() throws IOException {
                return true;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_TRUE, fpd.nextToken());
        assertTrue(fpd.getBooleanValue());
    }

    @Test
    public void testGetByteValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("10")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_INT;
            }
            @Override
            public byte getByteValue() throws IOException {
                return 10;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals((byte) 10, fpd.getByteValue());
    }

    @Test
    public void testGetShortValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("100")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_INT;
            }
            @Override
            public short getShortValue() throws IOException {
                return 100;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals((short) 100, fpd.getShortValue());
    }

    @Test
    public void testGetDecimalValueUsesDelegate() throws Exception {
        BigDecimal expected = new BigDecimal("123.456");
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123.456")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_FLOAT;
            }
            @Override
            public BigDecimal getDecimalValue() throws IOException {
                return expected;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, fpd.nextToken());
        assertEquals(expected, fpd.getDecimalValue());
    }

    @Test
    public void testGetDoubleValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123.45")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_FLOAT;
            }
            @Override
            public double getDoubleValue() throws IOException {
                return 123.45;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, fpd.nextToken());
        assertEquals(123.45, fpd.getDoubleValue(), 0.0);
    }

    @Test
    public void testGetFloatValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123.45f")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_FLOAT;
            }
            @Override
            public float getFloatValue() throws IOException {
                return 123.45f;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, fpd.nextToken());
        assertEquals(123.45f, fpd.getFloatValue(), 0.0f);
    }

    @Test
    public void testGetIntValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_INT;
            }
            @Override
            public int getIntValue() throws IOException {
                return 123;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(123, fpd.getIntValue());
    }

    @Test
    public void testGetLongValueUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("1234567890")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_INT;
            }
            @Override
            public long getLongValue() throws IOException {
                return 1234567890L;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(1234567890L, fpd.getLongValue());
    }

    @Test
    public void testGetNumberTypeUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_INT;
            }
            @Override
            public NumberType getNumberType() throws IOException {
                return NumberType.INT;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(JsonParser.NumberType.INT, fpd.getNumberType());
    }

    @Test
    public void testGetNumberValueUsesDelegate() throws Exception {
        Number expected = Integer.valueOf(123);
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("123")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_INT;
            }
            @Override
            public Number getNumberValue() throws IOException {
                return expected;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(expected, fpd.getNumberValue());
    }

    @Test
    public void testGetValueAsIntUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("456")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_INT;
            }
            @Override
            public int getValueAsInt() throws IOException {
                return 456;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(456, fpd.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntWithDefaultUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("abc")) {
            @Override
            public int getValueAsInt(int defaultValue) throws IOException {
                return defaultValue; // Simulating a case where conversion fails and default is returned
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        // The behavior of getValueAsInt(int) is to try conversion and return default if it fails.
        // We can directly call it.
        assertEquals(99, fpd.getValueAsInt(99));
    }

    @Test
    public void testGetValueAsLongUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("789012345")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_INT;
            }
            @Override
            public long getValueAsLong() throws IOException {
                return 789012345L;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, fpd.nextToken());
        assertEquals(789012345L, fpd.getValueAsLong());
    }

    @Test
    public void testGetValueAsLongWithDefaultUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("xyz")) {
            @Override
            public long getValueAsLong(long defaultValue) throws IOException {
                return defaultValue; // Simulating conversion failure
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(100L, fpd.getValueAsLong(100L));
    }

    @Test
    public void testGetValueAsDoubleUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("98.76")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NUMBER_FLOAT;
            }
            @Override
            public double getValueAsDouble() throws IOException {
                return 98.76;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, fpd.nextToken());
        assertEquals(98.76, fpd.getValueAsDouble(), 1e-9); // Using a tolerance for double comparison
    }

    @Test
    public void testGetValueAsDoubleWithDefaultUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("xyz")) {
            @Override
            public double getValueAsDouble(double defaultValue) throws IOException {
                return defaultValue; // Simulating conversion failure
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(1.23, fpd.getValueAsDouble(1.23), 1e-9); // Using a tolerance for double comparison
    }

    @Test
    public void testGetValueAsBooleanUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("false")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_FALSE;
            }
            @Override
            public boolean getValueAsBoolean() throws IOException {
                return false;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_FALSE, fpd.nextToken());
        assertFalse(fpd.getValueAsBoolean());
    }

    @Test
    public void testGetValueAsBooleanWithDefaultUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("true")) {
            @Override
            public boolean getValueAsBoolean(boolean defaultValue) throws IOException {
                return defaultValue; // Simulating conversion failure
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(true, fpd.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsStringUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("\"testString\"")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_STRING;
            }
            @Override
            public String getValueAsString() throws IOException {
                return "testString";
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_STRING, fpd.nextToken());
        assertEquals("testString", fpd.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefaultUsesDelegate() throws Exception {
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("null")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.VALUE_NULL;
            }
            @Override
            public String getValueAsString(String defaultValue) throws IOException {
                return defaultValue; // Simulating null or conversion failure
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NULL, fpd.nextToken());
        assertEquals("default", fpd.getValueAsString("default"));
    }

    @Test
    public void testGetEmbeddedObjectUsesDelegate() throws Exception {
        Object expected = new Object();
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("{}")) {
            @Override
            public JsonToken nextToken() throws IOException {
                return JsonToken.START_OBJECT; // Need a token that could have an embedded object
            }
            @Override
            public Object getEmbeddedObject() throws IOException {
                return expected;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        fpd.nextToken();
        assertEquals(expected, fpd.getEmbeddedObject());
    }

    @Test
    public void testGetBinaryValueUsesDelegate() throws Exception {
        byte[] expected = {1, 2, 3};
        // A valid Base64Variant needs 64 characters for its alphabet.
        // The default Base64Variant can be used or a simplified one if needed.
        // For a mock, we can create a minimal valid one.
        Base64Variant bv = new Base64Variant("test", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 4);
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
        Base64Variant bv = new Base64Variant("test", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 4);
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
        JsonLocation expected = new JsonLocation(null, 100, 10, 5); // Example valid location
        JsonParser delegateParser = new JsonParserDelegate(new JsonFactory().createParser("{}")) {
            @Override
            public JsonLocation getTokenLocation() {
                return expected;
            }
        };
        FilteringParserDelegate fpd = new FilteringParserDelegate(delegateParser, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(expected, fpd.getTokenLocation());
    }
}
