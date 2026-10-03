package org.apache.commons.lang3;

import java.util.Locale;
import org.junit.Test;
import static org.junit.Assert.*;

public class LocaleUtilsIndependentTest {

    @Test
    public void testLocaleStartingWithUnderscoreCountryOnly() {
        Locale locale = LocaleUtils.toLocale("_GB");
        assertNotNull(locale);
        assertEquals("", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test
    public void testLocaleStartingWithUnderscoreCountryAndVariant() {
        Locale locale = LocaleUtils.toLocale("_GB_POSIX");
        assertNotNull(locale);
        assertEquals("", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
        assertEquals("POSIX", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidUnderscoreFormatTooShort() {
        LocaleUtils.toLocale("_A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidUnderscoreFormatLowercaseCountry() {
        LocaleUtils.toLocale("_gb");
    }

    @Test
    public void testStandardLocalesRegression() {
        Locale localeEn = LocaleUtils.toLocale("en");
        assertNotNull(localeEn);
        assertEquals("en", localeEn.getLanguage());
        assertEquals("", localeEn.getCountry());

        Locale localeEnUs = LocaleUtils.toLocale("en_US");
        assertNotNull(localeEnUs);
        assertEquals("en", localeEnUs.getLanguage());
        assertEquals("US", localeEnUs.getCountry());
    }
}
