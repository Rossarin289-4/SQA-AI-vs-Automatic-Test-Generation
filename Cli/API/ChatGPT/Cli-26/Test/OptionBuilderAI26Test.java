package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OptionBuilderAI26Test
{
    @Test
    public void testCreateWithCharAndProperties()
    {
        Option option = OptionBuilder.withLongOpt("test-long")
                .withDescription("test description")
                .hasArg()
                .isRequired(true)
                .withValueSeparator(':')
                .create('t');

        assertNotNull(option);
        assertEquals("t", option.getOpt());
        assertEquals("test-long", option.getLongOpt());
        assertEquals("test description", option.getDescription());
        assertTrue(option.isRequired());
        assertEquals(1, option.getArgs());
        assertEquals(':', option.getValueSeparator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithoutLongOptThrowsException()
    {
        OptionBuilder.create();
    }

    @Test
    public void testResetStateBetweenCreations()
    {
        OptionBuilder.withLongOpt("first")
                .hasArgs(3)
                .create('f');

        Option option2 = OptionBuilder.withLongOpt("second")
                .create('s');

        assertEquals(Option.UNINITIALIZED, option2.getArgs());
    }
}
