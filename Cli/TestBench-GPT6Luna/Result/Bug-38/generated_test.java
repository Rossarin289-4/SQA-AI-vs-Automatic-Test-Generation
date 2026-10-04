package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class DefaultParserTest extends TestCase {
    public void testEmptyArguments() throws Exception {
        CommandLine line = new DefaultParser().parse(new Options(), new String[0]);
        assertEquals(0, line.getOptions().length);
        assertEquals(0, line.getArgs().length);
    }

    public void testNullArguments() throws Exception {
        CommandLine line = new DefaultParser().parse(new Options(), null);
        assertEquals(0, line.getOptions().length);
        assertEquals(0, line.getArgs().length);
    }

    public void testShortFlag() throws Exception {
        Options options = new Options().addOption("v", "verbose");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-v"});
        assertTrue(line.hasOption("v"));
        assertEquals(0, line.getArgs().length);
    }

    public void testLongFlag() throws Exception {
        Options options = new Options().addOption("v", "verbose", false, "flag");
        CommandLine line = new DefaultParser().parse(options, new String[] {"--verbose"});
        assertTrue(line.hasOption("verbose"));
    }

    public void testShortOptionValueAsNextToken() throws Exception {
        Options options = new Options().addOption("o", true, "value");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-o", "file"});
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testLongOptionValueWithEquals() throws Exception {
        Options options = new Options().addOption("o", "output", true, "value");
        CommandLine line = new DefaultParser().parse(options, new String[] {"--output=file"});
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testLongOptionValueAsNextToken() throws Exception {
        Options options = new Options().addOption("o", "output", true, "value");
        CommandLine line = new DefaultParser().parse(options, new String[] {"--output", "file"});
        assertEquals("file", line.getOptionValue("output"));
    }

    public void testShortOptionValueWithEquals() throws Exception {
        Options options = new Options().addOption("o", true, "value");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-o=file"});
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testNegativeNumberIsOptionArgument() throws Exception {
        Options options = new Options().addOption("n", true, "number");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-n", "-1"});
        assertEquals("-1", line.getOptionValue("n"));
    }

    public void testPlainArgumentIsRetained() throws Exception {
        CommandLine line = new DefaultParser().parse(new Options(), new String[] {"input"});
        assertEquals(1, line.getArgs().length);
        assertEquals("input", line.getArgs()[0]);
    }

    public void testDoubleDashStopsOptionParsing() throws Exception {
        Options options = new Options().addOption("v", "verbose");
        CommandLine line = new DefaultParser().parse(options, new String[] {"--", "-v"});
        assertFalse(line.hasOption("v"));
        assertEquals("-v", line.getArgs()[0]);
    }

    public void testStopAtNonOptionRetainsRemainingTokens() throws Exception {
        Options options = new Options().addOption("v", "verbose");
        CommandLine line = new DefaultParser().parse(options, new String[] {"input", "-v"}, true);
        assertFalse(line.hasOption("v"));
        assertEquals(2, line.getArgs().length);
        assertEquals("-v", line.getArgs()[1]);
    }

    public void testStopAtNonOptionStillParsesPriorOption() throws Exception {
        Options options = new Options().addOption("v", "verbose");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-v", "input"}, true);
        assertTrue(line.hasOption("v"));
        assertEquals("input", line.getArgs()[0]);
    }

    public void testUnrecognizedDashOptionThrows() throws Exception {
        try {
            new DefaultParser().parse(new Options(), new String[] {"-x"});
            fail("expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException expected) {
            assertEquals("-x", expected.getOption());
        }
    }

    public void testMissingRequiredArgumentThrows() throws Exception {
        Options options = new Options().addOption("o", true, "value");
        try {
            new DefaultParser().parse(options, new String[] {"-o"});
            fail("expected MissingArgumentException");
        } catch (MissingArgumentException expected) {
            assertEquals("o", expected.getOption().getOpt());
        }
    }

    public void testRequiredOptionPresent() throws Exception {
        Options options = new Options().addRequiredOption("r", "required", false, "required");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-r"});
        assertTrue(line.hasOption("r"));
    }

    public void testRequiredOptionMissingThrows() throws Exception {
        Options options = new Options().addRequiredOption("r", "required", false, "required");
        try {
            new DefaultParser().parse(options, new String[0]);
            fail("expected MissingOptionException");
        } catch (MissingOptionException expected) {
            assertEquals(1, expected.getMissingOptions().size());
        }
    }

    public void testPropertyEnablesFlag() throws Exception {
        Options options = new Options().addOption("v", "verbose");
        Properties properties = new Properties();
        properties.setProperty("v", "yes");
        CommandLine line = new DefaultParser().parse(options, new String[0], properties);
        assertTrue(line.hasOption("v"));
    }

    public void testFalsePropertyDoesNotEnableFlag() throws Exception {
        Options options = new Options().addOption("v", "verbose");
        Properties properties = new Properties();
        properties.setProperty("v", "no");
        CommandLine line = new DefaultParser().parse(options, new String[0], properties);
        assertFalse(line.hasOption("v"));
    }

    public void testPropertySuppliesOptionValue() throws Exception {
        Options options = new Options().addOption("o", "output", true, "value");
        Properties properties = new Properties();
        properties.setProperty("output", "file");
        CommandLine line = new DefaultParser().parse(options, new String[0], properties);
        assertEquals("file", line.getOptionValue("output"));
    }

    public void testUnknownPropertyOptionThrows() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("unknown", "yes");
        try {
            new DefaultParser().parse(new Options(), new String[0], properties);
            fail("expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException expected) {
            assertEquals("unknown", expected.getOption());
        }
    }

    public void testNegativeZeroIsOptionArgument() throws Exception {
        Options options = new Options().addOption("n", true, "number");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-n", "-0"});
        assertEquals("-0", line.getOptionValue("n"));
    }
}
