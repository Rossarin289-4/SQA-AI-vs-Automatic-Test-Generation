package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.io.StringWriter;

public class HelpFormatterTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testDefaultWidth() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    public void testSetWidth() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    public void testDefaultLeftPadding() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
    }

    public void testSetLeftPadding() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    public void testDefaultDescPadding() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
    }

    public void testSetDescPadding() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());
    }

    public void testDefaultSyntaxPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
    }

    public void testSetSyntaxPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("Usage: ");
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
    }

    public void testDefaultNewLine() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
    }

    public void testSetNewLine() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    public void testDefaultOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
    }

    public void testSetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
    }

    public void testDefaultLongOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
    }

    public void testSetLongOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("--");
        assertEquals("--", formatter.getLongOptPrefix());
    }

    public void testDefaultArgName() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
    }

    public void testSetArgName() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("val");
        assertEquals("val", formatter.getArgName());
    }

    public void testDefaultOptionComparator() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();
        assertNotNull(comparator);
        // The actual implementation of OptionComparator is private, but we can test its behavior through setOptionComparator.
        // If it's not null, it's the default.
    }

    public void testSetOptionComparator() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator customComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0; // Always equal
            }
        };
        formatter.setOptionComparator(customComparator);
        assertEquals(customComparator, formatter.getOptionComparator());
    }

    public void testSetOptionComparatorToNull() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptionComparator(null);
        // When null is passed, it should reset to a new OptionComparator.
        assertNotNull(formatter.getOptionComparator());
        // We can't assert instanceof a private class, but we know it's not null and the logic should have reset it.
    }

    public void testPrintUsageWithNoOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        assertEquals("usage: app" + formatter.getNewLine(), sw.toString()); // Removed space after app
    }

    public void testPrintUsageWithSimpleOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Description A");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        assertEquals("usage: app [-a]" + formatter.getNewLine(), sw.toString()); // Removed space before -a
    }

    public void testPrintUsageWithRequiredOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("r", "required", true, "Required Option");
        option.setRequired(true);
        options.addOption(option);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        // The argument name defaults to "arg" if not set.
        assertEquals("usage: app -r <arg>" + formatter.getNewLine(), sw.toString());
    }

    public void testPrintUsageWithOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "optionA", false, "Description A"));
        group.addOption(new Option("b", "optionB", false, "Description B"));
        group.setRequired(true);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        assertEquals("usage: app [-a | -b]" + formatter.getNewLine(), sw.toString());
    }

    public void testPrintUsageWithOptionGroupNotRequired() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "optionA", false, "Description A"));
        group.addOption(new Option("b", "optionB", false, "Description B"));
        options.addOptionGroup(group); // Not required by default

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        assertEquals("usage: app [-a | -b]" + formatter.getNewLine(), sw.toString());
    }

    public void testPrintOptionsWithNoOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        assertEquals("", sw.toString());
    }

    public void testPrintOptionsWithSimpleOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Description A");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sw.toString();
        assertTrue(output.contains("-a,--optionA"));
        assertTrue(output.contains("Description A"));
    }

    public void testPrintOptionsWithWrappedDescription() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String longDescription = "This is a very long description for the option that should wrap to multiple lines within the specified width.";
        options.addOption("l", "longopt", false, longDescription);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 40, options, formatter.getLeftPadding(), formatter.getDescPadding()); // Smaller width to force wrapping
        String output = sw.toString();

        assertTrue(output.contains("-l,--longopt"));
        // The description wraps. The exact content depends on the wrapping logic.
        // We check if the start and end of the description are present and if wrapping occurred.
        assertTrue(output.contains("This is a very long description"));
        assertTrue(output.contains("for the option that should wrap"));
        assertTrue(output.contains("to multiple lines within the specified width."));
    }

    public void testPrintWrappedBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a simple string that should be wrapped.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, HelpFormatter.DEFAULT_WIDTH, text);
        assertEquals(text + formatter.getNewLine(), sw.toString());
    }

    public void testPrintWrappedWithLongText() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String longText = "This is a very long string that needs to be wrapped across multiple lines to fit within the specified width. It should break at appropriate spaces.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 40, longText); // Smaller width to force wrapping
        String output = sw.toString();

        assertTrue(output.contains("This is a very long string that needs to be"));
        assertTrue(output.contains("wrapped across multiple lines to fit within"));
        assertTrue(output.contains("the specified width. It should break at"));
        assertTrue(output.contains("appropriate spaces."));
    }

    public void testPrintWrappedWithTab() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String textWithTab = "Line1:\tIndented content.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        // The third argument in printWrapped is nextLineTabStop. Tabs are handled by renderWrappedText.
        // The default tab stop is not explicitly set here, but the findWrapPos method handles tabs.
        // The actual rendering of tabs depends on the PrintWriter, but the logic of breaking should work.
        formatter.printWrapped(pw, HelpFormatter.DEFAULT_WIDTH, 0, textWithTab); // nextLineTabStop = 0 for default behavior
        String output = sw.toString();
        // Checking for the presence of text, assuming basic tab handling in rendering.
        assertTrue(output.contains("Line1:\tIndented content.")); // Expecting raw tab if not expanded by PrintWriter
    }

    public void testPrintWrappedWithNewLineCharacters() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String textWithNewlines = "First line.\nSecond line.\nThird line.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, HelpFormatter.DEFAULT_WIDTH, textWithNewlines);
        assertEquals("First line." + formatter.getNewLine() + "Second line." + formatter.getNewLine() + "Third line." + formatter.getNewLine(), sw.toString());
    }

    public void testRenderOptionsWithNullDescription() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, null); // Null description
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sw.toString();
        assertTrue(output.contains("-a,--optionA"));
        assertFalse(output.contains("null")); // Should not print "null"
    }
    
    public void testRenderOptionsWithLongOptionKey() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "verylongoptionkey", false, "Description A");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sw.toString();
        assertTrue(output.contains("-a,--verylongoptionkey"));
        assertTrue(output.contains("Description A"));
    }

    public void testRenderOptionsWithShortOptionKeyOnly() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("s", null, false, "Short option only");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sw.toString();
        assertTrue(output.contains("-s"));
        assertFalse(output.contains("--")); // Ensure no long opt prefix is added if not present
        assertTrue(output.contains("Short option only"));
    }

    public void testRenderOptionsWithLongOptionKeyOnly() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(null, "longonly", false, "Long option only");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sw.toString();
        assertTrue(output.contains("--longonly"));
        assertFalse(output.contains("-")); // Ensure no short opt prefix is added if not present
        assertTrue(output.contains("Long option only"));
    }

    public void testRenderWrappedTextEmptyString() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, HelpFormatter.DEFAULT_WIDTH, "");
        assertEquals(formatter.getNewLine(), sw.toString()); // Empty string results in just a newline
    }

    public void testRenderWrappedTextSingleWord() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, HelpFormatter.DEFAULT_WIDTH, "word");
        assertEquals("word" + formatter.getNewLine(), sw.toString());
    }

    public void testRenderWrappedTextLongSingleWord() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String longWord = "supercalifragilisticexpialidocious";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        int width = 10;
        formatter.printWrapped(pw, width, longWord); // Width smaller than word
        // The findWrapPos method, when it can't find a space, searches forward and returns the position.
        // If it's past the width, it continues to search.
        // If the word is longer than width and no space is found, it breaks at 'width'.
        assertEquals(longWord.substring(0, width) + formatter.getNewLine() + longWord.substring(width) + formatter.getNewLine(), sw.toString());
    }
    
    public void testFindWrapPosAtEnd() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "short line";
        assertEquals(-1, formatter.findWrapPos(text, HelpFormatter.DEFAULT_WIDTH, 0));
    }

    public void testFindWrapPosInMiddle() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "this is a moderately long line";
        int width = 15;
        // The last space before or at index 15 is at index 14.
        assertEquals(14, formatter.findWrapPos(text, width, 0));
    }

    public void testFindWrapPosWithNewline() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "first line\nsecond line";
        int width = 10;
        // '\n' is at index 10. The method returns the index of the newline + 1.
        assertEquals(11, formatter.findWrapPos(text, width, 0));
    }

    public void testFindWrapPosWithTab() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "first line\tsecond line";
        int width = 10;
        // '\t' is at index 10. The method returns the index of the tab + 1.
        assertEquals(11, formatter.findWrapPos(text, width, 0));
    }

    public void testFindWrapPosWhenNoSpace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "thisisalongwordwithoutspaces";
        int width = 10;
        // No whitespace found. It searches forward from width+1. Since the end is reached, it returns -1.
        assertEquals(-1, formatter.findWrapPos(text, width, 0));
    }

    public void testCreatePadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.createPadding(0));
        assertEquals(" ", formatter.createPadding(1));
        assertEquals("   ", formatter.createPadding(3));
    }

    public void testRtrimEmptyString() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.rtrim(""));
    }

    public void testRtrimNullString() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertNull(formatter.rtrim(null));
    }

    public void testRtrimNoWhitespace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("hello", formatter.rtrim("hello"));
    }

    public void testRtrimWithWhitespace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("hello", formatter.rtrim("hello   "));
    }

    public void testRtrimOnlyWhitespace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.rtrim("   "));
    }

    public void testOptionComparatorSimple() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();
        Option opt1 = new Option("a", "alpha", false, "desc");
        Option opt2 = new Option("b", "beta", false, "desc");
        assertTrue(comparator.compare(opt1, opt2) < 0);
    }

    public void testOptionComparatorIgnoreCase() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();
        Option opt1 = new Option("A", "alpha", false, "desc");
        Option opt2 = new Option("b", "beta", false, "desc");
        assertTrue(comparator.compare(opt1, opt2) < 0);
    }

    public void testOptionComparatorEqual() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();
        Option opt1 = new Option("a", "alpha", false, "desc");
        Option opt2 = new Option("a", "alpha", false, "desc");
        assertEquals(0, comparator.compare(opt1, opt2));
    }
    
    public void testPrintUsageWithArgumentName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("f", "file", true, "Input file");
        opt.setArgName("FILE");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        // The appendOption method wraps optional arguments in brackets.
        // The argument name is appended.
        assertEquals("usage: app [-f <FILE>]" + formatter.getNewLine(), sw.toString());
    }

    public void testPrintUsageWithLongArgumentName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("f", "file", true, "Input file");
        opt.setArgName("THE_INPUT_FILE_NAME");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        assertEquals("usage: app [-f <THE_INPUT_FILE_NAME>]" + formatter.getNewLine(), sw.toString());
    }
    
    public void testRenderOptionsWithArgAndArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("a", "argOpt", true, "An option with an argument.");
        opt.setArgName("VALUE");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sw.toString();
        assertTrue(output.contains("-a,--argOpt <VALUE>"));
        assertTrue(output.contains("An option with an argument."));
    }

    public void testRenderOptionsWithArgNoArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("b", "noArgNameOpt", true, "An option with an argument but no name.");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sw.toString();
        assertTrue(output.contains("-b,--noArgNameOpt ")); // Note the space after opt
        assertTrue(output.contains("An option with an argument but no name."));
    }

    public void testRenderOptionsWithHasArgsTrue() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("c", "multiArgOpt", true, "An option with multiple arguments.");
        opt.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sw.toString();
        assertTrue(output.contains("-c,--multiArgOpt"));
        assertTrue(output.contains("An option with multiple arguments."));
    }

    public void testRenderOptionsWithHasArgsInt() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("d", "twoArgsOpt", true, "An option with two arguments.");
        opt.setArgs(2);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sw.toString();
        assertTrue(output.contains("-d,--twoArgsOpt"));
        assertTrue(output.contains("An option with two arguments."));
    }

    public void testRenderOptionsWithOptionalArg() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("o", "optionalOpt", true, "An option with an optional argument.");
        opt.setOptionalArg(true);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.getLeftPadding(), formatter.getDescPadding());
        String output = sw.toString();
        assertTrue(output.contains("-o,--optionalOpt"));
        assertTrue(output.contains("An option with an optional argument."));
    }
}
