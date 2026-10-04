package org.apache.commons.math.dfp;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import org.apache.commons.math.FieldElement;

public class DfpTest {
    @Test
    public void testFactoryAndConstants() throws Exception {
        DfpField field = new DfpField(20);
        Dfp value = field.newDfp(7);
        assertEquals(5, value.getRadixDigits());
        assertSame(field, value.getField());
        assertEquals("0.", value.getZero().toString());
        assertEquals("1.", value.getOne().toString());
        assertEquals("2.", value.getTwo().toString());
        assertEquals("0.", value.newInstance().toString());
    }

    @Test
    public void testComparisonAndEquality() throws Exception {
        DfpField field = new DfpField(20);
        Dfp a = field.newDfp("12");
        Dfp b = field.newDfp("12.0");
        assertTrue(a.equals(b));
        assertFalse(a.unequal(b));
        assertFalse(a.lessThan(b));
        assertFalse(a.greaterThan(b));
        assertTrue(field.newDfp("11").lessThan(a));
        assertTrue(field.newDfp("13").greaterThan(a));
        assertFalse(a.equals("12"));
    }

    @Test
    public void testNaNComparisons() throws Exception {
        DfpField field = new DfpField(20);
        Dfp nan = field.newDfp("NaN");
        assertTrue(nan.isNaN());
        assertEquals(Dfp.QNAN, nan.classify());
        assertFalse(nan.equals(nan));
        assertFalse(nan.lessThan(field.getOne()));
        assertFalse(nan.greaterThan(field.getOne()));
        assertFalse(nan.unequal(field.getOne()));
    }

    @Test
    public void testInfinityClassification() throws Exception {
        DfpField field = new DfpField(20);
        Dfp positive = field.newDfp("Infinity");
        Dfp negative = field.newDfp("-Infinity");
        assertTrue(positive.isInfinite());
        assertFalse(positive.isNaN());
        assertEquals(Dfp.INFINITE, positive.classify());
        assertTrue(negative.lessThan(field.newDfp(-100)));
        assertTrue(positive.greaterThan(field.newDfp(100)));
        assertEquals("Infinity", positive.toString());
        assertEquals("-Infinity", negative.toString());
    }

    @Test
    public void testHashCodeConsistentForEqualValues() throws Exception {
        DfpField field = new DfpField(20);
        Dfp a = field.newDfp("123.5");
        Dfp b = field.newDfp("123.50");
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testRoundingIntegerMethods() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("2.", field.newDfp("2.5").rint().toString());
        assertEquals("4.", field.newDfp("3.5").rint().toString());
        assertEquals("-2.", field.newDfp("-1.2").floor().toString());
        assertEquals("-1.", field.newDfp("-1.2").ceil().toString());
        assertEquals("2.", field.newDfp("1.2").ceil().toString());
    }

    @Test
    public void testRoundingAtHalfEvenAndHalfOddIntegers() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("2.", field.newDfp("2.5").rint().toString());
        assertEquals("4.", field.newDfp("3.5").rint().toString());
        assertEquals("-2.", field.newDfp("-2.5").rint().toString());
        assertEquals("-4.", field.newDfp("-3.5").rint().toString());
    }

    @Test
    public void testRemainderUsesNearestIntegerQuotient() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("1.", field.newDfp("7").remainder(field.newDfp("2")).toString());
        assertEquals("-1.", field.newDfp("5").remainder(field.newDfp("2")).toString());
        assertEquals("-1.", field.newDfp("-5").remainder(field.newDfp("2")).toString());
    }

    @Test
    public void testIntValueRangeEdges() throws Exception {
        DfpField field = new DfpField(30);
        assertEquals(Integer.MAX_VALUE, field.newDfp("2147483647").intValue());
        assertEquals(Integer.MAX_VALUE, field.newDfp("2147483648").intValue());
        assertEquals(Integer.MIN_VALUE, field.newDfp("-2147483648").intValue());
        assertEquals(Integer.MIN_VALUE, field.newDfp("-2147483649").intValue());
    }

    @Test
    public void testIntValueRoundsBeforeConversion() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals(2, field.newDfp("1.5").intValue());
        assertEquals(-2, field.newDfp("-1.5").intValue());
        assertEquals(0, field.newDfp("0.5").intValue());
    }

    @Test
    public void testBase10000LogarithmAndPower() throws Exception {
        DfpField field = new DfpField(20);
        Dfp value = field.newDfp("10000");
        assertEquals(1, value.log10K());
        assertEquals("10000.", value.power10K(1).toString());
        assertEquals("0.0001", value.power10K(-1).toString());
    }

    @Test
    public void testDecimalLogarithmAndPowerEdges() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals(-1, field.newDfp("1").log10());
        assertEquals(0, field.newDfp("10").log10());
        assertEquals(-4, field.newDfp("0.1").log10());
        assertEquals("1.", field.newDfp(9).power10(0).toString());
        assertEquals("10.", field.newDfp(9).power10(1).toString());
        assertEquals("0.1", field.newDfp(9).power10(-1).toString());
        assertEquals("0.01", field.newDfp(9).power10(-2).toString());
    }

    @Test
    public void testAddSubtractAndNegate() throws Exception {
        DfpField field = new DfpField(20);
        Dfp a = field.newDfp("12.5");
        assertEquals("15.", a.add(field.newDfp("2.5")).toString());
        assertEquals("10.", a.subtract(field.newDfp("2.5")).toString());
        assertEquals("-12.5", a.negate().toString());
        assertEquals("0.", a.add(a.negate()).toString());
    }

    @Test
    public void testMultiplyAndDivide() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("12.", field.newDfp("3").multiply(field.newDfp("4")).toString());
        assertEquals("-12.", field.newDfp("-3").multiply(field.newDfp("4")).toString());
        assertEquals("3.", field.newDfp("12").divide(field.newDfp("4")).toString());
        assertEquals("-3.", field.newDfp("12").divide(field.newDfp("-4")).toString());
    }

    @Test
    public void testSquareRootExactSquares() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("0.", field.newDfp("0").sqrt().toString());
        assertEquals("2.", field.newDfp("4").sqrt().toString());
        assertEquals("3.", field.newDfp("9").sqrt().toString());
    }

    @Test
    public void testStringParsingForms() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("123.45", field.newDfp("123.45").toString());
        assertEquals("0.001", field.newDfp("1e-3").toString());
        assertEquals("1000.", field.newDfp("1E3").toString());
        assertEquals("0.", field.newDfp("0.000").toString());
        assertEquals("NaN", field.newDfp("NaN").toString());
    }

    @Test
    public void testCopySignAndNextAfter() throws Exception {
        DfpField field = new DfpField(20);
        Dfp positive = field.newDfp("3");
        Dfp negative = field.newDfp("-2");
        assertEquals("-3.", Dfp.copysign(positive, negative).toString());
        assertEquals("2.", Dfp.copysign(negative, positive).toString());
        assertEquals(positive.toString(), positive.nextAfter(positive).toString());
        assertTrue(positive.nextAfter(field.newDfp("4")).greaterThan(positive));
        assertTrue(positive.nextAfter(field.newDfp("2")).lessThan(positive));
    }

    @Test
    public void testDoubleConversions() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals(12.5, field.newDfp("12.5").toDouble(), 1e-12);
        assertEquals(Double.POSITIVE_INFINITY, field.newDfp("Infinity").toDouble(), 0.0);
        assertTrue(Double.isNaN(field.newDfp("NaN").toDouble()));
        double[] split = field.newDfp("12.5").toSplitDouble();
        assertEquals(2, split.length);
        assertEquals(12.5, split[0] + split[1], 1e-12);
    }

    @Test
    public void testDotrapDefaultAndInvalid() throws Exception {
        DfpField field = new DfpField(20);
        Dfp value = field.newDfp("5");
        Dfp ordinary = value.dotrap(0, "other", null, value);
        assertEquals("5.", ordinary.toString());
        Dfp invalid = value.dotrap(DfpField.FLAG_INVALID, "other", null, value);
        assertTrue(invalid.isNaN());
        assertEquals(Dfp.QNAN, invalid.classify());
    }

    @Test
    public void testNumericBoundaryPowers() throws Exception {
        DfpField field = new DfpField(20);
        assertEquals("1000.", field.newDfp("1").power10(3).toString());
        assertEquals("10000.", field.newDfp("1").power10(4).toString());
        assertEquals("0.001", field.newDfp("1").power10(-3).toString());
        assertEquals("0.0001", field.newDfp("1").power10(-4).toString());
    }
}
