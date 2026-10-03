package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UtilAI5Test {

    @Test
    public void testStripLeadingHyphens() {
        assertNull(Util.stripLeadingHyphens(null));
        assertEquals("foo", Util.stripLeadingHyphens("-foo"));
        assertEquals("foo", Util.stripLeadingHyphens("--foo"));
        assertEquals("foo", Util.stripLeadingHyphens("foo"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes() {
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("\"foo\""));
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("\"foo"));
        assertEquals("foo", Util.stripLeadingAndTrailingQuotes("foo\""));
    }
}
