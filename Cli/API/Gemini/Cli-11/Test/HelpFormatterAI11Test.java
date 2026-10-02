package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HelpFormatterAI11Test {

    @Test
    public void testSettersAndGetters() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        assertEquals(80, formatter.getWidth());

        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());

        formatter.setSyntaxPrefix("cmd: ");
        assertEquals("cmd: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());

        formatter.setLongOptPrefix("---");
        assertEquals("---", formatter.getLongOptPrefix());

        formatter.setArgName("parameter");
        assertEquals("parameter", formatter.getArgName());
    }

    @Test
    public void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(4);
        assertEquals("    ", padding);
    }

    @Test
    public void testRtrim() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "test   ";
        assertEquals("test", formatter.rtrim(text));
        assertEquals("", formatter.rtrim("   "));
        assertEquals(null, formatter.rtrim(null));
    }
}
