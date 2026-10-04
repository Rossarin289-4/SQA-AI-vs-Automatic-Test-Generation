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
        Fraction f = new Fraction(5);
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorIntInt() {
        Fraction f = new Fraction(4, 6);
        assertEquals(2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntReduced() {
        Fraction f = new Fraction(8, 12);
        assertEquals(2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntNegativeDenominator() {
        Fraction f = new Fraction(4, -6);
        assertEquals(-2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntNegativeNumerator() {
        Fraction f = new Fraction(-4, 6);
        assertEquals(-2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntBothNegative() {
        Fraction f = new Fraction(-4, -6);
        assertEquals(2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntZeroNumerator() {
        Fraction f = new Fraction(0, 5);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test(expected = MathArithmeticException.class)
    public void testConstructorIntIntZeroDenominator() {
        new Fraction(5, 0);
    }
    
    @Test
    public void testConstructorDouble() throws FractionConversionException {
        Fraction f = new Fraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorDoubleComplex() throws FractionConversionException {
        Fraction f = new Fraction(0.75);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }
    
    @Test
    public void testConstructorDoubleWithEpsilon() throws FractionConversionException {
        Fraction f = new Fraction(0.7500001, 1.0e-5, 100);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testConstructorDoubleWithMaxDenominator() throws FractionConversionException {
        Fraction f = new Fraction(0.75, 10);
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testAbsPositive() {
        Fraction f = new Fraction(3, 4);
        assertEquals(new Fraction(3, 4), f.abs());
    }

    @Test
    public void testAbsNegative() {
        Fraction f = new Fraction(-3, 4);
        assertEquals(new Fraction(3, 4), f.abs());
    }

    @Test
    public void testAbsZero() {
        Fraction f = new Fraction(0, 1);
        assertEquals(new Fraction(0, 1), f.abs());
    }

    @Test
    public void testCompareToEqual() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        assertEquals(0, f1.compareTo(f2));
    }

    @Test
    public void testCompareToLess() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(1, 2);
        assertEquals(-1, f1.compareTo(f2));
    }

    @Test
    public void testCompareToGreater() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(1, f1.compareTo(f2));
    }

    @Test
    public void testDoubleValue() {
        Fraction f = new Fraction(3, 4);
        assertEquals(0.75, f.doubleValue(), 1e-9);
    }

    @Test
    public void testFloatValue() {
        Fraction f = new Fraction(3, 4);
        assertEquals(0.75f, f.floatValue(), 1e-9f);
    }

    @Test
    public void testEquals() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        assertEquals(f1, f2);
    }

    @Test
    public void testNotEquals() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertNotEquals(f1, f2);
    }
    
    @Test
    public void testEqualsNull() {
        Fraction f1 = new Fraction(1, 2);
        assertNotEquals(f1, null);
    }
    
    @Test
    public void testEqualsDifferentType() {
        Fraction f1 = new Fraction(1, 2);
        assertNotEquals(f1, Integer.valueOf(1));
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
        Fraction f = new Fraction(3, 4);
        assertEquals(new Fraction(-3, 4), f.negate());
    }
    
    @Test
    public void testNegateZero() {
        Fraction f = new Fraction(0, 1);
        assertEquals(new Fraction(0, 1), f.negate());
    }

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(3, 4);
        assertEquals(new Fraction(4, 3), f.reciprocal());
    }

    @Test
    public void testReciprocalNegative() {
        Fraction f = new Fraction(-3, 4);
        assertEquals(new Fraction(4, -3), f.reciprocal());
    }

    @Test(expected = MathArithmeticException.class)
    public void testReciprocalZero() {
        Fraction f = new Fraction(0, 1);
        f.reciprocal();
    }

    @Test
    public void testAdd() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(new Fraction(5, 6), f1.add(f2));
    }

    @Test
    public void testAddWithZero() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals(new Fraction(1, 2), f1.add(Fraction.ZERO));
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
    public void testSubtractWithZero() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals(new Fraction(1, 2), f1.subtract(Fraction.ZERO));
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
    public void testMultiplyWithZero() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals(Fraction.ZERO, f1.multiply(Fraction.ZERO));
    }

    @Test
    public void testMultiplyInteger() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals(new Fraction(1, 1), f1.multiply(2)); // Reduced to 1/1
    }

    @Test
    public void testDivide() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(new Fraction(3, 2), f1.divide(f2));
    }

    @Test
    public void testDivideByInteger() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals(new Fraction(1, 6), f1.divide(3));
    }

    @Test(expected = MathArithmeticException.class)
    public void testDivideByZeroFraction() {
        Fraction f1 = new Fraction(1, 2);
        f1.divide(Fraction.ZERO);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testDivideByZeroInt() {
        Fraction f1 = new Fraction(1, 2);
        f1.divide(0);
    }

    @Test
    public void testPercentageValue() {
        Fraction f = new Fraction(1, 2);
        assertEquals(50.0, f.percentageValue(), 1e-9);
    }

    @Test
    public void testGetReducedFraction() {
        assertEquals(new Fraction(2, 3), Fraction.getReducedFraction(4, 6));
    }

    @Test
    public void testGetReducedFractionZeroNum() {
        assertEquals(Fraction.ZERO, Fraction.getReducedFraction(0, 5));
    }

    @Test
    public void testGetReducedFractionZeroDen() {
        try {
            Fraction.getReducedFraction(5, 0);
            fail("Expected MathArithmeticException");
        } catch (MathArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testGetReducedFractionNegativeDen() {
        assertEquals(new Fraction(-2, 3), Fraction.getReducedFraction(4, -6));
    }

    @Test
    public void testToStringDenominatorOne() {
        assertEquals("5", new Fraction(5, 1).toString());
    }

    @Test
    public void testToStringZeroNumerator() {
        assertEquals("0", new Fraction(0, 5).toString());
    }

    @Test
    public void testToStringNormal() {
        assertEquals("3 / 4", new Fraction(3, 4).toString());
    }

    @Test
    public void testToStringNegativeNumerator() {
        assertEquals("-3 / 4", new Fraction(-3, 4).toString());
    }

    @Test
    public void testToStringNegativeDenominator() {
        assertEquals("-3 / 4", new Fraction(3, -4).toString());
    }
    
    @Test
    public void testToStringBothNegative() {
        assertEquals("3 / 4", new Fraction(-3, -4).toString());
    }

    @Test
    public void testGetField() {
        Fraction f = new Fraction(1, 2);
        assertNotNull(f.getField());
        assertEquals(FractionField.getInstance(), f.getField());
    }
    
    @Test
    public void testCompareToPositiveInfinity() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(Integer.MIN_VALUE, 1);
        assertTrue(f1.compareTo(f2) > 0);
    }

    @Test
    public void testCompareToNegativeInfinity() {
        Fraction f1 = new Fraction(Integer.MIN_VALUE, 1);
        Fraction f2 = new Fraction(Integer.MAX_VALUE, 1);
        assertTrue(f1.compareTo(f2) < 0);
    }

    @Test
    public void testAddOverflowNumerator() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(1, 1);
        try {
            f1.add(f2);
            fail("Expected MathArithmeticException for numerator overflow");
        } catch (MathArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testAddOverflowDenominator() {
        Fraction f1 = new Fraction(1, Integer.MAX_VALUE);
        Fraction f2 = new Fraction(1, Integer.MAX_VALUE - 1);
        try {
            f1.add(f2);
            fail("Expected MathArithmeticException for denominator overflow");
        } catch (MathArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testSubtractOverflowNumerator() {
        Fraction f1 = new Fraction(Integer.MIN_VALUE, 1);
        Fraction f2 = new Fraction(1, 1);
        try {
            f1.subtract(f2);
            fail("Expected MathArithmeticException for numerator overflow");
        } catch (MathArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testMultiplyOverflowNumerator() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(2, 1);
        try {
            f1.multiply(f2);
            fail("Expected MathArithmeticException for numerator overflow");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testMultiplyOverflowDenominator() {
        Fraction f1 = new Fraction(1, Integer.MAX_VALUE);
        Fraction f2 = new Fraction(1, 2);
        try {
            f1.multiply(f2);
            fail("Expected MathArithmeticException for denominator overflow");
        } catch (MathArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testDivideOverflowNumerator() {
        Fraction f1 = new Fraction(Integer.MAX_VALUE, 1);
        Fraction f2 = new Fraction(1, 2);
        try {
            f1.divide(f2);
            fail("Expected MathArithmeticException for numerator overflow");
        } catch (MathArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testDivideOverflowDenominator() {
        Fraction f1 = new Fraction(1, Integer.MAX_VALUE);
        Fraction f2 = new Fraction(1, 2);
        // Expected result is new Fraction(2, Integer.MAX_VALUE)
        assertEquals(new Fraction(2, Integer.MAX_VALUE), f1.divide(f2));
    }
}
