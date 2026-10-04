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

    // Helper class to provide a concrete implementation for ContainsExtraTypeInformation
    // as required by the compiler. It also needs to implement Matcher.
    private abstract static class MockMatcherWithExtraTypeInfo implements ContainsExtraTypeInformation, Matcher<Object> {

        @Override
        public SelfDescribing withExtraTypeInfo() {
            return this;
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
            // Not used in the code under test.
        }
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
    public void testGetSuspiciouslyNotMatchingArgsIndexes_EmptyLists() throws Exception {
        ArgumentMatchingTool tool = new ArgumentMatchingTool();
        List<Matcher> matchers = new LinkedList<Matcher>();
        Object[] arguments = new Object[0];
        Integer[] suspicious = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, suspicious.length);
    }


}

