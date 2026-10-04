package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;

public class ResolvedRecursiveTypeTest {
    @Test
    public void testUnresolvedSelfReference() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertNull(type.getSelfReferencedType());
        assertEquals("[recursive type; UNRESOLVED", type.toString());
    }

    @Test
    public void testSetReferenceAndRetrieveSameReference() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType reference = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        type.setReference(reference);
        assertSame(reference, type.getSelfReferencedType());
    }

    @Test
    public void testCannotSetReferenceTwice() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        type.setReference(new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings()));
        try {
            type.setReference(null);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testResolvedToStringUsesReferencedRawClassName() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        type.setReference(new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings()));
        assertEquals("[recursive type; java.lang.String", type.toString());
    }

    @Test
    public void testEqualsSelfWhileUnresolved() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertTrue(type.equals(type));
    }

    @Test
    public void testDistinctUnresolvedTypesDoNotCompareEqual() throws Exception {
        ResolvedRecursiveType first = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType second = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertFalse(first.equals(second));
    }

    @Test
    public void testResolvedTypesCompareByReference() throws Exception {
        ResolvedRecursiveType first = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType second = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType reference = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        first.setReference(reference);
        second.setReference(reference);
        assertTrue(first.equals(second));
    }

    @Test
    public void testResolvedTypesWithDifferentReferencesAreUnequal() throws Exception {
        ResolvedRecursiveType first = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType second = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        first.setReference(new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings()));
        second.setReference(new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings()));
        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsNullIsFalse() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertFalse(type.equals(null));
    }

    @Test
    public void testGenericSignatureDelegatesToReference() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertSame(type, type.getGenericSignature(new StringBuilder("prefix")));
    }

    @Test
    public void testErasedSignatureDelegatesToReference() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertSame(type, type.getErasedSignature(new StringBuilder("prefix")));
    }

    @Test
    public void testSuperClassDelegatesAfterResolution() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType reference = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        type.setReference(reference);
        assertEquals(reference.getSuperClass(), type.getSuperClass());
    }

    @Test
    public void testSuperClassBeforeResolutionIsNull() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertNull(type.getSuperClass());
    }

    @Test
    public void testWithContentTypeReturnsSameInstance() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertSame(type, type.withContentType(null));
    }

    @Test
    public void testWithTypeHandlerReturnsSameInstance() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertSame(type, type.withTypeHandler("handler"));
    }

    @Test
    public void testWithContentTypeHandlerReturnsSameInstance() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertSame(type, type.withContentTypeHandler("handler"));
    }

    @Test
    public void testWithValueHandlerReturnsSameInstance() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertSame(type, type.withValueHandler("handler"));
    }

    @Test
    public void testWithContentValueHandlerReturnsSameInstance() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertSame(type, type.withContentValueHandler("handler"));
    }

    @Test
    public void testWithStaticTypingReturnsSameInstance() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertSame(type, type.withStaticTyping());
    }

    @Test
    public void testRefineReturnsNull() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertNull(type.refine(String.class, TypeBindings.emptyBindings(), null, null));
    }

    @Test
    public void testIsNotContainerType() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertFalse(type.isContainerType());
    }
}
