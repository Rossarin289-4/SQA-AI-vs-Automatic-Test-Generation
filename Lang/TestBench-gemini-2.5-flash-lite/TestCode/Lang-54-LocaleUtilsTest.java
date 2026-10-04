package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class LocaleUtilsTest {

    @Test
    public void testToLocale_Null() throws Exception {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocale_InvalidEmpty() {
        try {
            LocaleUtils.toLocale("");
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToLocale_InvalidTooShort() {
        try {
            LocaleUtils.toLocale("a");
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToLocale_InvalidTooLong() {
        try {
            LocaleUtils.toLocale("en_GB_XXX_YYY");
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToLocale_InvalidLanguageCode() {
        try {
            LocaleUtils.toLocale("12");
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToLocale_InvalidCountryCode() {
        try {
            LocaleUtils.toLocale("en_12");
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToLocale_InvalidVariantSeparator() {
        try {
            LocaleUtils.toLocale("en_GB-XXX");
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testToLocale_InvalidVariantEmpty() {
        try {
            LocaleUtils.toLocale("en_US_");
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToLocale_English() {
        Locale expected = new Locale("en", "");
        assertEquals(expected, LocaleUtils.toLocale("en"));
    }

    @Test
    public void testToLocale_FrenchCanada() {
        Locale expected = new Locale("fr", "CA");
        assertEquals(expected, LocaleUtils.toLocale("fr_CA"));
    }

    @Test
    public void testToLocale_EnglishGBVariant() {
        Locale expected = new Locale("en", "GB", "xxx");
        assertEquals(expected, LocaleUtils.toLocale("en_GB_xxx"));
    }

    @Test
    public void testToLocale_FrenchFranceVariant() {
        Locale expected = new Locale("fr", "FR", "");
        assertEquals(expected, LocaleUtils.toLocale("fr_FR"));
    }
    
    @Test
    public void testToLocale_InvalidFormat() {
        try {
            LocaleUtils.toLocale("en-us");
            fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testLocaleLookupList_NullLocale() {
        Locale defaultLocale = Locale.US;
        List expected = Collections.emptyList();
        assertEquals(expected, LocaleUtils.localeLookupList(null, defaultLocale));
    }

    @Test
    public void testLocaleLookupList_NullLocaleAndDefault() {
        List expected = Collections.emptyList();
        assertEquals(expected, LocaleUtils.localeLookupList(null, null));
    }

    @Test
    public void testLocaleLookupList_OnlyLocale() {
        Locale locale = Locale.CANADA_FRENCH;
        List expected = Arrays.asList(
                Locale.CANADA_FRENCH,
                new Locale("fr", "CA"),
                new Locale("fr", "")
        );
        assertEquals(expected, LocaleUtils.localeLookupList(locale, null));
    }

    @Test
    public void testLocaleLookupList_LocaleAndDefault() {
        Locale locale = Locale.CANADA_FRENCH;
        Locale defaultLocale = Locale.CHINA;
        List expected = Arrays.asList(
                Locale.CANADA_FRENCH,
                new Locale("fr", "CA"),
                new Locale("fr", ""),
                Locale.CHINA
        );
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }
    
    @Test
    public void testLocaleLookupList_LocaleWithVariant() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = Locale.CHINA;
        List expected = Arrays.asList(
                new Locale("fr", "CA", "xxx"),
                new Locale("fr", "CA"),
                new Locale("fr", ""),
                Locale.CHINA
        );
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }
    
    @Test
    public void testLocaleLookupList_LocaleWithCountryAndDefault() {
        Locale locale = new Locale("fr", "CA");
        Locale defaultLocale = Locale.CHINA;
        List expected = Arrays.asList(
                new Locale("fr", "CA"),
                new Locale("fr", ""),
                Locale.CHINA
        );
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }

    @Test
    public void testLocaleLookupList_LocaleWithLanguageAndDefault() {
        Locale locale = new Locale("fr", "");
        Locale defaultLocale = Locale.CHINA;
        List expected = Arrays.asList(
                new Locale("fr", ""),
                Locale.CHINA
        );
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }
    
    @Test
    public void testLocaleLookupList_LocaleAlreadyInDefault() {
        Locale locale = Locale.US;
        Locale defaultLocale = Locale.US;
        List expected = Arrays.asList(
                Locale.US,
                new Locale("en", "")
        );
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }
    
    @Test
    public void testLocaleLookupList_LocaleWithVariantAlreadyInDefault() {
        Locale locale = new Locale("en", "US", "variant");
        Locale defaultLocale = Locale.US;
        List expected = Arrays.asList(
                new Locale("en", "US", "variant"),
                new Locale("en", "US"),
                new Locale("en", ""),
                Locale.US // defaultLocale is already present as new Locale("en", "")
        );
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }

    @Test
    public void testAvailableLocaleList() {
        List<Locale> locales = LocaleUtils.availableLocaleList();
        assertNotNull(locales);
        assertTrue(locales.size() > 0);
        assertTrue(locales.contains(Locale.US));
    }

    @Test
    public void testAvailableLocaleSet() {
        Set<Locale> locales = LocaleUtils.availableLocaleSet();
        assertNotNull(locales);
        assertTrue(locales.size() > 0);
        assertTrue(locales.contains(Locale.US));
    }

    @Test
    public void testIsAvailableLocale_True() {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
    }

    @Test
    public void testIsAvailableLocale_False() {
        assertFalse(LocaleUtils.isAvailableLocale(new Locale("xx", "YY")));
    }

    @Test
    public void testIsAvailableLocale_Null() {
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    @Test
    public void testLanguagesByCountry_Null() {
        assertEquals(0, LocaleUtils.languagesByCountry(null).size());
    }

    @Test
    public void testLanguagesByCountry_Empty() {
        assertEquals(0, LocaleUtils.languagesByCountry("").size());
    }

    @Test
    public void testLanguagesByCountry_Invalid() {
        assertEquals(0, LocaleUtils.languagesByCountry("12").size());
    }

    @Test
    public void testLanguagesByCountry_Valid() {
        // This test depends on the available locales, which can vary.
        // We'll assume US is available and has English as a language.
        List<Locale> langs = LocaleUtils.languagesByCountry("US");
        assertTrue(langs.size() > 0);
        assertTrue(langs.contains(Locale.US));
        assertTrue(langs.contains(Locale.CANADA_FRENCH)); // Example of another locale with US country code (if it exists)
    }

    @Test
    public void testCountriesByLanguage_Null() {
        assertEquals(0, LocaleUtils.countriesByLanguage(null).size());
    }

    @Test
    public void testCountriesByLanguage_Empty() {
        assertEquals(0, LocaleUtils.countriesByLanguage("").size());
    }

    @Test
    public void testCountriesByLanguage_Invalid() {
        assertEquals(0, LocaleUtils.countriesByLanguage("123").size());
    }

    @Test
    public void testCountriesByLanguage_Valid() {
        // This test depends on the available locales, which can vary.
        // We'll assume English is available with multiple countries.
        List<Locale> countries = LocaleUtils.countriesByLanguage("en");
        assertTrue(countries.size() > 0);
        assertTrue(countries.contains(Locale.US));
        assertTrue(countries.contains(Locale.UK));
        assertTrue(countries.contains(Locale.CANADA));
    }

    @Test
    public void testCountriesByLanguage_NonExistent() {
        assertEquals(0, LocaleUtils.countriesByLanguage("nonexistentlang").size());
    }
}
