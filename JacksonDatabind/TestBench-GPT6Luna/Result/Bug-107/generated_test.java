package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class TypeDeserializerBaseTest {
    @Test
    public void testArrayDeserializerAccessors() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(String.class);
        TypeIdResolver resolver = null;
        AsArrayTypeDeserializer td =
                new AsArrayTypeDeserializer(base, resolver, "kind", true, null);

        assertSame(base, td.baseType());
        assertEquals(String.class.getName(), td.baseTypeName());
        assertEquals("kind", td.getPropertyName());
        assertSame(resolver, td.getTypeIdResolver());
        assertNull(td.getDefaultImpl());
    }

    @Test
    public void testWrapperDeserializerAccessors() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(Integer.class);
        AsWrapperTypeDeserializer td =
                new AsWrapperTypeDeserializer(base, null, "type", false, null);

        assertSame(base, td.baseType());
        assertEquals(Integer.class.getName(), td.baseTypeName());
        assertEquals("type", td.getPropertyName());
        assertNull(td.getDefaultImpl());
    }

    @Test
    public void testNullPropertyNameBecomesEmpty() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(Object.class);
        AsArrayTypeDeserializer td =
                new AsArrayTypeDeserializer(base, null, null, false, null);

        assertEquals("", td.getPropertyName());
    }

    @Test
    public void testEmptyPropertyNameRemainsEmpty() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(Object.class);
        AsArrayTypeDeserializer td =
                new AsArrayTypeDeserializer(base, null, "", false, null);

        assertEquals("", td.getPropertyName());
    }

    @Test
    public void testDefaultImplementationClass() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(Object.class);
        JavaType defaultType = new com.fasterxml.jackson.databind.ObjectMapper().constructType(String.class);
        AsArrayTypeDeserializer td =
                new AsArrayTypeDeserializer(base, null, "kind", false, defaultType);

        assertEquals(String.class, td.getDefaultImpl());
    }

    @Test
    public void testDefaultImplementationAbsent() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(Object.class);
        AsArrayTypeDeserializer td =
                new AsArrayTypeDeserializer(base, null, "kind", false, null);

        assertNull(td.getDefaultImpl());
    }

    @Test
    public void testBaseTypeRetainsParameterizedType() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper()
                .getTypeFactory().constructCollectionType(java.util.List.class, String.class);
        AsWrapperTypeDeserializer td =
                new AsWrapperTypeDeserializer(base, null, "kind", true, null);

        assertSame(base, td.baseType());
        assertEquals(java.util.List.class.getName(), td.baseTypeName());
    }

    @Test
    public void testBaseTypeNameForArray() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(int[].class);
        AsArrayTypeDeserializer td =
                new AsArrayTypeDeserializer(base, null, "kind", false, null);

        assertEquals(int[].class.getName(), td.baseTypeName());
    }

    @Test
    public void testTypePropertyPreservesCase() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(Object.class);
        AsArrayTypeDeserializer td =
                new AsArrayTypeDeserializer(base, null, "Kind", false, null);

        assertEquals("Kind", td.getPropertyName());
    }

    @Test
    public void testTypePropertyPreservesWhitespace() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(Object.class);
        AsArrayTypeDeserializer td =
                new AsArrayTypeDeserializer(base, null, " kind ", false, null);

        assertEquals(" kind ", td.getPropertyName());
    }

    @Test
    public void testPropertyCopyRetainsBaseTypeAndName() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(String.class);
        AsArrayTypeDeserializer original =
                new AsArrayTypeDeserializer(base, null, "kind", true, null);
        TypeDeserializer copy = original.forProperty(null);

        assertEquals("kind", copy.getPropertyName());
        assertSame(base, ((TypeDeserializerBase) copy).baseType());
    }

    @Test
    public void testPropertyCopyRetainsResolver() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(String.class);
        AsWrapperTypeDeserializer original =
                new AsWrapperTypeDeserializer(base, null, "kind", true, null);
        TypeDeserializer copy = original.forProperty(null);

        assertSame(original.getTypeIdResolver(), copy.getTypeIdResolver());
    }

    @Test
    public void testToStringContainsImplementationClassAndBaseType() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(String.class);
        AsArrayTypeDeserializer td =
                new AsArrayTypeDeserializer(base, null, "kind", false, null);
        String value = td.toString();

        assertTrue(value.startsWith("["));
        assertTrue(value.contains(AsArrayTypeDeserializer.class.getName()));
        assertTrue(value.contains("; base-type:"));
        assertTrue(value.contains(String.class.getName()));
        assertTrue(value.endsWith("]"));
    }

    @Test
    public void testToStringContainsResolverLabel() throws Exception {
        JavaType base = new com.fasterxml.jackson.databind.ObjectMapper().constructType(Object.class);
        AsWrapperTypeDeserializer td =
                new AsWrapperTypeDeserializer(base, null, "kind", false, null);

        assertTrue(td.toString().contains("; id-resolver: "));
    }
}
