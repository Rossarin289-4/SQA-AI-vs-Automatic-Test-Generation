package org.apache.commons.cli;

import junit.framework.TestCase;

public class OptionBuilderTest extends TestCase {
    public void testCreateCharacterSetsOptionAndDescription() throws Exception {
        Option option = OptionBuilder.withDescription("desc").create('x');
        assertEquals("x", option.getOpt());
        assertEquals("desc", option.getDescription());
    }

    public void testCreateCharacterResetsLongOptionAndDescription() throws Exception {
        OptionBuilder.withLongOpt("before").withDescription("before");
        Option first = OptionBuilder.create('a');
        Option second = OptionBuilder.create('b');
        assertEquals("before", first.getLongOpt());
        assertNull(second.getLongOpt());
        assertNull(second.getDescription());
    }

    public void testLongOptionAndArgumentSettings() throws Exception {
        Option option = OptionBuilder.withLongOpt("output").hasArg().create('o');
        assertEquals("output", option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals(1, option.getArgs());
    }

    public void testWithLongOptReplacesPreviousValue() throws Exception {
        Option option = OptionBuilder.withLongOpt("new").create('n');
        assertEquals("new", option.getLongOpt());
    }

    public void testHasArgEnablesOneArgument() throws Exception {
        Option option = OptionBuilder.hasArg().create('a');
        assertTrue(option.hasArg());
        assertEquals(1, option.getArgs());
    }

    public void testArgNameIsAppliedAndReset() throws Exception {
        Option first = OptionBuilder.withArgName("file").hasArg().create('f');
        Option second = OptionBuilder.hasArg().create('g');
        assertEquals("file", first.getArgName());
        assertEquals("arg", second.getArgName());
    }

    public void testIsRequiredSetsRequiredFlag() throws Exception {
        Option option = OptionBuilder.isRequired().create('r');
        assertTrue(option.isRequired());
    }

    public void testValueSeparatorCharacterIsApplied() throws Exception {
        Option option = OptionBuilder.withValueSeparator(':').create('v');
        assertEquals(':', option.getValueSeparator());
        assertTrue(option.hasValueSeparator());
    }

    public void testHasArgsAllowsUnlimitedValues() throws Exception {
        Option option = OptionBuilder.hasArgs().create('m');
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        assertTrue(option.hasArgs());
    }

    public void testHasOptionalArgEnablesOptionalArgument() throws Exception {
        Option option = OptionBuilder.hasOptionalArg().create('p');
        assertTrue(option.hasOptionalArg());
        assertTrue(option.hasArg());
        assertEquals(1, option.getArgs());
    }

    public void testHasOptionalArgsAllowsUnlimitedOptionalArguments() throws Exception {
        Option option = OptionBuilder.hasOptionalArgs().create('q');
        assertTrue(option.hasOptionalArg());
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    public void testTypeAndDescriptionAreApplied() throws Exception {
        Object type = new Object();
        Option option = OptionBuilder.withType(type).withDescription("typed").create('t');
        assertSame(type, option.getType());
        assertEquals("typed", option.getDescription());
    }

    public void testCreateWithNoArgumentSettingsHasNoArgument() throws Exception {
        Option option = OptionBuilder.create('z');
        assertFalse(option.hasArg());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    public void testCreateResetsRequiredAndOptionalArgumentFlags() throws Exception {
        OptionBuilder.isRequired().hasOptionalArg().create('a');
        Option option = OptionBuilder.create('b');
        assertFalse(option.isRequired());
        assertFalse(option.hasOptionalArg());
    }

    public void testCreateResetsValueSeparator() throws Exception {
        OptionBuilder.withValueSeparator('=').create('a');
        Option option = OptionBuilder.create('b');
        assertEquals((char) 0, option.getValueSeparator());
        assertFalse(option.hasValueSeparator());
    }

    public void testHasArgAfterHasArgsSelectsOneArgument() throws Exception {
        Option option = OptionBuilder.hasArgs().hasArg().create('h');
        assertEquals(1, option.getArgs());
        assertTrue(option.hasArg());
    }

    public void testRepeatedCreationDoesNotRetainType() throws Exception {
        Object type = new Object();
        OptionBuilder.withType(type).create('a');
        Option option = OptionBuilder.create('b');
        assertNull(option.getType());
    }
}
