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
    private WriteableCommandLineImpl commandLine() {
        return new WriteableCommandLineImpl(new GroupImpl(
                new ArrayList(), "root", "", 0, 10, false), new ArrayList());
    }

    public void testCurrentOptionInitiallyIsRoot() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        assertEquals("root", line.getCurrentOption().getPreferredName());
    }

    public void testSetCurrentOption() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.setCurrentOption(option);
        assertSame(option, line.getCurrentOption());
    }

    public void testAddOptionRegistersPreferredNameAndTrigger() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.addOption(option);
        assertSame(option, line.getOption(option.getPreferredName()));
        assertTrue(line.hasOption(option));
    }

    public void testAddOptionKeepsUniqueOptionsInOptionsList() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.addOption(option);
        line.addOption(option);
        assertEquals(2, line.getOptions().size());
    }

    public void testAddValueAndGetValues() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.addValue(option, "value");
        assertEquals(Collections.singletonList("value"),
                line.getUndefaultedValues(option));
    }

    public void testSwitchValueAndDuplicateRejected() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.addSwitch(option, false);
        assertEquals(Boolean.FALSE, line.getSwitch(option, null));
        try {
            line.addSwitch(option, true);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    public void testGetValuesUsesDefaultsWhenThereAreNoValues() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        List defaults = Collections.singletonList("fallback");
        line.setDefaultValues(option, defaults);
        assertEquals(defaults, line.getValues(option, null));
    }

    public void testGetValuesAppendsOnlyMissingDefaults() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.addValue(option, "one");
        line.setDefaultValues(option, new ArrayList());
        List suppliedDefaults = new ArrayList();
        suppliedDefaults.add("default-one");
        suppliedDefaults.add("default-two");
        List expected = new ArrayList();
        expected.add("one");
        expected.add("default-two");
        assertEquals(expected, line.getValues(option, suppliedDefaults));
    }

    public void testUndefaultedValuesRemainEmptyDespiteDefaults() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.setDefaultValues(option, Collections.singletonList("fallback"));
        assertEquals(Collections.EMPTY_LIST, line.getUndefaultedValues(option));
    }

    public void testSwitchDefaultPrecedence() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.setDefaultSwitch(option, Boolean.FALSE);
        assertEquals(Boolean.TRUE, line.getSwitch(option, Boolean.TRUE));
        assertEquals(Boolean.FALSE, line.getSwitch(option, null));
    }

    public void testPropertySetAndReplacement() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.addProperty(option, "key", "first");
        line.addProperty(option, "key", "second");
        assertEquals("second", line.getProperty(option, "key", "fallback"));
        assertEquals(Collections.singleton("key"), line.getProperties(option));
    }

    public void testDefaultPropertiesUsePropertyOption() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        line.addProperty("key", "value");
        assertEquals("value", line.getProperty("key"));
        assertEquals(Collections.singleton("key"), line.getProperties());
    }

    public void testUnconfiguredPropertyReturnsSpecifiedDefault() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        assertEquals("fallback", line.getProperty(new PropertyOption(), "missing", "fallback"));
    }

    public void testLooksLikeOptionWithUnprefixedToken() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        assertFalse(line.looksLikeOption("plain"));
    }

    public void testToStringQuotesTokensContainingSpaces() throws Exception {
        List args = new ArrayList();
        args.add("one");
        args.add("two words");
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(
                new GroupImpl(new ArrayList(), "root", "", 0, 10, false), args);
        assertEquals("one \"two words\"", line.toString());
    }

    public void testNormalisedExposesOriginalArgumentSequence() throws Exception {
        List args = new ArrayList();
        args.add("first");
        args.add("last");
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(
                new GroupImpl(new ArrayList(), "root", "", 0, 10, false), args);
        assertEquals(args, line.getNormalised());
    }

    public void testGetOptionTriggersIncludesRegisteredTrigger() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.addOption(option);
        assertTrue(line.getOptionTriggers().contains(option.getPreferredName()));
    }

    public void testSetDefaultValuesNullRemovesDefaults() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.setDefaultValues(option, Collections.singletonList("value"));
        line.setDefaultValues(option, null);
        assertEquals(Collections.EMPTY_LIST, line.getValues(option, null));
    }

    public void testSetDefaultSwitchNullRemovesDefault() throws Exception {
        WriteableCommandLineImpl line = commandLine();
        Option option = new PropertyOption();
        line.setDefaultSwitch(option, Boolean.TRUE);
        line.setDefaultSwitch(option, null);
        assertNull(line.getSwitch(option, null));
    }

    public void testEmptyGroupCanProcessNullAsFalse() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 0, 10, false);
        assertFalse(group.canProcess(commandLine(), (String) null));
    }

    public void testEmptyGroupCannotProcessPlainToken() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 0, 10, false);
        assertFalse(group.canProcess(commandLine(), "plain"));
    }

    public void testGroupWithNoOptionsHasEmptyPrefixesAndTriggers() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 0, 10, false);
        assertEquals(Collections.EMPTY_SET, group.getPrefixes());
        assertEquals(Collections.EMPTY_SET, group.getTriggers());
    }

    public void testEmptyGroupProcessLeavesArgumentsUntouched() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 0, 10, false);
        List args = new ArrayList();
        args.add("plain");
        ListIterator iterator = args.listIterator();
        group.process(commandLine(), iterator);
        assertEquals(0, iterator.nextIndex());
    }

    public void testEmptyGroupValidatesWhenMinimumIsZero() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 0, 10, false);
        group.validate(commandLine());
        assertEquals(0, group.getMinimum());
    }

    public void testGroupValidationRejectsMissingMinimumOption() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 1, 2, true);
        try {
            group.validate(commandLine());
            fail("expected OptionException");
        } catch (OptionException expected) {
            assertSame(group, expected.getOption());
        }
    }

    public void testGroupValidationRejectsTooManyPresentOptions() throws Exception {
        List options = new ArrayList();
        Option first = new PropertyOption("-a", "first", 1);
        Option second = new PropertyOption("-b", "second", 2);
        options.add(first);
        options.add(second);
        GroupImpl group = new GroupImpl(options, "root", "", 0, 1, false);
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(group, new ArrayList());
        line.addOption(first);
        line.addOption(second);
        try {
            group.validate(line);
            fail("expected OptionException");
        } catch (OptionException expected) {
            assertSame(group, expected.getOption());
        }
    }

    public void testGroupNameDescriptionAndBounds() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "description", 0, 10, false);
        assertEquals("root", group.getPreferredName());
        assertEquals("description", group.getDescription());
        assertEquals(10, group.getMaximum());
    }

    public void testGroupRequiredDependsOnMinimum() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 1, 2, true);
        assertTrue(group.isRequired());
    }

    public void testGroupIsNotRequiredWhenMinimumIsZero() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 0, 2, true);
        assertFalse(group.isRequired());
    }

    public void testEmptyGroupUsageAndHelpLines() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 0, 10, false);
        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, DisplaySetting.NONE, null);
        assertEquals("root", buffer.toString());
        assertEquals(Collections.EMPTY_LIST, group.helpLines(0, DisplaySetting.NONE, null));
    }

    public void testEmptyGroupHasNoAnonymousArgumentsOrFoundOption() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 0, 10, false);
        assertEquals(Collections.EMPTY_LIST, group.getAnonymous());
        assertNull(group.findOption("missing"));
    }

    public void testGroupDefaultsWithNoMembersIsSafe() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "root", "", 0, 10, false);
        group.defaults(commandLine());
        assertEquals(0, group.getOptions().size());
    }
}
