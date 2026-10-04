package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;

public class ReferenceTypeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructAndReferenceAccessors() throws Exception {
        JavaType content = SimpleType.construct(String.class);
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                content, null, null);
        assertSame(content, ref.getReferencedType());
        assertTrue(ref.isReferenceType());
        assertEquals(1, ref.containedTypeCount());
        assertSame(content, ref.containedType(0));
    }

    @Test
    public void testContainedTypeIndexBoundaries() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        assertSame(ref.getReferencedType(), ref.containedType(0));
        assertNull(ref.containedType(1));
        assertNull(ref.containedType(-1));
    }

    @Test
    public void testContainedTypeNameBoundaries() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        assertEquals("T", ref.containedTypeName(0));
        assertNull(ref.containedTypeName(1));
        assertNull(ref.containedTypeName(-1));
    }

    @Test
    public void testParameterSourceIsRawClass() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        assertSame(java.util.concurrent.atomic.AtomicReference.class, ref.getParameterSource());
    }

    @Test
    public void testErasedSignature() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        StringBuilder sb = new StringBuilder("prefix");
        StringBuilder result = ref.getErasedSignature(sb);
        assertSame(sb, result);
        assertEquals("prefixLjava/util/concurrent/atomic/AtomicReference;", result.toString());
    }

    @Test
    public void testGenericSignature() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        StringBuilder sb = new StringBuilder();
        assertSame(sb, ref.getGenericSignature(sb));
        assertEquals("Ljava/util/concurrent/atomic/AtomicReference<Ljava/lang/String;>;", sb.toString());
    }

    @Test
    public void testCanonicalAndDisplayString() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        assertEquals("[reference type, class java.util.concurrent.atomic.AtomicReference<java.lang.String[simple type, class java.lang.String]>]",
                ref.toString());
    }

    @Test
    public void testEqualsSameInstanceAndNull() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        assertTrue(ref.equals(ref));
        assertFalse(ref.equals(null));
    }

    @Test
    public void testEqualsUsesRawClassAndReferencedType() throws Exception {
        JavaType stringType = SimpleType.construct(String.class);
        ReferenceType first = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                stringType, null, null);
        ReferenceType same = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        ReferenceType differentContent = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(Integer.class), null, null);
        ReferenceType differentRaw = ReferenceType.construct(java.util.concurrent.atomic.AtomicReferenceArray.class,
                stringType, null, null);
        assertTrue(first.equals(same));
        assertFalse(first.equals(differentContent));
        assertFalse(first.equals(differentRaw));
        assertFalse(first.equals("not a type"));
    }

    @Test
    public void testWithTypeHandlerSameHandlerReturnsSameInstance() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        assertSame(ref, ref.withTypeHandler(null));
    }

    @Test
    public void testWithTypeHandlerChangesOnlyCopy() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        Object handler = new Object();
        ReferenceType changed = ref.withTypeHandler(handler);
        assertNotSame(ref, changed);
        assertSame(changed, changed.withTypeHandler(handler));
    }

    @Test
    public void testWithContentTypeHandlerSameHandlerReturnsSameInstance() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        assertSame(ref, ref.withContentTypeHandler(null));
    }

    @Test
    public void testWithContentTypeHandlerUpdatesReferencedType() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        Object handler = new Object();
        ReferenceType changed = ref.withContentTypeHandler(handler);
        assertNotSame(ref, changed);
        assertNotSame(ref.getReferencedType(), changed.getReferencedType());
        assertSame(changed, changed.withContentTypeHandler(handler));
    }

    @Test
    public void testWithValueHandlerSameHandlerReturnsSameInstance() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        assertSame(ref, ref.withValueHandler(null));
    }

    @Test
    public void testWithValueHandlerChangesCopy() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        Object handler = new Object();
        ReferenceType changed = ref.withValueHandler(handler);
        assertNotSame(ref, changed);
        assertSame(changed, changed.withValueHandler(handler));
    }

    @Test
    public void testWithContentValueHandlerSameHandlerReturnsSameInstance() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        assertSame(ref, ref.withContentValueHandler(null));
    }

    @Test
    public void testWithContentValueHandlerUpdatesReferencedType() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        Object handler = new Object();
        ReferenceType changed = ref.withContentValueHandler(handler);
        assertNotSame(ref, changed);
        assertNotSame(ref.getReferencedType(), changed.getReferencedType());
        assertSame(changed, changed.withContentValueHandler(handler));
    }

    @Test
    public void testWithStaticTypingReturnsTypedCopy() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        ReferenceType typed = ref.withStaticTyping();
        assertNotSame(ref, typed);
        assertSame(typed, typed.withStaticTyping());
        assertSame(ref.getReferencedType(), ref.getReferencedType());
    }

    @Test
    public void testEqualsIgnoresHandlers() throws Exception {
        ReferenceType ref = ReferenceType.construct(java.util.concurrent.atomic.AtomicReference.class,
                SimpleType.construct(String.class), null, null);
        ReferenceType withHandler = ref.withTypeHandler(new Object());
        assertTrue(ref.equals(withHandler));
    }
}
