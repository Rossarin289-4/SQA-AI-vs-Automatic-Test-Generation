package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class HelpFormatterTest extends TestCase {
    public void testDefaultWidthAndWidthEdges() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(74, formatter.getWidth());
        formatter.setWidth(0);
        assertEquals(0, formatter.getWidth());
        formatter.setWidth(-1);
        assertEquals(-1, formatter.getWidth());
    }

    public void testLeftPaddingMutation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
        formatter.setLeftPadding(24);
        assertEquals(24, formatter.getLeftPadding());
    }

    public void testDescriptionPaddingMutation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(-1);
        assertEquals(-1, formatter.getDescPadding());
        formatter.setDescPadding(24);
        assertEquals(24, formatter.getDescPadding());
    }

    public void testSyntaxPrefixMutation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("");
        assertEquals("", formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix("run: ");
        assertEquals("run: ", formatter.getSyntaxPrefix());
    }

    public void testNewLineMutation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("");
        assertEquals("", formatter.getNewLine());
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    public void testOptionPrefixMutation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("");
        assertEquals("", formatter.getOptPrefix());
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
    }

    public void testLongOptionPrefixMutation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("");
        assertEquals("", formatter.getLongOptPrefix());
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
    }

    public void testLongOptionSeparatorMutation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(" ", formatter.getLongOptSeparator());
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    public void testArgumentNameMutation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("");
        assertEquals("", formatter.getArgName());
        formatter.setArgName("file");
        assertEquals("file", formatter.getArgName());
    }

    public void testComparatorCaseInsensitiveOrdering() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Option lower = new Option("a", "lower");
        Option upper = new Option("B", "upper");
        assertTrue(formatter.getOptionComparator().compare(lower, upper) < 0);
        assertTrue(formatter.getOptionComparator().compare(upper, lower) > 0);
    }

    public void testComparatorCanBeReplacedAndReset() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator reverse = Collections.reverseOrder();
        formatter.setOptionComparator(reverse);
        assertSame(reverse, formatter.getOptionComparator());
        formatter.setOptionComparator(null);
        Option a = new Option("a", "a");
        Option b = new Option("b", "b");
        assertTrue(formatter.getOptionComparator().compare(a, b) < 0);
    }

    public void testPrintUsageWithNoOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append("\n");
            }
        };
        formatter.printUsage(writer, 74, "tool", new Options());
        assertEquals("usage: tool\n", output.toString());
    }

    public void testPrintUsageRequiredAndOptionalOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option required = new Option("a", "alpha", false, "alpha");
        required.setRequired(true);
        options.addOption(required);
        options.addOption(new Option("b", "beta", true, "beta"));
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append("\n");
            }
        };
        formatter.printUsage(writer, 74, "tool", options);
        assertEquals("usage: tool -a [-b <arg>]\n", output.toString());
    }

    public void testPrintOptionsFormatsArgumentAndDescription() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("x", "execute", true, "do it");
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append("\n");
            }
        };
        formatter.printOptions(writer, 74, options, 1, 3);
        assertEquals(" -x,--execute <arg>   do it\n", output.toString());
    }

    public void testPrintOptionsBlankArgumentName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("x", "execute", true, "desc");
        option.setArgName("");
        options.addOption(option);
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append("\n");
            }
        };
        formatter.printOptions(writer, 74, options, 0, 1);
        assertEquals("-x,--execute  desc\n", output.toString());
    }

    public void testPrintWrappedAtExactWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append("\n");
            }
        };
        formatter.printWrapped(writer, 5, "abcde");
        assertEquals("abcde\n", output.toString());
    }

    public void testPrintWrappedOnWhitespaceBoundary() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append("\n");
            }
        };
        formatter.printWrapped(writer, 5, "ab cd");
        assertEquals("ab\ncd\n", output.toString());
    }

    public void testPrintWrappedUsesTabStopForContinuation() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append("\n");
            }
        };
        formatter.printWrapped(writer, 5, 2, "ab cd ef");
        assertEquals("ab\n  cd\nef\n", output.toString());
    }

    public void testPrintHelpRejectsMissingSyntax() throws Exception {
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
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append("\n");
            }
        };
        formatter.printHelp(writer, 74, "tool", "head", new Options(), 1, 3, "foot", false);
        assertEquals("usage: tool\nhead\n\nfoot\n", output.toString());
    }

    public void testPrintHelpWithAutomaticUsage() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(new Option("x", "execute", false, "execute"));
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append("\n");
            }
        };
        formatter.printHelp(writer, 74, "tool", null, options, 1, 3, null, true);
        assertEquals("usage: tool [-x]\n -x   execute\n", output.toString());
    }
}
