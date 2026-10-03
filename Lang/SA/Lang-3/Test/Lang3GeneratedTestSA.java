package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

public class Lang3GeneratedTestSA {

    @Test
    public void test01_seven_decimal_digits() {
        assertEquals(Float.class, NumberUtils.createNumber("12345.1234567").getClass());
    }

    @Test
    public void test02_seven_decimal_digits_small() {
        assertEquals(Float.class, NumberUtils.createNumber("1.2345678").getClass());
    }

    @Test
    public void test03_eight_decimal_digits() {
        assertEquals(Double.class, NumberUtils.createNumber("12345.12345678").getClass());
    }

    @Test
    public void test04_eight_decimal_digits_small() {
        assertEquals(Double.class, NumberUtils.createNumber("1.23456789").getClass());
    }

    @Test
    public void test05_twelve_decimal_digits() {
        assertEquals(Double.class, NumberUtils.createNumber("1234567.890123456789").getClass());
    }

    @Test
    public void test06_sixteen_decimal_digits() {
        assertEquals(Double.class, NumberUtils.createNumber("1234567.8901234567890123").getClass());
    }

    @Test
    public void test07_exponent_eight_decimal_digits() {
        assertEquals(Double.class, NumberUtils.createNumber("1.23456789e10").getClass());
    }

    @Test
    public void test08_exponent_twelve_decimal_digits() {
        assertEquals(Double.class, NumberUtils.createNumber("1.234567890123e10").getClass());
    }

    @Test
    public void test09_seventeen_decimal_digits() {
        assertEquals(java.math.BigDecimal.class, NumberUtils.createNumber("1234567.89012345678901234").getClass());
    }

    @Test
    public void test10_long_precision_decimal() {
        assertEquals(java.math.BigDecimal.class, NumberUtils.createNumber("0.123456789012345678901").getClass());
    }

    @Test
    public void test11_integer_without_decimal() {
        assertEquals(Integer.class, NumberUtils.createNumber("1234567").getClass());
    }

    @Test
    public void test12_simple_decimal() {
        assertEquals(Float.class, NumberUtils.createNumber("12.34567").getClass());
    }

}
