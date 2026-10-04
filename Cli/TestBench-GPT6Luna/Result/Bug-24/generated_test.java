package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class HelpFormatterTest extends TestCase {
    public void testWidthSetterAndGetterAtIntegerEdges() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, formatter.getWidth());
        formatter.setWidth(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, formatter.getWidth());
    }

    public void testPaddingSettersAndGettersAtZeroAndNegativeEdge() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        formatter.setDescPadding(-1);
        assertEquals(0, formatter.getLeftPadding());
        assertEquals(-1, formatter.getDescPadding());
    }

    public void testStringConfigurationSettersAndGetters() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("run: ");
        formatter.setNewLine("|");
        formatter.setOptPrefix("+");
        formatter.setLongOptPrefix("++");
        formatter.setArgName("value");
        assertEquals("run: ", formatter.getSyntaxPrefix());
        assertEquals("|", formatter.getNewLine());
        assertEquals("+", formatter.getOptPrefix());
        assertEquals("++", formatter.getLongOptPrefix());
        assertEquals("value", formatter.getArgName());
    }

    public void testStringConfigurationCanBeSetToNull() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix(null);
        formatter.setNewLine(null);
        formatter.setOptPrefix(null);
        formatter.setLongOptPrefix(null);
        formatter.setArgName(null);
        assertNull(formatter.getSyntaxPrefix());
        assertNull(formatter.getNewLine());
        assertNull(formatter.getOptPrefix());
        assertNull(formatter.getLongOptPrefix());
        assertNull(formatter.getArgName());
    }

    public void testOptionComparatorSortsCaseInsensitively() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Option lower = new Option("a", "lower");
        Option upper = new Option("B", "upper");
        assertTrue(formatter.getOptionComparator().compare(lower, upper) < 0);
        assertTrue(formatter.getOptionComparator().compare(upper, lower) > 0);
    }

    public void testSettingNullComparatorRestoresDefaultComparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = Collections.reverseOrder();
        formatter.setOptionComparator(comparator);
        assertSame(comparator, formatter.getOptionComparator());
        formatter.setOptionComparator(null);
        assertTrue(formatter.getOptionComparator().compare(
                new Option("a", "a"), new Option("b", "b")) < 0);
    }

    public void testPrintUsageWithPlainSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("|");
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printUsage(writer, 74, "tool input");
        writer.flush();
        assertEquals("usage: tool input\n", output.toString());
    }

    public void testPrintUsageWithOptionsAndOptionalArgument() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("|");
        Options options = new Options();
        Option first = new Option("a", "alpha", true, "first");
        first.setArgName("val");
        first.setRequired(true);
        options.addOption(first);
        options.addOption(new Option("b", "beta", false, "second"));
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printUsage(writer, 74, "tool", options);
        writer.flush();
        assertEquals("usage: tool -a <val> [-b]\n", output.toString());
    }

    public void testPrintOptionsRendersNamesAndDescriptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("|");
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "first"));
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printOptions(writer, 74, options, 1, 3);
        writer.flush();
        assertEquals(" -a,--alpha   first\n", output.toString());
    }

    public void testPrintWrappedLeavesTextUnderWidthUnchanged() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printWrapped(writer, 5, "abc");
        writer.flush();
        assertEquals("abc\n", output.toString());
    }

    public void testPrintWrappedUsesWhitespaceAtWidthBoundary() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("|");
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printWrapped(writer, 4, "ab cd");
        writer.flush();
        assertEquals("ab|cd\n", output.toString());
    }

    public void testPrintWrappedHandlesExplicitNewline() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("|");
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printWrapped(writer, 10, "ab\ncd");
        writer.flush();
        assertEquals("ab|cd\n", output.toString());
    }

    public void testPrintHelpRejectsNullSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        try {
            formatter.printHelp(new PrintWriter(new java.io.StringWriter()), 74,
                    null, null, new Options(), 1, 3, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    public void testPrintHelpRejectsEmptySyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        try {
            formatter.printHelp(new PrintWriter(new java.io.StringWriter()), 74,
                    "", null, new Options(), 1, 3, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    public void testPrintHelpIncludesHeaderAndFooter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("|");
        Options options = new Options();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printHelp(writer, 74, "tool", "header", options, 1, 3, "footer");
        writer.flush();
        assertEquals("usage: tool|\nheader|\n|\nfooter\n", output.toString());
    }

    public void testPrintHelpSkipsBlankHeaderAndFooter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("|");
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.StringWriter()) {
            public void println(String value) {
                output.append(value).append('\n');
            }
        };
        formatter.printHelp(writer, 74, "tool", "   ", new Options(), 1, 3, "\t");
        writer.flush();
        assertEquals("usage: tool|\n|\n", output.toString());
    }
}
