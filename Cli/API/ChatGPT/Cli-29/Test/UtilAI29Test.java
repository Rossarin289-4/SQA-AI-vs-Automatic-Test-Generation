package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UtilAI29Test
{
    @Test
    public void testStripLeadingHyphens()
    {
        assertNull(Util.stripLeadingHyphens(null));
        assertEquals("foo", Util.stripLeadingHyphens("-foo"));
        assertEquals("foo", Util.stripLeadingHyphens("--foo"));
        assertEquals("foo", Util.stripLeadingHyphens("foo"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotes()
    {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two\""));
        assertEquals("\"one two", Util.stripLeadingAndTrailingQuotes("\"one two"));
        assertEquals("one", Util.stripLeadingAndTrailingQuotes("one"));
    }
}
