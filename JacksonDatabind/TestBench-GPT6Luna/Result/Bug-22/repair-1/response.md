```java
package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.*;
import com.fasterxml.jackson.databind.ser.std.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;

public class BasicSerializerFactoryTest {
    @Test
    public void testFactoryConfigPresent() throws Exception {
        assertNotNull(BeanSerializerFactory.instance.getFactoryConfig());
    }

    @Test
    public void testFactoryConfigReturnsSameInstance() throws Exception {
        SerializerFactoryConfig config = BeanSerializerFactory.instance.getFactoryConfig();
        assertSame(config, BeanSerializerFactory.instance.getFactoryConfig());
    }

    @Test
    public void testWithSameConfigReturnsSameFactory() throws Exception {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        assertSame(factory, factory.withConfig(factory.getFactoryConfig()));
    }

    @Test
    public void testWithAdditionalSerializersCreatesConfiguredFactory() throws Exception {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        SerializerFactory result = factory.withAdditionalSerializers(new Serializers.Base());
        assertNotSame(factory, result);
        assertTrue(((BeanSerializerFactory) result).getFactoryConfig().hasSerializers());
    }

    @Test
    public void testWithAdditionalKeySerializersCreatesConfiguredFactory() throws Exception {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        SerializerFactory result = factory.withAdditionalKeySerializers(new Serializers.Base());
        assertNotSame(factory, result);
        assertTrue(((BeanSerializerFactory) result).getFactoryConfig().hasKeySerializers());
    }

    @Test
    public void testWithSerializerModifierCreatesConfiguredFactory() throws Exception {
        BeanSerializerFactory factory = BeanSerializerFactory.instance;
        BeanSerializerModifier modifier = new BeanSerializerModifier() {
            public List<BeanPropertyWriter> changeProperties(SerializationConfig c, BeanDescription d,
                    List<BeanPropertyWriter> p) { return p; }
            public List<BeanPropertyWriter> orderProperties(SerializationConfig c, BeanDescription d,
                    List<BeanPropertyWriter> p) { return p; }
            public BeanSerializerBuilder updateBuilder(SerializationConfig c, BeanDescription d,
                    BeanSerializerBuilder b) { return b; }
            public JsonSerializer<?> modifySerializer(SerializationConfig c, BeanDescription d,
                    JsonSerializer<?> s) { return s; }
            public JsonSerializer<?> modifyArraySerializer(SerializationConfig c, ArrayType t,
                    BeanDescription d, JsonSerializer<?> s) { return s; }
            public JsonSerializer<?> modifyCollectionSerializer(SerializationConfig c, CollectionType t,
                    BeanDescription d, JsonSerializer<?> s) { return s; }
            public JsonSerializer<?> modifyCollectionLikeSerializer(SerializationConfig c,
                    CollectionLikeType t, BeanDescription d, JsonSerializer<?> s) { return s; }
            public JsonSerializer<?> modifyMapSerializer(SerializationConfig c, MapType t,
                    BeanDescription d, JsonSerializer<?> s) { return s; }
            public JsonSerializer<?> modifyMapLikeSerializer(SerializationConfig c, MapLikeType t,
                    BeanDescription d, JsonSerializer<?> s) { return s; }
            public JsonSerializer<?> modifyEnumSerializer(SerializationConfig c, JavaType t,
                    BeanDescription d, JsonSerializer<?> s) { return s; }
            public JsonSerializer<?> modifyKeySerializer(SerializationConfig c, JavaType t,
                    BeanDescription d, JsonSerializer<?> s) { return s; }
        };
        SerializerFactory result = factory.withSerializerModifier(modifier);
        assertNotSame(factory, result);
        assertTrue(((BeanSerializerFactory) result).getFactoryConfig().hasSerializerModifiers());
    }

    @Test
    public void testCreateSerializerForString() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        JsonSerializer<Object> serializer = BeanSerializerFactory.instance.createSerializer(
                mapper.getSerializerProvider(), type);
        assertNotNull(serializer);
    }

    @Test
    public void testCreateSerializerForInteger() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(Integer.class);
        JsonSerializer<Object> serializer = BeanSerializerFactory.instance.createSerializer(
                mapper.getSerializerProvider(), type);
        assertNotNull(serializer);
    }

    @Test
    public void testCreateSerializerForStringList() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, String.class);
        JsonSerializer<Object> serializer = BeanSerializerFactory.instance.createSerializer(
                mapper.getSerializerProvider(), type);
        assertNotNull(serializer);
    }

    @Test
    public void testCreateSerializerForStringArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String[].class);
        JsonSerializer<Object> serializer = BeanSerializerFactory.instance.createSerializer(
                mapper.getSerializerProvider(), type);
        assertNotNull(serializer);
    }

    @Test
    public void testCreateTypeSerializerWithoutTypeInfoIsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNull(BeanSerializerFactory.instance.createTypeSerializer(mapper.getSerializationConfig(), type));
    }

    @Test
    public void testCreateKeySerializerWithExplicitDefault() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(Object.class);
        JsonSerializer<Object> supplied = new StdSerializer<Object>(Object.class) {
            private static final long serialVersionUID = 1L;
            public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen,
                    SerializerProvider provider) { }
        };
        assertSame(supplied, BeanSerializerFactory.instance.createKeySerializer(
                mapper.getSerializationConfig(), type, supplied));
    }

    @Test
    public void testIndexedListSerializerConstructed() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType elemType = mapper.getTypeFactory().constructType(String.class);
        ContainerSerializer<?> serializer = BeanSerializerFactory.instance
                .buildIndexedListSerializer(elemType, false, null, null);
        assertNotNull(serializer);
    }

    @Test
    public void testCollectionSerializerConstructed() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType elemType = mapper.getTypeFactory().constructType(String.class);
        ContainerSerializer<?> serializer = BeanSerializerFactory.instance
                .buildCollectionSerializer(elemType, false, null, null);
        assertNotNull(serializer);
    }

    @Test
    public void testEnumSetSerializerConstructed() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType enumType = mapper.getTypeFactory().constructType(Thread.State.class);
        JsonSerializer<?> serializer = BeanSerializerFactory.instance.buildEnumSetSerializer(enumType);
        assertNotNull(serializer);
    }

    @Test
    public void testFindBeanSerializerForStringReturnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);
        assertNull(BeanSerializerFactory.instance.findBeanSerializer(mapper.getSerializerProvider(), type, desc));
    }

    @Test
    public void testFindBeanSerializerForPlainBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(TestBean.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);
        assertNotNull(BeanSerializerFactory.instance.findBeanSerializer(mapper.getSerializerProvider(), type, desc));
    }

    @Test
    public void testFindPropertyTypeSerializerWithoutTypeMetadataIsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        assertNull(BeanSerializerFactory.instance.findPropertyTypeSerializer(
                type, mapper.getSerializationConfig(), null));
    }

    @Test
    public void testFindPropertyContentTypeSerializerWithoutTypeMetadataIsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, String.class);
        assertNull(BeanSerializerFactory.instance.findPropertyContentTypeSerializer(
                type, mapper.getSerializationConfig(), null));
    }

    public static class TestBean {
        public int getValue() { return 7; }
    }
}
```