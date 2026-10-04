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
import org.hamcrest.Description;
import org.mockito.ArgumentMatcher;


public class MatchersTest {
    @Test
    public void testAnyBoolean() throws Exception {
        boolean result = Matchers.anyBoolean();
        assertFalse(result); // Derived from HandyReturnValues.returnFalse()
    }

    @Test
    public void testAnyByte() throws Exception {
        byte result = Matchers.anyByte();
        assertEquals(0, result); // Derived from HandyReturnValues.returnZero()
    }

    @Test
    public void testAnyChar() throws Exception {
        char result = Matchers.anyChar();
        assertEquals(0, result); // Derived from HandyReturnValues.returnChar()
    }

    @Test
    public void testAnyInt() throws Exception {
        int result = Matchers.anyInt();
        assertEquals(0, result); // Derived from HandyReturnValues.returnZero()
    }

    @Test
    public void testAnyLong() throws Exception {
        long result = Matchers.anyLong();
        assertEquals(0L, result); // Derived from HandyReturnValues.returnZero()
    }

    @Test
    public void testAnyFloat() throws Exception {
        float result = Matchers.anyFloat();
        assertEquals(0.0f, result, 0.0f); // Derived from HandyReturnValues.returnZero()
    }

    @Test
    public void testAnyDouble() throws Exception {
        double result = Matchers.anyDouble();
        assertEquals(0.0, result, 0.0); // Derived from HandyReturnValues.returnZero()
    }

    @Test
    public void testAnyShort() throws Exception {
        short result = Matchers.anyShort();
        assertEquals(0, result); // Derived from HandyReturnValues.returnZero()
    }

    @Test
    public void testAnyObject() throws Exception {
        Object result = Matchers.anyObject();
        assertNull(result); // Derived from HandyReturnValues.returnNull()
    }

    @Test
    public void testAnyVararg() throws Exception {
        Object result = Matchers.anyVararg();
        assertNull(result); // Derived from HandyReturnValues.returnNull()
    }

    @Test
    public void testAnyWithClass() throws Exception {
        String result = Matchers.any(String.class);
        assertNull(result); // Derived from anyObject() which returns null
    }

    @Test
    public void testAnyString() throws Exception {
        String result = Matchers.anyString();
        assertEquals("", result); // Derived from HandyReturnValues.returnString()
    }

    @Test
    public void testAnyList() throws Exception {
        List result = Matchers.anyList();
        assertNotNull(result); // Derived from HandyReturnValues.returnList()
        assertTrue(result.isEmpty()); // Derived from HandyReturnValues.returnList()
    }

    @Test
    public void testAnyListOf() throws Exception {
        List<String> result = Matchers.anyListOf(String.class);
        assertNotNull(result); // Derived from HandyReturnValues.returnList()
        assertTrue(result.isEmpty()); // Derived from HandyReturnValues.returnList()
    }

    @Test
    public void testAnySet() throws Exception {
        Set result = Matchers.anySet();
        assertNotNull(result); // Derived from HandyReturnValues.returnSet()
        assertTrue(result.isEmpty()); // Derived from HandyReturnValues.returnSet()
    }

    @Test
    public void testAnySetOf() throws Exception {
        Set<Integer> result = Matchers.anySetOf(Integer.class);
        assertNotNull(result); // Derived from HandyReturnValues.returnSet()
        assertTrue(result.isEmpty()); // Derived from HandyReturnValues.returnSet()
    }

    @Test
    public void testAnyMap() throws Exception {
        Map result = Matchers.anyMap();
        assertNotNull(result); // Derived from HandyReturnValues.returnMap()
        assertTrue(result.isEmpty()); // Derived from HandyReturnValues.returnMap()
    }

    @Test
    public void testAnyCollection() throws Exception {
        Collection result = Matchers.anyCollection();
        assertNotNull(result); // Derived from HandyReturnValues.returnList()
        assertTrue(result.isEmpty()); // Derived from HandyReturnValues.returnList()
    }

    @Test
    public void testAnyCollectionOf() throws Exception {
        Collection<Double> result = Matchers.anyCollectionOf(Double.class);
        assertNotNull(result); // Derived from HandyReturnValues.returnList()
        assertTrue(result.isEmpty()); // Derived from HandyReturnValues.returnList()
    }

    @Test
    public void testIsA() throws Exception {
        String result = Matchers.isA(String.class);
        assertNull(result); // Derived from reportMatcher(new InstanceOf(clazz)).returnFor(clazz) which returns null for String
    }

    @Test
    public void testEqBoolean() throws Exception {
        boolean result = Matchers.eq(true);
        assertFalse(result); // Derived from reportMatcher(new Equals(value)).returnFalse()
    }

    @Test
    public void testEqByte() throws Exception {
        byte result = Matchers.eq((byte) 10);
        assertEquals(0, result); // Derived from reportMatcher(new Equals(value)).returnZero()
    }

    @Test
    public void testEqChar() throws Exception {
        char result = Matchers.eq('a');
        assertEquals(0, result); // Derived from reportMatcher(new Equals(value)).returnChar()
    }

    @Test
    public void testEqDouble() throws Exception {
        double result = Matchers.eq(1.23);
        assertEquals(0.0, result, 0.0); // Derived from reportMatcher(new Equals(value)).returnZero()
    }

    @Test
    public void testEqFloat() throws Exception {
        float result = Matchers.eq(4.56f);
        assertEquals(0.0f, result, 0.0f); // Derived from reportMatcher(new Equals(value)).returnZero()
    }

    @Test
    public void testEqInt() throws Exception {
        int result = Matchers.eq(100);
        assertEquals(0, result); // Derived from reportMatcher(new Equals(value)).returnZero()
    }

    @Test
    public void testEqLong() throws Exception {
        long result = Matchers.eq(1000L);
        assertEquals(0L, result); // Derived from reportMatcher(new Equals(value)).returnZero()
    }

    @Test
    public void testEqShort() throws Exception {
        short result = Matchers.eq((short) 50);
        assertEquals(0, result); // Derived from reportMatcher(new Equals(value)).returnZero()
    }

    @Test
    public void testEqObject() throws Exception {
        String value = "test";
        String result = Matchers.eq(value);
        assertNull(result); // Derived from reportMatcher(new Equals(value)).returnFor((Class) value.getClass()) which returns null for String
    }
    
    @Test
    public void testRefEq() throws Exception {
        String result = Matchers.refEq("some string");
        assertNull(result); // Derived from reportMatcher(new ReflectionEquals(value, excludeFields)).returnNull()
    }

    @Test
    public void testSame() throws Exception {
        String value = "unique";
        String result = Matchers.same(value);
        assertNull(result); // Derived from reportMatcher(new Same(value)).returnFor((Class) value.getClass()) which returns null for String
    }

    @Test
    public void testIsNull() throws Exception {
        Object result = Matchers.isNull();
        assertNull(result); // Derived from reportMatcher(Null.NULL).returnNull()
    }

    @Test
    public void testNotNull() throws Exception {
        Object result = Matchers.notNull();
        assertNull(result); // Derived from reportMatcher(NotNull.NOT_NULL).returnNull()
    }

    @Test
    public void testIsNotNull() throws Exception {
        Object result = Matchers.isNotNull();
        assertNull(result); // Derived from notNull() which returns null
    }

    @Test
    public void testContains() throws Exception {
        String result = Matchers.contains("test");
        assertEquals("", result); // Derived from reportMatcher(new Contains(substring)).returnString()
    }

    @Test
    public void testMatches() throws Exception {
        String result = Matchers.matches(".*");
        assertEquals("", result); // Derived from reportMatcher(new Matches(regex)).returnString()
    }

    @Test
    public void testEndsWith() throws Exception {
        String result = Matchers.endsWith("end");
        assertEquals("", result); // Derived from reportMatcher(new EndsWith(suffix)).returnString()
    }

    @Test
    public void testStartsWith() throws Exception {
        String result = Matchers.startsWith("start");
        assertEquals("", result); // Derived from reportMatcher(new StartsWith(prefix)).returnString()
    }

    @Test
    public void testArgThat() throws Exception {
        // Using a simple ArgumentMatcher that always returns true for demonstration
        ArgumentMatcher<String> trueMatcher = new ArgumentMatcher<String>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }
            @Override
            public void describeTo(Description description) {}
        };
        String result = Matchers.argThat(trueMatcher);
        assertNull(result); // Derived from reportMatcher(matcher).returnNull()
    }

    @Test
    public void testCharThat() throws Exception {
        ArgumentMatcher<Character> charMatcher = new ArgumentMatcher<Character>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }
            @Override
            public void describeTo(Description description) {}
        };
        char result = Matchers.charThat(charMatcher);
        assertEquals(0, result); // Derived from reportMatcher(matcher).returnChar()
    }

    @Test
    public void testBooleanThat() throws Exception {
        ArgumentMatcher<Boolean> booleanMatcher = new ArgumentMatcher<Boolean>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }
            @Override
            public void describeTo(Description description) {}
        };
        boolean result = Matchers.booleanThat(booleanMatcher);
        assertFalse(result); // Derived from reportMatcher(matcher).returnFalse()
    }

    @Test
    public void testByteThat() throws Exception {
        ArgumentMatcher<Byte> byteMatcher = new ArgumentMatcher<Byte>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }
            @Override
            public void describeTo(Description description) {}
        };
        byte result = Matchers.byteThat(byteMatcher);
        assertEquals(0, result); // Derived from reportMatcher(matcher).returnZero()
    }

    @Test
    public void testShortThat() throws Exception {
        ArgumentMatcher<Short> shortMatcher = new ArgumentMatcher<Short>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }
            @Override
            public void describeTo(Description description) {}
        };
        short result = Matchers.shortThat(shortMatcher);
        assertEquals(0, result); // Derived from reportMatcher(matcher).returnZero()
    }

    @Test
    public void testIntThat() throws Exception {
        ArgumentMatcher<Integer> intMatcher = new ArgumentMatcher<Integer>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }
            @Override
            public void describeTo(Description description) {}
        };
        int result = Matchers.intThat(intMatcher);
        assertEquals(0, result); // Derived from reportMatcher(matcher).returnZero()
    }

    @Test
    public void testLongThat() throws Exception {
        ArgumentMatcher<Long> longMatcher = new ArgumentMatcher<Long>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }
            @Override
            public void describeTo(Description description) {}
        };
        long result = Matchers.longThat(longMatcher);
        assertEquals(0L, result); // Derived from reportMatcher(matcher).returnZero()
    }

    @Test
    public void testFloatThat() throws Exception {
        ArgumentMatcher<Float> floatMatcher = new ArgumentMatcher<Float>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }
            @Override
            public void describeTo(Description description) {}
        };
        float result = Matchers.floatThat(floatMatcher);
        assertEquals(0.0f, result, 0.0f); // Derived from reportMatcher(matcher).returnZero()
    }

    @Test
    public void testDoubleThat() throws Exception {
        ArgumentMatcher<Double> doubleMatcher = new ArgumentMatcher<Double>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }
            @Override
            public void describeTo(Description description) {}
        };
        double result = Matchers.doubleThat(doubleMatcher);
        assertEquals(0.0, result, 0.0); // Derived from reportMatcher(matcher).returnZero()
    }
}
