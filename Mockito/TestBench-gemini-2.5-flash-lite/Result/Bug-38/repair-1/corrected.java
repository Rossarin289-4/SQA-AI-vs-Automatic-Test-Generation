package org.mockito.internal.verification.argumentmatching;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.hamcrest.Matcher;
import org.hamcrest.SelfDescribing;
import org.hamcrest.StringDescription;
import org.mockito.internal.matchers.ContainsExtraTypeInformation;
import org.mockito.Matchers;

public class ArgumentMatchingToolTest {
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_EqualSize_NoSuspicious() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(Matchers.anyString());
        Object[] arguments = new Object[1];
        arguments[0] = "test";
        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_UnequalSize() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(Matchers.anyString());
        Object[] arguments = new Object[2];
        arguments[0] = "test";
        arguments[1] = "test2";
        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_NullArgument() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(Matchers.anyString());
        Object[] arguments = new Object[1];
        arguments[0] = null;
        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_NullMatcher() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(null);
        Object[] arguments = new Object[1];
        arguments[0] = "test";
        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_ContainsExtraTypeInfo_NotMatching_ToStringEquals_TypeNotMatches() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        // Create a mock ContainsExtraTypeInformation that will satisfy the conditions
        Matcher mockMatcher = new MockContainsExtraTypeInformation() {
            @Override
            public boolean typeMatches(Object object) {
                return false; // Condition: !((ContainsExtraTypeInformation) m).typeMatches(arguments[i])
            }

            @Override
            public boolean matches(Object argument) {
                return false; // Condition: !safelyMatches(m, arguments[i])
            }

            @Override
            public String toString() {
                return "someStringRepresentation"; // For toStringEquals
            }
        };
        matchers.add(mockMatcher);
        Object[] arguments = new Object[1];
        // This argument's toString() must equal the matcher's toString()
        arguments[0] = new Object() {
            @Override
            public String toString() {
                return "someStringRepresentation";
            }
        };

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertArrayEquals(new Integer[]{0}, suspicious);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_ContainsExtraTypeInfo_Matching_ToStringEquals_TypeNotMatches() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Matcher mockMatcher = new MockContainsExtraTypeInformation() {
            @Override
            public boolean typeMatches(Object object) {
                return false; // Condition: !((ContainsExtraTypeInformation) m).typeMatches(arguments[i])
            }

            @Override
            public boolean matches(Object argument) {
                return true; // Condition: safelyMatches(m, arguments[i]) is true
            }

            @Override
            public String toString() {
                return "someStringRepresentation";
            }
        };
        matchers.add(mockMatcher);
        Object[] arguments = new Object[1];
        arguments[0] = new Object() {
            @Override
            public String toString() {
                return "someStringRepresentation";
            }
        };

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_ContainsExtraTypeInfo_NotMatching_ToStringNotEquals_TypeNotMatches() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Matcher mockMatcher = new MockContainsExtraTypeInformation() {
            @Override
            public boolean typeMatches(Object object) {
                return false; // Condition: !((ContainsExtraTypeInformation) m).typeMatches(arguments[i])
            }

            @Override
            public boolean matches(Object argument) {
                return false; // Condition: !safelyMatches(m, arguments[i])
            }

            @Override
            public String toString() {
                return "matcherToString";
            }
        };
        matchers.add(mockMatcher);
        Object[] arguments = new Object[1];
        arguments[0] = new Object() {
            @Override
            public String toString() {
                return "argumentToString"; // Condition: toStringEquals(m, arguments[i]) is false
            }
        };

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_ContainsExtraTypeInfo_NotMatching_ToStringEquals_TypeMatches() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Matcher mockMatcher = new MockContainsExtraTypeInformation() {
            @Override
            public boolean typeMatches(Object object) {
                return true; // Condition: ((ContainsExtraTypeInformation) m).typeMatches(arguments[i]) is true
            }

            @Override
            public boolean matches(Object argument) {
                return false; // Condition: !safelyMatches(m, arguments[i])
            }

            @Override
            public String toString() {
                return "someStringRepresentation";
            }
        };
        matchers.add(mockMatcher);
        Object[] arguments = new Object[1];
        arguments[0] = new Object() {
            @Override
            public String toString() {
                return "someStringRepresentation";
            }
        };

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_SafelyMatchesThrowsException() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Matcher mockMatcher = new MockContainsExtraTypeInformation() {
            @Override
            public boolean typeMatches(Object object) {
                return false;
            }

            @Override
            public boolean matches(Object argument) {
                throw new RuntimeException("Matcher threw exception"); // SafelyMatches should catch this
            }

            @Override
            public String toString() {
                return "someStringRepresentation";
            }
        };
        matchers.add(mockMatcher);
        Object[] arguments = new Object[1];
        arguments[0] = new Object() {
            @Override
            public String toString() {
                return "someStringRepresentation";
            }
        };

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_MultipleSuspicious() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Object[] arguments = new Object[2];

        Matcher suspiciousMatcher1 = new MockContainsExtraTypeInformation() {
            @Override public boolean typeMatches(Object object) { return false; }
            @Override public boolean matches(Object argument) { return false; }
            @Override public String toString() { return "matcher1"; }
        };
        matchers.add(suspiciousMatcher1);
        arguments[0] = new Object() { @Override public String toString() { return "matcher1"; } };

        Matcher nonSuspiciousMatcher = Matchers.anyString();
        matchers.add(nonSuspiciousMatcher);
        arguments[1] = "someString";

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertArrayEquals(new Integer[]{0}, suspicious);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_MultipleSuspicious_SecondOne() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Object[] arguments = new Object[2];

        Matcher nonSuspiciousMatcher = Matchers.anyInt();
        matchers.add(nonSuspiciousMatcher);
        arguments[0] = 123;

        Matcher suspiciousMatcher2 = new MockContainsExtraTypeInformation() {
            @Override public boolean typeMatches(Object object) { return false; }
            @Override public boolean matches(Object argument) { return false; }
            @Override public String toString() { return "matcher2"; }
        };
        matchers.add(suspiciousMatcher2);
        arguments[1] = new Object() { @Override public String toString() { return "matcher2"; } };

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertArrayEquals(new Integer[]{1}, suspicious);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_MultipleSuspicious_Both() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Object[] arguments = new Object[2];

        Matcher suspiciousMatcher1 = new MockContainsExtraTypeInformation() {
            @Override public boolean typeMatches(Object object) { return false; }
            @Override public boolean matches(Object argument) { return false; }
            @Override public String toString() { return "matcher1"; }
        };
        matchers.add(suspiciousMatcher1);
        arguments[0] = new Object() { @Override public String toString() { return "matcher1"; } };

        Matcher suspiciousMatcher2 = new MockContainsExtraTypeInformation() {
            @Override public boolean typeMatches(Object object) { return false; }
            @Override public boolean matches(Object argument) { return false; }
            @Override public String toString() { return "matcher2"; }
        };
        matchers.add(suspiciousMatcher2);
        arguments[1] = new Object() { @Override public String toString() { return "matcher2"; } };

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertArrayEquals(new Integer[]{0, 1}, suspicious);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_ArgumentToStringIsNull() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        // Matcher that would normally toString() to "null"
        Matcher mockMatcher = new MockContainsExtraTypeInformation() {
            @Override public boolean typeMatches(Object object) { return false; }
            @Override public boolean matches(Object argument) { return false; }
            @Override public String toString() { return "null"; }
        };
        matchers.add(mockMatcher);
        Object[] arguments = new Object[1];
        // Argument that returns null for toString() - this won't happen with Object, but simulating the StringDescription.toString(m).equals(arg == null? "null" : arg.toString()) logic
        arguments[0] = null; // This will be handled by the "arg == null? "null"" part

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        // The condition toStringEquals will be "null".equals("null") which is true.
        // However, other conditions will fail (matches returns false, typeMatches returns false).
        // So it should be suspicious.
        assertArrayEquals(new Integer[]{0}, suspicious);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_MatcherToStringIsNotNullButArgumentIsNull() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        // Matcher that toString()s to "someMatcherString"
        Matcher mockMatcher = new MockContainsExtraTypeInformation() {
            @Override public boolean typeMatches(Object object) { return false; }
            @Override public boolean matches(Object argument) { return false; }
            @Override public String toString() { return "someMatcherString"; }
        };
        matchers.add(mockMatcher);
        Object[] arguments = new Object[1];
        arguments[0] = null; // arg == null is true, so the check is "someMatcherString".equals("null") which is false.

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_LargeNumberOfArgumentsAndMatchers_NoSuspicious() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        int size = 100;
        for (int i = 0; i < size; i++) {
            matchers.add(Matchers.anyObject());
        }
        Object[] arguments = new Object[size];
        for (int i = 0; i < size; i++) {
            arguments[i] = new Object();
        }
        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_LargeNumberOfArgumentsAndMatchers_OneSuspicious() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        int size = 100;
        for (int i = 0; i < size; i++) {
            matchers.add(Matchers.anyObject());
        }
        Object[] arguments = new Object[size];
        for (int i = 0; i < size; i++) {
            arguments[i] = new Object();
        }

        // Make one argument suspicious
        Matcher suspiciousMatcher = new MockContainsExtraTypeInformation() {
            @Override public boolean typeMatches(Object object) { return false; }
            @Override public boolean matches(Object argument) { return false; }
            @Override public String toString() { return "suspicious"; }
        };
        matchers.set(50, suspiciousMatcher); // 50th element
        arguments[50] = new Object() { @Override public String toString() { return "suspicious"; } };

        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertArrayEquals(new Integer[]{50}, suspicious);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_EmptyLists() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Object[] arguments = new Object[0];
        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_StringMatcherToStringArgument() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Matcher stringMatcher = Matchers.eq("test");
        matchers.add(stringMatcher);
        Object[] arguments = new Object[1];
        arguments[0] = "test";

        // The default toString() of String "test" is "test".
        // The org.mockito.Matchers.eq("test") also toString()s to "test".
        // However, String implements ContainsExtraTypeInformation implicitly through Hamcrest,
        // and typeMatches will return true for String.
        // So it's not suspicious by definition.
        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_IntegerMatcherToStringArgument() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Matcher intMatcher = Matchers.eq(123);
        matchers.add(intMatcher);
        Object[] arguments = new Object[1];
        arguments[0] = 123;

        // The default toString() of Integer 123 is "123".
        // The org.mockito.Matchers.eq(123) also toString()s to "123".
        // Integer does not implement ContainsExtraTypeInformation explicitly.
        // So it's not suspicious.
        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }

    // Helper class to provide a concrete implementation for ContainsExtraTypeInformation
    // as required by the compiler.
    private abstract static class MockContainsExtraTypeInformation implements ContainsExtraTypeInformation, Matcher<Object> {

        @Override
        public SelfDescribing withExtraTypeInfo() {
            return this; // Or return null, or a new SelfDescribing object. Not critical for these tests.
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
            // Not used in the code under test
        }
    }
}
