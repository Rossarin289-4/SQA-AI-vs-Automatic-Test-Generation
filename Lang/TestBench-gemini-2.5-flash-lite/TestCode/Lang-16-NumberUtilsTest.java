package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {

    /**
     * Tests {@link NumberUtils#toInt(String)}.
     */
    @Test
    public void testToInt_NullString() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    /**
     * Tests {@link NumberUtils#toInt(String)}.
     */
    @Test
    public void testToInt_EmptyString() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    /**
     * Tests {@link NumberUtils#toInt(String)}.
     */
    @Test
    public void testToInt_ValidString() {
        assertEquals(1, NumberUtils.toInt("1"));
    }

    /**
     * Tests {@link NumberUtils#toInt(String, int)}.
     */
    @Test
    public void testToInt_Default_NullString() {
        assertEquals(10, NumberUtils.toInt(null, 10));
    }

    /**
     * Tests {@link NumberUtils#toInt(String, int)}.
     */
    @Test
    public void testToInt_Default_EmptyString() {
        assertEquals(10, NumberUtils.toInt("", 10));
    }

    /**
     * Tests {@link NumberUtils#toInt(String, int)}.
     */
    @Test
    public void testToInt_Default_ValidString() {
        assertEquals(1, NumberUtils.toInt("1", 10));
    }

    /**
     * Tests {@link NumberUtils#toInt(String, int)} with invalid number.
     */
    @Test
    public void testToInt_Default_InvalidString() {
        assertEquals(10, NumberUtils.toInt("abc", 10));
    }

    /**
     * Tests {@link NumberUtils#toLong(String)}.
     */
    @Test
    public void testToLong_NullString() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    /**
     * Tests {@link NumberUtils#toLong(String)}.
     */
    @Test
    public void testToLong_EmptyString() {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    /**
     * Tests {@link NumberUtils#toLong(String)}.
     */
    @Test
    public void testToLong_ValidString() {
        assertEquals(1L, NumberUtils.toLong("1"));
    }

    /**
     * Tests {@link NumberUtils#toLong(String, long)}.
     */
    @Test
    public void testToLong_Default_NullString() {
        assertEquals(10L, NumberUtils.toLong(null, 10L));
    }

    /**
     * Tests {@link NumberUtils#toLong(String, long)}.
     */
    @Test
    public void testToLong_Default_EmptyString() {
        assertEquals(10L, NumberUtils.toLong("", 10L));
    }

    /**
     * Tests {@link NumberUtils#toLong(String, long)}.
     */
    @Test
    public void testToLong_Default_ValidString() {
        assertEquals(1L, NumberUtils.toLong("1", 10L));
    }

    /**
     * Tests {@link NumberUtils#toLong(String, long)} with invalid number.
     */
    @Test
    public void testToLong_Default_InvalidString() {
        assertEquals(10L, NumberUtils.toLong("abc", 10L));
    }

    /**
     * Tests {@link NumberUtils#toFloat(String)}.
     */
    @Test
    public void testToFloat_NullString() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#toFloat(String)}.
     */
    @Test
    public void testToFloat_EmptyString() {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#toFloat(String)}.
     */
    @Test
    public void testToFloat_ValidString() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#toFloat(String, float)}.
     */
    @Test
    public void testToFloat_Default_NullString() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#toFloat(String, float)}.
     */
    @Test
    public void testToFloat_Default_EmptyString() {
        assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#toFloat(String, float)}.
     */
    @Test
    public void testToFloat_Default_ValidString() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#toFloat(String, float)} with invalid number.
     */
    @Test
    public void testToFloat_Default_InvalidString() {
        assertEquals(1.1f, NumberUtils.toFloat("abc", 1.1f), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#toDouble(String)}.
     */
    @Test
    public void testToDouble_NullString() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#toDouble(String)}.
     */
    @Test
    public void testToDouble_EmptyString() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#toDouble(String)}.
     */
    @Test
    public void testToDouble_ValidString() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#toDouble(String, double)}.
     */
    @Test
    public void testToDouble_Default_NullString() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#toDouble(String, double)}.
     */
    @Test
    public void testToDouble_Default_EmptyString() {
        assertEquals(1.1d, NumberUtils.toDouble("", 1.1d), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#toDouble(String, double)}.
     */
    @Test
    public void testToDouble_Default_ValidString() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#toDouble(String, double)} with invalid number.
     */
    @Test
    public void testToDouble_Default_InvalidString() {
        assertEquals(1.1d, NumberUtils.toDouble("abc", 1.1d), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#toByte(String)}.
     */
    @Test
    public void testToByte_NullString() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    /**
     * Tests {@link NumberUtils#toByte(String)}.
     */
    @Test
    public void testToByte_EmptyString() {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    /**
     * Tests {@link NumberUtils#toByte(String)}.
     */
    @Test
    public void testToByte_ValidString() {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    /**
     * Tests {@link NumberUtils#toByte(String, byte)}.
     */
    @Test
    public void testToByte_Default_NullString() {
        assertEquals((byte) 10, NumberUtils.toByte(null, (byte) 10));
    }

    /**
     * Tests {@link NumberUtils#toByte(String, byte)}.
     */
    @Test
    public void testToByte_Default_EmptyString() {
        assertEquals((byte) 10, NumberUtils.toByte("", (byte) 10));
    }

    /**
     * Tests {@link NumberUtils#toByte(String, byte)}.
     */
    @Test
    public void testToByte_Default_ValidString() {
        assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 10));
    }

    /**
     * Tests {@link NumberUtils#toByte(String, byte)} with invalid number.
     */
    @Test
    public void testToByte_Default_InvalidString() {
        assertEquals((byte) 10, NumberUtils.toByte("abc", (byte) 10));
    }

    /**
     * Tests {@link NumberUtils#toShort(String)}.
     */
    @Test
    public void testToShort_NullString() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    /**
     * Tests {@link NumberUtils#toShort(String)}.
     */
    @Test
    public void testToShort_EmptyString() {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    /**
     * Tests {@link NumberUtils#toShort(String)}.
     */
    @Test
    public void testToShort_ValidString() {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    /**
     * Tests {@link NumberUtils#toShort(String, short)}.
     */
    @Test
    public void testToShort_Default_NullString() {
        assertEquals((short) 10, NumberUtils.toShort(null, (short) 10));
    }

    /**
     * Tests {@link NumberUtils#toShort(String, short)}.
     */
    @Test
    public void testToShort_Default_EmptyString() {
        assertEquals((short) 10, NumberUtils.toShort("", (short) 10));
    }

    /**
     * Tests {@link NumberUtils#toShort(String, short)}.
     */
    @Test
    public void testToShort_Default_ValidString() {
        assertEquals((short) 1, NumberUtils.toShort("1", (short) 10));
    }

    /**
     * Tests {@link NumberUtils#toShort(String, short)} with invalid number.
     */
    @Test
    public void testToShort_Default_InvalidString() {
        assertEquals((short) 10, NumberUtils.toShort("abc", (short) 10));
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} with null input.
     */
    @Test
    public void testCreateNumber_NullString() {
        assertNull(NumberUtils.createNumber(null));
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} with blank input.
     */
    @Test
    public void testCreateNumber_BlankString() {
        try {
            NumberUtils.createNumber("");
            fail("Expected NumberFormatException for blank string");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} with hex input.
     */
    @Test
    public void testCreateNumber_HexInput() {
        Number num = NumberUtils.createNumber("0x1A");
        assertTrue(num instanceof Integer);
        assertEquals(26, num.intValue());
    }
    
    /**
     * Tests {@link NumberUtils#createNumber(String)} with negative hex input.
     */
    @Test
    public void testCreateNumber_NegativeHexInput() {
        Number num = NumberUtils.createNumber("-0x1A");
        assertTrue(num instanceof Integer);
        assertEquals(-26, num.intValue());
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} with float type suffix.
     */
    @Test
    public void testCreateNumber_FloatSuffix() {
        Number num = NumberUtils.createNumber("1.5f");
        assertTrue(num instanceof Float);
        assertEquals(1.5f, num.floatValue(), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} with double type suffix.
     */
    @Test
    public void testCreateNumber_DoubleSuffix() {
        Number num = NumberUtils.createNumber("1.5d");
        assertTrue(num instanceof Double);
        assertEquals(1.5d, num.doubleValue(), 0.0d);
    }
    
    /**
     * Tests {@link NumberUtils#createNumber(String)} with Long type suffix.
     */
    @Test
    public void testCreateNumber_LongSuffix() {
        Number num = NumberUtils.createNumber("123456789012345L");
        assertTrue(num instanceof Long);
        assertEquals(123456789012345L, num.longValue());
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} with BigDecimal.
     */
    @Test
    public void testCreateNumber_BigDecimal() {
        Number num = NumberUtils.createNumber("1.5E7");
        assertTrue(num instanceof BigDecimal);
        assertEquals(new BigDecimal("1.5E7"), num);
    }
    
    /**
     * Tests {@link NumberUtils#createNumber(String)} with BigInteger.
     */
    @Test
    public void testCreateNumber_BigInteger() {
        Number num = NumberUtils.createNumber("12345678901234567890");
        assertTrue(num instanceof BigInteger);
        assertEquals(new BigInteger("12345678901234567890"), num);
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} with invalid number format.
     */
    @Test
    public void testCreateNumber_InvalidFormat() {
        try {
            NumberUtils.createNumber("1.2.3");
            fail("Expected NumberFormatException for invalid format");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} with only a minus sign.
     */
    @Test
    public void testCreateNumber_OnlyMinus() {
        try {
            NumberUtils.createNumber("-");
            fail("Expected NumberFormatException for '-'");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} with only a plus sign.
     */
    @Test
    public void testCreateNumber_OnlyPlus() {
        try {
            NumberUtils.createNumber("+");
            fail("Expected NumberFormatException for '+'");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} with scientific notation and no digits.
     */
    @Test
    public void testCreateNumber_ScientificNoDigits() {
        try {
            NumberUtils.createNumber("1E");
            fail("Expected NumberFormatException for '1E'");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    /**
     * Tests {@link NumberUtils#createFloat(String)}.
     */
    @Test
    public void testCreateFloat_Null() {
        assertNull(NumberUtils.createFloat(null));
    }

    /**
     * Tests {@link NumberUtils#createFloat(String)}.
     */
    @Test
    public void testCreateFloat_Valid() {
        assertEquals(Float.valueOf("1.23"), NumberUtils.createFloat("1.23"));
    }

    /**
     * Tests {@link NumberUtils#createDouble(String)}.
     */
    @Test
    public void testCreateDouble_Null() {
        assertNull(NumberUtils.createDouble(null));
    }

    /**
     * Tests {@link NumberUtils#createDouble(String)}.
     */
    @Test
    public void testCreateDouble_Valid() {
        assertEquals(Double.valueOf("1.23"), NumberUtils.createDouble("1.23"));
    }

    /**
     * Tests {@link NumberUtils#createInteger(String)}.
     */
    @Test
    public void testCreateInteger_Null() {
        assertNull(NumberUtils.createInteger(null));
    }

    /**
     * Tests {@link NumberUtils#createInteger(String)}.
     * The Integer.decode() method handles "0x" prefixes correctly.
     */
    @Test
    public void testCreateInteger_ValidHex() {
        assertEquals(Integer.valueOf(26), NumberUtils.createInteger("0x1A"));
    }

    /**
     * Tests {@link NumberUtils#createLong(String)}.
     */
    @Test
    public void testCreateLong_Null() {
        assertNull(NumberUtils.createLong(null));
    }

    /**
     * Tests {@link NumberUtils#createLong(String)}.
     */
    @Test
    public void testCreateLong_Valid() {
        assertEquals(Long.valueOf("123456789"), NumberUtils.createLong("123456789"));
    }

    /**
     * Tests {@link NumberUtils#createBigInteger(String)}.
     */
    @Test
    public void testCreateBigInteger_Null() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    /**
     * Tests {@link NumberUtils#createBigInteger(String)}.
     */
    @Test
    public void testCreateBigInteger_Valid() {
        assertEquals(new BigInteger("98765432109876543210"), NumberUtils.createBigInteger("98765432109876543210"));
    }

    /**
     * Tests {@link NumberUtils#createBigDecimal(String)}.
     */
    @Test
    public void testCreateBigDecimal_Null() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    /**
     * Tests {@link NumberUtils#createBigDecimal(String)}.
     */
    @Test
    public void testCreateBigDecimal_Valid() {
        assertEquals(new BigDecimal("123.456"), NumberUtils.createBigDecimal("123.456"));
    }

    /**
     * Tests {@link NumberUtils#createBigDecimal(String)} with blank string.
     */
    @Test
    public void testCreateBigDecimal_BlankString() {
        try {
            NumberUtils.createBigDecimal("");
            fail("Expected NumberFormatException for blank string");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    /**
     * Tests {@link NumberUtils#min(long[])}.
     */
    @Test
    public void testMin_longArray() {
        assertEquals(1L, NumberUtils.min(new long[]{5L, 1L, 3L}));
    }

    /**
     * Tests {@link NumberUtils#min(long[])} with single element.
     */
    @Test
    public void testMin_longArray_singleElement() {
        assertEquals(5L, NumberUtils.min(new long[]{5L}));
    }

    /**
     * Tests {@link NumberUtils#min(long[])} with negative numbers.
     */
    @Test
    public void testMin_longArray_negative() {
        assertEquals(-5L, NumberUtils.min(new long[]{-1L, -5L, -3L}));
    }

    /**
     * Tests {@link NumberUtils#min(int[])}.
     */
    @Test
    public void testMin_intArray() {
        assertEquals(1, NumberUtils.min(new int[]{5, 1, 3}));
    }

    /**
     * Tests {@link NumberUtils#min(int[])} with single element.
     */
    @Test
    public void testMin_intArray_singleElement() {
        assertEquals(5, NumberUtils.min(new int[]{5}));
    }

    /**
     * Tests {@link NumberUtils#min(int[])} with negative numbers.
     */
    @Test
    public void testMin_intArray_negative() {
        assertEquals(-5, NumberUtils.min(new int[]{-1, -5, -3}));
    }

    /**
     * Tests {@link NumberUtils#min(short[])}.
     */
    @Test
    public void testMin_shortArray() {
        assertEquals((short) 1, NumberUtils.min(new short[]{(short) 5, (short) 1, (short) 3}));
    }

    /**
     * Tests {@link NumberUtils#min(short[])} with single element.
     */
    @Test
    public void testMin_shortArray_singleElement() {
        assertEquals((short) 5, NumberUtils.min(new short[]{(short) 5}));
    }

    /**
     * Tests {@link NumberUtils#min(short[])} with negative numbers.
     */
    @Test
    public void testMin_shortArray_negative() {
        assertEquals((short) -5, NumberUtils.min(new short[]{(short) -1, (short) -5, (short) -3}));
    }

    /**
     * Tests {@link NumberUtils#min(byte[])}.
     */
    @Test
    public void testMin_byteArray() {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 5, (byte) 1, (byte) 3}));
    }

    /**
     * Tests {@link NumberUtils#min(byte[])} with single element.
     */
    @Test
    public void testMin_byteArray_singleElement() {
        assertEquals((byte) 5, NumberUtils.min(new byte[]{(byte) 5}));
    }

    /**
     * Tests {@link NumberUtils#min(byte[])} with negative numbers.
     */
    @Test
    public void testMin_byteArray_negative() {
        assertEquals((byte) -5, NumberUtils.min(new byte[]{(byte) -1, (byte) -5, (byte) -3}));
    }

    /**
     * Tests {@link NumberUtils#min(double[])}.
     */
    @Test
    public void testMin_doubleArray() {
        assertEquals(1.0d, NumberUtils.min(new double[]{5.0d, 1.0d, 3.0d}), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#min(double[])} with NaN.
     */
    @Test
    public void testMin_doubleArray_NaN() {
        assertEquals(Double.NaN, NumberUtils.min(new double[]{5.0d, Double.NaN, 3.0d}), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#min(double[])} with negative numbers.
     */
    @Test
    public void testMin_doubleArray_negative() {
        assertEquals(-5.0d, NumberUtils.min(new double[]{-1.0d, -5.0d, -3.0d}), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#min(float[])}.
     */
    @Test
    public void testMin_floatArray() {
        assertEquals(1.0f, NumberUtils.min(new float[]{5.0f, 1.0f, 3.0f}), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#min(float[])} with NaN.
     */
    @Test
    public void testMin_floatArray_NaN() {
        assertEquals(Float.NaN, NumberUtils.min(new float[]{5.0f, Float.NaN, 3.0f}), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#min(float[])} with negative numbers.
     */
    @Test
    public void testMin_floatArray_negative() {
        assertEquals(-5.0f, NumberUtils.min(new float[]{-1.0f, -5.0f, -3.0f}), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#max(long[])}.
     */
    @Test
    public void testMax_longArray() {
        assertEquals(5L, NumberUtils.max(new long[]{1L, 5L, 3L}));
    }

    /**
     * Tests {@link NumberUtils#max(long[])} with single element.
     */
    @Test
    public void testMax_longArray_singleElement() {
        assertEquals(5L, NumberUtils.max(new long[]{5L}));
    }

    /**
     * Tests {@link NumberUtils#max(long[])} with negative numbers.
     */
    @Test
    public void testMax_longArray_negative() {
        assertEquals(-1L, NumberUtils.max(new long[]{-5L, -1L, -3L}));
    }

    /**
     * Tests {@link NumberUtils#max(int[])}.
     */
    @Test
    public void testMax_intArray() {
        assertEquals(5, NumberUtils.max(new int[]{1, 5, 3}));
    }

    /**
     * Tests {@link NumberUtils#max(int[])} with single element.
     */
    @Test
    public void testMax_intArray_singleElement() {
        assertEquals(5, NumberUtils.max(new int[]{5}));
    }

    /**
     * Tests {@link NumberUtils#max(int[])} with negative numbers.
     */
    @Test
    public void testMax_intArray_negative() {
        assertEquals(-1, NumberUtils.max(new int[]{-5, -1, -3}));
    }

    /**
     * Tests {@link NumberUtils#max(short[])}.
     */
    @Test
    public void testMax_shortArray() {
        assertEquals((short) 5, NumberUtils.max(new short[]{(short) 1, (short) 5, (short) 3}));
    }

    /**
     * Tests {@link NumberUtils#max(short[])} with single element.
     */
    @Test
    public void testMax_shortArray_singleElement() {
        assertEquals((short) 5, NumberUtils.max(new short[]{(short) 5}));
    }

    /**
     * Tests {@link NumberUtils#max(short[])} with negative numbers.
     */
    @Test
    public void testMax_shortArray_negative() {
        assertEquals((short) -1, NumberUtils.max(new short[]{(short) -5, (short) -1, (short) -3}));
    }

    /**
     * Tests {@link NumberUtils#max(byte[])}.
     */
    @Test
    public void testMax_byteArray() {
        assertEquals((byte) 5, NumberUtils.max(new byte[]{(byte) 1, (byte) 5, (byte) 3}));
    }

    /**
     * Tests {@link NumberUtils#max(byte[])} with single element.
     */
    @Test
    public void testMax_byteArray_singleElement() {
        assertEquals((byte) 5, NumberUtils.max(new byte[]{(byte) 5}));
    }

    /**
     * Tests {@link NumberUtils#max(byte[])} with negative numbers.
     */
    @Test
    public void testMax_byteArray_negative() {
        assertEquals((byte) -1, NumberUtils.max(new byte[]{(byte) -5, (byte) -1, (byte) -3}));
    }

    /**
     * Tests {@link NumberUtils#max(double[])}.
     */
    @Test
    public void testMax_doubleArray() {
        assertEquals(5.0d, NumberUtils.max(new double[]{1.0d, 5.0d, 3.0d}), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#max(double[])} with NaN.
     */
    @Test
    public void testMax_doubleArray_NaN() {
        assertEquals(Double.NaN, NumberUtils.max(new double[]{1.0d, Double.NaN, 3.0d}), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#max(double[])} with negative numbers.
     */
    @Test
    public void testMax_doubleArray_negative() {
        assertEquals(-1.0d, NumberUtils.max(new double[]{-5.0d, -1.0d, -3.0d}), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#max(float[])}.
     */
    @Test
    public void testMax_floatArray() {
        assertEquals(5.0f, NumberUtils.max(new float[]{1.0f, 5.0f, 3.0f}), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#max(float[])} with NaN.
     */
    @Test
    public void testMax_floatArray_NaN() {
        assertEquals(Float.NaN, NumberUtils.max(new float[]{1.0f, Float.NaN, 3.0f}), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#max(float[])} with negative numbers.
     */
    @Test
    public void testMax_floatArray_negative() {
        assertEquals(-1.0f, NumberUtils.max(new float[]{-5.0f, -1.0f, -3.0f}), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#min(long, long, long)}.
     */
    @Test
    public void testMin_threeLongs() {
        assertEquals(1L, NumberUtils.min(5L, 1L, 3L));
    }

    /**
     * Tests {@link NumberUtils#min(int, int, int)}.
     */
    @Test
    public void testMin_threeInts() {
        assertEquals(1, NumberUtils.min(5, 1, 3));
    }

    /**
     * Tests {@link NumberUtils#min(short, short, short)}.
     */
    @Test
    public void testMin_threeShorts() {
        assertEquals((short) 1, NumberUtils.min((short) 5, (short) 1, (short) 3));
    }

    /**
     * Tests {@link NumberUtils#min(byte, byte, byte)}.
     */
    @Test
    public void testMin_threeBytes() {
        assertEquals((byte) 1, NumberUtils.min((byte) 5, (byte) 1, (byte) 3));
    }

    /**
     * Tests {@link NumberUtils#min(double, double, double)}.
     */
    @Test
    public void testMin_threeDoubles() {
        assertEquals(1.0d, NumberUtils.min(5.0d, 1.0d, 3.0d), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#min(float, float, float)}.
     */
    @Test
    public void testMin_threeFloats() {
        assertEquals(1.0f, NumberUtils.min(5.0f, 1.0f, 3.0f), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#max(long, long, long)}.
     */
    @Test
    public void testMax_threeLongs() {
        assertEquals(5L, NumberUtils.max(1L, 5L, 3L));
    }

    /**
     * Tests {@link NumberUtils#max(int, int, int)}.
     */
    @Test
    public void testMax_threeInts() {
        assertEquals(5, NumberUtils.max(1, 5, 3));
    }

    /**
     * Tests {@link NumberUtils#max(short, short, short)}.
     */
    @Test
    public void testMax_threeShorts() {
        assertEquals((short) 5, NumberUtils.max((short) 1, (short) 5, (short) 3));
    }

    /**
     * Tests {@link NumberUtils#max(byte, byte, byte)}.
     */
    @Test
    public void testMax_threeBytes() {
        assertEquals((byte) 5, NumberUtils.max((byte) 1, (byte) 5, (byte) 3));
    }

    /**
     * Tests {@link NumberUtils#max(double, double, double)}.
     */
    @Test
    public void testMax_threeDoubles() {
        assertEquals(5.0d, NumberUtils.max(1.0d, 5.0d, 3.0d), 0.0d);
    }

    /**
     * Tests {@link NumberUtils#max(float, float, float)}.
     */
    @Test
    public void testMax_threeFloats() {
        assertEquals(5.0f, NumberUtils.max(1.0f, 5.0f, 3.0f), 0.0f);
    }

    /**
     * Tests {@link NumberUtils#isDigits(String)}.
     */
    @Test
    public void testIsDigits_Valid() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    /**
     * Tests {@link NumberUtils#isDigits(String)} with empty string.
     */
    @Test
    public void testIsDigits_Empty() {
        assertFalse(NumberUtils.isDigits(""));
    }

    /**
     * Tests {@link NumberUtils#isDigits(String)} with null.
     */
    @Test
    public void testIsDigits_Null() {
        assertFalse(NumberUtils.isDigits(null));
    }

    /**
     * Tests {@link NumberUtils#isDigits(String)} with non-digit characters.
     */
    @Test
    public void testIsDigits_NonDigits() {
        assertFalse(NumberUtils.isDigits("123a45"));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)}.
     */
    @Test
    public void testIsNumber_ValidInteger() {
        assertTrue(NumberUtils.isNumber("123"));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)} with hex.
     */
    @Test
    public void testIsNumber_ValidHex() {
        assertTrue(NumberUtils.isNumber("0x123"));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)} with scientific notation.
     */
    @Test
    public void testIsNumber_ValidScientific() {
        assertTrue(NumberUtils.isNumber("1.23E4"));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)} with type qualifier.
     */
    @Test
    public void testIsNumber_ValidTypeQualifier() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)} with empty string.
     */
    @Test
    public void testIsNumber_Empty() {
        assertFalse(NumberUtils.isNumber(""));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)} with null.
     */
    @Test
    public void testIsNumber_Null() {
        assertFalse(NumberUtils.isNumber(null));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)} with only hex prefix.
     */
    @Test
    public void testIsNumber_OnlyHexPrefix() {
        assertFalse(NumberUtils.isNumber("0x"));
    }
    
    /**
     * Tests {@link NumberUtils#isNumber(String)} with only hex prefix and sign.
     */
    @Test
    public void testIsNumber_OnlyHexPrefixWithSign() {
        assertFalse(NumberUtils.isNumber("-0x"));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)} with invalid characters.
     */
    @Test
    public void testIsNumber_InvalidChars() {
        assertFalse(NumberUtils.isNumber("123a"));
    }
    
    /**
     * Tests {@link NumberUtils#isNumber(String)} with two decimal points.
     */
    @Test
    public void testIsNumber_TwoDecimalPoints() {
        assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)} with decimal point in exponent.
     */
    @Test
    public void testIsNumber_DecimalPointInExponent() {
        assertFalse(NumberUtils.isNumber("1E2.3"));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)} with exponent without digits.
     */
    @Test
    public void testIsNumber_ExponentWithoutDigits() {
        assertFalse(NumberUtils.isNumber("1E"));
    }

    /**
     * Tests {@link NumberUtils#isNumber(String)} with a trailing decimal point.
     */
    @Test
    public void testIsNumber_TrailingDecimalPoint() {
        assertTrue(NumberUtils.isNumber("1."));
    }
    
    /**
     * Tests {@link NumberUtils#createInteger(String)} with valid hex input.
     * The Integer.decode() method correctly parses hexadecimal strings like "0x1A".
     */
    @Test
    public void testCreateInteger_ValidHex_Corrected() {
        assertEquals(Integer.valueOf(26), NumberUtils.createInteger("0x1A"));
    }

    /**
     * Tests {@link NumberUtils#createNumber(String)} for BigDecimal.
     * The original test failed because it expected a BigDecimal for "1.5E7" which
     * is correctly handled by BigDecimal.
     */
    @Test
    public void testCreateNumber_BigDecimal_Corrected() {
        Number num = NumberUtils.createNumber("1.5E7");
        assertTrue(num instanceof BigDecimal);
        assertEquals(new BigDecimal("1.5E7"), num);
    }
}
