package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OptionGroupAI36Test
{
    @Test
    public void testAddAndGetOptions()
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha");
        Option opt2 = new Option("b", "beta");

        group.addOption(opt1);
        group.addOption(opt2);

        assertNotNull(group.getOptions());
        assertEquals(2, group.getOptions().size());
        assertTrue(group.getNames().contains("a"));
        assertTrue(group.getNames().contains("b"));
    }

    @Test
    public void testSetSelectedAndAlreadySelected() throws AlreadySelectedException
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha");
        Option opt2 = new Option("b", "beta");

        group.addOption(opt1);
        group.addOption(opt2);

        group.setSelected(opt1);
        assertEquals("a", group.getSelected());

        group.setSelected(opt1);
        assertEquals("a", group.getSelected());

        group.setSelected(null);
        assertEquals(null, group.getSelected());
    }

    @Test
    public void testToString()
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "descA");
        Option opt2 = new Option(null, "longB", false, "descB");

        group.addOption(opt1);
        group.addOption(opt2);

        String str = group.toString();
        assertEquals("[-a descA, --longB descB]", str);
    }
}
