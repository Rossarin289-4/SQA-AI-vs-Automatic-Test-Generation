package org.apache.commons.collections.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.apache.commons.collections.Predicate;

public class EqualPredicateTest {
    @Test
    public void testFactoryMatchesEqualString() throws Exception {
        Predicate<String> predicate = EqualPredicate.equalPredicate(new String("same"));
        assertTrue(predicate.evaluate(new String("same")));
    }

    @Test
    public void testFactoryRejectsDifferentString() throws Exception {
        Predicate<String> predicate = EqualPredicate.equalPredicate("same");
        assertFalse(predicate.evaluate("other"));
    }

    @Test
    public void testFactoryNullMatchesNull() throws Exception {
        Predicate<String> predicate = EqualPredicate.equalPredicate((String) null);
        assertTrue(predicate.evaluate(null));
    }

    @Test
    public void testFactoryNullRejectsNonNull() throws Exception {
        Predicate<String> predicate = EqualPredicate.equalPredicate((String) null);
        assertFalse(predicate.evaluate("value"));
    }

    @Test
    public void testConstructorUsesEqualsForDistinctStrings() throws Exception {
        EqualPredicate<String> predicate = new EqualPredicate<String>(new String("same"));
        assertTrue(predicate.evaluate(new String("same")));
    }

    @Test
    public void testConstructorRejectsDifferentCase() throws Exception {
        EqualPredicate<String> predicate = new EqualPredicate<String>("same");
        assertFalse(predicate.evaluate("SAME"));
    }

    @Test
    public void testNonNullValueRejectsNullInput() throws Exception {
        EqualPredicate<String> predicate = new EqualPredicate<String>("value");
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testNullStoredValueThrowsOnEvaluation() throws Exception {
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        try {
            predicate.evaluate(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testGetValueReturnsStoredReference() throws Exception {
        String value = new String("value");
        EqualPredicate<String> predicate = new EqualPredicate<String>(value);
        assertSame(value, predicate.getValue());
    }

    @Test
    public void testGetValueReturnsNullWhenStoredValueIsNull() throws Exception {
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        assertNull(predicate.getValue());
    }

    @Test
    public void testEvaluateIntegerZero() throws Exception {
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(0);
        assertTrue(predicate.evaluate(Integer.valueOf(0)));
    }

    @Test
    public void testEvaluateIntegerNegativeOne() throws Exception {
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(-1);
        assertFalse(predicate.evaluate(Integer.valueOf(1)));
    }

    @Test
    public void testEvaluateIntegerMaximumValue() throws Exception {
        EqualPredicate<Integer> predicate =
                new EqualPredicate<Integer>(Integer.valueOf(Integer.MAX_VALUE));
        assertTrue(predicate.evaluate(Integer.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    public void testEvaluateIntegerMinimumValue() throws Exception {
        EqualPredicate<Integer> predicate =
                new EqualPredicate<Integer>(Integer.valueOf(Integer.MIN_VALUE));
        assertTrue(predicate.evaluate(Integer.valueOf(Integer.MIN_VALUE)));
    }
}
