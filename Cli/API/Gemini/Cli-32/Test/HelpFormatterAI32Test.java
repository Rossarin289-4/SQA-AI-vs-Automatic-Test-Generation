package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HelpFormatterAI32Test
{
    @Test
    public void testGettersAndSetters()
    {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        assertEquals(80, formatter.getWidth());

        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(4);
        assertEquals(4, formatter.getDescPadding());

        formatter.setSyntaxPrefix("cmd: ");
        assertEquals("cmd: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void testCreatePadding()
    {
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(4);
        assertEquals("    ", padding);
    }

    @Test
    public void testRtrim()
    {
        HelpFormatter formatter = new HelpFormatter();
        String trimmed = formatter.rtrim("test   ");
        assertEquals("test", trimmed);
    }
}
