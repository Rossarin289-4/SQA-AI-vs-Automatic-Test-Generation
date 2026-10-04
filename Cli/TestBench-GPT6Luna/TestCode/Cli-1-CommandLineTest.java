package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CommandLineTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testEmptyCommandLineHasNoOptions() throws Exception {
        CommandLine line = new CommandLine();
        assertFalse(line.hasOption("x"));
        assertEquals(0, line.getOptions().length);
    }

    public void testAddAndFindOptionByShortName() throws Exception {
        CommandLine line = new CommandLine();
        Option option = new Option("x", "example");
        line.addOption(option);
        assertTrue(line.hasOption("x"));
    }

    public void testHasOptionAcceptsLeadingHyphen() throws Exception {
        CommandLine line = new CommandLine();
        Option option = new Option("x", "example");
        line.addOption(option);
        assertTrue(line.hasOption("-x"));
    }

    public void testHasOptionAcceptsDoubleLeadingHyphen() throws Exception {
        CommandLine line = new CommandLine();
        Option option = new Option("x", "example");
        line.addOption(option);
        assertTrue(line.hasOption("--x"));
    }

    public void testHasOptionFindsLongName() throws Exception {
        CommandLine line = new CommandLine();
        Option option = new Option("x", "extra", false, "example");
        line.addOption(option);
        assertTrue(line.hasOption("extra"));
    }

    public void testHasOptionFindsLongNameWithHyphens() throws Exception {
        CommandLine line = new CommandLine();
        Option option = new Option("x", "extra", false, "example");
        line.addOption(option);
        assertTrue(line.hasOption("--extra"));
    }

    public void testUnknownOptionIsNotFound() throws Exception {
        CommandLine line = new CommandLine();
        line.addOption(new Option("x", "example"));
        assertFalse(line.hasOption("y"));
    }

    public void testGetOptionValueIsNullWithoutValues() throws Exception {
        CommandLine line = new CommandLine();
        Option option = new Option("x", "example");
        line.addOption(option);
        assertNull(line.getOptionValue("x"));
    }

    public void testGetOptionValuesIsNullWithoutValues() throws Exception {
        CommandLine line = new CommandLine();
        Option option = new Option("x", "example");
        line.addOption(option);
        assertNull(line.getOptionValues("x"));
    }

    public void testGetOptionObjectIsNullWithoutValue() throws Exception {
        CommandLine line = new CommandLine();
        Option option = new Option("x", "example");
        line.addOption(option);
        assertNull(line.getOptionObject("x"));
    }

    public void testUnknownOptionValuesAreNull() throws Exception {
        CommandLine line = new CommandLine();
        assertNull(line.getOptionValues("x"));
        assertNull(line.getOptionValue("x"));
    }

    public void testGetOptionsReturnsAddedOption() throws Exception {
        CommandLine line = new CommandLine();
        Option option = new Option("x", "example");
        line.addOption(option);
        Option[] result = line.getOptions();
        assertEquals(1, result.length);
        assertSame(option, result[0]);
    }

    public void testIteratorReturnsAddedOption() throws Exception {
        CommandLine line = new CommandLine();
        Option option = new Option("x", "example");
        line.addOption(option);
        Iterator it = line.iterator();
        assertTrue(it.hasNext());
        assertSame(option, it.next());
        assertFalse(it.hasNext());
    }

    public void testAddedArgumentAppearsInArray() throws Exception {
        CommandLine line = new CommandLine();
        line.addArg("left");
        assertEquals(1, line.getArgs().length);
        assertEquals("left", line.getArgs()[0]);
    }

    public void testAddedArgumentsPreserveOrder() throws Exception {
        CommandLine line = new CommandLine();
        line.addArg("first");
        line.addArg("last");
        String[] args = line.getArgs();
        assertEquals(2, args.length);
        assertEquals("first", args[0]);
        assertEquals("last", args[1]);
    }

    public void testArgumentListIsLive() throws Exception {
        CommandLine line = new CommandLine();
        List args = line.getArgList();
        args.add("via-list");
        assertEquals(1, line.getArgs().length);
        assertEquals("via-list", line.getArgs()[0]);
    }

    public void testAddArgumentAfterGettingArrayIsVisible() throws Exception {
        CommandLine line = new CommandLine();
        String[] before = line.getArgs();
        line.addArg("later");
        assertEquals(0, before.length);
        assertEquals("later", line.getArgs()[0]);
    }

    public void testOptionValueIsNullWhenOptionNotAdded() throws Exception {
        CommandLine line = new CommandLine();
        assertNull(line.getOptionValue("absent"));
    }

    public void testGetOptionsIsEmptyInitially() throws Exception {
        CommandLine line = new CommandLine();
        assertEquals(0, line.getOptions().length);
    }
}
