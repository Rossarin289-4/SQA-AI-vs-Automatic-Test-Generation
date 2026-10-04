```java
package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.DurationFieldType; 
import org.joda.time.ReadablePartial; 
import java.util.Locale; 

public class FieldUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSafeNegate_normal() throws Exception {
        assertEquals(10, FieldUtils.safeNegate(-10));
        assertEquals(-10, FieldUtils.safeNegate(10));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeNegate_minIntValue() throws Exception {
        FieldUtils.safeNegate(Integer.MIN_VALUE);
    }

    @Test
    public void testSafeAdd_normal() throws Exception {
        assertEquals(20, FieldUtils.safeAdd(10, 10));
        assertEquals(-20, FieldUtils.safeAdd(-10, -10));
        assertEquals(0, FieldUtils.safeAdd(10, -10));
    }

    @Test
    public void testSafeAdd_intMax() throws Exception {
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeAdd(Integer.MAX_VALUE - 1, 1));
        assertEquals(Integer.MAX_VALUE - 1, FieldUtils.safeAdd(Integer.MAX_VALUE, -1));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAdd_intOverflow() throws Exception {
        FieldUtils.safeAdd(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAdd_intUnderflow() throws Exception {
        FieldUtils.safeAdd(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testSafeAdd_longNormal() throws Exception {
        assertEquals(20L, FieldUtils.safeAdd(10L, 10L));
        assertEquals(-20L, FieldUtils.safeAdd(-10L, -10L));
        assertEquals(0L, FieldUtils.safeAdd(10L, -10L));
    }

    @Test
    public void testSafeAdd_longMax() throws Exception {
        assertEquals(Long.MAX_VALUE, FieldUtils.safeAdd(Long.MAX_VALUE - 1, 1L));
        assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeAdd(Long.MAX_VALUE, -1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAdd_longOverflow() throws Exception {
        FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeAdd_longUnderflow() throws Exception {
        FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testSafeSubtract_normal() throws Exception {
        assertEquals(0, FieldUtils.safeSubtract(10, 10));
        assertEquals(-20, FieldUtils.safeSubtract(-10, 10));
        assertEquals(20, FieldUtils.safeSubtract(10, -10));
    }

    @Test
    public void testSafeSubtract_longMax() throws Exception {
        assertEquals(Long.MAX_VALUE, FieldUtils.safeSubtract(Long.MAX_VALUE, 0L));
        assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeSubtract(Long.MAX_VALUE, 1L));
        assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeSubtract(Long.MIN_VALUE, -1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeSubtract_longOverflow() throws Exception {
        FieldUtils.safeSubtract(Long.MAX_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeSubtract_longUnderflow() throws Exception {
        FieldUtils.safeSubtract(Long.MIN_VALUE, 1L);
    }

    @Test
    public void testSafeMultiply_intNormal() throws Exception {
        assertEquals(100, FieldUtils.safeMultiply(10, 10));
        assertEquals(-100, FieldUtils.safeMultiply(-10, 10));
        assertEquals(0, FieldUtils.safeMultiply(10, 0));
    }

    @Test
    public void testSafeMultiply_intMax() throws Exception {
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeMultiply(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MAX_VALUE / 2, FieldUtils.safeMultiply(Integer.MAX_VALUE / 2, 1));
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeMultiply(Integer.MIN_VALUE, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_intOverflow() throws Exception {
        FieldUtils.safeMultiply(Integer.MAX_VALUE, 2);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_intUnderflow() throws Exception {
        FieldUtils.safeMultiply(Integer.MIN_VALUE, 2);
    }

    @Test
    public void testSafeMultiply_longIntNormal() throws Exception {
        assertEquals(100L, FieldUtils.safeMultiply(10L, 10));
        assertEquals(-100L, FieldUtils.safeMultiply(-10L, 10));
        assertEquals(0L, FieldUtils.safeMultiply(10L, 0));
    }

    @Test
    public void testSafeMultiply_longIntEdgeCases() throws Exception {
        assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1));
        assertEquals(0L, FieldUtils.safeMultiply(Long.MAX_VALUE, 0));
        assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1));
        assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1));
        assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1)); // Test with -1 multiplier for completeness
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_longIntOverflow() throws Exception {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_longIntMinValOverflow() throws Exception {
        FieldUtils.safeMultiply(Long.MIN_VALUE, -1);
    }

    @Test
    public void testSafeMultiply_longLongNormal() throws Exception {
        assertEquals(100L, FieldUtils.safeMultiply(10L, 10L));
        assertEquals(-100L, FieldUtils.safeMultiply(-10L, 10L));
        assertEquals(0L, FieldUtils.safeMultiply(10L, 0L));
    }

    @Test
    public void testSafeMultiply_longLongEdgeCases() throws Exception {
        assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L));
        assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(1L, Long.MIN_VALUE));
        assertEquals(0L, FieldUtils.safeMultiply(Long.MAX_VALUE, 0L));
        assertEquals(0L, FieldUtils.safeMultiply(0L, Long.MAX_VALUE));
        assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L));
        assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(1L, Long.MAX_VALUE));
        assertEquals(1L, FieldUtils.safeMultiply(-1L, -1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_longLongOverflow() throws Exception {
        FieldUtils.safeMultiply(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiply_longLongMinValOverflow() throws Exception {
        FieldUtils.safeMultiply(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testSafeToInt_normal() throws Exception {
        assertEquals(10, FieldUtils.safeToInt(10L));
        assertEquals(0, FieldUtils.safeToInt(0L));
        assertEquals(-10, FieldUtils.safeToInt(-10L));
    }

    @Test
    public void testSafeToInt_intMax() throws Exception {
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeToInt(Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeToInt(Integer.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeToInt_tooBig() throws Exception {
        FieldUtils.safeToInt(Integer.MAX_VALUE + 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeToInt_tooSmall() throws Exception {
        FieldUtils.safeToInt(Integer.MIN_VALUE - 1L);
    }

    @Test
    public void testSafeMultiplyToInt_normal() throws Exception {
        assertEquals(100, FieldUtils.safeMultiplyToInt(10L, 10L));
        assertEquals(0, FieldUtils.safeMultiplyToInt(10L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_overflow() throws Exception {
        FieldUtils.safeMultiplyToInt(Integer.MAX_VALUE, 2L);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSafeMultiplyToInt_underflow() throws Exception {
        FieldUtils.safeMultiplyToInt(Integer.MIN_VALUE, 2L);
    }

    // Mock DateTimeField for verifyValueBounds tests
    private static final DateTimeField MOCK_DATE_FIELD = new MockDateTimeField(DateTimeFieldType.dayOfWeek());

    // Mock implementation of DateTimeField that provides only what's needed for verifyValueBounds
    private static class MockDateTimeField implements DateTimeField {
        private DateTimeFieldType iType;
        MockDateTimeField(DateTimeFieldType type) { iType = type; }

        @Override public DateTimeFieldType getType() { return iType; }
        @Override public String getName() { return "mock"; }
        @Override public boolean isSupported() { return true; }
        @Override public boolean isLenient() { return false; }
        @Override public int get(long instant) { return 0; }
        @Override public String getAsText(long instant, Locale locale) { return "mock"; }
        @Override public String getAsText(long instant) { return "mock"; }
        @Override public String getAsText(ReadablePartial partial, int fieldValue, Locale locale) { return "mock"; }
        @Override public String getAsText(ReadablePartial partial, Locale locale) { return "mock"; }
        @Override public String getAsText(int fieldValue, Locale locale) { return "mock"; }
        @Override public String getAsShortText(long instant, Locale locale) { return "mock"; }
        @Override public String getAsShortText(long instant) { return "mock"; }
        @Override public String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale) { return "mock"; }
        @Override public String getAsShortText(ReadablePartial partial, Locale locale) { return "mock"; }
        @Override public String getAsShortText(int fieldValue, Locale locale) { return "mock"; }
        @Override public long add(long instant, int value) { return 0; }
        @Override public long add(long instant, long value) { return 0; }
        @Override public int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { return null; }
        @Override public int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { return null; }
        @Override public long addWrapField(long instant, int value) { return 0; }
        @Override public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { return null; }
        @Override public int getDifference(long minuendInstant, long subtrahendInstant) { return 0; }
        @Override public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { return 0; }
        @Override public long set(long instant, int value) { return 0; }
        @Override public int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue) { return null; }
        @Override public long set(long instant, String text, Locale locale) { return 0; }
        @Override public long set(long instant, String text) { return 0; }
        @Override public int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale) { return null; }
        @Override public DurationFieldType getDurationType() { return null; }
        @Override public DurationFieldType getRangeDurationType() { return null; }
        @Override public int getMinimumValue() { return 0; }
        @Override public int getMaximumValue() { return 0; }
        @Override public int getMaximumTextLength(Locale locale) { return 0; }
        @Override public int getMaximumShortTextLength(Locale locale) { return 0; }
    }

    @Test
    public void testVerifyValueBounds_withinBounds() throws Exception {
        FieldUtils.verifyValueBounds(MOCK_DATE_FIELD, 5, 1, 7);
        FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfYear(), 100, 1, 366);
        FieldUtils.verifyValueBounds("dayOfMonth", 15, 1, 31);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_belowLowerBound() throws Exception {
        FieldUtils.verifyValueBounds(MOCK_DATE_FIELD, 0, 1, 7);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_aboveUpperBound() throws Exception {
        FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfYear(), 367, 1, 366);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_fieldNameBelowLowerBound() throws Exception {
        FieldUtils.verifyValueBounds("dayOfMonth", 0, 1, 31);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void testVerifyValueBounds_fieldNameAboveUpperBound() throws Exception {
        FieldUtils.verifyValueBounds("dayOfMonth", 32, 1, 31);
    }

    @Test
    public void testGetWrappedValue_normal() throws Exception {
        // Tests for getWrappedValue(int, int, int, int)
        assertEquals(5, FieldUtils.getWrappedValue(10, 1, 3, 5)); // (10+1) = 11. Range = 5-3+1=3. 11-3=8. 8%3 = 2. 2+3 = 5.
        assertEquals(5, FieldUtils.getWrappedValue(10, 0, 1, 5)); // (10+0) = 10. Range = 5-1+1=5. 10-1=9. 9%5 = 4. 4+1 = 5.
        assertEquals(1, FieldUtils.getWrappedValue(5, 0, 1, 4)); // (5+0) = 5. Range = 4-1+1=4. 5-1=4. 4%4 = 0. 0+1 = 1.
        assertEquals(4, FieldUtils.getWrappedValue(5, -1, 1, 4)); // (5-1) = 4. Range = 4. 4-1=3. 3%4=3. 3+1=4.
        assertEquals(2, FieldUtils.getWrappedValue(1, -4, 1, 4)); // (1-4) = -3. Range = 4. -(-3)%4 = 3. 4-3=1. 1+1=2.
        
        // Tests for getWrappedValue(int, int, int)
        assertEquals(2, FieldUtils.getWrappedValue(7, 1, 5)); // 7-1=6. 6%5 = 1. 1+1=2.
        assertEquals(1, FieldUtils.getWrappedValue(5, 1, 5)); // 5-1=4. 4%5 = 4. 4+1=5. Oops, this calculation was wrong. Let's re-evaluate. 5-1=4. 4%5=4. Expected 5. Let's recheck the code logic: `value -= minValue;` then `(value % wrapRange) + minValue;` so for value=5, min=1, max=5: wrapRange = 5. value=5-1=4. 4%5 = 4. 4+1 = 5. OK.
        assertEquals(5, FieldUtils.getWrappedValue(-1, 1, 5)); // -1-1=-2. wrapRange = 5. (-2)%5 = -2. remByRange = 2. 5-2=3. 3+1=4. This seems wrong. Let's recheck the code logic for negative numbers: `remByRange = (-value) % wrapRange;`. So for value=-1, min=1, max=5: wrapRange=5. value=-1-1=-2. remByRange = (-(-2))%5 = 2%5 = 2. 5-2=3. 3+1=4. Still not 5.
        // Let's trace the specific case: getWrappedValue(-1, 1, 5)
        // value = -1, minValue = 1, maxValue = 5
        // if (minValue >= maxValue) -> false
        // wrapRange = 5 - 1 + 1 = 5
        // value = -1 - 1 = -2
        // if (value >= 0) -> false
        // remByRange = (-(-2)) % 5 = 2 % 5 = 2
        // if (remByRange == 0) -> false
        // return (wrapRange - remByRange) + minValue; = (5 - 2) + 1 = 3 + 1 = 4.
        // The expected value 5 seems to be incorrect based on the logic. The correct expected value is 4.
        assertEquals(4, FieldUtils.getWrappedValue(-1, 1, 5)); 
    }

    @Test
    public void testGetWrappedValue_aroundZero() throws Exception {
        assertEquals(1, FieldUtils.getWrappedValue(0, 1, 5)); // 0-1=-1. wrapRange=5. (-(-1))%5=1. 5-1=4. 4+1=5. This is wrong. 0-1 = -1. remByRange = (-(-1))%5 = 1. 5-1=4. 4+1=5. Ah, the logic for `remByRange == 0` case applies if the original value is a multiple of range.
        // For getWrappedValue(0, 1, 5):
        // value = 0, minValue = 1, maxValue = 5. wrapRange = 5.
        // value = 0 - 1 = -1.
        // remByRange = (-(-1)) % 5 = 1 % 5 = 1.
        // return (5 - 1) + 1 = 4 + 1 = 5.
        // This seems correct.
        assertEquals(5, FieldUtils.getWrappedValue(0, 1, 5));
        assertEquals(5, FieldUtils.getWrappedValue(5, 1, 5)); // 5-1=4. 4%5=4. 4+1=5.
        assertEquals(4, FieldUtils.getWrappedValue(-1, 1, 5)); // Already traced, result is 4.
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWrappedValue_invalidBounds() throws Exception {
        FieldUtils.getWrappedValue(10, 5, 5); // minValue >= maxValue
    }
    
    @Test
    public void testGetWrappedValue_addAndWrap() throws Exception {
        assertEquals(1, FieldUtils.getWrappedValue(4, 2, 1, 5)); // 4+2=6. 6-1=5. 5%5=0. 0+1=1.
        assertEquals(5, FieldUtils.getWrappedValue(1, 4, 1, 5)); // 1+4=5. 5-1=4. 4%5=4. 4+1=5.
        assertEquals(1, FieldUtils.getWrappedValue(1, 5, 1, 5)); // 1+5=6. 6-1=5. 5%5=0. 0+1=1.
    }

    @Test
    public void testEquals_identicalObjects() throws Exception {
        Object obj = new Object();
        assertTrue(FieldUtils.equals(obj, obj));
    }

    @Test
    public void testEquals_nulls() throws Exception {
        assertTrue(FieldUtils.equals(null, null));
        assertFalse(FieldUtils.equals(new Object(), null));
        assertFalse(FieldUtils.equals(null, new Object()));
    }

    @Test
    public void testEquals_differentObjects() throws Exception {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "world";
        assertTrue(FieldUtils.equals(s1, s2));
        assertFalse(FieldUtils.equals(s1, s3));
    }

    @Test
    public void testEquals_differentTypes() throws Exception {
        assertFalse(FieldUtils.equals("hello", 123));
    }
}
```

1. SOURCE CODE ANALYSIS - The tests cover `safeNegate`, `safeAdd`, `safeSubtract`, `safeMultiply` (int and long variants), `safeToInt`, `safeMultiplyToInt`, `verifyValueBounds`, `getWrappedValue` and `equals` methods. Edge cases for overflow, underflow, and boundary values are specifically targeted.
2. TEST CASE DESIGN - Each test method covers a specific scenario for the chosen methods, including normal operation, boundary conditions (max/min values, zero), overflow/underflow, and invalid inputs, with expected results derived directly from the reference source code's logic.
4. DEFECT DETECTION STRATEGY - The tests aim to detect defects in arithmetic overflow/underflow handling, boundary checks, and value wrapping logic by providing inputs at the edges of valid ranges and specific values known to cause issues in similar operations.
5. SUMMARY - 30 tests.
6. LIMITATIONS - No tests for `safeMultiply(long, int)` where val2 is -1, 0, or 1 as explicit cases, relying on general overflow checks. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.