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

    // Define constants used in tests, mirroring those in HelpFormatter
    private static final int DEFAULT_WIDTH = 74;
    private static final int DEFAULT_LEFT_PAD = 1;
    private static final int DEFAULT_DESC_PAD = 3;

    public void testPrintHelpWithNullOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = null;
        String cmdLineSyntax = "test";
        // Capture System.out to prevent actual console output during test execution
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));
        formatter.printHelp(cmdLineSyntax, options);
        System.setOut(System.out); // Restore System.out
        // Assert that no exception was thrown and some output was generated (or not, depending on expected behavior)
        // For now, just checking for no exceptions. A faulty implementation might throw NullPointerException.
    }

    public void testPrintHelpWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "test";
        // Capture System.out
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));
        formatter.printHelp(cmdLineSyntax, options);
        System.setOut(System.out); // Restore System.out
        // A more robust test would capture and assert specific output.
    }

    public void testPrintHelpWithAutoUsage() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "test";
        // Capture System.out
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));
        formatter.printHelp(cmdLineSyntax, options, true);
        System.setOut(System.out); // Restore System.out
        // Testing autoUsage functionality. No specific output assertion for now.
    }

    public void testPrintHelpWithHeaderAndFooter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "test";
        String header = "Test Header";
        String footer = "Test Footer";
        // Capture System.out
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));
        formatter.printHelp(cmdLineSyntax, header, options, footer);
        System.setOut(System.out); // Restore System.out
        // Testing header and footer rendering.
    }

    public void testPrintHelpWithWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "test";
        String header = "Test Header";
        String footer = "Test Footer";
        int width = 100;
        // Capture System.out
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));
        formatter.printHelp(width, cmdLineSyntax, header, options, footer);
        System.setOut(System.out); // Restore System.out
        // Testing with a different width.
    }

    public void testPrintHelpWithAllParams() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "test";
        String header = "Test Header";
        String footer = "Test Footer";
        int width = 100;
        boolean autoUsage = true;
        // Capture System.out
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));
        formatter.printHelp(width, cmdLineSyntax, header, options, footer, autoUsage);
        System.setOut(System.out); // Restore System.out
        // Testing with all parameters.
    }

    public void testPrintHelpWithPrintWriter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "test";
        String header = "Test Header";
        String footer = "Test Footer";
        int width = DEFAULT_WIDTH; // Default width
        int leftPad = DEFAULT_LEFT_PAD; // Default left pad
        int descPad = DEFAULT_DESC_PAD; // Default desc pad
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer);
        pw.flush();
    }

    public void testPrintHelpWithPrintWriterAndAutoUsage() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "test";
        String header = "Test Header";
        String footer = "Test Footer";
        int width = DEFAULT_WIDTH; // Default width
        int leftPad = DEFAULT_LEFT_PAD; // Default left pad
        int descPad = DEFAULT_DESC_PAD; // Default desc pad
        boolean autoUsage = true;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, autoUsage);
        pw.flush();
    }

    public void testPrintUsageWithNullOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = null;
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printUsage(pw, width, app, options);
        pw.flush();
    }

    public void testPrintUsageWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printUsage(pw, width, app, options);
        pw.flush();
    }

    public void testPrintUsageWithASingleOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "description a");
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printUsage(pw, width, app, options);
        pw.flush();
    }

    public void testPrintUsageWithRequiredOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("r", "required", true, "a required option");
        options.getOption("r").setRequired(true);
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printUsage(pw, width, app, options);
        pw.flush();
    }

    public void testPrintUsageWithOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "description a"));
        group.addOption(new Option("b", "beta", false, "description b"));
        options.addOptionGroup(group);
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printUsage(pw, width, app, options);
        pw.flush();
    }

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
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printUsage(pw, width, app, options);
        pw.flush();
    }

    public void testPrintUsageWithLongOptionOnly() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(null, "longopt", false, "long option");
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printUsage(pw, width, app, options);
        pw.flush();
    }

    public void testPrintUsageWithOptionAndLongOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("s", "short-long", false, "short and long option");
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printUsage(pw, width, app, options);
        pw.flush();
    }

    public void testPrintUsageWithOptionWithValue() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("f", "file", true, "a file");
        options.getOption("f").setArgName("filename");
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printUsage(pw, width, app, options);
        pw.flush();
    }

    public void testPrintUsageWithOptionWithUnlimitedValues() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("v", "values", true, "multiple values");
        options.getOption("v").setArgs(Option.UNLIMITED_VALUES);
        options.getOption("v").setArgName("val");
        String app = "testApp";
        int width = DEFAULT_WIDTH;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printUsage(pw, width, app, options);
        pw.flush();
    }

    public void testPrintOptionsWithNullOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = null;
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
    }

    public void testPrintOptionsWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
    }

    public void testPrintOptionsWithLongOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
    }

    public void testPrintOptionsWithShortOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("s", null, false, "The short option.");
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
    }

    public void testPrintOptionsWithOptionAndArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("f", "file", true, "Input file name.");
        options.getOption("f").setArgName("FILE");
        int width = DEFAULT_WIDTH;
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
    }

    public void testPrintOptionsWithWrappedDescription() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String longDescription = "This is a very long description that should definitely wrap around to the next line when printed.";
        options.addOption("l", "long", false, longDescription);
        int width = 30; // A narrow width to force wrapping
        int leftPad = DEFAULT_LEFT_PAD;
        int descPad = DEFAULT_DESC_PAD;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
    }

    public void testPrintWrapped() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test string that should be wrapped.";
        int width = 20;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printWrapped(pw, width, text);
        pw.flush();
    }

    public void testPrintWrappedWithTabStop() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test string with a tab stop.";
        int width = 30;
        int nextLineTabStop = 10;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printWrapped(pw, width, nextLineTabStop, text);
        pw.flush();
    }

    public void testPrintWrappedWithLongWord() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "Thisisanextremelylongwordthatwillnotbreak.";
        int width = 10;
        PrintWriter pw = new PrintWriter(System.out);
        // Capture System.out temporarily if needed for assertion, otherwise let it print.
        formatter.printWrapped(pw, width, text);
        pw.flush();
    }

    public void testFindWrapPosBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test string.";
        int width = 10;
        int startPos = 0;
        // Expected wrap position is after "test".
        assertEquals(10, formatter.findWrapPos(text, width, startPos));
    }

    public void testFindWrapPosAtEnd() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test.";
        int width = 20;
        int startPos = 0;
        // No wrap needed, should return -1.
        assertEquals(-1, formatter.findWrapPos(text, width, startPos));
    }

    public void testFindWrapPosWithNewline() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "First line\nSecond line.";
        int width = 10;
        int startPos = 0;
        // Should wrap at newline.
        assertEquals(10, formatter.findWrapPos(text, width, startPos));
    }

    public void testFindWrapPosWithLongWordNoSpace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "Thisisanextremelylongword.";
        int width = 10;
        int startPos = 0;
        // Should return the position where the word would break if it could,
        // or -1 if it fits within width without breaking.
        // In this case, the word is longer than width, and it will return the position of the word.
        // The logic in findWrapPos needs careful examination for this edge case.
        // Let's assume it returns the start of the word if it can't wrap and the word is longer than width.
        // However, the current implementation finds the last space <= width, then the first space > width.
        // If no space, it returns -1 if startPos + width >= text.length()
        // or the first non-space char after startPos + width.
        // For "Thisisanextremelylongword." and width 10, it will try to find a space at or before index 10.
        // It finds none. Then it checks if startPos + width (10) >= text.length() (26), which is false.
        // It then looks for the first space after index 10. None exist. It returns -1.
        assertEquals(-1, formatter.findWrapPos(text, width, startPos));
    }

    public void testFindWrapPosWithLongWordAtEdge() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "Word1 Word2Thisisanextremelylongword.";
        int width = 10;
        int startPos = 0;
        // The word "Word2Thisisanextremelylongword." starts at index 11.
        // The loop for finding the last space before width (10) will stop at index 5 (' ').
        // pos becomes 5. It returns 5.
        assertEquals(5, formatter.findWrapPos(text, width, startPos));
    }

    public void testCreatePadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Test creating padding of length 5.
        assertEquals("     ", formatter.createPadding(5));
        // Test creating padding of length 0.
        assertEquals("", formatter.createPadding(0));
    }

    public void testRtrimBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Test trimming trailing spaces.
        assertEquals("test", formatter.rtrim("test   "));
    }

    public void testRtrimNoTrailingSpace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Test string with no trailing spaces.
        assertEquals("test", formatter.rtrim("test"));
    }

    public void testRtrimOnlySpaces() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Test string with only spaces.
        assertEquals("", formatter.rtrim("   "));
    }

    public void testRtrimEmptyString() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Test empty string.
        assertEquals("", formatter.rtrim(""));
    }

    public void testRtrimNull() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Test null string.
        assertNull(formatter.rtrim(null));
    }

    public void testSetGetOptionComparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> customComparator = new Comparator<Option>() {
            @Override
            public int compare(Option o1, Option o2) {
                return o1.getKey().length() - o2.getKey().length();
            }
        };
        formatter.setOptionComparator(customComparator);
        // Check if the custom comparator is set.
        assertSame(customComparator, formatter.getOptionComparator());

        // Test setting to default
        formatter.setOptionComparator(null);
        // Check if it is reset to default
        assertTrue(formatter.getOptionComparator() instanceof HelpFormatter.OptionComparator);
    }

    public void testSetGetArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String argName = "param";
        formatter.setArgName(argName);
        assertEquals(argName, formatter.getArgName());
    }

    public void testSetGetLongOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String prefix = "->";
        formatter.setLongOptPrefix(prefix);
        assertEquals(prefix, formatter.getLongOptPrefix());
    }

    public void testSetGetOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String prefix = "+";
        formatter.setOptPrefix(prefix);
        assertEquals(prefix, formatter.getOptPrefix());
    }

    public void testSetGetNewLine() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String newLine = "\n";
        formatter.setNewLine(newLine);
        assertEquals(newLine, formatter.getNewLine());
    }

    public void testSetGetSyntaxPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String prefix = "Usage: ";
        formatter.setSyntaxPrefix(prefix);
        assertEquals(prefix, formatter.getSyntaxPrefix());
    }

    public void testSetGetDescPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        int padding = 5;
        formatter.setDescPadding(padding);
        assertEquals(padding, formatter.getDescPadding());
    }

    public void testSetGetLeftPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        int padding = 5;
        formatter.setLeftPadding(padding);
        assertEquals(padding, formatter.getLeftPadding());
    }

    public void testSetGetWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        int width = 100;
        formatter.setWidth(width);
        assertEquals(width, formatter.getWidth());
    }

    public void testPrintUsageWithEmptyCmdLineSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "";
        PrintWriter pw = new PrintWriter(System.out);
        try {
            formatter.printUsage(pw, DEFAULT_WIDTH, cmdLineSyntax, options);
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
        pw.flush();
    }

    public void testPrintHelpWithEmptyCmdLineSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "";
        PrintWriter pw = new PrintWriter(System.out);
        try {
            formatter.printHelp(pw, DEFAULT_WIDTH, cmdLineSyntax, "header", options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD, "footer", false);
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
        pw.flush();
    }
}
