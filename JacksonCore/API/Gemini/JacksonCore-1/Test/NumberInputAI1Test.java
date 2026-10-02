package com.fasterxml.jackson.core.io;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class NumberInputAI1Test {

    @Test
    public void testParseIntChars() {
        char[] chars = "123456789".toCharArray();
        int val = NumberInput.parseInt(chars, 0, 9);
        Assert.assertEquals(123456789, val);
    }

    @Test
    public void testParseIntStringValid() {
        Assert.assertEquals(123, NumberInput.parseInt("123"));
        Assert.assertEquals(-123, NumberInput.parseInt("-123"));
        Assert.assertEquals(0, NumberInput.parseInt("0"));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseIntStringInvalid() {
        NumberInput.parseInt("notAnInt");
    }

    @Test
    public void testParseLongChars() {
        char[] chars = "123456789123456789".toCharArray();
        long val = NumberInput.parseLong(chars, 0, 18);
        Assert.assertEquals(123456789123456789L, val);
    }

    @Test
    public void testParseLongString() {
        Assert.assertEquals(123456L, NumberInput.parseLong("123456"));
        Assert.assertEquals(12345678901L, NumberInput.parseLong("12345678901"));
    }

    @Test
    public void testInLongRangeChars() {
        char[] maxChars = NumberInput.MAX_LONG_STR.toCharArray();
        Assert.assertTrue(NumberInput.inLongRange(maxChars, 0, maxChars.length, false));
        
        char[] minNoSignChars = NumberInput.MIN_LONG_STR_NO_SIGN.toCharArray();
        Assert.assertTrue(NumberInput.inLongRange(minNoSignChars, 0, minNoSignChars.length, true));
    }

    @Test
    public void testInLongRangeString() {
        Assert.assertTrue(NumberInput.inLongRange("9223372036854775807", false));
        Assert.assertFalse(NumberInput.inLongRange("9223372036854775808", false));
        Assert.assertTrue(NumberInput.inLongRange("9223372036854775808", true));
    }

    @Test
    public void testParseAsInt() {
        Assert.assertEquals(42, NumberInput.parseAsInt("42", 10));
        Assert.assertEquals(10, NumberInput.parseAsInt(null, 10));
        Assert.assertEquals(10, NumberInput.parseAsInt("", 10));
        Assert.assertEquals(42, NumberInput.parseAsInt("+42", 10));
        Assert.assertEquals(-42, NumberInput.parseAsInt("-42", 10));
        Assert.assertEquals(10, NumberInput.parseAsInt("invalid", 10));
    }

    @Test
    public void testParseAsLong() {
        Assert.assertEquals(42L, NumberInput.parseAsLong("42", 10L));
        Assert.assertEquals(10L, NumberInput.parseAsLong(null, 10L));
        Assert.assertEquals(10L, NumberInput.parseAsLong("", 10L));
        Assert.assertEquals(42L, NumberInput.parseAsLong("+42", 10L));
        Assert.assertEquals(-42L, NumberInput.parseAsLong("-42", 10L));
        Assert.assertEquals(10L, NumberInput.parseAsLong("invalid", 10L));
    }

    @Test
    public void testParseAsDouble() {
        Assert.assertEquals(12.34, NumberInput.parseAsDouble("12.34", 1.0), 0.0001);
        Assert.assertEquals(1.0, NumberInput.parseAsDouble(null, 1.0), 0.0001);
        Assert.assertEquals(1.0, NumberInput.parseAsDouble("", 1.0), 0.0001);
        Assert.assertEquals(1.0, NumberInput.parseAsDouble("invalid", 1.0), 0.0001);
    }

    @Test
    public void testParseDoubleNastySmall() {
        double val = NumberInput.parseDouble(NumberInput.NASTY_SMALL_DOUBLE);
        Assert.assertEquals(Double.MIN_VALUE, val, 0.0);
    }

    @Test
    public void testParseBigDecimalString() {
        BigDecimal bd = NumberInput.parseBigDecimal("123.456");
        Assert.assertEquals(new BigDecimal("123.456"), bd);
    }

    @Test
    public void testParseBigDecimalBuffer() {
        char[] buf = "123.456".toCharArray();
        BigDecimal bd1 = NumberInput.parseBigDecimal(buf);
        Assert.assertEquals(new BigDecimal("123.456"), bd1);

        BigDecimal bd2 = NumberInput.parseBigDecimal(buf, 0, 3);
        Assert.assertEquals(new BigDecimal("123"), bd2);
    }
}
