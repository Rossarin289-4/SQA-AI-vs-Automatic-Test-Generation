package org.apache.commons.lang3.time;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateParserLang10Test {

    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Locale LOCALE = Locale.US;

    @Test
    public void testRejectsInputWithMissingLiteralSpace() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy M", UTC, LOCALE);

        try {
            parser.parse("20032");
            fail("Expected ParseException when the literal space is missing");
        } catch (ParseException expected) {
            // Expected on the fixed implementation.
        }
    }

    @Test
    public void testRejectsInputWithTabInsteadOfLiteralSpace() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy M", UTC, LOCALE);

        try {
            parser.parse("2003\t2");
            fail("Expected ParseException when a tab replaces the literal space");
        } catch (ParseException expected) {
            // Expected on the fixed implementation.
        }
    }

    @Test
    public void testRejectsInputWithNewlineInsteadOfLiteralSpace() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy M", UTC, LOCALE);

        try {
            parser.parse("2003\n2");
            fail("Expected ParseException when a newline replaces the literal space");
        } catch (ParseException expected) {
            // Expected on the fixed implementation.
        }
    }

    @Test
    public void testAcceptsInputWithRequiredLiteralSpace() throws Exception {
        FastDateParser parser = new FastDateParser("yyyy M", UTC, LOCALE);

        assertNotNull(parser.parse("2003 2"));
    }
}
