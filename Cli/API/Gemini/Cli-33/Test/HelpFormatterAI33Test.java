package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HelpFormatterAI33Test
{
    @Test
    public void testGetWidthAndSetWidth()
    {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    @Test
    public void testCreatePadding()
    {
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(4);
        assertNotNull(padding);
        assertEquals(4, padding.length());
        assertEquals("    ", padding);
    }

    @Test
    public void testRtrim()
    {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("test", formatter.rtrim("test   "));
        assertEquals("", formatter.rtrim("   "));
        assertEquals(null, formatter.rtrim(null));
    }
}
