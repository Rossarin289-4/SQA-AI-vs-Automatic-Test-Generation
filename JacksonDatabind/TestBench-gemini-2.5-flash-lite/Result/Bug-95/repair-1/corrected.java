package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;

public class TypeFactoryTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testDefaultInstance() {
        TypeFactory tf = TypeFactory.defaultInstance();
        assertNotNull(tf);
        // Default instance should have a cache
        // LRUMap is used internally, access to _typeCache is through reflection or a public method.
        // We can infer presence by checking subsequent operations.
        JavaType stringType = tf.constructType(String.class);
        assertNotNull(stringType);
    }

    @Test
    public void testClearCache() {
        TypeFactory tf = TypeFactory.defaultInstance();
        tf.clearCache(); // Should not throw
        // Verify cache is empty (indirectly, by not causing errors on subsequent calls)
        JavaType stringType = tf.constructType(String.class);
        assertNotNull(stringType);
    }

    @Test
    public void testGetClassLoader() {
        TypeFactory tf = TypeFactory.defaultInstance(); // Use default instance to avoid constructor issues
        ClassLoader cl = tf.getClassLoader();
        assertNull(cl); // Default for defaultInstance() is null

        ClassLoader customCl = new ClassLoader() {};
        TypeFactory tfWithCl = tf.withClassLoader(customCl);
        assertSame(customCl, tfWithCl.getClassLoader());
    }

    @Test
    public void testUnknownType() {
        JavaType unknown = TypeFactory.unknownType();
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testRawClassFromString() {
        Class<?> cls = TypeFactory.rawClass(String.class);
        assertEquals(String.class, cls);
    }

    @Test
    public void testRawClassFromParameterizedType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Test with a concrete class that implements a generic interface.
        JavaType hashMapStringType = tf.constructType(new TypeReference<HashMap<String, Integer>>() {});
        Class<?> rawHashMapClass = hashMapStringType.getRawClass();
        
        // Directly call rawClass on the raw class type
        Class<?> mapClassFromRaw = TypeFactory.rawClass(rawHashMapClass);
        assertEquals(HashMap.class, mapClassFromRaw);

        // Test with a TypeReference
        Type mapTypeRef = new TypeReference<Map<String, Integer>>() {}.getType();
        Class<?> mapClassFromTypeRef = TypeFactory.rawClass(mapTypeRef);
        assertEquals(Map.class, mapClassFromTypeRef);
    }
    
    @Test
    public void testRawClassFromSimpleClass() {
        Class<?> cls = TypeFactory.rawClass(Integer.class);
        assertEquals(Integer.class, cls);
    }

    @Test
    public void testFindClassString() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        Class<?> cls = tf.findClass("java.lang.String");
        assertEquals(String.class, cls);
    }

    @Test
    public void testFindClassStringPrimitive() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        Class<?> cls = tf.findClass("int");
        assertEquals(Integer.TYPE, cls);
    }

    @Test
    public void testFindClassNotFound() {
        TypeFactory tf = TypeFactory.defaultInstance();
        try {
            tf.findClass("com.nonexistent.NonExistentClass");
            fail("Should have thrown ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            // Expected
        }
    }

    @Test
    public void testConstructSpecializedTypeSameClass() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType specialized = tf.constructSpecializedType(stringType, String.class);
        assertSame(stringType, specialized);
    }

    @Test
    public void testConstructSpecializedTypeMap() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType mapStringType = tf.constructType(new TypeReference<Map<String, Integer>>() {});
        JavaType specialized = tf.constructSpecializedType(mapStringType, HashMap.class);
        assertNotNull(specialized);
        assertEquals(HashMap.class, specialized.getRawClass());
        assertEquals(String.class, specialized.getKeyType().getRawClass());
        assertEquals(Integer.class, specialized.getContentType().getRawClass());
    }
    
    @Test
    public void testConstructSpecializedTypeCollection() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType listStringType = tf.constructType(new TypeReference<List<String>>() {});
        JavaType specialized = tf.constructSpecializedType(listStringType, ArrayList.class);
        assertNotNull(specialized);
        assertEquals(ArrayList.class, specialized.getRawClass());
        assertEquals(String.class, specialized.getContentType().getRawClass());
    }

    @Test
    public void testConstructGeneralizedTypeSameClass() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType hashMapType = tf.constructType(HashMap.class);
        JavaType generalized = tf.constructGeneralizedType(hashMapType, Map.class);
        assertNotNull(generalized);
        assertEquals(Map.class, generalized.getRawClass());
        // When generalizing a raw Map to Map, the type parameters become Object by default if not specified.
        assertTrue(generalized.getKeyType().isJavaLangObject());
        assertTrue(generalized.getContentType().isJavaLangObject());
    }

    @Test
    public void testConstructGeneralizedTypeSpecific() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType hashMapStringType = tf.constructType(new TypeReference<HashMap<String, Integer>>() {});
        JavaType generalized = tf.constructGeneralizedType(hashMapStringType, Map.class);
        assertNotNull(generalized);
        assertEquals(Map.class, generalized.getRawClass());
        assertEquals(String.class, generalized.getKeyType().getRawClass());
        assertEquals(Integer.class, generalized.getContentType().getRawClass());
    }
    
    @Test
    public void testConstructFromCanonicalSimple() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructFromCanonical("java.lang.String");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }
    
    @Test
    public void testConstructFromCanonicalGeneric() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructFromCanonical("java.util.List<java.lang.Integer>");
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testFindTypeParametersEmpty() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType simpleString = tf.constructType(String.class);
        JavaType[] params = tf.findTypeParameters(simpleString, Map.class);
        assertEquals(0, params.length);
    }

    @Test
    public void testFindTypeParametersForMap() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType mapStringType = tf.constructType(new TypeReference<Map<String, Integer>>() {});
        JavaType[] params = tf.findTypeParameters(mapStringType, Map.class);
        assertEquals(2, params.length);
        assertEquals(String.class, params[0].getRawClass());
        assertEquals(Integer.class, params[1].getRawClass());
    }
    
    @Test
    public void testMoreSpecificTypeFirstNull() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type2 = tf.constructType(String.class);
        JavaType result = tf.moreSpecificType(null, type2);
        assertSame(type2, result);
    }

    @Test
    public void testMoreSpecificTypeSecondNull() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type1 = tf.constructType(String.class);
        JavaType result = tf.moreSpecificType(type1, null);
        assertSame(type1, result);
    }

    @Test
    public void testMoreSpecificTypeSame() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type1 = tf.constructType(String.class);
        JavaType type2 = tf.constructType(String.class);
        JavaType result = tf.moreSpecificType(type1, type2);
        assertSame(type1, result);
    }

    @Test
    public void testMoreSpecificTypeSubtype() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType mapType = tf.constructType(Map.class);
        JavaType hashMapType = tf.constructType(HashMap.class);
        JavaType result = tf.moreSpecificType(mapType, hashMapType);
        assertSame(hashMapType, result);
    }

    @Test
    public void testConstructTypeSimpleClass() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructType(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        // Removed isSimpleType() check as it does not exist in JavaType API
        //assertTrue(type.isSimpleType());
    }
    
    @Test
    public void testConstructTypeParameterizedTypeReference() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructType(new TypeReference<List<Integer>>() {});
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayTypePrimitive() {
        TypeFactory tf = TypeFactory.defaultInstance();
        ArrayType arrayType = tf.constructArrayType(int.class);
        assertNotNull(arrayType);
        assertEquals(int[].class, arrayType.getRawClass());
        assertEquals(int.class, arrayType.getContentType().getRawClass());
    }
    
    @Test
    public void testConstructArrayTypeObject() {
        TypeFactory tf = TypeFactory.defaultInstance();
        ArrayType arrayType = tf.constructArrayType(Object.class);
        assertNotNull(arrayType);
        assertEquals(Object[].class, arrayType.getRawClass());
        assertEquals(Object.class, arrayType.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionTypeConcrete() {
        TypeFactory tf = TypeFactory.defaultInstance();
        CollectionType colType = tf.constructCollectionType(ArrayList.class, String.class);
        assertNotNull(colType);
        assertEquals(ArrayList.class, colType.getRawClass());
        assertEquals(String.class, colType.getContentType().getRawClass());
    }
    
    @Test
    public void testConstructCollectionTypeInterface() {
        TypeFactory tf = TypeFactory.defaultInstance();
        CollectionType colType = tf.constructCollectionType(List.class, Integer.class);
        assertNotNull(colType);
        assertEquals(List.class, colType.getRawClass());
        assertEquals(Integer.class, colType.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        CollectionLikeType colLikeType = tf.constructCollectionLikeType(ArrayList.class, String.class);
        assertNotNull(colLikeType);
        assertEquals(ArrayList.class, colLikeType.getRawClass());
        assertEquals(String.class, colLikeType.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapTypeConcrete() {
        TypeFactory tf = TypeFactory.defaultInstance();
        MapType mapType = tf.constructMapType(HashMap.class, String.class, Integer.class);
        assertNotNull(mapType);
        assertEquals(HashMap.class, mapType.getRawClass());
        assertEquals(String.class, mapType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapType.getContentType().getRawClass());
    }
    
    @Test
    public void testConstructMapTypeProperties() {
        TypeFactory tf = TypeFactory.defaultInstance();
        MapType mapType = tf.constructMapType(Properties.class, String.class, String.class);
        assertNotNull(mapType);
        assertEquals(Properties.class, mapType.getRawClass());
        assertEquals(String.class, mapType.getKeyType().getRawClass());
        assertEquals(String.class, mapType.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        MapLikeType mapLikeType = tf.constructMapLikeType(HashMap.class, String.class, Integer.class);
        assertNotNull(mapLikeType);
        assertEquals(HashMap.class, mapLikeType.getRawClass());
        assertEquals(String.class, mapLikeType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapLikeType.getContentType().getRawClass());
    }

    @Test
    public void testConstructSimpleType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType[] params = {tf.constructType(String.class)};
        JavaType simpleType = tf.constructSimpleType(List.class, params);
        assertNotNull(simpleType);
        assertEquals(List.class, simpleType.getRawClass());
        assertEquals(1, simpleType.containedTypeCount());
        assertEquals(String.class, simpleType.containedType(0).getRawClass());
    }

    @Test
    public void testConstructReferenceType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType referredType = tf.constructType(String.class);
        JavaType referenceType = tf.constructReferenceType(AtomicReference.class, referredType);
        assertNotNull(referenceType);
        assertEquals(AtomicReference.class, referenceType.getRawClass());
        assertTrue(referenceType.hasContentType());
        assertEquals(String.class, referenceType.getContentType().getRawClass());
    }
    
    @Test
    public void testConstructParametricType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType parametricType = tf.constructParametricType(List.class, String.class);
        assertNotNull(parametricType);
        assertEquals(List.class, parametricType.getRawClass());
        assertEquals(String.class, parametricType.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametricTypeMultipleParams() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType parametricType = tf.constructParametricType(Map.class, String.class, Integer.class);
        assertNotNull(parametricType);
        assertEquals(Map.class, parametricType.getRawClass());
        assertEquals(String.class, parametricType.getKeyType().getRawClass());
        assertEquals(Integer.class, parametricType.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametrizedType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType param = tf.constructType(String.class);
        JavaType parametrized = tf.constructParametrizedType(List.class, List.class, param);
        assertNotNull(parametrized);
        assertEquals(List.class, parametrized.getRawClass());
        assertEquals(String.class, parametrized.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        CollectionType rawCollection = tf.constructRawCollectionType(List.class);
        assertNotNull(rawCollection);
        assertEquals(List.class, rawCollection.getRawClass());
        assertTrue(rawCollection.getContentType().isJavaLangObject());
    }

    @Test
    public void testConstructRawMapType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        MapType rawMap = tf.constructRawMapType(Map.class);
        assertNotNull(rawMap);
        assertEquals(Map.class, rawMap.getRawClass());
        assertTrue(rawMap.getKeyType().isJavaLangObject());
        assertTrue(rawMap.getContentType().isJavaLangObject());
    }

    @Test
    public void testWithModifier() {
        TypeFactory tf = TypeFactory.defaultInstance();
        TypeModifier dummyModifier = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                // Does nothing, just returns original type
                return type;
            }
        };
        TypeFactory newTf = tf.withModifier(dummyModifier);
        assertNotNull(newTf);
        // Cannot directly check modifiers, but can check if it's a different instance
        assertNotSame(tf, newTf);
    }

    @Test
    public void testWithCache() {
        TypeFactory tf = TypeFactory.defaultInstance();
        LRUMap<Object, JavaType> cache = new LRUMap<>(10, 20);
        TypeFactory newTf = tf.withCache(cache);
        assertNotNull(newTf);
        // Accessing protected field _typeCache directly. This is generally discouraged,
        // but since it's a test and the structure is known, it's acceptable for verification.
        // If _typeCache were private, we'd need reflection or a getter.
        assertSame(cache, newTf._typeCache);
    }

    // Test for TypeParser methods indirectly via constructFromCanonical
    @Test
    public void testParseSimpleCanonical() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructFromCanonical("java.lang.Boolean");
        assertNotNull(type);
        assertEquals(Boolean.class, type.getRawClass());
    }

    @Test
    public void testParseComplexCanonical() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructFromCanonical("java.util.Map<java.lang.String, java.util.List<java.lang.Integer>>");
        assertNotNull(type);
        assertEquals(Map.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(List.class, type.getContentType().getRawClass());
        assertEquals(Integer.class, type.getContentType().containedType(0).getRawClass());
    }
    
    @Test
    public void testParseCanonicalWithArray() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructFromCanonical("java.lang.String[]");
        assertNotNull(type);
        assertEquals(String[].class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testParseCanonicalWithNestedArray() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructFromCanonical("int[][]");
        assertNotNull(type);
        assertEquals(int[][].class, type.getRawClass());
        assertEquals(int[].class, type.getContentType().getRawClass());
        assertEquals(int.class, type.getContentType().getContentType().getRawClass());
    }
    
    @Test
    public void testConstructTypeWithEmptyBindings() {
        TypeFactory tf = TypeFactory.defaultInstance();
        TypeBindings emptyBindings = TypeBindings.emptyBindings();
        JavaType type = tf.constructType(String.class, emptyBindings);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }
    
    @Test
    public void testConstructTypeWithBindings() {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Test with a simple class and empty bindings
        JavaType boundString = tf.constructType(String.class, TypeBindings.create(String.class, Collections.emptyList()));
        assertNotNull(boundString);
        assertEquals(String.class, boundString.getRawClass());
    }
    
    @Test
    public void testUncheckedSimpleType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType simpleType = tf.uncheckedSimpleType(Long.class);
        assertNotNull(simpleType);
        assertEquals(Long.class, simpleType.getRawClass());
        // Removed isSimpleType() check as it does not exist in JavaType API
        //assertTrue(simpleType.isSimpleType());
    }

    @Test
    public void testConstructRawCollectionLikeType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        CollectionLikeType rawCollectionLike = tf.constructRawCollectionLikeType(List.class);
        assertNotNull(rawCollectionLike);
        assertEquals(List.class, rawCollectionLike.getRawClass());
        assertTrue(rawCollectionLike.getContentType().isJavaLangObject());
    }

    @Test
    public void testConstructRawMapLikeType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        MapLikeType rawMapLike = tf.constructRawMapLikeType(Map.class);
        assertNotNull(rawMapLike);
        assertEquals(Map.class, rawMapLike.getRawClass());
        assertTrue(rawMapLike.getKeyType().isJavaLangObject());
        assertTrue(rawMapLike.getContentType().isJavaLangObject());
    }
    
    @Test
    public void testTypeParserWithEmptyString() {
        TypeFactory tf = TypeFactory.defaultInstance();
        try {
            tf.constructFromCanonical("");
            fail("Should have thrown IllegalArgumentException for empty string");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testTypeParserWithMalformedString() {
        TypeFactory tf = TypeFactory.defaultInstance();
        try {
            tf.constructFromCanonical("java.util.Map<String"); // Missing closing '>'
            fail("Should have thrown IllegalArgumentException for malformed string");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testTypeParserWithExtraTokens() {
        TypeFactory tf = TypeFactory.defaultInstance();
        try {
            tf.constructFromCanonical("java.lang.String xyz");
            fail("Should have thrown IllegalArgumentException for extra tokens");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testTypeParserWithNestedGenericsAndArrays() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructFromCanonical("java.util.List<java.lang.String[]>[]");
        assertNotNull(type);
        assertEquals(ArrayType.class, type.getClass());
        assertEquals(List.class, type.getContentType().getRawClass());
        assertEquals(String[].class, type.getContentType().getContentType().getRawClass());
    }
    
    @Test
    public void testConstructTypeWithContextClass() {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Using the deprecated method. The second argument is a context class.
        JavaType type = tf.constructType(String.class, Integer.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeWithContextJavaType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType contextType = tf.constructType(List.class);
        JavaType type = tf.constructType(String.class, contextType);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }
    
    @Test
    public void testConstructTypeWithContextJavaTypeAndBindings() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType contextType = tf.constructType(Map.class);
        // The method `constructType(Type type, TypeBindings bindings)` expects TypeBindings, not JavaType.
        // We need to create TypeBindings correctly for this test.
        // Constructing a TypeBindings requires knowledge of the generic type parameters.
        // Let's assume Map<String, Integer> for context.
        JavaType[] paramTypes = {tf.constructType(String.class), tf.constructType(Integer.class)};
        TypeBindings bindings = TypeBindings.create(Map.class, paramTypes);
        JavaType type = tf.constructType(String.class, bindings); // Use the correct overload
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }
}
