package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;

public class LocaleUtilsTest {

    @Test
    public void testToLocaleCountryOnlyWithEmptyLanguage() {
        Locale result = LocaleUtils.toLocale("_TH");

        assertEquals("", result.getLanguage());
        assertEquals("TH", result.getCountry());
        assertEquals("", result.getVariant());
    }

    @Test
    public void testToLocaleCountryAndVariantWithEmptyLanguage() {
        Locale result = LocaleUtils.toLocale("_TH_CUSTOM");

        assertEquals("", result.getLanguage());
        assertEquals("TH", result.getCountry());
        assertEquals("CUSTOM", result.getVariant());
    }
}
