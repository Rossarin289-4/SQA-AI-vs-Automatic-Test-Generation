package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {

    // --- Test Methods ---

    // toInt(String)
    @Test
    public void testToInt_nullString() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToInt_emptyString() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToInt_validInteger() {
        assertEquals(123, NumberUtils.toInt("123"));
    }

    @Test
    public void testToInt_invalidInteger() {
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToInt_largeInteger() {
        // Integer.MAX_VALUE is 2147483647. Providing a value one greater.
        assertEquals(0, NumberUtils.toInt("2147483648"));
    }

    @Test
    public void testToInt_negativeInteger() {
        assertEquals(-456, NumberUtils.toInt("-456"));
    }

    // toInt(String, int)
    @Test
    public void testToInt_defaultValue_nullString() {
        assertEquals(99, NumberUtils.toInt(null, 99));
    }

    @Test
    public void testToInt_defaultValue_emptyString() {
        assertEquals(99, NumberUtils.toInt("", 99));
    }

    @Test
    public void testToInt_defaultValue_validInteger() {
        assertEquals(456, NumberUtils.toInt("456", 99));
    }

    @Test
    public void testToInt_defaultValue_invalidInteger() {
        assertEquals(99, NumberUtils.toInt("xyz", 99));
    }

    // toLong(String)
    @Test
    public void testToLong_nullString() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLong_emptyString() {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLong_validLong() {
        assertEquals(12345L, NumberUtils.toLong("12345"));
    }

    @Test
    public void testToLong_invalidLong() {
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLong_largeLong() {
        // Long.MAX_VALUE is 9223372036854775807. Providing a value one greater.
        assertEquals(0L, NumberUtils.toLong("9223372036854775808"));
    }

    @Test
    public void testToLong_negativeLong() {
        assertEquals(-98765L, NumberUtils.toLong("-98765"));
    }

    // toLong(String, long)
    @Test
    public void testToLong_defaultValue_nullString() {
        assertEquals(789L, NumberUtils.toLong(null, 789L));
    }

    @Test
    public void testToLong_defaultValue_emptyString() {
        assertEquals(789L, NumberUtils.toLong("", 789L));
    }

    @Test
    public void testToLong_defaultValue_validLong() {
        assertEquals(101112L, NumberUtils.toLong("101112", 789L));
    }

    @Test
    public void testToLong_defaultValue_invalidLong() {
        assertEquals(789L, NumberUtils.toLong("def", 789L));
    }

    // toFloat(String)
    @Test
    public void testToFloat_nullString() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    @Test
    public void testToFloat_emptyString() {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    @Test
    public void testToFloat_validFloat() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
    }

    @Test
    public void testToFloat_invalidFloat() {
        assertEquals(0.0f, NumberUtils.toFloat("ghi"), 0.0f);
    }

    @Test
    public void testToFloat_scientificNotation() {
        assertEquals(1.234E5f, NumberUtils.toFloat("1.234E5"), 0.0f);
    }

    @Test
    public void testToFloat_edgeValueMax() {
        assertEquals(Float.MAX_VALUE, NumberUtils.toFloat(Float.toString(Float.MAX_VALUE)), 0.0f);
    }

    @Test
    public void testToFloat_edgeValueMin() {
        assertEquals(Float.MIN_VALUE, NumberUtils.toFloat(Float.toString(Float.MIN_VALUE)), 0.0f);
    }

    // toFloat(String, float)
    @Test
    public void testToFloat_defaultValue_nullString() {
        assertEquals(1.1f, NumberUtils.toFloat(null, 1.1f), 0.0f);
    }

    @Test
    public void testToFloat_defaultValue_emptyString() {
        assertEquals(1.1f, NumberUtils.toFloat("", 1.1f), 0.0f);
    }

    @Test
    public void testToFloat_defaultValue_validFloat() {
        assertEquals(2.5f, NumberUtils.toFloat("2.5", 1.1f), 0.0f);
    }

    @Test
    public void testToFloat_defaultValue_invalidFloat() {
        assertEquals(1.1f, NumberUtils.toFloat("jkl", 1.1f), 0.0f);
    }

    // toDouble(String)
    @Test
    public void testToDouble_nullString() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    @Test
    public void testToDouble_emptyString() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    @Test
    public void testToDouble_validDouble() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
    }

    @Test
    public void testToDouble_invalidDouble() {
        assertEquals(0.0d, NumberUtils.toDouble("mno"), 0.0d);
    }

    @Test
    public void testToDouble_scientificNotation() {
        assertEquals(1.23456789E10d, NumberUtils.toDouble("1.23456789E10"), 0.0d);
    }

    @Test
    public void testToDouble_edgeValueMax() {
        assertEquals(Double.MAX_VALUE, NumberUtils.toDouble(Double.toString(Double.MAX_VALUE)), 0.0d);
    }

    @Test
    public void testToDouble_edgeValueMin() {
        assertEquals(Double.MIN_VALUE, NumberUtils.toDouble(Double.toString(Double.MIN_VALUE)), 0.0d);
    }

    // toDouble(String, double)
    @Test
    public void testToDouble_defaultValue_nullString() {
        assertEquals(2.2d, NumberUtils.toDouble(null, 2.2d), 0.0d);
    }

    @Test
    public void testToDouble_defaultValue_emptyString() {
        assertEquals(2.2d, NumberUtils.toDouble("", 2.2d), 0.0d);
    }

    @Test
    public void testToDouble_defaultValue_validDouble() {
        assertEquals(3.5d, NumberUtils.toDouble("3.5", 2.2d), 0.0d);
    }

    @Test
    public void testToDouble_defaultValue_invalidDouble() {
        assertEquals(2.2d, NumberUtils.toDouble("pqr", 2.2d), 0.0d);
    }

    // toByte(String)
    @Test
    public void testToByte_nullString() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByte_emptyString() {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByte_validByte() {
        assertEquals((byte) 123, NumberUtils.toByte("123"));
    }

    @Test
    public void testToByte_invalidByte() {
        assertEquals((byte) 0, NumberUtils.toByte("stu"));
    }

    @Test
    public void testToByte_tooLarge() {
        // Byte.MAX_VALUE is 127. Providing a value one greater.
        assertEquals((byte) 0, NumberUtils.toByte("128"));
    }

    @Test
    public void testToByte_tooSmall() {
        // Byte.MIN_VALUE is -128. Providing a value one smaller.
        assertEquals((byte) 0, NumberUtils.toByte("-129"));
    }

    // toByte(String, byte)
    @Test
    public void testToByte_defaultValue_nullString() {
        assertEquals((byte) 1, NumberUtils.toByte(null, (byte) 1));
    }

    @Test
    public void testToByte_defaultValue_emptyString() {
        assertEquals((byte) 1, NumberUtils.toByte("", (byte) 1));
    }

    @Test
    public void testToByte_defaultValue_validByte() {
        assertEquals((byte) 10, NumberUtils.toByte("10", (byte) 1));
    }

    @Test
    public void testToByte_defaultValue_invalidByte() {
        assertEquals((byte) 1, NumberUtils.toByte("vwx", (byte) 1));
    }

    // toShort(String)
    @Test
    public void testToShort_nullString() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShort_emptyString() {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShort_validShort() {
        assertEquals((short) 1234, NumberUtils.toShort("1234"));
    }

    @Test
    public void testToShort_invalidShort() {
        assertEquals((short) 0, NumberUtils.toShort("yz"));
    }

    @Test
    public void testToShort_tooLarge() {
        // Short.MAX_VALUE is 32767. Providing a value one greater.
        assertEquals((short) 0, NumberUtils.toShort("32768"));
    }

    @Test
    public void testToShort_tooSmall() {
        // Short.MIN_VALUE is -32768. Providing a value one smaller.
        assertEquals((short) 0, NumberUtils.toShort("-32769"));
    }

    // toShort(String, short)
    @Test
    public void testToShort_defaultValue_nullString() {
        assertEquals((short) 2, NumberUtils.toShort(null, (short) 2));
    }

    @Test
    public void testToShort_defaultValue_emptyString() {
        assertEquals((short) 2, NumberUtils.toShort("", (short) 2));
    }

    @Test
    public void testToShort_defaultValue_validShort() {
        assertEquals((short) 100, NumberUtils.toShort("100", (short) 2));
    }

    @Test
    public void testToShort_defaultValue_invalidShort() {
        assertEquals((short) 2, NumberUtils.toShort("zab", (short) 2));
    }

    // createNumber(String)
    @Test
    public void testCreateNumber_nullString() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blankString() {
        NumberUtils.createNumber(" ");
    }

    @Test
    public void testCreateNumber_integer() {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_longHex() {
        Number n = NumberUtils.createNumber("0x123456789"); // Too long for Integer
        assertTrue(n instanceof Long);
        assertEquals(0x123456789L, n.longValue());
    }

    @Test
    public void testCreateNumber_bigIntegerHex() {
        Number n = NumberUtils.createNumber("0x123456789ABCDEF01"); // Too long for Long
        assertTrue(n instanceof BigInteger);
        assertEquals(new BigInteger("123456789ABCDEF01", 16), n);
    }

    @Test
    public void testCreateNumber_floatSimple() {
        Number n = NumberUtils.createNumber("1.5f");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_doubleSimple() {
        Number n = NumberUtils.createNumber("1.5d");
        assertTrue(n instanceof Double);
        assertEquals(1.5d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_bigDecimalSimple() {
        Number n = NumberUtils.createNumber("1.55555555555555555");
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal("1.55555555555555555"), n);
    }

    @Test
    public void testCreateNumber_floatTooPreciseForFloat() {
        // More than 7 decimal places, should become Double or BigDecimal
        Number n = NumberUtils.createNumber("1.12345678");
        assertTrue(n instanceof Double); // or BigDecimal, but Double is likely first
        assertEquals(1.12345678d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_doubleTooPreciseForDouble() {
        // More than 16 decimal places, should become BigDecimal
        Number n = NumberUtils.createNumber("1.123456789012345678");
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal("1.123456789012345678"), n);
    }

    @Test
    public void testCreateNumber_octal() {
        Number n = NumberUtils.createNumber("0123");
        assertTrue(n instanceof Integer);
        assertEquals(0123, n.intValue());
    }

    @Test
    public void testCreateNumber_octalLong() {
        Number n = NumberUtils.createNumber("0777777777777777777"); // Too long for Integer
        assertTrue(n instanceof Long);
        assertEquals(Long.decode("0777777777777777777"), n);
    }
    
    @Test
    public void testCreateNumber_hexWithHash() {
        Number n = NumberUtils.createNumber("#FF00FF");
        assertTrue(n instanceof Integer);
        assertEquals(0xFF00FF, n.intValue());
    }

    @Test
    public void testCreateNumber_negativeHexWithHash() {
        Number n = NumberUtils.createNumber("-#FF00FF");
        assertTrue(n instanceof Integer);
        assertEquals(-0xFF00FF, n.intValue());
    }

    @Test
    public void testCreateNumber_negativeHex() {
        Number n = NumberUtils.createNumber("-0xFF");
        assertTrue(n instanceof Integer);
        assertEquals(-0xFF, n.intValue());
    }

    @Test
    public void testCreateNumber_veryLargeDecimal() {
        Number n = NumberUtils.createNumber("12345678901234567890.12345678901234567890");
        assertTrue(n instanceof BigDecimal);
    }

    @Test
    public void testCreateNumber_exponentialDouble() {
        Number n = NumberUtils.createNumber("1.23e4");
        assertTrue(n instanceof Double);
        assertEquals(1.23e4, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_exponentialFloat() {
        Number n = NumberUtils.createNumber("1.23e4f");
        assertTrue(n instanceof Float);
        assertEquals(1.23e4f, n.floatValue(), 0.0f);
    }
    
    @Test
    public void testCreateNumber_edgeCase_zeroF() {
        Number n = NumberUtils.createNumber("0.0f");
        assertTrue(n instanceof Float);
        assertEquals(0.0f, n.floatValue(), 0.0f);
    }
    
    @Test
    public void testCreateNumber_edgeCase_zeroD() {
        Number n = NumberUtils.createNumber("0.0d");
        assertTrue(n instanceof Double);
        assertEquals(0.0d, n.doubleValue(), 0.0d);
    }
    
    @Test
    public void testCreateNumber_edgeCase_zero() {
        Number n = NumberUtils.createNumber("0");
        assertTrue(n instanceof Integer);
        assertEquals(0, n.intValue());
    }

    @Test
    public void testCreateNumber_edgeCase_zeroL() {
        Number n = NumberUtils.createNumber("0L");
        assertTrue(n instanceof Long);
        assertEquals(0L, n.longValue());
    }

    @Test
    public void testCreateNumber_edgeCase_zeroBigInteger() {
        Number n = NumberUtils.createNumber("0");
        assertTrue(n instanceof Integer); // Default to Integer for "0"
        assertEquals(0, n.intValue());
    }
    
    @Test
    public void testCreateNumber_edgeCase_zeroBigDecimal() {
        Number n = NumberUtils.createNumber("0.0");
        assertTrue(n instanceof BigDecimal);
        assertEquals(BigDecimal.ZERO, n);
    }

    // isDigits(String)
    @Test
    public void testIsDigits_nullString() {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_emptyString() {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_onlyDigits() {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_withLetters() {
        assertFalse(NumberUtils.isDigits("123a"));
    }

    @Test
    public void testIsDigits_withDecimal() {
        assertFalse(NumberUtils.isDigits("12.3"));
    }

    @Test
    public void testIsDigits_withSign() {
        assertFalse(NumberUtils.isDigits("-123"));
    }

    // isNumber(String)
    @Test
    public void testIsNumber_nullString() {
        assertFalse(NumberUtils.isNumber(null));
    }

    @Test
    public void testIsNumber_emptyString() {
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
        assertTrue(NumberUtils.isNumber("1.5f"));
    }

    @Test
    public void testIsNumber_double() {
        assertTrue(NumberUtils.isNumber("1.5d"));
    }

    @Test
    public void testIsNumber_doubleNoQualifier() {
        assertTrue(NumberUtils.isNumber("1.5"));
    }

    @Test
    public void testIsNumber_scientificFloat() {
        assertTrue(NumberUtils.isNumber("1.2e3f"));
    }

    @Test
    public void testIsNumber_scientificDouble() {
        assertTrue(NumberUtils.isNumber("1.2E3"));
    }

    @Test
    public void testIsNumber_hexInteger() {
        assertTrue(NumberUtils.isNumber("0xFF"));
    }

    @Test
    public void testIsNumber_hexLong() {
        assertTrue(NumberUtils.isNumber("0x123456789"));
    }
    
    @Test
    public void testIsNumber_hexWithHash() {
        // The reference source code for isNumber does not handle '#' as a hex prefix
        assertFalse(NumberUtils.isNumber("#FF00FF")); 
    }

    @Test
    public void testIsNumber_octal() {
        assertTrue(NumberUtils.isNumber("0123"));
    }

    @Test
    public void testIsNumber_invalidHex() {
        assertFalse(NumberUtils.isNumber("0xG"));
    }

    @Test
    public void testIsNumber_invalidScientific() {
        assertFalse(NumberUtils.isNumber("1.2e"));
    }

    @Test
    public void testIsNumber_trailingDecimal() {
        assertTrue(NumberUtils.isNumber("123."));
    }

    @Test
    public void testIsNumber_leadingDecimal() {
        assertTrue(NumberUtils.isNumber(".123"));
    }
    
    @Test
    public void testIsNumber_longHexWithoutPrefix() {
        // This specific case should not be considered a number by isNumber based on the implementation
        assertFalse(NumberUtils.isNumber("123456789ABCDEF01")); 
    }

    @Test
    public void testIsNumber_integerWithL() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_integerWithl() {
        assertTrue(NumberUtils.isNumber("123l"));
    }

    @Test
    public void testIsNumber_invalidE() {
        assertFalse(NumberUtils.isNumber("1e2.5")); // decimal in exponent
    }

    @Test
    public void testIsNumber_emptyAfterSign() {
        assertFalse(NumberUtils.isNumber("-"));
    }

    @Test
    public void testIsNumber_onlyHexPrefix() {
        assertFalse(NumberUtils.isNumber("0x"));
        assertFalse(NumberUtils.isNumber("-0x"));
    }

    @Test
    public void testIsNumber_signOnly() {
        assertFalse(NumberUtils.isNumber("+"));
        assertFalse(NumberUtils.isNumber("-"));
    }

    // Tests for methods that were not called before

    // createFloat(String)
    @Test
    public void testCreateFloat_null() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloat_valid() {
        assertEquals(1.23f, NumberUtils.createFloat("1.23"), 0.0f);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid() {
        NumberUtils.createFloat("abc");
    }

    // createDouble(String)
    @Test
    public void testCreateDouble_null() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDouble_valid() {
        assertEquals(4.56d, NumberUtils.createDouble("4.56"), 0.0d);
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalid() {
        NumberUtils.createDouble("def");
    }

    // createInteger(String)
    @Test
    public void testCreateInteger_null() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateInteger_validDecimal() {
        assertEquals(Integer.valueOf(100), NumberUtils.createInteger("100"));
    }

    @Test
    public void testCreateInteger_validHex() {
        assertEquals(Integer.valueOf(0x1A), NumberUtils.createInteger("0x1A"));
    }

    @Test
    public void testCreateInteger_validOctal() {
        assertEquals(Integer.valueOf(077), NumberUtils.createInteger("077"));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() {
        NumberUtils.createInteger("ghi");
    }

    // createLong(String)
    @Test
    public void testCreateLong_null() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLong_validDecimal() {
        assertEquals(Long.valueOf(200L), NumberUtils.createLong("200"));
    }

    @Test
    public void testCreateLong_validHex() {
        assertEquals(Long.valueOf(0x12345L), NumberUtils.createLong("0x12345"));
    }

    @Test
    public void testCreateLong_validOctal() {
        assertEquals(Long.valueOf(012345L), NumberUtils.createLong("012345"));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() {
        NumberUtils.createLong("jkl");
    }

    // createBigInteger(String)
    @Test
    public void testCreateBigInteger_null() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigInteger_validDecimal() {
        assertEquals(new BigInteger("300"), NumberUtils.createBigInteger("300"));
    }

    @Test
    public void testCreateBigInteger_validHex() {
        assertEquals(new BigInteger("ABCDEF", 16), NumberUtils.createBigInteger("0xABCDEF"));
    }

    @Test
    public void testCreateBigInteger_validHexHash() {
        assertEquals(new BigInteger("FEDCBA", 16), NumberUtils.createBigInteger("#FEDCBA"));
    }

    @Test
    public void testCreateBigInteger_validOctal() {
        assertEquals(new BigInteger("07654", 8), NumberUtils.createBigInteger("07654"));
    }

    @Test
    public void testCreateBigInteger_negativeHex() {
        assertEquals(new BigInteger("-1A", 16), NumberUtils.createBigInteger("-0x1A"));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalid() {
        NumberUtils.createBigInteger("mno");
    }

    // createBigDecimal(String)
    @Test
    public void testCreateBigDecimal_null() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test
    public void testCreateBigDecimal_valid() {
        assertEquals(new BigDecimal("123.456"), NumberUtils.createBigDecimal("123.456"));
    }

    @Test
    public void testCreateBigDecimal_validWithExp() {
        assertEquals(new BigDecimal("1.23E+3"), NumberUtils.createBigDecimal("1.23E+3"));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blankString() {
        NumberUtils.createBigDecimal(" ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_invalid() {
        NumberUtils.createBigDecimal("pqr");
    }

    // min(long[])
    @Test
    public void testMin_longArray_basic() {
        assertEquals(1L, NumberUtils.min(new long[]{3L, 1L, 2L}));
    }

    @Test
    public void testMin_longArray_singleElement() {
        assertEquals(5L, NumberUtils.min(new long[]{5L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_longArray_null() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMin_longArray_empty() {
        NumberUtils.min(new long[]{});
    }

    // max(long[])
    @Test
    public void testMax_longArray_basic() {
        assertEquals(3L, NumberUtils.max(new long[]{1L, 3L, 2L}));
    }

    @Test
    public void testMax_longArray_singleElement() {
        assertEquals(5L, NumberUtils.max(new long[]{5L}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_longArray_null() {
        NumberUtils.max((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMax_longArray_empty() {
        NumberUtils.max(new long[]{});
    }
}
