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

    // Helper to create a dummy Option
    private Option createDummyOption(String name) {
        return new ArgumentImpl(name, "description", 0, Integer.MAX_VALUE, '\0', '\0', null, null, null, 0);
    }

    public void testAddOption() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        wcl.addOption(option);
        assertTrue(wcl.getOptions().contains(option));
        assertEquals(option, wcl.getOption("testOption"));
    }

    public void testAddValue() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        wcl.addValue(option, "value1");
        wcl.addValue(option, "value2");
        List values = wcl.getUndefaultedValues(option);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    public void testAddSwitch() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testSwitch");
        wcl.addSwitch(option, true);
        assertEquals(Boolean.TRUE, wcl.getSwitch(option, null));
    }

    public void testAddSwitchFalse() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testSwitch");
        wcl.addSwitch(option, false);
        assertEquals(Boolean.FALSE, wcl.getSwitch(option, null));
    }

    public void testAddSwitchIllegalStateException() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testSwitch");
        wcl.addSwitch(option, true);
        try {
            wcl.addSwitch(option, false);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            // Expected
        }
    }

    public void testHasOption() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option1 = createDummyOption("option1");
        Option option2 = createDummyOption("option2");
        wcl.addOption(option1);
        assertTrue(wcl.hasOption(option1));
        assertFalse(wcl.hasOption(option2));
    }

    public void testGetOption() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        wcl.addOption(option);
        assertEquals(option, wcl.getOption("testOption"));
        assertNull(wcl.getOption("nonExistentOption"));
    }

    public void testGetValuesWithDefaults() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        List<String> defaults = new ArrayList<>();
        defaults.add("default1");
        wcl.setDefaultValues(option, defaults);
        List<String> values = wcl.getValues(option, Collections.emptyList());
        assertEquals(1, values.size());
        assertEquals("default1", values.get(0));
    }

    public void testGetValuesWithCommandLineValues() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        wcl.addValue(option, "cmdValue1");
        List<String> defaults = new ArrayList<>();
        defaults.add("default1");
        wcl.setDefaultValues(option, defaults);
        List<String> values = wcl.getValues(option, Collections.emptyList());
        assertEquals(1, values.size());
        assertEquals("cmdValue1", values.get(0));
    }

    public void testGetUndefaultedValues() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        wcl.addValue(option, "value1");
        wcl.addValue(option, "value2");
        List values = wcl.getUndefaultedValues(option);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
    }

    public void testGetUndefaultedValuesEmpty() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        List values = wcl.getUndefaultedValues(option);
        assertEquals(0, values.size());
        assertTrue(values.isEmpty());
    }

    public void testGetSwitchWithDefault() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testSwitch");
        Boolean defaultValue = Boolean.TRUE;
        assertEquals(defaultValue, wcl.getSwitch(option, defaultValue));
    }

    public void testGetSwitchWithDefaultSwitchSet() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testSwitch");
        wcl.addSwitch(option, false);
        Boolean defaultValue = Boolean.TRUE;
        assertEquals(Boolean.FALSE, wcl.getSwitch(option, defaultValue));
    }

    public void testGetSwitchWithDefaultSwitchSetAndDefaultSwitch() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testSwitch");
        wcl.addSwitch(option, false);
        Boolean defaultSwitchValue = Boolean.TRUE;
        wcl.setDefaultSwitch(option, defaultSwitchValue);
        assertEquals(Boolean.FALSE, wcl.getSwitch(option, null));
    }

    public void testAddProperty() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        wcl.addProperty("key1", "value1");
        assertEquals("value1", wcl.getProperty("key1", "default"));
    }

    public void testAddPropertyReplace() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        wcl.addProperty("key1", "value1");
        wcl.addProperty("key1", "newValue1");
        assertEquals("newValue1", wcl.getProperty("key1", "default"));
    }

    public void testGetPropertyWithDefault() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        assertEquals("defaultValue", wcl.getProperty("nonExistentKey", "defaultValue"));
    }

    public void testGetProperties() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        wcl.addProperty("key1", "value1");
        wcl.addProperty("key2", "value2");
        Set properties = wcl.getProperties();
        assertEquals(2, properties.size());
        assertTrue(properties.contains("key1"));
        assertTrue(properties.contains("key2"));
    }

    public void testLooksLikeOption() throws Exception {
        // Mocking Option to have prefixes
        Option mockOptionWithPrefixes = new Option() {
            @Override
            public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {}
            @Override
            public void defaults(WriteableCommandLine commandLine) {}
            @Override
            public boolean canProcess(WriteableCommandLine commandLine, String argument) { return false; }
            @Override
            public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
            @Override
            public Set getTriggers() { return Collections.emptySet(); }
            @Override
            public Set getPrefixes() {
                Set<String> prefixes = new java.util.HashSet<>();
                prefixes.add("-");
                prefixes.add("--");
                return prefixes;
            }
            @Override
            public void validate(WriteableCommandLine commandLine) throws OptionException {}
            @Override
            public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.emptyList(); }
            @Override
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {}
            @Override
            public String getPreferredName() { return "mockOption"; }
            @Override
            public String getDescription() { return "mock"; }
            @Override
            public int getId() { return 1; }
            @Override
            public Option findOption(String trigger) { return null; }
            @Override
            public boolean isRequired() { return false; }
        };

        WriteableCommandLine wcl = new WriteableCommandLineImpl(mockOptionWithPrefixes, Collections.emptyList());
        assertTrue(wcl.looksLikeOption("-someArg"));
        assertTrue(wcl.looksLikeOption("--anotherArg"));
        assertFalse(wcl.looksLikeOption("justAValue"));
        assertFalse(wcl.looksLikeOption(""));
    }

    public void testToString() throws Exception {
        List<String> args = new ArrayList<>();
        args.add("arg1");
        args.add("arg with space");
        args.add("arg3");
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), args);
        assertEquals("arg1 \"arg with space\" arg3", wcl.toString());
    }

    public void testToStringEmpty() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        assertEquals("", wcl.toString());
    }

    public void testGetOptions() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option1 = createDummyOption("option1");
        Option option2 = createDummyOption("option2");
        wcl.addOption(option1);
        wcl.addOption(option2);
        List options = wcl.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(option1));
        assertTrue(options.contains(option2));
    }

    public void testGetOptionTriggers() throws Exception {
        // Mock Option to provide triggers
        Option mockOptionWithTriggers = new Option() {
            @Override
            public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {}
            @Override
            public void defaults(WriteableCommandLine commandLine) {}
            @Override
            public boolean canProcess(WriteableCommandLine commandLine, String argument) { return false; }
            @Override
            public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
            @Override
            public Set getTriggers() {
                Set<String> triggers = new java.util.HashSet<>();
                triggers.add("-t");
                triggers.add("--trigger");
                return triggers;
            }
            @Override
            public Set getPrefixes() { return Collections.emptySet(); }
            @Override
            public void validate(WriteableCommandLine commandLine) throws OptionException {}
            @Override
            public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.emptyList(); }
            @Override
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {}
            @Override
            public String getPreferredName() { return "mockOption"; }
            @Override
            public String getDescription() { return "mock"; }
            @Override
            public int getId() { return 1; }
            @Override
            public Option findOption(String trigger) { return null; }
            @Override
            public boolean isRequired() { return false; }
        };
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        wcl.addOption(mockOptionWithTriggers);
        Set triggers = wcl.getOptionTriggers();
        assertEquals(3, triggers.size()); // Expected 3: option.getPreferredName() + option.getTriggers()
        assertTrue(triggers.contains("-t"));
        assertTrue(triggers.contains("--trigger"));
        assertTrue(triggers.contains("mockOption")); // Preferred name is also a trigger
    }

    public void testSetDefaultValues() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        List<String> defaults = new ArrayList<>();
        defaults.add("default1");
        wcl.setDefaultValues(option, defaults);
        assertEquals(defaults, wcl.getValues(option, null)); // Pass null to ensure defaultValues is used
    }

    public void testSetDefaultValuesNull() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        List<String> defaults = new ArrayList<>();
        defaults.add("default1");
        wcl.setDefaultValues(option, defaults);
        wcl.setDefaultValues(option, null); // Remove defaults
        // Now getValues should not find defaults, so it should return an empty list or a different default if provided
        assertEquals(Collections.EMPTY_LIST, wcl.getValues(option, Collections.emptyList()));
    }

    public void testSetDefaultSwitch() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testSwitch");
        wcl.setDefaultSwitch(option, Boolean.TRUE);
        assertEquals(Boolean.TRUE, wcl.getSwitch(option, null));
    }

    public void testSetDefaultSwitchNull() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testSwitch");
        wcl.setDefaultSwitch(option, Boolean.TRUE);
        wcl.setDefaultSwitch(option, null); // Remove default
        assertNull(wcl.getSwitch(option, null));
    }


    // getPreferredName is a method on Option, not WriteableCommandLine.
    // The test class itself doesn't directly expose it.

    public void testProcessValues() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        List<String> argsList = new ArrayList<>();
        argsList.add("value1");
        argsList.add("value2");
        ListIterator argsIterator = argsList.listIterator();
        
        ArgumentImpl argImpl = new ArgumentImpl("argName", "description", 0, 2, '\0', '\0', null, null, null, 0);
        argImpl.processValues(wcl, argsIterator, option);

        assertEquals("value1", wcl.getUndefaultedValues(option).get(0));
        assertEquals("value2", wcl.getUndefaultedValues(option).get(1));
    }

    public void testProcessValuesConsumeRemaining() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        List<String> argsList = new ArrayList<>();
        argsList.add("--"); // consume remaining
        argsList.add("value3");
        argsList.add("value4");
        ListIterator argsIterator = argsList.listIterator();

        ArgumentImpl argImpl = new ArgumentImpl("argName", "description", 0, 2, '\0', '\0', null, "--", null, 0);
        argImpl.processValues(wcl, argsIterator, option);

        assertEquals("value3", wcl.getUndefaultedValues(option).get(0));
        assertEquals("value4", wcl.getUndefaultedValues(option).get(1));
    }

    public void testProcessValuesSplit() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        List<String> argsList = new ArrayList<>();
        argsList.add("v1,v2,v3");
        ListIterator argsIterator = argsList.listIterator();

        ArgumentImpl argImpl = new ArgumentImpl("argName", "description", 0, 3, '\0', ',', null, null, null, 0);
        argImpl.processValues(wcl, argsIterator, option);

        assertEquals("v1", wcl.getUndefaultedValues(option).get(0));
        assertEquals("v2", wcl.getUndefaultedValues(option).get(1));
        assertEquals("v3", wcl.getUndefaultedValues(option).get(2));
    }

    public void testProcessValuesSplitExceedsMax() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        List<String> argsList = new ArrayList<>();
        argsList.add("v1,v2,v3,v4"); // 4 values, but max is 3
        ListIterator argsIterator = argsList.listIterator();

        ArgumentImpl argImpl = new ArgumentImpl("argName", "description", 0, 3, '\0', ',', null, null, null, 0);
        // The source code does not throw OptionException when values exceed maximum for a split string,
        // it simply stops adding values.
        argImpl.processValues(wcl, argsIterator, option);
        assertEquals(3, wcl.getUndefaultedValues(option).size());
        assertEquals("v1", wcl.getUndefaultedValues(option).get(0));
        assertEquals("v2", wcl.getUndefaultedValues(option).get(1));
        assertEquals("v3", wcl.getUndefaultedValues(option).get(2));
    }

    public void testCanProcess() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        Option option = createDummyOption("testOption");
        assertTrue(option.canProcess(wcl, "anyArg"));
    }

    public void testGetInitialSeparator() throws Exception {
        // Method is on ArgumentImpl, not Option interface
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 0, 1, '-', '\0', null, null, null, 0);
        assertEquals('-', argImpl.getInitialSeparator());
    }

    public void testGetSubsequentSeparator() throws Exception {
        // Method is on ArgumentImpl, not Option interface
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 0, 1, '\0', ',', null, null, null, 0);
        assertEquals(',', argImpl.getSubsequentSeparator());
    }

    public void testGetConsumeRemaining() throws Exception {
        // Method is on ArgumentImpl, not Option interface
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 0, 1, '\0', '\0', null, "--", null, 0);
        assertEquals("--", argImpl.getConsumeRemaining());
    }

    public void testGetDefaultValues() throws Exception {
        // Method is on ArgumentImpl, not Option interface
        List<String> defaults = new ArrayList<>();
        defaults.add("default1");
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 0, 1, '\0', '\0', null, null, defaults, 0);
        assertEquals(defaults, argImpl.getDefaultValues());
    }

    public void testGetValidator() throws Exception {
        // Method is on ArgumentImpl, not Option interface
        Validator validator = new Validator() {
            @Override
            public void validate(List values) throws InvalidArgumentException {}
        };
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 0, 1, '\0', '\0', validator, null, null, 0);
        assertEquals(validator, argImpl.getValidator());
    }

    public void testValidateMissingValues() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 1, 1, '\0', '\0', null, null, null, 0); // Minimum 1 value
        try {
            argImpl.validate(wcl);
            fail("Expected OptionException for missing values");
        } catch (OptionException e) {
            // The actual exception message contains the option name, which is not available in this context.
            // Asserting the presence of the resource key is more robust.
            assertTrue(e.getMessage().contains(ResourceConstants.ARGUMENT_MISSING_VALUES));
        }
    }

    public void testValidateUnexpectedValue() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 0, 0, '\0', '\0', null, null, null, 0); // Maximum 0 values
        wcl.addValue(argImpl, "unexpected");
        try {
            argImpl.validate(wcl);
            fail("Expected OptionException for unexpected value");
        } catch (OptionException e) {
            // The actual exception message contains the option name and the unexpected value.
            // Asserting the presence of the resource key is more robust.
            assertTrue(e.getMessage().contains(ResourceConstants.ARGUMENT_UNEXPECTED_VALUE));
        }
    }

    public void testAppendUsage() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        StringBuffer buffer = new StringBuffer();
        Set helpSettings = new java.util.HashSet();
        helpSettings.add(DisplaySetting.DISPLAY_OPTIONAL);
        Comparator comp = null;
        ArgumentImpl argImpl = new ArgumentImpl("name", "description", 0, 1, '\0', '\0', null, null, null, 0);
        argImpl.appendUsage(buffer, helpSettings, comp);
        // The default behavior of appendUsage for an argument with no separators is to just display the name.
        // For optional arguments, it may be enclosed in brackets.
        assertTrue(buffer.toString().contains("name") || buffer.toString().contains("<name>"));
    }

    public void testGetDescription() throws Exception {
        ArgumentImpl argImpl = new ArgumentImpl("name", "this is a description", 0, 1, '\0', '\0', null, null, null, 0);
        assertEquals("this is a description", argImpl.getDescription());
    }

    public void testHelpLines() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        ArgumentImpl argImpl = new ArgumentImpl("name", "description", 0, 1, '\0', '\0', null, null, null, 0);
        List helpLines = argImpl.helpLines(0, DisplaySetting.NONE, null);
        assertEquals(1, helpLines.size());
        assertTrue(helpLines.get(0) instanceof HelpLine);
    }

    public void testGetMaximum() throws Exception {
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 0, 5, '\0', '\0', null, null, null, 0);
        assertEquals(5, argImpl.getMaximum());
    }

    public void testGetMinimum() throws Exception {
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 2, 5, '\0', '\0', null, null, null, 0);
        assertEquals(2, argImpl.getMinimum());
    }

    public void testStripBoundaryQuotes() throws Exception {
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 0, 1, '\0', '\0', null, null, null, 0);
        assertEquals("value", argImpl.stripBoundaryQuotes("\"value\""));
        assertEquals("noquotes", argImpl.stripBoundaryQuotes("noquotes"));
        assertEquals("\"missingend", argImpl.stripBoundaryQuotes("\"missingend"));
        assertEquals("missingstart\"", argImpl.stripBoundaryQuotes("missingstart\""));
    }

    public void testIsRequired() throws Exception {
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 1, 1, '\0', '\0', null, null, null, 0); // min > 0
        assertTrue(argImpl.isRequired());
        ArgumentImpl argImpl2 = new ArgumentImpl("name", "desc", 0, 1, '\0', '\0', null, null, null, 0); // min = 0
        assertFalse(argImpl2.isRequired());
    }

    public void testDefaults() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 0, 1, '\0', '\0', null, null, Collections.singletonList("defaultVal"), 0);
        argImpl.defaults(wcl);
        assertEquals("defaultVal", wcl.getValues(argImpl, Collections.emptyList()).get(0));
    }

    public void testDefaultValues() throws Exception {
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), Collections.emptyList());
        ArgumentImpl argImpl = new ArgumentImpl("name", "desc", 0, 1, '\0', '\0', null, null, Collections.singletonList("defaultVal"), 0);
        argImpl.defaultValues(wcl, argImpl); // Call the method on ArgumentImpl instance
        assertEquals("defaultVal", wcl.getValues(argImpl, Collections.emptyList()).get(0));
    }
}
