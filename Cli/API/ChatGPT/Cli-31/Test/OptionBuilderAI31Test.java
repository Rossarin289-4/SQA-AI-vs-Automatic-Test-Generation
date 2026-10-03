package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OptionBuilderAI31Test
{
    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithoutLongOptThrowsException()
    {
        OptionBuilder.create();
    }

    @Test
    public void testCreateWithCharAndProperties()
    {
        Option option = OptionBuilder.withLongOpt("test-long")
                                     .withDescription("test description")
                                     .hasArg()
                                     .isRequired()
                                     .withArgName("argName")
                                     .withValueSeparator(':')
                                     .create('t');

        assertNotNull(option);
        assertEquals("t", option.getOpt());
        assertEquals("test-long", option.getLongOpt());
        assertEquals("test description", option.getDescription());
        assertEquals(1, option.getArgs());
        assertTrue(option.isRequired());
        assertEquals("argName", option.getArgName());
        assertEquals(':', option.getValueSeparator());
    }

    @Test
    public void testCreateWithString()
    {
        Option option = OptionBuilder.hasOptionalArgs(2)
                                     .create("optStr");

        assertNotNull(option);
        assertEquals("optStr", option.getOpt());
        assertEquals(2, option.getArgs());
        assertTrue(option.hasOptionalArg());
    }
}
