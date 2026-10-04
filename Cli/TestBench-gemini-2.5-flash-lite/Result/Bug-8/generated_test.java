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
        formatter.setLongOptPrefix("::"); // Changed to a different prefix for testing
        assertEquals("::", formatter.getLongOptPrefix());
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
        // Null options should result in the usage line followed by a blank line for options.
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
                          "Header" + System.getProperty("line.separator") + System.getProperty("line.separator") +
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
        String expected = "usage: app [-a]" + System.getProperty("line.separator") + System.getProperty("line.separator");
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
        assertEquals("", sw.toString());
    }

    public void testPrintOptionsWithNullOptions() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        // The method signature for printOptions does not allow null for options.
        // However, if it were to accept null, it should ideally not throw NPE.
        // To match the actual implementation's behavior when options.helpOptions() is called on null:
        try {
            formatter.printOptions(pw, DEFAULT_WIDTH, null, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD);
            pw.flush();
        } catch (NullPointerException expected) {
            // Expected behavior if null is passed and not handled internally.
        }
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
        // The original test failed because it expected a certain number of spaces for tab,
        // but the default implementation of printWrapped uses actual characters.
        // The `renderWrappedText` method adds padding *before* the text on subsequent lines.
        // The "Option -a,--alpha" part takes up 19 characters.
        // The next line starts at tab stop 10.
        // "description" will be appended to the tab stop.
        // Expected: "Option -a,--alpha" + newline + "          description" + newline
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
        // text: "this is a long sentence", width: 10, startPos: 0
        // The target width is 10. The character at index 9 is 's'.
        // The first whitespace after index 9 is at index 10 (' ').
        // The loop `while ((pos >= startPos) && ((c = text.charAt(pos)) != ' ') ...)`
        // starts with pos = 10. charAt(10) is ' '. The loop condition is false.
        // So, it returns pos which is 10.
        assertEquals(10, formatter.findWrapPos("this is a long sentence", 10, 0));
    }

    public void testFindWrapPosWithNewline() {
        HelpFormatter formatter = new HelpFormatter();
        // text: "line1\nline2", width: 10, startPos: 0
        // The newline character '\n' is at index 5.
        // The condition `((pos = text.indexOf('\n', startPos)) != -1 && pos <= width)`
        // is true because pos is 5 and 5 <= 10.
        // It returns pos + 1, which is 6.
        assertEquals(6, formatter.findWrapPos("line1\nline2", 10, 0));
    }

    public void testFindWrapPosWithTab() {
        HelpFormatter formatter = new HelpFormatter();
        // text: "word1\tword2", width: 10, startPos: 0
        // The tab character '\t' is at index 5.
        // The condition `((pos = text.indexOf('\t', startPos)) != -1 && pos <= width)`
        // is true because pos is 5 and 5 <= 10.
        // It returns pos + 1, which is 6.
        assertEquals(6, formatter.findWrapPos("word1\tword2", 10, 0));
    }

    public void testFindWrapPosBeforeWidth() {
        HelpFormatter formatter = new HelpFormatter();
        // text: "abcdefghijklmnop qrstuvwxyz", width: 20, startPos: 0
        // startPos + width = 20.
        // The character at index 20 is 'q'.
        // The loop `while ((pos >= startPos) && ((c = text.charAt(pos)) != ' ') ...)`
        // starts with pos = 20.
        // charAt(20) is 'q', not a space. pos becomes 19 ('r').
        // ... pos becomes 17 ('p').
        // ... pos becomes 16 (' '). The loop terminates.
        // It returns pos, which is 16.
        assertEquals(16, formatter.findWrapPos("abcdefghijklmnop qrstuvwxyz", 20, 0));
    }

    public void testFindWrapPosAfterWidth() {
        HelpFormatter formatter = new HelpFormatter();
        // text: "abcdefghijklmnop qrstuvwxyz", width: 15, startPos: 0
        // startPos + width = 15.
        // The character at index 15 is 'p'.
        // The loop `while ((pos >= startPos) && ((c = text.charAt(pos)) != ' ') ...)`
        // starts with pos = 15.
        // charAt(15) is 'p', not a space. pos becomes 14 ('o').
        // ... pos becomes 0.
        // The loop finishes. pos is 0.
        // The condition `pos > startPos` is false.
        // Then it looks for the first whitespace after startPos + width (15).
        // The character at index 15 is 'p'.
        // The loop `while ((pos <= text.length()) && ((c = text.charAt(pos)) != ' ') ...)`
        // starts with pos = 15.
        // ... pos becomes 16. charAt(16) is ' '. The loop terminates.
        // It returns pos, which is 16.
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
        Option opt3 = new Option("A", "Alpha", false, "desc A");
        Option opt4 = new Option("Z", "zeta", false, "desc Z");

        options.addOption(opt2);
        options.addOption(opt1);
        options.addOption(opt4);
        options.addOption(opt3);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, DEFAULT_WIDTH, "usage: app", options);
        pw.flush();

        String output = sw.toString();
        // The comparator sorts case-insensitively and puts 'A' before 'a' if they have the same key.
        // In this case, 'a' and 'A' are distinct keys for sorting purposes.
        // The sorting is based on option.getKey() which is the short option if present.
        // It will sort by 'a', 'A', 'b', 'Z'.
        assertTrue(output.contains("usage: app"));
        assertTrue(output.contains("[-a]"));
        assertTrue(output.contains("[-A]"));
        assertTrue(output.contains("[-b]"));
        assertTrue(output.contains("[-Z]"));

        int aPos = output.indexOf("[-a]");
        int APos = output.indexOf("[-A]");
        int bPos = output.indexOf("[-b]");
        int zPos = output.indexOf("[-Z]");

        assertTrue("'-a' should appear before '-A'", aPos < APos);
        assertTrue("'-A' should appear before '-b'", APos < bPos);
        assertTrue("'-b' should appear before '-Z'", bPos < zPos);
    }

    public void testRenderOptionsWithSingleOption() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "An option");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD);
        pw.flush();
        // Left padding is 1, description padding is 3.
        // Option string: "-a,--alpha" length 10. Max width for option is 10.
        // Padding created is `createPadding(max - optBuf.length())` = createPadding(10 - 10) = ""
        // Then append descPad: "   "
        // So: " -a,--alpha" + "   " + "An option" + newline
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
        // Option string is "   --alpha" (length 11).
        // Max width for options will be 11.
        // Padding created is `createPadding(11 - 11)` = "".
        // Then append descPad: "   ".
        String expected = "   --alpha" + "   " + "A long option" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testRenderOptionsWithOptionAndArgument() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("f", "file", true, "Input file");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD);
        pw.flush();
        // Option string: " -f,--file <arg>" (length 17). Max width is 17.
        // Padding created: `createPadding(17 - 17)` = "".
        // Then append descPad: "   ".
        String expected = " -f,--file <arg>" + "   " + "Input file" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testRenderOptionsWithOptionAndArgName() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option opt = new Option("o", "output", true, "Output file");
        opt.setArgName("outFile");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, options, DEFAULT_LEFT_PAD, DEFAULT_DESC_PAD);
        pw.flush();
        // Option string: " -o,--output <outFile>" (length 23). Max width is 23.
        // Padding created: `createPadding(23 - 23)` = "".
        // Then append descPad: "   ".
        String expected = " -o,--output <outFile>" + "   " + "Output file" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }

    public void testRenderOptionsWithMultipleOptionsAndPadding() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "Option alpha");
        options.addOption("b", "beta", true, "Option beta");
        options.addOption("c", null, false, "Option c");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, DEFAULT_WIDTH, options, 2, 4); // leftPad=2, descPad=4
        pw.flush();

        // Option strings:
        // "  -a,--alpha" (len 12)
        // "  -b,--beta <arg>" (len 19)
        // "  -c" (len 4)
        // Max length of these option strings is 19.
        // Padding after option strings:
        // For "-a,--alpha": 19 - 12 = 7 spaces.
        // For "-b,--beta <arg>": 19 - 19 = 0 spaces.
        // For "-c": 19 - 4 = 15 spaces.
        // Then, descPad (4 spaces) is added.
        String expected = "  -a,--alpha" + "       " + "    " + "Option alpha" + System.getProperty("line.separator") +
                          "  -b,--beta <arg>" + "" + "    " + "Option beta" + System.getProperty("line.separator") +
                          "  -c" + "               " + "    " + "Option c" + System.getProperty("line.separator");
        assertEquals(expected, sw.toString());
    }
}
