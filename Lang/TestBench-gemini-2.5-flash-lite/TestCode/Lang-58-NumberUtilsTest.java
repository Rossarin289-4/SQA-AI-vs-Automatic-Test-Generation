package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.StringUtils;

public class NumberUtilsTest {

    @Test
    public void testStringToIntNull() throws Exception {
        assertEquals(0, NumberUtils.stringToInt(null));
    }

    @Test
    public void testStringToIntEmpty() throws Exception {
        assertEquals(0, NumberUtils.stringToInt(""));
    }

    @Test
    public void testStringToIntValid() throws Exception {
        assertEquals(123, NumberUtils.stringToInt("123"));
    }

    @Test
    public void testStringToIntInvalid() throws Exception {
        assertEquals(0, NumberUtils.stringToInt("abc"));
    }

    @Test
    public void testStringToIntWithDefaultNull() throws Exception {
        assertEquals(5, NumberUtils.stringToInt(null, 5));
    }

    @Test
    public void testStringToIntWithDefaultEmpty() throws Exception {
        assertEquals(5, NumberUtils.stringToInt("", 5));
    }

    @Test
    public void testStringToIntWithDefaultValid() throws Exception {
        assertEquals(123, NumberUtils.stringToInt("123", 5));
    }

    @Test
    public void testStringToIntWithDefaultInvalid() throws Exception {
        assertEquals(5, NumberUtils.stringToInt("abc", 5));
    }

    @Test
    public void testToIntNull() throws Exception {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToIntEmpty() throws Exception {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToIntValid() throws Exception {
        assertEquals(456, NumberUtils.toInt("456"));
    }

    @Test
    public void testToIntInvalid() throws Exception {
        assertEquals(0, NumberUtils.toInt("def"));
    }

    @Test
    public void testToIntWithDefaultNull() throws Exception {
        assertEquals(10, NumberUtils.toInt(null, 10));
    }

    @Test
    public void testToIntWithDefaultEmpty() throws Exception {
        assertEquals(10, NumberUtils.toInt("", 10));
    }

    @Test
    public void testToIntWithDefaultValid() throws Exception {
        assertEquals(456, NumberUtils.toInt("456", 10));
    }

    @Test
    public void testToIntWithDefaultInvalid() throws Exception {
        assertEquals(10, NumberUtils.toInt("def", 10));
    }
    
    @Test
    public void testToLongNull() throws Exception {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLongEmpty() throws Exception {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLongValid() throws Exception {
        assertEquals(12345L, NumberUtils.toLong("12345"));
    }

    @Test
    public void testToLongInvalid() throws Exception {
        assertEquals(0L, NumberUtils.toLong("ghi"));
    }

    @Test
    public void testToLongWithDefaultNull() throws Exception {
        assertEquals(100L, NumberUtils.toLong(null, 100L));
    }

    @Test
    public void testToLongWithDefaultEmpty() throws Exception {
        assertEquals(100L, NumberUtils.toLong("", 100L));
    }

    @Test
    public void testToLongWithDefaultValid() throws Exception {
        assertEquals(12345L, NumberUtils.toLong("12345", 100L));
    }

    @Test
    public void testToLongWithDefaultInvalid() throws Exception {
        assertEquals(100L, NumberUtils.toLong("ghi", 100L));
    }

    @Test
    public void testToFloatNull() throws Exception {
        assertNull(NumberUtils.toFloat(null));
    }

    @Test
    public void testToFloatEmpty() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat(""));
    }

    @Test
    public void testToFloatValid() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 1e-9f);
    }

    @Test
    public void testToFloatInvalid() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat("jkl"), 1e-9f);
    }
    
    @Test
    public void testToFloatWithDefaultNull() throws Exception {
        assertEquals(2.2f, NumberUtils.toFloat(null, 2.2f), 1e-9f);
    }

    @Test
    public void testToFloatWithDefaultEmpty() throws Exception {
        assertEquals(2.2f, NumberUtils.toFloat("", 2.2f), 1e-9f);
    }

    @Test
    public void testToFloatWithDefaultValid() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 2.2f), 1e-9f);
    }

    @Test
    public void testToFloatWithDefaultInvalid() throws Exception {
        assertEquals(2.2f, NumberUtils.toFloat("jkl", 2.2f), 1e-9f);
    }

    @Test
    public void testToDoubleNull() throws Exception {
        assertNull(NumberUtils.toDouble(null));
    }

    @Test
    public void testToDoubleEmpty() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble(""), 1e-9d);
    }

    @Test
    public void testToDoubleValid() throws Exception {
        assertEquals(3.14d, NumberUtils.toDouble("3.14"), 1e-9d);
    }

    @Test
    public void testToDoubleInvalid() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble("mno"), 1e-9d);
    }

    @Test
    public void testToDoubleWithDefaultNull() throws Exception {
        assertEquals(3.3d, NumberUtils.toDouble(null, 3.3d), 1e-9d);
    }

    @Test
    public void testToDoubleWithDefaultEmpty() throws Exception {
        assertEquals(3.3d, NumberUtils.toDouble("", 3.3d), 1e-9d);
    }

    @Test
    public void testToDoubleWithDefaultValid() throws Exception {
        assertEquals(3.14d, NumberUtils.toDouble("3.14", 3.3d), 1e-9d);
    }

    @Test
    public void testToDoubleWithDefaultInvalid() throws Exception {
        assertEquals(3.3d, NumberUtils.toDouble("mno", 3.3d), 1e-9d);
    }

    @Test
    public void testCreateNumberNull() throws Exception {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test
    public void testCreateNumberEmpty() throws Exception {
        try {
            NumberUtils.createNumber("");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateNumberInteger() throws Exception {
        Number num = NumberUtils.createNumber("123");
        assertTrue(num instanceof Integer);
        assertEquals(123, num.intValue());
    }
    
    @Test
    public void testCreateNumberLong() throws Exception {
        Number num = NumberUtils.createNumber("1234567890123");
        assertTrue(num instanceof Long);
        assertEquals(1234567890123L, num.longValue());
    }

    @Test
    public void testCreateNumberFloat() throws Exception {
        Number num = NumberUtils.createNumber("1.5f");
        assertTrue(num instanceof Float);
        assertEquals(1.5f, num.floatValue(), 1e-9f);
    }

    @Test
    public void testCreateNumberDouble() throws Exception {
        Number num = NumberUtils.createNumber("1.5d");
        assertTrue(num instanceof Double);
        assertEquals(1.5d, num.doubleValue(), 1e-9d);
    }
    
    @Test
    public void testCreateNumberHexInteger() throws Exception {
        Number num = NumberUtils.createNumber("0x1A");
        assertTrue(num instanceof Integer);
        assertEquals(26, num.intValue());
    }

    @Test
    public void testCreateNumberNegativeHexInteger() throws Exception {
        Number num = NumberUtils.createNumber("-0x1A");
        assertTrue(num instanceof Integer);
        assertEquals(-26, num.intValue());
    }

    @Test
    public void testCreateNumberBigDecimal() throws Exception {
        Number num = NumberUtils.createNumber("123.456");
        assertTrue(num instanceof BigDecimal);
        assertEquals(new BigDecimal("123.456"), num);
    }

    @Test
    public void testCreateNumberExpFloat() throws Exception {
        Number num = NumberUtils.createNumber("1.23E4f");
        assertTrue(num instanceof Float);
        assertEquals(12300.0f, num.floatValue(), 1e-9f);
    }

    @Test
    public void testCreateNumberExpDouble() throws Exception {
        Number num = NumberUtils.createNumber("1.23E4d");
        assertTrue(num instanceof Double);
        assertEquals(12300.0d, num.doubleValue(), 1e-9d);
    }

    @Test
    public void testCreateNumberExpBigDecimal() throws Exception {
        Number num = NumberUtils.createNumber("1.23E4");
        assertTrue(num instanceof BigDecimal);
        assertEquals(new BigDecimal("1.23E4"), num);
    }

    @Test
    public void testCreateNumberBigInteger() throws Exception {
        Number num = NumberUtils.createNumber("98765432109876543210");
        assertTrue(num instanceof BigInteger);
        assertEquals(new BigInteger("98765432109876543210"), num);
    }

    @Test
    public void testCreateNumberInvalidFormat() throws Exception {
        try {
            NumberUtils.createNumber("1.2.3");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateFloatNull() throws Exception {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloatValid() throws Exception {
        assertEquals(1.2f, NumberUtils.createFloat("1.2"), 1e-9f);
    }

    @Test
    public void testCreateFloatInvalid() throws Exception {
        try {
            NumberUtils.createFloat("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateDoubleNull() throws Exception {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDoubleValid() throws Exception {
        assertEquals(1.2d, NumberUtils.createDouble("1.2"), 1e-9d);
    }

    @Test
    public void testCreateDoubleInvalid() throws Exception {
        try {
            NumberUtils.createDouble("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateIntegerNull() throws Exception {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateIntegerValid() throws Exception {
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
    }

    @Test
    public void testCreateIntegerHex() throws Exception {
        assertEquals(Integer.valueOf(255), NumberUtils.createInteger("0xFF"));
    }
    
    @Test
    public void testCreateIntegerOctal() throws Exception {
        assertEquals(Integer.valueOf(511), NumberUtils.createInteger("0777"));
    }

    @Test
    public void testCreateIntegerInvalid() throws Exception {
        try {
            NumberUtils.createInteger("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateLongNull() throws Exception {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLongValid() throws Exception {
        assertEquals(Long.valueOf(12345L), NumberUtils.createLong("12345"));
    }

    @Test
    public void testCreateLongInvalid() throws Exception {
        try {
            NumberUtils.createLong("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateBigIntegerNull() throws Exception {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigIntegerValid() throws Exception {
        assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createBigInteger("12345678901234567890"));
    }

    @Test
    public void testCreateBigIntegerInvalid() throws Exception {
        try {
            NumberUtils.createBigInteger("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateBigDecimalNull() throws Exception {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test
    public void testCreateBigDecimalValid() throws Exception {
        assertEquals(new BigDecimal("123.456"), NumberUtils.createBigDecimal("123.456"));
    }

    @Test
    public void testCreateBigDecimalInvalid() throws Exception {
        try {
            NumberUtils.createBigDecimal("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateBigDecimalBlank() throws Exception {
        try {
            NumberUtils.createBigDecimal("");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testEqualsByteArrayNull() {
        assertFalse(NumberUtils.equals((byte[]) null, new byte[]{1}));
        assertFalse(NumberUtils.equals(new byte[]{1}, (byte[]) null));
        assertTrue(NumberUtils.equals((byte[]) null, null));
    }

    @Test
    public void testEqualsByteArrayDifferentLength() {
        assertFalse(NumberUtils.equals(new byte[]{1}, new byte[]{1, 2}));
    }

    @Test
    public void testEqualsByteArraySame() {
        assertTrue(NumberUtils.equals(new byte[]{1, 2}, new byte[]{1, 2}));
    }

    @Test
    public void testEqualsByteArrayDifferent() {
        assertFalse(NumberUtils.equals(new byte[]{1, 2}, new byte[]{1, 3}));
    }

    @Test
    public void testEqualsByteArrayEmpty() {
        assertTrue(NumberUtils.equals(new byte[]{}, new byte[]{}));
    }
    
    @Test
    public void testMinLongArrayValid() {
        assertEquals(-5L, NumberUtils.min(new long[]{-5L, 0L, 5L}));
    }

    @Test
    public void testMinLongArraySingleElement() {
        assertEquals(5L, NumberUtils.min(new long[]{5L}));
    }

    @Test
    public void testMinLongArrayAllSame() {
        assertEquals(5L, NumberUtils.min(new long[]{5L, 5L, 5L}));
    }

    @Test
    public void testMinLongArrayNegative() {
        assertEquals(-10L, NumberUtils.min(new long[]{-5L, -10L, -2L}));
    }

    @Test
    public void testMinLongArrayExceptions() {
        try {
            NumberUtils.min((long[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.min(new long[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testMinIntArrayValid() {
        assertEquals(-5, NumberUtils.min(new int[]{-5, 0, 5}));
    }

    @Test
    public void testMinIntArraySingleElement() {
        assertEquals(5, NumberUtils.min(new int[]{5}));
    }

    @Test
    public void testMinIntArrayAllSame() {
        assertEquals(5, NumberUtils.min(new int[]{5, 5, 5}));
    }
    
    @Test
    public void testMinIntArrayNegative() {
        assertEquals(-10, NumberUtils.min(new int[]{-5, -10, -2}));
    }

    @Test
    public void testMinIntArrayExceptions() {
        try {
            NumberUtils.min((int[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.min(new int[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testMinShortArrayValid() {
        assertEquals((short)-5, NumberUtils.min(new short[]{(short)-5, 0, 5}));
    }

    @Test
    public void testMinShortArraySingleElement() {
        assertEquals((short)5, NumberUtils.min(new short[]{5}));
    }

    @Test
    public void testMinShortArrayAllSame() {
        assertEquals((short)5, NumberUtils.min(new short[]{5, 5, 5}));
    }
    
    @Test
    public void testMinShortArrayNegative() {
        assertEquals((short)-10, NumberUtils.min(new short[]{(short)-5, (short)-10, (short)-2}));
    }

    @Test
    public void testMinShortArrayExceptions() {
        try {
            NumberUtils.min((short[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.min(new short[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testMinByteArrayValid() {
        assertEquals((byte)-5, NumberUtils.min(new byte[]{(byte)-5, 0, 5}));
    }

    @Test
    public void testMinByteArraySingleElement() {
        assertEquals((byte)5, NumberUtils.min(new byte[]{5}));
    }

    @Test
    public void testMinByteArrayAllSame() {
        assertEquals((byte)5, NumberUtils.min(new byte[]{5, 5, 5}));
    }
    
    @Test
    public void testMinByteArrayNegative() {
        assertEquals((byte)-10, NumberUtils.min(new byte[]{(byte)-5, (byte)-10, (byte)-2}));
    }

    @Test
    public void testMinByteArrayExceptions() {
        try {
            NumberUtils.min((byte[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.min(new byte[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testMinDoubleArrayValid() {
        assertEquals(-5.5, NumberUtils.min(new double[]{-5.5, 0.0, 5.5}), 1e-9);
    }

    @Test
    public void testMinDoubleArraySingleElement() {
        assertEquals(5.5, NumberUtils.min(new double[]{5.5}), 1e-9);
    }

    @Test
    public void testMinDoubleArrayAllSame() {
        assertEquals(5.5, NumberUtils.min(new double[]{5.5, 5.5, 5.5}), 1e-9);
    }
    
    @Test
    public void testMinDoubleArrayNegative() {
        assertEquals(-10.5, NumberUtils.min(new double[]{-5.5, -10.5, -2.5}), 1e-9);
    }

    @Test
    public void testMinDoubleArrayExceptions() {
        try {
            NumberUtils.min((double[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.min(new double[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testMinFloatArrayValid() {
        assertEquals(-5.5f, NumberUtils.min(new float[]{-5.5f, 0.0f, 5.5f}), 1e-9f);
    }

    @Test
    public void testMinFloatArraySingleElement() {
        assertEquals(5.5f, NumberUtils.min(new float[]{5.5f}), 1e-9f);
    }

    @Test
    public void testMinFloatArrayAllSame() {
        assertEquals(5.5f, NumberUtils.min(new float[]{5.5f, 5.5f, 5.5f}), 1e-9f);
    }
    
    @Test
    public void testMinFloatArrayNegative() {
        assertEquals(-10.5f, NumberUtils.min(new float[]{-5.5f, -10.5f, -2.5f}), 1e-9f);
    }

    @Test
    public void testMinFloatArrayExceptions() {
        try {
            NumberUtils.min((float[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.min(new float[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testMaxLongArrayValid() {
        assertEquals(5L, NumberUtils.max(new long[]{-5L, 0L, 5L}));
    }

    @Test
    public void testMaxLongArraySingleElement() {
        assertEquals(5L, NumberUtils.max(new long[]{5L}));
    }

    @Test
    public void testMaxLongArrayAllSame() {
        assertEquals(5L, NumberUtils.max(new long[]{5L, 5L, 5L}));
    }
    
    @Test
    public void testMaxLongArrayNegative() {
        assertEquals(-2L, NumberUtils.max(new long[]{-5L, -10L, -2L}));
    }

    @Test
    public void testMaxLongArrayExceptions() {
        try {
            NumberUtils.max((long[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.max(new long[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testMaxIntArrayValid() {
        assertEquals(5, NumberUtils.max(new int[]{-5, 0, 5}));
    }

    @Test
    public void testMaxIntArraySingleElement() {
        assertEquals(5, NumberUtils.max(new int[]{5}));
    }

    @Test
    public void testMaxIntArrayAllSame() {
        assertEquals(5, NumberUtils.max(new int[]{5, 5, 5}));
    }
    
    @Test
    public void testMaxIntArrayNegative() {
        assertEquals(-2, NumberUtils.max(new int[]{-5, -10, -2}));
    }

    @Test
    public void testMaxIntArrayExceptions() {
        try {
            NumberUtils.max((int[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.max(new int[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testMaxShortArrayValid() {
        assertEquals((short)5, NumberUtils.max(new short[]{(short)-5, 0, 5}));
    }

    @Test
    public void testMaxShortArraySingleElement() {
        assertEquals((short)5, NumberUtils.max(new short[]{5}));
    }

    @Test
    public void testMaxShortArrayAllSame() {
        assertEquals((short)5, NumberUtils.max(new short[]{5, 5, 5}));
    }
    
    @Test
    public void testMaxShortArrayNegative() {
        assertEquals((short)-2, NumberUtils.max(new short[]{(short)-5, (short)-10, (short)-2}));
    }

    @Test
    public void testMaxShortArrayExceptions() {
        try {
            NumberUtils.max((short[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.max(new short[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testMaxByteArrayValid() {
        assertEquals((byte)5, NumberUtils.max(new byte[]{(byte)-5, 0, 5}));
    }

    @Test
    public void testMaxByteArraySingleElement() {
        assertEquals((byte)5, NumberUtils.max(new byte[]{5}));
    }

    @Test
    public void testMaxByteArrayAllSame() {
        assertEquals((byte)5, NumberUtils.max(new byte[]{5, 5, 5}));
    }
    
    @Test
    public void testMaxByteArrayNegative() {
        assertEquals((byte)-2, NumberUtils.max(new byte[]{(byte)-5, (byte)-10, (byte)-2}));
    }

    @Test
    public void testMaxByteArrayExceptions() {
        try {
            NumberUtils.max((byte[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.max(new byte[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testMaxDoubleArrayValid() {
        assertEquals(5.5, NumberUtils.max(new double[]{-5.5, 0.0, 5.5}), 1e-9);
    }

    @Test
    public void testMaxDoubleArraySingleElement() {
        assertEquals(5.5, NumberUtils.max(new double[]{5.5}), 1e-9);
    }

    @Test
    public void testMaxDoubleArrayAllSame() {
        assertEquals(5.5, NumberUtils.max(new double[]{5.5, 5.5, 5.5}), 1e-9);
    }
    
    @Test
    public void testMaxDoubleArrayNegative() {
        assertEquals(-2.5, NumberUtils.max(new double[]{-5.5, -10.5, -2.5}), 1e-9);
    }

    @Test
    public void testMaxDoubleArrayExceptions() {
        try {
            NumberUtils.max((double[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.max(new double[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testMaxFloatArrayValid() {
        assertEquals(5.5f, NumberUtils.max(new float[]{-5.5f, 0.0f, 5.5f}), 1e-9f);
    }

    @Test
    public void testMaxFloatArraySingleElement() {
        assertEquals(5.5f, NumberUtils.max(new float[]{5.5f}), 1e-9f);
    }

    @Test
    public void testMaxFloatArrayAllSame() {
        assertEquals(5.5f, NumberUtils.max(new float[]{5.5f, 5.5f, 5.5f}), 1e-9f);
    }
    
    @Test
    public void testMaxFloatArrayNegative() {
        assertEquals(-2.5f, NumberUtils.max(new float[]{-5.5f, -10.5f, -2.5f}), 1e-9f);
    }

    @Test
    public void testMaxFloatArrayExceptions() {
        try {
            NumberUtils.max((float[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
        try {
            NumberUtils.max(new float[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testCompareDoublesEqual() {
        assertEquals(0, NumberUtils.compare(1.0, 1.0));
    }

    @Test
    public void testCompareDoublesLess() {
        assertEquals(-1, NumberUtils.compare(1.0, 2.0));
    }

    @Test
    public void testCompareDoublesGreater() {
        assertEquals(1, NumberUtils.compare(2.0, 1.0));
    }

    @Test
    public void testCompareDoublesNaN() {
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
    }

    @Test
    public void testCompareDoublesNaNAndValue() {
        assertEquals(1, NumberUtils.compare(Double.NaN, 1.0));
        assertEquals(-1, NumberUtils.compare(1.0, Double.NaN));
    }

    @Test
    public void testCompareDoublesPositiveInfinity() {
        assertEquals(0, NumberUtils.compare(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
        assertEquals(-1, NumberUtils.compare(Double.POSITIVE_INFINITY, 1.0));
        assertEquals(1, NumberUtils.compare(1.0, Double.POSITIVE_INFINITY));
    }

    @Test
    public void testCompareDoublesNegativeInfinity() {
        assertEquals(0, NumberUtils.compare(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY));
        assertEquals(1, NumberUtils.compare(Double.NEGATIVE_INFINITY, -1.0));
        assertEquals(-1, NumberUtils.compare(-1.0, Double.NEGATIVE_INFINITY));
    }
    
    @Test
    public void testCompareDoublesZero() {
        assertEquals(0, NumberUtils.compare(0.0, 0.0));
        assertEquals(0, NumberUtils.compare(-0.0, -0.0));
        assertEquals(0, NumberUtils.compare(0.0, -0.0)); // Standard behavior
    }

    @Test
    public void testCompareFloatsEqual() {
        assertEquals(0, NumberUtils.compare(1.0f, 1.0f));
    }

    @Test
    public void testCompareFloatsLess() {
        assertEquals(-1, NumberUtils.compare(1.0f, 2.0f));
    }

    @Test
    public void testCompareFloatsGreater() {
        assertEquals(1, NumberUtils.compare(2.0f, 1.0f));
    }

    @Test
    public void testCompareFloatsNaN() {
        assertEquals(0, NumberUtils.compare(Float.NaN, Float.NaN));
    }

    @Test
    public void testCompareFloatsNaNAndValue() {
        assertEquals(1, NumberUtils.compare(Float.NaN, 1.0f));
        assertEquals(-1, NumberUtils.compare(1.0f, Float.NaN));
    }

    @Test
    public void testCompareFloatsPositiveInfinity() {
        assertEquals(0, NumberUtils.compare(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
        assertEquals(-1, NumberUtils.compare(Float.POSITIVE_INFINITY, 1.0f));
        assertEquals(1, NumberUtils.compare(1.0f, Float.POSITIVE_INFINITY));
    }

    @Test
    public void testCompareFloatsNegativeInfinity() {
        assertEquals(0, NumberUtils.compare(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY));
        assertEquals(1, NumberUtils.compare(Float.NEGATIVE_INFINITY, -1.0f));
        assertEquals(-1, NumberUtils.compare(-1.0f, Float.NEGATIVE_INFINITY));
    }
    
    @Test
    public void testCompareFloatsZero() {
        assertEquals(0, NumberUtils.compare(0.0f, 0.0f));
        assertEquals(0, NumberUtils.compare(-0.0f, -0.0f));
        assertEquals(0, NumberUtils.compare(0.0f, -0.0f)); // Standard behavior
    }

    @Test
    public void testIsDigitsNull() {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigitsEmpty() {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigitsValid() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigitsWithLetters() {
        assertFalse(NumberUtils.isDigits("123a"));
    }

    @Test
    public void testIsDigitsWithSymbols() {
        assertFalse(NumberUtils.isDigits("123-"));
    }

    @Test
    public void testIsNumberNull() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumberEmpty() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumberInteger() {
        assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumberDouble() {
        assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumberExpFloat() {
        assertTrue(NumberUtils.isNumber("1.23E4f"));
    }

    @Test
    public void testIsNumberExpDouble() {
        assertTrue(NumberUtils.isNumber("1.23E4d"));
    }

    @Test
    public void testIsNumberExpInteger() {
        assertTrue(NumberUtils.isNumber("123E4"));
    }

    @Test
    public void testIsNumberHex() {
        assertTrue(NumberUtils.isNumber("0x1A"));
    }

    @Test
    public void testIsNumberNegativeHex() {
        assertTrue(NumberUtils.isNumber("-0x1A"));
    }

    @Test
    public void testIsNumberLongSuffix() {
        assertTrue(NumberUtils.isNumber("123L"));
    }
    
    @Test
    public void testIsNumberFloatSuffix() {
        assertTrue(NumberUtils.isNumber("123F"));
    }

    @Test
    public void testIsNumberDoubleSuffix() {
        assertTrue(NumberUtils.isNumber("123D"));
    }

    @Test
    public void testIsNumberInvalidChars() {
        assertFalse(NumberUtils.isNumber("123G"));
    }

    @Test
    public void testIsNumberInvalidFormatDouble() {
        assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void testIsNumberInvalidFormatExp() {
        assertFalse(NumberUtils.isNumber("12E3E4"));
    }

    @Test
    public void testIsNumberOnlySign() {
        assertFalse(NumberUtils.isNumber("+"));
        assertFalse(NumberUtils.isNumber("-"));
    }
    
    @Test
    public void testIsNumberExpWithSign() {
        assertTrue(NumberUtils.isNumber("1E+10"));
        assertTrue(NumberUtils.isNumber("1E-10"));
    }

    @Test
    public void testIsNumberWithDecimalAndExp() {
        assertTrue(NumberUtils.isNumber("1.2E3"));
    }

    @Test
    public void testIsNumberWithOnlyExp() {
        assertFalse(NumberUtils.isNumber("E10"));
    }
    
    @Test
    public void testIsNumberHexOnly() {
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
    }
}
