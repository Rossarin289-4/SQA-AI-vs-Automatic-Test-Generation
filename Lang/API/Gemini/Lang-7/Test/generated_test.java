package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberUtilsDefectTest {

    @Test
    public void testCreateNumberWithLeadingPlusInteger() {
        Number result = NumberUtils.createNumber("+123");
        assertNotNull("Result should not be null", result);
        assertEquals(Integer.class, result.getClass());
        assertEquals(Integer.valueOf(123), result);
    }

    @Test
    public void testCreateNumberWithLeadingPlusFloat() {
        Number result = NumberUtils.createNumber("+12.3f");
        assertNotNull("Result should not be null", result);
        assertEquals(Float.class, result.getClass());
        assertEquals(Float.valueOf(12.3f), result);
    }

    @Test
    public void testCreateNumberWithLeadingPlusDouble() {
        Number result = NumberUtils.createNumber("+12.34d");
        assertNotNull("Result should not be null", result);
        assertEquals(Double.class, result.getClass());
        assertEquals(Double.valueOf(12.34d), result);
    }

    @Test
    public void testCreateNumberWithLeadingPlusLong() {
        Number result = NumberUtils.createNumber("+123456L");
        assertNotNull("Result should not be null", result);
        assertEquals(Long.class, result.getClass());
        assertEquals(Long.valueOf(123456L), result);
    }
}
