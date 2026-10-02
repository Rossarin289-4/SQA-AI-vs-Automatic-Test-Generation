package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class IteratorUtilsAI25Test {

    @Test
    public void testEmptyIteratorAndIsEmpty() {
        ResettableIterator<String> emptyIt = IteratorUtils.emptyIterator();
        assertFalse(emptyIt.hasNext());
        assertTrue(IteratorUtils.isEmpty(emptyIt));
        assertTrue(IteratorUtils.isEmpty(null));

        ResettableIterator<String> singleIt = IteratorUtils.singletonIterator("item");
        assertFalse(IteratorUtils.isEmpty(singleIt));
        assertTrue(singleIt.hasNext());
    }

    @Test
    public void testSingletonIterator() {
        ResettableIterator<String> it = IteratorUtils.singletonIterator("value");
        assertTrue(it.hasNext());
        assertEquals("value", it.next());
        assertFalse(it.hasNext());

        it.reset();
        assertTrue(it.hasNext());
        assertEquals("value", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testFind() {
        Predicate<String> findB = new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return "b".equals(object);
            }
        };

        List<String> list = Arrays.asList("a", "b", "c");
        assertEquals("b", IteratorUtils.find(list.iterator(), findB));

        List<String> noMatchList = Arrays.asList("x", "y", "z");
        assertNull(IteratorUtils.find(noMatchList.iterator(), findB));
        assertNull(IteratorUtils.find((Iterator<String>) null, findB));
    }

    @Test(expected = NullPointerException.class)
    public void testFindNullPredicate() {
        IteratorUtils.find(Collections.emptyList().iterator(), null);
    }

    @Test
    public void testMatchesAnyAndMatchesAll() {
        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer object) {
                return object != null && object.intValue() % 2 == 0;
            }
        };

        Predicate<Integer> isPositive = new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer object) {
                return object != null && object.intValue() > 0;
            }
        };

        List<Integer> numbers = Arrays.asList(2, 4, 6);
        assertTrue(IteratorUtils.matchesAll(numbers.iterator(), isEven));
        assertTrue(IteratorUtils.matchesAny(numbers.iterator(), isEven));
        assertTrue(IteratorUtils.matchesAll(numbers.iterator(), isPositive));

        List<Integer> mixed = Arrays.asList(1, 2, 3);
        assertFalse(IteratorUtils.matchesAll(mixed.iterator(), isEven));
        assertTrue(IteratorUtils.matchesAny(mixed.iterator(), isEven));

        assertFalse(IteratorUtils.matchesAny(Collections.<Integer>emptyList().iterator(), isEven));
        assertTrue(IteratorUtils.matchesAll(Collections.<Integer>emptyList().iterator(), isEven));

        assertFalse(IteratorUtils.matchesAny((Iterator<Integer>) null, isEven));
        assertTrue(IteratorUtils.matchesAll((Iterator<Integer>) null, isEven));
    }

    @Test
    public void testContains() {
        List<String> list = Arrays.asList("first", "second", "third");
        assertTrue(IteratorUtils.contains(list.iterator(), "second"));
        assertFalse(IteratorUtils.contains(list.iterator(), "fourth"));
        assertFalse(IteratorUtils.contains(null, "first"));
        assertFalse(IteratorUtils.contains(Collections.emptyList().iterator(), "first"));
    }

    @Test
    public void testGet() {
        List<String> list = Arrays.asList("zero", "one", "two");
        assertEquals("zero", IteratorUtils.get(list.iterator(), 0));
        assertEquals("one", IteratorUtils.get(list.iterator(), 1));
        assertEquals("two", IteratorUtils.get(list.iterator(), 2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        List<String> list = Arrays.asList("zero", "one");
        IteratorUtils.get(list.iterator(), 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNegativeIndex() {
        List<String> list = Arrays.asList("zero", "one");
        IteratorUtils.get(list.iterator(), -1);
    }

    @Test
    public void testSize() {
        assertEquals(0, IteratorUtils.size(null));
        assertEquals(0, IteratorUtils.size(Collections.emptyList().iterator()));
        assertEquals(3, IteratorUtils.size(Arrays.asList("a", "b", "c").iterator()));
    }

    @Test
    public void testToString() {
        assertEquals("[]", IteratorUtils.toString((Iterator<String>) null));
        assertEquals("[]", IteratorUtils.toString(Collections.<String>emptyList().iterator()));

        List<String> elements = Arrays.asList("foo", "bar", "baz");
        assertEquals("[foo, bar, baz]", IteratorUtils.toString(elements.iterator()));

        Transformer<Integer, String> transformer = new Transformer<Integer, String>() {
            @Override
            public String transform(Integer input) {
                return "v:" + input;
            }
        };

        List<Integer> ints = Arrays.asList(1, 2, 3);
        String customFormatted = IteratorUtils.toString(ints.iterator(), transformer, ";", "(", ")");
        assertEquals("(v:1;v:2;v:3)", customFormatted);
    }
}
