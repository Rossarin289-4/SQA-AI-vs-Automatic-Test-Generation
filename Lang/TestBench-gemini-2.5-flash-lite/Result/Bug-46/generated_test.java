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
        assertNull(StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void testEscapeJavaEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJavaBasic() throws Exception {
        assertEquals("He didn\\'t say, \\\"Stop!\\\"", StringEscapeUtils.escapeJava("He didn't say, \"Stop!\""));
    }

    @Test
    public void testEscapeJavaControlChars() throws Exception {
        assertEquals("This is a tab: \\t", StringEscapeUtils.escapeJava("This is a tab: \t"));
        assertEquals("This is a newline: \\n", StringEscapeUtils.escapeJava("This is a newline: \n"));
        assertEquals("This is a backslash: \\\\", StringEscapeUtils.escapeJava("This is a backslash: \\"));
        assertEquals("This is a carriage return: \\r", StringEscapeUtils.escapeJava("This is a carriage return: \r"));
        assertEquals("This is a form feed: \\f", StringEscapeUtils.escapeJava("This is a form feed: \f"));
        assertEquals("This is a backspace: \\b", StringEscapeUtils.escapeJava("This is a backspace: \b"));
    }

    @Test
    public void testEscapeJavaUnicode() throws Exception {
        // Chars above 0xff
        assertEquals("\\u0100", StringEscapeUtils.escapeJava("\u0100"));
        // Chars above 0xfff
        assertEquals("\\u1234", StringEscapeUtils.escapeJava("\u1234"));
        // Chars above 0x7f
        assertEquals("\\u0080", StringEscapeUtils.escapeJava("\u0080"));
        // Chars above 0xf
        assertEquals("\\u0010", StringEscapeUtils.escapeJava("\u0010"));
    }

    @Test
    public void testEscapeJavaScriptNull() throws Exception {
        assertNull(StringEscapeUtils.escapeJavaScript(null));
    }

    @Test
    public void testEscapeJavaScriptEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.escapeJavaScript(""));
    }

    @Test
    public void testEscapeJavaScriptBasic() throws Exception {
        assertEquals("He didn\\'t say, \\\"Stop!\\\"", StringEscapeUtils.escapeJavaScript("He didn't say, \"Stop!\""));
    }

    @Test
    public void testEscapeJavaScriptSingleQuote() throws Exception {
        assertEquals("It\\'s a test.", StringEscapeUtils.escapeJavaScript("It's a test."));
    }

    @Test
    public void testEscapeJavaScriptForwardSlash() throws Exception {
        assertEquals("This is a \\/ forward slash.", StringEscapeUtils.escapeJavaScript("This is a / forward slash."));
    }

    @Test
    public void testUnescapeJavaNull() throws Exception {
        assertNull(StringEscapeUtils.unescapeJava(null));
    }

    @Test
    public void testUnescapeJavaEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void testUnescapeJavaBasic() throws Exception {
        assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJava("He didn\\'t say, \\\"Stop!\\\""));
    }

    @Test
    public void testUnescapeJavaControlChars() throws Exception {
        assertEquals("This is a tab: \t", StringEscapeUtils.unescapeJava("This is a tab: \\t"));
        assertEquals("This is a newline: \n", StringEscapeUtils.unescapeJava("This is a newline: \\n"));
        assertEquals("This is a backslash: \\", StringEscapeUtils.unescapeJava("This is a backslash: \\\\"));
        assertEquals("This is a carriage return: \r", StringEscapeUtils.unescapeJava("This is a carriage return: \\r"));
        assertEquals("This is a form feed: \f", StringEscapeUtils.unescapeJava("This is a form feed: \\f"));
        assertEquals("This is a backspace: \b", StringEscapeUtils.unescapeJava("This is a backspace: \\b"));
    }

    @Test
    public void testUnescapeJavaUnicode() throws Exception {
        assertEquals("\u0100", StringEscapeUtils.unescapeJava("\\u0100"));
        assertEquals("\u1234", StringEscapeUtils.unescapeJava("\\u1234"));
        assertEquals("\u0080", StringEscapeUtils.unescapeJava("\\u0080"));
        assertEquals("\u0010", StringEscapeUtils.unescapeJava("\\u0010"));
        assertEquals("\u000f", StringEscapeUtils.unescapeJava("\\u000f")); // Test unicode below 0x10
    }
    
    @Test
    public void testUnescapeJavaLiteralBackslashAtEnd() throws Exception {
        assertEquals("\\", StringEscapeUtils.unescapeJava("\\"));
    }

    @Test
    public void testUnescapeJavaScriptNull() throws Exception {
        assertNull(StringEscapeUtils.unescapeJavaScript(null));
    }

    @Test
    public void testUnescapeJavaScriptEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.unescapeJavaScript(""));
    }

    @Test
    public void testUnescapeJavaScriptBasic() throws Exception {
        assertEquals("He didn't say, \"Stop!\"", StringEscapeUtils.unescapeJavaScript("He didn\\'t say, \\\"Stop!\\\""));
    }

    @Test
    public void testUnescapeJavaScriptSingleQuote() throws Exception {
        assertEquals("It's a test.", StringEscapeUtils.unescapeJavaScript("It\\'s a test."));
    }

    @Test
    public void testEscapeHtmlNull() throws Exception {
        assertNull(StringEscapeUtils.escapeHtml(null));
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
    public void testEscapeHtmlWithAngleBrackets() throws Exception {
        assertEquals("&lt;tag&gt;", StringEscapeUtils.escapeHtml("<tag>"));
    }
    
    @Test
    public void testEscapeHtmlWithApostrophe() throws Exception {
        // Apostrophe is not escaped by default in HTML40
        assertEquals("It's a test.", StringEscapeUtils.escapeHtml("It's a test."));
    }

    @Test
    public void testUnescapeHtmlNull() throws Exception {
        assertNull(StringEscapeUtils.unescapeHtml(null));
    }

    @Test
    public void testUnescapeHtmlEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.unescapeHtml(""));
    }

    @Test
    public void testUnescapeHtmlBasic() throws Exception {
        assertEquals("\"bread\" & \"butter\"", StringEscapeUtils.unescapeHtml("&quot;bread&quot; &amp; &quot;butter&quot;"));
    }

    @Test
    public void testUnescapeHtmlWithAngleBrackets() throws Exception {
        assertEquals("<tag>", StringEscapeUtils.unescapeHtml("&lt;tag&gt;"));
    }
    
    @Test
    public void testUnescapeHtmlWithApostrophe() throws Exception {
        assertEquals("It's a test.", StringEscapeUtils.unescapeHtml("It's a test."));
    }
    
    @Test
    public void testUnescapeHtmlUnrecognizedEntity() throws Exception {
        assertEquals("&gt;&zzzz;x", StringEscapeUtils.unescapeHtml("&gt;&zzzz;x"));
    }

    @Test
    public void testEscapeXmlNull() throws Exception {
        assertNull(StringEscapeUtils.escapeXml(null));
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
    public void testEscapeXmlWithAngleBrackets() throws Exception {
        assertEquals("&lt;tag&gt;", StringEscapeUtils.escapeXml("<tag>"));
    }
    
    @Test
    public void testEscapeXmlWithApostrophe() throws Exception {
        assertEquals("It&apos;s a test.", StringEscapeUtils.escapeXml("It's a test."));
    }
    
    @Test
    public void testEscapeXmlUnicodeAbove0x7f() throws Exception {
        assertEquals("\\u00E9", StringEscapeUtils.escapeXml("\u00E9"));
    }

    @Test
    public void testUnescapeXmlNull() throws Exception {
        assertNull(StringEscapeUtils.unescapeXml(null));
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
    public void testUnescapeXmlWithAngleBrackets() throws Exception {
        assertEquals("<tag>", StringEscapeUtils.unescapeXml("&lt;tag&gt;"));
    }
    
    @Test
    public void testUnescapeXmlWithApostrophe() throws Exception {
        assertEquals("It's a test.", StringEscapeUtils.unescapeXml("It&apos;s a test."));
    }
    
    @Test
    public void testUnescapeXmlUnicode() throws Exception {
        assertEquals("\u00E9", StringEscapeUtils.unescapeXml("\\u00E9"));
    }

    @Test
    public void testEscapeSqlNull() throws Exception {
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeSqlEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.escapeSql(""));
    }

    @Test
    public void testEscapeSqlBasic() throws Exception {
        assertEquals("It''s a test.", StringEscapeUtils.escapeSql("It's a test."));
    }
    
    @Test
    public void testEscapeSqlNoSingleQuote() throws Exception {
        assertEquals("No single quote here", StringEscapeUtils.escapeSql("No single quote here"));
    }

    @Test
    public void testEscapeCsvNull() throws Exception {
        assertNull(StringEscapeUtils.escapeCsv(null));
    }

    @Test
    public void testEscapeCsvEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.escapeCsv(""));
    }

    @Test
    public void testEscapeCsvNoSpecialChars() throws Exception {
        assertEquals("abc", StringEscapeUtils.escapeCsv("abc"));
    }

    @Test
    public void testEscapeCsvWithComma() throws Exception {
        assertEquals("\"a,b\"", StringEscapeUtils.escapeCsv("a,b"));
    }

    @Test
    public void testEscapeCsvWithQuote() throws Exception {
        assertEquals("\"a\"\"b\"", StringEscapeUtils.escapeCsv("a\"b"));
    }

    @Test
    public void testEscapeCsvWithNewline() throws Exception {
        assertEquals("\"a\nb\"", StringEscapeUtils.escapeCsv("a\nb"));
    }
    
    @Test
    public void testEscapeCsvWithAllSpecialChars() throws Exception {
        assertEquals("\"a,b\"\"c\"\"\nd\"", StringEscapeUtils.escapeCsv("a,b\"c\"\nd"));
    }

    @Test
    public void testUnescapeCsvNull() throws Exception {
        assertNull(StringEscapeUtils.unescapeCsv(null));
    }

    @Test
    public void testUnescapeCsvEmpty() throws Exception {
        assertEquals("", StringEscapeUtils.unescapeCsv(""));
    }

    @Test
    public void testUnescapeCsvNoQuotes() throws Exception {
        assertEquals("abc", StringEscapeUtils.unescapeCsv("abc"));
    }

    @Test
    public void testUnescapeCsvWithComma() throws Exception {
        assertEquals("a,b", StringEscapeUtils.unescapeCsv("\"a,b\""));
    }

    @Test
    public void testUnescapeCsvWithQuote() throws Exception {
        assertEquals("a\"b", StringEscapeUtils.unescapeCsv("\"a\"\"b\""));
    }

    @Test
    public void testUnescapeCsvWithNewline() throws Exception {
        assertEquals("a\nb", StringEscapeUtils.unescapeCsv("\"a\nb\""));
    }
    
    @Test
    public void testUnescapeCsvWithAllSpecialChars() throws Exception {
        assertEquals("a,b\"c\"\nd", StringEscapeUtils.unescapeCsv("\"a,b\"\"c\"\"\nd\""));
    }
    
    @Test
    public void testUnescapeCsvUnquotedSpecialChars() throws Exception {
        assertEquals("a,b\"c\"\nd", StringEscapeUtils.unescapeCsv("a,b\"c\"\nd"));
    }
}
