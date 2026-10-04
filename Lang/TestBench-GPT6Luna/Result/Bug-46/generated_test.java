package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.exception.NestableRuntimeException;

public class StringEscapeUtilsTest {
    @Test
    public void testEscapeJavaNullAndEmpty() throws Exception {
        assertNull(StringEscapeUtils.escapeJava(null));
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJavaControlsAndEscapedPunctuation() throws Exception {
        assertEquals("\\b\\n\\t\\f\\r\\\"\\\\/",
                StringEscapeUtils.escapeJava("\b\n\t\f\r\"\\/"));
    }

    @Test
    public void testEscapeJavaLeavesSingleQuoteAndSlash() throws Exception {
        assertEquals("'/", StringEscapeUtils.escapeJava("'/"));
    }

    @Test
    public void testEscapeJavaUnicodeBoundaries() throws Exception {
        assertEquals("\\u000F\\u0010\u007F\\u0080\\u0100\\u1000",
                StringEscapeUtils.escapeJava("\u000F\u0010\u007F\u0080\u0100\u1000"));
    }

    @Test
    public void testEscapeJavaScriptQuotesSlashAndUnicode() throws Exception {
        assertEquals("\\'\\\"\\/", StringEscapeUtils.escapeJavaScript("'\"/"));
        assertEquals("\\u0100", StringEscapeUtils.escapeJavaScript("\u0100"));
    }

    @Test
    public void testUnescapeJavaEscapeFormsAndUnknownEscape() throws Exception {
        assertEquals("\\'\"\\\r\f\t\n\bq",
                StringEscapeUtils.unescapeJava("\\\\\\'\\\"\\\\\\r\\f\\t\\n\\b\\q"));
    }

    @Test
    public void testUnescapeJavaUnicodeAndTrailingSlash() throws Exception {
        assertEquals("A\\", StringEscapeUtils.unescapeJava("\\u0041\\"));
    }

    @Test
    public void testUnescapeJavaRejectsInvalidUnicodeDigits() throws Exception {
        try {
            StringEscapeUtils.unescapeJava("\\u0xyz");
            fail("expected NestableRuntimeException");
        } catch (NestableRuntimeException expected) {
            assertEquals(NestableRuntimeException.class, expected.getClass());
        }
    }

    @Test
    public void testUnescapeJavaScriptMatchesJavaUnescaping() throws Exception {
        assertEquals("\nA", StringEscapeUtils.unescapeJavaScript("\\n\\u0041"));
    }

    @Test
    public void testEscapeHtmlSpecialEntities() throws Exception {
        assertEquals("&quot;&amp;&lt;&gt;", StringEscapeUtils.escapeHtml("\"&<>"));
    }

    @Test
    public void testEscapeHtmlNullAndLatinEntity() throws Exception {
        assertNull(StringEscapeUtils.escapeHtml(null));
        assertEquals("&eacute;", StringEscapeUtils.escapeHtml("\u00E9"));
    }

    @Test
    public void testUnescapeHtmlKnownAndUnknownEntities() throws Exception {
        assertEquals("<é>&unknown;", StringEscapeUtils.unescapeHtml("&lt;&eacute;&gt;&unknown;"));
    }

    @Test
    public void testEscapeXmlWithBasicEntitiesAndUnicode() throws Exception {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, "\"'&<>");
        assertEquals("&quot;&apos;&amp;&lt;&gt;", writer.toString());

        writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, "\u0080");
        assertEquals("&#128;", writer.toString());
    }

    @Test
    public void testEscapeXmlNullInputLeavesWriterAlone() throws Exception {
        StringWriter writer = new StringWriter();
        writer.write("x");
        StringEscapeUtils.escapeXml(writer, null);
        assertEquals("x", writer.toString());
    }

    @Test
    public void testUnescapeXmlBasicAndNumericEntities() throws Exception {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, "&lt;&gt;&quot;&apos;&amp;&#65;");
        assertEquals("<>\"'&A", writer.toString());
    }

    @Test
    public void testUnescapeXmlNullInputLeavesWriterAlone() throws Exception {
        StringWriter writer = new StringWriter();
        writer.write("x");
        StringEscapeUtils.unescapeXml(writer, null);
        assertEquals("x", writer.toString());
    }

    @Test
    public void testEscapeSqlDoublesQuotesOnly() throws Exception {
        assertEquals("McHale''s Navy", StringEscapeUtils.escapeSql("McHale's Navy"));
        assertEquals("a%b_c", StringEscapeUtils.escapeSql("a%b_c"));
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeCsvPlainAndNull() throws Exception {
        assertEquals("plain", StringEscapeUtils.escapeCsv("plain"));
        assertNull(StringEscapeUtils.escapeCsv(null));
    }

    @Test
    public void testEscapeCsvQuotesCommaNewlineAndEmbeddedQuote() throws Exception {
        assertEquals("\"a,b\"", StringEscapeUtils.escapeCsv("a,b"));
        assertEquals("\"a\"\"b\"", StringEscapeUtils.escapeCsv("a\"b"));
        assertEquals("\"a\nb\"", StringEscapeUtils.escapeCsv("a\nb"));
    }

    @Test
    public void testUnescapeCsvNullAndShortInput() throws Exception {
        assertNull(StringEscapeUtils.unescapeCsv(null));
        assertEquals("\"", StringEscapeUtils.unescapeCsv("\""));
        assertEquals("x", StringEscapeUtils.unescapeCsv("x"));
    }

    @Test
    public void testUnescapeCsvQuotedValuesAndDoubledQuotes() throws Exception {
        assertEquals("a,b", StringEscapeUtils.unescapeCsv("\"a,b\""));
        assertEquals("a\"b", StringEscapeUtils.unescapeCsv("\"a\"\"b\""));
    }

    @Test
    public void testUnescapeCsvLeavesUnquotedAndUnneededQuotesAlone() throws Exception {
        assertEquals("a,b", StringEscapeUtils.unescapeCsv("a,b"));
        assertEquals("\"plain\"", StringEscapeUtils.unescapeCsv("\"plain\""));
    }
}
