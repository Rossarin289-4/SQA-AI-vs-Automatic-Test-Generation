package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OptionsTest extends TestCase {
    public void testAddOptionAndLookupShortName() throws Exception {
        Options options = new Options();
        Options returned = options.addOption("a", "alpha option");
        assertSame(options, returned);
        Option added = options.getOption("a");
        assertNotNull(added);
        assertEquals("a", added.getOpt());
        assertEquals("alpha option", added.getDescription());
    }

    public void testLongNameLookupAndHyphenStripping() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        assertSame(options.getOption("a"), options.getOption("--alpha"));
        assertSame(options.getOption("a"), options.getOption("-alpha"));
    }

    public void testUnknownOptionIsNull() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha option");
        assertNull(options.getOption("z"));
    }

    public void testHasOptionRecognizesShortAndLongNames() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("--alpha"));
        assertFalse(options.hasOption("z"));
    }

    public void testHasLongOptionDistinguishesNames() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        assertTrue(options.hasLongOption("--alpha"));
        assertFalse(options.hasLongOption("a"));
        assertFalse(options.hasLongOption("z"));
    }

    public void testHasShortOptionDistinguishesNames() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        assertTrue(options.hasShortOption("-a"));
        assertFalse(options.hasShortOption("alpha"));
        assertFalse(options.hasShortOption("z"));
    }

    public void testMatchingOptionsReturnsAllPrefixMatchesInInsertionOrder() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "one");
        options.addOption("b", "alpine", false, "two");
        assertEquals(java.util.Arrays.asList("alpha", "alpine"), options.getMatchingOptions("al"));
    }

    public void testMatchingOptionsExactMatchIsOnlyResult() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "one");
        options.addOption("b", "alpine", false, "two");
        assertEquals(Collections.singletonList("alpha"), options.getMatchingOptions("--alpha"));
    }

    public void testMatchingOptionsNoMatchIsEmpty() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "one");
        assertEquals(Collections.emptyList(), options.getMatchingOptions("z"));
    }

    public void testGetOptionsContainsAddedOption() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha option");
        Collection<Option> listed = options.getOptions();
        assertEquals(1, listed.size());
        assertSame(options.getOption("a"), listed.iterator().next());
    }

    public void testGetOptionsReflectsReplacementUnderSameKey() throws Exception {
        Options options = new Options();
        options.addOption("a", "first");
        options.addOption("a", "second");
        assertEquals(1, options.getOptions().size());
        assertEquals("second", options.getOption("a").getDescription());
    }

    public void testRequiredOptionIsListed() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "required option");
        required.setRequired(true);
        options.addOption(required);
        assertEquals(Collections.singletonList("r"), options.getRequiredOptions());
    }

    public void testAddingNonRequiredOptionLeavesRequiredListEmpty() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha option");
        assertEquals(0, options.getRequiredOptions().size());
    }

    public void testOptionGroupRegistrationUsesSameOptionInstance() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha option");
        group.addOption(option);
        options.addOptionGroup(group);
        assertSame(group, options.getOptionGroup(option));
        assertSame(option, options.getOption("a"));
    }

    public void testOptionGroupOptionsAreNotIndividuallyRequired() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "alpha option");
        option.setRequired(true);
        group.addOption(option);
        options.addOptionGroup(group);
        assertFalse(option.isRequired());
        assertEquals(0, options.getRequiredOptions().size());
    }

    public void testRequiredGroupAppearsInRequiredOptions() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", "alpha option"));
        options.addOptionGroup(group);
        assertEquals(1, options.getRequiredOptions().size());
        assertSame(group, options.getRequiredOptions().get(0));
    }

    public void testOptionOutsideGroupHasNoGroup() throws Exception {
        Options options = new Options();
        Option option = new Option("a", "alpha option");
        options.addOption(option);
        assertNull(options.getOptionGroup(option));
    }

    public void testToStringContainsShortAndLongMappings() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        String text = options.toString();
        assertTrue(text.startsWith("[ Options: [ short "));
        assertTrue(text.contains("alpha"));
        assertTrue(text.endsWith(" ]"));
    }
}
