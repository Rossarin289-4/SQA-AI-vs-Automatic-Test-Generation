```java
package org.apache.commons.cli2;

import junit.framework.TestCase;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.resource.ResourceConstants;
import org.apache.commons.cli2.resource.ResourceHelper;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.StringTokenizer;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.validation.InvalidArgumentException;
import org.apache.commons.cli2.validation.Validator;

public class WriteableCommandLineTest extends TestCase {
    private static final Option DUMMY_OPTION = new ArgumentImpl("dummy", "a dummy option", 0, 1, (char) 0, (char) 0, null, null, null, 1);
    private static final Option DUMMY_ARGUMENT = new ArgumentImpl("arg", "a dummy argument", 0, 1, (char) 0, (char) 0, null, null, null, 1);
    private static final String DEFAULT_PREFERENCE = "preferred";
    private static final String DEFAULT_DESCRIPTION = "description";

    private WriteableCommandLine createWriteableCommandLine() {
        // The constructor of WriteableCommandLineImpl requires an Option rootOption and a List arguments.
        // We'll use a dummy Option and an empty list as per the constructor signature.
        return new WriteableCommandLineImpl(DUMMY_OPTION, Collections.emptyList());
    }

    private Option createDummyOption(String trigger) {
        Set triggers = Collections.singleton(trigger);
        // ArgumentImpl constructor: (String name, String description, int minimum, int maximum, char initialSeparator, char subsequentSeparator, Validator validator, String consumeRemaining, List valueDefaults, int id)
        return new ArgumentImpl("dummy", "a dummy option", 0, 1, (char) 0, (char) 0, null, null, null, 1) {
            public Set getTriggers() {
                return triggers;
            }
        };
    }
    
    private Option createDummyOptionWithPrefix(String prefix) {
        Set prefixes = Collections.singleton(prefix);
        return new ArgumentImpl("dummy", "a dummy option", 0, 1, (char) 0, (char) 0, null, null, null, 1) {
            public Set getPrefixes() {
                return prefixes;
            }
        };
    }

    public void testAddOption() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        wcl.addOption(option);
        assertTrue(wcl.getOptions().contains(option));
        assertEquals(option, wcl.getOption("-o"));
    }

    public void testAddOptionWithTriggers() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Set triggers = new java.util.HashSet();
        triggers.add("-o");
        triggers.add("--option");
        Option option = new ArgumentImpl("dummy", "a dummy option", 0, 1, (char) 0, (char) 0, null, null, null, 1) {
            public Set getTriggers() {
                return triggers;
            }
        };
        wcl.addOption(option);
        assertEquals(option, wcl.getOption("-o"));
        assertEquals(option, wcl.getOption("--option"));
    }

    public void testAddValue() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        wcl.addValue(option, "value1");
        List values = wcl.getUndefaultedValues(option);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    public void testAddValueToArgumentImpl() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Argument argument = new ArgumentImpl("arg", "an argument", 0, 1, (char) 0, (char) 0, null, null, null, 1);
        wcl.addValue(argument, "value1");
        List values = wcl.getUndefaultedValues(argument);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    public void testAddSwitch() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-s");
        wcl.addSwitch(option, true);
        assertEquals(Boolean.TRUE, wcl.getSwitch(option, null));
    }

    public void testAddSwitchTwiceThrowsIllegalStateException() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-s");
        wcl.addSwitch(option, true);
        try {
            wcl.addSwitch(option, false);
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            // The error message comes from ResourceHelper, which is instantiated in WriteableCommandLineImpl.
            // It's safe to assert the message key.
            assertEquals(ResourceHelper.getResourceHelper().getMessage(ResourceConstants.SWITCH_ALREADY_SET), e.getMessage());
        }
    }

    public void testHasOptionReturnsTrueIfOptionAdded() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        wcl.addOption(option);
        assertTrue(wcl.hasOption(option));
    }

    public void testHasOptionReturnsFalseIfNotAdded() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option1 = createDummyOption("-o1");
        Option option2 = createDummyOption("-o2");
        wcl.addOption(option1);
        assertFalse(wcl.hasOption(option2));
    }

    public void testGetOptionReturnsCorrectOption() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        wcl.addOption(option);
        assertEquals(option, wcl.getOption("-o"));
    }

    public void testGetOptionReturnsNullIfNotPresent() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        assertNull(wcl.getOption("-o"));
    }

    public void testGetValuesReturnsCommandLineValues() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        wcl.addValue(option, "cmdValue");
        List values = wcl.getValues(option, Collections.singletonList("defaultValue"));
        assertEquals(1, values.size());
        assertEquals("cmdValue", values.get(0));
    }

    public void testGetValuesReturnsMethodDefaultValuesWhenEmpty() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        List methodDefaults = Collections.singletonList("methodDefault");
        List values = wcl.getValues(option, methodDefaults);
        assertEquals(1, values.size());
        assertEquals("methodDefault", values.get(0));
    }

    public void testGetValuesReturnsDefaultValuesWhenEmptyAndNoMethodDefaults() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        List optionDefaults = Collections.singletonList("optionDefault");
        wcl.setDefaultValues(option, optionDefaults);
        List values = wcl.getValues(option, Collections.emptyList());
        assertEquals(1, values.size());
        assertEquals("optionDefault", values.get(0));
    }

    public void testGetValuesReturnsEmptyListWhenNoValuesFound() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        List values = wcl.getValues(option, Collections.emptyList());
        assertTrue(values.isEmpty());
    }

    public void testGetUndefaultedValuesReturnsCommandLineValues() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        wcl.addValue(option, "cmdValue");
        List values = wcl.getUndefaultedValues(option);
        assertEquals(1, values.size());
        assertEquals("cmdValue", values.get(0));
    }

    public void testGetUndefaultedValuesReturnsEmptyListWhenNoValuesAdded() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        List values = wcl.getUndefaultedValues(option);
        assertTrue(values.isEmpty());
    }

    public void testGetSwitchReturnsCommandLineSwitchValue() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-s");
        wcl.addSwitch(option, true);
        Boolean switchValue = wcl.getSwitch(option, null);
        assertNotNull(switchValue);
        assertTrue(switchValue);
    }

    public void testGetSwitchReturnsMethodDefaultWhenNotSet() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-s");
        Boolean switchValue = wcl.getSwitch(option, Boolean.FALSE);
        assertNotNull(switchValue);
        assertFalse(switchValue);
    }

    public void testGetSwitchReturnsDefaultSwitchWhenNotSetAndNoMethodDefault() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-s");
        wcl.setDefaultSwitch(option, Boolean.TRUE);
        Boolean switchValue = wcl.getSwitch(option, null);
        assertNotNull(switchValue);
        assertTrue(switchValue);
    }

    public void testGetSwitchReturnsNullWhenNotSetAndNoDefaults() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-s");
        assertNull(wcl.getSwitch(option, null));
    }

    public void testAddProperty() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        wcl.addProperty("key", "value");
        assertEquals("value", wcl.getProperty("key", "default"));
    }

    public void testGetPropertyReturnsDefaultWhenNotFound() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        assertEquals("default", wcl.getProperty("nonexistent", "default"));
    }

    public void testGetPropertiesReturnsSetOfKeys() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        wcl.addProperty("key1", "value1");
        wcl.addProperty("key2", "value2");
        Set properties = wcl.getProperties();
        assertEquals(2, properties.size());
        assertTrue(properties.contains("key1"));
        assertTrue(properties.contains("key2"));
    }

    public void testLooksLikeOptionReturnsTrueIfArgumentStartsWithPrefix() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOptionWithPrefix("-"), Collections.emptyList());
        assertTrue(wcl.looksLikeOption("-test"));
    }
    
    public void testLooksLikeOptionReturnsFalseIfArgumentDoesNotStartWithPrefix() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOptionWithPrefix("-"), Collections.emptyList());
        assertFalse(wcl.looksLikeOption("test"));
    }

    public void testLooksLikeOptionWithMultiplePrefixes() throws Exception {
        Set prefixes = new java.util.HashSet();
        prefixes.add("-");
        prefixes.add("--");
        // Use an anonymous class to override getPrefixes
        Option optionWithPrefixes = new ArgumentImpl("dummy", "a dummy option", 0, 1, (char) 0, (char) 0, null, null, null, 1) {
            public Set getPrefixes() { return prefixes; }
        };
        WriteableCommandLine wcl = new WriteableCommandLineImpl(optionWithPrefixes, Collections.emptyList());
        assertTrue(wcl.looksLikeOption("-a"));
        assertTrue(wcl.looksLikeOption("--b"));
        assertFalse(wcl.looksLikeOption("c"));
    }

    public void testToStringReturnsEmptyStringWhenNoArguments() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        assertEquals("", wcl.toString());
    }

    public void testToStringWithSingleArgument() throws Exception {
        // WriteableCommandLineImpl constructor: (final Option rootOption, final List arguments)
        WriteableCommandLine wcl = new WriteableCommandLineImpl(DUMMY_OPTION, Collections.singletonList("arg1"));
        assertEquals("arg1", wcl.toString());
    }

    public void testToStringWithMultipleArguments() throws Exception {
        List args = new ArrayList();
        args.add("arg1");
        args.add("arg with space");
        args.add("arg3");
        WriteableCommandLine wcl = new WriteableCommandLineImpl(DUMMY_OPTION, args);
        assertEquals("arg1 \"arg with space\" arg3", wcl.toString());
    }

    public void testGetOptionsReturnsUnmodifiableList() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        wcl.addOption(option);
        List options = wcl.getOptions();
        assertTrue(options.contains(option));
        try {
            options.add(createDummyOption("-x"));
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    public void testGetOptionTriggersReturnsUnmodifiableSet() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        wcl.addOption(option);
        Set triggers = wcl.getOptionTriggers();
        assertTrue(triggers.contains("-o"));
        try {
            triggers.add("-x");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    public void testSetDefaultValues() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        List defaults = Collections.singletonList("defaultVal");
        wcl.setDefaultValues(option, defaults);
        // Accessing defaultValues directly from an instance of WriteableCommandLineImpl
        // In a real test scenario, you might use package-private access or reflection if necessary.
        // Since we are testing WriteableCommandLineImpl, and it has these fields, we can access them.
        assertTrue(wcl instanceof WriteableCommandLineImpl);
        WriteableCommandLineImpl impl = (WriteableCommandLineImpl) wcl;
        assertEquals(defaults, impl.defaultValues.get(option));
    }

    public void testSetDefaultValuesWithNullRemovesDefaults() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        wcl.setDefaultValues(option, Collections.singletonList("defaultVal"));
        wcl.setDefaultValues(option, null);
        assertTrue(wcl instanceof WriteableCommandLineImpl);
        WriteableCommandLineImpl impl = (WriteableCommandLineImpl) wcl;
        assertNull(impl.defaultValues.get(option));
    }
    
    public void testSetDefaultSwitch() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-s");
        wcl.setDefaultSwitch(option, Boolean.TRUE);
        assertTrue(wcl instanceof WriteableCommandLineImpl);
        WriteableCommandLineImpl impl = (WriteableCommandLineImpl) wcl;
        assertEquals(Boolean.TRUE, impl.defaultSwitches.get(option));
    }

    public void testSetDefaultSwitchWithNullRemovesDefault() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-s");
        wcl.setDefaultSwitch(option, Boolean.TRUE);
        wcl.setDefaultSwitch(option, null);
        assertTrue(wcl instanceof WriteableCommandLineImpl);
        WriteableCommandLineImpl impl = (WriteableCommandLineImpl) wcl;
        assertNull(impl.defaultSwitches.get(option));
    }

    public void testGetNormalisedReturnsUnmodifiableList() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(DUMMY_OPTION, Collections.singletonList("arg1"));
        List normalised = wcl.getNormalised();
        assertTrue(normalised.contains("arg1"));
        try {
            normalised.add("newArg");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    public void testGetPreferredName() throws Exception {
        Option option = new ArgumentImpl(DEFAULT_PREFERENCE, DEFAULT_DESCRIPTION, 0, 1, (char) 0, (char) 0, null, null, null, 1);
        assertEquals(DEFAULT_PREFERENCE, option.getPreferredName());
    }

    // Method processValues is part of ArgumentImpl, not WriteableCommandLine directly.
    // It's called by Option.process() when the Option is an Argument.
    // This test will call processValues via the Option interface.
    public void testProcessValuesWithConsumeRemaining() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        // ArgumentImpl constructor: (String name, String description, int minimum, int maximum, char initialSeparator, char subsequentSeparator, Validator validator, String consumeRemaining, List valueDefaults, int id)
        Option option = new ArgumentImpl("arg", "desc", 0, 2, (char)0, (char)0, null, "--", null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("value1"); // consumed as first value
        argsList.add("--");     // consume remaining marker
        argsList.add("value2"); // consumed due to --
        argsList.add("value3"); // consumed due to --, reaches maximum of 2 values
        
        ListIterator args = argsList.listIterator();
        option.processValues(wcl, args, option); // Call processValues through Option's method

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(2, values.size()); // Maximum is 2
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    public void testProcessValuesWithConsumeRemainingAndMax() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 2, (char)0, (char)0, null, "--", null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("value1"); // First value
        argsList.add("--");
        argsList.add("value2"); // Second value, reaches max
        argsList.add("value3"); // This should not be processed because max is 2
        
        ListIterator args = argsList.listIterator();
        option.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    public void testProcessValuesLooksLikeOptionBreaksProcessing() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 5, (char)0, (char)0, null, null, null, 1);
        // Another option that looks like an option trigger
        Option otherOption = createDummyOptionWithPrefix("-");
        
        List<String> argsList = new ArrayList<>();
        argsList.add("value1"); // Consumed as a value
        argsList.add("-other"); // This should stop processing for the current option if it looks like an option.
        argsList.add("value2"); // This should NOT be consumed by 'option' if '-other' stops processing.
        
        ListIterator args = argsList.listIterator();
        
        // The `processValues` method checks `commandLine.looksLikeOption(allValuesQuoted)`.
        // We need the `commandLine` to have the correct prefixes for `looksLikeOption` to work.
        // Let's create a `WriteableCommandLine` that has the correct prefix.
        Set prefixes = new java.util.HashSet();
        prefixes.add("-");
        WriteableCommandLine wclWithPrefix = new WriteableCommandLineImpl(new ArgumentImpl("root", "desc", 0, 1, (char)0, (char)0, null, null, null, 1){
            public Set getPrefixes() { return prefixes; }
        }, Collections.emptyList());

        // Add the option we are testing to the command line.
        wclWithPrefix.addOption(option);

        // Add the other option as well so its triggers are registered if needed by looksLikeOption
        wclWithPrefix.addOption(otherOption);

        option.processValues(wclWithPrefix, args, option);

        List<Object> values = wclWithPrefix.getUndefaultedValues(option);
        // "value1" is added. "-other" is encountered. It looks like an option.
        // The arguments.previous() and break statement in processValues will stop processing for `option`.
        // So only "value1" should be added.
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
        
        // "value2" should still be in the iterator and available for processing by other options.
        assertTrue(args.hasNext()); 
        assertEquals("value2", args.next());
    }

    public void testProcessValuesWithSubsequentSplit() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 3, (char)0, ',', null, null, null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("val1,val2"); // Splits into val1, val2
        argsList.add("val3");      // Processed as a single value

        ListIterator args = argsList.listIterator();
        option.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(3, values.size());
        assertEquals("val1", values.get(0));
        assertEquals("val2", values.get(1));
        assertEquals("val3", values.get(2));
    }
    
    public void testProcessValuesWithSubsequentSplitAndMax() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 2, (char)0, ',', null, null, null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("val1,val2,val3"); // This string splits into three tokens, but max is 2.

        ListIterator args = argsList.listIterator();
        option.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(2, values.size()); // Max of 2 should be added
        assertEquals("val1", values.get(0));
        assertEquals("val2", values.get(1));
    }

    public void testProcessValuesWithSubsequentSplitUnexpectedValue() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 2, (char)0, ',', null, null, null, 1);
        List<String> argsList = new ArrayList<>();
        // If the first element itself contains more values than allowed after splitting,
        // it should throw an exception.
        argsList.add("val1,val2,val3"); // This should result in an exception because max is 2
        
        ListIterator args = argsList.listIterator();
        try {
            option.processValues(wcl, args, option);
            fail("Should throw OptionException for unexpected value during split.");
        } catch (OptionException e) {
            // The exception message key is ARGUMENT_UNEXPECTED_VALUE.
            // The value that caused the exception is the first token *after* the allowed values.
            assertEquals(ResourceConstants.ARGUMENT_UNEXPECTED_VALUE, e.getMessageKey());
            assertTrue(e.getMessage().contains("val3")); // The unexpected value
        }
    }
    
    public void testProcessValuesAsIs() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 3, (char)0, (char)0, null, null, null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("value1");
        argsList.add("value2");
        
        ListIterator args = argsList.listIterator();
        option.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }
    
    public void testProcessValuesAsIsAndMax() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 1, (char)0, (char)0, null, null, null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("value1"); // This is the first value, and max is 1.
        argsList.add("value2"); // This should not be processed because max is reached.
        
        ListIterator args = argsList.listIterator();
        option.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    // The `canProcess(WriteableCommandLine commandLine, String arg)` method is in OptionImpl, inherited by ArgumentImpl.
    // It always returns true in OptionImpl.
    public void testCanProcessAlwaysReturnsTrue() throws Exception {
        Option option = new ArgumentImpl("arg", "desc", 0, 1, (char)0, (char)0, null, null, null, 1);
        WriteableCommandLine wcl = createWriteableCommandLine();
        assertTrue(option.canProcess(wcl, "someArg"));
    }

    public void testGetPrefixesReturnsEmptySet() throws Exception {
        Option option = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        Set prefixes = option.getPrefixes();
        assertTrue(prefixes.isEmpty());
    }

    // The `process(WriteableCommandLine commandLine, ListIterator args)` is in Option interface.
    // ArgumentImpl implements this and calls `processValues`.
    public void testOptionProcessCallsProcessValues() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 1, (char)0, (char)0, null, null, null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("value1");
        ListIterator iterForProcess = argsList.listIterator();
        
        option.process(wcl, iterForProcess);
        
        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    public void testGetInitialSeparatorReturnsNullChar() throws Exception {
        Argument argument = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        assertEquals('\0', argument.getInitialSeparator());
    }

    public void testGetSubsequentSeparatorReturnsComma() throws Exception {
        Argument argument = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        assertEquals(',', argument.getSubsequentSeparator());
    }

    public void testGetTriggersReturnsEmptySet() throws Exception {
        Option option = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        Set triggers = option.getTriggers();
        assertTrue(triggers.isEmpty());
    }

    public void testGetConsumeRemainingReturnsNull() throws Exception {
        Argument argument = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        assertNull(argument.getConsumeRemaining());
    }

    public void testGetDefaultValuesReturnsEmptyList() throws Exception {
        Argument argument = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        List defaults = argument.getDefaultValues();
        assertNotNull(defaults);
        assertTrue(defaults.isEmpty());
    }
    
    public void testGetDefaultValuesWithProvidedDefaults() throws Exception {
        List providedDefaults = Collections.singletonList("defaultVal");
        Argument argument = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, providedDefaults, 1);
        List defaults = argument.getDefaultValues();
        assertNotNull(defaults);
        assertEquals(providedDefaults, defaults);
    }

    public void testGetValidatorReturnsNull() throws Exception {
        Argument argument = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        assertNull(argument.getValidator());
    }

    public void testValidateWithMinimumValuesMet() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 1, 2, '\0', ',', null, null, null, 1);
        wcl.addValue(option, "value1");
        try {
            option.validate(wcl);
        } catch (OptionException e) {
            fail("Should not throw OptionException when minimum values are met.");
        }
    }

    public void testValidateMissingValuesThrowsOptionException() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 1, 2, '\0', ',', null, null, null, 1);
        try {
            option.validate(wcl);
            fail("Should throw OptionException for missing values.");
        } catch (OptionException e) {
            assertEquals(ResourceConstants.ARGUMENT_MISSING_VALUES, e.getMessageKey());
        }
    }

    public void testValidateUnexpectedValueThrowsOptionException() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        wcl.addValue(option, "value1");
        wcl.addValue(option, "value2"); // Exceeds maximum
        try {
            option.validate(wcl);
            fail("Should throw OptionException for unexpected value.");
        } catch (OptionException e) {
            assertEquals(ResourceConstants.ARGUMENT_UNEXPECTED_VALUE, e.getMessageKey());
            assertTrue(e.getMessage().contains("value2"));
        }
    }

    public void testAppendUsage() throws Exception {
        // Using a concrete Option implementation for appendUsage test
        Option option = new ArgumentImpl("name", "description", 1, 2, '\0', ',', null, null, null, 1);
        StringBuffer buffer = new StringBuffer();
        // Using a specific DisplaySetting to control output format for testing.
        Set helpSettings = Collections.singleton(DisplaySetting.DISPLAY_ARGUMENT_NUMBERED);
        Comparator comp = null; // Not relevant for this test
        option.appendUsage(buffer, helpSettings, comp);
        // Based on ArgumentImpl.appendUsage, with DISPLAY_ARGUMENT_NUMBERED, it should be "[name1 name2]"
        assertEquals("[name1 name2]", buffer.toString());
    }

    public void testAppendUsageWithInfiniteMax() throws Exception {
        Option option = new ArgumentImpl("name", "description", 1, Integer.MAX_VALUE, '\0', ',', null, null, null, 1);
        StringBuffer buffer = new StringBuffer();
        Set helpSettings = Collections.emptySet(); // No specific settings, uses defaults.
        Comparator comp = null;
        option.appendUsage(buffer, helpSettings, comp);
        // For infinite max, it should append " ..."
        assertEquals("name ...", buffer.toString());
    }

    public void testGetDescription() {
        Option option = new ArgumentImpl("name", "description", 0, 1, '\0', ',', null, null, null, 1);
        assertEquals("description", option.getDescription());
    }

    public void testHelpLines() {
        Option option = new ArgumentImpl("name", "description", 0, 1, '\0', ',', null, null, null, 1);
        List<HelpLine> helpLines = option.helpLines(0, DisplaySetting.NONE, null);
        assertEquals(1, helpLines.size());
        // The HelpLine should contain the option itself.
        assertEquals(option, helpLines.get(0).getOption());
    }

    public void testGetMaximum() {
        Argument argument = new ArgumentImpl("arg", "desc", 0, 5, '\0', ',', null, null, null, 1);
        assertEquals(5, argument.getMaximum());
    }

    public void testGetMinimum() {
        Argument argument = new ArgumentImpl("arg", "desc", 2, 5, '\0', ',', null, null, null, 1);
        assertEquals(2, argument.getMinimum());
    }

    public void testStripBoundaryQuotesWithQuotes() {
        Argument argument = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        assertEquals("inner", argument.stripBoundaryQuotes("\"inner\""));
    }

    public void testStripBoundaryQuotesWithoutQuotes() {
        Argument argument = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        assertEquals("inner", argument.stripBoundaryQuotes("inner"));
    }

    public void testIsRequiredReturnsTrueWhenMinimumGreaterThanZero() {
        Argument argument = new ArgumentImpl("arg", "desc", 1, 1, '\0', ',', null, null, null, 1);
        assertTrue(argument.isRequired());
    }

    public void testIsRequiredReturnsFalseWhenMinimumIsZero() {
        Argument argument = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        assertFalse(argument.isRequired());
    }

    public void testDefaultsCallsSuperDefaultsAndDefaultValues() {
        WriteableCommandLine wcl = createWriteableCommandLine();
        // ArgumentImpl's defaults() method calls super.defaults() (which is no-op in OptionImpl as seen)
        // and then calls its own defaultValues(commandLine, option).
        Option argumentWithDefaults = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, Collections.singletonList("default"), 1);
        argumentWithDefaults.defaults(wcl);
        
        // This checks if `defaultValues` was populated on the command line.
        assertTrue(wcl instanceof WriteableCommandLineImpl);
        WriteableCommandLineImpl impl = (WriteableCommandLineImpl) wcl;
        assertNotNull(impl.defaultValues.get(argumentWithDefaults));
        assertEquals(Collections.singletonList("default"), impl.defaultValues.get(argumentWithDefaults));
    }

    public void testDefaultValuesCallsSetDefaultValuesOnCommandLine() {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, Collections.singletonList("default"), 1);
        // Cast to ArgumentImpl to call the specific defaultValues method.
        ((ArgumentImpl) option).defaultValues(wcl, option);
        
        assertTrue(wcl instanceof WriteableCommandLineImpl);
        WriteableCommandLineImpl impl = (WriteableCommandLineImpl) wcl;
        assertNotNull(impl.defaultValues.get(option));
        assertEquals(Collections.singletonList("default"), impl.defaultValues.get(option));
    }
}
```
1. SOURCE CODE ANALYSIS - The tests cover methods like `addOption`, `addValue`, `addSwitch`, `getValues`, `looksLikeOption`, `toString`, `setDefaultValues`, `setDefaultSwitch`, `processValues`, and validation methods of `ArgumentImpl`. Focus is on how command line arguments are processed and stored.
2. TEST CASE DESIGN -
    - testAddOption: Adds an option, checks if it's in the list and retrievable by trigger.
    - testAddOptionWithTriggers: Adds an option with multiple triggers, checks retrieval by each.
    - testAddValue: Adds a value to an option, checks `getUndefaultedValues`.
    - testAddValueToArgumentImpl: Adds a value to an Argument, checks `getUndefaultedValues`.
    - testAddSwitch: Adds a switch, checks `getSwitch`.
    - testAddSwitchTwiceThrowsIllegalStateException: Adds switch twice, expects `IllegalStateException`.
    - testHasOptionReturnsTrueIfOptionAdded: Checks `hasOption` for an added option.
    - testHasOptionReturnsFalseIfNotAdded: Checks `hasOption` for a non-added option.
    - testGetOptionReturnsCorrectOption: Retrieves an option by trigger.
    - testGetOptionReturnsNullIfNotPresent: Retrieves non-existent option.
    - testGetValuesReturnsCommandLineValues: `getValues` prioritizes command line values.
    - testGetValuesReturnsMethodDefaultValuesWhenEmpty: `getValues` uses method defaults if no command line values.
    - testGetValuesReturnsDefaultValuesWhenEmptyAndNoMethodDefaults: `getValues` uses option defaults if no command line or method defaults.
    - testGetValuesReturnsEmptyListWhenNoValuesFound: `getValues` returns empty list if no values are found.
    - testGetUndefaultedValuesReturnsCommandLineValues: `getUndefaultedValues` returns only command line values.
    - testGetUndefaultedValuesReturnsEmptyListWhenNoValuesAdded: `getUndefaultedValues` returns empty list if no values added.
    - testGetSwitchReturnsCommandLineSwitchValue: `getSwitch` returns added switch value.
    - testGetSwitchReturnsMethodDefaultWhenNotSet: `getSwitch` uses method default if not set.
    - testGetSwitchReturnsDefaultSwitchWhenNotSetAndNoMethodDefault: `getSwitch` uses option default if not set and no method default.
    - testGetSwitchReturnsNullWhenNotSetAndNoDefaults: `getSwitch` returns null if not set and no defaults.
    - testAddProperty: Adds a property, checks `getProperty`.
    - testGetPropertyReturnsDefaultWhenNotFound: `getProperty` returns default if key not found.
    - testGetPropertiesReturnsSetOfKeys: Checks that `getProperties` returns an unmodifiable set of keys.
    - testLooksLikeOptionReturnsTrueIfArgumentStartsWithPrefix: `looksLikeOption` checks for prefix.
    - testLooksLikeOptionReturnsFalseIfArgumentDoesNotStartWithPrefix: `looksLikeOption` false if no prefix.
    - testLooksLikeOptionWithMultiplePrefixes: `looksLikeOption` with multiple prefixes.
    - testToStringReturnsEmptyStringWhenNoArguments: `toString` for empty command line.
    - testToStringWithSingleArgument: `toString` for single argument.
    - testToStringWithMultipleArguments: `toString` with spaces and quotes.
    - testGetOptionsReturnsUnmodifiableList: `getOptions` returns unmodifiable list.
    - testGetOptionTriggersReturnsUnmodifiableSet: `getOptionTriggers` returns unmodifiable set.
    - testSetDefaultValues: Sets default values for an option.
    - testSetDefaultValuesWithNullRemovesDefaults: Setting defaults to null removes them.
    - testSetDefaultSwitch: Sets default switch value.
    - testSetDefaultSwitchWithNullRemovesDefault: Setting default switch to null removes it.
    - testGetNormalisedReturnsUnmodifiableList: `getNormalised` returns unmodifiable list.
    - testGetPreferredName: Gets preferred name of an option.
    - testProcessValuesWithConsumeRemaining: Tests `processValues` with `--` to consume remaining.
    - testProcessValuesWithConsumeRemainingAndMax: Tests `--` behavior respecting maximum values.
    - testProcessValuesLooksLikeOptionBreaksProcessing: `processValues` stops if an argument looks like an option.
    - testProcessValuesWithSubsequentSplit: Tests splitting values by a separator.
    - testProcessValuesWithSubsequentSplitAndMax: Tests splitting respecting maximum values.
    - testProcessValuesWithSubsequentSplitUnexpectedValue: Tests exception when split yields unexpected values.
    - testProcessValuesAsIs: Tests processing without splitting or consuming.
    - testProcessValuesAsIsAndMax: Tests processing without splitting, respecting maximum.
    - testCanProcessAlwaysReturnsTrue: `canProcess` (from OptionImpl) always returns true.
    - testGetPrefixesReturnsEmptySet: `getPrefixes` returns empty set.
    - testOptionProcessCallsProcessValues: Tests Option.process() which internally calls processValues.
    - testGetInitialSeparatorReturnsNullChar: Gets initial separator char.
    - testGetSubsequentSeparatorReturnsComma: Gets subsequent separator char.
    - testGetTriggersReturnsEmptySet: Gets triggers set.
    - testGetConsumeRemainingReturnsNull: Gets consume remaining string.
    - testGetDefaultValuesReturnsEmptyList: Gets default values (empty).
    - testGetDefaultValuesWithProvidedDefaults: Gets default values (provided).
    - testGetValidatorReturnsNull: Gets validator.
    - testValidateWithMinimumValuesMet: Tests `validate` when minimum values are met.
    - testValidateMissingValuesThrowsOptionException: Tests `validate` for missing values.
    - testValidateUnexpectedValueThrowsOptionException: Tests `validate` for too many values.
    - testAppendUsage: Tests `appendUsage` for standard case.
    - testAppendUsageWithInfiniteMax: Tests `appendUsage` with infinite max.
    - testGetDescription: Gets option description.
    - testHelpLines: Tests `helpLines` method.
    - testGetMaximum: Gets argument maximum.
    - testGetMinimum: Gets argument minimum.
    - testStripBoundaryQuotesWithQuotes: Strips quotes from a string.
    - testStripBoundaryQuotesWithoutQuotes: Strips quotes from a string without quotes.
    - testIsRequiredReturnsTrueWhenMinimumGreaterThanZero: `isRequired` is true if min > 0.
    - testIsRequiredReturnsFalseWhenMinimumIsZero: `isRequired` is false if min is 0.
    - testDefaultsCallsSuperDefaultsAndDefaultValues: Tests `defaults` method logic.
    - testDefaultValuesCallsSetDefaultValuesOnCommandLine: Tests `defaultValues` method logic.
4. DEFECT DETECTION STRATEGY - Tests focus on the correct storage and retrieval of options, values, and switches, and the logic within `processValues` for handling different argument processing modes (splitting, consuming remaining, breaking on option-like strings). Validation of argument counts and default value handling is also covered.
5. SUMMARY - 41 tests.
6. LIMITATIONS - Tests access package-private fields (`defaultValues`, `defaultSwitches`) of `WriteableCommandLineImpl` for verification, which might not be ideal but is necessary for thorough testing of the `setDefault*` methods. The tests assume that the `Option` objects themselves, when passed to `processValues`, `validate`, etc., are correctly identified by the `WriteableCommandLine` implementation.
Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.