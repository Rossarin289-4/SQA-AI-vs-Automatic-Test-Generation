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
    public void testDecorateRemovesDuplicatesKeepingFirst() throws Exception {
        List source = new ArrayList();
        source.add("a");
        source.add("b");
        source.add("a");
        SetUniqueList list = SetUniqueList.decorate(source);
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testDecorateNullThrows() throws Exception {
        try {
            SetUniqueList.decorate(null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testAsSetHasSameMembersAndIsUnmodifiable() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        Set view = list.asSet();
        assertEquals(1, view.size());
        assertTrue(view.contains("a"));
        try {
            view.add("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testAddOnlyAddsAbsentElement() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        assertTrue(list.add("a"));
        assertFalse(list.add("a"));
        assertEquals(1, list.size());
    }

    @Test
    public void testIndexedAddUsesInsertionPositionAndIgnoresDuplicate() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add(0, "b");
        list.add(1, "a");
        assertEquals(2, list.size());
        assertEquals("b", list.get(0));
        assertEquals("a", list.get(1));
    }

    @Test
    public void testAddAllFiltersExistingAndRepeatedValues() throws Exception {
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
        assertFalse(list.addAll(values));
    }

    @Test
    public void testIndexedAddAllAdvancesIndexOnlyForInsertedItems() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("c");
        Collection values = new ArrayList();
        values.add("b");
        values.add("a");
        values.add("d");
        assertTrue(list.addAll(1, values));
        assertEquals(4, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("d", list.get(2));
        assertEquals("c", list.get(3));
    }

    @Test
    public void testSetNewValueReplacesAndReturnsOldValue() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        assertEquals("a", list.set(0, "c"));
        assertEquals("c", list.get(0));
        assertFalse(list.contains("a"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void testSetExistingValueRemovesOtherOccurrence() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("a", list.set(0, "c"));
        assertEquals(2, list.size());
        assertEquals("c", list.get(0));
        assertEquals("b", list.get(1));
        assertFalse(list.contains("a"));
    }

    @Test
    public void testRemoveObjectUpdatesListAndMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        assertTrue(list.remove("a"));
        assertFalse(list.remove("a"));
        assertFalse(list.contains("a"));
        assertEquals(1, list.size());
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
        assertFalse(list.contains("c"));
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
        assertEquals("b", list.get(0));
        assertFalse(list.contains("a"));
        assertTrue(list.contains("b"));
    }

    @Test
    public void testClearEmptiesListAndMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
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
        assertFalse(list.contains("missing"));
        assertTrue(list.containsAll(values));
        values.add("missing");
        assertFalse(list.containsAll(values));
    }

    @Test
    public void testIteratorRemoveUpdatesMembership() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        Iterator iterator = list.iterator();
        assertEquals("a", iterator.next());
        iterator.remove();
        assertEquals(1, list.size());
        assertFalse(list.contains("a"));
        assertEquals("b", list.get(0));
    }

    @Test
    public void testListIteratorAddAndRemoveMaintainUniqueness() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        ListIterator iterator = list.listIterator(1);
        iterator.add("c");
        iterator.add("a");
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("c", list.get(1));
        assertEquals("b", list.get(2));
        assertEquals("c", iterator.previous());
        iterator.remove();
        assertFalse(list.contains("c"));
        assertEquals(2, list.size());
    }

    @Test
    public void testListIteratorSetThrows() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        ListIterator iterator = list.listIterator();
        iterator.next();
        try {
            iterator.set("b");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testSubListHasIndependentMembershipTracking() throws Exception {
        SetUniqueList list = SetUniqueList.decorate(new ArrayList());
        list.add("a");
        list.add("b");
        list.add("c");
        List sub = list.subList(1, 3);
        assertEquals(2, sub.size());
        assertEquals("b", sub.get(0));
        assertEquals("c", sub.get(1));
        sub.remove("b");
        assertFalse(sub.contains("b"));
        assertTrue(list.contains("b"));
    }
}
