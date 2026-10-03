package org.apache.commons.lang;

import java.io.StringWriter;
import java.io.IOException;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringEscapeUtilsDefectTest {

    @Test
    public void testEscapeJavaDoesNotEscapeForwardSlash() {
        String input = "http://apache.org/commons/lang";
        String expected = "http://apache.org/commons/lang";
        String actual = StringEscapeUtils.escapeJava(input);
        assertEquals("Java escaping should not escape forward slashes", expected, actual);
    }

    @Test
    public void testEscapeJavaScriptDoesEscapeForwardSlash() {
        String input = "http://apache.org/commons/lang";
        String expected = "http:\\/\\/apache.org\\/commons\\/lang";
        String actual = StringEscapeUtils.escapeJavaScript(input);
        assertEquals("JavaScript escaping should escape forward slashes", expected, actual);
    }

    @Test
    public void testEscapeJavaWriterDoesNotEscapeForwardSlash() throws IOException {
        String input = "path/to/resource";
        String expected = "path/to/resource";
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJava(writer, input);
        assertEquals("Java writer escaping should not escape forward slashes", expected, writer.toString());
    }

    @Test
    public void testEscapeJavaScriptWriterDoesEscapeForwardSlash() throws IOException {
        String input = "path/to/resource";
        String expected = "path\\/to\\/resource";
        StringWriter writer = new StringWriter();
        StringEscapeUtils.escapeJavaScript(writer, input);
        assertEquals("JavaScript writer escaping should escape forward slashes", expected, writer.toString());
    }

    @Test
    public void testEscapeJavaMixedCharactersWithSlash() {
        String input = "Line1\nPath: /usr/bin 'quotes'";
        // In Java escape: '\n' becomes "\\n", '/' remains '/', "'" is unescaped in escapeJava
        String expected = "Line1\\nPath: /usr/bin 'quotes'";
        String actual = StringEscapeUtils.escapeJava(input);
        assertEquals("Java escape with mixed chars and slash should not escape slash", expected, actual);
    }
}
