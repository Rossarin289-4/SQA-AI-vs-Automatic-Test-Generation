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
        assertTrue(cl.hasOption("b")); // -b should still be processed if stopAtNonOption is true
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

    public void testParseRequiredOptionMissing() throws Exception {
        Options options = new Options();
        // Option.builder is not available in the provided API, using addOption instead.
        Option reqOpt = new Option("a", "Required option", true, false);
        reqOpt.setRequired(true);
        options.addOption(reqOpt);
        CommandLineParser parser = new GnuParser();
        try {
            parser.parse(options, new String[]{});
            fail("Missing option exception expected");
        } catch (ParseException e) {
            assertTrue(e instanceof MissingOptionException);
        }
    }

    public void testParseRequiredOptionPresent() throws Exception {
        Options options = new Options();
        // Option.builder is not available in the provided API, using addOption instead.
        Option reqOpt = new Option("a", "Required option", true, false);
        reqOpt.setRequired(true);
        options.addOption(reqOpt);
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "value"});
        assertTrue(cl.hasOption("a"));
        assertEquals("value", cl.getOptionValue("a"));
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

    public void testParseSingleDashAsArg() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "-"});
        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getArgs().length);
        assertEquals("-", cl.getArgs()[0]);
    }

    public void testParseSingleDashAsArgWithStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "-"}, true);
        assertTrue(cl.hasOption("a"));
        assertEquals(1, cl.getArgs().length);
        assertEquals("-", cl.getArgs()[0]);
    }

    public void testParseOptionWithOptionalArgumentProvided() throws Exception {
        Options options = new Options();
        // Using the constructor that matches the API outline.
        Option opt = new Option("a", "Option with optional argument", true, false);
        opt.setOptionalArg(true);
        options.addOption(opt);
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "value"});
        assertTrue(cl.hasOption("a"));
        assertEquals("value", cl.getOptionValue("a"));
    }

    public void testParseOptionWithOptionalArgumentNotProvided() throws Exception {
        Options options = new Options();
        // Using the constructor that matches the API outline.
        Option opt = new Option("a", "Option with optional argument", true, false);
        opt.setOptionalArg(true);
        options.addOption(opt);
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertNull(cl.getOptionValue("a")); // Should be null if not provided
    }

    public void testProcessPropertiesWithNoProperties() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "Option A");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "value"});
        // The parse method with properties is parse(Options, String[], Properties, boolean)
        CommandLine clFromProperties = parser.parse(options, new String[]{"-a", "value"}, new Properties(), false);
        assertEquals(cl.getOptions().length, clFromProperties.getOptions().length);
    }

    public void testProcessPropertiesWithSimpleOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{}, props, false);
        assertTrue(cl.hasOption("a"));
    }

    public void testProcessPropertiesWithOptionWithValue() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "Option A");
        Properties props = new Properties();
        props.setProperty("a", "prop_value");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{}, props, false);
        assertTrue(cl.hasOption("a"));
        assertEquals("prop_value", cl.getOptionValue("a"));
    }

    public void testProcessPropertiesWithExistingOption() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "Option A");
        Properties props = new Properties();
        props.setProperty("a", "prop_value");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "cmd_value"}, props, false);
        assertTrue(cl.hasOption("a"));
        assertEquals("cmd_value", cl.getOptionValue("a")); // Command line value should take precedence
    }

    public void testProcessPropertiesWithBooleanOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        Properties props = new Properties();
        props.setProperty("a", "yes"); // Should be treated as true
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{}, props, false);
        assertTrue(cl.hasOption("a"));
    }

    public void testProcessPropertiesWithBooleanOptionFalse() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        Properties props = new Properties();
        props.setProperty("a", "no"); // Should be treated as false, option not added
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{}, props, false);
        assertFalse(cl.hasOption("a"));
    }

    public void testCheckRequiredOptionsWhenNone() throws Exception {
        Options options = new Options();
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{}, null, false);
        assertNotNull(cl); // Should not throw exception
    }

    public void testCheckRequiredOptionsWithOneRequiredOptionPresent() throws Exception {
        Options options = new Options();
        // Option.builder is not available in the provided API, using addOption instead.
        Option reqOpt = new Option("a", "Required option", false, false);
        reqOpt.setRequired(true);
        options.addOption(reqOpt);
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a"}, null, false);
        assertTrue(cl.hasOption("a"));
    }

    public void testProcessArgsForOptionWithMultipleValues() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "Option with multiple values", true, false);
        opt.setArgs(2); // Allow two arguments
        options.addOption(opt);
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "val1", "val2"});
        assertTrue(cl.hasOption("a"));
        String[] values = cl.getOptionValues("a");
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("val1", values[0]);
        assertEquals("val2", values[1]);
    }

    public void testProcessArgsForOptionWithUnlimitedValues() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "Option with unlimited values", true, false);
        opt.setArgs(Option.UNLIMITED_VALUES); // Allow unlimited arguments
        options.addOption(opt);
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "val1", "val2", "val3"});
        assertTrue(cl.hasOption("a"));
        String[] values = cl.getOptionValues("a");
        assertNotNull(values);
        assertEquals(3, values.length);
        assertEquals("val1", values[0]);
        assertEquals("val2", values[1]);
        assertEquals("val3", values[2]);
    }

    public void testProcessArgsWithQuoteStripping() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "Option with quoted argument");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "\"quoted value\""});
        assertTrue(cl.hasOption("a"));
        assertEquals("quoted value", cl.getOptionValue("a"));
    }

    public void testProcessOptionGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "Option A", false, false);
        Option opt2 = new Option("b", "Option B", false, false);
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
        assertFalse(cl.hasOption("b"));
    }

    public void testProcessOptionGroupWithBoth() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "Option A", false, false);
        Option opt2 = new Option("b", "Option B", false, false);
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);
        CommandLineParser parser = new GnuParser();
        try {
            parser.parse(options, new String[]{"-a", "-b"});
            fail("Option group exception expected");
        } catch (ParseException e) {
            assertTrue(e instanceof ParseException);
        }
    }

    public void testFlattenWithStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        CommandLineParser parser = new GnuParser(); // Use a concrete implementation that implements flatten
        CommandLine cl = parser.parse(options, new String[]{"-a", "arg1", "arg2"}, true);
        assertTrue(cl.hasOption("a"));
        assertEquals(2, cl.getArgs().length);
        assertEquals("arg1", cl.getArgs()[0]);
        assertEquals("arg2", cl.getArgs()[1]);
    }

    public void testFlattenWithoutStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        CommandLineParser parser = new GnuParser();
        CommandLine cl = parser.parse(options, new String[]{"-a", "arg1", "arg2"}, false);
        assertTrue(cl.hasOption("a"));
        assertEquals(0, cl.getArgs().length); // args should not be collected if stopAtNonOption is false
    }
}
```