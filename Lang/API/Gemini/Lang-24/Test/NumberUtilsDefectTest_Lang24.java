package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsDefectTest_Lang24 {

    @Test
    public void testIsNumberDecimalWithLongQualifierUpper() {
        // "12.34L" is not a valid Java number because 'L' cannot follow a decimal point.
        // Buggy version returns true; Fixed version returns false.
        assertFalse(NumberUtils.isNumber("12.34L"));
    }

    @Test
    public void testIsNumberDecimalWithLongQualifierLower() {
        // "0.5l" is not a valid Java number because 'l' cannot follow a decimal point.
        // Buggy version returns true; Fixed version returns false.
        assertFalse(NumberUtils.isNumber("0.5l"));
    }

    @Test
    public void testIsNumberZeroDecimalWithLongQualifier() {
        // "0.0L" is invalid since decimals and long qualifiers cannot be combined.
        // Buggy version returns true; Fixed version returns false.
        assertFalse(NumberUtils.isNumber("0.0L"));
    }

    @Test
    public void testIsNumberValidLongWithoutDecimal() {
        // Control test: "987654L" is a valid long number.
        // Both buggy and fixed versions should return true.
        assertTrue(NumberUtils.isNumber("987654L"));
    }

    @Test
    public void testIsNumberValidDecimalWithoutQualifier() {
        // Control test: "45.67" is a valid double/float literal.
        // Both buggy and fixed versions should return true.
        assertTrue(NumberUtils.isNumber("45.67"));
    }
}
