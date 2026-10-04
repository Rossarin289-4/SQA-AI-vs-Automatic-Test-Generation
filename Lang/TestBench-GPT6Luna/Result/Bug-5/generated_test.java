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
    @Test
    public void testToLocaleNull() throws Exception {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocaleLanguageAtMinimumLength() throws Exception {
        assertEquals(new Locale("en"), LocaleUtils.toLocale("en"));
    }

    @Test
    public void testToLocaleRejectsOneCharacter() throws Exception {
        try { LocaleUtils.toLocale("e"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToLocaleRejectsUppercaseLanguage() throws Exception {
        try { LocaleUtils.toLocale("En"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToLocaleCountryAtMinimumLength() throws Exception {
        assertEquals(new Locale("en", "GB"), LocaleUtils.toLocale("en_GB"));
    }

    @Test
    public void testToLocaleRejectsLowercaseCountry() throws Exception {
        try { LocaleUtils.toLocale("en_gb"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToLocaleLanguageVariantWithoutCountry() throws Exception {
        assertEquals(new Locale("en", "", "POSIX"), LocaleUtils.toLocale("en__POSIX"));
    }

    @Test
    public void testToLocaleCountryAndVariant() throws Exception {
        assertEquals(new Locale("en", "GB", "POSIX"), LocaleUtils.toLocale("en_GB_POSIX"));
    }

    @Test
    public void testToLocaleRejectsShortCountryVariant() throws Exception {
        try { LocaleUtils.toLocale("en_GB_"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testToLocaleCountryOnlyAtMinimumLength() throws Exception {
        assertEquals(new Locale("", "GB"), LocaleUtils.toLocale("_GB"));
    }

    @Test
    public void testToLocaleCountryVariant() throws Exception {
        assertEquals(new Locale("", "GB", "POSIX"), LocaleUtils.toLocale("_GB_POSIX"));
    }

    @Test
    public void testToLocaleRejectsShortLeadingUnderscore() throws Exception {
        try { LocaleUtils.toLocale("_G"); fail("expected IllegalArgumentException"); }
        catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testLocaleLookupListWithVariant() throws Exception {
        List<Locale> expected = Arrays.asList(
                new Locale("fr", "CA", "POSIX"), new Locale("fr", "CA"),
                new Locale("fr", ""), new Locale("en"));
        assertEquals(expected, LocaleUtils.localeLookupList(
                new Locale("fr", "CA", "POSIX"), new Locale("en")));
    }

    @Test
    public void testLocaleLookupListAvoidsDuplicateDefault() throws Exception {
        List<Locale> expected = Arrays.asList(new Locale("fr", "CA"), new Locale("fr", ""));
        assertEquals(expected, LocaleUtils.localeLookupList(new Locale("fr", "CA"), new Locale("fr", "")));
    }

    @Test
    public void testLocaleLookupListNullLocaleIsEmpty() throws Exception {
        assertEquals(Collections.emptyList(), LocaleUtils.localeLookupList(null, Locale.ENGLISH));
    }

    @Test
    public void testAvailableLocaleListMatchesJdkLocales() throws Exception {
        assertEquals(new HashSet<Locale>(Arrays.asList(Locale.getAvailableLocales())),
                new HashSet<Locale>(LocaleUtils.availableLocaleList()));
        assertEquals(Locale.getAvailableLocales().length, LocaleUtils.availableLocaleList().size());
    }

    @Test
    public void testAvailableLocaleSetMatchesList() throws Exception {
        assertEquals(new HashSet<Locale>(LocaleUtils.availableLocaleList()), LocaleUtils.availableLocaleSet());
    }

    @Test
    public void testIsAvailableLocaleForJdkLocale() throws Exception {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
    }

    @Test
    public void testIsAvailableLocaleForNull() throws Exception {
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    @Test
    public void testLanguagesByCountryFiltersAndIncludesLocales() throws Exception {
        List<Locale> expected = new ArrayList<Locale>();
        for (Locale locale : LocaleUtils.availableLocaleList()) {
            if ("US".equals(locale.getCountry()) && locale.getVariant().isEmpty()) {
                expected.add(locale);
            }
        }
        assertEquals(expected, LocaleUtils.languagesByCountry("US"));
    }

    @Test
    public void testLanguagesByCountryNullIsEmpty() throws Exception {
        assertEquals(Collections.emptyList(), LocaleUtils.languagesByCountry(null));
    }

    @Test
    public void testCountriesByLanguageFiltersAndIncludesLocales() throws Exception {
        List<Locale> expected = new ArrayList<Locale>();
        for (Locale locale : LocaleUtils.availableLocaleList()) {
            if ("en".equals(locale.getLanguage()) && locale.getCountry().length() != 0
                    && locale.getVariant().isEmpty()) {
                expected.add(locale);
            }
        }
        assertEquals(expected, LocaleUtils.countriesByLanguage("en"));
    }

    @Test
    public void testCountriesByLanguageNullIsEmpty() throws Exception {
        assertEquals(Collections.emptyList(), LocaleUtils.countriesByLanguage(null));
    }
}
