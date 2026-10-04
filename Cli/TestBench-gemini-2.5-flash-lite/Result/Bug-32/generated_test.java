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
        
        String expected = "usage: mycli -a,--alpha" + formatter.getNewLine() +
                          "  -a,--alpha  An option." + formatter.getNewLine();
        
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
                          "  -r,--required  A required option." + formatter.getNewLine();
        
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

        String expected = "usage: mycli -a | -b" + formatter.getNewLine() +
                          "  -a,--alpha  First option." + formatter.getNewLine() +
                          "  -b,--beta  Second option." + formatter.getNewLine();
                          
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

        String expected = "usage: mycli [-a | -b]" + formatter.getNewLine() +
                          "  -a,--alpha  First option." + formatter.getNewLine() +
                          "  -b,--beta  Second option." + formatter.getNewLine();
                          
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
        
        formatter.printWrapped(pw, 20, text);
        pw.flush();
        
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
        int tabStop = 10; 
        
        formatter.printWrapped(pw, width, tabStop, text);
        pw.flush();
        
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
        
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        
        String output = sb.toString();

        assertTrue("Missing -a", output.contains("-a"));
        assertTrue("Missing --alpha", output.contains("--alpha"));
        assertTrue("Missing description for alpha", output.contains("Description for alpha."));
        
        assertTrue("Missing -b", output.contains("-b"));
        assertTrue("Missing --beta", output.contains("--beta"));
        assertTrue("Missing argument indicator for beta", output.contains("<beta>"));
        assertTrue("Missing description for beta", output.contains("Description for beta."));
        
        assertTrue("Missing -c", output.contains("-c"));
        assertTrue("Missing --delta", output.contains("--delta"));
        assertTrue("Missing argument indicator for delta", output.contains("<arg>")); 
        assertTrue("Missing description for delta", output.contains("Description for Delta."));

        assertTrue("Missing description for epsilon", output.contains("Description for epsilon with a long description that should wrap."));
    }

    public void testFindWrapPosSimple() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(10, formatter.findWrapPos("This is a test", 15, 0));
        assertEquals(-1, formatter.findWrapPos("This is a test", 20, 0));
        assertEquals(5, formatter.findWrapPos("Line1\nLine2", 10, 0)); 
    }

    public void testFindWrapPosNoSpace() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(15, formatter.findWrapPos("Thisisaverylongword", 15, 0));
    }

    public void testFindWrapPosAtWidthLimit() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(11, formatter.findWrapPos("This is the first", 11, 0)); // Space at index 11
    }

    public void testFindWrapPosWithTab() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(5, formatter.findWrapPos("Hello\tWorld", 10, 0)); 
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
        
        // The printUsage method itself does not take autoUsage.
        // The printHelp method calls printUsage(pw, width, cmdLineSyntax, options) when autoUsage is true.
        // The printUsage method appends the arguments as "-f,--file", not as "[-f,--file]".
        formatter.printUsage(pw, formatter.getWidth(), cmdLineSyntax, options);
        pw.flush();
        
        assertEquals("Auto usage printUsage mismatch", "usage: mycli -f,--file" + formatter.getNewLine(), sw.toString());
    }
}
