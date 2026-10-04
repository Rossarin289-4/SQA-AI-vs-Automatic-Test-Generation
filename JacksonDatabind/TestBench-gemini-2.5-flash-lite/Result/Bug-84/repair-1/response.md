```java
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.TypeBindings;

import java.util.Collections;
import java.util.List;

public class ResolvedRecursiveTypeTest {

    @Test
    public void testConstructorAndInitialState() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        assertNotNull(rrt);
        assertNull(rrt.getSelfReferencedType());
        assertEquals(rawClass, rrt.getRawClass());
        assertEquals(bindings, rrt.getBindings());
        assertFalse(rrt.isContainerType());
    }

    @Test
    public void testSetReferenceAndGetSelfReferencedType() throws Exception {
        Class<?> rawClass = Integer.class;
        TypeBindings bindings = TypeBindings.create(rawClass, Collections.emptyList());
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        // Create a dummy JavaType to set as reference
        // A simple ResolvedRecursiveType can serve as a placeholder
        JavaType refType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings()); 
        rrt.setReference(refType);

        assertNotNull(rrt.getSelfReferencedType());
        assertEquals(refType, rrt.getSelfReferencedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReferenceTwiceThrowsException() throws Exception {
        Class<?> rawClass = Long.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        JavaType refType1 = new ResolvedRecursiveType(Boolean.class, TypeBindings.emptyBindings());
        rrt.setReference(refType1);

        JavaType refType2 = new ResolvedRecursiveType(Character.class, TypeBindings.emptyBindings());
        rrt.setReference(refType2); // Should throw IllegalStateException
    }

    @Test
    public void testGetSuperClassWhenReferenced() throws Exception {
        Class<?> rawClass = Object.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        // Create a dummy JavaType to use as a reference for superClass
        // Using ResolvedRecursiveType for simplicity, assuming it has a getSuperClass method
        JavaType superClassRef = new ResolvedRecursiveType(Number.class, TypeBindings.emptyBindings());
        rrt.setReference(superClassRef);

        assertNotNull(rrt.getSuperClass());
        assertEquals(superClassRef.getSuperClass(), rrt.getSuperClass());
    }

    @Test
    public void testGetSuperClassWhenUnreferenced() throws Exception {
        Class<?> rawClass = Object.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        // Should return the default superclass from TypeBase, which is null for Object.class
        assertNull(rrt.getSuperClass());
    }

    @Test
    public void testGetGenericSignatureWhenReferenced() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        // Create a dummy JavaType with generic parameters to test signature
        // For example, a List of String
        JavaType contentType = JavaType.class.equals(String.class) ? null : JavaType.class.equals(Integer.class) ? null : null; // Dummy type
        JavaType stringListType = TypeFactory.unknownType().containedType(0); // Placeholder for List<String>
        
        ResolvedRecursiveType refType = new ResolvedRecursiveType(List.class, TypeBindings.create(List.class, Collections.singletonList(JavaType.class)));
        rrt.setReference(refType);

        StringBuilder sb = new StringBuilder();
        rrt.getGenericSignature(sb);
        
        StringBuilder expectedSb = new StringBuilder();
        refType.getGenericSignature(expectedSb);

        assertEquals(expectedSb.toString(), sb.toString());
    }

    @Test
    public void testGetErasedSignatureWhenReferenced() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        // Create a dummy JavaType with generic parameters to test signature
        ResolvedRecursiveType refType = new ResolvedRecursiveType(List.class, TypeBindings.create(List.class, Collections.singletonList(JavaType.class)));
        rrt.setReference(refType);

        StringBuilder sb = new StringBuilder();
        rrt.getErasedSignature(sb);
        
        StringBuilder expectedSb = new StringBuilder();
        refType.getErasedSignature(expectedSb);

        assertEquals(expectedSb.toString(), sb.toString());
    }

    @Test
    public void testWithContentTypeReturnsThis() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        JavaType contentType = new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings());

        JavaType result = rrt.withContentType(contentType);
        assertSame(rrt, result); // Should return the same instance
    }

    @Test
    public void testWithTypeHandlerReturnsThis() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        Object handler = new Object();

        JavaType result = rrt.withTypeHandler(handler);
        assertSame(rrt, result); // Should return the same instance
    }

    @Test
    public void testWithContentTypeHandlerReturnsThis() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        Object handler = new Object();

        JavaType result = rrt.withContentTypeHandler(handler);
        assertSame(rrt, result); // Should return the same instance
    }

    @Test
    public void testWithValueHandlerReturnsThis() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        Object handler = new Object();

        JavaType result = rrt.withValueHandler(handler);
        assertSame(rrt, result); // Should return the same instance
    }

    @Test
    public void testWithContentValueHandlerReturnsThis() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        Object handler = new Object();

        JavaType result = rrt.withContentValueHandler(handler);
        assertSame(rrt, result); // Should return the same instance
    }

    @Test
    public void testWithStaticTypingReturnsThis() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        JavaType result = rrt.withStaticTyping();
        assertSame(rrt, result); // Should return the same instance
    }

    @Test
    public void testRefineReturnsNull() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        JavaType result = rrt.refine(String.class, TypeBindings.emptyBindings(), null, null);
        assertNull(result);
    }

    @Test
    public void testIsContainerTypeReturnsFalse() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        assertFalse(rrt.isContainerType());
    }

    @Test
    public void testToStringWhenUnresolved() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        String toString = rrt.toString();
        assertTrue(toString.contains("[recursive type; UNRESOLVED]"));
    }

    @Test
    public void testToStringWhenResolved() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        JavaType refType = new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings());
        rrt.setReference(refType);

        String toString = rrt.toString();
        assertTrue(toString.contains("[recursive type; "));
        assertTrue(toString.contains(Integer.class.getName()));
    }

    @Test
    public void testEqualsWithSameInstance() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        assertTrue(rrt.equals(rrt));
    }

    @Test
    public void testEqualsWithDifferentInstanceSameReference() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt1 = new ResolvedRecursiveType(rawClass, bindings);
        ResolvedRecursiveType rrt2 = new ResolvedRecursiveType(rawClass, bindings);

        JavaType refType = new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings());
        rrt1.setReference(refType);
        rrt2.setReference(refType);

        assertTrue(rrt1.equals(rrt2));
    }

    @Test
    public void testEqualsWithDifferentReference() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt1 = new ResolvedRecursiveType(rawClass, bindings);
        ResolvedRecursiveType rrt2 = new ResolvedRecursiveType(rawClass, bindings);

        JavaType refType1 = new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings());
        rrt1.setReference(refType1);

        JavaType refType2 = new ResolvedRecursiveType(Long.class, TypeBindings.emptyBindings());
        rrt2.setReference(refType2);

        assertFalse(rrt1.equals(rrt2));
    }

    @Test
    public void testEqualsWhenUnresolved() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt1 = new ResolvedRecursiveType(rawClass, bindings);
        ResolvedRecursiveType rrt2 = new ResolvedRecursiveType(rawClass, bindings);

        // Both unresolved, should not be equal according to equals method logic
        assertFalse(rrt1.equals(rrt2));
    }

    @Test
    public void testEqualsWithNull() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        assertFalse(rrt.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        JavaType refType = new ResolvedRecursiveType(Integer.class, TypeBindings.emptyBindings());
        rrt.setReference(refType);

        assertFalse(rrt.equals(refType)); // Comparing with a different type
    }

    @Test
    public void testToStringWithNullReference() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        String toString = rrt.toString();
        assertTrue(toString.contains("UNRESOLVED"));
    }
}
```