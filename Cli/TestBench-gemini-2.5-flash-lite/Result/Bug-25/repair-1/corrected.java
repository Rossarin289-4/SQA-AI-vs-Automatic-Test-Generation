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
        assertTrue(comparator instanceof HelpFormatter.OptionComparator);
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
        assertTrue(formatter.getOptionComparator() instanceof HelpFormatter.OptionComparator);
    }

    public void testPrintHelpWithNullOptions() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        try {
            formatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, "usage", "header", null, "footer");
        } catch (IllegalArgumentException e) {
            // Expected if options is null and printOptions is called
            // The current implementation might not throw here if options is null.
            // Let's assert based on expected behavior of printOptions with null.
        }
        String output = sw.toString();
        assertTrue(output.contains("usage"));
        assertTrue(output.contains("header"));
        assertTrue(output.contains("footer"));
        // Check that no options section is printed
        assertFalse(output.contains("OPTIONS"));
    }

    public void testPrintHelpWithEmptyOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, "usage", "header", options, "footer");
        String output = sw.toString();
        assertTrue(output.contains("usage"));
        assertTrue(output.contains("header"));
        assertTrue(output.contains("footer"));
        assertFalse(output.contains("OPTIONS"));
    }

    public void testPrintHelpWithSimpleOption() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Description A");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, "usage", "header", options, "footer");
        String output = sw.toString();
        assertTrue(output.contains("-a,--optionA"));
        assertTrue(output.contains("Description A"));
    }

    public void testPrintHelpWithRequiredOption() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("r", "required", true, "Required Option");
        ((Option)options.getOption("r")).setRequired(true);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, "usage", "header", options, "footer");
        String output = sw.toString();
        assertTrue(output.contains("-r,--required"));
        assertTrue(output.contains("Required Option"));
    }
    
    public void testPrintHelpWithOptionGroup() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "optionA", false, "Description A"));
        group.addOption(new Option("b", "optionB", false, "Description B"));
        group.setRequired(true);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, "usage", null, options, null);
        String output = sw.toString();
        assertTrue(output.contains("usage"));
        assertTrue(output.contains("[-a | -b]"));
    }

    public void testPrintHelpWithOptionGroupNotRequired() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "optionA", false, "Description A"));
        group.addOption(new Option("b", "optionB", false, "Description B"));
        options.addOptionGroup(group); // Not required by default

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, "usage", null, options, null);
        String output = sw.toString();
        assertTrue(output.contains("usage"));
        assertTrue(output.contains("[-a | -b]"));
    }
    
    public void testPrintHelpWithEmptyHeaderAndFooter() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Description A");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, "usage", "", options, "");
        String output = sw.toString();
        assertTrue(output.contains("usage"));
        assertFalse(output.contains("Description A")); // No header/footer means options are printed directly
    }

    public void testPrintHelpWithLongHeaderAndFooter() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Description A");
        String longHeader = "This is a very long header that should be wrapped around to multiple lines according to the default width.";
        String longFooter = "This is a very long footer that should also be wrapped around to multiple lines.";

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, "usage", longHeader, options, longFooter);
        String output = sw.toString();

        assertTrue(output.contains("usage"));
        assertTrue(output.contains("-a,--optionA"));
        assertTrue(output.contains("Description A"));
        assertTrue(output.contains("This is a very long header that should be wrapped around to multiple lines"));
        assertTrue(output.contains("according to the default width."));
        assertTrue(output.contains("This is a very long footer that should also be wrapped around to multiple lines."));
    }

    public void testPrintHelpAutoUsage() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Description A");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, "usage", "header", options, "footer", true);
        String output = sw.toString();

        assertTrue(output.contains("usage"));
        assertTrue(output.contains("header"));
        assertTrue(output.contains("-a,--optionA"));
        assertTrue(output.contains("Description A"));
        assertTrue(output.contains("footer"));
        assertTrue(output.startsWith("usage: usage")); // Check auto usage is printed
    }

    public void testPrintHelpNoAutoUsage() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Description A");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, "usage", "header", options, "footer", false);
        String output = sw.toString();

        assertTrue(output.contains("usage"));
        assertTrue(output.contains("header"));
        assertTrue(output.contains("-a,--optionA"));
        assertTrue(output.contains("Description A"));
        assertTrue(output.contains("footer"));
        assertFalse(output.startsWith("usage: usage")); // Check auto usage is not printed
    }

    public void testPrintUsageWithNoOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        assertEquals("usage: app" + formatter.getNewLine(), sw.toString());
    }

    public void testPrintUsageWithSimpleOption() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Description A");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        assertEquals("usage: app [-a]" + formatter.getNewLine(), sw.toString());
    }

    public void testPrintUsageWithRequiredOption() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("r", "required", true, "Required Option");
        option.setRequired(true);
        options.addOption(option);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        assertEquals("usage: app -r <arg>" + formatter.getNewLine(), sw.toString());
    }

    public void testPrintUsageWithOptionGroup() {
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

    public void testPrintUsageWithOptionGroupNotRequired() {
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

    public void testPrintOptionsWithNoOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        assertEquals("", sw.toString());
    }

    public void testPrintOptionsWithSimpleOption() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, "Description A");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        String output = sw.toString();
        assertTrue(output.contains("-a,--optionA"));
        assertTrue(output.contains("Description A"));
    }

    public void testPrintOptionsWithWrappedDescription() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String longDescription = "This is a very long description for the option that should wrap to multiple lines within the specified width.";
        options.addOption("l", "longopt", false, longDescription);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 40, options, formatter.defaultLeftPad, formatter.defaultDescPad); // Smaller width to force wrapping
        String output = sw.toString();

        assertTrue(output.contains("-l,--longopt"));
        assertTrue(output.contains("This is a very long description for the option that should wrap"));
        assertTrue(output.contains("to multiple lines within the specified width."));
    }

    public void testPrintWrappedBasic() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a simple string that should be wrapped.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, HelpFormatter.DEFAULT_WIDTH, text);
        assertEquals(text + formatter.getNewLine(), sw.toString());
    }

    public void testPrintWrappedWithLongText() {
        HelpFormatter formatter = new HelpFormatter();
        String longText = "This is a very long string that needs to be wrapped across multiple lines to fit within the specified width. It should break at appropriate spaces.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 40, longText); // Smaller width to force wrapping
        String output = sw.toString();

        assertTrue(output.contains("This is a very long string that needs to be wrapped"));
        assertTrue(output.contains("across multiple lines to fit within the specified width."));
        assertTrue(output.contains("It should break at appropriate spaces."));
    }

    public void testPrintWrappedWithTab() {
        HelpFormatter formatter = new HelpFormatter();
        String textWithTab = "Line1:\tIndented content.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, HelpFormatter.DEFAULT_WIDTH, 5, textWithTab); // Explicitly set tab stop
        String output = sw.toString();

        assertTrue(output.contains("Line1:"));
        assertTrue(output.contains("    Indented content.")); // Assuming default tab expansion to 4 spaces + 1 for the tab itself
    }

    public void testPrintWrappedWithNewLineCharacters() {
        HelpFormatter formatter = new HelpFormatter();
        String textWithNewlines = "First line.\nSecond line.\nThird line.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, HelpFormatter.DEFAULT_WIDTH, textWithNewlines);
        assertEquals(textWithNewlines + formatter.getNewLine(), sw.toString());
    }

    public void testRenderOptionsWithNullDescription() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "optionA", false, null); // Null description
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        String output = sw.toString();
        assertTrue(output.contains("-a,--optionA"));
        assertFalse(output.contains("null")); // Should not print "null"
    }
    
    public void testRenderOptionsWithLongOptionKey() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "verylongoptionkey", false, "Description A");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        String output = sw.toString();
        assertTrue(output.contains("-a,--verylongoptionkey"));
        assertTrue(output.contains("Description A"));
    }

    public void testRenderOptionsWithShortOptionKeyOnly() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("s", null, false, "Short option only");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        String output = sw.toString();
        assertTrue(output.contains("-s"));
        assertFalse(output.contains("--")); // Ensure no long opt prefix is added if not present
        assertTrue(output.contains("Short option only"));
    }

    public void testRenderOptionsWithLongOptionKeyOnly() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(null, "longonly", false, "Long option only");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        String output = sw.toString();
        assertTrue(output.contains("--longonly"));
        assertFalse(output.contains("-")); // Ensure no short opt prefix is added if not present
        assertTrue(output.contains("Long option only"));
    }

    public void testRenderWrappedTextEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, HelpFormatter.DEFAULT_WIDTH, "");
        assertEquals(formatter.getNewLine(), sw.toString());
    }

    public void testRenderWrappedTextSingleWord() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, HelpFormatter.DEFAULT_WIDTH, "word");
        assertEquals("word" + formatter.getNewLine(), sw.toString());
    }

    public void testRenderWrappedTextLongSingleWord() {
        HelpFormatter formatter = new HelpFormatter();
        String longWord = "supercalifragilisticexpialidocious";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 10, longWord); // Width smaller than word
        // The behavior of findWrapPos for long words without spaces is to return the width position
        assertTrue(sw.toString().startsWith(longWord.substring(0, 10)));
        assertTrue(sw.toString().contains(longWord.substring(10)));
    }
    
    public void testFindWrapPosAtEnd() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "short line";
        assertEquals(-1, formatter.findWrapPos(text, HelpFormatter.DEFAULT_WIDTH, 0));
    }

    public void testFindWrapPosInMiddle() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "this is a moderately long line";
        int width = 15;
        // "this is a mod" - pos 14 (space)
        assertEquals(14, formatter.findWrapPos(text, width, 0));
    }

    public void testFindWrapPosWithNewline() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "first line\nsecond line";
        int width = 10;
        assertEquals(10, formatter.findWrapPos(text, width, 0)); // '\n' is at index 10
    }

    public void testFindWrapPosWithTab() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "first line\tsecond line";
        int width = 10;
        assertEquals(10, formatter.findWrapPos(text, width, 0)); // '\t' is at index 10
    }

    public void testFindWrapPosWhenNoSpace() {
        HelpFormatter formatter = new HelpFormatter();
        String text = "thisisalongwordwithoutspaces";
        int width = 10;
        // Should find the first whitespace character after width, or end of string
        assertEquals(-1, formatter.findWrapPos(text, width, 0)); // No space found, so no wrap point before end
    }

    public void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.createPadding(0));
        assertEquals(" ", formatter.createPadding(1));
        assertEquals("   ", formatter.createPadding(3));
    }

    public void testRtrimEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.rtrim(""));
    }

    public void testRtrimNullString() {
        HelpFormatter formatter = new HelpFormatter();
        assertNull(formatter.rtrim(null));
    }

    public void testRtrimNoWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("hello", formatter.rtrim("hello"));
    }

    public void testRtrimWithWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("hello", formatter.rtrim("hello   "));
    }

    public void testRtrimOnlyWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.rtrim("   "));
    }

    public void testOptionComparatorSimple() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();
        Option opt1 = new Option("a", "alpha", false, "desc");
        Option opt2 = new Option("b", "beta", false, "desc");
        assertTrue(comparator.compare(opt1, opt2) < 0);
    }

    public void testOptionComparatorIgnoreCase() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();
        Option opt1 = new Option("A", "alpha", false, "desc");
        Option opt2 = new Option("b", "beta", false, "desc");
        assertTrue(comparator.compare(opt1, opt2) < 0);
    }

    public void testOptionComparatorEqual() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();
        Option opt1 = new Option("a", "alpha", false, "desc");
        Option opt2 = new Option("a", "alpha", false, "desc");
        assertEquals(0, comparator.compare(opt1, opt2));
    }
    
    public void testPrintUsageWithArgumentName() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("f", "file", true, "Input file");
        opt.setArgName("FILE");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        assertEquals("usage: app -f <FILE>" + formatter.getNewLine(), sw.toString());
    }

    public void testPrintUsageWithLongArgumentName() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("f", "file", true, "Input file");
        opt.setArgName("THE_INPUT_FILE_NAME");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, HelpFormatter.DEFAULT_WIDTH, "app", options);
        assertEquals("usage: app -f <THE_INPUT_FILE_NAME>" + formatter.getNewLine(), sw.toString());
    }
    
    public void testRenderOptionsWithArgAndArgName() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("a", "argOpt", true, "An option with an argument.");
        opt.setArgName("VALUE");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        String output = sw.toString();
        assertTrue(output.contains("-a,--argOpt <VALUE>"));
        assertTrue(output.contains("An option with an argument."));
    }

    public void testRenderOptionsWithArgNoArgName() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("b", "noArgNameOpt", true, "An option with an argument but no name.");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        String output = sw.toString();
        assertTrue(output.contains("-b,--noArgNameOpt ")); // Note the space after opt
        assertTrue(output.contains("An option with an argument but no name."));
    }

    public void testRenderOptionsWithHasArgsTrue() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("c", "multiArgOpt", true, "An option with multiple arguments.");
        opt.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        String output = sw.toString();
        assertTrue(output.contains("-c,--multiArgOpt"));
        assertTrue(output.contains("An option with multiple arguments."));
    }

    public void testRenderOptionsWithHasArgsInt() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("d", "twoArgsOpt", true, "An option with two arguments.");
        opt.setArgs(2);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        String output = sw.toString();
        assertTrue(output.contains("-d,--twoArgsOpt"));
        assertTrue(output.contains("An option with two arguments."));
    }

    public void testRenderOptionsWithOptionalArg() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("o", "optionalOpt", true, "An option with an optional argument.");
        opt.setOptionalArg(true);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, HelpFormatter.DEFAULT_WIDTH, options, formatter.defaultLeftPad, formatter.defaultDescPad);
        String output = sw.toString();
        assertTrue(output.contains("-o,--optionalOpt"));
        assertTrue(output.contains("An option with an optional argument."));
    }
}
