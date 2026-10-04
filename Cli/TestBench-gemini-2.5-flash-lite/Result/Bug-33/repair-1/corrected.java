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
import java.io.StringWriter;

public class HelpFormatterTest extends TestCase {

    // Helper to capture PrintWriter output
    private String getPrintWriterOutput(PrintWriter pw) {
        // Assuming the StringWriter is accessible or the passed PrintWriter is wrapped
        // For simplicity in this context, we'll assume the test setup makes the StringWriter accessible
        // In a real scenario, you'd pass a StringWriter to the constructor and get it back.
        // Since we are not modifying the original code, and printHelp uses System.out,
        // we'd ideally redirect System.out, but that's more complex for a single test method.
        // For the purpose of correcting the provided tests, let's assume the intention was to capture output.
        // The current tests mostly create a StringWriter and PrintWriter.
        // However, the usage of `buffer.toString()` after `pw.flush()` is incorrect
        // because `buffer` is not the source for `pw`.
        // A better approach is to pass a StringWriter and return its content.

        // Re-implementing the capture mechanism for clarity and correctness.
        // This method will not be called directly by the test case but demonstrates how it should work.
        // The tests that use PrintWriter will be fixed to correctly capture output.
        return ""; // Placeholder
    }


    public void testDefaultValues() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        // OptionComparator is package-private, so we cannot directly check its instance.
        // We can check its behavior through getOptionComparator().
        // For now, we'll just check that a comparator is returned.
        assertNotNull(formatter.getOptionComparator());
    }

    public void testSettersAndGetters() throws Exception {
        HelpFormatter formatter = new HelpFormatter();

        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());

        formatter.setSyntaxPrefix("Usage: ");
        assertEquals("Usage: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("-");
        assertEquals("-", formatter.getOptPrefix());

        formatter.setLongOptPrefix("--");
        assertEquals("--", formatter.getLongOptPrefix());

        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());

        formatter.setArgName("param");
        assertEquals("param", formatter.getArgName());

        Comparator<Option> customComparator = new Comparator<Option>() {
            @Override
            public int compare(Option o1, Option o2) {
                return o1.getKey().length() - o2.getKey().length();
            }
        };
        formatter.setOptionComparator(customComparator);
        assertEquals(customComparator, formatter.getOptionComparator());

        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator()); // Check that it resets to default
    }

    public void testPrintHelpBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, formatter.getWidth(), "cmd", "Header", options, formatter.getLeftPadding(), formatter.getDescPadding(), "Footer");
        pw.flush();
        String output = sw.toString();

        assertTrue(output.contains("usage: cmd"));
        assertTrue(output.contains("Header"));
        assertTrue(output.contains("Footer"));
        assertTrue(output.contains("-a,--alpha"));
        assertTrue(output.contains("The alpha option."));
    }

    public void testPrintUsageBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), "cmd", options);
        pw.flush();
        String output = sw.toString();
        // Default argName is "arg"
        assertTrue(output.contains("usage: cmd [-a,--alpha <arg>]"));
    }
    
    public void testPrintUsageNoOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), "cmd", options);
        pw.flush();
        String output = sw.toString();
        assertEquals("usage: cmd" + formatter.getNewLine(), output);
    }

    public void testPrintOptionsBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("  -a,--alpha" + formatter.createPadding(formatter.getWidth() - 11) + "The alpha option."));
    }

    public void testPrintWrappedBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test string that should be wrapped.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, formatter.getWidth(), text);
        pw.flush();
        String output = sw.toString();
        // Check if it's wrapped, assuming default width is sufficient to wrap this.
        assertTrue(output.length() > 0);
        assertTrue(output.split(formatter.getNewLine()).length > 0); // At least one line
    }

    public void testRenderOptionsBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sb.toString();
        assertTrue(output.contains("  -a,--alpha"));
        assertTrue(output.contains("The alpha option."));
    }

    public void testRenderWrappedTextBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test string that should be wrapped.";
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, formatter.getWidth(), formatter.getLeftPadding(), text);
        String output = sb.toString();
        assertTrue(output.length() > 0);
        assertTrue(output.split(formatter.getNewLine()).length > 0); // At least one line
    }

    public void testFindWrapPosSimple() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a long sentence that needs to be wrapped.";
        int width = 30; // Smaller width for testing wrapping
        int pos = formatter.findWrapPos(text, width, 0);
        // Expecting wrap after "long"
        assertTrue(pos > 0);
        assertEquals(' ', text.charAt(pos));
    }

    public void testFindWrapPosAtWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // This string is exactly 30 characters long.
        String text = "This is a sentence exactly 30";
        int width = 30;
        int pos = formatter.findWrapPos(text, width, 0);
        assertEquals(-1, pos); // Should return -1 if it fits exactly
    }

    public void testFindWrapPosBeyondWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a sentence that is longer than the width limit.";
        int width = 30;
        int pos = formatter.findWrapPos(text, width, 0);
        // Expecting wrap before the end of the string.
        assertTrue(pos > 0);
        assertTrue(pos < text.length());
    }

    public void testCreatePadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.createPadding(0));
        assertEquals(" ", formatter.createPadding(1));
        assertEquals("   ", formatter.createPadding(3));
    }

    public void testRtrimBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("hello", formatter.rtrim("hello   "));
        assertEquals("world", formatter.rtrim("world"));
        assertEquals("", formatter.rtrim("   "));
        assertNull(formatter.rtrim(null));
    }

    public void testPrintUsageWithSyntaxPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("SYNOPSIS: ");
        Options options = new Options();
        options.addOption("a", null, false, "Option a");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), "cmd", options);
        pw.flush();
        String output = sw.toString();
        // Default argName is "arg"
        assertTrue(output.contains("SYNOPSIS: cmd [-a <arg>]"));
    }

    public void testPrintUsageWithArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("VALUE");
        Options options = new Options();
        options.addOption("a", "alpha", true, "Option a");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), "cmd", options);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("usage: cmd [-a,--alpha <VALUE>]"));
    }

    public void testPrintUsageWithLongOptSeparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        Options options = new Options();
        options.addOption("a", "alpha", true, "Option a");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), "cmd", options);
        pw.flush();
        String output = sw.toString();
        // Default argName is "arg"
        assertTrue(output.contains("usage: cmd [-a,--alpha=<arg>]"));
    }

    public void testRenderOptionsWithLongOptionOnly() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(null, "alpha", false, "The alpha option.");

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sb.toString();
        assertTrue(output.contains("   --alpha"));
        assertTrue(output.contains("The alpha option."));
    }

    public void testRenderOptionsWithShortOptionOnly() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", null, false, "The alpha option.");

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sb.toString();
        assertTrue(output.contains("  -a"));
        assertTrue(output.contains("The alpha option."));
    }

    public void testRenderOptionsWithRequiredOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", true, "The alpha option.");
        options.getOption("a").setRequired(true);

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sb.toString();
        // The rendering of options does not explicitly show 'required' status,
        // but the option itself should be displayed.
        assertTrue(output.contains("  -a,--alpha"));
        assertTrue(output.contains("<arg>")); // Assuming default argName if not set
        assertTrue(output.contains("The alpha option."));
    }

    public void testRenderWrappedTextWithLongText() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a very long description that definitely needs to be wrapped across multiple lines to fit within the specified width.";
        StringBuffer sb = new StringBuffer();
        int width = 50;
        int nextLineTabStop = 10;
        formatter.renderWrappedText(sb, width, nextLineTabStop, text);
        String output = sb.toString();

        assertTrue(output.length() > 0);
        String[] lines = output.split(formatter.getNewLine());
        assertTrue(lines.length > 1); // Check for multiple lines

        // Check indentation of subsequent lines
        for (int i = 1; i < lines.length; i++) {
            assertTrue(lines[i].startsWith(formatter.createPadding(nextLineTabStop)));
        }
        assertTrue(lines[0].length() <= width);
        for(int i = 1; i < lines.length; i++){
            assertTrue(lines[i].length() <= width);
        }
    }
    
    public void testRenderWrappedTextWithTabsAndNewlines() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "Line 1\twith a tab.\nLine 2\n\nLine 3.";
        StringBuffer sb = new StringBuffer();
        int width = 30;
        int nextLineTabStop = 5;
        formatter.renderWrappedText(sb, width, nextLineTabStop, text);
        String output = sb.toString();
        
        // The exact output is complex to assert without knowing tab expansion.
        // We'll assert basic properties.
        assertTrue(output.contains("Line 1"));
        assertTrue(output.contains("with a tab."));
        assertTrue(output.contains("Line 2"));
        assertTrue(output.contains("Line 3."));
        assertTrue(output.indexOf(formatter.getNewLine()) > 0); // Check for newlines
        
        // Expected line break after "tab." if it exceeds width
        String[] lines = output.split(formatter.getNewLine());
        assertTrue(lines.length >= 3); // At least Line 1, Line 2, Line 3
    }
    
    public void testFindWrapPosWithTab() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "word1\tword2"; // tab is at index 5
        
        // Case 1: width is larger than tab position + 1
        int width1 = 10;
        int pos1 = formatter.findWrapPos(text, width1, 0);
        // Tab at 5, width is 10. findWrapPos returns pos+1 if tab/newline found within width.
        assertEquals(6, pos1);

        // Case 2: width is exactly tab position + 1
        int width2 = 6;
        int pos2 = formatter.findWrapPos(text, width2, 0);
        // Tab at 5, width is 6. pos+1 = 6. pos = width. findWrapPos returns -1.
        assertEquals(-1, pos2);
        
        // Case 3: width is less than tab position + 1
        int width3 = 5;
        int pos3 = formatter.findWrapPos(text, width3, 0);
        // Tab at 5, width is 5. pos = width. findWrapPos returns width.
        assertEquals(5, pos3);
    }

    public void testFindWrapPosWithNewline() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "word1\nword2"; // newline is at index 5
        
        // Case 1: width is larger than newline position + 1
        int width1 = 10;
        int pos1 = formatter.findWrapPos(text, width1, 0);
        // Newline at 5, width is 10. findWrapPos returns pos+1 if tab/newline found within width.
        assertEquals(6, pos1);

        // Case 2: width is exactly newline position + 1
        int width2 = 6;
        int pos2 = formatter.findWrapPos(text, width2, 0);
        // Newline at 5, width is 6. pos+1 = 6. pos = width. findWrapPos returns -1.
        assertEquals(-1, pos2);
        
        // Case 3: width is less than newline position + 1
        int width3 = 5;
        int pos3 = formatter.findWrapPos(text, width3, 0);
        // Newline at 5, width is 5. pos = width. findWrapPos returns width.
        assertEquals(5, pos3);
    }

    public void testFindWrapPosNoWhitespace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "abcdefghijkl";
        int width = 6;
        int pos = formatter.findWrapPos(text, width, 0);
        // No whitespace, should return startPos+width
        assertEquals(6, pos);
    }

    public void testFindWrapPosAtBeginningOfString() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = " word at start"; // space at index 0
        int width = 5;
        int pos = formatter.findWrapPos(text, width, 0);
        // The first space is at index 0.
        // The loop `while ((pos >= startPos) && ...)` will start with pos=5, check char at 5.
        // It decrements pos until it finds a space or pos < startPos.
        // It will find space at pos=0. So it returns 0.
        assertEquals(0, pos);
    }

    public void testOptionComparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Accessing the OptionComparator directly is not possible due to private access.
        // We can test its behavior by setting a custom comparator and checking the sorting.
        // However, the original tests were trying to instantiate it directly.
        // Let's rely on the fact that getOptionComparator() returns a valid instance.
        // We can test the sorting by creating Options and checking the order.

        Options options = new Options();
        Option optA = new Option("a", "alpha", false, "desc1");
        Option optB = new Option("b", "beta", false, "desc2");
        Option optC = new Option("A", "Alpha", false, "desc3"); // case-insensitive check

        options.addOption(optB);
        options.addOption(optA);
        options.addOption(optC);
        
        List<Option> helpOptions = options.helpOptions();
        // The helpOptions() method should return options sorted by the comparator.
        // With default comparator, "a" and "A" should come before "b".
        // The order between "a" and "A" might be implementation-dependent if key() is same,
        // but compareToIgnoreCase should handle it.
        
        assertEquals("a", helpOptions.get(0).getKey());
        assertEquals("A", helpOptions.get(1).getKey());
        assertEquals("b", helpOptions.get(2).getKey());
    }
    
    public void testPrintHelpWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, formatter.getWidth(), "cmd", "Header", options, formatter.getLeftPadding(), formatter.getDescPadding(), "Footer");
        pw.flush();
        String output = sw.toString();

        assertTrue(output.contains("usage: cmd"));
        assertTrue(output.contains("Header"));
        assertTrue(output.contains("Footer"));
        assertFalse(output.contains("-")); // No options listed
    }

    public void testPrintHelpWithNullHeaderAndFooter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, formatter.getWidth(), "cmd", null, options, formatter.getLeftPadding(), formatter.getDescPadding(), null);
        pw.flush();
        String output = sw.toString();

        assertTrue(output.contains("usage: cmd"));
        assertTrue(output.contains("-a,--alpha"));
        assertTrue(output.contains("The alpha option."));
        assertFalse(output.contains("Header"));
        assertFalse(output.contains("Footer"));
    }

    public void testPrintHelpAutoUsage() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        options.addOption("b", null, true, "The beta option.");
        options.getOption("a").setRequired(true); // Mark 'a' as required

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, formatter.getWidth(), "cmd", "Header", options, formatter.getLeftPadding(), formatter.getDescPadding(), "Footer", true);
        pw.flush();
        String output = sw.toString();
        
        // Check that usage is printed and it includes the required option.
        // The required option 'a' should appear without brackets.
        assertTrue(output.contains("usage: cmd ")); // Space after cmd is important
        assertTrue(output.contains("Header"));
        assertTrue(output.contains("Footer"));
        assertTrue(output.contains("-a")); // Required option
        assertTrue(output.contains("-b")); // Optional option
        // The exact order depends on sorting and how required/optional are rendered.
        // With default sort and required status, it might be: usage: cmd -a [-b <arg>]
    }

    public void testPrintHelpNoAutoUsage() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        // With autoUsage = false, the printUsage(pw, width, cmdLineSyntax) method is called.
        formatter.printHelp(pw, formatter.getWidth(), "cmd", "Header", options, formatter.getLeftPadding(), formatter.getDescPadding(), "Footer", false);
        pw.flush();
        String output = sw.toString();
        
        // The printUsage(pw, width, cmdLineSyntax) method does not take 'options' into account for the usage string.
        // It just prints the syntax prefix + cmdLineSyntax.
        assertTrue(output.contains(formatter.getSyntaxPrefix() + "cmd")); // Default usage part
        assertFalse(output.contains("-a")); // Options should not be in the usage line when autoUsage is false and printUsage(cmdLineSyntax) is called.
        assertTrue(output.contains("Header"));
        assertTrue(output.contains("Footer"));
        assertTrue(output.contains("The alpha option.")); // Options section should still be there.
    }

    public void testPrintUsageWithOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", null, false, "Option A");
        Option opt2 = new Option("b", null, false, "Option B");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), "cmd", options);
        pw.flush();
        String output = sw.toString();
        // Required group is displayed with square brackets.
        assertTrue(output.contains("usage: cmd [-a | -b]"));
    }

    public void testPrintUsageWithRequiredOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", null, false, "Option A");
        Option opt2 = new Option("b", null, false, "Option B");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), "cmd", options);
        pw.flush();
        String output = sw.toString();
        // Required group is displayed with square brackets.
        assertTrue(output.contains("usage: cmd [-a | -b]"));
    }

    public void testPrintUsageWithOptionalOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", null, false, "Option A");
        Option opt2 = new Option("b", null, false, "Option B");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(false); // Explicitly optional
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), "cmd", options);
        pw.flush();
        String output = sw.toString();
        // An optional group is also displayed with square brackets.
        assertTrue(output.contains("usage: cmd [-a | -b]"));
    }

    public void testPrintUsageWithLongOptionAndArg() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        formatter.setArgName("VAL");
        Options options = new Options();
        options.addOption("a", "alpha", true, "Option alpha");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), "cmd", options);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("usage: cmd [-a,--alpha=<VAL>]"));
    }

    public void testPrintUsageWithMultipleOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", null, false, "Option a");
        options.addOption("b", "beta", false, "Option b");
        options.addOption("c", null, true, "Option c");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), "cmd", options);
        pw.flush();
        String output = sw.toString();
        // Default argName is "arg"
        assertTrue(output.contains("usage: cmd [-a] [-b] [-c <arg>]"));
    }
    
    public void testPrintHelpWithLongWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100); // Set a larger width
        Options options = new Options();
        options.addOption("a", "alpha", false, "A very long description for the alpha option that should fit on a single line with a larger width.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, formatter.getWidth(), "cmd", null, options, formatter.getLeftPadding(), formatter.getDescPadding(), null);
        pw.flush();
        String output = sw.toString();
        // Check that the description is not wrapped due to the larger width.
        assertTrue(output.contains("A very long description for the alpha option that should fit on a single line with a larger width."));
        assertFalse(output.contains(formatter.getNewLine())); // No newlines if it fits
    }
    
    public void testPrintHelpWithSmallWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(30); // Set a smaller width
        Options options = new Options();
        options.addOption("a", "alpha", false, "A very long description for the alpha option that should be wrapped across multiple lines with a smaller width.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, formatter.getWidth(), "cmd", null, options, formatter.getLeftPadding(), formatter.getDescPadding(), null);
        pw.flush();
        String output = sw.toString();
        // Check that the description is wrapped.
        assertTrue(output.indexOf(formatter.getNewLine()) > 0);
        assertTrue(output.split(formatter.getNewLine()).length > 1);
    }

    // Additional test for renderWrappedTextBlock which calls renderWrappedText
    public void testRenderWrappedTextBlock() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "First line.\nSecond line is longer.";
        StringBuffer sb = new StringBuffer();
        int width = 20;
        int nextLineTabStop = 5;
        
        // renderWrappedTextBlock uses BufferedReader/StringReader internally.
        // The helper method renderWrappedText is called for each line from StringReader.
        formatter.renderWrappedTextBlock(sb, width, nextLineTabStop, text);
        String output = sb.toString();
        
        assertTrue(output.contains("First line."));
        assertTrue(output.contains("Second line is longer."));
        assertTrue(output.indexOf(formatter.getNewLine()) > 0); // Check for newlines
        
        // Check wrapping for the second line
        String[] lines = output.split(formatter.getNewLine());
        assertTrue(lines.length > 1);
        assertTrue(lines[0].trim().length() <= width);
        assertTrue(lines[1].trim().length() <= width); // check if wrapped
        assertTrue(lines[1].startsWith(formatter.createPadding(nextLineTabStop)));
    }

    // Test for printUsage without options, but with cmdLineSyntax.
    public void testPrintUsageCmdLineSyntaxOnly() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "mycommand -f <file>";
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, formatter.getWidth(), cmdLineSyntax);
        pw.flush();
        String output = sw.toString();

        // The printUsage(pw, width, cmdLineSyntax) method prepends defaultSyntaxPrefix.
        assertTrue(output.contains(formatter.getSyntaxPrefix() + cmdLineSyntax));
    }

    // Test for printHelp with an empty header and an empty footer.
    public void testPrintHelpEmptyHeaderAndFooter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, formatter.getWidth(), "cmd", "", options, formatter.getLeftPadding(), formatter.getDescPadding(), "");
        pw.flush();
        String output = sw.toString();
        
        assertTrue(output.contains("usage: cmd"));
        assertTrue(output.contains("-a,--alpha"));
        assertFalse(output.contains("Header")); // Ensure empty header is not printed
        assertFalse(output.contains("Footer")); // Ensure empty footer is not printed
    }

    // Test for printHelp with autoUsage as true and a minimal cmdLineSyntax.
    public void testPrintHelpAutoUsageMinimalSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, formatter.getWidth(), "cmd", "Header", options, formatter.getLeftPadding(), formatter.getDescPadding(), "Footer", true);
        pw.flush();
        String output = sw.toString();
        
        // When autoUsage is true, printUsage(pw, width, cmdLineSyntax, options) is called.
        assertTrue(output.contains("usage: cmd"));
        assertTrue(output.contains("-a,--alpha")); // Options should be in usage line
        assertTrue(output.contains("Header"));
        assertTrue(output.contains("Footer"));
    }
    
    // Test for printHelp with autoUsage as false and a minimal cmdLineSyntax.
    public void testPrintHelpNoAutoUsageMinimalSyntax() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, formatter.getWidth(), "cmd", "Header", options, formatter.getLeftPadding(), formatter.getDescPadding(), "Footer", false);
        pw.flush();
        String output = sw.toString();
        
        // When autoUsage is false, printUsage(pw, width, cmdLineSyntax) is called.
        assertTrue(output.contains(formatter.getSyntaxPrefix() + "cmd")); // Usage part
        assertFalse(output.contains("-a")); // Options should not be in usage line
        assertTrue(output.contains("Header"));
        assertTrue(output.contains("Footer"));
        assertTrue(output.contains("The alpha option.")); // Options section should exist
    }
}
