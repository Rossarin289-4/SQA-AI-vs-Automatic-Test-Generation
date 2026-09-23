package org.apache.commons.lang3.math;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NumberUtilsCreateNumberChatGPTTest {
    @Test
    public void testNullInput() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testBlankInput() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testIntegerNumber() {
        assertEquals(Integer.valueOf(42), NumberUtils.createNumber("42"));
    }

    @Test
    public void testIntegerToLongBoundary() {
        assertEquals(
                Long.valueOf(2147483648L),
                NumberUtils.createNumber("2147483648"));
    }

    @Test
    public void testLongToBigIntegerBoundary() {
        assertEquals(
                new BigInteger("9223372036854775808"),
                NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void testHexInteger() {
        assertEquals(
                Integer.valueOf(127),
                NumberUtils.createNumber("0x7F"));
    }

    @Test
    public void testHexLongBoundary() {
        assertEquals(
                Long.valueOf(4294967296L),
                NumberUtils.createNumber("0x100000000"));
    }

    @Test
    public void testHexSixteenDigits() {
        assertTrue(
                NumberUtils.createNumber("0x1000000000000000")
                        instanceof Long);
    }

    @Test
    public void testHexSeventeenDigits() {
        assertTrue(
                NumberUtils.createNumber("0x10000000000000000")
                        instanceof BigInteger);
    }

    @Test
    public void testDecimalNumber() {
        assertEquals(
                Float.valueOf(1.25f),
                NumberUtils.createNumber("1.25"));
    }

    @Test
    public void testNumberWithExponent() {
        assertEquals(
                Float.valueOf(1000.0f),
                NumberUtils.createNumber("1e3"));
    }

    @Test
    public void testFloatSuffix() {
        assertEquals(
                Float.valueOf(1.5f),
                NumberUtils.createNumber("1.5F"));
    }

    @Test
    public void testDoubleSuffix() {
        assertEquals(
                Double.valueOf(1.5d),
                NumberUtils.createNumber("1.5D"));
    }

    @Test
    public void testLongSuffix() {
        assertEquals(
                Long.valueOf(42L),
                NumberUtils.createNumber("42L"));
    }

    @Test(expected = NumberFormatException.class)
    public void testLongSuffixWithDecimal() {
        NumberUtils.createNumber("1.2L");
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidTypeSuffix() {
        NumberUtils.createNumber("1.2Q");
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidExponentCombination() {
        NumberUtils.createNumber("1e2E3");
    }

    @Test
    public void testFloatMaximumBoundary() {
        assertEquals(
                Float.valueOf("3.4028235e+38"),
                NumberUtils.createNumber("3.4028235e+38"));
    }

    /*
     * Defect-oriented test:
     *
     * Float can parse this value as a finite value, but the Float
     * representation loses information from the original decimal string.
     *
     * A precision-preserving implementation should therefore continue
     * to Double rather than immediately returning Float.
     *
     * Expected correct behavior: Double.
     *
     * This test is expected to expose the buggy Float-first behavior
     * if Lang-3b returns Float.
     */
    @Test
    public void testFloatingPointPrecisionNearFloatMaximum() {
        Number result =
                NumberUtils.createNumber("3.40282355e+38");

        assertTrue(result instanceof Double);
    }

    /*
     * Defect-oriented test:
     * Float rounds the input value while Double retains more precision.
     *
     * Expected correct behavior: Double.
     */
    @Test
    public void testFloatingPointPrecisionLargeDecimal() {
        Number result =
                NumberUtils.createNumber("1234567.89");

        assertTrue(result instanceof Double);
        assertEquals(
                Double.valueOf("1234567.89"),
                result);
    }

    /*
     * Defect-oriented test:
     * Float representation is not sufficiently precise for the
     * supplied decimal value.
     *
     * Expected correct behavior: Double.
     */
    @Test
    public void testFloatingPointPrecisionDecimal() {
        Number result =
                NumberUtils.createNumber("1.23456789");

        assertTrue(result instanceof Double);
        assertEquals(
                Double.valueOf("1.23456789"),
                result);
    }

    @Test
    public void testFloatOverflowFallsBackToDouble() {
        Number result =
                NumberUtils.createNumber("1.7976931348623158e+308");

        assertTrue(result instanceof Double);
    }

    @Test
    public void testDoubleOverflowFallsBackToBigDecimal() {
        Number result =
                NumberUtils.createNumber("1.79769313486231585e+308");

        assertTrue(result instanceof java.math.BigDecimal);
    }

    @Test
    public void testFloatUnderflowFallsBackToDouble() {
        Number result =
                NumberUtils.createNumber("2.2250738585072014e-308");

        assertTrue(result instanceof Double);
    }

    @Test
    public void testSmallestDoubleBoundary() {
        Number result =
                NumberUtils.createNumber("4.9e-324");

        assertTrue(result instanceof Double);
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidNumber() {
        NumberUtils.createNumber("-");
    }
}
