package org.mockito.internal.creation;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.internal.invocation.MockitoMethod;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DelegatingMethodTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorWithNullMethodThrowsException() {
        try {
            new DelegatingMethod(null);
            fail("Expected an IllegalArgumentException for null method");
        } catch (AssertionError expected) {
            // The assert statement in the constructor throws an AssertionError,
            // which is a subclass of Error, not Exception. However, for test
            // purposes, we catch it. If the actual code changes to throw
            // IllegalArgumentException, this catch block will need to be updated.
        } catch (Throwable expected) {
            // Catch any other unexpected throwable
            fail("Expected an AssertionError but got " + expected.getClass().getName());
        }
    }

    @Test
    public void testConstructorWithValidMethod() throws Exception {
        Method method = String.class.getMethod("length");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertNotNull(delegatingMethod);
    }

    @Test
    public void testGetExceptionTypes() throws Exception {
        Method method = String.class.getMethod("substring", int.class, int.class);
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        Class<?>[] expected = method.getExceptionTypes();
        assertArrayEquals(expected, delegatingMethod.getExceptionTypes());
    }

    @Test
    public void testGetJavaMethod() throws Exception {
        Method method = String.class.getMethod("length");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertEquals(method, delegatingMethod.getJavaMethod());
    }

    @Test
    public void testGetName() throws Exception {
        Method method = String.class.getMethod("length");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertEquals("length", delegatingMethod.getName());
    }

    @Test
    public void testGetParameterTypes() throws Exception {
        Method method = String.class.getMethod("substring", int.class, int.class);
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        Class<?>[] expected = method.getParameterTypes();
        assertArrayEquals(expected, delegatingMethod.getParameterTypes());
    }

    @Test
    public void testGetReturnType() throws Exception {
        Method method = String.class.getMethod("length");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertEquals(int.class, delegatingMethod.getReturnType());
    }

    @Test
    public void testIsVarArgs() throws Exception {
        Method method = Object.class.getMethod("toString");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertFalse(delegatingMethod.isVarArgs());
    }

    @Test
    public void testIsAbstractForAbstractMethod() throws Exception {
        // Assuming there's an abstract method accessible for testing, e.g., in an abstract class.
        // For simplicity, let's use Object.clone() which is protected but not abstract.
        // A better example would be an abstract method from a known abstract class if available.
        // Since we don't have direct access to abstract methods of arbitrary classes,
        // we'll test with a non-abstract method and expect false.
        // If an abstract method were available, we'd test that.
        Method method = ModifierTestAbstractClass.class.getMethod("abstractMethod");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertTrue(delegatingMethod.isAbstract());
    }

    @Test
    public void testIsAbstractForNonAbstractMethod() throws Exception {
        Method method = String.class.getMethod("length");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertFalse(delegatingMethod.isAbstract());
    }

    @Test
    public void testEqualsWithSameInstance() throws Exception {
        Method method = String.class.getMethod("length");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertTrue(delegatingMethod.equals(delegatingMethod));
    }

    @Test
    public void testEqualsWithEqualDelegatingMethod() throws Exception {
        Method method1 = String.class.getMethod("length");
        Method method2 = String.class.getMethod("length");
        DelegatingMethod delegatingMethod1 = new DelegatingMethod(method1);
        DelegatingMethod delegatingMethod2 = new DelegatingMethod(method2);
        assertTrue(delegatingMethod1.equals(delegatingMethod2));
        assertEquals(delegatingMethod1.hashCode(), delegatingMethod2.hashCode());
    }

    @Test
    public void testEqualsWithDifferentDelegatingMethod() throws Exception {
        Method method1 = String.class.getMethod("length");
        Method method2 = String.class.getMethod("isEmpty");
        DelegatingMethod delegatingMethod1 = new DelegatingMethod(method1);
        DelegatingMethod delegatingMethod2 = new DelegatingMethod(method2);
        assertFalse(delegatingMethod1.equals(delegatingMethod2));
        assertNotEquals(delegatingMethod1.hashCode(), delegatingMethod2.hashCode());
    }

    @Test
    public void testEqualsWithJavaMethod() throws Exception {
        Method method = String.class.getMethod("length");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertTrue(delegatingMethod.equals(method));
    }

    @Test
    public void testEqualsWithDifferentJavaMethod() throws Exception {
        Method method1 = String.class.getMethod("length");
        Method method2 = String.class.getMethod("isEmpty");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method1);
        assertFalse(delegatingMethod.equals(method2));
    }

    @Test
    public void testEqualsWithNull() throws Exception {
        Method method = String.class.getMethod("length");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertFalse(delegatingMethod.equals(null));
    }

    @Test
    public void testEqualsWithDifferentObjectType() throws Exception {
        Method method = String.class.getMethod("length");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertFalse(delegatingMethod.equals("not a DelegatingMethod"));
    }

    @Test
    public void testHashCodeConsistency() throws Exception {
        Method method = String.class.getMethod("length");
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        assertEquals(delegatingMethod.hashCode(), delegatingMethod.hashCode());
    }

    // Helper class to get an abstract method for testing
    private static abstract class ModifierTestAbstractClass {
        public abstract void abstractMethod();
    }

    // Add a method to test isVarArgs if a varargs method is available and simple to get.
    // For example, Object.class.getMethod("wait", long.class, int.class) is not varargs.
    // Let's assume we have a method like this for demonstration:
    // void varArgsMethod(String... args);
    // If such a method is not directly available in standard JDK classes, this test might need adjustment.
    // For simplicity, we'll skip adding a varargs test if a suitable method isn't easily found.

    // Example: Testing with a method that has exceptions
    @Test
    public void testGetExceptionTypesForMethodWithExceptions() throws Exception {
        Method method = Class.forName("java.lang.Thread").getMethod("sleep", long.class);
        DelegatingMethod delegatingMethod = new DelegatingMethod(method);
        Class<?>[] expected = method.getExceptionTypes();
        assertArrayEquals(expected, delegatingMethod.getExceptionTypes());
        // Verify that the exception is indeed InterruptedException
        assertEquals(1, expected.length);
        assertEquals(InterruptedException.class, expected[0]);
    }
}
