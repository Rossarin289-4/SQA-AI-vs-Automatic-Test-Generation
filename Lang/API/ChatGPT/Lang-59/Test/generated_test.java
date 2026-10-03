package org.apache.commons.lang.text;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrBuilderLang59Test {

    /**
     * Primary defect test.
     *
     * The builder is completely filled before the fixed-width append.
     * The append therefore requires capacity beyond the original buffer.
     */
    @Test
    public void testAppendFixedWidthPadRightGrowsBufferAfterExistingContent() {
        StrBuilder builder = new StrBuilder(4);
        builder.append("ABCD");

        builder.appendFixedWidthPadRight("xy", 3, '-');

        assertEquals("ABCDxy-", builder.toString());
        assertEquals(7, builder.length());
    }

    /**
     * Exercises the branch where the supplied value is longer than
     * the requested fixed width. The result must contain exactly
     * the requested number of characters for the appended field.
     */
    @Test
    public void testAppendFixedWidthPadRightTruncatesWhenGrowthIsRequired() {
        StrBuilder builder = new StrBuilder(5);
        builder.append("12345");

        builder.appendFixedWidthPadRight("abcdef", 3, '.');

        assertEquals("12345abc", builder.toString());
        assertEquals(8, builder.length());
    }

    /**
     * Exercises the branch where the supplied value is shorter than
     * the requested width, requiring both copying and right padding.
     */
    @Test
    public void testAppendFixedWidthPadRightPadsAfterGrowth() {
        StrBuilder builder = new StrBuilder(3);
        builder.append("XYZ");

        builder.appendFixedWidthPadRight("go", 5, '_');

        assertEquals("XYZgo___", builder.toString());
        assertEquals(8, builder.length());
    }

    /**
     * Verifies the integer overload, which delegates to the
     * fixed-width string implementation.
     */
    @Test
    public void testAppendFixedWidthPadRightIntegerAfterExistingContent() {
        StrBuilder builder = new StrBuilder(4);
        builder.append("base");

        builder.appendFixedWidthPadRight(27, 4, '0');

        assertEquals("base2700", builder.toString());
        assertEquals(8, builder.length());
    }

    /**
     * Boundary case: non-positive width must not modify the builder.
     */
    @Test
    public void testAppendFixedWidthPadRightIgnoresNonPositiveWidth() {
        StrBuilder builder = new StrBuilder(2);
        builder.append("OK");

        builder.appendFixedWidthPadRight("abcdef", 0, '-');
        assertEquals("OK", builder.toString());

        builder.appendFixedWidthPadRight("abcdef", -3, '-');
        assertEquals("OK", builder.toString());
    }
}
