package org.apache.commons.math3.dfp;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math3.FieldElement;

public class DfpTest {
    @Test
    public void testFieldAndConstants() throws Exception {
        DfpField field = new DfpField(20);
        Dfp one = field.newDfp(1);
        assertEquals(field, one.getField());
        assertEquals(5, one.getRadixDigits());
        assertEquals("0.", one.getZero().toString());
        assertEquals("1.", one.getOne().toString());
        assertEquals("2.", one.getTwo().toString());
    }

    @Test
    public void testComparisonAndEquality() throws Exception {
        DfpField field = new DfpField(20);
        Dfp two = field.newDfp(2);
        Dfp three = field.newDfp(3);
        assertTrue(two.lessThan(three));
        assertTrue(three.greaterThan(two));
        assertFalse(two.equals(three));
        assertTrue(two.unequal(three));
        assertTrue(two.equals(field.newDfp(2)));
        assertFalse(two.lessThan(two));
        assertFalse(two.greaterThan(two));
    }

    @Test
    public void testSignedZeroComparisons() throws Exception {
        DfpField field = new DfpField(20);
        Dfp zero = field.newDfp(0);
        Dfp negativeZero = field.newDfp(-0.0);
        assertTrue(zero.isZero());
        assertTrue(negativeZero.isZero());
        assertTrue(negativeZero.negativeOrNull());
        assertTrue(negativeZero.positiveOrNull());
        assertFalse(negativeZero.strictlyNegative());
        assertFalse(negativeZero.strictlyPositive());
        assertTrue(zero.equals(negativeZero));
    }

    @Test
    public void testSignPredicates() throws Exception {
        DfpField field = new DfpField(20);
        Dfp positive = field.newDfp(3);
        Dfp negative = field.newDfp(-3);
        assertTrue(positive.strictlyPositive());
        assertTrue(positive.positiveOrNull());
        assertFalse(positive.negativeOrNull());
        assertFalse(positive.strictlyNegative());
        assertTrue(negative.strictlyNegative());
        assertTrue(negative.negativeOrNull());
        assertFalse(negative.positiveOrNull());
        assertFalse(negative.strictlyPositive());
    }

    @Test
    public void testAbsoluteAndNegation() throws Exception {
        DfpField field = new DfpField(20);
        Dfp negative = field.newDfp(-12);
        assertEquals("12.", negative.abs().toString());
        assertEquals("12.", negative.negate().toString());
        assertEquals("-12.", negative.toString());
    }

    @Test
    public void testNonFiniteClassifications() throws Exception {
        DfpField field = new DfpField(20);
        Dfp infinity = field.newDfp((byte) 1, Dfp.INFINITE);
        Dfp negativeInfinity = field.newDfp((byte) -1, Dfp.INFINITE);
        Dfp nan = field.newDfp((byte) 1, Dfp.QNAN);
        assertTrue(infinity.isInfinite());
        assertEquals(Dfp.INFINITE, infinity.classify());
        assertEquals("Infinity", infinity.toString());
        assertEquals("-Infinity", negativeInfinity.toString());
        assertTrue(nan.isNaN());
        assertEquals(Dfp.QNAN, nan.classify());
        assertEquals("NaN", nan.toString());
        assertFalse(nan.equals(nan));
    }

    @Test
    public void testHashCodeMatchesEqualValues() throws Exception {
        DfpField field = new DfpField(20);
        Dfp a = field.newDfp("123.5");
        Dfp b = field.newDfp("123.50");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testRoundingMethodsAtHalf() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("2.", field.newDfp("2.5").rint().toString());
        assertEquals("2.", field.newDfp("3.5").rint().toString());
        assertEquals("-2.", field.newDfp("-2.5").rint().toString());
        assertEquals("2.", field.newDfp("2.5").floor().toString());
        assertEquals("-3.", field.newDfp("-2.5").floor().toString());
        assertEquals("3.", field.newDfp("2.5").ceil().toString());
        assertEquals("-2.", field.newDfp("-2.5").ceil().toString());
    }

    @Test
    public void testRoundingIntegerAndFractionalValues() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("7.", field.newDfp("7").rint().toString());
        assertEquals("0.", field.newDfp("0.4").rint().toString());
        assertEquals("-1.", field.newDfp("-0.6").floor().toString());
        assertEquals("1.", field.newDfp("0.6").ceil().toString());
    }

    @Test
    public void testRemainder() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("1.", field.newDfp(7).remainder(field.newDfp(3)).toString());
        assertEquals("-1.", field.newDfp(-7).remainder(field.newDfp(3)).toString());
        assertEquals("0.", field.newDfp(6).remainder(field.newDfp(3)).toString());
    }

    @Test
    public void testIntValueEdgesAndSaturation() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals(Integer.MAX_VALUE, field.newDfp(2147483647L).intValue());
        assertEquals(Integer.MAX_VALUE, field.newDfp(2147483648L).intValue());
        assertEquals(Integer.MIN_VALUE, field.newDfp(-2147483648L).intValue());
        assertEquals(Integer.MIN_VALUE, field.newDfp(-2147483649L).intValue());
        assertEquals(2, field.newDfp("2.5").intValue());
        assertEquals(-2, field.newDfp("-2.5").intValue());
    }

    @Test
    public void testBase10000LogarithmsAndPowers() throws Exception {
        DfpField field = new DfpField(20);
        Dfp value = field.newDfp(10000);
        assertEquals(1, value.log10K());
        assertEquals(4, value.log10());
        assertEquals("1.", value.power10K(0).toString());
        assertEquals("10000.", value.power10K(1).toString());
        assertEquals("100.", value.power10(2).toString());
    }

    @Test
    public void testDecimalPowerNegativeAndRemainderCases() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("0.1", field.newDfp(1).power10(-1).toString());
        assertEquals("0.01", field.newDfp(1).power10(-2).toString());
        assertEquals("0.001", field.newDfp(1).power10(-3).toString());
        assertEquals("0.0001", field.newDfp(1).power10(-4).toString());
        assertEquals(-2, field.newDfp("0.1").log10());
    }

    @Test
    public void testAddAndSubtract() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("5.", field.newDfp(2).add(field.newDfp(3)).toString());
        assertEquals("-1.", field.newDfp(2).subtract(field.newDfp(3)).toString());
        assertEquals("0.", field.newDfp(3).subtract(field.newDfp(3)).toString());
        assertEquals("2.", field.newDfp("1.25").add(field.newDfp("0.75")).toString());
    }

    @Test
    public void testMultiplyAndDivide() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("12.", field.newDfp(3).multiply(field.newDfp(4)).toString());
        assertEquals("-12.", field.newDfp(-3).multiply(field.newDfp(4)).toString());
        assertEquals("2.", field.newDfp(8).divide(field.newDfp(4)).toString());
        assertEquals("0.5", field.newDfp(1).divide(field.newDfp(2)).toString());
    }

    @Test
    public void testDivisionByZeroAndReciprocal() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("Infinity", field.newDfp(1).divide(field.newDfp(0)).toString());
        assertEquals("-Infinity", field.newDfp(-1).divide(field.newDfp(0)).toString());
        assertEquals("0.5", field.newDfp(2).reciprocal().toString());
        assertEquals("Infinity", field.newDfp(0).reciprocal().toString());
    }

    @Test
    public void testSquareRoot() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("0.", field.newDfp(0).sqrt().toString());
        assertEquals("2.", field.newDfp(4).sqrt().toString());
        assertEquals("3.", field.newDfp(9).sqrt().toString());
        assertEquals("NaN", field.newDfp(-1).sqrt().toString());
    }

    @Test
    public void testStringParsingAndFormatting() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("123.45", field.newDfp("123.45").toString());
        assertEquals("-0.25", field.newDfp("-0.25").toString());
        assertEquals("1000.", field.newDfp("1e3").toString());
        assertEquals("0.001", field.newDfp("1E-3").toString());
        assertEquals("Infinity", field.newDfp("Infinity").toString());
        assertEquals("NaN", field.newDfp("NaN").toString());
    }

    @Test
    public void testCopySign() throws Exception {
        DfpField field = new DfpField(20);
        Dfp positive = field.newDfp(5);
        Dfp negative = field.newDfp(-2);
        assertEquals("-5.", Dfp.copysign(positive, negative).toString());
        assertEquals("-2.", Dfp.copysign(negative, positive).toString());
        assertEquals("5.", positive.toString());
    }

    @Test
    public void testNextAfterDirection() throws Exception {
        DfpField field = new DfpField(20);
        Dfp one = field.newDfp(1);
        Dfp up = one.nextAfter(field.newDfp(2));
        Dfp down = one.nextAfter(field.newDfp(0));
        assertTrue(up.greaterThan(one));
        assertTrue(down.lessThan(one));
        assertEquals(one, one.nextAfter(one));
    }

    @Test
    public void testDoubleConversions() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals(1.5, field.newDfp("1.5").toDouble(), 1e-12);
        assertEquals(-2.25, field.newDfp("-2.25").toDouble(), 1e-12);
        assertEquals(Double.POSITIVE_INFINITY,
                     field.newDfp((byte) 1, Dfp.INFINITE).toDouble(), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY,
                     field.newDfp((byte) -1, Dfp.INFINITE).toDouble(), 0.0);
    }

    @Test
    public void testSplitDoubleRecombines() throws Exception {
        DfpField field = new DfpField(20);
        Dfp value = field.newDfp("1.25");
        double[] split = value.toSplitDouble();
        assertEquals(2, split.length);
        assertEquals(value.toDouble(), split[0] + split[1], 1e-12);
    }

    @Test
    public void testNewInstanceAndClassification() throws Exception {
        DfpField field = new DfpField(20);
        Dfp value = field.newDfp(7);
        assertEquals("0.", value.newInstance().toString());
        assertEquals("7.", value.newInstance(value).toString());
        assertEquals(Dfp.FINITE, value.classify());
        assertFalse(value.isInfinite());
        assertFalse(value.isNaN());
    }
}
