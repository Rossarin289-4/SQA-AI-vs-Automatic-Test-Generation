```java
package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.StringUtils;

public class NumberUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testStringToIntConversionAndFallback() throws Exception {
        assertEquals(17, NumberUtils.stringToInt("17"));
        assertEquals(0, NumberUtils.stringToInt("bad"));
    }

    @Test
    public void testToIntNullAndCustomFallback() throws Exception {
        assertEquals(9, NumberUtils.toInt(null, 9));
        assertEquals(-3, NumberUtils.toInt("", -3));
    }

    @Test
    public void testToIntIntegerBounds() throws Exception {
        assertEquals(Integer.MAX_VALUE, NumberUtils.toInt("2147483647", 7));
        assertEquals(7, NumberUtils.toInt("2147483648", 7));
        assertEquals(Integer.MIN_VALUE, NumberUtils.toInt("-2147483648", 7));
        assertEquals(7, NumberUtils.toInt("-2147483649", 7));
    }

    @Test
    public void testToLongConversionFallbackAndBounds() throws Exception {
        assertEquals(12L, NumberUtils.toLong("12"));
        assertEquals(4L, NumberUtils.toLong(null, 4L));
        assertEquals(4L, NumberUtils.toLong("9223372036854775808", 4L));
        assertEquals(Long.MAX_VALUE, NumberUtils.toLong("9223372036854775807", 4L));
    }

    @Test
    public void testToFloatConversionAndFallback() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 1e-6f);
        assertEquals(2.25f, NumberUtils.toFloat(null, 2.25f), 1e-6f);
        assertEquals(2.25f, NumberUtils.toFloat("x", 2.25f), 1e-6f);
    }

    @Test
    public void testToDoubleConversionAndFallback() throws Exception {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 1e-12);
        assertEquals(3.0d, NumberUtils.toDouble("", 3.0d), 1e-12);
        assertEquals(3.0d, NumberUtils.toDouble(null, 3.0d), 1e-12);
    }

    @Test
    public void testCreateNumberNullAndBlank() throws Exception {
        assertNull(NumberUtils.createNumber(null));
        try {
            NumberUtils.createNumber(" ");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateNumberIntegralBoundaries() throws Exception {
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), NumberUtils.createNumber("2147483647"));
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(Long.valueOf(Long.MAX_VALUE), NumberUtils.createNumber("9223372036854775807"));
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createNumber("9223372036854775808"));
    }

    @Test
    public void testCreateNumberHexAndLeadingZero() throws Exception {
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xff"));
        assertEquals(Integer.valueOf(-16), NumberUtils.createNumber("-0x10"));
        assertEquals(Integer.valueOf(10), NumberUtils.createNumber("010"));
    }

    @Test
    public void testCreateNumberDecimalAndExponent() throws Exception {
        assertEquals(new BigDecimal("1.25"), NumberUtils.createNumber("1.25"));
        assertEquals(Float.valueOf(100.0f), NumberUtils.createNumber("1e2"));
        assertEquals(new BigDecimal("1e100"), NumberUtils.createNumber("1e100"));
    }

    @Test
    public void testCreateNumberTypeSuffixes() throws Exception {
        assertEquals(Long.valueOf(12L), NumberUtils.createNumber("12L"));
        assertEquals(Float.valueOf(1.5f), NumberUtils.createNumber("1.5F"));
        assertEquals(Double.valueOf(2.5d), NumberUtils.createNumber("2.5D"));
    }

    @Test
    public void testCreateNumberRejectsMalformedInput() throws Exception {
        try {
            NumberUtils.createNumber("1.2.3");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
        try {
            NumberUtils.createNumber(" 1");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateFloatNullAndValue() throws Exception {
        assertNull(NumberUtils.createFloat(null));
        assertEquals(Float.valueOf(2.5f), NumberUtils.createFloat("2.5"));
    }

    @Test
    public void testCreateDoubleNullAndValue() throws Exception {
        assertNull(NumberUtils.createDouble(null));
        assertEquals(Double.valueOf(-2.5d), NumberUtils.createDouble("-2.5"));
    }

    @Test
    public void testCreateIntegerNullRadixAndBounds() throws Exception {
        assertNull(NumberUtils.createInteger(null));
        assertEquals(Integer.valueOf(255), NumberUtils.createInteger("0xff"));
        assertEquals(Integer.valueOf(Integer.MAX_VALUE), NumberUtils.createInteger("2147483647"));
        try {
            NumberUtils.createInteger("2147483648");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateLongNullAndBounds() throws Exception {
        assertNull(NumberUtils.createLong(null));
        assertEquals(Long.valueOf(Long.MAX_VALUE), NumberUtils.createLong("9223372036854775807"));
        try {
            NumberUtils.createLong("9223372036854775808");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateBigIntegerNullAndLargeValue() throws Exception {
        assertNull(NumberUtils.createBigInteger(null));
        assertEquals(new BigInteger("9223372036854775808"),
                NumberUtils.createBigInteger("9223372036854775808"));
    }

    @Test
    public void testCreateBigDecimalNullAndDecimalValue() throws Exception {
        assertNull(NumberUtils.createBigDecimal(null));
        assertEquals(new BigDecimal("1.25"), NumberUtils.createBigDecimal("1.25"));
        try {
            NumberUtils.createBigDecimal("");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testByteArrayEqualityBranches() throws Exception {
        assertTrue(NumberUtils.equals((byte[]) null, (byte[]) null));
        assertFalse(NumberUtils.equals(new byte[] {1}, null));
        assertFalse(NumberUtils.equals(new byte[] {1}, new byte[] {1, 2}));
        assertTrue(NumberUtils.equals(new byte[] {1, -1}, new byte[] {1, -1}));
        assertFalse(NumberUtils.equals(new byte[] {1, 2}, new byte[] {1, 3}));
    }

    @Test
    public void testLongArrayMinimum() throws Exception {
        assertEquals(-5L, NumberUtils.min(new long[] {4L, -5L, 2L}));
        assertEquals(7L, NumberUtils.min(new long[] {7L}));
    }

    @Test
    public void testLongArrayMaximum() throws Exception {
        assertEquals(9L, NumberUtils.max(new long[] {-2L, 9L, 3L}));
        assertEquals(-4L, NumberUtils.max(new long[] {-4L}));
    }

    @Test
    public void testDoubleCompareOrderAndEquality() throws Exception {
        assertEquals(-1, NumberUtils.compare(-1.0d, 1.0d));
        assertEquals(1, NumberUtils.compare(1.0d, -1.0d));
        assertEquals(0, NumberUtils.compare(2.0d, 2.0d));
    }

    @Test
    public void testDoubleCompareSignedZeroAndNaN() throws Exception {
        assertEquals(-1, NumberUtils.compare(-0.0d, 0.0d));
        assertEquals(1, NumberUtils.compare(Double.NaN, Double.POSITIVE_INFINITY));
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
    }

    @Test
    public void testIsDigitsBranches() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertTrue(NumberUtils.isDigits("0123"));
        assertFalse(NumberUtils.isDigits("12a"));
    }

    @Test
    public void testIsNumberIntegerHexAndSuffixForms() throws Exception {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertTrue(NumberUtils.isNumber("-0x1f"));
        assertFalse(NumberUtils.isNumber("0x"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertFalse(NumberUtils.isNumber("12e2L"));
    }

    @Test
    public void testIsNumberDecimalAndExponentBranches() throws Exception {
        assertTrue(NumberUtils.isNumber(".5"));
        assertTrue(NumberUtils.isNumber("1e-2"));
        assertTrue(NumberUtils.isNumber("1."));
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1..2"));
    }
}
```