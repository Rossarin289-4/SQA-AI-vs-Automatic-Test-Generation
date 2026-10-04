package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class DefaultParserTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testSimpleParse() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
    }

    public void testParseWithArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "arg"});
        assertTrue(cl.hasOption("a"));
        assertEquals("arg", cl.getOptionValue("a"));
    }

    public void testParseWithLongOption() throws Exception {
        Options options = new Options();
        options.addOption(null, "long", true, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"--long", "arg"});
        assertTrue(cl.hasOption("long"));
        assertEquals("arg", cl.getOptionValue("long"));
    }

    public void testParseWithShortAndLongOption() throws Exception {
        Options options = new Options();
        options.addOption("s", "long", true, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-s", "arg"});
        assertTrue(cl.hasOption("s"));
        assertEquals("arg", cl.getOptionValue("s"));

        cl = new DefaultParser().parse(options, new String[]{"--long", "arg"});
        assertTrue(cl.hasOption("long"));
        assertEquals("arg", cl.getOptionValue("long"));
    }

    public void testParseWithArgumentShorthand() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-aarg"});
        assertTrue(cl.hasOption("a"));
        assertEquals("arg", cl.getOptionValue("a"));
    }

    public void testParseWithEqualShorthand() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a=arg"});
        assertTrue(cl.hasOption("a"));
        assertEquals("arg", cl.getOptionValue("a"));
    }

    public void testParseWithLongOptionEqualShorthand() throws Exception {
        Options options = new Options();
        options.addOption(null, "long", true, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"--long=arg"});
        assertTrue(cl.hasOption("long"));
        assertEquals("arg", cl.getOptionValue("long"));
    }

    public void testParseWithMultipleShortOptions() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description a");
        options.addOption("b", false, "description b");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-ab"});
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
    }

    public void testParseWithMultipleShortOptionsAndArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description a");
        options.addOption("b", true, "description b");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-ab", "arg"});
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertEquals("arg", cl.getOptionValue("b"));
    }

    public void testParseWithConcatenatedOptionsAndArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description a");
        options.addOption("b", false, "description b");
        options.addOption("c", true, "description c");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-abc", "arg"});
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
        assertTrue(cl.hasOption("c"));
        assertEquals("arg", cl.getOptionValue("c"));
    }

    public void testParseWithStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "--", "remaining", "-b"});
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
        assertEquals(2, cl.getArgs().length);
        assertEquals("remaining", cl.getArgs()[0]);
        assertEquals("-b", cl.getArgs()[1]);
    }

    public void testParseWithStopAtNonOptionAsFirstArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description");
        // When stopAtNonOption is true, '--' should still be handled correctly.
        // All subsequent tokens, including options, become arguments.
        CommandLine cl = new DefaultParser().parse(options, new String[]{"--", "-a", "arg"});
        assertFalse(cl.hasOption("a"));
        assertEquals(3, cl.getArgs().length);
        assertEquals("-a", cl.getArgs()[0]);
        assertEquals("arg", cl.getArgs()[1]);
    }

    public void testParseWithProperties() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "description");
        Properties props = new Properties();
        props.setProperty("a", "prop_value");
        CommandLine cl = new DefaultParser().parse(options, new String[]{}, props);
        assertTrue(cl.hasOption("a"));
        assertEquals("prop_value", cl.getOptionValue("a"));
    }

    public void testParseWithPropertiesAndArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "description");
        Properties props = new Properties();
        props.setProperty("a", "prop_value");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "arg_value"}, props);
        assertTrue(cl.hasOption("a"));
        // The command line argument should override the properties
        assertEquals("arg_value", cl.getOptionValue("a"));
    }

    public void testParseWithPropertiesAndNoArgOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description");
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLine cl = new DefaultParser().parse(options, new String[]{}, props);
        assertTrue(cl.hasOption("a"));
    }

    public void testParseWithPropertiesAndNoArgOptionButNonBooleanValue() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description");
        Properties props = new Properties();
        props.setProperty("a", "some_value"); // should not be added
        CommandLine cl = new DefaultParser().parse(options, new String[]{}, props);
        assertFalse(cl.hasOption("a"));
    }

    public void testParseRequiredOption() throws Exception {
        Options options = new Options();
        options.addRequiredOption("a", null, false, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
    }

    public void testMissingRequiredOption() throws Exception {
        Options options = new Options();
        options.addRequiredOption("a", null, false, "description");
        try {
            new DefaultParser().parse(options, new String[]{});
            fail("MissingOptionException should have been thrown");
        } catch (MissingOptionException e) {
            // expected
        }
    }

    public void testOptionGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "description a"));
        group.addOption(new Option("b", false, "description b"));
        options.addOptionGroup(group);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
    }

    public void testOptionGroupWithRequiredOption() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "description a"));
        group.addOption(new Option("b", false, "description b"));
        group.setRequired(true);
        options.addOptionGroup(group);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
    }

    public void testMissingOptionGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "description a"));
        group.addOption(new Option("b", false, "description b"));
        group.setRequired(true);
        options.addOptionGroup(group);
        try {
            new DefaultParser().parse(options, new String[]{});
            fail("MissingOptionException should have been thrown");
        } catch (MissingOptionException e) {
            // expected
        }
    }

    public void testAmbiguousOptionExceptionShort() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", false, "description a");
        options.addOption("b", "apricot", false, "description b");
        try {
            new DefaultParser().parse(options, new String[]{"-ap"}); // ambiguous between -a and -apricot
            fail("AmbiguousOptionException should have been thrown");
        } catch (AmbiguousOptionException e) {
            // expected
        }
    }

    public void testAmbiguousOptionExceptionLong() throws Exception {
        Options options = new Options();
        options.addOption(null, "apple", false, "description a");
        options.addOption(null, "apricot", false, "description b");
        try {
            new DefaultParser().parse(options, new String[]{"--ap"}); // ambiguous
            fail("AmbiguousOptionException should have been thrown");
        } catch (AmbiguousOptionException e) {
            // expected
        }
    }

    public void testOptionWithUnlimitedArgs() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "description");
        opt.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(opt);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "val1", "val2", "val3"});
        assertTrue(cl.hasOption("a"));
        String[] values = cl.getOptionValues("a");
        assertEquals(3, values.length);
        assertEquals("val1", values[0]);
        assertEquals("val2", values[1]);
        assertEquals("val3", values[2]);
    }

    public void testOptionWithSpecificArgs() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "description");
        opt.setArgs(2);
        options.addOption(opt);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "val1", "val2"});
        assertTrue(cl.hasOption("a"));
        String[] values = cl.getOptionValues("a");
        assertEquals(2, values.length);
        assertEquals("val1", values[0]);
        assertEquals("val2", values[1]);
    }

    public void testMissingArgumentException() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", true, "description");
        options.addOption(opt);
        try {
            new DefaultParser().parse(options, new String[]{"-a"});
            fail("MissingArgumentException should have been thrown");
        } catch (MissingArgumentException e) {
            // expected
        }
    }

    public void testHandleUnknownTokenWhenStopAtNonOptionIsFalse() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description");
        try {
            new DefaultParser().parse(options, new String[]{"-unknown"});
            fail("UnrecognizedOptionException should have been thrown");
        } catch (UnrecognizedOptionException e) {
            // expected
        }
    }

    public void testHandleUnknownTokenWhenStopAtNonOptionIsTrue() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description");
        // When stopAtNonOption is true, unrecognized tokens are added as arguments.
        // The '--' is not necessary here for this behavior.
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "-unknown", "arg1", "arg2"});
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("unknown")); // Should be treated as an argument
        assertEquals(3, cl.getArgs().length);
        assertEquals("-unknown", cl.getArgs()[0]);
        assertEquals("arg1", cl.getArgs()[1]);
        assertEquals("arg2", cl.getArgs()[2]);
    }

    public void testGetOptionValuesWithNoValues() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a"});
        assertNull(cl.getOptionValues("a"));
    }

    public void testGetOptionValuesWithOneValue() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "value1"});
        String[] values = cl.getOptionValues("a");
        assertEquals(1, values.length);
        assertEquals("value1", values[0]);
    }

    public void testGetOptionValuesWithMultipleValues() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "description");
        opt.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(opt);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "value1", "value2"});
        String[] values = cl.getOptionValues("a");
        assertEquals(2, values.length);
        assertEquals("value1", values[0]);
        assertEquals("value2", values[1]);
    }

    public void testOptionWithArgName() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "description");
        opt.setArgName("ARG");
        options.addOption(opt);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "value"});
        assertTrue(cl.hasOption("a"));
        // getOptionValue retrieves the first value.
        assertEquals("value", cl.getOptionValue("a"));
        // The argName is associated with the Option object itself, not directly returned by getOptionValue.
        // The test should check the Option object's state.
        assertEquals("ARG", opt.getArgName());
    }

    public void testLongOptionWithArgName() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "long", true, "description");
        opt.setArgName("ARG");
        options.addOption(opt);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"--long", "value"});
        assertTrue(cl.hasOption("long"));
        assertEquals("value", cl.getOptionValue("long"));
        assertEquals("ARG", opt.getArgName());
    }

    public void testOptionWithoutArgButValueInProperties() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description");
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLine cl = new DefaultParser().parse(options, new String[]{}, props);
        assertTrue(cl.hasOption("a"));
    }

    public void testOptionWithoutArgButNonBooleanValueInProperties() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "description");
        Properties props = new Properties();
        props.setProperty("a", "value"); // should not be added
        CommandLine cl = new DefaultParser().parse(options, new String[]{}, props);
        assertFalse(cl.hasOption("a"));
    }

    public void testStripLeadingAndTrailingQuotes() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "\"quoted value\""});
        assertEquals("quoted value", cl.getOptionValue("a"));

        cl = new DefaultParser().parse(options, new String[]{"-a", "'single quoted value'"});
        assertEquals("single quoted value", cl.getOptionValue("a"));
    }

    public void testStripLeadingHyphens() throws Exception {
        Options options = new Options();
        // Use a short option that could be a long option name, to test -L vs --L
        options.addOption("a", null, true, "description");
        CommandLine cl = new DefaultParser().parse(options, new String[]{"--a", "value"});
        assertTrue(cl.hasOption("a"));
        assertEquals("value", cl.getOptionValue("a"));
    }
    
    public void testOptionType() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "description");
        // Setting the type does not force conversion by the parser.
        // The parser returns strings, and the type is just metadata.
        opt.setType(Integer.class);
        options.addOption(opt);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "123"});
        assertTrue(cl.hasOption("a"));
        Object value = cl.getOptionObject("a");
        // The parser itself does not convert the type. It returns String.
        assertTrue(value instanceof String);
        assertEquals("123", value);
        // The type metadata should be preserved.
        assertEquals(Integer.class, opt.getType());
    }

    public void testParseWithOptionalArg() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", false, "description");
        opt.setOptionalArg(true);
        options.addOption(opt);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertNull(cl.getOptionValues("a")); // No value provided, so null.
    }

    public void testParseWithOptionalArgWithValue() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", false, "description");
        opt.setOptionalArg(true);
        options.addOption(opt);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-avalue"});
        assertTrue(cl.hasOption("a"));
        // When an optional argument is present and given immediately after the option,
        // it's treated as the argument.
        assertEquals("value", cl.getOptionValue("a"));
    }

    public void testParseWithOptionalArgWithSeparateValue() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", false, "description");
        opt.setOptionalArg(true);
        options.addOption(opt);
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "value"});
        assertTrue(cl.hasOption("a"));
        // When an optional argument is present and given as a separate token,
        // it's treated as the argument.
        assertEquals("value", cl.getOptionValue("a"));
    }

    public void testParseWithOptionalArgButNoValueProvided() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", false, "description");
        opt.setOptionalArg(true);
        options.addOption(opt);
        // If no value is provided and the option is not followed by a token that could be its argument,
        // it's still considered parsed but with no argument.
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a", "-b"}); // -b is a separate option
        assertTrue(cl.hasOption("a"));
        assertNull(cl.getOptionValue("a"));
        assertTrue(cl.hasOption("b"));
    }
}
