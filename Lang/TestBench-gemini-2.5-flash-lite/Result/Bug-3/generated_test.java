package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {

    @Test
    public void testToInt_null() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_empty() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_valid() {
        assertEquals(123, NumberUtils.toInt("123"));
    }

    @Test
    public void testToInt_invalid() {
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToInt_withDefault_null() {
        assertEquals(5, NumberUtils.toInt(null, 5));
    }

    @Test
    public void testToInt_withDefault_empty() {
        assertEquals(5, NumberUtils.toInt("", 5));
    }

    @Test
    public void testToInt_withDefault_valid() {
        assertEquals(123, NumberUtils.toInt("123", 5));
    }

    @Test
    public void testToInt_withDefault_invalid() {
        assertEquals(5, NumberUtils.toInt("abc", 5));
    }

    @Test
    public void testToLong_null() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_empty() {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLong_valid() {
        assertEquals(123L, NumberUtils.toLong("123"));
    }

    @Test
    public void testToLong_invalid() {
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLong_withDefault_null() {
        assertEquals(5L, NumberUtils.toLong(null, 5L));
    }

    @Test
    public void testToLong_withDefault_empty() {
        assertEquals(5L, NumberUtils.toLong("", 5L));
    }

    @Test
    public void testToLong_withDefault_valid() {
        assertEquals(123L, NumberUtils.toLong("123", 5L));
    }

    @Test
    public void testToLong_withDefault_invalid() {
        assertEquals(5L, NumberUtils.toLong("abc", 5L));
    }

    @Test
    public void testToFloat_null() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    @Test
    public void testToFloat_empty() {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    @Test
    public void testToFloat_valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
    }

    @Test
    public void testToFloat_invalid() {
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0f);
    }

    @Test
    public void testToFloat_withDefault_null() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0f);
    }

    @Test
    public void testToFloat_withDefault_empty() {
        assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.0f);
    }

    @Test
    public void testToFloat_withDefault_valid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0f);
    }

    @Test
    public void testToFloat_withDefault_invalid() {
        assertEquals(1.1f, NumberUtils.toFloat("abc", 1.1f), 0.0f);
    }

    @Test
    public void testToDouble_null() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    @Test
    public void testToDouble_empty() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    @Test
    public void testToDouble_valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
    }

    @Test
    public void testToDouble_invalid() {
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0d);
    }

    @Test
    public void testToDouble_withDefault_null() {
        assertEquals(1.1d, NumberUtils.toDouble(null, 1.1d), 0.0d);
    }

    @Test
    public void testToDouble_withDefault_empty() {
        assertEquals(1.1d, NumberUtils.toDouble("", 1.1d), 0.0d);
    }

    @Test
    public void testToDouble_withDefault_valid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0d);
    }

    @Test
    public void testToDouble_withDefault_invalid() {
        assertEquals(1.1d, NumberUtils.toDouble("abc", 1.1d), 0.0d);
    }

    @Test
    public void testToByte_null() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_empty() {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByte_valid() {
        assertEquals((byte) 1, NumberUtils.toByte("1"));
    }

    @Test
    public void testToByte_invalid() {
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByte_withDefault_null() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByte_withDefault_empty() {
        assertEquals((byte) 1, NumberUtils.toByte("", (byte) 1));
    }

    @Test
    public void testToByte_withDefault_valid() {
        assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
    }

    @Test
    public void testToByte_withDefault_invalid() {
        assertEquals((byte) 1, NumberUtils.toByte("abc", (byte) 1));
    }

    @Test
    public void testToShort_null() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_empty() {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShort_valid() {
        assertEquals((short) 1, NumberUtils.toShort("1"));
    }

    @Test
    public void testToShort_invalid() {
        assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShort_withDefault_null() {
        assertEquals((short) 1, NumberUtils.toShort(null, (short) 1));
    }

    @Test
    public void testToShort_withDefault_empty() {
        assertEquals((short) 1, NumberUtils.toShort("", (short) 1));
    }

    @Test
    public void testToShort_withDefault_valid() {
        assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
    }

    @Test
    public void testToShort_withDefault_invalid() {
        assertEquals((short) 1, NumberUtils.toShort("abc", (short) 1));
    }

    @Test
    public void testCreateNumber_null() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test
    public void testCreateNumber_empty() {
        try {
            NumberUtils.createNumber("");
            fail("Expected NumberFormatException for blank string");
        } catch (NumberFormatException expected) {
            // expected
        }
    }

    @Test
    public void testCreateNumber_integer() {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_long() {
        Number n = NumberUtils.createNumber("12345678901");
        assertTrue(n instanceof Long);
        assertEquals(12345678901L, n.longValue());
    }

    @Test
    public void testCreateNumber_float() {
        Number n = NumberUtils.createNumber("1.5f");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_double() {
        Number n = NumberUtils.createNumber("1.5d");
        assertTrue(n instanceof Double);
        assertEquals(1.5d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_bigIntegerHex() {
        Number n = NumberUtils.createNumber("0x1A");
        assertTrue(n instanceof Integer); // Hex literal with few digits results in Integer
        assertEquals(26, n.intValue());
    }
    
    @Test
    public void testCreateNumber_bigIntegerHexLong() {
        Number n = NumberUtils.createNumber("0x10000000"); // Hex literal with more than 8 digits but fitting in Long
        assertTrue(n instanceof Long);
        assertEquals(268435456L, n.longValue());
    }

    @Test
    public void testCreateNumber_bigIntegerOctal() {
        Number n = NumberUtils.createNumber("077");
        assertTrue(n instanceof Integer); // Octal literal with few digits results in Integer
        assertEquals(63, n.intValue());
    }
    
    @Test
    public void testCreateNumber_bigIntegerOctalLong() {
        Number n = NumberUtils.createNumber("01000000000"); // Octal literal with more than 8 digits but fitting in Long
        assertTrue(n instanceof Long);
        assertEquals(268435456L, n.longValue());
    }

    @Test
    public void testCreateNumber_bigDecimal() {
        Number n = NumberUtils.createNumber("123.456");
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal("123.456"), n);
    }

    @Test
    public void testCreateNumber_hexTooLongForLong() {
        Number n = NumberUtils.createNumber("0x100000000"); // 2^32
        assertTrue(n instanceof Long);
        assertEquals(4294967296L, n.longValue());
    }

    @Test
    public void testCreateNumber_hexTooLongForInteger() {
        Number n = NumberUtils.createNumber("0x1000000000"); // 2^40
        assertTrue(n instanceof BigInteger);
        assertEquals(new BigInteger("1099511627776"), n);
    }

    @Test
    public void testCreateNumber_floatScientific() {
        Number n = NumberUtils.createNumber("1.2e3f");
        assertTrue(n instanceof Float);
        assertEquals(1200.0f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_doubleScientific() {
        Number n = NumberUtils.createNumber("1.2E3d");
        assertTrue(n instanceof Double);
        assertEquals(1200.0d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_decimalWithExponent() {
        Number n = NumberUtils.createNumber("1.234E-5");
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal("0.00001234"), n);
    }

    @Test
    public void testCreateNumber_negativeHex() {
        Number n = NumberUtils.createNumber("-0xFF");
        assertTrue(n instanceof Integer);
        assertEquals(-255, n.intValue());
    }
    
    @Test
    public void testCreateNumber_negativeHexLong() {
        Number n = NumberUtils.createNumber("-0x10000000");
        assertTrue(n instanceof Long);
        assertEquals(-268435456L, n.longValue());
    }

    @Test
    public void testCreateNumber_negativeOctal() {
        Number n = NumberUtils.createNumber("-010");
        assertTrue(n instanceof Integer);
        assertEquals(-8, n.intValue());
    }

    @Test
    public void testCreateNumber_floatTooLarge() {
        // Max float is ~3.4e38
        Number n = NumberUtils.createNumber("4.0e38f");
        assertTrue(n instanceof Float);
        assertEquals(Float.POSITIVE_INFINITY, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_doubleTooLarge() {
        // Max double is ~1.8e308
        Number n = NumberUtils.createNumber("2.0e308d");
        assertTrue(n instanceof Double);
        assertEquals(Double.POSITIVE_INFINITY, n.doubleValue(), 0.0d);
    }
    
    @Test
    public void testCreateNumber_hexWithHashPrefix() {
        Number n = NumberUtils.createNumber("#FF");
        assertTrue(n instanceof Integer);
        assertEquals(255, n.intValue());
    }

    @Test
    public void testCreateNumber_negativeHexWithHashPrefix() {
        Number n = NumberUtils.createNumber("-#FF");
        assertTrue(n instanceof Integer);
        assertEquals(-255, n.intValue());
    }

    @Test
    public void testCreateNumber_floatWithHexPrefix() {
        // Hex float is not supported by Float.parseFloat
        try {
            NumberUtils.createNumber("0x1.0p0f");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateNumber_doubleWithHexPrefix() {
        // Hex double is not supported by Double.parseDouble
        try {
            NumberUtils.createNumber("0x1.0p0d");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateNumber_withTrailingDecimalPoint() {
        Number n = NumberUtils.createNumber("123.");
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal("123"), n);
    }

    @Test
    public void testCreateNumber_withTrailingDecimalPointAndExponent() {
        Number n = NumberUtils.createNumber("123.e3");
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal("123000"), n);
    }

    @Test
    public void testCreateNumber_allZerosString() {
        Number n = NumberUtils.createNumber("0");
        assertTrue(n instanceof Integer);
        assertEquals(0, n.intValue());
    }

    @Test
    public void testCreateNumber_zeroHex() {
        Number n = NumberUtils.createNumber("0x0");
        assertTrue(n instanceof Integer);
        assertEquals(0, n.intValue());
    }

    @Test
    public void testCreateNumber_zeroOctal() {
        Number n = NumberUtils.createNumber("00");
        assertTrue(n instanceof Integer);
        assertEquals(0, n.intValue());
    }

    @Test
    public void testCreateNumber_scientificNotationWithPlus() {
        Number n = NumberUtils.createNumber("1.2e+3");
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal("1200"), n);
    }
    
    @Test
    public void testCreateNumber_scientificNotationWithMinus() {
        Number n = NumberUtils.createNumber("1.2e-3");
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal("0.0012"), n);
    }

    @Test
    public void testCreateNumber_validLongHex() {
        Number n = NumberUtils.createNumber("0x7FFFFFFF");
        assertTrue(n instanceof Integer);
        assertEquals(Integer.MAX_VALUE, n.intValue());
    }

    @Test
    public void testCreateNumber_invalidLongHex() {
        Number n = NumberUtils.createNumber("0x80000000"); // too large for int
        assertTrue(n instanceof Long);
        assertEquals(2147483648L, n.longValue());
    }
    
    @Test
    public void testCreateNumber_validLongHex2() {
        Number n = NumberUtils.createNumber("0x7FFFFFFFFFFFFFFFL");
        assertTrue(n instanceof Long);
        assertEquals(Long.MAX_VALUE, n.longValue());
    }

    @Test
    public void testCreateNumber_invalidLongHex2() {
        Number n = NumberUtils.createNumber("0x8000000000000000L"); // too large for long
        assertTrue(n instanceof BigInteger);
        assertEquals(new BigInteger("9223372036854775808"), n);
    }
    
    @Test
    public void testCreateNumber_floatZeroWithNonZeros() {
        Number n = NumberUtils.createNumber("0.0000000000000000000000000000000000001f");
        assertTrue(n instanceof Float);
        assertEquals(0.0f, n.floatValue(), 0.0f); // Too small for float, becomes 0
    }
    
    @Test
    public void testCreateNumber_doubleZeroWithNonZeros() {
        Number n = NumberUtils.createNumber("0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001d");
        assertTrue(n instanceof Double);
        assertEquals(0.0d, n.doubleValue(), 0.0d); // Too small for double, becomes 0
    }

    @Test
    public void testCreateFloat_validHex() {
        // Hex float is not supported by Float.parseFloat
        try {
            NumberUtils.createFloat("0x1.0p1");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }
    
    @Test
    public void testCreateDouble_validHex() {
        // Hex double is not supported by Double.parseDouble
        try {
            NumberUtils.createDouble("0x1.0p1");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateInteger_octal() {
        Number n = NumberUtils.createInteger("010");
        assertTrue(n instanceof Integer);
        assertEquals(8, n.intValue());
    }

    @Test
    public void testCreateInteger_hex() {
        Number n = NumberUtils.createInteger("0x10");
        assertTrue(n instanceof Integer);
        assertEquals(16, n.intValue());
    }

    @Test
    public void testCreateInteger_negativeHex() {
        Number n = NumberUtils.createInteger("-0x10");
        assertTrue(n instanceof Integer);
        assertEquals(-16, n.intValue());
    }

    @Test
    public void testCreateLong_octal() {
        Number n = NumberUtils.createLong("01000000000");
        assertTrue(n instanceof Long);
        assertEquals(268435456L, n.longValue());
    }

    @Test
    public void testCreateLong_hex() {
        Number n = NumberUtils.createLong("0x10000000");
        assertTrue(n instanceof Long);
        assertEquals(268435456L, n.longValue());
    }
    
    @Test
    public void testCreateLong_negativeHex() {
        Number n = NumberUtils.createLong("-0x10000000");
        assertTrue(n instanceof Long);
        assertEquals(-268435456L, n.longValue());
    }
    
    @Test
    public void testCreateBigInteger_empty() {
        try {
            NumberUtils.createBigInteger("");
            fail("Expected NumberFormatException for blank string");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateBigInteger_hexPrefixOnly() {
        try {
            NumberUtils.createBigInteger("0x");
            fail("Expected NumberFormatException for hex prefix only");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateBigInteger_hashPrefixOnly() {
        try {
            NumberUtils.createBigInteger("#");
            fail("Expected NumberFormatException for hash prefix only");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateBigInteger_octalPrefixOnly() {
        // createBigInteger("0") results in BigInteger.ZERO, not an exception
        assertEquals(BigInteger.ZERO, NumberUtils.createBigInteger("0"));
    }
    
    @Test
    public void testCreateBigInteger_negativeHexWithNoDigits() {
        try {
            NumberUtils.createBigInteger("-0x");
            fail("Expected NumberFormatException for negative hex prefix only");
        } catch (NumberFormatException e) {
            // Expected
        }
    }
    
    @Test
    public void testCreateBigInteger_largeNegativeHex() {
        Number n = NumberUtils.createBigInteger("-0xFFFFFFFFFFFFFFFF");
        assertTrue(n instanceof BigInteger);
        assertEquals(new BigInteger("-18446744073709551615"), n);
    }

    @Test
    public void testCreateBigDecimal_blank() {
        try {
            NumberUtils.createBigDecimal(" ");
            fail("Expected NumberFormatException for blank string");
        } catch (NumberFormatException expected) {
            // expected
        }
    }

    @Test
    public void testCreateBigDecimal_doubleDash() {
        try {
            NumberUtils.createBigDecimal("--1");
            fail("Expected NumberFormatException for double dash");
        } catch (NumberFormatException expected) {
            // expected
        }
    }

    @Test
    public void testMinLongArray_empty() {
        try {
            NumberUtils.min(new long[0]);
            fail("Expected IllegalArgumentException for empty array");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testMinLongArray_null() {
        try {
            NumberUtils.min((long[]) null);
            fail("Expected IllegalArgumentException for null array");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testMinLongArray_singleElement() {
        assertEquals(5L, NumberUtils.min(new long[]{5L}));
    }

    @Test
    public void testMinLongArray_multipleElements() {
        assertEquals(-5L, NumberUtils.min(new long[]{5L, 10L, -5L, 0L}));
    }
    
    @Test
    public void testMinIntArray_multipleElements() {
        assertEquals(-5, NumberUtils.min(new int[]{5, 10, -5, 0}));
    }

    @Test
    public void testMinShortArray_multipleElements() {
        assertEquals((short) -5, NumberUtils.min(new short[]{5, 10, -5, 0}));
    }

    @Test
    public void testMinByteArray_multipleElements() {
        assertEquals((byte) -5, NumberUtils.min(new byte[]{5, 10, -5, 0}));
    }

    @Test
    public void testMinDoubleArray_multipleElements() {
        assertEquals(-5.5, NumberUtils.min(new double[]{5.5, 10.1, -5.5, 0.0}), 0.0d);
    }

    @Test
    public void testMinDoubleArray_withNaN() {
        assertEquals(Double.NaN, NumberUtils.min(new double[]{5.5, Double.NaN, -5.5, 0.0}), 0.0d);
    }

    @Test
    public void testMinFloatArray_multipleElements() {
        assertEquals(-5.5f, NumberUtils.min(new float[]{5.5f, 10.1f, -5.5f, 0.0f}), 0.0f);
    }

    @Test
    public void testMinFloatArray_withNaN() {
        assertEquals(Float.NaN, NumberUtils.min(new float[]{5.5f, Float.NaN, -5.5f, 0.0f}), 0.0f);
    }

    @Test
    public void testMaxLongArray_multipleElements() {
        assertEquals(10L, NumberUtils.max(new long[]{5L, 10L, -5L, 0L}));
    }

    @Test
    public void testMaxIntArray_multipleElements() {
        assertEquals(10, NumberUtils.max(new int[]{5, 10, -5, 0}));
    }

    @Test
    public void testMaxShortArray_multipleElements() {
        assertEquals((short) 10, NumberUtils.max(new short[]{5, 10, -5, 0}));
    }

    @Test
    public void testMaxByteArray_multipleElements() {
        assertEquals((byte) 10, NumberUtils.max(new byte[]{5, 10, -5, 0}));
    }

    @Test
    public void testMaxDoubleArray_multipleElements() {
        assertEquals(10.1d, NumberUtils.max(new double[]{5.5d, 10.1d, -5.5d, 0.0d}), 0.0d);
    }

    @Test
    public void testMaxDoubleArray_withNaN() {
        assertEquals(Double.NaN, NumberUtils.max(new double[]{5.5d, Double.NaN, -5.5d, 0.0d}), 0.0d);
    }

    @Test
    public void testMaxFloatArray_multipleElements() {
        assertEquals(10.1f, NumberUtils.max(new float[]{5.5f, 10.1f, -5.5f, 0.0f}), 0.0f);
    }

    @Test
    public void testMaxFloatArray_withNaN() {
        assertEquals(Float.NaN, NumberUtils.max(new float[]{5.5f, Float.NaN, -5.5f, 0.0f}), 0.0f);
    }
    
    @Test
    public void testIsDigits_null() {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_empty() {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_digitsOnly() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_withLetters() {
        assertFalse(NumberUtils.isDigits("123a"));
    }

    @Test
    public void testIsDigits_withDecimal() {
        assertFalse(NumberUtils.isDigits("123.45"));
    }

    @Test
    public void testIsDigits_withExponent() {
        assertFalse(NumberUtils.isDigits("123e4"));
    }

    @Test
    public void testIsDigits_withSign() {
        assertFalse(NumberUtils.isDigits("-123"));
    }

    @Test
    public void testIsNumber_null() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_empty() {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_integer() {
        assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumber_negativeInteger() {
        assertTrue(NumberUtils.isNumber("-123"));
    }

    @Test
    public void testIsNumber_float() {
        assertTrue(NumberUtils.isNumber("1.23f"));
    }

    @Test
    public void testIsNumber_double() {
        assertTrue(NumberUtils.isNumber("1.23d"));
    }

    @Test
    public void testIsNumber_hex() {
        assertTrue(NumberUtils.isNumber("0x123"));
    }
    
    @Test
    public void testIsNumber_negativeHex() {
        assertTrue(NumberUtils.isNumber("-0x123"));
    }
    
    @Test
    public void testIsNumber_hexWithHash() {
        assertTrue(NumberUtils.isNumber("#123"));
    }

    @Test
    public void testIsNumber_negativeHexWithHash() {
        assertTrue(NumberUtils.isNumber("-#123"));
    }

    @Test
    public void testIsNumber_scientificNotation() {
        assertTrue(NumberUtils.isNumber("1.23E4"));
    }

    @Test
    public void testIsNumber_scientificNotationWithSign() {
        assertTrue(NumberUtils.isNumber("1.23e+4"));
    }
    
    @Test
    public void testIsNumber_scientificNotationWithNegativeSign() {
        assertTrue(NumberUtils.isNumber("1.23e-4"));
    }

    @Test
    public void testIsNumber_longTypeQualifier() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_floatTypeQualifier() {
        assertTrue(NumberUtils.isNumber("123f"));
    }

    @Test
    public void testIsNumber_doubleTypeQualifier() {
        assertTrue(NumberUtils.isNumber("123d"));
    }

    @Test
    public void testIsNumber_leadingZeroOctal() {
        assertTrue(NumberUtils.isNumber("0123"));
    }

    @Test
    public void testIsNumber_trailingDecimalPoint() {
        assertTrue(NumberUtils.isNumber("123."));
    }

    @Test
    public void testIsNumber_decimalAndExponent() {
        assertTrue(NumberUtils.isNumber("123.e4"));
    }

    @Test
    public void testIsNumber_invalidHex() {
        assertFalse(NumberUtils.isNumber("0xG"));
    }

    @Test
    public void testIsNumber_exponentWithoutDigit() {
        assertFalse(NumberUtils.isNumber("123e"));
    }

    @Test
    public void testIsNumber_exponentWithSignOnly() {
        assertFalse(NumberUtils.isNumber("123e+"));
    }
    
    @Test
    public void testIsNumber_doubleDecimalPoint() {
        assertFalse(NumberUtils.isNumber("1.2.3"));
    }
    
    @Test
    public void testIsNumber_onlySign() {
        assertFalse(NumberUtils.isNumber("-"));
    }
    
    @Test
    public void testIsNumber_onlyPlus() {
        assertFalse(NumberUtils.isNumber("+"));
    }
    
    @Test
    public void testIsNumber_hexOnlyPrefix() {
        assertFalse(NumberUtils.isNumber("0x"));
    }

    @Test
    public void testIsNumber_hashOnlyPrefix() {
        assertFalse(NumberUtils.isNumber("#"));
    }
    
    @Test
    public void testIsNumber_decimalPointWithoutDigit() {
        assertFalse(NumberUtils.isNumber("."));
    }

    @Test
    public void testIsNumber_withSpaces() {
        assertFalse(NumberUtils.isNumber(" 123 "));
    }

    @Test
    public void testMin3Long_standard() {
        assertEquals(5L, NumberUtils.min(10L, 5L, 15L));
    }

    @Test
    public void testMin3Int_standard() {
        assertEquals(5, NumberUtils.min(10, 5, 15));
    }

    @Test
    public void testMin3Short_standard() {
        assertEquals((short) 5, NumberUtils.min((short) 10, (short) 5, (short) 15));
    }

    @Test
    public void testMin3Byte_standard() {
        assertEquals((byte) 5, NumberUtils.min((byte) 10, (byte) 5, (byte) 15));
    }

    @Test
    public void testMin3Double_standard() {
        assertEquals(5.0d, NumberUtils.min(10.0d, 5.0d, 15.0d), 0.0d);
    }

    @Test
    public void testMin3Double_withNaN() {
        assertEquals(Double.NaN, NumberUtils.min(10.0d, Double.NaN, 15.0d), 0.0d);
    }

    @Test
    public void testMin3Float_standard() {
        assertEquals(5.0f, NumberUtils.min(10.0f, 5.0f, 15.0f), 0.0f);
    }

    @Test
    public void testMin3Float_withNaN() {
        assertEquals(Float.NaN, NumberUtils.min(10.0f, Float.NaN, 15.0f), 0.0f);
    }

    @Test
    public void testMax3Long_standard() {
        assertEquals(15L, NumberUtils.max(10L, 5L, 15L));
    }

    @Test
    public void testMax3Int_standard() {
        assertEquals(15, NumberUtils.max(10, 5, 15));
    }

    @Test
    public void testMax3Short_standard() {
        assertEquals((short) 15, NumberUtils.max((short) 10, (short) 5, (short) 15));
    }

    @Test
    public void testMax3Byte_standard() {
        assertEquals((byte) 15, NumberUtils.max((byte) 10, (byte) 5, (byte) 15));
    }

    @Test
    public void testMax3Double_standard() {
        assertEquals(15.0d, NumberUtils.max(10.0d, 5.0d, 15.0d), 0.0d);
    }

    @Test
    public void testMax3Double_withNaN() {
        assertEquals(Double.NaN, NumberUtils.max(10.0d, Double.NaN, 15.0d), 0.0d);
    }

    @Test
    public void testMax3Float_standard() {
        assertEquals(15.0f, NumberUtils.max(10.0f, 5.0f, 15.0f), 0.0f);
    }

    @Test
    public void testMax3Float_withNaN() {
        assertEquals(Float.NaN, NumberUtils.max(10.0f, Float.NaN, 15.0f), 0.0f);
    }
}
