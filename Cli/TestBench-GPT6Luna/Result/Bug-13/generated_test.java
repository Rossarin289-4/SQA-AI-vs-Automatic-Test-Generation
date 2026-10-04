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

    public void testAddValueForArgumentRegistersAndStoresIt() throws Exception {
        ArgumentImpl root = argument("root", 0, 3, '\0', null);
        ArgumentImpl arg = argument("value", 0, 3, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        line.addValue(arg, "item");
        assertTrue(line.hasOption(arg));
        assertEquals(Collections.singletonList("item"), line.getUndefaultedValues(arg));
        assertEquals(arg, line.getOption("value"));
    }

    public void testAddValueForNonArgumentDoesNotRegisterOption() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl arg = argument("value", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        line.addOption(root);
        line.addValue(root, "item");
        assertFalse(line.hasOption(arg));
        assertEquals(Collections.singletonList("item"), line.getUndefaultedValues(root));
    }

    public void testAddOptionMapsPreferredNameAndTracksOptions() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        line.addOption(root);
        assertTrue(line.hasOption(root));
        assertEquals(root, line.getOption("root"));
        assertEquals(1, line.getOptions().size());
        assertTrue(line.getOptionTriggers().contains("root"));
    }

    public void testAddSwitchStoresTrueAndRegistersOption() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl option = argument("flag", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        line.addSwitch(option, true);
        assertEquals(Boolean.TRUE, line.getSwitch(option, null));
        assertTrue(line.hasOption(option));
    }

    public void testDuplicateSwitchThrowsAfterRegistration() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl option = argument("flag", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        line.addSwitch(option, false);
        try {
            line.addSwitch(option, true);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals(Boolean.FALSE, line.getSwitch(option, null));
            assertTrue(line.hasOption(option));
        }
    }

    public void testValueDefaultsFallbackAndExplicitValuesWin() throws Exception {
        ArgumentImpl root = argument("root", 0, 3, '\0', null);
        ArgumentImpl option = argument("arg", 0, 3, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        List storedDefaults = Collections.singletonList("stored");
        List callDefaults = Collections.singletonList("call");
        line.setDefaultValues(option, storedDefaults);
        assertEquals(callDefaults, line.getValues(option, callDefaults));
        line.addValue(option, "actual");
        assertEquals(Collections.singletonList("actual"), line.getValues(option, callDefaults));
    }

    public void testEmptyExplicitDefaultListFallsBackToStoredDefaults() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl option = argument("arg", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        List stored = Collections.singletonList("stored");
        line.setDefaultValues(option, stored);
        assertEquals(stored, line.getValues(option, Collections.<String>emptyList()));
    }

    public void testNoValuesReturnsEmptyListAndUndefaultedIgnoresDefaults() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl option = argument("arg", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        line.setDefaultValues(option, Collections.singletonList("default"));
        assertEquals(0, line.getUndefaultedValues(option).size());
        assertEquals(Collections.singletonList("default"), line.getValues(option, null));
    }

    public void testSwitchDefaultsAreResolvedInOrderAndCanBeRemoved() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl option = argument("flag", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        line.setDefaultSwitch(option, Boolean.FALSE);
        assertEquals(Boolean.TRUE, line.getSwitch(option, Boolean.TRUE));
        assertEquals(Boolean.FALSE, line.getSwitch(option, null));
        line.setDefaultSwitch(option, null);
        assertNull(line.getSwitch(option, null));
    }

    public void testPropertiesReplaceAndUseCallerDefault() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        assertEquals("fallback", line.getProperty("mode", "fallback"));
        line.addProperty("mode", "old");
        line.addProperty("mode", "new");
        assertEquals("new", line.getProperty("mode", "fallback"));
        assertTrue(line.getProperties().contains("mode"));
    }

    public void testLooksLikeOptionUsesRootPrefixes() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        assertFalse(line.looksLikeOption("--name"));
        assertEquals(Collections.EMPTY_SET, line.getOptionTriggers());
    }

    public void testToStringQuotesArgumentsContainingSpaces() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        List args = new ArrayList();
        args.add("one");
        args.add("two words");
        WriteableCommandLineImpl line = commandLine(root, args);
        assertEquals("one \"two words\"", line.toString());
    }

    public void testNormalisedListReflectsSuppliedArguments() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        List args = new ArrayList();
        args.add("first");
        args.add("last");
        WriteableCommandLineImpl line = commandLine(root, args);
        assertEquals(2, line.getNormalised().size());
        assertEquals("first", line.getNormalised().get(0));
        assertEquals("last", line.getNormalised().get(1));
    }

    public void testSetDefaultValuesNullRemovesEntry() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl option = argument("arg", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        line.setDefaultValues(option, Collections.singletonList("default"));
        line.setDefaultValues(option, null);
        assertEquals(0, line.getValues(option, null).size());
    }

    public void testPrefixTriggerAtStartAndNonPrefixInput() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        assertFalse(line.looksLikeOption(""));
        assertFalse(line.looksLikeOption("plain"));
    }

    public void testArgumentStripBoundaryQuotesOnlyWhenBothPresent() throws Exception {
        ArgumentImpl arg = argument("arg", 0, 2, '\0', null);
        assertEquals("word", arg.stripBoundaryQuotes("\"word\""));
        assertEquals("\"word", arg.stripBoundaryQuotes("\"word"));
        assertEquals("word\"", arg.stripBoundaryQuotes("word\""));
    }

    public void testProcessValuesSplitsSubsequentSeparatedValues() throws Exception {
        ArgumentImpl root = argument("root", 0, 3, '\0', null);
        ArgumentImpl arg = argument("arg", 0, 3, ',', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        List input = new ArrayList();
        input.add("red,blue");
        ListIterator iterator = input.listIterator();
        arg.processValues(line, iterator, arg);
        assertEquals(2, line.getUndefaultedValues(arg).size());
        assertEquals("red", line.getUndefaultedValues(arg).get(0));
        assertEquals("blue", line.getUndefaultedValues(arg).get(1));
    }

    public void testProcessValuesStopsAtMaximum() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl arg = argument("arg", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        List input = new ArrayList();
        input.add("first");
        input.add("extra");
        arg.processValues(line, input.listIterator(), arg);
        assertEquals(Collections.singletonList("first"), line.getUndefaultedValues(arg));
    }

    public void testProcessValuesConsumeRemainingAddsUntilMaximum() throws Exception {
        ArgumentImpl root = argument("root", 0, 3, '\0', null);
        ArgumentImpl arg = argument("arg", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        List input = new ArrayList();
        input.add("--");
        input.add("one");
        input.add("two");
        ListIterator iterator = input.listIterator();
        arg.processValues(line, iterator, arg);
        assertEquals(2, line.getUndefaultedValues(arg).size());
        assertEquals("one", line.getUndefaultedValues(arg).get(0));
        assertEquals("two", line.getUndefaultedValues(arg).get(1));
    }

    public void testProcessValuesStopsBeforeOptionLikeInput() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl arg = argument("arg", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        List input = new ArrayList();
        input.add("value");
        input.add("--next");
        ListIterator iterator = input.listIterator();
        arg.processValues(line, iterator, arg);
        assertEquals(Collections.singletonList("value"), line.getUndefaultedValues(arg));
        assertEquals("--next", iterator.next());
    }

    public void testCanProcessAlwaysAcceptsArgument() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl arg = argument("arg", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        assertTrue(arg.canProcess(line, "--x"));
        assertTrue(arg.canProcess(line, ""));
    }

    public void testProcessDelegatesToValueProcessing() throws Exception {
        ArgumentImpl root = argument("root", 0, 2, '\0', null);
        ArgumentImpl arg = argument("arg", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(root, new ArrayList());
        List input = new ArrayList();
        input.add("value");
        arg.process(line, input.listIterator());
        assertEquals(Collections.singletonList("value"), line.getUndefaultedValues(arg));
    }

    public void testArgumentGettersAndRequiredBoundary() throws Exception {
        ArgumentImpl optional = argument("arg", 0, 2, '\0', null);
        ArgumentImpl required = argument("required", 1, 2, '\0', null);
        assertEquals(0, optional.getMinimum());
        assertEquals(2, optional.getMaximum());
        assertFalse(optional.isRequired());
        assertTrue(required.isRequired());
        assertEquals('\0', optional.getInitialSeparator());
        assertEquals('\0', optional.getSubsequentSeparator());
        assertEquals("--", optional.getConsumeRemaining());
    }

    public void testAppendUsageNumbersMultipleArgumentSlots() throws Exception {
        ArgumentImpl arg = argument("item", 1, 2, '\0', null);
        StringBuffer buffer = new StringBuffer();
        arg.appendUsage(buffer, DisplaySetting.NONE, null);
        assertEquals("item1 [item2]", buffer.toString());
    }

    public void testDefaultsInstallArgumentDefaultValues() throws Exception {
        ArgumentImpl arg = argument("arg", 0, 2, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        arg.defaults(line);
        assertEquals(0, line.getValues(arg, null).size());
        assertEquals(0, line.getUndefaultedValues(arg).size());
    }

    public void testArgumentNameAndDescriptionGetters() throws Exception {
        ArgumentImpl arg = new ArgumentImpl("item", "description", 0, 1,
                '\0', '\0', null, "--", null, 0);
        assertEquals("item", arg.getPreferredName());
        assertEquals("description", arg.getDescription());
    }

    public void testArgumentPrefixesAndTriggersAreEmpty() throws Exception {
        ArgumentImpl arg = argument("item", 0, 1, '\0', null);
        assertEquals(Collections.EMPTY_SET, arg.getPrefixes());
        assertEquals(Collections.EMPTY_SET, arg.getTriggers());
    }

    public void testArgumentDefaultValuesGetterPreservesConfiguredList() throws Exception {
        List defaults = Collections.singletonList("fallback");
        ArgumentImpl arg = argument("item", 0, 1, '\0', defaults);
        assertEquals(defaults, arg.getDefaultValues());
    }

    public void testArgumentDefaultValuesCanBeInstalledForAnotherOption() throws Exception {
        ArgumentImpl arg = argument("item", 0, 1, '\0',
                Collections.singletonList("fallback"));
        ArgumentImpl other = argument("other", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        arg.defaultValues(line, other);
        assertEquals(Collections.singletonList("fallback"), line.getValues(other, null));
        assertEquals(0, line.getUndefaultedValues(other).size());
    }

    public void testArgumentValidateAcceptsConfiguredValue() throws Exception {
        ArgumentImpl arg = argument("item", 1, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.addValue(arg, "present");
        arg.validate(line);
        assertEquals(Collections.singletonList("present"), line.getUndefaultedValues(arg));
    }

    public void testArgumentValidateRejectsMissingRequiredValue() throws Exception {
        ArgumentImpl arg = argument("item", 1, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        try {
            arg.validate(line);
            fail("expected OptionException");
        } catch (OptionException expected) {
            assertEquals(arg, expected.getOption());
        }
    }

    public void testArgumentValidateRejectsExcessValues() throws Exception {
        ArgumentImpl arg = argument("item", 0, 1, '\0', null);
        WriteableCommandLineImpl line = commandLine(arg, new ArrayList());
        line.addValue(arg, "first");
        line.addValue(arg, "extra");
        try {
            arg.validate(line);
            fail("expected OptionException");
        } catch (OptionException expected) {
            assertEquals(arg, expected.getOption());
        }
    }

    public void testArgumentValidatorGetterReturnsConfiguredNull() throws Exception {
        ArgumentImpl arg = argument("item", 0, 1, '\0', null);
        assertNull(arg.getValidator());
        assertEquals(0, arg.helpLines(0, DisplaySetting.NONE, null).size());
    }
}
