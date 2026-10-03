package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;

public class StrBuilderAppendFixedWidthPadRightTest {

    @Test
    public void testAppendFixedWidthPadRight_ShorterString() {
        StrBuilder builder = new StrBuilder();
        builder.appendFixedWidthPadRight("foo", 6, '_');
        assertEquals("foo___", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_ExactWidthString() {
        StrBuilder builder = new StrBuilder();
        builder.appendFixedWidthPadRight("foobar", 6, '_');
        assertEquals("foobar", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_LongerString() {
        StrBuilder builder = new StrBuilder();
        builder.appendFixedWidthPadRight("helloworld", 5, '_');
        assertEquals("hellow", builder.toString()); // or truncated length depending on exact specification
    }

    @Test
    public void testAppendFixedWidthPadRight_NullObject() {
        StrBuilder builder = new StrBuilder();
        builder.appendFixedWidthPadRight(null, 5, ' ');
        assertEquals("     ", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_MultipleAppends() {
        StrBuilder builder = new StrBuilder();
        builder.appendFixedWidthPadRight("ab", 4, '-')
               .appendFixedWidthPadRight("xyz", 5, '.');
        assertEquals("ab--xyz..", builder.toString());
    }
}
