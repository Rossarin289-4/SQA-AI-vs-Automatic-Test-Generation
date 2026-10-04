package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional; // Added import
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.*;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;

public class BasicDeserializerFactoryTest {

    // Helper to create a minimal DeserializerFactoryConfig
    private DeserializerFactoryConfig createConfig() {
        return new DeserializerFactoryConfig();
    }

    // Helper to create a BasicDeserializerFactory instance (using concrete subclass)
    private BasicDeserializerFactory createFactory() {
        // BeanDeserializerFactory is a concrete subclass of BasicDeserializerFactory
        return BeanDeserializerFactory.instance;
    }

    // Helper to create a DeserializationContext
    private DeserializationContext createDeserializationContext(ObjectMapper mapper) {
        return mapper.getDeserializationContext();
    }

    // Helper to create a DeserializationConfig
    private DeserializationConfig createDeserializationConfig() {
        return new ObjectMapper().getDeserializationConfig();
    }

    // Helper to create a BeanDescription

    @Test
    public void testMapAbstractTypeWithMapFallback() throws Exception {
        DeserializerFactoryConfig config = createConfig();
        // BeanDeserializerFactory is concrete and has a public constructor
        BasicDeserializerFactory factory = new BeanDeserializerFactory(config);
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig deserializationConfig = mapper.getDeserializationConfig();
        JavaType mapType = TypeFactory.defaultInstance().constructType(Map.class);
        JavaType expectedType = TypeFactory.defaultInstance().constructType(LinkedHashMap.class);
        JavaType resolvedType = factory.mapAbstractType(deserializationConfig, mapType);
        assertEquals(expectedType, resolvedType);
    }

    @Test
    public void testMapAbstractTypeWithCollectionFallback() throws Exception {
        DeserializerFactoryConfig config = createConfig();
        BasicDeserializerFactory factory = new BeanDeserializerFactory(config);
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig deserializationConfig = mapper.getDeserializationConfig();
        JavaType listType = TypeFactory.defaultInstance().constructType(List.class);
        JavaType expectedType = TypeFactory.defaultInstance().constructType(ArrayList.class);
        JavaType resolvedType = factory.mapAbstractType(deserializationConfig, listType);
        assertEquals(expectedType, resolvedType);
    }

    @Test
    public void testMapAbstractTypeNoFallback() throws Exception {
        DeserializerFactoryConfig config = createConfig();
        BasicDeserializerFactory factory = new BeanDeserializerFactory(config);
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig deserializationConfig = mapper.getDeserializationConfig();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType resolvedType = factory.mapAbstractType(deserializationConfig, stringType);
        assertEquals(stringType, resolvedType); // Should return the same type if no fallback
    }

    @Test
    public void testFindValueInstantiatorForJsonLocation() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(JsonLocation.class);
        BeanDescription beanDesc = config.introspect(type);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(instantiator);
        assertTrue(instantiator instanceof JsonLocationInstantiator);
    }




    // Test case for default constructor
    public static class MyClassDefaultCtor {
        public MyClassDefaultCtor() {}
    }

    @Test
    public void testFindValueInstantiatorForDefaultConstructor() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(MyClassDefaultCtor.class);
        BeanDescription beanDesc = config.introspect(type);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(instantiator);
        assertTrue(instantiator.canCreateUsingDefault());
        Object instance = instantiator.createUsingDefault(ctxt);
        assertNotNull(instance);
        assertTrue(instance instanceof MyClassDefaultCtor);
    }

    // Test case for a class with a single String creator
    public static class MyClassStringCtor {
        private final String value;
        @JsonCreator
        public MyClassStringCtor(String value) { this.value = value; }
        public String getValue() { return value; }
    }

    @Test
    public void testFindValueInstantiatorForStringCreator() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(MyClassStringCtor.class);
        BeanDescription beanDesc = config.introspect(type);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(instantiator);
        assertTrue(instantiator.canCreateFromString());
        Object instance = instantiator.createFromString(ctxt, "test");
        assertNotNull(instance);
        assertTrue(instance instanceof MyClassStringCtor);
        assertEquals("test", ((MyClassStringCtor) instance).getValue());
    }

    // Test case for a class with a single int creator
    public static class MyClassIntCtor {
        private final int value;
        @JsonCreator
        public MyClassIntCtor(int value) { this.value = value; }
        public int getValue() { return value; }
    }

    @Test
    public void testFindValueInstantiatorForIntCreator() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(MyClassIntCtor.class);
        BeanDescription beanDesc = config.introspect(type);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(instantiator);
        assertTrue(instantiator.canCreateFromInt());
        Object instance = instantiator.createFromInt(ctxt, 123);
        assertNotNull(instance);
        assertTrue(instance instanceof MyClassIntCtor);
        assertEquals(123, ((MyClassIntCtor) instance).getValue());
    }

    // Test case for a class with a single long creator
    public static class MyClassLongCtor {
        private final long value;
        @JsonCreator
        public MyClassLongCtor(long value) { this.value = value; }
        public long getValue() { return value; }
    }

    @Test
    public void testFindValueInstantiatorForLongCreator() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(MyClassLongCtor.class);
        BeanDescription beanDesc = config.introspect(type);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(instantiator);
        assertTrue(instantiator.canCreateFromLong());
        Object instance = instantiator.createFromLong(ctxt, 1234567890123L);
        assertNotNull(instance);
        assertTrue(instance instanceof MyClassLongCtor);
        assertEquals(1234567890123L, ((MyClassLongCtor) instance).getValue());
    }

    // Test case for a class with a single double creator
    public static class MyClassDoubleCtor {
        private final double value;
        @JsonCreator
        public MyClassDoubleCtor(double value) { this.value = value; }
        public double getValue() { return value; }
    }

    @Test
    public void testFindValueInstantiatorForDoubleCreator() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(MyClassDoubleCtor.class);
        BeanDescription beanDesc = config.introspect(type);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(instantiator);
        assertTrue(instantiator.canCreateFromDouble());
        Object instance = instantiator.createFromDouble(ctxt, 123.456);
        assertNotNull(instance);
        assertTrue(instance instanceof MyClassDoubleCtor);
        assertEquals(123.456, ((MyClassDoubleCtor) instance).getValue(), 1e-9);
    }

    // Test case for a class with a single boolean creator
    public static class MyClassBooleanCtor {
        private final boolean value;
        @JsonCreator
        public MyClassBooleanCtor(boolean value) { this.value = value; }
        public boolean getValue() { return value; }
    }

    @Test
    public void testFindValueInstantiatorForBooleanCreator() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(MyClassBooleanCtor.class);
        BeanDescription beanDesc = config.introspect(type);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(instantiator);
        assertTrue(instantiator.canCreateFromBoolean());
        Object instance = instantiator.createFromBoolean(ctxt, true);
        assertNotNull(instance);
        assertTrue(instance instanceof MyClassBooleanCtor);
        assertTrue(((MyClassBooleanCtor) instance).getValue());
    }

    // Test case for a class with property-based creator
    public static class MyClassPropertyCtor {
        private final String name;
        private final int age;
        @JsonCreator
        public MyClassPropertyCtor(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() { return name; }
        public int getAge() { return age; }
    }


    // Test case for a class with a delegating creator
    public static class MyClassDelegateCtor {
        private final String value;
        @JsonCreator
        public MyClassDelegateCtor(String value) {
            this.value = value;
        }
        public String getValue() { return value; }
    }

    @Test
    public void testFindValueInstantiatorForDelegatingCreator() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(MyClassDelegateCtor.class);
        BeanDescription beanDesc = config.introspect(type);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(instantiator);
        assertTrue(instantiator.canCreateFromString());
        Object instance = instantiator.createFromString(ctxt, "delegatedValue");
        assertNotNull(instance);
        assertTrue(instance instanceof MyClassDelegateCtor);
        assertEquals("delegatedValue", ((MyClassDelegateCtor) instance).getValue());
    }

    @Test
    public void testCreateArrayDeserializerForStringArray() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(String[].class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.createArrayDeserializer(ctxt, (ArrayType) type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StringArrayDeserializer);
    }


    @Test
    public void testCreateCollectionDeserializerForArrayList() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(ArrayList.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.createCollectionDeserializer(ctxt, (CollectionType) type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof CollectionDeserializer);
    }

    @Test
    public void testCreateCollectionDeserializerForEnumSet() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(EnumSet.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.createCollectionDeserializer(ctxt, (CollectionType) type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof EnumSetDeserializer);
    }

    @Test
    public void testCreateMapDeserializerForHashMap() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(HashMap.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.createMapDeserializer(ctxt, (MapType) type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof MapDeserializer);
    }

    @Test
    public void testCreateMapDeserializerForEnumMap() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(EnumMap.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.createMapDeserializer(ctxt, (MapType) type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof EnumMapDeserializer);
    }

    @Test
    public void testCreateEnumDeserializer() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(MyEnum.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.createEnumDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof EnumDeserializer);
    }

    private enum MyEnum { VALUE1, VALUE2 }

    @Test
    public void testCreateTreeDeserializerForObjectNode() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = TypeFactory.defaultInstance().constructType(JsonNode.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.createTreeDeserializer(config, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof JsonNodeDeserializer);
    }

    @Test
    public void testCreateReferenceDeserializerForAtomicReference() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(AtomicReference.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.createReferenceDeserializer(ctxt, (ReferenceType) type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof AtomicReferenceDeserializer);
    }

    @Test
    public void testFindTypeDeserializerForSimpleType() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        TypeDeserializer typeDeserializer = factory.findTypeDeserializer(config, type);
        assertNull(typeDeserializer); // No type info needed for simple String
    }



    @Test
    public void testFindDefaultDeserializerForObject() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof UntypedObjectDeserializer);
    }

    @Test
    public void testFindDefaultDeserializerForString() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StringDeserializer);
    }

    @Test
    public void testFindDefaultDeserializerForIterable() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(Iterable.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof CollectionDeserializer); // Should be mapped to Collection
    }

    @Test
    public void testFindDefaultDeserializerForMapEntry() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(Map.Entry.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof MapEntryDeserializer);
    }

    @Test
    public void testFindDefaultDeserializerForInteger() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof NumberDeserializers.IntegerDeserializer);
    }

    @Test
    public void testFindDefaultDeserializerForBoolean() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(Boolean.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof NumberDeserializers.BooleanDeserializer);
    }

    @Test
    public void testFindDefaultDeserializerForDate() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(Date.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof DateDeserializers.DateDeserializer);
    }

    @Test
    public void testFindDefaultDeserializerForTokenBuffer() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(TokenBuffer.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof TokenBufferDeserializer);
    }


    @Test
    public void testFindDefaultDeserializerForCharSequence() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(CharSequence.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StringDeserializer); // CharSequence maps to StringDeserializer
    }

    @Test
    public void testFindDefaultDeserializerForPrimitiveInt() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(int.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof NumberDeserializers.IntegerDeserializer); // Primitive int maps to IntegerDeserializer
    }
    
    @Test
    public void testGetFactoryConfig() throws Exception {
        DeserializerFactoryConfig config = createConfig();
        BasicDeserializerFactory factory = new BeanDeserializerFactory(config);
        DeserializerFactoryConfig returnedConfig = factory.getFactoryConfig();
        assertNotNull(returnedConfig);
        assertEquals(config, returnedConfig); // Direct comparison should work for the same instance
    }

    // Test `withAdditionalDeserializers`

    // Test `withAdditionalKeyDeserializers`

    // Test `withDeserializerModifier`

    // Test `withAbstractTypeResolver`

    // Test `withValueInstantiators`

    // Test `_valueInstantiatorInstance` with null definition

    // Test `_valueInstantiatorInstance` with Class definition
    
    // Test `createCollectionLikeDeserializer`
    @Test
    public void testCreateCollectionLikeDeserializer() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(List.class); // CollectionLikeType
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.createCollectionLikeDeserializer(ctxt, (CollectionLikeType) type, beanDesc);
        assertNotNull(deserializer);
        // Should default to CollectionDeserializer if no specific handler found
        assertTrue(deserializer instanceof CollectionDeserializer);
    }

    // Test `createMapLikeDeserializer`
    @Test
    public void testCreateMapLikeDeserializer() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        DeserializationContext ctxt = createDeserializationContext(mapper);
        JavaType type = TypeFactory.defaultInstance().constructType(Map.class); // MapLikeType
        BeanDescription beanDesc = config.introspect(type);
        JsonDeserializer<?> deserializer = factory.createMapLikeDeserializer(ctxt, (MapLikeType) type, beanDesc);
        assertNotNull(deserializer);
        // Should default to MapDeserializer if no specific handler found
        assertTrue(deserializer instanceof MapDeserializer);
    }

    // Test `findPropertyTypeDeserializer` with null annotated member
    @Test
    public void testFindPropertyTypeDeserializerWithNullMember() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        TypeDeserializer typeDeserializer = factory.findPropertyTypeDeserializer(config, type, null);
        assertNull(typeDeserializer); // Expect null when member is null and no default type resolver
    }

    // Test `findPropertyContentTypeDeserializer` with null annotated member
    @Test
    public void testFindPropertyContentTypeDeserializerWithNullMember() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType containerType = TypeFactory.defaultInstance().constructType(List.class);
        TypeDeserializer typeDeserializer = factory.findPropertyContentTypeDeserializer(config, containerType, null);
        assertNull(typeDeserializer); // Expect null when member is null and no default type resolver
    }

    // Test `_valueInstantiatorInstance` with Class definition and HandlerInstantiator


}


