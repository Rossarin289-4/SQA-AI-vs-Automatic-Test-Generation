package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberUtilsLang36Test {

    @Test
    public void testCreateNumberPositiveTrailingDecimalPoint() {
        Number result = NumberUtils.createNumber("7.");

        assertEquals(Float.valueOf("7."), result);
        assertEquals(Float.class, result.getClass());
    }

    @Test
    public void testCreateNumberNegativeTrailingDecimalPoint() {
        Number result = NumberUtils.createNumber("-8.");

        assertEquals(Float.valueOf("-8."), result);
        assertEquals(Float.class, result.getClass());
    }

    @Test
    public void testCreateNumberZeroWithTrailingDecimalPoint() {
        Number result = NumberUtils.createNumber("0.");

        assertEquals(Float.valueOf("0."), result);
        assertEquals(Float.class, result.getClass());
    }

    @Test
    public void testCreateNumberRegularDecimalStillWorks() {
        Number result = NumberUtils.createNumber("7.25");

        assertEquals(Float.valueOf("7.25"), result);
        assertEquals(Float.class, result.getClass());
    }

    @Test
    public void testCreateNumberLeadingDecimalPointStillWorks() {
        Number result = NumberUtils.createNumber(".75");

        assertEquals(Float.valueOf(".75"), result);
        assertEquals(Float.class, result.getClass());
    }
}
