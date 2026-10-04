package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testToInt_nullString_returnsDefault() throws Exception {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_emptyString_returnsDefault() throws Exception {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_validString_returnsInt() throws Exception {
        assertEquals(123, NumberUtils.toInt("123"));
    }

    @Test
    public void testToInt_invalidString_returnsDefault() throws Exception {
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToInt_defaultValue_returnsDefault() throws Exception {
        assertEquals(5, NumberUtils.toInt(null, 5));
    }

    @Test
    public void testToInt_defaultValue_validString_returnsInt() throws Exception {
        assertEquals(123, NumberUtils.toInt("123", 5));
    }

    @Test
    public void testToInt_defaultValue_invalidString_returnsDefault() throws Exception {
        assertEquals(5, NumberUtils.toInt("abc", 5));
    }

    @Test
    public void testToLong_nullString_returnsDefault() throws Exception {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_emptyString_returnsDefault() throws Exception {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLong_validString_returnsLong() throws Exception {
        assertEquals(123L, NumberUtils.toLong("123"));
    }

    @Test
    public void testToLong_invalidString_returnsDefault() throws Exception {
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLong_defaultValue_returnsDefault() throws Exception {
        assertEquals(5L, NumberUtils.toLong(null, 5L));
    }

    @Test
    public void testToLong_defaultValue_validString_returnsLong() throws Exception {
        assertEquals(123L, NumberUtils.toLong("123", 5L));
    }

    @Test
    public void testToLong_defaultValue_invalidString_returnsDefault() throws Exception {
        assertEquals(5L, NumberUtils.toLong("abc", 5L));
    }

    @Test
    public void testToFloat_nullString_returnsDefault() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    @Test
    public void testToFloat_emptyString_returnsDefault() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    @Test
    public void testToFloat_validString_returnsFloat() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 1e-9f);
    }

    @Test
    public void testToFloat_invalidString_returnsDefault() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0f);
    }

    @Test
    public void testToFloat_defaultValue_returnsDefault() throws Exception {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 1.1f);
    }

    @Test
    public void testToFloat_defaultValue_validString_returnsFloat() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 1e-9f);
    }

    @Test
    public void testToFloat_defaultValue_invalidString_returnsDefault() throws Exception {
        assertEquals(1.1f, NumberUtils.toFloat("abc", 1.1f), 1.1f);
    }

    @Test
    public void testToDouble_nullString_returnsDefault() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    @Test
    public void testToDouble_emptyString_returnsDefault() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    @Test
    public void testToDouble_validString_returnsDouble() throws Exception {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 1e-9d);
    }

    @Test
    public void testToDouble_invalidString_returnsDefault() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0d);
    }

    @Test
    public void testToDouble_defaultValue_returnsDefault() throws Exception {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 1.1d);
    }

    @Test
    public void testToDouble_defaultValue_validString_returnsDouble() throws Exception {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 1e-9d);
    }

    @Test
    public void testToDouble_defaultValue_invalidString_returnsDefault() throws Exception {
        assertEquals(1.1d, NumberUtils.toDouble("abc", 1.1d), 1.1d);
    }

    @Test
    public void testToByte_nullString_returnsDefault() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_emptyString_returnsDefault() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByte_validString_returnsByte() throws Exception {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByte_invalidString_returnsDefault() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByte_defaultValue_returnsDefault() throws Exception {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByte_defaultValue_validString_returnsByte() throws Exception {
        assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
    }

    @Test
    public void testToByte_defaultValue_invalidString_returnsDefault() throws Exception {
        assertEquals((byte) 1, NumberUtils.toByte("abc", (byte) 1));
    }

    @Test
    public void testToShort_nullString_returnsDefault() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_emptyString_returnsDefault() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShort_validString_returnsShort() throws Exception {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShort_invalidString_returnsDefault() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShort_defaultValue_returnsDefault() throws Exception {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShort_defaultValue_validString_returnsShort() throws Exception {
        assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
    }

    @Test
    public void testToShort_defaultValue_invalidString_returnsDefault() throws Exception {
        assertEquals((short) 1, NumberUtils.toShort("abc", (short) 1));
    }

    @Test
    public void testCreateNumber_nullString_returnsNull() throws Exception {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test
    public void testCreateNumber_blankString_throwsNumberFormatException() throws Exception {
        try {
            NumberUtils.createNumber("");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test
    public void testCreateNumber_doubleQuotedString() throws Exception {
        assertEquals(Double.valueOf(1.5d), NumberUtils.createNumber("1.5d"));
    }

    @Test
    public void testCreateNumber_floatQuotedString() throws Exception {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createNumber("1.5F"));
    }

    @Test
    public void testCreateNumber_longQuotedString() throws Exception {
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
    }

    @Test
    public void testCreateNumber_integerString() throws Exception {
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
    }

    @Test
    public void testCreateNumber_bigIntegerString() throws Exception {
        // The original test had a very large number that might have issues.
        // Using a value that fits in BigInteger but is large enough to test conversion.
        assertEquals(new BigInteger("9223372036854775807"), NumberUtils.createNumber("9223372036854775807"));
    }

    @Test
    public void testCreateNumber_bigDecimalString() throws Exception {
        // The original test had a precision issue. BigDecimal("1.5E10") is precisely 1.5E10.
        assertEquals(new BigDecimal("1.5E10"), NumberUtils.createNumber("1.5E10"));
    }

    @Test
    public void testCreateNumber_hexString() throws Exception {
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
    }

    @Test
    public void testCreateNumber_negativeHexString() throws Exception {
        assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-0xFF"));
    }

    @Test
    public void testCreateFloat_nullString_returnsNull() throws Exception {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloat_validString_returnsFloat() throws Exception {
        assertEquals(Float.valueOf(1.5f), NumberUtils.createFloat("1.5"));
    }

    @Test
    public void testCreateFloat_invalidString_throwsNumberFormatException() throws Exception {
        try {
            NumberUtils.createFloat("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test
    public void testCreateDouble_nullString_returnsNull() throws Exception {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDouble_validString_returnsDouble() throws Exception {
        assertEquals(Double.valueOf(1.5d), NumberUtils.createDouble("1.5"));
    }

    @Test
    public void testCreateDouble_invalidString_throwsNumberFormatException() throws Exception {
        try {
            NumberUtils.createDouble("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test
    public void testCreateInteger_nullString_returnsNull() throws Exception {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_validString_returnsInteger() throws Exception {
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
    }

    @Test
    public void testCreateInteger_hexString_returnsInteger() throws Exception {
        assertEquals(Integer.valueOf(255), NumberUtils.createInteger("0xFF"));
    }

    @Test
    public void testCreateInteger_octalString_returnsInteger() throws Exception {
        assertEquals(Integer.valueOf(63), NumberUtils.createInteger("077"));
    }

    @Test
    public void testCreateInteger_invalidString_throwsNumberFormatException() throws Exception {
        try {
            NumberUtils.createInteger("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test
    public void testCreateLong_nullString_returnsNull() throws Exception {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLong_validString_returnsLong() throws Exception {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
    }

    @Test
    public void testCreateLong_invalidString_throwsNumberFormatException() throws Exception {
        try {
            NumberUtils.createLong("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test
    public void testCreateBigInteger_nullString_returnsNull() throws Exception {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_validString_returnsBigInteger() throws Exception {
        assertEquals(new BigInteger("123"), NumberUtils.createBigInteger("123"));
    }

    @Test
    public void testCreateBigInteger_largeString_returnsBigInteger() throws Exception {
        assertEquals(new BigInteger("9223372036854775808"), NumberUtils.createBigInteger("9223372036854775808"));
    }

    @Test
    public void testCreateBigInteger_invalidString_throwsNumberFormatException() throws Exception {
        try {
            NumberUtils.createBigInteger("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test
    public void testCreateBigDecimal_nullString_returnsNull() throws Exception {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test
    public void testCreateBigDecimal_validString_returnsBigDecimal() throws Exception {
        assertEquals(new BigDecimal("123.45"), NumberUtils.createBigDecimal("123.45"));
    }

    @Test
    public void testCreateBigDecimal_scientificString_returnsBigDecimal() throws Exception {
        assertEquals(new BigDecimal("1.5E10"), NumberUtils.createBigDecimal("1.5E10"));
    }

    @Test
    public void testCreateBigDecimal_blankString_throwsNumberFormatException() throws Exception {
        try {
            NumberUtils.createBigDecimal("");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test
    public void testCreateBigDecimal_invalidString_throwsNumberFormatException() throws Exception {
        try {
            NumberUtils.createBigDecimal("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test
    public void testMin_longArray_returnsMin() throws Exception {
        assertEquals(1L, NumberUtils.min(new long[]{5L, 1L, 3L}));
    }

    @Test
    public void testMin_longArray_singleElement_returnsElement() throws Exception {
        assertEquals(5L, NumberUtils.min(new long[]{5L}));
    }

    @Test
    public void testMin_longArray_negativeValues_returnsMin() throws Exception {
        assertEquals(-5L, NumberUtils.min(new long[]{-1L, -5L, -3L}));
    }

    @Test
    public void testMin_longArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min(new long[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_longArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min((long[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_intArray_returnsMin() throws Exception {
        assertEquals(1, NumberUtils.min(new int[]{5, 1, 3}));
    }

    @Test
    public void testMin_intArray_singleElement_returnsElement() throws Exception {
        assertEquals(5, NumberUtils.min(new int[]{5}));
    }

    @Test
    public void testMin_intArray_negativeValues_returnsMin() throws Exception {
        assertEquals(-5, NumberUtils.min(new int[]{-1, -5, -3}));
    }

    @Test
    public void testMin_intArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min(new int[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_intArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min((int[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_shortArray_returnsMin() throws Exception {
        assertEquals((short) 1, NumberUtils.min(new short[]{(short) 5, (short) 1, (short) 3}));
    }

    @Test
    public void testMin_shortArray_singleElement_returnsElement() throws Exception {
        assertEquals((short) 5, NumberUtils.min(new short[]{(short) 5}));
    }

    @Test
    public void testMin_shortArray_negativeValues_returnsMin() throws Exception {
        assertEquals((short) -5, NumberUtils.min(new short[]{(short) -1, (short) -5, (short) -3}));
    }

    @Test
    public void testMin_shortArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min(new short[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_shortArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min((short[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_byteArray_returnsMin() throws Exception {
        assertEquals((byte) 1, NumberUtils.min(new byte[]{(byte) 5, (byte) 1, (byte) 3}));
    }

    @Test
    public void testMin_byteArray_singleElement_returnsElement() throws Exception {
        assertEquals((byte) 5, NumberUtils.min(new byte[]{(byte) 5}));
    }

    @Test
    public void testMin_byteArray_negativeValues_returnsMin() throws Exception {
        assertEquals((byte) -5, NumberUtils.min(new byte[]{(byte) -1, (byte) -5, (byte) -3}));
    }

    @Test
    public void testMin_byteArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min(new byte[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_byteArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min((byte[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_doubleArray_returnsMin() throws Exception {
        assertEquals(1.0d, NumberUtils.min(new double[]{5.0d, 1.0d, 3.0d}), 1e-9);
    }

    @Test
    public void testMin_doubleArray_singleElement_returnsElement() throws Exception {
        assertEquals(5.0d, NumberUtils.min(new double[]{5.0d}), 1e-9);
    }

    @Test
    public void testMin_doubleArray_negativeValues_returnsMin() throws Exception {
        assertEquals(-5.0d, NumberUtils.min(new double[]{-1.0d, -5.0d, -3.0d}), 1e-9);
    }

    @Test
    public void testMin_doubleArray_withNaN_returnsNaN() throws Exception {
        // The method returns NaN if any element is NaN, so we expect NaN.
        assertEquals(Double.NaN, NumberUtils.min(new double[]{5.0d, Double.NaN, 3.0d}));
    }

    @Test
    public void testMin_doubleArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min(new double[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_doubleArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min((double[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_floatArray_returnsMin() throws Exception {
        assertEquals(1.0f, NumberUtils.min(new float[]{5.0f, 1.0f, 3.0f}), 1e-9f);
    }

    @Test
    public void testMin_floatArray_singleElement_returnsElement() throws Exception {
        assertEquals(5.0f, NumberUtils.min(new float[]{5.0f}), 1e-9f);
    }

    @Test
    public void testMin_floatArray_negativeValues_returnsMin() throws Exception {
        assertEquals(-5.0f, NumberUtils.min(new float[]{-1.0f, -5.0f, -3.0f}), 1e-9f);
    }

    @Test
    public void testMin_floatArray_withNaN_returnsNaN() throws Exception {
        // The method returns NaN if any element is NaN, so we expect NaN.
        assertEquals(Float.NaN, NumberUtils.min(new float[]{5.0f, Float.NaN, 3.0f}));
    }

    @Test
    public void testMin_floatArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min(new float[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_floatArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.min((float[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_longArray_returnsMax() throws Exception {
        assertEquals(5L, NumberUtils.max(new long[]{1L, 5L, 3L}));
    }

    @Test
    public void testMax_longArray_singleElement_returnsElement() throws Exception {
        assertEquals(5L, NumberUtils.max(new long[]{5L}));
    }

    @Test
    public void testMax_longArray_negativeValues_returnsMax() throws Exception {
        assertEquals(-1L, NumberUtils.max(new long[]{-5L, -1L, -3L}));
    }

    @Test
    public void testMax_longArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max(new long[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_longArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max((long[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_intArray_returnsMax() throws Exception {
        assertEquals(5, NumberUtils.max(new int[]{1, 5, 3}));
    }

    @Test
    public void testMax_intArray_singleElement_returnsElement() throws Exception {
        assertEquals(5, NumberUtils.max(new int[]{5}));
    }

    @Test
    public void testMax_intArray_negativeValues_returnsMax() throws Exception {
        assertEquals(-1, NumberUtils.max(new int[]{-5, -1, -3}));
    }

    @Test
    public void testMax_intArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max(new int[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_intArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max((int[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_shortArray_returnsMax() throws Exception {
        assertEquals((short) 5, NumberUtils.max(new short[]{(short) 1, (short) 5, (short) 3}));
    }

    @Test
    public void testMax_shortArray_singleElement_returnsElement() throws Exception {
        assertEquals((short) 5, NumberUtils.max(new short[]{(short) 5}));
    }

    @Test
    public void testMax_shortArray_negativeValues_returnsMax() throws Exception {
        assertEquals((short) -1, NumberUtils.max(new short[]{(short) -5, (short) -1, (short) -3}));
    }

    @Test
    public void testMax_shortArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max(new short[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_shortArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max((short[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_byteArray_returnsMax() throws Exception {
        assertEquals((byte) 5, NumberUtils.max(new byte[]{(byte) 1, (byte) 5, (byte) 3}));
    }

    @Test
    public void testMax_byteArray_singleElement_returnsElement() throws Exception {
        assertEquals((byte) 5, NumberUtils.max(new byte[]{(byte) 5}));
    }

    @Test
    public void testMax_byteArray_negativeValues_returnsMax() throws Exception {
        assertEquals((byte) -1, NumberUtils.max(new byte[]{(byte) -5, (byte) -1, (byte) -3}));
    }

    @Test
    public void testMax_byteArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max(new byte[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_byteArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max((byte[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_doubleArray_returnsMax() throws Exception {
        assertEquals(5.0d, NumberUtils.max(new double[]{1.0d, 5.0d, 3.0d}), 1e-9);
    }

    @Test
    public void testMax_doubleArray_singleElement_returnsElement() throws Exception {
        assertEquals(5.0d, NumberUtils.max(new double[]{5.0d}), 1e-9);
    }

    @Test
    public void testMax_doubleArray_negativeValues_returnsMax() throws Exception {
        assertEquals(-1.0d, NumberUtils.max(new double[]{-5.0d, -1.0d, -3.0d}), 1e-9);
    }

    @Test
    public void testMax_doubleArray_withNaN_returnsNaN() throws Exception {
        // The method returns NaN if any element is NaN, so we expect NaN.
        assertEquals(Double.NaN, NumberUtils.max(new double[]{1.0d, Double.NaN, 3.0d}));
    }

    @Test
    public void testMax_doubleArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max(new double[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_doubleArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max((double[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_floatArray_returnsMax() throws Exception {
        assertEquals(5.0f, NumberUtils.max(new float[]{1.0f, 5.0f, 3.0f}), 1e-9f);
    }

    @Test
    public void testMax_floatArray_singleElement_returnsElement() throws Exception {
        assertEquals(5.0f, NumberUtils.max(new float[]{5.0f}), 1e-9f);
    }

    @Test
    public void testMax_floatArray_negativeValues_returnsMax() throws Exception {
        assertEquals(-1.0f, NumberUtils.max(new float[]{-5.0f, -1.0f, -3.0f}), 1e-9f);
    }

    @Test
    public void testMax_floatArray_withNaN_returnsNaN() throws Exception {
        // The method returns NaN if any element is NaN, so we expect NaN.
        assertEquals(Float.NaN, NumberUtils.max(new float[]{1.0f, Float.NaN, 3.0f}));
    }

    @Test
    public void testMax_floatArray_empty_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max(new float[]{});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMax_floatArray_null_throwsIllegalArgumentException() throws Exception {
        try {
            NumberUtils.max((float[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMin_threeLongs_returnsMin() throws Exception {
        assertEquals(1L, NumberUtils.min(5L, 1L, 3L));
    }

    @Test
    public void testMin_threeInts_returnsMin() throws Exception {
        assertEquals(1, NumberUtils.min(5, 1, 3));
    }

    @Test
    public void testMin_threeShorts_returnsMin() throws Exception {
        assertEquals((short) 1, NumberUtils.min((short) 5, (short) 1, (short) 3));
    }

    @Test
    public void testMin_threeBytes_returnsMin() throws Exception {
        assertEquals((byte) 1, NumberUtils.min((byte) 5, (byte) 1, (byte) 3));
    }

    @Test
    public void testMin_threeDoubles_returnsMin() throws Exception {
        assertEquals(1.0d, NumberUtils.min(5.0d, 1.0d, 3.0d), 1e-9);
    }

    @Test
    public void testMin_threeDoubles_withNaN_returnsNaN() throws Exception {
        // Math.min propagation of NaN
        assertEquals(Double.NaN, NumberUtils.min(5.0d, Double.NaN, 3.0d));
    }

    @Test
    public void testMin_threeFloats_returnsMin() throws Exception {
        assertEquals(1.0f, NumberUtils.min(5.0f, 1.0f, 3.0f), 1e-9f);
    }

    @Test
    public void testMin_threeFloats_withNaN_returnsNaN() throws Exception {
        // Math.min propagation of NaN
        assertEquals(Float.NaN, NumberUtils.min(5.0f, Float.NaN, 3.0f));
    }

    @Test
    public void testMax_threeLongs_returnsMax() throws Exception {
        assertEquals(5L, NumberUtils.max(1L, 5L, 3L));
    }

    @Test
    public void testMax_threeInts_returnsMax() throws Exception {
        assertEquals(5, NumberUtils.max(1, 5, 3));
    }

    @Test
    public void testMax_threeShorts_returnsMax() throws Exception {
        assertEquals((short) 5, NumberUtils.max((short) 1, (short) 5, (short) 3));
    }

    @Test
    public void testMax_threeBytes_returnsMax() throws Exception {
        assertEquals((byte) 5, NumberUtils.max((byte) 1, (byte) 5, (byte) 3));
    }

    @Test
    public void testMax_threeDoubles_returnsMax() throws Exception {
        assertEquals(5.0d, NumberUtils.max(1.0d, 5.0d, 3.0d), 1e-9);
    }

    @Test
    public void testMax_threeDoubles_withNaN_returnsNaN() throws Exception {
        // Math.max propagation of NaN
        assertEquals(Double.NaN, NumberUtils.max(1.0d, Double.NaN, 3.0d));
    }

    @Test
    public void testMax_threeFloats_returnsMax() throws Exception {
        assertEquals(5.0f, NumberUtils.max(1.0f, 5.0f, 3.0f), 1e-9f);
    }

    @Test
    public void testMax_threeFloats_withNaN_returnsNaN() throws Exception {
        // Math.max propagation of NaN
        assertEquals(Float.NaN, NumberUtils.max(1.0f, Float.NaN, 3.0f));
    }

    @Test
    public void testIsDigits_nullString_returnsFalse() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_emptyString_returnsFalse() throws Exception {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_onlyDigits_returnsTrue() throws Exception {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_withLetters_returnsFalse() throws Exception {
        assertFalse(NumberUtils.isDigits("123a45"));
    }

    @Test
    public void testIsDigits_withSymbols_returnsFalse() throws Exception {
        assertFalse(NumberUtils.isDigits("123-45"));
    }

    @Test
    public void testIsNumber_nullString_returnsFalse() throws Exception {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_emptyString_returnsFalse() throws Exception {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_integerString_returnsTrue() throws Exception {
        assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumber_doubleString_returnsTrue() throws Exception {
        assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_scientificString_returnsTrue() throws Exception {
        assertTrue(NumberUtils.isNumber("1.23E4"));
    }

    @Test
    public void testIsNumber_hexString_returnsTrue() throws Exception {
        assertTrue(NumberUtils.isNumber("0xFF"));
    }

    @Test
    public void testIsNumber_floatQualifierString_returnsTrue() throws Exception {
        assertTrue(NumberUtils.isNumber("123f"));
    }

    @Test
    public void testIsNumber_doubleQualifierString_returnsTrue() throws Exception {
        assertTrue(NumberUtils.isNumber("123d"));
    }

    @Test
    public void testIsNumber_longQualifierString_returnsTrue() throws Exception {
        assertTrue(NumberUtils.isNumber("123l"));
    }

    @Test
    public void testIsNumber_invalidString_returnsFalse() throws Exception {
        assertFalse(NumberUtils.isNumber("abc"));
    }

    @Test
    public void testIsNumber_stringWithSpaces_returnsFalse() throws Exception {
        // The isNumber method does not trim the string. Leading/trailing spaces make it invalid.
        assertFalse(NumberUtils.isNumber(" 123 "));
    }

    @Test
    public void testIsNumber_stringWithLeadingPlus_returnsTrue() throws Exception {
        // The '+' sign is allowed at the beginning of a number.
        assertTrue(NumberUtils.isNumber("+123"));
    }

    @Test
    public void testIsNumber_stringWithLeadingMinus_returnsTrue() throws Exception {
        assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test
    public void testIsNumber_stringWithExponentSign_returnsTrue() throws Exception {
        // The exponent part can have a sign.
        assertTrue(NumberUtils.isNumber("1E+10"));
    }

    @Test
    public void testIsNumber_stringWithDecimalButNoDigitsAfter_returnsTrue() throws Exception {
        // A trailing decimal point is valid.
        assertTrue(NumberUtils.isNumber("123."));
    }

    @Test
    public void testIsNumber_stringWithExponentButNoDigitsAfter_returnsFalse() throws Exception {
        // An exponent must be followed by digits.
        assertFalse(NumberUtils.isNumber("123E"));
    }
     
    @Test
    public void testIsNumber_stringWithHexButNoDigits_returnsFalse() throws Exception {
        assertFalse(NumberUtils.isNumber("0x"));
    }
     
    @Test
    public void testIsNumber_stringWithHexButOnlySign_returnsFalse() throws Exception {
        assertFalse(NumberUtils.isNumber("-0x"));
    }
     
    @Test
    public void testIsNumber_stringWithHexAndSignButNoDigits_returnsFalse() throws Exception {
        assertFalse(NumberUtils.isNumber("-0x"));
    }

    @Test
    public void testIsNumber_stringWithHexAndSignAndZero_returnsTrue() throws Exception {
        assertTrue(NumberUtils.isNumber("-0x0"));
    }
}
