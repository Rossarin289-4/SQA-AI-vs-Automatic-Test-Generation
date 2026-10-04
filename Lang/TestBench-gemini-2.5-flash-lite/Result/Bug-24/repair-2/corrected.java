package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

public class NumberUtilsTest {

    @Test
    public void testToIntWithNull() {
        assertEquals(0, NumberUtils.toInt(null));
    }

    @Test
    public void testToIntWithEmpty() {
        assertEquals(0, NumberUtils.toInt(""));
    }

    @Test
    public void testToIntValid() {
        assertEquals(123, NumberUtils.toInt("123"));
    }

    @Test
    public void testToIntInvalid() {
        assertEquals(0, NumberUtils.toInt("abc"));
    }

    @Test
    public void testToIntWithDefaultValid() {
        assertEquals(123, NumberUtils.toInt("123", 99));
    }

    @Test
    public void testToIntWithDefaultNull() {
        assertEquals(99, NumberUtils.toInt(null, 99));
    }

    @Test
    public void testToIntWithDefaultEmpty() {
        assertEquals(99, NumberUtils.toInt("", 99));
    }

    @Test
    public void testToIntWithDefaultInvalid() {
        assertEquals(99, NumberUtils.toInt("abc", 99));
    }
    
    @Test
    public void testToLongWithNull() {
        assertEquals(0L, NumberUtils.toLong(null));
    }

    @Test
    public void testToLongWithEmpty() {
        assertEquals(0L, NumberUtils.toLong(""));
    }

    @Test
    public void testToLongValid() {
        assertEquals(1234567890123L, NumberUtils.toLong("1234567890123"));
    }

    @Test
    public void testToLongInvalid() {
        assertEquals(0L, NumberUtils.toLong("abc"));
    }

    @Test
    public void testToLongWithDefaultValid() {
        assertEquals(1234567890123L, NumberUtils.toLong("1234567890123", 99L));
    }

    @Test
    public void testToLongWithDefaultNull() {
        assertEquals(99L, NumberUtils.toLong(null, 99L));
    }

    @Test
    public void testToLongWithDefaultEmpty() {
        assertEquals(99L, NumberUtils.toLong("", 99L));
    }

    @Test
    public void testToLongWithDefaultInvalid() {
        assertEquals(99L, NumberUtils.toLong("abc", 99L));
    }

    @Test
    public void testToFloatWithNull() {
        assertEquals(0.0f, NumberUtils.toFloat(null), 0.0f);
    }

    @Test
    public void testToFloatWithEmpty() {
        assertEquals(0.0f, NumberUtils.toFloat(""), 0.0f);
    }

    @Test
    public void testToFloatValid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5"), 0.0f);
    }

    @Test
    public void testToFloatInvalid() {
        assertEquals(0.0f, NumberUtils.toFloat("abc"), 0.0f);
    }

    @Test
    public void testToFloatWithDefaultValid() {
        assertEquals(1.5f, NumberUtils.toFloat("1.5", 99.9f), 0.0f);
    }

    @Test
    public void testToFloatWithDefaultNull() {
        assertEquals(99.9f, NumberUtils.toFloat(null, 99.9f), 0.0f);
    }

    @Test
    public void testToFloatWithDefaultEmpty() {
        assertEquals(99.9f, NumberUtils.toFloat("", 99.9f), 0.0f);
    }

    @Test
    public void testToFloatWithDefaultInvalid() {
        assertEquals(99.9f, NumberUtils.toFloat("abc", 99.9f), 0.0f);
    }

    @Test
    public void testToDoubleWithNull() {
        assertEquals(0.0d, NumberUtils.toDouble(null), 0.0d);
    }

    @Test
    public void testToDoubleWithEmpty() {
        assertEquals(0.0d, NumberUtils.toDouble(""), 0.0d);
    }

    @Test
    public void testToDoubleValid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5"), 0.0d);
    }

    @Test
    public void testToDoubleInvalid() {
        assertEquals(0.0d, NumberUtils.toDouble("abc"), 0.0d);
    }

    @Test
    public void testToDoubleWithDefaultValid() {
        assertEquals(1.5d, NumberUtils.toDouble("1.5", 99.9d), 0.0d);
    }

    @Test
    public void testToDoubleWithDefaultNull() {
        assertEquals(99.9d, NumberUtils.toDouble(null, 99.9d), 0.0d);
    }

    @Test
    public void testToDoubleWithDefaultEmpty() {
        assertEquals(99.9d, NumberUtils.toDouble("", 99.9d), 0.0d);
    }

    @Test
    public void testToDoubleWithDefaultInvalid() {
        assertEquals(99.9d, NumberUtils.toDouble("abc", 99.9d), 0.0d);
    }
    
    @Test
    public void testToByteWithNull() {
        assertEquals((byte) 0, NumberUtils.toByte(null));
    }

    @Test
    public void testToByteWithEmpty() {
        assertEquals((byte) 0, NumberUtils.toByte(""));
    }

    @Test
    public void testToByteValid() {
        assertEquals((byte) 127, NumberUtils.toByte("127"));
    }

    @Test
    public void testToByteInvalid() {
        assertEquals((byte) 0, NumberUtils.toByte("abc"));
    }

    @Test
    public void testToByteWithDefaultValid() {
        assertEquals((byte) 127, NumberUtils.toByte("127", (byte) 99));
    }

    @Test
    public void testToByteWithDefaultNull() {
        assertEquals((byte) 99, NumberUtils.toByte(null, (byte) 99));
    }

    @Test
    public void testToByteWithDefaultEmpty() {
        assertEquals((byte) 99, NumberUtils.toByte("", (byte) 99));
    }

    @Test
    public void testToByteWithDefaultInvalid() {
        assertEquals((byte) 99, NumberUtils.toByte("abc", (byte) 99));
    }

    @Test
    public void testToShortWithNull() {
        assertEquals((short) 0, NumberUtils.toShort(null));
    }

    @Test
    public void testToShortWithEmpty() {
        assertEquals((short) 0, NumberUtils.toShort(""));
    }

    @Test
    public void testToShortValid() {
        assertEquals((short) 32767, NumberUtils.toShort("32767"));
    }

    @Test
    public void testToShortInvalid() {
        assertEquals((short) 0, NumberUtils.toShort("abc"));
    }

    @Test
    public void testToShortWithDefaultValid() {
        assertEquals((short) 32767, NumberUtils.toShort("32767", (short) 99));
    }

    @Test
    public void testToShortWithDefaultNull() {
        assertEquals((short) 99, NumberUtils.toShort(null, (short) 99));
    }

    @Test
    public void testToShortWithDefaultEmpty() {
        assertEquals((short) 99, NumberUtils.toShort("", (short) 99));
    }

    @Test
    public void testToShortWithDefaultInvalid() {
        assertEquals((short) 99, NumberUtils.toShort("abc", (short) 99));
    }
    
    @Test
    public void testCreateNumberNull() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test
    public void testCreateNumberBlank() {
        try {
            NumberUtils.createNumber(" ");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateNumberInteger() {
        Number num = NumberUtils.createNumber("123");
        assertEquals(Integer.class, num.getClass());
        assertEquals(123, num.intValue());
    }

    @Test
    public void testCreateNumberLong() {
        Number num = NumberUtils.createNumber("123L");
        assertEquals(Long.class, num.getClass());
        assertEquals(123L, num.longValue());
    }
    
    @Test
    public void testCreateNumberFloat() {
        Number num = NumberUtils.createNumber("1.5f");
        assertEquals(Float.class, num.getClass());
        assertEquals(1.5f, num.floatValue(), 0.0f);
    }
    
    @Test
    public void testCreateNumberDouble() {
        Number num = NumberUtils.createNumber("1.5d");
        assertEquals(Double.class, num.getClass());
        assertEquals(1.5d, num.doubleValue(), 0.0d);
    }
    
    @Test
    public void testCreateNumberBigIntegerHex() {
        Number num = NumberUtils.createNumber("0x1A");
        // The code first attempts to parse as Integer, if it succeeds, it returns Integer.
        // If it's too big for Integer but fits in Long, it returns Long. Otherwise BigInteger.
        // 0x1A is 26, which fits in Integer.
        assertEquals(Integer.class, num.getClass()); 
        assertEquals(26, num.intValue());
    }

    @Test
    public void testCreateNumberBigDecimal() {
        Number num = NumberUtils.createNumber("123.456");
        assertEquals(BigDecimal.class, num.getClass());
        assertEquals("123.456", num.toString());
    }

    @Test
    public void testCreateNumberScientificDouble() {
        Number num = NumberUtils.createNumber("1.2e3");
        assertEquals(Double.class, num.getClass());
        assertEquals(1200.0d, num.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumberScientificFloat() {
        Number num = NumberUtils.createNumber("1.2e3f");
        assertEquals(Float.class, num.getClass());
        assertEquals(1200.0f, num.floatValue(), 0.0f);
    }
    
    @Test
    public void testCreateNumberTooBigForLong() {
        Number num = NumberUtils.createNumber("12345678901234567890L");
        assertEquals(BigInteger.class, num.getClass());
        assertEquals("12345678901234567890", num.toString());
    }
    
    @Test
    public void testCreateNumberTooBigForFloat() {
        // Test a value that is very close to the edge of float representation
        Number num = NumberUtils.createNumber("3.4028235e38f"); // Max float
        assertEquals(Float.class, num.getClass());
        assertEquals(Float.MAX_VALUE, num.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumberTooBigForDouble() {
        // Test a value that is very close to the edge of double representation
        Number num = NumberUtils.createNumber("1.7976931348623157e308d"); // Max double
        assertEquals(Double.class, num.getClass());
        assertEquals(Double.MAX_VALUE, num.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumberNegativeHex() {
        Number num = NumberUtils.createNumber("-0x1A");
        assertEquals(Integer.class, num.getClass());
        assertEquals(-26, num.intValue());
    }
    
    @Test
    public void testCreateNumberInvalidNumberFormat() {
        try {
            NumberUtils.createNumber("1.2.3");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }
    
    @Test
    public void testCreateNumberInvalidNumberFormat2() {
        try {
            NumberUtils.createNumber("1e2e3");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testMinLongArray() {
        long[] arr = {5L, 2L, 8L, 1L, 9L};
        assertEquals(1L, NumberUtils.min(arr));
    }

    @Test
    public void testMinIntArray() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(1, NumberUtils.min(arr));
    }

    @Test
    public void testMinShortArray() {
        short[] arr = {5, 2, 8, 1, 9};
        assertEquals((short) 1, NumberUtils.min(arr));
    }

    @Test
    public void testMinByteArray() {
        byte[] arr = {5, 2, 8, 1, 9};
        assertEquals((byte) 1, NumberUtils.min(arr));
    }
    
    @Test
    public void testMinDoubleArray() {
        double[] arr = {5.5, 2.1, 8.9, 1.0, 9.2};
        assertEquals(1.0, NumberUtils.min(arr), 0.0d);
    }

    @Test
    public void testMinFloatArray() {
        float[] arr = {5.5f, 2.1f, 8.9f, 1.0f, 9.2f};
        assertEquals(1.0f, NumberUtils.min(arr), 0.0f);
    }
    
    @Test
    public void testMinLongArrayWithNegative() {
        long[] arr = {-5L, -2L, -8L, -1L, -9L};
        assertEquals(-9L, NumberUtils.min(arr));
    }
    
    @Test
    public void testMinDoubleArrayWithNaN() {
        double[] arr = {5.5, Double.NaN, 8.9, 1.0, 9.2};
        assertTrue(Double.isNaN(NumberUtils.min(arr)));
    }

    @Test
    public void testMinFloatArrayWithNaN() {
        float[] arr = {5.5f, Float.NaN, 8.9f, 1.0f, 9.2f};
        assertTrue(Float.isNaN(NumberUtils.min(arr)));
    }

    @Test
    public void testMaxLongArray() {
        long[] arr = {5L, 2L, 8L, 1L, 9L};
        assertEquals(9L, NumberUtils.max(arr));
    }

    @Test
    public void testMaxIntArray() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(9, NumberUtils.max(arr));
    }

    @Test
    public void testMaxShortArray() {
        short[] arr = {5, 2, 8, 1, 9};
        assertEquals((short) 9, NumberUtils.max(arr));
    }

    @Test
    public void testMaxByteArray() {
        byte[] arr = {5, 2, 8, 1, 9};
        assertEquals((byte) 9, NumberUtils.max(arr));
    }
    
    @Test
    public void testMaxDoubleArray() {
        double[] arr = {5.5, 2.1, 8.9, 1.0, 9.2};
        assertEquals(9.2, NumberUtils.max(arr), 0.0d);
    }

    @Test
    public void testMaxFloatArray() {
        float[] arr = {5.5f, 2.1f, 8.9f, 1.0f, 9.2f};
        assertEquals(9.2f, NumberUtils.max(arr), 0.0f);
    }
    
    @Test
    public void testMaxLongArrayWithNegative() {
        long[] arr = {-5L, -2L, -8L, -1L, -9L};
        assertEquals(-1L, NumberUtils.max(arr));
    }
    
    @Test
    public void testMaxDoubleArrayWithNaN() {
        double[] arr = {5.5, Double.NaN, 8.9, 1.0, 9.2};
        assertTrue(Double.isNaN(NumberUtils.max(arr)));
    }

    @Test
    public void testMaxFloatArrayWithNaN() {
        float[] arr = {5.5f, Float.NaN, 8.9f, 1.0f, 9.2f};
        assertTrue(Float.isNaN(NumberUtils.max(arr)));
    }

    @Test
    public void testMinLongThreeValues() {
        assertEquals(1L, NumberUtils.min(5L, 2L, 8L));
    }

    @Test
    public void testMinIntThreeValues() {
        assertEquals(1, NumberUtils.min(5, 2, 8));
    }
    
    @Test
    public void testMinShortThreeValues() {
        assertEquals((short) 1, NumberUtils.min((short) 5, (short) 2, (short) 8));
    }

    @Test
    public void testMinByteThreeValues() {
        assertEquals((byte) 1, NumberUtils.min((byte) 5, (byte) 2, (byte) 8));
    }
    
    @Test
    public void testMinDoubleThreeValues() {
        assertEquals(1.0d, NumberUtils.min(5.5d, 2.1d, 8.9d), 0.0d);
    }

    @Test
    public void testMinFloatThreeValues() {
        assertEquals(1.0f, NumberUtils.min(5.5f, 2.1f, 8.9f), 0.0f);
    }
    
    @Test
    public void testMaxLongThreeValues() {
        assertEquals(8L, NumberUtils.max(5L, 2L, 8L));
    }

    @Test
    public void testMaxIntThreeValues() {
        assertEquals(8, NumberUtils.max(5, 2, 8));
    }
    
    @Test
    public void testMaxShortThreeValues() {
        assertEquals((short) 8, NumberUtils.max((short) 5, (short) 2, (short) 8));
    }

    @Test
    public void testMaxByteThreeValues() {
        assertEquals((byte) 8, NumberUtils.max((byte) 5, (byte) 2, (byte) 8));
    }
    
    @Test
    public void testMaxDoubleThreeValues() {
        assertEquals(8.9d, NumberUtils.max(5.5d, 2.1d, 8.9d), 0.0d);
    }

    @Test
    public void testMaxFloatThreeValues() {
        assertEquals(8.9f, NumberUtils.max(5.5f, 2.1f, 8.9f), 0.0f);
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
        assertFalse(NumberUtils.isDigits("123a45"));
    }

    @Test
    public void testIsDigitsWithSigns() {
        assertFalse(NumberUtils.isDigits("-123"));
        assertFalse(NumberUtils.isDigits("+123"));
    }

    @Test
    public void testIsDigitsWithDecimal() {
        assertFalse(NumberUtils.isDigits("123.45"));
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
    public void testIsNumberLongLiteral() {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumberFloatLiteral() {
        assertTrue(NumberUtils.isNumber("123f"));
    }
    
    @Test
    public void testIsNumberDoubleLiteral() {
        assertTrue(NumberUtils.isNumber("123d"));
    }

    @Test
    public void testIsNumberHexadecimal() {
        assertTrue(NumberUtils.isNumber("0xFF"));
    }

    @Test
    public void testIsNumberNegativeHexadecimal() {
        assertTrue(NumberUtils.isNumber("-0xFF"));
    }

    @Test
    public void testIsNumberScientificNotationDouble() {
        assertTrue(NumberUtils.isNumber("1.23e4"));
    }

    @Test
    public void testIsNumberScientificNotationFloat() {
        assertTrue(NumberUtils.isNumber("1.23E4f"));
    }
    
    @Test
    public void testIsNumberBigDecimal() {
        assertTrue(NumberUtils.isNumber("123.456"));
    }

    @Test
    public void testIsNumberDecimalWithSign() {
        assertTrue(NumberUtils.isNumber("-123.456"));
        assertTrue(NumberUtils.isNumber("+123.456"));
    }

    @Test
    public void testIsNumberScientificWithSign() {
        assertTrue(NumberUtils.isNumber("1.23e-4"));
        assertTrue(NumberUtils.isNumber("-1.23E+4"));
    }
    
    @Test
    public void testIsNumberInvalidFormat1() {
        assertFalse(NumberUtils.isNumber("1.2.3"));
    }
    
    @Test
    public void testIsNumberInvalidFormat2() {
        assertFalse(NumberUtils.isNumber("1e2e3"));
    }
    
    @Test
    public void testIsNumberInvalidFormat3() {
        // Trailing dot is ok only if no exponent, and it needs a digit before it.
        assertFalse(NumberUtils.isNumber(".")); 
        assertTrue(NumberUtils.isNumber("1."));
    }
    
    @Test
    public void testIsNumberInvalidFormat4() {
        // Leading dot is ok only if no exponent, and it needs a digit after it.
        assertTrue(NumberUtils.isNumber(".1")); 
    }
    
    @Test
    public void testIsNumberInvalidFormat5() {
        assertFalse(NumberUtils.isNumber("1e")); // E without digits
    }

    @Test
    public void testIsNumberInvalidFormat6() {
        assertFalse(NumberUtils.isNumber("0x")); // only hex prefix
    }
    
    @Test
    public void testIsNumberInvalidFormat7() {
        assertFalse(NumberUtils.isNumber("0xG")); // invalid hex char
    }

    @Test
    public void testCreateFloatValid() {
        assertEquals(Float.valueOf("123.45f"), NumberUtils.createFloat("123.45f"));
    }

    @Test
    public void testCreateFloatNull() {
        assertNull(NumberUtils.createFloat(null));
    }

    @Test
    public void testCreateFloatInvalid() {
        try {
            NumberUtils.createFloat("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateDoubleValid() {
        assertEquals(Double.valueOf("123.45d"), NumberUtils.createDouble("123.45d"));
    }

    @Test
    public void testCreateDoubleNull() {
        assertNull(NumberUtils.createDouble(null));
    }

    @Test
    public void testCreateDoubleInvalid() {
        try {
            NumberUtils.createDouble("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateIntegerValid() {
        assertEquals(Integer.valueOf("123"), NumberUtils.createInteger("123"));
    }
    
    @Test
    public void testCreateIntegerHexValid() {
        assertEquals(Integer.valueOf("0x1A"), NumberUtils.createInteger("0x1A"));
    }

    @Test
    public void testCreateIntegerOctalValid() {
        assertEquals(Integer.valueOf("0777"), NumberUtils.createInteger("0777"));
    }

    @Test
    public void testCreateIntegerNull() {
        assertNull(NumberUtils.createInteger(null));
    }

    @Test
    public void testCreateIntegerInvalid() {
        try {
            NumberUtils.createInteger("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateLongValid() {
        assertEquals(Long.valueOf("1234567890123L"), NumberUtils.createLong("1234567890123L"));
    }

    @Test
    public void testCreateLongNull() {
        assertNull(NumberUtils.createLong(null));
    }

    @Test
    public void testCreateLongInvalid() {
        try {
            NumberUtils.createLong("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }
    
    @Test
    public void testCreateBigIntegerValid() {
        assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createBigInteger("12345678901234567890"));
    }
    
    @Test
    public void testCreateBigIntegerHexValid() {
        assertEquals(new BigInteger("1A", 16), NumberUtils.createBigInteger("0x1A"));
    }

    @Test
    public void testCreateBigIntegerNull() {
        assertNull(NumberUtils.createBigInteger(null));
    }

    @Test
    public void testCreateBigIntegerInvalid() {
        try {
            NumberUtils.createBigInteger("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateBigDecimalValid() {
        assertEquals(new BigDecimal("123.4567890123456789"), NumberUtils.createBigDecimal("123.4567890123456789"));
    }

    @Test
    public void testCreateBigDecimalNull() {
        assertNull(NumberUtils.createBigDecimal(null));
    }

    @Test
    public void testCreateBigDecimalBlank() {
        try {
            NumberUtils.createBigDecimal(" ");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateBigDecimalInvalid() {
        try {
            NumberUtils.createBigDecimal("abc");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }
    
    @Test
    public void testMinLongArrayEmpty() {
        try {
            NumberUtils.min(new long[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testMinLongArrayNull() {
        try {
            NumberUtils.min((long[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testMaxLongArrayEmpty() {
        try {
            NumberUtils.max(new long[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testMaxLongArrayNull() {
        try {
            NumberUtils.max((long[]) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testCreateNumberEdgeFloat() {
        // Test a value that is very close to the edge of float representation
        Number num = NumberUtils.createNumber("1.0000001E-44f");
        assertEquals(Float.class, num.getClass());
        assertEquals(1.0000001E-44f, num.floatValue(), 1e-50f); // Use a small delta for very small numbers
    }
    
    @Test
    public void testCreateNumberEdgeDouble() {
        // Test a value that is very close to the edge of double representation
        Number num = NumberUtils.createNumber("1.000000000000001E-323d");
        assertEquals(Double.class, num.getClass());
        assertEquals(1.000000000000001E-323d, num.doubleValue(), 1e-330d); // Use a small delta
    }

    @Test
    public void testCreateNumberInvalidHex() {
        try {
            NumberUtils.createNumber("0xG");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }

    @Test
    public void testCreateNumberNumberTooBigForInteger() {
        Number num = NumberUtils.createNumber("2147483648"); // Integer.MAX_VALUE + 1
        // The createNumber method first checks for type specifiers. If none, it parses as int, then long, then BigInteger.
        // "2147483648" is too large for int, so it should be parsed as long.
        assertEquals(Long.class, num.getClass());
        assertEquals(2147483648L, num.longValue());
    }

    @Test
    public void testCreateNumberNumberTooSmallForInteger() {
        Number num = NumberUtils.createNumber("-2147483649"); // Integer.MIN_VALUE - 1
        // Similar to above, this is too small for int and should be parsed as long.
        assertEquals(Long.class, num.getClass());
        assertEquals(-2147483649L, num.longValue());
    }

    @Test
    public void testCreateNumberScientificWithOnlySign() {
        try {
            NumberUtils.createNumber("1.2e+");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
    }
    
    @Test
    public void testIsNumberTrailingDecimalPoint() {
        assertTrue(NumberUtils.isNumber("123."));
        assertTrue(NumberUtils.isNumber("-123."));
    }
    
    @Test
    public void testIsNumberLeadingDecimalPoint() {
        assertTrue(NumberUtils.isNumber(".123"));
        assertTrue(NumberUtils.isNumber("-.123"));
    }
    
    @Test
    public void testIsNumberExponentWithoutDigits() {
        assertFalse(NumberUtils.isNumber("1e"));
        assertFalse(NumberUtils.isNumber("1E"));
    }
    
    @Test
    public void testIsNumberOctalFormat() {
        // The code does not interpret numbers starting with '0' as octal,
        // except for the specific hex "0x" prefix.
        // "0123" is treated as a decimal string, which is valid.
        assertTrue(NumberUtils.isNumber("0123")); 
    }
    
    @Test
    public void testCreateNumberWithZeroDecimal() {
        Number num = NumberUtils.createNumber("0.0");
        assertEquals(BigDecimal.class, num.getClass());
        assertEquals(BigDecimal.ZERO, num);
    }

    @Test
    public void testCreateNumberWithZeroFloat() {
        Number num = NumberUtils.createNumber("0.0f");
        assertEquals(Float.class, num.getClass());
        assertEquals(0.0f, num.floatValue(), 0.0f);
    }

    @Test
    public void testCreateNumberWithZeroDouble() {
        Number num = NumberUtils.createNumber("0.0d");
        assertEquals(Double.class, num.getClass());
        assertEquals(0.0d, num.doubleValue(), 0.0d);
    }
    
    @Test
    public void testCreateNumberStringDoesNotStartWithMinusZeroX() {
        // Test the check for "--"
        assertNull(NumberUtils.createNumber("--123"));
    }

    @Test
    public void testCreateNumberWithExpAndDecButNoMantissa() {
        try {
            NumberUtils.createNumber("e1");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }
    
    @Test
    public void testCreateNumberWithDecimalAndExp() {
        Number num = NumberUtils.createNumber("1.2e3");
        assertEquals(Double.class, num.getClass());
        assertEquals(1200.0d, num.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumberWithHexadecimalNegative() {
        Number num = NumberUtils.createNumber("-0x10");
        assertEquals(Integer.class, num.getClass());
        assertEquals(-16, num.intValue());
    }

    @Test
    public void testCreateNumberWithHexadecimalPositive() {
        Number num = NumberUtils.createNumber("0x10");
        assertEquals(Integer.class, num.getClass());
        assertEquals(16, num.intValue());
    }

    @Test
    public void testCreateNumberScientificNotationWithF() {
        Number num = NumberUtils.createNumber("1.2345E+10f");
        assertEquals(Float.class, num.getClass());
        assertEquals(1.2345E10f, num.floatValue(), 0.0f);
    }
    
    @Test
    public void testCreateNumberScientificNotationWithD() {
        Number num = NumberUtils.createNumber("1.2345E+10d");
        assertEquals(Double.class, num.getClass());
        assertEquals(1.2345E10d, num.doubleValue(), 0.0d);
    }

    @Test
    public void testCreateNumberWithOnlyDecimalPoint() {
        try {
            NumberUtils.createNumber(".");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateNumberWithDecimalAndExpAndNoMantissa() {
        try {
            NumberUtils.createNumber(".e1");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }
    
    @Test
    public void testCreateNumberWithDecimalAndExpAndNoDigitsAfterExp() {
        try {
            NumberUtils.createNumber("1.e");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testCreateNumberWithDecimalAndExpAndOnlySignAfterExp() {
        try {
            NumberUtils.createNumber("1.e+");
            fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }
    
    @Test
    public void testCreateNumberWithDecimalAndExpAndOnlySignAndZeroAfterExp() {
        Number num = NumberUtils.createNumber("1.e+0");
        assertEquals(BigDecimal.class, num.getClass());
        assertEquals(new BigDecimal("1.0"), num);
    }

    @Test
    public void testCreateNumberWithDecimalAndExpAndNegativeSignAndZeroAfterExp() {
        Number num = NumberUtils.createNumber("1.e-0");
        assertEquals(BigDecimal.class, num.getClass());
        assertEquals(new BigDecimal("1.0"), num);
    }

    @Test
    public void testCreateNumberWithDecimalAndExpAndOnlyZeroAfterExp() {
        Number num = NumberUtils.createNumber("1.e0");
        assertEquals(BigDecimal.class, num.getClass());
        assertEquals(new BigDecimal("1.0"), num);
    }

    @Test
    public void testCreateNumberWithDecimalAndExpAndOnlyNegativeZeroAfterExp() {
        Number num = NumberUtils.createNumber("1.e-0");
        assertEquals(BigDecimal.class, num.getClass());
        assertEquals(new BigDecimal("1.0"), num);
    }
    
    @Test
    public void testCreateNumberWithDecimalAndExpAndNegativeSign() {
        Number num = NumberUtils.createNumber("1.2e-3");
        assertEquals(Double.class, num.getClass());
        assertEquals(0.0012d, num.doubleValue(), 0.0d);
    }
}
