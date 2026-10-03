package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class StringEscapeUtilsLang46Test {

    @Test
    public void testEscapeJavaSingleSlashIsNotEscaped() {
        String input = "/";

        String actual = StringEscapeUtils.escapeJava(input);

        assertEquals("/", actual);
    }

    @Test
    public void testEscapeJavaEmbeddedSlashIsNotEscaped() {
        String input = "a/b";

        String actual = StringEscapeUtils.escapeJava(input);

        assertEquals("a/b", actual);
    }

    @Test
    public void testEscapeJavaMultipleSlashesRemainUnescaped() {
        String input = "///";

        String actual = StringEscapeUtils.escapeJava(input);

        assertEquals("///", actual);
    }

    @Test
    public void testEscapeJavaStillEscapesQuotesAndBackslashes() {
        String input = "a\"b\\c";

        String actual = StringEscapeUtils.escapeJava(input);

        assertEquals("a\\\"b\\\\c", actual);
    }

    @Test
    public void testEscapeJavaNullRemainsNull() {
        assertNull(StringEscapeUtils.escapeJava(null));
    }
}
