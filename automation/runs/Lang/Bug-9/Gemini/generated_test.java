package org.apache.commons.lang3.time;

import java.util.Locale;
import java.util.TimeZone;
import org.junit.Test;

public class FastDateParserDefectTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInitThrowsExceptionOnUnparsedTrailingCharacters() {
        // "yyyy-MM-dd" is valid, but "X" or unsupported trailing characters should fail validation in fixed version
        new FastDateParser("yyyy-MM-dd X", TimeZone.getDefault(), Locale.US);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitThrowsExceptionOnInvalidTrailingPatternToken() {
        // "HH:mm:ss" is valid, but trailing unsupported token should trigger IllegalArgumentException
        new FastDateParser("HH:mm:ss a invalid_token", TimeZone.getDefault(), Locale.US);
    }

    @Test
    public void testValidPatternSucceedsOnBoth() {
        // Ensure valid patterns still construct successfully on both versions
        FastDateParser parser = new FastDateParser("yyyy-MM-dd HH:mm:ss", TimeZone.getDefault(), Locale.US);
        org.junit.Assert.assertNotNull(parser);
        org.junit.Assert.assertEquals("yyyy-MM-dd HH:mm:ss", parser.getPattern());
    }
}
