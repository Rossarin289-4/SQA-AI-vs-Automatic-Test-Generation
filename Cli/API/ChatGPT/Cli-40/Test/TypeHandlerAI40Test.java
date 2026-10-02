package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TypeHandlerAI40Test
{
    @Test
    public void testCreateNumber() throws Exception
    {
        Number longNum = TypeHandler.createNumber("123");
        assertEquals(Long.valueOf(123L), longNum);

        Number doubleNum = TypeHandler.createNumber("123.45");
        assertEquals(Double.valueOf(123.45), doubleNum);
    }

    @Test
    public void testCreateValueString() throws Exception
    {
        String result = TypeHandler.createValue("testString", PatternOptionBuilder.STRING_VALUE);
        assertEquals("testString", result);
    }

    @Test
    public void testCreateURL() throws Exception
    {
        java.net.URL url = TypeHandler.createURL("http://localhost/");
        assertNotNull(url);
        assertEquals("http://localhost/", url.toString());
    }
}
