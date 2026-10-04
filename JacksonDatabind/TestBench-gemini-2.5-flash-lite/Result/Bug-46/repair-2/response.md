```java
package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;

public class ReferenceTypeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructBasic() throws Exception {
        JavaType stringType = new SimpleType(String.class); // Dummy JavaType for referenced type
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        assertNotNull(refType);
        assertEquals(Object.class, refType.getRawClass());
        assertEquals(stringType, refType.getReferencedType());
        // isStaticTyping() is a method of JavaType, and ReferenceType extends SimpleType which extends TypeBase, which implements JavaType.
        // It should be accessible.
        assertFalse(refType.isStaticTyping());
    }

    @Test
    public void testConstructWithValueHandler() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        Object handler = new Object();
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, handler, null);
        assertNotNull(refType);
        assertEquals(handler, refType.getValueHandler());
    }

    @Test
    public void testConstructWithTypeHandler() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        Object handler = new Object();
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, handler);
        assertNotNull(refType);
        assertEquals(handler, refType.getTypeHandler());
    }

    @Test
    public void testWithStaticTyping() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        ReferenceType staticType = refType.withStaticTyping();
        assertNotNull(staticType);
        assertTrue(staticType.isStaticTyping());
        assertFalse(refType.isStaticTyping());
    }

    @Test
    public void testWithStaticTypingWhenAlreadyStatic() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        // Directly constructing to set static flag. The super constructor takes _asStatic.
        ReferenceType refType = new ReferenceType(Object.class, stringType, null, null, true);
        ReferenceType staticType = refType.withStaticTyping();
        assertNotNull(staticType);
        assertSame(refType, staticType); // Should return the same instance if already static
        assertTrue(staticType.isStaticTyping());
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
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, handler);
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
        // SimpleType does not expose withTypeHandler publicly for direct manipulation of its components.
        // We'll simulate this by creating a referenced type that already has the handler.
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
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, handler, null);
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
        assertTrue(sb.toString().startsWith("Ljava.lang.Object;"));
    }

    @Test
    public void testGetGenericSignature() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        StringBuilder sb = new StringBuilder();
        refType.getGenericSignature(sb);
        // Expected: "Ljava.lang.Object<Ljava.lang.String;>;"
        assertTrue(sb.toString().startsWith("Ljava.lang.Object<"));
        assertTrue(sb.toString().contains("Ljava.lang.String"));
        assertTrue(sb.toString().endsWith(">;"));
    }

    @Test
    public void testToString() throws Exception {
        JavaType stringType = new SimpleType(String.class);
        ReferenceType refType = ReferenceType.construct(Object.class, stringType, null, null);
        String toString = refType.toString();
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
        JavaType narrowedType = refType.narrowContentsBy(subContentType);
        assertNotNull(narrowedType);
        // The narrowContentsBy method is expected to return a type with the narrowed content type.
        // We expect it to be a ReferenceType.
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
        JavaType widenedType = refType.widenContentsBy(superContentType);
        assertNotNull(widenedType);
        assertTrue(widenedType instanceof ReferenceType);
        assertEquals(superContentType, widenedType.containedType(0).getRawClass());
        assertEquals(Object.class, widenedType.getRawClass());
    }
}
```

1. SOURCE CODE ANALYSIS - The tests focus on the `ReferenceType` class, specifically its construction, handler methods (`withTypeHandler`, `withContentTypeHandler`, `withValueHandler`, `withContentValueHandler`), static typing, and methods related to type inspection (`getReferencedType`, `isReferenceType`, `containedTypeCount`, `containedType`, `containedTypeName`, `getParameterSource`, `getErasedSignature`, `getGenericSignature`). Equality checks and narrowing/widening operations are also tested.
2. TEST CASE DESIGN -
    - `testConstructBasic`: Constructs a `ReferenceType` with `Object.class` and `String.class` as referenced type, asserts basic properties.
    - `testConstructWithValueHandler`: Tests construction with a value handler.
    - `testConstructWithTypeHandler`: Tests construction with a type handler.
    - `testWithStaticTyping`: Tests `withStaticTyping()` when not static.
    - `testWithStaticTypingWhenAlreadyStatic`: Tests `withStaticTyping()` when already static.
    - `testWithTypeHandler`: Tests `withTypeHandler()` for a new handler.
    - `testWithTypeHandlerWhenSame`: Tests `withTypeHandler()` with the same handler.
    - `testWithContentTypeHandler`: Tests `withContentTypeHandler()` for a new handler.
    - `testWithContentTypeHandlerWhenSame`: Tests `withContentTypeHandler()` with the same handler.
    - `testWithValueHandler`: Tests `withValueHandler()` for a new handler.
    - `testWithValueHandlerWhenSame`: Tests `withValueHandler()` with the same handler.
    - `testWithContentValueHandler`: Tests `withContentValueHandler()` for a new handler.
    - `testWithContentValueHandlerWhenSame`: Tests `withContentValueHandler()` with the same handler.
    - `testGetReferencedType`: Verifies `getReferencedType()`.
    - `testIsReferenceType`: Verifies `isReferenceType()`.
    - `testContainedTypeCount`: Verifies `containedTypeCount()`.
    - `testContainedTypeValidIndex`: Verifies `containedType()` with a valid index.
    - `testContainedTypeInvalidIndex`: Verifies `containedType()` with invalid indices.
    - `testContainedTypeNameValidIndex`: Verifies `containedTypeName()` with a valid index.
    - `testContainedTypeNameInvalidIndex`: Verifies `containedTypeName()` with invalid indices.
    - `testGetParameterSource`: Verifies `getParameterSource()`.
    - `testGetErasedSignature`: Verifies `getErasedSignature()`.
    - `testGetGenericSignature`: Verifies `getGenericSignature()`.
    - `testToString`: Verifies the output of `toString()`.
    - `testEqualsSameInstance`: Tests `equals()` with the same instance.
    - `testEqualsNull`: Tests `equals()` with `null`.
    - `testEqualsDifferentClass`: Tests `equals()` with different raw classes.
    - `testEqualsDifferentReferencedType`: Tests `equals()` with different referenced types.
    - `testEqualsSameType`: Tests `equals()` with identical types.
    - `testNarrowBy`: Tests `narrowBy()` inherited from `JavaType`.
    - `testNarrowContentsBy`: Tests `narrowContentsBy()` inherited from `JavaType`.
    - `testWidenBy`: Tests `widenBy()` inherited from `JavaType`.
    - `testWidenContentsBy`: Tests `widenContentsBy()` inherited from `JavaType`.
4. DEFECT DETECTION STRATEGY - The tests cover various states and interactions of `ReferenceType` and its inherited methods, aiming to catch regressions in how types are constructed, modified, compared, and how their signatures are generated.
5. SUMMARY - 31 tests.
6. LIMITATIONS - Tests rely on `SimpleType` as a placeholder for `JavaType` and assume its behavior regarding handlers. The `equals` method on `SimpleType` is not fully predictable without its implementation. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.