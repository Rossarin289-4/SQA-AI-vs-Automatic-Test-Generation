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
    public void testWidthAndPaddingSetters() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, formatter.getWidth());
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
        formatter.setDescPadding(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, formatter.getDescPadding());
    }

    public void testTextSetters() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("");
        assertEquals("", formatter.getSyntaxPrefix());
        formatter.setNewLine("|");
        assertEquals("|", formatter.getNewLine());
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
        formatter.setArgName("v");
        assertEquals("v", formatter.getArgName());
    }

    public void testComparatorCanBeReplacedAndReset() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();
        Comparator reverse = Collections.reverseOrder();
        formatter.setOptionComparator(reverse);
        assertSame(reverse, formatter.getOptionComparator());
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        assertTrue(comparator != formatter.getOptionComparator());
    }

    public void testDefaultComparatorIgnoresCase() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Option lower = new Option("a", "lower");
        Option upper = new Option("B", "upper");
        assertTrue(formatter.getOptionComparator().compare(lower, upper) < 0);
    }

    public void testComparatorOrdersOptionKeysIgnoringCase() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Option lower = new Option("a", "desc");
        Option upper = new Option("A", "desc");
        assertEquals(0, formatter.getOptionComparator().compare(lower, upper));
    }

    public void testPrintUsageWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printUsage(writer, 74, "tool", options);
        writer.flush();
        assertEquals("usage: tool" + System.getProperty("line.separator"), sink.toString());
    }

    public void testPrintUsageSortsOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(new Option("b", "second"));
        options.addOption(new Option("a", "first"));
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printUsage(writer, 74, "tool", options);
        writer.flush();
        assertEquals("usage: tool [-a] [-b]" + System.getProperty("line.separator"), sink.toString());
    }

    public void testPrintUsageUsesArgumentName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option value = new Option("v", true, "value");
        value.setArgName("file");
        options.addOption(value);
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printUsage(writer, 74, "tool", options);
        writer.flush();
        assertEquals("usage: tool [-v <file>]" + System.getProperty("line.separator"), sink.toString());
    }

    public void testPrintOptionsRendersPaddingAndDescription() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(new Option("a", "alpha"));
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printOptions(writer, 74, options, 1, 3);
        writer.flush();
        assertEquals(" -a   alpha" + System.getProperty("line.separator"), sink.toString());
    }

    public void testPrintOptionsShowsLongOnlyOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(new Option(null, "verbose", false, "detail"));
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printOptions(writer, 74, options, 0, 2);
        writer.flush();
        assertEquals("   --verbose  detail" + System.getProperty("line.separator"), sink.toString());
    }

    public void testPrintOptionsShowsArgumentPlaceholder() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option value = new Option("o", "output", true, "write");
        value.setArgName("path");
        options.addOption(value);
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printOptions(writer, 74, options, 0, 1);
        writer.flush();
        assertEquals("-o,--output <path> write" + System.getProperty("line.separator"), sink.toString());
    }

    public void testPrintWrappedLeavesShortTextOnOneLine() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printWrapped(writer, 5, "abc");
        writer.flush();
        assertEquals("abc" + System.getProperty("line.separator"), sink.toString());
    }

    public void testPrintWrappedBreaksAtWidthWhitespace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printWrapped(writer, 5, "ab cd");
        writer.flush();
        assertEquals("ab cd" + System.getProperty("line.separator"), sink.toString());
    }

    public void testPrintWrappedHonorsNewline() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("|");
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printWrapped(writer, 20, "a\nb");
        writer.flush();
        assertEquals("a|b|", sink.toString());
    }

    public void testPrintWrappedUsesNextLineTabStop() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printWrapped(writer, 4, 2, "ab cd");
        writer.flush();
        assertEquals("ab" + System.getProperty("line.separator") + "  cd"
                + System.getProperty("line.separator"), sink.toString());
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
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printHelp(writer, 74, "tool", "head", new Options(),
                1, 3, "foot", false);
        writer.flush();
        String nl = System.getProperty("line.separator");
        assertEquals("usage: tool" + nl + "head" + nl + nl + "foot" + nl, sink.toString());
    }

    public void testPrintHelpAutoUsageIncludesOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(new Option("a", "alpha"));
        java.io.StringWriter sink = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(sink);
        formatter.printHelp(writer, 74, "tool", null, options, 1, 3, null, true);
        writer.flush();
        assertTrue(sink.toString().startsWith("usage: tool [-a]"));
        assertTrue(sink.toString().contains("alpha"));
    }
}
