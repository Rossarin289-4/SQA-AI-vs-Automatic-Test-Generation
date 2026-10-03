package org.apache.commons.lang;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Locale;

import org.junit.Test;

public class LocaleUtilsLang57Test {

    /**
     * The defect is caused by isAvailableLocale() using the lazily
     * initialized cAvailableLocaleSet directly.
     *
     * This test intentionally does NOT call availableLocaleSet()
     * before calling isAvailableLocale().
     */
    @Test
    public void testIsAvailableLocaleInitializesWithoutExplicitSetAccess() {
        List availableLocales = LocaleUtils.availableLocaleList();

        assertTrue("There should be at least one available locale",
                availableLocales.size() > 0);

        Locale availableLocale =
                (Locale) availableLocales.get(0);

        Locale unavailableLocale =
                new Locale("zz", "ZZ");

        assertTrue(
                "An available locale should be recognized",
                LocaleUtils.isAvailableLocale(availableLocale));

        assertFalse(
                "A locale not present in the available-locale list should "
                        + "not be recognized",
                LocaleUtils.isAvailableLocale(unavailableLocale));

        assertFalse(
                "null should not be an available locale",
                LocaleUtils.isAvailableLocale(null));
    }

    /**
     * Regression test: isAvailableLocale() should agree with the
     * cached list of available locales.
     */
    @Test
    public void testIsAvailableLocaleAgreesWithAvailableLocaleList() {
        List availableLocales = LocaleUtils.availableLocaleList();

        assertTrue("There should be at least one available locale",
                availableLocales.size() > 0);

        Locale locale =
                (Locale) availableLocales.get(availableLocales.size() - 1);

        assertTrue(
                "A locale contained in availableLocaleList() must be "
                        + "reported as available",
                LocaleUtils.isAvailableLocale(locale));
    }

    /**
     * Regression/boundary test for a locale that should not be present
     * in the JVM's installed locale list.
     */
    @Test
    public void testIsAvailableLocaleRejectsUnknownLocale() {
        Locale unknownLocale =
                new Locale("zz", "ZZ", "NON_EXISTENT_VARIANT");

        assertFalse(
                "A clearly unknown locale should not be reported as available",
                LocaleUtils.isAvailableLocale(unknownLocale));
    }
}
