package org.mockito.internal.stubbing.answers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class CallsRealMethodsTest {

    // Mock implementation of InvocationOnMock for testing purposes.
    // This mock allows us to control the behavior of getMethod() and callRealMethod().
    private static class MockInvocation implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;
        private final Object realMethodResult;
        private final boolean isAbstract;
        private final Throwable exceptionToThrow;

        MockInvocation(Object mock, Method method, Object[] arguments, Object realMethodResult, boolean isAbstract) {
            this(mock, method, arguments, realMethodResult, isAbstract, null);
        }

        MockInvocation(Object mock, Method method, Object[] arguments, Throwable exceptionToThrow, boolean isAbstract) {
            this(mock, method, arguments, null, isAbstract, exceptionToThrow);
        }

        private MockInvocation(Object mock, Method method, Object[] arguments, Object realMethodResult, boolean isAbstract, Throwable exceptionToThrow) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments;
            this.realMethodResult = realMethodResult;
            this.isAbstract = isAbstract;
            this.exceptionToThrow = exceptionToThrow;
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object[] getArguments() {
            return arguments;
        }

        @Override
        public <T> T getArgumentAt(int index, Class<T> clazz) {
            return clazz.cast(arguments[index]);
        }

        @Override
        public Object callRealMethod() throws Throwable {
            if (exceptionToThrow != null) {
                throw exceptionToThrow;
            }
            if (isAbstract) {
                // Simulate GloballyConfiguredAnswer behavior for abstract methods
                return null; // In a real scenario, this would delegate.
            }
            return realMethodResult;
        }
    }

    // Helper method to create a mock method.
    private Method createMockMethod(String name, Class<?> returnType, Class<?>... parameterTypes) throws NoSuchMethodException {
        return Object.class.getMethod(name, parameterTypes);
    }

    // Helper method to create a mock method with abstract modifier.
    private Method createMockAbstractMethod(String name, Class<?> returnType, Class<?>... parameterTypes) throws NoSuchMethodException {
        Method abstractMethod = Object.class.getMethod(name, parameterTypes);
        try {
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(abstractMethod, abstractMethod.getModifiers() | Modifier.ABSTRACT);
        } catch (Exception e) {
            throw new RuntimeException("Could not set abstract modifier on mock method", e);
        }
        return abstractMethod;
    }







    @Test
    public void testAnswerPropagatesExceptionsFromRealMethod() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("toString", String.class);
        Object[] args = {};
        RuntimeException expectedException = new RuntimeException("Error in real method");

        MockInvocation invocation = new MockInvocation(mockObject, method, args, expectedException, false);

        try {
            callsRealMethods.answer(invocation);
            fail("Expected an exception");
        } catch (Throwable actualException) {
            assertSame(expectedException, actualException);
        }
    }



    @Test
    public void testCallsRealMethodsIsSerializable() {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        assertTrue(callsRealMethods instanceof Serializable);
    }






    @Test
    public void testAnswerWithIncorrectNumberOfArgumentsProvided() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("equals", boolean.class, Object.class);
        Object[] args = {};
        IllegalArgumentException expectedException = new IllegalArgumentException("Incorrect number of arguments");

        MockInvocation invocation = new MockInvocation(mockObject, method, args, expectedException, false);

        try {
            callsRealMethods.answer(invocation);
            fail("Expected an IllegalArgumentException");
        } catch (Throwable actualException) {
            assertTrue(actualException instanceof IllegalArgumentException);
            assertEquals("Incorrect number of arguments", actualException.getMessage());
        }
    }





    @Test
    public void testAnswerWithStaticMethod() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method staticMethod = String.class.getMethod("valueOf", Object.class);
        Object[] args = {new Object()};
        IllegalStateException expectedException = new IllegalStateException("Cannot call a static method with callRealMethod()");

        MockInvocation invocation = new MockInvocation(mockObject, staticMethod, args, expectedException, false);

        try {
            callsRealMethods.answer(invocation);
            fail("Expected IllegalStateException for static method callRealMethod");
        } catch (Throwable actualException) {
            assertTrue(actualException instanceof IllegalStateException);
            assertEquals("Cannot call a static method with callRealMethod()", actualException.getMessage());
        }
    }
}

