package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;

public class FractionTest {

    @Test
    public void testGetFraction_int_int_zeroDenominator() throws Exception {
        try {
            Fraction.getFraction(1, 0);
            fail("The denominator must not be zero");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testGetFraction_int_int_negativeDenominator() throws Exception {
        Fraction f = Fraction.getFraction(1, -2);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testGetFraction_int_int_negativeDenominator_overflow() throws Exception {
        try {
            Fraction.getFraction(Integer.MIN_VALUE, -1);
            fail("overflow: can't negate");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testGetFraction_int_int_positive() throws Exception {
        Fraction f = Fraction.getFraction(3, 7);
        assertEquals(3, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test
    public void testGetFraction_int_int_negativeNumerator() throws Exception {
        Fraction f = Fraction.getFraction(-3, 7);
        assertEquals(-3, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }
    
    @Test
    public void testGetFraction_int_int_zeroNumerator() throws Exception {
        Fraction f = Fraction.getFraction(0, 7);
        assertEquals(0, f.getNumerator());
        assertEquals(7, f.getDenominator());
    }

    @Test
    public void testGetFraction_int_int_int_negativeWholeAndNumerator() throws Exception {
        Fraction f = Fraction.getFraction(-1, 2, 3);
        assertEquals(-5, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testGetFraction_int_int_int_zeroDenominator() throws Exception {
        try {
            Fraction.getFraction(1, 2, 0);
            fail("The denominator must not be zero");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testGetFraction_int_int_int_negativeDenominator() throws Exception {
        try {
            Fraction.getFraction(1, 2, -3);
            fail("The denominator must not be negative");
        } catch (ArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testGetFraction_int_int_int_negativeNumerator() throws Exception {
        try {
            Fraction.getFraction(1, -2, 3);
            fail("The numerator must not be negative");
        } catch (ArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testGetFraction_int_int_int_numeratorTooLarge() throws Exception {
        try {
            // (Integer.MAX_VALUE / 2) * 2 + 2 -> overflow
            Fraction.getFraction(Integer.MAX_VALUE / 2, 2, 2);
            fail("Numerator too large to represent as an Integer.");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testGetReducedFraction_int_int_zero() throws Exception {
        Fraction f = Fraction.getReducedFraction(0, 5);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_int_int_positive() throws Exception {
        Fraction f = Fraction.getReducedFraction(4, 8);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetReducedFraction_int_int_negative() throws Exception {
        Fraction f = Fraction.getReducedFraction(-4, 8);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testGetReducedFraction_int_int_negativeDenominator() throws Exception {
        Fraction f = Fraction.getReducedFraction(4, -8);
        assertEquals(-1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testGetReducedFraction_int_int_MIN_VALUE_denominator() throws Exception {
        Fraction f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        assertEquals(Integer.MIN_VALUE / 2, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }
    
    @Test
    public void testGetFraction_double_nan() throws Exception {
        try {
            Fraction.getFraction(Double.NaN);
            fail("The value must not be greater than Integer.MAX_VALUE or NaN");
        } catch (ArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testGetFraction_double_infinity() throws Exception {
        try {
            Fraction.getFraction(Double.POSITIVE_INFINITY);
            fail("The value must not be greater than Integer.MAX_VALUE or NaN");
        } catch (ArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testGetFraction_double_largeValue() throws Exception {
        // A value that is slightly larger than Integer.MAX_VALUE
        try {
            Fraction.getFraction((double)Integer.MAX_VALUE + 1.0);
            fail("The value must not be greater than Integer.MAX_VALUE or NaN");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testGetFraction_double_zero() throws Exception {
        Fraction f = Fraction.getFraction(0.0);
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testGetFraction_double_fraction() throws Exception {
        Fraction f = Fraction.getFraction(0.5);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }
    
    @Test
    public void testGetFraction_double_fraction_with_whole() throws Exception {
        Fraction f = Fraction.getFraction(1.5);
        assertEquals(3, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFraction_double_complexFraction() throws Exception {
        Fraction f = Fraction.getFraction(1.33333333); // approx 4/3
        assertEquals(4, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }
    
    @Test
    public void testGetFraction_double_repeatingDecimal() throws Exception {
        Fraction f = Fraction.getFraction(0.3333333333333333); // 1/3
        assertEquals(1, f.getNumerator());
        assertEquals(3, f.getDenominator());
    }

    @Test
    public void testGetFraction_String_null() throws Exception {
        try {
            Fraction.getFraction((String) null);
            fail("The string must not be null");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetFraction_String_doubleFormat() throws Exception {
        Fraction f = Fraction.getFraction("0.5");
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFraction_String_properFormat() throws Exception {
        Fraction f = Fraction.getFraction("1 1/2");
        assertEquals(3, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    public void testGetFraction_String_fractionFormat() throws Exception {
        Fraction f = Fraction.getFraction("3/4");
        assertEquals(3, f.getNumerator());
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testGetFraction_String_wholeNumberFormat() throws Exception {
        Fraction f = Fraction.getFraction("5");
        assertEquals(5, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }
    
    @Test
    public void testGetFraction_String_invalidFormat() throws Exception {
        try {
            Fraction.getFraction("1/2/3");
            fail("Invalid format");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testGetNumerator() throws Exception {
        Fraction f = Fraction.getFraction(3, 4);
        assertEquals(3, f.getNumerator());
    }

    @Test
    public void testGetDenominator() throws Exception {
        Fraction f = Fraction.getFraction(3, 4);
        assertEquals(4, f.getDenominator());
    }

    @Test
    public void testGetProperNumerator() throws Exception {
        Fraction f = Fraction.getFraction(7, 4); // 1 3/4
        assertEquals(3, f.getProperNumerator());
    }

    @Test
    public void testGetProperNumerator_negative() throws Exception {
        Fraction f = Fraction.getFraction(-7, 4); // -1 3/4
        assertEquals(3, f.getProperNumerator());
    }
    
    @Test
    public void testGetProperNumerator_zero() throws Exception {
        Fraction f = Fraction.getFraction(0, 4); 
        assertEquals(0, f.getProperNumerator());
    }
    
    @Test
    public void testGetProperNumerator_exact() throws Exception {
        Fraction f = Fraction.getFraction(1, 2); 
        assertEquals(1, f.getProperNumerator());
    }

    @Test
    public void testGetProperWhole() throws Exception {
        Fraction f = Fraction.getFraction(7, 4); // 1 3/4
        assertEquals(1, f.getProperWhole());
    }

    @Test
    public void testGetProperWhole_negative() throws Exception {
        Fraction f = Fraction.getFraction(-7, 4); // -1 3/4
        assertEquals(-1, f.getProperWhole());
    }
    
    @Test
    public void testGetProperWhole_zero() throws Exception {
        Fraction f = Fraction.getFraction(3, 4); // 0 3/4
        assertEquals(0, f.getProperWhole());
    }
    
    @Test
    public void testGetProperWhole_exact() throws Exception {
        Fraction f = Fraction.getFraction(1, 1); // 1
        assertEquals(1, f.getProperWhole());
    }

    @Test
    public void testIntValue() throws Exception {
        Fraction f = Fraction.getFraction(7, 4); // 1 3/4
        assertEquals(1, f.intValue());
    }
    
    @Test
    public void testIntValue_negative() throws Exception {
        Fraction f = Fraction.getFraction(-7, 4); // -1 3/4
        assertEquals(-1, f.intValue());
    }
    
    @Test
    public void testIntValue_zero() throws Exception {
        Fraction f = Fraction.getFraction(0, 4); // 0
        assertEquals(0, f.intValue());
    }

    @Test
    public void testLongValue() throws Exception {
        Fraction f = Fraction.getFraction(7, 4); // 1 3/4
        assertEquals(1L, f.longValue());
    }
    
    @Test
    public void testLongValue_negative() throws Exception {
        Fraction f = Fraction.getFraction(-7, 4); // -1 3/4
        assertEquals(-1L, f.longValue());
    }
    
    @Test
    public void testLongValue_zero() throws Exception {
        Fraction f = Fraction.getFraction(0, 4); // 0
        assertEquals(0L, f.longValue());
    }

    @Test
    public void testFloatValue() throws Exception {
        Fraction f = Fraction.getFraction(1, 3);
        assertEquals(1.0f / 3.0f, f.floatValue(), 1e-9f);
    }

    @Test
    public void testFloatValue_negative() throws Exception {
        Fraction f = Fraction.getFraction(-1, 3);
        assertEquals(-1.0f / 3.0f, f.floatValue(), 1e-9f);
    }
    
    @Test
    public void testFloatValue_zero() throws Exception {
        Fraction f = Fraction.getFraction(0, 3);
        assertEquals(0.0f, f.floatValue(), 1e-9f);
    }

    @Test
    public void testDoubleValue() throws Exception {
        Fraction f = Fraction.getFraction(1, 3);
        assertEquals(1.0 / 3.0, f.doubleValue(), 1e-9);
    }
    
    @Test
    public void testDoubleValue_negative() throws Exception {
        Fraction f = Fraction.getFraction(-1, 3);
        assertEquals(-1.0 / 3.0, f.doubleValue(), 1e-9);
    }
    
    @Test
    public void testDoubleValue_zero() throws Exception {
        Fraction f = Fraction.getFraction(0, 3);
        assertEquals(0.0, f.doubleValue(), 1e-9);
    }

    @Test
    public void testReduce() throws Exception {
        Fraction f = Fraction.getFraction(4, 8);
        Fraction reduced = f.reduce();
        assertEquals(1, reduced.getNumerator());
        assertEquals(2, reduced.getDenominator());
        // Ensure it returns a new instance if reduction is possible
        assertNotSame(f, reduced); 
    }
    
    @Test
    public void testReduce_alreadyReduced() throws Exception {
        Fraction f = Fraction.getFraction(1, 2);
        Fraction reduced = f.reduce();
        assertEquals(1, reduced.getNumerator());
        assertEquals(2, reduced.getDenominator());
        // Ensure it returns the same instance if no reduction is possible
        assertSame(f, reduced); 
    }
    
    @Test
    public void testReduce_zero() throws Exception {
        Fraction f = Fraction.getFraction(0, 5);
        Fraction reduced = f.reduce();
        assertEquals(0, reduced.getNumerator());
        assertEquals(1, reduced.getDenominator());
        assertNotSame(f, reduced);
    }

    @Test
    public void testInvert() throws Exception {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction inverted = f.invert();
        assertEquals(3, inverted.getNumerator());
        assertEquals(2, inverted.getDenominator());
    }

    @Test
    public void testInvert_negative() throws Exception {
        Fraction f = Fraction.getFraction(-2, 3);
        Fraction inverted = f.invert();
        assertEquals(-3, inverted.getNumerator());
        assertEquals(2, inverted.getDenominator());
    }
    
    @Test
    public void testInvert_negativeDenominator() throws Exception {
        Fraction f = Fraction.getFraction(2, -3);
        Fraction inverted = f.invert();
        assertEquals(-3, inverted.getNumerator());
        assertEquals(2, inverted.getDenominator());
    }

    @Test
    public void testInvert_zero() throws Exception {
        try {
            Fraction.ZERO.invert();
            fail("Unable to invert zero.");
        } catch (ArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testInvert_minValueNumerator() throws Exception {
        try {
            // MIN_VALUE cannot be negated to positive
            Fraction.getFraction(Integer.MIN_VALUE, 1).invert();
            fail("overflow: can't negate numerator");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testNegate() throws Exception {
        Fraction f = Fraction.getFraction(2, 3);
        Fraction negated = f.negate();
        assertEquals(-2, negated.getNumerator());
        assertEquals(3, negated.getDenominator());
    }

    @Test
    public void testNegate_negative() throws Exception {
        Fraction f = Fraction.getFraction(-2, 3);
        Fraction negated = f.negate();
        assertEquals(2, negated.getNumerator());
        assertEquals(3, negated.getDenominator());
    }

    @Test
    public void testNegate_zero() throws Exception {
        Fraction f = Fraction.ZERO;
        Fraction negated = f.negate();
        assertEquals(0, negated.getNumerator());
        assertEquals(1, negated.getDenominator());
    }
    
    @Test
    public void testNegate_minValue() throws Exception {
        try {
            Fraction.getFraction(Integer.MIN_VALUE, 1).negate();
            fail("overflow: too large to negate");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testAbs_positive() throws Exception {
        Fraction f = Fraction.getFraction(2, 3);
        assertSame(f, f.abs());
    }

    @Test
    public void testAbs_negative() throws Exception {
        Fraction f = Fraction.getFraction(-2, 3);
        Fraction absVal = f.abs();
        assertEquals(2, absVal.getNumerator());
        assertEquals(3, absVal.getDenominator());
        assertNotSame(f, absVal);
    }
    
    @Test
    public void testAbs_zero() throws Exception {
        Fraction f = Fraction.ZERO;
        assertSame(f, f.abs());
    }

    @Test
    public void testPow_zero() throws Exception {
        Fraction f = Fraction.getFraction(5, 6);
        assertEquals(Fraction.ONE, f.pow(0));
    }

    @Test
    public void testPow_one() throws Exception {
        Fraction f = Fraction.getFraction(5, 6);
        assertSame(f, f.pow(1));
    }

    @Test
    public void testPow_positive() throws Exception {
        Fraction f = Fraction.getFraction(2, 3);
        assertEquals(Fraction.getFraction(4, 9), f.pow(2));
    }
    
    @Test
    public void testPow_positive_complex() throws Exception {
        Fraction f = Fraction.getFraction(2, 3);
        assertEquals(Fraction.getFraction(8, 27), f.pow(3));
    }

    @Test
    public void testPow_negative() throws Exception {
        Fraction f = Fraction.getFraction(2, 3);
        assertEquals(Fraction.getFraction(9, 4), f.pow(-2));
    }
    
    @Test
    public void testPow_negative_complex() throws Exception {
        Fraction f = Fraction.getFraction(2, 3);
        assertEquals(Fraction.getFraction(27, 8), f.pow(-3));
    }
    
    @Test
    public void testPow_zeroFraction_positivePower() throws Exception {
        Fraction f = Fraction.ZERO;
        // The implementation of pow for ZERO with positive power recurses until power is 0, then returns ONE.
        assertEquals(Fraction.ONE, f.pow(5)); 
    }

    @Test
    public void testPow_negative_zeroPower() throws Exception {
        Fraction f = Fraction.getFraction(-2, 3);
        assertEquals(Fraction.ONE, f.pow(0));
    }
    
    @Test
    public void testPow_negative_powerMinValue() throws Exception {
        Fraction f = Fraction.getFraction(2, 3);
        // MIN_VALUE needs special handling: invert().pow(2).pow(-(power/2))
        // invert() -> 3/2
        // pow(2) -> 9/4
        // pow(-(MIN_VALUE/2)) -> This will cause overflow in mulAndCheck
        try {
            f.pow(Integer.MIN_VALUE);
            fail("Expected ArithmeticException for overflow with MIN_VALUE power");
        } catch (ArithmeticException e) {
            // expected
        }
    }

    @Test
    public void testAdd() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        assertEquals(Fraction.getFraction(5, 6), f1.add(f2));
    }

    @Test
    public void testAdd_zero() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        assertEquals(f1, f1.add(Fraction.ZERO));
    }
    
    @Test
    public void testAdd_with_zero() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        assertEquals(f1, Fraction.ZERO.add(f1));
    }
    
    @Test
    public void testAdd_negative() throws Exception {
        Fraction f1 = Fraction.getFraction(-1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        assertEquals(Fraction.getFraction(-1, 6), f1.add(f2));
    }
    
    @Test
    public void testAdd_doubleNegative() throws Exception {
        Fraction f1 = Fraction.getFraction(-1, 2);
        Fraction f2 = Fraction.getFraction(-1, 3);
        assertEquals(Fraction.getFraction(-5, 6), f1.add(f2));
    }

    @Test
    public void testSubtract() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        assertEquals(Fraction.getFraction(1, 6), f1.subtract(f2));
    }

    @Test
    public void testSubtract_zero() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        assertEquals(f1, f1.subtract(Fraction.ZERO));
    }
    
    @Test
    public void testSubtract_from_zero() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        assertEquals(Fraction.getFraction(-1, 2), Fraction.ZERO.subtract(f1));
    }
    
    @Test
    public void testSubtract_negative() throws Exception {
        Fraction f1 = Fraction.getFraction(-1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        assertEquals(Fraction.getFraction(-5, 6), f1.subtract(f2));
    }
    
    @Test
    public void testSubtract_doubleNegative() throws Exception {
        Fraction f1 = Fraction.getFraction(-1, 2);
        Fraction f2 = Fraction.getFraction(-1, 3);
        assertEquals(Fraction.getFraction(-1, 6), f1.subtract(f2));
    }

    @Test
    public void testMultiplyBy() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 3);
        assertEquals(Fraction.getFraction(1, 3), f1.multiplyBy(f2));
    }

    @Test
    public void testMultiplyBy_zero() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        assertEquals(Fraction.ZERO, f1.multiplyBy(Fraction.ZERO));
    }
    
    @Test
    public void testMultiplyBy_with_zero() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        assertEquals(Fraction.ZERO, Fraction.ZERO.multiplyBy(f1));
    }
    
    @Test
    public void testMultiplyBy_negative() throws Exception {
        Fraction f1 = Fraction.getFraction(-1, 2);
        Fraction f2 = Fraction.getFraction(2, 3);
        assertEquals(Fraction.getFraction(-1, 3), f1.multiplyBy(f2));
    }
    
    @Test
    public void testMultiplyBy_doubleNegative() throws Exception {
        Fraction f1 = Fraction.getFraction(-1, 2);
        Fraction f2 = Fraction.getFraction(-2, 3);
        assertEquals(Fraction.getFraction(1, 3), f1.multiplyBy(f2));
    }

    @Test
    public void testDivideBy() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        assertEquals(Fraction.getFraction(3, 2), f1.divideBy(f2));
    }

    @Test
    public void testDivideBy_zero() throws Exception {
        try {
            Fraction.getFraction(1, 2).divideBy(Fraction.ZERO);
            fail("The fraction to divide by must not be zero");
        } catch (ArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testDivideBy_negative() throws Exception {
        Fraction f1 = Fraction.getFraction(-1, 2);
        Fraction f2 = Fraction.getFraction(1, 3);
        assertEquals(Fraction.getFraction(-3, 2), f1.divideBy(f2));
    }
    
    @Test
    public void testDivideBy_doubleNegative() throws Exception {
        Fraction f1 = Fraction.getFraction(-1, 2);
        Fraction f2 = Fraction.getFraction(-1, 3);
        assertEquals(Fraction.getFraction(3, 2), f1.divideBy(f2));
    }

    @Test
    public void testEquals() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 2);
        assertEquals(f1, f2);
    }

    @Test
    public void testEquals_different() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 3);
        assertNotSame(f1, f2);
    }
    
    @Test
    public void testEquals_differentRepresentation() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 4);
        // Note: equals() checks exact numerator and denominator, not reduced form.
        assertNotSame(f1, f2);
    }

    @Test
    public void testEquals_self() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        assertEquals(f1, f1);
    }

    @Test
    public void testHashCode() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getReducedFraction(2, 4); // same logical value, different internal rep
        // Note: hashCode() is based on internal numerator/denominator, not reduced value.
        // So f1 and f2 will have different hash codes.
        assertNotEquals(f1.hashCode(), f2.hashCode());
        
        Fraction f3 = Fraction.getFraction(1, 3);
        assertNotEquals(f1.hashCode(), f3.hashCode());

        // Test hashCode for same values
        Fraction f4 = Fraction.getFraction(1, 2);
        assertEquals(f1.hashCode(), f4.hashCode());
    }
    
    @Test
    public void testHashCode_same() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(1, 2);
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testCompareTo() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2); // 0.5
        Fraction f2 = Fraction.getFraction(1, 3); // ~0.333
        assertEquals(1, f1.compareTo(f2)); // 0.5 > 0.333, should be 1
    }
    
    @Test
    public void testCompareTo_equal() throws Exception {
        Fraction f1 = Fraction.getFraction(1, 2);
        Fraction f2 = Fraction.getFraction(2, 4); // Not equal by equals(), but should be by compareTo
        assertEquals(0, f1.compareTo(f2));
    }
    
    @Test
    public void testCompareTo_greater() throws Exception {
        Fraction f1 = Fraction.getFraction(3, 4); // 0.75
        Fraction f2 = Fraction.getFraction(1, 2); // 0.5
        assertEquals(1, f1.compareTo(f2));
    }

    @Test
    public void testCompareTo_negative() throws Exception {
        Fraction f1 = Fraction.getFraction(-1, 2); // -0.5
        Fraction f2 = Fraction.getFraction(-1, 3); // ~-0.333
        assertEquals(-1, f1.compareTo(f2)); // -0.5 < -0.333
    }
    
    @Test
    public void testCompareTo_zero() throws Exception {
        Fraction f1 = Fraction.getFraction(0, 1);
        Fraction f2 = Fraction.getFraction(0, 5);
        assertEquals(0, f1.compareTo(f2));
    }

    @Test
    public void testToString() throws Exception {
        Fraction f = Fraction.getFraction(3, 4);
        assertEquals("3/4", f.toString());
    }
    
    @Test
    public void testToString_negativeNumerator() throws Exception {
        Fraction f = Fraction.getFraction(-3, 4);
        assertEquals("-3/4", f.toString());
    }
    
    @Test
    public void testToString_negativeDenominator() throws Exception {
        Fraction f = Fraction.getFraction(3, -4);
        // The getFraction method normalizes negative denominators to the numerator.
        assertEquals("-3/4", f.toString());
    }

    @Test
    public void testToProperString_improper() throws Exception {
        Fraction f = Fraction.getFraction(7, 4);
        assertEquals("1 3/4", f.toProperString());
    }

    @Test
    public void testToProperString_improper_negative() throws Exception {
        Fraction f = Fraction.getFraction(-7, 4);
        assertEquals("-1 3/4", f.toProperString());
    }

    @Test
    public void testToProperString_wholeNumber() throws Exception {
        Fraction f = Fraction.getFraction(5, 1);
        assertEquals("5", f.toProperString());
    }
    
    @Test
    public void testToProperString_wholeNumber_negative() throws Exception {
        Fraction f = Fraction.getFraction(-5, 1);
        assertEquals("-5", f.toProperString());
    }

    @Test
    public void testToProperString_zero() throws Exception {
        Fraction f = Fraction.ZERO;
        assertEquals("0", f.toProperString());
    }
    
    @Test
    public void testToProperString_exactOne() throws Exception {
        Fraction f = Fraction.ONE;
        assertEquals("1", f.toProperString());
    }
    
    @Test
    public void testToProperString_exactMinusOne() throws Exception {
        Fraction f = Fraction.getFraction(-1, 1);
        assertEquals("-1", f.toProperString());
    }

    @Test
    public void testToProperString_proper() throws Exception {
        Fraction f = Fraction.getFraction(3, 4);
        assertEquals("3/4", f.toProperString());
    }
    
    @Test
    public void testToProperString_proper_negative() throws Exception {
        Fraction f = Fraction.getFraction(-3, 4);
        assertEquals("-3/4", f.toProperString());
    }
    
    @Test
    public void testToProperString_proper_negativeDenominator() throws Exception {
        Fraction f = Fraction.getFraction(3, -4);
        // The getFraction method normalizes negative denominators to the numerator.
        assertEquals("-3/4", f.toProperString());
    }

    @Test
    public void testToProperString_numeratorZero() throws Exception {
        Fraction f = Fraction.getFraction(0, 5);
        assertEquals("0", f.toProperString());
    }
}
