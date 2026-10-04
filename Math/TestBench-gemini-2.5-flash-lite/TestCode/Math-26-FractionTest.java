package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.math.BigInteger;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.FastMath;

public class FractionTest {

    @Test
    public void testConstructorInt() {
        Fraction f = new Fraction(3);
        assertEquals(3, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorIntInt() {
        Fraction f = new Fraction(3, 5);
        assertEquals(3, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntReduced() {
        Fraction f = new Fraction(6, 10);
        assertEquals(3, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntNegativeDenominator() {
        Fraction f = new Fraction(3, -5);
        assertEquals(-3, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntNegativeNumeratorAndDenominator() {
        Fraction f = new Fraction(-3, -5);
        assertEquals(3, f.getNumerator());
        assertEquals(5, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntZeroNumerator() {
        Fraction f = new Fraction(0, 5);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntIntZeroDenominator() {
        new Fraction(3, 0);
    }

    @Test
    public void testAbsPositive() {
        Fraction f = new Fraction(3, 5);
        assertEquals(f, f.abs());
    }

    @Test
    public void testAbsNegative() {
        Fraction f = new Fraction(-3, 5);
        assertEquals(new Fraction(3, 5), f.abs());
    }

    @Test
    public void testAbsZero() {
        Fraction f = new Fraction(0, 1);
        assertEquals(f, f.abs());
    }

    @Test
    public void testCompareToEqual() {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(6, 10);
        assertEquals(0, f1.compareTo(f2));
    }

    @Test
    public void testCompareToLess() {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(7, 10);
        assertEquals(-1, f1.compareTo(f2));
    }

    @Test
    public void testCompareToGreater() {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(1, 2);
        assertEquals(1, f1.compareTo(f2));
    }

    @Test
    public void testDoubleValue() {
        Fraction f = new Fraction(3, 5);
        assertEquals(0.6, f.doubleValue(), 1e-9);
    }

    @Test
    public void testEqualsEqual() {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(6, 10);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEqualsNotEqual() {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(3, 4);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEqualsNull() {
        Fraction f1 = new Fraction(3, 5);
        assertFalse(f1.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Fraction f1 = new Fraction(3, 5);
        assertFalse(f1.equals("3/5"));
    }

    @Test
    public void testFloatValue() {
        Fraction f = new Fraction(3, 5);
        assertEquals(0.6f, f.floatValue(), 1e-9f);
    }

    @Test
    public void testGetDenominator() {
        Fraction f = new Fraction(3, 5);
        assertEquals(5, f.getDenominator());
    }

    @Test
    public void testGetNumerator() {
        Fraction f = new Fraction(3, 5);
        assertEquals(3, f.getNumerator());
    }

    @Test
    public void testHashCode() {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(6, 10);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testIntValue() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3, f.intValue());
    }

    @Test
    public void testLongValue() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3L, f.longValue());
    }

    @Test
    public void testNegate() {
        Fraction f = new Fraction(3, 5);
        assertEquals(new Fraction(-3, 5), f.negate());
    }

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(3, 5);
        assertEquals(new Fraction(5, 3), f.reciprocal());
    }

    @Test
    public void testReciprocalZero() {
        Fraction f = new Fraction(0, 1);
        assertEquals(new Fraction(1, 0), f.reciprocal()); // This will throw MathArithmeticException
    }

    @Test
    public void testAdd() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(new Fraction(5, 6), f1.add(f2));
    }

    @Test
    public void testAddInteger() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals(new Fraction(3, 2), f1.add(1));
    }

    @Test
    public void testSubtract() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(new Fraction(1, 6), f1.subtract(f2));
    }

    @Test
    public void testSubtractInteger() {
        Fraction f1 = new Fraction(3, 2);
        assertEquals(new Fraction(1, 2), f1.subtract(1));
    }

    @Test
    public void testMultiply() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        assertEquals(new Fraction(1, 3), f1.multiply(f2));
    }

    @Test
    public void testMultiplyInteger() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals(new Fraction(3, 2), f1.multiply(3));
    }

    @Test
    public void testDivide() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(new Fraction(3, 2), f1.divide(f2));
    }

    @Test
    public void testDivideInteger() {
        Fraction f1 = new Fraction(3, 2);
        assertEquals(new Fraction(1, 2), f1.divide(3));
    }

    @Test
    public void testPercentageValue() {
        Fraction f = new Fraction(1, 2);
        assertEquals(50.0, f.percentageValue(), 1e-9);
    }

    @Test
    public void testGetReducedFractionPositive() {
        assertEquals(new Fraction(3, 5), Fraction.getReducedFraction(6, 10));
    }

    @Test
    public void testGetReducedFractionNegativeDenominator() {
        assertEquals(new Fraction(-3, 5), Fraction.getReducedFraction(3, -5));
    }

    @Test
    public void testGetReducedFractionZeroNumerator() {
        assertEquals(Fraction.ZERO, Fraction.getReducedFraction(0, 5));
    }

    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFractionZeroDenominator() {
        Fraction.getReducedFraction(5, 0);
    }

    @Test
    public void testToStringNumeratorOne() {
        Fraction f = new Fraction(5, 1);
        assertEquals("5", f.toString());
    }

    @Test
    public void testToStringZeroNumerator() {
        Fraction f = new Fraction(0, 5);
        assertEquals("0", f.toString());
    }

    @Test
    public void testToStringNormal() {
        Fraction f = new Fraction(3, 5);
        assertEquals("3 / 5", f.toString());
    }

    @Test
    public void testGetField() {
        Fraction f = new Fraction(3, 5);
        assertNotNull(f.getField());
        assertTrue(f.getField() instanceof FractionField);
    }

    @Test
    public void testAddWithZero() {
        Fraction f1 = new Fraction(3, 5);
        assertEquals(f1, f1.add(Fraction.ZERO));
    }

    @Test
    public void testSubtractWithZero() {
        Fraction f1 = new Fraction(3, 5);
        assertEquals(f1, f1.subtract(Fraction.ZERO));
    }

    @Test
    public void testMultiplyWithZero() {
        Fraction f1 = new Fraction(3, 5);
        assertEquals(Fraction.ZERO, f1.multiply(Fraction.ZERO));
    }

    @Test
    public void testMultiplyWithOne() {
        Fraction f1 = new Fraction(3, 5);
        assertEquals(f1, f1.multiply(Fraction.ONE));
    }

    @Test
    public void testDivideByOne() {
        Fraction f1 = new Fraction(3, 5);
        assertEquals(f1, f1.divide(Fraction.ONE));
    }

    @Test
    public void testConstructorWithDoubleEpsilonMaxIterations() throws FractionConversionException {
        Fraction f = new Fraction(0.75, 1.0e-5, 100);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testConstructorWithDoubleEpsilonMaxDenominator() throws FractionConversionException {
        Fraction f = new Fraction(0.75, 100);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }
    
    @Test
    public void testConstructorWithDoubleEpsilonMaxDenominatorExact() throws FractionConversionException {
        Fraction f = new Fraction(0.5, 100);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorWithDoubleEpsilonMaxIterationsNearInteger() throws FractionConversionException {
        Fraction f = new Fraction(2.00001, 1.0e-5, 100);
        assertEquals(2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testNegateIntegerMinValue() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        f.negate();
    }

    @Test
    public void testAddOverflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(1, 1);
        try {
            f1.add(f2);
            fail("Expected MathArithmeticException for overflow");
        } catch (MathArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testSubtractOverflow() {
        Fraction f1 = new Fraction(Integer.MIN_VALUE, 1);
        Fraction f2 = new Fraction(1, 1);
        try {
            f1.subtract(f2);
            fail("Expected MathArithmeticException for overflow");
        } catch (MathArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testMultiplyOverflow() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(2, 1);
        try {
            f1.multiply(f2);
            fail("Expected MathArithmeticException for overflow");
        } catch (MathArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testDivideByZeroFraction() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(0, 1);
        try {
            f1.divide(f2);
            fail("Expected MathArithmeticException for division by zero");
        } catch (MathArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testAddNullArgument() {
        Fraction f1 = new Fraction(1, 2);
        try {
            f1.add(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSubtractNullArgument() {
        Fraction f1 = new Fraction(1, 2);
        try {
            f1.subtract(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testMultiplyNullArgument() {
        Fraction f1 = new Fraction(1, 2);
        try {
            f1.multiply(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testDivideNullArgument() {
        Fraction f1 = new Fraction(1, 2);
        try {
            f1.divide(null);
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            // Expected
        }
    }
}
