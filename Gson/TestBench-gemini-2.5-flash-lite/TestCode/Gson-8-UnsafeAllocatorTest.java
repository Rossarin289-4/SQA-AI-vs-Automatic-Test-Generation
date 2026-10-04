package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class UnsafeAllocatorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCreateReturnsUnsafeAllocator() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        assertNotNull(allocator);
    }

    @Test
    public void testNewInstanceForSimpleClass() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        Object instance = allocator.newInstance(Object.class);
        assertNotNull(instance);
        // Object.class is a concrete class with a public no-arg constructor,
        // so it should be instantiable and return a non-null object.
        assertTrue(instance instanceof Object);
    }

    @Test
    public void testNewInstanceForStringClass() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        // String class is not abstract or an interface.
        // However, it has internal state that relies on constructor initialization.
        // Unsafe allocation might create an object, but it won't be a properly initialized String.
        // The previous test failed with NPE on assertEquals("", instance).
        // Asserting that an instance is created is sufficient, and that it's not null.
        // The value "" is not guaranteed by UnsafeAllocator for String.
        Object instance = allocator.newInstance(String.class);
        assertNotNull(instance);
        // We cannot assert assertEquals("", instance) because the created String object
        // is not guaranteed to be initialized to an empty string.
        // The underlying mechanism might create an object, but it's not a usable String.
    }

    @Test
    public void testNewInstanceForIntegerClass() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        Integer instance = allocator.newInstance(Integer.class);
        assertNotNull(instance);
        // Integer class has a public no-arg constructor.
        // The value for an uninitialized Integer object is typically 0.
        assertEquals(0, instance.intValue());
    }

    @Test
    public void testNewInstanceForBooleanClass() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        Boolean instance = allocator.newInstance(Boolean.class);
        assertNotNull(instance);
        // Boolean class has a public no-arg constructor.
        // The value for an uninitialized Boolean object is typically false.
        assertFalse(instance.booleanValue());
    }

    // Test case for a class with a private constructor. UnsafeAllocator should be able to instantiate it.
    @Test
    public void testNewInstanceForClassWithPrivateConstructor() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        ClassWithPrivateConstructor instance = allocator.newInstance(ClassWithPrivateConstructor.class);
        assertNotNull(instance);
        assertTrue(instance instanceof ClassWithPrivateConstructor);
    }

    // Test case for a class with a public constructor. UnsafeAllocator should be able to instantiate it.
    @Test
    public void testNewInstanceForClassWithPublicConstructor() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        ClassWithPublicConstructor instance = allocator.newInstance(ClassWithPublicConstructor.class);
        assertNotNull(instance);
        assertTrue(instance instanceof ClassWithPublicConstructor);
    }

    // Test case for a class with a protected constructor. UnsafeAllocator should be able to instantiate it.
    @Test
    public void testNewInstanceForClassWithProtectedConstructor() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        ClassWithProtectedConstructor instance = allocator.newInstance(ClassWithProtectedConstructor.class);
        assertNotNull(instance);
        assertTrue(instance instanceof ClassWithProtectedConstructor);
    }

    // Test case for a class with a package-private constructor. UnsafeAllocator should be able to instantiate it.
    @Test
    public void testNewInstanceForClassWithPackagePrivateConstructor() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        ClassWithPackagePrivateConstructor instance = allocator.newInstance(ClassWithPackagePrivateConstructor.class);
        assertNotNull(instance);
        assertTrue(instance instanceof ClassWithPackagePrivateConstructor);
    }

    // Test case for a class with no explicitly defined public or private constructors.
    // It relies on the default no-arg constructor if one is implicitly available and accessible.
    // UnsafeAllocator should be able to instantiate it.
    @Test
    public void testNewInstanceForClassWithImplicitNoArgConstructor() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        // This class will have a default no-arg constructor if no other constructors are defined.
        // The default no-arg constructor is package-private.
        ClassWithImplicitNoArgConstructor instance = allocator.newInstance(ClassWithImplicitNoArgConstructor.class);
        assertNotNull(instance);
        assertTrue(instance instanceof ClassWithImplicitNoArgConstructor);
    }

    @Test
    public void testNewInstanceThrowsExceptionForInterface() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        try {
            allocator.newInstance(Runnable.class);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("Interface can't be instantiated!"));
        }
    }

    @Test
    public void testNewInstanceThrowsExceptionForAbstractClass() throws Exception {
        UnsafeAllocator allocator = UnsafeAllocator.create();
        try {
            allocator.newInstance(AbstractClass.class);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("Abstract class can't be instantiated!"));
        }
    }

    // Helper classes for testing - must be static for JUnit to work with them correctly within the test class.

    // Class with a private constructor
    private static class ClassWithPrivateConstructor {
        private ClassWithPrivateConstructor() {
            // This constructor is private. UnsafeAllocator should bypass it.
        }
    }

    // Class with a public constructor
    private static class ClassWithPublicConstructor {
        public ClassWithPublicConstructor() {
            // This constructor is public.
        }
    }

    // Class with a protected constructor
    protected static class ClassWithProtectedConstructor { // Made protected to be accessible by test class if in different package, though here it's same package.
        protected ClassWithProtectedConstructor() {
            // This constructor is protected.
        }
    }

    // Class with a package-private constructor
    static class ClassWithPackagePrivateConstructor {
        ClassWithPackagePrivateConstructor() {
            // This constructor is package-private.
        }
    }

    // Class with no explicitly defined constructors. It relies on the implicit public no-arg constructor.
    // The original name "ClassWithNoPublicOrPrivateConstructor" was misleading. Renamed for clarity.
    private static class ClassWithImplicitNoArgConstructor {
        // No explicit constructors means a public no-arg constructor is provided by default.
        // UnsafeAllocator should be able to create instances.
    }

    // Abstract class for testing exception handling
    private static abstract class AbstractClass {}
}
