package org.apache.commons.lang.text;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrBuilderLang61Test {

    @Test
    public void testIndexOfDoesNotFindRemovedSuffix() {
        StrBuilder builder = new StrBuilder("redgreen");

        builder.deleteFirst("green");

        assertEquals(-1, builder.indexOf("green"));
    }

    @Test
    public void testIndexOfDoesNotFindRemovedMiddleContent() {
        StrBuilder builder = new StrBuilder("cat123dog");

        builder.deleteFirst("123");

        assertEquals(-1, builder.indexOf("123"));
    }

    @Test
    public void testIndexOfDoesNotSearchClearedBuffer() {
        StrBuilder builder = new StrBuilder("sunshine");

        builder.clear();

        assertEquals(-1, builder.indexOf("shine"));
    }

    @Test
    public void testIndexOfStillFindsContentInsideLogicalSize() {
        StrBuilder builder = new StrBuilder("redgreen");

        builder.deleteFirst("green");

        assertEquals(1, builder.indexOf("ed"));
    }

    @Test
    public void testIndexOfDoesNotMatchAcrossLogicalEnd() {
        StrBuilder builder = new StrBuilder("ab12345");

        builder.setLength(2);

        assertEquals(-1, builder.indexOf("b123"));
    }
}
