package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Field;
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
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
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

    // Helper to create a default SerializerFactoryConfig
    private SerializerFactoryConfig createDefaultConfig() {
        return new SerializerFactoryConfig();
    }

    // Helper to create a default SerializerProvider
    private SerializerProvider createProvider(SerializerFactory factory) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializerFactory(factory);
        // Use the protected method from ObjectMapper to get a SerializerProvider
        Method method = ObjectMapper.class.getDeclaredMethod("getSerializerProviderInstance");
        method.setAccessible(true);
        return (SerializerProvider) method.invoke(mapper);
    }
    
    // Helper to create a default SerializationConfig
    private SerializationConfig createConfig() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getSerializationConfig();
    }

    // Helper to create a default BeanDescription
    private BeanDescription createBeanDescription(JavaType type) {
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        return config.introspect(type);
    }
    
    // Helper to create a default AnnotatedClass

    // Helper to create a default AnnotatedMethod

    @Test
    public void testCreateSerializerForString() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof StringSerializer);
    }

    @Test
    public void testCreateSerializerForInteger() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof NumberSerializers.IntegerSerializer);
    }

    @Test
    public void testCreateSerializerForBooleanPrimitive() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(boolean.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof BooleanSerializer);
        // Verify it's the primitive version
        Field field = BooleanSerializer.class.getDeclaredField("_primitive");
        field.setAccessible(true);
        assertTrue((Boolean) field.get(serializer));
    }
    
    @Test
    public void testCreateSerializerForBooleanWrapper() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(Boolean.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof BooleanSerializer);
        // Verify it's the wrapper version
        Field field = BooleanSerializer.class.getDeclaredField("_primitive");
        field.setAccessible(true);
        assertFalse((Boolean) field.get(serializer));
    }

    @Test
    public void testCreateSerializerForBigInteger() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(BigInteger.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof NumberSerializer);
        Field field = NumberSerializer.class.getDeclaredField("_numberClass");
        field.setAccessible(true);
        assertEquals(BigInteger.class, field.get(serializer));
    }

    @Test
    public void testCreateSerializerForBigDecimal() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(BigDecimal.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof NumberSerializer);
        Field field = NumberSerializer.class.getDeclaredField("_numberClass");
        field.setAccessible(true);
        assertEquals(BigDecimal.class, field.get(serializer));
    }

    @Test
    public void testCreateSerializerForCalendar() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(Calendar.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof CalendarSerializer);
    }

    @Test
    public void testCreateSerializerForDate() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(java.util.Date.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof DateSerializer);
    }
    
    @Test
    public void testCreateSerializerForTimestamp() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(java.sql.Timestamp.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof DateSerializer); // Timestamp is serialized as Date
    }

    @Test
    public void testCreateSerializerForToStringSerializedTypes() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);

        JavaType stringBufferType = TypeFactory.defaultInstance().constructType(StringBuffer.class);
        JsonSerializer<?> stringBufferSerializer = factory.createSerializer(provider, stringBufferType);
        assertNotNull(stringBufferSerializer);
        assertTrue(stringBufferSerializer instanceof ToStringSerializer);

        JavaType stringBuilderType = TypeFactory.defaultInstance().constructType(StringBuilder.class);
        JsonSerializer<?> stringBuilderSerializer = factory.createSerializer(provider, stringBuilderType);
        assertNotNull(stringBuilderSerializer);
        assertTrue(stringBuilderSerializer instanceof ToStringSerializer);

        JavaType characterType = TypeFactory.defaultInstance().constructType(Character.class);
        JsonSerializer<?> characterSerializer = factory.createSerializer(provider, characterType);
        assertNotNull(characterSerializer);
        assertTrue(characterSerializer instanceof ToStringSerializer);
    }

    @Test
    public void testCreateSerializerForByteBuffer() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(ByteBuffer.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof ByteBufferSerializer);
    }

    @Test
    public void testCreateSerializerForInetAddress() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(InetAddress.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof InetAddressSerializer);
    }
    
    @Test
    public void testCreateSerializerForInetSocketAddress() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(InetSocketAddress.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof InetSocketAddressSerializer);
    }

    @Test
    public void testCreateSerializerForTimeZone() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(TimeZone.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof TimeZoneSerializer);
    }

    @Test
    public void testCreateSerializerForCharset() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(java.nio.charset.Charset.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof ToStringSerializer);
    }

    @Test
    public void testCreateSerializerForEnum() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        // Use a local enum for testing, avoiding external dependencies.
        JavaType type = TypeFactory.defaultInstance().constructType(SampleEnum.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof EnumSerializer);
    }

    @Test
    public void testFindSerializerByLookupForString() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        // Use reflection to call protected method
        Method method = BasicSerializerFactory.class.getDeclaredMethod("findSerializerByLookup", JavaType.class, SerializationConfig.class, BeanDescription.class, boolean.class);
        method.setAccessible(true);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, type, config, beanDesc, false);
        assertNotNull(serializer);
        assertTrue(serializer instanceof StringSerializer);
    }

    @Test
    public void testFindSerializerByLookupForAtomicReference() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(AtomicReference.class);
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("findSerializerByLookup", JavaType.class, SerializationConfig.class, BeanDescription.class, boolean.class);
        method.setAccessible(true);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, type, config, beanDesc, false);
        assertNotNull(serializer);
        assertTrue(serializer instanceof AtomicReferenceSerializer);
    }
    
    @Test
    public void testFindSerializerByAnnotationsForJsonSerializable() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(JsonSerializableType.class); // Custom class implementing JsonSerializable
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("findSerializerByAnnotations", SerializerProvider.class, JavaType.class, BeanDescription.class);
        method.setAccessible(true);
        SerializerProvider provider = createProvider(factory); // Need a provider for this call
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, provider, type, beanDesc);
        assertNotNull(serializer);
        assertTrue(serializer instanceof SerializableSerializer);
    }

    @Test
    public void testFindSerializerByPrimaryTypeForMapEntry() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(Map.Entry.class);
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("findSerializerByPrimaryType", SerializerProvider.class, JavaType.class, BeanDescription.class, boolean.class);
        method.setAccessible(true);
        SerializerProvider provider = createProvider(factory);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, provider, type, beanDesc, false);
        assertNotNull(serializer);
        assertTrue(serializer instanceof MapEntrySerializer);
    }

    @Test
    public void testFindSerializerByPrimaryTypeForNumber() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(Number.class);
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("findSerializerByPrimaryType", SerializerProvider.class, JavaType.class, BeanDescription.class, boolean.class);
        method.setAccessible(true);
        SerializerProvider provider = createProvider(factory);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, provider, type, beanDesc, false);
        assertNotNull(serializer);
        assertTrue(serializer instanceof NumberSerializer);
    }
    
    @Test
    public void testFindSerializerByPrimaryTypeForEnum() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(SampleEnum.class);
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("findSerializerByPrimaryType", SerializerProvider.class, JavaType.class, BeanDescription.class, boolean.class);
        method.setAccessible(true);
        SerializerProvider provider = createProvider(factory);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, provider, type, beanDesc, false);
        assertNotNull(serializer);
        assertTrue(serializer instanceof EnumSerializer);
    }

    @Test
    public void testFindSerializerByAddonTypeForIterable() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(List.class); 
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("findSerializerByAddonType", SerializationConfig.class, JavaType.class, BeanDescription.class, boolean.class);
        method.setAccessible(true);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, config, type, beanDesc, false);
        assertNotNull(serializer);
        assertTrue(serializer instanceof IterableSerializer); 
    }
    
    @Test
    public void testFindSerializerByAddonTypeForCharSequence() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(CharSequence.class);
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("findSerializerByAddonType", SerializationConfig.class, JavaType.class, BeanDescription.class, boolean.class);
        method.setAccessible(true);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, config, type, beanDesc, false);
        assertNotNull(serializer);
        assertTrue(serializer instanceof ToStringSerializer);
    }

    @Test
    public void testBuildContainerSerializerForMap() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(Map.class);
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        SerializerProvider provider = createProvider(factory);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("buildContainerSerializer", SerializerProvider.class, JavaType.class, BeanDescription.class, boolean.class);
        method.setAccessible(true);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, provider, type, beanDesc, false);
        assertNotNull(serializer);
        assertTrue(serializer instanceof MapSerializer);
    }

    @Test
    public void testBuildContainerSerializerForCollection() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(List.class);
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        SerializerProvider provider = createProvider(factory);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("buildContainerSerializer", SerializerProvider.class, JavaType.class, BeanDescription.class, boolean.class);
        method.setAccessible(true);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, provider, type, beanDesc, false);
        assertNotNull(serializer);
        assertTrue(serializer instanceof CollectionSerializer);
    }

    @Test
    public void testBuildContainerSerializerForArray() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(String[].class);
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        SerializerProvider provider = createProvider(factory);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("buildContainerSerializer", SerializerProvider.class, JavaType.class, BeanDescription.class, boolean.class);
        method.setAccessible(true);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, provider, type, beanDesc, false);
        assertNotNull(serializer);
        assertTrue(serializer instanceof StringArraySerializer); // Specific for String[]
    }

    @Test
    public void testBuildIndexedListSerializer() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType elemType = TypeFactory.defaultInstance().constructType(String.class);
        TypeSerializer vts = null; // Not testing type serializer here
        JsonSerializer<Object> valueSerializer = null; // Not testing value serializer here
        ContainerSerializer<?> serializer = factory.buildIndexedListSerializer(elemType, false, vts, valueSerializer);
        assertNotNull(serializer);
        assertTrue(serializer instanceof IndexedListSerializer);
    }
    
    @Test
    public void testBuildCollectionSerializer() {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType elemType = TypeFactory.defaultInstance().constructType(String.class);
        TypeSerializer vts = null; // Not testing type serializer here
        JsonSerializer<Object> valueSerializer = null; // Not testing value serializer here
        ContainerSerializer<?> serializer = factory.buildCollectionSerializer(elemType, false, vts, valueSerializer);
        assertNotNull(serializer);
        assertTrue(serializer instanceof CollectionSerializer);
    }
    
    @Test
    public void testBuildEnumSetSerializer() {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType enumType = TypeFactory.defaultInstance().constructType(SampleEnum.class);
        JsonSerializer<?> serializer = factory.buildEnumSetSerializer(enumType);
        assertNotNull(serializer);
        assertTrue(serializer instanceof EnumSetSerializer);
    }

    @Test
    public void testBuildMapSerializer() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        MapType type = (MapType) TypeFactory.defaultInstance().constructType(Map.class);
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        SerializerProvider provider = createProvider(factory);
        // Need to mock/mock up some arguments for buildMapSerializer
        JsonSerializer<Object> keySerializer = null; // default
        TypeSerializer elementTypeSerializer = null; // default
        JsonSerializer<Object> elementValueSerializer = null; // default
        
        // The buildMapSerializer method is protected, need reflection to call it
        Method method = BasicSerializerFactory.class.getDeclaredMethod("buildMapSerializer", SerializerProvider.class, MapType.class, BeanDescription.class, boolean.class, JsonSerializer.class, TypeSerializer.class, JsonSerializer.class);
        method.setAccessible(true);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, provider, type, beanDesc, false, keySerializer, elementTypeSerializer, elementValueSerializer);
        assertNotNull(serializer);
        assertTrue(serializer instanceof MapSerializer);
    }
    
    @Test
    public void testFindBeanSerializerForNonBean() throws Exception {
        BasicSerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        JavaType type = TypeFactory.defaultInstance().constructType(String.class); // Not a bean, should return null
        SerializationConfig config = createConfig();
        BeanDescription beanDesc = createBeanDescription(type);
        SerializerProvider provider = createProvider(factory);
        Method method = BasicSerializerFactory.class.getDeclaredMethod("findBeanSerializer", SerializerProvider.class, JavaType.class, BeanDescription.class);
        method.setAccessible(true);
        JsonSerializer<?> serializer = (JsonSerializer<?>) method.invoke(factory, provider, type, beanDesc);
        assertNull(serializer);
    }

    // Test for a specific type from StdJdkSerializers: UUID
    @Test
    public void testCreateSerializerForUUID() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(UUID.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof ToStringSerializer); // UUID uses ToStringSerializer
    }

    // Test createKeySerializer with default implementation
    @Test
    public void testCreateKeySerializerDefault() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializationConfig config = createConfig();
        JavaType keyType = TypeFactory.defaultInstance().constructType(String.class);
        JsonSerializer<Object> defaultImpl = null;
        JsonSerializer<Object> keySerializer = factory.createKeySerializer(config, keyType, defaultImpl);
        assertNotNull(keySerializer);
        // The exact serializer depends on StdKeySerializers implementation. StringKeySerializer is common.
        assertTrue(keySerializer instanceof StdKeySerializers.StringKeySerializer);
    }
    
    // Test createTypeSerializer for a basic class
    @Test
    public void testCreateTypeSerializerForSimpleClass() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializationConfig config = createConfig();
        JavaType baseType = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        TypeSerializer typeSerializer = factory.createTypeSerializer(config, baseType);
        assertNull(typeSerializer); // No type resolver configured by default
    }

    // Test that a configured factory with additional serializers is returned

    // Test that a configured factory with additional key serializers is returned

    // Test that a configured factory with a serializer modifier is returned
    
    // Test that withConfig creates a new instance with the new config
    
    // Test for a specific registered serializer from _concreteLazy
    @Test
    public void testCreateSerializerForSqlDateLazy() throws Exception {
        SerializerFactory factory = new BeanSerializerFactory(createDefaultConfig());
        SerializerProvider provider = createProvider(factory);
        JavaType type = TypeFactory.defaultInstance().constructType(java.sql.Date.class);
        JsonSerializer<?> serializer = factory.createSerializer(provider, type);
        assertNotNull(serializer);
        assertTrue(serializer instanceof SqlDateSerializer);
    }

    // Dummy class for testing JsonSerializable
    private static class JsonSerializableType implements JsonSerializable {
        @Override
        public void serialize(JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("dummy");
        }
        @Override
        public void serializeWithType(JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer) throws IOException {
            serialize(gen, serializers);
        }
    }

    // Dummy enum for testing
    public enum SampleEnum {
        VALUE1, VALUE2
    }

    // Dummy bean for testing type serializer
    public static class SimpleBean {
        public String getName() { return "test"; }
    }
}

