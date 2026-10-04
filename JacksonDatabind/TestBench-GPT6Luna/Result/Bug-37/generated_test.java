package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import com.fasterxml.jackson.databind.JavaType;

public class SimpleTypeTest {
    @Test
    public void testConstructUnsafeReportsRawClass() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructAcceptsSimpleClass() throws Exception {
        SimpleType type = SimpleType.construct(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructRejectsMap() throws Exception {
        try {
            SimpleType.construct(Map.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConstructRejectsCollection() throws Exception {
        try {
            SimpleType.construct(Collection.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testConstructRejectsArray() throws Exception {
        try {
            SimpleType.construct(String[].class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithContentTypeRejectsSimpleType() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        try {
            type.withContentType(type);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithContentTypeHandlerRejectsSimpleType() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        try {
            type.withContentTypeHandler(new Object());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithContentValueHandlerRejectsSimpleType() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        try {
            type.withContentValueHandler(new Object());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithTypeHandlerSameReferenceReturnsSameInstance() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertSame(type, type.withTypeHandler(null));
    }

    @Test
    public void testWithTypeHandlerSetsHandler() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object handler = new Object();
        SimpleType changed = type.withTypeHandler(handler);
        assertSame(handler, changed.getTypeHandler());
        assertNull(type.getTypeHandler());
    }

    @Test
    public void testWithValueHandlerSameReferenceReturnsSameInstance() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertSame(type, type.withValueHandler(null));
    }

    @Test
    public void testWithValueHandlerSetsHandler() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object handler = new Object();
        SimpleType changed = type.withValueHandler(handler);
        assertSame(handler, changed.getValueHandler());
        assertNull(type.getValueHandler());
    }

    @Test
    public void testWithStaticTypingReturnsStaticCopy() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        SimpleType changed = type.withStaticTyping();
        assertNotSame(type, changed);
        assertSame(changed, changed.withStaticTyping());
    }

    @Test
    public void testRefineReturnsNull() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNull(type.refine(String.class, TypeBindings.emptyBindings(), null, null));
    }

    @Test
    public void testSimpleTypeIsNotContainer() throws Exception {
        assertFalse(SimpleType.constructUnsafe(String.class).isContainerType());
    }

    @Test
    public void testErasedSignatureForString() throws Exception {
        StringBuilder sb = new StringBuilder();
        assertSame(sb, SimpleType.constructUnsafe(String.class).getErasedSignature(sb));
        assertEquals("Ljava/lang/String;", sb.toString());
    }

    @Test
    public void testGenericSignatureForString() throws Exception {
        StringBuilder sb = new StringBuilder();
        assertSame(sb, SimpleType.constructUnsafe(String.class).getGenericSignature(sb));
        assertEquals("Ljava/lang/String;", sb.toString());
    }

    @Test
    public void testToStringForString() throws Exception {
        assertEquals("[simple type, class java.lang.String]",
                SimpleType.constructUnsafe(String.class).toString());
    }

    @Test
    public void testEqualTypesHaveEqualHashCodes() throws Exception {
        SimpleType first = SimpleType.constructUnsafe(String.class);
        SimpleType second = SimpleType.constructUnsafe(String.class);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testDifferentRawTypesAreNotEqual() throws Exception {
        assertNotEquals(SimpleType.constructUnsafe(String.class),
                SimpleType.constructUnsafe(Integer.class));
    }

    @Test
    public void testNotEqualToNullOrOtherClass() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.equals(null));
        assertFalse(type.equals("not a type"));
    }
}
