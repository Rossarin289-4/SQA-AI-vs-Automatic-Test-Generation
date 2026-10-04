package org.mockito;

import org.junit.Test;
import static org.junit.Assert.*;
import org.hamcrest.Matcher;
import org.hamcrest.core.IsNull;
import org.mockito.internal.matchers.*;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import org.mockito.internal.progress.HandyReturnValues;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MatchersTest {
    @Test
    public void testPrimitiveAnyMatchersReturnDefaults() throws Exception {
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
    public void testAnyObjectVarargAndAliasesReturnNull() throws Exception {
        assertNull(Matchers.anyObject());
        assertNull(Matchers.anyVararg());
        assertNull(Matchers.any());
        assertNull(Matchers.any(String.class));
    }

    @Test
    public void testAnyStringReturnsEmptyString() throws Exception {
        assertEquals("", Matchers.anyString());
    }

    @Test
    public void testAnyListIsEmpty() throws Exception {
        List value = Matchers.anyList();
        assertEquals(0, value.size());
    }

    @Test
    public void testAnyListOfIsEmpty() throws Exception {
        List<String> value = Matchers.anyListOf(String.class);
        assertEquals(0, value.size());
    }

    @Test
    public void testAnySetIsEmpty() throws Exception {
        Set value = Matchers.anySet();
        assertEquals(0, value.size());
    }

    @Test
    public void testAnySetOfIsEmpty() throws Exception {
        Set<String> value = Matchers.anySetOf(String.class);
        assertEquals(0, value.size());
    }

    @Test
    public void testAnyMapIsEmpty() throws Exception {
        Map value = Matchers.anyMap();
        assertEquals(0, value.size());
    }

    @Test
    public void testAnyMapOfIsEmpty() throws Exception {
        Map<String, Integer> value = Matchers.anyMapOf(String.class, Integer.class);
        assertEquals(0, value.size());
    }

    @Test
    public void testAnyCollectionIsEmpty() throws Exception {
        Collection value = Matchers.anyCollection();
        assertEquals(0, value.size());
    }

    @Test
    public void testAnyCollectionOfIsEmpty() throws Exception {
        Collection<String> value = Matchers.anyCollectionOf(String.class);
        assertEquals(0, value.size());
    }

    @Test
    public void testIsAReturnsNull() throws Exception {
        assertNull(Matchers.isA(String.class));
    }

    @Test
    public void testEqBooleanReturnsFalseForBothInputs() throws Exception {
        assertFalse(Matchers.eq(false));
        assertFalse(Matchers.eq(true));
    }

    @Test
    public void testRefEqReturnsNull() throws Exception {
        assertNull(Matchers.refEq("value"));
    }

    @Test
    public void testSameReturnsNullDummyValue() throws Exception {
        assertNull(Matchers.same("value"));
        assertNull(Matchers.same(null));
    }

    @Test
    public void testNullMatchersReturnNull() throws Exception {
        assertNull(Matchers.isNull());
        assertNull(Matchers.isNull(String.class));
    }

    @Test
    public void testNotNullMatchersReturnNullDummyValue() throws Exception {
        assertNull(Matchers.notNull());
        assertNull(Matchers.notNull(String.class));
        assertNull(Matchers.isNotNull());
        assertNull(Matchers.isNotNull(String.class));
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
    public void testCharThatReturnsZero() throws Exception {
        assertEquals((char) 0, Matchers.charThat(null));
    }

    @Test
    public void testBooleanThatReturnsFalse() throws Exception {
        assertFalse(Matchers.booleanThat(null));
    }

    @Test
    public void testByteThatReturnsZero() throws Exception {
        assertEquals((byte) 0, Matchers.byteThat(null));
    }

    @Test
    public void testShortThatReturnsZero() throws Exception {
        assertEquals((short) 0, Matchers.shortThat(null));
    }

    @Test
    public void testIntThatReturnsZero() throws Exception {
        assertEquals(0, Matchers.intThat(null));
    }

    @Test
    public void testLongThatReturnsZero() throws Exception {
        assertEquals(0L, Matchers.longThat(null));
    }

    @Test
    public void testFloatThatReturnsZero() throws Exception {
        assertEquals(0.0f, Matchers.floatThat(null), 0.0f);
    }

    @Test
    public void testDoubleThatReturnsZero() throws Exception {
        assertEquals(0.0, Matchers.doubleThat(null), 0.0);
    }
}
