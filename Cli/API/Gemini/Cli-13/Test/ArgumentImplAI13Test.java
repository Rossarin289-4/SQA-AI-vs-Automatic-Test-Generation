package org.apache.commons.cli2.option;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArgumentImplAI13Test {

    @Test
    public void testGettersAndBasicProperties() {
        final List defaults = new ArrayList();
        defaults.add("def1");

        final ArgumentImpl arg = new ArgumentImpl(
            "testArg",
            "A test argument",
            1,
            2,
            '\0',
            '\0',
            null,
            "--",
            defaults,
            0
        );

        assertEquals("testArg", arg.getPreferredName());
        assertEquals("A test argument", arg.getDescription());
        assertEquals(1, arg.getMinimum());
        assertEquals(2, arg.getMaximum());
        assertEquals(defaults, arg.getDefaultValues());
        assertNotNull(arg.getPrefixes());
        assertNotNull(arg.getTriggers());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinExceedsMaxThrowsException() {
        new ArgumentImpl(
            "testArg",
            "A test argument",
            3,
            2,
            '\0',
            '\0',
            null,
            "--",
            null,
            0
        );
    }

    @Test
    public void testStripBoundaryQuotes() {
        final ArgumentImpl arg = new ArgumentImpl(
            "testArg",
            "A test argument",
            0,
            1,
            '\0',
            '\0',
            null,
            "--",
            null,
            0
        );

        assertEquals("unquoted", arg.stripBoundaryQuotes("unquoted"));
        assertEquals("quoted", arg.stripBoundaryQuotes("\"quoted\""));
        assertEquals("\"partial", arg.stripBoundaryQuotes("\"partial"));
    }
}
