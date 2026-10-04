package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class DefaultParserTest extends TestCase {
    public void testNoArguments() throws Exception {
        Options options = new Options();
        CommandLine line = new DefaultParser().parse(options, new String[0]);
        assertEquals(0, line.getOptions().length);
        assertEquals(0, line.getArgs().length);
    }

    public void testNullArguments() throws Exception {
        Options options = new Options();
        CommandLine line = new DefaultParser().parse(options, null);
        assertEquals(0, line.getOptions().length);
        assertEquals(0, line.getArgs().length);
    }

    public void testSimpleFlag() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-v"});
        assertTrue(line.hasOption("v"));
        assertEquals(1, line.getOptions().length);
    }

    public void testLongFlag() throws Exception {
        Options options = new Options();
        options.addOption("v", "verbose", false, "verbose");
        CommandLine line = new DefaultParser().parse(options, new String[] {"--verbose"});
        assertTrue(line.hasOption("verbose"));
    }

    public void testRequiredArgumentAsNextToken() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-o", "file"});
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testShortOptionEqualsArgument() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-o=file"});
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testLongOptionEqualsArgument() throws Exception {
        Options options = new Options();
        options.addOption("o", "output", true, "output");
        CommandLine line = new DefaultParser().parse(options, new String[] {"--output=file"});
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testLongOptionArgumentMayBeEmpty() throws Exception {
        Options options = new Options();
        options.addOption("o", "output", true, "output");
        CommandLine line = new DefaultParser().parse(options, new String[] {"--output="});
        assertEquals("", line.getOptionValue("o"));
    }

    public void testNegativeNumberIsAnArgument() throws Exception {
        Options options = new Options();
        options.addOption("n", true, "number");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-n", "-2"});
        assertEquals("-2", line.getOptionValue("n"));
    }

    public void testQuotedArgumentIsUnquoted() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-o", "\"file\""});
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testNonOptionIsPreserved() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        CommandLine line = new DefaultParser().parse(options, new String[] {"input", "-v"});
        assertEquals(1, line.getArgs().length);
        assertEquals("input", line.getArgs()[0]);
        assertTrue(line.hasOption("v"));
    }

    public void testDoubleDashLeavesFollowingTokensAsArguments() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        CommandLine line = new DefaultParser().parse(options, new String[] {"--", "-v", "input"});
        assertFalse(line.hasOption("v"));
        assertEquals(2, line.getArgs().length);
        assertEquals("-v", line.getArgs()[0]);
        assertEquals("input", line.getArgs()[1]);
    }

    public void testStopAtNonOptionKeepsRemainingTokens() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        CommandLine line = new DefaultParser().parse(options, new String[] {"input", "-v"}, true);
        assertFalse(line.hasOption("v"));
        assertEquals(2, line.getArgs().length);
        assertEquals("input", line.getArgs()[0]);
        assertEquals("-v", line.getArgs()[1]);
    }

    public void testStopAtNonOptionStillProcessesEarlierOption() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-v", "input"}, true);
        assertTrue(line.hasOption("v"));
        assertEquals(1, line.getArgs().length);
        assertEquals("input", line.getArgs()[0]);
    }

    public void testCombinedFlags() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        options.addOption("b", false, "b");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-ab"});
        assertTrue(line.hasOption("a"));
        assertTrue(line.hasOption("b"));
        assertEquals(2, line.getOptions().length);
    }

    public void testCombinedFlagAndAttachedArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        options.addOption("b", true, "b");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-abvalue"});
        assertTrue(line.hasOption("a"));
        assertEquals("value", line.getOptionValue("b"));
    }

    public void testLongOptionAbbreviation() throws Exception {
        Options options = new Options();
        options.addOption("o", "output", true, "output");
        CommandLine line = new DefaultParser().parse(options, new String[] {"--out=file"});
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testUnknownOptionThrows() throws Exception {
        Options options = new Options();
        try {
            new DefaultParser().parse(options, new String[] {"-z"});
            fail("expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException expected) {
            assertEquals("-z", expected.getOption());
        }
    }

    public void testMissingRequiredArgumentThrows() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");
        try {
            new DefaultParser().parse(options, new String[] {"-o"});
            fail("expected MissingArgumentException");
        } catch (MissingArgumentException expected) {
            assertEquals("o", expected.getOption().getOpt());
        }
    }

    public void testRequiredOptionPresent() throws Exception {
        Options options = new Options();
        options.addRequiredOption("o", "output", true, "output");
        CommandLine line = new DefaultParser().parse(options, new String[] {"-o", "file"});
        assertEquals("file", line.getOptionValue("o"));
    }

    public void testRequiredOptionMissingThrows() throws Exception {
        Options options = new Options();
        options.addRequiredOption("o", "output", true, "output");
        try {
            new DefaultParser().parse(options, new String[0]);
            fail("expected MissingOptionException");
        } catch (MissingOptionException expected) {
            assertEquals(1, expected.getMissingOptions().size());
        }
    }

    public void testPropertyEnablesFlag() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        Properties properties = new Properties();
        properties.setProperty("v", "true");
        CommandLine line = new DefaultParser().parse(options, new String[0], properties);
        assertTrue(line.hasOption("v"));
    }

    public void testFalsePropertyDoesNotEnableFlag() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        Properties properties = new Properties();
        properties.setProperty("v", "false");
        CommandLine line = new DefaultParser().parse(options, new String[0], properties);
        assertFalse(line.hasOption("v"));
    }

    public void testArgumentPropertyProvidesValue() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");
        Properties properties = new Properties();
        properties.setProperty("o", "file");
        CommandLine line = new DefaultParser().parse(options, new String[0], properties);
        assertEquals("file", line.getOptionValue("o"));
    }
}
