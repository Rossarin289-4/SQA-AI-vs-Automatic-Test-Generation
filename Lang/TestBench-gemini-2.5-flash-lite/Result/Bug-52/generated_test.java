package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.exception.NestableRuntimeException;

public class StringEscapeUtilsTest {

    // --- Java and JavaScript Escaping/Unescaping ---

    @Test
    public void testEscapeJavaNull() throws Exception {
        assertEquals(null, StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void testEscapeJavaEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJavaBasic() throws Exception {
        // Original: assertEquals("He didn\\'t say, \\\"Stop!\\\"", StringEscapeUtils.escapeJava("He didn't say, \"Stop!\""));
        // The ' character should not be escaped in Java.
        assertEquals("He didn't say, \\\"Stop!\\\"", StringEscapeUtils.escapeJava("He didn't say, \"Stop!\""));
    }

    @Test
    public void testEscapeJavaSpecialChars() throws Exception {
        assertEquals("\\b\\t\\n\\f\\r", StringEscapeUtils.escapeJava("\b\t\n\f\r"));
    }
    
    @Test
    public void testEscapeJavaUnicode() throws Exception {
        // Original: assertEquals("\\u0041\\u00E1", StringEscapeUtils.escapeJava("A\u00E1"));
        // The unicode escape for 'A' should be \u0041
        assertEquals("\\u0041\\u00E1", StringEscapeUtils.escapeJava("A\u00E1"));
    }

    @Test
    public void testEscapeJavaUnicodeAbove0xff() throws Exception {
        assertEquals("\\u1234", StringEscapeUtils.escapeJava("\u1234"));
    }
    
    @Test
    public void testEscapeJavaUnicodeAbove0xfff() throws Exception {
        assertEquals("\\u4000", StringEscapeUtils.escapeJava("\u4000"));
    }

    @Test
    public void testEscapeJavaScriptNull() throws Exception {
        assertEquals(null, StringEscapeUtils.escapeJavaScript(null));
    }

    @Test
    public void testEscapeJavaScriptEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.escapeJavaScript(""));
    }

    @Test
    public void testEscapeJavaScriptBasic() throws Exception {
        // Original: assertEquals("He \\'didn\\'t say, \\\"Stop!\\\"", StringEscapeUtils.escapeJavaScript("He didn't say, \"Stop!\""));
        // Both single and double quotes should be escaped in JavaScript.
        assertEquals("He \\'didn\\'t say, \\\"Stop!\\\"", StringEscapeUtils.escapeJavaScript("He didn't say, \"Stop!\""));
    }
    
    @Test
    public void testEscapeJavaScriptSpecialChars() throws Exception {
        assertEquals("\\b\\t\\n\\f\\r", StringEscapeUtils.escapeJavaScript("\b\t\n\f\r"));
    }

    @Test
    public void testUnescapeJavaNull() throws Exception {
        assertEquals(null, StringEscapeUtils.unescapeJava(null));
    }

    @Test
    public void testUnescapeJavaEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void testUnescapeJavaBasic() throws Exception {
        // Original: assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJava("He didn\\'t say, \\\"Stop!\\\""));
        // Unescaping of Java strings should handle escaped single quotes as well.
        assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJava("He didn\\'t say, \\\"Stop!\\\""));
    }
    
    @Test
    public void testUnescapeJavaSpecialChars() throws Exception {
        assertEquals("\b\t\n\f\r", StringEscapeUtils.unescapeJava("\\b\\t\\n\\f\\r"));
    }

    @Test
    public void testUnescapeJavaUnicode() throws Exception {
        assertEquals("A\u00E1", StringEscapeUtils.unescapeJava("\\u0041\\u00e1"));
    }

    @Test
    public void testUnescapeJavaUnicodeAbove0xff() throws Exception {
        assertEquals("\u1234", StringEscapeUtils.unescapeJava("\\u1234"));
    }

    @Test
    public void testUnescapeJavaScriptNull() throws Exception {
        assertEquals(null, StringEscapeUtils.unescapeJavaScript(null));
    }
    
    @Test
    public void testUnescapeJavaScriptEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.unescapeJavaScript(""));
    }

    @Test
    public void testUnescapeJavaScriptBasic() throws Exception {
        // Original: assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJavaScript("He \\'didn\\'t say, \\\"Stop!\\\""));
        // JavaScript unescaping should correctly handle escaped single and double quotes.
        assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJavaScript("He \\'didn\\'t say, \\\"Stop!\\\""));
    }

    // --- HTML Escaping/Unescaping ---

    @Test
    public void testEscapeHtmlNull() throws Exception {
        assertEquals(null, StringEscapeUtils.escapeHtml(null));
    }

    @Test
    public void testEscapeHtmlEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.escapeHtml(""));
    }

    @Test
    public void testEscapeHtmlBasic() throws Exception {
        assertEquals("&quot;bread&quot; &amp; &quot;butter&quot;", StringEscapeUtils.escapeHtml("\"bread\" & \"butter\""));
    }

    @Test
    public void testEscapeHtmlUnescapeHtml() throws Exception {
        String input = "\"bread\" & \"butter\"";
        String escaped = StringEscapeUtils.escapeHtml(input);
        assertEquals(input, StringEscapeUtils.unescapeHtml(escaped));
    }
    
    @Test
    public void testUnescapeHtmlUnknownEntity() throws Exception {
        assertEquals("test&zzzz;x", StringEscapeUtils.unescapeHtml("test&zzzz;x"));
    }
    
    @Test
    public void testUnescapeHtmlRecognizedEntity() throws Exception {
        assertEquals("<Fran\u00E7ais>", StringEscapeUtils.unescapeHtml("&lt;Fran&ccedil;ais&gt;"));
    }

    // --- XML Escaping/Unescaping ---

    @Test
    public void testEscapeXmlNull() throws Exception {
        assertEquals(null, StringEscapeUtils.escapeXml((String) null));
    }

    @Test
    public void testEscapeXmlEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.escapeXml(""));
    }

    @Test
    public void testEscapeXmlBasic() throws Exception {
        assertEquals("&quot;bread&quot; &amp; &quot;butter&quot;", StringEscapeUtils.escapeXml("\"bread\" & \"butter\""));
    }
    
    @Test
    public void testEscapeXmlWriter() throws Exception {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeXml(writer, "\"bread\" & \"butter\"");
        assertEquals("&quot;bread&quot; &amp; &quot;butter&quot;", writer.toString());
    }

    @Test
    public void testUnescapeXmlNull() throws Exception {
        assertEquals(null, StringEscapeUtils.unescapeXml((String) null));
    }
    
    @Test
    public void testUnescapeXmlEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.unescapeXml(""));
    }

    @Test
    public void testUnescapeXmlBasic() throws Exception {
        assertEquals("\"bread\" & \"butter\"", StringEscapeUtils.unescapeXml("&quot;bread&quot; &amp; &quot;butter&quot;"));
    }
    
    @Test
    public void testUnescapeXmlWriter() throws Exception {
        StringWriter writer = new StringWriter();
        StringEscapeUtils.unescapeXml(writer, "&quot;bread&quot; &amp; &quot;butter&quot;");
        assertEquals("\"bread\" & \"butter\"", writer.toString());
    }
    
    // --- SQL Escaping ---

    @Test
    public void testEscapeSqlNull() throws Exception {
        assertEquals(null, StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeSqlEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.escapeSql(""));
    }

    @Test
    public void testEscapeSqlBasic() throws Exception {
        assertEquals("McHale''s Navy", StringEscapeUtils.escapeSql("McHale's Navy"));
    }
    
    @Test
    public void testEscapeSqlNoSingleQuote() throws Exception {
        assertEquals("No single quote", StringEscapeUtils.escapeSql("No single quote"));
    }
    
    @Test
    public void testEscapeSqlMultipleSingleQuotes() throws Exception {
        assertEquals("It''s \"my'' own'' fault''", StringEscapeUtils.escapeSql("It's \"my' own' fault'"));
    }
}
