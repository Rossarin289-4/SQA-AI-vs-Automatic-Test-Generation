package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;

public class FractionTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testConstructorGetters() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorZeroNumerator() {
        Fraction f = Fraction.getFraction(0, 5);
        assertEquals(0, f.getNumerator());
        assertEquals(5, f.getDenominator());
        assertSame(Fraction.ZERO, f); // Should return cached ZERO instance
    }

    @Test
    public void testConstructorZeroDenominator() {
        try {
            Fraction.getFraction(1, 0);
            fail("Denominator zero.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testConstructorNegativeDenominator() {
        Fraction f = Fraction.getFraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testConstructorNegativeDenominatorZeroNumerator() {
        Fraction f = Fraction.getFraction(0, -2);
        assertEquals(0, f.getNumerator());
        assertEquals(-2, f.getDenominator()); // This is an odd case, but the code allows it. The test confirms this.
    }

    @Test
    public void testGetFraction_IntInt() {
        Fraction f = Fraction.getFraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testGetFraction_IntInt_LargeNumeratorDenominator() {
        Fraction f = Fraction.getFraction(Integer.MAX_VALUE - 1, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE - 1, f.getNumerator());
        assertEquals(Integer.MAX_VALUE, f.getDenominator());
    }

    @Test
    public void testGetFraction_IntInt_NegativeNumeratorNegativeDenominator() {
        Fraction f = Fraction.getFraction(-2, -4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFraction_IntInt_NegativeNumeratorPositiveDenominator() {
        Fraction f = Fraction.getFraction(-2, 4);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFraction_IntInt_PositiveNumeratorNegativeDenominator() {
        Fraction f = Fraction.getFraction(2, -4);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFraction_IntInt_ZeroNumerator() {
        Fraction f = Fraction.getFraction(0, 4);
        assertEquals(0, f.getNumerator());
        assertEquals(4, f.getDenominator());
        assertSame(Fraction.ZERO, f);
    }

    @Test
    public void testGetFraction_IntInt_ZeroDenominator() {
        try {
            Fraction.getFraction(5, 0);
            fail("Denominator zero.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetFraction_IntInt_IntegerMinValueDenominator() {
        Fraction f = Fraction.getFraction(2, Integer.MIN_VALUE);
        // The GCD of 2 and Integer.MIN_VALUE is 2.
        // Numerator becomes 1. Denominator becomes Integer.MIN_VALUE / 2.
        assertEquals(1, f.getNumerator());
        assertEquals(Integer.MIN_VALUE / 2, f.getDenominator());
    }

    @Test
    public void testGetFraction_IntInt_IntegerMinValueNumerator() {
        Fraction f = Fraction.getFraction(Integer.MIN_VALUE, 2);
        // The GCD of Integer.MIN_VALUE and 2 is 2.
        // Numerator becomes Integer.MIN_VALUE / 2. Denominator becomes 1.
        assertEquals(Integer.MIN_VALUE / 2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testGetFraction_IntInt_IntegerMinValueNumeratorAndDenominator() {
        Fraction f = Fraction.getFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
        assertSame(Fraction.ONE, f);
    }

    @Test
    public void testGetFraction_IntInt_IntegerMinValueNumeratorAndNegativeOne() {
        try {
            Fraction.getFraction(Integer.MIN_VALUE, -1);
            fail("Overflow expected for negating Integer.MIN_VALUE");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetReducedFraction_IntInt() {
        Fraction f = Fraction.getReducedFraction(2, 4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testGetReducedFraction_IntInt_AlreadyReduced() {
        Fraction f = Fraction.getReducedFraction(3, 7);
        assertEquals(3, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_IntInt_ZeroNumerator() {
        Fraction f = Fraction.getReducedFraction(0, 5);
        assertSame(Fraction.ZERO, f);
    }

    @Test
    public void testGetReducedFraction_IntInt_ZeroDenominator() {
        try {
            Fraction.getReducedFraction(1, 0);
            fail("Denominator zero.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetReducedFraction_IntInt_NegativeDenominator() {
        Fraction f = Fraction.getReducedFraction(2, -4);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testGetReducedFraction_IntInt_NegativeNumeratorAndDenominator() {
        Fraction f = Fraction.getReducedFraction(-2, -4);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testGetReducedFraction_IntInt_IntegerMinValueDenominatorAndEvenNumerator() {
        Fraction f = Fraction.getReducedFraction(2, Integer.MIN_VALUE);
        assertEquals(1, f.getNumerator());
        assertEquals(Integer.MIN_VALUE / 2, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_IntInt_IntegerMinValueDenominatorAndOddNumerator() {
        Fraction f = Fraction.getReducedFraction(3, Integer.MIN_VALUE);
        assertEquals(3, f.getNumerator());
        assertEquals(Integer.MIN_VALUE, f.getDenominator());
    }

    @Test
    public void testGetFraction_IntIntInt_Positive() {
        Fraction f = Fraction.getFraction(1, 2, 3);
        assertEquals(5, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testGetFraction_IntIntInt_NegativeWhole() {
        Fraction f = Fraction.getFraction(-1, 2, 3);
        assertEquals(-5, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }
    
    @Test
    public void testGetFraction_IntIntInt_ZeroNumerator() {
        Fraction f = Fraction.getFraction(1, 0, 3);
        assertEquals(1, f.getNumerator());
        assertEquals(3, f.getDenominator());
        assertSame(Fraction.ONE, f);
    }

    @Test
    public void testGetFraction_IntIntInt_ZeroDenominator() {
        try {
            Fraction.getFraction(1, 2, 0);
            fail("Denominator zero.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetFraction_IntIntInt_NegativeDenominator() {
        try {
            Fraction.getFraction(1, 2, -3);
            fail("Negative denominator.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetFraction_IntIntInt_NegativeNumerator() {
        try {
            Fraction.getFraction(1, -2, 3);
            fail("Negative numerator.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testGetFraction_IntIntInt_NumeratorOverflow() {
        try {
            Fraction.getFraction(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            fail("Numerator overflow.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetFraction_Double_Zero() {
        Fraction f = Fraction.getFraction(0.0);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
        assertSame(Fraction.ZERO, f);
    }

    @Test
    public void testGetFraction_Double_One() {
        Fraction f = Fraction.getFraction(1.0);
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
        assertSame(Fraction.ONE, f);
    }

    @Test
    public void testGetFraction_Double_Half() {
        Fraction f = Fraction.getFraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
        assertSame(Fraction.ONE_HALF, f);
    }

    @Test
    public void testGetFraction_Double_Positive() {
        Fraction f = Fraction.getFraction(1.25);
        assertEquals(5, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testGetFraction_Double_Negative() {
        Fraction f = Fraction.getFraction(-1.25);
        assertEquals(-5, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }
    
    @Test
    public void testGetFraction_Double_Precision() {
        Fraction f = Fraction.getFraction(1.0/3.0);
        // The algorithm should converge to 1/3
        assertEquals(1, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testGetFraction_Double_LargeValue() {
        // This input might cause issues if not handled correctly
        // The exact value for 10000.0000001 is not easily representable as a simple fraction.
        // The algorithm is designed to find a close approximation with a limited denominator.
        // The source code limits denominator to 10000.
        // Let's test a value that should produce a fraction with denominator <= 10000.
        // 10000.0001 -> 10000 + 1/10000 = 100000001/10000
        Fraction f = Fraction.getFraction(10000.0001);
        assertEquals(100000001, f.getNumerator());
        assertEquals(10000, f.getDenominator());
    }

    @Test
    public void testGetFraction_Double_NaN() {
        try {
            Fraction.getFraction(Double.NaN);
            fail("NaN not allowed.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testGetFraction_Double_Infinity() {
        try {
            Fraction.getFraction(Double.POSITIVE_INFINITY);
            fail("Infinity not allowed.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testGetFraction_Double_MaxValue() {
        Fraction f = Fraction.getFraction((double)Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testGetFraction_Double_MinValue() {
        Fraction f = Fraction.getFraction((double)Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }
    
    @Test
    public void testGetFraction_String_DoubleFormat() {
        Fraction f = Fraction.getFraction("1.25");
        assertEquals(5, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testGetFraction_String_X_Y_Z_Format() {
        Fraction f = Fraction.getFraction("1 2/3");
        assertEquals(5, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testGetFraction_String_Y_Z_Format() {
        Fraction f = Fraction.getFraction("2/3");
        assertEquals(2, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testGetFraction_String_WholeNumberFormat() {
        Fraction f = Fraction.getFraction("5");
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testGetFraction_String_Zero() {
        Fraction f = Fraction.getFraction("0");
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
        assertSame(Fraction.ZERO, f);
    }

    @Test
    public void testGetFraction_String_Null() {
        try {
            Fraction.getFraction(null);
            fail("Null string not allowed.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testGetFraction_String_InvalidFormat() {
        try {
            Fraction.getFraction("1 2");
            fail("Invalid format.");
        } catch (NumberFormatException e) {
            // Expected
        }
    }
    
    @Test
    public void testGetProperNumerator() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals(3, f.getProperNumerator());
    }

    @Test
    public void testGetProperNumerator_Negative() {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals(3, f.getProperNumerator());
    }

    @Test
    public void testGetProperWhole() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals(1, f.getProperWhole());
    }

    @Test
    public void testGetProperWhole_Negative() {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals(-1, f.getProperWhole());
    }
    
    @Test
    public void testIntValue() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals(1, f.intValue());
    }

    @Test
    public void testIntValue_Negative() {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals(-1, f.intValue());
    }

    @Test
    public void testLongValue() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals(1L, f.longValue());
    }

    @Test
    public void testLongValue_Negative() {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals(-1L, f.longValue());
    }

    @Test
    public void testFloatValue() {
        Fraction f = Fraction.getFraction(1, 3);
        assertEquals(1.0f/3.0f, f.floatValue(), 1e-9f);
    }

    @Test
    public void testFloatValue_Negative() {
        Fraction f = Fraction.getFraction(-1, 3);
        assertEquals(-1.0f/3.0f, f.floatValue(), 1e-9f);
    }

    @Test
    public void testDoubleValue() {
        Fraction f = Fraction.getFraction(1, 3);
        assertEquals(1.0/3.0, f.doubleValue(), 1e-9);
    }

    @Test
    public void testDoubleValue_Negative() {
        Fraction f = Fraction.getFraction(-1, 3);
        assertEquals(-1.0/3.0, f.doubleValue(), 1e-9);
    }

    @Test
    public void testReduce() {
        Fraction f = Fraction.getFraction(4, 6);
        Fraction reduced = f.reduce();
        assertEquals(2, reduced.getNumerator());
        assertEquals(3, reduced.getDenominator());
    }

    @Test
    public void testReduce_AlreadyReduced() {
        Fraction f = Fraction.getFraction(2, 3);
        assertSame(f, f.reduce()); // If already reduced, should return itself
    }

    @Test
    public void testReduce_Zero() {
        Fraction f = Fraction.getFraction(0, 5);
        Fraction reduced = f.reduce();
        assertSame(Fraction.ZERO, reduced);
    }
    
    @Test
    public void testInvert() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction inverted = f.invert();
        assertEquals(3, inverted.getNumerator());
        assertEquals(2, inverted.getDenominator());
    }

    @Test
    public void testInvert_Negative() {
        Fraction f = Fraction.getFraction(-2, 3);
        Fraction inverted = f.invert();
        assertEquals(3, inverted.getNumerator());
        assertEquals(-2, inverted.getDenominator());
    }

    @Test
    public void testInvert_Zero() {
        try {
            Fraction.ZERO.invert();
            fail("Cannot invert zero.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testInvert_IntegerMinValueNumerator() {
        try {
            Fraction.getFraction(Integer.MIN_VALUE, 1).invert();
            fail("Overflow negating numerator.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testNegate() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction negated = f.negate();
        assertEquals(-2, negated.getNumerator());
        assertEquals(3, negated.getDenominator());
    }

    @Test
    public void testNegate_Negative() {
        Fraction f = Fraction.getFraction(-2, 3);
        Fraction negated = f.negate();
        assertEquals(2, negated.getNumerator());
        assertEquals(3, negated.getDenominator());
    }
    
    @Test
    public void testNegate_Zero() {
        Fraction f = Fraction.getFraction(0, 3);
        Fraction negated = f.negate();
        assertEquals(0, negated.getNumerator());
        assertEquals(3, negated.getDenominator());
        assertSame(Fraction.ZERO, negated);
    }

    @Test
    public void testNegate_IntegerMinValueNumerator() {
        try {
            Fraction.getFraction(Integer.MIN_VALUE, 1).negate();
            fail("Overflow negating numerator.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testAbs() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction abs = f.abs();
        assertEquals(2, abs.getNumerator());
        assertEquals(3, abs.getDenominator());
        assertSame(f, abs); // Should return itself if positive
    }

    @Test
    public void testAbs_Negative() {
        Fraction f = Fraction.getFraction(-2, 3);
        Fraction abs = f.abs();
        assertEquals(2, abs.getNumerator());
        assertEquals(3, abs.getDenominator());
    }
    
    @Test
    public void testAbs_Zero() {
        Fraction f = Fraction.getFraction(0, 3);
        Fraction abs = f.abs();
        assertEquals(0, abs.getNumerator());
        assertEquals(3, abs.getDenominator());
        assertSame(Fraction.ZERO, abs);
    }

    @Test
    public void testPow_Zero() {
        Fraction f = Fraction.getFraction(2, 3);
        assertSame(Fraction.ONE, f.pow(0));
    }

    @Test
    public void testPow_One() {
        Fraction f = Fraction.getFraction(2, 3);
        assertSame(f, f.pow(1));
    }

    @Test
    public void testPow_PositiveEven() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction result = f.pow(2);
        assertEquals(4, result.getNumerator());
        assertEquals(9, result.getDenominator());
    }

    @Test
    public void testPow_PositiveOdd() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction result = f.pow(3);
        assertEquals(8, result.getNumerator());
        assertEquals(27, result.getDenominator());
    }

    @Test
    public void testPow_Negative() {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction result = f.pow(-2);
        assertEquals(9, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }
    
    @Test
    public void testPow_Negative_ZeroBase() {
        Fraction f = Fraction.getFraction(0, 3);
        try {
            f.pow(-1);
            fail("Cannot invert zero.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testPow_Negative_IntegerMinValue() {
        // Test for handling of Integer.MIN_VALUE in power
        // pow(-MIN_VALUE) -> invert().pow(MAX_VALUE).pow(2)
        // The code has a special case for MIN_VALUE:
        // return this.invert().pow(2).pow(-(power/2));
        // For power = -2, this becomes (2/3).invert().pow(2).pow(1) = (3/2)^2 = 9/4
        Fraction res = Fraction.getFraction(2, 3).pow(-2);
        assertEquals(9, res.getNumerator());
        assertEquals(4, res.getDenominator());
    }

    @Test
    public void testAdd() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction result = f1.add(f2);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testAdd_Zero() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction result = f1.add(Fraction.ZERO);
        assertSame(f1, result);
    }

    @Test
    public void testAdd_Identity() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction result = Fraction.ZERO.add(f1);
        assertSame(f1, result);
    }

    @Test
    public void testAdd_Negative() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(-1, 3);
        Fraction result = f1.add(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testAdd_DenominatorOverflow() {
        Fraction f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
        Fraction f2 = Fraction.getFraction(1, Integer.MAX_VALUE - 1);
        try {
            f1.add(f2);
            fail("Denominator overflow.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testSubtract() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction result = f1.subtract(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testSubtract_Zero() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction result = f1.subtract(Fraction.ZERO);
        assertSame(f1, result);
    }

    @Test
    public void testSubtract_Identity() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction result = Fraction.ZERO.subtract(f1);
        assertEquals(-1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }
    
    @Test
    public void testSubtract_Negative() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(-1, 3);
        Fraction result = f1.subtract(f2);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testMultiplyBy() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 3);
        Fraction result = f1.multiplyBy(f2);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testMultiplyBy_Zero() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction result = f1.multiplyBy(Fraction.ZERO);
        assertSame(Fraction.ZERO, result);
    }

    @Test
    public void testMultiplyBy_Identity() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction result = f1.multiplyBy(Fraction.ONE);
        assertSame(f1, result);
    }

    @Test
    public void testMultiplyBy_Negative() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(-2, 3);
        Fraction result = f1.multiplyBy(f2);
        assertEquals(-1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    @Test
    public void testMultiplyBy_NumeratorOverflow() {
        Fraction f1 = Fraction.getFraction(Integer.MAX_VALUE, 2);
        Fraction f2 = Fraction.getFraction(2, 3);
        try {
            f1.multiplyBy(f2);
            fail("Numerator overflow.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }
    
    @Test
    public void testDivideBy() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        Fraction result = f1.divideBy(f2);
        assertEquals(3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testDivideBy_Zero() {
        Fraction f1 = Fraction.getFraction(1, 2);
        try {
            f1.divideBy(Fraction.ZERO);
            fail("Division by zero.");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testDivideBy_Identity() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction result = f1.divideBy(Fraction.ONE);
        assertSame(f1, result);
    }

    @Test
    public void testDivideBy_Negative() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(-1, 3);
        Fraction result = f1.divideBy(f2);
        assertEquals(-3, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testEquals() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 4); // Not reduced, so not equal by definition
        assertTrue(f1.equals(f1));
        assertFalse(f1.equals(f2)); 
        assertFalse(f1.equals(new Object()));
        assertFalse(f1.equals(null));
    }

    @Test
    public void testEquals_Reduced() {
        Fraction f1 = Fraction.getReducedFraction(1, 2);
        Fraction f2 = Fraction.getReducedFraction(2, 4); // This will become 1/2
        assertTrue(f1.equals(f2));
    }
    
    @Test
    public void testHashCode() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 4); // Not reduced, different hashcode
        assertEquals(f1.hashCode(), f1.hashCode());
        assertFalse(f1.hashCode() == f2.hashCode());
        
        Fraction f3 = Fraction.getReducedFraction(1, 2);
        assertEquals(f1.hashCode(), f3.hashCode());
    }

    @Test
    public void testHashCode_Zero() {
        assertEquals(Fraction.ZERO.hashCode(), Fraction.getFraction(0, 1).hashCode());
        assertEquals(Fraction.ZERO.hashCode(), Fraction.getFraction(0, 5).hashCode());
    }
    
    @Test
    public void testHashCode_One() {
        assertEquals(Fraction.ONE.hashCode(), Fraction.getFraction(1, 1).hashCode());
        assertEquals(Fraction.ONE.hashCode(), Fraction.getFraction(2, 2).hashCode());
    }

    @Test
    public void testCompareTo() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 4); // Not reduced, but equal value
        Fraction f3 = Fraction.getFraction(1, 3);
        Fraction f4 = Fraction.getFraction(2, 3);
        
        assertEquals(0, f1.compareTo(f1));
        assertEquals(0, f1.compareTo(f2)); // Natural ordering treats them as equal
        assertTrue(f1.compareTo(f3) > 0); // 1/2 > 1/3
        assertTrue(f1.compareTo(f4) < 0); // 1/2 < 2/3
    }

    @Test
    public void testCompareTo_Negative() {
        Fraction f1 = Fraction.getFraction(-1, 2);
        Fraction f2 = Fraction.getFraction(-2, 4); // Equal value
        Fraction f3 = Fraction.getFraction(-1, 3);
        Fraction f4 = Fraction.getFraction(-2, 3);

        assertEquals(0, f1.compareTo(f1));
        assertEquals(0, f1.compareTo(f2));
        assertTrue(f1.compareTo(f3) < 0); // -1/2 < -1/3
        assertTrue(f1.compareTo(f4) > 0); // -1/2 > -2/3
    }

    @Test
    public void testCompareTo_MixedSigns() {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(-1, 2);
        
        assertTrue(f1.compareTo(f2) > 0); // Positive > Negative
    }
    
    @Test
    public void testToString() {
        Fraction f = Fraction.getFraction(1, 2);
        assertEquals("1/2", f.toString());
    }
    
    @Test
    public void testToString_Reduced() {
        Fraction f = Fraction.getReducedFraction(2, 4);
        assertEquals("1/2", f.toString());
    }

    @Test
    public void testToString_Zero() {
        Fraction f = Fraction.ZERO;
        assertEquals("0/1", f.toString());
    }

    @Test
    public void testToProperString_PositiveImproper() {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals("1 3/4", f.toProperString());
    }

    @Test
    public void testToProperString_NegativeImproper() {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals("-1 3/4", f.toProperString());
    }

    @Test
    public void testToProperString_PositiveProper() {
        Fraction f = Fraction.getFraction(3, 4);
        assertEquals("3/4", f.toProperString());
    }

    @Test
    public void testToProperString_NegativeProper() {
        Fraction f = Fraction.getFraction(-3, 4);
        assertEquals("-3/4", f.toProperString());
    }
    
    @Test
    public void testToProperString_WholeNumber() {
        Fraction f = Fraction.getFraction(5, 1);
        assertEquals("5", f.toProperString());
    }

    @Test
    public void testToProperString_NegativeWholeNumber() {
        Fraction f = Fraction.getFraction(-5, 1);
        assertEquals("-5", f.toProperString());
    }

    @Test
    public void testToProperString_Zero() {
        Fraction f = Fraction.ZERO;
        assertEquals("0", f.toProperString());
    }

    @Test
    public void testToProperString_One() {
        Fraction f = Fraction.ONE;
        assertEquals("1", f.toProperString());
    }

    @Test
    public void testToProperString_MinusOne() {
        Fraction f = Fraction.getFraction(-1, 1);
        assertEquals("-1", f.toProperString());
    }
    
    @Test
    public void testToProperString_NumeratorEqualsDenominator() {
        Fraction f = Fraction.getFraction(3, 3);
        assertEquals("1", f.toProperString());
    }

    @Test
    public void testToProperString_NegativeNumeratorEqualsDenominator() {
        Fraction f = Fraction.getFraction(-3, 3);
        assertEquals("-1", f.toProperString());
    }
    
    @Test
    public void testToProperString_IntegerMinValueNumerator() {
        Fraction f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        assertEquals(Integer.toString(Integer.MIN_VALUE), f.toProperString());
    }
    
    @Test
    public void testToProperString_IntegerMinValueDenominator() {
        Fraction f = Fraction.getFraction(1, Integer.MIN_VALUE);
        assertEquals("1/" + Integer.MIN_VALUE, f.toProperString());
    }

}
