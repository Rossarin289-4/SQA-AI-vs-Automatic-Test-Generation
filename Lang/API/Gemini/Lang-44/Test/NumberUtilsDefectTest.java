package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsDefectTest {

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberSingleAlphabeticChar() {
        NumberUtils.createNumber("a");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberSingleTypeQualifierChar() {
        NumberUtils.createNumber("L");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberSingleSymbolChar() {
        NumberUtils.createNumber(".");
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumberSingleWhitespaceChar() {
        NumberUtils.createNumber(" ");
    }

    @Test
    public void testCreateNumberSingleValidDigit() {
        Number result = NumberUtils.createNumber("7");
        assertNotNull(result);
        assertEquals(Integer.class, result.getClass());
        assertEquals(Integer.valueOf(7), result);
    }
}
