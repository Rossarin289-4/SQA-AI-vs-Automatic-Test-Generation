package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OptionBuilderAI34Test
{
    @Test
    public void testCreateWithCharAndProperties()
    {
        Option option = OptionBuilder.withLongOpt("testLong")
                                     .withDescription("testDesc")
                                     .withArgName("testArgName")
                                     .hasArg()
                                     .isRequired()
                                     .withValueSeparator(':')
                                     .create('t');

        assertNotNull(option);
        assertEquals("t", option.getOpt());
        assertEquals("testLong", option.getLongOpt());
        assertEquals("testDesc", option.getDescription());
        assertEquals("testArgName", option.getArgName());
        assertEquals(1, option.getArgs());
        assertTrue(option.isRequired());
        assertEquals(':', option.getValueSeparator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithoutLongOptOrCharThrowsException()
    {
        OptionBuilder.create();
    }

    @Test
    public void testCreateWithStringOption()
    {
        Option option = OptionBuilder.hasOptionalArgs(3)
                                     .withType(Number.class)
                                     .create("optName");

        assertNotNull(option);
        assertEquals("optName", option.getOpt());
        assertEquals(3, option.getArgs());
        assertTrue(option.hasOptionalArg());
        assertEquals(Number.class, option.getType());
    }
}
