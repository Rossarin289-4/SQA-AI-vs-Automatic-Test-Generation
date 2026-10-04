package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.io.Serializable;

public class HelpFormatterTest extends TestCase {
    public void testWidthSetAndGetAtIntegerEdges() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, formatter.getWidth());
        formatter.setWidth(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, formatter.getWidth());
    }

    public void testPaddingSetAndGetAtZeroAndNegativeOne() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        formatter.setDescPadding(-1);
        assertEquals(0, formatter.getLeftPadding());
        assertEquals(-1, formatter.getDescPadding());
    }

    public void testSyntaxPrefixCanBeNull() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix(null);
        assertNull(formatter.getSyntaxPrefix());
    }

    public void testNewLineCanBeSetAndReadBack() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("|");
        assertEquals("|", formatter.getNewLine());
    }

    public void testPrefixesCanBeEmpty() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("");
        formatter.setLongOptPrefix("");
        assertEquals("", formatter.getOptPrefix());
        assertEquals("", formatter.getLongOptPrefix());
    }

    public void testLongOptionSeparatorCanBeChanged() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    public void testArgumentNameCanBeSetToNull() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName(null);
        assertNull(formatter.getArgName());
    }

    public void testNullComparatorRestoresDefaultComparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator first = formatter.getOptionComparator();
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        assertTrue(first != formatter.getOptionComparator());
    }

    public void testCustomComparatorIsRetained() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = Collections.reverseOrder();
        formatter.setOptionComparator(comparator);
        assertSame(comparator, formatter.getOptionComparator());
    }

    public void testPrintUsageFormatsApplicationAndOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", false, "alpha");
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] chars, int offset, int length) {
                output.append(chars, offset, length);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printUsage(writer, 74, "tool", options);
        writer.flush();
        assertEquals("usage: tool " + formatter.getNewLine(), output.toString());
    }

    public void testPrintOptionsRendersConfiguredOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", false, "alpha");
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] chars, int offset, int length) {
                output.append(chars, offset, length);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printOptions(writer, 74, options, 1, 3);
        writer.flush();
        assertEquals(" -a   alpha" + formatter.getNewLine(), output.toString());
    }

    public void testPrintWrappedPreservesShortText() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] chars, int offset, int length) {
                output.append(chars, offset, length);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printWrapped(writer, 10, "short");
        writer.flush();
        assertEquals("short" + formatter.getNewLine(), output.toString());
    }

    public void testPrintWrappedUsesWhitespaceAtWidthBoundary() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer output = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] chars, int offset, int length) {
                output.append(chars, offset, length);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printWrapped(writer, 4, "ab cd");
        writer.flush();
        assertEquals("ab" + formatter.getNewLine() + "cd" + formatter.getNewLine(),
                output.toString());
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

    public void testPrintHelpRendersHeaderAndFooter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", false, "alpha");
        java.io.StringWriter output = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(output);
        formatter.printHelp(writer, 74, "tool", "HEADER", options, 1, 3, "FOOTER", false);
        writer.flush();
        assertTrue(output.toString().startsWith("usage: tool" + formatter.getNewLine()));
        assertTrue(output.toString().contains("HEADER"));
        assertTrue(output.toString().contains("FOOTER"));
    }

    public void testPrintUsageIncludesRequiredOptionWithoutBrackets() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option required = new Option("x", "long", false, "required");
        required.setRequired(true);
        options.addOption(required);
        java.io.StringWriter output = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(output);
        formatter.printUsage(writer, 74, "tool", options);
        writer.flush();
        assertEquals("usage: tool " + formatter.getNewLine(), output.toString());
    }

    public void testPrintWrappedWithTabStopsWrapsAtNextLinePadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        java.io.StringWriter output = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(output);
        formatter.printWrapped(writer, 5, 2, "abc def");
        writer.flush();
        assertEquals("abc" + formatter.getNewLine() + "  def" + formatter.getNewLine(),
                output.toString());
    }

    public void testPrintHelpAutoUsageIncludesOptionalArgument() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(new Option("a", "alpha", true, "argument"));
        java.io.StringWriter output = new java.io.StringWriter();
        PrintWriter writer = new PrintWriter(output);
        formatter.printHelp(writer, 74, "tool", null, options, 1, 3, null, true);
        writer.flush();
        assertTrue(output.toString().startsWith("usage: tool [-a <arg>]" + formatter.getNewLine()));
    }

    public void testOptionConstructorAndBasicGetters() throws Exception {
        Option option = new Option("q", "quiet", false, "quiet mode");
        assertEquals("q", option.getOpt());
        assertEquals("quiet", option.getLongOpt());
        assertTrue(option.hasLongOpt());
        assertFalse(option.hasArg());
        assertEquals("quiet mode", option.getDescription());
        assertEquals((int) 'q', option.getId());
        assertNull(option.getType());
    }

    public void testOptionMutatorsAndArgumentNameEdges() throws Exception {
        Option option = new Option("a", "alpha", false, "old");
        option.setDescription("new");
        option.setLongOpt(null);
        option.setRequired(true);
        option.setArgName("");
        assertEquals("new", option.getDescription());
        assertNull(option.getLongOpt());
        assertFalse(option.hasLongOpt());
        assertTrue(option.isRequired());
        assertFalse(option.hasArgName());
    }

    public void testOptionArgumentCountsAndOptionalArgumentBranches() throws Exception {
        Option option = new Option("a", false, "arg");
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        assertFalse(option.hasArgs());
        option.setArgs(1);
        assertTrue(option.hasArg());
        assertFalse(option.hasArgs());
        option.setArgs(2);
        assertTrue(option.hasArgs());
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArgs());
        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());
    }

    public void testOptionValueSeparatorAndUnconfiguredValues() throws Exception {
        Option option = new Option("d", true, "define");
        assertFalse(option.hasValueSeparator());
        option.setValueSeparator('=');
        assertEquals('=', option.getValueSeparator());
        assertTrue(option.hasValueSeparator());
        assertNull(option.getValue());
        assertNull(option.getValues());
        assertEquals(0, option.getValuesList().size());
    }

    public void testOptionEqualityAndHashCodeUseNames() throws Exception {
        Option first = new Option("x", "extra", false, "one");
        Option sameNames = new Option("x", "extra", true, "two");
        Option other = new Option("x", "different", false, "one");
        assertTrue(first.equals(sameNames));
        assertEquals(first.hashCode(), sameNames.hashCode());
        assertFalse(first.equals(other));
        assertFalse(first.equals(null));
    }

    public void testOptionCloneKeepsIndependentValuesList() throws Exception {
        Option original = new Option("a", true, "arg");
        Option clone = (Option) original.clone();
        assertTrue(original.equals(clone));
        assertEquals(original.hashCode(), clone.hashCode());
        assertEquals("[ option: a  [ARG] :: arg ]", original.toString());
        assertEquals(0, clone.getValuesList().size());
    }

    public void testOptionAddValueAlwaysRejectsClientUse() throws Exception {
        Option option = new Option("a", true, "arg");
        try {
            option.addValue("v");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    public void testOptionBuilderCreatesConfiguredLongOption() throws Exception {
        Option option = OptionBuilder.withLongOpt("verbose")
                .withArgName("mode")
                .withValueSeparator('=')
                .withType(String.class)
                .withDescription("detail")
                .hasOptionalArgs()
                .create("v");
        assertEquals("v", option.getOpt());
        assertEquals("verbose", option.getLongOpt());
        assertEquals("mode", option.getArgName());
        assertEquals("detail", option.getDescription());
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        assertTrue(option.hasOptionalArg());
        assertEquals('=', option.getValueSeparator());
        assertSame(String.class, option.getType());
    }

    public void testOptionBuilderCreatesLongOnlyOption() throws Exception {
        Option option = OptionBuilder.withLongOpt("version").create();
        assertNull(option.getOpt());
        assertEquals("version", option.getLongOpt());
        assertTrue(option.hasLongOpt());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }
}
