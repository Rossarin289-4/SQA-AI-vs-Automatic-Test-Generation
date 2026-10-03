package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Independent test suite for Lang-52 defect concerning forward slash escaping in JavaScript.
 */
public class StringEscapeUtilsTestLang52 {

    @Test
    public void testEscapeJavaScriptWithForwardSlash() {
        String input = "http://apache.org";
        String expected = "http:\\/\\/apache.org";
        assertEquals(expected, StringEscapeUtils.escapeJavaScript(input));
    }

    @Test
    public void testEscapeJavaScriptHtmlCloseTag() {
        String input = "</script>";
        String expected = "<\\/script>";
        assertEquals(expected, StringEscapeUtils.escapeJavaScript(input));
    }

    @Test
    public void testEscapeJavaDoesNotEscapeForwardSlash() {
        // Java escaping rules do not escape forward slash '/'
        String input = "http://apache.org";
        String expected = "http://apache.org";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJavaScriptMixedSpecialCharacters() {
        String input = "path/to/file?q=test\"value's\\";
        String expected = "path\\/to\\/file?q=test\\\"value\\'s\\\\";
        assertEquals(expected, StringEscapeUtils.escapeJavaScript(input));
    }
}
