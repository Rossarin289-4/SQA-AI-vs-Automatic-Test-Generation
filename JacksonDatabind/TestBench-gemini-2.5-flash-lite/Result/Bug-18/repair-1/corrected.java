package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.IOException;
import java.util.*;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilTreeSetAsDefault;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

public class MappingIteratorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock JsonParser and DeserializationContext for basic tests
    private static class MockJsonParser extends JsonParser {
        private JsonToken _currentToken;
        private List<JsonToken> _tokens;
        private int _tokenIndex = -1;
        private JsonStreamContext _parsingContext;
        private JsonLocation _location = JsonLocation.NA;

        public MockJsonParser(List<JsonToken> tokens, JsonStreamContext context) {
            _tokens = tokens != null ? new ArrayList<>(tokens) : new ArrayList<>();
            _parsingContext = context;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            if (_tokenIndex + 1 < _tokens.size()) {
                _currentToken = _tokens.get(_tokenIndex + 1);
                _tokenIndex++;
                if (_currentToken == JsonToken.END_ARRAY) {
                    _parsingContext = _parsingContext.getParent();
                }
                // Update location for each token advance
                _location = new JsonLocation(_location.getSourceRef(), _location.getByteOffset() + 1, _location.getCharOffset() + 1, _location.getLineNr(), _location.getColumnNr() + 1);
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
        public void clearCurrentToken() {
            _currentToken = null;
        }

        @Override
        public JsonStreamContext getParsingContext() {
            return _parsingContext;
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return _location;
        }

        @Override
        public void close() throws IOException {
            // No-op for mock
        }

        @Override
        public Version version() {
            return Version.unknownVersion();
        }

        @Override
        public boolean isExpectedStartArrayToken() {
            // Simple mock, assume false unless token is START_ARRAY
            return _currentToken == JsonToken.START_ARRAY;
        }

        @Override
        public <T> T readValueAs(Class<T> valueType) throws IOException {
            // For simplicity, return null for any readValueAs call in mock
            return null;
        }

        @Override
        public Object getEmbeddedObject() {
            return null;
        }

        @Override
        public JsonParser skipChildren() throws IOException {
            // Simple mock, do nothing
            return this;
        }

        @Override
        public JsonToken getLastClearedToken() {
            return null; // Not implemented for mock
        }

        @Override
        public JsonStreamContext getParsingContext(int i) {
            return getParsingContext();
        }

        @Override
        public void overrideCurrentName(String name) {
            // Not implemented for mock
        }

        @Override
        public String getText() {
            return null; // Not implemented for mock
        }

        @Override
        public boolean hasTextCharacters() {
            return false; // Not implemented for mock
        }

        @Override
        public char[] getTextCharacters() {
            return null; // Not implemented for mock
        }

        @Override
        public int getTextLength() {
            return 0; // Not implemented for mock
        }

        @Override
        public int getTextOffset() {
            return 0; // Not implemented for mock
        }

        @Override
        public Number getNumberValue() throws IOException {
            return null; // Not implemented for mock
        }

        @Override
        public NumberType getNumberType() throws IOException {
            return null; // Not implemented for mock
        }

        @Override
        public int getIntValue() throws IOException {
            return 0; // Not implemented for mock
        }

        @Override
        public long getLongValue() throws IOException {
            return 0L; // Not implemented for mock
        }

        @Override
        public BigInteger getBigIntegerValue() throws IOException {
            return BigInteger.ZERO; // Implemented for mock
        }

        @Override
        public BigDecimal getDecimalValue() throws IOException {
            return BigDecimal.ZERO; // Implemented for mock
        }

        @Override
        public double getDoubleValue() throws IOException {
            return 0.0; // Not implemented for mock
        }

        @Override
        public float getFloatValue() throws IOException {
            return 0.0f; // Not implemented for mock
        }

        @Override
        public boolean getBooleanValue() throws IOException {
            return false; // Not implemented for mock
        }

        @Override
        public byte[] getBinaryValue() throws IOException {
            return null; // Not implemented for mock
        }
        
        @Override
        public byte[] getBinaryValue(Base64Variant bv) throws IOException {
            return null; // Not implemented for mock
        }

        @Override
        public String getValueAsString() throws IOException {
            return null; // Not implemented for mock
        }

        @Override
        public String getValueAsString(String defaultValue) throws IOException {
            return defaultValue; // Not implemented for mock
        }

        @Override
        public boolean getValueAsBoolean() throws IOException {
            return false; // Not implemented for mock
        }

        @Override
        public int getValueAsInt() throws IOException {
            return 0; // Not implemented for mock
        }

        @Override
        public long getValueAsLong() throws IOException {
            return 0L; // Not implemented for mock
        }

        @Override
        public double getValueAsDouble() throws IOException {
            return 0.0; // Not implemented for mock
        }

        @Override
        public JsonParser.Feature getFeatureMask() {
             return null; // Not implemented for mock
        }
        
        @Override
        public boolean requiresCustomCodec() { return false; }

        @Override
        public void setCodec(ObjectCodec c) { }

        @Override
        public ObjectCodec getCodec() { return null; }

        @Override
        public JsonLocation getTokenLocation() {
            return getCurrentLocation();
        }

        @Override
        public String getCurrentName() {
            return null; // Not implemented for mock
        }

        @Override
        public JsonToken nextValue() throws IOException {
            return nextToken(); // Simple mock
        }

        @Override
        public boolean hasCurrentToken() {
            return _currentToken != null;
        }

        @Override
        public JsonParser duplicateSymbol() {
            return this; // Simple mock
        }

        @Override
        public void setCurrentToken(JsonToken t) {
            _currentToken = t;
        }
    }

    // Mock JsonDeserializer
    private static class MockJsonDeserializer<T> extends JsonDeserializer<T> {
        private final T _defaultValue;

        public MockJsonDeserializer(T defaultValue) {
            _defaultValue = defaultValue;
        }

        @Override
        public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            if (p.getCurrentToken() == JsonToken.VALUE_NULL) {
                return null;
            }
            // For simplicity, return a default value or null if no value found
            return _defaultValue;
        }

        @Override
        public T deserialize(JsonParser p, DeserializationContext ctxt, T intoValue) throws IOException {
            return deserialize(p, ctxt);
        }

        @Override
        public Class<?> handledType() {
            return Object.class; // Generic placeholder
        }
    }

    // Mock DeserializationContext
    private static class MockDeserializationContext extends DeserializationContext {
        protected MockDeserializationContext(DeserializerFactory df) {
            super(df);
        }
        protected MockDeserializationContext(DeserializerFactory df, DeserializerCache cache) {
            super(df, cache);
        }
        protected MockDeserializationContext(DeserializationContext src, DeserializerFactory factory) {
            super(src, factory);
        }
        protected MockDeserializationContext(DeserializationContext src, DeserializationConfig config, JsonParser p, InjectableValues injectableValues) {
            super(src, config, p, injectableValues);
        }
        protected MockDeserializationContext(DeserializationContext src) {
            super(src);
        }

        @Override
        public DeserializationConfig getConfig() {
            // Return a dummy config if needed, or null if not accessed
            return new DeserializationConfig(TypeFactory.defaultInstance(), null, null);
        }

        @Override
        public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException {
            // Mock implementation
            return new MockJsonDeserializer<>(null);
        }

        @Override
        public Base64Variant getBase64Variant() {
            // Mock implementation
            return Base64Variants.getDefaultVariant();
        }

        @Override
        public Locale getLocale() {
            return Locale.getDefault();
        }

        @Override
        public TimeZone getTimeZone() {
            return TimeZone.getDefault();
        }

        @Override
        public InjectableValues getInjectableValues() {
            return null; // Not implemented for mock
        }

        @Override
        public Class<?> getActiveView() {
            return null; // Not implemented for mock
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return AnnotationIntrospector.nopInstance(); // Provide a non-null instance
        }

        @Override
        public TypeFactory getTypeFactory() {
            return TypeFactory.defaultInstance();
        }

        @Override
        public Object getAttribute(Object key) {
            return null; // Not implemented for mock
        }

        @Override
        public DeserializationContext setAttribute(Object key, Object value) {
            return this; // Not implemented for mock
        }

        @Override
        public JavaType getContextualType() {
            return null; // Not implemented for mock
        }

        @Override
        public DeserializerFactory getFactory() {
            // Return a dummy factory if needed, or null if not accessed
            return null;
        }

        @Override
        public boolean isEnabled(DeserializationFeature feat) {
            return false; // Not implemented for mock
        }

        @Override
        public int getDeserializationFeatures() {
            return 0; // Not implemented for mock
        }

        @Override
        public boolean hasDeserializationFeatures(int featureMask) {
            return false; // Not implemented for mock
        }

        @Override
        public boolean hasSomeOfFeatures(int featureMask) {
            return false; // Not implemented for mock
        }

        @Override
        public JsonParser getParser() {
            return null; // Not implemented for mock
        }

        @Override
        public Object findInjectableValue(Object valueId, BeanProperty forProperty, Object beanInstance) {
            return null; // Not implemented for mock
        }

        @Override
        public JsonNodeFactory getNodeFactory() {
            return JsonNodeFactory.instance;
        }

        @Override
        public boolean hasValueDeserializerFor(JavaType type) {
            return false; // Not implemented for mock
        }

        @Override
        public boolean hasValueDeserializerFor(JavaType type, AtomicReference<Throwable> cause) {
            return false; // Not implemented for mock
        }
    }

    // Mock JavaType
    private static class MockJavaType extends JavaType {
        private final Class<?> _rawClass;

        protected MockJavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler, boolean asStatic) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
            _rawClass = raw;
        }

        @Override
        public JavaType withTypeHandler(Object h) { return this; }
        @Override
        public JavaType withContentTypeHandler(Object h) { return this; }
        @Override
        public JavaType withValueHandler(Object h) { return this; }
        @Override
        public JavaType withContentValueHandler(Object h) { return this; }
        @Override
        public JavaType withStaticTyping() { return this; }
        @Override
        protected JavaType _narrow(Class<?> subclass) { return this; }
        @Override
        public JavaType narrowContentsBy(Class<?> contentClass) { return this; }
        @Override
        public JavaType widenContentsBy(Class<?> contentClass) { return this; }
        @Override
        public boolean isContainerType() { return false; }
        @Override
        public boolean isConcrete() { return true; }
        @Override
        public boolean isAbstract() { return false; }
        @Override
        public boolean isThrowable() { return false; }
        @Override
        public boolean isArrayType() { return false; }
        @Override
        public boolean isEnumType() { return false; }
        @Override
        public boolean isInterface() { return false; }
        @Override
        public boolean isPrimitive() { return false; }
        @Override
        public boolean isFinal() { return false; }
        @Override
        public boolean isCollectionLikeType() { return false; }
        @Override
        public boolean isMapLikeType() { return false; }
        @Override
        public Class<?> getRawClass() { return _rawClass; }
        
        // Add missing abstract methods if necessary based on superclass declarations
        @Override
        public JavaType forcedNarrowBy(Class<?> subclass) { return this; }
        @Override
        public JavaType widenBy(Class<?> superclass) { return this; }
        @Override
        protected JavaType _widen(Class<?> superclass) { return this; }
        @Override
        public JavaType narrowBy(Class<?> subclass) { return this; }
        
        @Override
        public boolean hasGenericTypes() { return false; }
        @Override
        public boolean isJavaLangObject() { return _rawClass == Object.class; }
        @Override
        public StringBuilder appendRaw(StringBuilder sb) { return sb.append(_rawClass.getName()); }
        @Override
        public int containedTypeCount() { return 0; }
        @Override
        public JavaType containedType(int index) { return null; }
        @Override
        public String containedTypeName(int index) { return null; }
        @Override
        public JavaType getContentType() { return null; }
        @Override
        public JavaType getKeyType() { return null; }
        @Override
        public ResolvedType getSelfResolvedType() { return this; }
        @Override
        public boolean isAnchorType() { return false; }
    }

    // Mock JsonStreamContext
    private static class MockJsonStreamContext extends JsonStreamContext {
        private final String _type;
        private final JsonStreamContext _parent;

        public MockJsonStreamContext(String type, JsonStreamContext parent) {
            _type = type;
            _parent = parent;
        }

        @Override
        public String toString() { return _type; }
        @Override
        public JsonStreamContext getParent() { return _parent; }
        @Override
        public int getIndex() { return -1; } // Not applicable for this mock
        @Override
        public int getEntryCount() { return 0; } // Not applicable for this mock
        @Override
        public String getCurrentName() { return null; } // Not applicable for this mock
        @Override
        public boolean inArray() { return "ARRAY".equals(_type); }
        @Override
        public boolean inRoot() { return "ROOT".equals(_type); }
        @Override
        public boolean inObject() { return "OBJECT".equals(_type); }
    }

    // Test case 1: hasNext() on an empty iterator
    @Test
    public void testHasNextOnEmptyIterator() throws Exception {
        MappingIterator<Object> iterator = MappingIterator.emptyIterator();
        assertFalse(iterator.hasNext());
    }

    // Test case 2: hasNextValue() on an empty iterator
    @Test
    public void testHasNextValueOnEmptyIterator() throws Exception {
        MappingIterator<Object> iterator = MappingIterator.emptyIterator();
        assertFalse(iterator.hasNextValue());
    }

    // Test case 3: next() on an empty iterator
    @Test
    public void testNextOnEmptyIterator() throws Exception {
        MappingIterator<Object> iterator = MappingIterator.emptyIterator();
        try {
            iterator.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // Expected
        } catch (RuntimeException e) {
            // RuntimeException is also thrown by next() if IOException occurs
            assertTrue(e.getCause() instanceof NoSuchElementException);
        }
    }

    // Test case 4: nextValue() on an empty iterator
    @Test
    public void testNextValueOnEmptyIterator() throws Exception {
        MappingIterator<Object> iterator = MappingIterator.emptyIterator();
        try {
            iterator.nextValue();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // Expected
        }
    }

    // Test case 5: Close an empty iterator
    @Test
    public void testCloseEmptyIterator() throws Exception {
        MappingIterator<Object> iterator = MappingIterator.emptyIterator();
        iterator.close(); // Should not throw
        assertFalse(iterator.hasNext());
    }

    // Test case 6: hasNext() with one element
    @Test
    public void testHasNextWithOneElement() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);
        assertTrue(iterator.hasNext());
    }

    // Test case 7: next() with one element
    @Test
    public void testNextWithOneElement() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);
        assertEquals("test", iterator.next());
        assertFalse(iterator.hasNext());
    }

    // Test case 8: hasNextValue() with one element
    @Test
    public void testHasNextValueWithOneElement() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);
        assertTrue(iterator.hasNextValue());
    }

    // Test case 9: nextValue() with one element
    @Test
    public void testNextValueWithOneElement() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);
        assertEquals("test", iterator.nextValue());
        assertFalse(iterator.hasNextValue());
    }

    // Test case 10: readAll() with multiple elements
    @Test
    public void testReadAllWithMultipleElements() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);
        List<String> result = iterator.readAll();
        assertEquals(2, result.size());
        assertEquals("test", result.get(0));
        assertEquals("test", result.get(1));
    }

    // Test case 11: readAll() with a provided list
    @Test
    public void testReadAllWithProvidedList() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);
        List<String> initialList = new ArrayList<>();
        initialList.add("existing");
        List<String> result = iterator.readAll(initialList);
        assertEquals(2, result.size());
        assertEquals("existing", result.get(0));
        assertEquals("test", result.get(1));
        assertTrue(result == initialList); // Should return the same list
    }

    // Test case 12: readAll() with a different collection type
    @Test
    public void testReadAllWithDifferentCollection() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);
        Set<String> resultSet = iterator.readAll(new HashSet<>());
        assertEquals(1, resultSet.size());
        assertTrue(resultSet.contains("test"));
    }

    // Test case 13: getParser() returns the underlying parser
    @Test
    public void testGetParser() throws Exception {
        MockJsonParser parser = new MockJsonParser(Collections.emptyList(), null);
        MappingIterator<Object> iterator = new MappingIterator<>(
            null, parser, null, null, false, null);
        assertEquals(parser, iterator.getParser());
    }

    // Test case 14: getParserSchema()
    @Test
    public void testGetParserSchema() throws Exception {
        // Mock a parser that returns a schema
        JsonParser mockParserWithSchema = new MockJsonParser(null, null) {
            @Override
            public FormatSchema getSchema() {
                return new FormatSchema() {
                    @Override public String toString() { return "MockSchema"; }
                    @Override public boolean equals(Object o) { return this == o; }
                    @Override public int hashCode() { return System.identityHashCode(this); }
                };
            }
        };
        MappingIterator<Object> iterator = new MappingIterator<>(
            null, mockParserWithSchema, null, null, false, null);
        assertNotNull(iterator.getParserSchema());
        assertEquals("MockSchema", iterator.getParserSchema().toString());
    }

    // Test case 15: getCurrentLocation()
    @Test
    public void testGetCurrentLocation() throws Exception {
        // Mock a parser that returns a specific location
        JsonParser mockParserWithLocation = new MockJsonParser(null, null) {
            @Override
            public JsonLocation getCurrentLocation() {
                return new JsonLocation(null, 100L, 50, 20);
            }
        };
        MappingIterator<Object> iterator = new MappingIterator<>(
            null, mockParserWithLocation, null, null, false, null);
        JsonLocation loc = iterator.getCurrentLocation();
        assertNotNull(loc);
        assertEquals(100L, loc.getByteOffset());
        assertEquals(50, loc.getBytePosition());
        assertEquals(20, loc.getCharOffset());
    }

    // Test case 16: close() on a non-empty iterator
    @Test
    public void testCloseNonEmptyIterator() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null); // managedParser = true, so close() should close parser
        iterator.close();
        // The state should be closed.
        assertEquals(MappingIterator.STATE_CLOSED, iterator._state);
    }

    // Test case 17: State transition to STATE_HAS_VALUE
    @Test
    public void testStateTransitionToHasValue() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);

        assertEquals(MappingIterator.STATE_MAY_HAVE_VALUE, iterator._state);
        assertTrue(iterator.hasNextValue()); // This should transition state
        assertEquals(MappingIterator.STATE_HAS_VALUE, iterator._state);
        assertTrue(iterator.hasNextValue()); // Calling again while in STATE_HAS_VALUE should still be true
        assertEquals(MappingIterator.STATE_HAS_VALUE, iterator._state);
    }

    // Test case 18: nextValue() after hasNextValue() returns false
    @Test
    public void testNextValueAfterHasNextValueFalse() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);

        assertFalse(iterator.hasNextValue());
        // After hasNextValue returns false, _state should be STATE_CLOSED
        assertEquals(MappingIterator.STATE_CLOSED, iterator._state);

        try {
            iterator.nextValue();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // Expected
        }
    }

    // Test case 19: _resync() method - basic case
    @Test
    public void testResyncBasic() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(
            JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT, // First element
            JsonToken.START_OBJECT, JsonToken.FIELD_NAME, JsonToken.VALUE_STRING, JsonToken.END_OBJECT, // Second element
            JsonToken.END_ARRAY),
            new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));

        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);

        // Initial state
        iterator.hasNextValue(); // Advances to first element state
        iterator.nextValue(); // Consumes first element, token cleared, state MAY_HAVE_VALUE
        parser.clearCurrentToken(); // Simulate token cleared after nextValue

        // Simulate an error during deserialization, setting state to NEED_RESYNC
        iterator._state = MappingIterator.STATE_NEED_RESYNC;

        // Now call hasNextValue, which should call _resync()
        assertTrue(iterator.hasNextValue());
        // After resync, it should find the next value
        assertEquals("test", iterator.nextValue());
        assertFalse(iterator.hasNextValue());
    }

    // Test case 20: _throwNoSuchElement()
    @Test
    public void testThrowNoSuchElement() throws Exception {
        MappingIterator<Object> iterator = MappingIterator.emptyIterator();
        try {
            // Accessing _throwNoSuchElement directly for test purposes, as it's protected.
            // In a real scenario, this would be called internally.
            iterator.getClass().getDeclaredMethod("_throwNoSuchElement").invoke(iterator);
            fail("Expected NoSuchElementException");
        } catch (java.lang.reflect.InvocationTargetException e) {
            assertTrue(e.getCause() instanceof NoSuchElementException);
        }
    }

    // Test case 21: _handleMappingException()
    @Test
    public void testHandleMappingException() throws Exception {
        MappingIterator<Object> iterator = MappingIterator.emptyIterator();
        JsonMappingException jme = new JsonMappingException("Test Mapping Exception");
        try {
            // Accessing _handleMappingException directly for test purposes, as it's protected.
            iterator.getClass().getDeclaredMethod("_handleMappingException", JsonMappingException.class).invoke(iterator, jme);
            fail("Expected RuntimeJsonMappingException");
        } catch (java.lang.reflect.InvocationTargetException e) {
            assertTrue(e.getCause() instanceof RuntimeJsonMappingException);
            assertEquals("Test Mapping Exception", e.getCause().getMessage());
            assertSame(jme, e.getCause().getCause());
        }
    }

    // Test case 22: _handleIOException()
    @Test
    public void testHandleIOException() throws Exception {
        MappingIterator<Object> iterator = MappingIterator.emptyIterator();
        IOException ioe = new IOException("Test IO Exception");
        try {
            // Accessing _handleIOException directly for test purposes, as it's protected.
            iterator.getClass().getDeclaredMethod("_handleIOException", IOException.class).invoke(iterator, ioe);
            fail("Expected RuntimeException");
        } catch (java.lang.reflect.InvocationTargetException e) {
            assertTrue(e.getCause() instanceof RuntimeException);
            assertEquals("Test IO Exception", e.getCause().getMessage());
            assertSame(ioe, e.getCause().getCause());
        }
    }

    // Test case 23: hasNext() handling exceptions
    @Test
    public void testHasNextHandlesExceptions() throws Exception {
        // Mock parser that throws IOException on nextToken
        MockJsonParser throwingParser = new MockJsonParser(Collections.emptyList(), null) {
            @Override
            public JsonToken nextToken() throws IOException {
                throw new IOException("Simulated IO Error");
            }
        };
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            throwingParser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null);

        // hasNext should catch IOException and wrap it in RuntimeException
        try {
            iterator.hasNext();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Simulated IO Error", e.getMessage());
            assertTrue(e.getCause() instanceof IOException);
        }
    }

    // Test case 24: next() handling exceptions
    @Test
    public void testNextHandlesExceptions() throws Exception {
        // Mock deserializer that throws JsonMappingException
        JsonDeserializer<String> throwingDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                throw new JsonMappingException("Simulated Mapping Error");
            }
            @Override public Class<?> handledType() { return String.class; }
        };

        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));

        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            throwingDeserializer,
            true, null);

        // hasNextValue will succeed
        iterator.hasNextValue();

        // next() should catch JsonMappingException and wrap it in RuntimeJsonMappingException
        try {
            iterator.next();
            fail("Expected RuntimeJsonMappingException");
        } catch (RuntimeJsonMappingException e) {
            assertEquals("Simulated Mapping Error", e.getMessage());
            assertTrue(e.getCause() instanceof JsonMappingException);
        }
    }

    // Test case 25: Constructor with null parser
    @Test
    public void testConstructorWithNullParser() throws Exception {
        MappingIterator<Object> iterator = new MappingIterator<>(
            null, null, null, null, false, null);
        assertEquals(MappingIterator.STATE_CLOSED, iterator._state);
        assertFalse(iterator.hasNext());
    }

    // Test case 26: Handling START_ARRAY token at beginning when managedParser is true
    @Test
    public void testConstructorHandlesStartArrayWhenManaged() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.START_ARRAY, JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null); // managedParser = true
        // The START_ARRAY token should be cleared by the constructor
        assertTrue(iterator.hasNextValue());
        assertEquals("test", iterator.nextValue());
        assertFalse(iterator.hasNextValue());
    }

    // Test case 27: Handling START_ARRAY token at beginning when managedParser is false
    @Test
    public void testConstructorHandlesStartArrayWhenNotManaged() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.START_ARRAY, JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            false, null); // managedParser = false
        // The START_ARRAY token should NOT be cleared by the constructor
        assertTrue(iterator.hasNextValue());
        assertEquals("test", iterator.nextValue());
        assertFalse(iterator.hasNextValue());
    }

    // Test case 28: Iterator with updated value
    @Test
    public void testIteratorWithUpdatedValue() throws Exception {
        String initialValue = "initial";
        String updatedValue = "updated";
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));

        // Mock deserializer that will use the intoValue argument
        JsonDeserializer<String> updatingDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt, String intoValue) throws IOException {
                // In a real scenario, this would modify 'intoValue' and return it.
                // For this mock, we'll just return a different value to show it was called.
                return updatedValue;
            }

            @Override
            public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return updatedValue; // Fallback if intoValue is not used
            }

            @Override
            public Class<?> handledType() {
                return String.class;
            }
        };

        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            updatingDeserializer,
            true, initialValue); // valueToUpdate is provided

        assertTrue(iterator.hasNextValue());
        String result = iterator.nextValue();
        assertEquals(updatedValue, result);
    }

    // Test case 29: Iterator with null updated value
    @Test
    public void testIteratorWithNullUpdatedValue() throws Exception {
        MockJsonParser parser = new MockJsonParser(Arrays.asList(JsonToken.VALUE_STRING, JsonToken.END_ARRAY), new MockJsonStreamContext("ARRAY", new MockJsonStreamContext("ROOT", null)));
        MappingIterator<String> iterator = new MappingIterator<>(
            new MockJavaType(String.class, 0, null, null, false),
            parser,
            new MockDeserializationContext(null),
            new MockJsonDeserializer<>("test"),
            true, null); // valueToUpdate is null
        assertTrue(iterator.hasNextValue());
        assertEquals("test", iterator.nextValue());
        assertFalse(iterator.hasNextValue());
    }

    // Test case 30: closeParser flag logic
    @Test
    public void testCloseParserFlag() throws Exception {
        // Test case where _closeParser is true
        MockJsonParser parser1 = new MockJsonParser(Collections.emptyList(), null);
        MappingIterator<Object> iterator1 = new MappingIterator<>(null, parser1, null, null, true, null);
        iterator1.close();
        // The state should be closed.
        assertEquals(MappingIterator.STATE_CLOSED, iterator1._state);

        // Test case where _closeParser is false
        MockJsonParser parser2 = new MockJsonParser(Collections.emptyList(), null);
        MappingIterator<Object> iterator2 = new MappingIterator<>(null, parser2, null, null, false, null);
        iterator2.close();
        // The state should be closed.
        assertEquals(MappingIterator.STATE_CLOSED, iterator2._state);
    }
}
