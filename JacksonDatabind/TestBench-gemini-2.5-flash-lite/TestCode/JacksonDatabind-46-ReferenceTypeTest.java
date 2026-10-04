package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;

public class ReferenceTypeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }


    @Test
    public void testConstructWithValueHandler() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        Object handler = new Object();
        // The construct method internally sets valueHandler and typeHandler to null.
        // We must use withValueHandler after construction.
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertNotNull(refType);
        assertNull(refType.getValueHandler()); // Initially null
        
        // Now use withValueHandler
        ReferenceType updatedRefType = refType.withValueHandler(handler);
        assertEquals(handler, updatedRefType.getValueHandler());
    }

    @Test
    public void testConstructWithTypeHandler() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        Object handler = new Object();
        // The construct method internally sets valueHandler and typeHandler to null.
        // We must use withTypeHandler after construction.
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertNotNull(refType);
        assertNull(refType.getTypeHandler()); // Initially null

        // Now use withTypeHandler
        ReferenceType updatedRefType = refType.withTypeHandler(handler);
        assertEquals(handler, updatedRefType.getTypeHandler());
    }



    @Test
    public void testWithTypeHandler() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        Object handler = new Object();
        ReferenceType newRefType = refType.withTypeHandler(handler);
        assertNotNull(newRefType);
        assertEquals(handler, newRefType.getTypeHandler());
        assertNotSame(refType, newRefType);
    }

    @Test
    public void testWithTypeHandlerWhenSame() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        Object handler = new Object();
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null).withTypeHandler(handler); // Set handler during construction or via withTypeHandler
        ReferenceType newRefType = refType.withTypeHandler(handler);
        assertNotNull(newRefType);
        assertSame(refType, newRefType); // Should return the same instance if handler is the same
    }

    @Test
    public void testWithContentTypeHandler() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        Object handler = new Object();
        ReferenceType newRefType = refType.withContentTypeHandler(handler);
        assertNotNull(newRefType);
        // The content type handler is applied to the referenced type.
        assertEquals(handler, newRefType.getReferencedType().getTypeHandler());
        assertNotSame(refType, newRefType);
    }

    @Test
    public void testWithContentTypeHandlerWhenSame() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        Object handler = new Object();
        // To test the "same handler" case, the referenced type must already have this handler.
        JavaType referencedWithHandler = new SimpleType(String.class).withTypeHandler(handler);
        ReferenceType refType = new ReferenceType(Object.class, referencedWithHandler, null, null, false); // Directly constructing
        ReferenceType newRefType = refType.withContentTypeHandler(handler);
        assertNotNull(newRefType);
        assertSame(refType, newRefType); // Should return the same instance if handler is the same
    }

    @Test
    public void testWithValueHandler() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        Object handler = new Object();
        ReferenceType newRefType = refType.withValueHandler(handler);
        assertNotNull(newRefType);
        assertEquals(handler, newRefType.getValueHandler());
        assertNotSame(refType, newRefType);
    }

    @Test
    public void testWithValueHandlerWhenSame() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        Object handler = new Object();
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null).withValueHandler(handler); // Set handler
        ReferenceType newRefType = refType.withValueHandler(handler);
        assertNotNull(newRefType);
        assertSame(refType, newRefType); // Should return the same instance if handler is the same
    }

    @Test
    public void testWithContentValueHandler() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        Object handler = new Object();
        ReferenceType newRefType = refType.withContentValueHandler(handler);
        assertNotNull(newRefType);
        // The content value handler is applied to the referenced type.
        assertEquals(handler, newRefType.getReferencedType().getValueHandler());
        assertNotSame(refType, newRefType);
    }

    @Test
    public void testWithContentValueHandlerWhenSame() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        Object handler = new Object();
        // To test the "same handler" case, the referenced type must already have this handler.
        JavaType referencedWithHandler = new SimpleType(String.class).withValueHandler(handler);
        ReferenceType refType = new ReferenceType(Object.class, referencedWithHandler, null, null, false); // Directly constructing
        ReferenceType newRefType = refType.withContentValueHandler(handler);
        assertNotNull(newRefType);
        assertSame(refType, newRefType); // Should return the same instance if handler is the same
    }

    @Test
    public void testGetReferencedType() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertEquals(stringType, refType.getReferencedType());
    }

    @Test
    public void testIsReferenceType() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertTrue(refType.isReferenceType());
    }

    @Test
    public void testContainedTypeCount() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertEquals(1, refType.containedTypeCount());
    }

    @Test
    public void testContainedTypeValidIndex() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertEquals(stringType, refType.containedType(0));
    }

    @Test
    public void testContainedTypeInvalidIndex() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertNull(refType.containedType(1));
        assertNull(refType.containedType(-1));
    }

    @Test
    public void testContainedTypeNameValidIndex() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertEquals("T", refType.containedTypeName(0));
    }

    @Test
    public void testContainedTypeNameInvalidIndex() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertNull(refType.containedTypeName(1));
        assertNull(refType.containedTypeName(-1));
    }

    @Test
    public void testGetParameterSource() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Integer.class, stringType, null, null);
        assertEquals(Integer.class, refType.getParameterSource());
    }

    @Test
    public void testGetErasedSignature() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        StringBuilder sb = new StringBuilder();
        refType.getErasedSignature(sb);
        // Expected: "Ljava.lang.Object;"
        assertEquals("Ljava.lang.Object;", sb.toString());
    }

    @Test
    public void testGetGenericSignature() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        StringBuilder sb = new StringBuilder();
        refType.getGenericSignature(sb);
        // Expected: "Ljava.lang.Object<Ljava.lang.String;>;"
        assertEquals("Ljava.lang.Object<Ljava.lang.String;>;", sb.toString());
    }

    @Test
    public void testToString() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        String toString = refType.toString();
        // The toString output format can vary slightly, check for key parts.
        assertTrue(toString.contains("[reference type"));
        assertTrue(toString.contains("class java.lang.Object"));
        assertTrue(toString.contains("<java.lang.String>"));
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertTrue(refType.equals(refType));
    }

    @Test
    public void testEqualsNull() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertFalse(refType.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        ReferenceType otherRefType = ReferenceType.construct(Integer.class, stringType, null, null);
        assertFalse(refType.equals(otherRefType));
    }

    @Test
    public void testEqualsDifferentReferencedType() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        JavaType integerType = new SimpleType(Integer.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        ReferenceType otherRefType = ReferenceType.construct(Object.class, integerType, null, null);
        assertFalse(refType.equals(otherRefType));
    }

    @Test
    public void testEqualsSameType() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        ReferenceType otherRefType = ReferenceType.construct(Object.class, stringType, null, null);
        assertTrue(refType.equals(otherRefType));
    }

    @Test
    public void testNarrowBy() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        Class<?> subClass = String.class; // String is a subclass of Object
        JavaType narrowedType = refType.narrowBy(subClass); // This calls _narrow internally
        assertNotNull(narrowedType);
        assertEquals(subClass, narrowedType.getRawClass());
        assertTrue(narrowedType instanceof ReferenceType); // The type itself should remain ReferenceType
        assertEquals(stringType, ((ReferenceType) narrowedType).getReferencedType()); // Referenced type should be unchanged
    }

    @Test
    public void testNarrowContentsBy() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        Class<?> subContentType = CharSequence.class; // CharSequence is a supertype of String
        // The actual implementation of narrowContentsBy in SimpleType and its subclasses
        // needs to be considered. For ReferenceType, it delegates to the referenced type.
        // If the referenced type is SimpleType, it calls SimpleType.narrowContentsBy.
        // SimpleType.narrowContentsBy expects its own type parameters to be narrowed.
        // For ReferenceType, the referenced type is 'stringType', which is a SimpleType.
        // Calling narrowContentsBy on stringType with CharSequence would try to narrow String to CharSequence.
        // This should result in a new SimpleType with CharSequence as its raw type.
        JavaType narrowedType = refType.narrowContentsBy(subContentType);
        assertNotNull(narrowedType);
        assertTrue(narrowedType instanceof ReferenceType);
        assertEquals(subContentType, narrowedType.containedType(0).getRawClass());
        assertEquals(Object.class, narrowedType.getRawClass()); // Raw class should be unchanged
    }

    @Test
    public void testWidenBy() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(String.class, stringType, null, null);
        Class<?> superclass = Object.class; // Object is a supertype of String
        JavaType widenedType = refType.widenBy(superclass); // This calls _widen internally
        assertNotNull(widenedType);
        assertEquals(superclass, widenedType.getRawClass());
        assertTrue(widenedType instanceof ReferenceType);
        assertEquals(stringType, ((ReferenceType) widenedType).getReferencedType());
    }

    @Test
    public void testWidenContentsBy() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        Class<?> superContentType = Object.class; // Object is a supertype of String
        // Similar to narrowContentsBy, this delegates.
        // String.widenContentsBy(Object.class) would result in Object.
        JavaType widenedType = refType.widenContentsBy(superContentType);
        assertNotNull(widenedType);
        assertTrue(widenedType instanceof ReferenceType);
        assertEquals(superContentType, widenedType.containedType(0).getRawClass());
        assertEquals(Object.class, widenedType.getRawClass());
    }
}
