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

    // Helper method to create a delegate parser with a dummy delegate and a simple filter
    private FilteringParserDelegate createDelegate(TokenFilter filter, boolean includePath, boolean allowMultipleMatches) throws IOException {
        // Using a no-op JsonParserDelegate as the base
        // This mock parser needs to implement all abstract methods of JsonParser
        JsonParser delegateParser = new JsonParserDelegate(new JsonParser() {
            @Override
            public JsonToken nextToken() throws IOException { return null; }
            @Override
            public String getCurrentName() throws IOException { return null; }
            @Override
            public JsonLocation getCurrentLocation() { return null; }
            @Override
            public JsonStreamContext getParsingContext() { return null; }
            @Override
            public void close() throws IOException { }
            @Override
            public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0L; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
            @Override
            public JsonParser skipChildren() throws IOException { return this; } // Implement abstract method
            @Override
            public boolean canReadObjectId() { return false; }
            @Override
            public boolean canReadTypeId() { return false; }
            @Override
            public Object getObjectId() throws IOException { return null; }
            @Override
            public Object getTypeId() throws IOException { return null; }
        });
        return new FilteringParserDelegate(delegateParser, filter, includePath, allowMultipleMatches);
    }

    @Test
    public void testConstructorAndGetters() throws Exception {
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        boolean includePath = true;
        boolean allowMultipleMatches = false;
        FilteringParserDelegate delegate = createDelegate(filter, includePath, allowMultipleMatches);

        assertEquals(filter, delegate.getFilter());
        assertFalse(delegate._allowMultipleMatches);
        assertTrue(delegate._includePath);
        assertEquals(0, delegate.getMatchCount());
        assertNull(delegate.getCurrentToken());
        assertNull(delegate.getCurrentName());
    }

    @Test
    public void testInitialState() throws Exception {
        FilteringParserDelegate delegate = createDelegate(TokenFilter.INCLUDE_ALL, true, true);
        assertFalse(delegate.hasCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        assertNull(delegate.getLastClearedToken());
        // getParsingContext returns null initially, _filterContext() will return _headContext which is not null.
        // The test should check the _filterContext() behavior.
        assertNotNull(delegate.getParsingContext()); // _headContext is created in constructor
    }

    @Test
    public void testClearCurrentToken() throws Exception {
        FilteringParserDelegate delegate = createDelegate(TokenFilter.INCLUDE_ALL, true, true);
        // Simulate setting a token (though nextToken() is not fully functional here)
        delegate._currToken = JsonToken.VALUE_STRING;
        delegate.clearCurrentToken();
        assertNull(delegate.getCurrentToken());
        assertEquals(JsonToken.VALUE_STRING, delegate.getLastClearedToken());
    }

    @Test
    public void testOverrideCurrentName() throws Exception {
        FilteringParserDelegate delegate = createDelegate(TokenFilter.INCLUDE_ALL, true, true);
        try {
            delegate.overrideCurrentName("test");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testNextToken_StartObject_IncludeAll() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            @Override public JsonToken nextToken() { return JsonToken.START_OBJECT; }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0L; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);
        
        JsonToken token = fpDelegate.nextToken();
        assertEquals(JsonToken.START_OBJECT, token);
        assertTrue(fpDelegate._headContext.isStartHandled()); // For INCLUDE_ALL, start is handled
    }

    @Test
    public void testNextToken_EndObject_WhenStartHandled() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            @Override public JsonToken nextToken() { return JsonToken.END_OBJECT; }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0L; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);
        // Manually set up a state where start is handled
        fpDelegate._headContext = TokenFilterContext.createRootContext(TokenFilter.INCLUDE_ALL);
        fpDelegate._headContext.createChildObjectContext(TokenFilter.INCLUDE_ALL, true);
        fpDelegate._headContext.setFieldName("field"); // Simulate field name before END_OBJECT
        fpDelegate._itemFilter = TokenFilter.INCLUDE_ALL; // When filter is INCLUDE_ALL, startHandled becomes true
        
        JsonToken token = fpDelegate.nextToken(); // This should trigger the END_OBJECT logic
        assertEquals(JsonToken.END_OBJECT, token);
        // After END_OBJECT, _headContext becomes parent, _itemFilter becomes parent's filter.
        // If the parent was root, _headContext becomes null.
        assertNull(fpDelegate._headContext); 
        assertNull(fpDelegate._itemFilter);
    }


    @Test
    public void testNextToken_FieldName_Included() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            @Override public JsonToken nextToken() { return JsonToken.FIELD_NAME; }
            @Override public String getCurrentName() throws IOException { return "testField"; }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0L; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);
        
        JsonToken token = fpDelegate.nextToken();
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("testField", fpDelegate.getCurrentName());
    }

    @Test
    public void testNextToken_ScalarValue_Included() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            @Override public JsonToken nextToken() { return JsonToken.VALUE_STRING; }
            @Override public String getText() throws IOException { return "testValue"; }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0L; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return "testValue"; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return "testValue"; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);
        
        JsonToken token = fpDelegate.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("testValue", fpDelegate.getText());
    }

    @Test
    public void testNextToken_NullToken() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            @Override public JsonToken nextToken() { return null; }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0L; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);
        
        JsonToken token = fpDelegate.nextToken();
        assertNull(token);
    }

    @Test
    public void testNextValue_FieldName() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            private int callCount = 0;
            @Override public JsonToken nextToken() throws IOException {
                if (callCount == 0) {
                    callCount++;
                    return JsonToken.FIELD_NAME;
                }
                return JsonToken.VALUE_STRING;
            }
            @Override public String getCurrentName() throws IOException { return "testField"; }
            @Override public String getText() throws IOException { return "testValue"; }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0L; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return "testValue"; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return "testValue"; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException {
                if (callCount == 0) {
                    callCount++;
                    return JsonToken.FIELD_NAME; // nextToken() returns FIELD_NAME, nextValue should return it
                }
                return JsonToken.VALUE_STRING;
            }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);
        
        JsonToken token = fpDelegate.nextValue();
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("testField", fpDelegate.getCurrentName()); // getCurrentName should reflect the FIELD_NAME
        
        token = fpDelegate.nextValue(); // Should return the next value after FIELD_NAME
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("testValue", fpDelegate.getText());
    }

    @Test
    public void testSkipChildren_EmptyObject() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            private int callCount = 0;
            @Override public JsonToken nextToken() throws IOException {
                if (callCount == 0) {
                    callCount++;
                    return JsonToken.START_OBJECT;
                } else if (callCount == 1) {
                    callCount++;
                    return JsonToken.END_OBJECT;
                }
                return null;
            }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0L; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);

        fpDelegate.nextToken(); // Get START_OBJECT
        JsonParser resultParser = fpDelegate.skipChildren();
        assertNotNull(resultParser);
        assertEquals(JsonToken.END_OBJECT, fpDelegate.getCurrentToken()); // Should be at END_OBJECT after skipping
    }

    @Test
    public void testGettersForNumericValues() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            @Override public JsonToken nextToken() { return JsonToken.VALUE_NUMBER_INT; }
            @Override public int getIntValue() throws IOException { return 123; }
            @Override public long getLongValue() throws IOException { return 456L; }
            @Override public double getDoubleValue() throws IOException { return 78.9; }
            @Override public float getFloatValue() throws IOException { return 1.2f; }
            @Override public Number getNumberValue() throws IOException { return Integer.valueOf(123); }
            @Override public NumberType getNumberType() throws IOException { return NumberType.INT; }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return JsonToken.VALUE_NUMBER_INT; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NUMBER_INT; }
            @Override public boolean hasCurrentToken() { return true; }
            @Override public boolean hasTokenId(int id) { return id == JsonTokenId.ID_NUMBER_INT; }
            @Override public boolean hasToken(JsonToken t) { return t == JsonToken.VALUE_NUMBER_INT; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return "123"; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return BigInteger.valueOf(123); }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return BigDecimal.valueOf(78.9); }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);
        fpDelegate.nextToken(); // Advance to the number token

        assertEquals(123, fpDelegate.getIntValue());
        assertEquals(456L, fpDelegate.getLongValue());
        assertEquals(78.9, fpDelegate.getDoubleValue(), 0.0001);
        assertEquals(1.2f, fpDelegate.getFloatValue(), 0.0001f);
        assertEquals(Integer.valueOf(123), fpDelegate.getNumberValue());
        assertEquals(NumberType.INT, fpDelegate.getNumberType());
    }

    @Test
    public void testGettersAsInt_DefaultValue() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            @Override public JsonToken nextToken() { return null; } // No token
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getValueAsInt() throws IOException { return 0; } // No token, delegate returns 0
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; } // No token, delegate returns default
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(100, fpDelegate.getValueAsInt(100)); // Should return default
        assertEquals(200L, fpDelegate.getValueAsLong(200L));
        assertEquals(300.0, fpDelegate.getValueAsDouble(300.0), 0.0001);
        assertFalse(fpDelegate.getValueAsBoolean(false));
        assertEquals("defaultString", fpDelegate.getValueAsString("defaultString"));
    }

    @Test
    public void testGetParsingContext_Root() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            @Override public JsonToken nextToken() { return JsonToken.START_OBJECT; }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; } // Mock initial
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return JsonToken.START_OBJECT; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_START_OBJECT; }
            @Override public boolean hasCurrentToken() { return true; }
            @Override public boolean hasTokenId(int id) { return id == JsonTokenId.ID_START_OBJECT; }
            @Override public boolean hasToken(JsonToken t) { return t == JsonToken.START_OBJECT; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return true; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0L; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);
        fpDelegate.nextToken(); // Advance to START_OBJECT to create a context

        JsonStreamContext context = fpDelegate.getParsingContext();
        assertNotNull(context);
        assertEquals(JsonStreamContext.OBJECT, context.type());
        assertEquals("Root", context.toString()); // Default for root object
    }
    
    @Test
    public void testNextToken_AllowMultipleMatchesFalse_WithBuffer() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            private int callCount = 0;
            @Override public JsonToken nextToken() throws IOException {
                switch(callCount++) {
                    case 0: return JsonToken.START_OBJECT; // Outer object
                    case 1: return JsonToken.FIELD_NAME; // "nested"
                    case 2: return JsonToken.START_OBJECT; // Inner object
                    case 3: return JsonToken.END_OBJECT; // End inner object
                    case 4: return JsonToken.END_OBJECT; // End outer object
                    default: return null;
                }
            }
            @Override public String getCurrentName() throws IOException { return "nested"; }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods return null or default values as needed ...
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0L; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return null; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return defaultValue; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, false);

        JsonToken token = fpDelegate.nextToken(); // START_OBJECT
        assertEquals(JsonToken.START_OBJECT, token);

        token = fpDelegate.nextToken(); // FIELD_NAME ("nested")
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("nested", fpDelegate.getCurrentName());

        token = fpDelegate.nextToken(); // Should be START_OBJECT (inner)
        assertEquals(JsonToken.START_OBJECT, token);

        token = fpDelegate.nextToken(); // Should be END_OBJECT (inner)
        assertEquals(JsonToken.END_OBJECT, token);

        token = fpDelegate.nextToken(); // Should be END_OBJECT (outer)
        assertEquals(JsonToken.END_OBJECT, token);
        
        token = fpDelegate.nextToken(); // Should be null, as no more tokens and _allowMultipleMatches is false
        assertNull(token);
    }

    @Test
    public void testNextToken_AllowMultipleMatchesTrue_MultipleMatches() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            private int callCount = 0;
            @Override public JsonToken nextToken() throws IOException {
                switch(callCount++) {
                    case 0: return JsonToken.VALUE_STRING; // First match
                    case 1: return JsonToken.VALUE_NUMBER_INT; // Second match
                    default: return null;
                }
            }
            @Override public String getText() throws IOException {
                if (callCount <= 1) return "firstValue";
                return "123";
            }
            @Override public int getIntValue() throws IOException { return 123; }
            @Override public JsonParser skipChildren() { return this; }
            // ... other methods ...
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getValueAsInt() throws IOException { return 0; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return defaultValue; }
            @Override public long getValueAsLong() throws IOException { return 0L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return defaultValue; }
            @Override public double getValueAsDouble() throws IOException { return 0.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return defaultValue; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return defaultValue; }
            @Override public String getValueAsString() throws IOException { return getText(); }
            @Override public String getValueAsString(String defaultValue) throws IOException { return getValueAsString(); }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, true, true);

        JsonToken token = fpDelegate.nextToken(); // First match
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("firstValue", fpDelegate.getText());

        token = fpDelegate.nextToken(); // Second match
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals("123", fpDelegate.getText());
        assertEquals(123, fpDelegate.getIntValue());

        token = fpDelegate.nextToken(); // Should be null
        assertNull(token);
    }
    
    @Test
    public void testNextToken_NotIncludePath_And_NotAllowMultipleMatches_And_Scalar() throws Exception {
        JsonParser mockDelegate = new JsonParserDelegate(new JsonParser() {
            private int callCount = 0;
            @Override public JsonToken nextToken() throws IOException {
                if (callCount == 0) {
                    callCount++;
                    return JsonToken.VALUE_NUMBER_INT; // Scalar
                }
                return null;
            }
             @Override public int getIntValue() throws IOException { return 42; }
             @Override public Number getNumberValue() throws IOException { return Integer.valueOf(42); }
             @Override public NumberType getNumberType() throws IOException { return NumberType.INT; }
             @Override public JsonParser skipChildren() { return this; }
            // ... other methods ...
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public Object getInputSource() { return null; }
            @Override public boolean requiresCustomCodec() { return false; }
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public JsonParser enable(Feature f) { return this; }
            @Override public JsonParser disable(Feature f) { return this; }
            @Override public boolean isEnabled(Feature f) { return false; }
            @Override public int getFeatureMask() { return 0; }
            @Override public JsonParser setFeatureMask(int mask) { return this; }
            @Override public JsonParser overrideStdFeatures(int values, int mask) { return this; }
            @Override public JsonParser overrideFormatFeatures(int values, int mask) { return this; }
            @Override public FormatSchema getSchema() { return null; }
            @Override public void setSchema(FormatSchema schema) { }
            @Override public boolean canUseSchema(FormatSchema schema) { return false; }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_NO_TOKEN; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTokenId(int id) { return false; }
            @Override public boolean hasToken(JsonToken t) { return false; }
            @Override public boolean isExpectedStartArrayToken() { return false; }
            @Override public boolean isExpectedStartObjectToken() { return false; }
            @Override public void clearCurrentToken() { }
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) { }
            @Override public String getText() throws IOException { return "42"; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public double getDoubleValue() throws IOException { return 0.0; }
            @Override public float getFloatValue() throws IOException { return 0.0f; }
            @Override public int getValueAsInt() throws IOException { return 42; }
            @Override public int getValueAsInt(int defaultValue) throws IOException { return 42; }
            @Override public long getValueAsLong() throws IOException { return 42L; }
            @Override public long getValueAsLong(long defaultValue) throws IOException { return 42L; }
            @Override public double getValueAsDouble() throws IOException { return 42.0; }
            @Override public double getValueAsDouble(double defaultValue) throws IOException { return 42.0; }
            @Override public boolean getValueAsBoolean() throws IOException { return false; }
            @Override public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return false; }
            @Override public String getValueAsString() throws IOException { return "42"; }
            @Override public String getValueAsString(String defaultValue) throws IOException { return "42"; }
            @Override public Object getEmbeddedObject() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return null; }
            @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override
            public JsonToken nextValue() throws IOException { return nextToken(); }
        });
        FilteringParserDelegate fpDelegate = new FilteringParserDelegate(mockDelegate, TokenFilter.INCLUDE_ALL, false, false);

        JsonToken token = fpDelegate.nextToken(); // Scalar value
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals(42, fpDelegate.getIntValue());
        
        token = fpDelegate.nextToken(); // Should return null based on the logic in nextToken()
        assertNull(token);
    }
}
