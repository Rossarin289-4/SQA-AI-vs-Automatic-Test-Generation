package org.apache.commons.lang3.math;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NumberUtilsCreateNumberGeminiTest{
    @Test
    public void testCreateNumber_NullInput() {
        assertNull(NumberUtils.createNumber(null));
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_BlankInput() {
        NumberUtils.createNumber("   ");
    }

    @Test
    public void testCreateNumber_HexadecimalInteger() {
        Number result = NumberUtils.createNumber("0x7FFFFFFF");
        assertEquals("Expected Integer for 8 hex digits", Integer.class, result.getClass());
        assertEquals(2147483647, result.intValue());
    }

    @Test
    public void testCreateNumber_HexadecimalLong() {
        Number result = NumberUtils.createNumber("0x80000000");
        assertEquals("Expected Long for 9 hex digits", Long.class, result.getClass());
        assertEquals(2147483648L, result.longValue());
    }

    @Test
    public void testCreateNumber_HexadecimalBigInteger() {
        Number result = NumberUtils.createNumber("0x10000000000000000");
        assertEquals("Expected BigInteger for 17 hex digits", BigInteger.class, result.getClass());
    }

    @Test
    public void testCreateNumber_ExplicitLongSuffix() {
        Number result = NumberUtils.createNumber("123L");
        assertEquals(Long.class, result.getClass());
        assertEquals(123L, result.longValue());
    }

    @Test
    public void testCreateNumber_ExplicitFloatSuffix() {
        Number result = NumberUtils.createNumber("1.23f");
        assertEquals(Float.class, result.getClass());
        assertEquals(1.23F, result.floatValue(), 0.0001);
    }

    @Test
    public void testCreateNumber_ExplicitDoubleSuffix() {
        Number result = NumberUtils.createNumber("1.23D");
        assertEquals(Double.class, result.getClass());
        assertEquals(1.23D, result.doubleValue(), 0.0001);
    }

    @Test
    public void testCreateNumber_ImplicitInteger() {
        Number result = NumberUtils.createNumber("2147483647");
        assertEquals(Integer.class, result.getClass());
        assertEquals(2147483647, result.intValue());
    }

    @Test
    public void testCreateNumber_ImplicitLong() {
        Number result = NumberUtils.createNumber("2147483648");
        assertEquals(Long.class, result.getClass());
        assertEquals(2147483648L, result.longValue());
    }

    @Test
    public void testCreateNumber_FloatUnderflowFallback() {
        Number result = NumberUtils.createNumber("1e-500");
        assertEquals("Expected BigDecimal due to underflow", BigDecimal.class, result.getClass());
    }

    @Test
    public void testCreateNumber_DoubleOverflowFallback() {
        Number result = NumberUtils.createNumber("1e400");
        assertEquals("Expected BigDecimal due to overflow", BigDecimal.class, result.getClass());
    }

    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_InvalidSuffix() {
        NumberUtils.createNumber("123A");
    }

    @Test
    public void testCreateNumberPrecisionLoss_LANG_693_Double() {
        String input = "1.123456789012345";
        Number result = NumberUtils.createNumber(input);
        
        assertNotEquals("Bug LANG-693: Number truncated to Float losing precision", 
                        Float.class, result.getClass());
        assertTrue("Expected Double or BigDecimal to maintain precision",
                    result instanceof Double || result instanceof BigDecimal);
        assertEquals(input, result.toString());
    }

    @Test
    public void testCreateNumberPrecisionLoss_LANG_693_BigDecimal() {
        String input = "1.1234567890123456789012";
        Number result = NumberUtils.createNumber(input);
        
        assertNotEquals("Bug LANG-693: Number truncated to Float losing precision", 
                        Float.class, result.getClass());
        assertNotEquals("Bug LANG-693: Number truncated to Double losing precision", 
                        Double.class, result.getClass());
        assertEquals("Expected BigDecimal to maintain precision for 22 decimal digits", 
                    BigDecimal.class, result.getClass());
        assertEquals(new BigDecimal(input), result);
    }
}