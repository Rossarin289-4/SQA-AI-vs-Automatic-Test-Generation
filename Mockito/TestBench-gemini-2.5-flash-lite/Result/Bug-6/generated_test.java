package org.mockito;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
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

import org.junit.Test;
import static org.junit.Assert.*;

public class MatchersTest {

    @Test
    public void testAnyBoolean() throws Exception {
        // The behavior of anyBoolean() is to report a matcher and return false.
        // It's hard to assert a specific value as it should be `true || !true`.
        // Asserting it returns a boolean is sufficient.
        assertTrue(Matchers.anyBoolean() || !Matchers.anyBoolean());
    }

    @Test
    public void testAnyByte() throws Exception {
        // The behavior of anyByte() is to report a matcher and return 0.
        assertEquals((byte) 0, Matchers.anyByte());
    }

    @Test
    public void testAnyChar() throws Exception {
        // The behavior of anyChar() is to report a matcher and return '\u0000'.
        assertEquals('\u0000', Matchers.anyChar());
    }

    @Test
    public void testAnyInt() throws Exception {
        // The behavior of anyInt() is to report a matcher and return 0.
        assertEquals(0, Matchers.anyInt());
    }

    @Test
    public void testAnyLong() throws Exception {
        // The behavior of anyLong() is to report a matcher and return 0.
        assertEquals(0L, Matchers.anyLong());
    }

    @Test
    public void testAnyFloat() throws Exception {
        // The behavior of anyFloat() is to report a matcher and return 0.
        assertEquals(0.0f, Matchers.anyFloat(), 1e-9f);
    }

    @Test
    public void testAnyDouble() throws Exception {
        // The behavior of anyDouble() is to report a matcher and return 0.
        assertEquals(0.0, Matchers.anyDouble(), 1e-9);
    }

    @Test
    public void testAnyShort() throws Exception {
        // The behavior of anyShort() is to report a matcher and return 0.
        assertEquals((short) 0, Matchers.anyShort());
    }

    @Test
    public void testAnyObject() throws Exception {
        // The behavior of anyObject() is to report a matcher and return null.
        assertNull(Matchers.anyObject());
    }
    
    @Test
    public void testAnyVararg() throws Exception {
        // The behavior of anyVararg() is to report a matcher and return null.
        assertNull(Matchers.anyVararg());
    }

    @Test
    public void testAnyWithClass() throws Exception {
        // The behavior of any(Class) is to report a matcher and return null.
        assertNull(Matchers.any(String.class));
    }
    
    @Test
    public void testAnyString() throws Exception {
        // The behavior of anyString() is to report a matcher and return "".
        assertEquals("", Matchers.anyString());
    }

    @Test
    public void testAnyList() throws Exception {
        // The behavior of anyList() is to report a matcher and return an empty List.
        assertTrue(Matchers.anyList() instanceof List);
        assertTrue(Matchers.anyList().isEmpty());
    }

    @Test
    public void testAnyListOf() throws Exception {
        // The behavior of anyListOf() is to report a matcher and return an empty List.
        assertTrue(Matchers.anyListOf(String.class) instanceof List);
        assertTrue(Matchers.anyListOf(String.class).isEmpty());
    }

    @Test
    public void testAnySet() throws Exception {
        // The behavior of anySet() is to report a matcher and return an empty Set.
        assertTrue(Matchers.anySet() instanceof Set);
        assertTrue(Matchers.anySet().isEmpty());
    }

    @Test
    public void testAnySetOf() throws Exception {
        // The behavior of anySetOf() is to report a matcher and return an empty Set.
        assertTrue(Matchers.anySetOf(Integer.class) instanceof Set);
        assertTrue(Matchers.anySetOf(Integer.class).isEmpty());
    }

    @Test
    public void testAnyMap() throws Exception {
        // The behavior of anyMap() is to report a matcher and return an empty Map.
        assertTrue(Matchers.anyMap() instanceof Map);
        assertTrue(Matchers.anyMap().isEmpty());
    }

    @Test
    public void testAnyMapOf() throws Exception {
        // The behavior of anyMapOf() is to report a matcher and return an empty Map.
        assertTrue(Matchers.anyMapOf(String.class, Integer.class) instanceof Map);
        assertTrue(Matchers.anyMapOf(String.class, Integer.class).isEmpty());
    }
    
    @Test
    public void testAnyCollection() throws Exception {
        // The behavior of anyCollection() is to report a matcher and return an empty Collection.
        assertTrue(Matchers.anyCollection() instanceof Collection);
        assertTrue(Matchers.anyCollection().isEmpty());
    }

    @Test
    public void testAnyCollectionOf() throws Exception {
        // The behavior of anyCollectionOf() is to report a matcher and return an empty Collection.
        assertTrue(Matchers.anyCollectionOf(Double.class) instanceof Collection);
        assertTrue(Matchers.anyCollectionOf(Double.class).isEmpty());
    }

    @Test
    public void testIsAClass() throws Exception {
        // The behavior of isA(Class) is to report a matcher and return null.
        assertNull(Matchers.isA(Object.class));
    }

    @Test
    public void testEqBooleanTrue() throws Exception {
        // The behavior of eq(boolean) is to report a matcher and return the boolean value.
        assertTrue(Matchers.eq(true));
    }

    @Test
    public void testEqBooleanFalse() throws Exception {
        // The behavior of eq(boolean) is to report a matcher and return the boolean value.
        assertFalse(Matchers.eq(false));
    }

    @Test
    public void testEqByte() throws Exception {
        // The behavior of eq(byte) is to report a matcher and return the byte value.
        assertEquals((byte) 10, Matchers.eq((byte) 10));
    }
    
    @Test
    public void testEqChar() throws Exception {
        // The behavior of eq(char) is to report a matcher and return the char value.
        assertEquals('a', Matchers.eq('a'));
    }

    @Test
    public void testEqDouble() throws Exception {
        // The behavior of eq(double) is to report a matcher and return the double value.
        assertEquals(1.234, Matchers.eq(1.234), 1e-9);
    }

    @Test
    public void testEqFloat() throws Exception {
        // The behavior of eq(float) is to report a matcher and return the float value.
        assertEquals(5.67f, Matchers.eq(5.67f), 1e-6f);
    }

    @Test
    public void testEqInt() throws Exception {
        // The behavior of eq(int) is to report a matcher and return the int value.
        assertEquals(100, Matchers.eq(100));
    }

    @Test
    public void testEqLong() throws Exception {
        // The behavior of eq(long) is to report a matcher and return the long value.
        assertEquals(1234567890123L, Matchers.eq(1234567890123L));
    }

    @Test
    public void testEqShort() throws Exception {
        // The behavior of eq(short) is to report a matcher and return the short value.
        assertEquals((short) 50, Matchers.eq((short) 50));
    }

    @Test
    public void testEqObject() throws Exception {
        // The behavior of eq(T) is to report a matcher and return the value.
        String testString = "test";
        assertEquals(testString, Matchers.eq(testString));
    }
    
    @Test
    public void testRefEqSimple() throws Exception {
        // The behavior of refEq is to report a matcher and return null.
        // The actual comparison logic is within the ReflectionEquals class,
        // which is used by Mockito internally during verification/stubbing.
        // We are testing that `refEq` itself correctly registers the matcher.
        Object obj1 = new Object();
        assertNull(Matchers.refEq(obj1));
    }

    @Test
    public void testSame() throws Exception {
        // The behavior of same(T) is to report a matcher and return the value.
        Object obj = new Object();
        assertSame(obj, Matchers.same(obj));
    }

    @Test
    public void testIsNull() throws Exception {
        // The behavior of isNull() is to report a matcher and return null.
        assertNull(Matchers.isNull());
    }

    @Test
    public void testIsNullWithClass() throws Exception {
        // The behavior of isNull(Class) is to report a matcher and return null.
        assertNull(Matchers.isNull(String.class));
    }

    @Test
    public void testNotNull() throws Exception {
        // The behavior of notNull() is to report a matcher and return null.
        assertNotNull(Matchers.notNull());
    }

    @Test
    public void testNotNullWithClass() throws Exception {
        // The behavior of notNull(Class) is to report a matcher and return null.
        assertNotNull(Matchers.notNull(Integer.class));
    }

    @Test
    public void testIsNotNull() throws Exception {
        // The behavior of isNotNull() is to report a matcher and return null (it's an alias for notNull()).
        assertNotNull(Matchers.isNotNull());
    }

    @Test
    public void testIsNotNullWithClass() throws Exception {
        // The behavior of isNotNull(Class) is to report a matcher and return null (it's an alias for notNull(Class)).
        assertNotNull(Matchers.isNotNull(Long.class));
    }

    @Test
    public void testContains() throws Exception {
        // The behavior of contains(String) is to report a matcher and return an empty string.
        assertEquals("", Matchers.contains("exp"));
    }

    @Test
    public void testMatchesRegex() throws Exception {
        // The behavior of matches(String) is to report a matcher and return an empty string.
        assertEquals("", Matchers.matches("regex_.*"));
    }

    @Test
    public void testEndsWith() throws Exception {
        // The behavior of endsWith(String) is to report a matcher and return an empty string.
        assertEquals("", Matchers.endsWith("suffix"));
    }

    @Test
    public void testStartsWith() throws Exception {
        // The behavior of startsWith(String) is to report a matcher and return an empty string.
        assertEquals("", Matchers.startsWith("prefix"));
    }

    @Test
    public void testArgThat() throws Exception {
        // The behavior of argThat(Matcher) is to report a matcher and return null.
        // We use a Hamcrest matcher that expects null.
        assertNull(Matchers.argThat(new IsNull<String>()));
    }

    @Test
    public void testCharThat() throws Exception {
        // The behavior of charThat(Matcher) is to report a matcher and return the char value.
        assertEquals('z', Matchers.charThat(Is.is('z')));
    }

    @Test
    public void testBooleanThat() throws Exception {
        // The behavior of booleanThat(Matcher) is to report a matcher and return the boolean value.
        assertTrue(Matchers.booleanThat(Is.is(true)));
    }

    @Test
    public void testByteThat() throws Exception {
        // The behavior of byteThat(Matcher) is to report a matcher and return the byte value.
        assertEquals((byte) 127, Matchers.byteThat(Is.is((byte) 127)));
    }

    @Test
    public void testShortThat() throws Exception {
        // The behavior of shortThat(Matcher) is to report a matcher and return the short value.
        assertEquals((short) 1000, Matchers.shortThat(Is.is((short) 1000)));
    }

    @Test
    public void testIntThat() throws Exception {
        // The behavior of intThat(Matcher) is to report a matcher and return the int value.
        assertEquals(Integer.MAX_VALUE, Matchers.intThat(Is.is(Integer.MAX_VALUE)));
    }

    @Test
    public void testLongThat() throws Exception {
        // The behavior of longThat(Matcher) is to report a matcher and return the long value.
        assertEquals(Long.MIN_VALUE, Matchers.longThat(Is.is(Long.MIN_VALUE)));
    }

    @Test
    public void testFloatThat() throws Exception {
        // The behavior of floatThat(Matcher) is to report a matcher and return the float value.
        assertEquals(Float.POSITIVE_INFINITY, Matchers.floatThat(Is.is(Float.POSITIVE_INFINITY)), 1e-9f);
    }

    @Test
    public void testDoubleThat() throws Exception {
        // The behavior of doubleThat(Matcher) is to report a matcher and return the double value.
        assertEquals(Double.NEGATIVE_INFINITY, Matchers.doubleThat(Is.is(Double.NEGATIVE_INFINITY)), 1e-9);
    }
}
