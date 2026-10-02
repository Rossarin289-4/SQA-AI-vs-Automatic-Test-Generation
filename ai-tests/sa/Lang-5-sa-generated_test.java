package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class LocaleUtilsSATest {

    @Test
    public void test01_language_only_en() {
        assertEquals("en", LocaleUtils.toLocale("en").getLanguage());
    }

    @Test
    public void test02_language_country_fr_ca() {
        assertEquals("CA", LocaleUtils.toLocale("fr_CA").getCountry());
    }

    @Test
    public void test03_language_country_variant() {
        assertEquals("POSIX", LocaleUtils.toLocale("en_US_POSIX").getVariant());
    }

    @Test
    public void test04_country_only_jp() {
        assertEquals("JP", LocaleUtils.toLocale("_JP").getCountry());
    }

    @Test
    public void test05_country_only_with_variant() {
        assertEquals("X", LocaleUtils.toLocale("_DE_X").getVariant());
    }

    @Test
    public void test06_invalid_upper_language() {
        expectIllegalArgument("EN_US");
    }

    @Test
    public void test07_invalid_mixed_language() {
        expectIllegalArgument("eN_US");
    }

    @Test
    public void test08_invalid_lower_country() {
        expectIllegalArgument("en_us");
    }

    @Test
    public void test09_invalid_single_character() {
        expectIllegalArgument("e");
    }

    @Test
    public void test10_invalid_missing_separator() {
        expectIllegalArgument("enUS");
    }

    @Test
    public void test11_invalid_lower_country_only() {
        expectIllegalArgument("_de");
    }

    @Test
    public void test12_invalid_empty_country_only() {
        expectIllegalArgument("_");
    }

    private void expectIllegalArgument(String value) {
        try {
            LocaleUtils.toLocale(value);
            fail("Expected IllegalArgumentException for: " + value);
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }
}
