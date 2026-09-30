package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.BigInteger;

import org.junit.Test;

public class NumberUtilsCreateNumberBPSOTest {

    @Test
    public void test01() {
        try {
            NumberUtils.createNumber("");
            org.junit.Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void test02() {
        Number result = NumberUtils.createNumber("-42");
        assertEquals(Integer.class, result.getClass());
    }

    @Test
    public void test03() {
        Number result = NumberUtils.createNumber("0x1000000000000000");
        assertEquals(Long.class, result.getClass());
    }

    @Test
    public void test04() {
        Number result = NumberUtils.createNumber("1e3");
        assertEquals(Float.class, result.getClass());
    }

    @Test
    public void test05() {
        Number result = NumberUtils.createNumber("3.40282355e+38");
        assertEquals(Double.class, result.getClass());
    }

    @Test
    public void test06() {
        Number result = NumberUtils.createNumber("1.79769313486231585e+308");
        assertEquals(BigDecimal.class, result.getClass());
    }

    @Test
    public void test07() {
        Number result = NumberUtils.createNumber("4.9e-324");
        assertEquals(Double.class, result.getClass());
    }

    @Test
    public void test08() {
        Number result = NumberUtils.createNumber("1.5F");
        assertEquals(Float.class, result.getClass());
    }

    @Test
    public void test09() {
        Number result = NumberUtils.createNumber("1.5D");
        assertEquals(Double.class, result.getClass());
    }

    @Test
    public void test10() {
        try {
            NumberUtils.createNumber("1.2L");
            org.junit.Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void test11() {
        try {
            NumberUtils.createNumber("1.2Q");
            org.junit.Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void test12() {
        try {
            NumberUtils.createNumber("-");
            org.junit.Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

}
