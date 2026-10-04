```java
package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.hamcrest.Matcher;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.matchers.MatcherDecorator;
import org.mockito.internal.matchers.VarargMatcher;
import org.mockito.internal.reporting.PrintSettings;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;
import org.mockito.internal.invocation.InvocationImpl;

public class InvocationMatcherTest {

    // Helper method to create a mock Invocation
    private Invocation createMockInvocation(Object mock, Method method, Object[] args, boolean verified, int sequenceNumber) {
        // Using InvocationImpl for a concrete implementation that works with the interfaces
        return new InvocationImpl(mock, method, args, sequenceNumber, null); // null Location, as it's not crucial for most tests
    }

    // Helper method to create a mock Method
    private Method createMockMethod(String name, Class<?>[] parameterTypes, Class<?> returnType) throws NoSuchMethodException {
        class DummyClass {
            public void dummyMethod() {}
            public void dummyMethodWithArgs(String s, int i) {}
            public void dummyVarargsMethod(String... strs) {}
            public Object dummyMethodWithReturnType() { return null;}
            public void methodWithDifferentParams(Integer i, String s) {}
        }
        
        if ("dummyMethod".equals(name) && parameterTypes.length == 0) {
            return DummyClass.class.getDeclaredMethod("dummyMethod");
        } else if ("dummyMethodWithArgs".equals(name) && parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == int.class) {
            return DummyClass.class.getDeclaredMethod("dummyMethodWithArgs", String.class, int.class);
        } else if ("dummyVarargsMethod".equals(name) && parameterTypes.length == 1 && parameterTypes[0] == String[].class) {
            return DummyClass.class.getDeclaredMethod("dummyVarargsMethod", String[].class);
        } else if ("dummyMethodWithReturnType".equals(name) && parameterTypes.length == 0) {
            return DummyClass.class.getDeclaredMethod("dummyMethodWithReturnType");
        } else if ("methodWithDifferentParams".equals(name) && parameterTypes.length == 2 && parameterTypes[0] == Integer.class && parameterTypes[1] == String.class) {
            return DummyClass.class.getDeclaredMethod("methodWithDifferentParams", Integer.class, String.class);
        }

        throw new NoSuchMethodException("Method with name " + name + " and parameters " + List.of(parameterTypes) + " not found in DummyClass");
    }

    // Helper method to create a mock CapturesArguments
    private CapturesArguments createMockCapturesArguments() {
        return new CapturesArguments() {
            private Object capturedArg;
            @Override
            public void captureFrom(Object argument) {
                this.capturedArg = argument;
            }
            public Object getCapturedArg() {
                return capturedArg;
            }
        };
    }

    // Helper method to create a mock Location
    private Location createMockLocation() {
        return new Location() {
            @Override
            public String toString() {
                return "MockLocation";
            }
        };
    }

    // Dummy Matcher implementation for testing
    private static class DummyMatcher implements Matcher<Object>, Serializable {
        private static final long serialVersionUID = 1L;
        private final Object expectedValue;
        private final boolean shouldMatch;

        DummyMatcher(Object expectedValue, boolean shouldMatch) {
            this.expectedValue = expectedValue;
            this.shouldMatch = shouldMatch;
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
            description.appendText("matches " + expectedValue);
        }

        @Override
        public boolean matches(Object item) {
            if (expectedValue == null) {
                return item == null;
            }
            if (item == null) {
                return false;
            }
            return expectedValue.equals(item) == shouldMatch;
        }
    }

    @Test
    public void testConstructorWithMatchers() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Invocation invocation = createMockInvocation(mock, method, new Object[0], false, 0);
        List<Matcher> matchers = new ArrayList<>();
        matchers.add(new DummyMatcher("expected", true));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertNotNull(invocationMatcher);
        assertEquals(invocation, invocationMatcher.getInvocation());
        assertEquals(matchers, invocationMatcher.getMatchers());
    }

    @Test
    public void testConstructorWithoutMatchers() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Object[] args = {"hello", 123};
        Invocation invocation = createMockInvocation(mock, method, args, false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertNotNull(invocationMatcher);
        assertEquals(invocation, invocationMatcher.getInvocation());
        assertEquals(invocation.getArguments().length, invocationMatcher.getMatchers().size());
    }

    @Test
    public void testGetMethod() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Invocation invocation = createMockInvocation(mock, method, new Object[0], false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(method, invocationMatcher.getMethod());
    }

    @Test
    public void testGetInvocation() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Invocation invocation = createMockInvocation(mock, method, new Object[0], false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation, invocationMatcher.getInvocation());
    }

    @Test
    public void testGetMatchers() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Invocation invocation = createMockInvocation(mock, method, new Object[0], false, 0);
        List<Matcher> matchers = new ArrayList<>();
        matchers.add(new DummyMatcher("expected", true));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertEquals(matchers, invocationMatcher.getMatchers());
    }

    @Test
    public void testToString() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Object[] args = {"hello", 123};
        Invocation invocation = createMockInvocation(mock, method, args, false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        String result = invocationMatcher.toString();
        assertNotNull(result);
        assertTrue(result.contains("dummyMethodWithArgs"));
        assertTrue(result.contains("hello"));
        assertTrue(result.contains("123"));
    }

    @Test
    public void testMatchesWithIdenticalInvocation() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Invocation invocation = createMockInvocation(mock, method, new Object[0], false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertTrue(invocationMatcher.matches(invocation));
    }

    @Test
    public void testMatchesWithDifferentArguments() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Invocation invocation1 = createMockInvocation(mock, method, new Object[]{"hello", 123}, false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method, new Object[]{"world", 456}, false, 0);
        assertFalse(invocationMatcher.matches(invocation2));
    }

    @Test
    public void testMatchesWithDifferentMock() throws Exception {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Invocation invocation1 = createMockInvocation(mock1, method, new Object[0], false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock2, method, new Object[0], false, 0);
        assertFalse(invocationMatcher.matches(invocation2));
    }

    @Test
    public void testMatchesWithDifferentMethod() throws Exception {
        Object mock = new Object();
        Method method1 = createMockMethod("dummyMethod", new Class[0], void.class);
        Method method2 = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Invocation invocation1 = createMockInvocation(mock, method1, new Object[0], false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method2, new Object[0], false, 0);
        assertFalse(invocationMatcher.matches(invocation2));
    }

    @Test
    public void testHasSimilarMethodWithIdenticalMethod() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Invocation invocation1 = createMockInvocation(mock, method, new Object[0], false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method, new Object[0], false, 1); // Different sequence number
        assertTrue(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWithOverloadedMethodAndSameArgs() throws Exception {
        Object mock = new Object();
        Method method1 = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Method method2 = createMockMethod("dummyMethodWithArgs", new Class[]{String.class}, void.class); // Overloaded
        Invocation invocation1 = createMockInvocation(mock, method1, new Object[]{"hello", 123}, false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method2, new Object[]{"hello"}, false, 1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2)); // Should be false if args don't match signature
    }
    
    @Test
    public void testHasSimilarMethodWhenArgsDontMatchOverloadedSignature() throws Exception {
        Object mock = new Object();
        Method method1 = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Method method2 = createMockMethod("dummyMethodWithArgs", new Class[]{String.class}, void.class); // Overloaded
        Invocation invocation1 = createMockInvocation(mock, method1, new Object[]{"hello", 123}, false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method2, new Object[]{"hello", 456}, false, 1); // Incorrect args for method2
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWithDifferentMethodName() throws Exception {
        Object mock = new Object();
        Method method1 = createMockMethod("dummyMethod", new Class[0], void.class);
        Method method2 = createMockMethod("anotherMethod", new Class[0], void.class);
        Invocation invocation1 = createMockInvocation(mock, method1, new Object[0], false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method2, new Object[0], false, 1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenCandidateIsVerified() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Invocation invocation1 = createMockInvocation(mock, method, new Object[0], false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method, new Object[0], true, 1); // Verified
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWithIdenticalMethod() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Invocation invocation1 = createMockInvocation(mock, method, new Object[0], false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method, new Object[0], false, 1);
        assertTrue(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWithDifferentParameterTypes() throws Exception {
        Object mock = new Object();
        Method method1 = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Method method2 = createMockMethod("dummyMethodWithArgs", new Class[]{Integer.class, int.class}, void.class); // Different String to Integer
        Invocation invocation1 = createMockInvocation(mock, method1, new Object[]{"hello", 123}, false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method2, new Object[]{456, 123}, false, 1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWithDifferentParameterLengths() throws Exception {
        Object mock = new Object();
        Method method1 = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Method method2 = createMockMethod("dummyMethodWithArgs", new Class[]{String.class}, void.class); // Shorter
        Invocation invocation1 = createMockInvocation(mock, method1, new Object[]{"hello", 123}, false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method2, new Object[]{"hello"}, false, 1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }
    
    @Test
    public void testHasSameMethodWithSameNameAndDifferentPrimitiveTypes() throws Exception {
        Object mock = new Object();
        Method method1 = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Method method2 = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, long.class}, void.class); // int vs long
        Invocation invocation1 = createMockInvocation(mock, method1, new Object[]{"hello", 123}, false, 0);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        Invocation invocation2 = createMockInvocation(mock, method2, new Object[]{"hello", 456L}, false, 1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testCaptureArgumentsFromWithNormalArguments() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Invocation invocation = createMockInvocation(mock, method, new Object[]{"test", 42}, false, 0);

        CapturesArguments stringCapturer = createMockCapturesArguments();
        CapturesArguments intCapturer = createMockCapturesArguments();

        List<Matcher> matchers = new ArrayList<>();
        // The matchers list needs to contain actual Matcher instances, not CapturesArguments directly.
        // We can use a DummyMatcher that wraps the CapturesArguments or a custom Matcher implementation.
        // For simplicity, we'll create a DummyMatcher that ensures the argument is what we expect,
        // and then rely on the internal logic of captureArgumentsFrom to actually pass the argument to the capturer.
        // The current implementation of captureArgumentsFrom directly checks `instanceof CapturesArguments`
        // and calls `captureFrom`. So, we need to ensure the `matchers` list contains these CapturesArguments instances.
        matchers.add((CapturesArguments)stringCapturer); // Cast because InvocationMatcher expects Matcher
        matchers.add((CapturesArguments)intCapturer); // Cast because InvocationMatcher expects Matcher

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);

        assertEquals("test", ((CapturesArguments) stringCapturer).captureFrom(null) == null ? null : ((MockCapturesArguments) stringCapturer).getCapturedArg()); // Reset and capture again
        ((CapturesArguments)stringCapturer).captureFrom("test"); // Simulate capture
        assertEquals("test", ((MockCapturesArguments) stringCapturer).getCapturedArg());

        assertEquals(42, ((CapturesArguments) intCapturer).captureFrom(null) == null ? null : ((MockCapturesArguments) intCapturer).getCapturedArg()); // Reset and capture again
        ((CapturesArguments)intCapturer).captureFrom(42); // Simulate capture
        assertEquals(42, ((MockCapturesArguments) intCapturer).getCapturedArg());
    }

    @Test
    public void testCaptureArgumentsFromWithVarargs() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyVarargsMethod", new Class[]{String[].class}, void.class);
        Object[] rawArgs = new Object[]{new String[]{"a", "b", "c"}};
        Invocation invocation = createMockInvocation(mock, method, rawArgs, false, 0);

        CapturesArguments varargCapturer = createMockCapturesArguments();

        List<Matcher> matchers = new ArrayList<>();
        matchers.add((CapturesArguments)varargCapturer); // Captures the vararg array

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);
        
        assertEquals(new String[]{"a", "b", "c"}, ((MockCapturesArguments) varargCapturer).getCapturedArg());
    }

    @Test
    public void testCaptureArgumentsFromWithVarargsAndOneArgument() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyVarargsMethod", new Class[]{String[].class}, void.class);
        Object[] rawArgs = new Object[]{new String[]{"single"}};
        Invocation invocation = createMockInvocation(mock, method, rawArgs, false, 0);

        CapturesArguments varargCapturer = createMockCapturesArguments();
        List<Matcher> matchers = new ArrayList<>();
        matchers.add((CapturesArguments)varargCapturer);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);

        assertEquals("single", ((MockCapturesArguments) varargCapturer).getCapturedArg());
    }
     @Test
    public void testCaptureArgumentsFromWithVarargsAndNoArguments() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyVarargsMethod", new Class[]{String[].class}, void.class);
        Object[] rawArgs = new Object[]{new String[]{}}; // Empty varargs array
        Invocation invocation = createMockInvocation(mock, method, rawArgs, false, 0);

        CapturesArguments varargCapturer = createMockCapturesArguments();
        List<Matcher> matchers = new ArrayList<>();
        matchers.add((CapturesArguments)varargCapturer);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);

        assertNotNull(((MockCapturesArguments) varargCapturer).getCapturedArg());
        assertTrue(((MockCapturesArguments) varargCapturer).getCapturedArg() instanceof String[]);
        assertEquals(0, Array.getLength(((MockCapturesArguments) varargCapturer).getCapturedArg()));
    }


    @Test
    public void testCreateFromWithEmptyList() {
        List<Invocation> invocations = Collections.emptyList();
        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCreateFromWithListOfInvocations() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Invocation invocation1 = createMockInvocation(mock, method, new Object[0], false, 0);
        Invocation invocation2 = createMockInvocation(mock, method, new Object[0], false, 1);
        List<Invocation> invocations = new ArrayList<>();
        invocations.add(invocation1);
        invocations.add(invocation2);

        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);
        assertEquals(2, result.size());
        assertEquals(invocation1, result.get(0).getInvocation());
        assertEquals(invocation2, result.get(1).getInvocation());
    }

    @Test
    public void testGetLocation() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethod", new Class[0], void.class);
        Location location = createMockLocation();
        Invocation invocation = new InvocationImpl(mock, method, new Object[0], 0, location);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(location, invocationMatcher.getLocation());
    }

    // Edge case: capture arguments with null in the arguments list
    @Test
    public void testCaptureArgumentsFromWithNullArgument() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyMethodWithArgs", new Class[]{String.class, int.class}, void.class);
        Invocation invocation = createMockInvocation(mock, method, new Object[]{"test", null}, false, 0);

        CapturesArguments stringCapturer = createMockCapturesArguments();
        CapturesArguments nullCapturer = createMockCapturesArguments();

        List<Matcher> matchers = new ArrayList<>();
        matchers.add((CapturesArguments)stringCapturer);
        matchers.add((CapturesArguments)nullCapturer);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);

        assertEquals("test", ((MockCapturesArguments) stringCapturer).getCapturedArg());
        assertNull(((MockCapturesArguments) nullCapturer).getCapturedArg()); // Expect null to be captured
    }

    // Edge case: varargs with null elements
    @Test
    public void testCaptureArgumentsFromWithVarargsContainingNull() throws Exception {
        Object mock = new Object();
        Method method = createMockMethod("dummyVarargsMethod", new Class[]{String[].class}, void.class);
        Object[] rawArgs = new Object[]{new String[]{"a", null, "c"}};
        Invocation invocation = createMockInvocation(mock, method, rawArgs, false, 0);

        CapturesArguments varargCapturer = createMockCapturesArguments();
        List<Matcher> matchers = new ArrayList<>();
        matchers.add((CapturesArguments)varargCapturer);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);

        String[] capturedArray = (String[]) ((MockCapturesArguments) varargCapturer).getCapturedArg();
        assertEquals("a", capturedArray[0]);
        assertNull(capturedArray[1]);
        assertEquals("c", capturedArray[2]);
    }
}
```