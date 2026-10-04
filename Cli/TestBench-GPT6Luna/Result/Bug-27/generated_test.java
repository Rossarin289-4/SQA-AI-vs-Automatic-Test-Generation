package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OptionGroupTest extends TestCase {
    public void testNewGroupHasNoSelection() throws Exception {
        OptionGroup group = new OptionGroup();
        assertNull(group.getSelected());
    }

    public void testAddOptionReturnsSameGroup() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha");
        assertSame(group, group.addOption(option));
    }

    public void testAddOptionStoresItsName() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha");
        group.addOption(option);
        assertTrue(group.getNames().contains(option.getKey()));
    }

    public void testAddOptionStoresSameOption() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha");
        group.addOption(option);
        assertTrue(group.getOptions().contains(option));
    }

    public void testAddingSameKeyReplacesStoredOption() throws Exception {
        OptionGroup group = new OptionGroup();
        Option first = new Option("a", "first");
        Option second = new Option("a", "second");
        group.addOption(first);
        group.addOption(second);
        assertEquals(1, group.getNames().size());
        assertEquals(1, group.getOptions().size());
        assertTrue(group.getOptions().contains(second));
    }

    public void testNamesReflectAddedOptions() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha"));
        group.addOption(new Option("b", "beta"));
        Collection names = group.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
    }

    public void testOptionsReflectAddedOptions() throws Exception {
        OptionGroup group = new OptionGroup();
        Option first = new Option("a", "alpha");
        Option second = new Option("b", "beta");
        group.addOption(first);
        group.addOption(second);
        Collection options = group.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(first));
        assertTrue(options.contains(second));
    }

    public void testSelectOptionSetsItsKey() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha");
        group.addOption(option);
        group.setSelected(option);
        assertEquals(option.getKey(), group.getSelected());
    }

    public void testSelectingSameOptionAgainIsAllowed() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha");
        group.setSelected(option);
        group.setSelected(option);
        assertEquals(option.getKey(), group.getSelected());
    }

    public void testSelectingDifferentOptionThrowsAndKeepsSelection() throws Exception {
        OptionGroup group = new OptionGroup();
        Option first = new Option("a", "alpha");
        Option second = new Option("b", "beta");
        group.setSelected(first);
        try {
            group.setSelected(second);
            fail("expected AlreadySelectedException");
        } catch (AlreadySelectedException expected) {
            assertEquals(first.getKey(), group.getSelected());
        }
    }

    public void testNullSelectionResetsSelection() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha");
        group.setSelected(option);
        group.setSelected(null);
        assertNull(group.getSelected());
    }

    public void testCanSelectAfterReset() throws Exception {
        OptionGroup group = new OptionGroup();
        Option first = new Option("a", "alpha");
        Option second = new Option("b", "beta");
        group.setSelected(first);
        group.setSelected(null);
        group.setSelected(second);
        assertEquals(second.getKey(), group.getSelected());
    }

    public void testRequiredDefaultsToFalse() throws Exception {
        OptionGroup group = new OptionGroup();
        assertFalse(group.isRequired());
    }

    public void testSetRequiredTrue() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        assertTrue(group.isRequired());
    }

    public void testSetRequiredFalseAfterTrue() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    public void testStringOfEmptyGroup() throws Exception {
        OptionGroup group = new OptionGroup();
        assertEquals("[]", group.toString());
    }

    public void testStringUsesShortOptionAndDescription() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha"));
        assertEquals("[-a alpha]", group.toString());
    }

    public void testStringUsesLongOptionWhenShortOptionIsNull() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option(null, "long-name", false, "description"));
        assertEquals("[--long-name description]", group.toString());
    }

    public void testStringSeparatesMultipleOptions() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha"));
        group.addOption(new Option("b", "beta"));
        String rendered = group.toString();
        assertTrue(rendered.startsWith("["));
        assertTrue(rendered.endsWith("]"));
        assertTrue(rendered.contains(", "));
        assertTrue(rendered.contains(" alpha"));
        assertTrue(rendered.contains(" beta"));
    }
}
