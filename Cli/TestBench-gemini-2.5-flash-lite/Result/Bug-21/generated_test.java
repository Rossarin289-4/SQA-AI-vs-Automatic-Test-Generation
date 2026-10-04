package org.apache.commons.cli2;

import junit.framework.TestCase;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.GroupImpl;
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
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.resource.ResourceConstants;
import org.apache.commons.cli2.resource.ResourceHelper;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.OptionException;

public class WriteableCommandLineTest extends TestCase {

    private Option createDummyOption(String trigger) {
        return new GroupImpl(Collections.emptyList(), "dummy", "dummy", 0, Integer.MAX_VALUE, false);
    }


    public void testAddOption() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        assertTrue(wcl.hasOption(dummyOption));
    }

    public void testAddValue() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        wcl.addValue(dummyOption, "value1");
        assertEquals("value1", ((List) wcl.getValues(dummyOption, null)).get(0));
    }

    public void testAddValue_multiple() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        wcl.addValue(dummyOption, "value1");
        wcl.addValue(dummyOption, "value2");
        assertEquals(2, ((List) wcl.getValues(dummyOption, null)).size());
        assertEquals("value2", ((List) wcl.getValues(dummyOption, null)).get(1));
    }

    public void testAddSwitch() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        wcl.addSwitch(dummyOption, true);
        assertEquals(Boolean.TRUE, wcl.getSwitch(dummyOption, null));
    }

    public void testAddSwitch_false() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        wcl.addSwitch(dummyOption, false);
        assertEquals(Boolean.FALSE, wcl.getSwitch(dummyOption, null));
    }

    public void testAddSwitch_alreadySet() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        wcl.addSwitch(dummyOption, true);
        try {
            wcl.addSwitch(dummyOption, false);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }

    public void testGetUndefaultedValues() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        wcl.addValue(dummyOption, "value1");
        List<Object> values = wcl.getUndefaultedValues(dummyOption);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    public void testGetUndefaultedValues_noValues() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        List<Object> values = wcl.getUndefaultedValues(dummyOption);
        assertTrue(values.isEmpty());
    }

    public void testSetDefaultValues() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        List<Object> defaults = new ArrayList<>();
        defaults.add("default1");
        wcl.setDefaultValues(dummyOption, defaults);
        assertEquals("default1", ((List) wcl.getValues(dummyOption, null)).get(0));
    }

    public void testSetDefaultValues_andAddValue() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        List<Object> defaults = new ArrayList<>();
        defaults.add("default1");
        wcl.setDefaultValues(dummyOption, defaults);
        wcl.addValue(dummyOption, "value1");
        List<Object> values = wcl.getValues(dummyOption, null);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("default1", values.get(1));
    }

    public void testSetDefaultSwitch() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        wcl.setDefaultSwitch(dummyOption, Boolean.TRUE);
        assertEquals(Boolean.TRUE, wcl.getSwitch(dummyOption, null));
    }

    public void testSetDefaultSwitch_null() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        wcl.setDefaultSwitch(dummyOption, null);
        assertNull(wcl.getSwitch(dummyOption, null));
    }

    public void testAddProperty_option() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addProperty(dummyOption, "prop1", "value1");
        assertEquals("value1", wcl.getProperty(dummyOption, "prop1", "default"));
    }

    public void testAddProperty_option_replace() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addProperty(dummyOption, "prop1", "value1");
        wcl.addProperty(dummyOption, "prop1", "value2");
        assertEquals("value2", wcl.getProperty(dummyOption, "prop1", "default"));
    }

    public void testAddProperty_defaultOption() {
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), args);
        wcl.addProperty("prop1", "value1");
        assertEquals("value1", wcl.getProperty("prop1"));
    }

    public void testAddProperty_defaultOption_replace() {
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), args);
        wcl.addProperty("prop1", "value1");
        wcl.addProperty("prop1", "value2");
        assertEquals("value2", wcl.getProperty("prop1"));
    }

    public void testGetProperties_option() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addProperty(dummyOption, "prop1", "value1");
        wcl.addProperty(dummyOption, "prop2", "value2");
        Set<String> props = wcl.getProperties(dummyOption);
        assertTrue(props.contains("prop1"));
        assertTrue(props.contains("prop2"));
        assertEquals(2, props.size());
    }

    public void testGetProperties_defaultOption() {
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), args);
        wcl.addProperty("prop1", "value1");
        Set<String> props = wcl.getProperties();
        assertTrue(props.contains("prop1"));
        assertEquals(1, props.size());
    }



    public void testLooksLikeOption_reentrant() {
        // Mock a root option that has a prefix and can process
        Option mockRootOption = new GroupImpl(Collections.emptyList(), "root", "root", 0, Integer.MAX_VALUE, false) {
            @Override
            public Set getPrefixes() {
                return Collections.singleton("-");
            }
            @Override
            public boolean canProcess(WriteableCommandLine commandLine, String arg) {
                return arg.equals("-reentrant");
            }
        };
        
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(mockRootOption, args);
        wcl.setCurrentOption(mockRootOption);
        assertTrue(wcl.looksLikeOption("-reentrant")); // Should be true due to canProcess
        assertFalse(wcl.looksLikeOption("normal_arg")); // Should be false
    }

    public void testToString() {
        List<String> args = new ArrayList<>();
        args.add("arg1");
        args.add("arg with space");
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), args);
        assertEquals("arg1 \"arg with space\"", wcl.toString());
    }

    public void testToString_empty() {
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), args);
        assertEquals("", wcl.toString());
    }

    public void testGetOptions() {
        Option dummyOption1 = createDummyOption("opt1");
        Option dummyOption2 = createDummyOption("opt2");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption1, args);
        wcl.addOption(dummyOption1);
        wcl.addOption(dummyOption2);
        List<Option> options = wcl.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(dummyOption1));
        assertTrue(options.contains(dummyOption2));
    }

    public void testGetOptions_empty() {
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), args);
        List<Option> options = wcl.getOptions();
        assertTrue(options.isEmpty());
    }

    public void testGetOptionTriggers() {
        Option dummyOption1 = createDummyOption("opt1");
        Option dummyOption2 = createDummyOption("opt2");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption1, args);
        wcl.addOption(dummyOption1);
        wcl.addOption(dummyOption2);
        Set<String> triggers = wcl.getOptionTriggers();
        assertTrue(triggers.contains("opt1"));
        assertTrue(triggers.contains("opt2"));
        assertEquals(2, triggers.size());
    }

    public void testGetOptionTriggers_empty() {
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(createDummyOption("root"), args);
        Set<String> triggers = wcl.getOptionTriggers();
        assertTrue(triggers.isEmpty());
    }



    public void testGetSwitch_withDefault() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        assertEquals(Boolean.TRUE, wcl.getSwitch(dummyOption, Boolean.TRUE));
    }

    public void testGetSwitch_withDefaultNull() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        assertNull(wcl.getSwitch(dummyOption, null));
    }

    public void testGetSwitch_withDefaultAndDefaultSwitch() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        wcl.setDefaultSwitch(dummyOption, Boolean.TRUE);
        assertEquals(Boolean.TRUE, wcl.getSwitch(dummyOption, Boolean.FALSE)); // default is overridden by defaultSwitch
    }


    public void testGetValues_withDefaultValues() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        List<Object> defaults = new ArrayList<>();
        defaults.add("default1");
        defaults.add("default2");
        wcl.setDefaultValues(dummyOption, defaults);
        List<Object> values = wcl.getValues(dummyOption, null);
        assertEquals(2, values.size());
        assertEquals("default1", values.get(0));
        assertEquals("default2", values.get(1));
    }

    public void testGetValues_withDefaultValues_andAddedValues() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        List<Object> defaults = new ArrayList<>();
        defaults.add("default1");
        defaults.add("default2");
        wcl.setDefaultValues(dummyOption, defaults);
        wcl.addValue(dummyOption, "value1");
        List<Object> values = wcl.getValues(dummyOption, null);
        assertEquals(3, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("default1", values.get(1));
        assertEquals("default2", values.get(2));
    }

    public void testGetValues_withDefaultValues_andAddedValues_moreDefaultsThanValues() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        List<Object> defaults = new ArrayList<>();
        defaults.add("default1");
        defaults.add("default2");
        defaults.add("default3");
        wcl.setDefaultValues(dummyOption, defaults);
        wcl.addValue(dummyOption, "value1");
        List<Object> values = wcl.getValues(dummyOption, null);
        assertEquals(4, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("default1", values.get(1));
        assertEquals("default2", values.get(2));
        assertEquals("default3", values.get(3));
    }

    public void testGetValues_withDefaultValues_passedToMethod() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        List<Object> methodDefaults = new ArrayList<>();
        methodDefaults.add("methodDefault1");
        List<Object> values = wcl.getValues(dummyOption, methodDefaults);
        assertEquals(1, values.size());
        assertEquals("methodDefault1", values.get(0));
    }

    public void testGetValues_withDefaultValues_passedToMethodAndDefaultValues() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        List<Object> defaults = new ArrayList<>();
        defaults.add("default1");
        wcl.setDefaultValues(dummyOption, defaults);
        List<Object> methodDefaults = new ArrayList<>();
        methodDefaults.add("methodDefault1");
        List<Object> values = wcl.getValues(dummyOption, methodDefaults);
        assertEquals(1, values.size());
        assertEquals("methodDefault1", values.get(0)); // method defaults take precedence
    }

    public void testGetValues_withDefaultValues_passedToMethodAndDefaultValues_andAddedValues() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        wcl.addOption(dummyOption);
        List<Object> defaults = new ArrayList<>();
        defaults.add("default1");
        wcl.setDefaultValues(dummyOption, defaults);
        wcl.addValue(dummyOption, "value1");
        List<Object> methodDefaults = new ArrayList<>();
        methodDefaults.add("methodDefault1");
        List<Object> values = wcl.getValues(dummyOption, methodDefaults);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("methodDefault1", values.get(1)); // method defaults take precedence
    }

    public void testGetCurrentOption() {
        Option dummyOption = createDummyOption("test");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption, args);
        assertNull(wcl.getCurrentOption());
        wcl.setCurrentOption(dummyOption);
        assertSame(dummyOption, wcl.getCurrentOption());
    }

    public void testGetOption() {
        Option dummyOption1 = createDummyOption("opt1");
        Option dummyOption2 = createDummyOption("opt2");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption1, args);
        wcl.addOption(dummyOption1);
        wcl.addOption(dummyOption2);
        assertEquals(dummyOption1, wcl.getOption("opt1"));
        assertEquals(dummyOption2, wcl.getOption("opt2"));
    }

    public void testGetOption_notFound() {
        Option dummyOption1 = createDummyOption("opt1");
        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(dummyOption1, args);
        wcl.addOption(dummyOption1);
        assertNull(wcl.getOption("nonexistent"));
    }

    public void testAddOption_withParent() {
        Option parentOption = new GroupImpl(Collections.emptyList(), "parent", "parent", 0, Integer.MAX_VALUE, false);
        Option childOption = new GroupImpl(Collections.emptyList(), "child", "child", 0, Integer.MAX_VALUE, false);
        childOption.setParent(parentOption);

        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(parentOption, args);
        wcl.addOption(childOption);

        assertTrue(wcl.hasOption(childOption));
        assertTrue(wcl.hasOption(parentOption)); // parent should also be added
        assertEquals(2, wcl.getOptions().size());
    }

    public void testAddOption_withGrandparent() {
        Option grandParentOption = new GroupImpl(Collections.emptyList(), "grandparent", "grandparent", 0, Integer.MAX_VALUE, false);
        Option parentOption = new GroupImpl(Collections.emptyList(), "parent", "parent", 0, Integer.MAX_VALUE, false);
        Option childOption = new GroupImpl(Collections.emptyList(), "child", "child", 0, Integer.MAX_VALUE, false);

        parentOption.setParent(grandParentOption);
        childOption.setParent(parentOption);

        List<String> args = new ArrayList<>();
        WriteableCommandLine wcl = new WriteableCommandLineImpl(grandParentOption, args);
        wcl.addOption(childOption);

        assertTrue(wcl.hasOption(childOption));
        assertTrue(wcl.hasOption(parentOption));
        assertTrue(wcl.hasOption(grandParentOption));
        assertEquals(3, wcl.getOptions().size());
    }



    

    public void testGetPreferredName() {
        Option dummyOption = new GroupImpl(Collections.emptyList(), "myname", "desc", 0, 0, false);
        assertEquals("myname", dummyOption.getPreferredName());
    }

    public void testGetDescription() {
        Option dummyOption = new GroupImpl(Collections.emptyList(), "name", "mydescription", 0, 0, false);
        assertEquals("mydescription", dummyOption.getDescription());
    }

    public void testAppendUsage() {
        Option dummyOption = new GroupImpl(Collections.emptyList(), "name", "description", 0, 0, false);
        StringBuffer buffer = new StringBuffer();
        Set<DisplaySetting> settings = new HashSet<>();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        dummyOption.appendUsage(buffer, settings, null);
        // For a simple dummy group, it might append its name.
        assertTrue(buffer.toString().contains("name"));
    }

    public void testHelpLines() {
        Option dummyOption = new GroupImpl(Collections.emptyList(), "name", "description", 0, 0, false);
        Set<DisplaySetting> settings = new HashSet<>();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        List<HelpLine> lines = dummyOption.helpLines(0, settings, null);
        assertFalse(lines.isEmpty()); // Should generate at least one line for the group itself
        assertTrue(lines.get(0).toString().contains("name"));
    }


    public void testFindOption() {
        Option childOption1 = createDummyOption("child1");
        Option childOption2 = createDummyOption("child2");
        List<Option> options = new ArrayList<>();
        options.add(childOption1);
        options.add(childOption2);
        Group group = new GroupImpl(options, "groupName", "groupDesc", 0, 1, false);
        assertEquals(childOption1, group.findOption("child1"));
        assertEquals(childOption2, group.findOption("child2"));
        assertNull(group.findOption("nonexistent"));
    }

    public void testMinimumAndMaximum() {
        Group group = new GroupImpl(Collections.emptyList(), "name", "desc", 2, 4, false);
        assertEquals(2, group.getMinimum());
        assertEquals(4, group.getMaximum());
    }

    public void testIsRequired() {
        Group groupRequiredMin = new GroupImpl(Collections.emptyList(), "name", "desc", 1, 4, false);
        assertTrue(groupRequiredMin.isRequired()); // Minimum > 0 makes it required

        Group groupNotRequiredMin = new GroupImpl(Collections.emptyList(), "name", "desc", 0, 4, false);
        assertFalse(groupNotRequiredMin.isRequired()); // Minimum == 0 makes it not required
        
        Group groupRequiredExplicit = new GroupImpl(Collections.emptyList(), "name", "desc", 0, 4, true);
        // According to the source code `return (getParent() == null || super.isRequired()) && getMinimum() > 0;`
        // so even if `super.isRequired()` is true, if `getMinimum() == 0`, it returns false.
        assertFalse(groupRequiredExplicit.isRequired()); 
    }
    
    public void testDefaults() {
        Option childOption = createDummyOption("child");
        List<Option> options = new ArrayList<>();
        options.add(childOption);
        Group group = new GroupImpl(options, "groupName", "groupDesc", 0, 1, false);
        
        WriteableCommandLine wcl = new WriteableCommandLineImpl(group, new ArrayList<>());
        group.defaults(wcl);
        // We can't assert specific state changes without knowing how `childOption.defaults` works.
        // This test primarily ensures the method call itself doesn't throw an exception.
        assertTrue(true); 
    }

    // Helper for ReverseStringComparator
}


