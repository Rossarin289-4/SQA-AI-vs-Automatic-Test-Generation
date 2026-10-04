package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.exception.NestableRuntimeException;

public class StringEscapeUtilsTest {
    @Test
    public void testEscapeJavaNull() throws Exception {
        assertEquals(null, StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void testEscapeJavaEscapesControlsAndQuotes() throws Exception {
        assertEquals("\\b\\n\\t\\f\\r\\u0001\\\"\\\\\\/",
                StringEscapeUtils.escapeJava("\b\n\t\f\r\u0001\"\\/"));
    }

    @Test
    public void testEscapeJavaUnicodeRanges() throws Exception {
        assertEquals("\u007F\\u0080\\u0100\\u1000\\uFFFF",
                StringEscapeUtils.escapeJava("\u007F\u0080\u0100\u1000\uFFFF"));
    }

    @Test
    public void testEscapeJavaScriptEscapesSingleQuote() throws Exception {
        assertEquals("\\'\\\"\\/", StringEscapeUtils.escapeJavaScript("'\"/"));
    }

    @Test
    public void testUnescapeJavaNullAndPlainText() throws Exception {
        assertEquals(null, StringEscapeUtils.unescapeJava(null));
        assertEquals("plain", StringEscapeUtils.unescapeJava("plain"));
    }

    @Test
    public void testUnescapeJavaSequencesAndUnknownEscape() throws Exception {
        assertEquals("\b\n\t\f\r\"'\\x",
                StringEscapeUtils.unescapeJava("\\b\\n\\t\\f\\r\\\"\\'\\\\\\x"));
    }

    @Test
    public void testUnescapeJavaUnicodeAndTrailingSlash() throws Exception {
        assertEquals("A\u00E9\\", StringEscapeUtils.unescapeJava("\\u0041\\u00e9\\"));
    }

    @Test
    public void testUnescapeJavaInvalidUnicodeThrows() throws Exception {
        try {
            StringEscapeUtils.unescapeJava("\\u0XZ0");
            fail("expected NestableRuntimeException");
        } catch (NestableRuntimeException expected) {
        }
    }

    @Test
    public void testUnescapeJavaScriptUsesJavaRules() throws Exception {
        assertEquals("'x\n", StringEscapeUtils.unescapeJavaScript("\\'x\\n"));
    }

    @Test
    public void testEscapeHtmlNullAndEntities() throws Exception {
        assertEquals(null, StringEscapeUtils.escapeHtml(null));
        assertEquals("&quot;&amp;&lt;&gt;", StringEscapeUtils.escapeHtml("\"&<>"));
    }

    @Test
    public void testUnescapeHtmlKnownAndUnknownEntities() throws Exception {
        assertEquals("\"&<>&zzzz;", StringEscapeUtils.unescapeHtml("&quot;&amp;&lt;&gt;&zzzz;"));
    }

    @Test
    public void testEscapeXmlBasicEntities() throws Exception {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, "\"'&<>");
        assertEquals("&quot;&apos;&amp;&lt;&gt;", writer.toString());
    }

    @Test
    public void testUnescapeXmlBasicEntitiesAndUnknownEntity() throws Exception {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, "&quot;&apos;&amp;&lt;&gt;&unknown;");
        assertEquals("\"'&<>&unknown;", writer.toString());
    }

    @Test
    public void testEscapeXmlNullInputDoesNotWrite() throws Exception {
        StringWriter writer = new StringWriter();
        writer.write("start");
        StringEscapeUtils.escapeXml(writer, null);
        assertEquals("start", writer.toString());
    }

    @Test
    public void testUnescapeXmlNullInputDoesNotWrite() throws Exception {
        StringWriter writer = new StringWriter();
        writer.write("start");
        StringEscapeUtils.unescapeXml(writer, null);
        assertEquals("start", writer.toString());
    }

    @Test
    public void testEscapeSqlDoublesEveryQuote() throws Exception {
        assertEquals("a''b''''c", StringEscapeUtils.escapeSql("a'b''c"));
    }

    @Test
    public void testEscapeSqlNullAndNoQuotes() throws Exception {
        assertEquals(null, StringEscapeUtils.escapeSql(null));
        assertEquals("a%_b", StringEscapeUtils.escapeSql("a%_b"));
    }

    @Test
    public void testEscapeJavaAndScriptDifferOnSingleQuote() throws Exception {
        assertEquals("'", StringEscapeUtils.escapeJava("'"));
        assertEquals("\\'", StringEscapeUtils.escapeJavaScript("'"));
    }
}
