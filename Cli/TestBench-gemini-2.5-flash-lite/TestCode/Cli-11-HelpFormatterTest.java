package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class HelpFormatterTest extends TestCase {

    public void testDefaultWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default width is not 74", HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    public void testSetWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        assertEquals("Width not set to 100", 100, formatter.getWidth());
    }

    public void testDefaultLeftPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default left padding is not 1", HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
    }

    public void testSetLeftPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(5);
        assertEquals("Left padding not set to 5", 5, formatter.getLeftPadding());
    }

    public void testDefaultDescPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default description padding is not 3", HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
    }

    public void testSetDescPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        assertEquals("Description padding not set to 10", 10, formatter.getDescPadding());
    }

    public void testDefaultSyntaxPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default syntax prefix is not 'usage: '", HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
    }

    public void testSetSyntaxPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("usage:");
        assertEquals("Syntax prefix not set to 'usage:'", "usage:", formatter.getSyntaxPrefix());
    }

    public void testDefaultNewLine() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default new line is not system default", System.getProperty("line.separator"), formatter.getNewLine());
    }

    public void testSetNewLine() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("\n");
        assertEquals("New line not set to '\\n'", "\n", formatter.getNewLine());
    }

    public void testDefaultOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default option prefix is not '-'", HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
    }

    public void testSetOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("+");
        assertEquals("Option prefix not set to '+'", "+", formatter.getOptPrefix());
    }

    public void testDefaultLongOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default long option prefix is not '--'", HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
    }

    public void testSetLongOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("---");
        assertEquals("Long option prefix not set to '---'", "---", formatter.getLongOptPrefix());
    }

    public void testDefaultArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default argument name is not 'arg'", HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
    }

    public void testSetArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("value");
        assertEquals("Argument name not set to 'value'", "value", formatter.getArgName());
    }

    public void testDefaultOptionComparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();
        assertNotNull("Option comparator should not be null", comparator);
        assertTrue("Default comparator is not a Comparator", comparator instanceof Comparator);
    }

    public void testSetOptionComparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator customComparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0; // Always equal
            }
        };
        formatter.setOptionComparator(customComparator);
        assertEquals("Custom comparator not set", customComparator, formatter.getOptionComparator());
    }

    public void testSetNullOptionComparatorResetsToDefault() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator defaultComparator = formatter.getOptionComparator();
        formatter.setOptionComparator(null);
        assertNotSame("Setting null comparator did not reset to default", defaultComparator, formatter.getOptionComparator());
        assertTrue("Setting null comparator did not reset to a Comparator", formatter.getOptionComparator() instanceof Comparator);
    }

    public void testPrintHelpWithNullOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "myapp";
        Options options = null;
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        // The printHelp method expects options to be non-null, but will print usage if it is null.
        // Based on the source code, it will print usage and then proceed.
        // Let's assert that it doesn't throw an NPE.
        formatter.printHelp(pw, formatter.getWidth(), cmdLineSyntax, null, options, formatter.getLeftPadding(), formatter.getDescPadding(), null, false);
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should not be empty", output.length() > 0);
        assertTrue("Output should contain syntax", output.contains(cmdLineSyntax));
    }

    public void testPrintHelpWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "myapp";
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printHelp(pw, formatter.getWidth(), cmdLineSyntax, null, options, formatter.getLeftPadding(), formatter.getDescPadding(), null, false);
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should not be empty", output.length() > 0);
        assertTrue("Output should contain syntax", output.contains(cmdLineSyntax));
    }

    public void testPrintHelpWithHeaderAndFooter() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "myapp";
        Options options = new Options();
        String header = "This is a header.";
        String footer = "This is a footer.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printHelp(pw, formatter.getWidth(), cmdLineSyntax, header, options, formatter.getLeftPadding(), formatter.getDescPadding(), footer, false);
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should contain header", output.contains(header));
        assertTrue("Output should contain footer", output.contains(footer));
        assertTrue("Output should contain syntax", output.contains(cmdLineSyntax));
    }

    public void testPrintHelpWithAutoUsage() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "myapp";
        Options options = new Options();
        options.addOption("f", "file", false, "A file option.");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printHelp(pw, formatter.getWidth(), cmdLineSyntax, null, options, formatter.getLeftPadding(), formatter.getDescPadding(), null, true);
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should contain usage", output.contains("usage:"));
        assertTrue("Output should contain option '-f'", output.contains("-f"));
    }

    public void testPrintUsageWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String app = "myapp";
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, formatter.getWidth(), app, options);
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should contain default syntax prefix", output.contains(formatter.getSyntaxPrefix()));
        assertTrue("Output should contain app name", output.contains(app));
    }

    public void testPrintUsageWithSingleOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String app = "myapp";
        Options options = new Options();
        options.addOption("f", "file", false, "A file option.");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, formatter.getWidth(), app, options);
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should contain option '-f'", output.contains("-f"));
    }

    public void testPrintUsageWithRequiredOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String app = "myapp";
        Options options = new Options();
        Option requiredOpt = new Option("r", "required", false, "A required option.");
        requiredOpt.setRequired(true);
        options.addOption(requiredOpt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, formatter.getWidth(), app, options);
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should contain required option '-r'", output.contains("-r"));
    }

    public void testPrintUsageWithOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String app = "myapp";
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "Option A"));
        group.addOption(new Option("b", "beta", false, "Option B"));
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, formatter.getWidth(), app, options);
        pw.flush();
        String output = sw.toString();
        // The default behavior is to show options separated by " | " within the group.
        // The comparator sorts them alphabetically.
        assertTrue("Output should contain group options", output.contains("-a | -b"));
    }

    public void testPrintUsageWithRequiredOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String app = "myapp";
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "Option A"));
        group.addOption(new Option("b", "beta", false, "Option B"));
        group.setRequired(true);
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, formatter.getWidth(), app, options);
        pw.flush();
        String output = sw.toString();
        // Required groups are wrapped in square brackets.
        assertTrue("Output should contain required group options", output.contains("[-a | -b]"));
    }

    public void testPrintUsageWithOptionAndOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String app = "myapp";
        Options options = new Options();
        options.addOption("o", "option", false, "A single option.");
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "Option A"));
        group.addOption(new Option("b", "beta", false, "Option B"));
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, formatter.getWidth(), app, options);
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should contain single option", output.contains("-o"));
        assertTrue("Output should contain group options", output.contains("-a | -b"));
    }

    public void testPrintOptionsWithNoOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        String output = sw.toString();
        assertTrue("Output for no options should be empty or whitespace", output.trim().isEmpty());
    }

    public void testPrintOptionsWithOneOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("o", "option", false, "A single option.");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should contain option -o", output.contains("-o"));
        assertTrue("Output should contain option description", output.contains("A single option."));
    }

    public void testPrintOptionsWithLongOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(null, "longopt", false, "A long option.");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should contain long option --longopt", output.contains("--longopt"));
    }

    public void testPrintOptionsWithOptionAndLongOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("s", "shortlong", false, "Short and long option.");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should contain short option -s", output.contains("-s"));
        assertTrue("Output should contain long option --shortlong", output.contains("--shortlong"));
    }

    public void testPrintOptionsWithOptionsHavingArgs() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("f", "file", true, "Specify a file.");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        String output = sw.toString();
        // The default argument name for options with hasArg() true is "arg".
        assertTrue("Output should contain argument placeholder <arg>", output.contains("<arg>"));
    }

    public void testPrintOptionsWithOptionsHavingArgsAndArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("f", "file", true, "Specify a file.");
        option.setArgName("PATH");
        options.addOption(option);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        String output = sw.toString();
        assertTrue("Output should contain custom arg name <PATH>", output.contains("<PATH>"));
    }

    public void testPrintWrappedBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a simple test string.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, formatter.getWidth(), text);
        pw.flush();
        String output = sw.toString();
        assertEquals("Wrapped text should match input for short string", text + formatter.getNewLine(), output);
    }

    public void testPrintWrappedLongText() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(30); // Shorter width for testing wrapping
        String text = "This is a very long test string that should be wrapped by the formatter.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, formatter.getWidth(), text);
        pw.flush();
        String output = sw.toString();
        assertTrue("Wrapped text should contain newlines", output.contains(formatter.getNewLine()));
        String[] lines = output.split(formatter.getNewLine());
        for (String line : lines) {
            assertTrue("Line '" + line + "' exceeds width " + formatter.getWidth(), line.length() <= formatter.getWidth());
        }
    }

    public void testPrintWrappedWithTabStop() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(30);
        int tabStop = 10;
        String text = "Initial part. Subsequent part.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, formatter.getWidth(), tabStop, text);
        pw.flush();
        String output = sw.toString();

        String expectedStart = "Initial part.";
        assertTrue("Output should start with initial part", output.startsWith(expectedStart));
        assertTrue("Output should contain newline after initial part", output.contains(formatter.getNewLine()));

        int newLineIndex = output.indexOf(formatter.getNewLine());
        String secondLine = output.substring(newLineIndex + formatter.getNewLine().length());
        assertTrue("Second line should start with tabStop spaces", secondLine.startsWith(formatter.createPadding(tabStop)));
        assertTrue("Second line should contain the rest of the text", secondLine.contains("Subsequent part."));
    }

    public void testRenderWrappedTextBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(74);
        String text = "This is a simple test string.";
        StringBuffer sb = new StringBuffer();

        formatter.renderWrappedText(sb, formatter.getWidth(), 0, text);
        assertEquals("Rendered text should match input for short string", text, sb.toString());
    }

    public void testRenderWrappedTextLong() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(30);
        String text = "This is a very long test string that should be wrapped by the formatter.";
        StringBuffer sb = new StringBuffer();

        formatter.renderWrappedText(sb, formatter.getWidth(), 0, text);
        String output = sb.toString();
        assertTrue("Rendered text should contain newlines", output.contains(formatter.getNewLine()));
        String[] lines = output.split(formatter.getNewLine());
        for (String line : lines) {
            assertTrue("Line '" + line + "' exceeds width " + formatter.getWidth(), line.length() <= formatter.getWidth());
        }
    }

    public void testRenderWrappedTextWithTabStop() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(30);
        int tabStop = 10;
        String text = "Initial part. Subsequent part.";
        StringBuffer sb = new StringBuffer();

        formatter.renderWrappedText(sb, formatter.getWidth(), tabStop, text);
        String output = sb.toString();

        String expectedStart = "Initial part.";
        assertTrue("Rendered text should start with initial part", output.startsWith(expectedStart));
        assertTrue("Rendered text should contain newline after initial part", output.contains(formatter.getNewLine()));

        int newLineIndex = output.indexOf(formatter.getNewLine());
        String secondLine = output.substring(newLineIndex + formatter.getNewLine().length());
        // The rendered text for the second line should start with the padding.
        assertTrue("Second line should start with tabStop spaces", secondLine.startsWith(formatter.createPadding(tabStop)));
        assertTrue("Second line should contain the rest of the text", secondLine.contains("Subsequent part."));
    }

    public void testFindWrapPosSimple() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a simple test string.";
        // With a width larger than the text, no wrapping should occur.
        assertEquals("Wrap pos should be -1 for short string", -1, formatter.findWrapPos(text, 100, 0));
    }

    public void testFindWrapPosAtWordBoundary() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(10);
        String text = "This is a test string.";
        // The text "This is a" is 9 characters. The next word "test" starts at index 10.
        // findWrapPos looks for a whitespace character before width+startPos.
        // The space before 'test' is at index 9.
        assertEquals("Wrap pos should be at end of 'a'", 9, formatter.findWrapPos(text, 10, 0));
    }

    public void testFindWrapPosAtNewline() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(10);
        String text = "First line\nSecond line.";
        // The newline character is at index 10. The method should return the position of the newline character + 1.
        // The source code `return pos+1;` indicates this.
        assertEquals("Wrap pos should be at newline", 11, formatter.findWrapPos(text, 10, 0));
    }

    public void testFindWrapPosAtTab() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(10);
        String text = "First line\tSecond line.";
        // The tab character is at index 10. The method should return the position of the tab character + 1.
        assertEquals("Wrap pos should be at tab", 11, formatter.findWrapPos(text, 10, 0));
    }

    public void testFindWrapPosLongWord() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(10);
        String text = "Supercalifragilisticexpialidocious";
        // The entire text is one word, and it's longer than the width.
        // The current implementation returns -1 in this case.
        assertEquals("Wrap pos should be -1 for single long word", -1, formatter.findWrapPos(text, 10, 0));
    }

    public void testFindWrapPosLongWordAndText() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(10);
        String text = "Word AnotherLongWord Here.";
        // "Word " is 5 chars. "AnotherLongWord" is longer than 10.
        // The algorithm looks for a space before index 10. The space is at index 4.
        assertEquals("Wrap pos should be at space after 'Word'", 4, formatter.findWrapPos(text, 10, 0));
    }

    public void testFindWrapPosWithPrecedingWrap() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(10);
        String text = "Line1 Line2 Line3";
        // First call: width=10. 'Line1 ' is 6 chars. 'Line2' starts at index 6. Space before 'Line2' is at index 5.
        assertEquals("First wrap position incorrect", 5, formatter.findWrapPos(text, 10, 0));
        // Second call: startPos=10. Text from index 10 is "Line2 Line3".
        // The space before 'Line3' is at index 15 in original string. Relative to startPos=10, it's index 5.
        // The findWrapPos logic for `while ((pos >= startPos) && ((c = text.charAt(pos)) != ' '))`
        // uses startPos.
        // pos = 10 + 10 = 20. This is out of bounds.
        // The loop `while ((pos >= startPos) && ((c = text.charAt(pos)) != ' ')` will fail if pos < startPos.
        // It seems the findWrapPos is buggy here.
        // Let's trace the code precisely:
        // findWrapPos(text, 10, 0):
        //   pos = text.indexOf('\n', 0) = -1
        //   pos = text.indexOf('\t', 0) = -1
        //   (0 + 10) = 10 < text.length() (17)
        //   pos = 10
        //   char at 10 is '2'. Not space, \n, \r. --pos. pos=9.
        //   char at 9 is ' '. Return pos (9). Correct.
        // findWrapPos(text, 10, 10): // This should wrap "Line2"
        //   startPos = 10
        //   pos = text.indexOf('\n', 10) = -1
        //   pos = text.indexOf('\t', 10) = -1
        //   (10 + 10) = 20 >= text.length() (17). Returns -1.
        // The current `renderWrappedText` calls `findWrapPos(text, width, 0)` and then `findWrapPos(text, width, 0)` again after adding padding.
        // The second call should be `findWrapPos(text, width, pos)` where `pos` is the previous wrap position.
        // The bug is in how findWrapPos is used in `renderWrappedText`.
        // For this test, let's assume the current behavior of findWrapPos.
        // With text "Line1 Line2 Line3", width=10:
        // First wrap: "Line1 " (6 chars). Next word "Line2" starts at index 6. Space before it is at index 5. So pos = 5.
        // The code should return 5.
        // The second wrap for "Line2 Line3" starting from index 10.
        // The second word is "Line3" starting at index 12. Space before it is at index 11.
        // So, findWrapPos(text, 10, 10) should return 11.
        assertEquals("First wrap position incorrect", 5, formatter.findWrapPos(text, 10, 0));
        assertEquals("Second wrap position incorrect", 11, formatter.findWrapPos(text, 10, 10));
    }

    public void testCreatePadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Padding of 0 should be empty string", "", formatter.createPadding(0));
        assertEquals("Padding of 5 should be 5 spaces", "     ", formatter.createPadding(5));
        assertEquals("Padding of 1 should be 1 space", " ", formatter.createPadding(1));
    }

    public void testRtrimEmpty() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Rtrim of empty string should be empty", "", formatter.rtrim(""));
    }

    public void testRtrimNull() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertNull("Rtrim of null should be null", formatter.rtrim(null));
    }

    public void testRtrimNoWhitespace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "no_whitespace";
        assertEquals("Rtrim of string with no trailing whitespace should be unchanged", text, formatter.rtrim(text));
    }

    public void testRtrimTrailingSpaces() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "trailing spaces   ";
        assertEquals("Rtrim did not remove trailing spaces", "trailing spaces", formatter.rtrim(text));
    }

    public void testRtrimTrailingTabsAndSpaces() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "mixed   \t ";
        assertEquals("Rtrim did not remove trailing mixed whitespace", "mixed", formatter.rtrim(text));
    }

    public void testRtrimAllSpaces() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "     ";
        assertEquals("Rtrim of only spaces should be empty", "", formatter.rtrim(text));
    }

    public void testOptionComparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();
        Option opt1 = new Option("a", "alpha", false, "desc1");
        Option opt2 = new Option("b", "beta", false, "desc2");
        Option opt3 = new Option("A", "ALPHA", false, "desc3");

        assertTrue("a should come before b", comparator.compare(opt1, opt2) < 0);
        assertTrue("b should come after a", comparator.compare(opt2, opt1) > 0);
        assertEquals("a should be equal to A (case-insensitive)", 0, comparator.compare(opt1, opt3));
    }

    public void testPrintUsageWithLongOptionValue() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String app = "myapp";
        Options options = new Options();
        // Option with a value, but no explicit arg name set.
        options.addOption("f", "file", true, "Specify a file.");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, formatter.getWidth(), app, options);
        pw.flush();
        String output = sw.toString();
        // The default arg name is "arg".
        assertTrue("Output should contain long option with default value placeholder <arg>", output.contains("--file <arg>"));
    }

    public void testPrintUsageWithOptionGroupAndLongOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String app = "myapp";
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "Option A"));
        group.addOption(new Option("b", "beta", false, "Option B"));
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, formatter.getWidth(), app, options);
        pw.flush();
        String output = sw.toString();
        // The comparator sorts options by key. 'a' comes before 'b'.
        assertTrue("Output should contain group options with long names", output.contains("--alpha | --beta"));
    }

    public void testPrintHelpSyntaxError() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        try {
            formatter.printHelp(pw, formatter.getWidth(), null, null, new Options(), formatter.getLeftPadding(), formatter.getDescPadding(), null, false);
            fail("Should throw IllegalArgumentException for null cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            // Expected exception
            assertEquals("Error message for null syntax not correct", "cmdLineSyntax not provided", e.getMessage());
        }

        try {
            formatter.printHelp(pw, formatter.getWidth(), "", null, new Options(), formatter.getLeftPadding(), formatter.getDescPadding(), null, false);
            fail("Should throw IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            // Expected exception
            assertEquals("Error message for empty syntax not correct", "cmdLineSyntax not provided", e.getMessage());
        }
    }

    public void testPrintOptionsWithMandatoryArgument() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("a", "arg", true, "Argument option");
        opt.setArgs(1); // Explicitly set to 1 arg
        options.addOption(opt);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        String output = sw.toString();
        // When hasArg() is true and setArgName() is not called, it defaults to "arg".
        assertTrue("Option with mandatory argument should show <arg>", output.contains("<arg>"));
    }
}
