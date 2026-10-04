package org.apache.commons.collections.list;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.collections.iterators.AbstractIteratorDecorator;
import org.apache.commons.collections.iterators.AbstractListIteratorDecorator;
import org.apache.commons.collections.set.UnmodifiableSet;

public class SetUniqueListTest {

    @Test
    public void testDecorateRemovesDuplicatesKeepingFirstOrder() throws Exception {
        List input = new ArrayList();
        input.add("a");
        input.add("b");
        input.add("a");
        SetUniqueList list = SetUniqueList.decorate(input);
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testDecorateRejectsNull() throws Exception {
        try {
            SetUniqueList.decorate(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testAsSetReflectsListAndIsUnmodifiable() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        Set view = list.asSet();
        assertTrue(view.contains("a"));
        try {
            view.add("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertFalse(list.contains("b"));
    }

    @Test
    public void testAddUniqueAndDuplicate() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        assertTrue(list.add("a"));
        assertFalse(list.add("a"));
        assertEquals(1, list.size());
    }

    @Test
    public void testIndexedAddInsertsAtRequestedPositionAndSkipsDuplicate() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("c");
        list.add(1, "b");
        list.add(0, "c");
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testAddAllSkipsExistingAndRepeatedItems() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        Collection values = new ArrayList();
        values.add("b");
        values.add("a");
        values.add("b");
        values.add("c");
        assertTrue(list.addAll(values));
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testAddAllReturnsFalseWhenNothingAdded() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        Collection values = new ArrayList();
        values.add("a");
        assertFalse(list.addAll(values));
        assertEquals(1, list.size());
    }

    @Test
    public void testIndexedAddAllPreservesInputOrderAmongNewElements() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("d");
        Collection values = new ArrayList();
        values.add("b");
        values.add("a");
        values.add("c");
        assertTrue(list.addAll(1, values));
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
        assertEquals("d", list.get(3));
    }

    @Test
    public void testSetReplacesValueAndReturnsOldValue() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        assertEquals("b", list.set(1, "c"));
        assertEquals("c", list.get(1));
        assertFalse(list.contains("b"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void testSetExistingValueRemovesItsOtherOccurrence() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("c", list.set(2, "a"));
        assertEquals(2, list.size());
        assertEquals("b", list.get(0));
        assertEquals("a", list.get(1));
        assertTrue(list.contains("a"));
        assertFalse(list.contains("c"));
    }

    @Test
    public void testRemoveByObjectUpdatesListAndMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        assertTrue(list.remove("a"));
        assertFalse(list.contains("a"));
        assertEquals(1, list.size());
        assertFalse(list.remove("missing"));
    }

    @Test
    public void testRemoveAllUpdatesMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.add("c");
        Collection values = new ArrayList();
        values.add("a");
        values.add("c");
        assertTrue(list.removeAll(values));
        assertEquals(1, list.size());
        assertEquals("b", list.get(0));
        assertFalse(list.contains("a"));
        assertTrue(list.contains("b"));
    }

    @Test
    public void testRetainAllUpdatesMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.add("c");
        Collection values = new ArrayList();
        values.add("b");
        assertTrue(list.retainAll(values));
        assertEquals(1, list.size());
        assertTrue(list.contains("b"));
        assertFalse(list.contains("a"));
    }

    @Test
    public void testClearEmptiesListAndMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.clear();
        assertEquals(0, list.size());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testContainsAndContainsAll() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        Collection values = new ArrayList();
        values.add("a");
        values.add("b");
        assertTrue(list.contains("a"));
        assertFalse(list.contains("c"));
        assertTrue(list.containsAll(values));
        values.add("c");
        assertFalse(list.containsAll(values));
    }

    @Test
    public void testIteratorRemoveUpdatesSet() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        Iterator iterator = list.iterator();
        assertEquals("a", iterator.next());
        iterator.remove();
        assertFalse(list.contains("a"));
        assertEquals(1, list.size());
    }

    @Test
    public void testListIteratorTraversalAndRemove() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        ListIterator iterator = list.listIterator();
        assertEquals("a", iterator.next());
        assertEquals("b", iterator.next());
        assertEquals("b", iterator.previous());
        iterator.remove();
        assertEquals(1, list.size());
        assertFalse(list.contains("b"));
    }

    @Test
    public void testListIteratorAddOnlyAddsUniqueItems() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        ListIterator iterator = list.listIterator();
        iterator.next();
        iterator.add("b");
        iterator.add("a");
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertTrue(list.contains("b"));
    }

    @Test
    public void testListIteratorSetIsUnsupported() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        ListIterator iterator = list.listIterator();
        iterator.next();
        try {
            iterator.set("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        assertEquals("a", list.get(0));
    }

    @Test
    public void testSubListSharesUniquenessWithParent() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.add("c");
        List sub = list.subList(1, 3);
        assertEquals(2, sub.size());
        assertEquals("b", sub.get(0));
        assertEquals("c", sub.get(1));
        sub.remove("b");
        assertFalse(list.contains("b"));
    }

    @Test
    public void testListIteratorAtEndHasNoNextAndPreviousIsLast() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        ListIterator iterator = list.listIterator(list.size());
        assertFalse(iterator.hasNext());
        assertEquals("b", iterator.previous());
    }
}
