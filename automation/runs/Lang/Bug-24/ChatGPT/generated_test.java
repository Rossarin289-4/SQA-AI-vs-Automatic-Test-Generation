package org.apache.commons.lang3.math;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumberUtilsLang24Test {

    @Test
    public void testDecimalNumberWithUppercaseLongQualifierIsRejected() {
        assertFalse(NumberUtils.isNumber("12.5L"));
    }

    @Test
    public void testLeadingDecimalNumberWithUppercaseLongQualifierIsRejected() {
        assertFalse(NumberUtils.isNumber(".5L"));
    }

    @Test
    public void testTrailingDecimalPointWithUppercaseLongQualifierIsRejected() {
        assertFalse(NumberUtils.isNumber("5.L"));
    }

    @Test
    public void testNegativeDecimalNumberWithLowercaseLongQualifierIsRejected() {
        assertFalse(NumberUtils.isNumber("-7.25l"));
    }

    @Test
    public void testIntegerWithLongQualifierRemainsValid() {
        assertTrue(NumberUtils.isNumber("42L"));
    }

    @Test
    public void testDecimalWithFloatQualifierRemainsValid() {
        assertTrue(NumberUtils.isNumber("12.5F"));
    }
}
