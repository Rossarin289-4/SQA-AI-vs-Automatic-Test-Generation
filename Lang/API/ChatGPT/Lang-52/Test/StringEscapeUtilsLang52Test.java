package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;

import java.io.StringWriter;

import org.junit.Test;

public class StringEscapeUtilsLang52Test {

    @Test
    public void testEscapeJavaScriptSingleSlash() {
        assertEquals("\\/", StringEscapeUtils.escapeJavaScript("/"));
    }

    @Test
    public void testEscapeJavaScriptSlashBetweenCharacters() {
        assertEquals("a\\/b", StringEscapeUtils.escapeJavaScript("a/b"));
    }

    @Test
    public void testEscapeJavaScriptMultipleSlashes() {
        assertEquals(
                "path\\/to\\/file",
                StringEscapeUtils.escapeJavaScript("path/to/file"));
    }

    @Test
    public void testEscapeJavaScriptConsecutiveSlashes() {
        assertEquals(
                "http:\\/\\/x",
                StringEscapeUtils.escapeJavaScript("http://x"));
    }

    @Test
    public void testEscapeJavaScriptSlashWithQuote() {
        assertEquals(
                "a\\/b\\\"c",
                StringEscapeUtils.escapeJavaScript("a/b\"c"));
    }

    @Test
    public void testEscapeJavaScriptWriterWithSlash() throws Exception {
        StringWriter writer = new StringWriter();

        StringEscapeUtils.escapeJavaScript(writer, "/");

        assertEquals("\\/", writer.toString());
    }
}
