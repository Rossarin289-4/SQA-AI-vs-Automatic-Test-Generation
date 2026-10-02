package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CommandLineAI1Test {

    @Test
    public void testHasOptionAndValues() {
        CommandLine cmd = new CommandLine();
        Option opt = new Option("a", "alpha", true, "alpha option");
        opt.setValue("valA");
        cmd.addOption(opt);

        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("alpha"));
        assertTrue(cmd.hasOption('a'));

        assertEquals("valA", cmd.getOptionValue("a"));
        assertEquals("valA", cmd.getOptionValue('a'));
        assertEquals("valA", cmd.getOptionValue("alpha", "default"));

        assertNull(cmd.getOptionValue("b"));
        assertEquals("default", cmd.getOptionValue("b", "default"));
    }

    @Test
    public void testGetArgsAndArgList() {
        CommandLine cmd = new CommandLine();
        cmd.addArg("arg1");
        cmd.addArg("arg2");

        String[] args = cmd.getArgs();
        assertNotNull(args);
        assertEquals(2, args.length);
        assertEquals("arg1", args[0]);
        assertEquals("arg2", args[1]);

        assertNotNull(cmd.getArgList());
        assertEquals(2, cmd.getArgList().size());
    }

    @Test
    public void testOptionsAndIterator() {
        CommandLine cmd = new CommandLine();
        Option opt1 = new Option("b", "beta", false, "beta option");
        cmd.addOption(opt1);

        assertTrue(cmd.hasOption("b"));
        Option[] options = cmd.getOptions();
        assertNotNull(options);
        assertEquals(1, options.length);
        assertEquals(opt1, options[0]);

        assertNotNull(cmd.iterator());
        assertTrue(cmd.iterator().hasNext());
    }
}
