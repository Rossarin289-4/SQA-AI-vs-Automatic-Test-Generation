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

public class OptionTest extends TestCase {

    // Helper to create a dummy Option for testing
    private Option createDummyOption(String preferredName, String description, Set triggers, Set prefixes) {
        return new OptionImpl(0, false) {
            @Override
            public Set getTriggers() { return triggers; }
            @Override
            public Set getPrefixes() { return prefixes; }
            @Override
            public String getPreferredName() { return preferredName; }
            @Override
            public String getDescription() { return description; }
            @Override
            public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {}
            @Override
            public void defaults(WriteableCommandLine commandLine) {}
            @Override
            public boolean canProcess(WriteableCommandLine commandLine, String argument) { return false; }
            @Override
            public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
            @Override
            public void validate(WriteableCommandLine commandLine) throws OptionException {}
            @Override
            public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.emptyList(); }
            @Override
            public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {}
            @Override
            public Option findOption(String trigger) { return null; }
            @Override
            public boolean isRequired() { return false; }
        };
    }

    // Test for getPreferredName()
    public void testGetPreferredName() {
        Option option = createDummyOption("testName", "description", Collections.emptySet(), Collections.emptySet());
        assertEquals("testName", option.getPreferredName());
    }

    // Test for getDescription()
    public void testGetDescription() {
        Option option = createDummyOption("name", "testDescription", Collections.emptySet(), Collections.emptySet());
        assertEquals("testDescription", option.getDescription());
    }

    // Test for getId() - using a concrete subclass
    public void testGetId() {
        // GroupImpl constructor takes List<Option>, String name, String description, int minimum, int maximum
        GroupImpl group = new GroupImpl(Collections.emptyList(), "name", "description", 0, 1);
        assertEquals(0, group.getId());
    }

    // Test for getTriggers()
    public void testGetTriggers() {
        Set triggers = new HashSet();
        triggers.add("trigger1");
        triggers.add("trigger2");
        Option option = createDummyOption("name", "description", triggers, Collections.emptySet());
        assertEquals(triggers, option.getTriggers());
    }

    // Test for getPrefixes()
    public void testGetPrefixes() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        Option option = createDummyOption("name", "description", Collections.emptySet(), prefixes);
        assertEquals(prefixes, option.getPrefixes());
    }

    // Test for isRequired()
    public void testIsRequired_true() {
        // DefaultOption constructor: (String shortPrefix, String longPrefix, boolean burstEnabled, String preferredName, String description, Set aliases, Set burstAliases, boolean required, Argument argument, Group children, int id)
        Option option = new DefaultOption("-f", "--force", false, "force", "force option", Collections.emptySet(), Collections.emptySet(), true, null, null, 1);
        assertTrue(option.isRequired());
    }

    // Test for isRequired()
    public void testIsRequired_false() {
        Option option = new DefaultOption("-f", "--force", false, "force", "force option", Collections.emptySet(), Collections.emptySet(), false, null, null, 1);
        assertFalse(option.isRequired());
    }

    // Test for getParent() and setParent()
    public void testGetParentAndSetParent() {
        Option parentOption = createDummyOption("parent", "parent desc", Collections.emptySet(), Collections.emptySet());
        Option childOption = createDummyOption("child", "child desc", Collections.emptySet(), Collections.emptySet());
        childOption.setParent(parentOption);
        assertSame(parentOption, childOption.getParent());
    }

    // Test for findOption() - option found
    public void testFindOption_found() {
        Set triggers = new HashSet();
        triggers.add("-a");
        Option optionA = createDummyOption("optionA", "descA", triggers, Collections.emptySet());

        Set triggersB = new HashSet();
        triggersB.add("-b");
        Option optionB = createDummyOption("optionB", "descB", triggersB, Collections.emptySet());

        // GroupImpl constructor: (final List options, final String name, final String description, final int minimum, final int maximum)
        GroupImpl parent = new GroupImpl(List.of(optionA, optionB), "group", "group desc", 0, 1);

        assertEquals(optionA, parent.findOption("-a"));
    }

    // Test for findOption() - option not found
    public void testFindOption_notFound() {
        Set triggers = new HashSet();
        triggers.add("-a");
        Option optionA = createDummyOption("optionA", "descA", triggers, Collections.emptySet());
        GroupImpl parent = new GroupImpl(List.of(optionA), "group", "group desc", 0, 1);

        assertNull(parent.findOption("-b"));
    }

    // Test for validate() with a Group and required option missing
    public void testValidate_groupMissingRequiredOption() throws Exception {
        // DefaultOption constructor: (String shortPrefix, String longPrefix, boolean burstEnabled, String preferredName, String description, Set aliases, Set burstAliases, boolean required, Argument argument, Group children, int id)
        Option requiredOption = new DefaultOption("-r", "--required", false, "required", "required option", Collections.emptySet(), Collections.emptySet(), true, null, null, 1);
        List<Option> options = new ArrayList<>();
        options.add(requiredOption);
        // GroupImpl constructor: (final List options, final String name, final String description, final int minimum, final int maximum)
        GroupImpl group = new GroupImpl(options, "group", "description", 1, 1); // minimum 1
        WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, Collections.emptyList());

        try {
            group.validate(commandLine);
            fail("Expected OptionException for missing required option");
        } catch (OptionException e) {
            // The actual message may vary, but MISSING_OPTION is expected.
            // Check the message key if possible, or a part of the message.
            assertTrue(e.getMessage().contains(ResourceConstants.MISSING_OPTION));
        }
    }

    // Test for validate() with a Group and too many options
    public void testValidate_groupTooManyOptions() throws Exception {
        Option option1 = new DefaultOption("-o1", "--option1", false, "option1", "option1 description", Collections.emptySet(), Collections.emptySet(), false, null, null, 1);
        Option option2 = new DefaultOption("-o2", "--option2", false, "option2", "option2 description", Collections.emptySet(), Collections.emptySet(), false, null, null, 2);
        List<Option> options = new ArrayList<>();
        options.add(option1);
        options.add(option2);
        GroupImpl group = new GroupImpl(options, "group", "description", 0, 1); // maximum 1

        WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, Collections.emptyList());
        commandLine.addOption(option1);
        commandLine.addOption(option2); // This should cause the exception

        try {
            group.validate(commandLine);
            fail("Expected OptionException for too many options");
        } catch (OptionException e) {
            assertTrue(e.getMessage().contains(ResourceConstants.UNEXPECTED_TOKEN));
        }
    }

    // Test for process() with a simple option and arguments
    public void testProcess_simpleOption() throws Exception {
        Option dummyOption = new OptionImpl(1, false) {
            @Override public Set getTriggers() { return Collections.singleton("-t"); }
            @Override public Set getPrefixes() { return Collections.singleton("-"); }
            @Override public String getPreferredName() { return "test"; }
            @Override public String getDescription() { return "A test option"; }
            @Override
            public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {
                commandLine.addValue(this, "value1");
                commandLine.addValue(this, "value2");
                if (args.hasNext()) args.next(); // consume one argument
            }
            @Override public void defaults(WriteableCommandLine commandLine) {}
            @Override public boolean canProcess(WriteableCommandLine commandLine, String argument) { return "-t".equals(argument); }
            @Override public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
            @Override public void validate(WriteableCommandLine commandLine) throws OptionException {}
            @Override public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.emptyList(); }
            @Override public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {}
            @Override public Option findOption(String trigger) { return this; }
            @Override public boolean isRequired() { return false; }
        };

        List<String> argsList = new ArrayList<>(List.of("-t", "arg1", "arg2"));
        ListIterator<String> args = argsList.listIterator();
        WriteableCommandLine commandLine = new WriteableCommandLineImpl(dummyOption, argsList);

        dummyOption.process(commandLine, args);

        assertEquals(List.of("value1", "value2"), commandLine.getValues(dummyOption, null));
        assertEquals("arg2", args.next()); // Should be the remaining argument
    }

    // Test for defaults() on a Group
    public void testDefaults_group() {
        Option subOption1 = new OptionImpl(1, false) {
            @Override public Set getTriggers() { return Collections.singleton("-s1"); }
            @Override public Set getPrefixes() { return Collections.singleton("-"); }
            @Override public String getPreferredName() { return "sub1"; }
            @Override public String getDescription() { return "sub1 desc"; }
            @Override
            public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {}
            @Override
            public void defaults(WriteableCommandLine commandLine) {
                commandLine.setDefaultSwitch(this, Boolean.TRUE);
            }
            @Override public boolean canProcess(WriteableCommandLine commandLine, String argument) { return false; }
            @Override public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
            @Override public void validate(WriteableCommandLine commandLine) throws OptionException {}
            @Override public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.emptyList(); }
            @Override public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {}
            @Override public Option findOption(String trigger) { return null; }
            @Override public boolean isRequired() { return false; }
        };
        List<Option> options = new ArrayList<>();
        options.add(subOption1);
        GroupImpl group = new GroupImpl(options, "group", "description", 0, 1);

        WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, Collections.emptyList());
        group.defaults(commandLine);

        assertEquals(Boolean.TRUE, commandLine.getSwitch(subOption1, null));
    }

    // Test for looksLikeOption()
    public void testLooksLikeOption() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        // The 'prefixes' field in WriteableCommandLineImpl is private, so we cannot directly manipulate it.
        // Instead, we'll use a concrete implementation of Option to test looksLikeOption.
        // However, looksLikeOption is a method of WriteableCommandLine, not Option.
        // We need an instance of WriteableCommandLine.
        // Let's create a dummy Option with prefixes and use it to initialize WriteableCommandLineImpl.
        Option dummyRootOption = new OptionImpl(0, false) {
            @Override public Set getTriggers() { return Collections.emptySet(); }
            @Override public Set getPrefixes() { return prefixes; } // Use our prefixes here
            @Override public String getPreferredName() { return "root"; }
            @Override public String getDescription() { return "root option"; }
            @Override public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {}
            @Override public void defaults(WriteableCommandLine commandLine) {}
            @Override public boolean canProcess(WriteableCommandLine commandLine, String argument) { return false; }
            @Override public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
            @Override public void validate(WriteableCommandLine commandLine) throws OptionException {}
            @Override public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.emptyList(); }
            @Override public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {}
            @Override public Option findOption(String trigger) { return null; }
            @Override public boolean isRequired() { return false; }
        };
        WriteableCommandLine commandLineWithPrefixes = new WriteableCommandLineImpl(dummyRootOption, Collections.emptyList());

        assertTrue(commandLineWithPrefixes.looksLikeOption("-option"));
        assertTrue(commandLineWithPrefixes.looksLikeOption("--another"));
        assertFalse(commandLineWithPrefixes.looksLikeOption("argument"));
        assertFalse(commandLineWithPrefixes.looksLikeOption(""));
    }

    // Test for getValues() with default values
    public void testGetValues_withDefaults() {
        Option option = createDummyOption("opt", "desc", Collections.emptySet(), Collections.emptySet());
        List<String> defaults = List.of("default1", "default2");
        WriteableCommandLineImpl commandLine = new WriteableCommandLineImpl(option, Collections.emptyList());
        commandLine.setDefaultValues(option, defaults);

        // No values added to command line, should return defaults
        assertEquals(defaults, commandLine.getValues(option, null));

        // Add some values, should return command line values
        commandLine.addValue(option, "value1");
        assertEquals(List.of("value1"), commandLine.getValues(option, null));

        // Add more values than defaults
        commandLine.addValue(option, "value2");
        assertEquals(List.of("value1", "value2"), commandLine.getValues(option, null));
    }

    // Test for getUndefaultedValues()
    public void testGetUndefaultedValues() {
        Option option = createDummyOption("opt", "desc", Collections.emptySet(), Collections.emptySet());
        WriteableCommandLineImpl commandLine = new WriteableCommandLineImpl(option, Collections.emptyList());
        commandLine.addValue(option, "value1");
        commandLine.addValue(option, "value2");

        assertEquals(List.of("value1", "value2"), commandLine.getUndefaultedValues(option));
    }

    // Test for getSwitch() with default value and default switch
    public void testGetSwitch() {
        Option option = createDummyOption("opt", "desc", Collections.emptySet(), Collections.emptySet());
        WriteableCommandLineImpl commandLine = new WriteableCommandLineImpl(option, Collections.emptyList());

        // No value set, should return method default
        assertFalse(commandLine.getSwitch(option, Boolean.FALSE));

        // Set default switch on option
        commandLine.setDefaultSwitch(option, Boolean.TRUE);
        assertTrue(commandLine.getSwitch(option, Boolean.FALSE));

        // Add switch to command line
        commandLine.addSwitch(option, false);
        assertFalse(commandLine.getSwitch(option, Boolean.TRUE)); // Method default is ignored
    }

    // Test for addProperty() and getProperty()

    // Test for getProperties()
    public void testGetProperties() {
        Option option = createDummyOption("opt", "desc", Collections.emptySet(), Collections.emptySet());
        WriteableCommandLineImpl commandLine = new WriteableCommandLineImpl(option, Collections.emptyList());

        commandLine.addProperty(option, "key1", "value1");
        commandLine.addProperty(option, "key2", "value2");

        Set<String> properties = commandLine.getProperties(option);
        assertEquals(2, properties.size());
        assertTrue(properties.contains("key1"));
        assertTrue(properties.contains("key2"));
    }

    // Test for toString() on WriteableCommandLineImpl
    public void testToString_writeableCommandLineImpl() {
        List<String> args = List.of("arg1", "arg2", "\"quoted arg\"");
        WriteableCommandLineImpl commandLine = new WriteableCommandLineImpl(null, args);
        assertEquals("arg1 arg2 \"quoted arg\"", commandLine.toString());
    }

    // Test for getOptions() on WriteableCommandLineImpl
    public void testGetOptions_writeableCommandLineImpl() {
        Option option1 = createDummyOption("opt1", "desc1", Collections.emptySet(), Collections.emptySet());
        Option option2 = createDummyOption("opt2", "desc2", Collections.emptySet(), Collections.emptySet());
        List<Option> options = new ArrayList<>();
        options.add(option1); // Add to the list for initialization
        WriteableCommandLineImpl commandLine = new WriteableCommandLineImpl(option1, options); // Use option1 in constructor
        commandLine.addOption(option2); // This adds to the internal list

        List<Option> returnedOptions = commandLine.getOptions();
        assertEquals(2, returnedOptions.size());
        assertTrue(returnedOptions.contains(option1));
        assertTrue(returnedOptions.contains(option2));
    }

    // Test for getOptionTriggers() on WriteableCommandLineImpl
    public void testGetOptionTriggers_writeableCommandLineImpl() {
        Set triggers1 = new HashSet(Set.of("-t1", "--t1"));
        Option option1 = createDummyOption("opt1", "desc1", triggers1, Collections.emptySet());
        Set triggers2 = new HashSet(Set.of("-t2"));
        Option option2 = createDummyOption("opt2", "desc2", triggers2, Collections.emptySet());

        List<Option> options = new ArrayList<>();
        options.add(option1);
        WriteableCommandLineImpl commandLine = new WriteableCommandLineImpl(option1, options); // Initialize with option1
        commandLine.addOption(option2);

        Set<String> optionTriggers = commandLine.getOptionTriggers();
        assertEquals(3, optionTriggers.size()); // -t1, --t1, -t2
        assertTrue(optionTriggers.contains("-t1"));
        assertTrue(optionTriggers.contains("--t1"));
        assertTrue(optionTriggers.contains("-t2"));
    }

    // Test for setDefaultValues() and getValues()
    public void testSetDefaultValues_andGetValues() {
        Option option = createDummyOption("opt", "desc", Collections.emptySet(), Collections.emptySet());
        WriteableCommandLineImpl commandLine = new WriteableCommandLineImpl(option, Collections.emptyList());
        List<String> defaults = List.of("def1");
        commandLine.setDefaultValues(option, defaults);

        assertEquals(defaults, commandLine.getValues(option, null));
    }

    // Test for setDefaultSwitch() and getSwitch()
    public void testSetDefaultSwitch_andGetSwitch() {
        Option option = createDummyOption("opt", "desc", Collections.emptySet(), Collections.emptySet());
        WriteableCommandLineImpl commandLine = new WriteableCommandLineImpl(option, Collections.emptyList());
        commandLine.setDefaultSwitch(option, Boolean.TRUE);

        assertTrue(commandLine.getSwitch(option, Boolean.FALSE));
    }

    // Test for getNormalised()
    public void testGetNormalised() {
        List<String> normalizedArgs = List.of("arg1", "arg2");
        WriteableCommandLineImpl commandLine = new WriteableCommandLineImpl(null, normalizedArgs);
        assertEquals(normalizedArgs, commandLine.getNormalised());
    }

    // Test for canProcess() on GroupImpl with an existing trigger
    public void testGroupImpl_canProcess_existingTrigger() {
        Set triggers = new HashSet();
        triggers.add("-g");
        Option subOption = new DefaultOption("-s", "--sub", false, "sub", "sub desc", Collections.emptySet(), Collections.emptySet(), false, null, null, 1);
        GroupImpl group = new GroupImpl(List.of(subOption), "main", "desc", 0, 1);
        // To make canProcess work correctly, we need to ensure the optionMap is populated.
        // The constructor of GroupImpl handles this.
        
        WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, Collections.emptyList());
        assertTrue(group.canProcess(commandLine, "-g")); // This should find a trigger in its optionMap
    }

    // Test for canProcess() on GroupImpl when arg doesn't match known triggers but could be anonymous
    public void testGroupImpl_canProcess_anonymous() {
        ArgumentImpl anonymousArg = new ArgumentImpl("arg", "desc", 1, 1, ' ', ' ', null, null, Collections.emptyList(), 1);
        GroupImpl group = new GroupImpl(Collections.emptyList(), "main", "desc", 0, 1);
        // GroupImpl constructor populates anonymous list.
        // We need to create a GroupImpl that actually has anonymous arguments.
        List<Option> options = new ArrayList<>();
        options.add(anonymousArg);
        GroupImpl groupWithAnonymous = new GroupImpl(options, "main", "desc", 0, 1);

        WriteableCommandLine commandLine = new WriteableCommandLineImpl(groupWithAnonymous, Collections.emptyList());
        assertTrue(groupWithAnonymous.canProcess(commandLine, "some_value")); // This should be true because of anonymous args
    }

    // Test for process() on GroupImpl with an anonymous argument

    // Test appendUsage() on GroupImpl with display settings
    public void testGroupImpl_appendUsage() {
        Option subOption = new DefaultOption("-s", "--sub", false, "sub", "sub desc", Collections.emptySet(), Collections.emptySet(), false, null, null, 1);
        GroupImpl group = new GroupImpl(List.of(subOption), "groupName", "groupDesc", 0, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet(DisplaySetting.ALL);

        group.appendUsage(buffer, settings, null);
        // Expected output depends on DisplaySetting.ALL, which includes GROUP_NAME, GROUP_EXPANDED, GROUP_ARGUMENT, DISPLAY_OPTIONAL.
        // For a simple group with one option: "[groupName (sub)]"
        // The exact output needs careful tracing of GroupImpl.appendUsage, but we'll check for key elements.
        assertTrue(buffer.toString().contains("groupName"));
        assertTrue(buffer.toString().contains("sub"));
        assertTrue(buffer.toString().contains("[")); // Because minimum is 0 and DISPLAY_OPTIONAL is set
        assertTrue(buffer.toString().contains("]"));
    }

    // Test helpLines() on GroupImpl

    // Test ReverseStringComparator

    // Test OptionImpl.equals()

    // Test OptionImpl.hashCode()
    public void testOptionImpl_hashCode() {
        Set triggers1 = new HashSet(Set.of("-a"));
        Set prefixes1 = new HashSet(Set.of("-"));
        OptionImpl option1 = new OptionImpl(1, false) {
            @Override public Set getTriggers() { return triggers1; }
            @Override public Set getPrefixes() { return prefixes1; }
            @Override public String getPreferredName() { return "name1"; }
            @Override public String getDescription() { return "desc1"; }
            @Override public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {}
            @Override public void defaults(WriteableCommandLine commandLine) {}
            @Override public boolean canProcess(WriteableCommandLine commandLine, String argument) { return false; }
            @Override public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
            @Override public void validate(WriteableCommandLine commandLine) throws OptionException {}
            @Override public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.emptyList(); }
            @Override public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {}
            @Override public Option findOption(String trigger) { return null; }
            @Override public boolean isRequired() { return false; }
        };

        Set triggers2 = new HashSet(Set.of("-a"));
        Set prefixes2 = new HashSet(Set.of("-"));
        OptionImpl option2 = new OptionImpl(1, false) {
            @Override public Set getTriggers() { return triggers2; }
            @Override public Set getPrefixes() { return prefixes2; }
            @Override public String getPreferredName() { return "name1"; }
            @Override public String getDescription() { return "desc1"; }
            @Override public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {}
            @Override public void defaults(WriteableCommandLine commandLine) {}
            @Override public boolean canProcess(WriteableCommandLine commandLine, String argument) { return false; }
            @Override public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
            @Override public void validate(WriteableCommandLine commandLine) throws OptionException {}
            @Override public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.emptyList(); }
            @Override public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {}
            @Override public Option findOption(String trigger) { return null; }
            @Override public boolean isRequired() { return false; }
        };
        assertEquals(option1.hashCode(), option2.hashCode());
    }

    // Test hasOption()
    public void testHasOption() {
        Option option1 = createDummyOption("opt1", "desc1", Collections.emptySet(), Collections.emptySet());
        Option option2 = createDummyOption("opt2", "desc2", Collections.emptySet(), Collections.emptySet());
        WriteableCommandLine commandLine = new WriteableCommandLineImpl(option1, Collections.emptyList());

        assertFalse(commandLine.hasOption(option2));
        commandLine.addOption(option1);
        assertTrue(commandLine.hasOption(option1));
    }

    // Test getOption()
    public void testGetOption() {
        Set triggers1 = new HashSet(Set.of("-t1", "--t1"));
        Option option1 = createDummyOption("opt1", "desc1", triggers1, Collections.emptySet());
        List<Option> options = new ArrayList<>();
        options.add(option1);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl(option1, options);
        commandLine.addOption(option1); // This adds the option to the internal map

        assertEquals(option1, commandLine.getOption("-t1"));
        assertEquals(option1, commandLine.getOption("--t1"));
        assertNull(commandLine.getOption("nonexistent"));
    }

    // Test getAnonymous() - should return an unmodifiable list
    public void testGetAnonymous() {
        ArgumentImpl anonymousArg = new ArgumentImpl("arg", "desc", 1, 1, ' ', ' ', null, null, Collections.emptyList(), 1);
        GroupImpl group = new GroupImpl(Collections.emptyList(), "main", "desc", 0, 1); // This constructor doesn't populate anonymous directly
        // To test getAnonymous, we need to ensure it's populated. The constructor of GroupImpl handles this if Arguments are passed in the list.
        List<Option> options = new ArrayList<>();
        options.add(anonymousArg);
        GroupImpl groupWithAnonymous = new GroupImpl(options, "main", "desc", 0, 1);

        List<Option> anonymousOptions = groupWithAnonymous.getAnonymous();
        assertNotNull(anonymousOptions);
        assertEquals(1, anonymousOptions.size());
        assertSame(anonymousArg, anonymousOptions.get(0));

        // Ensure it's unmodifiable
        try {
            anonymousOptions.add(createDummyOption("new", "desc", Collections.emptySet(), Collections.emptySet()));
            fail("Should not be able to modify the anonymous list");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    // Test getMinimum() and getMaximum()
    public void testGroupImpl_getMinimumAndMaximum() {
        GroupImpl group = new GroupImpl(Collections.emptyList(), "name", "description", 2, 5);
        assertEquals(2, group.getMinimum());
        assertEquals(5, group.getMaximum());
    }

    // Test for validate() with an Option that is required but not present.
    public void testValidate_optionRequiredButMissing() throws Exception {
        Option requiredOption = new DefaultOption("-r", "--required", false, "required", "required option", Collections.emptySet(), Collections.emptySet(), true, null, null, 1);
        WriteableCommandLine commandLine = new WriteableCommandLineImpl(requiredOption, Collections.emptyList());

        try {
            requiredOption.validate(commandLine);
            fail("Expected OptionException for missing required option");
        } catch (OptionException e) {
            assertTrue(e.getMessage().contains(ResourceConstants.OPTION_MISSING_REQUIRED));
        }
    }

    // Test for process() with an Option that can process arguments but none are available
    public void testProcess_optionNoArgumentsAvailable() throws Exception {
        Option dummyOption = new OptionImpl(1, false) {
            @Override public Set getTriggers() { return Collections.singleton("-t"); }
            @Override public Set getPrefixes() { return Collections.singleton("-"); }
            @Override public String getPreferredName() { return "test"; }
            @Override public String getDescription() { return "A test option"; }
            @Override
            public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {
                // This option expects arguments, but we will provide none.
                // The contract states it MUST process at least one argument.
                // If it doesn't, it might throw an exception or behave unexpectedly.
                // Let's simulate a case where it tries to process and fails gracefully or throws.
                if (args.hasNext()) {
                    commandLine.addValue(this, args.next());
                } else {
                    // If no arguments, it might still add a default or throw.
                    // Based on the contract "MUST process at least one argument",
                    // not processing one could be an issue.
                    // For testing, we'll assume it might try and fail or do nothing if no args.
                    // A more robust test would depend on the specific implementation's behavior here.
                    // For now, we'll check if it throws an exception if it's supposed to consume an argument.
                }
            }
            @Override public void defaults(WriteableCommandLine commandLine) {}
            @Override public boolean canProcess(WriteableCommandLine commandLine, String argument) { return "-t".equals(argument); }
            @Override public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) { return false; }
            @Override public void validate(WriteableCommandLine commandLine) throws OptionException {}
            @Override public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.emptyList(); }
            @Override public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {}
            @Override public Option findOption(String trigger) { return this; }
            @Override public boolean isRequired() { return false; }
        };

        List<String> argsList = new ArrayList<>(List.of("-t")); // No arguments for -t
        ListIterator<String> args = argsList.listIterator();
        WriteableCommandLine commandLine = new WriteableCommandLineImpl(dummyOption, argsList);

        // If process() throws an exception when it can't process an argument, we catch it.
        // If it doesn't throw and just doesn't add values, that's also a valid outcome to test.
        try {
            dummyOption.process(commandLine, args);
            // If no exception is thrown, check that no values were added.
            assertEquals(Collections.EMPTY_LIST, commandLine.getValues(dummyOption, null));
        } catch (OptionException e) {
            // This might be a valid scenario depending on the Option's implementation.
            // If it is, the test would assert the exception type and message.
            // We'll check for a common message related to missing values.
             assertTrue(e.getMessage().contains("Value is required for option") || e.getMessage().contains(ResourceConstants.ARGUMENT_MISSING_VALUES));
        }
    }
    
    // Test process() on GroupImpl when it encounters an option it doesn't recognize within its scope
    public void testGroupImpl_process_unrecognizedOption() throws Exception {
        Option knownOption = new DefaultOption("-k", "--known", false, "known", "known option", Collections.emptySet(), Collections.emptySet(), false, null, null, 1);
        GroupImpl group = new GroupImpl(List.of(knownOption), "main", "desc", 0, 1);

        List<String> argsList = new ArrayList<>(List.of("-u", "value")); // -u is not a known option in this group
        ListIterator<String> args = argsList.listIterator();
        WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, argsList);

        // The behavior here is that if an option is not found, and it's not an anonymous argument,
        // the group stops processing.
        group.process(commandLine, args);

        // The unrecognized option should not have been processed by the group.
        // The iterator should be at the position it was when the unrecognized option was encountered.
        // The spec says "arguments.previous()" is called when breaking.
        assertEquals("-u", args.next()); // Should have been put back, so it's the next one to be potentially processed by another parser.
    }

    // Test GroupImpl.getOptions() which returns non-Argument options
    public void testGroupImpl_getOptions() {
        Option option1 = new DefaultOption("-s", "--sub", false, "sub", "sub desc", Collections.emptySet(), Collections.emptySet(), false, null, null, 1);
        ArgumentImpl argument1 = new ArgumentImpl("arg", "arg desc", 1, 1, ' ', ' ', null, null, Collections.emptyList(), 2);
        List<Option> allOptions = new ArrayList<>();
        allOptions.add(option1);
        allOptions.add(argument1);

        GroupImpl group = new GroupImpl(allOptions, "group", "desc", 0, 1);

        List<Option> groupOptions = group.getOptions();
        assertEquals(1, groupOptions.size());
        assertSame(option1, groupOptions.get(0));
    }
}


