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


    

    public void testGetPreferredName() throws Exception {
        Option option = new ArgumentImpl(DEFAULT_PREFERENCE, DEFAULT_DESCRIPTION, 0, 1, (char) 0, (char) 0, null, null, null, 1);
        assertEquals(DEFAULT_PREFERENCE, option.getPreferredName());
    }

    // Method processValues is part of ArgumentImpl, not WriteableCommandLine directly.
    // It's called by Option.process() when the Option is an Argument.
    // This test will call processValues via the Option interface.



    

    
    

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


    public void testGetTriggersReturnsEmptySet() throws Exception {
        Option option = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        Set triggers = option.getTriggers();
        assertTrue(triggers.isEmpty());
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



    public void testIsRequiredReturnsTrueWhenMinimumGreaterThanZero() {
        Argument argument = new ArgumentImpl("arg", "desc", 1, 1, '\0', ',', null, null, null, 1);
        assertTrue(argument.isRequired());
    }

    public void testIsRequiredReturnsFalseWhenMinimumIsZero() {
        Argument argument = new ArgumentImpl("arg", "desc", 0, 1, '\0', ',', null, null, null, 1);
        assertFalse(argument.isRequired());
    }


}
