package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class OptionGroupTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testAddOptionReturnsGroupAndRecordsFirstName() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha", false, "first");

        assertSame(group, group.addOption(option));
        assertEquals(1, group.getNames().size());
        assertTrue(group.getNames().contains("a"));
        assertSame(option, group.getOptions().iterator().next());
    }

    public void testAddSeveralOptionsPreservesInsertionOrder() throws Exception {
        OptionGroup group = new OptionGroup();
        Option first = new Option("a", "alpha", false, null);
        Option second = new Option("b", "beta", false, null);

        group.addOption(first);
        group.addOption(second);

        Iterator<String> names = group.getNames().iterator();
        assertEquals("a", names.next());
        assertEquals("b", names.next());
        assertFalse(names.hasNext());
        Iterator<Option> options = group.getOptions().iterator();
        assertSame(first, options.next());
        assertSame(second, options.next());
        assertFalse(options.hasNext());
    }

    public void testAddingSameKeyReplacesEntryWithoutMovingItsPosition() throws Exception {
        OptionGroup group = new OptionGroup();
        Option original = new Option("a", "old", false, null);
        Option other = new Option("b", "beta", false, null);
        Option replacement = new Option("a", "new", false, null);

        group.addOption(original);
        group.addOption(other);
        group.addOption(replacement);

        Iterator<Option> options = group.getOptions().iterator();
        assertSame(replacement, options.next());
        assertSame(other, options.next());
        assertFalse(options.hasNext());
        assertEquals(2, group.getNames().size());
    }

    public void testSelectedInitiallyNull() throws Exception {
        OptionGroup group = new OptionGroup();

        assertNull(group.getSelected());
    }

    public void testSelectOptionByKey() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha", false, null);

        group.setSelected(option);

        assertEquals("a", group.getSelected());
    }

    public void testSelectingSameOptionAgainIsAllowed() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha", false, null);

        group.setSelected(option);
        group.setSelected(option);

        assertEquals("a", group.getSelected());
    }

    public void testSelectingDifferentOptionThrowsAndKeepsSelection() throws Exception {
        OptionGroup group = new OptionGroup();
        Option first = new Option("a", "alpha", false, null);
        Option second = new Option("b", "beta", false, null);
        group.setSelected(first);

        try {
            group.setSelected(second);
            fail("expected AlreadySelectedException");
        } catch (AlreadySelectedException expected) {
            assertSame(group, expected.getOptionGroup());
            assertSame(second, expected.getOption());
        }

        assertEquals("a", group.getSelected());
    }

    public void testNullSelectionResetsSelection() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setSelected(new Option("a", "alpha", false, null));

        group.setSelected(null);

        assertNull(group.getSelected());
    }

    public void testNullSelectionAllowsLaterSelection() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setSelected(new Option("a", "alpha", false, null));
        group.setSelected(null);
        group.setSelected(new Option("b", "beta", false, null));

        assertEquals("b", group.getSelected());
    }

    public void testRequiredCanBeSetTrueAndFalse() throws Exception {
        OptionGroup group = new OptionGroup();

        assertFalse(group.isRequired());
        group.setRequired(true);
        assertTrue(group.isRequired());
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    public void testStringForEmptyGroup() throws Exception {
        OptionGroup group = new OptionGroup();

        assertEquals("[]", group.toString());
    }

    public void testStringUsesShortOptionAndDescription() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "first"));

        assertEquals("[-a first]", group.toString());
    }

    public void testStringUsesLongNameWhenShortNameAbsent() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option(null, "alpha", false, null));

        assertEquals("[--alpha]", group.toString());
    }

    public void testStringFormatsMultipleOptionsInOrder() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "first"));
        group.addOption(new Option(null, "beta", false, "second"));

        assertEquals("[-a first, --beta second]", group.toString());
    }

    public void testAddOptionGroupAddsOptionsAndAssociations() throws Exception {
        OptionGroup group = new OptionGroup();
        Option first = new Option("a", "alpha", false, null);
        Option second = new Option(null, "beta", false, null);
        group.addOption(first);
        group.addOption(second);
        Options options = new Options();

        assertSame(options, options.addOptionGroup(group));
        assertSame(first, options.getOption("a"));
        assertSame(second, options.getOption("beta"));
        assertSame(group, options.getOptionGroup(first));
        assertSame(group, options.getOptionGroup(second));
    }

    public void testAddingGroupClearsRequiredFlagOnItsOptions() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha", false, null);
        option.setRequired(true);
        group.addOption(option);

        new Options().addOptionGroup(group);

        assertFalse(option.isRequired());
    }

    public void testRequiredGroupAppearsInRequiredOptions() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, null));
        group.setRequired(true);
        Options options = new Options();

        options.addOptionGroup(group);

        assertEquals(1, options.getRequiredOptions().size());
        assertSame(group, options.getRequiredOptions().get(0));
    }

    public void testOptionalGroupDoesNotAppearInRequiredOptions() throws Exception {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, null));
        Options options = new Options();

        options.addOptionGroup(group);

        assertEquals(0, options.getRequiredOptions().size());
    }

    public void testGetOptionAcceptsShortAndLongNamesWithHyphens() throws Exception {
        Options options = new Options();
        Option option = new Option("a", "alpha", false, null);
        options.addOption(option);

        assertSame(option, options.getOption("a"));
        assertSame(option, options.getOption("--alpha"));
    }

    public void testGetMatchingOptionsReturnsExactMatchAlone() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, null));
        options.addOption(new Option("b", "alphabet", false, null));

        List<String> matches = options.getMatchingOptions("alpha");

        assertEquals(1, matches.size());
        assertEquals("alpha", matches.get(0));
    }

    public void testGetMatchingOptionsReturnsAllPrefixMatchesInOrder() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, null));
        options.addOption(new Option("b", "alpine", false, null));
        options.addOption(new Option("c", "beta", false, null));

        List<String> matches = options.getMatchingOptions("--al");

        assertEquals(2, matches.size());
        assertEquals("alpha", matches.get(0));
        assertEquals("alpine", matches.get(1));
    }

    public void testGetMatchingOptionsHasNoResultForUnknownPrefix() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, null));

        assertEquals(0, options.getMatchingOptions("z").size());
    }

    public void testHasOptionAndNameSpecificQueries() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, null));

        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("--alpha"));
        assertTrue(options.hasShortOption("-a"));
        assertTrue(options.hasLongOption("--alpha"));
        assertFalse(options.hasShortOption("alpha"));
        assertFalse(options.hasLongOption("a"));
        assertFalse(options.hasOption("z"));
    }

    public void testGroupAssociationIsNullForUnregisteredOption() throws Exception {
        Options options = new Options();
        Option option = new Option("a", "alpha", false, null);

        assertNull(options.getOptionGroup(option));
    }
}
