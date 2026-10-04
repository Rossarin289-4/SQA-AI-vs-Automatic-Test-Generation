package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;

import java.util.Collections;
import java.util.List;

public class ReferenceTypeTest {
    @Test
    public void testUpgradeFromWithNullBaseType() throws Exception {
        try {
            ReferenceType.upgradeFrom(null, SimpleType.construct(String.class));
            fail("Expected IllegalArgumentException for null baseType");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testUpgradeFromWithNullReferencedType() throws Exception {
        try {
            ReferenceType.upgradeFrom(SimpleType.construct(String.class), null);
            fail("Expected IllegalArgumentException for null referencedType");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testUpgradeFromWithSimpleType() throws Exception {
        JavaType baseType = SimpleType.construct(Object.class);
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.upgradeFrom(baseType, referencedType);

        assertNotNull(refType);
        assertEquals(Object.class, refType.getRawClass());
        assertEquals(referencedType, refType.getContentType());
        assertEquals(refType, refType.getAnchorType()); // Anchor type should be self
        assertTrue(refType.isAnchorType());
    }


    @Test
    public void testWithContentType() throws Exception {
        JavaType initialRefType = SimpleType.construct(String.class);
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, initialRefType);

        JavaType newContentType = SimpleType.construct(Integer.class);
        ReferenceType modifiedRefType = (ReferenceType) originalRefType.withContentType(newContentType);

        assertNotNull(modifiedRefType);
        assertNotSame(originalRefType, modifiedRefType);
        assertEquals(Object.class, modifiedRefType.getRawClass());
        assertEquals(newContentType, modifiedRefType.getContentType());
        // Note: Hash code comparison is tricky with JavaType as it might be computed lazily or based on internal state.
        // Focusing on structural equality check for content type.
        assertNotEquals(originalRefType.getContentType(), modifiedRefType.getContentType()); 

        // Ensure original object is not modified
        assertEquals(initialRefType, originalRefType.getContentType());
    }

    @Test
    public void testWithContentTypeSameAsExisting() throws Exception {
        JavaType initialRefType = SimpleType.construct(String.class);
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, initialRefType);

        ReferenceType modifiedRefType = (ReferenceType) originalRefType.withContentType(initialRefType);

        assertNotNull(modifiedRefType);
        assertSame(originalRefType, modifiedRefType); // Should return same instance if content type is the same
    }

    @Test
    public void testWithTypeHandler() throws Exception {
        Object handler = "myHandler";
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, SimpleType.construct(String.class));
        ReferenceType modifiedRefType = originalRefType.withTypeHandler(handler);

        assertNotNull(modifiedRefType);
        assertNotSame(originalRefType, modifiedRefType);
        assertEquals(handler, modifiedRefType.getTypeHandler());

        // Ensure original object is not modified
        assertNull(originalRefType.getTypeHandler());
    }

    @Test
    public void testWithTypeHandlerSameAsExisting() throws Exception {
        Object handler = "myHandler";
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, SimpleType.construct(String.class))
                .withTypeHandler(handler);
        ReferenceType modifiedRefType = originalRefType.withTypeHandler(handler);

        assertNotNull(modifiedRefType);
        assertSame(originalRefType, modifiedRefType); // Should return same instance if handler is the same
    }

    @Test
    public void testWithContentTypeHandler() throws Exception {
        Object handler = "myContentTypeHandler";
        JavaType initialRefType = SimpleType.construct(String.class);
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, initialRefType);
        ReferenceType modifiedRefType = originalRefType.withContentTypeHandler(handler);

        assertNotNull(modifiedRefType);
        assertNotSame(originalRefType, modifiedRefType);
        assertEquals(handler, modifiedRefType.getContentType().getTypeHandler());

        // Ensure original object is not modified
        assertNull(originalRefType.getContentType().getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandlerSameAsExisting() throws Exception {
        Object handler = "myContentTypeHandler";
        JavaType initialRefType = SimpleType.construct(String.class).withTypeHandler(handler);
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, initialRefType);
        ReferenceType modifiedRefType = originalRefType.withContentTypeHandler(handler);

        assertNotNull(modifiedRefType);
        assertSame(originalRefType, modifiedRefType); // Should return same instance if handler is the same
    }


    @Test
    public void testWithValueHandler() throws Exception {
        Object handler = "myValueHandler";
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, SimpleType.construct(String.class));
        ReferenceType modifiedRefType = originalRefType.withValueHandler(handler);

        assertNotNull(modifiedRefType);
        assertNotSame(originalRefType, modifiedRefType);
        assertEquals(handler, modifiedRefType.getValueHandler());

        // Ensure original object is not modified
        assertNull(originalRefType.getValueHandler());
    }

    @Test
    public void testWithValueHandlerSameAsExisting() throws Exception {
        Object handler = "myValueHandler";
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, SimpleType.construct(String.class))
                .withValueHandler(handler);
        ReferenceType modifiedRefType = originalRefType.withValueHandler(handler);

        assertNotNull(modifiedRefType);
        assertSame(originalRefType, modifiedRefType); // Should return same instance if handler is the same
    }

    @Test
    public void testWithContentValueHandler() throws Exception {
        Object handler = "myContentValueHandler";
        JavaType initialRefType = SimpleType.construct(String.class);
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, initialRefType);
        ReferenceType modifiedRefType = originalRefType.withContentValueHandler(handler);

        assertNotNull(modifiedRefType);
        assertNotSame(originalRefType, modifiedRefType);
        assertEquals(handler, modifiedRefType.getContentType().getValueHandler());

        // Ensure original object is not modified
        assertNull(originalRefType.getContentType().getValueHandler());
    }

    @Test
    public void testWithContentValueHandlerSameAsExisting() throws Exception {
        Object handler = "myContentValueHandler";
        JavaType initialRefType = SimpleType.construct(String.class).withValueHandler(handler);
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, initialRefType);
        ReferenceType modifiedRefType = originalRefType.withContentValueHandler(handler);

        assertNotNull(modifiedRefType);
        assertSame(originalRefType, modifiedRefType); // Should return same instance if handler is the same
    }



    @Test
    public void testWithStaticTypingAlreadyStatic() throws Exception {
        ReferenceType originalRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, SimpleType.construct(String.class))
                .withStaticTyping();
        ReferenceType modifiedRefType = originalRefType.withStaticTyping();

        assertNotNull(modifiedRefType);
        assertSame(originalRefType, modifiedRefType); // Should return same instance if already static
    }


    @Test
    public void testGetContentType() throws Exception {
        JavaType referencedType = SimpleType.construct(List.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        assertEquals(referencedType, refType.getContentType());
    }

    @Test
    public void testGetReferencedType() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        assertEquals(referencedType, refType.getReferencedType());
    }

    @Test
    public void testHasContentTypeTrue() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        assertTrue(refType.hasContentType());
    }

    @Test
    public void testIsReferenceTypeTrue() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        assertTrue(refType.isReferenceType());
    }

    @Test
    public void testGetErasedSignature() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        StringBuilder sb = new StringBuilder();
        refType.getErasedSignature(sb);
        // Expected: L<raw_class_name>; (without generics)
        // For Object, it would be Ljava.lang.Object;
        assertTrue(sb.toString().startsWith("Ljava/lang/Object;"));
    }

    @Test
    public void testGetGenericSignature() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        StringBuilder sb = new StringBuilder();
        refType.getGenericSignature(sb);
        // Expected: L<raw_class_name>;<generic_signature>;
        // For Object<String>, it would be Ljava.lang.Object<Ljava.lang.String;>;
        assertTrue(sb.toString().startsWith("Ljava/lang/Object<"));
        assertTrue(sb.toString().contains("Ljava/lang/String;>;"));
    }

    @Test
    public void testGetAnchorType() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        assertEquals(refType, refType.getAnchorType());
    }

    @Test
    public void testIsAnchorTypeTrue() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        assertTrue(refType.isAnchorType());
    }

    @Test
    public void testToString() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        String toString = refType.toString();
        assertTrue(toString.contains("[reference type"));
        assertTrue(toString.contains("class java.lang.Object<java.lang.String>"));
    }

    @Test
    public void testEqualsWithSelf() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        assertTrue(refType.equals(refType));
    }

    @Test
    public void testEqualsWithNull() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        assertFalse(refType.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        SimpleType other = SimpleType.construct(Object.class);
        assertFalse(refType.equals(other));
    }

    @Test
    public void testEqualsWithDifferentReferencedType() throws Exception {
        JavaType referencedType1 = SimpleType.construct(String.class);
        ReferenceType refType1 = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType1);

        JavaType referencedType2 = SimpleType.construct(Integer.class);
        ReferenceType refType2 = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType2);

        assertFalse(refType1.equals(refType2));
    }

    @Test
    public void testEqualsWithSameReferencedType() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType1 = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        ReferenceType refType2 = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);

        assertTrue(refType1.equals(refType2));
    }

     @Test
    public void testEqualsWithDifferentClassButSameReferencedType() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType1 = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        ReferenceType refType2 = ReferenceType.construct(
                String.class, TypeBindings.emptyBindings(), null, null, referencedType); // Different raw class

        assertFalse(refType1.equals(refType2));
    }


    @Test
    public void testBuildCanonicalName() throws Exception {
        JavaType referencedType = SimpleType.construct(String.class);
        ReferenceType refType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, referencedType);
        assertEquals("java.lang.Object<java.lang.String>", refType.buildCanonicalName());
    }

    @Test
    public void testBuildCanonicalNameWithNestedReference() throws Exception {
        JavaType innerReferencedType = SimpleType.construct(String.class);
        ReferenceType innerRefType = ReferenceType.construct(
                List.class, TypeBindings.emptyBindings(), null, null, innerReferencedType);

        ReferenceType outerRefType = ReferenceType.construct(
                Object.class, TypeBindings.emptyBindings(), null, null, innerRefType);
        assertEquals("java.lang.Object<java.util.List<java.lang.String>>", outerRefType.buildCanonicalName());
    }
}

