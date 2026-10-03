package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HelpFormatterAI24Test
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

        formatter.setSyntaxPrefix("syntax: ");
        assertEquals("syntax: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());

        formatter.setLongOptPrefix("---");
        assertEquals("---", formatter.getLongOptPrefix());

        formatter.setArgName("val");
        assertEquals("val", formatter.getArgName());
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
        assertEquals(null, formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
    }
}
