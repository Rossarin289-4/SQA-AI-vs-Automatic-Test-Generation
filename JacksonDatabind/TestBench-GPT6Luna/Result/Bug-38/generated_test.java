package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.TypeVariable;
import com.fasterxml.jackson.databind.JavaType;
import java.util.*;

public class CollectionTypeTest {
    @Test
    public void testConstructCollectionType() throws Exception {
        SimpleType element = SimpleType.constructUnsafe(String.class);
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, element);
        assertEquals(List.class, type.getRawClass());
        assertSame(element, type.getContentType());
        assertTrue(type.isContainerType());
    }

    @Test
    public void testContentTypeIdentityReturnsSameInstance() throws Exception {
        SimpleType element = SimpleType.constructUnsafe(String.class);
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, element);
        assertSame(type, type.withContentType(element));
    }

    @Test
    public void testContentTypeReplacement() throws Exception {
        SimpleType element = SimpleType.constructUnsafe(String.class);
        SimpleType replacement = SimpleType.constructUnsafe(Integer.class);
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, element);
        JavaType changed = type.withContentType(replacement);
        assertSame(replacement, changed.getContentType());
        assertSame(element, type.getContentType());
    }

    @Test
    public void testTypeHandlerIsRecorded() throws Exception {
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, SimpleType.constructUnsafe(String.class));
        Object handler = new Object();
        assertSame(handler, type.withTypeHandler(handler).getTypeHandler());
    }

    @Test
    public void testContentTypeHandlerIsRecorded() throws Exception {
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, SimpleType.constructUnsafe(String.class));
        Object handler = new Object();
        assertSame(handler, type.withContentTypeHandler(handler).getContentTypeHandler());
    }

    @Test
    public void testValueHandlerIsRecorded() throws Exception {
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, SimpleType.constructUnsafe(String.class));
        Object handler = new Object();
        assertSame(handler, type.withValueHandler(handler).getValueHandler());
    }

    @Test
    public void testContentValueHandlerIsRecorded() throws Exception {
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, SimpleType.constructUnsafe(String.class));
        Object handler = new Object();
        assertSame(handler, type.withContentValueHandler(handler).getContentValueHandler());
    }

    @Test
    public void testStaticTypingIsIdempotent() throws Exception {
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, SimpleType.constructUnsafe(String.class)).withStaticTyping();
        assertSame(type, type.withStaticTyping());
    }

    @Test
    public void testRefineUsesRequestedRawTypeAndElement() throws Exception {
        SimpleType element = SimpleType.constructUnsafe(String.class);
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, element);
        JavaType refined = type.refine(Set.class, TypeBindings.emptyBindings(), null, null);
        assertEquals(Set.class, refined.getRawClass());
        assertSame(element, refined.getContentType());
    }

    @Test
    public void testCollectionToString() throws Exception {
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, SimpleType.constructUnsafe(String.class));
        assertEquals("[collection type; class java.util.List, contains [simple type, class java.lang.String]]",
                type.toString());
    }

    @Test
    public void testMapKeyIdentityReturnsSameInstance() throws Exception {
        SimpleType key = SimpleType.constructUnsafe(String.class);
        MapType type = MapType.construct(Map.class, key, SimpleType.constructUnsafe(Integer.class));
        assertSame(type, type.withKeyType(key));
    }

    @Test
    public void testMapKeyReplacement() throws Exception {
        SimpleType key = SimpleType.constructUnsafe(String.class);
        SimpleType replacement = SimpleType.constructUnsafe(Integer.class);
        MapType type = MapType.construct(Map.class, key, SimpleType.constructUnsafe(Long.class));
        MapType changed = type.withKeyType(replacement);
        assertSame(replacement, changed.getKeyType());
        assertSame(key, type.getKeyType());
    }

    @Test
    public void testMapKeyTypeHandlerIsRecorded() throws Exception {
        MapType type = MapType.construct(Map.class, SimpleType.constructUnsafe(String.class),
                SimpleType.constructUnsafe(Integer.class));
        Object handler = new Object();
        assertSame(handler, type.withKeyTypeHandler(handler).getKeyType().getTypeHandler());
    }

    @Test
    public void testMapKeyValueHandlerIsRecorded() throws Exception {
        MapType type = MapType.construct(Map.class, SimpleType.constructUnsafe(String.class),
                SimpleType.constructUnsafe(Integer.class));
        Object handler = new Object();
        assertSame(handler, type.withKeyValueHandler(handler).getKeyType().getValueHandler());
    }

    @Test
    public void testUnsafeSimpleTypeUsesRawClass() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertEquals(String.class, type.getRawClass());
        assertFalse(type.isContainerType());
    }

    @Test
    public void testSimpleTypeIsNotContainer() throws Exception {
        assertFalse(SimpleType.constructUnsafe(int.class).isContainerType());
    }

    @Test
    public void testErasedSignatureOfString() throws Exception {
        StringBuilder result = SimpleType.constructUnsafe(String.class).getErasedSignature(new StringBuilder());
        assertEquals("Ljava/lang/String;", result.toString());
    }

    @Test
    public void testGenericSignatureOfString() throws Exception {
        StringBuilder result = SimpleType.constructUnsafe(String.class).getGenericSignature(new StringBuilder());
        assertEquals("Ljava/lang/String;", result.toString());
    }

    @Test
    public void testEqualUnsafeSimpleTypes() throws Exception {
        SimpleType first = SimpleType.constructUnsafe(String.class);
        SimpleType second = SimpleType.constructUnsafe(String.class);
        assertEquals(first, second);
    }

    @Test
    public void testDifferentUnsafeSimpleTypesAreNotEqual() throws Exception {
        SimpleType first = SimpleType.constructUnsafe(String.class);
        SimpleType second = SimpleType.constructUnsafe(Integer.class);
        assertNotEquals(first, second);
    }
}
