```java
package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelpFormatterTest extends TestCase {

    // Define constants used in tests, mirroring those in HelpFormatter
    private static final int DEFAULT_WIDTH = 74;
    private static final int DEFAULT_LEFT_PAD = 1;
    private static final int DEFAULT_DESC_PAD = 3;

    /**
     * Tests the printHelp method with null options.
     * The reference implementation does not throw an exception for null options.
     */
    public void testPrintHelpWithNullOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = null;
        String cmdLineSyntax = "test";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        formatter.printHelp(cmdLineSyntax, options);
        ps.flush();
        System.setOut(System.out); // Restore System.out
        String output = baos.toString();
        // Check for specific output patterns or absence of exceptions.
        // For now, focus on no exceptions being thrown and the output structure.
        assertTrue(output.contains("usage: test"));
    }

    /**
     * Tests the printHelp method with an empty Options object.
     */
    public void testPrintHelpWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "test";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        formatter.printHelp(cmdLineSyntax, options);
        ps.flush();
        System.setOut(System.out); // Restore System.out
        String output = baos.toString();
        assertTrue(output.contains("usage: test"));
    }

    /**
     * Tests the printHelp method with autoUsage enabled.
     */
    public void testPrintHelpWithAutoUsage() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "all", false, "Prints all options.");
        String cmdLineSyntax = "test";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        formatter.printHelp(cmdLineSyntax, options, true);
        ps.flush();
        System.setOut(System.out); // Restore System.out
        String output = baos.toString();
        assertTrue(output.contains("usage: test -a"));
        assertTrue(output.contains("Prints all options."));
    }

    /**
     * Tests the printHelp method with header and footer.
     */
    public void testPrintHelpWithHeaderAndFooter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("h", "help", false, "Prints help.");
        String cmdLineSyntax = "test";
        String header = "This is a header.";
        String footer = "This is a footer.";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        formatter.printHelp(cmdLineSyntax, header, options, footer);
        ps.flush();
        System.setOut(System.out); // Restore System.out
        String output = baos.toString();
        assertTrue(output.contains("This is a header."));
        assertTrue(output.contains("usage: test -h"));
        assertTrue(output.contains("Prints help."));
        assertTrue(output.contains("This is a footer."));
    }

    /**
     * Tests the printHelp method with a custom width.
     */
    public void testPrintHelpWithWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("w", "wide", false, "An option with a description that should wrap.");
        String cmdLineSyntax = "test";
        String header = "Header";
        String footer = "Footer";
        int width = 30; // Narrow width to force wrapping
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        formatter.printHelp(width, cmdLineSyntax, header, options, footer);
        ps.flush();
        System.setOut(System.out); // Restore System.out
        String output = baos.toString();
        assertTrue(output.contains("usage: test -w"));
        assertTrue(output.contains("An option with a"));
        assertTrue(output.contains("description that"));
        assertTrue(output.contains("should wrap."));
    }

    /**
     * Tests printHelp with all parameters, including autoUsage.
     */
    public void testPrintHelpWithAllParamsAndAutoUsage() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "all", false, "All options.");
        String cmdLineSyntax = "test";
        String header = "Test Header";
        String footer = "Test Footer";
        int width = 80;
        boolean autoUsage = true;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        formatter.printHelp(width, cmdLineSyntax, header, options, footer, autoUsage);
        ps.flush();
        System.setOut(System.out); // Restore System.out
        String output = baos.toString();
        assertTrue(output.contains("usage: test -a"));
        assertTrue(output.contains("Test Header"));
        assertTrue(output.contains("All options."));
        assertTrue(output.contains("Test Footer"));
    }

    /**
     * Tests printHelp with a PrintWriter.
     */
    public void testPrintHelpWithPrintWriter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("p", "print", false, "Print option.");
        String cmdLineSyntax = "test";
        String header = "PrintWriter Test";
        String footer = "End of test";
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("PrintWriter Test"));
        assertTrue(output.contains("usage: test -p"));
        assertTrue(output.contains("Print option."));
        assertTrue(output.contains("End of test"));
    }

    /**
     * Tests printHelp with a PrintWriter and autoUsage enabled.
     */
    public void testPrintHelpWithPrintWriterAndAutoUsage() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("u", "usage", false, "Auto usage.");
        String cmdLineSyntax = "test";
        String header = "PrintWriter AutoUsage Test";
        String footer = "End of test";
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        boolean autoUsage = true;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("usage: test -u"));
        assertTrue(output.contains("PrintWriter AutoUsage Test"));
        assertTrue(output.contains("Auto usage."));
        assertTrue(output.contains("End of test"));
    }

    /**
     * Tests printUsage with null options.
     */
    public void testPrintUsageWithNullOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = null;
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        String output = baos.toString();
        assertEquals("usage: testApp \n", output); // Default behavior for null options
    }

    /**
     * Tests printUsage with an empty Options object.
     */
    public void testPrintUsageWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        String output = baos.toString();
        assertEquals("usage: testApp \n", output);
    }

    /**
     * Tests printUsage with a single option.
     */
    public void testPrintUsageWithASingleOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("usage: testApp -a"));
        assertTrue(output.contains("description a"));
    }

    /**
     * Tests printUsage with a required option.
     */
    public void testPrintUsageWithRequiredOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option requiredOption = new Option("r", "required", true, "a required option");
        requiredOption.setRequired(true);
        options.addOption(requiredOption);
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("usage: testApp -r"));
        assertTrue(output.contains("a required option"));
    }

    /**
     * Tests printUsage with an OptionGroup.
     */
    public void testPrintUsageWithOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "description a"));
        group.addOption(new Option("b", "beta", false, "description b"));
        options.addOptionGroup(group);
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("usage: testApp [-a|--alpha]"));
        assertTrue(output.contains("usage: testApp [-b|--beta]"));
    }

    /**
     * Tests printUsage with a required OptionGroup.
     */
    public void testPrintUsageWithRequiredOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "description a"));
        group.addOption(new Option("b", "beta", false, "description b"));
        group.setRequired(true);
        options.addOptionGroup(group);
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("usage: testApp [-a|--alpha]"));
        assertTrue(output.contains("usage: testApp [-b|--beta]"));
    }

    /**
     * Tests printUsage with a long option only.
     */
    public void testPrintUsageWithLongOptionOnly() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(null, "longopt", false, "long option");
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("usage: testApp [--longopt]"));
    }

    /**
     * Tests printUsage with both short and long options.
     */
    public void testPrintUsageWithOptionAndLongOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("s", "short-long", false, "short and long option");
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("usage: testApp [-s,--short-long]"));
    }

    /**
     * Tests printUsage with an option that has an argument name.
     */
    public void testPrintUsageWithOptionWithValue() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option fileOption = options.addOption("f", "file", true, "a file");
        fileOption.setArgName("filename");
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("usage: testApp -f"));
        assertTrue(output.contains("<filename>"));
    }

    /**
     * Tests printUsage with an option that has unlimited values.
     */
    public void testPrintUsageWithOptionWithUnlimitedValues() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option valuesOption = options.addOption("v", "values", true, "multiple values");
        valuesOption.setArgs(Option.UNLIMITED_VALUES);
        valuesOption.setArgName("val");
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("usage: testApp -v"));
        assertTrue(output.contains("<val>")); // It should still show one arg name
    }

    /**
     * Tests printOptions with null options.
     */
    public void testPrintOptionsWithNullOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = null;
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
        String output = baos.toString();
        assertEquals("", output); // No options to print
    }

    /**
     * Tests printOptions with an empty Options object.
     */
    public void testPrintOptionsWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
        String output = baos.toString();
        assertEquals("", output); // No options to print
    }

    /**
     * Tests printOptions with a long option.
     */
    public void testPrintOptionsWithLongOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("  --alpha"));
        assertTrue(output.contains("The alpha option."));
    }

    /**
     * Tests printOptions with a short option.
     */
    public void testPrintOptionsWithShortOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("s", null, false, "The short option.");
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("  -s"));
        assertTrue(output.contains("The short option."));
    }

    /**
     * Tests printOptions with an option and its argument name.
     */
    public void testPrintOptionsWithOptionAndArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option fileOption = options.addOption("f", "file", true, "Input file name.");
        fileOption.setArgName("FILE");
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("  -f,--file"));
        assertTrue(output.contains("<FILE>"));
        assertTrue(output.contains("Input file name."));
    }

    /**
     * Tests printOptions with a wrapped description.
     */
    public void testPrintOptionsWithWrappedDescription() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String longDescription = "This is a very long description that should definitely wrap around to the next line when printed.";
        options.addOption("l", "long", false, longDescription);
        int width = 30; // Narrow width to force wrapping
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
        String output = baos.toString();
        assertTrue(output.contains("  -l,--long"));
        assertTrue(output.contains("This is a very long"));
        assertTrue(output.contains("description that should"));
        assertTrue(output.contains("definitely wrap around"));
        assertTrue(output.contains("to the next line when"));
        assertTrue(output.contains("printed."));
    }

    /**
     * Tests the printWrapped method with basic wrapping.
     */
    public void testPrintWrapped() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test string that should be wrapped.";
        int width = 20;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        formatter.printWrapped(pw, width, text);
        pw.flush();
        String output = baos.toString();
        assertEquals("This is a test\nstring that\nshould be\nwrapped.\n", output);
    }

    /**
     * Tests printWrapped with a specified tab stop for the next line.
     */
    public void testPrintWrappedWithTabStop() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test string with a tab stop.";
        int width = 30;
        int nextLineTabStop = 10;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new ByteArrayOutputStream();
        formatter.printWrapped(pw, width, nextLineTabStop, text);
        pw.flush();
        String output = baos.toString();
        assertEquals("This is a test string\n          with a tab stop.\n", output);
    }

    /**
     * Tests printWrapped with a very long word that exceeds the width.
     */
    public void testPrintWrappedWithLongWord() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "Thisisanextremelylongwordthatwillnotbreak.";
        int width = 10;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new ByteArrayOutputStream();
        formatter.printWrapped(pw, width, text);
        pw.flush();
        String output = baos.toString();
        assertEquals("Thisisanextremelylongwordthatwillnotbreak.\n", output);
    }

    /**
     * Tests findWrapPos with basic wrapping.
     */
    public void testFindWrapPosBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test string.";
        int width = 10;
        int startPos = 0;
        assertEquals(10, formatter.findWrapPos(text, width, startPos));
    }

    /**
     * Tests findWrapPos when the text fits within the width.
     */
    public void testFindWrapPosAtEnd() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test.";
        int width = 20;
        int startPos = 0;
        assertEquals(-1, formatter.findWrapPos(text, width, startPos));
    }

    /**
     * Tests findWrapPos when a newline character is present.
     */
    public void testFindWrapPosWithNewline() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "First line\nSecond line.";
        int width = 10;
        int startPos = 0;
        assertEquals(10, formatter.findWrapPos(text, width, startPos));
    }

    /**
     * Tests findWrapPos with a long word that exceeds the width and no whitespace.
     * The method should return -1 if the word itself is longer than the width and no wrap point is found.
     */
    public void testFindWrapPosWithLongWordNoSpace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "Thisisanextremelylongword."; // length 26
        int width = 10;
        int startPos = 0;
        // The word is longer than width. No space within width.
        // The logic should find the first non-space after startPos + width if no space before.
        // In this case, it should return position 10.
        assertEquals(10, formatter.findWrapPos(text, width, startPos));
    }
    
    /**
     * Tests findWrapPos with a long word at the edge of the width.
     */
    public void testFindWrapPosWithLongWordAtEdge() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "Word1 Word2Thisisanextremelylongword."; // Word2 starts at index 6
        int width = 10;
        int startPos = 0;
        // The last space before or at width 10 is at index 5.
        assertEquals(5, formatter.findWrapPos(text, width, startPos));
    }

    /**
     * Tests createPadding with a positive length.
     */
    public void testCreatePadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("     ", formatter.createPadding(5));
    }

    /**
     * Tests createPadding with zero length.
     */
    public void testCreatePaddingZero() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.createPadding(0));
    }

    /**
     * Tests rtrim with trailing spaces.
     */
    public void testRtrimBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("test", formatter.rtrim("test   "));
    }

    /**
     * Tests rtrim with a string containing no trailing spaces.
     */
    public void testRtrimNoTrailingSpace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("test", formatter.rtrim("test"));
    }

    /**
     * Tests rtrim with a string containing only spaces.
     */
    public void testRtrimOnlySpaces() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.rtrim("   "));
    }

    /**
     * Tests rtrim with an empty string.
     */
    public void testRtrimEmptyString() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.rtrim(""));
    }

    /**
     * Tests rtrim with a null string.
     */
    public void testRtrimNull() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertNull(formatter.rtrim(null));
    }

    /**
     * Tests setting and getting the option comparator.
     */
    public void testSetGetOptionComparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> customComparator = new Comparator<Option>() {
            @Override
            public int compare(Option o1, Option o2) {
                return o1.getKey().length() - o2.getKey().length();
            }
        };
        formatter.setOptionComparator(customComparator);
        assertSame(customComparator, formatter.getOptionComparator());

        // Test setting to default by passing null
        formatter.setOptionComparator(null);
        // The default comparator is an instance of HelpFormatter.OptionComparator
        assertTrue(formatter.getOptionComparator() instanceof HelpFormatter.OptionComparator);
    }

    /**
     * Tests setting and getting the argument name.
     */
    public void testSetGetArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String argName = "param";
        formatter.setArgName(argName);
        assertEquals(argName, formatter.getArgName());
    }

    /**
     * Tests setting and getting the long option prefix.
     */
    public void testSetGetLongOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String prefix = "->";
        formatter.setLongOptPrefix(prefix);
        assertEquals(prefix, formatter.getLongOptPrefix());
    }

    /**
     * Tests setting and getting the short option prefix.
     */
    public void testSetGetOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String prefix = "+";
        formatter.setOptPrefix(prefix);
        assertEquals(prefix, formatter.getOptPrefix());
    }

    /**
     * Tests setting and getting the new line string.
     */
    public void testSetGetNewLine() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String newLine = "\n";
        formatter.setNewLine(newLine);
        assertEquals(newLine, formatter.getNewLine());
    }

    /**
     * Tests setting and getting the syntax prefix.
     */
    public void testSetGetSyntaxPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String prefix = "Usage: ";
        formatter.setSyntaxPrefix(prefix);
        assertEquals(prefix, formatter.getSyntaxPrefix());
    }

    /**
     * Tests setting and getting the description padding.
     */
    public void testSetGetDescPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        int padding = 5;
        formatter.setDescPadding(padding);
        assertEquals(padding, formatter.getDescPadding());
    }

    /**
     * Tests setting and getting the left padding.
     */
    public void testSetGetLeftPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        int padding = 5;
        formatter.setLeftPadding(padding);
        assertEquals(padding, formatter.getLeftPadding());
    }

    /**
     * Tests setting and getting the width.
     */
    public void testSetGetWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        int width = 100;
        formatter.setWidth(width);
        assertEquals(width, formatter.getWidth());
    }

    /**
     * Tests printUsage with an empty cmdLineSyntax. Should throw IllegalArgumentException.
     */
    public void testPrintUsageWithEmptyCmdLineSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        try {
            formatter.printUsage(pw, DEFAULT_WIDTH, cmdLineSyntax, options);
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
        pw.flush();
    }

    /**
     * Tests printHelp with an empty cmdLineSyntax. Should throw IllegalArgumentException.
     */
    public void testPrintHelpWithEmptyCmdLineSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        try {
            formatter.printHelp(pw, DEFAULT_WIDTH, cmdLineSyntax, "header", options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD, "footer", false);
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
        pw.flush();
    }
}
```