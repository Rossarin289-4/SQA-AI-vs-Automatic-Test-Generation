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

public class JavaUtilCollectionsDeserializersTest {
    @Test
    public void testArraysAsListIsRecognized() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Arrays.asList(1, 2).getClass());
        assertNotNull(JavaUtilCollectionsDeserializers.findForCollection(null, type));
    }

    @Test
    public void testOrdinaryListIsNotRecognized() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(ArrayList.class);
        assertNull(JavaUtilCollectionsDeserializers.findForCollection(null, type));
    }

    @Test
    public void testOrdinaryMapIsNotRecognized() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(HashMap.class);
        assertNull(JavaUtilCollectionsDeserializers.findForMap(null, type));
    }

    @Test
    public void testSingletonListIsRecognized() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singletonList(1).getClass());
        assertNotNull(JavaUtilCollectionsDeserializers.findForCollection(null, type));
    }

    @Test
    public void testSingletonSetIsRecognized() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singleton(1).getClass());
        assertNotNull(JavaUtilCollectionsDeserializers.findForCollection(null, type));
    }

    @Test
    public void testUnmodifiableListIsRecognized() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(
                Collections.unmodifiableList(new ArrayList<Object>()).getClass());
        assertNotNull(JavaUtilCollectionsDeserializers.findForCollection(null, type));
    }

    @Test
    public void testUnmodifiableLinkedListAliasIsRecognized() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(
                Collections.unmodifiableList(new LinkedList<Object>()).getClass());
        assertNotNull(JavaUtilCollectionsDeserializers.findForCollection(null, type));
    }

    @Test
    public void testUnmodifiableSetIsRecognized() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(
                Collections.unmodifiableSet(new HashSet<Object>()).getClass());
        assertNotNull(JavaUtilCollectionsDeserializers.findForCollection(null, type));
    }

    @Test
    public void testSingletonMapIsRecognized() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(
                Collections.singletonMap("a", "b").getClass());
        assertNotNull(JavaUtilCollectionsDeserializers.findForMap(null, type));
    }

    @Test
    public void testUnmodifiableMapIsRecognized() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(
                Collections.unmodifiableMap(new HashMap<Object, Object>()).getClass());
        assertNotNull(JavaUtilCollectionsDeserializers.findForMap(null, type));
    }

    @Test
    public void testSingletonListDeserializerHasNoDelegateBeforeContextualization() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singletonList(1).getClass());
        JsonDeserializer<?> deser = JavaUtilCollectionsDeserializers.findForCollection(null, type);
        assertNull(((StdDelegatingDeserializer<?>) deser).getDelegatee());
    }

    @Test
    public void testSingletonListConverterReturnsNullForNull() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singletonList(1).getClass());
        Converter<Object, Object> converter =
                JavaUtilCollectionsDeserializers.converter(2, type, List.class);
        assertNull(converter.convert(null));
    }

    @Test
    public void testSingletonListConverterRejectsEmptyInput() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singletonList(1).getClass());
        Converter<Object, Object> converter =
                JavaUtilCollectionsDeserializers.converter(2, type, List.class);
        try {
            converter.convert(Collections.emptyList());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testSingletonListConverterRejectsMultipleElements() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singletonList(1).getClass());
        Converter<Object, Object> converter =
                JavaUtilCollectionsDeserializers.converter(2, type, List.class);
        try {
            converter.convert(Arrays.asList(1, 2));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testSingletonSetConverterRejectsEmptyInput() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singleton(1).getClass());
        Converter<Object, Object> converter =
                JavaUtilCollectionsDeserializers.converter(1, type, Set.class);
        try {
            converter.convert(Collections.emptySet());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testSingletonSetConverterRejectsMultipleElements() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singleton(1).getClass());
        Converter<Object, Object> converter =
                JavaUtilCollectionsDeserializers.converter(1, type, Set.class);
        try {
            converter.convert(new HashSet<Integer>(Arrays.asList(1, 2)));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testSingletonMapConverterRejectsEmptyInput() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singletonMap("a", "b").getClass());
        Converter<Object, Object> converter =
                JavaUtilCollectionsDeserializers.converter(3, type, Map.class);
        try {
            converter.convert(Collections.emptyMap());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testSingletonMapConverterRejectsMultipleEntries() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singletonMap("a", "b").getClass());
        Converter<Object, Object> converter =
                JavaUtilCollectionsDeserializers.converter(3, type, Map.class);
        Map<String, String> input = new HashMap<String, String>();
        input.put("a", "b");
        input.put("c", "d");
        try {
            converter.convert(input);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testUnmodifiableListConverterPreservesContents() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.unmodifiableList(
                new ArrayList<Object>()).getClass());
        Converter<Object, Object> converter =
                JavaUtilCollectionsDeserializers.converter(5, type, List.class);
        List<String> input = new ArrayList<String>(Arrays.asList("a", "b"));
        List<?> result = (List<?>) converter.convert(input);
        assertEquals(Arrays.asList("a", "b"), result);
    }

    @Test
    public void testAsListConverterReturnsSameInput() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Arrays.asList(1, 2).getClass());
        Converter<Object, Object> converter =
                JavaUtilCollectionsDeserializers.converter(7, type, List.class);
        List<Integer> input = Arrays.asList(1, 2);
        assertSame(input, converter.convert(input));
    }

    @Test
    public void testConverterInputAndOutputTypesMatchRequestedSupertype() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Collections.singletonList(1).getClass());
        Converter<Object, Object> converter =
                JavaUtilCollectionsDeserializers.converter(2, type, List.class);
        JavaType expected = type.findSuperType(List.class);
        TypeFactory factory = TypeFactory.defaultInstance();
        assertEquals(expected, converter.getInputType(factory));
        assertEquals(expected, converter.getOutputType(factory));
    }
}
