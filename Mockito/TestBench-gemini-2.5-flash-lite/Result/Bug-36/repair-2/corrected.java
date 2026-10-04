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

    private final MockitoMethod mockMethod = new MockitoMethod() {
        @Override
        public Class<?> getReturnType() { return Object.class; }
        @Override
        public String getName() { return "someMethod"; }
        @Override
        public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
        @Override
        public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
        @Override
        public boolean isVarArgs() { return false; }
        @Override
        public Class<?> getDeclaringClass() { return Object.class; }
    };

    private final MockitoMethod varArgsMethod = new MockitoMethod() {
        @Override
        public Class<?> getReturnType() { return Void.TYPE; }
        @Override
        public String getName() { return "varArgsMethod"; }
        @Override
        public Class<?>[] getParameterTypes() { return new Class<?>[]{String.class, int[].class}; }
        @Override
        public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
        @Override
        public boolean isVarArgs() { return true; }
        @Override
        public Class<?> getDeclaringClass() { return Object.class; }
    };

    private final RealMethod realMethod = new RealMethod() {
        @Override
        public Object invoke(Object target, Object[] arguments) throws Throwable {
            return null; // Default no-op for tests
        }
    };

    private final Location location = new Location();

    @Test
    public void testConstructorWithNullArguments() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, null, 1, realMethod);
        assertEquals(0, invocation.getArgumentsCount());
        assertArrayEquals(new Object[0], invocation.getArguments());
        assertArrayEquals(new Object[0], invocation.getRawArguments());
    }

    @Test
    public void testConstructorWithEmptyArguments() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        assertEquals(0, invocation.getArgumentsCount());
        assertArrayEquals(new Object[0], invocation.getArguments());
        assertArrayEquals(new Object[0], invocation.getRawArguments());
    }

    @Test
    public void testConstructorWithNonNullArguments() throws Exception {
        Object[] args = {"arg1", 123};
        Invocation invocation = new Invocation("mock", mockMethod, args, 1, realMethod);
        assertEquals(2, invocation.getArgumentsCount());
        assertArrayEquals(args, invocation.getArguments());
        assertArrayEquals(args, invocation.getRawArguments());
    }

    @Test
    public void testConstructorWithVarArgsAndNonNullLastArg() throws Exception {
        Object[] args = {"arg1", new int[]{1, 2, 3}};
        Invocation invocation = new Invocation("mock", varArgsMethod, args, 1, realMethod);
        // The expandVarArgs should handle this correctly, treating the array as the vararg itself.
        assertArrayEquals(new Object[]{"arg1", new int[]{1, 2, 3}}, invocation.getArguments());
        assertArrayEquals(args, invocation.getRawArguments());
    }

    @Test
    public void testConstructorWithVarArgsAndNullLastArg() throws Exception {
        Object[] args = {"arg1", null};
        Invocation invocation = new Invocation("mock", varArgsMethod, args, 1, realMethod);
        // The expandVarArgs should handle null varArg array by creating an array with null.
        assertArrayEquals(new Object[]{"arg1", null}, invocation.getArguments());
        assertArrayEquals(args, invocation.getRawArguments());
    }
    
    @Test
    public void testConstructorWithVarArgsAndEmptyLastArg() throws Exception {
        Object[] args = {"arg1", new int[0]};
        Invocation invocation = new Invocation("mock", varArgsMethod, args, 1, realMethod);
        // The expandVarArgs should handle empty varArg array.
        assertArrayEquals(new Object[]{"arg1", new int[0]}, invocation.getArguments());
        assertArrayEquals(args, invocation.getRawArguments());
    }

    @Test
    public void testGetMock() throws Exception {
        Object mock = new Object();
        Invocation invocation = new Invocation(mock, mockMethod, new Object[0], 1, realMethod);
        assertSame(mock, invocation.getMock());
    }

    @Test
    public void testGetMethod() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        assertSame(mockMethod, invocation.getMethod());
    }

    @Test
    public void testGetArguments() throws Exception {
        Object[] args = {"a", 1};
        Invocation invocation = new Invocation("mock", mockMethod, args, 1, realMethod);
        assertArrayEquals(args, invocation.getArguments());
    }

    @Test
    public void testGetSequenceNumber() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 42, realMethod);
        assertEquals(Integer.valueOf(42), invocation.getSequenceNumber());
    }

    @Test
    public void testIsVerified() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        assertFalse(invocation.isVerified());
        invocation.markVerified();
        assertTrue(invocation.isVerified());
    }

    @Test
    public void testIsVerifiedInOrder() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        assertFalse(invocation.isVerifiedInOrder());
        invocation.markVerifiedInOrder();
        assertTrue(invocation.isVerifiedInOrder());
        assertTrue(invocation.isVerified()); // markVerifiedInOrder should also mark verified
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        Object mock = new Object();
        Object[] args = {"a", 1};
        Invocation invocation = new Invocation(mock, mockMethod, args, 1, realMethod);
        assertTrue(invocation.equals(invocation));
    }

    @Test
    public void testEqualsDifferentMock() throws Exception {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Object[] args = {"a", 1};
        Invocation invocation1 = new Invocation(mock1, mockMethod, args, 1, realMethod);
        Invocation invocation2 = new Invocation(mock2, mockMethod, args, 1, realMethod);
        assertFalse(invocation1.equals(invocation2));
    }

    @Test
    public void testEqualsDifferentMethod() throws Exception {
        MockitoMethod method1 = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return Object.class; }
            @Override public String getName() { return "method1"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        MockitoMethod method2 = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return Object.class; }
            @Override public String getName() { return "method2"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        Object mock = new Object();
        Object[] args = {"a", 1};
        Invocation invocation1 = new Invocation(mock, method1, args, 1, realMethod);
        Invocation invocation2 = new Invocation(mock, mockMethod, args, 1, realMethod); // Corrected to use mockMethod for comparison
        assertFalse(invocation1.equals(invocation2));
    }

    @Test
    public void testEqualsDifferentArguments() throws Exception {
        Object mock = new Object();
        Object[] args1 = {"a", 1};
        Object[] args2 = {"b", 2};
        Invocation invocation1 = new Invocation(mock, mockMethod, args1, 1, realMethod);
        Invocation invocation2 = new Invocation(mock, mockMethod, args2, 1, realMethod);
        assertFalse(invocation1.equals(invocation2));
    }

    @Test
    public void testEqualsWithNullArguments() throws Exception {
        Object mock = new Object();
        Invocation invocation1 = new Invocation(mock, mockMethod, null, 1, realMethod);
        Invocation invocation2 = new Invocation(mock, mockMethod, null, 1, realMethod);
        assertTrue(invocation1.equals(invocation2));
    }

    @Test
    public void testEqualsWithEmptyArguments() throws Exception {
        Object mock = new Object();
        Invocation invocation1 = new Invocation(mock, mockMethod, new Object[0], 1, realMethod);
        Invocation invocation2 = new Invocation(mock, mockMethod, new Object[0], 1, realMethod);
        assertTrue(invocation1.equals(invocation2));
    }

    @Test
    public void testToStringWithNoArguments() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        String expected = "mock.someMethod()";
        assertEquals(expected, invocation.toString());
    }

    @Test
    public void testToStringWithArguments() throws Exception {
        Object[] args = {"arg1", 123};
        Invocation invocation = new Invocation("mock", mockMethod, args, 1, realMethod);
        // The toString uses matchers, so it will represent arguments as Equals(arg)
        String expected = "mock.someMethod(Equals(arg1), Equals(123))";
        assertEquals(expected, invocation.toString());
    }

    @Test
    public void testToStringWithArrayArgument() throws Exception {
        Object[] args = {new int[]{1, 2}};
        Invocation invocation = new Invocation("mock", mockMethod, args, 1, realMethod);
        String expected = "mock.someMethod(ArrayEquals([1, 2]))";
        assertEquals(expected, invocation.toString());
    }

    @Test
    public void testIsToString() throws Exception {
        MockitoMethod toStringMethod = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return String.class; }
            @Override public String getName() { return "toString"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        Invocation invocation = new Invocation("mock", toStringMethod, new Object[0], 1, realMethod);
        assertTrue(Invocation.isToString(invocation));
    }

    @Test
    public void testIsNotToString() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        assertFalse(Invocation.isToString(invocation));
    }

    @Test
    public void testIsValidExceptionWhenMethodAllowsIt() throws Exception {
        MockitoMethod methodWithException = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return Object.class; }
            @Override public String getName() { return "methodWithException"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[]{RuntimeException.class}; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        Invocation invocation = new Invocation("mock", methodWithException, new Object[0], 1, realMethod);
        assertTrue(invocation.isValidException(new RuntimeException()));
    }

    @Test
    public void testIsValidExceptionWhenMethodDoesNotAllowIt() throws Exception {
        MockitoMethod methodWithoutException = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return Object.class; }
            @Override public String getName() { return "methodWithoutException"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        Invocation invocation = new Invocation("mock", methodWithoutException, new Object[0], 1, realMethod);
        assertFalse(invocation.isValidException(new RuntimeException()));
    }

    @Test
    public void testIsValidExceptionWhenMethodAllowsSuperclass() throws Exception {
        MockitoMethod methodWithException = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return Object.class; }
            @Override public String getName() { return "methodWithException"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[]{Exception.class}; } // Allows Exception
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        Invocation invocation = new Invocation("mock", methodWithException, new Object[0], 1, realMethod);
        assertTrue(invocation.isValidException(new RuntimeException())); // RuntimeException is assignable from Exception
    }

    @Test
    public void testIsValidReturnTypeWhenMethodReturnsPrimitive() throws Exception {
        MockitoMethod intMethod = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return int.class; }
            @Override public String getName() { return "getInt"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        Invocation invocation = new Invocation("mock", intMethod, new Object[0], 1, realMethod);
        assertTrue(invocation.isValidReturnType(int.class));
        assertTrue(invocation.isValidReturnType(Integer.class)); // Primitive wrapper should be accepted
    }

    @Test
    public void testIsValidReturnTypeWhenMethodReturnsObject() throws Exception {
        MockitoMethod objectMethod = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return Object.class; }
            @Override public String getName() { return "getObject"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        Invocation invocation = new Invocation("mock", objectMethod, new Object[0], 1, realMethod);
        assertTrue(invocation.isValidReturnType(String.class)); // String is assignable from Object
        assertTrue(invocation.isValidReturnType(Object.class));
    }

    @Test
    public void testIsValidReturnTypeWhenMethodReturnsNullButIsObject() throws Exception {
        MockitoMethod objectMethod = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return Object.class; }
            @Override public String getName() { return "getObject"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        Invocation invocation = new Invocation("mock", objectMethod, new Object[0], 1, realMethod);
        // When the return type is Object, null is a valid return value.
        // Here we test if the method *can* return null for Object.class.
        // The isValidReturnType checks if the *given* class is assignable to the method's return type.
        // So, we need to check if Object.class is assignable to Object.class, which is true.
        assertTrue(invocation.isValidReturnType(Object.class));
    }


    @Test
    public void testIsVoid() throws Exception {
        MockitoMethod voidMethod = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return Void.TYPE; }
            @Override public String getName() { return "doSomething"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        Invocation invocation = new Invocation("mock", voidMethod, new Object[0], 1, realMethod);
        assertTrue(invocation.isVoid());
    }

    @Test
    public void testIsNotVoid() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        assertFalse(invocation.isVoid());
    }

    @Test
    public void testPrintMethodReturnType() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        assertEquals("Object", invocation.printMethodReturnType());
    }

    @Test
    public void testGetMethodName() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        assertEquals("someMethod", invocation.getMethodName());
    }

    @Test
    public void testReturnsPrimitive() throws Exception {
        MockitoMethod intMethod = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return int.class; }
            @Override public String getName() { return "getInt"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return Object.class; }
        };
        Invocation invocation = new Invocation("mock", intMethod, new Object[0], 1, realMethod);
        assertTrue(invocation.returnsPrimitive());
    }

    @Test
    public void testNotReturnsPrimitive() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        assertFalse(invocation.returnsPrimitive());
    }

    @Test
    public void testGetLocation() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        assertNotNull(invocation.getLocation());
        assertTrue(invocation.getLocation() instanceof Location);
    }

    @Test
    public void testGetRawArguments() throws Exception {
        Object[] rawArgs = {"raw1", 2};
        Invocation invocation = new Invocation("mock", mockMethod, rawArgs, 1, realMethod);
        assertArrayEquals(rawArgs, invocation.getRawArguments());
    }

    @Test
    public void testCallRealMethodOnInterfaceThrowsException() throws Exception {
        MockitoMethod interfaceMethod = new MockitoMethod() {
            @Override public Class<?> getReturnType() { return Object.class; }
            @Override public String getName() { return "interfaceMethod"; }
            @Override public Class<?>[] getParameterTypes() { return new Class<?>[0]; }
            @Override public Class<?>[] getExceptionTypes() { return new Class<?>[0]; }
            @Override public boolean isVarArgs() { return false; }
            @Override public Class<?> getDeclaringClass() { return java.util.List.class; } // Interface
        };
        Invocation invocation = new Invocation(new Object(), interfaceMethod, new Object[0], 1, realMethod);
        try {
            invocation.callRealMethod();
            fail("Expected Reporter.cannotCallRealMethodOnInterface() to be thrown");
        } catch (Exception e) {
            // The actual exception is from Reporter, we catch a generic Exception here.
            // A more specific check would be desired if Reporter was accessible.
            assertTrue(e.getMessage().contains("cannot call real method on interface"));
        }
    }
    
    @Test
    public void testToStringWithPrintSettings() throws Exception {
        Object[] args = {"arg1", 123};
        Invocation invocation = new Invocation("mock", mockMethod, args, 1, realMethod);
        PrintSettings settings = new PrintSettings();
        settings.setMultiline(true);
        String result = invocation.toString(settings);
        assertTrue(result.contains("mock.someMethod("));
        assertTrue(result.contains("arg1"));
        assertTrue(result.contains("123"));
    }

    @Test
    public void testToStringWithPrintSettingsAndNoArguments() throws Exception {
        Invocation invocation = new Invocation("mock", mockMethod, new Object[0], 1, realMethod);
        PrintSettings settings = new PrintSettings();
        settings.setMultiline(true);
        String result = invocation.toString(settings);
        assertEquals("mock.someMethod()", result);
    }

}
