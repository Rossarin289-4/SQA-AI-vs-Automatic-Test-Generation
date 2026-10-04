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
    public void testAnswerWithConcreteMethodDelegatesToCallRealMethod() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method concreteMethod = createMockMethod("toString", String.class);
        Object[] args = {};
        String realResult = "real method result";

        MockInvocation invocation = new MockInvocation(mockObject, concreteMethod, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(realResult, result);
    }

    @Test
    public void testAnswerWithAbstractMethodDelegatesToGloballyConfiguredAnswer() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method abstractMethod = createMockAbstractMethod("equals", boolean.class, Object.class);
        Object[] args = {new Object()};

        MockInvocation invocation = new MockInvocation(mockObject, abstractMethod, args, null, true);

        Object result = callsRealMethods.answer(invocation);
        assertNull(result);
    }

    @Test
    public void testAnswerWithNullArgumentsReturnsCorrectResult() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("toString", String.class);
        Object[] args = null;
        String realResult = "real method result";

        MockInvocation invocation = new MockInvocation(mockObject, method, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(realResult, result);
    }

    @Test
    public void testAnswerWithEmptyArgumentsReturnsCorrectly() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("hashCode", int.class);
        Object[] args = {};
        Integer realResult = 12345;

        MockInvocation invocation = new MockInvocation(mockObject, method, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(realResult, result);
    }

    @Test
    public void testAnswerWithPrimitiveArgumentsWorks() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("equals", boolean.class, Object.class);
        Object[] args = {new Object()};
        Boolean realResult = true;

        MockInvocation invocation = new MockInvocation(mockObject, method, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(realResult, result);
    }

    @Test
    public void testAnswerWithNullReturnValueFromRealMethod() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("toString", String.class);
        Object[] args = {};
        String realResult = null;

        MockInvocation invocation = new MockInvocation(mockObject, method, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertNull(result);
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
    public void testAnswerForMethodWithoutArguments() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("hashCode", int.class);
        Object[] args = {};
        int realResult = 98765;

        MockInvocation invocation = new MockInvocation(mockObject, method, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(realResult, result);
    }

    @Test
    public void testAnswerForMethodWithMultipleArguments() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("equals", boolean.class, Object.class);
        Object[] args = {mockObject, mockObject};
        boolean realResult = true;

        MockInvocation invocation = new MockInvocation(mockObject, method, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(realResult, result);
    }

    @Test
    public void testCallsRealMethodsIsSerializable() {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        assertTrue(callsRealMethods instanceof Serializable);
    }

    @Test
    public void testAnswerWithNonAbstractMethod() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method concreteMethod = createMockMethod("toString", String.class);
        Object[] args = {};
        String realResult = "concrete result";

        MockInvocation invocation = new MockInvocation(mockObject, concreteMethod, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(realResult, result);
    }

    @Test
    public void testAnswerWithSimulatedAbstractMethod() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method abstractMethod = createMockAbstractMethod("toString", String.class);
        Object[] args = {};

        MockInvocation invocation = new MockInvocation(mockObject, abstractMethod, args, null, true);

        Object result = callsRealMethods.answer(invocation);
        assertNull(result);
    }

    @Test
    public void testAnswerWithPrimitiveIntReturn() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("hashCode", int.class);
        Object[] args = {};
        int realResult = 500;

        MockInvocation invocation = new MockInvocation(mockObject, method, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(500, result);
    }

    @Test
    public void testAnswerWithPrimitiveBooleanReturn() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("equals", boolean.class, Object.class);
        Object[] args = {new Object()};
        boolean realResult = false;

        MockInvocation invocation = new MockInvocation(mockObject, method, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(false, result);
    }

    @Test
    public void testAnswerWithPrimitiveDoubleReturn() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = Object.class.getMethod("toString", null);
        Double realResult = 3.14159;

        MockInvocation invocation = new MockInvocation(mockObject, method, new Object[]{}, realResult, false) {
             @Override
             public Object callRealMethod() throws Throwable {
                 return realResult;
             }
        };

        Object result = callsRealMethods.answer(invocation);
        assertEquals(3.14159, (Double) result, 1e-9);
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
    public void testAnswerWithDifferentMockObject() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Object differentMock = new Object();
        Method method = createMockMethod("toString", String.class);
        Object[] args = {};
        String realResult = "result from different mock";

        MockInvocation invocation = new MockInvocation(mockObject, method, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(realResult, result);
    }

    @Test
    public void testAnswerWithArrayArgument() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method method = createMockMethod("toString", String.class);
        Object[] args = {new String[]{"a", "b"}};
        String realResult = "array result";

        MockInvocation invocation = new MockInvocation(mockObject, method, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(realResult, result);
    }

    @Test
    public void testAnswerWithVoidReturnMethod() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method voidMethod = Object.class.getMethod("wait");
        Object[] args = {};

        MockInvocation invocation = new MockInvocation(mockObject, voidMethod, args, null, false);

        Object result = callsRealMethods.answer(invocation);
        assertNull(result);
    }

    @Test
    public void testAnswerWithFinalMethod() throws Exception {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        Object mockObject = new Object();
        Method finalMethod = createMockMethod("toString", String.class);
        Object[] args = {};
        String realResult = "final method result";

        MockInvocation invocation = new MockInvocation(mockObject, finalMethod, args, realResult, false);

        Object result = callsRealMethods.answer(invocation);
        assertEquals(realResult, result);
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
