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
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testToLocale_Null() throws Exception {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocale_En() throws Exception {
        Locale expected = new Locale("en", "");
        assertEquals(expected, LocaleUtils.toLocale("en"));
    }

    @Test
    public void testToLocale_En_GB() throws Exception {
        Locale expected = new Locale("en", "GB");
        assertEquals(expected, LocaleUtils.toLocale("en_GB"));
    }

    @Test
    public void testToLocale_En_GB_Var() throws Exception {
        Locale expected = new Locale("en", "GB", "xxx");
        assertEquals(expected, LocaleUtils.toLocale("en_GB_xxx"));
    }
    
    @Test
    public void testToLocale_InvalidFormat_TooShort() throws Exception {
        try {
            LocaleUtils.toLocale("a");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testToLocale_InvalidFormat_WrongSeparator1() throws Exception {
        try {
            LocaleUtils.toLocale("en-GB");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testToLocale_InvalidFormat_WrongSeparator2() throws Exception {
        try {
            LocaleUtils.toLocale("en_GB-xxx");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testToLocale_InvalidFormat_InvalidLanguage() throws Exception {
        try {
            LocaleUtils.toLocale("12_GB");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testToLocale_InvalidFormat_InvalidCountry() throws Exception {
        try {
            LocaleUtils.toLocale("en_12");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testToLocale_InvalidFormat_TooLong() throws Exception {
        try {
            // The original string "en_GB_xxx_yyy" is longer than the maximum handled by the constructor
            // which correctly throws IllegalArgumentException. The original test was correct.
            // However, the error message was "Expected IllegalArgumentException" which is a bit redundant.
            // I'll keep it as is because the error message is not what is being asserted.
            LocaleUtils.toLocale("en_GB_xxx_yyy");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected
        }
    }

    @Test
    public void testLocaleLookupList_NullLocale() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.localeLookupList(null));
    }
    
    @Test
    public void testLocaleLookupList_NullLocaleAndDefault() throws Exception {
        // The method `localeLookupList(Locale locale, Locale defaultLocale)` handles null locale by returning a list containing only the defaultLocale if it's not null.
        // If both are null, it should return an empty list as per the previous implementation's logic.
        // Re-evaluating: if locale is null, it directly adds defaultLocale IF it's not null.
        // The test `testLocaleLookupList_NullLocale` already asserts that if locale is null, the result is an empty list, which implies defaultLocale being null or not.
        // Let's assume the intent for `localeLookupList(null, null)` is an empty list.
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.localeLookupList(null, null));
    }

    @Test
    public void testLocaleLookupList_OnlyLocale() throws Exception {
        Locale locale = new Locale("fr", "CA", "xxx");
        List<Locale> expected = new ArrayList<>();
        expected.add(locale);
        expected.add(new Locale("fr", "CA"));
        expected.add(new Locale("fr", ""));
        // When only locale is provided, the default locale is implicitly the system's default.
        // The method `localeLookupList(Locale locale)` calls `localeLookupList(locale, locale)`.
        // In this case, the defaultLocale *is* the locale itself.
        // The logic is:
        // list.add(locale); // fr_CA_xxx
        // if (variant.length() > 0) list.add(new Locale(lang, country)); // fr_CA
        // if (country.length() > 0) list.add(new Locale(lang, "")); // fr
        // if (list.contains(defaultLocale) == false) list.add(defaultLocale);
        // Since defaultLocale is the same as the initial locale (fr_CA_xxx), it won't be added again.
        // Thus the expected list is correct.
        assertEquals(expected, LocaleUtils.localeLookupList(locale));
    }

    @Test
    public void testLocaleLookupList_LocaleAndDefault() throws Exception {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("en");
        List<Locale> expected = new ArrayList<>();
        expected.add(locale); // fr_CA_xxx
        expected.add(new Locale("fr", "CA")); // fr_CA (from variant)
        expected.add(new Locale("fr", "")); // fr (from country)
        expected.add(defaultLocale); // en (defaultLocale not in list)
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }

    @Test
    public void testLocaleLookupList_LocaleSameAsDefault() throws Exception {
        Locale locale = new Locale("fr", "CA");
        Locale defaultLocale = new Locale("fr");
        List<Locale> expected = new ArrayList<>();
        expected.add(locale); // fr_CA
        expected.add(new Locale("fr", "")); // fr (from country)
        // defaultLocale (fr) is already added in the previous step.
        // The check `list.contains(defaultLocale) == false` will prevent it from being added again.
        // So the expected list should not contain the duplicate defaultLocale.
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }
    
    @Test
    public void testLocaleLookupList_LocaleVariantSameAsDefault() throws Exception {
        Locale locale = new Locale("fr", "CA", "VAR");
        Locale defaultLocale = new Locale("fr", "CA");
        List<Locale> expected = new ArrayList<>();
        expected.add(locale); // fr_CA_VAR
        expected.add(new Locale("fr", "CA")); // fr_CA (from variant)
        expected.add(new Locale("fr", "")); // fr (from country)
        // defaultLocale (fr_CA) is already added at index 1.
        // The check `list.contains(defaultLocale) == false` will prevent it from being added again.
        // So the expected list should not contain the duplicate defaultLocale.
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }
    
    @Test
    public void testLocaleLookupList_LocaleAndDefaultAreSame() throws Exception {
        Locale locale = new Locale("en", "US");
        Locale defaultLocale = locale; // defaultLocale is the same as locale
        List<Locale> expected = new ArrayList<>();
        expected.add(locale); // en_US
        expected.add(new Locale("en", "")); // en (from country)
        // The logic:
        // list.add(locale); // en_US
        // if (variant.length() > 0) ... // no variant
        // if (country.length() > 0) list.add(new Locale(lang, "")); // en
        // if (list.contains(defaultLocale) == false) list.add(defaultLocale);
        // defaultLocale is en_US, which is already at index 0. So it's not added again.
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }

    @Test
    public void testAvailableLocaleList() throws Exception {
        List<Locale> availableLocales = LocaleUtils.availableLocaleList();
        assertNotNull(availableLocales);
        assertTrue(availableLocales.size() > 0);
        assertTrue(availableLocales.contains(Locale.getDefault()));
    }

    @Test
    public void testAvailableLocaleSet() throws Exception {
        Set<Locale> availableLocales = LocaleUtils.availableLocaleSet();
        assertNotNull(availableLocales);
        assertTrue(availableLocales.size() > 0);
        assertTrue(availableLocales.contains(Locale.getDefault()));
    }

    @Test
    public void testIsAvailableLocale_Null() throws Exception {
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    @Test
    public void testIsAvailableLocale_Available() throws Exception {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.getDefault()));
    }

    @Test
    public void testIsAvailableLocale_NotAvailable() throws Exception {
        assertFalse(LocaleUtils.isAvailableLocale(new Locale("xx", "YY")));
    }

    @Test
    public void testLanguagesByCountry_Null() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.languagesByCountry(null));
    }

    @Test
    public void testLanguagesByCountry_NonExistent() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.languagesByCountry("XX"));
    }

    @Test
    public void testLanguagesByCountry_Valid() throws Exception {
        // This test assumes that "US" is a valid country code and has associated locales.
        // It also asserts that variant locales are not included.
        List<Locale> languages = LocaleUtils.languagesByCountry("US");
        assertNotNull(languages);
        // The size check is weak, as it depends on the installed locales.
        // However, the contains checks are specific.
        assertTrue(languages.contains(new Locale("en", "US")));
        assertTrue(languages.contains(new Locale("es", "US")));
        assertFalse(languages.contains(new Locale("en", "US", "variant"))); // variant should be excluded
    }

    @Test
    public void testCountriesByLanguage_Null() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.countriesByLanguage(null));
    }

    @Test
    public void testCountriesByLanguage_NonExistent() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.countriesByLanguage("xx"));
    }

    @Test
    public void testCountriesByLanguage_Valid() throws Exception {
        // This test assumes that "en" is a valid language code and has associated countries.
        // It also asserts that variant locales and empty country codes are not included.
        List<Locale> countries = LocaleUtils.countriesByLanguage("en");
        assertNotNull(countries);
        // The size check is weak, as it depends on the installed locales.
        // However, the contains checks are specific.
        assertTrue(countries.contains(new Locale("en", "US")));
        assertTrue(countries.contains(new Locale("en", "GB")));
        assertFalse(countries.contains(new Locale("en", "US", "variant"))); // variant should be excluded
        assertFalse(countries.contains(new Locale("en", ""))); // empty country should be excluded
    }
    
    @Test
    public void testCountriesByLanguage_WithVariant() throws Exception {
        // This test ensures that variants are correctly excluded when searching for countries by language.
        // It checks if any of the returned locales for "fr" have a variant.
        // If a locale like `Locale("fr", "CA", "var")` exists and is considered by the method,
        // this test will fail if `countriesByLanguage("fr")` returns it.
        List<Locale> countries = LocaleUtils.countriesByLanguage("fr");
        boolean foundVariant = false;
        for (Locale locale : countries) {
            if (locale.getVariant().length() > 0) {
                foundVariant = true;
                break;
            }
        }
        assertFalse("Found locale with variant, but it should be excluded.", foundVariant);
    }
    
    @Test
    public void testLanguagesByCountry_WithVariant() throws Exception {
        // This test ensures that variants are correctly excluded when searching for languages by country.
        // It checks if any of the returned locales for "US" have a variant.
        // If a locale like `Locale("en", "US", "var")` exists and is considered by the method,
        // this test will fail if `languagesByCountry("US")` returns it.
        List<Locale> languages = LocaleUtils.languagesByCountry("US");
        boolean foundVariant = false;
        for (Locale locale : languages) {
            if (locale.getVariant().length() > 0) {
                foundVariant = true;
                break;
            }
        }
        assertFalse("Found locale with variant, but it should be excluded.", foundVariant);
    }
    
    @Test
    public void testLocaleLookupList_LocaleWithVariantOnly() throws Exception {
        // Test case with a locale that has only a variant.
        // Locale constructor `new Locale("", "", "variant")` is valid.
        Locale locale = new Locale("", "", "variant");
        
        // When locale is `new Locale("", "", "variant")`:
        // list.add(locale); // adds `new Locale("", "", "variant")`
        // if (locale.getVariant().length() > 0) { // true
        //     list.add(new Locale(locale.getLanguage(), locale.getCountry())); // adds `new Locale("", "")`
        // }
        // if (locale.getCountry().length() > 0) { // false
        //     ...
        // }
        // if (list.contains(defaultLocale) == false) {
        //     list.add(defaultLocale);
        // }

        // So the intermediate list will be [Locale("", "", "variant"), Locale("", "")]
        // Then, defaultLocale is added if not present.
        
        // Let's assume defaultLocale is not `Locale("", "", "variant")` or `Locale("", "")`.
        // For example, if `defaultLocale` is `Locale("en")`.
        Locale defaultLocale = Locale.getDefault();
        
        List<Locale> expected = new ArrayList<>();
        expected.add(locale); // Locale("", "", "variant")
        expected.add(new Locale("", "")); // Locale("", "")

        // Add defaultLocale only if it's not already in the list.
        boolean defaultLocaleAlreadyAdded = false;
        for (Locale l : expected) {
            if (l.equals(defaultLocale)) {
                defaultLocaleAlreadyAdded = true;
                break;
            }
        }
        if (!defaultLocaleAlreadyAdded) {
            expected.add(defaultLocale);
        }

        // The actual output from `localeLookupList(locale, defaultLocale)` should match `expected`.
        assertEquals(expected, LocaleUtils.localeLookupList(locale, defaultLocale));
    }
}
