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
    @Test
    public void testDefaultFactorySingletonAndInitialLoader() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertSame(factory, TypeFactory.defaultInstance());
        assertNull(factory.getClassLoader());
    }

    @Test
    public void testFactoryWithSpecifiedLoader() throws Exception {
        ClassLoader loader = String.class.getClassLoader();
        assertSame(loader, TypeFactory.defaultInstance().withClassLoader(loader).getClassLoader());
    }

    @Test
    public void testFactoryWithNullLoader() throws Exception {
        assertNull(TypeFactory.defaultInstance().withClassLoader(null).getClassLoader());
    }

    @Test
    public void testCustomCacheFactoryCanConstructType() throws Exception {
        LRUMap<Object, JavaType> cache = new LRUMap<Object, JavaType>(2, 8);
        TypeFactory factory = TypeFactory.defaultInstance().withCache(cache);
        assertEquals(String.class, factory.constructType(String.class).getRawClass());
    }

    @Test
    public void testClearCacheLeavesFactoryUsable() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance().withCache(
                new LRUMap<Object, JavaType>(2, 8));
        assertEquals(Integer.class, factory.constructType(Integer.class).getRawClass());
        factory.clearCache();
        assertEquals(Integer.class, factory.constructType(Integer.class).getRawClass());
    }

    @Test
    public void testUnknownTypeIsObject() throws Exception {
        assertEquals(Object.class, TypeFactory.unknownType().getRawClass());
    }

    @Test
    public void testRawClassForClassAndParameterizedType() throws Exception {
        assertSame(String.class, TypeFactory.rawClass(String.class));
        JavaType listType = TypeFactory.defaultInstance().constructType(
                new TypeReference<List<String>>() { });
        assertSame(List.class, TypeFactory.rawClass(listType));
    }

    @Test
    public void testFindPrimitiveClass() throws Exception {
        assertSame(Integer.TYPE, TypeFactory.defaultInstance().findClass("int"));
    }

    @Test
    public void testFindNamedClass() throws Exception {
        assertSame(String.class, TypeFactory.defaultInstance().findClass("java.lang.String"));
    }

    @Test
    public void testSpecializeCollectionPreservesContentType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructCollectionType(List.class, String.class);
        JavaType specialized = factory.constructSpecializedType(base, ArrayList.class);
        assertSame(ArrayList.class, specialized.getRawClass());
        assertSame(String.class, specialized.getContentType().getRawClass());
    }

    @Test
    public void testSpecializeRejectsUnrelatedClass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructType(String.class);
        try {
            factory.constructSpecializedType(base, Integer.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testGeneralizeCollectionFindsParameterizedSupertype() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructCollectionType(ArrayList.class, String.class);
        JavaType generalized = factory.constructGeneralizedType(base, List.class);
        assertSame(List.class, generalized.getRawClass());
        assertSame(String.class, generalized.getContentType().getRawClass());
    }

    @Test
    public void testGeneralizeRejectsUnrelatedClass() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructType(String.class);
        try {
            factory.constructGeneralizedType(base, Number.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConstructCanonicalSimpleAndGenericTypes() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertSame(String.class, factory.constructFromCanonical("java.lang.String").getRawClass());
        JavaType list = factory.constructFromCanonical("java.util.List<java.lang.String>");
        assertSame(List.class, list.getRawClass());
        assertSame(String.class, list.getContentType().getRawClass());
    }

    @Test
    public void testCanonicalParserRejectsTrailingTokens() throws Exception {
        try {
            TypeFactory.defaultInstance().constructFromCanonical("java.lang.String java.lang.Integer");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFindTypeParametersForListAndUnrelatedType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType list = factory.constructCollectionType(ArrayList.class, String.class);
        JavaType[] parameters = factory.findTypeParameters(list, List.class);
        assertEquals(1, parameters.length);
        assertSame(String.class, parameters[0].getRawClass());
        assertEquals(0, factory.findTypeParameters(list, Map.class).length);
    }

    @Test
    public void testMoreSpecificTypeReturnsPrimaryWhenTypesAreRelated() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType list = factory.constructType(List.class);
        JavaType arrayList = factory.constructType(ArrayList.class);
        assertSame(list, factory.moreSpecificType(list, arrayList));
        assertSame(arrayList, factory.moreSpecificType(arrayList, list));
    }

    @Test
    public void testMoreSpecificTypeHandlesNullArguments() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType string = factory.constructType(String.class);
        assertSame(string, factory.moreSpecificType(null, string));
        assertSame(string, factory.moreSpecificType(string, null));
        assertNull(factory.moreSpecificType(null, null));
    }

    @Test
    public void testConstructTypeFromClassAndTypeReference() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertSame(String.class, factory.constructType(String.class).getRawClass());
        JavaType list = factory.constructType(new TypeReference<List<Integer>>() { });
        assertSame(List.class, list.getRawClass());
        assertSame(Integer.class, list.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayTypeFromClassAndJavaType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertSame(String[].class, factory.constructArrayType(String.class).getRawClass());
        JavaType element = factory.constructType(Integer.class);
        ArrayType array = factory.constructArrayType(element);
        assertSame(Integer[].class, array.getRawClass());
        assertSame(Integer.class, array.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionTypeCarriesElementType() throws Exception {
        CollectionType type = TypeFactory.defaultInstance().constructCollectionType(
                ArrayList.class, String.class);
        assertSame(ArrayList.class, type.getRawClass());
        assertSame(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeTypeForIterable() throws Exception {
        CollectionLikeType type = TypeFactory.defaultInstance().constructCollectionLikeType(
                Iterable.class, String.class);
        assertSame(Iterable.class, type.getRawClass());
        assertSame(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapTypeCarriesKeyAndValueTypes() throws Exception {
        MapType type = TypeFactory.defaultInstance().constructMapType(
                HashMap.class, String.class, Integer.class);
        assertSame(HashMap.class, type.getRawClass());
        assertSame(String.class, type.getKeyType().getRawClass());
        assertSame(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testPropertiesTypeUsesStringTypes() throws Exception {
        MapType type = TypeFactory.defaultInstance().constructType(Properties.class) instanceof MapType
                ? (MapType) TypeFactory.defaultInstance().constructType(Properties.class) : null;
        assertNotNull(type);
        assertSame(String.class, type.getKeyType().getRawClass());
        assertSame(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeTypeCarriesKeyAndValueTypes() throws Exception {
        MapLikeType type = TypeFactory.defaultInstance().constructMapLikeType(
                Map.Entry.class, String.class, Integer.class);
        assertSame(Map.Entry.class, type.getRawClass());
        assertSame(String.class, type.getKeyType().getRawClass());
        assertSame(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructSimpleAndParametricTypes() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType string = factory.constructType(String.class);
        JavaType simple = factory.constructSimpleType(List.class, new JavaType[] { string });
        JavaType parametric = factory.constructParametricType(List.class, String.class);
        assertSame(List.class, simple.getRawClass());
        assertSame(String.class, simple.getContentType().getRawClass());
        assertEquals(simple, parametric);
    }

    @Test
    public void testConstructReferenceAndRawCollectionTypes() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType reference = factory.constructReferenceType(AtomicReference.class,
                factory.constructType(String.class));
        assertSame(AtomicReference.class, reference.getRawClass());
        assertSame(String.class, reference.getContentType().getRawClass());

        CollectionType rawCollection = factory.constructRawCollectionType(ArrayList.class);
        assertSame(ArrayList.class, rawCollection.getRawClass());
        assertSame(Object.class, rawCollection.getContentType().getRawClass());
    }

    @Test
    public void testWithModifierNullReturnsUsableFactory() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance().withModifier(null);
        assertSame(String.class, factory.constructType(String.class).getRawClass());
    }

    @Test
    public void testUncheckedSimpleTypeHasRequestedRawClass() throws Exception {
        JavaType type = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
        assertSame(String.class, type.getRawClass());
    }

    @Test
    public void testConstructParametrizedTypePreservesCollectionParameter() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType type = factory.constructParametrizedType(
                ArrayList.class, List.class, String.class);
        assertSame(ArrayList.class, type.getRawClass());
        assertSame(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testRawCollectionLikeTypeUsesObjectContent() throws Exception {
        CollectionLikeType type = TypeFactory.defaultInstance()
                .constructRawCollectionLikeType(Iterable.class);
        assertSame(Iterable.class, type.getRawClass());
        assertSame(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testRawMapTypeUsesObjectKeyAndValue() throws Exception {
        MapType type = TypeFactory.defaultInstance().constructRawMapType(HashMap.class);
        assertSame(HashMap.class, type.getRawClass());
        assertSame(Object.class, type.getKeyType().getRawClass());
        assertSame(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testRawMapLikeTypeUsesObjectKeyAndValue() throws Exception {
        MapLikeType type = TypeFactory.defaultInstance().constructRawMapLikeType(Map.Entry.class);
        assertSame(Map.Entry.class, type.getRawClass());
        assertSame(Object.class, type.getKeyType().getRawClass());
        assertSame(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testTypeParserWithFactoryAndParsingCanonicalType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        TypeParser parser = new TypeParser(factory);
        assertSame(parser, parser.withFactory(factory));
        assertSame(String.class, parser.parse("java.lang.String").getRawClass());
    }

    @Test
    public void testTokenizerTracksInputAndRemainingText() throws Exception {
        TypeParser.MyTokenizer tokens = new TypeParser.MyTokenizer("abc,def");
        assertTrue(tokens.hasMoreTokens());
        assertEquals("abc", tokens.nextToken());
        assertEquals(",def", tokens.getRemainingInput());
        assertEquals("abc,def", tokens.getAllInput());
        assertTrue(tokens.hasMoreTokens());
    }

    @Test
    public void testTokenizerPushBackToken() throws Exception {
        TypeParser.MyTokenizer tokens = new TypeParser.MyTokenizer("x,y");
        assertEquals("x", tokens.nextToken());
        tokens.pushBack("x");
        assertTrue(tokens.hasMoreTokens());
        assertEquals("x", tokens.nextToken());
        assertEquals(",", tokens.nextToken());
        assertEquals("y", tokens.nextToken());
        assertFalse(tokens.hasMoreTokens());
    }
}
