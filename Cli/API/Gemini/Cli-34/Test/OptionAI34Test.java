package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class OptionAI34Test
{
    @Test
    public void testGetId()
    {
        Option option = new Option("a", "desc");
        assertEquals('a', option.getId());
    }

    @Test
    public void testClone()
    {
        Option option = new Option("b", true, "desc");
        Option clone = (Option) option.clone();
        assertNotNull(clone);
        assertEquals(option.getOpt(), clone.getOpt());
    }

    @Test
    public void testGetType()
    {
        Option option = new Option("c", "desc");
        assertEquals(String.class, option.getType());
    }
}
