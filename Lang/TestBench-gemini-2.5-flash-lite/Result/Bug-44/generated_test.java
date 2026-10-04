package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testStringToInt_validInput() throws Exception {
        assertEquals(123, NumberUtils.stringToInt("123"));
    }

    @Test
    public void testStringToInt_invalidInputReturnsDefault() throws Exception {
        assertEquals(0, NumberUtils.stringToInt("abc"));
    }

    @Test
    public void testStringToInt_withDefaultValue() throws Exception {
        assertEquals(-1, NumberUtils.stringToInt("abc", -1));
    }

    @Test
    public void testStringToInt_emptyString() throws Exception {
        assertEquals(0, NumberUtils.stringToInt(""));
    }

    @Test
    public void testStringToInt_nullString() throws Exception {
        assertEquals(0, NumberUtils.stringToInt(null));
    }

    @Test
    public void testCreateNumber_null() throws Exception {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test
    public void testCreateNumber_emptyString() throws Exception {
        try {
            NumberUtils.createNumber("");
            fail("Expected NumberFormatException for empty string");
        } catch (NumberFormatException e) {
            assertEquals("\"\" is not a valid number.", e.getMessage());
        }
    }

    @Test
    public void testCreateNumber_singleNonDigit() throws Exception {
        try {
            NumberUtils.createNumber("a");
            fail("Expected NumberFormatException for single non-digit");
        } catch (NumberFormatException e) {
            assertEquals("a is not a valid number.", e.getMessage());
        }
    }

    @Test
    public void testCreateNumber_doubleDash() throws Exception {
        assertNull(NumberUtils.createNumber("--1"));
    }

    @Test
    public void testCreateNumber_hexadecimal() throws Exception {
        assertEquals(Integer.valueOf(255), NumberUtils.createNumber("0xFF"));
    }

    @Test
    public void testCreateNumber_negativeHexadecimal() throws Exception {
        assertEquals(Integer.valueOf(-255), NumberUtils.createNumber("-0xFF"));
    }
    
    @Test
    public void testCreateNumber_longSuffix() throws Exception {
        assertEquals(Long.valueOf(123L), NumberUtils.createNumber("123L"));
    }

    @Test
    public void testCreateNumber_floatSuffix() throws Exception {
        assertEquals(Float.valueOf(123.45F), NumberUtils.createNumber("123.45F"));
    }

    @Test
    public void testCreateNumber_doubleSuffix() throws Exception {
        assertEquals(Double.valueOf(123.45D), NumberUtils.createNumber("123.45D"));
    }

    @Test
    public void testCreateNumber_integerWithDecimal() throws Exception {
        // The source code attempts to create a Float first for "123.45"
        // and if it fails (e.g., due to precision) it falls through to BigDecimal.
        // However, for "123.45", createFloat succeeds, so it returns a Float.
        // The original test was asserting BigDecimal, which was incorrect.
        assertEquals(Float.valueOf(123.45F), NumberUtils.createNumber("123.45"));
    }

    @Test
    public void testCreateNumber_integerWithExponent() throws Exception {
        // When an exponent is present and no suffix, it tries Float, then Double, then BigDecimal.
        // For "123.45E+2", createFloat("123.45E+2") returns 1.2345E8.
        // This value is not equal to 0.0 and not infinite. So it returns Float.
        assertEquals(Float.valueOf(123.45E+2f), NumberUtils.createNumber("123.45E+2"));
    }
    
    @Test
    public void testCreateNumber_largeInteger() throws Exception {
        assertEquals(new BigInteger("12345678901234567890"), NumberUtils.createNumber("12345678901234567890"));
    }

    @Test
    public void testCreateNumber_doubleWithExponent() throws Exception {
        // For "123.45E7", createFloat("123.45E7") returns 1.2345E8.
        // This value is not 0.0 and not infinite, so it returns Float.
        // The original test asserted Double, which was incorrect.
        assertEquals(Float.valueOf(123.45E7f), NumberUtils.createNumber("123.45E7"));
    }

    @Test
    public void testCreateNumber_floatWithExponent() throws Exception {
        // For "123.45E7f", createFloat("123.45E7") returns 1.2345E8.
        // This value is not 0.0 and not infinite, so it returns Float.
        assertEquals(Float.valueOf(123.45E7f), NumberUtils.createNumber("123.45E7f"));
    }

    @Test
    public void testCreateNumber_stringWithTrailingHexChar() throws Exception {
        // The current implementation of createNumber does not throw for "123f"
        // if "f" is not a recognized type qualifier, it falls through to
        // createBigDecimal. The logic for 'f'/'F' handles numeric strings.
        // For "123f", it attempts Float.valueOf("123"), which succeeds.
        // So it should return a Float.
        assertEquals(Float.valueOf(123.0F), NumberUtils.createNumber("123f"));
    }

    @Test
    public void testCreateNumber_stringWithTrailingOctalChar() throws Exception {
        // For "1238", it's not hex, no decimal, no exponent.
        // It then tries createInteger("1238"). Integer.decode("1238") will parse it as decimal.
        assertEquals(Integer.valueOf(1238), NumberUtils.createNumber("1238"));
    }
    
    @Test
    public void testCreateNumber_scientificNotationOnlyExp() throws Exception {
        // "1E" is not a valid number according to the logic, particularly the loop conditions and the final character check.
        // It will go through the `else` branch for non-digit last characters.
        // `expPos` will be 1. `val.length() - 1` is 1. `exp = val.substring(2, 2)` which is empty.
        // `numeric` is "1". `allZeros` is false.
        // It enters the `case 'e'` path, but 'e' is not a recognized suffix.
        // The default case throws NumberFormatException.
        try {
            NumberUtils.createNumber("1E");
            fail("Expected NumberFormatException for '1E'");
        } catch (NumberFormatException e) {
            // Expected exception
        }
    }

    @Test
    public void testCreateNumber_scientificNotationOnlyExpPlus() throws Exception {
        // Similar to "1E", "1E+" will also fail to parse correctly and throw.
        try {
            NumberUtils.createNumber("1E+");
            fail("Expected NumberFormatException for '1E+'");
        } catch (NumberFormatException e) {
            // Expected exception
        }
    }
    
    @Test
    public void testCreateNumber_maxLong() throws Exception {
        assertEquals(Long.valueOf(Long.MAX_VALUE), NumberUtils.createNumber(Long.toString(Long.MAX_VALUE)));
    }

    @Test
    public void testCreateNumber_minLong() throws Exception {
        assertEquals(Long.valueOf(Long.MIN_VALUE), NumberUtils.createNumber(Long.toString(Long.MIN_VALUE)));
    }

    @Test
    public void testCreateNumber_maxDouble() throws Exception {
        // For Double.MAX_VALUE, createDouble() will return the correct value.
        // The check `!(d.isInfinite() || (d.floatValue() == 0.0D && !allZeros))`
        // should pass for MAX_VALUE.
        assertEquals(Double.valueOf(Double.MAX_VALUE), NumberUtils.createNumber(Double.toString(Double.MAX_VALUE)));
    }

    @Test
    public void testCreateNumber_minDouble() throws Exception {
        // For Double.MIN_NORMAL, createDouble() will return the correct value.
        // The check `!(d.isInfinite() || (d.floatValue() == 0.0D && !allZeros))`
        // should pass for MIN_NORMAL.
        assertEquals(Double.valueOf(Double.MIN_NORMAL), NumberUtils.createNumber(Double.toString(Double.MIN_NORMAL)));
    }

    @Test
    public void testMinimum_longs() throws Exception {
        assertEquals(1L, NumberUtils.minimum(1L, 2L, 3L));
        assertEquals(1L, NumberUtils.minimum(3L, 2L, 1L));
        assertEquals(1L, NumberUtils.minimum(2L, 1L, 3L));
    }

    @Test
    public void testMinimum_ints() throws Exception {
        assertEquals(1, NumberUtils.minimum(1, 2, 3));
        assertEquals(1, NumberUtils.minimum(3, 2, 1));
        assertEquals(1, NumberUtils.minimum(2, 1, 3));
    }

    @Test
    public void testMaximum_longs() throws Exception {
        assertEquals(3L, NumberUtils.maximum(1L, 2L, 3L));
        assertEquals(3L, NumberUtils.maximum(3L, 2L, 1L));
        assertEquals(3L, NumberUtils.maximum(2L, 3L, 1L));
    }

    @Test
    public void testMaximum_ints() throws Exception {
        assertEquals(3, NumberUtils.maximum(1, 2, 3));
        assertEquals(3, NumberUtils.maximum(3, 2, 1));
        assertEquals(3, NumberUtils.maximum(2, 3, 1));
    }

    @Test
    public void testCompare_doubles() throws Exception {
        assertEquals(0, NumberUtils.compare(1.0, 1.0));
        assertEquals(-1, NumberUtils.compare(1.0, 2.0));
        assertEquals(1, NumberUtils.compare(2.0, 1.0));
        assertEquals(0, NumberUtils.compare(Double.NaN, Double.NaN));
        assertEquals(1, NumberUtils.compare(Double.NaN, 1.0));
        assertEquals(-1, NumberUtils.compare(1.0, Double.NaN));
        // The compare method handles 0.0 and -0.0 by comparing their bits.
        // Double.doubleToLongBits(0.0) is 0. Double.doubleToLongBits(-0.0) is Long.MIN_VALUE.
        // So -0.0 should be less than 0.0.
        assertEquals(-1, NumberUtils.compare(-0.0, 0.0));
        assertEquals(1, NumberUtils.compare(0.0, -0.0));
        assertEquals(1, NumberUtils.compare(Double.POSITIVE_INFINITY, Double.MAX_VALUE));
        assertEquals(-1, NumberUtils.compare(Double.NEGATIVE_INFINITY, Double.MIN_NORMAL));
        assertEquals(0, NumberUtils.compare(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
        assertEquals(0, NumberUtils.compare(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testCompare_floats() throws Exception {
        assertEquals(0, NumberUtils.compare(1.0f, 1.0f));
        assertEquals(-1, NumberUtils.compare(1.0f, 2.0f));
        assertEquals(1, NumberUtils.compare(2.0f, 1.0f));
        assertEquals(0, NumberUtils.compare(Float.NaN, Float.NaN));
        assertEquals(1, NumberUtils.compare(Float.NaN, 1.0f));
        assertEquals(-1, NumberUtils.compare(1.0f, Float.NaN));
        // The compare method handles 0.0f and -0.0f by comparing their bits.
        // Float.floatToIntBits(0.0f) is 0. Float.floatToIntBits(-0.0f) is Integer.MIN_VALUE.
        // So -0.0f should be less than 0.0f.
        assertEquals(-1, NumberUtils.compare(-0.0f, 0.0f));
        assertEquals(1, NumberUtils.compare(0.0f, -0.0f));
        assertEquals(1, NumberUtils.compare(Float.POSITIVE_INFINITY, Float.MAX_VALUE));
        assertEquals(-1, NumberUtils.compare(Float.NEGATIVE_INFINITY, -Float.MAX_VALUE));
        assertEquals(0, NumberUtils.compare(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
        assertEquals(0, NumberUtils.compare(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY));
    }

    @Test
    public void testIsDigits_valid() throws Exception {
        assertTrue(NumberUtils.isDigits("12345"));
    }

    @Test
    public void testIsDigits_empty() throws Exception {
        assertFalse(NumberUtils.isDigits(""));
    }

    @Test
    public void testIsDigits_null() throws Exception {
        assertFalse(NumberUtils.isDigits(null));
    }

    @Test
    public void testIsDigits_withNonDigit() throws Exception {
        assertFalse(NumberUtils.isDigits("123a45"));
    }

    @Test
    public void testIsNumber_validInteger() throws Exception {
        assertTrue(NumberUtils.isNumber("123"));
    }

    @Test
    public void testIsNumber_validHex() throws Exception {
        assertTrue(NumberUtils.isNumber("0xFF"));
    }

    @Test
    public void testIsNumber_validFloat() throws Exception {
        assertTrue(NumberUtils.isNumber("123.45"));
    }

    @Test
    public void testIsNumber_validDoubleWithExp() throws Exception {
        assertTrue(NumberUtils.isNumber("1.23E4"));
    }

    @Test
    public void testIsNumber_validLongSuffix() throws Exception {
        assertTrue(NumberUtils.isNumber("123L"));
    }

    @Test
    public void testIsNumber_validFloatSuffix() throws Exception {
        assertTrue(NumberUtils.isNumber("123.45f"));
    }

    @Test
    public void testIsNumber_validDoubleSuffix() throws Exception {
        assertTrue(NumberUtils.isNumber("123.45D"));
    }
    
    @Test
    public void testIsNumber_invalidHexFormat() throws Exception {
        assertFalse(NumberUtils.isNumber("0x")); // Empty hex value
    }

    @Test
    public void testIsNumber_invalidExpFormat() throws Exception {
        assertFalse(NumberUtils.isNumber("1E")); // Incomplete exponent
    }
    
    @Test
    public void testIsNumber_invalidExpFormatWithSign() throws Exception {
        assertFalse(NumberUtils.isNumber("1E+")); // Incomplete exponent with sign
    }

    @Test
    public void testIsNumber_emptyString() throws Exception {
        assertFalse(NumberUtils.isNumber(""));
    }

    @Test
    public void testIsNumber_nullString() throws Exception {
        assertFalse(NumberUtils.isNumber(null));
    }
    
    @Test
    public void testCreateNumber_negativeDoubleWithExponent() throws Exception {
        // For "-123.45E7", createFloat("-123.45E7") returns -1.2345E8.
        // This value is not 0.0 and not infinite, so it returns Float.
        // The original test asserted Double, which was incorrect.
        assertEquals(Float.valueOf(-123.45E7f), NumberUtils.createNumber("-123.45E7"));
    }

    @Test
    public void testCreateNumber_negativeFloatWithExponent() throws Exception {
        // For "-123.45E7f", createFloat("-123.45E7") returns -1.2345E8.
        // This value is not 0.0 and not infinite, so it returns Float.
        assertEquals(Float.valueOf(-123.45E7f), NumberUtils.createNumber("-123.45E7f"));
    }

    @Test
    public void testCreateNumber_decimalZero() throws Exception {
        assertEquals(BigDecimal.ZERO, NumberUtils.createBigDecimal("0"));
    }

    @Test
    public void testCreateNumber_floatZero() throws Exception {
        assertEquals(Float.valueOf(0.0F), NumberUtils.createFloat("0.0"));
    }

    @Test
    public void testCreateNumber_doubleZero() throws Exception {
        assertEquals(Double.valueOf(0.0D), NumberUtils.createDouble("0.0"));
    }
}
