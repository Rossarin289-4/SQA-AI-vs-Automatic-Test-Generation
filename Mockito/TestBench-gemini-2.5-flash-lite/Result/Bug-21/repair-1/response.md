```java
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
```
1. SOURCE CODE ANALYSIS - The `newInstance` method is tested in two main scenarios: when `outerClassInstance` is null (delegating to `noArgConstructor`) and when it's not null (delegating to `withParams`). The `withParams` method iterates through constructors to find a match based on parameter types. Tests cover cases with and without an outer instance, constructor availability, and parameter matching.
2. TEST CASE DESIGN -
    - `testNewInstance_NoOuterInstance_CreatesInstanceWithNoArgConstructor`: Input: null outer instance, Class with no-arg constructor. Expected: Instance of the class. Derived: Direct call to `noArgConstructor`.
    - `testNewInstance_WithOuterInstance_CreatesInstanceWithMatchingConstructor`: Input: Object outer instance, Class with constructor matching Object. Expected: Instance of the class. Derived: `paramsMatch` and `newInstance` logic.
    - `testNewInstance_NoOuterInstance_ThrowsExceptionWhenNoNoArgConstructor`: Input: null outer instance, Class with only arg constructor. Expected: `InstantationException`. Derived: `cls.newInstance()` fails.
    - `testNewInstance_WithOuterInstance_ThrowsExceptionWhenNoMatchingConstructor`: Input: Object outer instance, Class with no constructor matching Object. Expected: `InstantationException`. Derived: `paramsMatch` always returns false.
    - `testNewInstance_WithOuterInstance_HandlesMultipleConstructorsAndPicksMatchingOne`: Input: Object outer instance, Class with multiple constructors including one matching Object. Expected: Instance of the class. Derived: Loop in `withParams` finds the matching constructor.
    - `testNewInstance_NoOuterInstance_HandlesClassWithOnlyArgConstructor`: Input: null outer instance, Class with only arg constructor. Expected: `InstantationException`. Derived: `cls.newInstance()` fails.
    - `testNewInstance_WithOuterInstance_HandlesClassWithOnlyNoArgConstructor`: Input: Object outer instance, Class with only no-arg constructor. Expected: `InstantationException`. Derived: No constructor found by `paramsMatch`.
    - `testNewInstance_WithOuterInstance_HandlesNullParamsArray`: Input: null outer instance (but context implies outer instance is not null). Expected: `InstantationException`. Derived: `outerClassInstance` is null, leading to `noArgConstructor` path, which expects a no-arg constructor.
    - `testNewInstance_WithOuterInstance_HandlesEmptyParamsArray`: Input: Object outer instance, Class with no-arg constructor. Expected: `InstantationException`. Derived: `withParams` called with non-null `outerClassInstance`, but `SomeClassWithNoArgConstructor` has no constructor matching the `outerInstance` type.
    - `testNewInstance_WithOuterInstance_HandlesCorrectlyWhenOuterInstanceIsSuperclass`: Input: SuperClass instance, Class with constructor matching SuperClass. Expected: Instance of the class. Derived: `isInstance` check in `paramsMatch` passes for subclass.
    - `testNewInstance_WithOuterInstance_HandlesCorrectlyWhenOuterInstanceIsNull`: Input: null outer instance. Expected: Instance of the class with no-arg constructor. Derived: `outerClassInstance` is null, calls `noArgConstructor`.
    - `testNewInstance_WithOuterInstance_ThrowsExceptionWhenNoMatchingParamConstructorAndOuterInstanceNotNull`: Input: Object outer instance, Class with constructor matching String. Expected: `InstantationException`. Derived: `paramsMatch` fails for Object type.
    - `testNewInstance_WithOuterInstance_HandlesCorrectlyWhenOuterInstanceIsSameType`: Input: `SomeClassWithMatchingConstructor` instance, `SomeClassWithMatchingConstructor` class. Expected: Instance of the class. Derived: `paramsMatch` passes for same type.
4. DEFECT DETECTION STRATEGY - The tests cover scenarios of constructor selection based on the presence and type of the `outerClassInstance`, aiming to detect errors in parameter matching, constructor lookup, and exception handling for instantiation failures.
5. SUMMARY - 13 tests.
6. LIMITATIONS - The tests rely on custom helper classes for demonstrating constructor behavior. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.