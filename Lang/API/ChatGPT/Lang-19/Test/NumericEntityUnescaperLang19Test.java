package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumericEntityUnescaperLang19Test {

    @Test
    public void testDecimalEntityAtEndWithoutSemicolon() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();

        String result = unescaper.translate("&#90");

        assertEquals("Z", result);
    }

    @Test
    public void testHexEntityAtEndWithoutSemicolon() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();

        String result = unescaper.translate("&#x4A");

        assertEquals("J", result);
    }

    @Test
    public void testDecimalEntityFollowedByTextWithoutSemicolon() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();

        String result = unescaper.translate("&#90tail");

        assertEquals("Ztail", result);
    }

    @Test
    public void testHexEntityFollowedByTextWithoutSemicolon() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();

        String result = unescaper.translate("&#x4Atail");

        assertEquals("Jtail", result);
    }

    @Test
    public void testIncompleteHexPrefixAtEndOfInput() {
        NumericEntityUnescaper unescaper = new NumericEntityUnescaper();

        String result = unescaper.translate("&#x");

        assertEquals("&#x", result);
    }
}
