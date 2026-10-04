package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Arrays;
import java.util.ListIterator;

public class DefaultParserTest extends TestCase {
    public void testParsesFlagOption() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");

        CommandLine line = new DefaultParser().parse(options, new String[] {"-v"});

        assertTrue(line.hasOption("v"));
        assertEquals(0, line.getArgs().length);
    }

    public void testParsesOptionAndFollowingArgument() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");

        CommandLine line = new DefaultParser().parse(options, new String[] {"-o", "file"});

        assertEquals("file", line.getOptionValue("o"));
    }

    public void testParsesNegativeNumberAsOptionArgument() throws Exception {
        Options options = new Options();
        options.addOption("n", true, "number");

        CommandLine line = new DefaultParser().parse(options, new String[] {"-n", "-1"});

        assertEquals("-1", line.getOptionValue("n"));
    }

    public void testParsesShortOptionArgumentWithEquals() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");

        CommandLine line = new DefaultParser().parse(options, new String[] {"-o=value"});

        assertEquals("value", line.getOptionValue("o"));
    }

    public void testParsesLongOptionArgumentWithEquals() throws Exception {
        Options options = new Options();
        options.addOption("o", "output", true, "output");

        CommandLine line = new DefaultParser().parse(options, new String[] {"--output=value"});

        assertEquals("value", line.getOptionValue("o"));
    }

    public void testUsesLongOptionPrefixWithAttachedValue() throws Exception {
        Options options = new Options();
        options.addOption("m", "memory", true, "memory");

        CommandLine line = new DefaultParser().parse(options, new String[] {"-memory512"});

        assertEquals("512", line.getOptionValue("m"));
    }

    public void testSplitsConcatenatedFlags() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        options.addOption("b", false, "b");

        CommandLine line = new DefaultParser().parse(options, new String[] {"-ab"});

        assertTrue(line.hasOption("a"));
        assertTrue(line.hasOption("b"));
    }

    public void testConcatenatedArgumentOptionConsumesTrailingText() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        options.addOption("o", true, "output");

        CommandLine line = new DefaultParser().parse(options, new String[] {"-aoFILE"});

        assertTrue(line.hasOption("a"));
        assertEquals("FILE", line.getOptionValue("o"));
    }

    public void testParsesTokenAfterDoubleDashAsArgument() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");

        CommandLine line = new DefaultParser().parse(options, new String[] {"--", "-v"});

        assertFalse(line.hasOption("v"));
        assertEquals("-v", line.getArgs()[0]);
    }

    public void testUnknownOptionThrowsWhenNotStopping() throws Exception {
        Options options = new Options();

        try {
            new DefaultParser().parse(options, new String[] {"-x"});
            fail("expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException expected) {
            assertEquals("-x", expected.getOption());
        }
    }

    public void testUnknownTokenStopsParsingAndKeepsRemainder() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        options.addOption("q", false, "quiet");

        CommandLine line = new DefaultParser().parse(options, new String[] {"-v", "word", "-q"}, true);

        assertTrue(line.hasOption("v"));
        assertFalse(line.hasOption("q"));
        assertEquals(Arrays.asList(new String[] {"word", "-q"}), line.getArgList());
    }

    public void testRequiredOptionMustBePresent() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "required");
        required.setRequired(true);
        options.addOption(required);

        try {
            new DefaultParser().parse(options, new String[0]);
            fail("expected MissingOptionException");
        } catch (MissingOptionException expected) {
            assertEquals(1, expected.getMissingOptions().size());
        }
    }

    public void testRequiredOptionPresentParsesSuccessfully() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "required");
        required.setRequired(true);
        options.addOption(required);

        CommandLine line = new DefaultParser().parse(options, new String[] {"-r"});

        assertTrue(line.hasOption("r"));
    }

    public void testMissingRequiredArgumentThrows() throws Exception {
        Options options = new Options();
        options.addOption("o", true, "output");

        try {
            new DefaultParser().parse(options, new String[] {"-o"});
            fail("expected MissingArgumentException");
        } catch (MissingArgumentException expected) {
            assertNotNull(expected);
        }
    }

    public void testPropertyAddsFlagWhenTrue() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        Properties properties = new Properties();
        properties.setProperty("v", "true");

        CommandLine line = new DefaultParser().parse(options, new String[0], properties);

        assertTrue(line.hasOption("v"));
    }

    public void testPropertyDoesNotAddFlagWhenFalse() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        Properties properties = new Properties();
        properties.setProperty("v", "false");

        CommandLine line = new DefaultParser().parse(options, new String[0], properties);

        assertFalse(line.hasOption("v"));
    }
}
