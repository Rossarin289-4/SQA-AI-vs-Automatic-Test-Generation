package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import com.google.debugging.sourcemap.FilePosition;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CodeGeneratorTest {
    @Test
    public void testIsSimpleNumberSingleNonzeroDigit() throws Exception {
        assertTrue(CodeGenerator.isSimpleNumber("7"));
    }

    @Test
    public void testIsSimpleNumberMultipleDigits() throws Exception {
        assertTrue(CodeGenerator.isSimpleNumber("123"));
    }

    @Test
    public void testIsSimpleNumberEmpty() throws Exception {
        assertFalse(CodeGenerator.isSimpleNumber(""));
    }

    @Test
    public void testIsSimpleNumberZero() throws Exception {
        assertFalse(CodeGenerator.isSimpleNumber("0"));
    }

    @Test
    public void testIsSimpleNumberLeadingZero() throws Exception {
        assertFalse(CodeGenerator.isSimpleNumber("01"));
    }

    @Test
    public void testIsSimpleNumberRejectsNondigit() throws Exception {
        assertFalse(CodeGenerator.isSimpleNumber("12a"));
    }

    @Test
    public void testGetSimpleNumberOrdinaryDigits() throws Exception {
        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
    }

    @Test
    public void testGetSimpleNumberRejectsZero() throws Exception {
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("0")));
    }

    @Test
    public void testGetSimpleNumberRejectsLeadingZero() throws Exception {
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("01")));
    }

    @Test
    public void testGetSimpleNumberRejectsNondigit() throws Exception {
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("12a")));
    }

    @Test
    public void testGetSimpleNumberLongMaximum() throws Exception {
        assertTrue(Double.isNaN(
                CodeGenerator.getSimpleNumber("9223372036854775807")));
    }

    @Test
    public void testGetSimpleNumberBeyondLongMaximum() throws Exception {
        assertTrue(Double.isNaN(
                CodeGenerator.getSimpleNumber("9223372036854775808")));
    }

    @Test
    public void testEscapeToDoubleQuotedStringPlainText() throws Exception {
        assertEquals("\"abc\"", CodeGenerator.escapeToDoubleQuotedJsString("abc"));
    }

    @Test
    public void testEscapeToDoubleQuotedStringEscapesQuote() throws Exception {
        assertEquals("\"a\\\"b\"", CodeGenerator.escapeToDoubleQuotedJsString("a\"b"));
    }

    @Test
    public void testEscapeToDoubleQuotedStringEscapesBackslash() throws Exception {
        assertEquals("\"a\\\\b\"", CodeGenerator.escapeToDoubleQuotedJsString("a\\b"));
    }

    @Test
    public void testEscapeToDoubleQuotedStringEscapesNewline() throws Exception {
        assertEquals("\"a\\nb\"", CodeGenerator.escapeToDoubleQuotedJsString("a\nb"));
    }

    @Test
    public void testEscapeToDoubleQuotedStringEscapesNonAscii() throws Exception {
        assertEquals("\"\\u00e9\"", CodeGenerator.escapeToDoubleQuotedJsString("é"));
    }

    @Test
    public void testRegexpEscapeAddsSlashDelimiters() throws Exception {
        assertEquals("/abc/", CodeGenerator.regexpEscape("abc"));
    }

    @Test
    public void testRegexpEscapeEscapesSlash() throws Exception {
        assertEquals("/a/b/", CodeGenerator.regexpEscape("a/b"));
    }

    @Test
    public void testIdentifierEscapeLeavesAsciiIdentifier() throws Exception {
        assertEquals("abc", CodeGenerator.identifierEscape("abc"));
    }

    @Test
    public void testIdentifierEscapeEscapesNonAscii() throws Exception {
        assertEquals("a\\u00e9", CodeGenerator.identifierEscape("aé"));
    }

    @Test
    public void testIdentifierEscapePreservesLatin1ControlCharacter() throws Exception {
        assertEquals("\u0001", CodeGenerator.identifierEscape("\u0001"));
    }
}
