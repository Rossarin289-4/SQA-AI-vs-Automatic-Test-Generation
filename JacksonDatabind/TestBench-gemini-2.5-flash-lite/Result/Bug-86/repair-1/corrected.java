package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;
import java.util.List;
import java.util.ArrayList;

public class ResolvedRecursiveTypeTest {
    // Helper method to create a SimpleType for testing
    private JavaType createSimpleType(Class<?> cls) {
        // SimpleType constructor that takes Class<?> only.
        return new SimpleType(cls);
    }

    @Test
    public void testSetReferenceAndGetSelfReferencedType() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType dummyType = createSimpleType(String.class);
        rrt.setReference(dummyType);
        assertSame(dummyType, rrt.getSelfReferencedType());
    }

    @Test
    public void testGetSuperClassWhenReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType = createSimpleType(String.class);
        // SimpleType(String.class) has Object.class as its superclass
        JavaType superType = referencedType.getSuperClass();
        rrt.setReference(referencedType);
        assertEquals(superType, rrt.getSuperClass());
    }

    @Test
    public void testGetSuperClassWhenNotReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        // Default super class for Object.class is null.
        assertNull(rrt.getSuperClass());
    }

    @Test
    public void testGetGenericSignatureWhenReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType = createSimpleType(String.class);
        rrt.setReference(referencedType);
        StringBuilder sb = new StringBuilder();
        assertEquals(referencedType.getGenericSignature(sb), rrt.getGenericSignature(sb));
    }

    @Test
    public void testGetErasedSignatureWhenReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType = createSimpleType(String.class);
        rrt.setReference(referencedType);
        StringBuilder sb = new StringBuilder();
        assertEquals(referencedType.getErasedSignature(sb), rrt.getErasedSignature(sb));
    }

    @Test
    public void testWithContentType() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType contentType = createSimpleType(Integer.class);
        JavaType result = rrt.withContentType(contentType);
        // ResolvedRecursiveType should return itself for withContentType
        assertSame(rrt, result);
        // The referenced type should not be affected
        assertNull(rrt.getSelfReferencedType());
    }

    @Test
    public void testWithTypeHandler() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        Object handler = new Object();
        JavaType result = rrt.withTypeHandler(handler);
        // ResolvedRecursiveType should return itself for withTypeHandler
        assertSame(rrt, result);
        // The referenced type should not be affected
        assertNull(rrt.getSelfReferencedType());
    }

    @Test
    public void testWithContentTypeHandler() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        Object handler = new Object();
        JavaType result = rrt.withContentTypeHandler(handler);
        // ResolvedRecursiveType should return itself for withContentTypeHandler
        assertSame(rrt, result);
        // The referenced type should not be affected
        assertNull(rrt.getSelfReferencedType());
    }

    @Test
    public void testWithValueHandler() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        Object handler = new Object();
        JavaType result = rrt.withValueHandler(handler);
        // ResolvedRecursiveType should return itself for withValueHandler
        assertSame(rrt, result);
        // The referenced type should not be affected
        assertNull(rrt.getSelfReferencedType());
    }

    @Test
    public void testWithContentValueHandler() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        Object handler = new Object();
        JavaType result = rrt.withContentValueHandler(handler);
        // ResolvedRecursiveType should return itself for withContentValueHandler
        assertSame(rrt, result);
        // The referenced type should not be affected
        assertNull(rrt.getSelfReferencedType());
    }

    @Test
    public void testWithStaticTyping() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType result = rrt.withStaticTyping();
        // ResolvedRecursiveType should return itself for withStaticTyping
        assertSame(rrt, result);
        // The referenced type should not be affected
        assertNull(rrt.getSelfReferencedType());
    }

    @Test
    public void testRefineWhenReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType = createSimpleType(String.class);
        rrt.setReference(referencedType);

        Class<?> rawType = String.class;
        TypeBindings bindings = TypeBindings.create(rawType, List.of(createSimpleType(Integer.class)));
        JavaType superClass = createSimpleType(Object.class);
        JavaType[] superInterfaces = new JavaType[]{ createSimpleType(Runnable.class) };

        JavaType result = rrt.refine(rawType, bindings, superClass, superInterfaces);
        // refine should return null for ResolvedRecursiveType
        assertNull(result);
    }

    @Test
    public void testRefineWhenNotReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());

        Class<?> rawType = String.class;
        TypeBindings bindings = TypeBindings.create(rawType, List.of(createSimpleType(Integer.class)));
        JavaType superClass = createSimpleType(Object.class);
        JavaType[] superInterfaces = new JavaType[]{ createSimpleType(Runnable.class) };

        JavaType result = rrt.refine(rawType, bindings, superClass, superInterfaces);
        // refine should return null for ResolvedRecursiveType
        assertNull(result);
    }

    @Test
    public void testIsContainerType() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertFalse(rrt.isContainerType());
    }

    @Test
    public void testToStringWhenUnresolved() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertTrue(rrt.toString().contains("[recursive type; UNRESOLVED"));
    }

    @Test
    public void testToStringWhenResolved() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType = createSimpleType(String.class);
        rrt.setReference(referencedType);
        assertTrue(rrt.toString().contains("[recursive type; " + String.class.getName()));
    }

    @Test
    public void testEqualsWhenSameInstance() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertTrue(rrt.equals(rrt));
    }

    @Test
    public void testEqualsWhenDifferentInstanceSameReference() throws Exception {
        ResolvedRecursiveType rrt1 = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType = createSimpleType(String.class);
        rrt1.setReference(referencedType);

        ResolvedRecursiveType rrt2 = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        rrt2.setReference(referencedType);

        assertTrue(rrt1.equals(rrt2));
    }

    @Test
    public void testEqualsWhenDifferentReference() throws Exception {
        ResolvedRecursiveType rrt1 = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType1 = createSimpleType(String.class);
        rrt1.setReference(referencedType1);

        ResolvedRecursiveType rrt2 = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType2 = createSimpleType(Integer.class);
        rrt2.setReference(referencedType2);

        assertFalse(rrt1.equals(rrt2));
    }

    @Test
    public void testEqualsWhenUnresolved() throws Exception {
        ResolvedRecursiveType rrt1 = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType rrt2 = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertFalse(rrt1.equals(rrt2)); // Unresolved references should not match
    }

    @Test
    public void testEqualsWithNull() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertFalse(rrt.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        SimpleType st = new SimpleType(String.class);
        assertFalse(rrt.equals(st));
    }

    @Test
    public void testSetReferenceMultipleTimesThrowsException() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType dummyType1 = createSimpleType(String.class);
        JavaType dummyType2 = createSimpleType(Integer.class);
        rrt.setReference(dummyType1);
        try {
            rrt.setReference(dummyType2);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("Trying to re-set self reference"));
        }
    }

    @Test
    public void testGetSelfReferencedTypeWhenUnresolved() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertNull(rrt.getSelfReferencedType());
    }

    @Test
    public void testToStringWhenResolvedWithGeneric() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        TypeBindings bindings = TypeBindings.create(List.class, createSimpleType(String.class));
        // Use SimpleType(Class<?>) constructor for simplicity
        JavaType referencedType = new SimpleType(List.class, bindings, null, null, false);
        rrt.setReference(referencedType);
        assertTrue(rrt.toString().contains("[recursive type; " + List.class.getName()));
    }

    @Test
    public void testGetRawClass() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertEquals(Object.class, rrt.getRawClass());
    }

    @Test
    public void testHasContentTypeWhenNotReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertFalse(rrt.hasContentType());
    }

    @Test
    public void testHasContentTypeWhenReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        // Use SimpleType(Class<?>) constructor
        JavaType referencedType = new SimpleType(List.class, TypeBindings.create(List.class, createSimpleType(String.class)), null, null, false);
        rrt.setReference(referencedType);
        // A list has a content type, so the recursive type should also report it.
        assertTrue(rrt.hasContentType());
    }

    @Test
    public void testContainedTypeCountWhenNotReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        assertEquals(0, rrt.containedTypeCount());
    }

    @Test
    public void testContainedTypeCountWhenReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType = new SimpleType(List.class, TypeBindings.create(List.class, createSimpleType(String.class)), null, null, false);
        rrt.setReference(referencedType);
        // A list with one type parameter has one contained type.
        assertEquals(1, rrt.containedTypeCount());
    }

    @Test
    public void testContainedTypeWhenReferenced() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType contentType = createSimpleType(String.class);
        JavaType referencedType = new SimpleType(List.class, TypeBindings.create(List.class, contentType), null, null, false);
        rrt.setReference(referencedType);
        assertEquals(contentType, rrt.containedType(0));
    }

    @Test
    public void testGetSuperClassWhenReferencedString() throws Exception {
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        JavaType referencedType = createSimpleType(String.class);
        JavaType superClass = referencedType.getSuperClass(); // Object.class for String
        rrt.setReference(referencedType);
        assertEquals(superClass, rrt.getSuperClass());
    }

    @Test
    public void testEqualsWhenDifferentReferenceDifferentClasses() throws Exception {
        ResolvedRecursiveType rrt1 = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType1 = createSimpleType(String.class);
        rrt1.setReference(referencedType1);

        ResolvedRecursiveType rrt2 = new ResolvedRecursiveType(Object.class, TypeBindings.emptyBindings());
        JavaType referencedType2 = createSimpleType(Integer.class);
        rrt2.setReference(referencedType2);

        assertFalse(rrt1.equals(rrt2));
    }
}
