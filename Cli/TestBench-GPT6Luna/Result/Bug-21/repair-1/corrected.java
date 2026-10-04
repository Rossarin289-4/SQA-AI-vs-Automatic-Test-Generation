package org.apache.commons.cli2;

import junit.framework.TestCase;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.GroupImpl;
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
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.resource.ResourceConstants;
import org.apache.commons.cli2.resource.ResourceHelper;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.OptionException;

public class WriteableCommandLineTest extends TestCase {
    public void testInitialCurrentOptionIsRoot() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        assertSame(root, command.getCurrentOption());
    }

    public void testSetAndGetCurrentOption() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        GroupImpl other = new GroupImpl(new ArrayList(), "other", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.setCurrentOption(other);
        assertSame(other, command.getCurrentOption());
    }

    public void testAddOptionRegistersPreferredNameAndTrigger() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.addOption(option);
        assertSame(option, command.getOption(option.getPreferredName()));
        assertTrue(command.hasOption(option));
    }

    public void testAddValueStoresUndefaultedValue() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.addValue(option, "value");
        assertEquals(Collections.singletonList("value"), command.getUndefaultedValues(option));
    }

    public void testAddSwitchRegistersOptionAndValue() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.addSwitch(option, true);
        assertEquals(Boolean.TRUE, command.getSwitch(option, null));
        assertTrue(command.hasOption(option));
    }

    public void testAddingSwitchTwiceThrows() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.addSwitch(option, false);
        try {
            command.addSwitch(option, true);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals(Boolean.FALSE, command.getSwitch(option, null));
        }
    }

    public void testGetValuesUsesExplicitDefaultsWhenNoValues() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        List defaults = Collections.singletonList("default");
        assertEquals(defaults, command.getValues(option, defaults));
    }

    public void testGetValuesFillsMissingValuesFromDefaults() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.addValue(option, "given");
        List defaults = new ArrayList();
        defaults.add("first");
        defaults.add("second");
        assertEquals(defaults, command.getValues(option, defaults));
    }

    public void testUndefaultedValuesExcludeDefaults() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.setDefaultValues(option, Collections.singletonList("default"));
        assertEquals(Collections.EMPTY_LIST, command.getUndefaultedValues(option));
    }

    public void testSwitchLookupUsesMethodDefaultBeforeStoredDefault() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.setDefaultSwitch(option, Boolean.FALSE);
        assertEquals(Boolean.TRUE, command.getSwitch(option, Boolean.TRUE));
    }

    public void testSwitchLookupUsesStoredDefaultWhenMethodDefaultAbsent() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.setDefaultSwitch(option, Boolean.FALSE);
        assertEquals(Boolean.FALSE, command.getSwitch(option, null));
    }

    public void testOptionPropertyCanBeReplaced() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.addProperty(option, "key", "old");
        command.addProperty(option, "key", "new");
        assertEquals("new", command.getProperty(option, "key", "fallback"));
    }

    public void testOptionPropertyNamesAreReported() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.addProperty(option, "key", "value");
        assertTrue(command.getProperties(option).contains("key"));
    }

    public void testToStringQuotesArgumentsContainingSpaces() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        List args = new ArrayList();
        args.add("plain");
        args.add("two words");
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, args);
        assertEquals("plain \"two words\"", command.toString());
    }

    public void testGetNormalisedReturnsSuppliedArguments() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        List args = new ArrayList();
        args.add("one");
        args.add("two");
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, args);
        assertEquals(args, command.getNormalised());
    }

    public void testGetOptionsViewContainsAddedOption() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.addOption(option);
        assertTrue(command.getOptions().contains(option));
    }

    public void testGetOptionTriggersContainsRegisteredNames() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.addOption(option);
        assertTrue(command.getOptionTriggers().contains(option.getPreferredName()));
    }

    public void testRemovingDefaultValuesClearsThem() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.setDefaultValues(option, Collections.singletonList("default"));
        command.setDefaultValues(option, null);
        assertEquals(Collections.EMPTY_LIST, command.getValues(option, null));
    }

    public void testRemovingDefaultSwitchClearsIt() throws Exception {
        PropertyOption option = new PropertyOption();
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        command.setDefaultSwitch(option, Boolean.TRUE);
        command.setDefaultSwitch(option, null);
        assertNull(command.getSwitch(option, null));
    }

    public void testPropertyWithoutValueUsesFallback() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        assertEquals("fallback", command.getProperty(new PropertyOption(), "missing", "fallback"));
    }

    public void testEmptyGroupCanProcessNullArgument() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(group, new ArrayList());
        assertFalse(group.canProcess(command, (String) null));
    }

    public void testEmptyGroupHasNoPrefixesOrTriggers() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "", 0, 0, false);
        assertEquals(Collections.EMPTY_SET, group.getPrefixes());
        assertEquals(Collections.EMPTY_SET, group.getTriggers());
    }

    public void testEmptyGroupMetadataAndRequiredState() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "description", 0, 0, false);
        assertEquals("description", group.getDescription());
        assertEquals(0, group.getMinimum());
        assertEquals(0, group.getMaximum());
        assertFalse(group.isRequired());
    }

    public void testEmptyGroupHasNoAnonymousArgumentsOrMatchingOption() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "", 0, 0, false);
        assertEquals(Collections.EMPTY_LIST, group.getAnonymous());
        assertNull(group.findOption("unknown"));
    }

    public void testEmptyGroupUsageIsEmptyWithNoDisplaySettings() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "", 0, 0, false);
        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, DisplaySetting.NONE, null);
        assertEquals("", buffer.toString());
    }

    public void testEmptyGroupHelpLinesAreEmptyWithNoDisplaySettings() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "", 0, 0, false);
        assertEquals(Collections.EMPTY_LIST, group.helpLines(0, DisplaySetting.NONE, null));
    }

    public void testEmptyGroupProcessLeavesArgumentsUnchanged() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "", 0, 0, false);
        List arguments = new ArrayList();
        arguments.add("plain");
        ListIterator iterator = arguments.listIterator();
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(group, arguments);
        group.process(command, iterator);
        assertEquals("plain", iterator.next());
    }

    public void testEmptyGroupValidationAcceptsZeroMinimum() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(group, new ArrayList());
        group.validate(command);
        assertEquals(0, group.getMinimum());
    }

    public void testCommandLineLooksLikeOptionWithNoPrefixesIsFalse() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0, false);
        WriteableCommandLineImpl command = new WriteableCommandLineImpl(root, new ArrayList());
        assertFalse(command.looksLikeOption("-x"));
    }

    public void testEmptyGroupOptionLookupIsNull() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "", 0, 0, false);
        assertNull(group.findOption("-D"));
    }

    public void testEmptyGroupOptionListIsEmpty() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "", 0, 0, false);
        assertEquals(Collections.EMPTY_LIST, group.getOptions());
    }
}
