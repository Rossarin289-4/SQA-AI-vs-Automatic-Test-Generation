package org.apache.commons.collections.set;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections.OrderedIterator;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;
import org.apache.commons.collections.list.UnmodifiableList;

public class ListOrderedSetTest {
    @Test
    public void testFactoryEmptySetAndList() throws Exception {
        ListOrderedSet<String> ordered = ListOrderedSet.listOrderedSet(
                new HashSet<String>(), new ArrayList<String>());
        assertEquals(0, ordered.size());
    }

    @Test
    public void testFactoryRejectsNullSet() throws Exception {
        try {
            ListOrderedSet.listOrderedSet((Set<String>) null, new ArrayList<String>());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFactoryRejectsNullList() throws Exception {
        try {
            ListOrderedSet.listOrderedSet(new HashSet<String>(), (List<String>) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testFactoryRejectsNonemptyInput() throws Exception {
        Set<String> backing = new HashSet<String>();
        backing.add("a");
        try {
            ListOrderedSet.listOrderedSet(backing, new ArrayList<String>());
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAddPreservesFirstInsertionAndRejectsDuplicate() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        assertTrue(ordered.add("a"));
        assertTrue(ordered.add("b"));
        assertFalse(ordered.add("a"));
        assertEquals("[a, b]", ordered.toString());
    }

    @Test
    public void testAddAllAddsOnlyNewElements() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.add("a");
        Collection<String> values = new ArrayList<String>();
        values.add("a");
        values.add("b");
        assertTrue(ordered.addAll(values));
        assertEquals("[a, b]", ordered.toString());
    }

    @Test
    public void testAddAllWithOnlyDuplicatesDoesNotChange() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.add("a");
        assertFalse(ordered.addAll(java.util.Arrays.asList("a")));
        assertEquals("[a]", ordered.toString());
    }

    @Test
    public void testRemoveExistingAndMissingValues() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("a", "b"));
        assertTrue(ordered.remove("a"));
        assertFalse(ordered.remove("x"));
        assertEquals("[b]", ordered.toString());
    }

    @Test
    public void testRemoveAllRemovesMatchingElements() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("a", "b", "c"));
        assertTrue(ordered.removeAll(java.util.Arrays.asList("a", "c")));
        assertEquals("[b]", ordered.toString());
    }

    @Test
    public void testRemoveAllWithoutMatchesDoesNotChange() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.add("a");
        assertFalse(ordered.removeAll(java.util.Arrays.asList("x")));
        assertEquals("[a]", ordered.toString());
    }

    @Test
    public void testRetainAllKeepsMatchingElementsInOrder() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("a", "b", "c"));
        assertTrue(ordered.retainAll(java.util.Arrays.asList("c", "a")));
        assertEquals("[a, c]", ordered.toString());
    }

    @Test
    public void testRetainAllNoChangeReturnsFalse() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("a", "b"));
        assertFalse(ordered.retainAll(java.util.Arrays.asList("b", "a", "x")));
        assertEquals("[a, b]", ordered.toString());
    }

    @Test
    public void testRetainAllEmptyInputClearsSet() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("a", "b"));
        assertTrue(ordered.retainAll(new ArrayList<String>()));
        assertEquals(0, ordered.size());
    }

    @Test
    public void testClearEmptiesOrderedSet() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("a", "b"));
        ordered.clear();
        assertEquals("[]", ordered.toString());
        assertEquals(0, ordered.size());
    }

    @Test
    public void testIteratorForwardAndBackwardAtBoundaries() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("a", "b"));
        OrderedIterator<String> it = ordered.iterator();
        assertFalse(it.hasPrevious());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertTrue(it.hasPrevious());
        assertEquals("b", it.previous());
    }

    @Test
    public void testIteratorRemoveUpdatesSetAndOrder() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("a", "b"));
        Iterator<String> it = ordered.iterator();
        assertEquals("a", it.next());
        it.remove();
        assertEquals("[b]", ordered.toString());
        assertFalse(ordered.contains("a"));
    }

    @Test
    public void testAsListReflectsOrderAndIsUnmodifiable() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("a", "b"));
        List<String> view = ordered.asList();
        assertEquals(java.util.Arrays.asList("a", "b"), view);
        try {
            view.add("c");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testToArrayReturnsInsertionOrder() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("b", "a"));
        assertArrayEquals(new Object[] {"b", "a"}, ordered.toArray());
    }

    @Test
    public void testGetAndIndexOfAtFirstAndLastPositions() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("a", "b"));
        assertEquals("a", ordered.get(0));
        assertEquals("b", ordered.get(1));
        assertEquals(0, ordered.indexOf("a"));
        assertEquals(1, ordered.indexOf("b"));
        assertEquals(-1, ordered.indexOf("x"));
    }

    @Test
    public void testToStringUsesInsertionOrder() throws Exception {
        ListOrderedSet<String> ordered = new ListOrderedSet<String>();
        ordered.addAll(java.util.Arrays.asList("c", "a", "b"));
        assertEquals("[c, a, b]", ordered.toString());
    }
}
