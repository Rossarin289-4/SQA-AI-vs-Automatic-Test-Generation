package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsDefectTest {

    @Test
    public void testIsNumberTrailingDecimalPointBasic() {
        // "5." is a valid Java number literal representation in many contexts or expected by Lang-521
        boolean result = NumberUtils.isNumber("5.");
        assertTrue("NumberUtils.isNumber(\"5.\") should return true", result);
    }

    @Test
    public void testIsNumberNegativeTrailingDecimalPoint() {
        boolean result = NumberUtils.isNumber("-10.");
        assertTrue("NumberUtils.isNumber(\"-10.\") should return true", result);
    }

    @Test
    public void testIsNumberTrailingDecimalPointLonger() {
        boolean result = NumberUtils.isNumber("123.");
        assertTrue("NumberUtils.isNumber(\"123.\") should return true", result);
    }

    @Test
    public void testCreateNumberTrailingDecimalPoint() {
        Number number = NumberUtils.createNumber("3.");
        assertNotNull("NumberUtils.createNumber(\"3.\") should not return null", number);
        assertEquals("Parsed number value should equal 3", 3.0, number.doubleValue(), 0.0001);
    }
}
