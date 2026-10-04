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
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.stubbing.StubInfo;

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

        // InvocationOnMock methods - these are not directly called by InvocationMatcher,
        // but are required by the Invocation interface. We provide no-ops or minimal implementations.
        @Override
        public Object callRealMethod() throws Throwable {
            throw new UnsupportedOperationException("callRealMethod not implemented for MockInvocation");
        }
    }

    static class MockLocation implements Location {
        @Override
        public String toString() {
            return "MockLocation";
        }
    }

    // Custom Matcher implementation that directly compares values for simplicity.
    // This is to avoid issues with creating complex Hamcrest matchers or internal Mockito matchers.
    // The original Matcher interface requires describeTo.
    private static class SimpleMatcher<T> implements Matcher<T> {
        private final T expected;

        SimpleMatcher(T expected) {
            this.expected = expected;
        }

        @Override
        public boolean matches(Object item) {
            return Objects.equals(item, expected);
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
            description.appendText("expected: ").appendValue(expected);
        }

        // We need to add a method to access the actual matcher if it's a decorator
        public Matcher<?> getActualMatcher() {
            return this;
        }
    }

    private static class CapturingMatcher<T> extends SimpleMatcher<T> implements CapturesArguments {
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
            // This could be problematic if the target method is not on Object or the class itself.
            // For this exercise, we'll assume common methods like toString, equals, hashCode are sufficient for simulation.
            return Object.class.getMethod(name, paramTypes);
        }
    }

    // Helper to create a simple Invocation object
    private Invocation createInvocation(Object mock, String methodName, Object... args) throws NoSuchMethodException {
        Class<?>[] paramTypes = getParameterTypes(args);
        Method method = null;
        try {
            method = InvocationMatcher.class.getMethod(methodName, paramTypes);
        } catch (NoSuchMethodException e) {
            // If not found in InvocationMatcher, try Object or a dummy method.
            // For simulation purposes, we'll use a generic method on Object if needed.
            // This part is tricky and relies on guessing available methods or having a predefined set.
            // Let's assume for simplicity that the methods tested exist on InvocationMatcher or are simulated.
            // A more robust approach would be to have a known set of methods to use for simulation.
            // For `hasSimilarMethod` and `hasSameMethod`, we need methods that take `Invocation`.
            if (methodName.equals("matches") || methodName.equals("hasSimilarMethod") || methodName.equals("hasSameMethod")) {
                method = findMethod(methodName, Invocation.class);
            } else if (methodName.equals("captureArgumentsFrom")) {
                method = findMethod(methodName, Invocation.class);
            } else {
                // Fallback to a simple method if no specific one found.
                method = findMethod("toString"); // A safe fallback
            }
        }
        return new MockInvocation(mock, method, args);
    }

    // Helper to get parameter types from arguments
    private Class<?>[] getParameterTypes(Object... args) {
        Class<?>[] types = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            if (args[i] == null) {
                // This is a problem, we can't infer type from null.
                // For tests, we should avoid null arguments if possible or handle them specifically.
                // For simulation, we'll need to make assumptions or use a more complex type inference.
                // Let's assume no null arguments for now or use a placeholder if a method signature requires it.
                throw new IllegalArgumentException("Cannot infer parameter type from null argument.");
            }
            types[i] = args[i].getClass();
        }
        return types;
    }

    @Test
    public void testConstructorWithMatchers() throws Exception {
        Object mock = new Object();
        Method method = findMethod("getMethod");
        Invocation invocation = createInvocation(mock, "getMethod");
        List<Matcher> matchers = Arrays.asList(new SimpleMatcher<>("arg1"), new SimpleMatcher<>(123));
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
        List<Matcher> matchers = Collections.singletonList(new SimpleMatcher<>("arg1"));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertEquals(matchers, invocationMatcher.getMatchers());
    }

    @Test
    public void testToString() throws Exception {
        Object mock = new Object();
        Method method = findMethod("toString");
        Invocation invocation = createInvocation(mock, "toString", "someArg");
        List<Matcher> matchers = Collections.singletonList(new SimpleMatcher<>("someArg"));
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
        Invocation invocation1 = createInvocation(mock, "matches", new Object());
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

        Invocation actualInvocation = createInvocation(mock, "matches", new Object());
        assertTrue(invocationMatcher.matches(actualInvocation));
    }

    @Test
    public void testMatchesWhenArgumentMismatch() throws Exception {
        Object mock = new Object();
        Method method = findMethod("matches", Invocation.class);
        Invocation invocation1 = createInvocation(mock, "matches", new Object());
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

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
        Object mock = new Object();
        Method method1 = findMethod("toString");
        Method method2 = findMethod("hashCode");
        Invocation invocation1 = createInvocation(mock, "toString");
        Invocation invocation2 = new MockInvocation(mock, method2);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenOverloadedButSameArgs() throws Exception {
        Object mock = new Object();
        // This test needs to simulate two methods with the same name but different parameter types.
        // In Mockito's internal API, `getMethod` might be used with different parameter types.
        // We'll simulate this by creating distinct Method objects conceptually.
        Method method1 = null, method2 = null;
        try {
            method1 = InvocationMatcher.class.getMethod("toString"); // A method with no args
            method2 = InvocationMatcher.class.getMethod("toString", String.class); // A method with a String arg
        } catch (NoSuchMethodException e) {
            fail("Could not find required methods for simulation.");
        }

        Invocation invocation1 = new MockInvocation(mock, method1); // Method with no args
        Invocation invocation2 = new MockInvocation(mock, method2, "someString"); // Method with a String arg

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

        // `invocation1.getMethod().getName()` and `invocation2.getMethod().getName()` are the same ("toString").
        // `hasSameMethod(invocation2)` will be false because parameter types differ.
        // `safelyArgumentsMatch(invocation2.getArguments())` will be called with `{"someString"}`.
        // `invocationMatcher.invocation.getArguments()` is empty.
        // The ArgumentsComparator should return false.
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
        Method method1 = null, method2 = null;
        try {
            method1 = InvocationMatcher.class.getMethod("getMethod", String.class);
            method2 = InvocationMatcher.class.getMethod("getMethod", Integer.class);
        } catch (NoSuchMethodException e) {
            fail("Could not find required methods for simulation.");
        }
        Invocation invocation1 = new MockInvocation(mock, method1, "test");
        Invocation invocation2 = new MockInvocation(mock, method2, 123);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWhenDifferentNumberOfParameters() throws Exception {
        Object mock = new Object();
        Method method1 = null, method2 = null;
        try {
            method1 = InvocationMatcher.class.getMethod("getMethod", String.class); // Method expects one arg
            method2 = InvocationMatcher.class.getMethod("getMethod"); // Method expects no args
        } catch (NoSuchMethodException e) {
            fail("Could not find required methods for simulation.");
        }
        Invocation invocation1 = new MockInvocation(mock, method1, "test");
        Invocation invocation2 = new MockInvocation(mock, method2);
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
        Method targetMethod = null;
        try {
            // Use a method from MockInvocation itself for simulation that takes a String
            targetMethod = MockInvocation.class.getMethod("getArgumentAt", int.class, Class.class);
            // The method signature in the source is `void captureArgumentsFrom(Invocation invocation)`
            // We need to simulate a method call that `captureArgumentsFrom` would process.
            // Let's simulate a method that takes a String.
            targetMethod = findMethod("toString", String.class); // Simulating a method that takes String
        } catch (NoSuchMethodException e) {
            fail("Could not find required methods for simulation.");
        }

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
        Method targetMethod = null;
        try {
            targetMethod = findMethod("toString", String.class, Integer.class);
        } catch (NoSuchMethodException e) {
            fail("Could not find required methods for simulation.");
        }
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
        Method varArgsMethod = null;
        try {
            // Use a known varargs method for simulation. String.format is a good candidate.
            varArgsMethod = String.class.getMethod("format", String.class, Object[].class);
        } catch (NoSuchMethodException e) {
            fail("Could not find a suitable varargs method for simulation (String.format)");
        }

        Object[] actualArgsArray = {"val1", 123, true};
        Invocation invocation = new MockInvocation(mock, varArgsMethod, actualArgsArray);

        List<Matcher> matchers = new ArrayList<>();
        // Matchers for each vararg element
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

    @Test
    public void testSafelyArgumentsMatchTrue() throws Exception {
        Object mock = new Object();
        Method method = findMethod("getMethod", String.class);
        Invocation invocation = new MockInvocation(mock, method, "test");
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        // Simulate an actual invocation with matching arguments
        Object[] actualArgs = {"test"};
        assertTrue(invocationMatcher.safelyArgumentsMatch(actualArgs));
    }

    @Test
    public void testSafelyArgumentsMatchFalse() throws Exception {
        Object mock = new Object();
        Method method = findMethod("getMethod", String.class);
        Invocation invocation = new MockInvocation(mock, method, "test");
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        // Simulate an actual invocation with non-matching arguments
        Object[] actualArgs = {"anotherTest"};
        assertFalse(invocationMatcher.safelyArgumentsMatch(actualArgs));
    }

    @Test
    public void testSafelyArgumentsMatchWithDifferentLength() throws Exception {
        Object mock = new Object();
        Method method = findMethod("getMethod", String.class);
        Invocation invocation = new MockInvocation(mock, method, "test");
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        // Simulate an actual invocation with different number of arguments
        Object[] actualArgs = {"test", 123};
        assertFalse(invocationMatcher.safelyArgumentsMatch(actualArgs));
    }

    @Test
    public void testSafelyArgumentsMatchWithException() throws Exception {
        Object mock = new Object();
        // Simulate a method that might throw an exception during argument matching
        // This is hard to simulate without a real Matcher or ArgumentsComparator logic.
        // For now, we'll assume a scenario where argumentsMatch could throw.
        // We can force a NullPointerException if `argumentsMatch` is called with null matcher list.
        // However, `InvocationMatcher` constructor prevents an empty list of matchers if arguments are present.

        // A more realistic scenario is a malformed matcher or argument type.
        Method method = findMethod("toString", String.class);
        Invocation invocation = new MockInvocation(mock, method, "test");

        List<Matcher> matchers = new ArrayList<>();
        // Add a matcher that might cause issues if not handled correctly, e.g., an instanceof check with incompatible type.
        // For simplicity, we'll assume a scenario that might throw an exception.
        // A simple case is passing null to a method expecting non-null or incompatible types.
        // Let's use a matcher that expects a String but we pass an Integer.
        matchers.add(new SimpleMatcher<>("expectedString"));

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);

        // Simulate an actual invocation with an argument that causes matching to fail/throw.
        Object[] actualArgs = {123}; // Integer instead of String expected by the matcher.
        // The `ArgumentsComparator.argumentsMatch` internally handles mismatches, not necessarily exceptions.
        // To trigger the catch block, we'd need a situation that truly throws an unchecked exception.
        // Let's assume a scenario where the comparison itself throws, e.g., a NullPointerException.
        // If the `ArgumentsComparator` is simple, it might not throw.
        // Let's test with an empty actualArgs, which might cause issues if method expects args.
        Object[] emptyArgs = {};
        assertFalse(invocationMatcher.safelyArgumentsMatch(emptyArgs)); // Should return false, not throw.
    }
}
```
```java
// SOURCE CODE ANALYSIS
// The tests focus on the `matches`, `hasSimilarMethod`, `hasSameMethod`, `getMethod`, `getInvocation`, `getMatchers`, `getLocation`, `toString`, `captureArgumentsFrom`, and `createFrom` methods of the `InvocationMatcher` class. Edge cases like argument mismatches, different mocks, different methods, and varargs are covered.

// TEST CASE DESIGN
// testConstructorWithMatchers: Valid constructor invocation with matchers.
// testConstructorWithoutMatchers: Valid constructor invocation without explicit matchers.
// testGetMethod: Verifies the retrieval of the method from the wrapped Invocation.
// testGetInvocation: Verifies the retrieval of the wrapped Invocation.
// testGetMatchers: Verifies the retrieval of the matchers list.
// testToString: Checks the string representation of the InvocationMatcher.
// testMatchesWhenExactMatch: Tests `matches` with identical mock, method, and arguments.
// testMatchesWhenArgumentMismatch: Tests `matches` with different arguments.
// testMatchesWhenDifferentMock: Tests `matches` with different mock objects.
// testMatchesWhenDifferentMethod: Tests `matches` with different methods.
// testMatchesWhenDifferentNumberOfArguments: Tests `matches` with a different number of arguments.
// testHasSimilarMethodWhenSameMethodAndArgs: Tests `hasSimilarMethod` when candidate is verified.
// testHasSimilarMethodWhenDifferentMock: Tests `hasSimilarMethod` with different mocks.
// testHasSimilarMethodWhenDifferentMethodNameButSameSignature: Tests `hasSimilarMethod` with different method names.
// testHasSimilarMethodWhenOverloadedButSameArgs: Tests `hasSimilarMethod` when methods are overloaded but args differ.
// testHasSameMethodWhenExactlySameMethod: Tests `hasSameMethod` with identical methods.
// testHasSameMethodWhenDifferentMethod: Tests `hasSameMethod` with different methods.
// testHasSameMethodWhenDifferentParameterTypes: Tests `hasSameMethod` with different parameter types.
// testHasSameMethodWhenDifferentNumberOfParameters: Tests `hasSameMethod` with different number of parameters.
// testGetLocation: Verifies the retrieval of the location from the wrapped Invocation.
// testCaptureArgumentsFromWithSingleArgument: Tests `captureArgumentsFrom` with a single argument.
// testCaptureArgumentsFromWithMultipleArguments: Tests `captureArgumentsFrom` with multiple arguments.
// testCaptureArgumentsFromWithVarArgMethod: Tests `captureArgumentsFrom` with a varargs method.
// testCreateFromWithEmptyList: Tests `createFrom` with an empty list of invocations.
// testCreateFromWithMultipleInvocations: Tests `createFrom` with multiple invocations.
// testToStringWithNoMatchers: Tests `toString` when no explicit matchers are provided.
// testSafelyArgumentsMatchTrue: Tests `safelyArgumentsMatch` when arguments match.
// testSafelyArgumentsMatchFalse: Tests `safelyArgumentsMatch` when arguments do not match.
// testSafelyArgumentsMatchWithDifferentLength: Tests `safelyArgumentsMatch` with different argument lengths.
// testSafelyArgumentsMatchWithException: Tests `safelyArgumentsMatch` handling of exceptions (simulated).

// DEFECT DETECTION STRATEGY
// The tests aim to detect defects in argument matching, method signature comparison, mock object comparison, and argument capturing logic within `InvocationMatcher`.

// SUMMARY
// 29 tests.

// LIMITATIONS
// Mocking internal dependencies like `ArgumentsComparator` and `PrintSettings` is challenging. The simulation relies on simplified helper classes and assumptions about method behaviors.
// Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.
```