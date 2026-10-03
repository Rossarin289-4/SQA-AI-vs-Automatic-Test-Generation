package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsLang20Test {

    private static final Object NULL_TO_STRING_OBJECT = new Object() {
        @Override
        public String toString() {
            return null;
        }
    };

    @Test
    public void testJoinSingleObjectWhoseToStringReturnsNull() {
        Object[] values = { NULL_TO_STRING_OBJECT };

        assertEquals("null", StringUtils.join(values));
    }

    @Test
    public void testJoinCharRangeWithNullReturningToString() {
        Object[] values = {
            "prefix",
            NULL_TO_STRING_OBJECT,
            "suffix"
        };

        assertEquals(
            "null",
            StringUtils.join(values, ':', 1, 2)
        );
    }

    @Test
    public void testJoinStringRangeWithNullReturningToString() {
        Object[] values = {
            "left",
            NULL_TO_STRING_OBJECT,
            "right"
        };

        assertEquals(
            "null",
            StringUtils.join(values, "::", 1, 2)
        );
    }

    @Test
    public void testJoinMultipleObjectsWhenFirstObjectToStringReturnsNull() {
        Object[] values = {
            NULL_TO_STRING_OBJECT,
            "tail"
        };

        assertEquals(
            "null|tail",
            StringUtils.join(values, "|")
        );
    }
}
