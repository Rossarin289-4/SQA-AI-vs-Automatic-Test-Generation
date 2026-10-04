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
import org.mockito.Matchers; // Added import for Matchers

public class InvocationMatcherTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock class to simulate Invocation for testing InvocationMatcher
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
        public Method getMethod() { return method; }
        @Override
        public Object getMock() { return mock; }
        @Override
        public Object[] getArguments() { return args; }
        @Override
        public Location getLocation() { return location; }
        @Override
        public boolean isVerified() { return verified; }
        @Override
        public void markVerified() { this.verified = true; }

        @Override
        public String toString() {
            return method.getName() + "(" + java.util.Arrays.toString(args) + ")";
        }

        @Override
        public String toString(List<Matcher> matchers, PrintSettings printSettings) {
            StringBuilder sb = new StringBuilder();
            sb.append(method.getName()).append("(");
            for (int i = 0; i < args.length; i++) {
                if (i > 0) sb.append(", ");
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
                // Using Matchers.any() which is available in Mockito
                matchers.add(Matchers.any(arg.getClass()));
            }
            return matchers;
        }
    }

    // Helper to create a MockInvocation. Needs Method object.
    private Method getMethod(Object obj, String name, Class<?>... parameterTypes) throws NoSuchMethodException {
        return obj.getClass().getMethod(name, parameterTypes);
    }

    // Mock Matcher for testing
    private static class TestMatcher implements Matcher<Object> {
        private Object expected;
        private Object captured = null;

        TestMatcher(Object expected) {
            this.expected = expected;
        }

        @Override
        public boolean matches(Object item) {
            if (item != null && item.equals(expected)) {
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

    // Mock Capturing Matcher for testing
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
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        List<Matcher> matchers = new LinkedList<>();
        matchers.add(new TestMatcher("some value"));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertEquals(matchers, invocationMatcher.getMatchers());
    }

    @Test
    public void testConstructorWithoutMatchers() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"arg1"});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation.argumentsToMatchers(), invocationMatcher.getMatchers());
    }

    @Test
    public void testGetMethod() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation.getMethod(), invocationMatcher.getMethod());
    }

    @Test
    public void testGetInvocation() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation, invocationMatcher.getInvocation());
    }

    @Test
    public void testGetMatchersWhenEmpty() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertTrue(invocationMatcher.getMatchers().isEmpty());
    }

    @Test
    public void testGetMatchersWhenProvided() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        List<Matcher> matchers = new LinkedList<>();
        matchers.add(new TestMatcher("some value"));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertEquals(matchers, invocationMatcher.getMatchers());
    }

    @Test
    public void testToString() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        PrintSettings settings = new PrintSettings();
        assertEquals(invocation.toString(invocationMatcher.getMatchers(), settings), invocationMatcher.toString());
    }

    @Test
    public void testMatchesWhenSameMockAndMethodAndArguments() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertTrue(invocationMatcher.matches(invocation));
    }

    @Test
    public void testMatchesWhenDifferentMock() throws Exception {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Method method = getMethod(mock1, "toString");
        Invocation invocation1 = new MockInvocation(mock1, method, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock2, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.matches(invocation2));
    }

    @Test
    public void testMatchesWhenDifferentMethod() throws Exception {
        Object mock = new Object();
        Method method1 = getMethod(mock, "toString");
        Method method2 = getMethod(mock, "hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.matches(invocation2));
    }

    @Test
    public void testMatchesWhenDifferentArguments() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation1 = new MockInvocation(mock, method, new Object[]{"a", 1});
        Invocation invocation2 = new MockInvocation(mock, method, new Object[]{"b", 2});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.matches(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenSameMethodAndMock() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertTrue(invocationMatcher.hasSimilarMethod(invocation));
    }

    @Test
    public void testHasSimilarMethodWhenDifferentMethodName() throws Exception {
        Object mock = new Object();
        Method method1 = getMethod(mock, "toString");
        Method method2 = getMethod(mock, "hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenDifferentMock() throws Exception {
        Object mock1 = new Object();
        Object mock2 = new Object();
        Method method = getMethod(mock1, "toString");
        Invocation invocation1 = new MockInvocation(mock1, method, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock2, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenCandidateIsVerified() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation1 = new MockInvocation(mock, method, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method, new Object[]{});
        invocation2.markVerified();
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenOverloadedButSameArgs() throws Exception {
        Object mock = new Object();
        Method method1 = getMethod(mock, "equals", Object.class);
        // Use a different method for the second case to ensure 'methodEquals' is false
        Method method2 = getMethod(mock, "hashCode");

        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{"test"});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{"test"}); // Same argument value, different method
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);

        // In hasSimilarMethod, if method names are different, it returns false early.
        // If method names are the same but signatures different, and arguments match, it's overloaded.
        // Here, we have different method objects and potentially different names.
        // The logic: methodNameEquals is false if names differ. So it returns false.
        // If names were same but sigs different, and args match, it would return false because of !methodEquals && safelyArgumentsMatch
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSimilarMethodWhenNotOverloadedAndSameArgs() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation1 = new MockInvocation(mock, method, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertTrue(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWhenSameMethod() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation1 = new MockInvocation(mock, method, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertTrue(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWhenDifferentMethod() throws Exception {
        Object mock = new Object();
        Method method1 = getMethod(mock, "toString");
        Method method2 = getMethod(mock, "hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testHasSameMethodWhenDifferentParameterTypes() throws Exception {
        Object mock = new Object();
        Method method1 = getMethod(mock, "equals", Object.class);
        Method method2 = getMethod(mock, "hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{"test"});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }

    @Test
    public void testGetLocation() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        assertEquals(invocation.getLocation(), invocationMatcher.getLocation());
    }

    @Test
    public void testCaptureArgumentsFrom() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString", String.class);
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"testArg"});

        List<Matcher> matchers = new LinkedList<>();
        TestCapturingMatcher capturingMatcher = new TestCapturingMatcher("testArg");
        matchers.add(capturingMatcher);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);

        assertTrue(capturingMatcher.matches("testArg"));
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
        Method method1 = getMethod(mock, "toString");
        Method method2 = getMethod(mock, "hashCode");
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
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);
        PrintSettings settings = new PrintSettings();
        settings.setMultiline(true);
        assertEquals(invocation.toString(invocationMatcher.getMatchers(), settings), invocationMatcher.toString(settings));
    }

    @Test
    public void testToStringWithPrintSettingsVerboseMatchers() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString", String.class, int.class);
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
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"testArg"});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation); // No matchers provided
        invocationMatcher.captureArgumentsFrom(invocation);
        assertTrue(true); // Should not throw an exception
    }

    @Test
    public void testCaptureArgumentsFromWithMismatchingArgumentCount() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString", String.class, String.class);
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"testArg1", "testArg2"});
        List<Matcher> matchers = new LinkedList<>();
        TestCapturingMatcher capturingMatcher = new TestCapturingMatcher("testArg1");
        matchers.add(capturingMatcher); // Only one matcher
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);
        assertEquals("testArg1", capturingMatcher.getCaptured());
    }

    @Test
    public void testCaptureArgumentsFromWithExtraMatchers() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString", String.class);
        Invocation invocation = new MockInvocation(mock, method, new Object[]{"testArg"});
        List<Matcher> matchers = new LinkedList<>();
        TestCapturingMatcher capturingMatcher1 = new TestCapturingMatcher("testArg");
        TestCapturingMatcher capturingMatcher2 = new TestCapturingMatcher("someOtherValue");
        matchers.add(capturingMatcher1);
        matchers.add(capturingMatcher2); // Extra matcher
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        invocationMatcher.captureArgumentsFrom(invocation);
        assertEquals("testArg", capturingMatcher1.getCaptured());
        assertNull(capturingMatcher2.getCaptured());
    }

    @Test
    public void testHasSimilarMethodWhenDifferentMethodNamesButMethodEqualsReturnsTrue() throws Exception {
        Object mock = new Object();
        Method method1 = getMethod(mock, "toString");
        Method method2 = getMethod(mock, "hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSimilarMethod(invocation2));
    }

    @Test
    public void testInvocationMatcherIsSerializable() throws Exception {
        Object mock = new Object();
        Method method = getMethod(mock, "toString");
        Invocation invocation = new MockInvocation(mock, method, new Object[]{});
        List<Matcher> matchers = new LinkedList<>();
        matchers.add(new TestMatcher("some value"));
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);
        assertTrue(invocationMatcher instanceof Serializable);
    }

    @Test
    public void testHasSameMethodWhenDifferentMethodNames() throws Exception {
        Object mock = new Object();
        Method method1 = getMethod(mock, "toString");
        Method method2 = getMethod(mock, "hashCode");
        Invocation invocation1 = new MockInvocation(mock, method1, new Object[]{});
        Invocation invocation2 = new MockInvocation(mock, method2, new Object[]{});
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation1);
        assertFalse(invocationMatcher.hasSameMethod(invocation2));
    }
}
