package org.apache.commons.cli;

import junit.framework.TestCase;

public class UtilTest extends TestCase {
    public void testStripLeadingHyphensNull() throws Exception {
        assertNull("stripping null should return null", Util.stripLeadingHyphens(null));
    }

    public void testStripLeadingHyphensEmpty() throws Exception {
        assertEquals("stripping empty string should return empty string", "", Util.stripLeadingHyphens(""));
    }

    public void testStripLeadingHyphensSingleHyphen() throws Exception {
        assertEquals("stripping single hyphen should return empty string", "", Util.stripLeadingHyphens("-"));
    }

    public void testStripLeadingHyphensDoubleHyphen() throws Exception {
        assertEquals("stripping double hyphen should return empty string", "", Util.stripLeadingHyphens("--"));
    }

    public void testStripLeadingHyphensSingleHyphenWithText() throws Exception {
        assertEquals("stripping '-abc' should return 'abc'", "abc", Util.stripLeadingHyphens("-abc"));
    }

    public void testStripLeadingHyphensDoubleHyphenWithText() throws Exception {
        assertEquals("stripping '--abc' should return 'abc'", "abc", Util.stripLeadingHyphens("--abc"));
    }

    public void testStripLeadingHyphensNoHyphen() throws Exception {
        assertEquals("stripping 'abc' should return 'abc'", "abc", Util.stripLeadingHyphens("abc"));
    }

    public void testStripLeadingHyphensHyphenMiddle() throws Exception {
        assertEquals("stripping 'a-bc' should return 'a-bc'", "a-bc", Util.stripLeadingHyphens("a-bc"));
    }

    public void testStripLeadingHyphensHyphenEnd() throws Exception {
        assertEquals("stripping 'abc-' should return 'abc-'", "abc-", Util.stripLeadingHyphens("abc-"));
    }

    public void testStripLeadingHyphensDoubleHyphenMiddle() throws Exception {
        assertEquals("stripping 'a--bc' should return 'a--bc'", "a--bc", Util.stripLeadingHyphens("a--bc"));
    }

    public void testStripLeadingHyphensDoubleHyphenEnd() throws Exception {
        assertEquals("stripping 'abc--' should return 'abc--'", "abc--", Util.stripLeadingHyphens("abc--"));
    }

    public void testStripLeadingAndTrailingQuotesNull() throws Exception {
        try {
            Util.stripLeadingAndTrailingQuotes(null);
            fail("expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    public void testStripLeadingAndTrailingQuotesEmpty() throws Exception {
        assertEquals("stripping empty string should return empty string", "", Util.stripLeadingAndTrailingQuotes(""));
    }

    public void testStripLeadingAndTrailingQuotesNoQuotes() throws Exception {
        assertEquals("stripping 'abc' should return 'abc'", "abc", Util.stripLeadingAndTrailingQuotes("abc"));
    }

    public void testStripLeadingAndTrailingQuotesSingleQuote() throws Exception {
        assertEquals("stripping '\"' should return '\"'", "\"", Util.stripLeadingAndTrailingQuotes("\""));
    }

    public void testStripLeadingAndTrailingQuotesDoubleQuote() throws Exception {
        assertEquals("stripping '\"\"' should return ''", "", Util.stripLeadingAndTrailingQuotes("\"\""));
    }

    public void testStripLeadingAndTrailingQuotesLeadingQuote() throws Exception {
        assertEquals("stripping '\"abc' should return '\"abc'", "\"abc", Util.stripLeadingAndTrailingQuotes("\"abc"));
    }

    public void testStripLeadingAndTrailingQuotesTrailingQuote() throws Exception {
        assertEquals("stripping 'abc\"' should return 'abc\"'", "abc\"", Util.stripLeadingAndTrailingQuotes("abc\""));
    }

    public void testStripLeadingAndTrailingQuotesBothQuotesNoText() throws Exception {
        assertEquals("stripping '\"\"' should return ''", "", Util.stripLeadingAndTrailingQuotes("\"\""));
    }

    public void testStripLeadingAndTrailingQuotesBothQuotesWithText() throws Exception {
        assertEquals("stripping '\"abc\"' should return 'abc'", "abc", Util.stripLeadingAndTrailingQuotes("\"abc\""));
    }

    public void testStripLeadingAndTrailingQuotesEmbeddedQuote() throws Exception {
        assertEquals("stripping '\"a\"b\"c\"' should return '\"a\"b\"c\"'", "\"a\"b\"c\"", Util.stripLeadingAndTrailingQuotes("\"a\"b\"c\""));
    }

    public void testStripLeadingAndTrailingQuotesMultipleEmbeddedQuotes() throws Exception {
        assertEquals("stripping '\"a\"\"b\"c\"' should return '\"a\"\"b\"c\"'", "\"a\"\"b\"c\"", Util.stripLeadingAndTrailingQuotes("\"a\"\"b\"c\""));
    }

    public void testStripLeadingAndTrailingQuotesOnlyLeadingEmbeddedQuote() throws Exception {
        assertEquals("stripping '\"a\"bc' should return '\"a\"bc'", "\"a\"bc", Util.stripLeadingAndTrailingQuotes("\"a\"bc"));
    }

    public void testStripLeadingAndTrailingQuotesOnlyTrailingEmbeddedQuote() throws Exception {
        assertEquals("stripping 'abc\"\"' should return 'abc\"\"'", "abc\"\"", Util.stripLeadingAndTrailingQuotes("abc\"\""));
    }
}
