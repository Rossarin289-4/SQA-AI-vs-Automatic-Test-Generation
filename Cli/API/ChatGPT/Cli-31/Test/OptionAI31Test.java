package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class OptionAI31Test
{
    @Test
    public void testGetId()
    {
        Option option = new Option("a", "desc");
        assertEquals('a', option.getId());
    }

    @Test
    public void testGetValueWithDefault()
    {
        Option option = new Option("b", true, "desc");
        assertEquals("default", option.getValue("default"));
    }

    @Test
    public void testCloneOption()
    {
        Option option = new Option("c", "longC", true, "desc");
        Option clone = (Option) option.clone();
        assertNotNull(clone);
        assertEquals(option.getOpt(), clone.getOpt());
        assertEquals(option.getValuesList(), clone.getValuesList());
    }
}
