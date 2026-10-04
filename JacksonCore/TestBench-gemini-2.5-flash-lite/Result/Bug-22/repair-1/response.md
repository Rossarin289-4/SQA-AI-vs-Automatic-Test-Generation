```java
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

    // Mocking JsonParser for basic tests where delegate behavior is not critical.
    // For more complex scenarios, a more sophisticated mock or a real parser
    // with controlled input would be needed.
    private static class MockJsonParser extends JsonParserDelegate {
        private JsonToken _currentToken;
        private String _currentName;
        private int _intVal;
        private double _doubleVal;
        private long _longVal;
        private String _textVal;
        private JsonToken _lastClearedToken;

        public MockJsonParser() {
            super(null); // delegate is null, not ideal but sufficient for some tests
        }

        public void setCurrentToken(JsonToken token) {
            _currentToken = token;
        }

        public void setCurrentName(String name) {
            _currentName = name;
        }

        public void setIntValue(int value) {
            _intVal = value;
        }

        public void setDoubleValue(double value) {
            _doubleVal = value;
        }
        
        public void setLongValue(long value) { // Added setter for long
            _longVal = value;
        }

        public void setTextValue(String value) {
            _textVal = value;
        }

        @Override
        public JsonToken getCurrentToken() {
            return _currentToken;
        }

        @Override
        public String getCurrentName() throws IOException {
            return _currentName;
        }

        @Override
        public int getIntValue() throws IOException {
            return _intVal;
        }

        @Override
        public double getDoubleValue() throws IOException {
            return _doubleVal;
        }
        
        @Override
        public long getLongValue() throws IOException { // Added implementation for long
            return _longVal;
        }

        @Override
        public String getText() throws IOException {
            return _textVal;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            // Simple mock: just return current token and clear it, or null if no token
            JsonToken tokenToReturn = _currentToken;
            // When a token is returned, it becomes the current token of the delegate
            if (tokenToReturn != null) {
                // This part is tricky for a mock. The actual delegate would update its internal state.
                // For simplicity, we'll assume the 'current token' state is managed by the caller setting it.
                // The act of returning a token doesn't inherently clear the *next* one to be read.
                // We will rely on the caller to set the *next* _currentToken for the subsequent call.
            }
            // Clear the token that was just "returned" so subsequent calls to getCurrentToken() would return null
            // if not explicitly set again. This is a simplification.
            _currentToken = null; 
            _currentName = null; // Clear name too, as it's tied to FIELD_NAME
            return tokenToReturn;
        }
        
        @Override
        public JsonToken nextValue() throws IOException {
            JsonToken t = nextToken();
            if (t == JsonToken.FIELD_NAME) {
                t = nextToken();
            }
            return t;
        }

        @Override
        public JsonParser skipChildren() throws IOException {
            // In a real scenario, this would need to advance the parser past the children.
            // For this mock, we assume it does nothing or is not critical for the test.
            return this;
        }

        // Override other methods to avoid null pointer exceptions if called,
        // even if their behavior isn't fully mocked.
        @Override
        public JsonStreamContext getParsingContext() {
            // The actual FilteringParserDelegate's _filterContext() would return _headContext
            // if _exposedContext is null. We can simulate that by ensuring _headContext is not null.
            // For a simple mock, returning null might be acceptable if the test doesn't rely on it.
            // However, the FilteringParserDelegate constructor initializes _headContext.
            // Let's return a placeholder or ensure it's not null.
            if (_headContext == null) { // _headContext is a field in the actual FilteringParserDelegate
                // For the purpose of this mock, let's assume a basic context exists.
                // This mock doesn't have _headContext, so we return null to avoid NPE.
                return null; 
            }
            return _headContext; // This field doesn't exist in MockJsonParser, only in FilteringParserDelegate.
                                 // So returning null is safer.
        }

        @Override
        public boolean hasCurrentToken() {
            return _currentToken != null;
        }

        @Override
        public void clearCurrentToken() {
            _lastClearedToken = _currentToken; // Store the token being cleared
            _currentToken = null;
        }

        @Override
        public JsonToken getLastClearedToken() {
            return _lastClearedToken;
        }

        @Override
        public void overrideCurrentName(String name) {
            _currentName = name;
        }
        
        @Override
        public BigInteger getBigIntegerValue() throws IOException { return BigInteger.ZERO; }
        @Override
        public boolean getBooleanValue() throws IOException { return false; }
        @Override
        public byte getByteValue() throws IOException { return 0; }
        @Override
        public short getShortValue() throws IOException { return 0; }
        @Override
        public BigDecimal getDecimalValue() throws IOException { return BigDecimal.ZERO; }
        @Override
        public float getFloatValue() throws IOException { return 0.0f; }
        @Override
        public NumberType getNumberType() throws IOException { return NumberType.INT; }
        @Override
        public Number getNumberValue() throws IOException { return Integer.valueOf(0); }

        @Override
        public int getValueAsInt() throws IOException { return _intVal; }
        @Override
        public int getValueAsInt(int defaultValue) throws IOException { return (_currentToken != null) ? _intVal : defaultValue; }
        @Override
        public long getValueAsLong() throws IOException { return _longVal; }
        @Override
        public long getValueAsLong(long defaultValue) throws IOException { return (_currentToken != null) ? _longVal : defaultValue; }
        @Override
        public double getValueAsDouble() throws IOException { return _doubleVal; }
        @Override
        public double getValueAsDouble(double defaultValue) throws IOException { return (_currentToken != null) ? _doubleVal : defaultValue; }
        @Override
        public boolean getValueAsBoolean() throws IOException { return false; }
        @Override
        public boolean getValueAsBoolean(boolean defaultValue) throws IOException { return (_currentToken != null) ? false : defaultValue; }
        @Override
        public String getValueAsString() throws IOException { return _textVal; }
        @Override
        public String getValueAsString(String defaultValue) throws IOException { return (_currentToken != null) ? _textVal : defaultValue; }

        @Override
        public Object getEmbeddedObject() throws IOException { return null; }
        @Override
        public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }
        @Override
        public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
        @Override
        public JsonLocation getTokenLocation() { return JsonLocation.NA; }
        @Override
        public boolean hasTextCharacters() { return _textVal != null; }
        @Override
        public char[] getTextCharacters() throws IOException { return (_textVal != null) ? _textVal.toCharArray() : new char[0]; }
        @Override
        public int getTextLength() throws IOException { return (_textVal != null) ? _textVal.length() : 0; }
        @Override
        public int getTextOffset() throws IOException { return 0; }
        @Override
        public boolean isNaN() throws IOException { return false; }
    }

    // Helper to create a FilteringParserDelegate with specific configurations
    private FilteringParserDelegate createFilteringParser(JsonParser delegate, TokenFilter filter, boolean includePath, boolean allowMultipleMatches) {
        return new FilteringParserDelegate(delegate, filter, includePath, allowMultipleMatches);
    }

    // --- Constructor Tests ---
    @Test
    public void testConstructorInitialization() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate parser = createFilteringParser(delegate, filter, true, false);

        assertNotNull(parser.rootFilter);
        assertEquals(filter, parser.rootFilter);
        assertNotNull(parser._headContext);
        assertEquals(filter, parser._itemFilter);
        assertTrue(parser._includePath);
        assertFalse(parser._allowMultipleMatches);
    }

    // --- Configuration Accessors ---
    @Test
    public void testGetFilter() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        TokenFilter filter = new TokenFilter() {}; // Anonymous subclass
        FilteringParserDelegate parser = createFilteringParser(delegate, filter, false, true);
        assertSame(filter, parser.getFilter());
    }

    @Test
    public void testGetMatchCount_initial() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(0, parser.getMatchCount());
    }

    // --- Current Token and State Accessors ---
    @Test
    public void testGetCurrentToken_initial() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        assertNull(parser.getCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
        assertFalse(parser.hasCurrentToken());
    }

    @Test
    public void testClearCurrentToken() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        parser.nextToken(); // Sets _currToken
        assertNotNull(parser.getCurrentToken());
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
        assertEquals(JsonToken.VALUE_STRING, parser.getLastClearedToken());
    }

    @Test
    public void testOverrideCurrentName() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        String name = "testName";
        parser.overrideCurrentName(name);
        assertEquals(name, parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName_empty() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        parser.overrideCurrentName("");
        assertEquals("", parser.getCurrentName());
    }

    @Test
    public void testOverrideCurrentName_null() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        parser.overrideCurrentName(null);
        assertNull(parser.getCurrentName());
    }

    // --- nextToken() behavior ---

    // Test case: Simple string value, no filtering, should just pass through
    @Test
    public void testNextToken_simpleStringValue() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("hello");
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);

        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_STRING, token);
        assertEquals("hello", parser.getText());
    }

    // Test case: Field name, should pass through with INCLUDE_ALL
    @Test
    public void testNextToken_fieldName_includeAll() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("fieldName");
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);

        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("fieldName", parser.getCurrentName());
    }

    // Test case: Start Object, should pass through with INCLUDE_ALL
    @Test
    public void testNextToken_startObject_includeAll() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.START_OBJECT);
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);

        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_OBJECT, token);
    }

    // Test case: End Object, should pass through with INCLUDE_ALL
    @Test
    public void testNextToken_endObject_includeAll() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.END_OBJECT);
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);

        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.END_OBJECT, token);
    }

    // Test case: Start Array, should pass through with INCLUDE_ALL
    @Test
    public void testNextToken_startArray_includeAll() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.START_ARRAY);
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);

        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_ARRAY, token);
    }

    // Test case: End Array, should pass through with INCLUDE_ALL
    @Test
    public void testNextToken_endArray_includeAll() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.END_ARRAY);
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);

        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.END_ARRAY, token);
    }

    // Test case: Null token, end of input
    @Test
    public void testNextToken_nullToken() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        // delegate.setCurrentToken(null); // This is implicitly handled if delegate.nextToken() returns null.
        // For the mock, we'll simulate delegate.nextToken() returning null.
        // The parser's nextToken() calls delegate.nextToken(). If delegate.nextToken() returns null,
        // parser.nextToken() returns null.
        
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);

        JsonToken token = parser.nextToken(); // This will call delegate.nextToken() which returns null in this mock setup.
        assertNull(token);
    }

    // Test case: Filter that explicitly denies a property
    @Test
    public void testNextToken_filterDeniesProperty() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        
        // Mock structure: {"key1": "value1", "key2": "value2"}
        // Filter will deny "key2"
        TokenFilter denyingFilter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("key2".equals(name)) {
                    return TokenFilter. நோக்க; // Deny
                }
                return TokenFilter.INCLUDE_ALL;
            }
        };
        
        FilteringParserDelegate parser = createFilteringParser(delegate, denyingFilter, false, false);

        // Simulate reading "key1"
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("key1");
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key1", parser.getCurrentName());

        // Simulate reading "value1" (should be included)
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("value1");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value1", parser.getText());

        // Simulate reading "key2" (should be filtered out)
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("key2");
        
        // When 'key2' is denied, the parser calls delegate.nextToken() and then delegate.skipChildren().
        // The next token returned by parser.nextToken() will be whatever delegate.nextToken() returns AFTER skipping.
        // We need to simulate the delegate's behavior to reflect this.
        // For this mock, we'll set the *next* token that the delegate would return AFTER skipping.
        delegate.setCurrentToken(JsonToken.END_OBJECT); // Assume this is next after "key2":"value2" is skipped
        JsonToken tokenAfterDenied = parser.nextToken();
        
        assertEquals(JsonToken.END_OBJECT, tokenAfterDenied);
    }
    
    // Test case: Filter that explicitly includes a property
    @Test
    public void testNextToken_filterIncludesProperty() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("includedField");
        
        TokenFilter includingFilter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("includedField".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return TokenFilter. நோக்க;
            }
        };
        
        FilteringParserDelegate parser = createFilteringParser(delegate, includingFilter, false, false);
        
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("includedField", parser.getCurrentName());
    }

    // Test case: Filter that explicitly denies a value
    @Test
    public void testNextToken_filterDeniesValue() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        delegate.setIntValue(123);
        
        TokenFilter denyingFilter = new TokenFilter() {
            @Override
            public boolean includeValue(JsonParser p) throws IOException {
                return false; // Deny all scalar values
            }
        };
        
        FilteringParserDelegate parser = createFilteringParser(delegate, denyingFilter, false, false);
        
        // The parser should read the token, check the filter, and if denied,
        // it should continue to the next token without returning the denied value.
        // The actual return value depends on what `_nextToken2` does after a denied value.
        // In this case, after denying a scalar value, the loop in _nextToken2 continues.
        // We need to simulate the delegate returning the *next* token.
        delegate.setCurrentToken(JsonToken.END_OBJECT); // Simulate next token after denied value
        JsonToken token = parser.nextToken(); 
        
        assertEquals(JsonToken.END_OBJECT, token); 
    }
    
    // Test case: Filter that explicitly includes a value
    @Test
    public void testNextToken_filterIncludesValue() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        delegate.setIntValue(456);
        
        TokenFilter includingFilter = new TokenFilter() {
            @Override
            public boolean includeValue(JsonParser p) throws IOException {
                return true; // Include all scalar values
            }
        };
        
        FilteringParserDelegate parser = createFilteringParser(delegate, includingFilter, false, false);
        
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals(456, parser.getIntValue());
    }

    // Test case: Multiple matches allowed, first match returns INCLUDE_ALL
    @Test
    public void testNextToken_allowMultipleMatches_includeAll() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("first match");
        
        // A filter that returns INCLUDE_ALL for the first token and then continues
        TokenFilter filter = new TokenFilter() {
            private int callCount = 0;
            @Override
            public TokenFilter includeProperty(String name) {
                callCount++; // Increment on each property check
                if (callCount == 1) return TokenFilter.INCLUDE_ALL;
                return TokenFilter. நோக்க;
            }
            @Override
            public boolean includeValue(JsonParser p) throws IOException {
                callCount++; // Increment on each value check
                if (callCount == 1) return true;
                return false;
            }
        };
        
        FilteringParserDelegate parser = createFilteringParser(delegate, filter, false, true); // allowMultipleMatches = true
        
        JsonToken token1 = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token1);
        assertEquals("first match", parser.getText());
        assertEquals(1, parser._matchCount);

        // Now, assume the next token is a field name, and this time the filter should deny.
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("secondField");
        
        // When 'secondField' is processed, includeProperty is called, callCount becomes 2, returns TokenFilter. நோக்க.
        // Then, delegate.nextToken() and delegate.skipChildren() are called.
        // We need to simulate the delegate returning the token after skipping.
        delegate.setCurrentToken(JsonToken.END_OBJECT); // Simulate next token after "secondField" and its value are skipped
        JsonToken token2 = parser.nextToken(); 
        
        assertEquals(JsonToken.END_OBJECT, token2);
        assertEquals(1, parser._matchCount); // Match count should remain 1
    }

    // Test case: Multiple matches NOT allowed, first match returns INCLUDE_ALL
    @Test
    public void testNextToken_noMultipleMatches_includeAll() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("first match");
        
        // Filter that returns INCLUDE_ALL on first call
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        
        FilteringParserDelegate parser = createFilteringParser(delegate, filter, false, false); // allowMultipleMatches = false
        
        JsonToken token1 = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token1);
        assertEquals("first match", parser.getText());
        assertEquals(1, parser._matchCount); // First match increments match count

        // Now, expect nextToken to return null because allowMultipleMatches is false and we've had a match.
        // The internal logic has a check `if (!_allowMultipleMatches && (_currToken != null) && (_exposedContext == null))`
        // and if `_currToken.isScalarValue() && !_headContext.isStartHandled() && !_includePath && (_itemFilter == TokenFilter.INCLUDE_ALL))`
        // it returns null. This test case needs careful setup to hit that path.
        
        // To properly test this, the previous token must be cleared, and the new token set.
        parser.clearCurrentToken(); // Clear the previous VALUE_STRING. _currToken becomes null.
        
        // Now call nextToken again with a new scalar value.
        // The check `_currToken != null` will be false because we cleared it.
        // So the special early return `return (_currToken = null);` won't trigger.
        // The code will proceed to delegate.nextToken().
        // We need to simulate delegate.nextToken() returning a value.
        delegate.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        delegate.setIntValue(123);
        
        JsonToken token2 = parser.nextToken(); 
        assertNotNull(token2); // It should now return the actual token, not null.
        assertEquals(JsonToken.VALUE_NUMBER_INT, token2);
        assertEquals(123, parser.getIntValue());
        assertEquals(1, parser._matchCount); // Match count should not change if it's not a match.
    }

    // Test case: includePath is true, and a nested field is included.
    @Test
    public void testNextToken_includePathTrue_nestedInclude() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        
        // Mock structure: {"outer": {"inner": "value"}}
        // Filter includes "inner"
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("inner".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return TokenFilter. நோக்க;
            }
        };
        
        FilteringParserDelegate parser = createFilteringParser(delegate, filter, true, false); // includePath = true

        // Simulate parsing "outer"
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("outer");
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("outer", parser.getCurrentName());

        // Simulate parsing START_OBJECT for "outer"
        delegate.setCurrentToken(JsonToken.START_OBJECT);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        // Simulate parsing "inner"
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("inner");
        JsonToken tokenInnerName = parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, tokenInnerName);
        assertEquals("inner", parser.getCurrentName());
        
        // Simulate parsing VALUE_STRING for "inner"
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("value");
        JsonToken tokenInnerValue = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, tokenInnerValue);
        assertEquals("value", parser.getText());
        
        // Simulate parsing END_OBJECT for "outer"
        delegate.setCurrentToken(JsonToken.END_OBJECT);
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        
        // Simulate parsing END_OBJECT for root (if applicable)
        delegate.setCurrentToken(JsonToken.END_OBJECT);
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    // Test case: includePath is false, and a nested field is included.
    @Test
    public void testNextToken_includePathFalse_nestedInclude() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        
        // Mock structure: {"outer": {"inner": "value"}}
        // Filter includes "inner"
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("inner".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return TokenFilter. நோக்க;
            }
        };
        
        FilteringParserDelegate parser = createFilteringParser(delegate, filter, false, false); // includePath = false

        // Simulate parsing "outer"
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("outer");
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("outer", parser.getCurrentName());

        // Simulate parsing START_OBJECT for "outer"
        delegate.setCurrentToken(JsonToken.START_OBJECT);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        // Simulate parsing "inner"
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("inner");
        JsonToken tokenInnerName = parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, tokenInnerName);
        assertEquals("inner", parser.getCurrentName());
        
        // Simulate parsing VALUE_STRING for "inner"
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("value");
        JsonToken tokenInnerValue = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, tokenInnerValue);
        assertEquals("value", parser.getText());
        
        // Simulate parsing END_OBJECT for "outer"
        delegate.setCurrentToken(JsonToken.END_OBJECT);
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        
        // Simulate parsing END_OBJECT for root (if applicable)
        delegate.setCurrentToken(JsonToken.END_OBJECT);
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    // Test case: _includeImmediateParent is true, and a field is included.
    // This feature is deprecated and its behavior is uncertain, so testing is limited.
    // Based on the code, it seems to attempt to include the START_OBJECT/END_OBJECT
    // if the parent is not handled and _includeImmediateParent is true and _includePath is false.
    @Test
    public void testNextToken_includeImmediateParentTrue() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        
        // Mock structure: {"field": "value"}
        // Filter includes "field"
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("field".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return TokenFilter. நோக்க;
            }
        };

        // Set _includeImmediateParent to true, and _includePath to false
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, filter, false, false);
        parser._includeImmediateParent = true; // Explicitly set the deprecated flag

        // Simulate parsing "field"
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("field");
        JsonToken tokenFieldName = parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, tokenFieldName);
        assertEquals("field", parser.getCurrentName());

        // Simulate parsing VALUE_STRING for "field"
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("value");
        JsonToken tokenValue = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, tokenValue);
        assertEquals("value", parser.getText());

        // The `_includeImmediateParent` logic is complex and tied to `_includePath` being false.
        // When `_includePath` is false and a field is included, if `_includeImmediateParent` is true,
        // it tries to buffer the START_OBJECT.
        // This test would need more detailed mock setup to verify the buffering behavior.
        // For now, we assert that the value itself is processed correctly.
    }

    // --- nextValue() behavior ---
    @Test
    public void testNextValue_skipsFieldName() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.FIELD_NAME);
        delegate.setCurrentName("fieldName");
        
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        
        // First nextToken will return FIELD_NAME
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("fieldName", parser.getCurrentName());
        
        // Now, nextValue should consume the FIELD_NAME and return the actual value token.
        delegate.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        delegate.setIntValue(123);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextValue());
        assertEquals(123, parser.getIntValue());
    }

    @Test
    public void testNextValue_nonFieldNameToken() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("someString");
        
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        
        // nextToken returns VALUE_STRING
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("someString", parser.getText());
        
        // nextValue should return the same token as it's not a FIELD_NAME
        assertEquals(JsonToken.VALUE_STRING, parser.nextValue());
        assertEquals("someString", parser.getText());
    }

    // --- skipChildren() behavior ---
    @Test
    public void testSkipChildren_onStartObject() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);

        // Simulate parser being at START_OBJECT
        delegate.setCurrentToken(JsonToken.START_OBJECT);
        parser.nextToken(); // Sets current token to START_OBJECT

        // Mock delegate's behavior to return subsequent tokens until END_OBJECT
        delegate.setCurrentToken(JsonToken.FIELD_NAME); // nextToken() in skipChildren
        delegate.setCurrentName("field1");
        // Need to call nextToken on parser to advance the delegate
        parser.nextToken(); 
        
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("value1");
        parser.nextToken();
        
        delegate.setCurrentToken(JsonToken.END_OBJECT); // This is what skipChildren should find
        
        // Call skipChildren
        JsonParser resultParser = parser.skipChildren();
        
        assertNotNull(resultParser);
        // After skipChildren, the current token should be END_OBJECT
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testSkipChildren_onStartArray() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);

        // Simulate parser being at START_ARRAY
        delegate.setCurrentToken(JsonToken.START_ARRAY);
        parser.nextToken(); // Sets current token to START_ARRAY

        // Mock delegate's behavior to return subsequent tokens until END_ARRAY
        delegate.setCurrentToken(JsonToken.VALUE_NUMBER_INT); // nextToken() in skipChildren
        delegate.setIntValue(1);
        parser.nextToken(); // Advance delegate
        
        delegate.setCurrentToken(JsonToken.END_ARRAY); // This is what skipChildren should find
        
        // Call skipChildren
        JsonParser resultParser = parser.skipChildren();
        
        assertNotNull(resultParser);
        // After skipChildren, the current token should be END_ARRAY
        assertEquals(JsonToken.END_ARRAY, parser.getCurrentToken());
    }

    @Test
    public void testSkipChildren_notOnStartToken() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);

        // Simulate parser being at a non-structural token
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("some string");
        parser.nextToken(); // Sets current token to VALUE_STRING

        // Call skipChildren - should return 'this' and not change token
        JsonParser resultParser = parser.skipChildren();
        
        assertNotNull(resultParser);
        assertSame(parser, resultParser);
        assertEquals(JsonToken.VALUE_STRING, parser.getCurrentToken()); // Token should not change
    }

    // --- Numeric Accessors ---
    // These delegate to the underlying parser. We mock the delegate's behavior.
    @Test
    public void testGetIntValue() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        delegate.setIntValue(12345);
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        parser.nextToken(); // Ensure there's a current token
        assertEquals(12345, parser.getIntValue());
    }

    @Test
    public void testGetDoubleValue() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_NUMBER_FLOAT);
        delegate.setDoubleValue(123.456);
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        parser.nextToken(); // Ensure there's a current token
        assertEquals(123.456, parser.getDoubleValue(), 0.00001);
    }
    
    @Test
    public void testGetLongValue() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_NUMBER_INT);
        delegate.setLongValue(1234567890123L); // Use the added setter
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        parser.nextToken(); // Ensure there's a current token
        assertEquals(1234567890123L, parser.getLongValue());
    }

    // --- Text Accessors ---
    @Test
    public void testGetText() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        delegate.setCurrentToken(JsonToken.VALUE_STRING);
        delegate.setTextValue("test string");
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        parser.nextToken(); // Ensure there's a current token
        assertEquals("test string", parser.getText());
    }
    
    // --- JsonStreamContext Accessor ---
    // The _filterContext() method is internal but is used by getParsingContext()
    // This test checks if getParsingContext() returns the correct context.
    // Since we don't have a concrete TokenFilterContext implementation that exposes
    // its state easily for assertion, we can test that it's not null when expected.
    // A full test would require creating a complex hierarchy of TokenFilterContext.
    @Test
    public void testGetParsingContext_initiallyNotNull() throws Exception {
        MockJsonParser delegate = new MockJsonParser();
        FilteringParserDelegate parser = createFilteringParser(delegate, TokenFilter.INCLUDE_ALL, false, false);
        // Initially, _exposedContext is null, and _headContext is the root context.
        // getParsingContext() should return _filterContext(), which returns _headContext if _exposedContext is null.
        assertNotNull(parser.getParsingContext());
        // We can't easily assert the type or state of TokenFilterContext without more setup.
        // However, we can assert that it's not null.
    }
}
```