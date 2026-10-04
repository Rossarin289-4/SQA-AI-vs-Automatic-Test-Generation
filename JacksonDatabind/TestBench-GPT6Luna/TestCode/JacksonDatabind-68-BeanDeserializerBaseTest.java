package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.*;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;

public class BeanDeserializerBaseTest {
    @Test
    public void testBasicMapperDeserialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<?, ?> result = mapper.readValue("{\"a\":1}", Map.class);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testMapperDeserializesEmptyObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<?, ?> result = mapper.readValue("{}", Map.class);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMapperDeserializesBooleanTrue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(Boolean.TRUE, mapper.readValue("true", Boolean.class));
    }

    @Test
    public void testMapperDeserializesBooleanFalse() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(Boolean.FALSE, mapper.readValue("false", Boolean.class));
    }

    @Test
    public void testMapperDeserializesSmallInteger() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(Integer.valueOf(7), mapper.readValue("7", Integer.class));
    }

    @Test
    public void testMapperDeserializesNegativeInteger() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(Integer.valueOf(-1), mapper.readValue("-1", Integer.class));
    }

    @Test
    public void testMapperDeserializesLongInteger() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(Long.valueOf(2147483648L), mapper.readValue("2147483648", Long.class));
    }

    @Test
    public void testMapperDeserializesDecimal() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(Double.valueOf(1.25), mapper.readValue("1.25", Double.class));
    }

    @Test
    public void testMapperDeserializesNullStringForString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals("null", mapper.readValue("\"null\"", String.class));
    }

    @Test
    public void testMapperDeserializesEmptyString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals("", mapper.readValue("\"\"", String.class));
    }

    @Test
    public void testMapperDeserializesArrayAtEndpoints() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<?> result = mapper.readValue("[1,2]", List.class);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    public void testMapperDeserializesNestedObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<?, ?> result = mapper.readValue("{\"outer\":{\"n\":2}}", Map.class);
        Map<?, ?> nested = (Map<?, ?>) result.get("outer");
        assertEquals(2, nested.get("n"));
    }

    @Test
    public void testMapperDeserializesArrayNullElement() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<?> result = mapper.readValue("[null]", List.class);
        assertEquals(1, result.size());
        assertNull(result.get(0));
    }
}
