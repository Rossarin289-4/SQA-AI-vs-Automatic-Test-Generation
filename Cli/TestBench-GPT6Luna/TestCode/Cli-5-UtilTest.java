package org.apache.commons.cli;

import junit.framework.TestCase;

public class UtilTest extends TestCase {
    public void testStripLeadingHyphensNull() throws Exception {
        assertEquals(null, Util.stripLeadingHyphens(null));
    }

    public void testStripLeadingHyphensEmpty() throws Exception {
        assertEquals("", Util.stripLeadingHyphens(""));
    }

    public void testStripLeadingHyphensNoHyphen() throws Exception {
        assertEquals("word", Util.stripLeadingHyphens("word"));
    }

    public void testStripLeadingHyphensSingleHyphen() throws Exception {
        assertEquals("word", Util.stripLeadingHyphens("-word"));
    }

    public void testStripLeadingHyphensDoubleHyphen() throws Exception {
        assertEquals("word", Util.stripLeadingHyphens("--word"));
    }

    public void testStripLeadingHyphensMultipleHyphens() throws Exception {
        assertEquals("-word", Util.stripLeadingHyphens("---word"));
    }

    public void testStripLeadingHyphensOnlyOneHyphen() throws Exception {
        assertEquals("", Util.stripLeadingHyphens("-"));
    }

    public void testStripLeadingHyphensOnlyTwoHyphens() throws Exception {
        assertEquals("", Util.stripLeadingHyphens("--"));
    }

    public void testStripLeadingHyphensOnlyThreeHyphens() throws Exception {
        assertEquals("-", Util.stripLeadingHyphens("---"));
    }

    public void testStripLeadingHyphensEmbeddedHyphen() throws Exception {
        assertEquals("a-b", Util.stripLeadingHyphens("a-b"));
    }

    public void testStripLeadingAndTrailingQuotesEmpty() throws Exception {
        assertEquals("", Util.stripLeadingAndTrailingQuotes(""));
    }

    public void testStripLeadingAndTrailingQuotesNoQuotes() throws Exception {
        assertEquals("word", Util.stripLeadingAndTrailingQuotes("word"));
    }

    public void testStripLeadingAndTrailingQuotesBothQuotes() throws Exception {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two\""));
    }

    public void testStripLeadingAndTrailingQuotesLeadingOnly() throws Exception {
        assertEquals("word", Util.stripLeadingAndTrailingQuotes("\"word"));
    }

    public void testStripLeadingAndTrailingQuotesTrailingOnly() throws Exception {
        assertEquals("word", Util.stripLeadingAndTrailingQuotes("word\""));
    }

    public void testStripLeadingAndTrailingQuotesSingleQuote() throws Exception {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\""));
    }

    public void testStripLeadingAndTrailingQuotesTwoQuotes() throws Exception {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\"\""));
    }

    public void testStripLeadingAndTrailingQuotesThreeQuotes() throws Exception {
        assertEquals("\"", Util.stripLeadingAndTrailingQuotes("\"\"\""));
    }

    public void testStripLeadingAndTrailingQuotesInteriorQuote() throws Exception {
        assertEquals("a\"b", Util.stripLeadingAndTrailingQuotes("a\"b"));
    }

    public void testStripLeadingAndTrailingQuotesWhitespace() throws Exception {
        assertEquals(" word ", Util.stripLeadingAndTrailingQuotes(" word "));
    }
}
