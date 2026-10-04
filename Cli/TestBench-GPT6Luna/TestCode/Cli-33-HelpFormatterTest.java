package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class HelpFormatterTest extends TestCase {

    public void testPaddingSettersAcceptBoundaryIntegers() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(0);
        formatter.setLeftPadding(-1);
        formatter.setDescPadding(Integer.MAX_VALUE);
        assertEquals(0, formatter.getWidth());
        assertEquals(-1, formatter.getLeftPadding());
        assertEquals(Integer.MAX_VALUE, formatter.getDescPadding());
    }

    public void testStringPropertySettersRoundTrip() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("run ");
        formatter.setNewLine("|");
        formatter.setOptPrefix("+");
        formatter.setLongOptPrefix("++");
        formatter.setLongOptSeparator("=");
        formatter.setArgName("value");
        assertEquals("run ", formatter.getSyntaxPrefix());
        assertEquals("|", formatter.getNewLine());
        assertEquals("+", formatter.getOptPrefix());
        assertEquals("++", formatter.getLongOptPrefix());
        assertEquals("=", formatter.getLongOptSeparator());
        assertEquals("value", formatter.getArgName());
    }

    public void testDefaultProperties() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
    }

    public void testComparatorSortsOptionKeysIgnoringCase() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Option a = new Option("a", "a");
        Option B = new Option("B", "b");
        assertTrue(formatter.getOptionComparator().compare(a, B) < 0);
        assertTrue(formatter.getOptionComparator().compare(B, a) > 0);
        assertEquals(0, formatter.getOptionComparator().compare(a, new Option("A", "other")));
    }

    public void testSetOptionComparatorAndRestoreDefault() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator reverse = Collections.reverseOrder();
        formatter.setOptionComparator(reverse);
        assertSame(reverse, formatter.getOptionComparator());
        formatter.setOptionComparator(null);
        assertTrue(formatter.getOptionComparator().compare(
                new Option("a", "a"), new Option("b", "b")) < 0);
    }

    public void testPrintUsageWithDefaultSyntaxPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printUsage(writer, 74, "tool run");
        assertEquals("usage: tool run\n", output.toString());
    }

    public void testPrintUsageWrapsAtWidthAndIndentsContinuation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printUsage(writer, 12, "tool alpha beta");
        assertEquals("usage: tool\n     alpha\n     beta\n", output.toString());
    }

    public void testPrintUsageSortsAndRendersOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(new Option("b", "beta"));
        options.addOption(new Option("a", "alpha"));
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printUsage(writer, 74, "tool", options);
        assertEquals("usage: tool [-a] [-b]\n", output.toString());
    }

    public void testPrintUsageFormatsLongOptionArgument() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(new Option(null, "output", true, "description"));
        formatter.setLongOptSeparator("=");
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printUsage(writer, 74, "tool", options);
        assertEquals("usage: tool [--output=<arg>]\n", output.toString());
    }

    public void testPrintOptionsRendersPrefixesAndDescriptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "first"));
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printOptions(writer, 74, options, 1, 3);
        assertEquals(" -a,--alpha   first\n", output.toString());
    }

    public void testPrintOptionsUsesConfiguredArgumentNameAndSeparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("o", "output", true, "file");
        options.addOption(option);
        option.setArgName("path");
        formatter.setLongOptSeparator("=");
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printOptions(writer, 74, options, 0, 2);
        assertEquals("-o,--output <path>  file\n", output.toString());
    }

    public void testPrintOptionsWrapsLongDescription() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(new Option("a", "a description longer", false, "description text"));
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printOptions(writer, 12, options, 0, 1);
        assertEquals("-a descript\n   ion text\n", output.toString());
    }

    public void testPrintWrappedPreservesExplicitLineBreaks() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printWrapped(writer, 24, "one\ntwo");
        assertEquals("one\ntwo\n", output.toString());
    }

    public void testPrintWrappedAtExactWidthDoesNotAddContinuation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printWrapped(writer, 4, "four");
        assertEquals("four\n", output.toString());
    }

    public void testPrintWrappedAtWidthOneHandlesUnbreakableText() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printWrapped(writer, 1, "abc");
        assertEquals("a\nb\nc\n", output.toString());
    }

    public void testPrintHelpRejectsNullSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        try {
            formatter.printHelp(new PrintWriter(new java.io.StringWriter()), 74,
                    null, null, new Options(), 1, 3, null, false);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    public void testPrintHelpRejectsEmptySyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        try {
            formatter.printHelp(new PrintWriter(new java.io.StringWriter()), 74,
                    "", null, new Options(), 1, 3, null, false);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    public void testPrintHelpIncludesHeaderAndFooter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printHelp(writer, 74, "tool", "header", options, 1, 3, "footer");
        assertEquals("usage: tool\n\nheader\n\nfooter\n", output.toString());
    }
}
