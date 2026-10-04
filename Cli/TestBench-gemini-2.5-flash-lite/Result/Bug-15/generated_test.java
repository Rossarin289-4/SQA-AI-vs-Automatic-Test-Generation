package org.apache.commons.cli2.commandline;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Comparator; // Added import for Comparator
import java.util.ListIterator; // Added import for ListIterator
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.resource.ResourceConstants;
import org.apache.commons.cli2.resource.ResourceHelper;
import org.apache.commons.cli2.OptionException; // Added import for OptionException
import org.apache.commons.cli2.Argument; // Added import for Argument

public class WriteableCommandLineImplTest extends TestCase {
    // Dummy Option implementation for testing purposes
    private static class DummyOption implements Option {
        private String preferredName;
        private Set triggers;
        private Set prefixes;
        private String description;
        private int id;

        public DummyOption(String preferredName, Set triggers, Set prefixes, String description, int id) {
            this.preferredName = preferredName;
            this.triggers = triggers;
            this.prefixes = prefixes;
            this.description = description;
            this.id = id;
        }

        public DummyOption(String preferredName) {
            this.preferredName = preferredName;
            this.triggers = Collections.singleton(preferredName);
            this.prefixes = Collections.singleton("-");
            this.description = "";
            this.id = 0;
        }

        public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {
            // No-op for tests
        }

        public void defaults(WriteableCommandLine commandLine) {
            // No-op for tests
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            return triggers.contains(argument); // Basic check for tests
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            // No-op for tests
            return false;
        }

        public Set getTriggers() {
            return triggers;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            // No-op for tests
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            // No-op for tests
            return Collections.emptyList();
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            // No-op for tests
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return description;
        }

        public int getId() {
            return id;
        }

        public Option findOption(String trigger) {
            // Basic check for tests
            return triggers.contains(trigger) ? this : null;
        }

        public boolean isRequired() {
            return false;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DummyOption that = (DummyOption) o;
            return id == that.id &&
                   java.util.Objects.equals(preferredName, that.preferredName) &&
                   java.util.Objects.equals(triggers, that.triggers) &&
                   java.util.Objects.equals(prefixes, that.prefixes) &&
                   java.util.Objects.equals(description, that.description);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(preferredName, triggers, prefixes, description, id);
        }
    }

    // Dummy Argument implementation for testing purposes
    private static class DummyArgument extends DummyOption implements Argument {
        public DummyArgument(String preferredName, Set triggers, Set prefixes, String description, int id) {
            super(preferredName, triggers, prefixes, description, id);
        }

        public DummyArgument(String preferredName) {
            super(preferredName);
        }

        public char getInitialSeparator() {
            return '\0';
        }

        public void processValues(WriteableCommandLine commandLine, ListIterator args, Option option) throws OptionException {
            // No-op for tests
        }

        public void defaultValues(WriteableCommandLine commandLine, Option option) {
            // No-op for tests
        }

        public void validate(WriteableCommandLine commandLine, Option option) throws OptionException {
            // No-op for tests
        }

        public int getMinimum() {
            return 0;
        }

        public int getMaximum() {
            return Integer.MAX_VALUE;
        }
    }

    private WriteableCommandLineImpl commandLine;
    private Option option1;
    private Option option2;
    private Option option3;
    private Argument arg1;

    protected void setUp() throws Exception {
        super.setUp();
        List initialArgs = new ArrayList();
        initialArgs.add("-h");
        initialArgs.add("--help");
        initialArgs.add("value1");
        initialArgs.add("value2");

        this.commandLine = new WriteableCommandLineImpl(new DummyOption("root", Collections.singleton("-root"), Collections.singleton("-"), "root option", 0), initialArgs);
        this.option1 = new DummyOption("opt1", Collections.singleton("-o1"), Collections.singleton("-"), "Option 1", 1);
        this.option2 = new DummyOption("opt2", Collections.singleton("-o2"), Collections.singleton("-"), "Option 2", 2);
        this.option3 = new DummyOption("opt3", Collections.singleton("-o3"), Collections.singleton("-"), "Option 3", 3);
        this.arg1 = new DummyArgument("arg1", Collections.singleton("-a1"), Collections.singleton("-"), "Argument 1", 4);
    }

    public void testAddOption() throws Exception {
        commandLine.addOption(option1);
        assertTrue(commandLine.hasOption(option1));
        assertEquals(option1, commandLine.getOption("-o1"));
    }

    public void testAddOptionWithTriggers() throws Exception {
        Set triggers = new java.util.HashSet();
        triggers.add("-t1");
        triggers.add("--trigger1");
        Option option = new DummyOption("testOpt", triggers, Collections.singleton("-"), "Test Option", 5);
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption(option));
        assertEquals(option, commandLine.getOption("-t1"));
        assertEquals(option, commandLine.getOption("--trigger1"));
    }

    public void testAddValueToOption() throws Exception {
        commandLine.addOption(option1);
        commandLine.addValue(option1, "valueA");
        commandLine.addValue(option1, "valueB");
        List values = commandLine.getValues(option1, null);
        assertEquals(2, values.size());
        assertEquals("valueA", values.get(0));
        assertEquals("valueB", values.get(1));
    }

    public void testAddValueToArgument() throws Exception {
        commandLine.addOption(arg1);
        commandLine.addValue(arg1, "argValue1");
        commandLine.addValue(arg1, "argValue2");
        List values = commandLine.getUndefaultedValues(arg1);
        assertEquals(2, values.size());
        assertEquals("argValue1", values.get(0));
        assertEquals("argValue2", values.get(1));
    }

    public void testAddSwitch() throws Exception {
        commandLine.addOption(option1);
        commandLine.addSwitch(option1, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(option1, null));
    }

    public void testAddSwitchFalse() throws Exception {
        commandLine.addOption(option1);
        commandLine.addSwitch(option1, false);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(option1, null));
    }

    public void testAddSwitchTwiceThrowsException() throws Exception {
        commandLine.addOption(option1);
        commandLine.addSwitch(option1, true);
        try {
            commandLine.addSwitch(option1, false);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals(ResourceHelper.getResourceHelper().getMessage(ResourceConstants.SWITCH_ALREADY_SET), e.getMessage());
        }
    }

    public void testHasOptionWhenNotAdded() throws Exception {
        assertFalse(commandLine.hasOption(option1));
    }

    public void testHasOptionWhenAdded() throws Exception {
        commandLine.addOption(option1);
        assertTrue(commandLine.hasOption(option1));
    }

    public void testGetOptionWhenExists() throws Exception {
        commandLine.addOption(option1);
        assertEquals(option1, commandLine.getOption("-o1"));
    }

    public void testGetOptionWhenNotExists() throws Exception {
        assertNull(commandLine.getOption("-nonexistent"));
    }

    public void testGetValuesWithNoDefaults() throws Exception {
        commandLine.addOption(option1);
        commandLine.addValue(option1, "val1");
        commandLine.addValue(option1, "val2");
        List defaults = new ArrayList();
        List values = commandLine.getValues(option1, defaults);
        assertEquals(2, values.size());
        assertEquals("val1", values.get(0));
        assertEquals("val2", values.get(1));
    }

    public void testGetValuesWithNullDefaults() throws Exception {
        commandLine.addOption(option1);
        commandLine.addValue(option1, "val1");
        List values = commandLine.getValues(option1, null);
        assertEquals(1, values.size());
        assertEquals("val1", values.get(0));
    }

    public void testGetValuesWithEmptyDefaults() throws Exception {
        commandLine.addOption(option1);
        commandLine.addValue(option1, "val1");
        List defaults = Collections.emptyList();
        List values = commandLine.getValues(option1, defaults);
        assertEquals(1, values.size());
        assertEquals("val1", values.get(0));
    }

    public void testGetValuesWithDefaultOptionValues() throws Exception {
        commandLine.addOption(option1);
        commandLine.setDefaultValues(option1, Collections.singletonList("defaultVal"));
        List values = commandLine.getValues(option1, null);
        assertEquals(1, values.size());
        assertEquals("defaultVal", values.get(0));
    }

    public void testGetValuesWithCombinedValuesAndDefaults() throws Exception {
        commandLine.addOption(option1);
        commandLine.addValue(option1, "val1");
        commandLine.setDefaultValues(option1, Collections.singletonList("defaultVal"));
        List values = commandLine.getValues(option1, null);
        // The method merges the values, so it should contain both.
        // If values are present, defaults are appended only if defaults.size() > valueList.size()
        // Here, valueList.size() is 1, defaults.size() is 1, so it doesn't append.
        assertEquals(1, values.size());
        assertEquals("val1", values.get(0));
    }

    public void testGetValuesWithCombinedValuesAndMoreDefaults() throws Exception {
        commandLine.addOption(option1);
        commandLine.addValue(option1, "val1");
        List defaults = new ArrayList();
        defaults.add("defaultVal1");
        defaults.add("defaultVal2");
        commandLine.setDefaultValues(option1, defaults);
        List values = commandLine.getValues(option1, null);
        // The method appends defaults if defaultValues.size() > valueList.size().
        // Here, valueList.size() is 1, defaultValues.size() is 2. So it appends.
        assertEquals(3, values.size());
        assertEquals("val1", values.get(0));
        assertEquals("defaultVal1", values.get(1));
        assertEquals("defaultVal2", values.get(2));
    }

    public void testGetValuesWithCombinedValuesAndFewerDefaults() throws Exception {
        commandLine.addOption(option1);
        commandLine.addValue(option1, "val1");
        commandLine.addValue(option1, "val2");
        List defaults = Collections.singletonList("defaultVal");
        commandLine.setDefaultValues(option1, defaults);
        List values = commandLine.getValues(option1, null);
        // The method does not append defaults if defaultValues.size() <= valueList.size().
        assertEquals(2, values.size());
        assertEquals("val1", values.get(0));
        assertEquals("val2", values.get(1));
    }

    public void testGetUndefaultedValuesWhenNoValuesAdded() throws Exception {
        commandLine.addOption(option1);
        List values = commandLine.getUndefaultedValues(option1);
        assertEquals(0, values.size());
        assertEquals(Collections.EMPTY_LIST, values);
    }

    public void testGetUndefaultedValuesWhenValuesAdded() throws Exception {
        commandLine.addOption(option1);
        commandLine.addValue(option1, "valueA");
        commandLine.addValue(option1, "valueB");
        List values = commandLine.getUndefaultedValues(option1);
        assertEquals(2, values.size());
        assertEquals("valueA", values.get(0));
        assertEquals("valueB", values.get(1));
    }

    public void testGetSwitchWithNoDefaultsProvided() throws Exception {
        commandLine.addOption(option1);
        assertNull(commandLine.getSwitch(option1, null));
    }

    public void testGetSwitchWithNullDefaultProvided() throws Exception {
        commandLine.addOption(option1);
        assertNull(commandLine.getSwitch(option1, null));
    }

    public void testGetSwitchWithBooleanDefaultProvided() throws Exception {
        commandLine.addOption(option1);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(option1, Boolean.TRUE));
        assertEquals(Boolean.FALSE, commandLine.getSwitch(option1, Boolean.FALSE));
    }

    public void testGetSwitchWithDefaultSwitchSet() throws Exception {
        commandLine.addOption(option1);
        commandLine.setDefaultSwitch(option1, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(option1, null));
    }

    public void testGetSwitchWithBothDefaultSwitchAndProvidedDefault() throws Exception {
        commandLine.addOption(option1);
        commandLine.setDefaultSwitch(option1, Boolean.TRUE);
        // The order of precedence is: set switch, provided default, default switch.
        // Here, we are testing provided default vs default switch.
        // The provided default (Boolean.FALSE) should be returned if no switch is set.
        assertEquals(Boolean.FALSE, commandLine.getSwitch(option1, Boolean.FALSE));
    }

    public void testGetSwitchWithSetSwitchAndProvidedDefault() throws Exception {
        commandLine.addOption(option1);
        commandLine.addSwitch(option1, false);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(option1, Boolean.TRUE)); // Set switch should be returned
    }

    public void testGetPropertyWithDefaultOption() throws Exception {
        PropertyOption propOpt = new PropertyOption();
        commandLine.addProperty(propOpt, "key1", "value1");
        assertEquals("value1", commandLine.getProperty(propOpt, "key1", "default"));
    }

    public void testGetPropertyWithDefaultOptionAndMissingKey() throws Exception {
        PropertyOption propOpt = new PropertyOption();
        commandLine.addProperty(propOpt, "key1", "value1");
        assertEquals("default", commandLine.getProperty(propOpt, "key2", "default"));
    }

    public void testGetPropertyWithDefaultOptionAndNoPropertiesAdded() throws Exception {
        PropertyOption propOpt = new PropertyOption();
        assertEquals("default", commandLine.getProperty(propOpt, "key1", "default"));
    }

    public void testAddPropertyWithDefaultOption() throws Exception {
        PropertyOption propOpt = new PropertyOption();
        commandLine.addProperty(propOpt, "key1", "value1");
        assertEquals("value1", commandLine.getProperty(propOpt, "key1", null));
    }

    public void testAddPropertyWithDefaultOptionTwice() throws Exception {
        PropertyOption propOpt = new PropertyOption();
        commandLine.addProperty(propOpt, "key1", "value1");
        commandLine.addProperty(propOpt, "key1", "value2");
        assertEquals("value2", commandLine.getProperty(propOpt, "key1", null));
    }

    public void testGetPropertiesWithDefaultOption() throws Exception {
        PropertyOption propOpt = new PropertyOption();
        commandLine.addProperty(propOpt, "key1", "value1");
        commandLine.addProperty(propOpt, "key2", "value2");
        Set properties = commandLine.getProperties(propOpt);
        assertEquals(2, properties.size());
        assertTrue(properties.contains("key1"));
        assertTrue(properties.contains("key2"));
    }

    public void testGetPropertiesWithDefaultOptionWhenEmpty() throws Exception {
        PropertyOption propOpt = new PropertyOption();
        Set properties = commandLine.getProperties(propOpt);
        assertEquals(0, properties.size());
        assertEquals(Collections.EMPTY_SET, properties);
    }

    public void testLooksLikeOptionWhenPrefixMatches() throws Exception {
        assertTrue(commandLine.looksLikeOption("-h"));
        assertTrue(commandLine.looksLikeOption("--help"));
    }

    public void testLooksLikeOptionWhenNoPrefixMatches() throws Exception {
        assertFalse(commandLine.looksLikeOption("h"));
        assertFalse(commandLine.looksLikeOption("help"));
        assertFalse(commandLine.looksLikeOption("random"));
    }

    public void testToString() throws Exception {
        List initialArgs = new ArrayList();
        initialArgs.add("arg1");
        initialArgs.add("arg 2"); // argument with space
        initialArgs.add("arg3");
        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(new DummyOption("root"), initialArgs);
        assertEquals("arg1 \"arg 2\" arg3", cmdLine.toString());
    }

    public void testToStringWithEmptyArgs() throws Exception {
        List initialArgs = Collections.emptyList();
        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(new DummyOption("root"), initialArgs);
        assertEquals("", cmdLine.toString());
    }

    public void testGetOptions() throws Exception {
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        List options = commandLine.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(option1));
        assertTrue(options.contains(option2));
    }

    public void testGetOptionsWhenEmpty() throws Exception {
        List options = commandLine.getOptions();
        assertEquals(0, options.size());
        assertEquals(Collections.EMPTY_LIST, options);
    }

    public void testGetOptionTriggers() throws Exception {
        // The current implementation of WriteableCommandLineImpl adds all triggers to nameToOption,
        // and then returns the keys of nameToOption.
        // The setup has two options: option1 (trigger "-o1") and option2 (trigger "-o2").
        // The constructor also adds "-h" and "--help" to the normalised list, and they are used for nameToOption internally.
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Set triggers = commandLine.getOptionTriggers();
        assertEquals(4, triggers.size()); // "-h", "--help", "-o1", "-o2"
        assertTrue(triggers.contains("-h"));
        assertTrue(triggers.contains("--help"));
        assertTrue(triggers.contains("-o1"));
        assertTrue(triggers.contains("-o2"));
    }

    public void testGetOptionTriggersWhenEmpty() throws Exception {
        // Need to create a new commandLine instance to ensure it's empty.
        WriteableCommandLineImpl emptyCommandLine = new WriteableCommandLineImpl(new DummyOption("root"), Collections.emptyList());
        Set triggers = emptyCommandLine.getOptionTriggers();
        assertEquals(0, triggers.size());
        assertEquals(Collections.EMPTY_SET, triggers);
    }


    public void testSetDefaultValues() throws Exception {
        commandLine.setDefaultValues(option1, Collections.singletonList("default1"));
        List values = commandLine.getValues(option1, null);
        assertEquals(1, values.size());
        assertEquals("default1", values.get(0));
    }

    public void testSetDefaultValuesToNull() throws Exception {
        commandLine.setDefaultValues(option1, Collections.singletonList("default1"));
        commandLine.setDefaultValues(option1, null);
        commandLine.addValue(option1, "value1"); // add an actual value
        List values = commandLine.getValues(option1, null);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    public void testSetDefaultSwitch() throws Exception {
        commandLine.setDefaultSwitch(option1, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(option1, null));
    }

    public void testSetDefaultSwitchToNull() throws Exception {
        commandLine.setDefaultSwitch(option1, Boolean.TRUE);
        commandLine.setDefaultSwitch(option1, null);
        assertNull(commandLine.getSwitch(option1, null));
    }

    public void testGetNormalised() throws Exception {
        List normalisedList = commandLine.getNormalised();
        assertEquals(4, normalisedList.size());
        assertEquals("-h", normalisedList.get(0));
        assertEquals("--help", normalisedList.get(1));
        assertEquals("value1", normalisedList.get(2));
        assertEquals("value2", normalisedList.get(3));
    }

    public void testGetNormalisedWhenEmpty() throws Exception {
        List initialArgs = Collections.emptyList();
        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(new DummyOption("root"), initialArgs);
        List normalisedList = cmdLine.getNormalised();
        assertEquals(0, normalisedList.size());
        assertEquals(Collections.EMPTY_LIST, normalisedList);
    }

    public void testAddPropertyWithDefaultPropertyOption() throws Exception {
        commandLine.addProperty("propKey", "propValue"); // This call should use the PropertyOption
        assertEquals("propValue", commandLine.getProperty("propKey")); // This call should use the PropertyOption
    }



    public void testGetPropertiesWithDefaultPropertyOption() throws Exception {
        commandLine.addProperty("propKey1", "propValue1"); // This call should use the PropertyOption
        commandLine.addProperty("propKey2", "propValue2"); // This call should use the PropertyOption
        Set properties = commandLine.getProperties(); // This call should use the PropertyOption
        assertEquals(2, properties.size());
        assertTrue(properties.contains("propKey1"));
        assertTrue(properties.contains("propKey2"));
    }

    public void testGetPropertiesWithDefaultPropertyOptionWhenEmpty() throws Exception {
        Set properties = commandLine.getProperties(); // This call should use the PropertyOption
        assertEquals(0, properties.size());
        assertEquals(Collections.EMPTY_SET, properties);
    }
}
