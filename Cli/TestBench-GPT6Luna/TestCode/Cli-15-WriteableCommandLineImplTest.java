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
import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.resource.ResourceConstants;
import org.apache.commons.cli2.resource.ResourceHelper;

public class WriteableCommandLineImplTest extends TestCase {
    public void testAddOptionAndLookUpByTrigger() throws Exception {
        Option root = new PropertyOption();
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(root, new ArrayList());
        Option option = new PropertyOption();
        line.addOption(option);

        assertTrue(line.hasOption(option));
        assertSame(option, line.getOption(option.getPreferredName()));
        for (Iterator i = option.getTriggers().iterator(); i.hasNext();) {
            assertSame(option, line.getOption((String) i.next()));
        }
    }

    public void testAddValueAndRetrieveValues() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        line.addValue(option, "one");
        line.addValue(option, "two");

        List values = line.getValues(option, null);
        assertEquals(2, values.size());
        assertEquals("one", values.get(0));
        assertEquals("two", values.get(1));
        assertEquals(2, line.getUndefaultedValues(option).size());
    }

    public void testAddSwitchAndRetrieveIt() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        line.addSwitch(option, true);

        assertEquals(Boolean.TRUE, line.getSwitch(option, Boolean.FALSE));
        assertTrue(line.hasOption(option));
    }

    public void testAddSwitchRejectsSecondValue() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        line.addSwitch(option, false);
        try {
            line.addSwitch(option, true);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertEquals(Boolean.FALSE, line.getSwitch(option, null));
        }
    }

    public void testGetValuesUsesSuppliedDefaultsWhenNoValuesExist() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        List defaults = new ArrayList();
        defaults.add("default");

        assertSame(defaults, line.getValues(option, defaults));
    }

    public void testGetValuesFillsOnlyMissingDefaultPositions() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        line.addValue(option, "actual");
        List defaults = new ArrayList();
        defaults.add("first");
        defaults.add("second");

        List values = line.getValues(option, defaults);
        assertEquals(2, values.size());
        assertEquals("actual", values.get(0));
        assertEquals("second", values.get(1));
    }

    public void testGetValuesUsesConfiguredDefaultsWhenArgumentDefaultsEmpty() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        List configured = new ArrayList();
        configured.add("configured");
        line.setDefaultValues(option, configured);

        assertSame(configured, line.getValues(option, Collections.EMPTY_LIST));
    }

    public void testUndefaultedValuesExcludeConfiguredDefaults() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        List configured = new ArrayList();
        configured.add("default");
        line.setDefaultValues(option, configured);

        assertEquals(0, line.getUndefaultedValues(option).size());
    }

    public void testSwitchDefaultPrecedence() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        line.setDefaultSwitch(option, Boolean.TRUE);

        assertEquals(Boolean.FALSE, line.getSwitch(option, Boolean.FALSE));
        assertEquals(Boolean.TRUE, line.getSwitch(option, null));
        line.addSwitch(option, false);
        assertEquals(Boolean.FALSE, line.getSwitch(option, Boolean.TRUE));
    }

    public void testAddAndGetOptionProperty() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        line.addProperty(option, "key", "value");

        assertEquals("value", line.getProperty(option, "key", "fallback"));
        assertEquals("fallback", line.getProperty(option, "missing", "fallback"));
        assertTrue(line.getProperties(option).contains("key"));
    }

    public void testGetPropertyWithoutOptionReturnsNullWhenAbsent() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());

        assertNull(line.getProperty("missing"));
    }

    public void testLooksLikeOptionForPrefixAndNonPrefix() throws Exception {
        Option root = new PropertyOption();
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(root, new ArrayList());
        Set prefixes = root.getPrefixes();
        String prefix = (String) prefixes.iterator().next();

        assertTrue(line.looksLikeOption(prefix + "x"));
        assertFalse(line.looksLikeOption("plain"));
    }

    public void testToStringQuotesArgumentsContainingSpaces() throws Exception {
        List arguments = new ArrayList();
        arguments.add("plain");
        arguments.add("two words");
        arguments.add("");
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), arguments);

        assertEquals("plain \"two words\" ", line.toString());
    }

    public void testOptionListsAndTriggerSetReflectAddedOption() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        line.addOption(option);

        assertEquals(1, line.getOptions().size());
        assertSame(option, line.getOptions().get(0));
        assertTrue(line.getOptionTriggers().contains(option.getPreferredName()));
    }

    public void testSetDefaultValuesNullRemovesConfiguredDefaults() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        List defaults = new ArrayList();
        defaults.add("value");
        line.setDefaultValues(option, defaults);
        line.setDefaultValues(option, null);

        assertEquals(0, line.getValues(option, null).size());
    }

    public void testSetDefaultSwitchNullRemovesConfiguredSwitch() throws Exception {
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), new ArrayList());
        Option option = new PropertyOption();
        line.setDefaultSwitch(option, Boolean.TRUE);
        line.setDefaultSwitch(option, null);

        assertNull(line.getSwitch(option, null));
    }

    public void testNormalisedListReflectsArguments() throws Exception {
        List arguments = new ArrayList();
        arguments.add("first");
        arguments.add("last");
        WriteableCommandLineImpl line =
            new WriteableCommandLineImpl(new PropertyOption(), arguments);

        assertEquals(2, line.getNormalised().size());
        assertEquals("first", line.getNormalised().get(0));
        assertEquals("last", line.getNormalised().get(1));
    }
}
