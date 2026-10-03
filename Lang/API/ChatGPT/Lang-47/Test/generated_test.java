package org.apache.commons.lang.text;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrBuilderLang47Test {

    @Test
    public void testAppendFixedWidthPadLeftNullUsesPadding() {
        StrBuilder builder = new StrBuilder();

        builder.appendFixedWidthPadLeft(null, 6, '#');

        assertEquals("######", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftNullAfterExistingContent() {
        StrBuilder builder = new StrBuilder();
        builder.append("ID:");

        builder.appendFixedWidthPadLeft(null, 4, '0');

        assertEquals("ID:0000", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftPadsShortValue() {
        StrBuilder builder = new StrBuilder();

        builder.appendFixedWidthPadLeft("cat", 5, '_');

        assertEquals("__cat", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftTruncatesLongValue() {
        StrBuilder builder = new StrBuilder();

        builder.appendFixedWidthPadLeft("abcdef", 4, '_');

        assertEquals("cdef", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftUsesConfiguredNullText() {
        StrBuilder builder = new StrBuilder();
        builder.setNullText("N/A");

        builder.appendFixedWidthPadLeft(null, 5, '.');

        assertEquals("..N/A", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftZeroWidthHasNoEffect() {
        StrBuilder builder = new StrBuilder();

        builder.appendFixedWidthPadLeft(null, 0, '#');

        assertEquals("", builder.toString());
    }
}
