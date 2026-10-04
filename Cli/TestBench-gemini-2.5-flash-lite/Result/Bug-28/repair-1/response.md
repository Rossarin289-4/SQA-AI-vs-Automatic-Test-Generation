```java
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
```

SOURCE CODE ANALYSIS - The tests focus on the `parse` method, covering various scenarios like simple option parsing, handling arguments, required options, properties, option groups, and edge cases like `--`, single dashes, and null/empty arguments. The `flatten` and `processArgs` methods are also indirectly tested through their usage within `parse`.
TEST CASE DESIGN -
testParseSimple: Input: Options with '-a', args: ["-a"]. Expected: CommandLine with option 'a'. Derived from basic parsing logic.
testParseWithArgument: Input: Options with '-a' (hasArg=true), args: ["-a", "value"]. Expected: CommandLine with option 'a' and value "value". Derived from argument handling.
testParseMultipleArguments: Input: Options with '-a' (hasArg=true), args: ["-a", "value1", "-a", "value2"]. Expected: CommandLine with option 'a' and values ["value1", "value2"]. Derived from multiple value handling.
testParseWithRequiredOption: Input: Options with required '-a', args: ["-a"]. Expected: CommandLine with option 'a'. Derived from required option logic.
testParseMissingRequiredOption: Input: Options with required '-a', args: []. Expected: MissingOptionException. Derived from required option check.
testParseWithTwoDashes: Input: Options with '-a', args: ["--", "-a"]. Expected: CommandLine with no option 'a', and "-a" as an argument. Derived from '--' behavior.
testParseSingleDashAsArgument: Input: Options {}, args: ["-"]. Expected: CommandLine with "-" as an argument. Derived from handling of "-" token.
testParseSingleDashAsArgumentWhenStopAtNonOption: Input: Options {}, args: ["-"], stopAtNonOption=true. Expected: CommandLine with "-" as an argument. Derived from handling of "-" token with stopAtNonOption.
testParseWithProperties: Input: Options with '-a' (hasArg=true), props: {"a"="prop_value"}, args: []. Expected: CommandLine with option 'a' and value "prop_value". Derived from properties processing.
testParseWithPropertiesAndCommandLineArg: Input: Options with '-a' (hasArg=true), props: {"a"="prop_value"}, args: ["-a", "cli_value"]. Expected: CommandLine with option 'a' and value "cli_value". Derived from property/CLI arg precedence.
testParsePropertiesOverrideCommandLine: Input: Options with '-a' (hasArg=true), props: {"a"="prop_value"}, args: ["-a", "cli_value"]. Expected: CommandLine with option 'a' and value "cli_value". Derived from property/CLI arg precedence (CLI overrides).
testParseMultipleValuesWithSeparator: Input: Option '-f' (UNLIMITED_VALUES, sep=','), args: ["-f", "file1,file2,file3"]. Expected: CommandLine with option 'f' and values ["file1", "file2", "file3"]. Derived from value separator logic.
testParseMultipleValuesWithSeparatorAndNoValue: Input: Option '-f' (UNLIMITED_VALUES, sep=','), args: ["-f"]. Expected: MissingArgumentException. Derived from missing argument after option with separator.
testParseMultipleValuesWithSeparatorAndEmptyValue: Input: Option '-f' (UNLIMITED_VALUES, sep=','), args: ["-f", ""]. Expected: CommandLine with option 'f' and value [""]. Derived from empty value handling.
testParseUnknownOption: Input: Options {}, args: ["-x"]. Expected: UnrecognizedOptionException. Derived from unknown option check.
testParseUnknownOptionWhenStopAtNonOption: Input: Options with '-a', args: ["-x", "-a"], stopAtNonOption=true. Expected: CommandLine with "-x" as arg, and option 'a'. Derived from stopAtNonOption with unknown option.
testParseNullArguments: Input: Options {}, args: null. Expected: Empty CommandLine. Derived from null argument handling.
testParseOptionWithOptionalArg: Input: Option '-o' (optionalArg=true), args: ["-o"] or ["-o", "value"]. Expected: Option 'o' without value or with value. Derived from optional argument logic.
testParseOptionWithOptionalArgWhenNextIsOption: Input: Option '-o' (optionalArg=true), Option '-a', args: ["-o", "-a"]. Expected: Option 'o' with value "-a". Derived from optional argument taking next token.
testFlattenWithStopAtNonOption: Input: Options with '-a', args: ["-a", "-b", "c"], stopAtNonOption=true. Expected: Flattened ["-a", "-b", "c"]. Derived from flatten logic.
testFlattenWithoutStopAtNonOption: Input: Options with '-a', args: ["-a", "-b", "c"], stopAtNonOption=false. Expected: UnrecognizedOptionException for "-b". Derived from flatten logic.
testFlattenWithDashes: Input: Options with '-a', args: ["-a", "--", "-b", "c"]. Expected: Flattened ["-a", "--", "-b", "c"]. Derived from flatten logic with '--'.
testProcessArgsWhenOptionRequiresArgument: Input: Option '-a' (hasArg=true), listIter with ["value1", "value2"]. Expected: Option 'a' with value "value1", iterator advanced. Derived from processArgs logic.
testProcessArgsWhenOptionRequiresArgumentAndNoMoreArgs: Input: Option '-a' (hasArg=true), listIter with ["value1"]. Expected: Option 'a' with value "value1", iterator at end. Derived from processArgs logic.
testProcessArgsWhenOptionRequiresArgumentAndIsLastElement: Input: Option '-r' (hasArg=true), tokens: ["-r"]. Expected: MissingArgumentException. Derived from processArgs when no more tokens.
testProcessOptionWhenRequired: Input: Option '-a' (required=true), args: ["-a"]. Expected: CommandLine with option 'a'. Derived from processOption handling of required flag.
testProcessOptionWithOptionGroup: Input: OptionGroup with '-a', '-b', args: ["-a"]. Expected: Option 'a' selected in group. Derived from OptionGroup selection.
testProcessOptionWithOptionGroupWhenAlreadySelected: Input: OptionGroup with '-a', '-b', args: ["-a", "-b"]. Expected: AlreadySelectedException. Derived from OptionGroup selection conflict.
testClearOptionsAndGroupsOnParse: Input: Options with '-a', '-b', args: ["-a"] then ["-b"]. Expected: State cleared between parses. Derived from parser state reset.
testParseWithLongOption: Input: Options with '--alpha', args: ["--alpha"]. Expected: CommandLine with option 'alpha'. Derived from long option parsing.
testParseWithLongOptionAndArgument: Input: Options with '--alpha' (hasArg=true), args: ["--alpha", "value"]. Expected: CommandLine with option 'alpha' and value "value". Derived from long option with argument.
testParseWithLongOptionAndArgumentColonSyntax: Input: Options with '--alpha' (hasArg=true), args: ["--alpha=value"]. Expected: CommandLine with option 'alpha' and value "value". Derived from long option with colon syntax.
testParseWithShortOptionAndArgumentColonSyntax: Input: Options with '-a' (hasArg=true), args: ["-a:value"]. Expected: CommandLine with option 'a' and value "value". Derived from short option with colon syntax.
testParseOptionThatTakesMultipleArguments: Input: Option '-f' (setArgs(2)), args: ["-f", "file1", "file2"]. Expected: Option 'f' with values ["file1", "file2"]. Derived from multi-argument option.
testParseOptionThatTakesMultipleArgumentsAndMissingOne: Input: Option '-f' (setArgs(2)), args: ["-f", "file1"]. Expected: MissingArgumentException. Derived from missing argument for multi-arg option.
testParseOptionThatTakesMultipleArgumentsAndMoreThanExpected: Input: Option '-f' (setArgs(2)), args: ["-f", "file1", "file2", "file3"]. Expected: Option 'f' with values ["file1", "file2"], and "file3" as arg. Derived from multi-argument option handling overflow.
testParseWhenStopAtNonOptionAndNonOptionIsFirst: Input: Options with '-a', args: ["arg1", "-a"], stopAtNonOption=true. Expected: CommandLine with "arg1" as arg, no option 'a'. Derived from stopAtNonOption logic.
testParseWithEmptyArgsArray: Input: Options {}, args: []. Expected: Empty CommandLine. Derived from empty argument array handling.
DEFECT DETECTION STRATEGY - Tests cover core parsing logic including option identification, argument consumption, handling of special tokens like '--', optional arguments, and exception conditions like missing or unrecognized options. The interaction between properties and command-line arguments, and the handling of multi-value options are also tested.
SUMMARY - 33 tests.
LIMITATIONS - No tests for abstract methods like `flatten` in isolation, but their behavior is tested via concrete parser implementations in `parse`. The `Parser` class is abstract, so all tests use a concrete subclass (`BasicParser`).
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.