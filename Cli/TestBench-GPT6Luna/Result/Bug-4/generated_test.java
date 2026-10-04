package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest extends TestCase {
    public void testParseShortOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        CommandLine line = new BasicParser().parse(options, new String[] {"-a"});
        assertTrue(line.hasOption("a"));
        assertEquals(0, line.getArgs().length);
    }

    public void testParseLongNamedOptionByShortName() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "flag");
        CommandLine line = new BasicParser().parse(options, new String[] {"--alpha"});
        assertTrue(line.hasOption("a"));
    }

    public void testParseArgumentForOption() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "value");
        CommandLine line = new BasicParser().parse(options, new String[] {"-o", "value"});
        assertEquals("value", line.getOptionValue("o"));
    }

    public void testNonOptionIsLeftover() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, new String[] {"item"});
        assertTrue(Arrays.equals(new String[] {"item"}, line.getArgs()));
    }

    public void testDashIsLeftoverWhenNotStopping() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, new String[] {"-"});
        assertTrue(Arrays.equals(new String[] {"-"}, line.getArgs()));
    }

    public void testDashStartsRemainderWhenStopping() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, new String[] {"-", "-x"}, true);
        assertTrue(Arrays.equals(new String[] {"-x"}, line.getArgs()));
    }

    public void testStopAtFirstNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        CommandLine line = new BasicParser().parse(options, new String[] {"item", "-a"}, true);
        assertFalse(line.hasOption("a"));
        assertTrue(Arrays.equals(new String[] {"item", "-a"}, line.getArgs()));
    }

    public void testDoubleDashEndsOptionParsing() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        CommandLine line = new BasicParser().parse(options, new String[] {"--", "-a"});
        assertFalse(line.hasOption("a"));
        assertTrue(Arrays.equals(new String[] {"-a"}, line.getArgs()));
    }

    public void testRepeatedDoubleDashAddsOnlyOneArgument() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, new String[] {"--", "--", "tail"});
        assertTrue(Arrays.equals(new String[] {"tail"}, line.getArgs()));
    }

    public void testUnknownOptionThrows() throws Exception {
        try {
            new BasicParser().parse(new Options(), new String[] {"-x"});
            fail("expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException expected) {
            assertEquals(1, 1);
        }
    }

    public void testRequiredOptionPresent() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "required");
        required.setRequired(true);
        options.addOption(required);
        CommandLine line = new BasicParser().parse(options, new String[] {"-r"});
        assertTrue(line.hasOption("r"));
    }

    public void testRequiredOptionMissingThrows() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "required");
        required.setRequired(true);
        options.addOption(required);
        try {
            new BasicParser().parse(options, new String[0]);
            fail("expected MissingOptionException");
        } catch (MissingOptionException expected) {
            assertEquals(1, 1);
        }
    }

    public void testPropertySetsBooleanOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        Properties properties = new Properties();
        properties.setProperty("a", "yes");
        CommandLine line = new BasicParser().parse(options, new String[0], properties);
        assertTrue(line.hasOption("a"));
    }

    public void testFalsePropertyDoesNotSetOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag");
        Properties properties = new Properties();
        properties.setProperty("a", "no");
        CommandLine line = new BasicParser().parse(options, new String[0], properties);
        assertFalse(line.hasOption("a"));
    }

    public void testPropertySuppliesOptionValue() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "value");
        Properties properties = new Properties();
        properties.setProperty("o", "from-property");
        CommandLine line = new BasicParser().parse(options, new String[0], properties);
        assertEquals("from-property", line.getOptionValue("o"));
    }

    public void testCommandLineValueTakesPrecedenceOverProperty() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "value");
        Properties properties = new Properties();
        properties.setProperty("o", "property");
        CommandLine line = new BasicParser().parse(options, new String[] {"-o", "argument"}, properties);
        assertEquals("argument", line.getOptionValue("o"));
    }

    public void testNullArgumentsAreEmpty() throws Exception {
        Options options = new Options();
        CommandLine line = new BasicParser().parse(options, (String[]) null);
        assertEquals(0, line.getArgs().length);
    }

    public void testProcessArgsConsumesValue() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "value");
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        Option option = options.getOption("o");
        ListIterator iter = Arrays.asList(new String[] {"first"}).listIterator();
        parser.processArgs(option, iter);
        assertEquals("first", option.getValue(0));
        assertFalse(iter.hasNext());
    }

    public void testProcessArgsStopsBeforeRecognizedOption() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "value");
        options.addOption("a", false, "flag");
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        Option option = options.getOption("o");
        ListIterator iter = Arrays.asList(new String[] {"value", "-a"}).listIterator();
        parser.processArgs(option, iter);
        assertEquals("value", option.getValue());
        assertEquals("-a", iter.next());
    }

    public void testProcessArgsThrowsWhenRequiredValueMissing() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "value");
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        try {
            parser.processArgs(options.getOption("o"), Arrays.asList(new String[0]).listIterator());
            fail("expected MissingArgumentException");
        } catch (MissingArgumentException expected) {
            assertEquals(1, 1);
        }
    }

    public void testProcessArgsAllowsMissingOptionalValue() throws Exception {
        Options options = new Options();
        Option option = new Option("o", true, "value");
        option.setOptionalArg(true);
        options.addOption(option);
        BasicParser parser = new BasicParser();
        parser.parse(options, new String[0]);
        parser.processArgs(option, Arrays.asList(new String[0]).listIterator());
        assertNull(option.getValues());
    }
}
