package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {
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
        assertEquals(123, NumberUtils.toInt("123"));
    }

    @Test
    public void testToIntInvalid() throws Exception {
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToIntWithDefaultValid() throws Exception {
        assertEquals(123, NumberUtils.toInt("123", 0));
    }

    @Test
    public void testToIntWithDefaultInvalid() throws Exception {
        assertEquals(0, NumberUtils.toInt("abc", 0));
    }

    @Test
    public void testToIntWithDefaultNull() throws Exception {
        assertEquals(0, NumberUtils.toInt(null, 0));
    }

    @Test
    public void testToIntWithDefaultEmpty() throws Exception {
        assertEquals(0, NumberUtils.toInt("", 0));
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
        assertEquals(123L, NumberUtils.toLong("123"));
    }

    @Test
    public void testToLongInvalid() throws Exception {
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLongWithDefaultValid() throws Exception {
        assertEquals(123L, NumberUtils.toLong("123", 0L));
    }

    @Test
    public void testToLongWithDefaultInvalid() throws Exception {
        assertEquals(0L, NumberUtils.toLong("abc", 0L));
    }

    @Test
    public void testToLongWithDefaultNull() throws Exception {
        assertEquals(0L, NumberUtils.toLong(null, 0L));
    }

    @Test
    public void testToLongWithDefaultEmpty() throws Exception {
        assertEquals(0L, NumberUtils.toLong("", 0L));
    }

    @Test
    public void testToFloatNull() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    @Test
    public void testToFloatEmpty() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    @Test
    public void testToFloatValid() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
    }

    @Test
    public void testToFloatInvalid() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0f);
    }

    @Test
    public void testToFloatWithDefaultValid() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0f);
    }

    @Test
    public void testToFloatWithDefaultInvalid() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat("abc", 0.0f), 0.0f);
    }

    @Test
    public void testToFloatWithDefaultNull() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat(null, 0.0f), 0.0f);
    }

    @Test
    public void testToFloatWithDefaultEmpty() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat("", 0.0f), 0.0f);
    }

    @Test
    public void testToDoubleNull() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    @Test
    public void testToDoubleEmpty() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    @Test
    public void testToDoubleValid() throws Exception {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
    }

    @Test
    public void testToDoubleInvalid() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0d);
    }

    @Test
    public void testToDoubleWithDefaultValid() throws Exception {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0d);
    }

    @Test
    public void testToDoubleWithDefaultInvalid() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble("abc", 0.0d), 0.0d);
    }

    @Test
    public void testToDoubleWithDefaultNull() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble(null, 0.0d), 0.0d);
    }

    @Test
    public void testToDoubleWithDefaultEmpty() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble("", 0.0d), 0.0d);
    }

    @Test
    public void testToByteNull() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByteEmpty() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByteValid() throws Exception {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByteInvalid() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByteWithDefaultValid() throws Exception {
        assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
    }

    @Test
    public void testToByteWithDefaultInvalid() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte("abc", (byte) 0));
    }

    @Test
    public void testToByteWithDefaultNull() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte(null, (byte) 0));
    }

    @Test
    public void testToByteWithDefaultEmpty() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte("", (byte) 0));
    }

    @Test
    public void testToShortNull() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShortEmpty() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShortValid() throws Exception {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShortInvalid() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShortWithDefaultValid() throws Exception {
        assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
    }

    @Test
    public void testToShortWithDefaultInvalid() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort("abc", (short) 0));
    }

    @Test
    public void testToShortWithDefaultNull() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort(null, (short) 0));
    }

    @Test
    public void testToShortWithDefaultEmpty() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort("", (short) 0));
    }

    @Test
    public void testCreateNumberNull() throws Exception {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test
    public void testCreateNumberBlank() throws Exception {
        try {
            NumberUtils.createNumber("");
            fail("Expected NumberFormatException for blank string");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateNumberInteger() throws Exception {
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
    }

    @Test
    public void testCreateNumberLong() throws Exception {
        assertEquals(Long.valueOf("1234567890123456789"), NumberUtils.createNumber("1234567890123456789"));
    }

    @Test
    public void testCreateNumberFloat() throws Exception {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createNumber("1.5f"));
    }

    @Test
    public void testCreateNumberDouble() throws Exception {
        assertEquals(Double.valueOf(1.5d), NumberUtils.createNumber("1.5d"));
    }

    @Test
    public void testCreateNumberHexInteger() throws Exception {
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
    }

    @Test
    public void testCreateNumberHexLong() throws Exception {
        // The reference source for createNumber has a bug here. It should parse
        // 0xFFFFFFFF as a Long, but it incorrectly tries to create an Integer first.
        // For Lang 3.0, this was fixed to directly parse hex to Long if > 8 digits.
        // Given the provided source, we must test for the behavior *in* the source.
        // The source code explicitly checks for hexDigits > 8 to use createLong.
        // 0xFFFFFFFF has 8 hex digits, so it tries createInteger first.
        // Integer.decode("0xFFFFFFFF") will fail with NumberFormatException.
        // Therefore, we expect a NumberFormatException.
        try {
            NumberUtils.createNumber("0xFFFFFFFF");
            fail("Expected NumberFormatException for 0xFFFFFFFF as an Integer");
        } catch (NumberFormatException e) {
            // Expected
        }
        // A valid long hex number
        assertEquals(Long.valueOf("4294967296"), NumberUtils.createNumber("0x100000000"));
    }

    @Test
    public void testCreateNumberBigDecimal() throws Exception {
        assertEquals(new BigDecimal("1.2345678901234567890123456789"), NumberUtils.createNumber("1.2345678901234567890123456789"));
    }

    @Test
    public void testCreateNumberBigInteger() throws Exception {
        assertEquals(new BigInteger("98765432109876543210"), NumberUtils.createNumber("98765432109876543210"));
    }

    @Test
    public void testCreateNumberInvalidFormat() throws Exception {
        try {
            NumberUtils.createNumber("1.2.3");
            fail("Expected NumberFormatException for invalid format");
        } catch (NumberFormatException expected) {
        }
    }
    
    @Test
    public void testCreateNumberInvalidHexFormat() throws Exception {
        try {
            NumberUtils.createNumber("0xGHI");
            fail("Expected NumberFormatException for invalid hex format");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateFloatNull() throws Exception {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloatValid() throws Exception {
        assertEquals(Float.valueOf(1.23f), NumberUtils.createFloat("1.23"));
    }

    @Test
    public void testCreateFloatInvalid() throws Exception {
        try {
            NumberUtils.createFloat("abc");
            fail("Expected NumberFormatException for invalid float string");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateDoubleNull() throws Exception {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDoubleValid() throws Exception {
        assertEquals(Double.valueOf(1.23d), NumberUtils.createDouble("1.23"));
    }

    @Test
    public void testCreateDoubleInvalid() throws Exception {
        try {
            NumberUtils.createDouble("abc");
            fail("Expected NumberFormatException for invalid double string");
        } catch (NumberFormatException expected) {
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
        assertEquals(Integer.valueOf(63), NumberUtils.createInteger("077"));
    }

    @Test
    public void testCreateIntegerInvalid() throws Exception {
        try {
            NumberUtils.createInteger("abc");
            fail("Expected NumberFormatException for invalid integer string");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateLongNull() throws Exception {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLongValid() throws Exception {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test
    public void testCreateLongHex() throws Exception {
        assertEquals(Long.valueOf(255L), NumberUtils.createLong("0xFF"));
    }

    @Test
    public void testCreateLongOctal() throws Exception {
        assertEquals(Long.valueOf(63L), NumberUtils.createLong("077"));
    }

    @Test
    public void testCreateLongInvalid() throws Exception {
        try {
            NumberUtils.createLong("abc");
            fail("Expected NumberFormatException for invalid long string");
        } catch (NumberFormatException expected) {
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
            fail("Expected NumberFormatException for invalid BigInteger string");
        } catch (NumberFormatException expected) {
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
    public void testCreateBigDecimalBlank() throws Exception {
        try {
            NumberUtils.createBigDecimal("");
            fail("Expected NumberFormatException for blank BigDecimal string");
        } catch (NumberFormatException expected) {
        }
    }
    
    @Test
    public void testCreateBigDecimalDoubleDash() throws Exception {
        try {
            NumberUtils.createBigDecimal("--123");
            fail("Expected NumberFormatException for double dash BigDecimal string");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateBigDecimalInvalid() throws Exception {
        try {
            NumberUtils.createBigDecimal("abc");
            fail("Expected NumberFormatException for invalid BigDecimal string");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testMinLongArray() throws Exception {
        assertEquals(1L, NumberUtils.min(new long[]{5L, 1L, 3L}));
    }

    @Test
    public void testMinLongArraySingleElement() throws Exception {
        assertEquals(5L, NumberUtils.min(new long[]{5L}));
    }

    @Test
    public void testMinLongArrayAllSame() throws Exception {
        assertEquals(5L, NumberUtils.min(new long[]{5L, 5L, 5L}));
    }

    @Test
    public void testMinLongArrayNegative() throws Exception {
        assertEquals(-5L, NumberUtils.min(new long[]{-1L, -5L, -3L}));
    }

    @Test
    public void testMinLongArrayMixedSigns() throws Exception {
        assertEquals(-5L, NumberUtils.min(new long[]{1L, -5L, 0L}));
    }

    @Test
    public void testMinLongArrayEmpty() {
        try {
            NumberUtils.min(new long[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinLongArrayNull() {
        try {
            NumberUtils.min((long[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinIntArray() throws Exception {
        assertEquals(1, NumberUtils.min(new int[]{5, 1, 3}));
    }

    @Test
    public void testMinIntArraySingleElement() throws Exception {
        assertEquals(5, NumberUtils.min(new int[]{5}));
    }

    @Test
    public void testMinIntArrayAllSame() throws Exception {
        assertEquals(5, NumberUtils.min(new int[]{5, 5, 5}));
    }

    @Test
    public void testMinIntArrayNegative() throws Exception {
        assertEquals(-5, NumberUtils.min(new int[]{-1, -5, -3}));
    }

    @Test
    public void testMinIntArrayMixedSigns() throws Exception {
        assertEquals(-5, NumberUtils.min(new int[]{1, -5, 0}));
    }

    @Test
    public void testMinIntArrayEmpty() {
        try {
            NumberUtils.min(new int[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinIntArrayNull() {
        try {
            NumberUtils.min((int[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinShortArray() throws Exception {
        assertEquals((short) 1, NumberUtils.min(new short[]{(short) 5, (short) 1, (short) 3}));
    }

    @Test
    public void testMinShortArraySingleElement() throws Exception {
        assertEquals((short) 5, NumberUtils.min(new short[]{(short) 5}));
    }

    @Test
    public void testMinShortArrayAllSame() throws Exception {
        assertEquals((short) 5, NumberUtils.min(new short[]{(short) 5, (short) 5, (short) 5}));
    }

    @Test
    public void testMinShortArrayNegative() throws Exception {
        assertEquals((short) -5, NumberUtils.min(new short[]{(short) -1, (short) -5, (short) -3}));
    }

    @Test
    public void testMinShortArrayMixedSigns() throws Exception {
        assertEquals((short) -5, NumberUtils.min(new short[]{(short) 1, (short) -5, (short) 0}));
    }

    @Test
    public void testMinShortArrayEmpty() {
        try {
            NumberUtils.min(new short[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinShortArrayNull() {
        try {
            NumberUtils.min((short[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinByteArray() throws Exception {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 5, (byte) 1, (byte) 3}));
    }

    @Test
    public void testMinByteArraySingleElement() throws Exception {
        assertEquals((byte) 5, NumberUtils.min(new byte[]{(byte) 5}));
    }

    @Test
    public void testMinByteArrayAllSame() throws Exception {
        assertEquals((byte) 5, NumberUtils.min(new byte[]{(byte) 5, (byte) 5, (byte) 5}));
    }

    @Test
    public void testMinByteArrayNegative() throws Exception {
        assertEquals((byte) -5, NumberUtils.min(new byte[]{(byte) -1, (byte) -5, (byte) -3}));
    }

    @Test
    public void testMinByteArrayMixedSigns() throws Exception {
        assertEquals((byte) -5, NumberUtils.min(new byte[]{(byte) 1, (byte) -5, (byte) 0}));
    }

    @Test
    public void testMinByteArrayEmpty() {
        try {
            NumberUtils.min(new byte[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinByteArrayNull() {
        try {
            NumberUtils.min((byte[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinDoubleArray() throws Exception {
        assertEquals(1.0d, NumberUtils.min(new double[]{5.0d, 1.0d, 3.0d}), 0.0d);
    }

    @Test
    public void testMinDoubleArraySingleElement() throws Exception {
        assertEquals(5.0d, NumberUtils.min(new double[]{5.0d}), 0.0d);
    }

    @Test
    public void testMinDoubleArrayAllSame() throws Exception {
        assertEquals(5.0d, NumberUtils.min(new double[]{5.0d, 5.0d, 5.0d}), 0.0d);
    }

    @Test
    public void testMinDoubleArrayNegative() throws Exception {
        assertEquals(-5.0d, NumberUtils.min(new double[]{-1.0d, -5.0d, -3.0d}), 0.0d);
    }

    @Test
    public void testMinDoubleArrayMixedSigns() throws Exception {
        assertEquals(-5.0d, NumberUtils.min(new double[]{1.0d, -5.0d, 0.0d}), 0.0d);
    }

    @Test
    public void testMinDoubleArrayNaN() throws Exception {
        assertEquals(Double.NaN, NumberUtils.min(new double[]{1.0d, Double.NaN, 3.0d}), 0.0d);
    }
    
    @Test
    public void testMinDoubleArrayEmpty() {
        try {
            NumberUtils.min(new double[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinDoubleArrayNull() {
        try {
            NumberUtils.min((double[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinFloatArray() throws Exception {
        assertEquals(1.0f, NumberUtils.min(new float[]{5.0f, 1.0f, 3.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArraySingleElement() throws Exception {
        assertEquals(5.0f, NumberUtils.min(new float[]{5.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArrayAllSame() throws Exception {
        assertEquals(5.0f, NumberUtils.min(new float[]{5.0f, 5.0f, 5.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArrayNegative() throws Exception {
        assertEquals(-5.0f, NumberUtils.min(new float[]{-1.0f, -5.0f, -3.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArrayMixedSigns() throws Exception {
        assertEquals(-5.0f, NumberUtils.min(new float[]{1.0f, -5.0f, 0.0f}), 0.0f);
    }
    
    @Test
    public void testMinFloatArrayNaN() throws Exception {
        assertEquals(Float.NaN, NumberUtils.min(new float[]{1.0f, Float.NaN, 3.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArrayEmpty() {
        try {
            NumberUtils.min(new float[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMinFloatArrayNull() {
        try {
            NumberUtils.min((float[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxLongArray() throws Exception {
        assertEquals(5L, NumberUtils.max(new long[]{1L, 5L, 3L}));
    }

    @Test
    public void testMaxLongArraySingleElement() throws Exception {
        assertEquals(5L, NumberUtils.max(new long[]{5L}));
    }

    @Test
    public void testMaxLongArrayAllSame() throws Exception {
        assertEquals(5L, NumberUtils.max(new long[]{5L, 5L, 5L}));
    }

    @Test
    public void testMaxLongArrayNegative() throws Exception {
        assertEquals(-1L, NumberUtils.max(new long[]{-5L, -1L, -3L}));
    }

    @Test
    public void testMaxLongArrayMixedSigns() throws Exception {
        assertEquals(1L, NumberUtils.max(new long[]{-5L, 1L, 0L}));
    }

    @Test
    public void testMaxLongArrayEmpty() {
        try {
            NumberUtils.max(new long[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxLongArrayNull() {
        try {
            NumberUtils.max((long[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxIntArray() throws Exception {
        assertEquals(5, NumberUtils.max(new int[]{1, 5, 3}));
    }

    @Test
    public void testMaxIntArraySingleElement() throws Exception {
        assertEquals(5, NumberUtils.max(new int[]{5}));
    }

    @Test
    public void testMaxIntArrayAllSame() throws Exception {
        assertEquals(5, NumberUtils.max(new int[]{5, 5, 5}));
    }

    @Test
    public void testMaxIntArrayNegative() throws Exception {
        assertEquals(-1, NumberUtils.max(new int[]{-5, -1, -3}));
    }

    @Test
    public void testMaxIntArrayMixedSigns() throws Exception {
        assertEquals(1, NumberUtils.max(new int[]{-5, 1, 0}));
    }

    @Test
    public void testMaxIntArrayEmpty() {
        try {
            NumberUtils.max(new int[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxIntArrayNull() {
        try {
            NumberUtils.max((int[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxShortArray() throws Exception {
        assertEquals((short) 5, NumberUtils.max(new short[]{(short) 1, (short) 5, (short) 3}));
    }

    @Test
    public void testMaxShortArraySingleElement() throws Exception {
        assertEquals((short) 5, NumberUtils.max(new short[]{(short) 5}));
    }

    @Test
    public void testMaxShortArrayAllSame() throws Exception {
        assertEquals((short) 5, NumberUtils.max(new short[]{(short) 5, (short) 5, (short) 5}));
    }

    @Test
    public void testMaxShortArrayNegative() throws Exception {
        assertEquals((short) -1, NumberUtils.max(new short[]{(short) -5, (short) -1, (short) -3}));
    }

    @Test
    public void testMaxShortArrayMixedSigns() throws Exception {
        assertEquals((short) 1, NumberUtils.max(new short[]{(short) -5, (short) 1, (short) 0}));
    }

    @Test
    public void testMaxShortArrayEmpty() {
        try {
            NumberUtils.max(new short[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxShortArrayNull() {
        try {
            NumberUtils.max((short[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxByteArray() throws Exception {
        assertEquals((byte) 5, NumberUtils.max(new byte[]{(byte) 1, (byte) 5, (byte) 3}));
    }

    @Test
    public void testMaxByteArraySingleElement() throws Exception {
        assertEquals((byte) 5, NumberUtils.max(new byte[]{(byte) 5}));
    }

    @Test
    public void testMaxByteArrayAllSame() throws Exception {
        assertEquals((byte) 5, NumberUtils.max(new byte[]{(byte) 5, (byte) 5, (byte) 5}));
    }

    @Test
    public void testMaxByteArrayNegative() throws Exception {
        assertEquals((byte) -1, NumberUtils.max(new byte[]{(byte) -5, (byte) -1, (byte) -3}));
    }

    @Test
    public void testMaxByteArrayMixedSigns() throws Exception {
        assertEquals((byte) 1, NumberUtils.max(new byte[]{(byte) -5, (byte) 1, (byte) 0}));
    }

    @Test
    public void testMaxByteArrayEmpty() {
        try {
            NumberUtils.max(new byte[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxByteArrayNull() {
        try {
            NumberUtils.max((byte[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxDoubleArray() throws Exception {
        assertEquals(5.0d, NumberUtils.max(new double[]{1.0d, 5.0d, 3.0d}), 0.0d);
    }

    @Test
    public void testMaxDoubleArraySingleElement() throws Exception {
        assertEquals(5.0d, NumberUtils.max(new double[]{5.0d}), 0.0d);
    }

    @Test
    public void testMaxDoubleArrayAllSame() throws Exception {
        assertEquals(5.0d, NumberUtils.max(new double[]{5.0d, 5.0d, 5.0d}), 0.0d);
    }

    @Test
    public void testMaxDoubleArrayNegative() throws Exception {
        assertEquals(-1.0d, NumberUtils.max(new double[]{-5.0d, -1.0d, -3.0d}), 0.0d);
    }

    @Test
    public void testMaxDoubleArrayMixedSigns() throws Exception {
        assertEquals(1.0d, NumberUtils.max(new double[]{-5.0d, 1.0d, 0.0d}), 0.0d);
    }

    @Test
    public void testMaxDoubleArrayNaN() throws Exception {
        assertEquals(Double.NaN, NumberUtils.max(new double[]{1.0d, Double.NaN, 3.0d}), 0.0d);
    }

    @Test
    public void testMaxDoubleArrayEmpty() {
        try {
            NumberUtils.max(new double[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxDoubleArrayNull() {
        try {
            NumberUtils.max((double[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxFloatArray() throws Exception {
        assertEquals(5.0f, NumberUtils.max(new float[]{1.0f, 5.0f, 3.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArraySingleElement() throws Exception {
        assertEquals(5.0f, NumberUtils.max(new float[]{5.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArrayAllSame() throws Exception {
        assertEquals(5.0f, NumberUtils.max(new float[]{5.0f, 5.0f, 5.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArrayNegative() throws Exception {
        assertEquals(-1.0f, NumberUtils.max(new float[]{-5.0f, -1.0f, -3.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArrayMixedSigns() throws Exception {
        assertEquals(1.0f, NumberUtils.max(new float[]{-5.0f, 1.0f, 0.0f}), 0.0f);
    }
    
    @Test
    public void testMaxFloatArrayNaN() throws Exception {
        assertEquals(Float.NaN, NumberUtils.max(new float[]{1.0f, Float.NaN, 3.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArrayEmpty() {
        try {
            NumberUtils.max(new float[]{});
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testMaxFloatArrayNull() {
        try {
            NumberUtils.max((float[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testIsDigitsNull() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigitsEmpty() throws Exception {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigitsValid() throws Exception {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigitsWithLetters() throws Exception {
        assertFalse(NumberUtils.isDigits("123a45"));
    }

    @Test
    public void testIsDigitsWithSigns() throws Exception {
        assertFalse(NumberUtils.isDigits("-123"));
    }

    @Test
    public void testIsDigitsWithDecimal() throws Exception {
        assertFalse(NumberUtils.isDigits("12.34"));
    }

    @Test
    public void testIsDigitsWithExponent() throws Exception {
        assertFalse(NumberUtils.isDigits("1e3"));
    }
    
    @Test
    public void testIsNumberNull() throws Exception {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumberEmpty() throws Exception {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumberInteger() throws Exception {
        assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumberLong() throws Exception {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumberFloat() throws Exception {
        assertTrue(NumberUtils.isNumber("1.5f"));
    }

    @Test
    public void testIsNumberDouble() throws Exception {
        assertTrue(NumberUtils.isNumber("1.5d"));
    }

    @Test
    public void testIsNumberHexInteger() throws Exception {
        assertTrue(NumberUtils.isNumber("0xFF"));
    }

    @Test
    public void testIsNumberHexLong() throws Exception {
        // The reference code for isNumber() incorrectly returns false for
        // hexadecimal strings that would overflow an int if they have more than 8 digits.
        // The bug fix for Lang 3.0 corrected this.
        // For the provided source code, 0x100000000 is too large for an int,
        // and the isNumber logic has a bug that would consider it invalid.
        // The method `isNumber` determines valid Java numbers, including hex.
        // For hex, it checks if characters are hex digits.
        // The length of the string `0x100000000` is 12.
        // After `0x`, there are 10 digits.
        // The code checks `i < chars.length` for hex characters.
        // It seems the logic for `isNumber` for hexadecimal might be flawed in the provided source.
        // The test `testCreateNumberHexLong` already shows `0x100000000` is parsed as a Long.
        // Therefore, `isNumber` should return true for it.
        assertTrue(NumberUtils.isNumber("0x100000000"));
        assertTrue(NumberUtils.isNumber("0X100000000")); // Uppercase hex prefix
        assertTrue(NumberUtils.isNumber("-0x100000000")); // Negative hex
        assertTrue(NumberUtils.isNumber("0x100000000L")); // Hex with L suffix
    }

    @Test
    public void testIsNumberScientificNotation() throws Exception {
        assertTrue(NumberUtils.isNumber("1.23E4"));
    }

    @Test
    public void testIsNumberScientificNotationWithSign() throws Exception {
        assertTrue(NumberUtils.isNumber("1.23E+4"));
    }
    
    @Test
    public void testIsNumberNegativeInteger() throws Exception {
        assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test
    public void testIsNumberNegativeHexInteger() throws Exception {
        assertTrue(NumberUtils.isNumber("-0xFF"));
    }

    @Test
    public void testIsNumberDecimalPointOnly() throws Exception {
        assertFalse(NumberUtils.isNumber("."));
    }

    @Test
    public void testIsNumberExponentOnly() throws Exception {
        assertFalse(NumberUtils.isNumber("e"));
    }

    @Test
    public void testIsNumberExponentWithSign() throws Exception {
        assertFalse(NumberUtils.isNumber("1E+"));
    }
    
    @Test
    public void testIsNumberWithLeadingZeroHex() throws Exception {
        assertTrue(NumberUtils.isNumber("0123")); // This is an octal representation in createInteger, but isNumber just checks for digits
    }

    @Test
    public void testIsNumberWithTrailingDecimalPoint() throws Exception {
        assertTrue(NumberUtils.isNumber("123."));
    }

    @Test
    public void testIsNumberWithOnlySign() throws Exception {
        assertFalse(NumberUtils.isNumber("+"));
        assertFalse(NumberUtils.isNumber("-"));
    }
    
    @Test
    public void testIsNumberInvalidHex() throws Exception {
        assertFalse(NumberUtils.isNumber("0xG"));
    }
    
    @Test
    public void testIsNumberTooManyDecimalPoints() throws Exception {
        assertFalse(NumberUtils.isNumber("1.2.3"));
    }

    @Test
    public void testIsNumberTooManyExponents() throws Exception {
        assertFalse(NumberUtils.isNumber("1e2e3"));
    }
    
    @Test
    public void testMinThreeLong() throws Exception {
        assertEquals(1L, NumberUtils.min(5L, 1L, 3L));
    }

    @Test
    public void testMinThreeInt() throws Exception {
        assertEquals(1, NumberUtils.min(5, 1, 3));
    }

    @Test
    public void testMinThreeShort() throws Exception {
        assertEquals((short) 1, NumberUtils.min((short) 5, (short) 1, (short) 3));
    }

    @Test
    public void testMinThreeByte() throws Exception {
        assertEquals((byte) 1, NumberUtils.min((byte) 5, (byte) 1, (byte) 3));
    }

    @Test
    public void testMinThreeDouble() throws Exception {
        assertEquals(1.0d, NumberUtils.min(5.0d, 1.0d, 3.0d), 0.0d);
    }

    @Test
    public void testMinThreeFloat() throws Exception {
        assertEquals(1.0f, NumberUtils.min(5.0f, 1.0f, 3.0f), 0.0f);
    }

    @Test
    public void testMaxThreeLong() throws Exception {
        assertEquals(5L, NumberUtils.max(1L, 5L, 3L));
    }

    @Test
    public void testMaxThreeInt() throws Exception {
        assertEquals(5, NumberUtils.max(1, 5, 3));
    }

    @Test
    public void testMaxThreeShort() throws Exception {
        assertEquals((short) 5, NumberUtils.max((short) 1, (short) 5, (short) 3));
    }

    @Test
    public void testMaxThreeByte() throws Exception {
        assertEquals((byte) 5, NumberUtils.max((byte) 1, (byte) 5, (byte) 3));
    }

    @Test
    public void testMaxThreeDouble() throws Exception {
        assertEquals(5.0d, NumberUtils.max(1.0d, 5.0d, 3.0d), 0.0d);
    }

    @Test
    public void testMaxThreeFloat() throws Exception {
        assertEquals(5.0f, NumberUtils.max(1.0f, 5.0f, 3.0f), 0.0f);
    }
}
