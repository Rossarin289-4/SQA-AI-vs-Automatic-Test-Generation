package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OptionTest extends TestCase {
    public void testConstructorDefaults() throws Exception {
        Option option = new Option("a", "desc");
        assertEquals("a", option.getOpt());
        assertEquals("desc", option.getDescription());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        assertFalse(option.hasArg());
        assertFalse(option.hasArgs());
    }

    public void testConstructorWithArgument() throws Exception {
        Option option = new Option("a", true, "desc");
        assertEquals(1, option.getArgs());
        assertTrue(option.hasArg());
        assertFalse(option.hasArgs());
    }

    public void testGetIdForSingleCharacter() throws Exception {
        assertEquals((int) 'x', new Option("x", "desc").getId());
    }

    public void testSetAndGetType() throws Exception {
        Option option = new Option("a", "desc");
        option.setType(Integer.class);
        assertEquals(Integer.class, option.getType());
    }

    public void testLongOptionState() throws Exception {
        Option option = new Option("a", "desc");
        assertFalse(option.hasLongOpt());
        option.setLongOpt("alpha");
        assertTrue(option.hasLongOpt());
        assertEquals("alpha", option.getLongOpt());
        option.setLongOpt(null);
        assertFalse(option.hasLongOpt());
    }

    public void testOptionalArgumentState() throws Exception {
        Option option = new Option("a", "desc");
        assertFalse(option.hasOptionalArg());
        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());
    }

    public void testRequiredAndDescriptionState() throws Exception {
        Option option = new Option("a", "old");
        assertFalse(option.isRequired());
        option.setRequired(true);
        option.setDescription("new");
        assertTrue(option.isRequired());
        assertEquals("new", option.getDescription());
    }

    public void testArgumentNameBoundaries() throws Exception {
        Option option = new Option("a", "desc");
        assertFalse(option.hasArgName());
        option.setArgName("");
        assertFalse(option.hasArgName());
        option.setArgName("v");
        assertTrue(option.hasArgName());
        assertEquals("v", option.getArgName());
    }

    public void testArgumentCountBoundaries() throws Exception {
        Option option = new Option("a", "desc");
        option.setArgs(0);
        assertFalse(option.hasArg());
        assertFalse(option.hasArgs());
        option.setArgs(1);
        assertTrue(option.hasArg());
        assertFalse(option.hasArgs());
        option.setArgs(2);
        assertTrue(option.hasArgs());
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArg());
        assertTrue(option.hasArgs());
    }

    public void testSeparatorBoundaries() throws Exception {
        Option option = new Option("a", "desc");
        assertFalse(option.hasValueSeparator());
        option.setValueSeparator((char) 0);
        assertFalse(option.hasValueSeparator());
        option.setValueSeparator('=');
        assertTrue(option.hasValueSeparator());
        assertEquals('=', option.getValueSeparator());
    }

    public void testEmptyValueAccessors() throws Exception {
        Option option = new Option("a", "desc");
        assertNull(option.getValue());
        assertNull(option.getValues());
        assertEquals("fallback", option.getValue("fallback"));
        assertEquals(0, option.getValuesList().size());
    }

    public void testCloneHasIndependentValuesList() throws Exception {
        Option option = new Option("a", true, "desc");
        option.getValuesList().add("first");
        Option copy = (Option) option.clone();
        assertEquals("first", copy.getValue());
        copy.getValuesList().add("second");
        assertEquals(1, option.getValuesList().size());
        assertEquals(2, copy.getValuesList().size());
    }

    public void testEqualityAndHashCodeUseOptionNames() throws Exception {
        Option first = new Option("a", "desc");
        Option same = new Option("a", "other");
        Option otherLong = new Option("a", "alpha", false, "desc");
        assertTrue(first.equals(same));
        assertEquals(first.hashCode(), same.hashCode());
        assertFalse(first.equals(otherLong));
        assertFalse(first.equals(null));
    }

    public void testStringRepresentationIncludesOptionState() throws Exception {
        Option option = new Option("a", "alpha", true, "desc");
        String text = option.toString();
        assertTrue(text.indexOf("a") >= 0);
        assertTrue(text.indexOf("alpha") >= 0);
        assertTrue(text.indexOf("[ARG]") >= 0);
        assertTrue(text.indexOf("desc") >= 0);
    }

    public void testAddValueIsUnsupported() throws Exception {
        Option option = new Option("a", true, "desc");
        try {
            option.addValue("v");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    public void testBuilderCreatesConfiguredOption() throws Exception {
        Option option = OptionBuilder.withLongOpt("alpha")
                .withDescription("desc")
                .withArgName("value")
                .withValueSeparator(':')
                .withType(Integer.class)
                .create('a');
        assertEquals("a", option.getOpt());
        assertEquals("alpha", option.getLongOpt());
        assertEquals("desc", option.getDescription());
        assertEquals("value", option.getArgName());
        assertEquals(':', option.getValueSeparator());
        assertEquals(Integer.class, option.getType());
    }
}
