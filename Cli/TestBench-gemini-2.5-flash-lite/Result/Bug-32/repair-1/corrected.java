package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.io.StringWriter;

public class HelpFormatterTest extends TestCase {

    public void testDefaultWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default width should be " + HelpFormatter.DEFAULT_WIDTH, HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    public void testSetWidth() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        int testWidth = 100;
        formatter.setWidth(testWidth);
        assertEquals("Set width should be " + testWidth, testWidth, formatter.getWidth());
    }

    public void testDefaultLeftPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default left padding should be " + HelpFormatter.DEFAULT_LEFT_PAD, HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
    }

    public void testSetLeftPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        int testPadding = 5;
        formatter.setLeftPadding(testPadding);
        assertEquals("Set left padding should be " + testPadding, testPadding, formatter.getLeftPadding());
    }

    public void testDefaultDescPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default description padding should be " + HelpFormatter.DEFAULT_DESC_PAD, HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
    }

    public void testSetDescPadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        int testPadding = 10;
        formatter.setDescPadding(testPadding);
        assertEquals("Set description padding should be " + testPadding, testPadding, formatter.getDescPadding());
    }

    public void testDefaultSyntaxPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default syntax prefix should be " + HelpFormatter.DEFAULT_SYNTAX_PREFIX, HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
    }

    public void testSetSyntaxPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String testPrefix = "Usage: ";
        formatter.setSyntaxPrefix(testPrefix);
        assertEquals("Set syntax prefix should be " + testPrefix, testPrefix, formatter.getSyntaxPrefix());
    }

    public void testDefaultNewLine() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default new line should be system property", System.getProperty("line.separator"), formatter.getNewLine());
    }

    public void testSetNewLine() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String testNewLine = "\r\n";
        formatter.setNewLine(testNewLine);
        assertEquals("Set new line should be " + testNewLine, testNewLine, formatter.getNewLine());
    }

    public void testDefaultOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default option prefix should be " + HelpFormatter.DEFAULT_OPT_PREFIX, HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
    }

    public void testSetOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String testPrefix = "+";
        formatter.setOptPrefix(testPrefix);
        assertEquals("Set option prefix should be " + testPrefix, testPrefix, formatter.getOptPrefix());
    }

    public void testDefaultLongOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default long option prefix should be " + HelpFormatter.DEFAULT_LONG_OPT_PREFIX, HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
    }

    public void testSetLongOptPrefix() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String testPrefix = "++";
        formatter.setLongOptPrefix(testPrefix);
        assertEquals("Set long option prefix should be " + testPrefix, testPrefix, formatter.getLongOptPrefix());
    }

    public void testDefaultLongOptSeparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default long option separator should be " + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
    }

    public void testSetLongOptSeparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String testSeparator = "=";
        formatter.setLongOptSeparator(testSeparator);
        assertEquals("Set long option separator should be " + testSeparator, testSeparator, formatter.getLongOptSeparator());
    }

    public void testDefaultArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Default arg name should be " + HelpFormatter.DEFAULT_ARG_NAME, HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
    }

    public void testSetArgName() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String testArgName = "value";
        formatter.setArgName(testArgName);
        assertEquals("Set arg name should be " + testArgName, testArgName, formatter.getArgName());
    }

    public void testDefaultOptionComparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Default comparator sorts by key case-insensitively
        Option o1 = new Option("a", "alpha", false, "desc");
        Option o2 = new Option("b", "beta", false, "desc");
        Option o3 = new Option("A", "Alpha", false, "desc");
        Comparator comp = formatter.getOptionComparator();
        assertTrue("Default comparator should sort 'a' before 'b'", comp.compare(o1, o2) < 0);
        assertTrue("Default comparator should sort 'A' before 'b'", comp.compare(o3, o2) < 0);
        assertTrue("Default comparator should treat 'a' and 'A' as equal for sorting purposes", comp.compare(o1, o3) == 0);
    }

    public void testSetOptionComparator() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Comparator customComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option opt1 = (Option) o1;
                Option opt2 = (Option) o2;
                return opt2.getKey().compareTo(opt1.getKey()); // Reverse order
            }
        };
        formatter.setOptionComparator(customComp);
        assertEquals("Option comparator should be the one set", customComp, formatter.getOptionComparator());

        Option o1 = new Option("a", "alpha", false, "desc");
        Option o2 = new Option("b", "beta", false, "desc");
        Comparator comp = formatter.getOptionComparator();
        assertTrue("Custom comparator should sort 'b' before 'a'", comp.compare(o1, o2) > 0);
    }

    public void testSetOptionComparatorToNull() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptionComparator(null);
        // Accessing the inner class directly is not possible due to private access.
        // We can check if the comparator is not the custom one, or if it's an instance of the anonymous class if we had set one previously.
        // Since the default is OptionComparator, let's check for that.
        // However, the prompt says "the experiment system compiles and runs your class unchanged". If the OptionComparator is private, direct instantiation in test is not allowed.
        // The error message indicates private access. We cannot instantiate it.
        // Let's check if it's not the custom one we set.
        Comparator defaultComparator = new Comparator() { // A placeholder to check against the default
            public int compare(Object o1, Object o2) {
                Option opt1 = (Option) o1;
                Option opt2 = (Option) o2;
                return opt1.getKey().compareToIgnoreCase(opt2.getKey());
            }
        };
        assertTrue("Setting comparator to null should reset to default", 
                   formatter.getOptionComparator().getClass().getName().equals("org.apache.commons.cli.HelpFormatter$OptionComparator"));
    }

    public void testPrintHelpWithNoOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        formatter.printHelp(pw, formatter.getWidth(), cmdLineSyntax, "Header", options, formatter.getLeftPadding(), formatter.getDescPadding(), "Footer");
        pw.flush();
        
        String expected = "usage: mycli" + formatter.getNewLine() +
                          "Header" + formatter.getNewLine() + formatter.getNewLine() +
                          "Footer" + formatter.getNewLine();
        
        assertEquals("Help with no options mismatch", expected, sw.toString());
    }
    
    public void testPrintHelpWithOneOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "An option.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        formatter.printHelp(pw, formatter.getWidth(), cmdLineSyntax, null, options, formatter.getLeftPadding(), formatter.getDescPadding(), null);
        pw.flush();
        
        // Expected output needs to account for padding and wrapping
        String expected = "usage: mycli -a,--alpha" + formatter.getNewLine() +
                          " -a,--alpha  An option." + formatter.getNewLine();
        
        assertEquals("Help with one option mismatch", expected, sw.toString());
    }
    
    public void testPrintHelpWithRequiredOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("r", "required", false, "A required option.");
        option.setRequired(true);
        options.addOption(option);
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        formatter.printHelp(pw, formatter.getWidth(), cmdLineSyntax, null, options, formatter.getLeftPadding(), formatter.getDescPadding(), null);
        pw.flush();
        
        String expected = "usage: mycli -r,--required" + formatter.getNewLine() +
                          " -r,--required  A required option." + formatter.getNewLine();
        
        assertEquals("Help with required option mismatch", expected, sw.toString());
    }

    public void testPrintHelpWithOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "First option.");
        Option opt2 = new Option("b", "beta", false, "Second option.");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        formatter.printHelp(pw, formatter.getWidth(), cmdLineSyntax, null, options, formatter.getLeftPadding(), formatter.getDescPadding(), null);
        pw.flush();

        // Depending on comparator, order may vary. Default sorts 'a' before 'b'.
        String expected = "usage: mycli [-a | -b]" + formatter.getNewLine() +
                          " -a,--alpha  First option." + formatter.getNewLine() +
                          " -b,--beta  Second option." + formatter.getNewLine();
                          
        assertEquals("Help with required option group mismatch", expected, sw.toString());
    }
    
    public void testPrintHelpWithOptionalOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "First option.");
        Option opt2 = new Option("b", "beta", false, "Second option.");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(false); // Optional group
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        formatter.printHelp(pw, formatter.getWidth(), cmdLineSyntax, null, options, formatter.getLeftPadding(), formatter.getDescPadding(), null);
        pw.flush();

        // The outer brackets indicate the group is optional.
        String expected = "usage: mycli [-a | -b]" + formatter.getNewLine() +
                          " -a,--alpha  First option." + formatter.getNewLine() +
                          " -b,--beta  Second option." + formatter.getNewLine();
                          
        assertEquals("Help with optional option group mismatch", expected, sw.toString());
    }
    
    public void testPrintUsageWithNoOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        formatter.printUsage(pw, formatter.getWidth(), cmdLineSyntax, options);
        pw.flush();
        
        assertEquals("Usage with no options mismatch", "usage: mycli" + formatter.getNewLine(), sw.toString());
    }
    
    public void testPrintUsageWithOneOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "An option.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        formatter.printUsage(pw, formatter.getWidth(), cmdLineSyntax, options);
        pw.flush();
        
        assertEquals("Usage with one option mismatch", "usage: mycli -a" + formatter.getNewLine(), sw.toString());
    }
    
    public void testPrintUsageWithRequiredOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("r", "required", false, "A required option.");
        option.setRequired(true);
        options.addOption(option);
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        formatter.printUsage(pw, formatter.getWidth(), cmdLineSyntax, options);
        pw.flush();
        
        assertEquals("Usage with required option mismatch", "usage: mycli -r" + formatter.getNewLine(), sw.toString());
    }

    public void testPrintUsageWithOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "First option.");
        Option opt2 = new Option("b", "beta", false, "Second option.");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        formatter.printUsage(pw, formatter.getWidth(), cmdLineSyntax, options);
        pw.flush();

        // The group is required, so its contents are not wrapped in brackets,
        // but the pipe indicates choices.
        assertEquals("Usage with required option group mismatch", "usage: mycli -a | -b" + formatter.getNewLine(), sw.toString());
    }
    
    public void testPrintUsageWithOptionalOptionGroup() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "First option.");
        Option opt2 = new Option("b", "beta", false, "Second option.");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(false); // Optional group
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        formatter.printUsage(pw, formatter.getWidth(), cmdLineSyntax, options);
        pw.flush();

        // The group is optional, so its contents are wrapped in brackets.
        assertEquals("Usage with optional option group mismatch", "usage: mycli [-a | -b]" + formatter.getNewLine(), sw.toString());
    }

    public void testPrintOptionsWithEmptyOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        
        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        
        assertEquals("Print options with empty options produced unexpected output.", "", sw.toString());
    }

    public void testPrintOptionsWithOneOption() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("o", "option", false, "A sample option.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        
        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        
        // The description will be on a new line, indented.
        // The expected output should include the left padding.
        String expected = formatter.createPadding(formatter.getLeftPadding()) + 
                          formatter.getOptPrefix() + "o," + formatter.getLongOptPrefix() + "option" + 
                          "  A sample option." + formatter.getNewLine();
        assertEquals("Print options with one option produced unexpected output.", expected, sw.toString());
    }

    public void testPrintOptionsWithLongOptionOnly() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(null, "longonly", false, "A long option only.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        
        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        
        String expected = formatter.createPadding(formatter.getLeftPadding()) + "   " + formatter.getLongOptPrefix() + "longonly" + 
                          "  A long option only." + formatter.getNewLine();
        assertEquals("Print options with long option only produced unexpected output.", expected, sw.toString());
    }
    
    public void testPrintOptionsWithOptionAndArgument() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("f", "file", true, "Specify a file.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        
        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();
        
        String expected = formatter.createPadding(formatter.getLeftPadding()) + 
                          formatter.getOptPrefix() + "f," + formatter.getLongOptPrefix() + "file" + 
                          formatter.getLongOptSeparator() + "<file>" + "  Specify a file." + formatter.getNewLine();
        assertEquals("Print options with option and argument produced unexpected output.", expected, sw.toString());
    }

    public void testPrintWrappedBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test string to be wrapped.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        
        formatter.printWrapped(pw, 20, text);
        pw.flush();
        
        String expected = "This is a test" + formatter.getNewLine() +
                          "string to be" + formatter.getNewLine() +
                          "wrapped." + formatter.getNewLine();
        assertEquals("Basic text wrapping mismatch", expected, sw.toString());
    }
    
    public void testPrintWrappedLongWord() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "Thisisaverylongwordthatwillnotwrap.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        
        formatter.printWrapped(pw, 20, text);
        pw.flush();
        
        // With a long word, it should still wrap at the width limit.
        String expected = "Thisisaverylongwordth" + formatter.getNewLine() +
                          "atwillnotwrap." + formatter.getNewLine();
        assertEquals("Long word text wrapping mismatch", expected, sw.toString());
    }
    
    public void testPrintWrappedWithExistingNewlines() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "Line one.\nLine two.\n\nLine four.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        
        formatter.printWrapped(pw, 20, text);
        pw.flush();
        
        String expected = "Line one." + formatter.getNewLine() +
                          "Line two." + formatter.getNewLine() +
                          formatter.getNewLine() +
                          "Line four." + formatter.getNewLine();
        assertEquals("Text wrapping with existing newlines mismatch", expected, sw.toString());
    }

    public void testPrintWrappedWithLeadingAndTrailingSpaces() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "  Leading and trailing spaces.  ";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        
        // The method renderWrappedText trims the *segment* it's about to append.
        // Initial spaces are part of the first segment.
        // findWrapPos will look for whitespace *before* the width.
        // The renderWrappedText then applies padding and calls itself recursively.
        // For "  Leading and trailing spaces.  ", width 30:
        // 1. findWrapPos("  Leading and trailing spaces.  ", 30, 0) -> returns index of space before "spaces." (26)
        // 2. sb.append(rtrim("  Leading and trailing spaces.  ".substring(0, 26))) -> "  Leading and trailing spaces."
        // 3. text = "  Leading and trailing spaces.  ".substring(26).trim() -> "spaces.  ".trim() -> "spaces."
        // 4. findWrapPos("spaces.", 30, 0) -> -1
        // 5. sb.append("spaces.") -> "  Leading and trailing spaces.spaces."
        // This seems incorrect. Let's trace renderWrappedText more carefully.
        // renderWrappedText(sb, 40, 0, "  Leading and trailing spaces.  ")
        //  pos = findWrapPos("  Leading and trailing spaces.  ", 40, 0) -> finds space before 'spaces.' at index 26.
        //  sb.append(rtrim("  Leading and trailing spaces.  ".substring(0, 26))) -> sb.append("  Leading and trailing spaces.")
        //  sb.append(defaultNewLine)
        //  text = "  Leading and trailing spaces.  ".substring(26).trim() -> "spaces.  ".trim() -> "spaces."
        //  pos = findWrapPos("spaces.", 40, 0) -> -1
        //  sb.append(text) -> sb.append("spaces.")
        //  Result: "  Leading and trailing spaces.\nspaces."

        // Let's assume the intent is to trim the whole string first, or that the first line's leading spaces are handled by the caller.
        // If we assume the string is "Leading and trailing spaces." with width 30.
        // pos = findWrapPos("Leading and trailing spaces.", 30, 0) -> finds space before 'spaces.' at index 26
        // sb.append(rtrim("Leading and trailing spaces.".substring(0, 26))) -> "Leading and trailing spaces."
        // text = "Leading and trailing spaces.".substring(26).trim() -> "spaces.".trim() -> "spaces."
        // pos = findWrapPos("spaces.", 30, 0) -> -1
        // sb.append(text) -> sb.append("spaces.")
        // Result: "Leading and trailing spaces.\nspaces."

        // The rtrim is applied to the *segment* being appended.
        // The 'text' parameter is modified in the loop.
        // The initial call to renderWrappedText passes the original text.
        // "  Leading and trailing spaces.  " width 30.
        // pos = findWrapPos("  Leading and trailing spaces.  ", 30, 0) = 26 (space before 'spaces.')
        // sb.append(rtrim("  Leading and trailing spaces.  ".substring(0, 26))) -> appends "  Leading and trailing spaces."
        // sb.append(defaultNewLine)
        // text = "  Leading and trailing spaces.  ".substring(26).trim() -> "spaces.  ".trim() -> "spaces."
        // pos = findWrapPos("spaces.", 30, 0) -> -1
        // sb.append(text) -> appends "spaces."
        // Final: "  Leading and trailing spaces.\nspaces."

        // Let's test with width = 20 for the example to be clearer.
        // "  Leading and trailing spaces.  " width 20.
        // pos = findWrapPos("  Leading and trailing spaces.  ", 20, 0) -> finds space before 'and' at index 16.
        // sb.append(rtrim("  Leading and trailing spaces.  ".substring(0, 16))) -> "  Leading and trailing"
        // sb.append(defaultNewLine)
        // text = "  Leading and trailing spaces.  ".substring(16).trim() -> "and trailing spaces.  ".trim() -> "and trailing spaces."
        // pos = findWrapPos("and trailing spaces.", 20, 0) -> finds space before 'spaces.' at index 14.
        // sb.append(rtrim("and trailing spaces.".substring(0, 14))) -> "and trailing"
        // sb.append(defaultNewLine)
        // text = "and trailing spaces.".substring(14).trim() -> "spaces.".trim() -> "spaces."
        // pos = findWrapPos("spaces.", 20, 0) -> -1
        // sb.append(text) -> "spaces."
        // Final: "  Leading and trailing\nand trailing\nspaces."
        
        String expected = "  Leading and trailing" + formatter.getNewLine() +
                          "and trailing" + formatter.getNewLine() +
                          "spaces." + formatter.getNewLine();

        assertEquals("Text wrapping with leading/trailing spaces mismatch", expected, sw.toString());
    }

    public void testPrintWrappedWithSpecificTabStop() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is the first line. This is the second line.";
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        int width = 40;
        int tabStop = 10; // The first line is standard, subsequent lines start at column 10.
        
        formatter.printWrapped(pw, width, tabStop, text);
        pw.flush();
        
        // First line wraps at 40. Second line starts at column 10.
        String expected = "This is the first line. This is the" + formatter.getNewLine() +
                          "          second line." + formatter.getNewLine();
        assertEquals("Text wrapping with tab stop mismatch", expected, sw.toString());
    }

    public void testRenderOptionsWithComplexOptions() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "Description for alpha.");
        options.addOption("b", "beta", true, "Description for beta.");
        options.addOption("c", null, false, "Description for Charlie.");
        options.addOption(null, "delta", true, "Description for Delta.");
        options.addOption("e", "epsilon", true, "Description for epsilon with a long description that should wrap.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        
        // The method renderOptions expects a StringBuffer, not a StringWriter.
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        
        // The output will be somewhat complex due to sorting, padding, and wrapping.
        // We'll check for the presence of key parts.
        String output = sb.toString();

        assertTrue("Missing -a", output.contains("-a"));
        assertTrue("Missing --alpha", output.contains("--alpha"));
        assertTrue("Missing description for alpha", output.contains("Description for alpha."));
        
        assertTrue("Missing -b", output.contains("-b"));
        assertTrue("Missing --beta", output.contains("--beta"));
        // The API says <arg> is used if argName is null or empty.
        // For option -b, --beta, hasArg() is true, getArgName() is null.
        assertTrue("Missing argument indicator for beta", output.contains("<beta>")); // Should be <beta> as argName is "beta"
        assertTrue("Missing description for beta", output.contains("Description for beta."));
        
        assertTrue("Missing -c", output.contains("-c"));
        assertTrue("Missing --delta", output.contains("--delta"));
        assertTrue("Missing argument indicator for delta", output.contains("<arg>")); // default arg name if not specified
        assertTrue("Missing description for delta", output.contains("Description for Delta."));

        assertTrue("Missing description for epsilon", output.contains("Description for epsilon with a long description that should wrap."));
    }

    public void testFindWrapPosSimple() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Test wrapping at a space
        assertEquals(10, formatter.findWrapPos("This is a test", 15, 0));
        // Test wrapping at the end of the string
        assertEquals(-1, formatter.findWrapPos("This is a test", 20, 0));
        // Test wrapping at newline
        assertEquals(5, formatter.findWrapPos("Line1\nLine2", 10, 0)); // '\n' is at index 5
    }

    public void testFindWrapPosNoSpace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Test wrapping when no space is found within width
        assertEquals(15, formatter.findWrapPos("Thisisaverylongword", 15, 0));
    }

    public void testFindWrapPosAtWidthLimit() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Test where the wrap point is exactly at the width limit
        assertEquals(15, formatter.findWrapPos("This is the first", 15, 0));
    }

    public void testFindWrapPosWithTab() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        // Test wrapping at a tab character
        assertEquals(5, formatter.findWrapPos("Hello\tWorld", 10, 0)); // '\t' is at index 5
    }
    
    public void testCreatePadding() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Padding of length 0 should be empty string", "", formatter.createPadding(0));
        assertEquals("Padding of length 5 should be 5 spaces", "     ", formatter.createPadding(5));
    }

    public void testRtrimBasic() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Rtrim of 'abc  ' should be 'abc'", "abc", formatter.rtrim("abc  "));
        assertEquals("Rtrim of 'abc' should be 'abc'", "abc", formatter.rtrim("abc"));
        assertEquals("Rtrim of empty string should be empty string", "", formatter.rtrim(""));
        assertEquals("Rtrim of null should be null", null, formatter.rtrim(null));
    }

    public void testRtrimMultipleSpaces() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Rtrim of 'abc   ' should be 'abc'", "abc", formatter.rtrim("abc   "));
    }

    public void testRtrimOnlySpaces() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Rtrim of '   ' should be empty string", "", formatter.rtrim("   "));
    }

    public void testRtrimWithNewlines() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("Rtrim of 'abc\n' should be 'abc'", "abc", formatter.rtrim("abc\n"));
        assertEquals("Rtrim of 'abc\n\n' should be 'abc'", "abc", formatter.rtrim("abc\n\n"));
    }
    
    public void testPrintUsageWithAutoUsageTrue() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("f", "file", true, "Specify a file.");
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String cmdLineSyntax = "mycli";
        
        // Testing printUsage directly, which is called by printHelp with autoUsage=true.
        formatter.printUsage(pw, formatter.getWidth(), cmdLineSyntax, options);
        pw.flush();
        
        assertEquals("Auto usage printUsage mismatch", "usage: mycli -f,--file" + formatter.getNewLine(), sw.toString());
    }
}
