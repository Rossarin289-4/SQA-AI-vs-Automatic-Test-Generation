package org.apache.commons.lang;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;

/**
 * Independent JUnit 4.12 test suite targeting the defect in LocaleUtils.isAvailableLocale.
 */
public class LocaleUtilsDefectTest {

    @Test
    public void testIsAvailableLocaleWithoutPriorSetInitialization() {
        // This test invokes isAvailableLocale directly. 
        // In the buggy version, if cAvailableLocaleSet is null, this throws a NullPointerException.
        // In the fixed version, it uses availableLocaleList().contains(locale), which is safe.
        boolean result = LocaleUtils.isAvailableLocale(Locale.US);
        assertTrue("Locale.US should be available", result);
    }

    @Test
    public void testIsAvailableLocaleWithNullInput() {
        // Verify behavior with null locale input.
        boolean result = LocaleUtils.isAvailableLocale(null);
        assertFalse("Null locale should not be available", result);
    }

    @Test
    public void testIsAvailableLocaleWithCustomLocale() {
        // Verify behavior with a custom constructed locale unlikely to be in available locales.
        Locale customLocale = new Locale("xx", "YY", "zz");
        boolean result = LocaleUtils.isAvailableLocale(customLocale);
        assertFalse("Custom dummy locale should not be available", result);
    }
}
