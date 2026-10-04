```java
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;

public class ResolvedRecursiveTypeTest {
    @Test
    public void testUnresolvedReferenceAndString() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertNull(type.getSelfReferencedType());
        assertEquals("[recursive type; UNRESOLVED", type.toString());
    }

    @Test
    public void testReferenceAndStringUseRawClassName() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType reference = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        type.setReference(reference);
        assertSame(reference, type.getSelfReferencedType());
        assertEquals("[recursive type; " + String.class.getName(), type.toString());
    }

    @Test
    public void testCannotSetReferenceTwice() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        type.setReference(new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings()));
        try {
            type.setReference(new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings()));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertTrue(type.getSelfReferencedType().getRawClass() == String.class);
        }
    }

    @Test
    public void testUnresolvedTypeNotEqualToItselfCopy() throws Exception {
        ResolvedRecursiveType first = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType second = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertFalse(first.equals(second));
        assertTrue(first.equals(first));
    }

    @Test
    public void testResolvedTypesWithEqualReferencesAreEqual() throws Exception {
        ResolvedRecursiveType first = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType second = new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings());
        JavaType ref1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType ref2 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        first.setReference(ref1);
        second.setReference(ref2);
        assertTrue(first.equals(second));
    }

    @Test
    public void testResolvedTypeNotEqualToNullOrOtherType() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        type.setReference(new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings()));
        assertFalse(type.equals(null));
        assertFalse(type.equals(new Object()));
    }

    @Test
    public void testUnresolvedTypeIsNotContainer() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertFalse(type.isContainerType());
    }

    @Test
    public void testResolvedTypeIsNotContainer() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        type.setReference(new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings()));
        assertFalse(type.isContainerType());
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
    public void testErasedSignatureDelegatesToReference() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType reference = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        type.setReference(reference);
        StringBuilder actual = new StringBuilder("prefix");
        StringBuilder returned = type.getErasedSignature(actual);
        StringBuilder expected = new StringBuilder("prefix");
        reference.getErasedSignature(expected);
        assertSame(actual, returned);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testGenericSignatureDelegatesToReference() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType reference = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        type.setReference(reference);
        StringBuilder actual = new StringBuilder("prefix");
        StringBuilder returned = type.getGenericSignature(actual);
        StringBuilder expected = new StringBuilder("prefix");
        reference.getGenericSignature(expected);
        assertSame(actual, returned);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testSuperClassDelegatesToReference() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType reference = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        type.setReference(reference);
        assertSame(reference.getSuperClass(), type.getSuperClass());
    }

    @Test
    public void testUnresolvedSuperClassIsNullForObject() throws Exception {
        ResolvedRecursiveType type = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertNull(type.getSuperClass());
    }
}
```