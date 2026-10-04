package org.apache.commons.cli2;

import junit.framework.TestCase;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.GroupImpl;
import org.apache.commons.cli2.option.OptionImpl;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.resource.ResourceConstants;
import org.apache.commons.cli2.resource.ResourceHelper;
import java.util.Collection;
import java.util.HashSet;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.option.Switch;
import org.apache.commons.cli2.option.Command;
import org.apache.commons.cli2.option.OptionImpl; // Added for OptionImpl usage

public class OptionTest extends TestCase {

    private GroupImpl group1;
    private WriteableCommandLineImpl commandLine;
    private Option option1;
    private Option option2;
    private Option option3;

    // Mock Validator for ArgumentImpl
    private static class MockValidator implements org.apache.commons.cli2.Validator {
        public Object validate(Object value) throws OptionException { return value; }
        public String getExplanation(Object value) { return "Valid"; }
    }

    protected void setUp() throws Exception {
        super.setUp();

        // Option interface methods are tested via concrete subclasses.
        // GroupImpl is a concrete subclass.
        // Let's create options using ArgumentImpl or PropertyOption as they are concrete.

        // Option 1: ArgumentImpl for simple Option usage
        List<Option> emptyOptions = new ArrayList<>();
        option1 = new ArgumentImpl("argOpt1", "Argument Option 1", 0, 1, ' ', ' ', new MockValidator(), null, null, 1);

        // Option 2: PropertyOption
        option2 = new PropertyOption("-P", "Property Option", 2);

        // Option 3: Another ArgumentImpl for diversity
        option3 = new ArgumentImpl("argOpt2", "Argument Option 2", 1, 2, '=', '/', null, null, null, 3);


        List<Option> groupOptions = new ArrayList<>();
        groupOptions.add(option1); // Using option1 as part of group
        group1 = new GroupImpl(groupOptions, "group1", "Group Description", 0, 1);

        // WriteableCommandLineImpl requires a rootOption and arguments in its constructor.
        // A minimal valid WriteableCommandLineImpl needs a root Option.
        Option dummyRootOption = new PropertyOption("root", "Root Option", 0);
        List<String> initialArgs = new ArrayList<>();
        commandLine = new WriteableCommandLineImpl(dummyRootOption, initialArgs);
    }

    // Tests for Option interface methods (implemented by OptionImpl and its subclasses)
    public void testGetTriggers() throws Exception {
        // Test GroupImpl
        List<Option> group1Options = new ArrayList<>();
        group1Options.add(option1); // option1 is an ArgumentImpl, which implements Option
        GroupImpl group = new GroupImpl(group1Options, "testGroup", "Test Group Desc", 0, 1);
        Set<String> triggers = group.getTriggers();
        assertTrue("Triggers should not be null", triggers != null);
        assertTrue("Triggers should contain argument name if it's used as trigger", triggers.contains("argOpt1")); // ArgumentImpl uses its name as trigger

        // Test PropertyOption
        PropertyOption propOpt = new PropertyOption("-P", "Property Option", 10);
        assertEquals("PropertyOption triggers", Set.of("-P"), propOpt.getTriggers());
    }

    public void testGetPrefixes() throws Exception {
        // Test GroupImpl
        List<Option> group1Options = new ArrayList<>();
        group1Options.add(option1);
        GroupImpl group = new GroupImpl(group1Options, "testGroup", "Test Group Desc", 0, 1);
        Set<String> prefixes = group.getPrefixes();
        assertTrue("Prefixes should not be null", prefixes != null);
        // ArgumentImpl typically has no specific prefixes unless set by a builder, its name is the trigger.
        // PropertyOption has prefixes.
        assertTrue("Prefixes should contain '-' from PropertyOption if it were in group", !prefixes.contains("-")); // option1 is ArgumentImpl, no prefixes

        PropertyOption propOpt = new PropertyOption("-P", "Property Option", 10);
        assertEquals("PropertyOption prefixes", Set.of("-"), propOpt.getPrefixes());
    }

    public void testGetPreferredName() throws Exception {
        assertEquals("Group preferred name", "group1", group1.getPreferredName());
        assertEquals("ArgumentImpl preferred name", "argOpt1", option1.getPreferredName());
        assertEquals("PropertyOption preferred name", "-P", option2.getPreferredName());
    }

    public void testGetDescription() throws Exception {
        assertEquals("Group description", "Group Description", group1.getDescription());
        assertEquals("ArgumentImpl description", "Argument Option 1", option1.getDescription());
        assertEquals("PropertyOption description", "Property Option", option2.getDescription());
    }

    public void testGetId() throws Exception {
        // OptionImpl constructor takes id
        assertEquals("ArgumentImpl id", 1, option1.getId()); // ArgumentImpl constructor used here
        assertEquals("PropertyOption id", 2, option2.getId());
    }

    public void testFindOption() throws Exception {
        // Test GroupImpl's findOption by looking for a trigger within its options
        Option foundOption = group1.findOption("argOpt1"); // Using ArgumentImpl's name as trigger
        assertNotNull("Should find option with trigger 'argOpt1'", foundOption);
        assertEquals("Found option should be option1", option1, foundOption);

        // Test GroupImpl's findOption for a non-existent trigger
        assertNull("Should not find option with trigger -o99", group1.findOption("-o99"));

        // Test PropertyOption directly
        assertEquals("PropertyOption findOption should return itself for its trigger", option2, option2.findOption("-P"));
        assertNull("PropertyOption findOption should return null for other trigger", option2.findOption("--other"));
    }

    public void testIsRequired() throws Exception {
        // GroupImpl constructor has minimum/maximum
        GroupImpl requiredGroup = new GroupImpl(Collections.emptyList(), "reqGroup", "Required Group", 1, 1);
        assertTrue("Group with minimum > 0 should be required", requiredGroup.isRequired());

        GroupImpl optionalGroup = new GroupImpl(Collections.emptyList(), "optGroup", "Optional Group", 0, 1);
        assertFalse("Group with minimum == 0 should not be required", optionalGroup.isRequired());

        // ArgumentImpl isRequired
        ArgumentImpl requiredArg = new ArgumentImpl("reqArg", "Desc", 1, 1, '=', '/', null, null, null, 23);
        assertTrue("Argument with min=1 should be required", requiredArg.isRequired());

        ArgumentImpl optionalArg = new ArgumentImpl("optArg", "Desc", 0, 1, '=', '/', null, null, null, 24);
        assertFalse("Argument with min=0 should not be required", optionalArg.isRequired());
    }

    public void testGetParent() throws Exception {
        // Test parent setting on ArgumentImpl (which extends OptionImpl)
        assertEquals("Option parent should be null initially", null, option1.getParent());
        option1.setParent(group1);
        assertEquals("Option parent should be group1", group1, option1.getParent());

        // Test parent setting on GroupImpl
        assertEquals("Group parent should be null initially", null, group1.getParent());
        Option someOtherOption = new PropertyOption("-parent", "Parent Option", 100);
        group1.setParent(someOtherOption);
        assertEquals("Group parent should be someOtherOption", someOtherOption, group1.getParent());
    }

    public void testSetParent() throws Exception {
        testGetParent(); // This test already covers setParent
    }

    public void testDefaults() throws Exception {
        // OptionImpl.defaults() is a no-op.
        // GroupImpl.defaults() calls super.defaults() and then iterates through options.
        // ArgumentImpl.defaults() calls its own defaultValues method.
        
        // Test ArgumentImpl.defaults() - needs a WriteableCommandLine
        WriteableCommandLineImpl cmdLineForDefaults = new WriteableCommandLineImpl(new PropertyOption(), new ArrayList<>());
        cmdLineForDefaults.setDefaultValues(option1, List.of("default1")); // Set default for option1
        // We need to cast to ArgumentImpl to call its defaults method.
        if (option1 instanceof ArgumentImpl) {
            ((ArgumentImpl) option1).defaults(cmdLineForDefaults); // Call the defaults method
        }
        // The default values are stored in cmdLine.defaultValues, which is not directly accessible for assertion here
        // without modifying the mock or using getters if available.
        // For now, we test that it does not throw an exception.
        assertTrue("ArgumentImpl.defaults() did not throw exception", true);

        // Test GroupImpl.defaults()
        // This will also call defaults on its children.
        group1.defaults(commandLine); // Should not throw exception
        assertTrue("GroupImpl defaults() should not throw exception", true);
    }

    // Test methods for WriteableCommandLineImpl
    public void testAddValue() throws Exception {
        commandLine.addValue(option1, "value1");
        commandLine.addValue(option1, "value2");

        List<Object> values = commandLine.getValues(option1, null);
        assertEquals("Should have two values", 2, values.size());
        assertEquals("First value", "value1", values.get(0));
        assertEquals("Second value", "value2", values.get(1));
    }

    public void testAddSwitch() throws Exception {
        Option switchOption = new PropertyOption("-s", "Switch Option", 4); // Using PropertyOption as a switch-like option
        commandLine.addSwitch(switchOption, true);
        assertEquals("Switch should be true", Boolean.TRUE, commandLine.getSwitch(switchOption, null));

        commandLine.addSwitch(switchOption, false);
        assertEquals("Switch should be false", Boolean.FALSE, commandLine.getSwitch(switchOption, null));
    }

    public void testAddSwitchAlreadySet() throws Exception {
        Option switchOption = new PropertyOption("-s", "Switch Option", 4);
        commandLine.addSwitch(switchOption, true);
        try {
            commandLine.addSwitch(switchOption, false);
            fail("Should throw IllegalStateException if switch is already set");
        } catch (IllegalStateException e) {
            // Expected exception
            assertTrue(e.getMessage().contains(ResourceConstants.SWITCH_ALREADY_SET));
        }
    }

    public void testHasOption() throws Exception {
        assertFalse("CommandLine should not have option1 initially", commandLine.hasOption(option1));
        commandLine.addOption(option1);
        assertTrue("CommandLine should have option1 after adding", commandLine.hasOption(option1));
    }

    public void testGetOption() throws Exception {
        Option option = new PropertyOption("-trg", "Trigger Option", 8);
        commandLine.addOption(option); // Make sure option is added
        assertEquals("Should retrieve option by trigger", option, commandLine.getOption("-trg"));
        assertNull("Should return null for unknown trigger", commandLine.getOption("unknown"));
    }

    public void testGetValues() throws Exception {
        commandLine.addValue(option1, "v1");
        commandLine.addValue(option1, "v2");
        List<Object> retrievedValues = commandLine.getValues(option1, null);
        assertEquals("Should retrieve added values", List.of("v1", "v2"), retrievedValues);

        // Test with default values provided to the method
        List<Object> defaults = List.of("d1", "d2");
        List<Object> retrievedWithDefaults = commandLine.getValues(option1, defaults);
        // When values are present, the provided defaults are ignored if the list is not empty.
        assertEquals("Should retrieve added values when defaults are provided", List.of("v1", "v2"), retrievedWithDefaults);

        // Test with no values added, but defaults provided to the method
        Option noValueOption = new ArgumentImpl("noValOpt", "No Vals", 0, 1, '=', '/', null, null, null, 10);
        List<Object> retrievedWithDefaultsOnly = commandLine.getValues(noValueOption, defaults);
        assertEquals("Should retrieve default values when no values are added", List.of("d1", "d2"), retrievedWithDefaultsOnly);

        // Test with default values set programmatically on the command line
        commandLine.setDefaultValues(option1, List.of("progDef1", "progDef2"));
        List<Object> retrievedWithProgrammaticDefaults = commandLine.getValues(option1, null);
        // getValues will first check commandLine.values, then this.defaultValues (programmatic)
        assertEquals("Should retrieve programmatic default values when no values are added", List.of("progDef1", "progDef2"), retrievedWithProgrammaticDefaults);
    }

    public void testGetUndefaultedValues() throws Exception {
        commandLine.addValue(option1, "u1");
        commandLine.addValue(option1, "u2");
        List<Object> undefaultedValues = commandLine.getUndefaultedValues(option1);
        assertEquals("Should retrieve undefaulted values", List.of("u1", "u2"), undefaultedValues);

        Option emptyOption = new ArgumentImpl("emptyOpt", "Empty", 0, 1, '=', '/', null, null, null, 12);
        List<Object> emptyValues = commandLine.getUndefaultedValues(emptyOption);
        assertTrue("Should return empty list for option with no values", emptyValues.isEmpty());
    }

    public void testGetSwitch() throws Exception {
        Option switchOption = new PropertyOption("-gs", "Get Switch Option", 13);
        commandLine.addSwitch(switchOption, true);
        assertEquals("Should retrieve added switch", Boolean.TRUE, commandLine.getSwitch(switchOption, null));

        // Test with default value provided to method
        assertEquals("Should retrieve added switch overriding default", Boolean.TRUE, commandLine.getSwitch(switchOption, Boolean.FALSE));

        // Test when switch not set, but default provided to method
        Option unsetOption = new PropertyOption("-uo", "Unset Option", 14);
        assertEquals("Should retrieve default value when switch is unset", Boolean.FALSE, commandLine.getSwitch(unsetOption, Boolean.FALSE));

        // Test when switch not set and no default provided to method
        assertNull("Should return null when switch is unset and no default", commandLine.getSwitch(unsetOption, null));

        // Test when switch not set, but programmatic default switch is set
        commandLine.setDefaultSwitch(switchOption, Boolean.FALSE); // Setting programmatic default
        assertEquals("Should retrieve programmatic default switch when unset", Boolean.FALSE, commandLine.getSwitch(switchOption, null));
    }

    public void testLooksLikeOption() throws Exception {
        // WriteableCommandLineImpl relies on rootOption.getPrefixes()
        // For commandLine, the rootOption is a PropertyOption("-root", ...)
        assertTrue("Should identify option starting with '-'", commandLine.looksLikeOption("-someOption"));
        assertTrue("Should identify option starting with '--'", commandLine.looksLikeOption("--anotherOption"));
        assertFalse("Should not identify argument not starting with prefix", commandLine.looksLikeOption("plainArg"));
    }

    public void testToString() throws Exception {
        // WriteableCommandLineImpl.toString() formats the normalised list.
        WriteableCommandLineImpl emptyCommandLine = new WriteableCommandLineImpl(new PropertyOption("root", "Root", 0), new ArrayList<>());
        assertEquals("Empty command line toString", "", emptyCommandLine.toString());
    }

    public void testGetOptions() throws Exception {
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        List<Option> options = commandLine.getOptions();
        assertEquals("Should return list of added options", 2, options.size());
        assertTrue("List should contain option1", options.contains(option1));
        assertTrue("List should contain option2", options.contains(option2));
    }

    public void testGetOptionTriggers() throws Exception {
        commandLine.addOption(option1); // option1 triggers are "argOpt1"
        commandLine.addOption(option2); // option2 triggers are "-P"
        Set<String> triggers = commandLine.getOptionTriggers();
        assertTrue("Triggers set should contain 'argOpt1'", triggers.contains("argOpt1"));
        assertTrue("Triggers set should contain '-P'", triggers.contains("-P"));
    }

    public void testSetDefaultValues() throws Exception {
        commandLine.setDefaultValues(option1, List.of("default1", "default2"));
        // This method modifies internal state, verification would be via getValues.
        // Tested in testGetValues.
        assertTrue(true); // Method call succeeded.
    }

    public void testSetDefaultSwitch() throws Exception {
        Option switchOption = new PropertyOption("-sds", "Set Default Switch Option", 18);
        commandLine.setDefaultSwitch(switchOption, Boolean.TRUE);
        // Verification via getSwitch. Tested in testGetSwitch.
        assertTrue(true); // Method call succeeded.
    }

    public void testGetNormalised() throws Exception {
        // The 'normalised' list is typically populated during parsing by 'process' methods.
        // For a basic test, an empty command line should yield an empty list.
        assertEquals("Empty command line normalised list", Collections.emptyList(), commandLine.getNormalised());
    }

    // Tests for GroupImpl.process and related methods
    public void testGroupImplProcess() throws Exception {
        // We need a ListIterator for the arguments.
        // GroupImpl.process needs to call Option.process.
        // Let's use ArgumentImpl and PropertyOption as Options within the group.
        // ArgumentImpl needs a validator.
        ArgumentImpl argForGroup = new ArgumentImpl("argVal", "Value", 1, 1, '=', '/', new MockValidator(), null, null, 30);
        PropertyOption propForGroup = new PropertyOption("-prop", "Property", 31);

        List<Option> groupOptions = new ArrayList<>();
        groupOptions.add(argForGroup);
        groupOptions.add(propForGroup);
        GroupImpl group = new GroupImpl(groupOptions, "procGroup", "Processing Group", 0, 2);

        // Prepare arguments
        List<String> argsList = new ArrayList<>(List.of("val1", "-prop", "value2"));
        ListIterator<String> argsIterator = argsList.listIterator();

        // Prepare WriteableCommandLine
        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(new PropertyOption("root", "Root", 0), new ArrayList<>());

        // Perform processing
        group.process(cmdLine, argsIterator);

        // Assertions:
        // 1. Iterator position: after processing "val1" (argVal) and "-prop" (propForGroup), it should be at the end.
        assertEquals("Iterator should be at the end after processing", 3, argsIterator.nextIndex());

        // 2. Values added to commandLine:
        assertEquals("Argument value should be added", List.of("val1"), cmdLine.getValues(argForGroup, null));
        // PropertyOption doesn't add values in the same way. Its processing is more about setting properties.
        assertTrue("Property option should be added to command line", cmdLine.hasOption(propForGroup));
    }

    public void testGroupImplValidate() throws Exception {
        // Test validation for required options in GroupImpl
        ArgumentImpl requiredArg = new ArgumentImpl("reqArg", "Required Arg", 1, 1, '=', '/', new MockValidator(), null, null, 23);
        List<Option> groupOptions = new ArrayList<>();
        groupOptions.add(requiredArg);
        GroupImpl requiredGroup = new GroupImpl(groupOptions, "requiredGroup", "Required Group", 1, 1);

        // Test case: required option is NOT present
        WriteableCommandLineImpl emptyCommandLine = new WriteableCommandLineImpl(new PropertyOption(), new ArrayList<>());
        try {
            requiredGroup.validate(emptyCommandLine);
            fail("Validation should fail if required option is missing");
        } catch (OptionException e) {
            // Need to check the actual message key thrown by validate method.
            // The exception message might be constructed differently.
            // For now, we assume the basic structure.
            assertTrue("Exception message should indicate missing option", e.getMessage().contains("MISSING_OPTION"));
        }

        // Test case: required option IS present
        WriteableCommandLineImpl cmdLineWithOption = new WriteableCommandLineImpl(new PropertyOption(), new ArrayList<>());
        // For validation to pass, the argument must be present and have its values processed.
        List<String> argsList = new ArrayList<>(List.of("someValue"));
        ListIterator<String> argsIterator = argsList.listIterator();
        requiredArg.process(cmdLineWithOption, argsIterator); // Process the value for the argument

        requiredGroup.validate(cmdLineWithOption); // Now validate
        // Should not throw an exception
        assertTrue("Validation should pass if required option is present and processed", true);

        // Test validation for maximum options in GroupImpl
        PropertyOption optA = new PropertyOption("-a", "Opt A", 15);
        PropertyOption optB = new PropertyOption("-b", "Opt B", 16);
        List<Option> groupOptionsMax = new ArrayList<>();
        groupOptionsMax.add(optA);
        groupOptionsMax.add(optB);
        GroupImpl maxGroup = new GroupImpl(groupOptionsMax, "maxGroup", "Max Group", 0, 1); // Max is 1

        WriteableCommandLineImpl tooManyOptionsCmdLine = new WriteableCommandLineImpl(new PropertyOption(), new ArrayList<>());
        tooManyOptionsCmdLine.addOption(optA);
        tooManyOptionsCmdLine.addOption(optB); // Adding a second option exceeds max of 1

        try {
            maxGroup.validate(tooManyOptionsCmdLine);
            fail("Validation should fail if too many options are present");
        } catch (OptionException e) {
            assertTrue("Exception message should indicate unexpected token", e.getMessage().contains("UNEXPECTED_TOKEN"));
        }
    }

    public void testGroupImplAppendUsage() throws Exception {
        // Test GroupImpl.appendUsage. Requires a settings set and comparator.
        List<Option> groupOptions = new ArrayList<>();
        groupOptions.add(option1); // ArgumentImpl
        GroupImpl group = new GroupImpl(groupOptions, "myGroup", "My Description", 0, 1);

        StringBuffer buffer = new StringBuffer();
        Set<DisplaySetting> settings = new HashSet<>(DisplaySetting.ALL);
        Comparator<Option> comp = ReverseStringComparator.getInstance(); // Using the comparator from GroupImpl source

        group.appendUsage(buffer, settings, comp);

        // Check for presence of group name and potentially the argument's usage.
        assertTrue("Buffer should contain group name", buffer.toString().contains("myGroup"));
        assertTrue("Buffer should contain argument name", buffer.toString().contains("argVal"));
        // Check optional brackets if DISPLAY_OPTIONAL is set
        assertTrue("Buffer should start with '[' for optional group", buffer.toString().startsWith("["));
        assertTrue("Buffer should end with ']' for optional group", buffer.toString().endsWith("]"));
    }

    public void testGroupImplHelpLines() throws Exception {
        // GroupImpl.helpLines generates HelpLine objects.
        List<Option> groupOptions = new ArrayList<>();
        groupOptions.add(option1); // ArgumentImpl
        GroupImpl group = new GroupImpl(groupOptions, "myGroup", "My Description", 0, 1);

        Set<DisplaySetting> settings = new HashSet<>(DisplaySetting.ALL);
        Comparator<Option> comp = ReverseStringComparator.getInstance();

        List<HelpLine> helpLines = group.helpLines(0, settings, comp);

        // We expect at least one HelpLine if DISPLAY_GROUP_NAME is set.
        assertTrue("Should generate help lines", !helpLines.isEmpty());
        // Check if it contains the group name
        boolean foundGroupHelpLine = false;
        for (HelpLine hl : helpLines) {
            if (hl.getText().contains("myGroup")) {
                foundGroupHelpLine = true;
                break;
            }
        }
        assertTrue("Help lines should contain group information", foundGroupHelpLine);
    }

    public void testGroupImplGetOptions() throws Exception {
        List<Option> options = new ArrayList<>();
        options.add(option1);
        options.add(option2); // PropertyOption is also an Option
        GroupImpl group = new GroupImpl(options, "testGroup", "Test Group Desc", 0, 1);
        List<Option> groupOptions = group.getOptions();
        assertEquals("Should return the non-argument options", 2, groupOptions.size());
        assertTrue("Options list should contain option1", groupOptions.contains(option1));
        assertTrue("Options list should contain option2", groupOptions.contains(option2));
    }

    public void testGroupImplGetAnonymous() throws Exception {
        // For this test, we need an Argument.
        // ArgumentImpl is a concrete subclass of OptionImpl.
        ArgumentImpl anonymousArg = new ArgumentImpl("argName", "argDesc", 1, 1, ' ', ' ', new MockValidator(), null, null, 20);
        List<Option> groupOptions = new ArrayList<>();
        groupOptions.add(anonymousArg);
        GroupImpl group = new GroupImpl(groupOptions, "testGroup", "Test Group Desc", 0, 1);

        List<Option> anonymousList = group.getAnonymous();
        assertEquals("Should return the anonymous arguments", 1, anonymousList.size());
        assertTrue("Anonymous list should contain the argument", anonymousList.contains(anonymousArg));
    }

    // Test for ReverseStringComparator (static inner class within GroupImpl, accessible via GroupImpl)
    public void testReverseStringComparator() throws Exception {
        // Accessing static method directly.
        Comparator comparator = ReverseStringComparator.getInstance();
        assertEquals("Comparator instance should be singleton", comparator, ReverseStringComparator.getInstance());

        // Test comparison logic
        assertTrue("Comparing 'abc' and 'def' should result in negative", comparator.compare("abc", "def") < 0);
        assertTrue("Comparing 'def' and 'abc' should result in positive", comparator.compare("def", "abc") > 0);
        assertEquals("Comparing 'abc' and 'abc' should be zero", 0, comparator.compare("abc", "abc"));
        assertTrue("Comparing 'apple' and 'banana' should be negative", comparator.compare("apple", "banana") < 0);
    }

    // Test methods for OptionImpl (tested via concrete subclasses)
    public void testOptionImplToString() throws Exception {
        // OptionImpl.toString() calls appendUsage.
        // We'll test this via a concrete implementation like GroupImpl.
        List<Option> groupOptions = new ArrayList<>();
        groupOptions.add(option1); // ArgumentImpl
        GroupImpl group = new GroupImpl(groupOptions, "myGroup", "My Description", 0, 1);

        String usageString = group.toString();
        assertTrue("toString should generate usage string", usageString != null && !usageString.isEmpty());
        assertTrue("toString should contain group name", usageString.contains("myGroup"));
        assertTrue("toString should contain argument name", usageString.contains("argVal"));
    }

    public void testOptionImplEqualsAndHashCode() throws Exception {
        // Test equality for OptionImpl. This relies on getId(), getPreferredName(), getDescription(), getPrefixes(), getTriggers().
        // Using PropertyOption for this test.
        PropertyOption optA = new PropertyOption("name", "desc", 100);
        PropertyOption optB = new PropertyOption("name", "desc", 100);
        PropertyOption optC = new PropertyOption("otherName", "desc", 100);
        PropertyOption optD = new PropertyOption("name", "otherDesc", 100);
        PropertyOption optE = new PropertyOption("-t", "desc", 100); // Prefix/trigger used as name
        PropertyOption optF = new PropertyOption("-name", "desc", 100); // Another name
        PropertyOption optG = new PropertyOption("name", "desc", 101);

        assertEquals("Equal options should be equal", optA, optB);
        assertEquals("Equal options should have same hash code", optA.hashCode(), optB.hashCode());

        assertFalse("Options with different names should not be equal", optA.equals(optC));
        assertFalse("Options with different descriptions should not be equal", optA.equals(optD));
        // For PropertyOption, the 'name' parameter is used as the option string, which acts as trigger/name.
        assertFalse("Options with different names/triggers should not be equal", optA.equals(optE));
        assertFalse("Options with different names/triggers should not be equal", optA.equals(optF));
        assertFalse("Options with different IDs should not be equal", optA.equals(optG));

        assertFalse("Option should not equal null", optA.equals(null));
        assertFalse("Option should not equal different object type", optA.equals("someString"));
    }

    public void testOptionImplFindOption() throws Exception {
        // OptionImpl.findOption checks if the trigger is in its own triggers.
        // Tested by concrete implementations.
        PropertyOption optionWithTriggers = new PropertyOption("-x", "Desc X", 21); // -x is name, trigger, prefix
        assertEquals("Should find itself for trigger '-x'", optionWithTriggers, optionWithTriggers.findOption("-x"));
        assertNull("Should return null for unknown trigger", optionWithTriggers.findOption("-z"));
    }

    public void testOptionImplCheckPrefixes() throws Exception {
        // This method is protected in OptionImpl and called by subclasses.
        // We can test it using GroupImpl which calls it.
        // The method ensures that all triggers start with one of the prefixes.
        // If not, it throws an IllegalArgumentException.

        // Case 1: Valid prefixes and triggers for ArgumentImpl
        List<Option> options = new ArrayList<>();
        options.add(new ArgumentImpl("arg1", "Arg 1", 0, 1, '=', '/', new MockValidator(), null, null, 1)); // No explicit prefixes, so should be ok.
        GroupImpl validGroup = new GroupImpl(options, "validGroup", "Valid Group", 0, 1);
        assertTrue("Valid group with ArgumentImpl should be created without exception", true);

        // Case 2: Invalid trigger (does not start with any prefix)
        Set<String> prefixes = Set.of("-"); // Only hyphen
        List<Option> invalidOptions = new ArrayList<>();
        // PropertyOption("---", ...) should throw error because its trigger '---' doesn't start with '-'
        invalidOptions.add(new PropertyOption("---", "Invalid Property", 3));
        try {
            new GroupImpl(invalidOptions, "invalidGroup", "Invalid Group", 0, 1);
            fail("Should throw IllegalArgumentException for invalid trigger/prefix combination");
        } catch (IllegalArgumentException e) {
            // The message format might vary, check for key part
            assertTrue(e.getMessage().contains(ResourceConstants.OPTION_TRIGGER_NEEDS_PREFIX));
        }
    }

    // Test for PropertyOption constructors
    public void testPropertyOptionConstructor() throws Exception {
        PropertyOption po1 = new PropertyOption();
        assertEquals("Default constructor preferred name", "properties", po1.getPreferredName());
        assertEquals("Default constructor description", "properties", po1.getDescription());
        assertEquals("Default constructor id", 0, po1.getId());
        assertTrue("Default constructor triggers", po1.getTriggers().isEmpty());
        assertTrue("Default constructor prefixes", po1.getPrefixes().isEmpty());

        PropertyOption po2 = new PropertyOption("-P", "Property option", 101);
        assertEquals("Parameterized constructor preferred name", "-P", po2.getPreferredName());
        assertEquals("Parameterized constructor description", "Property option", po2.getDescription());
        assertEquals("Parameterized constructor id", 101, po2.getId());
        assertEquals("Parameterized constructor triggers", Set.of("-P"), po2.getTriggers());
        assertEquals("Parameterized constructor prefixes", Set.of("-"), po2.getPrefixes());
    }

    // Test for ArgumentImpl constructor and basic methods
    public void testArgumentImplConstructorAndBasicMethods() throws Exception {
        ArgumentImpl arg = new ArgumentImpl("name", "description", 1, 5, '=', '/', new MockValidator(), null, null, 22);

        assertEquals("Argument name", "name", arg.getPreferredName());
        assertEquals("Argument description", "description", arg.getDescription());
        assertEquals("Argument minimum", 1, arg.getMinimum());
        assertEquals("Argument maximum", 5, arg.getMaximum());
        assertEquals("Argument initial separator", '=', arg.getInitialSeparator());
        assertEquals("Argument subsequent separator", '/', arg.getS<error>ubsequentSeparator()); // Corrected syntax error
        assertEquals("Argument id", 22, arg.getId());
        assertNotNull("Argument validator should not be null", arg.getValidator()); // Assuming Validator is stored and accessible
        assertNull("Argument consumeRemaining should be null", arg.getConsumeRemaining()); // Assuming getConsumeRemaining() exists
    }
}
