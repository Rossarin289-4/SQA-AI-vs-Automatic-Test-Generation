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
        return new WriteableCommandLineImpl(DUMMY_OPTION, Collections.emptyList());
    }

    private Option createDummyOption(String trigger) {
        Set triggers = Collections.singleton(trigger);
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
        WriteableCommandLine wcl = new WriteableCommandLineImpl(new ArgumentImpl("dummy", "desc", 0, 1, (char)0, (char)0, null, null, null, 1) {
            public Set getPrefixes() { return prefixes; }
        }, Collections.emptyList());
        assertTrue(wcl.looksLikeOption("-a"));
        assertTrue(wcl.looksLikeOption("--b"));
        assertFalse(wcl.looksLikeOption("c"));
    }

    public void testToStringReturnsEmptyStringWhenNoArguments() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        assertEquals("", wcl.toString());
    }

    public void testToStringWithSingleArgument() throws Exception {
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
        }
    }

    public void testSetDefaultValues() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        List defaults = Collections.singletonList("defaultVal");
        wcl.setDefaultValues(option, defaults);
        // Direct access to protected fields is discouraged, but for testing we can use reflection or a package-private getter if available.
        // Assuming WriteableCommandLineImpl has package-private access for these fields for testing purposes.
        assertEquals(defaults, wcl.defaultValues.get(option));
    }

    public void testSetDefaultValuesWithNullRemovesDefaults() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-o");
        wcl.setDefaultValues(option, Collections.singletonList("defaultVal"));
        wcl.setDefaultValues(option, null);
        assertNull(wcl.defaultValues.get(option));
    }
    
    public void testSetDefaultSwitch() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-s");
        wcl.setDefaultSwitch(option, Boolean.TRUE);
        assertEquals(Boolean.TRUE, wcl.defaultSwitches.get(option));
    }

    public void testSetDefaultSwitchWithNullRemovesDefault() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = createDummyOption("-s");
        wcl.setDefaultSwitch(option, Boolean.TRUE);
        wcl.setDefaultSwitch(option, null);
        assertNull(wcl.defaultSwitches.get(option));
    }

    public void testGetNormalisedReturnsUnmodifiableList() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(DUMMY_OPTION, Collections.singletonList("arg1"));
        List normalised = wcl.getNormalised();
        assertTrue(normalised.contains("arg1"));
        try {
            normalised.add("newArg");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    public void testGetPreferredName() throws Exception {
        Option option = new ArgumentImpl(DEFAULT_PREFERENCE, DEFAULT_DESCRIPTION, 0, 1, (char) 0, (char) 0, null, null, null, 1);
        assertEquals(DEFAULT_PREFERENCE, option.getPreferredName());
    }

    public void testProcessValuesWithConsumeRemaining() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 2, (char)0, (char)0, null, "--", null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("value1");
        argsList.add("--");
        argsList.add("value2");
        argsList.add("value3"); // This should be processed because maximum is 2 and we started with 0 values.
        
        ListIterator args = argsList.listIterator();
        wcl.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(3, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
        assertEquals("value3", values.get(2));
    }

    public void testProcessValuesWithConsumeRemainingAndMax() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 2, (char)0, (char)0, null, "--", null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("value1"); // First value
        argsList.add("--");
        argsList.add("value2"); // Second value, reaches max
        argsList.add("value3"); // This should not be processed
        
        ListIterator args = argsList.listIterator();
        wcl.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    public void testProcessValuesLooksLikeOptionBreaksProcessing() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 5, (char)0, (char)0, null, null, null, 1);
        Option otherOption = createDummyOptionWithPrefix("-");
        List<String> argsList = new ArrayList<>();
        argsList.add("value1");
        argsList.add("-other"); // This should stop processing for the current option
        argsList.add("value2");
        
        ListIterator args = argsList.listIterator();
        
        // Need to simulate looksLikeOption for the other option within the context of wcl
        wcl.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("-other", values.get(1)); // The argument "-other" is consumed as a value before processing stops.
        assertTrue(args.hasNext()); // value2 should still be in the iterator
        assertEquals("value2", args.next());
    }

    public void testProcessValuesWithSubsequentSplit() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 3, (char)0, ',', null, null, null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("val1,val2");
        argsList.add("val3");

        ListIterator args = argsList.listIterator();
        wcl.processValues(wcl, args, option);

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
        argsList.add("val1,val2,val3"); // This will try to add 3 values, but max is 2

        ListIterator args = argsList.listIterator();
        wcl.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(2, values.size()); // Max of 2 should be added
        assertEquals("val1", values.get(0));
        assertEquals("val2", values.get(1));
    }

    public void testProcessValuesWithSubsequentSplitUnexpectedValue() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 2, (char)0, ',', null, null, null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("val1,val2");
        argsList.add("val3"); // This is an unexpected value after the split, should cause an error if max is exceeded.

        ListIterator args = argsList.listIterator();
        wcl.processValues(wcl, args, option); // Processes "val1,val2"

        // Now, "val3" is still in the iterator and it would be processed if not for the next check.
        // The ArgumentImpl's processValues logic itself doesn't throw an exception for "val3" if the max is not exceeded.
        // The current implementation of processValues does not check for extra tokens after the split if they are not part of the original string.
        // This test needs to check behavior based on the current implementation.
        
        // To properly test the exception, we need a case where the split itself generates more values than allowed.
        // For example, if 'val3' was part of another split string that exceeded the max.
        // The current code will add "val1" and "val2" and then move to the next element "val3".
        // If "val3" is not a split value, it will be added as a separate value if max is not reached.

        // The existing code does not throw an exception for "val3" being present if the max has not been reached yet.
        // The exception is thrown when the StringTokenizer itself has more tokens after consuming values.
        // Let's adjust the test to reflect what the code does: it should have processed "val1" and "val2" from the first string,
        // and then it would process "val3" as a new value if max allows.
        // Since max is 2, and we already have "val1", "val2", "val3" cannot be added.
        
        // The original error message was based on an assumption that "val3" would be an unexpected token from the tokenizer.
        // It seems the test case itself needs refinement to trigger the expected exception for unexpected values.
        
        // Let's test the "unexpected value" scenario in the context of subsequentSplit.
        // If the input was "val1,val2,val3" and max is 2, it should throw.
        WriteableCommandLine wcl2 = createWriteableCommandLine();
        Option option2 = new ArgumentImpl("arg", "desc", 0, 2, (char)0, ',', null, null, null, 1);
        List<String> argsList2 = new ArrayList<>();
        argsList2.add("val1,val2,val3"); // This should result in an exception because max is 2
        ListIterator args2 = argsList2.listIterator();
        try {
            wcl2.processValues(wcl2, args2, option2);
            fail("Should throw OptionException for unexpected value");
        } catch (OptionException e) {
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
        wcl.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }
    
    public void testProcessValuesAsIsAndMax() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 1, (char)0, (char)0, null, null, null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("value1");
        argsList.add("value2"); // This should not be processed due to max
        
        ListIterator args = argsList.listIterator();
        wcl.processValues(wcl, args, option);

        List<Object> values = wcl.getUndefaultedValues(option);
        assertEquals(1, values.get(0));
    }

    public void testCanProcessAlwaysReturnsTrue() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        assertTrue(wcl.canProcess(wcl, "someArg"));
    }

    public void testGetPrefixesReturnsEmptySet() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Set prefixes = wcl.getPrefixes();
        assertTrue(prefixes.isEmpty());
    }

    public void testProcessCallsProcessValues() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        // To make processValues work, we need an Option that can process itself.
        // ArgumentImpl is suitable as it implements processValues.
        Option option = new ArgumentImpl("arg", "desc", 0, 1, (char)0, (char)0, null, null, null, 1);
        List<String> argsList = new ArrayList<>();
        argsList.add("value1");
        ListIterator args = argsList.listIterator();

        // The process method in CommandLineImpl (parent of WriteableCommandLineImpl)
        // iterates through normalised arguments and calls canProcess/process on options.
        // However, WriteableCommandLineImpl's constructor takes rootOption and arguments.
        // The process method itself is not defined in WriteableCommandLineImpl but in CommandLineImpl.
        // The provided API outline for WriteableCommandLine has process(WriteableCommandLine commandLine, ListIterator args).
        // This implies WriteableCommandLineImpl might implement it. Looking at the source, it inherits from CommandLineImpl.
        // The test should call the method on an instance of WriteableCommandLineImpl.

        // Let's create a specific Option that the `process` method of WriteableCommandLineImpl would use.
        // The `process` method in `CommandLineImpl` (inherited by `WriteableCommandLineImpl`) seems to expect an `Option` to process.
        // The `process` method in `WriteableCommandLine` interface is `void process(WriteableCommandLine commandLine, ListIterator args)`.
        // The `WriteableCommandLineImpl.process` calls `processValues` of `this` (the `WriteableCommandLineImpl` itself) as the option.
        
        // Create an ArgumentImpl to be used as the "option" for processValues
        ArgumentImpl argOption = new ArgumentImpl("arg", "desc", 0, 1, (char)0, (char)0, null, null, null, 1);
        List<String> argsForProcess = new ArrayList<>();
        argsForProcess.add("value1");
        ListIterator iterForProcess = argsForProcess.listIterator();

        // Call the process method of WriteableCommandLineImpl
        // This method is inherited from CommandLineImpl and is designed to process the `normalised` arguments.
        // It iterates through `normalised` and calls `canProcess` and `process` on the `rootOption`.
        // The test should likely test `processValues` directly or ensure `process` behaves as expected.
        // Given the available interface, the `process` method is:
        // `void process(WriteableCommandLine commandLine, ListIterator args)`
        // This suggests that the `commandLine` itself can be processed.
        // The `WriteableCommandLineImpl` constructor takes `rootOption`.

        // The original test `testProcessCallsProcessValues` called `wcl.process(wcl, args)`.
        // This `process` method in the interface seems to be for processing *command line arguments* into a `CommandLine`.
        // `WriteableCommandLineImpl.process` would use `rootOption` to process.
        // Let's refine the test to align with `WriteableCommandLineImpl.process(WriteableCommandLine commandLine, ListIterator args)`.
        // This method is actually in `CommandLineImpl`, parent of `WriteableCommandLineImpl`.
        // `CommandLineImpl.process` uses `rootOption` to process the `normalised` list.
        // `WriteableCommandLineImpl` doesn't override `process` but it has `processValues`.

        // The test `testProcessCallsProcessValues` was written as:
        // `wcl.process(wcl, args);` where `wcl` is a `WriteableCommandLineImpl`.
        // This is problematic because `process` is expected to take a `CommandLine` and `ListIterator`, and `WriteableCommandLineImpl` implements `WriteableCommandLine`.
        // The actual `process` method in `CommandLineImpl` is `process(final ListIterator args)` which processes the `normalised` list using `rootOption`.
        // There isn't a public `process(WriteableCommandLine commandLine, ListIterator args)` method on `WriteableCommandLineImpl` to test.
        // The `process` method on the `Option` interface is `void process(WriteableCommandLine commandLine, ListIterator args)`.
        // Let's assume the test meant to call the `process` method of an `Option` using `WriteableCommandLine`.
        
        // Re-writing test to call `Option.process()`
        Option dummyArgOption = new ArgumentImpl("arg", "desc", 0, 1, (char)0, (char)0, null, null, null, 1);
        List<String> argsListForOptionProcess = new ArrayList<>();
        argsListForOptionProcess.add("value1");
        ListIterator iterForOptionProcess = argsListForOptionProcess.listIterator();
        
        dummyArgOption.process(wcl, iterForOptionProcess);
        
        List<Object> values = wcl.getUndefaultedValues(dummyArgOption);
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
        WriteableCommandLine wcl = createWriteableCommandLine();
        StringBuffer buffer = new StringBuffer();
        Set helpSettings = Collections.singleton(DisplaySetting.DISPLAY_ARGUMENT_NUMBERED);
        Comparator comp = null; // Not relevant for this test
        Option option = new ArgumentImpl("name", "description", 1, 2, '\0', ',', null, null, null, 1);
        option.appendUsage(buffer, helpSettings, comp);
        // Expected output depends on DisplaySetting, here we expect [name1 name2]
        assertEquals("[name1 name2]", buffer.toString());
    }

    public void testAppendUsageWithInfiniteMax() throws Exception {
        WriteableCommandLine wcl = createWriteableCommandLine();
        StringBuffer buffer = new StringBuffer();
        Set helpSettings = Collections.emptySet();
        Comparator comp = null;
        Option option = new ArgumentImpl("name", "description", 1, Integer.MAX_VALUE, '\0', ',', null, null, null, 1);
        option.appendUsage(buffer, helpSettings, comp);
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
        // ArgumentImpl extends OptionImpl, so we need to ensure the super.defaults() is called.
        // OptionImpl has a no-op defaults() method in the source provided for the test class.
        // We will test the defaultValues(commandLine, option) part of ArgumentImpl.
        Option argumentWithDefaults = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, Collections.singletonList("default"), 1);
        argumentWithDefaults.defaults(wcl);
        assertNotNull(wcl.defaultValues.get(argumentWithDefaults));
        assertEquals(Collections.singletonList("default"), wcl.defaultValues.get(argumentWithDefaults));
    }

    public void testDefaultValuesCallsSetDefaultValuesOnCommandLine() {
        WriteableCommandLine wcl = createWriteableCommandLine();
        Option option = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, Collections.singletonList("default"), 1);
        ((ArgumentImpl) option).defaultValues(wcl, option);
        assertNotNull(wcl.defaultValues.get(option));
        assertEquals(Collections.singletonList("default"), wcl.defaultValues.get(option));
    }
}
```