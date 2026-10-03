package org.apache.commons.lang3.time;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateParserLang9Test {

    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Locale LOCALE = Locale.US;

    @Test
    public void testRejectsUnterminatedQuoteAfterLiteralAndField() {
        try {
            new FastDateParser("'A'b'", UTC, LOCALE);
        } catch (IllegalArgumentException expected) {
            return;
        }

        throw new AssertionError(
                "Expected IllegalArgumentException for a pattern with an unparsed trailing quote");
    }

    @Test
    public void testRejectsUnterminatedQuoteAfterDatePattern() {
        try {
            new FastDateParser("yyyy-MM-dd'", UTC, LOCALE);
        } catch (IllegalArgumentException expected) {
            return;
        }

        throw new AssertionError(
                "Expected IllegalArgumentException for a pattern with an unparsed trailing quote");
    }

    @Test
    public void testRejectsUnterminatedQuoteAfterQuotedLiteralAndYear() {
        try {
            new FastDateParser("'Q'yyyy'", UTC, LOCALE);
        } catch (IllegalArgumentException expected) {
            return;
        }

        throw new AssertionError(
                "Expected IllegalArgumentException for a pattern with an unparsed trailing quote");
    }

    @Test
    public void testAcceptsFullyConsumedQuotedLiteralPattern() {
        new FastDateParser("'Q'yyyy", UTC, LOCALE);
    }
}
