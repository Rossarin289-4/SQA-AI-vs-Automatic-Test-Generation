package org.apache.commons.lang3.math;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class NumberUtilsLang27Test {

    @Test(expected = NumberFormatException.class)
    public void testDoubleExponentMarkersAdjacentLowerThenUpper() {
        NumberUtils.createNumber("7eE");
    }

    @Test(expected = NumberFormatException.class)
    public void testDoubleExponentMarkersAdjacentUpperThenLower() {
        NumberUtils.createNumber("7Ee");
    }

    @Test(expected = NumberFormatException.class)
    public void testDoubleExponentMarkersAfterDecimalPoint() {
        NumberUtils.createNumber("12.5eE");
    }

    @Test(expected = NumberFormatException.class)
    public void testSecondExponentMarkerAfterExponentSign() {
        NumberUtils.createNumber("-3E+e");
    }

    @Test
    public void testSingleLowercaseExponentRemainsValid() {
        assertNotNull(NumberUtils.createNumber("4e2"));
    }

    @Test
    public void testSingleUppercaseExponentRemainsValid() {
        assertNotNull(NumberUtils.createNumber("5E3"));
    }
}
