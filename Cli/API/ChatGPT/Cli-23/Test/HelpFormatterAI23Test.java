package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HelpFormatterAI23Test
{
    @Test
    public void testGettersAndSetters()
    {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());

        formatter.setSyntaxPrefix("syntax: ");
        assertEquals("syntax: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());

        formatter.setLongOptPrefix("---");
        assertEquals("---", formatter.getLongOptPrefix());

        formatter.setArgName("filename");
        assertEquals("filename", formatter.getArgName());
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
        assertEquals("test", formatter.rtrim("test   "));
        assertEquals("", formatter.rtrim("   "));
        assertEquals(null, formatter.rtrim(null));
    }
}
