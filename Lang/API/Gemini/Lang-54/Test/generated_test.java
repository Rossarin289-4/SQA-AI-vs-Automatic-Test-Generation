package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Locale;

public class LocaleUtils_TestDesign {

    @Test
    public void testToLocaleLanguageEmptyCountryAndVariant() {
        // Test parsing a locale string with a language, empty country, and variant (e.g., "en__POSIX")
        Locale locale = LocaleUtils.toLocale("en__POSIX");
        assertNotNull("Locale should not be null", locale);
        assertEquals("en", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("POSIX", locale.getVariant());
    }

    @Test
    public void testToLocaleAnotherLanguageEmptyCountryAndVariant() {
        // Test another variant string with empty country
        Locale locale = LocaleUtils.toLocale("fr__MAC");
        assertNotNull("Locale should not be null", locale);
        assertEquals("fr", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("MAC", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocaleInvalidEmptyCountryMalformedVariant() {
        // Ensure invalid formats with double underscores but bad continuation still fail
        LocaleUtils.toLocale("en__12");
    }
}
