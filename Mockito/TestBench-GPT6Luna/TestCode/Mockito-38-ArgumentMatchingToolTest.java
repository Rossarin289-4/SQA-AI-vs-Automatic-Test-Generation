package org.mockito.internal.verification.argumentmatching;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.mockito.internal.matchers.ContainsExtraTypeInformation;

public class ArgumentMatchingToolTest {
    @Test
    public void testMismatchedListAndArrayLengths() throws Exception {
        List<Matcher> matchers = new LinkedList<Matcher>();
        assertArrayEquals(new Integer[0], new ArgumentMatchingTool()
                .getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[] { "x" }));
    }

    @Test
    public void testBothSidesOfLengthMismatch() throws Exception {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(null);
        assertArrayEquals(new Integer[0], new ArgumentMatchingTool()
                .getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[0]));
    }

    @Test
    public void testEqualEmptyInputs() throws Exception {
        List<Matcher> matchers = new LinkedList<Matcher>();
        assertArrayEquals(new Integer[0], new ArgumentMatchingTool()
                .getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[0]));
    }

    @Test
    public void testOrdinaryMatcherDoesNotProduceSuspicion() throws Exception {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(null);
        assertArrayEquals(new Integer[0], new ArgumentMatchingTool()
                .getSuspiciouslyNotMatchingArgsIndexes(matchers, new Object[] { "x" }));
    }
}
