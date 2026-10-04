package org.mockito.internal.matchers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.hamcrest.Description;
import org.mockito.ArgumentMatcher;
import java.io.Serializable;

public class SameTest {

    // Mock Description implementation for testing describeTo method.
    // This is a simplified version to capture appended text.
    private static class MockDescription implements Description {
        private StringBuilder text = new StringBuilder();

        @Override
        public Description appendText(String text) {
            this.text.append(text);
            return this;
        }

        @Override
        public Description appendValue(Object value) {
            this.text.append(value);
            return this;
        }

        @Override
        public Description appendValueList(String start, String end, String separator, Object... values) {
            this.text.append(start);
            for (int i = 0; i < values.length; i++) {
                if (i > 0) {
                    this.text.append(separator);
                }
                this.text.append(values[i]);
            }
            this.text.append(end);
            return this;
        }

        @Override
        public Description appendList(String start, String end, String separator, Iterable<?> values) {
            this.text.append(start);
            boolean first = true;
            for (Object value : values) {
                if (!first) {
                    this.text.append(separator);
                }
                this.text.append(value);
                first = false;
            }
            this.text.append(end);
            return this;
        }
        
        @Override
        public Description appendDescriptionOf(Object value) {
            if (value instanceof SelfDescribing) {
                ((SelfDescribing) value).describeTo(this);
            } else {
                appendValue(value);
            }
            return this;
        }

        @Override
        public String toString() {
            return text.toString();
        }
    }


    @Test
    public void testMatchesWhenBothNull() throws Exception {
        Same sameMatcher = new Same(null);
        assertTrue(sameMatcher.matches(null));
    }

    @Test
    public void testMatchesWhenWantedIsNotNullAndActualIsNull() throws Exception {
        Same sameMatcher = new Same("someString");
        assertFalse(sameMatcher.matches(null));
    }

    @Test
    public void testMatchesWhenWantedIsNullAndActualIsNotNull() throws Exception {
        Same sameMatcher = new Same(null);
        assertFalse(sameMatcher.matches("someString"));
    }

    @Test
    public void testMatchesWhenSameInstance() throws Exception {
        Object obj = new Object();
        Same sameMatcher = new Same(obj);
        assertTrue(sameMatcher.matches(obj));
    }

    @Test
    public void testMatchesWhenDifferentInstances() throws Exception {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Same sameMatcher = new Same(obj1);
        assertFalse(sameMatcher.matches(obj2));
    }

    @Test
    public void testMatchesWhenWantedIsStringAndActualIsSameStringInstance() throws Exception {
        String str = "testString";
        Same sameMatcher = new Same(str);
        assertTrue(sameMatcher.matches(str));
    }

    @Test
    public void testMatchesWhenWantedIsStringAndActualIsEqualStringButDifferentInstance() throws Exception {
        String str1 = "testString";
        String str2 = new String("testString"); // Creates a new instance with the same content
        Same sameMatcher = new Same(str1);
        assertFalse(sameMatcher.matches(str2));
    }

    @Test
    public void testMatchesWhenWantedIsCharacterAndActualIsSameCharacterInstance() throws Exception {
        Character ch = 'a'; // Autoboxing creates a Character instance
        Same sameMatcher = new Same(ch);
        assertTrue(sameMatcher.matches(ch));
    }

    @Test
    public void testMatchesWhenWantedIsCharacterAndActualIsEqualCharacterButDifferentInstance() throws Exception {
        Character ch1 = 'a';
        // Creating a Character object explicitly to ensure it's a different instance
        Character ch2 = Character.valueOf('a');
        Same sameMatcher = new Same(ch1);
        assertFalse(sameMatcher.matches(ch2));
    }

    @Test
    public void testDescribeToWhenWantedIsNull() throws Exception {
        Same sameMatcher = new Same(null);
        Description description = new MockDescription();
        sameMatcher.describeTo(description);
        assertEquals("same(null)", description.toString());
    }

    @Test
    public void testDescribeToWhenWantedIsString() throws Exception {
        Same sameMatcher = new Same("test");
        Description description = new MockDescription();
        sameMatcher.describeTo(description);
        assertEquals("same(\"test\")", description.toString());
    }

    @Test
    public void testDescribeToWhenWantedIsCharacter() throws Exception {
        Same sameMatcher = new Same('x');
        Description description = new MockDescription();
        sameMatcher.describeTo(description);
        assertEquals("same('x')", description.toString());
    }

    @Test
    public void testDescribeToWhenWantedIsInteger() throws Exception {
        Same sameMatcher = new Same(123);
        Description description = new MockDescription();
        sameMatcher.describeTo(description);
        assertEquals("same(123)", description.toString());
    }

    @Test
    public void testDescribeToWhenWantedIsObjectWithToString() throws Exception {
        Object obj = new Object() {
            @Override
            public String toString() {
                return "MyObject";
            }
        };
        Same sameMatcher = new Same(obj);
        Description description = new MockDescription();
        sameMatcher.describeTo(description);
        assertEquals("same(MyObject)", description.toString());
    }

    @Test
    public void testMatchesWithDifferentTypesButSameIdentity() throws Exception {
        Integer i = Integer.valueOf(5);
        Same sameMatcher = new Same(i);
        assertFalse(sameMatcher.matches(Long.valueOf(5)));
    }

    @Test
    public void testMatchesWithDifferentObjectTypes() throws Exception {
        Object obj1 = new Object();
        Object obj2 = new String("object"); // String is an Object, but a different type/instance
        Same sameMatcher = new Same(obj1);
        assertFalse(sameMatcher.matches(obj2));
    }

    @Test
    public void testDescribeToWithEmptyString() throws Exception {
        Same sameMatcher = new Same("");
        Description description = new MockDescription();
        sameMatcher.describeTo(description);
        assertEquals("same(\"\")", description.toString());
    }

    @Test
    public void testDescribeToWithWhitespaceString() throws Exception {
        Same sameMatcher = new Same(" ");
        Description description = new MockDescription();
        sameMatcher.describeTo(description);
        assertEquals("same(\" \")", description.toString());
    }

    @Test
    public void testMatchesWhenWantedIsBooleanTrueAndActualIsSameBooleanInstance() throws Exception {
        Boolean boolTrue = Boolean.TRUE;
        Same sameMatcher = new Same(boolTrue);
        assertTrue(sameMatcher.matches(boolTrue));
    }

    @Test
    public void testMatchesWhenWantedIsBooleanFalseAndActualIsSameBooleanInstance() throws Exception {
        Boolean boolFalse = Boolean.FALSE;
        Same sameMatcher = new Same(boolFalse);
        assertTrue(sameMatcher.matches(boolFalse));
    }

    @Test
    public void testMatchesWhenWantedIsBooleanTrueAndActualIsDifferentBooleanInstance() throws Exception {
        Boolean boolTrue1 = Boolean.TRUE;
        Boolean boolTrue2 = new Boolean(true); // Deprecated, but creates a distinct instance
        Same sameMatcher = new Same(boolTrue1);
        assertFalse(sameMatcher.matches(boolTrue2));
    }

    @Test
    public void testDescribeToWhenWantedIsBoolean() throws Exception {
        Same sameMatcher = new Same(true);
        Description description = new MockDescription();
        sameMatcher.describeTo(description);
        assertEquals("same(true)", description.toString());
    }

    @Test
    public void testDescribeToWhenWantedIsLong() throws Exception {
        Same sameMatcher = new Same(1234567890123L);
        Description description = new MockDescription();
        sameMatcher.describeTo(description);
        assertEquals("same(1234567890123)", description.toString());
    }
}
