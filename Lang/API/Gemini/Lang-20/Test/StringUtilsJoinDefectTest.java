package org.apache.commons.lang3;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StringUtilsJoinDefectTest {

    @Test
    public void testJoin_ObjectArrayWithNullsAndDelimiter() {
        Object[] items = new Object[] { "foo", null, "bar" };
        String result = StringUtils.join(items, "-");
        assertNotNull("Joined string should not be null", result);
        assertEquals("foo--bar", result);
    }

    @Test
    public void testJoin_CollectionWithNullsAndDelimiter() {
        java.util.List<Object> list = Arrays.asList("start", null, "end");
        String result = StringUtils.join(list, ",");
        assertNotNull("Joined string should not be null", result);
        assertEquals("start,,end", result);
    }

    @Test
    public void testJoin_IteratorWithNullElements() {
        java.util.List<Object> list = Arrays.asList(null, "middle", null);
        String result = StringUtils.join(list.iterator(), "|");
        assertNotNull("Joined string should not be null", result);
        assertEquals("|middle|", result);
    }
}
