package org.apache.commons.cli;

import junit.framework.TestCase;

public class UtilTest extends TestCase {
    public void testStripLeadingHyphensNull() throws Exception {
        assertNull(Util.stripLeadingHyphens(null));
    }

    public void testStripLeadingHyphensEmpty() throws Exception {
        assertEquals("", Util.stripLeadingHyphens(""));
    }

    public void testStripLeadingHyphensUnchanged() throws Exception {
        assertEquals("word", Util.stripLeadingHyphens("word"));
    }

    public void testStripLeadingHyphensOneHyphen() throws Exception {
        assertEquals("", Util.stripLeadingHyphens("-"));
    }

    public void testStripLeadingHyphensTwoHyphens() throws Exception {
        assertEquals("", Util.stripLeadingHyphens("--"));
    }

    public void testStripLeadingHyphensOneBeforeText() throws Exception {
        assertEquals("word", Util.stripLeadingHyphens("-word"));
    }

    public void testStripLeadingHyphensTwoBeforeText() throws Exception {
        assertEquals("word", Util.stripLeadingHyphens("--word"));
    }

    public void testStripLeadingHyphensLeavesThirdHyphen() throws Exception {
        assertEquals("-word", Util.stripLeadingHyphens("---word"));
    }

    public void testStripLeadingHyphensOnlyRemovesLeadingHyphens() throws Exception {
        assertEquals("word-tail", Util.stripLeadingHyphens("--word-tail"));
    }

    public void testStripQuotesEmpty() throws Exception {
        assertEquals("", Util.stripLeadingAndTrailingQuotes(""));
    }

    public void testStripQuotesSingleQuote() throws Exception {
        assertEquals("\"", Util.stripLeadingAndTrailingQuotes("\""));
    }

    public void testStripQuotesRemovesPair() throws Exception {
        assertEquals("word", Util.stripLeadingAndTrailingQuotes("\"word\""));
    }

    public void testStripQuotesPreservesInteriorQuote() throws Exception {
        assertEquals("\"a\"b\"", Util.stripLeadingAndTrailingQuotes("\"a\"b\""));
    }

    public void testStripQuotesPreservesMissingLeadingQuote() throws Exception {
        assertEquals("word\"", Util.stripLeadingAndTrailingQuotes("word\""));
    }

    public void testStripQuotesPreservesMissingTrailingQuote() throws Exception {
        assertEquals("\"word", Util.stripLeadingAndTrailingQuotes("\"word"));
    }

    public void testStripQuotesPreservesUnquotedText() throws Exception {
        assertEquals("word", Util.stripLeadingAndTrailingQuotes("word"));
    }

    public void testStripQuotesRemovesPairAroundEmptyText() throws Exception {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\"\""));
    }
}
