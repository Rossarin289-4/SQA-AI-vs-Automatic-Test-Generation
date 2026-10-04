package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import com.fasterxml.jackson.databind.JavaType;

public class SimpleTypeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructUnsafeCreatesNonContainer() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertTrue(type.hasRawClass(String.class));
        assertFalse(type.isContainerType());
    }

    @Test
    public void testConstructUnsafeForPrimitive() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(int.class);
        assertTrue(type.hasRawClass(int.class));
        assertFalse(type.isContainerType());
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
            SimpleType.construct(List.class);
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
    public void testConstructSimpleClass() throws Exception {
        SimpleType type = SimpleType.construct(String.class);
        assertTrue(type.hasRawClass(String.class));
        assertFalse(type.isContainerType());
    }

    @Test
    public void testWithContentTypeRejectsContent() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        try {
            type.withContentType(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithContentTypeHandlerRejectsHandler() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        try {
            type.withContentTypeHandler(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithContentValueHandlerRejectsHandler() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        try {
            type.withContentValueHandler(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testWithTypeHandlerSameReferenceReturnsSameType() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object handler = new Object();
        SimpleType result = type.withTypeHandler(handler);
        assertSame(handler, result.getTypeHandler());
    }

    @Test
    public void testWithTypeHandlerNullOnInitiallyNullHandler() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertSame(type, type.withTypeHandler(null));
    }

    @Test
    public void testWithValueHandlerSameReferenceReturnsSameType() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        Object handler = new Object();
        SimpleType result = type.withValueHandler(handler);
        assertSame(handler, result.getValueHandler());
    }

    @Test
    public void testWithValueHandlerNullOnInitiallyNullHandler() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertSame(type, type.withValueHandler(null));
    }

    @Test
    public void testWithStaticTypingSetsStaticFlag() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNotSame(type, type.withStaticTyping());
    }

    @Test
    public void testWithStaticTypingIsIdempotent() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class).withStaticTyping();
        assertSame(type, type.withStaticTyping());
    }

    @Test
    public void testRefineReturnsNull() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNull(type.refine(String.class, TypeBindings.emptyBindings(), null, null));
    }

    @Test
    public void testErasedSignatureForString() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        assertSame(sb, type.getErasedSignature(sb));
        assertEquals("Ljava/lang/String;", sb.toString());
    }

    @Test
    public void testGenericSignatureForString() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        StringBuilder sb = new StringBuilder();
        assertSame(sb, type.getGenericSignature(sb));
        assertEquals("Ljava/lang/String;", sb.toString());
    }

    @Test
    public void testToStringUsesCanonicalClassName() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertEquals("[simple type, class java.lang.String]", type.toString());
    }

    @Test
    public void testEqualsForSameRawClass() throws Exception {
        SimpleType first = SimpleType.constructUnsafe(String.class);
        SimpleType second = SimpleType.constructUnsafe(String.class);
        assertEquals(first, second);
    }

    @Test
    public void testNotEqualsForDifferentRawClasses() throws Exception {
        SimpleType first = SimpleType.constructUnsafe(String.class);
        SimpleType second = SimpleType.constructUnsafe(Integer.class);
        assertNotEquals(first, second);
    }

    @Test
    public void testEqualsRejectsNullAndOtherClass() throws Exception {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertFalse(type.equals(null));
        assertFalse(type.equals("not a type"));
    }
}
