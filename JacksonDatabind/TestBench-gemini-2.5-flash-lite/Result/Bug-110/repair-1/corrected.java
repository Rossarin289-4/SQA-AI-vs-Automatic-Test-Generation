package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdConverter;
import com.fasterxml.jackson.databind.util.TypeBuilder; // Added import for TypeBuilder

public class JavaUtilCollectionsDeserializersTest {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final TypeFactory TYPE_FACTORY = TypeFactory.defaultInstance();

    // Helper to create a dummy DeserializationContext
    private DeserializationContext getDummyDeserializationContext() {
        // The original code uses a DeserializerCache and DeserializerFactory.
        // For simplicity and to avoid complex mocking, we can obtain a DeserializationContext
        // from an ObjectMapper, which should be sufficiently configured for basic tests.
        return MAPPER.getDeserializationContext();
    }

    // Helper to create dummy JavaTypes
    private JavaType createJavaType(Class<?> rawClass) {
        return TYPE_FACTORY.constructType(rawClass);
    }

    // Helper method to obtain specific JavaUtilCollectionsDeserializers instances
    // This bypasses the private access issue by calling the public findForCollection/findForMap methods.
    private JsonDeserializer<?> getCollectionDeserializer(JavaType type) throws JsonMappingException {
        return JavaUtilCollectionsDeserializers.findForCollection(getDummyDeserializationContext(), type);
    }

    private JsonDeserializer<?> getMapDeserializer(JavaType type) throws JsonMappingException {
        return JavaUtilCollectionsDeserializers.findForMap(getDummyDeserializationContext(), type);
    }

    // --- Tests for findForCollection ---

    @Test
    public void testFindForCollection_asList() throws Exception {
        // Need to get an instance of the internal class used by Arrays.asList
        // A robust way is to create one and get its class.
        Object asListInstance = Arrays.asList(1, 2);
        Class<?> asListClass = asListInstance.getClass();
        JavaType mockListType = createMockJavaType(asListClass);

        JsonDeserializer<?> deserializer = getCollectionDeserializer(mockListType);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_singletonList() throws Exception {
        Class<?> singletonListClass = Collections.singletonList("a").getClass();
        JavaType mockListType = createMockJavaType(singletonListClass);

        JsonDeserializer<?> deserializer = getCollectionDeserializer(mockListType);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_singletonSet() throws Exception {
        Class<?> singletonSetClass = Collections.singleton(1).getClass();
        JavaType mockSetType = createMockJavaType(singletonSetClass);

        JsonDeserializer<?> deserializer = getCollectionDeserializer(mockSetType);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_unmodifiableList() throws Exception {
        Class<?> unmodifiableListClass = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(1, 2))).getClass();
        JavaType mockListType = createMockJavaType(unmodifiableListClass);

        JsonDeserializer<?> deserializer = getCollectionDeserializer(mockListType);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_unmodifiableListAlias() throws Exception {
        // CLASS_UNMODIFIABLE_LIST_ALIAS is created with new LinkedList<Object>()
        Class<?> unmodifiableListAliasClass = Collections.unmodifiableList(new LinkedList<>()).getClass();
        JavaType mockListType = createMockJavaType(unmodifiableListAliasClass);

        JsonDeserializer<?> deserializer = getCollectionDeserializer(mockListType);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_unmodifiableSet() throws Exception {
        Class<?> unmodifiableSetClass = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 2))).getClass();
        JavaType mockSetType = createMockJavaType(unmodifiableSetClass);

        JsonDeserializer<?> deserializer = getCollectionDeserializer(mockSetType);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForCollection_unknownType() throws Exception {
        JavaType listType = createJavaType(ArrayList.class); // A common List implementation not handled by the special cases
        JsonDeserializer<?> deserializer = getCollectionDeserializer(listType);
        assertNull(deserializer);
    }

    // --- Tests for findForMap ---

    @Test
    public void testFindForMap_singletonMap() throws Exception {
        Class<?> singletonMapClass = Collections.singletonMap("a", "b").getClass();
        JavaType mockMapType = createMockJavaType(singletonMapClass);

        JsonDeserializer<?> deserializer = getMapDeserializer(mockMapType);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForMap_unmodifiableMap() throws Exception {
        Class<?> unmodifiableMapClass = Collections.unmodifiableMap(new HashMap<String, String>() {{ put("a", "b"); }}).getClass();
        JavaType mockMapType = createMockJavaType(unmodifiableMapClass);

        JsonDeserializer<?> deserializer = getMapDeserializer(mockMapType);
        assertNotNull(deserializer);
        assertTrue(deserializer instanceof StdDelegatingDeserializer);
    }

    @Test
    public void testFindForMap_unknownType() throws Exception {
        JavaType mapType = createJavaType(HashMap.class); // A common Map implementation
        JsonDeserializer<?> deserializer = getMapDeserializer(mapType);
        assertNull(deserializer);
    }

    // --- Tests for the inner JavaUtilCollectionsConverter ---

    // Helper to create a converter instance. The public `converter` static method is accessible.
    private JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter getConverter(int kind, JavaType concreteType, Class<?> rawSuper) {
        return JavaUtilCollectionsDeserializers.converter(kind, concreteType, rawSuper);
    }

    @Test
    public void testConverter_singletonSet_success() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_SINGLETON_SET, createJavaType(Set.class), Set.class);
        Set<String> input = Collections.singleton("test");
        Object result = converter.convert(input);
        assertNotNull(result);
        assertTrue(result instanceof Set);
        assertEquals(1, ((Set<?>) result).size());
        assertTrue(((Set<?>) result).contains("test"));
    }

    @Test
    public void testConverter_singletonSet_multipleElements() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_SINGLETON_SET, createJavaType(Set.class), Set.class);
        Set<String> input = new HashSet<>(Arrays.asList("a", "b"));
        try {
            converter.convert(input);
            fail("Expected IllegalArgumentException for singleton set with multiple elements");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 2 entries"));
        }
    }

    @Test
    public void testConverter_singletonSet_empty() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_SINGLETON_SET, createJavaType(Set.class), Set.class);
        Set<String> input = Collections.emptySet();
        try {
            converter.convert(input);
            fail("Expected IllegalArgumentException for empty singleton set");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 0 entries"));
        }
    }

    @Test
    public void testConverter_singletonList_success() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_SINGLETON_LIST, createJavaType(List.class), List.class);
        List<String> input = Collections.singletonList("test");
        Object result = converter.convert(input);
        assertNotNull(result);
        assertTrue(result instanceof List);
        assertEquals(1, ((List<?>) result).size());
        assertEquals("test", ((List<?>) result).get(0));
    }

    @Test
    public void testConverter_singletonList_multipleElements() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_SINGLETON_LIST, createJavaType(List.class), List.class);
        List<String> input = Arrays.asList("a", "b");
        try {
            converter.convert(input);
            fail("Expected IllegalArgumentException for singleton list with multiple elements");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 2 entries"));
        }
    }

    @Test
    public void testConverter_singletonList_empty() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_SINGLETON_LIST, createJavaType(List.class), List.class);
        List<String> input = Collections.emptyList();
        try {
            converter.convert(input);
            fail("Expected IllegalArgumentException for empty singleton list");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 0 entries"));
        }
    }

    @Test
    public void testConverter_singletonMap_success() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_SINGLETON_MAP, createJavaType(Map.class), Map.class);
        Map<String, String> input = Collections.singletonMap("key", "value");
        Object result = converter.convert(input);
        assertNotNull(result);
        assertTrue(result instanceof Map);
        assertEquals(1, ((Map<?, ?>) result).size());
        assertEquals("value", ((Map<?, ?>) result).get("key"));
    }

    @Test
    public void testConverter_singletonMap_multipleEntries() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_SINGLETON_MAP, createJavaType(Map.class), Map.class);
        Map<String, String> input = new HashMap<>();
        input.put("a", "b");
        input.put("c", "d");
        try {
            converter.convert(input);
            fail("Expected IllegalArgumentException for singleton map with multiple entries");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 2 entries"));
        }
    }

    @Test
    public void testConverter_singletonMap_empty() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_SINGLETON_MAP, createJavaType(Map.class), Map.class);
        Map<String, String> input = Collections.emptyMap();
        try {
            converter.convert(input);
            fail("Expected IllegalArgumentException for empty singleton map");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not deserialize Singleton container from 0 entries"));
        }
    }

    @Test
    public void testConverter_unmodifiableSet() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_UNMODIFIABLE_SET, createJavaType(Set.class), Set.class);
        Set<String> input = new HashSet<>(Arrays.asList("a", "b"));
        Object result = converter.convert(input);
        assertNotNull(result);
        assertTrue(result instanceof Set);
        // Check if it's unmodifiable
        try {
            ((Set<?>) result).add("c");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testConverter_unmodifiableList() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_UNMODIFIABLE_LIST, createJavaType(List.class), List.class);
        List<String> input = new ArrayList<>(Arrays.asList("a", "b"));
        Object result = converter.convert(input);
        assertNotNull(result);
        assertTrue(result instanceof List);
        // Check if it's unmodifiable
        try {
            ((List<?>) result).add("c");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testConverter_unmodifiableMap() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_UNMODIFIABLE_MAP, createJavaType(Map.class), Map.class);
        Map<String, String> input = new HashMap<>();
        input.put("a", "b");
        Object result = converter.convert(input);
        assertNotNull(result);
        assertTrue(result instanceof Map);
        // Check if it's unmodifiable
        try {
            ((Map<?, ?>) result).put("c", "d");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testConverter_asList() throws Exception {
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_AS_LIST, createJavaType(List.class), List.class);
        List<String> input = Arrays.asList("a", "b");
        Object result = converter.convert(input);
        assertNotNull(result);
        assertTrue(result instanceof List);
        assertEquals("a", ((List<?>) result).get(0));
        assertEquals("b", ((List<?>) result).get(1));
        // As per code, TYPE_AS_LIST returns value as-is, so it's not necessarily unmodifiable.
        // We do not assert immutability here.
    }

    @Test
    public void testConverter_convert_nullInput() {
        // Test with any converter kind, null input is handled at the start
        JavaUtilCollectionsDeserializers.JavaUtilCollectionsConverter converter = getConverter(JavaUtilCollectionsDeserializers.TYPE_AS_LIST, createJavaType(List.class), List.class);
        Object result = converter.convert(null);
        assertNull(result);
    }

    // --- Mocking helper for JavaType ---
    // This is a simplified mock for JavaType to control hasRawClass behavior.
    // It extends JavaType and overrides necessary methods.
    private JavaType createMockJavaType(Class<?> rawClass) {
        // Use TypeBuilder to create a concrete JavaType instance, which is simpler than manual mocking of abstract class.
        // This instance will have the correct rawClass.
        return TYPE_FACTORY.constructType(rawClass);
    }
}
