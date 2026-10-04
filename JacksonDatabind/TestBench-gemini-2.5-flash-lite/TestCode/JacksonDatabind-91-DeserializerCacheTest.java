package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Date;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;


public class DeserializerCacheTest {

    // Mock DeserializationContext and DeserializerFactory for testing
    // Mock ObjectMapper is not strictly needed if we provide concrete factory and config.
    // We need to provide concrete implementations for abstract methods.

    // A minimal concrete DeserializerFactory

    // A minimal concrete DeserializationConfig

    // A minimal concrete DeserializationContext


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
    public void testCachedDeserializersCountAfterFirstCall() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        MockDeserializationContext mockCtxt = new MockDeserializationContext(MockDeserializerFactory.INSTANCE, new MockMapperConfig());
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        cache.findValueDeserializer(mockCtxt, MockDeserializerFactory.INSTANCE, stringType); // Populate cache
        assertTrue(cache.cachedDeserializersCount() > 0);
    }

    @Test
    public void testFlushCachedDeserializersThenCount() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        MockDeserializationContext mockCtxt = new MockDeserializationContext(MockDeserializerFactory.INSTANCE, new MockMapperConfig());
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        cache.findValueDeserializer(mockCtxt, MockDeserializerFactory.INSTANCE, stringType); // Populate cache
        assertTrue(cache.cachedDeserializersCount() > 0);
        cache.flushCachedDeserializers();
        assertEquals(0, cache.cachedDeserializersCount());
    }

    @Test
    public void test_findValueDeserializer_WithReferenceType() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        MockDeserializationContext mockCtxt = new MockDeserializationContext(MockDeserializerFactory.INSTANCE, new MockMapperConfig());
        JavaType refType = TypeFactory.defaultInstance().constructType(java.util.Optional.class, String.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(mockCtxt, MockDeserializerFactory.INSTANCE, refType);
        assertNotNull(deserializer);
    }

    @Test
    public void test_findValueDeserializer_WithTreeType() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        MockDeserializationContext mockCtxt = new MockDeserializationContext(MockDeserializerFactory.INSTANCE, new MockMapperConfig());
        JavaType treeType = TypeFactory.defaultInstance().constructType(JsonNode.class);
        JsonDeserializer<Object> deserializer = cache.findValueDeserializer(mockCtxt, MockDeserializerFactory.INSTANCE, treeType);
        assertNotNull(deserializer);
    }
    
    @Test
    public void test_handleUnknownValueDeserializer() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        MockDeserializationContext mockCtxt = new MockDeserializationContext(MockDeserializerFactory.INSTANCE, new MockMapperConfig());
        JavaType unknownType = TypeFactory.defaultInstance().constructType(UnknownClass.class);
        try {
            cache.findValueDeserializer(mockCtxt, MockDeserializerFactory.INSTANCE, unknownType);
            fail("Expected JsonMappingException for unknown type");
        } catch (JsonMappingException e) {
            // Expected
            assertTrue(e.getMessage().contains("Can not find a Value deserializer"));
        }
    }

    @Test
    public void test_handleUnknownKeyDeserializer() throws Exception {
        DeserializerCache cache = new DeserializerCache();
        MockDeserializationContext mockCtxt = new MockDeserializationContext(MockDeserializerFactory.INSTANCE, new MockMapperConfig());
        JavaType unknownType = TypeFactory.defaultInstance().constructType(UnknownClass.class);
        try {
            cache.findKeyDeserializer(mockCtxt, MockDeserializerFactory.INSTANCE, unknownType);
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
}





