The `power10K` and `power10` methods are instance methods of the `Dfp` class, not static methods or methods of `DfpField`. The tests need to be adjusted to call these methods on a `Dfp` instance.

```java
package org.apache.commons.math3.dfp;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math3.FieldElement;

public class DfpTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testAddZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp zero = field.getZero();
        Dfp one = field.getOne();
        assertEquals(one, one.add(zero));
        assertEquals(one, zero.add(one));
    }

    @Test
    public void testAddPositive() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp two = field.getTwo();
        assertEquals(two, one.add(one));
    }

    @Test
    public void testAddNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp negOne = one.negate();
        assertEquals(negOne, one.add(negOne.negate().negate()));
    }

    @Test
    public void testAddSubtract() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp two = field.getTwo();
        assertEquals(one, two.add(one.negate()));
    }

    @Test
    public void testAddLargeNumbers() throws Exception {
        DfpField field = new DfpField(50);
        Dfp a = field.newDfp("123456789012345678901234567890");
        Dfp b = field.newDfp("987654321098765432109876543210");
        Dfp expected = field.newDfp("111111111011111111101111111110");
        assertEquals(expected, a.add(b));
    }

    @Test
    public void testAddWithOverflow() throws Exception {
        DfpField field = new DfpField(10);
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);
        Dfp largeNumber = field.newDfp("9.999999999E32767"); // Close to max exponent
        Dfp smallNumber = field.newDfp("1E32760");
        Dfp overflowResult = largeNumber.add(smallNumber);
        assertTrue(overflowResult.isInfinite());
    }


    @Test
    public void testSubtractPositive() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp two = field.getTwo();
        assertEquals(one, two.subtract(one));
    }

    @Test
    public void testSubtractNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp negOne = one.negate();
        assertEquals(field.getZero(), one.subtract(one));
        assertEquals(negOne.negate(), negOne.subtract(one));
    }

    @Test
    public void testSubtractZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp zero = field.getZero();
        assertEquals(one, one.subtract(zero));
        assertEquals(zero, zero.subtract(zero));
    }

    @Test
    public void testSubtractWithUnderflow() throws Exception {
        DfpField field = new DfpField(10);
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);
        Dfp smallestPositive = field.newDfp(1);
        smallestPositive.exp = Dfp.MIN_EXP;
        Dfp smallerPositive = field.newDfp(1);
        smallerPositive.exp = Dfp.MIN_EXP - 1;

        Dfp result = smallestPositive.subtract(smallerPositive);
        assertTrue(result.exp < Dfp.MIN_EXP);

        Dfp small = field.newDfp(1);
        small.exp = Dfp.MIN_EXP - field.getRadixDigits() + 1;
        Dfp underflowResult = small.subtract(field.getZero());
        assertTrue(underflowResult.abs().lessThan(field.newDfp(1e-130)));
    }

    @Test
    public void testMultiplyPositive() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp two = field.getTwo();
        assertEquals(two, one.multiply(two));
    }

    @Test
    public void testMultiplyNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp negOne = one.negate();
        assertEquals(negOne, one.multiply(negOne));
        assertEquals(one, negOne.multiply(negOne));
    }

    @Test
    public void testMultiplyByZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp zero = field.getZero();
        assertEquals(zero, one.multiply(zero));
    }

    @Test
    public void testMultiplyLargeNumbers() throws Exception {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(9999);
        Dfp b = field.newDfp(9999);
        Dfp expected = field.newDfp(99980001);
        assertEquals(expected, a.multiply(b));
    }

    @Test
    public void testMultiplyOverflow() throws Exception {
        DfpField field = new DfpField(10);
        Dfp large = field.newDfp(1);
        large.exp = Dfp.MAX_EXP;
        Dfp two = field.getTwo();
        Dfp overflowResult = large.multiply(two);
        assertTrue(overflowResult.isInfinite());
    }

    @Test
    public void testDividePositive() throws Exception {
        DfpField field = new DfpField(10);
        Dfp two = field.getTwo();
        Dfp one = field.getOne();
        assertEquals(two, two.divide(one));
    }

    @Test
    public void testDivideNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp negOne = one.negate();
        assertEquals(negOne, negOne.divide(one));
        assertEquals(one, negOne.divide(negOne));
    }

    @Test
    public void testDivideByZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp zero = field.getZero();
        Dfp result = one.divide(zero);
        assertTrue(result.isInfinite());
        assertEquals(-1, result.sign);
    }

    @Test
    public void testDivideZeroByZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp zero = field.getZero();
        Dfp result = zero.divide(zero);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideRounding() throws Exception {
        DfpField field = new DfpField(5);
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);
        Dfp num = field.newDfp(10);
        Dfp den = field.newDfp(3);
        Dfp expected = field.newDfp("3.3333");
        assertEquals(expected, num.divide(den));
    }

    @Test
    public void testDivideExact() throws Exception {
        DfpField field = new DfpField(10);
        Dfp ten = field.newDfp(10);
        Dfp two = field.newDfp(2);
        assertEquals(field.newDfp(5), ten.divide(two));
    }

    @Test
    public void testNegate() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp negOne = one.negate();
        assertEquals(negOne, one.negate());
        assertEquals(one, negOne.negate());
    }

    @Test
    public void testAbsPositive() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        assertEquals(one, one.abs());
    }

    @Test
    public void testAbsNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp negOne = one.negate();
        assertEquals(one, negOne.abs());
    }

    @Test
    public void testAbsZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp zero = field.getZero();
        assertEquals(zero, zero.abs());
    }

    @Test
    public void testIsZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp zero = field.getZero();
        Dfp one = field.getOne();
        assertTrue(zero.isZero());
        assertFalse(one.isZero());
    }

    @Test
    public void testIsInfinite() throws Exception {
        DfpField field = new DfpField(10);
        Dfp posInf = field.newDfp((byte) 1, Dfp.INFINITE);
        Dfp negInf = field.newDfp((byte) -1, Dfp.INFINITE);
        Dfp one = field.getOne();
        assertTrue(posInf.isInfinite());
        assertTrue(negInf.isInfinite());
        assertFalse(one.isInfinite());
    }

    @Test
    public void testIsNaN() throws Exception {
        DfpField field = new DfpField(10);
        Dfp qnan = field.newDfp(Dfp.QNAN);
        Dfp snan = field.newDfp(Dfp.SNAN);
        Dfp one = field.getOne();
        assertTrue(qnan.isNaN());
        assertTrue(snan.isNaN());
        assertFalse(one.isNaN());
    }

    @Test
    public void testEquals() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp two = field.getTwo();
        Dfp one_again = field.newDfp(1);
        Dfp negOne = one.negate();
        Dfp nan = field.newDfp(Dfp.QNAN);

        assertTrue(one.equals(one_again));
        assertFalse(one.equals(two));
        assertFalse(one.equals(negOne));
        assertFalse(one.equals(nan));
        assertFalse(nan.equals(nan));
    }

    @Test
    public void testToStringFinite() throws Exception {
        DfpField field = new DfpField(5);
        Dfp num = field.newDfp("123.45");
        assertEquals("123.45", num.toString());
    }

    @Test
    public void testToStringScientific() throws Exception {
        DfpField field = new DfpField(5);
        Dfp simpleSci = field.newDfp("123450000");
        assertEquals("1.2345E8", simpleSci.toString());

        Dfp smallNum = field.newDfp("0.000012345");
        assertEquals("1.2345E-5", smallNum.toString());
    }

    @Test
    public void testToStringInfinity() throws Exception {
        DfpField field = new DfpField(10);
        Dfp posInf = field.newDfp((byte) 1, Dfp.INFINITE);
        Dfp negInf = field.newDfp((byte) -1, Dfp.INFINITE);
        assertEquals("Infinity", posInf.toString());
        assertEquals("-Infinity", negInf.toString());
    }

    @Test
    public void testToStringNaN() throws Exception {
        DfpField field = new DfpField(10);
        Dfp qnan = field.newDfp(Dfp.QNAN);
        Dfp snan = field.newDfp(Dfp.SNAN);
        assertEquals("NaN", qnan.toString());
        assertEquals("NaN", snan.toString());
    }

    @Test
    public void testCopysign() throws Exception {
        DfpField field = new DfpField(10);
        Dfp val = field.newDfp(123.45);
        Dfp pos = field.newDfp(1.0);
        Dfp neg = field.newDfp(-1.0);

        assertEquals(val, Dfp.copysign(val, pos));
        assertEquals(val.negate(), Dfp.copysign(val, neg));
    }

    @Test
    public void testNextAfterExact() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        assertEquals(one, one.nextAfter(one));
    }

    @Test
    public void testNextAfterPositive() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp two = field.getTwo();
        assertEquals(two, one.nextAfter(two));
    }

    @Test
    public void testNextAfterNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp negOne = one.negate();
        Dfp negTwo = field.getTwo().negate();
        assertEquals(negTwo, negOne.nextAfter(negTwo));
    }

    @Test
    public void testNextAfterZeroToPositive() throws Exception {
        DfpField field = new DfpField(10);
        Dfp zero = field.getZero();
        Dfp one = field.getOne();
        Dfp smallestPositive = field.newDfp(1);
        smallestPositive.exp = Dfp.MIN_EXP - field.getRadixDigits() + 1;
        assertEquals(smallestPositive, zero.nextAfter(one));
    }

    @Test
    public void testNextAfterZeroToNegative() throws Exception {
        DfpField field = new DfpField(10);
        Dfp zero = field.getZero();
        Dfp negOne = field.getOne().negate();
        Dfp smallestNegative = field.newDfp(-1);
        smallestNegative.exp = Dfp.MIN_EXP - field.getRadixDigits() + 1;
        assertEquals(smallestNegative, zero.nextAfter(negOne));
    }

    @Test
    public void testNextAfterInfinity() throws Exception {
        DfpField field = new DfpField(10);
        Dfp posInf = field.newDfp((byte) 1, Dfp.INFINITE);
        Dfp negInf = field.newDfp((byte) -1, Dfp.INFINITE);
        Dfp largeNum = field.newDfp("1.23456789E32767");

        assertEquals(posInf, posInf.nextAfter(field.getOne()));
        assertEquals(negInf, negInf.nextAfter(field.getOne().negate()));
        assertEquals(posInf, largeNum.nextAfter(posInf));
    }

    @Test
    public void testToDoubleFinite() throws Exception {
        DfpField field = new DfpField(10);
        Dfp num = field.newDfp("123.45");
        assertEquals(123.45, num.toDouble(), 1e-9);
    }

    @Test
    public void testToDoubleZero() throws Exception {
        DfpField field = new DfpField(10);
        Dfp zero = field.getZero();
        assertEquals(0.0, zero.toDouble(), 1e-9);
        Dfp negZero = field.newDfp(0);
        negZero.sign = -1;
        assertEquals(-0.0, negZero.toDouble(), 1e-9);
    }

    @Test
    public void testToDoubleInfinity() throws Exception {
        DfpField field = new DfpField(10);
        Dfp posInf = field.newDfp((byte) 1, Dfp.INFINITE);
        Dfp negInf = field.newDfp((byte) -1, Dfp.INFINITE);
        assertEquals(Double.POSITIVE_INFINITY, posInf.toDouble(), 0);
        assertEquals(Double.NEGATIVE_INFINITY, negInf.toDouble(), 0);
    }

    @Test
    public void testToDoubleNaN() throws Exception {
        DfpField field = new DfpField(10);
        Dfp qnan = field.newDfp(Dfp.QNAN);
        assertTrue(Double.isNaN(qnan.toDouble()));
    }

    @Test
    public void testToSplitDoubleFinite() throws Exception {
        DfpField field = new DfpField(20);
        Dfp num = field.newDfp("123.4567890123456789");
        double[] split = num.toSplitDouble();
        assertEquals(2, split.length);
        assertEquals(num.toDouble(), split[0] + split[1], 1e-15);
    }

    @Test
    public void testRemainder() throws Exception {
        DfpField field = new DfpField(10);
        Dfp ten = field.newDfp(10);
        Dfp three = field.newDfp(3);
        Dfp remainder = ten.remainder(three);
        assertEquals(field.newDfp(1), remainder);

        Dfp negTen = field.newDfp(-10);
        Dfp negThree = field.newDfp(-3);
        assertEquals(field.newDfp(-1), negTen.remainder(negThree));
    }

    @Test
    public void testIntValue() throws Exception {
        DfpField field = new DfpField(10);
        Dfp two = field.newDfp(2);
        assertEquals(2, two.intValue());

        Dfp negTwo = field.newDfp(-2);
        assertEquals(-2, negTwo.intValue());

        Dfp large = field.newDfp("2147483648");
        assertEquals(2147483647, large.intValue());

        Dfp small = field.newDfp("-2147483649");
        assertEquals(-2147483648, small.intValue());

        Dfp fractional = field.newDfp("2.7");
        assertEquals(2, fractional.intValue());
    }

    @Test
    public void testLog10K() throws Exception {
        DfpField field = new DfpField(10);
        Dfp num = field.newDfp("10000");
        assertEquals(1, num.log10K());

        Dfp num2 = field.newDfp("100000000");
        assertEquals(2, num2.log10K());

        Dfp num3 = field.newDfp("5000");
        assertEquals(0, num3.log10K());

        Dfp num4 = field.newDfp("0.0001");
        assertEquals(-2, num4.log10K());
    }

    @Test
    public void testPower10K() throws Exception {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        assertEquals(field.newDfp("10000"), one.power10K(1));
        assertEquals(field.newDfp("100000000"), one.power10K(2));
        assertEquals(field.getOne(), one.power10K(0));
        assertEquals(field.newDfp("0.0001"), one.power10K(-1));
    }

    @Test
    public void testLog10() {
        DfpField field = new DfpField(10);
        Dfp num1 = field.newDfp("10000");
        assertEquals(0, num1.log10());

        Dfp num2 = field.newDfp("12340000");
        assertEquals(7, num2.log10());

        Dfp num3 = field.newDfp("10000");
        assertEquals(0, num3.log10());

        Dfp num4 = field.newDfp("10010000");
        assertEquals(7, num4.log10());

        Dfp num5 = field.newDfp("12345");
        assertEquals(7, num5.log10());
    }

    @Test
    public void testPower10() {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        assertEquals(field.newDfp("10"), one.power10(1));
        assertEquals(field.newDfp("100"), one.power10(2));
        assertEquals(field.newDfp("10000"), one.power10(4));
        assertEquals(field.newDfp("0.1"), one.power10(-1));
        assertEquals(field.newDfp("0.0001"), one.power10(-4));
    }

    @Test
    public void testSqrt() {
        DfpField field = new DfpField(10);
        Dfp four = field.newDfp(4);
        assertEquals(field.newDfp(2), four.sqrt());

        Dfp two = field.newDfp(2);
        assertEquals(field.newDfp("1.4142135623"), two.sqrt());

        Dfp zero = field.getZero();
        assertEquals(zero, zero.sqrt());

        Dfp negOne = field.newDfp(-1);
        assertTrue(negOne.sqrt().isNaN());
    }

    @Test
    public void testAddDifferentPrecision() throws Exception {
        DfpField field1 = new DfpField(10);
        DfpField field2 = new DfpField(20);
        Dfp a = field1.getOne();
        Dfp b = field2.getOne();

        Dfp result = a.add(b);
        assertTrue(result.isNaN());
        assertEquals(DfpField.FLAG_INVALID, field1.getIEEEFlags());
    }

    @Test
    public void testMultiplyDifferentPrecision() throws Exception {
        DfpField field1 = new DfpField(10);
        DfpField field2 = new DfpField(20);
        Dfp a = field1.getOne();
        Dfp b = field2.getOne();

        Dfp result = a.multiply(b);
        assertTrue(result.isNaN());
        assertEquals(DfpField.FLAG_INVALID, field1.getIEEEFlags());
    }

    @Test
    public void testDivideDifferentPrecision() throws Exception {
        DfpField field1 = new DfpField(10);
        DfpField field2 = new DfpField(20);
        Dfp a = field1.getOne();
        Dfp b = field2.getOne();

        Dfp result = a.divide(b);
        assertTrue(result.isNaN());
        assertEquals(DfpField.FLAG_INVALID, field1.getIEEEFlags());
    }

    @Test
    public void testLessThan() {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp two = field.getTwo();
        assertTrue(one.lessThan(two));
        assertFalse(two.lessThan(one));
        assertFalse(one.lessThan(one));
    }

    @Test
    public void testGreaterThan() {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp two = field.getTwo();
        assertTrue(two.greaterThan(one));
        assertFalse(one.greaterThan(two));
        assertFalse(one.greaterThan(one));
    }

    @Test
    public void testStrictlyNegative() {
        DfpField field = new DfpField(10);
        Dfp negOne = field.newDfp(-1);
        Dfp zero = field.getZero();
        Dfp one = field.getOne();
        assertTrue(negOne.strictlyNegative());
        assertFalse(zero.strictlyNegative());
        assertFalse(one.strictlyNegative());
    }

    @Test
    public void testStrictlyPositive() {
        DfpField field = new DfpField(10);
        Dfp negOne = field.newDfp(-1);
        Dfp zero = field.getZero();
        Dfp one = field.getOne();
        assertFalse(negOne.strictlyPositive());
        assertFalse(zero.strictlyPositive());
        assertTrue(one.strictlyPositive());
    }

    @Test
    public void testRemainderWithZeroDivisor() {
        DfpField field = new DfpField(10);
        Dfp ten = field.newDfp(10);
        Dfp zero = field.getZero();
        Dfp result = ten.remainder(zero);
        assertTrue(result.isNaN());
        assertEquals(DfpField.FLAG_DIV_ZERO, field.getIEEEFlags());
    }

    @Test
    public void testAddZeroToNaN() {
        DfpField field = new DfpField(10);
        Dfp nan = field.newDfp(Dfp.QNAN);
        Dfp zero = field.getZero();
        assertEquals(nan, nan.add(zero));
    }

    @Test
    public void testMultiplyNaNByZero() {
        DfpField field = new DfpField(10);
        Dfp nan = field.newDfp(Dfp.QNAN);
        Dfp zero = field.getZero();
        assertEquals(nan, nan.multiply(zero));
    }

    // New tests for uncovered methods

    @Test
    public void testGetField() {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        assertEquals(field, one.getField());
    }

    @Test
    public void testGetRadixDigits() {
        DfpField field = new DfpField(15);
        Dfp one = field.getOne();
        assertEquals(15, one.getRadixDigits());
    }

    @Test
    public void testNegativeOrNull() {
        DfpField field = new DfpField(10);
        Dfp negOne = field.newDfp(-1);
        Dfp zero = field.getZero();
        Dfp one = field.getOne();
        assertTrue(negOne.negativeOrNull());
        assertTrue(zero.negativeOrNull());
        assertFalse(one.negativeOrNull());
    }

    @Test
    public void testPositiveOrNull() {
        DfpField field = new DfpField(10);
        Dfp negOne = field.newDfp(-1);
        Dfp zero = field.getZero();
        Dfp one = field.getOne();
        assertFalse(negOne.positiveOrNull());
        assertTrue(zero.positiveOrNull());
        assertTrue(one.positiveOrNull());
    }

    @Test
    public void testHashCode() {
        DfpField field = new DfpField(10);
        Dfp one = field.newDfp(1);
        Dfp one_again = field.newDfp(1);
        Dfp two = field.newDfp(2);
        assertEquals(one.hashCode(), one_again.hashCode());
        assertNotEquals(one.hashCode(), two.hashCode());
    }

    @Test
    public void testUnequal() {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp two = field.getTwo();
        assertTrue(one.unequal(two));
        assertFalse(one.unequal(one));
    }

    @Test
    public void testRint() {
        DfpField field = new DfpField(10);
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_EVEN);
        Dfp val = field.newDfp("1.5");
        assertEquals(field.newDfp(2), val.rint());
        Dfp val2 = field.newDfp("2.5");
        assertEquals(field.newDfp(2), val2.rint()); // round half even
        Dfp val3 = field.newDfp("-1.5");
        assertEquals(field.newDfp(-2), val3.rint());
        Dfp val4 = field.newDfp("-2.5");
        assertEquals(field.newDfp(-2), val4.rint());
    }

    @Test
    public void testFloor() {
        DfpField field = new DfpField(10);
        Dfp val = field.newDfp("1.5");
        assertEquals(field.newDfp(1), val.floor());
        Dfp val2 = field.newDfp("-1.5");
        assertEquals(field.newDfp(-2), val2.floor());
    }

    @Test
    public void testCeil() {
        DfpField field = new DfpField(10);
        Dfp val = field.newDfp("1.5");
        assertEquals(field.newDfp(2), val.ceil());
        Dfp val2 = field.newDfp("-1.5");
        assertEquals(field.newDfp(-1), val2.ceil());
    }

    @Test
    public void testReciprocal() {
        DfpField field = new DfpField(10);
        Dfp two = field.newDfp(2);
        assertEquals(field.newDfp("0.5"), two.reciprocal());
    }

    @Test
    public void testClassify() {
        DfpField field = new DfpField(10);
        Dfp one = field.getOne();
        Dfp inf = field.newDfp((byte)1, Dfp.INFINITE);
        Dfp nan = field.newDfp(Dfp.QNAN);
        assertEquals(Dfp.FINITE, one.classify());
        assertEquals(Dfp.INFINITE, inf.classify());
        assertEquals(Dfp.QNAN, nan.classify());
    }

    @Test
    public void testAddLargeNegative() {
        DfpField field = new DfpField(20);
        Dfp a = field.newDfp("-1.2345678901234567890E32760");
        Dfp b = field.newDfp("-9.8765432109876543210E32760");
        Dfp expected = field.newDfp("-1.1111111101111111110E32761");
        assertEquals(expected, a.add(b));
    }

    @Test
    public void testSubtractLargePositive() {
        DfpField field = new DfpField(20);
        Dfp a = field.newDfp("1.2345678901234567890E32760");
        Dfp b = field.newDfp("9.8765432109876543210E32759"); // Smaller exponent
        Dfp expected = field.newDfp("2.4691357802469135780E32759");
        assertEquals(expected, a.subtract(b));
    }

    @Test
    public void testMultiplyLargeNumbersWithRounding() {
        DfpField field = new DfpField(10);
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);
        Dfp a = field.newDfp("1.23456789");
        Dfp b = field.newDfp("9.87654321");
        Dfp expected = field.newDfp("12.19326311"); // Rounded result
        assertEquals(expected, a.multiply(b));
    }

    @Test
    public void testDivideLargeNumbersWithRounding() {
        DfpField field = new DfpField(10);
        field.setRoundingMode(DfpField.RoundingMode.ROUND_HALF_UP);
        Dfp num = field.newDfp("10000000000");
        Dfp den = field.newDfp("3");
        Dfp expected = field.newDfp("3333333333");
        assertEquals(expected, num.divide(den));
    }

    @Test
    public void testSqrtLargeNumber() {
        DfpField field = new DfpField(20);
        Dfp large = field.newDfp("1.2345678901234567890E32767");
        Dfp expected = field.newDfp("1.1111111101111111110E16384"); // Approximate sqrt
        assertEquals(expected, large.sqrt());
    }

    @Test
    public void testNextAfterZero() {
        DfpField field = new DfpField(10);
        Dfp zero = field.getZero();
        Dfp smallestPositive = field.newDfp(1);
        smallestPositive.exp = Dfp.MIN_EXP - field.getRadixDigits() + 1;
        Dfp smallestNegative = field.newDfp(-1);
        smallestNegative.exp = Dfp.MIN_EXP - field.getRadixDigits() + 1;

        assertEquals(smallestPositive, zero.nextAfter(field.getOne()));
        assertEquals(smallestNegative, zero.nextAfter(field.newDfp(-1)));
    }

    @Test
    public void testToSplitDoubleZero() {
        DfpField field = new DfpField(20);
        Dfp zero = field.getZero();
        double[] split = zero.toSplitDouble();
        assertEquals(2, split.length);
        assertEquals(0.0, split[0] + split[1], 1e-15);
    }
}
```