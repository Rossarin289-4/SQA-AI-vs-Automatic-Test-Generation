package org.mockito;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hamcrest.Matcher;
import org.mockito.internal.matchers.*;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import org.mockito.internal.progress.HandyReturnValues;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;

public class MatchersTest {
    @Test
    public void testPrimitiveAnyDefaults() throws Exception {
        assertFalse(Matchers.anyBoolean());
        assertEquals((byte) 0, Matchers.anyByte());
        assertEquals((char) 0, Matchers.anyChar());
        assertEquals(0, Matchers.anyInt());
        assertEquals(0L, Matchers.anyLong());
        assertEquals(0.0f, Matchers.anyFloat(), 0.0f);
        assertEquals(0.0, Matchers.anyDouble(), 0.0);
        assertEquals((short) 0, Matchers.anyShort());
    }

    @Test
    public void testAnyObjectIsNull() throws Exception {
        assertNull(Matchers.anyObject());
    }

    @Test
    public void testAnyVarargIsNull() throws Exception {
        assertNull(Matchers.anyVararg());
    }

    @Test
    public void testAnyAliasesReturnNull() throws Exception {
        assertNull(Matchers.any(String.class));
        assertNull(Matchers.any());
    }

    @Test
    public void testAnyStringReturnsEmptyString() throws Exception {
        assertEquals("", Matchers.anyString());
    }

    @Test
    public void testAnyListReturnsEmptyList() throws Exception {
        assertEquals(0, Matchers.anyList().size());
    }

    @Test
    public void testAnyListOfReturnsEmptyList() throws Exception {
        assertEquals(0, Matchers.anyListOf(String.class).size());
    }

    @Test
    public void testAnySetReturnsEmptySet() throws Exception {
        assertEquals(0, Matchers.anySet().size());
    }

    @Test
    public void testAnySetOfReturnsEmptySet() throws Exception {
        assertEquals(0, Matchers.anySetOf(String.class).size());
    }

    @Test
    public void testAnyMapReturnsEmptyMap() throws Exception {
        assertEquals(0, Matchers.anyMap().size());
    }

    @Test
    public void testAnyCollectionReturnsEmptyCollection() throws Exception {
        assertEquals(0, Matchers.anyCollection().size());
    }

    @Test
    public void testAnyCollectionOfReturnsEmptyCollection() throws Exception {
        assertEquals(0, Matchers.anyCollectionOf(String.class).size());
    }

    @Test
    public void testIsAReturnsNull() throws Exception {
        assertNull(Matchers.isA(String.class));
    }

    @Test
    public void testPrimitiveEqReturnsDefaultValues() throws Exception {
        assertFalse(Matchers.eq(true));
        assertEquals((byte) 0, Matchers.eq(Byte.MAX_VALUE));
        assertEquals((char) 0, Matchers.eq(Character.MAX_VALUE));
        assertEquals(0.0, Matchers.eq(1.25), 0.0);
        assertEquals(0.0f, Matchers.eq(1.25f), 0.0f);
        assertEquals(0, Matchers.eq(Integer.MAX_VALUE));
        assertEquals(0L, Matchers.eq(Long.MAX_VALUE));
        assertEquals((short) 0, Matchers.eq(Short.MAX_VALUE));
    }

    @Test
    public void testObjectEqReturnsNull() throws Exception {
        assertNull(Matchers.eq("value"));
    }

    @Test
    public void testRefEqReturnsNull() throws Exception {
        assertNull(Matchers.refEq("value"));
    }

    @Test
    public void testSameReturnsNull() throws Exception {
        assertNull(Matchers.same("value"));
    }

    @Test
    public void testNullAndNotNullMatchersReturnNull() throws Exception {
        assertNull(Matchers.isNull());
        assertNull(Matchers.notNull());
        assertNull(Matchers.isNotNull());
    }

    @Test
    public void testStringMatchersReturnEmptyString() throws Exception {
        assertEquals("", Matchers.contains("x"));
        assertEquals("", Matchers.matches("x+"));
        assertEquals("", Matchers.endsWith("x"));
        assertEquals("", Matchers.startsWith("x"));
    }

    @Test
    public void testArgThatReturnsNull() throws Exception {
        assertNull(Matchers.argThat(null));
    }

    @Test
    public void testTypedThatMatchersReturnDefaults() throws Exception {
        assertEquals((char) 0, Matchers.charThat(null));
        assertFalse(Matchers.booleanThat(null));
        assertEquals((byte) 0, Matchers.byteThat(null));
        assertEquals((short) 0, Matchers.shortThat(null));
        assertEquals(0, Matchers.intThat(null));
        assertEquals(0L, Matchers.longThat(null));
        assertEquals(0.0f, Matchers.floatThat(null), 0.0f);
        assertEquals(0.0, Matchers.doubleThat(null), 0.0);
    }
}
