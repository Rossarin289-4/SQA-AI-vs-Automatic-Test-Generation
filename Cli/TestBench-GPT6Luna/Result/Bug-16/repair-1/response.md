```java
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
    public void testParentRoundTrip() throws Exception {
        GroupImpl parent = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        GroupImpl child = new GroupImpl(new ArrayList(), "child", "desc", 0, 0);
        assertNull(child.getParent());
        child.setParent(parent);
        assertSame(parent, child.getParent());
    }

    public void testGroupMinimumMaximumAndRequired() throws Exception {
        GroupImpl optional = new GroupImpl(new ArrayList(), "opt", "desc", 0, 2);
        GroupImpl required = new GroupImpl(new ArrayList(), "req", "desc", 1, 2);
        assertEquals(0, optional.getMinimum());
        assertEquals(2, optional.getMaximum());
        assertFalse(optional.isRequired());
        assertTrue(required.isRequired());
    }

    public void testGroupPrefixesAndTriggersAreEmptyWithoutMembers() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        assertTrue(group.getPrefixes().isEmpty());
        assertTrue(group.getTriggers().isEmpty());
    }

    public void testGroupAcceptsNullArgumentAsUnprocessable() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        List args = new ArrayList();
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(group, args);
        assertFalse(group.canProcess(line, (String) null));
    }

    public void testGroupDoesNotProcessUnknownTokenWithoutAnonymousArgument() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        List args = new ArrayList();
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(group, args);
        assertFalse(group.canProcess(line, "word"));
    }

    public void testGroupNameAndDescription() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "details", 0, 0);
        assertEquals("group", group.getPreferredName());
        assertEquals("details", group.getDescription());
    }

    public void testGroupFindOptionForUnmatchedTrigger() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        assertNull(group.findOption("missing"));
    }

    public void testGroupDefaultsDoesNotAddOptionWhenEmpty() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(group, new ArrayList());
        group.defaults(line);
        assertFalse(line.hasOption(group));
    }

    public void testOptionEqualityForEquivalentEmptyGroups() throws Exception {
        GroupImpl first = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        GroupImpl second = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        assertTrue(first.equals(second));
        assertEquals(first.hashCode(), second.hashCode());
    }

    public void testOptionInequalityForDifferentIds() throws Exception {
        GroupImpl first = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        GroupImpl second = new GroupImpl(new ArrayList(), "group", "desc", 0, 1);
        assertFalse(first.equals(second));
    }

    public void testGroupUsageWithNoSettingsIsEmpty() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, DisplaySetting.NONE, null);
        assertEquals("", buffer.toString());
    }

    public void testGroupHelpLinesWithNoSettingsAreEmpty() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        assertTrue(group.helpLines(0, DisplaySetting.NONE, null).isEmpty());
    }

    public void testGroupValidationAcceptsZeroMinimumAndMaximum() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(group, new ArrayList());
        group.validate(line);
        assertEquals(0, group.getOptions().size());
    }

    public void testGroupValidationRejectsMissingMinimumMember() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 1, 1);
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(group, new ArrayList());
        try {
            group.validate(line);
            fail("expected OptionException");
        } catch (OptionException expected) {
            assertSame(group, expected.getOption());
        }
    }

    public void testGroupProcessLeavesUnknownTokenInIterator() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        List args = new ArrayList();
        args.add("word");
        ListIterator iterator = args.listIterator();
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(group, args);
        group.process(line, iterator);
        assertEquals(0, iterator.nextIndex());
    }

    public void testGroupHasNoAnonymousArgumentsWhenEmpty() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        assertEquals(0, group.getAnonymous().size());
    }

    public void testGroupOptionsRemainEmptyWhenConstructedEmpty() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        assertEquals(0, group.getOptions().size());
    }

    public void testOptionFindOptionReturnsNullForUnmatchedTrigger() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        assertNull(group.findOption("other"));
    }

    public void testWriteableLineRegistersOptionAndIndexesItsNames() throws Exception {
        PropertyOption option = new PropertyOption("prop", "property", 7);
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "desc", 0, 1);
        List args = new ArrayList();
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(root, args);
        line.addOption(option);
        assertTrue(line.hasOption(option));
        assertSame(option, line.getOption("prop"));
        assertEquals(1, line.getOptions().size());
        assertTrue(line.getOptionTriggers().contains("prop"));
    }

    public void testWriteableLineStoresValuesAndDefaults() throws Exception {
        PropertyOption option = new PropertyOption("value", "desc", 8);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new GroupImpl(new ArrayList(), "root", "desc", 0, 1), new ArrayList());
        List defaults = new ArrayList();
        defaults.add("default");
        line.setDefaultValues(option, defaults);
        assertEquals(defaults, line.getValues(option, null));
        line.addValue(option, "actual");
        assertEquals(Collections.singletonList("actual"), line.getUndefaultedValues(option));
        assertEquals(Collections.singletonList("actual"), line.getValues(option, null));
    }

    public void testWriteableLineUsesDefaultSuffixWhenThereAreMoreDefaults() throws Exception {
        PropertyOption option = new PropertyOption("value", "desc", 9);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new GroupImpl(new ArrayList(), "root", "desc", 0, 1), new ArrayList());
        List defaults = new ArrayList();
        defaults.add("first");
        defaults.add("second");
        line.setDefaultValues(option, defaults);
        line.addValue(option, "supplied");
        List expected = new ArrayList();
        expected.add("supplied");
        expected.add("second");
        assertEquals(expected, line.getValues(option, null));
    }

    public void testWriteableLineSwitchValuesAndDefaultPrecedence() throws Exception {
        PropertyOption option = new PropertyOption("switch", "desc", 10);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new GroupImpl(new ArrayList(), "root", "desc", 0, 1), new ArrayList());
        line.setDefaultSwitch(option, Boolean.FALSE);
        assertEquals(Boolean.TRUE, line.getSwitch(option, Boolean.TRUE));
        line.addSwitch(option, true);
        assertEquals(Boolean.TRUE, line.getSwitch(option, Boolean.FALSE));
    }

    public void testWriteableLineRemovesDefaultSwitchWhenSetToNull() throws Exception {
        PropertyOption option = new PropertyOption("switch", "desc", 11);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new GroupImpl(new ArrayList(), "root", "desc", 0, 1), new ArrayList());
        line.setDefaultSwitch(option, Boolean.TRUE);
        line.setDefaultSwitch(option, null);
        assertNull(line.getSwitch(option, null));
    }

    public void testWriteableLinePropertyLookupAndPropertyNames() throws Exception {
        PropertyOption option = new PropertyOption("property", "desc", 12);
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new GroupImpl(new ArrayList(), "root", "desc", 0, 1), new ArrayList());
        line.addProperty(option, "key", "value");
        assertEquals("value", line.getProperty(option, "key", "fallback"));
        assertEquals("fallback", line.getProperty(option, "missing", "fallback"));
        assertTrue(line.getProperties(option).contains("key"));
        assertTrue(line.getProperty("absent") == null);
    }

    public void testWriteableLineDefaultPropertiesUsePropertyOptionKey() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new GroupImpl(new ArrayList(), "root", "desc", 0, 1), new ArrayList());
        line.addProperty("key", "value");
        assertEquals("value", line.getProperty("key"));
        assertTrue(line.getProperties().contains("key"));
    }

    public void testWriteableLineRecognizesConfiguredPrefixes() throws Exception {
        List children = new ArrayList();
        GroupImpl root = new GroupImpl(children, "root", "desc", 0, 1);
        List args = new ArrayList();
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(root, args);
        assertFalse(line.looksLikeOption("plain"));
        assertFalse(line.looksLikeOption("-x"));
        assertTrue(line.looksLikeOption(null) == false);
        assertEquals(args, line.getNormalised());
    }

    public void testWriteableLineNormalizesSpacesInToString() throws Exception {
        GroupImpl root = new GroupImpl(new ArrayList(), "root", "desc", 0, 1);
        List args = new ArrayList();
        args.add("one");
        args.add("two words");
        WriteableCommandLineImpl line = new WriteableCommandLineImpl(root, args);
        assertEquals("one \"two words\"", line.toString());
        assertEquals(args, line.getNormalised());
    }

    public void testGroupIdAndOptionId() throws Exception {
        GroupImpl group = new GroupImpl(new ArrayList(), "group", "desc", 0, 0);
        assertEquals(0, group.getId());
    }
}
```