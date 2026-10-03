package org.apache.commons.collections.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.collections.Predicate;
import org.junit.Test;

public class EqualPredicateAI17Test {

    @Test
    public void testFactoryWithNonNullObject() {
        String value = "test";
        Predicate<String> predicate = EqualPredicate.equalPredicate(value);
        assertNotNull(predicate);
        assertTrue(predicate instanceof EqualPredicate);
        assertTrue(predicate.evaluate("test"));
        assertFalse(predicate.evaluate("other"));
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testFactoryWithNullObjectReturnsNullPredicate() {
        Predicate<String> predicate = EqualPredicate.equalPredicate(null);
        assertNotNull(predicate);
        assertTrue(predicate instanceof NullPredicate);
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("test"));
    }

    @Test
    public void testFactoryWithEquator() {
        Equator<String> caseInsensitiveEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                if (o1 == null) {
                    return o2 == null;
                }
                return o1.equalsIgnoreCase(o2);
            }

            @Override
            public int hash(String o) {
                return o == null ? 0 : o.toLowerCase().hashCode();
            }
        };

        Predicate<String> predicate = EqualPredicate.equalPredicate("Hello", caseInsensitiveEquator);
        assertNotNull(predicate);
        assertTrue(predicate.evaluate("hello"));
        assertTrue(predicate.evaluate("HELLO"));
        assertFalse(predicate.evaluate("world"));
    }

    @Test
    public void testFactoryWithNullObjectAndEquatorReturnsNullPredicate() {
        Equator<String> dummyEquator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                return true;
            }

            @Override
            public int hash(String o) {
                return 0;
            }
        };

        Predicate<String> predicate = EqualPredicate.equalPredicate(null, dummyEquator);
        assertNotNull(predicate);
        assertTrue(predicate instanceof NullPredicate);
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("notNull"));
    }

    @Test
    public void testConstructorAndGetValue() {
        Integer value = Integer.valueOf(42);
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(value);
        assertSame(value, predicate.getValue());
        assertTrue(predicate.evaluate(Integer.valueOf(42)));
        assertFalse(predicate.evaluate(Integer.valueOf(43)));
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testConstructorWithEquator() {
        Equator<Integer> parityEquator = new Equator<Integer>() {
            @Override
            public boolean equate(Integer o1, Integer o2) {
                return (o1 % 2) == (o2 % 2);
            }

            @Override
            public int hash(Integer o) {
                return o % 2;
            }
        };

        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(Integer.valueOf(2), parityEquator);
        assertEquals(Integer.valueOf(2), predicate.getValue());
        assertTrue(predicate.evaluate(Integer.valueOf(4)));
        assertFalse(predicate.evaluate(Integer.valueOf(3)));
    }

    @Test
    public void testEquatorReceivesStoredValueAsFirstArgument() {
        final Object[] received = new Object[2];
        Equator<String> equator = new Equator<String>() {
            @Override
            public boolean equate(String o1, String o2) {
                received[0] = o1;
                received[1] = o2;
                return true;
            }

            @Override
            public int hash(String o) {
                return 0;
            }
        };

        EqualPredicate<String> predicate = new EqualPredicate<String>("first", equator);
        boolean result = predicate.evaluate("second");
        assertTrue(result);
        assertEquals("first", received[0]);
        assertEquals("second", received[1]);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testSerialization() throws Exception {
        EqualPredicate<String> predicate = new EqualPredicate<String>("serializeTest");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(predicate);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        EqualPredicate<String> deserialized = (EqualPredicate<String>) ois.readObject();
        ois.close();

        assertEquals(predicate.getValue(), deserialized.getValue());
        assertTrue(deserialized.evaluate("serializeTest"));
        assertFalse(deserialized.evaluate("other"));
    }
}
