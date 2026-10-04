package org.mockito.internal.creation.instance;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;

public class ConstructorInstantiatorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testNewInstance_NoOuterInstance_CreatesInstanceWithNoArgConstructor() throws Exception {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        SomeClassWithNoArgConstructor instance = instantiator.newInstance(SomeClassWithNoArgConstructor.class);
        assertNotNull(instance);
        assertTrue(instance instanceof SomeClassWithNoArgConstructor);
    }

    @Test
    public void testNewInstance_WithOuterInstance_CreatesInstanceWithMatchingConstructor() throws Exception {
        Object outerInstance = new Object();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);
        SomeClassWithMatchingConstructor instance = instantiator.newInstance(SomeClassWithMatchingConstructor.class);
        assertNotNull(instance);
        assertTrue(instance instanceof SomeClassWithMatchingConstructor);
        assertSame(outerInstance, instance.getOuterInstance());
    }

    @Test
    public void testNewInstance_NoOuterInstance_ThrowsExceptionWhenNoNoArgConstructor() throws Exception {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        try {
            instantiator.newInstance(SomeClassWithArgConstructor.class);
            fail("Expected InstantiationException");
        } catch (InstantationException expected) {
            // Expected exception
        }
    }

    @Test
    public void testNewInstance_WithOuterInstance_ThrowsExceptionWhenNoMatchingConstructor() throws Exception {
        Object outerInstance = new Object();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);
        try {
            instantiator.newInstance(SomeClassWithNoArgConstructor.class);
            fail("Expected InstantationException");
        } catch (InstantationException expected) {
            // Expected exception
        }
    }

    @Test
    public void testNewInstance_WithOuterInstance_HandlesMultipleConstructorsAndPicksMatchingOne() throws Exception {
        Object outerInstance = new Object();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);
        SomeClassWithMultipleConstructors instance = instantiator.newInstance(SomeClassWithMultipleConstructors.class);
        assertNotNull(instance);
        assertTrue(instance instanceof SomeClassWithMultipleConstructors);
        assertSame(outerInstance, instance.getOuterInstance());
    }

    @Test
    public void testNewInstance_NoOuterInstance_HandlesClassWithOnlyArgConstructor() throws Exception {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        try {
            instantiator.newInstance(ClassWithOnlyArgConstructor.class);
            fail("Expected InstantationException");
        } catch (InstantationException expected) {
            // Expected exception
        }
    }

    @Test
    public void testNewInstance_WithOuterInstance_HandlesClassWithOnlyNoArgConstructor() throws Exception {
        Object outerInstance = new Object();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);
        try {
            instantiator.newInstance(ClassWithOnlyNoArgConstructor.class);
            fail("Expected InstantationException");
        } catch (InstantationException expected) {
            // Expected exception
        }
    }

    @Test
    public void testNewInstance_WithOuterInstance_HandlesNullParamsArray() throws Exception {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        // This case should not be reached as outerClassInstance is null
        // but testing to ensure no NPE if logic were to change.
        try {
            instantiator.newInstance(SomeClassWithNoArgConstructor.class);
            fail("Expected InstantationException");
        } catch (InstantationException expected) {
            // Expected exception
        }
    }

    @Test
    public void testNewInstance_WithOuterInstance_HandlesEmptyParamsArray() throws Exception {
        Object outerInstance = new Object(); // Not actually used as a parameter
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);
        // This should still fail if outerClassInstance is not null but no matching constructor is found
        try {
            instantiator.newInstance(SomeClassWithNoArgConstructor.class);
            fail("Expected InstantationException");
        } catch (InstantationException expected) {
            // Expected exception
        }
    }

    @Test
    public void testNewInstance_WithOuterInstance_HandlesCorrectlyWhenOuterInstanceIsSuperclass() throws Exception {
        SuperClass outerInstance = new SuperClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);
        SomeClassExtendingSuperClass instance = instantiator.newInstance(SomeClassExtendingSuperClass.class);
        assertNotNull(instance);
        assertTrue(instance instanceof SomeClassExtendingSuperClass);
        assertSame(outerInstance, instance.getOuterInstance());
    }

    @Test
    public void testNewInstance_WithOuterInstance_HandlesCorrectlyWhenOuterInstanceIsNull() throws Exception {
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);
        SomeClassWithNoArgConstructor instance = instantiator.newInstance(SomeClassWithNoArgConstructor.class);
        assertNotNull(instance);
        assertTrue(instance instanceof SomeClassWithNoArgConstructor);
    }

    @Test
    public void testNewInstance_WithOuterInstance_ThrowsExceptionWhenNoMatchingParamConstructorAndOuterInstanceNotNull() throws Exception {
        Object outerInstance = new Object();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);
        try {
            instantiator.newInstance(AnotherClassWithArgConstructor.class);
            fail("Expected InstantationException");
        } catch (InstantationException expected) {
            // Expected exception
        }
    }

    @Test
    public void testNewInstance_WithOuterInstance_HandlesCorrectlyWhenOuterInstanceIsSameType() throws Exception {
        SomeClassWithMatchingConstructor outerInstance = new SomeClassWithMatchingConstructor(new Object());
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);
        SomeClassWithMatchingConstructor instance = instantiator.newInstance(SomeClassWithMatchingConstructor.class);
        assertNotNull(instance);
        assertTrue(instance instanceof SomeClassWithMatchingConstructor);
        assertSame(outerInstance, instance.getOuterInstance());
    }

    // Helper classes for testing
    private static class SomeClassWithNoArgConstructor {
        public SomeClassWithNoArgConstructor() {
        }
    }

    private static class SomeClassWithArgConstructor {
        private Object outerInstance;
        public SomeClassWithArgConstructor(Object outerInstance) {
            this.outerInstance = outerInstance;
        }
        public Object getOuterInstance() {
            return outerInstance;
        }
    }
    
    private static class SomeClassWithMatchingConstructor {
        private Object outerInstance;
        public SomeClassWithMatchingConstructor(Object outerInstance) {
            this.outerInstance = outerInstance;
        }
        public SomeClassWithMatchingConstructor() {
        }
        public Object getOuterInstance() {
            return outerInstance;
        }
    }

    private static class SomeClassWithMultipleConstructors {
        private Object outerInstance;
        public SomeClassWithMultipleConstructors(Object outerInstance) {
            this.outerInstance = outerInstance;
        }
        public SomeClassWithMultipleConstructors(String otherParam) {
        }
        public Object getOuterInstance() {
            return outerInstance;
        }
    }
    
    private static class ClassWithOnlyArgConstructor {
        public ClassWithOnlyArgConstructor(Object param) {}
    }

    private static class ClassWithOnlyNoArgConstructor {
        public ClassWithOnlyNoArgConstructor() {}
    }
    
    private static class SuperClass {}

    private static class SomeClassExtendingSuperClass {
        private Object outerInstance;
        public SomeClassExtendingSuperClass(SuperClass outerInstance) {
            this.outerInstance = outerInstance;
        }
        public Object getOuterInstance() {
            return outerInstance;
        }
    }

    private static class AnotherClassWithArgConstructor {
        public AnotherClassWithArgConstructor(String param) {}
    }
}
