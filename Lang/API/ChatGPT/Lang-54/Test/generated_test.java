package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Locale;

import org.junit.Test;

public class LocaleUtilsLang54Test {

    @Test
    public void testLocaleWithEmptyCountryAndSingleCharacterVariant() {
        Locale result = LocaleUtils.toLocale("en__X");

        assertEquals("en", result.getLanguage());
        assertEquals("", result.getCountry());
        assertEquals("X", result.getVariant());
    }

    @Test
    public void testLocaleWithEmptyCountryAndLongVariant() {
        Locale result = LocaleUtils.toLocale("fr__EURO");

        assertEquals("fr", result.getLanguage());
        assertEquals("", result.getCountry());
        assertEquals("EURO", result.getVariant());
    }

    @Test
    public void testLocaleWithCountryAndVariantStillWorks() {
        Locale result = LocaleUtils.toLocale("de_DE_X");

        assertEquals("de", result.getLanguage());
        assertEquals("DE", result.getCountry());
        assertEquals("X", result.getVariant());
    }

    @Test
    public void testTwoCharacterLanguageLocaleStillWorks() {
        Locale result = LocaleUtils.toLocale("ja");

        assertEquals("ja", result.getLanguage());
        assertEquals("", result.getCountry());
        assertEquals("", result.getVariant());
    }

    @Test
    public void testFiveCharacterLanguageCountryLocaleStillWorks() {
        Locale result = LocaleUtils.toLocale("en_US");

        assertEquals("en", result.getLanguage());
        assertEquals("US", result.getCountry());
        assertEquals("", result.getVariant());
    }

    @Test
    public void testNullInputStillReturnsNull() {
        assertNull(LocaleUtils.toLocale(null));
    }
}
