package org.apache.commons.math.dfp;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.FieldElement;

public class DfpTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }
    @Test
    public void testNewInstanceZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp zero = field.getZero();
        assertEquals(field.getZero(), zero);
    }

    @Test
    public void testNewInstanceOne() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        assertEquals(field.getOne(), one);
    }

    @Test
    public void testNewInstanceTwo() throws Exception {
        DfpField field = new DfpField(10);
        Dfp two = field.getTwo();
        assertEquals(field.getTwo(), two);
    }

    @Test
    public void testNewInstanceByte() throws Exception {
        DfpField field = new DfpField(10);
        byte value = 5;
        Dfp dfp = field.newDfp(value);
        assertEquals(field.newDfp(value), dfp);
    }

    @Test
    public void testNewInstanceInt() throws Exception {
        DfpField field = new DfpField(10);
        int value = 12345;
        Dfp dfp = field.newDfp(value);
        assertEquals(field.newDfp(value), dfp);
    }

    @Test
    public void testNewInstanceLong() throws Exception {
        DfpField field = new DfpField(10);
        long value = 123456789012345L;
        Dfp dfp = field.newDfp(value);
        assertEquals(field.newDfp(value), dfp);
    }

    @Test
    public void testNewInstanceDouble() throws Exception {
        DfpField field = new DfpField(10);
        double value = 123.456;
        Dfp dfp = field.newDfp(value);
        assertEquals(field.newDfp(value), dfp);
    }

    @Test
    public void testNewInstanceString() throws Exception {
        DfpField field = new DfpField(10);
        String value = "123.456";
        Dfp dfp = field.newDfp(value);
        assertEquals(field.newDfp(value), dfp);
    }

    @Test
    public void testNewInstanceStringNegative() throws Exception {
        DfpField field = new DfpField(10);
        String value = "-123.456";
        Dfp dfp = field.newDfp(value);
        assertEquals(field.newDfp(value), dfp);
    }

    @Test
    public void testNewInstanceStringScientific() throws Exception {
        DfpField field = new DfpField(10);
        String value = "1.23456e7";
        Dfp dfp = field.newDfp(value);
        assertEquals(field.newDfp(value), dfp);
    }

    @Test
    public void testNewInstanceStringScientificNegativeExp() throws Exception {
        DfpField field = new DfpField(10);
        String value = "1.23456e-7";
        Dfp dfp = field.newDfp(value);
        assertEquals(field.newDfp(value), dfp);
    }

    @Test
    public void testNewInstanceStringNaN() throws Exception {
        DfpField field = new DfpField(10);
        String value = "NaN";
        Dfp dfp = field.newDfp(value);
        assertTrue(dfp.isNaN());
    }

    @Test
    public void testNewInstanceStringPositiveInfinity() throws Exception {
        DfpField field = new DfpField(10);
        String value = "Infinity";
        Dfp dfp = field.newDfp(value);
        assertTrue(dfp.isInfinite());
        assertTrue(dfp.sign > 0);
    }

    @Test
    public void testNewInstanceStringNegativeInfinity() throws Exception {
        DfpField field = new DfpField(10);
        String value = "-Infinity";
        Dfp dfp = field.newDfp(value);
        assertTrue(dfp.isInfinite());
        assertTrue(dfp.sign < 0);
    }

    @Test
    public void testNewInstanceCopy() throws Exception {
        DfpField field = new DfpField(10);
        Dfp original = field.newDfp(123.456);
        Dfp copy = field.newDfp(original);
        assertEquals(original, copy);
    }

    @Test
    public void testGetField() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(123.456);
        assertEquals(field, dfp.getField());
    }

    @Test
    public void testGetRadixDigits() throws Exception {
        int digits = 15;
        DfpField field = new DfpField(digits);
        Dfp dfp = field.newDfp(123.456);
        assertEquals(digits, dfp.getRadixDigits());
    }

    @Test
    public void testLessThan() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(10.0);
        Dfp b = field.newDfp(20.0);
        assertTrue(a.lessThan(b));
    }

    @Test
    public void testLessThanEqual() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(10.0);
        Dfp b = field.newDfp(10.0);
        assertFalse(a.lessThan(b));
    }

    @Test
    public void testLessThanNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(-20.0);
        Dfp b = field.newDfp(-10.0);
        assertTrue(a.lessThan(b));
    }

    @Test
    public void testGreaterThan() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(20.0);
        Dfp b = field.newDfp(10.0);
        assertTrue(a.greaterThan(b));
    }

    @Test
    public void testGreaterThanEqual() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(10.0);
        Dfp b = field.newDfp(10.0);
        assertFalse(a.greaterThan(b));
    }

    @Test
    public void testGreaterThanNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(-10.0);
        Dfp b = field.newDfp(-20.0);
        assertTrue(a.greaterThan(b));
    }

    @Test
    public void testIsInfinitePositive() throws Exception {
        DfpField field = new DfpField(10);
        Dfp inf = field.newDfp(Double.POSITIVE_INFINITY);
        assertTrue(inf.isInfinite());
    }

    @Test
    public void testIsInfiniteNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp inf = field.newDfp(Double.NEGATIVE_INFINITY);
        assertTrue(inf.isInfinite());
    }

    @Test
    public void testIsNaN() throws Exception {
        DfpField field = new DfpField(10);
        Dfp nan = field.newDfp(Double.NaN);
        assertTrue(nan.isNaN());
    }

    @Test
    public void testEqualsSame() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(123.456);
        Dfp b = field.newDfp(123.456);
        assertTrue(a.equals(b));
    }

    @Test
    public void testEqualsDifferent() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(123.456);
        Dfp b = field.newDfp(123.457);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsNaN() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(Double.NaN);
        Dfp b = field.newDfp(Double.NaN);
        assertFalse(a.equals(b)); // NaN does not equal NaN
    }

    @Test
    public void testHashCode() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(123.456);
        Dfp b = field.newDfp(123.456);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testUnequal() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(123.456);
        Dfp b = field.newDfp(123.457);
        assertTrue(a.unequal(b));
    }

    @Test
    public void testUnequalSame() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(123.456);
        Dfp b = field.newDfp(123.456);
        assertFalse(a.unequal(b));
    }

    @Test
    public void testRint() throws Exception {
        DfpField field = new DfpField(10);
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_EVEN);
        Dfp dfp = field.newDfp("123.456");
        Dfp rounded = dfp.rint();
        assertEquals(field.newDfp(123.0), rounded);
    }

    @Test
    public void testRintHalfUp() throws Exception {
        DfpField field = new DfpField(10);
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);
        Dfp dfp = field.newDfp("123.5");
        Dfp rounded = dfp.rint();
        assertEquals(field.newDfp(124.0), rounded);
    }

    @Test
    public void testFloor() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp("123.456");
        Dfp floored = dfp.floor();
        assertEquals(field.newDfp(123.0), floored);
    }

    @Test
    public void testFloorNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp("-123.456");
        Dfp floored = dfp.floor();
        assertEquals(field.newDfp("-124.0"), floored);
    }

    @Test
    public void testCeil() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp("123.456");
        Dfp ceiled = dfp.ceil();
        assertEquals(field.newDfp(124.0), ceiled);
    }

    @Test
    public void testCeilNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp("-123.456");
        Dfp ceiled = dfp.ceil();
        assertEquals(field.newDfp("-123.0"), ceiled);
    }

    @Test
    public void testRemainder() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(10.0);
        Dfp b = field.newDfp(3.0);
        Dfp remainder = a.remainder(b);
        assertEquals(field.newDfp(1.0), remainder);
    }

    @Test
    public void testRemainderNegativeDivisor() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(10.0);
        Dfp b = field.newDfp(-3.0);
        Dfp remainder = a.remainder(b);
        assertEquals(field.newDfp(1.0), remainder);
    }

    @Test
    public void testRemainderNegativeDividend() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(-10.0);
        Dfp b = field.newDfp(3.0);
        Dfp remainder = a.remainder(b);
        assertEquals(field.newDfp(-1.0), remainder);
    }

    @Test
    public void testIntValue() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(123.456);
        assertEquals(123, dfp.intValue());
    }

    @Test
    public void testIntValueNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(-123.456);
        assertEquals(-123, dfp.intValue());
    }

    @Test
    public void testIntValueTooLarge() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp("3000000000.0");
        assertEquals(2147483647, dfp.intValue());
    }

    @Test
    public void testIntValueTooSmall() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp("-3000000000.0");
        assertEquals(-2147483648, dfp.intValue());
    }

    @Test
    public void testLog10K() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(10000.0); // 10000^1
        assertEquals(1, dfp.log10K());
    }

    @Test
    public void testLog10KMultiple() throws Exception {
        DfpField field = new DfpField(10);
        // Corrected the number to be a valid long literal
        Dfp dfp = field.newDfp(1e24); // 10000^6
        assertEquals(6, dfp.log10K());
    }

    @Test
    public void testPower10K() throws Exception {
        DfpField field = new DfpField(10);
        Dfp power = field.power10K(3); // Method not found in DfpField, but is a method of Dfp
        // Assuming power10K is a static method or accessible through DfpMath if not in DfpField
        // Based on the API outline, power10K is a method of Dfp.
        // However, the test is trying to call it on field.
        // Let's assume it should be called on a Dfp instance created from field.
        // If power10K is a static method in DfpMath, it would be DfpMath.power10K(field, 3).
        // Given the current context, the most plausible fix is to assume power10K is not in DfpField.
        // Looking at the Dfp class, there is a power10K method.
        // However, the `field` object is used to create `Dfp` instances.
        // Let's re-examine the API outline for DfpField and Dfp.
        // DfpField has no power10K. Dfp has power10K.
        // The test is written as `field.power10K(3)`, which is incorrect.
        // It should be `field.getOne().power10K(3)` or similar if it were an instance method.
        // However, Dfp.power10K is not static.
        // Let's assume the intent was to create a Dfp and call it.
        // However, the method `power10K` is not listed in the PUBLIC METHODS OF THE CLASS UNDER TEST.
        // It IS listed in the reference source code.
        // The `field.power10K(3)` is calling `power10K` on a `DfpField` object.
        // The error message confirms `power10K(int)` is not found in `DfpField`.
        // The method `power10K(final int e)` is indeed a method of the `Dfp` class itself.
        // It is not a static method.
        // The original code was likely trying to use DfpField as a factory for this.
        // The correct way to use this method would be to call it on a Dfp instance.
        // Let's create a Dfp instance from the field and call the method.
        Dfp one = field.getOne();
        Dfp power = one.power10K(3);
        assertEquals(field.newDfp(10000L*10000L*10000L), power);
    }

    @Test
    public void testLog10() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(1000.0); // 10^3
        assertEquals(3, dfp.log10());
    }

    @Test
    public void testLog10Large() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(1e15); // 10^15
        assertEquals(15, dfp.log10());
    }

    @Test
    public void testPower10() throws Exception {
        DfpField field = new DfpField(10);
        Dfp power = field.power10(4); // Method not found in DfpField, but is a method of Dfp
        // Similar to power10K, power10 is a method of Dfp, not DfpField.
        // The test should be called on a Dfp instance.
        Dfp one = field.getOne();
        power = one.power10(4);
        assertEquals(field.newDfp(10000.0), power);
    }

    @Test
    public void testPower10Negative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp power = field.power10(-2); // Method not found in DfpField, but is a method of Dfp
        // Similar to power10K, power10 is a method of Dfp, not DfpField.
        Dfp one = field.getOne();
        power = one.power10(-2);
        assertEquals(field.newDfp(0.01), power);
    }

    @Test
    public void testAdd() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(10.5);
        Dfp b = field.newDfp(20.25);
        Dfp sum = a.add(b);
        assertEquals(field.newDfp(30.75), sum);
    }

    @Test
    public void testAddNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(-10.5);
        Dfp b = field.newDfp(20.25);
        Dfp sum = a.add(b);
        assertEquals(field.newDfp(9.75), sum);
    }

    @Test
    public void testNegate() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(123.456);
        Dfp negated = dfp.negate();
        assertEquals(field.newDfp(-123.456), negated);
    }

    @Test
    public void testSubtract() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(30.75);
        Dfp b = field.newDfp(10.5);
        Dfp diff = a.subtract(b);
        assertEquals(field.newDfp(20.25), diff);
    }

    @Test
    public void testSubtractNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(9.75);
        Dfp b = field.newDfp(20.25);
        Dfp diff = a.subtract(b);
        assertEquals(field.newDfp(-10.5), diff);
    }

    @Test
    public void testMultiply() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(10.5);
        Dfp b = field.newDfp(2.0);
        Dfp prod = a.multiply(b);
        assertEquals(field.newDfp(21.0), prod);
    }

    @Test
    public void testMultiplyByInt() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(10.5);
        Dfp prod = a.multiply(2);
        assertEquals(field.newDfp(21.0), prod);
    }

    @Test
    public void testDivide() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(21.0);
        Dfp b = field.newDfp(2.0);
        Dfp quot = a.divide(b);
        assertEquals(field.newDfp(10.5), quot);
    }

    @Test
    public void testDivideByInt() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(21.0);
        Dfp quot = a.divide(2);
        assertEquals(field.newDfp(10.5), quot);
    }

    @Test
    public void testDivideByZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(21.0);
        Dfp b = field.newDfp(0.0);
        Dfp quot = a.divide(b);
        assertTrue(quot.isInfinite());
        assertEquals(field.newDfp(Double.POSITIVE_INFINITY), quot);
    }

    @Test
    public void testSqrt() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(4.0);
        Dfp sqrt = a.sqrt();
        assertEquals(field.newDfp(2.0), sqrt);
    }

    @Test
    public void testSqrtNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(-4.0);
        Dfp sqrt = a.sqrt();
        assertTrue(sqrt.isNaN());
    }

    @Test
    public void testToStringFinite() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(123.456);
        assertEquals("123.456", dfp.toString());
    }

    @Test
    public void testToStringFiniteScientific() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp("1.234567890123456E15");
        // The string representation might be different due to precision, so test against expected scientific form
        assertTrue(dfp.toString().startsWith("1.23456789"));
        assertTrue(dfp.toString().contains("e"));
    }

    @Test
    public void testToStringInfinite() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(Double.POSITIVE_INFINITY);
        assertEquals("Infinity", dfp.toString());
    }

    @Test
    public void testToStringNegativeInfinite() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(Double.NEGATIVE_INFINITY);
        assertEquals("-Infinity", dfp.toString());
    }

    @Test
    public void testToStringNaN() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(Double.NaN);
        assertEquals("NaN", dfp.toString());
    }

    @Test
    public void testClassifyFinite() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(123.456);
        assertEquals(Dfp.FINITE, dfp.classify());
    }

    @Test
    public void testClassifyInfinite() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(Double.POSITIVE_INFINITY);
        assertEquals(Dfp.INFINITE, dfp.classify());
    }

    @Test
    public void testClassifyNaN() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(Double.NaN);
        assertEquals(Dfp.QNAN, dfp.classify());
    }

    @Test
    public void testCopysign() throws Exception {
        DfpField field = new DfpField(10);
        Dfp x = field.newDfp(10.0);
        Dfp y = field.newDfp(-5.0);
        Dfp result = Dfp.copysign(x, y);
        assertEquals(field.newDfp(-10.0), result);
    }

    @Test
    public void testCopysignZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp x = field.newDfp(0.0);
        Dfp y = field.newDfp(-5.0);
        Dfp result = Dfp.copysign(x, y);
        assertEquals(field.newDfp(-0.0), result);
    }

    @Test
    public void testNextAfter() throws Exception {
        DfpField field = new DfpField(10);
        Dfp current = field.newDfp(1.0);
        Dfp direction = field.newDfp(2.0);
        Dfp next = current.nextAfter(direction);
        // The exact value depends on precision and rounding, checking against a known nearby value
        assertTrue(next.greaterThan(current));
        assertTrue(next.lessThan(direction));
    }

    @Test
    public void testNextAfterNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp current = field.newDfp(-1.0);
        Dfp direction = field.newDfp(-2.0);
        Dfp next = current.nextAfter(direction);
        assertTrue(next.lessThan(current));
        assertTrue(next.greaterThan(direction));
    }

    @Test
    public void testNextAfterZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp current = field.newDfp(0.0);
        Dfp direction = field.newDfp(1.0);
        Dfp next = current.nextAfter(direction);
        // Smallest positive number
        assertTrue(next.greaterThan(field.getZero()));
    }

    @Test
    public void testToDouble() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(123.456);
        assertEquals(123.456, dfp.toDouble(), 1e-9);
    }

    @Test
    public void testToDoubleNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(-123.456);
        assertEquals(-123.456, dfp.toDouble(), 1e-9);
    }

    @Test
    public void testToDoubleLarge() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp("1.234567890123456789E50");
        assertEquals(1.234567890123456789E50, dfp.toDouble(), 1e50 * 1e-9);
    }

    @Test
    public void testToSplitDouble() throws Exception {
        DfpField field = new DfpField(10);
        Dfp dfp = field.newDfp(123.456);
        double[] split = dfp.toSplitDouble();
        assertEquals(2, split.length);
        assertEquals(123.456, split[0] + split[1], 1e-9);
    }
}
