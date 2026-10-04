package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

public class FieldUtilsTest {
    @Test
    public void testSafeNegateZero() throws Exception {
        assertEquals(0, FieldUtils.safeNegate(0));
    }

    @Test
    public void testSafeNegateMinimumThrows() throws Exception {
        try { FieldUtils.safeNegate(Integer.MIN_VALUE); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testSafeNegateMaximum() throws Exception {
        assertEquals(-2147483647, FieldUtils.safeNegate(Integer.MAX_VALUE));
    }

    @Test
    public void testSafeAddPositiveExactMaximum() throws Exception {
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeAdd(Integer.MAX_VALUE - 1, 1));
    }

    @Test
    public void testSafeAddPositiveOverflow() throws Exception {
        try { FieldUtils.safeAdd(Integer.MAX_VALUE, 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testSafeAddNegativeExactMinimum() throws Exception {
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeAdd(Integer.MIN_VALUE + 1, -1));
    }

    @Test
    public void testSafeAddNegativeOverflow() throws Exception {
        try { FieldUtils.safeAdd(Integer.MIN_VALUE, -1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testSafeSubtractNoOverflow() throws Exception {
        assertEquals(7L, FieldUtils.safeSubtract(10L, 3L));
    }

    @Test
    public void testSafeSubtractAtMinimum() throws Exception {
        assertEquals(Long.MIN_VALUE, FieldUtils.safeSubtract(Long.MIN_VALUE + 1, 1L));
    }

    @Test
    public void testSafeSubtractUnderflow() throws Exception {
        try { FieldUtils.safeSubtract(Long.MIN_VALUE, 1L); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testSafeMultiplyIntWithinRange() throws Exception {
        assertEquals(2147395600, FieldUtils.safeMultiply(46340, 46340));
    }

    @Test
    public void testSafeMultiplyIntOverflow() throws Exception {
        try { FieldUtils.safeMultiply(46341, 46341); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testSafeToIntMaximum() throws Exception {
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeToInt(Integer.MAX_VALUE));
    }

    @Test
    public void testSafeToIntMinimum() throws Exception {
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeToInt(Integer.MIN_VALUE));
    }

    @Test
    public void testSafeToIntFirstAboveMaximum() throws Exception {
        try { FieldUtils.safeToInt((long) Integer.MAX_VALUE + 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testSafeToIntFirstBelowMinimum() throws Exception {
        try { FieldUtils.safeToInt((long) Integer.MIN_VALUE - 1); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testSafeMultiplyToIntExactMaximum() throws Exception {
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeMultiplyToInt(2147483647L, 1L));
    }

    @Test
    public void testSafeMultiplyToIntOutsideIntRange() throws Exception {
        try { FieldUtils.safeMultiplyToInt(2147483648L, 1L); fail("expected ArithmeticException"); }
        catch (ArithmeticException expected) { }
    }

    @Test
    public void testVerifyBoundsAcceptsEndpoints() throws Exception {
        FieldUtils.verifyValueBounds((DateTimeField) null, 1, 1, 3);
        FieldUtils.verifyValueBounds((DateTimeField) null, 3, 1, 3);
        assertEquals(2, 2);
    }

    @Test
    public void testVerifyBoundsRejectsBelowLowerBound() throws Exception {
        try {
            FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfMonth(), 0, 1, 3);
            fail("expected IllegalFieldValueException");
        } catch (IllegalFieldValueException expected) {
            assertEquals(Integer.valueOf(0), expected.getIllegalNumberValue());
            assertEquals(Integer.valueOf(1), expected.getLowerBound());
            assertEquals(Integer.valueOf(3), expected.getUpperBound());
        }
    }

    @Test
    public void testVerifyBoundsRejectsAboveUpperBound() throws Exception {
        try {
            FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfMonth(), 4, 1, 3);
            fail("expected IllegalFieldValueException");
        } catch (IllegalFieldValueException expected) {
            assertEquals(Integer.valueOf(4), expected.getIllegalNumberValue());
        }
    }

    @Test
    public void testWrappedValueAtMinimumAndMaximum() throws Exception {
        assertEquals(1, FieldUtils.getWrappedValue(1, 1, 3));
        assertEquals(3, FieldUtils.getWrappedValue(3, 1, 3));
    }

    @Test
    public void testWrappedValueCrossesUpperBoundary() throws Exception {
        assertEquals(1, FieldUtils.getWrappedValue(4, 1, 3));
    }

    @Test
    public void testWrappedValueCrossesLowerBoundary() throws Exception {
        assertEquals(3, FieldUtils.getWrappedValue(0, 1, 3));
    }

    @Test
    public void testWrappedValueWithOffset() throws Exception {
        assertEquals(2, FieldUtils.getWrappedValue(3, 2, 1, 3));
    }

    @Test
    public void testWrappedValueRejectsInvalidRange() throws Exception {
        try { FieldUtils.getWrappedValue(1, 3, 3); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testEqualsHandlesNullAndEqualObjects() throws Exception {
        assertTrue(FieldUtils.equals(null, null));
        assertFalse(FieldUtils.equals(null, "x"));
        assertTrue(FieldUtils.equals("x", new String("x")));
    }

    @Test
    public void testEqualsRejectsDifferentObjects() throws Exception {
        assertFalse(FieldUtils.equals("x", "y"));
    }
}
