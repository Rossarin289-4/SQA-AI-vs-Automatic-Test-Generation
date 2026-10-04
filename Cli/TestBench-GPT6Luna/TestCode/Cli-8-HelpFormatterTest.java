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
    public void testSetAndGetWidthAtIntegerEdges() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, formatter.getWidth());
        formatter.setWidth(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, formatter.getWidth());
    }

    public void testSetAndGetPaddingAtZeroAndNegativeEdge() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
        formatter.setDescPadding(-1);
        assertEquals(-1, formatter.getDescPadding());
    }

    public void testSetAndGetTextProperties() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("run ");
        formatter.setNewLine("|");
        formatter.setOptPrefix("/");
        formatter.setLongOptPrefix("++");
        formatter.setArgName("file");
        assertEquals("run ", formatter.getSyntaxPrefix());
        assertEquals("|", formatter.getNewLine());
        assertEquals("/", formatter.getOptPrefix());
        assertEquals("++", formatter.getLongOptPrefix());
        assertEquals("file", formatter.getArgName());
    }

    public void testPrintUsageUsesConfiguredSyntaxPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("go ");
        java.io.StringWriter text = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(text);
        formatter.printUsage(writer, 40, "tool -x", new Options());
        writer.flush();
        assertEquals("go tool -x" + System.getProperty("line.separator"), text.toString());
    }

    public void testPrintUsageWithOptionsSortsAndDisplaysRequiredOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option later = new Option("z", "late");
        Option earlier = new Option("a", "early");
        earlier.setRequired(true);
        options.addOption(later);
        options.addOption(earlier);
        java.io.StringWriter text = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(text);
        formatter.printUsage(writer, 80, "tool", options);
        writer.flush();
        assertEquals("usage: tool -a [-z]" + System.getProperty("line.separator"), text.toString());
    }

    public void testPrintOptionsRendersDescriptionAndPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("x", "ex", false, "sample");
        java.io.StringWriter text = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(text);
        formatter.printOptions(writer, 80, options, 1, 2);
        writer.flush();
        assertEquals(" -x,--ex  sample" + System.getProperty("line.separator"), text.toString());
    }

    public void testPrintOptionsRendersArgumentName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Option option = new Option("f", "file", true, "input");
        option.setArgName("path");
        Options options = new Options();
        options.addOption(option);
        java.io.StringWriter text = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(text);
        formatter.printOptions(writer, 80, options, 0, 1);
        writer.flush();
        assertEquals("-f,--file <path> input" + System.getProperty("line.separator"), text.toString());
    }

    public void testPrintWrappedAtWidthBoundary() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        java.io.StringWriter text = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(text);
        formatter.printWrapped(writer, 5, "one two");
        writer.flush();
        assertEquals("one" + System.getProperty("line.separator") + "two"
                + System.getProperty("line.separator"), text.toString());
    }

    public void testPrintWrappedTextShorterThanWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        java.io.StringWriter text = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(text);
        formatter.printWrapped(writer, 8, "short");
        writer.flush();
        assertEquals("short" + System.getProperty("line.separator"), text.toString());
    }

    public void testPrintHelpRejectsNullSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        try {
            formatter.printHelp((PrintWriter) new PrintWriter(new java.io.StringWriter()),
                    20, null, null, new Options(), 1, 3, null, false);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    public void testPrintHelpRejectsEmptySyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        try {
            formatter.printHelp(new PrintWriter(new java.io.StringWriter()),
                    20, "", null, new Options(), 1, 3, null, false);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    public void testPrintHelpWritesUsageAndOptionDescription() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("q", false, "quiet");
        java.io.StringWriter text = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(text);
        formatter.printHelp(writer, 80, "tool", null, options, 1, 3, null, false);
        writer.flush();
        assertEquals("usage: tool" + System.getProperty("line.separator")
                + " -q   quiet" + System.getProperty("line.separator"),
                text.toString());
    }

    public void testOptionGroupUsageIsRenderedAsAlternative() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha"));
        group.addOption(new Option("b", "beta"));
        options.addOptionGroup(group);
        java.io.StringWriter text = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(text);
        formatter.printUsage(writer, 80, "tool", options);
        writer.flush();
        assertEquals("usage: tool [-a | -b]" + System.getProperty("line.separator"),
                text.toString());
    }

    public void testPrintOptionsEmptyOptionsProducesNewline() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        java.io.StringWriter text = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(text);
        formatter.printOptions(writer, 80, new Options(), 1, 3);
        writer.flush();
        assertEquals(System.getProperty("line.separator"), text.toString());
    }
}
