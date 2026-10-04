```java
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.LRUMap;

public class TypeFactoryTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDefaultInstance() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertNotNull(factory);
        // Check if it's a singleton
        assertSame(factory, TypeFactory.defaultInstance());
    }

    @Test
    public void testClearCache() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Populate cache slightly by creating a known type
        factory.constructType(String.class);
        // Check if cache is non-empty (implementation detail, but gives some confidence)
        // LRUMap size is not public, so we can't directly assert its state.
        // We assume clearCache works if the factory can still create types afterwards.
        factory.clearCache();
        JavaType type = factory.constructType(Integer.class);
        assertNotNull(type);
        assertEquals(Integer.class, type.getRawClass());
    }

    @Test
    public void testUnknownType() throws Exception {
        JavaType unknown = TypeFactory.unknownType();
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
        assertTrue(unknown.isJavaLangObject());
    }

    @Test
    public void testRawClassFromClass() throws Exception {
        Class<?> raw = TypeFactory.rawClass(String.class);
        assertEquals(String.class, raw);
    }

    @Test
    public void testConstructSpecializedTypeSameClass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructType(Map.class);
        JavaType specialized = factory.constructSpecializedType(base, HashMap.class);
        assertNotNull(specialized);
        assertEquals(HashMap.class, specialized.getRawClass());
        // Should retain generic info if base had it
        assertSame(base, specialized);
    }

    @Test
    public void testConstructSpecializedTypeSubclass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructType(List.class);
        JavaType specialized = factory.constructSpecializedType(base, ArrayList.class);
        assertNotNull(specialized);
        assertEquals(ArrayList.class, specialized.getRawClass());
        assertNotSame(base, specialized);
    }
    
    @Test
    public void testConstructSpecializedTypeInvalidSubclass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructType(List.class);
        try {
            factory.constructSpecializedType(base, HashMap.class);
            fail("Should throw IllegalArgumentException for incompatible subclass");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testConstructFromCanonicalSimple() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory.constructFromCanonical("java.lang.String");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructFromCanonicalParameterized() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory.constructFromCanonical("java.util.List<java.lang.Integer>");
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertTrue(type.containedTypeCount() == 1);
        assertEquals(Integer.class, type.containedType(0).getRawClass());
    }
    
    @Test
    public void testFindTypeParametersForSimpleClass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType listInt = factory.constructType(new TypeReference<List<Integer>>() {}.getType());
        JavaType[] params = factory.findTypeParameters(listInt, List.class);
        assertNotNull(params);
        assertEquals(1, params.length);
        assertEquals(Integer.class, params[0].getRawClass());
    }

    @Test
    public void testFindTypeParametersForClassWithTwoParams() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType mapStringInt = factory.constructType(new TypeReference<Map<String, Integer>>() {}.getType());
        JavaType[] params = factory.findTypeParameters(mapStringInt, Map.class);
        assertNotNull(params);
        assertEquals(2, params.length);
        assertEquals(String.class, params[0].getRawClass());
        assertEquals(Integer.class, params[1].getRawClass());
    }
    
    @Test
    public void testFindTypeParametersForRawClass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType listRaw = factory.constructType(List.class);
        JavaType[] params = factory.findTypeParameters(listRaw, List.class);
        // For raw types, it should return unknown types
        assertNotNull(params);
        assertEquals(1, params.length);
        assertEquals(Object.class, params[0].getRawClass());
    }

    @Test
    public void testMoreSpecificTypeNullFirst() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type1 = null;
        JavaType type2 = factory.constructType(String.class);
        assertSame(type2, factory.moreSpecificType(type1, type2));
    }

    @Test
    public void testMoreSpecificTypeNullSecond() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type1 = factory.constructType(String.class);
        JavaType type2 = null;
        assertSame(type1, factory.moreSpecificType(type1, type2));
    }

    @Test
    public void testMoreSpecificTypeSame() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type1 = factory.constructType(String.class);
        JavaType type2 = factory.constructType(String.class);
        assertSame(type1, factory.moreSpecificType(type1, type2));
    }

    @Test
    public void testMoreSpecificTypeSubclass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type1 = factory.constructType(List.class);
        JavaType type2 = factory.constructType(ArrayList.class);
        assertSame(type2, factory.moreSpecificType(type1, type2));
    }

    @Test
    public void testMoreSpecificTypeSuperclass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type1 = factory.constructType(ArrayList.class);
        JavaType type2 = factory.constructType(List.class);
        assertSame(type1, factory.moreSpecificType(type1, type2));
    }

    @Test
    public void testConstructTypeFromClass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory.constructType(Integer.class);
        assertNotNull(type);
        assertEquals(Integer.class, type.getRawClass());
        assertTrue(type instanceof SimpleType);
    }

    @Test
    public void testConstructTypeFromParameterizedTypeReference() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        TypeReference<List<Map<String, Double>>> ref = new TypeReference<List<Map<String, Double>>>() {};
        JavaType type = factory.constructType(ref);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertTrue(type.isContainerType());
        assertEquals(1, type.containedTypeCount());
        JavaType contained = type.containedType(0);
        assertEquals(Map.class, contained.getRawClass());
        assertTrue(contained.isContainerType());
        assertEquals(2, contained.containedTypeCount());
        assertEquals(String.class, contained.containedType(0).getRawClass());
        assertEquals(Double.class, contained.containedType(1).getRawClass());
    }

    @Test
    public void testConstructArrayTypeFromClass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        ArrayType arrayType = factory.constructArrayType(String.class);
        assertNotNull(arrayType);
        assertEquals(String[].class, arrayType.getRawClass());
        assertEquals(String.class, arrayType.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayTypeFromJavaType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType elementType = factory.constructType(Integer.class);
        ArrayType arrayType = factory.constructArrayType(elementType);
        assertNotNull(arrayType);
        assertEquals(Integer[].class, arrayType.getRawClass());
        assertEquals(Integer.class, arrayType.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        CollectionType listType = factory.constructCollectionType(ArrayList.class, String.class);
        assertNotNull(listType);
        assertEquals(ArrayList.class, listType.getRawClass());
        assertEquals(String.class, listType.getContentType().getRawClass());
    }
    
    @Test
    public void testConstructCollectionTypeWithJavaType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType elementType = factory.constructType(Integer.class);
        CollectionType listType = factory.constructCollectionType(LinkedList.class, elementType);
        assertNotNull(listType);
        assertEquals(LinkedList.class, listType.getRawClass());
        assertEquals(Integer.class, listType.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        CollectionLikeType setType = factory.constructCollectionLikeType(HashSet.class, Long.class);
        assertNotNull(setType);
        assertEquals(HashSet.class, setType.getRawClass());
        assertEquals(Long.class, setType.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        MapType mapType = factory.constructMapType(HashMap.class, String.class, Integer.class);
        assertNotNull(mapType);
        assertEquals(HashMap.class, mapType.getRawClass());
        assertEquals(String.class, mapType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapType.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapTypeWithJavaTypes() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType keyType = factory.constructType(UUID.class);
        JavaType valueType = factory.constructType(Double.class);
        MapType mapType = factory.constructMapType(TreeMap.class, keyType, valueType);
        assertNotNull(mapType);
        assertEquals(TreeMap.class, mapType.getRawClass());
        assertEquals(UUID.class, mapType.getKeyType().getRawClass());
        assertEquals(Double.class, mapType.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        MapLikeType mapLikeType = factory.constructMapLikeType(LinkedHashMap.class, String.class, Boolean.class);
        assertNotNull(mapLikeType);
        assertEquals(LinkedHashMap.class, mapLikeType.getRawClass());
        assertEquals(String.class, mapLikeType.getKeyType().getRawClass());
        assertEquals(Boolean.class, mapLikeType.getContentType().getRawClass());
    }

    @Test
    public void testConstructSimpleType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType[] params = new JavaType[] { factory.constructType(String.class) };
        // Use a concrete class that has type parameters
        JavaType simpleType = factory.constructSimpleType(List.class, List.class, params);
        assertNotNull(simpleType);
        assertEquals(List.class, simpleType.getRawClass());
        assertEquals(1, simpleType.containedTypeCount());
        assertEquals(String.class, simpleType.containedType(0).getRawClass());
    }

    @Test
    public void testConstructReferenceType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType refType = factory.constructReferenceType(AtomicReference.class, factory.constructType(String.class));
        assertNotNull(refType);
        assertEquals(AtomicReference.class, refType.getRawClass());
        assertEquals(String.class, refType.containedType(0).getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType simpleType = factory.uncheckedSimpleType(Calendar.class);
        assertNotNull(simpleType);
        assertEquals(Calendar.class, simpleType.getRawClass());
        assertTrue(simpleType instanceof SimpleType);
    }

    @Test
    public void testConstructParametrizedTypeWithClasses() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory.constructParametrizedType(ArrayList.class, List.class, Integer.class);
        assertNotNull(type);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(List.class, type.getParameterSource());
        assertEquals(1, type.containedTypeCount());
        assertEquals(Integer.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructParametrizedTypeWithJavaTypes() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType innerType = factory.constructType(String.class);
        JavaType type = factory.constructParametrizedType(ArrayList.class, List.class, innerType);
        assertNotNull(type);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(List.class, type.getParameterSource());
        assertEquals(1, type.containedTypeCount());
        assertEquals(String.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructParametricTypeDeprecated() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory.constructParametricType(HashSet.class, Integer.class);
        assertNotNull(type);
        assertEquals(HashSet.class, type.getRawClass());
        assertEquals(1, type.containedTypeCount());
        assertEquals(Integer.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructRawCollectionType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        CollectionType rawList = factory.constructRawCollectionType(LinkedList.class);
        assertNotNull(rawList);
        assertEquals(LinkedList.class, rawList.getRawClass());
        assertEquals(Object.class, rawList.getContentType().getRawClass()); // unknownType() -> Object.class
    }

    @Test
    public void testConstructRawCollectionLikeType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        CollectionLikeType rawSet = factory.constructRawCollectionLikeType(Set.class);
        assertNotNull(rawSet);
        assertEquals(Set.class, rawSet.getRawClass());
        assertEquals(Object.class, rawSet.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        MapType rawMap = factory.constructRawMapType(Map.class); // Changed from Dictionary.class
        assertNotNull(rawMap);
        assertEquals(Map.class, rawMap.getRawClass());
        assertEquals(Object.class, rawMap.getKeyType().getRawClass());
        assertEquals(Object.class, rawMap.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        MapLikeType rawMapLike = factory.constructRawMapLikeType(Map.class);
        assertNotNull(rawMapLike);
        assertEquals(Map.class, rawMapLike.getRawClass());
        assertEquals(Object.class, rawMapLike.getKeyType().getRawClass());
        assertEquals(Object.class, rawMapLike.getContentType().getRawClass());
    }

    @Test
    public void testFromClassSimple() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory._fromClass(String.class, null);
        assertEquals(String.class, type.getRawClass());
        assertTrue(type instanceof SimpleType);
    }

    @Test
    public void testFromClassEnum() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory._fromClass(Thread.State.class, null);
        assertEquals(Thread.State.class, type.getRawClass());
        assertTrue(type instanceof SimpleType);
    }

    @Test
    public void testFromClassArray() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory._fromClass(int[].class, null);
        assertEquals(int[].class, type.getRawClass());
        assertTrue(type instanceof ArrayType);
        assertEquals(int.class, type.getContentType().getRawClass());
    }

    @Test
    public void testFromClassMap() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory._fromClass(Properties.class, null);
        assertEquals(Properties.class, type.getRawClass());
        assertTrue(type instanceof MapType);
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testFromClassCollection() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory._fromClass(Set.class, null);
        assertEquals(Set.class, type.getRawClass());
        assertTrue(type instanceof CollectionType);
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testFromParameterizedClass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        List<JavaType> params = Collections.singletonList(factory.constructType(Double.class));
        JavaType type = factory._fromParameterizedClass(List.class, params);
        assertEquals(List.class, type.getRawClass());
        assertEquals(Double.class, type.containedType(0).getRawClass());
    }
    
    @Test
    public void testFromParamTypeSimple() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Mock a ParameterizedType for String
        ParameterizedType pt = new ParameterizedType() {
            @Override public Type[] getActualTypeArguments() { return new Type[0]; }
            @Override public Type getRawType() { return String.class; }
            @Override public Type getOwnerType() { return null; }
            @Override public String toString() { return "String"; }
        };
        JavaType type = factory._fromParamType(pt, null);
        assertEquals(String.class, type.getRawClass());
        assertTrue(type instanceof SimpleType);
    }

    @Test
    public void testFromParamTypeCollection() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Mock a ParameterizedType for List<Integer>
        ParameterizedType pt = new ParameterizedType() {
            @Override public Type[] getActualTypeArguments() { return new Type[] { Integer.class }; }
            @Override public Type getRawType() { return List.class; }
            @Override public Type getOwnerType() { return null; }
            @Override public String toString() { return "List<Integer>"; }
        };
        JavaType type = factory._fromParamType(pt, null);
        assertEquals(List.class, type.getRawClass());
        assertTrue(type instanceof CollectionType);
        assertEquals(Integer.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testFromParamTypeMap() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Mock a ParameterizedType for Map<String, Long>
        ParameterizedType pt = new ParameterizedType() {
            @Override public Type[] getActualTypeArguments() { return new Type[] { String.class, Long.class }; }
            @Override public Type getRawType() { return Map.class; }
            @Override public Type getOwnerType() { return null; }
            @Override public String toString() { return "Map<String, Long>"; }
        };
        JavaType type = factory._fromParamType(pt, null);
        assertEquals(Map.class, type.getRawClass());
        assertTrue(type instanceof MapType);
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Long.class, type.getContentType().getRawClass());
    }

    @Test
    public void testFromArrayType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        GenericArrayType gat = new GenericArrayType() {
            @Override public Type getGenericComponentType() { return String.class; }
        };
        JavaType type = factory._fromArrayType(gat, null);
        assertEquals(String[].class, type.getRawClass());
        assertTrue(type instanceof ArrayType);
    }

    @Test
    public void testFromVariable() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        
        // Need to create a TypeVariable correctly. This is tricky without full reflection setup.
        // Instead, let's simulate it by constructing a TypeBindings and then calling _fromVariable.
        // We will use a TypeReference to get a usable TypeVariable.
        TypeReference<List<String>> listRef = new TypeReference<List<String>>() {};
        Type genericType = listRef.getType();
        
        // Check if it's a ParameterizedType and get its TypeVariable
        TypeVariable<?> typeVariable = null;
        if (genericType instanceof ParameterizedType) {
            Type[] typeArgs = ((ParameterizedType) genericType).getActualTypeArguments();
            if (typeArgs.length > 0 && typeArgs[0] instanceof TypeVariable) {
                typeVariable = (TypeVariable<?>) typeArgs[0];
            }
        }
        
        assertNotNull("Could not obtain a TypeVariable for testing", typeVariable);

        TypeBindings bindings = new TypeBindings(factory, (Class<?>) null);
        bindings.addBinding(typeVariable.getName(), factory.constructType(Integer.class));
        JavaType resolvedType = factory._fromVariable(typeVariable, bindings);
        assertEquals(Integer.class, resolvedType.getRawClass());
    }
    
    @Test
    public void testFromWildcard() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        WildcardType wt = new WildcardType() {
            @Override public Type[] getUpperBounds() { return new Type[] { String.class }; }
            @Override public Type[] getLowerBounds() { return new Type[0]; }
            @Override public String toString() { return "? extends String"; } // Added for clarity
        };
        JavaType type = factory._fromWildcard(wt, null);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testMapTypeForProperties() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory._fromClass(Properties.class, null); // Changed to use _fromClass as _mapType is private
        assertEquals(Properties.class, type.getRawClass());
        assertTrue(type instanceof MapType);
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testCollectionTypeForInterface() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory._fromClass(Collection.class, null); // Changed to use _fromClass as _collectionType is private
        assertEquals(Collection.class, type.getRawClass());
        assertTrue(type instanceof CollectionType);
        assertEquals(Object.class, type.getContentType().getRawClass());
    }
    
    @Test
    public void testConstructTypeWithContext() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Define a context type with a parameter
        JavaType contextType = factory.constructType(new TypeReference<Map<String, Integer>>() {}.getType());
        // Construct a type within that context
        JavaType resolvedType = factory.constructType(String.class, contextType);
        assertNotNull(resolvedType);
        assertEquals(String.class, resolvedType.getRawClass());
        // Ensure it's not a parameterized type based on the context
        assertFalse(resolvedType.isContainerType());
    }

    @Test
    public void testConstructTypeWithContextClass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Construct a type using a class context
        JavaType resolvedType = factory.constructType(List.class, ArrayList.class);
        assertNotNull(resolvedType);
        assertEquals(List.class, resolvedType.getRawClass());
        // With ArrayList as context, List should be parameterized by Object
        assertEquals(Object.class, resolvedType.containedType(0).getRawClass());
    }

    @Test
    public void testFindTypeParametersForClassWithTwoParamsInherited() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        // Cannot define inner class with generics directly in a test.
        // Use a TypeReference for a custom generic type.
        class CustomMap<K, V> extends HashMap<K, V> {}
        JavaType customMapType = factory.constructType(new TypeReference<CustomMap<String, Integer>>() {}.getType());
        
        JavaType[] params = factory.findTypeParameters(customMapType, Map.class);
        assertNotNull(params);
        assertEquals(2, params.length);
        assertEquals(String.class, params[0].getRawClass());
        assertEquals(Integer.class, params[1].getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeWithGenerics() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructType(new TypeReference<Map<String, Integer>>() {}.getType());
        JavaType specialized = factory.constructSpecializedType(base, HashMap.class);
        assertNotNull(specialized);
        assertEquals(HashMap.class, specialized.getRawClass());
        assertEquals(base.containedType(0), specialized.containedType(0)); // String
        assertEquals(base.containedType(1), specialized.containedType(1)); // Integer
    }
    
    @Test
    public void testMoreSpecificTypeWithGenerics() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type1 = factory.constructType(new TypeReference<List<String>>() {}.getType());
        JavaType type2 = factory.constructType(new TypeReference<ArrayList<String>>() {}.getType());
        assertSame(type2, factory.moreSpecificType(type1, type2));
    }

    @Test
    public void testConstructTypeFromTypeVariable() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        
        // Use TypeReference to get a TypeVariable
        TypeReference<Map<String, Integer>> ref = new TypeReference<Map<String, Integer>>() {};
        Type genericType = ref.getType();
        TypeVariable<?> typeVariable = null;

        if (genericType instanceof ParameterizedType) {
            Type[] typeArgs = ((ParameterizedType) genericType).getActualTypeArguments();
            if (typeArgs.length > 0 && typeArgs[0] instanceof TypeVariable) {
                typeVariable = (TypeVariable<?>) typeArgs[0];
            }
        }
        
        assertNotNull("Could not obtain a TypeVariable for testing", typeVariable);

        // For _fromVariable, a context is often needed. Let's provide one.
        TypeBindings bindings = new TypeBindings(factory, (Class<?>) null);
        bindings.addBinding(typeVariable.getName(), factory.constructType(Object.class)); // Bind to Object
        
        JavaType resolvedType = factory._fromVariable(typeVariable, bindings);
        assertEquals(Object.class, resolvedType.getRawClass());
    }
    
    @Test
    public void testConstructTypeFromWildcardType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        WildcardType wildcardType = new WildcardType() {
            @Override public Type[] getUpperBounds() { return new Type[] { Number.class }; }
            @Override public Type[] getLowerBounds() { return new Type[0]; }
            @Override public String toString() { return "? extends Number"; } // Added for clarity
        };
        JavaType resolvedType = factory.constructType(wildcardType);
        assertEquals(Number.class, resolvedType.getRawClass());
    }

    @Test
    public void testConstructParametrizedTypeWithMultipleParameters() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory.constructParametrizedType(
            Map.class, Map.class, String.class, Integer.class
        );
        assertEquals(Map.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametrizedTypeWithJavaTypeParameters() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType keyType = factory.constructType(UUID.class);
        JavaType valueType = factory.constructType(Boolean.class);
        JavaType type = factory.constructParametrizedType(
            Map.class, Map.class, keyType, valueType
        );
        assertEquals(Map.class, type.getRawClass());
        assertEquals(UUID.class, type.getKeyType().getRawClass());
        assertEquals(Boolean.class, type.getContentType().getRawClass());
    }
    
    @Test
    public void testConstructParametrizedTypeArray() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType elementType = factory.constructType(String.class);
        JavaType type = factory.constructParametrizedType(
            String[].class, String[].class, elementType
        );
        assertEquals(String[].class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
        assertTrue(type instanceof ArrayType);
    }
}
```