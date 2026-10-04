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
    public void testGroupCanProcessExactTrigger() throws Exception {
        Option child = new PropertyOption("-x", "property", 1);
        List children = new ArrayList();
        children.add(child);
        GroupImpl group = new GroupImpl(children, "group", "description", 0, 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(group, Collections.EMPTY_LIST);
        assertTrue(group.canProcess(line, "-x"));
    }

    public void testGroupRejectsNullArgument() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "description", 0, 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(group, Collections.EMPTY_LIST);
        assertFalse(group.canProcess(line, (String) null));
    }

    public void testGroupAcceptsAnonymousArgument() throws Exception {
        ArgumentImpl argument =
            new ArgumentImpl("value", "value", 0, 1, '\0', '\0', null, null,
                             Collections.EMPTY_LIST, 2);
        List children = new ArrayList();
        children.add(argument);
        GroupImpl group = new GroupImpl(children, "group", "description", 0, 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(group, Collections.EMPTY_LIST);
        assertTrue(group.canProcess(line, "data"));
    }

    public void testGroupRejectsPrefixedUnknownTrigger() throws Exception {
        Option child = new PropertyOption("-x", "property", 1);
        List children = new ArrayList();
        children.add(child);
        GroupImpl group = new GroupImpl(children, "group", "description", 0, 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(group, Collections.EMPTY_LIST);
        assertFalse(group.canProcess(line, "-unknown"));
    }

    public void testGroupSeparatesOptionsAndAnonymousArguments() throws Exception {
        Option child = new PropertyOption("-x", "property", 1);
        ArgumentImpl argument =
            new ArgumentImpl("value", "value", 0, 1, '\0', '\0', null, null,
                             Collections.EMPTY_LIST, 2);
        List children = new ArrayList();
        children.add(child);
        children.add(argument);
        GroupImpl group = new GroupImpl(children, "group", "description", 0, 2);
        assertEquals(1, group.getOptions().size());
        assertEquals(1, group.getAnonymous().size());
        assertSame(child, group.getOptions().get(0));
        assertSame(argument, group.getAnonymous().get(0));
    }

    public void testGroupRequiredAtMinimumOne() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "description", 1, 1);
        assertTrue(group.isRequired());
        assertEquals(1, group.getMinimum());
        assertEquals(1, group.getMaximum());
    }

    public void testGroupOptionalAtMinimumZero() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "description", 0, 0);
        assertFalse(group.isRequired());
        assertEquals(0, group.getMinimum());
        assertEquals(0, group.getMaximum());
    }

    public void testGroupFindsMemberTrigger() throws Exception {
        Option child = new PropertyOption("-x", "property", 1);
        List children = new ArrayList();
        children.add(child);
        GroupImpl group = new GroupImpl(children, "group", "description", 0, 1);
        assertSame(child, group.findOption("-x"));
        assertNull(group.findOption("-missing"));
    }

    public void testGroupParentIsAssignedToChild() throws Exception {
        Option child = new PropertyOption("-x", "property", 1);
        List children = new ArrayList();
        children.add(child);
        GroupImpl group = new GroupImpl(children, "group", "description", 0, 1);
        assertSame(group, child.getParent());
    }

    public void testOptionImplParentCanBeSetAndCleared() throws Exception {
        PropertyOption option = new PropertyOption("-x", "property", 1);
        PropertyOption parent = new PropertyOption("-p", "parent", 2);
        option.setParent(parent);
        assertSame(parent, option.getParent());
        option.setParent(null);
        assertNull(option.getParent());
    }

    public void testOptionImplIdAndRequiredState() throws Exception {
        PropertyOption option = new PropertyOption("-x", "property", 7);
        assertEquals(7, option.getId());
        assertFalse(option.isRequired());
    }

    public void testOptionImplFindOptionMatchesTriggerOnly() throws Exception {
        PropertyOption option = new PropertyOption("-x", "property", 1);
        assertSame(option, option.findOption("-x"));
        assertNull(option.findOption("-y"));
    }

    public void testOptionImplEqualityAndHashCode() throws Exception {
        PropertyOption first = new PropertyOption("-x", "property", 1);
        PropertyOption same = new PropertyOption("-x", "property", 1);
        PropertyOption different = new PropertyOption("-y", "property", 1);
        assertEquals(first, same);
        assertEquals(first.hashCode(), same.hashCode());
        assertFalse(first.equals(different));
    }

    public void testOptionImplCanProcessRestoresIterator() throws Exception {
        PropertyOption option = new PropertyOption("-x", "property", 1);
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "description", 0, 0);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(group, Collections.EMPTY_LIST);
        List args = new ArrayList();
        args.add("-x");
        ListIterator iterator = args.listIterator();
        assertFalse(option.canProcess(line, iterator));
        assertEquals(0, iterator.nextIndex());
    }

    public void testGroupValidationAcceptsZeroPresentAtZeroMinimum() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "description", 0, 0);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(group, Collections.EMPTY_LIST);
        group.validate(line);
        assertEquals(0, group.getOptions().size());
    }

    public void testGroupValidationRejectsMissingRequiredOption() throws Exception {
        Option child = new PropertyOption("-x", "property", 1);
        List children = new ArrayList();
        children.add(child);
        GroupImpl group = new GroupImpl(children, "group", "description", 1, 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(group, Collections.EMPTY_LIST);
        try {
            group.validate(line);
            fail("expected OptionException");
        } catch (OptionException expected) {
            assertSame(group, expected.getOption());
        }
    }

    public void testGroupValidationRejectsPresentCountAboveMaximum() throws Exception {
        Option first = new PropertyOption("-x", "first", 1);
        Option second = new PropertyOption("-y", "second", 2);
        List children = new ArrayList();
        children.add(first);
        children.add(second);
        GroupImpl group = new GroupImpl(children, "group", "description", 0, 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(group, Collections.EMPTY_LIST);
        line.addOption(first);
        line.addOption(second);
        try {
            group.validate(line);
            fail("expected OptionException");
        } catch (OptionException expected) {
            assertSame(group, expected.getOption());
        }
    }

    public void testGroupAppendUsageWithNoSettingsIncludesName() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "description", 0, 0);
        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, DisplaySetting.NONE, null);
        assertEquals("group", buffer.toString());
    }

    public void testGroupHelpLinesWithNoSettingsIsEmpty() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "description", 0, 0);
        assertEquals(0, group.helpLines(0, DisplaySetting.NONE, null).size());
    }

    public void testGroupPreferredNameAndDescription() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "description", 0, 0);
        assertEquals("group", group.getPreferredName());
        assertEquals("description", group.getDescription());
    }

    public void testValuesCombineCommandValuesWithDefaults() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0);
        PropertyOption option = new PropertyOption("-x", "property", 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(root, Collections.EMPTY_LIST);
        List defaults = new ArrayList();
        defaults.add("d1");
        defaults.add("d2");
        line.setDefaultValues(option, defaults);
        line.addValue(option, "v1");
        List actual = line.getValues(option, null);
        assertEquals(2, actual.size());
        assertEquals("v1", actual.get(0));
        assertEquals("d2", actual.get(1));
        assertEquals(1, line.getUndefaultedValues(option).size());
    }

    public void testValuesUseExplicitDefaultsWhenCommandValuesAreAbsent() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0);
        PropertyOption option = new PropertyOption("-x", "property", 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(root, Collections.EMPTY_LIST);
        List defaults = new ArrayList();
        defaults.add("fallback");
        assertEquals(defaults, line.getValues(option, defaults));
        assertEquals(0, line.getUndefaultedValues(option).size());
    }

    public void testSwitchValuePriorityAndDefaultRemoval() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0);
        PropertyOption option = new PropertyOption("-x", "property", 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(root, Collections.EMPTY_LIST);
        line.setDefaultSwitch(option, Boolean.TRUE);
        assertEquals(Boolean.TRUE, line.getSwitch(option, null));
        line.addSwitch(option, false);
        assertEquals(Boolean.FALSE, line.getSwitch(option, Boolean.TRUE));
        line.setDefaultSwitch(option, null);
        assertEquals(Boolean.FALSE, line.getSwitch(option, null));
    }

    public void testPropertyValuesAndPropertyNames() throws Exception {
        PropertyOption option = new PropertyOption("-x", "property", 1);
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(root, Collections.EMPTY_LIST);
        line.addProperty(option, "key", "value");
        assertEquals("value", line.getProperty(option, "key", null));
        assertEquals(1, line.getProperties(option).size());
        line.addProperty("global", "entry");
        assertEquals("entry", line.getProperty("global"));
    }

    public void testOptionPrefixesAndTriggerLookup() throws Exception {
        PropertyOption option = new PropertyOption("-x", "property", 1);
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(root, Collections.EMPTY_LIST);
        line.addOption(option);
        assertSame(option, line.getOption("-x"));
        assertTrue(line.getOptionTriggers().contains("-x"));
        assertFalse(line.getOptionTriggers().contains("-z"));
    }

    public void testLooksLikeOptionChecksPrefixAtBeginning() throws Exception {
        PropertyOption option = new PropertyOption("-x", "property", 1);
        List children = new ArrayList();
        children.add(option);
        GroupImpl root = new GroupImpl(children, "root", "", 0, 0);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(root, Collections.EMPTY_LIST);
        assertTrue(line.looksLikeOption("-value"));
        assertFalse(line.looksLikeOption("value"));
        assertEquals(1, root.getPrefixes().size());
    }

    public void testNormalisedArgumentsAreRenderedAndExposedReadOnly() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0);
        List args = new ArrayList();
        args.add("one");
        args.add("two words");
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(root, args);
        assertEquals("one \"two words\"", line.toString());
        assertEquals(args, line.getNormalised());
    }

    public void testAddingSameSwitchTwiceThrows() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "", 0, 0);
        PropertyOption option = new PropertyOption("-x", "property", 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(root, Collections.EMPTY_LIST);
        line.addSwitch(option, true);
        try {
            line.addSwitch(option, false);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals(2, line.getOptions().size());
        }
    }

    public void testGroupDefaultsCanBeAppliedToCommandLine() throws Exception {
        PropertyOption child = new PropertyOption("-x", "property", 1);
        List children = new ArrayList();
        children.add(child);
        GroupImpl root = new GroupImpl(children, "root", "", 0, 1);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(root, Collections.EMPTY_LIST);
        root.defaults(line);
        assertEquals(0, line.getOptions().size());
    }

    public void testGroupTriggers() throws Exception {
        PropertyOption first = new PropertyOption("-a", "a", 1);
        PropertyOption second = new PropertyOption("-b", "b", 2);
        List children = new ArrayList();
        children.add(first);
        children.add(second);
        GroupImpl group = new GroupImpl(children, "root", "", 0, 2);
        assertTrue(group.getTriggers().contains("-a"));
        assertTrue(group.getTriggers().contains("-b"));
    }
}
