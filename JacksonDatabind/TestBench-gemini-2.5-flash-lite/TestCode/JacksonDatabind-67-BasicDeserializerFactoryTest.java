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
    public void testFindTypeDeserializer_BasicType() throws Exception {
        BasicDeserializerFactory factory = createFactory();
        DeserializationConfig config = getDeserializationConfig();
        JavaType baseType = getTypeFactory().constructType(String.class);
        TypeDeserializer typeDeserializer = factory.findTypeDeserializer(config, baseType);
        assertNull(typeDeserializer); // No type info needed for String
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






    



    // --- Helper classes for testing ---

    private enum MyEnum {
        VALUE1, VALUE2
    }

    private static class SimplePojo {
        public SimplePojo() {}
        public SimplePojo(String s) {}
        public static SimplePojo create(int i) { return new SimplePojo(); }
    }


    // Custom ValueInstantiator for testing

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



