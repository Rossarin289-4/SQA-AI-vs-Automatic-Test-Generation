package org.apache.commons.lang3.math;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NumberUtilsCreateNumberSATest {

    @Test
    public void test01() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test
    public void test02() {
        Number result = NumberUtils.createNumber("0");
        assertTrue(result instanceof Integer);
    }

    @Test
    public void test03() {
        Number result = NumberUtils.createNumber("9223372036854775808");
        assertTrue(result instanceof BigInteger);
    }

    @Test
    public void test04() {
        Number result = NumberUtils.createNumber("0x0");
        assertTrue(result instanceof Integer);
    }

    @Test
    public void test05() {
        Number result = NumberUtils.createNumber("0x1000000000000000");
        assertTrue(result instanceof Long);
    }

    @Test
    public void test06() {
        Number result = NumberUtils.createNumber("1e-500");
        assertTrue(result instanceof BigDecimal);
    }

    @Test
    public void test07() {
        Number result = NumberUtils.createNumber("1.79769313486231585e+308");
        assertTrue(result instanceof BigDecimal);
    }

    @Test
    public void test08() {
        Number result = NumberUtils.createNumber("1.5F");
        assertTrue(result instanceof Float);
    }

    @Test
    public void test09() {
        Number result = NumberUtils.createNumber("1.5D");
        assertTrue(result instanceof Double);
    }

    @Test
    public void test10() {
        try {
            NumberUtils.createNumber("1.2L");
            throw new AssertionError("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
            // expected
        }
    }

    @Test
    public void test11() {
        try {
            NumberUtils.createNumber("1.2Q");
            throw new AssertionError("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
            // expected
        }
    }

    @Test
    public void test12() {
        try {
            NumberUtils.createNumber("-");
            throw new AssertionError("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
            // expected
        }
    }

}
