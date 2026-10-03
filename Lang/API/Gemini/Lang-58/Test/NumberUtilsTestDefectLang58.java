package org.apache.commons.lang.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsTestDefectLang58 {

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberWithLoneQualifierF() {
        NumberUtils.createNumber("f");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberWithLoneQualifierL() {
        NumberUtils.createNumber("L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberWithDecimalAndQualifier() {
        NumberUtils.createNumber("1.f");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberWithExponentAndQualifier() {
        NumberUtils.createNumber("1e2f");
    }

    @Test
    public void testCreateNumberWithValidFloatQualifier() {
        Number num = NumberUtils.createNumber("123.45f");
        assertNotNull(num);
        assertTrue(num instanceof Float);
        assertEquals(123.45f, num.floatValue(), 0.001f);
    }
}
