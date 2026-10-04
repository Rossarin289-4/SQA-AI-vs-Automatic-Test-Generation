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
    public void testToLocaleNull() throws Exception {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocaleLanguageOnly() throws Exception {
        assertEquals(new Locale("en", ""), LocaleUtils.toLocale("en"));
    }

    @Test
    public void testToLocaleCountry() throws Exception {
        assertEquals(new Locale("en", "GB"), LocaleUtils.toLocale("en_GB"));
    }

    @Test
    public void testToLocaleVariantWithoutCountry() throws Exception {
        assertEquals(new Locale("en", "", "x"), LocaleUtils.toLocale("en__x"));
    }

    @Test
    public void testToLocaleCountryAndVariant() throws Exception {
        assertEquals(new Locale("fr", "CA", "abc"), LocaleUtils.toLocale("fr_CA_abc"));
    }

    @Test
    public void testToLocaleRejectsOneCharacterLanguage() throws Exception {
        try {
            LocaleUtils.toLocale("e");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToLocaleRejectsUppercaseLanguage() throws Exception {
        try {
            LocaleUtils.toLocale("EN");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToLocaleRejectsLowercaseCountry() throws Exception {
        try {
            LocaleUtils.toLocale("en_gb");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testToLocaleRejectsMissingCountrySeparator() throws Exception {
        try {
            LocaleUtils.toLocale("enGBX");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testLocaleLookupVariantAndDefault() throws Exception {
        Locale start = new Locale("fr", "CA", "x");
        List expected = Arrays.asList(start, new Locale("fr", "CA"), new Locale("fr", ""));
        assertEquals(expected, LocaleUtils.localeLookupList(start));
    }

    @Test
    public void testLocaleLookupOmitsDuplicateDefault() throws Exception {
        Locale start = new Locale("fr", "CA");
        assertEquals(Arrays.asList(start, new Locale("fr", "")),
                LocaleUtils.localeLookupList(start, new Locale("fr", "CA")));
    }

    @Test
    public void testLocaleLookupAddsDistinctDefault() throws Exception {
        Locale start = new Locale("fr", "CA");
        assertEquals(Arrays.asList(start, new Locale("fr", ""), Locale.ENGLISH),
                LocaleUtils.localeLookupList(start, Locale.ENGLISH));
    }

    @Test
    public void testLocaleLookupNullLocaleIsEmpty() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.localeLookupList(null, Locale.ENGLISH));
    }

    @Test
    public void testAvailableLocaleListContainsRoot() throws Exception {
        assertTrue(LocaleUtils.availableLocaleList().contains(new Locale("", "")));
    }

    @Test
    public void testAvailableLocaleListIsUnmodifiable() throws Exception {
        try {
            LocaleUtils.availableLocaleList().add(Locale.ENGLISH);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertTrue(LocaleUtils.availableLocaleList().contains(Locale.ENGLISH));
    }

    @Test
    public void testAvailableLocaleSetContainsListedLocales() throws Exception {
        Set set = LocaleUtils.availableLocaleSet();
        assertEquals(LocaleUtils.availableLocaleList().size(), set.size());
        assertTrue(set.containsAll(LocaleUtils.availableLocaleList()));
    }

    @Test
    public void testAvailableLocaleSetIsUnmodifiable() throws Exception {
        try {
            LocaleUtils.availableLocaleSet().add(Locale.ENGLISH);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertTrue(LocaleUtils.availableLocaleSet().containsAll(LocaleUtils.availableLocaleList()));
    }

    @Test
    public void testIsAvailableLocaleForKnownLocale() throws Exception {
        Locale locale = (Locale) LocaleUtils.availableLocaleList().get(0);
        assertTrue(LocaleUtils.isAvailableLocale(locale));
    }

    @Test
    public void testIsAvailableLocaleForUnknownLocale() throws Exception {
        assertFalse(LocaleUtils.isAvailableLocale(new Locale("zz", "ZZ", "unlikely")));
    }

    @Test
    public void testIsAvailableLocaleNull() throws Exception {
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    @Test
    public void testLanguagesByCountryIncludesMatchingLocale() throws Exception {
        List languages = LocaleUtils.languagesByCountry("US");
        assertTrue(languages.contains(new Locale("en", "US")));
        for (int i = 0; i < languages.size(); i++) {
            assertEquals("US", ((Locale) languages.get(i)).getCountry());
            assertEquals("", ((Locale) languages.get(i)).getVariant());
        }
    }

    @Test
    public void testLanguagesByCountryNullIsEmpty() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.languagesByCountry(null));
    }

    @Test
    public void testCountriesByLanguageIncludesMatchingLocale() throws Exception {
        List countries = LocaleUtils.countriesByLanguage("en");
        assertTrue(countries.contains(new Locale("en", "US")));
        for (int i = 0; i < countries.size(); i++) {
            Locale locale = (Locale) countries.get(i);
            assertEquals("en", locale.getLanguage());
            assertTrue(locale.getCountry().length() > 0);
            assertEquals("", locale.getVariant());
        }
    }

    @Test
    public void testCountriesByLanguageNullIsEmpty() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.countriesByLanguage(null));
    }
}
