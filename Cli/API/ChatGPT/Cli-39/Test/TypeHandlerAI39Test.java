package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TypeHandlerAI39Test
{
    @Test
    public void testCreateNumberLong() throws ParseException
    {
        Number number = TypeHandler.createNumber("123");
        assertNotNull(number);
        assertEquals(Long.valueOf(123L), number);
    }

    @Test
    public void testCreateNumberDouble() throws ParseException
    {
        Number number = TypeHandler.createNumber("123.45");
        assertNotNull(number);
        assertEquals(Double.valueOf(123.45), number);
    }

    @Test
    public void testCreateValueString() throws ParseException
    {
        Object value = TypeHandler.createValue("testString", PatternOptionBuilder.STRING_VALUE);
        assertEquals("testString", value);
    }
}
