package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest extends TestCase {

    // Test methods for the Parser class.

    public void testParseSimple() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        Parser parser = new BasicParser();
        String[] args = {"-a"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option a", cl.hasOption("a"));
    }

    public void testParseWithArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "The alpha option.");
        Parser parser = new BasicParser();
        String[] args = {"-a", "value"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option a", cl.hasOption("a"));
        assertEquals("Option a value", "value", cl.getOptionValue("a"));
    }

    public void testParseMultipleArguments() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "The alpha option.");
        Parser parser = new BasicParser();
        String[] args = {"-a", "value1", "-a", "value2"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option a", cl.hasOption("a"));
        assertEquals("Option a values count", 2, cl.getOptionValues("a").length);
        assertEquals("Option a value 1", "value1", cl.getOptionValues("a")[0]);
        assertEquals("Option a value 2", "value2", cl.getOptionValues("a")[1]);
    }

    public void testParseWithRequiredOption() throws Exception {
        Options options = new Options();
        // setRequired is on Option, not Options
        options.addOption(new Option("a", "alpha", false, "The alpha option.").setRequired(true));
        Parser parser = new BasicParser();
        String[] args = {"-a"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option a", cl.hasOption("a"));
    }

    public void testParseMissingRequiredOption() throws Exception {
        Options options = new Options();
        // setRequired is on Option, not Options
        options.addOption(new Option("a", "alpha", false, "The alpha option.").setRequired(true));
        Parser parser = new BasicParser();
        String[] args = {};
        try {
            parser.parse(options, args);
            fail("MissingRequiredOptionException should be thrown");
        } catch (MissingOptionException e) {
            assertTrue("Missing option should be 'a'", e.getMissingOptions().contains("a"));
        }
    }

    public void testParseWithTwoDashes() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        Parser parser = new BasicParser();
        String[] args = {"--", "-a"};
        CommandLine cl = parser.parse(options, args);
        assertFalse("Should not have option a", cl.hasOption("a"));
        assertEquals("Should have one argument", 1, cl.getArgs().length);
        assertEquals("Argument should be '-a'", "-a", cl.getArgs()[0]);
    }

    public void testParseSingleDashAsArgument() throws Exception {
        Options options = new Options();
        Parser parser = new BasicParser();
        String[] args = {"-"};
        CommandLine cl = parser.parse(options, args);
        assertEquals("Should have one argument", 1, cl.getArgs().length);
        assertEquals("Argument should be '-'", "-", cl.getArgs()[0]);
    }

    public void testParseSingleDashAsArgumentWhenStopAtNonOption() throws Exception {
        Options options = new Options();
        Parser parser = new BasicParser();
        String[] args = {"-"};
        CommandLine cl = parser.parse(options, args, true);
        assertEquals("Should have one argument", 1, cl.getArgs().length);
        assertEquals("Argument should be '-'", "-", cl.getArgs()[0]);
    }

    public void testParseWithProperties() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "The alpha option.");
        Parser parser = new BasicParser();
        Properties props = new Properties();
        props.setProperty("a", "prop_value");
        String[] args = {};
        CommandLine cl = parser.parse(options, args, props);
        assertTrue("Should have option a", cl.hasOption("a"));
        assertEquals("Option a value from properties", "prop_value", cl.getOptionValue("a"));
    }

    public void testParseWithPropertiesAndCommandLineArg() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "The alpha option.");
        Parser parser = new BasicParser();
        Properties props = new Properties();
        props.setProperty("a", "prop_value");
        String[] args = {"-a", "cli_value"};
        CommandLine cl = parser.parse(options, args, props);
        assertTrue("Should have option a", cl.hasOption("a"));
        assertEquals("Option a value from command line", "cli_value", cl.getOptionValue("a"));
    }

    public void testParsePropertiesOverrideCommandLine() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "The alpha option.");
        Parser parser = new BasicParser();
        Properties props = new Properties();
        props.setProperty("a", "prop_value");
        // The current implementation processes properties *before* command line args,
        // so command line args take precedence.
        String[] args = {"-a", "cli_value"};
        CommandLine cl = parser.parse(options, args, props);
        assertTrue("Should have option a", cl.hasOption("a"));
        assertEquals("Option a value from command line (overrides properties)", "cli_value", cl.getOptionValue("a"));
    }

    public void testParseMultipleValuesWithSeparator() throws Exception {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file");
        opt.setArgs(Option.UNLIMITED_VALUES);
        opt.setValueSeparator(',');
        options.addOption(opt);
        Parser parser = new BasicParser();
        String[] args = {"-f", "file1,file2,file3"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option f", cl.hasOption("f"));
        String[] values = cl.getOptionValues("f");
        assertEquals("Should have 3 values", 3, values.length);
        assertEquals("Value 1", "file1", values[0]);
        assertEquals("Value 2", "file2", values[1]);
        assertEquals("Value 3", "file3", values[2]);
    }

    public void testParseMultipleValuesWithSeparatorAndNoValue() throws Exception {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file");
        opt.setArgs(Option.UNLIMITED_VALUES);
        opt.setValueSeparator(',');
        options.addOption(opt);
        Parser parser = new BasicParser();
        String[] args = {"-f"};
        try {
            parser.parse(options, args);
            fail("Missing argument exception expected");
        } catch (MissingArgumentException e) {
            // expected
        }
    }

    public void testParseMultipleValuesWithSeparatorAndEmptyValue() throws Exception {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file");
        opt.setArgs(Option.UNLIMITED_VALUES);
        opt.setValueSeparator(',');
        options.addOption(opt);
        Parser parser = new BasicParser();
        String[] args = {"-f", ""};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option f", cl.hasOption("f"));
        String[] values = cl.getOptionValues("f");
        assertEquals("Should have 1 value", 1, values.length);
        assertEquals("Value 1", "", values[0]);
    }

    public void testParseUnknownOption() throws Exception {
        Options options = new Options();
        Parser parser = new BasicParser();
        String[] args = {"-x"};
        try {
            parser.parse(options, args);
            fail("UnrecognizedOptionException should be thrown");
        } catch (UnrecognizedOptionException e) {
            assertEquals("Unrecognized option should be '-x'", "-x", e.getOption());
        }
    }

    public void testParseUnknownOptionWhenStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        Parser parser = new BasicParser();
        String[] args = {"-x", "-a"};
        CommandLine cl = parser.parse(options, args, true);
        assertFalse("Should not have option x", cl.hasOption("x"));
        assertEquals("Should have '-x' as an argument", "-x", cl.getArgs()[0]);
        assertTrue("Should have option a", cl.hasOption("a"));
    }

    public void testParseNullArguments() throws Exception {
        Options options = new Options();
        Parser parser = new BasicParser();
        CommandLine cl = parser.parse(options, null);
        assertEquals("Should have no arguments", 0, cl.getArgs().length);
        assertEquals("Should have no options", 0, cl.getOptions().length);
    }

    public void testParseOptionWithOptionalArg() throws Exception {
        Options options = new Options();
        Option opt = new Option("o", "optional", false, "optional arg");
        opt.setOptionalArg(true);
        options.addOption(opt);
        Parser parser = new BasicParser();

        // Case 1: Option without argument
        String[] args1 = {"-o"};
        CommandLine cl1 = parser.parse(options, args1);
        assertTrue("Should have option o", cl1.hasOption("o"));
        assertNull("Option o should have no value", cl1.getOptionValue("o"));

        // Case 2: Option with argument
        String[] args2 = {"-o", "value"};
        CommandLine cl2 = parser.parse(options, args2);
        assertTrue("Should have option o", cl2.hasOption("o"));
        assertEquals("Option o value", "value", cl2.getOptionValue("o"));
    }

    public void testParseOptionWithOptionalArgWhenNextIsOption() throws Exception {
        Options options = new Options();
        Option opt = new Option("o", "optional", false, "optional arg");
        opt.setOptionalArg(true);
        options.addOption(opt);
        options.addOption("a", "alpha", false, "The alpha option.");
        Parser parser = new BasicParser();
        String[] args = {"-o", "-a"}; // "-a" should be parsed as an argument to -o if -o has an optional arg
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option o", cl.hasOption("o"));
        assertEquals("Option o value", "-a", cl.getOptionValue("o"));
        assertFalse("Should not have option a directly", cl.hasOption("a"));
    }

    public void testFlattenWithStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "alpha");
        Parser parser = new BasicParser();
        String[] args = {"-a", "-b", "c"};
        String[] flattened = parser.flatten(options, args, true);
        assertEquals("Flattened args count", 3, flattened.length);
        assertEquals("Flattened arg 0", "-a", flattened[0]);
        assertEquals("Flattened arg 1", "-b", flattened[1]);
        assertEquals("Flattened arg 2", "c", flattened[2]);
    }

    public void testFlattenWithoutStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "alpha");
        Parser parser = new BasicParser();
        String[] args = {"-a", "-b", "c"};
        try {
            parser.flatten(options, args, false);
            fail("UnrecognizedOptionException expected for -b");
        } catch (UnrecognizedOptionException e) {
            assertEquals("Unrecognized option should be '-b'", "-b", e.getOption());
        }
    }

    public void testFlattenWithDashes() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "alpha");
        Parser parser = new BasicParser();
        String[] args = {"-a", "--", "-b", "c"};
        String[] flattened = parser.flatten(options, args, false);
        assertEquals("Flattened args count", 4, flattened.length);
        assertEquals("Flattened arg 0", "-a", flattened[0]);
        assertEquals("Flattened arg 1", "--", flattened[1]);
        assertEquals("Flattened arg 2", "-b", flattened[2]);
        assertEquals("Flattened arg 3", "c", flattened[3]);
    }

    public void testProcessArgsWhenOptionRequiresArgument() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "alpha", true, "alpha option");
        options.addOption(opt);
        Parser parser = new BasicParser();
        // Using a simple List and creating a ListIterator
        List<String> argList = new ArrayList<>(Arrays.asList("value1", "value2"));
        ListIterator<String> iter = argList.listIterator();
        iter.next(); // Advance iterator to be before "value2"
        parser.processArgs(opt, iter);
        assertEquals("Value added should be 'value1'", "value1", opt.getValue());
        // Ensure the iterator is correctly positioned after processing
        assertTrue("Iterator should have next element", iter.hasNext());
        assertEquals("Next element should be 'value2'", "value2", iter.next());
    }

    public void testProcessArgsWhenOptionRequiresArgumentAndNoMoreArgs() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "alpha", true, "alpha option");
        options.addOption(opt);
        Parser parser = new BasicParser();
        List<String> argList = new ArrayList<>(Arrays.asList("value1"));
        ListIterator<String> iter = argList.listIterator();
        parser.processArgs(opt, iter);
        assertEquals("Value added should be 'value1'", "value1", opt.getValue());
        assertFalse("Iterator should not have next element", iter.hasNext());
    }

    public void testProcessArgsWhenOptionRequiresArgumentAndIsLastElement() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "alpha", true, "alpha option");
        options.addOption(opt);
        Parser parser = new BasicParser();
        List<String> argList = new ArrayList<>(Arrays.asList("value1"));
        ListIterator<String> iter = argList.listIterator();
        // Need to consume the argument to simulate it being the last one.
        // The iterator will then be at the end.
        iter.next();
        // Now, calling processArgs with the iterator at the end should throw MissingArgumentException
        // if the option requires an argument.
        // However, the current logic in processArgs is to check iter.hasNext() *after*
        // trying to add a value. So the check needs to happen when the loop finishes.
        // To simulate the scenario where the argument for '-a' is missing, and '-a' is the last token:
        // The loop in processArgs will try to get next(), fail, break, and then check opt.getValues().
        // If opt.getValues() is null, it throws MissingArgumentException.
        // So, we need to ensure that 'value1' is NOT added.
        // The current implementation of processArgs will add 'value1' and then when it tries to get the *next* argument (which is missing),
        // it will break. If opt.getValues() is null, it throws exception.
        // Let's test the case where an option requires an argument, and there are no more tokens.
        Option requiredOpt = new Option("r", "required", true, "A required argument.");
        options.addOption(requiredOpt);
        List<String> tokens = new ArrayList<>();
        tokens.add("-r"); // Option that needs an argument
        ListIterator<String> tokensIter = tokens.listIterator();
        try {
            parser.processArgs(requiredOpt, tokensIter); // This will attempt to process args for -r
            fail("MissingArgumentException expected because no argument is provided for -r");
        } catch (MissingArgumentException e) {
            // expected
        }
    }

    public void testProcessOptionWhenRequired() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "alpha", false, "alpha option");
        opt.setRequired(true);
        options.addOption(opt);
        Parser parser = new BasicParser();
        // The check for required options happens after processing all tokens.
        // This test just ensures processOption doesn't throw an exception
        // when a required option is encountered. The MissingOptionException
        // is tested in testParseMissingRequiredOption.
        String[] args = {"-a"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option a", cl.hasOption("a"));
    }

    public void testProcessOptionWithOptionGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "alpha option");
        Option opt2 = new Option("b", "beta", false, "beta option");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);
        Parser parser = new BasicParser();
        String[] args = {"-a"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option a", cl.hasOption("a"));
        // The selected option is stored in the OptionGroup itself, and retrieved via getOptionGroup(opt)
        assertEquals("Selected option in group should be 'a'", "a", options.getOptionGroup(opt1).getSelected());
    }

    public void testProcessOptionWithOptionGroupWhenAlreadySelected() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "alpha option");
        Option opt2 = new Option("b", "beta", false, "beta option");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);
        Parser parser = new BasicParser();
        String[] args = {"-a", "-b"};
        try {
            parser.parse(options, args);
            fail("AlreadySelectedException should be thrown");
        } catch (AlreadySelectedException e) {
            // expected
        }
    }

    public void testClearOptionsAndGroupsOnParse() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "alpha");
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("b", false, "beta"));
        options.addOptionGroup(group);
        Parser parser = new BasicParser();

        String[] args1 = {"-a"};
        CommandLine cl1 = parser.parse(options, args1);
        assertTrue("Should have option a after first parse", cl1.hasOption("a"));

        // Re-parse with different arguments, should clear previous state
        String[] args2 = {"-b"};
        CommandLine cl2 = parser.parse(options, args2);
        assertFalse("Should not have option a after second parse", cl2.hasOption("a"));
        assertTrue("Should have option b after second parse", cl2.hasOption("b"));
    }

    public void testParseWithLongOption() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "The alpha option.");
        Parser parser = new BasicParser();
        String[] args = {"--alpha"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option alpha", cl.hasOption("alpha"));
    }

    public void testParseWithLongOptionAndArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "The alpha option.");
        Parser parser = new BasicParser();
        String[] args = {"--alpha", "value"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option alpha", cl.hasOption("alpha"));
        assertEquals("Option alpha value", "value", cl.getOptionValue("alpha"));
    }

    public void testParseWithLongOptionAndArgumentColonSyntax() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "The alpha option.");
        Parser parser = new BasicParser();
        String[] args = {"--alpha=value"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option alpha", cl.hasOption("alpha"));
        assertEquals("Option alpha value", "value", cl.getOptionValue("alpha"));
    }

    public void testParseWithShortOptionAndArgumentColonSyntax() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "The alpha option.");
        Parser parser = new BasicParser();
        String[] args = {"-a:value"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option a", cl.hasOption("a"));
        assertEquals("Option a value", "value", cl.getOptionValue("a"));
    }

    public void testParseOptionThatTakesMultipleArguments() throws Exception {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file");
        opt.setArgs(2); // Expecting two arguments
        options.addOption(opt);
        Parser parser = new BasicParser();
        String[] args = {"-f", "file1", "file2"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option f", cl.hasOption("f"));
        String[] values = cl.getOptionValues("f");
        assertEquals("Should have 2 values", 2, values.length);
        assertEquals("Value 1", "file1", values[0]);
        assertEquals("Value 2", "file2", values[1]);
    }

    public void testParseOptionThatTakesMultipleArgumentsAndMissingOne() throws Exception {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file");
        opt.setArgs(2); // Expecting two arguments
        options.addOption(opt);
        Parser parser = new BasicParser();
        String[] args = {"-f", "file1"};
        try {
            parser.parse(options, args);
            fail("MissingArgumentException expected");
        } catch (MissingArgumentException e) {
            // expected
        }
    }

    public void testParseOptionThatTakesMultipleArgumentsAndMoreThanExpected() throws Exception {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file");
        opt.setArgs(2); // Expecting two arguments
        options.addOption(opt);
        Parser parser = new BasicParser();
        String[] args = {"-f", "file1", "file2", "file3"};
        CommandLine cl = parser.parse(options, args);
        assertTrue("Should have option f", cl.hasOption("f"));
        String[] values = cl.getOptionValues("f");
        assertEquals("Should have 2 values for f", 2, values.length);
        assertEquals("Value 1", "file1", values[0]);
        assertEquals("Value 2", "file2", values[1]);
        // The remaining argument "file3" should be captured as a command-line argument
        assertEquals("Remaining arg count", 1, cl.getArgs().length);
        assertEquals("Remaining arg", "file3", cl.getArgs()[0]);
    }

    public void testParseWhenStopAtNonOptionAndNonOptionIsFirst() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "alpha");
        Parser parser = new BasicParser();
        String[] args = {"arg1", "-a"};
        CommandLine cl = parser.parse(options, args, true);
        assertFalse("Should not have option a", cl.hasOption("a"));
        assertEquals("Should have one argument", 1, cl.getArgs().length);
        assertEquals("Argument should be 'arg1'", "arg1", cl.getArgs()[0]);
    }

    public void testParseWithEmptyArgsArray() throws Exception {
        Options options = new Options();
        Parser parser = new BasicParser();
        String[] args = {};
        CommandLine cl = parser.parse(options, args);
        assertEquals("Should have no arguments", 0, cl.getArgs().length);
        assertEquals("Should have no options", 0, cl.getOptions().length);
    }
}
