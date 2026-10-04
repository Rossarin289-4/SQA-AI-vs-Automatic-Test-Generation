```java
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.BeanDescription; // Corrected import
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector; // Corrected import
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription; // Corrected import

public class UntypedObjectDeserializerTest {

    // Mock DeserializationContext for testing
    private static class MockDeserializationContext extends DefaultDeserializationContext {

        private final DeserializerFactory _factory;
        private final DeserializerCache _cache;
        private final int _featureFlags;
        private final Class<?> _view;

        public MockDeserializationContext(DeserializationConfig config, JsonParser parser, InjectableValues injectableValues, DeserializerFactory factory, DeserializerCache cache, int featureFlags, Class<?> view) {
            // Call the super constructor with necessary arguments
            super(config, parser, injectableValues);
            _factory = factory;
            _cache = cache;
            _featureFlags = featureFlags;
            _view = view;
        }

        @Override
        public DeserializerFactory getFactory() {
            return _factory;
        }

        @Override
        public DeserializerCache getCache() {
            return _cache;
        }

        @Override
        public final JsonParser getParser() {
            return _parser;
        }

        @Override
        public final boolean isEnabled(DeserializationFeature feat) {
            return (_featureFlags & feat.getMask()) != 0;
        }

        @Override
        public final int getDeserializationFeatures() {
            return _featureFlags;
        }

        @Override
        public final boolean hasDeserializationFeatures(int featureMask) {
            return (_featureFlags & featureMask) == featureMask;
        }

        @Override
        public final boolean hasSomeOfFeatures(int featureMask) {
            return (_featureFlags & featureMask) != 0;
        }

        @Override
        public final Object findInjectableValue(Object valueId, BeanProperty forProperty, Object beanInstance) {
            return null; // Mock implementation
        }

        @Override
        public final Base64Variant getBase64Variant() {
            return _config.getBase64Variant();
        }

        @Override
        public final JsonNodeFactory getNodeFactory() {
            return _config.getNodeFactory();
        }

        @Override
        public boolean hasValueDeserializerFor(JavaType type) {
            return true; // Mock implementation
        }

        @Override
        public boolean hasValueDeserializerFor(JavaType type, AtomicReference<Throwable> cause) {
            return true; // Mock implementation
        }

        @Override
        public final JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty prop) throws JsonMappingException {
            return null; // Mock implementation
        }
        
        @Override
        protected void _throwContextualBind(JsonParser p, Object beanInstance, String msg, Object... msgArgs) throws JsonMappingException {
            throw new JsonMappingException(msg);
        }

        @Override
        protected void _throwDequeuedTypeError(JavaType expected, String failureReason) throws JsonMappingException {
            throw new JsonMappingException(failureReason);
        }

        @Override
        protected void _throwUnresolvedObjectId(Object id, ObjectIdResolver resolver, BeanProperty prop) throws JsonMappingException {
            throw new JsonMappingException("Unresolved object id");
        }

        @Override
        protected void _handleUnknownObjectId(Object id, ObjectIdResolver resolver, BeanProperty prop) throws JsonMappingException {
            throw new JsonMappingException("Unknown object id");
        }

        @Override
        protected <T> T _handleInstantiationProblem(Class<?> instClass, Object argument, JsonParser p,
                                                 DeserializationContext ctxt, BeanIdResolver bidRes, ObjectIdGenerator<?> generator) throws IOException {
            throw new JsonMappingException("Instantiation problem");
        }

        @Override
        protected void _reportMissingAttributed(String className, Object attrName) throws JsonMappingException {
            throw new JsonMappingException("Missing attribute");
        }

        @Override
        public JavaType getContextualType() {
            return null; // Mock implementation
        }

        @Override
        public final AnnotationIntrospector getAnnotationIntrospector() {
            return _config.getAnnotationIntrospector();
        }

        @Override
        public final Class<?> getActiveView() {
            return _view;
        }

        @Override
        public Locale getLocale() {
            return _config.getLocale();
        }

        @Override
        public TimeZone getTimeZone() {
            return _config.getTimeZone();
        }

        @Override
        public Object getAttribute(Object key) {
            return null; // Mock implementation
        }

        @Override
        public DeserializationContext setAttribute(Object key, Object value) {
            return this; // Mock implementation
        }

        @Override
        public final TypeFactory getTypeFactory() {
            return _config.getTypeFactory();
        }

        @Override
        public boolean handleUnknownProperty(JsonParser p, DeserializationContext ctxt, Object beanOrObject, String propertyName) throws IOException {
            throw new JsonMappingException("Unknown property");
        }

        @Override
        public boolean handleUnexpectedToken(Class<?> targetClass, JsonParser p, DeserializationContext ctxt, JsonToken t, Object... params) throws IOException {
            throw new JsonMappingException("Unexpected token");
        }

        @Override
        public Object readValue(JsonParser p, JavaType type) throws IOException {
            throw new UnsupportedOperationException("Not implemented in mock");
        }

        @Override
        public Object readValue(JsonParser p, Class<?> type) throws IOException {
            throw new UnsupportedOperationException("Not implemented in mock");
        }

        @Override
        public <T> T readValue(JsonParser p, TypeReference<?> valueTypeRef) throws IOException {
            throw new UnsupportedOperationException("Not implemented in mock");
        }
    }

    // Helper method to create a JsonParser from a String
    private JsonParser createParser(String json) throws IOException {
        IOContext ioContext = new IOContext(new BufferRecycler(), json, false);
        byte[] bytes = json.getBytes("UTF-8");
        // Use ReaderBasedJsonParser for simplicity as it handles String input directly.
        return new ReaderBasedJsonParser(ioContext, 0, new java.io.StringReader(json), null, bytes, 0, bytes.length);
    }

    // Mock DeserializerFactory
    private static abstract class MockDeserializerFactory extends DeserializerFactory {
        // Abstract methods that need to be implemented by a concrete subclass or mocked.
        // For testing purposes, we'll create a minimal concrete subclass.
        @Override
        public DeserializerProvider createDeserializerProvider(DeserializationConfig config) {
            return null; // Not used in these tests
        }

        @Override
        public JavaType mapAbstractType(DeserializationConfig config, JavaType type) throws JsonMappingException {
            return null; // Not used in these tests
        }

        @Override
        public JsonDeserializer<Object> findValueDeserializer(DeserializationConfig config, DeserializationContext ctxt, JavaType type) throws JsonMappingException {
            return null; // Not used in these tests
        }

        @Override
        public KeyDeserializer findKeyDeserializer(DeserializationConfig config, DeserializationContext ctxt, JavaType type) throws JsonMappingException {
            return null; // Not used in these tests
        }

        @Override
        public ValueInstantiator findValueInstantiator(DeserializationContext ctxt, BeanDescription beanDesc) throws JsonMappingException {
            return null; // Not used in these tests
        }
    }

    // Mock DeserializerCache
    private static class MockDeserializerCache extends DeserializerCache {
        public MockDeserializerCache() {
            super(null); // Dummy value for fields not used in tests
        }
        // Override necessary methods if needed by the tests
    }

    private UntypedObjectDeserializer createDeserializer() {
        return new UntypedObjectDeserializer(null, null);
    }

    @Test
    public void testDeserializeJsonObjectAsMap() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("{\"key1\": \"value1\", \"key2\": 123}");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_OBJECT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Map);
        Map<?, ?> map = (Map<?, ?>) result;
        assertEquals(2, map.size());
        assertEquals("value1", map.get("key1"));
        assertEquals(Integer.valueOf(123), map.get("key2"));
    }

    @Test
    public void testDeserializeJsonArrayAsList() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("[1, \"two\", true]");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_ARRAY
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof List);
        List<?> list = (List<?>) result;
        assertEquals(3, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals("two", list.get(1));
        assertEquals(Boolean.TRUE, list.get(2));
    }

    @Test
    public void testDeserializeJsonString() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("\"hello world\"");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_STRING
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof String);
        assertEquals("hello world", result);
    }

    @Test
    public void testDeserializeJsonNumberInt() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("12345");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_INT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Integer);
        assertEquals(12345, result);
    }

    @Test
    public void testDeserializeJsonNumberFloat() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("123.45");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_FLOAT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Double);
        assertEquals(123.45, (Double) result, 1e-9);
    }

    @Test
    public void testDeserializeJsonBooleanTrue() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("true");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_TRUE
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Boolean);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testDeserializeJsonBooleanFalse() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("false");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_FALSE
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Boolean);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testDeserializeJsonNull() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("null");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NULL
        Object result = deserializer.deserialize(parser, ctxt);

        assertNull(result);
    }

    @Test
    public void testDeserializeEmptyObject() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("{}");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_OBJECT
        parser.nextToken(); // Move to END_OBJECT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Map);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void testDeserializeEmptyArray() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("[]");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_ARRAY
        parser.nextToken(); // Move to END_ARRAY
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void testDeserializeEmbeddedObject() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        Object embedded = new Object();
        
        // Simplified mock JsonParser for embedded object
        JsonParser parser = new JsonParserDelegate(null) {
            private JsonToken _currentToken = JsonToken.VALUE_EMBEDDED_OBJECT;
            @Override
            public JsonToken nextToken() throws IOException {
                JsonToken next = _currentToken;
                _currentToken = JsonToken.END_OBJECT; // To prevent infinite loop if called again
                return next;
            }
            @Override
            public int getCurrentTokenId() { return JsonTokenId.ID_EMBEDDED_OBJECT; }
            @Override
            public Object getEmbeddedObject() { return embedded; }
            @Override
            public String getCurrentName() throws IOException { return null; }
            @Override
            public JsonToken getCurrentToken() { return JsonToken.VALUE_EMBEDDED_OBJECT; }
        };

        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        Object result = deserializer.deserialize(parser, ctxt);
        assertSame(embedded, result);
    }

    @Test
    public void testDeserializeMapWithNullValue() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("{\"key\": null}");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_OBJECT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Map);
        Map<?, ?> map = (Map<?, ?>) result;
        assertEquals(1, map.size());
        assertNull(map.get("key"));
    }

    @Test
    public void testDeserializeListWithNullElement() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("[null]");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_ARRAY
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof List);
        List<?> list = (List<?>) result;
        assertEquals(1, list.size());
        assertNull(list.get(0));
    }

    @Test
    public void testDeserializeLongNumber() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("9876543210"); // A number that might exceed Integer.MAX_VALUE
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults() | DeserializationFeature.USE_LONG_FOR_INTS.getMask(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_INT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Long);
        assertEquals(9876543210L, result);
    }

    @Test
    public void testDeserializeBigIntegerNumber() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("12345678901234567890"); // A number that will exceed Long.MAX_VALUE
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults() | DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_INT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof java.math.BigInteger);
        assertEquals(new java.math.BigInteger("12345678901234567890"), result);
    }

    @Test
    public void testDeserializeBigDecimalFloat() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("123.4567890123456789"); // A number that might lose precision as double
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults() | DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS.getMask(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_FLOAT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof java.math.BigDecimal);
        assertEquals(new java.math.BigDecimal("123.4567890123456789"), result);
    }

    @Test
    public void testDeserializeArrayAsJavaArray() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("[1, \"two\", true]");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults() | DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY.getMask(), null);

        parser.nextToken(); // Move to START_ARRAY
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Object[]);
        Object[] array = (Object[]) result;
        assertEquals(3, array.length);
        assertEquals(Integer.valueOf(1), array[0]);
        assertEquals("two", array[1]);
        assertEquals(Boolean.TRUE, array[2]);
    }

    @Test
    public void testDeserializeEmptyArrayAsJavaArray() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("[]");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults() | DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY.getMask(), null);

        parser.nextToken(); // Move to START_ARRAY
        parser.nextToken(); // Move to END_ARRAY
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Object[]);
        Object[] array = (Object[]) result;
        assertEquals(0, array.length);
    }

    @Test
    public void testDeserializeComplexNestedMap() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("{\"outer\": {\"inner1\": 1, \"inner2\": [\"a\", \"b\"]}}");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_OBJECT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Map);
        Map<?, ?> outerMap = (Map<?, ?>) result;
        assertTrue(outerMap.containsKey("outer"));
        Object innerObj = outerMap.get("outer");
        assertTrue(innerObj instanceof Map);
        Map<?, ?> innerMap = (Map<?, ?>) innerObj;
        assertEquals(Integer.valueOf(1), innerMap.get("inner1"));
        assertTrue(innerMap.get("inner2") instanceof List);
        List<?> innerList = (List<?>) innerMap.get("inner2");
        assertEquals("a", innerList.get(0));
        assertEquals("b", innerList.get(1));
    }

    @Test
    public void testDeserializeComplexNestedList() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("[[1, 2], {\"key\": \"value\"}]");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_ARRAY
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof List);
        List<?> outerList = (List<?>) result;
        assertTrue(outerList.get(0) instanceof List);
        List<?> innerList1 = (List<?>) outerList.get(0);
        assertEquals(Integer.valueOf(1), innerList1.get(0));
        assertEquals(Integer.valueOf(2), innerList1.get(1));
        assertTrue(outerList.get(1) instanceof Map);
        Map<?, ?> innerMap = (Map<?, ?>) outerList.get(1);
        assertEquals("value", innerMap.get("key"));
    }

    @Test
    public void testDeserializeWithCustomMapDeserializer() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        JavaType mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Object.class);
        JsonDeserializer<Object> customMapDeserializer = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "custom_map";
            }
        };

        // Manually set the custom deserializer (normally done via resolve)
        deserializer._mapDeserializer = customMapDeserializer;

        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("{\"key\": \"value\"}");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_OBJECT
        Object result = deserializer.deserialize(parser, ctxt);

        assertEquals("custom_map", result);
    }

    @Test
    public void testDeserializeWithCustomListDeserializer() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        JavaType listType = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, Object.class);
        JsonDeserializer<Object> customListDeserializer = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "custom_list";
            }
        };

        // Manually set the custom deserializer (normally done via resolve)
        deserializer._listDeserializer = customListDeserializer;

        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("[1, 2]");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_ARRAY
        Object result = deserializer.deserialize(parser, ctxt);

        assertEquals("custom_list", result);
    }

    @Test
    public void testDeserializeWithTypeObjectAsMap() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("{\"key\": \"value\"}"); // Content doesn't matter as TypeDeserializer overrides
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        // Mock TypeDeserializer to simulate typed deserialization
        TypeDeserializer typeDeserializer = new TypeDeserializer() {
            @Override public String getPropertyName() { return null; }
            @Override public JavaType baseType() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public JsonDeserializer<Object> getDeserializer(DeserializationContext ctxt) throws JsonMappingException { return null; }
            @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return "typed_map_object"; }
            @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return deserializeTypedFromObject(p, ctxt); }
            @Override public boolean mayDeserializeIds() { return false; }
            @Override public boolean isCase(int typeId) { return false; }
            @Override public boolean isRequired() { return false; }
            @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
            @Override public String toString() { return "MockTypeDeserializer"; }
        };

        parser.nextToken(); // Move to START_OBJECT
        Object result = deserializer.deserializeWithType(parser, ctxt, typeDeserializer);

        assertEquals("typed_map_object", result);
    }

    @Test
    public void testDeserializeWithTypeObjectAsString() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("\"hello\""); // Content doesn't matter as TypeDeserializer overrides
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        TypeDeserializer typeDeserializer = new TypeDeserializer() {
            @Override public String getPropertyName() { return null; }
            @Override public JavaType baseType() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public JsonDeserializer<Object> getDeserializer(DeserializationContext ctxt) throws JsonMappingException { return null; }
            @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return "typed_scalar_string"; }
            @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return deserializeTypedFromScalar(p, ctxt); }
            @Override public boolean mayDeserializeIds() { return false; }
            @Override public boolean isCase(int typeId) { return false; }
            @Override public boolean isRequired() { return false; }
            @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
            @Override public String toString() { return "MockTypeDeserializer"; }
        };

        parser.nextToken(); // Move to VALUE_STRING
        Object result = deserializer.deserializeWithType(parser, ctxt, typeDeserializer);

        assertEquals("typed_scalar_string", result);
    }

    @Test
    public void testDeserializeWithTypeObjectAsNumberInt() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("123");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        TypeDeserializer typeDeserializer = new TypeDeserializer() {
            @Override public String getPropertyName() { return null; }
            @Override public JavaType baseType() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public JsonDeserializer<Object> getDeserializer(DeserializationContext ctxt) throws JsonMappingException { return null; }
            @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return 123; } // As int
            @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return deserializeTypedFromScalar(p, ctxt); }
            @Override public boolean mayDeserializeIds() { return false; }
            @Override public boolean isCase(int typeId) { return false; }
            @Override public boolean isRequired() { return false; }
            @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
            @Override public String toString() { return "MockTypeDeserializer"; }
        };

        parser.nextToken(); // Move to VALUE_NUMBER_INT
        Object result = deserializer.deserializeWithType(parser, ctxt, typeDeserializer);

        assertEquals(Integer.valueOf(123), result);
    }

    @Test
    public void testDeserializeWithTypeObjectAsNumberFloat() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("45.67");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        TypeDeserializer typeDeserializer = new TypeDeserializer() {
            @Override public String getPropertyName() { return null; }
            @Override public JavaType baseType() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public JsonDeserializer<Object> getDeserializer(DeserializationContext ctxt) throws JsonMappingException { return null; }
            @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return 45.67; } // As double
            @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return deserializeTypedFromScalar(p, ctxt); }
            @Override public boolean mayDeserializeIds() { return false; }
            @Override public boolean isCase(int typeId) { return false; }
            @Override public boolean isRequired() { return false; }
            @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
            @Override public String toString() { return "MockTypeDeserializer"; }
        };

        parser.nextToken(); // Move to VALUE_NUMBER_FLOAT
        Object result = deserializer.deserializeWithType(parser, ctxt, typeDeserializer);

        assertEquals(Double.valueOf(45.67), result);
    }

    @Test
    public void testDeserializeWithTypeObjectAsBooleanTrue() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("true");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        TypeDeserializer typeDeserializer = new TypeDeserializer() {
            @Override public String getPropertyName() { return null; }
            @Override public JavaType baseType() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public JsonDeserializer<Object> getDeserializer(DeserializationContext ctxt) throws JsonMappingException { return null; }
            @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return Boolean.TRUE; }
            @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return deserializeTypedFromScalar(p, ctxt); }
            @Override public boolean mayDeserializeIds() { return false; }
            @Override public boolean isCase(int typeId) { return false; }
            @Override public boolean isRequired() { return false; }
            @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
            @Override public String toString() { return "MockTypeDeserializer"; }
        };

        parser.nextToken(); // Move to VALUE_TRUE
        Object result = deserializer.deserializeWithType(parser, ctxt, typeDeserializer);

        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testDeserializeWithTypeObjectAsNull() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("null");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        TypeDeserializer typeDeserializer = new TypeDeserializer() {
            @Override public String getPropertyName() { return null; }
            @Override public JavaType baseType() { return null; }
            @Override public TypeIdResolver getTypeIdResolver() { return null; }
            @Override public JsonDeserializer<Object> getDeserializer(DeserializationContext ctxt) throws JsonMappingException { return null; }
            @Override public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException { return null; } // As null
            @Override public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException { return deserializeTypedFromScalar(p, ctxt); }
            @Override public boolean mayDeserializeIds() { return false; }
            @Override public boolean isCase(int typeId) { return false; }
            @Override public boolean isRequired() { return false; }
            @Override public TypeDeserializer forProperty(BeanProperty prop) { return this; }
            @Override public String toString() { return "MockTypeDeserializer"; }
        };

        parser.nextToken(); // Move to VALUE_NULL
        Object result = deserializer.deserializeWithType(parser, ctxt, typeDeserializer);

        assertNull(result);
    }

    // Test for mapObject handling of field names that might be tricky
    @Test
    public void testMapObjectWithSpecialFieldNames() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("{\"field with spaces\": 1, \"field-with-hyphen\": 2, \"field_with_underscore\": 3, \"123numeric\": 4}");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_OBJECT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Map);
        Map<?, ?> map = (Map<?, ?>) result;
        assertEquals(4, map.size());
        assertEquals(Integer.valueOf(1), map.get("field with spaces"));
        assertEquals(Integer.valueOf(2), map.get("field-with-hyphen"));
        assertEquals(Integer.valueOf(3), map.get("field_with_underscore"));
        assertEquals(Integer.valueOf(4), map.get("123numeric"));
    }

    // Test for mapArray handling of multiple elements of different types
    @Test
    public void testMapArrayWithMixedTypes() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("[1, \"hello\", true, null, {\"a\":1}, [2]]");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to START_ARRAY
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof List);
        List<?> list = (List<?>) result;
        assertEquals(6, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals("hello", list.get(1));
        assertEquals(Boolean.TRUE, list.get(2));
        assertNull(list.get(3));
        assertTrue(list.get(4) instanceof Map);
        assertTrue(list.get(5) instanceof List);
    }

    // Test the case where a number that fits in an int is returned as a Double if not configured otherwise
    @Test
    public void testDeserializeIntAsDoubleDefault() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("123");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_INT
        Object result = deserializer.deserialize(parser, ctxt);

        // By default, it should be returned as the optimal type, which is Integer here.
        assertTrue(result instanceof Integer);
        assertEquals(123, result);
    }

    // Test the edge case of the largest possible integer value
    @Test
    public void testDeserializeMaxIntegerValue() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("2147483647"); // Integer.MAX_VALUE
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_INT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Integer);
        assertEquals(Integer.MAX_VALUE, result);
    }

    // Test the edge case of the smallest possible integer value
    @Test
    public void testDeserializeMinIntegerValue() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("-2147483648"); // Integer.MIN_VALUE
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_INT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Integer);
        assertEquals(Integer.MIN_VALUE, result);
    }

    // Test the edge case of a value just above Integer.MAX_VALUE, which should be a Long
    @Test
    public void testDeserializeIntegerAboveMax() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("2147483648"); // Integer.MAX_VALUE + 1
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_INT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Long);
        assertEquals(2147483648L, result);
    }

    // Test the edge case of a value just below Integer.MIN_VALUE, which should be a Long
    @Test
    public void testDeserializeIntegerBelowMin() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("-2147483649"); // Integer.MIN_VALUE - 1
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_INT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Long);
        assertEquals(-2147483649L, result);
    }

    // Test the edge case of the largest possible double value
    @Test
    public void testDeserializeMaxDoubleValue() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser(String.valueOf(Double.MAX_VALUE));
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_FLOAT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Double);
        assertEquals(Double.MAX_VALUE, (Double) result, 1e-9);
    }

    // Test the edge case of the smallest possible positive double value (denormalized)
    @Test
    public void testDeserializeMinPositiveDoubleValue() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser(String.valueOf(Double.MIN_NORMAL)); // Smallest positive normal double
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_FLOAT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Double);
        assertEquals(Double.MIN_NORMAL, (Double) result, 1e-9);
    }

    // Test the edge case of a double value that is NaN
    @Test
    public void testDeserializeDoubleNaN() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("NaN");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_FLOAT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Double);
        assertTrue(Double.isNaN((Double) result));
    }

    // Test the edge case of a double value that is positive infinity
    @Test
    public void testDeserializeDoublePositiveInfinity() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("Infinity");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_FLOAT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Double);
        assertEquals(Double.POSITIVE_INFINITY, (Double) result, 1e-9);
    }

    // Test the edge case of a double value that is negative infinity
    @Test
    public void testDeserializeDoubleNegativeInfinity() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("-Infinity");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_NUMBER_FLOAT
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof Double);
        assertEquals(Double.NEGATIVE_INFINITY, (Double) result, 1e-9);
    }

    // Test for an empty string input
    @Test
    public void testDeserializeEmptyString() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("\"\"");
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_STRING
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof String);
        assertEquals("", result);
    }

    // Test for a string with special characters
    @Test
    public void testDeserializeStringWithSpecialChars() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("\"\\\"\\\n\t\f\r\b\""); // escaped quotes, newline, tab, form feed, carriage return, backspace
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        parser.nextToken(); // Move to VALUE_STRING
        Object result = deserializer.deserialize(parser, ctxt);

        assertTrue(result instanceof String);
        assertEquals("\"\n\t\f\r\b", result);
    }

    @Test
    public void testResolveAndCheckDefaultDeserializers() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("{}"); // Dummy parser
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);

        // Call resolve to ensure it initializes internal deserializers
        deserializer.resolve(ctxt);

        // This test primarily ensures the resolve() method runs without throwing exceptions.
        // Further verification of the initialized deserializers would require more complex mocking.
    }

    @Test
    public void testCreateContextualReturnsVanillaWhenNoCustom() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("{}"); // Dummy parser
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);
        BeanProperty property = null; // Not relevant for this test

        // If no custom deserializers are set, createContextual should return Vanilla.std
        JsonDeserializer<?> contextualDeserializer = deserializer.createContextual(ctxt, property);

        assertTrue(contextualDeserializer instanceof UntypedObjectDeserializer.Vanilla);
        assertSame(UntypedObjectDeserializer.Vanilla.std, contextualDeserializer);
    }

    @Test
    public void testCreateContextualReturnsSelfWhenCustomPresent() throws Exception {
        UntypedObjectDeserializer deserializer = createDeserializer();
        // Simulate a custom deserializer being present
        deserializer._stringDeserializer = new JsonDeserializer<Object>() {
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException { return "custom_string"; }
        };

        DeserializationConfig config = new MockDeserializationConfig();
        JsonParser parser = createParser("{}"); // Dummy parser
        InjectableValues injectableValues = null;
        DeserializerFactory factory = new MockDeserializerFactory() {};
        DeserializerCache cache = new MockDeserializerCache();
        MockDeserializationContext ctxt = new MockDeserializationContext(config, parser, injectableValues, factory, cache, DeserializationFeature.collectDefaults(), null);
        BeanProperty property = null; // Not relevant for this test

        JsonDeserializer<?> contextualDeserializer = deserializer.createContextual(ctxt, property);

        // Should return the original deserializer instance if custom deserializers exist
        assertSame(deserializer, contextualDeserializer);
    }

    // Mock DeserializationConfig implementation
    private static class MockDeserializationConfig extends DeserializationConfig {
        private final int _featureFlags;

        public MockDeserializationConfig() {
            // Use a valid constructor and provide necessary BaseSettings
            super(BaseSettings.Builder.create().build(), 0); // Minimal BaseSettings and feature flags
            _featureFlags = DeserializationFeature.collectDefaults();
        }

        @Override
        public TypeFactory getTypeFactory() {
            return TypeFactory.defaultInstance();
        }

        @Override
        public AnnotationIntrospector getAnnotationIntrospector() {
            return AnnotationIntrospector.nopInstance();
        }

        @Override
        public Base64Variant getBase64Variant() {
            return Base64Variants.MIME_NO_LINEFEEDS;
        }

        @Override
        public JsonNodeFactory getNodeFactory() {
            return JsonNodeFactory.instance;
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
        public boolean isEnabled(DeserializationFeature f) {
            return (_featureFlags & f.getMask()) != 0;
        }

        @Override
        public int getDeserializationFeatures() {
            return _featureFlags;
        }

        @Override
        public boolean hasDeserializationFeatures(int mask) {
            return (_featureFlags & mask) == mask;
        }

        @Override
        public boolean hasSomeOfFeatures(int mask) {
            return (_featureFlags & mask) != 0;
        }
    }
}
```