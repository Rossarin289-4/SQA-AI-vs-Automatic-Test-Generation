package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class OptionsAI35Test
{
    @Test
    public void testAddAndGetOption()
    {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");

        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("alpha"));
        assertTrue(options.hasShortOption("a"));
        assertTrue(options.hasLongOption("alpha"));

        Option opt = options.getOption("a");
        assertNotNull(opt);
        assertEquals("alpha", opt.getLongOpt());
    }

    @Test
    public void testGetMatchingOptions()
    {
        Options options = new Options();
        options.addOption("b", "beta", false, "Beta option");
        options.addOption("c", "bundle", false, "Bundle option");

        List<String> matches = options.getMatchingOptions("b");
        assertTrue(matches.contains("beta"));
        assertTrue(matches.contains("bundle"));
    }

    @Test
    public void testOptionGroup()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);

        Option opt1 = new Option("x", "extra", false, "Extra");
        group.addOption(opt1);
        options.addOptionGroup(group);

        assertTrue(options.getRequiredOptions().contains(group));
        assertEquals(group, options.getOptionGroup(opt1));
    }
}
