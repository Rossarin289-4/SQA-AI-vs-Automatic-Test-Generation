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
    public void testConstructUnsafeWithBasicClass() throws Exception {
        Class<?> raw = String.class;
        SimpleType st = SimpleType.constructUnsafe(raw);
        assertNotNull(st);
        // assertSame(raw, st.getRawClass()); // getRawClass() is not in API outline for TypeBase, but it is in JavaType
        assertEquals(raw, st.getRawClass()); // Using assertEquals for Class objects is fine
        assertFalse(st.isContainerType());
    }

    @Test
    public void testConstructWithBasicClass() throws Exception {
        Class<?> cls = Integer.class;
        SimpleType st = SimpleType.construct(cls);
        assertNotNull(st);
        assertEquals(cls, st.getRawClass());
        assertFalse(st.isContainerType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithMapClass() throws Exception {
        SimpleType.construct(Map.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithCollectionClass() throws Exception {
        SimpleType.construct(List.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithArrayClass() throws Exception {
        SimpleType.construct(String[].class);
    }

    @Test
    public void testWithContentType_throwsException() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        try {
            // Simple types do not have content types, so this method should always throw.
            // The argument itself does not matter as the exception is thrown before its use.
            st.withContentType(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // The specific message is checked in the provided code, but the core is the exception type.
            // Let's assert on the message if it's stable.
            assertEquals("Simple types have no content types; can not call withContentType()", e.getMessage());
        }
    }

    @Test
    public void testWithContentTypeHandler_throwsException() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        try {
            // Same reasoning as withContentType
            st.withContentTypeHandler(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Simple types have no content types; can not call withContenTypeHandler()", e.getMessage());
        }
    }
    
    @Test
    public void testWithContentValueHandler_throwsException() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        try {
            // Same reasoning as withContentType
            st.withContentValueHandler(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Simple types have no content types; can not call withContenValueHandler()", e.getMessage());
        }
    }

    @Test
    public void testRefineReturnsNull() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        JavaType refined = st.refine(String.class, TypeBindings.emptyBindings(), null, null);
        assertNull(refined);
    }

    @Test
    public void testIsContainerTypeIsFalse() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        assertFalse(st.isContainerType());
    }

    @Test
    public void testToString() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        assertEquals("[simple type, class java.lang.String]", st.toString());
    }
    
    @Test
    public void testToStringWithBindings() throws Exception {
        // SimpleType.construct() does not create TypeBindings.
        // constructUnsafe creates a SimpleType without proper bindings.
        // To test with bindings, we'd need to use a constructor or TypeFactory,
        // which are not directly exposed or intended for SimpleType construction in tests.
        // The current constructUnsafe(List.class) creates a SimpleType for List.class
        // but without any actual generic bindings. The toString should reflect the class name.
        SimpleType st = SimpleType.constructUnsafe(List.class); 
        assertEquals("[simple type, class java.util.List]", st.toString());
    }

    @Test
    public void testEqualsWithSameInstance() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        assertTrue(st.equals(st));
    }

    @Test
    public void testEqualsWithDifferentClass() throws Exception {
        SimpleType st1 = SimpleType.construct(String.class);
        SimpleType st2 = SimpleType.construct(Integer.class);
        assertFalse(st1.equals(st2));
    }

    @Test
    public void testEqualsWithNull() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        assertFalse(st.equals(null));
    }
    
    @Test
    public void testEqualsWithDifferentType() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        assertFalse(st.equals("a string"));
    }

    @Test
    public void testEqualsWithSameClassAndNoBindings() throws Exception {
        SimpleType st1 = SimpleType.construct(String.class);
        SimpleType st2 = SimpleType.construct(String.class);
        assertTrue(st1.equals(st2));
    }

    @Test
    public void testWithStaticTyping() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        JavaType staticSt = st.withStaticTyping(); // Returns JavaType, which can be SimpleType
        assertNotSame(st, staticSt);
        // We cannot directly assert isStaticTyping() as it doesn't exist.
        // The test verifies that withStaticTyping() returns a new instance,
        // implying the static typing flag is set on the new instance.
        // We can infer this by checking if the returned type is still a SimpleType
        // and if it's a different instance.
        assertTrue(staticSt instanceof SimpleType);
    }

    @Test
    public void testWithStaticTyping_alreadyStatic() throws Exception {
        // To test this, we need a way to create a SimpleType that is already static.
        // The provided constructors for SimpleType are protected or require TypeBindings.
        // The public API only offers `withStaticTyping()`.
        // We can simulate by creating a type and then calling withStaticTyping twice.
        // The second call should return the same instance if the first call already made it static.
        
        // Let's create a base type
        SimpleType originalSt = SimpleType.construct(String.class);
        // Make it static
        JavaType firstStatic = originalSt.withStaticTyping();
        
        // Now call withStaticTyping on the already static type
        JavaType secondStatic = firstStatic.withStaticTyping();
        
        // The second call should return the same instance as the first if it was already static.
        assertSame(firstStatic, secondStatic);
        assertTrue(secondStatic instanceof SimpleType);
    }

    @Test
    public void testWithValueHandler() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType withHandler = st.withValueHandler(handler);
        assertNotSame(st, withHandler);
        assertSame(handler, withHandler.getValueHandler());
    }

    @Test
    public void testWithValueHandler_sameHandler() throws Exception {
        Object handler = new Object();
        SimpleType st = SimpleType.construct(String.class).withValueHandler(handler);
        SimpleType withHandler = st.withValueHandler(handler);
        assertSame(st, withHandler);
        assertSame(handler, withHandler.getValueHandler());
    }
    
    @Test
    public void testWithTypeHandler() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType withHandler = st.withTypeHandler(handler);
        assertNotSame(st, withHandler);
        assertSame(handler, withHandler.getTypeHandler());
    }

    @Test
    public void testWithTypeHandler_sameHandler() throws Exception {
        Object handler = new Object();
        SimpleType st = SimpleType.construct(String.class).withTypeHandler(handler);
        SimpleType withHandler = st.withTypeHandler(handler);
        assertSame(st, withHandler);
        assertSame(handler, withHandler.getTypeHandler());
    }

    @Test
    public void testGetErasedSignature() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        st.getErasedSignature(sb);
        // Corrected expected value to use '/' as separator, as per _classSignature implementation
        assertEquals("Ljava/lang/String;", sb.toString());
    }

    @Test
    public void testGetGenericSignature_noBindings() throws Exception {
        SimpleType st = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        st.getGenericSignature(sb);
        // Corrected expected value to use '/' as separator, as per _classSignature implementation
        assertEquals("Ljava/lang/String;", sb.toString());
    }
    
    // Add a test for _narrow to ensure it works correctly and creates a new instance
    @Test
    public void testNarrow() throws Exception {
        SimpleType original = SimpleType.construct(Number.class);
        SimpleType narrowed = (SimpleType) original._narrow(Integer.class); // _narrow returns JavaType, cast to SimpleType
        assertNotSame(original, narrowed);
        assertEquals(Integer.class, narrowed.getRawClass());
        // Ensure it's still a SimpleType
        assertTrue(narrowed instanceof SimpleType);
    }

    // Add a test for _narrow with the same class
    @Test
    public void testNarrow_sameClass() throws Exception {
        SimpleType original = SimpleType.construct(Integer.class);
        SimpleType narrowed = (SimpleType) original._narrow(Integer.class);
        assertSame(original, narrowed);
    }
}
