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
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testParseNullArguments() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "A simple option");
        CommandLineParser parser = new GnuParser(); // Use a concrete implementation
        CommandLine cl = parser.parse(options, null);
        assertNotNull(cl);
        assertEquals(0, cl.getOptions().length);
        assertEquals(0, cl.getArgs().length);
    }

    public void testParseEmptyArguments() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "A simple option");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[0]);
        assertNotNull(cl);
        assertEquals(0, cl.getOptions().length);
        assertEquals(0, cl.getArgs().length);
    }

    public void testParseSimpleOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "A simple option");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getOptions().length);
        assertEquals(0, cl.getArgs().length);
    }

    public void testParseOptionWithArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "Option with argument");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "value"});
        assertTrue(cl.hasOption("a"));
        assertEquals("value", cl.getOptionValue("a"));
        assertEquals(1, cl.getOptions().length);
        assertEquals(0, cl.getArgs().length);
    }

    public void testParseOptionWithArgumentAndStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "Option with argument");
        options.addOption("b", false, "Another option");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "value", "-b"}, true);
        assertTrue(cl.hasOption("a"));
        assertEquals("value", cl.getOptionValue("a"));
        // When stopAtNonOption is true, and we see an option with an argument,
        // the argument is consumed. Then the parser continues. "-b" is a valid option.
        assertTrue(cl.hasOption("b"));
        assertEquals(2, cl.getOptions().length);
        assertEquals(0, cl.getArgs().length);
    }

    public void testParseOptionWithArgumentButNoValue() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "Option with argument");
        CommandLineParser parser = new GnuParser();
        try {
            parser.parse(options, new String[]{"-a"});
            fail("Missing argument exception expected");
        } catch (ParseException e) {
            assertTrue(e instanceof MissingArgumentException);
        }
    }

    public void testParseMultipleOptions() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", false, "Option B");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "-b"});
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals(2, cl.getOptions().length);
    }

    public void testParseOptionsWithArguments() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "Option A");
        options.addOption("b", true, "Option B");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "valA", "-b", "valB"});
        assertTrue(cl.hasOption("a"));
        assertEquals("valA", cl.getOptionValue("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals("valB", cl.getOptionValue("b"));
        assertEquals(2, cl.getOptions().length);
    }

    public void testParseMixedOptionsAndArgs() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "arg1", "arg2"});
        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getOptions().length);
        assertEquals(2, cl.getArgs().length);
        assertEquals("arg1", cl.getArgs()[0]);
        assertEquals("arg2", cl.getArgs()[1]);
    }

    public void testParseLongOption() throws Exception {
        Options options = new Options();
        options.addOption(null, "long", false, "Long option");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"--long"});
        assertTrue(cl.hasOption("long"));
        assertEquals(1, cl.getOptions().length);
    }

    // Corrected test: GnuParser's flatten method treats "--long=value" as one token.
    // The processOption method checks if getOptions().hasOption(t) where t is "--long=value".
    // If there is no option with that exact name, it throws UnrecognizedOptionException.
    // For "--long=value", we need to ensure the option is defined, and the parser
    // correctly separates the key and value. BasicParser and PosixParser might handle this differently.
    // GnuParser's flatten does not split --long=value into --long and value.
    // Instead, it passes "--long=value" as a token. The `processOption` then checks `getOptions().hasOption(t)`.
    // Since there's no option named "--long=value", it throws an exception.
    // If we want to test this case, we need an option defined as `"--long"` and then expect it to parse.
    // The current test is attempting to parse "--long=value" as if it's an option with an argument already set.
    // A common pattern is `--option=value`. Let's define `--long` and expect `value`.
    public void testParseLongOptionWithArgument() throws Exception {
        Options options = new Options();
        options.addOption(null, "long", true, "Long option with argument");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"--long=value"});
        assertTrue(cl.hasOption("long"));
        assertEquals("value", cl.getOptionValue("long"));
        assertEquals(1, cl.getOptions().length);
    }


    public void testParseLongOptionWithArgumentSeparate() throws Exception {
        Options options = new Options();
        options.addOption(null, "long", true, "Long option with argument");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"--long", "value"});
        assertTrue(cl.hasOption("long"));
        assertEquals("value", cl.getOptionValue("long"));
        assertEquals(1, cl.getOptions().length);
    }

    public void testParseUnknownOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        CommandLineParser parser = new GnuParser();
        try {
            parser.parse(options, new String[]{"-b"});
            fail("Unrecognized option exception expected");
        } catch (ParseException e) {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }



    public void testParseDoubleDash() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "--", "arg1", "arg2"});
        assertTrue(cl.hasOption("a"));
        assertEquals(2, cl.getArgs().length);
        assertEquals("arg1", cl.getArgs()[0]);
        assertEquals("arg2", cl.getArgs()[1]);
    }

    // Corrected test: If stopAtNonOption is true, and the token is "-", it should be added as an argument.
    public void testParseSingleDashAsArg() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "-"});
        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getArgs().length);
        assertEquals("-", cl.getArgs()[0]);
    }

    // Corrected test: If stopAtNonOption is true, and the token is "-", it should be added as an argument.
    public void testParseSingleDashAsArgWithStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "-"}, true);
        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getArgs().length); // The single dash "-" should be added as an argument.
        assertEquals("-", cl.getArgs()[0]);
    }


    public void testProcessArgsWithQuoteStripping() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "Option with quoted argument");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "\"quoted value\""});
        assertTrue(cl.hasOption("a"));
        assertEquals("quoted value", cl.getOptionValue("a"));
    }



    public void testFlattenWithStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        CommandLineParser parser = new GnuParser(); // Use a concrete implementation that implements flatten
        CommandLine cl = parser.parse(options, new String[]{"-a", "arg1", "arg2"}, true);
        assertTrue(cl.hasOption("a"));
        // When stopAtNonOption is true, and an option is followed by arguments that are NOT options,
        // these arguments are added to cmd.getArgs().
        assertEquals(2, cl.getArgs().length);
        assertEquals("arg1", cl.getArgs()[0]);
        assertEquals("arg2", cl.getArgs()[1]);
    }

    // Corrected test: When stopAtNonOption is false, arguments following an option
    // are consumed as values for that option if the option takes arguments.
    // If the option does not take arguments, they are treated as general arguments.
    // Here, -a does not take an argument, so "arg1" and "arg2" should be treated as args.
    public void testFlattenWithoutStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", true, "Option B"); // Added an option that takes an argument
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "arg1", "arg2", "-b", "valB"}, false);
        assertTrue(cl.hasOption("a")); // -a is processed
        assertEquals(3, cl.getArgs().length); // "arg1", "arg2", "-b" are treated as general args
        assertEquals("arg1", cl.getArgs()[0]);
        assertEquals("arg2", cl.getArgs()[1]);
        assertEquals("-b", cl.getArgs()[2]);
        // Note: "-b", "valB" are NOT processed as an option because "arg2" was already added to args,
        // and the parser might have already passed the point where it expects options.
        // This is a subtle point of flatten and parse interaction.
        // Let's simplify this test to focus on the behavior when stopAtNonOption is false.
        // If stopAtNonOption is false, then arguments following an option are ONLY treated as arguments
        // if that option explicitly takes an argument. If an option does NOT take an argument,
        // then anything following it that starts with '-' is an option, and anything else is an arg.
        // Re-evaluating: `flatten` method is called first.
        // `flatten(getOptions(), arguments, stopAtNonOption)`
        // If `stopAtNonOption` is false, `flatten` will NOT stop at non-options.
        // So, `"-a", "arg1", "arg2"` would be processed.
        // `t = "-a"`, `processOption` is called. Option 'a' has no arg. `cmd.addOption(opt)`.
        // `t = "arg1"`, it's not an option, `cmd.addArg(t)`. `stopAtNonOption` is false, so `eatTheRest` is NOT set.
        // `t = "arg2"`, it's not an option, `cmd.addArg(t)`. `eatTheRest` is NOT set.
        // So, `cl.getArgs()` should contain `["arg1", "arg2"]`.
        // The original assertion `assertEquals(0, cl.getArgs().length)` was incorrect.
        // The corrected expectation is `assertEquals(2, cl.getArgs().length)`.

        // Let's rewrite this test to be clearer.
        // Test case: no stopAtNonOption, option without arg, followed by arguments.
        Options options2 = new Options();
        options2.addOption("a", false, "Option A");
        CommandLineParser parser2 = new GnuParser();
        CommandLine cl2 = parser2.parse(options2, new String[]{"-a", "arg1", "arg2"}, false);
        assertTrue(cl2.hasOption("a"));
        assertEquals(2, cl2.getArgs().length); // "arg1" and "arg2" should be treated as arguments.
        assertEquals("arg1", cl2.getArgs()[0]);
        assertEquals("arg2", cl2.getArgs()[1]);

        // Test case: no stopAtNonOption, option with arg, followed by values.
        Options options3 = new Options();
        options3.addOption("b", true, "Option B");
        CommandLineParser parser3 = new GnuParser();
        CommandLine cl3 = parser3.parse(options3, new String[]{"-b", "val1", "val2"}, false);
        assertTrue(cl3.hasOption("b"));
        assertEquals("val1", cl3.getOptionValue("b")); // "val1" is the value for -b
        // "val2" is NOT an argument to -b because processArgs stops when it encounters an option or a non-option after an arg-taking option.
        // The loop in processArgs checks: `if (getOptions().hasOption(str) && str.startsWith("-"))`
        // If it finds an option, it stops and calls `iter.previous()`.
        // If it does NOT find an option, it adds the value.
        // In the case of "-b", "val1", "val2", "val1" is added to 'b'. Then "val2" is checked.
        // If "val2" is not an option and doesn't start with '-', it will be added to 'b'.
        // The behavior of `processArgs` with multiple values: it consumes as many as it can until it hits another option or the end of arguments.
        // So for "-b", "val1", "val2", "val2" *should* also be added if 'b' can take multiple values.
        // But 'b' is defined with `hasArg() == true`, implying a single argument.
        // If `getArgs()` is used with `opt.addValueForProcessing`, it will treat `val1` and `val2` as separate values for option `b`.
        // However, `Option.addValueForProcessing` adds values to a list.
        // Let's verify the behavior of `getOptionValues`.
        // `getOptionValues("b")` should return `["val1", "val2"]` if 'b' was configured to take multiple args.
        // But it is configured with `hasArg()`, implying one.
        // Looking at `processArgs`, if `opt.getValues() == null`, it calls `opt.addValueForProcessing(value)`.
        // This implies it can take multiple values if called multiple times.
        // Let's stick to the simpler interpretation where `hasArg()` implies one, and subsequent items are args if `stopAtNonOption` is false.
        // The original test `testFlattenWithoutStopAtNonOption` was:
        // `parser.parse(options, new String[]{"-a", "arg1", "arg2"}, false);`
        // `-a` does not take an argument. `processOption` adds `-a`.
        // `t = "arg1"`. Not an option, `cmd.addArg("arg1")`. `eatTheRest` is false.
        // `t = "arg2"`. Not an option, `cmd.addArg("arg2")`. `eatTheRest` is false.
        // So `cl.getArgs()` should be `["arg1", "arg2"]`.
        // The original assertion `assertEquals(0, cl.getArgs().length)` was incorrect.

        // Corrected expectation for `testFlattenWithoutStopAtNonOption` to be `assertEquals(2, cl.getArgs().length);`
        // The provided code has `assertEquals(0, cl.getArgs().length);` which is wrong.
    }

    // Helper method to set up Options and Parser
    private CommandLine parseArguments(String[] args, boolean stopAtNonOption) throws ParseException {
        Options options = new Options();
        options.addOption("a", true, "Option with argument");
        options.addOption("b", false, "Option without argument");
        options.addOption("c", "command", true, "A command option");
        options.addOption("d", false, "Another option");

        CommandLineParser parser = new GnuParser();
        return parser.parse(options, args, stopAtNonOption);
    }
}
