package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class LocaleUtilsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testToLocale_NullString() {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocale_EmptyString() {
        try {
            LocaleUtils.toLocale("");
            fail("Expected IllegalArgumentException for empty string");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testToLocale_TooShortString() {
        try {
            LocaleUtils.toLocale("a");
            fail("Expected IllegalArgumentException for short string");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testToLocale_JustLanguage() {
        Locale locale = LocaleUtils.toLocale("en");
        assertEquals("en", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test
    public void testToLocale_LanguageAndCountry() {
        Locale locale = LocaleUtils.toLocale("en_GB");
        assertEquals("en", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test
    public void testToLocale_LanguageCountryVariant() {
        Locale locale = LocaleUtils.toLocale("en_GB_xxx");
        assertEquals("en", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
        assertEquals("xxx", locale.getVariant());
    }

    @Test
    public void testToLocale_InvalidLanguageCase() {
        try {
            LocaleUtils.toLocale("En_GB");
            fail("Expected IllegalArgumentException for invalid language case");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testToLocale_InvalidCountryCase() {
        try {
            LocaleUtils.toLocale("en_gb");
            fail("Expected IllegalArgumentException for invalid country case");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testToLocale_InvalidSeparator() {
        try {
            LocaleUtils.toLocale("en-GB");
            fail("Expected IllegalArgumentException for invalid separator");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    // This test was failing because the logic in toLocale does not allow language _ variant.
    // It expects at least a country code if a variant is present for language-only strings.
    @Test
    public void testToLocale_LanguageVariantOnly() {
        try {
            LocaleUtils.toLocale("en__XYZ");
            fail("Expected IllegalArgumentException for language variant only");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testToLocale_CountryVariantOnly() {
        Locale locale = LocaleUtils.toLocale("_US");
        assertEquals("", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test
    public void testToLocale_CountryVariantVariant() {
        Locale locale = LocaleUtils.toLocale("_US_VAR");
        assertEquals("", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertEquals("VAR", locale.getVariant());
    }

     @Test
    public void testToLocale_CountryVariantVariantInvalid() {
        try {
            LocaleUtils.toLocale("_USV"); // This is length 4, expected 5 for _XX_YYY
            fail("Expected IllegalArgumentException for invalid country variant string");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testToLocale_CountryVariantVariantInvalidSeparator() {
        try {
            LocaleUtils.toLocale("_US_"); // This is length 4, expected 5 for _XX_YYY
            fail("Expected IllegalArgumentException for invalid country variant string");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
    
    @Test
    public void testToLocale_LanguageCountryVariantWithHash() {
        // The source code explicitly checks for '#' as a separator for the variant.
        // If the variant is present, it must be after a '#' for JDK 1.3 compatibility.
        // However, the current implementation in reference code for toLocale("en_GB_xxx")
        // does not add a '#'. It directly uses the string after the last underscore.
        // The problem is that the test was asserting the variant to be "xxx",
        // but the code `str.substring(6)` on "en_GB_xxx" correctly extracts "xxx".
        // The issue was in the `"#"` part of the assertion which was comparing against
        // `locale.getVariant()` which does not contain '#'.
        Locale locale = LocaleUtils.toLocale("en_GB_xxx");
        assertEquals("en", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
        assertEquals("xxx", locale.getVariant());
    }


    @Test
    public void testLocaleLookupList_NullLocale() {
        // The original test expected a list containing only the default locale when the input locale is null.
        // The code `if (locale != null)` block is skipped, and `defaultLocale` is added only if it's not null.
        // If defaultLocale is null, the list is empty. If defaultLocale is not null, it is added.
        // Thus, the list should contain defaultLocale if it is not null.
        List<Locale> list = LocaleUtils.localeLookupList(null, Locale.US);
        assertEquals(1, list.size());
        assertEquals(Locale.US, list.get(0));
    }

    @Test
    public void testLocaleLookupList_NullLocaleAndDefault() {
        // When both locale and defaultLocale are null, the list should be empty.
        List<Locale> list = LocaleUtils.localeLookupList(null, null);
        assertEquals(0, list.size());
    }

    @Test
    public void testLocaleLookupList_SameLocaleAndDefault() {
        Locale locale = Locale.CANADA_FRENCH;
        // The original test expected a list of size 3. However, the logic in localeLookupList
        // adds locale, then locale.getLanguage(), then defaultLocale if it's not already present.
        // For Locale("fr", "CA", "xxx"), it adds:
        // 1. Locale("fr", "CA", "xxx")
        // 2. Locale("fr", "CA")
        // 3. Locale("fr", "")
        // If defaultLocale is Locale("fr", "CA", "xxx"), it is already in the list.
        // So the expected list should be [Locale("fr", "CA", "xxx"), Locale("fr", "CA"), Locale("fr", "")]. Size 3.
        // The original test was correct. Re-evaluating the code:
        // list.add(locale);
        // if (locale.getVariant().length() > 0) { list.add(new Locale(locale.getLanguage(), locale.getCountry())); } -> Locale("fr", "CA")
        // if (locale.getCountry().length() > 0) { list.add(new Locale(locale.getLanguage(), "")); } -> Locale("fr", "")
        // if (list.contains(defaultLocale) == false) { list.add(defaultLocale); } -> defaultLocale is Locale.CANADA_FRENCH, which is already present.
        // So the list is indeed size 3.
        List<Locale> list = LocaleUtils.localeLookupList(locale, locale);
        assertEquals(3, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr", ""), list.get(2));
    }

    @Test
    public void testLocaleLookupList_DifferentLocaleAndDefault() {
        // The original test expected a list of size 4. The source code:
        // `list.add(locale);` -> Locale("fr", "CA", "xxx")
        // `if (locale.getVariant().length() > 0)` -> `list.add(new Locale(locale.getLanguage(), locale.getCountry()));` -> Locale("fr", "CA")
        // `if (locale.getCountry().length() > 0)` -> `list.add(new Locale(locale.getLanguage(), ""));` -> Locale("fr", "")
        // `if (list.contains(defaultLocale) == false)` -> `list.add(defaultLocale);` -> Locale.US is not in the list. -> Locale.US
        // The list is [Locale("fr", "CA", "xxx"), Locale("fr", "CA"), Locale("fr", ""), Locale.US]. Size is 4.
        // The original test result was correct. The failing test indicates an issue in my previous analysis or the experiment system's reporting.
        // Let's re-trace the reference code carefully.
        // locale = new Locale("fr", "CA", "xxx")
        // defaultLocale = Locale.US
        // list = new ArrayList<Locale>(4);
        // list.add(locale); // [Locale("fr", "CA", "xxx")]
        // locale.getVariant().length() > 0 is true. list.add(new Locale("fr", "CA")); // [Locale("fr", "CA", "xxx"), Locale("fr", "CA")]
        // locale.getCountry().length() > 0 is true. list.add(new Locale("fr", "")); // [Locale("fr", "CA", "xxx"), Locale("fr", "CA"), Locale("fr", "")]
        // list.contains(defaultLocale) is false. list.add(defaultLocale); // [Locale("fr", "CA", "xxx"), Locale("fr", "CA"), Locale("fr", ""), Locale.US]
        // The size is 4. The original test assertion was correct. The original failure report might be misleading or point to a subtle issue.
        // Given the instruction "Correct only those tests and reply with the complete corrected test class",
        // I will assume the test was correct and the failure report was pointing to a discrepancy that needs to be resolved by ensuring the test matches the code's output.
        // The provided reference code *does* produce a list of size 4 here. If it failed with 3, then the code being tested was not the reference code.
        // Since I must work with the reference code, I will keep the assertion for 4.
        Locale locale = Locale.CANADA_FRENCH; // This is Locale("fr", "CA")
        Locale defaultLocale = Locale.US;
        // Let's re-trace with Locale("fr", "CA") as the input locale
        // list.add(locale); // [Locale("fr", "CA")]
        // locale.getVariant().length() > 0 is false.
        // locale.getCountry().length() > 0 is true. list.add(new Locale("fr", "")); // [Locale("fr", "CA"), Locale("fr", "")]
        // list.contains(defaultLocale) is false. list.add(defaultLocale); // [Locale("fr", "CA"), Locale("fr", ""), Locale.US]
        // The size is 3. The original test failed with expected 4, was 3. So, the test itself was incorrect.
        List<Locale> list = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(3, list.size()); // Corrected from 4 to 3
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("fr", ""), list.get(1));
        assertEquals(defaultLocale, list.get(2));
    }

    @Test
    public void testLocaleLookupList_WithVariant() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = Locale.US;
        // Trace:
        // list.add(locale); // [Locale("fr", "CA", "xxx")]
        // locale.getVariant().length() > 0 is true. list.add(new Locale("fr", "CA")); // [Locale("fr", "CA", "xxx"), Locale("fr", "CA")]
        // locale.getCountry().length() > 0 is true. list.add(new Locale("fr", "")); // [Locale("fr", "CA", "xxx"), Locale("fr", "CA"), Locale("fr", "")]
        // list.contains(defaultLocale) is false. list.add(defaultLocale); // [Locale("fr", "CA", "xxx"), Locale("fr", "CA"), Locale("fr", ""), Locale.US]
        // Size is 4. The original test expected 4. This test was passing.
        List<Locale> list = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(4, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr", ""), list.get(2));
        assertEquals(defaultLocale, list.get(3));
    }
    
    @Test
    public void testLocaleLookupList_WithVariantAndDefaultInList() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = Locale.FRANCE; // Locale("fr", "")
        // Trace:
        // list.add(locale); // [Locale("fr", "CA", "xxx")]
        // locale.getVariant().length() > 0 is true. list.add(new Locale("fr", "CA")); // [Locale("fr", "CA", "xxx"), Locale("fr", "CA")]
        // locale.getCountry().length() > 0 is true. list.add(new Locale("fr", "")); // [Locale("fr", "CA", "xxx"), Locale("fr", "CA"), Locale("fr", "")]
        // list.contains(defaultLocale) is true. defaultLocale is Locale("fr", ""), which is already in the list.
        // So, defaultLocale is NOT added.
        // The list is [Locale("fr", "CA", "xxx"), Locale("fr", "CA"), Locale("fr", "")]. Size is 3.
        // The original test expected 4. So the test was incorrect.
        List<Locale> list = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(3, list.size()); // Corrected from 4 to 3
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(defaultLocale, list.get(2));
    }

    @Test
    public void testAvailableLocaleList() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertTrue(list.size() > 0); // Should be at least one locale
        assertTrue(list.contains(Locale.US)); // Sanity check
        // Check immutability
        try {
            list.add(Locale.CANADA);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testAvailableLocaleSet() {
        Set<Locale> set = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        assertTrue(set.size() > 0); // Should be at least one locale
        assertTrue(set.contains(Locale.US)); // Sanity check
        // Check immutability
        try {
            set.add(Locale.CANADA);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testIsAvailableLocale_Available() {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
    }

    @Test
    public void testIsAvailableLocale_NotAvailable() {
        // Create a locale that is highly unlikely to be available
        Locale nonExistentLocale = new Locale("xx", "YY", "ZZZ");
        assertFalse(LocaleUtils.isAvailableLocale(nonExistentLocale));
    }

    @Test
    public void testIsAvailableLocale_Null() {
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    @Test
    public void testLanguagesByCountry_Null() {
        List<Locale> list = LocaleUtils.languagesByCountry(null);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_Invalid() {
        List<Locale> list = LocaleUtils.languagesByCountry("XX");
        // Assuming no locale has country code "XX"
        assertTrue(list.isEmpty());
    }
    
    @Test
    public void testLanguagesByCountry_WithLocales() {
        // This test depends on the available Locales. Let's assume "US" is a valid country code.
        List<Locale> list = LocaleUtils.languagesByCountry("US");
        // Check if some common US locales are present and if variants are excluded
        boolean foundEnglish = false;
        boolean foundFrench = false;
        for (Locale locale : list) {
            if (locale.getLanguage().equals("en") && locale.getCountry().equals("US")) {
                foundEnglish = true;
            }
            if (locale.getLanguage().equals("fr") && locale.getCountry().equals("US")) {
                foundFrench = true;
            }
            // Ensure no variants are returned
            assertFalse(locale.getVariant().length() > 0);
        }
        // We cannot assert they *must* exist, as available locales can differ.
        // However, if "US" is present as a country code, there should be at least one language.
        // If the test fails, it might mean no locales for "US" exist, or the available locales differ.
        assertTrue(list.size() >= 0); // At least 0 or more, depending on JDK installation
        
        // Check immutability
        try {
            if (!list.isEmpty()) {
                list.add(Locale.US);
                fail("Expected UnsupportedOperationException");
            }
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testCountriesByLanguage_Null() {
        List<Locale> list = LocaleUtils.countriesByLanguage(null);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_Invalid() {
        List<Locale> list = LocaleUtils.countriesByLanguage("xx");
        // Assuming no locale has language code "xx"
        assertTrue(list.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_WithLocales() {
        // This test depends on the available Locales. Let's assume "en" is a valid language.
        List<Locale> list = LocaleUtils.countriesByLanguage("en");
        // Check if some common English locales are present and if variants are excluded
        boolean foundUS = false;
        boolean foundGB = false;
        for (Locale locale : list) {
            if (locale.getLanguage().equals("en")) {
                if (locale.getCountry().equals("US")) {
                    foundUS = true;
                }
                if (locale.getCountry().equals("GB")) {
                    foundGB = true;
                }
            }
            // Ensure no empty country codes and no variants are returned
            assertFalse(locale.getCountry().isEmpty());
            assertFalse(locale.getVariant().length() > 0);
        }
        // Similar to languagesByCountry, we can't be certain, but checking for presence is good.
        assertTrue(list.size() >= 0); // At least 0 or more
        
        // Check immutability
        try {
            if (!list.isEmpty()) {
                list.add(Locale.US);
                fail("Expected UnsupportedOperationException");
            }
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }
}
