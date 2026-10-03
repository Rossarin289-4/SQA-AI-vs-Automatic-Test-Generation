package org.apache.commons.lang;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.junit.Test;

public class StringUtilsLang40Test {

    @Test
    public void testContainsIgnoreCaseIsNotAffectedByTurkishLocale() {
        Locale original = Locale.getDefault();

        try {
            Locale.setDefault(new Locale("tr", "TR"));

            assertTrue(
                StringUtils.containsIgnoreCase("DIGITAL", "digital")
            );
        } finally {
            Locale.setDefault(original);
        }
    }

    @Test
    public void testContainsIgnoreCaseWithMixedTextUnderTurkishLocale() {
        Locale original = Locale.getDefault();

        try {
            Locale.setDefault(new Locale("tr", "TR"));

            assertTrue(
                StringUtils.containsIgnoreCase(
                    "The SILVER Device",
                    "silver"
                )
            );
        } finally {
            Locale.setDefault(original);
        }
    }

    @Test
    public void testContainsIgnoreCaseWithUppercaseTextAndLowercaseSearch() {
        Locale original = Locale.getDefault();

        try {
            Locale.setDefault(new Locale("tr", "TR"));

            assertTrue(
                StringUtils.containsIgnoreCase(
                    "MINIMUM VALUE",
                    "minimum"
                )
            );
        } finally {
            Locale.setDefault(original);
        }
    }

    @Test
    public void testContainsIgnoreCaseDoesNotMatchDifferentLetters() {
        Locale original = Locale.getDefault();

        try {
            Locale.setDefault(new Locale("tr", "TR"));

            assertFalse(
                StringUtils.containsIgnoreCase(
                    "DIGITAL",
                    "digitalx"
                )
            );
        } finally {
            Locale.setDefault(original);
        }
    }

    @Test
    public void testContainsIgnoreCaseNormalCaseInsensitiveMatch() {
        Locale original = Locale.getDefault();

        try {
            Locale.setDefault(new Locale("tr", "TR"));

            assertTrue(
                StringUtils.containsIgnoreCase(
                    "Computer Science",
                    "SCIENCE"
                )
            );
        } finally {
            Locale.setDefault(original);
        }
    }
}
