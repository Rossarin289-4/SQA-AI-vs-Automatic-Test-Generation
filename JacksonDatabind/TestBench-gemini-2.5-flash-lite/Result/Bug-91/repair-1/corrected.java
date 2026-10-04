package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers; // Added for potentially creating DeserializerFactory
import com.fasterxml.jackson.databind.node.JsonNodeFactory; // Added for JsonNode

public class DeserializerCacheTest {

    // Mock DeserializationContext and DeserializerFactory for testing
    private final ObjectMapper objectMapper = new ObjectMapper();
    // getDeserializerFactory() is not public on ObjectMapper in older versions.
    // We'll use a default DeserializerFactory and a mock DeserializationContext.
    private final DeserializerFactory factory = DeserializerFactory.Feature.values().length > 0 ?
        BeanDeserializerFactory.instance : null; // Use a concrete factory if available, otherwise null
    private final DeserializationContext ctxt = new MockDeserializationContext(objectMapper);


    @Test
    public void testCachedDeserializersCountWhenEmpty() {
        DeserializerCache cache = new DeserializerCache();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFlushCachedDeserializersWhenEmpty() {
        DeserializerCache cache = new DeserializerCache();
        cache.flushCachedDeserializers(); // Should not throw exception
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void testFindValueDeserializer_NullJavaType() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        try {
            cache.findValueDeserializer(ctxt, factory, null);
            fail("Expected IllegalArgumentException for null JavaType");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testFindValueDeserializer_PrimitiveInt() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType intType = TypeFactory.defaultInstance().constructType(int.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, intType);
        assertNotNull(deserializer);
    }
    
    @Test
    public void testFindValueDeserializer_String() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, stringType);
        assertNotNull(deserializer);
    }

    @Test
    public void testFindValueDeserializer_IntegerWrapper() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType integerType = TypeFactory.defaultInstance().constructType(Integer.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, integerType);
        assertNotNull(deserializer);
    }
    
    @Test
    public void testFindValueDeserializer_List() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType listType = TypeFactory.defaultInstance().constructType(java.util.List.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, listType);
        assertNotNull(deserializer);
    }

    @Test
    public void testFindValueDeserializer_Map() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType mapType = TypeFactory.defaultInstance().constructType(java.util.Map.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, mapType);
        assertNotNull(deserializer);
    }

    @Test
    public void testFindValueDeserializer_Array() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType arrayType = TypeFactory.defaultInstance().constructType(String[].class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, arrayType);
        assertNotNull(deserializer);
    }
    
    @Test
    public void testFindValueDeserializer_Enum() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType enumType = TypeFactory.defaultInstance().constructType(MyEnum.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, enumType);
        assertNotNull(deserializer);
    }

    @Test
    public void testFindValueDeserializer_WithCustomConverterAnnotation() throws Exception {
        // Cannot directly test annotation lookup without a class structure.
        // Test a standard type, expecting a standard deserializer.
        DeserializerCache cache = new DeserializerCache();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, stringType);
        assertNotNull(deserializer);
    }

    @Test
    public void testFindValueDeserializer_StdDelegatingDeserializer() throws Exception {
        // This test path is hard to trigger directly without a custom setup or annotations.
        // We'll test a standard type and expect a non-delegating deserializer in default setup.
        DeserializerCache cache = new DeserializerCache();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, stringType);
        assertNotNull(deserializer);
        // Assert that it's NOT a StdDelegatingDeserializer in this default context.
        assertNotSame(StdDelegatingDeserializer.class, deserializer.getClass());
    }

    @Test
    public void testFindKeyDeserializer_String() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, factory, stringType);
        assertNotNull(kd);
    }

    @Test
    public void testFindKeyDeserializer_Integer() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, factory, intType);
        assertNotNull(kd);
    }

    @Test
    public void testFindKeyDeserializer_Enum() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType enumType = TypeFactory.defaultInstance().constructType(MyEnum.class);
        KeyDeserializer kd = cache.findKeyDeserializer(ctxt, factory, enumType);
        assertNotNull(kd);
    }

    @Test
    public void testHasValueDeserializerFor_String() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        assertTrue(cache.hasValueDeserializerFor(ctxt, factory, stringType));
    }

    @Test
    public void testHasValueDeserializerFor_Integer() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        assertTrue(cache.hasValueDeserializerFor(ctxt, factory, intType));
    }

    @Test
    public void testHasValueDeserializerFor_UnknownAbstractType() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType abstractType = TypeFactory.defaultInstance().constructType(java.util.Collection.class);
        assertTrue(cache.hasValueDeserializerFor(ctxt, factory, abstractType));
    }

    @Test
    public void testCachedDeserializersCountAfterFirstCall() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        cache.findValueDeserializer(ctxt, factory, stringType); // Populate cache
        assertTrue(cache.cachedDeserializersCount() > 0);
    }

    @Test
    public void testFlushCachedDeserializersThenCount() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        cache.findValueDeserializer(ctxt, factory, stringType); // Populate cache
        assertTrue(cache.cachedDeserializersCount() > 0);
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void test_findValueDeserializer_WithReferenceType() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType refType = TypeFactory.defaultInstance().constructType(java.util.Optional.class, String.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, refType);
        assertNotNull(deserializer);
    }

    @Test
    public void test_findValueDeserializer_WithTreeType() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType treeType = TypeFactory.defaultInstance().constructType(JsonNode.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(ctxt, factory, treeType);
        assertNotNull(deserializer);
    }
    
    @Test
    public void test_handleUnknownValueDeserializer() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType unknownType = TypeFactory.defaultInstance().constructType(UnknownClass.class);
        try {
            cache.findValueDeserializer(ctxt, factory, unknownType);
            fail("Expected JsonMappingException for unknown type");
        } catch (JsonMappingException e) {
            // Expected
            assertTrue(e.getMessage().contains("Can not find a Value deserializer"));
        }
    }

    @Test
    public void test_handleUnknownKeyDeserializer() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        JavaType unknownType = TypeFactory.defaultInstance().constructType(UnknownClass.class);
        try {
            cache.findKeyDeserializer(ctxt, factory, unknownType);
            fail("Expected JsonMappingException for unknown key type");
        } catch (JsonMappingException e) {
            // Expected
            assertTrue(e.getMessage().contains("Can not find a (Map) Key deserializer"));
        }
    }

    // Helper enum for testing
    private enum MyEnum {
        VALUE1, VALUE2
    }

    // Dummy class to represent an unknown type for testing error handling
    private static class UnknownClass {}

    // Mock DeserializationContext to avoid issues with ObjectMapper's internal state
    private static class MockDeserializationContext extends DeserializationContext {
        private final ObjectMapper _mapper;
        private final BeanDescription _beanDescription = null; // Simplified for this mock
        private final JsonNodeFactory _nodeFactory = JsonNodeFactory.instance;

        protected MockDeserializationContext(ObjectMapper mapper) {
            super(null, null); // Pass null for DeserializerProvider and MapperConfig
            _mapper = mapper;
        }

        @Override
        public DeserializerFactory getFactory() {
            return _mapper.getDeserializerFactory(); // Use factory from ObjectMapper
        }

        @Override
        public BeanDescription getActiveView() {
            return _beanDescription; // Return null as simplified
        }

        @Override
        public boolean isEnabled(MapperFeature feature) {
            return true; // Assume enabled for simplicity
        }

        @Override
        public boolean isEnabled(DeserializationFeature feature) {
            return true; // Assume enabled for simplicity
        }
        
        @Override
        public JsonNodeFactory getNodeFactory() {
            return _nodeFactory;
        }

        @Override
        public void reportMappingException(String msg, Object... params) throws JsonMappingException {
            throw new JsonMappingException(null, String.format(msg, params));
        }
        
        @Override
        public void reportMappingException(Throwable t, String msg, Object... params) throws JsonMappingException {
             throw new JsonMappingException(null, String.format(msg, params), t);
        }

        // Dummy implementations for other methods that might be called
        @Override
        public void handleError(Throwable t) throws IOException { }
        @Override
        public JsonDeserializer<Object> findValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException { return null;} // Simplified
        @Override
        public KeyDeserializer findKeyDeserializer(JavaType type, BeanProperty property) throws JsonMappingException { return null;} // Simplified
        @Override
        public Object findInjectableValue(Object key, BeanProperty forProperty) { return null;}
        @Override
        public TypeDeserializer findTypeDeserializer(JavaType type, BeanProperty property) throws JsonMappingException { return null;}
        @Override
        public AnnotationIntrospector getAnnotationIntrospector() { return _mapper.getDeserializationConfig().getAnnotationIntrospector(); }
        @Override
        public Class<?> getActiveClassLoader() { return null; }
        @Override
        public TypeFactory getTypeFactory() { return _mapper.getTypeFactory(); }
        @Override
        public Locale getLocale() { return Locale.getDefault(); }
        @Override
        public TimeZone getTimeZone() { return TimeZone.getDefault(); }
        @Override
        public Calendar defaultCalendar(Date nowDate) { return null;}
        @Override
        public Date defaultDate(long ms) { return null;}
    }
}
