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

    // Constants defined in HelpFormatter class (used for assertions)
    private static final int DEFAULT_WIDTH = 74;
    private static final int DEFAULT_LEFT_PAD = 1;
    private static final int DEFAULT_DESC_PAD = 3;
    private static final String DEFAULT_SYNTAX_PREFIX = "usage: ";
    private static final String DEFAULT_OPT_PREFIX = "-";
    private static final String DEFAULT_LONG_OPT_PREFIX = "--";
    private static final String DEFAULT_ARG_NAME = "arg";

    public void testDefaultWidth() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(DEFAULT_WIDTH, formatter.getWidth());
    }

    public void testSetWidth() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    public void testDefaultLeftPadding() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(DEFAULT_LEFT_PAD, formatter.getLeftPadding());
    }

    public void testSetLeftPadding() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    public void testDefaultDescPadding() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(DEFAULT_DESC_PAD, formatter.getDescPadding());
    }

    public void testSetDescPadding() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());
    }

    public void testDefaultSyntaxPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
    }

    public void testSetSyntaxPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("usage:");
        assertEquals("usage:", formatter.getSyntaxPrefix());
    }

    public void testDefaultNewLine() {
        HelpFormatter formatter = new HelpFormatter();
        // Use System.getProperty to get the actual default new line character
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
    }

    public void testSetNewLine() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    public void testDefaultOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
    }

    public void testSetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
    }

    public void testDefaultLongOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
    }

    public void testSetLongOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("--");
        assertEquals("--", formatter.getLongOptPrefix());
    }

    public void testDefaultArgName() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(DEFAULT_ARG_NAME, formatter.getArgName());
    }

    public void testSetArgName() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("value");
        assertEquals("value", formatter.getArgName());
    }

    public void testPrintHelpWithEmptyOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, DEFAULT_WIDTH, "usage: app", null, options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD, null, false);
        pw.flush();
        // The expected output includes the usage line and a blank line for the options section
        String expected = "usage: app" + System.getProperty("line.separator") + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testPrintHelpWithNullOptions() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, DEFAULT_WIDTH, "usage: app", null, null, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD, null, false);
        pw.flush();
        // Same as with empty options, null options are treated like empty ones in this context.
        String expected = "usage: app" + System.getProperty("line.separator") + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testPrintHelpWithHeaderAndFooter() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, DEFAULT_WIDTH, "usage: app", "Header", options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD, "Footer", false);
        pw.flush();
        String expected = "usage: app" + System.getProperty("line.separator") +
                          "Header" + System.getProperty("line.separator") +
                          System.getProperty("line.separator") + // Blank line before options
                          "Footer" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testPrintHelpWithAutoUsage() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description a");
        group.addOption(opt1);
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, DEFAULT_WIDTH, "usage: app", null, options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD, null, true);
        pw.flush();
        // With autoUsage true, the usage statement should reflect the options.
        // The OptionGroup with a single option "a" will be displayed as [-a].
        String expected = "usage: app [-a]" + System.getProperty("line.separator") +
                          System.getProperty("line.separator"); // Blank line after usage
        assertEquals(expected, sw.toString());
    }

    public void testPrintUsageWithNullPrintWriter() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        try {
            formatter.printUsage(null, DEFAULT_WIDTH, "usage: app", options);
            fail("Expected IllegalArgumentException for null PrintWriter");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    public void testPrintUsageWithEmptyCmdLineSyntax() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        try {
            formatter.printUsage(pw, DEFAULT_WIDTH, "", options);
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    public void testPrintUsageWithNullCmdLineSyntax() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        try {
            formatter.printUsage(pw, DEFAULT_WIDTH, null, options);
            fail("Expected IllegalArgumentException for null cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    public void testPrintOptionsWithEmptyOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD);
        pw.flush();
        // No options, so output should be empty.
        assertEquals("", sw.toString());
    }

    public void testPrintOptionsWithNullOptions() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, null, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD);
        pw.flush();
        // Null options should also result in empty output.
        assertEquals("", sw.toString());
    }

    public void testPrintWrappedShortText() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String text = "short text";
        formatter.printWrapped(pw, DEFAULT_WIDTH, text);
        pw.flush();
        assertEquals(text + System.getProperty("line.separator"), sw.toString());
    }

    public void testPrintWrappedLongText() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String text = "This is a very long piece of text that needs to be wrapped to fit within the specified width of 74 characters.";
        formatter.printWrapped(pw, DEFAULT_WIDTH, text);
        pw.flush();
        String expected = "This is a very long piece of text that needs to be wrapped to fit within the" + System.getProperty("line.separator") +
                          "specified width of 74 characters." + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testPrintWrappedWithTabStop() {
        HelpFormatter formatter = new HelpFormatter();
        // Set default values to avoid interference from other settings
        formatter.setLeftPadding(0);
        formatter.setDescPadding(0);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String text = "Option -a,--alpha description";
        // width=20, nextLineTabStop=10
        formatter.printWrapped(pw, 20, 10, text);
        pw.flush();
        String expected = "Option -a,--alpha" + System.getProperty("line.separator") +
                          "          description" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testFindWrapPosNoWrap() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(-1, formatter.findWrapPos("short text", 74, 0));
    }

    public void testFindWrapPosAtEndOfLine() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(-1, formatter.findWrapPos("text that fits", 15, 0));
    }

    public void testFindWrapPosWithSpace() {
        HelpFormatter formatter = new HelpFormatter();
        // The text is "this is a long sentence". Width is 10.
        // The first space after the 10th character is at index 10.
        // findWrapPos should return the index of the space.
        assertEquals(10, formatter.findWrapPos("this is a long sentence", 10, 0));
    }

    public void testFindWrapPosWithNewline() {
        HelpFormatter formatter = new HelpFormatter();
        // text: "line1\nline2", width: 10, startPos: 0
        // '\n' is at index 5. 5 is <= 10. So it returns 5+1=6
        assertEquals(6, formatter.findWrapPos("line1\nline2", 10, 0));
    }

    public void testFindWrapPosWithTab() {
        HelpFormatter formatter = new HelpFormatter();
        // text: "word1\tword2", width: 10, startPos: 0
        // '\t' is at index 5. 5 is <= 10. So it returns 5+1=6
        assertEquals(6, formatter.findWrapPos("word1\tword2", 10, 0));
    }

    public void testFindWrapPosBeforeWidth() {
        HelpFormatter formatter = new HelpFormatter();
        // text: "abcdefghijklmnop qrstuvwxyz", width: 20, startPos: 0
        // text length is 26. startPos + width = 20.
        // Looking for space before index 20.
        // 'p' is at 15, ' ' is at 16. So return 16.
        assertEquals(16, formatter.findWrapPos("abcdefghijklmnop qrstuvwxyz", 20, 0));
    }

    public void testFindWrapPosAfterWidth() {
        HelpFormatter formatter = new HelpFormatter();
        // text: "abcdefghijklmnop qrstuvwxyz", width: 15, startPos: 0
        // text length is 26. startPos + width = 15.
        // Looking for space before index 15. No space.
        // The first whitespace character after index 15 is at index 16.
        // Return 16.
        assertEquals(16, formatter.findWrapPos("abcdefghijklmnop qrstuvwxyz", 15, 0));
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

    public void testRtrimNoTrailingSpace() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("abc", formatter.rtrim("abc"));
    }

    public void testRtrimTrailingSpaces() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("abc", formatter.rtrim("abc   "));
    }

    public void testRtrimOnlySpaces() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.rtrim("   "));
    }

    public void testOptionComparator() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt1 = new Option("a", "alpha", false, "desc a");
        Option opt2 = new Option("b", "beta", false, "desc b");
        Option opt3 = new Option("A", "Alpha", false, "desc A"); // Same key as opt1, different case
        Option opt4 = new Option("Z", "zeta", false, "desc Z");

        options.addOption(opt2);
        options.addOption(opt1);
        options.addOption(opt4);
        options.addOption(opt3); // Duplicate key, should not affect sorting by key

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        // printUsage internally sorts options using OptionComparator
        formatter.printUsage(pw, DEFAULT_WIDTH, "usage: app", options);
        pw.flush();

        String expectedUsagePart = "usage: app";
        String output = sw.toString();
        assertTrue(output.contains(expectedUsagePart));
        // The exact order of 'a' and 'A' can depend on internal Option details and stable sort properties.
        // We will assert that both are present and that 'b' and 'Z' follow them in order.
        assertTrue(output.contains("[-a]") || output.contains("[-A]"));
        assertTrue(output.contains("[-b <arg>]"));
        assertTrue(output.contains("[-Z <arg>]"));

        // Check relative order: [-a] or [-A] should appear before [-b <arg>]
        int aPos = output.indexOf("[-a]");
        int APos = output.indexOf("[-A]");
        int bPos = output.indexOf("[-b <arg>]");
        int zPos = output.indexOf("[-Z <arg>]");

        // If 'a' is present, its position should be before 'b'
        if (aPos != -1) {
            assertTrue("'-a' should appear before '-b'", aPos < bPos);
        }
        // If 'A' is present, its position should be before 'b'
        if (APos != -1) {
            assertTrue("'-A' should appear before '-b'", APos < bPos);
        }
        // '-b <arg>' should appear before '-Z <arg>'
        assertTrue("'-b <arg>' should appear before '-Z <arg>'", bPos < zPos);
    }

    public void testRenderOptionsWithSingleOption() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "An option");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD);
        pw.flush();
        String expected = " -a,--alpha" + "   " + "An option" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testRenderOptionsWithLongOptionOnly() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption(null, "alpha", false, "A long option");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD);
        pw.flush();
        // The option prefix for short options is not used for long-only options.
        // The left padding is applied.
        String expected = "   --alpha" + "   " + "A long option" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testRenderOptionsWithOptionAndArgument() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("f", "file", true, "Input file"); // hasArg is true
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD);
        pw.flush();
        // Default argName is "arg"
        String expected = " -f,--file <arg>" + "   " + "Input file" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testRenderOptionsWithOptionAndArgName() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("o", "output", true, "Output file");
        opt.setArgName("outFile"); // Set a custom argName
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD);
        pw.flush();
        String expected = " -o,--output <outFile>" + "   " + "Output file" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testRenderOptionsWithMultipleOptionsAndPadding() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "Option alpha");
        options.addOption("b", "beta", true, "Option beta"); // hasArg true, default argName "arg"
        options.addOption("c", null, false, "Option c"); // Long option only is handled differently

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, options, 2, 4); // Increased padding: leftPad=2, descPad=4
        pw.flush();

        // Calculate expected padding:
        // Max width of option prefixes:
        // "  -a,--alpha" (10 chars)
        // "  -b,--beta <arg>" (17 chars)
        // "  -c" (4 chars)
        // The longest is 17 characters.
        // The description for 'c' needs padding to align with others, plus descPad.
        // maxPrefixLength = 17
        // Padding for -a: 17 - (2 + 3) = 12 spaces
        // Padding for -b: 17 - (2 + 17) = 0 spaces. Wait, it's "-b,--beta <arg>" so 17 is correct.
        // Padding for -c: 17 - (2 + 2) = 13 spaces. This seems incorrect.
        // Let's re-examine renderOptions:
        // prefixList entries:
        // "  -a,--alpha"
        // "  -b,--beta <arg>"
        // "  -c"
        // Max length of these prefixes is 17 (for "-b,--beta <arg>").
        // The padding after the prefix is `createPadding(max - optBuf.length())`
        // For "-a,--alpha": max=17, length=10. Padding = 7 spaces. Total prefix + padding = 17.
        // For "-b,--beta <arg>": max=17, length=17. Padding = 0 spaces. Total prefix + padding = 17.
        // For "-c": max=17, length=4. Padding = 13 spaces. Total prefix + padding = 17.
        // So, all prefixes will be padded to 17 characters.
        // Then, descPad (4) is appended.
        String expected = "  -a,--alpha" + "       " + "    " + "Option alpha" + System.getProperty("line.separator") +
                          "  -b,--beta <arg>" + "   " + "    " + "Option beta" + System.getProperty("line.separator") +
                          "  -c" + "             " + "    " + "Option c" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }
}
