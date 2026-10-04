package org.apache.commons.cli2.option;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.resource.ResourceConstants;
import org.apache.commons.cli2.impl.WriteableCommandLineImpl;
import org.apache.commons.cli2.impl.HelpLineImpl;

public class GroupImplTest extends TestCase {
    // Test method for the constructor and basic properties
    public void testConstructorAndProperties() throws Exception {
        List<Option> options = new ArrayList<>();
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        assertEquals("myGroup", group.getPreferredName());
        assertEquals("A test group", group.getDescription());
        assertEquals(0, group.getMinimum());
        assertEquals(1, group.getMaximum());
        assertTrue(group.getOptions().isEmpty());
        assertTrue(group.getAnonymous().isEmpty());
        assertTrue(group.getPrefixes().isEmpty());
        assertTrue(group.getTriggers().isEmpty());
    }

    // Test with options that are Arguments
    public void testConstructorWithArguments() throws Exception {
        List<Option> options = new ArrayList<>();
        Argument arg1 = new MockArgument();
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        assertTrue(group.getOptions().isEmpty()); // Arguments are removed from the main list
        assertEquals(1, group.getAnonymous().size());
        assertSame(arg1, group.getAnonymous().get(0));
    }

    // Test with options that have triggers
    public void testConstructorWithOptionsWithTriggers() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", false, "--option", "description");
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        assertEquals(1, group.getOptions().size());
        assertSame(opt1, group.getOptions().get(0));
        assertEquals(2, group.getTriggers().size()); // "-o" and "--option"
        assertTrue(group.getTriggers().contains("-o"));
        assertTrue(group.getTriggers().contains("--option"));
    }

    // Test with mixed options
    public void testConstructorWithMixedOptions() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o1", false, "--option1", "description1");
        Argument arg1 = new MockArgument();
        options.add(opt1);
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        assertEquals(1, group.getOptions().size());
        assertSame(opt1, group.getOptions().get(0));
        assertEquals(1, group.getAnonymous().size());
        assertSame(arg1, group.getAnonymous().get(0));
    }

    // Test canProcess when an argument matches a trigger
    public void testCanProcessMatchingTrigger() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", false, "--option", "description");
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl();

        assertTrue(group.canProcess(commandLine, "-o"));
        assertTrue(group.canProcess(commandLine, "--option"));
    }

    // Test canProcess when an argument does not match a trigger but could be an anonymous argument
    public void testCanProcessAnonymousArgument() throws Exception {
        List<Option> options = new ArrayList<>();
        Argument arg1 = new MockArgument() {
            @Override
            public boolean canProcess(WriteableCommandLine commandLine, String argument) { return true; } // This argument can process anything
        };
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl();
        // To test the anonymous case, we need to ensure the argument doesn't look like an option for other checks
        // but can still be processed by the anonymous argument.
        // The current canProcess logic checks optionMap first, then tailMap.
        // If it's not found, and commandLine.looksLikeOption(arg) is false, it checks anonymous.
        // So, we don't need looksLikeOption to be false here necessarily, as long as the anonymous argument canProcess returns true.
        assertTrue(group.canProcess(commandLine, "some_value"));
    }

    // Test canProcess when an argument does not match a trigger and there are no anonymous arguments
    public void testCanProcessNoMatchNoAnonymous() throws Exception {
        List<Option> options = new ArrayList<>();
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl();

        assertFalse(group.canProcess(commandLine, "some_value"));
    }

    // Test canProcess when argument is null
    public void testCanProcessNullArgument() throws Exception {
        List<Option> options = new ArrayList<>();
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl();

        assertFalse(group.canProcess(commandLine, null));
    }

    // Test process method with a matching option
    public void testProcessMatchingOption() throws Exception {
        List<Option> options = new ArrayList<>();
        Option mockOpt1 = new MockOption("-o", false, "--option", "description") {
            @Override
            public void process(WriteableCommandLine commandLine, ListIterator arguments) throws OptionException {
                // Simulate consuming the argument
                if (arguments.hasNext()) {
                    arguments.next();
                }
            }
        };
        options.add(mockOpt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl();
        List<String> argsList = new ArrayList<>();
        argsList.add("-o");
        ListIterator arguments = argsList.listIterator();

        group.process(commandLine, arguments);
        assertFalse(arguments.hasNext()); // The option should have consumed the argument
    }

    // Test process method with an anonymous argument
    public void testProcessAnonymousArgument() throws Exception {
        List<Option> options = new ArrayList<>();
        Argument arg1 = new MockArgument() {
            @Override
            public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {
                if (args.hasNext()) {
                    args.next(); // Consume the argument
                }
            }
            @Override
            public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return true; }
        };
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl();
        List<String> argsList = new ArrayList<>();
        argsList.add("some_value");
        ListIterator arguments = argsList.listIterator();

        group.process(commandLine, arguments);
        assertFalse(arguments.hasNext()); // The anonymous argument should have consumed the value
    }

    // Test process method when no option or anonymous argument can process
    public void testProcessNoMatch() throws Exception {
        List<Option> options = new ArrayList<>();
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl();
        List<String> argsList = new ArrayList<>();
        argsList.add("unprocessed_value");
        ListIterator arguments = argsList.listIterator();

        group.process(commandLine, arguments);
        // The iterator should be rolled back, so it should point to the same element
        assertTrue(arguments.hasPrevious());
        assertEquals("unprocessed_value", arguments.previous());
    }

    // Test validate with minimum constraints met
    public void testValidateMinimumMet() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", true, "--option", "description"); // Required
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 1, 2);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl();
        commandLine.addOption(opt1); // Add the required option

        group.validate(commandLine); // Should not throw an exception
    }

    // Test validate with minimum constraints not met
    public void testValidateMinimumNotMet() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", true, "--option", "description"); // Required
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 1, 2);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl(); // Required option not added

        try {
            group.validate(commandLine);
            fail("Expected OptionException for missing option");
        } catch (OptionException e) {
            assertNotNull(e);
            assertEquals(ResourceConstants.MISSING_OPTION, e.getMessageKey());
        }
    }

    // Test validate with maximum constraints exceeded
    public void testValidateMaximumExceeded() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o1", false, "--option1", "description1");
        Option opt2 = new MockOption("-o2", false, "--option2", "description2");
        options.add(opt1);
        options.add(opt2);
        GroupImpl group = new GroupImpl(options, "myGroup", "A test group", 0, 1); // Max is 1
        WriteableCommandLine commandLine = new WriteableCommandLineImpl();
        commandLine.addOption(opt1);
        commandLine.addOption(opt2); // Adding a second option

        try {
            group.validate(commandLine);
            fail("Expected OptionException for unexpected token");
        } catch (OptionException e) {
            assertNotNull(e);
            assertEquals(ResourceConstants.UNEXPECTED_TOKEN, e.getMessageKey());
            assertEquals(opt2.getPreferredName(), e.getValue());
        }
    }

    // Test getPreferredName
    public void testGetPreferredName() throws Exception {
        GroupImpl group = new GroupImpl(Collections.emptyList(), "myGroup", "desc", 0, 0);
        assertEquals("myGroup", group.getPreferredName());
    }

    // Test getDescription
    public void testGetDescription() throws Exception {
        GroupImpl group = new GroupImpl(Collections.emptyList(), "name", "myDescription", 0, 0);
        assertEquals("myDescription", group.getDescription());
    }

    // Test appendUsage with default settings
    public void testAppendUsageDefault() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", false, "--option", "description");
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        StringBuffer buffer = new StringBuffer();
        Set<DisplaySetting> helpSettings = new HashSet<>();
        group.appendUsage(buffer, helpSettings, null);
        assertEquals("myGroup", buffer.toString()); // No display settings, just the name
    }

    // Test appendUsage with DISPLAY_OPTIONAL and DISPLAY_GROUP_OUTER
    public void testAppendUsageOptionalAndOuter() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", false, "--option", "description");
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1); // Minimum 0 makes it optional
        StringBuffer buffer = new StringBuffer();
        Set<DisplaySetting> helpSettings = new HashSet<>();
        helpSettings.add(DisplaySetting.DISPLAY_OPTIONAL);
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_OUTER);
        group.appendUsage(buffer, helpSettings, null);
        assertEquals("[myGroup]", buffer.toString());
    }

    // Test appendUsage with DISPLAY_GROUP_EXPANDED
    public void testAppendUsageExpanded() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", false, "--option", "description");
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        StringBuffer buffer = new StringBuffer();
        Set<DisplaySetting> helpSettings = new HashSet<>();
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        group.appendUsage(buffer, helpSettings, null);
        assertEquals("myGroup ( -o )", buffer.toString());
    }

    // Test appendUsage with DISPLAY_GROUP_ARGUMENT
    public void testAppendUsageArguments() throws Exception {
        List<Option> options = new ArrayList<>();
        Argument arg1 = new MockArgument() {
            @Override
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
                buffer.append(" ARG");
            }
        };
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        StringBuffer buffer = new StringBuffer();
        Set<DisplaySetting> helpSettings = new HashSet<>();
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        group.appendUsage(buffer, helpSettings, null);
        assertEquals("myGroup ARG", buffer.toString());
    }

    // Test helpLines with DISPLAY_GROUP_NAME
    public void testHelpLinesGroupName() throws Exception {
        List<Option> options = new ArrayList<>();
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        Set<DisplaySetting> helpSettings = new HashSet<>();
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        List<HelpLine> lines = group.helpLines(0, helpSettings, null);
        assertEquals(1, lines.size());
        assertEquals("myGroup", ((HelpLineImpl)lines.get(0)).getText());
    }

    // Test helpLines with DISPLAY_GROUP_EXPANDED
    public void testHelpLinesExpanded() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", false, "--option", "description");
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        Set<DisplaySetting> helpSettings = new HashSet<>();
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        List<HelpLine> lines = group.helpLines(0, helpSettings, null);
        assertEquals(2, lines.size()); // Group name + option name
        assertEquals("myGroup", ((HelpLineImpl)lines.get(0)).getText());
        assertEquals("-o", ((HelpLineImpl)lines.get(1)).getText());
    }

    // Test helpLines with DISPLAY_GROUP_ARGUMENT
    public void testHelpLinesArguments() throws Exception {
        List<Option> options = new ArrayList<>();
        Argument arg1 = new MockArgument() {
            @Override
            public List helpLines(int depth, Set helpSettings, Comparator comp) {
                // Mocking helpLines for an Argument
                List<HelpLine> mockLines = new ArrayList<>();
                // Assuming an Argument would have a preferred name like "arg1" or similar
                // For simplicity, we'll create a HelpLine directly with a placeholder.
                mockLines.add(new HelpLineImpl(new MockOption("mockArg", false, "mockArg", "Mock Argument"), depth));
                return mockLines;
            }
        };
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        Set<DisplaySetting> helpSettings = new HashSet<>();
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        List<HelpLine> lines = group.helpLines(0, helpSettings, null);
        assertEquals(2, lines.size()); // Group name + argument name
        assertEquals("myGroup", ((HelpLineImpl)lines.get(0)).getText());
        // The exact text from the mock Argument's helpLines needs to be asserted
        assertEquals("mockArg", ((HelpLineImpl)lines.get(1)).getText());
    }

    // Test getOptions
    public void testGetOptions() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", false, "--option", "description");
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        assertEquals(1, group.getOptions().size());
        assertSame(opt1, group.getOptions().get(0));
    }

    // Test getAnonymous
    public void testGetAnonymous() throws Exception {
        List<Option> options = new ArrayList<>();
        Argument arg1 = new MockArgument();
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        assertEquals(1, group.getAnonymous().size());
        assertSame(arg1, group.getAnonymous().get(0));
    }

    // Test findOption when the option is directly in the group
    public void testFindOptionDirect() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", false, "--option", "description");
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        assertEquals(opt1, group.findOption("-o"));
        assertEquals(opt1, group.findOption("--option"));
    }

    // Test findOption when the option is nested in a sub-group
    public void testFindOptionNested() throws Exception {
        List<Option> options = new ArrayList<>();
        List<Option> subOptions = new ArrayList<>();
        Option opt1 = new MockOption("-o", false, "--option", "description");
        subOptions.add(opt1);
        GroupImpl subGroup = new GroupImpl(subOptions, "subGroup", "sub description", 0, 1);
        options.add(subGroup);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        assertEquals(opt1, group.findOption("-o"));
        assertEquals(opt1, group.findOption("--option"));
    }

    // Test findOption when the option is not found
    public void testFindOptionNotFound() throws Exception {
        List<Option> options = new ArrayList<>();
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        assertNull(group.findOption("nonexistent"));
    }

    // Test getMinimum
    public void testGetMinimum() throws Exception {
        GroupImpl group = new GroupImpl(Collections.emptyList(), "name", "desc", 5, 10);
        assertEquals(5, group.getMinimum());
    }

    // Test getMaximum
    public void testGetMaximum() throws Exception {
        GroupImpl group = new GroupImpl(Collections.emptyList(), "name", "desc", 5, 10);
        assertEquals(10, group.getMaximum());
    }

    // Test isRequired when minimum > 0
    public void testIsRequiredTrue() throws Exception {
        GroupImpl group = new GroupImpl(Collections.emptyList(), "name", "desc", 1, 10);
        assertTrue(group.isRequired());
    }

    // Test isRequired when minimum == 0
    public void testIsRequiredFalse() throws Exception {
        GroupImpl group = new GroupImpl(Collections.emptyList(), "name", "desc", 0, 10);
        assertFalse(group.isRequired());
    }

    // Test defaults
    public void testDefaults() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o", false, "--option", "description");
        options.add(opt1);
        Argument arg1 = new MockArgument() {
            @Override
            public void defaults(WriteableCommandLine commandLine) {
                 // Mock defaults call for argument
            }
        };
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl();
        group.defaults(commandLine);
        // This test mainly checks if the defaults method is called on contained options/arguments.
    }

    // Test ReverseStringComparator.getInstance()
    public void testReverseStringComparatorGetInstance() throws Exception {
        Comparator comp1 = ReverseStringComparator.getInstance();
        Comparator comp2 = ReverseStringComparator.getInstance();
        assertSame(comp1, comp2);
    }

    // Test ReverseStringComparator.compare()
    public void testReverseStringComparatorCompare() throws Exception {
        Comparator comp = ReverseStringComparator.getInstance();
        assertEquals(1, comp.compare("a", "b")); // "b" comes before "a" in reverse
        assertEquals(-1, comp.compare("b", "a"));
        assertEquals(0, comp.compare("a", "a"));
    }

    // Test with DisplaySetting.NONE
    public void testAppendUsageDisplaySettingNone() throws Exception {
        List<Option> options = new ArrayList<>();
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, DisplaySetting.NONE, null);
        assertEquals("myGroup", buffer.toString());
    }

    // Test appendUsage with COMP
    public void testAppendUsageWithComparator() throws Exception {
        List<Option> options = new ArrayList<>();
        Option opt1 = new MockOption("-o1", false, "--option1", "description1");
        Option opt2 = new MockOption("-o2", false, "--option2", "description2");
        options.add(opt2); // Add in reverse order
        options.add(opt1);
        GroupImpl group = new GroupImpl(options, "myGroup", "description", 0, 1);
        StringBuffer buffer = new StringBuffer();
        Set<DisplaySetting> helpSettings = new HashSet<>();
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        Comparator<Option> comp = Comparator.comparing(Option::getPreferredName);
        group.appendUsage(buffer, helpSettings, comp);
        // Options should be sorted by comparator: -o1 then -o2
        assertEquals("myGroup ( -o1|-o2)", buffer.toString());
    }

    // Mock Argument class to avoid instantiation issues and repeated code
    private static class MockArgument implements Argument {
        @Override
        public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException { }
        @Override
        public void defaults(WriteableCommandLine commandLine) { }
        @Override
        public boolean canProcess(WriteableCommandLine commandLine, String argument) { return false; }
        @Override
        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
        @Override
        public Set getTriggers() { return Collections.emptySet(); }
        @Override
        public Set getPrefixes() { return Collections.emptySet(); }
        @Override
        public void validate(WriteableCommandLine commandLine) throws OptionException { }
        @Override
        public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.emptyList(); }
        @Override
        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) { }
        @Override
        public String getPreferredName() { return "mockArg"; }
        @Override
        public String getDescription() { return "A mock argument"; }
        @Override
        public int getId() { return -1; }
        @Override
        public Option findOption(String trigger) { return null; }
        @Override
        public boolean isRequired() { return false; }
        @Override
        public char getInitialSeparator() { return '\0'; }
        @Override
        public void processValues(WriteableCommandLine commandLine, ListIterator args, Option option) throws OptionException { }
        @Override
        public void defaultValues(WriteableCommandLine commandLine, Option option) { }
        @Override
        public void validate(WriteableCommandLine commandLine, Option option) throws OptionException { }
        @Override
        public int getMinimum() { return 0; }
        @Override
        public int getMaximum() { return Integer.MAX_VALUE; }
        @Override
        public void addOption(Option option) {}
        @Override
        public void addValue(Option option, Object value) {}
        @Override
        public List getUndefaultedValues(Option option) { return Collections.emptyList(); }
        @Override
        public void setDefaultValues(Option option, List defaultValues) {}
        @Override
        public void addSwitch(Option option, boolean value) throws IllegalStateException {}
        @Override
        public void setDefaultSwitch(Option option, Boolean defaultSwitch) {}
        @Override
        public void addProperty(Option option, String property, String value) {}
        @Override
        public void addProperty(String property, String value) {}
        @Override
        public boolean looksLikeOption(String argument) { return false; }
        @Override
        public void defaults(WriteableCommandLine commandLine, Option option) {}
        @Override
        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp, String separator) { }
    }

    // Mock implementation for OptionImpl which is abstract
    private static class MockOption implements Option {
        private String preferredName;
        private Set<String> triggers;
        private Set<String> prefixes;
        private boolean required;

        public MockOption(String trigger, boolean required, String preferredName, String description) {
            this.preferredName = preferredName;
            this.required = required;
            this.triggers = new HashSet<>();
            if (trigger != null) {
                this.triggers.add(trigger);
            }
            this.prefixes = new HashSet<>();
            if (trigger != null && trigger.startsWith("-")) {
                this.prefixes.add(trigger.substring(0, 1));
            }
        }

        @Override
        public String getPreferredName() { return preferredName; }
        @Override
        public Set getTriggers() { return triggers; }
        @Override
        public Set getPrefixes() { return prefixes; }
        @Override
        public boolean isRequired() { return required; }

        @Override
        public void process(WriteableCommandLine commandLine, ListIterator arguments) throws OptionException { }
        @Override
        public void validate(WriteableCommandLine commandLine) throws OptionException { }
        @Override
        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) { buffer.append(preferredName); }
        @Override
        public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.singletonList(new HelpLineImpl(this, depth)); }
        @Override
        public Option findOption(String trigger) { return null; }
        @Override
        public void defaults(WriteableCommandLine commandLine) { }
        @Override
        public boolean canProcess(WriteableCommandLine commandLine, String argument) { return false; }
        @Override
        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
        @Override
        public String getDescription() { return "Mock Description"; }
        @Override
        public int getId() { return 0; }
    }
}
