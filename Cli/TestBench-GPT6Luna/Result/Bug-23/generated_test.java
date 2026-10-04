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
    public void testSetWidthAcceptsZero() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(0);
        assertEquals(0, formatter.getWidth());
    }

    public void testSetWidthAcceptsNegative() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(-1);
        assertEquals(-1, formatter.getWidth());
    }

    public void testSetLeftPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
    }

    public void testSetDescPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(1);
        assertEquals(1, formatter.getDescPadding());
    }

    public void testSetSyntaxPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("run: ");
        assertEquals("run: ", formatter.getSyntaxPrefix());
    }

    public void testSetNewLine() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("|");
        assertEquals("|", formatter.getNewLine());
    }

    public void testSetOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
    }

    public void testSetLongOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
    }

    public void testSetArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("file");
        assertEquals("file", formatter.getArgName());
    }

    public void testSetOptionComparatorAndReset() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator reverse = Collections.reverseOrder();
        formatter.setOptionComparator(reverse);
        assertSame(reverse, formatter.getOptionComparator());
        formatter.setOptionComparator(null);
        assertTrue(formatter.getOptionComparator() != null);
    }

    public void testPrintUsageWithSingleCommandToken() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("run: ");
        StringBuffer out = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] c, int off, int len) {
                out.append(c, off, len);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printUsage(writer, 74, "tool");
        writer.flush();
        assertEquals("run: tool" + formatter.getNewLine(), out.toString());
    }

    public void testPrintUsageWithOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("run: ");
        Options options = new Options();
        options.addOption("b", false, "beta");
        options.addOption("a", false, "alpha");
        StringBuffer out = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] c, int off, int len) {
                out.append(c, off, len);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printUsage(writer, 74, "tool", options);
        writer.flush();
        assertEquals("run: tool [-a] [-b]" + formatter.getNewLine(), out.toString());
    }

    public void testPrintOptionsEmptyCollection() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringBuffer out = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] c, int off, int len) {
                out.append(c, off, len);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printOptions(writer, 74, options, 1, 3);
        writer.flush();
        assertEquals(formatter.getNewLine(), out.toString());
    }

    public void testPrintOptionsFormatsConfiguredOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("x", "extra", true, "detail");
        StringBuffer out = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] c, int off, int len) {
                out.append(c, off, len);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printOptions(writer, 74, options, 1, 2);
        writer.flush();
        assertEquals(" -x,--extra <arg>  detail" + formatter.getNewLine(), out.toString());
    }

    public void testPrintWrappedAtExactWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer out = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] c, int off, int len) {
                out.append(c, off, len);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printWrapped(writer, 5, "abcde");
        writer.flush();
        assertEquals("abcde" + formatter.getNewLine(), out.toString());
    }

    public void testPrintWrappedAtWhitespaceBoundary() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringBuffer out = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] c, int off, int len) {
                out.append(c, off, len);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printWrapped(writer, 5, "ab cd");
        writer.flush();
        assertEquals("ab" + formatter.getNewLine() + "cd" + formatter.getNewLine(), out.toString());
    }

    public void testPrintHelpRejectsEmptyCommandSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        try {
            formatter.printHelp(null, new Options());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    public void testPrintHelpIncludesSyntaxAndOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("x", false, "extra");
        StringBuffer out = new StringBuffer();
        PrintWriter writer = new PrintWriter(new java.io.Writer() {
            public void write(char[] c, int off, int len) {
                out.append(c, off, len);
            }
            public void flush() { }
            public void close() { }
        });
        formatter.printHelp(writer, 74, "tool", null, options, 1, 3, null, false);
        writer.flush();
        assertTrue(out.toString().contains("usage: tool"));
        assertTrue(out.toString().contains("-x"));
    }
}
