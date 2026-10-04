package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.mockito.Mockito;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class ReturnsSmartNullsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testAnswerReturnsMoreEmptyValuesIfNotNull() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(String.class, "someMethod", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertNotNull(result);
        assertTrue(result.toString().contains("SmartNull returned by unstubbed someMethod() method on mock"));
    }

    @Test
    public void testAnswerReturnsNonNullForPrimitiveInt() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(int.class, "getInteger", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertEquals(0, result);
    }

    @Test
    public void testAnswerReturnsNonNullForPrimitiveBoolean() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(boolean.class, "getBoolean", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertFalse((Boolean) result);
    }

    @Test
    public void testAnswerReturnsNonNullForPrimitiveChar() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(char.class, "getChar", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertEquals('\u0000', result);
    }

    @Test
    public void testAnswerReturnsNonNullForPrimitiveByte() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(byte.class, "getByte", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertEquals((byte) 0, result);
    }

    @Test
    public void testAnswerReturnsNonNullForPrimitiveShort() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(short.class, "getShort", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertEquals((short) 0, result);
    }

    @Test
    public void testAnswerReturnsNonNullForPrimitiveLong() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(long.class, "getLong", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertEquals(0L, result);
    }

    @Test
    public void testAnswerReturnsNonNullForPrimitiveFloat() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(float.class, "getFloat", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertEquals(0.0f, result, 1e-9f);
    }

    @Test
    public void testAnswerReturnsNonNullForPrimitiveDouble() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(double.class, "getDouble", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertEquals(0.0d, result, 1e-9d);
    }

    @Test
    public void testAnswerReturnsSmartNullForMockableClass() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(Serializable.class, "toString", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertNotNull(result);
        assertTrue(result.toString().contains("SmartNull returned by unstubbed toString() method on mock"));
    }

    @Test
    public void testAnswerReturnsNullForNonMockableClass() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(String.class, "length", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertNull(result);
    }

    @Test
    public void testAnswerForMethodWithArguments() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(String.class, "concat", new Object[]{"hello"});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertNotNull(result);
        assertTrue(result.toString().contains("SmartNull returned by unstubbed concat(hello) method on mock"));
    }

    @Test
    public void testToStringMethodOnSmartNull() throws Exception {
        InvocationOnMock mockInvocation = createMockInvocation(Serializable.class, "toString", new Object[]{});
        ReturnsSmartNulls returnsSmartNulls = new ReturnsSmartNulls();
        Object result = returnsSmartNulls.answer(mockInvocation);
        assertNotNull(result);
        assertTrue(result.toString().startsWith("SmartNull returned by unstubbed toString() method on mock"));
    }

    @Test
    public void testIsToStringMethod() throws Exception {
        ObjectMethodsGuru guru = new ObjectMethodsGuru();
        Method toStringMethod = Object.class.getMethod("toString");
        assertTrue(guru.isToString(toStringMethod));
    }

    @Test
    public void testIsNotToStringMethod() throws Exception {
        ObjectMethodsGuru guru = new ObjectMethodsGuru();
        Method hashCodeMethod = Object.class.getMethod("hashCode");
        assertFalse(guru.isToString(hashCodeMethod));
    }

    @Test
    public void testCanImposteriseInterface() {
        ClassImposterizer imposterizer = ClassImposterizer.INSTANCE;
        assertTrue(imposterizer.canImposterise(Serializable.class));
    }

    @Test
    public void testCannotImposteriseFinalClass() {
        ClassImposterizer imposterizer = ClassImposterizer.INSTANCE;
        assertFalse(imposterizer.canImposterise(String.class));
    }

    // Helper method to create a mock InvocationOnMock
    private InvocationOnMock createMockInvocation(final Class<?> returnType, final String methodName, final Object[] args) {
        return new MockInvocationOnMock(returnType, methodName, args);
    }

    // Simple mock implementation of InvocationOnMock for testing purposes
    private static class MockInvocationOnMock implements InvocationOnMock {
        private final Class<?> returnType;
        private final String methodName;
        private final Object[] args;
        private final Location location = new Location();

        public MockInvocationOnMock(Class<?> returnType, String methodName, Object[] args) {
            this.returnType = returnType;
            this.methodName = methodName;
            this.args = args;
        }

        @Override
        public Object getMock() {
            return new Object();
        }

        @Override
        public Method getMethod() {
            try {
                if ("toString".equals(methodName)) {
                    return Object.class.getMethod("toString");
                } else if ("hashCode".equals(methodName)) {
                    return Object.class.getMethod("hashCode");
                } else if ("equals".equals(methodName)) {
                    return Object.class.getMethod("equals", Object.class);
                } else {
                    // This is a simplification. For a proper mock, we'd need to determine
                    // argument types dynamically or have them passed in.
                    // Here, we'll create a placeholder Method object.
                    return new MockMethod(methodName, returnType, Arrays.stream(args).map(arg -> arg != null ? arg.getClass() : Object.class).toArray(Class[]::new));
                }
            } catch (NoSuchMethodException e) {
                // If the method is not found on Object, we'll create a dummy method.
                // This is a workaround for testing the ReturnsSmartNulls logic.
                return new MockMethod(methodName, returnType, Arrays.stream(args).map(arg -> arg != null ? arg.getClass() : Object.class).toArray(Class[]::new));
            }
        }

        @Override
        public Object[] getArguments() {
            return args;
        }

        @Override
        public Object callRealMethod() throws Throwable {
            throw new UnsupportedOperationException("callRealMethod not supported in this mock");
        }

        private static class MockMethod extends Method {
            private final String name;
            private final Class<?> returnType;
            private final Class<?>[] parameterTypes;

            public MockMethod(String name, Class<?> returnType, Class<?>[] parameterTypes) {
                this.name = name;
                this.returnType = returnType;
                this.parameterTypes = parameterTypes;
            }

            @Override public String getName() { return name; }
            @Override public Class<?> getReturnType() { return returnType; }
            @Override public Class<?>[] getParameterTypes() { return parameterTypes; }

            // These methods are not directly used by ReturnsSmartNulls and can be stubbed.
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public int getModifiers() { return 0; }
            @Override public String getSignature() { return null; }
            @Override public String toGenericString() { return null; }
            @Override public java.lang.reflect.TypeVariable<?>[] getTypeParameters() { return new java.lang.reflect.TypeVariable<?>[0]; }
            @Override public Class<?> getDeclaringClass() { return null; }
            @Override public java.lang.reflect.Annotation[] getDeclaredAnnotations() { return new java.lang.reflect.Annotation[0]; }
            @Override public java.lang.reflect.Annotation getAnnotation(Class<? extends java.lang.annotation.Annotation> annotationClass) { return null; }
            @Override public java.lang.reflect.Annotation[] getParameterAnnotations() { return new java.lang.reflect.Annotation[0][]; }
            @Override public Object invoke(Object obj, Object... args) throws Throwable { return null; }
            @Override public boolean equals(Object obj) { return false; }
            @Override public int hashCode() { return 0; }
            @Override public String toString() { return null; }
            @Override public java.lang.reflect.AnnotatedType getAnnotatedReturnType() { return null; }
            @Override public java.lang.reflect.AnnotatedType[] getAnnotatedParameterTypes() { return new java.lang.reflect.AnnotatedType[0]; }
            @Override public java.lang.reflect.AnnotatedType getAnnotatedReceiverType() { return null; }
            @Override public java.lang.reflect.AnnotatedType[] getAnnotatedExceptionTypes() { return new java.lang.reflect.AnnotatedType[0]; }
        }
    }
}
