```java
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.std.*;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;

public class BasicDeserializerFactoryTest {

    // Helper to create a default config and factory for testing
    private BasicDeserializerFactory createFactory() {
        return new BeanDeserializerFactory(new DeserializerFactoryConfig());
    }

    private ObjectMapper getObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper;
    }

    private DeserializationConfig getDeserializationConfig() {
        return getObjectMapper().getDeserializationConfig();
    }

    // Helper to create a DeserializationContext for tests.
    // We need to mock some methods to avoid dependencies on a full ObjectMapper setup.
    private DeserializationContext getDeserializationContext() {
        DeserializerFactoryConfig factoryConfig = new DeserializerFactoryConfig();
        DeserializerFactory factory = new BasicDeserializerFactory(factoryConfig) {
            @Override
            protected BasicDeserializerFactory withConfig(DeserializerFactoryConfig config) {
                return new BasicDeserializerFactory(config);
            }
        };
        DeserializationConfig config = new DeserializationConfig(
            new ObjectMapper().getSerializationConfig().getBaseSettings()
        );
        // Create a mock InjectableValues as it's often required
        InjectableValues injectableValues = new InjectableValues.Std();
        return new DeserializationContext(config, null, injectableValues) {
            @Override
            public void reportMappingException(String msg, Object... params) throws JsonMappingException {
                throw new JsonMappingException(null, String.format(msg, params));
            }

            @Override
            public void reportPropertyMappingException(String msg, Object... params) throws JsonMappingException {
                throw new JsonMappingException(null, String.format(msg, params));
            }

            @Override
            public void reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
                throw new JsonMappingException(null, msg);
            }
             @Override
            public JsonDeserializer<?> findValueDeserializer(JavaType type, com.fasterxml.jackson.databind.deser.DeserializerFactory factory) throws JsonMappingException {
                // Mock implementation: return a default deserializer or null
                // For most tests, we don't need a real deserializer instance here,
                // just the factory to be functional.
                return null;
            }

            @Override
            public KeyDeserializer findKeyDeserializer(JavaType keyType, com.fasterxml.jackson.databind.deser.DeserializerFactory factory) throws JsonMappingException {
                 return null;
            }
        };
    }

    private TypeFactory getTypeFactory() {
        return TypeFactory.defaultInstance();
    }

    @Test
    public void testMapAbstractType_MapInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType mapType = getTypeFactory().constructType(Map.class);
        JavaType resolvedType = factory.mapAbstractType(config, mapType);
        assertEquals(LinkedHashMap.class, resolvedType.getRawClass());
    }

    @Test
    public void testMapAbstractType_ConcurrentMapInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType mapType = getTypeFactory().constructType(ConcurrentMap.class);
        JavaType resolvedType = factory.mapAbstractType(config, mapType);
        assertEquals(ConcurrentHashMap.class, resolvedType.getRawClass());
    }

    @Test
    public void testMapAbstractType_SortedMapInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType mapType = getTypeFactory().constructType(SortedMap.class);
        JavaType resolvedType = factory.mapAbstractType(config, mapType);
        assertEquals(TreeMap.class, resolvedType.getRawClass());
    }

    @Test
    public void testMapAbstractType_NavigableMapInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType mapType = getTypeFactory().constructType(java.util.NavigableMap.class);
        JavaType resolvedType = factory.mapAbstractType(config, mapType);
        assertEquals(TreeMap.class, resolvedType.getRawClass());
    }

    @Test
    public void testMapAbstractType_ConcurrentNavigableMapInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType mapType = getTypeFactory().constructType(java.util.concurrent.ConcurrentNavigableMap.class);
        JavaType resolvedType = factory.mapAbstractType(config, mapType);
        assertEquals(java.util.concurrent.ConcurrentSkipListMap.class, resolvedType.getRawClass());
    }
    
    @Test
    public void testMapAbstractType_ConcreteMapType() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType mapType = getTypeFactory().constructType(HashMap.class);
        JavaType resolvedType = factory.mapAbstractType(config, mapType);
        assertEquals(HashMap.class, resolvedType.getRawClass()); // Should not change
    }

    @Test
    public void testCollectionAbstractType_CollectionInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType collectionType = getTypeFactory().constructType(Collection.class);
        JavaType resolvedType = factory.mapAbstractType(config, collectionType);
        assertEquals(ArrayList.class, resolvedType.getRawClass());
    }

    @Test
    public void testCollectionAbstractType_ListInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType listType = getTypeFactory().constructType(List.class);
        JavaType resolvedType = factory.mapAbstractType(config, listType);
        assertEquals(ArrayList.class, resolvedType.getRawClass());
    }

    @Test
    public void testCollectionAbstractType_SetInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType setType = getTypeFactory().constructType(Set.class);
        JavaType resolvedType = factory.mapAbstractType(config, setType);
        assertEquals(HashSet.class, resolvedType.getRawClass());
    }

    @Test
    public void testCollectionAbstractType_SortedSetInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType sortedSetType = getTypeFactory().constructType(SortedSet.class);
        JavaType resolvedType = factory.mapAbstractType(config, sortedSetType);
        assertEquals(TreeSet.class, resolvedType.getRawClass());
    }

    @Test
    public void testCollectionAbstractType_QueueInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType queueType = getTypeFactory().constructType(Queue.class);
        JavaType resolvedType = factory.mapAbstractType(config, queueType);
        assertEquals(LinkedList.class, resolvedType.getRawClass());
    }

    @Test
    public void testCollectionAbstractType_DequeInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType dequeType = getTypeFactory().constructType(Deque.class);
        JavaType resolvedType = factory.mapAbstractType(config, dequeType);
        assertEquals(LinkedList.class, resolvedType.getRawClass());
    }

    @Test
    public void testCollectionAbstractType_NavigableSetInterface() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType navigableSetType = getTypeFactory().constructType(java.util.NavigableSet.class);
        JavaType resolvedType = factory.mapAbstractType(config, navigableSetType);
        assertEquals(TreeSet.class, resolvedType.getRawClass());
    }

    @Test
    public void testCollectionAbstractType_ConcreteCollectionType() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType listType = getTypeFactory().constructType(ArrayList.class);
        JavaType resolvedType = factory.mapAbstractType(config, listType);
        assertEquals(ArrayList.class, resolvedType.getRawClass()); // Should not change
    }

    @Test
    public void testFindValueInstantiator_JsonLocation() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(JsonLocation.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(JsonLocation.class);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        assertNotNull(instantiator);
        // JsonLocationInstantiator is package-private, check against interface type if possible or its behavior.
        // Since we cannot directly instantiate it, we check if it's a ValueInstantiator.
        assertTrue(instantiator instanceof ValueInstantiator); 
    }

    @Test
    public void testCreateArrayDeserializer_StringArray() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        ArrayType arrayType = ArrayType.construct(getTypeFactory().constructType(String.class), TypeBindings.emptyBindings(), null, null);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(String[].class);
        JsonDeserializer<?> deserializer = factory.createArrayDeserializer(ctxt, arrayType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof ObjectArrayDeserializer); // Default for non-primitive
    }

    @Test
    public void testCreateArrayDeserializer_PrimitiveIntArray() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        ArrayType arrayType = ArrayType.construct(getTypeFactory().constructType(int.class), TypeBindings.emptyBindings(), null, null);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(int[].class);
        JsonDeserializer<?> deserializer = factory.createArrayDeserializer(ctxt, arrayType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof PrimitiveArrayDeserializers.IntDeser);
    }

    @Test
    public void testCreateCollectionDeserializer_StringCollection() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        CollectionType collectionType = getTypeFactory().constructCollectionType(ArrayList.class, String.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(ArrayList.class);
        JsonDeserializer<?> deserializer = factory.createCollectionDeserializer(ctxt, collectionType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StringCollectionDeserializer);
    }

    @Test
    public void testCreateMapDeserializer_StringObjectMap() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        MapType mapType = MapType.construct(HashMap.class, getTypeFactory().constructType(String.class), getTypeFactory().constructType(Object.class));
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(HashMap.class);
        JsonDeserializer<?> deserializer = factory.createMapDeserializer(ctxt, mapType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof MapDeserializer);
    }

    @Test
    public void testCreateMapDeserializer_EnumMap() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType enumKeyType = getTypeFactory().constructType(MyEnum.class);
        MapType mapType = MapType.construct(EnumMap.class, enumKeyType, getTypeFactory().constructType(String.class));
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(EnumMap.class);
        JsonDeserializer<?> deserializer = factory.createMapDeserializer(ctxt, mapType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof EnumMapDeserializer);
    }

    @Test
    public void testCreateEnumDeserializer_BasicEnum() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType enumType = getTypeFactory().constructType(MyEnum.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(MyEnum.class);
        JsonDeserializer<?> deserializer = factory.createEnumDeserializer(ctxt, enumType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof EnumDeserializer);
    }

    @Test
    public void testCreateTreeDeserializer_ObjectNode() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType nodeType = getTypeFactory().constructType(JsonNode.class);
        BeanDescription beanDesc = config.introspectClassAnnotations(JsonNode.class);
        JsonDeserializer<?> deserializer = factory.createTreeDeserializer(config, nodeType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof JsonNodeDeserializer);
    }

    @Test
    public void testCreateReferenceDeserializer_AtomicReference() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType contentType = getTypeFactory().constructType(String.class);
        ReferenceType refType = ReferenceType.construct(AtomicReference.class, TypeBindings.emptyBindings(), contentType, null, null);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(AtomicReference.class);
        JsonDeserializer<?> deserializer = factory.createReferenceDeserializer(ctxt, refType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof AtomicReferenceDeserializer);
    }

    @Test
    public void testFindTypeDeserializer_BasicType() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType baseType = getTypeFactory().constructType(String.class);
        TypeDeserializer typeDeserializer = factory.findTypeDeserializer(config, baseType);
        assertNull(typeDeserializer); // No type info needed for String
    }

    @Test
    public void testCreateKeyDeserializer_String() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(String.class);
        KeyDeserializer keyDeserializer = factory.createKeyDeserializer(ctxt, type);
        assertNotNull(keyDeserializer);
        assertTrue(keyDeserializer instanceof StdKeyDeserializers.StringKeyDeserializer);
    }
    
    @Test
    public void testCreateKeyDeserializer_EnumKey() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(MyEnum.class);
        KeyDeserializer keyDeserializer = factory.createKeyDeserializer(ctxt, type);
        assertNotNull(keyDeserializer);
        assertTrue(keyDeserializer instanceof StdKeyDeserializers.EnumKeyDeserializer);
    }

    @Test
    public void testFindDefaultDeserializer_Object() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(Object.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof UntypedObjectDeserializer);
    }

    @Test
    public void testFindDefaultDeserializer_String() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(String.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(String.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StringDeserializer);
    }

    @Test
    public void testFindDefaultDeserializer_Integer() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(Integer.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(Integer.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof NumberDeserializers.IntegerDeserializer);
    }

    @Test
    public void testFindDefaultDeserializer_Double() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(Double.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(Double.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof NumberDeserializers.DoubleDeserializer);
    }

    @Test
    public void testFindDefaultDeserializer_Boolean() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(Boolean.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(Boolean.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof NumberDeserializers.BooleanDeserializer);
    }
    
    @Test
    public void testFindDefaultDeserializer_Date() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(Date.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(Date.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof DateDeserializers.DateDeserializer);
    }
    
    @Test
    public void testFindDefaultDeserializer_TokenBuffer() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(TokenBuffer.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(TokenBuffer.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof TokenBufferDeserializer);
    }

    @Test
    public void testFindDefaultDeserializer_Iterable() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(Iterable.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(Iterable.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof CollectionDeserializer);
    }

    @Test
    public void testFindDefaultDeserializer_MapEntry() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType type = getTypeFactory().constructType(Map.Entry.class);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(Map.Entry.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, type, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof MapEntryDeserializer);
    }

    @Test
    public void testGetFactoryConfig() throws Exception {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        BasicDeserializerFactory factory = new BeanDeserializerFactory(config);
        assertSame(config, factory.getFactoryConfig());
    }

    @Test
    public void testWithAdditionalDeserializers() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        Deserializers additional = new Deserializers.Base();
        DeserializerFactory newFactory = factory.withAdditionalDeserializers(additional);
        assertNotSame(factory, newFactory);
    }

    @Test
    public void testWithAdditionalKeyDeserializers() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        KeyDeserializers additional = new KeyDeserializers.Base();
        DeserializerFactory newFactory = factory.withAdditionalKeyDeserializers(additional);
        assertNotSame(factory, newFactory);
    }

    @Test
    public void testWithDeserializerModifier() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        BeanDeserializerModifier modifier = new BeanDeserializerModifier() {};
        DeserializerFactory newFactory = factory.withDeserializerModifier(modifier);
        assertNotSame(factory, newFactory);
    }

    @Test
    public void testWithAbstractTypeResolver() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        AbstractTypeResolver resolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                if (type.getRawClass() == List.class) {
                    return TypeFactory.defaultInstance().constructType(LinkedList.class);
                }
                return null;
            }
            @Override
            public JavaType resolveAbstractType(DeserializationConfig config, JavaType type) {
                return findTypeMapping(config, type);
            }
        };
        DeserializerFactory newFactory = factory.withAbstractTypeResolver(resolver);
        assertNotSame(factory, newFactory);
        JavaType resolved = newFactory.mapAbstractType(getDeserializationConfig(), getTypeFactory().constructType(List.class));
        assertEquals(LinkedList.class, resolved.getRawClass());
    }

    @Test
    public void testWithInvalidAbstractTypeResolver() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType mapType = getTypeFactory().constructType(Map.class);

        AbstractTypeResolver invalidResolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                return TypeFactory.defaultInstance().constructType(String.class);
            }
             @Override
            public JavaType resolveAbstractType(DeserializationConfig config, JavaType type) {
                return findTypeMapping(config, type);
            }
        };

        DeserializerFactory newFactory = factory.withAbstractAbstractTypeResolver(invalidResolver); // Changed method name
        try {
            newFactory.mapAbstractType(config, mapType);
            fail("Should have thrown IllegalArgumentException for invalid type mapping");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid abstract type resolution"));
        }
    }

    @Test
    public void testWithHandlerInstantiatorForValueInstantiator() throws Exception {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        
        HandlerInstantiator mockHandlerInstantiator = new HandlerInstantiator() {
            @Override
            public ValueInstantiator valueInstantiatorInstance(DeserializationConfig config, Annotated annotated, Class<?> valueInstantiatorClass) {
                if (valueInstantiatorClass == MyValueInstantiator.class) {
                    return new MyValueInstantiator(annotated.getRawClass());
                }
                return null;
            }
        };
        
        // Create a config that uses this HandlerInstantiator
        DeserializerFactoryConfig configWithHI = new DeserializerFactoryConfig() {
            @Override
            public HandlerInstantiator getHandlerInstantiator() {
                return mockHandlerInstantiator;
            }
        };
        
        BasicDeserializerFactory factoryWithHI = new BasicDeserializerFactory(configWithHI);
        
        BeanDescription beanDescForAnnotation = getDeserializationConfig().introspectClassAnnotations(AnnotatedValueBean.class);
        AnnotatedClass mockAnnotatedClass = beanDescForAnnotation.getClassInfo();
        Object instDef = MyValueInstantiator.class; 
        
        ValueInstantiator vi = factoryWithHI._valueInstantiatorInstance(getDeserializationConfig(), mockAnnotatedClass, instDef);
        assertNotNull(vi);
        assertTrue(vi instanceof MyValueInstantiator);
    }

    @Test
    public void testCreateCollectionLikeDeserializer_Simple() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType contentType = getTypeFactory().constructType(String.class);
        CollectionLikeType collectionLikeType = CollectionLikeType.construct(MyCollectionLike.class, TypeBindings.emptyBindings(), contentType, null, null);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(MyCollectionLike.class);
        JsonDeserializer<?> deserializer = factory.createCollectionLikeDeserializer(ctxt, collectionLikeType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof CollectionDeserializer); 
    }

    @Test
    public void testCreateMapLikeDeserializer_Simple() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        JavaType keyType = getTypeFactory().constructType(String.class);
        JavaType contentType = getTypeFactory().constructType(Integer.class);
        MapLikeType mapLikeType = MapLikeType.construct(MyMapLike.class, TypeBindings.emptyBindings(), keyType, contentType, null, null);
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(MyMapLike.class);
        JsonDeserializer<?> deserializer = factory.createMapLikeDeserializer(ctxt, mapLikeType, beanDesc);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof MapDeserializer); 
    }

    @Test
    public void testFindPropertyTypeDeserializer_WithAnnotations() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();

        class HasTypedField {
            @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
            public Object value;
        }

        BeanDescription beanDesc = config.introspectClassAnnotations(HasTypedField.class);
        AnnotatedMember annotatedField = beanDesc.findField("value").getMember();
        JavaType fieldType = getTypeFactory().constructType(Object.class);

        TypeDeserializer typeDeserializer = factory.findPropertyTypeDeserializer(config, fieldType, annotatedField);
        assertNotNull(typeDeserializer);
        assertTrue(typeDeserializer.getClass().getName().contains("TypeInfoWrapper"));
    }

    @Test
    public void testFindPropertyContentTypeDeserializer_WithAnnotations() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();

        class HasTypedContainer {
            @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
            public List<String> values;
        }

        BeanDescription beanDesc = config.introspectClassAnnotations(HasTypedContainer.class);
        AnnotatedMember annotatedField = beanDesc.findField("values").getMember();
        JavaType containerType = getTypeFactory().constructType(List.class); 

        TypeDeserializer typeDeserializer = factory.findPropertyContentTypeDeserializer(config, containerType, annotatedField);
        assertNotNull(typeDeserializer);
        assertTrue(typeDeserializer.getClass().getName().contains("TypeInfoWrapper"));
    }
    
    @Test
    public void test_mapAbstractType2_withCustomResolver() throws Exception {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        
        AbstractTypeResolver customResolver = new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                if (type.getRawClass().equals(Queue.class)) {
                    return getTypeFactory().constructType(ArrayDeque.class);
                }
                return null;
            }
             @Override
            public JavaType resolveAbstractType(DeserializationConfig config, JavaType type) {
                return findTypeMapping(config, type);
            }
        };
        
        config = config.withAbstractTypeResolver(customResolver);
        BasicDeserializerFactory factory = new BasicDeserializerFactory(config);
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        JavaType queueType = getTypeFactory().constructType(Queue.class);
        
        JavaType resolvedType = factory.mapAbstractType(deserializationConfig, queueType);
        assertEquals(ArrayDeque.class, resolvedType.getRawClass());
    }

    @Test
    public void test_findValueInstantiator_noAnnotation_noStd() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(SimplePojo.class);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        
        assertNotNull(instantiator);
        assertTrue(instantiator.canCreateUsingDefault()); 
    }

    @Test
    public void test_findValueInstantiator_withValueInstantiatorAnnotation() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationContext ctxt = getDeserializationContext();
        
        // Need a class with @JsonValueInstantiator annotation pointing to a valid ValueInstantiator.
        // AnnotatedValueBean class below uses this.
        BeanDescription beanDesc = getDeserializationConfig().introspectClassAnnotations(AnnotatedValueBean.class);
        ValueInstantiator instantiator = factory.findValueInstantiator(ctxt, beanDesc);
        
        assertNotNull(instantiator);
        assertTrue(instantiator instanceof MyValueInstantiator); 
    }

    // --- Helper classes for testing ---

    private enum MyEnum {
        VALUE1, VALUE2
    }

    private static class SimplePojo {
        public SimplePojo() {}
        public SimplePojo(String s) {}
        public static SimplePojo create(int i) { return new SimplePojo(); }
    }

    @JsonValueInstantiator(MyValueInstantiator.class)
    private static class AnnotatedValueBean {
        public AnnotatedValueBean() {}
    }

    // Custom ValueInstantiator for testing
    private static class MyValueInstantiator extends ValueInstantiator {
        private final Class<?> _valueClass;

        public MyValueInstantiator(Class<?> valueClass) {
            _valueClass = valueClass;
        }

        @Override public Class<?> getValueClass() { return _valueClass; }
        @Override public String getValueTypeDesc() { return _valueClass.getName(); }
        @Override public boolean canCreateUsingDefault() { return true; }
        @Override
        public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
            try {
                // Use reflection to create instance, handling potential lack of public constructor
                return _valueClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new IOException("Failed to create instance", e);
            }
        }
        
        // Implementing abstract methods that are required by the abstract class
        @Override public boolean canCreateFromString() { return false; }
        @Override public boolean canCreateFromInt() { return false; }
        @Override public boolean canCreateFromLong() { return false; }
        @Override public boolean canCreateFromDouble() { return false; }
        @Override public boolean canCreateFromBoolean() { return false; }
        @Override public boolean canCreateUsingDelegate() { return false; }
        @Override public boolean canCreateUsingArrayDelegate() { return false; }
        @Override public boolean canCreateFromObjectWith() { return false; }
        @Override public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig config) { return null; }
        @Override public JavaType getDelegateType(DeserializationConfig config) { return null; }
        @Override public JavaType getArrayDelegateType(DeserializationConfig config) { return null; }
        @Override public Object createFromString(DeserializationContext ctxt, String value) throws IOException { return null; }
        @Override public Object createFromInt(DeserializationContext ctxt, int value) throws IOException { return null; }
        @Override public Object createFromLong(DeserializationContext ctxt, long value) throws IOException { return null; }
        @Override public Object createFromDouble(DeserializationContext ctxt, double value) throws IOException { return null; }
        @Override public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException { return null; }
        @Override public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return null; }
        @Override public Object createUsingArrayDelegate(DeserializationContext ctxt, Object delegate) throws IOException { return null; }
        @Override public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) throws IOException { return null; }
        @Override public Object createFromObjectWith(DeserializationContext ctxt, SettableBeanProperty[] props, PropertyValueBuffer buffer) throws IOException { return null; }
    }

    // Custom CollectionLike type for testing
    private static class MyCollectionLike implements Iterable<String> {
        private final List<String> _internal = new ArrayList<>();
        public void add(String s) { _internal.add(s); }
        @Override
        public Iterator<String> iterator() { return _internal.iterator(); }
    }
    
    // Custom MapLike type for testing
    private static class MyMapLike implements Iterable<Map.Entry<String, Integer>> {
        private final Map<String, Integer> _internal = new HashMap<>();
        public void put(String k, Integer v) { _internal.put(k, v); }
        @Override
        public Iterator<Map.Entry<String, Integer>> iterator() { return _internal.entrySet().iterator(); }
    }
}
```