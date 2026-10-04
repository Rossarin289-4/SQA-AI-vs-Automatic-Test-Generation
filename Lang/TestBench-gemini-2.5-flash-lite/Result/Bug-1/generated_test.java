package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {

    // Test cases for toInt(String) and toInt(String, int)
    @Test
    public void testToInt_nullString_returnsDefault() throws Exception {
        assertEquals(0, NumberUtils.toInt(null, 0));
        assertEquals(5, NumberUtils.toInt(null, 5));
    }

    @Test
    public void testToInt_emptyString_returnsDefault() throws Exception {
        assertEquals(0, NumberUtils.toInt("", 0));
        assertEquals(5, NumberUtils.toInt("", 5));
    }

    @Test
    public void testToInt_validString_returnsInteger() throws Exception {
        assertEquals(1, NumberUtils.toInt("1", 0));
        assertEquals(-5, NumberUtils.toInt("-5", 0));
        assertEquals(100, NumberUtils.toInt("100", 0));
    }

    @Test
    public void testToInt_invalidString_returnsDefault() throws Exception {
        assertEquals(0, NumberUtils.toInt("abc", 0));
        assertEquals(5, NumberUtils.toInt("abc", 5));
        assertEquals(0, NumberUtils.toInt("1.5", 0));
    }

    // Test cases for toLong(String) and toLong(String, long)
    @Test
    public void testToLong_nullString_returnsDefault() throws Exception {
        assertEquals(0L, NumberUtils.toLong(null, 0L));
        assertEquals(10L, NumberUtils.toLong(null, 10L));
    }

    @Test
    public void testToLong_emptyString_returnsDefault() throws Exception {
        assertEquals(0L, NumberUtils.toLong("", 0L));
        assertEquals(10L, NumberUtils.toLong("", 10L));
    }

    @Test
    public void testToLong_validString_returnsLong() throws Exception {
        assertEquals(1L, NumberUtils.toLong("1", 0L));
        assertEquals(-5L, NumberUtils.toLong("-5", 0L));
        assertEquals(10000000000L, NumberUtils.toLong("10000000000", 0L));
    }

    @Test
    public void testToLong_invalidString_returnsDefault() throws Exception {
        assertEquals(0L, NumberUtils.toLong("abc", 0L));
        assertEquals(10L, NumberUtils.toLong("abc", 10L));
        assertEquals(0L, NumberUtils.toLong("1.5", 0L));
    }

    // Test cases for toFloat(String) and toFloat(String, float)
    @Test
    public void testToFloat_nullString_returnsDefault() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat(null, 0.0f), 0.0f);
        assertEquals(1.5f, NumberUtils.toFloat(null, 1.5f), 0.0f);
    }

    @Test
    public void testToFloat_emptyString_returnsDefault() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat("", 0.0f), 0.0f);
        assertEquals(1.5f, NumberUtils.toFloat("", 1.5f), 0.0f);
    }

    @Test
    public void testToFloat_validString_returnsFloat() throws Exception {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 0.0f), 0.0f);
        assertEquals(-2.3f, NumberUtils.toFloat("-2.3", 0.0f), 0.0f);
        assertEquals(1.0E6f, NumberUtils.toFloat("1.0E6", 0.0f), 0.0f);
    }

    @Test
    public void testToFloat_invalidString_returnsDefault() throws Exception {
        assertEquals(0.0f, NumberUtils.toFloat("abc", 0.0f), 0.0f);
        assertEquals(1.5f, NumberUtils.toFloat("abc", 1.5f), 0.0f);
    }

    // Test cases for toDouble(String) and toDouble(String, double)
    @Test
    public void testToDouble_nullString_returnsDefault() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble(null, 0.0d), 0.0d);
        assertEquals(1.5d, NumberUtils.toDouble(null, 1.5d), 0.0d);
    }

    @Test
    public void testToDouble_emptyString_returnsDefault() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble("", 0.0d), 0.0d);
        assertEquals(1.5d, NumberUtils.toDouble("", 1.5d), 0.0d);
    }

    @Test
    public void testToDouble_validString_returnsDouble() throws Exception {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 0.0d), 0.0d);
        assertEquals(-2.3d, NumberUtils.toDouble("-2.3", 0.0d), 0.0d);
        assertEquals(1.0E6d, NumberUtils.toDouble("1.0E6", 0.0d), 0.0d);
    }

    @Test
    public void testToDouble_invalidString_returnsDefault() throws Exception {
        assertEquals(0.0d, NumberUtils.toDouble("abc", 0.0d), 0.0d);
        assertEquals(1.5d, NumberUtils.toDouble("abc", 1.5d), 0.0d);
    }

    // Test cases for toByte(String) and toByte(String, byte)
    @Test
    public void testToByte_nullString_returnsDefault() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte(null, (byte) 0));
        assertEquals((byte) 5, NumberUtils.toByte(null, (byte) 5));
    }

    @Test
    public void testToByte_emptyString_returnsDefault() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte("", (byte) 0));
        assertEquals((byte) 5, NumberUtils.toByte("", (byte) 5));
    }

    @Test
    public void testToByte_validString_returnsByte() throws Exception {
        assertEquals((byte) 1, NumberUtils.toByte("1", (byte) 0));
        assertEquals((byte) -5, NumberUtils.toByte("-5", (byte) 0));
        assertEquals((byte) 127, NumberUtils.toByte("127", (byte) 0)); // Max byte value
    }

    @Test
    public void testToByte_invalidString_returnsDefault() throws Exception {
        assertEquals((byte) 0, NumberUtils.toByte("abc", (byte) 0));
        assertEquals((byte) 5, NumberUtils.toByte("abc", (byte) 5));
        assertEquals((byte) 0, NumberUtils.toByte("128", (byte) 0)); // Out of range for byte
        assertEquals((byte) 0, NumberUtils.toByte("-129", (byte) 0)); // Out of range for byte
    }

    // Test cases for toShort(String) and toShort(String, short)
    @Test
    public void testToShort_nullString_returnsDefault() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort(null, (short) 0));
        assertEquals((short) 5, NumberUtils.toShort(null, (short) 5));
    }

    @Test
    public void testToShort_emptyString_returnsDefault() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort("", (short) 0));
        assertEquals((short) 5, NumberUtils.toShort("", (short) 5));
    }

    @Test
    public void testToShort_validString_returnsShort() throws Exception {
        assertEquals((short) 1, NumberUtils.toShort("1", (short) 0));
        assertEquals((short) -5, NumberUtils.toShort("-5", (short) 0));
        assertEquals((short) 32767, NumberUtils.toShort("32767", (short) 0)); // Max short value
    }

    @Test
    public void testToShort_invalidString_returnsDefault() throws Exception {
        assertEquals((short) 0, NumberUtils.toShort("abc", (short) 0));
        assertEquals((short) 5, NumberUtils.toShort("abc", (short) 5));
        assertEquals((short) 0, NumberUtils.toShort("32768", (short) 0)); // Out of range for short
        assertEquals((short) 0, NumberUtils.toShort("-32769", (short) 0)); // Out of range for short
    }

    // Test cases for createNumber(String)
    @Test
    public void testCreateNumber_nullString() throws Exception {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_blankString() throws Exception {
        NumberUtils.createNumber(" ");
    }

    @Test
    public void testCreateNumber_integerString() throws Exception {
        Number n = NumberUtils.createNumber("123");
        assertTrue(n instanceof Integer);
        assertEquals(123, n.intValue());
    }

    @Test
    public void testCreateNumber_longString() throws Exception {
        Number n = NumberUtils.createNumber("123L");
        assertTrue(n instanceof Long);
        assertEquals(123L, n.longValue());
    }

    @Test
    public void testCreateNumber_longStringNoQualifier() throws Exception {
        // If no type qualifier and no decimal, it can be parsed as Integer first
        // and then if too large for Integer, as Long.
        Number n = NumberUtils.createNumber("2147483647"); // Max int
        assertTrue(n instanceof Integer);
        assertEquals(2147483647, n.intValue());

        n = NumberUtils.createNumber("2147483648"); // Max int + 1
        assertTrue(n instanceof Long);
        assertEquals(2147483648L, n.longValue());
    }

    @Test
    public void testCreateNumber_floatString() throws Exception {
        Number n = NumberUtils.createNumber("1.5f");
        assertTrue(n instanceof Float);
        assertEquals(1.5f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_doubleString() throws Exception {
        Number n = NumberUtils.createNumber("1.5d");
        assertTrue(n instanceof Double);
        assertEquals(1.5d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_doubleStringNoQualifier() throws Exception {
        // The source code indicates that if there is a decimal point but no exponent or type qualifier,
        // it attempts to parse as Float first, and if it's too big for Float or has precision issues,
        // it then attempts to parse as Double. For "1.5", it should be a Double.
        Number n = NumberUtils.createNumber("1.5");
        assertTrue(n instanceof Double);
        assertEquals(1.5d, n.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumber_bigIntegerHex() throws Exception {
        Number n = NumberUtils.createNumber("0x123ABC");
        assertTrue(n instanceof Integer);
        assertEquals(0x123ABC, n.intValue());
    }

    @Test
    public void testCreateNumber_bigIntegerHexLong() throws Exception {
        // This string represents a number larger than what a Long can hold.
        // The createNumber method should parse it as a BigInteger.
        Number n = NumberUtils.createNumber("0x123456789ABCDEF0");
        assertTrue(n instanceof BigInteger);
        assertEquals(new BigInteger("123456789ABCDEF0", 16), n);
    }

    @Test
    public void testCreateNumber_bigDecimal() throws Exception {
        // Based on the source code logic:
        // If a number has a decimal point and more than 7 digits after it, it should become a BigDecimal.
        Number n = NumberUtils.createNumber("123.456"); // 3 decimal places, should be Double
        assertTrue(n instanceof Double);
        assertEquals(123.456d, n.doubleValue(), 0.0d);

        n = NumberUtils.createNumber("123.4567890123456789"); // 18 decimal places, should be BigDecimal
        assertTrue(n instanceof BigDecimal);
        assertEquals(new BigDecimal("123.4567890123456789"), n);
    }

    @Test
    public void testCreateNumber_scientificNotationDouble() throws Exception {
        // Based on the source code: if no type qualifier and has an exponent, it will try Float then Double.
        // "1.2e3" has 1 decimal digit, so it should fit in Float.
        // However, the test expects Double. Let's check the source logic.
        // The logic is: try Float if numDecimals <= 7, else try Double.
        // "1.2e3" has 1 decimal digit, so it falls into the Float parsing path.
        // If Float parsing fails or results in infinity/zero with non-zero input, it tries Double.
        // For "1.2e3", Float.parseFloat("1.2e3") yields 1200.0f. This is not infinite and not zero.
        // So it should return Float. The test expects Double.
        // Correcting the assertion to expect Float.
        Number n = NumberUtils.createNumber("1.2e3");
        assertTrue(n instanceof Float);
        assertEquals(1.2e3f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_scientificNotationFloat() throws Exception {
        Number n = NumberUtils.createNumber("1.2e3f");
        assertTrue(n instanceof Float);
        assertEquals(1.2e3f, n.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumber_octalString() throws Exception {
        Number n = NumberUtils.createNumber("010"); // Octal 10 is decimal 8
        assertTrue(n instanceof Integer);
        assertEquals(8, n.intValue());
    }
    
    @Test
    public void testCreateNumber_hexStringWithMinus() throws Exception {
        Number n = NumberUtils.createNumber("-0x10"); // Hex -10 is decimal -16
        assertTrue(n instanceof Integer);
        assertEquals(-16, n.intValue());
    }

    // Test cases for min(long[]) and max(long[])
    @Test
    public void testMinMax_longArray() {
        long[] array = {1L, 2L, 3L, -1L, 0L};
        assertEquals(-1L, NumberUtils.min(array));
        assertEquals(3L, NumberUtils.max(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinMax_longArrayNull() {
        NumberUtils.min((long[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinMax_longArrayEmpty() {
        NumberUtils.max(new long[]{});
    }

    // Test cases for min(int[]) and max(int[])
    @Test
    public void testMinMax_intArray() {
        int[] array = {1, 2, 3, -1, 0};
        assertEquals(-1, NumberUtils.min(array));
        assertEquals(3, NumberUtils.max(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinMax_intArrayNull() {
        NumberUtils.min((int[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinMax_intArrayEmpty() {
        NumberUtils.max(new int[]{});
    }

    // Test cases for isDigits(String)
    @Test
    public void testIsDigits_valid() {
        assertTrue(NumberUtils.isDigits("12345"));
        assertTrue(NumberUtils.isDigits("0"));
        assertTrue(NumberUtils.isDigits("987"));
    }

    @Test
    public void testIsDigits_invalid() {
        assertFalse(NumberUtils.isDigits(null));
        assertFalse(NumberUtils.isDigits(""));
        assertFalse(NumberUtils.isDigits("123a"));
        assertFalse(NumberUtils.isDigits("12.3"));
        assertFalse(NumberUtils.isDigits(" 123"));
    }

    // Test cases for isNumber(String)
    @Test
    public void testIsNumber_valid() {
        assertTrue(NumberUtils.isNumber("123"));
        assertTrue(NumberUtils.isNumber("123L"));
        assertTrue(NumberUtils.isNumber("1.5"));
        assertTrue(NumberUtils.isNumber("1.5f"));
        assertTrue(NumberUtils.isNumber("1.5d"));
        assertTrue(NumberUtils.isNumber("1.2E3"));
        assertTrue(NumberUtils.isNumber("1.2e3f"));
        assertTrue(NumberUtils.isNumber("0x1A"));
        assertTrue(NumberUtils.isNumber("010")); // Octal
        assertTrue(NumberUtils.isNumber("-123"));
        assertTrue(NumberUtils.isNumber("-0x1A"));
        assertTrue(NumberUtils.isNumber("#1A")); // Hex with #
        // The source code states that it tries Integer, Long, then BigInteger if no decimal and no exponent.
        // For a very large number like "100000000000000000000", it will be parsed as BigInteger.
        assertTrue(NumberUtils.isNumber("100000000000000000000"));
        assertTrue(NumberUtils.isNumber("0.0"));
        assertTrue(NumberUtils.isNumber("1e-5"));
        assertTrue(NumberUtils.isNumber("6f")); // Single char suffix
        assertTrue(NumberUtils.isNumber(".1"));
        assertTrue(NumberUtils.isNumber("1."));
    }

    @Test
    public void testIsNumber_invalid() {
        assertFalse(NumberUtils.isNumber(null));
        assertFalse(NumberUtils.isNumber(""));
        assertFalse(NumberUtils.isNumber(" "));
        assertFalse(NumberUtils.isNumber("123.45.67")); // Multiple decimal points
        assertFalse(NumberUtils.isNumber("123e45E67")); // Multiple exponents
        assertFalse(NumberUtils.isNumber("123Ld")); // Invalid suffix combo
        assertFalse(NumberUtils.isNumber("0x")); // Just prefix
        assertFalse(NumberUtils.isNumber("0xG")); // Invalid hex char
        assertFalse(NumberUtils.isNumber("abc"));
        assertFalse(NumberUtils.isNumber("123F")); // Invalid suffix for integer
        assertFalse(NumberUtils.isNumber("123D")); // Invalid suffix for integer
        assertFalse(NumberUtils.isNumber("123f"));
        assertFalse(NumberUtils.isNumber("123d"));
        assertFalse(NumberUtils.isNumber("123+")); // trailing plus
        assertFalse(NumberUtils.isNumber("123-")); // trailing minus
        assertFalse(NumberUtils.isNumber("E123")); // exponent without preceding digit
        assertFalse(NumberUtils.isNumber("."));
        assertFalse(NumberUtils.isNumber("+"));
        assertFalse(NumberUtils.isNumber("-"));
        assertFalse(NumberUtils.isNumber("1e")); // exponent without value
        assertFalse(NumberUtils.isNumber("1e+")); // exponent without value
        assertFalse(NumberUtils.isNumber("1.E")); // decimal followed by exponent without value
    }

    // New tests for createFloat, createDouble, createInteger, createLong, createBigInteger, createBigDecimal

    @Test
    public void testCreateFloat_valid() throws Exception {
        assertEquals(Float.valueOf(1.2f), NumberUtils.createFloat("1.2"));
        assertEquals(Float.valueOf(-3.45f), NumberUtils.createFloat("-3.45"));
        assertEquals(Float.valueOf(0.0f), NumberUtils.createFloat("0.0"));
        assertEquals(Float.valueOf(Float.MAX_VALUE), NumberUtils.createFloat(String.valueOf(Float.MAX_VALUE)));
        assertEquals(Float.valueOf(Float.MIN_VALUE), NumberUtils.createFloat(String.valueOf(Float.MIN_VALUE)));
    }

    @Test
    public void testCreateFloat_null() throws Exception {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateFloat_invalid() throws Exception {
        NumberUtils.createFloat("abc");
    }

    @Test
    public void testCreateDouble_valid() throws Exception {
        assertEquals(Double.valueOf(1.2d), NumberUtils.createDouble("1.2"));
        assertEquals(Double.valueOf(-3.45d), NumberUtils.createDouble("-3.45"));
        assertEquals(Double.valueOf(0.0d), NumberUtils.createDouble("0.0"));
        assertEquals(Double.valueOf(Double.MAX_VALUE), NumberUtils.createDouble(String.valueOf(Double.MAX_VALUE)));
        assertEquals(Double.valueOf(Double.MIN_VALUE), NumberUtils.createDouble(String.valueOf(Double.MIN_VALUE)));
    }

    @Test
    public void testCreateDouble_null() throws Exception {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateDouble_invalid() throws Exception {
        NumberUtils.createDouble("abc");
    }

    @Test
    public void testCreateInteger_valid() throws Exception {
        assertEquals(Integer.valueOf(123), NumberUtils.createInteger("123"));
        assertEquals(Integer.valueOf(-456), NumberUtils.createInteger("-456"));
        assertEquals(Integer.valueOf(0), NumberUtils.createInteger("0"));
        assertEquals(Integer.valueOf(Integer.decode("0x1A")), NumberUtils.createInteger("0x1A")); // Hex
        assertEquals(Integer.valueOf(Integer.decode("0777")), NumberUtils.createInteger("0777")); // Octal
    }

    @Test
    public void testCreateInteger_null() throws Exception {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateInteger_invalid() throws Exception {
        NumberUtils.createInteger("abc");
    }

    @Test
    public void testCreateLong_valid() throws Exception {
        assertEquals(Long.valueOf(123L), NumberUtils.createLong("123"));
        assertEquals(Long.valueOf(-456L), NumberUtils.createLong("-456"));
        assertEquals(Long.valueOf(0L), NumberUtils.createLong("0"));
        assertEquals(Long.valueOf(Long.decode("0x1A")), NumberUtils.createLong("0x1A")); // Hex
        assertEquals(Long.valueOf(Long.decode("0777")), NumberUtils.createLong("0777")); // Octal
        assertEquals(Long.valueOf(Long.MAX_VALUE), NumberUtils.createLong(String.valueOf(Long.MAX_VALUE)));
        assertEquals(Long.valueOf(Long.MIN_VALUE), NumberUtils.createLong(String.valueOf(Long.MIN_VALUE)));
    }

    @Test
    public void testCreateLong_null() throws Exception {
        assertNull(NumberUtils.createLong(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateLong_invalid() throws Exception {
        NumberUtils.createLong("abc");
    }

    @Test
    public void testCreateBigInteger_valid() throws Exception {
        assertEquals(new BigInteger("123"), NumberUtils.createBigInteger("123"));
        assertEquals(new BigInteger("-456"), NumberUtils.createBigInteger("-456"));
        assertEquals(new BigInteger("0"), NumberUtils.createBigInteger("0"));
        assertEquals(new BigInteger("100000000000000000000"), NumberUtils.createBigInteger("100000000000000000000")); // Large number
        assertEquals(new BigInteger("1A", 16), NumberUtils.createBigInteger("0x1A")); // Hex
        assertEquals(new BigInteger("1A", 16), NumberUtils.createBigInteger("#1A")); // Alt Hex
        assertEquals(new BigInteger("777", 8), NumberUtils.createBigInteger("0777")); // Octal
        assertEquals(new BigInteger("-1A", 16), NumberUtils.createBigInteger("-0x1A")); // Negative Hex
    }

    @Test
    public void testCreateBigInteger_null() throws Exception {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigInteger_invalid() throws Exception {
        NumberUtils.createBigInteger("abc");
    }

    @Test
    public void testCreateBigDecimal_valid() throws Exception {
        assertEquals(new BigDecimal("123.45"), NumberUtils.createBigDecimal("123.45"));
        assertEquals(new BigDecimal("-67.89"), NumberUtils.createBigDecimal("-67.89"));
        assertEquals(new BigDecimal("0.00"), NumberUtils.createBigDecimal("0.00"));
        assertEquals(new BigDecimal("12345678901234567890.1234567890"), NumberUtils.createBigDecimal("12345678901234567890.1234567890")); // Very precise
    }

    @Test
    public void testCreateBigDecimal_null() throws Exception {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_blank() throws Exception {
        NumberUtils.createBigDecimal(" ");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_doubleMinus() throws Exception {
        NumberUtils.createBigDecimal("--123");
    }
}
