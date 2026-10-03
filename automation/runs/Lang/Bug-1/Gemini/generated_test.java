package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsTestCustom {

    @Test
    public void testCreateNumberWithScientificNotationAndSigns() {
        // Test parsing scientific notation with signs which often fails or misbehaves in buggy version
        Number result = NumberUtils.createNumber("1.23e+2");
        assertNotNull(result);
        assertEquals(Double.valueOf(123.0), result);
    }

    @Test
    public void testCreateNumberWithNegativeExponent() {
        Number result = NumberUtils.createNumber("1.23e-2");
        assertNotNull(result);
        assertEquals(Double.valueOf(0.0123), result);
    }

    @Test
    public void testCreateNumberFloatTypeQualifierWithExponent() {
        Number result = NumberUtils.createNumber("1.5e1f");
        assertNotNull(result);
        assertTrue(result instanceof Float);
        assertEquals(Float.valueOf(15.0f), result);
    }

    @Test
    public void testCreateNumberDoubleTypeQualifierWithExponent() {
        Number result = NumberUtils.createNumber("2.5E2d");
        assertNotNull(result);
        assertTrue(result instanceof Double);
        assertEquals(Double.valueOf(250.0d), result);
    }
}
