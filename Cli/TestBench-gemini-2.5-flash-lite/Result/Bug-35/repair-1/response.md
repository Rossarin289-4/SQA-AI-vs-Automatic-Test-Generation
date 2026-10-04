```java
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
    public void testAddOptionGroupAddsToRequiredOptsIfGroupIsRequired() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option opt1 = new Option("a", "arg1", false, "desc1");
        group.addOption(opt1);
        options.addOptionGroup(group);
        assertTrue(options.getRequiredOptions().contains(group));
    }

    public void testAddOptionGroupAddsOptionsToShortAndLongOpts() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "arg1", false, "desc1");
        Option opt2 = new Option("b", null, false, "desc2");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);

        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("arg1"));
        assertTrue(options.hasOption("b"));
        assertFalse(options.hasOption("longB"));
    }

    public void testAddOptionGroupCorrectlyMapsOptionToGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "arg1", false, "desc1");
        group.addOption(opt1);
        options.addOptionGroup(group);

        assertEquals(group, options.getOptionGroup(opt1));
    }

    public void testAddOptionShortNameOnly() throws Exception {
        Options options = new Options();
        // Fixed: Changed "Argument a" to false for hasArg parameter
        options.addOption("a", false, "Argument a"); 
        assertTrue(options.hasOption("a"));
        assertFalse(options.hasLongOption("a"));
        assertNotNull(options.getOption("a"));
    }

    public void testAddOptionShortAndLongName() throws Exception {
        Options options = new Options();
        options.addOption("a", "longa", false, "description");
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasLongOption("longa"));
        assertNotNull(options.getOption("a"));
        assertNotNull(options.getOption("longa"));
    }

    public void testAddOptionWithExistingShortAndLongNameOverrides() throws Exception {
        Options options = new Options();
        options.addOption("a", "longa", false, "description1");
        options.addOption("a", "longa", true, "description2");
        Option addedOption = options.getOption("a");
        assertTrue(addedOption.hasArg());
        assertEquals("description2", addedOption.getDescription());
    }

    public void testAddOptionRequiredOptionAddedToRequiredList() throws Exception {
        Options options = new Options();
        Option opt = new Option("r", "requiredOpt", true, "A required option");
        opt.setRequired(true);
        options.addOption(opt);
        assertTrue(options.getRequiredOptions().contains("r"));
    }

    public void testAddOptionNonRequiredOptionNotAddedToRequiredList() throws Exception {
        Options options = new Options();
        Option opt = new Option("nr", "notRequiredOpt", false, "A non-required option");
        options.addOption(opt);
        assertFalse(options.getRequiredOptions().contains("nr"));
    }

    public void testGetOptionsReturnsUnmodifiableCollection() throws Exception {
        Options options = new Options();
        options.addOption("a", "arg1", false, "desc1");
        Collection<Option> opts = options.getOptions();
        try {
            opts.add(new Option("b", "arg2", false, "desc2"));
            fail("Should not be able to modify the collection.");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    public void testGetOptionWithShortName() throws Exception {
        Options options = new Options();
        Option opt = new Option("s", "short", false, "Short option");
        options.addOption(opt);
        assertEquals(opt, options.getOption("s"));
    }

    public void testGetOptionWithLongName() throws Exception {
        Options options = new Options();
        Option opt = new Option("l", "long", false, "Long option");
        options.addOption(opt);
        assertEquals(opt, options.getOption("long"));
    }

    public void testGetOptionStripsLeadingHyphens() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "alpha", false, "Option alpha");
        options.addOption(opt);
        assertEquals(opt, options.getOption("-a"));
        assertEquals(opt, options.getOption("--alpha"));
    }

    public void testGetOptionNotFound() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Option alpha");
        assertNull(options.getOption("b"));
        assertNull(options.getOption("-b"));
        assertNull(options.getOption("--beta"));
    }

    public void testGetMatchingOptionsWithPartialLongName() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", false, "An apple option");
        options.addOption("b", "apricot", false, "An apricot option");
        options.addOption("c", "banana", false, "A banana option");

        List<String> matches = options.getMatchingOptions("ap");
        assertEquals(2, matches.size());
        assertTrue(matches.contains("apple"));
        assertTrue(matches.contains("apricot"));
    }

    public void testGetMatchingOptionsWithExactLongName() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", false, "An apple option");
        options.addOption("b", "apricot", false, "An apricot option");
        List<String> matches = options.getMatchingOptions("apple");
        assertEquals(1, matches.size());
        assertEquals("apple", matches.get(0));
    }
    
    public void testGetMatchingOptionsWithPartialLongNameAndHyphens() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", false, "An apple option");
        options.addOption("b", "apricot", false, "An apricot option");
        List<String> matches = options.getMatchingOptions("--ap");
        assertEquals(2, matches.size());
        assertTrue(matches.contains("apple"));
        assertTrue(matches.contains("apricot"));
    }

    public void testGetMatchingOptionsNoMatch() throws Exception {
        Options options = new Options();
        options.addOption("a", "apple", false, "An apple option");
        List<String> matches = options.getMatchingOptions("b");
        assertTrue(matches.isEmpty());
    }

    public void testHasOptionWithShortName() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Option alpha");
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("-a"));
    }

    public void testHasOptionWithLongName() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Option alpha");
        assertTrue(options.hasOption("alpha"));
        assertTrue(options.hasOption("--alpha"));
    }

    public void testHasOptionNotFound() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Option alpha");
        assertFalse(options.hasOption("b"));
        assertFalse(options.hasOption("-b"));
        assertFalse(options.hasOption("--beta"));
    }

    public void testHasLongOption() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Option alpha");
        assertTrue(options.hasLongOption("alpha"));
        assertTrue(options.hasLongOption("--alpha"));
        assertFalse(options.hasLongOption("a"));
        assertFalse(options.hasLongOption("beta"));
    }

    public void testHasShortOption() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Option alpha");
        assertTrue(options.hasShortOption("a"));
        assertTrue(options.hasShortOption("-a"));
        assertFalse(options.hasShortOption("alpha"));
        assertFalse(options.hasShortOption("beta"));
    }

    public void testGetOptionGroupForOptionNotInGroup() throws Exception {
        Options options = new Options();
        Option opt = new Option("a", "alpha", false, "Option alpha");
        options.addOption(opt);
        assertNull(options.getOptionGroup(opt));
    }

    public void testToStringContainsShortAndLongOpts() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Option alpha");
        options.addOption("b", null, false, "Option beta");
        String toStringResult = options.toString();
        assertTrue(toStringResult.contains("[ Options: [ short "));
        assertTrue(toStringResult.contains("a=Option [opt=a, description=Option alpha, changed=true]"));
        assertTrue(toStringResult.contains("b=Option [opt=b, description=Option beta, changed=true]"));
        assertTrue(toStringResult.contains("] [ long "));
        assertTrue(toStringResult.contains("alpha=Option [opt=a, longOpt=alpha, description=Option alpha, changed=true]"));
        assertTrue(toStringResult.contains("]"));
    }

    public void testAddOptionGroupOptionRequiredIsFalse() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "arg1", false, "desc1");
        opt1.setRequired(true); // Should be ignored when added to group
        group.addOption(opt1);
        options.addOptionGroup(group);
        
        Option addedOpt = options.getOption("a");
        assertFalse(addedOpt.isRequired());
    }

     public void testAddOptionWithSameKeyTwiceUpdatesOption() throws Exception {
        Options options = new Options();
        options.addOption("a", "arg", false, "description1");
        options.addOption("a", "arg", true, "description2");
        
        Option option = options.getOption("a");
        assertTrue(option.hasArg());
        assertEquals("description2", option.getDescription());
    }

    public void testAddOptionGroupWithRequiredOptionNotAddedToRequiredListSeparately() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option opt1 = new Option("a", "arg1", false, "desc1");
        group.addOption(opt1);
        options.addOptionGroup(group);

        assertFalse(options.getRequiredOptions().contains("a"));
        assertTrue(options.getRequiredOptions().contains(group)); // The group itself is added
    }
    
    public void testGetRequiredOptionsReturnsUnmodifiableList() throws Exception {
        Options options = new Options();
        Option opt = new Option("r", "requiredOpt", true, "A required option");
        opt.setRequired(true);
        options.addOption(opt);
        List required = options.getRequiredOptions();
        try {
            required.add("new");
            fail("Should not be able to modify the list.");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
}
```