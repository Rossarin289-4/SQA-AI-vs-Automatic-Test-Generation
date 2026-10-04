package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.*;
import com.fasterxml.jackson.databind.JavaType;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;

public class TypeBindingsTest {
    @Test
    public void testEmptyBindings() throws Exception {
        TypeBindings bindings = TypeBindings.emptyBindings();
        assertTrue(bindings.isEmpty());
        assertEquals(0, bindings.size());
        assertEquals("<>", bindings.toString());
    }

    @Test
    public void testCreateOneListBinding() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, Arrays.asList(stringType));
        assertEquals(1, bindings.size());
        assertEquals("E", bindings.getBoundName(0));
        assertEquals(stringType, bindings.findBoundType("E"));
    }

    @Test
    public void testCreateListWithNoArguments() throws Exception {
        try {
            TypeBindings.create(List.class, Collections.<JavaType>emptyList());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCreateRejectsWrongNumberOfArguments() throws Exception {
        try {
            TypeBindings.create(List.class, Arrays.<JavaType>asList(
                    TypeFactory.defaultInstance().constructType(String.class),
                    TypeFactory.defaultInstance().constructType(Integer.class)));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCreateIfNeededForNonGenericType() throws Exception {
        TypeBindings bindings = TypeBindings.createIfNeeded(String.class,
                TypeFactory.defaultInstance().constructType(Integer.class));
        assertTrue(bindings.isEmpty());
        assertEquals(0, bindings.size());
    }

    @Test
    public void testCreateIfNeededForList() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.createIfNeeded(List.class, stringType);
        assertEquals(1, bindings.size());
        assertEquals(stringType, bindings.getBoundType(0));
    }

    @Test
    public void testUnboundVariableAdditions() throws Exception {
        TypeBindings bindings = TypeBindings.emptyBindings()
                .withUnboundVariable("T").withUnboundVariable("U");
        assertTrue(bindings.hasUnbound("T"));
        assertTrue(bindings.hasUnbound("U"));
        assertFalse(bindings.hasUnbound("V"));
    }

    @Test
    public void testFindBoundTypeAndMissingName() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType);
        assertEquals(stringType, bindings.findBoundType("E"));
        assertNull(bindings.findBoundType("missing"));
    }

    @Test
    public void testBoundAccessorsAtAndOutsideEdges() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType);
        assertEquals("E", bindings.getBoundName(0));
        assertEquals(stringType, bindings.getBoundType(0));
        assertNull(bindings.getBoundName(-1));
        assertNull(bindings.getBoundName(1));
        assertNull(bindings.getBoundType(-1));
        assertNull(bindings.getBoundType(1));
    }

    @Test
    public void testTypeParametersInOrder() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType integerType = TypeFactory.defaultInstance().constructType(Integer.class);
        TypeBindings bindings = TypeBindings.create(Map.class, Arrays.asList(stringType, integerType));
        assertEquals(Arrays.asList(stringType, integerType), bindings.getTypeParameters());
    }

    @Test
    public void testEmptyTypeParameters() throws Exception {
        assertEquals(Collections.emptyList(), TypeBindings.emptyBindings().getTypeParameters());
    }

    @Test
    public void testKeyEqualityUsesRawClassAndTypes() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType);
        Object first = bindings.asKey(List.class);
        Object same = TypeBindings.create(List.class, stringType).asKey(List.class);
        Object differentRaw = bindings.asKey(Collection.class);
        assertEquals(first, same);
        assertEquals(first.hashCode(), same.hashCode());
        assertNotEquals(first, differentRaw);
    }

    @Test
    public void testHashAndEqualityIgnoreNames() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings first = TypeBindings.create(List.class, stringType);
        TypeBindings second = TypeBindings.create(Iterable.class, stringType);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
        assertNotEquals(first, TypeBindings.emptyBindings());
    }

    @Test
    public void testDifferentBoundTypesAreNotEqual() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        TypeBindings strings = TypeBindings.create(List.class, factory.constructType(String.class));
        TypeBindings integers = TypeBindings.create(List.class, factory.constructType(Integer.class));
        assertNotEquals(strings, integers);
    }

    @Test
    public void testStringRepresentationOfBinding() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType);
        assertEquals("<Ljava/lang/String;>", bindings.toString());
    }

    @Test
    public void testNullAndDifferentClassEquality() throws Exception {
        TypeBindings bindings = TypeBindings.emptyBindings();
        assertFalse(bindings.equals(null));
        assertFalse(bindings.equals("not bindings"));
        assertTrue(bindings.equals(bindings));
    }

    @Test
    public void testTypeParameterStashLookup() throws Exception {
        assertEquals(1, TypeBindings.TypeParamStash.paramsFor1(List.class).length);
        assertEquals(2, TypeBindings.TypeParamStash.paramsFor2(Map.class).length);
    }

    @Test
    public void testFactoryLoaderAndCacheMethods() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance().withClassLoader(null);
        assertNull(factory.getClassLoader());
        factory.clearCache();
        assertEquals(String.class, factory.findClass("java.lang.String"));
    }

    @Test
    public void testPrimitiveClassLookup() throws Exception {
        assertEquals(Integer.TYPE, TypeFactory.defaultInstance().findClass("int"));
    }

    @Test
    public void testUnknownAndRawClass() throws Exception {
        JavaType unknown = TypeFactory.unknownType();
        assertEquals(Object.class, unknown.getRawClass());
        assertEquals(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void testFindClassMissingName() throws Exception {
        try {
            TypeFactory.defaultInstance().findClass("no.such.Type");
            fail("expected ClassNotFoundException");
        } catch (ClassNotFoundException expected) { }
    }

    @Test
    public void testConstructArraysAndCollections() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertEquals(String[].class, factory.constructArrayType(String.class).getRawClass());
        assertEquals(String.class, factory.constructCollectionType(ArrayList.class, String.class)
                .getContentType().getRawClass());
        assertEquals(String.class, factory.constructCollectionLikeType(Iterable.class, String.class)
                .getContentType().getRawClass());
    }

    @Test
    public void testConstructMapsAndRawCollection() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        MapType map = factory.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(String.class, map.getKeyType().getRawClass());
        assertEquals(Integer.class, map.getContentType().getRawClass());
        assertEquals(Object.class, factory.constructRawCollectionType(ArrayList.class)
                .getContentType().getRawClass());
    }

    @Test
    public void testMapLikeAndRawMapLikeTypes() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        MapLikeType type = factory.constructMapLikeType(HashMap.class, String.class, Integer.class);
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
        assertEquals(Object.class, factory.constructRawMapLikeType(HashMap.class)
                .getContentType().getRawClass());
    }

    @Test
    public void testSimpleAndReferenceTypeConstruction() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType parameterized = factory.constructSimpleType(List.class,
                new JavaType[] { factory.constructType(String.class) });
        assertEquals(String.class, parameterized.containedType(0).getRawClass());
        JavaType reference = factory.constructReferenceType(AtomicReference.class,
                factory.constructType(Integer.class));
        assertEquals(Integer.class, reference.getContentType().getRawClass());
    }

    @Test
    public void testUncheckedAndParametricTypes() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertEquals(String.class, factory.uncheckedSimpleType(String.class).getRawClass());
        assertEquals(Integer.class, factory.constructParametricType(List.class, Integer.class)
                .containedType(0).getRawClass());
        assertEquals(String.class, factory.constructParametrizedType(List.class, List.class,
                factory.constructType(String.class)).containedType(0).getRawClass());
    }

    @Test
    public void testSpecializeAndGeneralizeList() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType list = factory.constructCollectionType(List.class, String.class);
        JavaType specialized = factory.constructSpecializedType(list, ArrayList.class);
        assertEquals(ArrayList.class, specialized.getRawClass());
        assertEquals(String.class, specialized.getContentType().getRawClass());
        assertEquals(List.class, factory.constructGeneralizedType(specialized, List.class).getRawClass());
    }

    @Test
    public void testCanonicalTypeAndFindParameters() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory.constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, type.getRawClass());
        assertEquals(String.class, factory.findTypeParameters(type, List.class)[0].getRawClass());
    }

    @Test
    public void testMoreSpecificTypeSelection() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType stringType = factory.constructType(String.class);
        JavaType objectType = factory.constructType(Object.class);
        assertEquals(stringType, factory.moreSpecificType(objectType, stringType));
        assertEquals(stringType, factory.moreSpecificType(stringType, objectType));
        assertEquals(stringType, factory.moreSpecificType(null, stringType));
    }
}
