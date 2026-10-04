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
    public void testParseEmptyArguments() throws Exception {
        CommandLine line = new BasicParser().parse(new Options(), new String[0]);
        assertEquals(0, line.getArgs().length);
        assertEquals(0, line.getOptions().length);
    }

    public void testParseNullArguments() throws Exception {
        CommandLine line = new BasicParser().parse(new Options(), null);
        assertEquals(0, line.getArgs().length);
    }

    public void testParseFlag() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        CommandLine line = new BasicParser().parse(options, new String[] {"-v"});
        assertTrue(line.hasOption("v"));
        assertEquals(1, line.getOptions().length);
    }

    public void testParseArgumentOption() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");
        CommandLine line = new BasicParser().parse(options, new String[] {"-o", "file"});
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testParseOptionAndPositionalArgument() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        CommandLine line = new BasicParser().parse(options, new String[] {"-v", "file"});
        assertTrue(line.hasOption("v"));
        assertEquals(Arrays.asList(new String[] {"file"}), line.getArgList());
    }

    public void testParseStopAtFirstNonOption() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        CommandLine line = new BasicParser().parse(options, new String[] {"file", "-v"}, true);
        assertFalse(line.hasOption("v"));
        assertEquals(Arrays.asList(new String[] {"file", "-v"}), line.getArgList());
    }

    public void testParseStopAtUnrecognizedOption() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, new String[] {"-x", "tail"}, true);
        assertEquals(Arrays.asList(new String[] {"-x", "tail"}), line.getArgList());
    }

    public void testParseDoubleDashConsumesRestAndOmitsLaterMarkers() throws Exception {
        CommandLine line = new BasicParser().parse(new Options(),
            new String[] {"--", "one", "--", "two"}, true);
        assertEquals(Arrays.asList(new String[] {"one", "two"}), line.getArgList());
    }

    public void testParseSingleDashWithStopAtNonOption() throws Exception {
        CommandLine line = new BasicParser().parse(new Options(), new String[] {"-"}, true);
        assertEquals(0, line.getArgList().size());
    }

    public void testParseSingleDashWithoutStopAtNonOption() throws Exception {
        CommandLine line = new BasicParser().parse(new Options(), new String[] {"-"});
        assertEquals(Arrays.asList(new String[] {"-"}), line.getArgList());
    }

    public void testParseRequiredOptionPresent() throws Exception {
        Option required = new Option("r", "required");
        required.setRequired(true);
        Options options = new Options();
        options.addOption(required);
        CommandLine line = new BasicParser().parse(options, new String[] {"-r"});
        assertTrue(line.hasOption("r"));
    }

    public void testParseMissingRequiredOption() throws Exception {
        Option required = new Option("r", "required");
        required.setRequired(true);
        Options options = new Options();
        options.addOption(required);
        try {
            new BasicParser().parse(options, new String[0]);
            fail("expected MissingOptionException");
        } catch (MissingOptionException expected) {
            assertTrue(expected instanceof MissingOptionException);
        }
    }

    public void testParsePropertyTrueAddsFlag() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        Properties properties = new Properties();
        properties.setProperty("v", "true");
        CommandLine line = new BasicParser().parse(options, new String[0], properties);
        assertTrue(line.hasOption("v"));
    }

    public void testParsePropertyFalseDoesNotAddFlag() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        Properties properties = new Properties();
        properties.setProperty("v", "false");
        CommandLine line = new BasicParser().parse(options, new String[0], properties);
        assertFalse(line.hasOption("v"));
    }

    public void testParsePropertySuppliesOptionValue() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");
        Properties properties = new Properties();
        properties.setProperty("o", "file");
        CommandLine line = new BasicParser().parse(options, new String[0], properties);
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testParseArgumentsClearValuesFromPreviousParse() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[] {"-o", "first"});
        CommandLine line = parser.parse(options, new String[] {"-o", "next"});
        assertEquals("next", line.getOptionValue("o"));
    }

    public void testProcessArgsConsumesValue() throws Exception {
        Options options = new Options();
        Option opt = new Option("o", true, "output");
        options.addOption(opt);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iter = Arrays.asList(new String[] {"value"}).listIterator();
        parser.processArgs(opt, iter);
        assertEquals("value", opt.getValue());
        assertFalse(iter.hasNext());
    }

    public void testProcessArgsStopsBeforeFollowingOption() throws Exception {
        Options options = new Options();
        Option valueOption = new Option("o", true, "output");
        options.addOption(valueOption);
        options.addOption("v", false, "verbose");
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iter = Arrays.asList(new String[] {"value", "-v"}).listIterator();
        parser.processArgs(valueOption, iter);
        assertEquals("value", valueOption.getValue());
        assertEquals("-v", iter.next());
    }

    public void testProcessArgsStripsSurroundingQuotes() throws Exception {
        Options options = new Options();
        Option opt = new Option("o", true, "output");
        options.addOption(opt);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iter = Arrays.asList(new String[] {"\"file\""}).listIterator();
        parser.processArgs(opt, iter);
        assertEquals("file", opt.getValue());
    }

    public void testProcessArgsMissingRequiredValueThrows() throws Exception {
        Options options = new Options();
        Option opt = new Option("o", true, "output");
        options.addOption(opt);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iter = new ArrayList().listIterator();
        try {
            parser.processArgs(opt, iter);
            fail("expected MissingArgumentException");
        } catch (MissingArgumentException expected) {
            assertTrue(expected instanceof MissingArgumentException);
        }
    }

    public void testProcessArgsOptionalArgumentMayBeMissing() throws Exception {
        Options options = new Options();
        Option opt = new Option("o", true, "output");
        opt.setOptionalArg(true);
        options.addOption(opt);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iter = new ArrayList().listIterator();
        parser.processArgs(opt, iter);
        assertNull(opt.getValue());
    }
}
