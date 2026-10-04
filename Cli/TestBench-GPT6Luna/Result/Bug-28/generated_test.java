package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest extends TestCase {
    public void testParseRecognizedOptionAndArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "value");
        CommandLine line = new BasicParser().parse(options, new String[] {"-a", "v"});
        assertTrue(line.hasOption("a"));
        assertEquals("v", line.getOptionValue("a"));
        assertEquals(0, line.getArgs().length);
    }

    public void testParseNullArguments() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, null);
        assertEquals(0, line.getArgs().length);
        assertEquals(0, line.getOptions().length);
    }

    public void testParsePositionalArgument() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, new String[] {"word"});
        assertEquals(1, line.getArgs().length);
        assertEquals("word", line.getArgs()[0]);
    }

    public void testParseUnknownOptionThrows() throws Exception {
        try {
            new BasicParser().parse(new Options(), new String[] {"-x"});
            fail("expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException expected) {
            assertEquals("-x", expected.getOption());
        }
    }

    public void testParseRequiredOptionSatisfied() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "required");
        required.setRequired(true);
        options.addOption(required);
        CommandLine line = new BasicParser().parse(options, new String[] {"-r"});
        assertTrue(line.hasOption("r"));
    }

    public void testParseMissingRequiredOptionThrows() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "required");
        required.setRequired(true);
        options.addOption(required);
        try {
            new BasicParser().parse(options, new String[0]);
            fail("expected MissingOptionException");
        } catch (MissingOptionException expected) {
            assertEquals(1, expected.getMissingOptions().size());
        }
    }

    public void testParseStopAtFirstArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        CommandLine line = new BasicParser().parse(options, new String[] {"word", "-a"}, true);
        assertFalse(line.hasOption("a"));
        assertEquals(Arrays.asList(new String[] {"word", "-a"}), line.getArgList());
    }

    public void testParseSingleDashWithStopAtNonOption() throws Exception {
        CommandLine line = new BasicParser().parse(new Options(), new String[] {"-", "-x"}, true);
        assertEquals(Arrays.asList(new String[] {"-x"}), line.getArgList());
    }

    public void testParseDoubleDashDoesNotBecomeArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        CommandLine line = new BasicParser().parse(options, new String[] {"--", "-a"});
        assertFalse(line.hasOption("a"));
        assertEquals(Arrays.asList(new String[] {"-a"}), line.getArgList());
    }

    public void testParsePropertyEnablesFlag() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        Properties properties = new Properties();
        properties.setProperty("a", "true");
        CommandLine line = new BasicParser().parse(options, new String[0], properties);
        assertTrue(line.hasOption("a"));
    }

    public void testParsePropertyFalseDoesNotEnableFlag() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        Properties properties = new Properties();
        properties.setProperty("a", "false");
        CommandLine line = new BasicParser().parse(options, new String[0], properties);
        assertFalse(line.hasOption("a"));
    }

    public void testParsePropertySuppliesArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "value");
        Properties properties = new Properties();
        properties.setProperty("a", "from-property");
        CommandLine line = new BasicParser().parse(options, new String[0], properties);
        assertEquals("from-property", line.getOptionValue("a"));
    }

    public void testProcessArgsConsumesValues() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", true, "value");
        opt.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(opt);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iterator = Arrays.asList(new String[] {"one", "two"}).listIterator();
        parser.processArgs(opt, iterator);
        assertEquals(Arrays.asList(new String[] {"one", "two"}), opt.getValuesList());
        assertFalse(iterator.hasNext());
    }

    public void testProcessArgsStopsBeforeAnotherOption() throws Exception {
        Options options = new Options();
        Option first = new Option("a", true, "value");
        options.addOption(first);
        options.addOption("b", false, "flag");
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iterator = Arrays.asList(new String[] {"value", "-b"}).listIterator();
        parser.processArgs(first, iterator);
        assertEquals("value", first.getValue());
        assertEquals("-b", iterator.next());
    }

    public void testProcessArgsAllowsMissingOptionalArgument() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", true, "value");
        opt.setOptionalArg(true);
        options.addOption(opt);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iterator = new ArrayList().listIterator();
        parser.processArgs(opt, iterator);
        assertNull(opt.getValues());
        assertFalse(iterator.hasNext());
    }

    public void testProcessArgsMissingRequiredValueThrows() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", true, "value");
        options.addOption(opt);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        try {
            parser.processArgs(opt, new ArrayList().listIterator());
            fail("expected MissingArgumentException");
        } catch (MissingArgumentException expected) {
            assertNotNull(expected);
        }
    }

    public void testParseRepeatedOptionClearsPriorValues() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "value");
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[] {"-a", "old"});
        CommandLine line = parser.parse(options, new String[] {"-a", "new"});
        assertEquals("new", line.getOptionValue("a"));
        assertEquals(1, line.getOptionValues("a").length);
    }

    public void testParseOptionGroupSelectsChosenOption() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option first = new Option("a", "first");
        Option second = new Option("b", "second");
        group.addOption(first);
        group.addOption(second);
        options.addOptionGroup(group);
        CommandLine line = new BasicParser().parse(options, new String[] {"-b"});
        assertTrue(line.hasOption("b"));
        assertEquals("b", group.getSelected());
    }
}
