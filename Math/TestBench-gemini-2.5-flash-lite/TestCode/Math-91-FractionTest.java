package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.util.MathUtils;

public class FractionTest {

    @Test
    public void testConstructorIntInt() throws Exception {
        Fraction f = new Fraction(1, 2);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntReduced() throws Exception {
        Fraction f = new Fraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntNegativeDenominator() throws Exception {
        Fraction f = new Fraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntZeroNumerator() {
        Fraction f = new Fraction(0, 5);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntZeroDenominator() {
        try {
            new Fraction(5, 0);
            fail("ArithmeticException expected");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorIntIntMinIntValue() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testConstructorIntIntMinIntDen() {
        // The denominator becomes positive after negation, then reduced
        // Integer.MIN_VALUE is -2147483648. If num=1, den=-2147483648,
        // it becomes num=-1, den=2147483648.
        // gcd(-1, 2147483648) = 1.
        // So it should be -1 / 2147483648.
        // However, the source code has a special case for MIN_VALUE denominator.
        // if (den < 0) { ... }
        // If den == Integer.MIN_VALUE, and num is not MIN_VALUE, then num = -num and den = -den.
        // If num = 1, den = Integer.MIN_VALUE, then num becomes -1, den becomes Integer.MAX_VALUE + 1 (overflows to Integer.MIN_VALUE again)
        // This is a bit tricky. Let's re-trace the constructor:
        // if (den == 0) -> no
        // if (den < 0) -> yes, den is Integer.MIN_VALUE
        //   if (num == Integer.MIN_VALUE || den == Integer.MIN_VALUE) -> yes, den is MIN_VALUE
        //     throw ArithmeticException (overflow in fraction {0}/{1}, cannot negate)
        try {
            new Fraction(1, Integer.MIN_VALUE);
            fail("ArithmeticException expected");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testConstructorIntIntMinIntBoth() {
        // If num = Integer.MIN_VALUE and den = Integer.MIN_VALUE
        // if (den == 0) -> no
        // if (den < 0) -> yes
        //   if (num == Integer.MIN_VALUE || den == Integer.MIN_VALUE) -> yes
        //     throw ArithmeticException (overflow in fraction {0}/{1}, cannot negate)
        try {
            new Fraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
            fail("ArithmeticException expected");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testConstructorIntIntOverflow() {
        try {
            // num = Integer.MIN_VALUE, den = -1
            // if (den < 0) -> yes
            //   if (num == Integer.MIN_VALUE || den == Integer.MIN_VALUE) -> yes (num is MIN_VALUE)
            //     throw ArithmeticException (overflow in fraction {0}/{1}, cannot negate)
            new Fraction(Integer.MIN_VALUE, -1);
            fail("ArithmeticException expected");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testAbsPositive() {
        Fraction f = new Fraction(1, 2);
        assertEquals(new Fraction(1, 2), f.abs());
    }

    @Test
    public void testAbsNegative() {
        Fraction f = new Fraction(-1, 2);
        assertEquals(new Fraction(1, 2), f.abs());
    }

    @Test
    public void testAbsZero() {
        Fraction f = Fraction.ZERO;
        assertEquals(Fraction.ZERO, f.abs());
    }

    @Test
    public void testCompareToEqual() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        assertEquals(0, f1.compareTo(f2));
    }

    @Test
    public void testCompareToLess() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        assertEquals(-1, f1.compareTo(f2));
    }

    @Test
    public void testCompareToGreater() {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(1, 2);
        assertEquals(1, f1.compareTo(f2));
    }
    
    @Test
    public void testCompareToNegative() {
        Fraction f1 = new Fraction(-1, 2);
        Fraction f2 = new Fraction(-3, 4);
        assertEquals(1, f1.compareTo(f2));
    }

    @Test
    public void testDoubleValue() {
        Fraction f = new Fraction(1, 2);
        assertEquals(0.5, f.doubleValue(), 1e-9);
    }

    @Test
    public void testDoubleValueNegative() {
        Fraction f = new Fraction(-1, 2);
        assertEquals(-0.5, f.doubleValue(), 1e-9);
    }

    @Test
    public void testEqualsSameInstance() {
        Fraction f = new Fraction(1, 2);
        assertTrue(f.equals(f));
    }

    @Test
    public void testEqualsEqualFractions() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEqualsDifferentFractions() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEqualsNull() {
        Fraction f = new Fraction(1, 2);
        assertFalse(f.equals(null));
    }

    @Test
    public void testEqualsWrongType() {
        Fraction f = new Fraction(1, 2);
        assertFalse(f.equals("1/2"));
    }

    @Test
    public void testFloatValue() {
        Fraction f = new Fraction(1, 2);
        assertEquals(0.5f, f.floatValue(), 1e-9f);
    }

    @Test
    public void testFloatValueNegative() {
        Fraction f = new Fraction(-1, 2);
        assertEquals(-0.5f, f.floatValue(), 1e-9f);
    }

    @Test
    public void testIntValue() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3, f.intValue());
    }

    @Test
    public void testIntValueNegative() {
        Fraction f = new Fraction(-7, 2);
        assertEquals(-3, f.intValue());
    }

    @Test
    public void testLongValue() {
        Fraction f = new Fraction(7, 2);
        assertEquals(3L, f.longValue());
    }

    @Test
    public void testLongValueNegative() {
        Fraction f = new Fraction(-7, 2);
        assertEquals(-3L, f.longValue());
    }

    @Test
    public void testNegate() {
        Fraction f = new Fraction(1, 2);
        assertEquals(new Fraction(-1, 2), f.negate());
    }
    
    @Test
    public void testNegateNegative() {
        Fraction f = new Fraction(-1, 2);
        assertEquals(new Fraction(1, 2), f.negate());
    }

    @Test
    public void testNegateZero() {
        Fraction f = Fraction.ZERO;
        assertEquals(Fraction.ZERO, f.negate());
    }

    @Test
    public void testNegateMinIntValue() {
        Fraction f = new Fraction(Integer.MIN_VALUE, 1);
        try {
            f.negate();
            fail("ArithmeticException expected");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testReciprocal() {
        Fraction f = new Fraction(1, 2);
        assertEquals(new Fraction(2, 1), f.reciprocal());
    }
    
    @Test
    public void testReciprocalNegative() {
        Fraction f = new Fraction(-1, 2);
        assertEquals(new Fraction(-2, 1), f.reciprocal());
    }

    @Test
    public void testReciprocalZero() {
        Fraction f = Fraction.ZERO;
        try {
            f.reciprocal();
            fail("ArithmeticException expected");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testAdd() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(new Fraction(5, 6), f1.add(f2));
    }

    @Test
    public void testAddZero() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals(f1, f1.add(Fraction.ZERO));
    }

    @Test
    public void testAddNull() {
        Fraction f1 = new Fraction(1, 2);
        try {
            f1.add(null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSubtract() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(new Fraction(1, 6), f1.subtract(f2));
    }

    @Test
    public void testSubtractZero() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals(f1, f1.subtract(Fraction.ZERO));
    }

    @Test
    public void testSubtractNull() {
        Fraction f1 = new Fraction(1, 2);
        try {
            f1.subtract(null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testMultiply() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        assertEquals(new Fraction(1, 3), f1.multiply(f2));
    }

    @Test
    public void testMultiplyByZero() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals(Fraction.ZERO, f1.multiply(Fraction.ZERO));
    }

    @Test
    public void testMultiplyNull() {
        Fraction f1 = new Fraction(1, 2);
        try {
            f1.multiply(null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testDivide() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(new Fraction(3, 2), f1.divide(f2));
    }

    @Test
    public void testDivideByZero() {
        Fraction f1 = new Fraction(1, 2);
        Fraction zero = Fraction.ZERO;
        try {
            f1.divide(zero);
            fail("ArithmeticException expected");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testDivideNull() {
        Fraction f1 = new Fraction(1, 2);
        try {
            f1.divide(null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testGetReducedFraction() {
        assertEquals(new Fraction(1, 2), Fraction.getReducedFraction(1, 2));
    }

    @Test
    public void testGetReducedFractionWithCommonFactor() {
        assertEquals(new Fraction(1, 2), Fraction.getReducedFraction(2, 4));
    }

    @Test
    public void testGetReducedFractionNegativeDenominator() {
        assertEquals(new Fraction(-1, 2), Fraction.getReducedFraction(1, -2));
    }

    @Test
    public void testGetReducedFractionZeroNumerator() {
        assertEquals(Fraction.ZERO, Fraction.getReducedFraction(0, 5));
    }

    @Test
    public void testGetReducedFractionZeroDenominator() {
        try {
            Fraction.getReducedFraction(5, 0);
            fail("ArithmeticException expected");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetReducedFractionMinIntDenominator() {
        // getReducedFraction(2, Integer.MIN_VALUE)
        // den is MIN_VALUE, num is 2 (even)
        // num /= 2 -> 1
        // den /= 2 -> Integer.MIN_VALUE / 2 = -1073741824
        // gcd(1, -1073741824) = 1
        // result: 1 / -1073741824
        // The sign should move to the numerator: -1 / 1073741824
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(-1, f.getNumerator());
        assertEquals(1073741824, f.getDenominator());
    }
    
    @Test
    public void testGetReducedFractionMinIntDenominatorOdd() {
        // getReducedFraction(1, Integer.MIN_VALUE)
        // den is MIN_VALUE, num is 1 (odd)
        // Special case: if (denominator==Integer.MIN_VALUE && (numerator&1)==0) { ... } does not apply.
        // if (den < 0) -> yes
        //   if (num==Integer.MIN_VALUE || den==Integer.MIN_VALUE) -> yes (den is MIN_VALUE)
        //     throw ArithmeticException (overflow in fraction {0}/{1}, cannot negate)
        try {
            Fraction.getReducedFraction(1, Integer.MIN_VALUE);
            fail("ArithmeticException expected");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testGetReducedFractionMinIntNumerator() {
        // getReducedFraction(Integer.MIN_VALUE, 2)
        // den is 2, num is MIN_VALUE
        // if (den < 0) -> no
        // gcd(Integer.MIN_VALUE, 2) = 2
        // num /= 2 -> Integer.MIN_VALUE / 2 = -1073741824
        // den /= 2 -> 1
        // result: -1073741824 / 1
        Fraction f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        assertEquals(-1073741824, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }
}
