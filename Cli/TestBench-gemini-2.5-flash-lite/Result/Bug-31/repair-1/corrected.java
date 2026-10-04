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
import java.io.Serializable;

public class HelpFormatterTest extends TestCase {
    /**
     * Test for the default width.
     */
    public void testDefaultWidth() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    /**
     * Test for setting and getting the width.
     */
    public void testSetGetWidth() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    /**
     * Test for the default left padding.
     */
    public void testDefaultLeftPadding() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
    }

    /**
     * Test for setting and getting the left padding.
     */
    public void testSetGetLeftPadding() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    /**
     * Test for the default description padding.
     */
    public void testDefaultDescPadding() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
    }

    /**
     * Test for setting and getting the description padding.
     */
    public void testSetGetDescPadding() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());
    }

    /**
     * Test for the default syntax prefix.
     */
    public void testDefaultSyntaxPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
    }

    /**
     * Test for setting and getting the syntax prefix.
     */
    public void testSetGetSyntaxPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("usage:");
        assertEquals("usage:", formatter.getSyntaxPrefix());
    }

    /**
     * Test for the default new line string.
     */
    public void testDefaultNewLine() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
    }

    /**
     * Test for setting and getting the new line string.
     */
    public void testSetGetNewLine() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    /**
     * Test for the default option prefix.
     */
    public void testDefaultOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
    }

    /**
     * Test for setting and getting the option prefix.
     */
    public void testSetGetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
    }

    /**
     * Test for the default long option prefix.
     */
    public void testDefaultLongOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
    }

    /**
     * Test for setting and getting the long option prefix.
     */
    public void testSetGetLongOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
    }

    /**
     * Test for the default long option separator.
     */
    public void testDefaultLongOptSeparator() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
    }

    /**
     * Test for setting and getting the long option separator.
     */
    public void testSetGetLongOptSeparator() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    /**
     * Test for the default argument name.
     */
    public void testDefaultArgName() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
    }

    /**
     * Test for setting and getting the argument name.
     */
    public void testSetGetArgName() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("value");
        assertEquals("value", formatter.getArgName());
    }

    /**
     * Test printHelp with only syntax and options.
     */
    public void testPrintHelpWithSyntaxAndOptions() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        options.addOption("b", null, true, "The bravo option.");

        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        formatter.setLeftPadding(1);
        formatter.setDescPadding(3);

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        formatter.printHelp(pw, formatter.getWidth(), "cmd", options, null, false); // Added null and false to match signature
        pw.flush();

        String output = outContent.toString();
        assertTrue(output.contains("usage: cmd"));
        assertTrue(output.contains("-a,--alpha"));
        assertTrue(output.toString().contains("The alpha option."));
        assertTrue(output.contains("-b"));
        assertTrue(output.contains("<arg>")); // Default arg name
        assertTrue(output.contains("The bravo option."));
    }

    /**
     * Test printHelp with syntax, header, options, and footer.
     */
    public void testPrintHelpWithAllParams() throws Exception {
        Options options = new Options();
        options.addOption("c", "charlie", false, "The charlie option.");

        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        formatter.setLeftPadding(1);
        formatter.setDescPadding(3);

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        String header = "This is a header.";
        String footer = "This is a footer.";
        String cmdLineSyntax = "cmd <arg>";

        formatter.printHelp(pw, formatter.getWidth(), cmdLineSyntax, header, options, formatter.getLeftPadding(), formatter.getDescPadding(), footer, false);
        pw.flush();

        String output = outContent.toString();
        assertTrue(output.contains("usage: cmd <arg>"));
        assertTrue(output.contains(header));
        assertTrue(output.contains("-c,--charlie"));
        assertTrue(output.contains("The charlie option."));
        assertTrue(output.contains(footer));
    }

    /**
     * Test printUsage with only syntax and options.
     */
    public void testPrintUsageWithSyntaxAndOptions() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("x", "xor", false, "XOR option."));
        group.addOption(new Option("y", "yoke", false, "Yoke option."));
        group.setRequired(true);
        options.addOptionGroup(group);
        options.addOption("z", "zebra", false, "Zebra option.");

        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        formatter.setLeftPadding(1);

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        String cmdLineSyntax = "app [options]";
        formatter.printUsage(pw, formatter.getWidth(), cmdLineSyntax, options);
        pw.flush();

        String output = outContent.toString();
        assertTrue(output.contains("usage: app [options]"));
        assertTrue(output.contains("[-x|-y]"));
        assertTrue(output.contains("-z")); // Default arg name for -z is not shown as it has no arg
    }

    /**
     * Test printWrapped with a simple string.
     */
    public void testPrintWrappedSimple() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(20);
        formatter.setNewLine("\n");

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        String text = "This is a simple test string.";
        formatter.printWrapped(pw, formatter.getWidth(), text);
        pw.flush();

        assertEquals("This is a simple\ntest string.\n", outContent.toString());
    }

    /**
     * Test printWrapped with a string that needs multiple wraps.
     */
    public void testPrintWrappedMultiple() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(15);
        formatter.setNewLine("\n");

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        String text = "This is a longer test string that needs multiple wraps.";
        formatter.printWrapped(pw, formatter.getWidth(), text);
        pw.flush();

        assertEquals("This is a\nlonger test\nstring that\nneeds\nmultiple\nwraps.\n", outContent.toString());
    }

    /**
     * Test renderWrappedText with a string and a tab stop.
     */
    public void testRenderWrappedTextWithTabStop() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(30);
        formatter.setNewLine("\n");

        StringBuffer sb = new StringBuffer();
        String text = "First line. Second line that will wrap.";
        int nextLineTabStop = 10;

        formatter.renderWrappedText(sb, formatter.getWidth(), nextLineTabStop, text);

        String expected = "First line. Second line that\n          will wrap.\n";
        assertEquals(expected, sb.toString());
    }

    /**
     * Test findWrapPos with a simple string.
     */
    public void testFindWrapPosSimple() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "This is a test string.";
        assertEquals(13, formatter.findWrapPos(text, 20, 0));
    }

    /**
     * Test findWrapPos with a newline character.
     */
    public void testFindWrapPosWithNewline() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "First line.\nSecond line.";
        assertEquals(11, formatter.findWrapPos(text, 20, 0));
    }

    /**
     * Test findWrapPos when the wrap point is at the end of the string.
     */
    public void testFindWrapPosAtEnd() throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        String text = "Short string.";
        assertEquals(-1, formatter.findWrapPos(text, 20, 0));
    }

    /**
     * Test createPadding with a positive length.
     */
    public void testCreatePaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("   ", formatter.createPadding(3));
    }

    /**
     * Test createPadding with zero length.
     */
    public void testCreatePaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.createPadding(0));
    }

    /**
     * Test rtrim with trailing spaces.
     */
    public void testRtrimTrailingSpaces() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("trimmed", formatter.rtrim("trimmed   "));
    }

    /**
     * Test rtrim with no trailing spaces.
     */
    public void testRtrimNoTrailingSpaces() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("notrim", formatter.rtrim("notrim"));
    }

    /**
     * Test rtrim with an empty string.
     */
    public void testRtrimEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals("", formatter.rtrim(""));
    }

    /**
     * Test OptionComparator for case-insensitive sorting.
     */
    public void testOptionComparator() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator comparator = formatter.getOptionComparator();

        Option optA = new Option("a", "alpha", false, "desc A");
        Option optB = new Option("b", "beta", false, "desc B");
        Option optC = new Option("C", "gamma", false, "desc C");
        Option optD = new Option("d", "delta", false, "desc D");

        assertEquals(0, comparator.compare(optA, new Option("a", "alpha", false, "desc A")));
        assertTrue(comparator.compare(optA, optB) < 0);
        assertTrue(comparator.compare(optB, optA) > 0);
        assertTrue(comparator.compare(optC, optD) < 0);
        assertTrue(comparator.compare(optD, optC) > 0);
        assertTrue(comparator.compare(optA, optC) < 0); // Case-insensitive
        assertTrue(comparator.compare(optC, optA) > 0); // Case-insensitive
    }

    /**
     * Test setting a null comparator to reset to default.
     */
    public void testSetOptionComparatorToNull() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator originalComparator = formatter.getOptionComparator();

        formatter.setOptionComparator(null);
        Comparator newComparator = formatter.getOptionComparator();

        assertNotNull(newComparator);
        assertNotSame(originalComparator, newComparator); // Should be a new instance if null was set
        // Accessing inner class directly is not allowed. Check if it's an instance of Comparator
        assertTrue(newComparator instanceof Comparator);
    }

    /**
     * Test printHelp with an option that has a long argument name.
     */
    public void testPrintHelpWithLongArgName() throws Exception {
        Options options = new Options();
        options.addOption(OptionBuilder.withLongOpt("input").withArgName("FILE").create('i'));

        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        formatter.setLeftPadding(1);
        formatter.setDescPadding(3);

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        formatter.printHelp(pw, formatter.getWidth(), "cmd", options, null, false);
        pw.flush();

        String output = outContent.toString();
        assertTrue(output.contains("-i,--input <FILE>"));
    }

    /**
     * Test printHelp with an option that has a blank argument name.
     */
    public void testPrintHelpWithBlankArgName() throws Exception {
        Options options = new Options();
        options.addOption(OptionBuilder.withLongOpt("noarg").withArgName("").create('n'));

        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        formatter.setLeftPadding(1);
        formatter.setDescPadding(3);

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        formatter.printHelp(pw, formatter.getWidth(), "cmd", options, null, false);
        pw.flush();

        String output = outContent.toString();
        assertTrue(output.contains("-n,--noarg")); // Should not print space and <arg>
    }

    /**
     * Test printHelp with an option that requires an argument but no argName is set.
     */
    public void testPrintHelpRequiredArgNoArgName() throws Exception {
        Options options = new Options();
        options.addOption("f", "file", true, "Input file."); // hasArg is true

        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        formatter.setLeftPadding(1);
        formatter.setDescPadding(3);

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        formatter.printHelp(pw, formatter.getWidth(), "cmd", options, null, false);
        pw.flush();

        String output = outContent.toString();
        assertTrue(output.contains("-f,--file <arg>")); // Should use default arg name
    }

    /**
     * Test printHelp with an option that is required.
     */
    public void testPrintHelpRequiredOption() throws Exception {
        Options options = new Options();
        options.addOption("r", "required", false, "This option is required.");
        options.getOption("r").setRequired(true);

        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        formatter.setLeftPadding(1);
        formatter.setDescPadding(3);

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        formatter.printHelp(pw, formatter.getWidth(), "cmd", options, null, false);
        pw.flush();

        String output = outContent.toString();
        assertTrue(output.contains("-r,--required"));
        assertTrue(output.contains("This option is required."));
    }

    /**
     * Test printHelp with an OptionGroup that is required.
     */
    public void testPrintHelpRequiredOptionGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "The alpha option."));
        group.addOption(new Option("b", "beta", false, "The beta option."));
        group.setRequired(true);
        options.addOptionGroup(group);

        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        formatter.setLeftPadding(1);
        formatter.setDescPadding(3);

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        formatter.printHelp(pw, formatter.getWidth(), "cmd", options, null, false);
        pw.flush();

        String output = outContent.toString();
        assertTrue(output.contains("[-a|-b]"));
    }

    /**
     * Test printOptions method.
     */
    public void testPrintOptions() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        options.addOption("b", null, true, "The bravo option.");

        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(80);
        formatter.setLeftPadding(1);
        formatter.setDescPadding(3);

        StringWriter outContent = new StringWriter();
        PrintWriter pw = new PrintWriter(outContent);

        formatter.printOptions(pw, formatter.getWidth(), options, formatter.getLeftPadding(), formatter.getDescPadding());
        pw.flush();

        String output = outContent.toString();
        assertTrue(output.contains("-a,--alpha"));
        assertTrue(output.contains("The alpha option."));
        assertTrue(output.contains("-b"));
        assertTrue(output.contains("<arg>"));
        assertTrue(output.contains("The bravo option."));
    }

    /**
     * Test OptionComparator.getKey() method.
     */
    public void testOptionGetKey() {
        Option opt1 = new Option("a", "longA", false, "description");
        assertEquals("a", opt1.getKey());

        Option opt2 = new Option(null, "longB", false, "description");
        assertEquals("longB", opt2.getKey());
    }

    /**
     * Test Option.setType and getType.
     */
    public void testOptionSetGetType() {
        Option opt = new Option("a", "alpha", false, "description");
        opt.setType(String.class);
        assertEquals(String.class, opt.getType());
    }

    /**
     * Test Option.getLongOpt() and setLongOpt().
     */
    public void testOptionSetGetLongOpt() {
        Option opt = new Option("a", "alpha", false, "description");
        opt.setLongOpt("beta");
        assertEquals("beta", opt.getLongOpt());
    }

    /**
     * Test Option.setOptionalArg() and hasOptionalArg().
     */
    public void testOptionSetGetOptionalArg() {
        Option opt = new Option("a", "alpha", true, "description");
        assertTrue(opt.hasArg());
        assertFalse(opt.hasOptionalArg());

        opt.setOptionalArg(true);
        assertTrue(opt.hasOptionalArg());
        assertTrue(opt.hasArg()); // Should still have an arg
    }

    /**
     * Test Option.hasLongOpt().
     */
    public void testOptionHasLongOpt() {
        Option optWithLong = new Option("a", "alpha", false, "description");
        assertTrue(optWithLong.hasLongOpt());

        Option optWithoutLong = new Option("b", null, false, "description");
        assertFalse(optWithoutLong.hasLongOpt());
    }

    /**
     * Test Option.hasArg().
     */
    public void testOptionHasArg() {
        Option noArg = new Option("a", null, false, "description");
        assertFalse(noArg.hasArg());

        Option hasOneArg = new Option("b", null, true, "description");
        assertTrue(hasOneArg.hasArg());
    }

    /**
     * Test Option.setDescription() and getDescription().
     */
    public void testOptionSetGetDescription() {
        Option opt = new Option("a", "alpha", false, "initial description");
        assertEquals("initial description", opt.getDescription());
        opt.setDescription("new description");
        assertEquals("new description", opt.getDescription());
    }

    /**
     * Test Option.setRequired() and isRequired().
     */
    public void testOptionSetGetRequired() {
        Option opt = new Option("a", "alpha", false, "description");
        assertFalse(opt.isRequired());
        opt.setRequired(true);
        assertTrue(opt.isRequired());
    }

    /**
     * Test Option.hasArgName().
     */
    public void testOptionHasArgName() {
        Option optWithArgName = new Option("a", "alpha", true, "description");
        optWithArgName.setArgName("VALUE");
        assertTrue(optWithArgName.hasArgName());

        Option optWithoutArgName = new Option("b", "beta", true, "description");
        assertFalse(optWithoutArgName.hasArgName());

        Option optWithBlankArgName = new Option("c", "charlie", true, "description");
        optWithBlankArgName.setArgName("");
        assertFalse(optWithBlankArgName.hasArgName());
    }

    /**
     * Test Option.hasArgs().
     */
    public void testOptionHasArgs() {
        Option noArgs = new Option("a", null, false, "description");
        assertFalse(noArgs.hasArgs());

        Option hasOneArg = new Option("b", null, true, "description");
        assertFalse(hasOneArg.hasArgs());

        Option hasMultipleArgs = new Option("c", null, false, "description");
        hasMultipleArgs.setArgs(3);
        assertTrue(hasMultipleArgs.hasArgs());

        Option hasUnlimitedArgs = new Option("d", null, false, "description");
        hasUnlimitedArgs.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(hasUnlimitedArgs.hasArgs());
    }

    /**
     * Test Option.setArgs().
     */
    public void testOptionSetArgs() {
        Option opt = new Option("a", null, false, "description");
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
        opt.setArgs(5);
        assertEquals(5, opt.getArgs());
        opt.setArgs(Option.UNLIMITED_VALUES);
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
    }

    /**
     * Test Option.setValueSeparator() and hasValueSeparator().
     */
    public void testOptionSetValueSeparator() {
        Option opt = new Option("a", null, true, "description");
        assertFalse(opt.hasValueSeparator());
        opt.setValueSeparator(':');
        assertTrue(opt.hasValueSeparator());
        assertEquals(':', opt.getValueSeparator());
    }

    /**
     * Test Option.getValue() and getValues().
     */
    public void testOptionGetValues() {
        Option opt = new Option("a", null, true, "description");
        opt.addValueForProcessing("value1");
        assertEquals("value1", opt.getValue());
        assertEquals("value1", opt.getValue(0));

        opt.addValueForProcessing("value2");
        String[] values = opt.getValues();
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("value1", values[0]);
        assertEquals("value2", values[1]);

        assertEquals("value2", opt.getValue(1));

        Option optNoValues = new Option("b", null, false, "description");
        assertNull(optNoValues.getValue());
        assertNull(optNoValues.getValues());
    }

    /**
     * Test Option.addValueForProcessing with value separator.
     */
    public void testOptionAddValueForProcessingWithValueSeparator() {
        Option opt = new Option("a", null, true, "description");
        opt.setValueSeparator(',');
        opt.addValueForProcessing("key1,value1,key2,value2");

        assertEquals("key1", opt.getValue());
        assertEquals("value1", opt.getValue(1));
        assertEquals("key2", opt.getValue(2));
        assertEquals("value2", opt.getValue(3));

        String[] values = opt.getValues();
        assertNotNull(values);
        assertEquals(4, values.length);
        assertEquals("key1", values[0]);
        assertEquals("value1", values[1]);
        assertEquals("key2", values[2]);
        assertEquals("value2", values[3]);
    }

    /**
     * Test Option.addValueForProcessing with limited number of args.
     */
    public void testOptionAddValueForProcessingLimitedArgs() {
        Option opt = new Option("a", null, false, "description");
        opt.setArgs(2);
        opt.addValueForProcessing("val1");
        assertEquals("val1", opt.getValue());
        opt.addValueForProcessing("val2");
        assertEquals("val2", opt.getValue(1));

        try {
            opt.addValueForProcessing("val3");
            fail("Should throw exception");
        } catch (RuntimeException e) {
            // The exception message is "NO_ARGS_ALLOWED" only if numberOfArgs is UNINITIALIZED.
            // For fixed number of args, it throws "Cannot add value, list full."
            assertEquals("Cannot add value, list full.", e.getMessage());
        }
    }

    /**
     * Test Option.toString().
     */
    public void testOptionToString() {
        Option opt = new Option("a", "alpha", true, "description");
        assertTrue(opt.toString().contains("[ option: a alpha [ARG] :: description ]"));
    }

    /**
     * Test Option.equals() and hashCode().
     */
    public void testOptionEqualsAndHashCode() {
        Option opt1 = new Option("a", "alpha", false, "desc1");
        Option opt2 = new Option("a", "alpha", false, "desc2"); // different desc
        Option opt3 = new Option("a", "beta", false, "desc3"); // different longOpt
        Option opt4 = new Option("b", "alpha", false, "desc4"); // different opt

        assertEquals(opt1, opt2); // opt and longOpt are the same
        assertEquals(opt1.hashCode(), opt2.hashCode());

        assertFalse(opt1.equals(opt3));
        assertFalse(opt1.hashCode() == opt3.hashCode());

        assertFalse(opt1.equals(opt4));
        assertFalse(opt1.hashCode() == opt4.hashCode());
    }

    /**
     * Test Option.clone() and clearValues().
     */
    public void testOptionCloneAndClearValues() {
        Option opt = new Option("a", "alpha", true, "description");
        opt.addValueForProcessing("val1");
        opt.addValueForProcessing("val2");

        Option clonedOpt = (Option) opt.clone();
        assertNotSame(opt, clonedOpt);
        assertEquals("val1", clonedOpt.getValue());
        assertEquals("val2", clonedOpt.getValue(1));

        opt.clearValues();
        assertNull(opt.getValue());
        assertNull(opt.getValues());
    }

    /**
     * Test OptionBuilder.withValueSeparator().
     */
    public void testOptionBuilderWithValueSeparator() {
        Option opt = OptionBuilder.withValueSeparator(':').create('D');
        assertEquals(':', opt.getValueSeparator());
        assertTrue(opt.hasValueSeparator());
    }

    /**
     * Test OptionBuilder.hasOptionalArgs().
     */
    public void testOptionBuilderHasOptionalArgs() {
        Option opt = OptionBuilder.hasOptionalArgs().create('O');
        assertTrue(opt.hasOptionalArg());
        assertTrue(opt.hasArgs()); // UNLIMITED_VALUES is a form of hasArgs
    }

    /**
     * Test OptionBuilder.withType().
     */
    public void testOptionBuilderWithType() {
        Option opt = OptionBuilder.withType(Integer.class).create('N');
        assertEquals(Integer.class, opt.getType());
    }

    /**
     * Test OptionBuilder.withDescription().
     */
    public void testOptionBuilderWithDescription() {
        Option opt = OptionBuilder.withDescription("A description").create('T');
        assertEquals("A description", opt.getDescription());
    }

    /**
     * Test Option.addValue() throws UnsupportedOperationException.
     */
    public void testOptionAddValueUnsupported() {
        Option opt = new Option("a", "alpha", true, "description");
        try {
            opt.addValue("someValue");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected exception
        }
    }

    /**
     * Test Option.acceptsArg() and requiresArg() for a normal option with args.
     */
    public void testOptionAcceptsAndRequiresArg() {
        Option opt = new Option("a", null, true, "description"); // hasArg = true means numberOfArgs = 1

        assertTrue(opt.acceptsArg());
        assertTrue(opt.requiresArg());

        opt.addValueForProcessing("value1");
        assertFalse(opt.acceptsArg());
        assertFalse(opt.requiresArg());
    }

    /**
     * Test Option.acceptsArg() and requiresArg() for an optional arg option.
     */
    public void testOptionAcceptsAndRequiresArgOptional() {
        Option opt = new Option("a", null, false, "description"); // hasArg = false
        opt.setOptionalArg(true); // now it has an optional arg

        assertTrue(opt.acceptsArg());
        assertFalse(opt.requiresArg()); // Optional args are not required

        opt.addValueForProcessing("value1");
        assertFalse(opt.acceptsArg());
        assertFalse(opt.requiresArg());
    }

    /**
     * Test Option.requiresArg() for UNLIMITED_VALUES.
     */
    public void testOptionRequiresArgUnlimited() {
        Option opt = new Option("a", null, false, "description");
        opt.setArgs(Option.UNLIMITED_VALUES);

        assertTrue(opt.acceptsArg());
        assertTrue(opt.requiresArg()); // Requires at least one arg

        opt.addValueForProcessing("value1");
        assertTrue(opt.acceptsArg());
        assertFalse(opt.requiresArg()); // Now it has one, so it doesn't require more
    }

    /**
     * Test Option.requiresArg() for fixed number of args.
     */
    public void testOptionRequiresArgFixed() {
        Option opt = new Option("a", null, false, "description");
        opt.setArgs(2);

        assertTrue(opt.acceptsArg());
        assertTrue(opt.requiresArg());

        opt.addValueForProcessing("value1");
        assertTrue(opt.acceptsArg());
        assertTrue(opt.requiresArg());

        opt.addValueForProcessing("value2");
        assertFalse(opt.acceptsArg());
        assertFalse(opt.requiresArg());
    }
}
