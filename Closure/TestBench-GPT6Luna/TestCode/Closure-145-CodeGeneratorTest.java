package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CodeGeneratorTest {
    @Test
    public void testAsciiStringUsesDoubleQuotes() throws Exception {
        assertEquals("\"abc\"", CodeGenerator.jsString("abc", null));
    }

    @Test
    public void testSingleQuoteEscapesDoubleQuote() throws Exception {
        assertEquals("'a\"b'", CodeGenerator.jsString("a\"b", null));
    }

    @Test
    public void testDoubleQuoteSelectionEscapesSingleQuote() throws Exception {
        assertEquals("\"a'b\\\"c\"", CodeGenerator.jsString("a'b\"c", null));
    }

    @Test
    public void testBackslashAndControlEscapes() throws Exception {
        assertEquals("\"a\\\\\\nb\\tc\\r\"", CodeGenerator.jsString("a\\\nb\tc\r", null));
    }

    @Test
    public void testNonAsciiStringIsUnicodeEscaped() throws Exception {
        assertEquals("\"\\u00e9\"", CodeGenerator.jsString("\u00e9", null));
    }

    @Test
    public void testSupplementaryCharacterEscapesAsSurrogatePair() throws Exception {
        assertEquals("\"\\ud83d\\ude00\"", CodeGenerator.jsString("\ud83d\ude00", null));
    }

    @Test
    public void testJsStringEscapesScriptTerminatorCaseInsensitively() throws Exception {
        assertEquals("\"<\\/ScRiPt\"", CodeGenerator.jsString("</ScRiPt", null));
    }

    @Test
    public void testJsStringEscapesClosingHtmlComment() throws Exception {
        assertEquals("\"--\\>\"", CodeGenerator.jsString("-->", null));
    }

    @Test
    public void testJsStringEscapesClosingCdata() throws Exception {
        assertEquals("\"]]\\>\"", CodeGenerator.jsString("]]>", null));
    }

    @Test
    public void testRegexpEscapeEscapesDelimitersAndBackslash() throws Exception {
        assertEquals("//a\\b/", CodeGenerator.regexpEscape("/a\\b"));
    }

    @Test
    public void testRegexpEscapeDoesNotEscapeGreaterThanWithoutDangerousPrefix() throws Exception {
        assertEquals("/a>b/", CodeGenerator.regexpEscape("a>b"));
    }

    @Test
    public void testExplicitDoubleQuotedEscape() throws Exception {
        assertEquals("\"a\\\"b'c\\\\d\"", CodeGenerator.escapeToDoubleQuotedJsString("a\"b'c\\d"));
    }

    @Test
    public void testLatinIdentifierPassesThrough() throws Exception {
        assertEquals("alpha_1", CodeGenerator.identifierEscape("alpha_1"));
    }

    @Test
    public void testIdentifierEscapesNonAsciiAndPreservesAscii() throws Exception {
        assertEquals("a\\u00e9", CodeGenerator.identifierEscape("a\u00e9"));
    }

    @Test
    public void testIdentifierEscapesControlCharacter() throws Exception {
        assertEquals("\u0001a", CodeGenerator.identifierEscape("\u0001a"));
    }

    @Test
    public void testIdentifierEscapesSupplementaryCharacterAsPair() throws Exception {
        assertEquals("\\ud83d\\ude00", CodeGenerator.identifierEscape("\ud83d\ude00"));
    }

    @Test
    public void testUsAsciiEncoderEscapesNonAsciiString() throws Exception {
        CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
        assertEquals("\"\\u00e9\"", CodeGenerator.jsString("\u00e9", encoder));
    }

    @Test
    public void testLatin1EncoderKeepsRepresentableCharacter() throws Exception {
        CharsetEncoder encoder = Charset.forName("ISO-8859-1").newEncoder();
        assertEquals("\"\u00e9\"", CodeGenerator.jsString("\u00e9", encoder));
    }

    @Test
    public void testLatin1EncoderEscapesUnrepresentableCharacter() throws Exception {
        CharsetEncoder encoder = Charset.forName("ISO-8859-1").newEncoder();
        assertEquals("\"\\u20ac\"", CodeGenerator.jsString("\u20ac", encoder));
    }

    @Test
    public void testEmptyString() throws Exception {
        assertEquals("\"\"", CodeGenerator.jsString("", null));
    }
}
