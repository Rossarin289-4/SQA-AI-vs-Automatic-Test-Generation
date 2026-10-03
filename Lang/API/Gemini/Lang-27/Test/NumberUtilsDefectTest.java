package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsDefectTest {

    @Test
    public void testCreateNumberNegativeHexInteger() {
        Number result = NumberUtils.createNumber("-0xFF");
        assertNotNull("Result should not be null", result);
        assertTrue("Result should be an Integer or Long", result instanceof Integer || result instanceof Long);
        assertEquals(-255, result.intValue());
    }

    @Test
    public void testCreateNumberNegativeHexShortFormat() {
        Number result = NumberUtils.createNumber("-0x10");
        assertNotNull("Result should not be null", result);
        assertEquals(-16, result.intValue());
    }

    @Test
    public void testCreateNumberNegativeHexUppercase() {
        Number result = NumberUtils.createNumber("-0x7A");
        assertNotNull("Result should not be null", result);
        assertEquals(-122, result.intValue());
    }

    @Test
    public void testCreateNumberPositiveHexControl() {
        Number result = NumberUtils.createNumber("0xFF");
        assertNotNull("Result should not be null", result);
        assertEquals(255, result.intValue());
    }
}
