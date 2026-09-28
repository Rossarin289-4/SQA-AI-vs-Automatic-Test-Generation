package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtilsCreateNumberGeminiTest {

    // -------------------------------------------------------------------------
    // Basic / Standard Test Cases
    // -------------------------------------------------------------------------

    @Test
    public void testCreateNumberNull() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberEmpty() {
        NumberUtils.createNumber("");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberBlank() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumberInteger() {
        assertEquals(Integer.valueOf(123), NumberUtils.createNumber("123"));
        assertEquals(Integer.valueOf(-123), NumberUtils.createNumber("-123"));
    }

    @Test
    public void testCreateNumberLong() {
        assertEquals(Long.valueOf(2147483648L), NumberUtils.createNumber("2147483648"));
        assertEquals(Long.valueOf(-2147483649L), NumberUtils.createNumber("-2147483649"));
    }

    @Test
    public void testCreateNumberFloat() {
        assertEquals(Float.valueOf(1.23f), NumberUtils.createNumber("1.23f"));
    }

    @Test
    public void testCreateNumberDouble() {
        assertEquals(Double.valueOf(1.23d), NumberUtils.createNumber("1.23d"));
    }

    // -------------------------------------------------------------------------
    // Defect-Oriented Test Cases (Hexadecimal Prefixes & Negative Hex)
    // -------------------------------------------------------------------------

    @Test
    public void testCreateNumberNegativeHexInteger() {
        assertEquals(Integer.valueOf(-0x12345), NumberUtils.createNumber("-0x12345"));
        assertEquals(Integer.valueOf(-0X12345), NumberUtils.createNumber("-0X12345"));
    }

    @Test
    public void testCreateNumberHashHexInteger() {
        assertEquals(Integer.valueOf(0x12345), NumberUtils.createNumber("#12345"));
        assertEquals(Integer.valueOf(-0x12345), NumberUtils.createNumber("-#12345"));
    }

    @Test
    public void testCreateNumberNegativeHexLong() {
        assertEquals(Long.valueOf(-0x123456789AL), NumberUtils.createNumber("-0x123456789A"));
    }

    @Test
    public void testCreateNumberNegativeHexBigInteger() {
        assertEquals(new BigInteger("-123456789ABCDEF0123", 16), NumberUtils.createNumber("-0x123456789ABCDEF0123"));
    }
}