package org.apache.commons.lang3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilsLang14Test {

    @Test
    public void testEqualsStringBuilderWithString() {
        CharSequence first = new StringBuilder("alpha");
        CharSequence second = "alpha";

        assertTrue(StringUtils.equals(first, second));
    }

    @Test
    public void testEqualsStringWithStringBuilder() {
        CharSequence first = "bravo";
        CharSequence second = new StringBuilder("bravo");

        assertTrue(StringUtils.equals(first, second));
    }

    @Test
    public void testEqualsDifferentStringBuildersWithSameContent() {
        CharSequence first = new StringBuilder("delta");
        CharSequence second = new StringBuilder("delta");

        assertTrue(StringUtils.equals(first, second));
    }

    @Test
    public void testEqualsEmptyStringBuilderWithEmptyString() {
        CharSequence first = new StringBuilder();
        CharSequence second = "";

        assertTrue(StringUtils.equals(first, second));
    }

    @Test
    public void testEqualsDifferentCharSequenceContent() {
        CharSequence first = new StringBuilder("echo");
        CharSequence second = "ecHo";

        assertFalse(StringUtils.equals(first, second));
    }

    @Test
    public void testEqualsNullAndNonNullCharSequence() {
        CharSequence first = null;
        CharSequence second = new StringBuilder("foxtrot");

        assertFalse(StringUtils.equals(first, second));
    }
}
