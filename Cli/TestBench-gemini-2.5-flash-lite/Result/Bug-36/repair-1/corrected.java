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

    public void testAddOption() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        group.addOption(opt1);
        assertTrue("Group should contain the added option", group.getNames().contains("a"));
    }

    public void testAddOptionTwice() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        group.addOption(opt1);
        Option opt2 = new Option("a", "alpha", false, "description2"); // Same key
        group.addOption(opt2);
        assertEquals("Group should contain only one option with key 'a'", 1, group.getNames().size());
        // The getOption method is on the Options class, not OptionGroup.
        // We can check this indirectly by iterating through the group's options.
        Option foundOption = null;
        for (Option o : group.getOptions()) {
            if (o.getKey().equals("a")) {
                foundOption = o;
                break;
            }
        }
        assertNotNull("Option 'a' should be found", foundOption);
        assertEquals("The description should be updated for the same option key", "description2", foundOption.getDescription());
    }

    public void testGetNames() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        Option opt2 = new Option("b", "beta", false, "description2");
        group.addOption(opt1);
        group.addOption(opt2);
        Collection<String> names = group.getNames();
        assertEquals("Should have two names", 2, names.size());
        assertTrue("Names should contain 'a'", names.contains("a"));
        assertTrue("Names should contain 'b'", names.contains("b"));
    }

    public void testGetOptions() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        Option opt2 = new Option("b", "beta", false, "description2");
        group.addOption(opt1);
        group.addOption(opt2);
        Collection<Option> options = group.getOptions();
        assertEquals("Should have two options", 2, options.size());
        assertTrue("Options should contain opt1", options.contains(opt1));
        assertTrue("Options should contain opt2", options.contains(opt2));
    }

    public void testGetOptionsEmpty() throws Exception {
        OptionGroup group = new OptionGroup();
        Collection<Option> options = group.getOptions();
        assertTrue("Should be empty", options.isEmpty());
    }

    public void testSetSelected() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        group.addOption(opt1);
        group.setSelected(opt1);
        assertEquals("Selected option should be 'a'", "a", group.getSelected());
    }

    public void testSetSelectedNull() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        group.addOption(opt1);
        group.setSelected(opt1);
        group.setSelected(null);
        assertNull("Selected option should be null after setting to null", group.getSelected());
    }

    public void testSetSelectedTwiceSameOption() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        group.addOption(opt1);
        group.setSelected(opt1);
        group.setSelected(opt1); // Reselecting same option
        assertEquals("Selected option should remain 'a'", "a", group.getSelected());
    }

    public void testSetSelectedAlreadySelectedException() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        Option opt2 = new Option("b", "beta", false, "description2");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setSelected(opt1);

        try {
            group.setSelected(opt2);
            fail("Expected AlreadySelectedException");
        } catch (AlreadySelectedException e) {
            assertSame("The exception should be for this group", group, e.getOptionGroup());
            assertSame("The exception should be for option 'b'", opt2, e.getOption());
        }
    }

    public void testGetSelectedEmpty() throws Exception {
        OptionGroup group = new OptionGroup();
        assertNull("Initially, no option should be selected", group.getSelected());
    }

    public void testSetRequired() throws Exception {
        OptionGroup group = new OptionGroup();
        assertFalse("Initially, the group should not be required", group.isRequired());
        group.setRequired(true);
        assertTrue("The group should now be required", group.isRequired());
    }

    public void testIsRequired() throws Exception {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        assertTrue("The group should be required", group.isRequired());
        group.setRequired(false);
        assertFalse("The group should not be required", group.isRequired());
    }

    public void testToStringEmpty() throws Exception {
        OptionGroup group = new OptionGroup();
        assertEquals("toString() of empty group should be '[]'", "[]", group.toString());
    }

    public void testToStringSingleOptionShort() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "description1");
        group.addOption(opt1);
        assertEquals("toString() with single short option", "[ -a description1 ]", group.toString());
    }

    public void testToStringSingleOptionLong() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        group.addOption(opt1);
        assertEquals("toString() with single long option", "[ --alpha description1 ]", group.toString());
    }

    public void testToStringMultipleOptions() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        Option opt2 = new Option("b", null, true, "description2");
        Option opt3 = new Option(null, "beta", false, "description3");
        group.addOption(opt1);
        group.addOption(opt2);
        group.addOption(opt3);
        // The order in LinkedHashMap is insertion order, so this should be the expected string
        assertEquals("toString() with multiple options", "[ -a description1, -b description2, --beta description3 ]", group.toString());
    }

    public void testToStringWithNoDescription() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", null);
        Option opt2 = new Option(null, "longopt", false, null);
        group.addOption(opt1);
        group.addOption(opt2);
        assertEquals("toString() with options without descriptions", "[ -a, --longopt ]", group.toString());
    }

    // Tests for Options class methods, as OptionGroup is used by Options
    public void testAddOptionGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        group.addOption(opt1);
        options.addOptionGroup(group);
        assertEquals("Should have one option group", 1, options.getOptionGroups().size());
        assertTrue("Options should contain the group", options.getOptionGroups().contains(group));
    }

    public void testAddOptionGroupRequired() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option opt1 = new Option("a", "alpha", false, "description1");
        group.addOption(opt1);
        options.addOptionGroup(group);
        assertTrue("Option 'a' should be required (via group)", options.getRequiredOptions().contains("a"));
    }

    public void testAddOptionGroupThenOptionRequired() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        Option opt2 = new Option("b", "beta", false, "description2");
        group.addOption(opt1);
        options.addOptionGroup(group);
        options.addOption("b", "beta", false, "description2"); // Adding option 'b' directly
        assertFalse("Option 'a' should not be directly required", options.getRequiredOptions().contains("a"));
        assertFalse("Option 'b' should not be directly required", options.getRequiredOptions().contains("b"));
    }

    public void testGetOption() throws Exception {
        Options options = new Options();
        Option opt1 = new Option("a", "alpha", false, "description1");
        options.addOption(opt1);
        assertEquals("Should retrieve option by short name", opt1, options.getOption("a"));
        assertEquals("Should retrieve option by long name", opt1, options.getOption("alpha"));
        assertEquals("Should retrieve option by dashed long name", opt1, options.getOption("--alpha"));
        assertEquals("Should retrieve option by dashed short name", opt1, options.getOption("-a"));
    }

    public void testGetOptionNotFound() throws Exception {
        Options options = new Options();
        assertNull("Should return null for non-existent option", options.getOption("nonexistent"));
    }

    public void testGetMatchingOptions() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description1");
        options.addOption("apple", "apple", false, "description2");
        options.addOption("apricot", "apricot", false, "description3");

        List<String> matching = options.getMatchingOptions("ap");
        assertEquals("Should find 3 matching options", 3, matching.size());
        assertTrue("Matching should contain 'alpha'", matching.contains("alpha"));
        assertTrue("Matching should contain 'apple'", matching.contains("apple"));
        assertTrue("Matching should contain 'apricot'", matching.contains("apricot"));
    }

    public void testGetMatchingOptionsPerfectMatch() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description1");
        options.addOption("apple", "apple", false, "description2");

        List<String> matching = options.getMatchingOptions("alpha");
        assertEquals("Should find 1 matching option for perfect match", 1, matching.size());
        assertEquals("Perfect match should be 'alpha'", "alpha", matching.get(0));
    }

    public void testGetMatchingOptionsNoMatch() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description1");
        List<String> matching = options.getMatchingOptions("z");
        assertTrue("Should find no matching options", matching.isEmpty());
    }

    public void testHasOption() throws Exception {
        Options options = new Options();
        Option opt1 = new Option("a", "alpha", false, "description1");
        options.addOption(opt1);
        assertTrue("Should have option 'a'", options.hasOption("a"));
        assertTrue("Should have option 'alpha'", options.hasOption("alpha"));
        assertTrue("Should have option '-a'", options.hasOption("-a"));
        assertTrue("Should have option '--alpha'", options.hasOption("--alpha"));
        assertFalse("Should not have option 'b'", options.hasOption("b"));
    }

    public void testHasOptionEmpty() throws Exception {
        Options options = new Options();
        assertFalse("Should not have any option in an empty set", options.hasOption("a"));
    }

    public void testHasLongOption() throws Exception {
        Options options = new Options();
        Option opt1 = new Option("a", "alpha", false, "description1");
        options.addOption(opt1);
        assertTrue("Should have long option 'alpha'", options.hasLongOption("alpha"));
        assertTrue("Should have long option '--alpha'", options.hasLongOption("--alpha"));
        assertFalse("Should not have long option 'a'", options.hasLongOption("a"));
    }

    public void testHasShortOption() throws Exception {
        Options options = new Options();
        Option opt1 = new Option("a", "alpha", false, "description1");
        options.addOption(opt1);
        assertTrue("Should have short option 'a'", options.hasShortOption("a"));
        assertTrue("Should have short option '-a'", options.hasShortOption("-a"));
        assertFalse("Should not have short option 'alpha'", options.hasShortOption("alpha"));
    }

    public void testGetOptionGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        group.addOption(opt1);
        options.addOptionGroup(group);

        assertEquals("Should return the correct option group for opt1", group, options.getOptionGroup(opt1));
    }

    public void testGetOptionGroupNotInGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        Option opt2 = new Option("b", "beta", false, "description2");
        group.addOption(opt1);
        options.addOptionGroup(group);
        options.addOption(opt2); // opt2 is not in any group

        assertNull("Should return null for option not in any group", options.getOptionGroup(opt2));
    }

    public void testToStringOptions() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "description1");
        options.addOption("b", true, "description2");
        // The exact string representation of the map can vary, so we check for key parts.
        assertTrue("toString() should contain short options part", options.toString().contains("[ Options: [ short "));
        assertTrue("toString() should contain long options part", options.toString().contains("] [ long "));
        assertTrue("toString() should contain option 'a'", options.toString().contains("a=[ -a (null) false 'description1' ]"));
        assertTrue("toString() should contain option 'b'", options.toString().contains("b=[ -b[*] false 'description2' ]"));
    }

    public void testOptionGroupIsSerializable() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "description1");
        group.addOption(opt1);
        group.setSelected(opt1);
        group.setRequired(true);

        // Simulate serialization
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(group);
        oos.close();

        byte[] serializedData = baos.toByteArray();

        // Simulate deserialization
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(serializedData);
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais);
        OptionGroup deserializedGroup = (OptionGroup) ois.readObject();
        ois.close();

        assertEquals("Deserialized group should have same selected option", group.getSelected(), deserializedGroup.getSelected());
        assertEquals("Deserialized group should have same required status", group.isRequired(), deserializedGroup.isRequired());
        assertEquals("Deserialized group should have same number of options", group.getNames().size(), deserializedGroup.getNames().size());
        assertTrue("Deserialized group should contain the option", deserializedGroup.getNames().contains("a"));
    }

    public void testOptionsIsSerializable() throws Exception {
        Options options = new Options();
        Option opt1 = new Option("a", "alpha", false, "description1");
        OptionGroup group = new OptionGroup();
        group.addOption(opt1);
        group.setRequired(true);
        options.addOptionGroup(group);
        options.addOption("b", "beta", true, "description2");

        // Simulate serialization
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
        oos.writeObject(options);
        oos.close();

        byte[] serializedData = baos.toByteArray();

        // Simulate deserialization
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(serializedData);
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais);
        Options deserializedOptions = (Options) ois.readObject();
        ois.close();

        assertTrue("Deserialized options should contain option 'a'", deserializedOptions.hasOption("a"));
        assertTrue("Deserialized options should contain option 'b'", deserializedOptions.hasOption("b"));
        assertEquals("Deserialized options should have correct required options count", 1, deserializedOptions.getRequiredOptions().size());
        assertEquals("Deserialized options should have 'a' as required option", "a", deserializedOptions.getRequiredOptions().get(0));
        assertEquals("Deserialized options should have one option group", 1, deserializedOptions.getOptionGroups().size());
    }
}
