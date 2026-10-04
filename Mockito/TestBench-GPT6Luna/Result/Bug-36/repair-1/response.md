```java
package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import org.hamcrest.Matcher;
import org.mockito.exceptions.PrintableInvocation;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.matchers.*;
import org.mockito.internal.reporting.PrintSettings;
import org.mockito.internal.reporting.PrintingFriendlyInvocation;
import org.mockito.internal.util.*;
import org.mockito.invocation.InvocationOnMock;

public class InvocationTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructionAndBasicAccessors() throws Exception {
        Object mock = new Object();
        MockitoMethod method = new FixedMethod("sample", String.class, false, Object.class);
        Object[] args = new Object[] {"value"};
        Invocation invocation = new Invocation(mock, method, args, 7, null);

        assertSame(mock, invocation.getMock());
        assertSame(method, invocation.getMethod());
        assertSame(args, invocation.getRawArguments());
        assertEquals("value", invocation.getArguments()[0]);
        assertEquals(Integer.valueOf(7), invocation.getSequenceNumber());
        assertEquals(1, invocation.getArgumentsCount());
    }

    @Test
    public void testNullArgumentsBecomeEmptyForNonVarargsMethod() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", void.class, false, Object.class),
                null, 0, null);

        assertEquals(0, invocation.getArgumentsCount());
        assertEquals(0, invocation.getArguments().length);
        assertNull(invocation.getRawArguments());
    }

    @Test
    public void testVarargsArrayIsExpanded() throws Exception {
        Object[] runtimeArgs = new Object[] {"head", new String[] {"a", "b"}};
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", void.class, true, Object.class, String[].class),
                runtimeArgs, 1, null);

        assertEquals(3, invocation.getArgumentsCount());
        assertArrayEquals(new Object[] {"head", "a", "b"}, invocation.getArguments());
        assertSame(runtimeArgs, invocation.getRawArguments());
    }

    @Test
    public void testNullVarargsArrayBecomesOneNullArgument() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", void.class, true, Object.class, String[].class),
                new Object[] {"head", null}, 1, null);

        assertEquals(2, invocation.getArgumentsCount());
        assertArrayEquals(new Object[] {"head", null}, invocation.getArguments());
    }

    @Test
    public void testSingleVarargValueIsNotExpanded() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", void.class, true, Object.class, String[].class),
                new Object[] {"head", "tail"}, 1, null);

        assertEquals(2, invocation.getArgumentsCount());
        assertArrayEquals(new Object[] {"head", "tail"}, invocation.getArguments());
    }

    @Test
    public void testVerifiedFlagsInitiallyFalse() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", void.class, false, Object.class),
                new Object[0], 1, null);

        assertFalse(invocation.isVerified());
        assertFalse(invocation.isVerifiedInOrder());
    }

    @Test
    public void testEqualInvocationsIgnoreSequenceAndLocation() throws Exception {
        Object mock = new Object();
        MockitoMethod method = new FixedMethod("sample", String.class, false, Object.class);
        Invocation first = new Invocation(mock, method, new Object[] {"x"}, 1, null);
        Invocation second = new Invocation(mock, method, new Object[] {"x"}, 99, null);

        assertEquals(first, second);
    }

    @Test
    public void testDifferentArgumentsAreNotEqual() throws Exception {
        Object mock = new Object();
        MockitoMethod method = new FixedMethod("sample", String.class, false, Object.class);
        Invocation first = new Invocation(mock, method, new Object[] {"x"}, 1, null);
        Invocation second = new Invocation(mock, method, new Object[] {"y"}, 1, null);

        assertNotEquals(first, second);
    }

    @Test
    public void testEqualsRejectsNullAndDifferentClass() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", String.class, false, Object.class),
                new Object[0], 1, null);

        assertFalse(invocation.equals(null));
        assertFalse(invocation.equals(new Object()));
    }

    @Test
    public void testHashCodeThrows() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", void.class, false, Object.class),
                new Object[0], 1, null);

        try {
            invocation.hashCode();
            fail("expected RuntimeException");
        } catch (RuntimeException expected) {
            assertEquals("hashCode() is not implemented", expected.getMessage());
        }
    }

    @Test
    public void testValidExceptionMatchesDeclaredSupertype() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", void.class, false, Object.class,
                        new Class<?>[] {Exception.class}),
                new Object[0], 1, null);

        assertTrue(invocation.isValidException(new IllegalArgumentException()));
        assertFalse(invocation.isValidException(new Error()));
    }

    @Test
    public void testPrimitiveReturnTypeAcceptsMatchingWrapper() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", int.class, false, Object.class),
                new Object[0], 1, null);

        assertTrue(invocation.isValidReturnType(Integer.class));
        assertFalse(invocation.isValidReturnType(Long.class));
    }

    @Test
    public void testReferenceReturnTypeUsesAssignableTypes() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", Number.class, false, Object.class),
                new Object[0], 1, null);

        assertTrue(invocation.isValidReturnType(Integer.class));
        assertFalse(invocation.isValidReturnType(String.class));
    }

    @Test
    public void testVoidAndReturnTypeDescriptions() throws Exception {
        Invocation voidInvocation = new Invocation(new Object(),
                new FixedMethod("sample", void.class, false, Object.class),
                new Object[0], 1, null);
        Invocation intInvocation = new Invocation(new Object(),
                new FixedMethod("number", int.class, false, Object.class),
                new Object[0], 1, null);

        assertTrue(voidInvocation.isVoid());
        assertFalse(intInvocation.isVoid());
        assertEquals("void", voidInvocation.printMethodReturnType());
        assertEquals("number", intInvocation.getMethodName());
        assertTrue(intInvocation.returnsPrimitive());
        assertFalse(voidInvocation.getArgumentsCount() > 0);
    }

    @Test
    public void testReferenceReturnTypeIsNotPrimitive() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", String.class, false, Object.class),
                new Object[0], 1, null);

        assertFalse(invocation.returnsPrimitive());
        assertEquals("String", invocation.printMethodReturnType());
    }

    @Test
    public void testToStringDetectionForObjectToStringMethod() throws Exception {
        MockitoMethod method = new FixedMethod("toString", String.class, false, Object.class);
        Invocation invocation = new Invocation(new Object(), method, new Object[0], 1, null);

        assertTrue(Invocation.isToString(invocation));
    }

    @Test
    public void testToStringDetectionForDifferentMethod() throws Exception {
        MockitoMethod method = new FixedMethod("sample", String.class, false, Object.class);
        Invocation invocation = new Invocation(new Object(), method, new Object[0], 1, null);

        assertFalse(Invocation.isToString(invocation));
    }

    @Test
    public void testLocationIsAvailableAndStable() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", void.class, false, Object.class),
                new Object[0], 1, null);

        assertNotNull(invocation.getLocation());
        assertSame(invocation.getLocation(), invocation.getLocation());
    }

    @Test
    public void testToStringPrintSettingsMultilineOutput() throws Exception {
        Invocation invocation = new Invocation(new Object(),
                new FixedMethod("sample", void.class, false, Object.class),
                new Object[] {"x"}, 1, null);
        PrintSettings settings = new PrintSettings();
        settings.setMultiline(true);

        assertNotNull(invocation.toString(settings));
        assertTrue(invocation.toString(settings).contains("sample"));
    }

    @Test
    public void testCallRealMethodDelegatesForClassMethod() throws Exception {
        final Object marker = new Object();
        final Object mock = new Object();
        RealMethod realMethod = new RealMethod() {
            public Object invoke(Object target, Object[] arguments) {
                assertSame(mock, target);
                assertArrayEquals(new Object[] {"arg"}, arguments);
                return marker;
            }
        };
        Invocation invocation = new Invocation(mock,
                new FixedMethod("sample", Object.class, false, Object.class),
                new Object[] {"arg"}, 1, realMethod);

        try {
            assertSame(marker, invocation.callRealMethod());
        } catch (Throwable throwable) {
            throw new Exception(throwable);
        }
    }

    private static final class FixedMethod implements MockitoMethod {
        private final String name;
        private final Class<?> returnType;
        private final boolean varArgs;
        private final Class<?> declaringClass;
        private final Class<?>[] parameterTypes;
        private final Class<?>[] exceptionTypes;

        FixedMethod(String name, Class<?> returnType, boolean varArgs, Class<?> declaringClass,
                    Class<?>... parameterTypes) {
            this(name, returnType, varArgs, declaringClass, parameterTypes, new Class<?>[0]);
        }

        FixedMethod(String name, Class<?> returnType, boolean varArgs, Class<?> declaringClass,
                    Class<?>[] parameterTypes, Class<?>[] exceptionTypes) {
            this.name = name;
            this.returnType = returnType;
            this.varArgs = varArgs;
            this.declaringClass = declaringClass;
            this.parameterTypes = parameterTypes;
            this.exceptionTypes = exceptionTypes;
        }

        public Class<?> getReturnType() { return returnType; }
        public Class<?>[] getParameterTypes() { return parameterTypes; }
        public String getName() { return name; }
        public Class<?>[] getExceptionTypes() { return exceptionTypes; }
        public boolean isVarArgs() { return varArgs; }
        public Class<?> getDeclaringClass() { return declaringClass; }
    }
}
```