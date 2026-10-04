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
    private ArgumentImpl argument(String name, int minimum, int maximum,
                                  char subsequentSeparator, List defaults) {
        return new ArgumentImpl(name, null, minimum, maximum, '\0',
                                subsequentSeparator, null, "--", defaults, 0);
    }

    private WriteableCommandLineImpl commandLine(Option root, List args) {
        return new WriteableCommandLineImpl(root, args);
    }

    private List list(Object... values) {
        List result = new ArrayList();
        for (Object value : values) {
            result.add(value);
        }
        return result;
    }

    public void testAddValueRegistersArgumentAndStoresValue() throws Exception {
        ArgumentImpl arg = argument("file", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.addValue(arg, "one");
        assertTrue(line.hasOption(arg));
        assertEquals(list("one"), line.getUndefaultedValues(arg));
    }

    public void testAddSwitchStoresFalseAndRegistersOption() throws Exception {
        ArgumentImpl arg = argument("flag", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.addSwitch(arg, false);
        assertEquals(Boolean.FALSE, line.getSwitch(arg, null));
        assertTrue(line.hasOption(arg));
    }

    public void testAddSwitchRejectsSecondAssignment() throws Exception {
        ArgumentImpl arg = argument("flag", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.addSwitch(arg, true);
        try {
            line.addSwitch(arg, false);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals(Boolean.TRUE, line.getSwitch(arg, null));
        }
    }

    public void testGetOptionMapsPreferredName() throws Exception {
        ArgumentImpl arg = argument("file", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.addOption(arg);
        assertSame(arg, line.getOption("file"));
    }

    public void testValuesUseCallerDefaultBeforeConfiguredDefault() throws Exception {
        ArgumentImpl arg = argument("file", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        List configured = list("configured");
        List caller = list("caller");
        line.setDefaultValues(arg, configured);
        assertEquals(caller, line.getValues(arg, caller));
    }

    public void testValuesUseConfiguredDefaultWhenCallerDefaultEmpty() throws Exception {
        ArgumentImpl arg = argument("file", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.setDefaultValues(arg, list("configured"));
        assertEquals(list("configured"), line.getValues(arg, Collections.EMPTY_LIST));
    }

    public void testValuesUseAddedValueAheadOfDefaults() throws Exception {
        ArgumentImpl arg = argument("file", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.setDefaultValues(arg, list("configured"));
        line.addValue(arg, "actual");
        assertEquals(list("actual"), line.getValues(arg, null));
    }

    public void testUndefaultedValuesAreEmptyWithoutAddedValue() throws Exception {
        ArgumentImpl arg = argument("file", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        assertEquals(0, line.getUndefaultedValues(arg).size());
    }

    public void testSwitchDefaultResolutionAndRemoval() throws Exception {
        ArgumentImpl arg = argument("flag", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.setDefaultSwitch(arg, Boolean.TRUE);
        assertEquals(Boolean.FALSE, line.getSwitch(arg, Boolean.FALSE));
        assertEquals(Boolean.TRUE, line.getSwitch(arg, null));
        line.setDefaultSwitch(arg, null);
        assertNull(line.getSwitch(arg, null));
    }

    public void testPropertiesReplaceAndUseProvidedFallback() throws Exception {
        ArgumentImpl arg = argument("file", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        assertEquals("fallback", line.getProperty("key", "fallback"));
        line.addProperty("key", "first");
        line.addProperty("key", "last");
        assertEquals("last", line.getProperty("key", "fallback"));
        assertEquals(1, line.getProperties().size());
    }

    public void testLooksLikeOptionUsesRootPrefixes() throws Exception {
        ArgumentImpl root = argument("root", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        assertFalse(line.looksLikeOption("--name"));
        assertFalse(line.looksLikeOption("name"));
    }

    public void testToStringQuotesArgumentsContainingSpaces() throws Exception {
        ArgumentImpl root = argument("root", 0, 1, '\0', null);
        WriteableCommandLineImpl line =
            commandLine(root, list("plain", "two words", "end"));
        assertEquals("plain \"two words\" end", line.toString());
    }

    public void testOptionsAndTriggersExposeAddedOptionNames() throws Exception {
        ArgumentImpl arg = argument("file", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.addOption(arg);
        assertEquals(1, line.getOptions().size());
        assertSame(arg, line.getOptions().get(0));
        assertTrue(line.getOptionTriggers().contains("file"));
    }

    public void testSetDefaultValuesNullRemovesStoredDefaults() throws Exception {
        ArgumentImpl arg = argument("file", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.setDefaultValues(arg, list("default"));
        line.setDefaultValues(arg, null);
        assertEquals(0, line.getValues(arg, null).size());
    }

    public void testNormalisedListAndArgumentStringAreRetained() throws Exception {
        ArgumentImpl root = argument("root", 0, 1, '\0', null);
        List normalized = list("a", "b");
        WriteableCommandLineImpl line = commandLine(root, normalized);
        assertEquals(normalized, line.getNormalised());
        assertEquals("a b", line.toString());
    }

    public void testProcessValuesSplitsAtSubsequentSeparator() throws Exception {
        ArgumentImpl arg = argument("item", 0, 3, ',', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        List args = list("a,b");
        arg.processValues(line, args.listIterator(), arg);
        assertEquals(list("a", "b"), line.getUndefaultedValues(arg));
        assertEquals(list("a", "b"), args);
    }

    public void testProcessValuesStopsAtOptionPrefix() throws Exception {
        ArgumentImpl root = argument("root", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        ArgumentImpl arg = argument("item", 0, 2, '\0', null);
        List args = list("first", "-next");
        ListIterator iterator = args.listIterator();
        arg.processValues(line, iterator, arg);
        assertEquals(list("first", "-next"), line.getUndefaultedValues(arg));
        assertEquals(false, iterator.hasNext());
    }

    public void testProcessValuesConsumesRemainingUpToMaximum() throws Exception {
        ArgumentImpl arg = argument("item", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        List args = list("--", "one", "two");
        arg.processValues(line, args.listIterator(), arg);
        assertEquals(list("one", "two"), line.getUndefaultedValues(arg));
    }

    public void testProcessValuesDoesNotExceedMaximum() throws Exception {
        ArgumentImpl arg = argument("item", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        List args = list("first", "second");
        ListIterator iterator = args.listIterator();
        arg.processValues(line, iterator, arg);
        assertEquals(list("first"), line.getUndefaultedValues(arg));
        assertEquals("second", iterator.next());
    }

    public void testStripBoundaryQuotesRequiresBothQuotes() throws Exception {
        ArgumentImpl arg = argument("item", 0, 1, '\0', null);
        assertEquals("word", arg.stripBoundaryQuotes("\"word\""));
        assertEquals("\"word", arg.stripBoundaryQuotes("\"word"));
        assertEquals("word\"", arg.stripBoundaryQuotes("word\""));
    }

    public void testValidateAcceptsValueAtMinimumAndMaximum() throws Exception {
        ArgumentImpl arg = argument("item", 1, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.addValue(arg, "one");
        line.addValue(arg, "two");
        arg.validate(line);
        assertEquals(2, line.getUndefaultedValues(arg).size());
    }

    public void testValidateRejectsMissingRequiredValue() throws Exception {
        ArgumentImpl arg = argument("item", 1, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        try {
            arg.validate(line);
            fail("expected OptionException");
        } catch (OptionException expected) {
            assertSame(arg, expected.getOption());
        }
    }

    public void testDefaultsTransferArgumentDefaultsToCommandLine() throws Exception {
        ArgumentImpl arg = argument("item", 0, 2, '\0', list("default"));
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        arg.defaults(line);
        assertEquals(list("default"), line.getValues(arg, null));
    }

    public void testPreferredNameAndDescription() throws Exception {
        ArgumentImpl arg = argument("input", 0, 1, '\0', null);
        assertEquals("input", arg.getPreferredName());
        assertNull(arg.getDescription());
    }

    public void testCanProcessAndArgumentSeparators() throws Exception {
        ArgumentImpl arg = argument("item", 0, 1, ':', null);
        ArgumentImpl root = argument("root", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        assertTrue(arg.canProcess(line, ""));
        assertEquals('\0', arg.getInitialSeparator());
        assertEquals(':', arg.getSubsequentSeparator());
    }

    public void testPrefixesTriggersAndConfiguredDefaults() throws Exception {
        ArgumentImpl arg = argument("item", 0, 2, '\0', list("fallback"));
        assertEquals(0, arg.getPrefixes().size());
        assertEquals(0, arg.getTriggers().size());
        assertEquals(list("fallback"), arg.getDefaultValues());
        assertNull(arg.getValidator());
        assertEquals("--", arg.getConsumeRemaining());
    }

    public void testProcessDelegatesToProcessValues() throws Exception {
        ArgumentImpl arg = argument("item", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        List args = list("one", "two");
        arg.process(line, args.listIterator());
        assertEquals(list("one", "two"), line.getUndefaultedValues(arg));
    }

    public void testAppendUsageRendersRequiredAndOptionalArguments() throws Exception {
        ArgumentImpl arg = argument("item", 1, 2, '\0', null);
        StringBuffer buffer = new StringBuffer();
        arg.appendUsage(buffer, DisplaySetting.NONE, null);
        assertEquals("item [item]", buffer.toString());
    }

    public void testAppendUsageBracketsAndNumbersArguments() throws Exception {
        ArgumentImpl arg = argument("item", 1, 2, '\0', null);
        Set settings = new java.util.HashSet();
        settings.add(DisplaySetting.DISPLAY_ARGUMENT_BRACKETED);
        settings.add(DisplaySetting.DISPLAY_ARGUMENT_NUMBERED);
        StringBuffer buffer = new StringBuffer();
        arg.appendUsage(buffer, settings, null);
        assertEquals("<item1> [<item2>]", buffer.toString());
    }

    public void testAppendUsageInfiniteMaximumUsesEllipsis() throws Exception {
        ArgumentImpl arg = argument("item", 0, Integer.MAX_VALUE, '\0', null);
        StringBuffer buffer = new StringBuffer();
        arg.appendUsage(buffer, DisplaySetting.NONE, null);
        assertEquals("item [item ...]", buffer.toString());
    }

    public void testHelpLinesReturnsOneLineAndIsRequiredReflectsMinimum() throws Exception {
        ArgumentImpl arg = argument("item", 1, 1, '\0', null);
        assertEquals(1, arg.helpLines(0, DisplaySetting.NONE, null).size());
        assertTrue(arg.isRequired());
        assertEquals(1, arg.getMinimum());
        assertEquals(1, arg.getMaximum());
    }

    public void testDefaultValuesCanBeAppliedDirectly() throws Exception {
        ArgumentImpl arg = argument("item", 0, 1, '\0', list("default"));
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        arg.defaultValues(line, arg);
        assertEquals(list("default"), line.getValues(arg, null));
    }
}
