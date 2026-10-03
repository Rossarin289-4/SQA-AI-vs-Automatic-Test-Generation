package com.google.gson.internal.bind.util;

import org.junit.Test;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ISO8601UtilsAI5Test {

    @Test
    public void testFormatAndParseBasic() {
        Date now = new Date();
        String formatted = ISO8601Utils.format(now, true, TimeZone.getTimeZone("UTC"));
        assertNotNull(formatted);

        ParsePosition pos = new ParsePosition(0);
        try {
            Date parsed = ISO8601Utils.parse(formatted, pos);
            assertNotNull(parsed);
        } catch (ParseException e) {
            org.junit.Assert.fail("Parsing failed: " + e.getMessage());
        }
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidFormat() throws ParseException {
        String invalidDate = "not-a-date";
        ParsePosition pos = new ParsePosition(0);
        ISO8601Utils.parse(invalidDate, pos);
    }

    @Test
    public void testFormatWithTimezoneOffset() {
        Date date = new Date(0L); // Epoch
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        String formatted = ISO8601Utils.format(date, false, tz);
        assertNotNull(formatted);
        assertEquals(true, formatted.contains("+02:00"));
    }
}
