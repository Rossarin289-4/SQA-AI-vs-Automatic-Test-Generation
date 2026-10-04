package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntitiesTest {
    @Test
    public void testUnescapeReturnsUnchangedStringWithoutAmpersand() throws Exception {
        assertEquals("plain text", Entities.unescape("plain text"));
    }

    @Test
    public void testUnescapeEmptyString() throws Exception {
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescapeNamedBaseEntityWithSemicolon() throws Exception {
        assertEquals("&", Entities.unescape("&amp;"));
    }

    @Test
    public void testUnescapeNamedBaseEntityWithoutSemicolon() throws Exception {
        assertEquals("&", Entities.unescape("&amp"));
    }

    @Test
    public void testUnescapeNamedExtendedEntity() throws Exception {
        assertEquals("\u03B1", Entities.unescape("&alpha;"));
    }

    @Test
    public void testUnescapeNameLookupIsCaseSensitive() throws Exception {
        assertEquals("&aMP;", Entities.unescape("&aMP;"));
    }

    @Test
    public void testUnescapeDecimalNumericReference() throws Exception {
        assertEquals("A", Entities.unescape("&#65;"));
    }

    @Test
    public void testUnescapeHexNumericReferenceLowercasePrefix() throws Exception {
        assertEquals("A", Entities.unescape("&#x41;"));
    }

    @Test
    public void testUnescapeHexNumericReferenceUppercasePrefix() throws Exception {
        assertEquals("A", Entities.unescape("&#X41;"));
    }

    @Test
    public void testUnescapeNumericReferenceWithoutSemicolon() throws Exception {
        assertEquals("A", Entities.unescape("&#65"));
    }

    @Test
    public void testUnescapeKeepsUnparseableNumericReference() throws Exception {
        assertEquals("&#999999999999999999999;", Entities.unescape("&#999999999999999999999;"));
    }

    @Test
    public void testUnescapeKeepsReferenceWithNoDigits() throws Exception {
        assertEquals("&#x;", Entities.unescape("&#x;"));
    }

    @Test
    public void testUnescapeKeepsUnrecognizedName() throws Exception {
        assertEquals("&unknown;", Entities.unescape("&unknown;"));
    }

    @Test
    public void testUnescapeZeroNumericReferenceProducesNullCharacter() throws Exception {
        assertEquals("\u0000", Entities.unescape("&#0;"));
    }

    @Test
    public void testUnescapeMaximumUnicodeCodeUnitProducesThatCharacter() throws Exception {
        assertEquals("\uFFFF", Entities.unescape("&#65535;"));
    }

    @Test
    public void testUnescapeKeepsFirstDecimalValueBeyondIntRange() throws Exception {
        assertEquals("&#2147483648;", Entities.unescape("&#2147483648;"));
    }

    @Test
    public void testUnescapeMaximumIntHexReferenceProducesLowCodeUnit() throws Exception {
        assertEquals("\uFFFF", Entities.unescape("&#x7FFFFFFF;"));
    }

    @Test
    public void testUnescapeKeepsHexValueBeyondIntRange() throws Exception {
        assertEquals("&#x80000000;", Entities.unescape("&#x80000000;"));
    }

    @Test
    public void testUnescapeReplacesSeveralReferencesAndPreservesSurroundingText() throws Exception {
        assertEquals("a&bA", Entities.unescape("a&amp;b&#65;"));
    }

    @Test
    public void testUnescapeHandlesAdjacentReferences() throws Exception {
        assertEquals("&A", Entities.unescape("&amp;&#65;"));
    }
}
