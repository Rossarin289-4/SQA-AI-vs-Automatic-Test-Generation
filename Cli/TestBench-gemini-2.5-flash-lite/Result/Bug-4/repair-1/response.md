```java
package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class ParserTest extends TestCase {

    public void testParseWithNullArguments() throws Exception {
        Options options = new Options();
        Parser parser = new PosixParser(); // Using a concrete subclass
        CommandLine cmd = parser.parse(options, null);
        assertNotNull("CommandLine should not be null", cmd);
        assertEquals("Arguments should be empty", 0, cmd.getArgs().length);
    }

    public void testParseWithEmptyArguments() throws Exception {
        Options options = new Options();
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull("CommandLine should not be null", cmd);
        assertEquals("Arguments should be empty", 0, cmd.getArgs().length);
    }

    public void testParseWithSingleOptionNoArg() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc");
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Option 'a' should not have values", 0, cmd.getOptionValues("a").length);
    }

    public void testParseWithSingleOptionWithArg() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "value"});
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Option 'a' should have one value", 1, cmd.getOptionValues("a").length);
        assertEquals("Value of option 'a'", "value", cmd.getOptionValue("a"));
    }

    public void testParseWithOptionAndProperty() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        Properties props = new Properties();
        props.setProperty("a", "prop_value");
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "arg_value"}, props);
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Option 'a' should have one value from arguments", 1, cmd.getOptionValues("a").length);
        assertEquals("Value of option 'a' from arguments", "arg_value", cmd.getOptionValue("a"));
    }

    public void testParseWithOptionAndPropertyNoArg() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc");
        Properties props = new Properties();
        props.setProperty("a", "true");
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{}, props);
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Option 'a' should have no values", 0, cmd.getOptionValues("a").length);
    }
    
    public void testParseWithOptionAndPropertyNoArgFalseValue() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "desc");
        Properties props = new Properties();
        props.setProperty("a", "false"); // This should not add the option
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{}, props);
        assertFalse("Should not have option 'a'", cmd.hasOption("a"));
    }

    public void testParseWithStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "val", "non-option", "-b"}, true);
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Value of option 'a'", "val", cmd.getOptionValue("a"));
        String[] args = cmd.getArgs();
        assertNotNull("Args should not be null", args);
        assertEquals("Should have two arguments", 2, args.length);
        assertEquals("First argument", "non-option", args[0]);
        assertEquals("Second argument", "-b", args[1]);
    }
    
    public void testParseWithStopAtNonOptionAndDoubleDash() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "val", "--", "non-option", "-b"}, true);
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Value of option 'a'", "val", cmd.getOptionValue("a"));
        String[] args = cmd.getArgs();
        assertNotNull("Args should not be null", args);
        assertEquals("Should have two arguments", 2, args.length);
        assertEquals("First argument", "non-option", args[0]);
        assertEquals("Second argument", "-b", args[1]);
    }

    public void testParseWithDashArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "-"}, true);
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Value of option 'a'", "-", cmd.getOptionValue("a"));
    }
    
    public void testParseWithDashAsArgumentWhenStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "-", "-b"}, true);
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Value of option 'a'", "-", cmd.getOptionValue("a"));
        String[] args = cmd.getArgs();
        assertNotNull("Args should not be null", args);
        assertEquals("Should have one argument", 1, args.length);
        assertEquals("First argument", "-b", args[0]);
    }

    public void testParseWithMultipleValuesForOption() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        options.getOption("a").setArgs(2);
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "val1", "val2"});
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        String[] values = cmd.getOptionValues("a");
        assertNotNull("Values should not be null", values);
        assertEquals("Option 'a' should have two values", 2, values.length);
        assertEquals("First value", "val1", values[0]);
        assertEquals("Second value", "val2", values[1]);
    }
    
    public void testParseWithUnlimitedValuesForOption() throws Exception {
        Options options = new Options();
        Option optA = new Option("a", "desc");
        optA.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(optA);
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "val1", "val2", "val3"});
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        String[] values = cmd.getOptionValues("a");
        assertNotNull(values);
        assertEquals("Option 'a' should have three values", 3, values.length);
        assertEquals("First value", "val1", values[0]);
        assertEquals("Second value", "val2", values[1]);
        assertEquals("Third value", "val3", values[2]);
    }

    public void testParseWithRequiredOptionMissing() throws Exception {
        Options options = new Options();
        Option requiredOption = new Option("a", false, "desc");
        requiredOption.setRequired(true);
        options.addOption(requiredOption);
        Parser parser = new PosixParser();
        try {
            parser.parse(options, new String[]{});
            fail("Should throw MissingOptionException");
        } catch (MissingOptionException e) {
            // expected
        }
    }

    public void testParseWithUnrecognizedOption() throws Exception {
        Options options = new Options();
        Parser parser = new PosixParser();
        try {
            parser.parse(options, new String[]{"-a"});
            fail("Should throw UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            // expected
        }
    }

    public void testProcessArgsWithOneValue() throws Exception {
        Options options = new Options();
        Option optA = new Option("a", true, "desc");
        options.addOption(optA);
        Parser parser = new PosixParser();
        List<String> tokenList = Arrays.asList("-a", "value");
        ListIterator<String> iterator = tokenList.listIterator();
        iterator.next(); // consume "-a"
        parser.processArgs(optA, iterator);
        String[] values = optA.getValues();
        assertNotNull(values);
        assertEquals(1, values.length);
        assertEquals("value", values[0]);
    }

    public void testProcessArgsWithMultipleValues() throws Exception {
        Options options = new Options();
        Option optA = new Option("a", true, "desc");
        optA.setArgs(2);
        options.addOption(optA);
        Parser parser = new PosixParser();
        List<String> tokenList = Arrays.asList("-a", "val1", "val2");
        ListIterator<String> iterator = tokenList.listIterator();
        iterator.next(); // consume "-a"
        parser.processArgs(optA, iterator);
        String[] values = optA.getValues();
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("val1", values[0]);
        assertEquals("val2", values[1]);
    }
    
    public void testProcessArgsWithMissingValue() throws Exception {
        Options options = new Options();
        Option optA = new Option("a", true, "desc");
        options.addOption(optA);
        Parser parser = new PosixParser();
        List<String> tokenList = Arrays.asList("-a");
        ListIterator<String> iterator = tokenList.listIterator();
        iterator.next(); // consume "-a"
        try {
            parser.processArgs(optA, iterator);
            fail("Should throw MissingArgumentException");
        } catch (MissingArgumentException e) {
            // expected
        }
    }
    
    public void testProcessArgsWithUnlimitedValues() throws Exception {
        Options options = new Options();
        Option optA = new Option("a", "desc");
        optA.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(optA);
        Parser parser = new PosixParser();
        List<String> tokenList = Arrays.asList("-a", "val1", "val2", "val3");
        ListIterator<String> iterator = tokenList.listIterator();
        iterator.next(); // consume "-a"
        parser.processArgs(optA, iterator);
        String[] values = optA.getValues();
        assertNotNull(values);
        assertEquals(3, values.length);
        assertEquals("val1", values[0]);
        assertEquals("val2", values[1]);
        assertEquals("val3", values[2]);
    }

    public void testProcessOptionWhenAlreadyInOptionGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "desc");
        Option optB = new Option("b", "desc");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b")); // b should not be selected
    }
    
    public void testProcessOptionWhenInRequiredOptionGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "desc");
        Option optB = new Option("b", "desc");
        group.addOption(optA);
        group.addOption(optB);
        group.setRequired(true);
        options.addOptionGroup(group);
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
        // The removal from requiredOptions is internal and hard to test directly.
    }

    public void testParseWithHyphenAsOption() throws Exception {
        Options options = new Options();
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-"});
        String[] args = cmd.getArgs();
        assertNotNull("Args should not be null", args);
        assertEquals("Should have one argument", 1, args.length);
        assertEquals("Argument should be '-'", "-", args[0]);
    }
    
    public void testParseWithHyphenAsOptionWhenStopAtNonOption() throws Exception {
        Options options = new Options();
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-", "-a"}, true);
        String[] args = cmd.getArgs();
        assertNotNull("Args should not be null", args);
        assertEquals("Should have two arguments", 2, args.length);
        assertEquals("First argument", "-", args[0]);
        assertEquals("Second argument", "-a", args[1]);
    }
    
    public void testParseWithDoubleDash() throws Exception {
        Options options = new Options();
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"--", "arg1", "-a"});
        String[] args = cmd.getArgs();
        assertNotNull("Args should not be null", args);
        assertEquals("Should have two arguments", 2, args.length);
        assertEquals("First argument", "arg1", args[0]);
        assertEquals("Second argument", "-a", args[1]);
    }

    public void testFlattenBehaviorOptionWithArgument() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        Parser parser = new PosixParser();
        // This test relies on the flatten method, which is abstract.
        // We need a concrete parser that implements flatten. PosixParser is one.
        // The parse method internally calls flatten.
        // We'll test the outcome of parse which includes flattening.
        CommandLine cmd = parser.parse(options, new String[]{"-avalue"});
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Value of option 'a'", "value", cmd.getOptionValue("a"));
    }
    
    public void testFlattenBehaviorOptionWithMultipleArgs() throws Exception {
        Options options = new Options();
        Option optA = new Option("a", "desc");
        optA.setArgs(2);
        options.addOption(optA);
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "v1", "v2", "v3"});
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        String[] values = cmd.getOptionValues("a");
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2", values[1]);
        assertEquals("v3", cmd.getArgs()[0]); // The remaining arg
    }

    public void testParseWithPropertiesOverridingCommandLine() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        Parser parser = new PosixParser();
        Properties props = new Properties();
        props.setProperty("a", "prop_value");
        CommandLine cmd = parser.parse(options, new String[]{"-a", "arg_value"}, props);
        // The code shows that properties are processed AFTER command line arguments.
        // However, processProperties method checks if cmd.hasOption(option) before adding.
        // This means properties do NOT override command line values if the option is already present.
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Value of option 'a'", "arg_value", cmd.getOptionValue("a"));
    }
    
    public void testParseWithPropertiesAddingOptionNotOnCommandLine() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "desc");
        options.addOption("b", true, "desc");
        Parser parser = new PosixParser();
        Properties props = new Properties();
        props.setProperty("b", "prop_value_b");
        CommandLine cmd = parser.parse(options, new String[]{"-a", "arg_value_a"});
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Value of option 'a'", "arg_value_a", cmd.getOptionValue("a"));
        assertTrue("Should have option 'b' from properties", cmd.hasOption("b"));
        assertEquals("Value of option 'b' from properties", "prop_value_b", cmd.getOptionValue("b"));
    }

    public void testParseWithOptionHavingValueSeparator() throws Exception {
        Options options = new Options();
        Option optA = new Option("a", "desc");
        optA.setArgs(1);
        optA.setValueSeparator('=');
        options.addOption(optA);
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a=value"});
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        assertEquals("Value of option 'a'", "value", cmd.getOptionValue("a"));
    }
    
    public void testParseWithOptionHavingValueSeparatorAndMultipleValues() throws Exception {
        Options options = new Options();
        Option optA = new Option("a", "desc");
        optA.setArgs(2);
        optA.setValueSeparator(',');
        options.addOption(optA);
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a=v1,v2"});
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        String[] values = cmd.getOptionValues("a");
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2", values[1]);
    }
    
    public void testParseWithOptionHavingValueSeparatorAndMultipleValuesSeparated() throws Exception {
        Options options = new Options();
        Option optA = new Option("a", "desc");
        optA.setArgs(2);
        optA.setValueSeparator(',');
        options.addOption(optA);
        Parser parser = new PosixParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "v1,v2"});
        assertTrue("Should have option 'a'", cmd.hasOption("a"));
        String[] values = cmd.getOptionValues("a");
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2", values[1]);
    }
}
```