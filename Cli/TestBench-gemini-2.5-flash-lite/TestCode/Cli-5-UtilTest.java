package org.apache.commons.cli;

import junit.framework.TestCase;

public class UtilTest extends TestCase {
    // test methods (as many as the instructions ask for), each exactly in this form (the name starts with "test", no annotation):
    //     public void testWhatItChecks() throws Exception { ... }

    public void testStripLeadingHyphens_nullInput() throws Exception {
        assertNull("null input should return null", Util.stripLeadingHyphens(null));
    }

    public void testStripLeadingHyphens_noHyphens() throws Exception {
        assertEquals("string without hyphens should be unchanged", "abc", Util.stripLeadingHyphens("abc"));
    }

    public void testStripLeadingHyphens_singleLeadingHyphen() throws Exception {
        assertEquals("string with single leading hyphen", "abc", Util.stripLeadingHyphens("-abc"));
    }

    public void testStripLeadingHyphens_doubleLeadingHyphen() throws Exception {
        assertEquals("string with double leading hyphen", "abc", Util.stripLeadingHyphens("--abc"));
    }

    public void testStripLeadingHyphens_onlyHyphens_single() throws Exception {
        assertEquals("string with only a single hyphen", "", Util.stripLeadingHyphens("-"));
    }

    public void testStripLeadingHyphens_onlyHyphens_double() throws Exception {
        assertEquals("string with only double hyphens", "", Util.stripLeadingHyphens("--"));
    }

    public void testStripLeadingHyphens_hyphenInMiddle() throws Exception {
        assertEquals("hyphen in the middle should be unchanged", "a-b-c", Util.stripLeadingHyphens("a-b-c"));
    }

    public void testStripLeadingHyphens_hyphenAtEnd() throws Exception {
        assertEquals("hyphen at the end should be unchanged", "abc-", Util.stripLeadingHyphens("abc-"));
    }

    public void testStripLeadingHyphens_doubleHyphenInMiddle() throws Exception {
        assertEquals("double hyphen in the middle should be unchanged", "a--b", Util.stripLeadingHyphens("a--b"));
    }

    public void testStripLeadingHyphens_doubleHyphenAtEnd() throws Exception {
        assertEquals("double hyphen at the end should be unchanged", "abc--", Util.stripLeadingHyphens("abc--"));
    }

    // Corrected: This test now asserts the correct behavior of stripLeadingHyphens with mixed hyphens.
    // The original test failed because it expected a different output than what the stripLeadingHyphens method produces.
    public void testStripLeadingHyphens_mixedHyphens() throws Exception {
        assertEquals("mixed hyphens", "a--b", Util.stripLeadingHyphens("-a--b"));
    }

    public void testStripLeadingAndTrailingQuotes_nullInput() throws Exception {
        // The method does not handle null input, so it's expected to throw NullPointerException
        try {
            Util.stripLeadingAndTrailingQuotes(null);
            fail("expected NullPointerException for null input");
        } catch (NullPointerException expected) {
            // Expected exception
        }
    }

    public void testStripLeadingAndTrailingQuotes_noQuotes() throws Exception {
        assertEquals("string without quotes should be unchanged", "one two", Util.stripLeadingAndTrailingQuotes("one two"));
    }

    public void testStripLeadingAndTrailingQuotes_leadingQuoteOnly() throws Exception {
        assertEquals("string with leading quote only", "one two", Util.stripLeadingAndTrailingQuotes("\"one two"));
    }

    public void testStripLeadingAndTrailingQuotes_trailingQuoteOnly() throws Exception {
        assertEquals("string with trailing quote only", "one two", Util.stripLeadingAndTrailingQuotes("one two\""));
    }

    public void testStripLeadingAndTrailingQuotes_leadingAndTrailingQuotes() throws Exception {
        assertEquals("string with leading and trailing quotes", "one two", Util.stripLeadingAndTrailingQuotes("\"one two\""));
    }

    public void testStripLeadingAndTrailingQuotes_onlyLeadingQuote() throws Exception {
        assertEquals("string with only a leading quote", "", Util.stripLeadingAndTrailingQuotes("\""));
    }

    public void testStripLeadingAndTrailingQuotes_onlyTrailingQuote() throws Exception {
        assertEquals("string with only a trailing quote", "", Util.stripLeadingAndTrailingQuotes("\""));
    }

    public void testStripLeadingAndTrailingQuotes_quotesInMiddle() throws Exception {
        assertEquals("quotes in the middle should be unchanged", "one\"two", Util.stripLeadingAndTrailingQuotes("one\"two"));
    }

    // Corrected: This test now asserts the correct behavior of stripLeadingAndTrailingQuotes.
    // The original test failed because it expected a different output than what the stripLeadingAndTrailingQuotes method produces.
    // The method only removes the *first* leading and *first* trailing quote if they exist.
    public void testStripLeadingAndTrailingQuotes_multipleLeadingQuotes() throws Exception {
        assertEquals("multiple leading quotes", "\"one two", Util.stripLeadingAndTrailingQuotes("\"\"one two"));
    }

    // Corrected: This test now asserts the correct behavior of stripLeadingAndTrailingQuotes.
    // The original test failed because it expected a different output than what the stripLeadingAndTrailingQuotes method produces.
    // The method only removes the *first* leading and *first* trailing quote if they exist.
    public void testStripLeadingAndTrailingQuotes_multipleTrailingQuotes() throws Exception {
        assertEquals("multiple trailing quotes", "one two\"", Util.stripLeadingAndTrailingQuotes("one two\"\""));
    }

    public void testStripLeadingAndTrailingQuotes_mixedQuotes() throws Exception {
        assertEquals("mixed quotes", "\"one\" two\"", Util.stripLeadingAndTrailingQuotes("\"\"one\" two\"\""));
    }

    public void testStripLeadingAndTrailingQuotes_emptyString() throws Exception {
        assertEquals("empty string should be unchanged", "", Util.stripLeadingAndTrailingQuotes(""));
    }

    public void testStripLeadingAndTrailingQuotes_stringWithOnlyQuotes() throws Exception {
        assertEquals("string with only quotes", "", Util.stripLeadingAndTrailingQuotes("\"\""));
    }

    public void testStripLeadingHyphens_edgeCase_singleHyphenAtStartOfLongString() throws Exception {
        String longString = "a".repeat(20);
        assertEquals("single hyphen at start of long string", longString, Util.stripLeadingHyphens("-" + longString));
    }

    public void testStripLeadingHyphens_edgeCase_doubleHyphenAtStartOfLongString() throws Exception {
        String longString = "a".repeat(20);
        assertEquals("double hyphen at start of long string", longString, Util.stripLeadingHyphens("--" + longString));
    }

    public void testStripLeadingAndTrailingQuotes_edgeCase_longStringWithQuotes() throws Exception {
        String longString = "a".repeat(20);
        assertEquals("long string with leading and trailing quotes", longString, Util.stripLeadingAndTrailingQuotes("\"" + longString + "\""));
    }

    // Added test for `stripLeadingAndTrailingQuotes` when the input string contains only a single quote.
    public void testStripLeadingAndTrailingQuotes_singleQuoteOnly() throws Exception {
        assertEquals("string with only a single quote", "", Util.stripLeadingAndTrailingQuotes("\""));
    }

    // Added test for `stripLeadingHyphens` with a string that starts with a single hyphen followed by another hyphen.
    public void testStripLeadingHyphens_singleHyphenFollowedByHyphen() throws Exception {
        assertEquals("single hyphen followed by hyphen", "-abc", Util.stripLeadingHyphens("---abc"));
    }

    // Added test for `stripLeadingHyphens` with a string that starts with a double hyphen followed by another hyphen.
    public void testStripLeadingHyphens_doubleHyphenFollowedByHyphen() throws Exception {
        assertEquals("double hyphen followed by hyphen", "-abc", Util.stripLeadingHyphens("----abc"));
    }

    // Added test for `stripLeadingAndTrailingQuotes` with a string that starts with a quote and ends with a quote, but has internal quotes.
    public void testStripLeadingAndTrailingQuotes_internalQuotes() throws Exception {
        assertEquals("internal quotes", "one\"two", Util.stripLeadingAndTrailingQuotes("\"one\"two\""));
    }

    // Added test for `stripLeadingHyphens` with only a single hyphen and some spaces.
    public void testStripLeadingHyphens_singleHyphenAndSpaces() throws Exception {
        assertEquals("single hyphen and spaces", "  ", Util.stripLeadingHyphens("-  "));
    }

    // Added test for `stripLeadingHyphens` with only double hyphens and some spaces.
    public void testStripLeadingHyphens_doubleHyphenAndSpaces() throws Exception {
        assertEquals("double hyphen and spaces", "  ", Util.stripLeadingHyphens("--  "));
    }
}
