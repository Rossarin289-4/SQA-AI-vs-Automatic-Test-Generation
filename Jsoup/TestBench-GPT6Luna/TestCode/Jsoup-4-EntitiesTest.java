package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntitiesTest {
    @Test
    public void testUnescapeReturnsTextWithoutAmpersandUnchanged() throws Exception {
        assertEquals("plain text", Entities.unescape("plain text"));
    }

    @Test
    public void testUnescapePreservesUnknownNamedEntity() throws Exception {
        assertEquals("&unknown;", Entities.unescape("&unknown;"));
    }

    @Test
    public void testUnescapeNamedAmpersandWithSemicolon() throws Exception {
        assertEquals("&", Entities.unescape("&amp;"));
    }

    @Test
    public void testUnescapeBaseNameWithoutSemicolon() throws Exception {
        assertEquals("&", Entities.unescape("&amp"));
    }

    @Test
    public void testUnescapeExtendedNamedEntity() throws Exception {
        assertEquals("\u03B1", Entities.unescape("&alpha;"));
    }

    @Test
    public void testUnescapeNameMatchingIsCaseSensitive() throws Exception {
        assertEquals("&aMP;", Entities.unescape("&aMP;"));
    }

    @Test
    public void testUnescapeDecimalCharacterReference() throws Exception {
        assertEquals("A", Entities.unescape("&#65;"));
    }

    @Test
    public void testUnescapeDecimalReferenceWithoutSemicolon() throws Exception {
        assertEquals("A", Entities.unescape("&#65"));
    }

    @Test
    public void testUnescapeLowercaseHexReference() throws Exception {
        assertEquals("A", Entities.unescape("&#x41;"));
    }

    @Test
    public void testUnescapeUppercaseHexPrefix() throws Exception {
        assertEquals("A", Entities.unescape("&#X41;"));
    }

    @Test
    public void testUnescapeKeepsReferenceOutsideCharacterRange() throws Exception {
        assertEquals("\u0000", Entities.unescape("&#65536;"));
    }

    @Test
    public void testUnescapeKeepsDecimalIntegerOverflowReference() throws Exception {
        assertEquals("&#2147483648;", Entities.unescape("&#2147483648;"));
    }

    @Test
    public void testUnescapeKeepsHexIntegerOverflowReference() throws Exception {
        assertEquals("&#x80000000;", Entities.unescape("&#x80000000;"));
    }

    @Test
    public void testUnescapeHandlesAdjacentReferences() throws Exception {
        assertEquals("&A", Entities.unescape("&amp;&#65;"));
    }

    @Test
    public void testUnescapeLeavesMalformedNumericReference() throws Exception {
        assertEquals("&#x;", Entities.unescape("&#x;"));
    }

    @Test
    public void testUnescapeLeavesUnterminatedAmpersand() throws Exception {
        assertEquals("&", Entities.unescape("&"));
    }

    @Test
    public void testEscapeBaseAmpersand() throws Exception {
        assertEquals("&amp;", Entities.escape("&", Charset.forName("UTF-8").newEncoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeBaseLessThanAndGreaterThan() throws Exception {
        assertEquals("&lt;&gt;", Entities.escape("<>", Charset.forName("UTF-8").newEncoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeExtendedEntity() throws Exception {
        assertEquals("&alpha;", Entities.escape("\u03B1", Charset.forName("UTF-8").newEncoder(), Entities.EscapeMode.extended));
    }

    @Test
    public void testEscapeBaseUsesNumericReferenceForUnmappedUnicode() throws Exception {
        assertEquals("&#945;", Entities.escape("\u03B1", Charset.forName("US-ASCII").newEncoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeUsesEncoderForUnmappedCharacter() throws Exception {
        assertEquals("\u03B1", Entities.escape("\u03B1", Charset.forName("UTF-8").newEncoder(), Entities.EscapeMode.base));
    }

    @Test
    public void testEscapeReplacesUnencodableCharacterNumerically() throws Exception {
        assertEquals("&eacute;", Entities.escape("\u00E9", Charset.forName("US-ASCII").newEncoder(), Entities.EscapeMode.extended));
    }

    @Test
    public void testEscapeEmptyString() throws Exception {
        assertEquals("", Entities.escape("", Charset.forName("UTF-8").newEncoder(), Entities.EscapeMode.base));
    }
}
