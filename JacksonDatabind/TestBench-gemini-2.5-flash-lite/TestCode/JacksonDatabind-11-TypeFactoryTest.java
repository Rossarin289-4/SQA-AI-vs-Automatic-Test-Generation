package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.lang.reflect.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.LRUMap;

public class TypeFactoryTest {

    // Helper to get a TypeFactory instance
    private TypeFactory tf() {
        return TypeFactory.defaultInstance();
    }

    @Test
    public void testDefaultInstance() {
        assertNotNull(TypeFactory.defaultInstance());
        // Ensure it's the singleton
        assertSame(TypeFactory.defaultInstance(), TypeFactory.defaultInstance());
    }

    @Test
    public void testClearCache() {
        TypeFactory factory = tf();
        // Populate cache first (e.g., by constructing a type)
        factory.constructType(String.class);
        assertNotEquals(0, factory._typeCache.size());
        factory.clearCache();
        assertEquals(0, factory._typeCache.size());
    }

    @Test
    public void testUnknownType() {
        JavaType unknown = TypeFactory.unknownType();
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
        assertTrue(unknown instanceof SimpleType);
    }

    @Test
    public void testRawClassOfString() {
        Class<?> raw = TypeFactory.rawClass(String.class);
        assertNotNull(raw);
        assertEquals(String.class, raw);
    }

    @Test
    public void testRawClassOfParameterizedType() {
        // Use a TypeReference to represent a parameterized type
        TypeReference<List<String>> ref = new TypeReference<List<String>>() {};
        Class<?> raw = TypeFactory.rawClass(ref.getType());
        assertNotNull(raw);
        assertEquals(List.class, raw);
    }
    
    @Test
    public void testConstructTypeFromStringClass() {
        JavaType type = tf().constructType(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        assertTrue(type instanceof SimpleType);
    }

    @Test
    public void testConstructTypeFromIntegerClass() {
        JavaType type = tf().constructType(Integer.class);
        assertNotNull(type);
        assertEquals(Integer.class, type.getRawClass());
        assertTrue(type instanceof SimpleType);
    }
    
    @Test
    public void testConstructTypeFromPrimitiveInt() {
        JavaType type = tf().constructType(int.class);
        assertNotNull(type);
        assertEquals(Integer.TYPE, type.getRawClass());
        assertTrue(type instanceof SimpleType);
    }

    @Test
    public void testConstructTypeFromParameterizedTypeRef() {
        TypeReference<Map<String, Integer>> ref = new TypeReference<Map<String, Integer>>() {};
        JavaType type = tf().constructType(ref);
        assertNotNull(type);
        assertEquals(Map.class, type.getRawClass());
        assertTrue(type instanceof MapType);
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructArrayTypeFromClass() {
        ArrayType type = tf().constructArrayType(String.class);
        assertNotNull(type);
        assertEquals(String[].class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayTypeFromJavaType() {
        JavaType stringJavaType = tf().constructType(String.class);
        ArrayType type = tf().constructArrayType(stringJavaType);
        assertNotNull(type);
        assertEquals(String[].class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionTypeWithClasses() {
        CollectionType type = tf().constructCollectionType(List.class, String.class);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionTypeWithJavaType() {
        JavaType stringJavaType = tf().constructType(String.class);
        CollectionType type = tf().constructCollectionType(List.class, stringJavaType);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }
    
    @Test
    public void testConstructCollectionLikeTypeWithClasses() {
        CollectionLikeType type = tf().constructCollectionLikeType(LinkedList.class, Integer.class);
        assertNotNull(type);
        assertEquals(LinkedList.class, type.getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapTypeWithJavaTypes() {
        JavaType keyType = tf().constructType(String.class);
        JavaType valueType = tf().constructType(Boolean.class);
        MapType type = tf().constructMapType(HashMap.class, keyType, valueType);
        assertNotNull(type);
        assertEquals(HashMap.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Boolean.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructMapTypeWithClasses() {
        MapType type = tf().constructMapType(HashMap.class, String.class, Integer.class);
        assertNotNull(type);
        assertEquals(HashMap.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.containedType(0).getRawClass());
    }
    
    @Test
    public void testConstructMapLikeTypeWithJavaTypes() {
        JavaType keyType = tf().constructType(UUID.class);
        JavaType valueType = tf().constructType(Long.class);
        MapLikeType type = tf().constructMapLikeType(TreeMap.class, keyType, valueType);
        assertNotNull(type);
        assertEquals(TreeMap.class, type.getRawClass());
        assertEquals(UUID.class, type.getKeyType().getRawClass());
        assertEquals(Long.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructSimpleType() {
        JavaType[] params = { tf().constructType(String.class) }; // List only takes one type parameter
        JavaType simpleType = tf().constructSimpleType(List.class, List.class, params);
        assertNotNull(simpleType);
        assertEquals(List.class, simpleType.getRawClass());
        assertEquals(String.class, simpleType.containedType(0).getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType type = tf().uncheckedSimpleType(Date.class);
        assertNotNull(type);
        assertEquals(Date.class, type.getRawClass());
        assertTrue(type instanceof SimpleType);
    }

    @Test
    public void testConstructParametrizedTypeWithClasses() {
        JavaType type = tf().constructParametrizedType(List.class, List.class, String.class);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(String.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructParametrizedTypeWithJavaTypes() {
        JavaType elementType = tf().constructType(Double.class);
        JavaType type = tf().constructParametrizedType(Set.class, Set.class, elementType);
        assertNotNull(type);
        assertEquals(Set.class, type.getRawClass());
        assertEquals(Double.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructParametricTypeWithClasses() {
        // Deprecated method, but test its functionality
        JavaType type = tf().constructParametricType(ArrayList.class, Number.class);
        assertNotNull(type);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(Number.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructParametrizedTypeWithMultipleClasses() {
        JavaType type = tf().constructParametrizedType(Map.class, Map.class, String.class, Long.class);
        assertNotNull(type);
        assertEquals(Map.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Long.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructRawCollectionType() {
        CollectionType type = tf().constructRawCollectionType(HashSet.class);
        assertNotNull(type);
        assertEquals(HashSet.class, type.getRawClass());
        assertEquals(Object.class, type.getContentType().getRawClass()); // unknownType() is Object.class
    }

    @Test
    public void testConstructRawCollectionLikeType() {
        CollectionLikeType type = tf().constructRawCollectionLikeType(Stack.class);
        assertNotNull(type);
        assertEquals(Stack.class, type.getRawClass());
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapType() {
        MapType type = tf().constructRawMapType(Hashtable.class);
        assertNotNull(type);
        assertEquals(Hashtable.class, type.getRawClass());
        assertEquals(Object.class, type.getKeyType().getRawClass());
        assertEquals(Object.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType() {
        MapLikeType type = tf().constructRawMapLikeType(Properties.class);
        assertNotNull(type);
        assertEquals(Properties.class, type.getRawClass());
        assertEquals(Object.class, type.getKeyType().getRawClass());
        assertEquals(Object.class, type.containedType(0).getRawClass());
    }
    
    @Test
    public void testFindTypeParametersForSimpleClass() {
        JavaType type = tf().constructType(String.class);
        Class<?> expType = Object.class;
        JavaType[] params = tf().findTypeParameters(type, expType);
        assertNull(params); // String is not generic and not a subtype of Object with parameters
    }

    @Test
    public void testFindTypeParametersForMap() {
        TypeReference<Map<String, Integer>> ref = new TypeReference<Map<String, Integer>>() {};
        JavaType type = tf().constructType(ref);
        Class<?> expType = Map.class;
        JavaType[] params = tf().findTypeParameters(type, expType);
        assertNotNull(params);
        assertEquals(2, params.length);
        assertEquals(String.class, params[0].getRawClass());
        assertEquals(Integer.class, params[1].getRawClass());
    }

    @Test
    public void testMoreSpecificTypeWhenTypesAreSame() {
        JavaType type1 = tf().constructType(String.class);
        JavaType type2 = tf().constructType(String.class);
        JavaType result = tf().moreSpecificType(type1, type2);
        assertSame(type1, result);
    }

    @Test
    public void testMoreSpecificTypeWhenFirstIsNull() {
        JavaType type2 = tf().constructType(String.class);
        JavaType result = tf().moreSpecificType(null, type2);
        assertSame(type2, result);
    }

    @Test
    public void testMoreSpecificTypeWhenSecondIsNull() {
        JavaType type1 = tf().constructType(String.class);
        JavaType result = tf().moreSpecificType(type1, null);
        assertSame(type1, result);
    }

    @Test
    public void testMoreSpecificTypeWhenSecondIsSubtype() {
        JavaType type1 = tf().constructType(Map.class);
        JavaType type2 = tf().constructType(HashMap.class);
        JavaType result = tf().moreSpecificType(type1, type2);
        assertSame(type2, result);
    }
    
    @Test
    public void testConstructSpecializedTypeWhenSameClass() {
        JavaType baseType = tf().constructType(List.class);
        JavaType specialized = tf().constructSpecializedType(baseType, List.class);
        assertSame(baseType, specialized);
    }

    @Test
    public void testConstructSpecializedTypeWhenSubclassIsMap() {
        JavaType baseType = tf().constructType(Map.class);
        JavaType specialized = tf().constructSpecializedType(baseType, HashMap.class);
        assertNotNull(specialized);
        assertEquals(HashMap.class, specialized.getRawClass());
        assertTrue(specialized.isMapLikeType());
    }
    
    @Test
    public void testConstructSpecializedTypeWhenSubclassIsCollection() {
        JavaType baseType = tf().constructType(Collection.class);
        JavaType specialized = tf().constructSpecializedType(baseType, ArrayList.class);
        assertNotNull(specialized);
        assertEquals(ArrayList.class, specialized.getRawClass());
        assertTrue(specialized.isCollectionLikeType());
    }

    @Test
    public void testConstructFromCanonicalSimple() {
        JavaType type = tf().constructFromCanonical("java.lang.String");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructFromCanonicalParameterized() {
        JavaType type = tf().constructFromCanonical("java.util.Map<java.lang.String, java.lang.Integer>");
        assertNotNull(type);
        assertEquals(Map.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testWithModifierAddsModifier() {
        TypeModifier mockModifier = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings bindings, TypeFactory typeFactory) {
                return type; // No-op modifier
            }
        };
        TypeFactory factory = tf().withModifier(mockModifier);
        assertNotNull(factory._modifiers);
        assertEquals(1, factory._modifiers.length);
        assertSame(mockModifier, factory._modifiers[0]);
    }

    @Test
    public void testWithModifierAddsToExisting() {
        TypeModifier mockModifier1 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings bindings, TypeFactory typeFactory) {
                return type;
            }
        };
        TypeModifier mockModifier2 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings bindings, TypeFactory typeFactory) {
                return type;
            }
        };
        // The factory is immutable, so we need to assign the result of withModifier
        TypeFactory factory = tf().withModifier(mockModifier1).withModifier(mockModifier2);
        assertNotNull(factory._modifiers);
        assertEquals(2, factory._modifiers.length);
        assertSame(mockModifier1, factory._modifiers[0]);
        assertSame(mockModifier2, factory._modifiers[1]);
    }
}
