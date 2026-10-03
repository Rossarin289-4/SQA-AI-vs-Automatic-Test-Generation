package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class OptionsAI36Test
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

        assertNotNull(options.getOption("a"));
        assertEquals("alpha", options.getOption("a").getLongOpt());
        assertEquals("alpha", options.getOption("alpha").getLongOpt());
    }

    @Test
    public void testMatchingOptions()
    {
        Options options = new Options();
        options.addOption("b", "beta", false, "Beta option");
        options.addOption("c", "bouquet", false, "Bouquet option");

        List<String> matches = options.getMatchingOptions("b");
        assertTrue(matches.contains("beta"));
        assertTrue(matches.contains("bouquet"));
    }

    @Test
    public void testOptionGroup()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("x", "ex", false, "Ex"));
        group.addOption(new Option("y", "why", false, "Why"));

        options.addOptionGroup(group);

        assertTrue(options.getRequiredOptions().contains(group));
        assertEquals(group, options.getOptionGroup(options.getOption("x")));
    }
}
