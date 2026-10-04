package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.TypeBindings;

import java.util.Collections;
import java.util.List;

public class ResolvedRecursiveTypeTest {

    // Helper to create a dummy JavaType for a given class
    private JavaType createDummyJavaType(Class<?> cls) {
        // Using ResolvedRecursiveType as a placeholder for JavaType as it's concrete and available
        // In a real scenario, TypeFactory would be used, but it's not available here.
        return new ResolvedRecursiveType(cls, TypeBindings.emptyBindings());
    }

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

        JavaType refType = createDummyJavaType(String.class);
        rrt.setReference(refType);

        assertNotNull(rrt.getSelfReferencedType());
        assertEquals(refType, rrt.getSelfReferencedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReferenceTwiceThrowsException() throws Exception {
        Class<?> rawClass = Long.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        JavaType refType1 = createDummyJavaType(Boolean.class);
        rrt.setReference(refType1);

        JavaType refType2 = createDummyJavaType(Character.class);
        rrt.setReference(refType2); // Should throw IllegalStateException
    }

    @Test
    public void testGetSuperClassWhenReferenced() throws Exception {
        Class<?> rawClass = Object.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        // Create a dummy JavaType to use as a reference for superClass
        // Assume Number.class has a superclass if we were using a real JavaType implementation
        JavaType superClassRef = createDummyJavaType(Number.class);
        rrt.setReference(superClassRef);

        // The getSuperClass() on dummy JavaType might not be accurate, but we test delegation
        // If superClassRef.getSuperClass() returns null, then this will assert null.
        // If it returns something, we assert that returned value.
        // For this test, we assume getSuperClass() on Number.class would return Object.class
        // but since we are using a dummy, we'll check against what the dummy returns.
        // A more robust test would mock or use a real JavaType implementation for this.
        // Given the constraint, we assert delegation.
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

        // Representing List<String>
        JavaType stringType = createDummyJavaType(String.class);
        TypeBindings listBindings = TypeBindings.create(List.class, Collections.singletonList(stringType));
        // Using ResolvedRecursiveType to create a placeholder for List<String>
        ResolvedRecursiveType refType = new ResolvedRecursiveType(List.class, listBindings);

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

        // Representing List<String>
        JavaType stringType = createDummyJavaType(String.class);
        TypeBindings listBindings = TypeBindings.create(List.class, Collections.singletonList(stringType));
        ResolvedRecursiveType refType = new ResolvedRecursiveType(List.class, listBindings);

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
        JavaType contentType = createDummyJavaType(Integer.class);

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

        JavaType refType = createDummyJavaType(Integer.class);
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

        JavaType refType = createDummyJavaType(Integer.class);
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

        JavaType refType1 = createDummyJavaType(Integer.class);
        rrt1.setReference(refType1);

        JavaType refType2 = createDummyJavaType(Long.class);
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

        JavaType refType = createDummyJavaType(Integer.class);
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
    
    // Added tests for edge cases and specific methods
    
    @Test
    public void test_getRawClass() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        assertEquals(rawClass, rrt.getRawClass());
    }

    @Test
    public void test_getBindings() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.create(rawClass, Collections.emptyList());
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        assertEquals(bindings, rrt.getBindings());
    }
    
    @Test
    public void test_isContainerType() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        assertFalse(rrt.isContainerType());
    }

    @Test
    public void test_getGenericSignature_empty_builder() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        StringBuilder sb = new StringBuilder();
        // When unresolved, getGenericSignature might delegate to super or throw,
        // but the source implies delegation to _referencedType.
        // If _referencedType is null, it will call super.getGenericSignature.
        // Superclass TypeBase has a protected _classSignature method.
        // We are testing the delegation path when referenced.
        // For now, let's test the unresolved case behavior with a dummy object.
        
        // Test when unresolved (delegates to super)
        StringBuilder expectedSbUnresolved = new StringBuilder();
        super.getGenericSignature(expectedSbUnresolved); // Assuming this method is accessible for testing or similar logic
        // Since we cannot call super directly from here, let's mock the behavior or rely on the fact that it delegates.
        // The base class implementation might call _classSignature, so we test that logic indirectly if possible.
        // For now, let's focus on the referenced case as the primary behavior.
        
        // Testing unresolved case behavior: it might call getGenericSignature of _referencedType which is null
        // In ResolvedRecursiveType, it calls _referencedType.getGenericSignature(sb). If _referencedType is null,
        // it should throw NPE or be handled by super.
        // Looking at TypeBase, it has a protected _classSignature.
        // The getGenericSignature in TypeBase is abstract.
        // ResolvedRecursiveType overrides it and calls _referencedType.getGenericSignature(sb).
        // If _referencedType is null, it should throw an NPE.
        // Let's add a test for that.
    }
    
    @Test(expected = NullPointerException.class) // Expecting NPE when _referencedType is null
    public void test_getGenericSignature_unresolved_throws_npe() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        StringBuilder sb = new StringBuilder();
        rrt.getGenericSignature(sb);
    }

    @Test(expected = NullPointerException.class) // Expecting NPE when _referencedType is null
    public void test_getErasedSignature_unresolved_throws_npe() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);
        StringBuilder sb = new StringBuilder();
        rrt.getErasedSignature(sb);
    }

    @Test
    public void test_getGenericSignature_resolved() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        // Create a mock JavaType for testing getGenericSignature delegation
        JavaType mockRefType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings()) {
            @Override
            public StringBuilder getGenericSignature(StringBuilder sb) {
                return sb.append("Ljava/lang/String;"); // Example signature
            }
            @Override
            public StringBuilder getErasedSignature(StringBuilder sb) {
                 return sb.append("Ljava/lang/String;"); // Example signature
            }
        };
        rrt.setReference(mockRefType);

        StringBuilder sb = new StringBuilder();
        rrt.getGenericSignature(sb);
        assertEquals("Ljava/lang/String;", sb.toString());
    }
    
    @Test
    public void test_getErasedSignature_resolved() throws Exception {
        Class<?> rawClass = String.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        ResolvedRecursiveType rrt = new ResolvedRecursiveType(rawClass, bindings);

        JavaType mockRefType = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings()) {
            @Override
            public StringBuilder getGenericSignature(StringBuilder sb) {
                return sb.append("Ljava/lang/String;"); // Example signature
            }
            @Override
            public StringBuilder getErasedSignature(StringBuilder sb) {
                 return sb.append("Ljava/lang/String;"); // Example signature
            }
        };
        rrt.setReference(mockRefType);

        StringBuilder sb = new StringBuilder();
        rrt.getErasedSignature(sb);
        assertEquals("Ljava/lang/String;", sb.toString());
    }

}
