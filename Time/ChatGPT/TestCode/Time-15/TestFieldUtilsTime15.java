package org.joda.time.field;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFieldUtilsTime15 {
    @Test
    public void testSafeMultiplyMinValueByMinusOneThrows() {
        try {
            FieldUtils.safeMultiply(Long.MIN_VALUE, -1);
            org.junit.Assert.fail("Expected ArithmeticException");
        } catch (ArithmeticException expected) {
            assertEquals("ArithmeticException", expected.getClass().getSimpleName());
        }
    }
}