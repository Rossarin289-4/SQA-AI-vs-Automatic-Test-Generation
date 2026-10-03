package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OptionGroupAI27Test
{
    @Test
    public void testAddAndGetOptions()
    {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha");
        Option optB = new Option("b", "beta");

        group.addOption(optA);
        group.addOption(optB);

        assertNotNull(group.getOptions());
        assertEquals(2, group.getOptions().size());
        assertTrue(group.getNames().contains("a"));
        assertTrue(group.getNames().contains("b"));
    }

    @Test
    public void testSetSelectedAndAlreadySelectedException() throws AlreadySelectedException
    {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha");
        Option optB = new Option("b", "beta");

        group.addOption(optA);
        group.addOption(optB);

        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        group.setSelected(null);
        assertEquals(null, group.getSelected());

        group.setSelected(optA);
        try
        {
            group.setSelected(optB);
            org.junit.Assert.fail("Expected AlreadySelectedException");
        }
        catch (AlreadySelectedException e)
        {
            assertNotNull(e);
        }
    }

    @Test
    public void testToStringRepresentation()
    {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "descA");
        group.addOption(optA);

        String str = group.toString();
        assertNotNull(str);
        assertTrue(str.contains("-a descA"));
    }
}
