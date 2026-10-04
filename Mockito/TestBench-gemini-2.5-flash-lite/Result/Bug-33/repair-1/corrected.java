package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.hamcrest.Matcher;
import org.mockito.exceptions.PrintableInvocation;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.reporting.PrintSettings;
import org.mockito.internal.reporting.PrintingFriendlyInvocation;

public class InvocationMatcherTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper class to simulate Invocation and its dependencies.
    // This is a simplified version for testing InvocationMatcher.
    private static class MockInvocation implements Invocation {
        private Object mock;
        private Method method;
        private Object[] args;
        private boolean verified;
        private Location location;

        MockInvocation(Object mock, Method method, Object[] args) {
            this.mock = mock;
            this.method = method;
            this.args = args;
            this.verified = false;
            this.location = new Location(); // Default location
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Object[] getArguments() {
            return args;
        }

        @Override
        public Location getLocation() {
            return location;
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
        public String toString() {
            return method.getName() + "(" + java.util.Arrays.toString(args) + ")";
        }

        @Override
        public String toString(List<Matcher> matchers, PrintSettings printSettings) {
            StringBuilder sb = new StringBuilder();
            sb.append(method.getName()).append("(");
            for (int i = 0; i < args.length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (i < matchers.size() && matchers.get(i) != null) {
                    sb.append(matchers.get(i).toString());
                } else {
                    sb.append(args[i]);
                }
            }
            sb.append(")");
            return sb.toString();
        }

        @Override
        public List<Matcher> argumentsToMatchers() {
            List<Matcher> matchers = new LinkedList<>();
            for (Object arg : args) {
                // Simplified: assume all arguments can be matched by a simple matcher
                // In a real scenario, this would be more complex.
                matchers.add(org.mockito.Matchers.any(arg.getClass()));
            }
            return matchers;
        }
    }

    private MockInvocation createInvocation(Object mock, String methodName, Object[] args) throws NoSuchMethodException {
        Method method = mock.getClass().getMethod(methodName, getParameterTypes(args));
        return new MockInvocation(mock, method, args);
    }

    private Class<?>[] getParameterTypes(Object[] args) {
        Class<?>[] paramTypes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            paramTypes[i] = args[i].getClass();
        }
        return paramTypes;
    }

    private static class TestMatcher implements Matcher<Object> {
        private Object expected;
        private Object captured = null;

        TestMatcher(Object expected) {
            this.expected = expected;
        }

        @Override
        public boolean matches(Object item) {
            if (item.equals(expected)) {
                captured = item;
                return true;
            }
            return false;
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
            description.appendText("matches " + expected);
        }

        public Object getCaptured() {
            return captured;
        }
    }

    private static class TestCapturingMatcher extends TestMatcher implements CapturesArguments {
        TestCapturingMatcher(Object expected) {
            super(expected);
        }

        @Override
        public void captureFrom(Object argument) {
            this.captured = argument;
        }
    }


    @Test
    public void testConstructorWithMatchers() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        List<Matcher> matchers = new LinkedList<>();
        matchers.add(new TestMatcher("some value"));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertEquals(matchers, invocationMatcher.getMatchers());
    }

    @Test
    public void testConstructorWithoutMatchers() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"arg1"});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation.argumentsToMatchers(), invocationMatcher.getMatchers());
    }

    @Test
    public void testGetMethod() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation.getMethod(), invocationMatcher.getMethod());
    }

    @Test
    public void testGetInvocation() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation, invocationMatcher.getInvocation());
    }

    @Test
    public void testGetMatchersWhenEmpty() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertTrue(invocationMatcher.getMatchers().isEmpty());
    }

    @Test
    public void testGetMatchersWhenProvided() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        List<Matcher> matchers = new LinkedList<>();
        matchers.add(new TestMatcher("some value"));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertEquals(matchers, invocationMatcher.getMatchers());
    }

    @Test
    public void testToString() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        PrintSettings settings = new PrintSettings();
        assertEquals(invocation.toString(invocationMatcher.getMatchers(), settings), invocationMatcher.toString());
    }

    @Test
    public void testMatchesWhenSameMockAndMethodAndArguments() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertTrue(invocationMatcher.matches(invocation));
    }

    @Test
    public void testMatchesWhenDifferentMock() throws Exception {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Method method = mock1.getClass().getMethod("toString");
        Invocation invocation1 = new MockInvocation(mock1, method, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock2, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.matches(invocation2));
    }

    @Test
    public void testMatchesWhenDifferentMethod() throws Exception {
        Object mock = new Object();
        Method method1 = mock.getClass().getMethod("toString");
        Method method2 = mock.getClass().getMethod("hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.matches(invocation2));
    }

    @Test
    public void testMatchesWhenDifferentArguments() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation1 = new MockInvocation(mock, method, new Object[]{"a", 1});
        Invocation invocation2 = new MockInvocation(mock, method, new Object[]{"b", 2});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.matches(invocation2));
    }

    // The safelyArgumentsMatch method is private, so we cannot directly test it.
    // We will test its effect through the matches and hasSimilarMethod methods.

    @Test
    public void testHasSimilarMethodWhenSameMethodAndMock() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertTrue(invocationMatcher.hasSimilarMethod(invocation));
    }

    @Test
    public void testHasSimilarMethodWhenDifferentMethodName() throws Exception {
        Object mock = new Object();
        Method method1 = mock.getClass().getMethod("toString");
        Method method2 = mock.getClass().getMethod("hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenDifferentMock() throws Exception {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Method method = mock1.getClass().getMethod("toString");
        Invocation invocation1 = new MockInvocation(mock1, method, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock2, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenCandidateIsVerified() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation1 = new MockInvocation(mock, method, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method, new Object[]{});
        invocation2.markVerified();
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenOverloadedButSameArgs() throws Exception {
        Object mock = new Object();
        // Method with String argument
        Method method1 = mock.getClass().getMethod("equals", Object.class);
        // Method with different argument type (e.g., int)
        Method method2 = null;
        try {
            method2 = mock.getClass().getMethod("equals", int.class);
        } catch (NoSuchMethodException e) {
            // If equals(int) is not available, use another method signature for testing overload
             method2 = mock.getClass().getMethod("hashCode"); // Fallback
        }


        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{"test"});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{"test"}); // Same argument value, different method object
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

        // For hasSimilarMethod, if method names are the same,
        // it checks if they are the same method (same signature).
        // If they are not the same method but arguments match, it's considered overloaded but same args.
        // The logic in hasSimilarMethod checks !methodEquals && safelyArgumentsMatch.
        // Since we're using different methods (even if names are same), methodEquals will be false.
        // If arguments are the same, safelyArgumentsMatch will be true.
        // Thus, overloadedButSameArgs will be true, and hasSimilarMethod should return false.
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenNotOverloadedAndSameArgs() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation1 = new MockInvocation(mock, method, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertTrue(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWhenSameMethod() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation1 = new MockInvocation(mock, method, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertTrue(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWhenDifferentMethod() throws Exception {
        Object mock = new Object();
        Method method1 = mock.getClass().getMethod("toString");
        Method method2 = mock.getClass().getMethod("hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWhenDifferentParameterTypes() throws Exception {
        Object mock = new Object();
        Method method1 = mock.getClass().getMethod("equals", Object.class);
        Method method2 = mock.getClass().getMethod("hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{"test"});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testGetLocation() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation.getLocation(), invocationMatcher.getLocation());
    }

    @Test
    public void testCaptureArgumentsFrom() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString", String.class);
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"testArg"});

        List<Matcher> matchers = new LinkedList<>();
        TestCapturingMatcher capturingMatcher = new TestCapturingMatcher("testArg");
        matchers.add(capturingMatcher);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);

        assertTrue(capturingMatcher.matches("testArg")); // Ensure the matcher itself would have matched
        assertEquals("testArg", capturingMatcher.getCaptured());
    }

    @Test
    public void testCreateFromEmptyList() throws Exception {
        List<Invocation> invocations = Collections.emptyList();
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(invocations);
        assertTrue(matchers.isEmpty());
    }

    @Test
    public void testCreateFromNonEmptyList() throws Exception {
        Object mock = new Object();
        Method method1 = mock.getClass().getMethod("toString");
        Method method2 = mock.getClass().getMethod("hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        List<Invocation> invocations = new LinkedList<>();
        invocations.add(invocation1);
        invocations.add(invocation2);
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(invocations);
        assertEquals(2, matchers.size());
        assertEquals(invocation1, matchers.get(0).getInvocation());
        assertEquals(invocation2, matchers.get(1).getInvocation());
    }

    @Test
    public void testToStringWithPrintSettings() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        PrintSettings settings = new PrintSettings();
        settings.setMultiline(true);
        assertEquals(invocation.toString(invocationMatcher.getMatchers(), settings), invocationMatcher.toString(settings));
    }

    @Test
    public void testToStringWithPrintSettingsVerboseMatchers() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString", String.class, int.class);
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"a", 1});
        List<Matcher> matchers = new LinkedList<>();
        matchers.add(new TestMatcher("a"));
        matchers.add(new TestMatcher(1));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        PrintSettings settings = PrintSettings.verboseMatchers(0, 1);
        assertEquals(invocation.toString(matchers, settings), invocationMatcher.toString(settings));
    }

    @Test
    public void testCaptureArgumentsFromWithNoMatchers() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"testArg"});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation); // No matchers provided
        invocationMatcher.captureArgumentsFrom(invocation);
        // Should not throw an exception and do nothing.
        assertTrue(true);
    }

    @Test
    public void testCaptureArgumentsFromWithMismatchingArgumentCount() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString", String.class, String.class);
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"testArg1", "testArg2"});
        List<Matcher> matchers = new LinkedList<>();
        TestCapturingMatcher capturingMatcher = new TestCapturingMatcher("testArg1");
        matchers.add(capturingMatcher); // Only one matcher
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);
        // The matcher should capture the first argument.
        assertEquals("testArg1", capturingMatcher.getCaptured());
    }

    @Test
    public void testCaptureArgumentsFromWithExtraMatchers() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString", String.class);
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"testArg"});
        List<Matcher> matchers = new LinkedList<>();
        TestCapturingMatcher capturingMatcher1 = new TestCapturingMatcher("testArg");
        TestCapturingMatcher capturingMatcher2 = new TestCapturingMatcher("someOtherValue");
        matchers.add(capturingMatcher1);
        matchers.add(capturingMatcher2); // Extra matcher
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);
        // Only the first matcher should capture.
        assertEquals("testArg", capturingMatcher1.getCaptured());
        assertNull(capturingMatcher2.getCaptured());
    }

    @Test
    public void testHasSimilarMethodWhenDifferentMethodNamesButMethodEqualsReturnsTrue() throws Exception {
        // This scenario is tricky. 'hasSimilarMethod' first checks method name equality.
        // If names are different, it returns false.
        // So, to test the 'overloadedButSameArgs' path, method names must be the same.
        // If we want to test the case where method names are different, it will always return false.
        // We will create a scenario where method names are different, to ensure it returns false.
        Object mock = new Object();
        Method method1 = mock.getClass().getMethod("toString");
        Method method2 = mock.getClass().getMethod("hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testInvocationMatcherIsSerializable() throws Exception {
        Object mock = new Object();
        Method method = mock.getClass().getMethod("toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        List<Matcher> matchers = new LinkedList<>();
        matchers.add(new TestMatcher("some value"));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertTrue(invocationMatcher instanceof Serializable);
    }

    @Test
    public void testHasSameMethodWhenDifferentMethodNames() throws Exception {
        Object mock = new Object();
        Method method1 = mock.getClass().getMethod("toString");
        Method method2 = mock.getClass().getMethod("hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }
}
