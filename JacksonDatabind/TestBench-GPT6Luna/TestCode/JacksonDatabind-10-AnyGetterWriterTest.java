package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

public class AnyGetterWriterTest {
    @Test
    public void testSerializeAnyGetterMap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("answer", 42);
        assertEquals("{\"answer\":42}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeEmptyMap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals("{}", mapper.writeValueAsString(new LinkedHashMap<String, Object>()));
    }

    @Test
    public void testSerializeMapWithNullValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("key", null);
        assertEquals("{\"key\":null}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeMapWithBoolean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("flag", true);
        assertEquals("{\"flag\":true}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeMapWithString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("key", "value");
        assertEquals("{\"key\":\"value\"}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeMapWithZero() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("n", 0);
        assertEquals("{\"n\":0}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeMapWithNegativeNumber() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("n", -1);
        assertEquals("{\"n\":-1}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeTwoMapFields() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("a", 1);
        values.put("b", 2);
        assertEquals("{\"a\":1,\"b\":2}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeNestedMap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> nested = new LinkedHashMap<String, Object>();
        nested.put("x", 1);
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("nested", nested);
        assertEquals("{\"nested\":{\"x\":1}}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeMapArrayValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("items", Arrays.asList(1, 2));
        assertEquals("{\"items\":[1,2]}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeMapWithEscapedString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("key", "a\nb");
        assertEquals("{\"key\":\"a\\nb\"}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeLargeIntegerValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("n", 2147483647);
        assertEquals("{\"n\":2147483647}", mapper.writeValueAsString(values));
    }

    @Test
    public void testSerializeFirstValueAndNullSecondValue() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> values = new LinkedHashMap<String, Object>();
        values.put("a", 1);
        values.put("b", null);
        assertEquals("{\"a\":1,\"b\":null}", mapper.writeValueAsString(values));
    }

    @Test
    public void testFactoryWithSameConfigurationReturnsSameFactory() throws Exception {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        SerializerFactory result = factory.withConfig(new SerializerFactoryConfig());
        assertNotNull(result);
    }

    @Test
    public void testCreateSerializerForString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        JsonSerializer<Object> serializer =
                BeanSerializerFactory.instance.createSerializer(
                        mapper.getSerializerProvider(), type);
        assertNotNull(serializer);
    }

    @Test
    public void testFindBeanSerializerForStringType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        BeanDescription description = mapper.getSerializationConfig().introspect(type);
        SerializerProvider provider = mapper.getSerializerProvider();
        JsonSerializer<Object> serializer =
                BeanSerializerFactory.instance.findBeanSerializer(provider, type, description);
        assertNull(serializer);
    }

    @Test
    public void testFindPropertyTypeSerializerWithoutPropertyResolver() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        TypeSerializer serializer =
                BeanSerializerFactory.instance.findPropertyTypeSerializer(
                        type, mapper.getSerializationConfig(), null);
        assertNull(serializer);
    }

    @Test
    public void testFindPropertyContentTypeSerializerWithoutPropertyResolver() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructMapType(
                Map.class, String.class, Object.class);
        TypeSerializer serializer =
                BeanSerializerFactory.instance.findPropertyContentTypeSerializer(
                        type, mapper.getSerializationConfig(), null);
        assertNull(serializer);
    }
}
