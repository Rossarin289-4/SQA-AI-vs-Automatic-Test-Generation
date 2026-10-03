package org.apache.commons.lang3.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberUtilsLang16Test {

    @Test
    public void testUppercaseHexWithExponentLikeDigitAtBoundary() {
        Number result = NumberUtils.createNumber("0XE");

        assertEquals(Integer.valueOf(14), result);
    }

    @Test
    public void testNegativeUppercaseHexWithLowercaseExponentLikeDigit() {
        Number result = NumberUtils.createNumber("-0Xe");

        assertEquals(Integer.valueOf(-14), result);
    }

    @Test
    public void testUppercaseHexWithExponentLikeDigitInRepresentativeValue() {
        Number result = NumberUtils.createNumber("0X2B7E");

        assertEquals(Integer.valueOf(11134), result);
    }

    @Test
    public void testNegativeUppercaseHexRepresentativeValue() {
        Number result = NumberUtils.createNumber("-0X4A6E");

        assertEquals(Integer.valueOf(-19054), result);
    }
}
