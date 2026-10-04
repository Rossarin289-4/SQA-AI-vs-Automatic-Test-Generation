package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest extends TestCase {
    public void testParseRecognizedFlag() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        CommandLine line = new BasicParser().parse(options, new String[] {"-a"});
        assertTrue(line.hasOption("a"));
        assertEquals(0, line.getArgs().length);
    }

    public void testParseOptionValue() throws Exception {
        Options options = new Options();
        options.addOption("n", true, "value");
        CommandLine line = new BasicParser().parse(options, new String[] {"-n", "value"});
        assertEquals("value", line.getOptionValue("n"));
    }

    public void testParseNullArguments() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, null);
        assertEquals(0, line.getArgs().length);
    }

    public void testParseNonOptionArgument() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, new String[] {"word"});
        assertEquals(Arrays.asList(new String[] {"word"}), line.getArgList());
    }

    public void testParseDashAsArgument() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, new String[] {"-"});
        assertEquals(Arrays.asList(new String[] {"-"}), line.getArgList());
    }

    public void testParseDoubleDashConsumesRemainingTokens() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        CommandLine line = new BasicParser().parse(options, new String[] {"--", "-a", "word"});
        assertFalse(line.hasOption("a"));
        assertEquals(Arrays.asList(new String[] {"-a", "word"}), line.getArgList());
    }

    public void testParseStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        CommandLine line = new BasicParser().parse(options, new String[] {"word", "-a"}, true);
        assertFalse(line.hasOption("a"));
        assertEquals(Arrays.asList(new String[] {"word", "-a"}), line.getArgList());
    }

    public void testParseStopAtUnknownOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        CommandLine line = new BasicParser().parse(options, new String[] {"-z", "-a"}, true);
        assertFalse(line.hasOption("a"));
        assertEquals(Arrays.asList(new String[] {"-z", "-a"}), line.getArgList());
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
            assertTrue(true);
        }
    }

    public void testParseRequiredOptionPresent() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "required");
        required.setRequired(true);
        options.addOption(required);
        CommandLine line = new BasicParser().parse(options, new String[] {"-r"});
        assertTrue(line.hasOption("r"));
    }

    public void testProcessArgsConsumesValues() throws Exception {
        Options options = new Options();
        Option value = new Option("v", true, "value");
        value.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(value);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iterator = Arrays.asList(new String[] {"one", "two"}).listIterator();
        parser.processArgs(value, iterator);
        assertEquals(Arrays.asList(new String[] {"one", "two"}), value.getValuesList());
    }

    public void testProcessArgsStopsBeforeNextOption() throws Exception {
        Options options = new Options();
        Option value = new Option("v", true, "value");
        options.addOption(value);
        options.addOption("x", false, "flag");
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iterator = Arrays.asList(new String[] {"one", "-x"}).listIterator();
        parser.processArgs(value, iterator);
        assertEquals(Arrays.asList(new String[] {"one"}), value.getValuesList());
        assertEquals("-x", iterator.next());
    }

    public void testProcessArgsStripsQuotes() throws Exception {
        Options options = new Options();
        Option value = new Option("v", true, "value");
        options.addOption(value);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        ListIterator iterator = Arrays.asList(new String[] {"\"word\""}).listIterator();
        parser.processArgs(value, iterator);
        assertEquals("word", value.getValue());
    }

    public void testProcessArgsMissingRequiredValueThrows() throws Exception {
        Options options = new Options();
        Option value = new Option("v", true, "value");
        options.addOption(value);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        try {
            parser.processArgs(value, Arrays.asList(new String[0]).listIterator());
            fail("expected MissingArgumentException");
        } catch (MissingArgumentException expected) {
            assertNull(value.getValues());
        }
    }

    public void testProcessArgsAllowsOptionalValueToBeAbsent() throws Exception {
        Options options = new Options();
        Option value = new Option("v", true, "value");
        value.setOptionalArg(true);
        options.addOption(value);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        parser.processArgs(value, Arrays.asList(new String[0]).listIterator());
        assertNull(value.getValues());
    }
}
