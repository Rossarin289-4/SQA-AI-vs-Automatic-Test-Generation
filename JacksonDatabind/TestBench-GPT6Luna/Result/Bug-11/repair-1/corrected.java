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
    @Test
    public void testSingletonAndUnknownType() throws Exception {
        assertSame(TypeFactory.defaultInstance(), TypeFactory.defaultInstance());
        assertEquals(Object.class, TypeFactory.unknownType().getRawClass());
    }

    @Test
    public void testRawClassOfClassAndParameterizedType() throws Exception {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
        assertEquals(List.class, TypeFactory.rawClass(new TypeReference<List<String>>() { }.getType()));
    }

    @Test
    public void testMoreSpecificTypeHandlesNullAndAssignableTypes() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        JavaType objectType = f.constructType(Object.class);
        JavaType stringType = f.constructType(String.class);
        assertSame(stringType, f.moreSpecificType(null, stringType));
        assertSame(stringType, f.moreSpecificType(objectType, stringType));
        assertSame(objectType, f.moreSpecificType(stringType, objectType));
    }

    @Test
    public void testMoreSpecificTypePrefersFirstForSameOrUnrelatedTypes() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        JavaType stringType = f.constructType(String.class);
        JavaType integerType = f.constructType(Integer.class);
        assertSame(stringType, f.moreSpecificType(stringType, stringType));
        assertSame(stringType, f.moreSpecificType(stringType, integerType));
        assertSame(integerType, f.moreSpecificType(integerType, null));
    }

    @Test
    public void testConstructTypePrimitiveAndArray() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        assertEquals(int.class, f.constructType(int.class).getRawClass());
        assertEquals(String[].class, f.constructType(String[].class).getRawClass());
        assertEquals(String.class, f.constructType(String[].class).getContentType().getRawClass());
    }

    @Test
    public void testConstructTypeReferenceForCollectionAndMap() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        JavaType list = f.constructType(new TypeReference<List<String>>() { });
        JavaType map = f.constructType(new TypeReference<Map<String, Integer>>() { });
        assertEquals(List.class, list.getRawClass());
        assertEquals(String.class, list.getContentType().getRawClass());
        assertEquals(String.class, map.getKeyType().getRawClass());
        assertEquals(Integer.class, map.getContentType().getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeReturnsSameForSameRawClass() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        JavaType list = f.constructCollectionType(List.class, String.class);
        assertSame(list, f.constructSpecializedType(list, List.class));
    }

    @Test
    public void testConstructSpecializedCollectionPreservesElementType() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        JavaType base = f.constructCollectionType(Collection.class, String.class);
        JavaType result = f.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
        assertEquals(String.class, result.getContentType().getRawClass());
    }

    @Test
    public void testConstructSpecializedMapPreservesParameters() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        JavaType base = f.constructMapType(Map.class, String.class, Integer.class);
        JavaType result = f.constructSpecializedType(base, HashMap.class);
        assertEquals(HashMap.class, result.getRawClass());
        assertEquals(String.class, result.getKeyType().getRawClass());
        assertEquals(Integer.class, result.getContentType().getRawClass());
    }

    @Test
    public void testConstructFromCanonicalSimpleAndParameterized() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        assertEquals(String.class, f.constructFromCanonical("java.lang.String").getRawClass());
        JavaType list = f.constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, list.getRawClass());
        assertEquals(String.class, list.getContentType().getRawClass());
    }

    @Test
    public void testFindTypeParametersFromResolvedCollectionType() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        JavaType list = f.constructCollectionType(List.class, String.class);
        JavaType[] parameters = f.findTypeParameters(list, List.class);
        assertEquals(1, parameters.length);
        assertEquals(String.class, parameters[0].getRawClass());
    }

    @Test
    public void testFindTypeParametersFromRawClass() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        JavaType[] parameters = f.findTypeParameters(ArrayList.class, Collection.class);
        assertEquals(1, parameters.length);
        assertEquals(Object.class, parameters[0].getRawClass());
    }

    @Test
    public void testFindTypeParametersRejectsUnrelatedClasses() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        try {
            f.findTypeParameters(String.class, List.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConstructArrayTypeFromClassAndJavaType() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        ArrayType fromClass = f.constructArrayType(String.class);
        ArrayType fromType = f.constructArrayType(f.constructType(Integer.class));
        assertEquals(String[].class, fromClass.getRawClass());
        assertEquals(String.class, fromClass.getContentType().getRawClass());
        assertEquals(Integer[].class, fromType.getRawClass());
    }

    @Test
    public void testConstructCollectionType() throws Exception {
        CollectionType type = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType() throws Exception {
        CollectionLikeType type = TypeFactory.defaultInstance().constructCollectionLikeType(ArrayList.class, Integer.class);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        MapType type = f.constructMapType(HashMap.class, f.constructType(String.class), f.constructType(Integer.class));
        assertEquals(HashMap.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        MapLikeType type = f.constructMapLikeType(HashMap.class, f.constructType(Integer.class), f.constructType(String.class));
        assertEquals(HashMap.class, type.getRawClass());
        assertEquals(Integer.class, type.getKeyType().getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructSimpleTypeChecksParameterCount() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        JavaType type = f.constructSimpleType(Map.Entry.class,
                new JavaType[] { f.constructType(String.class), f.constructType(Integer.class) });
        assertEquals(Map.Entry.class, type.getRawClass());
        assertEquals(2, type.containedTypeCount());
        assertEquals(String.class, type.containedType(0).getRawClass());
        assertEquals(Integer.class, type.containedType(1).getRawClass());
    }

    @Test
    public void testConstructSimpleTypeRejectsWrongParameterCount() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        try {
            f.constructSimpleType(Map.Entry.class, new JavaType[] { f.constructType(String.class) });
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testUncheckedSimpleTypeUsesRawClass() throws Exception {
        JavaType type = TypeFactory.defaultInstance().uncheckedSimpleType(List.class);
        assertEquals(List.class, type.getRawClass());
        assertEquals(0, type.containedTypeCount());
    }

    @Test
    public void testConstructParametrizedCollectionAndMap() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        JavaType list = f.constructParametrizedType(ArrayList.class, List.class, String.class);
        JavaType map = f.constructParametrizedType(HashMap.class, Map.class, String.class, Integer.class);
        assertEquals(String.class, list.getContentType().getRawClass());
        assertEquals(String.class, map.getKeyType().getRawClass());
        assertEquals(Integer.class, map.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametrizedTypeRejectsWrongCollectionArity() throws Exception {
        try {
            TypeFactory.defaultInstance().constructParametrizedType(
                    ArrayList.class, List.class, new Class<?>[0]);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConstructParametricType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructParametricType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testRawCollectionAndMapTypesUseUnknownParameters() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        CollectionType collection = f.constructRawCollectionType(ArrayList.class);
        MapType map = f.constructRawMapType(HashMap.class);
        assertEquals(Object.class, collection.getContentType().getRawClass());
        assertEquals(Object.class, map.getKeyType().getRawClass());
        assertEquals(Object.class, map.getContentType().getRawClass());
    }

    @Test
    public void testRawCollectionLikeAndMapLikeTypes() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance();
        CollectionLikeType collection = f.constructRawCollectionLikeType(ArrayList.class);
        MapLikeType map = f.constructRawMapLikeType(HashMap.class);
        assertEquals(Object.class, collection.getContentType().getRawClass());
        assertEquals(Object.class, map.getKeyType().getRawClass());
        assertEquals(Object.class, map.getContentType().getRawClass());
    }

    @Test
    public void testWithNullModifierProducesUsableFactory() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance().withModifier(null);
        assertEquals(String.class, f.constructType(String.class).getRawClass());
    }

    @Test
    public void testClearCacheDoesNotChangeTypeResolution() throws Exception {
        TypeFactory f = TypeFactory.defaultInstance().withModifier(null);
        f.constructType(ArrayList.class);
        f.clearCache();
        assertEquals(ArrayList.class, f.constructType(ArrayList.class).getRawClass());
        assertEquals(String.class, f.constructCollectionType(ArrayList.class, String.class)
                .getContentType().getRawClass());
    }
}
