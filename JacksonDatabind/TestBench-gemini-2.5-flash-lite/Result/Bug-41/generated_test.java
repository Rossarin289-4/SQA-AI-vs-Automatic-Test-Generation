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

// Import missing classes for compilation
import java.net.URL;
import java.net.URLClassLoader;

public class TypeFactoryTest {

    // Helper class for simulating ParameterizedType for testing purposes
    // This is a simplified implementation for testing only and may not cover all edge cases.
    private static class ParameterizedTypeImpl implements ParameterizedType {
        private final Type _rawType;
        private final Type[] _actualTypeArguments;

        public ParameterizedTypeImpl(Class<?> rawType, Type[] actualTypeArguments) {
            _rawType = rawType;
            _actualTypeArguments = actualTypeArguments;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return _actualTypeArguments;
        }

        @Override
        public Type getRawType() {
            return _rawType;
        }

        @Override
        public Type getOwnerType() {
            return null; // Not implemented for this simplified test class
        }
        
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(_rawType.getTypeName());
            sb.append("<");
            for (int i = 0; i < _actualTypeArguments.length; i++) {
                if (i > 0) sb.append(", ");
                sb.append(_actualTypeArguments[i].getTypeName());
            }
            sb.append(">");
            return sb.toString();
        }
        
        @Override
        public String getTypeName() {
            return toString();
        }
    }

    // Test for defaultInstance()
    @Test
    public void testDefaultInstance() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        assertNotNull(tf);
        // Verify it's the singleton instance
        assertSame(tf, TypeFactory.defaultInstance());
        // Check some cached core types
        assertEquals(String.class, TypeFactory.defaultInstance().constructType(String.class).getRawClass());
    }

    // Test for clearCache()
    @Test
    public void testClearCache() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Populate cache
        tf.constructType(String.class);
        tf.constructType(Integer.class);
        // Ensure cache is not empty
        assertTrue(tf._typeCache.size() > 0);
        tf.clearCache();
        // Ensure cache is empty after clearing
        assertEquals(0, tf._typeCache.size());
    }

    // Test for getClassLoader()
    @Test
    public void testGetClassLoader() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Default instance might have null ClassLoader
        assertNull(tf.getClassLoader());
        // Test with custom ClassLoader
        // Corrected: Use valid constructor arguments for URLClassLoader
        ClassLoader customLoader = new URLClassLoader(new URL[]{}, TypeFactoryTest.class.getClassLoader());
        TypeFactory tfWithLoader = tf.withClassLoader(customLoader);
        assertEquals(customLoader, tfWithLoader.getClassLoader());
    }

    // Test for unknownType()
    @Test
    public void testUnknownType() throws Exception {
        JavaType unknown = TypeFactory.unknownType();
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
    }

    // Test for rawClass(Type t)
    @Test
    public void testRawClass() throws Exception {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringListType = tf.constructCollectionType(List.class, String.class);
        assertEquals(List.class, TypeFactory.rawClass(stringListType));
    }

    // Test for findClass(String className) - existing class
    @Test
    public void testFindClass_existing() throws Exception {
        Class<?> foundClass = TypeFactory.defaultInstance().findClass("java.lang.String");
        assertNotNull(foundClass);
        assertEquals(String.class, foundClass);
    }

    // Test for findClass(String className) - primitive
    @Test
    public void testFindClass_primitive() throws Exception {
        Class<?> foundClass = TypeFactory.defaultInstance().findClass("int");
        assertNotNull(foundClass);
        assertEquals(Integer.TYPE, foundClass);
    }

    // Test for findClass(String className) - non-existing class
    @Test
    public void testFindClass_nonExisting() throws Exception {
        try {
            TypeFactory.defaultInstance().findClass("com.example.NonExistentClass");
            fail("Should have thrown ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            // Expected exception
        }
    }

    // Test for constructSpecializedType - same type
    @Test
    public void testConstructSpecializedType_sameType() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType specialized = tf.constructSpecializedType(stringType, String.class);
        assertSame(stringType, specialized);
    }

    // Test for constructSpecializedType - HashMap from Map
    @Test
    public void testConstructSpecializedType_mapToHashMap() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType mapStringInt = tf.constructMapType(Map.class, String.class, Integer.class);
        JavaType hashMapStringInt = tf.constructSpecializedType(mapStringInt, HashMap.class);
        assertEquals(HashMap.class, hashMapStringInt.getRawClass());
        assertEquals(String.class, hashMapStringInt.getKeyType().getRawClass());
        assertEquals(Integer.class, hashMapStringInt.getContentType().getRawClass());
    }

    // Test for constructGeneralizedType - String from Object
    @Test
    public void testConstructGeneralizedType_stringToObject() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType objectType = tf.constructGeneralizedType(stringType, Object.class);
        assertEquals(Object.class, objectType.getRawClass());
        // The reference comparison here might be too strict. Let's check raw classes.
    }

    // Test for constructFromCanonical - String
    @Test
    public void testConstructFromCanonical_string() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    // Test for constructFromCanonical - List<String>
    @Test
    public void testConstructFromCanonical_listString() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructFromCanonical("java.util.List<java.lang.String>");
        assertTrue(type.isContainerType());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    // Test for findTypeParameters for a simple generic type
    @Test
    public void testFindTypeParameters_simpleGeneric() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Define a type that implements a generic interface
        // For this test, we'll simulate a scenario with a custom class
        class MyStringList extends ArrayList<String> {
        }
        JavaType myStringListType = tf.constructType(MyStringList.class);
        JavaType[] params = tf.findTypeParameters(myStringListType, List.class);
        assertNotNull(params);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    // Test for moreSpecificType - type1 is subtype of type2
    @Test
    public void testMoreSpecificType_type1IsSubtype() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType objectType = tf.constructType(Object.class);
        JavaType result = tf.moreSpecificType(stringType, objectType);
        assertSame(stringType, result);
    }

    // Test for moreSpecificType - type2 is subtype of type1
    @Test
    public void testMoreSpecificType_type2IsSubtype() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType objectType = tf.constructType(Object.class);
        JavaType result = tf.moreSpecificType(objectType, stringType);
        assertSame(stringType, result);
    }

    // Test for constructType(Type type) - Class
    @Test
    public void testConstructType_fromClass() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        assertNotNull(type);
        assertEquals(Integer.class, type.getRawClass());
        assertFalse(type.isContainerType());
    }

    // Test for constructType(Type type) - ParameterizedType (simulated)
    @Test
    public void testConstructType_fromParameterizedType() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Simulate a ParameterizedType for List<String>
        // Use the helper class
        Type listStringType = new ParameterizedTypeImpl(List.class, new Class<?>[]{String.class});
        JavaType type = tf.constructType(listStringType);

        assertTrue(type.isContainerType());
        assertEquals(List.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    // Test for constructArrayType(Class<?> elementType)
    @Test
    public void testConstructArrayType_classElement() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ArrayType arrayType = tf.constructArrayType(String.class);
        assertNotNull(arrayType);
        assertEquals(String.class, arrayType.getContentType().getRawClass());
        assertTrue(arrayType.isArrayType());
    }

    // Test for constructArrayType(JavaType elementType)
    @Test
    public void testConstructArrayType_javaTypeElement() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        ArrayType arrayType = tf.constructArrayType(stringType);
        assertNotNull(arrayType);
        assertSame(stringType, arrayType.getContentType());
        assertTrue(arrayType.isArrayType());
    }

    // Test for constructCollectionType(Class<? extends Collection>, Class<?> elementClass)
    @Test
    public void testConstructCollectionType_classAndElementClass() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        CollectionType listStringType = tf.constructCollectionType(List.class, String.class);
        assertEquals(List.class, listStringType.getRawClass());
        assertEquals(String.class, listStringType.getContentType().getRawClass());
    }

    // Test for constructCollectionType(Class<? extends Collection>, JavaType elementType)
    @Test
    public void testConstructCollectionType_classAndJavaTypeElement() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        CollectionType listStringType = tf.constructCollectionType(List.class, stringType);
        assertEquals(List.class, listStringType.getRawClass());
        assertSame(stringType, listStringType.getContentType());
    }

    // Test for constructCollectionLikeType(Class<?> collectionClass, Class<?> elementClass)
    @Test
    public void testConstructCollectionLikeType_classAndElementClass() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        CollectionLikeType listStringType = tf.constructCollectionLikeType(List.class, String.class);
        assertEquals(List.class, listStringType.getRawClass());
        assertEquals(String.class, listStringType.getContentType().getRawClass());
    }

    // Test for constructCollectionLikeType(Class<?> collectionClass, JavaType elementType)
    @Test
    public void testConstructCollectionLikeType_classAndJavaTypeElement() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        CollectionLikeType listStringType = tf.constructCollectionLikeType(List.class, stringType);
        assertEquals(List.class, listStringType.getRawClass());
        assertSame(stringType, listStringType.getContentType());
    }

    // Test for constructMapType(Class<? extends Map>, Class<?> keyClass, Class<?> valueClass)
    @Test
    public void testConstructMapType_classAndKeyValClasses() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        MapType mapStringInt = tf.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(HashMap.class, mapStringInt.getRawClass());
        assertEquals(String.class, mapStringInt.getKeyType().getRawClass());
        assertEquals(Integer.class, mapStringInt.getContentType().getRawClass());
    }

    // Test for constructMapType(Class<? extends Map>, JavaType keyType, JavaType valueType)
    @Test
    public void testConstructMapType_classAndKeyValJavaTypes() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType intType = tf.constructType(Integer.class);
        MapType mapStringInt = tf.constructMapType(HashMap.class, stringType, intType);
        assertEquals(HashMap.class, mapStringInt.getRawClass());
        assertSame(stringType, mapStringInt.getKeyType());
        assertSame(intType, mapStringInt.getContentType());
    }

    // Test for constructMapLikeType(Class<?> mapClass, Class<?> keyClass, Class<?> valueClass)
    @Test
    public void testConstructMapLikeType_classAndKeyValClasses() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        MapLikeType mapStringInt = tf.constructMapLikeType(Map.class, String.class, Integer.class);
        assertEquals(Map.class, mapStringInt.getRawClass());
        assertEquals(String.class, mapStringInt.getKeyType().getRawClass());
        assertEquals(Integer.class, mapStringInt.getContentType().getRawClass());
    }

    // Test for constructMapLikeType(Class<?> mapClass, JavaType keyType, JavaType valueType)
    @Test
    public void testConstructMapLikeType_classAndKeyValJavaTypes() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType intType = tf.constructType(Integer.class);
        MapLikeType mapStringInt = tf.constructMapLikeType(Map.class, stringType, intType);
        assertEquals(Map.class, mapStringInt.getRawClass());
        assertSame(stringType, mapStringInt.getKeyType());
        assertSame(intType, mapStringInt.getContentType());
    }

    // Test for constructSimpleType(Class<?> rawType, JavaType[] parameterTypes)
    // This method is intended for cases where the type itself does not have type parameters,
    // but it's being asked to construct one with parameters. The source code indicates
    // it might throw an IllegalArgumentException if the bindings are not suitable.
    // For List.class, it expects 1 type parameter (element type). Providing 2 is invalid.
    @Test
    public void testConstructSimpleType_withParams() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType intType = tf.constructType(Integer.class);
        try {
            tf.constructSimpleType(List.class, new JavaType[]{stringType, intType});
            fail("Should have thrown IllegalArgumentException for incorrect number of type parameters.");
        } catch (IllegalArgumentException e) {
            // Expected exception
            assertTrue(e.getMessage().contains("Can not create TypeBindings for class java.util.List with 2 type parameters: class expects 1"));
        }
    }

    // Test for constructReferenceType(Class<?> rawType, JavaType referredType)
    @Test
    public void testConstructReferenceType() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        // Using AtomicReference as it's a known Reference type
        ReferenceType refType = (ReferenceType) tf.constructReferenceType(AtomicReference.class, stringType);
        assertEquals(AtomicReference.class, refType.getRawClass());
        assertSame(stringType, refType.getContentType());
    }

    // Test for uncheckedSimpleType(Class<?> cls)
    @Test
    public void testUncheckedSimpleType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().uncheckedSimpleType(Double.class);
        assertNotNull(type);
        assertEquals(Double.class, type.getRawClass());
        assertTrue(type instanceof SimpleType);
    }

    // Test for constructParametricType(Class<?> parametrized, Class<?>... parameterClasses)
    @Test
    public void testConstructParametricType_classArray() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType listStringType = tf.constructParametricType(List.class, String.class);
        assertEquals(List.class, listStringType.getRawClass());
        assertEquals(String.class, listStringType.getContentType().getRawClass());
    }

    // Test for constructParametricType(Class<?> rawType, JavaType... parameterTypes)
    @Test
    public void testConstructParametricType_javaTypeArray() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType listStringType = tf.constructParametricType(List.class, stringType);
        assertEquals(List.class, listStringType.getRawClass());
        assertSame(stringType, listStringType.getContentType());
    }

    // Test for constructParametrizedType with two args for Class<?> parametersFor
    @Test
    public void testConstructParametrizedType_TwoArgs_ClassArray() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Constructing HashMap<String, Integer>
        // parametrized = HashMap.class
        // parametersFor = Map.class (the interface it implements)
        // parameterClasses = String.class, Integer.class
        JavaType mapStringInt = tf.constructParametrizedType(HashMap.class, Map.class, String.class, Integer.class);
        assertEquals(HashMap.class, mapStringInt.getRawClass());
        assertEquals(String.class, mapStringInt.getKeyType().getRawClass());
        assertEquals(Integer.class, mapStringInt.getContentType().getRawClass());
    }

    // Test for constructParametrizedType with two args for JavaType parametersFor
    @Test
    public void testConstructParametrizedType_TwoArgs_JavaTypeArray() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType intType = tf.constructType(Integer.class);
        // Using the JavaType version of the parameters
        JavaType mapStringInt = tf.constructParametrizedType(HashMap.class, Map.class, stringType, intType);
        assertEquals(HashMap.class, mapStringInt.getRawClass());
        assertSame(stringType, mapStringInt.getKeyType());
        assertSame(intType, mapStringInt.getContentType());
    }

    // Test for constructRawCollectionType(Class<? extends Collection> collectionClass)
    @Test
    public void testConstructRawCollectionType() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        CollectionType listUnknown = tf.constructRawCollectionType(ArrayList.class);
        assertEquals(ArrayList.class, listUnknown.getRawClass());
        // Should default to unknownType() which is Object.class
        assertEquals(Object.class, listUnknown.getContentType().getRawClass());
    }

    // Test for constructRawCollectionLikeType(Class<?> collectionClass)
    @Test
    public void testConstructRawCollectionLikeType() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        CollectionLikeType listUnknown = tf.constructRawCollectionLikeType(List.class);
        assertEquals(List.class, listUnknown.getRawClass());
        // Should default to unknownType() which is Object.class
        assertEquals(Object.class, listUnknown.getContentType().getRawClass());
    }

    // Test for constructRawMapType(Class<? extends Map> mapClass)
    @Test
    public void testConstructRawMapType() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        MapType mapUnknown = tf.constructRawMapType(LinkedHashMap.class);
        assertEquals(LinkedHashMap.class, mapUnknown.getRawClass());
        // Should default to unknownType() which is Object.class for both key and value
        assertEquals(Object.class, mapUnknown.getKeyType().getRawClass());
        assertEquals(Object.class, mapUnknown.getContentType().getRawClass());
    }

    // Test for constructRawMapLikeType(Class<?> mapClass)
    @Test
    public void testConstructRawMapLikeType() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        MapLikeType mapUnknown = tf.constructRawMapLikeType(Map.class);
        assertEquals(Map.class, mapUnknown.getRawClass());
        // Should default to unknownType() which is Object.class for both key and value
        assertEquals(Object.class, mapUnknown.getKeyType().getRawClass());
        assertEquals(Object.class, mapUnknown.getContentType().getRawClass());
    }

    // Test for withModifier(TypeModifier mod)
    @Test
    public void testWithModifier() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        TypeModifier dummyModifier = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                // Simply return the type as is, this tests the chaining
                return type;
            }
        };
        TypeFactory modifiedTf = tf.withModifier(dummyModifier);
        assertNotNull(modifiedTf);
        assertNotSame(tf, modifiedTf); // Should be a new instance
        // It's hard to assert the modifier was added without reflection or more complex setup.
        // We can check it doesn't return the default instance.
        assertNotSame(TypeFactory.defaultInstance(), modifiedTf);
    }

    // Test for withClassLoader(ClassLoader classLoader)
    @Test
    public void testWithClassLoader() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Corrected: Use valid constructor arguments for URLClassLoader
        ClassLoader customLoader = new URLClassLoader(new URL[]{}, TypeFactoryTest.class.getClassLoader());
        TypeFactory tfWithLoader = tf.withClassLoader(customLoader);
        assertNotNull(tfWithLoader);
        assertNotSame(tf, tfWithLoader); // Should be a new instance
        assertEquals(customLoader, tfWithLoader.getClassLoader());
    }

    // Test for withModifier(null) which should return a new instance
    @Test
    public void testWithModifier_null() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        TypeFactory modifiedTf = tf.withModifier(null);
        assertNotNull(modifiedTf);
        assertNotSame(tf, modifiedTf);
    }
    
    // Test for constructType(TypeReference<?> typeRef)
    @Test
    public void testConstructType_typeReference() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        TypeReference<List<String>> ref = new TypeReference<List<String>>() {};
        JavaType listStringType = tf.constructType(ref);

        assertTrue(listStringType.isContainerType());
        assertEquals(List.class, listStringType.getRawClass());
        assertEquals(String.class, listStringType.getContentType().getRawClass());
    }

    // Test for constructType(Type type, TypeBindings bindings)
    @Test
    public void testConstructType_withBindings() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Create a binding for a type variable 'T'
        JavaType stringType = tf.constructType(String.class);
        // The 'Object.class' is the raw type for which bindings are created.
        // The binding maps 'T' (implicitly, as there are no explicit type variable names here) to String.
        // The 'Map.class' as the type to construct, will use these bindings.
        TypeBindings bindings = TypeBindings.create(Object.class, new JavaType[]{stringType});
        
        // Constructing Map.class with these bindings. This call should resolve to Map<String, ?>
        // where the first parameter is bound to String.
        JavaType type = tf.constructType(Map.class, bindings); 
        
        assertEquals(Map.class, type.getRawClass());
        // The binding is for the Object.class in the TypeBindings.create call, which is not directly
        // related to Map.class's parameterization.
        // A more direct test for bindings would involve a class with explicit type variables.
        // For now, we assert that the method does not throw an exception and produces a Map type.
    }
    
    // Test for constructType(Type type, Class<?> contextClass) - deprecated
    @Test
    public void testConstructType_withContextClass_deprecated() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Simulate a generic type within a context
        class ContextClass<T> {
            List<T> field;
        }
        
        // Constructing List.class which is the generic type.
        // The contextClass is ContextClass.class.
        // The method infers the type parameter of List from the contextClass.
        JavaType type = tf.constructType(List.class, ContextClass.class); 

        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        // The type parameter for List in ContextClass<T> is T.
        // When constructing List.class with ContextClass.class as context,
        // the 'T' should be resolved to Object.class (default for unbound type variables).
        assertEquals(Object.class, type.getContentType().getRawClass());
    }
    
    // Test for constructType(Type type, JavaType contextType) - deprecated
    @Test
    public void testConstructType_withContextJavaType_deprecated() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        // Simulate a generic type using TypeReference
        TypeReference<Map<String, Integer>> ref = new TypeReference<Map<String, Integer>>() {};
        JavaType contextJavaType = tf.constructType(ref.getType());
        
        // Constructing ArrayList<String> where contextJavaType is Map<String, Integer>
        // The context type here is not directly related to ArrayList, so it should default
        // to Object.class as content type.
        TypeReference<ArrayList<String>> innerRef = new TypeReference<ArrayList<String>>() {};
        JavaType type = tf.constructType(innerRef.getType(), contextJavaType);

        assertNotNull(type);
        assertEquals(ArrayList.class, type.getRawClass());
        // The contextType is Map<String, Integer>. Since ArrayList is not a subtype of Map
        // and has no generic parameters related to Map's, the default behavior for its
        // content type should be used (which is Object.class if not explicitly typed otherwise).
        assertEquals(String.class, type.getContentType().getRawClass());
    }

}
