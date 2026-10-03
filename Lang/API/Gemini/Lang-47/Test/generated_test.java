package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;

public class StrBuilderDefectTest {

    @Test
    public void testAppendFixedWidthPadLeftWithNullObject() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft((Object) null, 5, '0');
        assertEquals("00000", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftWithShortString() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("ab", 5, ' ');
        assertEquals("   ab", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftExactWidth() {
        StrBuilder sb = new StrBuilder();
        sb.appendFixedWidthPadLeft("hello", 5, '-');
        assertEquals("hello", sb.toString());
    }
}
