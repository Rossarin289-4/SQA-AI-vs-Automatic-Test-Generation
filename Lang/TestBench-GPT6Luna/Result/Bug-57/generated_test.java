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
        assertEquals(null, LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocaleLanguageOnly() throws Exception {
        assertEquals(new Locale("en", ""), LocaleUtils.toLocale("en"));
    }

    @Test
    public void testToLocaleLanguageCountry() throws Exception {
        assertEquals(new Locale("en", "GB"), LocaleUtils.toLocale("en_GB"));
    }

    @Test
    public void testToLocaleLanguageCountryVariant() throws Exception {
        assertEquals(new Locale("en", "GB", "x"), LocaleUtils.toLocale("en_GB_x"));
    }

    @Test
    public void testToLocaleMinimumAcceptedVariantLength() throws Exception {
        assertEquals(new Locale("en", "GB", "x"), LocaleUtils.toLocale("en_GB_x"));
    }

    @Test
    public void testToLocaleRejectsEmptyString() throws Exception {
        try { LocaleUtils.toLocale(""); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToLocaleRejectsOneCharacterLanguage() throws Exception {
        try { LocaleUtils.toLocale("e"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToLocaleRejectsUppercaseLanguage() throws Exception {
        try { LocaleUtils.toLocale("EN"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToLocaleRejectsWrongSeparator() throws Exception {
        try { LocaleUtils.toLocale("en-GB"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToLocaleRejectsLowercaseCountry() throws Exception {
        try { LocaleUtils.toLocale("en_gb"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToLocaleRejectsVariantWithoutSeparator() throws Exception {
        try { LocaleUtils.toLocale("en_GBxx"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testLocaleLookupWithVariantAndDefault() throws Exception {
        List expected = Arrays.asList(
                new Locale("fr", "CA", "x"),
                new Locale("fr", "CA"),
                new Locale("fr", ""),
                new Locale("en", ""));
        assertEquals(expected, LocaleUtils.localeLookupList(
                new Locale("fr", "CA", "x"), new Locale("en", "")));
    }

    @Test
    public void testLocaleLookupAvoidsDuplicateDefault() throws Exception {
        List expected = Arrays.asList(
                new Locale("fr", "CA"),
                new Locale("fr", ""));
        assertEquals(expected, LocaleUtils.localeLookupList(
                new Locale("fr", "CA"), new Locale("fr", "")));
    }

    @Test
    public void testLocaleLookupWithNullLocaleIsEmpty() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.localeLookupList(null, Locale.US));
    }

    @Test
    public void testLocaleLookupLanguageOnlyIncludesDefaultOnce() throws Exception {
        assertEquals(Arrays.asList(new Locale("fr", ""), Locale.US),
                LocaleUtils.localeLookupList(new Locale("fr", ""), Locale.US));
    }

    @Test
    public void testAvailableLocaleListContainsJdkAvailableLocales() throws Exception {
        List locales = LocaleUtils.availableLocaleList();
        assertTrue(locales.containsAll(Arrays.asList(Locale.getAvailableLocales())));
        assertTrue(locales.size() >= 1);
    }

    @Test
    public void testAvailableLocaleSetMatchesList() throws Exception {
        assertEquals(new HashSet(LocaleUtils.availableLocaleList()),
                LocaleUtils.availableLocaleSet());
    }

    @Test
    public void testAvailableLocaleSetIsUnmodifiable() throws Exception {
        Set locales = LocaleUtils.availableLocaleSet();
        try { locales.add(Locale.US); fail("expected UnsupportedOperationException"); }
        catch (UnsupportedOperationException expected) { }
        assertEquals(new HashSet(LocaleUtils.availableLocaleList()), locales);
    }

    @Test
    public void testIsAvailableLocaleForKnownLocale() throws Exception {
        Locale known = (Locale) LocaleUtils.availableLocaleList().get(0);
        assertTrue(LocaleUtils.isAvailableLocale(known));
    }

    @Test
    public void testIsAvailableLocaleForNull() throws Exception {
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    @Test
    public void testLanguagesByCountryOnlyContainsUnvariedCountryLocales() throws Exception {
        List locales = LocaleUtils.languagesByCountry("US");
        for (int i = 0; i < locales.size(); i++) {
            Locale locale = (Locale) locales.get(i);
            assertEquals("US", locale.getCountry());
            assertEquals("", locale.getVariant());
        }
        assertTrue(locales.size() >= 1);
    }

    @Test
    public void testLanguagesByCountryNullIsEmpty() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.languagesByCountry(null));
    }

    @Test
    public void testCountriesByLanguageOnlyContainsUnvariedCountryLocales() throws Exception {
        List locales = LocaleUtils.countriesByLanguage("en");
        for (int i = 0; i < locales.size(); i++) {
            Locale locale = (Locale) locales.get(i);
            assertEquals("en", locale.getLanguage());
            assertTrue(locale.getCountry().length() != 0);
            assertEquals("", locale.getVariant());
        }
        assertTrue(locales.size() >= 1);
    }

    @Test
    public void testCountriesByLanguageNullIsEmpty() throws Exception {
        assertEquals(Collections.EMPTY_LIST, LocaleUtils.countriesByLanguage(null));
    }
}
