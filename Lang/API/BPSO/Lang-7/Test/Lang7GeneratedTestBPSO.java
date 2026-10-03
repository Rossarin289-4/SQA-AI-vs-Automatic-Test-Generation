package org.apache.commons.lang3.math;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

public class Lang7GeneratedTestBPSO {

    @Test
    public void test01_double_minus_integer_1() {
        expectNumberFormatException("--1");
    }

    @Test
    public void test02_double_minus_integer_large() {
        expectNumberFormatException("--123456789");
    }

    @Test
    public void test03_double_minus_zero() {
        expectNumberFormatException("--0");
    }

    @Test
    public void test04_double_minus_decimal() {
        expectNumberFormatException("--0.5");
    }

    @Test
    public void test05_double_minus_decimal_large() {
        expectNumberFormatException("--12345.6789");
    }

    @Test
    public void test06_double_minus_exponent() {
        expectNumberFormatException("--1e3");
    }

    @Test
    public void test07_double_minus_negative_decimal() {
        expectNumberFormatException("--999.25");
    }

    @Test
    public void test08_double_minus_whitespace() {
        expectNumberFormatException("  --42  ");
    }

    @Test
    public void test09_baseline_integer() {
        assertTrue(NumberUtils.createNumber("1") instanceof Integer);
    }

    @Test
    public void test10_baseline_negative_integer() {
        assertTrue(NumberUtils.createNumber("-1") instanceof Integer);
    }

    @Test
    public void test11_baseline_decimal() {
        assertNotNull(NumberUtils.createNumber("1.5"));
    }

    @Test
    public void test12_baseline_hex() {
        assertNotNull(NumberUtils.createNumber("0x10"));
    }

    private void expectNumberFormatException(String value) {
        try {
            NumberUtils.createNumber(value);
            fail("Expected NumberFormatException for: " + value);
        } catch (NumberFormatException expected) {
            // expected
        }
    }
}
