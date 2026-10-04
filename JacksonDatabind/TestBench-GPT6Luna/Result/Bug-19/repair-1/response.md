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
    @Test
    public void testWithModifierNullPreservesStringType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance().withModifier(null);
        assertEquals(String.class, factory.constructType(String.class).getRawClass());
    }

    @Test
    public void testDefaultInstanceHasUnknownObjectType() throws Exception {
        assertEquals(Object.class, TypeFactory.unknownType().getRawClass());
    }

    @Test
    public void testRawClassClassInput() throws Exception {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void testSpecializedTypeSameClassReturnsBase() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructType(ArrayList.class);
        assertSame(base, factory.constructSpecializedType(base, ArrayList.class));
    }

    @Test
    public void testSpecializedSimpleTypeToCompatibleCollection() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType result = factory.constructSpecializedType(
                factory.uncheckedSimpleType(Collection.class), ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testSpecializedSimpleTypeRejectsIncompatibleCollection() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        try {
            factory.constructSpecializedType(factory.uncheckedSimpleType(String.class), ArrayList.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCanonicalTypeWithCollectionParameters() throws Exception {
        JavaType result = TypeFactory.defaultInstance()
                .constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, result.getRawClass());
        assertEquals(String.class, result.getContentType().getRawClass());
    }

    @Test
    public void testFindTypeParametersDirectly() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType list = factory.constructCollectionType(List.class, String.class);
        JavaType[] params = factory.findTypeParameters(list, List.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void testFindTypeParametersThroughInheritance() throws Exception {
        JavaType[] params = TypeFactory.defaultInstance()
                .findTypeParameters(ArrayList.class, List.class);
        assertEquals(1, params.length);
        assertEquals(Object.class, params[0].getRawClass());
    }

    @Test
    public void testFindTypeParametersRejectsUnrelatedClasses() throws Exception {
        try {
            TypeFactory.defaultInstance().findTypeParameters(String.class, List.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testMoreSpecificTypeChoosesSubtype() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructType(Collection.class);
        JavaType sub = factory.constructType(ArrayList.class);
        assertSame(sub, factory.moreSpecificType(base, sub));
    }

    @Test
    public void testMoreSpecificTypeKeepsPrimaryForUnrelatedTypes() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType primary = factory.constructType(String.class);
        JavaType other = factory.constructType(Integer.class);
        assertSame(primary, factory.moreSpecificType(primary, other));
    }

    @Test
    public void testMoreSpecificTypeHandlesNullPrimary() throws Exception {
        JavaType other = TypeFactory.defaultInstance().constructType(Integer.class);
        assertSame(other, TypeFactory.defaultInstance().moreSpecificType(null, other));
    }

    @Test
    public void testConstructTypeForPrimitive() throws Exception {
        assertEquals(int.class, TypeFactory.defaultInstance().constructType(int.class).getRawClass());
    }

    @Test
    public void testConstructTypeForGenericReference() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(
                new TypeReference<List<String>>() { });
        assertEquals(List.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayType() throws Exception {
        ArrayType type = TypeFactory.defaultInstance().constructArrayType(String.class);
        assertEquals(String[].class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType() throws Exception {
        CollectionType type = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, Integer.class);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType() throws Exception {
        CollectionLikeType type = TypeFactory.defaultInstance()
                .constructCollectionLikeType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        MapType type = factory.constructMapType(HashMap.class,
                factory.constructType(String.class), factory.constructType(Integer.class));
        assertEquals(HashMap.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        MapLikeType type = factory.constructMapLikeType(HashMap.class,
                factory.constructType(String.class), factory.constructType(Integer.class));
        assertEquals(HashMap.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructSimpleTypeChecksArity() throws Exception {
        try {
            TypeFactory.defaultInstance().constructSimpleType(List.class, new JavaType[0]);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConstructReferenceType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory.constructReferenceType(AtomicReference.class, factory.constructType(String.class));
        assertEquals(AtomicReference.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testUncheckedSimpleTypeUsesRequestedClass() throws Exception {
        assertEquals(String.class, TypeFactory.defaultInstance().uncheckedSimpleType(String.class).getRawClass());
    }

    @Test
    public void testConstructParametrizedCollection() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructParametrizedType(ArrayList.class, List.class, String.class);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametrizedArrayRejectsWrongArity() throws Exception {
        try {
            TypeFactory.defaultInstance().constructParametrizedType(
                    String[].class, String[].class, new Class<?>[0]);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRawCollectionTypeUsesObjectContent() throws Exception {
        CollectionType type = TypeFactory.defaultInstance().constructRawCollectionType(ArrayList.class);
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testRawCollectionLikeTypeUsesObjectContent() throws Exception {
        CollectionLikeType type = TypeFactory.defaultInstance().constructRawCollectionLikeType(ArrayList.class);
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testRawMapTypeUsesObjectKeyAndValue() throws Exception {
        MapType type = TypeFactory.defaultInstance().constructRawMapType(HashMap.class);
        assertEquals(Object.class, type.getKeyType().getRawClass());
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testRawMapLikeTypeUsesObjectKeyAndValue() throws Exception {
        MapLikeType type = TypeFactory.defaultInstance().constructRawMapLikeType(HashMap.class);
        assertEquals(Object.class, type.getKeyType().getRawClass());
        assertEquals(Object.class, type.getContentType().getRawClass());
    }
}
```