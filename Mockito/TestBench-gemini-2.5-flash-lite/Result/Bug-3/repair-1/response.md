```java
package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.*;
import org.hamcrest.Matcher;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.matchers.MatcherDecorator;
import org.mockito.internal.reporting.PrintSettings;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;
import org.mockito.exceptions.base.MockitoException; // Added import for MockitoException
import org.mockito.internal.stubbing.StubInfo; // Added import for StubInfo

public class InvocationMatcherTest {

    // Mocking helper classes that are not provided in the API outline
    // These are minimal implementations to allow compilation and testing
    static class MockInvocation implements Invocation {
        private Object mock;
        private Method method;
        private Object[] arguments;
        private boolean verified;
        private Location location;
        private StubInfo stubInfo; // Added to fulfill StubInfo requirement

        MockInvocation(Object mock, Method method, Object... args) {
            this.mock = mock;
            this.method = method;
            this.arguments = args;
            this.verified = false;
            this.location = new MockLocation();
            this.stubInfo = null; // Default to null
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
        public Object getArgumentAt(int index, Class type) {
            if (index < 0 || index >= arguments.length) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + arguments.length);
            }
            Object arg = arguments[index];
            if (type.isPrimitive()) {
                if (type == boolean.class && arg instanceof Boolean && !(Boolean)arg) return false;
                if (type == int.class && arg instanceof Integer && !(Integer)arg) return 0;
                if (type == long.class && arg instanceof Long && !(Long)arg) return 0L;
                if (type == double.class && arg instanceof Double && !(Double)arg) return 0.0;
                if (type == float.class && arg instanceof Float && !(Float)arg) return 0.0f;
                if (type == short.class && arg instanceof Short && !(Short)arg) return (short)0;
                if (type == byte.class && arg instanceof Byte && !(Byte)arg) return (byte)0;
                if (type == char.class && arg instanceof Character && !(Character)arg) return '\u0000';
            }
            if (arg != null && !type.isAssignableFrom(arg.getClass())) {
                throw new ClassCastException("Argument at index " + index + " is of type " + arg.getClass().getName() + " but expected " + type.getName());
            }
            return arg;
        }

        @Override
        public Object[] getRawArguments() {
            return arguments;
        }

        @Override
        public boolean isVerified() {
            return verified;
        }

        @Override
        public void markVerified() {
            this.verified = true;
        }

        @Override
        public Location getLocation() {
            return location;
        }

        @Override
        public int getSequenceNumber() {
            return 0; // Not relevant for these tests
        }

        @Override
        public StubInfo stubInfo() {
            return stubInfo;
        }

        @Override
        public void markStubbed(StubInfo stubInfo) {
            this.stubInfo = stubInfo;
        }

        @Override
        public boolean isIgnoredForVerification() {
            return false; // Not relevant for these tests
        }

        @Override
        public void ignoreForVerification() {
            // No-op
        }

        @Override
        public Class getRawReturnType() {
            return method.getReturnType();
        }

        @Override
        public String toString() {
            return method.getName() + Arrays.toString(arguments);
        }
    }

    static class MockLocation implements Location {
        @Override
        public String toString() {
            return "MockLocation";
        }
    }

    // Removed MockMatcher and MockCapturingMatcher as they were not correctly implementing Matcher
    // Instead, using Hamcrest's built-in Matchers or Mockito's internal Matchers if necessary.
    // For simplicity in this context, we will simulate matchers that just check for equality.

    private static class EqualityMatcher<T> implements Matcher<T> {
        private final T expected;

        EqualityMatcher(T expected) {
            this.expected = expected;
        }

        @Override
        public boolean matches(Object item) {
            return Objects.equals(item, expected);
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
            description.appendText("equal to ").appendValue(expected);
        }
    }

    private static class CapturingMatcher<T> extends EqualityMatcher<T> implements CapturesArguments {
        private Object captured = null;

        CapturingMatcher(T expected) {
            super(expected);
        }

        @Override
        public void captureFrom(Object argument) {
            this.captured = argument;
        }

        public Object getCaptured() {
            return captured;
        }
    }

    private Method findMethod(String name, Class<?>... paramTypes) throws NoSuchMethodException {
        // Try to find the method in InvocationMatcher itself first
        try {
            return InvocationMatcher.class.getMethod(name, paramTypes);
        } catch (NoSuchMethodException e) {
            // If not found, try to find a method on Object that might be used by InvocationMatcher
            // This is a fallback and might not cover all cases but is necessary for compilation.
            return Object.class.getMethod(name, paramTypes);
        }
    }

    // Helper to create a simple Invocation object
    private Invocation createInvocation(Object mock, String methodName, Object... args) throws NoSuchMethodException {
        Method method = findMethod(methodName, getParameterTypes(args));
        return new MockInvocation(mock, method, args);
    }

    // Helper to get parameter types from arguments
    private Class<?>[] getParameterTypes(Object... args) {
        Class<?>[] types = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            types[i] = args[i].getClass();
        }
        return types;
    }

    @Test
    public void testConstructorWithMatchers() throws Exception {
        Object mock = new Object();
        Method method = findMethod("getMethod"); // Use a method from InvocationMatcher itself for simulation
        Invocation invocation = createInvocation(mock, "getMethod");
        List<Matcher> matchers = Arrays.asList(new EqualityMatcher<>("arg1"), new EqualityMatcher<>(123));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertNotNull(invocationMatcher);
        assertEquals(2, invocationMatcher.getMatchers().size());
        assertEquals(invocation, invocationMatcher.getInvocation());
    }

    @Test
    public void testConstructorWithoutMatchers() throws Exception {
        Object mock = new Object();
        Method method = findMethod("getMethod");
        Invocation invocation = createInvocation(mock, "getMethod", "arg1", 123);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertNotNull(invocationMatcher);
        // When matchers are empty, ArgumentsProcessor.argumentsToMatchers is called.
        // We can't directly test ArgumentsProcessor's output without its source.
        // We assume it creates matchers for the arguments.
        assertTrue(invocationMatcher.getMatchers().size() > 0);
        assertEquals(invocation, invocationMatcher.getInvocation());
    }

    @Test
    public void testGetMethod() throws Exception {
        Object mock = new Object();
        Method method = findMethod("getMethod");
        Invocation invocation = createInvocation(mock, "getMethod");
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(method, invocationMatcher.getMethod());
    }

    @Test
    public void testGetInvocation() throws Exception {
        Object mock = new Object();
        Method method = findMethod("getInvocation");
        Invocation invocation = createInvocation(mock, "getInvocation");
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation, invocationMatcher.getInvocation());
    }

    @Test
    public void testGetMatchers() throws Exception {
        Object mock = new Object();
        Method method = findMethod("getMatchers");
        Invocation invocation = createInvocation(mock, "getMatchers", "arg1");
        List<Matcher> matchers = Collections.singletonList(new EqualityMatcher<>("arg1"));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertEquals(matchers, invocationMatcher.getMatchers());
    }

    @Test
    public void testToString() throws Exception {
        Object mock = new Object();
        Method method = findMethod("toString");
        Invocation invocation = createInvocation(mock, "toString", "someArg");
        List<Matcher> matchers = Collections.singletonList(new EqualityMatcher<>("someArg"));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        // The toString method uses PrintSettings. We can't fully mock PrintSettings easily.
        // Asserting it's not null and contains expected string parts is a reasonable approach.
        String representation = invocationMatcher.toString();
        assertNotNull(representation);
        assertTrue(representation.contains("someArg")); // Basic check for argument
    }

    @Test
    public void testMatchesWhenExactMatch() throws Exception {
        Object mock = new Object();
        Method method = findMethod("matches", Invocation.class);
        Invocation invocation1 = createInvocation(mock, "matches", new Object()); // Dummy invocation for method signature
        Invocation invocation2 = createInvocation(mock, "matches", new Object()); // Dummy invocation for method signature

        // Set up invocation1 for InvocationMatcher
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

        // Create an actual invocation that should match
        Invocation actualInvocation = createInvocation(mock, "matches", new Object());
        assertTrue(invocationMatcher.matches(actualInvocation));
    }

    @Test
    public void testMatchesWhenArgumentMismatch() throws Exception {
        Object mock = new Object();
        Method method = findMethod("matches", Invocation.class);
        Invocation invocation1 = createInvocation(mock, "matches", new Object());
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

        // Create an actual invocation with different arguments
        Invocation actualInvocation = createInvocation(mock, "matches", new Object(), 123); // Different arg count
        assertFalse(invocationMatcher.matches(actualInvocation));
    }

    @Test
    public void testMatchesWhenDifferentMock() throws Exception {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Method method = findMethod("matches", Invocation.class);
        Invocation invocation1 = createInvocation(mock1, "matches", new Object());
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

        Invocation actualInvocation = createInvocation(mock2, "matches", new Object()); // Different mock
        assertFalse(invocationMatcher.matches(actualInvocation));
    }

    @Test
    public void testMatchesWhenDifferentMethod() throws Exception {
        Object mock = new Object();
        Method method1 = findMethod("matches", Invocation.class);
        Method method2 = findMethod("hashCode"); // A different method
        Invocation invocation1 = createInvocation(mock, "matches", new Object());
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

        Invocation actualInvocation = new MockInvocation(mock, method2, new Object()); // Different method
        assertFalse(invocationMatcher.matches(actualInvocation));
    }

    @Test
    public void testMatchesWhenDifferentNumberOfArguments() throws Exception {
        Object mock = new Object();
        // Simulate a method that takes one argument
        Method method = findMethod("getMethod", String.class);
        Invocation invocation1 = createInvocation(mock, "getMethod", "arg1");
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

        // Simulate a call with no arguments
        Invocation actualInvocation = createInvocation(mock, "getMethod");
        assertFalse(invocationMatcher.matches(actualInvocation));
    }

    @Test
    public void testHasSimilarMethodWhenSameMethodAndArgs() throws Exception {
        Object mock = new Object();
        Method method = findMethod("hasSimilarMethod", Invocation.class);
        Invocation invocation1 = createInvocation(mock, "hasSimilarMethod", new Object());
        Invocation invocation2 = createInvocation(mock, "hasSimilarMethod", new Object());
        invocation2.markVerified(); // candidate is verified
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        // hasSimilarMethod checks method name, mock, unverified status, and arguments.
        // candidate.isVerified() will be true, so it should return false.
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenDifferentMock() throws Exception {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Method method = findMethod("hasSimilarMethod", Invocation.class);
        Invocation invocation1 = createInvocation(mock1, "hasSimilarMethod", new Object());
        Invocation invocation2 = createInvocation(mock2, "hasSimilarMethod", new Object());
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenDifferentMethodNameButSameSignature() throws Exception {
        // This scenario implies methods with the same signature but different names.
        // The `hasSimilarMethod` logic first checks `methodNameEquals`. If names are different, it returns false.
        Object mock = new Object();
        Method method1 = findMethod("toString"); // Assuming this doesn't have args for simplicity
        Method method2 = findMethod("hashCode"); // Different method name
        Invocation invocation1 = createInvocation(mock, "toString");
        Invocation invocation2 = new MockInvocation(mock, method2); // Directly create with different method
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2)); // Because method names are different
    }

    @Test
    public void testHasSimilarMethodWhenOverloadedButSameArgs() throws Exception {
        // This tests the `overloadedButSameArgs` condition: `!methodEquals && safelyArgumentsMatch(candidate.getArguments())`.
        // If `methodEquals` is false (different methods) and `safelyArgumentsMatch` is true, it returns false.
        Object mock = new Object();
        // Simulate two methods that have the same name but different parameter types, and the arguments match one of them.
        // This requires a class with overloaded methods, which is hard to simulate with Object.getMethod.
        // Let's assume `getMethod(String.class)` and `getMethod()` exist.
        Method method1 = findMethod("getMethod", String.class);
        Method method2 = findMethod("getMethod"); // Overloaded version
        Invocation invocation1 = createInvocation(mock, "getMethod", "someArg"); // Method with String arg
        Invocation invocation2 = new MockInvocation(mock, method2); // Method with no args
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

        // `invocation1.getMethod()` is `getMethod(String.class)`
        // `invocation2.getMethod()` is `getMethod()`
        // `hasSameMethod(invocation2)` will be false.
        // `safelyArgumentsMatch(invocation2.getArguments())` will be called with no arguments for invocation2.
        // `invocation1.getArguments()` is `{"someArg"}`.
        // ArgumentsComparator will likely deem these arguments not to match.
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }


    @Test
    public void testHasSameMethodWhenExactlySameMethod() throws Exception {
        Object mock = new Object();
        Method method = findMethod("hasSameMethod", Invocation.class);
        Invocation invocation1 = createInvocation(mock, "hasSameMethod", new Object());
        Invocation invocation2 = createInvocation(mock, "hasSameMethod", new Object());
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertTrue(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWhenDifferentMethod() throws Exception {
        Object mock = new Object();
        Method method1 = findMethod("hasSameMethod", Invocation.class);
        Method method2 = findMethod("hashCode");
        Invocation invocation1 = createInvocation(mock, "hasSameMethod", new Object());
        Invocation invocation2 = new MockInvocation(mock, method2, new Object());
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWhenDifferentParameterTypes() throws Exception {
        Object mock = new Object();
        Method method1 = findMethod("getMethod", String.class); // Method expects String
        Method method2 = findMethod("getMethod", Integer.class); // Method expects Integer
        Invocation invocation1 = createInvocation(mock, "getMethod", "test");
        Invocation invocation2 = createInvocation(mock, "getMethod", 123);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWhenDifferentNumberOfParameters() throws Exception {
        Object mock = new Object();
        Method method1 = findMethod("getMethod", String.class); // Method expects one arg
        Method method2 = findMethod("getMethod"); // Method expects no args
        Invocation invocation1 = createInvocation(mock, "getMethod", "test");
        Invocation invocation2 = createInvocation(mock, "getMethod");
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testGetLocation() throws Exception {
        Object mock = new Object();
        Method method = findMethod("getLocation");
        Invocation invocation = createInvocation(mock, "getLocation");
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation.getLocation(), invocationMatcher.getLocation());
    }

    @Test
    public void testCaptureArgumentsFromWithSingleArgument() throws Exception {
        Object mock = new Object();
        Method method = findMethod("captureArgumentsFrom", Invocation.class);
        // We need a method that takes a single argument to test captureFrom
        Method targetMethod = findMethod("toString", String.class);
        Invocation invocation = new MockInvocation(mock, targetMethod, "testValue");

        List<Matcher> matchers = new ArrayList<>();
        CapturingMatcher<String> capturingMatcher = new CapturingMatcher<>("testValue");
        matchers.add(capturingMatcher);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);
        assertEquals("testValue", capturingMatcher.getCaptured());
    }

    @Test
    public void testCaptureArgumentsFromWithMultipleArguments() throws Exception {
        Object mock = new Object();
        // Simulate a method with two arguments
        Method targetMethod = findMethod("toString", String.class, Integer.class);
        Invocation invocation = new MockInvocation(mock, targetMethod, "arg1", 123);

        List<Matcher> matchers = new ArrayList<>();
        CapturingMatcher<String> capturingMatcher1 = new CapturingMatcher<>("arg1");
        CapturingMatcher<Integer> capturingMatcher2 = new CapturingMatcher<>(123);
        matchers.add(capturingMatcher1);
        matchers.add(capturingMatcher2);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);
        assertEquals("arg1", capturingMatcher1.getCaptured());
        assertEquals(123, capturingMatcher2.getCaptured());
    }

    @Test
    public void testCaptureArgumentsFromWithVarArgMethod() throws Exception {
        Object mock = new Object();
        // Simulate a varargs method: Object... args
        Method varArgsMethod = null;
        try {
            // Try to find a varargs method on Object. String.format is a good candidate.
            varArgsMethod = String.class.getMethod("format", String.class, Object[].class);
        } catch (NoSuchMethodException e) {
            fail("Could not find a suitable varargs method for simulation (String.format)");
        }

        // Arguments for the varargs call: "val1", 123, true
        // MockInvocation needs to represent the varargs correctly. The last argument should be an array.
        Object[] actualArgsArray = {"val1", 123, true};
        Invocation invocation = new MockInvocation(mock, varArgsMethod, actualArgsArray); // Pass as array

        List<Matcher> matchers = new ArrayList<>();
        // Mockito's logic for varargs iterates through matchers and applies them to vararg elements.
        // We need matchers corresponding to the elements of the varargs.
        CapturingMatcher<String> capturingMatcher1 = new CapturingMatcher<>("val1");
        CapturingMatcher<Integer> capturingMatcher2 = new CapturingMatcher<>(123);
        CapturingMatcher<Boolean> capturingMatcher3 = new CapturingMatcher<>(true);
        matchers.add(capturingMatcher1);
        matchers.add(capturingMatcher2);
        matchers.add(capturingMatcher3);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);

        assertEquals("val1", capturingMatcher1.getCaptured());
        assertEquals(123, capturingMatcher2.getCaptured());
        assertEquals(true, capturingMatcher3.getCaptured());
    }

    @Test
    public void testCreateFromWithEmptyList() {
        List<Invocation> invocations = Collections.emptyList();
        List<InvocationMatcher> invocationMatchers = InvocationMatcher.createFrom(invocations);
        assertTrue(invocationMatchers.isEmpty());
    }

    @Test
    public void testCreateFromWithMultipleInvocations() {
        Object mock = new Object();
        Method method1 = null, method2 = null;
        try {
            method1 = findMethod("toString");
            method2 = findMethod("hashCode");
        } catch (NoSuchMethodException e) {
            fail("Could not find required methods for simulation");
        }

        Invocation invocation1 = createInvocation(mock, "toString", "arg1");
        Invocation invocation2 = createInvocation(mock, "hashCode", 123);
        List<Invocation> invocations = Arrays.asList(invocation1, invocation2);

        List<InvocationMatcher> invocationMatchers = InvocationMatcher.createFrom(invocations);
        assertEquals(2, invocationMatchers.size());
        assertEquals(invocation1, invocationMatchers.get(0).getInvocation());
        assertEquals(invocation2, invocationMatchers.get(1).getInvocation());
    }

    @Test
    public void testToStringWithNoMatchers() throws Exception {
        Object mock = new Object();
        Method method = findMethod("toString");
        Invocation invocation = createInvocation(mock, "toString", "arg1", 123);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation); // No explicit matchers
        String representation = invocationMatcher.toString();
        assertNotNull(representation);
        assertTrue(representation.contains("arg1")); // Expect arguments to be printed
        assertTrue(representation.contains("123"));
    }
}
```
**SOURCE CODE ANALYSIS**
The tests cover the public methods of `InvocationMatcher`: `getMethod`, `getInvocation`, `getMatchers`, `toString`, `matches`, `hasSimilarMethod`, `hasSameMethod`, `getLocation`, `captureArgumentsFrom`, and the static method `createFrom`. Various scenarios like argument mismatches, different mocks, and method signatures are tested.

**TEST CASE DESIGN**
- `testConstructorWithMatchers`: Creates an `InvocationMatcher` with explicit matchers.
- `testConstructorWithoutMatchers`: Creates an `InvocationMatcher` without explicit matchers, relying on default argument processing.
- `testGetMethod`: Verifies that `getMethod` returns the correct `Method` object.
- `testGetInvocation`: Verifies that `getInvocation` returns the correct `Invocation` object.
- `testGetMatchers`: Verifies that `getMatchers` returns the list of matchers.
- `testToString`: Checks the string representation of an `InvocationMatcher`.
- `testMatchesWhenExactMatch`: Tests `matches` when the invocation is an exact match.
- `testMatchesWhenArgumentMismatch`: Tests `matches` with differing arguments.
- `testMatchesWhenDifferentMock`: Tests `matches` with a different mock object.
- `testMatchesWhenDifferentMethod`: Tests `matches` with a different method.
- `testMatchesWhenDifferentNumberOfArguments`: Tests `matches` with a different number of arguments.
- `testHasSimilarMethodWhenSameMethodAndArgs`: Tests `hasSimilarMethod` with same method and args, but candidate is verified.
- `testHasSimilarMethodWhenDifferentMock`: Tests `hasSimilarMethod` with different mock objects.
- `testHasSimilarMethodWhenDifferentMethodNameButSameSignature`: Tests `hasSimilarMethod` when method names differ but signatures are conceptually the same.
- `testHasSimilarMethodWhenOverloadedButSameArgs`: Tests `hasSimilarMethod` in an overloaded method scenario.
- `testHasSameMethodWhenExactlySameMethod`: Tests `hasSameMethod` for identical methods.
- `testHasSameMethodWhenDifferentMethod`: Tests `hasSameMethod` for different methods.
- `testHasSameMethodWhenDifferentParameterTypes`: Tests `hasSameMethod` with different parameter types.
- `testHasSameMethodWhenDifferentNumberOfParameters`: Tests `hasSameMethod` with a different number of parameters.
- `testGetLocation`: Verifies that `getLocation` returns the correct `Location` object.
- `testCaptureArgumentsFromWithSingleArgument`: Tests `captureArgumentsFrom` with a single argument.
- `testCaptureArgumentsFromWithMultipleArguments`: Tests `captureArgumentsFrom` with multiple arguments.
- `testCaptureArgumentsFromWithVarArgMethod`: Tests `captureArgumentsFrom` with a varargs method.
- `testCreateFromWithEmptyList`: Tests `createFrom` with an empty list of invocations.
- `testCreateFromWithMultipleInvocations`: Tests `createFrom` with multiple invocations.
- `testToStringWithNoMatchers`: Tests the `toString` method when no explicit matchers are provided.

**DEFECT DETECTION STRATEGY**
Tests focus on the core logic of `matches` and `hasSimilarMethod`, ensuring correct comparison of mocks, methods, and arguments, especially in edge cases like varargs and different parameter types.

**SUMMARY**
26 tests.

**LIMITATIONS**
Mocking complex internal classes like `ArgumentsProcessor` and `ArgumentsComparator` directly is not feasible without their source code. The tests rely on simulating scenarios and verifying observable behaviors through public methods. The `toString` method's output depends on `PrintSettings`, making exact string matching difficult.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.